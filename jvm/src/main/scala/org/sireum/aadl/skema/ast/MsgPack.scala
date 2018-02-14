// #Sireum
// @formatter:off

// This file is auto-generated from AadlAST.scala

package org.sireum.aadl.skema.ast

import org.sireum._

object MsgPack {

  object Constants {

    val Aadl: Z = 0

    val Name: Z = 1

    val Component: Z = 2

    val Classifier: Z = 3

    val Feature: Z = 4

    val Connection: Z = 5

    val ConnectionInstance: Z = 6

    val ConnectionReference: Z = 7

    val EndPoint: Z = 8

    val Property: Z = 9

    val ClassifierProp: Z = 10

    val RangeProp: Z = 11

    val ReferenceProp: Z = 12

    val UnitProp: Z = 13

    val ValueProp: Z = 14

    val Mode: Z = 15

    val Flow: Z = 16

    val Annex: Z = 17

    val Emv2Library: Z = 18

    val Emv2Propagation: Z = 19

    val Emv2Flow: Z = 20

    val Emv2Clause: Z = 21

    val OtherAnnex: Z = 22

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeAadl(o: Aadl): Unit = {
      writer.writeZ(Constants.Aadl)
      writer.writeISZ(o.components, writeComponent)
      writer.writeISZ(o.errorLib, writeEmv2Library)
    }

    def writeName(o: Name): Unit = {
      writer.writeZ(Constants.Name)
      writer.writeISZ(o.name, writeString)
    }

    def writeComponent(o: Component): Unit = {
      writer.writeZ(Constants.Component)
      writeName(o.identifier)
      writeComponentCategory(o.category)
      writer.writeOption(o.classifier, writeClassifier)
      writer.writeISZ(o.features, writeFeature)
      writer.writeISZ(o.subComponents, writeComponent)
      writer.writeISZ(o.connections, writeConnection)
      writer.writeISZ(o.connectionInstances, writeConnectionInstance)
      writer.writeISZ(o.properties, writeProperty)
      writer.writeISZ(o.flows, writeFlow)
      writer.writeISZ(o.modes, writeMode)
      writer.writeISZ(o.annexes, writeAnnex)
    }

    def writeClassifier(o: Classifier): Unit = {
      writer.writeZ(Constants.Classifier)
      writeString(o.name)
    }

    def writeComponentCategory(o: ComponentCategory.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFeature(o: Feature): Unit = {
      writer.writeZ(Constants.Feature)
      writeName(o.identifier)
      writeDirection(o.direction)
      writeFeatureCategory(o.category)
      writer.writeOption(o.classifier, writeClassifier)
      writer.writeISZ(o.properties, writeProperty)
    }

    def writeDirection(o: Direction.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFeatureCategory(o: FeatureCategory.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeConnection(o: Connection): Unit = {
      writer.writeZ(Constants.Connection)
      writeName(o.name)
      writeEndPoint(o.src)
      writeEndPoint(o.dst)
      writeB(o.isBiDirectional)
      writer.writeISZ(o.connectionInstances, writeName)
      writer.writeISZ(o.properties, writeProperty)
    }

    def writeConnectionInstance(o: ConnectionInstance): Unit = {
      writer.writeZ(Constants.ConnectionInstance)
      writeName(o.name)
      writeEndPoint(o.src)
      writeEndPoint(o.dst)
      writeConnectionKind(o.kind)
      writer.writeISZ(o.connectionRefs, writeConnectionReference)
      writer.writeISZ(o.properties, writeProperty)
    }

    def writeConnectionReference(o: ConnectionReference): Unit = {
      writer.writeZ(Constants.ConnectionReference)
      writeName(o.name)
      writeName(o.context)
      writeB(o.isParent)
    }

    def writeConnectionKind(o: ConnectionKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEndPoint(o: EndPoint): Unit = {
      writer.writeZ(Constants.EndPoint)
      writeName(o.component)
      writeName(o.feature)
    }

    def writeProperty(o: Property): Unit = {
      writer.writeZ(Constants.Property)
      writeName(o.name)
      writer.writeISZ(o.propertyValues, writePropertyValue)
    }

    def writePropertyValue(o: PropertyValue): Unit = {
      o match {
        case o: ClassifierProp => writeClassifierProp(o)
        case o: RangeProp => writeRangeProp(o)
        case o: ReferenceProp => writeReferenceProp(o)
        case o: UnitProp => writeUnitProp(o)
        case o: ValueProp => writeValueProp(o)
      }
    }

    def writeClassifierProp(o: ClassifierProp): Unit = {
      writer.writeZ(Constants.ClassifierProp)
      writeString(o.name)
    }

    def writeRangeProp(o: RangeProp): Unit = {
      writer.writeZ(Constants.RangeProp)
      writeString(o.ValueLow)
      writeString(o.ValueHigh)
      writer.writeOption(o.Unit, writeString)
    }

    def writeReferenceProp(o: ReferenceProp): Unit = {
      writer.writeZ(Constants.ReferenceProp)
      writeString(o.value)
    }

    def writeUnitProp(o: UnitProp): Unit = {
      writer.writeZ(Constants.UnitProp)
      writeString(o.value)
      writeString(o.unit)
    }

    def writeValueProp(o: ValueProp): Unit = {
      writer.writeZ(Constants.ValueProp)
      writeString(o.value)
    }

    def writeMode(o: Mode): Unit = {
      writer.writeZ(Constants.Mode)
      writeName(o.name)
    }

    def writeFlowKind(o: FlowKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFlow(o: Flow): Unit = {
      writer.writeZ(Constants.Flow)
      writeName(o.name)
      writeFlowKind(o.kind)
      writer.writeOption(o.source, writeString)
      writer.writeOption(o.sink, writeString)
    }

    def writeAnnex(o: Annex): Unit = {
      writer.writeZ(Constants.Annex)
      writeString(o.name)
      writeAnnexClause(o.clause)
    }

    def writeAnnexClause(o: AnnexClause): Unit = {
      o match {
        case o: Emv2Library => writeEmv2Library(o)
        case o: Emv2Propagation => writeEmv2Propagation(o)
        case o: Emv2Flow => writeEmv2Flow(o)
        case o: Emv2Clause => writeEmv2Clause(o)
        case o: OtherAnnex => writeOtherAnnex(o)
      }
    }

    def writeEmv2Annex(o: Emv2Annex): Unit = {
      o match {
        case o: Emv2Library => writeEmv2Library(o)
        case o: Emv2Propagation => writeEmv2Propagation(o)
        case o: Emv2Flow => writeEmv2Flow(o)
        case o: Emv2Clause => writeEmv2Clause(o)
      }
    }

    def writePropagationDirection(o: PropagationDirection.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEmv2Library(o: Emv2Library): Unit = {
      writer.writeZ(Constants.Emv2Library)
      writeName(o.name)
      writer.writeISZ(o.tokens, writeString)
    }

    def writeEmv2Propagation(o: Emv2Propagation): Unit = {
      writer.writeZ(Constants.Emv2Propagation)
      writePropagationDirection(o.direction)
      writer.writeISZ(o.propagationPoint, writeString)
      writer.writeISZ(o.errorTokens, writeString)
    }

    def writeEmv2Flow(o: Emv2Flow): Unit = {
      writer.writeZ(Constants.Emv2Flow)
      writeName(o.identifier)
      writeFlowKind(o.kind)
      writer.writeOption(o.sourcePropagation, writeEmv2Propagation)
      writer.writeOption(o.sinkPropagation, writeEmv2Propagation)
    }

    def writeEmv2Clause(o: Emv2Clause): Unit = {
      writer.writeZ(Constants.Emv2Clause)
      writer.writeISZ(o.libraries, writeString)
      writer.writeISZ(o.propagations, writeEmv2Propagation)
      writer.writeISZ(o.flows, writeEmv2Flow)
    }

    def writeOtherAnnex(o: OtherAnnex): Unit = {
      writer.writeZ(Constants.OtherAnnex)
      writeString(o.clause)
    }

    def writeB(b: B): Unit = {
      writer.writeB(b)
    }

    def writeC(c: C): Unit = {
      writer.writeC(c)
    }

    def writeZ(n: Z): Unit = {
      writer.writeZ(n)
    }

    def writeZ8(n: Z8): Unit = {
      writer.writeZ8(n)
    }

    def writeZ16(n: Z16): Unit = {
      writer.writeZ16(n)
    }

    def writeZ32(n: Z32): Unit = {
      writer.writeZ32(n)
    }

    def writeZ64(n: Z64): Unit = {
      writer.writeZ64(n)
    }

    def writeN(n: N): Unit = {
      writer.writeN(n)
    }

    def writeN8(n: N8): Unit = {
      writer.writeN8(n)
    }

    def writeN16(n: N16): Unit = {
      writer.writeN16(n)
    }

    def writeN32(n: N32): Unit = {
      writer.writeN32(n)
    }

    def writeN64(n: N64): Unit = {
      writer.writeN64(n)
    }

    def writeS8(n: S8): Unit = {
      writer.writeS8(n)
    }

    def writeS16(n: S16): Unit = {
      writer.writeS16(n)
    }

    def writeS32(n: S32): Unit = {
      writer.writeS32(n)
    }

    def writeS64(n: S64): Unit = {
      writer.writeS64(n)
    }

    def writeU8(n: U8): Unit = {
      writer.writeU8(n)
    }

    def writeU16(n: U16): Unit = {
      writer.writeU16(n)
    }

    def writeU32(n: U32): Unit = {
      writer.writeU32(n)
    }

    def writeU64(n: U64): Unit = {
      writer.writeU64(n)
    }

    def writeR(n: R): Unit = {
      writer.writeR(n)
    }

    def writeF32(n: F32): Unit = {
      writer.writeF32(n)
    }

    def writeF64(n: F64): Unit = {
      writer.writeF64(n)
    }

    def writeString(s: String): Unit = {
      writer.writeString(s)
    }

    def result: ISZ[U8] = {
      return writer.result
    }

  }

  object Reader {

    @record class Default(val reader: MessagePack.Reader) extends Reader

  }

  @msig trait Reader {

    def reader: MessagePack.Reader

    def readAadl(): Aadl = {
      val r = readAadlT(F)
      return r
    }

    def readAadlT(typeParsed: B): Aadl = {
      if (!typeParsed) {
        reader.expectZ(Constants.Aadl)
      }
      val components = reader.readISZ(readComponent _)
      val errorLib = reader.readISZ(readEmv2Library _)
      return Aadl(components, errorLib)
    }

    def readName(): Name = {
      val r = readNameT(F)
      return r
    }

    def readNameT(typeParsed: B): Name = {
      if (!typeParsed) {
        reader.expectZ(Constants.Name)
      }
      val name = reader.readISZ(reader.readString _)
      return Name(name)
    }

    def readComponent(): Component = {
      val r = readComponentT(F)
      return r
    }

    def readComponentT(typeParsed: B): Component = {
      if (!typeParsed) {
        reader.expectZ(Constants.Component)
      }
      val identifier = readName()
      val category = readComponentCategory()
      val classifier = reader.readOption(readClassifier _)
      val features = reader.readISZ(readFeature _)
      val subComponents = reader.readISZ(readComponent _)
      val connections = reader.readISZ(readConnection _)
      val connectionInstances = reader.readISZ(readConnectionInstance _)
      val properties = reader.readISZ(readProperty _)
      val flows = reader.readISZ(readFlow _)
      val modes = reader.readISZ(readMode _)
      val annexes = reader.readISZ(readAnnex _)
      return Component(identifier, category, classifier, features, subComponents, connections, connectionInstances, properties, flows, modes, annexes)
    }

    def readClassifier(): Classifier = {
      val r = readClassifierT(F)
      return r
    }

    def readClassifierT(typeParsed: B): Classifier = {
      if (!typeParsed) {
        reader.expectZ(Constants.Classifier)
      }
      val name = reader.readString()
      return Classifier(name)
    }

    def readComponentCategory(): ComponentCategory.Type = {
      val r = reader.readZ()
      return ComponentCategory.byOrdinal(r).get
    }

    def readFeature(): Feature = {
      val r = readFeatureT(F)
      return r
    }

    def readFeatureT(typeParsed: B): Feature = {
      if (!typeParsed) {
        reader.expectZ(Constants.Feature)
      }
      val identifier = readName()
      val direction = readDirection()
      val category = readFeatureCategory()
      val classifier = reader.readOption(readClassifier _)
      val properties = reader.readISZ(readProperty _)
      return Feature(identifier, direction, category, classifier, properties)
    }

    def readDirection(): Direction.Type = {
      val r = reader.readZ()
      return Direction.byOrdinal(r).get
    }

    def readFeatureCategory(): FeatureCategory.Type = {
      val r = reader.readZ()
      return FeatureCategory.byOrdinal(r).get
    }

    def readConnection(): Connection = {
      val r = readConnectionT(F)
      return r
    }

    def readConnectionT(typeParsed: B): Connection = {
      if (!typeParsed) {
        reader.expectZ(Constants.Connection)
      }
      val name = readName()
      val src = readEndPoint()
      val dst = readEndPoint()
      val isBiDirectional = reader.readB()
      val connectionInstances = reader.readISZ(readName _)
      val properties = reader.readISZ(readProperty _)
      return Connection(name, src, dst, isBiDirectional, connectionInstances, properties)
    }

    def readConnectionInstance(): ConnectionInstance = {
      val r = readConnectionInstanceT(F)
      return r
    }

    def readConnectionInstanceT(typeParsed: B): ConnectionInstance = {
      if (!typeParsed) {
        reader.expectZ(Constants.ConnectionInstance)
      }
      val name = readName()
      val src = readEndPoint()
      val dst = readEndPoint()
      val kind = readConnectionKind()
      val connectionRefs = reader.readISZ(readConnectionReference _)
      val properties = reader.readISZ(readProperty _)
      return ConnectionInstance(name, src, dst, kind, connectionRefs, properties)
    }

    def readConnectionReference(): ConnectionReference = {
      val r = readConnectionReferenceT(F)
      return r
    }

    def readConnectionReferenceT(typeParsed: B): ConnectionReference = {
      if (!typeParsed) {
        reader.expectZ(Constants.ConnectionReference)
      }
      val name = readName()
      val context = readName()
      val isParent = reader.readB()
      return ConnectionReference(name, context, isParent)
    }

    def readConnectionKind(): ConnectionKind.Type = {
      val r = reader.readZ()
      return ConnectionKind.byOrdinal(r).get
    }

    def readEndPoint(): EndPoint = {
      val r = readEndPointT(F)
      return r
    }

    def readEndPointT(typeParsed: B): EndPoint = {
      if (!typeParsed) {
        reader.expectZ(Constants.EndPoint)
      }
      val component = readName()
      val feature = readName()
      return EndPoint(component, feature)
    }

    def readProperty(): Property = {
      val r = readPropertyT(F)
      return r
    }

    def readPropertyT(typeParsed: B): Property = {
      if (!typeParsed) {
        reader.expectZ(Constants.Property)
      }
      val name = readName()
      val propertyValues = reader.readISZ(readPropertyValue _)
      return Property(name, propertyValues)
    }

    def readPropertyValue(): PropertyValue = {
      val t = reader.readZ()
      t match {
        case Constants.ClassifierProp => val r = readClassifierPropT(T); return r
        case Constants.RangeProp => val r = readRangePropT(T); return r
        case Constants.ReferenceProp => val r = readReferencePropT(T); return r
        case Constants.UnitProp => val r = readUnitPropT(T); return r
        case Constants.ValueProp => val r = readValuePropT(T); return r
        case _ => halt(s"Unexpected type code $t.")
      }
    }

    def readClassifierProp(): ClassifierProp = {
      val r = readClassifierPropT(F)
      return r
    }

    def readClassifierPropT(typeParsed: B): ClassifierProp = {
      if (!typeParsed) {
        reader.expectZ(Constants.ClassifierProp)
      }
      val name = reader.readString()
      return ClassifierProp(name)
    }

    def readRangeProp(): RangeProp = {
      val r = readRangePropT(F)
      return r
    }

    def readRangePropT(typeParsed: B): RangeProp = {
      if (!typeParsed) {
        reader.expectZ(Constants.RangeProp)
      }
      val ValueLow = reader.readString()
      val ValueHigh = reader.readString()
      val Unit = reader.readOption(reader.readString _)
      return RangeProp(ValueLow, ValueHigh, Unit)
    }

    def readReferenceProp(): ReferenceProp = {
      val r = readReferencePropT(F)
      return r
    }

    def readReferencePropT(typeParsed: B): ReferenceProp = {
      if (!typeParsed) {
        reader.expectZ(Constants.ReferenceProp)
      }
      val value = reader.readString()
      return ReferenceProp(value)
    }

    def readUnitProp(): UnitProp = {
      val r = readUnitPropT(F)
      return r
    }

    def readUnitPropT(typeParsed: B): UnitProp = {
      if (!typeParsed) {
        reader.expectZ(Constants.UnitProp)
      }
      val value = reader.readString()
      val unit = reader.readString()
      return UnitProp(value, unit)
    }

    def readValueProp(): ValueProp = {
      val r = readValuePropT(F)
      return r
    }

    def readValuePropT(typeParsed: B): ValueProp = {
      if (!typeParsed) {
        reader.expectZ(Constants.ValueProp)
      }
      val value = reader.readString()
      return ValueProp(value)
    }

    def readMode(): Mode = {
      val r = readModeT(F)
      return r
    }

    def readModeT(typeParsed: B): Mode = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mode)
      }
      val name = readName()
      return Mode(name)
    }

    def readFlowKind(): FlowKind.Type = {
      val r = reader.readZ()
      return FlowKind.byOrdinal(r).get
    }

    def readFlow(): Flow = {
      val r = readFlowT(F)
      return r
    }

    def readFlowT(typeParsed: B): Flow = {
      if (!typeParsed) {
        reader.expectZ(Constants.Flow)
      }
      val name = readName()
      val kind = readFlowKind()
      val source = reader.readOption(reader.readString _)
      val sink = reader.readOption(reader.readString _)
      return Flow(name, kind, source, sink)
    }

    def readAnnex(): Annex = {
      val r = readAnnexT(F)
      return r
    }

    def readAnnexT(typeParsed: B): Annex = {
      if (!typeParsed) {
        reader.expectZ(Constants.Annex)
      }
      val name = reader.readString()
      val clause = readAnnexClause()
      return Annex(name, clause)
    }

    def readAnnexClause(): AnnexClause = {
      val t = reader.readZ()
      t match {
        case Constants.Emv2Library => val r = readEmv2LibraryT(T); return r
        case Constants.Emv2Propagation => val r = readEmv2PropagationT(T); return r
        case Constants.Emv2Flow => val r = readEmv2FlowT(T); return r
        case Constants.Emv2Clause => val r = readEmv2ClauseT(T); return r
        case Constants.OtherAnnex => val r = readOtherAnnexT(T); return r
        case _ => halt(s"Unexpected type code $t.")
      }
    }

    def readEmv2Annex(): Emv2Annex = {
      val t = reader.readZ()
      t match {
        case Constants.Emv2Library => val r = readEmv2LibraryT(T); return r
        case Constants.Emv2Propagation => val r = readEmv2PropagationT(T); return r
        case Constants.Emv2Flow => val r = readEmv2FlowT(T); return r
        case Constants.Emv2Clause => val r = readEmv2ClauseT(T); return r
        case _ => halt(s"Unexpected type code $t.")
      }
    }

    def readPropagationDirection(): PropagationDirection.Type = {
      val r = reader.readZ()
      return PropagationDirection.byOrdinal(r).get
    }

    def readEmv2Library(): Emv2Library = {
      val r = readEmv2LibraryT(F)
      return r
    }

    def readEmv2LibraryT(typeParsed: B): Emv2Library = {
      if (!typeParsed) {
        reader.expectZ(Constants.Emv2Library)
      }
      val name = readName()
      val tokens = reader.readISZ(reader.readString _)
      return Emv2Library(name, tokens)
    }

    def readEmv2Propagation(): Emv2Propagation = {
      val r = readEmv2PropagationT(F)
      return r
    }

    def readEmv2PropagationT(typeParsed: B): Emv2Propagation = {
      if (!typeParsed) {
        reader.expectZ(Constants.Emv2Propagation)
      }
      val direction = readPropagationDirection()
      val propagationPoint = reader.readISZ(reader.readString _)
      val errorTokens = reader.readISZ(reader.readString _)
      return Emv2Propagation(direction, propagationPoint, errorTokens)
    }

    def readEmv2Flow(): Emv2Flow = {
      val r = readEmv2FlowT(F)
      return r
    }

    def readEmv2FlowT(typeParsed: B): Emv2Flow = {
      if (!typeParsed) {
        reader.expectZ(Constants.Emv2Flow)
      }
      val identifier = readName()
      val kind = readFlowKind()
      val sourcePropagation = reader.readOption(readEmv2Propagation _)
      val sinkPropagation = reader.readOption(readEmv2Propagation _)
      return Emv2Flow(identifier, kind, sourcePropagation, sinkPropagation)
    }

    def readEmv2Clause(): Emv2Clause = {
      val r = readEmv2ClauseT(F)
      return r
    }

    def readEmv2ClauseT(typeParsed: B): Emv2Clause = {
      if (!typeParsed) {
        reader.expectZ(Constants.Emv2Clause)
      }
      val libraries = reader.readISZ(reader.readString _)
      val propagations = reader.readISZ(readEmv2Propagation _)
      val flows = reader.readISZ(readEmv2Flow _)
      return Emv2Clause(libraries, propagations, flows)
    }

    def readOtherAnnex(): OtherAnnex = {
      val r = readOtherAnnexT(F)
      return r
    }

    def readOtherAnnexT(typeParsed: B): OtherAnnex = {
      if (!typeParsed) {
        reader.expectZ(Constants.OtherAnnex)
      }
      val clause = reader.readString()
      return OtherAnnex(clause)
    }

  }

  def to[T](data: ISZ[U8], f: Reader => T): T = {
    val rd = Reader.Default(MessagePack.reader(data))
    rd.reader.init()
    val r = f(rd)
    return r
  }

  def fromAadl(o: Aadl, poolString: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(poolString))
    w.writeAadl(o)
    return w.result
  }

  def toAadl(data: ISZ[U8]): Aadl = {
    def fAadl(reader: Reader): Aadl = {
      val r = reader.readAadl()
      return r
    }
    val r = to(data, fAadl)
    return r
  }

  def fromName(o: Name, poolString: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(poolString))
    w.writeName(o)
    return w.result
  }

  def toName(data: ISZ[U8]): Name = {
    def fName(reader: Reader): Name = {
      val r = reader.readName()
      return r
    }
    val r = to(data, fName)
    return r
  }

  def fromComponent(o: Component, poolString: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(poolString))
    w.writeComponent(o)
    return w.result
  }

  def toComponent(data: ISZ[U8]): Component = {
    def fComponent(reader: Reader): Component = {
      val r = reader.readComponent()
      return r
    }
    val r = to(data, fComponent)
    return r
  }

  def fromClassifier(o: Classifier, poolString: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(poolString))
    w.writeClassifier(o)
    return w.result
  }

  def toClassifier(data: ISZ[U8]): Classifier = {
    def fClassifier(reader: Reader): Classifier = {
      val r = reader.readClassifier()
      return r
    }
    val r = to(data, fClassifier)
    return r
  }

  def fromFeature(o: Feature, poolString: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(poolString))
    w.writeFeature(o)
    return w.result
  }

  def toFeature(data: ISZ[U8]): Feature = {
    def fFeature(reader: Reader): Feature = {
      val r = reader.readFeature()
      return r
    }
    val r = to(data, fFeature)
    return r
  }

  def fromConnection(o: Connection, poolString: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(poolString))
    w.writeConnection(o)
    return w.result
  }

  def toConnection(data: ISZ[U8]): Connection = {
    def fConnection(reader: Reader): Connection = {
      val r = reader.readConnection()
      return r
    }
    val r = to(data, fConnection)
    return r
  }

  def fromConnectionInstance(o: ConnectionInstance, poolString: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(poolString))
    w.writeConnectionInstance(o)
    return w.result
  }

  def toConnectionInstance(data: ISZ[U8]): ConnectionInstance = {
    def fConnectionInstance(reader: Reader): ConnectionInstance = {
      val r = reader.readConnectionInstance()
      return r
    }
    val r = to(data, fConnectionInstance)
    return r
  }

  def fromConnectionReference(o: ConnectionReference, poolString: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(poolString))
    w.writeConnectionReference(o)
    return w.result
  }

  def toConnectionReference(data: ISZ[U8]): ConnectionReference = {
    def fConnectionReference(reader: Reader): ConnectionReference = {
      val r = reader.readConnectionReference()
      return r
    }
    val r = to(data, fConnectionReference)
    return r
  }

  def fromEndPoint(o: EndPoint, poolString: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(poolString))
    w.writeEndPoint(o)
    return w.result
  }

  def toEndPoint(data: ISZ[U8]): EndPoint = {
    def fEndPoint(reader: Reader): EndPoint = {
      val r = reader.readEndPoint()
      return r
    }
    val r = to(data, fEndPoint)
    return r
  }

  def fromProperty(o: Property, poolString: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(poolString))
    w.writeProperty(o)
    return w.result
  }

  def toProperty(data: ISZ[U8]): Property = {
    def fProperty(reader: Reader): Property = {
      val r = reader.readProperty()
      return r
    }
    val r = to(data, fProperty)
    return r
  }

  def fromPropertyValue(o: PropertyValue, poolString: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(poolString))
    w.writePropertyValue(o)
    return w.result
  }

  def toPropertyValue(data: ISZ[U8]): PropertyValue = {
    def fPropertyValue(reader: Reader): PropertyValue = {
      val r = reader.readPropertyValue()
      return r
    }
    val r = to(data, fPropertyValue)
    return r
  }

  def fromClassifierProp(o: ClassifierProp, poolString: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(poolString))
    w.writeClassifierProp(o)
    return w.result
  }

  def toClassifierProp(data: ISZ[U8]): ClassifierProp = {
    def fClassifierProp(reader: Reader): ClassifierProp = {
      val r = reader.readClassifierProp()
      return r
    }
    val r = to(data, fClassifierProp)
    return r
  }

  def fromRangeProp(o: RangeProp, poolString: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(poolString))
    w.writeRangeProp(o)
    return w.result
  }

  def toRangeProp(data: ISZ[U8]): RangeProp = {
    def fRangeProp(reader: Reader): RangeProp = {
      val r = reader.readRangeProp()
      return r
    }
    val r = to(data, fRangeProp)
    return r
  }

  def fromReferenceProp(o: ReferenceProp, poolString: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(poolString))
    w.writeReferenceProp(o)
    return w.result
  }

  def toReferenceProp(data: ISZ[U8]): ReferenceProp = {
    def fReferenceProp(reader: Reader): ReferenceProp = {
      val r = reader.readReferenceProp()
      return r
    }
    val r = to(data, fReferenceProp)
    return r
  }

  def fromUnitProp(o: UnitProp, poolString: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(poolString))
    w.writeUnitProp(o)
    return w.result
  }

  def toUnitProp(data: ISZ[U8]): UnitProp = {
    def fUnitProp(reader: Reader): UnitProp = {
      val r = reader.readUnitProp()
      return r
    }
    val r = to(data, fUnitProp)
    return r
  }

  def fromValueProp(o: ValueProp, poolString: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(poolString))
    w.writeValueProp(o)
    return w.result
  }

  def toValueProp(data: ISZ[U8]): ValueProp = {
    def fValueProp(reader: Reader): ValueProp = {
      val r = reader.readValueProp()
      return r
    }
    val r = to(data, fValueProp)
    return r
  }

  def fromMode(o: Mode, poolString: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(poolString))
    w.writeMode(o)
    return w.result
  }

  def toMode(data: ISZ[U8]): Mode = {
    def fMode(reader: Reader): Mode = {
      val r = reader.readMode()
      return r
    }
    val r = to(data, fMode)
    return r
  }

  def fromFlow(o: Flow, poolString: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(poolString))
    w.writeFlow(o)
    return w.result
  }

  def toFlow(data: ISZ[U8]): Flow = {
    def fFlow(reader: Reader): Flow = {
      val r = reader.readFlow()
      return r
    }
    val r = to(data, fFlow)
    return r
  }

  def fromAnnex(o: Annex, poolString: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(poolString))
    w.writeAnnex(o)
    return w.result
  }

  def toAnnex(data: ISZ[U8]): Annex = {
    def fAnnex(reader: Reader): Annex = {
      val r = reader.readAnnex()
      return r
    }
    val r = to(data, fAnnex)
    return r
  }

  def fromAnnexClause(o: AnnexClause, poolString: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(poolString))
    w.writeAnnexClause(o)
    return w.result
  }

  def toAnnexClause(data: ISZ[U8]): AnnexClause = {
    def fAnnexClause(reader: Reader): AnnexClause = {
      val r = reader.readAnnexClause()
      return r
    }
    val r = to(data, fAnnexClause)
    return r
  }

  def fromEmv2Annex(o: Emv2Annex, poolString: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(poolString))
    w.writeEmv2Annex(o)
    return w.result
  }

  def toEmv2Annex(data: ISZ[U8]): Emv2Annex = {
    def fEmv2Annex(reader: Reader): Emv2Annex = {
      val r = reader.readEmv2Annex()
      return r
    }
    val r = to(data, fEmv2Annex)
    return r
  }

  def fromEmv2Library(o: Emv2Library, poolString: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(poolString))
    w.writeEmv2Library(o)
    return w.result
  }

  def toEmv2Library(data: ISZ[U8]): Emv2Library = {
    def fEmv2Library(reader: Reader): Emv2Library = {
      val r = reader.readEmv2Library()
      return r
    }
    val r = to(data, fEmv2Library)
    return r
  }

  def fromEmv2Propagation(o: Emv2Propagation, poolString: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(poolString))
    w.writeEmv2Propagation(o)
    return w.result
  }

  def toEmv2Propagation(data: ISZ[U8]): Emv2Propagation = {
    def fEmv2Propagation(reader: Reader): Emv2Propagation = {
      val r = reader.readEmv2Propagation()
      return r
    }
    val r = to(data, fEmv2Propagation)
    return r
  }

  def fromEmv2Flow(o: Emv2Flow, poolString: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(poolString))
    w.writeEmv2Flow(o)
    return w.result
  }

  def toEmv2Flow(data: ISZ[U8]): Emv2Flow = {
    def fEmv2Flow(reader: Reader): Emv2Flow = {
      val r = reader.readEmv2Flow()
      return r
    }
    val r = to(data, fEmv2Flow)
    return r
  }

  def fromEmv2Clause(o: Emv2Clause, poolString: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(poolString))
    w.writeEmv2Clause(o)
    return w.result
  }

  def toEmv2Clause(data: ISZ[U8]): Emv2Clause = {
    def fEmv2Clause(reader: Reader): Emv2Clause = {
      val r = reader.readEmv2Clause()
      return r
    }
    val r = to(data, fEmv2Clause)
    return r
  }

  def fromOtherAnnex(o: OtherAnnex, poolString: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(poolString))
    w.writeOtherAnnex(o)
    return w.result
  }

  def toOtherAnnex(data: ISZ[U8]): OtherAnnex = {
    def fOtherAnnex(reader: Reader): OtherAnnex = {
      val r = reader.readOtherAnnex()
      return r
    }
    val r = to(data, fOtherAnnex)
    return r
  }

}