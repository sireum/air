// #Sireum
// @formatter:off

/*
 Copyright (c) 2017-2023, Kansas State University
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

// This file is auto-generated from AadlAST.scala, BlessAST.scala, Emv2AST.scala, GumboAST.scala, SmfAST.scala, AST.scala, Typed.scala

package org.sireum.hamr.ir

import org.sireum._
import org.sireum.Json.Printer._
import org.sireum.hamr.ir.AadlInstInfo
import org.sireum.hamr.ir.Aadl
import org.sireum.hamr.ir.Name
import org.sireum.hamr.ir.Component
import org.sireum.hamr.ir.Classifier
import org.sireum.hamr.ir.Feature
import org.sireum.hamr.ir.FeatureEnd
import org.sireum.hamr.ir.FeatureGroup
import org.sireum.hamr.ir.FeatureAccess
import org.sireum.hamr.ir.Connection
import org.sireum.hamr.ir.ConnectionInstance
import org.sireum.hamr.ir.ConnectionReference
import org.sireum.hamr.ir.EndPoint
import org.sireum.hamr.ir.Property
import org.sireum.hamr.ir.ElementRef
import org.sireum.hamr.ir.AadlElementRef
import org.sireum.hamr.ir.PropertyValue
import org.sireum.hamr.ir.ClassifierProp
import org.sireum.hamr.ir.RangeProp
import org.sireum.hamr.ir.RecordProp
import org.sireum.hamr.ir.ReferenceProp
import org.sireum.hamr.ir.UnitProp
import org.sireum.hamr.ir.ValueProp
import org.sireum.hamr.ir.Mode
import org.sireum.hamr.ir.Flow
import org.sireum.hamr.ir.Annex
import org.sireum.hamr.ir.AnnexClause
import org.sireum.hamr.ir.AnnexLib
import org.sireum.hamr.ir.OtherAnnex
import org.sireum.hamr.ir.OtherLib
import org.sireum.hamr.ir.BLESSAnnex
import org.sireum.hamr.ir.BTSSubclauseBehaviorProvider
import org.sireum.hamr.ir.BTSResource
import org.sireum.hamr.ir.BTSText
import org.sireum.hamr.ir.BTSPath
import org.sireum.hamr.ir.BTSBLESSAnnexClause
import org.sireum.hamr.ir.BTSVariableDeclaration
import org.sireum.hamr.ir.BTSType
import org.sireum.hamr.ir.BTSClassifier
import org.sireum.hamr.ir.BLESSIntConst
import org.sireum.hamr.ir.BTSStateDeclaration
import org.sireum.hamr.ir.BTSTransition
import org.sireum.hamr.ir.BTSTransitionLabel
import org.sireum.hamr.ir.BTSTransitionCondition
import org.sireum.hamr.ir.BTSDispatchCondition
import org.sireum.hamr.ir.BTSDispatchConjunction
import org.sireum.hamr.ir.BTSDispatchTrigger
import org.sireum.hamr.ir.BTSDispatchTriggerStop
import org.sireum.hamr.ir.BTSDispatchTriggerPort
import org.sireum.hamr.ir.BTSDispatchTriggerTimeout
import org.sireum.hamr.ir.BTSExecuteCondition
import org.sireum.hamr.ir.BTSExecuteConditionExp
import org.sireum.hamr.ir.BTSExecuteConditionTimeout
import org.sireum.hamr.ir.BTSExecuteConditionOtherwise
import org.sireum.hamr.ir.BTSModeCondition
import org.sireum.hamr.ir.BTSInternalCondition
import org.sireum.hamr.ir.BTSAssertion
import org.sireum.hamr.ir.BTSBehaviorActions
import org.sireum.hamr.ir.BTSAssertedAction
import org.sireum.hamr.ir.BTSAction
import org.sireum.hamr.ir.BTSBasicAction
import org.sireum.hamr.ir.BTSSkipAction
import org.sireum.hamr.ir.BTSAssignmentAction
import org.sireum.hamr.ir.BTSCommunicationAction
import org.sireum.hamr.ir.BTSSubprogramCallAction
import org.sireum.hamr.ir.BTSPortOutAction
import org.sireum.hamr.ir.BTSPortInAction
import org.sireum.hamr.ir.BTSFrozenPortAction
import org.sireum.hamr.ir.BTSControlAction
import org.sireum.hamr.ir.BTSIfBLESSAction
import org.sireum.hamr.ir.BTSGuardedAction
import org.sireum.hamr.ir.BTSIfBAAction
import org.sireum.hamr.ir.BTSConditionalActions
import org.sireum.hamr.ir.BTSQuantificationActions
import org.sireum.hamr.ir.BTSExistentialLatticeQuantification
import org.sireum.hamr.ir.BTSUniversalLatticeQuantification
import org.sireum.hamr.ir.BTSExp
import org.sireum.hamr.ir.BTSUnaryExp
import org.sireum.hamr.ir.BTSBinaryExp
import org.sireum.hamr.ir.BTSLiteralExp
import org.sireum.hamr.ir.BTSNameExp
import org.sireum.hamr.ir.BTSIndexingExp
import org.sireum.hamr.ir.BTSAccessExp
import org.sireum.hamr.ir.BTSFunctionCall
import org.sireum.hamr.ir.BTSFormalExpPair
import org.sireum.hamr.ir.BTSBehaviorTime
import org.sireum.hamr.ir.TODO
import org.sireum.hamr.ir.Attr
import org.sireum.hamr.ir.Emv2Annex
import org.sireum.hamr.ir.Emv2Lib
import org.sireum.hamr.ir.Emv2ElementRef
import org.sireum.hamr.ir.Emv2Library
import org.sireum.hamr.ir.ErrorTypeDef
import org.sireum.hamr.ir.ErrorAliasDef
import org.sireum.hamr.ir.ErrorTypeSetDef
import org.sireum.hamr.ir.BehaveStateMachine
import org.sireum.hamr.ir.ErrorEvent
import org.sireum.hamr.ir.ErrorState
import org.sireum.hamr.ir.ErrorTransition
import org.sireum.hamr.ir.ErrorCondition
import org.sireum.hamr.ir.ConditionTrigger
import org.sireum.hamr.ir.AndCondition
import org.sireum.hamr.ir.OrCondition
import org.sireum.hamr.ir.AllCondition
import org.sireum.hamr.ir.OrMoreCondition
import org.sireum.hamr.ir.OrLessCondition
import org.sireum.hamr.ir.Emv2Clause
import org.sireum.hamr.ir.Emv2Propagation
import org.sireum.hamr.ir.Emv2Flow
import org.sireum.hamr.ir.Emv2BehaviorSection
import org.sireum.hamr.ir.ErrorPropagation
import org.sireum.hamr.ir.GclSymbol
import org.sireum.hamr.ir.GclSubclause
import org.sireum.hamr.ir.GclMethod
import org.sireum.hamr.ir.GclStateVar
import org.sireum.hamr.ir.GclClause
import org.sireum.hamr.ir.GclSpec
import org.sireum.hamr.ir.GclInvariant
import org.sireum.hamr.ir.GclComputeSpec
import org.sireum.hamr.ir.GclAssume
import org.sireum.hamr.ir.GclGuarantee
import org.sireum.hamr.ir.GclIntegration
import org.sireum.hamr.ir.GclCaseStatement
import org.sireum.hamr.ir.GclInitialize
import org.sireum.hamr.ir.GclCompute
import org.sireum.hamr.ir.GclHandle
import org.sireum.hamr.ir.GclTODO
import org.sireum.hamr.ir.GclLib
import org.sireum.hamr.ir.InfoFlowClause
import org.sireum.hamr.ir.SmfAnnex
import org.sireum.hamr.ir.SmfLib
import org.sireum.hamr.ir.SmfClause
import org.sireum.hamr.ir.SmfClassification
import org.sireum.hamr.ir.SmfDeclass
import org.sireum.hamr.ir.SmfLibrary
import org.sireum.hamr.ir.SmfType

object JSON {

  object Printer {

    @pure def printAadlInstInfo(o: AadlInstInfo): ST = {
      o match {
        case o: Component => return printComponent(o)
        case o: ErrorTypeDef => return printErrorTypeDef(o)
        case o: FeatureEnd => return printFeatureEnd(o)
        case o: FeatureGroup => return printFeatureGroup(o)
        case o: FeatureAccess => return printFeatureAccess(o)
        case o: Connection => return printConnection(o)
        case o: Emv2Flow => return printEmv2Flow(o)
        case o: Flow => return printFlow(o)
      }
    }

    @pure def printAadl(o: Aadl): ST = {
      return printObject(ISZ(
        ("type", st""""Aadl""""),
        ("components", printISZ(F, o.components, printComponent _)),
        ("annexLib", printISZ(F, o.annexLib, printAnnexLib _)),
        ("dataComponents", printISZ(F, o.dataComponents, printComponent _))
      ))
    }

    @pure def printName(o: Name): ST = {
      return printObject(ISZ(
        ("type", st""""Name""""),
        ("name", printISZ(T, o.name, printString _)),
        ("pos", printOption(F, o.pos, printPosition _))
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
        ("annexes", printISZ(F, o.annexes, printAnnex _)),
        ("uriFrag", printString(o.uriFrag))
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
        ("properties", printISZ(F, o.properties, printProperty _)),
        ("uriFrag", printString(o.uriFrag))
      ))
    }

    @pure def printFeatureGroup(o: FeatureGroup): ST = {
      return printObject(ISZ(
        ("type", st""""FeatureGroup""""),
        ("identifier", printName(o.identifier)),
        ("features", printISZ(F, o.features, printFeature _)),
        ("isInverse", printB(o.isInverse)),
        ("category", printFeatureCategoryType(o.category)),
        ("properties", printISZ(F, o.properties, printProperty _)),
        ("uriFrag", printString(o.uriFrag))
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
        ("properties", printISZ(F, o.properties, printProperty _)),
        ("uriFrag", printString(o.uriFrag))
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
        ("properties", printISZ(F, o.properties, printProperty _)),
        ("uriFrag", printString(o.uriFrag))
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
        ("propertyValues", printISZ(F, o.propertyValues, printPropertyValue _)),
        ("appliesTo", printISZ(F, o.appliesTo, printElementRef _))
      ))
    }

    @pure def printElementRef(o: ElementRef): ST = {
      o match {
        case o: Emv2ElementRef => return printEmv2ElementRef(o)
        case o: AadlElementRef => return printAadlElementRef(o)
      }
    }

    @pure def printElementKindType(o: ElementKind.Type): ST = {
      val value: String = o match {
        case ElementKind.Component => "Component"
        case ElementKind.Connection => "Connection"
        case ElementKind.Port => "Port"
        case ElementKind.Flow => "Flow"
      }
      return printObject(ISZ(
        ("type", printString("ElementKind")),
        ("value", printString(value))
      ))
    }

    @pure def printAadlElementRef(o: AadlElementRef): ST = {
      return printObject(ISZ(
        ("type", st""""AadlElementRef""""),
        ("elementKind", printElementKindType(o.elementKind)),
        ("name", printName(o.name))
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
        ("source", printOption(F, o.source, printName _)),
        ("sink", printOption(F, o.sink, printName _)),
        ("uriFrag", printString(o.uriFrag))
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
        case o: SmfClause => return printSmfClause(o)
        case o: SmfClassification => return printSmfClassification(o)
        case o: SmfDeclass => return printSmfDeclass(o)
        case o: SmfType => return printSmfType(o)
        case o: ErrorTypeDef => return printErrorTypeDef(o)
        case o: ErrorAliasDef => return printErrorAliasDef(o)
        case o: ErrorTypeSetDef => return printErrorTypeSetDef(o)
        case o: BehaveStateMachine => return printBehaveStateMachine(o)
        case o: ErrorEvent => return printErrorEvent(o)
        case o: ErrorState => return printErrorState(o)
        case o: ErrorTransition => return printErrorTransition(o)
        case o: ConditionTrigger => return printConditionTrigger(o)
        case o: AndCondition => return printAndCondition(o)
        case o: OrCondition => return printOrCondition(o)
        case o: AllCondition => return printAllCondition(o)
        case o: OrMoreCondition => return printOrMoreCondition(o)
        case o: OrLessCondition => return printOrLessCondition(o)
        case o: Emv2Clause => return printEmv2Clause(o)
        case o: Emv2Propagation => return printEmv2Propagation(o)
        case o: Emv2Flow => return printEmv2Flow(o)
        case o: Emv2BehaviorSection => return printEmv2BehaviorSection(o)
        case o: ErrorPropagation => return printErrorPropagation(o)
        case o: OtherAnnex => return printOtherAnnex(o)
        case o: GclSubclause => return printGclSubclause(o)
        case o: BTSSubclauseBehaviorProvider => return printBTSSubclauseBehaviorProvider(o)
        case o: BTSBLESSAnnexClause => return printBTSBLESSAnnexClause(o)
      }
    }

    @pure def printAnnexLib(o: AnnexLib): ST = {
      o match {
        case o: SmfLibrary => return printSmfLibrary(o)
        case o: Emv2Library => return printEmv2Library(o)
        case o: OtherLib => return printOtherLib(o)
        case o: GclLib => return printGclLib(o)
      }
    }

    @pure def printOtherAnnex(o: OtherAnnex): ST = {
      return printObject(ISZ(
        ("type", st""""OtherAnnex""""),
        ("clause", printString(o.clause))
      ))
    }

    @pure def printOtherLib(o: OtherLib): ST = {
      return printObject(ISZ(
        ("type", st""""OtherLib""""),
        ("lib", printString(o.lib))
      ))
    }

    @pure def printBLESSAnnex(o: BLESSAnnex): ST = {
      o match {
        case o: BTSSubclauseBehaviorProvider => return printBTSSubclauseBehaviorProvider(o)
        case o: BTSBLESSAnnexClause => return printBTSBLESSAnnexClause(o)
      }
    }

    @pure def printBTSSubclauseBehaviorProvider(o: BTSSubclauseBehaviorProvider): ST = {
      return printObject(ISZ(
        ("type", st""""BTSSubclauseBehaviorProvider""""),
        ("values", printISZ(F, o.values, printBTSResource _))
      ))
    }

    @pure def printBTSResource(o: BTSResource): ST = {
      o match {
        case o: BTSText => return printBTSText(o)
        case o: BTSPath => return printBTSPath(o)
      }
    }

    @pure def printBTSText(o: BTSText): ST = {
      return printObject(ISZ(
        ("type", st""""BTSText""""),
        ("source", printString(o.source)),
        ("filename", printOption(T, o.filename, printString _)),
        ("overwrite", printB(o.overwrite))
      ))
    }

    @pure def printBTSPath(o: BTSPath): ST = {
      return printObject(ISZ(
        ("type", st""""BTSPath""""),
        ("path", printString(o.path)),
        ("overwrite", printB(o.overwrite))
      ))
    }

    @pure def printBTSBLESSAnnexClause(o: BTSBLESSAnnexClause): ST = {
      return printObject(ISZ(
        ("type", st""""BTSBLESSAnnexClause""""),
        ("doNotProve", printB(o.doNotProve)),
        ("assertions", printISZ(F, o.assertions, printBTSAssertion _)),
        ("invariant", printOption(F, o.invariant, printBTSAssertion _)),
        ("variables", printISZ(F, o.variables, printBTSVariableDeclaration _)),
        ("states", printISZ(F, o.states, printBTSStateDeclaration _)),
        ("transitions", printISZ(F, o.transitions, printBTSTransition _))
      ))
    }

    @pure def printBTSVariableDeclaration(o: BTSVariableDeclaration): ST = {
      return printObject(ISZ(
        ("type", st""""BTSVariableDeclaration""""),
        ("name", printName(o.name)),
        ("category", printOption(F, o.category, printBTSVariableCategoryType _)),
        ("varType", printBTSType(o.varType)),
        ("assignExpression", printOption(F, o.assignExpression, printBTSExp _)),
        ("arraySize", printOption(F, o.arraySize, printBLESSIntConst _)),
        ("variableAssertion", printOption(F, o.variableAssertion, printBTSAssertion _))
      ))
    }

    @pure def printBTSVariableCategoryType(o: BTSVariableCategory.Type): ST = {
      val value: String = o match {
        case BTSVariableCategory.Nonvolatile => "Nonvolatile"
        case BTSVariableCategory.Shared => "Shared"
        case BTSVariableCategory.Constant => "Constant"
        case BTSVariableCategory.Spread => "Spread"
        case BTSVariableCategory.Final => "Final"
      }
      return printObject(ISZ(
        ("type", printString("BTSVariableCategory")),
        ("value", printString(value))
      ))
    }

    @pure def printBTSType(o: BTSType): ST = {
      o match {
        case o: BTSClassifier => return printBTSClassifier(o)
      }
    }

    @pure def printBTSClassifier(o: BTSClassifier): ST = {
      return printObject(ISZ(
        ("type", st""""BTSClassifier""""),
        ("classifier", printClassifier(o.classifier))
      ))
    }

    @pure def printBLESSIntConst(o: BLESSIntConst): ST = {
      return printObject(ISZ(
        ("type", st""""BLESSIntConst"""")
      ))
    }

    @pure def printBTSStateDeclaration(o: BTSStateDeclaration): ST = {
      return printObject(ISZ(
        ("type", st""""BTSStateDeclaration""""),
        ("id", printName(o.id)),
        ("categories", printISZ(F, o.categories, printBTSStateCategoryType _)),
        ("assertion", printOption(F, o.assertion, printBTSAssertion _))
      ))
    }

    @pure def printBTSStateCategoryType(o: BTSStateCategory.Type): ST = {
      val value: String = o match {
        case BTSStateCategory.Initial => "Initial"
        case BTSStateCategory.Complete => "Complete"
        case BTSStateCategory.Execute => "Execute"
        case BTSStateCategory.Final => "Final"
      }
      return printObject(ISZ(
        ("type", printString("BTSStateCategory")),
        ("value", printString(value))
      ))
    }

    @pure def printBTSTransition(o: BTSTransition): ST = {
      return printObject(ISZ(
        ("type", st""""BTSTransition""""),
        ("label", printBTSTransitionLabel(o.label)),
        ("sourceStates", printISZ(F, o.sourceStates, printName _)),
        ("destState", printName(o.destState)),
        ("transitionCondition", printOption(F, o.transitionCondition, printBTSTransitionCondition _)),
        ("actions", printOption(F, o.actions, printBTSBehaviorActions _)),
        ("assertion", printOption(F, o.assertion, printBTSAssertion _))
      ))
    }

    @pure def printBTSTransitionLabel(o: BTSTransitionLabel): ST = {
      return printObject(ISZ(
        ("type", st""""BTSTransitionLabel""""),
        ("id", printName(o.id)),
        ("priority", printOption(T, o.priority, printZ _))
      ))
    }

    @pure def printBTSTransitionCondition(o: BTSTransitionCondition): ST = {
      o match {
        case o: BTSDispatchCondition => return printBTSDispatchCondition(o)
        case o: BTSExecuteConditionExp => return printBTSExecuteConditionExp(o)
        case o: BTSExecuteConditionTimeout => return printBTSExecuteConditionTimeout(o)
        case o: BTSExecuteConditionOtherwise => return printBTSExecuteConditionOtherwise(o)
        case o: BTSModeCondition => return printBTSModeCondition(o)
        case o: BTSInternalCondition => return printBTSInternalCondition(o)
      }
    }

    @pure def printBTSDispatchCondition(o: BTSDispatchCondition): ST = {
      return printObject(ISZ(
        ("type", st""""BTSDispatchCondition""""),
        ("dispatchTriggers", printISZ(F, o.dispatchTriggers, printBTSDispatchConjunction _)),
        ("frozenPorts", printISZ(F, o.frozenPorts, printName _))
      ))
    }

    @pure def printBTSDispatchConjunction(o: BTSDispatchConjunction): ST = {
      return printObject(ISZ(
        ("type", st""""BTSDispatchConjunction""""),
        ("conjunction", printISZ(F, o.conjunction, printBTSDispatchTrigger _))
      ))
    }

    @pure def printBTSDispatchTrigger(o: BTSDispatchTrigger): ST = {
      o match {
        case o: BTSDispatchTriggerStop => return printBTSDispatchTriggerStop(o)
        case o: BTSDispatchTriggerPort => return printBTSDispatchTriggerPort(o)
        case o: BTSDispatchTriggerTimeout => return printBTSDispatchTriggerTimeout(o)
      }
    }

    @pure def printBTSDispatchTriggerStop(o: BTSDispatchTriggerStop): ST = {
      return printObject(ISZ(
        ("type", st""""BTSDispatchTriggerStop"""")
      ))
    }

    @pure def printBTSDispatchTriggerPort(o: BTSDispatchTriggerPort): ST = {
      return printObject(ISZ(
        ("type", st""""BTSDispatchTriggerPort""""),
        ("port", printName(o.port))
      ))
    }

    @pure def printBTSDispatchTriggerTimeout(o: BTSDispatchTriggerTimeout): ST = {
      return printObject(ISZ(
        ("type", st""""BTSDispatchTriggerTimeout""""),
        ("ports", printISZ(F, o.ports, printName _)),
        ("time", printOption(F, o.time, printBTSBehaviorTime _))
      ))
    }

    @pure def printBTSExecuteCondition(o: BTSExecuteCondition): ST = {
      o match {
        case o: BTSExecuteConditionExp => return printBTSExecuteConditionExp(o)
        case o: BTSExecuteConditionTimeout => return printBTSExecuteConditionTimeout(o)
        case o: BTSExecuteConditionOtherwise => return printBTSExecuteConditionOtherwise(o)
      }
    }

    @pure def printBTSExecuteConditionExp(o: BTSExecuteConditionExp): ST = {
      return printObject(ISZ(
        ("type", st""""BTSExecuteConditionExp""""),
        ("exp", printBTSExp(o.exp))
      ))
    }

    @pure def printBTSExecuteConditionTimeout(o: BTSExecuteConditionTimeout): ST = {
      return printObject(ISZ(
        ("type", st""""BTSExecuteConditionTimeout"""")
      ))
    }

    @pure def printBTSExecuteConditionOtherwise(o: BTSExecuteConditionOtherwise): ST = {
      return printObject(ISZ(
        ("type", st""""BTSExecuteConditionOtherwise"""")
      ))
    }

    @pure def printBTSModeCondition(o: BTSModeCondition): ST = {
      return printObject(ISZ(
        ("type", st""""BTSModeCondition"""")
      ))
    }

    @pure def printBTSInternalCondition(o: BTSInternalCondition): ST = {
      return printObject(ISZ(
        ("type", st""""BTSInternalCondition"""")
      ))
    }

    @pure def printBTSAssertion(o: BTSAssertion): ST = {
      return printObject(ISZ(
        ("type", st""""BTSAssertion"""")
      ))
    }

    @pure def printBTSBehaviorActions(o: BTSBehaviorActions): ST = {
      return printObject(ISZ(
        ("type", st""""BTSBehaviorActions""""),
        ("executionOrder", printBTSExecutionOrderType(o.executionOrder)),
        ("actions", printISZ(F, o.actions, printBTSAssertedAction _))
      ))
    }

    @pure def printBTSExecutionOrderType(o: BTSExecutionOrder.Type): ST = {
      val value: String = o match {
        case BTSExecutionOrder.Sequential => "Sequential"
        case BTSExecutionOrder.Concurrent => "Concurrent"
      }
      return printObject(ISZ(
        ("type", printString("BTSExecutionOrder")),
        ("value", printString(value))
      ))
    }

    @pure def printBTSAssertedAction(o: BTSAssertedAction): ST = {
      return printObject(ISZ(
        ("type", st""""BTSAssertedAction""""),
        ("precondition", printOption(F, o.precondition, printBTSAssertion _)),
        ("action", printBTSAction(o.action)),
        ("postcondition", printOption(F, o.postcondition, printBTSAssertion _))
      ))
    }

    @pure def printBTSAction(o: BTSAction): ST = {
      o match {
        case o: BTSSkipAction => return printBTSSkipAction(o)
        case o: BTSAssignmentAction => return printBTSAssignmentAction(o)
        case o: BTSSubprogramCallAction => return printBTSSubprogramCallAction(o)
        case o: BTSPortOutAction => return printBTSPortOutAction(o)
        case o: BTSPortInAction => return printBTSPortInAction(o)
        case o: BTSFrozenPortAction => return printBTSFrozenPortAction(o)
        case o: BTSIfBLESSAction => return printBTSIfBLESSAction(o)
        case o: BTSIfBAAction => return printBTSIfBAAction(o)
        case o: BTSExistentialLatticeQuantification => return printBTSExistentialLatticeQuantification(o)
        case o: BTSUniversalLatticeQuantification => return printBTSUniversalLatticeQuantification(o)
      }
    }

    @pure def printBTSBasicAction(o: BTSBasicAction): ST = {
      o match {
        case o: BTSSkipAction => return printBTSSkipAction(o)
        case o: BTSAssignmentAction => return printBTSAssignmentAction(o)
        case o: BTSSubprogramCallAction => return printBTSSubprogramCallAction(o)
        case o: BTSPortOutAction => return printBTSPortOutAction(o)
        case o: BTSPortInAction => return printBTSPortInAction(o)
        case o: BTSFrozenPortAction => return printBTSFrozenPortAction(o)
      }
    }

    @pure def printBTSSkipAction(o: BTSSkipAction): ST = {
      return printObject(ISZ(
        ("type", st""""BTSSkipAction"""")
      ))
    }

    @pure def printBTSAssignmentAction(o: BTSAssignmentAction): ST = {
      return printObject(ISZ(
        ("type", st""""BTSAssignmentAction""""),
        ("lhs", printBTSExp(o.lhs)),
        ("rhs", printBTSExp(o.rhs))
      ))
    }

    @pure def printBTSCommunicationAction(o: BTSCommunicationAction): ST = {
      o match {
        case o: BTSSubprogramCallAction => return printBTSSubprogramCallAction(o)
        case o: BTSPortOutAction => return printBTSPortOutAction(o)
        case o: BTSPortInAction => return printBTSPortInAction(o)
        case o: BTSFrozenPortAction => return printBTSFrozenPortAction(o)
      }
    }

    @pure def printBTSSubprogramCallAction(o: BTSSubprogramCallAction): ST = {
      return printObject(ISZ(
        ("type", st""""BTSSubprogramCallAction""""),
        ("name", printName(o.name)),
        ("params", printISZ(F, o.params, printBTSFormalExpPair _))
      ))
    }

    @pure def printBTSPortOutAction(o: BTSPortOutAction): ST = {
      return printObject(ISZ(
        ("type", st""""BTSPortOutAction""""),
        ("name", printName(o.name)),
        ("exp", printOption(F, o.exp, printBTSExp _))
      ))
    }

    @pure def printBTSPortInAction(o: BTSPortInAction): ST = {
      return printObject(ISZ(
        ("type", st""""BTSPortInAction""""),
        ("name", printName(o.name)),
        ("variable", printBTSExp(o.variable))
      ))
    }

    @pure def printBTSFrozenPortAction(o: BTSFrozenPortAction): ST = {
      return printObject(ISZ(
        ("type", st""""BTSFrozenPortAction""""),
        ("portName", printName(o.portName))
      ))
    }

    @pure def printBTSControlAction(o: BTSControlAction): ST = {
      o match {
        case o: BTSIfBLESSAction => return printBTSIfBLESSAction(o)
        case o: BTSIfBAAction => return printBTSIfBAAction(o)
      }
    }

    @pure def printBTSIfBLESSAction(o: BTSIfBLESSAction): ST = {
      return printObject(ISZ(
        ("type", st""""BTSIfBLESSAction""""),
        ("availability", printOption(F, o.availability, printTODO _)),
        ("alternatives", printISZ(F, o.alternatives, printBTSGuardedAction _))
      ))
    }

    @pure def printBTSGuardedAction(o: BTSGuardedAction): ST = {
      return printObject(ISZ(
        ("type", st""""BTSGuardedAction""""),
        ("guard", printBTSExp(o.guard)),
        ("action", printBTSAssertedAction(o.action))
      ))
    }

    @pure def printBTSIfBAAction(o: BTSIfBAAction): ST = {
      return printObject(ISZ(
        ("type", st""""BTSIfBAAction""""),
        ("ifBranch", printBTSConditionalActions(o.ifBranch)),
        ("elseIfBranches", printISZ(F, o.elseIfBranches, printBTSConditionalActions _)),
        ("elseBranch", printOption(F, o.elseBranch, printBTSBehaviorActions _))
      ))
    }

    @pure def printBTSConditionalActions(o: BTSConditionalActions): ST = {
      return printObject(ISZ(
        ("type", st""""BTSConditionalActions""""),
        ("cond", printBTSExp(o.cond)),
        ("actions", printBTSBehaviorActions(o.actions))
      ))
    }

    @pure def printBTSQuantificationActions(o: BTSQuantificationActions): ST = {
      o match {
        case o: BTSExistentialLatticeQuantification => return printBTSExistentialLatticeQuantification(o)
        case o: BTSUniversalLatticeQuantification => return printBTSUniversalLatticeQuantification(o)
      }
    }

    @pure def printBTSExistentialLatticeQuantification(o: BTSExistentialLatticeQuantification): ST = {
      return printObject(ISZ(
        ("type", st""""BTSExistentialLatticeQuantification""""),
        ("quantifiedVariables", printISZ(F, o.quantifiedVariables, printBTSVariableDeclaration _)),
        ("actions", printBTSBehaviorActions(o.actions)),
        ("timeout", printOption(F, o.timeout, printBTSBehaviorTime _)),
        ("catchClause", printOption(F, o.catchClause, printTODO _))
      ))
    }

    @pure def printBTSUniversalLatticeQuantification(o: BTSUniversalLatticeQuantification): ST = {
      return printObject(ISZ(
        ("type", st""""BTSUniversalLatticeQuantification""""),
        ("latticeVariables", printISZ(F, o.latticeVariables, printName _)),
        ("range", printOption(F, o.range, printTODO _)),
        ("elq", printBTSExistentialLatticeQuantification(o.elq))
      ))
    }

    @pure def printBTSExp(o: BTSExp): ST = {
      o match {
        case o: BTSUnaryExp => return printBTSUnaryExp(o)
        case o: BTSBinaryExp => return printBTSBinaryExp(o)
        case o: BTSLiteralExp => return printBTSLiteralExp(o)
        case o: BTSNameExp => return printBTSNameExp(o)
        case o: BTSIndexingExp => return printBTSIndexingExp(o)
        case o: BTSAccessExp => return printBTSAccessExp(o)
        case o: BTSFunctionCall => return printBTSFunctionCall(o)
      }
    }

    @pure def printBTSUnaryExp(o: BTSUnaryExp): ST = {
      return printObject(ISZ(
        ("type", st""""BTSUnaryExp""""),
        ("op", printBTSUnaryOpType(o.op)),
        ("exp", printBTSExp(o.exp)),
        ("pos", printOption(F, o.pos, printPosition _))
      ))
    }

    @pure def printBTSUnaryOpType(o: BTSUnaryOp.Type): ST = {
      val value: String = o match {
        case BTSUnaryOp.ABS => "ABS"
        case BTSUnaryOp.NEG => "NEG"
        case BTSUnaryOp.NOT => "NOT"
      }
      return printObject(ISZ(
        ("type", printString("BTSUnaryOp")),
        ("value", printString(value))
      ))
    }

    @pure def printBTSBinaryExp(o: BTSBinaryExp): ST = {
      return printObject(ISZ(
        ("type", st""""BTSBinaryExp""""),
        ("op", printBTSBinaryOpType(o.op)),
        ("lhs", printBTSExp(o.lhs)),
        ("rhs", printBTSExp(o.rhs)),
        ("pos", printOption(F, o.pos, printPosition _))
      ))
    }

    @pure def printBTSBinaryOpType(o: BTSBinaryOp.Type): ST = {
      val value: String = o match {
        case BTSBinaryOp.AND => "AND"
        case BTSBinaryOp.ANDTHEN => "ANDTHEN"
        case BTSBinaryOp.OR => "OR"
        case BTSBinaryOp.ORELSE => "ORELSE"
        case BTSBinaryOp.XOR => "XOR"
        case BTSBinaryOp.EQ => "EQ"
        case BTSBinaryOp.NEQ => "NEQ"
        case BTSBinaryOp.LT => "LT"
        case BTSBinaryOp.LTE => "LTE"
        case BTSBinaryOp.GT => "GT"
        case BTSBinaryOp.GTE => "GTE"
        case BTSBinaryOp.PLUS => "PLUS"
        case BTSBinaryOp.MINUS => "MINUS"
        case BTSBinaryOp.DIV => "DIV"
        case BTSBinaryOp.MULT => "MULT"
        case BTSBinaryOp.MOD => "MOD"
        case BTSBinaryOp.REM => "REM"
        case BTSBinaryOp.EXP => "EXP"
      }
      return printObject(ISZ(
        ("type", printString("BTSBinaryOp")),
        ("value", printString(value))
      ))
    }

    @pure def printBTSLiteralTypeType(o: BTSLiteralType.Type): ST = {
      val value: String = o match {
        case BTSLiteralType.BOOLEAN => "BOOLEAN"
        case BTSLiteralType.STRING => "STRING"
        case BTSLiteralType.INTEGER => "INTEGER"
        case BTSLiteralType.FLOAT => "FLOAT"
      }
      return printObject(ISZ(
        ("type", printString("BTSLiteralType")),
        ("value", printString(value))
      ))
    }

    @pure def printBTSLiteralExp(o: BTSLiteralExp): ST = {
      return printObject(ISZ(
        ("type", st""""BTSLiteralExp""""),
        ("typ", printBTSLiteralTypeType(o.typ)),
        ("exp", printString(o.exp)),
        ("pos", printOption(F, o.pos, printPosition _))
      ))
    }

    @pure def printBTSNameExp(o: BTSNameExp): ST = {
      return printObject(ISZ(
        ("type", st""""BTSNameExp""""),
        ("name", printName(o.name)),
        ("pos", printOption(F, o.pos, printPosition _))
      ))
    }

    @pure def printBTSIndexingExp(o: BTSIndexingExp): ST = {
      return printObject(ISZ(
        ("type", st""""BTSIndexingExp""""),
        ("exp", printBTSExp(o.exp)),
        ("indices", printISZ(F, o.indices, printBTSExp _)),
        ("pos", printOption(F, o.pos, printPosition _))
      ))
    }

    @pure def printBTSAccessExp(o: BTSAccessExp): ST = {
      return printObject(ISZ(
        ("type", st""""BTSAccessExp""""),
        ("exp", printBTSExp(o.exp)),
        ("attributeName", printString(o.attributeName)),
        ("pos", printOption(F, o.pos, printPosition _))
      ))
    }

    @pure def printBTSFunctionCall(o: BTSFunctionCall): ST = {
      return printObject(ISZ(
        ("type", st""""BTSFunctionCall""""),
        ("name", printName(o.name)),
        ("args", printISZ(F, o.args, printBTSFormalExpPair _)),
        ("pos", printOption(F, o.pos, printPosition _))
      ))
    }

    @pure def printBTSFormalExpPair(o: BTSFormalExpPair): ST = {
      return printObject(ISZ(
        ("type", st""""BTSFormalExpPair""""),
        ("paramName", printOption(F, o.paramName, printName _)),
        ("exp", printOption(F, o.exp, printBTSExp _)),
        ("pos", printOption(F, o.pos, printPosition _))
      ))
    }

    @pure def printBTSBehaviorTime(o: BTSBehaviorTime): ST = {
      return printObject(ISZ(
        ("type", st""""BTSBehaviorTime"""")
      ))
    }

    @pure def printTODO(o: TODO): ST = {
      return printObject(ISZ(
        ("type", st""""TODO"""")
      ))
    }

    @pure def printAttr(o: Attr): ST = {
      return printObject(ISZ(
        ("type", st""""Attr""""),
        ("posOpt", printOption(F, o.posOpt, printPosition _))
      ))
    }

    @pure def printEmv2Annex(o: Emv2Annex): ST = {
      o match {
        case o: ErrorTypeDef => return printErrorTypeDef(o)
        case o: ErrorAliasDef => return printErrorAliasDef(o)
        case o: ErrorTypeSetDef => return printErrorTypeSetDef(o)
        case o: BehaveStateMachine => return printBehaveStateMachine(o)
        case o: ErrorEvent => return printErrorEvent(o)
        case o: ErrorState => return printErrorState(o)
        case o: ErrorTransition => return printErrorTransition(o)
        case o: ConditionTrigger => return printConditionTrigger(o)
        case o: AndCondition => return printAndCondition(o)
        case o: OrCondition => return printOrCondition(o)
        case o: AllCondition => return printAllCondition(o)
        case o: OrMoreCondition => return printOrMoreCondition(o)
        case o: OrLessCondition => return printOrLessCondition(o)
        case o: Emv2Clause => return printEmv2Clause(o)
        case o: Emv2Propagation => return printEmv2Propagation(o)
        case o: Emv2Flow => return printEmv2Flow(o)
        case o: Emv2BehaviorSection => return printEmv2BehaviorSection(o)
        case o: ErrorPropagation => return printErrorPropagation(o)
      }
    }

    @pure def printEmv2Lib(o: Emv2Lib): ST = {
      o match {
        case o: Emv2Library => return printEmv2Library(o)
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

    @pure def printEmv2ElementRef(o: Emv2ElementRef): ST = {
      return printObject(ISZ(
        ("type", st""""Emv2ElementRef""""),
        ("kind", printEmv2ElementKindType(o.kind)),
        ("name", printName(o.name)),
        ("errorTypes", printISZ(F, o.errorTypes, printName _))
      ))
    }

    @pure def printEmv2ElementKindType(o: Emv2ElementKind.Type): ST = {
      val value: String = o match {
        case Emv2ElementKind.Source => "Source"
        case Emv2ElementKind.Sink => "Sink"
        case Emv2ElementKind.Path => "Path"
        case Emv2ElementKind.Propagation => "Propagation"
        case Emv2ElementKind.State => "State"
        case Emv2ElementKind.Event => "Event"
        case Emv2ElementKind.BehaviorTransition => "BehaviorTransition"
      }
      return printObject(ISZ(
        ("type", printString("Emv2ElementKind")),
        ("value", printString(value))
      ))
    }

    @pure def printEmv2Library(o: Emv2Library): ST = {
      return printObject(ISZ(
        ("type", st""""Emv2Library""""),
        ("name", printName(o.name)),
        ("useTypes", printISZ(T, o.useTypes, printString _)),
        ("errorTypeDef", printISZ(F, o.errorTypeDef, printErrorTypeDef _)),
        ("errorTypeSetDef", printISZ(F, o.errorTypeSetDef, printErrorTypeSetDef _)),
        ("alias", printISZ(F, o.alias, printErrorAliasDef _)),
        ("behaveStateMachine", printISZ(F, o.behaveStateMachine, printBehaveStateMachine _))
      ))
    }

    @pure def printErrorKindType(o: ErrorKind.Type): ST = {
      val value: String = o match {
        case ErrorKind.all => "all"
        case ErrorKind.noerror => "noerror"
      }
      return printObject(ISZ(
        ("type", printString("ErrorKind")),
        ("value", printString(value))
      ))
    }

    @pure def printErrorTypeDef(o: ErrorTypeDef): ST = {
      return printObject(ISZ(
        ("type", st""""ErrorTypeDef""""),
        ("id", printName(o.id)),
        ("extendType", printOption(F, o.extendType, printName _)),
        ("uriFrag", printString(o.uriFrag))
      ))
    }

    @pure def printErrorAliasDef(o: ErrorAliasDef): ST = {
      return printObject(ISZ(
        ("type", st""""ErrorAliasDef""""),
        ("errorType", printName(o.errorType)),
        ("aliseType", printName(o.aliseType))
      ))
    }

    @pure def printErrorTypeSetDef(o: ErrorTypeSetDef): ST = {
      return printObject(ISZ(
        ("type", st""""ErrorTypeSetDef""""),
        ("id", printName(o.id)),
        ("errorTypes", printISZ(F, o.errorTypes, printName _))
      ))
    }

    @pure def printBehaveStateMachine(o: BehaveStateMachine): ST = {
      return printObject(ISZ(
        ("type", st""""BehaveStateMachine""""),
        ("id", printName(o.id)),
        ("events", printISZ(F, o.events, printErrorEvent _)),
        ("states", printISZ(F, o.states, printErrorState _)),
        ("transitions", printISZ(F, o.transitions, printErrorTransition _)),
        ("properties", printISZ(F, o.properties, printProperty _))
      ))
    }

    @pure def printErrorEvent(o: ErrorEvent): ST = {
      return printObject(ISZ(
        ("type", st""""ErrorEvent""""),
        ("id", printName(o.id))
      ))
    }

    @pure def printErrorState(o: ErrorState): ST = {
      return printObject(ISZ(
        ("type", st""""ErrorState""""),
        ("id", printName(o.id)),
        ("isInitial", printB(o.isInitial))
      ))
    }

    @pure def printErrorTransition(o: ErrorTransition): ST = {
      return printObject(ISZ(
        ("type", st""""ErrorTransition""""),
        ("id", printOption(F, o.id, printName _)),
        ("sourceState", printName(o.sourceState)),
        ("condition", printErrorCondition(o.condition)),
        ("targetState", printName(o.targetState))
      ))
    }

    @pure def printErrorCondition(o: ErrorCondition): ST = {
      o match {
        case o: ConditionTrigger => return printConditionTrigger(o)
        case o: AndCondition => return printAndCondition(o)
        case o: OrCondition => return printOrCondition(o)
        case o: AllCondition => return printAllCondition(o)
        case o: OrMoreCondition => return printOrMoreCondition(o)
        case o: OrLessCondition => return printOrLessCondition(o)
      }
    }

    @pure def printConditionTrigger(o: ConditionTrigger): ST = {
      return printObject(ISZ(
        ("type", st""""ConditionTrigger""""),
        ("events", printISZ(F, o.events, printName _)),
        ("propagationPoints", printISZ(F, o.propagationPoints, printEmv2Propagation _))
      ))
    }

    @pure def printAndCondition(o: AndCondition): ST = {
      return printObject(ISZ(
        ("type", st""""AndCondition""""),
        ("op", printISZ(F, o.op, printErrorCondition _))
      ))
    }

    @pure def printOrCondition(o: OrCondition): ST = {
      return printObject(ISZ(
        ("type", st""""OrCondition""""),
        ("op", printISZ(F, o.op, printErrorCondition _))
      ))
    }

    @pure def printAllCondition(o: AllCondition): ST = {
      return printObject(ISZ(
        ("type", st""""AllCondition""""),
        ("op", printISZ(F, o.op, printErrorCondition _))
      ))
    }

    @pure def printOrMoreCondition(o: OrMoreCondition): ST = {
      return printObject(ISZ(
        ("type", st""""OrMoreCondition""""),
        ("number", printZ(o.number)),
        ("conditions", printISZ(F, o.conditions, printErrorCondition _))
      ))
    }

    @pure def printOrLessCondition(o: OrLessCondition): ST = {
      return printObject(ISZ(
        ("type", st""""OrLessCondition""""),
        ("number", printZ(o.number)),
        ("conditions", printISZ(F, o.conditions, printErrorCondition _))
      ))
    }

    @pure def printEmv2Clause(o: Emv2Clause): ST = {
      return printObject(ISZ(
        ("type", st""""Emv2Clause""""),
        ("libraries", printISZ(F, o.libraries, printName _)),
        ("propagations", printISZ(F, o.propagations, printEmv2Propagation _)),
        ("flows", printISZ(F, o.flows, printEmv2Flow _)),
        ("componentBehavior", printOption(F, o.componentBehavior, printEmv2BehaviorSection _)),
        ("properties", printISZ(F, o.properties, printProperty _))
      ))
    }

    @pure def printEmv2Propagation(o: Emv2Propagation): ST = {
      return printObject(ISZ(
        ("type", st""""Emv2Propagation""""),
        ("direction", printPropagationDirectionType(o.direction)),
        ("propagationPoint", printName(o.propagationPoint)),
        ("errorTokens", printISZ(F, o.errorTokens, printName _))
      ))
    }

    @pure def printEmv2Flow(o: Emv2Flow): ST = {
      return printObject(ISZ(
        ("type", st""""Emv2Flow""""),
        ("identifier", printName(o.identifier)),
        ("kind", printFlowKindType(o.kind)),
        ("sourcePropagation", printOption(F, o.sourcePropagation, printEmv2Propagation _)),
        ("sinkPropagation", printOption(F, o.sinkPropagation, printEmv2Propagation _)),
        ("uriFrag", printString(o.uriFrag))
      ))
    }

    @pure def printEmv2BehaviorSection(o: Emv2BehaviorSection): ST = {
      return printObject(ISZ(
        ("type", st""""Emv2BehaviorSection""""),
        ("events", printISZ(F, o.events, printErrorEvent _)),
        ("transitions", printISZ(F, o.transitions, printErrorTransition _)),
        ("propagations", printISZ(F, o.propagations, printErrorPropagation _))
      ))
    }

    @pure def printErrorPropagation(o: ErrorPropagation): ST = {
      return printObject(ISZ(
        ("type", st""""ErrorPropagation""""),
        ("id", printOption(F, o.id, printName _)),
        ("source", printISZ(F, o.source, printName _)),
        ("condition", printOption(F, o.condition, printErrorCondition _)),
        ("target", printISZ(F, o.target, printEmv2Propagation _))
      ))
    }

    @pure def printGclSymbol(o: GclSymbol): ST = {
      o match {
        case o: GclSubclause => return printGclSubclause(o)
        case o: GclMethod => return printGclMethod(o)
        case o: GclStateVar => return printGclStateVar(o)
        case o: GclInvariant => return printGclInvariant(o)
        case o: GclAssume => return printGclAssume(o)
        case o: GclGuarantee => return printGclGuarantee(o)
        case o: GclIntegration => return printGclIntegration(o)
        case o: GclCaseStatement => return printGclCaseStatement(o)
        case o: GclInitialize => return printGclInitialize(o)
        case o: GclCompute => return printGclCompute(o)
        case o: GclHandle => return printGclHandle(o)
        case o: GclTODO => return printGclTODO(o)
        case o: GclLib => return printGclLib(o)
        case o: InfoFlowClause => return printInfoFlowClause(o)
      }
    }

    @pure def printGclSubclause(o: GclSubclause): ST = {
      return printObject(ISZ(
        ("type", st""""GclSubclause""""),
        ("state", printISZ(F, o.state, printGclStateVar _)),
        ("methods", printISZ(F, o.methods, printGclMethod _)),
        ("invariants", printISZ(F, o.invariants, printGclInvariant _)),
        ("initializes", printOption(F, o.initializes, printGclInitialize _)),
        ("integration", printOption(F, o.integration, printGclIntegration _)),
        ("compute", printOption(F, o.compute, printGclCompute _))
      ))
    }

    @pure def printGclMethod(o: GclMethod): ST = {
      return printObject(ISZ(
        ("type", st""""GclMethod""""),
        ("method", print_langastStmtMethod(o.method))
      ))
    }

    @pure def printGclStateVar(o: GclStateVar): ST = {
      return printObject(ISZ(
        ("type", st""""GclStateVar""""),
        ("name", printString(o.name)),
        ("classifier", printString(o.classifier)),
        ("posOpt", printOption(F, o.posOpt, printPosition _))
      ))
    }

    @pure def printGclClause(o: GclClause): ST = {
      o match {
        case o: GclInvariant => return printGclInvariant(o)
        case o: GclAssume => return printGclAssume(o)
        case o: GclGuarantee => return printGclGuarantee(o)
        case o: InfoFlowClause => return printInfoFlowClause(o)
      }
    }

    @pure def printGclSpec(o: GclSpec): ST = {
      o match {
        case o: GclInvariant => return printGclInvariant(o)
        case o: GclAssume => return printGclAssume(o)
        case o: GclGuarantee => return printGclGuarantee(o)
      }
    }

    @pure def printGclInvariant(o: GclInvariant): ST = {
      return printObject(ISZ(
        ("type", st""""GclInvariant""""),
        ("id", printString(o.id)),
        ("descriptor", printOption(T, o.descriptor, printString _)),
        ("exp", print_langastExp(o.exp)),
        ("posOpt", printOption(F, o.posOpt, printPosition _))
      ))
    }

    @pure def printGclComputeSpec(o: GclComputeSpec): ST = {
      o match {
        case o: GclAssume => return printGclAssume(o)
        case o: GclGuarantee => return printGclGuarantee(o)
      }
    }

    @pure def printGclAssume(o: GclAssume): ST = {
      return printObject(ISZ(
        ("type", st""""GclAssume""""),
        ("id", printString(o.id)),
        ("descriptor", printOption(T, o.descriptor, printString _)),
        ("exp", print_langastExp(o.exp)),
        ("posOpt", printOption(F, o.posOpt, printPosition _))
      ))
    }

    @pure def printGclGuarantee(o: GclGuarantee): ST = {
      return printObject(ISZ(
        ("type", st""""GclGuarantee""""),
        ("id", printString(o.id)),
        ("descriptor", printOption(T, o.descriptor, printString _)),
        ("exp", print_langastExp(o.exp)),
        ("posOpt", printOption(F, o.posOpt, printPosition _))
      ))
    }

    @pure def printGclIntegration(o: GclIntegration): ST = {
      return printObject(ISZ(
        ("type", st""""GclIntegration""""),
        ("specs", printISZ(F, o.specs, printGclSpec _))
      ))
    }

    @pure def printGclCaseStatement(o: GclCaseStatement): ST = {
      return printObject(ISZ(
        ("type", st""""GclCaseStatement""""),
        ("id", printString(o.id)),
        ("descriptor", printOption(T, o.descriptor, printString _)),
        ("assumes", print_langastExp(o.assumes)),
        ("guarantees", print_langastExp(o.guarantees)),
        ("posOpt", printOption(F, o.posOpt, printPosition _))
      ))
    }

    @pure def printGclInitialize(o: GclInitialize): ST = {
      return printObject(ISZ(
        ("type", st""""GclInitialize""""),
        ("modifies", printISZ(F, o.modifies, print_langastExp _)),
        ("guarantees", printISZ(F, o.guarantees, printGclGuarantee _)),
        ("flows", printISZ(F, o.flows, printInfoFlowClause _))
      ))
    }

    @pure def printGclCompute(o: GclCompute): ST = {
      return printObject(ISZ(
        ("type", st""""GclCompute""""),
        ("modifies", printISZ(F, o.modifies, print_langastExp _)),
        ("specs", printISZ(F, o.specs, printGclComputeSpec _)),
        ("cases", printISZ(F, o.cases, printGclCaseStatement _)),
        ("handlers", printISZ(F, o.handlers, printGclHandle _)),
        ("flows", printISZ(F, o.flows, printInfoFlowClause _))
      ))
    }

    @pure def printGclHandle(o: GclHandle): ST = {
      return printObject(ISZ(
        ("type", st""""GclHandle""""),
        ("port", print_langastExp(o.port)),
        ("modifies", printISZ(F, o.modifies, print_langastExp _)),
        ("guarantees", printISZ(F, o.guarantees, printGclGuarantee _))
      ))
    }

    @pure def printGclTODO(o: GclTODO): ST = {
      return printObject(ISZ(
        ("type", st""""GclTODO"""")
      ))
    }

    @pure def printGclLib(o: GclLib): ST = {
      return printObject(ISZ(
        ("type", st""""GclLib""""),
        ("containingPackage", printName(o.containingPackage)),
        ("methods", printISZ(F, o.methods, printGclMethod _))
      ))
    }

    @pure def printInfoFlowClause(o: InfoFlowClause): ST = {
      return printObject(ISZ(
        ("type", st""""InfoFlowClause""""),
        ("id", printString(o.id)),
        ("descriptor", printOption(T, o.descriptor, printString _)),
        ("from", printISZ(F, o.from, print_langastExp _)),
        ("to", printISZ(F, o.to, print_langastExp _)),
        ("posOpt", printOption(F, o.posOpt, printPosition _))
      ))
    }

    @pure def printSmfAnnex(o: SmfAnnex): ST = {
      o match {
        case o: SmfClause => return printSmfClause(o)
        case o: SmfClassification => return printSmfClassification(o)
        case o: SmfDeclass => return printSmfDeclass(o)
        case o: SmfType => return printSmfType(o)
      }
    }

    @pure def printSmfLib(o: SmfLib): ST = {
      o match {
        case o: SmfLibrary => return printSmfLibrary(o)
      }
    }

    @pure def printSmfClause(o: SmfClause): ST = {
      return printObject(ISZ(
        ("type", st""""SmfClause""""),
        ("classification", printISZ(F, o.classification, printSmfClassification _)),
        ("declass", printISZ(F, o.declass, printSmfDeclass _))
      ))
    }

    @pure def printSmfClassification(o: SmfClassification): ST = {
      return printObject(ISZ(
        ("type", st""""SmfClassification""""),
        ("portName", printName(o.portName)),
        ("typeName", printName(o.typeName))
      ))
    }

    @pure def printSmfDeclass(o: SmfDeclass): ST = {
      return printObject(ISZ(
        ("type", st""""SmfDeclass""""),
        ("flowName", printName(o.flowName)),
        ("srcType", printOption(F, o.srcType, printName _)),
        ("snkType", printName(o.snkType))
      ))
    }

    @pure def printSmfLibrary(o: SmfLibrary): ST = {
      return printObject(ISZ(
        ("type", st""""SmfLibrary""""),
        ("types", printISZ(F, o.types, printSmfType _))
      ))
    }

    @pure def printSmfType(o: SmfType): ST = {
      return printObject(ISZ(
        ("type", st""""SmfType""""),
        ("typeName", printName(o.typeName)),
        ("parentType", printISZ(F, o.parentType, printName _))
      ))
    }

    @pure def print_langastTopUnit(o: org.sireum.lang.ast.TopUnit): ST = {
      o match {
        case o: org.sireum.lang.ast.TopUnit.Program => return print_langastTopUnitProgram(o)
        case o: org.sireum.lang.ast.TopUnit.TruthTableUnit => return print_langastTopUnitTruthTableUnit(o)
      }
    }

    @pure def print_langastTopUnitProgram(o: org.sireum.lang.ast.TopUnit.Program): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.TopUnit.Program""""),
        ("fileUriOpt", printOption(T, o.fileUriOpt, printString _)),
        ("packageName", print_langastName(o.packageName)),
        ("body", print_langastBody(o.body))
      ))
    }

    @pure def print_langastTopUnitTruthTableUnit(o: org.sireum.lang.ast.TopUnit.TruthTableUnit): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.TopUnit.TruthTableUnit""""),
        ("fileUriOpt", printOption(T, o.fileUriOpt, printString _)),
        ("stars", printISZ(F, o.stars, printPosition _)),
        ("vars", printISZ(F, o.vars, print_langastId _)),
        ("separator", printPosition(o.separator)),
        ("isSequent", printB(o.isSequent)),
        ("sequent", print_langastSequent(o.sequent)),
        ("rows", printISZ(F, o.rows, print_langastTruthTableRow _)),
        ("conclusionOpt", printOption(F, o.conclusionOpt, print_langastTruthTableConclusion _))
      ))
    }

    @pure def print_langastStmt(o: org.sireum.lang.ast.Stmt): ST = {
      o match {
        case o: org.sireum.lang.ast.Stmt.Import => return print_langastStmtImport(o)
        case o: org.sireum.lang.ast.Stmt.Var => return print_langastStmtVar(o)
        case o: org.sireum.lang.ast.Stmt.VarPattern => return print_langastStmtVarPattern(o)
        case o: org.sireum.lang.ast.Stmt.SpecVar => return print_langastStmtSpecVar(o)
        case o: org.sireum.lang.ast.Stmt.Method => return print_langastStmtMethod(o)
        case o: org.sireum.lang.ast.Stmt.ExtMethod => return print_langastStmtExtMethod(o)
        case o: org.sireum.lang.ast.Stmt.JustMethod => return print_langastStmtJustMethod(o)
        case o: org.sireum.lang.ast.Stmt.SpecMethod => return print_langastStmtSpecMethod(o)
        case o: org.sireum.lang.ast.Stmt.Enum => return print_langastStmtEnum(o)
        case o: org.sireum.lang.ast.Stmt.SubZ => return print_langastStmtSubZ(o)
        case o: org.sireum.lang.ast.Stmt.Object => return print_langastStmtObject(o)
        case o: org.sireum.lang.ast.Stmt.Sig => return print_langastStmtSig(o)
        case o: org.sireum.lang.ast.Stmt.Adt => return print_langastStmtAdt(o)
        case o: org.sireum.lang.ast.Stmt.TypeAlias => return print_langastStmtTypeAlias(o)
        case o: org.sireum.lang.ast.Stmt.Assign => return print_langastStmtAssign(o)
        case o: org.sireum.lang.ast.Stmt.Block => return print_langastStmtBlock(o)
        case o: org.sireum.lang.ast.Stmt.If => return print_langastStmtIf(o)
        case o: org.sireum.lang.ast.Stmt.Match => return print_langastStmtMatch(o)
        case o: org.sireum.lang.ast.Stmt.While => return print_langastStmtWhile(o)
        case o: org.sireum.lang.ast.Stmt.DoWhile => return print_langastStmtDoWhile(o)
        case o: org.sireum.lang.ast.Stmt.For => return print_langastStmtFor(o)
        case o: org.sireum.lang.ast.Stmt.Return => return print_langastStmtReturn(o)
        case o: org.sireum.lang.ast.Stmt.Expr => return print_langastStmtExpr(o)
        case o: org.sireum.lang.ast.Stmt.Fact => return print_langastStmtFact(o)
        case o: org.sireum.lang.ast.Stmt.Inv => return print_langastStmtInv(o)
        case o: org.sireum.lang.ast.Stmt.Theorem => return print_langastStmtTheorem(o)
        case o: org.sireum.lang.ast.Stmt.DataRefinement => return print_langastStmtDataRefinement(o)
        case o: org.sireum.lang.ast.Stmt.SpecLabel => return print_langastStmtSpecLabel(o)
        case o: org.sireum.lang.ast.Stmt.SpecBlock => return print_langastStmtSpecBlock(o)
        case o: org.sireum.lang.ast.Stmt.DeduceSequent => return print_langastStmtDeduceSequent(o)
        case o: org.sireum.lang.ast.Stmt.DeduceSteps => return print_langastStmtDeduceSteps(o)
        case o: org.sireum.lang.ast.Stmt.Havoc => return print_langastStmtHavoc(o)
      }
    }

    @pure def print_langastHasModifies(o: org.sireum.lang.ast.HasModifies): ST = {
      o match {
        case o: org.sireum.lang.ast.LoopContract => return print_langastLoopContract(o)
        case o: org.sireum.lang.ast.MethodContract.Simple => return print_langastMethodContractSimple(o)
        case o: org.sireum.lang.ast.MethodContract.Cases => return print_langastMethodContractCases(o)
      }
    }

    @pure def print_langastLoopContract(o: org.sireum.lang.ast.LoopContract): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.LoopContract""""),
        ("invariants", printISZ(F, o.invariants, print_langastExp _)),
        ("modifies", printISZ(F, o.modifies, print_langastExpRef _)),
        ("maxItOpt", printOption(F, o.maxItOpt, print_langastExpLitZ _))
      ))
    }

    @pure def print_langastStmtImport(o: org.sireum.lang.ast.Stmt.Import): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Stmt.Import""""),
        ("importers", printISZ(F, o.importers, print_langastStmtImportImporter _)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastStmtImportImporter(o: org.sireum.lang.ast.Stmt.Import.Importer): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Stmt.Import.Importer""""),
        ("name", print_langastName(o.name)),
        ("selectorOpt", printOption(F, o.selectorOpt, print_langastStmtImportSelector _))
      ))
    }

    @pure def print_langastStmtImportSelector(o: org.sireum.lang.ast.Stmt.Import.Selector): ST = {
      o match {
        case o: org.sireum.lang.ast.Stmt.Import.MultiSelector => return print_langastStmtImportMultiSelector(o)
        case o: org.sireum.lang.ast.Stmt.Import.WildcardSelector => return print_langastStmtImportWildcardSelector(o)
      }
    }

    @pure def print_langastStmtImportMultiSelector(o: org.sireum.lang.ast.Stmt.Import.MultiSelector): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Stmt.Import.MultiSelector""""),
        ("selectors", printISZ(F, o.selectors, print_langastStmtImportNamedSelector _))
      ))
    }

    @pure def print_langastStmtImportWildcardSelector(o: org.sireum.lang.ast.Stmt.Import.WildcardSelector): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Stmt.Import.WildcardSelector"""")
      ))
    }

    @pure def print_langastStmtImportNamedSelector(o: org.sireum.lang.ast.Stmt.Import.NamedSelector): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Stmt.Import.NamedSelector""""),
        ("from", print_langastId(o.from)),
        ("to", print_langastId(o.to))
      ))
    }

    @pure def print_langastStmtVar(o: org.sireum.lang.ast.Stmt.Var): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Stmt.Var""""),
        ("isSpec", printB(o.isSpec)),
        ("isVal", printB(o.isVal)),
        ("id", print_langastId(o.id)),
        ("tipeOpt", printOption(F, o.tipeOpt, print_langastType _)),
        ("initOpt", printOption(F, o.initOpt, print_langastAssignExp _)),
        ("attr", print_langastResolvedAttr(o.attr))
      ))
    }

    @pure def print_langastStmtVarPattern(o: org.sireum.lang.ast.Stmt.VarPattern): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Stmt.VarPattern""""),
        ("isSpec", printB(o.isSpec)),
        ("isVal", printB(o.isVal)),
        ("pattern", print_langastPattern(o.pattern)),
        ("tipeOpt", printOption(F, o.tipeOpt, print_langastType _)),
        ("init", print_langastAssignExp(o.init)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastStmtSpecVar(o: org.sireum.lang.ast.Stmt.SpecVar): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Stmt.SpecVar""""),
        ("isVal", printB(o.isVal)),
        ("id", print_langastId(o.id)),
        ("tipe", print_langastType(o.tipe)),
        ("attr", print_langastResolvedAttr(o.attr))
      ))
    }

    @pure def print_langastStmtMethod(o: org.sireum.lang.ast.Stmt.Method): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Stmt.Method""""),
        ("typeChecked", printB(o.typeChecked)),
        ("purity", print_langastPurityType(o.purity)),
        ("hasOverride", printB(o.hasOverride)),
        ("isHelper", printB(o.isHelper)),
        ("sig", print_langastMethodSig(o.sig)),
        ("mcontract", print_langastMethodContract(o.mcontract)),
        ("bodyOpt", printOption(F, o.bodyOpt, print_langastBody _)),
        ("attr", print_langastResolvedAttr(o.attr))
      ))
    }

    @pure def print_langastStmtExtMethod(o: org.sireum.lang.ast.Stmt.ExtMethod): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Stmt.ExtMethod""""),
        ("isPure", printB(o.isPure)),
        ("sig", print_langastMethodSig(o.sig)),
        ("contract", print_langastMethodContract(o.contract)),
        ("attr", print_langastResolvedAttr(o.attr))
      ))
    }

    @pure def print_langastStmtJustMethod(o: org.sireum.lang.ast.Stmt.JustMethod): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Stmt.JustMethod""""),
        ("etaOpt", printOption(F, o.etaOpt, print_langastExpLitString _)),
        ("sig", print_langastMethodSig(o.sig)),
        ("attr", print_langastResolvedAttr(o.attr))
      ))
    }

    @pure def print_langastStmtSpecMethod(o: org.sireum.lang.ast.Stmt.SpecMethod): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Stmt.SpecMethod""""),
        ("sig", print_langastMethodSig(o.sig)),
        ("attr", print_langastResolvedAttr(o.attr))
      ))
    }

    @pure def print_langastStmtEnum(o: org.sireum.lang.ast.Stmt.Enum): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Stmt.Enum""""),
        ("id", print_langastId(o.id)),
        ("elements", printISZ(F, o.elements, print_langastId _)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastStmtSubZ(o: org.sireum.lang.ast.Stmt.SubZ): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Stmt.SubZ""""),
        ("id", print_langastId(o.id)),
        ("isSigned", printB(o.isSigned)),
        ("isBitVector", printB(o.isBitVector)),
        ("isWrapped", printB(o.isWrapped)),
        ("hasMin", printB(o.hasMin)),
        ("hasMax", printB(o.hasMax)),
        ("bitWidth", printZ(o.bitWidth)),
        ("min", printZ(o.min)),
        ("max", printZ(o.max)),
        ("isIndex", printB(o.isIndex)),
        ("index", printZ(o.index)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastStmtObject(o: org.sireum.lang.ast.Stmt.Object): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Stmt.Object""""),
        ("isApp", printB(o.isApp)),
        ("extNameOpt", printOption(T, o.extNameOpt, printString _)),
        ("id", print_langastId(o.id)),
        ("stmts", printISZ(F, o.stmts, print_langastStmt _)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastStmtSig(o: org.sireum.lang.ast.Stmt.Sig): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Stmt.Sig""""),
        ("isImmutable", printB(o.isImmutable)),
        ("isSealed", printB(o.isSealed)),
        ("isExt", printB(o.isExt)),
        ("id", print_langastId(o.id)),
        ("typeParams", printISZ(F, o.typeParams, print_langastTypeParam _)),
        ("parents", printISZ(F, o.parents, print_langastTypeNamed _)),
        ("stmts", printISZ(F, o.stmts, print_langastStmt _)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastStmtAdt(o: org.sireum.lang.ast.Stmt.Adt): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Stmt.Adt""""),
        ("isRoot", printB(o.isRoot)),
        ("isDatatype", printB(o.isDatatype)),
        ("id", print_langastId(o.id)),
        ("typeParams", printISZ(F, o.typeParams, print_langastTypeParam _)),
        ("params", printISZ(F, o.params, print_langastAdtParam _)),
        ("parents", printISZ(F, o.parents, print_langastTypeNamed _)),
        ("stmts", printISZ(F, o.stmts, print_langastStmt _)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastStmtTypeAlias(o: org.sireum.lang.ast.Stmt.TypeAlias): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Stmt.TypeAlias""""),
        ("id", print_langastId(o.id)),
        ("typeParams", printISZ(F, o.typeParams, print_langastTypeParam _)),
        ("tipe", print_langastType(o.tipe)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastStmtAssign(o: org.sireum.lang.ast.Stmt.Assign): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Stmt.Assign""""),
        ("lhs", print_langastExp(o.lhs)),
        ("rhs", print_langastAssignExp(o.rhs)),
        ("deduceOldLhsOpt", printOption(F, o.deduceOldLhsOpt, print_langastExp _)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastStmtBlock(o: org.sireum.lang.ast.Stmt.Block): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Stmt.Block""""),
        ("body", print_langastBody(o.body)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastStmtIf(o: org.sireum.lang.ast.Stmt.If): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Stmt.If""""),
        ("cond", print_langastExp(o.cond)),
        ("thenBody", print_langastBody(o.thenBody)),
        ("elseBody", print_langastBody(o.elseBody)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastStmtMatch(o: org.sireum.lang.ast.Stmt.Match): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Stmt.Match""""),
        ("exp", print_langastExp(o.exp)),
        ("cases", printISZ(F, o.cases, print_langastCase _)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastStmtWhile(o: org.sireum.lang.ast.Stmt.While): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Stmt.While""""),
        ("context", printISZ(T, o.context, printString _)),
        ("cond", print_langastExp(o.cond)),
        ("contract", print_langastLoopContract(o.contract)),
        ("body", print_langastBody(o.body)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastStmtDoWhile(o: org.sireum.lang.ast.Stmt.DoWhile): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Stmt.DoWhile""""),
        ("context", printISZ(T, o.context, printString _)),
        ("cond", print_langastExp(o.cond)),
        ("contract", print_langastLoopContract(o.contract)),
        ("body", print_langastBody(o.body)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastStmtFor(o: org.sireum.lang.ast.Stmt.For): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Stmt.For""""),
        ("context", printISZ(T, o.context, printString _)),
        ("enumGens", printISZ(F, o.enumGens, print_langastEnumGenFor _)),
        ("body", print_langastBody(o.body)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastStmtReturn(o: org.sireum.lang.ast.Stmt.Return): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Stmt.Return""""),
        ("expOpt", printOption(F, o.expOpt, print_langastExp _)),
        ("attr", print_langastTypedAttr(o.attr))
      ))
    }

    @pure def print_langastStmtExpr(o: org.sireum.lang.ast.Stmt.Expr): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Stmt.Expr""""),
        ("exp", print_langastExp(o.exp)),
        ("attr", print_langastTypedAttr(o.attr))
      ))
    }

    @pure def print_langastStmtSpec(o: org.sireum.lang.ast.Stmt.Spec): ST = {
      o match {
        case o: org.sireum.lang.ast.Stmt.Fact => return print_langastStmtFact(o)
        case o: org.sireum.lang.ast.Stmt.Inv => return print_langastStmtInv(o)
        case o: org.sireum.lang.ast.Stmt.Theorem => return print_langastStmtTheorem(o)
        case o: org.sireum.lang.ast.Stmt.DataRefinement => return print_langastStmtDataRefinement(o)
        case o: org.sireum.lang.ast.Stmt.SpecLabel => return print_langastStmtSpecLabel(o)
        case o: org.sireum.lang.ast.Stmt.SpecBlock => return print_langastStmtSpecBlock(o)
        case o: org.sireum.lang.ast.Stmt.DeduceSequent => return print_langastStmtDeduceSequent(o)
        case o: org.sireum.lang.ast.Stmt.DeduceSteps => return print_langastStmtDeduceSteps(o)
        case o: org.sireum.lang.ast.Stmt.Havoc => return print_langastStmtHavoc(o)
      }
    }

    @pure def print_langastStmtFact(o: org.sireum.lang.ast.Stmt.Fact): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Stmt.Fact""""),
        ("id", print_langastId(o.id)),
        ("typeParams", printISZ(F, o.typeParams, print_langastTypeParam _)),
        ("descOpt", printOption(F, o.descOpt, print_langastExpLitString _)),
        ("claims", printISZ(F, o.claims, print_langastExp _)),
        ("isFun", printB(o.isFun)),
        ("attr", print_langastResolvedAttr(o.attr))
      ))
    }

    @pure def print_langastStmtInv(o: org.sireum.lang.ast.Stmt.Inv): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Stmt.Inv""""),
        ("id", print_langastId(o.id)),
        ("claims", printISZ(F, o.claims, print_langastExp _)),
        ("attr", print_langastResolvedAttr(o.attr))
      ))
    }

    @pure def print_langastStmtTheorem(o: org.sireum.lang.ast.Stmt.Theorem): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Stmt.Theorem""""),
        ("isLemma", printB(o.isLemma)),
        ("id", print_langastId(o.id)),
        ("typeParams", printISZ(F, o.typeParams, print_langastTypeParam _)),
        ("descOpt", printOption(F, o.descOpt, print_langastExpLitString _)),
        ("claim", print_langastExp(o.claim)),
        ("isFun", printB(o.isFun)),
        ("proof", print_langastProofAst(o.proof)),
        ("attr", print_langastResolvedAttr(o.attr))
      ))
    }

    @pure def print_langastStmtDataRefinement(o: org.sireum.lang.ast.Stmt.DataRefinement): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Stmt.DataRefinement""""),
        ("rep", print_langastExpRef(o.rep)),
        ("refs", printISZ(F, o.refs, print_langastExpRef _)),
        ("claims", printISZ(F, o.claims, print_langastExp _)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastStmtSpecLabel(o: org.sireum.lang.ast.Stmt.SpecLabel): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Stmt.SpecLabel""""),
        ("id", print_langastId(o.id))
      ))
    }

    @pure def print_langastStmtSpecBlock(o: org.sireum.lang.ast.Stmt.SpecBlock): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Stmt.SpecBlock""""),
        ("block", print_langastStmtBlock(o.block))
      ))
    }

    @pure def print_langastStmtDeduceSequent(o: org.sireum.lang.ast.Stmt.DeduceSequent): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Stmt.DeduceSequent""""),
        ("justOpt", printOption(F, o.justOpt, print_langastExpLitString _)),
        ("sequents", printISZ(F, o.sequents, print_langastSequent _)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastStmtDeduceSteps(o: org.sireum.lang.ast.Stmt.DeduceSteps): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Stmt.DeduceSteps""""),
        ("steps", printISZ(F, o.steps, print_langastProofAstStep _)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastStmtHavoc(o: org.sireum.lang.ast.Stmt.Havoc): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Stmt.Havoc""""),
        ("args", printISZ(F, o.args, print_langastExpRef _)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastMethodContract(o: org.sireum.lang.ast.MethodContract): ST = {
      o match {
        case o: org.sireum.lang.ast.MethodContract.Simple => return print_langastMethodContractSimple(o)
        case o: org.sireum.lang.ast.MethodContract.Cases => return print_langastMethodContractCases(o)
      }
    }

    @pure def print_langastMethodContractAccesses(o: org.sireum.lang.ast.MethodContract.Accesses): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.MethodContract.Accesses""""),
        ("refs", printISZ(F, o.refs, print_langastExpRef _)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastMethodContractClaims(o: org.sireum.lang.ast.MethodContract.Claims): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.MethodContract.Claims""""),
        ("claims", printISZ(F, o.claims, print_langastExp _)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastMethodContractSimple(o: org.sireum.lang.ast.MethodContract.Simple): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.MethodContract.Simple""""),
        ("readsClause", print_langastMethodContractAccesses(o.readsClause)),
        ("requiresClause", print_langastMethodContractClaims(o.requiresClause)),
        ("modifiesClause", print_langastMethodContractAccesses(o.modifiesClause)),
        ("ensuresClause", print_langastMethodContractClaims(o.ensuresClause)),
        ("infoFlowsClause", print_langastMethodContractInfoFlows(o.infoFlowsClause)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastMethodContractCases(o: org.sireum.lang.ast.MethodContract.Cases): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.MethodContract.Cases""""),
        ("readsClause", print_langastMethodContractAccesses(o.readsClause)),
        ("modifiesClause", print_langastMethodContractAccesses(o.modifiesClause)),
        ("cases", printISZ(F, o.cases, print_langastMethodContractCase _)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastMethodContractCase(o: org.sireum.lang.ast.MethodContract.Case): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.MethodContract.Case""""),
        ("label", print_langastExpLitString(o.label)),
        ("requiresClause", print_langastMethodContractClaims(o.requiresClause)),
        ("ensuresClause", print_langastMethodContractClaims(o.ensuresClause))
      ))
    }

    @pure def print_langastMethodContractInfoFlowElement(o: org.sireum.lang.ast.MethodContract.InfoFlowElement): ST = {
      o match {
        case o: org.sireum.lang.ast.MethodContract.InfoFlowGroup => return print_langastMethodContractInfoFlowGroup(o)
        case o: org.sireum.lang.ast.MethodContract.InfoFlowFlow => return print_langastMethodContractInfoFlowFlow(o)
        case o: org.sireum.lang.ast.MethodContract.InfoFlowCase => return print_langastMethodContractInfoFlowCase(o)
      }
    }

    @pure def print_langastMethodContractInfoFlows(o: org.sireum.lang.ast.MethodContract.InfoFlows): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.MethodContract.InfoFlows""""),
        ("flows", printISZ(F, o.flows, print_langastMethodContractInfoFlowElement _)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastMethodContractInfoFlowGroup(o: org.sireum.lang.ast.MethodContract.InfoFlowGroup): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.MethodContract.InfoFlowGroup""""),
        ("label", print_langastExpLitString(o.label)),
        ("membersClause", print_langastMethodContractClaims(o.membersClause))
      ))
    }

    @pure def print_langastMethodContractInfoFlowFlow(o: org.sireum.lang.ast.MethodContract.InfoFlowFlow): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.MethodContract.InfoFlowFlow""""),
        ("label", print_langastExpLitString(o.label)),
        ("fromClause", print_langastMethodContractClaims(o.fromClause)),
        ("toClause", print_langastMethodContractClaims(o.toClause))
      ))
    }

    @pure def print_langastMethodContractInfoFlowCase(o: org.sireum.lang.ast.MethodContract.InfoFlowCase): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.MethodContract.InfoFlowCase""""),
        ("label", print_langastExpLitString(o.label)),
        ("requiresClause", print_langastMethodContractClaims(o.requiresClause)),
        ("inAgreeClause", print_langastMethodContractClaims(o.inAgreeClause)),
        ("outAgreeClause", print_langastMethodContractClaims(o.outAgreeClause))
      ))
    }

    @pure def print_langastSequent(o: org.sireum.lang.ast.Sequent): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Sequent""""),
        ("premises", printISZ(F, o.premises, print_langastExp _)),
        ("conclusion", print_langastExp(o.conclusion)),
        ("steps", printISZ(F, o.steps, print_langastProofAstStep _)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastProofAst(o: org.sireum.lang.ast.ProofAst): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.ProofAst""""),
        ("steps", printISZ(F, o.steps, print_langastProofAstStep _)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastProofAstStep(o: org.sireum.lang.ast.ProofAst.Step): ST = {
      o match {
        case o: org.sireum.lang.ast.ProofAst.Step.Regular => return print_langastProofAstStepRegular(o)
        case o: org.sireum.lang.ast.ProofAst.Step.Assume => return print_langastProofAstStepAssume(o)
        case o: org.sireum.lang.ast.ProofAst.Step.Assert => return print_langastProofAstStepAssert(o)
        case o: org.sireum.lang.ast.ProofAst.Step.SubProof => return print_langastProofAstStepSubProof(o)
        case o: org.sireum.lang.ast.ProofAst.Step.Let => return print_langastProofAstStepLet(o)
        case o: org.sireum.lang.ast.ProofAst.Step.StructInduction => return print_langastProofAstStepStructInduction(o)
      }
    }

    @pure def print_langastProofAstStepId(o: org.sireum.lang.ast.ProofAst.StepId): ST = {
      o match {
        case o: org.sireum.lang.ast.ProofAst.StepId.Num => return print_langastProofAstStepIdNum(o)
        case o: org.sireum.lang.ast.ProofAst.StepId.Str => return print_langastProofAstStepIdStr(o)
      }
    }

    @pure def print_langastProofAstStepIdNum(o: org.sireum.lang.ast.ProofAst.StepId.Num): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.ProofAst.StepId.Num""""),
        ("no", printZ(o.no)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastProofAstStepIdStr(o: org.sireum.lang.ast.ProofAst.StepId.Str): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.ProofAst.StepId.Str""""),
        ("isSynthetic", printB(o.isSynthetic)),
        ("value", printString(o.value)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastProofAstStepRegular(o: org.sireum.lang.ast.ProofAst.Step.Regular): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.ProofAst.Step.Regular""""),
        ("id", print_langastProofAstStepId(o.id)),
        ("claim", print_langastExp(o.claim)),
        ("just", print_langastProofAstStepJustification(o.just))
      ))
    }

    @pure def print_langastProofAstStepAssume(o: org.sireum.lang.ast.ProofAst.Step.Assume): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.ProofAst.Step.Assume""""),
        ("id", print_langastProofAstStepId(o.id)),
        ("claim", print_langastExp(o.claim))
      ))
    }

    @pure def print_langastProofAstStepAssert(o: org.sireum.lang.ast.ProofAst.Step.Assert): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.ProofAst.Step.Assert""""),
        ("id", print_langastProofAstStepId(o.id)),
        ("claim", print_langastExp(o.claim)),
        ("steps", printISZ(F, o.steps, print_langastProofAstStep _))
      ))
    }

    @pure def print_langastProofAstStepSubProof(o: org.sireum.lang.ast.ProofAst.Step.SubProof): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.ProofAst.Step.SubProof""""),
        ("id", print_langastProofAstStepId(o.id)),
        ("steps", printISZ(F, o.steps, print_langastProofAstStep _))
      ))
    }

    @pure def print_langastProofAstStepLet(o: org.sireum.lang.ast.ProofAst.Step.Let): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.ProofAst.Step.Let""""),
        ("id", print_langastProofAstStepId(o.id)),
        ("params", printISZ(F, o.params, print_langastProofAstStepLetParam _)),
        ("steps", printISZ(F, o.steps, print_langastProofAstStep _))
      ))
    }

    @pure def print_langastProofAstStepLetParam(o: org.sireum.lang.ast.ProofAst.Step.Let.Param): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.ProofAst.Step.Let.Param""""),
        ("id", print_langastId(o.id)),
        ("tipeOpt", printOption(F, o.tipeOpt, print_langastType _))
      ))
    }

    @pure def print_langastProofAstStepStructInduction(o: org.sireum.lang.ast.ProofAst.Step.StructInduction): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.ProofAst.Step.StructInduction""""),
        ("id", print_langastProofAstStepId(o.id)),
        ("claim", print_langastExp(o.claim)),
        ("exp", print_langastExp(o.exp)),
        ("cases", printISZ(F, o.cases, print_langastProofAstStepStructInductionMatchCase _)),
        ("defaultOpt", printOption(F, o.defaultOpt, print_langastProofAstStepStructInductionMatchDefault _))
      ))
    }

    @pure def print_langastProofAstStepStructInductionMatchCase(o: org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase""""),
        ("pattern", print_langastPatternStructure(o.pattern)),
        ("hypoOpt", printOption(F, o.hypoOpt, print_langastProofAstStepAssume _)),
        ("steps", printISZ(F, o.steps, print_langastProofAstStep _))
      ))
    }

    @pure def print_langastProofAstStepStructInductionMatchDefault(o: org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault""""),
        ("hypoOpt", printOption(F, o.hypoOpt, print_langastProofAstStepAssume _)),
        ("steps", printISZ(F, o.steps, print_langastProofAstStep _))
      ))
    }

    @pure def print_langastProofAstStepJustification(o: org.sireum.lang.ast.ProofAst.Step.Justification): ST = {
      o match {
        case o: org.sireum.lang.ast.ProofAst.Step.Justification.Ref => return print_langastProofAstStepJustificationRef(o)
        case o: org.sireum.lang.ast.ProofAst.Step.Justification.Apply => return print_langastProofAstStepJustificationApply(o)
        case o: org.sireum.lang.ast.ProofAst.Step.Justification.ApplyNamed => return print_langastProofAstStepJustificationApplyNamed(o)
        case o: org.sireum.lang.ast.ProofAst.Step.Justification.ApplyEta => return print_langastProofAstStepJustificationApplyEta(o)
      }
    }

    @pure def print_langastProofAstStepJustificationRef(o: org.sireum.lang.ast.ProofAst.Step.Justification.Ref): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.ProofAst.Step.Justification.Ref""""),
        ("ref", print_langastExpRef(o.ref)),
        ("hasWitness", printB(o.hasWitness)),
        ("witnesses", printISZ(F, o.witnesses, print_langastProofAstStepId _))
      ))
    }

    @pure def print_langastProofAstStepJustificationApply(o: org.sireum.lang.ast.ProofAst.Step.Justification.Apply): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.ProofAst.Step.Justification.Apply""""),
        ("invoke", print_langastExpInvoke(o.invoke)),
        ("hasWitness", printB(o.hasWitness)),
        ("witnesses", printISZ(F, o.witnesses, print_langastProofAstStepId _))
      ))
    }

    @pure def print_langastProofAstStepJustificationApplyNamed(o: org.sireum.lang.ast.ProofAst.Step.Justification.ApplyNamed): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.ProofAst.Step.Justification.ApplyNamed""""),
        ("invoke", print_langastExpInvokeNamed(o.invoke)),
        ("hasWitness", printB(o.hasWitness)),
        ("witnesses", printISZ(F, o.witnesses, print_langastProofAstStepId _))
      ))
    }

    @pure def print_langastProofAstStepJustificationApplyEta(o: org.sireum.lang.ast.ProofAst.Step.Justification.ApplyEta): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.ProofAst.Step.Justification.ApplyEta""""),
        ("eta", print_langastExpEta(o.eta)),
        ("hasWitness", printB(o.hasWitness)),
        ("witnesses", printISZ(F, o.witnesses, print_langastProofAstStepId _))
      ))
    }

    @pure def print_langastAssignExp(o: org.sireum.lang.ast.AssignExp): ST = {
      o match {
        case o: org.sireum.lang.ast.Stmt.Block => return print_langastStmtBlock(o)
        case o: org.sireum.lang.ast.Stmt.If => return print_langastStmtIf(o)
        case o: org.sireum.lang.ast.Stmt.Match => return print_langastStmtMatch(o)
        case o: org.sireum.lang.ast.Stmt.Return => return print_langastStmtReturn(o)
        case o: org.sireum.lang.ast.Stmt.Expr => return print_langastStmtExpr(o)
      }
    }

    @pure def print_langastPurityType(o: org.sireum.lang.ast.Purity.Type): ST = {
      val value: String = o match {
        case org.sireum.lang.ast.Purity.Impure => "Impure"
        case org.sireum.lang.ast.Purity.Pure => "Pure"
        case org.sireum.lang.ast.Purity.Memoize => "Memoize"
        case org.sireum.lang.ast.Purity.StrictPure => "StrictPure"
      }
      return printObject(ISZ(
        ("type", printString("org.sireum.lang.ast.Purity")),
        ("value", printString(value))
      ))
    }

    @pure def print_langastCase(o: org.sireum.lang.ast.Case): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Case""""),
        ("pattern", print_langastPattern(o.pattern)),
        ("condOpt", printOption(F, o.condOpt, print_langastExp _)),
        ("body", print_langastBody(o.body))
      ))
    }

    @pure def print_langastEnumGenRange(o: org.sireum.lang.ast.EnumGen.Range): ST = {
      o match {
        case o: org.sireum.lang.ast.EnumGen.Range.Expr => return print_langastEnumGenRangeExpr(o)
        case o: org.sireum.lang.ast.EnumGen.Range.Step => return print_langastEnumGenRangeStep(o)
      }
    }

    @pure def print_langastEnumGenRangeExpr(o: org.sireum.lang.ast.EnumGen.Range.Expr): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.EnumGen.Range.Expr""""),
        ("exp", print_langastExp(o.exp)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastEnumGenRangeStep(o: org.sireum.lang.ast.EnumGen.Range.Step): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.EnumGen.Range.Step""""),
        ("isInclusive", printB(o.isInclusive)),
        ("start", print_langastExp(o.start)),
        ("end", print_langastExp(o.end)),
        ("byOpt", printOption(F, o.byOpt, print_langastExp _)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastEnumGenFor(o: org.sireum.lang.ast.EnumGen.For): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.EnumGen.For""""),
        ("idOpt", printOption(F, o.idOpt, print_langastId _)),
        ("range", print_langastEnumGenRange(o.range)),
        ("condOpt", printOption(F, o.condOpt, print_langastExp _)),
        ("contract", print_langastLoopContract(o.contract))
      ))
    }

    @pure def print_langastType(o: org.sireum.lang.ast.Type): ST = {
      o match {
        case o: org.sireum.lang.ast.Type.Named => return print_langastTypeNamed(o)
        case o: org.sireum.lang.ast.Type.Fun => return print_langastTypeFun(o)
        case o: org.sireum.lang.ast.Type.Tuple => return print_langastTypeTuple(o)
      }
    }

    @pure def print_langastTypeNamed(o: org.sireum.lang.ast.Type.Named): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Type.Named""""),
        ("name", print_langastName(o.name)),
        ("typeArgs", printISZ(F, o.typeArgs, print_langastType _)),
        ("attr", print_langastTypedAttr(o.attr))
      ))
    }

    @pure def print_langastTypeFun(o: org.sireum.lang.ast.Type.Fun): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Type.Fun""""),
        ("isPure", printB(o.isPure)),
        ("isByName", printB(o.isByName)),
        ("args", printISZ(F, o.args, print_langastType _)),
        ("ret", print_langastType(o.ret)),
        ("attr", print_langastTypedAttr(o.attr))
      ))
    }

    @pure def print_langastTypeTuple(o: org.sireum.lang.ast.Type.Tuple): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Type.Tuple""""),
        ("args", printISZ(F, o.args, print_langastType _)),
        ("attr", print_langastTypedAttr(o.attr))
      ))
    }

    @pure def print_langastPattern(o: org.sireum.lang.ast.Pattern): ST = {
      o match {
        case o: org.sireum.lang.ast.Pattern.Literal => return print_langastPatternLiteral(o)
        case o: org.sireum.lang.ast.Pattern.LitInterpolate => return print_langastPatternLitInterpolate(o)
        case o: org.sireum.lang.ast.Pattern.Ref => return print_langastPatternRef(o)
        case o: org.sireum.lang.ast.Pattern.VarBinding => return print_langastPatternVarBinding(o)
        case o: org.sireum.lang.ast.Pattern.Wildcard => return print_langastPatternWildcard(o)
        case o: org.sireum.lang.ast.Pattern.SeqWildcard => return print_langastPatternSeqWildcard(o)
        case o: org.sireum.lang.ast.Pattern.Structure => return print_langastPatternStructure(o)
      }
    }

    @pure def print_langastPatternLiteral(o: org.sireum.lang.ast.Pattern.Literal): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Pattern.Literal""""),
        ("lit", print_langastLit(o.lit))
      ))
    }

    @pure def print_langastPatternLitInterpolate(o: org.sireum.lang.ast.Pattern.LitInterpolate): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Pattern.LitInterpolate""""),
        ("prefix", printString(o.prefix)),
        ("value", printString(o.value)),
        ("attr", print_langastTypedAttr(o.attr))
      ))
    }

    @pure def print_langastPatternRef(o: org.sireum.lang.ast.Pattern.Ref): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Pattern.Ref""""),
        ("isAccess", printB(o.isAccess)),
        ("name", print_langastName(o.name)),
        ("attr", print_langastResolvedAttr(o.attr))
      ))
    }

    @pure def print_langastPatternVarBinding(o: org.sireum.lang.ast.Pattern.VarBinding): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Pattern.VarBinding""""),
        ("id", print_langastId(o.id)),
        ("tipeOpt", printOption(F, o.tipeOpt, print_langastType _)),
        ("idContext", printISZ(T, o.idContext, printString _)),
        ("attr", print_langastTypedAttr(o.attr))
      ))
    }

    @pure def print_langastPatternWildcard(o: org.sireum.lang.ast.Pattern.Wildcard): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Pattern.Wildcard""""),
        ("typeOpt", printOption(F, o.typeOpt, print_langastType _)),
        ("attr", print_langastTypedAttr(o.attr))
      ))
    }

    @pure def print_langastPatternSeqWildcard(o: org.sireum.lang.ast.Pattern.SeqWildcard): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Pattern.SeqWildcard""""),
        ("attr", print_langastTypedAttr(o.attr))
      ))
    }

    @pure def print_langastPatternStructure(o: org.sireum.lang.ast.Pattern.Structure): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Pattern.Structure""""),
        ("idOpt", printOption(F, o.idOpt, print_langastId _)),
        ("nameOpt", printOption(F, o.nameOpt, print_langastName _)),
        ("patterns", printISZ(F, o.patterns, print_langastPattern _)),
        ("idContext", printISZ(T, o.idContext, printString _)),
        ("attr", print_langastResolvedAttr(o.attr))
      ))
    }

    @pure def print_langastExp(o: org.sireum.lang.ast.Exp): ST = {
      o match {
        case o: org.sireum.lang.ast.Exp.LitB => return print_langastExpLitB(o)
        case o: org.sireum.lang.ast.Exp.LitC => return print_langastExpLitC(o)
        case o: org.sireum.lang.ast.Exp.LitZ => return print_langastExpLitZ(o)
        case o: org.sireum.lang.ast.Exp.LitF32 => return print_langastExpLitF32(o)
        case o: org.sireum.lang.ast.Exp.LitF64 => return print_langastExpLitF64(o)
        case o: org.sireum.lang.ast.Exp.LitR => return print_langastExpLitR(o)
        case o: org.sireum.lang.ast.Exp.LitString => return print_langastExpLitString(o)
        case o: org.sireum.lang.ast.Exp.StringInterpolate => return print_langastExpStringInterpolate(o)
        case o: org.sireum.lang.ast.Exp.This => return print_langastExpThis(o)
        case o: org.sireum.lang.ast.Exp.Super => return print_langastExpSuper(o)
        case o: org.sireum.lang.ast.Exp.Unary => return print_langastExpUnary(o)
        case o: org.sireum.lang.ast.Exp.Binary => return print_langastExpBinary(o)
        case o: org.sireum.lang.ast.Exp.Ident => return print_langastExpIdent(o)
        case o: org.sireum.lang.ast.Exp.Eta => return print_langastExpEta(o)
        case o: org.sireum.lang.ast.Exp.Tuple => return print_langastExpTuple(o)
        case o: org.sireum.lang.ast.Exp.Select => return print_langastExpSelect(o)
        case o: org.sireum.lang.ast.Exp.Invoke => return print_langastExpInvoke(o)
        case o: org.sireum.lang.ast.Exp.InvokeNamed => return print_langastExpInvokeNamed(o)
        case o: org.sireum.lang.ast.Exp.If => return print_langastExpIf(o)
        case o: org.sireum.lang.ast.Exp.TypeCond => return print_langastExpTypeCond(o)
        case o: org.sireum.lang.ast.Exp.Sym => return print_langastExpSym(o)
        case o: org.sireum.lang.ast.Exp.Fun => return print_langastExpFun(o)
        case o: org.sireum.lang.ast.Exp.ForYield => return print_langastExpForYield(o)
        case o: org.sireum.lang.ast.Exp.QuantType => return print_langastExpQuantType(o)
        case o: org.sireum.lang.ast.Exp.QuantRange => return print_langastExpQuantRange(o)
        case o: org.sireum.lang.ast.Exp.QuantEach => return print_langastExpQuantEach(o)
        case o: org.sireum.lang.ast.Exp.Input => return print_langastExpInput(o)
        case o: org.sireum.lang.ast.Exp.Old => return print_langastExpOld(o)
        case o: org.sireum.lang.ast.Exp.At => return print_langastExpAt(o)
        case o: org.sireum.lang.ast.Exp.LoopIndex => return print_langastExpLoopIndex(o)
        case o: org.sireum.lang.ast.Exp.StateSeq => return print_langastExpStateSeq(o)
        case o: org.sireum.lang.ast.Exp.Result => return print_langastExpResult(o)
        case o: org.sireum.lang.ast.Exp.StrictPureBlock => return print_langastExpStrictPureBlock(o)
        case o: org.sireum.lang.ast.Exp.Labeled => return print_langastExpLabeled(o)
        case o: org.sireum.lang.ast.Exp.AssumeAgree => return print_langastExpAssumeAgree(o)
        case o: org.sireum.lang.ast.Exp.AssertAgree => return print_langastExpAssertAgree(o)
        case o: org.sireum.lang.ast.Exp.InfoFlowInvariant => return print_langastExpInfoFlowInvariant(o)
      }
    }

    @pure def print_langastLit(o: org.sireum.lang.ast.Lit): ST = {
      o match {
        case o: org.sireum.lang.ast.Exp.LitB => return print_langastExpLitB(o)
        case o: org.sireum.lang.ast.Exp.LitC => return print_langastExpLitC(o)
        case o: org.sireum.lang.ast.Exp.LitZ => return print_langastExpLitZ(o)
        case o: org.sireum.lang.ast.Exp.LitF32 => return print_langastExpLitF32(o)
        case o: org.sireum.lang.ast.Exp.LitF64 => return print_langastExpLitF64(o)
        case o: org.sireum.lang.ast.Exp.LitR => return print_langastExpLitR(o)
        case o: org.sireum.lang.ast.Exp.LitString => return print_langastExpLitString(o)
      }
    }

    @pure def print_langastExpLitB(o: org.sireum.lang.ast.Exp.LitB): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Exp.LitB""""),
        ("value", printB(o.value)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastExpLitC(o: org.sireum.lang.ast.Exp.LitC): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Exp.LitC""""),
        ("value", printC(o.value)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastExpLitZ(o: org.sireum.lang.ast.Exp.LitZ): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Exp.LitZ""""),
        ("value", printZ(o.value)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastExpLitF32(o: org.sireum.lang.ast.Exp.LitF32): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Exp.LitF32""""),
        ("value", printF32(o.value)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastExpLitF64(o: org.sireum.lang.ast.Exp.LitF64): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Exp.LitF64""""),
        ("value", printF64(o.value)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastExpLitR(o: org.sireum.lang.ast.Exp.LitR): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Exp.LitR""""),
        ("value", printR(o.value)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastExpLitString(o: org.sireum.lang.ast.Exp.LitString): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Exp.LitString""""),
        ("value", printString(o.value)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastExpStringInterpolate(o: org.sireum.lang.ast.Exp.StringInterpolate): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Exp.StringInterpolate""""),
        ("prefix", printString(o.prefix)),
        ("lits", printISZ(F, o.lits, print_langastExpLitString _)),
        ("args", printISZ(F, o.args, print_langastExp _)),
        ("attr", print_langastTypedAttr(o.attr))
      ))
    }

    @pure def print_langastExpThis(o: org.sireum.lang.ast.Exp.This): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Exp.This""""),
        ("attr", print_langastTypedAttr(o.attr))
      ))
    }

    @pure def print_langastExpSuper(o: org.sireum.lang.ast.Exp.Super): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Exp.Super""""),
        ("idOpt", printOption(F, o.idOpt, print_langastId _)),
        ("attr", print_langastTypedAttr(o.attr))
      ))
    }

    @pure def print_langastExpUnaryOpType(o: org.sireum.lang.ast.Exp.UnaryOp.Type): ST = {
      val value: String = o match {
        case org.sireum.lang.ast.Exp.UnaryOp.Not => "Not"
        case org.sireum.lang.ast.Exp.UnaryOp.Plus => "Plus"
        case org.sireum.lang.ast.Exp.UnaryOp.Minus => "Minus"
        case org.sireum.lang.ast.Exp.UnaryOp.Complement => "Complement"
      }
      return printObject(ISZ(
        ("type", printString("org.sireum.lang.ast.Exp.UnaryOp")),
        ("value", printString(value))
      ))
    }

    @pure def print_langastExpUnary(o: org.sireum.lang.ast.Exp.Unary): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Exp.Unary""""),
        ("op", print_langastExpUnaryOpType(o.op)),
        ("exp", print_langastExp(o.exp)),
        ("attr", print_langastResolvedAttr(o.attr))
      ))
    }

    @pure def print_langastExpRef(o: org.sireum.lang.ast.Exp.Ref): ST = {
      o match {
        case o: org.sireum.lang.ast.Exp.Ident => return print_langastExpIdent(o)
        case o: org.sireum.lang.ast.Exp.Select => return print_langastExpSelect(o)
      }
    }

    @pure def print_langastExpBinary(o: org.sireum.lang.ast.Exp.Binary): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Exp.Binary""""),
        ("left", print_langastExp(o.left)),
        ("op", printString(o.op)),
        ("right", print_langastExp(o.right)),
        ("attr", print_langastResolvedAttr(o.attr))
      ))
    }

    @pure def print_langastExpIdent(o: org.sireum.lang.ast.Exp.Ident): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Exp.Ident""""),
        ("id", print_langastId(o.id)),
        ("attr", print_langastResolvedAttr(o.attr))
      ))
    }

    @pure def print_langastExpEta(o: org.sireum.lang.ast.Exp.Eta): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Exp.Eta""""),
        ("ref", print_langastExpRef(o.ref)),
        ("attr", print_langastTypedAttr(o.attr))
      ))
    }

    @pure def print_langastExpTuple(o: org.sireum.lang.ast.Exp.Tuple): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Exp.Tuple""""),
        ("args", printISZ(F, o.args, print_langastExp _)),
        ("attr", print_langastTypedAttr(o.attr))
      ))
    }

    @pure def print_langastExpSelect(o: org.sireum.lang.ast.Exp.Select): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Exp.Select""""),
        ("receiverOpt", printOption(F, o.receiverOpt, print_langastExp _)),
        ("id", print_langastId(o.id)),
        ("targs", printISZ(F, o.targs, print_langastType _)),
        ("attr", print_langastResolvedAttr(o.attr))
      ))
    }

    @pure def print_langastExpInvoke(o: org.sireum.lang.ast.Exp.Invoke): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Exp.Invoke""""),
        ("receiverOpt", printOption(F, o.receiverOpt, print_langastExp _)),
        ("ident", print_langastExpIdent(o.ident)),
        ("targs", printISZ(F, o.targs, print_langastType _)),
        ("args", printISZ(F, o.args, print_langastExp _)),
        ("attr", print_langastResolvedAttr(o.attr))
      ))
    }

    @pure def print_langastExpInvokeNamed(o: org.sireum.lang.ast.Exp.InvokeNamed): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Exp.InvokeNamed""""),
        ("receiverOpt", printOption(F, o.receiverOpt, print_langastExp _)),
        ("ident", print_langastExpIdent(o.ident)),
        ("targs", printISZ(F, o.targs, print_langastType _)),
        ("args", printISZ(F, o.args, print_langastNamedArg _)),
        ("attr", print_langastResolvedAttr(o.attr))
      ))
    }

    @pure def print_langastExpIf(o: org.sireum.lang.ast.Exp.If): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Exp.If""""),
        ("cond", print_langastExp(o.cond)),
        ("thenExp", print_langastExp(o.thenExp)),
        ("elseExp", print_langastExp(o.elseExp)),
        ("attr", print_langastTypedAttr(o.attr))
      ))
    }

    @pure def print_langastExpTypeCond(o: org.sireum.lang.ast.Exp.TypeCond): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Exp.TypeCond""""),
        ("args", printISZ(F, o.args, print_langastExp _)),
        ("fun", print_langastExpFun(o.fun)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastExpSym(o: org.sireum.lang.ast.Exp.Sym): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Exp.Sym""""),
        ("num", printZ(o.num)),
        ("attr", print_langastTypedAttr(o.attr))
      ))
    }

    @pure def print_langastExpFunParam(o: org.sireum.lang.ast.Exp.Fun.Param): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Exp.Fun.Param""""),
        ("idOpt", printOption(F, o.idOpt, print_langastId _)),
        ("tipeOpt", printOption(F, o.tipeOpt, print_langastType _)),
        ("typedOpt", printOption(F, o.typedOpt, print_langastTyped _))
      ))
    }

    @pure def print_langastExpFun(o: org.sireum.lang.ast.Exp.Fun): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Exp.Fun""""),
        ("context", printISZ(T, o.context, printString _)),
        ("params", printISZ(F, o.params, print_langastExpFunParam _)),
        ("exp", print_langastAssignExp(o.exp)),
        ("attr", print_langastTypedAttr(o.attr))
      ))
    }

    @pure def print_langastExpForYield(o: org.sireum.lang.ast.Exp.ForYield): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Exp.ForYield""""),
        ("enumGens", printISZ(F, o.enumGens, print_langastEnumGenFor _)),
        ("exp", print_langastExp(o.exp)),
        ("attr", print_langastTypedAttr(o.attr))
      ))
    }

    @pure def print_langastExpQuant(o: org.sireum.lang.ast.Exp.Quant): ST = {
      o match {
        case o: org.sireum.lang.ast.Exp.QuantType => return print_langastExpQuantType(o)
        case o: org.sireum.lang.ast.Exp.QuantRange => return print_langastExpQuantRange(o)
        case o: org.sireum.lang.ast.Exp.QuantEach => return print_langastExpQuantEach(o)
      }
    }

    @pure def print_langastExpQuantType(o: org.sireum.lang.ast.Exp.QuantType): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Exp.QuantType""""),
        ("isForall", printB(o.isForall)),
        ("fun", print_langastExpFun(o.fun)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastExpQuantRange(o: org.sireum.lang.ast.Exp.QuantRange): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Exp.QuantRange""""),
        ("isForall", printB(o.isForall)),
        ("lo", print_langastExp(o.lo)),
        ("hi", print_langastExp(o.hi)),
        ("hiExact", printB(o.hiExact)),
        ("fun", print_langastExpFun(o.fun)),
        ("attr", print_langastResolvedAttr(o.attr))
      ))
    }

    @pure def print_langastExpQuantEach(o: org.sireum.lang.ast.Exp.QuantEach): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Exp.QuantEach""""),
        ("isForall", printB(o.isForall)),
        ("seq", print_langastExp(o.seq)),
        ("fun", print_langastExpFun(o.fun)),
        ("attr", print_langastResolvedAttr(o.attr))
      ))
    }

    @pure def print_langastExpInput(o: org.sireum.lang.ast.Exp.Input): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Exp.Input""""),
        ("exp", print_langastExp(o.exp)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastExpOld(o: org.sireum.lang.ast.Exp.Old): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Exp.Old""""),
        ("exp", print_langastExp(o.exp)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastExpAt(o: org.sireum.lang.ast.Exp.At): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Exp.At""""),
        ("tipeOpt", printOption(F, o.tipeOpt, print_langastType _)),
        ("exp", print_langastExp(o.exp)),
        ("num", print_langastExpLitZ(o.num)),
        ("linesFresh", printISZ(F, o.linesFresh, print_langastExpLitZ _)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastExpLoopIndex(o: org.sireum.lang.ast.Exp.LoopIndex): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Exp.LoopIndex""""),
        ("tipeOpt", printOption(F, o.tipeOpt, print_langastType _)),
        ("exp", print_langastExpIdent(o.exp)),
        ("attr", print_langastTypedAttr(o.attr))
      ))
    }

    @pure def print_langastExpStateSeq(o: org.sireum.lang.ast.Exp.StateSeq): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Exp.StateSeq""""),
        ("id", print_langastId(o.id)),
        ("fragments", printISZ(F, o.fragments, print_langastExpStateSeqFragment _)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastExpStateSeqFragment(o: org.sireum.lang.ast.Exp.StateSeq.Fragment): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Exp.StateSeq.Fragment""""),
        ("id", print_langastId(o.id)),
        ("exp", print_langastExp(o.exp))
      ))
    }

    @pure def print_langastExpResult(o: org.sireum.lang.ast.Exp.Result): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Exp.Result""""),
        ("tipeOpt", printOption(F, o.tipeOpt, print_langastType _)),
        ("attr", print_langastTypedAttr(o.attr))
      ))
    }

    @pure def print_langastExpStrictPureBlock(o: org.sireum.lang.ast.Exp.StrictPureBlock): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Exp.StrictPureBlock""""),
        ("block", print_langastStmtBlock(o.block)),
        ("attr", print_langastTypedAttr(o.attr))
      ))
    }

    @pure def print_langastExpLabeled(o: org.sireum.lang.ast.Exp.Labeled): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Exp.Labeled""""),
        ("numOpt", printOption(F, o.numOpt, print_langastExpLitZ _)),
        ("exp", print_langastExp(o.exp)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastExpAssumeAgree(o: org.sireum.lang.ast.Exp.AssumeAgree): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Exp.AssumeAgree""""),
        ("channel", print_langastExpLitString(o.channel)),
        ("requiresClause", print_langastMethodContractClaims(o.requiresClause)),
        ("inAgreeClause", print_langastMethodContractClaims(o.inAgreeClause)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastExpAssertAgree(o: org.sireum.lang.ast.Exp.AssertAgree): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Exp.AssertAgree""""),
        ("channel", print_langastExpLitString(o.channel)),
        ("outAgreeClause", print_langastMethodContractClaims(o.outAgreeClause)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastExpInfoFlowInvariant(o: org.sireum.lang.ast.Exp.InfoFlowInvariant): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Exp.InfoFlowInvariant""""),
        ("flowInvariants", printISZ(F, o.flowInvariants, print_langastMethodContractInfoFlowCase _)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastNamedArg(o: org.sireum.lang.ast.NamedArg): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.NamedArg""""),
        ("id", print_langastId(o.id)),
        ("arg", print_langastExp(o.arg)),
        ("index", printZ(o.index))
      ))
    }

    @pure def print_langastId(o: org.sireum.lang.ast.Id): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Id""""),
        ("value", printString(o.value)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastName(o: org.sireum.lang.ast.Name): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Name""""),
        ("ids", printISZ(F, o.ids, print_langastId _)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastBody(o: org.sireum.lang.ast.Body): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Body""""),
        ("stmts", printISZ(F, o.stmts, print_langastStmt _)),
        ("undecls", printISZ(F, o.undecls, print_langastResolvedInfoLocalVar _))
      ))
    }

    @pure def print_langastAdtParam(o: org.sireum.lang.ast.AdtParam): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.AdtParam""""),
        ("isHidden", printB(o.isHidden)),
        ("isVal", printB(o.isVal)),
        ("id", print_langastId(o.id)),
        ("tipe", print_langastType(o.tipe))
      ))
    }

    @pure def print_langastMethodSig(o: org.sireum.lang.ast.MethodSig): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.MethodSig""""),
        ("isPure", printB(o.isPure)),
        ("id", print_langastId(o.id)),
        ("typeParams", printISZ(F, o.typeParams, print_langastTypeParam _)),
        ("hasParams", printB(o.hasParams)),
        ("params", printISZ(F, o.params, print_langastParam _)),
        ("returnType", print_langastType(o.returnType))
      ))
    }

    @pure def print_langastParam(o: org.sireum.lang.ast.Param): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Param""""),
        ("isHidden", printB(o.isHidden)),
        ("id", print_langastId(o.id)),
        ("tipe", print_langastType(o.tipe))
      ))
    }

    @pure def print_langastTypeParam(o: org.sireum.lang.ast.TypeParam): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.TypeParam""""),
        ("id", print_langastId(o.id)),
        ("kind", print_langastTypedVarKindType(o.kind))
      ))
    }

    @pure def print_langastAttr(o: org.sireum.lang.ast.Attr): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Attr""""),
        ("posOpt", printOption(F, o.posOpt, printPosition _))
      ))
    }

    @pure def print_langastTypedAttr(o: org.sireum.lang.ast.TypedAttr): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.TypedAttr""""),
        ("posOpt", printOption(F, o.posOpt, printPosition _)),
        ("typedOpt", printOption(F, o.typedOpt, print_langastTyped _))
      ))
    }

    @pure def print_langastResolvedAttr(o: org.sireum.lang.ast.ResolvedAttr): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.ResolvedAttr""""),
        ("posOpt", printOption(F, o.posOpt, printPosition _)),
        ("resOpt", printOption(F, o.resOpt, print_langastResolvedInfo _)),
        ("typedOpt", printOption(F, o.typedOpt, print_langastTyped _))
      ))
    }

    @pure def print_langastResolvedInfo(o: org.sireum.lang.ast.ResolvedInfo): ST = {
      o match {
        case o: org.sireum.lang.ast.ResolvedInfo.BuiltIn => return print_langastResolvedInfoBuiltIn(o)
        case o: org.sireum.lang.ast.ResolvedInfo.Package => return print_langastResolvedInfoPackage(o)
        case o: org.sireum.lang.ast.ResolvedInfo.Enum => return print_langastResolvedInfoEnum(o)
        case o: org.sireum.lang.ast.ResolvedInfo.EnumElement => return print_langastResolvedInfoEnumElement(o)
        case o: org.sireum.lang.ast.ResolvedInfo.Object => return print_langastResolvedInfoObject(o)
        case o: org.sireum.lang.ast.ResolvedInfo.Var => return print_langastResolvedInfoVar(o)
        case o: org.sireum.lang.ast.ResolvedInfo.Method => return print_langastResolvedInfoMethod(o)
        case o: org.sireum.lang.ast.ResolvedInfo.Methods => return print_langastResolvedInfoMethods(o)
        case o: org.sireum.lang.ast.ResolvedInfo.Tuple => return print_langastResolvedInfoTuple(o)
        case o: org.sireum.lang.ast.ResolvedInfo.LocalVar => return print_langastResolvedInfoLocalVar(o)
        case o: org.sireum.lang.ast.ResolvedInfo.Fact => return print_langastResolvedInfoFact(o)
        case o: org.sireum.lang.ast.ResolvedInfo.Theorem => return print_langastResolvedInfoTheorem(o)
        case o: org.sireum.lang.ast.ResolvedInfo.Inv => return print_langastResolvedInfoInv(o)
      }
    }

    @pure def print_langastResolvedInfoBuiltInKindType(o: org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.Type): ST = {
      val value: String = o match {
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.Apply => "Apply"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.AsInstanceOf => "AsInstanceOf"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.Assert => "Assert"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.AssertMsg => "AssertMsg"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.Assume => "Assume"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.AssumeMsg => "AssumeMsg"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.BinaryAdd => "BinaryAdd"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.BinarySub => "BinarySub"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.BinaryMul => "BinaryMul"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.BinaryDiv => "BinaryDiv"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.BinaryRem => "BinaryRem"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.BinaryEq => "BinaryEq"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.BinaryEquiv => "BinaryEquiv"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.BinaryNe => "BinaryNe"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.BinaryInequiv => "BinaryInequiv"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.BinaryFpEq => "BinaryFpEq"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.BinaryFpNe => "BinaryFpNe"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.BinaryLt => "BinaryLt"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.BinaryLe => "BinaryLe"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.BinaryGt => "BinaryGt"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.BinaryGe => "BinaryGe"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.BinaryShl => "BinaryShl"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.BinaryShr => "BinaryShr"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.BinaryUshr => "BinaryUshr"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.BinaryAnd => "BinaryAnd"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.BinaryOr => "BinaryOr"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.BinaryXor => "BinaryXor"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.BinaryImply => "BinaryImply"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.BinaryCondAnd => "BinaryCondAnd"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.BinaryCondOr => "BinaryCondOr"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.BinaryCondImply => "BinaryCondImply"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.BinaryMapsTo => "BinaryMapsTo"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.Cprint => "Cprint"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.Cprintln => "Cprintln"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.Eprint => "Eprint"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.Eprintln => "Eprintln"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.Halt => "Halt"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.Hash => "Hash"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.IsInstanceOf => "IsInstanceOf"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.Indices => "Indices"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.Min => "Min"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.Max => "Max"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.Native => "Native"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.Print => "Print"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.Println => "Println"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.SetOptions => "SetOptions"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.String => "String"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.UnapplySeq => "UnapplySeq"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.UnapplyTuple => "UnapplyTuple"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.UnaryPlus => "UnaryPlus"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.UnaryMinus => "UnaryMinus"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.UnaryNot => "UnaryNot"
        case org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.UnaryComplement => "UnaryComplement"
      }
      return printObject(ISZ(
        ("type", printString("org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind")),
        ("value", printString(value))
      ))
    }

    @pure def print_langastResolvedInfoBuiltIn(o: org.sireum.lang.ast.ResolvedInfo.BuiltIn): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.ResolvedInfo.BuiltIn""""),
        ("kind", print_langastResolvedInfoBuiltInKindType(o.kind))
      ))
    }

    @pure def print_langastResolvedInfoPackage(o: org.sireum.lang.ast.ResolvedInfo.Package): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.ResolvedInfo.Package""""),
        ("name", printISZ(T, o.name, printString _))
      ))
    }

    @pure def print_langastResolvedInfoEnum(o: org.sireum.lang.ast.ResolvedInfo.Enum): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.ResolvedInfo.Enum""""),
        ("name", printISZ(T, o.name, printString _))
      ))
    }

    @pure def print_langastResolvedInfoEnumElement(o: org.sireum.lang.ast.ResolvedInfo.EnumElement): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.ResolvedInfo.EnumElement""""),
        ("owner", printISZ(T, o.owner, printString _)),
        ("name", printString(o.name)),
        ("ordinal", printZ(o.ordinal))
      ))
    }

    @pure def print_langastResolvedInfoObject(o: org.sireum.lang.ast.ResolvedInfo.Object): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.ResolvedInfo.Object""""),
        ("name", printISZ(T, o.name, printString _))
      ))
    }

    @pure def print_langastResolvedInfoVar(o: org.sireum.lang.ast.ResolvedInfo.Var): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.ResolvedInfo.Var""""),
        ("isInObject", printB(o.isInObject)),
        ("isSpec", printB(o.isSpec)),
        ("isVal", printB(o.isVal)),
        ("owner", printISZ(T, o.owner, printString _)),
        ("id", printString(o.id))
      ))
    }

    @pure def print_langastResolvedInfoMethod(o: org.sireum.lang.ast.ResolvedInfo.Method): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.ResolvedInfo.Method""""),
        ("isInObject", printB(o.isInObject)),
        ("mode", print_langastMethodModeType(o.mode)),
        ("typeParams", printISZ(T, o.typeParams, printString _)),
        ("owner", printISZ(T, o.owner, printString _)),
        ("id", printString(o.id)),
        ("paramNames", printISZ(T, o.paramNames, printString _)),
        ("tpeOpt", printOption(F, o.tpeOpt, print_langastTypedFun _)),
        ("reads", printISZ(F, o.reads, print_langastResolvedInfo _)),
        ("writes", printISZ(F, o.writes, print_langastResolvedInfo _))
      ))
    }

    @pure def print_langastResolvedInfoMethods(o: org.sireum.lang.ast.ResolvedInfo.Methods): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.ResolvedInfo.Methods""""),
        ("methods", printISZ(F, o.methods, print_langastResolvedInfoMethod _))
      ))
    }

    @pure def print_langastResolvedInfoTuple(o: org.sireum.lang.ast.ResolvedInfo.Tuple): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.ResolvedInfo.Tuple""""),
        ("size", printZ(o.size)),
        ("index", printZ(o.index))
      ))
    }

    @pure def print_langastResolvedInfoLocalVarScopeType(o: org.sireum.lang.ast.ResolvedInfo.LocalVar.Scope.Type): ST = {
      val value: String = o match {
        case org.sireum.lang.ast.ResolvedInfo.LocalVar.Scope.Current => "Current"
        case org.sireum.lang.ast.ResolvedInfo.LocalVar.Scope.Outer => "Outer"
        case org.sireum.lang.ast.ResolvedInfo.LocalVar.Scope.Closure => "Closure"
      }
      return printObject(ISZ(
        ("type", printString("org.sireum.lang.ast.ResolvedInfo.LocalVar.Scope")),
        ("value", printString(value))
      ))
    }

    @pure def print_langastResolvedInfoLocalVar(o: org.sireum.lang.ast.ResolvedInfo.LocalVar): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.ResolvedInfo.LocalVar""""),
        ("context", printISZ(T, o.context, printString _)),
        ("scope", print_langastResolvedInfoLocalVarScopeType(o.scope)),
        ("isSpec", printB(o.isSpec)),
        ("isVal", printB(o.isVal)),
        ("id", printString(o.id))
      ))
    }

    @pure def print_langastResolvedInfoFact(o: org.sireum.lang.ast.ResolvedInfo.Fact): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.ResolvedInfo.Fact""""),
        ("name", printISZ(T, o.name, printString _))
      ))
    }

    @pure def print_langastResolvedInfoTheorem(o: org.sireum.lang.ast.ResolvedInfo.Theorem): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.ResolvedInfo.Theorem""""),
        ("name", printISZ(T, o.name, printString _))
      ))
    }

    @pure def print_langastResolvedInfoInv(o: org.sireum.lang.ast.ResolvedInfo.Inv): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.ResolvedInfo.Inv""""),
        ("isInObject", printB(o.isInObject)),
        ("owner", printISZ(T, o.owner, printString _)),
        ("id", printString(o.id))
      ))
    }

    @pure def print_langastTruthTableRow(o: org.sireum.lang.ast.TruthTable.Row): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.TruthTable.Row""""),
        ("assignment", print_langastTruthTableAssignment(o.assignment)),
        ("separator", printPosition(o.separator)),
        ("values", print_langastTruthTableAssignment(o.values))
      ))
    }

    @pure def print_langastTruthTableAssignment(o: org.sireum.lang.ast.TruthTable.Assignment): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.TruthTable.Assignment""""),
        ("values", printISZ(F, o.values, print_langastExpLitB _)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastTruthTableConclusion(o: org.sireum.lang.ast.TruthTable.Conclusion): ST = {
      o match {
        case o: org.sireum.lang.ast.TruthTable.Conclusion.Validity => return print_langastTruthTableConclusionValidity(o)
        case o: org.sireum.lang.ast.TruthTable.Conclusion.Tautology => return print_langastTruthTableConclusionTautology(o)
        case o: org.sireum.lang.ast.TruthTable.Conclusion.Contradictory => return print_langastTruthTableConclusionContradictory(o)
        case o: org.sireum.lang.ast.TruthTable.Conclusion.Contingent => return print_langastTruthTableConclusionContingent(o)
      }
    }

    @pure def print_langastTruthTableConclusionValidity(o: org.sireum.lang.ast.TruthTable.Conclusion.Validity): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.TruthTable.Conclusion.Validity""""),
        ("isValid", printB(o.isValid)),
        ("assignments", printISZ(F, o.assignments, print_langastTruthTableAssignment _)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastTruthTableConclusionTautology(o: org.sireum.lang.ast.TruthTable.Conclusion.Tautology): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.TruthTable.Conclusion.Tautology""""),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastTruthTableConclusionContradictory(o: org.sireum.lang.ast.TruthTable.Conclusion.Contradictory): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.TruthTable.Conclusion.Contradictory""""),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastTruthTableConclusionContingent(o: org.sireum.lang.ast.TruthTable.Conclusion.Contingent): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.TruthTable.Conclusion.Contingent""""),
        ("trueAssignments", printISZ(F, o.trueAssignments, print_langastTruthTableAssignment _)),
        ("falseAssignments", printISZ(F, o.falseAssignments, print_langastTruthTableAssignment _)),
        ("attr", print_langastAttr(o.attr))
      ))
    }

    @pure def print_langastMethodModeType(o: org.sireum.lang.ast.MethodMode.Type): ST = {
      val value: String = o match {
        case org.sireum.lang.ast.MethodMode.Method => "Method"
        case org.sireum.lang.ast.MethodMode.Spec => "Spec"
        case org.sireum.lang.ast.MethodMode.Ext => "Ext"
        case org.sireum.lang.ast.MethodMode.Just => "Just"
        case org.sireum.lang.ast.MethodMode.Constructor => "Constructor"
        case org.sireum.lang.ast.MethodMode.Copy => "Copy"
        case org.sireum.lang.ast.MethodMode.Extractor => "Extractor"
        case org.sireum.lang.ast.MethodMode.ObjectConstructor => "ObjectConstructor"
        case org.sireum.lang.ast.MethodMode.Select => "Select"
        case org.sireum.lang.ast.MethodMode.Store => "Store"
      }
      return printObject(ISZ(
        ("type", printString("org.sireum.lang.ast.MethodMode")),
        ("value", printString(value))
      ))
    }

    @pure def print_langastTyped(o: org.sireum.lang.ast.Typed): ST = {
      o match {
        case o: org.sireum.lang.ast.Typed.Name => return print_langastTypedName(o)
        case o: org.sireum.lang.ast.Typed.Tuple => return print_langastTypedTuple(o)
        case o: org.sireum.lang.ast.Typed.Fun => return print_langastTypedFun(o)
        case o: org.sireum.lang.ast.Typed.TypeVar => return print_langastTypedTypeVar(o)
        case o: org.sireum.lang.ast.Typed.Package => return print_langastTypedPackage(o)
        case o: org.sireum.lang.ast.Typed.Object => return print_langastTypedObject(o)
        case o: org.sireum.lang.ast.Typed.Enum => return print_langastTypedEnum(o)
        case o: org.sireum.lang.ast.Typed.Method => return print_langastTypedMethod(o)
        case o: org.sireum.lang.ast.Typed.Methods => return print_langastTypedMethods(o)
        case o: org.sireum.lang.ast.Typed.Fact => return print_langastTypedFact(o)
        case o: org.sireum.lang.ast.Typed.Theorem => return print_langastTypedTheorem(o)
        case o: org.sireum.lang.ast.Typed.Inv => return print_langastTypedInv(o)
      }
    }

    @pure def print_langastTypedVarKindType(o: org.sireum.lang.ast.Typed.VarKind.Type): ST = {
      val value: String = o match {
        case org.sireum.lang.ast.Typed.VarKind.Mutable => "Mutable"
        case org.sireum.lang.ast.Typed.VarKind.Immutable => "Immutable"
        case org.sireum.lang.ast.Typed.VarKind.Index => "Index"
      }
      return printObject(ISZ(
        ("type", printString("org.sireum.lang.ast.Typed.VarKind")),
        ("value", printString(value))
      ))
    }

    @pure def print_langastTypedName(o: org.sireum.lang.ast.Typed.Name): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Typed.Name""""),
        ("ids", printISZ(T, o.ids, printString _)),
        ("args", printISZ(F, o.args, print_langastTyped _))
      ))
    }

    @pure def print_langastTypedTuple(o: org.sireum.lang.ast.Typed.Tuple): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Typed.Tuple""""),
        ("args", printISZ(F, o.args, print_langastTyped _))
      ))
    }

    @pure def print_langastTypedFun(o: org.sireum.lang.ast.Typed.Fun): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Typed.Fun""""),
        ("isPure", printB(o.isPure)),
        ("isByName", printB(o.isByName)),
        ("args", printISZ(F, o.args, print_langastTyped _)),
        ("ret", print_langastTyped(o.ret))
      ))
    }

    @pure def print_langastTypedTypeVar(o: org.sireum.lang.ast.Typed.TypeVar): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Typed.TypeVar""""),
        ("id", printString(o.id)),
        ("kind", print_langastTypedVarKindType(o.kind))
      ))
    }

    @pure def print_langastTypedPackage(o: org.sireum.lang.ast.Typed.Package): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Typed.Package""""),
        ("name", printISZ(T, o.name, printString _))
      ))
    }

    @pure def print_langastTypedObject(o: org.sireum.lang.ast.Typed.Object): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Typed.Object""""),
        ("owner", printISZ(T, o.owner, printString _)),
        ("id", printString(o.id))
      ))
    }

    @pure def print_langastTypedEnum(o: org.sireum.lang.ast.Typed.Enum): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Typed.Enum""""),
        ("name", printISZ(T, o.name, printString _))
      ))
    }

    @pure def print_langastTypedMethod(o: org.sireum.lang.ast.Typed.Method): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Typed.Method""""),
        ("isInObject", printB(o.isInObject)),
        ("mode", print_langastMethodModeType(o.mode)),
        ("typeParams", printISZ(T, o.typeParams, printString _)),
        ("owner", printISZ(T, o.owner, printString _)),
        ("name", printString(o.name)),
        ("paramNames", printISZ(T, o.paramNames, printString _)),
        ("tpe", print_langastTypedFun(o.tpe))
      ))
    }

    @pure def print_langastTypedMethods(o: org.sireum.lang.ast.Typed.Methods): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Typed.Methods""""),
        ("methods", printISZ(F, o.methods, print_langastTypedMethod _))
      ))
    }

    @pure def print_langastTypedFact(o: org.sireum.lang.ast.Typed.Fact): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Typed.Fact""""),
        ("owner", printISZ(T, o.owner, printString _)),
        ("id", printString(o.id))
      ))
    }

    @pure def print_langastTypedTheorem(o: org.sireum.lang.ast.Typed.Theorem): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Typed.Theorem""""),
        ("owner", printISZ(T, o.owner, printString _)),
        ("id", printString(o.id))
      ))
    }

    @pure def print_langastTypedInv(o: org.sireum.lang.ast.Typed.Inv): ST = {
      return printObject(ISZ(
        ("type", st""""org.sireum.lang.ast.Typed.Inv""""),
        ("isInObject", printB(o.isInObject)),
        ("owner", printISZ(T, o.owner, printString _)),
        ("id", printString(o.id))
      ))
    }

  }

  @record class Parser(val input: String) {
    val parser: Json.Parser = Json.Parser.create(input)

    def errorOpt: Option[Json.ErrorMsg] = {
      return parser.errorOpt
    }

    def parseAadlInstInfo(): AadlInstInfo = {
      val t = parser.parseObjectTypes(ISZ("Component", "ErrorTypeDef", "FeatureEnd", "FeatureGroup", "FeatureAccess", "Connection", "Emv2Flow", "Flow"))
      t.native match {
        case "Component" => val r = parseComponentT(T); return r
        case "ErrorTypeDef" => val r = parseErrorTypeDefT(T); return r
        case "FeatureEnd" => val r = parseFeatureEndT(T); return r
        case "FeatureGroup" => val r = parseFeatureGroupT(T); return r
        case "FeatureAccess" => val r = parseFeatureAccessT(T); return r
        case "Connection" => val r = parseConnectionT(T); return r
        case "Emv2Flow" => val r = parseEmv2FlowT(T); return r
        case "Flow" => val r = parseFlowT(T); return r
        case _ => val r = parseFlowT(T); return r
      }
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
      parser.parseObjectKey("annexLib")
      val annexLib = parser.parseISZ(parseAnnexLib _)
      parser.parseObjectNext()
      parser.parseObjectKey("dataComponents")
      val dataComponents = parser.parseISZ(parseComponent _)
      parser.parseObjectNext()
      return Aadl(components, annexLib, dataComponents)
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
      parser.parseObjectKey("pos")
      val pos = parser.parseOption(parser.parsePosition _)
      parser.parseObjectNext()
      return Name(name, pos)
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
      parser.parseObjectKey("uriFrag")
      val uriFrag = parser.parseString()
      parser.parseObjectNext()
      return Component(identifier, category, classifier, features, subComponents, connections, connectionInstances, properties, flows, modes, annexes, uriFrag)
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
      parser.parseObjectKey("uriFrag")
      val uriFrag = parser.parseString()
      parser.parseObjectNext()
      return FeatureEnd(identifier, direction, category, classifier, properties, uriFrag)
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
      parser.parseObjectKey("uriFrag")
      val uriFrag = parser.parseString()
      parser.parseObjectNext()
      return FeatureGroup(identifier, features, isInverse, category, properties, uriFrag)
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
      parser.parseObjectKey("uriFrag")
      val uriFrag = parser.parseString()
      parser.parseObjectNext()
      return FeatureAccess(identifier, category, classifier, accessType, accessCategory, properties, uriFrag)
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
      parser.parseObjectKey("uriFrag")
      val uriFrag = parser.parseString()
      parser.parseObjectNext()
      return Connection(name, src, dst, kind, isBiDirectional, connectionInstances, properties, uriFrag)
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
      parser.parseObjectKey("appliesTo")
      val appliesTo = parser.parseISZ(parseElementRef _)
      parser.parseObjectNext()
      return Property(name, propertyValues, appliesTo)
    }

    def parseElementRef(): ElementRef = {
      val t = parser.parseObjectTypes(ISZ("Emv2ElementRef", "AadlElementRef"))
      t.native match {
        case "Emv2ElementRef" => val r = parseEmv2ElementRefT(T); return r
        case "AadlElementRef" => val r = parseAadlElementRefT(T); return r
        case _ => val r = parseAadlElementRefT(T); return r
      }
    }

    def parseElementKindType(): ElementKind.Type = {
      val r = parseElementKindT(F)
      return r
    }

    def parseElementKindT(typeParsed: B): ElementKind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("ElementKind")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      ElementKind.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for ElementKind.")
          return ElementKind.byOrdinal(0).get
      }
    }

    def parseAadlElementRef(): AadlElementRef = {
      val r = parseAadlElementRefT(F)
      return r
    }

    def parseAadlElementRefT(typeParsed: B): AadlElementRef = {
      if (!typeParsed) {
        parser.parseObjectType("AadlElementRef")
      }
      parser.parseObjectKey("elementKind")
      val elementKind = parseElementKindType()
      parser.parseObjectNext()
      parser.parseObjectKey("name")
      val name = parseName()
      parser.parseObjectNext()
      return AadlElementRef(elementKind, name)
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
      val source = parser.parseOption(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("sink")
      val sink = parser.parseOption(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("uriFrag")
      val uriFrag = parser.parseString()
      parser.parseObjectNext()
      return Flow(name, kind, source, sink, uriFrag)
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
      val t = parser.parseObjectTypes(ISZ("SmfClause", "SmfClassification", "SmfDeclass", "SmfType", "ErrorTypeDef", "ErrorAliasDef", "ErrorTypeSetDef", "BehaveStateMachine", "ErrorEvent", "ErrorState", "ErrorTransition", "ConditionTrigger", "AndCondition", "OrCondition", "AllCondition", "OrMoreCondition", "OrLessCondition", "Emv2Clause", "Emv2Propagation", "Emv2Flow", "Emv2BehaviorSection", "ErrorPropagation", "OtherAnnex", "GclSubclause", "BTSSubclauseBehaviorProvider", "BTSBLESSAnnexClause"))
      t.native match {
        case "SmfClause" => val r = parseSmfClauseT(T); return r
        case "SmfClassification" => val r = parseSmfClassificationT(T); return r
        case "SmfDeclass" => val r = parseSmfDeclassT(T); return r
        case "SmfType" => val r = parseSmfTypeT(T); return r
        case "ErrorTypeDef" => val r = parseErrorTypeDefT(T); return r
        case "ErrorAliasDef" => val r = parseErrorAliasDefT(T); return r
        case "ErrorTypeSetDef" => val r = parseErrorTypeSetDefT(T); return r
        case "BehaveStateMachine" => val r = parseBehaveStateMachineT(T); return r
        case "ErrorEvent" => val r = parseErrorEventT(T); return r
        case "ErrorState" => val r = parseErrorStateT(T); return r
        case "ErrorTransition" => val r = parseErrorTransitionT(T); return r
        case "ConditionTrigger" => val r = parseConditionTriggerT(T); return r
        case "AndCondition" => val r = parseAndConditionT(T); return r
        case "OrCondition" => val r = parseOrConditionT(T); return r
        case "AllCondition" => val r = parseAllConditionT(T); return r
        case "OrMoreCondition" => val r = parseOrMoreConditionT(T); return r
        case "OrLessCondition" => val r = parseOrLessConditionT(T); return r
        case "Emv2Clause" => val r = parseEmv2ClauseT(T); return r
        case "Emv2Propagation" => val r = parseEmv2PropagationT(T); return r
        case "Emv2Flow" => val r = parseEmv2FlowT(T); return r
        case "Emv2BehaviorSection" => val r = parseEmv2BehaviorSectionT(T); return r
        case "ErrorPropagation" => val r = parseErrorPropagationT(T); return r
        case "OtherAnnex" => val r = parseOtherAnnexT(T); return r
        case "GclSubclause" => val r = parseGclSubclauseT(T); return r
        case "BTSSubclauseBehaviorProvider" => val r = parseBTSSubclauseBehaviorProviderT(T); return r
        case "BTSBLESSAnnexClause" => val r = parseBTSBLESSAnnexClauseT(T); return r
        case _ => val r = parseBTSBLESSAnnexClauseT(T); return r
      }
    }

    def parseAnnexLib(): AnnexLib = {
      val t = parser.parseObjectTypes(ISZ("SmfLibrary", "Emv2Library", "OtherLib", "GclLib"))
      t.native match {
        case "SmfLibrary" => val r = parseSmfLibraryT(T); return r
        case "Emv2Library" => val r = parseEmv2LibraryT(T); return r
        case "OtherLib" => val r = parseOtherLibT(T); return r
        case "GclLib" => val r = parseGclLibT(T); return r
        case _ => val r = parseGclLibT(T); return r
      }
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

    def parseOtherLib(): OtherLib = {
      val r = parseOtherLibT(F)
      return r
    }

    def parseOtherLibT(typeParsed: B): OtherLib = {
      if (!typeParsed) {
        parser.parseObjectType("OtherLib")
      }
      parser.parseObjectKey("lib")
      val lib = parser.parseString()
      parser.parseObjectNext()
      return OtherLib(lib)
    }

    def parseBLESSAnnex(): BLESSAnnex = {
      val t = parser.parseObjectTypes(ISZ("BTSSubclauseBehaviorProvider", "BTSBLESSAnnexClause"))
      t.native match {
        case "BTSSubclauseBehaviorProvider" => val r = parseBTSSubclauseBehaviorProviderT(T); return r
        case "BTSBLESSAnnexClause" => val r = parseBTSBLESSAnnexClauseT(T); return r
        case _ => val r = parseBTSBLESSAnnexClauseT(T); return r
      }
    }

    def parseBTSSubclauseBehaviorProvider(): BTSSubclauseBehaviorProvider = {
      val r = parseBTSSubclauseBehaviorProviderT(F)
      return r
    }

    def parseBTSSubclauseBehaviorProviderT(typeParsed: B): BTSSubclauseBehaviorProvider = {
      if (!typeParsed) {
        parser.parseObjectType("BTSSubclauseBehaviorProvider")
      }
      parser.parseObjectKey("values")
      val values = parser.parseISZ(parseBTSResource _)
      parser.parseObjectNext()
      return BTSSubclauseBehaviorProvider(values)
    }

    def parseBTSResource(): BTSResource = {
      val t = parser.parseObjectTypes(ISZ("BTSText", "BTSPath"))
      t.native match {
        case "BTSText" => val r = parseBTSTextT(T); return r
        case "BTSPath" => val r = parseBTSPathT(T); return r
        case _ => val r = parseBTSPathT(T); return r
      }
    }

    def parseBTSText(): BTSText = {
      val r = parseBTSTextT(F)
      return r
    }

    def parseBTSTextT(typeParsed: B): BTSText = {
      if (!typeParsed) {
        parser.parseObjectType("BTSText")
      }
      parser.parseObjectKey("source")
      val source = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("filename")
      val filename = parser.parseOption(parser.parseString _)
      parser.parseObjectNext()
      parser.parseObjectKey("overwrite")
      val overwrite = parser.parseB()
      parser.parseObjectNext()
      return BTSText(source, filename, overwrite)
    }

    def parseBTSPath(): BTSPath = {
      val r = parseBTSPathT(F)
      return r
    }

    def parseBTSPathT(typeParsed: B): BTSPath = {
      if (!typeParsed) {
        parser.parseObjectType("BTSPath")
      }
      parser.parseObjectKey("path")
      val path = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("overwrite")
      val overwrite = parser.parseB()
      parser.parseObjectNext()
      return BTSPath(path, overwrite)
    }

    def parseBTSBLESSAnnexClause(): BTSBLESSAnnexClause = {
      val r = parseBTSBLESSAnnexClauseT(F)
      return r
    }

    def parseBTSBLESSAnnexClauseT(typeParsed: B): BTSBLESSAnnexClause = {
      if (!typeParsed) {
        parser.parseObjectType("BTSBLESSAnnexClause")
      }
      parser.parseObjectKey("doNotProve")
      val doNotProve = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("assertions")
      val assertions = parser.parseISZ(parseBTSAssertion _)
      parser.parseObjectNext()
      parser.parseObjectKey("invariant")
      val invariant = parser.parseOption(parseBTSAssertion _)
      parser.parseObjectNext()
      parser.parseObjectKey("variables")
      val variables = parser.parseISZ(parseBTSVariableDeclaration _)
      parser.parseObjectNext()
      parser.parseObjectKey("states")
      val states = parser.parseISZ(parseBTSStateDeclaration _)
      parser.parseObjectNext()
      parser.parseObjectKey("transitions")
      val transitions = parser.parseISZ(parseBTSTransition _)
      parser.parseObjectNext()
      return BTSBLESSAnnexClause(doNotProve, assertions, invariant, variables, states, transitions)
    }

    def parseBTSVariableDeclaration(): BTSVariableDeclaration = {
      val r = parseBTSVariableDeclarationT(F)
      return r
    }

    def parseBTSVariableDeclarationT(typeParsed: B): BTSVariableDeclaration = {
      if (!typeParsed) {
        parser.parseObjectType("BTSVariableDeclaration")
      }
      parser.parseObjectKey("name")
      val name = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("category")
      val category = parser.parseOption(parseBTSVariableCategoryType _)
      parser.parseObjectNext()
      parser.parseObjectKey("varType")
      val varType = parseBTSType()
      parser.parseObjectNext()
      parser.parseObjectKey("assignExpression")
      val assignExpression = parser.parseOption(parseBTSExp _)
      parser.parseObjectNext()
      parser.parseObjectKey("arraySize")
      val arraySize = parser.parseOption(parseBLESSIntConst _)
      parser.parseObjectNext()
      parser.parseObjectKey("variableAssertion")
      val variableAssertion = parser.parseOption(parseBTSAssertion _)
      parser.parseObjectNext()
      return BTSVariableDeclaration(name, category, varType, assignExpression, arraySize, variableAssertion)
    }

    def parseBTSVariableCategoryType(): BTSVariableCategory.Type = {
      val r = parseBTSVariableCategoryT(F)
      return r
    }

    def parseBTSVariableCategoryT(typeParsed: B): BTSVariableCategory.Type = {
      if (!typeParsed) {
        parser.parseObjectType("BTSVariableCategory")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      BTSVariableCategory.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for BTSVariableCategory.")
          return BTSVariableCategory.byOrdinal(0).get
      }
    }

    def parseBTSType(): BTSType = {
      val t = parser.parseObjectTypes(ISZ("BTSClassifier"))
      t.native match {
        case "BTSClassifier" => val r = parseBTSClassifierT(T); return r
        case _ => val r = parseBTSClassifierT(T); return r
      }
    }

    def parseBTSClassifier(): BTSClassifier = {
      val r = parseBTSClassifierT(F)
      return r
    }

    def parseBTSClassifierT(typeParsed: B): BTSClassifier = {
      if (!typeParsed) {
        parser.parseObjectType("BTSClassifier")
      }
      parser.parseObjectKey("classifier")
      val classifier = parseClassifier()
      parser.parseObjectNext()
      return BTSClassifier(classifier)
    }

    def parseBLESSIntConst(): BLESSIntConst = {
      val r = parseBLESSIntConstT(F)
      return r
    }

    def parseBLESSIntConstT(typeParsed: B): BLESSIntConst = {
      if (!typeParsed) {
        parser.parseObjectType("BLESSIntConst")
      }
      return BLESSIntConst()
    }

    def parseBTSStateDeclaration(): BTSStateDeclaration = {
      val r = parseBTSStateDeclarationT(F)
      return r
    }

    def parseBTSStateDeclarationT(typeParsed: B): BTSStateDeclaration = {
      if (!typeParsed) {
        parser.parseObjectType("BTSStateDeclaration")
      }
      parser.parseObjectKey("id")
      val id = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("categories")
      val categories = parser.parseISZ(parseBTSStateCategoryType _)
      parser.parseObjectNext()
      parser.parseObjectKey("assertion")
      val assertion = parser.parseOption(parseBTSAssertion _)
      parser.parseObjectNext()
      return BTSStateDeclaration(id, categories, assertion)
    }

    def parseBTSStateCategoryType(): BTSStateCategory.Type = {
      val r = parseBTSStateCategoryT(F)
      return r
    }

    def parseBTSStateCategoryT(typeParsed: B): BTSStateCategory.Type = {
      if (!typeParsed) {
        parser.parseObjectType("BTSStateCategory")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      BTSStateCategory.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for BTSStateCategory.")
          return BTSStateCategory.byOrdinal(0).get
      }
    }

    def parseBTSTransition(): BTSTransition = {
      val r = parseBTSTransitionT(F)
      return r
    }

    def parseBTSTransitionT(typeParsed: B): BTSTransition = {
      if (!typeParsed) {
        parser.parseObjectType("BTSTransition")
      }
      parser.parseObjectKey("label")
      val label = parseBTSTransitionLabel()
      parser.parseObjectNext()
      parser.parseObjectKey("sourceStates")
      val sourceStates = parser.parseISZ(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("destState")
      val destState = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("transitionCondition")
      val transitionCondition = parser.parseOption(parseBTSTransitionCondition _)
      parser.parseObjectNext()
      parser.parseObjectKey("actions")
      val actions = parser.parseOption(parseBTSBehaviorActions _)
      parser.parseObjectNext()
      parser.parseObjectKey("assertion")
      val assertion = parser.parseOption(parseBTSAssertion _)
      parser.parseObjectNext()
      return BTSTransition(label, sourceStates, destState, transitionCondition, actions, assertion)
    }

    def parseBTSTransitionLabel(): BTSTransitionLabel = {
      val r = parseBTSTransitionLabelT(F)
      return r
    }

    def parseBTSTransitionLabelT(typeParsed: B): BTSTransitionLabel = {
      if (!typeParsed) {
        parser.parseObjectType("BTSTransitionLabel")
      }
      parser.parseObjectKey("id")
      val id = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("priority")
      val priority = parser.parseOption(parser.parseZ _)
      parser.parseObjectNext()
      return BTSTransitionLabel(id, priority)
    }

    def parseBTSTransitionCondition(): BTSTransitionCondition = {
      val t = parser.parseObjectTypes(ISZ("BTSDispatchCondition", "BTSExecuteConditionExp", "BTSExecuteConditionTimeout", "BTSExecuteConditionOtherwise", "BTSModeCondition", "BTSInternalCondition"))
      t.native match {
        case "BTSDispatchCondition" => val r = parseBTSDispatchConditionT(T); return r
        case "BTSExecuteConditionExp" => val r = parseBTSExecuteConditionExpT(T); return r
        case "BTSExecuteConditionTimeout" => val r = parseBTSExecuteConditionTimeoutT(T); return r
        case "BTSExecuteConditionOtherwise" => val r = parseBTSExecuteConditionOtherwiseT(T); return r
        case "BTSModeCondition" => val r = parseBTSModeConditionT(T); return r
        case "BTSInternalCondition" => val r = parseBTSInternalConditionT(T); return r
        case _ => val r = parseBTSInternalConditionT(T); return r
      }
    }

    def parseBTSDispatchCondition(): BTSDispatchCondition = {
      val r = parseBTSDispatchConditionT(F)
      return r
    }

    def parseBTSDispatchConditionT(typeParsed: B): BTSDispatchCondition = {
      if (!typeParsed) {
        parser.parseObjectType("BTSDispatchCondition")
      }
      parser.parseObjectKey("dispatchTriggers")
      val dispatchTriggers = parser.parseISZ(parseBTSDispatchConjunction _)
      parser.parseObjectNext()
      parser.parseObjectKey("frozenPorts")
      val frozenPorts = parser.parseISZ(parseName _)
      parser.parseObjectNext()
      return BTSDispatchCondition(dispatchTriggers, frozenPorts)
    }

    def parseBTSDispatchConjunction(): BTSDispatchConjunction = {
      val r = parseBTSDispatchConjunctionT(F)
      return r
    }

    def parseBTSDispatchConjunctionT(typeParsed: B): BTSDispatchConjunction = {
      if (!typeParsed) {
        parser.parseObjectType("BTSDispatchConjunction")
      }
      parser.parseObjectKey("conjunction")
      val conjunction = parser.parseISZ(parseBTSDispatchTrigger _)
      parser.parseObjectNext()
      return BTSDispatchConjunction(conjunction)
    }

    def parseBTSDispatchTrigger(): BTSDispatchTrigger = {
      val t = parser.parseObjectTypes(ISZ("BTSDispatchTriggerStop", "BTSDispatchTriggerPort", "BTSDispatchTriggerTimeout"))
      t.native match {
        case "BTSDispatchTriggerStop" => val r = parseBTSDispatchTriggerStopT(T); return r
        case "BTSDispatchTriggerPort" => val r = parseBTSDispatchTriggerPortT(T); return r
        case "BTSDispatchTriggerTimeout" => val r = parseBTSDispatchTriggerTimeoutT(T); return r
        case _ => val r = parseBTSDispatchTriggerTimeoutT(T); return r
      }
    }

    def parseBTSDispatchTriggerStop(): BTSDispatchTriggerStop = {
      val r = parseBTSDispatchTriggerStopT(F)
      return r
    }

    def parseBTSDispatchTriggerStopT(typeParsed: B): BTSDispatchTriggerStop = {
      if (!typeParsed) {
        parser.parseObjectType("BTSDispatchTriggerStop")
      }
      return BTSDispatchTriggerStop()
    }

    def parseBTSDispatchTriggerPort(): BTSDispatchTriggerPort = {
      val r = parseBTSDispatchTriggerPortT(F)
      return r
    }

    def parseBTSDispatchTriggerPortT(typeParsed: B): BTSDispatchTriggerPort = {
      if (!typeParsed) {
        parser.parseObjectType("BTSDispatchTriggerPort")
      }
      parser.parseObjectKey("port")
      val port = parseName()
      parser.parseObjectNext()
      return BTSDispatchTriggerPort(port)
    }

    def parseBTSDispatchTriggerTimeout(): BTSDispatchTriggerTimeout = {
      val r = parseBTSDispatchTriggerTimeoutT(F)
      return r
    }

    def parseBTSDispatchTriggerTimeoutT(typeParsed: B): BTSDispatchTriggerTimeout = {
      if (!typeParsed) {
        parser.parseObjectType("BTSDispatchTriggerTimeout")
      }
      parser.parseObjectKey("ports")
      val ports = parser.parseISZ(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("time")
      val time = parser.parseOption(parseBTSBehaviorTime _)
      parser.parseObjectNext()
      return BTSDispatchTriggerTimeout(ports, time)
    }

    def parseBTSExecuteCondition(): BTSExecuteCondition = {
      val t = parser.parseObjectTypes(ISZ("BTSExecuteConditionExp", "BTSExecuteConditionTimeout", "BTSExecuteConditionOtherwise"))
      t.native match {
        case "BTSExecuteConditionExp" => val r = parseBTSExecuteConditionExpT(T); return r
        case "BTSExecuteConditionTimeout" => val r = parseBTSExecuteConditionTimeoutT(T); return r
        case "BTSExecuteConditionOtherwise" => val r = parseBTSExecuteConditionOtherwiseT(T); return r
        case _ => val r = parseBTSExecuteConditionOtherwiseT(T); return r
      }
    }

    def parseBTSExecuteConditionExp(): BTSExecuteConditionExp = {
      val r = parseBTSExecuteConditionExpT(F)
      return r
    }

    def parseBTSExecuteConditionExpT(typeParsed: B): BTSExecuteConditionExp = {
      if (!typeParsed) {
        parser.parseObjectType("BTSExecuteConditionExp")
      }
      parser.parseObjectKey("exp")
      val exp = parseBTSExp()
      parser.parseObjectNext()
      return BTSExecuteConditionExp(exp)
    }

    def parseBTSExecuteConditionTimeout(): BTSExecuteConditionTimeout = {
      val r = parseBTSExecuteConditionTimeoutT(F)
      return r
    }

    def parseBTSExecuteConditionTimeoutT(typeParsed: B): BTSExecuteConditionTimeout = {
      if (!typeParsed) {
        parser.parseObjectType("BTSExecuteConditionTimeout")
      }
      return BTSExecuteConditionTimeout()
    }

    def parseBTSExecuteConditionOtherwise(): BTSExecuteConditionOtherwise = {
      val r = parseBTSExecuteConditionOtherwiseT(F)
      return r
    }

    def parseBTSExecuteConditionOtherwiseT(typeParsed: B): BTSExecuteConditionOtherwise = {
      if (!typeParsed) {
        parser.parseObjectType("BTSExecuteConditionOtherwise")
      }
      return BTSExecuteConditionOtherwise()
    }

    def parseBTSModeCondition(): BTSModeCondition = {
      val r = parseBTSModeConditionT(F)
      return r
    }

    def parseBTSModeConditionT(typeParsed: B): BTSModeCondition = {
      if (!typeParsed) {
        parser.parseObjectType("BTSModeCondition")
      }
      return BTSModeCondition()
    }

    def parseBTSInternalCondition(): BTSInternalCondition = {
      val r = parseBTSInternalConditionT(F)
      return r
    }

    def parseBTSInternalConditionT(typeParsed: B): BTSInternalCondition = {
      if (!typeParsed) {
        parser.parseObjectType("BTSInternalCondition")
      }
      return BTSInternalCondition()
    }

    def parseBTSAssertion(): BTSAssertion = {
      val r = parseBTSAssertionT(F)
      return r
    }

    def parseBTSAssertionT(typeParsed: B): BTSAssertion = {
      if (!typeParsed) {
        parser.parseObjectType("BTSAssertion")
      }
      return BTSAssertion()
    }

    def parseBTSBehaviorActions(): BTSBehaviorActions = {
      val r = parseBTSBehaviorActionsT(F)
      return r
    }

    def parseBTSBehaviorActionsT(typeParsed: B): BTSBehaviorActions = {
      if (!typeParsed) {
        parser.parseObjectType("BTSBehaviorActions")
      }
      parser.parseObjectKey("executionOrder")
      val executionOrder = parseBTSExecutionOrderType()
      parser.parseObjectNext()
      parser.parseObjectKey("actions")
      val actions = parser.parseISZ(parseBTSAssertedAction _)
      parser.parseObjectNext()
      return BTSBehaviorActions(executionOrder, actions)
    }

    def parseBTSExecutionOrderType(): BTSExecutionOrder.Type = {
      val r = parseBTSExecutionOrderT(F)
      return r
    }

    def parseBTSExecutionOrderT(typeParsed: B): BTSExecutionOrder.Type = {
      if (!typeParsed) {
        parser.parseObjectType("BTSExecutionOrder")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      BTSExecutionOrder.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for BTSExecutionOrder.")
          return BTSExecutionOrder.byOrdinal(0).get
      }
    }

    def parseBTSAssertedAction(): BTSAssertedAction = {
      val r = parseBTSAssertedActionT(F)
      return r
    }

    def parseBTSAssertedActionT(typeParsed: B): BTSAssertedAction = {
      if (!typeParsed) {
        parser.parseObjectType("BTSAssertedAction")
      }
      parser.parseObjectKey("precondition")
      val precondition = parser.parseOption(parseBTSAssertion _)
      parser.parseObjectNext()
      parser.parseObjectKey("action")
      val action = parseBTSAction()
      parser.parseObjectNext()
      parser.parseObjectKey("postcondition")
      val postcondition = parser.parseOption(parseBTSAssertion _)
      parser.parseObjectNext()
      return BTSAssertedAction(precondition, action, postcondition)
    }

    def parseBTSAction(): BTSAction = {
      val t = parser.parseObjectTypes(ISZ("BTSSkipAction", "BTSAssignmentAction", "BTSSubprogramCallAction", "BTSPortOutAction", "BTSPortInAction", "BTSFrozenPortAction", "BTSIfBLESSAction", "BTSIfBAAction", "BTSExistentialLatticeQuantification", "BTSUniversalLatticeQuantification"))
      t.native match {
        case "BTSSkipAction" => val r = parseBTSSkipActionT(T); return r
        case "BTSAssignmentAction" => val r = parseBTSAssignmentActionT(T); return r
        case "BTSSubprogramCallAction" => val r = parseBTSSubprogramCallActionT(T); return r
        case "BTSPortOutAction" => val r = parseBTSPortOutActionT(T); return r
        case "BTSPortInAction" => val r = parseBTSPortInActionT(T); return r
        case "BTSFrozenPortAction" => val r = parseBTSFrozenPortActionT(T); return r
        case "BTSIfBLESSAction" => val r = parseBTSIfBLESSActionT(T); return r
        case "BTSIfBAAction" => val r = parseBTSIfBAActionT(T); return r
        case "BTSExistentialLatticeQuantification" => val r = parseBTSExistentialLatticeQuantificationT(T); return r
        case "BTSUniversalLatticeQuantification" => val r = parseBTSUniversalLatticeQuantificationT(T); return r
        case _ => val r = parseBTSUniversalLatticeQuantificationT(T); return r
      }
    }

    def parseBTSBasicAction(): BTSBasicAction = {
      val t = parser.parseObjectTypes(ISZ("BTSSkipAction", "BTSAssignmentAction", "BTSSubprogramCallAction", "BTSPortOutAction", "BTSPortInAction", "BTSFrozenPortAction"))
      t.native match {
        case "BTSSkipAction" => val r = parseBTSSkipActionT(T); return r
        case "BTSAssignmentAction" => val r = parseBTSAssignmentActionT(T); return r
        case "BTSSubprogramCallAction" => val r = parseBTSSubprogramCallActionT(T); return r
        case "BTSPortOutAction" => val r = parseBTSPortOutActionT(T); return r
        case "BTSPortInAction" => val r = parseBTSPortInActionT(T); return r
        case "BTSFrozenPortAction" => val r = parseBTSFrozenPortActionT(T); return r
        case _ => val r = parseBTSFrozenPortActionT(T); return r
      }
    }

    def parseBTSSkipAction(): BTSSkipAction = {
      val r = parseBTSSkipActionT(F)
      return r
    }

    def parseBTSSkipActionT(typeParsed: B): BTSSkipAction = {
      if (!typeParsed) {
        parser.parseObjectType("BTSSkipAction")
      }
      return BTSSkipAction()
    }

    def parseBTSAssignmentAction(): BTSAssignmentAction = {
      val r = parseBTSAssignmentActionT(F)
      return r
    }

    def parseBTSAssignmentActionT(typeParsed: B): BTSAssignmentAction = {
      if (!typeParsed) {
        parser.parseObjectType("BTSAssignmentAction")
      }
      parser.parseObjectKey("lhs")
      val lhs = parseBTSExp()
      parser.parseObjectNext()
      parser.parseObjectKey("rhs")
      val rhs = parseBTSExp()
      parser.parseObjectNext()
      return BTSAssignmentAction(lhs, rhs)
    }

    def parseBTSCommunicationAction(): BTSCommunicationAction = {
      val t = parser.parseObjectTypes(ISZ("BTSSubprogramCallAction", "BTSPortOutAction", "BTSPortInAction", "BTSFrozenPortAction"))
      t.native match {
        case "BTSSubprogramCallAction" => val r = parseBTSSubprogramCallActionT(T); return r
        case "BTSPortOutAction" => val r = parseBTSPortOutActionT(T); return r
        case "BTSPortInAction" => val r = parseBTSPortInActionT(T); return r
        case "BTSFrozenPortAction" => val r = parseBTSFrozenPortActionT(T); return r
        case _ => val r = parseBTSFrozenPortActionT(T); return r
      }
    }

    def parseBTSSubprogramCallAction(): BTSSubprogramCallAction = {
      val r = parseBTSSubprogramCallActionT(F)
      return r
    }

    def parseBTSSubprogramCallActionT(typeParsed: B): BTSSubprogramCallAction = {
      if (!typeParsed) {
        parser.parseObjectType("BTSSubprogramCallAction")
      }
      parser.parseObjectKey("name")
      val name = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("params")
      val params = parser.parseISZ(parseBTSFormalExpPair _)
      parser.parseObjectNext()
      return BTSSubprogramCallAction(name, params)
    }

    def parseBTSPortOutAction(): BTSPortOutAction = {
      val r = parseBTSPortOutActionT(F)
      return r
    }

    def parseBTSPortOutActionT(typeParsed: B): BTSPortOutAction = {
      if (!typeParsed) {
        parser.parseObjectType("BTSPortOutAction")
      }
      parser.parseObjectKey("name")
      val name = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("exp")
      val exp = parser.parseOption(parseBTSExp _)
      parser.parseObjectNext()
      return BTSPortOutAction(name, exp)
    }

    def parseBTSPortInAction(): BTSPortInAction = {
      val r = parseBTSPortInActionT(F)
      return r
    }

    def parseBTSPortInActionT(typeParsed: B): BTSPortInAction = {
      if (!typeParsed) {
        parser.parseObjectType("BTSPortInAction")
      }
      parser.parseObjectKey("name")
      val name = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("variable")
      val variable = parseBTSExp()
      parser.parseObjectNext()
      return BTSPortInAction(name, variable)
    }

    def parseBTSFrozenPortAction(): BTSFrozenPortAction = {
      val r = parseBTSFrozenPortActionT(F)
      return r
    }

    def parseBTSFrozenPortActionT(typeParsed: B): BTSFrozenPortAction = {
      if (!typeParsed) {
        parser.parseObjectType("BTSFrozenPortAction")
      }
      parser.parseObjectKey("portName")
      val portName = parseName()
      parser.parseObjectNext()
      return BTSFrozenPortAction(portName)
    }

    def parseBTSControlAction(): BTSControlAction = {
      val t = parser.parseObjectTypes(ISZ("BTSIfBLESSAction", "BTSIfBAAction"))
      t.native match {
        case "BTSIfBLESSAction" => val r = parseBTSIfBLESSActionT(T); return r
        case "BTSIfBAAction" => val r = parseBTSIfBAActionT(T); return r
        case _ => val r = parseBTSIfBAActionT(T); return r
      }
    }

    def parseBTSIfBLESSAction(): BTSIfBLESSAction = {
      val r = parseBTSIfBLESSActionT(F)
      return r
    }

    def parseBTSIfBLESSActionT(typeParsed: B): BTSIfBLESSAction = {
      if (!typeParsed) {
        parser.parseObjectType("BTSIfBLESSAction")
      }
      parser.parseObjectKey("availability")
      val availability = parser.parseOption(parseTODO _)
      parser.parseObjectNext()
      parser.parseObjectKey("alternatives")
      val alternatives = parser.parseISZ(parseBTSGuardedAction _)
      parser.parseObjectNext()
      return BTSIfBLESSAction(availability, alternatives)
    }

    def parseBTSGuardedAction(): BTSGuardedAction = {
      val r = parseBTSGuardedActionT(F)
      return r
    }

    def parseBTSGuardedActionT(typeParsed: B): BTSGuardedAction = {
      if (!typeParsed) {
        parser.parseObjectType("BTSGuardedAction")
      }
      parser.parseObjectKey("guard")
      val guard = parseBTSExp()
      parser.parseObjectNext()
      parser.parseObjectKey("action")
      val action = parseBTSAssertedAction()
      parser.parseObjectNext()
      return BTSGuardedAction(guard, action)
    }

    def parseBTSIfBAAction(): BTSIfBAAction = {
      val r = parseBTSIfBAActionT(F)
      return r
    }

    def parseBTSIfBAActionT(typeParsed: B): BTSIfBAAction = {
      if (!typeParsed) {
        parser.parseObjectType("BTSIfBAAction")
      }
      parser.parseObjectKey("ifBranch")
      val ifBranch = parseBTSConditionalActions()
      parser.parseObjectNext()
      parser.parseObjectKey("elseIfBranches")
      val elseIfBranches = parser.parseISZ(parseBTSConditionalActions _)
      parser.parseObjectNext()
      parser.parseObjectKey("elseBranch")
      val elseBranch = parser.parseOption(parseBTSBehaviorActions _)
      parser.parseObjectNext()
      return BTSIfBAAction(ifBranch, elseIfBranches, elseBranch)
    }

    def parseBTSConditionalActions(): BTSConditionalActions = {
      val r = parseBTSConditionalActionsT(F)
      return r
    }

    def parseBTSConditionalActionsT(typeParsed: B): BTSConditionalActions = {
      if (!typeParsed) {
        parser.parseObjectType("BTSConditionalActions")
      }
      parser.parseObjectKey("cond")
      val cond = parseBTSExp()
      parser.parseObjectNext()
      parser.parseObjectKey("actions")
      val actions = parseBTSBehaviorActions()
      parser.parseObjectNext()
      return BTSConditionalActions(cond, actions)
    }

    def parseBTSQuantificationActions(): BTSQuantificationActions = {
      val t = parser.parseObjectTypes(ISZ("BTSExistentialLatticeQuantification", "BTSUniversalLatticeQuantification"))
      t.native match {
        case "BTSExistentialLatticeQuantification" => val r = parseBTSExistentialLatticeQuantificationT(T); return r
        case "BTSUniversalLatticeQuantification" => val r = parseBTSUniversalLatticeQuantificationT(T); return r
        case _ => val r = parseBTSUniversalLatticeQuantificationT(T); return r
      }
    }

    def parseBTSExistentialLatticeQuantification(): BTSExistentialLatticeQuantification = {
      val r = parseBTSExistentialLatticeQuantificationT(F)
      return r
    }

    def parseBTSExistentialLatticeQuantificationT(typeParsed: B): BTSExistentialLatticeQuantification = {
      if (!typeParsed) {
        parser.parseObjectType("BTSExistentialLatticeQuantification")
      }
      parser.parseObjectKey("quantifiedVariables")
      val quantifiedVariables = parser.parseISZ(parseBTSVariableDeclaration _)
      parser.parseObjectNext()
      parser.parseObjectKey("actions")
      val actions = parseBTSBehaviorActions()
      parser.parseObjectNext()
      parser.parseObjectKey("timeout")
      val timeout = parser.parseOption(parseBTSBehaviorTime _)
      parser.parseObjectNext()
      parser.parseObjectKey("catchClause")
      val catchClause = parser.parseOption(parseTODO _)
      parser.parseObjectNext()
      return BTSExistentialLatticeQuantification(quantifiedVariables, actions, timeout, catchClause)
    }

    def parseBTSUniversalLatticeQuantification(): BTSUniversalLatticeQuantification = {
      val r = parseBTSUniversalLatticeQuantificationT(F)
      return r
    }

    def parseBTSUniversalLatticeQuantificationT(typeParsed: B): BTSUniversalLatticeQuantification = {
      if (!typeParsed) {
        parser.parseObjectType("BTSUniversalLatticeQuantification")
      }
      parser.parseObjectKey("latticeVariables")
      val latticeVariables = parser.parseISZ(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("range")
      val range = parser.parseOption(parseTODO _)
      parser.parseObjectNext()
      parser.parseObjectKey("elq")
      val elq = parseBTSExistentialLatticeQuantification()
      parser.parseObjectNext()
      return BTSUniversalLatticeQuantification(latticeVariables, range, elq)
    }

    def parseBTSExp(): BTSExp = {
      val t = parser.parseObjectTypes(ISZ("BTSUnaryExp", "BTSBinaryExp", "BTSLiteralExp", "BTSNameExp", "BTSIndexingExp", "BTSAccessExp", "BTSFunctionCall"))
      t.native match {
        case "BTSUnaryExp" => val r = parseBTSUnaryExpT(T); return r
        case "BTSBinaryExp" => val r = parseBTSBinaryExpT(T); return r
        case "BTSLiteralExp" => val r = parseBTSLiteralExpT(T); return r
        case "BTSNameExp" => val r = parseBTSNameExpT(T); return r
        case "BTSIndexingExp" => val r = parseBTSIndexingExpT(T); return r
        case "BTSAccessExp" => val r = parseBTSAccessExpT(T); return r
        case "BTSFunctionCall" => val r = parseBTSFunctionCallT(T); return r
        case _ => val r = parseBTSFunctionCallT(T); return r
      }
    }

    def parseBTSUnaryExp(): BTSUnaryExp = {
      val r = parseBTSUnaryExpT(F)
      return r
    }

    def parseBTSUnaryExpT(typeParsed: B): BTSUnaryExp = {
      if (!typeParsed) {
        parser.parseObjectType("BTSUnaryExp")
      }
      parser.parseObjectKey("op")
      val op = parseBTSUnaryOpType()
      parser.parseObjectNext()
      parser.parseObjectKey("exp")
      val exp = parseBTSExp()
      parser.parseObjectNext()
      parser.parseObjectKey("pos")
      val pos = parser.parseOption(parser.parsePosition _)
      parser.parseObjectNext()
      return BTSUnaryExp(op, exp, pos)
    }

    def parseBTSUnaryOpType(): BTSUnaryOp.Type = {
      val r = parseBTSUnaryOpT(F)
      return r
    }

    def parseBTSUnaryOpT(typeParsed: B): BTSUnaryOp.Type = {
      if (!typeParsed) {
        parser.parseObjectType("BTSUnaryOp")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      BTSUnaryOp.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for BTSUnaryOp.")
          return BTSUnaryOp.byOrdinal(0).get
      }
    }

    def parseBTSBinaryExp(): BTSBinaryExp = {
      val r = parseBTSBinaryExpT(F)
      return r
    }

    def parseBTSBinaryExpT(typeParsed: B): BTSBinaryExp = {
      if (!typeParsed) {
        parser.parseObjectType("BTSBinaryExp")
      }
      parser.parseObjectKey("op")
      val op = parseBTSBinaryOpType()
      parser.parseObjectNext()
      parser.parseObjectKey("lhs")
      val lhs = parseBTSExp()
      parser.parseObjectNext()
      parser.parseObjectKey("rhs")
      val rhs = parseBTSExp()
      parser.parseObjectNext()
      parser.parseObjectKey("pos")
      val pos = parser.parseOption(parser.parsePosition _)
      parser.parseObjectNext()
      return BTSBinaryExp(op, lhs, rhs, pos)
    }

    def parseBTSBinaryOpType(): BTSBinaryOp.Type = {
      val r = parseBTSBinaryOpT(F)
      return r
    }

    def parseBTSBinaryOpT(typeParsed: B): BTSBinaryOp.Type = {
      if (!typeParsed) {
        parser.parseObjectType("BTSBinaryOp")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      BTSBinaryOp.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for BTSBinaryOp.")
          return BTSBinaryOp.byOrdinal(0).get
      }
    }

    def parseBTSLiteralTypeType(): BTSLiteralType.Type = {
      val r = parseBTSLiteralTypeT(F)
      return r
    }

    def parseBTSLiteralTypeT(typeParsed: B): BTSLiteralType.Type = {
      if (!typeParsed) {
        parser.parseObjectType("BTSLiteralType")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      BTSLiteralType.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for BTSLiteralType.")
          return BTSLiteralType.byOrdinal(0).get
      }
    }

    def parseBTSLiteralExp(): BTSLiteralExp = {
      val r = parseBTSLiteralExpT(F)
      return r
    }

    def parseBTSLiteralExpT(typeParsed: B): BTSLiteralExp = {
      if (!typeParsed) {
        parser.parseObjectType("BTSLiteralExp")
      }
      parser.parseObjectKey("typ")
      val typ = parseBTSLiteralTypeType()
      parser.parseObjectNext()
      parser.parseObjectKey("exp")
      val exp = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("pos")
      val pos = parser.parseOption(parser.parsePosition _)
      parser.parseObjectNext()
      return BTSLiteralExp(typ, exp, pos)
    }

    def parseBTSNameExp(): BTSNameExp = {
      val r = parseBTSNameExpT(F)
      return r
    }

    def parseBTSNameExpT(typeParsed: B): BTSNameExp = {
      if (!typeParsed) {
        parser.parseObjectType("BTSNameExp")
      }
      parser.parseObjectKey("name")
      val name = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("pos")
      val pos = parser.parseOption(parser.parsePosition _)
      parser.parseObjectNext()
      return BTSNameExp(name, pos)
    }

    def parseBTSIndexingExp(): BTSIndexingExp = {
      val r = parseBTSIndexingExpT(F)
      return r
    }

    def parseBTSIndexingExpT(typeParsed: B): BTSIndexingExp = {
      if (!typeParsed) {
        parser.parseObjectType("BTSIndexingExp")
      }
      parser.parseObjectKey("exp")
      val exp = parseBTSExp()
      parser.parseObjectNext()
      parser.parseObjectKey("indices")
      val indices = parser.parseISZ(parseBTSExp _)
      parser.parseObjectNext()
      parser.parseObjectKey("pos")
      val pos = parser.parseOption(parser.parsePosition _)
      parser.parseObjectNext()
      return BTSIndexingExp(exp, indices, pos)
    }

    def parseBTSAccessExp(): BTSAccessExp = {
      val r = parseBTSAccessExpT(F)
      return r
    }

    def parseBTSAccessExpT(typeParsed: B): BTSAccessExp = {
      if (!typeParsed) {
        parser.parseObjectType("BTSAccessExp")
      }
      parser.parseObjectKey("exp")
      val exp = parseBTSExp()
      parser.parseObjectNext()
      parser.parseObjectKey("attributeName")
      val attributeName = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("pos")
      val pos = parser.parseOption(parser.parsePosition _)
      parser.parseObjectNext()
      return BTSAccessExp(exp, attributeName, pos)
    }

    def parseBTSFunctionCall(): BTSFunctionCall = {
      val r = parseBTSFunctionCallT(F)
      return r
    }

    def parseBTSFunctionCallT(typeParsed: B): BTSFunctionCall = {
      if (!typeParsed) {
        parser.parseObjectType("BTSFunctionCall")
      }
      parser.parseObjectKey("name")
      val name = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("args")
      val args = parser.parseISZ(parseBTSFormalExpPair _)
      parser.parseObjectNext()
      parser.parseObjectKey("pos")
      val pos = parser.parseOption(parser.parsePosition _)
      parser.parseObjectNext()
      return BTSFunctionCall(name, args, pos)
    }

    def parseBTSFormalExpPair(): BTSFormalExpPair = {
      val r = parseBTSFormalExpPairT(F)
      return r
    }

    def parseBTSFormalExpPairT(typeParsed: B): BTSFormalExpPair = {
      if (!typeParsed) {
        parser.parseObjectType("BTSFormalExpPair")
      }
      parser.parseObjectKey("paramName")
      val paramName = parser.parseOption(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("exp")
      val exp = parser.parseOption(parseBTSExp _)
      parser.parseObjectNext()
      parser.parseObjectKey("pos")
      val pos = parser.parseOption(parser.parsePosition _)
      parser.parseObjectNext()
      return BTSFormalExpPair(paramName, exp, pos)
    }

    def parseBTSBehaviorTime(): BTSBehaviorTime = {
      val r = parseBTSBehaviorTimeT(F)
      return r
    }

    def parseBTSBehaviorTimeT(typeParsed: B): BTSBehaviorTime = {
      if (!typeParsed) {
        parser.parseObjectType("BTSBehaviorTime")
      }
      return BTSBehaviorTime()
    }

    def parseTODO(): TODO = {
      val r = parseTODOT(F)
      return r
    }

    def parseTODOT(typeParsed: B): TODO = {
      if (!typeParsed) {
        parser.parseObjectType("TODO")
      }
      return TODO()
    }

    def parseAttr(): Attr = {
      val r = parseAttrT(F)
      return r
    }

    def parseAttrT(typeParsed: B): Attr = {
      if (!typeParsed) {
        parser.parseObjectType("Attr")
      }
      parser.parseObjectKey("posOpt")
      val posOpt = parser.parseOption(parser.parsePosition _)
      parser.parseObjectNext()
      return Attr(posOpt)
    }

    def parseEmv2Annex(): Emv2Annex = {
      val t = parser.parseObjectTypes(ISZ("ErrorTypeDef", "ErrorAliasDef", "ErrorTypeSetDef", "BehaveStateMachine", "ErrorEvent", "ErrorState", "ErrorTransition", "ConditionTrigger", "AndCondition", "OrCondition", "AllCondition", "OrMoreCondition", "OrLessCondition", "Emv2Clause", "Emv2Propagation", "Emv2Flow", "Emv2BehaviorSection", "ErrorPropagation"))
      t.native match {
        case "ErrorTypeDef" => val r = parseErrorTypeDefT(T); return r
        case "ErrorAliasDef" => val r = parseErrorAliasDefT(T); return r
        case "ErrorTypeSetDef" => val r = parseErrorTypeSetDefT(T); return r
        case "BehaveStateMachine" => val r = parseBehaveStateMachineT(T); return r
        case "ErrorEvent" => val r = parseErrorEventT(T); return r
        case "ErrorState" => val r = parseErrorStateT(T); return r
        case "ErrorTransition" => val r = parseErrorTransitionT(T); return r
        case "ConditionTrigger" => val r = parseConditionTriggerT(T); return r
        case "AndCondition" => val r = parseAndConditionT(T); return r
        case "OrCondition" => val r = parseOrConditionT(T); return r
        case "AllCondition" => val r = parseAllConditionT(T); return r
        case "OrMoreCondition" => val r = parseOrMoreConditionT(T); return r
        case "OrLessCondition" => val r = parseOrLessConditionT(T); return r
        case "Emv2Clause" => val r = parseEmv2ClauseT(T); return r
        case "Emv2Propagation" => val r = parseEmv2PropagationT(T); return r
        case "Emv2Flow" => val r = parseEmv2FlowT(T); return r
        case "Emv2BehaviorSection" => val r = parseEmv2BehaviorSectionT(T); return r
        case "ErrorPropagation" => val r = parseErrorPropagationT(T); return r
        case _ => val r = parseErrorPropagationT(T); return r
      }
    }

    def parseEmv2Lib(): Emv2Lib = {
      val t = parser.parseObjectTypes(ISZ("Emv2Library"))
      t.native match {
        case "Emv2Library" => val r = parseEmv2LibraryT(T); return r
        case _ => val r = parseEmv2LibraryT(T); return r
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

    def parseEmv2ElementRef(): Emv2ElementRef = {
      val r = parseEmv2ElementRefT(F)
      return r
    }

    def parseEmv2ElementRefT(typeParsed: B): Emv2ElementRef = {
      if (!typeParsed) {
        parser.parseObjectType("Emv2ElementRef")
      }
      parser.parseObjectKey("kind")
      val kind = parseEmv2ElementKindType()
      parser.parseObjectNext()
      parser.parseObjectKey("name")
      val name = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("errorTypes")
      val errorTypes = parser.parseISZ(parseName _)
      parser.parseObjectNext()
      return Emv2ElementRef(kind, name, errorTypes)
    }

    def parseEmv2ElementKindType(): Emv2ElementKind.Type = {
      val r = parseEmv2ElementKindT(F)
      return r
    }

    def parseEmv2ElementKindT(typeParsed: B): Emv2ElementKind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Emv2ElementKind")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Emv2ElementKind.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Emv2ElementKind.")
          return Emv2ElementKind.byOrdinal(0).get
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
      parser.parseObjectKey("errorTypeDef")
      val errorTypeDef = parser.parseISZ(parseErrorTypeDef _)
      parser.parseObjectNext()
      parser.parseObjectKey("errorTypeSetDef")
      val errorTypeSetDef = parser.parseISZ(parseErrorTypeSetDef _)
      parser.parseObjectNext()
      parser.parseObjectKey("alias")
      val alias = parser.parseISZ(parseErrorAliasDef _)
      parser.parseObjectNext()
      parser.parseObjectKey("behaveStateMachine")
      val behaveStateMachine = parser.parseISZ(parseBehaveStateMachine _)
      parser.parseObjectNext()
      return Emv2Library(name, useTypes, errorTypeDef, errorTypeSetDef, alias, behaveStateMachine)
    }

    def parseErrorKindType(): ErrorKind.Type = {
      val r = parseErrorKindT(F)
      return r
    }

    def parseErrorKindT(typeParsed: B): ErrorKind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("ErrorKind")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      ErrorKind.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for ErrorKind.")
          return ErrorKind.byOrdinal(0).get
      }
    }

    def parseErrorTypeDef(): ErrorTypeDef = {
      val r = parseErrorTypeDefT(F)
      return r
    }

    def parseErrorTypeDefT(typeParsed: B): ErrorTypeDef = {
      if (!typeParsed) {
        parser.parseObjectType("ErrorTypeDef")
      }
      parser.parseObjectKey("id")
      val id = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("extendType")
      val extendType = parser.parseOption(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("uriFrag")
      val uriFrag = parser.parseString()
      parser.parseObjectNext()
      return ErrorTypeDef(id, extendType, uriFrag)
    }

    def parseErrorAliasDef(): ErrorAliasDef = {
      val r = parseErrorAliasDefT(F)
      return r
    }

    def parseErrorAliasDefT(typeParsed: B): ErrorAliasDef = {
      if (!typeParsed) {
        parser.parseObjectType("ErrorAliasDef")
      }
      parser.parseObjectKey("errorType")
      val errorType = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("aliseType")
      val aliseType = parseName()
      parser.parseObjectNext()
      return ErrorAliasDef(errorType, aliseType)
    }

    def parseErrorTypeSetDef(): ErrorTypeSetDef = {
      val r = parseErrorTypeSetDefT(F)
      return r
    }

    def parseErrorTypeSetDefT(typeParsed: B): ErrorTypeSetDef = {
      if (!typeParsed) {
        parser.parseObjectType("ErrorTypeSetDef")
      }
      parser.parseObjectKey("id")
      val id = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("errorTypes")
      val errorTypes = parser.parseISZ(parseName _)
      parser.parseObjectNext()
      return ErrorTypeSetDef(id, errorTypes)
    }

    def parseBehaveStateMachine(): BehaveStateMachine = {
      val r = parseBehaveStateMachineT(F)
      return r
    }

    def parseBehaveStateMachineT(typeParsed: B): BehaveStateMachine = {
      if (!typeParsed) {
        parser.parseObjectType("BehaveStateMachine")
      }
      parser.parseObjectKey("id")
      val id = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("events")
      val events = parser.parseISZ(parseErrorEvent _)
      parser.parseObjectNext()
      parser.parseObjectKey("states")
      val states = parser.parseISZ(parseErrorState _)
      parser.parseObjectNext()
      parser.parseObjectKey("transitions")
      val transitions = parser.parseISZ(parseErrorTransition _)
      parser.parseObjectNext()
      parser.parseObjectKey("properties")
      val properties = parser.parseISZ(parseProperty _)
      parser.parseObjectNext()
      return BehaveStateMachine(id, events, states, transitions, properties)
    }

    def parseErrorEvent(): ErrorEvent = {
      val r = parseErrorEventT(F)
      return r
    }

    def parseErrorEventT(typeParsed: B): ErrorEvent = {
      if (!typeParsed) {
        parser.parseObjectType("ErrorEvent")
      }
      parser.parseObjectKey("id")
      val id = parseName()
      parser.parseObjectNext()
      return ErrorEvent(id)
    }

    def parseErrorState(): ErrorState = {
      val r = parseErrorStateT(F)
      return r
    }

    def parseErrorStateT(typeParsed: B): ErrorState = {
      if (!typeParsed) {
        parser.parseObjectType("ErrorState")
      }
      parser.parseObjectKey("id")
      val id = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("isInitial")
      val isInitial = parser.parseB()
      parser.parseObjectNext()
      return ErrorState(id, isInitial)
    }

    def parseErrorTransition(): ErrorTransition = {
      val r = parseErrorTransitionT(F)
      return r
    }

    def parseErrorTransitionT(typeParsed: B): ErrorTransition = {
      if (!typeParsed) {
        parser.parseObjectType("ErrorTransition")
      }
      parser.parseObjectKey("id")
      val id = parser.parseOption(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("sourceState")
      val sourceState = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("condition")
      val condition = parseErrorCondition()
      parser.parseObjectNext()
      parser.parseObjectKey("targetState")
      val targetState = parseName()
      parser.parseObjectNext()
      return ErrorTransition(id, sourceState, condition, targetState)
    }

    def parseErrorCondition(): ErrorCondition = {
      val t = parser.parseObjectTypes(ISZ("ConditionTrigger", "AndCondition", "OrCondition", "AllCondition", "OrMoreCondition", "OrLessCondition"))
      t.native match {
        case "ConditionTrigger" => val r = parseConditionTriggerT(T); return r
        case "AndCondition" => val r = parseAndConditionT(T); return r
        case "OrCondition" => val r = parseOrConditionT(T); return r
        case "AllCondition" => val r = parseAllConditionT(T); return r
        case "OrMoreCondition" => val r = parseOrMoreConditionT(T); return r
        case "OrLessCondition" => val r = parseOrLessConditionT(T); return r
        case _ => val r = parseOrLessConditionT(T); return r
      }
    }

    def parseConditionTrigger(): ConditionTrigger = {
      val r = parseConditionTriggerT(F)
      return r
    }

    def parseConditionTriggerT(typeParsed: B): ConditionTrigger = {
      if (!typeParsed) {
        parser.parseObjectType("ConditionTrigger")
      }
      parser.parseObjectKey("events")
      val events = parser.parseISZ(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("propagationPoints")
      val propagationPoints = parser.parseISZ(parseEmv2Propagation _)
      parser.parseObjectNext()
      return ConditionTrigger(events, propagationPoints)
    }

    def parseAndCondition(): AndCondition = {
      val r = parseAndConditionT(F)
      return r
    }

    def parseAndConditionT(typeParsed: B): AndCondition = {
      if (!typeParsed) {
        parser.parseObjectType("AndCondition")
      }
      parser.parseObjectKey("op")
      val op = parser.parseISZ(parseErrorCondition _)
      parser.parseObjectNext()
      return AndCondition(op)
    }

    def parseOrCondition(): OrCondition = {
      val r = parseOrConditionT(F)
      return r
    }

    def parseOrConditionT(typeParsed: B): OrCondition = {
      if (!typeParsed) {
        parser.parseObjectType("OrCondition")
      }
      parser.parseObjectKey("op")
      val op = parser.parseISZ(parseErrorCondition _)
      parser.parseObjectNext()
      return OrCondition(op)
    }

    def parseAllCondition(): AllCondition = {
      val r = parseAllConditionT(F)
      return r
    }

    def parseAllConditionT(typeParsed: B): AllCondition = {
      if (!typeParsed) {
        parser.parseObjectType("AllCondition")
      }
      parser.parseObjectKey("op")
      val op = parser.parseISZ(parseErrorCondition _)
      parser.parseObjectNext()
      return AllCondition(op)
    }

    def parseOrMoreCondition(): OrMoreCondition = {
      val r = parseOrMoreConditionT(F)
      return r
    }

    def parseOrMoreConditionT(typeParsed: B): OrMoreCondition = {
      if (!typeParsed) {
        parser.parseObjectType("OrMoreCondition")
      }
      parser.parseObjectKey("number")
      val number = parser.parseZ()
      parser.parseObjectNext()
      parser.parseObjectKey("conditions")
      val conditions = parser.parseISZ(parseErrorCondition _)
      parser.parseObjectNext()
      return OrMoreCondition(number, conditions)
    }

    def parseOrLessCondition(): OrLessCondition = {
      val r = parseOrLessConditionT(F)
      return r
    }

    def parseOrLessConditionT(typeParsed: B): OrLessCondition = {
      if (!typeParsed) {
        parser.parseObjectType("OrLessCondition")
      }
      parser.parseObjectKey("number")
      val number = parser.parseZ()
      parser.parseObjectNext()
      parser.parseObjectKey("conditions")
      val conditions = parser.parseISZ(parseErrorCondition _)
      parser.parseObjectNext()
      return OrLessCondition(number, conditions)
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
      val libraries = parser.parseISZ(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("propagations")
      val propagations = parser.parseISZ(parseEmv2Propagation _)
      parser.parseObjectNext()
      parser.parseObjectKey("flows")
      val flows = parser.parseISZ(parseEmv2Flow _)
      parser.parseObjectNext()
      parser.parseObjectKey("componentBehavior")
      val componentBehavior = parser.parseOption(parseEmv2BehaviorSection _)
      parser.parseObjectNext()
      parser.parseObjectKey("properties")
      val properties = parser.parseISZ(parseProperty _)
      parser.parseObjectNext()
      return Emv2Clause(libraries, propagations, flows, componentBehavior, properties)
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
      val propagationPoint = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("errorTokens")
      val errorTokens = parser.parseISZ(parseName _)
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
      parser.parseObjectKey("uriFrag")
      val uriFrag = parser.parseString()
      parser.parseObjectNext()
      return Emv2Flow(identifier, kind, sourcePropagation, sinkPropagation, uriFrag)
    }

    def parseEmv2BehaviorSection(): Emv2BehaviorSection = {
      val r = parseEmv2BehaviorSectionT(F)
      return r
    }

    def parseEmv2BehaviorSectionT(typeParsed: B): Emv2BehaviorSection = {
      if (!typeParsed) {
        parser.parseObjectType("Emv2BehaviorSection")
      }
      parser.parseObjectKey("events")
      val events = parser.parseISZ(parseErrorEvent _)
      parser.parseObjectNext()
      parser.parseObjectKey("transitions")
      val transitions = parser.parseISZ(parseErrorTransition _)
      parser.parseObjectNext()
      parser.parseObjectKey("propagations")
      val propagations = parser.parseISZ(parseErrorPropagation _)
      parser.parseObjectNext()
      return Emv2BehaviorSection(events, transitions, propagations)
    }

    def parseErrorPropagation(): ErrorPropagation = {
      val r = parseErrorPropagationT(F)
      return r
    }

    def parseErrorPropagationT(typeParsed: B): ErrorPropagation = {
      if (!typeParsed) {
        parser.parseObjectType("ErrorPropagation")
      }
      parser.parseObjectKey("id")
      val id = parser.parseOption(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("source")
      val source = parser.parseISZ(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("condition")
      val condition = parser.parseOption(parseErrorCondition _)
      parser.parseObjectNext()
      parser.parseObjectKey("target")
      val target = parser.parseISZ(parseEmv2Propagation _)
      parser.parseObjectNext()
      return ErrorPropagation(id, source, condition, target)
    }

    def parseGclSymbol(): GclSymbol = {
      val t = parser.parseObjectTypes(ISZ("GclSubclause", "GclMethod", "GclStateVar", "GclInvariant", "GclAssume", "GclGuarantee", "GclIntegration", "GclCaseStatement", "GclInitialize", "GclCompute", "GclHandle", "GclTODO", "GclLib", "InfoFlowClause"))
      t.native match {
        case "GclSubclause" => val r = parseGclSubclauseT(T); return r
        case "GclMethod" => val r = parseGclMethodT(T); return r
        case "GclStateVar" => val r = parseGclStateVarT(T); return r
        case "GclInvariant" => val r = parseGclInvariantT(T); return r
        case "GclAssume" => val r = parseGclAssumeT(T); return r
        case "GclGuarantee" => val r = parseGclGuaranteeT(T); return r
        case "GclIntegration" => val r = parseGclIntegrationT(T); return r
        case "GclCaseStatement" => val r = parseGclCaseStatementT(T); return r
        case "GclInitialize" => val r = parseGclInitializeT(T); return r
        case "GclCompute" => val r = parseGclComputeT(T); return r
        case "GclHandle" => val r = parseGclHandleT(T); return r
        case "GclTODO" => val r = parseGclTODOT(T); return r
        case "GclLib" => val r = parseGclLibT(T); return r
        case "InfoFlowClause" => val r = parseInfoFlowClauseT(T); return r
        case _ => val r = parseInfoFlowClauseT(T); return r
      }
    }

    def parseGclSubclause(): GclSubclause = {
      val r = parseGclSubclauseT(F)
      return r
    }

    def parseGclSubclauseT(typeParsed: B): GclSubclause = {
      if (!typeParsed) {
        parser.parseObjectType("GclSubclause")
      }
      parser.parseObjectKey("state")
      val state = parser.parseISZ(parseGclStateVar _)
      parser.parseObjectNext()
      parser.parseObjectKey("methods")
      val methods = parser.parseISZ(parseGclMethod _)
      parser.parseObjectNext()
      parser.parseObjectKey("invariants")
      val invariants = parser.parseISZ(parseGclInvariant _)
      parser.parseObjectNext()
      parser.parseObjectKey("initializes")
      val initializes = parser.parseOption(parseGclInitialize _)
      parser.parseObjectNext()
      parser.parseObjectKey("integration")
      val integration = parser.parseOption(parseGclIntegration _)
      parser.parseObjectNext()
      parser.parseObjectKey("compute")
      val compute = parser.parseOption(parseGclCompute _)
      parser.parseObjectNext()
      return GclSubclause(state, methods, invariants, initializes, integration, compute)
    }

    def parseGclMethod(): GclMethod = {
      val r = parseGclMethodT(F)
      return r
    }

    def parseGclMethodT(typeParsed: B): GclMethod = {
      if (!typeParsed) {
        parser.parseObjectType("GclMethod")
      }
      parser.parseObjectKey("method")
      val method = parse_langastStmtMethod()
      parser.parseObjectNext()
      return GclMethod(method)
    }

    def parseGclStateVar(): GclStateVar = {
      val r = parseGclStateVarT(F)
      return r
    }

    def parseGclStateVarT(typeParsed: B): GclStateVar = {
      if (!typeParsed) {
        parser.parseObjectType("GclStateVar")
      }
      parser.parseObjectKey("name")
      val name = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("classifier")
      val classifier = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("posOpt")
      val posOpt = parser.parseOption(parser.parsePosition _)
      parser.parseObjectNext()
      return GclStateVar(name, classifier, posOpt)
    }

    def parseGclClause(): GclClause = {
      val t = parser.parseObjectTypes(ISZ("GclInvariant", "GclAssume", "GclGuarantee", "InfoFlowClause"))
      t.native match {
        case "GclInvariant" => val r = parseGclInvariantT(T); return r
        case "GclAssume" => val r = parseGclAssumeT(T); return r
        case "GclGuarantee" => val r = parseGclGuaranteeT(T); return r
        case "InfoFlowClause" => val r = parseInfoFlowClauseT(T); return r
        case _ => val r = parseInfoFlowClauseT(T); return r
      }
    }

    def parseGclSpec(): GclSpec = {
      val t = parser.parseObjectTypes(ISZ("GclInvariant", "GclAssume", "GclGuarantee"))
      t.native match {
        case "GclInvariant" => val r = parseGclInvariantT(T); return r
        case "GclAssume" => val r = parseGclAssumeT(T); return r
        case "GclGuarantee" => val r = parseGclGuaranteeT(T); return r
        case _ => val r = parseGclGuaranteeT(T); return r
      }
    }

    def parseGclInvariant(): GclInvariant = {
      val r = parseGclInvariantT(F)
      return r
    }

    def parseGclInvariantT(typeParsed: B): GclInvariant = {
      if (!typeParsed) {
        parser.parseObjectType("GclInvariant")
      }
      parser.parseObjectKey("id")
      val id = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("descriptor")
      val descriptor = parser.parseOption(parser.parseString _)
      parser.parseObjectNext()
      parser.parseObjectKey("exp")
      val exp = parse_langastExp()
      parser.parseObjectNext()
      parser.parseObjectKey("posOpt")
      val posOpt = parser.parseOption(parser.parsePosition _)
      parser.parseObjectNext()
      return GclInvariant(id, descriptor, exp, posOpt)
    }

    def parseGclComputeSpec(): GclComputeSpec = {
      val t = parser.parseObjectTypes(ISZ("GclAssume", "GclGuarantee"))
      t.native match {
        case "GclAssume" => val r = parseGclAssumeT(T); return r
        case "GclGuarantee" => val r = parseGclGuaranteeT(T); return r
        case _ => val r = parseGclGuaranteeT(T); return r
      }
    }

    def parseGclAssume(): GclAssume = {
      val r = parseGclAssumeT(F)
      return r
    }

    def parseGclAssumeT(typeParsed: B): GclAssume = {
      if (!typeParsed) {
        parser.parseObjectType("GclAssume")
      }
      parser.parseObjectKey("id")
      val id = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("descriptor")
      val descriptor = parser.parseOption(parser.parseString _)
      parser.parseObjectNext()
      parser.parseObjectKey("exp")
      val exp = parse_langastExp()
      parser.parseObjectNext()
      parser.parseObjectKey("posOpt")
      val posOpt = parser.parseOption(parser.parsePosition _)
      parser.parseObjectNext()
      return GclAssume(id, descriptor, exp, posOpt)
    }

    def parseGclGuarantee(): GclGuarantee = {
      val r = parseGclGuaranteeT(F)
      return r
    }

    def parseGclGuaranteeT(typeParsed: B): GclGuarantee = {
      if (!typeParsed) {
        parser.parseObjectType("GclGuarantee")
      }
      parser.parseObjectKey("id")
      val id = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("descriptor")
      val descriptor = parser.parseOption(parser.parseString _)
      parser.parseObjectNext()
      parser.parseObjectKey("exp")
      val exp = parse_langastExp()
      parser.parseObjectNext()
      parser.parseObjectKey("posOpt")
      val posOpt = parser.parseOption(parser.parsePosition _)
      parser.parseObjectNext()
      return GclGuarantee(id, descriptor, exp, posOpt)
    }

    def parseGclIntegration(): GclIntegration = {
      val r = parseGclIntegrationT(F)
      return r
    }

    def parseGclIntegrationT(typeParsed: B): GclIntegration = {
      if (!typeParsed) {
        parser.parseObjectType("GclIntegration")
      }
      parser.parseObjectKey("specs")
      val specs = parser.parseISZ(parseGclSpec _)
      parser.parseObjectNext()
      return GclIntegration(specs)
    }

    def parseGclCaseStatement(): GclCaseStatement = {
      val r = parseGclCaseStatementT(F)
      return r
    }

    def parseGclCaseStatementT(typeParsed: B): GclCaseStatement = {
      if (!typeParsed) {
        parser.parseObjectType("GclCaseStatement")
      }
      parser.parseObjectKey("id")
      val id = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("descriptor")
      val descriptor = parser.parseOption(parser.parseString _)
      parser.parseObjectNext()
      parser.parseObjectKey("assumes")
      val assumes = parse_langastExp()
      parser.parseObjectNext()
      parser.parseObjectKey("guarantees")
      val guarantees = parse_langastExp()
      parser.parseObjectNext()
      parser.parseObjectKey("posOpt")
      val posOpt = parser.parseOption(parser.parsePosition _)
      parser.parseObjectNext()
      return GclCaseStatement(id, descriptor, assumes, guarantees, posOpt)
    }

    def parseGclInitialize(): GclInitialize = {
      val r = parseGclInitializeT(F)
      return r
    }

    def parseGclInitializeT(typeParsed: B): GclInitialize = {
      if (!typeParsed) {
        parser.parseObjectType("GclInitialize")
      }
      parser.parseObjectKey("modifies")
      val modifies = parser.parseISZ(parse_langastExp _)
      parser.parseObjectNext()
      parser.parseObjectKey("guarantees")
      val guarantees = parser.parseISZ(parseGclGuarantee _)
      parser.parseObjectNext()
      parser.parseObjectKey("flows")
      val flows = parser.parseISZ(parseInfoFlowClause _)
      parser.parseObjectNext()
      return GclInitialize(modifies, guarantees, flows)
    }

    def parseGclCompute(): GclCompute = {
      val r = parseGclComputeT(F)
      return r
    }

    def parseGclComputeT(typeParsed: B): GclCompute = {
      if (!typeParsed) {
        parser.parseObjectType("GclCompute")
      }
      parser.parseObjectKey("modifies")
      val modifies = parser.parseISZ(parse_langastExp _)
      parser.parseObjectNext()
      parser.parseObjectKey("specs")
      val specs = parser.parseISZ(parseGclComputeSpec _)
      parser.parseObjectNext()
      parser.parseObjectKey("cases")
      val cases = parser.parseISZ(parseGclCaseStatement _)
      parser.parseObjectNext()
      parser.parseObjectKey("handlers")
      val handlers = parser.parseISZ(parseGclHandle _)
      parser.parseObjectNext()
      parser.parseObjectKey("flows")
      val flows = parser.parseISZ(parseInfoFlowClause _)
      parser.parseObjectNext()
      return GclCompute(modifies, specs, cases, handlers, flows)
    }

    def parseGclHandle(): GclHandle = {
      val r = parseGclHandleT(F)
      return r
    }

    def parseGclHandleT(typeParsed: B): GclHandle = {
      if (!typeParsed) {
        parser.parseObjectType("GclHandle")
      }
      parser.parseObjectKey("port")
      val port = parse_langastExp()
      parser.parseObjectNext()
      parser.parseObjectKey("modifies")
      val modifies = parser.parseISZ(parse_langastExp _)
      parser.parseObjectNext()
      parser.parseObjectKey("guarantees")
      val guarantees = parser.parseISZ(parseGclGuarantee _)
      parser.parseObjectNext()
      return GclHandle(port, modifies, guarantees)
    }

    def parseGclTODO(): GclTODO = {
      val r = parseGclTODOT(F)
      return r
    }

    def parseGclTODOT(typeParsed: B): GclTODO = {
      if (!typeParsed) {
        parser.parseObjectType("GclTODO")
      }
      return GclTODO()
    }

    def parseGclLib(): GclLib = {
      val r = parseGclLibT(F)
      return r
    }

    def parseGclLibT(typeParsed: B): GclLib = {
      if (!typeParsed) {
        parser.parseObjectType("GclLib")
      }
      parser.parseObjectKey("containingPackage")
      val containingPackage = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("methods")
      val methods = parser.parseISZ(parseGclMethod _)
      parser.parseObjectNext()
      return GclLib(containingPackage, methods)
    }

    def parseInfoFlowClause(): InfoFlowClause = {
      val r = parseInfoFlowClauseT(F)
      return r
    }

    def parseInfoFlowClauseT(typeParsed: B): InfoFlowClause = {
      if (!typeParsed) {
        parser.parseObjectType("InfoFlowClause")
      }
      parser.parseObjectKey("id")
      val id = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("descriptor")
      val descriptor = parser.parseOption(parser.parseString _)
      parser.parseObjectNext()
      parser.parseObjectKey("from")
      val from = parser.parseISZ(parse_langastExp _)
      parser.parseObjectNext()
      parser.parseObjectKey("to")
      val to = parser.parseISZ(parse_langastExp _)
      parser.parseObjectNext()
      parser.parseObjectKey("posOpt")
      val posOpt = parser.parseOption(parser.parsePosition _)
      parser.parseObjectNext()
      return InfoFlowClause(id, descriptor, from, to, posOpt)
    }

    def parseSmfAnnex(): SmfAnnex = {
      val t = parser.parseObjectTypes(ISZ("SmfClause", "SmfClassification", "SmfDeclass", "SmfType"))
      t.native match {
        case "SmfClause" => val r = parseSmfClauseT(T); return r
        case "SmfClassification" => val r = parseSmfClassificationT(T); return r
        case "SmfDeclass" => val r = parseSmfDeclassT(T); return r
        case "SmfType" => val r = parseSmfTypeT(T); return r
        case _ => val r = parseSmfTypeT(T); return r
      }
    }

    def parseSmfLib(): SmfLib = {
      val t = parser.parseObjectTypes(ISZ("SmfLibrary"))
      t.native match {
        case "SmfLibrary" => val r = parseSmfLibraryT(T); return r
        case _ => val r = parseSmfLibraryT(T); return r
      }
    }

    def parseSmfClause(): SmfClause = {
      val r = parseSmfClauseT(F)
      return r
    }

    def parseSmfClauseT(typeParsed: B): SmfClause = {
      if (!typeParsed) {
        parser.parseObjectType("SmfClause")
      }
      parser.parseObjectKey("classification")
      val classification = parser.parseISZ(parseSmfClassification _)
      parser.parseObjectNext()
      parser.parseObjectKey("declass")
      val declass = parser.parseISZ(parseSmfDeclass _)
      parser.parseObjectNext()
      return SmfClause(classification, declass)
    }

    def parseSmfClassification(): SmfClassification = {
      val r = parseSmfClassificationT(F)
      return r
    }

    def parseSmfClassificationT(typeParsed: B): SmfClassification = {
      if (!typeParsed) {
        parser.parseObjectType("SmfClassification")
      }
      parser.parseObjectKey("portName")
      val portName = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("typeName")
      val typeName = parseName()
      parser.parseObjectNext()
      return SmfClassification(portName, typeName)
    }

    def parseSmfDeclass(): SmfDeclass = {
      val r = parseSmfDeclassT(F)
      return r
    }

    def parseSmfDeclassT(typeParsed: B): SmfDeclass = {
      if (!typeParsed) {
        parser.parseObjectType("SmfDeclass")
      }
      parser.parseObjectKey("flowName")
      val flowName = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("srcType")
      val srcType = parser.parseOption(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("snkType")
      val snkType = parseName()
      parser.parseObjectNext()
      return SmfDeclass(flowName, srcType, snkType)
    }

    def parseSmfLibrary(): SmfLibrary = {
      val r = parseSmfLibraryT(F)
      return r
    }

    def parseSmfLibraryT(typeParsed: B): SmfLibrary = {
      if (!typeParsed) {
        parser.parseObjectType("SmfLibrary")
      }
      parser.parseObjectKey("types")
      val types = parser.parseISZ(parseSmfType _)
      parser.parseObjectNext()
      return SmfLibrary(types)
    }

    def parseSmfType(): SmfType = {
      val r = parseSmfTypeT(F)
      return r
    }

    def parseSmfTypeT(typeParsed: B): SmfType = {
      if (!typeParsed) {
        parser.parseObjectType("SmfType")
      }
      parser.parseObjectKey("typeName")
      val typeName = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("parentType")
      val parentType = parser.parseISZ(parseName _)
      parser.parseObjectNext()
      return SmfType(typeName, parentType)
    }

    def parse_langastTopUnit(): org.sireum.lang.ast.TopUnit = {
      val t = parser.parseObjectTypes(ISZ("org.sireum.lang.ast.TopUnit.Program", "org.sireum.lang.ast.TopUnit.TruthTableUnit"))
      t.native match {
        case "org.sireum.lang.ast.TopUnit.Program" => val r = parse_langastTopUnitProgramT(T); return r
        case "org.sireum.lang.ast.TopUnit.TruthTableUnit" => val r = parse_langastTopUnitTruthTableUnitT(T); return r
        case _ => val r = parse_langastTopUnitTruthTableUnitT(T); return r
      }
    }

    def parse_langastTopUnitProgram(): org.sireum.lang.ast.TopUnit.Program = {
      val r = parse_langastTopUnitProgramT(F)
      return r
    }

    def parse_langastTopUnitProgramT(typeParsed: B): org.sireum.lang.ast.TopUnit.Program = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.TopUnit.Program")
      }
      parser.parseObjectKey("fileUriOpt")
      val fileUriOpt = parser.parseOption(parser.parseString _)
      parser.parseObjectNext()
      parser.parseObjectKey("packageName")
      val packageName = parse_langastName()
      parser.parseObjectNext()
      parser.parseObjectKey("body")
      val body = parse_langastBody()
      parser.parseObjectNext()
      return org.sireum.lang.ast.TopUnit.Program(fileUriOpt, packageName, body)
    }

    def parse_langastTopUnitTruthTableUnit(): org.sireum.lang.ast.TopUnit.TruthTableUnit = {
      val r = parse_langastTopUnitTruthTableUnitT(F)
      return r
    }

    def parse_langastTopUnitTruthTableUnitT(typeParsed: B): org.sireum.lang.ast.TopUnit.TruthTableUnit = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.TopUnit.TruthTableUnit")
      }
      parser.parseObjectKey("fileUriOpt")
      val fileUriOpt = parser.parseOption(parser.parseString _)
      parser.parseObjectNext()
      parser.parseObjectKey("stars")
      val stars = parser.parseISZ(parser.parsePosition _)
      parser.parseObjectNext()
      parser.parseObjectKey("vars")
      val vars = parser.parseISZ(parse_langastId _)
      parser.parseObjectNext()
      parser.parseObjectKey("separator")
      val separator = parser.parsePosition()
      parser.parseObjectNext()
      parser.parseObjectKey("isSequent")
      val isSequent = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("sequent")
      val sequent = parse_langastSequent()
      parser.parseObjectNext()
      parser.parseObjectKey("rows")
      val rows = parser.parseISZ(parse_langastTruthTableRow _)
      parser.parseObjectNext()
      parser.parseObjectKey("conclusionOpt")
      val conclusionOpt = parser.parseOption(parse_langastTruthTableConclusion _)
      parser.parseObjectNext()
      return org.sireum.lang.ast.TopUnit.TruthTableUnit(fileUriOpt, stars, vars, separator, isSequent, sequent, rows, conclusionOpt)
    }

    def parse_langastStmt(): org.sireum.lang.ast.Stmt = {
      val t = parser.parseObjectTypes(ISZ("org.sireum.lang.ast.Stmt.Import", "org.sireum.lang.ast.Stmt.Var", "org.sireum.lang.ast.Stmt.VarPattern", "org.sireum.lang.ast.Stmt.SpecVar", "org.sireum.lang.ast.Stmt.Method", "org.sireum.lang.ast.Stmt.ExtMethod", "org.sireum.lang.ast.Stmt.JustMethod", "org.sireum.lang.ast.Stmt.SpecMethod", "org.sireum.lang.ast.Stmt.Enum", "org.sireum.lang.ast.Stmt.SubZ", "org.sireum.lang.ast.Stmt.Object", "org.sireum.lang.ast.Stmt.Sig", "org.sireum.lang.ast.Stmt.Adt", "org.sireum.lang.ast.Stmt.TypeAlias", "org.sireum.lang.ast.Stmt.Assign", "org.sireum.lang.ast.Stmt.Block", "org.sireum.lang.ast.Stmt.If", "org.sireum.lang.ast.Stmt.Match", "org.sireum.lang.ast.Stmt.While", "org.sireum.lang.ast.Stmt.DoWhile", "org.sireum.lang.ast.Stmt.For", "org.sireum.lang.ast.Stmt.Return", "org.sireum.lang.ast.Stmt.Expr", "org.sireum.lang.ast.Stmt.Fact", "org.sireum.lang.ast.Stmt.Inv", "org.sireum.lang.ast.Stmt.Theorem", "org.sireum.lang.ast.Stmt.DataRefinement", "org.sireum.lang.ast.Stmt.SpecLabel", "org.sireum.lang.ast.Stmt.SpecBlock", "org.sireum.lang.ast.Stmt.DeduceSequent", "org.sireum.lang.ast.Stmt.DeduceSteps", "org.sireum.lang.ast.Stmt.Havoc"))
      t.native match {
        case "org.sireum.lang.ast.Stmt.Import" => val r = parse_langastStmtImportT(T); return r
        case "org.sireum.lang.ast.Stmt.Var" => val r = parse_langastStmtVarT(T); return r
        case "org.sireum.lang.ast.Stmt.VarPattern" => val r = parse_langastStmtVarPatternT(T); return r
        case "org.sireum.lang.ast.Stmt.SpecVar" => val r = parse_langastStmtSpecVarT(T); return r
        case "org.sireum.lang.ast.Stmt.Method" => val r = parse_langastStmtMethodT(T); return r
        case "org.sireum.lang.ast.Stmt.ExtMethod" => val r = parse_langastStmtExtMethodT(T); return r
        case "org.sireum.lang.ast.Stmt.JustMethod" => val r = parse_langastStmtJustMethodT(T); return r
        case "org.sireum.lang.ast.Stmt.SpecMethod" => val r = parse_langastStmtSpecMethodT(T); return r
        case "org.sireum.lang.ast.Stmt.Enum" => val r = parse_langastStmtEnumT(T); return r
        case "org.sireum.lang.ast.Stmt.SubZ" => val r = parse_langastStmtSubZT(T); return r
        case "org.sireum.lang.ast.Stmt.Object" => val r = parse_langastStmtObjectT(T); return r
        case "org.sireum.lang.ast.Stmt.Sig" => val r = parse_langastStmtSigT(T); return r
        case "org.sireum.lang.ast.Stmt.Adt" => val r = parse_langastStmtAdtT(T); return r
        case "org.sireum.lang.ast.Stmt.TypeAlias" => val r = parse_langastStmtTypeAliasT(T); return r
        case "org.sireum.lang.ast.Stmt.Assign" => val r = parse_langastStmtAssignT(T); return r
        case "org.sireum.lang.ast.Stmt.Block" => val r = parse_langastStmtBlockT(T); return r
        case "org.sireum.lang.ast.Stmt.If" => val r = parse_langastStmtIfT(T); return r
        case "org.sireum.lang.ast.Stmt.Match" => val r = parse_langastStmtMatchT(T); return r
        case "org.sireum.lang.ast.Stmt.While" => val r = parse_langastStmtWhileT(T); return r
        case "org.sireum.lang.ast.Stmt.DoWhile" => val r = parse_langastStmtDoWhileT(T); return r
        case "org.sireum.lang.ast.Stmt.For" => val r = parse_langastStmtForT(T); return r
        case "org.sireum.lang.ast.Stmt.Return" => val r = parse_langastStmtReturnT(T); return r
        case "org.sireum.lang.ast.Stmt.Expr" => val r = parse_langastStmtExprT(T); return r
        case "org.sireum.lang.ast.Stmt.Fact" => val r = parse_langastStmtFactT(T); return r
        case "org.sireum.lang.ast.Stmt.Inv" => val r = parse_langastStmtInvT(T); return r
        case "org.sireum.lang.ast.Stmt.Theorem" => val r = parse_langastStmtTheoremT(T); return r
        case "org.sireum.lang.ast.Stmt.DataRefinement" => val r = parse_langastStmtDataRefinementT(T); return r
        case "org.sireum.lang.ast.Stmt.SpecLabel" => val r = parse_langastStmtSpecLabelT(T); return r
        case "org.sireum.lang.ast.Stmt.SpecBlock" => val r = parse_langastStmtSpecBlockT(T); return r
        case "org.sireum.lang.ast.Stmt.DeduceSequent" => val r = parse_langastStmtDeduceSequentT(T); return r
        case "org.sireum.lang.ast.Stmt.DeduceSteps" => val r = parse_langastStmtDeduceStepsT(T); return r
        case "org.sireum.lang.ast.Stmt.Havoc" => val r = parse_langastStmtHavocT(T); return r
        case _ => val r = parse_langastStmtHavocT(T); return r
      }
    }

    def parse_langastHasModifies(): org.sireum.lang.ast.HasModifies = {
      val t = parser.parseObjectTypes(ISZ("org.sireum.lang.ast.LoopContract", "org.sireum.lang.ast.MethodContract.Simple", "org.sireum.lang.ast.MethodContract.Cases"))
      t.native match {
        case "org.sireum.lang.ast.LoopContract" => val r = parse_langastLoopContractT(T); return r
        case "org.sireum.lang.ast.MethodContract.Simple" => val r = parse_langastMethodContractSimpleT(T); return r
        case "org.sireum.lang.ast.MethodContract.Cases" => val r = parse_langastMethodContractCasesT(T); return r
        case _ => val r = parse_langastMethodContractCasesT(T); return r
      }
    }

    def parse_langastLoopContract(): org.sireum.lang.ast.LoopContract = {
      val r = parse_langastLoopContractT(F)
      return r
    }

    def parse_langastLoopContractT(typeParsed: B): org.sireum.lang.ast.LoopContract = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.LoopContract")
      }
      parser.parseObjectKey("invariants")
      val invariants = parser.parseISZ(parse_langastExp _)
      parser.parseObjectNext()
      parser.parseObjectKey("modifies")
      val modifies = parser.parseISZ(parse_langastExpRef _)
      parser.parseObjectNext()
      parser.parseObjectKey("maxItOpt")
      val maxItOpt = parser.parseOption(parse_langastExpLitZ _)
      parser.parseObjectNext()
      return org.sireum.lang.ast.LoopContract(invariants, modifies, maxItOpt)
    }

    def parse_langastStmtImport(): org.sireum.lang.ast.Stmt.Import = {
      val r = parse_langastStmtImportT(F)
      return r
    }

    def parse_langastStmtImportT(typeParsed: B): org.sireum.lang.ast.Stmt.Import = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Stmt.Import")
      }
      parser.parseObjectKey("importers")
      val importers = parser.parseISZ(parse_langastStmtImportImporter _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Stmt.Import(importers, attr)
    }

    def parse_langastStmtImportImporter(): org.sireum.lang.ast.Stmt.Import.Importer = {
      val r = parse_langastStmtImportImporterT(F)
      return r
    }

    def parse_langastStmtImportImporterT(typeParsed: B): org.sireum.lang.ast.Stmt.Import.Importer = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Stmt.Import.Importer")
      }
      parser.parseObjectKey("name")
      val name = parse_langastName()
      parser.parseObjectNext()
      parser.parseObjectKey("selectorOpt")
      val selectorOpt = parser.parseOption(parse_langastStmtImportSelector _)
      parser.parseObjectNext()
      return org.sireum.lang.ast.Stmt.Import.Importer(name, selectorOpt)
    }

    def parse_langastStmtImportSelector(): org.sireum.lang.ast.Stmt.Import.Selector = {
      val t = parser.parseObjectTypes(ISZ("org.sireum.lang.ast.Stmt.Import.MultiSelector", "org.sireum.lang.ast.Stmt.Import.WildcardSelector"))
      t.native match {
        case "org.sireum.lang.ast.Stmt.Import.MultiSelector" => val r = parse_langastStmtImportMultiSelectorT(T); return r
        case "org.sireum.lang.ast.Stmt.Import.WildcardSelector" => val r = parse_langastStmtImportWildcardSelectorT(T); return r
        case _ => val r = parse_langastStmtImportWildcardSelectorT(T); return r
      }
    }

    def parse_langastStmtImportMultiSelector(): org.sireum.lang.ast.Stmt.Import.MultiSelector = {
      val r = parse_langastStmtImportMultiSelectorT(F)
      return r
    }

    def parse_langastStmtImportMultiSelectorT(typeParsed: B): org.sireum.lang.ast.Stmt.Import.MultiSelector = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Stmt.Import.MultiSelector")
      }
      parser.parseObjectKey("selectors")
      val selectors = parser.parseISZ(parse_langastStmtImportNamedSelector _)
      parser.parseObjectNext()
      return org.sireum.lang.ast.Stmt.Import.MultiSelector(selectors)
    }

    def parse_langastStmtImportWildcardSelector(): org.sireum.lang.ast.Stmt.Import.WildcardSelector = {
      val r = parse_langastStmtImportWildcardSelectorT(F)
      return r
    }

    def parse_langastStmtImportWildcardSelectorT(typeParsed: B): org.sireum.lang.ast.Stmt.Import.WildcardSelector = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Stmt.Import.WildcardSelector")
      }
      return org.sireum.lang.ast.Stmt.Import.WildcardSelector()
    }

    def parse_langastStmtImportNamedSelector(): org.sireum.lang.ast.Stmt.Import.NamedSelector = {
      val r = parse_langastStmtImportNamedSelectorT(F)
      return r
    }

    def parse_langastStmtImportNamedSelectorT(typeParsed: B): org.sireum.lang.ast.Stmt.Import.NamedSelector = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Stmt.Import.NamedSelector")
      }
      parser.parseObjectKey("from")
      val from = parse_langastId()
      parser.parseObjectNext()
      parser.parseObjectKey("to")
      val to = parse_langastId()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Stmt.Import.NamedSelector(from, to)
    }

    def parse_langastStmtVar(): org.sireum.lang.ast.Stmt.Var = {
      val r = parse_langastStmtVarT(F)
      return r
    }

    def parse_langastStmtVarT(typeParsed: B): org.sireum.lang.ast.Stmt.Var = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Stmt.Var")
      }
      parser.parseObjectKey("isSpec")
      val isSpec = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("isVal")
      val isVal = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("id")
      val id = parse_langastId()
      parser.parseObjectNext()
      parser.parseObjectKey("tipeOpt")
      val tipeOpt = parser.parseOption(parse_langastType _)
      parser.parseObjectNext()
      parser.parseObjectKey("initOpt")
      val initOpt = parser.parseOption(parse_langastAssignExp _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastResolvedAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Stmt.Var(isSpec, isVal, id, tipeOpt, initOpt, attr)
    }

    def parse_langastStmtVarPattern(): org.sireum.lang.ast.Stmt.VarPattern = {
      val r = parse_langastStmtVarPatternT(F)
      return r
    }

    def parse_langastStmtVarPatternT(typeParsed: B): org.sireum.lang.ast.Stmt.VarPattern = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Stmt.VarPattern")
      }
      parser.parseObjectKey("isSpec")
      val isSpec = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("isVal")
      val isVal = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("pattern")
      val pattern = parse_langastPattern()
      parser.parseObjectNext()
      parser.parseObjectKey("tipeOpt")
      val tipeOpt = parser.parseOption(parse_langastType _)
      parser.parseObjectNext()
      parser.parseObjectKey("init")
      val init = parse_langastAssignExp()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Stmt.VarPattern(isSpec, isVal, pattern, tipeOpt, init, attr)
    }

    def parse_langastStmtSpecVar(): org.sireum.lang.ast.Stmt.SpecVar = {
      val r = parse_langastStmtSpecVarT(F)
      return r
    }

    def parse_langastStmtSpecVarT(typeParsed: B): org.sireum.lang.ast.Stmt.SpecVar = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Stmt.SpecVar")
      }
      parser.parseObjectKey("isVal")
      val isVal = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("id")
      val id = parse_langastId()
      parser.parseObjectNext()
      parser.parseObjectKey("tipe")
      val tipe = parse_langastType()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastResolvedAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Stmt.SpecVar(isVal, id, tipe, attr)
    }

    def parse_langastStmtMethod(): org.sireum.lang.ast.Stmt.Method = {
      val r = parse_langastStmtMethodT(F)
      return r
    }

    def parse_langastStmtMethodT(typeParsed: B): org.sireum.lang.ast.Stmt.Method = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Stmt.Method")
      }
      parser.parseObjectKey("typeChecked")
      val typeChecked = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("purity")
      val purity = parse_langastPurityType()
      parser.parseObjectNext()
      parser.parseObjectKey("hasOverride")
      val hasOverride = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("isHelper")
      val isHelper = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("sig")
      val sig = parse_langastMethodSig()
      parser.parseObjectNext()
      parser.parseObjectKey("mcontract")
      val mcontract = parse_langastMethodContract()
      parser.parseObjectNext()
      parser.parseObjectKey("bodyOpt")
      val bodyOpt = parser.parseOption(parse_langastBody _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastResolvedAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Stmt.Method(typeChecked, purity, hasOverride, isHelper, sig, mcontract, bodyOpt, attr)
    }

    def parse_langastStmtExtMethod(): org.sireum.lang.ast.Stmt.ExtMethod = {
      val r = parse_langastStmtExtMethodT(F)
      return r
    }

    def parse_langastStmtExtMethodT(typeParsed: B): org.sireum.lang.ast.Stmt.ExtMethod = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Stmt.ExtMethod")
      }
      parser.parseObjectKey("isPure")
      val isPure = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("sig")
      val sig = parse_langastMethodSig()
      parser.parseObjectNext()
      parser.parseObjectKey("contract")
      val contract = parse_langastMethodContract()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastResolvedAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Stmt.ExtMethod(isPure, sig, contract, attr)
    }

    def parse_langastStmtJustMethod(): org.sireum.lang.ast.Stmt.JustMethod = {
      val r = parse_langastStmtJustMethodT(F)
      return r
    }

    def parse_langastStmtJustMethodT(typeParsed: B): org.sireum.lang.ast.Stmt.JustMethod = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Stmt.JustMethod")
      }
      parser.parseObjectKey("etaOpt")
      val etaOpt = parser.parseOption(parse_langastExpLitString _)
      parser.parseObjectNext()
      parser.parseObjectKey("sig")
      val sig = parse_langastMethodSig()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastResolvedAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Stmt.JustMethod(etaOpt, sig, attr)
    }

    def parse_langastStmtSpecMethod(): org.sireum.lang.ast.Stmt.SpecMethod = {
      val r = parse_langastStmtSpecMethodT(F)
      return r
    }

    def parse_langastStmtSpecMethodT(typeParsed: B): org.sireum.lang.ast.Stmt.SpecMethod = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Stmt.SpecMethod")
      }
      parser.parseObjectKey("sig")
      val sig = parse_langastMethodSig()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastResolvedAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Stmt.SpecMethod(sig, attr)
    }

    def parse_langastStmtEnum(): org.sireum.lang.ast.Stmt.Enum = {
      val r = parse_langastStmtEnumT(F)
      return r
    }

    def parse_langastStmtEnumT(typeParsed: B): org.sireum.lang.ast.Stmt.Enum = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Stmt.Enum")
      }
      parser.parseObjectKey("id")
      val id = parse_langastId()
      parser.parseObjectNext()
      parser.parseObjectKey("elements")
      val elements = parser.parseISZ(parse_langastId _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Stmt.Enum(id, elements, attr)
    }

    def parse_langastStmtSubZ(): org.sireum.lang.ast.Stmt.SubZ = {
      val r = parse_langastStmtSubZT(F)
      return r
    }

    def parse_langastStmtSubZT(typeParsed: B): org.sireum.lang.ast.Stmt.SubZ = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Stmt.SubZ")
      }
      parser.parseObjectKey("id")
      val id = parse_langastId()
      parser.parseObjectNext()
      parser.parseObjectKey("isSigned")
      val isSigned = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("isBitVector")
      val isBitVector = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("isWrapped")
      val isWrapped = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("hasMin")
      val hasMin = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("hasMax")
      val hasMax = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("bitWidth")
      val bitWidth = parser.parseZ()
      parser.parseObjectNext()
      parser.parseObjectKey("min")
      val min = parser.parseZ()
      parser.parseObjectNext()
      parser.parseObjectKey("max")
      val max = parser.parseZ()
      parser.parseObjectNext()
      parser.parseObjectKey("isIndex")
      val isIndex = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("index")
      val index = parser.parseZ()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Stmt.SubZ(id, isSigned, isBitVector, isWrapped, hasMin, hasMax, bitWidth, min, max, isIndex, index, attr)
    }

    def parse_langastStmtObject(): org.sireum.lang.ast.Stmt.Object = {
      val r = parse_langastStmtObjectT(F)
      return r
    }

    def parse_langastStmtObjectT(typeParsed: B): org.sireum.lang.ast.Stmt.Object = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Stmt.Object")
      }
      parser.parseObjectKey("isApp")
      val isApp = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("extNameOpt")
      val extNameOpt = parser.parseOption(parser.parseString _)
      parser.parseObjectNext()
      parser.parseObjectKey("id")
      val id = parse_langastId()
      parser.parseObjectNext()
      parser.parseObjectKey("stmts")
      val stmts = parser.parseISZ(parse_langastStmt _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Stmt.Object(isApp, extNameOpt, id, stmts, attr)
    }

    def parse_langastStmtSig(): org.sireum.lang.ast.Stmt.Sig = {
      val r = parse_langastStmtSigT(F)
      return r
    }

    def parse_langastStmtSigT(typeParsed: B): org.sireum.lang.ast.Stmt.Sig = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Stmt.Sig")
      }
      parser.parseObjectKey("isImmutable")
      val isImmutable = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("isSealed")
      val isSealed = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("isExt")
      val isExt = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("id")
      val id = parse_langastId()
      parser.parseObjectNext()
      parser.parseObjectKey("typeParams")
      val typeParams = parser.parseISZ(parse_langastTypeParam _)
      parser.parseObjectNext()
      parser.parseObjectKey("parents")
      val parents = parser.parseISZ(parse_langastTypeNamed _)
      parser.parseObjectNext()
      parser.parseObjectKey("stmts")
      val stmts = parser.parseISZ(parse_langastStmt _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Stmt.Sig(isImmutable, isSealed, isExt, id, typeParams, parents, stmts, attr)
    }

    def parse_langastStmtAdt(): org.sireum.lang.ast.Stmt.Adt = {
      val r = parse_langastStmtAdtT(F)
      return r
    }

    def parse_langastStmtAdtT(typeParsed: B): org.sireum.lang.ast.Stmt.Adt = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Stmt.Adt")
      }
      parser.parseObjectKey("isRoot")
      val isRoot = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("isDatatype")
      val isDatatype = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("id")
      val id = parse_langastId()
      parser.parseObjectNext()
      parser.parseObjectKey("typeParams")
      val typeParams = parser.parseISZ(parse_langastTypeParam _)
      parser.parseObjectNext()
      parser.parseObjectKey("params")
      val params = parser.parseISZ(parse_langastAdtParam _)
      parser.parseObjectNext()
      parser.parseObjectKey("parents")
      val parents = parser.parseISZ(parse_langastTypeNamed _)
      parser.parseObjectNext()
      parser.parseObjectKey("stmts")
      val stmts = parser.parseISZ(parse_langastStmt _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Stmt.Adt(isRoot, isDatatype, id, typeParams, params, parents, stmts, attr)
    }

    def parse_langastStmtTypeAlias(): org.sireum.lang.ast.Stmt.TypeAlias = {
      val r = parse_langastStmtTypeAliasT(F)
      return r
    }

    def parse_langastStmtTypeAliasT(typeParsed: B): org.sireum.lang.ast.Stmt.TypeAlias = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Stmt.TypeAlias")
      }
      parser.parseObjectKey("id")
      val id = parse_langastId()
      parser.parseObjectNext()
      parser.parseObjectKey("typeParams")
      val typeParams = parser.parseISZ(parse_langastTypeParam _)
      parser.parseObjectNext()
      parser.parseObjectKey("tipe")
      val tipe = parse_langastType()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Stmt.TypeAlias(id, typeParams, tipe, attr)
    }

    def parse_langastStmtAssign(): org.sireum.lang.ast.Stmt.Assign = {
      val r = parse_langastStmtAssignT(F)
      return r
    }

    def parse_langastStmtAssignT(typeParsed: B): org.sireum.lang.ast.Stmt.Assign = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Stmt.Assign")
      }
      parser.parseObjectKey("lhs")
      val lhs = parse_langastExp()
      parser.parseObjectNext()
      parser.parseObjectKey("rhs")
      val rhs = parse_langastAssignExp()
      parser.parseObjectNext()
      parser.parseObjectKey("deduceOldLhsOpt")
      val deduceOldLhsOpt = parser.parseOption(parse_langastExp _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Stmt.Assign(lhs, rhs, deduceOldLhsOpt, attr)
    }

    def parse_langastStmtBlock(): org.sireum.lang.ast.Stmt.Block = {
      val r = parse_langastStmtBlockT(F)
      return r
    }

    def parse_langastStmtBlockT(typeParsed: B): org.sireum.lang.ast.Stmt.Block = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Stmt.Block")
      }
      parser.parseObjectKey("body")
      val body = parse_langastBody()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Stmt.Block(body, attr)
    }

    def parse_langastStmtIf(): org.sireum.lang.ast.Stmt.If = {
      val r = parse_langastStmtIfT(F)
      return r
    }

    def parse_langastStmtIfT(typeParsed: B): org.sireum.lang.ast.Stmt.If = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Stmt.If")
      }
      parser.parseObjectKey("cond")
      val cond = parse_langastExp()
      parser.parseObjectNext()
      parser.parseObjectKey("thenBody")
      val thenBody = parse_langastBody()
      parser.parseObjectNext()
      parser.parseObjectKey("elseBody")
      val elseBody = parse_langastBody()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Stmt.If(cond, thenBody, elseBody, attr)
    }

    def parse_langastStmtMatch(): org.sireum.lang.ast.Stmt.Match = {
      val r = parse_langastStmtMatchT(F)
      return r
    }

    def parse_langastStmtMatchT(typeParsed: B): org.sireum.lang.ast.Stmt.Match = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Stmt.Match")
      }
      parser.parseObjectKey("exp")
      val exp = parse_langastExp()
      parser.parseObjectNext()
      parser.parseObjectKey("cases")
      val cases = parser.parseISZ(parse_langastCase _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Stmt.Match(exp, cases, attr)
    }

    def parse_langastStmtWhile(): org.sireum.lang.ast.Stmt.While = {
      val r = parse_langastStmtWhileT(F)
      return r
    }

    def parse_langastStmtWhileT(typeParsed: B): org.sireum.lang.ast.Stmt.While = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Stmt.While")
      }
      parser.parseObjectKey("context")
      val context = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      parser.parseObjectKey("cond")
      val cond = parse_langastExp()
      parser.parseObjectNext()
      parser.parseObjectKey("contract")
      val contract = parse_langastLoopContract()
      parser.parseObjectNext()
      parser.parseObjectKey("body")
      val body = parse_langastBody()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Stmt.While(context, cond, contract, body, attr)
    }

    def parse_langastStmtDoWhile(): org.sireum.lang.ast.Stmt.DoWhile = {
      val r = parse_langastStmtDoWhileT(F)
      return r
    }

    def parse_langastStmtDoWhileT(typeParsed: B): org.sireum.lang.ast.Stmt.DoWhile = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Stmt.DoWhile")
      }
      parser.parseObjectKey("context")
      val context = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      parser.parseObjectKey("cond")
      val cond = parse_langastExp()
      parser.parseObjectNext()
      parser.parseObjectKey("contract")
      val contract = parse_langastLoopContract()
      parser.parseObjectNext()
      parser.parseObjectKey("body")
      val body = parse_langastBody()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Stmt.DoWhile(context, cond, contract, body, attr)
    }

    def parse_langastStmtFor(): org.sireum.lang.ast.Stmt.For = {
      val r = parse_langastStmtForT(F)
      return r
    }

    def parse_langastStmtForT(typeParsed: B): org.sireum.lang.ast.Stmt.For = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Stmt.For")
      }
      parser.parseObjectKey("context")
      val context = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      parser.parseObjectKey("enumGens")
      val enumGens = parser.parseISZ(parse_langastEnumGenFor _)
      parser.parseObjectNext()
      parser.parseObjectKey("body")
      val body = parse_langastBody()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Stmt.For(context, enumGens, body, attr)
    }

    def parse_langastStmtReturn(): org.sireum.lang.ast.Stmt.Return = {
      val r = parse_langastStmtReturnT(F)
      return r
    }

    def parse_langastStmtReturnT(typeParsed: B): org.sireum.lang.ast.Stmt.Return = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Stmt.Return")
      }
      parser.parseObjectKey("expOpt")
      val expOpt = parser.parseOption(parse_langastExp _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastTypedAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Stmt.Return(expOpt, attr)
    }

    def parse_langastStmtExpr(): org.sireum.lang.ast.Stmt.Expr = {
      val r = parse_langastStmtExprT(F)
      return r
    }

    def parse_langastStmtExprT(typeParsed: B): org.sireum.lang.ast.Stmt.Expr = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Stmt.Expr")
      }
      parser.parseObjectKey("exp")
      val exp = parse_langastExp()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastTypedAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Stmt.Expr(exp, attr)
    }

    def parse_langastStmtSpec(): org.sireum.lang.ast.Stmt.Spec = {
      val t = parser.parseObjectTypes(ISZ("org.sireum.lang.ast.Stmt.Fact", "org.sireum.lang.ast.Stmt.Inv", "org.sireum.lang.ast.Stmt.Theorem", "org.sireum.lang.ast.Stmt.DataRefinement", "org.sireum.lang.ast.Stmt.SpecLabel", "org.sireum.lang.ast.Stmt.SpecBlock", "org.sireum.lang.ast.Stmt.DeduceSequent", "org.sireum.lang.ast.Stmt.DeduceSteps", "org.sireum.lang.ast.Stmt.Havoc"))
      t.native match {
        case "org.sireum.lang.ast.Stmt.Fact" => val r = parse_langastStmtFactT(T); return r
        case "org.sireum.lang.ast.Stmt.Inv" => val r = parse_langastStmtInvT(T); return r
        case "org.sireum.lang.ast.Stmt.Theorem" => val r = parse_langastStmtTheoremT(T); return r
        case "org.sireum.lang.ast.Stmt.DataRefinement" => val r = parse_langastStmtDataRefinementT(T); return r
        case "org.sireum.lang.ast.Stmt.SpecLabel" => val r = parse_langastStmtSpecLabelT(T); return r
        case "org.sireum.lang.ast.Stmt.SpecBlock" => val r = parse_langastStmtSpecBlockT(T); return r
        case "org.sireum.lang.ast.Stmt.DeduceSequent" => val r = parse_langastStmtDeduceSequentT(T); return r
        case "org.sireum.lang.ast.Stmt.DeduceSteps" => val r = parse_langastStmtDeduceStepsT(T); return r
        case "org.sireum.lang.ast.Stmt.Havoc" => val r = parse_langastStmtHavocT(T); return r
        case _ => val r = parse_langastStmtHavocT(T); return r
      }
    }

    def parse_langastStmtFact(): org.sireum.lang.ast.Stmt.Fact = {
      val r = parse_langastStmtFactT(F)
      return r
    }

    def parse_langastStmtFactT(typeParsed: B): org.sireum.lang.ast.Stmt.Fact = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Stmt.Fact")
      }
      parser.parseObjectKey("id")
      val id = parse_langastId()
      parser.parseObjectNext()
      parser.parseObjectKey("typeParams")
      val typeParams = parser.parseISZ(parse_langastTypeParam _)
      parser.parseObjectNext()
      parser.parseObjectKey("descOpt")
      val descOpt = parser.parseOption(parse_langastExpLitString _)
      parser.parseObjectNext()
      parser.parseObjectKey("claims")
      val claims = parser.parseISZ(parse_langastExp _)
      parser.parseObjectNext()
      parser.parseObjectKey("isFun")
      val isFun = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastResolvedAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Stmt.Fact(id, typeParams, descOpt, claims, isFun, attr)
    }

    def parse_langastStmtInv(): org.sireum.lang.ast.Stmt.Inv = {
      val r = parse_langastStmtInvT(F)
      return r
    }

    def parse_langastStmtInvT(typeParsed: B): org.sireum.lang.ast.Stmt.Inv = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Stmt.Inv")
      }
      parser.parseObjectKey("id")
      val id = parse_langastId()
      parser.parseObjectNext()
      parser.parseObjectKey("claims")
      val claims = parser.parseISZ(parse_langastExp _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastResolvedAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Stmt.Inv(id, claims, attr)
    }

    def parse_langastStmtTheorem(): org.sireum.lang.ast.Stmt.Theorem = {
      val r = parse_langastStmtTheoremT(F)
      return r
    }

    def parse_langastStmtTheoremT(typeParsed: B): org.sireum.lang.ast.Stmt.Theorem = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Stmt.Theorem")
      }
      parser.parseObjectKey("isLemma")
      val isLemma = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("id")
      val id = parse_langastId()
      parser.parseObjectNext()
      parser.parseObjectKey("typeParams")
      val typeParams = parser.parseISZ(parse_langastTypeParam _)
      parser.parseObjectNext()
      parser.parseObjectKey("descOpt")
      val descOpt = parser.parseOption(parse_langastExpLitString _)
      parser.parseObjectNext()
      parser.parseObjectKey("claim")
      val claim = parse_langastExp()
      parser.parseObjectNext()
      parser.parseObjectKey("isFun")
      val isFun = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("proof")
      val proof = parse_langastProofAst()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastResolvedAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Stmt.Theorem(isLemma, id, typeParams, descOpt, claim, isFun, proof, attr)
    }

    def parse_langastStmtDataRefinement(): org.sireum.lang.ast.Stmt.DataRefinement = {
      val r = parse_langastStmtDataRefinementT(F)
      return r
    }

    def parse_langastStmtDataRefinementT(typeParsed: B): org.sireum.lang.ast.Stmt.DataRefinement = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Stmt.DataRefinement")
      }
      parser.parseObjectKey("rep")
      val rep = parse_langastExpRef()
      parser.parseObjectNext()
      parser.parseObjectKey("refs")
      val refs = parser.parseISZ(parse_langastExpRef _)
      parser.parseObjectNext()
      parser.parseObjectKey("claims")
      val claims = parser.parseISZ(parse_langastExp _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Stmt.DataRefinement(rep, refs, claims, attr)
    }

    def parse_langastStmtSpecLabel(): org.sireum.lang.ast.Stmt.SpecLabel = {
      val r = parse_langastStmtSpecLabelT(F)
      return r
    }

    def parse_langastStmtSpecLabelT(typeParsed: B): org.sireum.lang.ast.Stmt.SpecLabel = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Stmt.SpecLabel")
      }
      parser.parseObjectKey("id")
      val id = parse_langastId()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Stmt.SpecLabel(id)
    }

    def parse_langastStmtSpecBlock(): org.sireum.lang.ast.Stmt.SpecBlock = {
      val r = parse_langastStmtSpecBlockT(F)
      return r
    }

    def parse_langastStmtSpecBlockT(typeParsed: B): org.sireum.lang.ast.Stmt.SpecBlock = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Stmt.SpecBlock")
      }
      parser.parseObjectKey("block")
      val block = parse_langastStmtBlock()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Stmt.SpecBlock(block)
    }

    def parse_langastStmtDeduceSequent(): org.sireum.lang.ast.Stmt.DeduceSequent = {
      val r = parse_langastStmtDeduceSequentT(F)
      return r
    }

    def parse_langastStmtDeduceSequentT(typeParsed: B): org.sireum.lang.ast.Stmt.DeduceSequent = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Stmt.DeduceSequent")
      }
      parser.parseObjectKey("justOpt")
      val justOpt = parser.parseOption(parse_langastExpLitString _)
      parser.parseObjectNext()
      parser.parseObjectKey("sequents")
      val sequents = parser.parseISZ(parse_langastSequent _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Stmt.DeduceSequent(justOpt, sequents, attr)
    }

    def parse_langastStmtDeduceSteps(): org.sireum.lang.ast.Stmt.DeduceSteps = {
      val r = parse_langastStmtDeduceStepsT(F)
      return r
    }

    def parse_langastStmtDeduceStepsT(typeParsed: B): org.sireum.lang.ast.Stmt.DeduceSteps = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Stmt.DeduceSteps")
      }
      parser.parseObjectKey("steps")
      val steps = parser.parseISZ(parse_langastProofAstStep _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Stmt.DeduceSteps(steps, attr)
    }

    def parse_langastStmtHavoc(): org.sireum.lang.ast.Stmt.Havoc = {
      val r = parse_langastStmtHavocT(F)
      return r
    }

    def parse_langastStmtHavocT(typeParsed: B): org.sireum.lang.ast.Stmt.Havoc = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Stmt.Havoc")
      }
      parser.parseObjectKey("args")
      val args = parser.parseISZ(parse_langastExpRef _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Stmt.Havoc(args, attr)
    }

    def parse_langastMethodContract(): org.sireum.lang.ast.MethodContract = {
      val t = parser.parseObjectTypes(ISZ("org.sireum.lang.ast.MethodContract.Simple", "org.sireum.lang.ast.MethodContract.Cases"))
      t.native match {
        case "org.sireum.lang.ast.MethodContract.Simple" => val r = parse_langastMethodContractSimpleT(T); return r
        case "org.sireum.lang.ast.MethodContract.Cases" => val r = parse_langastMethodContractCasesT(T); return r
        case _ => val r = parse_langastMethodContractCasesT(T); return r
      }
    }

    def parse_langastMethodContractAccesses(): org.sireum.lang.ast.MethodContract.Accesses = {
      val r = parse_langastMethodContractAccessesT(F)
      return r
    }

    def parse_langastMethodContractAccessesT(typeParsed: B): org.sireum.lang.ast.MethodContract.Accesses = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.MethodContract.Accesses")
      }
      parser.parseObjectKey("refs")
      val refs = parser.parseISZ(parse_langastExpRef _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.MethodContract.Accesses(refs, attr)
    }

    def parse_langastMethodContractClaims(): org.sireum.lang.ast.MethodContract.Claims = {
      val r = parse_langastMethodContractClaimsT(F)
      return r
    }

    def parse_langastMethodContractClaimsT(typeParsed: B): org.sireum.lang.ast.MethodContract.Claims = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.MethodContract.Claims")
      }
      parser.parseObjectKey("claims")
      val claims = parser.parseISZ(parse_langastExp _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.MethodContract.Claims(claims, attr)
    }

    def parse_langastMethodContractSimple(): org.sireum.lang.ast.MethodContract.Simple = {
      val r = parse_langastMethodContractSimpleT(F)
      return r
    }

    def parse_langastMethodContractSimpleT(typeParsed: B): org.sireum.lang.ast.MethodContract.Simple = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.MethodContract.Simple")
      }
      parser.parseObjectKey("readsClause")
      val readsClause = parse_langastMethodContractAccesses()
      parser.parseObjectNext()
      parser.parseObjectKey("requiresClause")
      val requiresClause = parse_langastMethodContractClaims()
      parser.parseObjectNext()
      parser.parseObjectKey("modifiesClause")
      val modifiesClause = parse_langastMethodContractAccesses()
      parser.parseObjectNext()
      parser.parseObjectKey("ensuresClause")
      val ensuresClause = parse_langastMethodContractClaims()
      parser.parseObjectNext()
      parser.parseObjectKey("infoFlowsClause")
      val infoFlowsClause = parse_langastMethodContractInfoFlows()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.MethodContract.Simple(readsClause, requiresClause, modifiesClause, ensuresClause, infoFlowsClause, attr)
    }

    def parse_langastMethodContractCases(): org.sireum.lang.ast.MethodContract.Cases = {
      val r = parse_langastMethodContractCasesT(F)
      return r
    }

    def parse_langastMethodContractCasesT(typeParsed: B): org.sireum.lang.ast.MethodContract.Cases = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.MethodContract.Cases")
      }
      parser.parseObjectKey("readsClause")
      val readsClause = parse_langastMethodContractAccesses()
      parser.parseObjectNext()
      parser.parseObjectKey("modifiesClause")
      val modifiesClause = parse_langastMethodContractAccesses()
      parser.parseObjectNext()
      parser.parseObjectKey("cases")
      val cases = parser.parseISZ(parse_langastMethodContractCase _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.MethodContract.Cases(readsClause, modifiesClause, cases, attr)
    }

    def parse_langastMethodContractCase(): org.sireum.lang.ast.MethodContract.Case = {
      val r = parse_langastMethodContractCaseT(F)
      return r
    }

    def parse_langastMethodContractCaseT(typeParsed: B): org.sireum.lang.ast.MethodContract.Case = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.MethodContract.Case")
      }
      parser.parseObjectKey("label")
      val label = parse_langastExpLitString()
      parser.parseObjectNext()
      parser.parseObjectKey("requiresClause")
      val requiresClause = parse_langastMethodContractClaims()
      parser.parseObjectNext()
      parser.parseObjectKey("ensuresClause")
      val ensuresClause = parse_langastMethodContractClaims()
      parser.parseObjectNext()
      return org.sireum.lang.ast.MethodContract.Case(label, requiresClause, ensuresClause)
    }

    def parse_langastMethodContractInfoFlowElement(): org.sireum.lang.ast.MethodContract.InfoFlowElement = {
      val t = parser.parseObjectTypes(ISZ("org.sireum.lang.ast.MethodContract.InfoFlowGroup", "org.sireum.lang.ast.MethodContract.InfoFlowFlow", "org.sireum.lang.ast.MethodContract.InfoFlowCase"))
      t.native match {
        case "org.sireum.lang.ast.MethodContract.InfoFlowGroup" => val r = parse_langastMethodContractInfoFlowGroupT(T); return r
        case "org.sireum.lang.ast.MethodContract.InfoFlowFlow" => val r = parse_langastMethodContractInfoFlowFlowT(T); return r
        case "org.sireum.lang.ast.MethodContract.InfoFlowCase" => val r = parse_langastMethodContractInfoFlowCaseT(T); return r
        case _ => val r = parse_langastMethodContractInfoFlowCaseT(T); return r
      }
    }

    def parse_langastMethodContractInfoFlows(): org.sireum.lang.ast.MethodContract.InfoFlows = {
      val r = parse_langastMethodContractInfoFlowsT(F)
      return r
    }

    def parse_langastMethodContractInfoFlowsT(typeParsed: B): org.sireum.lang.ast.MethodContract.InfoFlows = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.MethodContract.InfoFlows")
      }
      parser.parseObjectKey("flows")
      val flows = parser.parseISZ(parse_langastMethodContractInfoFlowElement _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.MethodContract.InfoFlows(flows, attr)
    }

    def parse_langastMethodContractInfoFlowGroup(): org.sireum.lang.ast.MethodContract.InfoFlowGroup = {
      val r = parse_langastMethodContractInfoFlowGroupT(F)
      return r
    }

    def parse_langastMethodContractInfoFlowGroupT(typeParsed: B): org.sireum.lang.ast.MethodContract.InfoFlowGroup = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.MethodContract.InfoFlowGroup")
      }
      parser.parseObjectKey("label")
      val label = parse_langastExpLitString()
      parser.parseObjectNext()
      parser.parseObjectKey("membersClause")
      val membersClause = parse_langastMethodContractClaims()
      parser.parseObjectNext()
      return org.sireum.lang.ast.MethodContract.InfoFlowGroup(label, membersClause)
    }

    def parse_langastMethodContractInfoFlowFlow(): org.sireum.lang.ast.MethodContract.InfoFlowFlow = {
      val r = parse_langastMethodContractInfoFlowFlowT(F)
      return r
    }

    def parse_langastMethodContractInfoFlowFlowT(typeParsed: B): org.sireum.lang.ast.MethodContract.InfoFlowFlow = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.MethodContract.InfoFlowFlow")
      }
      parser.parseObjectKey("label")
      val label = parse_langastExpLitString()
      parser.parseObjectNext()
      parser.parseObjectKey("fromClause")
      val fromClause = parse_langastMethodContractClaims()
      parser.parseObjectNext()
      parser.parseObjectKey("toClause")
      val toClause = parse_langastMethodContractClaims()
      parser.parseObjectNext()
      return org.sireum.lang.ast.MethodContract.InfoFlowFlow(label, fromClause, toClause)
    }

    def parse_langastMethodContractInfoFlowCase(): org.sireum.lang.ast.MethodContract.InfoFlowCase = {
      val r = parse_langastMethodContractInfoFlowCaseT(F)
      return r
    }

    def parse_langastMethodContractInfoFlowCaseT(typeParsed: B): org.sireum.lang.ast.MethodContract.InfoFlowCase = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.MethodContract.InfoFlowCase")
      }
      parser.parseObjectKey("label")
      val label = parse_langastExpLitString()
      parser.parseObjectNext()
      parser.parseObjectKey("requiresClause")
      val requiresClause = parse_langastMethodContractClaims()
      parser.parseObjectNext()
      parser.parseObjectKey("inAgreeClause")
      val inAgreeClause = parse_langastMethodContractClaims()
      parser.parseObjectNext()
      parser.parseObjectKey("outAgreeClause")
      val outAgreeClause = parse_langastMethodContractClaims()
      parser.parseObjectNext()
      return org.sireum.lang.ast.MethodContract.InfoFlowCase(label, requiresClause, inAgreeClause, outAgreeClause)
    }

    def parse_langastSequent(): org.sireum.lang.ast.Sequent = {
      val r = parse_langastSequentT(F)
      return r
    }

    def parse_langastSequentT(typeParsed: B): org.sireum.lang.ast.Sequent = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Sequent")
      }
      parser.parseObjectKey("premises")
      val premises = parser.parseISZ(parse_langastExp _)
      parser.parseObjectNext()
      parser.parseObjectKey("conclusion")
      val conclusion = parse_langastExp()
      parser.parseObjectNext()
      parser.parseObjectKey("steps")
      val steps = parser.parseISZ(parse_langastProofAstStep _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Sequent(premises, conclusion, steps, attr)
    }

    def parse_langastProofAst(): org.sireum.lang.ast.ProofAst = {
      val r = parse_langastProofAstT(F)
      return r
    }

    def parse_langastProofAstT(typeParsed: B): org.sireum.lang.ast.ProofAst = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.ProofAst")
      }
      parser.parseObjectKey("steps")
      val steps = parser.parseISZ(parse_langastProofAstStep _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.ProofAst(steps, attr)
    }

    def parse_langastProofAstStep(): org.sireum.lang.ast.ProofAst.Step = {
      val t = parser.parseObjectTypes(ISZ("org.sireum.lang.ast.ProofAst.Step.Regular", "org.sireum.lang.ast.ProofAst.Step.Assume", "org.sireum.lang.ast.ProofAst.Step.Assert", "org.sireum.lang.ast.ProofAst.Step.SubProof", "org.sireum.lang.ast.ProofAst.Step.Let", "org.sireum.lang.ast.ProofAst.Step.StructInduction"))
      t.native match {
        case "org.sireum.lang.ast.ProofAst.Step.Regular" => val r = parse_langastProofAstStepRegularT(T); return r
        case "org.sireum.lang.ast.ProofAst.Step.Assume" => val r = parse_langastProofAstStepAssumeT(T); return r
        case "org.sireum.lang.ast.ProofAst.Step.Assert" => val r = parse_langastProofAstStepAssertT(T); return r
        case "org.sireum.lang.ast.ProofAst.Step.SubProof" => val r = parse_langastProofAstStepSubProofT(T); return r
        case "org.sireum.lang.ast.ProofAst.Step.Let" => val r = parse_langastProofAstStepLetT(T); return r
        case "org.sireum.lang.ast.ProofAst.Step.StructInduction" => val r = parse_langastProofAstStepStructInductionT(T); return r
        case _ => val r = parse_langastProofAstStepStructInductionT(T); return r
      }
    }

    def parse_langastProofAstStepId(): org.sireum.lang.ast.ProofAst.StepId = {
      val t = parser.parseObjectTypes(ISZ("org.sireum.lang.ast.ProofAst.StepId.Num", "org.sireum.lang.ast.ProofAst.StepId.Str"))
      t.native match {
        case "org.sireum.lang.ast.ProofAst.StepId.Num" => val r = parse_langastProofAstStepIdNumT(T); return r
        case "org.sireum.lang.ast.ProofAst.StepId.Str" => val r = parse_langastProofAstStepIdStrT(T); return r
        case _ => val r = parse_langastProofAstStepIdStrT(T); return r
      }
    }

    def parse_langastProofAstStepIdNum(): org.sireum.lang.ast.ProofAst.StepId.Num = {
      val r = parse_langastProofAstStepIdNumT(F)
      return r
    }

    def parse_langastProofAstStepIdNumT(typeParsed: B): org.sireum.lang.ast.ProofAst.StepId.Num = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.ProofAst.StepId.Num")
      }
      parser.parseObjectKey("no")
      val no = parser.parseZ()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.ProofAst.StepId.Num(no, attr)
    }

    def parse_langastProofAstStepIdStr(): org.sireum.lang.ast.ProofAst.StepId.Str = {
      val r = parse_langastProofAstStepIdStrT(F)
      return r
    }

    def parse_langastProofAstStepIdStrT(typeParsed: B): org.sireum.lang.ast.ProofAst.StepId.Str = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.ProofAst.StepId.Str")
      }
      parser.parseObjectKey("isSynthetic")
      val isSynthetic = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("value")
      val value = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.ProofAst.StepId.Str(isSynthetic, value, attr)
    }

    def parse_langastProofAstStepRegular(): org.sireum.lang.ast.ProofAst.Step.Regular = {
      val r = parse_langastProofAstStepRegularT(F)
      return r
    }

    def parse_langastProofAstStepRegularT(typeParsed: B): org.sireum.lang.ast.ProofAst.Step.Regular = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.ProofAst.Step.Regular")
      }
      parser.parseObjectKey("id")
      val id = parse_langastProofAstStepId()
      parser.parseObjectNext()
      parser.parseObjectKey("claim")
      val claim = parse_langastExp()
      parser.parseObjectNext()
      parser.parseObjectKey("just")
      val just = parse_langastProofAstStepJustification()
      parser.parseObjectNext()
      return org.sireum.lang.ast.ProofAst.Step.Regular(id, claim, just)
    }

    def parse_langastProofAstStepAssume(): org.sireum.lang.ast.ProofAst.Step.Assume = {
      val r = parse_langastProofAstStepAssumeT(F)
      return r
    }

    def parse_langastProofAstStepAssumeT(typeParsed: B): org.sireum.lang.ast.ProofAst.Step.Assume = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.ProofAst.Step.Assume")
      }
      parser.parseObjectKey("id")
      val id = parse_langastProofAstStepId()
      parser.parseObjectNext()
      parser.parseObjectKey("claim")
      val claim = parse_langastExp()
      parser.parseObjectNext()
      return org.sireum.lang.ast.ProofAst.Step.Assume(id, claim)
    }

    def parse_langastProofAstStepAssert(): org.sireum.lang.ast.ProofAst.Step.Assert = {
      val r = parse_langastProofAstStepAssertT(F)
      return r
    }

    def parse_langastProofAstStepAssertT(typeParsed: B): org.sireum.lang.ast.ProofAst.Step.Assert = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.ProofAst.Step.Assert")
      }
      parser.parseObjectKey("id")
      val id = parse_langastProofAstStepId()
      parser.parseObjectNext()
      parser.parseObjectKey("claim")
      val claim = parse_langastExp()
      parser.parseObjectNext()
      parser.parseObjectKey("steps")
      val steps = parser.parseISZ(parse_langastProofAstStep _)
      parser.parseObjectNext()
      return org.sireum.lang.ast.ProofAst.Step.Assert(id, claim, steps)
    }

    def parse_langastProofAstStepSubProof(): org.sireum.lang.ast.ProofAst.Step.SubProof = {
      val r = parse_langastProofAstStepSubProofT(F)
      return r
    }

    def parse_langastProofAstStepSubProofT(typeParsed: B): org.sireum.lang.ast.ProofAst.Step.SubProof = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.ProofAst.Step.SubProof")
      }
      parser.parseObjectKey("id")
      val id = parse_langastProofAstStepId()
      parser.parseObjectNext()
      parser.parseObjectKey("steps")
      val steps = parser.parseISZ(parse_langastProofAstStep _)
      parser.parseObjectNext()
      return org.sireum.lang.ast.ProofAst.Step.SubProof(id, steps)
    }

    def parse_langastProofAstStepLet(): org.sireum.lang.ast.ProofAst.Step.Let = {
      val r = parse_langastProofAstStepLetT(F)
      return r
    }

    def parse_langastProofAstStepLetT(typeParsed: B): org.sireum.lang.ast.ProofAst.Step.Let = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.ProofAst.Step.Let")
      }
      parser.parseObjectKey("id")
      val id = parse_langastProofAstStepId()
      parser.parseObjectNext()
      parser.parseObjectKey("params")
      val params = parser.parseISZ(parse_langastProofAstStepLetParam _)
      parser.parseObjectNext()
      parser.parseObjectKey("steps")
      val steps = parser.parseISZ(parse_langastProofAstStep _)
      parser.parseObjectNext()
      return org.sireum.lang.ast.ProofAst.Step.Let(id, params, steps)
    }

    def parse_langastProofAstStepLetParam(): org.sireum.lang.ast.ProofAst.Step.Let.Param = {
      val r = parse_langastProofAstStepLetParamT(F)
      return r
    }

    def parse_langastProofAstStepLetParamT(typeParsed: B): org.sireum.lang.ast.ProofAst.Step.Let.Param = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.ProofAst.Step.Let.Param")
      }
      parser.parseObjectKey("id")
      val id = parse_langastId()
      parser.parseObjectNext()
      parser.parseObjectKey("tipeOpt")
      val tipeOpt = parser.parseOption(parse_langastType _)
      parser.parseObjectNext()
      return org.sireum.lang.ast.ProofAst.Step.Let.Param(id, tipeOpt)
    }

    def parse_langastProofAstStepStructInduction(): org.sireum.lang.ast.ProofAst.Step.StructInduction = {
      val r = parse_langastProofAstStepStructInductionT(F)
      return r
    }

    def parse_langastProofAstStepStructInductionT(typeParsed: B): org.sireum.lang.ast.ProofAst.Step.StructInduction = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.ProofAst.Step.StructInduction")
      }
      parser.parseObjectKey("id")
      val id = parse_langastProofAstStepId()
      parser.parseObjectNext()
      parser.parseObjectKey("claim")
      val claim = parse_langastExp()
      parser.parseObjectNext()
      parser.parseObjectKey("exp")
      val exp = parse_langastExp()
      parser.parseObjectNext()
      parser.parseObjectKey("cases")
      val cases = parser.parseISZ(parse_langastProofAstStepStructInductionMatchCase _)
      parser.parseObjectNext()
      parser.parseObjectKey("defaultOpt")
      val defaultOpt = parser.parseOption(parse_langastProofAstStepStructInductionMatchDefault _)
      parser.parseObjectNext()
      return org.sireum.lang.ast.ProofAst.Step.StructInduction(id, claim, exp, cases, defaultOpt)
    }

    def parse_langastProofAstStepStructInductionMatchCase(): org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase = {
      val r = parse_langastProofAstStepStructInductionMatchCaseT(F)
      return r
    }

    def parse_langastProofAstStepStructInductionMatchCaseT(typeParsed: B): org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase")
      }
      parser.parseObjectKey("pattern")
      val pattern = parse_langastPatternStructure()
      parser.parseObjectNext()
      parser.parseObjectKey("hypoOpt")
      val hypoOpt = parser.parseOption(parse_langastProofAstStepAssume _)
      parser.parseObjectNext()
      parser.parseObjectKey("steps")
      val steps = parser.parseISZ(parse_langastProofAstStep _)
      parser.parseObjectNext()
      return org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase(pattern, hypoOpt, steps)
    }

    def parse_langastProofAstStepStructInductionMatchDefault(): org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault = {
      val r = parse_langastProofAstStepStructInductionMatchDefaultT(F)
      return r
    }

    def parse_langastProofAstStepStructInductionMatchDefaultT(typeParsed: B): org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault")
      }
      parser.parseObjectKey("hypoOpt")
      val hypoOpt = parser.parseOption(parse_langastProofAstStepAssume _)
      parser.parseObjectNext()
      parser.parseObjectKey("steps")
      val steps = parser.parseISZ(parse_langastProofAstStep _)
      parser.parseObjectNext()
      return org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault(hypoOpt, steps)
    }

    def parse_langastProofAstStepJustification(): org.sireum.lang.ast.ProofAst.Step.Justification = {
      val t = parser.parseObjectTypes(ISZ("org.sireum.lang.ast.ProofAst.Step.Justification.Ref", "org.sireum.lang.ast.ProofAst.Step.Justification.Apply", "org.sireum.lang.ast.ProofAst.Step.Justification.ApplyNamed", "org.sireum.lang.ast.ProofAst.Step.Justification.ApplyEta"))
      t.native match {
        case "org.sireum.lang.ast.ProofAst.Step.Justification.Ref" => val r = parse_langastProofAstStepJustificationRefT(T); return r
        case "org.sireum.lang.ast.ProofAst.Step.Justification.Apply" => val r = parse_langastProofAstStepJustificationApplyT(T); return r
        case "org.sireum.lang.ast.ProofAst.Step.Justification.ApplyNamed" => val r = parse_langastProofAstStepJustificationApplyNamedT(T); return r
        case "org.sireum.lang.ast.ProofAst.Step.Justification.ApplyEta" => val r = parse_langastProofAstStepJustificationApplyEtaT(T); return r
        case _ => val r = parse_langastProofAstStepJustificationApplyEtaT(T); return r
      }
    }

    def parse_langastProofAstStepJustificationRef(): org.sireum.lang.ast.ProofAst.Step.Justification.Ref = {
      val r = parse_langastProofAstStepJustificationRefT(F)
      return r
    }

    def parse_langastProofAstStepJustificationRefT(typeParsed: B): org.sireum.lang.ast.ProofAst.Step.Justification.Ref = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.ProofAst.Step.Justification.Ref")
      }
      parser.parseObjectKey("ref")
      val ref = parse_langastExpRef()
      parser.parseObjectNext()
      parser.parseObjectKey("hasWitness")
      val hasWitness = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("witnesses")
      val witnesses = parser.parseISZ(parse_langastProofAstStepId _)
      parser.parseObjectNext()
      return org.sireum.lang.ast.ProofAst.Step.Justification.Ref(ref, hasWitness, witnesses)
    }

    def parse_langastProofAstStepJustificationApply(): org.sireum.lang.ast.ProofAst.Step.Justification.Apply = {
      val r = parse_langastProofAstStepJustificationApplyT(F)
      return r
    }

    def parse_langastProofAstStepJustificationApplyT(typeParsed: B): org.sireum.lang.ast.ProofAst.Step.Justification.Apply = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.ProofAst.Step.Justification.Apply")
      }
      parser.parseObjectKey("invoke")
      val invoke = parse_langastExpInvoke()
      parser.parseObjectNext()
      parser.parseObjectKey("hasWitness")
      val hasWitness = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("witnesses")
      val witnesses = parser.parseISZ(parse_langastProofAstStepId _)
      parser.parseObjectNext()
      return org.sireum.lang.ast.ProofAst.Step.Justification.Apply(invoke, hasWitness, witnesses)
    }

    def parse_langastProofAstStepJustificationApplyNamed(): org.sireum.lang.ast.ProofAst.Step.Justification.ApplyNamed = {
      val r = parse_langastProofAstStepJustificationApplyNamedT(F)
      return r
    }

    def parse_langastProofAstStepJustificationApplyNamedT(typeParsed: B): org.sireum.lang.ast.ProofAst.Step.Justification.ApplyNamed = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.ProofAst.Step.Justification.ApplyNamed")
      }
      parser.parseObjectKey("invoke")
      val invoke = parse_langastExpInvokeNamed()
      parser.parseObjectNext()
      parser.parseObjectKey("hasWitness")
      val hasWitness = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("witnesses")
      val witnesses = parser.parseISZ(parse_langastProofAstStepId _)
      parser.parseObjectNext()
      return org.sireum.lang.ast.ProofAst.Step.Justification.ApplyNamed(invoke, hasWitness, witnesses)
    }

    def parse_langastProofAstStepJustificationApplyEta(): org.sireum.lang.ast.ProofAst.Step.Justification.ApplyEta = {
      val r = parse_langastProofAstStepJustificationApplyEtaT(F)
      return r
    }

    def parse_langastProofAstStepJustificationApplyEtaT(typeParsed: B): org.sireum.lang.ast.ProofAst.Step.Justification.ApplyEta = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.ProofAst.Step.Justification.ApplyEta")
      }
      parser.parseObjectKey("eta")
      val eta = parse_langastExpEta()
      parser.parseObjectNext()
      parser.parseObjectKey("hasWitness")
      val hasWitness = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("witnesses")
      val witnesses = parser.parseISZ(parse_langastProofAstStepId _)
      parser.parseObjectNext()
      return org.sireum.lang.ast.ProofAst.Step.Justification.ApplyEta(eta, hasWitness, witnesses)
    }

    def parse_langastAssignExp(): org.sireum.lang.ast.AssignExp = {
      val t = parser.parseObjectTypes(ISZ("org.sireum.lang.ast.Stmt.Block", "org.sireum.lang.ast.Stmt.If", "org.sireum.lang.ast.Stmt.Match", "org.sireum.lang.ast.Stmt.Return", "org.sireum.lang.ast.Stmt.Expr"))
      t.native match {
        case "org.sireum.lang.ast.Stmt.Block" => val r = parse_langastStmtBlockT(T); return r
        case "org.sireum.lang.ast.Stmt.If" => val r = parse_langastStmtIfT(T); return r
        case "org.sireum.lang.ast.Stmt.Match" => val r = parse_langastStmtMatchT(T); return r
        case "org.sireum.lang.ast.Stmt.Return" => val r = parse_langastStmtReturnT(T); return r
        case "org.sireum.lang.ast.Stmt.Expr" => val r = parse_langastStmtExprT(T); return r
        case _ => val r = parse_langastStmtExprT(T); return r
      }
    }

    def parse_langastPurityType(): org.sireum.lang.ast.Purity.Type = {
      val r = parse_langastPurityT(F)
      return r
    }

    def parse_langastPurityT(typeParsed: B): org.sireum.lang.ast.Purity.Type = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Purity")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      org.sireum.lang.ast.Purity.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for org.sireum.lang.ast.Purity.")
          return org.sireum.lang.ast.Purity.byOrdinal(0).get
      }
    }

    def parse_langastCase(): org.sireum.lang.ast.Case = {
      val r = parse_langastCaseT(F)
      return r
    }

    def parse_langastCaseT(typeParsed: B): org.sireum.lang.ast.Case = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Case")
      }
      parser.parseObjectKey("pattern")
      val pattern = parse_langastPattern()
      parser.parseObjectNext()
      parser.parseObjectKey("condOpt")
      val condOpt = parser.parseOption(parse_langastExp _)
      parser.parseObjectNext()
      parser.parseObjectKey("body")
      val body = parse_langastBody()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Case(pattern, condOpt, body)
    }

    def parse_langastEnumGenRange(): org.sireum.lang.ast.EnumGen.Range = {
      val t = parser.parseObjectTypes(ISZ("org.sireum.lang.ast.EnumGen.Range.Expr", "org.sireum.lang.ast.EnumGen.Range.Step"))
      t.native match {
        case "org.sireum.lang.ast.EnumGen.Range.Expr" => val r = parse_langastEnumGenRangeExprT(T); return r
        case "org.sireum.lang.ast.EnumGen.Range.Step" => val r = parse_langastEnumGenRangeStepT(T); return r
        case _ => val r = parse_langastEnumGenRangeStepT(T); return r
      }
    }

    def parse_langastEnumGenRangeExpr(): org.sireum.lang.ast.EnumGen.Range.Expr = {
      val r = parse_langastEnumGenRangeExprT(F)
      return r
    }

    def parse_langastEnumGenRangeExprT(typeParsed: B): org.sireum.lang.ast.EnumGen.Range.Expr = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.EnumGen.Range.Expr")
      }
      parser.parseObjectKey("exp")
      val exp = parse_langastExp()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.EnumGen.Range.Expr(exp, attr)
    }

    def parse_langastEnumGenRangeStep(): org.sireum.lang.ast.EnumGen.Range.Step = {
      val r = parse_langastEnumGenRangeStepT(F)
      return r
    }

    def parse_langastEnumGenRangeStepT(typeParsed: B): org.sireum.lang.ast.EnumGen.Range.Step = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.EnumGen.Range.Step")
      }
      parser.parseObjectKey("isInclusive")
      val isInclusive = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("start")
      val start = parse_langastExp()
      parser.parseObjectNext()
      parser.parseObjectKey("end")
      val end = parse_langastExp()
      parser.parseObjectNext()
      parser.parseObjectKey("byOpt")
      val byOpt = parser.parseOption(parse_langastExp _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.EnumGen.Range.Step(isInclusive, start, end, byOpt, attr)
    }

    def parse_langastEnumGenFor(): org.sireum.lang.ast.EnumGen.For = {
      val r = parse_langastEnumGenForT(F)
      return r
    }

    def parse_langastEnumGenForT(typeParsed: B): org.sireum.lang.ast.EnumGen.For = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.EnumGen.For")
      }
      parser.parseObjectKey("idOpt")
      val idOpt = parser.parseOption(parse_langastId _)
      parser.parseObjectNext()
      parser.parseObjectKey("range")
      val range = parse_langastEnumGenRange()
      parser.parseObjectNext()
      parser.parseObjectKey("condOpt")
      val condOpt = parser.parseOption(parse_langastExp _)
      parser.parseObjectNext()
      parser.parseObjectKey("contract")
      val contract = parse_langastLoopContract()
      parser.parseObjectNext()
      return org.sireum.lang.ast.EnumGen.For(idOpt, range, condOpt, contract)
    }

    def parse_langastType(): org.sireum.lang.ast.Type = {
      val t = parser.parseObjectTypes(ISZ("org.sireum.lang.ast.Type.Named", "org.sireum.lang.ast.Type.Fun", "org.sireum.lang.ast.Type.Tuple"))
      t.native match {
        case "org.sireum.lang.ast.Type.Named" => val r = parse_langastTypeNamedT(T); return r
        case "org.sireum.lang.ast.Type.Fun" => val r = parse_langastTypeFunT(T); return r
        case "org.sireum.lang.ast.Type.Tuple" => val r = parse_langastTypeTupleT(T); return r
        case _ => val r = parse_langastTypeTupleT(T); return r
      }
    }

    def parse_langastTypeNamed(): org.sireum.lang.ast.Type.Named = {
      val r = parse_langastTypeNamedT(F)
      return r
    }

    def parse_langastTypeNamedT(typeParsed: B): org.sireum.lang.ast.Type.Named = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Type.Named")
      }
      parser.parseObjectKey("name")
      val name = parse_langastName()
      parser.parseObjectNext()
      parser.parseObjectKey("typeArgs")
      val typeArgs = parser.parseISZ(parse_langastType _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastTypedAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Type.Named(name, typeArgs, attr)
    }

    def parse_langastTypeFun(): org.sireum.lang.ast.Type.Fun = {
      val r = parse_langastTypeFunT(F)
      return r
    }

    def parse_langastTypeFunT(typeParsed: B): org.sireum.lang.ast.Type.Fun = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Type.Fun")
      }
      parser.parseObjectKey("isPure")
      val isPure = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("isByName")
      val isByName = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("args")
      val args = parser.parseISZ(parse_langastType _)
      parser.parseObjectNext()
      parser.parseObjectKey("ret")
      val ret = parse_langastType()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastTypedAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Type.Fun(isPure, isByName, args, ret, attr)
    }

    def parse_langastTypeTuple(): org.sireum.lang.ast.Type.Tuple = {
      val r = parse_langastTypeTupleT(F)
      return r
    }

    def parse_langastTypeTupleT(typeParsed: B): org.sireum.lang.ast.Type.Tuple = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Type.Tuple")
      }
      parser.parseObjectKey("args")
      val args = parser.parseISZ(parse_langastType _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastTypedAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Type.Tuple(args, attr)
    }

    def parse_langastPattern(): org.sireum.lang.ast.Pattern = {
      val t = parser.parseObjectTypes(ISZ("org.sireum.lang.ast.Pattern.Literal", "org.sireum.lang.ast.Pattern.LitInterpolate", "org.sireum.lang.ast.Pattern.Ref", "org.sireum.lang.ast.Pattern.VarBinding", "org.sireum.lang.ast.Pattern.Wildcard", "org.sireum.lang.ast.Pattern.SeqWildcard", "org.sireum.lang.ast.Pattern.Structure"))
      t.native match {
        case "org.sireum.lang.ast.Pattern.Literal" => val r = parse_langastPatternLiteralT(T); return r
        case "org.sireum.lang.ast.Pattern.LitInterpolate" => val r = parse_langastPatternLitInterpolateT(T); return r
        case "org.sireum.lang.ast.Pattern.Ref" => val r = parse_langastPatternRefT(T); return r
        case "org.sireum.lang.ast.Pattern.VarBinding" => val r = parse_langastPatternVarBindingT(T); return r
        case "org.sireum.lang.ast.Pattern.Wildcard" => val r = parse_langastPatternWildcardT(T); return r
        case "org.sireum.lang.ast.Pattern.SeqWildcard" => val r = parse_langastPatternSeqWildcardT(T); return r
        case "org.sireum.lang.ast.Pattern.Structure" => val r = parse_langastPatternStructureT(T); return r
        case _ => val r = parse_langastPatternStructureT(T); return r
      }
    }

    def parse_langastPatternLiteral(): org.sireum.lang.ast.Pattern.Literal = {
      val r = parse_langastPatternLiteralT(F)
      return r
    }

    def parse_langastPatternLiteralT(typeParsed: B): org.sireum.lang.ast.Pattern.Literal = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Pattern.Literal")
      }
      parser.parseObjectKey("lit")
      val lit = parse_langastLit()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Pattern.Literal(lit)
    }

    def parse_langastPatternLitInterpolate(): org.sireum.lang.ast.Pattern.LitInterpolate = {
      val r = parse_langastPatternLitInterpolateT(F)
      return r
    }

    def parse_langastPatternLitInterpolateT(typeParsed: B): org.sireum.lang.ast.Pattern.LitInterpolate = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Pattern.LitInterpolate")
      }
      parser.parseObjectKey("prefix")
      val prefix = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("value")
      val value = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastTypedAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Pattern.LitInterpolate(prefix, value, attr)
    }

    def parse_langastPatternRef(): org.sireum.lang.ast.Pattern.Ref = {
      val r = parse_langastPatternRefT(F)
      return r
    }

    def parse_langastPatternRefT(typeParsed: B): org.sireum.lang.ast.Pattern.Ref = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Pattern.Ref")
      }
      parser.parseObjectKey("isAccess")
      val isAccess = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("name")
      val name = parse_langastName()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastResolvedAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Pattern.Ref(isAccess, name, attr)
    }

    def parse_langastPatternVarBinding(): org.sireum.lang.ast.Pattern.VarBinding = {
      val r = parse_langastPatternVarBindingT(F)
      return r
    }

    def parse_langastPatternVarBindingT(typeParsed: B): org.sireum.lang.ast.Pattern.VarBinding = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Pattern.VarBinding")
      }
      parser.parseObjectKey("id")
      val id = parse_langastId()
      parser.parseObjectNext()
      parser.parseObjectKey("tipeOpt")
      val tipeOpt = parser.parseOption(parse_langastType _)
      parser.parseObjectNext()
      parser.parseObjectKey("idContext")
      val idContext = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastTypedAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Pattern.VarBinding(id, tipeOpt, idContext, attr)
    }

    def parse_langastPatternWildcard(): org.sireum.lang.ast.Pattern.Wildcard = {
      val r = parse_langastPatternWildcardT(F)
      return r
    }

    def parse_langastPatternWildcardT(typeParsed: B): org.sireum.lang.ast.Pattern.Wildcard = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Pattern.Wildcard")
      }
      parser.parseObjectKey("typeOpt")
      val typeOpt = parser.parseOption(parse_langastType _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastTypedAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Pattern.Wildcard(typeOpt, attr)
    }

    def parse_langastPatternSeqWildcard(): org.sireum.lang.ast.Pattern.SeqWildcard = {
      val r = parse_langastPatternSeqWildcardT(F)
      return r
    }

    def parse_langastPatternSeqWildcardT(typeParsed: B): org.sireum.lang.ast.Pattern.SeqWildcard = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Pattern.SeqWildcard")
      }
      parser.parseObjectKey("attr")
      val attr = parse_langastTypedAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Pattern.SeqWildcard(attr)
    }

    def parse_langastPatternStructure(): org.sireum.lang.ast.Pattern.Structure = {
      val r = parse_langastPatternStructureT(F)
      return r
    }

    def parse_langastPatternStructureT(typeParsed: B): org.sireum.lang.ast.Pattern.Structure = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Pattern.Structure")
      }
      parser.parseObjectKey("idOpt")
      val idOpt = parser.parseOption(parse_langastId _)
      parser.parseObjectNext()
      parser.parseObjectKey("nameOpt")
      val nameOpt = parser.parseOption(parse_langastName _)
      parser.parseObjectNext()
      parser.parseObjectKey("patterns")
      val patterns = parser.parseISZ(parse_langastPattern _)
      parser.parseObjectNext()
      parser.parseObjectKey("idContext")
      val idContext = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastResolvedAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Pattern.Structure(idOpt, nameOpt, patterns, idContext, attr)
    }

    def parse_langastExp(): org.sireum.lang.ast.Exp = {
      val t = parser.parseObjectTypes(ISZ("org.sireum.lang.ast.Exp.LitB", "org.sireum.lang.ast.Exp.LitC", "org.sireum.lang.ast.Exp.LitZ", "org.sireum.lang.ast.Exp.LitF32", "org.sireum.lang.ast.Exp.LitF64", "org.sireum.lang.ast.Exp.LitR", "org.sireum.lang.ast.Exp.LitString", "org.sireum.lang.ast.Exp.StringInterpolate", "org.sireum.lang.ast.Exp.This", "org.sireum.lang.ast.Exp.Super", "org.sireum.lang.ast.Exp.Unary", "org.sireum.lang.ast.Exp.Binary", "org.sireum.lang.ast.Exp.Ident", "org.sireum.lang.ast.Exp.Eta", "org.sireum.lang.ast.Exp.Tuple", "org.sireum.lang.ast.Exp.Select", "org.sireum.lang.ast.Exp.Invoke", "org.sireum.lang.ast.Exp.InvokeNamed", "org.sireum.lang.ast.Exp.If", "org.sireum.lang.ast.Exp.TypeCond", "org.sireum.lang.ast.Exp.Sym", "org.sireum.lang.ast.Exp.Fun", "org.sireum.lang.ast.Exp.ForYield", "org.sireum.lang.ast.Exp.QuantType", "org.sireum.lang.ast.Exp.QuantRange", "org.sireum.lang.ast.Exp.QuantEach", "org.sireum.lang.ast.Exp.Input", "org.sireum.lang.ast.Exp.Old", "org.sireum.lang.ast.Exp.At", "org.sireum.lang.ast.Exp.LoopIndex", "org.sireum.lang.ast.Exp.StateSeq", "org.sireum.lang.ast.Exp.Result", "org.sireum.lang.ast.Exp.StrictPureBlock", "org.sireum.lang.ast.Exp.Labeled", "org.sireum.lang.ast.Exp.AssumeAgree", "org.sireum.lang.ast.Exp.AssertAgree", "org.sireum.lang.ast.Exp.InfoFlowInvariant"))
      t.native match {
        case "org.sireum.lang.ast.Exp.LitB" => val r = parse_langastExpLitBT(T); return r
        case "org.sireum.lang.ast.Exp.LitC" => val r = parse_langastExpLitCT(T); return r
        case "org.sireum.lang.ast.Exp.LitZ" => val r = parse_langastExpLitZT(T); return r
        case "org.sireum.lang.ast.Exp.LitF32" => val r = parse_langastExpLitF32T(T); return r
        case "org.sireum.lang.ast.Exp.LitF64" => val r = parse_langastExpLitF64T(T); return r
        case "org.sireum.lang.ast.Exp.LitR" => val r = parse_langastExpLitRT(T); return r
        case "org.sireum.lang.ast.Exp.LitString" => val r = parse_langastExpLitStringT(T); return r
        case "org.sireum.lang.ast.Exp.StringInterpolate" => val r = parse_langastExpStringInterpolateT(T); return r
        case "org.sireum.lang.ast.Exp.This" => val r = parse_langastExpThisT(T); return r
        case "org.sireum.lang.ast.Exp.Super" => val r = parse_langastExpSuperT(T); return r
        case "org.sireum.lang.ast.Exp.Unary" => val r = parse_langastExpUnaryT(T); return r
        case "org.sireum.lang.ast.Exp.Binary" => val r = parse_langastExpBinaryT(T); return r
        case "org.sireum.lang.ast.Exp.Ident" => val r = parse_langastExpIdentT(T); return r
        case "org.sireum.lang.ast.Exp.Eta" => val r = parse_langastExpEtaT(T); return r
        case "org.sireum.lang.ast.Exp.Tuple" => val r = parse_langastExpTupleT(T); return r
        case "org.sireum.lang.ast.Exp.Select" => val r = parse_langastExpSelectT(T); return r
        case "org.sireum.lang.ast.Exp.Invoke" => val r = parse_langastExpInvokeT(T); return r
        case "org.sireum.lang.ast.Exp.InvokeNamed" => val r = parse_langastExpInvokeNamedT(T); return r
        case "org.sireum.lang.ast.Exp.If" => val r = parse_langastExpIfT(T); return r
        case "org.sireum.lang.ast.Exp.TypeCond" => val r = parse_langastExpTypeCondT(T); return r
        case "org.sireum.lang.ast.Exp.Sym" => val r = parse_langastExpSymT(T); return r
        case "org.sireum.lang.ast.Exp.Fun" => val r = parse_langastExpFunT(T); return r
        case "org.sireum.lang.ast.Exp.ForYield" => val r = parse_langastExpForYieldT(T); return r
        case "org.sireum.lang.ast.Exp.QuantType" => val r = parse_langastExpQuantTypeT(T); return r
        case "org.sireum.lang.ast.Exp.QuantRange" => val r = parse_langastExpQuantRangeT(T); return r
        case "org.sireum.lang.ast.Exp.QuantEach" => val r = parse_langastExpQuantEachT(T); return r
        case "org.sireum.lang.ast.Exp.Input" => val r = parse_langastExpInputT(T); return r
        case "org.sireum.lang.ast.Exp.Old" => val r = parse_langastExpOldT(T); return r
        case "org.sireum.lang.ast.Exp.At" => val r = parse_langastExpAtT(T); return r
        case "org.sireum.lang.ast.Exp.LoopIndex" => val r = parse_langastExpLoopIndexT(T); return r
        case "org.sireum.lang.ast.Exp.StateSeq" => val r = parse_langastExpStateSeqT(T); return r
        case "org.sireum.lang.ast.Exp.Result" => val r = parse_langastExpResultT(T); return r
        case "org.sireum.lang.ast.Exp.StrictPureBlock" => val r = parse_langastExpStrictPureBlockT(T); return r
        case "org.sireum.lang.ast.Exp.Labeled" => val r = parse_langastExpLabeledT(T); return r
        case "org.sireum.lang.ast.Exp.AssumeAgree" => val r = parse_langastExpAssumeAgreeT(T); return r
        case "org.sireum.lang.ast.Exp.AssertAgree" => val r = parse_langastExpAssertAgreeT(T); return r
        case "org.sireum.lang.ast.Exp.InfoFlowInvariant" => val r = parse_langastExpInfoFlowInvariantT(T); return r
        case _ => val r = parse_langastExpInfoFlowInvariantT(T); return r
      }
    }

    def parse_langastLit(): org.sireum.lang.ast.Lit = {
      val t = parser.parseObjectTypes(ISZ("org.sireum.lang.ast.Exp.LitB", "org.sireum.lang.ast.Exp.LitC", "org.sireum.lang.ast.Exp.LitZ", "org.sireum.lang.ast.Exp.LitF32", "org.sireum.lang.ast.Exp.LitF64", "org.sireum.lang.ast.Exp.LitR", "org.sireum.lang.ast.Exp.LitString"))
      t.native match {
        case "org.sireum.lang.ast.Exp.LitB" => val r = parse_langastExpLitBT(T); return r
        case "org.sireum.lang.ast.Exp.LitC" => val r = parse_langastExpLitCT(T); return r
        case "org.sireum.lang.ast.Exp.LitZ" => val r = parse_langastExpLitZT(T); return r
        case "org.sireum.lang.ast.Exp.LitF32" => val r = parse_langastExpLitF32T(T); return r
        case "org.sireum.lang.ast.Exp.LitF64" => val r = parse_langastExpLitF64T(T); return r
        case "org.sireum.lang.ast.Exp.LitR" => val r = parse_langastExpLitRT(T); return r
        case "org.sireum.lang.ast.Exp.LitString" => val r = parse_langastExpLitStringT(T); return r
        case _ => val r = parse_langastExpLitStringT(T); return r
      }
    }

    def parse_langastExpLitB(): org.sireum.lang.ast.Exp.LitB = {
      val r = parse_langastExpLitBT(F)
      return r
    }

    def parse_langastExpLitBT(typeParsed: B): org.sireum.lang.ast.Exp.LitB = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Exp.LitB")
      }
      parser.parseObjectKey("value")
      val value = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Exp.LitB(value, attr)
    }

    def parse_langastExpLitC(): org.sireum.lang.ast.Exp.LitC = {
      val r = parse_langastExpLitCT(F)
      return r
    }

    def parse_langastExpLitCT(typeParsed: B): org.sireum.lang.ast.Exp.LitC = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Exp.LitC")
      }
      parser.parseObjectKey("value")
      val value = parser.parseC()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Exp.LitC(value, attr)
    }

    def parse_langastExpLitZ(): org.sireum.lang.ast.Exp.LitZ = {
      val r = parse_langastExpLitZT(F)
      return r
    }

    def parse_langastExpLitZT(typeParsed: B): org.sireum.lang.ast.Exp.LitZ = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Exp.LitZ")
      }
      parser.parseObjectKey("value")
      val value = parser.parseZ()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Exp.LitZ(value, attr)
    }

    def parse_langastExpLitF32(): org.sireum.lang.ast.Exp.LitF32 = {
      val r = parse_langastExpLitF32T(F)
      return r
    }

    def parse_langastExpLitF32T(typeParsed: B): org.sireum.lang.ast.Exp.LitF32 = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Exp.LitF32")
      }
      parser.parseObjectKey("value")
      val value = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Exp.LitF32(value, attr)
    }

    def parse_langastExpLitF64(): org.sireum.lang.ast.Exp.LitF64 = {
      val r = parse_langastExpLitF64T(F)
      return r
    }

    def parse_langastExpLitF64T(typeParsed: B): org.sireum.lang.ast.Exp.LitF64 = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Exp.LitF64")
      }
      parser.parseObjectKey("value")
      val value = parser.parseF64()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Exp.LitF64(value, attr)
    }

    def parse_langastExpLitR(): org.sireum.lang.ast.Exp.LitR = {
      val r = parse_langastExpLitRT(F)
      return r
    }

    def parse_langastExpLitRT(typeParsed: B): org.sireum.lang.ast.Exp.LitR = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Exp.LitR")
      }
      parser.parseObjectKey("value")
      val value = parser.parseR()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Exp.LitR(value, attr)
    }

    def parse_langastExpLitString(): org.sireum.lang.ast.Exp.LitString = {
      val r = parse_langastExpLitStringT(F)
      return r
    }

    def parse_langastExpLitStringT(typeParsed: B): org.sireum.lang.ast.Exp.LitString = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Exp.LitString")
      }
      parser.parseObjectKey("value")
      val value = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Exp.LitString(value, attr)
    }

    def parse_langastExpStringInterpolate(): org.sireum.lang.ast.Exp.StringInterpolate = {
      val r = parse_langastExpStringInterpolateT(F)
      return r
    }

    def parse_langastExpStringInterpolateT(typeParsed: B): org.sireum.lang.ast.Exp.StringInterpolate = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Exp.StringInterpolate")
      }
      parser.parseObjectKey("prefix")
      val prefix = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("lits")
      val lits = parser.parseISZ(parse_langastExpLitString _)
      parser.parseObjectNext()
      parser.parseObjectKey("args")
      val args = parser.parseISZ(parse_langastExp _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastTypedAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Exp.StringInterpolate(prefix, lits, args, attr)
    }

    def parse_langastExpThis(): org.sireum.lang.ast.Exp.This = {
      val r = parse_langastExpThisT(F)
      return r
    }

    def parse_langastExpThisT(typeParsed: B): org.sireum.lang.ast.Exp.This = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Exp.This")
      }
      parser.parseObjectKey("attr")
      val attr = parse_langastTypedAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Exp.This(attr)
    }

    def parse_langastExpSuper(): org.sireum.lang.ast.Exp.Super = {
      val r = parse_langastExpSuperT(F)
      return r
    }

    def parse_langastExpSuperT(typeParsed: B): org.sireum.lang.ast.Exp.Super = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Exp.Super")
      }
      parser.parseObjectKey("idOpt")
      val idOpt = parser.parseOption(parse_langastId _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastTypedAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Exp.Super(idOpt, attr)
    }

    def parse_langastExpUnaryOpType(): org.sireum.lang.ast.Exp.UnaryOp.Type = {
      val r = parse_langastExpUnaryOpT(F)
      return r
    }

    def parse_langastExpUnaryOpT(typeParsed: B): org.sireum.lang.ast.Exp.UnaryOp.Type = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Exp.UnaryOp")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      org.sireum.lang.ast.Exp.UnaryOp.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for org.sireum.lang.ast.Exp.UnaryOp.")
          return org.sireum.lang.ast.Exp.UnaryOp.byOrdinal(0).get
      }
    }

    def parse_langastExpUnary(): org.sireum.lang.ast.Exp.Unary = {
      val r = parse_langastExpUnaryT(F)
      return r
    }

    def parse_langastExpUnaryT(typeParsed: B): org.sireum.lang.ast.Exp.Unary = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Exp.Unary")
      }
      parser.parseObjectKey("op")
      val op = parse_langastExpUnaryOpType()
      parser.parseObjectNext()
      parser.parseObjectKey("exp")
      val exp = parse_langastExp()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastResolvedAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Exp.Unary(op, exp, attr)
    }

    def parse_langastExpRef(): org.sireum.lang.ast.Exp.Ref = {
      val t = parser.parseObjectTypes(ISZ("org.sireum.lang.ast.Exp.Ident", "org.sireum.lang.ast.Exp.Select"))
      t.native match {
        case "org.sireum.lang.ast.Exp.Ident" => val r = parse_langastExpIdentT(T); return r
        case "org.sireum.lang.ast.Exp.Select" => val r = parse_langastExpSelectT(T); return r
        case _ => val r = parse_langastExpSelectT(T); return r
      }
    }

    def parse_langastExpBinary(): org.sireum.lang.ast.Exp.Binary = {
      val r = parse_langastExpBinaryT(F)
      return r
    }

    def parse_langastExpBinaryT(typeParsed: B): org.sireum.lang.ast.Exp.Binary = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Exp.Binary")
      }
      parser.parseObjectKey("left")
      val left = parse_langastExp()
      parser.parseObjectNext()
      parser.parseObjectKey("op")
      val op = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("right")
      val right = parse_langastExp()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastResolvedAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Exp.Binary(left, op, right, attr)
    }

    def parse_langastExpIdent(): org.sireum.lang.ast.Exp.Ident = {
      val r = parse_langastExpIdentT(F)
      return r
    }

    def parse_langastExpIdentT(typeParsed: B): org.sireum.lang.ast.Exp.Ident = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Exp.Ident")
      }
      parser.parseObjectKey("id")
      val id = parse_langastId()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastResolvedAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Exp.Ident(id, attr)
    }

    def parse_langastExpEta(): org.sireum.lang.ast.Exp.Eta = {
      val r = parse_langastExpEtaT(F)
      return r
    }

    def parse_langastExpEtaT(typeParsed: B): org.sireum.lang.ast.Exp.Eta = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Exp.Eta")
      }
      parser.parseObjectKey("ref")
      val ref = parse_langastExpRef()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastTypedAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Exp.Eta(ref, attr)
    }

    def parse_langastExpTuple(): org.sireum.lang.ast.Exp.Tuple = {
      val r = parse_langastExpTupleT(F)
      return r
    }

    def parse_langastExpTupleT(typeParsed: B): org.sireum.lang.ast.Exp.Tuple = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Exp.Tuple")
      }
      parser.parseObjectKey("args")
      val args = parser.parseISZ(parse_langastExp _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastTypedAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Exp.Tuple(args, attr)
    }

    def parse_langastExpSelect(): org.sireum.lang.ast.Exp.Select = {
      val r = parse_langastExpSelectT(F)
      return r
    }

    def parse_langastExpSelectT(typeParsed: B): org.sireum.lang.ast.Exp.Select = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Exp.Select")
      }
      parser.parseObjectKey("receiverOpt")
      val receiverOpt = parser.parseOption(parse_langastExp _)
      parser.parseObjectNext()
      parser.parseObjectKey("id")
      val id = parse_langastId()
      parser.parseObjectNext()
      parser.parseObjectKey("targs")
      val targs = parser.parseISZ(parse_langastType _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastResolvedAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Exp.Select(receiverOpt, id, targs, attr)
    }

    def parse_langastExpInvoke(): org.sireum.lang.ast.Exp.Invoke = {
      val r = parse_langastExpInvokeT(F)
      return r
    }

    def parse_langastExpInvokeT(typeParsed: B): org.sireum.lang.ast.Exp.Invoke = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Exp.Invoke")
      }
      parser.parseObjectKey("receiverOpt")
      val receiverOpt = parser.parseOption(parse_langastExp _)
      parser.parseObjectNext()
      parser.parseObjectKey("ident")
      val ident = parse_langastExpIdent()
      parser.parseObjectNext()
      parser.parseObjectKey("targs")
      val targs = parser.parseISZ(parse_langastType _)
      parser.parseObjectNext()
      parser.parseObjectKey("args")
      val args = parser.parseISZ(parse_langastExp _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastResolvedAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Exp.Invoke(receiverOpt, ident, targs, args, attr)
    }

    def parse_langastExpInvokeNamed(): org.sireum.lang.ast.Exp.InvokeNamed = {
      val r = parse_langastExpInvokeNamedT(F)
      return r
    }

    def parse_langastExpInvokeNamedT(typeParsed: B): org.sireum.lang.ast.Exp.InvokeNamed = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Exp.InvokeNamed")
      }
      parser.parseObjectKey("receiverOpt")
      val receiverOpt = parser.parseOption(parse_langastExp _)
      parser.parseObjectNext()
      parser.parseObjectKey("ident")
      val ident = parse_langastExpIdent()
      parser.parseObjectNext()
      parser.parseObjectKey("targs")
      val targs = parser.parseISZ(parse_langastType _)
      parser.parseObjectNext()
      parser.parseObjectKey("args")
      val args = parser.parseISZ(parse_langastNamedArg _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastResolvedAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Exp.InvokeNamed(receiverOpt, ident, targs, args, attr)
    }

    def parse_langastExpIf(): org.sireum.lang.ast.Exp.If = {
      val r = parse_langastExpIfT(F)
      return r
    }

    def parse_langastExpIfT(typeParsed: B): org.sireum.lang.ast.Exp.If = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Exp.If")
      }
      parser.parseObjectKey("cond")
      val cond = parse_langastExp()
      parser.parseObjectNext()
      parser.parseObjectKey("thenExp")
      val thenExp = parse_langastExp()
      parser.parseObjectNext()
      parser.parseObjectKey("elseExp")
      val elseExp = parse_langastExp()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastTypedAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Exp.If(cond, thenExp, elseExp, attr)
    }

    def parse_langastExpTypeCond(): org.sireum.lang.ast.Exp.TypeCond = {
      val r = parse_langastExpTypeCondT(F)
      return r
    }

    def parse_langastExpTypeCondT(typeParsed: B): org.sireum.lang.ast.Exp.TypeCond = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Exp.TypeCond")
      }
      parser.parseObjectKey("args")
      val args = parser.parseISZ(parse_langastExp _)
      parser.parseObjectNext()
      parser.parseObjectKey("fun")
      val fun = parse_langastExpFun()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Exp.TypeCond(args, fun, attr)
    }

    def parse_langastExpSym(): org.sireum.lang.ast.Exp.Sym = {
      val r = parse_langastExpSymT(F)
      return r
    }

    def parse_langastExpSymT(typeParsed: B): org.sireum.lang.ast.Exp.Sym = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Exp.Sym")
      }
      parser.parseObjectKey("num")
      val num = parser.parseZ()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastTypedAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Exp.Sym(num, attr)
    }

    def parse_langastExpFunParam(): org.sireum.lang.ast.Exp.Fun.Param = {
      val r = parse_langastExpFunParamT(F)
      return r
    }

    def parse_langastExpFunParamT(typeParsed: B): org.sireum.lang.ast.Exp.Fun.Param = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Exp.Fun.Param")
      }
      parser.parseObjectKey("idOpt")
      val idOpt = parser.parseOption(parse_langastId _)
      parser.parseObjectNext()
      parser.parseObjectKey("tipeOpt")
      val tipeOpt = parser.parseOption(parse_langastType _)
      parser.parseObjectNext()
      parser.parseObjectKey("typedOpt")
      val typedOpt = parser.parseOption(parse_langastTyped _)
      parser.parseObjectNext()
      return org.sireum.lang.ast.Exp.Fun.Param(idOpt, tipeOpt, typedOpt)
    }

    def parse_langastExpFun(): org.sireum.lang.ast.Exp.Fun = {
      val r = parse_langastExpFunT(F)
      return r
    }

    def parse_langastExpFunT(typeParsed: B): org.sireum.lang.ast.Exp.Fun = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Exp.Fun")
      }
      parser.parseObjectKey("context")
      val context = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      parser.parseObjectKey("params")
      val params = parser.parseISZ(parse_langastExpFunParam _)
      parser.parseObjectNext()
      parser.parseObjectKey("exp")
      val exp = parse_langastAssignExp()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastTypedAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Exp.Fun(context, params, exp, attr)
    }

    def parse_langastExpForYield(): org.sireum.lang.ast.Exp.ForYield = {
      val r = parse_langastExpForYieldT(F)
      return r
    }

    def parse_langastExpForYieldT(typeParsed: B): org.sireum.lang.ast.Exp.ForYield = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Exp.ForYield")
      }
      parser.parseObjectKey("enumGens")
      val enumGens = parser.parseISZ(parse_langastEnumGenFor _)
      parser.parseObjectNext()
      parser.parseObjectKey("exp")
      val exp = parse_langastExp()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastTypedAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Exp.ForYield(enumGens, exp, attr)
    }

    def parse_langastExpQuant(): org.sireum.lang.ast.Exp.Quant = {
      val t = parser.parseObjectTypes(ISZ("org.sireum.lang.ast.Exp.QuantType", "org.sireum.lang.ast.Exp.QuantRange", "org.sireum.lang.ast.Exp.QuantEach"))
      t.native match {
        case "org.sireum.lang.ast.Exp.QuantType" => val r = parse_langastExpQuantTypeT(T); return r
        case "org.sireum.lang.ast.Exp.QuantRange" => val r = parse_langastExpQuantRangeT(T); return r
        case "org.sireum.lang.ast.Exp.QuantEach" => val r = parse_langastExpQuantEachT(T); return r
        case _ => val r = parse_langastExpQuantEachT(T); return r
      }
    }

    def parse_langastExpQuantType(): org.sireum.lang.ast.Exp.QuantType = {
      val r = parse_langastExpQuantTypeT(F)
      return r
    }

    def parse_langastExpQuantTypeT(typeParsed: B): org.sireum.lang.ast.Exp.QuantType = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Exp.QuantType")
      }
      parser.parseObjectKey("isForall")
      val isForall = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("fun")
      val fun = parse_langastExpFun()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Exp.QuantType(isForall, fun, attr)
    }

    def parse_langastExpQuantRange(): org.sireum.lang.ast.Exp.QuantRange = {
      val r = parse_langastExpQuantRangeT(F)
      return r
    }

    def parse_langastExpQuantRangeT(typeParsed: B): org.sireum.lang.ast.Exp.QuantRange = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Exp.QuantRange")
      }
      parser.parseObjectKey("isForall")
      val isForall = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("lo")
      val lo = parse_langastExp()
      parser.parseObjectNext()
      parser.parseObjectKey("hi")
      val hi = parse_langastExp()
      parser.parseObjectNext()
      parser.parseObjectKey("hiExact")
      val hiExact = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("fun")
      val fun = parse_langastExpFun()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastResolvedAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Exp.QuantRange(isForall, lo, hi, hiExact, fun, attr)
    }

    def parse_langastExpQuantEach(): org.sireum.lang.ast.Exp.QuantEach = {
      val r = parse_langastExpQuantEachT(F)
      return r
    }

    def parse_langastExpQuantEachT(typeParsed: B): org.sireum.lang.ast.Exp.QuantEach = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Exp.QuantEach")
      }
      parser.parseObjectKey("isForall")
      val isForall = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("seq")
      val seq = parse_langastExp()
      parser.parseObjectNext()
      parser.parseObjectKey("fun")
      val fun = parse_langastExpFun()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastResolvedAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Exp.QuantEach(isForall, seq, fun, attr)
    }

    def parse_langastExpInput(): org.sireum.lang.ast.Exp.Input = {
      val r = parse_langastExpInputT(F)
      return r
    }

    def parse_langastExpInputT(typeParsed: B): org.sireum.lang.ast.Exp.Input = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Exp.Input")
      }
      parser.parseObjectKey("exp")
      val exp = parse_langastExp()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Exp.Input(exp, attr)
    }

    def parse_langastExpOld(): org.sireum.lang.ast.Exp.Old = {
      val r = parse_langastExpOldT(F)
      return r
    }

    def parse_langastExpOldT(typeParsed: B): org.sireum.lang.ast.Exp.Old = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Exp.Old")
      }
      parser.parseObjectKey("exp")
      val exp = parse_langastExp()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Exp.Old(exp, attr)
    }

    def parse_langastExpAt(): org.sireum.lang.ast.Exp.At = {
      val r = parse_langastExpAtT(F)
      return r
    }

    def parse_langastExpAtT(typeParsed: B): org.sireum.lang.ast.Exp.At = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Exp.At")
      }
      parser.parseObjectKey("tipeOpt")
      val tipeOpt = parser.parseOption(parse_langastType _)
      parser.parseObjectNext()
      parser.parseObjectKey("exp")
      val exp = parse_langastExp()
      parser.parseObjectNext()
      parser.parseObjectKey("num")
      val num = parse_langastExpLitZ()
      parser.parseObjectNext()
      parser.parseObjectKey("linesFresh")
      val linesFresh = parser.parseISZ(parse_langastExpLitZ _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Exp.At(tipeOpt, exp, num, linesFresh, attr)
    }

    def parse_langastExpLoopIndex(): org.sireum.lang.ast.Exp.LoopIndex = {
      val r = parse_langastExpLoopIndexT(F)
      return r
    }

    def parse_langastExpLoopIndexT(typeParsed: B): org.sireum.lang.ast.Exp.LoopIndex = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Exp.LoopIndex")
      }
      parser.parseObjectKey("tipeOpt")
      val tipeOpt = parser.parseOption(parse_langastType _)
      parser.parseObjectNext()
      parser.parseObjectKey("exp")
      val exp = parse_langastExpIdent()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastTypedAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Exp.LoopIndex(tipeOpt, exp, attr)
    }

    def parse_langastExpStateSeq(): org.sireum.lang.ast.Exp.StateSeq = {
      val r = parse_langastExpStateSeqT(F)
      return r
    }

    def parse_langastExpStateSeqT(typeParsed: B): org.sireum.lang.ast.Exp.StateSeq = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Exp.StateSeq")
      }
      parser.parseObjectKey("id")
      val id = parse_langastId()
      parser.parseObjectNext()
      parser.parseObjectKey("fragments")
      val fragments = parser.parseISZ(parse_langastExpStateSeqFragment _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Exp.StateSeq(id, fragments, attr)
    }

    def parse_langastExpStateSeqFragment(): org.sireum.lang.ast.Exp.StateSeq.Fragment = {
      val r = parse_langastExpStateSeqFragmentT(F)
      return r
    }

    def parse_langastExpStateSeqFragmentT(typeParsed: B): org.sireum.lang.ast.Exp.StateSeq.Fragment = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Exp.StateSeq.Fragment")
      }
      parser.parseObjectKey("id")
      val id = parse_langastId()
      parser.parseObjectNext()
      parser.parseObjectKey("exp")
      val exp = parse_langastExp()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Exp.StateSeq.Fragment(id, exp)
    }

    def parse_langastExpResult(): org.sireum.lang.ast.Exp.Result = {
      val r = parse_langastExpResultT(F)
      return r
    }

    def parse_langastExpResultT(typeParsed: B): org.sireum.lang.ast.Exp.Result = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Exp.Result")
      }
      parser.parseObjectKey("tipeOpt")
      val tipeOpt = parser.parseOption(parse_langastType _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastTypedAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Exp.Result(tipeOpt, attr)
    }

    def parse_langastExpStrictPureBlock(): org.sireum.lang.ast.Exp.StrictPureBlock = {
      val r = parse_langastExpStrictPureBlockT(F)
      return r
    }

    def parse_langastExpStrictPureBlockT(typeParsed: B): org.sireum.lang.ast.Exp.StrictPureBlock = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Exp.StrictPureBlock")
      }
      parser.parseObjectKey("block")
      val block = parse_langastStmtBlock()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastTypedAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Exp.StrictPureBlock(block, attr)
    }

    def parse_langastExpLabeled(): org.sireum.lang.ast.Exp.Labeled = {
      val r = parse_langastExpLabeledT(F)
      return r
    }

    def parse_langastExpLabeledT(typeParsed: B): org.sireum.lang.ast.Exp.Labeled = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Exp.Labeled")
      }
      parser.parseObjectKey("numOpt")
      val numOpt = parser.parseOption(parse_langastExpLitZ _)
      parser.parseObjectNext()
      parser.parseObjectKey("exp")
      val exp = parse_langastExp()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Exp.Labeled(numOpt, exp, attr)
    }

    def parse_langastExpAssumeAgree(): org.sireum.lang.ast.Exp.AssumeAgree = {
      val r = parse_langastExpAssumeAgreeT(F)
      return r
    }

    def parse_langastExpAssumeAgreeT(typeParsed: B): org.sireum.lang.ast.Exp.AssumeAgree = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Exp.AssumeAgree")
      }
      parser.parseObjectKey("channel")
      val channel = parse_langastExpLitString()
      parser.parseObjectNext()
      parser.parseObjectKey("requiresClause")
      val requiresClause = parse_langastMethodContractClaims()
      parser.parseObjectNext()
      parser.parseObjectKey("inAgreeClause")
      val inAgreeClause = parse_langastMethodContractClaims()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Exp.AssumeAgree(channel, requiresClause, inAgreeClause, attr)
    }

    def parse_langastExpAssertAgree(): org.sireum.lang.ast.Exp.AssertAgree = {
      val r = parse_langastExpAssertAgreeT(F)
      return r
    }

    def parse_langastExpAssertAgreeT(typeParsed: B): org.sireum.lang.ast.Exp.AssertAgree = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Exp.AssertAgree")
      }
      parser.parseObjectKey("channel")
      val channel = parse_langastExpLitString()
      parser.parseObjectNext()
      parser.parseObjectKey("outAgreeClause")
      val outAgreeClause = parse_langastMethodContractClaims()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Exp.AssertAgree(channel, outAgreeClause, attr)
    }

    def parse_langastExpInfoFlowInvariant(): org.sireum.lang.ast.Exp.InfoFlowInvariant = {
      val r = parse_langastExpInfoFlowInvariantT(F)
      return r
    }

    def parse_langastExpInfoFlowInvariantT(typeParsed: B): org.sireum.lang.ast.Exp.InfoFlowInvariant = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Exp.InfoFlowInvariant")
      }
      parser.parseObjectKey("flowInvariants")
      val flowInvariants = parser.parseISZ(parse_langastMethodContractInfoFlowCase _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Exp.InfoFlowInvariant(flowInvariants, attr)
    }

    def parse_langastNamedArg(): org.sireum.lang.ast.NamedArg = {
      val r = parse_langastNamedArgT(F)
      return r
    }

    def parse_langastNamedArgT(typeParsed: B): org.sireum.lang.ast.NamedArg = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.NamedArg")
      }
      parser.parseObjectKey("id")
      val id = parse_langastId()
      parser.parseObjectNext()
      parser.parseObjectKey("arg")
      val arg = parse_langastExp()
      parser.parseObjectNext()
      parser.parseObjectKey("index")
      val index = parser.parseZ()
      parser.parseObjectNext()
      return org.sireum.lang.ast.NamedArg(id, arg, index)
    }

    def parse_langastId(): org.sireum.lang.ast.Id = {
      val r = parse_langastIdT(F)
      return r
    }

    def parse_langastIdT(typeParsed: B): org.sireum.lang.ast.Id = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Id")
      }
      parser.parseObjectKey("value")
      val value = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Id(value, attr)
    }

    def parse_langastName(): org.sireum.lang.ast.Name = {
      val r = parse_langastNameT(F)
      return r
    }

    def parse_langastNameT(typeParsed: B): org.sireum.lang.ast.Name = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Name")
      }
      parser.parseObjectKey("ids")
      val ids = parser.parseISZ(parse_langastId _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Name(ids, attr)
    }

    def parse_langastBody(): org.sireum.lang.ast.Body = {
      val r = parse_langastBodyT(F)
      return r
    }

    def parse_langastBodyT(typeParsed: B): org.sireum.lang.ast.Body = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Body")
      }
      parser.parseObjectKey("stmts")
      val stmts = parser.parseISZ(parse_langastStmt _)
      parser.parseObjectNext()
      parser.parseObjectKey("undecls")
      val undecls = parser.parseISZ(parse_langastResolvedInfoLocalVar _)
      parser.parseObjectNext()
      return org.sireum.lang.ast.Body(stmts, undecls)
    }

    def parse_langastAdtParam(): org.sireum.lang.ast.AdtParam = {
      val r = parse_langastAdtParamT(F)
      return r
    }

    def parse_langastAdtParamT(typeParsed: B): org.sireum.lang.ast.AdtParam = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.AdtParam")
      }
      parser.parseObjectKey("isHidden")
      val isHidden = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("isVal")
      val isVal = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("id")
      val id = parse_langastId()
      parser.parseObjectNext()
      parser.parseObjectKey("tipe")
      val tipe = parse_langastType()
      parser.parseObjectNext()
      return org.sireum.lang.ast.AdtParam(isHidden, isVal, id, tipe)
    }

    def parse_langastMethodSig(): org.sireum.lang.ast.MethodSig = {
      val r = parse_langastMethodSigT(F)
      return r
    }

    def parse_langastMethodSigT(typeParsed: B): org.sireum.lang.ast.MethodSig = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.MethodSig")
      }
      parser.parseObjectKey("isPure")
      val isPure = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("id")
      val id = parse_langastId()
      parser.parseObjectNext()
      parser.parseObjectKey("typeParams")
      val typeParams = parser.parseISZ(parse_langastTypeParam _)
      parser.parseObjectNext()
      parser.parseObjectKey("hasParams")
      val hasParams = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("params")
      val params = parser.parseISZ(parse_langastParam _)
      parser.parseObjectNext()
      parser.parseObjectKey("returnType")
      val returnType = parse_langastType()
      parser.parseObjectNext()
      return org.sireum.lang.ast.MethodSig(isPure, id, typeParams, hasParams, params, returnType)
    }

    def parse_langastParam(): org.sireum.lang.ast.Param = {
      val r = parse_langastParamT(F)
      return r
    }

    def parse_langastParamT(typeParsed: B): org.sireum.lang.ast.Param = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Param")
      }
      parser.parseObjectKey("isHidden")
      val isHidden = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("id")
      val id = parse_langastId()
      parser.parseObjectNext()
      parser.parseObjectKey("tipe")
      val tipe = parse_langastType()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Param(isHidden, id, tipe)
    }

    def parse_langastTypeParam(): org.sireum.lang.ast.TypeParam = {
      val r = parse_langastTypeParamT(F)
      return r
    }

    def parse_langastTypeParamT(typeParsed: B): org.sireum.lang.ast.TypeParam = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.TypeParam")
      }
      parser.parseObjectKey("id")
      val id = parse_langastId()
      parser.parseObjectNext()
      parser.parseObjectKey("kind")
      val kind = parse_langastTypedVarKindType()
      parser.parseObjectNext()
      return org.sireum.lang.ast.TypeParam(id, kind)
    }

    def parse_langastAttr(): org.sireum.lang.ast.Attr = {
      val r = parse_langastAttrT(F)
      return r
    }

    def parse_langastAttrT(typeParsed: B): org.sireum.lang.ast.Attr = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Attr")
      }
      parser.parseObjectKey("posOpt")
      val posOpt = parser.parseOption(parser.parsePosition _)
      parser.parseObjectNext()
      return org.sireum.lang.ast.Attr(posOpt)
    }

    def parse_langastTypedAttr(): org.sireum.lang.ast.TypedAttr = {
      val r = parse_langastTypedAttrT(F)
      return r
    }

    def parse_langastTypedAttrT(typeParsed: B): org.sireum.lang.ast.TypedAttr = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.TypedAttr")
      }
      parser.parseObjectKey("posOpt")
      val posOpt = parser.parseOption(parser.parsePosition _)
      parser.parseObjectNext()
      parser.parseObjectKey("typedOpt")
      val typedOpt = parser.parseOption(parse_langastTyped _)
      parser.parseObjectNext()
      return org.sireum.lang.ast.TypedAttr(posOpt, typedOpt)
    }

    def parse_langastResolvedAttr(): org.sireum.lang.ast.ResolvedAttr = {
      val r = parse_langastResolvedAttrT(F)
      return r
    }

    def parse_langastResolvedAttrT(typeParsed: B): org.sireum.lang.ast.ResolvedAttr = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.ResolvedAttr")
      }
      parser.parseObjectKey("posOpt")
      val posOpt = parser.parseOption(parser.parsePosition _)
      parser.parseObjectNext()
      parser.parseObjectKey("resOpt")
      val resOpt = parser.parseOption(parse_langastResolvedInfo _)
      parser.parseObjectNext()
      parser.parseObjectKey("typedOpt")
      val typedOpt = parser.parseOption(parse_langastTyped _)
      parser.parseObjectNext()
      return org.sireum.lang.ast.ResolvedAttr(posOpt, resOpt, typedOpt)
    }

    def parse_langastResolvedInfo(): org.sireum.lang.ast.ResolvedInfo = {
      val t = parser.parseObjectTypes(ISZ("org.sireum.lang.ast.ResolvedInfo.BuiltIn", "org.sireum.lang.ast.ResolvedInfo.Package", "org.sireum.lang.ast.ResolvedInfo.Enum", "org.sireum.lang.ast.ResolvedInfo.EnumElement", "org.sireum.lang.ast.ResolvedInfo.Object", "org.sireum.lang.ast.ResolvedInfo.Var", "org.sireum.lang.ast.ResolvedInfo.Method", "org.sireum.lang.ast.ResolvedInfo.Methods", "org.sireum.lang.ast.ResolvedInfo.Tuple", "org.sireum.lang.ast.ResolvedInfo.LocalVar", "org.sireum.lang.ast.ResolvedInfo.Fact", "org.sireum.lang.ast.ResolvedInfo.Theorem", "org.sireum.lang.ast.ResolvedInfo.Inv"))
      t.native match {
        case "org.sireum.lang.ast.ResolvedInfo.BuiltIn" => val r = parse_langastResolvedInfoBuiltInT(T); return r
        case "org.sireum.lang.ast.ResolvedInfo.Package" => val r = parse_langastResolvedInfoPackageT(T); return r
        case "org.sireum.lang.ast.ResolvedInfo.Enum" => val r = parse_langastResolvedInfoEnumT(T); return r
        case "org.sireum.lang.ast.ResolvedInfo.EnumElement" => val r = parse_langastResolvedInfoEnumElementT(T); return r
        case "org.sireum.lang.ast.ResolvedInfo.Object" => val r = parse_langastResolvedInfoObjectT(T); return r
        case "org.sireum.lang.ast.ResolvedInfo.Var" => val r = parse_langastResolvedInfoVarT(T); return r
        case "org.sireum.lang.ast.ResolvedInfo.Method" => val r = parse_langastResolvedInfoMethodT(T); return r
        case "org.sireum.lang.ast.ResolvedInfo.Methods" => val r = parse_langastResolvedInfoMethodsT(T); return r
        case "org.sireum.lang.ast.ResolvedInfo.Tuple" => val r = parse_langastResolvedInfoTupleT(T); return r
        case "org.sireum.lang.ast.ResolvedInfo.LocalVar" => val r = parse_langastResolvedInfoLocalVarT(T); return r
        case "org.sireum.lang.ast.ResolvedInfo.Fact" => val r = parse_langastResolvedInfoFactT(T); return r
        case "org.sireum.lang.ast.ResolvedInfo.Theorem" => val r = parse_langastResolvedInfoTheoremT(T); return r
        case "org.sireum.lang.ast.ResolvedInfo.Inv" => val r = parse_langastResolvedInfoInvT(T); return r
        case _ => val r = parse_langastResolvedInfoInvT(T); return r
      }
    }

    def parse_langastResolvedInfoBuiltInKindType(): org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.Type = {
      val r = parse_langastResolvedInfoBuiltInKindT(F)
      return r
    }

    def parse_langastResolvedInfoBuiltInKindT(typeParsed: B): org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.")
          return org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.byOrdinal(0).get
      }
    }

    def parse_langastResolvedInfoBuiltIn(): org.sireum.lang.ast.ResolvedInfo.BuiltIn = {
      val r = parse_langastResolvedInfoBuiltInT(F)
      return r
    }

    def parse_langastResolvedInfoBuiltInT(typeParsed: B): org.sireum.lang.ast.ResolvedInfo.BuiltIn = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.ResolvedInfo.BuiltIn")
      }
      parser.parseObjectKey("kind")
      val kind = parse_langastResolvedInfoBuiltInKindType()
      parser.parseObjectNext()
      return org.sireum.lang.ast.ResolvedInfo.BuiltIn(kind)
    }

    def parse_langastResolvedInfoPackage(): org.sireum.lang.ast.ResolvedInfo.Package = {
      val r = parse_langastResolvedInfoPackageT(F)
      return r
    }

    def parse_langastResolvedInfoPackageT(typeParsed: B): org.sireum.lang.ast.ResolvedInfo.Package = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.ResolvedInfo.Package")
      }
      parser.parseObjectKey("name")
      val name = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      return org.sireum.lang.ast.ResolvedInfo.Package(name)
    }

    def parse_langastResolvedInfoEnum(): org.sireum.lang.ast.ResolvedInfo.Enum = {
      val r = parse_langastResolvedInfoEnumT(F)
      return r
    }

    def parse_langastResolvedInfoEnumT(typeParsed: B): org.sireum.lang.ast.ResolvedInfo.Enum = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.ResolvedInfo.Enum")
      }
      parser.parseObjectKey("name")
      val name = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      return org.sireum.lang.ast.ResolvedInfo.Enum(name)
    }

    def parse_langastResolvedInfoEnumElement(): org.sireum.lang.ast.ResolvedInfo.EnumElement = {
      val r = parse_langastResolvedInfoEnumElementT(F)
      return r
    }

    def parse_langastResolvedInfoEnumElementT(typeParsed: B): org.sireum.lang.ast.ResolvedInfo.EnumElement = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.ResolvedInfo.EnumElement")
      }
      parser.parseObjectKey("owner")
      val owner = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      parser.parseObjectKey("name")
      val name = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("ordinal")
      val ordinal = parser.parseZ()
      parser.parseObjectNext()
      return org.sireum.lang.ast.ResolvedInfo.EnumElement(owner, name, ordinal)
    }

    def parse_langastResolvedInfoObject(): org.sireum.lang.ast.ResolvedInfo.Object = {
      val r = parse_langastResolvedInfoObjectT(F)
      return r
    }

    def parse_langastResolvedInfoObjectT(typeParsed: B): org.sireum.lang.ast.ResolvedInfo.Object = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.ResolvedInfo.Object")
      }
      parser.parseObjectKey("name")
      val name = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      return org.sireum.lang.ast.ResolvedInfo.Object(name)
    }

    def parse_langastResolvedInfoVar(): org.sireum.lang.ast.ResolvedInfo.Var = {
      val r = parse_langastResolvedInfoVarT(F)
      return r
    }

    def parse_langastResolvedInfoVarT(typeParsed: B): org.sireum.lang.ast.ResolvedInfo.Var = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.ResolvedInfo.Var")
      }
      parser.parseObjectKey("isInObject")
      val isInObject = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("isSpec")
      val isSpec = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("isVal")
      val isVal = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("owner")
      val owner = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      parser.parseObjectKey("id")
      val id = parser.parseString()
      parser.parseObjectNext()
      return org.sireum.lang.ast.ResolvedInfo.Var(isInObject, isSpec, isVal, owner, id)
    }

    def parse_langastResolvedInfoMethod(): org.sireum.lang.ast.ResolvedInfo.Method = {
      val r = parse_langastResolvedInfoMethodT(F)
      return r
    }

    def parse_langastResolvedInfoMethodT(typeParsed: B): org.sireum.lang.ast.ResolvedInfo.Method = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.ResolvedInfo.Method")
      }
      parser.parseObjectKey("isInObject")
      val isInObject = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("mode")
      val mode = parse_langastMethodModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("typeParams")
      val typeParams = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      parser.parseObjectKey("owner")
      val owner = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      parser.parseObjectKey("id")
      val id = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("paramNames")
      val paramNames = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      parser.parseObjectKey("tpeOpt")
      val tpeOpt = parser.parseOption(parse_langastTypedFun _)
      parser.parseObjectNext()
      parser.parseObjectKey("reads")
      val reads = parser.parseISZ(parse_langastResolvedInfo _)
      parser.parseObjectNext()
      parser.parseObjectKey("writes")
      val writes = parser.parseISZ(parse_langastResolvedInfo _)
      parser.parseObjectNext()
      return org.sireum.lang.ast.ResolvedInfo.Method(isInObject, mode, typeParams, owner, id, paramNames, tpeOpt, reads, writes)
    }

    def parse_langastResolvedInfoMethods(): org.sireum.lang.ast.ResolvedInfo.Methods = {
      val r = parse_langastResolvedInfoMethodsT(F)
      return r
    }

    def parse_langastResolvedInfoMethodsT(typeParsed: B): org.sireum.lang.ast.ResolvedInfo.Methods = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.ResolvedInfo.Methods")
      }
      parser.parseObjectKey("methods")
      val methods = parser.parseISZ(parse_langastResolvedInfoMethod _)
      parser.parseObjectNext()
      return org.sireum.lang.ast.ResolvedInfo.Methods(methods)
    }

    def parse_langastResolvedInfoTuple(): org.sireum.lang.ast.ResolvedInfo.Tuple = {
      val r = parse_langastResolvedInfoTupleT(F)
      return r
    }

    def parse_langastResolvedInfoTupleT(typeParsed: B): org.sireum.lang.ast.ResolvedInfo.Tuple = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.ResolvedInfo.Tuple")
      }
      parser.parseObjectKey("size")
      val size = parser.parseZ()
      parser.parseObjectNext()
      parser.parseObjectKey("index")
      val index = parser.parseZ()
      parser.parseObjectNext()
      return org.sireum.lang.ast.ResolvedInfo.Tuple(size, index)
    }

    def parse_langastResolvedInfoLocalVarScopeType(): org.sireum.lang.ast.ResolvedInfo.LocalVar.Scope.Type = {
      val r = parse_langastResolvedInfoLocalVarScopeT(F)
      return r
    }

    def parse_langastResolvedInfoLocalVarScopeT(typeParsed: B): org.sireum.lang.ast.ResolvedInfo.LocalVar.Scope.Type = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.ResolvedInfo.LocalVar.Scope")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      org.sireum.lang.ast.ResolvedInfo.LocalVar.Scope.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for org.sireum.lang.ast.ResolvedInfo.LocalVar.Scope.")
          return org.sireum.lang.ast.ResolvedInfo.LocalVar.Scope.byOrdinal(0).get
      }
    }

    def parse_langastResolvedInfoLocalVar(): org.sireum.lang.ast.ResolvedInfo.LocalVar = {
      val r = parse_langastResolvedInfoLocalVarT(F)
      return r
    }

    def parse_langastResolvedInfoLocalVarT(typeParsed: B): org.sireum.lang.ast.ResolvedInfo.LocalVar = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.ResolvedInfo.LocalVar")
      }
      parser.parseObjectKey("context")
      val context = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      parser.parseObjectKey("scope")
      val scope = parse_langastResolvedInfoLocalVarScopeType()
      parser.parseObjectNext()
      parser.parseObjectKey("isSpec")
      val isSpec = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("isVal")
      val isVal = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("id")
      val id = parser.parseString()
      parser.parseObjectNext()
      return org.sireum.lang.ast.ResolvedInfo.LocalVar(context, scope, isSpec, isVal, id)
    }

    def parse_langastResolvedInfoFact(): org.sireum.lang.ast.ResolvedInfo.Fact = {
      val r = parse_langastResolvedInfoFactT(F)
      return r
    }

    def parse_langastResolvedInfoFactT(typeParsed: B): org.sireum.lang.ast.ResolvedInfo.Fact = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.ResolvedInfo.Fact")
      }
      parser.parseObjectKey("name")
      val name = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      return org.sireum.lang.ast.ResolvedInfo.Fact(name)
    }

    def parse_langastResolvedInfoTheorem(): org.sireum.lang.ast.ResolvedInfo.Theorem = {
      val r = parse_langastResolvedInfoTheoremT(F)
      return r
    }

    def parse_langastResolvedInfoTheoremT(typeParsed: B): org.sireum.lang.ast.ResolvedInfo.Theorem = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.ResolvedInfo.Theorem")
      }
      parser.parseObjectKey("name")
      val name = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      return org.sireum.lang.ast.ResolvedInfo.Theorem(name)
    }

    def parse_langastResolvedInfoInv(): org.sireum.lang.ast.ResolvedInfo.Inv = {
      val r = parse_langastResolvedInfoInvT(F)
      return r
    }

    def parse_langastResolvedInfoInvT(typeParsed: B): org.sireum.lang.ast.ResolvedInfo.Inv = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.ResolvedInfo.Inv")
      }
      parser.parseObjectKey("isInObject")
      val isInObject = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("owner")
      val owner = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      parser.parseObjectKey("id")
      val id = parser.parseString()
      parser.parseObjectNext()
      return org.sireum.lang.ast.ResolvedInfo.Inv(isInObject, owner, id)
    }

    def parse_langastTruthTableRow(): org.sireum.lang.ast.TruthTable.Row = {
      val r = parse_langastTruthTableRowT(F)
      return r
    }

    def parse_langastTruthTableRowT(typeParsed: B): org.sireum.lang.ast.TruthTable.Row = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.TruthTable.Row")
      }
      parser.parseObjectKey("assignment")
      val assignment = parse_langastTruthTableAssignment()
      parser.parseObjectNext()
      parser.parseObjectKey("separator")
      val separator = parser.parsePosition()
      parser.parseObjectNext()
      parser.parseObjectKey("values")
      val values = parse_langastTruthTableAssignment()
      parser.parseObjectNext()
      return org.sireum.lang.ast.TruthTable.Row(assignment, separator, values)
    }

    def parse_langastTruthTableAssignment(): org.sireum.lang.ast.TruthTable.Assignment = {
      val r = parse_langastTruthTableAssignmentT(F)
      return r
    }

    def parse_langastTruthTableAssignmentT(typeParsed: B): org.sireum.lang.ast.TruthTable.Assignment = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.TruthTable.Assignment")
      }
      parser.parseObjectKey("values")
      val values = parser.parseISZ(parse_langastExpLitB _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.TruthTable.Assignment(values, attr)
    }

    def parse_langastTruthTableConclusion(): org.sireum.lang.ast.TruthTable.Conclusion = {
      val t = parser.parseObjectTypes(ISZ("org.sireum.lang.ast.TruthTable.Conclusion.Validity", "org.sireum.lang.ast.TruthTable.Conclusion.Tautology", "org.sireum.lang.ast.TruthTable.Conclusion.Contradictory", "org.sireum.lang.ast.TruthTable.Conclusion.Contingent"))
      t.native match {
        case "org.sireum.lang.ast.TruthTable.Conclusion.Validity" => val r = parse_langastTruthTableConclusionValidityT(T); return r
        case "org.sireum.lang.ast.TruthTable.Conclusion.Tautology" => val r = parse_langastTruthTableConclusionTautologyT(T); return r
        case "org.sireum.lang.ast.TruthTable.Conclusion.Contradictory" => val r = parse_langastTruthTableConclusionContradictoryT(T); return r
        case "org.sireum.lang.ast.TruthTable.Conclusion.Contingent" => val r = parse_langastTruthTableConclusionContingentT(T); return r
        case _ => val r = parse_langastTruthTableConclusionContingentT(T); return r
      }
    }

    def parse_langastTruthTableConclusionValidity(): org.sireum.lang.ast.TruthTable.Conclusion.Validity = {
      val r = parse_langastTruthTableConclusionValidityT(F)
      return r
    }

    def parse_langastTruthTableConclusionValidityT(typeParsed: B): org.sireum.lang.ast.TruthTable.Conclusion.Validity = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.TruthTable.Conclusion.Validity")
      }
      parser.parseObjectKey("isValid")
      val isValid = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("assignments")
      val assignments = parser.parseISZ(parse_langastTruthTableAssignment _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.TruthTable.Conclusion.Validity(isValid, assignments, attr)
    }

    def parse_langastTruthTableConclusionTautology(): org.sireum.lang.ast.TruthTable.Conclusion.Tautology = {
      val r = parse_langastTruthTableConclusionTautologyT(F)
      return r
    }

    def parse_langastTruthTableConclusionTautologyT(typeParsed: B): org.sireum.lang.ast.TruthTable.Conclusion.Tautology = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.TruthTable.Conclusion.Tautology")
      }
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.TruthTable.Conclusion.Tautology(attr)
    }

    def parse_langastTruthTableConclusionContradictory(): org.sireum.lang.ast.TruthTable.Conclusion.Contradictory = {
      val r = parse_langastTruthTableConclusionContradictoryT(F)
      return r
    }

    def parse_langastTruthTableConclusionContradictoryT(typeParsed: B): org.sireum.lang.ast.TruthTable.Conclusion.Contradictory = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.TruthTable.Conclusion.Contradictory")
      }
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.TruthTable.Conclusion.Contradictory(attr)
    }

    def parse_langastTruthTableConclusionContingent(): org.sireum.lang.ast.TruthTable.Conclusion.Contingent = {
      val r = parse_langastTruthTableConclusionContingentT(F)
      return r
    }

    def parse_langastTruthTableConclusionContingentT(typeParsed: B): org.sireum.lang.ast.TruthTable.Conclusion.Contingent = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.TruthTable.Conclusion.Contingent")
      }
      parser.parseObjectKey("trueAssignments")
      val trueAssignments = parser.parseISZ(parse_langastTruthTableAssignment _)
      parser.parseObjectNext()
      parser.parseObjectKey("falseAssignments")
      val falseAssignments = parser.parseISZ(parse_langastTruthTableAssignment _)
      parser.parseObjectNext()
      parser.parseObjectKey("attr")
      val attr = parse_langastAttr()
      parser.parseObjectNext()
      return org.sireum.lang.ast.TruthTable.Conclusion.Contingent(trueAssignments, falseAssignments, attr)
    }

    def parse_langastMethodModeType(): org.sireum.lang.ast.MethodMode.Type = {
      val r = parse_langastMethodModeT(F)
      return r
    }

    def parse_langastMethodModeT(typeParsed: B): org.sireum.lang.ast.MethodMode.Type = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.MethodMode")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      org.sireum.lang.ast.MethodMode.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for org.sireum.lang.ast.MethodMode.")
          return org.sireum.lang.ast.MethodMode.byOrdinal(0).get
      }
    }

    def parse_langastTyped(): org.sireum.lang.ast.Typed = {
      val t = parser.parseObjectTypes(ISZ("org.sireum.lang.ast.Typed.Name", "org.sireum.lang.ast.Typed.Tuple", "org.sireum.lang.ast.Typed.Fun", "org.sireum.lang.ast.Typed.TypeVar", "org.sireum.lang.ast.Typed.Package", "org.sireum.lang.ast.Typed.Object", "org.sireum.lang.ast.Typed.Enum", "org.sireum.lang.ast.Typed.Method", "org.sireum.lang.ast.Typed.Methods", "org.sireum.lang.ast.Typed.Fact", "org.sireum.lang.ast.Typed.Theorem", "org.sireum.lang.ast.Typed.Inv"))
      t.native match {
        case "org.sireum.lang.ast.Typed.Name" => val r = parse_langastTypedNameT(T); return r
        case "org.sireum.lang.ast.Typed.Tuple" => val r = parse_langastTypedTupleT(T); return r
        case "org.sireum.lang.ast.Typed.Fun" => val r = parse_langastTypedFunT(T); return r
        case "org.sireum.lang.ast.Typed.TypeVar" => val r = parse_langastTypedTypeVarT(T); return r
        case "org.sireum.lang.ast.Typed.Package" => val r = parse_langastTypedPackageT(T); return r
        case "org.sireum.lang.ast.Typed.Object" => val r = parse_langastTypedObjectT(T); return r
        case "org.sireum.lang.ast.Typed.Enum" => val r = parse_langastTypedEnumT(T); return r
        case "org.sireum.lang.ast.Typed.Method" => val r = parse_langastTypedMethodT(T); return r
        case "org.sireum.lang.ast.Typed.Methods" => val r = parse_langastTypedMethodsT(T); return r
        case "org.sireum.lang.ast.Typed.Fact" => val r = parse_langastTypedFactT(T); return r
        case "org.sireum.lang.ast.Typed.Theorem" => val r = parse_langastTypedTheoremT(T); return r
        case "org.sireum.lang.ast.Typed.Inv" => val r = parse_langastTypedInvT(T); return r
        case _ => val r = parse_langastTypedInvT(T); return r
      }
    }

    def parse_langastTypedVarKindType(): org.sireum.lang.ast.Typed.VarKind.Type = {
      val r = parse_langastTypedVarKindT(F)
      return r
    }

    def parse_langastTypedVarKindT(typeParsed: B): org.sireum.lang.ast.Typed.VarKind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Typed.VarKind")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      org.sireum.lang.ast.Typed.VarKind.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for org.sireum.lang.ast.Typed.VarKind.")
          return org.sireum.lang.ast.Typed.VarKind.byOrdinal(0).get
      }
    }

    def parse_langastTypedName(): org.sireum.lang.ast.Typed.Name = {
      val r = parse_langastTypedNameT(F)
      return r
    }

    def parse_langastTypedNameT(typeParsed: B): org.sireum.lang.ast.Typed.Name = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Typed.Name")
      }
      parser.parseObjectKey("ids")
      val ids = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      parser.parseObjectKey("args")
      val args = parser.parseISZ(parse_langastTyped _)
      parser.parseObjectNext()
      return org.sireum.lang.ast.Typed.Name(ids, args)
    }

    def parse_langastTypedTuple(): org.sireum.lang.ast.Typed.Tuple = {
      val r = parse_langastTypedTupleT(F)
      return r
    }

    def parse_langastTypedTupleT(typeParsed: B): org.sireum.lang.ast.Typed.Tuple = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Typed.Tuple")
      }
      parser.parseObjectKey("args")
      val args = parser.parseISZ(parse_langastTyped _)
      parser.parseObjectNext()
      return org.sireum.lang.ast.Typed.Tuple(args)
    }

    def parse_langastTypedFun(): org.sireum.lang.ast.Typed.Fun = {
      val r = parse_langastTypedFunT(F)
      return r
    }

    def parse_langastTypedFunT(typeParsed: B): org.sireum.lang.ast.Typed.Fun = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Typed.Fun")
      }
      parser.parseObjectKey("isPure")
      val isPure = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("isByName")
      val isByName = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("args")
      val args = parser.parseISZ(parse_langastTyped _)
      parser.parseObjectNext()
      parser.parseObjectKey("ret")
      val ret = parse_langastTyped()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Typed.Fun(isPure, isByName, args, ret)
    }

    def parse_langastTypedTypeVar(): org.sireum.lang.ast.Typed.TypeVar = {
      val r = parse_langastTypedTypeVarT(F)
      return r
    }

    def parse_langastTypedTypeVarT(typeParsed: B): org.sireum.lang.ast.Typed.TypeVar = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Typed.TypeVar")
      }
      parser.parseObjectKey("id")
      val id = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("kind")
      val kind = parse_langastTypedVarKindType()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Typed.TypeVar(id, kind)
    }

    def parse_langastTypedPackage(): org.sireum.lang.ast.Typed.Package = {
      val r = parse_langastTypedPackageT(F)
      return r
    }

    def parse_langastTypedPackageT(typeParsed: B): org.sireum.lang.ast.Typed.Package = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Typed.Package")
      }
      parser.parseObjectKey("name")
      val name = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      return org.sireum.lang.ast.Typed.Package(name)
    }

    def parse_langastTypedObject(): org.sireum.lang.ast.Typed.Object = {
      val r = parse_langastTypedObjectT(F)
      return r
    }

    def parse_langastTypedObjectT(typeParsed: B): org.sireum.lang.ast.Typed.Object = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Typed.Object")
      }
      parser.parseObjectKey("owner")
      val owner = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      parser.parseObjectKey("id")
      val id = parser.parseString()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Typed.Object(owner, id)
    }

    def parse_langastTypedEnum(): org.sireum.lang.ast.Typed.Enum = {
      val r = parse_langastTypedEnumT(F)
      return r
    }

    def parse_langastTypedEnumT(typeParsed: B): org.sireum.lang.ast.Typed.Enum = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Typed.Enum")
      }
      parser.parseObjectKey("name")
      val name = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      return org.sireum.lang.ast.Typed.Enum(name)
    }

    def parse_langastTypedMethod(): org.sireum.lang.ast.Typed.Method = {
      val r = parse_langastTypedMethodT(F)
      return r
    }

    def parse_langastTypedMethodT(typeParsed: B): org.sireum.lang.ast.Typed.Method = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Typed.Method")
      }
      parser.parseObjectKey("isInObject")
      val isInObject = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("mode")
      val mode = parse_langastMethodModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("typeParams")
      val typeParams = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      parser.parseObjectKey("owner")
      val owner = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      parser.parseObjectKey("name")
      val name = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("paramNames")
      val paramNames = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      parser.parseObjectKey("tpe")
      val tpe = parse_langastTypedFun()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Typed.Method(isInObject, mode, typeParams, owner, name, paramNames, tpe)
    }

    def parse_langastTypedMethods(): org.sireum.lang.ast.Typed.Methods = {
      val r = parse_langastTypedMethodsT(F)
      return r
    }

    def parse_langastTypedMethodsT(typeParsed: B): org.sireum.lang.ast.Typed.Methods = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Typed.Methods")
      }
      parser.parseObjectKey("methods")
      val methods = parser.parseISZ(parse_langastTypedMethod _)
      parser.parseObjectNext()
      return org.sireum.lang.ast.Typed.Methods(methods)
    }

    def parse_langastTypedFact(): org.sireum.lang.ast.Typed.Fact = {
      val r = parse_langastTypedFactT(F)
      return r
    }

    def parse_langastTypedFactT(typeParsed: B): org.sireum.lang.ast.Typed.Fact = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Typed.Fact")
      }
      parser.parseObjectKey("owner")
      val owner = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      parser.parseObjectKey("id")
      val id = parser.parseString()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Typed.Fact(owner, id)
    }

    def parse_langastTypedTheorem(): org.sireum.lang.ast.Typed.Theorem = {
      val r = parse_langastTypedTheoremT(F)
      return r
    }

    def parse_langastTypedTheoremT(typeParsed: B): org.sireum.lang.ast.Typed.Theorem = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Typed.Theorem")
      }
      parser.parseObjectKey("owner")
      val owner = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      parser.parseObjectKey("id")
      val id = parser.parseString()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Typed.Theorem(owner, id)
    }

    def parse_langastTypedInv(): org.sireum.lang.ast.Typed.Inv = {
      val r = parse_langastTypedInvT(F)
      return r
    }

    def parse_langastTypedInvT(typeParsed: B): org.sireum.lang.ast.Typed.Inv = {
      if (!typeParsed) {
        parser.parseObjectType("org.sireum.lang.ast.Typed.Inv")
      }
      parser.parseObjectKey("isInObject")
      val isInObject = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("owner")
      val owner = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      parser.parseObjectKey("id")
      val id = parser.parseString()
      parser.parseObjectNext()
      return org.sireum.lang.ast.Typed.Inv(isInObject, owner, id)
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

  def fromAadlInstInfo(o: AadlInstInfo, isCompact: B): String = {
    val st = Printer.printAadlInstInfo(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toAadlInstInfo(s: String): Either[AadlInstInfo, Json.ErrorMsg] = {
    def fAadlInstInfo(parser: Parser): AadlInstInfo = {
      val r = parser.parseAadlInstInfo()
      return r
    }
    val r = to(s, fAadlInstInfo _)
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

  def fromElementRef(o: ElementRef, isCompact: B): String = {
    val st = Printer.printElementRef(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toElementRef(s: String): Either[ElementRef, Json.ErrorMsg] = {
    def fElementRef(parser: Parser): ElementRef = {
      val r = parser.parseElementRef()
      return r
    }
    val r = to(s, fElementRef _)
    return r
  }

  def fromAadlElementRef(o: AadlElementRef, isCompact: B): String = {
    val st = Printer.printAadlElementRef(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toAadlElementRef(s: String): Either[AadlElementRef, Json.ErrorMsg] = {
    def fAadlElementRef(parser: Parser): AadlElementRef = {
      val r = parser.parseAadlElementRef()
      return r
    }
    val r = to(s, fAadlElementRef _)
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

  def fromAnnexLib(o: AnnexLib, isCompact: B): String = {
    val st = Printer.printAnnexLib(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toAnnexLib(s: String): Either[AnnexLib, Json.ErrorMsg] = {
    def fAnnexLib(parser: Parser): AnnexLib = {
      val r = parser.parseAnnexLib()
      return r
    }
    val r = to(s, fAnnexLib _)
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

  def fromOtherLib(o: OtherLib, isCompact: B): String = {
    val st = Printer.printOtherLib(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOtherLib(s: String): Either[OtherLib, Json.ErrorMsg] = {
    def fOtherLib(parser: Parser): OtherLib = {
      val r = parser.parseOtherLib()
      return r
    }
    val r = to(s, fOtherLib _)
    return r
  }

  def fromBLESSAnnex(o: BLESSAnnex, isCompact: B): String = {
    val st = Printer.printBLESSAnnex(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBLESSAnnex(s: String): Either[BLESSAnnex, Json.ErrorMsg] = {
    def fBLESSAnnex(parser: Parser): BLESSAnnex = {
      val r = parser.parseBLESSAnnex()
      return r
    }
    val r = to(s, fBLESSAnnex _)
    return r
  }

  def fromBTSSubclauseBehaviorProvider(o: BTSSubclauseBehaviorProvider, isCompact: B): String = {
    val st = Printer.printBTSSubclauseBehaviorProvider(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSSubclauseBehaviorProvider(s: String): Either[BTSSubclauseBehaviorProvider, Json.ErrorMsg] = {
    def fBTSSubclauseBehaviorProvider(parser: Parser): BTSSubclauseBehaviorProvider = {
      val r = parser.parseBTSSubclauseBehaviorProvider()
      return r
    }
    val r = to(s, fBTSSubclauseBehaviorProvider _)
    return r
  }

  def fromBTSResource(o: BTSResource, isCompact: B): String = {
    val st = Printer.printBTSResource(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSResource(s: String): Either[BTSResource, Json.ErrorMsg] = {
    def fBTSResource(parser: Parser): BTSResource = {
      val r = parser.parseBTSResource()
      return r
    }
    val r = to(s, fBTSResource _)
    return r
  }

  def fromBTSText(o: BTSText, isCompact: B): String = {
    val st = Printer.printBTSText(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSText(s: String): Either[BTSText, Json.ErrorMsg] = {
    def fBTSText(parser: Parser): BTSText = {
      val r = parser.parseBTSText()
      return r
    }
    val r = to(s, fBTSText _)
    return r
  }

  def fromBTSPath(o: BTSPath, isCompact: B): String = {
    val st = Printer.printBTSPath(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSPath(s: String): Either[BTSPath, Json.ErrorMsg] = {
    def fBTSPath(parser: Parser): BTSPath = {
      val r = parser.parseBTSPath()
      return r
    }
    val r = to(s, fBTSPath _)
    return r
  }

  def fromBTSBLESSAnnexClause(o: BTSBLESSAnnexClause, isCompact: B): String = {
    val st = Printer.printBTSBLESSAnnexClause(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSBLESSAnnexClause(s: String): Either[BTSBLESSAnnexClause, Json.ErrorMsg] = {
    def fBTSBLESSAnnexClause(parser: Parser): BTSBLESSAnnexClause = {
      val r = parser.parseBTSBLESSAnnexClause()
      return r
    }
    val r = to(s, fBTSBLESSAnnexClause _)
    return r
  }

  def fromBTSVariableDeclaration(o: BTSVariableDeclaration, isCompact: B): String = {
    val st = Printer.printBTSVariableDeclaration(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSVariableDeclaration(s: String): Either[BTSVariableDeclaration, Json.ErrorMsg] = {
    def fBTSVariableDeclaration(parser: Parser): BTSVariableDeclaration = {
      val r = parser.parseBTSVariableDeclaration()
      return r
    }
    val r = to(s, fBTSVariableDeclaration _)
    return r
  }

  def fromBTSType(o: BTSType, isCompact: B): String = {
    val st = Printer.printBTSType(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSType(s: String): Either[BTSType, Json.ErrorMsg] = {
    def fBTSType(parser: Parser): BTSType = {
      val r = parser.parseBTSType()
      return r
    }
    val r = to(s, fBTSType _)
    return r
  }

  def fromBTSClassifier(o: BTSClassifier, isCompact: B): String = {
    val st = Printer.printBTSClassifier(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSClassifier(s: String): Either[BTSClassifier, Json.ErrorMsg] = {
    def fBTSClassifier(parser: Parser): BTSClassifier = {
      val r = parser.parseBTSClassifier()
      return r
    }
    val r = to(s, fBTSClassifier _)
    return r
  }

  def fromBLESSIntConst(o: BLESSIntConst, isCompact: B): String = {
    val st = Printer.printBLESSIntConst(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBLESSIntConst(s: String): Either[BLESSIntConst, Json.ErrorMsg] = {
    def fBLESSIntConst(parser: Parser): BLESSIntConst = {
      val r = parser.parseBLESSIntConst()
      return r
    }
    val r = to(s, fBLESSIntConst _)
    return r
  }

  def fromBTSStateDeclaration(o: BTSStateDeclaration, isCompact: B): String = {
    val st = Printer.printBTSStateDeclaration(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSStateDeclaration(s: String): Either[BTSStateDeclaration, Json.ErrorMsg] = {
    def fBTSStateDeclaration(parser: Parser): BTSStateDeclaration = {
      val r = parser.parseBTSStateDeclaration()
      return r
    }
    val r = to(s, fBTSStateDeclaration _)
    return r
  }

  def fromBTSTransition(o: BTSTransition, isCompact: B): String = {
    val st = Printer.printBTSTransition(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSTransition(s: String): Either[BTSTransition, Json.ErrorMsg] = {
    def fBTSTransition(parser: Parser): BTSTransition = {
      val r = parser.parseBTSTransition()
      return r
    }
    val r = to(s, fBTSTransition _)
    return r
  }

  def fromBTSTransitionLabel(o: BTSTransitionLabel, isCompact: B): String = {
    val st = Printer.printBTSTransitionLabel(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSTransitionLabel(s: String): Either[BTSTransitionLabel, Json.ErrorMsg] = {
    def fBTSTransitionLabel(parser: Parser): BTSTransitionLabel = {
      val r = parser.parseBTSTransitionLabel()
      return r
    }
    val r = to(s, fBTSTransitionLabel _)
    return r
  }

  def fromBTSTransitionCondition(o: BTSTransitionCondition, isCompact: B): String = {
    val st = Printer.printBTSTransitionCondition(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSTransitionCondition(s: String): Either[BTSTransitionCondition, Json.ErrorMsg] = {
    def fBTSTransitionCondition(parser: Parser): BTSTransitionCondition = {
      val r = parser.parseBTSTransitionCondition()
      return r
    }
    val r = to(s, fBTSTransitionCondition _)
    return r
  }

  def fromBTSDispatchCondition(o: BTSDispatchCondition, isCompact: B): String = {
    val st = Printer.printBTSDispatchCondition(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSDispatchCondition(s: String): Either[BTSDispatchCondition, Json.ErrorMsg] = {
    def fBTSDispatchCondition(parser: Parser): BTSDispatchCondition = {
      val r = parser.parseBTSDispatchCondition()
      return r
    }
    val r = to(s, fBTSDispatchCondition _)
    return r
  }

  def fromBTSDispatchConjunction(o: BTSDispatchConjunction, isCompact: B): String = {
    val st = Printer.printBTSDispatchConjunction(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSDispatchConjunction(s: String): Either[BTSDispatchConjunction, Json.ErrorMsg] = {
    def fBTSDispatchConjunction(parser: Parser): BTSDispatchConjunction = {
      val r = parser.parseBTSDispatchConjunction()
      return r
    }
    val r = to(s, fBTSDispatchConjunction _)
    return r
  }

  def fromBTSDispatchTrigger(o: BTSDispatchTrigger, isCompact: B): String = {
    val st = Printer.printBTSDispatchTrigger(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSDispatchTrigger(s: String): Either[BTSDispatchTrigger, Json.ErrorMsg] = {
    def fBTSDispatchTrigger(parser: Parser): BTSDispatchTrigger = {
      val r = parser.parseBTSDispatchTrigger()
      return r
    }
    val r = to(s, fBTSDispatchTrigger _)
    return r
  }

  def fromBTSDispatchTriggerStop(o: BTSDispatchTriggerStop, isCompact: B): String = {
    val st = Printer.printBTSDispatchTriggerStop(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSDispatchTriggerStop(s: String): Either[BTSDispatchTriggerStop, Json.ErrorMsg] = {
    def fBTSDispatchTriggerStop(parser: Parser): BTSDispatchTriggerStop = {
      val r = parser.parseBTSDispatchTriggerStop()
      return r
    }
    val r = to(s, fBTSDispatchTriggerStop _)
    return r
  }

  def fromBTSDispatchTriggerPort(o: BTSDispatchTriggerPort, isCompact: B): String = {
    val st = Printer.printBTSDispatchTriggerPort(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSDispatchTriggerPort(s: String): Either[BTSDispatchTriggerPort, Json.ErrorMsg] = {
    def fBTSDispatchTriggerPort(parser: Parser): BTSDispatchTriggerPort = {
      val r = parser.parseBTSDispatchTriggerPort()
      return r
    }
    val r = to(s, fBTSDispatchTriggerPort _)
    return r
  }

  def fromBTSDispatchTriggerTimeout(o: BTSDispatchTriggerTimeout, isCompact: B): String = {
    val st = Printer.printBTSDispatchTriggerTimeout(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSDispatchTriggerTimeout(s: String): Either[BTSDispatchTriggerTimeout, Json.ErrorMsg] = {
    def fBTSDispatchTriggerTimeout(parser: Parser): BTSDispatchTriggerTimeout = {
      val r = parser.parseBTSDispatchTriggerTimeout()
      return r
    }
    val r = to(s, fBTSDispatchTriggerTimeout _)
    return r
  }

  def fromBTSExecuteCondition(o: BTSExecuteCondition, isCompact: B): String = {
    val st = Printer.printBTSExecuteCondition(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSExecuteCondition(s: String): Either[BTSExecuteCondition, Json.ErrorMsg] = {
    def fBTSExecuteCondition(parser: Parser): BTSExecuteCondition = {
      val r = parser.parseBTSExecuteCondition()
      return r
    }
    val r = to(s, fBTSExecuteCondition _)
    return r
  }

  def fromBTSExecuteConditionExp(o: BTSExecuteConditionExp, isCompact: B): String = {
    val st = Printer.printBTSExecuteConditionExp(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSExecuteConditionExp(s: String): Either[BTSExecuteConditionExp, Json.ErrorMsg] = {
    def fBTSExecuteConditionExp(parser: Parser): BTSExecuteConditionExp = {
      val r = parser.parseBTSExecuteConditionExp()
      return r
    }
    val r = to(s, fBTSExecuteConditionExp _)
    return r
  }

  def fromBTSExecuteConditionTimeout(o: BTSExecuteConditionTimeout, isCompact: B): String = {
    val st = Printer.printBTSExecuteConditionTimeout(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSExecuteConditionTimeout(s: String): Either[BTSExecuteConditionTimeout, Json.ErrorMsg] = {
    def fBTSExecuteConditionTimeout(parser: Parser): BTSExecuteConditionTimeout = {
      val r = parser.parseBTSExecuteConditionTimeout()
      return r
    }
    val r = to(s, fBTSExecuteConditionTimeout _)
    return r
  }

  def fromBTSExecuteConditionOtherwise(o: BTSExecuteConditionOtherwise, isCompact: B): String = {
    val st = Printer.printBTSExecuteConditionOtherwise(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSExecuteConditionOtherwise(s: String): Either[BTSExecuteConditionOtherwise, Json.ErrorMsg] = {
    def fBTSExecuteConditionOtherwise(parser: Parser): BTSExecuteConditionOtherwise = {
      val r = parser.parseBTSExecuteConditionOtherwise()
      return r
    }
    val r = to(s, fBTSExecuteConditionOtherwise _)
    return r
  }

  def fromBTSModeCondition(o: BTSModeCondition, isCompact: B): String = {
    val st = Printer.printBTSModeCondition(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSModeCondition(s: String): Either[BTSModeCondition, Json.ErrorMsg] = {
    def fBTSModeCondition(parser: Parser): BTSModeCondition = {
      val r = parser.parseBTSModeCondition()
      return r
    }
    val r = to(s, fBTSModeCondition _)
    return r
  }

  def fromBTSInternalCondition(o: BTSInternalCondition, isCompact: B): String = {
    val st = Printer.printBTSInternalCondition(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSInternalCondition(s: String): Either[BTSInternalCondition, Json.ErrorMsg] = {
    def fBTSInternalCondition(parser: Parser): BTSInternalCondition = {
      val r = parser.parseBTSInternalCondition()
      return r
    }
    val r = to(s, fBTSInternalCondition _)
    return r
  }

  def fromBTSAssertion(o: BTSAssertion, isCompact: B): String = {
    val st = Printer.printBTSAssertion(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSAssertion(s: String): Either[BTSAssertion, Json.ErrorMsg] = {
    def fBTSAssertion(parser: Parser): BTSAssertion = {
      val r = parser.parseBTSAssertion()
      return r
    }
    val r = to(s, fBTSAssertion _)
    return r
  }

  def fromBTSBehaviorActions(o: BTSBehaviorActions, isCompact: B): String = {
    val st = Printer.printBTSBehaviorActions(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSBehaviorActions(s: String): Either[BTSBehaviorActions, Json.ErrorMsg] = {
    def fBTSBehaviorActions(parser: Parser): BTSBehaviorActions = {
      val r = parser.parseBTSBehaviorActions()
      return r
    }
    val r = to(s, fBTSBehaviorActions _)
    return r
  }

  def fromBTSAssertedAction(o: BTSAssertedAction, isCompact: B): String = {
    val st = Printer.printBTSAssertedAction(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSAssertedAction(s: String): Either[BTSAssertedAction, Json.ErrorMsg] = {
    def fBTSAssertedAction(parser: Parser): BTSAssertedAction = {
      val r = parser.parseBTSAssertedAction()
      return r
    }
    val r = to(s, fBTSAssertedAction _)
    return r
  }

  def fromBTSAction(o: BTSAction, isCompact: B): String = {
    val st = Printer.printBTSAction(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSAction(s: String): Either[BTSAction, Json.ErrorMsg] = {
    def fBTSAction(parser: Parser): BTSAction = {
      val r = parser.parseBTSAction()
      return r
    }
    val r = to(s, fBTSAction _)
    return r
  }

  def fromBTSBasicAction(o: BTSBasicAction, isCompact: B): String = {
    val st = Printer.printBTSBasicAction(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSBasicAction(s: String): Either[BTSBasicAction, Json.ErrorMsg] = {
    def fBTSBasicAction(parser: Parser): BTSBasicAction = {
      val r = parser.parseBTSBasicAction()
      return r
    }
    val r = to(s, fBTSBasicAction _)
    return r
  }

  def fromBTSSkipAction(o: BTSSkipAction, isCompact: B): String = {
    val st = Printer.printBTSSkipAction(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSSkipAction(s: String): Either[BTSSkipAction, Json.ErrorMsg] = {
    def fBTSSkipAction(parser: Parser): BTSSkipAction = {
      val r = parser.parseBTSSkipAction()
      return r
    }
    val r = to(s, fBTSSkipAction _)
    return r
  }

  def fromBTSAssignmentAction(o: BTSAssignmentAction, isCompact: B): String = {
    val st = Printer.printBTSAssignmentAction(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSAssignmentAction(s: String): Either[BTSAssignmentAction, Json.ErrorMsg] = {
    def fBTSAssignmentAction(parser: Parser): BTSAssignmentAction = {
      val r = parser.parseBTSAssignmentAction()
      return r
    }
    val r = to(s, fBTSAssignmentAction _)
    return r
  }

  def fromBTSCommunicationAction(o: BTSCommunicationAction, isCompact: B): String = {
    val st = Printer.printBTSCommunicationAction(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSCommunicationAction(s: String): Either[BTSCommunicationAction, Json.ErrorMsg] = {
    def fBTSCommunicationAction(parser: Parser): BTSCommunicationAction = {
      val r = parser.parseBTSCommunicationAction()
      return r
    }
    val r = to(s, fBTSCommunicationAction _)
    return r
  }

  def fromBTSSubprogramCallAction(o: BTSSubprogramCallAction, isCompact: B): String = {
    val st = Printer.printBTSSubprogramCallAction(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSSubprogramCallAction(s: String): Either[BTSSubprogramCallAction, Json.ErrorMsg] = {
    def fBTSSubprogramCallAction(parser: Parser): BTSSubprogramCallAction = {
      val r = parser.parseBTSSubprogramCallAction()
      return r
    }
    val r = to(s, fBTSSubprogramCallAction _)
    return r
  }

  def fromBTSPortOutAction(o: BTSPortOutAction, isCompact: B): String = {
    val st = Printer.printBTSPortOutAction(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSPortOutAction(s: String): Either[BTSPortOutAction, Json.ErrorMsg] = {
    def fBTSPortOutAction(parser: Parser): BTSPortOutAction = {
      val r = parser.parseBTSPortOutAction()
      return r
    }
    val r = to(s, fBTSPortOutAction _)
    return r
  }

  def fromBTSPortInAction(o: BTSPortInAction, isCompact: B): String = {
    val st = Printer.printBTSPortInAction(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSPortInAction(s: String): Either[BTSPortInAction, Json.ErrorMsg] = {
    def fBTSPortInAction(parser: Parser): BTSPortInAction = {
      val r = parser.parseBTSPortInAction()
      return r
    }
    val r = to(s, fBTSPortInAction _)
    return r
  }

  def fromBTSFrozenPortAction(o: BTSFrozenPortAction, isCompact: B): String = {
    val st = Printer.printBTSFrozenPortAction(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSFrozenPortAction(s: String): Either[BTSFrozenPortAction, Json.ErrorMsg] = {
    def fBTSFrozenPortAction(parser: Parser): BTSFrozenPortAction = {
      val r = parser.parseBTSFrozenPortAction()
      return r
    }
    val r = to(s, fBTSFrozenPortAction _)
    return r
  }

  def fromBTSControlAction(o: BTSControlAction, isCompact: B): String = {
    val st = Printer.printBTSControlAction(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSControlAction(s: String): Either[BTSControlAction, Json.ErrorMsg] = {
    def fBTSControlAction(parser: Parser): BTSControlAction = {
      val r = parser.parseBTSControlAction()
      return r
    }
    val r = to(s, fBTSControlAction _)
    return r
  }

  def fromBTSIfBLESSAction(o: BTSIfBLESSAction, isCompact: B): String = {
    val st = Printer.printBTSIfBLESSAction(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSIfBLESSAction(s: String): Either[BTSIfBLESSAction, Json.ErrorMsg] = {
    def fBTSIfBLESSAction(parser: Parser): BTSIfBLESSAction = {
      val r = parser.parseBTSIfBLESSAction()
      return r
    }
    val r = to(s, fBTSIfBLESSAction _)
    return r
  }

  def fromBTSGuardedAction(o: BTSGuardedAction, isCompact: B): String = {
    val st = Printer.printBTSGuardedAction(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSGuardedAction(s: String): Either[BTSGuardedAction, Json.ErrorMsg] = {
    def fBTSGuardedAction(parser: Parser): BTSGuardedAction = {
      val r = parser.parseBTSGuardedAction()
      return r
    }
    val r = to(s, fBTSGuardedAction _)
    return r
  }

  def fromBTSIfBAAction(o: BTSIfBAAction, isCompact: B): String = {
    val st = Printer.printBTSIfBAAction(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSIfBAAction(s: String): Either[BTSIfBAAction, Json.ErrorMsg] = {
    def fBTSIfBAAction(parser: Parser): BTSIfBAAction = {
      val r = parser.parseBTSIfBAAction()
      return r
    }
    val r = to(s, fBTSIfBAAction _)
    return r
  }

  def fromBTSConditionalActions(o: BTSConditionalActions, isCompact: B): String = {
    val st = Printer.printBTSConditionalActions(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSConditionalActions(s: String): Either[BTSConditionalActions, Json.ErrorMsg] = {
    def fBTSConditionalActions(parser: Parser): BTSConditionalActions = {
      val r = parser.parseBTSConditionalActions()
      return r
    }
    val r = to(s, fBTSConditionalActions _)
    return r
  }

  def fromBTSQuantificationActions(o: BTSQuantificationActions, isCompact: B): String = {
    val st = Printer.printBTSQuantificationActions(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSQuantificationActions(s: String): Either[BTSQuantificationActions, Json.ErrorMsg] = {
    def fBTSQuantificationActions(parser: Parser): BTSQuantificationActions = {
      val r = parser.parseBTSQuantificationActions()
      return r
    }
    val r = to(s, fBTSQuantificationActions _)
    return r
  }

  def fromBTSExistentialLatticeQuantification(o: BTSExistentialLatticeQuantification, isCompact: B): String = {
    val st = Printer.printBTSExistentialLatticeQuantification(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSExistentialLatticeQuantification(s: String): Either[BTSExistentialLatticeQuantification, Json.ErrorMsg] = {
    def fBTSExistentialLatticeQuantification(parser: Parser): BTSExistentialLatticeQuantification = {
      val r = parser.parseBTSExistentialLatticeQuantification()
      return r
    }
    val r = to(s, fBTSExistentialLatticeQuantification _)
    return r
  }

  def fromBTSUniversalLatticeQuantification(o: BTSUniversalLatticeQuantification, isCompact: B): String = {
    val st = Printer.printBTSUniversalLatticeQuantification(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSUniversalLatticeQuantification(s: String): Either[BTSUniversalLatticeQuantification, Json.ErrorMsg] = {
    def fBTSUniversalLatticeQuantification(parser: Parser): BTSUniversalLatticeQuantification = {
      val r = parser.parseBTSUniversalLatticeQuantification()
      return r
    }
    val r = to(s, fBTSUniversalLatticeQuantification _)
    return r
  }

  def fromBTSExp(o: BTSExp, isCompact: B): String = {
    val st = Printer.printBTSExp(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSExp(s: String): Either[BTSExp, Json.ErrorMsg] = {
    def fBTSExp(parser: Parser): BTSExp = {
      val r = parser.parseBTSExp()
      return r
    }
    val r = to(s, fBTSExp _)
    return r
  }

  def fromBTSUnaryExp(o: BTSUnaryExp, isCompact: B): String = {
    val st = Printer.printBTSUnaryExp(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSUnaryExp(s: String): Either[BTSUnaryExp, Json.ErrorMsg] = {
    def fBTSUnaryExp(parser: Parser): BTSUnaryExp = {
      val r = parser.parseBTSUnaryExp()
      return r
    }
    val r = to(s, fBTSUnaryExp _)
    return r
  }

  def fromBTSBinaryExp(o: BTSBinaryExp, isCompact: B): String = {
    val st = Printer.printBTSBinaryExp(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSBinaryExp(s: String): Either[BTSBinaryExp, Json.ErrorMsg] = {
    def fBTSBinaryExp(parser: Parser): BTSBinaryExp = {
      val r = parser.parseBTSBinaryExp()
      return r
    }
    val r = to(s, fBTSBinaryExp _)
    return r
  }

  def fromBTSLiteralExp(o: BTSLiteralExp, isCompact: B): String = {
    val st = Printer.printBTSLiteralExp(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSLiteralExp(s: String): Either[BTSLiteralExp, Json.ErrorMsg] = {
    def fBTSLiteralExp(parser: Parser): BTSLiteralExp = {
      val r = parser.parseBTSLiteralExp()
      return r
    }
    val r = to(s, fBTSLiteralExp _)
    return r
  }

  def fromBTSNameExp(o: BTSNameExp, isCompact: B): String = {
    val st = Printer.printBTSNameExp(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSNameExp(s: String): Either[BTSNameExp, Json.ErrorMsg] = {
    def fBTSNameExp(parser: Parser): BTSNameExp = {
      val r = parser.parseBTSNameExp()
      return r
    }
    val r = to(s, fBTSNameExp _)
    return r
  }

  def fromBTSIndexingExp(o: BTSIndexingExp, isCompact: B): String = {
    val st = Printer.printBTSIndexingExp(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSIndexingExp(s: String): Either[BTSIndexingExp, Json.ErrorMsg] = {
    def fBTSIndexingExp(parser: Parser): BTSIndexingExp = {
      val r = parser.parseBTSIndexingExp()
      return r
    }
    val r = to(s, fBTSIndexingExp _)
    return r
  }

  def fromBTSAccessExp(o: BTSAccessExp, isCompact: B): String = {
    val st = Printer.printBTSAccessExp(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSAccessExp(s: String): Either[BTSAccessExp, Json.ErrorMsg] = {
    def fBTSAccessExp(parser: Parser): BTSAccessExp = {
      val r = parser.parseBTSAccessExp()
      return r
    }
    val r = to(s, fBTSAccessExp _)
    return r
  }

  def fromBTSFunctionCall(o: BTSFunctionCall, isCompact: B): String = {
    val st = Printer.printBTSFunctionCall(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSFunctionCall(s: String): Either[BTSFunctionCall, Json.ErrorMsg] = {
    def fBTSFunctionCall(parser: Parser): BTSFunctionCall = {
      val r = parser.parseBTSFunctionCall()
      return r
    }
    val r = to(s, fBTSFunctionCall _)
    return r
  }

  def fromBTSFormalExpPair(o: BTSFormalExpPair, isCompact: B): String = {
    val st = Printer.printBTSFormalExpPair(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSFormalExpPair(s: String): Either[BTSFormalExpPair, Json.ErrorMsg] = {
    def fBTSFormalExpPair(parser: Parser): BTSFormalExpPair = {
      val r = parser.parseBTSFormalExpPair()
      return r
    }
    val r = to(s, fBTSFormalExpPair _)
    return r
  }

  def fromBTSBehaviorTime(o: BTSBehaviorTime, isCompact: B): String = {
    val st = Printer.printBTSBehaviorTime(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSBehaviorTime(s: String): Either[BTSBehaviorTime, Json.ErrorMsg] = {
    def fBTSBehaviorTime(parser: Parser): BTSBehaviorTime = {
      val r = parser.parseBTSBehaviorTime()
      return r
    }
    val r = to(s, fBTSBehaviorTime _)
    return r
  }

  def fromTODO(o: TODO, isCompact: B): String = {
    val st = Printer.printTODO(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTODO(s: String): Either[TODO, Json.ErrorMsg] = {
    def fTODO(parser: Parser): TODO = {
      val r = parser.parseTODO()
      return r
    }
    val r = to(s, fTODO _)
    return r
  }

  def fromAttr(o: Attr, isCompact: B): String = {
    val st = Printer.printAttr(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toAttr(s: String): Either[Attr, Json.ErrorMsg] = {
    def fAttr(parser: Parser): Attr = {
      val r = parser.parseAttr()
      return r
    }
    val r = to(s, fAttr _)
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

  def fromEmv2Lib(o: Emv2Lib, isCompact: B): String = {
    val st = Printer.printEmv2Lib(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEmv2Lib(s: String): Either[Emv2Lib, Json.ErrorMsg] = {
    def fEmv2Lib(parser: Parser): Emv2Lib = {
      val r = parser.parseEmv2Lib()
      return r
    }
    val r = to(s, fEmv2Lib _)
    return r
  }

  def fromEmv2ElementRef(o: Emv2ElementRef, isCompact: B): String = {
    val st = Printer.printEmv2ElementRef(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEmv2ElementRef(s: String): Either[Emv2ElementRef, Json.ErrorMsg] = {
    def fEmv2ElementRef(parser: Parser): Emv2ElementRef = {
      val r = parser.parseEmv2ElementRef()
      return r
    }
    val r = to(s, fEmv2ElementRef _)
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

  def fromErrorTypeDef(o: ErrorTypeDef, isCompact: B): String = {
    val st = Printer.printErrorTypeDef(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toErrorTypeDef(s: String): Either[ErrorTypeDef, Json.ErrorMsg] = {
    def fErrorTypeDef(parser: Parser): ErrorTypeDef = {
      val r = parser.parseErrorTypeDef()
      return r
    }
    val r = to(s, fErrorTypeDef _)
    return r
  }

  def fromErrorAliasDef(o: ErrorAliasDef, isCompact: B): String = {
    val st = Printer.printErrorAliasDef(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toErrorAliasDef(s: String): Either[ErrorAliasDef, Json.ErrorMsg] = {
    def fErrorAliasDef(parser: Parser): ErrorAliasDef = {
      val r = parser.parseErrorAliasDef()
      return r
    }
    val r = to(s, fErrorAliasDef _)
    return r
  }

  def fromErrorTypeSetDef(o: ErrorTypeSetDef, isCompact: B): String = {
    val st = Printer.printErrorTypeSetDef(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toErrorTypeSetDef(s: String): Either[ErrorTypeSetDef, Json.ErrorMsg] = {
    def fErrorTypeSetDef(parser: Parser): ErrorTypeSetDef = {
      val r = parser.parseErrorTypeSetDef()
      return r
    }
    val r = to(s, fErrorTypeSetDef _)
    return r
  }

  def fromBehaveStateMachine(o: BehaveStateMachine, isCompact: B): String = {
    val st = Printer.printBehaveStateMachine(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBehaveStateMachine(s: String): Either[BehaveStateMachine, Json.ErrorMsg] = {
    def fBehaveStateMachine(parser: Parser): BehaveStateMachine = {
      val r = parser.parseBehaveStateMachine()
      return r
    }
    val r = to(s, fBehaveStateMachine _)
    return r
  }

  def fromErrorEvent(o: ErrorEvent, isCompact: B): String = {
    val st = Printer.printErrorEvent(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toErrorEvent(s: String): Either[ErrorEvent, Json.ErrorMsg] = {
    def fErrorEvent(parser: Parser): ErrorEvent = {
      val r = parser.parseErrorEvent()
      return r
    }
    val r = to(s, fErrorEvent _)
    return r
  }

  def fromErrorState(o: ErrorState, isCompact: B): String = {
    val st = Printer.printErrorState(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toErrorState(s: String): Either[ErrorState, Json.ErrorMsg] = {
    def fErrorState(parser: Parser): ErrorState = {
      val r = parser.parseErrorState()
      return r
    }
    val r = to(s, fErrorState _)
    return r
  }

  def fromErrorTransition(o: ErrorTransition, isCompact: B): String = {
    val st = Printer.printErrorTransition(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toErrorTransition(s: String): Either[ErrorTransition, Json.ErrorMsg] = {
    def fErrorTransition(parser: Parser): ErrorTransition = {
      val r = parser.parseErrorTransition()
      return r
    }
    val r = to(s, fErrorTransition _)
    return r
  }

  def fromErrorCondition(o: ErrorCondition, isCompact: B): String = {
    val st = Printer.printErrorCondition(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toErrorCondition(s: String): Either[ErrorCondition, Json.ErrorMsg] = {
    def fErrorCondition(parser: Parser): ErrorCondition = {
      val r = parser.parseErrorCondition()
      return r
    }
    val r = to(s, fErrorCondition _)
    return r
  }

  def fromConditionTrigger(o: ConditionTrigger, isCompact: B): String = {
    val st = Printer.printConditionTrigger(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toConditionTrigger(s: String): Either[ConditionTrigger, Json.ErrorMsg] = {
    def fConditionTrigger(parser: Parser): ConditionTrigger = {
      val r = parser.parseConditionTrigger()
      return r
    }
    val r = to(s, fConditionTrigger _)
    return r
  }

  def fromAndCondition(o: AndCondition, isCompact: B): String = {
    val st = Printer.printAndCondition(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toAndCondition(s: String): Either[AndCondition, Json.ErrorMsg] = {
    def fAndCondition(parser: Parser): AndCondition = {
      val r = parser.parseAndCondition()
      return r
    }
    val r = to(s, fAndCondition _)
    return r
  }

  def fromOrCondition(o: OrCondition, isCompact: B): String = {
    val st = Printer.printOrCondition(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOrCondition(s: String): Either[OrCondition, Json.ErrorMsg] = {
    def fOrCondition(parser: Parser): OrCondition = {
      val r = parser.parseOrCondition()
      return r
    }
    val r = to(s, fOrCondition _)
    return r
  }

  def fromAllCondition(o: AllCondition, isCompact: B): String = {
    val st = Printer.printAllCondition(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toAllCondition(s: String): Either[AllCondition, Json.ErrorMsg] = {
    def fAllCondition(parser: Parser): AllCondition = {
      val r = parser.parseAllCondition()
      return r
    }
    val r = to(s, fAllCondition _)
    return r
  }

  def fromOrMoreCondition(o: OrMoreCondition, isCompact: B): String = {
    val st = Printer.printOrMoreCondition(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOrMoreCondition(s: String): Either[OrMoreCondition, Json.ErrorMsg] = {
    def fOrMoreCondition(parser: Parser): OrMoreCondition = {
      val r = parser.parseOrMoreCondition()
      return r
    }
    val r = to(s, fOrMoreCondition _)
    return r
  }

  def fromOrLessCondition(o: OrLessCondition, isCompact: B): String = {
    val st = Printer.printOrLessCondition(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOrLessCondition(s: String): Either[OrLessCondition, Json.ErrorMsg] = {
    def fOrLessCondition(parser: Parser): OrLessCondition = {
      val r = parser.parseOrLessCondition()
      return r
    }
    val r = to(s, fOrLessCondition _)
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

  def fromEmv2BehaviorSection(o: Emv2BehaviorSection, isCompact: B): String = {
    val st = Printer.printEmv2BehaviorSection(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEmv2BehaviorSection(s: String): Either[Emv2BehaviorSection, Json.ErrorMsg] = {
    def fEmv2BehaviorSection(parser: Parser): Emv2BehaviorSection = {
      val r = parser.parseEmv2BehaviorSection()
      return r
    }
    val r = to(s, fEmv2BehaviorSection _)
    return r
  }

  def fromErrorPropagation(o: ErrorPropagation, isCompact: B): String = {
    val st = Printer.printErrorPropagation(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toErrorPropagation(s: String): Either[ErrorPropagation, Json.ErrorMsg] = {
    def fErrorPropagation(parser: Parser): ErrorPropagation = {
      val r = parser.parseErrorPropagation()
      return r
    }
    val r = to(s, fErrorPropagation _)
    return r
  }

  def fromGclSymbol(o: GclSymbol, isCompact: B): String = {
    val st = Printer.printGclSymbol(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toGclSymbol(s: String): Either[GclSymbol, Json.ErrorMsg] = {
    def fGclSymbol(parser: Parser): GclSymbol = {
      val r = parser.parseGclSymbol()
      return r
    }
    val r = to(s, fGclSymbol _)
    return r
  }

  def fromGclSubclause(o: GclSubclause, isCompact: B): String = {
    val st = Printer.printGclSubclause(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toGclSubclause(s: String): Either[GclSubclause, Json.ErrorMsg] = {
    def fGclSubclause(parser: Parser): GclSubclause = {
      val r = parser.parseGclSubclause()
      return r
    }
    val r = to(s, fGclSubclause _)
    return r
  }

  def fromGclMethod(o: GclMethod, isCompact: B): String = {
    val st = Printer.printGclMethod(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toGclMethod(s: String): Either[GclMethod, Json.ErrorMsg] = {
    def fGclMethod(parser: Parser): GclMethod = {
      val r = parser.parseGclMethod()
      return r
    }
    val r = to(s, fGclMethod _)
    return r
  }

  def fromGclStateVar(o: GclStateVar, isCompact: B): String = {
    val st = Printer.printGclStateVar(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toGclStateVar(s: String): Either[GclStateVar, Json.ErrorMsg] = {
    def fGclStateVar(parser: Parser): GclStateVar = {
      val r = parser.parseGclStateVar()
      return r
    }
    val r = to(s, fGclStateVar _)
    return r
  }

  def fromGclClause(o: GclClause, isCompact: B): String = {
    val st = Printer.printGclClause(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toGclClause(s: String): Either[GclClause, Json.ErrorMsg] = {
    def fGclClause(parser: Parser): GclClause = {
      val r = parser.parseGclClause()
      return r
    }
    val r = to(s, fGclClause _)
    return r
  }

  def fromGclSpec(o: GclSpec, isCompact: B): String = {
    val st = Printer.printGclSpec(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toGclSpec(s: String): Either[GclSpec, Json.ErrorMsg] = {
    def fGclSpec(parser: Parser): GclSpec = {
      val r = parser.parseGclSpec()
      return r
    }
    val r = to(s, fGclSpec _)
    return r
  }

  def fromGclInvariant(o: GclInvariant, isCompact: B): String = {
    val st = Printer.printGclInvariant(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toGclInvariant(s: String): Either[GclInvariant, Json.ErrorMsg] = {
    def fGclInvariant(parser: Parser): GclInvariant = {
      val r = parser.parseGclInvariant()
      return r
    }
    val r = to(s, fGclInvariant _)
    return r
  }

  def fromGclComputeSpec(o: GclComputeSpec, isCompact: B): String = {
    val st = Printer.printGclComputeSpec(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toGclComputeSpec(s: String): Either[GclComputeSpec, Json.ErrorMsg] = {
    def fGclComputeSpec(parser: Parser): GclComputeSpec = {
      val r = parser.parseGclComputeSpec()
      return r
    }
    val r = to(s, fGclComputeSpec _)
    return r
  }

  def fromGclAssume(o: GclAssume, isCompact: B): String = {
    val st = Printer.printGclAssume(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toGclAssume(s: String): Either[GclAssume, Json.ErrorMsg] = {
    def fGclAssume(parser: Parser): GclAssume = {
      val r = parser.parseGclAssume()
      return r
    }
    val r = to(s, fGclAssume _)
    return r
  }

  def fromGclGuarantee(o: GclGuarantee, isCompact: B): String = {
    val st = Printer.printGclGuarantee(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toGclGuarantee(s: String): Either[GclGuarantee, Json.ErrorMsg] = {
    def fGclGuarantee(parser: Parser): GclGuarantee = {
      val r = parser.parseGclGuarantee()
      return r
    }
    val r = to(s, fGclGuarantee _)
    return r
  }

  def fromGclIntegration(o: GclIntegration, isCompact: B): String = {
    val st = Printer.printGclIntegration(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toGclIntegration(s: String): Either[GclIntegration, Json.ErrorMsg] = {
    def fGclIntegration(parser: Parser): GclIntegration = {
      val r = parser.parseGclIntegration()
      return r
    }
    val r = to(s, fGclIntegration _)
    return r
  }

  def fromGclCaseStatement(o: GclCaseStatement, isCompact: B): String = {
    val st = Printer.printGclCaseStatement(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toGclCaseStatement(s: String): Either[GclCaseStatement, Json.ErrorMsg] = {
    def fGclCaseStatement(parser: Parser): GclCaseStatement = {
      val r = parser.parseGclCaseStatement()
      return r
    }
    val r = to(s, fGclCaseStatement _)
    return r
  }

  def fromGclInitialize(o: GclInitialize, isCompact: B): String = {
    val st = Printer.printGclInitialize(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toGclInitialize(s: String): Either[GclInitialize, Json.ErrorMsg] = {
    def fGclInitialize(parser: Parser): GclInitialize = {
      val r = parser.parseGclInitialize()
      return r
    }
    val r = to(s, fGclInitialize _)
    return r
  }

  def fromGclCompute(o: GclCompute, isCompact: B): String = {
    val st = Printer.printGclCompute(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toGclCompute(s: String): Either[GclCompute, Json.ErrorMsg] = {
    def fGclCompute(parser: Parser): GclCompute = {
      val r = parser.parseGclCompute()
      return r
    }
    val r = to(s, fGclCompute _)
    return r
  }

  def fromGclHandle(o: GclHandle, isCompact: B): String = {
    val st = Printer.printGclHandle(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toGclHandle(s: String): Either[GclHandle, Json.ErrorMsg] = {
    def fGclHandle(parser: Parser): GclHandle = {
      val r = parser.parseGclHandle()
      return r
    }
    val r = to(s, fGclHandle _)
    return r
  }

  def fromGclTODO(o: GclTODO, isCompact: B): String = {
    val st = Printer.printGclTODO(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toGclTODO(s: String): Either[GclTODO, Json.ErrorMsg] = {
    def fGclTODO(parser: Parser): GclTODO = {
      val r = parser.parseGclTODO()
      return r
    }
    val r = to(s, fGclTODO _)
    return r
  }

  def fromGclLib(o: GclLib, isCompact: B): String = {
    val st = Printer.printGclLib(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toGclLib(s: String): Either[GclLib, Json.ErrorMsg] = {
    def fGclLib(parser: Parser): GclLib = {
      val r = parser.parseGclLib()
      return r
    }
    val r = to(s, fGclLib _)
    return r
  }

  def fromInfoFlowClause(o: InfoFlowClause, isCompact: B): String = {
    val st = Printer.printInfoFlowClause(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toInfoFlowClause(s: String): Either[InfoFlowClause, Json.ErrorMsg] = {
    def fInfoFlowClause(parser: Parser): InfoFlowClause = {
      val r = parser.parseInfoFlowClause()
      return r
    }
    val r = to(s, fInfoFlowClause _)
    return r
  }

  def fromSmfAnnex(o: SmfAnnex, isCompact: B): String = {
    val st = Printer.printSmfAnnex(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toSmfAnnex(s: String): Either[SmfAnnex, Json.ErrorMsg] = {
    def fSmfAnnex(parser: Parser): SmfAnnex = {
      val r = parser.parseSmfAnnex()
      return r
    }
    val r = to(s, fSmfAnnex _)
    return r
  }

  def fromSmfLib(o: SmfLib, isCompact: B): String = {
    val st = Printer.printSmfLib(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toSmfLib(s: String): Either[SmfLib, Json.ErrorMsg] = {
    def fSmfLib(parser: Parser): SmfLib = {
      val r = parser.parseSmfLib()
      return r
    }
    val r = to(s, fSmfLib _)
    return r
  }

  def fromSmfClause(o: SmfClause, isCompact: B): String = {
    val st = Printer.printSmfClause(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toSmfClause(s: String): Either[SmfClause, Json.ErrorMsg] = {
    def fSmfClause(parser: Parser): SmfClause = {
      val r = parser.parseSmfClause()
      return r
    }
    val r = to(s, fSmfClause _)
    return r
  }

  def fromSmfClassification(o: SmfClassification, isCompact: B): String = {
    val st = Printer.printSmfClassification(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toSmfClassification(s: String): Either[SmfClassification, Json.ErrorMsg] = {
    def fSmfClassification(parser: Parser): SmfClassification = {
      val r = parser.parseSmfClassification()
      return r
    }
    val r = to(s, fSmfClassification _)
    return r
  }

  def fromSmfDeclass(o: SmfDeclass, isCompact: B): String = {
    val st = Printer.printSmfDeclass(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toSmfDeclass(s: String): Either[SmfDeclass, Json.ErrorMsg] = {
    def fSmfDeclass(parser: Parser): SmfDeclass = {
      val r = parser.parseSmfDeclass()
      return r
    }
    val r = to(s, fSmfDeclass _)
    return r
  }

  def fromSmfLibrary(o: SmfLibrary, isCompact: B): String = {
    val st = Printer.printSmfLibrary(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toSmfLibrary(s: String): Either[SmfLibrary, Json.ErrorMsg] = {
    def fSmfLibrary(parser: Parser): SmfLibrary = {
      val r = parser.parseSmfLibrary()
      return r
    }
    val r = to(s, fSmfLibrary _)
    return r
  }

  def fromSmfType(o: SmfType, isCompact: B): String = {
    val st = Printer.printSmfType(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toSmfType(s: String): Either[SmfType, Json.ErrorMsg] = {
    def fSmfType(parser: Parser): SmfType = {
      val r = parser.parseSmfType()
      return r
    }
    val r = to(s, fSmfType _)
    return r
  }

  def from_langastTopUnit(o: org.sireum.lang.ast.TopUnit, isCompact: B): String = {
    val st = Printer.print_langastTopUnit(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastTopUnit(s: String): Either[org.sireum.lang.ast.TopUnit, Json.ErrorMsg] = {
    def f_langastTopUnit(parser: Parser): org.sireum.lang.ast.TopUnit = {
      val r = parser.parse_langastTopUnit()
      return r
    }
    val r = to(s, f_langastTopUnit _)
    return r
  }

  def from_langastTopUnitProgram(o: org.sireum.lang.ast.TopUnit.Program, isCompact: B): String = {
    val st = Printer.print_langastTopUnitProgram(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastTopUnitProgram(s: String): Either[org.sireum.lang.ast.TopUnit.Program, Json.ErrorMsg] = {
    def f_langastTopUnitProgram(parser: Parser): org.sireum.lang.ast.TopUnit.Program = {
      val r = parser.parse_langastTopUnitProgram()
      return r
    }
    val r = to(s, f_langastTopUnitProgram _)
    return r
  }

  def from_langastTopUnitTruthTableUnit(o: org.sireum.lang.ast.TopUnit.TruthTableUnit, isCompact: B): String = {
    val st = Printer.print_langastTopUnitTruthTableUnit(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastTopUnitTruthTableUnit(s: String): Either[org.sireum.lang.ast.TopUnit.TruthTableUnit, Json.ErrorMsg] = {
    def f_langastTopUnitTruthTableUnit(parser: Parser): org.sireum.lang.ast.TopUnit.TruthTableUnit = {
      val r = parser.parse_langastTopUnitTruthTableUnit()
      return r
    }
    val r = to(s, f_langastTopUnitTruthTableUnit _)
    return r
  }

  def from_langastStmt(o: org.sireum.lang.ast.Stmt, isCompact: B): String = {
    val st = Printer.print_langastStmt(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastStmt(s: String): Either[org.sireum.lang.ast.Stmt, Json.ErrorMsg] = {
    def f_langastStmt(parser: Parser): org.sireum.lang.ast.Stmt = {
      val r = parser.parse_langastStmt()
      return r
    }
    val r = to(s, f_langastStmt _)
    return r
  }

  def from_langastHasModifies(o: org.sireum.lang.ast.HasModifies, isCompact: B): String = {
    val st = Printer.print_langastHasModifies(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastHasModifies(s: String): Either[org.sireum.lang.ast.HasModifies, Json.ErrorMsg] = {
    def f_langastHasModifies(parser: Parser): org.sireum.lang.ast.HasModifies = {
      val r = parser.parse_langastHasModifies()
      return r
    }
    val r = to(s, f_langastHasModifies _)
    return r
  }

  def from_langastLoopContract(o: org.sireum.lang.ast.LoopContract, isCompact: B): String = {
    val st = Printer.print_langastLoopContract(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastLoopContract(s: String): Either[org.sireum.lang.ast.LoopContract, Json.ErrorMsg] = {
    def f_langastLoopContract(parser: Parser): org.sireum.lang.ast.LoopContract = {
      val r = parser.parse_langastLoopContract()
      return r
    }
    val r = to(s, f_langastLoopContract _)
    return r
  }

  def from_langastStmtImport(o: org.sireum.lang.ast.Stmt.Import, isCompact: B): String = {
    val st = Printer.print_langastStmtImport(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastStmtImport(s: String): Either[org.sireum.lang.ast.Stmt.Import, Json.ErrorMsg] = {
    def f_langastStmtImport(parser: Parser): org.sireum.lang.ast.Stmt.Import = {
      val r = parser.parse_langastStmtImport()
      return r
    }
    val r = to(s, f_langastStmtImport _)
    return r
  }

  def from_langastStmtImportImporter(o: org.sireum.lang.ast.Stmt.Import.Importer, isCompact: B): String = {
    val st = Printer.print_langastStmtImportImporter(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastStmtImportImporter(s: String): Either[org.sireum.lang.ast.Stmt.Import.Importer, Json.ErrorMsg] = {
    def f_langastStmtImportImporter(parser: Parser): org.sireum.lang.ast.Stmt.Import.Importer = {
      val r = parser.parse_langastStmtImportImporter()
      return r
    }
    val r = to(s, f_langastStmtImportImporter _)
    return r
  }

  def from_langastStmtImportSelector(o: org.sireum.lang.ast.Stmt.Import.Selector, isCompact: B): String = {
    val st = Printer.print_langastStmtImportSelector(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastStmtImportSelector(s: String): Either[org.sireum.lang.ast.Stmt.Import.Selector, Json.ErrorMsg] = {
    def f_langastStmtImportSelector(parser: Parser): org.sireum.lang.ast.Stmt.Import.Selector = {
      val r = parser.parse_langastStmtImportSelector()
      return r
    }
    val r = to(s, f_langastStmtImportSelector _)
    return r
  }

  def from_langastStmtImportMultiSelector(o: org.sireum.lang.ast.Stmt.Import.MultiSelector, isCompact: B): String = {
    val st = Printer.print_langastStmtImportMultiSelector(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastStmtImportMultiSelector(s: String): Either[org.sireum.lang.ast.Stmt.Import.MultiSelector, Json.ErrorMsg] = {
    def f_langastStmtImportMultiSelector(parser: Parser): org.sireum.lang.ast.Stmt.Import.MultiSelector = {
      val r = parser.parse_langastStmtImportMultiSelector()
      return r
    }
    val r = to(s, f_langastStmtImportMultiSelector _)
    return r
  }

  def from_langastStmtImportWildcardSelector(o: org.sireum.lang.ast.Stmt.Import.WildcardSelector, isCompact: B): String = {
    val st = Printer.print_langastStmtImportWildcardSelector(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastStmtImportWildcardSelector(s: String): Either[org.sireum.lang.ast.Stmt.Import.WildcardSelector, Json.ErrorMsg] = {
    def f_langastStmtImportWildcardSelector(parser: Parser): org.sireum.lang.ast.Stmt.Import.WildcardSelector = {
      val r = parser.parse_langastStmtImportWildcardSelector()
      return r
    }
    val r = to(s, f_langastStmtImportWildcardSelector _)
    return r
  }

  def from_langastStmtImportNamedSelector(o: org.sireum.lang.ast.Stmt.Import.NamedSelector, isCompact: B): String = {
    val st = Printer.print_langastStmtImportNamedSelector(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastStmtImportNamedSelector(s: String): Either[org.sireum.lang.ast.Stmt.Import.NamedSelector, Json.ErrorMsg] = {
    def f_langastStmtImportNamedSelector(parser: Parser): org.sireum.lang.ast.Stmt.Import.NamedSelector = {
      val r = parser.parse_langastStmtImportNamedSelector()
      return r
    }
    val r = to(s, f_langastStmtImportNamedSelector _)
    return r
  }

  def from_langastStmtVar(o: org.sireum.lang.ast.Stmt.Var, isCompact: B): String = {
    val st = Printer.print_langastStmtVar(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastStmtVar(s: String): Either[org.sireum.lang.ast.Stmt.Var, Json.ErrorMsg] = {
    def f_langastStmtVar(parser: Parser): org.sireum.lang.ast.Stmt.Var = {
      val r = parser.parse_langastStmtVar()
      return r
    }
    val r = to(s, f_langastStmtVar _)
    return r
  }

  def from_langastStmtVarPattern(o: org.sireum.lang.ast.Stmt.VarPattern, isCompact: B): String = {
    val st = Printer.print_langastStmtVarPattern(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastStmtVarPattern(s: String): Either[org.sireum.lang.ast.Stmt.VarPattern, Json.ErrorMsg] = {
    def f_langastStmtVarPattern(parser: Parser): org.sireum.lang.ast.Stmt.VarPattern = {
      val r = parser.parse_langastStmtVarPattern()
      return r
    }
    val r = to(s, f_langastStmtVarPattern _)
    return r
  }

  def from_langastStmtSpecVar(o: org.sireum.lang.ast.Stmt.SpecVar, isCompact: B): String = {
    val st = Printer.print_langastStmtSpecVar(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastStmtSpecVar(s: String): Either[org.sireum.lang.ast.Stmt.SpecVar, Json.ErrorMsg] = {
    def f_langastStmtSpecVar(parser: Parser): org.sireum.lang.ast.Stmt.SpecVar = {
      val r = parser.parse_langastStmtSpecVar()
      return r
    }
    val r = to(s, f_langastStmtSpecVar _)
    return r
  }

  def from_langastStmtMethod(o: org.sireum.lang.ast.Stmt.Method, isCompact: B): String = {
    val st = Printer.print_langastStmtMethod(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastStmtMethod(s: String): Either[org.sireum.lang.ast.Stmt.Method, Json.ErrorMsg] = {
    def f_langastStmtMethod(parser: Parser): org.sireum.lang.ast.Stmt.Method = {
      val r = parser.parse_langastStmtMethod()
      return r
    }
    val r = to(s, f_langastStmtMethod _)
    return r
  }

  def from_langastStmtExtMethod(o: org.sireum.lang.ast.Stmt.ExtMethod, isCompact: B): String = {
    val st = Printer.print_langastStmtExtMethod(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastStmtExtMethod(s: String): Either[org.sireum.lang.ast.Stmt.ExtMethod, Json.ErrorMsg] = {
    def f_langastStmtExtMethod(parser: Parser): org.sireum.lang.ast.Stmt.ExtMethod = {
      val r = parser.parse_langastStmtExtMethod()
      return r
    }
    val r = to(s, f_langastStmtExtMethod _)
    return r
  }

  def from_langastStmtJustMethod(o: org.sireum.lang.ast.Stmt.JustMethod, isCompact: B): String = {
    val st = Printer.print_langastStmtJustMethod(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastStmtJustMethod(s: String): Either[org.sireum.lang.ast.Stmt.JustMethod, Json.ErrorMsg] = {
    def f_langastStmtJustMethod(parser: Parser): org.sireum.lang.ast.Stmt.JustMethod = {
      val r = parser.parse_langastStmtJustMethod()
      return r
    }
    val r = to(s, f_langastStmtJustMethod _)
    return r
  }

  def from_langastStmtSpecMethod(o: org.sireum.lang.ast.Stmt.SpecMethod, isCompact: B): String = {
    val st = Printer.print_langastStmtSpecMethod(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastStmtSpecMethod(s: String): Either[org.sireum.lang.ast.Stmt.SpecMethod, Json.ErrorMsg] = {
    def f_langastStmtSpecMethod(parser: Parser): org.sireum.lang.ast.Stmt.SpecMethod = {
      val r = parser.parse_langastStmtSpecMethod()
      return r
    }
    val r = to(s, f_langastStmtSpecMethod _)
    return r
  }

  def from_langastStmtEnum(o: org.sireum.lang.ast.Stmt.Enum, isCompact: B): String = {
    val st = Printer.print_langastStmtEnum(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastStmtEnum(s: String): Either[org.sireum.lang.ast.Stmt.Enum, Json.ErrorMsg] = {
    def f_langastStmtEnum(parser: Parser): org.sireum.lang.ast.Stmt.Enum = {
      val r = parser.parse_langastStmtEnum()
      return r
    }
    val r = to(s, f_langastStmtEnum _)
    return r
  }

  def from_langastStmtSubZ(o: org.sireum.lang.ast.Stmt.SubZ, isCompact: B): String = {
    val st = Printer.print_langastStmtSubZ(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastStmtSubZ(s: String): Either[org.sireum.lang.ast.Stmt.SubZ, Json.ErrorMsg] = {
    def f_langastStmtSubZ(parser: Parser): org.sireum.lang.ast.Stmt.SubZ = {
      val r = parser.parse_langastStmtSubZ()
      return r
    }
    val r = to(s, f_langastStmtSubZ _)
    return r
  }

  def from_langastStmtObject(o: org.sireum.lang.ast.Stmt.Object, isCompact: B): String = {
    val st = Printer.print_langastStmtObject(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastStmtObject(s: String): Either[org.sireum.lang.ast.Stmt.Object, Json.ErrorMsg] = {
    def f_langastStmtObject(parser: Parser): org.sireum.lang.ast.Stmt.Object = {
      val r = parser.parse_langastStmtObject()
      return r
    }
    val r = to(s, f_langastStmtObject _)
    return r
  }

  def from_langastStmtSig(o: org.sireum.lang.ast.Stmt.Sig, isCompact: B): String = {
    val st = Printer.print_langastStmtSig(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastStmtSig(s: String): Either[org.sireum.lang.ast.Stmt.Sig, Json.ErrorMsg] = {
    def f_langastStmtSig(parser: Parser): org.sireum.lang.ast.Stmt.Sig = {
      val r = parser.parse_langastStmtSig()
      return r
    }
    val r = to(s, f_langastStmtSig _)
    return r
  }

  def from_langastStmtAdt(o: org.sireum.lang.ast.Stmt.Adt, isCompact: B): String = {
    val st = Printer.print_langastStmtAdt(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastStmtAdt(s: String): Either[org.sireum.lang.ast.Stmt.Adt, Json.ErrorMsg] = {
    def f_langastStmtAdt(parser: Parser): org.sireum.lang.ast.Stmt.Adt = {
      val r = parser.parse_langastStmtAdt()
      return r
    }
    val r = to(s, f_langastStmtAdt _)
    return r
  }

  def from_langastStmtTypeAlias(o: org.sireum.lang.ast.Stmt.TypeAlias, isCompact: B): String = {
    val st = Printer.print_langastStmtTypeAlias(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastStmtTypeAlias(s: String): Either[org.sireum.lang.ast.Stmt.TypeAlias, Json.ErrorMsg] = {
    def f_langastStmtTypeAlias(parser: Parser): org.sireum.lang.ast.Stmt.TypeAlias = {
      val r = parser.parse_langastStmtTypeAlias()
      return r
    }
    val r = to(s, f_langastStmtTypeAlias _)
    return r
  }

  def from_langastStmtAssign(o: org.sireum.lang.ast.Stmt.Assign, isCompact: B): String = {
    val st = Printer.print_langastStmtAssign(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastStmtAssign(s: String): Either[org.sireum.lang.ast.Stmt.Assign, Json.ErrorMsg] = {
    def f_langastStmtAssign(parser: Parser): org.sireum.lang.ast.Stmt.Assign = {
      val r = parser.parse_langastStmtAssign()
      return r
    }
    val r = to(s, f_langastStmtAssign _)
    return r
  }

  def from_langastStmtBlock(o: org.sireum.lang.ast.Stmt.Block, isCompact: B): String = {
    val st = Printer.print_langastStmtBlock(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastStmtBlock(s: String): Either[org.sireum.lang.ast.Stmt.Block, Json.ErrorMsg] = {
    def f_langastStmtBlock(parser: Parser): org.sireum.lang.ast.Stmt.Block = {
      val r = parser.parse_langastStmtBlock()
      return r
    }
    val r = to(s, f_langastStmtBlock _)
    return r
  }

  def from_langastStmtIf(o: org.sireum.lang.ast.Stmt.If, isCompact: B): String = {
    val st = Printer.print_langastStmtIf(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastStmtIf(s: String): Either[org.sireum.lang.ast.Stmt.If, Json.ErrorMsg] = {
    def f_langastStmtIf(parser: Parser): org.sireum.lang.ast.Stmt.If = {
      val r = parser.parse_langastStmtIf()
      return r
    }
    val r = to(s, f_langastStmtIf _)
    return r
  }

  def from_langastStmtMatch(o: org.sireum.lang.ast.Stmt.Match, isCompact: B): String = {
    val st = Printer.print_langastStmtMatch(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastStmtMatch(s: String): Either[org.sireum.lang.ast.Stmt.Match, Json.ErrorMsg] = {
    def f_langastStmtMatch(parser: Parser): org.sireum.lang.ast.Stmt.Match = {
      val r = parser.parse_langastStmtMatch()
      return r
    }
    val r = to(s, f_langastStmtMatch _)
    return r
  }

  def from_langastStmtWhile(o: org.sireum.lang.ast.Stmt.While, isCompact: B): String = {
    val st = Printer.print_langastStmtWhile(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastStmtWhile(s: String): Either[org.sireum.lang.ast.Stmt.While, Json.ErrorMsg] = {
    def f_langastStmtWhile(parser: Parser): org.sireum.lang.ast.Stmt.While = {
      val r = parser.parse_langastStmtWhile()
      return r
    }
    val r = to(s, f_langastStmtWhile _)
    return r
  }

  def from_langastStmtDoWhile(o: org.sireum.lang.ast.Stmt.DoWhile, isCompact: B): String = {
    val st = Printer.print_langastStmtDoWhile(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastStmtDoWhile(s: String): Either[org.sireum.lang.ast.Stmt.DoWhile, Json.ErrorMsg] = {
    def f_langastStmtDoWhile(parser: Parser): org.sireum.lang.ast.Stmt.DoWhile = {
      val r = parser.parse_langastStmtDoWhile()
      return r
    }
    val r = to(s, f_langastStmtDoWhile _)
    return r
  }

  def from_langastStmtFor(o: org.sireum.lang.ast.Stmt.For, isCompact: B): String = {
    val st = Printer.print_langastStmtFor(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastStmtFor(s: String): Either[org.sireum.lang.ast.Stmt.For, Json.ErrorMsg] = {
    def f_langastStmtFor(parser: Parser): org.sireum.lang.ast.Stmt.For = {
      val r = parser.parse_langastStmtFor()
      return r
    }
    val r = to(s, f_langastStmtFor _)
    return r
  }

  def from_langastStmtReturn(o: org.sireum.lang.ast.Stmt.Return, isCompact: B): String = {
    val st = Printer.print_langastStmtReturn(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastStmtReturn(s: String): Either[org.sireum.lang.ast.Stmt.Return, Json.ErrorMsg] = {
    def f_langastStmtReturn(parser: Parser): org.sireum.lang.ast.Stmt.Return = {
      val r = parser.parse_langastStmtReturn()
      return r
    }
    val r = to(s, f_langastStmtReturn _)
    return r
  }

  def from_langastStmtExpr(o: org.sireum.lang.ast.Stmt.Expr, isCompact: B): String = {
    val st = Printer.print_langastStmtExpr(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastStmtExpr(s: String): Either[org.sireum.lang.ast.Stmt.Expr, Json.ErrorMsg] = {
    def f_langastStmtExpr(parser: Parser): org.sireum.lang.ast.Stmt.Expr = {
      val r = parser.parse_langastStmtExpr()
      return r
    }
    val r = to(s, f_langastStmtExpr _)
    return r
  }

  def from_langastStmtSpec(o: org.sireum.lang.ast.Stmt.Spec, isCompact: B): String = {
    val st = Printer.print_langastStmtSpec(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastStmtSpec(s: String): Either[org.sireum.lang.ast.Stmt.Spec, Json.ErrorMsg] = {
    def f_langastStmtSpec(parser: Parser): org.sireum.lang.ast.Stmt.Spec = {
      val r = parser.parse_langastStmtSpec()
      return r
    }
    val r = to(s, f_langastStmtSpec _)
    return r
  }

  def from_langastStmtFact(o: org.sireum.lang.ast.Stmt.Fact, isCompact: B): String = {
    val st = Printer.print_langastStmtFact(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastStmtFact(s: String): Either[org.sireum.lang.ast.Stmt.Fact, Json.ErrorMsg] = {
    def f_langastStmtFact(parser: Parser): org.sireum.lang.ast.Stmt.Fact = {
      val r = parser.parse_langastStmtFact()
      return r
    }
    val r = to(s, f_langastStmtFact _)
    return r
  }

  def from_langastStmtInv(o: org.sireum.lang.ast.Stmt.Inv, isCompact: B): String = {
    val st = Printer.print_langastStmtInv(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastStmtInv(s: String): Either[org.sireum.lang.ast.Stmt.Inv, Json.ErrorMsg] = {
    def f_langastStmtInv(parser: Parser): org.sireum.lang.ast.Stmt.Inv = {
      val r = parser.parse_langastStmtInv()
      return r
    }
    val r = to(s, f_langastStmtInv _)
    return r
  }

  def from_langastStmtTheorem(o: org.sireum.lang.ast.Stmt.Theorem, isCompact: B): String = {
    val st = Printer.print_langastStmtTheorem(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastStmtTheorem(s: String): Either[org.sireum.lang.ast.Stmt.Theorem, Json.ErrorMsg] = {
    def f_langastStmtTheorem(parser: Parser): org.sireum.lang.ast.Stmt.Theorem = {
      val r = parser.parse_langastStmtTheorem()
      return r
    }
    val r = to(s, f_langastStmtTheorem _)
    return r
  }

  def from_langastStmtDataRefinement(o: org.sireum.lang.ast.Stmt.DataRefinement, isCompact: B): String = {
    val st = Printer.print_langastStmtDataRefinement(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastStmtDataRefinement(s: String): Either[org.sireum.lang.ast.Stmt.DataRefinement, Json.ErrorMsg] = {
    def f_langastStmtDataRefinement(parser: Parser): org.sireum.lang.ast.Stmt.DataRefinement = {
      val r = parser.parse_langastStmtDataRefinement()
      return r
    }
    val r = to(s, f_langastStmtDataRefinement _)
    return r
  }

  def from_langastStmtSpecLabel(o: org.sireum.lang.ast.Stmt.SpecLabel, isCompact: B): String = {
    val st = Printer.print_langastStmtSpecLabel(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastStmtSpecLabel(s: String): Either[org.sireum.lang.ast.Stmt.SpecLabel, Json.ErrorMsg] = {
    def f_langastStmtSpecLabel(parser: Parser): org.sireum.lang.ast.Stmt.SpecLabel = {
      val r = parser.parse_langastStmtSpecLabel()
      return r
    }
    val r = to(s, f_langastStmtSpecLabel _)
    return r
  }

  def from_langastStmtSpecBlock(o: org.sireum.lang.ast.Stmt.SpecBlock, isCompact: B): String = {
    val st = Printer.print_langastStmtSpecBlock(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastStmtSpecBlock(s: String): Either[org.sireum.lang.ast.Stmt.SpecBlock, Json.ErrorMsg] = {
    def f_langastStmtSpecBlock(parser: Parser): org.sireum.lang.ast.Stmt.SpecBlock = {
      val r = parser.parse_langastStmtSpecBlock()
      return r
    }
    val r = to(s, f_langastStmtSpecBlock _)
    return r
  }

  def from_langastStmtDeduceSequent(o: org.sireum.lang.ast.Stmt.DeduceSequent, isCompact: B): String = {
    val st = Printer.print_langastStmtDeduceSequent(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastStmtDeduceSequent(s: String): Either[org.sireum.lang.ast.Stmt.DeduceSequent, Json.ErrorMsg] = {
    def f_langastStmtDeduceSequent(parser: Parser): org.sireum.lang.ast.Stmt.DeduceSequent = {
      val r = parser.parse_langastStmtDeduceSequent()
      return r
    }
    val r = to(s, f_langastStmtDeduceSequent _)
    return r
  }

  def from_langastStmtDeduceSteps(o: org.sireum.lang.ast.Stmt.DeduceSteps, isCompact: B): String = {
    val st = Printer.print_langastStmtDeduceSteps(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastStmtDeduceSteps(s: String): Either[org.sireum.lang.ast.Stmt.DeduceSteps, Json.ErrorMsg] = {
    def f_langastStmtDeduceSteps(parser: Parser): org.sireum.lang.ast.Stmt.DeduceSteps = {
      val r = parser.parse_langastStmtDeduceSteps()
      return r
    }
    val r = to(s, f_langastStmtDeduceSteps _)
    return r
  }

  def from_langastStmtHavoc(o: org.sireum.lang.ast.Stmt.Havoc, isCompact: B): String = {
    val st = Printer.print_langastStmtHavoc(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastStmtHavoc(s: String): Either[org.sireum.lang.ast.Stmt.Havoc, Json.ErrorMsg] = {
    def f_langastStmtHavoc(parser: Parser): org.sireum.lang.ast.Stmt.Havoc = {
      val r = parser.parse_langastStmtHavoc()
      return r
    }
    val r = to(s, f_langastStmtHavoc _)
    return r
  }

  def from_langastMethodContract(o: org.sireum.lang.ast.MethodContract, isCompact: B): String = {
    val st = Printer.print_langastMethodContract(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastMethodContract(s: String): Either[org.sireum.lang.ast.MethodContract, Json.ErrorMsg] = {
    def f_langastMethodContract(parser: Parser): org.sireum.lang.ast.MethodContract = {
      val r = parser.parse_langastMethodContract()
      return r
    }
    val r = to(s, f_langastMethodContract _)
    return r
  }

  def from_langastMethodContractAccesses(o: org.sireum.lang.ast.MethodContract.Accesses, isCompact: B): String = {
    val st = Printer.print_langastMethodContractAccesses(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastMethodContractAccesses(s: String): Either[org.sireum.lang.ast.MethodContract.Accesses, Json.ErrorMsg] = {
    def f_langastMethodContractAccesses(parser: Parser): org.sireum.lang.ast.MethodContract.Accesses = {
      val r = parser.parse_langastMethodContractAccesses()
      return r
    }
    val r = to(s, f_langastMethodContractAccesses _)
    return r
  }

  def from_langastMethodContractClaims(o: org.sireum.lang.ast.MethodContract.Claims, isCompact: B): String = {
    val st = Printer.print_langastMethodContractClaims(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastMethodContractClaims(s: String): Either[org.sireum.lang.ast.MethodContract.Claims, Json.ErrorMsg] = {
    def f_langastMethodContractClaims(parser: Parser): org.sireum.lang.ast.MethodContract.Claims = {
      val r = parser.parse_langastMethodContractClaims()
      return r
    }
    val r = to(s, f_langastMethodContractClaims _)
    return r
  }

  def from_langastMethodContractSimple(o: org.sireum.lang.ast.MethodContract.Simple, isCompact: B): String = {
    val st = Printer.print_langastMethodContractSimple(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastMethodContractSimple(s: String): Either[org.sireum.lang.ast.MethodContract.Simple, Json.ErrorMsg] = {
    def f_langastMethodContractSimple(parser: Parser): org.sireum.lang.ast.MethodContract.Simple = {
      val r = parser.parse_langastMethodContractSimple()
      return r
    }
    val r = to(s, f_langastMethodContractSimple _)
    return r
  }

  def from_langastMethodContractCases(o: org.sireum.lang.ast.MethodContract.Cases, isCompact: B): String = {
    val st = Printer.print_langastMethodContractCases(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastMethodContractCases(s: String): Either[org.sireum.lang.ast.MethodContract.Cases, Json.ErrorMsg] = {
    def f_langastMethodContractCases(parser: Parser): org.sireum.lang.ast.MethodContract.Cases = {
      val r = parser.parse_langastMethodContractCases()
      return r
    }
    val r = to(s, f_langastMethodContractCases _)
    return r
  }

  def from_langastMethodContractCase(o: org.sireum.lang.ast.MethodContract.Case, isCompact: B): String = {
    val st = Printer.print_langastMethodContractCase(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastMethodContractCase(s: String): Either[org.sireum.lang.ast.MethodContract.Case, Json.ErrorMsg] = {
    def f_langastMethodContractCase(parser: Parser): org.sireum.lang.ast.MethodContract.Case = {
      val r = parser.parse_langastMethodContractCase()
      return r
    }
    val r = to(s, f_langastMethodContractCase _)
    return r
  }

  def from_langastMethodContractInfoFlowElement(o: org.sireum.lang.ast.MethodContract.InfoFlowElement, isCompact: B): String = {
    val st = Printer.print_langastMethodContractInfoFlowElement(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastMethodContractInfoFlowElement(s: String): Either[org.sireum.lang.ast.MethodContract.InfoFlowElement, Json.ErrorMsg] = {
    def f_langastMethodContractInfoFlowElement(parser: Parser): org.sireum.lang.ast.MethodContract.InfoFlowElement = {
      val r = parser.parse_langastMethodContractInfoFlowElement()
      return r
    }
    val r = to(s, f_langastMethodContractInfoFlowElement _)
    return r
  }

  def from_langastMethodContractInfoFlows(o: org.sireum.lang.ast.MethodContract.InfoFlows, isCompact: B): String = {
    val st = Printer.print_langastMethodContractInfoFlows(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastMethodContractInfoFlows(s: String): Either[org.sireum.lang.ast.MethodContract.InfoFlows, Json.ErrorMsg] = {
    def f_langastMethodContractInfoFlows(parser: Parser): org.sireum.lang.ast.MethodContract.InfoFlows = {
      val r = parser.parse_langastMethodContractInfoFlows()
      return r
    }
    val r = to(s, f_langastMethodContractInfoFlows _)
    return r
  }

  def from_langastMethodContractInfoFlowGroup(o: org.sireum.lang.ast.MethodContract.InfoFlowGroup, isCompact: B): String = {
    val st = Printer.print_langastMethodContractInfoFlowGroup(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastMethodContractInfoFlowGroup(s: String): Either[org.sireum.lang.ast.MethodContract.InfoFlowGroup, Json.ErrorMsg] = {
    def f_langastMethodContractInfoFlowGroup(parser: Parser): org.sireum.lang.ast.MethodContract.InfoFlowGroup = {
      val r = parser.parse_langastMethodContractInfoFlowGroup()
      return r
    }
    val r = to(s, f_langastMethodContractInfoFlowGroup _)
    return r
  }

  def from_langastMethodContractInfoFlowFlow(o: org.sireum.lang.ast.MethodContract.InfoFlowFlow, isCompact: B): String = {
    val st = Printer.print_langastMethodContractInfoFlowFlow(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastMethodContractInfoFlowFlow(s: String): Either[org.sireum.lang.ast.MethodContract.InfoFlowFlow, Json.ErrorMsg] = {
    def f_langastMethodContractInfoFlowFlow(parser: Parser): org.sireum.lang.ast.MethodContract.InfoFlowFlow = {
      val r = parser.parse_langastMethodContractInfoFlowFlow()
      return r
    }
    val r = to(s, f_langastMethodContractInfoFlowFlow _)
    return r
  }

  def from_langastMethodContractInfoFlowCase(o: org.sireum.lang.ast.MethodContract.InfoFlowCase, isCompact: B): String = {
    val st = Printer.print_langastMethodContractInfoFlowCase(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastMethodContractInfoFlowCase(s: String): Either[org.sireum.lang.ast.MethodContract.InfoFlowCase, Json.ErrorMsg] = {
    def f_langastMethodContractInfoFlowCase(parser: Parser): org.sireum.lang.ast.MethodContract.InfoFlowCase = {
      val r = parser.parse_langastMethodContractInfoFlowCase()
      return r
    }
    val r = to(s, f_langastMethodContractInfoFlowCase _)
    return r
  }

  def from_langastSequent(o: org.sireum.lang.ast.Sequent, isCompact: B): String = {
    val st = Printer.print_langastSequent(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastSequent(s: String): Either[org.sireum.lang.ast.Sequent, Json.ErrorMsg] = {
    def f_langastSequent(parser: Parser): org.sireum.lang.ast.Sequent = {
      val r = parser.parse_langastSequent()
      return r
    }
    val r = to(s, f_langastSequent _)
    return r
  }

  def from_langastProofAst(o: org.sireum.lang.ast.ProofAst, isCompact: B): String = {
    val st = Printer.print_langastProofAst(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastProofAst(s: String): Either[org.sireum.lang.ast.ProofAst, Json.ErrorMsg] = {
    def f_langastProofAst(parser: Parser): org.sireum.lang.ast.ProofAst = {
      val r = parser.parse_langastProofAst()
      return r
    }
    val r = to(s, f_langastProofAst _)
    return r
  }

  def from_langastProofAstStep(o: org.sireum.lang.ast.ProofAst.Step, isCompact: B): String = {
    val st = Printer.print_langastProofAstStep(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastProofAstStep(s: String): Either[org.sireum.lang.ast.ProofAst.Step, Json.ErrorMsg] = {
    def f_langastProofAstStep(parser: Parser): org.sireum.lang.ast.ProofAst.Step = {
      val r = parser.parse_langastProofAstStep()
      return r
    }
    val r = to(s, f_langastProofAstStep _)
    return r
  }

  def from_langastProofAstStepId(o: org.sireum.lang.ast.ProofAst.StepId, isCompact: B): String = {
    val st = Printer.print_langastProofAstStepId(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastProofAstStepId(s: String): Either[org.sireum.lang.ast.ProofAst.StepId, Json.ErrorMsg] = {
    def f_langastProofAstStepId(parser: Parser): org.sireum.lang.ast.ProofAst.StepId = {
      val r = parser.parse_langastProofAstStepId()
      return r
    }
    val r = to(s, f_langastProofAstStepId _)
    return r
  }

  def from_langastProofAstStepIdNum(o: org.sireum.lang.ast.ProofAst.StepId.Num, isCompact: B): String = {
    val st = Printer.print_langastProofAstStepIdNum(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastProofAstStepIdNum(s: String): Either[org.sireum.lang.ast.ProofAst.StepId.Num, Json.ErrorMsg] = {
    def f_langastProofAstStepIdNum(parser: Parser): org.sireum.lang.ast.ProofAst.StepId.Num = {
      val r = parser.parse_langastProofAstStepIdNum()
      return r
    }
    val r = to(s, f_langastProofAstStepIdNum _)
    return r
  }

  def from_langastProofAstStepIdStr(o: org.sireum.lang.ast.ProofAst.StepId.Str, isCompact: B): String = {
    val st = Printer.print_langastProofAstStepIdStr(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastProofAstStepIdStr(s: String): Either[org.sireum.lang.ast.ProofAst.StepId.Str, Json.ErrorMsg] = {
    def f_langastProofAstStepIdStr(parser: Parser): org.sireum.lang.ast.ProofAst.StepId.Str = {
      val r = parser.parse_langastProofAstStepIdStr()
      return r
    }
    val r = to(s, f_langastProofAstStepIdStr _)
    return r
  }

  def from_langastProofAstStepRegular(o: org.sireum.lang.ast.ProofAst.Step.Regular, isCompact: B): String = {
    val st = Printer.print_langastProofAstStepRegular(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastProofAstStepRegular(s: String): Either[org.sireum.lang.ast.ProofAst.Step.Regular, Json.ErrorMsg] = {
    def f_langastProofAstStepRegular(parser: Parser): org.sireum.lang.ast.ProofAst.Step.Regular = {
      val r = parser.parse_langastProofAstStepRegular()
      return r
    }
    val r = to(s, f_langastProofAstStepRegular _)
    return r
  }

  def from_langastProofAstStepAssume(o: org.sireum.lang.ast.ProofAst.Step.Assume, isCompact: B): String = {
    val st = Printer.print_langastProofAstStepAssume(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastProofAstStepAssume(s: String): Either[org.sireum.lang.ast.ProofAst.Step.Assume, Json.ErrorMsg] = {
    def f_langastProofAstStepAssume(parser: Parser): org.sireum.lang.ast.ProofAst.Step.Assume = {
      val r = parser.parse_langastProofAstStepAssume()
      return r
    }
    val r = to(s, f_langastProofAstStepAssume _)
    return r
  }

  def from_langastProofAstStepAssert(o: org.sireum.lang.ast.ProofAst.Step.Assert, isCompact: B): String = {
    val st = Printer.print_langastProofAstStepAssert(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastProofAstStepAssert(s: String): Either[org.sireum.lang.ast.ProofAst.Step.Assert, Json.ErrorMsg] = {
    def f_langastProofAstStepAssert(parser: Parser): org.sireum.lang.ast.ProofAst.Step.Assert = {
      val r = parser.parse_langastProofAstStepAssert()
      return r
    }
    val r = to(s, f_langastProofAstStepAssert _)
    return r
  }

  def from_langastProofAstStepSubProof(o: org.sireum.lang.ast.ProofAst.Step.SubProof, isCompact: B): String = {
    val st = Printer.print_langastProofAstStepSubProof(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastProofAstStepSubProof(s: String): Either[org.sireum.lang.ast.ProofAst.Step.SubProof, Json.ErrorMsg] = {
    def f_langastProofAstStepSubProof(parser: Parser): org.sireum.lang.ast.ProofAst.Step.SubProof = {
      val r = parser.parse_langastProofAstStepSubProof()
      return r
    }
    val r = to(s, f_langastProofAstStepSubProof _)
    return r
  }

  def from_langastProofAstStepLet(o: org.sireum.lang.ast.ProofAst.Step.Let, isCompact: B): String = {
    val st = Printer.print_langastProofAstStepLet(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastProofAstStepLet(s: String): Either[org.sireum.lang.ast.ProofAst.Step.Let, Json.ErrorMsg] = {
    def f_langastProofAstStepLet(parser: Parser): org.sireum.lang.ast.ProofAst.Step.Let = {
      val r = parser.parse_langastProofAstStepLet()
      return r
    }
    val r = to(s, f_langastProofAstStepLet _)
    return r
  }

  def from_langastProofAstStepLetParam(o: org.sireum.lang.ast.ProofAst.Step.Let.Param, isCompact: B): String = {
    val st = Printer.print_langastProofAstStepLetParam(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastProofAstStepLetParam(s: String): Either[org.sireum.lang.ast.ProofAst.Step.Let.Param, Json.ErrorMsg] = {
    def f_langastProofAstStepLetParam(parser: Parser): org.sireum.lang.ast.ProofAst.Step.Let.Param = {
      val r = parser.parse_langastProofAstStepLetParam()
      return r
    }
    val r = to(s, f_langastProofAstStepLetParam _)
    return r
  }

  def from_langastProofAstStepStructInduction(o: org.sireum.lang.ast.ProofAst.Step.StructInduction, isCompact: B): String = {
    val st = Printer.print_langastProofAstStepStructInduction(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastProofAstStepStructInduction(s: String): Either[org.sireum.lang.ast.ProofAst.Step.StructInduction, Json.ErrorMsg] = {
    def f_langastProofAstStepStructInduction(parser: Parser): org.sireum.lang.ast.ProofAst.Step.StructInduction = {
      val r = parser.parse_langastProofAstStepStructInduction()
      return r
    }
    val r = to(s, f_langastProofAstStepStructInduction _)
    return r
  }

  def from_langastProofAstStepStructInductionMatchCase(o: org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase, isCompact: B): String = {
    val st = Printer.print_langastProofAstStepStructInductionMatchCase(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastProofAstStepStructInductionMatchCase(s: String): Either[org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase, Json.ErrorMsg] = {
    def f_langastProofAstStepStructInductionMatchCase(parser: Parser): org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase = {
      val r = parser.parse_langastProofAstStepStructInductionMatchCase()
      return r
    }
    val r = to(s, f_langastProofAstStepStructInductionMatchCase _)
    return r
  }

  def from_langastProofAstStepStructInductionMatchDefault(o: org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault, isCompact: B): String = {
    val st = Printer.print_langastProofAstStepStructInductionMatchDefault(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastProofAstStepStructInductionMatchDefault(s: String): Either[org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault, Json.ErrorMsg] = {
    def f_langastProofAstStepStructInductionMatchDefault(parser: Parser): org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault = {
      val r = parser.parse_langastProofAstStepStructInductionMatchDefault()
      return r
    }
    val r = to(s, f_langastProofAstStepStructInductionMatchDefault _)
    return r
  }

  def from_langastProofAstStepJustification(o: org.sireum.lang.ast.ProofAst.Step.Justification, isCompact: B): String = {
    val st = Printer.print_langastProofAstStepJustification(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastProofAstStepJustification(s: String): Either[org.sireum.lang.ast.ProofAst.Step.Justification, Json.ErrorMsg] = {
    def f_langastProofAstStepJustification(parser: Parser): org.sireum.lang.ast.ProofAst.Step.Justification = {
      val r = parser.parse_langastProofAstStepJustification()
      return r
    }
    val r = to(s, f_langastProofAstStepJustification _)
    return r
  }

  def from_langastProofAstStepJustificationRef(o: org.sireum.lang.ast.ProofAst.Step.Justification.Ref, isCompact: B): String = {
    val st = Printer.print_langastProofAstStepJustificationRef(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastProofAstStepJustificationRef(s: String): Either[org.sireum.lang.ast.ProofAst.Step.Justification.Ref, Json.ErrorMsg] = {
    def f_langastProofAstStepJustificationRef(parser: Parser): org.sireum.lang.ast.ProofAst.Step.Justification.Ref = {
      val r = parser.parse_langastProofAstStepJustificationRef()
      return r
    }
    val r = to(s, f_langastProofAstStepJustificationRef _)
    return r
  }

  def from_langastProofAstStepJustificationApply(o: org.sireum.lang.ast.ProofAst.Step.Justification.Apply, isCompact: B): String = {
    val st = Printer.print_langastProofAstStepJustificationApply(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastProofAstStepJustificationApply(s: String): Either[org.sireum.lang.ast.ProofAst.Step.Justification.Apply, Json.ErrorMsg] = {
    def f_langastProofAstStepJustificationApply(parser: Parser): org.sireum.lang.ast.ProofAst.Step.Justification.Apply = {
      val r = parser.parse_langastProofAstStepJustificationApply()
      return r
    }
    val r = to(s, f_langastProofAstStepJustificationApply _)
    return r
  }

  def from_langastProofAstStepJustificationApplyNamed(o: org.sireum.lang.ast.ProofAst.Step.Justification.ApplyNamed, isCompact: B): String = {
    val st = Printer.print_langastProofAstStepJustificationApplyNamed(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastProofAstStepJustificationApplyNamed(s: String): Either[org.sireum.lang.ast.ProofAst.Step.Justification.ApplyNamed, Json.ErrorMsg] = {
    def f_langastProofAstStepJustificationApplyNamed(parser: Parser): org.sireum.lang.ast.ProofAst.Step.Justification.ApplyNamed = {
      val r = parser.parse_langastProofAstStepJustificationApplyNamed()
      return r
    }
    val r = to(s, f_langastProofAstStepJustificationApplyNamed _)
    return r
  }

  def from_langastProofAstStepJustificationApplyEta(o: org.sireum.lang.ast.ProofAst.Step.Justification.ApplyEta, isCompact: B): String = {
    val st = Printer.print_langastProofAstStepJustificationApplyEta(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastProofAstStepJustificationApplyEta(s: String): Either[org.sireum.lang.ast.ProofAst.Step.Justification.ApplyEta, Json.ErrorMsg] = {
    def f_langastProofAstStepJustificationApplyEta(parser: Parser): org.sireum.lang.ast.ProofAst.Step.Justification.ApplyEta = {
      val r = parser.parse_langastProofAstStepJustificationApplyEta()
      return r
    }
    val r = to(s, f_langastProofAstStepJustificationApplyEta _)
    return r
  }

  def from_langastAssignExp(o: org.sireum.lang.ast.AssignExp, isCompact: B): String = {
    val st = Printer.print_langastAssignExp(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastAssignExp(s: String): Either[org.sireum.lang.ast.AssignExp, Json.ErrorMsg] = {
    def f_langastAssignExp(parser: Parser): org.sireum.lang.ast.AssignExp = {
      val r = parser.parse_langastAssignExp()
      return r
    }
    val r = to(s, f_langastAssignExp _)
    return r
  }

  def from_langastCase(o: org.sireum.lang.ast.Case, isCompact: B): String = {
    val st = Printer.print_langastCase(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastCase(s: String): Either[org.sireum.lang.ast.Case, Json.ErrorMsg] = {
    def f_langastCase(parser: Parser): org.sireum.lang.ast.Case = {
      val r = parser.parse_langastCase()
      return r
    }
    val r = to(s, f_langastCase _)
    return r
  }

  def from_langastEnumGenRange(o: org.sireum.lang.ast.EnumGen.Range, isCompact: B): String = {
    val st = Printer.print_langastEnumGenRange(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastEnumGenRange(s: String): Either[org.sireum.lang.ast.EnumGen.Range, Json.ErrorMsg] = {
    def f_langastEnumGenRange(parser: Parser): org.sireum.lang.ast.EnumGen.Range = {
      val r = parser.parse_langastEnumGenRange()
      return r
    }
    val r = to(s, f_langastEnumGenRange _)
    return r
  }

  def from_langastEnumGenRangeExpr(o: org.sireum.lang.ast.EnumGen.Range.Expr, isCompact: B): String = {
    val st = Printer.print_langastEnumGenRangeExpr(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastEnumGenRangeExpr(s: String): Either[org.sireum.lang.ast.EnumGen.Range.Expr, Json.ErrorMsg] = {
    def f_langastEnumGenRangeExpr(parser: Parser): org.sireum.lang.ast.EnumGen.Range.Expr = {
      val r = parser.parse_langastEnumGenRangeExpr()
      return r
    }
    val r = to(s, f_langastEnumGenRangeExpr _)
    return r
  }

  def from_langastEnumGenRangeStep(o: org.sireum.lang.ast.EnumGen.Range.Step, isCompact: B): String = {
    val st = Printer.print_langastEnumGenRangeStep(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastEnumGenRangeStep(s: String): Either[org.sireum.lang.ast.EnumGen.Range.Step, Json.ErrorMsg] = {
    def f_langastEnumGenRangeStep(parser: Parser): org.sireum.lang.ast.EnumGen.Range.Step = {
      val r = parser.parse_langastEnumGenRangeStep()
      return r
    }
    val r = to(s, f_langastEnumGenRangeStep _)
    return r
  }

  def from_langastEnumGenFor(o: org.sireum.lang.ast.EnumGen.For, isCompact: B): String = {
    val st = Printer.print_langastEnumGenFor(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastEnumGenFor(s: String): Either[org.sireum.lang.ast.EnumGen.For, Json.ErrorMsg] = {
    def f_langastEnumGenFor(parser: Parser): org.sireum.lang.ast.EnumGen.For = {
      val r = parser.parse_langastEnumGenFor()
      return r
    }
    val r = to(s, f_langastEnumGenFor _)
    return r
  }

  def from_langastType(o: org.sireum.lang.ast.Type, isCompact: B): String = {
    val st = Printer.print_langastType(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastType(s: String): Either[org.sireum.lang.ast.Type, Json.ErrorMsg] = {
    def f_langastType(parser: Parser): org.sireum.lang.ast.Type = {
      val r = parser.parse_langastType()
      return r
    }
    val r = to(s, f_langastType _)
    return r
  }

  def from_langastTypeNamed(o: org.sireum.lang.ast.Type.Named, isCompact: B): String = {
    val st = Printer.print_langastTypeNamed(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastTypeNamed(s: String): Either[org.sireum.lang.ast.Type.Named, Json.ErrorMsg] = {
    def f_langastTypeNamed(parser: Parser): org.sireum.lang.ast.Type.Named = {
      val r = parser.parse_langastTypeNamed()
      return r
    }
    val r = to(s, f_langastTypeNamed _)
    return r
  }

  def from_langastTypeFun(o: org.sireum.lang.ast.Type.Fun, isCompact: B): String = {
    val st = Printer.print_langastTypeFun(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastTypeFun(s: String): Either[org.sireum.lang.ast.Type.Fun, Json.ErrorMsg] = {
    def f_langastTypeFun(parser: Parser): org.sireum.lang.ast.Type.Fun = {
      val r = parser.parse_langastTypeFun()
      return r
    }
    val r = to(s, f_langastTypeFun _)
    return r
  }

  def from_langastTypeTuple(o: org.sireum.lang.ast.Type.Tuple, isCompact: B): String = {
    val st = Printer.print_langastTypeTuple(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastTypeTuple(s: String): Either[org.sireum.lang.ast.Type.Tuple, Json.ErrorMsg] = {
    def f_langastTypeTuple(parser: Parser): org.sireum.lang.ast.Type.Tuple = {
      val r = parser.parse_langastTypeTuple()
      return r
    }
    val r = to(s, f_langastTypeTuple _)
    return r
  }

  def from_langastPattern(o: org.sireum.lang.ast.Pattern, isCompact: B): String = {
    val st = Printer.print_langastPattern(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastPattern(s: String): Either[org.sireum.lang.ast.Pattern, Json.ErrorMsg] = {
    def f_langastPattern(parser: Parser): org.sireum.lang.ast.Pattern = {
      val r = parser.parse_langastPattern()
      return r
    }
    val r = to(s, f_langastPattern _)
    return r
  }

  def from_langastPatternLiteral(o: org.sireum.lang.ast.Pattern.Literal, isCompact: B): String = {
    val st = Printer.print_langastPatternLiteral(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastPatternLiteral(s: String): Either[org.sireum.lang.ast.Pattern.Literal, Json.ErrorMsg] = {
    def f_langastPatternLiteral(parser: Parser): org.sireum.lang.ast.Pattern.Literal = {
      val r = parser.parse_langastPatternLiteral()
      return r
    }
    val r = to(s, f_langastPatternLiteral _)
    return r
  }

  def from_langastPatternLitInterpolate(o: org.sireum.lang.ast.Pattern.LitInterpolate, isCompact: B): String = {
    val st = Printer.print_langastPatternLitInterpolate(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastPatternLitInterpolate(s: String): Either[org.sireum.lang.ast.Pattern.LitInterpolate, Json.ErrorMsg] = {
    def f_langastPatternLitInterpolate(parser: Parser): org.sireum.lang.ast.Pattern.LitInterpolate = {
      val r = parser.parse_langastPatternLitInterpolate()
      return r
    }
    val r = to(s, f_langastPatternLitInterpolate _)
    return r
  }

  def from_langastPatternRef(o: org.sireum.lang.ast.Pattern.Ref, isCompact: B): String = {
    val st = Printer.print_langastPatternRef(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastPatternRef(s: String): Either[org.sireum.lang.ast.Pattern.Ref, Json.ErrorMsg] = {
    def f_langastPatternRef(parser: Parser): org.sireum.lang.ast.Pattern.Ref = {
      val r = parser.parse_langastPatternRef()
      return r
    }
    val r = to(s, f_langastPatternRef _)
    return r
  }

  def from_langastPatternVarBinding(o: org.sireum.lang.ast.Pattern.VarBinding, isCompact: B): String = {
    val st = Printer.print_langastPatternVarBinding(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastPatternVarBinding(s: String): Either[org.sireum.lang.ast.Pattern.VarBinding, Json.ErrorMsg] = {
    def f_langastPatternVarBinding(parser: Parser): org.sireum.lang.ast.Pattern.VarBinding = {
      val r = parser.parse_langastPatternVarBinding()
      return r
    }
    val r = to(s, f_langastPatternVarBinding _)
    return r
  }

  def from_langastPatternWildcard(o: org.sireum.lang.ast.Pattern.Wildcard, isCompact: B): String = {
    val st = Printer.print_langastPatternWildcard(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastPatternWildcard(s: String): Either[org.sireum.lang.ast.Pattern.Wildcard, Json.ErrorMsg] = {
    def f_langastPatternWildcard(parser: Parser): org.sireum.lang.ast.Pattern.Wildcard = {
      val r = parser.parse_langastPatternWildcard()
      return r
    }
    val r = to(s, f_langastPatternWildcard _)
    return r
  }

  def from_langastPatternSeqWildcard(o: org.sireum.lang.ast.Pattern.SeqWildcard, isCompact: B): String = {
    val st = Printer.print_langastPatternSeqWildcard(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastPatternSeqWildcard(s: String): Either[org.sireum.lang.ast.Pattern.SeqWildcard, Json.ErrorMsg] = {
    def f_langastPatternSeqWildcard(parser: Parser): org.sireum.lang.ast.Pattern.SeqWildcard = {
      val r = parser.parse_langastPatternSeqWildcard()
      return r
    }
    val r = to(s, f_langastPatternSeqWildcard _)
    return r
  }

  def from_langastPatternStructure(o: org.sireum.lang.ast.Pattern.Structure, isCompact: B): String = {
    val st = Printer.print_langastPatternStructure(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastPatternStructure(s: String): Either[org.sireum.lang.ast.Pattern.Structure, Json.ErrorMsg] = {
    def f_langastPatternStructure(parser: Parser): org.sireum.lang.ast.Pattern.Structure = {
      val r = parser.parse_langastPatternStructure()
      return r
    }
    val r = to(s, f_langastPatternStructure _)
    return r
  }

  def from_langastExp(o: org.sireum.lang.ast.Exp, isCompact: B): String = {
    val st = Printer.print_langastExp(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExp(s: String): Either[org.sireum.lang.ast.Exp, Json.ErrorMsg] = {
    def f_langastExp(parser: Parser): org.sireum.lang.ast.Exp = {
      val r = parser.parse_langastExp()
      return r
    }
    val r = to(s, f_langastExp _)
    return r
  }

  def from_langastLit(o: org.sireum.lang.ast.Lit, isCompact: B): String = {
    val st = Printer.print_langastLit(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastLit(s: String): Either[org.sireum.lang.ast.Lit, Json.ErrorMsg] = {
    def f_langastLit(parser: Parser): org.sireum.lang.ast.Lit = {
      val r = parser.parse_langastLit()
      return r
    }
    val r = to(s, f_langastLit _)
    return r
  }

  def from_langastExpLitB(o: org.sireum.lang.ast.Exp.LitB, isCompact: B): String = {
    val st = Printer.print_langastExpLitB(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpLitB(s: String): Either[org.sireum.lang.ast.Exp.LitB, Json.ErrorMsg] = {
    def f_langastExpLitB(parser: Parser): org.sireum.lang.ast.Exp.LitB = {
      val r = parser.parse_langastExpLitB()
      return r
    }
    val r = to(s, f_langastExpLitB _)
    return r
  }

  def from_langastExpLitC(o: org.sireum.lang.ast.Exp.LitC, isCompact: B): String = {
    val st = Printer.print_langastExpLitC(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpLitC(s: String): Either[org.sireum.lang.ast.Exp.LitC, Json.ErrorMsg] = {
    def f_langastExpLitC(parser: Parser): org.sireum.lang.ast.Exp.LitC = {
      val r = parser.parse_langastExpLitC()
      return r
    }
    val r = to(s, f_langastExpLitC _)
    return r
  }

  def from_langastExpLitZ(o: org.sireum.lang.ast.Exp.LitZ, isCompact: B): String = {
    val st = Printer.print_langastExpLitZ(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpLitZ(s: String): Either[org.sireum.lang.ast.Exp.LitZ, Json.ErrorMsg] = {
    def f_langastExpLitZ(parser: Parser): org.sireum.lang.ast.Exp.LitZ = {
      val r = parser.parse_langastExpLitZ()
      return r
    }
    val r = to(s, f_langastExpLitZ _)
    return r
  }

  def from_langastExpLitF32(o: org.sireum.lang.ast.Exp.LitF32, isCompact: B): String = {
    val st = Printer.print_langastExpLitF32(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpLitF32(s: String): Either[org.sireum.lang.ast.Exp.LitF32, Json.ErrorMsg] = {
    def f_langastExpLitF32(parser: Parser): org.sireum.lang.ast.Exp.LitF32 = {
      val r = parser.parse_langastExpLitF32()
      return r
    }
    val r = to(s, f_langastExpLitF32 _)
    return r
  }

  def from_langastExpLitF64(o: org.sireum.lang.ast.Exp.LitF64, isCompact: B): String = {
    val st = Printer.print_langastExpLitF64(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpLitF64(s: String): Either[org.sireum.lang.ast.Exp.LitF64, Json.ErrorMsg] = {
    def f_langastExpLitF64(parser: Parser): org.sireum.lang.ast.Exp.LitF64 = {
      val r = parser.parse_langastExpLitF64()
      return r
    }
    val r = to(s, f_langastExpLitF64 _)
    return r
  }

  def from_langastExpLitR(o: org.sireum.lang.ast.Exp.LitR, isCompact: B): String = {
    val st = Printer.print_langastExpLitR(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpLitR(s: String): Either[org.sireum.lang.ast.Exp.LitR, Json.ErrorMsg] = {
    def f_langastExpLitR(parser: Parser): org.sireum.lang.ast.Exp.LitR = {
      val r = parser.parse_langastExpLitR()
      return r
    }
    val r = to(s, f_langastExpLitR _)
    return r
  }

  def from_langastExpLitString(o: org.sireum.lang.ast.Exp.LitString, isCompact: B): String = {
    val st = Printer.print_langastExpLitString(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpLitString(s: String): Either[org.sireum.lang.ast.Exp.LitString, Json.ErrorMsg] = {
    def f_langastExpLitString(parser: Parser): org.sireum.lang.ast.Exp.LitString = {
      val r = parser.parse_langastExpLitString()
      return r
    }
    val r = to(s, f_langastExpLitString _)
    return r
  }

  def from_langastExpStringInterpolate(o: org.sireum.lang.ast.Exp.StringInterpolate, isCompact: B): String = {
    val st = Printer.print_langastExpStringInterpolate(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpStringInterpolate(s: String): Either[org.sireum.lang.ast.Exp.StringInterpolate, Json.ErrorMsg] = {
    def f_langastExpStringInterpolate(parser: Parser): org.sireum.lang.ast.Exp.StringInterpolate = {
      val r = parser.parse_langastExpStringInterpolate()
      return r
    }
    val r = to(s, f_langastExpStringInterpolate _)
    return r
  }

  def from_langastExpThis(o: org.sireum.lang.ast.Exp.This, isCompact: B): String = {
    val st = Printer.print_langastExpThis(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpThis(s: String): Either[org.sireum.lang.ast.Exp.This, Json.ErrorMsg] = {
    def f_langastExpThis(parser: Parser): org.sireum.lang.ast.Exp.This = {
      val r = parser.parse_langastExpThis()
      return r
    }
    val r = to(s, f_langastExpThis _)
    return r
  }

  def from_langastExpSuper(o: org.sireum.lang.ast.Exp.Super, isCompact: B): String = {
    val st = Printer.print_langastExpSuper(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpSuper(s: String): Either[org.sireum.lang.ast.Exp.Super, Json.ErrorMsg] = {
    def f_langastExpSuper(parser: Parser): org.sireum.lang.ast.Exp.Super = {
      val r = parser.parse_langastExpSuper()
      return r
    }
    val r = to(s, f_langastExpSuper _)
    return r
  }

  def from_langastExpUnary(o: org.sireum.lang.ast.Exp.Unary, isCompact: B): String = {
    val st = Printer.print_langastExpUnary(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpUnary(s: String): Either[org.sireum.lang.ast.Exp.Unary, Json.ErrorMsg] = {
    def f_langastExpUnary(parser: Parser): org.sireum.lang.ast.Exp.Unary = {
      val r = parser.parse_langastExpUnary()
      return r
    }
    val r = to(s, f_langastExpUnary _)
    return r
  }

  def from_langastExpRef(o: org.sireum.lang.ast.Exp.Ref, isCompact: B): String = {
    val st = Printer.print_langastExpRef(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpRef(s: String): Either[org.sireum.lang.ast.Exp.Ref, Json.ErrorMsg] = {
    def f_langastExpRef(parser: Parser): org.sireum.lang.ast.Exp.Ref = {
      val r = parser.parse_langastExpRef()
      return r
    }
    val r = to(s, f_langastExpRef _)
    return r
  }

  def from_langastExpBinary(o: org.sireum.lang.ast.Exp.Binary, isCompact: B): String = {
    val st = Printer.print_langastExpBinary(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpBinary(s: String): Either[org.sireum.lang.ast.Exp.Binary, Json.ErrorMsg] = {
    def f_langastExpBinary(parser: Parser): org.sireum.lang.ast.Exp.Binary = {
      val r = parser.parse_langastExpBinary()
      return r
    }
    val r = to(s, f_langastExpBinary _)
    return r
  }

  def from_langastExpIdent(o: org.sireum.lang.ast.Exp.Ident, isCompact: B): String = {
    val st = Printer.print_langastExpIdent(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpIdent(s: String): Either[org.sireum.lang.ast.Exp.Ident, Json.ErrorMsg] = {
    def f_langastExpIdent(parser: Parser): org.sireum.lang.ast.Exp.Ident = {
      val r = parser.parse_langastExpIdent()
      return r
    }
    val r = to(s, f_langastExpIdent _)
    return r
  }

  def from_langastExpEta(o: org.sireum.lang.ast.Exp.Eta, isCompact: B): String = {
    val st = Printer.print_langastExpEta(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpEta(s: String): Either[org.sireum.lang.ast.Exp.Eta, Json.ErrorMsg] = {
    def f_langastExpEta(parser: Parser): org.sireum.lang.ast.Exp.Eta = {
      val r = parser.parse_langastExpEta()
      return r
    }
    val r = to(s, f_langastExpEta _)
    return r
  }

  def from_langastExpTuple(o: org.sireum.lang.ast.Exp.Tuple, isCompact: B): String = {
    val st = Printer.print_langastExpTuple(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpTuple(s: String): Either[org.sireum.lang.ast.Exp.Tuple, Json.ErrorMsg] = {
    def f_langastExpTuple(parser: Parser): org.sireum.lang.ast.Exp.Tuple = {
      val r = parser.parse_langastExpTuple()
      return r
    }
    val r = to(s, f_langastExpTuple _)
    return r
  }

  def from_langastExpSelect(o: org.sireum.lang.ast.Exp.Select, isCompact: B): String = {
    val st = Printer.print_langastExpSelect(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpSelect(s: String): Either[org.sireum.lang.ast.Exp.Select, Json.ErrorMsg] = {
    def f_langastExpSelect(parser: Parser): org.sireum.lang.ast.Exp.Select = {
      val r = parser.parse_langastExpSelect()
      return r
    }
    val r = to(s, f_langastExpSelect _)
    return r
  }

  def from_langastExpInvoke(o: org.sireum.lang.ast.Exp.Invoke, isCompact: B): String = {
    val st = Printer.print_langastExpInvoke(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpInvoke(s: String): Either[org.sireum.lang.ast.Exp.Invoke, Json.ErrorMsg] = {
    def f_langastExpInvoke(parser: Parser): org.sireum.lang.ast.Exp.Invoke = {
      val r = parser.parse_langastExpInvoke()
      return r
    }
    val r = to(s, f_langastExpInvoke _)
    return r
  }

  def from_langastExpInvokeNamed(o: org.sireum.lang.ast.Exp.InvokeNamed, isCompact: B): String = {
    val st = Printer.print_langastExpInvokeNamed(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpInvokeNamed(s: String): Either[org.sireum.lang.ast.Exp.InvokeNamed, Json.ErrorMsg] = {
    def f_langastExpInvokeNamed(parser: Parser): org.sireum.lang.ast.Exp.InvokeNamed = {
      val r = parser.parse_langastExpInvokeNamed()
      return r
    }
    val r = to(s, f_langastExpInvokeNamed _)
    return r
  }

  def from_langastExpIf(o: org.sireum.lang.ast.Exp.If, isCompact: B): String = {
    val st = Printer.print_langastExpIf(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpIf(s: String): Either[org.sireum.lang.ast.Exp.If, Json.ErrorMsg] = {
    def f_langastExpIf(parser: Parser): org.sireum.lang.ast.Exp.If = {
      val r = parser.parse_langastExpIf()
      return r
    }
    val r = to(s, f_langastExpIf _)
    return r
  }

  def from_langastExpTypeCond(o: org.sireum.lang.ast.Exp.TypeCond, isCompact: B): String = {
    val st = Printer.print_langastExpTypeCond(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpTypeCond(s: String): Either[org.sireum.lang.ast.Exp.TypeCond, Json.ErrorMsg] = {
    def f_langastExpTypeCond(parser: Parser): org.sireum.lang.ast.Exp.TypeCond = {
      val r = parser.parse_langastExpTypeCond()
      return r
    }
    val r = to(s, f_langastExpTypeCond _)
    return r
  }

  def from_langastExpSym(o: org.sireum.lang.ast.Exp.Sym, isCompact: B): String = {
    val st = Printer.print_langastExpSym(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpSym(s: String): Either[org.sireum.lang.ast.Exp.Sym, Json.ErrorMsg] = {
    def f_langastExpSym(parser: Parser): org.sireum.lang.ast.Exp.Sym = {
      val r = parser.parse_langastExpSym()
      return r
    }
    val r = to(s, f_langastExpSym _)
    return r
  }

  def from_langastExpFunParam(o: org.sireum.lang.ast.Exp.Fun.Param, isCompact: B): String = {
    val st = Printer.print_langastExpFunParam(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpFunParam(s: String): Either[org.sireum.lang.ast.Exp.Fun.Param, Json.ErrorMsg] = {
    def f_langastExpFunParam(parser: Parser): org.sireum.lang.ast.Exp.Fun.Param = {
      val r = parser.parse_langastExpFunParam()
      return r
    }
    val r = to(s, f_langastExpFunParam _)
    return r
  }

  def from_langastExpFun(o: org.sireum.lang.ast.Exp.Fun, isCompact: B): String = {
    val st = Printer.print_langastExpFun(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpFun(s: String): Either[org.sireum.lang.ast.Exp.Fun, Json.ErrorMsg] = {
    def f_langastExpFun(parser: Parser): org.sireum.lang.ast.Exp.Fun = {
      val r = parser.parse_langastExpFun()
      return r
    }
    val r = to(s, f_langastExpFun _)
    return r
  }

  def from_langastExpForYield(o: org.sireum.lang.ast.Exp.ForYield, isCompact: B): String = {
    val st = Printer.print_langastExpForYield(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpForYield(s: String): Either[org.sireum.lang.ast.Exp.ForYield, Json.ErrorMsg] = {
    def f_langastExpForYield(parser: Parser): org.sireum.lang.ast.Exp.ForYield = {
      val r = parser.parse_langastExpForYield()
      return r
    }
    val r = to(s, f_langastExpForYield _)
    return r
  }

  def from_langastExpQuant(o: org.sireum.lang.ast.Exp.Quant, isCompact: B): String = {
    val st = Printer.print_langastExpQuant(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpQuant(s: String): Either[org.sireum.lang.ast.Exp.Quant, Json.ErrorMsg] = {
    def f_langastExpQuant(parser: Parser): org.sireum.lang.ast.Exp.Quant = {
      val r = parser.parse_langastExpQuant()
      return r
    }
    val r = to(s, f_langastExpQuant _)
    return r
  }

  def from_langastExpQuantType(o: org.sireum.lang.ast.Exp.QuantType, isCompact: B): String = {
    val st = Printer.print_langastExpQuantType(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpQuantType(s: String): Either[org.sireum.lang.ast.Exp.QuantType, Json.ErrorMsg] = {
    def f_langastExpQuantType(parser: Parser): org.sireum.lang.ast.Exp.QuantType = {
      val r = parser.parse_langastExpQuantType()
      return r
    }
    val r = to(s, f_langastExpQuantType _)
    return r
  }

  def from_langastExpQuantRange(o: org.sireum.lang.ast.Exp.QuantRange, isCompact: B): String = {
    val st = Printer.print_langastExpQuantRange(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpQuantRange(s: String): Either[org.sireum.lang.ast.Exp.QuantRange, Json.ErrorMsg] = {
    def f_langastExpQuantRange(parser: Parser): org.sireum.lang.ast.Exp.QuantRange = {
      val r = parser.parse_langastExpQuantRange()
      return r
    }
    val r = to(s, f_langastExpQuantRange _)
    return r
  }

  def from_langastExpQuantEach(o: org.sireum.lang.ast.Exp.QuantEach, isCompact: B): String = {
    val st = Printer.print_langastExpQuantEach(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpQuantEach(s: String): Either[org.sireum.lang.ast.Exp.QuantEach, Json.ErrorMsg] = {
    def f_langastExpQuantEach(parser: Parser): org.sireum.lang.ast.Exp.QuantEach = {
      val r = parser.parse_langastExpQuantEach()
      return r
    }
    val r = to(s, f_langastExpQuantEach _)
    return r
  }

  def from_langastExpInput(o: org.sireum.lang.ast.Exp.Input, isCompact: B): String = {
    val st = Printer.print_langastExpInput(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpInput(s: String): Either[org.sireum.lang.ast.Exp.Input, Json.ErrorMsg] = {
    def f_langastExpInput(parser: Parser): org.sireum.lang.ast.Exp.Input = {
      val r = parser.parse_langastExpInput()
      return r
    }
    val r = to(s, f_langastExpInput _)
    return r
  }

  def from_langastExpOld(o: org.sireum.lang.ast.Exp.Old, isCompact: B): String = {
    val st = Printer.print_langastExpOld(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpOld(s: String): Either[org.sireum.lang.ast.Exp.Old, Json.ErrorMsg] = {
    def f_langastExpOld(parser: Parser): org.sireum.lang.ast.Exp.Old = {
      val r = parser.parse_langastExpOld()
      return r
    }
    val r = to(s, f_langastExpOld _)
    return r
  }

  def from_langastExpAt(o: org.sireum.lang.ast.Exp.At, isCompact: B): String = {
    val st = Printer.print_langastExpAt(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpAt(s: String): Either[org.sireum.lang.ast.Exp.At, Json.ErrorMsg] = {
    def f_langastExpAt(parser: Parser): org.sireum.lang.ast.Exp.At = {
      val r = parser.parse_langastExpAt()
      return r
    }
    val r = to(s, f_langastExpAt _)
    return r
  }

  def from_langastExpLoopIndex(o: org.sireum.lang.ast.Exp.LoopIndex, isCompact: B): String = {
    val st = Printer.print_langastExpLoopIndex(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpLoopIndex(s: String): Either[org.sireum.lang.ast.Exp.LoopIndex, Json.ErrorMsg] = {
    def f_langastExpLoopIndex(parser: Parser): org.sireum.lang.ast.Exp.LoopIndex = {
      val r = parser.parse_langastExpLoopIndex()
      return r
    }
    val r = to(s, f_langastExpLoopIndex _)
    return r
  }

  def from_langastExpStateSeq(o: org.sireum.lang.ast.Exp.StateSeq, isCompact: B): String = {
    val st = Printer.print_langastExpStateSeq(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpStateSeq(s: String): Either[org.sireum.lang.ast.Exp.StateSeq, Json.ErrorMsg] = {
    def f_langastExpStateSeq(parser: Parser): org.sireum.lang.ast.Exp.StateSeq = {
      val r = parser.parse_langastExpStateSeq()
      return r
    }
    val r = to(s, f_langastExpStateSeq _)
    return r
  }

  def from_langastExpStateSeqFragment(o: org.sireum.lang.ast.Exp.StateSeq.Fragment, isCompact: B): String = {
    val st = Printer.print_langastExpStateSeqFragment(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpStateSeqFragment(s: String): Either[org.sireum.lang.ast.Exp.StateSeq.Fragment, Json.ErrorMsg] = {
    def f_langastExpStateSeqFragment(parser: Parser): org.sireum.lang.ast.Exp.StateSeq.Fragment = {
      val r = parser.parse_langastExpStateSeqFragment()
      return r
    }
    val r = to(s, f_langastExpStateSeqFragment _)
    return r
  }

  def from_langastExpResult(o: org.sireum.lang.ast.Exp.Result, isCompact: B): String = {
    val st = Printer.print_langastExpResult(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpResult(s: String): Either[org.sireum.lang.ast.Exp.Result, Json.ErrorMsg] = {
    def f_langastExpResult(parser: Parser): org.sireum.lang.ast.Exp.Result = {
      val r = parser.parse_langastExpResult()
      return r
    }
    val r = to(s, f_langastExpResult _)
    return r
  }

  def from_langastExpStrictPureBlock(o: org.sireum.lang.ast.Exp.StrictPureBlock, isCompact: B): String = {
    val st = Printer.print_langastExpStrictPureBlock(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpStrictPureBlock(s: String): Either[org.sireum.lang.ast.Exp.StrictPureBlock, Json.ErrorMsg] = {
    def f_langastExpStrictPureBlock(parser: Parser): org.sireum.lang.ast.Exp.StrictPureBlock = {
      val r = parser.parse_langastExpStrictPureBlock()
      return r
    }
    val r = to(s, f_langastExpStrictPureBlock _)
    return r
  }

  def from_langastExpLabeled(o: org.sireum.lang.ast.Exp.Labeled, isCompact: B): String = {
    val st = Printer.print_langastExpLabeled(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpLabeled(s: String): Either[org.sireum.lang.ast.Exp.Labeled, Json.ErrorMsg] = {
    def f_langastExpLabeled(parser: Parser): org.sireum.lang.ast.Exp.Labeled = {
      val r = parser.parse_langastExpLabeled()
      return r
    }
    val r = to(s, f_langastExpLabeled _)
    return r
  }

  def from_langastExpAssumeAgree(o: org.sireum.lang.ast.Exp.AssumeAgree, isCompact: B): String = {
    val st = Printer.print_langastExpAssumeAgree(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpAssumeAgree(s: String): Either[org.sireum.lang.ast.Exp.AssumeAgree, Json.ErrorMsg] = {
    def f_langastExpAssumeAgree(parser: Parser): org.sireum.lang.ast.Exp.AssumeAgree = {
      val r = parser.parse_langastExpAssumeAgree()
      return r
    }
    val r = to(s, f_langastExpAssumeAgree _)
    return r
  }

  def from_langastExpAssertAgree(o: org.sireum.lang.ast.Exp.AssertAgree, isCompact: B): String = {
    val st = Printer.print_langastExpAssertAgree(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpAssertAgree(s: String): Either[org.sireum.lang.ast.Exp.AssertAgree, Json.ErrorMsg] = {
    def f_langastExpAssertAgree(parser: Parser): org.sireum.lang.ast.Exp.AssertAgree = {
      val r = parser.parse_langastExpAssertAgree()
      return r
    }
    val r = to(s, f_langastExpAssertAgree _)
    return r
  }

  def from_langastExpInfoFlowInvariant(o: org.sireum.lang.ast.Exp.InfoFlowInvariant, isCompact: B): String = {
    val st = Printer.print_langastExpInfoFlowInvariant(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastExpInfoFlowInvariant(s: String): Either[org.sireum.lang.ast.Exp.InfoFlowInvariant, Json.ErrorMsg] = {
    def f_langastExpInfoFlowInvariant(parser: Parser): org.sireum.lang.ast.Exp.InfoFlowInvariant = {
      val r = parser.parse_langastExpInfoFlowInvariant()
      return r
    }
    val r = to(s, f_langastExpInfoFlowInvariant _)
    return r
  }

  def from_langastNamedArg(o: org.sireum.lang.ast.NamedArg, isCompact: B): String = {
    val st = Printer.print_langastNamedArg(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastNamedArg(s: String): Either[org.sireum.lang.ast.NamedArg, Json.ErrorMsg] = {
    def f_langastNamedArg(parser: Parser): org.sireum.lang.ast.NamedArg = {
      val r = parser.parse_langastNamedArg()
      return r
    }
    val r = to(s, f_langastNamedArg _)
    return r
  }

  def from_langastId(o: org.sireum.lang.ast.Id, isCompact: B): String = {
    val st = Printer.print_langastId(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastId(s: String): Either[org.sireum.lang.ast.Id, Json.ErrorMsg] = {
    def f_langastId(parser: Parser): org.sireum.lang.ast.Id = {
      val r = parser.parse_langastId()
      return r
    }
    val r = to(s, f_langastId _)
    return r
  }

  def from_langastName(o: org.sireum.lang.ast.Name, isCompact: B): String = {
    val st = Printer.print_langastName(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastName(s: String): Either[org.sireum.lang.ast.Name, Json.ErrorMsg] = {
    def f_langastName(parser: Parser): org.sireum.lang.ast.Name = {
      val r = parser.parse_langastName()
      return r
    }
    val r = to(s, f_langastName _)
    return r
  }

  def from_langastBody(o: org.sireum.lang.ast.Body, isCompact: B): String = {
    val st = Printer.print_langastBody(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastBody(s: String): Either[org.sireum.lang.ast.Body, Json.ErrorMsg] = {
    def f_langastBody(parser: Parser): org.sireum.lang.ast.Body = {
      val r = parser.parse_langastBody()
      return r
    }
    val r = to(s, f_langastBody _)
    return r
  }

  def from_langastAdtParam(o: org.sireum.lang.ast.AdtParam, isCompact: B): String = {
    val st = Printer.print_langastAdtParam(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastAdtParam(s: String): Either[org.sireum.lang.ast.AdtParam, Json.ErrorMsg] = {
    def f_langastAdtParam(parser: Parser): org.sireum.lang.ast.AdtParam = {
      val r = parser.parse_langastAdtParam()
      return r
    }
    val r = to(s, f_langastAdtParam _)
    return r
  }

  def from_langastMethodSig(o: org.sireum.lang.ast.MethodSig, isCompact: B): String = {
    val st = Printer.print_langastMethodSig(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastMethodSig(s: String): Either[org.sireum.lang.ast.MethodSig, Json.ErrorMsg] = {
    def f_langastMethodSig(parser: Parser): org.sireum.lang.ast.MethodSig = {
      val r = parser.parse_langastMethodSig()
      return r
    }
    val r = to(s, f_langastMethodSig _)
    return r
  }

  def from_langastParam(o: org.sireum.lang.ast.Param, isCompact: B): String = {
    val st = Printer.print_langastParam(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastParam(s: String): Either[org.sireum.lang.ast.Param, Json.ErrorMsg] = {
    def f_langastParam(parser: Parser): org.sireum.lang.ast.Param = {
      val r = parser.parse_langastParam()
      return r
    }
    val r = to(s, f_langastParam _)
    return r
  }

  def from_langastTypeParam(o: org.sireum.lang.ast.TypeParam, isCompact: B): String = {
    val st = Printer.print_langastTypeParam(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastTypeParam(s: String): Either[org.sireum.lang.ast.TypeParam, Json.ErrorMsg] = {
    def f_langastTypeParam(parser: Parser): org.sireum.lang.ast.TypeParam = {
      val r = parser.parse_langastTypeParam()
      return r
    }
    val r = to(s, f_langastTypeParam _)
    return r
  }

  def from_langastAttr(o: org.sireum.lang.ast.Attr, isCompact: B): String = {
    val st = Printer.print_langastAttr(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastAttr(s: String): Either[org.sireum.lang.ast.Attr, Json.ErrorMsg] = {
    def f_langastAttr(parser: Parser): org.sireum.lang.ast.Attr = {
      val r = parser.parse_langastAttr()
      return r
    }
    val r = to(s, f_langastAttr _)
    return r
  }

  def from_langastTypedAttr(o: org.sireum.lang.ast.TypedAttr, isCompact: B): String = {
    val st = Printer.print_langastTypedAttr(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastTypedAttr(s: String): Either[org.sireum.lang.ast.TypedAttr, Json.ErrorMsg] = {
    def f_langastTypedAttr(parser: Parser): org.sireum.lang.ast.TypedAttr = {
      val r = parser.parse_langastTypedAttr()
      return r
    }
    val r = to(s, f_langastTypedAttr _)
    return r
  }

  def from_langastResolvedAttr(o: org.sireum.lang.ast.ResolvedAttr, isCompact: B): String = {
    val st = Printer.print_langastResolvedAttr(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastResolvedAttr(s: String): Either[org.sireum.lang.ast.ResolvedAttr, Json.ErrorMsg] = {
    def f_langastResolvedAttr(parser: Parser): org.sireum.lang.ast.ResolvedAttr = {
      val r = parser.parse_langastResolvedAttr()
      return r
    }
    val r = to(s, f_langastResolvedAttr _)
    return r
  }

  def from_langastResolvedInfo(o: org.sireum.lang.ast.ResolvedInfo, isCompact: B): String = {
    val st = Printer.print_langastResolvedInfo(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastResolvedInfo(s: String): Either[org.sireum.lang.ast.ResolvedInfo, Json.ErrorMsg] = {
    def f_langastResolvedInfo(parser: Parser): org.sireum.lang.ast.ResolvedInfo = {
      val r = parser.parse_langastResolvedInfo()
      return r
    }
    val r = to(s, f_langastResolvedInfo _)
    return r
  }

  def from_langastResolvedInfoBuiltIn(o: org.sireum.lang.ast.ResolvedInfo.BuiltIn, isCompact: B): String = {
    val st = Printer.print_langastResolvedInfoBuiltIn(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastResolvedInfoBuiltIn(s: String): Either[org.sireum.lang.ast.ResolvedInfo.BuiltIn, Json.ErrorMsg] = {
    def f_langastResolvedInfoBuiltIn(parser: Parser): org.sireum.lang.ast.ResolvedInfo.BuiltIn = {
      val r = parser.parse_langastResolvedInfoBuiltIn()
      return r
    }
    val r = to(s, f_langastResolvedInfoBuiltIn _)
    return r
  }

  def from_langastResolvedInfoPackage(o: org.sireum.lang.ast.ResolvedInfo.Package, isCompact: B): String = {
    val st = Printer.print_langastResolvedInfoPackage(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastResolvedInfoPackage(s: String): Either[org.sireum.lang.ast.ResolvedInfo.Package, Json.ErrorMsg] = {
    def f_langastResolvedInfoPackage(parser: Parser): org.sireum.lang.ast.ResolvedInfo.Package = {
      val r = parser.parse_langastResolvedInfoPackage()
      return r
    }
    val r = to(s, f_langastResolvedInfoPackage _)
    return r
  }

  def from_langastResolvedInfoEnum(o: org.sireum.lang.ast.ResolvedInfo.Enum, isCompact: B): String = {
    val st = Printer.print_langastResolvedInfoEnum(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastResolvedInfoEnum(s: String): Either[org.sireum.lang.ast.ResolvedInfo.Enum, Json.ErrorMsg] = {
    def f_langastResolvedInfoEnum(parser: Parser): org.sireum.lang.ast.ResolvedInfo.Enum = {
      val r = parser.parse_langastResolvedInfoEnum()
      return r
    }
    val r = to(s, f_langastResolvedInfoEnum _)
    return r
  }

  def from_langastResolvedInfoEnumElement(o: org.sireum.lang.ast.ResolvedInfo.EnumElement, isCompact: B): String = {
    val st = Printer.print_langastResolvedInfoEnumElement(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastResolvedInfoEnumElement(s: String): Either[org.sireum.lang.ast.ResolvedInfo.EnumElement, Json.ErrorMsg] = {
    def f_langastResolvedInfoEnumElement(parser: Parser): org.sireum.lang.ast.ResolvedInfo.EnumElement = {
      val r = parser.parse_langastResolvedInfoEnumElement()
      return r
    }
    val r = to(s, f_langastResolvedInfoEnumElement _)
    return r
  }

  def from_langastResolvedInfoObject(o: org.sireum.lang.ast.ResolvedInfo.Object, isCompact: B): String = {
    val st = Printer.print_langastResolvedInfoObject(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastResolvedInfoObject(s: String): Either[org.sireum.lang.ast.ResolvedInfo.Object, Json.ErrorMsg] = {
    def f_langastResolvedInfoObject(parser: Parser): org.sireum.lang.ast.ResolvedInfo.Object = {
      val r = parser.parse_langastResolvedInfoObject()
      return r
    }
    val r = to(s, f_langastResolvedInfoObject _)
    return r
  }

  def from_langastResolvedInfoVar(o: org.sireum.lang.ast.ResolvedInfo.Var, isCompact: B): String = {
    val st = Printer.print_langastResolvedInfoVar(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastResolvedInfoVar(s: String): Either[org.sireum.lang.ast.ResolvedInfo.Var, Json.ErrorMsg] = {
    def f_langastResolvedInfoVar(parser: Parser): org.sireum.lang.ast.ResolvedInfo.Var = {
      val r = parser.parse_langastResolvedInfoVar()
      return r
    }
    val r = to(s, f_langastResolvedInfoVar _)
    return r
  }

  def from_langastResolvedInfoMethod(o: org.sireum.lang.ast.ResolvedInfo.Method, isCompact: B): String = {
    val st = Printer.print_langastResolvedInfoMethod(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastResolvedInfoMethod(s: String): Either[org.sireum.lang.ast.ResolvedInfo.Method, Json.ErrorMsg] = {
    def f_langastResolvedInfoMethod(parser: Parser): org.sireum.lang.ast.ResolvedInfo.Method = {
      val r = parser.parse_langastResolvedInfoMethod()
      return r
    }
    val r = to(s, f_langastResolvedInfoMethod _)
    return r
  }

  def from_langastResolvedInfoMethods(o: org.sireum.lang.ast.ResolvedInfo.Methods, isCompact: B): String = {
    val st = Printer.print_langastResolvedInfoMethods(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastResolvedInfoMethods(s: String): Either[org.sireum.lang.ast.ResolvedInfo.Methods, Json.ErrorMsg] = {
    def f_langastResolvedInfoMethods(parser: Parser): org.sireum.lang.ast.ResolvedInfo.Methods = {
      val r = parser.parse_langastResolvedInfoMethods()
      return r
    }
    val r = to(s, f_langastResolvedInfoMethods _)
    return r
  }

  def from_langastResolvedInfoTuple(o: org.sireum.lang.ast.ResolvedInfo.Tuple, isCompact: B): String = {
    val st = Printer.print_langastResolvedInfoTuple(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastResolvedInfoTuple(s: String): Either[org.sireum.lang.ast.ResolvedInfo.Tuple, Json.ErrorMsg] = {
    def f_langastResolvedInfoTuple(parser: Parser): org.sireum.lang.ast.ResolvedInfo.Tuple = {
      val r = parser.parse_langastResolvedInfoTuple()
      return r
    }
    val r = to(s, f_langastResolvedInfoTuple _)
    return r
  }

  def from_langastResolvedInfoLocalVar(o: org.sireum.lang.ast.ResolvedInfo.LocalVar, isCompact: B): String = {
    val st = Printer.print_langastResolvedInfoLocalVar(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastResolvedInfoLocalVar(s: String): Either[org.sireum.lang.ast.ResolvedInfo.LocalVar, Json.ErrorMsg] = {
    def f_langastResolvedInfoLocalVar(parser: Parser): org.sireum.lang.ast.ResolvedInfo.LocalVar = {
      val r = parser.parse_langastResolvedInfoLocalVar()
      return r
    }
    val r = to(s, f_langastResolvedInfoLocalVar _)
    return r
  }

  def from_langastResolvedInfoFact(o: org.sireum.lang.ast.ResolvedInfo.Fact, isCompact: B): String = {
    val st = Printer.print_langastResolvedInfoFact(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastResolvedInfoFact(s: String): Either[org.sireum.lang.ast.ResolvedInfo.Fact, Json.ErrorMsg] = {
    def f_langastResolvedInfoFact(parser: Parser): org.sireum.lang.ast.ResolvedInfo.Fact = {
      val r = parser.parse_langastResolvedInfoFact()
      return r
    }
    val r = to(s, f_langastResolvedInfoFact _)
    return r
  }

  def from_langastResolvedInfoTheorem(o: org.sireum.lang.ast.ResolvedInfo.Theorem, isCompact: B): String = {
    val st = Printer.print_langastResolvedInfoTheorem(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastResolvedInfoTheorem(s: String): Either[org.sireum.lang.ast.ResolvedInfo.Theorem, Json.ErrorMsg] = {
    def f_langastResolvedInfoTheorem(parser: Parser): org.sireum.lang.ast.ResolvedInfo.Theorem = {
      val r = parser.parse_langastResolvedInfoTheorem()
      return r
    }
    val r = to(s, f_langastResolvedInfoTheorem _)
    return r
  }

  def from_langastResolvedInfoInv(o: org.sireum.lang.ast.ResolvedInfo.Inv, isCompact: B): String = {
    val st = Printer.print_langastResolvedInfoInv(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastResolvedInfoInv(s: String): Either[org.sireum.lang.ast.ResolvedInfo.Inv, Json.ErrorMsg] = {
    def f_langastResolvedInfoInv(parser: Parser): org.sireum.lang.ast.ResolvedInfo.Inv = {
      val r = parser.parse_langastResolvedInfoInv()
      return r
    }
    val r = to(s, f_langastResolvedInfoInv _)
    return r
  }

  def from_langastTruthTableRow(o: org.sireum.lang.ast.TruthTable.Row, isCompact: B): String = {
    val st = Printer.print_langastTruthTableRow(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastTruthTableRow(s: String): Either[org.sireum.lang.ast.TruthTable.Row, Json.ErrorMsg] = {
    def f_langastTruthTableRow(parser: Parser): org.sireum.lang.ast.TruthTable.Row = {
      val r = parser.parse_langastTruthTableRow()
      return r
    }
    val r = to(s, f_langastTruthTableRow _)
    return r
  }

  def from_langastTruthTableAssignment(o: org.sireum.lang.ast.TruthTable.Assignment, isCompact: B): String = {
    val st = Printer.print_langastTruthTableAssignment(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastTruthTableAssignment(s: String): Either[org.sireum.lang.ast.TruthTable.Assignment, Json.ErrorMsg] = {
    def f_langastTruthTableAssignment(parser: Parser): org.sireum.lang.ast.TruthTable.Assignment = {
      val r = parser.parse_langastTruthTableAssignment()
      return r
    }
    val r = to(s, f_langastTruthTableAssignment _)
    return r
  }

  def from_langastTruthTableConclusion(o: org.sireum.lang.ast.TruthTable.Conclusion, isCompact: B): String = {
    val st = Printer.print_langastTruthTableConclusion(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastTruthTableConclusion(s: String): Either[org.sireum.lang.ast.TruthTable.Conclusion, Json.ErrorMsg] = {
    def f_langastTruthTableConclusion(parser: Parser): org.sireum.lang.ast.TruthTable.Conclusion = {
      val r = parser.parse_langastTruthTableConclusion()
      return r
    }
    val r = to(s, f_langastTruthTableConclusion _)
    return r
  }

  def from_langastTruthTableConclusionValidity(o: org.sireum.lang.ast.TruthTable.Conclusion.Validity, isCompact: B): String = {
    val st = Printer.print_langastTruthTableConclusionValidity(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastTruthTableConclusionValidity(s: String): Either[org.sireum.lang.ast.TruthTable.Conclusion.Validity, Json.ErrorMsg] = {
    def f_langastTruthTableConclusionValidity(parser: Parser): org.sireum.lang.ast.TruthTable.Conclusion.Validity = {
      val r = parser.parse_langastTruthTableConclusionValidity()
      return r
    }
    val r = to(s, f_langastTruthTableConclusionValidity _)
    return r
  }

  def from_langastTruthTableConclusionTautology(o: org.sireum.lang.ast.TruthTable.Conclusion.Tautology, isCompact: B): String = {
    val st = Printer.print_langastTruthTableConclusionTautology(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastTruthTableConclusionTautology(s: String): Either[org.sireum.lang.ast.TruthTable.Conclusion.Tautology, Json.ErrorMsg] = {
    def f_langastTruthTableConclusionTautology(parser: Parser): org.sireum.lang.ast.TruthTable.Conclusion.Tautology = {
      val r = parser.parse_langastTruthTableConclusionTautology()
      return r
    }
    val r = to(s, f_langastTruthTableConclusionTautology _)
    return r
  }

  def from_langastTruthTableConclusionContradictory(o: org.sireum.lang.ast.TruthTable.Conclusion.Contradictory, isCompact: B): String = {
    val st = Printer.print_langastTruthTableConclusionContradictory(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastTruthTableConclusionContradictory(s: String): Either[org.sireum.lang.ast.TruthTable.Conclusion.Contradictory, Json.ErrorMsg] = {
    def f_langastTruthTableConclusionContradictory(parser: Parser): org.sireum.lang.ast.TruthTable.Conclusion.Contradictory = {
      val r = parser.parse_langastTruthTableConclusionContradictory()
      return r
    }
    val r = to(s, f_langastTruthTableConclusionContradictory _)
    return r
  }

  def from_langastTruthTableConclusionContingent(o: org.sireum.lang.ast.TruthTable.Conclusion.Contingent, isCompact: B): String = {
    val st = Printer.print_langastTruthTableConclusionContingent(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastTruthTableConclusionContingent(s: String): Either[org.sireum.lang.ast.TruthTable.Conclusion.Contingent, Json.ErrorMsg] = {
    def f_langastTruthTableConclusionContingent(parser: Parser): org.sireum.lang.ast.TruthTable.Conclusion.Contingent = {
      val r = parser.parse_langastTruthTableConclusionContingent()
      return r
    }
    val r = to(s, f_langastTruthTableConclusionContingent _)
    return r
  }

  def from_langastTyped(o: org.sireum.lang.ast.Typed, isCompact: B): String = {
    val st = Printer.print_langastTyped(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastTyped(s: String): Either[org.sireum.lang.ast.Typed, Json.ErrorMsg] = {
    def f_langastTyped(parser: Parser): org.sireum.lang.ast.Typed = {
      val r = parser.parse_langastTyped()
      return r
    }
    val r = to(s, f_langastTyped _)
    return r
  }

  def from_langastTypedName(o: org.sireum.lang.ast.Typed.Name, isCompact: B): String = {
    val st = Printer.print_langastTypedName(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastTypedName(s: String): Either[org.sireum.lang.ast.Typed.Name, Json.ErrorMsg] = {
    def f_langastTypedName(parser: Parser): org.sireum.lang.ast.Typed.Name = {
      val r = parser.parse_langastTypedName()
      return r
    }
    val r = to(s, f_langastTypedName _)
    return r
  }

  def from_langastTypedTuple(o: org.sireum.lang.ast.Typed.Tuple, isCompact: B): String = {
    val st = Printer.print_langastTypedTuple(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastTypedTuple(s: String): Either[org.sireum.lang.ast.Typed.Tuple, Json.ErrorMsg] = {
    def f_langastTypedTuple(parser: Parser): org.sireum.lang.ast.Typed.Tuple = {
      val r = parser.parse_langastTypedTuple()
      return r
    }
    val r = to(s, f_langastTypedTuple _)
    return r
  }

  def from_langastTypedFun(o: org.sireum.lang.ast.Typed.Fun, isCompact: B): String = {
    val st = Printer.print_langastTypedFun(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastTypedFun(s: String): Either[org.sireum.lang.ast.Typed.Fun, Json.ErrorMsg] = {
    def f_langastTypedFun(parser: Parser): org.sireum.lang.ast.Typed.Fun = {
      val r = parser.parse_langastTypedFun()
      return r
    }
    val r = to(s, f_langastTypedFun _)
    return r
  }

  def from_langastTypedTypeVar(o: org.sireum.lang.ast.Typed.TypeVar, isCompact: B): String = {
    val st = Printer.print_langastTypedTypeVar(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastTypedTypeVar(s: String): Either[org.sireum.lang.ast.Typed.TypeVar, Json.ErrorMsg] = {
    def f_langastTypedTypeVar(parser: Parser): org.sireum.lang.ast.Typed.TypeVar = {
      val r = parser.parse_langastTypedTypeVar()
      return r
    }
    val r = to(s, f_langastTypedTypeVar _)
    return r
  }

  def from_langastTypedPackage(o: org.sireum.lang.ast.Typed.Package, isCompact: B): String = {
    val st = Printer.print_langastTypedPackage(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastTypedPackage(s: String): Either[org.sireum.lang.ast.Typed.Package, Json.ErrorMsg] = {
    def f_langastTypedPackage(parser: Parser): org.sireum.lang.ast.Typed.Package = {
      val r = parser.parse_langastTypedPackage()
      return r
    }
    val r = to(s, f_langastTypedPackage _)
    return r
  }

  def from_langastTypedObject(o: org.sireum.lang.ast.Typed.Object, isCompact: B): String = {
    val st = Printer.print_langastTypedObject(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastTypedObject(s: String): Either[org.sireum.lang.ast.Typed.Object, Json.ErrorMsg] = {
    def f_langastTypedObject(parser: Parser): org.sireum.lang.ast.Typed.Object = {
      val r = parser.parse_langastTypedObject()
      return r
    }
    val r = to(s, f_langastTypedObject _)
    return r
  }

  def from_langastTypedEnum(o: org.sireum.lang.ast.Typed.Enum, isCompact: B): String = {
    val st = Printer.print_langastTypedEnum(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastTypedEnum(s: String): Either[org.sireum.lang.ast.Typed.Enum, Json.ErrorMsg] = {
    def f_langastTypedEnum(parser: Parser): org.sireum.lang.ast.Typed.Enum = {
      val r = parser.parse_langastTypedEnum()
      return r
    }
    val r = to(s, f_langastTypedEnum _)
    return r
  }

  def from_langastTypedMethod(o: org.sireum.lang.ast.Typed.Method, isCompact: B): String = {
    val st = Printer.print_langastTypedMethod(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastTypedMethod(s: String): Either[org.sireum.lang.ast.Typed.Method, Json.ErrorMsg] = {
    def f_langastTypedMethod(parser: Parser): org.sireum.lang.ast.Typed.Method = {
      val r = parser.parse_langastTypedMethod()
      return r
    }
    val r = to(s, f_langastTypedMethod _)
    return r
  }

  def from_langastTypedMethods(o: org.sireum.lang.ast.Typed.Methods, isCompact: B): String = {
    val st = Printer.print_langastTypedMethods(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastTypedMethods(s: String): Either[org.sireum.lang.ast.Typed.Methods, Json.ErrorMsg] = {
    def f_langastTypedMethods(parser: Parser): org.sireum.lang.ast.Typed.Methods = {
      val r = parser.parse_langastTypedMethods()
      return r
    }
    val r = to(s, f_langastTypedMethods _)
    return r
  }

  def from_langastTypedFact(o: org.sireum.lang.ast.Typed.Fact, isCompact: B): String = {
    val st = Printer.print_langastTypedFact(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastTypedFact(s: String): Either[org.sireum.lang.ast.Typed.Fact, Json.ErrorMsg] = {
    def f_langastTypedFact(parser: Parser): org.sireum.lang.ast.Typed.Fact = {
      val r = parser.parse_langastTypedFact()
      return r
    }
    val r = to(s, f_langastTypedFact _)
    return r
  }

  def from_langastTypedTheorem(o: org.sireum.lang.ast.Typed.Theorem, isCompact: B): String = {
    val st = Printer.print_langastTypedTheorem(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastTypedTheorem(s: String): Either[org.sireum.lang.ast.Typed.Theorem, Json.ErrorMsg] = {
    def f_langastTypedTheorem(parser: Parser): org.sireum.lang.ast.Typed.Theorem = {
      val r = parser.parse_langastTypedTheorem()
      return r
    }
    val r = to(s, f_langastTypedTheorem _)
    return r
  }

  def from_langastTypedInv(o: org.sireum.lang.ast.Typed.Inv, isCompact: B): String = {
    val st = Printer.print_langastTypedInv(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_langastTypedInv(s: String): Either[org.sireum.lang.ast.Typed.Inv, Json.ErrorMsg] = {
    def f_langastTypedInv(parser: Parser): org.sireum.lang.ast.Typed.Inv = {
      val r = parser.parse_langastTypedInv()
      return r
    }
    val r = to(s, f_langastTypedInv _)
    return r
  }

}