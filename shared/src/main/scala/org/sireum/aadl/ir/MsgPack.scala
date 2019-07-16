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

    val ClassifierProp: Z = -20

    val RangeProp: Z = -19

    val RecordProp: Z = -18

    val ReferenceProp: Z = -17

    val UnitProp: Z = -16

    val ValueProp: Z = -15

    val Mode: Z = -14

    val Flow: Z = -13

    val Annex: Z = -12

    val Emv2Library: Z = -11

    val ErrorTypeDef: Z = -10

    val ErrorAliasDef: Z = -9

    val ErrorTypeSetDef: Z = -8

    val BehaveStateMachine: Z = -7

    val ErrorEvent: Z = -6

    val ErrorState: Z = -5

    val ErrorTransition: Z = -4

    val ConditionTrigger: Z = -3

    val AndCondition: Z = -2

    val OrCondition: Z = -1

    val AllCondition: Z = 0

    val OrMoreCondition: Z = 1

    val OrLessCondition: Z = 2

    val Emv2Clause: Z = 3

    val Emv2Propagation: Z = 4

    val Emv2Flow: Z = 5

    val Emv2BehaviorSection: Z = 6

    val ErrorPropagation: Z = 7

    val OtherAnnex: Z = 8

    val BTSBLESSAnnexClause: Z = 9

    val BTSVariableDeclaration: Z = 10

    val BTSClassifier: Z = 11

    val BLESSIntConst: Z = 12

    val BTSStateDeclaration: Z = 13

    val BTSTransition: Z = 14

    val BTSTransitionLabel: Z = 15

    val BTSDispatchCondition: Z = 16

    val BTSDispatchConjunction: Z = 17

    val BTSDispatchTriggerStop: Z = 18

    val BTSDispatchTriggerPort: Z = 19

    val BTSDispatchTriggerTimeout: Z = 20

    val BTSExecuteCondition: Z = 21

    val BTSModeCondition: Z = 22

    val BTSInternalCondition: Z = 23

    val BTSAssertion: Z = 24

    val BTSBehaviorActions: Z = 25

    val BTSAssertedAction: Z = 26

    val BTSSkipAction: Z = 27

    val BTSAssignmentAction: Z = 28

    val BTSSubprogramCallAction: Z = 29

    val BTSPortOutAction: Z = 30

    val BTSPortInAction: Z = 31

    val BTSFrozenPortAction: Z = 32

    val BTSIfBLESSAction: Z = 33

    val BTSGuardedAction: Z = 34

    val BTSIfBAAction: Z = 35

    val BTSConditionalActions: Z = 36

    val BTSExistentialLatticeQuantification: Z = 37

    val BTSUniversalLatticeQuantification: Z = 38

    val BTSUnaryExp: Z = 39

    val BTSBinaryExp: Z = 40

    val BTSLiteralExp: Z = 41

    val BTSNameExp: Z = 42

    val BTSIndexingExp: Z = 43

    val BTSAccessExp: Z = 44

    val BTSFunctionCall: Z = 45

    val BTSFormalExpPair: Z = 46

    val BTSBehaviorTime: Z = 47

    val TODO: Z = 48

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeAadl(o: Aadl): Unit = {
      writer.writeZ(Constants.Aadl)
      writer.writeISZ(o.components, writeComponent _)
      writer.writeISZ(o.errorLib, writeEmv2Library _)
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
    }

    def writeFeatureGroup(o: FeatureGroup): Unit = {
      writer.writeZ(Constants.FeatureGroup)
      writeName(o.identifier)
      writer.writeISZ(o.features, writeFeature _)
      writer.writeB(o.isInverse)
      writeFeatureCategoryType(o.category)
      writer.writeISZ(o.properties, writeProperty _)
    }

    def writeFeatureAccess(o: FeatureAccess): Unit = {
      writer.writeZ(Constants.FeatureAccess)
      writeName(o.identifier)
      writeFeatureCategoryType(o.category)
      writer.writeOption(o.classifier, writeClassifier _)
      writeAccessTypeType(o.accessType)
      writeAccessCategoryType(o.accessCategory)
      writer.writeISZ(o.properties, writeProperty _)
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
      writer.writeOption(o.source, writeFeature _)
      writer.writeOption(o.sink, writeFeature _)
    }

    def writeAnnex(o: Annex): Unit = {
      writer.writeZ(Constants.Annex)
      writer.writeString(o.name)
      writeAnnexClause(o.clause)
    }

    def writeAnnexClause(o: AnnexClause): Unit = {
      o match {
        case o: Emv2Library => writeEmv2Library(o)
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
      }
    }

    def writeEmv2Annex(o: Emv2Annex): Unit = {
      o match {
        case o: Emv2Library => writeEmv2Library(o)
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

    def writePropagationDirectionType(o: PropagationDirection.Type): Unit = {
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

    def writeOtherAnnex(o: OtherAnnex): Unit = {
      writer.writeZ(Constants.OtherAnnex)
      writer.writeString(o.clause)
    }

    def writeBLESSAnnex(o: BLESSAnnex): Unit = {
      o match {
        case o: BTSBLESSAnnexClause => writeBTSBLESSAnnexClause(o)
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
      writer.writeOption(o.arraySize, writeBLESSIntConst _)
      writer.writeOption(o.variableAssertion, writeBTSAssertion _)
    }

    def writeBTSVariableCategoryType(o: BTSVariableCategory.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBTSType(o: BTSType): Unit = {
      o match {
        case o: BTSClassifier => writeBTSClassifier(o)
      }
    }

    def writeBTSClassifier(o: BTSClassifier): Unit = {
      writer.writeZ(Constants.BTSClassifier)
      writeClassifier(o.classifier)
    }

    def writeBLESSIntConst(o: BLESSIntConst): Unit = {
      writer.writeZ(Constants.BLESSIntConst)
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
        case o: BTSExecuteCondition => writeBTSExecuteCondition(o)
        case o: BTSModeCondition => writeBTSModeCondition(o)
        case o: BTSInternalCondition => writeBTSInternalCondition(o)
      }
    }

    def writeBTSDispatchCondition(o: BTSDispatchCondition): Unit = {
      writer.writeZ(Constants.BTSDispatchCondition)
      writer.writeISZ(o.dispatchTriggers, writeBTSDispatchConjunction _)
      writer.writeISZ(o.frozenPorts, writeName _)
    }

    def writeBTSDispatchConjunction(o: BTSDispatchConjunction): Unit = {
      writer.writeZ(Constants.BTSDispatchConjunction)
      writer.writeISZ(o.conjunction, writeBTSDispatchTrigger _)
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
    }

    def writeBTSDispatchTriggerTimeout(o: BTSDispatchTriggerTimeout): Unit = {
      writer.writeZ(Constants.BTSDispatchTriggerTimeout)
      writer.writeISZ(o.ports, writeName _)
      writer.writeOption(o.time, writeBTSBehaviorTime _)
    }

    def writeBTSExecuteCondition(o: BTSExecuteCondition): Unit = {
      writer.writeZ(Constants.BTSExecuteCondition)
    }

    def writeBTSModeCondition(o: BTSModeCondition): Unit = {
      writer.writeZ(Constants.BTSModeCondition)
    }

    def writeBTSInternalCondition(o: BTSInternalCondition): Unit = {
      writer.writeZ(Constants.BTSInternalCondition)
    }

    def writeBTSAssertion(o: BTSAssertion): Unit = {
      writer.writeZ(Constants.BTSAssertion)
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
        case o: BTSSubprogramCallAction => writeBTSSubprogramCallAction(o)
        case o: BTSPortOutAction => writeBTSPortOutAction(o)
        case o: BTSPortInAction => writeBTSPortInAction(o)
        case o: BTSFrozenPortAction => writeBTSFrozenPortAction(o)
        case o: BTSIfBLESSAction => writeBTSIfBLESSAction(o)
        case o: BTSIfBAAction => writeBTSIfBAAction(o)
        case o: BTSExistentialLatticeQuantification => writeBTSExistentialLatticeQuantification(o)
        case o: BTSUniversalLatticeQuantification => writeBTSUniversalLatticeQuantification(o)
      }
    }

    def writeBTSBasicAction(o: BTSBasicAction): Unit = {
      o match {
        case o: BTSSkipAction => writeBTSSkipAction(o)
        case o: BTSAssignmentAction => writeBTSAssignmentAction(o)
        case o: BTSSubprogramCallAction => writeBTSSubprogramCallAction(o)
        case o: BTSPortOutAction => writeBTSPortOutAction(o)
        case o: BTSPortInAction => writeBTSPortInAction(o)
        case o: BTSFrozenPortAction => writeBTSFrozenPortAction(o)
      }
    }

    def writeBTSSkipAction(o: BTSSkipAction): Unit = {
      writer.writeZ(Constants.BTSSkipAction)
    }

    def writeBTSAssignmentAction(o: BTSAssignmentAction): Unit = {
      writer.writeZ(Constants.BTSAssignmentAction)
      writeBTSExp(o.lhs)
      writeBTSExp(o.rhs)
    }

    def writeBTSCommunicationAction(o: BTSCommunicationAction): Unit = {
      o match {
        case o: BTSSubprogramCallAction => writeBTSSubprogramCallAction(o)
        case o: BTSPortOutAction => writeBTSPortOutAction(o)
        case o: BTSPortInAction => writeBTSPortInAction(o)
        case o: BTSFrozenPortAction => writeBTSFrozenPortAction(o)
      }
    }

    def writeBTSSubprogramCallAction(o: BTSSubprogramCallAction): Unit = {
      writer.writeZ(Constants.BTSSubprogramCallAction)
      writeName(o.name)
      writer.writeISZ(o.params, writeBTSFormalExpPair _)
    }

    def writeBTSPortOutAction(o: BTSPortOutAction): Unit = {
      writer.writeZ(Constants.BTSPortOutAction)
      writeName(o.name)
      writer.writeOption(o.exp, writeBTSExp _)
    }

    def writeBTSPortInAction(o: BTSPortInAction): Unit = {
      writer.writeZ(Constants.BTSPortInAction)
      writeName(o.name)
      writeBTSExp(o.variable)
    }

    def writeBTSFrozenPortAction(o: BTSFrozenPortAction): Unit = {
      writer.writeZ(Constants.BTSFrozenPortAction)
      writeName(o.portName)
    }

    def writeBTSControlAction(o: BTSControlAction): Unit = {
      o match {
        case o: BTSIfBLESSAction => writeBTSIfBLESSAction(o)
        case o: BTSIfBAAction => writeBTSIfBAAction(o)
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
      writer.writeOption(o.timeout, writeBTSBehaviorTime _)
      writer.writeOption(o.catchClause, writeTODO _)
    }

    def writeBTSUniversalLatticeQuantification(o: BTSUniversalLatticeQuantification): Unit = {
      writer.writeZ(Constants.BTSUniversalLatticeQuantification)
      writer.writeISZ(o.latticeVariables, writeName _)
      writer.writeOption(o.range, writeTODO _)
      writeBTSExistentialLatticeQuantification(o.elq)
    }

    def writeBTSExp(o: BTSExp): Unit = {
      o match {
        case o: BTSUnaryExp => writeBTSUnaryExp(o)
        case o: BTSBinaryExp => writeBTSBinaryExp(o)
        case o: BTSLiteralExp => writeBTSLiteralExp(o)
        case o: BTSNameExp => writeBTSNameExp(o)
        case o: BTSIndexingExp => writeBTSIndexingExp(o)
        case o: BTSAccessExp => writeBTSAccessExp(o)
        case o: BTSFunctionCall => writeBTSFunctionCall(o)
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
    }

    def writeBTSNameExp(o: BTSNameExp): Unit = {
      writer.writeZ(Constants.BTSNameExp)
      writeName(o.name)
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
      writer.writeISZ(o.args, writeBTSFormalExpPair _)
    }

    def writeBTSFormalExpPair(o: BTSFormalExpPair): Unit = {
      writer.writeZ(Constants.BTSFormalExpPair)
      writer.writeOption(o.paramName, writeName _)
      writer.writeOption(o.exp, writeBTSExp _)
    }

    def writeBTSBehaviorTime(o: BTSBehaviorTime): Unit = {
      writer.writeZ(Constants.BTSBehaviorTime)
    }

    def writeTODO(o: TODO): Unit = {
      writer.writeZ(Constants.TODO)
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
      val dataComponents = reader.readISZ(readComponent _)
      return Aadl(components, errorLib, dataComponents)
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
      return FeatureEnd(identifier, direction, category, classifier, properties)
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
      return FeatureGroup(identifier, features, isInverse, category, properties)
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
      return FeatureAccess(identifier, category, classifier, accessType, accessCategory, properties)
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
      return Connection(name, src, dst, kind, isBiDirectional, connectionInstances, properties)
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
      return Property(name, propertyValues)
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
      val source = reader.readOption(readFeature _)
      val sink = reader.readOption(readFeature _)
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
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Emv2Library => val r = readEmv2LibraryT(T); return r
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
        case _ =>
          reader.error(i, s"$t is not a valid type of AnnexClause.")
          val r = readBTSBLESSAnnexClauseT(T)
          return r
      }
    }

    def readEmv2Annex(): Emv2Annex = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Emv2Library => val r = readEmv2LibraryT(T); return r
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

    def readPropagationDirectionType(): PropagationDirection.Type = {
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
      return ErrorTypeDef(id, extendType)
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
      return Emv2Clause(libraries, propagations, flows, componentBehavior)
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
      return Emv2Flow(identifier, kind, sourcePropagation, sinkPropagation)
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

    def readBLESSAnnex(): BLESSAnnex = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BTSBLESSAnnexClause => val r = readBTSBLESSAnnexClauseT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BLESSAnnex.")
          val r = readBTSBLESSAnnexClauseT(T)
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
      val arraySize = reader.readOption(readBLESSIntConst _)
      val variableAssertion = reader.readOption(readBTSAssertion _)
      return BTSVariableDeclaration(name, category, varType, assignExpression, arraySize, variableAssertion)
    }

    def readBTSVariableCategoryType(): BTSVariableCategory.Type = {
      val r = reader.readZ()
      return BTSVariableCategory.byOrdinal(r).get
    }

    def readBTSType(): BTSType = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BTSClassifier => val r = readBTSClassifierT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BTSType.")
          val r = readBTSClassifierT(T)
          return r
      }
    }

    def readBTSClassifier(): BTSClassifier = {
      val r = readBTSClassifierT(F)
      return r
    }

    def readBTSClassifierT(typeParsed: B): BTSClassifier = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSClassifier)
      }
      val classifier = readClassifier()
      return BTSClassifier(classifier)
    }

    def readBLESSIntConst(): BLESSIntConst = {
      val r = readBLESSIntConstT(F)
      return r
    }

    def readBLESSIntConstT(typeParsed: B): BLESSIntConst = {
      if (!typeParsed) {
        reader.expectZ(Constants.BLESSIntConst)
      }
      return BLESSIntConst()
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
        case Constants.BTSExecuteCondition => val r = readBTSExecuteConditionT(T); return r
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
      val dispatchTriggers = reader.readISZ(readBTSDispatchConjunction _)
      val frozenPorts = reader.readISZ(readName _)
      return BTSDispatchCondition(dispatchTriggers, frozenPorts)
    }

    def readBTSDispatchConjunction(): BTSDispatchConjunction = {
      val r = readBTSDispatchConjunctionT(F)
      return r
    }

    def readBTSDispatchConjunctionT(typeParsed: B): BTSDispatchConjunction = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSDispatchConjunction)
      }
      val conjunction = reader.readISZ(readBTSDispatchTrigger _)
      return BTSDispatchConjunction(conjunction)
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
      return BTSDispatchTriggerPort(port)
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
      val time = reader.readOption(readBTSBehaviorTime _)
      return BTSDispatchTriggerTimeout(ports, time)
    }

    def readBTSExecuteCondition(): BTSExecuteCondition = {
      val r = readBTSExecuteConditionT(F)
      return r
    }

    def readBTSExecuteConditionT(typeParsed: B): BTSExecuteCondition = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSExecuteCondition)
      }
      return BTSExecuteCondition()
    }

    def readBTSModeCondition(): BTSModeCondition = {
      val r = readBTSModeConditionT(F)
      return r
    }

    def readBTSModeConditionT(typeParsed: B): BTSModeCondition = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSModeCondition)
      }
      return BTSModeCondition()
    }

    def readBTSInternalCondition(): BTSInternalCondition = {
      val r = readBTSInternalConditionT(F)
      return r
    }

    def readBTSInternalConditionT(typeParsed: B): BTSInternalCondition = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSInternalCondition)
      }
      return BTSInternalCondition()
    }

    def readBTSAssertion(): BTSAssertion = {
      val r = readBTSAssertionT(F)
      return r
    }

    def readBTSAssertionT(typeParsed: B): BTSAssertion = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSAssertion)
      }
      return BTSAssertion()
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
        case Constants.BTSSubprogramCallAction => val r = readBTSSubprogramCallActionT(T); return r
        case Constants.BTSPortOutAction => val r = readBTSPortOutActionT(T); return r
        case Constants.BTSPortInAction => val r = readBTSPortInActionT(T); return r
        case Constants.BTSFrozenPortAction => val r = readBTSFrozenPortActionT(T); return r
        case Constants.BTSIfBLESSAction => val r = readBTSIfBLESSActionT(T); return r
        case Constants.BTSIfBAAction => val r = readBTSIfBAActionT(T); return r
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
        case Constants.BTSSubprogramCallAction => val r = readBTSSubprogramCallActionT(T); return r
        case Constants.BTSPortOutAction => val r = readBTSPortOutActionT(T); return r
        case Constants.BTSPortInAction => val r = readBTSPortInActionT(T); return r
        case Constants.BTSFrozenPortAction => val r = readBTSFrozenPortActionT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BTSBasicAction.")
          val r = readBTSFrozenPortActionT(T)
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
      val lhs = readBTSExp()
      val rhs = readBTSExp()
      return BTSAssignmentAction(lhs, rhs)
    }

    def readBTSCommunicationAction(): BTSCommunicationAction = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BTSSubprogramCallAction => val r = readBTSSubprogramCallActionT(T); return r
        case Constants.BTSPortOutAction => val r = readBTSPortOutActionT(T); return r
        case Constants.BTSPortInAction => val r = readBTSPortInActionT(T); return r
        case Constants.BTSFrozenPortAction => val r = readBTSFrozenPortActionT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BTSCommunicationAction.")
          val r = readBTSFrozenPortActionT(T)
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
      val params = reader.readISZ(readBTSFormalExpPair _)
      return BTSSubprogramCallAction(name, params)
    }

    def readBTSPortOutAction(): BTSPortOutAction = {
      val r = readBTSPortOutActionT(F)
      return r
    }

    def readBTSPortOutActionT(typeParsed: B): BTSPortOutAction = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSPortOutAction)
      }
      val name = readName()
      val exp = reader.readOption(readBTSExp _)
      return BTSPortOutAction(name, exp)
    }

    def readBTSPortInAction(): BTSPortInAction = {
      val r = readBTSPortInActionT(F)
      return r
    }

    def readBTSPortInActionT(typeParsed: B): BTSPortInAction = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSPortInAction)
      }
      val name = readName()
      val variable = readBTSExp()
      return BTSPortInAction(name, variable)
    }

    def readBTSFrozenPortAction(): BTSFrozenPortAction = {
      val r = readBTSFrozenPortActionT(F)
      return r
    }

    def readBTSFrozenPortActionT(typeParsed: B): BTSFrozenPortAction = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSFrozenPortAction)
      }
      val portName = readName()
      return BTSFrozenPortAction(portName)
    }

    def readBTSControlAction(): BTSControlAction = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BTSIfBLESSAction => val r = readBTSIfBLESSActionT(T); return r
        case Constants.BTSIfBAAction => val r = readBTSIfBAActionT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BTSControlAction.")
          val r = readBTSIfBAActionT(T)
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
      val timeout = reader.readOption(readBTSBehaviorTime _)
      val catchClause = reader.readOption(readTODO _)
      return BTSExistentialLatticeQuantification(quantifiedVariables, actions, timeout, catchClause)
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
      val range = reader.readOption(readTODO _)
      val elq = readBTSExistentialLatticeQuantification()
      return BTSUniversalLatticeQuantification(latticeVariables, range, elq)
    }

    def readBTSExp(): BTSExp = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BTSUnaryExp => val r = readBTSUnaryExpT(T); return r
        case Constants.BTSBinaryExp => val r = readBTSBinaryExpT(T); return r
        case Constants.BTSLiteralExp => val r = readBTSLiteralExpT(T); return r
        case Constants.BTSNameExp => val r = readBTSNameExpT(T); return r
        case Constants.BTSIndexingExp => val r = readBTSIndexingExpT(T); return r
        case Constants.BTSAccessExp => val r = readBTSAccessExpT(T); return r
        case Constants.BTSFunctionCall => val r = readBTSFunctionCallT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BTSExp.")
          val r = readBTSFunctionCallT(T)
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
      return BTSLiteralExp(typ, exp)
    }

    def readBTSNameExp(): BTSNameExp = {
      val r = readBTSNameExpT(F)
      return r
    }

    def readBTSNameExpT(typeParsed: B): BTSNameExp = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSNameExp)
      }
      val name = readName()
      return BTSNameExp(name)
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
      val args = reader.readISZ(readBTSFormalExpPair _)
      return BTSFunctionCall(name, args)
    }

    def readBTSFormalExpPair(): BTSFormalExpPair = {
      val r = readBTSFormalExpPairT(F)
      return r
    }

    def readBTSFormalExpPairT(typeParsed: B): BTSFormalExpPair = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSFormalExpPair)
      }
      val paramName = reader.readOption(readName _)
      val exp = reader.readOption(readBTSExp _)
      return BTSFormalExpPair(paramName, exp)
    }

    def readBTSBehaviorTime(): BTSBehaviorTime = {
      val r = readBTSBehaviorTimeT(F)
      return r
    }

    def readBTSBehaviorTimeT(typeParsed: B): BTSBehaviorTime = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSBehaviorTime)
      }
      return BTSBehaviorTime()
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

  def fromBLESSIntConst(o: BLESSIntConst, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBLESSIntConst(o)
    return w.result
  }

  def toBLESSIntConst(data: ISZ[U8]): Either[BLESSIntConst, MessagePack.ErrorMsg] = {
    def fBLESSIntConst(reader: Reader): BLESSIntConst = {
      val r = reader.readBLESSIntConst()
      return r
    }
    val r = to(data, fBLESSIntConst _)
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

  def fromBTSPortOutAction(o: BTSPortOutAction, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSPortOutAction(o)
    return w.result
  }

  def toBTSPortOutAction(data: ISZ[U8]): Either[BTSPortOutAction, MessagePack.ErrorMsg] = {
    def fBTSPortOutAction(reader: Reader): BTSPortOutAction = {
      val r = reader.readBTSPortOutAction()
      return r
    }
    val r = to(data, fBTSPortOutAction _)
    return r
  }

  def fromBTSPortInAction(o: BTSPortInAction, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSPortInAction(o)
    return w.result
  }

  def toBTSPortInAction(data: ISZ[U8]): Either[BTSPortInAction, MessagePack.ErrorMsg] = {
    def fBTSPortInAction(reader: Reader): BTSPortInAction = {
      val r = reader.readBTSPortInAction()
      return r
    }
    val r = to(data, fBTSPortInAction _)
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

  def fromBTSNameExp(o: BTSNameExp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSNameExp(o)
    return w.result
  }

  def toBTSNameExp(data: ISZ[U8]): Either[BTSNameExp, MessagePack.ErrorMsg] = {
    def fBTSNameExp(reader: Reader): BTSNameExp = {
      val r = reader.readBTSNameExp()
      return r
    }
    val r = to(data, fBTSNameExp _)
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

  def fromBTSFormalExpPair(o: BTSFormalExpPair, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSFormalExpPair(o)
    return w.result
  }

  def toBTSFormalExpPair(data: ISZ[U8]): Either[BTSFormalExpPair, MessagePack.ErrorMsg] = {
    def fBTSFormalExpPair(reader: Reader): BTSFormalExpPair = {
      val r = reader.readBTSFormalExpPair()
      return r
    }
    val r = to(data, fBTSFormalExpPair _)
    return r
  }

  def fromBTSBehaviorTime(o: BTSBehaviorTime, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSBehaviorTime(o)
    return w.result
  }

  def toBTSBehaviorTime(data: ISZ[U8]): Either[BTSBehaviorTime, MessagePack.ErrorMsg] = {
    def fBTSBehaviorTime(reader: Reader): BTSBehaviorTime = {
      val r = reader.readBTSBehaviorTime()
      return r
    }
    val r = to(data, fBTSBehaviorTime _)
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

}