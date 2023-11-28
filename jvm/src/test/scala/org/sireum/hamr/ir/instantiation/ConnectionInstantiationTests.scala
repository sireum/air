package org.sireum.hamr.ir.instantiation

import org.sireum._
import org.sireum.hamr.ir
import org.sireum.message.Reporter

class ConnectionInstantiationTests extends org.sireum.test.TestSuite {
  val rootDir: Os.Path = Os.path(implicitly[sourcecode.File].value).up.up.up.up.up.up.up

  val modelsDir: Os.Path = rootDir / "resources" / "models"

  val resultDir = rootDir / "results"

  case class TestHolder(json: Os.Path,
                        png: Os.Path,
                        testCaseName: String)

  def genTestHolder(slangFile: Os.Path): Option[TestHolder] = {
    val simpleName = ops.StringOps(slangFile.name).replaceAllLiterally(".json", "")
    val png = slangFile.up.up / "diagrams" / s"${simpleName}.png"
    if (slangFile.ext == string"json" && png.exists) {
      return Some(TestHolder(slangFile, png, simpleName))
    }
    return None()
  }
  "Ex1" in {
    val h = genTestHolder(modelsDir / "example-aadl-models" / "aadl" / ".slang" / "Ex1_s_i_Instance.json")
    test(h.get)
  }

  "Ex2" in {
    val h = genTestHolder(modelsDir / "example-aadl-models" / "aadl" / ".slang" / "Ex2_wrapper_i_Instance.json")
    test(h.get)
  }

  "Ex3" in {
    val h = genTestHolder(modelsDir / "example-aadl-models" / "aadl" / ".slang" / "Ex3_wrapper_i_Instance.json")
    test(h.get)
  }

  def test(testHolder: TestHolder) : Unit = {
    ir.JSON.toAadl(testHolder.json.read) match {
      case Either.Left(origModel) =>
        val dstDir = resultDir / testHolder.testCaseName
        dstDir.removeAll()
        println(s"Result Dir: ${dstDir.toUri}")

        val x = ir.Transformer(Util.RemoveConnectionInstances()).transformAadl(ISZ(), origModel)

        val reporter = Reporter.create
        reporter.setMessages(x.ctx)

        val noConnectionInstances =  x.resultOpt.get

        val transModel = ConnectionInfo.instantiateConnections(noConnectionInstances, reporter)

        // build symbol tables for the original and transformed models
        val stOrig = Util.SymbolResolver().process(origModel.components(0), reporter)
        val stTrans = Util.SymbolResolver().process(transModel.components(0), reporter)

        val same: B = compare(stOrig, stTrans)

        if (!reporter.hasError) {
          val original = dstDir / testHolder.json.name
          val noConnInsts = dstDir / s"${testHolder.testCaseName}_no_CI.json"
          val transformed = dstDir / s"${testHolder.testCaseName}_transformed.json"
          val png = dstDir / s"p_${testHolder.png.name}"

          testHolder.json.copyOverTo(original)
          noConnInsts.writeOver(ir.JSON.fromAadl(noConnectionInstances, F))
          transformed.writeOver(ir.JSON.fromAadl(transModel, F))
          testHolder.png.copyOverTo(png)
        }
        reporter.printMessages()
        assert(same && !reporter.hasError)
      case Either.Right(m) => assert(F, m)
    }
  }

  def compare(stOrig: Util.SymbolTable, stTrans: Util.SymbolTable): B = {
    var ok = T
    for(origComponent <- stOrig.componentMap.values) {
      val transComponent = stTrans.componentMap.get(origComponent.identifier.name).get

      def same(a: ISZ[ir.ConnectionInstance], b: ISZ[ir.ConnectionInstance], name: String): B = {
        var ret = T
        for (aci <- a) {
          val bcis = b.filter(bci => bci.src == aci.src && bci.dst == aci.dst)
          if (bcis.size != 1) {
            cprintln(T,s"  $name has ${bcis.size} entries for ${aci}")
            ret = F
          }
        }
        return ret
      }
      // each component should have exactly the same connection instances (order is not important)
      ok = ok & same(origComponent.connectionInstances, transComponent.connectionInstances, "Transformed")
      ok = ok & same(transComponent.connectionInstances, origComponent.connectionInstances, "Original")
    }
    return ok
  }


  val tests: ISZ[TestHolder] = {
    val p: Os.Path = Os.path(implicitly[sourcecode.File].value).up.up.up.up.up.up.up / "models"
    var projects: ISZ[TestHolder] = ISZ()
    Os.Path.walk(p, T, F, pred => {
      val th = genTestHolder(pred)
      if (th.nonEmpty) {
        projects = projects :+ th.get
      }
      F
    })
    println(projects)
    projects
  }

  for (testHolder <- tests) {
    // uncomment the following to run the dynamic test cases
    /*
    registerTest(testHolder.testCaseName.native) {
      test(testHolder)
    }
    */
  }
}
