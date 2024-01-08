// #Sireum
/*
 Copyright (c) 2017-2024, Kansas State University
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

@datatype class Aadl(val components: ISZ[Component],
                     val annexLib: ISZ[AnnexLib],
                     val dataComponents: ISZ[Component])

@datatype class Name(val name: ISZ[String], val pos: Option[Position])

@datatype class Component(val identifier: Name,
                          val category: ComponentCategory.Type,
                          val classifier: Option[Classifier],
                          val features: ISZ[Feature],
                          val subComponents: ISZ[Component],
                          val connections: ISZ[Connection],
                          val connectionInstances: ISZ[ConnectionInstance],
                          val properties: ISZ[Property],
                          val flows: ISZ[Flow],
                          val modes: ISZ[Mode],
                          val annexes: ISZ[Annex],
                          val uriFrag: String)
    extends AadlInstInfo

@datatype class Classifier(val name: String)

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
                           val direction: Direction.Type,
                           val category: FeatureCategory.Type,
                           val classifier: Option[Classifier],
                           val properties: ISZ[Property],
                           val uriFrag: String)
    extends Feature
    with AadlInstInfo

@datatype class FeatureGroup(val identifier: Name,
                             val features: ISZ[Feature],
                             val isInverse: B,
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

@datatype class Connection(val name: Name,
                           val src: ISZ[EndPoint],
                           val dst: ISZ[EndPoint],
                           val kind: ConnectionKind.Type,
                           val isBiDirectional: B,
                           val connectionInstances: ISZ[Name],
                           val properties: ISZ[Property],
                           val uriFrag: String)
    extends AadlInstInfo

@datatype class ConnectionInstance(val name: Name,
                                   val src: EndPoint,
                                   val dst: EndPoint,
                                   val kind: ConnectionKind.Type,
                                   val connectionRefs: ISZ[ConnectionReference],
                                   val properties: ISZ[Property])

@datatype class ConnectionReference(val name: Name, val context: Name, val isParent: B)

@enum object ConnectionKind {
  'Feature
  'Access
  'Parameter
  'Port
  'ModeTransition
  'FeatureGroup
}

@datatype class EndPoint(val component: Name,
                         val feature: Option[Name],
                         val direction: Option[Direction.Type])

@datatype class Property(val name: Name,
                         val propertyValues: ISZ[PropertyValue],
                         val appliesTo: ISZ[ElementRef])

@sig trait ElementRef

@enum object ElementKind {
  'Component
  'Connection
  'Port
  'Flow
}

@datatype class AadlElementRef(val elementKind: ElementKind.Type, val name: Name)
    extends ElementRef

@datatype trait PropertyValue

@datatype class ClassifierProp(val name: String) extends PropertyValue

@datatype class RangeProp(val low: UnitProp, val high: UnitProp) extends PropertyValue

@datatype class RecordProp(val properties: ISZ[Property]) extends PropertyValue

@datatype class ReferenceProp(val value: Name) extends PropertyValue

@datatype class UnitProp(val value: String, val unit: Option[String])
    extends PropertyValue

@datatype class ValueProp(val value: String) extends PropertyValue

@datatype class Mode(val name: Name)

@enum object FlowKind {
  'Source
  'Sink
  'Path
}

@datatype class Flow(val name: Name,
                     val kind: FlowKind.Type,
                     val source: Option[Name],
                     val sink: Option[Name],
                     val uriFrag: String)
    extends AadlInstInfo

@datatype class Annex(val name: String, val clause: AnnexClause)

@sig trait AnnexClause

@sig trait AnnexLib

@datatype class OtherAnnex(val clause: String) extends AnnexClause

@datatype class OtherLib(val lib: String) extends AnnexLib