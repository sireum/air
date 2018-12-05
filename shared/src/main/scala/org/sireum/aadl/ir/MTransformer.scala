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

object MTransformer {

  @record class PreResult[T](continu: B,
                             resultOpt: MOption[T])

  val PreResultAadl: PreResult[Aadl] = PreResult(T, MNone())

  val PostResultAadl: MOption[Aadl] = MNone()

  def transformISZ[T](s: IS[Z, T], f: T => MOption[T]): MOption[IS[Z, T]] = {
    val s2: MS[Z, T] = s.toMS
    var changed: B = F
    for (i <- s2.indices) {
      val e: T = s(i)
      val r: MOption[T] = f(e)
      changed = changed || r.nonEmpty
      s2(i) = r.getOrElse(e)
    }
    if (changed) {
      return MSome(s2.toIS)
    } else {
      return MNone()
    }
  }

  val PreResultName: PreResult[Name] = PreResult(T, MNone())

  val PostResultName: MOption[Name] = MNone()

  val PreResultComponent: PreResult[Component] = PreResult(T, MNone())

  val PostResultComponent: MOption[Component] = MNone()

  def transformOption[T](option: Option[T], f: T => MOption[T]): MOption[Option[T]] = {
    option match {
      case Some(v) =>
        val r = f(v)
        r match {
          case MSome(v2) => return MSome(Some(v2))
          case _ => return MNone()
        }
      case _ => return MNone()
    }
  }

  val PreResultClassifier: PreResult[Classifier] = PreResult(T, MNone())

  val PostResultClassifier: MOption[Classifier] = MNone()

  val PreResultFeatureEnd: PreResult[FeatureEnd] = PreResult(T, MNone())

  val PostResultFeatureEnd: MOption[FeatureEnd] = MNone()

  val PreResultFeatureGroup: PreResult[FeatureGroup] = PreResult(T, MNone())

  val PostResultFeatureGroup: MOption[FeatureGroup] = MNone()

  val PreResultFeatureAccess: PreResult[FeatureAccess] = PreResult(T, MNone())

  val PostResultFeatureAccess: MOption[FeatureAccess] = MNone()

  val PreResultConnection: PreResult[Connection] = PreResult(T, MNone())

  val PostResultConnection: MOption[Connection] = MNone()

  val PreResultConnectionInstance: PreResult[ConnectionInstance] = PreResult(T, MNone())

  val PostResultConnectionInstance: MOption[ConnectionInstance] = MNone()

  val PreResultConnectionReference: PreResult[ConnectionReference] = PreResult(T, MNone())

  val PostResultConnectionReference: MOption[ConnectionReference] = MNone()

  val PreResultEndPoint: PreResult[EndPoint] = PreResult(T, MNone())

  val PostResultEndPoint: MOption[EndPoint] = MNone()

  val PreResultProperty: PreResult[Property] = PreResult(T, MNone())

  val PostResultProperty: MOption[Property] = MNone()

  val PreResultClassifierProp: PreResult[PropertyValue] = PreResult(T, MNone())

  val PostResultClassifierProp: MOption[PropertyValue] = MNone()

  val PreResultRangeProp: PreResult[PropertyValue] = PreResult(T, MNone())

  val PostResultRangeProp: MOption[PropertyValue] = MNone()

  val PreResultRecordProp: PreResult[PropertyValue] = PreResult(T, MNone())

  val PostResultRecordProp: MOption[PropertyValue] = MNone()

  val PreResultReferenceProp: PreResult[PropertyValue] = PreResult(T, MNone())

  val PostResultReferenceProp: MOption[PropertyValue] = MNone()

  val PreResultUnitProp: PreResult[PropertyValue] = PreResult(T, MNone())

  val PostResultUnitProp: MOption[PropertyValue] = MNone()

  val PreResultValueProp: PreResult[PropertyValue] = PreResult(T, MNone())

  val PostResultValueProp: MOption[PropertyValue] = MNone()

  val PreResultMode: PreResult[Mode] = PreResult(T, MNone())

  val PostResultMode: MOption[Mode] = MNone()

  val PreResultFlow: PreResult[Flow] = PreResult(T, MNone())

  val PostResultFlow: MOption[Flow] = MNone()

  val PreResultAnnex: PreResult[Annex] = PreResult(T, MNone())

  val PostResultAnnex: MOption[Annex] = MNone()

  val PreResultEmv2Library: PreResult[Emv2Library] = PreResult(T, MNone())

  val PostResultEmv2Library: MOption[Emv2Library] = MNone()

  val PreResultEmv2Propagation: PreResult[Emv2Propagation] = PreResult(T, MNone())

  val PostResultEmv2Propagation: MOption[Emv2Propagation] = MNone()

  val PreResultEmv2Flow: PreResult[Emv2Flow] = PreResult(T, MNone())

  val PostResultEmv2Flow: MOption[Emv2Flow] = MNone()

  val PreResultEmv2Clause: PreResult[Emv2Clause] = PreResult(T, MNone())

  val PostResultEmv2Clause: MOption[Emv2Clause] = MNone()

  val PreResultOtherAnnex: PreResult[OtherAnnex] = PreResult(T, MNone())

  val PostResultOtherAnnex: MOption[OtherAnnex] = MNone()

}

import MTransformer._

@msig trait MTransformer {

  def preAadl(o: Aadl): PreResult[Aadl] = {
    return PreResultAadl
  }

  def preName(o: Name): PreResult[Name] = {
    return PreResultName
  }

  def preComponent(o: Component): PreResult[Component] = {
    return PreResultComponent
  }

  def preClassifier(o: Classifier): PreResult[Classifier] = {
    return PreResultClassifier
  }

  def preFeature(o: Feature): PreResult[Feature] = {
    o match {
      case o: FeatureEnd =>
        val r: PreResult[Feature] = preFeatureEnd(o) match {
         case PreResult(continu, MSome(r: Feature)) => PreResult(continu, MSome[Feature](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Feature")
         case PreResult(continu, _) => PreResult(continu, MNone[Feature]())
        }
        return r
      case o: FeatureGroup =>
        val r: PreResult[Feature] = preFeatureGroup(o) match {
         case PreResult(continu, MSome(r: Feature)) => PreResult(continu, MSome[Feature](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Feature")
         case PreResult(continu, _) => PreResult(continu, MNone[Feature]())
        }
        return r
      case o: FeatureAccess =>
        val r: PreResult[Feature] = preFeatureAccess(o) match {
         case PreResult(continu, MSome(r: Feature)) => PreResult(continu, MSome[Feature](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Feature")
         case PreResult(continu, _) => PreResult(continu, MNone[Feature]())
        }
        return r
    }
  }

  def preFeatureEnd(o: FeatureEnd): PreResult[FeatureEnd] = {
    return PreResultFeatureEnd
  }

  def preFeatureGroup(o: FeatureGroup): PreResult[FeatureGroup] = {
    return PreResultFeatureGroup
  }

  def preFeatureAccess(o: FeatureAccess): PreResult[FeatureAccess] = {
    return PreResultFeatureAccess
  }

  def preConnection(o: Connection): PreResult[Connection] = {
    return PreResultConnection
  }

  def preConnectionInstance(o: ConnectionInstance): PreResult[ConnectionInstance] = {
    return PreResultConnectionInstance
  }

  def preConnectionReference(o: ConnectionReference): PreResult[ConnectionReference] = {
    return PreResultConnectionReference
  }

  def preEndPoint(o: EndPoint): PreResult[EndPoint] = {
    return PreResultEndPoint
  }

  def preProperty(o: Property): PreResult[Property] = {
    return PreResultProperty
  }

  def prePropertyValue(o: PropertyValue): PreResult[PropertyValue] = {
    o match {
      case o: ClassifierProp => return preClassifierProp(o)
      case o: RangeProp => return preRangeProp(o)
      case o: RecordProp => return preRecordProp(o)
      case o: ReferenceProp => return preReferenceProp(o)
      case o: UnitProp => return preUnitProp(o)
      case o: ValueProp => return preValueProp(o)
    }
  }

  def preClassifierProp(o: ClassifierProp): PreResult[PropertyValue] = {
    return PreResultClassifierProp
  }

  def preRangeProp(o: RangeProp): PreResult[PropertyValue] = {
    return PreResultRangeProp
  }

  def preRecordProp(o: RecordProp): PreResult[PropertyValue] = {
    return PreResultRecordProp
  }

  def preReferenceProp(o: ReferenceProp): PreResult[PropertyValue] = {
    return PreResultReferenceProp
  }

  def preUnitProp(o: UnitProp): PreResult[PropertyValue] = {
    return PreResultUnitProp
  }

  def preValueProp(o: ValueProp): PreResult[PropertyValue] = {
    return PreResultValueProp
  }

  def preMode(o: Mode): PreResult[Mode] = {
    return PreResultMode
  }

  def preFlow(o: Flow): PreResult[Flow] = {
    return PreResultFlow
  }

  def preAnnex(o: Annex): PreResult[Annex] = {
    return PreResultAnnex
  }

  def preAnnexClause(o: AnnexClause): PreResult[AnnexClause] = {
    o match {
      case o: Emv2Library =>
        val r: PreResult[AnnexClause] = preEmv2Library(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: Emv2Propagation =>
        val r: PreResult[AnnexClause] = preEmv2Propagation(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: Emv2Flow =>
        val r: PreResult[AnnexClause] = preEmv2Flow(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: Emv2Clause =>
        val r: PreResult[AnnexClause] = preEmv2Clause(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: OtherAnnex =>
        val r: PreResult[AnnexClause] = preOtherAnnex(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
    }
  }

  def preEmv2Annex(o: Emv2Annex): PreResult[Emv2Annex] = {
    o match {
      case o: Emv2Library =>
        val r: PreResult[Emv2Annex] = preEmv2Library(o) match {
         case PreResult(continu, MSome(r: Emv2Annex)) => PreResult(continu, MSome[Emv2Annex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Emv2Annex")
         case PreResult(continu, _) => PreResult(continu, MNone[Emv2Annex]())
        }
        return r
      case o: Emv2Propagation =>
        val r: PreResult[Emv2Annex] = preEmv2Propagation(o) match {
         case PreResult(continu, MSome(r: Emv2Annex)) => PreResult(continu, MSome[Emv2Annex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Emv2Annex")
         case PreResult(continu, _) => PreResult(continu, MNone[Emv2Annex]())
        }
        return r
      case o: Emv2Flow =>
        val r: PreResult[Emv2Annex] = preEmv2Flow(o) match {
         case PreResult(continu, MSome(r: Emv2Annex)) => PreResult(continu, MSome[Emv2Annex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Emv2Annex")
         case PreResult(continu, _) => PreResult(continu, MNone[Emv2Annex]())
        }
        return r
      case o: Emv2Clause =>
        val r: PreResult[Emv2Annex] = preEmv2Clause(o) match {
         case PreResult(continu, MSome(r: Emv2Annex)) => PreResult(continu, MSome[Emv2Annex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Emv2Annex")
         case PreResult(continu, _) => PreResult(continu, MNone[Emv2Annex]())
        }
        return r
    }
  }

  def preEmv2Library(o: Emv2Library): PreResult[Emv2Library] = {
    return PreResultEmv2Library
  }

  def preEmv2Propagation(o: Emv2Propagation): PreResult[Emv2Propagation] = {
    return PreResultEmv2Propagation
  }

  def preEmv2Flow(o: Emv2Flow): PreResult[Emv2Flow] = {
    return PreResultEmv2Flow
  }

  def preEmv2Clause(o: Emv2Clause): PreResult[Emv2Clause] = {
    return PreResultEmv2Clause
  }

  def preOtherAnnex(o: OtherAnnex): PreResult[OtherAnnex] = {
    return PreResultOtherAnnex
  }

  def postAadl(o: Aadl): MOption[Aadl] = {
    return PostResultAadl
  }

  def postName(o: Name): MOption[Name] = {
    return PostResultName
  }

  def postComponent(o: Component): MOption[Component] = {
    return PostResultComponent
  }

  def postClassifier(o: Classifier): MOption[Classifier] = {
    return PostResultClassifier
  }

  def postFeature(o: Feature): MOption[Feature] = {
    o match {
      case o: FeatureEnd =>
        val r: MOption[Feature] = postFeatureEnd(o) match {
         case MSome(result: Feature) => MSome[Feature](result)
         case MSome(_) => halt("Can only produce object of type Feature")
         case _ => MNone[Feature]()
        }
        return r
      case o: FeatureGroup =>
        val r: MOption[Feature] = postFeatureGroup(o) match {
         case MSome(result: Feature) => MSome[Feature](result)
         case MSome(_) => halt("Can only produce object of type Feature")
         case _ => MNone[Feature]()
        }
        return r
      case o: FeatureAccess =>
        val r: MOption[Feature] = postFeatureAccess(o) match {
         case MSome(result: Feature) => MSome[Feature](result)
         case MSome(_) => halt("Can only produce object of type Feature")
         case _ => MNone[Feature]()
        }
        return r
    }
  }

  def postFeatureEnd(o: FeatureEnd): MOption[FeatureEnd] = {
    return PostResultFeatureEnd
  }

  def postFeatureGroup(o: FeatureGroup): MOption[FeatureGroup] = {
    return PostResultFeatureGroup
  }

  def postFeatureAccess(o: FeatureAccess): MOption[FeatureAccess] = {
    return PostResultFeatureAccess
  }

  def postConnection(o: Connection): MOption[Connection] = {
    return PostResultConnection
  }

  def postConnectionInstance(o: ConnectionInstance): MOption[ConnectionInstance] = {
    return PostResultConnectionInstance
  }

  def postConnectionReference(o: ConnectionReference): MOption[ConnectionReference] = {
    return PostResultConnectionReference
  }

  def postEndPoint(o: EndPoint): MOption[EndPoint] = {
    return PostResultEndPoint
  }

  def postProperty(o: Property): MOption[Property] = {
    return PostResultProperty
  }

  def postPropertyValue(o: PropertyValue): MOption[PropertyValue] = {
    o match {
      case o: ClassifierProp => return postClassifierProp(o)
      case o: RangeProp => return postRangeProp(o)
      case o: RecordProp => return postRecordProp(o)
      case o: ReferenceProp => return postReferenceProp(o)
      case o: UnitProp => return postUnitProp(o)
      case o: ValueProp => return postValueProp(o)
    }
  }

  def postClassifierProp(o: ClassifierProp): MOption[PropertyValue] = {
    return PostResultClassifierProp
  }

  def postRangeProp(o: RangeProp): MOption[PropertyValue] = {
    return PostResultRangeProp
  }

  def postRecordProp(o: RecordProp): MOption[PropertyValue] = {
    return PostResultRecordProp
  }

  def postReferenceProp(o: ReferenceProp): MOption[PropertyValue] = {
    return PostResultReferenceProp
  }

  def postUnitProp(o: UnitProp): MOption[PropertyValue] = {
    return PostResultUnitProp
  }

  def postValueProp(o: ValueProp): MOption[PropertyValue] = {
    return PostResultValueProp
  }

  def postMode(o: Mode): MOption[Mode] = {
    return PostResultMode
  }

  def postFlow(o: Flow): MOption[Flow] = {
    return PostResultFlow
  }

  def postAnnex(o: Annex): MOption[Annex] = {
    return PostResultAnnex
  }

  def postAnnexClause(o: AnnexClause): MOption[AnnexClause] = {
    o match {
      case o: Emv2Library =>
        val r: MOption[AnnexClause] = postEmv2Library(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: Emv2Propagation =>
        val r: MOption[AnnexClause] = postEmv2Propagation(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: Emv2Flow =>
        val r: MOption[AnnexClause] = postEmv2Flow(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: Emv2Clause =>
        val r: MOption[AnnexClause] = postEmv2Clause(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: OtherAnnex =>
        val r: MOption[AnnexClause] = postOtherAnnex(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
    }
  }

  def postEmv2Annex(o: Emv2Annex): MOption[Emv2Annex] = {
    o match {
      case o: Emv2Library =>
        val r: MOption[Emv2Annex] = postEmv2Library(o) match {
         case MSome(result: Emv2Annex) => MSome[Emv2Annex](result)
         case MSome(_) => halt("Can only produce object of type Emv2Annex")
         case _ => MNone[Emv2Annex]()
        }
        return r
      case o: Emv2Propagation =>
        val r: MOption[Emv2Annex] = postEmv2Propagation(o) match {
         case MSome(result: Emv2Annex) => MSome[Emv2Annex](result)
         case MSome(_) => halt("Can only produce object of type Emv2Annex")
         case _ => MNone[Emv2Annex]()
        }
        return r
      case o: Emv2Flow =>
        val r: MOption[Emv2Annex] = postEmv2Flow(o) match {
         case MSome(result: Emv2Annex) => MSome[Emv2Annex](result)
         case MSome(_) => halt("Can only produce object of type Emv2Annex")
         case _ => MNone[Emv2Annex]()
        }
        return r
      case o: Emv2Clause =>
        val r: MOption[Emv2Annex] = postEmv2Clause(o) match {
         case MSome(result: Emv2Annex) => MSome[Emv2Annex](result)
         case MSome(_) => halt("Can only produce object of type Emv2Annex")
         case _ => MNone[Emv2Annex]()
        }
        return r
    }
  }

  def postEmv2Library(o: Emv2Library): MOption[Emv2Library] = {
    return PostResultEmv2Library
  }

  def postEmv2Propagation(o: Emv2Propagation): MOption[Emv2Propagation] = {
    return PostResultEmv2Propagation
  }

  def postEmv2Flow(o: Emv2Flow): MOption[Emv2Flow] = {
    return PostResultEmv2Flow
  }

  def postEmv2Clause(o: Emv2Clause): MOption[Emv2Clause] = {
    return PostResultEmv2Clause
  }

  def postOtherAnnex(o: OtherAnnex): MOption[OtherAnnex] = {
    return PostResultOtherAnnex
  }

  def transformAadl(o: Aadl): MOption[Aadl] = {
    val preR: PreResult[Aadl] = preAadl(o)
    val r: MOption[Aadl] = if (preR.continu) {
      val o2: Aadl = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, Component]] = transformISZ(o2.components, transformComponent _)
      val r1: MOption[IS[Z, Emv2Library]] = transformISZ(o2.errorLib, transformEmv2Library _)
      val r2: MOption[IS[Z, Component]] = transformISZ(o2.dataComponents, transformComponent _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(components = r0.getOrElse(o2.components), errorLib = r1.getOrElse(o2.errorLib), dataComponents = r2.getOrElse(o2.dataComponents)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: Aadl = r.getOrElse(o)
    val postR: MOption[Aadl] = postAadl(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformName(o: Name): MOption[Name] = {
    val preR: PreResult[Name] = preName(o)
    val r: MOption[Name] = if (preR.continu) {
      val o2: Name = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      if (hasChanged)
        MSome(o2)
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: Name = r.getOrElse(o)
    val postR: MOption[Name] = postName(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformComponent(o: Component): MOption[Component] = {
    val preR: PreResult[Component] = preComponent(o)
    val r: MOption[Component] = if (preR.continu) {
      val o2: Component = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.identifier)
      val r1: MOption[Option[Classifier]] = transformOption(o2.classifier, transformClassifier _)
      val r2: MOption[IS[Z, Feature]] = transformISZ(o2.features, transformFeature _)
      val r3: MOption[IS[Z, Component]] = transformISZ(o2.subComponents, transformComponent _)
      val r4: MOption[IS[Z, Connection]] = transformISZ(o2.connections, transformConnection _)
      val r5: MOption[IS[Z, ConnectionInstance]] = transformISZ(o2.connectionInstances, transformConnectionInstance _)
      val r6: MOption[IS[Z, Property]] = transformISZ(o2.properties, transformProperty _)
      val r7: MOption[IS[Z, Flow]] = transformISZ(o2.flows, transformFlow _)
      val r8: MOption[IS[Z, Mode]] = transformISZ(o2.modes, transformMode _)
      val r9: MOption[IS[Z, Annex]] = transformISZ(o2.annexes, transformAnnex _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty || r5.nonEmpty || r6.nonEmpty || r7.nonEmpty || r8.nonEmpty || r9.nonEmpty)
        MSome(o2(identifier = r0.getOrElse(o2.identifier), classifier = r1.getOrElse(o2.classifier), features = r2.getOrElse(o2.features), subComponents = r3.getOrElse(o2.subComponents), connections = r4.getOrElse(o2.connections), connectionInstances = r5.getOrElse(o2.connectionInstances), properties = r6.getOrElse(o2.properties), flows = r7.getOrElse(o2.flows), modes = r8.getOrElse(o2.modes), annexes = r9.getOrElse(o2.annexes)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: Component = r.getOrElse(o)
    val postR: MOption[Component] = postComponent(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformClassifier(o: Classifier): MOption[Classifier] = {
    val preR: PreResult[Classifier] = preClassifier(o)
    val r: MOption[Classifier] = if (preR.continu) {
      val o2: Classifier = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      if (hasChanged)
        MSome(o2)
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: Classifier = r.getOrElse(o)
    val postR: MOption[Classifier] = postClassifier(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformFeature(o: Feature): MOption[Feature] = {
    val preR: PreResult[Feature] = preFeature(o)
    val r: MOption[Feature] = if (preR.continu) {
      val o2: Feature = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[Feature] = o2 match {
        case o2: FeatureEnd =>
          val r0: MOption[Name] = transformName(o2.identifier)
          val r1: MOption[Option[Classifier]] = transformOption(o2.classifier, transformClassifier _)
          val r2: MOption[IS[Z, Property]] = transformISZ(o2.properties, transformProperty _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(identifier = r0.getOrElse(o2.identifier), classifier = r1.getOrElse(o2.classifier), properties = r2.getOrElse(o2.properties)))
          else
            MNone()
        case o2: FeatureGroup =>
          val r0: MOption[Name] = transformName(o2.identifier)
          val r1: MOption[IS[Z, Feature]] = transformISZ(o2.features, transformFeature _)
          val r2: MOption[IS[Z, Property]] = transformISZ(o2.properties, transformProperty _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(identifier = r0.getOrElse(o2.identifier), features = r1.getOrElse(o2.features), properties = r2.getOrElse(o2.properties)))
          else
            MNone()
        case o2: FeatureAccess =>
          val r0: MOption[Name] = transformName(o2.identifier)
          val r1: MOption[Option[Classifier]] = transformOption(o2.classifier, transformClassifier _)
          val r2: MOption[IS[Z, Property]] = transformISZ(o2.properties, transformProperty _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(identifier = r0.getOrElse(o2.identifier), classifier = r1.getOrElse(o2.classifier), properties = r2.getOrElse(o2.properties)))
          else
            MNone()
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: Feature = r.getOrElse(o)
    val postR: MOption[Feature] = postFeature(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformFeatureEnd(o: FeatureEnd): MOption[FeatureEnd] = {
    val preR: PreResult[FeatureEnd] = preFeatureEnd(o)
    val r: MOption[FeatureEnd] = if (preR.continu) {
      val o2: FeatureEnd = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.identifier)
      val r1: MOption[Option[Classifier]] = transformOption(o2.classifier, transformClassifier _)
      val r2: MOption[IS[Z, Property]] = transformISZ(o2.properties, transformProperty _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(identifier = r0.getOrElse(o2.identifier), classifier = r1.getOrElse(o2.classifier), properties = r2.getOrElse(o2.properties)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: FeatureEnd = r.getOrElse(o)
    val postR: MOption[FeatureEnd] = postFeatureEnd(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformFeatureGroup(o: FeatureGroup): MOption[FeatureGroup] = {
    val preR: PreResult[FeatureGroup] = preFeatureGroup(o)
    val r: MOption[FeatureGroup] = if (preR.continu) {
      val o2: FeatureGroup = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.identifier)
      val r1: MOption[IS[Z, Feature]] = transformISZ(o2.features, transformFeature _)
      val r2: MOption[IS[Z, Property]] = transformISZ(o2.properties, transformProperty _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(identifier = r0.getOrElse(o2.identifier), features = r1.getOrElse(o2.features), properties = r2.getOrElse(o2.properties)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: FeatureGroup = r.getOrElse(o)
    val postR: MOption[FeatureGroup] = postFeatureGroup(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformFeatureAccess(o: FeatureAccess): MOption[FeatureAccess] = {
    val preR: PreResult[FeatureAccess] = preFeatureAccess(o)
    val r: MOption[FeatureAccess] = if (preR.continu) {
      val o2: FeatureAccess = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.identifier)
      val r1: MOption[Option[Classifier]] = transformOption(o2.classifier, transformClassifier _)
      val r2: MOption[IS[Z, Property]] = transformISZ(o2.properties, transformProperty _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(identifier = r0.getOrElse(o2.identifier), classifier = r1.getOrElse(o2.classifier), properties = r2.getOrElse(o2.properties)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: FeatureAccess = r.getOrElse(o)
    val postR: MOption[FeatureAccess] = postFeatureAccess(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformConnection(o: Connection): MOption[Connection] = {
    val preR: PreResult[Connection] = preConnection(o)
    val r: MOption[Connection] = if (preR.continu) {
      val o2: Connection = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.name)
      val r1: MOption[IS[Z, EndPoint]] = transformISZ(o2.src, transformEndPoint _)
      val r2: MOption[IS[Z, EndPoint]] = transformISZ(o2.dst, transformEndPoint _)
      val r3: MOption[IS[Z, Name]] = transformISZ(o2.connectionInstances, transformName _)
      val r4: MOption[IS[Z, Property]] = transformISZ(o2.properties, transformProperty _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
        MSome(o2(name = r0.getOrElse(o2.name), src = r1.getOrElse(o2.src), dst = r2.getOrElse(o2.dst), connectionInstances = r3.getOrElse(o2.connectionInstances), properties = r4.getOrElse(o2.properties)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: Connection = r.getOrElse(o)
    val postR: MOption[Connection] = postConnection(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformConnectionInstance(o: ConnectionInstance): MOption[ConnectionInstance] = {
    val preR: PreResult[ConnectionInstance] = preConnectionInstance(o)
    val r: MOption[ConnectionInstance] = if (preR.continu) {
      val o2: ConnectionInstance = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.name)
      val r1: MOption[EndPoint] = transformEndPoint(o2.src)
      val r2: MOption[EndPoint] = transformEndPoint(o2.dst)
      val r3: MOption[IS[Z, ConnectionReference]] = transformISZ(o2.connectionRefs, transformConnectionReference _)
      val r4: MOption[IS[Z, Property]] = transformISZ(o2.properties, transformProperty _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
        MSome(o2(name = r0.getOrElse(o2.name), src = r1.getOrElse(o2.src), dst = r2.getOrElse(o2.dst), connectionRefs = r3.getOrElse(o2.connectionRefs), properties = r4.getOrElse(o2.properties)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: ConnectionInstance = r.getOrElse(o)
    val postR: MOption[ConnectionInstance] = postConnectionInstance(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformConnectionReference(o: ConnectionReference): MOption[ConnectionReference] = {
    val preR: PreResult[ConnectionReference] = preConnectionReference(o)
    val r: MOption[ConnectionReference] = if (preR.continu) {
      val o2: ConnectionReference = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.name)
      val r1: MOption[Name] = transformName(o2.context)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(name = r0.getOrElse(o2.name), context = r1.getOrElse(o2.context)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: ConnectionReference = r.getOrElse(o)
    val postR: MOption[ConnectionReference] = postConnectionReference(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformEndPoint(o: EndPoint): MOption[EndPoint] = {
    val preR: PreResult[EndPoint] = preEndPoint(o)
    val r: MOption[EndPoint] = if (preR.continu) {
      val o2: EndPoint = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.component)
      val r1: MOption[Option[Name]] = transformOption(o2.feature, transformName _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(component = r0.getOrElse(o2.component), feature = r1.getOrElse(o2.feature)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: EndPoint = r.getOrElse(o)
    val postR: MOption[EndPoint] = postEndPoint(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformProperty(o: Property): MOption[Property] = {
    val preR: PreResult[Property] = preProperty(o)
    val r: MOption[Property] = if (preR.continu) {
      val o2: Property = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.name)
      val r1: MOption[IS[Z, PropertyValue]] = transformISZ(o2.propertyValues, transformPropertyValue _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(name = r0.getOrElse(o2.name), propertyValues = r1.getOrElse(o2.propertyValues)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: Property = r.getOrElse(o)
    val postR: MOption[Property] = postProperty(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformPropertyValue(o: PropertyValue): MOption[PropertyValue] = {
    val preR: PreResult[PropertyValue] = prePropertyValue(o)
    val r: MOption[PropertyValue] = if (preR.continu) {
      val o2: PropertyValue = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[PropertyValue] = o2 match {
        case o2: ClassifierProp =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: RangeProp =>
          val r0: MOption[UnitProp] = transformUnitProp(o2.low)
          val r1: MOption[UnitProp] = transformUnitProp(o2.high)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(low = r0.getOrElse(o2.low), high = r1.getOrElse(o2.high)))
          else
            MNone()
        case o2: RecordProp =>
          val r0: MOption[IS[Z, Property]] = transformISZ(o2.properties, transformProperty _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(properties = r0.getOrElse(o2.properties)))
          else
            MNone()
        case o2: ReferenceProp =>
          val r0: MOption[Name] = transformName(o2.value)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(value = r0.getOrElse(o2.value)))
          else
            MNone()
        case o2: UnitProp =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: ValueProp =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: PropertyValue = r.getOrElse(o)
    val postR: MOption[PropertyValue] = postPropertyValue(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformMode(o: Mode): MOption[Mode] = {
    val preR: PreResult[Mode] = preMode(o)
    val r: MOption[Mode] = if (preR.continu) {
      val o2: Mode = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.name)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(name = r0.getOrElse(o2.name)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: Mode = r.getOrElse(o)
    val postR: MOption[Mode] = postMode(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformFlow(o: Flow): MOption[Flow] = {
    val preR: PreResult[Flow] = preFlow(o)
    val r: MOption[Flow] = if (preR.continu) {
      val o2: Flow = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.name)
      val r1: MOption[Option[Feature]] = transformOption(o2.source, transformFeature _)
      val r2: MOption[Option[Feature]] = transformOption(o2.sink, transformFeature _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(name = r0.getOrElse(o2.name), source = r1.getOrElse(o2.source), sink = r2.getOrElse(o2.sink)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: Flow = r.getOrElse(o)
    val postR: MOption[Flow] = postFlow(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformAnnex(o: Annex): MOption[Annex] = {
    val preR: PreResult[Annex] = preAnnex(o)
    val r: MOption[Annex] = if (preR.continu) {
      val o2: Annex = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[AnnexClause] = transformAnnexClause(o2.clause)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(clause = r0.getOrElse(o2.clause)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: Annex = r.getOrElse(o)
    val postR: MOption[Annex] = postAnnex(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformAnnexClause(o: AnnexClause): MOption[AnnexClause] = {
    val preR: PreResult[AnnexClause] = preAnnexClause(o)
    val r: MOption[AnnexClause] = if (preR.continu) {
      val o2: AnnexClause = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[AnnexClause] = o2 match {
        case o2: Emv2Library =>
          val r0: MOption[Name] = transformName(o2.name)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(name = r0.getOrElse(o2.name)))
          else
            MNone()
        case o2: Emv2Propagation =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: Emv2Flow =>
          val r0: MOption[Name] = transformName(o2.identifier)
          val r1: MOption[Option[Emv2Propagation]] = transformOption(o2.sourcePropagation, transformEmv2Propagation _)
          val r2: MOption[Option[Emv2Propagation]] = transformOption(o2.sinkPropagation, transformEmv2Propagation _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(identifier = r0.getOrElse(o2.identifier), sourcePropagation = r1.getOrElse(o2.sourcePropagation), sinkPropagation = r2.getOrElse(o2.sinkPropagation)))
          else
            MNone()
        case o2: Emv2Clause =>
          val r0: MOption[IS[Z, Emv2Propagation]] = transformISZ(o2.propagations, transformEmv2Propagation _)
          val r1: MOption[IS[Z, Emv2Flow]] = transformISZ(o2.flows, transformEmv2Flow _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(propagations = r0.getOrElse(o2.propagations), flows = r1.getOrElse(o2.flows)))
          else
            MNone()
        case o2: OtherAnnex =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: AnnexClause = r.getOrElse(o)
    val postR: MOption[AnnexClause] = postAnnexClause(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformEmv2Annex(o: Emv2Annex): MOption[Emv2Annex] = {
    val preR: PreResult[Emv2Annex] = preEmv2Annex(o)
    val r: MOption[Emv2Annex] = if (preR.continu) {
      val o2: Emv2Annex = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[Emv2Annex] = o2 match {
        case o2: Emv2Library =>
          val r0: MOption[Name] = transformName(o2.name)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(name = r0.getOrElse(o2.name)))
          else
            MNone()
        case o2: Emv2Propagation =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: Emv2Flow =>
          val r0: MOption[Name] = transformName(o2.identifier)
          val r1: MOption[Option[Emv2Propagation]] = transformOption(o2.sourcePropagation, transformEmv2Propagation _)
          val r2: MOption[Option[Emv2Propagation]] = transformOption(o2.sinkPropagation, transformEmv2Propagation _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(identifier = r0.getOrElse(o2.identifier), sourcePropagation = r1.getOrElse(o2.sourcePropagation), sinkPropagation = r2.getOrElse(o2.sinkPropagation)))
          else
            MNone()
        case o2: Emv2Clause =>
          val r0: MOption[IS[Z, Emv2Propagation]] = transformISZ(o2.propagations, transformEmv2Propagation _)
          val r1: MOption[IS[Z, Emv2Flow]] = transformISZ(o2.flows, transformEmv2Flow _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(propagations = r0.getOrElse(o2.propagations), flows = r1.getOrElse(o2.flows)))
          else
            MNone()
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: Emv2Annex = r.getOrElse(o)
    val postR: MOption[Emv2Annex] = postEmv2Annex(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformEmv2Library(o: Emv2Library): MOption[Emv2Library] = {
    val preR: PreResult[Emv2Library] = preEmv2Library(o)
    val r: MOption[Emv2Library] = if (preR.continu) {
      val o2: Emv2Library = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.name)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(name = r0.getOrElse(o2.name)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: Emv2Library = r.getOrElse(o)
    val postR: MOption[Emv2Library] = postEmv2Library(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformEmv2Propagation(o: Emv2Propagation): MOption[Emv2Propagation] = {
    val preR: PreResult[Emv2Propagation] = preEmv2Propagation(o)
    val r: MOption[Emv2Propagation] = if (preR.continu) {
      val o2: Emv2Propagation = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      if (hasChanged)
        MSome(o2)
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: Emv2Propagation = r.getOrElse(o)
    val postR: MOption[Emv2Propagation] = postEmv2Propagation(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformEmv2Flow(o: Emv2Flow): MOption[Emv2Flow] = {
    val preR: PreResult[Emv2Flow] = preEmv2Flow(o)
    val r: MOption[Emv2Flow] = if (preR.continu) {
      val o2: Emv2Flow = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.identifier)
      val r1: MOption[Option[Emv2Propagation]] = transformOption(o2.sourcePropagation, transformEmv2Propagation _)
      val r2: MOption[Option[Emv2Propagation]] = transformOption(o2.sinkPropagation, transformEmv2Propagation _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(identifier = r0.getOrElse(o2.identifier), sourcePropagation = r1.getOrElse(o2.sourcePropagation), sinkPropagation = r2.getOrElse(o2.sinkPropagation)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: Emv2Flow = r.getOrElse(o)
    val postR: MOption[Emv2Flow] = postEmv2Flow(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformEmv2Clause(o: Emv2Clause): MOption[Emv2Clause] = {
    val preR: PreResult[Emv2Clause] = preEmv2Clause(o)
    val r: MOption[Emv2Clause] = if (preR.continu) {
      val o2: Emv2Clause = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, Emv2Propagation]] = transformISZ(o2.propagations, transformEmv2Propagation _)
      val r1: MOption[IS[Z, Emv2Flow]] = transformISZ(o2.flows, transformEmv2Flow _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(propagations = r0.getOrElse(o2.propagations), flows = r1.getOrElse(o2.flows)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: Emv2Clause = r.getOrElse(o)
    val postR: MOption[Emv2Clause] = postEmv2Clause(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformOtherAnnex(o: OtherAnnex): MOption[OtherAnnex] = {
    val preR: PreResult[OtherAnnex] = preOtherAnnex(o)
    val r: MOption[OtherAnnex] = if (preR.continu) {
      val o2: OtherAnnex = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      if (hasChanged)
        MSome(o2)
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: OtherAnnex = r.getOrElse(o)
    val postR: MOption[OtherAnnex] = postOtherAnnex(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformUnitProp(o: UnitProp): MOption[UnitProp] = {
    val preR: PreResult[UnitProp] = preUnitProp(o) match {
     case PreResult(continu, MSome(r: UnitProp)) => PreResult(continu, MSome[UnitProp](r))
     case PreResult(_, MSome(_)) => halt("Can only produce object of type UnitProp")
     case PreResult(continu, _) => PreResult(continu, MNone[UnitProp]())
    }
    val r: MOption[UnitProp] = if (preR.continu) {
      val o2: UnitProp = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      if (hasChanged)
        MSome(o2)
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: UnitProp = r.getOrElse(o)
    val postR: MOption[UnitProp] = postUnitProp(o2) match {
     case MSome(result: UnitProp) => MSome[UnitProp](result)
     case MSome(_) => halt("Can only produce object of type UnitProp")
     case _ => MNone[UnitProp]()
    }
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

}