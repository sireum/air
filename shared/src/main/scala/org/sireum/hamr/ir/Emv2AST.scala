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

/**
  * Start of EMV2 AST Section
  */
@sig trait Emv2Annex extends AnnexClause

@sig trait Emv2Lib extends AnnexLib

@enum object PropagationDirection {
  'In
  'Out
}

@datatype class Emv2ElementRef(kind: Emv2ElementKind.Type,
                               name: Name,
                               errorTypes: ISZ[Name])
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

@datatype class Emv2Library(name: Name,
                            useTypes: ISZ[String],
                            errorTypeDef: ISZ[ErrorTypeDef],
                            errorTypeSetDef: ISZ[ErrorTypeSetDef],
                            alias: ISZ[ErrorAliasDef],
                            behaveStateMachine: ISZ[BehaveStateMachine])
  extends Emv2Lib

@enum object ErrorKind {
  'all
  'noerror
}

@datatype class ErrorTypeDef(id: Name,
                             extendType: Option[Name],
                             val uriFrag: String)
  extends Emv2Annex
    with AadlInstInfo

@datatype class ErrorAliasDef(errorType: Name, aliseType: Name)
  extends Emv2Annex

@datatype class ErrorTypeSetDef(id: Name, errorTypes: ISZ[Name])
  extends Emv2Annex

@datatype class BehaveStateMachine(id: Name,
                                   events: ISZ[ErrorEvent],
                                   states: ISZ[ErrorState],
                                   transitions: ISZ[ErrorTransition],
                                   properties: ISZ[Property])
  extends Emv2Annex

@datatype class ErrorEvent(id: Name) extends Emv2Annex

@datatype class ErrorState(id: Name, isInitial: B) extends Emv2Annex

@datatype class ErrorTransition(id: Option[Name],
                                sourceState: Name,
                                condition: ErrorCondition,
                                targetState: Name)
  extends Emv2Annex

@sig trait ErrorCondition extends Emv2Annex

@datatype class ConditionTrigger(events: ISZ[Name],
                                 propagationPoints: ISZ[Emv2Propagation])
  extends ErrorCondition

@datatype class AndCondition(op: ISZ[ErrorCondition]) extends ErrorCondition

@datatype class OrCondition(op: ISZ[ErrorCondition]) extends ErrorCondition

@datatype class AllCondition(op: ISZ[ErrorCondition]) extends ErrorCondition

@datatype class OrMoreCondition(number: Z, conditions: ISZ[ErrorCondition])
  extends ErrorCondition

@datatype class OrLessCondition(number: Z, conditions: ISZ[ErrorCondition])
  extends ErrorCondition

@datatype class Emv2Clause(libraries: ISZ[Name],
                           propagations: ISZ[Emv2Propagation],
                           flows: ISZ[Emv2Flow],
                           componentBehavior: Option[Emv2BehaviorSection],
                           properties: ISZ[Property])
  extends Emv2Annex

@datatype class Emv2Propagation(direction: PropagationDirection.Type,
                                propagationPoint: Name,
                                errorTokens: ISZ[Name])
  extends Emv2Annex

@datatype class Emv2Flow(identifier: Name,
                         kind: FlowKind.Type,
                         sourcePropagation: Option[Emv2Propagation],
                         sinkPropagation: Option[Emv2Propagation],
                         val uriFrag: String)
  extends Emv2Annex
    with AadlInstInfo

@datatype class Emv2BehaviorSection(events: ISZ[ErrorEvent],
                                    transitions: ISZ[ErrorTransition],
                                    propagations: ISZ[ErrorPropagation])
  extends Emv2Annex

@datatype class ErrorPropagation(id: Option[Name],
                                 source: ISZ[Name],
                                 condition: Option[ErrorCondition],
                                 target: ISZ[Emv2Propagation])
  extends Emv2Annex

/**
  * End of EMV2 AST Section
  */