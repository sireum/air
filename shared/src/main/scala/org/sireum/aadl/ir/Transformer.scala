// #Sireum
// @formatter:off

/*
 Copyright (c) 2018, Robby, Kansas State University
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

object Transformer {

  @datatype class PreResult[Context, T](ctx: Context,
                                        continu: B,
                                        resultOpt: Option[T])

  @datatype class Result[Context, T](ctx: Context,
                                     resultOpt: Option[T])

  @sig trait PrePost[Context] {

    @pure def preAadl(ctx: Context, o: Aadl): PreResult[Context, Aadl] = {
      return PreResult(ctx, T, None())
    }

    @pure def preName(ctx: Context, o: Name): PreResult[Context, Name] = {
      return PreResult(ctx, T, None())
    }

    @pure def preComponent(ctx: Context, o: Component): PreResult[Context, Component] = {
      return PreResult(ctx, T, None())
    }

    @pure def preClassifier(ctx: Context, o: Classifier): PreResult[Context, Classifier] = {
      return PreResult(ctx, T, None())
    }

    @pure def preFeature(ctx: Context, o: Feature): PreResult[Context, Feature] = {
      o match {
        case o: FeatureEnd =>
          val r: PreResult[Context, Feature] = preFeatureEnd(ctx, o) match {
            case PreResult(preCtx, continu, Some(r: Feature)) => PreResult(preCtx, continu, Some[Feature](r))
            case PreResult(_, _, Some(_)) => halt("Can only produce object of type Feature")
            case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[Feature]())
          }
          return r
        case o: FeatureGroup =>
          val r: PreResult[Context, Feature] = preFeatureGroup(ctx, o) match {
            case PreResult(preCtx, continu, Some(r: Feature)) => PreResult(preCtx, continu, Some[Feature](r))
            case PreResult(_, _, Some(_)) => halt("Can only produce object of type Feature")
            case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[Feature]())
          }
          return r
      }
    }

    @pure def preFeatureEnd(ctx: Context, o: FeatureEnd): PreResult[Context, FeatureEnd] = {
      return PreResult(ctx, T, None())
    }

    @pure def preFeatureGroup(ctx: Context, o: FeatureGroup): PreResult[Context, FeatureGroup] = {
      return PreResult(ctx, T, None())
    }

    @pure def preConnection(ctx: Context, o: Connection): PreResult[Context, Connection] = {
      return PreResult(ctx, T, None())
    }

    @pure def preConnectionInstance(ctx: Context, o: ConnectionInstance): PreResult[Context, ConnectionInstance] = {
      return PreResult(ctx, T, None())
    }

    @pure def preConnectionReference(ctx: Context, o: ConnectionReference): PreResult[Context, ConnectionReference] = {
      return PreResult(ctx, T, None())
    }

    @pure def preEndPoint(ctx: Context, o: EndPoint): PreResult[Context, EndPoint] = {
      return PreResult(ctx, T, None())
    }

    @pure def preProperty(ctx: Context, o: Property): PreResult[Context, Property] = {
      return PreResult(ctx, T, None())
    }

    @pure def prePropertyValue(ctx: Context, o: PropertyValue): PreResult[Context, PropertyValue] = {
      o match {
        case o: ClassifierProp => return preClassifierProp(ctx, o)
        case o: RangeProp => return preRangeProp(ctx, o)
        case o: RecordProp => return preRecordProp(ctx, o)
        case o: ReferenceProp => return preReferenceProp(ctx, o)
        case o: UnitProp => return preUnitProp(ctx, o)
        case o: ValueProp => return preValueProp(ctx, o)
      }
    }

    @pure def preClassifierProp(ctx: Context, o: ClassifierProp): PreResult[Context, PropertyValue] = {
      return PreResult(ctx, T, None())
    }

    @pure def preRangeProp(ctx: Context, o: RangeProp): PreResult[Context, PropertyValue] = {
      return PreResult(ctx, T, None())
    }

    @pure def preRecordProp(ctx: Context, o: RecordProp): PreResult[Context, PropertyValue] = {
      return PreResult(ctx, T, None())
    }

    @pure def preReferenceProp(ctx: Context, o: ReferenceProp): PreResult[Context, PropertyValue] = {
      return PreResult(ctx, T, None())
    }

    @pure def preUnitProp(ctx: Context, o: UnitProp): PreResult[Context, PropertyValue] = {
      return PreResult(ctx, T, None())
    }

    @pure def preValueProp(ctx: Context, o: ValueProp): PreResult[Context, PropertyValue] = {
      return PreResult(ctx, T, None())
    }

    @pure def preMode(ctx: Context, o: Mode): PreResult[Context, Mode] = {
      return PreResult(ctx, T, None())
    }

    @pure def preFlow(ctx: Context, o: Flow): PreResult[Context, Flow] = {
      return PreResult(ctx, T, None())
    }

    @pure def preAnnex(ctx: Context, o: Annex): PreResult[Context, Annex] = {
      return PreResult(ctx, T, None())
    }

    @pure def preAnnexClause(ctx: Context, o: AnnexClause): PreResult[Context, AnnexClause] = {
      o match {
        case o: Emv2Library =>
          val r: PreResult[Context, AnnexClause] = preEmv2Library(ctx, o) match {
            case PreResult(preCtx, continu, Some(r: AnnexClause)) => PreResult(preCtx, continu, Some[AnnexClause](r))
            case PreResult(_, _, Some(_)) => halt("Can only produce object of type AnnexClause")
            case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AnnexClause]())
          }
          return r
        case o: Emv2Propagation =>
          val r: PreResult[Context, AnnexClause] = preEmv2Propagation(ctx, o) match {
            case PreResult(preCtx, continu, Some(r: AnnexClause)) => PreResult(preCtx, continu, Some[AnnexClause](r))
            case PreResult(_, _, Some(_)) => halt("Can only produce object of type AnnexClause")
            case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AnnexClause]())
          }
          return r
        case o: Emv2Flow =>
          val r: PreResult[Context, AnnexClause] = preEmv2Flow(ctx, o) match {
            case PreResult(preCtx, continu, Some(r: AnnexClause)) => PreResult(preCtx, continu, Some[AnnexClause](r))
            case PreResult(_, _, Some(_)) => halt("Can only produce object of type AnnexClause")
            case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AnnexClause]())
          }
          return r
        case o: Emv2Clause =>
          val r: PreResult[Context, AnnexClause] = preEmv2Clause(ctx, o) match {
            case PreResult(preCtx, continu, Some(r: AnnexClause)) => PreResult(preCtx, continu, Some[AnnexClause](r))
            case PreResult(_, _, Some(_)) => halt("Can only produce object of type AnnexClause")
            case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AnnexClause]())
          }
          return r
        case o: OtherAnnex =>
          val r: PreResult[Context, AnnexClause] = preOtherAnnex(ctx, o) match {
            case PreResult(preCtx, continu, Some(r: AnnexClause)) => PreResult(preCtx, continu, Some[AnnexClause](r))
            case PreResult(_, _, Some(_)) => halt("Can only produce object of type AnnexClause")
            case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AnnexClause]())
          }
          return r
      }
    }

    @pure def preEmv2Annex(ctx: Context, o: Emv2Annex): PreResult[Context, Emv2Annex] = {
      o match {
        case o: Emv2Library =>
          val r: PreResult[Context, Emv2Annex] = preEmv2Library(ctx, o) match {
            case PreResult(preCtx, continu, Some(r: Emv2Annex)) => PreResult(preCtx, continu, Some[Emv2Annex](r))
            case PreResult(_, _, Some(_)) => halt("Can only produce object of type Emv2Annex")
            case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[Emv2Annex]())
          }
          return r
        case o: Emv2Propagation =>
          val r: PreResult[Context, Emv2Annex] = preEmv2Propagation(ctx, o) match {
            case PreResult(preCtx, continu, Some(r: Emv2Annex)) => PreResult(preCtx, continu, Some[Emv2Annex](r))
            case PreResult(_, _, Some(_)) => halt("Can only produce object of type Emv2Annex")
            case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[Emv2Annex]())
          }
          return r
        case o: Emv2Flow =>
          val r: PreResult[Context, Emv2Annex] = preEmv2Flow(ctx, o) match {
            case PreResult(preCtx, continu, Some(r: Emv2Annex)) => PreResult(preCtx, continu, Some[Emv2Annex](r))
            case PreResult(_, _, Some(_)) => halt("Can only produce object of type Emv2Annex")
            case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[Emv2Annex]())
          }
          return r
        case o: Emv2Clause =>
          val r: PreResult[Context, Emv2Annex] = preEmv2Clause(ctx, o) match {
            case PreResult(preCtx, continu, Some(r: Emv2Annex)) => PreResult(preCtx, continu, Some[Emv2Annex](r))
            case PreResult(_, _, Some(_)) => halt("Can only produce object of type Emv2Annex")
            case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[Emv2Annex]())
          }
          return r
      }
    }

    @pure def preEmv2Library(ctx: Context, o: Emv2Library): PreResult[Context, Emv2Library] = {
      return PreResult(ctx, T, None())
    }

    @pure def preEmv2Propagation(ctx: Context, o: Emv2Propagation): PreResult[Context, Emv2Propagation] = {
      return PreResult(ctx, T, None())
    }

    @pure def preEmv2Flow(ctx: Context, o: Emv2Flow): PreResult[Context, Emv2Flow] = {
      return PreResult(ctx, T, None())
    }

    @pure def preEmv2Clause(ctx: Context, o: Emv2Clause): PreResult[Context, Emv2Clause] = {
      return PreResult(ctx, T, None())
    }

    @pure def preOtherAnnex(ctx: Context, o: OtherAnnex): PreResult[Context, OtherAnnex] = {
      return PreResult(ctx, T, None())
    }

    @pure def postAadl(ctx: Context, o: Aadl): Result[Context, Aadl] = {
      return Result(ctx, None())
    }

    @pure def postName(ctx: Context, o: Name): Result[Context, Name] = {
      return Result(ctx, None())
    }

    @pure def postComponent(ctx: Context, o: Component): Result[Context, Component] = {
      return Result(ctx, None())
    }

    @pure def postClassifier(ctx: Context, o: Classifier): Result[Context, Classifier] = {
      return Result(ctx, None())
    }

    @pure def postFeature(ctx: Context, o: Feature): Result[Context, Feature] = {
      o match {
        case o: FeatureEnd =>
          val r: Result[Context, Feature] = postFeatureEnd(ctx, o) match {
            case Result(postCtx, Some(result: Feature)) => Result(postCtx, Some[Feature](result))
            case Result(_, Some(_)) => halt("Can only produce object of type Feature")
            case Result(postCtx, _) => Result(postCtx, None[Feature]())
          }
          return r
        case o: FeatureGroup =>
          val r: Result[Context, Feature] = postFeatureGroup(ctx, o) match {
            case Result(postCtx, Some(result: Feature)) => Result(postCtx, Some[Feature](result))
            case Result(_, Some(_)) => halt("Can only produce object of type Feature")
            case Result(postCtx, _) => Result(postCtx, None[Feature]())
          }
          return r
      }
    }

    @pure def postFeatureEnd(ctx: Context, o: FeatureEnd): Result[Context, FeatureEnd] = {
      return Result(ctx, None())
    }

    @pure def postFeatureGroup(ctx: Context, o: FeatureGroup): Result[Context, FeatureGroup] = {
      return Result(ctx, None())
    }

    @pure def postConnection(ctx: Context, o: Connection): Result[Context, Connection] = {
      return Result(ctx, None())
    }

    @pure def postConnectionInstance(ctx: Context, o: ConnectionInstance): Result[Context, ConnectionInstance] = {
      return Result(ctx, None())
    }

    @pure def postConnectionReference(ctx: Context, o: ConnectionReference): Result[Context, ConnectionReference] = {
      return Result(ctx, None())
    }

    @pure def postEndPoint(ctx: Context, o: EndPoint): Result[Context, EndPoint] = {
      return Result(ctx, None())
    }

    @pure def postProperty(ctx: Context, o: Property): Result[Context, Property] = {
      return Result(ctx, None())
    }

    @pure def postPropertyValue(ctx: Context, o: PropertyValue): Result[Context, PropertyValue] = {
      o match {
        case o: ClassifierProp => return postClassifierProp(ctx, o)
        case o: RangeProp => return postRangeProp(ctx, o)
        case o: RecordProp => return postRecordProp(ctx, o)
        case o: ReferenceProp => return postReferenceProp(ctx, o)
        case o: UnitProp => return postUnitProp(ctx, o)
        case o: ValueProp => return postValueProp(ctx, o)
      }
    }

    @pure def postClassifierProp(ctx: Context, o: ClassifierProp): Result[Context, PropertyValue] = {
      return Result(ctx, None())
    }

    @pure def postRangeProp(ctx: Context, o: RangeProp): Result[Context, PropertyValue] = {
      return Result(ctx, None())
    }

    @pure def postRecordProp(ctx: Context, o: RecordProp): Result[Context, PropertyValue] = {
      return Result(ctx, None())
    }

    @pure def postReferenceProp(ctx: Context, o: ReferenceProp): Result[Context, PropertyValue] = {
      return Result(ctx, None())
    }

    @pure def postUnitProp(ctx: Context, o: UnitProp): Result[Context, PropertyValue] = {
      return Result(ctx, None())
    }

    @pure def postValueProp(ctx: Context, o: ValueProp): Result[Context, PropertyValue] = {
      return Result(ctx, None())
    }

    @pure def postMode(ctx: Context, o: Mode): Result[Context, Mode] = {
      return Result(ctx, None())
    }

    @pure def postFlow(ctx: Context, o: Flow): Result[Context, Flow] = {
      return Result(ctx, None())
    }

    @pure def postAnnex(ctx: Context, o: Annex): Result[Context, Annex] = {
      return Result(ctx, None())
    }

    @pure def postAnnexClause(ctx: Context, o: AnnexClause): Result[Context, AnnexClause] = {
      o match {
        case o: Emv2Library =>
          val r: Result[Context, AnnexClause] = postEmv2Library(ctx, o) match {
            case Result(postCtx, Some(result: AnnexClause)) => Result(postCtx, Some[AnnexClause](result))
            case Result(_, Some(_)) => halt("Can only produce object of type AnnexClause")
            case Result(postCtx, _) => Result(postCtx, None[AnnexClause]())
          }
          return r
        case o: Emv2Propagation =>
          val r: Result[Context, AnnexClause] = postEmv2Propagation(ctx, o) match {
            case Result(postCtx, Some(result: AnnexClause)) => Result(postCtx, Some[AnnexClause](result))
            case Result(_, Some(_)) => halt("Can only produce object of type AnnexClause")
            case Result(postCtx, _) => Result(postCtx, None[AnnexClause]())
          }
          return r
        case o: Emv2Flow =>
          val r: Result[Context, AnnexClause] = postEmv2Flow(ctx, o) match {
            case Result(postCtx, Some(result: AnnexClause)) => Result(postCtx, Some[AnnexClause](result))
            case Result(_, Some(_)) => halt("Can only produce object of type AnnexClause")
            case Result(postCtx, _) => Result(postCtx, None[AnnexClause]())
          }
          return r
        case o: Emv2Clause =>
          val r: Result[Context, AnnexClause] = postEmv2Clause(ctx, o) match {
            case Result(postCtx, Some(result: AnnexClause)) => Result(postCtx, Some[AnnexClause](result))
            case Result(_, Some(_)) => halt("Can only produce object of type AnnexClause")
            case Result(postCtx, _) => Result(postCtx, None[AnnexClause]())
          }
          return r
        case o: OtherAnnex =>
          val r: Result[Context, AnnexClause] = postOtherAnnex(ctx, o) match {
            case Result(postCtx, Some(result: AnnexClause)) => Result(postCtx, Some[AnnexClause](result))
            case Result(_, Some(_)) => halt("Can only produce object of type AnnexClause")
            case Result(postCtx, _) => Result(postCtx, None[AnnexClause]())
          }
          return r
      }
    }

    @pure def postEmv2Annex(ctx: Context, o: Emv2Annex): Result[Context, Emv2Annex] = {
      o match {
        case o: Emv2Library =>
          val r: Result[Context, Emv2Annex] = postEmv2Library(ctx, o) match {
            case Result(postCtx, Some(result: Emv2Annex)) => Result(postCtx, Some[Emv2Annex](result))
            case Result(_, Some(_)) => halt("Can only produce object of type Emv2Annex")
            case Result(postCtx, _) => Result(postCtx, None[Emv2Annex]())
          }
          return r
        case o: Emv2Propagation =>
          val r: Result[Context, Emv2Annex] = postEmv2Propagation(ctx, o) match {
            case Result(postCtx, Some(result: Emv2Annex)) => Result(postCtx, Some[Emv2Annex](result))
            case Result(_, Some(_)) => halt("Can only produce object of type Emv2Annex")
            case Result(postCtx, _) => Result(postCtx, None[Emv2Annex]())
          }
          return r
        case o: Emv2Flow =>
          val r: Result[Context, Emv2Annex] = postEmv2Flow(ctx, o) match {
            case Result(postCtx, Some(result: Emv2Annex)) => Result(postCtx, Some[Emv2Annex](result))
            case Result(_, Some(_)) => halt("Can only produce object of type Emv2Annex")
            case Result(postCtx, _) => Result(postCtx, None[Emv2Annex]())
          }
          return r
        case o: Emv2Clause =>
          val r: Result[Context, Emv2Annex] = postEmv2Clause(ctx, o) match {
            case Result(postCtx, Some(result: Emv2Annex)) => Result(postCtx, Some[Emv2Annex](result))
            case Result(_, Some(_)) => halt("Can only produce object of type Emv2Annex")
            case Result(postCtx, _) => Result(postCtx, None[Emv2Annex]())
          }
          return r
      }
    }

    @pure def postEmv2Library(ctx: Context, o: Emv2Library): Result[Context, Emv2Library] = {
      return Result(ctx, None())
    }

    @pure def postEmv2Propagation(ctx: Context, o: Emv2Propagation): Result[Context, Emv2Propagation] = {
      return Result(ctx, None())
    }

    @pure def postEmv2Flow(ctx: Context, o: Emv2Flow): Result[Context, Emv2Flow] = {
      return Result(ctx, None())
    }

    @pure def postEmv2Clause(ctx: Context, o: Emv2Clause): Result[Context, Emv2Clause] = {
      return Result(ctx, None())
    }

    @pure def postOtherAnnex(ctx: Context, o: OtherAnnex): Result[Context, OtherAnnex] = {
      return Result(ctx, None())
    }

  }

  @pure def transformISZ[Context, T](ctx: Context, s: IS[Z, T], f: (Context, T) => Result[Context, T]@pure): Result[Context, IS[Z, T]] = {
    val s2: MS[Z, T] = s.toMS
    var changed: B = F
    var ctxi = ctx
    for (i <- s2.indices) {
      val e: T = s(i)
      val r: Result[Context, T] = f(ctxi, e)
      ctxi = r.ctx
      changed = changed || r.resultOpt.nonEmpty
      s2(i) = r.resultOpt.getOrElse(e)
    }
    if (changed) {
      return Result(ctxi, Some(s2.toIS))
    } else {
      return Result[Context, IS[Z, T]](ctxi, None[IS[Z, T]]())
    }
  }

  @pure def transformOption[Context, T](ctx: Context, option: Option[T], f: (Context, T) => Result[Context, T]@pure): Result[Context, Option[T]] = {
    option match {
      case Some(v) =>
        val r = f(ctx, v)
        r.resultOpt match {
          case Some(_) => return Result(r.ctx, Some(r.resultOpt))
          case _ => return Result[Context, Option[T]](r.ctx, None[Option[T]]())
        }
      case _ => return Result[Context, Option[T]](ctx, None[Option[T]]())
    }
  }

}

import Transformer._

@datatype class Transformer[Context](pp: PrePost[Context]) {

  @pure def transformAadl(ctx: Context, o: Aadl): Result[Context, Aadl] = {
    val preR: PreResult[Context, Aadl] = pp.preAadl(ctx, o)
    val r: Result[Context, Aadl] = if (preR.continu) {
      val o2: Aadl = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: Result[Context, IS[Z, Component]] = transformISZ(ctx, o2.components, transformComponent _)
      val r1: Result[Context, IS[Z, Emv2Library]] = transformISZ(r0.ctx, o2.errorLib, transformEmv2Library _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        Result(r1.ctx, Some(o2(components = r0.resultOpt.getOrElse(o2.components), errorLib = r1.resultOpt.getOrElse(o2.errorLib))))
      else
        Result(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      Result(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      Result(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: Aadl = r.resultOpt.getOrElse(o)
    val postR: Result[Context, Aadl] = pp.postAadl(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return Result(postR.ctx, Some(o2))
    } else {
      return Result(postR.ctx, None())
    }
  }

  @pure def transformName(ctx: Context, o: Name): Result[Context, Name] = {
    val preR: PreResult[Context, Name] = pp.preName(ctx, o)
    val r: Result[Context, Name] = if (preR.continu) {
      val o2: Name = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      if (hasChanged)
        Result(ctx, Some(o2))
      else
        Result(ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      Result(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      Result(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: Name = r.resultOpt.getOrElse(o)
    val postR: Result[Context, Name] = pp.postName(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return Result(postR.ctx, Some(o2))
    } else {
      return Result(postR.ctx, None())
    }
  }

  @pure def transformComponent(ctx: Context, o: Component): Result[Context, Component] = {
    val preR: PreResult[Context, Component] = pp.preComponent(ctx, o)
    val r: Result[Context, Component] = if (preR.continu) {
      val o2: Component = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: Result[Context, Name] = transformName(ctx, o2.identifier)
      val r1: Result[Context, Option[Classifier]] = transformOption(r0.ctx, o2.classifier, transformClassifier _)
      val r2: Result[Context, IS[Z, Feature]] = transformISZ(r1.ctx, o2.features, transformFeature _)
      val r3: Result[Context, IS[Z, Component]] = transformISZ(r2.ctx, o2.subComponents, transformComponent _)
      val r4: Result[Context, IS[Z, Connection]] = transformISZ(r3.ctx, o2.connections, transformConnection _)
      val r5: Result[Context, IS[Z, ConnectionInstance]] = transformISZ(r4.ctx, o2.connectionInstances, transformConnectionInstance _)
      val r6: Result[Context, IS[Z, Property]] = transformISZ(r5.ctx, o2.properties, transformProperty _)
      val r7: Result[Context, IS[Z, Flow]] = transformISZ(r6.ctx, o2.flows, transformFlow _)
      val r8: Result[Context, IS[Z, Mode]] = transformISZ(r7.ctx, o2.modes, transformMode _)
      val r9: Result[Context, IS[Z, Annex]] = transformISZ(r8.ctx, o2.annexes, transformAnnex _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty || r5.resultOpt.nonEmpty || r6.resultOpt.nonEmpty || r7.resultOpt.nonEmpty || r8.resultOpt.nonEmpty || r9.resultOpt.nonEmpty)
        Result(r9.ctx, Some(o2(identifier = r0.resultOpt.getOrElse(o2.identifier), classifier = r1.resultOpt.getOrElse(o2.classifier), features = r2.resultOpt.getOrElse(o2.features), subComponents = r3.resultOpt.getOrElse(o2.subComponents), connections = r4.resultOpt.getOrElse(o2.connections), connectionInstances = r5.resultOpt.getOrElse(o2.connectionInstances), properties = r6.resultOpt.getOrElse(o2.properties), flows = r7.resultOpt.getOrElse(o2.flows), modes = r8.resultOpt.getOrElse(o2.modes), annexes = r9.resultOpt.getOrElse(o2.annexes))))
      else
        Result(r9.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      Result(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      Result(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: Component = r.resultOpt.getOrElse(o)
    val postR: Result[Context, Component] = pp.postComponent(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return Result(postR.ctx, Some(o2))
    } else {
      return Result(postR.ctx, None())
    }
  }

  @pure def transformClassifier(ctx: Context, o: Classifier): Result[Context, Classifier] = {
    val preR: PreResult[Context, Classifier] = pp.preClassifier(ctx, o)
    val r: Result[Context, Classifier] = if (preR.continu) {
      val o2: Classifier = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      if (hasChanged)
        Result(ctx, Some(o2))
      else
        Result(ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      Result(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      Result(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: Classifier = r.resultOpt.getOrElse(o)
    val postR: Result[Context, Classifier] = pp.postClassifier(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return Result(postR.ctx, Some(o2))
    } else {
      return Result(postR.ctx, None())
    }
  }

  @pure def transformFeature(ctx: Context, o: Feature): Result[Context, Feature] = {
    val preR: PreResult[Context, Feature] = pp.preFeature(ctx, o)
    val r: Result[Context, Feature] = if (preR.continu) {
      val o2: Feature = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: Result[Context, Feature] = o2 match {
        case o2: FeatureEnd =>
          val r0: Result[Context, Name] = transformName(ctx, o2.identifier)
          val r1: Result[Context, Option[Classifier]] = transformOption(r0.ctx, o2.classifier, transformClassifier _)
          val r2: Result[Context, IS[Z, Property]] = transformISZ(r1.ctx, o2.properties, transformProperty _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            Result(r2.ctx, Some(o2(identifier = r0.resultOpt.getOrElse(o2.identifier), classifier = r1.resultOpt.getOrElse(o2.classifier), properties = r2.resultOpt.getOrElse(o2.properties))))
          else
            Result(r2.ctx, None())
        case o2: FeatureGroup =>
          val r0: Result[Context, Name] = transformName(ctx, o2.identifier)
          val r1: Result[Context, IS[Z, Feature]] = transformISZ(r0.ctx, o2.features, transformFeature _)
          val r2: Result[Context, Option[Classifier]] = transformOption(r1.ctx, o2.classifier, transformClassifier _)
          val r3: Result[Context, IS[Z, Property]] = transformISZ(r2.ctx, o2.properties, transformProperty _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            Result(r3.ctx, Some(o2(identifier = r0.resultOpt.getOrElse(o2.identifier), features = r1.resultOpt.getOrElse(o2.features), classifier = r2.resultOpt.getOrElse(o2.classifier), properties = r3.resultOpt.getOrElse(o2.properties))))
          else
            Result(r3.ctx, None())
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      Result(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      Result(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: Feature = r.resultOpt.getOrElse(o)
    val postR: Result[Context, Feature] = pp.postFeature(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return Result(postR.ctx, Some(o2))
    } else {
      return Result(postR.ctx, None())
    }
  }

  @pure def transformFeatureEnd(ctx: Context, o: FeatureEnd): Result[Context, FeatureEnd] = {
    val preR: PreResult[Context, FeatureEnd] = pp.preFeatureEnd(ctx, o)
    val r: Result[Context, FeatureEnd] = if (preR.continu) {
      val o2: FeatureEnd = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: Result[Context, Name] = transformName(ctx, o2.identifier)
      val r1: Result[Context, Option[Classifier]] = transformOption(r0.ctx, o2.classifier, transformClassifier _)
      val r2: Result[Context, IS[Z, Property]] = transformISZ(r1.ctx, o2.properties, transformProperty _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        Result(r2.ctx, Some(o2(identifier = r0.resultOpt.getOrElse(o2.identifier), classifier = r1.resultOpt.getOrElse(o2.classifier), properties = r2.resultOpt.getOrElse(o2.properties))))
      else
        Result(r2.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      Result(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      Result(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: FeatureEnd = r.resultOpt.getOrElse(o)
    val postR: Result[Context, FeatureEnd] = pp.postFeatureEnd(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return Result(postR.ctx, Some(o2))
    } else {
      return Result(postR.ctx, None())
    }
  }

  @pure def transformFeatureGroup(ctx: Context, o: FeatureGroup): Result[Context, FeatureGroup] = {
    val preR: PreResult[Context, FeatureGroup] = pp.preFeatureGroup(ctx, o)
    val r: Result[Context, FeatureGroup] = if (preR.continu) {
      val o2: FeatureGroup = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: Result[Context, Name] = transformName(ctx, o2.identifier)
      val r1: Result[Context, IS[Z, Feature]] = transformISZ(r0.ctx, o2.features, transformFeature _)
      val r2: Result[Context, Option[Classifier]] = transformOption(r1.ctx, o2.classifier, transformClassifier _)
      val r3: Result[Context, IS[Z, Property]] = transformISZ(r2.ctx, o2.properties, transformProperty _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
        Result(r3.ctx, Some(o2(identifier = r0.resultOpt.getOrElse(o2.identifier), features = r1.resultOpt.getOrElse(o2.features), classifier = r2.resultOpt.getOrElse(o2.classifier), properties = r3.resultOpt.getOrElse(o2.properties))))
      else
        Result(r3.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      Result(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      Result(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: FeatureGroup = r.resultOpt.getOrElse(o)
    val postR: Result[Context, FeatureGroup] = pp.postFeatureGroup(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return Result(postR.ctx, Some(o2))
    } else {
      return Result(postR.ctx, None())
    }
  }

  @pure def transformConnection(ctx: Context, o: Connection): Result[Context, Connection] = {
    val preR: PreResult[Context, Connection] = pp.preConnection(ctx, o)
    val r: Result[Context, Connection] = if (preR.continu) {
      val o2: Connection = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: Result[Context, Name] = transformName(ctx, o2.name)
      val r1: Result[Context, IS[Z, EndPoint]] = transformISZ(r0.ctx, o2.src, transformEndPoint _)
      val r2: Result[Context, IS[Z, EndPoint]] = transformISZ(r1.ctx, o2.dst, transformEndPoint _)
      val r3: Result[Context, IS[Z, Name]] = transformISZ(r2.ctx, o2.connectionInstances, transformName _)
      val r4: Result[Context, IS[Z, Property]] = transformISZ(r3.ctx, o2.properties, transformProperty _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
        Result(r4.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), src = r1.resultOpt.getOrElse(o2.src), dst = r2.resultOpt.getOrElse(o2.dst), connectionInstances = r3.resultOpt.getOrElse(o2.connectionInstances), properties = r4.resultOpt.getOrElse(o2.properties))))
      else
        Result(r4.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      Result(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      Result(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: Connection = r.resultOpt.getOrElse(o)
    val postR: Result[Context, Connection] = pp.postConnection(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return Result(postR.ctx, Some(o2))
    } else {
      return Result(postR.ctx, None())
    }
  }

  @pure def transformConnectionInstance(ctx: Context, o: ConnectionInstance): Result[Context, ConnectionInstance] = {
    val preR: PreResult[Context, ConnectionInstance] = pp.preConnectionInstance(ctx, o)
    val r: Result[Context, ConnectionInstance] = if (preR.continu) {
      val o2: ConnectionInstance = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: Result[Context, Name] = transformName(ctx, o2.name)
      val r1: Result[Context, EndPoint] = transformEndPoint(r0.ctx, o2.src)
      val r2: Result[Context, EndPoint] = transformEndPoint(r1.ctx, o2.dst)
      val r3: Result[Context, IS[Z, ConnectionReference]] = transformISZ(r2.ctx, o2.connectionRefs, transformConnectionReference _)
      val r4: Result[Context, IS[Z, Property]] = transformISZ(r3.ctx, o2.properties, transformProperty _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
        Result(r4.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), src = r1.resultOpt.getOrElse(o2.src), dst = r2.resultOpt.getOrElse(o2.dst), connectionRefs = r3.resultOpt.getOrElse(o2.connectionRefs), properties = r4.resultOpt.getOrElse(o2.properties))))
      else
        Result(r4.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      Result(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      Result(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: ConnectionInstance = r.resultOpt.getOrElse(o)
    val postR: Result[Context, ConnectionInstance] = pp.postConnectionInstance(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return Result(postR.ctx, Some(o2))
    } else {
      return Result(postR.ctx, None())
    }
  }

  @pure def transformConnectionReference(ctx: Context, o: ConnectionReference): Result[Context, ConnectionReference] = {
    val preR: PreResult[Context, ConnectionReference] = pp.preConnectionReference(ctx, o)
    val r: Result[Context, ConnectionReference] = if (preR.continu) {
      val o2: ConnectionReference = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: Result[Context, Name] = transformName(ctx, o2.name)
      val r1: Result[Context, Name] = transformName(r0.ctx, o2.context)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        Result(r1.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), context = r1.resultOpt.getOrElse(o2.context))))
      else
        Result(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      Result(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      Result(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: ConnectionReference = r.resultOpt.getOrElse(o)
    val postR: Result[Context, ConnectionReference] = pp.postConnectionReference(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return Result(postR.ctx, Some(o2))
    } else {
      return Result(postR.ctx, None())
    }
  }

  @pure def transformEndPoint(ctx: Context, o: EndPoint): Result[Context, EndPoint] = {
    val preR: PreResult[Context, EndPoint] = pp.preEndPoint(ctx, o)
    val r: Result[Context, EndPoint] = if (preR.continu) {
      val o2: EndPoint = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: Result[Context, Name] = transformName(ctx, o2.component)
      val r1: Result[Context, Name] = transformName(r0.ctx, o2.feature)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        Result(r1.ctx, Some(o2(component = r0.resultOpt.getOrElse(o2.component), feature = r1.resultOpt.getOrElse(o2.feature))))
      else
        Result(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      Result(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      Result(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: EndPoint = r.resultOpt.getOrElse(o)
    val postR: Result[Context, EndPoint] = pp.postEndPoint(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return Result(postR.ctx, Some(o2))
    } else {
      return Result(postR.ctx, None())
    }
  }

  @pure def transformProperty(ctx: Context, o: Property): Result[Context, Property] = {
    val preR: PreResult[Context, Property] = pp.preProperty(ctx, o)
    val r: Result[Context, Property] = if (preR.continu) {
      val o2: Property = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: Result[Context, Name] = transformName(ctx, o2.name)
      val r1: Result[Context, IS[Z, PropertyValue]] = transformISZ(r0.ctx, o2.propertyValues, transformPropertyValue _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        Result(r1.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), propertyValues = r1.resultOpt.getOrElse(o2.propertyValues))))
      else
        Result(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      Result(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      Result(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: Property = r.resultOpt.getOrElse(o)
    val postR: Result[Context, Property] = pp.postProperty(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return Result(postR.ctx, Some(o2))
    } else {
      return Result(postR.ctx, None())
    }
  }

  @pure def transformPropertyValue(ctx: Context, o: PropertyValue): Result[Context, PropertyValue] = {
    val preR: PreResult[Context, PropertyValue] = pp.prePropertyValue(ctx, o)
    val r: Result[Context, PropertyValue] = if (preR.continu) {
      val o2: PropertyValue = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: Result[Context, PropertyValue] = o2 match {
        case o2: ClassifierProp =>
          if (hasChanged)
            Result(ctx, Some(o2))
          else
            Result(ctx, None())
        case o2: RangeProp =>
          val r0: Result[Context, UnitProp] = transformUnitProp(ctx, o2.low)
          val r1: Result[Context, UnitProp] = transformUnitProp(r0.ctx, o2.high)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            Result(r1.ctx, Some(o2(low = r0.resultOpt.getOrElse(o2.low), high = r1.resultOpt.getOrElse(o2.high))))
          else
            Result(r1.ctx, None())
        case o2: RecordProp =>
          val r0: Result[Context, IS[Z, Property]] = transformISZ(ctx, o2.properties, transformProperty _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            Result(r0.ctx, Some(o2(properties = r0.resultOpt.getOrElse(o2.properties))))
          else
            Result(r0.ctx, None())
        case o2: ReferenceProp =>
          val r0: Result[Context, Name] = transformName(ctx, o2.value)
          if (hasChanged || r0.resultOpt.nonEmpty)
            Result(r0.ctx, Some(o2(value = r0.resultOpt.getOrElse(o2.value))))
          else
            Result(r0.ctx, None())
        case o2: UnitProp =>
          if (hasChanged)
            Result(ctx, Some(o2))
          else
            Result(ctx, None())
        case o2: ValueProp =>
          if (hasChanged)
            Result(ctx, Some(o2))
          else
            Result(ctx, None())
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      Result(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      Result(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: PropertyValue = r.resultOpt.getOrElse(o)
    val postR: Result[Context, PropertyValue] = pp.postPropertyValue(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return Result(postR.ctx, Some(o2))
    } else {
      return Result(postR.ctx, None())
    }
  }

  @pure def transformMode(ctx: Context, o: Mode): Result[Context, Mode] = {
    val preR: PreResult[Context, Mode] = pp.preMode(ctx, o)
    val r: Result[Context, Mode] = if (preR.continu) {
      val o2: Mode = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: Result[Context, Name] = transformName(ctx, o2.name)
      if (hasChanged || r0.resultOpt.nonEmpty)
        Result(r0.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name))))
      else
        Result(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      Result(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      Result(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: Mode = r.resultOpt.getOrElse(o)
    val postR: Result[Context, Mode] = pp.postMode(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return Result(postR.ctx, Some(o2))
    } else {
      return Result(postR.ctx, None())
    }
  }

  @pure def transformFlow(ctx: Context, o: Flow): Result[Context, Flow] = {
    val preR: PreResult[Context, Flow] = pp.preFlow(ctx, o)
    val r: Result[Context, Flow] = if (preR.continu) {
      val o2: Flow = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: Result[Context, Name] = transformName(ctx, o2.name)
      if (hasChanged || r0.resultOpt.nonEmpty)
        Result(r0.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name))))
      else
        Result(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      Result(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      Result(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: Flow = r.resultOpt.getOrElse(o)
    val postR: Result[Context, Flow] = pp.postFlow(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return Result(postR.ctx, Some(o2))
    } else {
      return Result(postR.ctx, None())
    }
  }

  @pure def transformAnnex(ctx: Context, o: Annex): Result[Context, Annex] = {
    val preR: PreResult[Context, Annex] = pp.preAnnex(ctx, o)
    val r: Result[Context, Annex] = if (preR.continu) {
      val o2: Annex = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: Result[Context, AnnexClause] = transformAnnexClause(ctx, o2.clause)
      if (hasChanged || r0.resultOpt.nonEmpty)
        Result(r0.ctx, Some(o2(clause = r0.resultOpt.getOrElse(o2.clause))))
      else
        Result(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      Result(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      Result(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: Annex = r.resultOpt.getOrElse(o)
    val postR: Result[Context, Annex] = pp.postAnnex(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return Result(postR.ctx, Some(o2))
    } else {
      return Result(postR.ctx, None())
    }
  }

  @pure def transformAnnexClause(ctx: Context, o: AnnexClause): Result[Context, AnnexClause] = {
    val preR: PreResult[Context, AnnexClause] = pp.preAnnexClause(ctx, o)
    val r: Result[Context, AnnexClause] = if (preR.continu) {
      val o2: AnnexClause = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: Result[Context, AnnexClause] = o2 match {
        case o2: Emv2Library =>
          val r0: Result[Context, Name] = transformName(ctx, o2.name)
          if (hasChanged || r0.resultOpt.nonEmpty)
            Result(r0.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name))))
          else
            Result(r0.ctx, None())
        case o2: Emv2Propagation =>
          if (hasChanged)
            Result(ctx, Some(o2))
          else
            Result(ctx, None())
        case o2: Emv2Flow =>
          val r0: Result[Context, Name] = transformName(ctx, o2.identifier)
          val r1: Result[Context, Option[Emv2Propagation]] = transformOption(r0.ctx, o2.sourcePropagation, transformEmv2Propagation _)
          val r2: Result[Context, Option[Emv2Propagation]] = transformOption(r1.ctx, o2.sinkPropagation, transformEmv2Propagation _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            Result(r2.ctx, Some(o2(identifier = r0.resultOpt.getOrElse(o2.identifier), sourcePropagation = r1.resultOpt.getOrElse(o2.sourcePropagation), sinkPropagation = r2.resultOpt.getOrElse(o2.sinkPropagation))))
          else
            Result(r2.ctx, None())
        case o2: Emv2Clause =>
          val r0: Result[Context, IS[Z, Emv2Propagation]] = transformISZ(ctx, o2.propagations, transformEmv2Propagation _)
          val r1: Result[Context, IS[Z, Emv2Flow]] = transformISZ(r0.ctx, o2.flows, transformEmv2Flow _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            Result(r1.ctx, Some(o2(propagations = r0.resultOpt.getOrElse(o2.propagations), flows = r1.resultOpt.getOrElse(o2.flows))))
          else
            Result(r1.ctx, None())
        case o2: OtherAnnex =>
          if (hasChanged)
            Result(ctx, Some(o2))
          else
            Result(ctx, None())
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      Result(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      Result(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: AnnexClause = r.resultOpt.getOrElse(o)
    val postR: Result[Context, AnnexClause] = pp.postAnnexClause(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return Result(postR.ctx, Some(o2))
    } else {
      return Result(postR.ctx, None())
    }
  }

  @pure def transformEmv2Annex(ctx: Context, o: Emv2Annex): Result[Context, Emv2Annex] = {
    val preR: PreResult[Context, Emv2Annex] = pp.preEmv2Annex(ctx, o)
    val r: Result[Context, Emv2Annex] = if (preR.continu) {
      val o2: Emv2Annex = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: Result[Context, Emv2Annex] = o2 match {
        case o2: Emv2Library =>
          val r0: Result[Context, Name] = transformName(ctx, o2.name)
          if (hasChanged || r0.resultOpt.nonEmpty)
            Result(r0.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name))))
          else
            Result(r0.ctx, None())
        case o2: Emv2Propagation =>
          if (hasChanged)
            Result(ctx, Some(o2))
          else
            Result(ctx, None())
        case o2: Emv2Flow =>
          val r0: Result[Context, Name] = transformName(ctx, o2.identifier)
          val r1: Result[Context, Option[Emv2Propagation]] = transformOption(r0.ctx, o2.sourcePropagation, transformEmv2Propagation _)
          val r2: Result[Context, Option[Emv2Propagation]] = transformOption(r1.ctx, o2.sinkPropagation, transformEmv2Propagation _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            Result(r2.ctx, Some(o2(identifier = r0.resultOpt.getOrElse(o2.identifier), sourcePropagation = r1.resultOpt.getOrElse(o2.sourcePropagation), sinkPropagation = r2.resultOpt.getOrElse(o2.sinkPropagation))))
          else
            Result(r2.ctx, None())
        case o2: Emv2Clause =>
          val r0: Result[Context, IS[Z, Emv2Propagation]] = transformISZ(ctx, o2.propagations, transformEmv2Propagation _)
          val r1: Result[Context, IS[Z, Emv2Flow]] = transformISZ(r0.ctx, o2.flows, transformEmv2Flow _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            Result(r1.ctx, Some(o2(propagations = r0.resultOpt.getOrElse(o2.propagations), flows = r1.resultOpt.getOrElse(o2.flows))))
          else
            Result(r1.ctx, None())
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      Result(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      Result(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: Emv2Annex = r.resultOpt.getOrElse(o)
    val postR: Result[Context, Emv2Annex] = pp.postEmv2Annex(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return Result(postR.ctx, Some(o2))
    } else {
      return Result(postR.ctx, None())
    }
  }

  @pure def transformEmv2Library(ctx: Context, o: Emv2Library): Result[Context, Emv2Library] = {
    val preR: PreResult[Context, Emv2Library] = pp.preEmv2Library(ctx, o)
    val r: Result[Context, Emv2Library] = if (preR.continu) {
      val o2: Emv2Library = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: Result[Context, Name] = transformName(ctx, o2.name)
      if (hasChanged || r0.resultOpt.nonEmpty)
        Result(r0.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name))))
      else
        Result(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      Result(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      Result(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: Emv2Library = r.resultOpt.getOrElse(o)
    val postR: Result[Context, Emv2Library] = pp.postEmv2Library(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return Result(postR.ctx, Some(o2))
    } else {
      return Result(postR.ctx, None())
    }
  }

  @pure def transformEmv2Propagation(ctx: Context, o: Emv2Propagation): Result[Context, Emv2Propagation] = {
    val preR: PreResult[Context, Emv2Propagation] = pp.preEmv2Propagation(ctx, o)
    val r: Result[Context, Emv2Propagation] = if (preR.continu) {
      val o2: Emv2Propagation = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      if (hasChanged)
        Result(ctx, Some(o2))
      else
        Result(ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      Result(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      Result(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: Emv2Propagation = r.resultOpt.getOrElse(o)
    val postR: Result[Context, Emv2Propagation] = pp.postEmv2Propagation(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return Result(postR.ctx, Some(o2))
    } else {
      return Result(postR.ctx, None())
    }
  }

  @pure def transformEmv2Flow(ctx: Context, o: Emv2Flow): Result[Context, Emv2Flow] = {
    val preR: PreResult[Context, Emv2Flow] = pp.preEmv2Flow(ctx, o)
    val r: Result[Context, Emv2Flow] = if (preR.continu) {
      val o2: Emv2Flow = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: Result[Context, Name] = transformName(ctx, o2.identifier)
      val r1: Result[Context, Option[Emv2Propagation]] = transformOption(r0.ctx, o2.sourcePropagation, transformEmv2Propagation _)
      val r2: Result[Context, Option[Emv2Propagation]] = transformOption(r1.ctx, o2.sinkPropagation, transformEmv2Propagation _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        Result(r2.ctx, Some(o2(identifier = r0.resultOpt.getOrElse(o2.identifier), sourcePropagation = r1.resultOpt.getOrElse(o2.sourcePropagation), sinkPropagation = r2.resultOpt.getOrElse(o2.sinkPropagation))))
      else
        Result(r2.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      Result(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      Result(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: Emv2Flow = r.resultOpt.getOrElse(o)
    val postR: Result[Context, Emv2Flow] = pp.postEmv2Flow(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return Result(postR.ctx, Some(o2))
    } else {
      return Result(postR.ctx, None())
    }
  }

  @pure def transformEmv2Clause(ctx: Context, o: Emv2Clause): Result[Context, Emv2Clause] = {
    val preR: PreResult[Context, Emv2Clause] = pp.preEmv2Clause(ctx, o)
    val r: Result[Context, Emv2Clause] = if (preR.continu) {
      val o2: Emv2Clause = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: Result[Context, IS[Z, Emv2Propagation]] = transformISZ(ctx, o2.propagations, transformEmv2Propagation _)
      val r1: Result[Context, IS[Z, Emv2Flow]] = transformISZ(r0.ctx, o2.flows, transformEmv2Flow _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        Result(r1.ctx, Some(o2(propagations = r0.resultOpt.getOrElse(o2.propagations), flows = r1.resultOpt.getOrElse(o2.flows))))
      else
        Result(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      Result(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      Result(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: Emv2Clause = r.resultOpt.getOrElse(o)
    val postR: Result[Context, Emv2Clause] = pp.postEmv2Clause(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return Result(postR.ctx, Some(o2))
    } else {
      return Result(postR.ctx, None())
    }
  }

  @pure def transformOtherAnnex(ctx: Context, o: OtherAnnex): Result[Context, OtherAnnex] = {
    val preR: PreResult[Context, OtherAnnex] = pp.preOtherAnnex(ctx, o)
    val r: Result[Context, OtherAnnex] = if (preR.continu) {
      val o2: OtherAnnex = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      if (hasChanged)
        Result(ctx, Some(o2))
      else
        Result(ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      Result(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      Result(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: OtherAnnex = r.resultOpt.getOrElse(o)
    val postR: Result[Context, OtherAnnex] = pp.postOtherAnnex(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return Result(postR.ctx, Some(o2))
    } else {
      return Result(postR.ctx, None())
    }
  }

  @pure def transformUnitProp(ctx: Context, o: UnitProp): Result[Context, UnitProp] = {
    val preR: PreResult[Context, UnitProp] = pp.preUnitProp(ctx, o) match {
      case PreResult(preCtx, continu, Some(r: UnitProp)) => PreResult(preCtx, continu, Some[UnitProp](r))
      case PreResult(_, _, Some(_)) => halt("Can only produce object of type UnitProp")
      case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[UnitProp]())
    }
    val r: Result[Context, UnitProp] = if (preR.continu) {
      val o2: UnitProp = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      if (hasChanged)
        Result(ctx, Some(o2))
      else
        Result(ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      Result(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      Result(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: UnitProp = r.resultOpt.getOrElse(o)
    val postR: Result[Context, UnitProp] = pp.postUnitProp(r.ctx, o2) match {
      case Result(postCtx, Some(result: UnitProp)) => Result(postCtx, Some[UnitProp](result))
      case Result(_, Some(_)) => halt("Can only produce object of type UnitProp")
      case Result(postCtx, _) => Result(postCtx, None[UnitProp]())
    }
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return Result(postR.ctx, Some(o2))
    } else {
      return Result(postR.ctx, None())
    }
  }

}