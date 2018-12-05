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

package org.sireum.aadl.ir

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printAadl(o: Aadl): ST = {
      return printObject(ISZ(
        ("type", st""""Aadl""""),
        ("components", printISZ(F, o.components, printComponent _)),
        ("errorLib", printISZ(F, o.errorLib, printEmv2Library _)),
        ("dataComponents", printISZ(F, o.dataComponents, printComponent _))
      ))
    }

    @pure def printName(o: Name): ST = {
      return printObject(ISZ(
        ("type", st""""Name""""),
        ("name", printISZ(T, o.name, printString _))
      ))
    }

    @pure def printComponent(o: Component): ST = {
      return printObject(ISZ(
        ("type", st""""Component""""),
        ("identifier", printName(o.identifier)),
        ("category", printComponentCategoryType(o.category)),
        ("classifier", printOption(F, o.classifier, printClassifier _)),
        ("features", printISZ(F, o.features, printFeature _)),
        ("subComponents", printISZ(F, o.subComponents, printComponent _)),
        ("connections", printISZ(F, o.connections, printConnection _)),
        ("connectionInstances", printISZ(F, o.connectionInstances, printConnectionInstance _)),
        ("properties", printISZ(F, o.properties, printProperty _)),
        ("flows", printISZ(F, o.flows, printFlow _)),
        ("modes", printISZ(F, o.modes, printMode _)),
        ("annexes", printISZ(F, o.annexes, printAnnex _))
      ))
    }

    @pure def printClassifier(o: Classifier): ST = {
      return printObject(ISZ(
        ("type", st""""Classifier""""),
        ("name", printString(o.name))
      ))
    }

    @pure def printComponentCategoryType(o: ComponentCategory.Type): ST = {
      val value: String = o match {
        case ComponentCategory.Abstract => "Abstract"
        case ComponentCategory.Bus => "Bus"
        case ComponentCategory.Data => "Data"
        case ComponentCategory.Device => "Device"
        case ComponentCategory.Memory => "Memory"
        case ComponentCategory.Process => "Process"
        case ComponentCategory.Processor => "Processor"
        case ComponentCategory.Subprogram => "Subprogram"
        case ComponentCategory.SubprogramGroup => "SubprogramGroup"
        case ComponentCategory.System => "System"
        case ComponentCategory.Thread => "Thread"
        case ComponentCategory.ThreadGroup => "ThreadGroup"
        case ComponentCategory.VirtualBus => "VirtualBus"
        case ComponentCategory.VirtualProcessor => "VirtualProcessor"
      }
      return printObject(ISZ(
        ("type", printString("ComponentCategory")),
        ("value", printString(value))
      ))
    }

    @pure def printFeature(o: Feature): ST = {
      o match {
        case o: FeatureEnd => return printFeatureEnd(o)
        case o: FeatureGroup => return printFeatureGroup(o)
        case o: FeatureAccess => return printFeatureAccess(o)
      }
    }

    @pure def printFeatureEnd(o: FeatureEnd): ST = {
      return printObject(ISZ(
        ("type", st""""FeatureEnd""""),
        ("identifier", printName(o.identifier)),
        ("direction", printDirectionType(o.direction)),
        ("category", printFeatureCategoryType(o.category)),
        ("classifier", printOption(F, o.classifier, printClassifier _)),
        ("properties", printISZ(F, o.properties, printProperty _))
      ))
    }

    @pure def printFeatureGroup(o: FeatureGroup): ST = {
      return printObject(ISZ(
        ("type", st""""FeatureGroup""""),
        ("identifier", printName(o.identifier)),
        ("features", printISZ(F, o.features, printFeature _)),
        ("isInverse", printB(o.isInverse)),
        ("category", printFeatureCategoryType(o.category)),
        ("properties", printISZ(F, o.properties, printProperty _))
      ))
    }

    @pure def printFeatureAccess(o: FeatureAccess): ST = {
      return printObject(ISZ(
        ("type", st""""FeatureAccess""""),
        ("identifier", printName(o.identifier)),
        ("category", printFeatureCategoryType(o.category)),
        ("classifier", printOption(F, o.classifier, printClassifier _)),
        ("accessType", printAccessTypeType(o.accessType)),
        ("accessCategory", printAccessCategoryType(o.accessCategory)),
        ("properties", printISZ(F, o.properties, printProperty _))
      ))
    }

    @pure def printAccessTypeType(o: AccessType.Type): ST = {
      val value: String = o match {
        case AccessType.Provides => "Provides"
        case AccessType.Requires => "Requires"
      }
      return printObject(ISZ(
        ("type", printString("AccessType")),
        ("value", printString(value))
      ))
    }

    @pure def printAccessCategoryType(o: AccessCategory.Type): ST = {
      val value: String = o match {
        case AccessCategory.Bus => "Bus"
        case AccessCategory.Data => "Data"
        case AccessCategory.Subprogram => "Subprogram"
        case AccessCategory.SubprogramGroup => "SubprogramGroup"
        case AccessCategory.VirtualBus => "VirtualBus"
      }
      return printObject(ISZ(
        ("type", printString("AccessCategory")),
        ("value", printString(value))
      ))
    }

    @pure def printDirectionType(o: Direction.Type): ST = {
      val value: String = o match {
        case Direction.In => "In"
        case Direction.Out => "Out"
        case Direction.InOut => "InOut"
        case Direction.None => "None"
      }
      return printObject(ISZ(
        ("type", printString("Direction")),
        ("value", printString(value))
      ))
    }

    @pure def printFeatureCategoryType(o: FeatureCategory.Type): ST = {
      val value: String = o match {
        case FeatureCategory.AbstractFeature => "AbstractFeature"
        case FeatureCategory.BusAccess => "BusAccess"
        case FeatureCategory.DataAccess => "DataAccess"
        case FeatureCategory.DataPort => "DataPort"
        case FeatureCategory.EventPort => "EventPort"
        case FeatureCategory.EventDataPort => "EventDataPort"
        case FeatureCategory.FeatureGroup => "FeatureGroup"
        case FeatureCategory.Parameter => "Parameter"
        case FeatureCategory.SubprogramAccess => "SubprogramAccess"
        case FeatureCategory.SubprogramAccessGroup => "SubprogramAccessGroup"
      }
      return printObject(ISZ(
        ("type", printString("FeatureCategory")),
        ("value", printString(value))
      ))
    }

    @pure def printConnection(o: Connection): ST = {
      return printObject(ISZ(
        ("type", st""""Connection""""),
        ("name", printName(o.name)),
        ("src", printISZ(F, o.src, printEndPoint _)),
        ("dst", printISZ(F, o.dst, printEndPoint _)),
        ("kind", printConnectionKindType(o.kind)),
        ("isBiDirectional", printB(o.isBiDirectional)),
        ("connectionInstances", printISZ(F, o.connectionInstances, printName _)),
        ("properties", printISZ(F, o.properties, printProperty _))
      ))
    }

    @pure def printConnectionInstance(o: ConnectionInstance): ST = {
      return printObject(ISZ(
        ("type", st""""ConnectionInstance""""),
        ("name", printName(o.name)),
        ("src", printEndPoint(o.src)),
        ("dst", printEndPoint(o.dst)),
        ("kind", printConnectionKindType(o.kind)),
        ("connectionRefs", printISZ(F, o.connectionRefs, printConnectionReference _)),
        ("properties", printISZ(F, o.properties, printProperty _))
      ))
    }

    @pure def printConnectionReference(o: ConnectionReference): ST = {
      return printObject(ISZ(
        ("type", st""""ConnectionReference""""),
        ("name", printName(o.name)),
        ("context", printName(o.context)),
        ("isParent", printB(o.isParent))
      ))
    }

    @pure def printConnectionKindType(o: ConnectionKind.Type): ST = {
      val value: String = o match {
        case ConnectionKind.Feature => "Feature"
        case ConnectionKind.Access => "Access"
        case ConnectionKind.Parameter => "Parameter"
        case ConnectionKind.Port => "Port"
        case ConnectionKind.ModeTransition => "ModeTransition"
        case ConnectionKind.FeatureGroup => "FeatureGroup"
      }
      return printObject(ISZ(
        ("type", printString("ConnectionKind")),
        ("value", printString(value))
      ))
    }

    @pure def printEndPoint(o: EndPoint): ST = {
      return printObject(ISZ(
        ("type", st""""EndPoint""""),
        ("component", printName(o.component)),
        ("feature", printOption(F, o.feature, printName _)),
        ("direction", printOption(F, o.direction, printDirectionType _))
      ))
    }

    @pure def printProperty(o: Property): ST = {
      return printObject(ISZ(
        ("type", st""""Property""""),
        ("name", printName(o.name)),
        ("propertyValues", printISZ(F, o.propertyValues, printPropertyValue _))
      ))
    }

    @pure def printPropertyValue(o: PropertyValue): ST = {
      o match {
        case o: ClassifierProp => return printClassifierProp(o)
        case o: RangeProp => return printRangeProp(o)
        case o: RecordProp => return printRecordProp(o)
        case o: ReferenceProp => return printReferenceProp(o)
        case o: UnitProp => return printUnitProp(o)
        case o: ValueProp => return printValueProp(o)
      }
    }

    @pure def printClassifierProp(o: ClassifierProp): ST = {
      return printObject(ISZ(
        ("type", st""""ClassifierProp""""),
        ("name", printString(o.name))
      ))
    }

    @pure def printRangeProp(o: RangeProp): ST = {
      return printObject(ISZ(
        ("type", st""""RangeProp""""),
        ("low", printUnitProp(o.low)),
        ("high", printUnitProp(o.high))
      ))
    }

    @pure def printRecordProp(o: RecordProp): ST = {
      return printObject(ISZ(
        ("type", st""""RecordProp""""),
        ("properties", printISZ(F, o.properties, printProperty _))
      ))
    }

    @pure def printReferenceProp(o: ReferenceProp): ST = {
      return printObject(ISZ(
        ("type", st""""ReferenceProp""""),
        ("value", printName(o.value))
      ))
    }

    @pure def printUnitProp(o: UnitProp): ST = {
      return printObject(ISZ(
        ("type", st""""UnitProp""""),
        ("value", printString(o.value)),
        ("unit", printOption(T, o.unit, printString _))
      ))
    }

    @pure def printValueProp(o: ValueProp): ST = {
      return printObject(ISZ(
        ("type", st""""ValueProp""""),
        ("value", printString(o.value))
      ))
    }

    @pure def printMode(o: Mode): ST = {
      return printObject(ISZ(
        ("type", st""""Mode""""),
        ("name", printName(o.name))
      ))
    }

    @pure def printFlowKindType(o: FlowKind.Type): ST = {
      val value: String = o match {
        case FlowKind.Source => "Source"
        case FlowKind.Sink => "Sink"
        case FlowKind.Path => "Path"
      }
      return printObject(ISZ(
        ("type", printString("FlowKind")),
        ("value", printString(value))
      ))
    }

    @pure def printFlow(o: Flow): ST = {
      return printObject(ISZ(
        ("type", st""""Flow""""),
        ("name", printName(o.name)),
        ("kind", printFlowKindType(o.kind)),
        ("source", printOption(F, o.source, printFeature _)),
        ("sink", printOption(F, o.sink, printFeature _))
      ))
    }

    @pure def printAnnex(o: Annex): ST = {
      return printObject(ISZ(
        ("type", st""""Annex""""),
        ("name", printString(o.name)),
        ("clause", printAnnexClause(o.clause))
      ))
    }

    @pure def printAnnexClause(o: AnnexClause): ST = {
      o match {
        case o: Emv2Library => return printEmv2Library(o)
        case o: Emv2Propagation => return printEmv2Propagation(o)
        case o: Emv2Flow => return printEmv2Flow(o)
        case o: Emv2Clause => return printEmv2Clause(o)
        case o: OtherAnnex => return printOtherAnnex(o)
      }
    }

    @pure def printEmv2Annex(o: Emv2Annex): ST = {
      o match {
        case o: Emv2Library => return printEmv2Library(o)
        case o: Emv2Propagation => return printEmv2Propagation(o)
        case o: Emv2Flow => return printEmv2Flow(o)
        case o: Emv2Clause => return printEmv2Clause(o)
      }
    }

    @pure def printPropagationDirectionType(o: PropagationDirection.Type): ST = {
      val value: String = o match {
        case PropagationDirection.In => "In"
        case PropagationDirection.Out => "Out"
      }
      return printObject(ISZ(
        ("type", printString("PropagationDirection")),
        ("value", printString(value))
      ))
    }

    @pure def printEmv2Library(o: Emv2Library): ST = {
      return printObject(ISZ(
        ("type", st""""Emv2Library""""),
        ("name", printName(o.name)),
        ("useTypes", printISZ(T, o.useTypes, printString _)),
        ("tokens", printISZ(T, o.tokens, printString _)),
        ("alias", printHashMap(T, o.alias, printString _, printString _))
      ))
    }

    @pure def printEmv2Propagation(o: Emv2Propagation): ST = {
      return printObject(ISZ(
        ("type", st""""Emv2Propagation""""),
        ("direction", printPropagationDirectionType(o.direction)),
        ("propagationPoint", printISZ(T, o.propagationPoint, printString _)),
        ("errorTokens", printISZ(T, o.errorTokens, printString _))
      ))
    }

    @pure def printEmv2Flow(o: Emv2Flow): ST = {
      return printObject(ISZ(
        ("type", st""""Emv2Flow""""),
        ("identifier", printName(o.identifier)),
        ("kind", printFlowKindType(o.kind)),
        ("sourcePropagation", printOption(F, o.sourcePropagation, printEmv2Propagation _)),
        ("sinkPropagation", printOption(F, o.sinkPropagation, printEmv2Propagation _))
      ))
    }

    @pure def printEmv2Clause(o: Emv2Clause): ST = {
      return printObject(ISZ(
        ("type", st""""Emv2Clause""""),
        ("libraries", printISZ(T, o.libraries, printString _)),
        ("propagations", printISZ(F, o.propagations, printEmv2Propagation _)),
        ("flows", printISZ(F, o.flows, printEmv2Flow _))
      ))
    }

    @pure def printOtherAnnex(o: OtherAnnex): ST = {
      return printObject(ISZ(
        ("type", st""""OtherAnnex""""),
        ("clause", printString(o.clause))
      ))
    }

  }

  @record class Parser(input: String) {
    val parser: Json.Parser = Json.Parser.create(input)

    def errorOpt: Option[Json.ErrorMsg] = {
      return parser.errorOpt
    }

    def parseAadl(): Aadl = {
      val r = parseAadlT(F)
      return r
    }

    def parseAadlT(typeParsed: B): Aadl = {
      if (!typeParsed) {
        parser.parseObjectType("Aadl")
      }
      parser.parseObjectKey("components")
      val components = parser.parseISZ(parseComponent _)
      parser.parseObjectNext()
      parser.parseObjectKey("errorLib")
      val errorLib = parser.parseISZ(parseEmv2Library _)
      parser.parseObjectNext()
      parser.parseObjectKey("dataComponents")
      val dataComponents = parser.parseISZ(parseComponent _)
      parser.parseObjectNext()
      return Aadl(components, errorLib, dataComponents)
    }

    def parseName(): Name = {
      val r = parseNameT(F)
      return r
    }

    def parseNameT(typeParsed: B): Name = {
      if (!typeParsed) {
        parser.parseObjectType("Name")
      }
      parser.parseObjectKey("name")
      val name = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      return Name(name)
    }

    def parseComponent(): Component = {
      val r = parseComponentT(F)
      return r
    }

    def parseComponentT(typeParsed: B): Component = {
      if (!typeParsed) {
        parser.parseObjectType("Component")
      }
      parser.parseObjectKey("identifier")
      val identifier = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("category")
      val category = parseComponentCategoryType()
      parser.parseObjectNext()
      parser.parseObjectKey("classifier")
      val classifier = parser.parseOption(parseClassifier _)
      parser.parseObjectNext()
      parser.parseObjectKey("features")
      val features = parser.parseISZ(parseFeature _)
      parser.parseObjectNext()
      parser.parseObjectKey("subComponents")
      val subComponents = parser.parseISZ(parseComponent _)
      parser.parseObjectNext()
      parser.parseObjectKey("connections")
      val connections = parser.parseISZ(parseConnection _)
      parser.parseObjectNext()
      parser.parseObjectKey("connectionInstances")
      val connectionInstances = parser.parseISZ(parseConnectionInstance _)
      parser.parseObjectNext()
      parser.parseObjectKey("properties")
      val properties = parser.parseISZ(parseProperty _)
      parser.parseObjectNext()
      parser.parseObjectKey("flows")
      val flows = parser.parseISZ(parseFlow _)
      parser.parseObjectNext()
      parser.parseObjectKey("modes")
      val modes = parser.parseISZ(parseMode _)
      parser.parseObjectNext()
      parser.parseObjectKey("annexes")
      val annexes = parser.parseISZ(parseAnnex _)
      parser.parseObjectNext()
      return Component(identifier, category, classifier, features, subComponents, connections, connectionInstances, properties, flows, modes, annexes)
    }

    def parseClassifier(): Classifier = {
      val r = parseClassifierT(F)
      return r
    }

    def parseClassifierT(typeParsed: B): Classifier = {
      if (!typeParsed) {
        parser.parseObjectType("Classifier")
      }
      parser.parseObjectKey("name")
      val name = parser.parseString()
      parser.parseObjectNext()
      return Classifier(name)
    }

    def parseComponentCategoryType(): ComponentCategory.Type = {
      val r = parseComponentCategoryT(F)
      return r
    }

    def parseComponentCategoryT(typeParsed: B): ComponentCategory.Type = {
      if (!typeParsed) {
        parser.parseObjectType("ComponentCategory")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      ComponentCategory.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for ComponentCategory.")
          return ComponentCategory.byOrdinal(0).get
      }
    }

    def parseFeature(): Feature = {
      val t = parser.parseObjectTypes(ISZ("FeatureEnd", "FeatureGroup", "FeatureAccess"))
      t.native match {
        case "FeatureEnd" => val r = parseFeatureEndT(T); return r
        case "FeatureGroup" => val r = parseFeatureGroupT(T); return r
        case "FeatureAccess" => val r = parseFeatureAccessT(T); return r
        case _ => val r = parseFeatureAccessT(T); return r
      }
    }

    def parseFeatureEnd(): FeatureEnd = {
      val r = parseFeatureEndT(F)
      return r
    }

    def parseFeatureEndT(typeParsed: B): FeatureEnd = {
      if (!typeParsed) {
        parser.parseObjectType("FeatureEnd")
      }
      parser.parseObjectKey("identifier")
      val identifier = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("direction")
      val direction = parseDirectionType()
      parser.parseObjectNext()
      parser.parseObjectKey("category")
      val category = parseFeatureCategoryType()
      parser.parseObjectNext()
      parser.parseObjectKey("classifier")
      val classifier = parser.parseOption(parseClassifier _)
      parser.parseObjectNext()
      parser.parseObjectKey("properties")
      val properties = parser.parseISZ(parseProperty _)
      parser.parseObjectNext()
      return FeatureEnd(identifier, direction, category, classifier, properties)
    }

    def parseFeatureGroup(): FeatureGroup = {
      val r = parseFeatureGroupT(F)
      return r
    }

    def parseFeatureGroupT(typeParsed: B): FeatureGroup = {
      if (!typeParsed) {
        parser.parseObjectType("FeatureGroup")
      }
      parser.parseObjectKey("identifier")
      val identifier = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("features")
      val features = parser.parseISZ(parseFeature _)
      parser.parseObjectNext()
      parser.parseObjectKey("isInverse")
      val isInverse = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("category")
      val category = parseFeatureCategoryType()
      parser.parseObjectNext()
      parser.parseObjectKey("properties")
      val properties = parser.parseISZ(parseProperty _)
      parser.parseObjectNext()
      return FeatureGroup(identifier, features, isInverse, category, properties)
    }

    def parseFeatureAccess(): FeatureAccess = {
      val r = parseFeatureAccessT(F)
      return r
    }

    def parseFeatureAccessT(typeParsed: B): FeatureAccess = {
      if (!typeParsed) {
        parser.parseObjectType("FeatureAccess")
      }
      parser.parseObjectKey("identifier")
      val identifier = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("category")
      val category = parseFeatureCategoryType()
      parser.parseObjectNext()
      parser.parseObjectKey("classifier")
      val classifier = parser.parseOption(parseClassifier _)
      parser.parseObjectNext()
      parser.parseObjectKey("accessType")
      val accessType = parseAccessTypeType()
      parser.parseObjectNext()
      parser.parseObjectKey("accessCategory")
      val accessCategory = parseAccessCategoryType()
      parser.parseObjectNext()
      parser.parseObjectKey("properties")
      val properties = parser.parseISZ(parseProperty _)
      parser.parseObjectNext()
      return FeatureAccess(identifier, category, classifier, accessType, accessCategory, properties)
    }

    def parseAccessTypeType(): AccessType.Type = {
      val r = parseAccessTypeT(F)
      return r
    }

    def parseAccessTypeT(typeParsed: B): AccessType.Type = {
      if (!typeParsed) {
        parser.parseObjectType("AccessType")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      AccessType.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for AccessType.")
          return AccessType.byOrdinal(0).get
      }
    }

    def parseAccessCategoryType(): AccessCategory.Type = {
      val r = parseAccessCategoryT(F)
      return r
    }

    def parseAccessCategoryT(typeParsed: B): AccessCategory.Type = {
      if (!typeParsed) {
        parser.parseObjectType("AccessCategory")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      AccessCategory.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for AccessCategory.")
          return AccessCategory.byOrdinal(0).get
      }
    }

    def parseDirectionType(): Direction.Type = {
      val r = parseDirectionT(F)
      return r
    }

    def parseDirectionT(typeParsed: B): Direction.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Direction")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Direction.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Direction.")
          return Direction.byOrdinal(0).get
      }
    }

    def parseFeatureCategoryType(): FeatureCategory.Type = {
      val r = parseFeatureCategoryT(F)
      return r
    }

    def parseFeatureCategoryT(typeParsed: B): FeatureCategory.Type = {
      if (!typeParsed) {
        parser.parseObjectType("FeatureCategory")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      FeatureCategory.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for FeatureCategory.")
          return FeatureCategory.byOrdinal(0).get
      }
    }

    def parseConnection(): Connection = {
      val r = parseConnectionT(F)
      return r
    }

    def parseConnectionT(typeParsed: B): Connection = {
      if (!typeParsed) {
        parser.parseObjectType("Connection")
      }
      parser.parseObjectKey("name")
      val name = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("src")
      val src = parser.parseISZ(parseEndPoint _)
      parser.parseObjectNext()
      parser.parseObjectKey("dst")
      val dst = parser.parseISZ(parseEndPoint _)
      parser.parseObjectNext()
      parser.parseObjectKey("kind")
      val kind = parseConnectionKindType()
      parser.parseObjectNext()
      parser.parseObjectKey("isBiDirectional")
      val isBiDirectional = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("connectionInstances")
      val connectionInstances = parser.parseISZ(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("properties")
      val properties = parser.parseISZ(parseProperty _)
      parser.parseObjectNext()
      return Connection(name, src, dst, kind, isBiDirectional, connectionInstances, properties)
    }

    def parseConnectionInstance(): ConnectionInstance = {
      val r = parseConnectionInstanceT(F)
      return r
    }

    def parseConnectionInstanceT(typeParsed: B): ConnectionInstance = {
      if (!typeParsed) {
        parser.parseObjectType("ConnectionInstance")
      }
      parser.parseObjectKey("name")
      val name = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("src")
      val src = parseEndPoint()
      parser.parseObjectNext()
      parser.parseObjectKey("dst")
      val dst = parseEndPoint()
      parser.parseObjectNext()
      parser.parseObjectKey("kind")
      val kind = parseConnectionKindType()
      parser.parseObjectNext()
      parser.parseObjectKey("connectionRefs")
      val connectionRefs = parser.parseISZ(parseConnectionReference _)
      parser.parseObjectNext()
      parser.parseObjectKey("properties")
      val properties = parser.parseISZ(parseProperty _)
      parser.parseObjectNext()
      return ConnectionInstance(name, src, dst, kind, connectionRefs, properties)
    }

    def parseConnectionReference(): ConnectionReference = {
      val r = parseConnectionReferenceT(F)
      return r
    }

    def parseConnectionReferenceT(typeParsed: B): ConnectionReference = {
      if (!typeParsed) {
        parser.parseObjectType("ConnectionReference")
      }
      parser.parseObjectKey("name")
      val name = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("context")
      val context = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("isParent")
      val isParent = parser.parseB()
      parser.parseObjectNext()
      return ConnectionReference(name, context, isParent)
    }

    def parseConnectionKindType(): ConnectionKind.Type = {
      val r = parseConnectionKindT(F)
      return r
    }

    def parseConnectionKindT(typeParsed: B): ConnectionKind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("ConnectionKind")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      ConnectionKind.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for ConnectionKind.")
          return ConnectionKind.byOrdinal(0).get
      }
    }

    def parseEndPoint(): EndPoint = {
      val r = parseEndPointT(F)
      return r
    }

    def parseEndPointT(typeParsed: B): EndPoint = {
      if (!typeParsed) {
        parser.parseObjectType("EndPoint")
      }
      parser.parseObjectKey("component")
      val component = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("feature")
      val feature = parser.parseOption(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("direction")
      val direction = parser.parseOption(parseDirectionType _)
      parser.parseObjectNext()
      return EndPoint(component, feature, direction)
    }

    def parseProperty(): Property = {
      val r = parsePropertyT(F)
      return r
    }

    def parsePropertyT(typeParsed: B): Property = {
      if (!typeParsed) {
        parser.parseObjectType("Property")
      }
      parser.parseObjectKey("name")
      val name = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("propertyValues")
      val propertyValues = parser.parseISZ(parsePropertyValue _)
      parser.parseObjectNext()
      return Property(name, propertyValues)
    }

    def parsePropertyValue(): PropertyValue = {
      val t = parser.parseObjectTypes(ISZ("ClassifierProp", "RangeProp", "RecordProp", "ReferenceProp", "UnitProp", "ValueProp"))
      t.native match {
        case "ClassifierProp" => val r = parseClassifierPropT(T); return r
        case "RangeProp" => val r = parseRangePropT(T); return r
        case "RecordProp" => val r = parseRecordPropT(T); return r
        case "ReferenceProp" => val r = parseReferencePropT(T); return r
        case "UnitProp" => val r = parseUnitPropT(T); return r
        case "ValueProp" => val r = parseValuePropT(T); return r
        case _ => val r = parseValuePropT(T); return r
      }
    }

    def parseClassifierProp(): ClassifierProp = {
      val r = parseClassifierPropT(F)
      return r
    }

    def parseClassifierPropT(typeParsed: B): ClassifierProp = {
      if (!typeParsed) {
        parser.parseObjectType("ClassifierProp")
      }
      parser.parseObjectKey("name")
      val name = parser.parseString()
      parser.parseObjectNext()
      return ClassifierProp(name)
    }

    def parseRangeProp(): RangeProp = {
      val r = parseRangePropT(F)
      return r
    }

    def parseRangePropT(typeParsed: B): RangeProp = {
      if (!typeParsed) {
        parser.parseObjectType("RangeProp")
      }
      parser.parseObjectKey("low")
      val low = parseUnitProp()
      parser.parseObjectNext()
      parser.parseObjectKey("high")
      val high = parseUnitProp()
      parser.parseObjectNext()
      return RangeProp(low, high)
    }

    def parseRecordProp(): RecordProp = {
      val r = parseRecordPropT(F)
      return r
    }

    def parseRecordPropT(typeParsed: B): RecordProp = {
      if (!typeParsed) {
        parser.parseObjectType("RecordProp")
      }
      parser.parseObjectKey("properties")
      val properties = parser.parseISZ(parseProperty _)
      parser.parseObjectNext()
      return RecordProp(properties)
    }

    def parseReferenceProp(): ReferenceProp = {
      val r = parseReferencePropT(F)
      return r
    }

    def parseReferencePropT(typeParsed: B): ReferenceProp = {
      if (!typeParsed) {
        parser.parseObjectType("ReferenceProp")
      }
      parser.parseObjectKey("value")
      val value = parseName()
      parser.parseObjectNext()
      return ReferenceProp(value)
    }

    def parseUnitProp(): UnitProp = {
      val r = parseUnitPropT(F)
      return r
    }

    def parseUnitPropT(typeParsed: B): UnitProp = {
      if (!typeParsed) {
        parser.parseObjectType("UnitProp")
      }
      parser.parseObjectKey("value")
      val value = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("unit")
      val unit = parser.parseOption(parser.parseString _)
      parser.parseObjectNext()
      return UnitProp(value, unit)
    }

    def parseValueProp(): ValueProp = {
      val r = parseValuePropT(F)
      return r
    }

    def parseValuePropT(typeParsed: B): ValueProp = {
      if (!typeParsed) {
        parser.parseObjectType("ValueProp")
      }
      parser.parseObjectKey("value")
      val value = parser.parseString()
      parser.parseObjectNext()
      return ValueProp(value)
    }

    def parseMode(): Mode = {
      val r = parseModeT(F)
      return r
    }

    def parseModeT(typeParsed: B): Mode = {
      if (!typeParsed) {
        parser.parseObjectType("Mode")
      }
      parser.parseObjectKey("name")
      val name = parseName()
      parser.parseObjectNext()
      return Mode(name)
    }

    def parseFlowKindType(): FlowKind.Type = {
      val r = parseFlowKindT(F)
      return r
    }

    def parseFlowKindT(typeParsed: B): FlowKind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("FlowKind")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      FlowKind.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for FlowKind.")
          return FlowKind.byOrdinal(0).get
      }
    }

    def parseFlow(): Flow = {
      val r = parseFlowT(F)
      return r
    }

    def parseFlowT(typeParsed: B): Flow = {
      if (!typeParsed) {
        parser.parseObjectType("Flow")
      }
      parser.parseObjectKey("name")
      val name = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("kind")
      val kind = parseFlowKindType()
      parser.parseObjectNext()
      parser.parseObjectKey("source")
      val source = parser.parseOption(parseFeature _)
      parser.parseObjectNext()
      parser.parseObjectKey("sink")
      val sink = parser.parseOption(parseFeature _)
      parser.parseObjectNext()
      return Flow(name, kind, source, sink)
    }

    def parseAnnex(): Annex = {
      val r = parseAnnexT(F)
      return r
    }

    def parseAnnexT(typeParsed: B): Annex = {
      if (!typeParsed) {
        parser.parseObjectType("Annex")
      }
      parser.parseObjectKey("name")
      val name = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("clause")
      val clause = parseAnnexClause()
      parser.parseObjectNext()
      return Annex(name, clause)
    }

    def parseAnnexClause(): AnnexClause = {
      val t = parser.parseObjectTypes(ISZ("Emv2Library", "Emv2Propagation", "Emv2Flow", "Emv2Clause", "OtherAnnex"))
      t.native match {
        case "Emv2Library" => val r = parseEmv2LibraryT(T); return r
        case "Emv2Propagation" => val r = parseEmv2PropagationT(T); return r
        case "Emv2Flow" => val r = parseEmv2FlowT(T); return r
        case "Emv2Clause" => val r = parseEmv2ClauseT(T); return r
        case "OtherAnnex" => val r = parseOtherAnnexT(T); return r
        case _ => val r = parseOtherAnnexT(T); return r
      }
    }

    def parseEmv2Annex(): Emv2Annex = {
      val t = parser.parseObjectTypes(ISZ("Emv2Library", "Emv2Propagation", "Emv2Flow", "Emv2Clause"))
      t.native match {
        case "Emv2Library" => val r = parseEmv2LibraryT(T); return r
        case "Emv2Propagation" => val r = parseEmv2PropagationT(T); return r
        case "Emv2Flow" => val r = parseEmv2FlowT(T); return r
        case "Emv2Clause" => val r = parseEmv2ClauseT(T); return r
        case _ => val r = parseEmv2ClauseT(T); return r
      }
    }

    def parsePropagationDirectionType(): PropagationDirection.Type = {
      val r = parsePropagationDirectionT(F)
      return r
    }

    def parsePropagationDirectionT(typeParsed: B): PropagationDirection.Type = {
      if (!typeParsed) {
        parser.parseObjectType("PropagationDirection")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      PropagationDirection.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for PropagationDirection.")
          return PropagationDirection.byOrdinal(0).get
      }
    }

    def parseEmv2Library(): Emv2Library = {
      val r = parseEmv2LibraryT(F)
      return r
    }

    def parseEmv2LibraryT(typeParsed: B): Emv2Library = {
      if (!typeParsed) {
        parser.parseObjectType("Emv2Library")
      }
      parser.parseObjectKey("name")
      val name = parseName()
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
      return Emv2Library(name, useTypes, tokens, alias)
    }

    def parseEmv2Propagation(): Emv2Propagation = {
      val r = parseEmv2PropagationT(F)
      return r
    }

    def parseEmv2PropagationT(typeParsed: B): Emv2Propagation = {
      if (!typeParsed) {
        parser.parseObjectType("Emv2Propagation")
      }
      parser.parseObjectKey("direction")
      val direction = parsePropagationDirectionType()
      parser.parseObjectNext()
      parser.parseObjectKey("propagationPoint")
      val propagationPoint = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      parser.parseObjectKey("errorTokens")
      val errorTokens = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      return Emv2Propagation(direction, propagationPoint, errorTokens)
    }

    def parseEmv2Flow(): Emv2Flow = {
      val r = parseEmv2FlowT(F)
      return r
    }

    def parseEmv2FlowT(typeParsed: B): Emv2Flow = {
      if (!typeParsed) {
        parser.parseObjectType("Emv2Flow")
      }
      parser.parseObjectKey("identifier")
      val identifier = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("kind")
      val kind = parseFlowKindType()
      parser.parseObjectNext()
      parser.parseObjectKey("sourcePropagation")
      val sourcePropagation = parser.parseOption(parseEmv2Propagation _)
      parser.parseObjectNext()
      parser.parseObjectKey("sinkPropagation")
      val sinkPropagation = parser.parseOption(parseEmv2Propagation _)
      parser.parseObjectNext()
      return Emv2Flow(identifier, kind, sourcePropagation, sinkPropagation)
    }

    def parseEmv2Clause(): Emv2Clause = {
      val r = parseEmv2ClauseT(F)
      return r
    }

    def parseEmv2ClauseT(typeParsed: B): Emv2Clause = {
      if (!typeParsed) {
        parser.parseObjectType("Emv2Clause")
      }
      parser.parseObjectKey("libraries")
      val libraries = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      parser.parseObjectKey("propagations")
      val propagations = parser.parseISZ(parseEmv2Propagation _)
      parser.parseObjectNext()
      parser.parseObjectKey("flows")
      val flows = parser.parseISZ(parseEmv2Flow _)
      parser.parseObjectNext()
      return Emv2Clause(libraries, propagations, flows)
    }

    def parseOtherAnnex(): OtherAnnex = {
      val r = parseOtherAnnexT(F)
      return r
    }

    def parseOtherAnnexT(typeParsed: B): OtherAnnex = {
      if (!typeParsed) {
        parser.parseObjectType("OtherAnnex")
      }
      parser.parseObjectKey("clause")
      val clause = parser.parseString()
      parser.parseObjectNext()
      return OtherAnnex(clause)
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

  def fromAadl(o: Aadl, isCompact: B): String = {
    val st = Printer.printAadl(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toAadl(s: String): Either[Aadl, Json.ErrorMsg] = {
    def fAadl(parser: Parser): Aadl = {
      val r = parser.parseAadl()
      return r
    }
    val r = to(s, fAadl _)
    return r
  }

  def fromName(o: Name, isCompact: B): String = {
    val st = Printer.printName(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toName(s: String): Either[Name, Json.ErrorMsg] = {
    def fName(parser: Parser): Name = {
      val r = parser.parseName()
      return r
    }
    val r = to(s, fName _)
    return r
  }

  def fromComponent(o: Component, isCompact: B): String = {
    val st = Printer.printComponent(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toComponent(s: String): Either[Component, Json.ErrorMsg] = {
    def fComponent(parser: Parser): Component = {
      val r = parser.parseComponent()
      return r
    }
    val r = to(s, fComponent _)
    return r
  }

  def fromClassifier(o: Classifier, isCompact: B): String = {
    val st = Printer.printClassifier(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toClassifier(s: String): Either[Classifier, Json.ErrorMsg] = {
    def fClassifier(parser: Parser): Classifier = {
      val r = parser.parseClassifier()
      return r
    }
    val r = to(s, fClassifier _)
    return r
  }

  def fromFeature(o: Feature, isCompact: B): String = {
    val st = Printer.printFeature(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFeature(s: String): Either[Feature, Json.ErrorMsg] = {
    def fFeature(parser: Parser): Feature = {
      val r = parser.parseFeature()
      return r
    }
    val r = to(s, fFeature _)
    return r
  }

  def fromFeatureEnd(o: FeatureEnd, isCompact: B): String = {
    val st = Printer.printFeatureEnd(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFeatureEnd(s: String): Either[FeatureEnd, Json.ErrorMsg] = {
    def fFeatureEnd(parser: Parser): FeatureEnd = {
      val r = parser.parseFeatureEnd()
      return r
    }
    val r = to(s, fFeatureEnd _)
    return r
  }

  def fromFeatureGroup(o: FeatureGroup, isCompact: B): String = {
    val st = Printer.printFeatureGroup(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFeatureGroup(s: String): Either[FeatureGroup, Json.ErrorMsg] = {
    def fFeatureGroup(parser: Parser): FeatureGroup = {
      val r = parser.parseFeatureGroup()
      return r
    }
    val r = to(s, fFeatureGroup _)
    return r
  }

  def fromFeatureAccess(o: FeatureAccess, isCompact: B): String = {
    val st = Printer.printFeatureAccess(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFeatureAccess(s: String): Either[FeatureAccess, Json.ErrorMsg] = {
    def fFeatureAccess(parser: Parser): FeatureAccess = {
      val r = parser.parseFeatureAccess()
      return r
    }
    val r = to(s, fFeatureAccess _)
    return r
  }

  def fromConnection(o: Connection, isCompact: B): String = {
    val st = Printer.printConnection(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toConnection(s: String): Either[Connection, Json.ErrorMsg] = {
    def fConnection(parser: Parser): Connection = {
      val r = parser.parseConnection()
      return r
    }
    val r = to(s, fConnection _)
    return r
  }

  def fromConnectionInstance(o: ConnectionInstance, isCompact: B): String = {
    val st = Printer.printConnectionInstance(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toConnectionInstance(s: String): Either[ConnectionInstance, Json.ErrorMsg] = {
    def fConnectionInstance(parser: Parser): ConnectionInstance = {
      val r = parser.parseConnectionInstance()
      return r
    }
    val r = to(s, fConnectionInstance _)
    return r
  }

  def fromConnectionReference(o: ConnectionReference, isCompact: B): String = {
    val st = Printer.printConnectionReference(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toConnectionReference(s: String): Either[ConnectionReference, Json.ErrorMsg] = {
    def fConnectionReference(parser: Parser): ConnectionReference = {
      val r = parser.parseConnectionReference()
      return r
    }
    val r = to(s, fConnectionReference _)
    return r
  }

  def fromEndPoint(o: EndPoint, isCompact: B): String = {
    val st = Printer.printEndPoint(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEndPoint(s: String): Either[EndPoint, Json.ErrorMsg] = {
    def fEndPoint(parser: Parser): EndPoint = {
      val r = parser.parseEndPoint()
      return r
    }
    val r = to(s, fEndPoint _)
    return r
  }

  def fromProperty(o: Property, isCompact: B): String = {
    val st = Printer.printProperty(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProperty(s: String): Either[Property, Json.ErrorMsg] = {
    def fProperty(parser: Parser): Property = {
      val r = parser.parseProperty()
      return r
    }
    val r = to(s, fProperty _)
    return r
  }

  def fromPropertyValue(o: PropertyValue, isCompact: B): String = {
    val st = Printer.printPropertyValue(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPropertyValue(s: String): Either[PropertyValue, Json.ErrorMsg] = {
    def fPropertyValue(parser: Parser): PropertyValue = {
      val r = parser.parsePropertyValue()
      return r
    }
    val r = to(s, fPropertyValue _)
    return r
  }

  def fromClassifierProp(o: ClassifierProp, isCompact: B): String = {
    val st = Printer.printClassifierProp(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toClassifierProp(s: String): Either[ClassifierProp, Json.ErrorMsg] = {
    def fClassifierProp(parser: Parser): ClassifierProp = {
      val r = parser.parseClassifierProp()
      return r
    }
    val r = to(s, fClassifierProp _)
    return r
  }

  def fromRangeProp(o: RangeProp, isCompact: B): String = {
    val st = Printer.printRangeProp(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toRangeProp(s: String): Either[RangeProp, Json.ErrorMsg] = {
    def fRangeProp(parser: Parser): RangeProp = {
      val r = parser.parseRangeProp()
      return r
    }
    val r = to(s, fRangeProp _)
    return r
  }

  def fromRecordProp(o: RecordProp, isCompact: B): String = {
    val st = Printer.printRecordProp(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toRecordProp(s: String): Either[RecordProp, Json.ErrorMsg] = {
    def fRecordProp(parser: Parser): RecordProp = {
      val r = parser.parseRecordProp()
      return r
    }
    val r = to(s, fRecordProp _)
    return r
  }

  def fromReferenceProp(o: ReferenceProp, isCompact: B): String = {
    val st = Printer.printReferenceProp(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toReferenceProp(s: String): Either[ReferenceProp, Json.ErrorMsg] = {
    def fReferenceProp(parser: Parser): ReferenceProp = {
      val r = parser.parseReferenceProp()
      return r
    }
    val r = to(s, fReferenceProp _)
    return r
  }

  def fromUnitProp(o: UnitProp, isCompact: B): String = {
    val st = Printer.printUnitProp(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toUnitProp(s: String): Either[UnitProp, Json.ErrorMsg] = {
    def fUnitProp(parser: Parser): UnitProp = {
      val r = parser.parseUnitProp()
      return r
    }
    val r = to(s, fUnitProp _)
    return r
  }

  def fromValueProp(o: ValueProp, isCompact: B): String = {
    val st = Printer.printValueProp(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toValueProp(s: String): Either[ValueProp, Json.ErrorMsg] = {
    def fValueProp(parser: Parser): ValueProp = {
      val r = parser.parseValueProp()
      return r
    }
    val r = to(s, fValueProp _)
    return r
  }

  def fromMode(o: Mode, isCompact: B): String = {
    val st = Printer.printMode(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMode(s: String): Either[Mode, Json.ErrorMsg] = {
    def fMode(parser: Parser): Mode = {
      val r = parser.parseMode()
      return r
    }
    val r = to(s, fMode _)
    return r
  }

  def fromFlow(o: Flow, isCompact: B): String = {
    val st = Printer.printFlow(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFlow(s: String): Either[Flow, Json.ErrorMsg] = {
    def fFlow(parser: Parser): Flow = {
      val r = parser.parseFlow()
      return r
    }
    val r = to(s, fFlow _)
    return r
  }

  def fromAnnex(o: Annex, isCompact: B): String = {
    val st = Printer.printAnnex(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toAnnex(s: String): Either[Annex, Json.ErrorMsg] = {
    def fAnnex(parser: Parser): Annex = {
      val r = parser.parseAnnex()
      return r
    }
    val r = to(s, fAnnex _)
    return r
  }

  def fromAnnexClause(o: AnnexClause, isCompact: B): String = {
    val st = Printer.printAnnexClause(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toAnnexClause(s: String): Either[AnnexClause, Json.ErrorMsg] = {
    def fAnnexClause(parser: Parser): AnnexClause = {
      val r = parser.parseAnnexClause()
      return r
    }
    val r = to(s, fAnnexClause _)
    return r
  }

  def fromEmv2Annex(o: Emv2Annex, isCompact: B): String = {
    val st = Printer.printEmv2Annex(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEmv2Annex(s: String): Either[Emv2Annex, Json.ErrorMsg] = {
    def fEmv2Annex(parser: Parser): Emv2Annex = {
      val r = parser.parseEmv2Annex()
      return r
    }
    val r = to(s, fEmv2Annex _)
    return r
  }

  def fromEmv2Library(o: Emv2Library, isCompact: B): String = {
    val st = Printer.printEmv2Library(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEmv2Library(s: String): Either[Emv2Library, Json.ErrorMsg] = {
    def fEmv2Library(parser: Parser): Emv2Library = {
      val r = parser.parseEmv2Library()
      return r
    }
    val r = to(s, fEmv2Library _)
    return r
  }

  def fromEmv2Propagation(o: Emv2Propagation, isCompact: B): String = {
    val st = Printer.printEmv2Propagation(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEmv2Propagation(s: String): Either[Emv2Propagation, Json.ErrorMsg] = {
    def fEmv2Propagation(parser: Parser): Emv2Propagation = {
      val r = parser.parseEmv2Propagation()
      return r
    }
    val r = to(s, fEmv2Propagation _)
    return r
  }

  def fromEmv2Flow(o: Emv2Flow, isCompact: B): String = {
    val st = Printer.printEmv2Flow(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEmv2Flow(s: String): Either[Emv2Flow, Json.ErrorMsg] = {
    def fEmv2Flow(parser: Parser): Emv2Flow = {
      val r = parser.parseEmv2Flow()
      return r
    }
    val r = to(s, fEmv2Flow _)
    return r
  }

  def fromEmv2Clause(o: Emv2Clause, isCompact: B): String = {
    val st = Printer.printEmv2Clause(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEmv2Clause(s: String): Either[Emv2Clause, Json.ErrorMsg] = {
    def fEmv2Clause(parser: Parser): Emv2Clause = {
      val r = parser.parseEmv2Clause()
      return r
    }
    val r = to(s, fEmv2Clause _)
    return r
  }

  def fromOtherAnnex(o: OtherAnnex, isCompact: B): String = {
    val st = Printer.printOtherAnnex(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOtherAnnex(s: String): Either[OtherAnnex, Json.ErrorMsg] = {
    def fOtherAnnex(parser: Parser): OtherAnnex = {
      val r = parser.parseOtherAnnex()
      return r
    }
    val r = to(s, fOtherAnnex _)
    return r
  }

}