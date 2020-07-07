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

package org.sireum.hamr.ir

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printAadlInstInfo(o: AadlInstInfo): ST = {
      o match {
        case o: Component => return printComponent(o)
        case o: FeatureEnd => return printFeatureEnd(o)
        case o: FeatureGroup => return printFeatureGroup(o)
        case o: FeatureAccess => return printFeatureAccess(o)
        case o: Connection => return printConnection(o)
        case o: Flow => return printFlow(o)
        case o: Emv2Flow => return printEmv2Flow(o)
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
        case o: AadlElementRef => return printAadlElementRef(o)
        case o: Emv2ElementRef => return printEmv2ElementRef(o)
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
        case o: SmfClause => return printSmfClause(o)
        case o: SmfClassification => return printSmfClassification(o)
        case o: SmfDeclass => return printSmfDeclass(o)
        case o: SmfType => return printSmfType(o)
        case o: OtherAnnex => return printOtherAnnex(o)
      }
    }

    @pure def printAnnexLib(o: AnnexLib): ST = {
      o match {
        case o: Emv2Library => return printEmv2Library(o)
        case o: SmfLibrary => return printSmfLibrary(o)
      }
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
        ("extendType", printOption(F, o.extendType, printName _))
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
        ("parentType", printOption(F, o.parentType, printName _))
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

    def parseAadlInstInfo(): AadlInstInfo = {
      val t = parser.parseObjectTypes(ISZ("Component", "FeatureEnd", "FeatureGroup", "FeatureAccess", "Connection", "Flow", "Emv2Flow"))
      t.native match {
        case "Component" => val r = parseComponentT(T); return r
        case "FeatureEnd" => val r = parseFeatureEndT(T); return r
        case "FeatureGroup" => val r = parseFeatureGroupT(T); return r
        case "FeatureAccess" => val r = parseFeatureAccessT(T); return r
        case "Connection" => val r = parseConnectionT(T); return r
        case "Flow" => val r = parseFlowT(T); return r
        case "Emv2Flow" => val r = parseEmv2FlowT(T); return r
        case _ => val r = parseEmv2FlowT(T); return r
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
      val t = parser.parseObjectTypes(ISZ("AadlElementRef", "Emv2ElementRef"))
      t.native match {
        case "AadlElementRef" => val r = parseAadlElementRefT(T); return r
        case "Emv2ElementRef" => val r = parseEmv2ElementRefT(T); return r
        case _ => val r = parseEmv2ElementRefT(T); return r
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
      val t = parser.parseObjectTypes(ISZ("ErrorTypeDef", "ErrorAliasDef", "ErrorTypeSetDef", "BehaveStateMachine", "ErrorEvent", "ErrorState", "ErrorTransition", "ConditionTrigger", "AndCondition", "OrCondition", "AllCondition", "OrMoreCondition", "OrLessCondition", "Emv2Clause", "Emv2Propagation", "Emv2Flow", "Emv2BehaviorSection", "ErrorPropagation", "SmfClause", "SmfClassification", "SmfDeclass", "SmfType", "OtherAnnex"))
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
        case "SmfClause" => val r = parseSmfClauseT(T); return r
        case "SmfClassification" => val r = parseSmfClassificationT(T); return r
        case "SmfDeclass" => val r = parseSmfDeclassT(T); return r
        case "SmfType" => val r = parseSmfTypeT(T); return r
        case "OtherAnnex" => val r = parseOtherAnnexT(T); return r
        case _ => val r = parseOtherAnnexT(T); return r
      }
    }

    def parseAnnexLib(): AnnexLib = {
      val t = parser.parseObjectTypes(ISZ("Emv2Library", "SmfLibrary"))
      t.native match {
        case "Emv2Library" => val r = parseEmv2LibraryT(T); return r
        case "SmfLibrary" => val r = parseSmfLibraryT(T); return r
        case _ => val r = parseSmfLibraryT(T); return r
      }
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
      return ErrorTypeDef(id, extendType)
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
      val parentType = parser.parseOption(parseName _)
      parser.parseObjectNext()
      return SmfType(typeName, parentType)
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