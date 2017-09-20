// #Sireum

package org.sireum.aadl.ast

import org.sireum._


@datatype trait MyTop{}

@datatype class AadlXml(components: ISZ[String]) extends MyTop

@datatype class Component(identifier: String,
                          category: Category.Type,

                          classifier: Classifier,
                          features: ISZ[Feature],
                          subComponents: ISZ[Component],
                          connections: ISZ[Connection],
                          properties: ISZ[Property],
                          flows: ISZ[Flow],
                          modes: ISZ[Mode],
                          annexes: ISZ[Annex]) extends MyTop


@datatype class Classifier() extends MyTop // FIXME: no members in xsd

@enum object Category {
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
                        typ: Typ.Type,
                        classifier: Classifier,
                        properties: ISZ[Property]) extends MyTop

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
                           properties: ISZ[Property]) extends MyTop

@datatype class EndPoint(component: String,
                         feature: String) extends MyTop


@datatype class Property(name: String,
                         propertyValues: ISZ[PropertyValue]) extends MyTop

@datatype trait PropertyValue extends MyTop {}

@datatype class ClassifierProp(name: String) extends PropertyValue

@datatype class UnitProp(value: String,
                         unit: String) extends PropertyValue

@datatype class RangeProp(ValueLow: String,
                          ValueHigh: String,
                          Unit: String) extends PropertyValue

@datatype class Mode(name: String) extends MyTop

@datatype class Flow(name: String) extends MyTop

@datatype class Annex(name: String) extends MyTop // FIXME: aadl.xsd is incomplete