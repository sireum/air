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

package org.sireum.aadl.ir

import java.util.{List => JList}

import org.sireum._

class AadlASTFactory {

  def aadl(components: JList[Component], errorLib: JList[Emv2Library], dataComponents: JList[Component]): Aadl =
    Aadl(isz(components), isz(errorLib), isz(dataComponents))

  def name(name: JList[Predef.String]): Name =
    Name(isz(name).map(s => String(s)))

  def component(
    identifier: Name,
    category: AadlASTJavaFactory.ComponentCategory,
    classifier: Classifier,
    features: JList[Feature],
    subComponents: JList[Component],
    connections: JList[Connection],
    connectionInstances: JList[ConnectionInstance],
    properties: JList[Property],
    flows: JList[Flow],
    modes: JList[Mode],
    annexes: JList[Annex]): Component =
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
      isz(annexes)
    )

  def classifier(name: Predef.String): Classifier =
    Classifier(name)

  def featureEnd(identifier: Name,
                 direction: AadlASTJavaFactory.Direction,
                 category: AadlASTJavaFactory.FeatureCategory,
                 classifier: Classifier,
                 properties: JList[Property]): FeatureEnd =
    FeatureEnd(
      identifier,
      Direction.byName(direction.name()).get,
      FeatureCategory.byName(category.name()).get,
      if (classifier != null) Some(classifier) else None(),
      isz(properties)
    )

  def featureGroup(identifier: Name,
                   features: JList[Feature],
                   isInverse: Boolean,
                   category: AadlASTJavaFactory.FeatureCategory,
                   //classifier: Classifier,
                   properties: JList[Property]): FeatureGroup =
    FeatureGroup(
      identifier,
      isz(features),
      isInverse,
      FeatureCategory.byName(category.name()).get,
      //if (classifier != null) Some(classifier) else None(),
      isz(properties)
    )

  def connection(name : Name,
                 src: JList[EndPoint],
                 dst: JList[EndPoint],
    kind: AadlASTJavaFactory.ConnectionKind,
                 isBiDirectional: Boolean,
                 connectionInstances: JList[Name],
                 properties: JList[Property]) =
    Connection(
      name,
      isz(src),
      isz(dst),
      ConnectionKind.byName(kind.name()).get,
      isBiDirectional,
      isz(connectionInstances),
      isz(properties)
    )

  def connectionInstance(name : Name,
                         src: EndPoint,
                         dst: EndPoint,
                         kind: AadlASTJavaFactory.ConnectionKind,
                         connectionRefs: JList[ConnectionReference],
                         properties: JList[Property]) =
    ConnectionInstance(
      name,
      src,
      dst,
      ConnectionKind.byName(kind.name()).get,
      isz(connectionRefs),
      isz(properties)
    )

  def connectionReference(component: Name,
                          feature: Name,
                          isParent: Boolean) =
    ConnectionReference(
      component,
      feature,
      isParent
    )

  def endPoint(component: Name,
               feature: Name,
               direction: AadlASTJavaFactory.Direction) =
    EndPoint(
      component,
      if (feature != null) Some(feature) else None(),
      if(direction != null) Some(Direction.byName(direction.name()).get) else None()
  )

  def property(name: Name,
               propertyValues: JList[PropertyValue]) =
    Property(
      name,
      isz(propertyValues)
    )

  def classifierProp(name: Predef.String) =
    ClassifierProp(name)

  def rangeProp(low: UnitProp,
                high: UnitProp) =
    RangeProp(
      low,
      high
    )

  def recordProp(properties: JList[Property]) =
    RecordProp(
      isz(properties)
    )

  def referenceProp(value: Name) =
    ReferenceProp(
      value
    )

  def unitProp(value: Predef.String,
               unit: Predef.String) =
    UnitProp(
      value,
      if(unit != null) Some(unit) else None()
    )

  def valueProp(value: Predef.String) =
    ValueProp(
      value
    )

  def mode(name: Name) =
    Mode(
      name
    )

  def flow(name: Name,
           kind: AadlASTJavaFactory.FlowKind, source: Feature, sink: Feature) =
    Flow(
      name,
      FlowKind.byName(kind.name()).get,
      if(source != null) Some(source) else None(),
      if(sink != null) Some(sink) else None()
    )

  //-------------EMv2 Clause------------------

  def emv2Clause(
    libraries: JList[Name],
    propagations: JList[Emv2Propagation],
    flows: JList[Emv2Flow],
    componentBehavior: Emv2BehaviorSection
  ): Emv2Clause = {
    Emv2Clause(isz(libraries), isz(propagations), isz(flows), componentBehavior)
  }

  def emv2Propagation(
    direction: AadlASTJavaFactory.PropagationDirection,
    propagationPoint: JList[Name],
    errorTokens: JList[Name]
  ): Emv2Propagation = {
    Emv2Propagation(PropagationDirection.byName(direction.name()).get, isz(propagationPoint), isz(errorTokens))
  }

  def emv2Flow(
    identifier: Name,
    kind: AadlASTJavaFactory.FlowKind,
    sourcePropagation: Emv2Propagation,
    sinkPropagation: Emv2Propagation
  ): Emv2Flow = {
    Emv2Flow(
      identifier,
      FlowKind.byName(kind.name).get,
      if (sourcePropagation != null) Some(sourcePropagation) else None(),
      if (sinkPropagation != null) Some(sinkPropagation) else None()
    )
  }

  def emv2BehaviorSection(
    events: JList[ErrorEvent],
    transitions: JList[ErrorTransition],
    propagations: JList[ErrorPropagation]
  ): Emv2BehaviorSection = {
    Emv2BehaviorSection(isz(events), isz(transitions), isz(propagations))
  }

  def errorPropagation(
    id: Name,
    source: JList[Name],
    condition: ErrorCondition,
    target: JList[Emv2Propagation]
  ): ErrorPropagation = {
    ErrorPropagation(id, isz(source), if (condition != null) Some(condition) else None(), isz(target))
  }

  def conditionTrigger(events: JList[Name], propagationPoints: JList[Emv2Propagation]): ConditionTrigger = {
    ConditionTrigger(isz(events), isz(propagationPoints))
  }

  def andCondition(lhs: ErrorCondition, rhs: ErrorCondition): AndCondition = {
    AndCondition(lhs, rhs)
  }

  def orCondition(lhs: ErrorCondition, rhs: ErrorCondition): OrCondition = {
    OrCondition(lhs, rhs)
  }

  def orLessCondition(number: Int, conds: JList[ConditionTrigger]): OrLessCondition = {
    OrLessCondition(org.sireum.Z(number), isz(conds))
  }

  def orMoreCondition(number: Int, conds: JList[ConditionTrigger]): OrMoreCondition = {
    OrMoreCondition(org.sireum.Z(number), isz(conds))
  }

  //--------------EMv2 Library-------------------

  def emv2Library(
    name: Name,
    useTypes: JList[String],
    errorTypeDef: JList[ErrorTypeDef],
    errorTypeSetDef: JList[ErrorTypeSetDef],
    alias: JList[ErrorAliseDef],
    behaveStateMachine: JList[BehaveStateMachine]
  ): Emv2Library = {
    Emv2Library(name, isz(useTypes), isz(errorTypeDef), isz(errorTypeSetDef), isz(alias), isz(behaveStateMachine))
  }

  def errorTypeDef(id: Name, extendType: Name): ErrorTypeDef = {
    ErrorTypeDef(id, extendType)
  }

  def errorAliseDef(errorType: Name, aliasType: Name): ErrorAliseDef = {
    ErrorAliseDef(errorType, aliasType)
  }

  def errorTypeSetDef(id: Name, errorTypes: JList[Name]): ErrorTypeSetDef = {
    ErrorTypeSetDef(id, isz(errorTypes))
  }

  def behaveStateMachine(
    id: Name,
    events: JList[ErrorEvent],
    states: JList[ErrorState],
    transitions: JList[ErrorTransition],
    properties: JList[Property]
  ): BehaveStateMachine = {
    BehaveStateMachine(id, isz(events), isz(states), isz(transitions), isz(properties))
  }

  def errorEvent(id: Name): ErrorEvent = {
    ErrorEvent(id)
  }

  def errorState(id: Name, isInitial: Boolean): ErrorState = {
    ErrorState(id, org.sireum.B(isInitial))
  }

  def errorTransition(id: Name, sourceState: Name, condition: ErrorCondition, targetState: Name): ErrorTransition = {
    ErrorTransition(id, sourceState, condition, targetState)
  }

  def isz[T](l: JList[T]): ISZ[T] = {
    import scala.collection.JavaConverters._
    ISZ(l.asScala: _*)
  }
}
