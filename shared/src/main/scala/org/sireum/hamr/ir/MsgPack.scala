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

// This file is auto-generated from AadlAST.scala, BlessAST.scala, Emv2AST.scala, SmfAST.scala

package org.sireum.hamr.ir

import org.sireum._

object MsgPack {

  object Constants {

    val Aadl: Z = -32

    val Name: Z = -31

    val Component: Z = -30

    val Classifier: Z = -29

    val FeatureEnd: Z = -28

    val FeatureGroup: Z = -27

    val FeatureAccess: Z = -26

    val Connection: Z = -25

    val ConnectionInstance: Z = -24

    val ConnectionReference: Z = -23

    val EndPoint: Z = -22

    val Property: Z = -21

    val AadlElementRef: Z = -20

    val ClassifierProp: Z = -19

    val RangeProp: Z = -18

    val RecordProp: Z = -17

    val ReferenceProp: Z = -16

    val UnitProp: Z = -15

    val ValueProp: Z = -14

    val Mode: Z = -13

    val Flow: Z = -12

    val Annex: Z = -11

    val OtherAnnex: Z = -10

    val OtherLib: Z = -9

    val BTSBLESSAnnexClause: Z = -8

    val BTSVariableDeclaration: Z = -7

    val BTSStateDeclaration: Z = -6

    val BTSTransition: Z = -5

    val BTSTransitionLabel: Z = -4

    val BTSDispatchCondition: Z = -3

    val BTSDispatchConjunction: Z = -2

    val BTSDispatchTriggerStop: Z = -1

    val BTSDispatchTriggerPort: Z = 0

    val BTSDispatchTriggerTimeout: Z = 1

    val BTSExecuteConditionExp: Z = 2

    val BTSExecuteConditionTimeout: Z = 3

    val BTSExecuteConditionOtherwise: Z = 4

    val BTSModeCondition: Z = 5

    val BTSTriggerLogicalExpression: Z = 6

    val BTSSubcomponentPort: Z = 7

    val BTSInternalCondition: Z = 8

    val BTSNamedAssertion: Z = 9

    val BTSNamedFunction: Z = 10

    val BTSNamedEnumeration: Z = 11

    val BTSNamelessAssertion: Z = 12

    val BTSNamelessFunction: Z = 13

    val BTSNamelessEnumeration: Z = 14

    val BTSEnumerationPairs: Z = 15

    val BTSEnumerationPair: Z = 16

    val BTSInvocation: Z = 17

    val BTSActualParameter: Z = 18

    val BTSVariable: Z = 19

    val BTSActionAnnexSubclause: Z = 20

    val BTSBehaviorActions: Z = 21

    val BTSAssertedAction: Z = 22

    val BTSSkipAction: Z = 23

    val BTSAssignmentAction: Z = 24

    val BTSSetMode: Z = 25

    val BTSWhenThrow: Z = 26

    val BTSFetchAdd: Z = 27

    val BTSFetchOr: Z = 28

    val BTSFetchAnd: Z = 29

    val BTSFetchXor: Z = 30

    val BTSSwap: Z = 31

    val BTSSubprogramCallAction: Z = 32

    val BTSFormalActual: Z = 33

    val BTSPortOutput: Z = 34

    val BTSPortInput: Z = 35

    val BTSFrozenPortAction: Z = 36

    val BTSPause: Z = 37

    val BTSIfBLESSAction: Z = 38

    val BTSGuardedAction: Z = 39

    val BTSIfBAAction: Z = 40

    val BTSConditionalActions: Z = 41

    val BTSWhileLoop: Z = 42

    val BTSForLoop: Z = 43

    val BTSDoUntilLoop: Z = 44

    val BTSExistentialLatticeQuantification: Z = 45

    val BTSCatchClauseTerm: Z = 46

    val BTSUniversalLatticeQuantification: Z = 47

    val BTSUnaryExp: Z = 48

    val BTSBinaryExp: Z = 49

    val BTSLiteralExp: Z = 50

    val BTSVariableNameExp: Z = 51

    val BTSPartialName: Z = 52

    val BTSIndexingExp: Z = 53

    val BTSAccessExp: Z = 54

    val BTSFunctionCall: Z = 55

    val BTSPortValue: Z = 56

    val BTSConditionalExpression: Z = 57

    val BTSTrue: Z = 58

    val BTSFalse: Z = 59

    val BTSNull: Z = 60

    val BTSPropertyConstant: Z = 61

    val BTSPropertySetProperty: Z = 62

    val BTSSelfProperty: Z = 63

    val BTSComponentProperty: Z = 64

    val BTSComponent: Z = 65

    val BTSPropertyField: Z = 66

    val BTSUniversalQuantification: Z = 67

    val BTSExistentialQuantification: Z = 68

    val BTSSumQuantification: Z = 69

    val BTSProductQuantification: Z = 70

    val BTSCountingQuantification: Z = 71

    val BTSRange: Z = 72

    val BTSTypeLibrary: Z = 73

    val BTSTypeDeclatation: Z = 74

    val BTSBooleanType: Z = 75

    val BTSStringType: Z = 76

    val BTSNullType: Z = 77

    val BTSClassifier: Z = 78

    val BTSTypeName: Z = 79

    val BTSEnumerationType: Z = 80

    val BTSQuantityType: Z = 81

    val BTSArrayType: Z = 82

    val BTSArrayRange: Z = 83

    val BTSRecordType: Z = 84

    val BTSRecordField: Z = 85

    val BTSUnitLibrary: Z = 86

    val BTSRootDeclaration: Z = 87

    val BTSUnitExtension: Z = 88

    val BTSUnitName: Z = 89

    val BTSUnitFormula: Z = 90

    val BTSUnitFactor: Z = 91

    val BTSQuantity: Z = 92

    val BTSExceptionLibrary: Z = 93

    val BTSExceptionDeclaration: Z = 94

    val TODO: Z = 95

    val Emv2ElementRef: Z = 96

    val Emv2Library: Z = 97

    val ErrorTypeDef: Z = 98

    val ErrorAliasDef: Z = 99

    val ErrorTypeSetDef: Z = 100

    val BehaveStateMachine: Z = 101

    val ErrorEvent: Z = 102

    val ErrorState: Z = 103

    val ErrorTransition: Z = 104

    val ConditionTrigger: Z = 105

    val AndCondition: Z = 106

    val OrCondition: Z = 107

    val AllCondition: Z = 108

    val OrMoreCondition: Z = 109

    val OrLessCondition: Z = 110

    val Emv2Clause: Z = 111

    val Emv2Propagation: Z = 112

    val Emv2Flow: Z = 113

    val Emv2BehaviorSection: Z = 114

    val ErrorPropagation: Z = 115

    val SmfClause: Z = 116

    val SmfClassification: Z = 117

    val SmfDeclass: Z = 118

    val SmfLibrary: Z = 119

    val SmfType: Z = 120

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeAadlInstInfo(o: AadlInstInfo): Unit = {
      o match {
        case o: Component => writeComponent(o)
        case o: ErrorTypeDef => writeErrorTypeDef(o)
        case o: FeatureEnd => writeFeatureEnd(o)
        case o: FeatureGroup => writeFeatureGroup(o)
        case o: FeatureAccess => writeFeatureAccess(o)
        case o: Connection => writeConnection(o)
        case o: Emv2Flow => writeEmv2Flow(o)
        case o: Flow => writeFlow(o)
      }
    }

    def writeAadl(o: Aadl): Unit = {
      writer.writeZ(Constants.Aadl)
      writer.writeISZ(o.components, writeComponent _)
      writer.writeISZ(o.annexLib, writeAnnexLib _)
      writer.writeISZ(o.dataComponents, writeComponent _)
    }

    def writeName(o: Name): Unit = {
      writer.writeZ(Constants.Name)
      writer.writeISZ(o.name, writer.writeString _)
      writer.writeOption(o.pos, writer.writePosition _)
    }

    def writeComponent(o: Component): Unit = {
      writer.writeZ(Constants.Component)
      writeName(o.identifier)
      writeComponentCategoryType(o.category)
      writer.writeOption(o.classifier, writeClassifier _)
      writer.writeISZ(o.features, writeFeature _)
      writer.writeISZ(o.subComponents, writeComponent _)
      writer.writeISZ(o.connections, writeConnection _)
      writer.writeISZ(o.connectionInstances, writeConnectionInstance _)
      writer.writeISZ(o.properties, writeProperty _)
      writer.writeISZ(o.flows, writeFlow _)
      writer.writeISZ(o.modes, writeMode _)
      writer.writeISZ(o.annexes, writeAnnex _)
      writer.writeString(o.uriFrag)
    }

    def writeClassifier(o: Classifier): Unit = {
      writer.writeZ(Constants.Classifier)
      writer.writeString(o.name)
    }

    def writeComponentCategoryType(o: ComponentCategory.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFeature(o: Feature): Unit = {
      o match {
        case o: FeatureEnd => writeFeatureEnd(o)
        case o: FeatureGroup => writeFeatureGroup(o)
        case o: FeatureAccess => writeFeatureAccess(o)
      }
    }

    def writeFeatureEnd(o: FeatureEnd): Unit = {
      writer.writeZ(Constants.FeatureEnd)
      writeName(o.identifier)
      writeDirectionType(o.direction)
      writeFeatureCategoryType(o.category)
      writer.writeOption(o.classifier, writeClassifier _)
      writer.writeISZ(o.properties, writeProperty _)
      writer.writeString(o.uriFrag)
    }

    def writeFeatureGroup(o: FeatureGroup): Unit = {
      writer.writeZ(Constants.FeatureGroup)
      writeName(o.identifier)
      writer.writeISZ(o.features, writeFeature _)
      writer.writeB(o.isInverse)
      writeFeatureCategoryType(o.category)
      writer.writeISZ(o.properties, writeProperty _)
      writer.writeString(o.uriFrag)
    }

    def writeFeatureAccess(o: FeatureAccess): Unit = {
      writer.writeZ(Constants.FeatureAccess)
      writeName(o.identifier)
      writeFeatureCategoryType(o.category)
      writer.writeOption(o.classifier, writeClassifier _)
      writeAccessTypeType(o.accessType)
      writeAccessCategoryType(o.accessCategory)
      writer.writeISZ(o.properties, writeProperty _)
      writer.writeString(o.uriFrag)
    }

    def writeAccessTypeType(o: AccessType.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeAccessCategoryType(o: AccessCategory.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDirectionType(o: Direction.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFeatureCategoryType(o: FeatureCategory.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeConnection(o: Connection): Unit = {
      writer.writeZ(Constants.Connection)
      writeName(o.name)
      writer.writeISZ(o.src, writeEndPoint _)
      writer.writeISZ(o.dst, writeEndPoint _)
      writeConnectionKindType(o.kind)
      writer.writeB(o.isBiDirectional)
      writer.writeISZ(o.connectionInstances, writeName _)
      writer.writeISZ(o.properties, writeProperty _)
      writer.writeString(o.uriFrag)
    }

    def writeConnectionInstance(o: ConnectionInstance): Unit = {
      writer.writeZ(Constants.ConnectionInstance)
      writeName(o.name)
      writeEndPoint(o.src)
      writeEndPoint(o.dst)
      writeConnectionKindType(o.kind)
      writer.writeISZ(o.connectionRefs, writeConnectionReference _)
      writer.writeISZ(o.properties, writeProperty _)
    }

    def writeConnectionReference(o: ConnectionReference): Unit = {
      writer.writeZ(Constants.ConnectionReference)
      writeName(o.name)
      writeName(o.context)
      writer.writeB(o.isParent)
    }

    def writeConnectionKindType(o: ConnectionKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEndPoint(o: EndPoint): Unit = {
      writer.writeZ(Constants.EndPoint)
      writeName(o.component)
      writer.writeOption(o.feature, writeName _)
      writer.writeOption(o.direction, writeDirectionType _)
    }

    def writeProperty(o: Property): Unit = {
      writer.writeZ(Constants.Property)
      writeName(o.name)
      writer.writeISZ(o.propertyValues, writePropertyValue _)
      writer.writeISZ(o.appliesTo, writeElementRef _)
    }

    def writeElementRef(o: ElementRef): Unit = {
      o match {
        case o: Emv2ElementRef => writeEmv2ElementRef(o)
        case o: AadlElementRef => writeAadlElementRef(o)
      }
    }

    def writeElementKindType(o: ElementKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeAadlElementRef(o: AadlElementRef): Unit = {
      writer.writeZ(Constants.AadlElementRef)
      writeElementKindType(o.elementKind)
      writeName(o.name)
    }

    def writePropertyValue(o: PropertyValue): Unit = {
      o match {
        case o: ClassifierProp => writeClassifierProp(o)
        case o: RangeProp => writeRangeProp(o)
        case o: RecordProp => writeRecordProp(o)
        case o: ReferenceProp => writeReferenceProp(o)
        case o: UnitProp => writeUnitProp(o)
        case o: ValueProp => writeValueProp(o)
      }
    }

    def writeClassifierProp(o: ClassifierProp): Unit = {
      writer.writeZ(Constants.ClassifierProp)
      writer.writeString(o.name)
    }

    def writeRangeProp(o: RangeProp): Unit = {
      writer.writeZ(Constants.RangeProp)
      writeUnitProp(o.low)
      writeUnitProp(o.high)
    }

    def writeRecordProp(o: RecordProp): Unit = {
      writer.writeZ(Constants.RecordProp)
      writer.writeISZ(o.properties, writeProperty _)
    }

    def writeReferenceProp(o: ReferenceProp): Unit = {
      writer.writeZ(Constants.ReferenceProp)
      writeName(o.value)
    }

    def writeUnitProp(o: UnitProp): Unit = {
      writer.writeZ(Constants.UnitProp)
      writer.writeString(o.value)
      writer.writeOption(o.unit, writer.writeString _)
    }

    def writeValueProp(o: ValueProp): Unit = {
      writer.writeZ(Constants.ValueProp)
      writer.writeString(o.value)
    }

    def writeMode(o: Mode): Unit = {
      writer.writeZ(Constants.Mode)
      writeName(o.name)
    }

    def writeFlowKindType(o: FlowKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFlow(o: Flow): Unit = {
      writer.writeZ(Constants.Flow)
      writeName(o.name)
      writeFlowKindType(o.kind)
      writer.writeOption(o.source, writeName _)
      writer.writeOption(o.sink, writeName _)
      writer.writeString(o.uriFrag)
    }

    def writeAnnex(o: Annex): Unit = {
      writer.writeZ(Constants.Annex)
      writer.writeString(o.name)
      writeAnnexClause(o.clause)
    }

    def writeAnnexClause(o: AnnexClause): Unit = {
      o match {
        case o: SmfClause => writeSmfClause(o)
        case o: SmfClassification => writeSmfClassification(o)
        case o: SmfDeclass => writeSmfDeclass(o)
        case o: SmfType => writeSmfType(o)
        case o: ErrorTypeDef => writeErrorTypeDef(o)
        case o: ErrorAliasDef => writeErrorAliasDef(o)
        case o: ErrorTypeSetDef => writeErrorTypeSetDef(o)
        case o: BehaveStateMachine => writeBehaveStateMachine(o)
        case o: ErrorEvent => writeErrorEvent(o)
        case o: ErrorState => writeErrorState(o)
        case o: ErrorTransition => writeErrorTransition(o)
        case o: ConditionTrigger => writeConditionTrigger(o)
        case o: AndCondition => writeAndCondition(o)
        case o: OrCondition => writeOrCondition(o)
        case o: AllCondition => writeAllCondition(o)
        case o: OrMoreCondition => writeOrMoreCondition(o)
        case o: OrLessCondition => writeOrLessCondition(o)
        case o: Emv2Clause => writeEmv2Clause(o)
        case o: Emv2Propagation => writeEmv2Propagation(o)
        case o: Emv2Flow => writeEmv2Flow(o)
        case o: Emv2BehaviorSection => writeEmv2BehaviorSection(o)
        case o: ErrorPropagation => writeErrorPropagation(o)
        case o: OtherAnnex => writeOtherAnnex(o)
        case o: BTSBLESSAnnexClause => writeBTSBLESSAnnexClause(o)
        case o: BTSActionAnnexSubclause => writeBTSActionAnnexSubclause(o)
      }
    }

    def writeAnnexLib(o: AnnexLib): Unit = {
      o match {
        case o: SmfLibrary => writeSmfLibrary(o)
        case o: Emv2Library => writeEmv2Library(o)
        case o: OtherLib => writeOtherLib(o)
        case o: BTSTypeLibrary => writeBTSTypeLibrary(o)
        case o: BTSUnitLibrary => writeBTSUnitLibrary(o)
        case o: BTSExceptionLibrary => writeBTSExceptionLibrary(o)
      }
    }

    def writeOtherAnnex(o: OtherAnnex): Unit = {
      writer.writeZ(Constants.OtherAnnex)
      writer.writeString(o.clause)
    }

    def writeOtherLib(o: OtherLib): Unit = {
      writer.writeZ(Constants.OtherLib)
      writer.writeString(o.lib)
    }

    def writeBLESSAnnex(o: BLESSAnnex): Unit = {
      o match {
        case o: BTSBLESSAnnexClause => writeBTSBLESSAnnexClause(o)
        case o: BTSActionAnnexSubclause => writeBTSActionAnnexSubclause(o)
      }
    }

    def writeBTSBLESSAnnexClause(o: BTSBLESSAnnexClause): Unit = {
      writer.writeZ(Constants.BTSBLESSAnnexClause)
      writer.writeB(o.doNotProve)
      writer.writeISZ(o.assertions, writeBTSAssertion _)
      writer.writeOption(o.invariant, writeBTSAssertion _)
      writer.writeISZ(o.variables, writeBTSVariableDeclaration _)
      writer.writeISZ(o.states, writeBTSStateDeclaration _)
      writer.writeISZ(o.transitions, writeBTSTransition _)
    }

    def writeBTSVariableDeclaration(o: BTSVariableDeclaration): Unit = {
      writer.writeZ(Constants.BTSVariableDeclaration)
      writeName(o.name)
      writer.writeOption(o.category, writeBTSVariableCategoryType _)
      writeBTSType(o.varType)
      writer.writeOption(o.assignExpression, writeBTSExp _)
      writer.writeOption(o.arraySize, writeBTSExp _)
      writer.writeOption(o.variableAssertion, writeBTSAssertion _)
    }

    def writeBTSVariableCategoryType(o: BTSVariableCategory.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBTSStateDeclaration(o: BTSStateDeclaration): Unit = {
      writer.writeZ(Constants.BTSStateDeclaration)
      writeName(o.id)
      writer.writeISZ(o.categories, writeBTSStateCategoryType _)
      writer.writeOption(o.assertion, writeBTSAssertion _)
    }

    def writeBTSStateCategoryType(o: BTSStateCategory.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBTSTransition(o: BTSTransition): Unit = {
      writer.writeZ(Constants.BTSTransition)
      writeBTSTransitionLabel(o.label)
      writer.writeISZ(o.sourceStates, writeName _)
      writeName(o.destState)
      writer.writeOption(o.transitionCondition, writeBTSTransitionCondition _)
      writer.writeOption(o.actions, writeBTSBehaviorActions _)
      writer.writeOption(o.assertion, writeBTSAssertion _)
    }

    def writeBTSTransitionLabel(o: BTSTransitionLabel): Unit = {
      writer.writeZ(Constants.BTSTransitionLabel)
      writeName(o.id)
      writer.writeOption(o.priority, writer.writeZ _)
    }

    def writeBTSTransitionCondition(o: BTSTransitionCondition): Unit = {
      o match {
        case o: BTSDispatchCondition => writeBTSDispatchCondition(o)
        case o: BTSExecuteConditionExp => writeBTSExecuteConditionExp(o)
        case o: BTSExecuteConditionTimeout => writeBTSExecuteConditionTimeout(o)
        case o: BTSExecuteConditionOtherwise => writeBTSExecuteConditionOtherwise(o)
        case o: BTSModeCondition => writeBTSModeCondition(o)
        case o: BTSInternalCondition => writeBTSInternalCondition(o)
      }
    }

    def writeBTSDispatchCondition(o: BTSDispatchCondition): Unit = {
      writer.writeZ(Constants.BTSDispatchCondition)
      writer.writeISZ(o.conjunctions, writeBTSDispatchConjunction _)
      writeName(o.subprogramaccessdispatch)
      writer.writeISZ(o.frozenPorts, writeName _)
    }

    def writeBTSDispatchConjunction(o: BTSDispatchConjunction): Unit = {
      writer.writeZ(Constants.BTSDispatchConjunction)
      writer.writeISZ(o.triggers, writeBTSDispatchTrigger _)
    }

    def writeBTSDispatchTrigger(o: BTSDispatchTrigger): Unit = {
      o match {
        case o: BTSDispatchTriggerStop => writeBTSDispatchTriggerStop(o)
        case o: BTSDispatchTriggerPort => writeBTSDispatchTriggerPort(o)
        case o: BTSDispatchTriggerTimeout => writeBTSDispatchTriggerTimeout(o)
      }
    }

    def writeBTSDispatchTriggerStop(o: BTSDispatchTriggerStop): Unit = {
      writer.writeZ(Constants.BTSDispatchTriggerStop)
    }

    def writeBTSDispatchTriggerPort(o: BTSDispatchTriggerPort): Unit = {
      writer.writeZ(Constants.BTSDispatchTriggerPort)
      writeName(o.port)
      writer.writeOption(o.portarrayindex, writer.writeZ _)
    }

    def writeBTSDispatchTriggerTimeout(o: BTSDispatchTriggerTimeout): Unit = {
      writer.writeZ(Constants.BTSDispatchTriggerTimeout)
      writer.writeISZ(o.ports, writeName _)
      writer.writeOption(o.time, writeBTSExp _)
    }

    def writeBTSExecuteCondition(o: BTSExecuteCondition): Unit = {
      o match {
        case o: BTSExecuteConditionExp => writeBTSExecuteConditionExp(o)
        case o: BTSExecuteConditionTimeout => writeBTSExecuteConditionTimeout(o)
        case o: BTSExecuteConditionOtherwise => writeBTSExecuteConditionOtherwise(o)
      }
    }

    def writeBTSExecuteConditionExp(o: BTSExecuteConditionExp): Unit = {
      writer.writeZ(Constants.BTSExecuteConditionExp)
      writeBTSExp(o.exp)
    }

    def writeBTSExecuteConditionTimeout(o: BTSExecuteConditionTimeout): Unit = {
      writer.writeZ(Constants.BTSExecuteConditionTimeout)
    }

    def writeBTSExecuteConditionOtherwise(o: BTSExecuteConditionOtherwise): Unit = {
      writer.writeZ(Constants.BTSExecuteConditionOtherwise)
    }

    def writeBTSModeCondition(o: BTSModeCondition): Unit = {
      writer.writeZ(Constants.BTSModeCondition)
      writeBTSTriggerLogicalExpression(o.tle)
    }

    def writeBTSTriggerLogicalExpression(o: BTSTriggerLogicalExpression): Unit = {
      writer.writeZ(Constants.BTSTriggerLogicalExpression)
      writeBTSModeOperatorType(o.op)
      writer.writeISZ(o.triggers, writeBTSEventTrigger _)
    }

    def writeBTSEventTrigger(o: BTSEventTrigger): Unit = {
      o match {
        case o: BTSTriggerLogicalExpression => writeBTSTriggerLogicalExpression(o)
        case o: BTSSubcomponentPort => writeBTSSubcomponentPort(o)
      }
    }

    def writeBTSSubcomponentPort(o: BTSSubcomponentPort): Unit = {
      writer.writeZ(Constants.BTSSubcomponentPort)
      writer.writeISZ(o.sub, writeName _)
      writeName(o.port)
      writer.writeOption(o.index, writer.writeZ _)
    }

    def writeBTSModeOperatorType(o: BTSModeOperator.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBTSInternalCondition(o: BTSInternalCondition): Unit = {
      writer.writeZ(Constants.BTSInternalCondition)
      writer.writeISZ(o.internalports, writeName _)
    }

    def writeBTSAssertion(o: BTSAssertion): Unit = {
      o match {
        case o: BTSNamedAssertion => writeBTSNamedAssertion(o)
        case o: BTSNamedFunction => writeBTSNamedFunction(o)
        case o: BTSNamedEnumeration => writeBTSNamedEnumeration(o)
        case o: BTSNamelessAssertion => writeBTSNamelessAssertion(o)
        case o: BTSNamelessFunction => writeBTSNamelessFunction(o)
        case o: BTSNamelessEnumeration => writeBTSNamelessEnumeration(o)
      }
    }

    def writeBTSNamedAssertion(o: BTSNamedAssertion): Unit = {
      writer.writeZ(Constants.BTSNamedAssertion)
      writeName(o.label)
      writer.writeISZ(o.formals, writeBTSVariable _)
      writeBTSExp(o.predicate)
    }

    def writeBTSNamedFunction(o: BTSNamedFunction): Unit = {
      writer.writeZ(Constants.BTSNamedFunction)
      writeName(o.label)
      writer.writeISZ(o.formals, writeBTSVariable _)
      writeBTSType(o.returns)
      writeBTSExp(o.functionvalue)
    }

    def writeBTSNamedEnumeration(o: BTSNamedEnumeration): Unit = {
      writer.writeZ(Constants.BTSNamedEnumeration)
      writeName(o.label)
      writeName(o.assertionvariable)
      writeBTSType(o.enumerationtype)
      writeBTSAssertionEnumeration(o.enumeration)
    }

    def writeBTSNamelessAssertion(o: BTSNamelessAssertion): Unit = {
      writer.writeZ(Constants.BTSNamelessAssertion)
      writeBTSExp(o.predicate)
    }

    def writeBTSNamelessFunction(o: BTSNamelessFunction): Unit = {
      writer.writeZ(Constants.BTSNamelessFunction)
      writeBTSType(o.returns)
      writeBTSExp(o.functionvalue)
    }

    def writeBTSNamelessEnumeration(o: BTSNamelessEnumeration): Unit = {
      writer.writeZ(Constants.BTSNamelessEnumeration)
      writeBTSInvocation(o.enumeration)
    }

    def writeBTSAssertionEnumeration(o: BTSAssertionEnumeration): Unit = {
      o match {
        case o: BTSEnumerationPairs => writeBTSEnumerationPairs(o)
        case o: BTSInvocation => writeBTSInvocation(o)
      }
    }

    def writeBTSEnumerationPairs(o: BTSEnumerationPairs): Unit = {
      writer.writeZ(Constants.BTSEnumerationPairs)
      writer.writeISZ(o.pairs, writeBTSEnumerationPair _)
    }

    def writeBTSEnumerationPair(o: BTSEnumerationPair): Unit = {
      writer.writeZ(Constants.BTSEnumerationPair)
      writeName(o.literal)
      writeBTSExp(o.predicate)
    }

    def writeBTSInvocation(o: BTSInvocation): Unit = {
      writer.writeZ(Constants.BTSInvocation)
      writeName(o.label)
      writer.writeISZ(o.params, writeBTSActualParameter _)
      writer.writeOption(o.actual, writeBTSExp _)
    }

    def writeBTSActualParameter(o: BTSActualParameter): Unit = {
      writer.writeZ(Constants.BTSActualParameter)
      writeName(o.formal)
      writeBTSExp(o.actual)
    }

    def writeBTSVariable(o: BTSVariable): Unit = {
      writer.writeZ(Constants.BTSVariable)
      writeName(o.name)
      writeBTSType(o.typ)
    }

    def writeBTSActionAnnexSubclause(o: BTSActionAnnexSubclause): Unit = {
      writer.writeZ(Constants.BTSActionAnnexSubclause)
      writer.writeB(o.doNotProve)
      writer.writeISZ(o.throws, writeName _)
      writer.writeISZ(o.assertions, writeBTSAssertion _)
      writer.writeOption(o.precondition, writeBTSAssertion _)
      writer.writeOption(o.postcondition, writeBTSAssertion _)
      writer.writeOption(o.invariant, writeBTSAssertion _)
      writeBTSExistentialLatticeQuantification(o.elq)
    }

    def writeBTSBehaviorActions(o: BTSBehaviorActions): Unit = {
      writer.writeZ(Constants.BTSBehaviorActions)
      writeBTSExecutionOrderType(o.executionOrder)
      writer.writeISZ(o.actions, writeBTSAssertedAction _)
    }

    def writeBTSExecutionOrderType(o: BTSExecutionOrder.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBTSAssertedAction(o: BTSAssertedAction): Unit = {
      writer.writeZ(Constants.BTSAssertedAction)
      writer.writeOption(o.precondition, writeBTSAssertion _)
      writeBTSAction(o.action)
      writer.writeOption(o.postcondition, writeBTSAssertion _)
    }

    def writeBTSAction(o: BTSAction): Unit = {
      o match {
        case o: BTSSkipAction => writeBTSSkipAction(o)
        case o: BTSAssignmentAction => writeBTSAssignmentAction(o)
        case o: BTSSetMode => writeBTSSetMode(o)
        case o: BTSWhenThrow => writeBTSWhenThrow(o)
        case o: BTSFetchAdd => writeBTSFetchAdd(o)
        case o: BTSFetchOr => writeBTSFetchOr(o)
        case o: BTSFetchAnd => writeBTSFetchAnd(o)
        case o: BTSFetchXor => writeBTSFetchXor(o)
        case o: BTSSwap => writeBTSSwap(o)
        case o: BTSSubprogramCallAction => writeBTSSubprogramCallAction(o)
        case o: BTSPortOutput => writeBTSPortOutput(o)
        case o: BTSPortInput => writeBTSPortInput(o)
        case o: BTSFrozenPortAction => writeBTSFrozenPortAction(o)
        case o: BTSPause => writeBTSPause(o)
        case o: BTSIfBLESSAction => writeBTSIfBLESSAction(o)
        case o: BTSIfBAAction => writeBTSIfBAAction(o)
        case o: BTSWhileLoop => writeBTSWhileLoop(o)
        case o: BTSForLoop => writeBTSForLoop(o)
        case o: BTSDoUntilLoop => writeBTSDoUntilLoop(o)
        case o: BTSExistentialLatticeQuantification => writeBTSExistentialLatticeQuantification(o)
        case o: BTSUniversalLatticeQuantification => writeBTSUniversalLatticeQuantification(o)
      }
    }

    def writeBTSBasicAction(o: BTSBasicAction): Unit = {
      o match {
        case o: BTSSkipAction => writeBTSSkipAction(o)
        case o: BTSAssignmentAction => writeBTSAssignmentAction(o)
        case o: BTSSetMode => writeBTSSetMode(o)
        case o: BTSWhenThrow => writeBTSWhenThrow(o)
        case o: BTSFetchAdd => writeBTSFetchAdd(o)
        case o: BTSFetchOr => writeBTSFetchOr(o)
        case o: BTSFetchAnd => writeBTSFetchAnd(o)
        case o: BTSFetchXor => writeBTSFetchXor(o)
        case o: BTSSwap => writeBTSSwap(o)
        case o: BTSSubprogramCallAction => writeBTSSubprogramCallAction(o)
        case o: BTSPortOutput => writeBTSPortOutput(o)
        case o: BTSPortInput => writeBTSPortInput(o)
        case o: BTSFrozenPortAction => writeBTSFrozenPortAction(o)
        case o: BTSPause => writeBTSPause(o)
      }
    }

    def writeBTSSkipAction(o: BTSSkipAction): Unit = {
      writer.writeZ(Constants.BTSSkipAction)
    }

    def writeBTSAssignmentAction(o: BTSAssignmentAction): Unit = {
      writer.writeZ(Constants.BTSAssignmentAction)
      writeBTSValueName(o.lhs)
      writer.writeB(o.tick)
      writeBTSExp(o.rhs)
    }

    def writeBTSSetMode(o: BTSSetMode): Unit = {
      writer.writeZ(Constants.BTSSetMode)
      writeName(o.mode)
    }

    def writeBTSWhenThrow(o: BTSWhenThrow): Unit = {
      writer.writeZ(Constants.BTSWhenThrow)
      writeBTSExp(o.exp)
      writeName(o.exception)
      writer.writeOption(o.message, writer.writeString _)
    }

    def writeBTSCombinableOperation(o: BTSCombinableOperation): Unit = {
      o match {
        case o: BTSFetchAdd => writeBTSFetchAdd(o)
        case o: BTSFetchOr => writeBTSFetchOr(o)
        case o: BTSFetchAnd => writeBTSFetchAnd(o)
        case o: BTSFetchXor => writeBTSFetchXor(o)
        case o: BTSSwap => writeBTSSwap(o)
      }
    }

    def writeBTSFetchAdd(o: BTSFetchAdd): Unit = {
      writer.writeZ(Constants.BTSFetchAdd)
      writeName(o.target)
      writeBTSExp(o.arithmetic)
      writeName(o.result)
    }

    def writeBTSFetchOr(o: BTSFetchOr): Unit = {
      writer.writeZ(Constants.BTSFetchOr)
      writeName(o.target)
      writeBTSExp(o.bool)
      writer.writeOption(o.result, writeName _)
    }

    def writeBTSFetchAnd(o: BTSFetchAnd): Unit = {
      writer.writeZ(Constants.BTSFetchAnd)
      writeName(o.target)
      writeBTSExp(o.bool)
      writer.writeOption(o.result, writeName _)
    }

    def writeBTSFetchXor(o: BTSFetchXor): Unit = {
      writer.writeZ(Constants.BTSFetchXor)
      writeName(o.target)
      writeBTSExp(o.bool)
      writer.writeOption(o.result, writeName _)
    }

    def writeBTSSwap(o: BTSSwap): Unit = {
      writer.writeZ(Constants.BTSSwap)
      writeName(o.target)
      writeName(o.reference)
      writeName(o.result)
    }

    def writeBTSCommunicationAction(o: BTSCommunicationAction): Unit = {
      o match {
        case o: BTSSubprogramCallAction => writeBTSSubprogramCallAction(o)
        case o: BTSPortOutput => writeBTSPortOutput(o)
        case o: BTSPortInput => writeBTSPortInput(o)
        case o: BTSFrozenPortAction => writeBTSFrozenPortAction(o)
        case o: BTSPause => writeBTSPause(o)
      }
    }

    def writeBTSSubprogramCallAction(o: BTSSubprogramCallAction): Unit = {
      writer.writeZ(Constants.BTSSubprogramCallAction)
      writeName(o.name)
      writer.writeISZ(o.params, writeBTSFormalActual _)
    }

    def writeBTSFormalActual(o: BTSFormalActual): Unit = {
      writer.writeZ(Constants.BTSFormalActual)
      writeName(o.formal)
      writeBTSExp(o.actual)
    }

    def writeBTSPortOutput(o: BTSPortOutput): Unit = {
      writer.writeZ(Constants.BTSPortOutput)
      writeName(o.port)
      writer.writeOption(o.exp, writeBTSExp _)
    }

    def writeBTSPortInput(o: BTSPortInput): Unit = {
      writer.writeZ(Constants.BTSPortInput)
      writeName(o.port)
      writeBTSValueName(o.variable)
    }

    def writeBTSFrozenPortAction(o: BTSFrozenPortAction): Unit = {
      writer.writeZ(Constants.BTSFrozenPortAction)
      writer.writeISZ(o.ports, writeName _)
    }

    def writeBTSPause(o: BTSPause): Unit = {
      writer.writeZ(Constants.BTSPause)
    }

    def writeBTSControlAction(o: BTSControlAction): Unit = {
      o match {
        case o: BTSIfBLESSAction => writeBTSIfBLESSAction(o)
        case o: BTSIfBAAction => writeBTSIfBAAction(o)
        case o: BTSWhileLoop => writeBTSWhileLoop(o)
        case o: BTSForLoop => writeBTSForLoop(o)
        case o: BTSDoUntilLoop => writeBTSDoUntilLoop(o)
      }
    }

    def writeBTSIfBLESSAction(o: BTSIfBLESSAction): Unit = {
      writer.writeZ(Constants.BTSIfBLESSAction)
      writer.writeOption(o.availability, writeTODO _)
      writer.writeISZ(o.alternatives, writeBTSGuardedAction _)
    }

    def writeBTSGuardedAction(o: BTSGuardedAction): Unit = {
      writer.writeZ(Constants.BTSGuardedAction)
      writeBTSExp(o.guard)
      writeBTSAssertedAction(o.action)
    }

    def writeBTSIfBAAction(o: BTSIfBAAction): Unit = {
      writer.writeZ(Constants.BTSIfBAAction)
      writeBTSConditionalActions(o.ifBranch)
      writer.writeISZ(o.elseIfBranches, writeBTSConditionalActions _)
      writer.writeOption(o.elseBranch, writeBTSBehaviorActions _)
    }

    def writeBTSConditionalActions(o: BTSConditionalActions): Unit = {
      writer.writeZ(Constants.BTSConditionalActions)
      writeBTSExp(o.cond)
      writeBTSBehaviorActions(o.actions)
    }

    def writeBTSWhileLoop(o: BTSWhileLoop): Unit = {
      writer.writeZ(Constants.BTSWhileLoop)
      writeBTSExp(o.test)
      writer.writeOption(o.invariant, writeBTSNamelessAssertion _)
      writer.writeOption(o.bound, writeBTSExp _)
      writeBTSExistentialLatticeQuantification(o.elq)
    }

    def writeBTSForLoop(o: BTSForLoop): Unit = {
      writer.writeZ(Constants.BTSForLoop)
      writeName(o.count)
      writeBTSExp(o.lowerbound)
      writeBTSExp(o.upperbound)
      writer.writeOption(o.invariant, writeBTSNamelessAssertion _)
      writeBTSBehaviorActions(o.actions)
    }

    def writeBTSDoUntilLoop(o: BTSDoUntilLoop): Unit = {
      writer.writeZ(Constants.BTSDoUntilLoop)
      writer.writeOption(o.invariant, writeBTSNamelessAssertion _)
      writer.writeOption(o.bound, writeBTSExp _)
      writeBTSBehaviorActions(o.actions)
      writeBTSExp(o.guard)
    }

    def writeBTSQuantificationActions(o: BTSQuantificationActions): Unit = {
      o match {
        case o: BTSExistentialLatticeQuantification => writeBTSExistentialLatticeQuantification(o)
        case o: BTSUniversalLatticeQuantification => writeBTSUniversalLatticeQuantification(o)
      }
    }

    def writeBTSExistentialLatticeQuantification(o: BTSExistentialLatticeQuantification): Unit = {
      writer.writeZ(Constants.BTSExistentialLatticeQuantification)
      writer.writeISZ(o.quantifiedVariables, writeBTSVariableDeclaration _)
      writeBTSBehaviorActions(o.actions)
      writer.writeOption(o.timeout, writeBTSExp _)
      writer.writeISZ(o.catchClause, writeBTSCatchClauseTerm _)
    }

    def writeBTSCatchClauseTerm(o: BTSCatchClauseTerm): Unit = {
      writer.writeZ(Constants.BTSCatchClauseTerm)
      writer.writeISZ(o.exceptions, writeName _)
      writer.writeB(o.all)
      writeBTSBasicAction(o.action)
    }

    def writeBTSUniversalLatticeQuantification(o: BTSUniversalLatticeQuantification): Unit = {
      writer.writeZ(Constants.BTSUniversalLatticeQuantification)
      writer.writeISZ(o.latticeVariables, writeName _)
      writeBTSExp(o.lowerbound)
      writeBTSExp(o.upperbound)
      writeBTSExistentialLatticeQuantification(o.elq)
    }

    def writeBTSExp(o: BTSExp): Unit = {
      o match {
        case o: BTSUnaryExp => writeBTSUnaryExp(o)
        case o: BTSBinaryExp => writeBTSBinaryExp(o)
        case o: BTSLiteralExp => writeBTSLiteralExp(o)
        case o: BTSVariableNameExp => writeBTSVariableNameExp(o)
        case o: BTSIndexingExp => writeBTSIndexingExp(o)
        case o: BTSAccessExp => writeBTSAccessExp(o)
        case o: BTSFunctionCall => writeBTSFunctionCall(o)
        case o: BTSConditionalExpression => writeBTSConditionalExpression(o)
        case o: BTSTrue => writeBTSTrue(o)
        case o: BTSFalse => writeBTSFalse(o)
        case o: BTSNull => writeBTSNull(o)
        case o: BTSPropertyConstant => writeBTSPropertyConstant(o)
        case o: BTSPropertySetProperty => writeBTSPropertySetProperty(o)
        case o: BTSSelfProperty => writeBTSSelfProperty(o)
        case o: BTSComponentProperty => writeBTSComponentProperty(o)
        case o: BTSUniversalQuantification => writeBTSUniversalQuantification(o)
        case o: BTSExistentialQuantification => writeBTSExistentialQuantification(o)
        case o: BTSSumQuantification => writeBTSSumQuantification(o)
        case o: BTSProductQuantification => writeBTSProductQuantification(o)
        case o: BTSCountingQuantification => writeBTSCountingQuantification(o)
        case o: BTSRange => writeBTSRange(o)
        case o: BTSQuantity => writeBTSQuantity(o)
      }
    }

    def writeBTSUnaryExp(o: BTSUnaryExp): Unit = {
      writer.writeZ(Constants.BTSUnaryExp)
      writeBTSUnaryOpType(o.op)
      writeBTSExp(o.exp)
    }

    def writeBTSUnaryOpType(o: BTSUnaryOp.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBTSBinaryExp(o: BTSBinaryExp): Unit = {
      writer.writeZ(Constants.BTSBinaryExp)
      writeBTSBinaryOpType(o.op)
      writeBTSExp(o.lhs)
      writeBTSExp(o.rhs)
    }

    def writeBTSBinaryOpType(o: BTSBinaryOp.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBTSLiteralTypeType(o: BTSLiteralType.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBTSLiteralExp(o: BTSLiteralExp): Unit = {
      writer.writeZ(Constants.BTSLiteralExp)
      writeBTSLiteralTypeType(o.typ)
      writer.writeString(o.exp)
      writer.writeOption(o.unit, writeName _)
    }

    def writeBTSValueName(o: BTSValueName): Unit = {
      o match {
        case o: BTSVariableNameExp => writeBTSVariableNameExp(o)
        case o: BTSFunctionCall => writeBTSFunctionCall(o)
      }
    }

    def writeBTSVariableNameExp(o: BTSVariableNameExp): Unit = {
      writer.writeZ(Constants.BTSVariableNameExp)
      writeName(o.name)
      writer.writeISZ(o.arrayindex, writeBTSExp _)
      writer.writeISZ(o.pn, writeBTSPartialName _)
    }

    def writeBTSPartialName(o: BTSPartialName): Unit = {
      writer.writeZ(Constants.BTSPartialName)
      writeName(o.label)
      writer.writeISZ(o.arrayindex, writeBTSExp _)
    }

    def writeBTSIndexingExp(o: BTSIndexingExp): Unit = {
      writer.writeZ(Constants.BTSIndexingExp)
      writeBTSExp(o.exp)
      writer.writeISZ(o.indices, writeBTSExp _)
    }

    def writeBTSAccessExp(o: BTSAccessExp): Unit = {
      writer.writeZ(Constants.BTSAccessExp)
      writeBTSExp(o.exp)
      writer.writeString(o.attributeName)
    }

    def writeBTSFunctionCall(o: BTSFunctionCall): Unit = {
      writer.writeZ(Constants.BTSFunctionCall)
      writeName(o.name)
      writer.writeISZ(o.args, writeBTSFormalActual _)
    }

    def writeBTSPortValue(o: BTSPortValue): Unit = {
      writer.writeZ(Constants.BTSPortValue)
      writeName(o.port)
      writeBTSPortValueKindType(o.valuekind)
    }

    def writeBTSPortValueKindType(o: BTSPortValueKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBTSConditionalExpression(o: BTSConditionalExpression): Unit = {
      writer.writeZ(Constants.BTSConditionalExpression)
      writeBTSExp(o.guard)
      writeBTSExp(o.t)
      writeBTSExp(o.f)
    }

    def writeBTSTrue(o: BTSTrue): Unit = {
      writer.writeZ(Constants.BTSTrue)
    }

    def writeBTSFalse(o: BTSFalse): Unit = {
      writer.writeZ(Constants.BTSFalse)
    }

    def writeBTSNull(o: BTSNull): Unit = {
      writer.writeZ(Constants.BTSNull)
    }

    def writeBTSPropertyConstant(o: BTSPropertyConstant): Unit = {
      writer.writeZ(Constants.BTSPropertyConstant)
      writeName(o.propertyset)
      writeName(o.propertyconstant)
    }

    def writeBTSPropertyReference(o: BTSPropertyReference): Unit = {
      o match {
      }
    }

    def writeBTSPropertySetProperty(o: BTSPropertySetProperty): Unit = {
      writer.writeZ(Constants.BTSPropertySetProperty)
      writer.writeOption(o.propertyset, writeName _)
      writeName(o.propertyconstant)
      writer.writeISZ(o.field, writeBTSPropertyField _)
    }

    def writeBTSSelfProperty(o: BTSSelfProperty): Unit = {
      writer.writeZ(Constants.BTSSelfProperty)
      writer.writeOption(o.propertyset, writeName _)
      writeName(o.propertyconstant)
      writer.writeISZ(o.field, writeBTSPropertyField _)
    }

    def writeBTSComponentProperty(o: BTSComponentProperty): Unit = {
      writer.writeZ(Constants.BTSComponentProperty)
      writeBTSComponent(o.component)
      writer.writeOption(o.propertyset, writeName _)
      writeName(o.propertyconstant)
      writer.writeISZ(o.field, writeBTSPropertyField _)
    }

    def writeBTSComponent(o: BTSComponent): Unit = {
      writer.writeZ(Constants.BTSComponent)
      writer.writeISZ(o.packageids, writeName _)
      writeName(o.component)
      writer.writeOption(o.impl, writeName _)
    }

    def writeBTSPropertyField(o: BTSPropertyField): Unit = {
      writer.writeZ(Constants.BTSPropertyField)
      writer.writeOption(o.index, writer.writeZ _)
      writer.writeOption(o.variable, writeName _)
      writer.writeOption(o.pf, writeName _)
      writer.writeB(o.upper)
      writer.writeB(o.lower)
    }

    def writeBTSUniversalQuantification(o: BTSUniversalQuantification): Unit = {
      writer.writeZ(Constants.BTSUniversalQuantification)
      writer.writeISZ(o.variables, writeBTSVariable _)
      writer.writeOption(o.range, writeBTSRange _)
      writer.writeOption(o.condition, writeBTSExp _)
      writeBTSExp(o.predicate)
    }

    def writeBTSExistentialQuantification(o: BTSExistentialQuantification): Unit = {
      writer.writeZ(Constants.BTSExistentialQuantification)
      writer.writeISZ(o.variables, writeBTSVariable _)
      writer.writeOption(o.range, writeBTSRange _)
      writer.writeOption(o.condition, writeBTSExp _)
      writeBTSExp(o.predicate)
    }

    def writeBTSSumQuantification(o: BTSSumQuantification): Unit = {
      writer.writeZ(Constants.BTSSumQuantification)
      writer.writeISZ(o.variables, writeBTSVariable _)
      writer.writeOption(o.range, writeBTSRange _)
      writer.writeOption(o.condition, writeBTSExp _)
      writeBTSExp(o.expression)
    }

    def writeBTSProductQuantification(o: BTSProductQuantification): Unit = {
      writer.writeZ(Constants.BTSProductQuantification)
      writer.writeISZ(o.variables, writeBTSVariable _)
      writer.writeOption(o.range, writeBTSRange _)
      writer.writeOption(o.condition, writeBTSExp _)
      writeBTSExp(o.expression)
    }

    def writeBTSCountingQuantification(o: BTSCountingQuantification): Unit = {
      writer.writeZ(Constants.BTSCountingQuantification)
      writer.writeISZ(o.variables, writeBTSVariable _)
      writer.writeOption(o.range, writeBTSRange _)
      writer.writeOption(o.condition, writeBTSExp _)
      writeBTSExp(o.predicate)
    }

    def writeBTSRange(o: BTSRange): Unit = {
      writer.writeZ(Constants.BTSRange)
      writeBTSExp(o.lb)
      writeBTSRangeSymbolType(o.op)
      writeBTSExp(o.ub)
    }

    def writeBTSRangeSymbolType(o: BTSRangeSymbol.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBTSTypeLibrary(o: BTSTypeLibrary): Unit = {
      writer.writeZ(Constants.BTSTypeLibrary)
      writer.writeISZ(o.typedeclarations, writeBTSTypeDeclatation _)
    }

    def writeBTSTypeDeclatation(o: BTSTypeDeclatation): Unit = {
      writer.writeZ(Constants.BTSTypeDeclatation)
      writeName(o.name)
      writeBTSType(o.ty)
    }

    def writeBTSType(o: BTSType): Unit = {
      o match {
        case o: BTSBooleanType => writeBTSBooleanType(o)
        case o: BTSStringType => writeBTSStringType(o)
        case o: BTSNullType => writeBTSNullType(o)
        case o: BTSClassifier => writeBTSClassifier(o)
        case o: BTSTypeName => writeBTSTypeName(o)
        case o: BTSEnumerationType => writeBTSEnumerationType(o)
        case o: BTSQuantityType => writeBTSQuantityType(o)
        case o: BTSArrayType => writeBTSArrayType(o)
        case o: BTSRecordType => writeBTSRecordType(o)
      }
    }

    def writeBTSBooleanType(o: BTSBooleanType): Unit = {
      writer.writeZ(Constants.BTSBooleanType)
    }

    def writeBTSStringType(o: BTSStringType): Unit = {
      writer.writeZ(Constants.BTSStringType)
    }

    def writeBTSNullType(o: BTSNullType): Unit = {
      writer.writeZ(Constants.BTSNullType)
    }

    def writeBTSClassifier(o: BTSClassifier): Unit = {
      writer.writeZ(Constants.BTSClassifier)
      writeBTSComponent(o.classifier)
    }

    def writeBTSTypeName(o: BTSTypeName): Unit = {
      writer.writeZ(Constants.BTSTypeName)
      writeName(o.typename)
    }

    def writeBTSEnumerationType(o: BTSEnumerationType): Unit = {
      writer.writeZ(Constants.BTSEnumerationType)
      writer.writeISZ(o.literals, writeName _)
    }

    def writeBTSQuantityType(o: BTSQuantityType): Unit = {
      writer.writeZ(Constants.BTSQuantityType)
      writer.writeOption(o.unit, writeName _)
      writer.writeB(o.scalar)
      writer.writeB(o.whole)
      writer.writeOption(o.lb, writer.writeF64 _)
      writer.writeOption(o.ub, writer.writeF64 _)
      writer.writeOption(o.step, writer.writeF64 _)
      writer.writeOption(o.representation, writeBTSPropertyConstant _)
    }

    def writeBTSArrayType(o: BTSArrayType): Unit = {
      writer.writeZ(Constants.BTSArrayType)
      writer.writeISZ(o.ranges, writeBTSArrayRange _)
      writeBTSType(o.typ)
    }

    def writeBTSArrayRange(o: BTSArrayRange): Unit = {
      writer.writeZ(Constants.BTSArrayRange)
      writeBTSExp(o.lb)
      writer.writeOption(o.ub, writeBTSExp _)
    }

    def writeBTSRecordType(o: BTSRecordType): Unit = {
      writer.writeZ(Constants.BTSRecordType)
      writeBTSRecordKindType(o.kind)
      writer.writeISZ(o.fields, writeBTSRecordField _)
    }

    def writeBTSRecordKindType(o: BTSRecordKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBTSRecordField(o: BTSRecordField): Unit = {
      writer.writeZ(Constants.BTSRecordField)
      writeName(o.label)
      writeBTSType(o.typ)
    }

    def writeBTSUnitLibrary(o: BTSUnitLibrary): Unit = {
      writer.writeZ(Constants.BTSUnitLibrary)
      writer.writeISZ(o.unitDeclarations, writeBTSUnitDeclaration _)
    }

    def writeBTSUnitDeclaration(o: BTSUnitDeclaration): Unit = {
      o match {
        case o: BTSRootDeclaration => writeBTSRootDeclaration(o)
        case o: BTSUnitExtension => writeBTSUnitExtension(o)
      }
    }

    def writeBTSRootDeclaration(o: BTSRootDeclaration): Unit = {
      writer.writeZ(Constants.BTSRootDeclaration)
      writer.writeB(o.base)
      writer.writeOption(o.formula, writeBTSUnitFormula _)
      writer.writeISZ(o.kindWords, writeName _)
      writeBTSUnitName(o.unitName)
      writer.writeISZ(o.factors, writeBTSUnitFactor _)
    }

    def writeBTSUnitExtension(o: BTSUnitExtension): Unit = {
      writer.writeZ(Constants.BTSUnitExtension)
      writeBTSUnitName(o.root)
      writer.writeISZ(o.factors, writeBTSUnitFactor _)
    }

    def writeBTSUnitName(o: BTSUnitName): Unit = {
      writer.writeZ(Constants.BTSUnitName)
      writer.writeISZ(o.longname, writeName _)
      writeName(o.name)
    }

    def writeBTSUnitFormula(o: BTSUnitFormula): Unit = {
      writer.writeZ(Constants.BTSUnitFormula)
      writer.writeISZ(o.top, writeBTSUnitName _)
      writer.writeISZ(o.bottom, writeBTSUnitName _)
    }

    def writeBTSMulDivType(o: BTSMulDiv.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBTSUnitFactor(o: BTSUnitFactor): Unit = {
      writer.writeZ(Constants.BTSUnitFactor)
      writeBTSUnitName(o.unit)
      writeBTSMulDivType(o.op)
      writer.writeR(o.factor)
    }

    def writeBTSQuantity(o: BTSQuantity): Unit = {
      writer.writeZ(Constants.BTSQuantity)
      writer.writeR(o.number)
      writer.writeOption(o.unit, writeName _)
      writer.writeB(o.scalar)
    }

    def writeBTSExceptionLibrary(o: BTSExceptionLibrary): Unit = {
      writer.writeZ(Constants.BTSExceptionLibrary)
      writer.writeISZ(o.exc, writeBTSExceptionDeclaration _)
    }

    def writeBTSExceptionDeclaration(o: BTSExceptionDeclaration): Unit = {
      writer.writeZ(Constants.BTSExceptionDeclaration)
      writeName(o.name)
      writer.writeString(o.description)
      writer.writeOption(o.code, writer.writeZ _)
    }

    def writeTODO(o: TODO): Unit = {
      writer.writeZ(Constants.TODO)
    }

    def writeEmv2Annex(o: Emv2Annex): Unit = {
      o match {
        case o: ErrorTypeDef => writeErrorTypeDef(o)
        case o: ErrorAliasDef => writeErrorAliasDef(o)
        case o: ErrorTypeSetDef => writeErrorTypeSetDef(o)
        case o: BehaveStateMachine => writeBehaveStateMachine(o)
        case o: ErrorEvent => writeErrorEvent(o)
        case o: ErrorState => writeErrorState(o)
        case o: ErrorTransition => writeErrorTransition(o)
        case o: ConditionTrigger => writeConditionTrigger(o)
        case o: AndCondition => writeAndCondition(o)
        case o: OrCondition => writeOrCondition(o)
        case o: AllCondition => writeAllCondition(o)
        case o: OrMoreCondition => writeOrMoreCondition(o)
        case o: OrLessCondition => writeOrLessCondition(o)
        case o: Emv2Clause => writeEmv2Clause(o)
        case o: Emv2Propagation => writeEmv2Propagation(o)
        case o: Emv2Flow => writeEmv2Flow(o)
        case o: Emv2BehaviorSection => writeEmv2BehaviorSection(o)
        case o: ErrorPropagation => writeErrorPropagation(o)
      }
    }

    def writeEmv2Lib(o: Emv2Lib): Unit = {
      o match {
        case o: Emv2Library => writeEmv2Library(o)
      }
    }

    def writePropagationDirectionType(o: PropagationDirection.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEmv2ElementRef(o: Emv2ElementRef): Unit = {
      writer.writeZ(Constants.Emv2ElementRef)
      writeEmv2ElementKindType(o.kind)
      writeName(o.name)
      writer.writeISZ(o.errorTypes, writeName _)
    }

    def writeEmv2ElementKindType(o: Emv2ElementKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEmv2Library(o: Emv2Library): Unit = {
      writer.writeZ(Constants.Emv2Library)
      writeName(o.name)
      writer.writeISZ(o.useTypes, writer.writeString _)
      writer.writeISZ(o.errorTypeDef, writeErrorTypeDef _)
      writer.writeISZ(o.errorTypeSetDef, writeErrorTypeSetDef _)
      writer.writeISZ(o.alias, writeErrorAliasDef _)
      writer.writeISZ(o.behaveStateMachine, writeBehaveStateMachine _)
    }

    def writeErrorKindType(o: ErrorKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeErrorTypeDef(o: ErrorTypeDef): Unit = {
      writer.writeZ(Constants.ErrorTypeDef)
      writeName(o.id)
      writer.writeOption(o.extendType, writeName _)
      writer.writeString(o.uriFrag)
    }

    def writeErrorAliasDef(o: ErrorAliasDef): Unit = {
      writer.writeZ(Constants.ErrorAliasDef)
      writeName(o.errorType)
      writeName(o.aliseType)
    }

    def writeErrorTypeSetDef(o: ErrorTypeSetDef): Unit = {
      writer.writeZ(Constants.ErrorTypeSetDef)
      writeName(o.id)
      writer.writeISZ(o.errorTypes, writeName _)
    }

    def writeBehaveStateMachine(o: BehaveStateMachine): Unit = {
      writer.writeZ(Constants.BehaveStateMachine)
      writeName(o.id)
      writer.writeISZ(o.events, writeErrorEvent _)
      writer.writeISZ(o.states, writeErrorState _)
      writer.writeISZ(o.transitions, writeErrorTransition _)
      writer.writeISZ(o.properties, writeProperty _)
    }

    def writeErrorEvent(o: ErrorEvent): Unit = {
      writer.writeZ(Constants.ErrorEvent)
      writeName(o.id)
    }

    def writeErrorState(o: ErrorState): Unit = {
      writer.writeZ(Constants.ErrorState)
      writeName(o.id)
      writer.writeB(o.isInitial)
    }

    def writeErrorTransition(o: ErrorTransition): Unit = {
      writer.writeZ(Constants.ErrorTransition)
      writer.writeOption(o.id, writeName _)
      writeName(o.sourceState)
      writeErrorCondition(o.condition)
      writeName(o.targetState)
    }

    def writeErrorCondition(o: ErrorCondition): Unit = {
      o match {
        case o: ConditionTrigger => writeConditionTrigger(o)
        case o: AndCondition => writeAndCondition(o)
        case o: OrCondition => writeOrCondition(o)
        case o: AllCondition => writeAllCondition(o)
        case o: OrMoreCondition => writeOrMoreCondition(o)
        case o: OrLessCondition => writeOrLessCondition(o)
      }
    }

    def writeConditionTrigger(o: ConditionTrigger): Unit = {
      writer.writeZ(Constants.ConditionTrigger)
      writer.writeISZ(o.events, writeName _)
      writer.writeISZ(o.propagationPoints, writeEmv2Propagation _)
    }

    def writeAndCondition(o: AndCondition): Unit = {
      writer.writeZ(Constants.AndCondition)
      writer.writeISZ(o.op, writeErrorCondition _)
    }

    def writeOrCondition(o: OrCondition): Unit = {
      writer.writeZ(Constants.OrCondition)
      writer.writeISZ(o.op, writeErrorCondition _)
    }

    def writeAllCondition(o: AllCondition): Unit = {
      writer.writeZ(Constants.AllCondition)
      writer.writeISZ(o.op, writeErrorCondition _)
    }

    def writeOrMoreCondition(o: OrMoreCondition): Unit = {
      writer.writeZ(Constants.OrMoreCondition)
      writer.writeZ(o.number)
      writer.writeISZ(o.conditions, writeErrorCondition _)
    }

    def writeOrLessCondition(o: OrLessCondition): Unit = {
      writer.writeZ(Constants.OrLessCondition)
      writer.writeZ(o.number)
      writer.writeISZ(o.conditions, writeErrorCondition _)
    }

    def writeEmv2Clause(o: Emv2Clause): Unit = {
      writer.writeZ(Constants.Emv2Clause)
      writer.writeISZ(o.libraries, writeName _)
      writer.writeISZ(o.propagations, writeEmv2Propagation _)
      writer.writeISZ(o.flows, writeEmv2Flow _)
      writer.writeOption(o.componentBehavior, writeEmv2BehaviorSection _)
      writer.writeISZ(o.properties, writeProperty _)
    }

    def writeEmv2Propagation(o: Emv2Propagation): Unit = {
      writer.writeZ(Constants.Emv2Propagation)
      writePropagationDirectionType(o.direction)
      writeName(o.propagationPoint)
      writer.writeISZ(o.errorTokens, writeName _)
    }

    def writeEmv2Flow(o: Emv2Flow): Unit = {
      writer.writeZ(Constants.Emv2Flow)
      writeName(o.identifier)
      writeFlowKindType(o.kind)
      writer.writeOption(o.sourcePropagation, writeEmv2Propagation _)
      writer.writeOption(o.sinkPropagation, writeEmv2Propagation _)
      writer.writeString(o.uriFrag)
    }

    def writeEmv2BehaviorSection(o: Emv2BehaviorSection): Unit = {
      writer.writeZ(Constants.Emv2BehaviorSection)
      writer.writeISZ(o.events, writeErrorEvent _)
      writer.writeISZ(o.transitions, writeErrorTransition _)
      writer.writeISZ(o.propagations, writeErrorPropagation _)
    }

    def writeErrorPropagation(o: ErrorPropagation): Unit = {
      writer.writeZ(Constants.ErrorPropagation)
      writer.writeOption(o.id, writeName _)
      writer.writeISZ(o.source, writeName _)
      writer.writeOption(o.condition, writeErrorCondition _)
      writer.writeISZ(o.target, writeEmv2Propagation _)
    }

    def writeSmfAnnex(o: SmfAnnex): Unit = {
      o match {
        case o: SmfClause => writeSmfClause(o)
        case o: SmfClassification => writeSmfClassification(o)
        case o: SmfDeclass => writeSmfDeclass(o)
        case o: SmfType => writeSmfType(o)
      }
    }

    def writeSmfLib(o: SmfLib): Unit = {
      o match {
        case o: SmfLibrary => writeSmfLibrary(o)
      }
    }

    def writeSmfClause(o: SmfClause): Unit = {
      writer.writeZ(Constants.SmfClause)
      writer.writeISZ(o.classification, writeSmfClassification _)
      writer.writeISZ(o.declass, writeSmfDeclass _)
    }

    def writeSmfClassification(o: SmfClassification): Unit = {
      writer.writeZ(Constants.SmfClassification)
      writeName(o.portName)
      writeName(o.typeName)
    }

    def writeSmfDeclass(o: SmfDeclass): Unit = {
      writer.writeZ(Constants.SmfDeclass)
      writeName(o.flowName)
      writer.writeOption(o.srcType, writeName _)
      writeName(o.snkType)
    }

    def writeSmfLibrary(o: SmfLibrary): Unit = {
      writer.writeZ(Constants.SmfLibrary)
      writer.writeISZ(o.types, writeSmfType _)
    }

    def writeSmfType(o: SmfType): Unit = {
      writer.writeZ(Constants.SmfType)
      writeName(o.typeName)
      writer.writeISZ(o.parentType, writeName _)
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

    def readAadlInstInfo(): AadlInstInfo = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Component => val r = readComponentT(T); return r
        case Constants.ErrorTypeDef => val r = readErrorTypeDefT(T); return r
        case Constants.FeatureEnd => val r = readFeatureEndT(T); return r
        case Constants.FeatureGroup => val r = readFeatureGroupT(T); return r
        case Constants.FeatureAccess => val r = readFeatureAccessT(T); return r
        case Constants.Connection => val r = readConnectionT(T); return r
        case Constants.Emv2Flow => val r = readEmv2FlowT(T); return r
        case Constants.Flow => val r = readFlowT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of AadlInstInfo.")
          val r = readFlowT(T)
          return r
      }
    }

    def readAadl(): Aadl = {
      val r = readAadlT(F)
      return r
    }

    def readAadlT(typeParsed: B): Aadl = {
      if (!typeParsed) {
        reader.expectZ(Constants.Aadl)
      }
      val components = reader.readISZ(readComponent _)
      val annexLib = reader.readISZ(readAnnexLib _)
      val dataComponents = reader.readISZ(readComponent _)
      return Aadl(components, annexLib, dataComponents)
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
      val pos = reader.readOption(reader.readPosition _)
      return Name(name, pos)
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
      val category = readComponentCategoryType()
      val classifier = reader.readOption(readClassifier _)
      val features = reader.readISZ(readFeature _)
      val subComponents = reader.readISZ(readComponent _)
      val connections = reader.readISZ(readConnection _)
      val connectionInstances = reader.readISZ(readConnectionInstance _)
      val properties = reader.readISZ(readProperty _)
      val flows = reader.readISZ(readFlow _)
      val modes = reader.readISZ(readMode _)
      val annexes = reader.readISZ(readAnnex _)
      val uriFrag = reader.readString()
      return Component(identifier, category, classifier, features, subComponents, connections, connectionInstances, properties, flows, modes, annexes, uriFrag)
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

    def readComponentCategoryType(): ComponentCategory.Type = {
      val r = reader.readZ()
      return ComponentCategory.byOrdinal(r).get
    }

    def readFeature(): Feature = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.FeatureEnd => val r = readFeatureEndT(T); return r
        case Constants.FeatureGroup => val r = readFeatureGroupT(T); return r
        case Constants.FeatureAccess => val r = readFeatureAccessT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Feature.")
          val r = readFeatureAccessT(T)
          return r
      }
    }

    def readFeatureEnd(): FeatureEnd = {
      val r = readFeatureEndT(F)
      return r
    }

    def readFeatureEndT(typeParsed: B): FeatureEnd = {
      if (!typeParsed) {
        reader.expectZ(Constants.FeatureEnd)
      }
      val identifier = readName()
      val direction = readDirectionType()
      val category = readFeatureCategoryType()
      val classifier = reader.readOption(readClassifier _)
      val properties = reader.readISZ(readProperty _)
      val uriFrag = reader.readString()
      return FeatureEnd(identifier, direction, category, classifier, properties, uriFrag)
    }

    def readFeatureGroup(): FeatureGroup = {
      val r = readFeatureGroupT(F)
      return r
    }

    def readFeatureGroupT(typeParsed: B): FeatureGroup = {
      if (!typeParsed) {
        reader.expectZ(Constants.FeatureGroup)
      }
      val identifier = readName()
      val features = reader.readISZ(readFeature _)
      val isInverse = reader.readB()
      val category = readFeatureCategoryType()
      val properties = reader.readISZ(readProperty _)
      val uriFrag = reader.readString()
      return FeatureGroup(identifier, features, isInverse, category, properties, uriFrag)
    }

    def readFeatureAccess(): FeatureAccess = {
      val r = readFeatureAccessT(F)
      return r
    }

    def readFeatureAccessT(typeParsed: B): FeatureAccess = {
      if (!typeParsed) {
        reader.expectZ(Constants.FeatureAccess)
      }
      val identifier = readName()
      val category = readFeatureCategoryType()
      val classifier = reader.readOption(readClassifier _)
      val accessType = readAccessTypeType()
      val accessCategory = readAccessCategoryType()
      val properties = reader.readISZ(readProperty _)
      val uriFrag = reader.readString()
      return FeatureAccess(identifier, category, classifier, accessType, accessCategory, properties, uriFrag)
    }

    def readAccessTypeType(): AccessType.Type = {
      val r = reader.readZ()
      return AccessType.byOrdinal(r).get
    }

    def readAccessCategoryType(): AccessCategory.Type = {
      val r = reader.readZ()
      return AccessCategory.byOrdinal(r).get
    }

    def readDirectionType(): Direction.Type = {
      val r = reader.readZ()
      return Direction.byOrdinal(r).get
    }

    def readFeatureCategoryType(): FeatureCategory.Type = {
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
      val src = reader.readISZ(readEndPoint _)
      val dst = reader.readISZ(readEndPoint _)
      val kind = readConnectionKindType()
      val isBiDirectional = reader.readB()
      val connectionInstances = reader.readISZ(readName _)
      val properties = reader.readISZ(readProperty _)
      val uriFrag = reader.readString()
      return Connection(name, src, dst, kind, isBiDirectional, connectionInstances, properties, uriFrag)
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
      val kind = readConnectionKindType()
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

    def readConnectionKindType(): ConnectionKind.Type = {
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
      val feature = reader.readOption(readName _)
      val direction = reader.readOption(readDirectionType _)
      return EndPoint(component, feature, direction)
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
      val appliesTo = reader.readISZ(readElementRef _)
      return Property(name, propertyValues, appliesTo)
    }

    def readElementRef(): ElementRef = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Emv2ElementRef => val r = readEmv2ElementRefT(T); return r
        case Constants.AadlElementRef => val r = readAadlElementRefT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of ElementRef.")
          val r = readAadlElementRefT(T)
          return r
      }
    }

    def readElementKindType(): ElementKind.Type = {
      val r = reader.readZ()
      return ElementKind.byOrdinal(r).get
    }

    def readAadlElementRef(): AadlElementRef = {
      val r = readAadlElementRefT(F)
      return r
    }

    def readAadlElementRefT(typeParsed: B): AadlElementRef = {
      if (!typeParsed) {
        reader.expectZ(Constants.AadlElementRef)
      }
      val elementKind = readElementKindType()
      val name = readName()
      return AadlElementRef(elementKind, name)
    }

    def readPropertyValue(): PropertyValue = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.ClassifierProp => val r = readClassifierPropT(T); return r
        case Constants.RangeProp => val r = readRangePropT(T); return r
        case Constants.RecordProp => val r = readRecordPropT(T); return r
        case Constants.ReferenceProp => val r = readReferencePropT(T); return r
        case Constants.UnitProp => val r = readUnitPropT(T); return r
        case Constants.ValueProp => val r = readValuePropT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of PropertyValue.")
          val r = readValuePropT(T)
          return r
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
      val low = readUnitProp()
      val high = readUnitProp()
      return RangeProp(low, high)
    }

    def readRecordProp(): RecordProp = {
      val r = readRecordPropT(F)
      return r
    }

    def readRecordPropT(typeParsed: B): RecordProp = {
      if (!typeParsed) {
        reader.expectZ(Constants.RecordProp)
      }
      val properties = reader.readISZ(readProperty _)
      return RecordProp(properties)
    }

    def readReferenceProp(): ReferenceProp = {
      val r = readReferencePropT(F)
      return r
    }

    def readReferencePropT(typeParsed: B): ReferenceProp = {
      if (!typeParsed) {
        reader.expectZ(Constants.ReferenceProp)
      }
      val value = readName()
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
      val unit = reader.readOption(reader.readString _)
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

    def readFlowKindType(): FlowKind.Type = {
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
      val kind = readFlowKindType()
      val source = reader.readOption(readName _)
      val sink = reader.readOption(readName _)
      val uriFrag = reader.readString()
      return Flow(name, kind, source, sink, uriFrag)
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
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.SmfClause => val r = readSmfClauseT(T); return r
        case Constants.SmfClassification => val r = readSmfClassificationT(T); return r
        case Constants.SmfDeclass => val r = readSmfDeclassT(T); return r
        case Constants.SmfType => val r = readSmfTypeT(T); return r
        case Constants.ErrorTypeDef => val r = readErrorTypeDefT(T); return r
        case Constants.ErrorAliasDef => val r = readErrorAliasDefT(T); return r
        case Constants.ErrorTypeSetDef => val r = readErrorTypeSetDefT(T); return r
        case Constants.BehaveStateMachine => val r = readBehaveStateMachineT(T); return r
        case Constants.ErrorEvent => val r = readErrorEventT(T); return r
        case Constants.ErrorState => val r = readErrorStateT(T); return r
        case Constants.ErrorTransition => val r = readErrorTransitionT(T); return r
        case Constants.ConditionTrigger => val r = readConditionTriggerT(T); return r
        case Constants.AndCondition => val r = readAndConditionT(T); return r
        case Constants.OrCondition => val r = readOrConditionT(T); return r
        case Constants.AllCondition => val r = readAllConditionT(T); return r
        case Constants.OrMoreCondition => val r = readOrMoreConditionT(T); return r
        case Constants.OrLessCondition => val r = readOrLessConditionT(T); return r
        case Constants.Emv2Clause => val r = readEmv2ClauseT(T); return r
        case Constants.Emv2Propagation => val r = readEmv2PropagationT(T); return r
        case Constants.Emv2Flow => val r = readEmv2FlowT(T); return r
        case Constants.Emv2BehaviorSection => val r = readEmv2BehaviorSectionT(T); return r
        case Constants.ErrorPropagation => val r = readErrorPropagationT(T); return r
        case Constants.OtherAnnex => val r = readOtherAnnexT(T); return r
        case Constants.BTSBLESSAnnexClause => val r = readBTSBLESSAnnexClauseT(T); return r
        case Constants.BTSActionAnnexSubclause => val r = readBTSActionAnnexSubclauseT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of AnnexClause.")
          val r = readBTSActionAnnexSubclauseT(T)
          return r
      }
    }

    def readAnnexLib(): AnnexLib = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.SmfLibrary => val r = readSmfLibraryT(T); return r
        case Constants.Emv2Library => val r = readEmv2LibraryT(T); return r
        case Constants.OtherLib => val r = readOtherLibT(T); return r
        case Constants.BTSTypeLibrary => val r = readBTSTypeLibraryT(T); return r
        case Constants.BTSUnitLibrary => val r = readBTSUnitLibraryT(T); return r
        case Constants.BTSExceptionLibrary => val r = readBTSExceptionLibraryT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of AnnexLib.")
          val r = readBTSExceptionLibraryT(T)
          return r
      }
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

    def readOtherLib(): OtherLib = {
      val r = readOtherLibT(F)
      return r
    }

    def readOtherLibT(typeParsed: B): OtherLib = {
      if (!typeParsed) {
        reader.expectZ(Constants.OtherLib)
      }
      val lib = reader.readString()
      return OtherLib(lib)
    }

    def readBLESSAnnex(): BLESSAnnex = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BTSBLESSAnnexClause => val r = readBTSBLESSAnnexClauseT(T); return r
        case Constants.BTSActionAnnexSubclause => val r = readBTSActionAnnexSubclauseT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BLESSAnnex.")
          val r = readBTSActionAnnexSubclauseT(T)
          return r
      }
    }

    def readBTSBLESSAnnexClause(): BTSBLESSAnnexClause = {
      val r = readBTSBLESSAnnexClauseT(F)
      return r
    }

    def readBTSBLESSAnnexClauseT(typeParsed: B): BTSBLESSAnnexClause = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSBLESSAnnexClause)
      }
      val doNotProve = reader.readB()
      val assertions = reader.readISZ(readBTSAssertion _)
      val invariant = reader.readOption(readBTSAssertion _)
      val variables = reader.readISZ(readBTSVariableDeclaration _)
      val states = reader.readISZ(readBTSStateDeclaration _)
      val transitions = reader.readISZ(readBTSTransition _)
      return BTSBLESSAnnexClause(doNotProve, assertions, invariant, variables, states, transitions)
    }

    def readBTSVariableDeclaration(): BTSVariableDeclaration = {
      val r = readBTSVariableDeclarationT(F)
      return r
    }

    def readBTSVariableDeclarationT(typeParsed: B): BTSVariableDeclaration = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSVariableDeclaration)
      }
      val name = readName()
      val category = reader.readOption(readBTSVariableCategoryType _)
      val varType = readBTSType()
      val assignExpression = reader.readOption(readBTSExp _)
      val arraySize = reader.readOption(readBTSExp _)
      val variableAssertion = reader.readOption(readBTSAssertion _)
      return BTSVariableDeclaration(name, category, varType, assignExpression, arraySize, variableAssertion)
    }

    def readBTSVariableCategoryType(): BTSVariableCategory.Type = {
      val r = reader.readZ()
      return BTSVariableCategory.byOrdinal(r).get
    }

    def readBTSStateDeclaration(): BTSStateDeclaration = {
      val r = readBTSStateDeclarationT(F)
      return r
    }

    def readBTSStateDeclarationT(typeParsed: B): BTSStateDeclaration = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSStateDeclaration)
      }
      val id = readName()
      val categories = reader.readISZ(readBTSStateCategoryType _)
      val assertion = reader.readOption(readBTSAssertion _)
      return BTSStateDeclaration(id, categories, assertion)
    }

    def readBTSStateCategoryType(): BTSStateCategory.Type = {
      val r = reader.readZ()
      return BTSStateCategory.byOrdinal(r).get
    }

    def readBTSTransition(): BTSTransition = {
      val r = readBTSTransitionT(F)
      return r
    }

    def readBTSTransitionT(typeParsed: B): BTSTransition = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSTransition)
      }
      val label = readBTSTransitionLabel()
      val sourceStates = reader.readISZ(readName _)
      val destState = readName()
      val transitionCondition = reader.readOption(readBTSTransitionCondition _)
      val actions = reader.readOption(readBTSBehaviorActions _)
      val assertion = reader.readOption(readBTSAssertion _)
      return BTSTransition(label, sourceStates, destState, transitionCondition, actions, assertion)
    }

    def readBTSTransitionLabel(): BTSTransitionLabel = {
      val r = readBTSTransitionLabelT(F)
      return r
    }

    def readBTSTransitionLabelT(typeParsed: B): BTSTransitionLabel = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSTransitionLabel)
      }
      val id = readName()
      val priority = reader.readOption(reader.readZ _)
      return BTSTransitionLabel(id, priority)
    }

    def readBTSTransitionCondition(): BTSTransitionCondition = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BTSDispatchCondition => val r = readBTSDispatchConditionT(T); return r
        case Constants.BTSExecuteConditionExp => val r = readBTSExecuteConditionExpT(T); return r
        case Constants.BTSExecuteConditionTimeout => val r = readBTSExecuteConditionTimeoutT(T); return r
        case Constants.BTSExecuteConditionOtherwise => val r = readBTSExecuteConditionOtherwiseT(T); return r
        case Constants.BTSModeCondition => val r = readBTSModeConditionT(T); return r
        case Constants.BTSInternalCondition => val r = readBTSInternalConditionT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BTSTransitionCondition.")
          val r = readBTSInternalConditionT(T)
          return r
      }
    }

    def readBTSDispatchCondition(): BTSDispatchCondition = {
      val r = readBTSDispatchConditionT(F)
      return r
    }

    def readBTSDispatchConditionT(typeParsed: B): BTSDispatchCondition = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSDispatchCondition)
      }
      val conjunctions = reader.readISZ(readBTSDispatchConjunction _)
      val subprogramaccessdispatch = readName()
      val frozenPorts = reader.readISZ(readName _)
      return BTSDispatchCondition(conjunctions, subprogramaccessdispatch, frozenPorts)
    }

    def readBTSDispatchConjunction(): BTSDispatchConjunction = {
      val r = readBTSDispatchConjunctionT(F)
      return r
    }

    def readBTSDispatchConjunctionT(typeParsed: B): BTSDispatchConjunction = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSDispatchConjunction)
      }
      val triggers = reader.readISZ(readBTSDispatchTrigger _)
      return BTSDispatchConjunction(triggers)
    }

    def readBTSDispatchTrigger(): BTSDispatchTrigger = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BTSDispatchTriggerStop => val r = readBTSDispatchTriggerStopT(T); return r
        case Constants.BTSDispatchTriggerPort => val r = readBTSDispatchTriggerPortT(T); return r
        case Constants.BTSDispatchTriggerTimeout => val r = readBTSDispatchTriggerTimeoutT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BTSDispatchTrigger.")
          val r = readBTSDispatchTriggerTimeoutT(T)
          return r
      }
    }

    def readBTSDispatchTriggerStop(): BTSDispatchTriggerStop = {
      val r = readBTSDispatchTriggerStopT(F)
      return r
    }

    def readBTSDispatchTriggerStopT(typeParsed: B): BTSDispatchTriggerStop = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSDispatchTriggerStop)
      }
      return BTSDispatchTriggerStop()
    }

    def readBTSDispatchTriggerPort(): BTSDispatchTriggerPort = {
      val r = readBTSDispatchTriggerPortT(F)
      return r
    }

    def readBTSDispatchTriggerPortT(typeParsed: B): BTSDispatchTriggerPort = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSDispatchTriggerPort)
      }
      val port = readName()
      val portarrayindex = reader.readOption(reader.readZ _)
      return BTSDispatchTriggerPort(port, portarrayindex)
    }

    def readBTSDispatchTriggerTimeout(): BTSDispatchTriggerTimeout = {
      val r = readBTSDispatchTriggerTimeoutT(F)
      return r
    }

    def readBTSDispatchTriggerTimeoutT(typeParsed: B): BTSDispatchTriggerTimeout = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSDispatchTriggerTimeout)
      }
      val ports = reader.readISZ(readName _)
      val time = reader.readOption(readBTSExp _)
      return BTSDispatchTriggerTimeout(ports, time)
    }

    def readBTSExecuteCondition(): BTSExecuteCondition = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BTSExecuteConditionExp => val r = readBTSExecuteConditionExpT(T); return r
        case Constants.BTSExecuteConditionTimeout => val r = readBTSExecuteConditionTimeoutT(T); return r
        case Constants.BTSExecuteConditionOtherwise => val r = readBTSExecuteConditionOtherwiseT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BTSExecuteCondition.")
          val r = readBTSExecuteConditionOtherwiseT(T)
          return r
      }
    }

    def readBTSExecuteConditionExp(): BTSExecuteConditionExp = {
      val r = readBTSExecuteConditionExpT(F)
      return r
    }

    def readBTSExecuteConditionExpT(typeParsed: B): BTSExecuteConditionExp = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSExecuteConditionExp)
      }
      val exp = readBTSExp()
      return BTSExecuteConditionExp(exp)
    }

    def readBTSExecuteConditionTimeout(): BTSExecuteConditionTimeout = {
      val r = readBTSExecuteConditionTimeoutT(F)
      return r
    }

    def readBTSExecuteConditionTimeoutT(typeParsed: B): BTSExecuteConditionTimeout = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSExecuteConditionTimeout)
      }
      return BTSExecuteConditionTimeout()
    }

    def readBTSExecuteConditionOtherwise(): BTSExecuteConditionOtherwise = {
      val r = readBTSExecuteConditionOtherwiseT(F)
      return r
    }

    def readBTSExecuteConditionOtherwiseT(typeParsed: B): BTSExecuteConditionOtherwise = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSExecuteConditionOtherwise)
      }
      return BTSExecuteConditionOtherwise()
    }

    def readBTSModeCondition(): BTSModeCondition = {
      val r = readBTSModeConditionT(F)
      return r
    }

    def readBTSModeConditionT(typeParsed: B): BTSModeCondition = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSModeCondition)
      }
      val tle = readBTSTriggerLogicalExpression()
      return BTSModeCondition(tle)
    }

    def readBTSTriggerLogicalExpression(): BTSTriggerLogicalExpression = {
      val r = readBTSTriggerLogicalExpressionT(F)
      return r
    }

    def readBTSTriggerLogicalExpressionT(typeParsed: B): BTSTriggerLogicalExpression = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSTriggerLogicalExpression)
      }
      val op = readBTSModeOperatorType()
      val triggers = reader.readISZ(readBTSEventTrigger _)
      return BTSTriggerLogicalExpression(op, triggers)
    }

    def readBTSEventTrigger(): BTSEventTrigger = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BTSTriggerLogicalExpression => val r = readBTSTriggerLogicalExpressionT(T); return r
        case Constants.BTSSubcomponentPort => val r = readBTSSubcomponentPortT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BTSEventTrigger.")
          val r = readBTSSubcomponentPortT(T)
          return r
      }
    }

    def readBTSSubcomponentPort(): BTSSubcomponentPort = {
      val r = readBTSSubcomponentPortT(F)
      return r
    }

    def readBTSSubcomponentPortT(typeParsed: B): BTSSubcomponentPort = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSSubcomponentPort)
      }
      val sub = reader.readISZ(readName _)
      val port = readName()
      val index = reader.readOption(reader.readZ _)
      return BTSSubcomponentPort(sub, port, index)
    }

    def readBTSModeOperatorType(): BTSModeOperator.Type = {
      val r = reader.readZ()
      return BTSModeOperator.byOrdinal(r).get
    }

    def readBTSInternalCondition(): BTSInternalCondition = {
      val r = readBTSInternalConditionT(F)
      return r
    }

    def readBTSInternalConditionT(typeParsed: B): BTSInternalCondition = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSInternalCondition)
      }
      val internalports = reader.readISZ(readName _)
      return BTSInternalCondition(internalports)
    }

    def readBTSAssertion(): BTSAssertion = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BTSNamedAssertion => val r = readBTSNamedAssertionT(T); return r
        case Constants.BTSNamedFunction => val r = readBTSNamedFunctionT(T); return r
        case Constants.BTSNamedEnumeration => val r = readBTSNamedEnumerationT(T); return r
        case Constants.BTSNamelessAssertion => val r = readBTSNamelessAssertionT(T); return r
        case Constants.BTSNamelessFunction => val r = readBTSNamelessFunctionT(T); return r
        case Constants.BTSNamelessEnumeration => val r = readBTSNamelessEnumerationT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BTSAssertion.")
          val r = readBTSNamelessEnumerationT(T)
          return r
      }
    }

    def readBTSNamedAssertion(): BTSNamedAssertion = {
      val r = readBTSNamedAssertionT(F)
      return r
    }

    def readBTSNamedAssertionT(typeParsed: B): BTSNamedAssertion = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSNamedAssertion)
      }
      val label = readName()
      val formals = reader.readISZ(readBTSVariable _)
      val predicate = readBTSExp()
      return BTSNamedAssertion(label, formals, predicate)
    }

    def readBTSNamedFunction(): BTSNamedFunction = {
      val r = readBTSNamedFunctionT(F)
      return r
    }

    def readBTSNamedFunctionT(typeParsed: B): BTSNamedFunction = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSNamedFunction)
      }
      val label = readName()
      val formals = reader.readISZ(readBTSVariable _)
      val returns = readBTSType()
      val functionvalue = readBTSExp()
      return BTSNamedFunction(label, formals, returns, functionvalue)
    }

    def readBTSNamedEnumeration(): BTSNamedEnumeration = {
      val r = readBTSNamedEnumerationT(F)
      return r
    }

    def readBTSNamedEnumerationT(typeParsed: B): BTSNamedEnumeration = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSNamedEnumeration)
      }
      val label = readName()
      val assertionvariable = readName()
      val enumerationtype = readBTSType()
      val enumeration = readBTSAssertionEnumeration()
      return BTSNamedEnumeration(label, assertionvariable, enumerationtype, enumeration)
    }

    def readBTSNamelessAssertion(): BTSNamelessAssertion = {
      val r = readBTSNamelessAssertionT(F)
      return r
    }

    def readBTSNamelessAssertionT(typeParsed: B): BTSNamelessAssertion = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSNamelessAssertion)
      }
      val predicate = readBTSExp()
      return BTSNamelessAssertion(predicate)
    }

    def readBTSNamelessFunction(): BTSNamelessFunction = {
      val r = readBTSNamelessFunctionT(F)
      return r
    }

    def readBTSNamelessFunctionT(typeParsed: B): BTSNamelessFunction = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSNamelessFunction)
      }
      val returns = readBTSType()
      val functionvalue = readBTSExp()
      return BTSNamelessFunction(returns, functionvalue)
    }

    def readBTSNamelessEnumeration(): BTSNamelessEnumeration = {
      val r = readBTSNamelessEnumerationT(F)
      return r
    }

    def readBTSNamelessEnumerationT(typeParsed: B): BTSNamelessEnumeration = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSNamelessEnumeration)
      }
      val enumeration = readBTSInvocation()
      return BTSNamelessEnumeration(enumeration)
    }

    def readBTSAssertionEnumeration(): BTSAssertionEnumeration = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BTSEnumerationPairs => val r = readBTSEnumerationPairsT(T); return r
        case Constants.BTSInvocation => val r = readBTSInvocationT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BTSAssertionEnumeration.")
          val r = readBTSInvocationT(T)
          return r
      }
    }

    def readBTSEnumerationPairs(): BTSEnumerationPairs = {
      val r = readBTSEnumerationPairsT(F)
      return r
    }

    def readBTSEnumerationPairsT(typeParsed: B): BTSEnumerationPairs = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSEnumerationPairs)
      }
      val pairs = reader.readISZ(readBTSEnumerationPair _)
      return BTSEnumerationPairs(pairs)
    }

    def readBTSEnumerationPair(): BTSEnumerationPair = {
      val r = readBTSEnumerationPairT(F)
      return r
    }

    def readBTSEnumerationPairT(typeParsed: B): BTSEnumerationPair = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSEnumerationPair)
      }
      val literal = readName()
      val predicate = readBTSExp()
      return BTSEnumerationPair(literal, predicate)
    }

    def readBTSInvocation(): BTSInvocation = {
      val r = readBTSInvocationT(F)
      return r
    }

    def readBTSInvocationT(typeParsed: B): BTSInvocation = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSInvocation)
      }
      val label = readName()
      val params = reader.readISZ(readBTSActualParameter _)
      val actual = reader.readOption(readBTSExp _)
      return BTSInvocation(label, params, actual)
    }

    def readBTSActualParameter(): BTSActualParameter = {
      val r = readBTSActualParameterT(F)
      return r
    }

    def readBTSActualParameterT(typeParsed: B): BTSActualParameter = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSActualParameter)
      }
      val formal = readName()
      val actual = readBTSExp()
      return BTSActualParameter(formal, actual)
    }

    def readBTSVariable(): BTSVariable = {
      val r = readBTSVariableT(F)
      return r
    }

    def readBTSVariableT(typeParsed: B): BTSVariable = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSVariable)
      }
      val name = readName()
      val typ = readBTSType()
      return BTSVariable(name, typ)
    }

    def readBTSActionAnnexSubclause(): BTSActionAnnexSubclause = {
      val r = readBTSActionAnnexSubclauseT(F)
      return r
    }

    def readBTSActionAnnexSubclauseT(typeParsed: B): BTSActionAnnexSubclause = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSActionAnnexSubclause)
      }
      val doNotProve = reader.readB()
      val throws = reader.readISZ(readName _)
      val assertions = reader.readISZ(readBTSAssertion _)
      val precondition = reader.readOption(readBTSAssertion _)
      val postcondition = reader.readOption(readBTSAssertion _)
      val invariant = reader.readOption(readBTSAssertion _)
      val elq = readBTSExistentialLatticeQuantification()
      return BTSActionAnnexSubclause(doNotProve, throws, assertions, precondition, postcondition, invariant, elq)
    }

    def readBTSBehaviorActions(): BTSBehaviorActions = {
      val r = readBTSBehaviorActionsT(F)
      return r
    }

    def readBTSBehaviorActionsT(typeParsed: B): BTSBehaviorActions = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSBehaviorActions)
      }
      val executionOrder = readBTSExecutionOrderType()
      val actions = reader.readISZ(readBTSAssertedAction _)
      return BTSBehaviorActions(executionOrder, actions)
    }

    def readBTSExecutionOrderType(): BTSExecutionOrder.Type = {
      val r = reader.readZ()
      return BTSExecutionOrder.byOrdinal(r).get
    }

    def readBTSAssertedAction(): BTSAssertedAction = {
      val r = readBTSAssertedActionT(F)
      return r
    }

    def readBTSAssertedActionT(typeParsed: B): BTSAssertedAction = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSAssertedAction)
      }
      val precondition = reader.readOption(readBTSAssertion _)
      val action = readBTSAction()
      val postcondition = reader.readOption(readBTSAssertion _)
      return BTSAssertedAction(precondition, action, postcondition)
    }

    def readBTSAction(): BTSAction = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BTSSkipAction => val r = readBTSSkipActionT(T); return r
        case Constants.BTSAssignmentAction => val r = readBTSAssignmentActionT(T); return r
        case Constants.BTSSetMode => val r = readBTSSetModeT(T); return r
        case Constants.BTSWhenThrow => val r = readBTSWhenThrowT(T); return r
        case Constants.BTSFetchAdd => val r = readBTSFetchAddT(T); return r
        case Constants.BTSFetchOr => val r = readBTSFetchOrT(T); return r
        case Constants.BTSFetchAnd => val r = readBTSFetchAndT(T); return r
        case Constants.BTSFetchXor => val r = readBTSFetchXorT(T); return r
        case Constants.BTSSwap => val r = readBTSSwapT(T); return r
        case Constants.BTSSubprogramCallAction => val r = readBTSSubprogramCallActionT(T); return r
        case Constants.BTSPortOutput => val r = readBTSPortOutputT(T); return r
        case Constants.BTSPortInput => val r = readBTSPortInputT(T); return r
        case Constants.BTSFrozenPortAction => val r = readBTSFrozenPortActionT(T); return r
        case Constants.BTSPause => val r = readBTSPauseT(T); return r
        case Constants.BTSIfBLESSAction => val r = readBTSIfBLESSActionT(T); return r
        case Constants.BTSIfBAAction => val r = readBTSIfBAActionT(T); return r
        case Constants.BTSWhileLoop => val r = readBTSWhileLoopT(T); return r
        case Constants.BTSForLoop => val r = readBTSForLoopT(T); return r
        case Constants.BTSDoUntilLoop => val r = readBTSDoUntilLoopT(T); return r
        case Constants.BTSExistentialLatticeQuantification => val r = readBTSExistentialLatticeQuantificationT(T); return r
        case Constants.BTSUniversalLatticeQuantification => val r = readBTSUniversalLatticeQuantificationT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BTSAction.")
          val r = readBTSUniversalLatticeQuantificationT(T)
          return r
      }
    }

    def readBTSBasicAction(): BTSBasicAction = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BTSSkipAction => val r = readBTSSkipActionT(T); return r
        case Constants.BTSAssignmentAction => val r = readBTSAssignmentActionT(T); return r
        case Constants.BTSSetMode => val r = readBTSSetModeT(T); return r
        case Constants.BTSWhenThrow => val r = readBTSWhenThrowT(T); return r
        case Constants.BTSFetchAdd => val r = readBTSFetchAddT(T); return r
        case Constants.BTSFetchOr => val r = readBTSFetchOrT(T); return r
        case Constants.BTSFetchAnd => val r = readBTSFetchAndT(T); return r
        case Constants.BTSFetchXor => val r = readBTSFetchXorT(T); return r
        case Constants.BTSSwap => val r = readBTSSwapT(T); return r
        case Constants.BTSSubprogramCallAction => val r = readBTSSubprogramCallActionT(T); return r
        case Constants.BTSPortOutput => val r = readBTSPortOutputT(T); return r
        case Constants.BTSPortInput => val r = readBTSPortInputT(T); return r
        case Constants.BTSFrozenPortAction => val r = readBTSFrozenPortActionT(T); return r
        case Constants.BTSPause => val r = readBTSPauseT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BTSBasicAction.")
          val r = readBTSPauseT(T)
          return r
      }
    }

    def readBTSSkipAction(): BTSSkipAction = {
      val r = readBTSSkipActionT(F)
      return r
    }

    def readBTSSkipActionT(typeParsed: B): BTSSkipAction = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSSkipAction)
      }
      return BTSSkipAction()
    }

    def readBTSAssignmentAction(): BTSAssignmentAction = {
      val r = readBTSAssignmentActionT(F)
      return r
    }

    def readBTSAssignmentActionT(typeParsed: B): BTSAssignmentAction = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSAssignmentAction)
      }
      val lhs = readBTSValueName()
      val tick = reader.readB()
      val rhs = readBTSExp()
      return BTSAssignmentAction(lhs, tick, rhs)
    }

    def readBTSSetMode(): BTSSetMode = {
      val r = readBTSSetModeT(F)
      return r
    }

    def readBTSSetModeT(typeParsed: B): BTSSetMode = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSSetMode)
      }
      val mode = readName()
      return BTSSetMode(mode)
    }

    def readBTSWhenThrow(): BTSWhenThrow = {
      val r = readBTSWhenThrowT(F)
      return r
    }

    def readBTSWhenThrowT(typeParsed: B): BTSWhenThrow = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSWhenThrow)
      }
      val exp = readBTSExp()
      val exception = readName()
      val message = reader.readOption(reader.readString _)
      return BTSWhenThrow(exp, exception, message)
    }

    def readBTSCombinableOperation(): BTSCombinableOperation = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BTSFetchAdd => val r = readBTSFetchAddT(T); return r
        case Constants.BTSFetchOr => val r = readBTSFetchOrT(T); return r
        case Constants.BTSFetchAnd => val r = readBTSFetchAndT(T); return r
        case Constants.BTSFetchXor => val r = readBTSFetchXorT(T); return r
        case Constants.BTSSwap => val r = readBTSSwapT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BTSCombinableOperation.")
          val r = readBTSSwapT(T)
          return r
      }
    }

    def readBTSFetchAdd(): BTSFetchAdd = {
      val r = readBTSFetchAddT(F)
      return r
    }

    def readBTSFetchAddT(typeParsed: B): BTSFetchAdd = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSFetchAdd)
      }
      val target = readName()
      val arithmetic = readBTSExp()
      val result = readName()
      return BTSFetchAdd(target, arithmetic, result)
    }

    def readBTSFetchOr(): BTSFetchOr = {
      val r = readBTSFetchOrT(F)
      return r
    }

    def readBTSFetchOrT(typeParsed: B): BTSFetchOr = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSFetchOr)
      }
      val target = readName()
      val bool = readBTSExp()
      val result = reader.readOption(readName _)
      return BTSFetchOr(target, bool, result)
    }

    def readBTSFetchAnd(): BTSFetchAnd = {
      val r = readBTSFetchAndT(F)
      return r
    }

    def readBTSFetchAndT(typeParsed: B): BTSFetchAnd = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSFetchAnd)
      }
      val target = readName()
      val bool = readBTSExp()
      val result = reader.readOption(readName _)
      return BTSFetchAnd(target, bool, result)
    }

    def readBTSFetchXor(): BTSFetchXor = {
      val r = readBTSFetchXorT(F)
      return r
    }

    def readBTSFetchXorT(typeParsed: B): BTSFetchXor = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSFetchXor)
      }
      val target = readName()
      val bool = readBTSExp()
      val result = reader.readOption(readName _)
      return BTSFetchXor(target, bool, result)
    }

    def readBTSSwap(): BTSSwap = {
      val r = readBTSSwapT(F)
      return r
    }

    def readBTSSwapT(typeParsed: B): BTSSwap = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSSwap)
      }
      val target = readName()
      val reference = readName()
      val result = readName()
      return BTSSwap(target, reference, result)
    }

    def readBTSCommunicationAction(): BTSCommunicationAction = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BTSSubprogramCallAction => val r = readBTSSubprogramCallActionT(T); return r
        case Constants.BTSPortOutput => val r = readBTSPortOutputT(T); return r
        case Constants.BTSPortInput => val r = readBTSPortInputT(T); return r
        case Constants.BTSFrozenPortAction => val r = readBTSFrozenPortActionT(T); return r
        case Constants.BTSPause => val r = readBTSPauseT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BTSCommunicationAction.")
          val r = readBTSPauseT(T)
          return r
      }
    }

    def readBTSSubprogramCallAction(): BTSSubprogramCallAction = {
      val r = readBTSSubprogramCallActionT(F)
      return r
    }

    def readBTSSubprogramCallActionT(typeParsed: B): BTSSubprogramCallAction = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSSubprogramCallAction)
      }
      val name = readName()
      val params = reader.readISZ(readBTSFormalActual _)
      return BTSSubprogramCallAction(name, params)
    }

    def readBTSFormalActual(): BTSFormalActual = {
      val r = readBTSFormalActualT(F)
      return r
    }

    def readBTSFormalActualT(typeParsed: B): BTSFormalActual = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSFormalActual)
      }
      val formal = readName()
      val actual = readBTSExp()
      return BTSFormalActual(formal, actual)
    }

    def readBTSPortOutput(): BTSPortOutput = {
      val r = readBTSPortOutputT(F)
      return r
    }

    def readBTSPortOutputT(typeParsed: B): BTSPortOutput = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSPortOutput)
      }
      val port = readName()
      val exp = reader.readOption(readBTSExp _)
      return BTSPortOutput(port, exp)
    }

    def readBTSPortInput(): BTSPortInput = {
      val r = readBTSPortInputT(F)
      return r
    }

    def readBTSPortInputT(typeParsed: B): BTSPortInput = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSPortInput)
      }
      val port = readName()
      val variable = readBTSValueName()
      return BTSPortInput(port, variable)
    }

    def readBTSFrozenPortAction(): BTSFrozenPortAction = {
      val r = readBTSFrozenPortActionT(F)
      return r
    }

    def readBTSFrozenPortActionT(typeParsed: B): BTSFrozenPortAction = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSFrozenPortAction)
      }
      val ports = reader.readISZ(readName _)
      return BTSFrozenPortAction(ports)
    }

    def readBTSPause(): BTSPause = {
      val r = readBTSPauseT(F)
      return r
    }

    def readBTSPauseT(typeParsed: B): BTSPause = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSPause)
      }
      return BTSPause()
    }

    def readBTSControlAction(): BTSControlAction = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BTSIfBLESSAction => val r = readBTSIfBLESSActionT(T); return r
        case Constants.BTSIfBAAction => val r = readBTSIfBAActionT(T); return r
        case Constants.BTSWhileLoop => val r = readBTSWhileLoopT(T); return r
        case Constants.BTSForLoop => val r = readBTSForLoopT(T); return r
        case Constants.BTSDoUntilLoop => val r = readBTSDoUntilLoopT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BTSControlAction.")
          val r = readBTSDoUntilLoopT(T)
          return r
      }
    }

    def readBTSIfBLESSAction(): BTSIfBLESSAction = {
      val r = readBTSIfBLESSActionT(F)
      return r
    }

    def readBTSIfBLESSActionT(typeParsed: B): BTSIfBLESSAction = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSIfBLESSAction)
      }
      val availability = reader.readOption(readTODO _)
      val alternatives = reader.readISZ(readBTSGuardedAction _)
      return BTSIfBLESSAction(availability, alternatives)
    }

    def readBTSGuardedAction(): BTSGuardedAction = {
      val r = readBTSGuardedActionT(F)
      return r
    }

    def readBTSGuardedActionT(typeParsed: B): BTSGuardedAction = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSGuardedAction)
      }
      val guard = readBTSExp()
      val action = readBTSAssertedAction()
      return BTSGuardedAction(guard, action)
    }

    def readBTSIfBAAction(): BTSIfBAAction = {
      val r = readBTSIfBAActionT(F)
      return r
    }

    def readBTSIfBAActionT(typeParsed: B): BTSIfBAAction = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSIfBAAction)
      }
      val ifBranch = readBTSConditionalActions()
      val elseIfBranches = reader.readISZ(readBTSConditionalActions _)
      val elseBranch = reader.readOption(readBTSBehaviorActions _)
      return BTSIfBAAction(ifBranch, elseIfBranches, elseBranch)
    }

    def readBTSConditionalActions(): BTSConditionalActions = {
      val r = readBTSConditionalActionsT(F)
      return r
    }

    def readBTSConditionalActionsT(typeParsed: B): BTSConditionalActions = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSConditionalActions)
      }
      val cond = readBTSExp()
      val actions = readBTSBehaviorActions()
      return BTSConditionalActions(cond, actions)
    }

    def readBTSWhileLoop(): BTSWhileLoop = {
      val r = readBTSWhileLoopT(F)
      return r
    }

    def readBTSWhileLoopT(typeParsed: B): BTSWhileLoop = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSWhileLoop)
      }
      val test = readBTSExp()
      val invariant = reader.readOption(readBTSNamelessAssertion _)
      val bound = reader.readOption(readBTSExp _)
      val elq = readBTSExistentialLatticeQuantification()
      return BTSWhileLoop(test, invariant, bound, elq)
    }

    def readBTSForLoop(): BTSForLoop = {
      val r = readBTSForLoopT(F)
      return r
    }

    def readBTSForLoopT(typeParsed: B): BTSForLoop = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSForLoop)
      }
      val count = readName()
      val lowerbound = readBTSExp()
      val upperbound = readBTSExp()
      val invariant = reader.readOption(readBTSNamelessAssertion _)
      val actions = readBTSBehaviorActions()
      return BTSForLoop(count, lowerbound, upperbound, invariant, actions)
    }

    def readBTSDoUntilLoop(): BTSDoUntilLoop = {
      val r = readBTSDoUntilLoopT(F)
      return r
    }

    def readBTSDoUntilLoopT(typeParsed: B): BTSDoUntilLoop = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSDoUntilLoop)
      }
      val invariant = reader.readOption(readBTSNamelessAssertion _)
      val bound = reader.readOption(readBTSExp _)
      val actions = readBTSBehaviorActions()
      val guard = readBTSExp()
      return BTSDoUntilLoop(invariant, bound, actions, guard)
    }

    def readBTSQuantificationActions(): BTSQuantificationActions = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BTSExistentialLatticeQuantification => val r = readBTSExistentialLatticeQuantificationT(T); return r
        case Constants.BTSUniversalLatticeQuantification => val r = readBTSUniversalLatticeQuantificationT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BTSQuantificationActions.")
          val r = readBTSUniversalLatticeQuantificationT(T)
          return r
      }
    }

    def readBTSExistentialLatticeQuantification(): BTSExistentialLatticeQuantification = {
      val r = readBTSExistentialLatticeQuantificationT(F)
      return r
    }

    def readBTSExistentialLatticeQuantificationT(typeParsed: B): BTSExistentialLatticeQuantification = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSExistentialLatticeQuantification)
      }
      val quantifiedVariables = reader.readISZ(readBTSVariableDeclaration _)
      val actions = readBTSBehaviorActions()
      val timeout = reader.readOption(readBTSExp _)
      val catchClause = reader.readISZ(readBTSCatchClauseTerm _)
      return BTSExistentialLatticeQuantification(quantifiedVariables, actions, timeout, catchClause)
    }

    def readBTSCatchClauseTerm(): BTSCatchClauseTerm = {
      val r = readBTSCatchClauseTermT(F)
      return r
    }

    def readBTSCatchClauseTermT(typeParsed: B): BTSCatchClauseTerm = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSCatchClauseTerm)
      }
      val exceptions = reader.readISZ(readName _)
      val all = reader.readB()
      val action = readBTSBasicAction()
      return BTSCatchClauseTerm(exceptions, all, action)
    }

    def readBTSUniversalLatticeQuantification(): BTSUniversalLatticeQuantification = {
      val r = readBTSUniversalLatticeQuantificationT(F)
      return r
    }

    def readBTSUniversalLatticeQuantificationT(typeParsed: B): BTSUniversalLatticeQuantification = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSUniversalLatticeQuantification)
      }
      val latticeVariables = reader.readISZ(readName _)
      val lowerbound = readBTSExp()
      val upperbound = readBTSExp()
      val elq = readBTSExistentialLatticeQuantification()
      return BTSUniversalLatticeQuantification(latticeVariables, lowerbound, upperbound, elq)
    }

    def readBTSExp(): BTSExp = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BTSUnaryExp => val r = readBTSUnaryExpT(T); return r
        case Constants.BTSBinaryExp => val r = readBTSBinaryExpT(T); return r
        case Constants.BTSLiteralExp => val r = readBTSLiteralExpT(T); return r
        case Constants.BTSVariableNameExp => val r = readBTSVariableNameExpT(T); return r
        case Constants.BTSIndexingExp => val r = readBTSIndexingExpT(T); return r
        case Constants.BTSAccessExp => val r = readBTSAccessExpT(T); return r
        case Constants.BTSFunctionCall => val r = readBTSFunctionCallT(T); return r
        case Constants.BTSConditionalExpression => val r = readBTSConditionalExpressionT(T); return r
        case Constants.BTSTrue => val r = readBTSTrueT(T); return r
        case Constants.BTSFalse => val r = readBTSFalseT(T); return r
        case Constants.BTSNull => val r = readBTSNullT(T); return r
        case Constants.BTSPropertyConstant => val r = readBTSPropertyConstantT(T); return r
        case Constants.BTSPropertySetProperty => val r = readBTSPropertySetPropertyT(T); return r
        case Constants.BTSSelfProperty => val r = readBTSSelfPropertyT(T); return r
        case Constants.BTSComponentProperty => val r = readBTSComponentPropertyT(T); return r
        case Constants.BTSUniversalQuantification => val r = readBTSUniversalQuantificationT(T); return r
        case Constants.BTSExistentialQuantification => val r = readBTSExistentialQuantificationT(T); return r
        case Constants.BTSSumQuantification => val r = readBTSSumQuantificationT(T); return r
        case Constants.BTSProductQuantification => val r = readBTSProductQuantificationT(T); return r
        case Constants.BTSCountingQuantification => val r = readBTSCountingQuantificationT(T); return r
        case Constants.BTSRange => val r = readBTSRangeT(T); return r
        case Constants.BTSQuantity => val r = readBTSQuantityT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BTSExp.")
          val r = readBTSQuantityT(T)
          return r
      }
    }

    def readBTSUnaryExp(): BTSUnaryExp = {
      val r = readBTSUnaryExpT(F)
      return r
    }

    def readBTSUnaryExpT(typeParsed: B): BTSUnaryExp = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSUnaryExp)
      }
      val op = readBTSUnaryOpType()
      val exp = readBTSExp()
      return BTSUnaryExp(op, exp)
    }

    def readBTSUnaryOpType(): BTSUnaryOp.Type = {
      val r = reader.readZ()
      return BTSUnaryOp.byOrdinal(r).get
    }

    def readBTSBinaryExp(): BTSBinaryExp = {
      val r = readBTSBinaryExpT(F)
      return r
    }

    def readBTSBinaryExpT(typeParsed: B): BTSBinaryExp = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSBinaryExp)
      }
      val op = readBTSBinaryOpType()
      val lhs = readBTSExp()
      val rhs = readBTSExp()
      return BTSBinaryExp(op, lhs, rhs)
    }

    def readBTSBinaryOpType(): BTSBinaryOp.Type = {
      val r = reader.readZ()
      return BTSBinaryOp.byOrdinal(r).get
    }

    def readBTSLiteralTypeType(): BTSLiteralType.Type = {
      val r = reader.readZ()
      return BTSLiteralType.byOrdinal(r).get
    }

    def readBTSLiteralExp(): BTSLiteralExp = {
      val r = readBTSLiteralExpT(F)
      return r
    }

    def readBTSLiteralExpT(typeParsed: B): BTSLiteralExp = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSLiteralExp)
      }
      val typ = readBTSLiteralTypeType()
      val exp = reader.readString()
      val unit = reader.readOption(readName _)
      return BTSLiteralExp(typ, exp, unit)
    }

    def readBTSValueName(): BTSValueName = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BTSVariableNameExp => val r = readBTSVariableNameExpT(T); return r
        case Constants.BTSFunctionCall => val r = readBTSFunctionCallT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BTSValueName.")
          val r = readBTSFunctionCallT(T)
          return r
      }
    }

    def readBTSVariableNameExp(): BTSVariableNameExp = {
      val r = readBTSVariableNameExpT(F)
      return r
    }

    def readBTSVariableNameExpT(typeParsed: B): BTSVariableNameExp = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSVariableNameExp)
      }
      val name = readName()
      val arrayindex = reader.readISZ(readBTSExp _)
      val pn = reader.readISZ(readBTSPartialName _)
      return BTSVariableNameExp(name, arrayindex, pn)
    }

    def readBTSPartialName(): BTSPartialName = {
      val r = readBTSPartialNameT(F)
      return r
    }

    def readBTSPartialNameT(typeParsed: B): BTSPartialName = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSPartialName)
      }
      val label = readName()
      val arrayindex = reader.readISZ(readBTSExp _)
      return BTSPartialName(label, arrayindex)
    }

    def readBTSIndexingExp(): BTSIndexingExp = {
      val r = readBTSIndexingExpT(F)
      return r
    }

    def readBTSIndexingExpT(typeParsed: B): BTSIndexingExp = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSIndexingExp)
      }
      val exp = readBTSExp()
      val indices = reader.readISZ(readBTSExp _)
      return BTSIndexingExp(exp, indices)
    }

    def readBTSAccessExp(): BTSAccessExp = {
      val r = readBTSAccessExpT(F)
      return r
    }

    def readBTSAccessExpT(typeParsed: B): BTSAccessExp = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSAccessExp)
      }
      val exp = readBTSExp()
      val attributeName = reader.readString()
      return BTSAccessExp(exp, attributeName)
    }

    def readBTSFunctionCall(): BTSFunctionCall = {
      val r = readBTSFunctionCallT(F)
      return r
    }

    def readBTSFunctionCallT(typeParsed: B): BTSFunctionCall = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSFunctionCall)
      }
      val name = readName()
      val args = reader.readISZ(readBTSFormalActual _)
      return BTSFunctionCall(name, args)
    }

    def readBTSPortValue(): BTSPortValue = {
      val r = readBTSPortValueT(F)
      return r
    }

    def readBTSPortValueT(typeParsed: B): BTSPortValue = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSPortValue)
      }
      val port = readName()
      val valuekind = readBTSPortValueKindType()
      return BTSPortValue(port, valuekind)
    }

    def readBTSPortValueKindType(): BTSPortValueKind.Type = {
      val r = reader.readZ()
      return BTSPortValueKind.byOrdinal(r).get
    }

    def readBTSConditionalExpression(): BTSConditionalExpression = {
      val r = readBTSConditionalExpressionT(F)
      return r
    }

    def readBTSConditionalExpressionT(typeParsed: B): BTSConditionalExpression = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSConditionalExpression)
      }
      val guard = readBTSExp()
      val t = readBTSExp()
      val f = readBTSExp()
      return BTSConditionalExpression(guard, t, f)
    }

    def readBTSTrue(): BTSTrue = {
      val r = readBTSTrueT(F)
      return r
    }

    def readBTSTrueT(typeParsed: B): BTSTrue = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSTrue)
      }
      return BTSTrue()
    }

    def readBTSFalse(): BTSFalse = {
      val r = readBTSFalseT(F)
      return r
    }

    def readBTSFalseT(typeParsed: B): BTSFalse = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSFalse)
      }
      return BTSFalse()
    }

    def readBTSNull(): BTSNull = {
      val r = readBTSNullT(F)
      return r
    }

    def readBTSNullT(typeParsed: B): BTSNull = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSNull)
      }
      return BTSNull()
    }

    def readBTSPropertyConstant(): BTSPropertyConstant = {
      val r = readBTSPropertyConstantT(F)
      return r
    }

    def readBTSPropertyConstantT(typeParsed: B): BTSPropertyConstant = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSPropertyConstant)
      }
      val propertyset = readName()
      val propertyconstant = readName()
      return BTSPropertyConstant(propertyset, propertyconstant)
    }

    def readBTSPropertyReference(): BTSPropertyReference = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case _ =>
          reader.error(i, s"$t is not a valid type of BTSPropertyReference.")
          val r = read?T(T)
          return r
      }
    }

    def readBTSPropertySetProperty(): BTSPropertySetProperty = {
      val r = readBTSPropertySetPropertyT(F)
      return r
    }

    def readBTSPropertySetPropertyT(typeParsed: B): BTSPropertySetProperty = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSPropertySetProperty)
      }
      val propertyset = reader.readOption(readName _)
      val propertyconstant = readName()
      val field = reader.readISZ(readBTSPropertyField _)
      return BTSPropertySetProperty(propertyset, propertyconstant, field)
    }

    def readBTSSelfProperty(): BTSSelfProperty = {
      val r = readBTSSelfPropertyT(F)
      return r
    }

    def readBTSSelfPropertyT(typeParsed: B): BTSSelfProperty = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSSelfProperty)
      }
      val propertyset = reader.readOption(readName _)
      val propertyconstant = readName()
      val field = reader.readISZ(readBTSPropertyField _)
      return BTSSelfProperty(propertyset, propertyconstant, field)
    }

    def readBTSComponentProperty(): BTSComponentProperty = {
      val r = readBTSComponentPropertyT(F)
      return r
    }

    def readBTSComponentPropertyT(typeParsed: B): BTSComponentProperty = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSComponentProperty)
      }
      val component = readBTSComponent()
      val propertyset = reader.readOption(readName _)
      val propertyconstant = readName()
      val field = reader.readISZ(readBTSPropertyField _)
      return BTSComponentProperty(component, propertyset, propertyconstant, field)
    }

    def readBTSComponent(): BTSComponent = {
      val r = readBTSComponentT(F)
      return r
    }

    def readBTSComponentT(typeParsed: B): BTSComponent = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSComponent)
      }
      val packageids = reader.readISZ(readName _)
      val component = readName()
      val impl = reader.readOption(readName _)
      return BTSComponent(packageids, component, impl)
    }

    def readBTSPropertyField(): BTSPropertyField = {
      val r = readBTSPropertyFieldT(F)
      return r
    }

    def readBTSPropertyFieldT(typeParsed: B): BTSPropertyField = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSPropertyField)
      }
      val index = reader.readOption(reader.readZ _)
      val variable = reader.readOption(readName _)
      val pf = reader.readOption(readName _)
      val upper = reader.readB()
      val lower = reader.readB()
      return BTSPropertyField(index, variable, pf, upper, lower)
    }

    def readBTSUniversalQuantification(): BTSUniversalQuantification = {
      val r = readBTSUniversalQuantificationT(F)
      return r
    }

    def readBTSUniversalQuantificationT(typeParsed: B): BTSUniversalQuantification = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSUniversalQuantification)
      }
      val variables = reader.readISZ(readBTSVariable _)
      val range = reader.readOption(readBTSRange _)
      val condition = reader.readOption(readBTSExp _)
      val predicate = readBTSExp()
      return BTSUniversalQuantification(variables, range, condition, predicate)
    }

    def readBTSExistentialQuantification(): BTSExistentialQuantification = {
      val r = readBTSExistentialQuantificationT(F)
      return r
    }

    def readBTSExistentialQuantificationT(typeParsed: B): BTSExistentialQuantification = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSExistentialQuantification)
      }
      val variables = reader.readISZ(readBTSVariable _)
      val range = reader.readOption(readBTSRange _)
      val condition = reader.readOption(readBTSExp _)
      val predicate = readBTSExp()
      return BTSExistentialQuantification(variables, range, condition, predicate)
    }

    def readBTSSumQuantification(): BTSSumQuantification = {
      val r = readBTSSumQuantificationT(F)
      return r
    }

    def readBTSSumQuantificationT(typeParsed: B): BTSSumQuantification = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSSumQuantification)
      }
      val variables = reader.readISZ(readBTSVariable _)
      val range = reader.readOption(readBTSRange _)
      val condition = reader.readOption(readBTSExp _)
      val expression = readBTSExp()
      return BTSSumQuantification(variables, range, condition, expression)
    }

    def readBTSProductQuantification(): BTSProductQuantification = {
      val r = readBTSProductQuantificationT(F)
      return r
    }

    def readBTSProductQuantificationT(typeParsed: B): BTSProductQuantification = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSProductQuantification)
      }
      val variables = reader.readISZ(readBTSVariable _)
      val range = reader.readOption(readBTSRange _)
      val condition = reader.readOption(readBTSExp _)
      val expression = readBTSExp()
      return BTSProductQuantification(variables, range, condition, expression)
    }

    def readBTSCountingQuantification(): BTSCountingQuantification = {
      val r = readBTSCountingQuantificationT(F)
      return r
    }

    def readBTSCountingQuantificationT(typeParsed: B): BTSCountingQuantification = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSCountingQuantification)
      }
      val variables = reader.readISZ(readBTSVariable _)
      val range = reader.readOption(readBTSRange _)
      val condition = reader.readOption(readBTSExp _)
      val predicate = readBTSExp()
      return BTSCountingQuantification(variables, range, condition, predicate)
    }

    def readBTSRange(): BTSRange = {
      val r = readBTSRangeT(F)
      return r
    }

    def readBTSRangeT(typeParsed: B): BTSRange = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSRange)
      }
      val lb = readBTSExp()
      val op = readBTSRangeSymbolType()
      val ub = readBTSExp()
      return BTSRange(lb, op, ub)
    }

    def readBTSRangeSymbolType(): BTSRangeSymbol.Type = {
      val r = reader.readZ()
      return BTSRangeSymbol.byOrdinal(r).get
    }

    def readBTSTypeLibrary(): BTSTypeLibrary = {
      val r = readBTSTypeLibraryT(F)
      return r
    }

    def readBTSTypeLibraryT(typeParsed: B): BTSTypeLibrary = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSTypeLibrary)
      }
      val typedeclarations = reader.readISZ(readBTSTypeDeclatation _)
      return BTSTypeLibrary(typedeclarations)
    }

    def readBTSTypeDeclatation(): BTSTypeDeclatation = {
      val r = readBTSTypeDeclatationT(F)
      return r
    }

    def readBTSTypeDeclatationT(typeParsed: B): BTSTypeDeclatation = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSTypeDeclatation)
      }
      val name = readName()
      val ty = readBTSType()
      return BTSTypeDeclatation(name, ty)
    }

    def readBTSType(): BTSType = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BTSBooleanType => val r = readBTSBooleanTypeT(T); return r
        case Constants.BTSStringType => val r = readBTSStringTypeT(T); return r
        case Constants.BTSNullType => val r = readBTSNullTypeT(T); return r
        case Constants.BTSClassifier => val r = readBTSClassifierT(T); return r
        case Constants.BTSTypeName => val r = readBTSTypeNameT(T); return r
        case Constants.BTSEnumerationType => val r = readBTSEnumerationTypeT(T); return r
        case Constants.BTSQuantityType => val r = readBTSQuantityTypeT(T); return r
        case Constants.BTSArrayType => val r = readBTSArrayTypeT(T); return r
        case Constants.BTSRecordType => val r = readBTSRecordTypeT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BTSType.")
          val r = readBTSRecordTypeT(T)
          return r
      }
    }

    def readBTSBooleanType(): BTSBooleanType = {
      val r = readBTSBooleanTypeT(F)
      return r
    }

    def readBTSBooleanTypeT(typeParsed: B): BTSBooleanType = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSBooleanType)
      }
      return BTSBooleanType()
    }

    def readBTSStringType(): BTSStringType = {
      val r = readBTSStringTypeT(F)
      return r
    }

    def readBTSStringTypeT(typeParsed: B): BTSStringType = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSStringType)
      }
      return BTSStringType()
    }

    def readBTSNullType(): BTSNullType = {
      val r = readBTSNullTypeT(F)
      return r
    }

    def readBTSNullTypeT(typeParsed: B): BTSNullType = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSNullType)
      }
      return BTSNullType()
    }

    def readBTSClassifier(): BTSClassifier = {
      val r = readBTSClassifierT(F)
      return r
    }

    def readBTSClassifierT(typeParsed: B): BTSClassifier = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSClassifier)
      }
      val classifier = readBTSComponent()
      return BTSClassifier(classifier)
    }

    def readBTSTypeName(): BTSTypeName = {
      val r = readBTSTypeNameT(F)
      return r
    }

    def readBTSTypeNameT(typeParsed: B): BTSTypeName = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSTypeName)
      }
      val typename = readName()
      return BTSTypeName(typename)
    }

    def readBTSEnumerationType(): BTSEnumerationType = {
      val r = readBTSEnumerationTypeT(F)
      return r
    }

    def readBTSEnumerationTypeT(typeParsed: B): BTSEnumerationType = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSEnumerationType)
      }
      val literals = reader.readISZ(readName _)
      return BTSEnumerationType(literals)
    }

    def readBTSQuantityType(): BTSQuantityType = {
      val r = readBTSQuantityTypeT(F)
      return r
    }

    def readBTSQuantityTypeT(typeParsed: B): BTSQuantityType = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSQuantityType)
      }
      val unit = reader.readOption(readName _)
      val scalar = reader.readB()
      val whole = reader.readB()
      val lb = reader.readOption(reader.readF64 _)
      val ub = reader.readOption(reader.readF64 _)
      val step = reader.readOption(reader.readF64 _)
      val representation = reader.readOption(readBTSPropertyConstant _)
      return BTSQuantityType(unit, scalar, whole, lb, ub, step, representation)
    }

    def readBTSArrayType(): BTSArrayType = {
      val r = readBTSArrayTypeT(F)
      return r
    }

    def readBTSArrayTypeT(typeParsed: B): BTSArrayType = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSArrayType)
      }
      val ranges = reader.readISZ(readBTSArrayRange _)
      val typ = readBTSType()
      return BTSArrayType(ranges, typ)
    }

    def readBTSArrayRange(): BTSArrayRange = {
      val r = readBTSArrayRangeT(F)
      return r
    }

    def readBTSArrayRangeT(typeParsed: B): BTSArrayRange = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSArrayRange)
      }
      val lb = readBTSExp()
      val ub = reader.readOption(readBTSExp _)
      return BTSArrayRange(lb, ub)
    }

    def readBTSRecordType(): BTSRecordType = {
      val r = readBTSRecordTypeT(F)
      return r
    }

    def readBTSRecordTypeT(typeParsed: B): BTSRecordType = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSRecordType)
      }
      val kind = readBTSRecordKindType()
      val fields = reader.readISZ(readBTSRecordField _)
      return BTSRecordType(kind, fields)
    }

    def readBTSRecordKindType(): BTSRecordKind.Type = {
      val r = reader.readZ()
      return BTSRecordKind.byOrdinal(r).get
    }

    def readBTSRecordField(): BTSRecordField = {
      val r = readBTSRecordFieldT(F)
      return r
    }

    def readBTSRecordFieldT(typeParsed: B): BTSRecordField = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSRecordField)
      }
      val label = readName()
      val typ = readBTSType()
      return BTSRecordField(label, typ)
    }

    def readBTSUnitLibrary(): BTSUnitLibrary = {
      val r = readBTSUnitLibraryT(F)
      return r
    }

    def readBTSUnitLibraryT(typeParsed: B): BTSUnitLibrary = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSUnitLibrary)
      }
      val unitDeclarations = reader.readISZ(readBTSUnitDeclaration _)
      return BTSUnitLibrary(unitDeclarations)
    }

    def readBTSUnitDeclaration(): BTSUnitDeclaration = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BTSRootDeclaration => val r = readBTSRootDeclarationT(T); return r
        case Constants.BTSUnitExtension => val r = readBTSUnitExtensionT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BTSUnitDeclaration.")
          val r = readBTSUnitExtensionT(T)
          return r
      }
    }

    def readBTSRootDeclaration(): BTSRootDeclaration = {
      val r = readBTSRootDeclarationT(F)
      return r
    }

    def readBTSRootDeclarationT(typeParsed: B): BTSRootDeclaration = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSRootDeclaration)
      }
      val base = reader.readB()
      val formula = reader.readOption(readBTSUnitFormula _)
      val kindWords = reader.readISZ(readName _)
      val unitName = readBTSUnitName()
      val factors = reader.readISZ(readBTSUnitFactor _)
      return BTSRootDeclaration(base, formula, kindWords, unitName, factors)
    }

    def readBTSUnitExtension(): BTSUnitExtension = {
      val r = readBTSUnitExtensionT(F)
      return r
    }

    def readBTSUnitExtensionT(typeParsed: B): BTSUnitExtension = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSUnitExtension)
      }
      val root = readBTSUnitName()
      val factors = reader.readISZ(readBTSUnitFactor _)
      return BTSUnitExtension(root, factors)
    }

    def readBTSUnitName(): BTSUnitName = {
      val r = readBTSUnitNameT(F)
      return r
    }

    def readBTSUnitNameT(typeParsed: B): BTSUnitName = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSUnitName)
      }
      val longname = reader.readISZ(readName _)
      val name = readName()
      return BTSUnitName(longname, name)
    }

    def readBTSUnitFormula(): BTSUnitFormula = {
      val r = readBTSUnitFormulaT(F)
      return r
    }

    def readBTSUnitFormulaT(typeParsed: B): BTSUnitFormula = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSUnitFormula)
      }
      val top = reader.readISZ(readBTSUnitName _)
      val bottom = reader.readISZ(readBTSUnitName _)
      return BTSUnitFormula(top, bottom)
    }

    def readBTSMulDivType(): BTSMulDiv.Type = {
      val r = reader.readZ()
      return BTSMulDiv.byOrdinal(r).get
    }

    def readBTSUnitFactor(): BTSUnitFactor = {
      val r = readBTSUnitFactorT(F)
      return r
    }

    def readBTSUnitFactorT(typeParsed: B): BTSUnitFactor = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSUnitFactor)
      }
      val unit = readBTSUnitName()
      val op = readBTSMulDivType()
      val factor = reader.readR()
      return BTSUnitFactor(unit, op, factor)
    }

    def readBTSQuantity(): BTSQuantity = {
      val r = readBTSQuantityT(F)
      return r
    }

    def readBTSQuantityT(typeParsed: B): BTSQuantity = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSQuantity)
      }
      val number = reader.readR()
      val unit = reader.readOption(readName _)
      val scalar = reader.readB()
      return BTSQuantity(number, unit, scalar)
    }

    def readBTSExceptionLibrary(): BTSExceptionLibrary = {
      val r = readBTSExceptionLibraryT(F)
      return r
    }

    def readBTSExceptionLibraryT(typeParsed: B): BTSExceptionLibrary = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSExceptionLibrary)
      }
      val exc = reader.readISZ(readBTSExceptionDeclaration _)
      return BTSExceptionLibrary(exc)
    }

    def readBTSExceptionDeclaration(): BTSExceptionDeclaration = {
      val r = readBTSExceptionDeclarationT(F)
      return r
    }

    def readBTSExceptionDeclarationT(typeParsed: B): BTSExceptionDeclaration = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSExceptionDeclaration)
      }
      val name = readName()
      val description = reader.readString()
      val code = reader.readOption(reader.readZ _)
      return BTSExceptionDeclaration(name, description, code)
    }

    def readTODO(): TODO = {
      val r = readTODOT(F)
      return r
    }

    def readTODOT(typeParsed: B): TODO = {
      if (!typeParsed) {
        reader.expectZ(Constants.TODO)
      }
      return TODO()
    }

    def readEmv2Annex(): Emv2Annex = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.ErrorTypeDef => val r = readErrorTypeDefT(T); return r
        case Constants.ErrorAliasDef => val r = readErrorAliasDefT(T); return r
        case Constants.ErrorTypeSetDef => val r = readErrorTypeSetDefT(T); return r
        case Constants.BehaveStateMachine => val r = readBehaveStateMachineT(T); return r
        case Constants.ErrorEvent => val r = readErrorEventT(T); return r
        case Constants.ErrorState => val r = readErrorStateT(T); return r
        case Constants.ErrorTransition => val r = readErrorTransitionT(T); return r
        case Constants.ConditionTrigger => val r = readConditionTriggerT(T); return r
        case Constants.AndCondition => val r = readAndConditionT(T); return r
        case Constants.OrCondition => val r = readOrConditionT(T); return r
        case Constants.AllCondition => val r = readAllConditionT(T); return r
        case Constants.OrMoreCondition => val r = readOrMoreConditionT(T); return r
        case Constants.OrLessCondition => val r = readOrLessConditionT(T); return r
        case Constants.Emv2Clause => val r = readEmv2ClauseT(T); return r
        case Constants.Emv2Propagation => val r = readEmv2PropagationT(T); return r
        case Constants.Emv2Flow => val r = readEmv2FlowT(T); return r
        case Constants.Emv2BehaviorSection => val r = readEmv2BehaviorSectionT(T); return r
        case Constants.ErrorPropagation => val r = readErrorPropagationT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Emv2Annex.")
          val r = readErrorPropagationT(T)
          return r
      }
    }

    def readEmv2Lib(): Emv2Lib = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Emv2Library => val r = readEmv2LibraryT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Emv2Lib.")
          val r = readEmv2LibraryT(T)
          return r
      }
    }

    def readPropagationDirectionType(): PropagationDirection.Type = {
      val r = reader.readZ()
      return PropagationDirection.byOrdinal(r).get
    }

    def readEmv2ElementRef(): Emv2ElementRef = {
      val r = readEmv2ElementRefT(F)
      return r
    }

    def readEmv2ElementRefT(typeParsed: B): Emv2ElementRef = {
      if (!typeParsed) {
        reader.expectZ(Constants.Emv2ElementRef)
      }
      val kind = readEmv2ElementKindType()
      val name = readName()
      val errorTypes = reader.readISZ(readName _)
      return Emv2ElementRef(kind, name, errorTypes)
    }

    def readEmv2ElementKindType(): Emv2ElementKind.Type = {
      val r = reader.readZ()
      return Emv2ElementKind.byOrdinal(r).get
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
      val useTypes = reader.readISZ(reader.readString _)
      val errorTypeDef = reader.readISZ(readErrorTypeDef _)
      val errorTypeSetDef = reader.readISZ(readErrorTypeSetDef _)
      val alias = reader.readISZ(readErrorAliasDef _)
      val behaveStateMachine = reader.readISZ(readBehaveStateMachine _)
      return Emv2Library(name, useTypes, errorTypeDef, errorTypeSetDef, alias, behaveStateMachine)
    }

    def readErrorKindType(): ErrorKind.Type = {
      val r = reader.readZ()
      return ErrorKind.byOrdinal(r).get
    }

    def readErrorTypeDef(): ErrorTypeDef = {
      val r = readErrorTypeDefT(F)
      return r
    }

    def readErrorTypeDefT(typeParsed: B): ErrorTypeDef = {
      if (!typeParsed) {
        reader.expectZ(Constants.ErrorTypeDef)
      }
      val id = readName()
      val extendType = reader.readOption(readName _)
      val uriFrag = reader.readString()
      return ErrorTypeDef(id, extendType, uriFrag)
    }

    def readErrorAliasDef(): ErrorAliasDef = {
      val r = readErrorAliasDefT(F)
      return r
    }

    def readErrorAliasDefT(typeParsed: B): ErrorAliasDef = {
      if (!typeParsed) {
        reader.expectZ(Constants.ErrorAliasDef)
      }
      val errorType = readName()
      val aliseType = readName()
      return ErrorAliasDef(errorType, aliseType)
    }

    def readErrorTypeSetDef(): ErrorTypeSetDef = {
      val r = readErrorTypeSetDefT(F)
      return r
    }

    def readErrorTypeSetDefT(typeParsed: B): ErrorTypeSetDef = {
      if (!typeParsed) {
        reader.expectZ(Constants.ErrorTypeSetDef)
      }
      val id = readName()
      val errorTypes = reader.readISZ(readName _)
      return ErrorTypeSetDef(id, errorTypes)
    }

    def readBehaveStateMachine(): BehaveStateMachine = {
      val r = readBehaveStateMachineT(F)
      return r
    }

    def readBehaveStateMachineT(typeParsed: B): BehaveStateMachine = {
      if (!typeParsed) {
        reader.expectZ(Constants.BehaveStateMachine)
      }
      val id = readName()
      val events = reader.readISZ(readErrorEvent _)
      val states = reader.readISZ(readErrorState _)
      val transitions = reader.readISZ(readErrorTransition _)
      val properties = reader.readISZ(readProperty _)
      return BehaveStateMachine(id, events, states, transitions, properties)
    }

    def readErrorEvent(): ErrorEvent = {
      val r = readErrorEventT(F)
      return r
    }

    def readErrorEventT(typeParsed: B): ErrorEvent = {
      if (!typeParsed) {
        reader.expectZ(Constants.ErrorEvent)
      }
      val id = readName()
      return ErrorEvent(id)
    }

    def readErrorState(): ErrorState = {
      val r = readErrorStateT(F)
      return r
    }

    def readErrorStateT(typeParsed: B): ErrorState = {
      if (!typeParsed) {
        reader.expectZ(Constants.ErrorState)
      }
      val id = readName()
      val isInitial = reader.readB()
      return ErrorState(id, isInitial)
    }

    def readErrorTransition(): ErrorTransition = {
      val r = readErrorTransitionT(F)
      return r
    }

    def readErrorTransitionT(typeParsed: B): ErrorTransition = {
      if (!typeParsed) {
        reader.expectZ(Constants.ErrorTransition)
      }
      val id = reader.readOption(readName _)
      val sourceState = readName()
      val condition = readErrorCondition()
      val targetState = readName()
      return ErrorTransition(id, sourceState, condition, targetState)
    }

    def readErrorCondition(): ErrorCondition = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.ConditionTrigger => val r = readConditionTriggerT(T); return r
        case Constants.AndCondition => val r = readAndConditionT(T); return r
        case Constants.OrCondition => val r = readOrConditionT(T); return r
        case Constants.AllCondition => val r = readAllConditionT(T); return r
        case Constants.OrMoreCondition => val r = readOrMoreConditionT(T); return r
        case Constants.OrLessCondition => val r = readOrLessConditionT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of ErrorCondition.")
          val r = readOrLessConditionT(T)
          return r
      }
    }

    def readConditionTrigger(): ConditionTrigger = {
      val r = readConditionTriggerT(F)
      return r
    }

    def readConditionTriggerT(typeParsed: B): ConditionTrigger = {
      if (!typeParsed) {
        reader.expectZ(Constants.ConditionTrigger)
      }
      val events = reader.readISZ(readName _)
      val propagationPoints = reader.readISZ(readEmv2Propagation _)
      return ConditionTrigger(events, propagationPoints)
    }

    def readAndCondition(): AndCondition = {
      val r = readAndConditionT(F)
      return r
    }

    def readAndConditionT(typeParsed: B): AndCondition = {
      if (!typeParsed) {
        reader.expectZ(Constants.AndCondition)
      }
      val op = reader.readISZ(readErrorCondition _)
      return AndCondition(op)
    }

    def readOrCondition(): OrCondition = {
      val r = readOrConditionT(F)
      return r
    }

    def readOrConditionT(typeParsed: B): OrCondition = {
      if (!typeParsed) {
        reader.expectZ(Constants.OrCondition)
      }
      val op = reader.readISZ(readErrorCondition _)
      return OrCondition(op)
    }

    def readAllCondition(): AllCondition = {
      val r = readAllConditionT(F)
      return r
    }

    def readAllConditionT(typeParsed: B): AllCondition = {
      if (!typeParsed) {
        reader.expectZ(Constants.AllCondition)
      }
      val op = reader.readISZ(readErrorCondition _)
      return AllCondition(op)
    }

    def readOrMoreCondition(): OrMoreCondition = {
      val r = readOrMoreConditionT(F)
      return r
    }

    def readOrMoreConditionT(typeParsed: B): OrMoreCondition = {
      if (!typeParsed) {
        reader.expectZ(Constants.OrMoreCondition)
      }
      val number = reader.readZ()
      val conditions = reader.readISZ(readErrorCondition _)
      return OrMoreCondition(number, conditions)
    }

    def readOrLessCondition(): OrLessCondition = {
      val r = readOrLessConditionT(F)
      return r
    }

    def readOrLessConditionT(typeParsed: B): OrLessCondition = {
      if (!typeParsed) {
        reader.expectZ(Constants.OrLessCondition)
      }
      val number = reader.readZ()
      val conditions = reader.readISZ(readErrorCondition _)
      return OrLessCondition(number, conditions)
    }

    def readEmv2Clause(): Emv2Clause = {
      val r = readEmv2ClauseT(F)
      return r
    }

    def readEmv2ClauseT(typeParsed: B): Emv2Clause = {
      if (!typeParsed) {
        reader.expectZ(Constants.Emv2Clause)
      }
      val libraries = reader.readISZ(readName _)
      val propagations = reader.readISZ(readEmv2Propagation _)
      val flows = reader.readISZ(readEmv2Flow _)
      val componentBehavior = reader.readOption(readEmv2BehaviorSection _)
      val properties = reader.readISZ(readProperty _)
      return Emv2Clause(libraries, propagations, flows, componentBehavior, properties)
    }

    def readEmv2Propagation(): Emv2Propagation = {
      val r = readEmv2PropagationT(F)
      return r
    }

    def readEmv2PropagationT(typeParsed: B): Emv2Propagation = {
      if (!typeParsed) {
        reader.expectZ(Constants.Emv2Propagation)
      }
      val direction = readPropagationDirectionType()
      val propagationPoint = readName()
      val errorTokens = reader.readISZ(readName _)
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
      val kind = readFlowKindType()
      val sourcePropagation = reader.readOption(readEmv2Propagation _)
      val sinkPropagation = reader.readOption(readEmv2Propagation _)
      val uriFrag = reader.readString()
      return Emv2Flow(identifier, kind, sourcePropagation, sinkPropagation, uriFrag)
    }

    def readEmv2BehaviorSection(): Emv2BehaviorSection = {
      val r = readEmv2BehaviorSectionT(F)
      return r
    }

    def readEmv2BehaviorSectionT(typeParsed: B): Emv2BehaviorSection = {
      if (!typeParsed) {
        reader.expectZ(Constants.Emv2BehaviorSection)
      }
      val events = reader.readISZ(readErrorEvent _)
      val transitions = reader.readISZ(readErrorTransition _)
      val propagations = reader.readISZ(readErrorPropagation _)
      return Emv2BehaviorSection(events, transitions, propagations)
    }

    def readErrorPropagation(): ErrorPropagation = {
      val r = readErrorPropagationT(F)
      return r
    }

    def readErrorPropagationT(typeParsed: B): ErrorPropagation = {
      if (!typeParsed) {
        reader.expectZ(Constants.ErrorPropagation)
      }
      val id = reader.readOption(readName _)
      val source = reader.readISZ(readName _)
      val condition = reader.readOption(readErrorCondition _)
      val target = reader.readISZ(readEmv2Propagation _)
      return ErrorPropagation(id, source, condition, target)
    }

    def readSmfAnnex(): SmfAnnex = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.SmfClause => val r = readSmfClauseT(T); return r
        case Constants.SmfClassification => val r = readSmfClassificationT(T); return r
        case Constants.SmfDeclass => val r = readSmfDeclassT(T); return r
        case Constants.SmfType => val r = readSmfTypeT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of SmfAnnex.")
          val r = readSmfTypeT(T)
          return r
      }
    }

    def readSmfLib(): SmfLib = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.SmfLibrary => val r = readSmfLibraryT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of SmfLib.")
          val r = readSmfLibraryT(T)
          return r
      }
    }

    def readSmfClause(): SmfClause = {
      val r = readSmfClauseT(F)
      return r
    }

    def readSmfClauseT(typeParsed: B): SmfClause = {
      if (!typeParsed) {
        reader.expectZ(Constants.SmfClause)
      }
      val classification = reader.readISZ(readSmfClassification _)
      val declass = reader.readISZ(readSmfDeclass _)
      return SmfClause(classification, declass)
    }

    def readSmfClassification(): SmfClassification = {
      val r = readSmfClassificationT(F)
      return r
    }

    def readSmfClassificationT(typeParsed: B): SmfClassification = {
      if (!typeParsed) {
        reader.expectZ(Constants.SmfClassification)
      }
      val portName = readName()
      val typeName = readName()
      return SmfClassification(portName, typeName)
    }

    def readSmfDeclass(): SmfDeclass = {
      val r = readSmfDeclassT(F)
      return r
    }

    def readSmfDeclassT(typeParsed: B): SmfDeclass = {
      if (!typeParsed) {
        reader.expectZ(Constants.SmfDeclass)
      }
      val flowName = readName()
      val srcType = reader.readOption(readName _)
      val snkType = readName()
      return SmfDeclass(flowName, srcType, snkType)
    }

    def readSmfLibrary(): SmfLibrary = {
      val r = readSmfLibraryT(F)
      return r
    }

    def readSmfLibraryT(typeParsed: B): SmfLibrary = {
      if (!typeParsed) {
        reader.expectZ(Constants.SmfLibrary)
      }
      val types = reader.readISZ(readSmfType _)
      return SmfLibrary(types)
    }

    def readSmfType(): SmfType = {
      val r = readSmfTypeT(F)
      return r
    }

    def readSmfTypeT(typeParsed: B): SmfType = {
      if (!typeParsed) {
        reader.expectZ(Constants.SmfType)
      }
      val typeName = readName()
      val parentType = reader.readISZ(readName _)
      return SmfType(typeName, parentType)
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

  def fromAadlInstInfo(o: AadlInstInfo, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeAadlInstInfo(o)
    return w.result
  }

  def toAadlInstInfo(data: ISZ[U8]): Either[AadlInstInfo, MessagePack.ErrorMsg] = {
    def fAadlInstInfo(reader: Reader): AadlInstInfo = {
      val r = reader.readAadlInstInfo()
      return r
    }
    val r = to(data, fAadlInstInfo _)
    return r
  }

  def fromAadl(o: Aadl, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeAadl(o)
    return w.result
  }

  def toAadl(data: ISZ[U8]): Either[Aadl, MessagePack.ErrorMsg] = {
    def fAadl(reader: Reader): Aadl = {
      val r = reader.readAadl()
      return r
    }
    val r = to(data, fAadl _)
    return r
  }

  def fromName(o: Name, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeName(o)
    return w.result
  }

  def toName(data: ISZ[U8]): Either[Name, MessagePack.ErrorMsg] = {
    def fName(reader: Reader): Name = {
      val r = reader.readName()
      return r
    }
    val r = to(data, fName _)
    return r
  }

  def fromComponent(o: Component, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeComponent(o)
    return w.result
  }

  def toComponent(data: ISZ[U8]): Either[Component, MessagePack.ErrorMsg] = {
    def fComponent(reader: Reader): Component = {
      val r = reader.readComponent()
      return r
    }
    val r = to(data, fComponent _)
    return r
  }

  def fromClassifier(o: Classifier, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeClassifier(o)
    return w.result
  }

  def toClassifier(data: ISZ[U8]): Either[Classifier, MessagePack.ErrorMsg] = {
    def fClassifier(reader: Reader): Classifier = {
      val r = reader.readClassifier()
      return r
    }
    val r = to(data, fClassifier _)
    return r
  }

  def fromFeature(o: Feature, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFeature(o)
    return w.result
  }

  def toFeature(data: ISZ[U8]): Either[Feature, MessagePack.ErrorMsg] = {
    def fFeature(reader: Reader): Feature = {
      val r = reader.readFeature()
      return r
    }
    val r = to(data, fFeature _)
    return r
  }

  def fromFeatureEnd(o: FeatureEnd, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFeatureEnd(o)
    return w.result
  }

  def toFeatureEnd(data: ISZ[U8]): Either[FeatureEnd, MessagePack.ErrorMsg] = {
    def fFeatureEnd(reader: Reader): FeatureEnd = {
      val r = reader.readFeatureEnd()
      return r
    }
    val r = to(data, fFeatureEnd _)
    return r
  }

  def fromFeatureGroup(o: FeatureGroup, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFeatureGroup(o)
    return w.result
  }

  def toFeatureGroup(data: ISZ[U8]): Either[FeatureGroup, MessagePack.ErrorMsg] = {
    def fFeatureGroup(reader: Reader): FeatureGroup = {
      val r = reader.readFeatureGroup()
      return r
    }
    val r = to(data, fFeatureGroup _)
    return r
  }

  def fromFeatureAccess(o: FeatureAccess, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFeatureAccess(o)
    return w.result
  }

  def toFeatureAccess(data: ISZ[U8]): Either[FeatureAccess, MessagePack.ErrorMsg] = {
    def fFeatureAccess(reader: Reader): FeatureAccess = {
      val r = reader.readFeatureAccess()
      return r
    }
    val r = to(data, fFeatureAccess _)
    return r
  }

  def fromConnection(o: Connection, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeConnection(o)
    return w.result
  }

  def toConnection(data: ISZ[U8]): Either[Connection, MessagePack.ErrorMsg] = {
    def fConnection(reader: Reader): Connection = {
      val r = reader.readConnection()
      return r
    }
    val r = to(data, fConnection _)
    return r
  }

  def fromConnectionInstance(o: ConnectionInstance, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeConnectionInstance(o)
    return w.result
  }

  def toConnectionInstance(data: ISZ[U8]): Either[ConnectionInstance, MessagePack.ErrorMsg] = {
    def fConnectionInstance(reader: Reader): ConnectionInstance = {
      val r = reader.readConnectionInstance()
      return r
    }
    val r = to(data, fConnectionInstance _)
    return r
  }

  def fromConnectionReference(o: ConnectionReference, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeConnectionReference(o)
    return w.result
  }

  def toConnectionReference(data: ISZ[U8]): Either[ConnectionReference, MessagePack.ErrorMsg] = {
    def fConnectionReference(reader: Reader): ConnectionReference = {
      val r = reader.readConnectionReference()
      return r
    }
    val r = to(data, fConnectionReference _)
    return r
  }

  def fromEndPoint(o: EndPoint, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEndPoint(o)
    return w.result
  }

  def toEndPoint(data: ISZ[U8]): Either[EndPoint, MessagePack.ErrorMsg] = {
    def fEndPoint(reader: Reader): EndPoint = {
      val r = reader.readEndPoint()
      return r
    }
    val r = to(data, fEndPoint _)
    return r
  }

  def fromProperty(o: Property, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProperty(o)
    return w.result
  }

  def toProperty(data: ISZ[U8]): Either[Property, MessagePack.ErrorMsg] = {
    def fProperty(reader: Reader): Property = {
      val r = reader.readProperty()
      return r
    }
    val r = to(data, fProperty _)
    return r
  }

  def fromElementRef(o: ElementRef, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeElementRef(o)
    return w.result
  }

  def toElementRef(data: ISZ[U8]): Either[ElementRef, MessagePack.ErrorMsg] = {
    def fElementRef(reader: Reader): ElementRef = {
      val r = reader.readElementRef()
      return r
    }
    val r = to(data, fElementRef _)
    return r
  }

  def fromAadlElementRef(o: AadlElementRef, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeAadlElementRef(o)
    return w.result
  }

  def toAadlElementRef(data: ISZ[U8]): Either[AadlElementRef, MessagePack.ErrorMsg] = {
    def fAadlElementRef(reader: Reader): AadlElementRef = {
      val r = reader.readAadlElementRef()
      return r
    }
    val r = to(data, fAadlElementRef _)
    return r
  }

  def fromPropertyValue(o: PropertyValue, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePropertyValue(o)
    return w.result
  }

  def toPropertyValue(data: ISZ[U8]): Either[PropertyValue, MessagePack.ErrorMsg] = {
    def fPropertyValue(reader: Reader): PropertyValue = {
      val r = reader.readPropertyValue()
      return r
    }
    val r = to(data, fPropertyValue _)
    return r
  }

  def fromClassifierProp(o: ClassifierProp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeClassifierProp(o)
    return w.result
  }

  def toClassifierProp(data: ISZ[U8]): Either[ClassifierProp, MessagePack.ErrorMsg] = {
    def fClassifierProp(reader: Reader): ClassifierProp = {
      val r = reader.readClassifierProp()
      return r
    }
    val r = to(data, fClassifierProp _)
    return r
  }

  def fromRangeProp(o: RangeProp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeRangeProp(o)
    return w.result
  }

  def toRangeProp(data: ISZ[U8]): Either[RangeProp, MessagePack.ErrorMsg] = {
    def fRangeProp(reader: Reader): RangeProp = {
      val r = reader.readRangeProp()
      return r
    }
    val r = to(data, fRangeProp _)
    return r
  }

  def fromRecordProp(o: RecordProp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeRecordProp(o)
    return w.result
  }

  def toRecordProp(data: ISZ[U8]): Either[RecordProp, MessagePack.ErrorMsg] = {
    def fRecordProp(reader: Reader): RecordProp = {
      val r = reader.readRecordProp()
      return r
    }
    val r = to(data, fRecordProp _)
    return r
  }

  def fromReferenceProp(o: ReferenceProp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeReferenceProp(o)
    return w.result
  }

  def toReferenceProp(data: ISZ[U8]): Either[ReferenceProp, MessagePack.ErrorMsg] = {
    def fReferenceProp(reader: Reader): ReferenceProp = {
      val r = reader.readReferenceProp()
      return r
    }
    val r = to(data, fReferenceProp _)
    return r
  }

  def fromUnitProp(o: UnitProp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeUnitProp(o)
    return w.result
  }

  def toUnitProp(data: ISZ[U8]): Either[UnitProp, MessagePack.ErrorMsg] = {
    def fUnitProp(reader: Reader): UnitProp = {
      val r = reader.readUnitProp()
      return r
    }
    val r = to(data, fUnitProp _)
    return r
  }

  def fromValueProp(o: ValueProp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeValueProp(o)
    return w.result
  }

  def toValueProp(data: ISZ[U8]): Either[ValueProp, MessagePack.ErrorMsg] = {
    def fValueProp(reader: Reader): ValueProp = {
      val r = reader.readValueProp()
      return r
    }
    val r = to(data, fValueProp _)
    return r
  }

  def fromMode(o: Mode, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMode(o)
    return w.result
  }

  def toMode(data: ISZ[U8]): Either[Mode, MessagePack.ErrorMsg] = {
    def fMode(reader: Reader): Mode = {
      val r = reader.readMode()
      return r
    }
    val r = to(data, fMode _)
    return r
  }

  def fromFlow(o: Flow, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFlow(o)
    return w.result
  }

  def toFlow(data: ISZ[U8]): Either[Flow, MessagePack.ErrorMsg] = {
    def fFlow(reader: Reader): Flow = {
      val r = reader.readFlow()
      return r
    }
    val r = to(data, fFlow _)
    return r
  }

  def fromAnnex(o: Annex, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeAnnex(o)
    return w.result
  }

  def toAnnex(data: ISZ[U8]): Either[Annex, MessagePack.ErrorMsg] = {
    def fAnnex(reader: Reader): Annex = {
      val r = reader.readAnnex()
      return r
    }
    val r = to(data, fAnnex _)
    return r
  }

  def fromAnnexClause(o: AnnexClause, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeAnnexClause(o)
    return w.result
  }

  def toAnnexClause(data: ISZ[U8]): Either[AnnexClause, MessagePack.ErrorMsg] = {
    def fAnnexClause(reader: Reader): AnnexClause = {
      val r = reader.readAnnexClause()
      return r
    }
    val r = to(data, fAnnexClause _)
    return r
  }

  def fromAnnexLib(o: AnnexLib, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeAnnexLib(o)
    return w.result
  }

  def toAnnexLib(data: ISZ[U8]): Either[AnnexLib, MessagePack.ErrorMsg] = {
    def fAnnexLib(reader: Reader): AnnexLib = {
      val r = reader.readAnnexLib()
      return r
    }
    val r = to(data, fAnnexLib _)
    return r
  }

  def fromOtherAnnex(o: OtherAnnex, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOtherAnnex(o)
    return w.result
  }

  def toOtherAnnex(data: ISZ[U8]): Either[OtherAnnex, MessagePack.ErrorMsg] = {
    def fOtherAnnex(reader: Reader): OtherAnnex = {
      val r = reader.readOtherAnnex()
      return r
    }
    val r = to(data, fOtherAnnex _)
    return r
  }

  def fromOtherLib(o: OtherLib, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOtherLib(o)
    return w.result
  }

  def toOtherLib(data: ISZ[U8]): Either[OtherLib, MessagePack.ErrorMsg] = {
    def fOtherLib(reader: Reader): OtherLib = {
      val r = reader.readOtherLib()
      return r
    }
    val r = to(data, fOtherLib _)
    return r
  }

  def fromBLESSAnnex(o: BLESSAnnex, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBLESSAnnex(o)
    return w.result
  }

  def toBLESSAnnex(data: ISZ[U8]): Either[BLESSAnnex, MessagePack.ErrorMsg] = {
    def fBLESSAnnex(reader: Reader): BLESSAnnex = {
      val r = reader.readBLESSAnnex()
      return r
    }
    val r = to(data, fBLESSAnnex _)
    return r
  }

  def fromBTSBLESSAnnexClause(o: BTSBLESSAnnexClause, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSBLESSAnnexClause(o)
    return w.result
  }

  def toBTSBLESSAnnexClause(data: ISZ[U8]): Either[BTSBLESSAnnexClause, MessagePack.ErrorMsg] = {
    def fBTSBLESSAnnexClause(reader: Reader): BTSBLESSAnnexClause = {
      val r = reader.readBTSBLESSAnnexClause()
      return r
    }
    val r = to(data, fBTSBLESSAnnexClause _)
    return r
  }

  def fromBTSVariableDeclaration(o: BTSVariableDeclaration, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSVariableDeclaration(o)
    return w.result
  }

  def toBTSVariableDeclaration(data: ISZ[U8]): Either[BTSVariableDeclaration, MessagePack.ErrorMsg] = {
    def fBTSVariableDeclaration(reader: Reader): BTSVariableDeclaration = {
      val r = reader.readBTSVariableDeclaration()
      return r
    }
    val r = to(data, fBTSVariableDeclaration _)
    return r
  }

  def fromBTSStateDeclaration(o: BTSStateDeclaration, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSStateDeclaration(o)
    return w.result
  }

  def toBTSStateDeclaration(data: ISZ[U8]): Either[BTSStateDeclaration, MessagePack.ErrorMsg] = {
    def fBTSStateDeclaration(reader: Reader): BTSStateDeclaration = {
      val r = reader.readBTSStateDeclaration()
      return r
    }
    val r = to(data, fBTSStateDeclaration _)
    return r
  }

  def fromBTSTransition(o: BTSTransition, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSTransition(o)
    return w.result
  }

  def toBTSTransition(data: ISZ[U8]): Either[BTSTransition, MessagePack.ErrorMsg] = {
    def fBTSTransition(reader: Reader): BTSTransition = {
      val r = reader.readBTSTransition()
      return r
    }
    val r = to(data, fBTSTransition _)
    return r
  }

  def fromBTSTransitionLabel(o: BTSTransitionLabel, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSTransitionLabel(o)
    return w.result
  }

  def toBTSTransitionLabel(data: ISZ[U8]): Either[BTSTransitionLabel, MessagePack.ErrorMsg] = {
    def fBTSTransitionLabel(reader: Reader): BTSTransitionLabel = {
      val r = reader.readBTSTransitionLabel()
      return r
    }
    val r = to(data, fBTSTransitionLabel _)
    return r
  }

  def fromBTSTransitionCondition(o: BTSTransitionCondition, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSTransitionCondition(o)
    return w.result
  }

  def toBTSTransitionCondition(data: ISZ[U8]): Either[BTSTransitionCondition, MessagePack.ErrorMsg] = {
    def fBTSTransitionCondition(reader: Reader): BTSTransitionCondition = {
      val r = reader.readBTSTransitionCondition()
      return r
    }
    val r = to(data, fBTSTransitionCondition _)
    return r
  }

  def fromBTSDispatchCondition(o: BTSDispatchCondition, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSDispatchCondition(o)
    return w.result
  }

  def toBTSDispatchCondition(data: ISZ[U8]): Either[BTSDispatchCondition, MessagePack.ErrorMsg] = {
    def fBTSDispatchCondition(reader: Reader): BTSDispatchCondition = {
      val r = reader.readBTSDispatchCondition()
      return r
    }
    val r = to(data, fBTSDispatchCondition _)
    return r
  }

  def fromBTSDispatchConjunction(o: BTSDispatchConjunction, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSDispatchConjunction(o)
    return w.result
  }

  def toBTSDispatchConjunction(data: ISZ[U8]): Either[BTSDispatchConjunction, MessagePack.ErrorMsg] = {
    def fBTSDispatchConjunction(reader: Reader): BTSDispatchConjunction = {
      val r = reader.readBTSDispatchConjunction()
      return r
    }
    val r = to(data, fBTSDispatchConjunction _)
    return r
  }

  def fromBTSDispatchTrigger(o: BTSDispatchTrigger, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSDispatchTrigger(o)
    return w.result
  }

  def toBTSDispatchTrigger(data: ISZ[U8]): Either[BTSDispatchTrigger, MessagePack.ErrorMsg] = {
    def fBTSDispatchTrigger(reader: Reader): BTSDispatchTrigger = {
      val r = reader.readBTSDispatchTrigger()
      return r
    }
    val r = to(data, fBTSDispatchTrigger _)
    return r
  }

  def fromBTSDispatchTriggerStop(o: BTSDispatchTriggerStop, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSDispatchTriggerStop(o)
    return w.result
  }

  def toBTSDispatchTriggerStop(data: ISZ[U8]): Either[BTSDispatchTriggerStop, MessagePack.ErrorMsg] = {
    def fBTSDispatchTriggerStop(reader: Reader): BTSDispatchTriggerStop = {
      val r = reader.readBTSDispatchTriggerStop()
      return r
    }
    val r = to(data, fBTSDispatchTriggerStop _)
    return r
  }

  def fromBTSDispatchTriggerPort(o: BTSDispatchTriggerPort, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSDispatchTriggerPort(o)
    return w.result
  }

  def toBTSDispatchTriggerPort(data: ISZ[U8]): Either[BTSDispatchTriggerPort, MessagePack.ErrorMsg] = {
    def fBTSDispatchTriggerPort(reader: Reader): BTSDispatchTriggerPort = {
      val r = reader.readBTSDispatchTriggerPort()
      return r
    }
    val r = to(data, fBTSDispatchTriggerPort _)
    return r
  }

  def fromBTSDispatchTriggerTimeout(o: BTSDispatchTriggerTimeout, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSDispatchTriggerTimeout(o)
    return w.result
  }

  def toBTSDispatchTriggerTimeout(data: ISZ[U8]): Either[BTSDispatchTriggerTimeout, MessagePack.ErrorMsg] = {
    def fBTSDispatchTriggerTimeout(reader: Reader): BTSDispatchTriggerTimeout = {
      val r = reader.readBTSDispatchTriggerTimeout()
      return r
    }
    val r = to(data, fBTSDispatchTriggerTimeout _)
    return r
  }

  def fromBTSExecuteCondition(o: BTSExecuteCondition, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSExecuteCondition(o)
    return w.result
  }

  def toBTSExecuteCondition(data: ISZ[U8]): Either[BTSExecuteCondition, MessagePack.ErrorMsg] = {
    def fBTSExecuteCondition(reader: Reader): BTSExecuteCondition = {
      val r = reader.readBTSExecuteCondition()
      return r
    }
    val r = to(data, fBTSExecuteCondition _)
    return r
  }

  def fromBTSExecuteConditionExp(o: BTSExecuteConditionExp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSExecuteConditionExp(o)
    return w.result
  }

  def toBTSExecuteConditionExp(data: ISZ[U8]): Either[BTSExecuteConditionExp, MessagePack.ErrorMsg] = {
    def fBTSExecuteConditionExp(reader: Reader): BTSExecuteConditionExp = {
      val r = reader.readBTSExecuteConditionExp()
      return r
    }
    val r = to(data, fBTSExecuteConditionExp _)
    return r
  }

  def fromBTSExecuteConditionTimeout(o: BTSExecuteConditionTimeout, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSExecuteConditionTimeout(o)
    return w.result
  }

  def toBTSExecuteConditionTimeout(data: ISZ[U8]): Either[BTSExecuteConditionTimeout, MessagePack.ErrorMsg] = {
    def fBTSExecuteConditionTimeout(reader: Reader): BTSExecuteConditionTimeout = {
      val r = reader.readBTSExecuteConditionTimeout()
      return r
    }
    val r = to(data, fBTSExecuteConditionTimeout _)
    return r
  }

  def fromBTSExecuteConditionOtherwise(o: BTSExecuteConditionOtherwise, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSExecuteConditionOtherwise(o)
    return w.result
  }

  def toBTSExecuteConditionOtherwise(data: ISZ[U8]): Either[BTSExecuteConditionOtherwise, MessagePack.ErrorMsg] = {
    def fBTSExecuteConditionOtherwise(reader: Reader): BTSExecuteConditionOtherwise = {
      val r = reader.readBTSExecuteConditionOtherwise()
      return r
    }
    val r = to(data, fBTSExecuteConditionOtherwise _)
    return r
  }

  def fromBTSModeCondition(o: BTSModeCondition, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSModeCondition(o)
    return w.result
  }

  def toBTSModeCondition(data: ISZ[U8]): Either[BTSModeCondition, MessagePack.ErrorMsg] = {
    def fBTSModeCondition(reader: Reader): BTSModeCondition = {
      val r = reader.readBTSModeCondition()
      return r
    }
    val r = to(data, fBTSModeCondition _)
    return r
  }

  def fromBTSTriggerLogicalExpression(o: BTSTriggerLogicalExpression, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSTriggerLogicalExpression(o)
    return w.result
  }

  def toBTSTriggerLogicalExpression(data: ISZ[U8]): Either[BTSTriggerLogicalExpression, MessagePack.ErrorMsg] = {
    def fBTSTriggerLogicalExpression(reader: Reader): BTSTriggerLogicalExpression = {
      val r = reader.readBTSTriggerLogicalExpression()
      return r
    }
    val r = to(data, fBTSTriggerLogicalExpression _)
    return r
  }

  def fromBTSEventTrigger(o: BTSEventTrigger, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSEventTrigger(o)
    return w.result
  }

  def toBTSEventTrigger(data: ISZ[U8]): Either[BTSEventTrigger, MessagePack.ErrorMsg] = {
    def fBTSEventTrigger(reader: Reader): BTSEventTrigger = {
      val r = reader.readBTSEventTrigger()
      return r
    }
    val r = to(data, fBTSEventTrigger _)
    return r
  }

  def fromBTSSubcomponentPort(o: BTSSubcomponentPort, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSSubcomponentPort(o)
    return w.result
  }

  def toBTSSubcomponentPort(data: ISZ[U8]): Either[BTSSubcomponentPort, MessagePack.ErrorMsg] = {
    def fBTSSubcomponentPort(reader: Reader): BTSSubcomponentPort = {
      val r = reader.readBTSSubcomponentPort()
      return r
    }
    val r = to(data, fBTSSubcomponentPort _)
    return r
  }

  def fromBTSInternalCondition(o: BTSInternalCondition, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSInternalCondition(o)
    return w.result
  }

  def toBTSInternalCondition(data: ISZ[U8]): Either[BTSInternalCondition, MessagePack.ErrorMsg] = {
    def fBTSInternalCondition(reader: Reader): BTSInternalCondition = {
      val r = reader.readBTSInternalCondition()
      return r
    }
    val r = to(data, fBTSInternalCondition _)
    return r
  }

  def fromBTSAssertion(o: BTSAssertion, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSAssertion(o)
    return w.result
  }

  def toBTSAssertion(data: ISZ[U8]): Either[BTSAssertion, MessagePack.ErrorMsg] = {
    def fBTSAssertion(reader: Reader): BTSAssertion = {
      val r = reader.readBTSAssertion()
      return r
    }
    val r = to(data, fBTSAssertion _)
    return r
  }

  def fromBTSNamedAssertion(o: BTSNamedAssertion, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSNamedAssertion(o)
    return w.result
  }

  def toBTSNamedAssertion(data: ISZ[U8]): Either[BTSNamedAssertion, MessagePack.ErrorMsg] = {
    def fBTSNamedAssertion(reader: Reader): BTSNamedAssertion = {
      val r = reader.readBTSNamedAssertion()
      return r
    }
    val r = to(data, fBTSNamedAssertion _)
    return r
  }

  def fromBTSNamedFunction(o: BTSNamedFunction, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSNamedFunction(o)
    return w.result
  }

  def toBTSNamedFunction(data: ISZ[U8]): Either[BTSNamedFunction, MessagePack.ErrorMsg] = {
    def fBTSNamedFunction(reader: Reader): BTSNamedFunction = {
      val r = reader.readBTSNamedFunction()
      return r
    }
    val r = to(data, fBTSNamedFunction _)
    return r
  }

  def fromBTSNamedEnumeration(o: BTSNamedEnumeration, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSNamedEnumeration(o)
    return w.result
  }

  def toBTSNamedEnumeration(data: ISZ[U8]): Either[BTSNamedEnumeration, MessagePack.ErrorMsg] = {
    def fBTSNamedEnumeration(reader: Reader): BTSNamedEnumeration = {
      val r = reader.readBTSNamedEnumeration()
      return r
    }
    val r = to(data, fBTSNamedEnumeration _)
    return r
  }

  def fromBTSNamelessAssertion(o: BTSNamelessAssertion, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSNamelessAssertion(o)
    return w.result
  }

  def toBTSNamelessAssertion(data: ISZ[U8]): Either[BTSNamelessAssertion, MessagePack.ErrorMsg] = {
    def fBTSNamelessAssertion(reader: Reader): BTSNamelessAssertion = {
      val r = reader.readBTSNamelessAssertion()
      return r
    }
    val r = to(data, fBTSNamelessAssertion _)
    return r
  }

  def fromBTSNamelessFunction(o: BTSNamelessFunction, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSNamelessFunction(o)
    return w.result
  }

  def toBTSNamelessFunction(data: ISZ[U8]): Either[BTSNamelessFunction, MessagePack.ErrorMsg] = {
    def fBTSNamelessFunction(reader: Reader): BTSNamelessFunction = {
      val r = reader.readBTSNamelessFunction()
      return r
    }
    val r = to(data, fBTSNamelessFunction _)
    return r
  }

  def fromBTSNamelessEnumeration(o: BTSNamelessEnumeration, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSNamelessEnumeration(o)
    return w.result
  }

  def toBTSNamelessEnumeration(data: ISZ[U8]): Either[BTSNamelessEnumeration, MessagePack.ErrorMsg] = {
    def fBTSNamelessEnumeration(reader: Reader): BTSNamelessEnumeration = {
      val r = reader.readBTSNamelessEnumeration()
      return r
    }
    val r = to(data, fBTSNamelessEnumeration _)
    return r
  }

  def fromBTSAssertionEnumeration(o: BTSAssertionEnumeration, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSAssertionEnumeration(o)
    return w.result
  }

  def toBTSAssertionEnumeration(data: ISZ[U8]): Either[BTSAssertionEnumeration, MessagePack.ErrorMsg] = {
    def fBTSAssertionEnumeration(reader: Reader): BTSAssertionEnumeration = {
      val r = reader.readBTSAssertionEnumeration()
      return r
    }
    val r = to(data, fBTSAssertionEnumeration _)
    return r
  }

  def fromBTSEnumerationPairs(o: BTSEnumerationPairs, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSEnumerationPairs(o)
    return w.result
  }

  def toBTSEnumerationPairs(data: ISZ[U8]): Either[BTSEnumerationPairs, MessagePack.ErrorMsg] = {
    def fBTSEnumerationPairs(reader: Reader): BTSEnumerationPairs = {
      val r = reader.readBTSEnumerationPairs()
      return r
    }
    val r = to(data, fBTSEnumerationPairs _)
    return r
  }

  def fromBTSEnumerationPair(o: BTSEnumerationPair, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSEnumerationPair(o)
    return w.result
  }

  def toBTSEnumerationPair(data: ISZ[U8]): Either[BTSEnumerationPair, MessagePack.ErrorMsg] = {
    def fBTSEnumerationPair(reader: Reader): BTSEnumerationPair = {
      val r = reader.readBTSEnumerationPair()
      return r
    }
    val r = to(data, fBTSEnumerationPair _)
    return r
  }

  def fromBTSInvocation(o: BTSInvocation, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSInvocation(o)
    return w.result
  }

  def toBTSInvocation(data: ISZ[U8]): Either[BTSInvocation, MessagePack.ErrorMsg] = {
    def fBTSInvocation(reader: Reader): BTSInvocation = {
      val r = reader.readBTSInvocation()
      return r
    }
    val r = to(data, fBTSInvocation _)
    return r
  }

  def fromBTSActualParameter(o: BTSActualParameter, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSActualParameter(o)
    return w.result
  }

  def toBTSActualParameter(data: ISZ[U8]): Either[BTSActualParameter, MessagePack.ErrorMsg] = {
    def fBTSActualParameter(reader: Reader): BTSActualParameter = {
      val r = reader.readBTSActualParameter()
      return r
    }
    val r = to(data, fBTSActualParameter _)
    return r
  }

  def fromBTSVariable(o: BTSVariable, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSVariable(o)
    return w.result
  }

  def toBTSVariable(data: ISZ[U8]): Either[BTSVariable, MessagePack.ErrorMsg] = {
    def fBTSVariable(reader: Reader): BTSVariable = {
      val r = reader.readBTSVariable()
      return r
    }
    val r = to(data, fBTSVariable _)
    return r
  }

  def fromBTSActionAnnexSubclause(o: BTSActionAnnexSubclause, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSActionAnnexSubclause(o)
    return w.result
  }

  def toBTSActionAnnexSubclause(data: ISZ[U8]): Either[BTSActionAnnexSubclause, MessagePack.ErrorMsg] = {
    def fBTSActionAnnexSubclause(reader: Reader): BTSActionAnnexSubclause = {
      val r = reader.readBTSActionAnnexSubclause()
      return r
    }
    val r = to(data, fBTSActionAnnexSubclause _)
    return r
  }

  def fromBTSBehaviorActions(o: BTSBehaviorActions, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSBehaviorActions(o)
    return w.result
  }

  def toBTSBehaviorActions(data: ISZ[U8]): Either[BTSBehaviorActions, MessagePack.ErrorMsg] = {
    def fBTSBehaviorActions(reader: Reader): BTSBehaviorActions = {
      val r = reader.readBTSBehaviorActions()
      return r
    }
    val r = to(data, fBTSBehaviorActions _)
    return r
  }

  def fromBTSAssertedAction(o: BTSAssertedAction, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSAssertedAction(o)
    return w.result
  }

  def toBTSAssertedAction(data: ISZ[U8]): Either[BTSAssertedAction, MessagePack.ErrorMsg] = {
    def fBTSAssertedAction(reader: Reader): BTSAssertedAction = {
      val r = reader.readBTSAssertedAction()
      return r
    }
    val r = to(data, fBTSAssertedAction _)
    return r
  }

  def fromBTSAction(o: BTSAction, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSAction(o)
    return w.result
  }

  def toBTSAction(data: ISZ[U8]): Either[BTSAction, MessagePack.ErrorMsg] = {
    def fBTSAction(reader: Reader): BTSAction = {
      val r = reader.readBTSAction()
      return r
    }
    val r = to(data, fBTSAction _)
    return r
  }

  def fromBTSBasicAction(o: BTSBasicAction, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSBasicAction(o)
    return w.result
  }

  def toBTSBasicAction(data: ISZ[U8]): Either[BTSBasicAction, MessagePack.ErrorMsg] = {
    def fBTSBasicAction(reader: Reader): BTSBasicAction = {
      val r = reader.readBTSBasicAction()
      return r
    }
    val r = to(data, fBTSBasicAction _)
    return r
  }

  def fromBTSSkipAction(o: BTSSkipAction, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSSkipAction(o)
    return w.result
  }

  def toBTSSkipAction(data: ISZ[U8]): Either[BTSSkipAction, MessagePack.ErrorMsg] = {
    def fBTSSkipAction(reader: Reader): BTSSkipAction = {
      val r = reader.readBTSSkipAction()
      return r
    }
    val r = to(data, fBTSSkipAction _)
    return r
  }

  def fromBTSAssignmentAction(o: BTSAssignmentAction, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSAssignmentAction(o)
    return w.result
  }

  def toBTSAssignmentAction(data: ISZ[U8]): Either[BTSAssignmentAction, MessagePack.ErrorMsg] = {
    def fBTSAssignmentAction(reader: Reader): BTSAssignmentAction = {
      val r = reader.readBTSAssignmentAction()
      return r
    }
    val r = to(data, fBTSAssignmentAction _)
    return r
  }

  def fromBTSSetMode(o: BTSSetMode, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSSetMode(o)
    return w.result
  }

  def toBTSSetMode(data: ISZ[U8]): Either[BTSSetMode, MessagePack.ErrorMsg] = {
    def fBTSSetMode(reader: Reader): BTSSetMode = {
      val r = reader.readBTSSetMode()
      return r
    }
    val r = to(data, fBTSSetMode _)
    return r
  }

  def fromBTSWhenThrow(o: BTSWhenThrow, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSWhenThrow(o)
    return w.result
  }

  def toBTSWhenThrow(data: ISZ[U8]): Either[BTSWhenThrow, MessagePack.ErrorMsg] = {
    def fBTSWhenThrow(reader: Reader): BTSWhenThrow = {
      val r = reader.readBTSWhenThrow()
      return r
    }
    val r = to(data, fBTSWhenThrow _)
    return r
  }

  def fromBTSCombinableOperation(o: BTSCombinableOperation, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSCombinableOperation(o)
    return w.result
  }

  def toBTSCombinableOperation(data: ISZ[U8]): Either[BTSCombinableOperation, MessagePack.ErrorMsg] = {
    def fBTSCombinableOperation(reader: Reader): BTSCombinableOperation = {
      val r = reader.readBTSCombinableOperation()
      return r
    }
    val r = to(data, fBTSCombinableOperation _)
    return r
  }

  def fromBTSFetchAdd(o: BTSFetchAdd, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSFetchAdd(o)
    return w.result
  }

  def toBTSFetchAdd(data: ISZ[U8]): Either[BTSFetchAdd, MessagePack.ErrorMsg] = {
    def fBTSFetchAdd(reader: Reader): BTSFetchAdd = {
      val r = reader.readBTSFetchAdd()
      return r
    }
    val r = to(data, fBTSFetchAdd _)
    return r
  }

  def fromBTSFetchOr(o: BTSFetchOr, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSFetchOr(o)
    return w.result
  }

  def toBTSFetchOr(data: ISZ[U8]): Either[BTSFetchOr, MessagePack.ErrorMsg] = {
    def fBTSFetchOr(reader: Reader): BTSFetchOr = {
      val r = reader.readBTSFetchOr()
      return r
    }
    val r = to(data, fBTSFetchOr _)
    return r
  }

  def fromBTSFetchAnd(o: BTSFetchAnd, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSFetchAnd(o)
    return w.result
  }

  def toBTSFetchAnd(data: ISZ[U8]): Either[BTSFetchAnd, MessagePack.ErrorMsg] = {
    def fBTSFetchAnd(reader: Reader): BTSFetchAnd = {
      val r = reader.readBTSFetchAnd()
      return r
    }
    val r = to(data, fBTSFetchAnd _)
    return r
  }

  def fromBTSFetchXor(o: BTSFetchXor, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSFetchXor(o)
    return w.result
  }

  def toBTSFetchXor(data: ISZ[U8]): Either[BTSFetchXor, MessagePack.ErrorMsg] = {
    def fBTSFetchXor(reader: Reader): BTSFetchXor = {
      val r = reader.readBTSFetchXor()
      return r
    }
    val r = to(data, fBTSFetchXor _)
    return r
  }

  def fromBTSSwap(o: BTSSwap, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSSwap(o)
    return w.result
  }

  def toBTSSwap(data: ISZ[U8]): Either[BTSSwap, MessagePack.ErrorMsg] = {
    def fBTSSwap(reader: Reader): BTSSwap = {
      val r = reader.readBTSSwap()
      return r
    }
    val r = to(data, fBTSSwap _)
    return r
  }

  def fromBTSCommunicationAction(o: BTSCommunicationAction, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSCommunicationAction(o)
    return w.result
  }

  def toBTSCommunicationAction(data: ISZ[U8]): Either[BTSCommunicationAction, MessagePack.ErrorMsg] = {
    def fBTSCommunicationAction(reader: Reader): BTSCommunicationAction = {
      val r = reader.readBTSCommunicationAction()
      return r
    }
    val r = to(data, fBTSCommunicationAction _)
    return r
  }

  def fromBTSSubprogramCallAction(o: BTSSubprogramCallAction, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSSubprogramCallAction(o)
    return w.result
  }

  def toBTSSubprogramCallAction(data: ISZ[U8]): Either[BTSSubprogramCallAction, MessagePack.ErrorMsg] = {
    def fBTSSubprogramCallAction(reader: Reader): BTSSubprogramCallAction = {
      val r = reader.readBTSSubprogramCallAction()
      return r
    }
    val r = to(data, fBTSSubprogramCallAction _)
    return r
  }

  def fromBTSFormalActual(o: BTSFormalActual, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSFormalActual(o)
    return w.result
  }

  def toBTSFormalActual(data: ISZ[U8]): Either[BTSFormalActual, MessagePack.ErrorMsg] = {
    def fBTSFormalActual(reader: Reader): BTSFormalActual = {
      val r = reader.readBTSFormalActual()
      return r
    }
    val r = to(data, fBTSFormalActual _)
    return r
  }

  def fromBTSPortOutput(o: BTSPortOutput, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSPortOutput(o)
    return w.result
  }

  def toBTSPortOutput(data: ISZ[U8]): Either[BTSPortOutput, MessagePack.ErrorMsg] = {
    def fBTSPortOutput(reader: Reader): BTSPortOutput = {
      val r = reader.readBTSPortOutput()
      return r
    }
    val r = to(data, fBTSPortOutput _)
    return r
  }

  def fromBTSPortInput(o: BTSPortInput, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSPortInput(o)
    return w.result
  }

  def toBTSPortInput(data: ISZ[U8]): Either[BTSPortInput, MessagePack.ErrorMsg] = {
    def fBTSPortInput(reader: Reader): BTSPortInput = {
      val r = reader.readBTSPortInput()
      return r
    }
    val r = to(data, fBTSPortInput _)
    return r
  }

  def fromBTSFrozenPortAction(o: BTSFrozenPortAction, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSFrozenPortAction(o)
    return w.result
  }

  def toBTSFrozenPortAction(data: ISZ[U8]): Either[BTSFrozenPortAction, MessagePack.ErrorMsg] = {
    def fBTSFrozenPortAction(reader: Reader): BTSFrozenPortAction = {
      val r = reader.readBTSFrozenPortAction()
      return r
    }
    val r = to(data, fBTSFrozenPortAction _)
    return r
  }

  def fromBTSPause(o: BTSPause, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSPause(o)
    return w.result
  }

  def toBTSPause(data: ISZ[U8]): Either[BTSPause, MessagePack.ErrorMsg] = {
    def fBTSPause(reader: Reader): BTSPause = {
      val r = reader.readBTSPause()
      return r
    }
    val r = to(data, fBTSPause _)
    return r
  }

  def fromBTSControlAction(o: BTSControlAction, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSControlAction(o)
    return w.result
  }

  def toBTSControlAction(data: ISZ[U8]): Either[BTSControlAction, MessagePack.ErrorMsg] = {
    def fBTSControlAction(reader: Reader): BTSControlAction = {
      val r = reader.readBTSControlAction()
      return r
    }
    val r = to(data, fBTSControlAction _)
    return r
  }

  def fromBTSIfBLESSAction(o: BTSIfBLESSAction, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSIfBLESSAction(o)
    return w.result
  }

  def toBTSIfBLESSAction(data: ISZ[U8]): Either[BTSIfBLESSAction, MessagePack.ErrorMsg] = {
    def fBTSIfBLESSAction(reader: Reader): BTSIfBLESSAction = {
      val r = reader.readBTSIfBLESSAction()
      return r
    }
    val r = to(data, fBTSIfBLESSAction _)
    return r
  }

  def fromBTSGuardedAction(o: BTSGuardedAction, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSGuardedAction(o)
    return w.result
  }

  def toBTSGuardedAction(data: ISZ[U8]): Either[BTSGuardedAction, MessagePack.ErrorMsg] = {
    def fBTSGuardedAction(reader: Reader): BTSGuardedAction = {
      val r = reader.readBTSGuardedAction()
      return r
    }
    val r = to(data, fBTSGuardedAction _)
    return r
  }

  def fromBTSIfBAAction(o: BTSIfBAAction, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSIfBAAction(o)
    return w.result
  }

  def toBTSIfBAAction(data: ISZ[U8]): Either[BTSIfBAAction, MessagePack.ErrorMsg] = {
    def fBTSIfBAAction(reader: Reader): BTSIfBAAction = {
      val r = reader.readBTSIfBAAction()
      return r
    }
    val r = to(data, fBTSIfBAAction _)
    return r
  }

  def fromBTSConditionalActions(o: BTSConditionalActions, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSConditionalActions(o)
    return w.result
  }

  def toBTSConditionalActions(data: ISZ[U8]): Either[BTSConditionalActions, MessagePack.ErrorMsg] = {
    def fBTSConditionalActions(reader: Reader): BTSConditionalActions = {
      val r = reader.readBTSConditionalActions()
      return r
    }
    val r = to(data, fBTSConditionalActions _)
    return r
  }

  def fromBTSWhileLoop(o: BTSWhileLoop, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSWhileLoop(o)
    return w.result
  }

  def toBTSWhileLoop(data: ISZ[U8]): Either[BTSWhileLoop, MessagePack.ErrorMsg] = {
    def fBTSWhileLoop(reader: Reader): BTSWhileLoop = {
      val r = reader.readBTSWhileLoop()
      return r
    }
    val r = to(data, fBTSWhileLoop _)
    return r
  }

  def fromBTSForLoop(o: BTSForLoop, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSForLoop(o)
    return w.result
  }

  def toBTSForLoop(data: ISZ[U8]): Either[BTSForLoop, MessagePack.ErrorMsg] = {
    def fBTSForLoop(reader: Reader): BTSForLoop = {
      val r = reader.readBTSForLoop()
      return r
    }
    val r = to(data, fBTSForLoop _)
    return r
  }

  def fromBTSDoUntilLoop(o: BTSDoUntilLoop, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSDoUntilLoop(o)
    return w.result
  }

  def toBTSDoUntilLoop(data: ISZ[U8]): Either[BTSDoUntilLoop, MessagePack.ErrorMsg] = {
    def fBTSDoUntilLoop(reader: Reader): BTSDoUntilLoop = {
      val r = reader.readBTSDoUntilLoop()
      return r
    }
    val r = to(data, fBTSDoUntilLoop _)
    return r
  }

  def fromBTSQuantificationActions(o: BTSQuantificationActions, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSQuantificationActions(o)
    return w.result
  }

  def toBTSQuantificationActions(data: ISZ[U8]): Either[BTSQuantificationActions, MessagePack.ErrorMsg] = {
    def fBTSQuantificationActions(reader: Reader): BTSQuantificationActions = {
      val r = reader.readBTSQuantificationActions()
      return r
    }
    val r = to(data, fBTSQuantificationActions _)
    return r
  }

  def fromBTSExistentialLatticeQuantification(o: BTSExistentialLatticeQuantification, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSExistentialLatticeQuantification(o)
    return w.result
  }

  def toBTSExistentialLatticeQuantification(data: ISZ[U8]): Either[BTSExistentialLatticeQuantification, MessagePack.ErrorMsg] = {
    def fBTSExistentialLatticeQuantification(reader: Reader): BTSExistentialLatticeQuantification = {
      val r = reader.readBTSExistentialLatticeQuantification()
      return r
    }
    val r = to(data, fBTSExistentialLatticeQuantification _)
    return r
  }

  def fromBTSCatchClauseTerm(o: BTSCatchClauseTerm, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSCatchClauseTerm(o)
    return w.result
  }

  def toBTSCatchClauseTerm(data: ISZ[U8]): Either[BTSCatchClauseTerm, MessagePack.ErrorMsg] = {
    def fBTSCatchClauseTerm(reader: Reader): BTSCatchClauseTerm = {
      val r = reader.readBTSCatchClauseTerm()
      return r
    }
    val r = to(data, fBTSCatchClauseTerm _)
    return r
  }

  def fromBTSUniversalLatticeQuantification(o: BTSUniversalLatticeQuantification, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSUniversalLatticeQuantification(o)
    return w.result
  }

  def toBTSUniversalLatticeQuantification(data: ISZ[U8]): Either[BTSUniversalLatticeQuantification, MessagePack.ErrorMsg] = {
    def fBTSUniversalLatticeQuantification(reader: Reader): BTSUniversalLatticeQuantification = {
      val r = reader.readBTSUniversalLatticeQuantification()
      return r
    }
    val r = to(data, fBTSUniversalLatticeQuantification _)
    return r
  }

  def fromBTSExp(o: BTSExp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSExp(o)
    return w.result
  }

  def toBTSExp(data: ISZ[U8]): Either[BTSExp, MessagePack.ErrorMsg] = {
    def fBTSExp(reader: Reader): BTSExp = {
      val r = reader.readBTSExp()
      return r
    }
    val r = to(data, fBTSExp _)
    return r
  }

  def fromBTSUnaryExp(o: BTSUnaryExp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSUnaryExp(o)
    return w.result
  }

  def toBTSUnaryExp(data: ISZ[U8]): Either[BTSUnaryExp, MessagePack.ErrorMsg] = {
    def fBTSUnaryExp(reader: Reader): BTSUnaryExp = {
      val r = reader.readBTSUnaryExp()
      return r
    }
    val r = to(data, fBTSUnaryExp _)
    return r
  }

  def fromBTSBinaryExp(o: BTSBinaryExp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSBinaryExp(o)
    return w.result
  }

  def toBTSBinaryExp(data: ISZ[U8]): Either[BTSBinaryExp, MessagePack.ErrorMsg] = {
    def fBTSBinaryExp(reader: Reader): BTSBinaryExp = {
      val r = reader.readBTSBinaryExp()
      return r
    }
    val r = to(data, fBTSBinaryExp _)
    return r
  }

  def fromBTSLiteralExp(o: BTSLiteralExp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSLiteralExp(o)
    return w.result
  }

  def toBTSLiteralExp(data: ISZ[U8]): Either[BTSLiteralExp, MessagePack.ErrorMsg] = {
    def fBTSLiteralExp(reader: Reader): BTSLiteralExp = {
      val r = reader.readBTSLiteralExp()
      return r
    }
    val r = to(data, fBTSLiteralExp _)
    return r
  }

  def fromBTSValueName(o: BTSValueName, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSValueName(o)
    return w.result
  }

  def toBTSValueName(data: ISZ[U8]): Either[BTSValueName, MessagePack.ErrorMsg] = {
    def fBTSValueName(reader: Reader): BTSValueName = {
      val r = reader.readBTSValueName()
      return r
    }
    val r = to(data, fBTSValueName _)
    return r
  }

  def fromBTSVariableNameExp(o: BTSVariableNameExp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSVariableNameExp(o)
    return w.result
  }

  def toBTSVariableNameExp(data: ISZ[U8]): Either[BTSVariableNameExp, MessagePack.ErrorMsg] = {
    def fBTSVariableNameExp(reader: Reader): BTSVariableNameExp = {
      val r = reader.readBTSVariableNameExp()
      return r
    }
    val r = to(data, fBTSVariableNameExp _)
    return r
  }

  def fromBTSPartialName(o: BTSPartialName, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSPartialName(o)
    return w.result
  }

  def toBTSPartialName(data: ISZ[U8]): Either[BTSPartialName, MessagePack.ErrorMsg] = {
    def fBTSPartialName(reader: Reader): BTSPartialName = {
      val r = reader.readBTSPartialName()
      return r
    }
    val r = to(data, fBTSPartialName _)
    return r
  }

  def fromBTSIndexingExp(o: BTSIndexingExp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSIndexingExp(o)
    return w.result
  }

  def toBTSIndexingExp(data: ISZ[U8]): Either[BTSIndexingExp, MessagePack.ErrorMsg] = {
    def fBTSIndexingExp(reader: Reader): BTSIndexingExp = {
      val r = reader.readBTSIndexingExp()
      return r
    }
    val r = to(data, fBTSIndexingExp _)
    return r
  }

  def fromBTSAccessExp(o: BTSAccessExp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSAccessExp(o)
    return w.result
  }

  def toBTSAccessExp(data: ISZ[U8]): Either[BTSAccessExp, MessagePack.ErrorMsg] = {
    def fBTSAccessExp(reader: Reader): BTSAccessExp = {
      val r = reader.readBTSAccessExp()
      return r
    }
    val r = to(data, fBTSAccessExp _)
    return r
  }

  def fromBTSFunctionCall(o: BTSFunctionCall, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSFunctionCall(o)
    return w.result
  }

  def toBTSFunctionCall(data: ISZ[U8]): Either[BTSFunctionCall, MessagePack.ErrorMsg] = {
    def fBTSFunctionCall(reader: Reader): BTSFunctionCall = {
      val r = reader.readBTSFunctionCall()
      return r
    }
    val r = to(data, fBTSFunctionCall _)
    return r
  }

  def fromBTSPortValue(o: BTSPortValue, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSPortValue(o)
    return w.result
  }

  def toBTSPortValue(data: ISZ[U8]): Either[BTSPortValue, MessagePack.ErrorMsg] = {
    def fBTSPortValue(reader: Reader): BTSPortValue = {
      val r = reader.readBTSPortValue()
      return r
    }
    val r = to(data, fBTSPortValue _)
    return r
  }

  def fromBTSConditionalExpression(o: BTSConditionalExpression, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSConditionalExpression(o)
    return w.result
  }

  def toBTSConditionalExpression(data: ISZ[U8]): Either[BTSConditionalExpression, MessagePack.ErrorMsg] = {
    def fBTSConditionalExpression(reader: Reader): BTSConditionalExpression = {
      val r = reader.readBTSConditionalExpression()
      return r
    }
    val r = to(data, fBTSConditionalExpression _)
    return r
  }

  def fromBTSTrue(o: BTSTrue, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSTrue(o)
    return w.result
  }

  def toBTSTrue(data: ISZ[U8]): Either[BTSTrue, MessagePack.ErrorMsg] = {
    def fBTSTrue(reader: Reader): BTSTrue = {
      val r = reader.readBTSTrue()
      return r
    }
    val r = to(data, fBTSTrue _)
    return r
  }

  def fromBTSFalse(o: BTSFalse, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSFalse(o)
    return w.result
  }

  def toBTSFalse(data: ISZ[U8]): Either[BTSFalse, MessagePack.ErrorMsg] = {
    def fBTSFalse(reader: Reader): BTSFalse = {
      val r = reader.readBTSFalse()
      return r
    }
    val r = to(data, fBTSFalse _)
    return r
  }

  def fromBTSNull(o: BTSNull, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSNull(o)
    return w.result
  }

  def toBTSNull(data: ISZ[U8]): Either[BTSNull, MessagePack.ErrorMsg] = {
    def fBTSNull(reader: Reader): BTSNull = {
      val r = reader.readBTSNull()
      return r
    }
    val r = to(data, fBTSNull _)
    return r
  }

  def fromBTSPropertyConstant(o: BTSPropertyConstant, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSPropertyConstant(o)
    return w.result
  }

  def toBTSPropertyConstant(data: ISZ[U8]): Either[BTSPropertyConstant, MessagePack.ErrorMsg] = {
    def fBTSPropertyConstant(reader: Reader): BTSPropertyConstant = {
      val r = reader.readBTSPropertyConstant()
      return r
    }
    val r = to(data, fBTSPropertyConstant _)
    return r
  }

  def fromBTSPropertyReference(o: BTSPropertyReference, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSPropertyReference(o)
    return w.result
  }

  def toBTSPropertyReference(data: ISZ[U8]): Either[BTSPropertyReference, MessagePack.ErrorMsg] = {
    def fBTSPropertyReference(reader: Reader): BTSPropertyReference = {
      val r = reader.readBTSPropertyReference()
      return r
    }
    val r = to(data, fBTSPropertyReference _)
    return r
  }

  def fromBTSPropertySetProperty(o: BTSPropertySetProperty, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSPropertySetProperty(o)
    return w.result
  }

  def toBTSPropertySetProperty(data: ISZ[U8]): Either[BTSPropertySetProperty, MessagePack.ErrorMsg] = {
    def fBTSPropertySetProperty(reader: Reader): BTSPropertySetProperty = {
      val r = reader.readBTSPropertySetProperty()
      return r
    }
    val r = to(data, fBTSPropertySetProperty _)
    return r
  }

  def fromBTSSelfProperty(o: BTSSelfProperty, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSSelfProperty(o)
    return w.result
  }

  def toBTSSelfProperty(data: ISZ[U8]): Either[BTSSelfProperty, MessagePack.ErrorMsg] = {
    def fBTSSelfProperty(reader: Reader): BTSSelfProperty = {
      val r = reader.readBTSSelfProperty()
      return r
    }
    val r = to(data, fBTSSelfProperty _)
    return r
  }

  def fromBTSComponentProperty(o: BTSComponentProperty, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSComponentProperty(o)
    return w.result
  }

  def toBTSComponentProperty(data: ISZ[U8]): Either[BTSComponentProperty, MessagePack.ErrorMsg] = {
    def fBTSComponentProperty(reader: Reader): BTSComponentProperty = {
      val r = reader.readBTSComponentProperty()
      return r
    }
    val r = to(data, fBTSComponentProperty _)
    return r
  }

  def fromBTSComponent(o: BTSComponent, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSComponent(o)
    return w.result
  }

  def toBTSComponent(data: ISZ[U8]): Either[BTSComponent, MessagePack.ErrorMsg] = {
    def fBTSComponent(reader: Reader): BTSComponent = {
      val r = reader.readBTSComponent()
      return r
    }
    val r = to(data, fBTSComponent _)
    return r
  }

  def fromBTSPropertyField(o: BTSPropertyField, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSPropertyField(o)
    return w.result
  }

  def toBTSPropertyField(data: ISZ[U8]): Either[BTSPropertyField, MessagePack.ErrorMsg] = {
    def fBTSPropertyField(reader: Reader): BTSPropertyField = {
      val r = reader.readBTSPropertyField()
      return r
    }
    val r = to(data, fBTSPropertyField _)
    return r
  }

  def fromBTSUniversalQuantification(o: BTSUniversalQuantification, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSUniversalQuantification(o)
    return w.result
  }

  def toBTSUniversalQuantification(data: ISZ[U8]): Either[BTSUniversalQuantification, MessagePack.ErrorMsg] = {
    def fBTSUniversalQuantification(reader: Reader): BTSUniversalQuantification = {
      val r = reader.readBTSUniversalQuantification()
      return r
    }
    val r = to(data, fBTSUniversalQuantification _)
    return r
  }

  def fromBTSExistentialQuantification(o: BTSExistentialQuantification, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSExistentialQuantification(o)
    return w.result
  }

  def toBTSExistentialQuantification(data: ISZ[U8]): Either[BTSExistentialQuantification, MessagePack.ErrorMsg] = {
    def fBTSExistentialQuantification(reader: Reader): BTSExistentialQuantification = {
      val r = reader.readBTSExistentialQuantification()
      return r
    }
    val r = to(data, fBTSExistentialQuantification _)
    return r
  }

  def fromBTSSumQuantification(o: BTSSumQuantification, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSSumQuantification(o)
    return w.result
  }

  def toBTSSumQuantification(data: ISZ[U8]): Either[BTSSumQuantification, MessagePack.ErrorMsg] = {
    def fBTSSumQuantification(reader: Reader): BTSSumQuantification = {
      val r = reader.readBTSSumQuantification()
      return r
    }
    val r = to(data, fBTSSumQuantification _)
    return r
  }

  def fromBTSProductQuantification(o: BTSProductQuantification, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSProductQuantification(o)
    return w.result
  }

  def toBTSProductQuantification(data: ISZ[U8]): Either[BTSProductQuantification, MessagePack.ErrorMsg] = {
    def fBTSProductQuantification(reader: Reader): BTSProductQuantification = {
      val r = reader.readBTSProductQuantification()
      return r
    }
    val r = to(data, fBTSProductQuantification _)
    return r
  }

  def fromBTSCountingQuantification(o: BTSCountingQuantification, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSCountingQuantification(o)
    return w.result
  }

  def toBTSCountingQuantification(data: ISZ[U8]): Either[BTSCountingQuantification, MessagePack.ErrorMsg] = {
    def fBTSCountingQuantification(reader: Reader): BTSCountingQuantification = {
      val r = reader.readBTSCountingQuantification()
      return r
    }
    val r = to(data, fBTSCountingQuantification _)
    return r
  }

  def fromBTSRange(o: BTSRange, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSRange(o)
    return w.result
  }

  def toBTSRange(data: ISZ[U8]): Either[BTSRange, MessagePack.ErrorMsg] = {
    def fBTSRange(reader: Reader): BTSRange = {
      val r = reader.readBTSRange()
      return r
    }
    val r = to(data, fBTSRange _)
    return r
  }

  def fromBTSTypeLibrary(o: BTSTypeLibrary, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSTypeLibrary(o)
    return w.result
  }

  def toBTSTypeLibrary(data: ISZ[U8]): Either[BTSTypeLibrary, MessagePack.ErrorMsg] = {
    def fBTSTypeLibrary(reader: Reader): BTSTypeLibrary = {
      val r = reader.readBTSTypeLibrary()
      return r
    }
    val r = to(data, fBTSTypeLibrary _)
    return r
  }

  def fromBTSTypeDeclatation(o: BTSTypeDeclatation, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSTypeDeclatation(o)
    return w.result
  }

  def toBTSTypeDeclatation(data: ISZ[U8]): Either[BTSTypeDeclatation, MessagePack.ErrorMsg] = {
    def fBTSTypeDeclatation(reader: Reader): BTSTypeDeclatation = {
      val r = reader.readBTSTypeDeclatation()
      return r
    }
    val r = to(data, fBTSTypeDeclatation _)
    return r
  }

  def fromBTSType(o: BTSType, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSType(o)
    return w.result
  }

  def toBTSType(data: ISZ[U8]): Either[BTSType, MessagePack.ErrorMsg] = {
    def fBTSType(reader: Reader): BTSType = {
      val r = reader.readBTSType()
      return r
    }
    val r = to(data, fBTSType _)
    return r
  }

  def fromBTSBooleanType(o: BTSBooleanType, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSBooleanType(o)
    return w.result
  }

  def toBTSBooleanType(data: ISZ[U8]): Either[BTSBooleanType, MessagePack.ErrorMsg] = {
    def fBTSBooleanType(reader: Reader): BTSBooleanType = {
      val r = reader.readBTSBooleanType()
      return r
    }
    val r = to(data, fBTSBooleanType _)
    return r
  }

  def fromBTSStringType(o: BTSStringType, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSStringType(o)
    return w.result
  }

  def toBTSStringType(data: ISZ[U8]): Either[BTSStringType, MessagePack.ErrorMsg] = {
    def fBTSStringType(reader: Reader): BTSStringType = {
      val r = reader.readBTSStringType()
      return r
    }
    val r = to(data, fBTSStringType _)
    return r
  }

  def fromBTSNullType(o: BTSNullType, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSNullType(o)
    return w.result
  }

  def toBTSNullType(data: ISZ[U8]): Either[BTSNullType, MessagePack.ErrorMsg] = {
    def fBTSNullType(reader: Reader): BTSNullType = {
      val r = reader.readBTSNullType()
      return r
    }
    val r = to(data, fBTSNullType _)
    return r
  }

  def fromBTSClassifier(o: BTSClassifier, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSClassifier(o)
    return w.result
  }

  def toBTSClassifier(data: ISZ[U8]): Either[BTSClassifier, MessagePack.ErrorMsg] = {
    def fBTSClassifier(reader: Reader): BTSClassifier = {
      val r = reader.readBTSClassifier()
      return r
    }
    val r = to(data, fBTSClassifier _)
    return r
  }

  def fromBTSTypeName(o: BTSTypeName, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSTypeName(o)
    return w.result
  }

  def toBTSTypeName(data: ISZ[U8]): Either[BTSTypeName, MessagePack.ErrorMsg] = {
    def fBTSTypeName(reader: Reader): BTSTypeName = {
      val r = reader.readBTSTypeName()
      return r
    }
    val r = to(data, fBTSTypeName _)
    return r
  }

  def fromBTSEnumerationType(o: BTSEnumerationType, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSEnumerationType(o)
    return w.result
  }

  def toBTSEnumerationType(data: ISZ[U8]): Either[BTSEnumerationType, MessagePack.ErrorMsg] = {
    def fBTSEnumerationType(reader: Reader): BTSEnumerationType = {
      val r = reader.readBTSEnumerationType()
      return r
    }
    val r = to(data, fBTSEnumerationType _)
    return r
  }

  def fromBTSQuantityType(o: BTSQuantityType, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSQuantityType(o)
    return w.result
  }

  def toBTSQuantityType(data: ISZ[U8]): Either[BTSQuantityType, MessagePack.ErrorMsg] = {
    def fBTSQuantityType(reader: Reader): BTSQuantityType = {
      val r = reader.readBTSQuantityType()
      return r
    }
    val r = to(data, fBTSQuantityType _)
    return r
  }

  def fromBTSArrayType(o: BTSArrayType, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSArrayType(o)
    return w.result
  }

  def toBTSArrayType(data: ISZ[U8]): Either[BTSArrayType, MessagePack.ErrorMsg] = {
    def fBTSArrayType(reader: Reader): BTSArrayType = {
      val r = reader.readBTSArrayType()
      return r
    }
    val r = to(data, fBTSArrayType _)
    return r
  }

  def fromBTSArrayRange(o: BTSArrayRange, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSArrayRange(o)
    return w.result
  }

  def toBTSArrayRange(data: ISZ[U8]): Either[BTSArrayRange, MessagePack.ErrorMsg] = {
    def fBTSArrayRange(reader: Reader): BTSArrayRange = {
      val r = reader.readBTSArrayRange()
      return r
    }
    val r = to(data, fBTSArrayRange _)
    return r
  }

  def fromBTSRecordType(o: BTSRecordType, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSRecordType(o)
    return w.result
  }

  def toBTSRecordType(data: ISZ[U8]): Either[BTSRecordType, MessagePack.ErrorMsg] = {
    def fBTSRecordType(reader: Reader): BTSRecordType = {
      val r = reader.readBTSRecordType()
      return r
    }
    val r = to(data, fBTSRecordType _)
    return r
  }

  def fromBTSRecordField(o: BTSRecordField, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSRecordField(o)
    return w.result
  }

  def toBTSRecordField(data: ISZ[U8]): Either[BTSRecordField, MessagePack.ErrorMsg] = {
    def fBTSRecordField(reader: Reader): BTSRecordField = {
      val r = reader.readBTSRecordField()
      return r
    }
    val r = to(data, fBTSRecordField _)
    return r
  }

  def fromBTSUnitLibrary(o: BTSUnitLibrary, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSUnitLibrary(o)
    return w.result
  }

  def toBTSUnitLibrary(data: ISZ[U8]): Either[BTSUnitLibrary, MessagePack.ErrorMsg] = {
    def fBTSUnitLibrary(reader: Reader): BTSUnitLibrary = {
      val r = reader.readBTSUnitLibrary()
      return r
    }
    val r = to(data, fBTSUnitLibrary _)
    return r
  }

  def fromBTSUnitDeclaration(o: BTSUnitDeclaration, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSUnitDeclaration(o)
    return w.result
  }

  def toBTSUnitDeclaration(data: ISZ[U8]): Either[BTSUnitDeclaration, MessagePack.ErrorMsg] = {
    def fBTSUnitDeclaration(reader: Reader): BTSUnitDeclaration = {
      val r = reader.readBTSUnitDeclaration()
      return r
    }
    val r = to(data, fBTSUnitDeclaration _)
    return r
  }

  def fromBTSRootDeclaration(o: BTSRootDeclaration, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSRootDeclaration(o)
    return w.result
  }

  def toBTSRootDeclaration(data: ISZ[U8]): Either[BTSRootDeclaration, MessagePack.ErrorMsg] = {
    def fBTSRootDeclaration(reader: Reader): BTSRootDeclaration = {
      val r = reader.readBTSRootDeclaration()
      return r
    }
    val r = to(data, fBTSRootDeclaration _)
    return r
  }

  def fromBTSUnitExtension(o: BTSUnitExtension, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSUnitExtension(o)
    return w.result
  }

  def toBTSUnitExtension(data: ISZ[U8]): Either[BTSUnitExtension, MessagePack.ErrorMsg] = {
    def fBTSUnitExtension(reader: Reader): BTSUnitExtension = {
      val r = reader.readBTSUnitExtension()
      return r
    }
    val r = to(data, fBTSUnitExtension _)
    return r
  }

  def fromBTSUnitName(o: BTSUnitName, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSUnitName(o)
    return w.result
  }

  def toBTSUnitName(data: ISZ[U8]): Either[BTSUnitName, MessagePack.ErrorMsg] = {
    def fBTSUnitName(reader: Reader): BTSUnitName = {
      val r = reader.readBTSUnitName()
      return r
    }
    val r = to(data, fBTSUnitName _)
    return r
  }

  def fromBTSUnitFormula(o: BTSUnitFormula, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSUnitFormula(o)
    return w.result
  }

  def toBTSUnitFormula(data: ISZ[U8]): Either[BTSUnitFormula, MessagePack.ErrorMsg] = {
    def fBTSUnitFormula(reader: Reader): BTSUnitFormula = {
      val r = reader.readBTSUnitFormula()
      return r
    }
    val r = to(data, fBTSUnitFormula _)
    return r
  }

  def fromBTSUnitFactor(o: BTSUnitFactor, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSUnitFactor(o)
    return w.result
  }

  def toBTSUnitFactor(data: ISZ[U8]): Either[BTSUnitFactor, MessagePack.ErrorMsg] = {
    def fBTSUnitFactor(reader: Reader): BTSUnitFactor = {
      val r = reader.readBTSUnitFactor()
      return r
    }
    val r = to(data, fBTSUnitFactor _)
    return r
  }

  def fromBTSQuantity(o: BTSQuantity, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSQuantity(o)
    return w.result
  }

  def toBTSQuantity(data: ISZ[U8]): Either[BTSQuantity, MessagePack.ErrorMsg] = {
    def fBTSQuantity(reader: Reader): BTSQuantity = {
      val r = reader.readBTSQuantity()
      return r
    }
    val r = to(data, fBTSQuantity _)
    return r
  }

  def fromBTSExceptionLibrary(o: BTSExceptionLibrary, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSExceptionLibrary(o)
    return w.result
  }

  def toBTSExceptionLibrary(data: ISZ[U8]): Either[BTSExceptionLibrary, MessagePack.ErrorMsg] = {
    def fBTSExceptionLibrary(reader: Reader): BTSExceptionLibrary = {
      val r = reader.readBTSExceptionLibrary()
      return r
    }
    val r = to(data, fBTSExceptionLibrary _)
    return r
  }

  def fromBTSExceptionDeclaration(o: BTSExceptionDeclaration, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSExceptionDeclaration(o)
    return w.result
  }

  def toBTSExceptionDeclaration(data: ISZ[U8]): Either[BTSExceptionDeclaration, MessagePack.ErrorMsg] = {
    def fBTSExceptionDeclaration(reader: Reader): BTSExceptionDeclaration = {
      val r = reader.readBTSExceptionDeclaration()
      return r
    }
    val r = to(data, fBTSExceptionDeclaration _)
    return r
  }

  def fromTODO(o: TODO, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTODO(o)
    return w.result
  }

  def toTODO(data: ISZ[U8]): Either[TODO, MessagePack.ErrorMsg] = {
    def fTODO(reader: Reader): TODO = {
      val r = reader.readTODO()
      return r
    }
    val r = to(data, fTODO _)
    return r
  }

  def fromEmv2Annex(o: Emv2Annex, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEmv2Annex(o)
    return w.result
  }

  def toEmv2Annex(data: ISZ[U8]): Either[Emv2Annex, MessagePack.ErrorMsg] = {
    def fEmv2Annex(reader: Reader): Emv2Annex = {
      val r = reader.readEmv2Annex()
      return r
    }
    val r = to(data, fEmv2Annex _)
    return r
  }

  def fromEmv2Lib(o: Emv2Lib, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEmv2Lib(o)
    return w.result
  }

  def toEmv2Lib(data: ISZ[U8]): Either[Emv2Lib, MessagePack.ErrorMsg] = {
    def fEmv2Lib(reader: Reader): Emv2Lib = {
      val r = reader.readEmv2Lib()
      return r
    }
    val r = to(data, fEmv2Lib _)
    return r
  }

  def fromEmv2ElementRef(o: Emv2ElementRef, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEmv2ElementRef(o)
    return w.result
  }

  def toEmv2ElementRef(data: ISZ[U8]): Either[Emv2ElementRef, MessagePack.ErrorMsg] = {
    def fEmv2ElementRef(reader: Reader): Emv2ElementRef = {
      val r = reader.readEmv2ElementRef()
      return r
    }
    val r = to(data, fEmv2ElementRef _)
    return r
  }

  def fromEmv2Library(o: Emv2Library, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEmv2Library(o)
    return w.result
  }

  def toEmv2Library(data: ISZ[U8]): Either[Emv2Library, MessagePack.ErrorMsg] = {
    def fEmv2Library(reader: Reader): Emv2Library = {
      val r = reader.readEmv2Library()
      return r
    }
    val r = to(data, fEmv2Library _)
    return r
  }

  def fromErrorTypeDef(o: ErrorTypeDef, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeErrorTypeDef(o)
    return w.result
  }

  def toErrorTypeDef(data: ISZ[U8]): Either[ErrorTypeDef, MessagePack.ErrorMsg] = {
    def fErrorTypeDef(reader: Reader): ErrorTypeDef = {
      val r = reader.readErrorTypeDef()
      return r
    }
    val r = to(data, fErrorTypeDef _)
    return r
  }

  def fromErrorAliasDef(o: ErrorAliasDef, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeErrorAliasDef(o)
    return w.result
  }

  def toErrorAliasDef(data: ISZ[U8]): Either[ErrorAliasDef, MessagePack.ErrorMsg] = {
    def fErrorAliasDef(reader: Reader): ErrorAliasDef = {
      val r = reader.readErrorAliasDef()
      return r
    }
    val r = to(data, fErrorAliasDef _)
    return r
  }

  def fromErrorTypeSetDef(o: ErrorTypeSetDef, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeErrorTypeSetDef(o)
    return w.result
  }

  def toErrorTypeSetDef(data: ISZ[U8]): Either[ErrorTypeSetDef, MessagePack.ErrorMsg] = {
    def fErrorTypeSetDef(reader: Reader): ErrorTypeSetDef = {
      val r = reader.readErrorTypeSetDef()
      return r
    }
    val r = to(data, fErrorTypeSetDef _)
    return r
  }

  def fromBehaveStateMachine(o: BehaveStateMachine, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBehaveStateMachine(o)
    return w.result
  }

  def toBehaveStateMachine(data: ISZ[U8]): Either[BehaveStateMachine, MessagePack.ErrorMsg] = {
    def fBehaveStateMachine(reader: Reader): BehaveStateMachine = {
      val r = reader.readBehaveStateMachine()
      return r
    }
    val r = to(data, fBehaveStateMachine _)
    return r
  }

  def fromErrorEvent(o: ErrorEvent, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeErrorEvent(o)
    return w.result
  }

  def toErrorEvent(data: ISZ[U8]): Either[ErrorEvent, MessagePack.ErrorMsg] = {
    def fErrorEvent(reader: Reader): ErrorEvent = {
      val r = reader.readErrorEvent()
      return r
    }
    val r = to(data, fErrorEvent _)
    return r
  }

  def fromErrorState(o: ErrorState, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeErrorState(o)
    return w.result
  }

  def toErrorState(data: ISZ[U8]): Either[ErrorState, MessagePack.ErrorMsg] = {
    def fErrorState(reader: Reader): ErrorState = {
      val r = reader.readErrorState()
      return r
    }
    val r = to(data, fErrorState _)
    return r
  }

  def fromErrorTransition(o: ErrorTransition, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeErrorTransition(o)
    return w.result
  }

  def toErrorTransition(data: ISZ[U8]): Either[ErrorTransition, MessagePack.ErrorMsg] = {
    def fErrorTransition(reader: Reader): ErrorTransition = {
      val r = reader.readErrorTransition()
      return r
    }
    val r = to(data, fErrorTransition _)
    return r
  }

  def fromErrorCondition(o: ErrorCondition, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeErrorCondition(o)
    return w.result
  }

  def toErrorCondition(data: ISZ[U8]): Either[ErrorCondition, MessagePack.ErrorMsg] = {
    def fErrorCondition(reader: Reader): ErrorCondition = {
      val r = reader.readErrorCondition()
      return r
    }
    val r = to(data, fErrorCondition _)
    return r
  }

  def fromConditionTrigger(o: ConditionTrigger, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeConditionTrigger(o)
    return w.result
  }

  def toConditionTrigger(data: ISZ[U8]): Either[ConditionTrigger, MessagePack.ErrorMsg] = {
    def fConditionTrigger(reader: Reader): ConditionTrigger = {
      val r = reader.readConditionTrigger()
      return r
    }
    val r = to(data, fConditionTrigger _)
    return r
  }

  def fromAndCondition(o: AndCondition, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeAndCondition(o)
    return w.result
  }

  def toAndCondition(data: ISZ[U8]): Either[AndCondition, MessagePack.ErrorMsg] = {
    def fAndCondition(reader: Reader): AndCondition = {
      val r = reader.readAndCondition()
      return r
    }
    val r = to(data, fAndCondition _)
    return r
  }

  def fromOrCondition(o: OrCondition, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOrCondition(o)
    return w.result
  }

  def toOrCondition(data: ISZ[U8]): Either[OrCondition, MessagePack.ErrorMsg] = {
    def fOrCondition(reader: Reader): OrCondition = {
      val r = reader.readOrCondition()
      return r
    }
    val r = to(data, fOrCondition _)
    return r
  }

  def fromAllCondition(o: AllCondition, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeAllCondition(o)
    return w.result
  }

  def toAllCondition(data: ISZ[U8]): Either[AllCondition, MessagePack.ErrorMsg] = {
    def fAllCondition(reader: Reader): AllCondition = {
      val r = reader.readAllCondition()
      return r
    }
    val r = to(data, fAllCondition _)
    return r
  }

  def fromOrMoreCondition(o: OrMoreCondition, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOrMoreCondition(o)
    return w.result
  }

  def toOrMoreCondition(data: ISZ[U8]): Either[OrMoreCondition, MessagePack.ErrorMsg] = {
    def fOrMoreCondition(reader: Reader): OrMoreCondition = {
      val r = reader.readOrMoreCondition()
      return r
    }
    val r = to(data, fOrMoreCondition _)
    return r
  }

  def fromOrLessCondition(o: OrLessCondition, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOrLessCondition(o)
    return w.result
  }

  def toOrLessCondition(data: ISZ[U8]): Either[OrLessCondition, MessagePack.ErrorMsg] = {
    def fOrLessCondition(reader: Reader): OrLessCondition = {
      val r = reader.readOrLessCondition()
      return r
    }
    val r = to(data, fOrLessCondition _)
    return r
  }

  def fromEmv2Clause(o: Emv2Clause, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEmv2Clause(o)
    return w.result
  }

  def toEmv2Clause(data: ISZ[U8]): Either[Emv2Clause, MessagePack.ErrorMsg] = {
    def fEmv2Clause(reader: Reader): Emv2Clause = {
      val r = reader.readEmv2Clause()
      return r
    }
    val r = to(data, fEmv2Clause _)
    return r
  }

  def fromEmv2Propagation(o: Emv2Propagation, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEmv2Propagation(o)
    return w.result
  }

  def toEmv2Propagation(data: ISZ[U8]): Either[Emv2Propagation, MessagePack.ErrorMsg] = {
    def fEmv2Propagation(reader: Reader): Emv2Propagation = {
      val r = reader.readEmv2Propagation()
      return r
    }
    val r = to(data, fEmv2Propagation _)
    return r
  }

  def fromEmv2Flow(o: Emv2Flow, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEmv2Flow(o)
    return w.result
  }

  def toEmv2Flow(data: ISZ[U8]): Either[Emv2Flow, MessagePack.ErrorMsg] = {
    def fEmv2Flow(reader: Reader): Emv2Flow = {
      val r = reader.readEmv2Flow()
      return r
    }
    val r = to(data, fEmv2Flow _)
    return r
  }

  def fromEmv2BehaviorSection(o: Emv2BehaviorSection, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEmv2BehaviorSection(o)
    return w.result
  }

  def toEmv2BehaviorSection(data: ISZ[U8]): Either[Emv2BehaviorSection, MessagePack.ErrorMsg] = {
    def fEmv2BehaviorSection(reader: Reader): Emv2BehaviorSection = {
      val r = reader.readEmv2BehaviorSection()
      return r
    }
    val r = to(data, fEmv2BehaviorSection _)
    return r
  }

  def fromErrorPropagation(o: ErrorPropagation, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeErrorPropagation(o)
    return w.result
  }

  def toErrorPropagation(data: ISZ[U8]): Either[ErrorPropagation, MessagePack.ErrorMsg] = {
    def fErrorPropagation(reader: Reader): ErrorPropagation = {
      val r = reader.readErrorPropagation()
      return r
    }
    val r = to(data, fErrorPropagation _)
    return r
  }

  def fromSmfAnnex(o: SmfAnnex, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeSmfAnnex(o)
    return w.result
  }

  def toSmfAnnex(data: ISZ[U8]): Either[SmfAnnex, MessagePack.ErrorMsg] = {
    def fSmfAnnex(reader: Reader): SmfAnnex = {
      val r = reader.readSmfAnnex()
      return r
    }
    val r = to(data, fSmfAnnex _)
    return r
  }

  def fromSmfLib(o: SmfLib, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeSmfLib(o)
    return w.result
  }

  def toSmfLib(data: ISZ[U8]): Either[SmfLib, MessagePack.ErrorMsg] = {
    def fSmfLib(reader: Reader): SmfLib = {
      val r = reader.readSmfLib()
      return r
    }
    val r = to(data, fSmfLib _)
    return r
  }

  def fromSmfClause(o: SmfClause, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeSmfClause(o)
    return w.result
  }

  def toSmfClause(data: ISZ[U8]): Either[SmfClause, MessagePack.ErrorMsg] = {
    def fSmfClause(reader: Reader): SmfClause = {
      val r = reader.readSmfClause()
      return r
    }
    val r = to(data, fSmfClause _)
    return r
  }

  def fromSmfClassification(o: SmfClassification, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeSmfClassification(o)
    return w.result
  }

  def toSmfClassification(data: ISZ[U8]): Either[SmfClassification, MessagePack.ErrorMsg] = {
    def fSmfClassification(reader: Reader): SmfClassification = {
      val r = reader.readSmfClassification()
      return r
    }
    val r = to(data, fSmfClassification _)
    return r
  }

  def fromSmfDeclass(o: SmfDeclass, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeSmfDeclass(o)
    return w.result
  }

  def toSmfDeclass(data: ISZ[U8]): Either[SmfDeclass, MessagePack.ErrorMsg] = {
    def fSmfDeclass(reader: Reader): SmfDeclass = {
      val r = reader.readSmfDeclass()
      return r
    }
    val r = to(data, fSmfDeclass _)
    return r
  }

  def fromSmfLibrary(o: SmfLibrary, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeSmfLibrary(o)
    return w.result
  }

  def toSmfLibrary(data: ISZ[U8]): Either[SmfLibrary, MessagePack.ErrorMsg] = {
    def fSmfLibrary(reader: Reader): SmfLibrary = {
      val r = reader.readSmfLibrary()
      return r
    }
    val r = to(data, fSmfLibrary _)
    return r
  }

  def fromSmfType(o: SmfType, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeSmfType(o)
    return w.result
  }

  def toSmfType(data: ISZ[U8]): Either[SmfType, MessagePack.ErrorMsg] = {
    def fSmfType(reader: Reader): SmfType = {
      val r = reader.readSmfType()
      return r
    }
    val r = to(data, fSmfType _)
    return r
  }

}