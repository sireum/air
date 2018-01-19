package org.sireum.aadl.skema.ast {
  import org.sireum._

  import org.sireum.Json.Printer._

  object JSON {
    object Printer {
      @pure def printAadlTop(o: AadlTop): ST = _root_.org.sireum.helper.$tmatch(o) match {
        case (o @ ((_): AadlXml)) => return printAadlXml(o)
        case (o @ ((_): Component)) => return printComponent(o)
        case (o @ ((_): Classifier)) => return printClassifier(o)
        case (o @ ((_): Feature)) => return printFeature(o)
        case (o @ ((_): Connection)) => return printConnection(o)
        case (o @ ((_): EndPoint)) => return printEndPoint(o)
        case (o @ ((_): Property)) => return printProperty(o)
        case (o @ ((_): Mode)) => return printMode(o)
        case (o @ ((_): Flow)) => return printFlow(o)
        case (o @ ((_): Annex)) => return printAnnex(o)
      };
      @pure def printAadlXml(o: AadlXml): ST = return printObject(ISZ(scala.Tuple2(_root_.org.sireum.String("type"), StringContext("\"AadlXml\"").st()), scala.Tuple2(_root_.org.sireum.String("components"), _root_.org.sireum.helper.$assign(printISZ(F, o.components, printComponent)))));
      @pure def printComponent(o: Component): ST = return printObject(ISZ(scala.Tuple2(_root_.org.sireum.String("type"), StringContext("\"Component\"").st()), scala.Tuple2(_root_.org.sireum.String("identifier"), _root_.org.sireum.helper.$assign(printOption(o.identifier, printString))), scala.Tuple2(_root_.org.sireum.String("category"), _root_.org.sireum.helper.$assign(printComponentCategory(o.category))), scala.Tuple2(_root_.org.sireum.String("classifier"), _root_.org.sireum.helper.$assign(printOption(o.classifier, printClassifier))), scala.Tuple2(_root_.org.sireum.String("features"), _root_.org.sireum.helper.$assign(printISZ(F, o.features, printFeature))), scala.Tuple2(_root_.org.sireum.String("subComponents"), _root_.org.sireum.helper.$assign(printISZ(F, o.subComponents, printComponent))), scala.Tuple2(_root_.org.sireum.String("connections"), _root_.org.sireum.helper.$assign(printISZ(F, o.connections, printConnection))), scala.Tuple2(_root_.org.sireum.String("properties"), _root_.org.sireum.helper.$assign(printISZ(F, o.properties, printProperty))), scala.Tuple2(_root_.org.sireum.String("flows"), _root_.org.sireum.helper.$assign(printISZ(F, o.flows, printFlow))), scala.Tuple2(_root_.org.sireum.String("modes"), _root_.org.sireum.helper.$assign(printISZ(F, o.modes, printMode))), scala.Tuple2(_root_.org.sireum.String("annexes"), _root_.org.sireum.helper.$assign(printISZ(F, o.annexes, printAnnex)))));
      @pure def printClassifier(o: Classifier): ST = return printObject(ISZ(scala.Tuple2(_root_.org.sireum.String("type"), StringContext("\"Classifier\"").st()), scala.Tuple2(_root_.org.sireum.String("name"), _root_.org.sireum.helper.$assign(printString(o.name)))));
      @pure def printComponentCategory(o: ComponentCategory.Type): ST = {
        val value: String = _root_.org.sireum.helper.$assign(_root_.org.sireum.helper.$tmatch(o) match {
          case ComponentCategory.Abstract => _root_.org.sireum.String("Abstract")
          case ComponentCategory.Bus => _root_.org.sireum.String("Bus")
          case ComponentCategory.Data => _root_.org.sireum.String("Data")
          case ComponentCategory.Device => _root_.org.sireum.String("Device")
          case ComponentCategory.Memory => _root_.org.sireum.String("Memory")
          case ComponentCategory.Process => _root_.org.sireum.String("Process")
          case ComponentCategory.Processor => _root_.org.sireum.String("Processor")
          case ComponentCategory.Subprogram => _root_.org.sireum.String("Subprogram")
          case ComponentCategory.SubprogramGroup => _root_.org.sireum.String("SubprogramGroup")
          case ComponentCategory.System => _root_.org.sireum.String("System")
          case ComponentCategory.Thread => _root_.org.sireum.String("Thread")
          case ComponentCategory.ThreadGroup => _root_.org.sireum.String("ThreadGroup")
          case ComponentCategory.VirtualBus => _root_.org.sireum.String("VirtualBus")
          case ComponentCategory.VirtualProcessor => _root_.org.sireum.String("VirtualProcessor")
        });
        return printObject(ISZ(scala.Tuple2(_root_.org.sireum.String("type"), _root_.org.sireum.helper.$assign(printString(_root_.org.sireum.String("ComponentCategory")))), scala.Tuple2(_root_.org.sireum.String("value"), _root_.org.sireum.helper.$assign(printString(value)))))
      };
      @pure def printFeature(o: Feature): ST = return printObject(ISZ(scala.Tuple2(_root_.org.sireum.String("type"), StringContext("\"Feature\"").st()), scala.Tuple2(_root_.org.sireum.String("identifier"), _root_.org.sireum.helper.$assign(printString(o.identifier))), scala.Tuple2(_root_.org.sireum.String("direction"), _root_.org.sireum.helper.$assign(printDirection(o.direction))), scala.Tuple2(_root_.org.sireum.String("category"), _root_.org.sireum.helper.$assign(printFeatureCategory(o.category))), scala.Tuple2(_root_.org.sireum.String("classifier"), _root_.org.sireum.helper.$assign(printOption(o.classifier, printClassifier))), scala.Tuple2(_root_.org.sireum.String("properties"), _root_.org.sireum.helper.$assign(printISZ(F, o.properties, printProperty)))));
      @pure def printDirection(o: Direction.Type): ST = {
        val value: String = _root_.org.sireum.helper.$assign(_root_.org.sireum.helper.$tmatch(o) match {
          case Direction.In => _root_.org.sireum.String("In")
          case Direction.Out => _root_.org.sireum.String("Out")
          case Direction.InOut => _root_.org.sireum.String("InOut")
          case Direction.None => _root_.org.sireum.String("None")
        });
        return printObject(ISZ(scala.Tuple2(_root_.org.sireum.String("type"), _root_.org.sireum.helper.$assign(printString(_root_.org.sireum.String("Direction")))), scala.Tuple2(_root_.org.sireum.String("value"), _root_.org.sireum.helper.$assign(printString(value)))))
      };
      @pure def printFeatureCategory(o: FeatureCategory.Type): ST = {
        val value: String = _root_.org.sireum.helper.$assign(_root_.org.sireum.helper.$tmatch(o) match {
          case FeatureCategory.AbstractFeature => _root_.org.sireum.String("AbstractFeature")
          case FeatureCategory.BusAccess => _root_.org.sireum.String("BusAccess")
          case FeatureCategory.DataAccess => _root_.org.sireum.String("DataAccess")
          case FeatureCategory.DataPort => _root_.org.sireum.String("DataPort")
          case FeatureCategory.EventPort => _root_.org.sireum.String("EventPort")
          case FeatureCategory.EventDataPort => _root_.org.sireum.String("EventDataPort")
          case FeatureCategory.FeatureGroup => _root_.org.sireum.String("FeatureGroup")
          case FeatureCategory.Parameter => _root_.org.sireum.String("Parameter")
          case FeatureCategory.SubprogramAccess => _root_.org.sireum.String("SubprogramAccess")
          case FeatureCategory.SubprogramAccessGroup => _root_.org.sireum.String("SubprogramAccessGroup")
        });
        return printObject(ISZ(scala.Tuple2(_root_.org.sireum.String("type"), _root_.org.sireum.helper.$assign(printString(_root_.org.sireum.String("FeatureCategory")))), scala.Tuple2(_root_.org.sireum.String("value"), _root_.org.sireum.helper.$assign(printString(value)))))
      };
      @pure def printConnection(o: Connection): ST = return printObject(ISZ(scala.Tuple2(_root_.org.sireum.String("type"), StringContext("\"Connection\"").st()), scala.Tuple2(_root_.org.sireum.String("name"), _root_.org.sireum.helper.$assign(printOption(o.name, printString))), scala.Tuple2(_root_.org.sireum.String("src"), _root_.org.sireum.helper.$assign(printEndPoint(o.src))), scala.Tuple2(_root_.org.sireum.String("dst"), _root_.org.sireum.helper.$assign(printEndPoint(o.dst))), scala.Tuple2(_root_.org.sireum.String("kind"), _root_.org.sireum.helper.$assign(printConnectionKind(o.kind))), scala.Tuple2(_root_.org.sireum.String("properties"), _root_.org.sireum.helper.$assign(printISZ(F, o.properties, printProperty)))));
      @pure def printConnectionKind(o: ConnectionKind.Type): ST = {
        val value: String = _root_.org.sireum.helper.$assign(_root_.org.sireum.helper.$tmatch(o) match {
          case ConnectionKind.Feature => _root_.org.sireum.String("Feature")
          case ConnectionKind.Access => _root_.org.sireum.String("Access")
          case ConnectionKind.Parameter => _root_.org.sireum.String("Parameter")
          case ConnectionKind.Port => _root_.org.sireum.String("Port")
          case ConnectionKind.ModeTransition => _root_.org.sireum.String("ModeTransition")
          case ConnectionKind.FeatureGroup => _root_.org.sireum.String("FeatureGroup")
        });
        return printObject(ISZ(scala.Tuple2(_root_.org.sireum.String("type"), _root_.org.sireum.helper.$assign(printString(_root_.org.sireum.String("ConnectionKind")))), scala.Tuple2(_root_.org.sireum.String("value"), _root_.org.sireum.helper.$assign(printString(value)))))
      };
      @pure def printEndPoint(o: EndPoint): ST = return printObject(ISZ(scala.Tuple2(_root_.org.sireum.String("type"), StringContext("\"EndPoint\"").st()), scala.Tuple2(_root_.org.sireum.String("component"), _root_.org.sireum.helper.$assign(printString(o.component))), scala.Tuple2(_root_.org.sireum.String("feature"), _root_.org.sireum.helper.$assign(printString(o.feature)))));
      @pure def printProperty(o: Property): ST = return printObject(ISZ(scala.Tuple2(_root_.org.sireum.String("type"), StringContext("\"Property\"").st()), scala.Tuple2(_root_.org.sireum.String("name"), _root_.org.sireum.helper.$assign(printString(o.name))), scala.Tuple2(_root_.org.sireum.String("propertyValues"), _root_.org.sireum.helper.$assign(printISZ(F, o.propertyValues, printPropertyValue)))));
      @pure def printPropertyValue(o: PropertyValue): ST = _root_.org.sireum.helper.$tmatch(o) match {
        case (o @ ((_): ClassifierProp)) => return printClassifierProp(o)
        case (o @ ((_): RangeProp)) => return printRangeProp(o)
        case (o @ ((_): ReferenceProp)) => return printReferenceProp(o)
        case (o @ ((_): UnitProp)) => return printUnitProp(o)
        case (o @ ((_): ValueProp)) => return printValueProp(o)
      };
      @pure def printClassifierProp(o: ClassifierProp): ST = return printObject(ISZ(scala.Tuple2(_root_.org.sireum.String("type"), StringContext("\"ClassifierProp\"").st()), scala.Tuple2(_root_.org.sireum.String("name"), _root_.org.sireum.helper.$assign(printString(o.name)))));
      @pure def printRangeProp(o: RangeProp): ST = return printObject(ISZ(scala.Tuple2(_root_.org.sireum.String("type"), StringContext("\"RangeProp\"").st()), scala.Tuple2(_root_.org.sireum.String("ValueLow"), _root_.org.sireum.helper.$assign(printString(o.ValueLow))), scala.Tuple2(_root_.org.sireum.String("ValueHigh"), _root_.org.sireum.helper.$assign(printString(o.ValueHigh))), scala.Tuple2(_root_.org.sireum.String("Unit"), _root_.org.sireum.helper.$assign(printOption(o.Unit, printString)))));
      @pure def printReferenceProp(o: ReferenceProp): ST = return printObject(ISZ(scala.Tuple2(_root_.org.sireum.String("type"), StringContext("\"ReferenceProp\"").st()), scala.Tuple2(_root_.org.sireum.String("value"), _root_.org.sireum.helper.$assign(printString(o.value)))));
      @pure def printUnitProp(o: UnitProp): ST = return printObject(ISZ(scala.Tuple2(_root_.org.sireum.String("type"), StringContext("\"UnitProp\"").st()), scala.Tuple2(_root_.org.sireum.String("value"), _root_.org.sireum.helper.$assign(printString(o.value))), scala.Tuple2(_root_.org.sireum.String("unit"), _root_.org.sireum.helper.$assign(printString(o.unit)))));
      @pure def printValueProp(o: ValueProp): ST = return printObject(ISZ(scala.Tuple2(_root_.org.sireum.String("type"), StringContext("\"ValueProp\"").st()), scala.Tuple2(_root_.org.sireum.String("value"), _root_.org.sireum.helper.$assign(printString(o.value)))));
      @pure def printMode(o: Mode): ST = return printObject(ISZ(scala.Tuple2(_root_.org.sireum.String("type"), StringContext("\"Mode\"").st()), scala.Tuple2(_root_.org.sireum.String("name"), _root_.org.sireum.helper.$assign(printString(o.name)))));
      @pure def printFlow(o: Flow): ST = return printObject(ISZ(scala.Tuple2(_root_.org.sireum.String("type"), StringContext("\"Flow\"").st()), scala.Tuple2(_root_.org.sireum.String("name"), _root_.org.sireum.helper.$assign(printString(o.name)))));
      @pure def printAnnex(o: Annex): ST = return printObject(ISZ(scala.Tuple2(_root_.org.sireum.String("type"), StringContext("\"Annex\"").st()), scala.Tuple2(_root_.org.sireum.String("name"), _root_.org.sireum.helper.$assign(printString(o.name)))))
    };
    object Parser {
      def apply(input: String): Parser = new Parser(_root_.org.sireum.helper.$assign(input));
      def unapply(o: Parser): _root_.scala.Option[String] = _root_.scala.Some(_root_.org.sireum.helper.clone(o.input))
    };
    @record class Parser(_input: String) extends _root_.org.sireum.RecordSig {
      val parser: Json.Parser = _root_.org.sireum.helper.$assign(Json.Parser.create(input));
      def parseAadlTop(): AadlTop = {
        val t = _root_.org.sireum.helper.$assign(parser.parseObjectTypes(ISZ(_root_.org.sireum.String("AadlXml"), _root_.org.sireum.String("Component"), _root_.org.sireum.String("Classifier"), _root_.org.sireum.String("Feature"), _root_.org.sireum.String("Connection"), _root_.org.sireum.String("EndPoint"), _root_.org.sireum.String("Property"), _root_.org.sireum.String("Mode"), _root_.org.sireum.String("Flow"), _root_.org.sireum.String("Annex"))));
        _root_.org.sireum.helper.$tmatch(t.native) match {
          case "AadlXml" => {
            val r = _root_.org.sireum.helper.$assign(parseAadlXmlT(T));
            return r
          }
          case "Component" => {
            val r = _root_.org.sireum.helper.$assign(parseComponentT(T));
            return r
          }
          case "Classifier" => {
            val r = _root_.org.sireum.helper.$assign(parseClassifierT(T));
            return r
          }
          case "Feature" => {
            val r = _root_.org.sireum.helper.$assign(parseFeatureT(T));
            return r
          }
          case "Connection" => {
            val r = _root_.org.sireum.helper.$assign(parseConnectionT(T));
            return r
          }
          case "EndPoint" => {
            val r = _root_.org.sireum.helper.$assign(parseEndPointT(T));
            return r
          }
          case "Property" => {
            val r = _root_.org.sireum.helper.$assign(parsePropertyT(T));
            return r
          }
          case "Mode" => {
            val r = _root_.org.sireum.helper.$assign(parseModeT(T));
            return r
          }
          case "Flow" => {
            val r = _root_.org.sireum.helper.$assign(parseFlowT(T));
            return r
          }
          case "Annex" => {
            val r = _root_.org.sireum.helper.$assign(parseAnnexT(T));
            return r
          }
          case _ => halt(parser.errorMessage)
        }
      };
      def parseAadlXml(): AadlXml = {
        val r = _root_.org.sireum.helper.$assign(parseAadlXmlT(F));
        return r
      };
      def parseAadlXmlT(typeParsed: B): AadlXml = {
        if (typeParsed.`unary_!`)
          parser.parseObjectType(_root_.org.sireum.String("AadlXml"))
        else
          ();
        parser.parseObjectKey(_root_.org.sireum.String("components"));
        val components = _root_.org.sireum.helper.$assign(parser.parseISZ((parseComponent _)));
        parser.parseObjectNext();
        return AadlXml(components)
      };
      def parseComponent(): Component = {
        val r = _root_.org.sireum.helper.$assign(parseComponentT(F));
        return r
      };
      def parseComponentT(typeParsed: B): Component = {
        if (typeParsed.`unary_!`)
          parser.parseObjectType(_root_.org.sireum.String("Component"))
        else
          ();
        parser.parseObjectKey(_root_.org.sireum.String("identifier"));
        val identifier = _root_.org.sireum.helper.$assign(parser.parseOption((parser.parseString _)));
        parser.parseObjectNext();
        parser.parseObjectKey(_root_.org.sireum.String("category"));
        val category = _root_.org.sireum.helper.$assign(parseComponentCategory());
        parser.parseObjectNext();
        parser.parseObjectKey(_root_.org.sireum.String("classifier"));
        val classifier = _root_.org.sireum.helper.$assign(parser.parseOption((parseClassifier _)));
        parser.parseObjectNext();
        parser.parseObjectKey(_root_.org.sireum.String("features"));
        val features = _root_.org.sireum.helper.$assign(parser.parseISZ((parseFeature _)));
        parser.parseObjectNext();
        parser.parseObjectKey(_root_.org.sireum.String("subComponents"));
        val subComponents = _root_.org.sireum.helper.$assign(parser.parseISZ((parseComponent _)));
        parser.parseObjectNext();
        parser.parseObjectKey(_root_.org.sireum.String("connections"));
        val connections = _root_.org.sireum.helper.$assign(parser.parseISZ((parseConnection _)));
        parser.parseObjectNext();
        parser.parseObjectKey(_root_.org.sireum.String("properties"));
        val properties = _root_.org.sireum.helper.$assign(parser.parseISZ((parseProperty _)));
        parser.parseObjectNext();
        parser.parseObjectKey(_root_.org.sireum.String("flows"));
        val flows = _root_.org.sireum.helper.$assign(parser.parseISZ((parseFlow _)));
        parser.parseObjectNext();
        parser.parseObjectKey(_root_.org.sireum.String("modes"));
        val modes = _root_.org.sireum.helper.$assign(parser.parseISZ((parseMode _)));
        parser.parseObjectNext();
        parser.parseObjectKey(_root_.org.sireum.String("annexes"));
        val annexes = _root_.org.sireum.helper.$assign(parser.parseISZ((parseAnnex _)));
        parser.parseObjectNext();
        return Component(identifier, category, classifier, features, subComponents, connections, properties, flows, modes, annexes)
      };
      def parseClassifier(): Classifier = {
        val r = _root_.org.sireum.helper.$assign(parseClassifierT(F));
        return r
      };
      def parseClassifierT(typeParsed: B): Classifier = {
        if (typeParsed.`unary_!`)
          parser.parseObjectType(_root_.org.sireum.String("Classifier"))
        else
          ();
        parser.parseObjectKey(_root_.org.sireum.String("name"));
        val name = _root_.org.sireum.helper.$assign(parser.parseString());
        parser.parseObjectNext();
        return Classifier(name)
      };
      def parseComponentCategory(): ComponentCategory.Type = {
        val r = _root_.org.sireum.helper.$assign(parseComponentCategoryT(F));
        return r
      };
      def parseComponentCategoryT(typeParsed: B): ComponentCategory.Type = {
        if (typeParsed.`unary_!`)
          parser.parseObjectType(_root_.org.sireum.String("ComponentCategory"))
        else
          ();
        parser.parseObjectKey(_root_.org.sireum.String("value"));
        val s = _root_.org.sireum.helper.$assign(parser.parseString());
        parser.parseObjectNext();
        _root_.org.sireum.helper.$tmatch(s.native) match {
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
      };
      def parseFeature(): Feature = {
        val r = _root_.org.sireum.helper.$assign(parseFeatureT(F));
        return r
      };
      def parseFeatureT(typeParsed: B): Feature = {
        if (typeParsed.`unary_!`)
          parser.parseObjectType(_root_.org.sireum.String("Feature"))
        else
          ();
        parser.parseObjectKey(_root_.org.sireum.String("identifier"));
        val identifier = _root_.org.sireum.helper.$assign(parser.parseString());
        parser.parseObjectNext();
        parser.parseObjectKey(_root_.org.sireum.String("direction"));
        val direction = _root_.org.sireum.helper.$assign(parseDirection());
        parser.parseObjectNext();
        parser.parseObjectKey(_root_.org.sireum.String("category"));
        val category = _root_.org.sireum.helper.$assign(parseFeatureCategory());
        parser.parseObjectNext();
        parser.parseObjectKey(_root_.org.sireum.String("classifier"));
        val classifier = _root_.org.sireum.helper.$assign(parser.parseOption((parseClassifier _)));
        parser.parseObjectNext();
        parser.parseObjectKey(_root_.org.sireum.String("properties"));
        val properties = _root_.org.sireum.helper.$assign(parser.parseISZ((parseProperty _)));
        parser.parseObjectNext();
        return Feature(identifier, direction, category, classifier, properties)
      };
      def parseDirection(): Direction.Type = {
        val r = _root_.org.sireum.helper.$assign(parseDirectionT(F));
        return r
      };
      def parseDirectionT(typeParsed: B): Direction.Type = {
        if (typeParsed.`unary_!`)
          parser.parseObjectType(_root_.org.sireum.String("Direction"))
        else
          ();
        parser.parseObjectKey(_root_.org.sireum.String("value"));
        val s = _root_.org.sireum.helper.$assign(parser.parseString());
        parser.parseObjectNext();
        _root_.org.sireum.helper.$tmatch(s.native) match {
          case "In" => return Direction.In
          case "Out" => return Direction.Out
          case "InOut" => return Direction.InOut
          case "None" => return Direction.None
          case _ => halt(parser.errorMessage)
        }
      };
      def parseFeatureCategory(): FeatureCategory.Type = {
        val r = _root_.org.sireum.helper.$assign(parseFeatureCategoryT(F));
        return r
      };
      def parseFeatureCategoryT(typeParsed: B): FeatureCategory.Type = {
        if (typeParsed.`unary_!`)
          parser.parseObjectType(_root_.org.sireum.String("FeatureCategory"))
        else
          ();
        parser.parseObjectKey(_root_.org.sireum.String("value"));
        val s = _root_.org.sireum.helper.$assign(parser.parseString());
        parser.parseObjectNext();
        _root_.org.sireum.helper.$tmatch(s.native) match {
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
      };
      def parseConnection(): Connection = {
        val r = _root_.org.sireum.helper.$assign(parseConnectionT(F));
        return r
      };
      def parseConnectionT(typeParsed: B): Connection = {
        if (typeParsed.`unary_!`)
          parser.parseObjectType(_root_.org.sireum.String("Connection"))
        else
          ();
        parser.parseObjectKey(_root_.org.sireum.String("name"));
        val name = _root_.org.sireum.helper.$assign(parser.parseOption((parser.parseString _)));
        parser.parseObjectNext();
        parser.parseObjectKey(_root_.org.sireum.String("src"));
        val src = _root_.org.sireum.helper.$assign(parseEndPoint());
        parser.parseObjectNext();
        parser.parseObjectKey(_root_.org.sireum.String("dst"));
        val dst = _root_.org.sireum.helper.$assign(parseEndPoint());
        parser.parseObjectNext();
        parser.parseObjectKey(_root_.org.sireum.String("kind"));
        val kind = _root_.org.sireum.helper.$assign(parseConnectionKind());
        parser.parseObjectNext();
        parser.parseObjectKey(_root_.org.sireum.String("properties"));
        val properties = _root_.org.sireum.helper.$assign(parser.parseISZ((parseProperty _)));
        parser.parseObjectNext();
        return Connection(name, src, dst, kind, properties)
      };
      def parseConnectionKind(): ConnectionKind.Type = {
        val r = _root_.org.sireum.helper.$assign(parseConnectionKindT(F));
        return r
      };
      def parseConnectionKindT(typeParsed: B): ConnectionKind.Type = {
        if (typeParsed.`unary_!`)
          parser.parseObjectType(_root_.org.sireum.String("ConnectionKind"))
        else
          ();
        parser.parseObjectKey(_root_.org.sireum.String("value"));
        val s = _root_.org.sireum.helper.$assign(parser.parseString());
        parser.parseObjectNext();
        _root_.org.sireum.helper.$tmatch(s.native) match {
          case "Feature" => return ConnectionKind.Feature
          case "Access" => return ConnectionKind.Access
          case "Parameter" => return ConnectionKind.Parameter
          case "Port" => return ConnectionKind.Port
          case "ModeTransition" => return ConnectionKind.ModeTransition
          case "FeatureGroup" => return ConnectionKind.FeatureGroup
          case _ => halt(parser.errorMessage)
        }
      };
      def parseEndPoint(): EndPoint = {
        val r = _root_.org.sireum.helper.$assign(parseEndPointT(F));
        return r
      };
      def parseEndPointT(typeParsed: B): EndPoint = {
        if (typeParsed.`unary_!`)
          parser.parseObjectType(_root_.org.sireum.String("EndPoint"))
        else
          ();
        parser.parseObjectKey(_root_.org.sireum.String("component"));
        val component = _root_.org.sireum.helper.$assign(parser.parseString());
        parser.parseObjectNext();
        parser.parseObjectKey(_root_.org.sireum.String("feature"));
        val feature = _root_.org.sireum.helper.$assign(parser.parseString());
        parser.parseObjectNext();
        return EndPoint(component, feature)
      };
      def parseProperty(): Property = {
        val r = _root_.org.sireum.helper.$assign(parsePropertyT(F));
        return r
      };
      def parsePropertyT(typeParsed: B): Property = {
        if (typeParsed.`unary_!`)
          parser.parseObjectType(_root_.org.sireum.String("Property"))
        else
          ();
        parser.parseObjectKey(_root_.org.sireum.String("name"));
        val name = _root_.org.sireum.helper.$assign(parser.parseString());
        parser.parseObjectNext();
        parser.parseObjectKey(_root_.org.sireum.String("propertyValues"));
        val propertyValues = _root_.org.sireum.helper.$assign(parser.parseISZ((parsePropertyValue _)));
        parser.parseObjectNext();
        return Property(name, propertyValues)
      };
      def parsePropertyValue(): PropertyValue = {
        val t = _root_.org.sireum.helper.$assign(parser.parseObjectTypes(ISZ(_root_.org.sireum.String("ClassifierProp"), _root_.org.sireum.String("RangeProp"), _root_.org.sireum.String("ReferenceProp"), _root_.org.sireum.String("UnitProp"), _root_.org.sireum.String("ValueProp"))));
        _root_.org.sireum.helper.$tmatch(t.native) match {
          case "ClassifierProp" => {
            val r = _root_.org.sireum.helper.$assign(parseClassifierPropT(T));
            return r
          }
          case "RangeProp" => {
            val r = _root_.org.sireum.helper.$assign(parseRangePropT(T));
            return r
          }
          case "ReferenceProp" => {
            val r = _root_.org.sireum.helper.$assign(parseReferencePropT(T));
            return r
          }
          case "UnitProp" => {
            val r = _root_.org.sireum.helper.$assign(parseUnitPropT(T));
            return r
          }
          case "ValueProp" => {
            val r = _root_.org.sireum.helper.$assign(parseValuePropT(T));
            return r
          }
          case _ => halt(parser.errorMessage)
        }
      };
      def parseClassifierProp(): ClassifierProp = {
        val r = _root_.org.sireum.helper.$assign(parseClassifierPropT(F));
        return r
      };
      def parseClassifierPropT(typeParsed: B): ClassifierProp = {
        if (typeParsed.`unary_!`)
          parser.parseObjectType(_root_.org.sireum.String("ClassifierProp"))
        else
          ();
        parser.parseObjectKey(_root_.org.sireum.String("name"));
        val name = _root_.org.sireum.helper.$assign(parser.parseString());
        parser.parseObjectNext();
        return ClassifierProp(name)
      };
      def parseRangeProp(): RangeProp = {
        val r = _root_.org.sireum.helper.$assign(parseRangePropT(F));
        return r
      };
      def parseRangePropT(typeParsed: B): RangeProp = {
        if (typeParsed.`unary_!`)
          parser.parseObjectType(_root_.org.sireum.String("RangeProp"))
        else
          ();
        parser.parseObjectKey(_root_.org.sireum.String("ValueLow"));
        val ValueLow = _root_.org.sireum.helper.$assign(parser.parseString());
        parser.parseObjectNext();
        parser.parseObjectKey(_root_.org.sireum.String("ValueHigh"));
        val ValueHigh = _root_.org.sireum.helper.$assign(parser.parseString());
        parser.parseObjectNext();
        parser.parseObjectKey(_root_.org.sireum.String("Unit"));
        val Unit = _root_.org.sireum.helper.$assign(parser.parseOption((parser.parseString _)));
        parser.parseObjectNext();
        return RangeProp(ValueLow, ValueHigh, Unit)
      };
      def parseReferenceProp(): ReferenceProp = {
        val r = _root_.org.sireum.helper.$assign(parseReferencePropT(F));
        return r
      };
      def parseReferencePropT(typeParsed: B): ReferenceProp = {
        if (typeParsed.`unary_!`)
          parser.parseObjectType(_root_.org.sireum.String("ReferenceProp"))
        else
          ();
        parser.parseObjectKey(_root_.org.sireum.String("value"));
        val value = _root_.org.sireum.helper.$assign(parser.parseString());
        parser.parseObjectNext();
        return ReferenceProp(value)
      };
      def parseUnitProp(): UnitProp = {
        val r = _root_.org.sireum.helper.$assign(parseUnitPropT(F));
        return r
      };
      def parseUnitPropT(typeParsed: B): UnitProp = {
        if (typeParsed.`unary_!`)
          parser.parseObjectType(_root_.org.sireum.String("UnitProp"))
        else
          ();
        parser.parseObjectKey(_root_.org.sireum.String("value"));
        val value = _root_.org.sireum.helper.$assign(parser.parseString());
        parser.parseObjectNext();
        parser.parseObjectKey(_root_.org.sireum.String("unit"));
        val unit = _root_.org.sireum.helper.$assign(parser.parseString());
        parser.parseObjectNext();
        return UnitProp(value, unit)
      };
      def parseValueProp(): ValueProp = {
        val r = _root_.org.sireum.helper.$assign(parseValuePropT(F));
        return r
      };
      def parseValuePropT(typeParsed: B): ValueProp = {
        if (typeParsed.`unary_!`)
          parser.parseObjectType(_root_.org.sireum.String("ValueProp"))
        else
          ();
        parser.parseObjectKey(_root_.org.sireum.String("value"));
        val value = _root_.org.sireum.helper.$assign(parser.parseString());
        parser.parseObjectNext();
        return ValueProp(value)
      };
      def parseMode(): Mode = {
        val r = _root_.org.sireum.helper.$assign(parseModeT(F));
        return r
      };
      def parseModeT(typeParsed: B): Mode = {
        if (typeParsed.`unary_!`)
          parser.parseObjectType(_root_.org.sireum.String("Mode"))
        else
          ();
        parser.parseObjectKey(_root_.org.sireum.String("name"));
        val name = _root_.org.sireum.helper.$assign(parser.parseString());
        parser.parseObjectNext();
        return Mode(name)
      };
      def parseFlow(): Flow = {
        val r = _root_.org.sireum.helper.$assign(parseFlowT(F));
        return r
      };
      def parseFlowT(typeParsed: B): Flow = {
        if (typeParsed.`unary_!`)
          parser.parseObjectType(_root_.org.sireum.String("Flow"))
        else
          ();
        parser.parseObjectKey(_root_.org.sireum.String("name"));
        val name = _root_.org.sireum.helper.$assign(parser.parseString());
        parser.parseObjectNext();
        return Flow(name)
      };
      def parseAnnex(): Annex = {
        val r = _root_.org.sireum.helper.$assign(parseAnnexT(F));
        return r
      };
      def parseAnnexT(typeParsed: B): Annex = {
        if (typeParsed.`unary_!`)
          parser.parseObjectType(_root_.org.sireum.String("Annex"))
        else
          ();
        parser.parseObjectKey(_root_.org.sireum.String("name"));
        val name = _root_.org.sireum.helper.$assign(parser.parseString());
        parser.parseObjectNext();
        return Annex(name)
      };
      def eof(): B = {
        val r = _root_.org.sireum.helper.$assign(parser.eof());
        return r
      };
      def errorOpt: Option[Json.ErrorMsg] = return parser.errorOpt;
      def input = _input;
      override def toString: _root_.java.lang.String = {
        val sb = new _root_.java.lang.StringBuilder();
        sb.append("Parser");
        sb.append('(');
        sb.append(_root_.org.sireum.String.escape(this.input));
        sb.append(')');
        sb.toString
      };
      override def string: _root_.org.sireum.String = toString;
      override def hashCode: _root_.scala.Int = _root_.scala.Seq(this.getClass, input).hashCode;
      override def equals(o: _root_.scala.Any): _root_.scala.Boolean = if (this.eq(o.asInstanceOf[_root_.scala.AnyRef]))
        true
      else
        o match {
          case (o @ ((_): Parser)) => if (this.hashCode.!=(o.hashCode))
            false
          else
            this.input.==(o.input)
          case _ => false
        };
      def apply(input: String = this.input): Parser = new Parser(_root_.org.sireum.helper.$assign(input));
      override lazy val content: _root_.scala.Seq[scala.Tuple2[_root_.java.lang.String, _root_.scala.Any]] = _root_.scala.Seq(scala.Tuple2("type", _root_.scala.List[_root_.java.lang.String]("org", "sireum", "aadl", "skema", "ast", "Parser")), scala.Tuple2("input", input));
      override def $clone: Parser = {
        val r: Parser = new Parser(_root_.org.sireum.helper.cloneAssign(this.input));
        r
      }
    };
    def to[T](s: String, f: _root_.scala.Function1[Parser, T]): T = {
      val parser = _root_.org.sireum.helper.$assign(Parser(s));
      val r = _root_.org.sireum.helper.$assign(f(parser));
      parser.eof();
      return r
    };
    def fromAadlTop(o: AadlTop, isCompact: B): String = {
      val st = _root_.org.sireum.helper.$assign(Printer.printAadlTop(o));
      if (isCompact)
        return st.renderCompact
      else
        return st.render
    };
    def toAadlTop(s: String): AadlTop = {
      def fAadlTop(parser: Parser): AadlTop = {
        val r = _root_.org.sireum.helper.$assign(parser.parseAadlTop());
        return r
      };
      val r = _root_.org.sireum.helper.$assign(to(s, fAadlTop));
      return r
    };
    def fromAadlXml(o: AadlXml, isCompact: B): String = {
      val st = _root_.org.sireum.helper.$assign(Printer.printAadlXml(o));
      if (isCompact)
        return st.renderCompact
      else
        return st.render
    };
    def toAadlXml(s: String): AadlXml = {
      def fAadlXml(parser: Parser): AadlXml = {
        val r = _root_.org.sireum.helper.$assign(parser.parseAadlXml());
        return r
      };
      val r = _root_.org.sireum.helper.$assign(to(s, fAadlXml));
      return r
    };
    def fromComponent(o: Component, isCompact: B): String = {
      val st = _root_.org.sireum.helper.$assign(Printer.printComponent(o));
      if (isCompact)
        return st.renderCompact
      else
        return st.render
    };
    def toComponent(s: String): Component = {
      def fComponent(parser: Parser): Component = {
        val r = _root_.org.sireum.helper.$assign(parser.parseComponent());
        return r
      };
      val r = _root_.org.sireum.helper.$assign(to(s, fComponent));
      return r
    };
    def fromClassifier(o: Classifier, isCompact: B): String = {
      val st = _root_.org.sireum.helper.$assign(Printer.printClassifier(o));
      if (isCompact)
        return st.renderCompact
      else
        return st.render
    };
    def toClassifier(s: String): Classifier = {
      def fClassifier(parser: Parser): Classifier = {
        val r = _root_.org.sireum.helper.$assign(parser.parseClassifier());
        return r
      };
      val r = _root_.org.sireum.helper.$assign(to(s, fClassifier));
      return r
    };
    def fromFeature(o: Feature, isCompact: B): String = {
      val st = _root_.org.sireum.helper.$assign(Printer.printFeature(o));
      if (isCompact)
        return st.renderCompact
      else
        return st.render
    };
    def toFeature(s: String): Feature = {
      def fFeature(parser: Parser): Feature = {
        val r = _root_.org.sireum.helper.$assign(parser.parseFeature());
        return r
      };
      val r = _root_.org.sireum.helper.$assign(to(s, fFeature));
      return r
    };
    def fromConnection(o: Connection, isCompact: B): String = {
      val st = _root_.org.sireum.helper.$assign(Printer.printConnection(o));
      if (isCompact)
        return st.renderCompact
      else
        return st.render
    };
    def toConnection(s: String): Connection = {
      def fConnection(parser: Parser): Connection = {
        val r = _root_.org.sireum.helper.$assign(parser.parseConnection());
        return r
      };
      val r = _root_.org.sireum.helper.$assign(to(s, fConnection));
      return r
    };
    def fromEndPoint(o: EndPoint, isCompact: B): String = {
      val st = _root_.org.sireum.helper.$assign(Printer.printEndPoint(o));
      if (isCompact)
        return st.renderCompact
      else
        return st.render
    };
    def toEndPoint(s: String): EndPoint = {
      def fEndPoint(parser: Parser): EndPoint = {
        val r = _root_.org.sireum.helper.$assign(parser.parseEndPoint());
        return r
      };
      val r = _root_.org.sireum.helper.$assign(to(s, fEndPoint));
      return r
    };
    def fromProperty(o: Property, isCompact: B): String = {
      val st = _root_.org.sireum.helper.$assign(Printer.printProperty(o));
      if (isCompact)
        return st.renderCompact
      else
        return st.render
    };
    def toProperty(s: String): Property = {
      def fProperty(parser: Parser): Property = {
        val r = _root_.org.sireum.helper.$assign(parser.parseProperty());
        return r
      };
      val r = _root_.org.sireum.helper.$assign(to(s, fProperty));
      return r
    };
    def fromPropertyValue(o: PropertyValue, isCompact: B): String = {
      val st = _root_.org.sireum.helper.$assign(Printer.printPropertyValue(o));
      if (isCompact)
        return st.renderCompact
      else
        return st.render
    };
    def toPropertyValue(s: String): PropertyValue = {
      def fPropertyValue(parser: Parser): PropertyValue = {
        val r = _root_.org.sireum.helper.$assign(parser.parsePropertyValue());
        return r
      };
      val r = _root_.org.sireum.helper.$assign(to(s, fPropertyValue));
      return r
    };
    def fromClassifierProp(o: ClassifierProp, isCompact: B): String = {
      val st = _root_.org.sireum.helper.$assign(Printer.printClassifierProp(o));
      if (isCompact)
        return st.renderCompact
      else
        return st.render
    };
    def toClassifierProp(s: String): ClassifierProp = {
      def fClassifierProp(parser: Parser): ClassifierProp = {
        val r = _root_.org.sireum.helper.$assign(parser.parseClassifierProp());
        return r
      };
      val r = _root_.org.sireum.helper.$assign(to(s, fClassifierProp));
      return r
    };
    def fromRangeProp(o: RangeProp, isCompact: B): String = {
      val st = _root_.org.sireum.helper.$assign(Printer.printRangeProp(o));
      if (isCompact)
        return st.renderCompact
      else
        return st.render
    };
    def toRangeProp(s: String): RangeProp = {
      def fRangeProp(parser: Parser): RangeProp = {
        val r = _root_.org.sireum.helper.$assign(parser.parseRangeProp());
        return r
      };
      val r = _root_.org.sireum.helper.$assign(to(s, fRangeProp));
      return r
    };
    def fromReferenceProp(o: ReferenceProp, isCompact: B): String = {
      val st = _root_.org.sireum.helper.$assign(Printer.printReferenceProp(o));
      if (isCompact)
        return st.renderCompact
      else
        return st.render
    };
    def toReferenceProp(s: String): ReferenceProp = {
      def fReferenceProp(parser: Parser): ReferenceProp = {
        val r = _root_.org.sireum.helper.$assign(parser.parseReferenceProp());
        return r
      };
      val r = _root_.org.sireum.helper.$assign(to(s, fReferenceProp));
      return r
    };
    def fromUnitProp(o: UnitProp, isCompact: B): String = {
      val st = _root_.org.sireum.helper.$assign(Printer.printUnitProp(o));
      if (isCompact)
        return st.renderCompact
      else
        return st.render
    };
    def toUnitProp(s: String): UnitProp = {
      def fUnitProp(parser: Parser): UnitProp = {
        val r = _root_.org.sireum.helper.$assign(parser.parseUnitProp());
        return r
      };
      val r = _root_.org.sireum.helper.$assign(to(s, fUnitProp));
      return r
    };
    def fromValueProp(o: ValueProp, isCompact: B): String = {
      val st = _root_.org.sireum.helper.$assign(Printer.printValueProp(o));
      if (isCompact)
        return st.renderCompact
      else
        return st.render
    };
    def toValueProp(s: String): ValueProp = {
      def fValueProp(parser: Parser): ValueProp = {
        val r = _root_.org.sireum.helper.$assign(parser.parseValueProp());
        return r
      };
      val r = _root_.org.sireum.helper.$assign(to(s, fValueProp));
      return r
    };
    def fromMode(o: Mode, isCompact: B): String = {
      val st = _root_.org.sireum.helper.$assign(Printer.printMode(o));
      if (isCompact)
        return st.renderCompact
      else
        return st.render
    };
    def toMode(s: String): Mode = {
      def fMode(parser: Parser): Mode = {
        val r = _root_.org.sireum.helper.$assign(parser.parseMode());
        return r
      };
      val r = _root_.org.sireum.helper.$assign(to(s, fMode));
      return r
    };
    def fromFlow(o: Flow, isCompact: B): String = {
      val st = _root_.org.sireum.helper.$assign(Printer.printFlow(o));
      if (isCompact)
        return st.renderCompact
      else
        return st.render
    };
    def toFlow(s: String): Flow = {
      def fFlow(parser: Parser): Flow = {
        val r = _root_.org.sireum.helper.$assign(parser.parseFlow());
        return r
      };
      val r = _root_.org.sireum.helper.$assign(to(s, fFlow));
      return r
    };
    def fromAnnex(o: Annex, isCompact: B): String = {
      val st = _root_.org.sireum.helper.$assign(Printer.printAnnex(o));
      if (isCompact)
        return st.renderCompact
      else
        return st.render
    };
    def toAnnex(s: String): Annex = {
      def fAnnex(parser: Parser): Annex = {
        val r = _root_.org.sireum.helper.$assign(parser.parseAnnex());
        return r
      };
      val r = _root_.org.sireum.helper.$assign(to(s, fAnnex));
      return r
    }
  }
}