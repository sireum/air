// #Sireum
/*
 Copyright (c) 2017-2021, Kansas State University
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

@datatype class GclSubclause(state: ISZ[GclStateVar],
                             invariants: ISZ[GclInvariant],
                             initializes: ISZ[GclGuarantee],
                             integration: Option[GclIntegration],
                             compute: Option[GclCompute]) extends GclAnnex

@datatype class GclStateVar(name: String,
                            exp: GclExp)

@datatype class GclInvariant(name: String,
                             exp: GclExp)

@datatype class GclGuarantee(name: String,
                             exp: GclExp)

@datatype class GclIntegration()

@datatype class GclCompute()

@sig trait GclExp {
  @pure def pos: Option[Position]
}

@enum object GclUnaryOp {
  "Abs"
  "Neg"
  "Not"
}

@enum object GclBinaryOp {
  "And"
  "AndThen"
  "Or"
  "OrElse"
  "Xor"

  "Implies"
  "Equiv"

  "Eq"
  "Neq"
  "Lt"
  "Lte"
  "Gt"
  "Gte"

  "Plus"
  "Minus"
  "Div"
  "Mult"
  "Mod"
  "Rem"
  "Exp"
}

@enum object GclLiteralType {
  "Boolean"
  "String"
  "Integer"
  "Real"
}

@datatype class GclUnaryExp(op: GclUnaryOp.Type,
                            exp: GclExp,
                            val pos: Option[Position]) extends GclExp

@datatype class GclBinaryExp(op: GclBinaryOp.Type,
                             lhs: GclExp,
                             rhs: GclExp,
                             val pos: Option[Position]) extends GclExp

@datatype class GclNameExp(name: Name,
                           val pos: Option[Position]) extends GclExp

@datatype class GclAccessExp(exp: GclExp,
                             attributeName: String,
                             val pos: Option[Position]) extends GclExp

@datatype class GclLiteralExp(typ: GclLiteralType.Type,
                              exp: String,
                              val pos: Option[Position]) extends GclExp

@datatype class GclTODO