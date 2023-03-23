// #Sireum
/*
 Copyright (c) 2017-2023, Kansas State University
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

@sig trait GclSymbol

@datatype class GclSubclause(val state: ISZ[GclStateVar],
                             val methods: ISZ[GclMethod],
                             val invariants: ISZ[GclInvariant],
                             val initializes: Option[GclInitialize],
                             val integration: Option[GclIntegration],
                             val compute: Option[GclCompute]) extends AnnexClause with GclSymbol

@datatype class GclMethod(val method: org.sireum.lang.ast.Stmt.Method) extends GclSymbol

@datatype class GclStateVar(val name: String,
                            val classifier: String,
                            val posOpt: Option[Position]) extends GclSymbol

@sig trait GclClause extends GclSymbol {
  def id: String

  def descriptor: Option[String]

  def posOpt: Option[Position]
}

@sig trait GclSpec extends GclClause {

  def exp: org.sireum.lang.ast.Exp

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

@datatype class GclIntegration(val specs: ISZ[GclSpec]) extends GclSymbol

@datatype class GclCaseStatement(val id: String,
                                 val descriptor: Option[String],
                                 val assumes: org.sireum.lang.ast.Exp,
                                 val guarantees: org.sireum.lang.ast.Exp,
                                 val posOpt: Option[Position]) extends GclSymbol

@datatype class GclInitialize(val modifies: ISZ[org.sireum.lang.ast.Exp],
                              val guarantees: ISZ[GclGuarantee],
                              val flows: ISZ[InfoFlowClause]) extends GclSymbol

@datatype class GclCompute(val modifies: ISZ[org.sireum.lang.ast.Exp],
                           val specs: ISZ[GclComputeSpec],
                           val cases: ISZ[GclCaseStatement],
                           val handlers: ISZ[GclHandle],
                           val flows: ISZ[InfoFlowClause]) extends GclSymbol

@datatype class GclHandle(val port: org.sireum.lang.ast.Exp,
                          val modifies: ISZ[org.sireum.lang.ast.Exp],
                          val guarantees: ISZ[GclGuarantee]) extends GclSymbol

@datatype class GclTODO extends GclSymbol

@datatype class GclLib(val containingPackage: Name,
                       val methods: ISZ[GclMethod]) extends AnnexLib with GclSymbol

@datatype class InfoFlowClause(val id: String,
                               val descriptor: Option[String],
                               val from: ISZ[org.sireum.lang.ast.Exp],
                               val to: ISZ[org.sireum.lang.ast.Exp],
                               val posOpt: Option[Position]) extends GclClause
