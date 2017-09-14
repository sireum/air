// #Sireum

package org.sireum.lang.ast

import org.sireum._



@datatype class AadlXml(components: ISZ[String]){}

@datatype class Component(identifier: String,
                          category: Category.Type,

                          classifier: Classifier,
                          features: ISZ[Feature],
                          subComponents: ISZ[Component],
                          connections: ISZ[Connection],
                          properties: ISZ[Property],
                          flows: ISZ[Flow],
                          modes: ISZ[Mode],
                          annexes: ISZ[Annex])


@datatype class Classifier() // FIXME: no members in xsd

@enum object Category {
  'Abstract
  'Bus
  'Data
  'Device
  'Process
  'Processor
  'Thread
  'Port
  'Subprogram
  'System
  'VirtualBus
  'VirtualProcessor
}

@datatype class Feature(identifier: String,
                        direction : Direction.Type,
                        typ: Typ.Type,
                        classifier: Classifier,
                        properties: ISZ[Property])

@enum object Direction {
  'In
  'Out
  'InOut
  'None
}

@enum object Typ{
  'Acccess
  'Data
  'Event
  'EventData
  'Feature
}


@datatype class Connection(name: String,
                           src: EndPoint,
                           dst: EndPoint,
                           properties: ISZ[Property])

@datatype class EndPoint(component: String,
                         feature: String)


@datatype class Property(name: String,
                         propertyValues: ISZ[PropertyValue])

@datatype trait PropertyValue{}

object PropertyValue {

  @datatype class ClassifierProp(name: String) extends PropertyValue

  @datatype class UnitProp(value: String,
                           unit: String) extends PropertyValue

  @datatype class RangeProp(ValueLow: String,
                            ValueHigh: String,
                            Unit: String) extends PropertyValue

}

@datatype class Mode(name: String)

@datatype class Flow(name: String)

@datatype class Annex(name: String) // FIXME: aadl.xsd is incomplete