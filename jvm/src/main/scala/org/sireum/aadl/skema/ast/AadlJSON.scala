// #Sireum
// @formatter:off

// This file is auto-generated from AadlAST.scala

package org.sireum.aadl.skema.ast

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printAadl(o: Aadl): ST = {
      return printObject(ISZ(
        ("type", st""""Aadl""""),
        ("components", printISZ(F, o.components, printComponent)),
        ("errorLib", printISZ(F, o.errorLib, printEmv2Library))
      ))
    }

    @pure def printName(o: Name): ST = {
      return printObject(ISZ(
        ("type", st""""Name""""),
        ("name", printISZ(T, o.name, printString))
      ))
    }

    @pure def printComponent(o: Component): ST = {
      return printObject(ISZ(
        ("type", st""""Component""""),
        ("identifier", printName(o.identifier)),
        ("category", printComponentCategory(o.category)),
        ("classifier", printOption(o.classifier, printClassifier)),
        ("features", printISZ(F, o.features, printFeature)),
        ("subComponents", printISZ(F, o.subComponents, printComponent)),
        ("connections", printISZ(F, o.connections, printConnection)),
        ("connectionInstances", printISZ(F, o.connectionInstances, printConnectionInstance)),
        ("properties", printISZ(F, o.properties, printProperty)),
        ("flows", printISZ(F, o.flows, printFlow)),
        ("modes", printISZ(F, o.modes, printMode)),
        ("annexes", printISZ(F, o.annexes, printAnnex))
      ))
    }

    @pure def printClassifier(o: Classifier): ST = {
      return printObject(ISZ(
        ("type", st""""Classifier""""),
        ("name", printString(o.name))
      ))
    }

    @pure def printComponentCategory(o: ComponentCategory.Type): ST = {
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
      return printObject(ISZ(
        ("type", st""""Feature""""),
        ("identifier", printName(o.identifier)),
        ("direction", printDirection(o.direction)),
        ("category", printFeatureCategory(o.category)),
        ("classifier", printOption(o.classifier, printClassifier)),
        ("properties", printISZ(F, o.properties, printProperty))
      ))
    }

    @pure def printDirection(o: Direction.Type): ST = {
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

    @pure def printFeatureCategory(o: FeatureCategory.Type): ST = {
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
        ("src", printEndPoint(o.src)),
        ("dst", printEndPoint(o.dst)),
        ("isBiDirectional", printB(o.isBiDirectional)),
        ("connectionInstances", printName(o.connectionInstances)),
        ("properties", printISZ(F, o.properties, printProperty))
      ))
    }

    @pure def printConnectionInstance(o: ConnectionInstance): ST = {
      return printObject(ISZ(
        ("type", st""""ConnectionInstance""""),
        ("name", printName(o.name)),
        ("src", printEndPoint(o.src)),
        ("dst", printEndPoint(o.dst)),
        ("kind", printConnectionKind(o.kind)),
        ("connectionRefs", printISZ(F, o.connectionRefs, printConnectionReference)),
        ("properties", printISZ(F, o.properties, printProperty))
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

    @pure def printConnectionKind(o: ConnectionKind.Type): ST = {
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
        ("feature", printName(o.feature))
      ))
    }

    @pure def printProperty(o: Property): ST = {
      return printObject(ISZ(
        ("type", st""""Property""""),
        ("name", printName(o.name)),
        ("propertyValues", printISZ(F, o.propertyValues, printPropertyValue))
      ))
    }

    @pure def printPropertyValue(o: PropertyValue): ST = {
      o match {
        case o: ClassifierProp => return printClassifierProp(o)
        case o: RangeProp => return printRangeProp(o)
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
        ("ValueLow", printString(o.ValueLow)),
        ("ValueHigh", printString(o.ValueHigh)),
        ("Unit", printOption(o.Unit, printString))
      ))
    }

    @pure def printReferenceProp(o: ReferenceProp): ST = {
      return printObject(ISZ(
        ("type", st""""ReferenceProp""""),
        ("value", printString(o.value))
      ))
    }

    @pure def printUnitProp(o: UnitProp): ST = {
      return printObject(ISZ(
        ("type", st""""UnitProp""""),
        ("value", printString(o.value)),
        ("unit", printString(o.unit))
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

    @pure def printFlowKind(o: FlowKind.Type): ST = {
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
        ("kind", printFlowKind(o.kind)),
        ("source", printOption(o.source, printString)),
        ("sink", printOption(o.sink, printString))
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

    @pure def printPropagationDirection(o: PropagationDirection.Type): ST = {
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
        ("tokens", printISZ(T, o.tokens, printString))
      ))
    }

    @pure def printEmv2Propagation(o: Emv2Propagation): ST = {
      return printObject(ISZ(
        ("type", st""""Emv2Propagation""""),
        ("direction", printPropagationDirection(o.direction)),
        ("propagationPoint", printISZ(T, o.propagationPoint, printString)),
        ("errorTokens", printISZ(T, o.errorTokens, printString))
      ))
    }

    @pure def printEmv2Flow(o: Emv2Flow): ST = {
      return printObject(ISZ(
        ("type", st""""Emv2Flow""""),
        ("identifier", printName(o.identifier)),
        ("kind", printFlowKind(o.kind)),
        ("sourcePropagation", printOption(o.sourcePropagation, printEmv2Propagation)),
        ("sinkPropagation", printOption(o.sinkPropagation, printEmv2Propagation))
      ))
    }

    @pure def printEmv2Clause(o: Emv2Clause): ST = {
      return printObject(ISZ(
        ("type", st""""Emv2Clause""""),
        ("libraries", printISZ(T, o.libraries, printString)),
        ("propagations", printISZ(F, o.propagations, printEmv2Propagation)),
        ("flows", printISZ(F, o.flows, printEmv2Flow))
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
      return Aadl(components, errorLib)
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
      val category = parseComponentCategory()
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

    def parseComponentCategory(): ComponentCategory.Type = {
      val r = parseComponentCategoryT(F)
      return r
    }

    def parseComponentCategoryT(typeParsed: B): ComponentCategory.Type = {
      if (!typeParsed) {
        parser.parseObjectType("ComponentCategory")
      }
      parser.parseObjectKey("value")
      val s = parser.parseString()
      parser.parseObjectNext()
      s.native match {
        case "Abstract" => return ComponentCategory.Abstract
        case "Bus" => return ComponentCategory.Bus
        case "Data" => return ComponentCategory.Data
        case "Device" => return ComponentCategory.Device
        case "Memory" => return ComponentCategory.Memory
        case "Process" => return ComponentCategory.Process
        case "Processor" => return ComponentCategory.Processor
        case "Subprogram" => return ComponentCategory.Subprogram
        case "SubprogramGroup" => return ComponentCategory.SubprogramGroup
        case "System" => return ComponentCategory.System
        case "Thread" => return ComponentCategory.Thread
        case "ThreadGroup" => return ComponentCategory.ThreadGroup
        case "VirtualBus" => return ComponentCategory.VirtualBus
        case "VirtualProcessor" => return ComponentCategory.VirtualProcessor
        case _ => halt(parser.errorMessage)
      }
    }

    def parseFeature(): Feature = {
      val r = parseFeatureT(F)
      return r
    }

    def parseFeatureT(typeParsed: B): Feature = {
      if (!typeParsed) {
        parser.parseObjectType("Feature")
      }
      parser.parseObjectKey("identifier")
      val identifier = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("direction")
      val direction = parseDirection()
      parser.parseObjectNext()
      parser.parseObjectKey("category")
      val category = parseFeatureCategory()
      parser.parseObjectNext()
      parser.parseObjectKey("classifier")
      val classifier = parser.parseOption(parseClassifier _)
      parser.parseObjectNext()
      parser.parseObjectKey("properties")
      val properties = parser.parseISZ(parseProperty _)
      parser.parseObjectNext()
      return Feature(identifier, direction, category, classifier, properties)
    }

    def parseDirection(): Direction.Type = {
      val r = parseDirectionT(F)
      return r
    }

    def parseDirectionT(typeParsed: B): Direction.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Direction")
      }
      parser.parseObjectKey("value")
      val s = parser.parseString()
      parser.parseObjectNext()
      s.native match {
        case "In" => return Direction.In
        case "Out" => return Direction.Out
        case "InOut" => return Direction.InOut
        case "None" => return Direction.None
        case _ => halt(parser.errorMessage)
      }
    }

    def parseFeatureCategory(): FeatureCategory.Type = {
      val r = parseFeatureCategoryT(F)
      return r
    }

    def parseFeatureCategoryT(typeParsed: B): FeatureCategory.Type = {
      if (!typeParsed) {
        parser.parseObjectType("FeatureCategory")
      }
      parser.parseObjectKey("value")
      val s = parser.parseString()
      parser.parseObjectNext()
      s.native match {
        case "AbstractFeature" => return FeatureCategory.AbstractFeature
        case "BusAccess" => return FeatureCategory.BusAccess
        case "DataAccess" => return FeatureCategory.DataAccess
        case "DataPort" => return FeatureCategory.DataPort
        case "EventPort" => return FeatureCategory.EventPort
        case "EventDataPort" => return FeatureCategory.EventDataPort
        case "FeatureGroup" => return FeatureCategory.FeatureGroup
        case "Parameter" => return FeatureCategory.Parameter
        case "SubprogramAccess" => return FeatureCategory.SubprogramAccess
        case "SubprogramAccessGroup" => return FeatureCategory.SubprogramAccessGroup
        case _ => halt(parser.errorMessage)
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
      val src = parseEndPoint()
      parser.parseObjectNext()
      parser.parseObjectKey("dst")
      val dst = parseEndPoint()
      parser.parseObjectNext()
      parser.parseObjectKey("isBiDirectional")
      val isBiDirectional = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("connectionInstances")
      val connectionInstances = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("properties")
      val properties = parser.parseISZ(parseProperty _)
      parser.parseObjectNext()
      return Connection(name, src, dst, isBiDirectional, connectionInstances, properties)
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
      val kind = parseConnectionKind()
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

    def parseConnectionKind(): ConnectionKind.Type = {
      val r = parseConnectionKindT(F)
      return r
    }

    def parseConnectionKindT(typeParsed: B): ConnectionKind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("ConnectionKind")
      }
      parser.parseObjectKey("value")
      val s = parser.parseString()
      parser.parseObjectNext()
      s.native match {
        case "Feature" => return ConnectionKind.Feature
        case "Access" => return ConnectionKind.Access
        case "Parameter" => return ConnectionKind.Parameter
        case "Port" => return ConnectionKind.Port
        case "ModeTransition" => return ConnectionKind.ModeTransition
        case "FeatureGroup" => return ConnectionKind.FeatureGroup
        case _ => halt(parser.errorMessage)
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
      val feature = parseName()
      parser.parseObjectNext()
      return EndPoint(component, feature)
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
      val t = parser.parseObjectTypes(ISZ("ClassifierProp", "RangeProp", "ReferenceProp", "UnitProp", "ValueProp"))
      t.native match {
        case "ClassifierProp" => val r = parseClassifierPropT(T); return r
        case "RangeProp" => val r = parseRangePropT(T); return r
        case "ReferenceProp" => val r = parseReferencePropT(T); return r
        case "UnitProp" => val r = parseUnitPropT(T); return r
        case "ValueProp" => val r = parseValuePropT(T); return r
        case _ => halt(parser.errorMessage)
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
      parser.parseObjectKey("ValueLow")
      val ValueLow = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("ValueHigh")
      val ValueHigh = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("Unit")
      val Unit = parser.parseOption(parser.parseString _)
      parser.parseObjectNext()
      return RangeProp(ValueLow, ValueHigh, Unit)
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
      val value = parser.parseString()
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
      val unit = parser.parseString()
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

    def parseFlowKind(): FlowKind.Type = {
      val r = parseFlowKindT(F)
      return r
    }

    def parseFlowKindT(typeParsed: B): FlowKind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("FlowKind")
      }
      parser.parseObjectKey("value")
      val s = parser.parseString()
      parser.parseObjectNext()
      s.native match {
        case "Source" => return FlowKind.Source
        case "Sink" => return FlowKind.Sink
        case "Path" => return FlowKind.Path
        case _ => halt(parser.errorMessage)
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
      val kind = parseFlowKind()
      parser.parseObjectNext()
      parser.parseObjectKey("source")
      val source = parser.parseOption(parser.parseString _)
      parser.parseObjectNext()
      parser.parseObjectKey("sink")
      val sink = parser.parseOption(parser.parseString _)
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
        case _ => halt(parser.errorMessage)
      }
    }

    def parseEmv2Annex(): Emv2Annex = {
      val t = parser.parseObjectTypes(ISZ("Emv2Library", "Emv2Propagation", "Emv2Flow", "Emv2Clause"))
      t.native match {
        case "Emv2Library" => val r = parseEmv2LibraryT(T); return r
        case "Emv2Propagation" => val r = parseEmv2PropagationT(T); return r
        case "Emv2Flow" => val r = parseEmv2FlowT(T); return r
        case "Emv2Clause" => val r = parseEmv2ClauseT(T); return r
        case _ => halt(parser.errorMessage)
      }
    }

    def parsePropagationDirection(): PropagationDirection.Type = {
      val r = parsePropagationDirectionT(F)
      return r
    }

    def parsePropagationDirectionT(typeParsed: B): PropagationDirection.Type = {
      if (!typeParsed) {
        parser.parseObjectType("PropagationDirection")
      }
      parser.parseObjectKey("value")
      val s = parser.parseString()
      parser.parseObjectNext()
      s.native match {
        case "In" => return PropagationDirection.In
        case "Out" => return PropagationDirection.Out
        case _ => halt(parser.errorMessage)
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
      parser.parseObjectKey("tokens")
      val tokens = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      return Emv2Library(name, tokens)
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
      val direction = parsePropagationDirection()
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
      val kind = parseFlowKind()
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

    def errorOpt: Option[Json.ErrorMsg] = {
      return parser.errorOpt
    }

  }

  def to[T](s: String, f: Parser => T): T = {
    val parser = Parser(s)
    val r = f(parser)
    parser.eof()
    return r
  }

  def fromAadl(o: Aadl, isCompact: B): String = {
    val st = Printer.printAadl(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toAadl(s: String): Aadl = {
    def fAadl(parser: Parser): Aadl = {
      val r = parser.parseAadl()
      return r
    }

    val r = to(s, fAadl)
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

  def toName(s: String): Name = {
    def fName(parser: Parser): Name = {
      val r = parser.parseName()
      return r
    }
    val r = to(s, fName)
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

  def toComponent(s: String): Component = {
    def fComponent(parser: Parser): Component = {
      val r = parser.parseComponent()
      return r
    }
    val r = to(s, fComponent)
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

  def toClassifier(s: String): Classifier = {
    def fClassifier(parser: Parser): Classifier = {
      val r = parser.parseClassifier()
      return r
    }
    val r = to(s, fClassifier)
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

  def toFeature(s: String): Feature = {
    def fFeature(parser: Parser): Feature = {
      val r = parser.parseFeature()
      return r
    }
    val r = to(s, fFeature)
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

  def toConnection(s: String): Connection = {
    def fConnection(parser: Parser): Connection = {
      val r = parser.parseConnection()
      return r
    }
    val r = to(s, fConnection)
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

  def toConnectionInstance(s: String): ConnectionInstance = {
    def fConnectionInstance(parser: Parser): ConnectionInstance = {
      val r = parser.parseConnectionInstance()
      return r
    }
    val r = to(s, fConnectionInstance)
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

  def toConnectionReference(s: String): ConnectionReference = {
    def fConnectionReference(parser: Parser): ConnectionReference = {
      val r = parser.parseConnectionReference()
      return r
    }
    val r = to(s, fConnectionReference)
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

  def toEndPoint(s: String): EndPoint = {
    def fEndPoint(parser: Parser): EndPoint = {
      val r = parser.parseEndPoint()
      return r
    }
    val r = to(s, fEndPoint)
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

  def toProperty(s: String): Property = {
    def fProperty(parser: Parser): Property = {
      val r = parser.parseProperty()
      return r
    }
    val r = to(s, fProperty)
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

  def toPropertyValue(s: String): PropertyValue = {
    def fPropertyValue(parser: Parser): PropertyValue = {
      val r = parser.parsePropertyValue()
      return r
    }
    val r = to(s, fPropertyValue)
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

  def toClassifierProp(s: String): ClassifierProp = {
    def fClassifierProp(parser: Parser): ClassifierProp = {
      val r = parser.parseClassifierProp()
      return r
    }
    val r = to(s, fClassifierProp)
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

  def toRangeProp(s: String): RangeProp = {
    def fRangeProp(parser: Parser): RangeProp = {
      val r = parser.parseRangeProp()
      return r
    }
    val r = to(s, fRangeProp)
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

  def toReferenceProp(s: String): ReferenceProp = {
    def fReferenceProp(parser: Parser): ReferenceProp = {
      val r = parser.parseReferenceProp()
      return r
    }
    val r = to(s, fReferenceProp)
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

  def toUnitProp(s: String): UnitProp = {
    def fUnitProp(parser: Parser): UnitProp = {
      val r = parser.parseUnitProp()
      return r
    }
    val r = to(s, fUnitProp)
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

  def toValueProp(s: String): ValueProp = {
    def fValueProp(parser: Parser): ValueProp = {
      val r = parser.parseValueProp()
      return r
    }
    val r = to(s, fValueProp)
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

  def toMode(s: String): Mode = {
    def fMode(parser: Parser): Mode = {
      val r = parser.parseMode()
      return r
    }
    val r = to(s, fMode)
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

  def toFlow(s: String): Flow = {
    def fFlow(parser: Parser): Flow = {
      val r = parser.parseFlow()
      return r
    }
    val r = to(s, fFlow)
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

  def toAnnex(s: String): Annex = {
    def fAnnex(parser: Parser): Annex = {
      val r = parser.parseAnnex()
      return r
    }
    val r = to(s, fAnnex)
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

  def toAnnexClause(s: String): AnnexClause = {
    def fAnnexClause(parser: Parser): AnnexClause = {
      val r = parser.parseAnnexClause()
      return r
    }
    val r = to(s, fAnnexClause)
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

  def toEmv2Annex(s: String): Emv2Annex = {
    def fEmv2Annex(parser: Parser): Emv2Annex = {
      val r = parser.parseEmv2Annex()
      return r
    }
    val r = to(s, fEmv2Annex)
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

  def toEmv2Library(s: String): Emv2Library = {
    def fEmv2Library(parser: Parser): Emv2Library = {
      val r = parser.parseEmv2Library()
      return r
    }
    val r = to(s, fEmv2Library)
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

  def toEmv2Propagation(s: String): Emv2Propagation = {
    def fEmv2Propagation(parser: Parser): Emv2Propagation = {
      val r = parser.parseEmv2Propagation()
      return r
    }
    val r = to(s, fEmv2Propagation)
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

  def toEmv2Flow(s: String): Emv2Flow = {
    def fEmv2Flow(parser: Parser): Emv2Flow = {
      val r = parser.parseEmv2Flow()
      return r
    }
    val r = to(s, fEmv2Flow)
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

  def toEmv2Clause(s: String): Emv2Clause = {
    def fEmv2Clause(parser: Parser): Emv2Clause = {
      val r = parser.parseEmv2Clause()
      return r
    }
    val r = to(s, fEmv2Clause)
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

  def toOtherAnnex(s: String): OtherAnnex = {
    def fOtherAnnex(parser: Parser): OtherAnnex = {
      val r = parser.parseOtherAnnex()
      return r
    }
    val r = to(s, fOtherAnnex)
    return r
  }

}