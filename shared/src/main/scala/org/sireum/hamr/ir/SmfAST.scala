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

/**
  * Start of SMF AST Section
  */
@sig trait SmfAnnex extends AnnexClause

@sig trait SmfLib extends AnnexLib

@datatype class SmfClause(classification: ISZ[SmfClassification],
                          declass: ISZ[SmfDeclass])
  extends SmfAnnex

@datatype class SmfClassification(portName: Name, typeName: Name)
  extends SmfAnnex

@datatype class SmfDeclass(flowName: Name, srcType: Option[Name], snkType: Name)
  extends SmfAnnex

@datatype class SmfLibrary(types: ISZ[SmfType]) extends SmfLib

@datatype class SmfType(typeName: Name, parentType: ISZ[Name])
  extends SmfAnnex

/**
  * End of SMF AST Section
  */
