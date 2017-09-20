package org.sireum.aadl.ast

import java.io.File

import com.sksamuel.diffpatch.DiffMatchPatch
import org.scalatest.FreeSpec
import org.sireum.{ISZ, None => SNone}
import org.sireum.lang.tools.JsonGenJvm
import org.sireum.lang.util.{AccumulatingReporter, FileUtil}

class JsonGen extends FreeSpec {
  val regen = false

  "JsonGen" - {
    "test gen" in {
      val rootDir: File = new File(getClass.getResource(".").getPath, "../../../../../../../../").getCanonicalFile

      val aadlPackagePath = new File(rootDir, "slang/src/main/scala/org/sireum/aadl")

      val src = new File(aadlPackagePath, "ast/AadlAST.scala")
      val dest = new File(aadlPackagePath, "ast/AadlJSON.scala")

      val reporter = AccumulatingReporter.create
      val rOpt = JsonGenJvm(allowSireumPackage = true,
        None, src, dest, SNone(), reporter)

      reporter.printMessages()

      rOpt match {
        case Some(r) =>
          val expected = FileUtil.readFile(dest)
          val result = r
          if (result != expected) {
            val dmp = new DiffMatchPatch()
            Console.err.println(dmp.patch_toText(dmp.patch_make(expected, result)))
            Console.err.flush()

            if(regen) {
              FileUtil.writeFile(dest, r)
              Console.out.println("Wrote " + dest)
            }

            //Console.err.println(r)
            //Console.err.flush()
            assert(false)
          } else assert(!reporter.hasIssue)
        case _ => assert(false)
      }
    }
  }
}