// #Sireum
// @formatter:off

// This file is auto-generated from AadlAST.scala

package org.sireum.aadl.ast

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printMyTop(o: MyTop): ST = {
      o match {
        case o: AadlXml => return printAadlXml(o)
        case o: Component => return printComponent(o)
        case o: Classifier => return printClassifier(o)
        case o: Feature => return printFeature(o)
        case o: Connection => return printConnection(o)
        case o: EndPoint => return printEndPoint(o)
        case o: Property => return printProperty(o)
        case o: Mode => return printMode(o)
        case o: Flow => return printFlow(o)
        case o: Annex => return printAnnex(o)
      }
    }

    @pure def printAadlXml(o: AadlXml): ST = {
      return printObject(ISZ(
        ("type", st""""AadlXml""""),
        ("components", printISZ(T, o.components, printString))
      ))
    }

    @pure def printComponent(o: Component): ST = {
      return printObject(ISZ(
        ("type", st""""Component""""),
        ("identifier", printString(o.identifier)),
        ("category", printComponentCategory(o.category)),
        ("classifier", printClassifier(o.classifier)),
        ("features", printISZ(F, o.features, printFeature)),
        ("subComponents", printISZ(F, o.subComponents, printComponent)),
        ("connections", printISZ(F, o.connections, printConnection)),
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
        ("identifier", printString(o.identifier)),
        ("direction", printDirection(o.direction)),
        ("category", printFeatureCategory(o.category)),
        ("classifier", printClassifier(o.classifier)),
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
        ("name", printString(o.name)),
        ("src", printEndPoint(o.src)),
        ("dst", printEndPoint(o.dst)),
        ("properties", printISZ(F, o.properties, printProperty))
      ))
    }

    @pure def printEndPoint(o: EndPoint): ST = {
      return printObject(ISZ(
        ("type", st""""EndPoint""""),
        ("component", printString(o.component)),
        ("feature", printString(o.feature))
      ))
    }

    @pure def printProperty(o: Property): ST = {
      return printObject(ISZ(
        ("type", st""""Property""""),
        ("name", printString(o.name)),
        ("propertyValues", printISZ(F, o.propertyValues, printPropertyValue))
      ))
    }

    @pure def printPropertyValue(o: PropertyValue): ST = {
      o match {
        case o: ClassifierProp => return printClassifierProp(o)
        case o: UnitProp => return printUnitProp(o)
        case o: RangeProp => return printRangeProp(o)
      }
    }

    @pure def printClassifierProp(o: ClassifierProp): ST = {
      return printObject(ISZ(
        ("type", st""""ClassifierProp""""),
        ("name", printString(o.name))
      ))
    }

    @pure def printUnitProp(o: UnitProp): ST = {
      return printObject(ISZ(
        ("type", st""""UnitProp""""),
        ("value", printString(o.value)),
        ("unit", printString(o.unit))
      ))
    }

    @pure def printRangeProp(o: RangeProp): ST = {
      return printObject(ISZ(
        ("type", st""""RangeProp""""),
        ("ValueLow", printString(o.ValueLow)),
        ("ValueHigh", printString(o.ValueHigh)),
        ("Unit", printString(o.Unit))
      ))
    }

    @pure def printMode(o: Mode): ST = {
      return printObject(ISZ(
        ("type", st""""Mode""""),
        ("name", printString(o.name))
      ))
    }

    @pure def printFlow(o: Flow): ST = {
      return printObject(ISZ(
        ("type", st""""Flow""""),
        ("name", printString(o.name))
      ))
    }

    @pure def printAnnex(o: Annex): ST = {
      return printObject(ISZ(
        ("type", st""""Annex""""),
        ("name", printString(o.name))
      ))
    }

  }

  @record class Parser(input: String) {
    val parser: Json.Parser = Json.Parser.create(input)

    def parseMyTop(): MyTop = {
      val t = parser.parseObjectTypes(ISZ("AadlXml", "Component", "Classifier", "Feature", "Connection", "EndPoint", "Property", "Mode", "Flow", "Annex"))
      t match {
        case "AadlXml" => val r = parseAadlXmlT(T); return r
        case "Component" => val r = parseComponentT(T); return r
        case "Classifier" => val r = parseClassifierT(T); return r
        case "Feature" => val r = parseFeatureT(T); return r
        case "Connection" => val r = parseConnectionT(T); return r
        case "EndPoint" => val r = parseEndPointT(T); return r
        case "Property" => val r = parsePropertyT(T); return r
        case "Mode" => val r = parseModeT(T); return r
        case "Flow" => val r = parseFlowT(T); return r
        case "Annex" => val r = parseAnnexT(T); return r
        case _ => halt(parser.errorMessage)
      }
    }

    def parseAadlXml(): AadlXml = {
      val r = parseAadlXmlT(F)
      return r
    }

    def parseAadlXmlT(typeParsed: B): AadlXml = {
      if (!typeParsed) {
        parser.parseObjectType("AadlXml")
      }
      parser.parseObjectKey("components")
      val components = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      return AadlXml(components)
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
      val identifier = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("category")
      val category = parseComponentCategory()
      parser.parseObjectNext()
      parser.parseObjectKey("classifier")
      val classifier = parseClassifier()
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
      return Component(identifier, category, classifier, features, subComponents, connections, properties, flows, modes, annexes)
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
      s match {
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
      val identifier = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("direction")
      val direction = parseDirection()
      parser.parseObjectNext()
      parser.parseObjectKey("category")
      val category = parseFeatureCategory()
      parser.parseObjectNext()
      parser.parseObjectKey("classifier")
      val classifier = parseClassifier()
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
      s match {
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
      s match {
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
      val name = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("src")
      val src = parseEndPoint()
      parser.parseObjectNext()
      parser.parseObjectKey("dst")
      val dst = parseEndPoint()
      parser.parseObjectNext()
      parser.parseObjectKey("properties")
      val properties = parser.parseISZ(parseProperty _)
      parser.parseObjectNext()
      return Connection(name, src, dst, properties)
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
      val component = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("feature")
      val feature = parser.parseString()
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
      val name = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("propertyValues")
      val propertyValues = parser.parseISZ(parsePropertyValue _)
      parser.parseObjectNext()
      return Property(name, propertyValues)
    }

    def parsePropertyValue(): PropertyValue = {
      val t = parser.parseObjectTypes(ISZ("ClassifierProp", "UnitProp", "RangeProp"))
      t match {
        case "ClassifierProp" => val r = parseClassifierPropT(T); return r
        case "UnitProp" => val r = parseUnitPropT(T); return r
        case "RangeProp" => val r = parseRangePropT(T); return r
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
      val Unit = parser.parseString()
      parser.parseObjectNext()
      return RangeProp(ValueLow, ValueHigh, Unit)
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
      val name = parser.parseString()
      parser.parseObjectNext()
      return Mode(name)
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
      val name = parser.parseString()
      parser.parseObjectNext()
      return Flow(name)
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
      return Annex(name)
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

  def fromMyTop(o: MyTop, isCompact: B): String = {
    val st = Printer.printMyTop(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMyTop(s: String): MyTop = {
    def fMyTop(parser: Parser): MyTop = {
      var r = parser.parseMyTop()
      return r
    }
    val r = to(s, fMyTop)
    return r
  }

  def fromAadlXml(o: AadlXml, isCompact: B): String = {
    val st = Printer.printAadlXml(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toAadlXml(s: String): AadlXml = {
    def fAadlXml(parser: Parser): AadlXml = {
      var r = parser.parseAadlXml()
      return r
    }
    val r = to(s, fAadlXml)
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
      var r = parser.parseComponent()
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
      var r = parser.parseClassifier()
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
      var r = parser.parseFeature()
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
      var r = parser.parseConnection()
      return r
    }
    val r = to(s, fConnection)
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
      var r = parser.parseEndPoint()
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
      var r = parser.parseProperty()
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
      var r = parser.parsePropertyValue()
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
      var r = parser.parseClassifierProp()
      return r
    }
    val r = to(s, fClassifierProp)
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
      var r = parser.parseUnitProp()
      return r
    }
    val r = to(s, fUnitProp)
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
      var r = parser.parseRangeProp()
      return r
    }
    val r = to(s, fRangeProp)
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
      var r = parser.parseMode()
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
      var r = parser.parseFlow()
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
      var r = parser.parseAnnex()
      return r
    }
    val r = to(s, fAnnex)
    return r
  }

}