/*
 Copyright (c) 2017-2021, Robby, Kansas State University
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions are met:

 1. Redistributions of source code must retain the above copyright notice, this
    list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright notice,
    this list of conditions and the following disclaimer in the documentation
    and/or other materials provided with the distribution.

 THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

import $file.runtime.Runtime
import $file.Air
import ammonite.ops._

object runtime extends mill.Module {

  object macros extends Runtime.Module.Macros

  object test extends Runtime.Module.Test {
    final override def macrosObject = macros
  }

  object library extends Runtime.Module.Library {
    final override def macrosObject = macros
    final override def testObject = test
  }

}


object air extends Air.Module {

  final override def millSourcePath = super.millSourcePath / up

  final override def libraryObject = runtime.library
  
  final override def testObject = runtime.test
}

def regen() = T.command {
  val path = pwd / 'shared / 'src / 'main / 'scala / 'org / 'sireum / 'hamr / 'ir
  %(pwd / 'sireum, 'tools, 'transgen, "-l", pwd / "license.txt", "-m", "immutable,mutable",
    path / "AadlAST.scala")(path)
  %(pwd / 'sireum, 'tools, 'sergen, "-p", "org.sireum.hamr.ir", "-l", pwd / "license.txt",
    "-m", "json,msgpack", path / "AAdlAST.scala")(path)
}

def jitPack(owner: String, repo: String, lib: String = "") = T.command {
  org.sireum.mill.SireumModule.jitPack(owner, repo, if ("" == lib) repo else lib)
}
