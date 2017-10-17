// #Sireum

package org.sireum.aadl.ast

import org.sireum._


@datatype trait AadlTop

@datatype class AadlXml(components: ISZ[String]) extends AadlTop

@datatype class Component(identifier: Option[String],
                          category: ComponentCategory.Type,

                          classifier: Option[Classifier],
                          features: ISZ[Feature],
                          subComponents: ISZ[Component],
                          connections: ISZ[Connection],
                          properties: ISZ[Property],
                          flows: ISZ[Flow],
                          modes: ISZ[Mode],
                          annexes: ISZ[Annex]) extends AadlTop


@datatype class Classifier(name: String) extends AadlTop

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

@datatype class Feature(identifier: String,
                        direction : Direction.Type,
                        category: FeatureCategory.Type,
                        classifier: Option[Classifier],
                        properties: ISZ[Property]) extends AadlTop

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

@datatype class Connection(name: Option[String],
                           src: EndPoint,
                           dst: EndPoint,
                           properties: ISZ[Property]) extends AadlTop

@datatype class EndPoint(component: String,
                         feature: String) extends AadlTop


@datatype class Property(name: String,
                         propertyValues: ISZ[PropertyValue]) extends AadlTop

@datatype trait PropertyValue

@datatype class ClassifierProp(name: String) extends PropertyValue

@datatype class RangeProp(ValueLow: String,
                          ValueHigh: String,
                          Unit: Option[String]) extends PropertyValue

@datatype class ReferenceProp(value: String) extends PropertyValue

@datatype class UnitProp(value: String,
                         unit: String) extends PropertyValue

@datatype class ValueProp(value: String) extends PropertyValue


@datatype class Mode(name: String) extends AadlTop

@datatype class Flow(name: String) extends AadlTop

@datatype class Annex(name: String) extends AadlTop