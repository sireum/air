/*
 Copyright (c) 2017-2026,Kansas State University
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

package org.sireum.hamr.ir

import java.util.{List => JList}

import org.sireum._
import org.sireum.message.{FlatPos, Position}
import org.sireum.hamr.ir.Flow

class AadlASTFactory {

  // checks whether args contains null elements. Enable assertions to
  // enable this check
  private def nonNull(args: Any *): Boolean = {
    for(i <- 0 until args.size) {
      args(i) match {
        case null => halt(s"The argument at position ${i} cannot be null")
        case l: scala.List[_] =>
          for(j <- 0 until l.size if l(j) == null) {
            halt(s"The ${j}th index of the argument at position ${i} is null: ${l(j)}")
          }
        case _ =>
      }
    }
    return true
  }

  def aadl(components: JList[Component],
           annexLib: JList[AnnexLib],
           dataComponents: JList[Component]): Aadl = {
    assert(nonNull(components, annexLib, dataComponents))
    Aadl(isz(components), isz(annexLib), isz(dataComponents))
  }

  def name(name: JList[Predef.String], pos: Position): Name = {
    assert(nonNull(name))
    Name(
      name = isz(name).map(s => String(s)),
      pos = if (pos != null) Some(pos) else None())
  }

  def flatPos(url: Predef.String,
              beginLine: Int,
              beginColumn: Int,
              endLine: Int,
              endColumn: Int,
              offset: Int,
              length: Int): Position = {
    assert(nonNull("", beginLine, beginColumn, endLine, endColumn, offset, length))
    FlatPos(
      if (url != null) Some(url) else None(),
      U32(beginLine),
      U32(beginColumn),
      U32(endLine),
      U32(endColumn),
      U32(offset),
      U32(length)
    )
  }

  def component(identifier: Name,
                category: AadlASTJavaFactory.ComponentCategory,
                classifier: Classifier,
                features: JList[Feature],
                subComponents: JList[Component],
                connections: JList[Connection],
                connectionInstances: JList[ConnectionInstance],
                properties: JList[Property],
                flows: JList[Flow],
                modes: JList[Mode],
                annexes: JList[Annex],
                uriFrag: String): Component = {
    assert(nonNull(identifier, category, "", features, subComponents, connections, connectionInstances, properties, flows, modes, annexes, uriFrag))
    Component(
      identifier,
      ComponentCategory.byName(category.name).get,
      if (classifier != null) Some(classifier) else None(),
      isz(features),
      isz(subComponents),
      isz(connections),
      isz(connectionInstances),
      isz(properties),
      isz(flows),
      isz(modes),
      isz(annexes),
      uriFrag
    )
  }

  def classifier(name: Predef.String): Classifier = {
    assert(nonNull(name))
    Classifier(name)
  }

  def featureEnd(identifier: Name,
                 direction: AadlASTJavaFactory.Direction,
                 category: AadlASTJavaFactory.FeatureCategory,
                 classifier: Classifier,
                 properties: JList[Property],
                 uriFrag: String): FeatureEnd = {
    assert(nonNull(identifier, direction, category, properties, uriFrag))
    FeatureEnd(
      identifier,
      Direction.byName(direction.name()).get,
      FeatureCategory.byName(category.name()).get,
      if (classifier != null) Some(classifier) else None(),
      isz(properties),
      uriFrag
    )
  }

  def featureGroup(identifier: Name,
                   features: JList[Feature],
                   isInverse: Boolean,
                   category: AadlASTJavaFactory.FeatureCategory,
                   //classifier: Classifier,
                   properties: JList[Property],
                   uriFrag: String): FeatureGroup = {
    assert(nonNull(identifier, features, isInverse, category, properties, uriFrag))
    FeatureGroup(
      identifier,
      isz(features),
      isInverse,
      FeatureCategory.byName(category.name()).get,
      //if (classifier != null) Some(classifier) else None(),
      isz(properties),
      uriFrag
    )
  }

  def featureAccess(identifier: Name,
                    category: AadlASTJavaFactory.FeatureCategory,
                    classifier: Classifier,
                    accessType: AadlASTJavaFactory.AccessType,
                    accessCategory: AadlASTJavaFactory.AccessCategory,
                    properties: JList[Property],
                    uriFrag: String): FeatureAccess = {
    assert(nonNull(identifier, category, "", accessType, accessCategory, properties, uriFrag))
    FeatureAccess(
      identifier,
      FeatureCategory.byName(category.name()).get,
      if (classifier != null) Some(classifier) else None(),
      AccessType.byName(accessType.name()).get,
      AccessCategory.byName(accessCategory.name()).get,
      isz(properties),
      uriFrag
    )
  }

  def connection(name: Name,
                 src: JList[EndPoint],
                 dst: JList[EndPoint],
                 kind: AadlASTJavaFactory.ConnectionKind,
                 isBiDirectional: Boolean,
                 connectionInstances: JList[Name],
                 properties: JList[Property],
                 uriFrag: String) = {
    assert(nonNull(name, src, dst, kind, isBiDirectional, connectionInstances, properties, uriFrag))
    Connection(
      name,
      isz(src),
      isz(dst),
      ConnectionKind.byName(kind.name()).get,
      isBiDirectional,
      isz(connectionInstances),
      isz(properties),
      uriFrag
    )
  }

  def connectionInstance(name: Name,
                         src: EndPoint,
                         dst: EndPoint,
                         kind: AadlASTJavaFactory.ConnectionKind,
                         connectionRefs: JList[ConnectionReference],
                         properties: JList[Property]) = {
    assert(nonNull(name, src, dst, kind, connectionRefs, properties))
    ConnectionInstance(
      name,
      src,
      dst,
      ConnectionKind.byName(kind.name()).get,
      isz(connectionRefs),
      isz(properties)
    )
  }

  def connectionReference(component: Name, feature: Name, isParent: Boolean) = {
    assert(nonNull(component, feature, isParent))
    ConnectionReference(component, feature, isParent)
  }

  def endPoint(component: Name,
               feature: Name,
               direction: AadlASTJavaFactory.Direction) = {
    assert(nonNull(component))
    EndPoint(
      component,
      if (feature != null) Some(feature) else None(),
      if (direction != null) Some(Direction.byName(direction.name()).get)
      else None()
    )
  }

  def property(name: Name,
               propertyValues: JList[PropertyValue],
               appliesTo: JList[ElementRef]) = {
    assert(nonNull(name, propertyValues, appliesTo))
    Property(name, isz(propertyValues), isz(appliesTo))
  }

  def classifierProp(name: Predef.String) = {
    assert(nonNull(name))
    ClassifierProp(name)
  }

  def rangeProp(low: UnitProp, high: UnitProp) = {
    assert(nonNull(low, high))
    RangeProp(low, high)
  }

  def recordProp(properties: JList[Property]) = {
    assert(nonNull(properties))
    RecordProp(isz(properties))
  }

  def referenceProp(value: Name) = {
    assert(nonNull(value))
    ReferenceProp(value)
  }

  def unitProp(value: Predef.String, unit: Predef.String) = {
    assert(nonNull(value))
    UnitProp(value, if (unit != null) Some(unit) else None())
  }

  def valueProp(value: Predef.String) = {
    assert(nonNull(value))
    ValueProp(value)
  }

  def mode(name: Name) = {
    assert(nonNull(name))
    Mode(name)
  }

  def flow(name: Name,
           kind: AadlASTJavaFactory.FlowKind,
           source: Name,
           sink: Name,
           uriFrag: String) = {
    assert(nonNull(name, kind, "", "", uriFrag))
    Flow(
      name,
      FlowKind.byName(kind.name()).get,
      if (source != null) Some(source) else None(),
      if (sink != null) Some(sink) else None(),
      uriFrag
    )
  }

  //-------------EMv2 Clause------------------

  def emv2ElementRef(kind: AadlASTJavaFactory.Emv2ElementKind,
                     name: Name,
                     errorTypes: JList[Name]): Emv2ElementRef = {
    assert(nonNull(kind, name, errorTypes))
    Emv2ElementRef(
      Emv2ElementKind.byName(kind.name()).get,
      name,
      isz(errorTypes)
    )
  }

  def emv2Clause(libraries: JList[Name],
                 propagations: JList[Emv2Propagation],
                 flows: JList[Emv2Flow],
                 componentBehavior: Emv2BehaviorSection,
                 properties: JList[Property]): Emv2Clause = {
    assert(nonNull(libraries, propagations, flows, "", properties))
    Emv2Clause(
      isz(libraries),
      isz(propagations),
      isz(flows),
      if (componentBehavior != null) Some(componentBehavior) else None(),
      isz(properties)
    )
  }

  def emv2Propagation(direction: AadlASTJavaFactory.PropagationDirection,
                      propagationPoint: Name,
                      errorTokens: JList[Name]): Emv2Propagation = {
    assert(nonNull(direction, propagationPoint, errorTokens))
    Emv2Propagation(
      PropagationDirection.byName(direction.name()).get,
      propagationPoint,
      isz(errorTokens)
    )
  }

  def emv2Flow(identifier: Name,
               kind: AadlASTJavaFactory.FlowKind,
               sourcePropagation: Emv2Propagation,
               sinkPropagation: Emv2Propagation,
               uriFrag: String): Emv2Flow = {
    assert(nonNull(identifier, kind, "", "", uriFrag))
    Emv2Flow(
      identifier,
      FlowKind.byName(kind.name).get,
      if (sourcePropagation != null) Some(sourcePropagation) else None(),
      if (sinkPropagation != null) Some(sinkPropagation) else None(),
      uriFrag
    )
  }

  def emv2BehaviorSection(
    events: JList[ErrorEvent],
    transitions: JList[ErrorTransition],
    propagations: JList[ErrorPropagation]): Emv2BehaviorSection = {
    assert(nonNull(events, transitions, propagations))
    Emv2BehaviorSection(isz(events), isz(transitions), isz(propagations))
  }

  def errorPropagation(id: Name,
                       source: JList[Name],
                       condition: ErrorCondition,
                       target: JList[Emv2Propagation]): ErrorPropagation = {
    assert(nonNull("", source, "", target))
    ErrorPropagation(
      if (id != null) Some(id) else None(),
      isz(source),
      if (condition != null) Some(condition) else None(),
      isz(target)
    )
  }

  def conditionTrigger(
    events: JList[Name],
    propagationPoints: JList[Emv2Propagation]): ConditionTrigger = {
    assert(nonNull(events, propagationPoints))
    ConditionTrigger(isz(events), isz(propagationPoints))
  }

  def andCondition(op: JList[ErrorCondition]): AndCondition = {
    assert(nonNull(op))
    AndCondition(isz(op))
  }

  def orCondition(op: JList[ErrorCondition]): OrCondition = {
    assert(nonNull(op))
    OrCondition(isz(op))
  }

  def allCondition(op: JList[ErrorCondition]): AllCondition = {
    assert(nonNull(op))
    AllCondition(isz(op))
  }

  def orLessCondition(number: Int,
                      conds: JList[ErrorCondition]): OrLessCondition = {
    assert(nonNull(number, conds))
    OrLessCondition(org.sireum.Z(number), isz(conds))
  }

  def orMoreCondition(number: Int,
                      conds: JList[ErrorCondition]): OrMoreCondition = {
    assert(nonNull(number, conds))
    OrMoreCondition(org.sireum.Z(number), isz(conds))
  }

  //--------------EMv2 Library-------------------

  def emv2Library(
    name: Name,
    useTypes: JList[Predef.String],
    errorTypeDef: JList[ErrorTypeDef],
    errorTypeSetDef: JList[ErrorTypeSetDef],
    alias: JList[ErrorAliasDef],
    behaveStateMachine: JList[BehaveStateMachine]): Emv2Library = {
    assert(nonNull(name, useTypes, errorTypeDef, alias, behaveStateMachine))
    Emv2Library(
      name,
      isz(useTypes).map(it => String(it)),
      isz(errorTypeDef),
      isz(errorTypeSetDef),
      isz(alias),
      isz(behaveStateMachine)
    )
  }

  def errorTypeDef(id: Name,
                   extendType: Name,
                   uriFrag: String): ErrorTypeDef = {
    assert(nonNull(id, "", uriFrag))
    ErrorTypeDef(
      id,
      if (extendType != null) Some(extendType) else None(),
      uriFrag
    )
  }

  def errorAliseDef(errorType: Name, aliasType: Name): ErrorAliasDef = {
    assert(nonNull(errorType, aliasType))
    ErrorAliasDef(errorType, aliasType)
  }

  def errorTypeSetDef(id: Name, errorTypes: JList[Name]): ErrorTypeSetDef = {
    assert(nonNull(id, errorTypes))
    ErrorTypeSetDef(id, isz(errorTypes))
  }

  def behaveStateMachine(id: Name,
                         events: JList[ErrorEvent],
                         states: JList[ErrorState],
                         transitions: JList[ErrorTransition],
                         properties: JList[Property]): BehaveStateMachine = {
    assert(nonNull(id, events, states, transitions, properties))
    BehaveStateMachine(
      id,
      isz(events),
      isz(states),
      isz(transitions),
      isz(properties)
    )
  }

  def errorEvent(id: Name): ErrorEvent = {
    assert(nonNull(id))
    ErrorEvent(id)
  }

  def errorState(id: Name, isInitial: Boolean): ErrorState = {
    assert(nonNull(id, isInitial))
    ErrorState(id, org.sireum.B(isInitial))
  }

  def errorTransition(id: Name,
                      sourceState: Name,
                      condition: ErrorCondition,
                      targetState: Name): ErrorTransition = {
    assert(nonNull("", sourceState, condition, targetState))
    ErrorTransition(
      if (id != null) Some(id) else None(),
      sourceState,
      condition,
      targetState
    )
  }

  //--------------SMF-------------------

  def smfClause(classes: JList[SmfClassification],
                declasses: JList[SmfDeclass]): SmfClause = {
    assert(nonNull(classes, declasses))
    SmfClause(isz(classes), isz(declasses))
  }

  def smfClassification(portName: Name, typeName: Name): SmfClassification = {
    assert(nonNull(portName, typeName))
    SmfClassification(portName, typeName)
  }

  def smfDeclass(flowName: Name, srcType: Name, snkType: Name): SmfDeclass = {
    assert(nonNull(flowName, "", snkType))
    SmfDeclass(
      flowName,
      if (srcType != null) Some(srcType) else None(),
      snkType
    )
  }

  def smfLibrary(types: JList[SmfType]): SmfLibrary = {
    assert(nonNull(types))
    SmfLibrary(isz(types))
  }

  def smfType(typeName: Name, parentName: JList[Name]): SmfType = {
    assert(nonNull(typeName, parentName))
    SmfType(typeName,  isz(parentName))
  }

  def isz[T](l: JList[T]): ISZ[T] = {
    assert(nonNull(l))
    import org.sireum.$internal.CollectionCompat.Converters._
    ISZ(l.asScala.toIndexedSeq: _*)
  }
}
