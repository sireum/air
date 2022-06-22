// #Sireum
/*
 Copyright (c) 2017-2022, Kansas State University
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
package org.sireum.hamr.ir

import org.sireum._
import org.sireum.message.Position

@sig trait GclAnnex extends AnnexClause

@datatype class GclSubclause(val state: ISZ[GclStateVar],
                             val invariants: ISZ[GclInvariant],
                             val initializes: Option[GclInitialize],
                             val integration: Option[GclIntegration],
                             val compute: Option[GclCompute]) extends GclAnnex

@datatype class GclStateVar(val name: String,
                            val classifier: String,
                            val posOpt: Option[Position])

@sig trait GclSpec {
  def id: String
  def descriptor: Option[String]
  def exp: org.sireum.lang.ast.Exp
  def posOpt: Option[Position]
}

@datatype class GclInvariant(val id: String,
                             val descriptor: Option[String],
                             val exp: org.sireum.lang.ast.Exp,
                             val posOpt: Option[Position]) extends GclSpec

@sig trait GclComputeSpec extends GclSpec

@datatype class GclAssume(val id: String,
                          val descriptor: Option[String],
                          val exp: org.sireum.lang.ast.Exp,
                          val posOpt: Option[Position]) extends GclComputeSpec

@datatype class GclGuarantee(val id: String,
                             val descriptor: Option[String],
                             val exp: org.sireum.lang.ast.Exp,
                             val posOpt: Option[Position]) extends GclComputeSpec

@datatype class GclIntegration(val specs: ISZ[GclSpec])

@datatype class GclCaseStatement(val id: String,
                                 val descriptor: Option[String],
                                 val assumes: org.sireum.lang.ast.Exp,
                                 val guarantees: org.sireum.lang.ast.Exp,
                                 val posOpt: Option[Position])

@datatype class GclInitialize(val modifies: ISZ[org.sireum.lang.ast.Exp],
                              val guarantees: ISZ[GclGuarantee])

@datatype class GclCompute(val modifies: ISZ[org.sireum.lang.ast.Exp],
                           val specs: ISZ[GclComputeSpec],
                           val cases: ISZ[GclCaseStatement],
                           val handlers: ISZ[GclHandle])

@datatype class GclHandle(val port: org.sireum.lang.ast.Exp,
                          val modifies: ISZ[org.sireum.lang.ast.Exp],
                          val guarantees: ISZ[GclGuarantee])

@datatype class GclTODO