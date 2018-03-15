// #Sireum

package org.sireum.aadl.ir

import org.sireum._


@datatype class Aadl(components: ISZ[Component], errorLib: ISZ[Emv2Library])

@datatype class Name(name: ISZ[String])

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
                          annexes: ISZ[Annex])


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

@datatype class Feature(identifier: Name,
                        direction : Direction.Type,
                        category: FeatureCategory.Type,
                        classifier: Option[Classifier],
                        properties: ISZ[Property])

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
                           src: EndPoint,
                           dst: EndPoint,
                           isBiDirectional: B,
                           connectionInstances: ISZ[Name],
                           properties: ISZ[Property])

@datatype class ConnectionInstance(name: Name,
                                   src: EndPoint,
                                   dst: EndPoint,
                                   kind: ConnectionKind.Type,
                                   connectionRefs: ISZ[ConnectionReference],
                                   properties: ISZ[Property])

@datatype class ConnectionReference(name: Name,
                                    context: Name,
                                    isParent: B)

@enum object ConnectionKind {
  'Feature
  'Access
  'Parameter
  'Port
  'ModeTransition
  'FeatureGroup
}

@datatype class EndPoint(component: Name,
                         feature: Name)

@datatype class Property(name: Name,
                         propertyValues: ISZ[PropertyValue])

@datatype trait PropertyValue

@datatype class ClassifierProp(name: String) extends PropertyValue

@datatype class RangeProp(ValueLow: String,
                          ValueHigh: String,
                          Unit: Option[String]) extends PropertyValue

@datatype class ReferenceProp(value: String) extends PropertyValue

@datatype class UnitProp(value: String,
                         unit: String) extends PropertyValue

@datatype class ValueProp(value: String) extends PropertyValue


@datatype class Mode(name: Name)

@enum object FlowKind {
  'Source
  'Sink
  'Path
}

@datatype class Flow(name: Name,
                     kind: FlowKind.Type,
                     source: Option[String],
                     sink: Option[String])

@datatype class Annex(name: String, clause: AnnexClause)

@sig trait AnnexClause

@sig trait Emv2Annex extends AnnexClause

@enum object PropagationDirection {
  'In
  'Out
}

@datatype class Emv2Library(name: Name,
                            tokens: ISZ[String]) extends Emv2Annex

@datatype class Emv2Propagation(direction: PropagationDirection.Type,
                                propagationPoint: ISZ[String],
                                errorTokens: ISZ[String]) extends Emv2Annex

@datatype class Emv2Flow(identifier: Name,
                         kind: FlowKind.Type,
                         sourcePropagation: Option[Emv2Propagation],
                         sinkPropagation: Option[Emv2Propagation]) extends Emv2Annex

@datatype class Emv2Clause(libraries: ISZ[String],
                           propagations: ISZ[Emv2Propagation],
                           flows: ISZ[Emv2Flow]) extends Emv2Annex

@datatype class OtherAnnex(clause: String) extends AnnexClause