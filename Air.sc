/*
 Copyright (c) 2017-2024, Robby, Kansas State University
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

import mill._
import mill.scalalib._
import org.sireum.mill.SireumModule._

trait Module extends CrossJvmJsJitPack {

  final override def description: String = "Sireum HAMR AADL Intermediate Representation (AIR)"

  final override def artifactName = "hamr-air"

  final override def subUrl: String = "air"

  final override def developers = Seq(
    Developers.jason,
    Developers.hari
  )

  final override def jvmTestIvyDeps = Agg.empty

  final override def jsTestIvyDeps = Agg.empty

  final override def jvmDeps = Seq()

  final override def jsDeps = Seq()

  final override def ivyDeps =
    if (isSourceDep) Agg.empty
    else Agg(
      jpLatest(isCross = true, "sireum", "runtime", "library"),
      jpLatest(isCross = true, "sireum", "slang", "frontend"))

  final override def testIvyDeps =
    if (isSourceDep) Agg.empty
    else Agg(jpLatest(isCross = true, "sireum", "runtime", "test"))

  final override lazy val scalacPluginIvyDeps = Agg(
    ivy"org.sireum::scalac-plugin:$scalacPluginVersion"
  )

  final override def testScalacPluginIvyDeps = scalacPluginIvyDeps

  final override def deps =
    if (isSourceDep) Seq(libraryObject, slangTipeObject) else Seq()

  final override def testDeps =
    if (isSourceDep) Seq(testObject.shared) else Seq()

  final override val jvmTestFrameworks = Seq("org.scalatest.tools.Framework")

  final override def jsTestFrameworks = jvmTestFrameworks

  def testObject: CrossJvmJsPublish

  def libraryObject: CrossJvmJsPublish

  def slangTipeObject: CrossJvmJsPublish
}
