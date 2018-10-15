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

object MsgPack {

  object Constants {

    val _aadlirAadl: Z = -32

    val _aadlirName: Z = -31

    val _aadlirComponent: Z = -30

    val _aadlirClassifier: Z = -29

    val _aadlirFeatureEnd: Z = -28

    val _aadlirFeatureGroup: Z = -27

    val _aadlirConnection: Z = -26

    val _aadlirConnectionInstance: Z = -25

    val _aadlirConnectionReference: Z = -24

    val _aadlirEndPoint: Z = -23

    val _aadlirProperty: Z = -22

    val _aadlirClassifierProp: Z = -21

    val _aadlirRangeProp: Z = -20

    val _aadlirRecordProp: Z = -19

    val _aadlirReferenceProp: Z = -18

    val _aadlirUnitProp: Z = -17

    val _aadlirValueProp: Z = -16

    val _aadlirMode: Z = -15

    val _aadlirFlow: Z = -14

    val _aadlirAnnex: Z = -13

    val _aadlirEmv2Library: Z = -12

    val _aadlirEmv2Propagation: Z = -11

    val _aadlirEmv2Flow: Z = -10

    val _aadlirEmv2Clause: Z = -9

    val _aadlirOtherAnnex: Z = -8

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def write_aadlirAadl(o: org.sireum.aadl.ir.Aadl): Unit = {
      writer.writeZ(Constants._aadlirAadl)
      writer.writeISZ(o.components, write_aadlirComponent _)
      writer.writeISZ(o.errorLib, write_aadlirEmv2Library _)
    }

    def write_aadlirName(o: org.sireum.aadl.ir.Name): Unit = {
      writer.writeZ(Constants._aadlirName)
      writer.writeISZ(o.name, writer.writeString _)
    }

    def write_aadlirComponent(o: org.sireum.aadl.ir.Component): Unit = {
      writer.writeZ(Constants._aadlirComponent)
      write_aadlirName(o.identifier)
      write_aadlirComponentCategoryType(o.category)
      writer.writeOption(o.classifier, write_aadlirClassifier _)
      writer.writeISZ(o.features, write_aadlirFeature _)
      writer.writeISZ(o.subComponents, write_aadlirComponent _)
      writer.writeISZ(o.connections, write_aadlirConnection _)
      writer.writeISZ(o.connectionInstances, write_aadlirConnectionInstance _)
      writer.writeISZ(o.properties, write_aadlirProperty _)
      writer.writeISZ(o.flows, write_aadlirFlow _)
      writer.writeISZ(o.modes, write_aadlirMode _)
      writer.writeISZ(o.annexes, write_aadlirAnnex _)
    }

    def write_aadlirClassifier(o: org.sireum.aadl.ir.Classifier): Unit = {
      writer.writeZ(Constants._aadlirClassifier)
      writer.writeString(o.name)
    }

    def write_aadlirComponentCategoryType(o: org.sireum.aadl.ir.ComponentCategory.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def write_aadlirFeature(o: org.sireum.aadl.ir.Feature): Unit = {
      o match {
        case o: org.sireum.aadl.ir.FeatureEnd => write_aadlirFeatureEnd(o)
        case o: org.sireum.aadl.ir.FeatureGroup => write_aadlirFeatureGroup(o)
      }
    }

    def write_aadlirFeatureEnd(o: org.sireum.aadl.ir.FeatureEnd): Unit = {
      writer.writeZ(Constants._aadlirFeatureEnd)
      write_aadlirName(o.identifier)
      write_aadlirDirectionType(o.direction)
      write_aadlirFeatureCategoryType(o.category)
      writer.writeOption(o.classifier, write_aadlirClassifier _)
      writer.writeISZ(o.properties, write_aadlirProperty _)
    }

    def write_aadlirFeatureGroup(o: org.sireum.aadl.ir.FeatureGroup): Unit = {
      writer.writeZ(Constants._aadlirFeatureGroup)
      write_aadlirName(o.identifier)
      writer.writeISZ(o.features, write_aadlirFeature _)
      writer.writeB(o.isInverse)
      write_aadlirFeatureCategoryType(o.category)
      writer.writeISZ(o.properties, write_aadlirProperty _)
    }

    def write_aadlirDirectionType(o: org.sireum.aadl.ir.Direction.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def write_aadlirFeatureCategoryType(o: org.sireum.aadl.ir.FeatureCategory.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def write_aadlirConnection(o: org.sireum.aadl.ir.Connection): Unit = {
      writer.writeZ(Constants._aadlirConnection)
      write_aadlirName(o.name)
      writer.writeISZ(o.src, write_aadlirEndPoint _)
      writer.writeISZ(o.dst, write_aadlirEndPoint _)
      write_aadlirConnectionKindType(o.kind)
      writer.writeB(o.isBiDirectional)
      writer.writeISZ(o.connectionInstances, write_aadlirName _)
      writer.writeISZ(o.properties, write_aadlirProperty _)
    }

    def write_aadlirConnectionInstance(o: org.sireum.aadl.ir.ConnectionInstance): Unit = {
      writer.writeZ(Constants._aadlirConnectionInstance)
      write_aadlirName(o.name)
      write_aadlirEndPoint(o.src)
      write_aadlirEndPoint(o.dst)
      write_aadlirConnectionKindType(o.kind)
      writer.writeISZ(o.connectionRefs, write_aadlirConnectionReference _)
      writer.writeISZ(o.properties, write_aadlirProperty _)
    }

    def write_aadlirConnectionReference(o: org.sireum.aadl.ir.ConnectionReference): Unit = {
      writer.writeZ(Constants._aadlirConnectionReference)
      write_aadlirName(o.name)
      write_aadlirName(o.context)
      writer.writeB(o.isParent)
    }

    def write_aadlirConnectionKindType(o: org.sireum.aadl.ir.ConnectionKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def write_aadlirEndPoint(o: org.sireum.aadl.ir.EndPoint): Unit = {
      writer.writeZ(Constants._aadlirEndPoint)
      write_aadlirName(o.component)
      writer.writeOption(o.feature, write_aadlirName _)
      writer.writeOption(o.direction, write_aadlirDirectionType _)
    }

    def write_aadlirProperty(o: org.sireum.aadl.ir.Property): Unit = {
      writer.writeZ(Constants._aadlirProperty)
      write_aadlirName(o.name)
      writer.writeISZ(o.propertyValues, write_aadlirPropertyValue _)
    }

    def write_aadlirPropertyValue(o: org.sireum.aadl.ir.PropertyValue): Unit = {
      o match {
        case o: org.sireum.aadl.ir.ClassifierProp => write_aadlirClassifierProp(o)
        case o: org.sireum.aadl.ir.RangeProp => write_aadlirRangeProp(o)
        case o: org.sireum.aadl.ir.RecordProp => write_aadlirRecordProp(o)
        case o: org.sireum.aadl.ir.ReferenceProp => write_aadlirReferenceProp(o)
        case o: org.sireum.aadl.ir.UnitProp => write_aadlirUnitProp(o)
        case o: org.sireum.aadl.ir.ValueProp => write_aadlirValueProp(o)
      }
    }

    def write_aadlirClassifierProp(o: org.sireum.aadl.ir.ClassifierProp): Unit = {
      writer.writeZ(Constants._aadlirClassifierProp)
      writer.writeString(o.name)
    }

    def write_aadlirRangeProp(o: org.sireum.aadl.ir.RangeProp): Unit = {
      writer.writeZ(Constants._aadlirRangeProp)
      write_aadlirUnitProp(o.low)
      write_aadlirUnitProp(o.high)
    }

    def write_aadlirRecordProp(o: org.sireum.aadl.ir.RecordProp): Unit = {
      writer.writeZ(Constants._aadlirRecordProp)
      writer.writeISZ(o.properties, write_aadlirProperty _)
    }

    def write_aadlirReferenceProp(o: org.sireum.aadl.ir.ReferenceProp): Unit = {
      writer.writeZ(Constants._aadlirReferenceProp)
      write_aadlirName(o.value)
    }

    def write_aadlirUnitProp(o: org.sireum.aadl.ir.UnitProp): Unit = {
      writer.writeZ(Constants._aadlirUnitProp)
      writer.writeString(o.value)
      writer.writeOption(o.unit, writer.writeString _)
    }

    def write_aadlirValueProp(o: org.sireum.aadl.ir.ValueProp): Unit = {
      writer.writeZ(Constants._aadlirValueProp)
      writer.writeString(o.value)
    }

    def write_aadlirMode(o: org.sireum.aadl.ir.Mode): Unit = {
      writer.writeZ(Constants._aadlirMode)
      write_aadlirName(o.name)
    }

    def write_aadlirFlowKindType(o: org.sireum.aadl.ir.FlowKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def write_aadlirFlow(o: org.sireum.aadl.ir.Flow): Unit = {
      writer.writeZ(Constants._aadlirFlow)
      write_aadlirName(o.name)
      write_aadlirFlowKindType(o.kind)
      writer.writeOption(o.source, write_aadlirFeature _)
      writer.writeOption(o.sink, write_aadlirFeature _)
    }

    def write_aadlirAnnex(o: org.sireum.aadl.ir.Annex): Unit = {
      writer.writeZ(Constants._aadlirAnnex)
      writer.writeString(o.name)
      write_aadlirAnnexClause(o.clause)
    }

    def write_aadlirAnnexClause(o: org.sireum.aadl.ir.AnnexClause): Unit = {
      o match {
        case o: org.sireum.aadl.ir.Emv2Library => write_aadlirEmv2Library(o)
        case o: org.sireum.aadl.ir.Emv2Propagation => write_aadlirEmv2Propagation(o)
        case o: org.sireum.aadl.ir.Emv2Flow => write_aadlirEmv2Flow(o)
        case o: org.sireum.aadl.ir.Emv2Clause => write_aadlirEmv2Clause(o)
        case o: org.sireum.aadl.ir.OtherAnnex => write_aadlirOtherAnnex(o)
      }
    }

    def write_aadlirEmv2Annex(o: org.sireum.aadl.ir.Emv2Annex): Unit = {
      o match {
        case o: org.sireum.aadl.ir.Emv2Library => write_aadlirEmv2Library(o)
        case o: org.sireum.aadl.ir.Emv2Propagation => write_aadlirEmv2Propagation(o)
        case o: org.sireum.aadl.ir.Emv2Flow => write_aadlirEmv2Flow(o)
        case o: org.sireum.aadl.ir.Emv2Clause => write_aadlirEmv2Clause(o)
      }
    }

    def write_aadlirPropagationDirectionType(o: org.sireum.aadl.ir.PropagationDirection.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def write_aadlirEmv2Library(o: org.sireum.aadl.ir.Emv2Library): Unit = {
      writer.writeZ(Constants._aadlirEmv2Library)
      write_aadlirName(o.name)
      writer.writeISZ(o.useTypes, writer.writeString _)
      writer.writeISZ(o.tokens, writer.writeString _)
      writer.writeHashMap(o.alias, writer.writeString _, writer.writeString _)
    }

    def write_aadlirEmv2Propagation(o: org.sireum.aadl.ir.Emv2Propagation): Unit = {
      writer.writeZ(Constants._aadlirEmv2Propagation)
      write_aadlirPropagationDirectionType(o.direction)
      writer.writeISZ(o.propagationPoint, writer.writeString _)
      writer.writeISZ(o.errorTokens, writer.writeString _)
    }

    def write_aadlirEmv2Flow(o: org.sireum.aadl.ir.Emv2Flow): Unit = {
      writer.writeZ(Constants._aadlirEmv2Flow)
      write_aadlirName(o.identifier)
      write_aadlirFlowKindType(o.kind)
      writer.writeOption(o.sourcePropagation, write_aadlirEmv2Propagation _)
      writer.writeOption(o.sinkPropagation, write_aadlirEmv2Propagation _)
    }

    def write_aadlirEmv2Clause(o: org.sireum.aadl.ir.Emv2Clause): Unit = {
      writer.writeZ(Constants._aadlirEmv2Clause)
      writer.writeISZ(o.libraries, writer.writeString _)
      writer.writeISZ(o.propagations, write_aadlirEmv2Propagation _)
      writer.writeISZ(o.flows, write_aadlirEmv2Flow _)
    }

    def write_aadlirOtherAnnex(o: org.sireum.aadl.ir.OtherAnnex): Unit = {
      writer.writeZ(Constants._aadlirOtherAnnex)
      writer.writeString(o.clause)
    }

    def result: ISZ[U8] = {
      return writer.result
    }

  }

  object Reader {

    @record class Default(val reader: MessagePack.Reader.Impl) extends Reader {
      def errorOpt: Option[MessagePack.ErrorMsg] = {
        return reader.errorOpt
      }
    }

  }

  @msig trait Reader {

    def reader: MessagePack.Reader

    def read_aadlirAadl(): org.sireum.aadl.ir.Aadl = {
      val r = read_aadlirAadlT(F)
      return r
    }

    def read_aadlirAadlT(typeParsed: B): org.sireum.aadl.ir.Aadl = {
      if (!typeParsed) {
        reader.expectZ(Constants._aadlirAadl)
      }
      val components = reader.readISZ(read_aadlirComponent _)
      val errorLib = reader.readISZ(read_aadlirEmv2Library _)
      return org.sireum.aadl.ir.Aadl(components, errorLib)
    }

    def read_aadlirName(): org.sireum.aadl.ir.Name = {
      val r = read_aadlirNameT(F)
      return r
    }

    def read_aadlirNameT(typeParsed: B): org.sireum.aadl.ir.Name = {
      if (!typeParsed) {
        reader.expectZ(Constants._aadlirName)
      }
      val name = reader.readISZ(reader.readString _)
      return org.sireum.aadl.ir.Name(name)
    }

    def read_aadlirComponent(): org.sireum.aadl.ir.Component = {
      val r = read_aadlirComponentT(F)
      return r
    }

    def read_aadlirComponentT(typeParsed: B): org.sireum.aadl.ir.Component = {
      if (!typeParsed) {
        reader.expectZ(Constants._aadlirComponent)
      }
      val identifier = read_aadlirName()
      val category = read_aadlirComponentCategoryType()
      val classifier = reader.readOption(read_aadlirClassifier _)
      val features = reader.readISZ(read_aadlirFeature _)
      val subComponents = reader.readISZ(read_aadlirComponent _)
      val connections = reader.readISZ(read_aadlirConnection _)
      val connectionInstances = reader.readISZ(read_aadlirConnectionInstance _)
      val properties = reader.readISZ(read_aadlirProperty _)
      val flows = reader.readISZ(read_aadlirFlow _)
      val modes = reader.readISZ(read_aadlirMode _)
      val annexes = reader.readISZ(read_aadlirAnnex _)
      return org.sireum.aadl.ir.Component(identifier, category, classifier, features, subComponents, connections, connectionInstances, properties, flows, modes, annexes)
    }

    def read_aadlirClassifier(): org.sireum.aadl.ir.Classifier = {
      val r = read_aadlirClassifierT(F)
      return r
    }

    def read_aadlirClassifierT(typeParsed: B): org.sireum.aadl.ir.Classifier = {
      if (!typeParsed) {
        reader.expectZ(Constants._aadlirClassifier)
      }
      val name = reader.readString()
      return org.sireum.aadl.ir.Classifier(name)
    }

    def read_aadlirComponentCategoryType(): org.sireum.aadl.ir.ComponentCategory.Type = {
      val r = reader.readZ()
      return org.sireum.aadl.ir.ComponentCategory.byOrdinal(r).get
    }

    def read_aadlirFeature(): org.sireum.aadl.ir.Feature = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants._aadlirFeatureEnd => val r = read_aadlirFeatureEndT(T); return r
        case Constants._aadlirFeatureGroup => val r = read_aadlirFeatureGroupT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of org.sireum.aadl.ir.Feature.")
          val r = read_aadlirFeatureGroupT(T)
          return r
      }
    }

    def read_aadlirFeatureEnd(): org.sireum.aadl.ir.FeatureEnd = {
      val r = read_aadlirFeatureEndT(F)
      return r
    }

    def read_aadlirFeatureEndT(typeParsed: B): org.sireum.aadl.ir.FeatureEnd = {
      if (!typeParsed) {
        reader.expectZ(Constants._aadlirFeatureEnd)
      }
      val identifier = read_aadlirName()
      val direction = read_aadlirDirectionType()
      val category = read_aadlirFeatureCategoryType()
      val classifier = reader.readOption(read_aadlirClassifier _)
      val properties = reader.readISZ(read_aadlirProperty _)
      return org.sireum.aadl.ir.FeatureEnd(identifier, direction, category, classifier, properties)
    }

    def read_aadlirFeatureGroup(): org.sireum.aadl.ir.FeatureGroup = {
      val r = read_aadlirFeatureGroupT(F)
      return r
    }

    def read_aadlirFeatureGroupT(typeParsed: B): org.sireum.aadl.ir.FeatureGroup = {
      if (!typeParsed) {
        reader.expectZ(Constants._aadlirFeatureGroup)
      }
      val identifier = read_aadlirName()
      val features = reader.readISZ(read_aadlirFeature _)
      val isInverse = reader.readB()
      val category = read_aadlirFeatureCategoryType()
      val properties = reader.readISZ(read_aadlirProperty _)
      return org.sireum.aadl.ir.FeatureGroup(identifier, features, isInverse, category, properties)
    }

    def read_aadlirDirectionType(): org.sireum.aadl.ir.Direction.Type = {
      val r = reader.readZ()
      return org.sireum.aadl.ir.Direction.byOrdinal(r).get
    }

    def read_aadlirFeatureCategoryType(): org.sireum.aadl.ir.FeatureCategory.Type = {
      val r = reader.readZ()
      return org.sireum.aadl.ir.FeatureCategory.byOrdinal(r).get
    }

    def read_aadlirConnection(): org.sireum.aadl.ir.Connection = {
      val r = read_aadlirConnectionT(F)
      return r
    }

    def read_aadlirConnectionT(typeParsed: B): org.sireum.aadl.ir.Connection = {
      if (!typeParsed) {
        reader.expectZ(Constants._aadlirConnection)
      }
      val name = read_aadlirName()
      val src = reader.readISZ(read_aadlirEndPoint _)
      val dst = reader.readISZ(read_aadlirEndPoint _)
      val kind = read_aadlirConnectionKindType()
      val isBiDirectional = reader.readB()
      val connectionInstances = reader.readISZ(read_aadlirName _)
      val properties = reader.readISZ(read_aadlirProperty _)
      return org.sireum.aadl.ir.Connection(name, src, dst, kind, isBiDirectional, connectionInstances, properties)
    }

    def read_aadlirConnectionInstance(): org.sireum.aadl.ir.ConnectionInstance = {
      val r = read_aadlirConnectionInstanceT(F)
      return r
    }

    def read_aadlirConnectionInstanceT(typeParsed: B): org.sireum.aadl.ir.ConnectionInstance = {
      if (!typeParsed) {
        reader.expectZ(Constants._aadlirConnectionInstance)
      }
      val name = read_aadlirName()
      val src = read_aadlirEndPoint()
      val dst = read_aadlirEndPoint()
      val kind = read_aadlirConnectionKindType()
      val connectionRefs = reader.readISZ(read_aadlirConnectionReference _)
      val properties = reader.readISZ(read_aadlirProperty _)
      return org.sireum.aadl.ir.ConnectionInstance(name, src, dst, kind, connectionRefs, properties)
    }

    def read_aadlirConnectionReference(): org.sireum.aadl.ir.ConnectionReference = {
      val r = read_aadlirConnectionReferenceT(F)
      return r
    }

    def read_aadlirConnectionReferenceT(typeParsed: B): org.sireum.aadl.ir.ConnectionReference = {
      if (!typeParsed) {
        reader.expectZ(Constants._aadlirConnectionReference)
      }
      val name = read_aadlirName()
      val context = read_aadlirName()
      val isParent = reader.readB()
      return org.sireum.aadl.ir.ConnectionReference(name, context, isParent)
    }

    def read_aadlirConnectionKindType(): org.sireum.aadl.ir.ConnectionKind.Type = {
      val r = reader.readZ()
      return org.sireum.aadl.ir.ConnectionKind.byOrdinal(r).get
    }

    def read_aadlirEndPoint(): org.sireum.aadl.ir.EndPoint = {
      val r = read_aadlirEndPointT(F)
      return r
    }

    def read_aadlirEndPointT(typeParsed: B): org.sireum.aadl.ir.EndPoint = {
      if (!typeParsed) {
        reader.expectZ(Constants._aadlirEndPoint)
      }
      val component = read_aadlirName()
      val feature = reader.readOption(read_aadlirName _)
      val direction = reader.readOption(read_aadlirDirectionType _)
      return org.sireum.aadl.ir.EndPoint(component, feature, direction)
    }

    def read_aadlirProperty(): org.sireum.aadl.ir.Property = {
      val r = read_aadlirPropertyT(F)
      return r
    }

    def read_aadlirPropertyT(typeParsed: B): org.sireum.aadl.ir.Property = {
      if (!typeParsed) {
        reader.expectZ(Constants._aadlirProperty)
      }
      val name = read_aadlirName()
      val propertyValues = reader.readISZ(read_aadlirPropertyValue _)
      return org.sireum.aadl.ir.Property(name, propertyValues)
    }

    def read_aadlirPropertyValue(): org.sireum.aadl.ir.PropertyValue = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants._aadlirClassifierProp => val r = read_aadlirClassifierPropT(T); return r
        case Constants._aadlirRangeProp => val r = read_aadlirRangePropT(T); return r
        case Constants._aadlirRecordProp => val r = read_aadlirRecordPropT(T); return r
        case Constants._aadlirReferenceProp => val r = read_aadlirReferencePropT(T); return r
        case Constants._aadlirUnitProp => val r = read_aadlirUnitPropT(T); return r
        case Constants._aadlirValueProp => val r = read_aadlirValuePropT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of org.sireum.aadl.ir.PropertyValue.")
          val r = read_aadlirValuePropT(T)
          return r
      }
    }

    def read_aadlirClassifierProp(): org.sireum.aadl.ir.ClassifierProp = {
      val r = read_aadlirClassifierPropT(F)
      return r
    }

    def read_aadlirClassifierPropT(typeParsed: B): org.sireum.aadl.ir.ClassifierProp = {
      if (!typeParsed) {
        reader.expectZ(Constants._aadlirClassifierProp)
      }
      val name = reader.readString()
      return org.sireum.aadl.ir.ClassifierProp(name)
    }

    def read_aadlirRangeProp(): org.sireum.aadl.ir.RangeProp = {
      val r = read_aadlirRangePropT(F)
      return r
    }

    def read_aadlirRangePropT(typeParsed: B): org.sireum.aadl.ir.RangeProp = {
      if (!typeParsed) {
        reader.expectZ(Constants._aadlirRangeProp)
      }
      val low = read_aadlirUnitProp()
      val high = read_aadlirUnitProp()
      return org.sireum.aadl.ir.RangeProp(low, high)
    }

    def read_aadlirRecordProp(): org.sireum.aadl.ir.RecordProp = {
      val r = read_aadlirRecordPropT(F)
      return r
    }

    def read_aadlirRecordPropT(typeParsed: B): org.sireum.aadl.ir.RecordProp = {
      if (!typeParsed) {
        reader.expectZ(Constants._aadlirRecordProp)
      }
      val properties = reader.readISZ(read_aadlirProperty _)
      return org.sireum.aadl.ir.RecordProp(properties)
    }

    def read_aadlirReferenceProp(): org.sireum.aadl.ir.ReferenceProp = {
      val r = read_aadlirReferencePropT(F)
      return r
    }

    def read_aadlirReferencePropT(typeParsed: B): org.sireum.aadl.ir.ReferenceProp = {
      if (!typeParsed) {
        reader.expectZ(Constants._aadlirReferenceProp)
      }
      val value = read_aadlirName()
      return org.sireum.aadl.ir.ReferenceProp(value)
    }

    def read_aadlirUnitProp(): org.sireum.aadl.ir.UnitProp = {
      val r = read_aadlirUnitPropT(F)
      return r
    }

    def read_aadlirUnitPropT(typeParsed: B): org.sireum.aadl.ir.UnitProp = {
      if (!typeParsed) {
        reader.expectZ(Constants._aadlirUnitProp)
      }
      val value = reader.readString()
      val unit = reader.readOption(reader.readString _)
      return org.sireum.aadl.ir.UnitProp(value, unit)
    }

    def read_aadlirValueProp(): org.sireum.aadl.ir.ValueProp = {
      val r = read_aadlirValuePropT(F)
      return r
    }

    def read_aadlirValuePropT(typeParsed: B): org.sireum.aadl.ir.ValueProp = {
      if (!typeParsed) {
        reader.expectZ(Constants._aadlirValueProp)
      }
      val value = reader.readString()
      return org.sireum.aadl.ir.ValueProp(value)
    }

    def read_aadlirMode(): org.sireum.aadl.ir.Mode = {
      val r = read_aadlirModeT(F)
      return r
    }

    def read_aadlirModeT(typeParsed: B): org.sireum.aadl.ir.Mode = {
      if (!typeParsed) {
        reader.expectZ(Constants._aadlirMode)
      }
      val name = read_aadlirName()
      return org.sireum.aadl.ir.Mode(name)
    }

    def read_aadlirFlowKindType(): org.sireum.aadl.ir.FlowKind.Type = {
      val r = reader.readZ()
      return org.sireum.aadl.ir.FlowKind.byOrdinal(r).get
    }

    def read_aadlirFlow(): org.sireum.aadl.ir.Flow = {
      val r = read_aadlirFlowT(F)
      return r
    }

    def read_aadlirFlowT(typeParsed: B): org.sireum.aadl.ir.Flow = {
      if (!typeParsed) {
        reader.expectZ(Constants._aadlirFlow)
      }
      val name = read_aadlirName()
      val kind = read_aadlirFlowKindType()
      val source = reader.readOption(read_aadlirFeature _)
      val sink = reader.readOption(read_aadlirFeature _)
      return org.sireum.aadl.ir.Flow(name, kind, source, sink)
    }

    def read_aadlirAnnex(): org.sireum.aadl.ir.Annex = {
      val r = read_aadlirAnnexT(F)
      return r
    }

    def read_aadlirAnnexT(typeParsed: B): org.sireum.aadl.ir.Annex = {
      if (!typeParsed) {
        reader.expectZ(Constants._aadlirAnnex)
      }
      val name = reader.readString()
      val clause = read_aadlirAnnexClause()
      return org.sireum.aadl.ir.Annex(name, clause)
    }

    def read_aadlirAnnexClause(): org.sireum.aadl.ir.AnnexClause = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants._aadlirEmv2Library => val r = read_aadlirEmv2LibraryT(T); return r
        case Constants._aadlirEmv2Propagation => val r = read_aadlirEmv2PropagationT(T); return r
        case Constants._aadlirEmv2Flow => val r = read_aadlirEmv2FlowT(T); return r
        case Constants._aadlirEmv2Clause => val r = read_aadlirEmv2ClauseT(T); return r
        case Constants._aadlirOtherAnnex => val r = read_aadlirOtherAnnexT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of org.sireum.aadl.ir.AnnexClause.")
          val r = read_aadlirOtherAnnexT(T)
          return r
      }
    }

    def read_aadlirEmv2Annex(): org.sireum.aadl.ir.Emv2Annex = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants._aadlirEmv2Library => val r = read_aadlirEmv2LibraryT(T); return r
        case Constants._aadlirEmv2Propagation => val r = read_aadlirEmv2PropagationT(T); return r
        case Constants._aadlirEmv2Flow => val r = read_aadlirEmv2FlowT(T); return r
        case Constants._aadlirEmv2Clause => val r = read_aadlirEmv2ClauseT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of org.sireum.aadl.ir.Emv2Annex.")
          val r = read_aadlirEmv2ClauseT(T)
          return r
      }
    }

    def read_aadlirPropagationDirectionType(): org.sireum.aadl.ir.PropagationDirection.Type = {
      val r = reader.readZ()
      return org.sireum.aadl.ir.PropagationDirection.byOrdinal(r).get
    }

    def read_aadlirEmv2Library(): org.sireum.aadl.ir.Emv2Library = {
      val r = read_aadlirEmv2LibraryT(F)
      return r
    }

    def read_aadlirEmv2LibraryT(typeParsed: B): org.sireum.aadl.ir.Emv2Library = {
      if (!typeParsed) {
        reader.expectZ(Constants._aadlirEmv2Library)
      }
      val name = read_aadlirName()
      val useTypes = reader.readISZ(reader.readString _)
      val tokens = reader.readISZ(reader.readString _)
      val alias = reader.readHashMap(reader.readString _, reader.readString _)
      return org.sireum.aadl.ir.Emv2Library(name, useTypes, tokens, alias)
    }

    def read_aadlirEmv2Propagation(): org.sireum.aadl.ir.Emv2Propagation = {
      val r = read_aadlirEmv2PropagationT(F)
      return r
    }

    def read_aadlirEmv2PropagationT(typeParsed: B): org.sireum.aadl.ir.Emv2Propagation = {
      if (!typeParsed) {
        reader.expectZ(Constants._aadlirEmv2Propagation)
      }
      val direction = read_aadlirPropagationDirectionType()
      val propagationPoint = reader.readISZ(reader.readString _)
      val errorTokens = reader.readISZ(reader.readString _)
      return org.sireum.aadl.ir.Emv2Propagation(direction, propagationPoint, errorTokens)
    }

    def read_aadlirEmv2Flow(): org.sireum.aadl.ir.Emv2Flow = {
      val r = read_aadlirEmv2FlowT(F)
      return r
    }

    def read_aadlirEmv2FlowT(typeParsed: B): org.sireum.aadl.ir.Emv2Flow = {
      if (!typeParsed) {
        reader.expectZ(Constants._aadlirEmv2Flow)
      }
      val identifier = read_aadlirName()
      val kind = read_aadlirFlowKindType()
      val sourcePropagation = reader.readOption(read_aadlirEmv2Propagation _)
      val sinkPropagation = reader.readOption(read_aadlirEmv2Propagation _)
      return org.sireum.aadl.ir.Emv2Flow(identifier, kind, sourcePropagation, sinkPropagation)
    }

    def read_aadlirEmv2Clause(): org.sireum.aadl.ir.Emv2Clause = {
      val r = read_aadlirEmv2ClauseT(F)
      return r
    }

    def read_aadlirEmv2ClauseT(typeParsed: B): org.sireum.aadl.ir.Emv2Clause = {
      if (!typeParsed) {
        reader.expectZ(Constants._aadlirEmv2Clause)
      }
      val libraries = reader.readISZ(reader.readString _)
      val propagations = reader.readISZ(read_aadlirEmv2Propagation _)
      val flows = reader.readISZ(read_aadlirEmv2Flow _)
      return org.sireum.aadl.ir.Emv2Clause(libraries, propagations, flows)
    }

    def read_aadlirOtherAnnex(): org.sireum.aadl.ir.OtherAnnex = {
      val r = read_aadlirOtherAnnexT(F)
      return r
    }

    def read_aadlirOtherAnnexT(typeParsed: B): org.sireum.aadl.ir.OtherAnnex = {
      if (!typeParsed) {
        reader.expectZ(Constants._aadlirOtherAnnex)
      }
      val clause = reader.readString()
      return org.sireum.aadl.ir.OtherAnnex(clause)
    }

  }

  def to[T](data: ISZ[U8], f: Reader => T): Either[T, MessagePack.ErrorMsg] = {
    val rd = Reader.Default(MessagePack.reader(data))
    rd.reader.init()
    val r = f(rd)
    rd.errorOpt match {
      case Some(e) => return Either.Right(e)
      case _ => return Either.Left(r)
    }
  }

  def from_aadlirAadl(o: org.sireum.aadl.ir.Aadl, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_aadlirAadl(o)
    return w.result
  }

  def to_aadlirAadl(data: ISZ[U8]): Either[org.sireum.aadl.ir.Aadl, MessagePack.ErrorMsg] = {
    def f_aadlirAadl(reader: Reader): org.sireum.aadl.ir.Aadl = {
      val r = reader.read_aadlirAadl()
      return r
    }
    val r = to(data, f_aadlirAadl _)
    return r
  }

  def from_aadlirName(o: org.sireum.aadl.ir.Name, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_aadlirName(o)
    return w.result
  }

  def to_aadlirName(data: ISZ[U8]): Either[org.sireum.aadl.ir.Name, MessagePack.ErrorMsg] = {
    def f_aadlirName(reader: Reader): org.sireum.aadl.ir.Name = {
      val r = reader.read_aadlirName()
      return r
    }
    val r = to(data, f_aadlirName _)
    return r
  }

  def from_aadlirComponent(o: org.sireum.aadl.ir.Component, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_aadlirComponent(o)
    return w.result
  }

  def to_aadlirComponent(data: ISZ[U8]): Either[org.sireum.aadl.ir.Component, MessagePack.ErrorMsg] = {
    def f_aadlirComponent(reader: Reader): org.sireum.aadl.ir.Component = {
      val r = reader.read_aadlirComponent()
      return r
    }
    val r = to(data, f_aadlirComponent _)
    return r
  }

  def from_aadlirClassifier(o: org.sireum.aadl.ir.Classifier, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_aadlirClassifier(o)
    return w.result
  }

  def to_aadlirClassifier(data: ISZ[U8]): Either[org.sireum.aadl.ir.Classifier, MessagePack.ErrorMsg] = {
    def f_aadlirClassifier(reader: Reader): org.sireum.aadl.ir.Classifier = {
      val r = reader.read_aadlirClassifier()
      return r
    }
    val r = to(data, f_aadlirClassifier _)
    return r
  }

  def from_aadlirFeature(o: org.sireum.aadl.ir.Feature, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_aadlirFeature(o)
    return w.result
  }

  def to_aadlirFeature(data: ISZ[U8]): Either[org.sireum.aadl.ir.Feature, MessagePack.ErrorMsg] = {
    def f_aadlirFeature(reader: Reader): org.sireum.aadl.ir.Feature = {
      val r = reader.read_aadlirFeature()
      return r
    }
    val r = to(data, f_aadlirFeature _)
    return r
  }

  def from_aadlirFeatureEnd(o: org.sireum.aadl.ir.FeatureEnd, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_aadlirFeatureEnd(o)
    return w.result
  }

  def to_aadlirFeatureEnd(data: ISZ[U8]): Either[org.sireum.aadl.ir.FeatureEnd, MessagePack.ErrorMsg] = {
    def f_aadlirFeatureEnd(reader: Reader): org.sireum.aadl.ir.FeatureEnd = {
      val r = reader.read_aadlirFeatureEnd()
      return r
    }
    val r = to(data, f_aadlirFeatureEnd _)
    return r
  }

  def from_aadlirFeatureGroup(o: org.sireum.aadl.ir.FeatureGroup, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_aadlirFeatureGroup(o)
    return w.result
  }

  def to_aadlirFeatureGroup(data: ISZ[U8]): Either[org.sireum.aadl.ir.FeatureGroup, MessagePack.ErrorMsg] = {
    def f_aadlirFeatureGroup(reader: Reader): org.sireum.aadl.ir.FeatureGroup = {
      val r = reader.read_aadlirFeatureGroup()
      return r
    }
    val r = to(data, f_aadlirFeatureGroup _)
    return r
  }

  def from_aadlirConnection(o: org.sireum.aadl.ir.Connection, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_aadlirConnection(o)
    return w.result
  }

  def to_aadlirConnection(data: ISZ[U8]): Either[org.sireum.aadl.ir.Connection, MessagePack.ErrorMsg] = {
    def f_aadlirConnection(reader: Reader): org.sireum.aadl.ir.Connection = {
      val r = reader.read_aadlirConnection()
      return r
    }
    val r = to(data, f_aadlirConnection _)
    return r
  }

  def from_aadlirConnectionInstance(o: org.sireum.aadl.ir.ConnectionInstance, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_aadlirConnectionInstance(o)
    return w.result
  }

  def to_aadlirConnectionInstance(data: ISZ[U8]): Either[org.sireum.aadl.ir.ConnectionInstance, MessagePack.ErrorMsg] = {
    def f_aadlirConnectionInstance(reader: Reader): org.sireum.aadl.ir.ConnectionInstance = {
      val r = reader.read_aadlirConnectionInstance()
      return r
    }
    val r = to(data, f_aadlirConnectionInstance _)
    return r
  }

  def from_aadlirConnectionReference(o: org.sireum.aadl.ir.ConnectionReference, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_aadlirConnectionReference(o)
    return w.result
  }

  def to_aadlirConnectionReference(data: ISZ[U8]): Either[org.sireum.aadl.ir.ConnectionReference, MessagePack.ErrorMsg] = {
    def f_aadlirConnectionReference(reader: Reader): org.sireum.aadl.ir.ConnectionReference = {
      val r = reader.read_aadlirConnectionReference()
      return r
    }
    val r = to(data, f_aadlirConnectionReference _)
    return r
  }

  def from_aadlirEndPoint(o: org.sireum.aadl.ir.EndPoint, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_aadlirEndPoint(o)
    return w.result
  }

  def to_aadlirEndPoint(data: ISZ[U8]): Either[org.sireum.aadl.ir.EndPoint, MessagePack.ErrorMsg] = {
    def f_aadlirEndPoint(reader: Reader): org.sireum.aadl.ir.EndPoint = {
      val r = reader.read_aadlirEndPoint()
      return r
    }
    val r = to(data, f_aadlirEndPoint _)
    return r
  }

  def from_aadlirProperty(o: org.sireum.aadl.ir.Property, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_aadlirProperty(o)
    return w.result
  }

  def to_aadlirProperty(data: ISZ[U8]): Either[org.sireum.aadl.ir.Property, MessagePack.ErrorMsg] = {
    def f_aadlirProperty(reader: Reader): org.sireum.aadl.ir.Property = {
      val r = reader.read_aadlirProperty()
      return r
    }
    val r = to(data, f_aadlirProperty _)
    return r
  }

  def from_aadlirPropertyValue(o: org.sireum.aadl.ir.PropertyValue, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_aadlirPropertyValue(o)
    return w.result
  }

  def to_aadlirPropertyValue(data: ISZ[U8]): Either[org.sireum.aadl.ir.PropertyValue, MessagePack.ErrorMsg] = {
    def f_aadlirPropertyValue(reader: Reader): org.sireum.aadl.ir.PropertyValue = {
      val r = reader.read_aadlirPropertyValue()
      return r
    }
    val r = to(data, f_aadlirPropertyValue _)
    return r
  }

  def from_aadlirClassifierProp(o: org.sireum.aadl.ir.ClassifierProp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_aadlirClassifierProp(o)
    return w.result
  }

  def to_aadlirClassifierProp(data: ISZ[U8]): Either[org.sireum.aadl.ir.ClassifierProp, MessagePack.ErrorMsg] = {
    def f_aadlirClassifierProp(reader: Reader): org.sireum.aadl.ir.ClassifierProp = {
      val r = reader.read_aadlirClassifierProp()
      return r
    }
    val r = to(data, f_aadlirClassifierProp _)
    return r
  }

  def from_aadlirRangeProp(o: org.sireum.aadl.ir.RangeProp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_aadlirRangeProp(o)
    return w.result
  }

  def to_aadlirRangeProp(data: ISZ[U8]): Either[org.sireum.aadl.ir.RangeProp, MessagePack.ErrorMsg] = {
    def f_aadlirRangeProp(reader: Reader): org.sireum.aadl.ir.RangeProp = {
      val r = reader.read_aadlirRangeProp()
      return r
    }
    val r = to(data, f_aadlirRangeProp _)
    return r
  }

  def from_aadlirRecordProp(o: org.sireum.aadl.ir.RecordProp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_aadlirRecordProp(o)
    return w.result
  }

  def to_aadlirRecordProp(data: ISZ[U8]): Either[org.sireum.aadl.ir.RecordProp, MessagePack.ErrorMsg] = {
    def f_aadlirRecordProp(reader: Reader): org.sireum.aadl.ir.RecordProp = {
      val r = reader.read_aadlirRecordProp()
      return r
    }
    val r = to(data, f_aadlirRecordProp _)
    return r
  }

  def from_aadlirReferenceProp(o: org.sireum.aadl.ir.ReferenceProp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_aadlirReferenceProp(o)
    return w.result
  }

  def to_aadlirReferenceProp(data: ISZ[U8]): Either[org.sireum.aadl.ir.ReferenceProp, MessagePack.ErrorMsg] = {
    def f_aadlirReferenceProp(reader: Reader): org.sireum.aadl.ir.ReferenceProp = {
      val r = reader.read_aadlirReferenceProp()
      return r
    }
    val r = to(data, f_aadlirReferenceProp _)
    return r
  }

  def from_aadlirUnitProp(o: org.sireum.aadl.ir.UnitProp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_aadlirUnitProp(o)
    return w.result
  }

  def to_aadlirUnitProp(data: ISZ[U8]): Either[org.sireum.aadl.ir.UnitProp, MessagePack.ErrorMsg] = {
    def f_aadlirUnitProp(reader: Reader): org.sireum.aadl.ir.UnitProp = {
      val r = reader.read_aadlirUnitProp()
      return r
    }
    val r = to(data, f_aadlirUnitProp _)
    return r
  }

  def from_aadlirValueProp(o: org.sireum.aadl.ir.ValueProp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_aadlirValueProp(o)
    return w.result
  }

  def to_aadlirValueProp(data: ISZ[U8]): Either[org.sireum.aadl.ir.ValueProp, MessagePack.ErrorMsg] = {
    def f_aadlirValueProp(reader: Reader): org.sireum.aadl.ir.ValueProp = {
      val r = reader.read_aadlirValueProp()
      return r
    }
    val r = to(data, f_aadlirValueProp _)
    return r
  }

  def from_aadlirMode(o: org.sireum.aadl.ir.Mode, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_aadlirMode(o)
    return w.result
  }

  def to_aadlirMode(data: ISZ[U8]): Either[org.sireum.aadl.ir.Mode, MessagePack.ErrorMsg] = {
    def f_aadlirMode(reader: Reader): org.sireum.aadl.ir.Mode = {
      val r = reader.read_aadlirMode()
      return r
    }
    val r = to(data, f_aadlirMode _)
    return r
  }

  def from_aadlirFlow(o: org.sireum.aadl.ir.Flow, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_aadlirFlow(o)
    return w.result
  }

  def to_aadlirFlow(data: ISZ[U8]): Either[org.sireum.aadl.ir.Flow, MessagePack.ErrorMsg] = {
    def f_aadlirFlow(reader: Reader): org.sireum.aadl.ir.Flow = {
      val r = reader.read_aadlirFlow()
      return r
    }
    val r = to(data, f_aadlirFlow _)
    return r
  }

  def from_aadlirAnnex(o: org.sireum.aadl.ir.Annex, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_aadlirAnnex(o)
    return w.result
  }

  def to_aadlirAnnex(data: ISZ[U8]): Either[org.sireum.aadl.ir.Annex, MessagePack.ErrorMsg] = {
    def f_aadlirAnnex(reader: Reader): org.sireum.aadl.ir.Annex = {
      val r = reader.read_aadlirAnnex()
      return r
    }
    val r = to(data, f_aadlirAnnex _)
    return r
  }

  def from_aadlirAnnexClause(o: org.sireum.aadl.ir.AnnexClause, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_aadlirAnnexClause(o)
    return w.result
  }

  def to_aadlirAnnexClause(data: ISZ[U8]): Either[org.sireum.aadl.ir.AnnexClause, MessagePack.ErrorMsg] = {
    def f_aadlirAnnexClause(reader: Reader): org.sireum.aadl.ir.AnnexClause = {
      val r = reader.read_aadlirAnnexClause()
      return r
    }
    val r = to(data, f_aadlirAnnexClause _)
    return r
  }

  def from_aadlirEmv2Annex(o: org.sireum.aadl.ir.Emv2Annex, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_aadlirEmv2Annex(o)
    return w.result
  }

  def to_aadlirEmv2Annex(data: ISZ[U8]): Either[org.sireum.aadl.ir.Emv2Annex, MessagePack.ErrorMsg] = {
    def f_aadlirEmv2Annex(reader: Reader): org.sireum.aadl.ir.Emv2Annex = {
      val r = reader.read_aadlirEmv2Annex()
      return r
    }
    val r = to(data, f_aadlirEmv2Annex _)
    return r
  }

  def from_aadlirEmv2Library(o: org.sireum.aadl.ir.Emv2Library, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_aadlirEmv2Library(o)
    return w.result
  }

  def to_aadlirEmv2Library(data: ISZ[U8]): Either[org.sireum.aadl.ir.Emv2Library, MessagePack.ErrorMsg] = {
    def f_aadlirEmv2Library(reader: Reader): org.sireum.aadl.ir.Emv2Library = {
      val r = reader.read_aadlirEmv2Library()
      return r
    }
    val r = to(data, f_aadlirEmv2Library _)
    return r
  }

  def from_aadlirEmv2Propagation(o: org.sireum.aadl.ir.Emv2Propagation, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_aadlirEmv2Propagation(o)
    return w.result
  }

  def to_aadlirEmv2Propagation(data: ISZ[U8]): Either[org.sireum.aadl.ir.Emv2Propagation, MessagePack.ErrorMsg] = {
    def f_aadlirEmv2Propagation(reader: Reader): org.sireum.aadl.ir.Emv2Propagation = {
      val r = reader.read_aadlirEmv2Propagation()
      return r
    }
    val r = to(data, f_aadlirEmv2Propagation _)
    return r
  }

  def from_aadlirEmv2Flow(o: org.sireum.aadl.ir.Emv2Flow, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_aadlirEmv2Flow(o)
    return w.result
  }

  def to_aadlirEmv2Flow(data: ISZ[U8]): Either[org.sireum.aadl.ir.Emv2Flow, MessagePack.ErrorMsg] = {
    def f_aadlirEmv2Flow(reader: Reader): org.sireum.aadl.ir.Emv2Flow = {
      val r = reader.read_aadlirEmv2Flow()
      return r
    }
    val r = to(data, f_aadlirEmv2Flow _)
    return r
  }

  def from_aadlirEmv2Clause(o: org.sireum.aadl.ir.Emv2Clause, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_aadlirEmv2Clause(o)
    return w.result
  }

  def to_aadlirEmv2Clause(data: ISZ[U8]): Either[org.sireum.aadl.ir.Emv2Clause, MessagePack.ErrorMsg] = {
    def f_aadlirEmv2Clause(reader: Reader): org.sireum.aadl.ir.Emv2Clause = {
      val r = reader.read_aadlirEmv2Clause()
      return r
    }
    val r = to(data, f_aadlirEmv2Clause _)
    return r
  }

  def from_aadlirOtherAnnex(o: org.sireum.aadl.ir.OtherAnnex, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_aadlirOtherAnnex(o)
    return w.result
  }

  def to_aadlirOtherAnnex(data: ISZ[U8]): Either[org.sireum.aadl.ir.OtherAnnex, MessagePack.ErrorMsg] = {
    def f_aadlirOtherAnnex(reader: Reader): org.sireum.aadl.ir.OtherAnnex = {
      val r = reader.read_aadlirOtherAnnex()
      return r
    }
    val r = to(data, f_aadlirOtherAnnex _)
    return r
  }

}