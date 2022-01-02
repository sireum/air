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

@sig
trait AadlInstInfo {
  def uriFrag: String
}

@datatype class Aadl(components: ISZ[Component],
                     annexLib: ISZ[AnnexLib],
                     dataComponents: ISZ[Component])

@datatype class Name(name: ISZ[String], pos: Option[Position])

@datatype class Component(identifier: Name,
                          category: ComponentCategory.Type,
                          classifier: Option[Classifier],
                          features: ISZ[Feature],
                          subComponents: ISZ[Component],
                          connections: ISZ[Connection],
                          connectionInstances: ISZ[ConnectionInstance],
                          properties: ISZ[Property],
                          flows: ISZ[Flow],
                          modes: ISZ[Mode],
                          annexes: ISZ[Annex],
                          val uriFrag: String)
    extends AadlInstInfo

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

@datatype class FeatureEnd(val identifier: Name,
                           direction: Direction.Type,
                           val category: FeatureCategory.Type,
                           val classifier: Option[Classifier],
                           val properties: ISZ[Property],
                           val uriFrag: String)
    extends Feature
    with AadlInstInfo

@datatype class FeatureGroup(val identifier: Name,
                             features: ISZ[Feature],
                             isInverse: B,
                             val category: FeatureCategory.Type,
                             // val classifier: Option[Classifier],
                             val properties: ISZ[Property],
                             val uriFrag: String)
    extends Feature
    with AadlInstInfo

@datatype class FeatureAccess(val identifier: Name,
                              val category: FeatureCategory.Type,
                              val classifier: Option[Classifier],
                              val accessType: AccessType.Type,
                              val accessCategory: AccessCategory.Type,
                              val properties: ISZ[Property],
                              val uriFrag: String)
    extends Feature
    with AadlInstInfo

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

@datatype class Connection(name: Name,
                           src: ISZ[EndPoint],
                           dst: ISZ[EndPoint],
                           kind: ConnectionKind.Type,
                           isBiDirectional: B,
                           connectionInstances: ISZ[Name],
                           properties: ISZ[Property],
                           val uriFrag: String)
    extends AadlInstInfo

@datatype class ConnectionInstance(name: Name,
                                   src: EndPoint,
                                   dst: EndPoint,
                                   kind: ConnectionKind.Type,
                                   connectionRefs: ISZ[ConnectionReference],
                                   properties: ISZ[Property])

@datatype class ConnectionReference(name: Name, context: Name, isParent: B)

@enum object ConnectionKind {
  'Feature
  'Access
  'Parameter
  'Port
  'ModeTransition
  'FeatureGroup
}

@datatype class EndPoint(component: Name,
                         feature: Option[Name],
                         direction: Option[Direction.Type])

@datatype class Property(name: Name,
                         propertyValues: ISZ[PropertyValue],
                         appliesTo: ISZ[ElementRef])

@sig trait ElementRef

@enum object ElementKind {
  'Component
  'Connection
  'Port
  'Flow
}

@datatype class AadlElementRef(elementKind: ElementKind.Type, name: Name)
    extends ElementRef

@datatype trait PropertyValue

@datatype class ClassifierProp(name: String) extends PropertyValue

@datatype class RangeProp(low: UnitProp, high: UnitProp) extends PropertyValue

@datatype class RecordProp(properties: ISZ[Property]) extends PropertyValue

@datatype class ReferenceProp(value: Name) extends PropertyValue

@datatype class UnitProp(value: String, unit: Option[String])
    extends PropertyValue

@datatype class ValueProp(value: String) extends PropertyValue

@datatype class Mode(name: Name)

@enum object FlowKind {
  'Source
  'Sink
  'Path
}

@datatype class Flow(name: Name,
                     kind: FlowKind.Type,
                     source: Option[Name],
                     sink: Option[Name],
                     val uriFrag: String)
    extends AadlInstInfo

@datatype class Annex(name: String, clause: AnnexClause)

@sig trait AnnexClause

@sig trait AnnexLib

@datatype class OtherAnnex(clause: String) extends AnnexClause

@datatype class OtherLib(lib: String) extends AnnexLib