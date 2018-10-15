// #Sireum
// @formatter:off

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

// This file is auto-generated from AadlAST.scala

package org.sireum.lang.tipe

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def print_aadlirAadl(o: org.sireum.aadl.ir.Aadl): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.aadl.ir.Aadl""""),
        ("components", printISZ(F, o.components, print_aadlirComponent _)),
        ("errorLib", printISZ(F, o.errorLib, print_aadlirEmv2Library _))
      ))
    }

    @pure def print_aadlirName(o: org.sireum.aadl.ir.Name): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.aadl.ir.Name""""),
        ("name", printISZ(T, o.name, printString _))
      ))
    }

    @pure def print_aadlirComponent(o: org.sireum.aadl.ir.Component): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.aadl.ir.Component""""),
        ("identifier", print_aadlirName(o.identifier)),
        ("category", print_aadlirComponentCategoryType(o.category)),
        ("classifier", printOption(F, o.classifier, print_aadlirClassifier _)),
        ("features", printISZ(F, o.features, print_aadlirFeature _)),
        ("subComponents", printISZ(F, o.subComponents, print_aadlirComponent _)),
        ("connections", printISZ(F, o.connections, print_aadlirConnection _)),
        ("connectionInstances", printISZ(F, o.connectionInstances, print_aadlirConnectionInstance _)),
        ("properties", printISZ(F, o.properties, print_aadlirProperty _)),
        ("flows", printISZ(F, o.flows, print_aadlirFlow _)),
        ("modes", printISZ(F, o.modes, print_aadlirMode _)),
        ("annexes", printISZ(F, o.annexes, print_aadlirAnnex _))
      ))
    }

    @pure def print_aadlirClassifier(o: org.sireum.aadl.ir.Classifier): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.aadl.ir.Classifier""""),
        ("name", printString(o.name))
      ))
    }

    @pure def print_aadlirComponentCategoryType(o: org.sireum.aadl.ir.ComponentCategory.Type): ST = {
      val value: String = o match {
        case org.sireum.aadl.ir.ComponentCategory.Abstract => "Abstract"
        case org.sireum.aadl.ir.ComponentCategory.Bus => "Bus"
        case org.sireum.aadl.ir.ComponentCategory.Data => "Data"
        case org.sireum.aadl.ir.ComponentCategory.Device => "Device"
        case org.sireum.aadl.ir.ComponentCategory.Memory => "Memory"
        case org.sireum.aadl.ir.ComponentCategory.Process => "Process"
        case org.sireum.aadl.ir.ComponentCategory.Processor => "Processor"
        case org.sireum.aadl.ir.ComponentCategory.Subprogram => "Subprogram"
        case org.sireum.aadl.ir.ComponentCategory.SubprogramGroup => "SubprogramGroup"
        case org.sireum.aadl.ir.ComponentCategory.System => "System"
        case org.sireum.aadl.ir.ComponentCategory.Thread => "Thread"
        case org.sireum.aadl.ir.ComponentCategory.ThreadGroup => "ThreadGroup"
        case org.sireum.aadl.ir.ComponentCategory.VirtualBus => "VirtualBus"
        case org.sireum.aadl.ir.ComponentCategory.VirtualProcessor => "VirtualProcessor"
      }
      return printObject(ISZ(
        ("type", printString("org.sireum.aadl.ir.ComponentCategory")),
        ("value", printString(value))
      ))
    }

    @pure def print_aadlirFeature(o: org.sireum.aadl.ir.Feature): ST = {
      o match {
        case o: org.sireum.aadl.ir.FeatureEnd => return print_aadlirFeatureEnd(o)
        case o: org.sireum.aadl.ir.FeatureGroup => return print_aadlirFeatureGroup(o)
      }
    }

    @pure def print_aadlirFeatureEnd(o: org.sireum.aadl.ir.FeatureEnd): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.aadl.ir.FeatureEnd""""),
        ("identifier", print_aadlirName(o.identifier)),
        ("direction", print_aadlirDirectionType(o.direction)),
        ("category", print_aadlirFeatureCategoryType(o.category)),
        ("classifier", printOption(F, o.classifier, print_aadlirClassifier _)),
        ("properties", printISZ(F, o.properties, print_aadlirProperty _))
      ))
    }

    @pure def print_aadlirFeatureGroup(o: org.sireum.aadl.ir.FeatureGroup): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.aadl.ir.FeatureGroup""""),
        ("identifier", print_aadlirName(o.identifier)),
        ("features", printISZ(F, o.features, print_aadlirFeature _)),
        ("isInverse", printB(o.isInverse)),
        ("category", print_aadlirFeatureCategoryType(o.category)),
        ("properties", printISZ(F, o.properties, print_aadlirProperty _))
      ))
    }

    @pure def print_aadlirDirectionType(o: org.sireum.aadl.ir.Direction.Type): ST = {
      val value: String = o match {
        case org.sireum.aadl.ir.Direction.In => "In"
        case org.sireum.aadl.ir.Direction.Out => "Out"
        case org.sireum.aadl.ir.Direction.InOut => "InOut"
        case org.sireum.aadl.ir.Direction.None => "None"
      }
      return printObject(ISZ(
        ("type", printString("org.sireum.aadl.ir.Direction")),
        ("value", printString(value))
      ))
    }

    @pure def print_aadlirFeatureCategoryType(o: org.sireum.aadl.ir.FeatureCategory.Type): ST = {
      val value: String = o match {
        case org.sireum.aadl.ir.FeatureCategory.AbstractFeature => "AbstractFeature"
        case org.sireum.aadl.ir.FeatureCategory.BusAccess => "BusAccess"
        case org.sireum.aadl.ir.FeatureCategory.DataAccess => "DataAccess"
        case org.sireum.aadl.ir.FeatureCategory.DataPort => "DataPort"
        case org.sireum.aadl.ir.FeatureCategory.EventPort => "EventPort"
        case org.sireum.aadl.ir.FeatureCategory.EventDataPort => "EventDataPort"
        case org.sireum.aadl.ir.FeatureCategory.FeatureGroup => "FeatureGroup"
        case org.sireum.aadl.ir.FeatureCategory.Parameter => "Parameter"
        case org.sireum.aadl.ir.FeatureCategory.SubprogramAccess => "SubprogramAccess"
        case org.sireum.aadl.ir.FeatureCategory.SubprogramAccessGroup => "SubprogramAccessGroup"
      }
      return printObject(ISZ(
        ("type", printString("org.sireum.aadl.ir.FeatureCategory")),
        ("value", printString(value))
      ))
    }

    @pure def print_aadlirConnection(o: org.sireum.aadl.ir.Connection): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.aadl.ir.Connection""""),
        ("name", print_aadlirName(o.name)),
        ("src", printISZ(F, o.src, print_aadlirEndPoint _)),
        ("dst", printISZ(F, o.dst, print_aadlirEndPoint _)),
        ("kind", print_aadlirConnectionKindType(o.kind)),
        ("isBiDirectional", printB(o.isBiDirectional)),
        ("connectionInstances", printISZ(F, o.connectionInstances, print_aadlirName _)),
        ("properties", printISZ(F, o.properties, print_aadlirProperty _))
      ))
    }

    @pure def print_aadlirConnectionInstance(o: org.sireum.aadl.ir.ConnectionInstance): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.aadl.ir.ConnectionInstance""""),
        ("name", print_aadlirName(o.name)),
        ("src", print_aadlirEndPoint(o.src)),
        ("dst", print_aadlirEndPoint(o.dst)),
        ("kind", print_aadlirConnectionKindType(o.kind)),
        ("connectionRefs", printISZ(F, o.connectionRefs, print_aadlirConnectionReference _)),
        ("properties", printISZ(F, o.properties, print_aadlirProperty _))
      ))
    }

    @pure def print_aadlirConnectionReference(o: org.sireum.aadl.ir.ConnectionReference): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.aadl.ir.ConnectionReference""""),
        ("name", print_aadlirName(o.name)),
        ("context", print_aadlirName(o.context)),
        ("isParent", printB(o.isParent))
      ))
    }

    @pure def print_aadlirConnectionKindType(o: org.sireum.aadl.ir.ConnectionKind.Type): ST = {
      val value: String = o match {
        case org.sireum.aadl.ir.ConnectionKind.Feature => "Feature"
        case org.sireum.aadl.ir.ConnectionKind.Access => "Access"
        case org.sireum.aadl.ir.ConnectionKind.Parameter => "Parameter"
        case org.sireum.aadl.ir.ConnectionKind.Port => "Port"
        case org.sireum.aadl.ir.ConnectionKind.ModeTransition => "ModeTransition"
        case org.sireum.aadl.ir.ConnectionKind.FeatureGroup => "FeatureGroup"
      }
      return printObject(ISZ(
        ("type", printString("org.sireum.aadl.ir.ConnectionKind")),
        ("value", printString(value))
      ))
    }

    @pure def print_aadlirEndPoint(o: org.sireum.aadl.ir.EndPoint): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.aadl.ir.EndPoint""""),
        ("component", print_aadlirName(o.component)),
        ("feature", printOption(F, o.feature, print_aadlirName _)),
        ("direction", printOption(F, o.direction, print_aadlirDirectionType _))
      ))
    }

    @pure def print_aadlirProperty(o: org.sireum.aadl.ir.Property): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.aadl.ir.Property""""),
        ("name", print_aadlirName(o.name)),
        ("propertyValues", printISZ(F, o.propertyValues, print_aadlirPropertyValue _))
      ))
    }

    @pure def print_aadlirPropertyValue(o: org.sireum.aadl.ir.PropertyValue): ST = {
      o match {
        case o: org.sireum.aadl.ir.ClassifierProp => return print_aadlirClassifierProp(o)
        case o: org.sireum.aadl.ir.RangeProp => return print_aadlirRangeProp(o)
        case o: org.sireum.aadl.ir.RecordProp => return print_aadlirRecordProp(o)
        case o: org.sireum.aadl.ir.ReferenceProp => return print_aadlirReferenceProp(o)
        case o: org.sireum.aadl.ir.UnitProp => return print_aadlirUnitProp(o)
        case o: org.sireum.aadl.ir.ValueProp => return print_aadlirValueProp(o)
      }
    }

    @pure def print_aadlirClassifierProp(o: org.sireum.aadl.ir.ClassifierProp): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.aadl.ir.ClassifierProp""""),
        ("name", printString(o.name))
      ))
    }

    @pure def print_aadlirRangeProp(o: org.sireum.aadl.ir.RangeProp): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.aadl.ir.RangeProp""""),
        ("low", print_aadlirUnitProp(o.low)),
        ("high", print_aadlirUnitProp(o.high))
      ))
    }

    @pure def print_aadlirRecordProp(o: org.sireum.aadl.ir.RecordProp): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.aadl.ir.RecordProp""""),
        ("properties", printISZ(F, o.properties, print_aadlirProperty _))
      ))
    }

    @pure def print_aadlirReferenceProp(o: org.sireum.aadl.ir.ReferenceProp): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.aadl.ir.ReferenceProp""""),
        ("value", print_aadlirName(o.value))
      ))
    }

    @pure def print_aadlirUnitProp(o: org.sireum.aadl.ir.UnitProp): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.aadl.ir.UnitProp""""),
        ("value", printString(o.value)),
        ("unit", printOption(T, o.unit, printString _))
      ))
    }

    @pure def print_aadlirValueProp(o: org.sireum.aadl.ir.ValueProp): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.aadl.ir.ValueProp""""),
        ("value", printString(o.value))
      ))
    }

    @pure def print_aadlirMode(o: org.sireum.aadl.ir.Mode): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.aadl.ir.Mode""""),
        ("name", print_aadlirName(o.name))
      ))
    }

    @pure def print_aadlirFlowKindType(o: org.sireum.aadl.ir.FlowKind.Type): ST = {
      val value: String = o match {
        case org.sireum.aadl.ir.FlowKind.Source => "Source"
        case org.sireum.aadl.ir.FlowKind.Sink => "Sink"
        case org.sireum.aadl.ir.FlowKind.Path => "Path"
      }
      return printObject(ISZ(
        ("type", printString("org.sireum.aadl.ir.FlowKind")),
        ("value", printString(value))
      ))
    }

    @pure def print_aadlirFlow(o: org.sireum.aadl.ir.Flow): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.aadl.ir.Flow""""),
        ("name", print_aadlirName(o.name)),
        ("kind", print_aadlirFlowKindType(o.kind)),
        ("source", printOption(F, o.source, print_aadlirFeature _)),
        ("sink", printOption(F, o.sink, print_aadlirFeature _))
      ))
    }

    @pure def print_aadlirAnnex(o: org.sireum.aadl.ir.Annex): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.aadl.ir.Annex""""),
        ("name", printString(o.name)),
        ("clause", print_aadlirAnnexClause(o.clause))
      ))
    }

    @pure def print_aadlirAnnexClause(o: org.sireum.aadl.ir.AnnexClause): ST = {
      o match {
        case o: org.sireum.aadl.ir.Emv2Library => return print_aadlirEmv2Library(o)
        case o: org.sireum.aadl.ir.Emv2Propagation => return print_aadlirEmv2Propagation(o)
        case o: org.sireum.aadl.ir.Emv2Flow => return print_aadlirEmv2Flow(o)
        case o: org.sireum.aadl.ir.Emv2Clause => return print_aadlirEmv2Clause(o)
        case o: org.sireum.aadl.ir.OtherAnnex => return print_aadlirOtherAnnex(o)
      }
    }

    @pure def print_aadlirEmv2Annex(o: org.sireum.aadl.ir.Emv2Annex): ST = {
      o match {
        case o: org.sireum.aadl.ir.Emv2Library => return print_aadlirEmv2Library(o)
        case o: org.sireum.aadl.ir.Emv2Propagation => return print_aadlirEmv2Propagation(o)
        case o: org.sireum.aadl.ir.Emv2Flow => return print_aadlirEmv2Flow(o)
        case o: org.sireum.aadl.ir.Emv2Clause => return print_aadlirEmv2Clause(o)
      }
    }

    @pure def print_aadlirPropagationDirectionType(o: org.sireum.aadl.ir.PropagationDirection.Type): ST = {
      val value: String = o match {
        case org.sireum.aadl.ir.PropagationDirection.In => "In"
        case org.sireum.aadl.ir.PropagationDirection.Out => "Out"
      }
      return printObject(ISZ(
        ("type", printString("org.sireum.aadl.ir.PropagationDirection")),
        ("value", printString(value))
      ))
    }

    @pure def print_aadlirEmv2Library(o: org.sireum.aadl.ir.Emv2Library): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.aadl.ir.Emv2Library""""),
        ("name", print_aadlirName(o.name)),
        ("useTypes", printISZ(T, o.useTypes, printString _)),
        ("tokens", printISZ(T, o.tokens, printString _)),
        ("alias", printHashMap(T, o.alias, printString _, printString _))
      ))
    }

    @pure def print_aadlirEmv2Propagation(o: org.sireum.aadl.ir.Emv2Propagation): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.aadl.ir.Emv2Propagation""""),
        ("direction", print_aadlirPropagationDirectionType(o.direction)),
        ("propagationPoint", printISZ(T, o.propagationPoint, printString _)),
        ("errorTokens", printISZ(T, o.errorTokens, printString _))
      ))
    }

    @pure def print_aadlirEmv2Flow(o: org.sireum.aadl.ir.Emv2Flow): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.aadl.ir.Emv2Flow""""),
        ("identifier", print_aadlirName(o.identifier)),
        ("kind", print_aadlirFlowKindType(o.kind)),
        ("sourcePropagation", printOption(F, o.sourcePropagation, print_aadlirEmv2Propagation _)),
        ("sinkPropagation", printOption(F, o.sinkPropagation, print_aadlirEmv2Propagation _))
      ))
    }

    @pure def print_aadlirEmv2Clause(o: org.sireum.aadl.ir.Emv2Clause): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.aadl.ir.Emv2Clause""""),
        ("libraries", printISZ(T, o.libraries, printString _)),
        ("propagations", printISZ(F, o.propagations, print_aadlirEmv2Propagation _)),
        ("flows", printISZ(F, o.flows, print_aadlirEmv2Flow _))
      ))
    }

    @pure def print_aadlirOtherAnnex(o: org.sireum.aadl.ir.OtherAnnex): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.aadl.ir.OtherAnnex""""),
        ("clause", printString(o.clause))
      ))
    }

  }

  @record class Parser(input: String) {
    val parser: Json.Parser = Json.Parser.create(input)

    def errorOpt: Option[Json.ErrorMsg] = {
      return parser.errorOpt
    }

    def parse_aadlirAadl(): org.sireum.aadl.ir.Aadl = {
      val r = parse_aadlirAadlT(F)
      return r
    }

    def parse_aadlirAadlT(typeParsed: B): org.sireum.aadl.ir.Aadl = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.aadl.ir.Aadl")
      }
      parser.parseObjectKey("components")
      val components = parser.parseISZ(parse_aadlirComponent _)
      parser.parseObjectNext()
      parser.parseObjectKey("errorLib")
      val errorLib = parser.parseISZ(parse_aadlirEmv2Library _)
      parser.parseObjectNext()
      return org.sireum.aadl.ir.Aadl(components, errorLib)
    }

    def parse_aadlirName(): org.sireum.aadl.ir.Name = {
      val r = parse_aadlirNameT(F)
      return r
    }

    def parse_aadlirNameT(typeParsed: B): org.sireum.aadl.ir.Name = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.aadl.ir.Name")
      }
      parser.parseObjectKey("name")
      val name = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      return org.sireum.aadl.ir.Name(name)
    }

    def parse_aadlirComponent(): org.sireum.aadl.ir.Component = {
      val r = parse_aadlirComponentT(F)
      return r
    }

    def parse_aadlirComponentT(typeParsed: B): org.sireum.aadl.ir.Component = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.aadl.ir.Component")
      }
      parser.parseObjectKey("identifier")
      val identifier = parse_aadlirName()
      parser.parseObjectNext()
      parser.parseObjectKey("category")
      val category = parse_aadlirComponentCategoryType()
      parser.parseObjectNext()
      parser.parseObjectKey("classifier")
      val classifier = parser.parseOption(parse_aadlirClassifier _)
      parser.parseObjectNext()
      parser.parseObjectKey("features")
      val features = parser.parseISZ(parse_aadlirFeature _)
      parser.parseObjectNext()
      parser.parseObjectKey("subComponents")
      val subComponents = parser.parseISZ(parse_aadlirComponent _)
      parser.parseObjectNext()
      parser.parseObjectKey("connections")
      val connections = parser.parseISZ(parse_aadlirConnection _)
      parser.parseObjectNext()
      parser.parseObjectKey("connectionInstances")
      val connectionInstances = parser.parseISZ(parse_aadlirConnectionInstance _)
      parser.parseObjectNext()
      parser.parseObjectKey("properties")
      val properties = parser.parseISZ(parse_aadlirProperty _)
      parser.parseObjectNext()
      parser.parseObjectKey("flows")
      val flows = parser.parseISZ(parse_aadlirFlow _)
      parser.parseObjectNext()
      parser.parseObjectKey("modes")
      val modes = parser.parseISZ(parse_aadlirMode _)
      parser.parseObjectNext()
      parser.parseObjectKey("annexes")
      val annexes = parser.parseISZ(parse_aadlirAnnex _)
      parser.parseObjectNext()
      return org.sireum.aadl.ir.Component(identifier, category, classifier, features, subComponents, connections, connectionInstances, properties, flows, modes, annexes)
    }

    def parse_aadlirClassifier(): org.sireum.aadl.ir.Classifier = {
      val r = parse_aadlirClassifierT(F)
      return r
    }

    def parse_aadlirClassifierT(typeParsed: B): org.sireum.aadl.ir.Classifier = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.aadl.ir.Classifier")
      }
      parser.parseObjectKey("name")
      val name = parser.parseString()
      parser.parseObjectNext()
      return org.sireum.aadl.ir.Classifier(name)
    }

    def parse_aadlirComponentCategoryType(): org.sireum.aadl.ir.ComponentCategory.Type = {
      val r = parse_aadlirComponentCategoryT(F)
      return r
    }

    def parse_aadlirComponentCategoryT(typeParsed: B): org.sireum.aadl.ir.ComponentCategory.Type = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.aadl.ir.ComponentCategory")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      org.sireum.aadl.ir.ComponentCategory.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for org.sireum.aadl.ir.ComponentCategory.")
          return org.sireum.aadl.ir.ComponentCategory.byOrdinal(0).get
      }
    }

    def parse_aadlirFeature(): org.sireum.aadl.ir.Feature = {
      val t = parser.parseObjectTypes(ISZ("org.sireum.aadl.ir.FeatureEnd", "org.sireum.aadl.ir.FeatureGroup"))
      t.native match {
        case "org.sireum.aadl.ir.FeatureEnd" => val r = parse_aadlirFeatureEndT(T); return r
        case "org.sireum.aadl.ir.FeatureGroup" => val r = parse_aadlirFeatureGroupT(T); return r
        case _ => val r = parse_aadlirFeatureGroupT(T); return r
      }
    }

    def parse_aadlirFeatureEnd(): org.sireum.aadl.ir.FeatureEnd = {
      val r = parse_aadlirFeatureEndT(F)
      return r
    }

    def parse_aadlirFeatureEndT(typeParsed: B): org.sireum.aadl.ir.FeatureEnd = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.aadl.ir.FeatureEnd")
      }
      parser.parseObjectKey("identifier")
      val identifier = parse_aadlirName()
      parser.parseObjectNext()
      parser.parseObjectKey("direction")
      val direction = parse_aadlirDirectionType()
      parser.parseObjectNext()
      parser.parseObjectKey("category")
      val category = parse_aadlirFeatureCategoryType()
      parser.parseObjectNext()
      parser.parseObjectKey("classifier")
      val classifier = parser.parseOption(parse_aadlirClassifier _)
      parser.parseObjectNext()
      parser.parseObjectKey("properties")
      val properties = parser.parseISZ(parse_aadlirProperty _)
      parser.parseObjectNext()
      return org.sireum.aadl.ir.FeatureEnd(identifier, direction, category, classifier, properties)
    }

    def parse_aadlirFeatureGroup(): org.sireum.aadl.ir.FeatureGroup = {
      val r = parse_aadlirFeatureGroupT(F)
      return r
    }

    def parse_aadlirFeatureGroupT(typeParsed: B): org.sireum.aadl.ir.FeatureGroup = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.aadl.ir.FeatureGroup")
      }
      parser.parseObjectKey("identifier")
      val identifier = parse_aadlirName()
      parser.parseObjectNext()
      parser.parseObjectKey("features")
      val features = parser.parseISZ(parse_aadlirFeature _)
      parser.parseObjectNext()
      parser.parseObjectKey("isInverse")
      val isInverse = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("category")
      val category = parse_aadlirFeatureCategoryType()
      parser.parseObjectNext()
      parser.parseObjectKey("properties")
      val properties = parser.parseISZ(parse_aadlirProperty _)
      parser.parseObjectNext()
      return org.sireum.aadl.ir.FeatureGroup(identifier, features, isInverse, category, properties)
    }

    def parse_aadlirDirectionType(): org.sireum.aadl.ir.Direction.Type = {
      val r = parse_aadlirDirectionT(F)
      return r
    }

    def parse_aadlirDirectionT(typeParsed: B): org.sireum.aadl.ir.Direction.Type = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.aadl.ir.Direction")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      org.sireum.aadl.ir.Direction.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for org.sireum.aadl.ir.Direction.")
          return org.sireum.aadl.ir.Direction.byOrdinal(0).get
      }
    }

    def parse_aadlirFeatureCategoryType(): org.sireum.aadl.ir.FeatureCategory.Type = {
      val r = parse_aadlirFeatureCategoryT(F)
      return r
    }

    def parse_aadlirFeatureCategoryT(typeParsed: B): org.sireum.aadl.ir.FeatureCategory.Type = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.aadl.ir.FeatureCategory")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      org.sireum.aadl.ir.FeatureCategory.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for org.sireum.aadl.ir.FeatureCategory.")
          return org.sireum.aadl.ir.FeatureCategory.byOrdinal(0).get
      }
    }

    def parse_aadlirConnection(): org.sireum.aadl.ir.Connection = {
      val r = parse_aadlirConnectionT(F)
      return r
    }

    def parse_aadlirConnectionT(typeParsed: B): org.sireum.aadl.ir.Connection = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.aadl.ir.Connection")
      }
      parser.parseObjectKey("name")
      val name = parse_aadlirName()
      parser.parseObjectNext()
      parser.parseObjectKey("src")
      val src = parser.parseISZ(parse_aadlirEndPoint _)
      parser.parseObjectNext()
      parser.parseObjectKey("dst")
      val dst = parser.parseISZ(parse_aadlirEndPoint _)
      parser.parseObjectNext()
      parser.parseObjectKey("kind")
      val kind = parse_aadlirConnectionKindType()
      parser.parseObjectNext()
      parser.parseObjectKey("isBiDirectional")
      val isBiDirectional = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("connectionInstances")
      val connectionInstances = parser.parseISZ(parse_aadlirName _)
      parser.parseObjectNext()
      parser.parseObjectKey("properties")
      val properties = parser.parseISZ(parse_aadlirProperty _)
      parser.parseObjectNext()
      return org.sireum.aadl.ir.Connection(name, src, dst, kind, isBiDirectional, connectionInstances, properties)
    }

    def parse_aadlirConnectionInstance(): org.sireum.aadl.ir.ConnectionInstance = {
      val r = parse_aadlirConnectionInstanceT(F)
      return r
    }

    def parse_aadlirConnectionInstanceT(typeParsed: B): org.sireum.aadl.ir.ConnectionInstance = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.aadl.ir.ConnectionInstance")
      }
      parser.parseObjectKey("name")
      val name = parse_aadlirName()
      parser.parseObjectNext()
      parser.parseObjectKey("src")
      val src = parse_aadlirEndPoint()
      parser.parseObjectNext()
      parser.parseObjectKey("dst")
      val dst = parse_aadlirEndPoint()
      parser.parseObjectNext()
      parser.parseObjectKey("kind")
      val kind = parse_aadlirConnectionKindType()
      parser.parseObjectNext()
      parser.parseObjectKey("connectionRefs")
      val connectionRefs = parser.parseISZ(parse_aadlirConnectionReference _)
      parser.parseObjectNext()
      parser.parseObjectKey("properties")
      val properties = parser.parseISZ(parse_aadlirProperty _)
      parser.parseObjectNext()
      return org.sireum.aadl.ir.ConnectionInstance(name, src, dst, kind, connectionRefs, properties)
    }

    def parse_aadlirConnectionReference(): org.sireum.aadl.ir.ConnectionReference = {
      val r = parse_aadlirConnectionReferenceT(F)
      return r
    }

    def parse_aadlirConnectionReferenceT(typeParsed: B): org.sireum.aadl.ir.ConnectionReference = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.aadl.ir.ConnectionReference")
      }
      parser.parseObjectKey("name")
      val name = parse_aadlirName()
      parser.parseObjectNext()
      parser.parseObjectKey("context")
      val context = parse_aadlirName()
      parser.parseObjectNext()
      parser.parseObjectKey("isParent")
      val isParent = parser.parseB()
      parser.parseObjectNext()
      return org.sireum.aadl.ir.ConnectionReference(name, context, isParent)
    }

    def parse_aadlirConnectionKindType(): org.sireum.aadl.ir.ConnectionKind.Type = {
      val r = parse_aadlirConnectionKindT(F)
      return r
    }

    def parse_aadlirConnectionKindT(typeParsed: B): org.sireum.aadl.ir.ConnectionKind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.aadl.ir.ConnectionKind")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      org.sireum.aadl.ir.ConnectionKind.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for org.sireum.aadl.ir.ConnectionKind.")
          return org.sireum.aadl.ir.ConnectionKind.byOrdinal(0).get
      }
    }

    def parse_aadlirEndPoint(): org.sireum.aadl.ir.EndPoint = {
      val r = parse_aadlirEndPointT(F)
      return r
    }

    def parse_aadlirEndPointT(typeParsed: B): org.sireum.aadl.ir.EndPoint = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.aadl.ir.EndPoint")
      }
      parser.parseObjectKey("component")
      val component = parse_aadlirName()
      parser.parseObjectNext()
      parser.parseObjectKey("feature")
      val feature = parser.parseOption(parse_aadlirName _)
      parser.parseObjectNext()
      parser.parseObjectKey("direction")
      val direction = parser.parseOption(parse_aadlirDirectionType _)
      parser.parseObjectNext()
      return org.sireum.aadl.ir.EndPoint(component, feature, direction)
    }

    def parse_aadlirProperty(): org.sireum.aadl.ir.Property = {
      val r = parse_aadlirPropertyT(F)
      return r
    }

    def parse_aadlirPropertyT(typeParsed: B): org.sireum.aadl.ir.Property = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.aadl.ir.Property")
      }
      parser.parseObjectKey("name")
      val name = parse_aadlirName()
      parser.parseObjectNext()
      parser.parseObjectKey("propertyValues")
      val propertyValues = parser.parseISZ(parse_aadlirPropertyValue _)
      parser.parseObjectNext()
      return org.sireum.aadl.ir.Property(name, propertyValues)
    }

    def parse_aadlirPropertyValue(): org.sireum.aadl.ir.PropertyValue = {
      val t = parser.parseObjectTypes(ISZ("org.sireum.aadl.ir.ClassifierProp", "org.sireum.aadl.ir.RangeProp", "org.sireum.aadl.ir.RecordProp", "org.sireum.aadl.ir.ReferenceProp", "org.sireum.aadl.ir.UnitProp", "org.sireum.aadl.ir.ValueProp"))
      t.native match {
        case "org.sireum.aadl.ir.ClassifierProp" => val r = parse_aadlirClassifierPropT(T); return r
        case "org.sireum.aadl.ir.RangeProp" => val r = parse_aadlirRangePropT(T); return r
        case "org.sireum.aadl.ir.RecordProp" => val r = parse_aadlirRecordPropT(T); return r
        case "org.sireum.aadl.ir.ReferenceProp" => val r = parse_aadlirReferencePropT(T); return r
        case "org.sireum.aadl.ir.UnitProp" => val r = parse_aadlirUnitPropT(T); return r
        case "org.sireum.aadl.ir.ValueProp" => val r = parse_aadlirValuePropT(T); return r
        case _ => val r = parse_aadlirValuePropT(T); return r
      }
    }

    def parse_aadlirClassifierProp(): org.sireum.aadl.ir.ClassifierProp = {
      val r = parse_aadlirClassifierPropT(F)
      return r
    }

    def parse_aadlirClassifierPropT(typeParsed: B): org.sireum.aadl.ir.ClassifierProp = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.aadl.ir.ClassifierProp")
      }
      parser.parseObjectKey("name")
      val name = parser.parseString()
      parser.parseObjectNext()
      return org.sireum.aadl.ir.ClassifierProp(name)
    }

    def parse_aadlirRangeProp(): org.sireum.aadl.ir.RangeProp = {
      val r = parse_aadlirRangePropT(F)
      return r
    }

    def parse_aadlirRangePropT(typeParsed: B): org.sireum.aadl.ir.RangeProp = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.aadl.ir.RangeProp")
      }
      parser.parseObjectKey("low")
      val low = parse_aadlirUnitProp()
      parser.parseObjectNext()
      parser.parseObjectKey("high")
      val high = parse_aadlirUnitProp()
      parser.parseObjectNext()
      return org.sireum.aadl.ir.RangeProp(low, high)
    }

    def parse_aadlirRecordProp(): org.sireum.aadl.ir.RecordProp = {
      val r = parse_aadlirRecordPropT(F)
      return r
    }

    def parse_aadlirRecordPropT(typeParsed: B): org.sireum.aadl.ir.RecordProp = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.aadl.ir.RecordProp")
      }
      parser.parseObjectKey("properties")
      val properties = parser.parseISZ(parse_aadlirProperty _)
      parser.parseObjectNext()
      return org.sireum.aadl.ir.RecordProp(properties)
    }

    def parse_aadlirReferenceProp(): org.sireum.aadl.ir.ReferenceProp = {
      val r = parse_aadlirReferencePropT(F)
      return r
    }

    def parse_aadlirReferencePropT(typeParsed: B): org.sireum.aadl.ir.ReferenceProp = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.aadl.ir.ReferenceProp")
      }
      parser.parseObjectKey("value")
      val value = parse_aadlirName()
      parser.parseObjectNext()
      return org.sireum.aadl.ir.ReferenceProp(value)
    }

    def parse_aadlirUnitProp(): org.sireum.aadl.ir.UnitProp = {
      val r = parse_aadlirUnitPropT(F)
      return r
    }

    def parse_aadlirUnitPropT(typeParsed: B): org.sireum.aadl.ir.UnitProp = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.aadl.ir.UnitProp")
      }
      parser.parseObjectKey("value")
      val value = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("unit")
      val unit = parser.parseOption(parser.parseString _)
      parser.parseObjectNext()
      return org.sireum.aadl.ir.UnitProp(value, unit)
    }

    def parse_aadlirValueProp(): org.sireum.aadl.ir.ValueProp = {
      val r = parse_aadlirValuePropT(F)
      return r
    }

    def parse_aadlirValuePropT(typeParsed: B): org.sireum.aadl.ir.ValueProp = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.aadl.ir.ValueProp")
      }
      parser.parseObjectKey("value")
      val value = parser.parseString()
      parser.parseObjectNext()
      return org.sireum.aadl.ir.ValueProp(value)
    }

    def parse_aadlirMode(): org.sireum.aadl.ir.Mode = {
      val r = parse_aadlirModeT(F)
      return r
    }

    def parse_aadlirModeT(typeParsed: B): org.sireum.aadl.ir.Mode = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.aadl.ir.Mode")
      }
      parser.parseObjectKey("name")
      val name = parse_aadlirName()
      parser.parseObjectNext()
      return org.sireum.aadl.ir.Mode(name)
    }

    def parse_aadlirFlowKindType(): org.sireum.aadl.ir.FlowKind.Type = {
      val r = parse_aadlirFlowKindT(F)
      return r
    }

    def parse_aadlirFlowKindT(typeParsed: B): org.sireum.aadl.ir.FlowKind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.aadl.ir.FlowKind")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      org.sireum.aadl.ir.FlowKind.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for org.sireum.aadl.ir.FlowKind.")
          return org.sireum.aadl.ir.FlowKind.byOrdinal(0).get
      }
    }

    def parse_aadlirFlow(): org.sireum.aadl.ir.Flow = {
      val r = parse_aadlirFlowT(F)
      return r
    }

    def parse_aadlirFlowT(typeParsed: B): org.sireum.aadl.ir.Flow = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.aadl.ir.Flow")
      }
      parser.parseObjectKey("name")
      val name = parse_aadlirName()
      parser.parseObjectNext()
      parser.parseObjectKey("kind")
      val kind = parse_aadlirFlowKindType()
      parser.parseObjectNext()
      parser.parseObjectKey("source")
      val source = parser.parseOption(parse_aadlirFeature _)
      parser.parseObjectNext()
      parser.parseObjectKey("sink")
      val sink = parser.parseOption(parse_aadlirFeature _)
      parser.parseObjectNext()
      return org.sireum.aadl.ir.Flow(name, kind, source, sink)
    }

    def parse_aadlirAnnex(): org.sireum.aadl.ir.Annex = {
      val r = parse_aadlirAnnexT(F)
      return r
    }

    def parse_aadlirAnnexT(typeParsed: B): org.sireum.aadl.ir.Annex = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.aadl.ir.Annex")
      }
      parser.parseObjectKey("name")
      val name = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("clause")
      val clause = parse_aadlirAnnexClause()
      parser.parseObjectNext()
      return org.sireum.aadl.ir.Annex(name, clause)
    }

    def parse_aadlirAnnexClause(): org.sireum.aadl.ir.AnnexClause = {
      val t = parser.parseObjectTypes(ISZ("org.sireum.aadl.ir.Emv2Library", "org.sireum.aadl.ir.Emv2Propagation", "org.sireum.aadl.ir.Emv2Flow", "org.sireum.aadl.ir.Emv2Clause", "org.sireum.aadl.ir.OtherAnnex"))
      t.native match {
        case "org.sireum.aadl.ir.Emv2Library" => val r = parse_aadlirEmv2LibraryT(T); return r
        case "org.sireum.aadl.ir.Emv2Propagation" => val r = parse_aadlirEmv2PropagationT(T); return r
        case "org.sireum.aadl.ir.Emv2Flow" => val r = parse_aadlirEmv2FlowT(T); return r
        case "org.sireum.aadl.ir.Emv2Clause" => val r = parse_aadlirEmv2ClauseT(T); return r
        case "org.sireum.aadl.ir.OtherAnnex" => val r = parse_aadlirOtherAnnexT(T); return r
        case _ => val r = parse_aadlirOtherAnnexT(T); return r
      }
    }

    def parse_aadlirEmv2Annex(): org.sireum.aadl.ir.Emv2Annex = {
      val t = parser.parseObjectTypes(ISZ("org.sireum.aadl.ir.Emv2Library", "org.sireum.aadl.ir.Emv2Propagation", "org.sireum.aadl.ir.Emv2Flow", "org.sireum.aadl.ir.Emv2Clause"))
      t.native match {
        case "org.sireum.aadl.ir.Emv2Library" => val r = parse_aadlirEmv2LibraryT(T); return r
        case "org.sireum.aadl.ir.Emv2Propagation" => val r = parse_aadlirEmv2PropagationT(T); return r
        case "org.sireum.aadl.ir.Emv2Flow" => val r = parse_aadlirEmv2FlowT(T); return r
        case "org.sireum.aadl.ir.Emv2Clause" => val r = parse_aadlirEmv2ClauseT(T); return r
        case _ => val r = parse_aadlirEmv2ClauseT(T); return r
      }
    }

    def parse_aadlirPropagationDirectionType(): org.sireum.aadl.ir.PropagationDirection.Type = {
      val r = parse_aadlirPropagationDirectionT(F)
      return r
    }

    def parse_aadlirPropagationDirectionT(typeParsed: B): org.sireum.aadl.ir.PropagationDirection.Type = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.aadl.ir.PropagationDirection")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      org.sireum.aadl.ir.PropagationDirection.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for org.sireum.aadl.ir.PropagationDirection.")
          return org.sireum.aadl.ir.PropagationDirection.byOrdinal(0).get
      }
    }

    def parse_aadlirEmv2Library(): org.sireum.aadl.ir.Emv2Library = {
      val r = parse_aadlirEmv2LibraryT(F)
      return r
    }

    def parse_aadlirEmv2LibraryT(typeParsed: B): org.sireum.aadl.ir.Emv2Library = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.aadl.ir.Emv2Library")
      }
      parser.parseObjectKey("name")
      val name = parse_aadlirName()
      parser.parseObjectNext()
      parser.parseObjectKey("useTypes")
      val useTypes = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      parser.parseObjectKey("tokens")
      val tokens = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      parser.parseObjectKey("alias")
      val alias = parser.parseHashMap(parser.parseString _, parser.parseString _)
      parser.parseObjectNext()
      return org.sireum.aadl.ir.Emv2Library(name, useTypes, tokens, alias)
    }

    def parse_aadlirEmv2Propagation(): org.sireum.aadl.ir.Emv2Propagation = {
      val r = parse_aadlirEmv2PropagationT(F)
      return r
    }

    def parse_aadlirEmv2PropagationT(typeParsed: B): org.sireum.aadl.ir.Emv2Propagation = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.aadl.ir.Emv2Propagation")
      }
      parser.parseObjectKey("direction")
      val direction = parse_aadlirPropagationDirectionType()
      parser.parseObjectNext()
      parser.parseObjectKey("propagationPoint")
      val propagationPoint = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      parser.parseObjectKey("errorTokens")
      val errorTokens = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      return org.sireum.aadl.ir.Emv2Propagation(direction, propagationPoint, errorTokens)
    }

    def parse_aadlirEmv2Flow(): org.sireum.aadl.ir.Emv2Flow = {
      val r = parse_aadlirEmv2FlowT(F)
      return r
    }

    def parse_aadlirEmv2FlowT(typeParsed: B): org.sireum.aadl.ir.Emv2Flow = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.aadl.ir.Emv2Flow")
      }
      parser.parseObjectKey("identifier")
      val identifier = parse_aadlirName()
      parser.parseObjectNext()
      parser.parseObjectKey("kind")
      val kind = parse_aadlirFlowKindType()
      parser.parseObjectNext()
      parser.parseObjectKey("sourcePropagation")
      val sourcePropagation = parser.parseOption(parse_aadlirEmv2Propagation _)
      parser.parseObjectNext()
      parser.parseObjectKey("sinkPropagation")
      val sinkPropagation = parser.parseOption(parse_aadlirEmv2Propagation _)
      parser.parseObjectNext()
      return org.sireum.aadl.ir.Emv2Flow(identifier, kind, sourcePropagation, sinkPropagation)
    }

    def parse_aadlirEmv2Clause(): org.sireum.aadl.ir.Emv2Clause = {
      val r = parse_aadlirEmv2ClauseT(F)
      return r
    }

    def parse_aadlirEmv2ClauseT(typeParsed: B): org.sireum.aadl.ir.Emv2Clause = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.aadl.ir.Emv2Clause")
      }
      parser.parseObjectKey("libraries")
      val libraries = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      parser.parseObjectKey("propagations")
      val propagations = parser.parseISZ(parse_aadlirEmv2Propagation _)
      parser.parseObjectNext()
      parser.parseObjectKey("flows")
      val flows = parser.parseISZ(parse_aadlirEmv2Flow _)
      parser.parseObjectNext()
      return org.sireum.aadl.ir.Emv2Clause(libraries, propagations, flows)
    }

    def parse_aadlirOtherAnnex(): org.sireum.aadl.ir.OtherAnnex = {
      val r = parse_aadlirOtherAnnexT(F)
      return r
    }

    def parse_aadlirOtherAnnexT(typeParsed: B): org.sireum.aadl.ir.OtherAnnex = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.aadl.ir.OtherAnnex")
      }
      parser.parseObjectKey("clause")
      val clause = parser.parseString()
      parser.parseObjectNext()
      return org.sireum.aadl.ir.OtherAnnex(clause)
    }

    def eof(): B = {
      val r = parser.eof()
      return r
    }

  }

  def to[T](s: String, f: Parser => T): Either[T, Json.ErrorMsg] = {
    val parser = Parser(s)
    val r = f(parser)
    parser.eof()
    parser.errorOpt match {
      case Some(e) => return Either.Right(e)
      case _ => return Either.Left(r)
    }
  }

  def from_aadlirAadl(o: org.sireum.aadl.ir.Aadl, isCompact: B): String = {
    val st = Printer.print_aadlirAadl(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_aadlirAadl(s: String): Either[org.sireum.aadl.ir.Aadl, Json.ErrorMsg] = {
    def f_aadlirAadl(parser: Parser): org.sireum.aadl.ir.Aadl = {
      val r = parser.parse_aadlirAadl()
      return r
    }
    val r = to(s, f_aadlirAadl _)
    return r
  }

  def from_aadlirName(o: org.sireum.aadl.ir.Name, isCompact: B): String = {
    val st = Printer.print_aadlirName(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_aadlirName(s: String): Either[org.sireum.aadl.ir.Name, Json.ErrorMsg] = {
    def f_aadlirName(parser: Parser): org.sireum.aadl.ir.Name = {
      val r = parser.parse_aadlirName()
      return r
    }
    val r = to(s, f_aadlirName _)
    return r
  }

  def from_aadlirComponent(o: org.sireum.aadl.ir.Component, isCompact: B): String = {
    val st = Printer.print_aadlirComponent(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_aadlirComponent(s: String): Either[org.sireum.aadl.ir.Component, Json.ErrorMsg] = {
    def f_aadlirComponent(parser: Parser): org.sireum.aadl.ir.Component = {
      val r = parser.parse_aadlirComponent()
      return r
    }
    val r = to(s, f_aadlirComponent _)
    return r
  }

  def from_aadlirClassifier(o: org.sireum.aadl.ir.Classifier, isCompact: B): String = {
    val st = Printer.print_aadlirClassifier(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_aadlirClassifier(s: String): Either[org.sireum.aadl.ir.Classifier, Json.ErrorMsg] = {
    def f_aadlirClassifier(parser: Parser): org.sireum.aadl.ir.Classifier = {
      val r = parser.parse_aadlirClassifier()
      return r
    }
    val r = to(s, f_aadlirClassifier _)
    return r
  }

  def from_aadlirFeature(o: org.sireum.aadl.ir.Feature, isCompact: B): String = {
    val st = Printer.print_aadlirFeature(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_aadlirFeature(s: String): Either[org.sireum.aadl.ir.Feature, Json.ErrorMsg] = {
    def f_aadlirFeature(parser: Parser): org.sireum.aadl.ir.Feature = {
      val r = parser.parse_aadlirFeature()
      return r
    }
    val r = to(s, f_aadlirFeature _)
    return r
  }

  def from_aadlirFeatureEnd(o: org.sireum.aadl.ir.FeatureEnd, isCompact: B): String = {
    val st = Printer.print_aadlirFeatureEnd(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_aadlirFeatureEnd(s: String): Either[org.sireum.aadl.ir.FeatureEnd, Json.ErrorMsg] = {
    def f_aadlirFeatureEnd(parser: Parser): org.sireum.aadl.ir.FeatureEnd = {
      val r = parser.parse_aadlirFeatureEnd()
      return r
    }
    val r = to(s, f_aadlirFeatureEnd _)
    return r
  }

  def from_aadlirFeatureGroup(o: org.sireum.aadl.ir.FeatureGroup, isCompact: B): String = {
    val st = Printer.print_aadlirFeatureGroup(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_aadlirFeatureGroup(s: String): Either[org.sireum.aadl.ir.FeatureGroup, Json.ErrorMsg] = {
    def f_aadlirFeatureGroup(parser: Parser): org.sireum.aadl.ir.FeatureGroup = {
      val r = parser.parse_aadlirFeatureGroup()
      return r
    }
    val r = to(s, f_aadlirFeatureGroup _)
    return r
  }

  def from_aadlirConnection(o: org.sireum.aadl.ir.Connection, isCompact: B): String = {
    val st = Printer.print_aadlirConnection(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_aadlirConnection(s: String): Either[org.sireum.aadl.ir.Connection, Json.ErrorMsg] = {
    def f_aadlirConnection(parser: Parser): org.sireum.aadl.ir.Connection = {
      val r = parser.parse_aadlirConnection()
      return r
    }
    val r = to(s, f_aadlirConnection _)
    return r
  }

  def from_aadlirConnectionInstance(o: org.sireum.aadl.ir.ConnectionInstance, isCompact: B): String = {
    val st = Printer.print_aadlirConnectionInstance(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_aadlirConnectionInstance(s: String): Either[org.sireum.aadl.ir.ConnectionInstance, Json.ErrorMsg] = {
    def f_aadlirConnectionInstance(parser: Parser): org.sireum.aadl.ir.ConnectionInstance = {
      val r = parser.parse_aadlirConnectionInstance()
      return r
    }
    val r = to(s, f_aadlirConnectionInstance _)
    return r
  }

  def from_aadlirConnectionReference(o: org.sireum.aadl.ir.ConnectionReference, isCompact: B): String = {
    val st = Printer.print_aadlirConnectionReference(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_aadlirConnectionReference(s: String): Either[org.sireum.aadl.ir.ConnectionReference, Json.ErrorMsg] = {
    def f_aadlirConnectionReference(parser: Parser): org.sireum.aadl.ir.ConnectionReference = {
      val r = parser.parse_aadlirConnectionReference()
      return r
    }
    val r = to(s, f_aadlirConnectionReference _)
    return r
  }

  def from_aadlirEndPoint(o: org.sireum.aadl.ir.EndPoint, isCompact: B): String = {
    val st = Printer.print_aadlirEndPoint(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_aadlirEndPoint(s: String): Either[org.sireum.aadl.ir.EndPoint, Json.ErrorMsg] = {
    def f_aadlirEndPoint(parser: Parser): org.sireum.aadl.ir.EndPoint = {
      val r = parser.parse_aadlirEndPoint()
      return r
    }
    val r = to(s, f_aadlirEndPoint _)
    return r
  }

  def from_aadlirProperty(o: org.sireum.aadl.ir.Property, isCompact: B): String = {
    val st = Printer.print_aadlirProperty(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_aadlirProperty(s: String): Either[org.sireum.aadl.ir.Property, Json.ErrorMsg] = {
    def f_aadlirProperty(parser: Parser): org.sireum.aadl.ir.Property = {
      val r = parser.parse_aadlirProperty()
      return r
    }
    val r = to(s, f_aadlirProperty _)
    return r
  }

  def from_aadlirPropertyValue(o: org.sireum.aadl.ir.PropertyValue, isCompact: B): String = {
    val st = Printer.print_aadlirPropertyValue(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_aadlirPropertyValue(s: String): Either[org.sireum.aadl.ir.PropertyValue, Json.ErrorMsg] = {
    def f_aadlirPropertyValue(parser: Parser): org.sireum.aadl.ir.PropertyValue = {
      val r = parser.parse_aadlirPropertyValue()
      return r
    }
    val r = to(s, f_aadlirPropertyValue _)
    return r
  }

  def from_aadlirClassifierProp(o: org.sireum.aadl.ir.ClassifierProp, isCompact: B): String = {
    val st = Printer.print_aadlirClassifierProp(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_aadlirClassifierProp(s: String): Either[org.sireum.aadl.ir.ClassifierProp, Json.ErrorMsg] = {
    def f_aadlirClassifierProp(parser: Parser): org.sireum.aadl.ir.ClassifierProp = {
      val r = parser.parse_aadlirClassifierProp()
      return r
    }
    val r = to(s, f_aadlirClassifierProp _)
    return r
  }

  def from_aadlirRangeProp(o: org.sireum.aadl.ir.RangeProp, isCompact: B): String = {
    val st = Printer.print_aadlirRangeProp(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_aadlirRangeProp(s: String): Either[org.sireum.aadl.ir.RangeProp, Json.ErrorMsg] = {
    def f_aadlirRangeProp(parser: Parser): org.sireum.aadl.ir.RangeProp = {
      val r = parser.parse_aadlirRangeProp()
      return r
    }
    val r = to(s, f_aadlirRangeProp _)
    return r
  }

  def from_aadlirRecordProp(o: org.sireum.aadl.ir.RecordProp, isCompact: B): String = {
    val st = Printer.print_aadlirRecordProp(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_aadlirRecordProp(s: String): Either[org.sireum.aadl.ir.RecordProp, Json.ErrorMsg] = {
    def f_aadlirRecordProp(parser: Parser): org.sireum.aadl.ir.RecordProp = {
      val r = parser.parse_aadlirRecordProp()
      return r
    }
    val r = to(s, f_aadlirRecordProp _)
    return r
  }

  def from_aadlirReferenceProp(o: org.sireum.aadl.ir.ReferenceProp, isCompact: B): String = {
    val st = Printer.print_aadlirReferenceProp(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_aadlirReferenceProp(s: String): Either[org.sireum.aadl.ir.ReferenceProp, Json.ErrorMsg] = {
    def f_aadlirReferenceProp(parser: Parser): org.sireum.aadl.ir.ReferenceProp = {
      val r = parser.parse_aadlirReferenceProp()
      return r
    }
    val r = to(s, f_aadlirReferenceProp _)
    return r
  }

  def from_aadlirUnitProp(o: org.sireum.aadl.ir.UnitProp, isCompact: B): String = {
    val st = Printer.print_aadlirUnitProp(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_aadlirUnitProp(s: String): Either[org.sireum.aadl.ir.UnitProp, Json.ErrorMsg] = {
    def f_aadlirUnitProp(parser: Parser): org.sireum.aadl.ir.UnitProp = {
      val r = parser.parse_aadlirUnitProp()
      return r
    }
    val r = to(s, f_aadlirUnitProp _)
    return r
  }

  def from_aadlirValueProp(o: org.sireum.aadl.ir.ValueProp, isCompact: B): String = {
    val st = Printer.print_aadlirValueProp(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_aadlirValueProp(s: String): Either[org.sireum.aadl.ir.ValueProp, Json.ErrorMsg] = {
    def f_aadlirValueProp(parser: Parser): org.sireum.aadl.ir.ValueProp = {
      val r = parser.parse_aadlirValueProp()
      return r
    }
    val r = to(s, f_aadlirValueProp _)
    return r
  }

  def from_aadlirMode(o: org.sireum.aadl.ir.Mode, isCompact: B): String = {
    val st = Printer.print_aadlirMode(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_aadlirMode(s: String): Either[org.sireum.aadl.ir.Mode, Json.ErrorMsg] = {
    def f_aadlirMode(parser: Parser): org.sireum.aadl.ir.Mode = {
      val r = parser.parse_aadlirMode()
      return r
    }
    val r = to(s, f_aadlirMode _)
    return r
  }

  def from_aadlirFlow(o: org.sireum.aadl.ir.Flow, isCompact: B): String = {
    val st = Printer.print_aadlirFlow(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_aadlirFlow(s: String): Either[org.sireum.aadl.ir.Flow, Json.ErrorMsg] = {
    def f_aadlirFlow(parser: Parser): org.sireum.aadl.ir.Flow = {
      val r = parser.parse_aadlirFlow()
      return r
    }
    val r = to(s, f_aadlirFlow _)
    return r
  }

  def from_aadlirAnnex(o: org.sireum.aadl.ir.Annex, isCompact: B): String = {
    val st = Printer.print_aadlirAnnex(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_aadlirAnnex(s: String): Either[org.sireum.aadl.ir.Annex, Json.ErrorMsg] = {
    def f_aadlirAnnex(parser: Parser): org.sireum.aadl.ir.Annex = {
      val r = parser.parse_aadlirAnnex()
      return r
    }
    val r = to(s, f_aadlirAnnex _)
    return r
  }

  def from_aadlirAnnexClause(o: org.sireum.aadl.ir.AnnexClause, isCompact: B): String = {
    val st = Printer.print_aadlirAnnexClause(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_aadlirAnnexClause(s: String): Either[org.sireum.aadl.ir.AnnexClause, Json.ErrorMsg] = {
    def f_aadlirAnnexClause(parser: Parser): org.sireum.aadl.ir.AnnexClause = {
      val r = parser.parse_aadlirAnnexClause()
      return r
    }
    val r = to(s, f_aadlirAnnexClause _)
    return r
  }

  def from_aadlirEmv2Annex(o: org.sireum.aadl.ir.Emv2Annex, isCompact: B): String = {
    val st = Printer.print_aadlirEmv2Annex(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_aadlirEmv2Annex(s: String): Either[org.sireum.aadl.ir.Emv2Annex, Json.ErrorMsg] = {
    def f_aadlirEmv2Annex(parser: Parser): org.sireum.aadl.ir.Emv2Annex = {
      val r = parser.parse_aadlirEmv2Annex()
      return r
    }
    val r = to(s, f_aadlirEmv2Annex _)
    return r
  }

  def from_aadlirEmv2Library(o: org.sireum.aadl.ir.Emv2Library, isCompact: B): String = {
    val st = Printer.print_aadlirEmv2Library(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_aadlirEmv2Library(s: String): Either[org.sireum.aadl.ir.Emv2Library, Json.ErrorMsg] = {
    def f_aadlirEmv2Library(parser: Parser): org.sireum.aadl.ir.Emv2Library = {
      val r = parser.parse_aadlirEmv2Library()
      return r
    }
    val r = to(s, f_aadlirEmv2Library _)
    return r
  }

  def from_aadlirEmv2Propagation(o: org.sireum.aadl.ir.Emv2Propagation, isCompact: B): String = {
    val st = Printer.print_aadlirEmv2Propagation(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_aadlirEmv2Propagation(s: String): Either[org.sireum.aadl.ir.Emv2Propagation, Json.ErrorMsg] = {
    def f_aadlirEmv2Propagation(parser: Parser): org.sireum.aadl.ir.Emv2Propagation = {
      val r = parser.parse_aadlirEmv2Propagation()
      return r
    }
    val r = to(s, f_aadlirEmv2Propagation _)
    return r
  }

  def from_aadlirEmv2Flow(o: org.sireum.aadl.ir.Emv2Flow, isCompact: B): String = {
    val st = Printer.print_aadlirEmv2Flow(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_aadlirEmv2Flow(s: String): Either[org.sireum.aadl.ir.Emv2Flow, Json.ErrorMsg] = {
    def f_aadlirEmv2Flow(parser: Parser): org.sireum.aadl.ir.Emv2Flow = {
      val r = parser.parse_aadlirEmv2Flow()
      return r
    }
    val r = to(s, f_aadlirEmv2Flow _)
    return r
  }

  def from_aadlirEmv2Clause(o: org.sireum.aadl.ir.Emv2Clause, isCompact: B): String = {
    val st = Printer.print_aadlirEmv2Clause(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_aadlirEmv2Clause(s: String): Either[org.sireum.aadl.ir.Emv2Clause, Json.ErrorMsg] = {
    def f_aadlirEmv2Clause(parser: Parser): org.sireum.aadl.ir.Emv2Clause = {
      val r = parser.parse_aadlirEmv2Clause()
      return r
    }
    val r = to(s, f_aadlirEmv2Clause _)
    return r
  }

  def from_aadlirOtherAnnex(o: org.sireum.aadl.ir.OtherAnnex, isCompact: B): String = {
    val st = Printer.print_aadlirOtherAnnex(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_aadlirOtherAnnex(s: String): Either[org.sireum.aadl.ir.OtherAnnex, Json.ErrorMsg] = {
    def f_aadlirOtherAnnex(parser: Parser): org.sireum.aadl.ir.OtherAnnex = {
      val r = parser.parse_aadlirOtherAnnex()
      return r
    }
    val r = to(s, f_aadlirOtherAnnex _)
    return r
  }

}