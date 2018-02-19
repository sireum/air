package org.sireum.aadl.ast

import java.io.File

import com.sksamuel.diffpatch.DiffMatchPatch
import org.scalatest.FreeSpec
import org.sireum.lang.tools._
import org.sireum.F
import org.sireum.message._
import org.sireum.util.FileUtil
import org.sireum.{None => SNone}

class JsonGen extends FreeSpec {
  val regen = true

  "JsonGen" - {
    "test gen" in {
      val rootDir: File = new File(getClass.getResource(".").getPath, "../../../../../../../../").getCanonicalFile

      val aadlPackagePath = new File(rootDir, "jvm/src/main/scala/org/sireum/aadl/skema")
      val src = new File(aadlPackagePath, "ast/AadlAST.scala")
      val dest = new File(aadlPackagePath, "ast/AadlJSON.scala")

      val reporter = Reporter.create
      val rOpt =
        SerializerGenJvm(allowSireumPackage = true, SerializerGen.Mode.JSON, None, src, dest, SNone(), reporter)

      reporter.printMessages()

      rOpt match {
        case org.sireum.Some(r) =>
          val expected = FileUtil.readFile(dest)
          val result = r
          if (result != expected) {
            val dmp = new DiffMatchPatch()
            Console.err.println(dmp.patch_toText(dmp.patch_make(expected, result)))
            Console.err.flush()

            if (regen) {
              FileUtil.writeFile(dest, r)
              Console.out.println("Wrote " + dest)
            }

            //Console.err.println(r)
            //Console.err.flush()
            assert(F)
          } else assert(!reporter.hasIssue)
        case _ => assert(F)
      }
    }
  }
}
