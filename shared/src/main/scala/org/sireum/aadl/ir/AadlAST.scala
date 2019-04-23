// #Sireum
/*
 Copyright (c) 2018, Kansas State University
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

package org.sireum.aadl.ir

import org.sireum._
import org.sireum.message.Position

@datatype class Aadl(components: ISZ[Component], errorLib: ISZ[Emv2Library], dataComponents: ISZ[Component])

@datatype class Name(name: ISZ[String], pos: Option[Position])

@datatype class Component(
                           identifier: Name,
                           category: ComponentCategory.Type,
                           classifier: Option[Classifier],
                           features: ISZ[Feature],
                           subComponents: ISZ[Component],
                           connections: ISZ[Connection],
                           connectionInstances: ISZ[ConnectionInstance],
                           properties: ISZ[Property],
                           flows: ISZ[Flow],
                           modes: ISZ[Mode],
                           annexes: ISZ[Annex]
                         )

@datatype class Classifier(name: String)

@enum object ComponentCategory {
  'Abstract
  'Bus
  'Data
  'Device
  'Memory
  'Process
  'Processor
  'Subprogram
  'SubprogramGroup
  'System
  'Thread
  'ThreadGroup
  'VirtualBus
  'VirtualProcessor
}

@sig trait Feature {
  def identifier: Name

  def category: FeatureCategory.Type

 // def classifier: Option[Classifier]

  def properties: ISZ[Property]
}

@datatype class FeatureEnd(
                            val identifier: Name,
                            direction: Direction.Type,
                            val category: FeatureCategory.Type,
                            val classifier: Option[Classifier],
                            val properties: ISZ[Property]
                          ) extends Feature

@datatype class FeatureGroup(
                              val identifier: Name,
                              features: ISZ[Feature],
                              isInverse: B,
                              val category: FeatureCategory.Type,
                             // val classifier: Option[Classifier],
                              val properties: ISZ[Property]
                            ) extends Feature


@datatype class FeatureAccess(
                               val identifier: Name,
                               val category: FeatureCategory.Type,
                               val classifier: Option[Classifier],
                               val accessType: AccessType.Type,
                               val accessCategory: AccessCategory.Type,
                               val properties: ISZ[Property]
                             ) extends Feature

@enum object AccessType {
  'Provides
  'Requires
}

@enum object AccessCategory {
  'Bus
  'Data
  'Subprogram
  'SubprogramGroup
  'VirtualBus
}

@enum object Direction {
  'In
  'Out
  'InOut
  'None
}

@enum object FeatureCategory {
  'AbstractFeature
  'BusAccess
  'DataAccess
  'DataPort
  'EventPort
  'EventDataPort
  'FeatureGroup
  'Parameter
  'SubprogramAccess
  'SubprogramAccessGroup
}

@datatype class Connection(
                            name: Name,
                            src: ISZ[EndPoint],
                            dst: ISZ[EndPoint],
                            kind: ConnectionKind.Type,
                            isBiDirectional: B,
                            connectionInstances: ISZ[Name],
                            properties: ISZ[Property]
                          )

@datatype class ConnectionInstance(
                                    name: Name,
                                    src: EndPoint,
                                    dst: EndPoint,
                                    kind: ConnectionKind.Type,
                                    connectionRefs: ISZ[ConnectionReference],
                                    properties: ISZ[Property]
                                  )

@datatype class ConnectionReference(name: Name, context: Name, isParent: B)

@enum object ConnectionKind {
  'Feature
  'Access
  'Parameter
  'Port
  'ModeTransition
  'FeatureGroup
}

@datatype class EndPoint(component: Name, feature: Option[Name], direction: Option[Direction.Type])

@datatype class Property(name: Name, propertyValues: ISZ[PropertyValue])

@datatype trait PropertyValue

@datatype class ClassifierProp(name: String) extends PropertyValue

@datatype class RangeProp(low: UnitProp, high: UnitProp) extends PropertyValue

@datatype class RecordProp(properties: ISZ[Property]) extends PropertyValue

@datatype class ReferenceProp(value: Name) extends PropertyValue

@datatype class UnitProp(value: String, unit: Option[String]) extends PropertyValue

@datatype class ValueProp(value: String) extends PropertyValue

@datatype class Mode(name: Name)

@enum object FlowKind {
  'Source
  'Sink
  'Path
}

@datatype class Flow(name: Name, kind: FlowKind.Type, source: Option[Feature], sink: Option[Feature])

@datatype class Annex(name: String, clause: AnnexClause)

@sig trait AnnexClause

@sig trait Emv2Annex extends AnnexClause

@enum object PropagationDirection {
  'In
  'Out
}

@datatype class Emv2Library(name: Name,
                            useTypes: ISZ[String],
                            errorTypeDef: ISZ[ErrorTypeDef],
                            errorTypeSetDef: ISZ[ErrorTypeSetDef],
                            alias: ISZ[ErrorAliasDef],
                            behaveStateMachine: ISZ[BehaveStateMachine])
  extends Emv2Annex

@enum object ErrorKind {
  'all
  'noerror
}

@datatype class ErrorTypeDef(id : Name, extendType: Option[Name]) extends Emv2Annex

@datatype class ErrorAliasDef(errorType: Name,
                              aliseType: Name) extends Emv2Annex

@datatype class ErrorTypeSetDef(id : Name,
                                errorTypes : ISZ[Name]) extends Emv2Annex

@datatype class BehaveStateMachine(id : Name,
                                   events: ISZ[ErrorEvent],
                                   states: ISZ[ErrorState],
                                   transitions: ISZ[ErrorTransition],
                                   properties: ISZ[Property]) extends Emv2Annex

@datatype class ErrorEvent(id: Name) extends Emv2Annex

@datatype class ErrorState(id: Name,
                           isInitial: B) extends Emv2Annex

@datatype class ErrorTransition(id: Option[Name],
                                sourceState : Name,
                                condition : ErrorCondition,
                                targetState : Name
                               ) extends Emv2Annex

@sig trait ErrorCondition extends Emv2Annex

@datatype class ConditionTrigger(events : ISZ[Name],
                                 propagationPoints: ISZ[Emv2Propagation]
                                ) extends ErrorCondition

@datatype class AndCondition(op: ISZ[ErrorCondition]) extends ErrorCondition

@datatype class OrCondition(op: ISZ[ErrorCondition]) extends ErrorCondition

@datatype class AllCondition(op: ISZ[ErrorCondition]) extends ErrorCondition

@datatype class OrMoreCondition(number: Z, conditions: ISZ[ErrorCondition]) extends ErrorCondition

@datatype class OrLessCondition(number: Z, conditions: ISZ[ErrorCondition]) extends ErrorCondition

@datatype class Emv2Clause(
  libraries: ISZ[Name],
                           propagations: ISZ[Emv2Propagation],
                           flows: ISZ[Emv2Flow],
  componentBehavior: Option[Emv2BehaviorSection]
) extends Emv2Annex

@datatype class Emv2Propagation( direction: PropagationDirection.Type,
                                 propagationPoint: Name,
                                 errorTokens: ISZ[Name]
                               ) extends Emv2Annex

@datatype class Emv2Flow(identifier: Name,
                          kind: FlowKind.Type,
                          sourcePropagation: Option[Emv2Propagation],
                          sinkPropagation: Option[Emv2Propagation]
                        ) extends Emv2Annex

@datatype class Emv2BehaviorSection(events : ISZ[ErrorEvent],
                                    transitions: ISZ[ErrorTransition],
                                    propagations: ISZ[ErrorPropagation]
                                   ) extends Emv2Annex

@datatype class ErrorPropagation(
  id: Option[Name],
                                 source : ISZ[Name],
                                 condition: Option[ErrorCondition],
                                 target : ISZ[Emv2Propagation]
                                ) extends Emv2Annex

@datatype class OtherAnnex(clause: String) extends AnnexClause
