// #Sireum

package org.sireum.hamr.ir.instantiation

import org.sireum._
import org.sireum.hamr.ir
import org.sireum.message.Reporter

/** ConnectionInfo partially recreates the connection instantiations performed by
  * org.osate.aadl2.instantiation.ConnectionInfo. Its currently designed to handle the simple
  * sysmlv2 models that use our AADL profile (e.g. feature groups are not currently
  * profiled/supported).
  */
object ConnectionInstantiator {
  val toolName: String = "Connection Instantiator"

  def instantiateConnections(model: ir.Aadl, reporter: Reporter): ir.Aadl = {

    assert(model.components.size == 1, s"Expecting a single top level component but received ${model.components.size}")

    val symbolTable = Util.SymbolResolver().process(model.components(0), reporter)

    if (reporter.hasError) {
      return model
    }

    var segments: ISZ[ConnectionSegments] = ISZ()
    for (component <- symbolTable.componentMap.values) {
      assert (component.connectionInstances.isEmpty, s"Not expected ${component.identifier} to have connections instance, but it has ${component.connectionInstances.size}")
      segments = segments ++ buildSegments(component, ConnectionSegments(component, ISZ(), ISZ()), symbolTable, reporter)
    }

    // combine the connectedInPorts into a single collection
    var connectedInPorts: Set[ISZ[String]] = Set.empty
    for (seg <- segments) {
      connectedInPorts = connectedInPorts ++ seg.connectedInPorts
    }

    val transformed = ir.Transformer(Util.AddConnectionInstances()).transformAadl((segments, connectedInPorts, ISZ()), model)

    reporter.reports(transformed.ctx._3)

    return transformed.resultOpt.get
  }

  @datatype class ConnectionSegments(val root: ir.Component,
                                     val connectedInPorts: ISZ[ISZ[String]],
                                     val segments: ISZ[(ir.Connection, ir.Name)])

  def buildSegments(component: ir.Component, connSegs: ConnectionSegments, symbolTable: Util.SymbolTable, reporter: Reporter): ISZ[ConnectionSegments] = {
    val parent: Option[ir.Component] = Util.getParent(component, symbolTable)
    var ret: ISZ[ConnectionSegments] = ISZ()

    for (conn <- component.connections) {
      val srcFeatureName = Util.getSrcFeature(conn)
      val srcDir = Util.getDirection(symbolTable.featureMap.get(conn.src(0).feature.get.name).get)

      val updatedConSegs: ConnectionSegments = {
        connSegs(
          // continue updating root until the src feature direction changes to In
          root = if (srcDir == ir.Direction.Out) component else connSegs.root,
          connectedInPorts =
            if (connSegs.segments.nonEmpty && Util.getDstFeature(ops.ISZOps(connSegs.segments).last._1) == srcFeatureName)
              connSegs.connectedInPorts :+ srcFeatureName // this is a continuation so add src feature
            else connSegs.connectedInPorts,
          segments = (connSegs.segments :+ (conn, component.identifier))
        )
      }

      if (connSegs.segments.nonEmpty &&
        Util.getDstFeature(ops.ISZOps(connSegs.segments).last._1) != srcFeatureName) {
        // this is not a continuation of the previous segment so ignore it
      }
      else {
        val dstName = conn.dst(0).component.name
        val dstComponent = symbolTable.componentMap.get(dstName).get

        if (component == dstComponent) {
          // the dst side's component is the same as what was passed in
          if (parent.isEmpty) {
            // there's no parent so this is the end of the trail for this conn seg
            ret = ret :+ updatedConSegs
          }
          else {
            // need to recurse into parent to see what connections it contains
            val continuations = buildSegments(parent.get, updatedConSegs, symbolTable, reporter)
            if (continuations.isEmpty) {
              // probably won't happen given that we've restricted ourselves to just systems, processes, and threads
              reporter.error(conn.name.pos, ConnectionInstantiator.toolName, "Invalid connection")
            }
            ret = ret ++ continuations
          }
        } else {
          // do a recursive call to see if the dst component continues the connection
          val continuations = buildSegments(dstComponent, updatedConSegs, symbolTable, reporter)

          if (continuations.isEmpty) {
            // recursive call didn't find a continuation of conn so this is the end of the trail
            ret = ret :+ updatedConSegs
          } else {
            ret = ret ++ continuations
          }
        }
      }
    }
    return ret
  }
}
