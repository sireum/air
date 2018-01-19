package org.sireum.aadl.arsit.skema.ast {
  import org.sireum._

  @datatype trait AadlTop extends _root_.org.sireum.DatatypeSig

  object AadlXml {
    def apply(components: ISZ[Component]): AadlXml = new AadlXml(components);
    def unapply(o: AadlXml): _root_.scala.Option[ISZ[Component]] = _root_.scala.Some(o.components)
  }

  @datatype class AadlXml(_components: ISZ[Component]) extends AadlTop with _root_.org.sireum.DatatypeSig {
    def components = _components;
    override def toString: _root_.java.lang.String = {
      val sb = new _root_.java.lang.StringBuilder();
      sb.append("AadlXml");
      sb.append('(');
      sb.append(_root_.org.sireum.String.escape(this.components));
      sb.append(')');
      sb.toString
    };
    override def string: _root_.org.sireum.String = toString;
    override lazy val hashCode: _root_.scala.Int = _root_.scala.Seq(this.getClass, components).hashCode;
    override def equals(o: _root_.scala.Any): _root_.scala.Boolean = if (this.eq(o.asInstanceOf[_root_.scala.AnyRef]))
      true
    else
      o match {
        case (o @ ((_): AadlXml)) => if (this.hashCode.!=(o.hashCode))
          false
        else
          this.components.==(o.components)
        case _ => false
      };
    def apply(components: ISZ[Component] = this.components): AadlXml = new AadlXml(components);
    override lazy val content: _root_.scala.Seq[scala.Tuple2[_root_.java.lang.String, _root_.scala.Any]] = _root_.scala.Seq(scala.Tuple2("type", _root_.scala.List[_root_.java.lang.String]("org", "sireum", "aadl", "arsit", "skema", "ast", "AadlXml")), scala.Tuple2("components", this.components))
  }

  object Component {
    def apply(identifier: Option[String], category: ComponentCategory.Type, classifier: Option[Classifier], features: ISZ[Feature], subComponents: ISZ[Component], connections: ISZ[Connection], properties: ISZ[Property], flows: ISZ[Flow], modes: ISZ[Mode], annexes: ISZ[Annex]): Component = new Component(identifier, category, classifier, features, subComponents, connections, properties, flows, modes, annexes);
    def unapply(o: Component): _root_.scala.Option[scala.Tuple10[Option[String], ComponentCategory.Type, Option[Classifier], ISZ[Feature], ISZ[Component], ISZ[Connection], ISZ[Property], ISZ[Flow], ISZ[Mode], ISZ[Annex]]] = _root_.scala.Some(scala.Tuple10(o.identifier, o.category, o.classifier, o.features, o.subComponents, o.connections, o.properties, o.flows, o.modes, o.annexes))
  }

  @datatype class Component(_identifier: Option[String], _category: ComponentCategory.Type, _classifier: Option[Classifier], _features: ISZ[Feature], _subComponents: ISZ[Component], _connections: ISZ[Connection], _properties: ISZ[Property], _flows: ISZ[Flow], _modes: ISZ[Mode], _annexes: ISZ[Annex]) extends AadlTop with _root_.org.sireum.DatatypeSig {
    def identifier = _identifier;
    def category = _category;
    def classifier = _classifier;
    def features = _features;
    def subComponents = _subComponents;
    def connections = _connections;
    def properties = _properties;
    def flows = _flows;
    def modes = _modes;
    def annexes = _annexes;
    override def toString: _root_.java.lang.String = {
      val sb = new _root_.java.lang.StringBuilder();
      sb.append("Component");
      sb.append('(');
      sb.append(_root_.org.sireum.String.escape(this.identifier));
      sb.append(", ");
      sb.append(_root_.org.sireum.String.escape(this.category));
      sb.append(", ");
      sb.append(_root_.org.sireum.String.escape(this.classifier));
      sb.append(", ");
      sb.append(_root_.org.sireum.String.escape(this.features));
      sb.append(", ");
      sb.append(_root_.org.sireum.String.escape(this.subComponents));
      sb.append(", ");
      sb.append(_root_.org.sireum.String.escape(this.connections));
      sb.append(", ");
      sb.append(_root_.org.sireum.String.escape(this.properties));
      sb.append(", ");
      sb.append(_root_.org.sireum.String.escape(this.flows));
      sb.append(", ");
      sb.append(_root_.org.sireum.String.escape(this.modes));
      sb.append(", ");
      sb.append(_root_.org.sireum.String.escape(this.annexes));
      sb.append(')');
      sb.toString
    };
    override def string: _root_.org.sireum.String = toString;
    override lazy val hashCode: _root_.scala.Int = _root_.scala.Seq(this.getClass, identifier, category, classifier, features, subComponents, connections, properties, flows, modes, annexes).hashCode;
    override def equals(o: _root_.scala.Any): _root_.scala.Boolean = if (this.eq(o.asInstanceOf[_root_.scala.AnyRef]))
      true
    else
      o match {
        case (o @ ((_): Component)) => if (this.hashCode.!=(o.hashCode))
          false
        else
          this.identifier.==(o.identifier).&&(this.category.==(o.category)).&&(this.classifier.==(o.classifier)).&&(this.features.==(o.features)).&&(this.subComponents.==(o.subComponents)).&&(this.connections.==(o.connections)).&&(this.properties.==(o.properties)).&&(this.flows.==(o.flows)).&&(this.modes.==(o.modes)).&&(this.annexes.==(o.annexes))
        case _ => false
      };
    def apply(identifier: Option[String] = this.identifier, category: ComponentCategory.Type = this.category, classifier: Option[Classifier] = this.classifier, features: ISZ[Feature] = this.features, subComponents: ISZ[Component] = this.subComponents, connections: ISZ[Connection] = this.connections, properties: ISZ[Property] = this.properties, flows: ISZ[Flow] = this.flows, modes: ISZ[Mode] = this.modes, annexes: ISZ[Annex] = this.annexes): Component = new Component(identifier, category, classifier, features, subComponents, connections, properties, flows, modes, annexes);
    override lazy val content: _root_.scala.Seq[scala.Tuple2[_root_.java.lang.String, _root_.scala.Any]] = _root_.scala.Seq(scala.Tuple2("type", _root_.scala.List[_root_.java.lang.String]("org", "sireum", "aadl", "arsit", "skema", "ast", "Component")), scala.Tuple2("identifier", this.identifier), scala.Tuple2("category", this.category), scala.Tuple2("classifier", this.classifier), scala.Tuple2("features", this.features), scala.Tuple2("subComponents", this.subComponents), scala.Tuple2("connections", this.connections), scala.Tuple2("properties", this.properties), scala.Tuple2("flows", this.flows), scala.Tuple2("modes", this.modes), scala.Tuple2("annexes", this.annexes))
  }

  object Classifier {
    def apply(name: String): Classifier = new Classifier(name);
    def unapply(o: Classifier): _root_.scala.Option[String] = _root_.scala.Some(o.name)
  }

  @datatype class Classifier(_name: String) extends AadlTop with _root_.org.sireum.DatatypeSig {
    def name = _name;
    override def toString: _root_.java.lang.String = {
      val sb = new _root_.java.lang.StringBuilder();
      sb.append("Classifier");
      sb.append('(');
      sb.append(_root_.org.sireum.String.escape(this.name));
      sb.append(')');
      sb.toString
    };
    override def string: _root_.org.sireum.String = toString;
    override lazy val hashCode: _root_.scala.Int = _root_.scala.Seq(this.getClass, name).hashCode;
    override def equals(o: _root_.scala.Any): _root_.scala.Boolean = if (this.eq(o.asInstanceOf[_root_.scala.AnyRef]))
      true
    else
      o match {
        case (o @ ((_): Classifier)) => if (this.hashCode.!=(o.hashCode))
          false
        else
          this.name.==(o.name)
        case _ => false
      };
    def apply(name: String = this.name): Classifier = new Classifier(name);
    override lazy val content: _root_.scala.Seq[scala.Tuple2[_root_.java.lang.String, _root_.scala.Any]] = _root_.scala.Seq(scala.Tuple2("type", _root_.scala.List[_root_.java.lang.String]("org", "sireum", "aadl", "arsit", "skema", "ast", "Classifier")), scala.Tuple2("name", this.name))
  }

  @enum object ComponentCategory extends _root_.org.sireum.EnumSig {
    scala.Symbol("Abstract");
    scala.Symbol("Bus");
    scala.Symbol("Data");
    scala.Symbol("Device");
    scala.Symbol("Memory");
    scala.Symbol("Process");
    scala.Symbol("Processor");
    scala.Symbol("Subprogram");
    scala.Symbol("SubprogramGroup");
    scala.Symbol("System");
    scala.Symbol("Thread");
    scala.Symbol("ThreadGroup");
    scala.Symbol("VirtualBus");
    scala.Symbol("VirtualProcessor");
    sealed trait Type extends _root_.scala.Ordered[Type] {
      def ordinal: _root_.org.sireum.Z;
      def name: _root_.org.sireum.String;
      final def hash: _root_.org.sireum.Z = hashCode;
      final def isEqual(other: Type): _root_.org.sireum.B = this.==(other);
      final def compare(that: Type): _root_.scala.Int = this.ordinal.compareTo(that.ordinal)
    };
    final def byName(name: _root_.org.sireum.String): _root_.org.sireum.Option[Type] = elements.elements.find(((x$1) => x$1.name.==(name))) match {
      case _root_.scala.Some((v @ _)) => _root_.org.sireum.Some(v)
      case _ => _root_.org.sireum.None()
    };
    final def byOrdinal(n: _root_.org.sireum.Z): _root_.org.sireum.Option[Type] = if ((0).<=(n).&&(n.<(elements.size)))
      _root_.org.sireum.Some(elements(n))
    else
      _root_.org.sireum.None();
    final case object Abstract extends Type with scala.Product with scala.Serializable {
      def ordinal: _root_.org.sireum.Z = 0;
      def name: _root_.org.sireum.String = "Abstract"
    };
    final case object Bus extends Type with scala.Product with scala.Serializable {
      def ordinal: _root_.org.sireum.Z = 1;
      def name: _root_.org.sireum.String = "Bus"
    };
    final case object Data extends Type with scala.Product with scala.Serializable {
      def ordinal: _root_.org.sireum.Z = 2;
      def name: _root_.org.sireum.String = "Data"
    };
    final case object Device extends Type with scala.Product with scala.Serializable {
      def ordinal: _root_.org.sireum.Z = 3;
      def name: _root_.org.sireum.String = "Device"
    };
    final case object Memory extends Type with scala.Product with scala.Serializable {
      def ordinal: _root_.org.sireum.Z = 4;
      def name: _root_.org.sireum.String = "Memory"
    };
    final case object Process extends Type with scala.Product with scala.Serializable {
      def ordinal: _root_.org.sireum.Z = 5;
      def name: _root_.org.sireum.String = "Process"
    };
    final case object Processor extends Type with scala.Product with scala.Serializable {
      def ordinal: _root_.org.sireum.Z = 6;
      def name: _root_.org.sireum.String = "Processor"
    };
    final case object Subprogram extends Type with scala.Product with scala.Serializable {
      def ordinal: _root_.org.sireum.Z = 7;
      def name: _root_.org.sireum.String = "Subprogram"
    };
    final case object SubprogramGroup extends Type with scala.Product with scala.Serializable {
      def ordinal: _root_.org.sireum.Z = 8;
      def name: _root_.org.sireum.String = "SubprogramGroup"
    };
    final case object System extends Type with scala.Product with scala.Serializable {
      def ordinal: _root_.org.sireum.Z = 9;
      def name: _root_.org.sireum.String = "System"
    };
    final case object Thread extends Type with scala.Product with scala.Serializable {
      def ordinal: _root_.org.sireum.Z = 10;
      def name: _root_.org.sireum.String = "Thread"
    };
    final case object ThreadGroup extends Type with scala.Product with scala.Serializable {
      def ordinal: _root_.org.sireum.Z = 11;
      def name: _root_.org.sireum.String = "ThreadGroup"
    };
    final case object VirtualBus extends Type with scala.Product with scala.Serializable {
      def ordinal: _root_.org.sireum.Z = 12;
      def name: _root_.org.sireum.String = "VirtualBus"
    };
    final case object VirtualProcessor extends Type with scala.Product with scala.Serializable {
      def ordinal: _root_.org.sireum.Z = 13;
      def name: _root_.org.sireum.String = "VirtualProcessor"
    };
    val numOfElements: _root_.org.sireum.Z = 14;
    val elements: _root_.org.sireum.ISZ[Type] = _root_.org.sireum.ISZ[Type](Abstract, Bus, Data, Device, Memory, Process, Processor, Subprogram, SubprogramGroup, System, Thread, ThreadGroup, VirtualBus, VirtualProcessor)
  }

  object Feature {
    def apply(identifier: String, direction: Direction.Type, category: FeatureCategory.Type, classifier: Option[Classifier], properties: ISZ[Property]): Feature = new Feature(identifier, direction, category, classifier, properties);
    def unapply(o: Feature): _root_.scala.Option[scala.Tuple5[String, Direction.Type, FeatureCategory.Type, Option[Classifier], ISZ[Property]]] = _root_.scala.Some(scala.Tuple5(o.identifier, o.direction, o.category, o.classifier, o.properties))
  }

  @datatype class Feature(_identifier: String, _direction: Direction.Type, _category: FeatureCategory.Type, _classifier: Option[Classifier], _properties: ISZ[Property]) extends AadlTop with _root_.org.sireum.DatatypeSig {
    def identifier = _identifier;
    def direction = _direction;
    def category = _category;
    def classifier = _classifier;
    def properties = _properties;
    override def toString: _root_.java.lang.String = {
      val sb = new _root_.java.lang.StringBuilder();
      sb.append("Feature");
      sb.append('(');
      sb.append(_root_.org.sireum.String.escape(this.identifier));
      sb.append(", ");
      sb.append(_root_.org.sireum.String.escape(this.direction));
      sb.append(", ");
      sb.append(_root_.org.sireum.String.escape(this.category));
      sb.append(", ");
      sb.append(_root_.org.sireum.String.escape(this.classifier));
      sb.append(", ");
      sb.append(_root_.org.sireum.String.escape(this.properties));
      sb.append(')');
      sb.toString
    };
    override def string: _root_.org.sireum.String = toString;
    override lazy val hashCode: _root_.scala.Int = _root_.scala.Seq(this.getClass, identifier, direction, category, classifier, properties).hashCode;
    override def equals(o: _root_.scala.Any): _root_.scala.Boolean = if (this.eq(o.asInstanceOf[_root_.scala.AnyRef]))
      true
    else
      o match {
        case (o @ ((_): Feature)) => if (this.hashCode.!=(o.hashCode))
          false
        else
          this.identifier.==(o.identifier).&&(this.direction.==(o.direction)).&&(this.category.==(o.category)).&&(this.classifier.==(o.classifier)).&&(this.properties.==(o.properties))
        case _ => false
      };
    def apply(identifier: String = this.identifier, direction: Direction.Type = this.direction, category: FeatureCategory.Type = this.category, classifier: Option[Classifier] = this.classifier, properties: ISZ[Property] = this.properties): Feature = new Feature(identifier, direction, category, classifier, properties);
    override lazy val content: _root_.scala.Seq[scala.Tuple2[_root_.java.lang.String, _root_.scala.Any]] = _root_.scala.Seq(scala.Tuple2("type", _root_.scala.List[_root_.java.lang.String]("org", "sireum", "aadl", "arsit", "skema", "ast", "Feature")), scala.Tuple2("identifier", this.identifier), scala.Tuple2("direction", this.direction), scala.Tuple2("category", this.category), scala.Tuple2("classifier", this.classifier), scala.Tuple2("properties", this.properties))
  }

  @enum object Direction extends _root_.org.sireum.EnumSig {
    scala.Symbol("In");
    scala.Symbol("Out");
    scala.Symbol("InOut");
    scala.Symbol("None");
    sealed trait Type extends _root_.scala.Ordered[Type] {
      def ordinal: _root_.org.sireum.Z;
      def name: _root_.org.sireum.String;
      final def hash: _root_.org.sireum.Z = hashCode;
      final def isEqual(other: Type): _root_.org.sireum.B = this.==(other);
      final def compare(that: Type): _root_.scala.Int = this.ordinal.compareTo(that.ordinal)
    };
    final def byName(name: _root_.org.sireum.String): _root_.org.sireum.Option[Type] = elements.elements.find(((x$1) => x$1.name.==(name))) match {
      case _root_.scala.Some((v @ _)) => _root_.org.sireum.Some(v)
      case _ => _root_.org.sireum.None()
    };
    final def byOrdinal(n: _root_.org.sireum.Z): _root_.org.sireum.Option[Type] = if ((0).<=(n).&&(n.<(elements.size)))
      _root_.org.sireum.Some(elements(n))
    else
      _root_.org.sireum.None();
    final case object In extends Type with scala.Product with scala.Serializable {
      def ordinal: _root_.org.sireum.Z = 0;
      def name: _root_.org.sireum.String = "In"
    };
    final case object Out extends Type with scala.Product with scala.Serializable {
      def ordinal: _root_.org.sireum.Z = 1;
      def name: _root_.org.sireum.String = "Out"
    };
    final case object InOut extends Type with scala.Product with scala.Serializable {
      def ordinal: _root_.org.sireum.Z = 2;
      def name: _root_.org.sireum.String = "InOut"
    };
    final case object None extends Type with scala.Product with scala.Serializable {
      def ordinal: _root_.org.sireum.Z = 3;
      def name: _root_.org.sireum.String = "None"
    };
    val numOfElements: _root_.org.sireum.Z = 4;
    val elements: _root_.org.sireum.ISZ[Type] = _root_.org.sireum.ISZ[Type](In, Out, InOut, None)
  }

  @enum object FeatureCategory extends _root_.org.sireum.EnumSig {
    scala.Symbol("AbstractFeature");
    scala.Symbol("BusAccess");
    scala.Symbol("DataAccess");
    scala.Symbol("DataPort");
    scala.Symbol("EventPort");
    scala.Symbol("EventDataPort");
    scala.Symbol("FeatureGroup");
    scala.Symbol("Parameter");
    scala.Symbol("SubprogramAccess");
    scala.Symbol("SubprogramAccessGroup");
    sealed trait Type extends _root_.scala.Ordered[Type] {
      def ordinal: _root_.org.sireum.Z;
      def name: _root_.org.sireum.String;
      final def hash: _root_.org.sireum.Z = hashCode;
      final def isEqual(other: Type): _root_.org.sireum.B = this.==(other);
      final def compare(that: Type): _root_.scala.Int = this.ordinal.compareTo(that.ordinal)
    };
    final def byName(name: _root_.org.sireum.String): _root_.org.sireum.Option[Type] = elements.elements.find(((x$1) => x$1.name.==(name))) match {
      case _root_.scala.Some((v @ _)) => _root_.org.sireum.Some(v)
      case _ => _root_.org.sireum.None()
    };
    final def byOrdinal(n: _root_.org.sireum.Z): _root_.org.sireum.Option[Type] = if ((0).<=(n).&&(n.<(elements.size)))
      _root_.org.sireum.Some(elements(n))
    else
      _root_.org.sireum.None();
    final case object AbstractFeature extends Type with scala.Product with scala.Serializable {
      def ordinal: _root_.org.sireum.Z = 0;
      def name: _root_.org.sireum.String = "AbstractFeature"
    };
    final case object BusAccess extends Type with scala.Product with scala.Serializable {
      def ordinal: _root_.org.sireum.Z = 1;
      def name: _root_.org.sireum.String = "BusAccess"
    };
    final case object DataAccess extends Type with scala.Product with scala.Serializable {
      def ordinal: _root_.org.sireum.Z = 2;
      def name: _root_.org.sireum.String = "DataAccess"
    };
    final case object DataPort extends Type with scala.Product with scala.Serializable {
      def ordinal: _root_.org.sireum.Z = 3;
      def name: _root_.org.sireum.String = "DataPort"
    };
    final case object EventPort extends Type with scala.Product with scala.Serializable {
      def ordinal: _root_.org.sireum.Z = 4;
      def name: _root_.org.sireum.String = "EventPort"
    };
    final case object EventDataPort extends Type with scala.Product with scala.Serializable {
      def ordinal: _root_.org.sireum.Z = 5;
      def name: _root_.org.sireum.String = "EventDataPort"
    };
    final case object FeatureGroup extends Type with scala.Product with scala.Serializable {
      def ordinal: _root_.org.sireum.Z = 6;
      def name: _root_.org.sireum.String = "FeatureGroup"
    };
    final case object Parameter extends Type with scala.Product with scala.Serializable {
      def ordinal: _root_.org.sireum.Z = 7;
      def name: _root_.org.sireum.String = "Parameter"
    };
    final case object SubprogramAccess extends Type with scala.Product with scala.Serializable {
      def ordinal: _root_.org.sireum.Z = 8;
      def name: _root_.org.sireum.String = "SubprogramAccess"
    };
    final case object SubprogramAccessGroup extends Type with scala.Product with scala.Serializable {
      def ordinal: _root_.org.sireum.Z = 9;
      def name: _root_.org.sireum.String = "SubprogramAccessGroup"
    };
    val numOfElements: _root_.org.sireum.Z = 10;
    val elements: _root_.org.sireum.ISZ[Type] = _root_.org.sireum.ISZ[Type](AbstractFeature, BusAccess, DataAccess, DataPort, EventPort, EventDataPort, FeatureGroup, Parameter, SubprogramAccess, SubprogramAccessGroup)
  }

  object Connection {
    def apply(name: Option[String], src: EndPoint, dst: EndPoint, kind: ConnectionKind.Type, properties: ISZ[Property]): Connection = new Connection(name, src, dst, kind, properties);
    def unapply(o: Connection): _root_.scala.Option[scala.Tuple5[Option[String], EndPoint, EndPoint, ConnectionKind.Type, ISZ[Property]]] = _root_.scala.Some(scala.Tuple5(o.name, o.src, o.dst, o.kind, o.properties))
  }

  @datatype class Connection(_name: Option[String], _src: EndPoint, _dst: EndPoint, _kind: ConnectionKind.Type, _properties: ISZ[Property]) extends AadlTop with _root_.org.sireum.DatatypeSig {
    def name = _name;
    def src = _src;
    def dst = _dst;
    def kind = _kind;
    def properties = _properties;
    override def toString: _root_.java.lang.String = {
      val sb = new _root_.java.lang.StringBuilder();
      sb.append("Connection");
      sb.append('(');
      sb.append(_root_.org.sireum.String.escape(this.name));
      sb.append(", ");
      sb.append(_root_.org.sireum.String.escape(this.src));
      sb.append(", ");
      sb.append(_root_.org.sireum.String.escape(this.dst));
      sb.append(", ");
      sb.append(_root_.org.sireum.String.escape(this.kind));
      sb.append(", ");
      sb.append(_root_.org.sireum.String.escape(this.properties));
      sb.append(')');
      sb.toString
    };
    override def string: _root_.org.sireum.String = toString;
    override lazy val hashCode: _root_.scala.Int = _root_.scala.Seq(this.getClass, name, src, dst, kind, properties).hashCode;
    override def equals(o: _root_.scala.Any): _root_.scala.Boolean = if (this.eq(o.asInstanceOf[_root_.scala.AnyRef]))
      true
    else
      o match {
        case (o @ ((_): Connection)) => if (this.hashCode.!=(o.hashCode))
          false
        else
          this.name.==(o.name).&&(this.src.==(o.src)).&&(this.dst.==(o.dst)).&&(this.kind.==(o.kind)).&&(this.properties.==(o.properties))
        case _ => false
      };
    def apply(name: Option[String] = this.name, src: EndPoint = this.src, dst: EndPoint = this.dst, kind: ConnectionKind.Type = this.kind, properties: ISZ[Property] = this.properties): Connection = new Connection(name, src, dst, kind, properties);
    override lazy val content: _root_.scala.Seq[scala.Tuple2[_root_.java.lang.String, _root_.scala.Any]] = _root_.scala.Seq(scala.Tuple2("type", _root_.scala.List[_root_.java.lang.String]("org", "sireum", "aadl", "arsit", "skema", "ast", "Connection")), scala.Tuple2("name", this.name), scala.Tuple2("src", this.src), scala.Tuple2("dst", this.dst), scala.Tuple2("kind", this.kind), scala.Tuple2("properties", this.properties))
  }

  @enum object ConnectionKind extends _root_.org.sireum.EnumSig {
    scala.Symbol("Feature");
    scala.Symbol("Access");
    scala.Symbol("Parameter");
    scala.Symbol("Port");
    scala.Symbol("ModeTransition");
    scala.Symbol("FeatureGroup");
    sealed trait Type extends _root_.scala.Ordered[Type] {
      def ordinal: _root_.org.sireum.Z;
      def name: _root_.org.sireum.String;
      final def hash: _root_.org.sireum.Z = hashCode;
      final def isEqual(other: Type): _root_.org.sireum.B = this.==(other);
      final def compare(that: Type): _root_.scala.Int = this.ordinal.compareTo(that.ordinal)
    };
    final def byName(name: _root_.org.sireum.String): _root_.org.sireum.Option[Type] = elements.elements.find(((x$1) => x$1.name.==(name))) match {
      case _root_.scala.Some((v @ _)) => _root_.org.sireum.Some(v)
      case _ => _root_.org.sireum.None()
    };
    final def byOrdinal(n: _root_.org.sireum.Z): _root_.org.sireum.Option[Type] = if ((0).<=(n).&&(n.<(elements.size)))
      _root_.org.sireum.Some(elements(n))
    else
      _root_.org.sireum.None();
    final case object Feature extends Type with scala.Product with scala.Serializable {
      def ordinal: _root_.org.sireum.Z = 0;
      def name: _root_.org.sireum.String = "Feature"
    };
    final case object Access extends Type with scala.Product with scala.Serializable {
      def ordinal: _root_.org.sireum.Z = 1;
      def name: _root_.org.sireum.String = "Access"
    };
    final case object Parameter extends Type with scala.Product with scala.Serializable {
      def ordinal: _root_.org.sireum.Z = 2;
      def name: _root_.org.sireum.String = "Parameter"
    };
    final case object Port extends Type with scala.Product with scala.Serializable {
      def ordinal: _root_.org.sireum.Z = 3;
      def name: _root_.org.sireum.String = "Port"
    };
    final case object ModeTransition extends Type with scala.Product with scala.Serializable {
      def ordinal: _root_.org.sireum.Z = 4;
      def name: _root_.org.sireum.String = "ModeTransition"
    };
    final case object FeatureGroup extends Type with scala.Product with scala.Serializable {
      def ordinal: _root_.org.sireum.Z = 5;
      def name: _root_.org.sireum.String = "FeatureGroup"
    };
    val numOfElements: _root_.org.sireum.Z = 6;
    val elements: _root_.org.sireum.ISZ[Type] = _root_.org.sireum.ISZ[Type](Feature, Access, Parameter, Port, ModeTransition, FeatureGroup)
  }

  object EndPoint {
    def apply(component: String, feature: String): EndPoint = new EndPoint(component, feature);
    def unapply(o: EndPoint): _root_.scala.Option[scala.Tuple2[String, String]] = _root_.scala.Some(scala.Tuple2(o.component, o.feature))
  }

  @datatype class EndPoint(_component: String, _feature: String) extends AadlTop with _root_.org.sireum.DatatypeSig {
    def component = _component;
    def feature = _feature;
    override def toString: _root_.java.lang.String = {
      val sb = new _root_.java.lang.StringBuilder();
      sb.append("EndPoint");
      sb.append('(');
      sb.append(_root_.org.sireum.String.escape(this.component));
      sb.append(", ");
      sb.append(_root_.org.sireum.String.escape(this.feature));
      sb.append(')');
      sb.toString
    };
    override def string: _root_.org.sireum.String = toString;
    override lazy val hashCode: _root_.scala.Int = _root_.scala.Seq(this.getClass, component, feature).hashCode;
    override def equals(o: _root_.scala.Any): _root_.scala.Boolean = if (this.eq(o.asInstanceOf[_root_.scala.AnyRef]))
      true
    else
      o match {
        case (o @ ((_): EndPoint)) => if (this.hashCode.!=(o.hashCode))
          false
        else
          this.component.==(o.component).&&(this.feature.==(o.feature))
        case _ => false
      };
    def apply(component: String = this.component, feature: String = this.feature): EndPoint = new EndPoint(component, feature);
    override lazy val content: _root_.scala.Seq[scala.Tuple2[_root_.java.lang.String, _root_.scala.Any]] = _root_.scala.Seq(scala.Tuple2("type", _root_.scala.List[_root_.java.lang.String]("org", "sireum", "aadl", "arsit", "skema", "ast", "EndPoint")), scala.Tuple2("component", this.component), scala.Tuple2("feature", this.feature))
  }

  object Property {
    def apply(name: String, propertyValues: ISZ[PropertyValue]): Property = new Property(name, propertyValues);
    def unapply(o: Property): _root_.scala.Option[scala.Tuple2[String, ISZ[PropertyValue]]] = _root_.scala.Some(scala.Tuple2(o.name, o.propertyValues))
  }

  @datatype class Property(_name: String, _propertyValues: ISZ[PropertyValue]) extends AadlTop with _root_.org.sireum.DatatypeSig {
    def name = _name;
    def propertyValues = _propertyValues;
    override def toString: _root_.java.lang.String = {
      val sb = new _root_.java.lang.StringBuilder();
      sb.append("Property");
      sb.append('(');
      sb.append(_root_.org.sireum.String.escape(this.name));
      sb.append(", ");
      sb.append(_root_.org.sireum.String.escape(this.propertyValues));
      sb.append(')');
      sb.toString
    };
    override def string: _root_.org.sireum.String = toString;
    override lazy val hashCode: _root_.scala.Int = _root_.scala.Seq(this.getClass, name, propertyValues).hashCode;
    override def equals(o: _root_.scala.Any): _root_.scala.Boolean = if (this.eq(o.asInstanceOf[_root_.scala.AnyRef]))
      true
    else
      o match {
        case (o @ ((_): Property)) => if (this.hashCode.!=(o.hashCode))
          false
        else
          this.name.==(o.name).&&(this.propertyValues.==(o.propertyValues))
        case _ => false
      };
    def apply(name: String = this.name, propertyValues: ISZ[PropertyValue] = this.propertyValues): Property = new Property(name, propertyValues);
    override lazy val content: _root_.scala.Seq[scala.Tuple2[_root_.java.lang.String, _root_.scala.Any]] = _root_.scala.Seq(scala.Tuple2("type", _root_.scala.List[_root_.java.lang.String]("org", "sireum", "aadl", "arsit", "skema", "ast", "Property")), scala.Tuple2("name", this.name), scala.Tuple2("propertyValues", this.propertyValues))
  }

  @datatype trait PropertyValue extends _root_.org.sireum.DatatypeSig

  object ClassifierProp {
    def apply(name: String): ClassifierProp = new ClassifierProp(name);
    def unapply(o: ClassifierProp): _root_.scala.Option[String] = _root_.scala.Some(o.name)
  }

  @datatype class ClassifierProp(_name: String) extends PropertyValue with _root_.org.sireum.DatatypeSig {
    def name = _name;
    override def toString: _root_.java.lang.String = {
      val sb = new _root_.java.lang.StringBuilder();
      sb.append("ClassifierProp");
      sb.append('(');
      sb.append(_root_.org.sireum.String.escape(this.name));
      sb.append(')');
      sb.toString
    };
    override def string: _root_.org.sireum.String = toString;
    override lazy val hashCode: _root_.scala.Int = _root_.scala.Seq(this.getClass, name).hashCode;
    override def equals(o: _root_.scala.Any): _root_.scala.Boolean = if (this.eq(o.asInstanceOf[_root_.scala.AnyRef]))
      true
    else
      o match {
        case (o @ ((_): ClassifierProp)) => if (this.hashCode.!=(o.hashCode))
          false
        else
          this.name.==(o.name)
        case _ => false
      };
    def apply(name: String = this.name): ClassifierProp = new ClassifierProp(name);
    override lazy val content: _root_.scala.Seq[scala.Tuple2[_root_.java.lang.String, _root_.scala.Any]] = _root_.scala.Seq(scala.Tuple2("type", _root_.scala.List[_root_.java.lang.String]("org", "sireum", "aadl", "arsit", "skema", "ast", "ClassifierProp")), scala.Tuple2("name", this.name))
  }

  object RangeProp {
    def apply(ValueLow: String, ValueHigh: String, Unit: Option[String]): RangeProp = new RangeProp(ValueLow, ValueHigh, Unit);
    def unapply(o: RangeProp): _root_.scala.Option[scala.Tuple3[String, String, Option[String]]] = _root_.scala.Some(scala.Tuple3(o.ValueLow, o.ValueHigh, o.Unit))
  }

  @datatype class RangeProp(_ValueLow: String, _ValueHigh: String, _Unit: Option[String]) extends PropertyValue with _root_.org.sireum.DatatypeSig {
    def ValueLow = _ValueLow;
    def ValueHigh = _ValueHigh;
    def Unit = _Unit;
    override def toString: _root_.java.lang.String = {
      val sb = new _root_.java.lang.StringBuilder();
      sb.append("RangeProp");
      sb.append('(');
      sb.append(_root_.org.sireum.String.escape(this.ValueLow));
      sb.append(", ");
      sb.append(_root_.org.sireum.String.escape(this.ValueHigh));
      sb.append(", ");
      sb.append(_root_.org.sireum.String.escape(this.Unit));
      sb.append(')');
      sb.toString
    };
    override def string: _root_.org.sireum.String = toString;
    override lazy val hashCode: _root_.scala.Int = _root_.scala.Seq(this.getClass, ValueLow, ValueHigh, Unit).hashCode;
    override def equals(o: _root_.scala.Any): _root_.scala.Boolean = if (this.eq(o.asInstanceOf[_root_.scala.AnyRef]))
      true
    else
      o match {
        case (o @ ((_): RangeProp)) => if (this.hashCode.!=(o.hashCode))
          false
        else
          this.ValueLow.==(o.ValueLow).&&(this.ValueHigh.==(o.ValueHigh)).&&(this.Unit.==(o.Unit))
        case _ => false
      };
    def apply(ValueLow: String = this.ValueLow, ValueHigh: String = this.ValueHigh, Unit: Option[String] = this.Unit): RangeProp = new RangeProp(ValueLow, ValueHigh, Unit);
    override lazy val content: _root_.scala.Seq[scala.Tuple2[_root_.java.lang.String, _root_.scala.Any]] = _root_.scala.Seq(scala.Tuple2("type", _root_.scala.List[_root_.java.lang.String]("org", "sireum", "aadl", "arsit", "skema", "ast", "RangeProp")), scala.Tuple2("ValueLow", this.ValueLow), scala.Tuple2("ValueHigh", this.ValueHigh), scala.Tuple2("Unit", this.Unit))
  }

  object ReferenceProp {
    def apply(value: String): ReferenceProp = new ReferenceProp(value);
    def unapply(o: ReferenceProp): _root_.scala.Option[String] = _root_.scala.Some(o.value)
  }

  @datatype class ReferenceProp(_value: String) extends PropertyValue with _root_.org.sireum.DatatypeSig {
    def value = _value;
    override def toString: _root_.java.lang.String = {
      val sb = new _root_.java.lang.StringBuilder();
      sb.append("ReferenceProp");
      sb.append('(');
      sb.append(_root_.org.sireum.String.escape(this.value));
      sb.append(')');
      sb.toString
    };
    override def string: _root_.org.sireum.String = toString;
    override lazy val hashCode: _root_.scala.Int = _root_.scala.Seq(this.getClass, value).hashCode;
    override def equals(o: _root_.scala.Any): _root_.scala.Boolean = if (this.eq(o.asInstanceOf[_root_.scala.AnyRef]))
      true
    else
      o match {
        case (o @ ((_): ReferenceProp)) => if (this.hashCode.!=(o.hashCode))
          false
        else
          this.value.==(o.value)
        case _ => false
      };
    def apply(value: String = this.value): ReferenceProp = new ReferenceProp(value);
    override lazy val content: _root_.scala.Seq[scala.Tuple2[_root_.java.lang.String, _root_.scala.Any]] = _root_.scala.Seq(scala.Tuple2("type", _root_.scala.List[_root_.java.lang.String]("org", "sireum", "aadl", "arsit", "skema", "ast", "ReferenceProp")), scala.Tuple2("value", this.value))
  }

  object UnitProp {
    def apply(value: String, unit: String): UnitProp = new UnitProp(value, unit);
    def unapply(o: UnitProp): _root_.scala.Option[scala.Tuple2[String, String]] = _root_.scala.Some(scala.Tuple2(o.value, o.unit))
  }

  @datatype class UnitProp(_value: String, _unit: String) extends PropertyValue with _root_.org.sireum.DatatypeSig {
    def value = _value;
    def unit = _unit;
    override def toString: _root_.java.lang.String = {
      val sb = new _root_.java.lang.StringBuilder();
      sb.append("UnitProp");
      sb.append('(');
      sb.append(_root_.org.sireum.String.escape(this.value));
      sb.append(", ");
      sb.append(_root_.org.sireum.String.escape(this.unit));
      sb.append(')');
      sb.toString
    };
    override def string: _root_.org.sireum.String = toString;
    override lazy val hashCode: _root_.scala.Int = _root_.scala.Seq(this.getClass, value, unit).hashCode;
    override def equals(o: _root_.scala.Any): _root_.scala.Boolean = if (this.eq(o.asInstanceOf[_root_.scala.AnyRef]))
      true
    else
      o match {
        case (o @ ((_): UnitProp)) => if (this.hashCode.!=(o.hashCode))
          false
        else
          this.value.==(o.value).&&(this.unit.==(o.unit))
        case _ => false
      };
    def apply(value: String = this.value, unit: String = this.unit): UnitProp = new UnitProp(value, unit);
    override lazy val content: _root_.scala.Seq[scala.Tuple2[_root_.java.lang.String, _root_.scala.Any]] = _root_.scala.Seq(scala.Tuple2("type", _root_.scala.List[_root_.java.lang.String]("org", "sireum", "aadl", "arsit", "skema", "ast", "UnitProp")), scala.Tuple2("value", this.value), scala.Tuple2("unit", this.unit))
  }

  object ValueProp {
    def apply(value: String): ValueProp = new ValueProp(value);
    def unapply(o: ValueProp): _root_.scala.Option[String] = _root_.scala.Some(o.value)
  }

  @datatype class ValueProp(_value: String) extends PropertyValue with _root_.org.sireum.DatatypeSig {
    def value = _value;
    override def toString: _root_.java.lang.String = {
      val sb = new _root_.java.lang.StringBuilder();
      sb.append("ValueProp");
      sb.append('(');
      sb.append(_root_.org.sireum.String.escape(this.value));
      sb.append(')');
      sb.toString
    };
    override def string: _root_.org.sireum.String = toString;
    override lazy val hashCode: _root_.scala.Int = _root_.scala.Seq(this.getClass, value).hashCode;
    override def equals(o: _root_.scala.Any): _root_.scala.Boolean = if (this.eq(o.asInstanceOf[_root_.scala.AnyRef]))
      true
    else
      o match {
        case (o @ ((_): ValueProp)) => if (this.hashCode.!=(o.hashCode))
          false
        else
          this.value.==(o.value)
        case _ => false
      };
    def apply(value: String = this.value): ValueProp = new ValueProp(value);
    override lazy val content: _root_.scala.Seq[scala.Tuple2[_root_.java.lang.String, _root_.scala.Any]] = _root_.scala.Seq(scala.Tuple2("type", _root_.scala.List[_root_.java.lang.String]("org", "sireum", "aadl", "arsit", "skema", "ast", "ValueProp")), scala.Tuple2("value", this.value))
  }

  object Mode {
    def apply(name: String): Mode = new Mode(name);
    def unapply(o: Mode): _root_.scala.Option[String] = _root_.scala.Some(o.name)
  }

  @datatype class Mode(_name: String) extends AadlTop with _root_.org.sireum.DatatypeSig {
    def name = _name;
    override def toString: _root_.java.lang.String = {
      val sb = new _root_.java.lang.StringBuilder();
      sb.append("Mode");
      sb.append('(');
      sb.append(_root_.org.sireum.String.escape(this.name));
      sb.append(')');
      sb.toString
    };
    override def string: _root_.org.sireum.String = toString;
    override lazy val hashCode: _root_.scala.Int = _root_.scala.Seq(this.getClass, name).hashCode;
    override def equals(o: _root_.scala.Any): _root_.scala.Boolean = if (this.eq(o.asInstanceOf[_root_.scala.AnyRef]))
      true
    else
      o match {
        case (o @ ((_): Mode)) => if (this.hashCode.!=(o.hashCode))
          false
        else
          this.name.==(o.name)
        case _ => false
      };
    def apply(name: String = this.name): Mode = new Mode(name);
    override lazy val content: _root_.scala.Seq[scala.Tuple2[_root_.java.lang.String, _root_.scala.Any]] = _root_.scala.Seq(scala.Tuple2("type", _root_.scala.List[_root_.java.lang.String]("org", "sireum", "aadl", "arsit", "skema", "ast", "Mode")), scala.Tuple2("name", this.name))
  }

  object Flow {
    def apply(name: String): Flow = new Flow(name);
    def unapply(o: Flow): _root_.scala.Option[String] = _root_.scala.Some(o.name)
  }

  @datatype class Flow(_name: String) extends AadlTop with _root_.org.sireum.DatatypeSig {
    def name = _name;
    override def toString: _root_.java.lang.String = {
      val sb = new _root_.java.lang.StringBuilder();
      sb.append("Flow");
      sb.append('(');
      sb.append(_root_.org.sireum.String.escape(this.name));
      sb.append(')');
      sb.toString
    };
    override def string: _root_.org.sireum.String = toString;
    override lazy val hashCode: _root_.scala.Int = _root_.scala.Seq(this.getClass, name).hashCode;
    override def equals(o: _root_.scala.Any): _root_.scala.Boolean = if (this.eq(o.asInstanceOf[_root_.scala.AnyRef]))
      true
    else
      o match {
        case (o @ ((_): Flow)) => if (this.hashCode.!=(o.hashCode))
          false
        else
          this.name.==(o.name)
        case _ => false
      };
    def apply(name: String = this.name): Flow = new Flow(name);
    override lazy val content: _root_.scala.Seq[scala.Tuple2[_root_.java.lang.String, _root_.scala.Any]] = _root_.scala.Seq(scala.Tuple2("type", _root_.scala.List[_root_.java.lang.String]("org", "sireum", "aadl", "arsit", "skema", "ast", "Flow")), scala.Tuple2("name", this.name))
  }

  object Annex {
    def apply(name: String): Annex = new Annex(name);
    def unapply(o: Annex): _root_.scala.Option[String] = _root_.scala.Some(o.name)
  }

  @datatype class Annex(_name: String) extends AadlTop with _root_.org.sireum.DatatypeSig {
    def name = _name;
    override def toString: _root_.java.lang.String = {
      val sb = new _root_.java.lang.StringBuilder();
      sb.append("Annex");
      sb.append('(');
      sb.append(_root_.org.sireum.String.escape(this.name));
      sb.append(')');
      sb.toString
    };
    override def string: _root_.org.sireum.String = toString;
    override lazy val hashCode: _root_.scala.Int = _root_.scala.Seq(this.getClass, name).hashCode;
    override def equals(o: _root_.scala.Any): _root_.scala.Boolean = if (this.eq(o.asInstanceOf[_root_.scala.AnyRef]))
      true
    else
      o match {
        case (o @ ((_): Annex)) => if (this.hashCode.!=(o.hashCode))
          false
        else
          this.name.==(o.name)
        case _ => false
      };
    def apply(name: String = this.name): Annex = new Annex(name);
    override lazy val content: _root_.scala.Seq[scala.Tuple2[_root_.java.lang.String, _root_.scala.Any]] = _root_.scala.Seq(scala.Tuple2("type", _root_.scala.List[_root_.java.lang.String]("org", "sireum", "aadl", "arsit", "skema", "ast", "Annex")), scala.Tuple2("name", this.name))
  }
}