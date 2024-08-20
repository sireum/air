// #Sireum
package org.sireum.hamr.ir.instantiation

import org.sireum._
import org.sireum.hamr.ir
import org.sireum.hamr.ir.instantiation.ConnectionInstantiator.{ConnectionSegments, toolName}
import org.sireum.hamr.ir.{Component, Feature, FeatureCategory, Transformer}
import org.sireum.message.{Level, Message, Reporter}

object Util {
  @pure def isAadlPort(o: Feature): B = {
    val ret: B = o.category match {
      case FeatureCategory.DataPort => T
      case FeatureCategory.EventPort => T
      case FeatureCategory.EventDataPort => T
      case _ => F
    }
    return ret
  }

  def getParent(component: ir.Component,
                symbolTable: Util.SymbolTable): Option[ir.Component] = {
    val ret: Option[ir.Component]= {
      symbolTable.parentMap.get(component.identifier.name) match {
        case Some(parent) => symbolTable.componentMap.get(parent)
        case _ => None()
      }
    }
      return ret
  }

  def getDirection(feature: ir.Feature): ir.Direction.Type = {
    val fe = feature.asInstanceOf[ir.FeatureEnd]
    return fe.direction
  }

  def isSubcomponent(a: Component, b: Component): B = {
    return !a.subComponents.filter(p => p.identifier.name == b.identifier.name).isEmpty
  }


  def getSrcFeature(conn: ir.Connection): ISZ[String] = {
    return conn.src(0).feature.get.name
  }

  def getDstFeature(conn: ir.Connection): ISZ[String] = {
    return conn.dst(0).feature.get.name
  }

  @datatype class SymbolTable(componentMap: Map[ISZ[String], ir.Component],
                              parentMap: Map[ISZ[String], ISZ[String]],
                              featureMap: Map[ISZ[String], ir.Feature])

  @record class SymbolResolver {

    var componentMap: Map[ISZ[String], ir.Component] = Map.empty
    var parentMap: Map[ISZ[String], ISZ[String]] = Map.empty
    var featureMap: Map[ISZ[String], ir.Feature] = Map.empty

    val reporter: Reporter = Reporter.create

    def getParent(c: Component): Option[Component] = {
     val ret : Option[ir.Component]= parentMap.get(c.identifier.name) match {
        case Some(parentName) => componentMap.get(parentName)
        case _ => None()
      }
      return ret
    }

    def process (o: ir.Component, reporter: Reporter): SymbolTable = {
      processH(o, ISZ(), reporter)
      return SymbolTable(
        componentMap = componentMap,
        parentMap = parentMap,
        featureMap = featureMap)
    }

    def processH (o: ir.Component, parent: ISZ[String], reporter: Reporter): Unit = {
      o.category match {
        case ir.ComponentCategory.System =>
        case ir.ComponentCategory.Process =>
        case ir.ComponentCategory.Processor =>
        case ir.ComponentCategory.Thread =>
        case ir.ComponentCategory.Abstract =>
        case _ =>
          reporter.error(o.identifier.pos, toolName, s"Sireum's SysMLv2 profile does not currently support ${o.category}")
      }
      componentMap = componentMap + o.identifier.name ~> o

      // TODO FYTD in the future if the feature is a data port or event data port then
      //      it has to be a FeatureEnd whose classifier field is
      //      non-empty.  The classifier indicates the type of data that
      //      will flow through the port

      for (feature <- o.features) {
        feature.category match {
          case ir.FeatureCategory.EventPort =>
          case ir.FeatureCategory.DataPort =>
          case ir.FeatureCategory.EventDataPort =>
          case _ =>
            reporter.error(o.identifier.pos, toolName, s"Sireum's SysMLv2 profile does not currently support ${feature.category}")
        }
        feature match {
          case featureEnd: ir.FeatureEnd =>
            featureEnd.direction match {
              case ir.Direction.In =>
              case ir.Direction.Out =>
              case ir.Direction.InOut =>
              case _ => reporter.error(o.identifier.pos, toolName, s"Sireum's SysMLv2 profile does not currently support ${featureEnd.direction}")
            }
          case _ =>
            reporter.error(o.identifier.pos, toolName, s"Sireum's SysMLv2 profile does not currently support ${feature}")
        }
        featureMap = featureMap + feature.identifier.name ~> feature
      }

      if(parent.nonEmpty) {
        val comp = o.identifier.name
        parentMap = parentMap + comp ~> parent
      }

      for(subComponent <- o.subComponents) {
        o.category match {
          case ir.ComponentCategory.System =>
            subComponent.category match {
              case ir.ComponentCategory.System =>
              case ir.ComponentCategory.Process =>
              case ir.ComponentCategory.Processor =>
              case ir.ComponentCategory.Abstract =>
              case _ => reporter.error(o.identifier.pos, toolName, s"AADL System's cannot contain ${subComponent.category}")
            }
          case ir.ComponentCategory.Process =>
            subComponent.category match {
              case ir.ComponentCategory.Thread =>
              case _ => reporter.error(o.identifier.pos, toolName, s"AADL Processes cannot contain ${subComponent.category}")
            }
          case ir.ComponentCategory.Thread =>
            subComponent.category match {
              case _ => reporter.error(o.identifier.pos, toolName, s"AADL Threads cannot contain ${subComponent.category}")
            }
          case _ =>
        }
        processH(subComponent, o.identifier.name, reporter)
      }

      for (connection <- o.connections) {
        if (connection.src.size != 1) {
          reporter.error(connection.name.pos, toolName, s"Expecting a single source entrypoint but found ${connection.src.size}")
        }
        if (connection.dst.size != 1) {
          reporter.error(connection.name.pos, toolName, s"Expecting a single destination entrypoint but found ${connection.dst.size}")
        }
        if(connection.kind != ir.ConnectionKind.Port) {
          reporter.error(connection.name.pos, toolName, s"Sireum's SysMLv2 profile does not currently support ${connection.kind} connections")
        }
        if (connection.isBiDirectional) {
          reporter.error(connection.name.pos, toolName, s"Sireum's SysMLv2 profile does not support bidirectional connections")
        }
        if (connection.src(0).direction.get == ir.Direction.In && connection.dst(0).direction.get == ir.Direction.Out) {
          reporter.error(connection.name.pos, toolName, s"Sireum's SysMLv2 profile does not currently support In to Out Connections")
        }
      }
    }
  }

  @datatype class RemoveConnectionInstances extends ir.Transformer.PrePost[ISZ[Message]] {
    // helper transformer that removes existing connection instances as created by OSATE.
    // The test cases make sure our connection instantiation recreates those
    override def preComponent(ctx: ISZ[Message], o: Component): Transformer.PreResult[ISZ[Message], Component] = {
      var uniqueConnections: ISZ[ir.Connection] = ISZ()
      var msgs = ISZ[Message]()
      for(c <- o.connections) {
        val filtered = ops.ISZOps(uniqueConnections).filter(p => p.name.name == c.name.name)
        if (filtered.isEmpty) {
          uniqueConnections = uniqueConnections :+ c
        } else {
          // TODO: ir.Connections come from the AADL declarative model and were added to allow
          //       AWAS to determine the declarative connection segments that were used by
          //       OSATE to create connection instances. Fan-ins/Fan-outs appear to cause
          //       declarative connections to be added 2+ times for a component where the only
          //       difference is between the uriFrag fields.  Need to determine how
          //       AWAS uses that field in order to determine if we need to replicate these
          //       duplications for sysmlv2 based instantiation.
          val cf = filtered(0)

          assert(cf.name == c.name)
          assert(cf.dst == c.dst)
          assert(cf.src == c.src)
          assert(cf.kind == c.kind)
          assert(cf.connectionInstances == c.connectionInstances)
          assert(cf.isBiDirectional == c.isBiDirectional)
          assert(cf.properties == c.properties)
          assert(cf.uriFrag != c.uriFrag)

          msgs = msgs :+ Message(Level.Warning, c.name.pos, toolName, s"Found duplicate ir.Connections named: ${c.name.name}")
        }
      }
      return Transformer.PreResult(
        ctx ++ msgs, T, Some(
          o(
            connections = uniqueConnections,
            connectionInstances = ISZ())))
    }
  }

  type addConnsContext = (ISZ[ConnectionSegments], Set[ISZ[String]], ISZ[Message])

  @datatype class AddConnectionInstances extends ir.Transformer.PrePost[addConnsContext] {
    override def preComponent(ctx: addConnsContext, o: ir.Component): ir.Transformer.PreResult[addConnsContext, Component] = {
      val componentsSegments = ctx._1.filter(p => p.root.identifier.name == o.identifier.name) // conn instances rooted at o
      var connInsts = ISZ[ir.ConnectionInstance]()
      var messages = ISZ[Message]()
      for (seg <- componentsSegments) {
        val src = seg.segments(0)._1.src(0)
        val dst = seg.segments(seg.segments.size - 1)._1.dst(0)

        // only include seg if its src feature is never used in
        // a continuation
        if (!ctx._2.contains(src.feature.get.name)) {

          val connRefs: ISZ[ir.ConnectionReference] = for (c <- seg.segments) yield
            ir.ConnectionReference(
              name = c._2,
              context = c._2,
              isParent = c._2.name == o.identifier.name
            )

          val name = st"${(src.feature.get.name, ".")} -> ${(dst.feature.get.name, ".")}".render
          connInsts = connInsts :+
            ir.ConnectionInstance(
              name = ir.Name(ISZ[String](name), None()),
              src = src,
              dst = dst,
              kind = ir.ConnectionKind.Port,
              connectionRefs = connRefs,
              properties = ISZ())

          messages = messages :+ Message(level = Level.Info, posOpt = o.identifier.pos, kind = ConnectionInstantiator.toolName,
            text = s"Connected: $name")
        }
      }

      return Transformer.PreResult((ctx._1, ctx._2, ctx._3 ++ messages), T, Some(o(connectionInstances = connInsts)))
    }
  }
}
