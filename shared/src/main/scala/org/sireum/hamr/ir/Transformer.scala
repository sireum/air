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

object Transformer {

  @datatype class PreResult[Context, T](ctx: Context,
                                        continu: B,
                                        resultOpt: Option[T])

  @datatype class TPostResult[Context, T](ctx: Context,
                                     resultOpt: Option[T])

  @sig trait PrePost[Context] {

    @pure def preAadlInstInfo(ctx: Context, o: AadlInstInfo): PreResult[Context, AadlInstInfo] = {
      o match {
        case o: Component =>
          val r: PreResult[Context, AadlInstInfo] = preComponent(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: AadlInstInfo)) => PreResult(preCtx, continu, Some[AadlInstInfo](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type AadlInstInfo")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AadlInstInfo]())
          }
          return r
        case o: FeatureEnd =>
          val r: PreResult[Context, AadlInstInfo] = preFeatureEnd(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: AadlInstInfo)) => PreResult(preCtx, continu, Some[AadlInstInfo](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type AadlInstInfo")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AadlInstInfo]())
          }
          return r
        case o: FeatureGroup =>
          val r: PreResult[Context, AadlInstInfo] = preFeatureGroup(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: AadlInstInfo)) => PreResult(preCtx, continu, Some[AadlInstInfo](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type AadlInstInfo")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AadlInstInfo]())
          }
          return r
        case o: FeatureAccess =>
          val r: PreResult[Context, AadlInstInfo] = preFeatureAccess(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: AadlInstInfo)) => PreResult(preCtx, continu, Some[AadlInstInfo](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type AadlInstInfo")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AadlInstInfo]())
          }
          return r
        case o: Connection =>
          val r: PreResult[Context, AadlInstInfo] = preConnection(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: AadlInstInfo)) => PreResult(preCtx, continu, Some[AadlInstInfo](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type AadlInstInfo")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AadlInstInfo]())
          }
          return r
        case o: Flow =>
          val r: PreResult[Context, AadlInstInfo] = preFlow(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: AadlInstInfo)) => PreResult(preCtx, continu, Some[AadlInstInfo](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type AadlInstInfo")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AadlInstInfo]())
          }
          return r
        case o: Emv2Flow =>
          val r: PreResult[Context, AadlInstInfo] = preEmv2Flow(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: AadlInstInfo)) => PreResult(preCtx, continu, Some[AadlInstInfo](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type AadlInstInfo")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AadlInstInfo]())
          }
          return r
      }
    }

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
        case o: FeatureAccess =>
          val r: PreResult[Context, Feature] = preFeatureAccess(ctx, o) match {
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

    @pure def preFeatureAccess(ctx: Context, o: FeatureAccess): PreResult[Context, FeatureAccess] = {
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

    @pure def preElementRef(ctx: Context, o: ElementRef): PreResult[Context, ElementRef] = {
      o match {
        case o: AadlElementRef =>
          val r: PreResult[Context, ElementRef] = preAadlElementRef(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: ElementRef)) => PreResult(preCtx, continu, Some[ElementRef](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type ElementRef")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[ElementRef]())
          }
          return r
        case o: Emv2ElementRef =>
          val r: PreResult[Context, ElementRef] = preEmv2ElementRef(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: ElementRef)) => PreResult(preCtx, continu, Some[ElementRef](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type ElementRef")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[ElementRef]())
          }
          return r
      }
    }

    @pure def preAadlElementRef(ctx: Context, o: AadlElementRef): PreResult[Context, AadlElementRef] = {
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
        case o: ErrorTypeDef =>
          val r: PreResult[Context, AnnexClause] = preErrorTypeDef(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: AnnexClause)) => PreResult(preCtx, continu, Some[AnnexClause](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type AnnexClause")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AnnexClause]())
          }
          return r
        case o: ErrorAliasDef =>
          val r: PreResult[Context, AnnexClause] = preErrorAliasDef(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: AnnexClause)) => PreResult(preCtx, continu, Some[AnnexClause](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type AnnexClause")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AnnexClause]())
          }
          return r
        case o: ErrorTypeSetDef =>
          val r: PreResult[Context, AnnexClause] = preErrorTypeSetDef(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: AnnexClause)) => PreResult(preCtx, continu, Some[AnnexClause](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type AnnexClause")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AnnexClause]())
          }
          return r
        case o: BehaveStateMachine =>
          val r: PreResult[Context, AnnexClause] = preBehaveStateMachine(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: AnnexClause)) => PreResult(preCtx, continu, Some[AnnexClause](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type AnnexClause")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AnnexClause]())
          }
          return r
        case o: ErrorEvent =>
          val r: PreResult[Context, AnnexClause] = preErrorEvent(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: AnnexClause)) => PreResult(preCtx, continu, Some[AnnexClause](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type AnnexClause")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AnnexClause]())
          }
          return r
        case o: ErrorState =>
          val r: PreResult[Context, AnnexClause] = preErrorState(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: AnnexClause)) => PreResult(preCtx, continu, Some[AnnexClause](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type AnnexClause")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AnnexClause]())
          }
          return r
        case o: ErrorTransition =>
          val r: PreResult[Context, AnnexClause] = preErrorTransition(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: AnnexClause)) => PreResult(preCtx, continu, Some[AnnexClause](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type AnnexClause")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AnnexClause]())
          }
          return r
        case o: ConditionTrigger =>
          val r: PreResult[Context, AnnexClause] = preConditionTrigger(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: AnnexClause)) => PreResult(preCtx, continu, Some[AnnexClause](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type AnnexClause")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AnnexClause]())
          }
          return r
        case o: AndCondition =>
          val r: PreResult[Context, AnnexClause] = preAndCondition(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: AnnexClause)) => PreResult(preCtx, continu, Some[AnnexClause](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type AnnexClause")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AnnexClause]())
          }
          return r
        case o: OrCondition =>
          val r: PreResult[Context, AnnexClause] = preOrCondition(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: AnnexClause)) => PreResult(preCtx, continu, Some[AnnexClause](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type AnnexClause")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AnnexClause]())
          }
          return r
        case o: AllCondition =>
          val r: PreResult[Context, AnnexClause] = preAllCondition(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: AnnexClause)) => PreResult(preCtx, continu, Some[AnnexClause](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type AnnexClause")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AnnexClause]())
          }
          return r
        case o: OrMoreCondition =>
          val r: PreResult[Context, AnnexClause] = preOrMoreCondition(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: AnnexClause)) => PreResult(preCtx, continu, Some[AnnexClause](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type AnnexClause")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AnnexClause]())
          }
          return r
        case o: OrLessCondition =>
          val r: PreResult[Context, AnnexClause] = preOrLessCondition(ctx, o) match {
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
        case o: Emv2BehaviorSection =>
          val r: PreResult[Context, AnnexClause] = preEmv2BehaviorSection(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: AnnexClause)) => PreResult(preCtx, continu, Some[AnnexClause](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type AnnexClause")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AnnexClause]())
          }
          return r
        case o: ErrorPropagation =>
          val r: PreResult[Context, AnnexClause] = preErrorPropagation(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: AnnexClause)) => PreResult(preCtx, continu, Some[AnnexClause](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type AnnexClause")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AnnexClause]())
          }
          return r
        case o: SmfClause =>
          val r: PreResult[Context, AnnexClause] = preSmfClause(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: AnnexClause)) => PreResult(preCtx, continu, Some[AnnexClause](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type AnnexClause")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AnnexClause]())
          }
          return r
        case o: SmfClassification =>
          val r: PreResult[Context, AnnexClause] = preSmfClassification(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: AnnexClause)) => PreResult(preCtx, continu, Some[AnnexClause](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type AnnexClause")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AnnexClause]())
          }
          return r
        case o: SmfDeclass =>
          val r: PreResult[Context, AnnexClause] = preSmfDeclass(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: AnnexClause)) => PreResult(preCtx, continu, Some[AnnexClause](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type AnnexClause")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AnnexClause]())
          }
          return r
        case o: SmfType =>
          val r: PreResult[Context, AnnexClause] = preSmfType(ctx, o) match {
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

    @pure def preAnnexLib(ctx: Context, o: AnnexLib): PreResult[Context, AnnexLib] = {
      o match {
        case o: Emv2Library =>
          val r: PreResult[Context, AnnexLib] = preEmv2Library(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: AnnexLib)) => PreResult(preCtx, continu, Some[AnnexLib](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type AnnexLib")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AnnexLib]())
          }
          return r
        case o: SmfLibrary =>
          val r: PreResult[Context, AnnexLib] = preSmfLibrary(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: AnnexLib)) => PreResult(preCtx, continu, Some[AnnexLib](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type AnnexLib")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AnnexLib]())
          }
          return r
      }
    }

    @pure def preEmv2Annex(ctx: Context, o: Emv2Annex): PreResult[Context, Emv2Annex] = {
      o match {
        case o: ErrorTypeDef =>
          val r: PreResult[Context, Emv2Annex] = preErrorTypeDef(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: Emv2Annex)) => PreResult(preCtx, continu, Some[Emv2Annex](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type Emv2Annex")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[Emv2Annex]())
          }
          return r
        case o: ErrorAliasDef =>
          val r: PreResult[Context, Emv2Annex] = preErrorAliasDef(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: Emv2Annex)) => PreResult(preCtx, continu, Some[Emv2Annex](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type Emv2Annex")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[Emv2Annex]())
          }
          return r
        case o: ErrorTypeSetDef =>
          val r: PreResult[Context, Emv2Annex] = preErrorTypeSetDef(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: Emv2Annex)) => PreResult(preCtx, continu, Some[Emv2Annex](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type Emv2Annex")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[Emv2Annex]())
          }
          return r
        case o: BehaveStateMachine =>
          val r: PreResult[Context, Emv2Annex] = preBehaveStateMachine(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: Emv2Annex)) => PreResult(preCtx, continu, Some[Emv2Annex](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type Emv2Annex")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[Emv2Annex]())
          }
          return r
        case o: ErrorEvent =>
          val r: PreResult[Context, Emv2Annex] = preErrorEvent(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: Emv2Annex)) => PreResult(preCtx, continu, Some[Emv2Annex](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type Emv2Annex")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[Emv2Annex]())
          }
          return r
        case o: ErrorState =>
          val r: PreResult[Context, Emv2Annex] = preErrorState(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: Emv2Annex)) => PreResult(preCtx, continu, Some[Emv2Annex](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type Emv2Annex")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[Emv2Annex]())
          }
          return r
        case o: ErrorTransition =>
          val r: PreResult[Context, Emv2Annex] = preErrorTransition(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: Emv2Annex)) => PreResult(preCtx, continu, Some[Emv2Annex](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type Emv2Annex")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[Emv2Annex]())
          }
          return r
        case o: ConditionTrigger =>
          val r: PreResult[Context, Emv2Annex] = preConditionTrigger(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: Emv2Annex)) => PreResult(preCtx, continu, Some[Emv2Annex](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type Emv2Annex")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[Emv2Annex]())
          }
          return r
        case o: AndCondition =>
          val r: PreResult[Context, Emv2Annex] = preAndCondition(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: Emv2Annex)) => PreResult(preCtx, continu, Some[Emv2Annex](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type Emv2Annex")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[Emv2Annex]())
          }
          return r
        case o: OrCondition =>
          val r: PreResult[Context, Emv2Annex] = preOrCondition(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: Emv2Annex)) => PreResult(preCtx, continu, Some[Emv2Annex](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type Emv2Annex")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[Emv2Annex]())
          }
          return r
        case o: AllCondition =>
          val r: PreResult[Context, Emv2Annex] = preAllCondition(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: Emv2Annex)) => PreResult(preCtx, continu, Some[Emv2Annex](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type Emv2Annex")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[Emv2Annex]())
          }
          return r
        case o: OrMoreCondition =>
          val r: PreResult[Context, Emv2Annex] = preOrMoreCondition(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: Emv2Annex)) => PreResult(preCtx, continu, Some[Emv2Annex](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type Emv2Annex")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[Emv2Annex]())
          }
          return r
        case o: OrLessCondition =>
          val r: PreResult[Context, Emv2Annex] = preOrLessCondition(ctx, o) match {
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
        case o: Emv2BehaviorSection =>
          val r: PreResult[Context, Emv2Annex] = preEmv2BehaviorSection(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: Emv2Annex)) => PreResult(preCtx, continu, Some[Emv2Annex](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type Emv2Annex")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[Emv2Annex]())
          }
          return r
        case o: ErrorPropagation =>
          val r: PreResult[Context, Emv2Annex] = preErrorPropagation(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: Emv2Annex)) => PreResult(preCtx, continu, Some[Emv2Annex](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type Emv2Annex")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[Emv2Annex]())
          }
          return r
      }
    }

    @pure def preEmv2Lib(ctx: Context, o: Emv2Lib): PreResult[Context, Emv2Lib] = {
      o match {
        case o: Emv2Library =>
          val r: PreResult[Context, Emv2Lib] = preEmv2Library(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: Emv2Lib)) => PreResult(preCtx, continu, Some[Emv2Lib](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type Emv2Lib")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[Emv2Lib]())
          }
          return r
      }
    }

    @pure def preEmv2ElementRef(ctx: Context, o: Emv2ElementRef): PreResult[Context, Emv2ElementRef] = {
      return PreResult(ctx, T, None())
    }

    @pure def preEmv2Library(ctx: Context, o: Emv2Library): PreResult[Context, Emv2Library] = {
      return PreResult(ctx, T, None())
    }

    @pure def preErrorTypeDef(ctx: Context, o: ErrorTypeDef): PreResult[Context, ErrorTypeDef] = {
      return PreResult(ctx, T, None())
    }

    @pure def preErrorAliasDef(ctx: Context, o: ErrorAliasDef): PreResult[Context, ErrorAliasDef] = {
      return PreResult(ctx, T, None())
    }

    @pure def preErrorTypeSetDef(ctx: Context, o: ErrorTypeSetDef): PreResult[Context, ErrorTypeSetDef] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBehaveStateMachine(ctx: Context, o: BehaveStateMachine): PreResult[Context, BehaveStateMachine] = {
      return PreResult(ctx, T, None())
    }

    @pure def preErrorEvent(ctx: Context, o: ErrorEvent): PreResult[Context, ErrorEvent] = {
      return PreResult(ctx, T, None())
    }

    @pure def preErrorState(ctx: Context, o: ErrorState): PreResult[Context, ErrorState] = {
      return PreResult(ctx, T, None())
    }

    @pure def preErrorTransition(ctx: Context, o: ErrorTransition): PreResult[Context, ErrorTransition] = {
      return PreResult(ctx, T, None())
    }

    @pure def preErrorCondition(ctx: Context, o: ErrorCondition): PreResult[Context, ErrorCondition] = {
      o match {
        case o: ConditionTrigger =>
          val r: PreResult[Context, ErrorCondition] = preConditionTrigger(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: ErrorCondition)) => PreResult(preCtx, continu, Some[ErrorCondition](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type ErrorCondition")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[ErrorCondition]())
          }
          return r
        case o: AndCondition =>
          val r: PreResult[Context, ErrorCondition] = preAndCondition(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: ErrorCondition)) => PreResult(preCtx, continu, Some[ErrorCondition](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type ErrorCondition")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[ErrorCondition]())
          }
          return r
        case o: OrCondition =>
          val r: PreResult[Context, ErrorCondition] = preOrCondition(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: ErrorCondition)) => PreResult(preCtx, continu, Some[ErrorCondition](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type ErrorCondition")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[ErrorCondition]())
          }
          return r
        case o: AllCondition =>
          val r: PreResult[Context, ErrorCondition] = preAllCondition(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: ErrorCondition)) => PreResult(preCtx, continu, Some[ErrorCondition](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type ErrorCondition")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[ErrorCondition]())
          }
          return r
        case o: OrMoreCondition =>
          val r: PreResult[Context, ErrorCondition] = preOrMoreCondition(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: ErrorCondition)) => PreResult(preCtx, continu, Some[ErrorCondition](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type ErrorCondition")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[ErrorCondition]())
          }
          return r
        case o: OrLessCondition =>
          val r: PreResult[Context, ErrorCondition] = preOrLessCondition(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: ErrorCondition)) => PreResult(preCtx, continu, Some[ErrorCondition](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type ErrorCondition")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[ErrorCondition]())
          }
          return r
      }
    }

    @pure def preConditionTrigger(ctx: Context, o: ConditionTrigger): PreResult[Context, ConditionTrigger] = {
      return PreResult(ctx, T, None())
    }

    @pure def preAndCondition(ctx: Context, o: AndCondition): PreResult[Context, AndCondition] = {
      return PreResult(ctx, T, None())
    }

    @pure def preOrCondition(ctx: Context, o: OrCondition): PreResult[Context, OrCondition] = {
      return PreResult(ctx, T, None())
    }

    @pure def preAllCondition(ctx: Context, o: AllCondition): PreResult[Context, AllCondition] = {
      return PreResult(ctx, T, None())
    }

    @pure def preOrMoreCondition(ctx: Context, o: OrMoreCondition): PreResult[Context, OrMoreCondition] = {
      return PreResult(ctx, T, None())
    }

    @pure def preOrLessCondition(ctx: Context, o: OrLessCondition): PreResult[Context, OrLessCondition] = {
      return PreResult(ctx, T, None())
    }

    @pure def preEmv2Clause(ctx: Context, o: Emv2Clause): PreResult[Context, Emv2Clause] = {
      return PreResult(ctx, T, None())
    }

    @pure def preEmv2Propagation(ctx: Context, o: Emv2Propagation): PreResult[Context, Emv2Propagation] = {
      return PreResult(ctx, T, None())
    }

    @pure def preEmv2Flow(ctx: Context, o: Emv2Flow): PreResult[Context, Emv2Flow] = {
      return PreResult(ctx, T, None())
    }

    @pure def preEmv2BehaviorSection(ctx: Context, o: Emv2BehaviorSection): PreResult[Context, Emv2BehaviorSection] = {
      return PreResult(ctx, T, None())
    }

    @pure def preErrorPropagation(ctx: Context, o: ErrorPropagation): PreResult[Context, ErrorPropagation] = {
      return PreResult(ctx, T, None())
    }

    @pure def preSmfAnnex(ctx: Context, o: SmfAnnex): PreResult[Context, SmfAnnex] = {
      o match {
        case o: SmfClause =>
          val r: PreResult[Context, SmfAnnex] = preSmfClause(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: SmfAnnex)) => PreResult(preCtx, continu, Some[SmfAnnex](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type SmfAnnex")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[SmfAnnex]())
          }
          return r
        case o: SmfClassification =>
          val r: PreResult[Context, SmfAnnex] = preSmfClassification(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: SmfAnnex)) => PreResult(preCtx, continu, Some[SmfAnnex](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type SmfAnnex")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[SmfAnnex]())
          }
          return r
        case o: SmfDeclass =>
          val r: PreResult[Context, SmfAnnex] = preSmfDeclass(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: SmfAnnex)) => PreResult(preCtx, continu, Some[SmfAnnex](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type SmfAnnex")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[SmfAnnex]())
          }
          return r
        case o: SmfType =>
          val r: PreResult[Context, SmfAnnex] = preSmfType(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: SmfAnnex)) => PreResult(preCtx, continu, Some[SmfAnnex](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type SmfAnnex")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[SmfAnnex]())
          }
          return r
      }
    }

    @pure def preSmfLib(ctx: Context, o: SmfLib): PreResult[Context, SmfLib] = {
      o match {
        case o: SmfLibrary =>
          val r: PreResult[Context, SmfLib] = preSmfLibrary(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: SmfLib)) => PreResult(preCtx, continu, Some[SmfLib](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type SmfLib")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[SmfLib]())
          }
          return r
      }
    }

    @pure def preSmfClause(ctx: Context, o: SmfClause): PreResult[Context, SmfClause] = {
      return PreResult(ctx, T, None())
    }

    @pure def preSmfClassification(ctx: Context, o: SmfClassification): PreResult[Context, SmfClassification] = {
      return PreResult(ctx, T, None())
    }

    @pure def preSmfDeclass(ctx: Context, o: SmfDeclass): PreResult[Context, SmfDeclass] = {
      return PreResult(ctx, T, None())
    }

    @pure def preSmfLibrary(ctx: Context, o: SmfLibrary): PreResult[Context, SmfLibrary] = {
      return PreResult(ctx, T, None())
    }

    @pure def preSmfType(ctx: Context, o: SmfType): PreResult[Context, SmfType] = {
      return PreResult(ctx, T, None())
    }

    @pure def preOtherAnnex(ctx: Context, o: OtherAnnex): PreResult[Context, OtherAnnex] = {
      return PreResult(ctx, T, None())
    }

    @pure def postAadlInstInfo(ctx: Context, o: AadlInstInfo): TPostResult[Context, AadlInstInfo] = {
      o match {
        case o: Component =>
          val r: TPostResult[Context, AadlInstInfo] = postComponent(ctx, o) match {
           case TPostResult(postCtx, Some(result: AadlInstInfo)) => TPostResult(postCtx, Some[AadlInstInfo](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AadlInstInfo")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AadlInstInfo]())
          }
          return r
        case o: FeatureEnd =>
          val r: TPostResult[Context, AadlInstInfo] = postFeatureEnd(ctx, o) match {
           case TPostResult(postCtx, Some(result: AadlInstInfo)) => TPostResult(postCtx, Some[AadlInstInfo](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AadlInstInfo")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AadlInstInfo]())
          }
          return r
        case o: FeatureGroup =>
          val r: TPostResult[Context, AadlInstInfo] = postFeatureGroup(ctx, o) match {
           case TPostResult(postCtx, Some(result: AadlInstInfo)) => TPostResult(postCtx, Some[AadlInstInfo](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AadlInstInfo")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AadlInstInfo]())
          }
          return r
        case o: FeatureAccess =>
          val r: TPostResult[Context, AadlInstInfo] = postFeatureAccess(ctx, o) match {
           case TPostResult(postCtx, Some(result: AadlInstInfo)) => TPostResult(postCtx, Some[AadlInstInfo](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AadlInstInfo")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AadlInstInfo]())
          }
          return r
        case o: Connection =>
          val r: TPostResult[Context, AadlInstInfo] = postConnection(ctx, o) match {
           case TPostResult(postCtx, Some(result: AadlInstInfo)) => TPostResult(postCtx, Some[AadlInstInfo](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AadlInstInfo")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AadlInstInfo]())
          }
          return r
        case o: Flow =>
          val r: TPostResult[Context, AadlInstInfo] = postFlow(ctx, o) match {
           case TPostResult(postCtx, Some(result: AadlInstInfo)) => TPostResult(postCtx, Some[AadlInstInfo](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AadlInstInfo")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AadlInstInfo]())
          }
          return r
        case o: Emv2Flow =>
          val r: TPostResult[Context, AadlInstInfo] = postEmv2Flow(ctx, o) match {
           case TPostResult(postCtx, Some(result: AadlInstInfo)) => TPostResult(postCtx, Some[AadlInstInfo](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AadlInstInfo")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AadlInstInfo]())
          }
          return r
      }
    }

    @pure def postAadl(ctx: Context, o: Aadl): TPostResult[Context, Aadl] = {
      return TPostResult(ctx, None())
    }

    @pure def postName(ctx: Context, o: Name): TPostResult[Context, Name] = {
      return TPostResult(ctx, None())
    }

    @pure def postComponent(ctx: Context, o: Component): TPostResult[Context, Component] = {
      return TPostResult(ctx, None())
    }

    @pure def postClassifier(ctx: Context, o: Classifier): TPostResult[Context, Classifier] = {
      return TPostResult(ctx, None())
    }

    @pure def postFeature(ctx: Context, o: Feature): TPostResult[Context, Feature] = {
      o match {
        case o: FeatureEnd =>
          val r: TPostResult[Context, Feature] = postFeatureEnd(ctx, o) match {
           case TPostResult(postCtx, Some(result: Feature)) => TPostResult(postCtx, Some[Feature](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type Feature")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[Feature]())
          }
          return r
        case o: FeatureGroup =>
          val r: TPostResult[Context, Feature] = postFeatureGroup(ctx, o) match {
           case TPostResult(postCtx, Some(result: Feature)) => TPostResult(postCtx, Some[Feature](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type Feature")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[Feature]())
          }
          return r
        case o: FeatureAccess =>
          val r: TPostResult[Context, Feature] = postFeatureAccess(ctx, o) match {
           case TPostResult(postCtx, Some(result: Feature)) => TPostResult(postCtx, Some[Feature](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type Feature")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[Feature]())
          }
          return r
      }
    }

    @pure def postFeatureEnd(ctx: Context, o: FeatureEnd): TPostResult[Context, FeatureEnd] = {
      return TPostResult(ctx, None())
    }

    @pure def postFeatureGroup(ctx: Context, o: FeatureGroup): TPostResult[Context, FeatureGroup] = {
      return TPostResult(ctx, None())
    }

    @pure def postFeatureAccess(ctx: Context, o: FeatureAccess): TPostResult[Context, FeatureAccess] = {
      return TPostResult(ctx, None())
    }

    @pure def postConnection(ctx: Context, o: Connection): TPostResult[Context, Connection] = {
      return TPostResult(ctx, None())
    }

    @pure def postConnectionInstance(ctx: Context, o: ConnectionInstance): TPostResult[Context, ConnectionInstance] = {
      return TPostResult(ctx, None())
    }

    @pure def postConnectionReference(ctx: Context, o: ConnectionReference): TPostResult[Context, ConnectionReference] = {
      return TPostResult(ctx, None())
    }

    @pure def postEndPoint(ctx: Context, o: EndPoint): TPostResult[Context, EndPoint] = {
      return TPostResult(ctx, None())
    }

    @pure def postProperty(ctx: Context, o: Property): TPostResult[Context, Property] = {
      return TPostResult(ctx, None())
    }

    @pure def postElementRef(ctx: Context, o: ElementRef): TPostResult[Context, ElementRef] = {
      o match {
        case o: AadlElementRef =>
          val r: TPostResult[Context, ElementRef] = postAadlElementRef(ctx, o) match {
           case TPostResult(postCtx, Some(result: ElementRef)) => TPostResult(postCtx, Some[ElementRef](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type ElementRef")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[ElementRef]())
          }
          return r
        case o: Emv2ElementRef =>
          val r: TPostResult[Context, ElementRef] = postEmv2ElementRef(ctx, o) match {
           case TPostResult(postCtx, Some(result: ElementRef)) => TPostResult(postCtx, Some[ElementRef](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type ElementRef")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[ElementRef]())
          }
          return r
      }
    }

    @pure def postAadlElementRef(ctx: Context, o: AadlElementRef): TPostResult[Context, AadlElementRef] = {
      return TPostResult(ctx, None())
    }

    @pure def postPropertyValue(ctx: Context, o: PropertyValue): TPostResult[Context, PropertyValue] = {
      o match {
        case o: ClassifierProp => return postClassifierProp(ctx, o)
        case o: RangeProp => return postRangeProp(ctx, o)
        case o: RecordProp => return postRecordProp(ctx, o)
        case o: ReferenceProp => return postReferenceProp(ctx, o)
        case o: UnitProp => return postUnitProp(ctx, o)
        case o: ValueProp => return postValueProp(ctx, o)
      }
    }

    @pure def postClassifierProp(ctx: Context, o: ClassifierProp): TPostResult[Context, PropertyValue] = {
      return TPostResult(ctx, None())
    }

    @pure def postRangeProp(ctx: Context, o: RangeProp): TPostResult[Context, PropertyValue] = {
      return TPostResult(ctx, None())
    }

    @pure def postRecordProp(ctx: Context, o: RecordProp): TPostResult[Context, PropertyValue] = {
      return TPostResult(ctx, None())
    }

    @pure def postReferenceProp(ctx: Context, o: ReferenceProp): TPostResult[Context, PropertyValue] = {
      return TPostResult(ctx, None())
    }

    @pure def postUnitProp(ctx: Context, o: UnitProp): TPostResult[Context, PropertyValue] = {
      return TPostResult(ctx, None())
    }

    @pure def postValueProp(ctx: Context, o: ValueProp): TPostResult[Context, PropertyValue] = {
      return TPostResult(ctx, None())
    }

    @pure def postMode(ctx: Context, o: Mode): TPostResult[Context, Mode] = {
      return TPostResult(ctx, None())
    }

    @pure def postFlow(ctx: Context, o: Flow): TPostResult[Context, Flow] = {
      return TPostResult(ctx, None())
    }

    @pure def postAnnex(ctx: Context, o: Annex): TPostResult[Context, Annex] = {
      return TPostResult(ctx, None())
    }

    @pure def postAnnexClause(ctx: Context, o: AnnexClause): TPostResult[Context, AnnexClause] = {
      o match {
        case o: ErrorTypeDef =>
          val r: TPostResult[Context, AnnexClause] = postErrorTypeDef(ctx, o) match {
           case TPostResult(postCtx, Some(result: AnnexClause)) => TPostResult(postCtx, Some[AnnexClause](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AnnexClause")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AnnexClause]())
          }
          return r
        case o: ErrorAliasDef =>
          val r: TPostResult[Context, AnnexClause] = postErrorAliasDef(ctx, o) match {
           case TPostResult(postCtx, Some(result: AnnexClause)) => TPostResult(postCtx, Some[AnnexClause](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AnnexClause")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AnnexClause]())
          }
          return r
        case o: ErrorTypeSetDef =>
          val r: TPostResult[Context, AnnexClause] = postErrorTypeSetDef(ctx, o) match {
           case TPostResult(postCtx, Some(result: AnnexClause)) => TPostResult(postCtx, Some[AnnexClause](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AnnexClause")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AnnexClause]())
          }
          return r
        case o: BehaveStateMachine =>
          val r: TPostResult[Context, AnnexClause] = postBehaveStateMachine(ctx, o) match {
           case TPostResult(postCtx, Some(result: AnnexClause)) => TPostResult(postCtx, Some[AnnexClause](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AnnexClause")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AnnexClause]())
          }
          return r
        case o: ErrorEvent =>
          val r: TPostResult[Context, AnnexClause] = postErrorEvent(ctx, o) match {
           case TPostResult(postCtx, Some(result: AnnexClause)) => TPostResult(postCtx, Some[AnnexClause](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AnnexClause")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AnnexClause]())
          }
          return r
        case o: ErrorState =>
          val r: TPostResult[Context, AnnexClause] = postErrorState(ctx, o) match {
           case TPostResult(postCtx, Some(result: AnnexClause)) => TPostResult(postCtx, Some[AnnexClause](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AnnexClause")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AnnexClause]())
          }
          return r
        case o: ErrorTransition =>
          val r: TPostResult[Context, AnnexClause] = postErrorTransition(ctx, o) match {
           case TPostResult(postCtx, Some(result: AnnexClause)) => TPostResult(postCtx, Some[AnnexClause](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AnnexClause")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AnnexClause]())
          }
          return r
        case o: ConditionTrigger =>
          val r: TPostResult[Context, AnnexClause] = postConditionTrigger(ctx, o) match {
           case TPostResult(postCtx, Some(result: AnnexClause)) => TPostResult(postCtx, Some[AnnexClause](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AnnexClause")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AnnexClause]())
          }
          return r
        case o: AndCondition =>
          val r: TPostResult[Context, AnnexClause] = postAndCondition(ctx, o) match {
           case TPostResult(postCtx, Some(result: AnnexClause)) => TPostResult(postCtx, Some[AnnexClause](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AnnexClause")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AnnexClause]())
          }
          return r
        case o: OrCondition =>
          val r: TPostResult[Context, AnnexClause] = postOrCondition(ctx, o) match {
           case TPostResult(postCtx, Some(result: AnnexClause)) => TPostResult(postCtx, Some[AnnexClause](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AnnexClause")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AnnexClause]())
          }
          return r
        case o: AllCondition =>
          val r: TPostResult[Context, AnnexClause] = postAllCondition(ctx, o) match {
           case TPostResult(postCtx, Some(result: AnnexClause)) => TPostResult(postCtx, Some[AnnexClause](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AnnexClause")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AnnexClause]())
          }
          return r
        case o: OrMoreCondition =>
          val r: TPostResult[Context, AnnexClause] = postOrMoreCondition(ctx, o) match {
           case TPostResult(postCtx, Some(result: AnnexClause)) => TPostResult(postCtx, Some[AnnexClause](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AnnexClause")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AnnexClause]())
          }
          return r
        case o: OrLessCondition =>
          val r: TPostResult[Context, AnnexClause] = postOrLessCondition(ctx, o) match {
           case TPostResult(postCtx, Some(result: AnnexClause)) => TPostResult(postCtx, Some[AnnexClause](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AnnexClause")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AnnexClause]())
          }
          return r
        case o: Emv2Clause =>
          val r: TPostResult[Context, AnnexClause] = postEmv2Clause(ctx, o) match {
           case TPostResult(postCtx, Some(result: AnnexClause)) => TPostResult(postCtx, Some[AnnexClause](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AnnexClause")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AnnexClause]())
          }
          return r
        case o: Emv2Propagation =>
          val r: TPostResult[Context, AnnexClause] = postEmv2Propagation(ctx, o) match {
           case TPostResult(postCtx, Some(result: AnnexClause)) => TPostResult(postCtx, Some[AnnexClause](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AnnexClause")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AnnexClause]())
          }
          return r
        case o: Emv2Flow =>
          val r: TPostResult[Context, AnnexClause] = postEmv2Flow(ctx, o) match {
           case TPostResult(postCtx, Some(result: AnnexClause)) => TPostResult(postCtx, Some[AnnexClause](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AnnexClause")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AnnexClause]())
          }
          return r
        case o: Emv2BehaviorSection =>
          val r: TPostResult[Context, AnnexClause] = postEmv2BehaviorSection(ctx, o) match {
           case TPostResult(postCtx, Some(result: AnnexClause)) => TPostResult(postCtx, Some[AnnexClause](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AnnexClause")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AnnexClause]())
          }
          return r
        case o: ErrorPropagation =>
          val r: TPostResult[Context, AnnexClause] = postErrorPropagation(ctx, o) match {
           case TPostResult(postCtx, Some(result: AnnexClause)) => TPostResult(postCtx, Some[AnnexClause](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AnnexClause")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AnnexClause]())
          }
          return r
        case o: SmfClause =>
          val r: TPostResult[Context, AnnexClause] = postSmfClause(ctx, o) match {
           case TPostResult(postCtx, Some(result: AnnexClause)) => TPostResult(postCtx, Some[AnnexClause](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AnnexClause")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AnnexClause]())
          }
          return r
        case o: SmfClassification =>
          val r: TPostResult[Context, AnnexClause] = postSmfClassification(ctx, o) match {
           case TPostResult(postCtx, Some(result: AnnexClause)) => TPostResult(postCtx, Some[AnnexClause](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AnnexClause")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AnnexClause]())
          }
          return r
        case o: SmfDeclass =>
          val r: TPostResult[Context, AnnexClause] = postSmfDeclass(ctx, o) match {
           case TPostResult(postCtx, Some(result: AnnexClause)) => TPostResult(postCtx, Some[AnnexClause](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AnnexClause")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AnnexClause]())
          }
          return r
        case o: SmfType =>
          val r: TPostResult[Context, AnnexClause] = postSmfType(ctx, o) match {
           case TPostResult(postCtx, Some(result: AnnexClause)) => TPostResult(postCtx, Some[AnnexClause](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AnnexClause")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AnnexClause]())
          }
          return r
        case o: OtherAnnex =>
          val r: TPostResult[Context, AnnexClause] = postOtherAnnex(ctx, o) match {
           case TPostResult(postCtx, Some(result: AnnexClause)) => TPostResult(postCtx, Some[AnnexClause](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AnnexClause")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AnnexClause]())
          }
          return r
      }
    }

    @pure def postAnnexLib(ctx: Context, o: AnnexLib): TPostResult[Context, AnnexLib] = {
      o match {
        case o: Emv2Library =>
          val r: TPostResult[Context, AnnexLib] = postEmv2Library(ctx, o) match {
           case TPostResult(postCtx, Some(result: AnnexLib)) => TPostResult(postCtx, Some[AnnexLib](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AnnexLib")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AnnexLib]())
          }
          return r
        case o: SmfLibrary =>
          val r: TPostResult[Context, AnnexLib] = postSmfLibrary(ctx, o) match {
           case TPostResult(postCtx, Some(result: AnnexLib)) => TPostResult(postCtx, Some[AnnexLib](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AnnexLib")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AnnexLib]())
          }
          return r
      }
    }

    @pure def postEmv2Annex(ctx: Context, o: Emv2Annex): TPostResult[Context, Emv2Annex] = {
      o match {
        case o: ErrorTypeDef =>
          val r: TPostResult[Context, Emv2Annex] = postErrorTypeDef(ctx, o) match {
           case TPostResult(postCtx, Some(result: Emv2Annex)) => TPostResult(postCtx, Some[Emv2Annex](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type Emv2Annex")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[Emv2Annex]())
          }
          return r
        case o: ErrorAliasDef =>
          val r: TPostResult[Context, Emv2Annex] = postErrorAliasDef(ctx, o) match {
           case TPostResult(postCtx, Some(result: Emv2Annex)) => TPostResult(postCtx, Some[Emv2Annex](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type Emv2Annex")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[Emv2Annex]())
          }
          return r
        case o: ErrorTypeSetDef =>
          val r: TPostResult[Context, Emv2Annex] = postErrorTypeSetDef(ctx, o) match {
           case TPostResult(postCtx, Some(result: Emv2Annex)) => TPostResult(postCtx, Some[Emv2Annex](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type Emv2Annex")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[Emv2Annex]())
          }
          return r
        case o: BehaveStateMachine =>
          val r: TPostResult[Context, Emv2Annex] = postBehaveStateMachine(ctx, o) match {
           case TPostResult(postCtx, Some(result: Emv2Annex)) => TPostResult(postCtx, Some[Emv2Annex](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type Emv2Annex")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[Emv2Annex]())
          }
          return r
        case o: ErrorEvent =>
          val r: TPostResult[Context, Emv2Annex] = postErrorEvent(ctx, o) match {
           case TPostResult(postCtx, Some(result: Emv2Annex)) => TPostResult(postCtx, Some[Emv2Annex](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type Emv2Annex")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[Emv2Annex]())
          }
          return r
        case o: ErrorState =>
          val r: TPostResult[Context, Emv2Annex] = postErrorState(ctx, o) match {
           case TPostResult(postCtx, Some(result: Emv2Annex)) => TPostResult(postCtx, Some[Emv2Annex](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type Emv2Annex")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[Emv2Annex]())
          }
          return r
        case o: ErrorTransition =>
          val r: TPostResult[Context, Emv2Annex] = postErrorTransition(ctx, o) match {
           case TPostResult(postCtx, Some(result: Emv2Annex)) => TPostResult(postCtx, Some[Emv2Annex](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type Emv2Annex")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[Emv2Annex]())
          }
          return r
        case o: ConditionTrigger =>
          val r: TPostResult[Context, Emv2Annex] = postConditionTrigger(ctx, o) match {
           case TPostResult(postCtx, Some(result: Emv2Annex)) => TPostResult(postCtx, Some[Emv2Annex](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type Emv2Annex")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[Emv2Annex]())
          }
          return r
        case o: AndCondition =>
          val r: TPostResult[Context, Emv2Annex] = postAndCondition(ctx, o) match {
           case TPostResult(postCtx, Some(result: Emv2Annex)) => TPostResult(postCtx, Some[Emv2Annex](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type Emv2Annex")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[Emv2Annex]())
          }
          return r
        case o: OrCondition =>
          val r: TPostResult[Context, Emv2Annex] = postOrCondition(ctx, o) match {
           case TPostResult(postCtx, Some(result: Emv2Annex)) => TPostResult(postCtx, Some[Emv2Annex](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type Emv2Annex")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[Emv2Annex]())
          }
          return r
        case o: AllCondition =>
          val r: TPostResult[Context, Emv2Annex] = postAllCondition(ctx, o) match {
           case TPostResult(postCtx, Some(result: Emv2Annex)) => TPostResult(postCtx, Some[Emv2Annex](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type Emv2Annex")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[Emv2Annex]())
          }
          return r
        case o: OrMoreCondition =>
          val r: TPostResult[Context, Emv2Annex] = postOrMoreCondition(ctx, o) match {
           case TPostResult(postCtx, Some(result: Emv2Annex)) => TPostResult(postCtx, Some[Emv2Annex](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type Emv2Annex")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[Emv2Annex]())
          }
          return r
        case o: OrLessCondition =>
          val r: TPostResult[Context, Emv2Annex] = postOrLessCondition(ctx, o) match {
           case TPostResult(postCtx, Some(result: Emv2Annex)) => TPostResult(postCtx, Some[Emv2Annex](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type Emv2Annex")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[Emv2Annex]())
          }
          return r
        case o: Emv2Clause =>
          val r: TPostResult[Context, Emv2Annex] = postEmv2Clause(ctx, o) match {
           case TPostResult(postCtx, Some(result: Emv2Annex)) => TPostResult(postCtx, Some[Emv2Annex](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type Emv2Annex")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[Emv2Annex]())
          }
          return r
        case o: Emv2Propagation =>
          val r: TPostResult[Context, Emv2Annex] = postEmv2Propagation(ctx, o) match {
           case TPostResult(postCtx, Some(result: Emv2Annex)) => TPostResult(postCtx, Some[Emv2Annex](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type Emv2Annex")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[Emv2Annex]())
          }
          return r
        case o: Emv2Flow =>
          val r: TPostResult[Context, Emv2Annex] = postEmv2Flow(ctx, o) match {
           case TPostResult(postCtx, Some(result: Emv2Annex)) => TPostResult(postCtx, Some[Emv2Annex](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type Emv2Annex")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[Emv2Annex]())
          }
          return r
        case o: Emv2BehaviorSection =>
          val r: TPostResult[Context, Emv2Annex] = postEmv2BehaviorSection(ctx, o) match {
           case TPostResult(postCtx, Some(result: Emv2Annex)) => TPostResult(postCtx, Some[Emv2Annex](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type Emv2Annex")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[Emv2Annex]())
          }
          return r
        case o: ErrorPropagation =>
          val r: TPostResult[Context, Emv2Annex] = postErrorPropagation(ctx, o) match {
           case TPostResult(postCtx, Some(result: Emv2Annex)) => TPostResult(postCtx, Some[Emv2Annex](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type Emv2Annex")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[Emv2Annex]())
          }
          return r
      }
    }

    @pure def postEmv2Lib(ctx: Context, o: Emv2Lib): TPostResult[Context, Emv2Lib] = {
      o match {
        case o: Emv2Library =>
          val r: TPostResult[Context, Emv2Lib] = postEmv2Library(ctx, o) match {
           case TPostResult(postCtx, Some(result: Emv2Lib)) => TPostResult(postCtx, Some[Emv2Lib](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type Emv2Lib")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[Emv2Lib]())
          }
          return r
      }
    }

    @pure def postEmv2ElementRef(ctx: Context, o: Emv2ElementRef): TPostResult[Context, Emv2ElementRef] = {
      return TPostResult(ctx, None())
    }

    @pure def postEmv2Library(ctx: Context, o: Emv2Library): TPostResult[Context, Emv2Library] = {
      return TPostResult(ctx, None())
    }

    @pure def postErrorTypeDef(ctx: Context, o: ErrorTypeDef): TPostResult[Context, ErrorTypeDef] = {
      return TPostResult(ctx, None())
    }

    @pure def postErrorAliasDef(ctx: Context, o: ErrorAliasDef): TPostResult[Context, ErrorAliasDef] = {
      return TPostResult(ctx, None())
    }

    @pure def postErrorTypeSetDef(ctx: Context, o: ErrorTypeSetDef): TPostResult[Context, ErrorTypeSetDef] = {
      return TPostResult(ctx, None())
    }

    @pure def postBehaveStateMachine(ctx: Context, o: BehaveStateMachine): TPostResult[Context, BehaveStateMachine] = {
      return TPostResult(ctx, None())
    }

    @pure def postErrorEvent(ctx: Context, o: ErrorEvent): TPostResult[Context, ErrorEvent] = {
      return TPostResult(ctx, None())
    }

    @pure def postErrorState(ctx: Context, o: ErrorState): TPostResult[Context, ErrorState] = {
      return TPostResult(ctx, None())
    }

    @pure def postErrorTransition(ctx: Context, o: ErrorTransition): TPostResult[Context, ErrorTransition] = {
      return TPostResult(ctx, None())
    }

    @pure def postErrorCondition(ctx: Context, o: ErrorCondition): TPostResult[Context, ErrorCondition] = {
      o match {
        case o: ConditionTrigger =>
          val r: TPostResult[Context, ErrorCondition] = postConditionTrigger(ctx, o) match {
           case TPostResult(postCtx, Some(result: ErrorCondition)) => TPostResult(postCtx, Some[ErrorCondition](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type ErrorCondition")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[ErrorCondition]())
          }
          return r
        case o: AndCondition =>
          val r: TPostResult[Context, ErrorCondition] = postAndCondition(ctx, o) match {
           case TPostResult(postCtx, Some(result: ErrorCondition)) => TPostResult(postCtx, Some[ErrorCondition](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type ErrorCondition")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[ErrorCondition]())
          }
          return r
        case o: OrCondition =>
          val r: TPostResult[Context, ErrorCondition] = postOrCondition(ctx, o) match {
           case TPostResult(postCtx, Some(result: ErrorCondition)) => TPostResult(postCtx, Some[ErrorCondition](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type ErrorCondition")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[ErrorCondition]())
          }
          return r
        case o: AllCondition =>
          val r: TPostResult[Context, ErrorCondition] = postAllCondition(ctx, o) match {
           case TPostResult(postCtx, Some(result: ErrorCondition)) => TPostResult(postCtx, Some[ErrorCondition](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type ErrorCondition")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[ErrorCondition]())
          }
          return r
        case o: OrMoreCondition =>
          val r: TPostResult[Context, ErrorCondition] = postOrMoreCondition(ctx, o) match {
           case TPostResult(postCtx, Some(result: ErrorCondition)) => TPostResult(postCtx, Some[ErrorCondition](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type ErrorCondition")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[ErrorCondition]())
          }
          return r
        case o: OrLessCondition =>
          val r: TPostResult[Context, ErrorCondition] = postOrLessCondition(ctx, o) match {
           case TPostResult(postCtx, Some(result: ErrorCondition)) => TPostResult(postCtx, Some[ErrorCondition](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type ErrorCondition")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[ErrorCondition]())
          }
          return r
      }
    }

    @pure def postConditionTrigger(ctx: Context, o: ConditionTrigger): TPostResult[Context, ConditionTrigger] = {
      return TPostResult(ctx, None())
    }

    @pure def postAndCondition(ctx: Context, o: AndCondition): TPostResult[Context, AndCondition] = {
      return TPostResult(ctx, None())
    }

    @pure def postOrCondition(ctx: Context, o: OrCondition): TPostResult[Context, OrCondition] = {
      return TPostResult(ctx, None())
    }

    @pure def postAllCondition(ctx: Context, o: AllCondition): TPostResult[Context, AllCondition] = {
      return TPostResult(ctx, None())
    }

    @pure def postOrMoreCondition(ctx: Context, o: OrMoreCondition): TPostResult[Context, OrMoreCondition] = {
      return TPostResult(ctx, None())
    }

    @pure def postOrLessCondition(ctx: Context, o: OrLessCondition): TPostResult[Context, OrLessCondition] = {
      return TPostResult(ctx, None())
    }

    @pure def postEmv2Clause(ctx: Context, o: Emv2Clause): TPostResult[Context, Emv2Clause] = {
      return TPostResult(ctx, None())
    }

    @pure def postEmv2Propagation(ctx: Context, o: Emv2Propagation): TPostResult[Context, Emv2Propagation] = {
      return TPostResult(ctx, None())
    }

    @pure def postEmv2Flow(ctx: Context, o: Emv2Flow): TPostResult[Context, Emv2Flow] = {
      return TPostResult(ctx, None())
    }

    @pure def postEmv2BehaviorSection(ctx: Context, o: Emv2BehaviorSection): TPostResult[Context, Emv2BehaviorSection] = {
      return TPostResult(ctx, None())
    }

    @pure def postErrorPropagation(ctx: Context, o: ErrorPropagation): TPostResult[Context, ErrorPropagation] = {
      return TPostResult(ctx, None())
    }

    @pure def postSmfAnnex(ctx: Context, o: SmfAnnex): TPostResult[Context, SmfAnnex] = {
      o match {
        case o: SmfClause =>
          val r: TPostResult[Context, SmfAnnex] = postSmfClause(ctx, o) match {
           case TPostResult(postCtx, Some(result: SmfAnnex)) => TPostResult(postCtx, Some[SmfAnnex](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type SmfAnnex")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[SmfAnnex]())
          }
          return r
        case o: SmfClassification =>
          val r: TPostResult[Context, SmfAnnex] = postSmfClassification(ctx, o) match {
           case TPostResult(postCtx, Some(result: SmfAnnex)) => TPostResult(postCtx, Some[SmfAnnex](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type SmfAnnex")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[SmfAnnex]())
          }
          return r
        case o: SmfDeclass =>
          val r: TPostResult[Context, SmfAnnex] = postSmfDeclass(ctx, o) match {
           case TPostResult(postCtx, Some(result: SmfAnnex)) => TPostResult(postCtx, Some[SmfAnnex](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type SmfAnnex")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[SmfAnnex]())
          }
          return r
        case o: SmfType =>
          val r: TPostResult[Context, SmfAnnex] = postSmfType(ctx, o) match {
           case TPostResult(postCtx, Some(result: SmfAnnex)) => TPostResult(postCtx, Some[SmfAnnex](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type SmfAnnex")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[SmfAnnex]())
          }
          return r
      }
    }

    @pure def postSmfLib(ctx: Context, o: SmfLib): TPostResult[Context, SmfLib] = {
      o match {
        case o: SmfLibrary =>
          val r: TPostResult[Context, SmfLib] = postSmfLibrary(ctx, o) match {
           case TPostResult(postCtx, Some(result: SmfLib)) => TPostResult(postCtx, Some[SmfLib](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type SmfLib")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[SmfLib]())
          }
          return r
      }
    }

    @pure def postSmfClause(ctx: Context, o: SmfClause): TPostResult[Context, SmfClause] = {
      return TPostResult(ctx, None())
    }

    @pure def postSmfClassification(ctx: Context, o: SmfClassification): TPostResult[Context, SmfClassification] = {
      return TPostResult(ctx, None())
    }

    @pure def postSmfDeclass(ctx: Context, o: SmfDeclass): TPostResult[Context, SmfDeclass] = {
      return TPostResult(ctx, None())
    }

    @pure def postSmfLibrary(ctx: Context, o: SmfLibrary): TPostResult[Context, SmfLibrary] = {
      return TPostResult(ctx, None())
    }

    @pure def postSmfType(ctx: Context, o: SmfType): TPostResult[Context, SmfType] = {
      return TPostResult(ctx, None())
    }

    @pure def postOtherAnnex(ctx: Context, o: OtherAnnex): TPostResult[Context, OtherAnnex] = {
      return TPostResult(ctx, None())
    }

  }

  @pure def transformOption[Context, T](ctx: Context, option: Option[T], f: (Context, T) => TPostResult[Context, T] @pure): TPostResult[Context, Option[T]] = {
    option match {
      case Some(v) =>
        val r = f(ctx, v)
        r.resultOpt match {
          case Some(_) => return TPostResult(r.ctx, Some(r.resultOpt))
          case _ => return TPostResult[Context, Option[T]](r.ctx, None[Option[T]]())
        }
      case _ => return TPostResult[Context, Option[T]](ctx, None[Option[T]]())
    }
  }

  @pure def transformISZ[Context, T](ctx: Context, s: IS[Z, T], f: (Context, T) => TPostResult[Context, T] @pure): TPostResult[Context, IS[Z, T]] = {
    val s2: MS[Z, T] = s.toMS
    var changed: B = F
    var ctxi = ctx
    for (i <- s2.indices) {
      val e: T = s(i)
      val r: TPostResult[Context, T] = f(ctxi, e)
      ctxi = r.ctx
      changed = changed || r.resultOpt.nonEmpty
      s2(i) = r.resultOpt.getOrElse(e)
    }
    if (changed) {
      return TPostResult(ctxi, Some(s2.toIS))
    } else {
      return TPostResult[Context, IS[Z, T]](ctxi, None[IS[Z, T]]())
    }
  }

}

import Transformer._

@datatype class Transformer[Context](pp: PrePost[Context]) {

  @pure def transformAadlInstInfo(ctx: Context, o: AadlInstInfo): TPostResult[Context, AadlInstInfo] = {
    val preR: PreResult[Context, AadlInstInfo] = pp.preAadlInstInfo(ctx, o)
    val r: TPostResult[Context, AadlInstInfo] = if (preR.continu) {
      val o2: AadlInstInfo = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, AadlInstInfo] = o2 match {
        case o2: Component =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.identifier)
          val r1: TPostResult[Context, Option[Classifier]] = transformOption(r0.ctx, o2.classifier, transformClassifier _)
          val r2: TPostResult[Context, IS[Z, Feature]] = transformISZ(r1.ctx, o2.features, transformFeature _)
          val r3: TPostResult[Context, IS[Z, Component]] = transformISZ(r2.ctx, o2.subComponents, transformComponent _)
          val r4: TPostResult[Context, IS[Z, Connection]] = transformISZ(r3.ctx, o2.connections, transformConnection _)
          val r5: TPostResult[Context, IS[Z, ConnectionInstance]] = transformISZ(r4.ctx, o2.connectionInstances, transformConnectionInstance _)
          val r6: TPostResult[Context, IS[Z, Property]] = transformISZ(r5.ctx, o2.properties, transformProperty _)
          val r7: TPostResult[Context, IS[Z, Flow]] = transformISZ(r6.ctx, o2.flows, transformFlow _)
          val r8: TPostResult[Context, IS[Z, Mode]] = transformISZ(r7.ctx, o2.modes, transformMode _)
          val r9: TPostResult[Context, IS[Z, Annex]] = transformISZ(r8.ctx, o2.annexes, transformAnnex _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty || r5.resultOpt.nonEmpty || r6.resultOpt.nonEmpty || r7.resultOpt.nonEmpty || r8.resultOpt.nonEmpty || r9.resultOpt.nonEmpty)
            TPostResult(r9.ctx, Some(o2(identifier = r0.resultOpt.getOrElse(o2.identifier), classifier = r1.resultOpt.getOrElse(o2.classifier), features = r2.resultOpt.getOrElse(o2.features), subComponents = r3.resultOpt.getOrElse(o2.subComponents), connections = r4.resultOpt.getOrElse(o2.connections), connectionInstances = r5.resultOpt.getOrElse(o2.connectionInstances), properties = r6.resultOpt.getOrElse(o2.properties), flows = r7.resultOpt.getOrElse(o2.flows), modes = r8.resultOpt.getOrElse(o2.modes), annexes = r9.resultOpt.getOrElse(o2.annexes))))
          else
            TPostResult(r9.ctx, None())
        case o2: FeatureEnd =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.identifier)
          val r1: TPostResult[Context, Option[Classifier]] = transformOption(r0.ctx, o2.classifier, transformClassifier _)
          val r2: TPostResult[Context, IS[Z, Property]] = transformISZ(r1.ctx, o2.properties, transformProperty _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(identifier = r0.resultOpt.getOrElse(o2.identifier), classifier = r1.resultOpt.getOrElse(o2.classifier), properties = r2.resultOpt.getOrElse(o2.properties))))
          else
            TPostResult(r2.ctx, None())
        case o2: FeatureGroup =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.identifier)
          val r1: TPostResult[Context, IS[Z, Feature]] = transformISZ(r0.ctx, o2.features, transformFeature _)
          val r2: TPostResult[Context, IS[Z, Property]] = transformISZ(r1.ctx, o2.properties, transformProperty _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(identifier = r0.resultOpt.getOrElse(o2.identifier), features = r1.resultOpt.getOrElse(o2.features), properties = r2.resultOpt.getOrElse(o2.properties))))
          else
            TPostResult(r2.ctx, None())
        case o2: FeatureAccess =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.identifier)
          val r1: TPostResult[Context, Option[Classifier]] = transformOption(r0.ctx, o2.classifier, transformClassifier _)
          val r2: TPostResult[Context, IS[Z, Property]] = transformISZ(r1.ctx, o2.properties, transformProperty _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(identifier = r0.resultOpt.getOrElse(o2.identifier), classifier = r1.resultOpt.getOrElse(o2.classifier), properties = r2.resultOpt.getOrElse(o2.properties))))
          else
            TPostResult(r2.ctx, None())
        case o2: Connection =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
          val r1: TPostResult[Context, IS[Z, EndPoint]] = transformISZ(r0.ctx, o2.src, transformEndPoint _)
          val r2: TPostResult[Context, IS[Z, EndPoint]] = transformISZ(r1.ctx, o2.dst, transformEndPoint _)
          val r3: TPostResult[Context, IS[Z, Name]] = transformISZ(r2.ctx, o2.connectionInstances, transformName _)
          val r4: TPostResult[Context, IS[Z, Property]] = transformISZ(r3.ctx, o2.properties, transformProperty _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
            TPostResult(r4.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), src = r1.resultOpt.getOrElse(o2.src), dst = r2.resultOpt.getOrElse(o2.dst), connectionInstances = r3.resultOpt.getOrElse(o2.connectionInstances), properties = r4.resultOpt.getOrElse(o2.properties))))
          else
            TPostResult(r4.ctx, None())
        case o2: Flow =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
          val r1: TPostResult[Context, Option[Name]] = transformOption(r0.ctx, o2.source, transformName _)
          val r2: TPostResult[Context, Option[Name]] = transformOption(r1.ctx, o2.sink, transformName _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), source = r1.resultOpt.getOrElse(o2.source), sink = r2.resultOpt.getOrElse(o2.sink))))
          else
            TPostResult(r2.ctx, None())
        case o2: Emv2Flow =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.identifier)
          val r1: TPostResult[Context, Option[Emv2Propagation]] = transformOption(r0.ctx, o2.sourcePropagation, transformEmv2Propagation _)
          val r2: TPostResult[Context, Option[Emv2Propagation]] = transformOption(r1.ctx, o2.sinkPropagation, transformEmv2Propagation _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(identifier = r0.resultOpt.getOrElse(o2.identifier), sourcePropagation = r1.resultOpt.getOrElse(o2.sourcePropagation), sinkPropagation = r2.resultOpt.getOrElse(o2.sinkPropagation))))
          else
            TPostResult(r2.ctx, None())
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: AadlInstInfo = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, AadlInstInfo] = pp.postAadlInstInfo(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformAadl(ctx: Context, o: Aadl): TPostResult[Context, Aadl] = {
    val preR: PreResult[Context, Aadl] = pp.preAadl(ctx, o)
    val r: TPostResult[Context, Aadl] = if (preR.continu) {
      val o2: Aadl = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, Component]] = transformISZ(preR.ctx, o2.components, transformComponent _)
      val r1: TPostResult[Context, IS[Z, AnnexLib]] = transformISZ(r0.ctx, o2.annexLib, transformAnnexLib _)
      val r2: TPostResult[Context, IS[Z, Component]] = transformISZ(r1.ctx, o2.dataComponents, transformComponent _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        TPostResult(r2.ctx, Some(o2(components = r0.resultOpt.getOrElse(o2.components), annexLib = r1.resultOpt.getOrElse(o2.annexLib), dataComponents = r2.resultOpt.getOrElse(o2.dataComponents))))
      else
        TPostResult(r2.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: Aadl = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, Aadl] = pp.postAadl(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformName(ctx: Context, o: Name): TPostResult[Context, Name] = {
    val preR: PreResult[Context, Name] = pp.preName(ctx, o)
    val r: TPostResult[Context, Name] = if (preR.continu) {
      val o2: Name = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      if (hasChanged)
        TPostResult(preR.ctx, Some(o2))
      else
        TPostResult(preR.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: Name = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, Name] = pp.postName(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformComponent(ctx: Context, o: Component): TPostResult[Context, Component] = {
    val preR: PreResult[Context, Component] = pp.preComponent(ctx, o)
    val r: TPostResult[Context, Component] = if (preR.continu) {
      val o2: Component = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.identifier)
      val r1: TPostResult[Context, Option[Classifier]] = transformOption(r0.ctx, o2.classifier, transformClassifier _)
      val r2: TPostResult[Context, IS[Z, Feature]] = transformISZ(r1.ctx, o2.features, transformFeature _)
      val r3: TPostResult[Context, IS[Z, Component]] = transformISZ(r2.ctx, o2.subComponents, transformComponent _)
      val r4: TPostResult[Context, IS[Z, Connection]] = transformISZ(r3.ctx, o2.connections, transformConnection _)
      val r5: TPostResult[Context, IS[Z, ConnectionInstance]] = transformISZ(r4.ctx, o2.connectionInstances, transformConnectionInstance _)
      val r6: TPostResult[Context, IS[Z, Property]] = transformISZ(r5.ctx, o2.properties, transformProperty _)
      val r7: TPostResult[Context, IS[Z, Flow]] = transformISZ(r6.ctx, o2.flows, transformFlow _)
      val r8: TPostResult[Context, IS[Z, Mode]] = transformISZ(r7.ctx, o2.modes, transformMode _)
      val r9: TPostResult[Context, IS[Z, Annex]] = transformISZ(r8.ctx, o2.annexes, transformAnnex _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty || r5.resultOpt.nonEmpty || r6.resultOpt.nonEmpty || r7.resultOpt.nonEmpty || r8.resultOpt.nonEmpty || r9.resultOpt.nonEmpty)
        TPostResult(r9.ctx, Some(o2(identifier = r0.resultOpt.getOrElse(o2.identifier), classifier = r1.resultOpt.getOrElse(o2.classifier), features = r2.resultOpt.getOrElse(o2.features), subComponents = r3.resultOpt.getOrElse(o2.subComponents), connections = r4.resultOpt.getOrElse(o2.connections), connectionInstances = r5.resultOpt.getOrElse(o2.connectionInstances), properties = r6.resultOpt.getOrElse(o2.properties), flows = r7.resultOpt.getOrElse(o2.flows), modes = r8.resultOpt.getOrElse(o2.modes), annexes = r9.resultOpt.getOrElse(o2.annexes))))
      else
        TPostResult(r9.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: Component = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, Component] = pp.postComponent(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformClassifier(ctx: Context, o: Classifier): TPostResult[Context, Classifier] = {
    val preR: PreResult[Context, Classifier] = pp.preClassifier(ctx, o)
    val r: TPostResult[Context, Classifier] = if (preR.continu) {
      val o2: Classifier = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      if (hasChanged)
        TPostResult(preR.ctx, Some(o2))
      else
        TPostResult(preR.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: Classifier = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, Classifier] = pp.postClassifier(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformFeature(ctx: Context, o: Feature): TPostResult[Context, Feature] = {
    val preR: PreResult[Context, Feature] = pp.preFeature(ctx, o)
    val r: TPostResult[Context, Feature] = if (preR.continu) {
      val o2: Feature = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, Feature] = o2 match {
        case o2: FeatureEnd =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.identifier)
          val r1: TPostResult[Context, Option[Classifier]] = transformOption(r0.ctx, o2.classifier, transformClassifier _)
          val r2: TPostResult[Context, IS[Z, Property]] = transformISZ(r1.ctx, o2.properties, transformProperty _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(identifier = r0.resultOpt.getOrElse(o2.identifier), classifier = r1.resultOpt.getOrElse(o2.classifier), properties = r2.resultOpt.getOrElse(o2.properties))))
          else
            TPostResult(r2.ctx, None())
        case o2: FeatureGroup =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.identifier)
          val r1: TPostResult[Context, IS[Z, Feature]] = transformISZ(r0.ctx, o2.features, transformFeature _)
          val r2: TPostResult[Context, IS[Z, Property]] = transformISZ(r1.ctx, o2.properties, transformProperty _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(identifier = r0.resultOpt.getOrElse(o2.identifier), features = r1.resultOpt.getOrElse(o2.features), properties = r2.resultOpt.getOrElse(o2.properties))))
          else
            TPostResult(r2.ctx, None())
        case o2: FeatureAccess =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.identifier)
          val r1: TPostResult[Context, Option[Classifier]] = transformOption(r0.ctx, o2.classifier, transformClassifier _)
          val r2: TPostResult[Context, IS[Z, Property]] = transformISZ(r1.ctx, o2.properties, transformProperty _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(identifier = r0.resultOpt.getOrElse(o2.identifier), classifier = r1.resultOpt.getOrElse(o2.classifier), properties = r2.resultOpt.getOrElse(o2.properties))))
          else
            TPostResult(r2.ctx, None())
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: Feature = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, Feature] = pp.postFeature(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformFeatureEnd(ctx: Context, o: FeatureEnd): TPostResult[Context, FeatureEnd] = {
    val preR: PreResult[Context, FeatureEnd] = pp.preFeatureEnd(ctx, o)
    val r: TPostResult[Context, FeatureEnd] = if (preR.continu) {
      val o2: FeatureEnd = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.identifier)
      val r1: TPostResult[Context, Option[Classifier]] = transformOption(r0.ctx, o2.classifier, transformClassifier _)
      val r2: TPostResult[Context, IS[Z, Property]] = transformISZ(r1.ctx, o2.properties, transformProperty _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        TPostResult(r2.ctx, Some(o2(identifier = r0.resultOpt.getOrElse(o2.identifier), classifier = r1.resultOpt.getOrElse(o2.classifier), properties = r2.resultOpt.getOrElse(o2.properties))))
      else
        TPostResult(r2.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: FeatureEnd = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, FeatureEnd] = pp.postFeatureEnd(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformFeatureGroup(ctx: Context, o: FeatureGroup): TPostResult[Context, FeatureGroup] = {
    val preR: PreResult[Context, FeatureGroup] = pp.preFeatureGroup(ctx, o)
    val r: TPostResult[Context, FeatureGroup] = if (preR.continu) {
      val o2: FeatureGroup = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.identifier)
      val r1: TPostResult[Context, IS[Z, Feature]] = transformISZ(r0.ctx, o2.features, transformFeature _)
      val r2: TPostResult[Context, IS[Z, Property]] = transformISZ(r1.ctx, o2.properties, transformProperty _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        TPostResult(r2.ctx, Some(o2(identifier = r0.resultOpt.getOrElse(o2.identifier), features = r1.resultOpt.getOrElse(o2.features), properties = r2.resultOpt.getOrElse(o2.properties))))
      else
        TPostResult(r2.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: FeatureGroup = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, FeatureGroup] = pp.postFeatureGroup(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformFeatureAccess(ctx: Context, o: FeatureAccess): TPostResult[Context, FeatureAccess] = {
    val preR: PreResult[Context, FeatureAccess] = pp.preFeatureAccess(ctx, o)
    val r: TPostResult[Context, FeatureAccess] = if (preR.continu) {
      val o2: FeatureAccess = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.identifier)
      val r1: TPostResult[Context, Option[Classifier]] = transformOption(r0.ctx, o2.classifier, transformClassifier _)
      val r2: TPostResult[Context, IS[Z, Property]] = transformISZ(r1.ctx, o2.properties, transformProperty _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        TPostResult(r2.ctx, Some(o2(identifier = r0.resultOpt.getOrElse(o2.identifier), classifier = r1.resultOpt.getOrElse(o2.classifier), properties = r2.resultOpt.getOrElse(o2.properties))))
      else
        TPostResult(r2.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: FeatureAccess = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, FeatureAccess] = pp.postFeatureAccess(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformConnection(ctx: Context, o: Connection): TPostResult[Context, Connection] = {
    val preR: PreResult[Context, Connection] = pp.preConnection(ctx, o)
    val r: TPostResult[Context, Connection] = if (preR.continu) {
      val o2: Connection = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
      val r1: TPostResult[Context, IS[Z, EndPoint]] = transformISZ(r0.ctx, o2.src, transformEndPoint _)
      val r2: TPostResult[Context, IS[Z, EndPoint]] = transformISZ(r1.ctx, o2.dst, transformEndPoint _)
      val r3: TPostResult[Context, IS[Z, Name]] = transformISZ(r2.ctx, o2.connectionInstances, transformName _)
      val r4: TPostResult[Context, IS[Z, Property]] = transformISZ(r3.ctx, o2.properties, transformProperty _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
        TPostResult(r4.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), src = r1.resultOpt.getOrElse(o2.src), dst = r2.resultOpt.getOrElse(o2.dst), connectionInstances = r3.resultOpt.getOrElse(o2.connectionInstances), properties = r4.resultOpt.getOrElse(o2.properties))))
      else
        TPostResult(r4.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: Connection = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, Connection] = pp.postConnection(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformConnectionInstance(ctx: Context, o: ConnectionInstance): TPostResult[Context, ConnectionInstance] = {
    val preR: PreResult[Context, ConnectionInstance] = pp.preConnectionInstance(ctx, o)
    val r: TPostResult[Context, ConnectionInstance] = if (preR.continu) {
      val o2: ConnectionInstance = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
      val r1: TPostResult[Context, EndPoint] = transformEndPoint(r0.ctx, o2.src)
      val r2: TPostResult[Context, EndPoint] = transformEndPoint(r1.ctx, o2.dst)
      val r3: TPostResult[Context, IS[Z, ConnectionReference]] = transformISZ(r2.ctx, o2.connectionRefs, transformConnectionReference _)
      val r4: TPostResult[Context, IS[Z, Property]] = transformISZ(r3.ctx, o2.properties, transformProperty _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
        TPostResult(r4.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), src = r1.resultOpt.getOrElse(o2.src), dst = r2.resultOpt.getOrElse(o2.dst), connectionRefs = r3.resultOpt.getOrElse(o2.connectionRefs), properties = r4.resultOpt.getOrElse(o2.properties))))
      else
        TPostResult(r4.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: ConnectionInstance = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, ConnectionInstance] = pp.postConnectionInstance(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformConnectionReference(ctx: Context, o: ConnectionReference): TPostResult[Context, ConnectionReference] = {
    val preR: PreResult[Context, ConnectionReference] = pp.preConnectionReference(ctx, o)
    val r: TPostResult[Context, ConnectionReference] = if (preR.continu) {
      val o2: ConnectionReference = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
      val r1: TPostResult[Context, Name] = transformName(r0.ctx, o2.context)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), context = r1.resultOpt.getOrElse(o2.context))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: ConnectionReference = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, ConnectionReference] = pp.postConnectionReference(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformEndPoint(ctx: Context, o: EndPoint): TPostResult[Context, EndPoint] = {
    val preR: PreResult[Context, EndPoint] = pp.preEndPoint(ctx, o)
    val r: TPostResult[Context, EndPoint] = if (preR.continu) {
      val o2: EndPoint = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.component)
      val r1: TPostResult[Context, Option[Name]] = transformOption(r0.ctx, o2.feature, transformName _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(component = r0.resultOpt.getOrElse(o2.component), feature = r1.resultOpt.getOrElse(o2.feature))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: EndPoint = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, EndPoint] = pp.postEndPoint(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformProperty(ctx: Context, o: Property): TPostResult[Context, Property] = {
    val preR: PreResult[Context, Property] = pp.preProperty(ctx, o)
    val r: TPostResult[Context, Property] = if (preR.continu) {
      val o2: Property = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
      val r1: TPostResult[Context, IS[Z, PropertyValue]] = transformISZ(r0.ctx, o2.propertyValues, transformPropertyValue _)
      val r2: TPostResult[Context, IS[Z, ElementRef]] = transformISZ(r1.ctx, o2.appliesTo, transformElementRef _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        TPostResult(r2.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), propertyValues = r1.resultOpt.getOrElse(o2.propertyValues), appliesTo = r2.resultOpt.getOrElse(o2.appliesTo))))
      else
        TPostResult(r2.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: Property = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, Property] = pp.postProperty(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformElementRef(ctx: Context, o: ElementRef): TPostResult[Context, ElementRef] = {
    val preR: PreResult[Context, ElementRef] = pp.preElementRef(ctx, o)
    val r: TPostResult[Context, ElementRef] = if (preR.continu) {
      val o2: ElementRef = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, ElementRef] = o2 match {
        case o2: AadlElementRef =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name))))
          else
            TPostResult(r0.ctx, None())
        case o2: Emv2ElementRef =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
          val r1: TPostResult[Context, IS[Z, Name]] = transformISZ(r0.ctx, o2.errorTypes, transformName _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), errorTypes = r1.resultOpt.getOrElse(o2.errorTypes))))
          else
            TPostResult(r1.ctx, None())
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: ElementRef = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, ElementRef] = pp.postElementRef(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformAadlElementRef(ctx: Context, o: AadlElementRef): TPostResult[Context, AadlElementRef] = {
    val preR: PreResult[Context, AadlElementRef] = pp.preAadlElementRef(ctx, o)
    val r: TPostResult[Context, AadlElementRef] = if (preR.continu) {
      val o2: AadlElementRef = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: AadlElementRef = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, AadlElementRef] = pp.postAadlElementRef(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformPropertyValue(ctx: Context, o: PropertyValue): TPostResult[Context, PropertyValue] = {
    val preR: PreResult[Context, PropertyValue] = pp.prePropertyValue(ctx, o)
    val r: TPostResult[Context, PropertyValue] = if (preR.continu) {
      val o2: PropertyValue = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, PropertyValue] = o2 match {
        case o2: ClassifierProp =>
          if (hasChanged)
            TPostResult(preR.ctx, Some(o2))
          else
            TPostResult(preR.ctx, None())
        case o2: RangeProp =>
          val r0: TPostResult[Context, UnitProp] = transformUnitProp(preR.ctx, o2.low)
          val r1: TPostResult[Context, UnitProp] = transformUnitProp(r0.ctx, o2.high)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(low = r0.resultOpt.getOrElse(o2.low), high = r1.resultOpt.getOrElse(o2.high))))
          else
            TPostResult(r1.ctx, None())
        case o2: RecordProp =>
          val r0: TPostResult[Context, IS[Z, Property]] = transformISZ(preR.ctx, o2.properties, transformProperty _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(properties = r0.resultOpt.getOrElse(o2.properties))))
          else
            TPostResult(r0.ctx, None())
        case o2: ReferenceProp =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.value)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(value = r0.resultOpt.getOrElse(o2.value))))
          else
            TPostResult(r0.ctx, None())
        case o2: UnitProp =>
          if (hasChanged)
            TPostResult(preR.ctx, Some(o2))
          else
            TPostResult(preR.ctx, None())
        case o2: ValueProp =>
          if (hasChanged)
            TPostResult(preR.ctx, Some(o2))
          else
            TPostResult(preR.ctx, None())
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: PropertyValue = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, PropertyValue] = pp.postPropertyValue(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformMode(ctx: Context, o: Mode): TPostResult[Context, Mode] = {
    val preR: PreResult[Context, Mode] = pp.preMode(ctx, o)
    val r: TPostResult[Context, Mode] = if (preR.continu) {
      val o2: Mode = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: Mode = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, Mode] = pp.postMode(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformFlow(ctx: Context, o: Flow): TPostResult[Context, Flow] = {
    val preR: PreResult[Context, Flow] = pp.preFlow(ctx, o)
    val r: TPostResult[Context, Flow] = if (preR.continu) {
      val o2: Flow = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
      val r1: TPostResult[Context, Option[Name]] = transformOption(r0.ctx, o2.source, transformName _)
      val r2: TPostResult[Context, Option[Name]] = transformOption(r1.ctx, o2.sink, transformName _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        TPostResult(r2.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), source = r1.resultOpt.getOrElse(o2.source), sink = r2.resultOpt.getOrElse(o2.sink))))
      else
        TPostResult(r2.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: Flow = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, Flow] = pp.postFlow(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformAnnex(ctx: Context, o: Annex): TPostResult[Context, Annex] = {
    val preR: PreResult[Context, Annex] = pp.preAnnex(ctx, o)
    val r: TPostResult[Context, Annex] = if (preR.continu) {
      val o2: Annex = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, AnnexClause] = transformAnnexClause(preR.ctx, o2.clause)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(clause = r0.resultOpt.getOrElse(o2.clause))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: Annex = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, Annex] = pp.postAnnex(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformAnnexClause(ctx: Context, o: AnnexClause): TPostResult[Context, AnnexClause] = {
    val preR: PreResult[Context, AnnexClause] = pp.preAnnexClause(ctx, o)
    val r: TPostResult[Context, AnnexClause] = if (preR.continu) {
      val o2: AnnexClause = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, AnnexClause] = o2 match {
        case o2: ErrorTypeDef =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.id)
          val r1: TPostResult[Context, Option[Name]] = transformOption(r0.ctx, o2.extendType, transformName _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), extendType = r1.resultOpt.getOrElse(o2.extendType))))
          else
            TPostResult(r1.ctx, None())
        case o2: ErrorAliasDef =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.errorType)
          val r1: TPostResult[Context, Name] = transformName(r0.ctx, o2.aliseType)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(errorType = r0.resultOpt.getOrElse(o2.errorType), aliseType = r1.resultOpt.getOrElse(o2.aliseType))))
          else
            TPostResult(r1.ctx, None())
        case o2: ErrorTypeSetDef =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.id)
          val r1: TPostResult[Context, IS[Z, Name]] = transformISZ(r0.ctx, o2.errorTypes, transformName _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), errorTypes = r1.resultOpt.getOrElse(o2.errorTypes))))
          else
            TPostResult(r1.ctx, None())
        case o2: BehaveStateMachine =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.id)
          val r1: TPostResult[Context, IS[Z, ErrorEvent]] = transformISZ(r0.ctx, o2.events, transformErrorEvent _)
          val r2: TPostResult[Context, IS[Z, ErrorState]] = transformISZ(r1.ctx, o2.states, transformErrorState _)
          val r3: TPostResult[Context, IS[Z, ErrorTransition]] = transformISZ(r2.ctx, o2.transitions, transformErrorTransition _)
          val r4: TPostResult[Context, IS[Z, Property]] = transformISZ(r3.ctx, o2.properties, transformProperty _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
            TPostResult(r4.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), events = r1.resultOpt.getOrElse(o2.events), states = r2.resultOpt.getOrElse(o2.states), transitions = r3.resultOpt.getOrElse(o2.transitions), properties = r4.resultOpt.getOrElse(o2.properties))))
          else
            TPostResult(r4.ctx, None())
        case o2: ErrorEvent =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.id)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id))))
          else
            TPostResult(r0.ctx, None())
        case o2: ErrorState =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.id)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id))))
          else
            TPostResult(r0.ctx, None())
        case o2: ErrorTransition =>
          val r0: TPostResult[Context, Option[Name]] = transformOption(preR.ctx, o2.id, transformName _)
          val r1: TPostResult[Context, Name] = transformName(r0.ctx, o2.sourceState)
          val r2: TPostResult[Context, ErrorCondition] = transformErrorCondition(r1.ctx, o2.condition)
          val r3: TPostResult[Context, Name] = transformName(r2.ctx, o2.targetState)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), sourceState = r1.resultOpt.getOrElse(o2.sourceState), condition = r2.resultOpt.getOrElse(o2.condition), targetState = r3.resultOpt.getOrElse(o2.targetState))))
          else
            TPostResult(r3.ctx, None())
        case o2: ConditionTrigger =>
          val r0: TPostResult[Context, IS[Z, Name]] = transformISZ(preR.ctx, o2.events, transformName _)
          val r1: TPostResult[Context, IS[Z, Emv2Propagation]] = transformISZ(r0.ctx, o2.propagationPoints, transformEmv2Propagation _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(events = r0.resultOpt.getOrElse(o2.events), propagationPoints = r1.resultOpt.getOrElse(o2.propagationPoints))))
          else
            TPostResult(r1.ctx, None())
        case o2: AndCondition =>
          val r0: TPostResult[Context, IS[Z, ErrorCondition]] = transformISZ(preR.ctx, o2.op, transformErrorCondition _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(op = r0.resultOpt.getOrElse(o2.op))))
          else
            TPostResult(r0.ctx, None())
        case o2: OrCondition =>
          val r0: TPostResult[Context, IS[Z, ErrorCondition]] = transformISZ(preR.ctx, o2.op, transformErrorCondition _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(op = r0.resultOpt.getOrElse(o2.op))))
          else
            TPostResult(r0.ctx, None())
        case o2: AllCondition =>
          val r0: TPostResult[Context, IS[Z, ErrorCondition]] = transformISZ(preR.ctx, o2.op, transformErrorCondition _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(op = r0.resultOpt.getOrElse(o2.op))))
          else
            TPostResult(r0.ctx, None())
        case o2: OrMoreCondition =>
          val r0: TPostResult[Context, IS[Z, ErrorCondition]] = transformISZ(preR.ctx, o2.conditions, transformErrorCondition _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(conditions = r0.resultOpt.getOrElse(o2.conditions))))
          else
            TPostResult(r0.ctx, None())
        case o2: OrLessCondition =>
          val r0: TPostResult[Context, IS[Z, ErrorCondition]] = transformISZ(preR.ctx, o2.conditions, transformErrorCondition _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(conditions = r0.resultOpt.getOrElse(o2.conditions))))
          else
            TPostResult(r0.ctx, None())
        case o2: Emv2Clause =>
          val r0: TPostResult[Context, IS[Z, Name]] = transformISZ(preR.ctx, o2.libraries, transformName _)
          val r1: TPostResult[Context, IS[Z, Emv2Propagation]] = transformISZ(r0.ctx, o2.propagations, transformEmv2Propagation _)
          val r2: TPostResult[Context, IS[Z, Emv2Flow]] = transformISZ(r1.ctx, o2.flows, transformEmv2Flow _)
          val r3: TPostResult[Context, Option[Emv2BehaviorSection]] = transformOption(r2.ctx, o2.componentBehavior, transformEmv2BehaviorSection _)
          val r4: TPostResult[Context, IS[Z, Property]] = transformISZ(r3.ctx, o2.properties, transformProperty _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
            TPostResult(r4.ctx, Some(o2(libraries = r0.resultOpt.getOrElse(o2.libraries), propagations = r1.resultOpt.getOrElse(o2.propagations), flows = r2.resultOpt.getOrElse(o2.flows), componentBehavior = r3.resultOpt.getOrElse(o2.componentBehavior), properties = r4.resultOpt.getOrElse(o2.properties))))
          else
            TPostResult(r4.ctx, None())
        case o2: Emv2Propagation =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.propagationPoint)
          val r1: TPostResult[Context, IS[Z, Name]] = transformISZ(r0.ctx, o2.errorTokens, transformName _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(propagationPoint = r0.resultOpt.getOrElse(o2.propagationPoint), errorTokens = r1.resultOpt.getOrElse(o2.errorTokens))))
          else
            TPostResult(r1.ctx, None())
        case o2: Emv2Flow =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.identifier)
          val r1: TPostResult[Context, Option[Emv2Propagation]] = transformOption(r0.ctx, o2.sourcePropagation, transformEmv2Propagation _)
          val r2: TPostResult[Context, Option[Emv2Propagation]] = transformOption(r1.ctx, o2.sinkPropagation, transformEmv2Propagation _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(identifier = r0.resultOpt.getOrElse(o2.identifier), sourcePropagation = r1.resultOpt.getOrElse(o2.sourcePropagation), sinkPropagation = r2.resultOpt.getOrElse(o2.sinkPropagation))))
          else
            TPostResult(r2.ctx, None())
        case o2: Emv2BehaviorSection =>
          val r0: TPostResult[Context, IS[Z, ErrorEvent]] = transformISZ(preR.ctx, o2.events, transformErrorEvent _)
          val r1: TPostResult[Context, IS[Z, ErrorTransition]] = transformISZ(r0.ctx, o2.transitions, transformErrorTransition _)
          val r2: TPostResult[Context, IS[Z, ErrorPropagation]] = transformISZ(r1.ctx, o2.propagations, transformErrorPropagation _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(events = r0.resultOpt.getOrElse(o2.events), transitions = r1.resultOpt.getOrElse(o2.transitions), propagations = r2.resultOpt.getOrElse(o2.propagations))))
          else
            TPostResult(r2.ctx, None())
        case o2: ErrorPropagation =>
          val r0: TPostResult[Context, Option[Name]] = transformOption(preR.ctx, o2.id, transformName _)
          val r1: TPostResult[Context, IS[Z, Name]] = transformISZ(r0.ctx, o2.source, transformName _)
          val r2: TPostResult[Context, Option[ErrorCondition]] = transformOption(r1.ctx, o2.condition, transformErrorCondition _)
          val r3: TPostResult[Context, IS[Z, Emv2Propagation]] = transformISZ(r2.ctx, o2.target, transformEmv2Propagation _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), source = r1.resultOpt.getOrElse(o2.source), condition = r2.resultOpt.getOrElse(o2.condition), target = r3.resultOpt.getOrElse(o2.target))))
          else
            TPostResult(r3.ctx, None())
        case o2: SmfClause =>
          val r0: TPostResult[Context, IS[Z, SmfClassification]] = transformISZ(preR.ctx, o2.classification, transformSmfClassification _)
          val r1: TPostResult[Context, IS[Z, SmfDeclass]] = transformISZ(r0.ctx, o2.declass, transformSmfDeclass _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(classification = r0.resultOpt.getOrElse(o2.classification), declass = r1.resultOpt.getOrElse(o2.declass))))
          else
            TPostResult(r1.ctx, None())
        case o2: SmfClassification =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.portName)
          val r1: TPostResult[Context, Name] = transformName(r0.ctx, o2.typeName)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(portName = r0.resultOpt.getOrElse(o2.portName), typeName = r1.resultOpt.getOrElse(o2.typeName))))
          else
            TPostResult(r1.ctx, None())
        case o2: SmfDeclass =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.flowName)
          val r1: TPostResult[Context, Option[Name]] = transformOption(r0.ctx, o2.srcType, transformName _)
          val r2: TPostResult[Context, Name] = transformName(r1.ctx, o2.snkType)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(flowName = r0.resultOpt.getOrElse(o2.flowName), srcType = r1.resultOpt.getOrElse(o2.srcType), snkType = r2.resultOpt.getOrElse(o2.snkType))))
          else
            TPostResult(r2.ctx, None())
        case o2: SmfType =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.typeName)
          val r1: TPostResult[Context, Option[Name]] = transformOption(r0.ctx, o2.parentType, transformName _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(typeName = r0.resultOpt.getOrElse(o2.typeName), parentType = r1.resultOpt.getOrElse(o2.parentType))))
          else
            TPostResult(r1.ctx, None())
        case o2: OtherAnnex =>
          if (hasChanged)
            TPostResult(preR.ctx, Some(o2))
          else
            TPostResult(preR.ctx, None())
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: AnnexClause = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, AnnexClause] = pp.postAnnexClause(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformAnnexLib(ctx: Context, o: AnnexLib): TPostResult[Context, AnnexLib] = {
    val preR: PreResult[Context, AnnexLib] = pp.preAnnexLib(ctx, o)
    val r: TPostResult[Context, AnnexLib] = if (preR.continu) {
      val o2: AnnexLib = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, AnnexLib] = o2 match {
        case o2: Emv2Library =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
          val r1: TPostResult[Context, IS[Z, ErrorTypeDef]] = transformISZ(r0.ctx, o2.errorTypeDef, transformErrorTypeDef _)
          val r2: TPostResult[Context, IS[Z, ErrorTypeSetDef]] = transformISZ(r1.ctx, o2.errorTypeSetDef, transformErrorTypeSetDef _)
          val r3: TPostResult[Context, IS[Z, ErrorAliasDef]] = transformISZ(r2.ctx, o2.alias, transformErrorAliasDef _)
          val r4: TPostResult[Context, IS[Z, BehaveStateMachine]] = transformISZ(r3.ctx, o2.behaveStateMachine, transformBehaveStateMachine _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
            TPostResult(r4.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), errorTypeDef = r1.resultOpt.getOrElse(o2.errorTypeDef), errorTypeSetDef = r2.resultOpt.getOrElse(o2.errorTypeSetDef), alias = r3.resultOpt.getOrElse(o2.alias), behaveStateMachine = r4.resultOpt.getOrElse(o2.behaveStateMachine))))
          else
            TPostResult(r4.ctx, None())
        case o2: SmfLibrary =>
          val r0: TPostResult[Context, IS[Z, SmfType]] = transformISZ(preR.ctx, o2.types, transformSmfType _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(types = r0.resultOpt.getOrElse(o2.types))))
          else
            TPostResult(r0.ctx, None())
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: AnnexLib = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, AnnexLib] = pp.postAnnexLib(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformEmv2Annex(ctx: Context, o: Emv2Annex): TPostResult[Context, Emv2Annex] = {
    val preR: PreResult[Context, Emv2Annex] = pp.preEmv2Annex(ctx, o)
    val r: TPostResult[Context, Emv2Annex] = if (preR.continu) {
      val o2: Emv2Annex = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, Emv2Annex] = o2 match {
        case o2: ErrorTypeDef =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.id)
          val r1: TPostResult[Context, Option[Name]] = transformOption(r0.ctx, o2.extendType, transformName _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), extendType = r1.resultOpt.getOrElse(o2.extendType))))
          else
            TPostResult(r1.ctx, None())
        case o2: ErrorAliasDef =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.errorType)
          val r1: TPostResult[Context, Name] = transformName(r0.ctx, o2.aliseType)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(errorType = r0.resultOpt.getOrElse(o2.errorType), aliseType = r1.resultOpt.getOrElse(o2.aliseType))))
          else
            TPostResult(r1.ctx, None())
        case o2: ErrorTypeSetDef =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.id)
          val r1: TPostResult[Context, IS[Z, Name]] = transformISZ(r0.ctx, o2.errorTypes, transformName _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), errorTypes = r1.resultOpt.getOrElse(o2.errorTypes))))
          else
            TPostResult(r1.ctx, None())
        case o2: BehaveStateMachine =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.id)
          val r1: TPostResult[Context, IS[Z, ErrorEvent]] = transformISZ(r0.ctx, o2.events, transformErrorEvent _)
          val r2: TPostResult[Context, IS[Z, ErrorState]] = transformISZ(r1.ctx, o2.states, transformErrorState _)
          val r3: TPostResult[Context, IS[Z, ErrorTransition]] = transformISZ(r2.ctx, o2.transitions, transformErrorTransition _)
          val r4: TPostResult[Context, IS[Z, Property]] = transformISZ(r3.ctx, o2.properties, transformProperty _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
            TPostResult(r4.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), events = r1.resultOpt.getOrElse(o2.events), states = r2.resultOpt.getOrElse(o2.states), transitions = r3.resultOpt.getOrElse(o2.transitions), properties = r4.resultOpt.getOrElse(o2.properties))))
          else
            TPostResult(r4.ctx, None())
        case o2: ErrorEvent =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.id)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id))))
          else
            TPostResult(r0.ctx, None())
        case o2: ErrorState =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.id)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id))))
          else
            TPostResult(r0.ctx, None())
        case o2: ErrorTransition =>
          val r0: TPostResult[Context, Option[Name]] = transformOption(preR.ctx, o2.id, transformName _)
          val r1: TPostResult[Context, Name] = transformName(r0.ctx, o2.sourceState)
          val r2: TPostResult[Context, ErrorCondition] = transformErrorCondition(r1.ctx, o2.condition)
          val r3: TPostResult[Context, Name] = transformName(r2.ctx, o2.targetState)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), sourceState = r1.resultOpt.getOrElse(o2.sourceState), condition = r2.resultOpt.getOrElse(o2.condition), targetState = r3.resultOpt.getOrElse(o2.targetState))))
          else
            TPostResult(r3.ctx, None())
        case o2: ConditionTrigger =>
          val r0: TPostResult[Context, IS[Z, Name]] = transformISZ(preR.ctx, o2.events, transformName _)
          val r1: TPostResult[Context, IS[Z, Emv2Propagation]] = transformISZ(r0.ctx, o2.propagationPoints, transformEmv2Propagation _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(events = r0.resultOpt.getOrElse(o2.events), propagationPoints = r1.resultOpt.getOrElse(o2.propagationPoints))))
          else
            TPostResult(r1.ctx, None())
        case o2: AndCondition =>
          val r0: TPostResult[Context, IS[Z, ErrorCondition]] = transformISZ(preR.ctx, o2.op, transformErrorCondition _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(op = r0.resultOpt.getOrElse(o2.op))))
          else
            TPostResult(r0.ctx, None())
        case o2: OrCondition =>
          val r0: TPostResult[Context, IS[Z, ErrorCondition]] = transformISZ(preR.ctx, o2.op, transformErrorCondition _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(op = r0.resultOpt.getOrElse(o2.op))))
          else
            TPostResult(r0.ctx, None())
        case o2: AllCondition =>
          val r0: TPostResult[Context, IS[Z, ErrorCondition]] = transformISZ(preR.ctx, o2.op, transformErrorCondition _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(op = r0.resultOpt.getOrElse(o2.op))))
          else
            TPostResult(r0.ctx, None())
        case o2: OrMoreCondition =>
          val r0: TPostResult[Context, IS[Z, ErrorCondition]] = transformISZ(preR.ctx, o2.conditions, transformErrorCondition _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(conditions = r0.resultOpt.getOrElse(o2.conditions))))
          else
            TPostResult(r0.ctx, None())
        case o2: OrLessCondition =>
          val r0: TPostResult[Context, IS[Z, ErrorCondition]] = transformISZ(preR.ctx, o2.conditions, transformErrorCondition _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(conditions = r0.resultOpt.getOrElse(o2.conditions))))
          else
            TPostResult(r0.ctx, None())
        case o2: Emv2Clause =>
          val r0: TPostResult[Context, IS[Z, Name]] = transformISZ(preR.ctx, o2.libraries, transformName _)
          val r1: TPostResult[Context, IS[Z, Emv2Propagation]] = transformISZ(r0.ctx, o2.propagations, transformEmv2Propagation _)
          val r2: TPostResult[Context, IS[Z, Emv2Flow]] = transformISZ(r1.ctx, o2.flows, transformEmv2Flow _)
          val r3: TPostResult[Context, Option[Emv2BehaviorSection]] = transformOption(r2.ctx, o2.componentBehavior, transformEmv2BehaviorSection _)
          val r4: TPostResult[Context, IS[Z, Property]] = transformISZ(r3.ctx, o2.properties, transformProperty _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
            TPostResult(r4.ctx, Some(o2(libraries = r0.resultOpt.getOrElse(o2.libraries), propagations = r1.resultOpt.getOrElse(o2.propagations), flows = r2.resultOpt.getOrElse(o2.flows), componentBehavior = r3.resultOpt.getOrElse(o2.componentBehavior), properties = r4.resultOpt.getOrElse(o2.properties))))
          else
            TPostResult(r4.ctx, None())
        case o2: Emv2Propagation =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.propagationPoint)
          val r1: TPostResult[Context, IS[Z, Name]] = transformISZ(r0.ctx, o2.errorTokens, transformName _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(propagationPoint = r0.resultOpt.getOrElse(o2.propagationPoint), errorTokens = r1.resultOpt.getOrElse(o2.errorTokens))))
          else
            TPostResult(r1.ctx, None())
        case o2: Emv2Flow =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.identifier)
          val r1: TPostResult[Context, Option[Emv2Propagation]] = transformOption(r0.ctx, o2.sourcePropagation, transformEmv2Propagation _)
          val r2: TPostResult[Context, Option[Emv2Propagation]] = transformOption(r1.ctx, o2.sinkPropagation, transformEmv2Propagation _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(identifier = r0.resultOpt.getOrElse(o2.identifier), sourcePropagation = r1.resultOpt.getOrElse(o2.sourcePropagation), sinkPropagation = r2.resultOpt.getOrElse(o2.sinkPropagation))))
          else
            TPostResult(r2.ctx, None())
        case o2: Emv2BehaviorSection =>
          val r0: TPostResult[Context, IS[Z, ErrorEvent]] = transformISZ(preR.ctx, o2.events, transformErrorEvent _)
          val r1: TPostResult[Context, IS[Z, ErrorTransition]] = transformISZ(r0.ctx, o2.transitions, transformErrorTransition _)
          val r2: TPostResult[Context, IS[Z, ErrorPropagation]] = transformISZ(r1.ctx, o2.propagations, transformErrorPropagation _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(events = r0.resultOpt.getOrElse(o2.events), transitions = r1.resultOpt.getOrElse(o2.transitions), propagations = r2.resultOpt.getOrElse(o2.propagations))))
          else
            TPostResult(r2.ctx, None())
        case o2: ErrorPropagation =>
          val r0: TPostResult[Context, Option[Name]] = transformOption(preR.ctx, o2.id, transformName _)
          val r1: TPostResult[Context, IS[Z, Name]] = transformISZ(r0.ctx, o2.source, transformName _)
          val r2: TPostResult[Context, Option[ErrorCondition]] = transformOption(r1.ctx, o2.condition, transformErrorCondition _)
          val r3: TPostResult[Context, IS[Z, Emv2Propagation]] = transformISZ(r2.ctx, o2.target, transformEmv2Propagation _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), source = r1.resultOpt.getOrElse(o2.source), condition = r2.resultOpt.getOrElse(o2.condition), target = r3.resultOpt.getOrElse(o2.target))))
          else
            TPostResult(r3.ctx, None())
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: Emv2Annex = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, Emv2Annex] = pp.postEmv2Annex(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformEmv2Lib(ctx: Context, o: Emv2Lib): TPostResult[Context, Emv2Lib] = {
    val preR: PreResult[Context, Emv2Lib] = pp.preEmv2Lib(ctx, o)
    val r: TPostResult[Context, Emv2Lib] = if (preR.continu) {
      val o2: Emv2Lib = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, Emv2Lib] = o2 match {
        case o2: Emv2Library =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
          val r1: TPostResult[Context, IS[Z, ErrorTypeDef]] = transformISZ(r0.ctx, o2.errorTypeDef, transformErrorTypeDef _)
          val r2: TPostResult[Context, IS[Z, ErrorTypeSetDef]] = transformISZ(r1.ctx, o2.errorTypeSetDef, transformErrorTypeSetDef _)
          val r3: TPostResult[Context, IS[Z, ErrorAliasDef]] = transformISZ(r2.ctx, o2.alias, transformErrorAliasDef _)
          val r4: TPostResult[Context, IS[Z, BehaveStateMachine]] = transformISZ(r3.ctx, o2.behaveStateMachine, transformBehaveStateMachine _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
            TPostResult(r4.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), errorTypeDef = r1.resultOpt.getOrElse(o2.errorTypeDef), errorTypeSetDef = r2.resultOpt.getOrElse(o2.errorTypeSetDef), alias = r3.resultOpt.getOrElse(o2.alias), behaveStateMachine = r4.resultOpt.getOrElse(o2.behaveStateMachine))))
          else
            TPostResult(r4.ctx, None())
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: Emv2Lib = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, Emv2Lib] = pp.postEmv2Lib(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformEmv2ElementRef(ctx: Context, o: Emv2ElementRef): TPostResult[Context, Emv2ElementRef] = {
    val preR: PreResult[Context, Emv2ElementRef] = pp.preEmv2ElementRef(ctx, o)
    val r: TPostResult[Context, Emv2ElementRef] = if (preR.continu) {
      val o2: Emv2ElementRef = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
      val r1: TPostResult[Context, IS[Z, Name]] = transformISZ(r0.ctx, o2.errorTypes, transformName _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), errorTypes = r1.resultOpt.getOrElse(o2.errorTypes))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: Emv2ElementRef = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, Emv2ElementRef] = pp.postEmv2ElementRef(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformEmv2Library(ctx: Context, o: Emv2Library): TPostResult[Context, Emv2Library] = {
    val preR: PreResult[Context, Emv2Library] = pp.preEmv2Library(ctx, o)
    val r: TPostResult[Context, Emv2Library] = if (preR.continu) {
      val o2: Emv2Library = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
      val r1: TPostResult[Context, IS[Z, ErrorTypeDef]] = transformISZ(r0.ctx, o2.errorTypeDef, transformErrorTypeDef _)
      val r2: TPostResult[Context, IS[Z, ErrorTypeSetDef]] = transformISZ(r1.ctx, o2.errorTypeSetDef, transformErrorTypeSetDef _)
      val r3: TPostResult[Context, IS[Z, ErrorAliasDef]] = transformISZ(r2.ctx, o2.alias, transformErrorAliasDef _)
      val r4: TPostResult[Context, IS[Z, BehaveStateMachine]] = transformISZ(r3.ctx, o2.behaveStateMachine, transformBehaveStateMachine _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
        TPostResult(r4.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), errorTypeDef = r1.resultOpt.getOrElse(o2.errorTypeDef), errorTypeSetDef = r2.resultOpt.getOrElse(o2.errorTypeSetDef), alias = r3.resultOpt.getOrElse(o2.alias), behaveStateMachine = r4.resultOpt.getOrElse(o2.behaveStateMachine))))
      else
        TPostResult(r4.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: Emv2Library = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, Emv2Library] = pp.postEmv2Library(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformErrorTypeDef(ctx: Context, o: ErrorTypeDef): TPostResult[Context, ErrorTypeDef] = {
    val preR: PreResult[Context, ErrorTypeDef] = pp.preErrorTypeDef(ctx, o)
    val r: TPostResult[Context, ErrorTypeDef] = if (preR.continu) {
      val o2: ErrorTypeDef = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.id)
      val r1: TPostResult[Context, Option[Name]] = transformOption(r0.ctx, o2.extendType, transformName _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), extendType = r1.resultOpt.getOrElse(o2.extendType))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: ErrorTypeDef = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, ErrorTypeDef] = pp.postErrorTypeDef(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformErrorAliasDef(ctx: Context, o: ErrorAliasDef): TPostResult[Context, ErrorAliasDef] = {
    val preR: PreResult[Context, ErrorAliasDef] = pp.preErrorAliasDef(ctx, o)
    val r: TPostResult[Context, ErrorAliasDef] = if (preR.continu) {
      val o2: ErrorAliasDef = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.errorType)
      val r1: TPostResult[Context, Name] = transformName(r0.ctx, o2.aliseType)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(errorType = r0.resultOpt.getOrElse(o2.errorType), aliseType = r1.resultOpt.getOrElse(o2.aliseType))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: ErrorAliasDef = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, ErrorAliasDef] = pp.postErrorAliasDef(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformErrorTypeSetDef(ctx: Context, o: ErrorTypeSetDef): TPostResult[Context, ErrorTypeSetDef] = {
    val preR: PreResult[Context, ErrorTypeSetDef] = pp.preErrorTypeSetDef(ctx, o)
    val r: TPostResult[Context, ErrorTypeSetDef] = if (preR.continu) {
      val o2: ErrorTypeSetDef = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.id)
      val r1: TPostResult[Context, IS[Z, Name]] = transformISZ(r0.ctx, o2.errorTypes, transformName _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), errorTypes = r1.resultOpt.getOrElse(o2.errorTypes))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: ErrorTypeSetDef = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, ErrorTypeSetDef] = pp.postErrorTypeSetDef(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBehaveStateMachine(ctx: Context, o: BehaveStateMachine): TPostResult[Context, BehaveStateMachine] = {
    val preR: PreResult[Context, BehaveStateMachine] = pp.preBehaveStateMachine(ctx, o)
    val r: TPostResult[Context, BehaveStateMachine] = if (preR.continu) {
      val o2: BehaveStateMachine = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.id)
      val r1: TPostResult[Context, IS[Z, ErrorEvent]] = transformISZ(r0.ctx, o2.events, transformErrorEvent _)
      val r2: TPostResult[Context, IS[Z, ErrorState]] = transformISZ(r1.ctx, o2.states, transformErrorState _)
      val r3: TPostResult[Context, IS[Z, ErrorTransition]] = transformISZ(r2.ctx, o2.transitions, transformErrorTransition _)
      val r4: TPostResult[Context, IS[Z, Property]] = transformISZ(r3.ctx, o2.properties, transformProperty _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
        TPostResult(r4.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), events = r1.resultOpt.getOrElse(o2.events), states = r2.resultOpt.getOrElse(o2.states), transitions = r3.resultOpt.getOrElse(o2.transitions), properties = r4.resultOpt.getOrElse(o2.properties))))
      else
        TPostResult(r4.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BehaveStateMachine = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BehaveStateMachine] = pp.postBehaveStateMachine(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformErrorEvent(ctx: Context, o: ErrorEvent): TPostResult[Context, ErrorEvent] = {
    val preR: PreResult[Context, ErrorEvent] = pp.preErrorEvent(ctx, o)
    val r: TPostResult[Context, ErrorEvent] = if (preR.continu) {
      val o2: ErrorEvent = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.id)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: ErrorEvent = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, ErrorEvent] = pp.postErrorEvent(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformErrorState(ctx: Context, o: ErrorState): TPostResult[Context, ErrorState] = {
    val preR: PreResult[Context, ErrorState] = pp.preErrorState(ctx, o)
    val r: TPostResult[Context, ErrorState] = if (preR.continu) {
      val o2: ErrorState = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.id)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: ErrorState = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, ErrorState] = pp.postErrorState(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformErrorTransition(ctx: Context, o: ErrorTransition): TPostResult[Context, ErrorTransition] = {
    val preR: PreResult[Context, ErrorTransition] = pp.preErrorTransition(ctx, o)
    val r: TPostResult[Context, ErrorTransition] = if (preR.continu) {
      val o2: ErrorTransition = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Option[Name]] = transformOption(preR.ctx, o2.id, transformName _)
      val r1: TPostResult[Context, Name] = transformName(r0.ctx, o2.sourceState)
      val r2: TPostResult[Context, ErrorCondition] = transformErrorCondition(r1.ctx, o2.condition)
      val r3: TPostResult[Context, Name] = transformName(r2.ctx, o2.targetState)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
        TPostResult(r3.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), sourceState = r1.resultOpt.getOrElse(o2.sourceState), condition = r2.resultOpt.getOrElse(o2.condition), targetState = r3.resultOpt.getOrElse(o2.targetState))))
      else
        TPostResult(r3.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: ErrorTransition = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, ErrorTransition] = pp.postErrorTransition(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformErrorCondition(ctx: Context, o: ErrorCondition): TPostResult[Context, ErrorCondition] = {
    val preR: PreResult[Context, ErrorCondition] = pp.preErrorCondition(ctx, o)
    val r: TPostResult[Context, ErrorCondition] = if (preR.continu) {
      val o2: ErrorCondition = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, ErrorCondition] = o2 match {
        case o2: ConditionTrigger =>
          val r0: TPostResult[Context, IS[Z, Name]] = transformISZ(preR.ctx, o2.events, transformName _)
          val r1: TPostResult[Context, IS[Z, Emv2Propagation]] = transformISZ(r0.ctx, o2.propagationPoints, transformEmv2Propagation _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(events = r0.resultOpt.getOrElse(o2.events), propagationPoints = r1.resultOpt.getOrElse(o2.propagationPoints))))
          else
            TPostResult(r1.ctx, None())
        case o2: AndCondition =>
          val r0: TPostResult[Context, IS[Z, ErrorCondition]] = transformISZ(preR.ctx, o2.op, transformErrorCondition _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(op = r0.resultOpt.getOrElse(o2.op))))
          else
            TPostResult(r0.ctx, None())
        case o2: OrCondition =>
          val r0: TPostResult[Context, IS[Z, ErrorCondition]] = transformISZ(preR.ctx, o2.op, transformErrorCondition _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(op = r0.resultOpt.getOrElse(o2.op))))
          else
            TPostResult(r0.ctx, None())
        case o2: AllCondition =>
          val r0: TPostResult[Context, IS[Z, ErrorCondition]] = transformISZ(preR.ctx, o2.op, transformErrorCondition _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(op = r0.resultOpt.getOrElse(o2.op))))
          else
            TPostResult(r0.ctx, None())
        case o2: OrMoreCondition =>
          val r0: TPostResult[Context, IS[Z, ErrorCondition]] = transformISZ(preR.ctx, o2.conditions, transformErrorCondition _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(conditions = r0.resultOpt.getOrElse(o2.conditions))))
          else
            TPostResult(r0.ctx, None())
        case o2: OrLessCondition =>
          val r0: TPostResult[Context, IS[Z, ErrorCondition]] = transformISZ(preR.ctx, o2.conditions, transformErrorCondition _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(conditions = r0.resultOpt.getOrElse(o2.conditions))))
          else
            TPostResult(r0.ctx, None())
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: ErrorCondition = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, ErrorCondition] = pp.postErrorCondition(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformConditionTrigger(ctx: Context, o: ConditionTrigger): TPostResult[Context, ConditionTrigger] = {
    val preR: PreResult[Context, ConditionTrigger] = pp.preConditionTrigger(ctx, o)
    val r: TPostResult[Context, ConditionTrigger] = if (preR.continu) {
      val o2: ConditionTrigger = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, Name]] = transformISZ(preR.ctx, o2.events, transformName _)
      val r1: TPostResult[Context, IS[Z, Emv2Propagation]] = transformISZ(r0.ctx, o2.propagationPoints, transformEmv2Propagation _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(events = r0.resultOpt.getOrElse(o2.events), propagationPoints = r1.resultOpt.getOrElse(o2.propagationPoints))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: ConditionTrigger = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, ConditionTrigger] = pp.postConditionTrigger(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformAndCondition(ctx: Context, o: AndCondition): TPostResult[Context, AndCondition] = {
    val preR: PreResult[Context, AndCondition] = pp.preAndCondition(ctx, o)
    val r: TPostResult[Context, AndCondition] = if (preR.continu) {
      val o2: AndCondition = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, ErrorCondition]] = transformISZ(preR.ctx, o2.op, transformErrorCondition _)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(op = r0.resultOpt.getOrElse(o2.op))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: AndCondition = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, AndCondition] = pp.postAndCondition(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformOrCondition(ctx: Context, o: OrCondition): TPostResult[Context, OrCondition] = {
    val preR: PreResult[Context, OrCondition] = pp.preOrCondition(ctx, o)
    val r: TPostResult[Context, OrCondition] = if (preR.continu) {
      val o2: OrCondition = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, ErrorCondition]] = transformISZ(preR.ctx, o2.op, transformErrorCondition _)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(op = r0.resultOpt.getOrElse(o2.op))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: OrCondition = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, OrCondition] = pp.postOrCondition(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformAllCondition(ctx: Context, o: AllCondition): TPostResult[Context, AllCondition] = {
    val preR: PreResult[Context, AllCondition] = pp.preAllCondition(ctx, o)
    val r: TPostResult[Context, AllCondition] = if (preR.continu) {
      val o2: AllCondition = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, ErrorCondition]] = transformISZ(preR.ctx, o2.op, transformErrorCondition _)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(op = r0.resultOpt.getOrElse(o2.op))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: AllCondition = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, AllCondition] = pp.postAllCondition(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformOrMoreCondition(ctx: Context, o: OrMoreCondition): TPostResult[Context, OrMoreCondition] = {
    val preR: PreResult[Context, OrMoreCondition] = pp.preOrMoreCondition(ctx, o)
    val r: TPostResult[Context, OrMoreCondition] = if (preR.continu) {
      val o2: OrMoreCondition = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, ErrorCondition]] = transformISZ(preR.ctx, o2.conditions, transformErrorCondition _)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(conditions = r0.resultOpt.getOrElse(o2.conditions))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: OrMoreCondition = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, OrMoreCondition] = pp.postOrMoreCondition(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformOrLessCondition(ctx: Context, o: OrLessCondition): TPostResult[Context, OrLessCondition] = {
    val preR: PreResult[Context, OrLessCondition] = pp.preOrLessCondition(ctx, o)
    val r: TPostResult[Context, OrLessCondition] = if (preR.continu) {
      val o2: OrLessCondition = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, ErrorCondition]] = transformISZ(preR.ctx, o2.conditions, transformErrorCondition _)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(conditions = r0.resultOpt.getOrElse(o2.conditions))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: OrLessCondition = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, OrLessCondition] = pp.postOrLessCondition(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformEmv2Clause(ctx: Context, o: Emv2Clause): TPostResult[Context, Emv2Clause] = {
    val preR: PreResult[Context, Emv2Clause] = pp.preEmv2Clause(ctx, o)
    val r: TPostResult[Context, Emv2Clause] = if (preR.continu) {
      val o2: Emv2Clause = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, Name]] = transformISZ(preR.ctx, o2.libraries, transformName _)
      val r1: TPostResult[Context, IS[Z, Emv2Propagation]] = transformISZ(r0.ctx, o2.propagations, transformEmv2Propagation _)
      val r2: TPostResult[Context, IS[Z, Emv2Flow]] = transformISZ(r1.ctx, o2.flows, transformEmv2Flow _)
      val r3: TPostResult[Context, Option[Emv2BehaviorSection]] = transformOption(r2.ctx, o2.componentBehavior, transformEmv2BehaviorSection _)
      val r4: TPostResult[Context, IS[Z, Property]] = transformISZ(r3.ctx, o2.properties, transformProperty _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
        TPostResult(r4.ctx, Some(o2(libraries = r0.resultOpt.getOrElse(o2.libraries), propagations = r1.resultOpt.getOrElse(o2.propagations), flows = r2.resultOpt.getOrElse(o2.flows), componentBehavior = r3.resultOpt.getOrElse(o2.componentBehavior), properties = r4.resultOpt.getOrElse(o2.properties))))
      else
        TPostResult(r4.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: Emv2Clause = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, Emv2Clause] = pp.postEmv2Clause(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformEmv2Propagation(ctx: Context, o: Emv2Propagation): TPostResult[Context, Emv2Propagation] = {
    val preR: PreResult[Context, Emv2Propagation] = pp.preEmv2Propagation(ctx, o)
    val r: TPostResult[Context, Emv2Propagation] = if (preR.continu) {
      val o2: Emv2Propagation = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.propagationPoint)
      val r1: TPostResult[Context, IS[Z, Name]] = transformISZ(r0.ctx, o2.errorTokens, transformName _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(propagationPoint = r0.resultOpt.getOrElse(o2.propagationPoint), errorTokens = r1.resultOpt.getOrElse(o2.errorTokens))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: Emv2Propagation = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, Emv2Propagation] = pp.postEmv2Propagation(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformEmv2Flow(ctx: Context, o: Emv2Flow): TPostResult[Context, Emv2Flow] = {
    val preR: PreResult[Context, Emv2Flow] = pp.preEmv2Flow(ctx, o)
    val r: TPostResult[Context, Emv2Flow] = if (preR.continu) {
      val o2: Emv2Flow = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.identifier)
      val r1: TPostResult[Context, Option[Emv2Propagation]] = transformOption(r0.ctx, o2.sourcePropagation, transformEmv2Propagation _)
      val r2: TPostResult[Context, Option[Emv2Propagation]] = transformOption(r1.ctx, o2.sinkPropagation, transformEmv2Propagation _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        TPostResult(r2.ctx, Some(o2(identifier = r0.resultOpt.getOrElse(o2.identifier), sourcePropagation = r1.resultOpt.getOrElse(o2.sourcePropagation), sinkPropagation = r2.resultOpt.getOrElse(o2.sinkPropagation))))
      else
        TPostResult(r2.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: Emv2Flow = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, Emv2Flow] = pp.postEmv2Flow(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformEmv2BehaviorSection(ctx: Context, o: Emv2BehaviorSection): TPostResult[Context, Emv2BehaviorSection] = {
    val preR: PreResult[Context, Emv2BehaviorSection] = pp.preEmv2BehaviorSection(ctx, o)
    val r: TPostResult[Context, Emv2BehaviorSection] = if (preR.continu) {
      val o2: Emv2BehaviorSection = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, ErrorEvent]] = transformISZ(preR.ctx, o2.events, transformErrorEvent _)
      val r1: TPostResult[Context, IS[Z, ErrorTransition]] = transformISZ(r0.ctx, o2.transitions, transformErrorTransition _)
      val r2: TPostResult[Context, IS[Z, ErrorPropagation]] = transformISZ(r1.ctx, o2.propagations, transformErrorPropagation _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        TPostResult(r2.ctx, Some(o2(events = r0.resultOpt.getOrElse(o2.events), transitions = r1.resultOpt.getOrElse(o2.transitions), propagations = r2.resultOpt.getOrElse(o2.propagations))))
      else
        TPostResult(r2.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: Emv2BehaviorSection = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, Emv2BehaviorSection] = pp.postEmv2BehaviorSection(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformErrorPropagation(ctx: Context, o: ErrorPropagation): TPostResult[Context, ErrorPropagation] = {
    val preR: PreResult[Context, ErrorPropagation] = pp.preErrorPropagation(ctx, o)
    val r: TPostResult[Context, ErrorPropagation] = if (preR.continu) {
      val o2: ErrorPropagation = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Option[Name]] = transformOption(preR.ctx, o2.id, transformName _)
      val r1: TPostResult[Context, IS[Z, Name]] = transformISZ(r0.ctx, o2.source, transformName _)
      val r2: TPostResult[Context, Option[ErrorCondition]] = transformOption(r1.ctx, o2.condition, transformErrorCondition _)
      val r3: TPostResult[Context, IS[Z, Emv2Propagation]] = transformISZ(r2.ctx, o2.target, transformEmv2Propagation _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
        TPostResult(r3.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), source = r1.resultOpt.getOrElse(o2.source), condition = r2.resultOpt.getOrElse(o2.condition), target = r3.resultOpt.getOrElse(o2.target))))
      else
        TPostResult(r3.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: ErrorPropagation = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, ErrorPropagation] = pp.postErrorPropagation(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformSmfAnnex(ctx: Context, o: SmfAnnex): TPostResult[Context, SmfAnnex] = {
    val preR: PreResult[Context, SmfAnnex] = pp.preSmfAnnex(ctx, o)
    val r: TPostResult[Context, SmfAnnex] = if (preR.continu) {
      val o2: SmfAnnex = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, SmfAnnex] = o2 match {
        case o2: SmfClause =>
          val r0: TPostResult[Context, IS[Z, SmfClassification]] = transformISZ(preR.ctx, o2.classification, transformSmfClassification _)
          val r1: TPostResult[Context, IS[Z, SmfDeclass]] = transformISZ(r0.ctx, o2.declass, transformSmfDeclass _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(classification = r0.resultOpt.getOrElse(o2.classification), declass = r1.resultOpt.getOrElse(o2.declass))))
          else
            TPostResult(r1.ctx, None())
        case o2: SmfClassification =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.portName)
          val r1: TPostResult[Context, Name] = transformName(r0.ctx, o2.typeName)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(portName = r0.resultOpt.getOrElse(o2.portName), typeName = r1.resultOpt.getOrElse(o2.typeName))))
          else
            TPostResult(r1.ctx, None())
        case o2: SmfDeclass =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.flowName)
          val r1: TPostResult[Context, Option[Name]] = transformOption(r0.ctx, o2.srcType, transformName _)
          val r2: TPostResult[Context, Name] = transformName(r1.ctx, o2.snkType)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(flowName = r0.resultOpt.getOrElse(o2.flowName), srcType = r1.resultOpt.getOrElse(o2.srcType), snkType = r2.resultOpt.getOrElse(o2.snkType))))
          else
            TPostResult(r2.ctx, None())
        case o2: SmfType =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.typeName)
          val r1: TPostResult[Context, Option[Name]] = transformOption(r0.ctx, o2.parentType, transformName _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(typeName = r0.resultOpt.getOrElse(o2.typeName), parentType = r1.resultOpt.getOrElse(o2.parentType))))
          else
            TPostResult(r1.ctx, None())
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: SmfAnnex = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, SmfAnnex] = pp.postSmfAnnex(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformSmfLib(ctx: Context, o: SmfLib): TPostResult[Context, SmfLib] = {
    val preR: PreResult[Context, SmfLib] = pp.preSmfLib(ctx, o)
    val r: TPostResult[Context, SmfLib] = if (preR.continu) {
      val o2: SmfLib = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, SmfLib] = o2 match {
        case o2: SmfLibrary =>
          val r0: TPostResult[Context, IS[Z, SmfType]] = transformISZ(preR.ctx, o2.types, transformSmfType _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(types = r0.resultOpt.getOrElse(o2.types))))
          else
            TPostResult(r0.ctx, None())
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: SmfLib = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, SmfLib] = pp.postSmfLib(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformSmfClause(ctx: Context, o: SmfClause): TPostResult[Context, SmfClause] = {
    val preR: PreResult[Context, SmfClause] = pp.preSmfClause(ctx, o)
    val r: TPostResult[Context, SmfClause] = if (preR.continu) {
      val o2: SmfClause = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, SmfClassification]] = transformISZ(preR.ctx, o2.classification, transformSmfClassification _)
      val r1: TPostResult[Context, IS[Z, SmfDeclass]] = transformISZ(r0.ctx, o2.declass, transformSmfDeclass _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(classification = r0.resultOpt.getOrElse(o2.classification), declass = r1.resultOpt.getOrElse(o2.declass))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: SmfClause = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, SmfClause] = pp.postSmfClause(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformSmfClassification(ctx: Context, o: SmfClassification): TPostResult[Context, SmfClassification] = {
    val preR: PreResult[Context, SmfClassification] = pp.preSmfClassification(ctx, o)
    val r: TPostResult[Context, SmfClassification] = if (preR.continu) {
      val o2: SmfClassification = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.portName)
      val r1: TPostResult[Context, Name] = transformName(r0.ctx, o2.typeName)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(portName = r0.resultOpt.getOrElse(o2.portName), typeName = r1.resultOpt.getOrElse(o2.typeName))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: SmfClassification = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, SmfClassification] = pp.postSmfClassification(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformSmfDeclass(ctx: Context, o: SmfDeclass): TPostResult[Context, SmfDeclass] = {
    val preR: PreResult[Context, SmfDeclass] = pp.preSmfDeclass(ctx, o)
    val r: TPostResult[Context, SmfDeclass] = if (preR.continu) {
      val o2: SmfDeclass = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.flowName)
      val r1: TPostResult[Context, Option[Name]] = transformOption(r0.ctx, o2.srcType, transformName _)
      val r2: TPostResult[Context, Name] = transformName(r1.ctx, o2.snkType)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        TPostResult(r2.ctx, Some(o2(flowName = r0.resultOpt.getOrElse(o2.flowName), srcType = r1.resultOpt.getOrElse(o2.srcType), snkType = r2.resultOpt.getOrElse(o2.snkType))))
      else
        TPostResult(r2.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: SmfDeclass = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, SmfDeclass] = pp.postSmfDeclass(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformSmfLibrary(ctx: Context, o: SmfLibrary): TPostResult[Context, SmfLibrary] = {
    val preR: PreResult[Context, SmfLibrary] = pp.preSmfLibrary(ctx, o)
    val r: TPostResult[Context, SmfLibrary] = if (preR.continu) {
      val o2: SmfLibrary = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, SmfType]] = transformISZ(preR.ctx, o2.types, transformSmfType _)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(types = r0.resultOpt.getOrElse(o2.types))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: SmfLibrary = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, SmfLibrary] = pp.postSmfLibrary(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformSmfType(ctx: Context, o: SmfType): TPostResult[Context, SmfType] = {
    val preR: PreResult[Context, SmfType] = pp.preSmfType(ctx, o)
    val r: TPostResult[Context, SmfType] = if (preR.continu) {
      val o2: SmfType = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.typeName)
      val r1: TPostResult[Context, Option[Name]] = transformOption(r0.ctx, o2.parentType, transformName _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(typeName = r0.resultOpt.getOrElse(o2.typeName), parentType = r1.resultOpt.getOrElse(o2.parentType))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: SmfType = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, SmfType] = pp.postSmfType(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformOtherAnnex(ctx: Context, o: OtherAnnex): TPostResult[Context, OtherAnnex] = {
    val preR: PreResult[Context, OtherAnnex] = pp.preOtherAnnex(ctx, o)
    val r: TPostResult[Context, OtherAnnex] = if (preR.continu) {
      val o2: OtherAnnex = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      if (hasChanged)
        TPostResult(preR.ctx, Some(o2))
      else
        TPostResult(preR.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: OtherAnnex = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, OtherAnnex] = pp.postOtherAnnex(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformUnitProp(ctx: Context, o: UnitProp): TPostResult[Context, UnitProp] = {
    val preR: PreResult[Context, UnitProp] = pp.preUnitProp(ctx, o) match {
     case PreResult(preCtx, continu, Some(r: UnitProp)) => PreResult(preCtx, continu, Some[UnitProp](r))
     case PreResult(_, _, Some(_)) => halt("Can only produce object of type UnitProp")
     case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[UnitProp]())
    }
    val r: TPostResult[Context, UnitProp] = if (preR.continu) {
      val o2: UnitProp = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      if (hasChanged)
        TPostResult(preR.ctx, Some(o2))
      else
        TPostResult(preR.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: UnitProp = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, UnitProp] = pp.postUnitProp(r.ctx, o2) match {
     case TPostResult(postCtx, Some(result: UnitProp)) => TPostResult(postCtx, Some[UnitProp](result))
     case TPostResult(_, Some(_)) => halt("Can only produce object of type UnitProp")
     case TPostResult(postCtx, _) => TPostResult(postCtx, None[UnitProp]())
    }
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

}