// #Sireum
/*
 Copyright (c) 2017-2026,Kansas State University
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
  * Start of EMV2 AST Section
  */
@sig trait Emv2Annex extends AnnexClause

@sig trait Emv2Lib extends AnnexLib

@enum object PropagationDirection {
  'In
  'Out
}

@datatype class Emv2ElementRef(val kind: Emv2ElementKind.Type,
                               val name: Name,
                               val errorTypes: ISZ[Name])
  extends ElementRef

@enum object Emv2ElementKind {
  'Source
  'Sink
  'Path
  'Propagation
  'State
  'Event
  'BehaviorTransition
}

@datatype class Emv2Library(val name: Name,
                            val useTypes: ISZ[String],
                            val errorTypeDef: ISZ[ErrorTypeDef],
                            val errorTypeSetDef: ISZ[ErrorTypeSetDef],
                            val alias: ISZ[ErrorAliasDef],
                            val behaveStateMachine: ISZ[BehaveStateMachine])
  extends Emv2Lib

@enum object ErrorKind {
  'all
  'noerror
}

@datatype class ErrorTypeDef(val id: Name,
                             val extendType: Option[Name],
                             val uriFrag: String)
  extends Emv2Annex
    with AadlInstInfo

@datatype class ErrorAliasDef(val errorType: Name, val aliseType: Name)
  extends Emv2Annex

@datatype class ErrorTypeSetDef(val id: Name, val errorTypes: ISZ[Name])
  extends Emv2Annex

@datatype class BehaveStateMachine(val id: Name,
                                   val events: ISZ[ErrorEvent],
                                   val states: ISZ[ErrorState],
                                   val transitions: ISZ[ErrorTransition],
                                   val properties: ISZ[Property])
  extends Emv2Annex

@datatype class ErrorEvent(val id: Name) extends Emv2Annex

@datatype class ErrorState(val id: Name, val isInitial: B) extends Emv2Annex

@datatype class ErrorTransition(val id: Option[Name],
                                val sourceState: Name,
                                val condition: ErrorCondition,
                                val targetState: Name)
  extends Emv2Annex

@sig trait ErrorCondition extends Emv2Annex

@datatype class ConditionTrigger(val events: ISZ[Name],
                                 val propagationPoints: ISZ[Emv2Propagation])
  extends ErrorCondition

@datatype class AndCondition(val op: ISZ[ErrorCondition]) extends ErrorCondition

@datatype class OrCondition(val op: ISZ[ErrorCondition]) extends ErrorCondition

@datatype class AllCondition(val op: ISZ[ErrorCondition]) extends ErrorCondition

@datatype class OrMoreCondition(val number: Z, val conditions: ISZ[ErrorCondition])
  extends ErrorCondition

@datatype class OrLessCondition(val number: Z, val conditions: ISZ[ErrorCondition])
  extends ErrorCondition

@datatype class Emv2Clause(val libraries: ISZ[Name],
                           val propagations: ISZ[Emv2Propagation],
                           val flows: ISZ[Emv2Flow],
                           val componentBehavior: Option[Emv2BehaviorSection],
                           val properties: ISZ[Property])
  extends Emv2Annex

@datatype class Emv2Propagation(val direction: PropagationDirection.Type,
                                val propagationPoint: Name,
                                val errorTokens: ISZ[Name])
  extends Emv2Annex

@datatype class Emv2Flow(val identifier: Name,
                         val kind: FlowKind.Type,
                         val sourcePropagation: Option[Emv2Propagation],
                         val sinkPropagation: Option[Emv2Propagation],
                         val uriFrag: String)
  extends Emv2Annex
    with AadlInstInfo

@datatype class Emv2BehaviorSection(val events: ISZ[ErrorEvent],
                                    val transitions: ISZ[ErrorTransition],
                                    val propagations: ISZ[ErrorPropagation])
  extends Emv2Annex

@datatype class ErrorPropagation(val id: Option[Name],
                                 val source: ISZ[Name],
                                 val condition: Option[ErrorCondition],
                                 val target: ISZ[Emv2Propagation])
  extends Emv2Annex

/**
  * End of EMV2 AST Section
  */