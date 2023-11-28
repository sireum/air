// #Sireum
package org.sireum.hamr.ir.instantiation

import org.sireum._
import org.sireum.hamr.ir
import org.sireum.hamr.ir.JSON
import org.sireum.message.Reporter

object ConnectionInstantiation extends App {

  val paths: ISZ[String] = ISZ()

  override def main(args: ISZ[String]): Z = {
    val reporter = Reporter.create

    for (p <- args) {
      val path = Os.path(p)
      if (!path.exists || !path.isFile) {
        reporter.error(None(), ConnectionInfo.toolName, s"Not a valid file: $path")
      }
      JSON.toAadl(path.read) match {
        case Either.Left(model) =>

          val tmodel = instantiate(model, reporter)

          if (!reporter.hasError) {
            val o = ops.StringOps(path.name)
            val dstName = s"${o.substring(0, o.indexOf('.'))}.${path.ext}"
            val dst: Os.Path = path.up / dstName
            dst.writeOver(JSON.fromAadl(tmodel, F))
            println(s"Wrote: $dst")
          }
        case Either.Right(r) =>
          reporter.error(None(), ConnectionInfo.toolName, r.message)
      }
    }

    return if (reporter.hasError) 1 else 0
  }

  def instantiate(model: ir.Aadl, reporter: Reporter): ir.Aadl = {
    return ConnectionInfo.instantiateConnections(model, reporter)
  }
}
