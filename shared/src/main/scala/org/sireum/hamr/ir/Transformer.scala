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

// This file is auto-generated from BlessAST.scala

// This file is auto-generated from Emv2AST.scala

// This file is auto-generated from SmfAST.scala

package org.sireum.hamr.ir

import org.sireum._

object Transformer {

  @datatype class PreResult[Context, T](ctx: Context,
                                        continu: B,
                                        resultOpt: Option[T])

  @datatype class TPostResult[Context, T](ctx: Context,
                                     resultOpt: Option[T])

  @sig trait PrePost[Context] {

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

    @pure def preAadlInstInfo(ctx: Context, o: AadlInstInfo): PreResult[Context, AadlInstInfo] = {
      o match {
        case o: Component =>
          val r: PreResult[Context, AadlInstInfo] = preComponent(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: AadlInstInfo)) => PreResult(preCtx, continu, Some[AadlInstInfo](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type AadlInstInfo")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AadlInstInfo]())
          }
          return r
        case o: ErrorTypeDef =>
          val r: PreResult[Context, AadlInstInfo] = preErrorTypeDef(ctx, o) match {
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
        case o: Emv2Flow =>
          val r: PreResult[Context, AadlInstInfo] = preEmv2Flow(ctx, o) match {
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

    @pure def preAadl(ctx: Context, o: Aadl): PreResult[Context, Aadl] = {
      return PreResult(ctx, T, None())
    }

    @pure def preEmv2ElementRef(ctx: Context, o: Emv2ElementRef): PreResult[Context, Emv2ElementRef] = {
      return PreResult(ctx, T, None())
    }

    @pure def preName(ctx: Context, o: Name): PreResult[Context, Name] = {
      return PreResult(ctx, T, None())
    }

    @pure def preComponent(ctx: Context, o: Component): PreResult[Context, Component] = {
      return PreResult(ctx, T, None())
    }

    @pure def preEmv2Library(ctx: Context, o: Emv2Library): PreResult[Context, Emv2Library] = {
      return PreResult(ctx, T, None())
    }

    @pure def preErrorTypeDef(ctx: Context, o: ErrorTypeDef): PreResult[Context, ErrorTypeDef] = {
      return PreResult(ctx, T, None())
    }

    @pure def preClassifier(ctx: Context, o: Classifier): PreResult[Context, Classifier] = {
      return PreResult(ctx, T, None())
    }

    @pure def preErrorAliasDef(ctx: Context, o: ErrorAliasDef): PreResult[Context, ErrorAliasDef] = {
      return PreResult(ctx, T, None())
    }

    @pure def preErrorTypeSetDef(ctx: Context, o: ErrorTypeSetDef): PreResult[Context, ErrorTypeSetDef] = {
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

    @pure def preBehaveStateMachine(ctx: Context, o: BehaveStateMachine): PreResult[Context, BehaveStateMachine] = {
      return PreResult(ctx, T, None())
    }

    @pure def preFeatureEnd(ctx: Context, o: FeatureEnd): PreResult[Context, FeatureEnd] = {
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

    @pure def preFeatureGroup(ctx: Context, o: FeatureGroup): PreResult[Context, FeatureGroup] = {
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

    @pure def preFeatureAccess(ctx: Context, o: FeatureAccess): PreResult[Context, FeatureAccess] = {
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

    @pure def preConnection(ctx: Context, o: Connection): PreResult[Context, Connection] = {
      return PreResult(ctx, T, None())
    }

    @pure def preEmv2Flow(ctx: Context, o: Emv2Flow): PreResult[Context, Emv2Flow] = {
      return PreResult(ctx, T, None())
    }

    @pure def preEmv2BehaviorSection(ctx: Context, o: Emv2BehaviorSection): PreResult[Context, Emv2BehaviorSection] = {
      return PreResult(ctx, T, None())
    }

    @pure def preConnectionInstance(ctx: Context, o: ConnectionInstance): PreResult[Context, ConnectionInstance] = {
      return PreResult(ctx, T, None())
    }

    @pure def preErrorPropagation(ctx: Context, o: ErrorPropagation): PreResult[Context, ErrorPropagation] = {
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
        case o: Emv2ElementRef =>
          val r: PreResult[Context, ElementRef] = preEmv2ElementRef(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: ElementRef)) => PreResult(preCtx, continu, Some[ElementRef](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type ElementRef")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[ElementRef]())
          }
          return r
        case o: AadlElementRef =>
          val r: PreResult[Context, ElementRef] = preAadlElementRef(ctx, o) match {
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
        case o: OtherAnnex =>
          val r: PreResult[Context, AnnexClause] = preOtherAnnex(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: AnnexClause)) => PreResult(preCtx, continu, Some[AnnexClause](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type AnnexClause")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AnnexClause]())
          }
          return r
        case o: BTSBLESSAnnexClause =>
          val r: PreResult[Context, AnnexClause] = preBTSBLESSAnnexClause(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: AnnexClause)) => PreResult(preCtx, continu, Some[AnnexClause](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type AnnexClause")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AnnexClause]())
          }
          return r
        case o: BTSActionAnnexSubclause =>
          val r: PreResult[Context, AnnexClause] = preBTSActionAnnexSubclause(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: AnnexClause)) => PreResult(preCtx, continu, Some[AnnexClause](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type AnnexClause")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AnnexClause]())
          }
          return r
      }
    }

    @pure def preAnnexLib(ctx: Context, o: AnnexLib): PreResult[Context, AnnexLib] = {
      o match {
        case o: SmfLibrary =>
          val r: PreResult[Context, AnnexLib] = preSmfLibrary(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: AnnexLib)) => PreResult(preCtx, continu, Some[AnnexLib](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type AnnexLib")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AnnexLib]())
          }
          return r
        case o: Emv2Library =>
          val r: PreResult[Context, AnnexLib] = preEmv2Library(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: AnnexLib)) => PreResult(preCtx, continu, Some[AnnexLib](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type AnnexLib")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AnnexLib]())
          }
          return r
        case o: OtherLib =>
          val r: PreResult[Context, AnnexLib] = preOtherLib(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: AnnexLib)) => PreResult(preCtx, continu, Some[AnnexLib](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type AnnexLib")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AnnexLib]())
          }
          return r
        case o: BTSTypeLibrary =>
          val r: PreResult[Context, AnnexLib] = preBTSTypeLibrary(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: AnnexLib)) => PreResult(preCtx, continu, Some[AnnexLib](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type AnnexLib")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AnnexLib]())
          }
          return r
        case o: BTSUnitLibrary =>
          val r: PreResult[Context, AnnexLib] = preBTSUnitLibrary(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: AnnexLib)) => PreResult(preCtx, continu, Some[AnnexLib](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type AnnexLib")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AnnexLib]())
          }
          return r
        case o: BTSExceptionLibrary =>
          val r: PreResult[Context, AnnexLib] = preBTSExceptionLibrary(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: AnnexLib)) => PreResult(preCtx, continu, Some[AnnexLib](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type AnnexLib")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[AnnexLib]())
          }
          return r
      }
    }

    @pure def preOtherAnnex(ctx: Context, o: OtherAnnex): PreResult[Context, OtherAnnex] = {
      return PreResult(ctx, T, None())
    }

    @pure def preOtherLib(ctx: Context, o: OtherLib): PreResult[Context, OtherLib] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBLESSAnnex(ctx: Context, o: BLESSAnnex): PreResult[Context, BLESSAnnex] = {
      o match {
        case o: BTSBLESSAnnexClause =>
          val r: PreResult[Context, BLESSAnnex] = preBTSBLESSAnnexClause(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BLESSAnnex)) => PreResult(preCtx, continu, Some[BLESSAnnex](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BLESSAnnex")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BLESSAnnex]())
          }
          return r
        case o: BTSActionAnnexSubclause =>
          val r: PreResult[Context, BLESSAnnex] = preBTSActionAnnexSubclause(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BLESSAnnex)) => PreResult(preCtx, continu, Some[BLESSAnnex](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BLESSAnnex")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BLESSAnnex]())
          }
          return r
      }
    }

    @pure def preBTSBLESSAnnexClause(ctx: Context, o: BTSBLESSAnnexClause): PreResult[Context, BTSBLESSAnnexClause] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSVariableDeclaration(ctx: Context, o: BTSVariableDeclaration): PreResult[Context, BTSVariableDeclaration] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSStateDeclaration(ctx: Context, o: BTSStateDeclaration): PreResult[Context, BTSStateDeclaration] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSTransition(ctx: Context, o: BTSTransition): PreResult[Context, BTSTransition] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSTransitionLabel(ctx: Context, o: BTSTransitionLabel): PreResult[Context, BTSTransitionLabel] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSTransitionCondition(ctx: Context, o: BTSTransitionCondition): PreResult[Context, BTSTransitionCondition] = {
      o match {
        case o: BTSDispatchCondition =>
          val r: PreResult[Context, BTSTransitionCondition] = preBTSDispatchCondition(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSTransitionCondition)) => PreResult(preCtx, continu, Some[BTSTransitionCondition](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSTransitionCondition")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSTransitionCondition]())
          }
          return r
        case o: BTSExecuteConditionExp =>
          val r: PreResult[Context, BTSTransitionCondition] = preBTSExecuteConditionExp(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSTransitionCondition)) => PreResult(preCtx, continu, Some[BTSTransitionCondition](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSTransitionCondition")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSTransitionCondition]())
          }
          return r
        case o: BTSExecuteConditionTimeout =>
          val r: PreResult[Context, BTSTransitionCondition] = preBTSExecuteConditionTimeout(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSTransitionCondition)) => PreResult(preCtx, continu, Some[BTSTransitionCondition](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSTransitionCondition")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSTransitionCondition]())
          }
          return r
        case o: BTSExecuteConditionOtherwise =>
          val r: PreResult[Context, BTSTransitionCondition] = preBTSExecuteConditionOtherwise(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSTransitionCondition)) => PreResult(preCtx, continu, Some[BTSTransitionCondition](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSTransitionCondition")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSTransitionCondition]())
          }
          return r
        case o: BTSModeCondition =>
          val r: PreResult[Context, BTSTransitionCondition] = preBTSModeCondition(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSTransitionCondition)) => PreResult(preCtx, continu, Some[BTSTransitionCondition](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSTransitionCondition")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSTransitionCondition]())
          }
          return r
        case o: BTSInternalCondition =>
          val r: PreResult[Context, BTSTransitionCondition] = preBTSInternalCondition(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSTransitionCondition)) => PreResult(preCtx, continu, Some[BTSTransitionCondition](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSTransitionCondition")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSTransitionCondition]())
          }
          return r
      }
    }

    @pure def preBTSDispatchCondition(ctx: Context, o: BTSDispatchCondition): PreResult[Context, BTSDispatchCondition] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSDispatchConjunction(ctx: Context, o: BTSDispatchConjunction): PreResult[Context, BTSDispatchConjunction] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSDispatchTrigger(ctx: Context, o: BTSDispatchTrigger): PreResult[Context, BTSDispatchTrigger] = {
      o match {
        case o: BTSDispatchTriggerStop =>
          val r: PreResult[Context, BTSDispatchTrigger] = preBTSDispatchTriggerStop(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSDispatchTrigger)) => PreResult(preCtx, continu, Some[BTSDispatchTrigger](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSDispatchTrigger")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSDispatchTrigger]())
          }
          return r
        case o: BTSDispatchTriggerPort =>
          val r: PreResult[Context, BTSDispatchTrigger] = preBTSDispatchTriggerPort(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSDispatchTrigger)) => PreResult(preCtx, continu, Some[BTSDispatchTrigger](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSDispatchTrigger")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSDispatchTrigger]())
          }
          return r
        case o: BTSDispatchTriggerTimeout =>
          val r: PreResult[Context, BTSDispatchTrigger] = preBTSDispatchTriggerTimeout(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSDispatchTrigger)) => PreResult(preCtx, continu, Some[BTSDispatchTrigger](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSDispatchTrigger")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSDispatchTrigger]())
          }
          return r
      }
    }

    @pure def preBTSDispatchTriggerStop(ctx: Context, o: BTSDispatchTriggerStop): PreResult[Context, BTSDispatchTriggerStop] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSDispatchTriggerPort(ctx: Context, o: BTSDispatchTriggerPort): PreResult[Context, BTSDispatchTriggerPort] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSDispatchTriggerTimeout(ctx: Context, o: BTSDispatchTriggerTimeout): PreResult[Context, BTSDispatchTriggerTimeout] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSExecuteCondition(ctx: Context, o: BTSExecuteCondition): PreResult[Context, BTSExecuteCondition] = {
      o match {
        case o: BTSExecuteConditionExp =>
          val r: PreResult[Context, BTSExecuteCondition] = preBTSExecuteConditionExp(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSExecuteCondition)) => PreResult(preCtx, continu, Some[BTSExecuteCondition](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSExecuteCondition")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSExecuteCondition]())
          }
          return r
        case o: BTSExecuteConditionTimeout =>
          val r: PreResult[Context, BTSExecuteCondition] = preBTSExecuteConditionTimeout(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSExecuteCondition)) => PreResult(preCtx, continu, Some[BTSExecuteCondition](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSExecuteCondition")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSExecuteCondition]())
          }
          return r
        case o: BTSExecuteConditionOtherwise =>
          val r: PreResult[Context, BTSExecuteCondition] = preBTSExecuteConditionOtherwise(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSExecuteCondition)) => PreResult(preCtx, continu, Some[BTSExecuteCondition](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSExecuteCondition")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSExecuteCondition]())
          }
          return r
      }
    }

    @pure def preBTSExecuteConditionExp(ctx: Context, o: BTSExecuteConditionExp): PreResult[Context, BTSExecuteConditionExp] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSExecuteConditionTimeout(ctx: Context, o: BTSExecuteConditionTimeout): PreResult[Context, BTSExecuteConditionTimeout] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSExecuteConditionOtherwise(ctx: Context, o: BTSExecuteConditionOtherwise): PreResult[Context, BTSExecuteConditionOtherwise] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSModeCondition(ctx: Context, o: BTSModeCondition): PreResult[Context, BTSModeCondition] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSTriggerLogicalExpression(ctx: Context, o: BTSTriggerLogicalExpression): PreResult[Context, BTSTriggerLogicalExpression] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSEventTrigger(ctx: Context, o: BTSEventTrigger): PreResult[Context, BTSEventTrigger] = {
      o match {
        case o: BTSTriggerLogicalExpression =>
          val r: PreResult[Context, BTSEventTrigger] = preBTSTriggerLogicalExpression(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSEventTrigger)) => PreResult(preCtx, continu, Some[BTSEventTrigger](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSEventTrigger")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSEventTrigger]())
          }
          return r
        case o: BTSSubcomponentPort =>
          val r: PreResult[Context, BTSEventTrigger] = preBTSSubcomponentPort(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSEventTrigger)) => PreResult(preCtx, continu, Some[BTSEventTrigger](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSEventTrigger")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSEventTrigger]())
          }
          return r
      }
    }

    @pure def preBTSSubcomponentPort(ctx: Context, o: BTSSubcomponentPort): PreResult[Context, BTSSubcomponentPort] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSInternalCondition(ctx: Context, o: BTSInternalCondition): PreResult[Context, BTSInternalCondition] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSAssertion(ctx: Context, o: BTSAssertion): PreResult[Context, BTSAssertion] = {
      o match {
        case o: BTSNamedAssertion =>
          val r: PreResult[Context, BTSAssertion] = preBTSNamedAssertion(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSAssertion)) => PreResult(preCtx, continu, Some[BTSAssertion](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSAssertion")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSAssertion]())
          }
          return r
        case o: BTSNamedFunction =>
          val r: PreResult[Context, BTSAssertion] = preBTSNamedFunction(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSAssertion)) => PreResult(preCtx, continu, Some[BTSAssertion](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSAssertion")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSAssertion]())
          }
          return r
        case o: BTSNamedEnumeration =>
          val r: PreResult[Context, BTSAssertion] = preBTSNamedEnumeration(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSAssertion)) => PreResult(preCtx, continu, Some[BTSAssertion](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSAssertion")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSAssertion]())
          }
          return r
        case o: BTSNamelessAssertion =>
          val r: PreResult[Context, BTSAssertion] = preBTSNamelessAssertion(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSAssertion)) => PreResult(preCtx, continu, Some[BTSAssertion](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSAssertion")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSAssertion]())
          }
          return r
        case o: BTSNamelessFunction =>
          val r: PreResult[Context, BTSAssertion] = preBTSNamelessFunction(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSAssertion)) => PreResult(preCtx, continu, Some[BTSAssertion](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSAssertion")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSAssertion]())
          }
          return r
        case o: BTSNamelessEnumeration =>
          val r: PreResult[Context, BTSAssertion] = preBTSNamelessEnumeration(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSAssertion)) => PreResult(preCtx, continu, Some[BTSAssertion](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSAssertion")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSAssertion]())
          }
          return r
      }
    }

    @pure def preBTSNamedAssertion(ctx: Context, o: BTSNamedAssertion): PreResult[Context, BTSNamedAssertion] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSNamedFunction(ctx: Context, o: BTSNamedFunction): PreResult[Context, BTSNamedFunction] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSNamedEnumeration(ctx: Context, o: BTSNamedEnumeration): PreResult[Context, BTSNamedEnumeration] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSNamelessAssertion(ctx: Context, o: BTSNamelessAssertion): PreResult[Context, BTSNamelessAssertion] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSNamelessFunction(ctx: Context, o: BTSNamelessFunction): PreResult[Context, BTSNamelessFunction] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSNamelessEnumeration(ctx: Context, o: BTSNamelessEnumeration): PreResult[Context, BTSNamelessEnumeration] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSAssertionEnumeration(ctx: Context, o: BTSAssertionEnumeration): PreResult[Context, BTSAssertionEnumeration] = {
      o match {
        case o: BTSEnumerationPairs =>
          val r: PreResult[Context, BTSAssertionEnumeration] = preBTSEnumerationPairs(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSAssertionEnumeration)) => PreResult(preCtx, continu, Some[BTSAssertionEnumeration](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSAssertionEnumeration")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSAssertionEnumeration]())
          }
          return r
        case o: BTSInvocation =>
          val r: PreResult[Context, BTSAssertionEnumeration] = preBTSInvocation(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSAssertionEnumeration)) => PreResult(preCtx, continu, Some[BTSAssertionEnumeration](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSAssertionEnumeration")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSAssertionEnumeration]())
          }
          return r
      }
    }

    @pure def preBTSEnumerationPairs(ctx: Context, o: BTSEnumerationPairs): PreResult[Context, BTSEnumerationPairs] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSEnumerationPair(ctx: Context, o: BTSEnumerationPair): PreResult[Context, BTSEnumerationPair] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSInvocation(ctx: Context, o: BTSInvocation): PreResult[Context, BTSInvocation] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSActualParameter(ctx: Context, o: BTSActualParameter): PreResult[Context, BTSActualParameter] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSVariable(ctx: Context, o: BTSVariable): PreResult[Context, BTSVariable] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSActionAnnexSubclause(ctx: Context, o: BTSActionAnnexSubclause): PreResult[Context, BTSActionAnnexSubclause] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSBehaviorActions(ctx: Context, o: BTSBehaviorActions): PreResult[Context, BTSBehaviorActions] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSAssertedAction(ctx: Context, o: BTSAssertedAction): PreResult[Context, BTSAssertedAction] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSAction(ctx: Context, o: BTSAction): PreResult[Context, BTSAction] = {
      o match {
        case o: BTSSkipAction =>
          val r: PreResult[Context, BTSAction] = preBTSSkipAction(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSAction)) => PreResult(preCtx, continu, Some[BTSAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSAction]())
          }
          return r
        case o: BTSAssignmentAction =>
          val r: PreResult[Context, BTSAction] = preBTSAssignmentAction(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSAction)) => PreResult(preCtx, continu, Some[BTSAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSAction]())
          }
          return r
        case o: BTSSetMode =>
          val r: PreResult[Context, BTSAction] = preBTSSetMode(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSAction)) => PreResult(preCtx, continu, Some[BTSAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSAction]())
          }
          return r
        case o: BTSWhenThrow =>
          val r: PreResult[Context, BTSAction] = preBTSWhenThrow(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSAction)) => PreResult(preCtx, continu, Some[BTSAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSAction]())
          }
          return r
        case o: BTSFetchAdd =>
          val r: PreResult[Context, BTSAction] = preBTSFetchAdd(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSAction)) => PreResult(preCtx, continu, Some[BTSAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSAction]())
          }
          return r
        case o: BTSFetchOr =>
          val r: PreResult[Context, BTSAction] = preBTSFetchOr(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSAction)) => PreResult(preCtx, continu, Some[BTSAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSAction]())
          }
          return r
        case o: BTSFetchAnd =>
          val r: PreResult[Context, BTSAction] = preBTSFetchAnd(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSAction)) => PreResult(preCtx, continu, Some[BTSAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSAction]())
          }
          return r
        case o: BTSFetchXor =>
          val r: PreResult[Context, BTSAction] = preBTSFetchXor(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSAction)) => PreResult(preCtx, continu, Some[BTSAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSAction]())
          }
          return r
        case o: BTSSwap =>
          val r: PreResult[Context, BTSAction] = preBTSSwap(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSAction)) => PreResult(preCtx, continu, Some[BTSAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSAction]())
          }
          return r
        case o: BTSSubprogramCallAction =>
          val r: PreResult[Context, BTSAction] = preBTSSubprogramCallAction(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSAction)) => PreResult(preCtx, continu, Some[BTSAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSAction]())
          }
          return r
        case o: BTSPortOutput =>
          val r: PreResult[Context, BTSAction] = preBTSPortOutput(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSAction)) => PreResult(preCtx, continu, Some[BTSAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSAction]())
          }
          return r
        case o: BTSPortInput =>
          val r: PreResult[Context, BTSAction] = preBTSPortInput(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSAction)) => PreResult(preCtx, continu, Some[BTSAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSAction]())
          }
          return r
        case o: BTSFrozenPortAction =>
          val r: PreResult[Context, BTSAction] = preBTSFrozenPortAction(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSAction)) => PreResult(preCtx, continu, Some[BTSAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSAction]())
          }
          return r
        case o: BTSPause =>
          val r: PreResult[Context, BTSAction] = preBTSPause(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSAction)) => PreResult(preCtx, continu, Some[BTSAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSAction]())
          }
          return r
        case o: BTSIfBLESSAction =>
          val r: PreResult[Context, BTSAction] = preBTSIfBLESSAction(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSAction)) => PreResult(preCtx, continu, Some[BTSAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSAction]())
          }
          return r
        case o: BTSIfBAAction =>
          val r: PreResult[Context, BTSAction] = preBTSIfBAAction(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSAction)) => PreResult(preCtx, continu, Some[BTSAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSAction]())
          }
          return r
        case o: BTSWhileLoop =>
          val r: PreResult[Context, BTSAction] = preBTSWhileLoop(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSAction)) => PreResult(preCtx, continu, Some[BTSAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSAction]())
          }
          return r
        case o: BTSForLoop =>
          val r: PreResult[Context, BTSAction] = preBTSForLoop(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSAction)) => PreResult(preCtx, continu, Some[BTSAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSAction]())
          }
          return r
        case o: BTSDoUntilLoop =>
          val r: PreResult[Context, BTSAction] = preBTSDoUntilLoop(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSAction)) => PreResult(preCtx, continu, Some[BTSAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSAction]())
          }
          return r
        case o: BTSExistentialLatticeQuantification =>
          val r: PreResult[Context, BTSAction] = preBTSExistentialLatticeQuantification(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSAction)) => PreResult(preCtx, continu, Some[BTSAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSAction]())
          }
          return r
        case o: BTSUniversalLatticeQuantification =>
          val r: PreResult[Context, BTSAction] = preBTSUniversalLatticeQuantification(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSAction)) => PreResult(preCtx, continu, Some[BTSAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSAction]())
          }
          return r
      }
    }

    @pure def preBTSBasicAction(ctx: Context, o: BTSBasicAction): PreResult[Context, BTSBasicAction] = {
      o match {
        case o: BTSSkipAction =>
          val r: PreResult[Context, BTSBasicAction] = preBTSSkipAction(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSBasicAction)) => PreResult(preCtx, continu, Some[BTSBasicAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSBasicAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSBasicAction]())
          }
          return r
        case o: BTSAssignmentAction =>
          val r: PreResult[Context, BTSBasicAction] = preBTSAssignmentAction(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSBasicAction)) => PreResult(preCtx, continu, Some[BTSBasicAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSBasicAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSBasicAction]())
          }
          return r
        case o: BTSSetMode =>
          val r: PreResult[Context, BTSBasicAction] = preBTSSetMode(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSBasicAction)) => PreResult(preCtx, continu, Some[BTSBasicAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSBasicAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSBasicAction]())
          }
          return r
        case o: BTSWhenThrow =>
          val r: PreResult[Context, BTSBasicAction] = preBTSWhenThrow(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSBasicAction)) => PreResult(preCtx, continu, Some[BTSBasicAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSBasicAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSBasicAction]())
          }
          return r
        case o: BTSFetchAdd =>
          val r: PreResult[Context, BTSBasicAction] = preBTSFetchAdd(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSBasicAction)) => PreResult(preCtx, continu, Some[BTSBasicAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSBasicAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSBasicAction]())
          }
          return r
        case o: BTSFetchOr =>
          val r: PreResult[Context, BTSBasicAction] = preBTSFetchOr(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSBasicAction)) => PreResult(preCtx, continu, Some[BTSBasicAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSBasicAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSBasicAction]())
          }
          return r
        case o: BTSFetchAnd =>
          val r: PreResult[Context, BTSBasicAction] = preBTSFetchAnd(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSBasicAction)) => PreResult(preCtx, continu, Some[BTSBasicAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSBasicAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSBasicAction]())
          }
          return r
        case o: BTSFetchXor =>
          val r: PreResult[Context, BTSBasicAction] = preBTSFetchXor(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSBasicAction)) => PreResult(preCtx, continu, Some[BTSBasicAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSBasicAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSBasicAction]())
          }
          return r
        case o: BTSSwap =>
          val r: PreResult[Context, BTSBasicAction] = preBTSSwap(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSBasicAction)) => PreResult(preCtx, continu, Some[BTSBasicAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSBasicAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSBasicAction]())
          }
          return r
        case o: BTSSubprogramCallAction =>
          val r: PreResult[Context, BTSBasicAction] = preBTSSubprogramCallAction(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSBasicAction)) => PreResult(preCtx, continu, Some[BTSBasicAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSBasicAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSBasicAction]())
          }
          return r
        case o: BTSPortOutput =>
          val r: PreResult[Context, BTSBasicAction] = preBTSPortOutput(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSBasicAction)) => PreResult(preCtx, continu, Some[BTSBasicAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSBasicAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSBasicAction]())
          }
          return r
        case o: BTSPortInput =>
          val r: PreResult[Context, BTSBasicAction] = preBTSPortInput(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSBasicAction)) => PreResult(preCtx, continu, Some[BTSBasicAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSBasicAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSBasicAction]())
          }
          return r
        case o: BTSFrozenPortAction =>
          val r: PreResult[Context, BTSBasicAction] = preBTSFrozenPortAction(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSBasicAction)) => PreResult(preCtx, continu, Some[BTSBasicAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSBasicAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSBasicAction]())
          }
          return r
        case o: BTSPause =>
          val r: PreResult[Context, BTSBasicAction] = preBTSPause(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSBasicAction)) => PreResult(preCtx, continu, Some[BTSBasicAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSBasicAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSBasicAction]())
          }
          return r
      }
    }

    @pure def preBTSSkipAction(ctx: Context, o: BTSSkipAction): PreResult[Context, BTSSkipAction] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSAssignmentAction(ctx: Context, o: BTSAssignmentAction): PreResult[Context, BTSAssignmentAction] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSSetMode(ctx: Context, o: BTSSetMode): PreResult[Context, BTSSetMode] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSWhenThrow(ctx: Context, o: BTSWhenThrow): PreResult[Context, BTSWhenThrow] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSCombinableOperation(ctx: Context, o: BTSCombinableOperation): PreResult[Context, BTSCombinableOperation] = {
      o match {
        case o: BTSFetchAdd =>
          val r: PreResult[Context, BTSCombinableOperation] = preBTSFetchAdd(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSCombinableOperation)) => PreResult(preCtx, continu, Some[BTSCombinableOperation](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSCombinableOperation")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSCombinableOperation]())
          }
          return r
        case o: BTSFetchOr =>
          val r: PreResult[Context, BTSCombinableOperation] = preBTSFetchOr(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSCombinableOperation)) => PreResult(preCtx, continu, Some[BTSCombinableOperation](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSCombinableOperation")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSCombinableOperation]())
          }
          return r
        case o: BTSFetchAnd =>
          val r: PreResult[Context, BTSCombinableOperation] = preBTSFetchAnd(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSCombinableOperation)) => PreResult(preCtx, continu, Some[BTSCombinableOperation](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSCombinableOperation")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSCombinableOperation]())
          }
          return r
        case o: BTSFetchXor =>
          val r: PreResult[Context, BTSCombinableOperation] = preBTSFetchXor(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSCombinableOperation)) => PreResult(preCtx, continu, Some[BTSCombinableOperation](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSCombinableOperation")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSCombinableOperation]())
          }
          return r
        case o: BTSSwap =>
          val r: PreResult[Context, BTSCombinableOperation] = preBTSSwap(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSCombinableOperation)) => PreResult(preCtx, continu, Some[BTSCombinableOperation](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSCombinableOperation")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSCombinableOperation]())
          }
          return r
      }
    }

    @pure def preBTSFetchAdd(ctx: Context, o: BTSFetchAdd): PreResult[Context, BTSFetchAdd] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSFetchOr(ctx: Context, o: BTSFetchOr): PreResult[Context, BTSFetchOr] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSFetchAnd(ctx: Context, o: BTSFetchAnd): PreResult[Context, BTSFetchAnd] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSFetchXor(ctx: Context, o: BTSFetchXor): PreResult[Context, BTSFetchXor] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSSwap(ctx: Context, o: BTSSwap): PreResult[Context, BTSSwap] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSCommunicationAction(ctx: Context, o: BTSCommunicationAction): PreResult[Context, BTSCommunicationAction] = {
      o match {
        case o: BTSSubprogramCallAction =>
          val r: PreResult[Context, BTSCommunicationAction] = preBTSSubprogramCallAction(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSCommunicationAction)) => PreResult(preCtx, continu, Some[BTSCommunicationAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSCommunicationAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSCommunicationAction]())
          }
          return r
        case o: BTSPortOutput =>
          val r: PreResult[Context, BTSCommunicationAction] = preBTSPortOutput(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSCommunicationAction)) => PreResult(preCtx, continu, Some[BTSCommunicationAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSCommunicationAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSCommunicationAction]())
          }
          return r
        case o: BTSPortInput =>
          val r: PreResult[Context, BTSCommunicationAction] = preBTSPortInput(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSCommunicationAction)) => PreResult(preCtx, continu, Some[BTSCommunicationAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSCommunicationAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSCommunicationAction]())
          }
          return r
        case o: BTSFrozenPortAction =>
          val r: PreResult[Context, BTSCommunicationAction] = preBTSFrozenPortAction(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSCommunicationAction)) => PreResult(preCtx, continu, Some[BTSCommunicationAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSCommunicationAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSCommunicationAction]())
          }
          return r
        case o: BTSPause =>
          val r: PreResult[Context, BTSCommunicationAction] = preBTSPause(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSCommunicationAction)) => PreResult(preCtx, continu, Some[BTSCommunicationAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSCommunicationAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSCommunicationAction]())
          }
          return r
      }
    }

    @pure def preBTSSubprogramCallAction(ctx: Context, o: BTSSubprogramCallAction): PreResult[Context, BTSSubprogramCallAction] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSFormalActual(ctx: Context, o: BTSFormalActual): PreResult[Context, BTSFormalActual] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSPortOutput(ctx: Context, o: BTSPortOutput): PreResult[Context, BTSPortOutput] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSPortInput(ctx: Context, o: BTSPortInput): PreResult[Context, BTSPortInput] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSFrozenPortAction(ctx: Context, o: BTSFrozenPortAction): PreResult[Context, BTSFrozenPortAction] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSPause(ctx: Context, o: BTSPause): PreResult[Context, BTSPause] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSControlAction(ctx: Context, o: BTSControlAction): PreResult[Context, BTSControlAction] = {
      o match {
        case o: BTSIfBLESSAction =>
          val r: PreResult[Context, BTSControlAction] = preBTSIfBLESSAction(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSControlAction)) => PreResult(preCtx, continu, Some[BTSControlAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSControlAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSControlAction]())
          }
          return r
        case o: BTSIfBAAction =>
          val r: PreResult[Context, BTSControlAction] = preBTSIfBAAction(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSControlAction)) => PreResult(preCtx, continu, Some[BTSControlAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSControlAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSControlAction]())
          }
          return r
        case o: BTSWhileLoop =>
          val r: PreResult[Context, BTSControlAction] = preBTSWhileLoop(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSControlAction)) => PreResult(preCtx, continu, Some[BTSControlAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSControlAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSControlAction]())
          }
          return r
        case o: BTSForLoop =>
          val r: PreResult[Context, BTSControlAction] = preBTSForLoop(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSControlAction)) => PreResult(preCtx, continu, Some[BTSControlAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSControlAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSControlAction]())
          }
          return r
        case o: BTSDoUntilLoop =>
          val r: PreResult[Context, BTSControlAction] = preBTSDoUntilLoop(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSControlAction)) => PreResult(preCtx, continu, Some[BTSControlAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSControlAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSControlAction]())
          }
          return r
      }
    }

    @pure def preBTSIfBLESSAction(ctx: Context, o: BTSIfBLESSAction): PreResult[Context, BTSIfBLESSAction] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSGuardedAction(ctx: Context, o: BTSGuardedAction): PreResult[Context, BTSGuardedAction] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSIfBAAction(ctx: Context, o: BTSIfBAAction): PreResult[Context, BTSIfBAAction] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSConditionalActions(ctx: Context, o: BTSConditionalActions): PreResult[Context, BTSConditionalActions] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSWhileLoop(ctx: Context, o: BTSWhileLoop): PreResult[Context, BTSWhileLoop] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSForLoop(ctx: Context, o: BTSForLoop): PreResult[Context, BTSForLoop] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSDoUntilLoop(ctx: Context, o: BTSDoUntilLoop): PreResult[Context, BTSDoUntilLoop] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSQuantificationActions(ctx: Context, o: BTSQuantificationActions): PreResult[Context, BTSQuantificationActions] = {
      o match {
        case o: BTSExistentialLatticeQuantification =>
          val r: PreResult[Context, BTSQuantificationActions] = preBTSExistentialLatticeQuantification(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSQuantificationActions)) => PreResult(preCtx, continu, Some[BTSQuantificationActions](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSQuantificationActions")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSQuantificationActions]())
          }
          return r
        case o: BTSUniversalLatticeQuantification =>
          val r: PreResult[Context, BTSQuantificationActions] = preBTSUniversalLatticeQuantification(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSQuantificationActions)) => PreResult(preCtx, continu, Some[BTSQuantificationActions](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSQuantificationActions")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSQuantificationActions]())
          }
          return r
      }
    }

    @pure def preBTSExistentialLatticeQuantification(ctx: Context, o: BTSExistentialLatticeQuantification): PreResult[Context, BTSExistentialLatticeQuantification] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSCatchClauseTerm(ctx: Context, o: BTSCatchClauseTerm): PreResult[Context, BTSCatchClauseTerm] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSUniversalLatticeQuantification(ctx: Context, o: BTSUniversalLatticeQuantification): PreResult[Context, BTSUniversalLatticeQuantification] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSExp(ctx: Context, o: BTSExp): PreResult[Context, BTSExp] = {
      o match {
        case o: BTSUnaryExp =>
          val r: PreResult[Context, BTSExp] = preBTSUnaryExp(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSExp)) => PreResult(preCtx, continu, Some[BTSExp](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSExp")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSExp]())
          }
          return r
        case o: BTSBinaryExp =>
          val r: PreResult[Context, BTSExp] = preBTSBinaryExp(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSExp)) => PreResult(preCtx, continu, Some[BTSExp](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSExp")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSExp]())
          }
          return r
        case o: BTSLiteralExp =>
          val r: PreResult[Context, BTSExp] = preBTSLiteralExp(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSExp)) => PreResult(preCtx, continu, Some[BTSExp](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSExp")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSExp]())
          }
          return r
        case o: BTSVariableNameExp =>
          val r: PreResult[Context, BTSExp] = preBTSVariableNameExp(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSExp)) => PreResult(preCtx, continu, Some[BTSExp](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSExp")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSExp]())
          }
          return r
        case o: BTSIndexingExp =>
          val r: PreResult[Context, BTSExp] = preBTSIndexingExp(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSExp)) => PreResult(preCtx, continu, Some[BTSExp](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSExp")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSExp]())
          }
          return r
        case o: BTSAccessExp =>
          val r: PreResult[Context, BTSExp] = preBTSAccessExp(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSExp)) => PreResult(preCtx, continu, Some[BTSExp](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSExp")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSExp]())
          }
          return r
        case o: BTSFunctionCall =>
          val r: PreResult[Context, BTSExp] = preBTSFunctionCall(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSExp)) => PreResult(preCtx, continu, Some[BTSExp](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSExp")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSExp]())
          }
          return r
        case o: BTSConditionalExpression =>
          val r: PreResult[Context, BTSExp] = preBTSConditionalExpression(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSExp)) => PreResult(preCtx, continu, Some[BTSExp](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSExp")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSExp]())
          }
          return r
        case o: BTSTrue =>
          val r: PreResult[Context, BTSExp] = preBTSTrue(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSExp)) => PreResult(preCtx, continu, Some[BTSExp](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSExp")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSExp]())
          }
          return r
        case o: BTSFalse =>
          val r: PreResult[Context, BTSExp] = preBTSFalse(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSExp)) => PreResult(preCtx, continu, Some[BTSExp](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSExp")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSExp]())
          }
          return r
        case o: BTSNull =>
          val r: PreResult[Context, BTSExp] = preBTSNull(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSExp)) => PreResult(preCtx, continu, Some[BTSExp](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSExp")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSExp]())
          }
          return r
        case o: BTSPropertyConstant =>
          val r: PreResult[Context, BTSExp] = preBTSPropertyConstant(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSExp)) => PreResult(preCtx, continu, Some[BTSExp](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSExp")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSExp]())
          }
          return r
        case o: BTSPropertySetProperty =>
          val r: PreResult[Context, BTSExp] = preBTSPropertySetProperty(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSExp)) => PreResult(preCtx, continu, Some[BTSExp](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSExp")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSExp]())
          }
          return r
        case o: BTSSelfProperty =>
          val r: PreResult[Context, BTSExp] = preBTSSelfProperty(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSExp)) => PreResult(preCtx, continu, Some[BTSExp](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSExp")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSExp]())
          }
          return r
        case o: BTSComponentProperty =>
          val r: PreResult[Context, BTSExp] = preBTSComponentProperty(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSExp)) => PreResult(preCtx, continu, Some[BTSExp](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSExp")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSExp]())
          }
          return r
        case o: BTSUniversalQuantification =>
          val r: PreResult[Context, BTSExp] = preBTSUniversalQuantification(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSExp)) => PreResult(preCtx, continu, Some[BTSExp](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSExp")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSExp]())
          }
          return r
        case o: BTSExistentialQuantification =>
          val r: PreResult[Context, BTSExp] = preBTSExistentialQuantification(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSExp)) => PreResult(preCtx, continu, Some[BTSExp](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSExp")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSExp]())
          }
          return r
        case o: BTSSumQuantification =>
          val r: PreResult[Context, BTSExp] = preBTSSumQuantification(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSExp)) => PreResult(preCtx, continu, Some[BTSExp](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSExp")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSExp]())
          }
          return r
        case o: BTSProductQuantification =>
          val r: PreResult[Context, BTSExp] = preBTSProductQuantification(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSExp)) => PreResult(preCtx, continu, Some[BTSExp](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSExp")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSExp]())
          }
          return r
        case o: BTSCountingQuantification =>
          val r: PreResult[Context, BTSExp] = preBTSCountingQuantification(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSExp)) => PreResult(preCtx, continu, Some[BTSExp](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSExp")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSExp]())
          }
          return r
        case o: BTSRange =>
          val r: PreResult[Context, BTSExp] = preBTSRange(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSExp)) => PreResult(preCtx, continu, Some[BTSExp](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSExp")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSExp]())
          }
          return r
        case o: BTSQuantity =>
          val r: PreResult[Context, BTSExp] = preBTSQuantity(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSExp)) => PreResult(preCtx, continu, Some[BTSExp](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSExp")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSExp]())
          }
          return r
      }
    }

    @pure def preBTSUnaryExp(ctx: Context, o: BTSUnaryExp): PreResult[Context, BTSUnaryExp] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSBinaryExp(ctx: Context, o: BTSBinaryExp): PreResult[Context, BTSBinaryExp] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSLiteralExp(ctx: Context, o: BTSLiteralExp): PreResult[Context, BTSLiteralExp] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSValueName(ctx: Context, o: BTSValueName): PreResult[Context, BTSValueName] = {
      o match {
        case o: BTSVariableNameExp =>
          val r: PreResult[Context, BTSValueName] = preBTSVariableNameExp(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSValueName)) => PreResult(preCtx, continu, Some[BTSValueName](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSValueName")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSValueName]())
          }
          return r
        case o: BTSFunctionCall =>
          val r: PreResult[Context, BTSValueName] = preBTSFunctionCall(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSValueName)) => PreResult(preCtx, continu, Some[BTSValueName](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSValueName")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSValueName]())
          }
          return r
      }
    }

    @pure def preBTSVariableNameExp(ctx: Context, o: BTSVariableNameExp): PreResult[Context, BTSVariableNameExp] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSPartialName(ctx: Context, o: BTSPartialName): PreResult[Context, BTSPartialName] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSIndexingExp(ctx: Context, o: BTSIndexingExp): PreResult[Context, BTSIndexingExp] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSAccessExp(ctx: Context, o: BTSAccessExp): PreResult[Context, BTSAccessExp] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSFunctionCall(ctx: Context, o: BTSFunctionCall): PreResult[Context, BTSFunctionCall] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSPortValue(ctx: Context, o: BTSPortValue): PreResult[Context, BTSPortValue] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSConditionalExpression(ctx: Context, o: BTSConditionalExpression): PreResult[Context, BTSConditionalExpression] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSTrue(ctx: Context, o: BTSTrue): PreResult[Context, BTSTrue] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSFalse(ctx: Context, o: BTSFalse): PreResult[Context, BTSFalse] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSNull(ctx: Context, o: BTSNull): PreResult[Context, BTSNull] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSPropertyConstant(ctx: Context, o: BTSPropertyConstant): PreResult[Context, BTSPropertyConstant] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSPropertyReference(ctx: Context, o: BTSPropertyReference): PreResult[Context, BTSPropertyReference] = {
      o match {
      }
    }

    @pure def preBTSPropertySetProperty(ctx: Context, o: BTSPropertySetProperty): PreResult[Context, BTSPropertySetProperty] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSSelfProperty(ctx: Context, o: BTSSelfProperty): PreResult[Context, BTSSelfProperty] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSComponentProperty(ctx: Context, o: BTSComponentProperty): PreResult[Context, BTSComponentProperty] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSComponent(ctx: Context, o: BTSComponent): PreResult[Context, BTSComponent] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSPropertyField(ctx: Context, o: BTSPropertyField): PreResult[Context, BTSPropertyField] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSUniversalQuantification(ctx: Context, o: BTSUniversalQuantification): PreResult[Context, BTSUniversalQuantification] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSExistentialQuantification(ctx: Context, o: BTSExistentialQuantification): PreResult[Context, BTSExistentialQuantification] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSSumQuantification(ctx: Context, o: BTSSumQuantification): PreResult[Context, BTSSumQuantification] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSProductQuantification(ctx: Context, o: BTSProductQuantification): PreResult[Context, BTSProductQuantification] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSCountingQuantification(ctx: Context, o: BTSCountingQuantification): PreResult[Context, BTSCountingQuantification] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSRange(ctx: Context, o: BTSRange): PreResult[Context, BTSRange] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSTypeLibrary(ctx: Context, o: BTSTypeLibrary): PreResult[Context, BTSTypeLibrary] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSTypeDeclatation(ctx: Context, o: BTSTypeDeclatation): PreResult[Context, BTSTypeDeclatation] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSType(ctx: Context, o: BTSType): PreResult[Context, BTSType] = {
      o match {
        case o: BTSBooleanType =>
          val r: PreResult[Context, BTSType] = preBTSBooleanType(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSType)) => PreResult(preCtx, continu, Some[BTSType](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSType")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSType]())
          }
          return r
        case o: BTSStringType =>
          val r: PreResult[Context, BTSType] = preBTSStringType(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSType)) => PreResult(preCtx, continu, Some[BTSType](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSType")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSType]())
          }
          return r
        case o: BTSNullType =>
          val r: PreResult[Context, BTSType] = preBTSNullType(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSType)) => PreResult(preCtx, continu, Some[BTSType](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSType")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSType]())
          }
          return r
        case o: BTSClassifier =>
          val r: PreResult[Context, BTSType] = preBTSClassifier(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSType)) => PreResult(preCtx, continu, Some[BTSType](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSType")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSType]())
          }
          return r
        case o: BTSTypeName =>
          val r: PreResult[Context, BTSType] = preBTSTypeName(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSType)) => PreResult(preCtx, continu, Some[BTSType](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSType")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSType]())
          }
          return r
        case o: BTSEnumerationType =>
          val r: PreResult[Context, BTSType] = preBTSEnumerationType(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSType)) => PreResult(preCtx, continu, Some[BTSType](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSType")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSType]())
          }
          return r
        case o: BTSQuantityType =>
          val r: PreResult[Context, BTSType] = preBTSQuantityType(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSType)) => PreResult(preCtx, continu, Some[BTSType](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSType")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSType]())
          }
          return r
        case o: BTSArrayType =>
          val r: PreResult[Context, BTSType] = preBTSArrayType(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSType)) => PreResult(preCtx, continu, Some[BTSType](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSType")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSType]())
          }
          return r
        case o: BTSRecordType =>
          val r: PreResult[Context, BTSType] = preBTSRecordType(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSType)) => PreResult(preCtx, continu, Some[BTSType](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSType")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSType]())
          }
          return r
      }
    }

    @pure def preBTSBooleanType(ctx: Context, o: BTSBooleanType): PreResult[Context, BTSBooleanType] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSStringType(ctx: Context, o: BTSStringType): PreResult[Context, BTSStringType] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSNullType(ctx: Context, o: BTSNullType): PreResult[Context, BTSNullType] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSClassifier(ctx: Context, o: BTSClassifier): PreResult[Context, BTSClassifier] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSTypeName(ctx: Context, o: BTSTypeName): PreResult[Context, BTSTypeName] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSEnumerationType(ctx: Context, o: BTSEnumerationType): PreResult[Context, BTSEnumerationType] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSQuantityType(ctx: Context, o: BTSQuantityType): PreResult[Context, BTSQuantityType] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSArrayType(ctx: Context, o: BTSArrayType): PreResult[Context, BTSArrayType] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSArrayRange(ctx: Context, o: BTSArrayRange): PreResult[Context, BTSArrayRange] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSRecordType(ctx: Context, o: BTSRecordType): PreResult[Context, BTSRecordType] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSRecordField(ctx: Context, o: BTSRecordField): PreResult[Context, BTSRecordField] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSUnitLibrary(ctx: Context, o: BTSUnitLibrary): PreResult[Context, BTSUnitLibrary] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSUnitDeclaration(ctx: Context, o: BTSUnitDeclaration): PreResult[Context, BTSUnitDeclaration] = {
      o match {
        case o: BTSRootDeclaration =>
          val r: PreResult[Context, BTSUnitDeclaration] = preBTSRootDeclaration(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSUnitDeclaration)) => PreResult(preCtx, continu, Some[BTSUnitDeclaration](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSUnitDeclaration")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSUnitDeclaration]())
          }
          return r
        case o: BTSUnitExtension =>
          val r: PreResult[Context, BTSUnitDeclaration] = preBTSUnitExtension(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSUnitDeclaration)) => PreResult(preCtx, continu, Some[BTSUnitDeclaration](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSUnitDeclaration")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSUnitDeclaration]())
          }
          return r
      }
    }

    @pure def preBTSRootDeclaration(ctx: Context, o: BTSRootDeclaration): PreResult[Context, BTSRootDeclaration] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSUnitExtension(ctx: Context, o: BTSUnitExtension): PreResult[Context, BTSUnitExtension] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSUnitName(ctx: Context, o: BTSUnitName): PreResult[Context, BTSUnitName] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSUnitFormula(ctx: Context, o: BTSUnitFormula): PreResult[Context, BTSUnitFormula] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSUnitFactor(ctx: Context, o: BTSUnitFactor): PreResult[Context, BTSUnitFactor] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSQuantity(ctx: Context, o: BTSQuantity): PreResult[Context, BTSQuantity] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSExceptionLibrary(ctx: Context, o: BTSExceptionLibrary): PreResult[Context, BTSExceptionLibrary] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSExceptionDeclaration(ctx: Context, o: BTSExceptionDeclaration): PreResult[Context, BTSExceptionDeclaration] = {
      return PreResult(ctx, T, None())
    }

    @pure def preTODO(ctx: Context, o: TODO): PreResult[Context, TODO] = {
      return PreResult(ctx, T, None())
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

    @pure def postAadlInstInfo(ctx: Context, o: AadlInstInfo): TPostResult[Context, AadlInstInfo] = {
      o match {
        case o: Component =>
          val r: TPostResult[Context, AadlInstInfo] = postComponent(ctx, o) match {
           case TPostResult(postCtx, Some(result: AadlInstInfo)) => TPostResult(postCtx, Some[AadlInstInfo](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AadlInstInfo")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AadlInstInfo]())
          }
          return r
        case o: ErrorTypeDef =>
          val r: TPostResult[Context, AadlInstInfo] = postErrorTypeDef(ctx, o) match {
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
        case o: Emv2Flow =>
          val r: TPostResult[Context, AadlInstInfo] = postEmv2Flow(ctx, o) match {
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

    @pure def postAadl(ctx: Context, o: Aadl): TPostResult[Context, Aadl] = {
      return TPostResult(ctx, None())
    }

    @pure def postEmv2ElementRef(ctx: Context, o: Emv2ElementRef): TPostResult[Context, Emv2ElementRef] = {
      return TPostResult(ctx, None())
    }

    @pure def postName(ctx: Context, o: Name): TPostResult[Context, Name] = {
      return TPostResult(ctx, None())
    }

    @pure def postComponent(ctx: Context, o: Component): TPostResult[Context, Component] = {
      return TPostResult(ctx, None())
    }

    @pure def postEmv2Library(ctx: Context, o: Emv2Library): TPostResult[Context, Emv2Library] = {
      return TPostResult(ctx, None())
    }

    @pure def postErrorTypeDef(ctx: Context, o: ErrorTypeDef): TPostResult[Context, ErrorTypeDef] = {
      return TPostResult(ctx, None())
    }

    @pure def postClassifier(ctx: Context, o: Classifier): TPostResult[Context, Classifier] = {
      return TPostResult(ctx, None())
    }

    @pure def postErrorAliasDef(ctx: Context, o: ErrorAliasDef): TPostResult[Context, ErrorAliasDef] = {
      return TPostResult(ctx, None())
    }

    @pure def postErrorTypeSetDef(ctx: Context, o: ErrorTypeSetDef): TPostResult[Context, ErrorTypeSetDef] = {
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

    @pure def postBehaveStateMachine(ctx: Context, o: BehaveStateMachine): TPostResult[Context, BehaveStateMachine] = {
      return TPostResult(ctx, None())
    }

    @pure def postFeatureEnd(ctx: Context, o: FeatureEnd): TPostResult[Context, FeatureEnd] = {
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

    @pure def postFeatureGroup(ctx: Context, o: FeatureGroup): TPostResult[Context, FeatureGroup] = {
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

    @pure def postFeatureAccess(ctx: Context, o: FeatureAccess): TPostResult[Context, FeatureAccess] = {
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

    @pure def postConnection(ctx: Context, o: Connection): TPostResult[Context, Connection] = {
      return TPostResult(ctx, None())
    }

    @pure def postEmv2Flow(ctx: Context, o: Emv2Flow): TPostResult[Context, Emv2Flow] = {
      return TPostResult(ctx, None())
    }

    @pure def postEmv2BehaviorSection(ctx: Context, o: Emv2BehaviorSection): TPostResult[Context, Emv2BehaviorSection] = {
      return TPostResult(ctx, None())
    }

    @pure def postConnectionInstance(ctx: Context, o: ConnectionInstance): TPostResult[Context, ConnectionInstance] = {
      return TPostResult(ctx, None())
    }

    @pure def postErrorPropagation(ctx: Context, o: ErrorPropagation): TPostResult[Context, ErrorPropagation] = {
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
        case o: Emv2ElementRef =>
          val r: TPostResult[Context, ElementRef] = postEmv2ElementRef(ctx, o) match {
           case TPostResult(postCtx, Some(result: ElementRef)) => TPostResult(postCtx, Some[ElementRef](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type ElementRef")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[ElementRef]())
          }
          return r
        case o: AadlElementRef =>
          val r: TPostResult[Context, ElementRef] = postAadlElementRef(ctx, o) match {
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
        case o: OtherAnnex =>
          val r: TPostResult[Context, AnnexClause] = postOtherAnnex(ctx, o) match {
           case TPostResult(postCtx, Some(result: AnnexClause)) => TPostResult(postCtx, Some[AnnexClause](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AnnexClause")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AnnexClause]())
          }
          return r
        case o: BTSBLESSAnnexClause =>
          val r: TPostResult[Context, AnnexClause] = postBTSBLESSAnnexClause(ctx, o) match {
           case TPostResult(postCtx, Some(result: AnnexClause)) => TPostResult(postCtx, Some[AnnexClause](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AnnexClause")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AnnexClause]())
          }
          return r
        case o: BTSActionAnnexSubclause =>
          val r: TPostResult[Context, AnnexClause] = postBTSActionAnnexSubclause(ctx, o) match {
           case TPostResult(postCtx, Some(result: AnnexClause)) => TPostResult(postCtx, Some[AnnexClause](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AnnexClause")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AnnexClause]())
          }
          return r
      }
    }

    @pure def postAnnexLib(ctx: Context, o: AnnexLib): TPostResult[Context, AnnexLib] = {
      o match {
        case o: SmfLibrary =>
          val r: TPostResult[Context, AnnexLib] = postSmfLibrary(ctx, o) match {
           case TPostResult(postCtx, Some(result: AnnexLib)) => TPostResult(postCtx, Some[AnnexLib](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AnnexLib")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AnnexLib]())
          }
          return r
        case o: Emv2Library =>
          val r: TPostResult[Context, AnnexLib] = postEmv2Library(ctx, o) match {
           case TPostResult(postCtx, Some(result: AnnexLib)) => TPostResult(postCtx, Some[AnnexLib](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AnnexLib")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AnnexLib]())
          }
          return r
        case o: OtherLib =>
          val r: TPostResult[Context, AnnexLib] = postOtherLib(ctx, o) match {
           case TPostResult(postCtx, Some(result: AnnexLib)) => TPostResult(postCtx, Some[AnnexLib](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AnnexLib")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AnnexLib]())
          }
          return r
        case o: BTSTypeLibrary =>
          val r: TPostResult[Context, AnnexLib] = postBTSTypeLibrary(ctx, o) match {
           case TPostResult(postCtx, Some(result: AnnexLib)) => TPostResult(postCtx, Some[AnnexLib](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AnnexLib")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AnnexLib]())
          }
          return r
        case o: BTSUnitLibrary =>
          val r: TPostResult[Context, AnnexLib] = postBTSUnitLibrary(ctx, o) match {
           case TPostResult(postCtx, Some(result: AnnexLib)) => TPostResult(postCtx, Some[AnnexLib](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AnnexLib")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AnnexLib]())
          }
          return r
        case o: BTSExceptionLibrary =>
          val r: TPostResult[Context, AnnexLib] = postBTSExceptionLibrary(ctx, o) match {
           case TPostResult(postCtx, Some(result: AnnexLib)) => TPostResult(postCtx, Some[AnnexLib](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type AnnexLib")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[AnnexLib]())
          }
          return r
      }
    }

    @pure def postOtherAnnex(ctx: Context, o: OtherAnnex): TPostResult[Context, OtherAnnex] = {
      return TPostResult(ctx, None())
    }

    @pure def postOtherLib(ctx: Context, o: OtherLib): TPostResult[Context, OtherLib] = {
      return TPostResult(ctx, None())
    }

    @pure def postBLESSAnnex(ctx: Context, o: BLESSAnnex): TPostResult[Context, BLESSAnnex] = {
      o match {
        case o: BTSBLESSAnnexClause =>
          val r: TPostResult[Context, BLESSAnnex] = postBTSBLESSAnnexClause(ctx, o) match {
           case TPostResult(postCtx, Some(result: BLESSAnnex)) => TPostResult(postCtx, Some[BLESSAnnex](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BLESSAnnex")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BLESSAnnex]())
          }
          return r
        case o: BTSActionAnnexSubclause =>
          val r: TPostResult[Context, BLESSAnnex] = postBTSActionAnnexSubclause(ctx, o) match {
           case TPostResult(postCtx, Some(result: BLESSAnnex)) => TPostResult(postCtx, Some[BLESSAnnex](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BLESSAnnex")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BLESSAnnex]())
          }
          return r
      }
    }

    @pure def postBTSBLESSAnnexClause(ctx: Context, o: BTSBLESSAnnexClause): TPostResult[Context, BTSBLESSAnnexClause] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSVariableDeclaration(ctx: Context, o: BTSVariableDeclaration): TPostResult[Context, BTSVariableDeclaration] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSStateDeclaration(ctx: Context, o: BTSStateDeclaration): TPostResult[Context, BTSStateDeclaration] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSTransition(ctx: Context, o: BTSTransition): TPostResult[Context, BTSTransition] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSTransitionLabel(ctx: Context, o: BTSTransitionLabel): TPostResult[Context, BTSTransitionLabel] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSTransitionCondition(ctx: Context, o: BTSTransitionCondition): TPostResult[Context, BTSTransitionCondition] = {
      o match {
        case o: BTSDispatchCondition =>
          val r: TPostResult[Context, BTSTransitionCondition] = postBTSDispatchCondition(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSTransitionCondition)) => TPostResult(postCtx, Some[BTSTransitionCondition](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSTransitionCondition")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSTransitionCondition]())
          }
          return r
        case o: BTSExecuteConditionExp =>
          val r: TPostResult[Context, BTSTransitionCondition] = postBTSExecuteConditionExp(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSTransitionCondition)) => TPostResult(postCtx, Some[BTSTransitionCondition](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSTransitionCondition")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSTransitionCondition]())
          }
          return r
        case o: BTSExecuteConditionTimeout =>
          val r: TPostResult[Context, BTSTransitionCondition] = postBTSExecuteConditionTimeout(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSTransitionCondition)) => TPostResult(postCtx, Some[BTSTransitionCondition](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSTransitionCondition")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSTransitionCondition]())
          }
          return r
        case o: BTSExecuteConditionOtherwise =>
          val r: TPostResult[Context, BTSTransitionCondition] = postBTSExecuteConditionOtherwise(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSTransitionCondition)) => TPostResult(postCtx, Some[BTSTransitionCondition](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSTransitionCondition")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSTransitionCondition]())
          }
          return r
        case o: BTSModeCondition =>
          val r: TPostResult[Context, BTSTransitionCondition] = postBTSModeCondition(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSTransitionCondition)) => TPostResult(postCtx, Some[BTSTransitionCondition](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSTransitionCondition")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSTransitionCondition]())
          }
          return r
        case o: BTSInternalCondition =>
          val r: TPostResult[Context, BTSTransitionCondition] = postBTSInternalCondition(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSTransitionCondition)) => TPostResult(postCtx, Some[BTSTransitionCondition](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSTransitionCondition")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSTransitionCondition]())
          }
          return r
      }
    }

    @pure def postBTSDispatchCondition(ctx: Context, o: BTSDispatchCondition): TPostResult[Context, BTSDispatchCondition] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSDispatchConjunction(ctx: Context, o: BTSDispatchConjunction): TPostResult[Context, BTSDispatchConjunction] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSDispatchTrigger(ctx: Context, o: BTSDispatchTrigger): TPostResult[Context, BTSDispatchTrigger] = {
      o match {
        case o: BTSDispatchTriggerStop =>
          val r: TPostResult[Context, BTSDispatchTrigger] = postBTSDispatchTriggerStop(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSDispatchTrigger)) => TPostResult(postCtx, Some[BTSDispatchTrigger](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSDispatchTrigger")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSDispatchTrigger]())
          }
          return r
        case o: BTSDispatchTriggerPort =>
          val r: TPostResult[Context, BTSDispatchTrigger] = postBTSDispatchTriggerPort(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSDispatchTrigger)) => TPostResult(postCtx, Some[BTSDispatchTrigger](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSDispatchTrigger")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSDispatchTrigger]())
          }
          return r
        case o: BTSDispatchTriggerTimeout =>
          val r: TPostResult[Context, BTSDispatchTrigger] = postBTSDispatchTriggerTimeout(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSDispatchTrigger)) => TPostResult(postCtx, Some[BTSDispatchTrigger](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSDispatchTrigger")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSDispatchTrigger]())
          }
          return r
      }
    }

    @pure def postBTSDispatchTriggerStop(ctx: Context, o: BTSDispatchTriggerStop): TPostResult[Context, BTSDispatchTriggerStop] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSDispatchTriggerPort(ctx: Context, o: BTSDispatchTriggerPort): TPostResult[Context, BTSDispatchTriggerPort] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSDispatchTriggerTimeout(ctx: Context, o: BTSDispatchTriggerTimeout): TPostResult[Context, BTSDispatchTriggerTimeout] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSExecuteCondition(ctx: Context, o: BTSExecuteCondition): TPostResult[Context, BTSExecuteCondition] = {
      o match {
        case o: BTSExecuteConditionExp =>
          val r: TPostResult[Context, BTSExecuteCondition] = postBTSExecuteConditionExp(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSExecuteCondition)) => TPostResult(postCtx, Some[BTSExecuteCondition](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSExecuteCondition")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSExecuteCondition]())
          }
          return r
        case o: BTSExecuteConditionTimeout =>
          val r: TPostResult[Context, BTSExecuteCondition] = postBTSExecuteConditionTimeout(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSExecuteCondition)) => TPostResult(postCtx, Some[BTSExecuteCondition](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSExecuteCondition")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSExecuteCondition]())
          }
          return r
        case o: BTSExecuteConditionOtherwise =>
          val r: TPostResult[Context, BTSExecuteCondition] = postBTSExecuteConditionOtherwise(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSExecuteCondition)) => TPostResult(postCtx, Some[BTSExecuteCondition](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSExecuteCondition")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSExecuteCondition]())
          }
          return r
      }
    }

    @pure def postBTSExecuteConditionExp(ctx: Context, o: BTSExecuteConditionExp): TPostResult[Context, BTSExecuteConditionExp] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSExecuteConditionTimeout(ctx: Context, o: BTSExecuteConditionTimeout): TPostResult[Context, BTSExecuteConditionTimeout] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSExecuteConditionOtherwise(ctx: Context, o: BTSExecuteConditionOtherwise): TPostResult[Context, BTSExecuteConditionOtherwise] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSModeCondition(ctx: Context, o: BTSModeCondition): TPostResult[Context, BTSModeCondition] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSTriggerLogicalExpression(ctx: Context, o: BTSTriggerLogicalExpression): TPostResult[Context, BTSTriggerLogicalExpression] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSEventTrigger(ctx: Context, o: BTSEventTrigger): TPostResult[Context, BTSEventTrigger] = {
      o match {
        case o: BTSTriggerLogicalExpression =>
          val r: TPostResult[Context, BTSEventTrigger] = postBTSTriggerLogicalExpression(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSEventTrigger)) => TPostResult(postCtx, Some[BTSEventTrigger](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSEventTrigger")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSEventTrigger]())
          }
          return r
        case o: BTSSubcomponentPort =>
          val r: TPostResult[Context, BTSEventTrigger] = postBTSSubcomponentPort(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSEventTrigger)) => TPostResult(postCtx, Some[BTSEventTrigger](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSEventTrigger")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSEventTrigger]())
          }
          return r
      }
    }

    @pure def postBTSSubcomponentPort(ctx: Context, o: BTSSubcomponentPort): TPostResult[Context, BTSSubcomponentPort] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSInternalCondition(ctx: Context, o: BTSInternalCondition): TPostResult[Context, BTSInternalCondition] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSAssertion(ctx: Context, o: BTSAssertion): TPostResult[Context, BTSAssertion] = {
      o match {
        case o: BTSNamedAssertion =>
          val r: TPostResult[Context, BTSAssertion] = postBTSNamedAssertion(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSAssertion)) => TPostResult(postCtx, Some[BTSAssertion](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSAssertion")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSAssertion]())
          }
          return r
        case o: BTSNamedFunction =>
          val r: TPostResult[Context, BTSAssertion] = postBTSNamedFunction(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSAssertion)) => TPostResult(postCtx, Some[BTSAssertion](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSAssertion")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSAssertion]())
          }
          return r
        case o: BTSNamedEnumeration =>
          val r: TPostResult[Context, BTSAssertion] = postBTSNamedEnumeration(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSAssertion)) => TPostResult(postCtx, Some[BTSAssertion](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSAssertion")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSAssertion]())
          }
          return r
        case o: BTSNamelessAssertion =>
          val r: TPostResult[Context, BTSAssertion] = postBTSNamelessAssertion(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSAssertion)) => TPostResult(postCtx, Some[BTSAssertion](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSAssertion")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSAssertion]())
          }
          return r
        case o: BTSNamelessFunction =>
          val r: TPostResult[Context, BTSAssertion] = postBTSNamelessFunction(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSAssertion)) => TPostResult(postCtx, Some[BTSAssertion](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSAssertion")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSAssertion]())
          }
          return r
        case o: BTSNamelessEnumeration =>
          val r: TPostResult[Context, BTSAssertion] = postBTSNamelessEnumeration(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSAssertion)) => TPostResult(postCtx, Some[BTSAssertion](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSAssertion")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSAssertion]())
          }
          return r
      }
    }

    @pure def postBTSNamedAssertion(ctx: Context, o: BTSNamedAssertion): TPostResult[Context, BTSNamedAssertion] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSNamedFunction(ctx: Context, o: BTSNamedFunction): TPostResult[Context, BTSNamedFunction] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSNamedEnumeration(ctx: Context, o: BTSNamedEnumeration): TPostResult[Context, BTSNamedEnumeration] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSNamelessAssertion(ctx: Context, o: BTSNamelessAssertion): TPostResult[Context, BTSNamelessAssertion] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSNamelessFunction(ctx: Context, o: BTSNamelessFunction): TPostResult[Context, BTSNamelessFunction] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSNamelessEnumeration(ctx: Context, o: BTSNamelessEnumeration): TPostResult[Context, BTSNamelessEnumeration] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSAssertionEnumeration(ctx: Context, o: BTSAssertionEnumeration): TPostResult[Context, BTSAssertionEnumeration] = {
      o match {
        case o: BTSEnumerationPairs =>
          val r: TPostResult[Context, BTSAssertionEnumeration] = postBTSEnumerationPairs(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSAssertionEnumeration)) => TPostResult(postCtx, Some[BTSAssertionEnumeration](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSAssertionEnumeration")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSAssertionEnumeration]())
          }
          return r
        case o: BTSInvocation =>
          val r: TPostResult[Context, BTSAssertionEnumeration] = postBTSInvocation(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSAssertionEnumeration)) => TPostResult(postCtx, Some[BTSAssertionEnumeration](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSAssertionEnumeration")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSAssertionEnumeration]())
          }
          return r
      }
    }

    @pure def postBTSEnumerationPairs(ctx: Context, o: BTSEnumerationPairs): TPostResult[Context, BTSEnumerationPairs] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSEnumerationPair(ctx: Context, o: BTSEnumerationPair): TPostResult[Context, BTSEnumerationPair] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSInvocation(ctx: Context, o: BTSInvocation): TPostResult[Context, BTSInvocation] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSActualParameter(ctx: Context, o: BTSActualParameter): TPostResult[Context, BTSActualParameter] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSVariable(ctx: Context, o: BTSVariable): TPostResult[Context, BTSVariable] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSActionAnnexSubclause(ctx: Context, o: BTSActionAnnexSubclause): TPostResult[Context, BTSActionAnnexSubclause] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSBehaviorActions(ctx: Context, o: BTSBehaviorActions): TPostResult[Context, BTSBehaviorActions] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSAssertedAction(ctx: Context, o: BTSAssertedAction): TPostResult[Context, BTSAssertedAction] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSAction(ctx: Context, o: BTSAction): TPostResult[Context, BTSAction] = {
      o match {
        case o: BTSSkipAction =>
          val r: TPostResult[Context, BTSAction] = postBTSSkipAction(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSAction)) => TPostResult(postCtx, Some[BTSAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSAction]())
          }
          return r
        case o: BTSAssignmentAction =>
          val r: TPostResult[Context, BTSAction] = postBTSAssignmentAction(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSAction)) => TPostResult(postCtx, Some[BTSAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSAction]())
          }
          return r
        case o: BTSSetMode =>
          val r: TPostResult[Context, BTSAction] = postBTSSetMode(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSAction)) => TPostResult(postCtx, Some[BTSAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSAction]())
          }
          return r
        case o: BTSWhenThrow =>
          val r: TPostResult[Context, BTSAction] = postBTSWhenThrow(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSAction)) => TPostResult(postCtx, Some[BTSAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSAction]())
          }
          return r
        case o: BTSFetchAdd =>
          val r: TPostResult[Context, BTSAction] = postBTSFetchAdd(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSAction)) => TPostResult(postCtx, Some[BTSAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSAction]())
          }
          return r
        case o: BTSFetchOr =>
          val r: TPostResult[Context, BTSAction] = postBTSFetchOr(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSAction)) => TPostResult(postCtx, Some[BTSAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSAction]())
          }
          return r
        case o: BTSFetchAnd =>
          val r: TPostResult[Context, BTSAction] = postBTSFetchAnd(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSAction)) => TPostResult(postCtx, Some[BTSAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSAction]())
          }
          return r
        case o: BTSFetchXor =>
          val r: TPostResult[Context, BTSAction] = postBTSFetchXor(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSAction)) => TPostResult(postCtx, Some[BTSAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSAction]())
          }
          return r
        case o: BTSSwap =>
          val r: TPostResult[Context, BTSAction] = postBTSSwap(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSAction)) => TPostResult(postCtx, Some[BTSAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSAction]())
          }
          return r
        case o: BTSSubprogramCallAction =>
          val r: TPostResult[Context, BTSAction] = postBTSSubprogramCallAction(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSAction)) => TPostResult(postCtx, Some[BTSAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSAction]())
          }
          return r
        case o: BTSPortOutput =>
          val r: TPostResult[Context, BTSAction] = postBTSPortOutput(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSAction)) => TPostResult(postCtx, Some[BTSAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSAction]())
          }
          return r
        case o: BTSPortInput =>
          val r: TPostResult[Context, BTSAction] = postBTSPortInput(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSAction)) => TPostResult(postCtx, Some[BTSAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSAction]())
          }
          return r
        case o: BTSFrozenPortAction =>
          val r: TPostResult[Context, BTSAction] = postBTSFrozenPortAction(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSAction)) => TPostResult(postCtx, Some[BTSAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSAction]())
          }
          return r
        case o: BTSPause =>
          val r: TPostResult[Context, BTSAction] = postBTSPause(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSAction)) => TPostResult(postCtx, Some[BTSAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSAction]())
          }
          return r
        case o: BTSIfBLESSAction =>
          val r: TPostResult[Context, BTSAction] = postBTSIfBLESSAction(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSAction)) => TPostResult(postCtx, Some[BTSAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSAction]())
          }
          return r
        case o: BTSIfBAAction =>
          val r: TPostResult[Context, BTSAction] = postBTSIfBAAction(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSAction)) => TPostResult(postCtx, Some[BTSAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSAction]())
          }
          return r
        case o: BTSWhileLoop =>
          val r: TPostResult[Context, BTSAction] = postBTSWhileLoop(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSAction)) => TPostResult(postCtx, Some[BTSAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSAction]())
          }
          return r
        case o: BTSForLoop =>
          val r: TPostResult[Context, BTSAction] = postBTSForLoop(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSAction)) => TPostResult(postCtx, Some[BTSAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSAction]())
          }
          return r
        case o: BTSDoUntilLoop =>
          val r: TPostResult[Context, BTSAction] = postBTSDoUntilLoop(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSAction)) => TPostResult(postCtx, Some[BTSAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSAction]())
          }
          return r
        case o: BTSExistentialLatticeQuantification =>
          val r: TPostResult[Context, BTSAction] = postBTSExistentialLatticeQuantification(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSAction)) => TPostResult(postCtx, Some[BTSAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSAction]())
          }
          return r
        case o: BTSUniversalLatticeQuantification =>
          val r: TPostResult[Context, BTSAction] = postBTSUniversalLatticeQuantification(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSAction)) => TPostResult(postCtx, Some[BTSAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSAction]())
          }
          return r
      }
    }

    @pure def postBTSBasicAction(ctx: Context, o: BTSBasicAction): TPostResult[Context, BTSBasicAction] = {
      o match {
        case o: BTSSkipAction =>
          val r: TPostResult[Context, BTSBasicAction] = postBTSSkipAction(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSBasicAction)) => TPostResult(postCtx, Some[BTSBasicAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSBasicAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSBasicAction]())
          }
          return r
        case o: BTSAssignmentAction =>
          val r: TPostResult[Context, BTSBasicAction] = postBTSAssignmentAction(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSBasicAction)) => TPostResult(postCtx, Some[BTSBasicAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSBasicAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSBasicAction]())
          }
          return r
        case o: BTSSetMode =>
          val r: TPostResult[Context, BTSBasicAction] = postBTSSetMode(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSBasicAction)) => TPostResult(postCtx, Some[BTSBasicAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSBasicAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSBasicAction]())
          }
          return r
        case o: BTSWhenThrow =>
          val r: TPostResult[Context, BTSBasicAction] = postBTSWhenThrow(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSBasicAction)) => TPostResult(postCtx, Some[BTSBasicAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSBasicAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSBasicAction]())
          }
          return r
        case o: BTSFetchAdd =>
          val r: TPostResult[Context, BTSBasicAction] = postBTSFetchAdd(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSBasicAction)) => TPostResult(postCtx, Some[BTSBasicAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSBasicAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSBasicAction]())
          }
          return r
        case o: BTSFetchOr =>
          val r: TPostResult[Context, BTSBasicAction] = postBTSFetchOr(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSBasicAction)) => TPostResult(postCtx, Some[BTSBasicAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSBasicAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSBasicAction]())
          }
          return r
        case o: BTSFetchAnd =>
          val r: TPostResult[Context, BTSBasicAction] = postBTSFetchAnd(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSBasicAction)) => TPostResult(postCtx, Some[BTSBasicAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSBasicAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSBasicAction]())
          }
          return r
        case o: BTSFetchXor =>
          val r: TPostResult[Context, BTSBasicAction] = postBTSFetchXor(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSBasicAction)) => TPostResult(postCtx, Some[BTSBasicAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSBasicAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSBasicAction]())
          }
          return r
        case o: BTSSwap =>
          val r: TPostResult[Context, BTSBasicAction] = postBTSSwap(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSBasicAction)) => TPostResult(postCtx, Some[BTSBasicAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSBasicAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSBasicAction]())
          }
          return r
        case o: BTSSubprogramCallAction =>
          val r: TPostResult[Context, BTSBasicAction] = postBTSSubprogramCallAction(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSBasicAction)) => TPostResult(postCtx, Some[BTSBasicAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSBasicAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSBasicAction]())
          }
          return r
        case o: BTSPortOutput =>
          val r: TPostResult[Context, BTSBasicAction] = postBTSPortOutput(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSBasicAction)) => TPostResult(postCtx, Some[BTSBasicAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSBasicAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSBasicAction]())
          }
          return r
        case o: BTSPortInput =>
          val r: TPostResult[Context, BTSBasicAction] = postBTSPortInput(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSBasicAction)) => TPostResult(postCtx, Some[BTSBasicAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSBasicAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSBasicAction]())
          }
          return r
        case o: BTSFrozenPortAction =>
          val r: TPostResult[Context, BTSBasicAction] = postBTSFrozenPortAction(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSBasicAction)) => TPostResult(postCtx, Some[BTSBasicAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSBasicAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSBasicAction]())
          }
          return r
        case o: BTSPause =>
          val r: TPostResult[Context, BTSBasicAction] = postBTSPause(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSBasicAction)) => TPostResult(postCtx, Some[BTSBasicAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSBasicAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSBasicAction]())
          }
          return r
      }
    }

    @pure def postBTSSkipAction(ctx: Context, o: BTSSkipAction): TPostResult[Context, BTSSkipAction] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSAssignmentAction(ctx: Context, o: BTSAssignmentAction): TPostResult[Context, BTSAssignmentAction] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSSetMode(ctx: Context, o: BTSSetMode): TPostResult[Context, BTSSetMode] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSWhenThrow(ctx: Context, o: BTSWhenThrow): TPostResult[Context, BTSWhenThrow] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSCombinableOperation(ctx: Context, o: BTSCombinableOperation): TPostResult[Context, BTSCombinableOperation] = {
      o match {
        case o: BTSFetchAdd =>
          val r: TPostResult[Context, BTSCombinableOperation] = postBTSFetchAdd(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSCombinableOperation)) => TPostResult(postCtx, Some[BTSCombinableOperation](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSCombinableOperation")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSCombinableOperation]())
          }
          return r
        case o: BTSFetchOr =>
          val r: TPostResult[Context, BTSCombinableOperation] = postBTSFetchOr(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSCombinableOperation)) => TPostResult(postCtx, Some[BTSCombinableOperation](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSCombinableOperation")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSCombinableOperation]())
          }
          return r
        case o: BTSFetchAnd =>
          val r: TPostResult[Context, BTSCombinableOperation] = postBTSFetchAnd(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSCombinableOperation)) => TPostResult(postCtx, Some[BTSCombinableOperation](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSCombinableOperation")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSCombinableOperation]())
          }
          return r
        case o: BTSFetchXor =>
          val r: TPostResult[Context, BTSCombinableOperation] = postBTSFetchXor(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSCombinableOperation)) => TPostResult(postCtx, Some[BTSCombinableOperation](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSCombinableOperation")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSCombinableOperation]())
          }
          return r
        case o: BTSSwap =>
          val r: TPostResult[Context, BTSCombinableOperation] = postBTSSwap(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSCombinableOperation)) => TPostResult(postCtx, Some[BTSCombinableOperation](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSCombinableOperation")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSCombinableOperation]())
          }
          return r
      }
    }

    @pure def postBTSFetchAdd(ctx: Context, o: BTSFetchAdd): TPostResult[Context, BTSFetchAdd] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSFetchOr(ctx: Context, o: BTSFetchOr): TPostResult[Context, BTSFetchOr] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSFetchAnd(ctx: Context, o: BTSFetchAnd): TPostResult[Context, BTSFetchAnd] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSFetchXor(ctx: Context, o: BTSFetchXor): TPostResult[Context, BTSFetchXor] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSSwap(ctx: Context, o: BTSSwap): TPostResult[Context, BTSSwap] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSCommunicationAction(ctx: Context, o: BTSCommunicationAction): TPostResult[Context, BTSCommunicationAction] = {
      o match {
        case o: BTSSubprogramCallAction =>
          val r: TPostResult[Context, BTSCommunicationAction] = postBTSSubprogramCallAction(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSCommunicationAction)) => TPostResult(postCtx, Some[BTSCommunicationAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSCommunicationAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSCommunicationAction]())
          }
          return r
        case o: BTSPortOutput =>
          val r: TPostResult[Context, BTSCommunicationAction] = postBTSPortOutput(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSCommunicationAction)) => TPostResult(postCtx, Some[BTSCommunicationAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSCommunicationAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSCommunicationAction]())
          }
          return r
        case o: BTSPortInput =>
          val r: TPostResult[Context, BTSCommunicationAction] = postBTSPortInput(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSCommunicationAction)) => TPostResult(postCtx, Some[BTSCommunicationAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSCommunicationAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSCommunicationAction]())
          }
          return r
        case o: BTSFrozenPortAction =>
          val r: TPostResult[Context, BTSCommunicationAction] = postBTSFrozenPortAction(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSCommunicationAction)) => TPostResult(postCtx, Some[BTSCommunicationAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSCommunicationAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSCommunicationAction]())
          }
          return r
        case o: BTSPause =>
          val r: TPostResult[Context, BTSCommunicationAction] = postBTSPause(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSCommunicationAction)) => TPostResult(postCtx, Some[BTSCommunicationAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSCommunicationAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSCommunicationAction]())
          }
          return r
      }
    }

    @pure def postBTSSubprogramCallAction(ctx: Context, o: BTSSubprogramCallAction): TPostResult[Context, BTSSubprogramCallAction] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSFormalActual(ctx: Context, o: BTSFormalActual): TPostResult[Context, BTSFormalActual] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSPortOutput(ctx: Context, o: BTSPortOutput): TPostResult[Context, BTSPortOutput] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSPortInput(ctx: Context, o: BTSPortInput): TPostResult[Context, BTSPortInput] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSFrozenPortAction(ctx: Context, o: BTSFrozenPortAction): TPostResult[Context, BTSFrozenPortAction] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSPause(ctx: Context, o: BTSPause): TPostResult[Context, BTSPause] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSControlAction(ctx: Context, o: BTSControlAction): TPostResult[Context, BTSControlAction] = {
      o match {
        case o: BTSIfBLESSAction =>
          val r: TPostResult[Context, BTSControlAction] = postBTSIfBLESSAction(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSControlAction)) => TPostResult(postCtx, Some[BTSControlAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSControlAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSControlAction]())
          }
          return r
        case o: BTSIfBAAction =>
          val r: TPostResult[Context, BTSControlAction] = postBTSIfBAAction(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSControlAction)) => TPostResult(postCtx, Some[BTSControlAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSControlAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSControlAction]())
          }
          return r
        case o: BTSWhileLoop =>
          val r: TPostResult[Context, BTSControlAction] = postBTSWhileLoop(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSControlAction)) => TPostResult(postCtx, Some[BTSControlAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSControlAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSControlAction]())
          }
          return r
        case o: BTSForLoop =>
          val r: TPostResult[Context, BTSControlAction] = postBTSForLoop(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSControlAction)) => TPostResult(postCtx, Some[BTSControlAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSControlAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSControlAction]())
          }
          return r
        case o: BTSDoUntilLoop =>
          val r: TPostResult[Context, BTSControlAction] = postBTSDoUntilLoop(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSControlAction)) => TPostResult(postCtx, Some[BTSControlAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSControlAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSControlAction]())
          }
          return r
      }
    }

    @pure def postBTSIfBLESSAction(ctx: Context, o: BTSIfBLESSAction): TPostResult[Context, BTSIfBLESSAction] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSGuardedAction(ctx: Context, o: BTSGuardedAction): TPostResult[Context, BTSGuardedAction] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSIfBAAction(ctx: Context, o: BTSIfBAAction): TPostResult[Context, BTSIfBAAction] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSConditionalActions(ctx: Context, o: BTSConditionalActions): TPostResult[Context, BTSConditionalActions] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSWhileLoop(ctx: Context, o: BTSWhileLoop): TPostResult[Context, BTSWhileLoop] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSForLoop(ctx: Context, o: BTSForLoop): TPostResult[Context, BTSForLoop] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSDoUntilLoop(ctx: Context, o: BTSDoUntilLoop): TPostResult[Context, BTSDoUntilLoop] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSQuantificationActions(ctx: Context, o: BTSQuantificationActions): TPostResult[Context, BTSQuantificationActions] = {
      o match {
        case o: BTSExistentialLatticeQuantification =>
          val r: TPostResult[Context, BTSQuantificationActions] = postBTSExistentialLatticeQuantification(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSQuantificationActions)) => TPostResult(postCtx, Some[BTSQuantificationActions](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSQuantificationActions")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSQuantificationActions]())
          }
          return r
        case o: BTSUniversalLatticeQuantification =>
          val r: TPostResult[Context, BTSQuantificationActions] = postBTSUniversalLatticeQuantification(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSQuantificationActions)) => TPostResult(postCtx, Some[BTSQuantificationActions](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSQuantificationActions")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSQuantificationActions]())
          }
          return r
      }
    }

    @pure def postBTSExistentialLatticeQuantification(ctx: Context, o: BTSExistentialLatticeQuantification): TPostResult[Context, BTSExistentialLatticeQuantification] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSCatchClauseTerm(ctx: Context, o: BTSCatchClauseTerm): TPostResult[Context, BTSCatchClauseTerm] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSUniversalLatticeQuantification(ctx: Context, o: BTSUniversalLatticeQuantification): TPostResult[Context, BTSUniversalLatticeQuantification] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSExp(ctx: Context, o: BTSExp): TPostResult[Context, BTSExp] = {
      o match {
        case o: BTSUnaryExp =>
          val r: TPostResult[Context, BTSExp] = postBTSUnaryExp(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSExp)) => TPostResult(postCtx, Some[BTSExp](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSExp")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSExp]())
          }
          return r
        case o: BTSBinaryExp =>
          val r: TPostResult[Context, BTSExp] = postBTSBinaryExp(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSExp)) => TPostResult(postCtx, Some[BTSExp](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSExp")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSExp]())
          }
          return r
        case o: BTSLiteralExp =>
          val r: TPostResult[Context, BTSExp] = postBTSLiteralExp(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSExp)) => TPostResult(postCtx, Some[BTSExp](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSExp")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSExp]())
          }
          return r
        case o: BTSVariableNameExp =>
          val r: TPostResult[Context, BTSExp] = postBTSVariableNameExp(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSExp)) => TPostResult(postCtx, Some[BTSExp](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSExp")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSExp]())
          }
          return r
        case o: BTSIndexingExp =>
          val r: TPostResult[Context, BTSExp] = postBTSIndexingExp(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSExp)) => TPostResult(postCtx, Some[BTSExp](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSExp")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSExp]())
          }
          return r
        case o: BTSAccessExp =>
          val r: TPostResult[Context, BTSExp] = postBTSAccessExp(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSExp)) => TPostResult(postCtx, Some[BTSExp](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSExp")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSExp]())
          }
          return r
        case o: BTSFunctionCall =>
          val r: TPostResult[Context, BTSExp] = postBTSFunctionCall(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSExp)) => TPostResult(postCtx, Some[BTSExp](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSExp")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSExp]())
          }
          return r
        case o: BTSConditionalExpression =>
          val r: TPostResult[Context, BTSExp] = postBTSConditionalExpression(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSExp)) => TPostResult(postCtx, Some[BTSExp](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSExp")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSExp]())
          }
          return r
        case o: BTSTrue =>
          val r: TPostResult[Context, BTSExp] = postBTSTrue(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSExp)) => TPostResult(postCtx, Some[BTSExp](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSExp")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSExp]())
          }
          return r
        case o: BTSFalse =>
          val r: TPostResult[Context, BTSExp] = postBTSFalse(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSExp)) => TPostResult(postCtx, Some[BTSExp](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSExp")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSExp]())
          }
          return r
        case o: BTSNull =>
          val r: TPostResult[Context, BTSExp] = postBTSNull(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSExp)) => TPostResult(postCtx, Some[BTSExp](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSExp")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSExp]())
          }
          return r
        case o: BTSPropertyConstant =>
          val r: TPostResult[Context, BTSExp] = postBTSPropertyConstant(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSExp)) => TPostResult(postCtx, Some[BTSExp](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSExp")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSExp]())
          }
          return r
        case o: BTSPropertySetProperty =>
          val r: TPostResult[Context, BTSExp] = postBTSPropertySetProperty(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSExp)) => TPostResult(postCtx, Some[BTSExp](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSExp")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSExp]())
          }
          return r
        case o: BTSSelfProperty =>
          val r: TPostResult[Context, BTSExp] = postBTSSelfProperty(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSExp)) => TPostResult(postCtx, Some[BTSExp](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSExp")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSExp]())
          }
          return r
        case o: BTSComponentProperty =>
          val r: TPostResult[Context, BTSExp] = postBTSComponentProperty(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSExp)) => TPostResult(postCtx, Some[BTSExp](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSExp")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSExp]())
          }
          return r
        case o: BTSUniversalQuantification =>
          val r: TPostResult[Context, BTSExp] = postBTSUniversalQuantification(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSExp)) => TPostResult(postCtx, Some[BTSExp](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSExp")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSExp]())
          }
          return r
        case o: BTSExistentialQuantification =>
          val r: TPostResult[Context, BTSExp] = postBTSExistentialQuantification(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSExp)) => TPostResult(postCtx, Some[BTSExp](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSExp")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSExp]())
          }
          return r
        case o: BTSSumQuantification =>
          val r: TPostResult[Context, BTSExp] = postBTSSumQuantification(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSExp)) => TPostResult(postCtx, Some[BTSExp](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSExp")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSExp]())
          }
          return r
        case o: BTSProductQuantification =>
          val r: TPostResult[Context, BTSExp] = postBTSProductQuantification(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSExp)) => TPostResult(postCtx, Some[BTSExp](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSExp")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSExp]())
          }
          return r
        case o: BTSCountingQuantification =>
          val r: TPostResult[Context, BTSExp] = postBTSCountingQuantification(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSExp)) => TPostResult(postCtx, Some[BTSExp](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSExp")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSExp]())
          }
          return r
        case o: BTSRange =>
          val r: TPostResult[Context, BTSExp] = postBTSRange(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSExp)) => TPostResult(postCtx, Some[BTSExp](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSExp")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSExp]())
          }
          return r
        case o: BTSQuantity =>
          val r: TPostResult[Context, BTSExp] = postBTSQuantity(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSExp)) => TPostResult(postCtx, Some[BTSExp](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSExp")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSExp]())
          }
          return r
      }
    }

    @pure def postBTSUnaryExp(ctx: Context, o: BTSUnaryExp): TPostResult[Context, BTSUnaryExp] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSBinaryExp(ctx: Context, o: BTSBinaryExp): TPostResult[Context, BTSBinaryExp] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSLiteralExp(ctx: Context, o: BTSLiteralExp): TPostResult[Context, BTSLiteralExp] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSValueName(ctx: Context, o: BTSValueName): TPostResult[Context, BTSValueName] = {
      o match {
        case o: BTSVariableNameExp =>
          val r: TPostResult[Context, BTSValueName] = postBTSVariableNameExp(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSValueName)) => TPostResult(postCtx, Some[BTSValueName](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSValueName")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSValueName]())
          }
          return r
        case o: BTSFunctionCall =>
          val r: TPostResult[Context, BTSValueName] = postBTSFunctionCall(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSValueName)) => TPostResult(postCtx, Some[BTSValueName](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSValueName")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSValueName]())
          }
          return r
      }
    }

    @pure def postBTSVariableNameExp(ctx: Context, o: BTSVariableNameExp): TPostResult[Context, BTSVariableNameExp] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSPartialName(ctx: Context, o: BTSPartialName): TPostResult[Context, BTSPartialName] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSIndexingExp(ctx: Context, o: BTSIndexingExp): TPostResult[Context, BTSIndexingExp] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSAccessExp(ctx: Context, o: BTSAccessExp): TPostResult[Context, BTSAccessExp] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSFunctionCall(ctx: Context, o: BTSFunctionCall): TPostResult[Context, BTSFunctionCall] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSPortValue(ctx: Context, o: BTSPortValue): TPostResult[Context, BTSPortValue] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSConditionalExpression(ctx: Context, o: BTSConditionalExpression): TPostResult[Context, BTSConditionalExpression] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSTrue(ctx: Context, o: BTSTrue): TPostResult[Context, BTSTrue] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSFalse(ctx: Context, o: BTSFalse): TPostResult[Context, BTSFalse] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSNull(ctx: Context, o: BTSNull): TPostResult[Context, BTSNull] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSPropertyConstant(ctx: Context, o: BTSPropertyConstant): TPostResult[Context, BTSPropertyConstant] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSPropertyReference(ctx: Context, o: BTSPropertyReference): TPostResult[Context, BTSPropertyReference] = {
      o match {
      }
    }

    @pure def postBTSPropertySetProperty(ctx: Context, o: BTSPropertySetProperty): TPostResult[Context, BTSPropertySetProperty] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSSelfProperty(ctx: Context, o: BTSSelfProperty): TPostResult[Context, BTSSelfProperty] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSComponentProperty(ctx: Context, o: BTSComponentProperty): TPostResult[Context, BTSComponentProperty] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSComponent(ctx: Context, o: BTSComponent): TPostResult[Context, BTSComponent] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSPropertyField(ctx: Context, o: BTSPropertyField): TPostResult[Context, BTSPropertyField] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSUniversalQuantification(ctx: Context, o: BTSUniversalQuantification): TPostResult[Context, BTSUniversalQuantification] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSExistentialQuantification(ctx: Context, o: BTSExistentialQuantification): TPostResult[Context, BTSExistentialQuantification] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSSumQuantification(ctx: Context, o: BTSSumQuantification): TPostResult[Context, BTSSumQuantification] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSProductQuantification(ctx: Context, o: BTSProductQuantification): TPostResult[Context, BTSProductQuantification] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSCountingQuantification(ctx: Context, o: BTSCountingQuantification): TPostResult[Context, BTSCountingQuantification] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSRange(ctx: Context, o: BTSRange): TPostResult[Context, BTSRange] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSTypeLibrary(ctx: Context, o: BTSTypeLibrary): TPostResult[Context, BTSTypeLibrary] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSTypeDeclatation(ctx: Context, o: BTSTypeDeclatation): TPostResult[Context, BTSTypeDeclatation] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSType(ctx: Context, o: BTSType): TPostResult[Context, BTSType] = {
      o match {
        case o: BTSBooleanType =>
          val r: TPostResult[Context, BTSType] = postBTSBooleanType(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSType)) => TPostResult(postCtx, Some[BTSType](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSType")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSType]())
          }
          return r
        case o: BTSStringType =>
          val r: TPostResult[Context, BTSType] = postBTSStringType(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSType)) => TPostResult(postCtx, Some[BTSType](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSType")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSType]())
          }
          return r
        case o: BTSNullType =>
          val r: TPostResult[Context, BTSType] = postBTSNullType(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSType)) => TPostResult(postCtx, Some[BTSType](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSType")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSType]())
          }
          return r
        case o: BTSClassifier =>
          val r: TPostResult[Context, BTSType] = postBTSClassifier(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSType)) => TPostResult(postCtx, Some[BTSType](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSType")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSType]())
          }
          return r
        case o: BTSTypeName =>
          val r: TPostResult[Context, BTSType] = postBTSTypeName(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSType)) => TPostResult(postCtx, Some[BTSType](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSType")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSType]())
          }
          return r
        case o: BTSEnumerationType =>
          val r: TPostResult[Context, BTSType] = postBTSEnumerationType(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSType)) => TPostResult(postCtx, Some[BTSType](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSType")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSType]())
          }
          return r
        case o: BTSQuantityType =>
          val r: TPostResult[Context, BTSType] = postBTSQuantityType(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSType)) => TPostResult(postCtx, Some[BTSType](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSType")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSType]())
          }
          return r
        case o: BTSArrayType =>
          val r: TPostResult[Context, BTSType] = postBTSArrayType(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSType)) => TPostResult(postCtx, Some[BTSType](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSType")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSType]())
          }
          return r
        case o: BTSRecordType =>
          val r: TPostResult[Context, BTSType] = postBTSRecordType(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSType)) => TPostResult(postCtx, Some[BTSType](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSType")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSType]())
          }
          return r
      }
    }

    @pure def postBTSBooleanType(ctx: Context, o: BTSBooleanType): TPostResult[Context, BTSBooleanType] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSStringType(ctx: Context, o: BTSStringType): TPostResult[Context, BTSStringType] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSNullType(ctx: Context, o: BTSNullType): TPostResult[Context, BTSNullType] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSClassifier(ctx: Context, o: BTSClassifier): TPostResult[Context, BTSClassifier] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSTypeName(ctx: Context, o: BTSTypeName): TPostResult[Context, BTSTypeName] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSEnumerationType(ctx: Context, o: BTSEnumerationType): TPostResult[Context, BTSEnumerationType] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSQuantityType(ctx: Context, o: BTSQuantityType): TPostResult[Context, BTSQuantityType] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSArrayType(ctx: Context, o: BTSArrayType): TPostResult[Context, BTSArrayType] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSArrayRange(ctx: Context, o: BTSArrayRange): TPostResult[Context, BTSArrayRange] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSRecordType(ctx: Context, o: BTSRecordType): TPostResult[Context, BTSRecordType] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSRecordField(ctx: Context, o: BTSRecordField): TPostResult[Context, BTSRecordField] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSUnitLibrary(ctx: Context, o: BTSUnitLibrary): TPostResult[Context, BTSUnitLibrary] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSUnitDeclaration(ctx: Context, o: BTSUnitDeclaration): TPostResult[Context, BTSUnitDeclaration] = {
      o match {
        case o: BTSRootDeclaration =>
          val r: TPostResult[Context, BTSUnitDeclaration] = postBTSRootDeclaration(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSUnitDeclaration)) => TPostResult(postCtx, Some[BTSUnitDeclaration](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSUnitDeclaration")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSUnitDeclaration]())
          }
          return r
        case o: BTSUnitExtension =>
          val r: TPostResult[Context, BTSUnitDeclaration] = postBTSUnitExtension(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSUnitDeclaration)) => TPostResult(postCtx, Some[BTSUnitDeclaration](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSUnitDeclaration")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSUnitDeclaration]())
          }
          return r
      }
    }

    @pure def postBTSRootDeclaration(ctx: Context, o: BTSRootDeclaration): TPostResult[Context, BTSRootDeclaration] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSUnitExtension(ctx: Context, o: BTSUnitExtension): TPostResult[Context, BTSUnitExtension] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSUnitName(ctx: Context, o: BTSUnitName): TPostResult[Context, BTSUnitName] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSUnitFormula(ctx: Context, o: BTSUnitFormula): TPostResult[Context, BTSUnitFormula] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSUnitFactor(ctx: Context, o: BTSUnitFactor): TPostResult[Context, BTSUnitFactor] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSQuantity(ctx: Context, o: BTSQuantity): TPostResult[Context, BTSQuantity] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSExceptionLibrary(ctx: Context, o: BTSExceptionLibrary): TPostResult[Context, BTSExceptionLibrary] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSExceptionDeclaration(ctx: Context, o: BTSExceptionDeclaration): TPostResult[Context, BTSExceptionDeclaration] = {
      return TPostResult(ctx, None())
    }

    @pure def postTODO(ctx: Context, o: TODO): TPostResult[Context, TODO] = {
      return TPostResult(ctx, None())
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

}

import Transformer._

@datatype class Transformer[Context](pp: PrePost[Context]) {

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
          val r1: TPostResult[Context, IS[Z, Name]] = transformISZ(r0.ctx, o2.parentType, transformName _)
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
      val r1: TPostResult[Context, IS[Z, Name]] = transformISZ(r0.ctx, o2.parentType, transformName _)
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
        case o2: ErrorTypeDef =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.id)
          val r1: TPostResult[Context, Option[Name]] = transformOption(r0.ctx, o2.extendType, transformName _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), extendType = r1.resultOpt.getOrElse(o2.extendType))))
          else
            TPostResult(r1.ctx, None())
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
        case o2: Emv2Flow =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.identifier)
          val r1: TPostResult[Context, Option[Emv2Propagation]] = transformOption(r0.ctx, o2.sourcePropagation, transformEmv2Propagation _)
          val r2: TPostResult[Context, Option[Emv2Propagation]] = transformOption(r1.ctx, o2.sinkPropagation, transformEmv2Propagation _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(identifier = r0.resultOpt.getOrElse(o2.identifier), sourcePropagation = r1.resultOpt.getOrElse(o2.sourcePropagation), sinkPropagation = r2.resultOpt.getOrElse(o2.sinkPropagation))))
          else
            TPostResult(r2.ctx, None())
        case o2: Flow =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
          val r1: TPostResult[Context, Option[Name]] = transformOption(r0.ctx, o2.source, transformName _)
          val r2: TPostResult[Context, Option[Name]] = transformOption(r1.ctx, o2.sink, transformName _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), source = r1.resultOpt.getOrElse(o2.source), sink = r2.resultOpt.getOrElse(o2.sink))))
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
        case o2: Emv2ElementRef =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
          val r1: TPostResult[Context, IS[Z, Name]] = transformISZ(r0.ctx, o2.errorTypes, transformName _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), errorTypes = r1.resultOpt.getOrElse(o2.errorTypes))))
          else
            TPostResult(r1.ctx, None())
        case o2: AadlElementRef =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name))))
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
          val r1: TPostResult[Context, IS[Z, Name]] = transformISZ(r0.ctx, o2.parentType, transformName _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(typeName = r0.resultOpt.getOrElse(o2.typeName), parentType = r1.resultOpt.getOrElse(o2.parentType))))
          else
            TPostResult(r1.ctx, None())
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
        case o2: OtherAnnex =>
          if (hasChanged)
            TPostResult(preR.ctx, Some(o2))
          else
            TPostResult(preR.ctx, None())
        case o2: BTSBLESSAnnexClause =>
          val r0: TPostResult[Context, IS[Z, BTSAssertion]] = transformISZ(preR.ctx, o2.assertions, transformBTSAssertion _)
          val r1: TPostResult[Context, Option[BTSAssertion]] = transformOption(r0.ctx, o2.invariant, transformBTSAssertion _)
          val r2: TPostResult[Context, IS[Z, BTSVariableDeclaration]] = transformISZ(r1.ctx, o2.variables, transformBTSVariableDeclaration _)
          val r3: TPostResult[Context, IS[Z, BTSStateDeclaration]] = transformISZ(r2.ctx, o2.states, transformBTSStateDeclaration _)
          val r4: TPostResult[Context, IS[Z, BTSTransition]] = transformISZ(r3.ctx, o2.transitions, transformBTSTransition _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
            TPostResult(r4.ctx, Some(o2(assertions = r0.resultOpt.getOrElse(o2.assertions), invariant = r1.resultOpt.getOrElse(o2.invariant), variables = r2.resultOpt.getOrElse(o2.variables), states = r3.resultOpt.getOrElse(o2.states), transitions = r4.resultOpt.getOrElse(o2.transitions))))
          else
            TPostResult(r4.ctx, None())
        case o2: BTSActionAnnexSubclause =>
          val r0: TPostResult[Context, IS[Z, Name]] = transformISZ(preR.ctx, o2.throws, transformName _)
          val r1: TPostResult[Context, IS[Z, BTSAssertion]] = transformISZ(r0.ctx, o2.assertions, transformBTSAssertion _)
          val r2: TPostResult[Context, Option[BTSAssertion]] = transformOption(r1.ctx, o2.precondition, transformBTSAssertion _)
          val r3: TPostResult[Context, Option[BTSAssertion]] = transformOption(r2.ctx, o2.postcondition, transformBTSAssertion _)
          val r4: TPostResult[Context, Option[BTSAssertion]] = transformOption(r3.ctx, o2.invariant, transformBTSAssertion _)
          val r5: TPostResult[Context, BTSExistentialLatticeQuantification] = transformBTSExistentialLatticeQuantification(r4.ctx, o2.elq)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty || r5.resultOpt.nonEmpty)
            TPostResult(r5.ctx, Some(o2(throws = r0.resultOpt.getOrElse(o2.throws), assertions = r1.resultOpt.getOrElse(o2.assertions), precondition = r2.resultOpt.getOrElse(o2.precondition), postcondition = r3.resultOpt.getOrElse(o2.postcondition), invariant = r4.resultOpt.getOrElse(o2.invariant), elq = r5.resultOpt.getOrElse(o2.elq))))
          else
            TPostResult(r5.ctx, None())
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
        case o2: SmfLibrary =>
          val r0: TPostResult[Context, IS[Z, SmfType]] = transformISZ(preR.ctx, o2.types, transformSmfType _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(types = r0.resultOpt.getOrElse(o2.types))))
          else
            TPostResult(r0.ctx, None())
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
        case o2: OtherLib =>
          if (hasChanged)
            TPostResult(preR.ctx, Some(o2))
          else
            TPostResult(preR.ctx, None())
        case o2: BTSTypeLibrary =>
          val r0: TPostResult[Context, IS[Z, BTSTypeDeclatation]] = transformISZ(preR.ctx, o2.typedeclarations, transformBTSTypeDeclatation _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(typedeclarations = r0.resultOpt.getOrElse(o2.typedeclarations))))
          else
            TPostResult(r0.ctx, None())
        case o2: BTSUnitLibrary =>
          val r0: TPostResult[Context, IS[Z, BTSUnitDeclaration]] = transformISZ(preR.ctx, o2.unitDeclarations, transformBTSUnitDeclaration _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(unitDeclarations = r0.resultOpt.getOrElse(o2.unitDeclarations))))
          else
            TPostResult(r0.ctx, None())
        case o2: BTSExceptionLibrary =>
          val r0: TPostResult[Context, IS[Z, BTSExceptionDeclaration]] = transformISZ(preR.ctx, o2.exc, transformBTSExceptionDeclaration _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(exc = r0.resultOpt.getOrElse(o2.exc))))
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

  @pure def transformOtherLib(ctx: Context, o: OtherLib): TPostResult[Context, OtherLib] = {
    val preR: PreResult[Context, OtherLib] = pp.preOtherLib(ctx, o)
    val r: TPostResult[Context, OtherLib] = if (preR.continu) {
      val o2: OtherLib = preR.resultOpt.getOrElse(o)
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
    val o2: OtherLib = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, OtherLib] = pp.postOtherLib(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBLESSAnnex(ctx: Context, o: BLESSAnnex): TPostResult[Context, BLESSAnnex] = {
    val preR: PreResult[Context, BLESSAnnex] = pp.preBLESSAnnex(ctx, o)
    val r: TPostResult[Context, BLESSAnnex] = if (preR.continu) {
      val o2: BLESSAnnex = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, BLESSAnnex] = o2 match {
        case o2: BTSBLESSAnnexClause =>
          val r0: TPostResult[Context, IS[Z, BTSAssertion]] = transformISZ(preR.ctx, o2.assertions, transformBTSAssertion _)
          val r1: TPostResult[Context, Option[BTSAssertion]] = transformOption(r0.ctx, o2.invariant, transformBTSAssertion _)
          val r2: TPostResult[Context, IS[Z, BTSVariableDeclaration]] = transformISZ(r1.ctx, o2.variables, transformBTSVariableDeclaration _)
          val r3: TPostResult[Context, IS[Z, BTSStateDeclaration]] = transformISZ(r2.ctx, o2.states, transformBTSStateDeclaration _)
          val r4: TPostResult[Context, IS[Z, BTSTransition]] = transformISZ(r3.ctx, o2.transitions, transformBTSTransition _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
            TPostResult(r4.ctx, Some(o2(assertions = r0.resultOpt.getOrElse(o2.assertions), invariant = r1.resultOpt.getOrElse(o2.invariant), variables = r2.resultOpt.getOrElse(o2.variables), states = r3.resultOpt.getOrElse(o2.states), transitions = r4.resultOpt.getOrElse(o2.transitions))))
          else
            TPostResult(r4.ctx, None())
        case o2: BTSActionAnnexSubclause =>
          val r0: TPostResult[Context, IS[Z, Name]] = transformISZ(preR.ctx, o2.throws, transformName _)
          val r1: TPostResult[Context, IS[Z, BTSAssertion]] = transformISZ(r0.ctx, o2.assertions, transformBTSAssertion _)
          val r2: TPostResult[Context, Option[BTSAssertion]] = transformOption(r1.ctx, o2.precondition, transformBTSAssertion _)
          val r3: TPostResult[Context, Option[BTSAssertion]] = transformOption(r2.ctx, o2.postcondition, transformBTSAssertion _)
          val r4: TPostResult[Context, Option[BTSAssertion]] = transformOption(r3.ctx, o2.invariant, transformBTSAssertion _)
          val r5: TPostResult[Context, BTSExistentialLatticeQuantification] = transformBTSExistentialLatticeQuantification(r4.ctx, o2.elq)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty || r5.resultOpt.nonEmpty)
            TPostResult(r5.ctx, Some(o2(throws = r0.resultOpt.getOrElse(o2.throws), assertions = r1.resultOpt.getOrElse(o2.assertions), precondition = r2.resultOpt.getOrElse(o2.precondition), postcondition = r3.resultOpt.getOrElse(o2.postcondition), invariant = r4.resultOpt.getOrElse(o2.invariant), elq = r5.resultOpt.getOrElse(o2.elq))))
          else
            TPostResult(r5.ctx, None())
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BLESSAnnex = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BLESSAnnex] = pp.postBLESSAnnex(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSBLESSAnnexClause(ctx: Context, o: BTSBLESSAnnexClause): TPostResult[Context, BTSBLESSAnnexClause] = {
    val preR: PreResult[Context, BTSBLESSAnnexClause] = pp.preBTSBLESSAnnexClause(ctx, o)
    val r: TPostResult[Context, BTSBLESSAnnexClause] = if (preR.continu) {
      val o2: BTSBLESSAnnexClause = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, BTSAssertion]] = transformISZ(preR.ctx, o2.assertions, transformBTSAssertion _)
      val r1: TPostResult[Context, Option[BTSAssertion]] = transformOption(r0.ctx, o2.invariant, transformBTSAssertion _)
      val r2: TPostResult[Context, IS[Z, BTSVariableDeclaration]] = transformISZ(r1.ctx, o2.variables, transformBTSVariableDeclaration _)
      val r3: TPostResult[Context, IS[Z, BTSStateDeclaration]] = transformISZ(r2.ctx, o2.states, transformBTSStateDeclaration _)
      val r4: TPostResult[Context, IS[Z, BTSTransition]] = transformISZ(r3.ctx, o2.transitions, transformBTSTransition _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
        TPostResult(r4.ctx, Some(o2(assertions = r0.resultOpt.getOrElse(o2.assertions), invariant = r1.resultOpt.getOrElse(o2.invariant), variables = r2.resultOpt.getOrElse(o2.variables), states = r3.resultOpt.getOrElse(o2.states), transitions = r4.resultOpt.getOrElse(o2.transitions))))
      else
        TPostResult(r4.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSBLESSAnnexClause = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSBLESSAnnexClause] = pp.postBTSBLESSAnnexClause(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSVariableDeclaration(ctx: Context, o: BTSVariableDeclaration): TPostResult[Context, BTSVariableDeclaration] = {
    val preR: PreResult[Context, BTSVariableDeclaration] = pp.preBTSVariableDeclaration(ctx, o)
    val r: TPostResult[Context, BTSVariableDeclaration] = if (preR.continu) {
      val o2: BTSVariableDeclaration = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
      val r1: TPostResult[Context, BTSType] = transformBTSType(r0.ctx, o2.varType)
      val r2: TPostResult[Context, Option[BTSExp]] = transformOption(r1.ctx, o2.assignExpression, transformBTSExp _)
      val r3: TPostResult[Context, Option[BTSExp]] = transformOption(r2.ctx, o2.arraySize, transformBTSExp _)
      val r4: TPostResult[Context, Option[BTSAssertion]] = transformOption(r3.ctx, o2.variableAssertion, transformBTSAssertion _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
        TPostResult(r4.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), varType = r1.resultOpt.getOrElse(o2.varType), assignExpression = r2.resultOpt.getOrElse(o2.assignExpression), arraySize = r3.resultOpt.getOrElse(o2.arraySize), variableAssertion = r4.resultOpt.getOrElse(o2.variableAssertion))))
      else
        TPostResult(r4.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSVariableDeclaration = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSVariableDeclaration] = pp.postBTSVariableDeclaration(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSStateDeclaration(ctx: Context, o: BTSStateDeclaration): TPostResult[Context, BTSStateDeclaration] = {
    val preR: PreResult[Context, BTSStateDeclaration] = pp.preBTSStateDeclaration(ctx, o)
    val r: TPostResult[Context, BTSStateDeclaration] = if (preR.continu) {
      val o2: BTSStateDeclaration = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.id)
      val r1: TPostResult[Context, Option[BTSAssertion]] = transformOption(r0.ctx, o2.assertion, transformBTSAssertion _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), assertion = r1.resultOpt.getOrElse(o2.assertion))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSStateDeclaration = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSStateDeclaration] = pp.postBTSStateDeclaration(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSTransition(ctx: Context, o: BTSTransition): TPostResult[Context, BTSTransition] = {
    val preR: PreResult[Context, BTSTransition] = pp.preBTSTransition(ctx, o)
    val r: TPostResult[Context, BTSTransition] = if (preR.continu) {
      val o2: BTSTransition = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, BTSTransitionLabel] = transformBTSTransitionLabel(preR.ctx, o2.label)
      val r1: TPostResult[Context, IS[Z, Name]] = transformISZ(r0.ctx, o2.sourceStates, transformName _)
      val r2: TPostResult[Context, Name] = transformName(r1.ctx, o2.destState)
      val r3: TPostResult[Context, Option[BTSTransitionCondition]] = transformOption(r2.ctx, o2.transitionCondition, transformBTSTransitionCondition _)
      val r4: TPostResult[Context, Option[BTSBehaviorActions]] = transformOption(r3.ctx, o2.actions, transformBTSBehaviorActions _)
      val r5: TPostResult[Context, Option[BTSAssertion]] = transformOption(r4.ctx, o2.assertion, transformBTSAssertion _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty || r5.resultOpt.nonEmpty)
        TPostResult(r5.ctx, Some(o2(label = r0.resultOpt.getOrElse(o2.label), sourceStates = r1.resultOpt.getOrElse(o2.sourceStates), destState = r2.resultOpt.getOrElse(o2.destState), transitionCondition = r3.resultOpt.getOrElse(o2.transitionCondition), actions = r4.resultOpt.getOrElse(o2.actions), assertion = r5.resultOpt.getOrElse(o2.assertion))))
      else
        TPostResult(r5.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSTransition = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSTransition] = pp.postBTSTransition(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSTransitionLabel(ctx: Context, o: BTSTransitionLabel): TPostResult[Context, BTSTransitionLabel] = {
    val preR: PreResult[Context, BTSTransitionLabel] = pp.preBTSTransitionLabel(ctx, o)
    val r: TPostResult[Context, BTSTransitionLabel] = if (preR.continu) {
      val o2: BTSTransitionLabel = preR.resultOpt.getOrElse(o)
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
    val o2: BTSTransitionLabel = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSTransitionLabel] = pp.postBTSTransitionLabel(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSTransitionCondition(ctx: Context, o: BTSTransitionCondition): TPostResult[Context, BTSTransitionCondition] = {
    val preR: PreResult[Context, BTSTransitionCondition] = pp.preBTSTransitionCondition(ctx, o)
    val r: TPostResult[Context, BTSTransitionCondition] = if (preR.continu) {
      val o2: BTSTransitionCondition = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, BTSTransitionCondition] = o2 match {
        case o2: BTSDispatchCondition =>
          val r0: TPostResult[Context, IS[Z, BTSDispatchConjunction]] = transformISZ(preR.ctx, o2.conjunctions, transformBTSDispatchConjunction _)
          val r1: TPostResult[Context, Name] = transformName(r0.ctx, o2.subprogramaccessdispatch)
          val r2: TPostResult[Context, IS[Z, Name]] = transformISZ(r1.ctx, o2.frozenPorts, transformName _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(conjunctions = r0.resultOpt.getOrElse(o2.conjunctions), subprogramaccessdispatch = r1.resultOpt.getOrElse(o2.subprogramaccessdispatch), frozenPorts = r2.resultOpt.getOrElse(o2.frozenPorts))))
          else
            TPostResult(r2.ctx, None())
        case o2: BTSExecuteConditionExp =>
          val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.exp)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(exp = r0.resultOpt.getOrElse(o2.exp))))
          else
            TPostResult(r0.ctx, None())
        case o2: BTSExecuteConditionTimeout =>
          if (hasChanged)
            TPostResult(preR.ctx, Some(o2))
          else
            TPostResult(preR.ctx, None())
        case o2: BTSExecuteConditionOtherwise =>
          if (hasChanged)
            TPostResult(preR.ctx, Some(o2))
          else
            TPostResult(preR.ctx, None())
        case o2: BTSModeCondition =>
          val r0: TPostResult[Context, BTSTriggerLogicalExpression] = transformBTSTriggerLogicalExpression(preR.ctx, o2.tle)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(tle = r0.resultOpt.getOrElse(o2.tle))))
          else
            TPostResult(r0.ctx, None())
        case o2: BTSInternalCondition =>
          val r0: TPostResult[Context, IS[Z, Name]] = transformISZ(preR.ctx, o2.internalports, transformName _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(internalports = r0.resultOpt.getOrElse(o2.internalports))))
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
    val o2: BTSTransitionCondition = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSTransitionCondition] = pp.postBTSTransitionCondition(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSDispatchCondition(ctx: Context, o: BTSDispatchCondition): TPostResult[Context, BTSDispatchCondition] = {
    val preR: PreResult[Context, BTSDispatchCondition] = pp.preBTSDispatchCondition(ctx, o)
    val r: TPostResult[Context, BTSDispatchCondition] = if (preR.continu) {
      val o2: BTSDispatchCondition = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, BTSDispatchConjunction]] = transformISZ(preR.ctx, o2.conjunctions, transformBTSDispatchConjunction _)
      val r1: TPostResult[Context, Name] = transformName(r0.ctx, o2.subprogramaccessdispatch)
      val r2: TPostResult[Context, IS[Z, Name]] = transformISZ(r1.ctx, o2.frozenPorts, transformName _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        TPostResult(r2.ctx, Some(o2(conjunctions = r0.resultOpt.getOrElse(o2.conjunctions), subprogramaccessdispatch = r1.resultOpt.getOrElse(o2.subprogramaccessdispatch), frozenPorts = r2.resultOpt.getOrElse(o2.frozenPorts))))
      else
        TPostResult(r2.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSDispatchCondition = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSDispatchCondition] = pp.postBTSDispatchCondition(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSDispatchConjunction(ctx: Context, o: BTSDispatchConjunction): TPostResult[Context, BTSDispatchConjunction] = {
    val preR: PreResult[Context, BTSDispatchConjunction] = pp.preBTSDispatchConjunction(ctx, o)
    val r: TPostResult[Context, BTSDispatchConjunction] = if (preR.continu) {
      val o2: BTSDispatchConjunction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, BTSDispatchTrigger]] = transformISZ(preR.ctx, o2.triggers, transformBTSDispatchTrigger _)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(triggers = r0.resultOpt.getOrElse(o2.triggers))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSDispatchConjunction = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSDispatchConjunction] = pp.postBTSDispatchConjunction(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSDispatchTrigger(ctx: Context, o: BTSDispatchTrigger): TPostResult[Context, BTSDispatchTrigger] = {
    val preR: PreResult[Context, BTSDispatchTrigger] = pp.preBTSDispatchTrigger(ctx, o)
    val r: TPostResult[Context, BTSDispatchTrigger] = if (preR.continu) {
      val o2: BTSDispatchTrigger = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, BTSDispatchTrigger] = o2 match {
        case o2: BTSDispatchTriggerStop =>
          if (hasChanged)
            TPostResult(preR.ctx, Some(o2))
          else
            TPostResult(preR.ctx, None())
        case o2: BTSDispatchTriggerPort =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.port)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(port = r0.resultOpt.getOrElse(o2.port))))
          else
            TPostResult(r0.ctx, None())
        case o2: BTSDispatchTriggerTimeout =>
          val r0: TPostResult[Context, IS[Z, Name]] = transformISZ(preR.ctx, o2.ports, transformName _)
          val r1: TPostResult[Context, Option[BTSExp]] = transformOption(r0.ctx, o2.time, transformBTSExp _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(ports = r0.resultOpt.getOrElse(o2.ports), time = r1.resultOpt.getOrElse(o2.time))))
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
    val o2: BTSDispatchTrigger = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSDispatchTrigger] = pp.postBTSDispatchTrigger(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSDispatchTriggerStop(ctx: Context, o: BTSDispatchTriggerStop): TPostResult[Context, BTSDispatchTriggerStop] = {
    val preR: PreResult[Context, BTSDispatchTriggerStop] = pp.preBTSDispatchTriggerStop(ctx, o)
    val r: TPostResult[Context, BTSDispatchTriggerStop] = if (preR.continu) {
      val o2: BTSDispatchTriggerStop = preR.resultOpt.getOrElse(o)
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
    val o2: BTSDispatchTriggerStop = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSDispatchTriggerStop] = pp.postBTSDispatchTriggerStop(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSDispatchTriggerPort(ctx: Context, o: BTSDispatchTriggerPort): TPostResult[Context, BTSDispatchTriggerPort] = {
    val preR: PreResult[Context, BTSDispatchTriggerPort] = pp.preBTSDispatchTriggerPort(ctx, o)
    val r: TPostResult[Context, BTSDispatchTriggerPort] = if (preR.continu) {
      val o2: BTSDispatchTriggerPort = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.port)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(port = r0.resultOpt.getOrElse(o2.port))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSDispatchTriggerPort = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSDispatchTriggerPort] = pp.postBTSDispatchTriggerPort(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSDispatchTriggerTimeout(ctx: Context, o: BTSDispatchTriggerTimeout): TPostResult[Context, BTSDispatchTriggerTimeout] = {
    val preR: PreResult[Context, BTSDispatchTriggerTimeout] = pp.preBTSDispatchTriggerTimeout(ctx, o)
    val r: TPostResult[Context, BTSDispatchTriggerTimeout] = if (preR.continu) {
      val o2: BTSDispatchTriggerTimeout = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, Name]] = transformISZ(preR.ctx, o2.ports, transformName _)
      val r1: TPostResult[Context, Option[BTSExp]] = transformOption(r0.ctx, o2.time, transformBTSExp _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(ports = r0.resultOpt.getOrElse(o2.ports), time = r1.resultOpt.getOrElse(o2.time))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSDispatchTriggerTimeout = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSDispatchTriggerTimeout] = pp.postBTSDispatchTriggerTimeout(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSExecuteCondition(ctx: Context, o: BTSExecuteCondition): TPostResult[Context, BTSExecuteCondition] = {
    val preR: PreResult[Context, BTSExecuteCondition] = pp.preBTSExecuteCondition(ctx, o)
    val r: TPostResult[Context, BTSExecuteCondition] = if (preR.continu) {
      val o2: BTSExecuteCondition = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, BTSExecuteCondition] = o2 match {
        case o2: BTSExecuteConditionExp =>
          val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.exp)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(exp = r0.resultOpt.getOrElse(o2.exp))))
          else
            TPostResult(r0.ctx, None())
        case o2: BTSExecuteConditionTimeout =>
          if (hasChanged)
            TPostResult(preR.ctx, Some(o2))
          else
            TPostResult(preR.ctx, None())
        case o2: BTSExecuteConditionOtherwise =>
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
    val o2: BTSExecuteCondition = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSExecuteCondition] = pp.postBTSExecuteCondition(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSExecuteConditionExp(ctx: Context, o: BTSExecuteConditionExp): TPostResult[Context, BTSExecuteConditionExp] = {
    val preR: PreResult[Context, BTSExecuteConditionExp] = pp.preBTSExecuteConditionExp(ctx, o)
    val r: TPostResult[Context, BTSExecuteConditionExp] = if (preR.continu) {
      val o2: BTSExecuteConditionExp = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.exp)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(exp = r0.resultOpt.getOrElse(o2.exp))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSExecuteConditionExp = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSExecuteConditionExp] = pp.postBTSExecuteConditionExp(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSExecuteConditionTimeout(ctx: Context, o: BTSExecuteConditionTimeout): TPostResult[Context, BTSExecuteConditionTimeout] = {
    val preR: PreResult[Context, BTSExecuteConditionTimeout] = pp.preBTSExecuteConditionTimeout(ctx, o)
    val r: TPostResult[Context, BTSExecuteConditionTimeout] = if (preR.continu) {
      val o2: BTSExecuteConditionTimeout = preR.resultOpt.getOrElse(o)
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
    val o2: BTSExecuteConditionTimeout = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSExecuteConditionTimeout] = pp.postBTSExecuteConditionTimeout(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSExecuteConditionOtherwise(ctx: Context, o: BTSExecuteConditionOtherwise): TPostResult[Context, BTSExecuteConditionOtherwise] = {
    val preR: PreResult[Context, BTSExecuteConditionOtherwise] = pp.preBTSExecuteConditionOtherwise(ctx, o)
    val r: TPostResult[Context, BTSExecuteConditionOtherwise] = if (preR.continu) {
      val o2: BTSExecuteConditionOtherwise = preR.resultOpt.getOrElse(o)
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
    val o2: BTSExecuteConditionOtherwise = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSExecuteConditionOtherwise] = pp.postBTSExecuteConditionOtherwise(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSModeCondition(ctx: Context, o: BTSModeCondition): TPostResult[Context, BTSModeCondition] = {
    val preR: PreResult[Context, BTSModeCondition] = pp.preBTSModeCondition(ctx, o)
    val r: TPostResult[Context, BTSModeCondition] = if (preR.continu) {
      val o2: BTSModeCondition = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, BTSTriggerLogicalExpression] = transformBTSTriggerLogicalExpression(preR.ctx, o2.tle)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(tle = r0.resultOpt.getOrElse(o2.tle))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSModeCondition = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSModeCondition] = pp.postBTSModeCondition(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSTriggerLogicalExpression(ctx: Context, o: BTSTriggerLogicalExpression): TPostResult[Context, BTSTriggerLogicalExpression] = {
    val preR: PreResult[Context, BTSTriggerLogicalExpression] = pp.preBTSTriggerLogicalExpression(ctx, o)
    val r: TPostResult[Context, BTSTriggerLogicalExpression] = if (preR.continu) {
      val o2: BTSTriggerLogicalExpression = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, BTSEventTrigger]] = transformISZ(preR.ctx, o2.triggers, transformBTSEventTrigger _)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(triggers = r0.resultOpt.getOrElse(o2.triggers))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSTriggerLogicalExpression = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSTriggerLogicalExpression] = pp.postBTSTriggerLogicalExpression(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSEventTrigger(ctx: Context, o: BTSEventTrigger): TPostResult[Context, BTSEventTrigger] = {
    val preR: PreResult[Context, BTSEventTrigger] = pp.preBTSEventTrigger(ctx, o)
    val r: TPostResult[Context, BTSEventTrigger] = if (preR.continu) {
      val o2: BTSEventTrigger = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, BTSEventTrigger] = o2 match {
        case o2: BTSTriggerLogicalExpression =>
          val r0: TPostResult[Context, IS[Z, BTSEventTrigger]] = transformISZ(preR.ctx, o2.triggers, transformBTSEventTrigger _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(triggers = r0.resultOpt.getOrElse(o2.triggers))))
          else
            TPostResult(r0.ctx, None())
        case o2: BTSSubcomponentPort =>
          val r0: TPostResult[Context, IS[Z, Name]] = transformISZ(preR.ctx, o2.sub, transformName _)
          val r1: TPostResult[Context, Name] = transformName(r0.ctx, o2.port)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(sub = r0.resultOpt.getOrElse(o2.sub), port = r1.resultOpt.getOrElse(o2.port))))
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
    val o2: BTSEventTrigger = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSEventTrigger] = pp.postBTSEventTrigger(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSSubcomponentPort(ctx: Context, o: BTSSubcomponentPort): TPostResult[Context, BTSSubcomponentPort] = {
    val preR: PreResult[Context, BTSSubcomponentPort] = pp.preBTSSubcomponentPort(ctx, o)
    val r: TPostResult[Context, BTSSubcomponentPort] = if (preR.continu) {
      val o2: BTSSubcomponentPort = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, Name]] = transformISZ(preR.ctx, o2.sub, transformName _)
      val r1: TPostResult[Context, Name] = transformName(r0.ctx, o2.port)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(sub = r0.resultOpt.getOrElse(o2.sub), port = r1.resultOpt.getOrElse(o2.port))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSSubcomponentPort = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSSubcomponentPort] = pp.postBTSSubcomponentPort(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSInternalCondition(ctx: Context, o: BTSInternalCondition): TPostResult[Context, BTSInternalCondition] = {
    val preR: PreResult[Context, BTSInternalCondition] = pp.preBTSInternalCondition(ctx, o)
    val r: TPostResult[Context, BTSInternalCondition] = if (preR.continu) {
      val o2: BTSInternalCondition = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, Name]] = transformISZ(preR.ctx, o2.internalports, transformName _)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(internalports = r0.resultOpt.getOrElse(o2.internalports))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSInternalCondition = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSInternalCondition] = pp.postBTSInternalCondition(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSAssertion(ctx: Context, o: BTSAssertion): TPostResult[Context, BTSAssertion] = {
    val preR: PreResult[Context, BTSAssertion] = pp.preBTSAssertion(ctx, o)
    val r: TPostResult[Context, BTSAssertion] = if (preR.continu) {
      val o2: BTSAssertion = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, BTSAssertion] = o2 match {
        case o2: BTSNamedAssertion =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.label)
          val r1: TPostResult[Context, IS[Z, BTSVariable]] = transformISZ(r0.ctx, o2.formals, transformBTSVariable _)
          val r2: TPostResult[Context, BTSExp] = transformBTSExp(r1.ctx, o2.predicate)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(label = r0.resultOpt.getOrElse(o2.label), formals = r1.resultOpt.getOrElse(o2.formals), predicate = r2.resultOpt.getOrElse(o2.predicate))))
          else
            TPostResult(r2.ctx, None())
        case o2: BTSNamedFunction =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.label)
          val r1: TPostResult[Context, IS[Z, BTSVariable]] = transformISZ(r0.ctx, o2.formals, transformBTSVariable _)
          val r2: TPostResult[Context, BTSType] = transformBTSType(r1.ctx, o2.returns)
          val r3: TPostResult[Context, BTSExp] = transformBTSExp(r2.ctx, o2.functionvalue)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(label = r0.resultOpt.getOrElse(o2.label), formals = r1.resultOpt.getOrElse(o2.formals), returns = r2.resultOpt.getOrElse(o2.returns), functionvalue = r3.resultOpt.getOrElse(o2.functionvalue))))
          else
            TPostResult(r3.ctx, None())
        case o2: BTSNamedEnumeration =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.label)
          val r1: TPostResult[Context, Name] = transformName(r0.ctx, o2.assertionvariable)
          val r2: TPostResult[Context, BTSType] = transformBTSType(r1.ctx, o2.enumerationtype)
          val r3: TPostResult[Context, BTSAssertionEnumeration] = transformBTSAssertionEnumeration(r2.ctx, o2.enumeration)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(label = r0.resultOpt.getOrElse(o2.label), assertionvariable = r1.resultOpt.getOrElse(o2.assertionvariable), enumerationtype = r2.resultOpt.getOrElse(o2.enumerationtype), enumeration = r3.resultOpt.getOrElse(o2.enumeration))))
          else
            TPostResult(r3.ctx, None())
        case o2: BTSNamelessAssertion =>
          val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.predicate)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(predicate = r0.resultOpt.getOrElse(o2.predicate))))
          else
            TPostResult(r0.ctx, None())
        case o2: BTSNamelessFunction =>
          val r0: TPostResult[Context, BTSType] = transformBTSType(preR.ctx, o2.returns)
          val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.functionvalue)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(returns = r0.resultOpt.getOrElse(o2.returns), functionvalue = r1.resultOpt.getOrElse(o2.functionvalue))))
          else
            TPostResult(r1.ctx, None())
        case o2: BTSNamelessEnumeration =>
          val r0: TPostResult[Context, BTSInvocation] = transformBTSInvocation(preR.ctx, o2.enumeration)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(enumeration = r0.resultOpt.getOrElse(o2.enumeration))))
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
    val o2: BTSAssertion = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSAssertion] = pp.postBTSAssertion(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSNamedAssertion(ctx: Context, o: BTSNamedAssertion): TPostResult[Context, BTSNamedAssertion] = {
    val preR: PreResult[Context, BTSNamedAssertion] = pp.preBTSNamedAssertion(ctx, o)
    val r: TPostResult[Context, BTSNamedAssertion] = if (preR.continu) {
      val o2: BTSNamedAssertion = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.label)
      val r1: TPostResult[Context, IS[Z, BTSVariable]] = transformISZ(r0.ctx, o2.formals, transformBTSVariable _)
      val r2: TPostResult[Context, BTSExp] = transformBTSExp(r1.ctx, o2.predicate)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        TPostResult(r2.ctx, Some(o2(label = r0.resultOpt.getOrElse(o2.label), formals = r1.resultOpt.getOrElse(o2.formals), predicate = r2.resultOpt.getOrElse(o2.predicate))))
      else
        TPostResult(r2.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSNamedAssertion = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSNamedAssertion] = pp.postBTSNamedAssertion(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSNamedFunction(ctx: Context, o: BTSNamedFunction): TPostResult[Context, BTSNamedFunction] = {
    val preR: PreResult[Context, BTSNamedFunction] = pp.preBTSNamedFunction(ctx, o)
    val r: TPostResult[Context, BTSNamedFunction] = if (preR.continu) {
      val o2: BTSNamedFunction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.label)
      val r1: TPostResult[Context, IS[Z, BTSVariable]] = transformISZ(r0.ctx, o2.formals, transformBTSVariable _)
      val r2: TPostResult[Context, BTSType] = transformBTSType(r1.ctx, o2.returns)
      val r3: TPostResult[Context, BTSExp] = transformBTSExp(r2.ctx, o2.functionvalue)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
        TPostResult(r3.ctx, Some(o2(label = r0.resultOpt.getOrElse(o2.label), formals = r1.resultOpt.getOrElse(o2.formals), returns = r2.resultOpt.getOrElse(o2.returns), functionvalue = r3.resultOpt.getOrElse(o2.functionvalue))))
      else
        TPostResult(r3.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSNamedFunction = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSNamedFunction] = pp.postBTSNamedFunction(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSNamedEnumeration(ctx: Context, o: BTSNamedEnumeration): TPostResult[Context, BTSNamedEnumeration] = {
    val preR: PreResult[Context, BTSNamedEnumeration] = pp.preBTSNamedEnumeration(ctx, o)
    val r: TPostResult[Context, BTSNamedEnumeration] = if (preR.continu) {
      val o2: BTSNamedEnumeration = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.label)
      val r1: TPostResult[Context, Name] = transformName(r0.ctx, o2.assertionvariable)
      val r2: TPostResult[Context, BTSType] = transformBTSType(r1.ctx, o2.enumerationtype)
      val r3: TPostResult[Context, BTSAssertionEnumeration] = transformBTSAssertionEnumeration(r2.ctx, o2.enumeration)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
        TPostResult(r3.ctx, Some(o2(label = r0.resultOpt.getOrElse(o2.label), assertionvariable = r1.resultOpt.getOrElse(o2.assertionvariable), enumerationtype = r2.resultOpt.getOrElse(o2.enumerationtype), enumeration = r3.resultOpt.getOrElse(o2.enumeration))))
      else
        TPostResult(r3.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSNamedEnumeration = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSNamedEnumeration] = pp.postBTSNamedEnumeration(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSNamelessAssertion(ctx: Context, o: BTSNamelessAssertion): TPostResult[Context, BTSNamelessAssertion] = {
    val preR: PreResult[Context, BTSNamelessAssertion] = pp.preBTSNamelessAssertion(ctx, o)
    val r: TPostResult[Context, BTSNamelessAssertion] = if (preR.continu) {
      val o2: BTSNamelessAssertion = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.predicate)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(predicate = r0.resultOpt.getOrElse(o2.predicate))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSNamelessAssertion = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSNamelessAssertion] = pp.postBTSNamelessAssertion(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSNamelessFunction(ctx: Context, o: BTSNamelessFunction): TPostResult[Context, BTSNamelessFunction] = {
    val preR: PreResult[Context, BTSNamelessFunction] = pp.preBTSNamelessFunction(ctx, o)
    val r: TPostResult[Context, BTSNamelessFunction] = if (preR.continu) {
      val o2: BTSNamelessFunction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, BTSType] = transformBTSType(preR.ctx, o2.returns)
      val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.functionvalue)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(returns = r0.resultOpt.getOrElse(o2.returns), functionvalue = r1.resultOpt.getOrElse(o2.functionvalue))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSNamelessFunction = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSNamelessFunction] = pp.postBTSNamelessFunction(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSNamelessEnumeration(ctx: Context, o: BTSNamelessEnumeration): TPostResult[Context, BTSNamelessEnumeration] = {
    val preR: PreResult[Context, BTSNamelessEnumeration] = pp.preBTSNamelessEnumeration(ctx, o)
    val r: TPostResult[Context, BTSNamelessEnumeration] = if (preR.continu) {
      val o2: BTSNamelessEnumeration = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, BTSInvocation] = transformBTSInvocation(preR.ctx, o2.enumeration)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(enumeration = r0.resultOpt.getOrElse(o2.enumeration))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSNamelessEnumeration = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSNamelessEnumeration] = pp.postBTSNamelessEnumeration(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSAssertionEnumeration(ctx: Context, o: BTSAssertionEnumeration): TPostResult[Context, BTSAssertionEnumeration] = {
    val preR: PreResult[Context, BTSAssertionEnumeration] = pp.preBTSAssertionEnumeration(ctx, o)
    val r: TPostResult[Context, BTSAssertionEnumeration] = if (preR.continu) {
      val o2: BTSAssertionEnumeration = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, BTSAssertionEnumeration] = o2 match {
        case o2: BTSEnumerationPairs =>
          val r0: TPostResult[Context, IS[Z, BTSEnumerationPair]] = transformISZ(preR.ctx, o2.pairs, transformBTSEnumerationPair _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(pairs = r0.resultOpt.getOrElse(o2.pairs))))
          else
            TPostResult(r0.ctx, None())
        case o2: BTSInvocation =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.label)
          val r1: TPostResult[Context, IS[Z, BTSActualParameter]] = transformISZ(r0.ctx, o2.params, transformBTSActualParameter _)
          val r2: TPostResult[Context, Option[BTSExp]] = transformOption(r1.ctx, o2.actual, transformBTSExp _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(label = r0.resultOpt.getOrElse(o2.label), params = r1.resultOpt.getOrElse(o2.params), actual = r2.resultOpt.getOrElse(o2.actual))))
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
    val o2: BTSAssertionEnumeration = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSAssertionEnumeration] = pp.postBTSAssertionEnumeration(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSEnumerationPairs(ctx: Context, o: BTSEnumerationPairs): TPostResult[Context, BTSEnumerationPairs] = {
    val preR: PreResult[Context, BTSEnumerationPairs] = pp.preBTSEnumerationPairs(ctx, o)
    val r: TPostResult[Context, BTSEnumerationPairs] = if (preR.continu) {
      val o2: BTSEnumerationPairs = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, BTSEnumerationPair]] = transformISZ(preR.ctx, o2.pairs, transformBTSEnumerationPair _)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(pairs = r0.resultOpt.getOrElse(o2.pairs))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSEnumerationPairs = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSEnumerationPairs] = pp.postBTSEnumerationPairs(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSEnumerationPair(ctx: Context, o: BTSEnumerationPair): TPostResult[Context, BTSEnumerationPair] = {
    val preR: PreResult[Context, BTSEnumerationPair] = pp.preBTSEnumerationPair(ctx, o)
    val r: TPostResult[Context, BTSEnumerationPair] = if (preR.continu) {
      val o2: BTSEnumerationPair = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.literal)
      val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.predicate)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(literal = r0.resultOpt.getOrElse(o2.literal), predicate = r1.resultOpt.getOrElse(o2.predicate))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSEnumerationPair = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSEnumerationPair] = pp.postBTSEnumerationPair(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSInvocation(ctx: Context, o: BTSInvocation): TPostResult[Context, BTSInvocation] = {
    val preR: PreResult[Context, BTSInvocation] = pp.preBTSInvocation(ctx, o)
    val r: TPostResult[Context, BTSInvocation] = if (preR.continu) {
      val o2: BTSInvocation = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.label)
      val r1: TPostResult[Context, IS[Z, BTSActualParameter]] = transformISZ(r0.ctx, o2.params, transformBTSActualParameter _)
      val r2: TPostResult[Context, Option[BTSExp]] = transformOption(r1.ctx, o2.actual, transformBTSExp _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        TPostResult(r2.ctx, Some(o2(label = r0.resultOpt.getOrElse(o2.label), params = r1.resultOpt.getOrElse(o2.params), actual = r2.resultOpt.getOrElse(o2.actual))))
      else
        TPostResult(r2.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSInvocation = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSInvocation] = pp.postBTSInvocation(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSActualParameter(ctx: Context, o: BTSActualParameter): TPostResult[Context, BTSActualParameter] = {
    val preR: PreResult[Context, BTSActualParameter] = pp.preBTSActualParameter(ctx, o)
    val r: TPostResult[Context, BTSActualParameter] = if (preR.continu) {
      val o2: BTSActualParameter = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.formal)
      val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.actual)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(formal = r0.resultOpt.getOrElse(o2.formal), actual = r1.resultOpt.getOrElse(o2.actual))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSActualParameter = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSActualParameter] = pp.postBTSActualParameter(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSVariable(ctx: Context, o: BTSVariable): TPostResult[Context, BTSVariable] = {
    val preR: PreResult[Context, BTSVariable] = pp.preBTSVariable(ctx, o)
    val r: TPostResult[Context, BTSVariable] = if (preR.continu) {
      val o2: BTSVariable = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
      val r1: TPostResult[Context, BTSType] = transformBTSType(r0.ctx, o2.typ)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), typ = r1.resultOpt.getOrElse(o2.typ))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSVariable = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSVariable] = pp.postBTSVariable(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSActionAnnexSubclause(ctx: Context, o: BTSActionAnnexSubclause): TPostResult[Context, BTSActionAnnexSubclause] = {
    val preR: PreResult[Context, BTSActionAnnexSubclause] = pp.preBTSActionAnnexSubclause(ctx, o)
    val r: TPostResult[Context, BTSActionAnnexSubclause] = if (preR.continu) {
      val o2: BTSActionAnnexSubclause = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, Name]] = transformISZ(preR.ctx, o2.throws, transformName _)
      val r1: TPostResult[Context, IS[Z, BTSAssertion]] = transformISZ(r0.ctx, o2.assertions, transformBTSAssertion _)
      val r2: TPostResult[Context, Option[BTSAssertion]] = transformOption(r1.ctx, o2.precondition, transformBTSAssertion _)
      val r3: TPostResult[Context, Option[BTSAssertion]] = transformOption(r2.ctx, o2.postcondition, transformBTSAssertion _)
      val r4: TPostResult[Context, Option[BTSAssertion]] = transformOption(r3.ctx, o2.invariant, transformBTSAssertion _)
      val r5: TPostResult[Context, BTSExistentialLatticeQuantification] = transformBTSExistentialLatticeQuantification(r4.ctx, o2.elq)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty || r5.resultOpt.nonEmpty)
        TPostResult(r5.ctx, Some(o2(throws = r0.resultOpt.getOrElse(o2.throws), assertions = r1.resultOpt.getOrElse(o2.assertions), precondition = r2.resultOpt.getOrElse(o2.precondition), postcondition = r3.resultOpt.getOrElse(o2.postcondition), invariant = r4.resultOpt.getOrElse(o2.invariant), elq = r5.resultOpt.getOrElse(o2.elq))))
      else
        TPostResult(r5.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSActionAnnexSubclause = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSActionAnnexSubclause] = pp.postBTSActionAnnexSubclause(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSBehaviorActions(ctx: Context, o: BTSBehaviorActions): TPostResult[Context, BTSBehaviorActions] = {
    val preR: PreResult[Context, BTSBehaviorActions] = pp.preBTSBehaviorActions(ctx, o)
    val r: TPostResult[Context, BTSBehaviorActions] = if (preR.continu) {
      val o2: BTSBehaviorActions = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, BTSAssertedAction]] = transformISZ(preR.ctx, o2.actions, transformBTSAssertedAction _)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(actions = r0.resultOpt.getOrElse(o2.actions))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSBehaviorActions = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSBehaviorActions] = pp.postBTSBehaviorActions(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSAssertedAction(ctx: Context, o: BTSAssertedAction): TPostResult[Context, BTSAssertedAction] = {
    val preR: PreResult[Context, BTSAssertedAction] = pp.preBTSAssertedAction(ctx, o)
    val r: TPostResult[Context, BTSAssertedAction] = if (preR.continu) {
      val o2: BTSAssertedAction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Option[BTSAssertion]] = transformOption(preR.ctx, o2.precondition, transformBTSAssertion _)
      val r1: TPostResult[Context, BTSAction] = transformBTSAction(r0.ctx, o2.action)
      val r2: TPostResult[Context, Option[BTSAssertion]] = transformOption(r1.ctx, o2.postcondition, transformBTSAssertion _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        TPostResult(r2.ctx, Some(o2(precondition = r0.resultOpt.getOrElse(o2.precondition), action = r1.resultOpt.getOrElse(o2.action), postcondition = r2.resultOpt.getOrElse(o2.postcondition))))
      else
        TPostResult(r2.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSAssertedAction = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSAssertedAction] = pp.postBTSAssertedAction(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSAction(ctx: Context, o: BTSAction): TPostResult[Context, BTSAction] = {
    val preR: PreResult[Context, BTSAction] = pp.preBTSAction(ctx, o)
    val r: TPostResult[Context, BTSAction] = if (preR.continu) {
      val o2: BTSAction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, BTSAction] = o2 match {
        case o2: BTSSkipAction =>
          if (hasChanged)
            TPostResult(preR.ctx, Some(o2))
          else
            TPostResult(preR.ctx, None())
        case o2: BTSAssignmentAction =>
          val r0: TPostResult[Context, BTSValueName] = transformBTSValueName(preR.ctx, o2.lhs)
          val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.rhs)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(lhs = r0.resultOpt.getOrElse(o2.lhs), rhs = r1.resultOpt.getOrElse(o2.rhs))))
          else
            TPostResult(r1.ctx, None())
        case o2: BTSSetMode =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.mode)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(mode = r0.resultOpt.getOrElse(o2.mode))))
          else
            TPostResult(r0.ctx, None())
        case o2: BTSWhenThrow =>
          val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.exp)
          val r1: TPostResult[Context, Name] = transformName(r0.ctx, o2.exception)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(exp = r0.resultOpt.getOrElse(o2.exp), exception = r1.resultOpt.getOrElse(o2.exception))))
          else
            TPostResult(r1.ctx, None())
        case o2: BTSFetchAdd =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.target)
          val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.arithmetic)
          val r2: TPostResult[Context, Name] = transformName(r1.ctx, o2.result)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(target = r0.resultOpt.getOrElse(o2.target), arithmetic = r1.resultOpt.getOrElse(o2.arithmetic), result = r2.resultOpt.getOrElse(o2.result))))
          else
            TPostResult(r2.ctx, None())
        case o2: BTSFetchOr =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.target)
          val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.bool)
          val r2: TPostResult[Context, Option[Name]] = transformOption(r1.ctx, o2.result, transformName _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(target = r0.resultOpt.getOrElse(o2.target), bool = r1.resultOpt.getOrElse(o2.bool), result = r2.resultOpt.getOrElse(o2.result))))
          else
            TPostResult(r2.ctx, None())
        case o2: BTSFetchAnd =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.target)
          val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.bool)
          val r2: TPostResult[Context, Option[Name]] = transformOption(r1.ctx, o2.result, transformName _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(target = r0.resultOpt.getOrElse(o2.target), bool = r1.resultOpt.getOrElse(o2.bool), result = r2.resultOpt.getOrElse(o2.result))))
          else
            TPostResult(r2.ctx, None())
        case o2: BTSFetchXor =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.target)
          val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.bool)
          val r2: TPostResult[Context, Option[Name]] = transformOption(r1.ctx, o2.result, transformName _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(target = r0.resultOpt.getOrElse(o2.target), bool = r1.resultOpt.getOrElse(o2.bool), result = r2.resultOpt.getOrElse(o2.result))))
          else
            TPostResult(r2.ctx, None())
        case o2: BTSSwap =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.target)
          val r1: TPostResult[Context, Name] = transformName(r0.ctx, o2.reference)
          val r2: TPostResult[Context, Name] = transformName(r1.ctx, o2.result)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(target = r0.resultOpt.getOrElse(o2.target), reference = r1.resultOpt.getOrElse(o2.reference), result = r2.resultOpt.getOrElse(o2.result))))
          else
            TPostResult(r2.ctx, None())
        case o2: BTSSubprogramCallAction =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
          val r1: TPostResult[Context, IS[Z, BTSFormalActual]] = transformISZ(r0.ctx, o2.params, transformBTSFormalActual _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), params = r1.resultOpt.getOrElse(o2.params))))
          else
            TPostResult(r1.ctx, None())
        case o2: BTSPortOutput =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.port)
          val r1: TPostResult[Context, Option[BTSExp]] = transformOption(r0.ctx, o2.exp, transformBTSExp _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(port = r0.resultOpt.getOrElse(o2.port), exp = r1.resultOpt.getOrElse(o2.exp))))
          else
            TPostResult(r1.ctx, None())
        case o2: BTSPortInput =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.port)
          val r1: TPostResult[Context, BTSValueName] = transformBTSValueName(r0.ctx, o2.variable)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(port = r0.resultOpt.getOrElse(o2.port), variable = r1.resultOpt.getOrElse(o2.variable))))
          else
            TPostResult(r1.ctx, None())
        case o2: BTSFrozenPortAction =>
          val r0: TPostResult[Context, IS[Z, Name]] = transformISZ(preR.ctx, o2.ports, transformName _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(ports = r0.resultOpt.getOrElse(o2.ports))))
          else
            TPostResult(r0.ctx, None())
        case o2: BTSPause =>
          if (hasChanged)
            TPostResult(preR.ctx, Some(o2))
          else
            TPostResult(preR.ctx, None())
        case o2: BTSIfBLESSAction =>
          val r0: TPostResult[Context, Option[TODO]] = transformOption(preR.ctx, o2.availability, transformTODO _)
          val r1: TPostResult[Context, IS[Z, BTSGuardedAction]] = transformISZ(r0.ctx, o2.alternatives, transformBTSGuardedAction _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(availability = r0.resultOpt.getOrElse(o2.availability), alternatives = r1.resultOpt.getOrElse(o2.alternatives))))
          else
            TPostResult(r1.ctx, None())
        case o2: BTSIfBAAction =>
          val r0: TPostResult[Context, BTSConditionalActions] = transformBTSConditionalActions(preR.ctx, o2.ifBranch)
          val r1: TPostResult[Context, IS[Z, BTSConditionalActions]] = transformISZ(r0.ctx, o2.elseIfBranches, transformBTSConditionalActions _)
          val r2: TPostResult[Context, Option[BTSBehaviorActions]] = transformOption(r1.ctx, o2.elseBranch, transformBTSBehaviorActions _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(ifBranch = r0.resultOpt.getOrElse(o2.ifBranch), elseIfBranches = r1.resultOpt.getOrElse(o2.elseIfBranches), elseBranch = r2.resultOpt.getOrElse(o2.elseBranch))))
          else
            TPostResult(r2.ctx, None())
        case o2: BTSWhileLoop =>
          val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.test)
          val r1: TPostResult[Context, Option[BTSNamelessAssertion]] = transformOption(r0.ctx, o2.invariant, transformBTSNamelessAssertion _)
          val r2: TPostResult[Context, Option[BTSExp]] = transformOption(r1.ctx, o2.bound, transformBTSExp _)
          val r3: TPostResult[Context, BTSExistentialLatticeQuantification] = transformBTSExistentialLatticeQuantification(r2.ctx, o2.elq)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(test = r0.resultOpt.getOrElse(o2.test), invariant = r1.resultOpt.getOrElse(o2.invariant), bound = r2.resultOpt.getOrElse(o2.bound), elq = r3.resultOpt.getOrElse(o2.elq))))
          else
            TPostResult(r3.ctx, None())
        case o2: BTSForLoop =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.count)
          val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.lowerbound)
          val r2: TPostResult[Context, BTSExp] = transformBTSExp(r1.ctx, o2.upperbound)
          val r3: TPostResult[Context, Option[BTSNamelessAssertion]] = transformOption(r2.ctx, o2.invariant, transformBTSNamelessAssertion _)
          val r4: TPostResult[Context, BTSBehaviorActions] = transformBTSBehaviorActions(r3.ctx, o2.actions)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
            TPostResult(r4.ctx, Some(o2(count = r0.resultOpt.getOrElse(o2.count), lowerbound = r1.resultOpt.getOrElse(o2.lowerbound), upperbound = r2.resultOpt.getOrElse(o2.upperbound), invariant = r3.resultOpt.getOrElse(o2.invariant), actions = r4.resultOpt.getOrElse(o2.actions))))
          else
            TPostResult(r4.ctx, None())
        case o2: BTSDoUntilLoop =>
          val r0: TPostResult[Context, Option[BTSNamelessAssertion]] = transformOption(preR.ctx, o2.invariant, transformBTSNamelessAssertion _)
          val r1: TPostResult[Context, Option[BTSExp]] = transformOption(r0.ctx, o2.bound, transformBTSExp _)
          val r2: TPostResult[Context, BTSBehaviorActions] = transformBTSBehaviorActions(r1.ctx, o2.actions)
          val r3: TPostResult[Context, BTSExp] = transformBTSExp(r2.ctx, o2.guard)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(invariant = r0.resultOpt.getOrElse(o2.invariant), bound = r1.resultOpt.getOrElse(o2.bound), actions = r2.resultOpt.getOrElse(o2.actions), guard = r3.resultOpt.getOrElse(o2.guard))))
          else
            TPostResult(r3.ctx, None())
        case o2: BTSExistentialLatticeQuantification =>
          val r0: TPostResult[Context, IS[Z, BTSVariableDeclaration]] = transformISZ(preR.ctx, o2.quantifiedVariables, transformBTSVariableDeclaration _)
          val r1: TPostResult[Context, BTSBehaviorActions] = transformBTSBehaviorActions(r0.ctx, o2.actions)
          val r2: TPostResult[Context, Option[BTSExp]] = transformOption(r1.ctx, o2.timeout, transformBTSExp _)
          val r3: TPostResult[Context, IS[Z, BTSCatchClauseTerm]] = transformISZ(r2.ctx, o2.catchClause, transformBTSCatchClauseTerm _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(quantifiedVariables = r0.resultOpt.getOrElse(o2.quantifiedVariables), actions = r1.resultOpt.getOrElse(o2.actions), timeout = r2.resultOpt.getOrElse(o2.timeout), catchClause = r3.resultOpt.getOrElse(o2.catchClause))))
          else
            TPostResult(r3.ctx, None())
        case o2: BTSUniversalLatticeQuantification =>
          val r0: TPostResult[Context, IS[Z, Name]] = transformISZ(preR.ctx, o2.latticeVariables, transformName _)
          val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.lowerbound)
          val r2: TPostResult[Context, BTSExp] = transformBTSExp(r1.ctx, o2.upperbound)
          val r3: TPostResult[Context, BTSExistentialLatticeQuantification] = transformBTSExistentialLatticeQuantification(r2.ctx, o2.elq)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(latticeVariables = r0.resultOpt.getOrElse(o2.latticeVariables), lowerbound = r1.resultOpt.getOrElse(o2.lowerbound), upperbound = r2.resultOpt.getOrElse(o2.upperbound), elq = r3.resultOpt.getOrElse(o2.elq))))
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
    val o2: BTSAction = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSAction] = pp.postBTSAction(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSBasicAction(ctx: Context, o: BTSBasicAction): TPostResult[Context, BTSBasicAction] = {
    val preR: PreResult[Context, BTSBasicAction] = pp.preBTSBasicAction(ctx, o)
    val r: TPostResult[Context, BTSBasicAction] = if (preR.continu) {
      val o2: BTSBasicAction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, BTSBasicAction] = o2 match {
        case o2: BTSSkipAction =>
          if (hasChanged)
            TPostResult(preR.ctx, Some(o2))
          else
            TPostResult(preR.ctx, None())
        case o2: BTSAssignmentAction =>
          val r0: TPostResult[Context, BTSValueName] = transformBTSValueName(preR.ctx, o2.lhs)
          val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.rhs)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(lhs = r0.resultOpt.getOrElse(o2.lhs), rhs = r1.resultOpt.getOrElse(o2.rhs))))
          else
            TPostResult(r1.ctx, None())
        case o2: BTSSetMode =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.mode)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(mode = r0.resultOpt.getOrElse(o2.mode))))
          else
            TPostResult(r0.ctx, None())
        case o2: BTSWhenThrow =>
          val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.exp)
          val r1: TPostResult[Context, Name] = transformName(r0.ctx, o2.exception)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(exp = r0.resultOpt.getOrElse(o2.exp), exception = r1.resultOpt.getOrElse(o2.exception))))
          else
            TPostResult(r1.ctx, None())
        case o2: BTSFetchAdd =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.target)
          val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.arithmetic)
          val r2: TPostResult[Context, Name] = transformName(r1.ctx, o2.result)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(target = r0.resultOpt.getOrElse(o2.target), arithmetic = r1.resultOpt.getOrElse(o2.arithmetic), result = r2.resultOpt.getOrElse(o2.result))))
          else
            TPostResult(r2.ctx, None())
        case o2: BTSFetchOr =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.target)
          val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.bool)
          val r2: TPostResult[Context, Option[Name]] = transformOption(r1.ctx, o2.result, transformName _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(target = r0.resultOpt.getOrElse(o2.target), bool = r1.resultOpt.getOrElse(o2.bool), result = r2.resultOpt.getOrElse(o2.result))))
          else
            TPostResult(r2.ctx, None())
        case o2: BTSFetchAnd =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.target)
          val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.bool)
          val r2: TPostResult[Context, Option[Name]] = transformOption(r1.ctx, o2.result, transformName _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(target = r0.resultOpt.getOrElse(o2.target), bool = r1.resultOpt.getOrElse(o2.bool), result = r2.resultOpt.getOrElse(o2.result))))
          else
            TPostResult(r2.ctx, None())
        case o2: BTSFetchXor =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.target)
          val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.bool)
          val r2: TPostResult[Context, Option[Name]] = transformOption(r1.ctx, o2.result, transformName _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(target = r0.resultOpt.getOrElse(o2.target), bool = r1.resultOpt.getOrElse(o2.bool), result = r2.resultOpt.getOrElse(o2.result))))
          else
            TPostResult(r2.ctx, None())
        case o2: BTSSwap =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.target)
          val r1: TPostResult[Context, Name] = transformName(r0.ctx, o2.reference)
          val r2: TPostResult[Context, Name] = transformName(r1.ctx, o2.result)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(target = r0.resultOpt.getOrElse(o2.target), reference = r1.resultOpt.getOrElse(o2.reference), result = r2.resultOpt.getOrElse(o2.result))))
          else
            TPostResult(r2.ctx, None())
        case o2: BTSSubprogramCallAction =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
          val r1: TPostResult[Context, IS[Z, BTSFormalActual]] = transformISZ(r0.ctx, o2.params, transformBTSFormalActual _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), params = r1.resultOpt.getOrElse(o2.params))))
          else
            TPostResult(r1.ctx, None())
        case o2: BTSPortOutput =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.port)
          val r1: TPostResult[Context, Option[BTSExp]] = transformOption(r0.ctx, o2.exp, transformBTSExp _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(port = r0.resultOpt.getOrElse(o2.port), exp = r1.resultOpt.getOrElse(o2.exp))))
          else
            TPostResult(r1.ctx, None())
        case o2: BTSPortInput =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.port)
          val r1: TPostResult[Context, BTSValueName] = transformBTSValueName(r0.ctx, o2.variable)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(port = r0.resultOpt.getOrElse(o2.port), variable = r1.resultOpt.getOrElse(o2.variable))))
          else
            TPostResult(r1.ctx, None())
        case o2: BTSFrozenPortAction =>
          val r0: TPostResult[Context, IS[Z, Name]] = transformISZ(preR.ctx, o2.ports, transformName _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(ports = r0.resultOpt.getOrElse(o2.ports))))
          else
            TPostResult(r0.ctx, None())
        case o2: BTSPause =>
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
    val o2: BTSBasicAction = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSBasicAction] = pp.postBTSBasicAction(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSSkipAction(ctx: Context, o: BTSSkipAction): TPostResult[Context, BTSSkipAction] = {
    val preR: PreResult[Context, BTSSkipAction] = pp.preBTSSkipAction(ctx, o)
    val r: TPostResult[Context, BTSSkipAction] = if (preR.continu) {
      val o2: BTSSkipAction = preR.resultOpt.getOrElse(o)
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
    val o2: BTSSkipAction = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSSkipAction] = pp.postBTSSkipAction(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSAssignmentAction(ctx: Context, o: BTSAssignmentAction): TPostResult[Context, BTSAssignmentAction] = {
    val preR: PreResult[Context, BTSAssignmentAction] = pp.preBTSAssignmentAction(ctx, o)
    val r: TPostResult[Context, BTSAssignmentAction] = if (preR.continu) {
      val o2: BTSAssignmentAction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, BTSValueName] = transformBTSValueName(preR.ctx, o2.lhs)
      val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.rhs)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(lhs = r0.resultOpt.getOrElse(o2.lhs), rhs = r1.resultOpt.getOrElse(o2.rhs))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSAssignmentAction = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSAssignmentAction] = pp.postBTSAssignmentAction(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSSetMode(ctx: Context, o: BTSSetMode): TPostResult[Context, BTSSetMode] = {
    val preR: PreResult[Context, BTSSetMode] = pp.preBTSSetMode(ctx, o)
    val r: TPostResult[Context, BTSSetMode] = if (preR.continu) {
      val o2: BTSSetMode = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.mode)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(mode = r0.resultOpt.getOrElse(o2.mode))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSSetMode = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSSetMode] = pp.postBTSSetMode(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSWhenThrow(ctx: Context, o: BTSWhenThrow): TPostResult[Context, BTSWhenThrow] = {
    val preR: PreResult[Context, BTSWhenThrow] = pp.preBTSWhenThrow(ctx, o)
    val r: TPostResult[Context, BTSWhenThrow] = if (preR.continu) {
      val o2: BTSWhenThrow = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.exp)
      val r1: TPostResult[Context, Name] = transformName(r0.ctx, o2.exception)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(exp = r0.resultOpt.getOrElse(o2.exp), exception = r1.resultOpt.getOrElse(o2.exception))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSWhenThrow = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSWhenThrow] = pp.postBTSWhenThrow(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSCombinableOperation(ctx: Context, o: BTSCombinableOperation): TPostResult[Context, BTSCombinableOperation] = {
    val preR: PreResult[Context, BTSCombinableOperation] = pp.preBTSCombinableOperation(ctx, o)
    val r: TPostResult[Context, BTSCombinableOperation] = if (preR.continu) {
      val o2: BTSCombinableOperation = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, BTSCombinableOperation] = o2 match {
        case o2: BTSFetchAdd =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.target)
          val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.arithmetic)
          val r2: TPostResult[Context, Name] = transformName(r1.ctx, o2.result)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(target = r0.resultOpt.getOrElse(o2.target), arithmetic = r1.resultOpt.getOrElse(o2.arithmetic), result = r2.resultOpt.getOrElse(o2.result))))
          else
            TPostResult(r2.ctx, None())
        case o2: BTSFetchOr =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.target)
          val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.bool)
          val r2: TPostResult[Context, Option[Name]] = transformOption(r1.ctx, o2.result, transformName _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(target = r0.resultOpt.getOrElse(o2.target), bool = r1.resultOpt.getOrElse(o2.bool), result = r2.resultOpt.getOrElse(o2.result))))
          else
            TPostResult(r2.ctx, None())
        case o2: BTSFetchAnd =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.target)
          val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.bool)
          val r2: TPostResult[Context, Option[Name]] = transformOption(r1.ctx, o2.result, transformName _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(target = r0.resultOpt.getOrElse(o2.target), bool = r1.resultOpt.getOrElse(o2.bool), result = r2.resultOpt.getOrElse(o2.result))))
          else
            TPostResult(r2.ctx, None())
        case o2: BTSFetchXor =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.target)
          val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.bool)
          val r2: TPostResult[Context, Option[Name]] = transformOption(r1.ctx, o2.result, transformName _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(target = r0.resultOpt.getOrElse(o2.target), bool = r1.resultOpt.getOrElse(o2.bool), result = r2.resultOpt.getOrElse(o2.result))))
          else
            TPostResult(r2.ctx, None())
        case o2: BTSSwap =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.target)
          val r1: TPostResult[Context, Name] = transformName(r0.ctx, o2.reference)
          val r2: TPostResult[Context, Name] = transformName(r1.ctx, o2.result)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(target = r0.resultOpt.getOrElse(o2.target), reference = r1.resultOpt.getOrElse(o2.reference), result = r2.resultOpt.getOrElse(o2.result))))
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
    val o2: BTSCombinableOperation = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSCombinableOperation] = pp.postBTSCombinableOperation(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSFetchAdd(ctx: Context, o: BTSFetchAdd): TPostResult[Context, BTSFetchAdd] = {
    val preR: PreResult[Context, BTSFetchAdd] = pp.preBTSFetchAdd(ctx, o)
    val r: TPostResult[Context, BTSFetchAdd] = if (preR.continu) {
      val o2: BTSFetchAdd = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.target)
      val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.arithmetic)
      val r2: TPostResult[Context, Name] = transformName(r1.ctx, o2.result)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        TPostResult(r2.ctx, Some(o2(target = r0.resultOpt.getOrElse(o2.target), arithmetic = r1.resultOpt.getOrElse(o2.arithmetic), result = r2.resultOpt.getOrElse(o2.result))))
      else
        TPostResult(r2.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSFetchAdd = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSFetchAdd] = pp.postBTSFetchAdd(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSFetchOr(ctx: Context, o: BTSFetchOr): TPostResult[Context, BTSFetchOr] = {
    val preR: PreResult[Context, BTSFetchOr] = pp.preBTSFetchOr(ctx, o)
    val r: TPostResult[Context, BTSFetchOr] = if (preR.continu) {
      val o2: BTSFetchOr = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.target)
      val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.bool)
      val r2: TPostResult[Context, Option[Name]] = transformOption(r1.ctx, o2.result, transformName _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        TPostResult(r2.ctx, Some(o2(target = r0.resultOpt.getOrElse(o2.target), bool = r1.resultOpt.getOrElse(o2.bool), result = r2.resultOpt.getOrElse(o2.result))))
      else
        TPostResult(r2.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSFetchOr = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSFetchOr] = pp.postBTSFetchOr(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSFetchAnd(ctx: Context, o: BTSFetchAnd): TPostResult[Context, BTSFetchAnd] = {
    val preR: PreResult[Context, BTSFetchAnd] = pp.preBTSFetchAnd(ctx, o)
    val r: TPostResult[Context, BTSFetchAnd] = if (preR.continu) {
      val o2: BTSFetchAnd = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.target)
      val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.bool)
      val r2: TPostResult[Context, Option[Name]] = transformOption(r1.ctx, o2.result, transformName _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        TPostResult(r2.ctx, Some(o2(target = r0.resultOpt.getOrElse(o2.target), bool = r1.resultOpt.getOrElse(o2.bool), result = r2.resultOpt.getOrElse(o2.result))))
      else
        TPostResult(r2.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSFetchAnd = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSFetchAnd] = pp.postBTSFetchAnd(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSFetchXor(ctx: Context, o: BTSFetchXor): TPostResult[Context, BTSFetchXor] = {
    val preR: PreResult[Context, BTSFetchXor] = pp.preBTSFetchXor(ctx, o)
    val r: TPostResult[Context, BTSFetchXor] = if (preR.continu) {
      val o2: BTSFetchXor = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.target)
      val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.bool)
      val r2: TPostResult[Context, Option[Name]] = transformOption(r1.ctx, o2.result, transformName _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        TPostResult(r2.ctx, Some(o2(target = r0.resultOpt.getOrElse(o2.target), bool = r1.resultOpt.getOrElse(o2.bool), result = r2.resultOpt.getOrElse(o2.result))))
      else
        TPostResult(r2.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSFetchXor = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSFetchXor] = pp.postBTSFetchXor(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSSwap(ctx: Context, o: BTSSwap): TPostResult[Context, BTSSwap] = {
    val preR: PreResult[Context, BTSSwap] = pp.preBTSSwap(ctx, o)
    val r: TPostResult[Context, BTSSwap] = if (preR.continu) {
      val o2: BTSSwap = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.target)
      val r1: TPostResult[Context, Name] = transformName(r0.ctx, o2.reference)
      val r2: TPostResult[Context, Name] = transformName(r1.ctx, o2.result)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        TPostResult(r2.ctx, Some(o2(target = r0.resultOpt.getOrElse(o2.target), reference = r1.resultOpt.getOrElse(o2.reference), result = r2.resultOpt.getOrElse(o2.result))))
      else
        TPostResult(r2.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSSwap = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSSwap] = pp.postBTSSwap(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSCommunicationAction(ctx: Context, o: BTSCommunicationAction): TPostResult[Context, BTSCommunicationAction] = {
    val preR: PreResult[Context, BTSCommunicationAction] = pp.preBTSCommunicationAction(ctx, o)
    val r: TPostResult[Context, BTSCommunicationAction] = if (preR.continu) {
      val o2: BTSCommunicationAction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, BTSCommunicationAction] = o2 match {
        case o2: BTSSubprogramCallAction =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
          val r1: TPostResult[Context, IS[Z, BTSFormalActual]] = transformISZ(r0.ctx, o2.params, transformBTSFormalActual _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), params = r1.resultOpt.getOrElse(o2.params))))
          else
            TPostResult(r1.ctx, None())
        case o2: BTSPortOutput =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.port)
          val r1: TPostResult[Context, Option[BTSExp]] = transformOption(r0.ctx, o2.exp, transformBTSExp _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(port = r0.resultOpt.getOrElse(o2.port), exp = r1.resultOpt.getOrElse(o2.exp))))
          else
            TPostResult(r1.ctx, None())
        case o2: BTSPortInput =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.port)
          val r1: TPostResult[Context, BTSValueName] = transformBTSValueName(r0.ctx, o2.variable)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(port = r0.resultOpt.getOrElse(o2.port), variable = r1.resultOpt.getOrElse(o2.variable))))
          else
            TPostResult(r1.ctx, None())
        case o2: BTSFrozenPortAction =>
          val r0: TPostResult[Context, IS[Z, Name]] = transformISZ(preR.ctx, o2.ports, transformName _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(ports = r0.resultOpt.getOrElse(o2.ports))))
          else
            TPostResult(r0.ctx, None())
        case o2: BTSPause =>
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
    val o2: BTSCommunicationAction = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSCommunicationAction] = pp.postBTSCommunicationAction(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSSubprogramCallAction(ctx: Context, o: BTSSubprogramCallAction): TPostResult[Context, BTSSubprogramCallAction] = {
    val preR: PreResult[Context, BTSSubprogramCallAction] = pp.preBTSSubprogramCallAction(ctx, o)
    val r: TPostResult[Context, BTSSubprogramCallAction] = if (preR.continu) {
      val o2: BTSSubprogramCallAction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
      val r1: TPostResult[Context, IS[Z, BTSFormalActual]] = transformISZ(r0.ctx, o2.params, transformBTSFormalActual _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), params = r1.resultOpt.getOrElse(o2.params))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSSubprogramCallAction = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSSubprogramCallAction] = pp.postBTSSubprogramCallAction(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSFormalActual(ctx: Context, o: BTSFormalActual): TPostResult[Context, BTSFormalActual] = {
    val preR: PreResult[Context, BTSFormalActual] = pp.preBTSFormalActual(ctx, o)
    val r: TPostResult[Context, BTSFormalActual] = if (preR.continu) {
      val o2: BTSFormalActual = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.formal)
      val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.actual)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(formal = r0.resultOpt.getOrElse(o2.formal), actual = r1.resultOpt.getOrElse(o2.actual))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSFormalActual = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSFormalActual] = pp.postBTSFormalActual(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSPortOutput(ctx: Context, o: BTSPortOutput): TPostResult[Context, BTSPortOutput] = {
    val preR: PreResult[Context, BTSPortOutput] = pp.preBTSPortOutput(ctx, o)
    val r: TPostResult[Context, BTSPortOutput] = if (preR.continu) {
      val o2: BTSPortOutput = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.port)
      val r1: TPostResult[Context, Option[BTSExp]] = transformOption(r0.ctx, o2.exp, transformBTSExp _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(port = r0.resultOpt.getOrElse(o2.port), exp = r1.resultOpt.getOrElse(o2.exp))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSPortOutput = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSPortOutput] = pp.postBTSPortOutput(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSPortInput(ctx: Context, o: BTSPortInput): TPostResult[Context, BTSPortInput] = {
    val preR: PreResult[Context, BTSPortInput] = pp.preBTSPortInput(ctx, o)
    val r: TPostResult[Context, BTSPortInput] = if (preR.continu) {
      val o2: BTSPortInput = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.port)
      val r1: TPostResult[Context, BTSValueName] = transformBTSValueName(r0.ctx, o2.variable)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(port = r0.resultOpt.getOrElse(o2.port), variable = r1.resultOpt.getOrElse(o2.variable))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSPortInput = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSPortInput] = pp.postBTSPortInput(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSFrozenPortAction(ctx: Context, o: BTSFrozenPortAction): TPostResult[Context, BTSFrozenPortAction] = {
    val preR: PreResult[Context, BTSFrozenPortAction] = pp.preBTSFrozenPortAction(ctx, o)
    val r: TPostResult[Context, BTSFrozenPortAction] = if (preR.continu) {
      val o2: BTSFrozenPortAction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, Name]] = transformISZ(preR.ctx, o2.ports, transformName _)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(ports = r0.resultOpt.getOrElse(o2.ports))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSFrozenPortAction = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSFrozenPortAction] = pp.postBTSFrozenPortAction(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSPause(ctx: Context, o: BTSPause): TPostResult[Context, BTSPause] = {
    val preR: PreResult[Context, BTSPause] = pp.preBTSPause(ctx, o)
    val r: TPostResult[Context, BTSPause] = if (preR.continu) {
      val o2: BTSPause = preR.resultOpt.getOrElse(o)
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
    val o2: BTSPause = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSPause] = pp.postBTSPause(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSControlAction(ctx: Context, o: BTSControlAction): TPostResult[Context, BTSControlAction] = {
    val preR: PreResult[Context, BTSControlAction] = pp.preBTSControlAction(ctx, o)
    val r: TPostResult[Context, BTSControlAction] = if (preR.continu) {
      val o2: BTSControlAction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, BTSControlAction] = o2 match {
        case o2: BTSIfBLESSAction =>
          val r0: TPostResult[Context, Option[TODO]] = transformOption(preR.ctx, o2.availability, transformTODO _)
          val r1: TPostResult[Context, IS[Z, BTSGuardedAction]] = transformISZ(r0.ctx, o2.alternatives, transformBTSGuardedAction _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(availability = r0.resultOpt.getOrElse(o2.availability), alternatives = r1.resultOpt.getOrElse(o2.alternatives))))
          else
            TPostResult(r1.ctx, None())
        case o2: BTSIfBAAction =>
          val r0: TPostResult[Context, BTSConditionalActions] = transformBTSConditionalActions(preR.ctx, o2.ifBranch)
          val r1: TPostResult[Context, IS[Z, BTSConditionalActions]] = transformISZ(r0.ctx, o2.elseIfBranches, transformBTSConditionalActions _)
          val r2: TPostResult[Context, Option[BTSBehaviorActions]] = transformOption(r1.ctx, o2.elseBranch, transformBTSBehaviorActions _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(ifBranch = r0.resultOpt.getOrElse(o2.ifBranch), elseIfBranches = r1.resultOpt.getOrElse(o2.elseIfBranches), elseBranch = r2.resultOpt.getOrElse(o2.elseBranch))))
          else
            TPostResult(r2.ctx, None())
        case o2: BTSWhileLoop =>
          val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.test)
          val r1: TPostResult[Context, Option[BTSNamelessAssertion]] = transformOption(r0.ctx, o2.invariant, transformBTSNamelessAssertion _)
          val r2: TPostResult[Context, Option[BTSExp]] = transformOption(r1.ctx, o2.bound, transformBTSExp _)
          val r3: TPostResult[Context, BTSExistentialLatticeQuantification] = transformBTSExistentialLatticeQuantification(r2.ctx, o2.elq)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(test = r0.resultOpt.getOrElse(o2.test), invariant = r1.resultOpt.getOrElse(o2.invariant), bound = r2.resultOpt.getOrElse(o2.bound), elq = r3.resultOpt.getOrElse(o2.elq))))
          else
            TPostResult(r3.ctx, None())
        case o2: BTSForLoop =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.count)
          val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.lowerbound)
          val r2: TPostResult[Context, BTSExp] = transformBTSExp(r1.ctx, o2.upperbound)
          val r3: TPostResult[Context, Option[BTSNamelessAssertion]] = transformOption(r2.ctx, o2.invariant, transformBTSNamelessAssertion _)
          val r4: TPostResult[Context, BTSBehaviorActions] = transformBTSBehaviorActions(r3.ctx, o2.actions)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
            TPostResult(r4.ctx, Some(o2(count = r0.resultOpt.getOrElse(o2.count), lowerbound = r1.resultOpt.getOrElse(o2.lowerbound), upperbound = r2.resultOpt.getOrElse(o2.upperbound), invariant = r3.resultOpt.getOrElse(o2.invariant), actions = r4.resultOpt.getOrElse(o2.actions))))
          else
            TPostResult(r4.ctx, None())
        case o2: BTSDoUntilLoop =>
          val r0: TPostResult[Context, Option[BTSNamelessAssertion]] = transformOption(preR.ctx, o2.invariant, transformBTSNamelessAssertion _)
          val r1: TPostResult[Context, Option[BTSExp]] = transformOption(r0.ctx, o2.bound, transformBTSExp _)
          val r2: TPostResult[Context, BTSBehaviorActions] = transformBTSBehaviorActions(r1.ctx, o2.actions)
          val r3: TPostResult[Context, BTSExp] = transformBTSExp(r2.ctx, o2.guard)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(invariant = r0.resultOpt.getOrElse(o2.invariant), bound = r1.resultOpt.getOrElse(o2.bound), actions = r2.resultOpt.getOrElse(o2.actions), guard = r3.resultOpt.getOrElse(o2.guard))))
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
    val o2: BTSControlAction = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSControlAction] = pp.postBTSControlAction(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSIfBLESSAction(ctx: Context, o: BTSIfBLESSAction): TPostResult[Context, BTSIfBLESSAction] = {
    val preR: PreResult[Context, BTSIfBLESSAction] = pp.preBTSIfBLESSAction(ctx, o)
    val r: TPostResult[Context, BTSIfBLESSAction] = if (preR.continu) {
      val o2: BTSIfBLESSAction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Option[TODO]] = transformOption(preR.ctx, o2.availability, transformTODO _)
      val r1: TPostResult[Context, IS[Z, BTSGuardedAction]] = transformISZ(r0.ctx, o2.alternatives, transformBTSGuardedAction _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(availability = r0.resultOpt.getOrElse(o2.availability), alternatives = r1.resultOpt.getOrElse(o2.alternatives))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSIfBLESSAction = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSIfBLESSAction] = pp.postBTSIfBLESSAction(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSGuardedAction(ctx: Context, o: BTSGuardedAction): TPostResult[Context, BTSGuardedAction] = {
    val preR: PreResult[Context, BTSGuardedAction] = pp.preBTSGuardedAction(ctx, o)
    val r: TPostResult[Context, BTSGuardedAction] = if (preR.continu) {
      val o2: BTSGuardedAction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.guard)
      val r1: TPostResult[Context, BTSAssertedAction] = transformBTSAssertedAction(r0.ctx, o2.action)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(guard = r0.resultOpt.getOrElse(o2.guard), action = r1.resultOpt.getOrElse(o2.action))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSGuardedAction = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSGuardedAction] = pp.postBTSGuardedAction(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSIfBAAction(ctx: Context, o: BTSIfBAAction): TPostResult[Context, BTSIfBAAction] = {
    val preR: PreResult[Context, BTSIfBAAction] = pp.preBTSIfBAAction(ctx, o)
    val r: TPostResult[Context, BTSIfBAAction] = if (preR.continu) {
      val o2: BTSIfBAAction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, BTSConditionalActions] = transformBTSConditionalActions(preR.ctx, o2.ifBranch)
      val r1: TPostResult[Context, IS[Z, BTSConditionalActions]] = transformISZ(r0.ctx, o2.elseIfBranches, transformBTSConditionalActions _)
      val r2: TPostResult[Context, Option[BTSBehaviorActions]] = transformOption(r1.ctx, o2.elseBranch, transformBTSBehaviorActions _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        TPostResult(r2.ctx, Some(o2(ifBranch = r0.resultOpt.getOrElse(o2.ifBranch), elseIfBranches = r1.resultOpt.getOrElse(o2.elseIfBranches), elseBranch = r2.resultOpt.getOrElse(o2.elseBranch))))
      else
        TPostResult(r2.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSIfBAAction = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSIfBAAction] = pp.postBTSIfBAAction(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSConditionalActions(ctx: Context, o: BTSConditionalActions): TPostResult[Context, BTSConditionalActions] = {
    val preR: PreResult[Context, BTSConditionalActions] = pp.preBTSConditionalActions(ctx, o)
    val r: TPostResult[Context, BTSConditionalActions] = if (preR.continu) {
      val o2: BTSConditionalActions = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.cond)
      val r1: TPostResult[Context, BTSBehaviorActions] = transformBTSBehaviorActions(r0.ctx, o2.actions)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(cond = r0.resultOpt.getOrElse(o2.cond), actions = r1.resultOpt.getOrElse(o2.actions))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSConditionalActions = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSConditionalActions] = pp.postBTSConditionalActions(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSWhileLoop(ctx: Context, o: BTSWhileLoop): TPostResult[Context, BTSWhileLoop] = {
    val preR: PreResult[Context, BTSWhileLoop] = pp.preBTSWhileLoop(ctx, o)
    val r: TPostResult[Context, BTSWhileLoop] = if (preR.continu) {
      val o2: BTSWhileLoop = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.test)
      val r1: TPostResult[Context, Option[BTSNamelessAssertion]] = transformOption(r0.ctx, o2.invariant, transformBTSNamelessAssertion _)
      val r2: TPostResult[Context, Option[BTSExp]] = transformOption(r1.ctx, o2.bound, transformBTSExp _)
      val r3: TPostResult[Context, BTSExistentialLatticeQuantification] = transformBTSExistentialLatticeQuantification(r2.ctx, o2.elq)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
        TPostResult(r3.ctx, Some(o2(test = r0.resultOpt.getOrElse(o2.test), invariant = r1.resultOpt.getOrElse(o2.invariant), bound = r2.resultOpt.getOrElse(o2.bound), elq = r3.resultOpt.getOrElse(o2.elq))))
      else
        TPostResult(r3.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSWhileLoop = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSWhileLoop] = pp.postBTSWhileLoop(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSForLoop(ctx: Context, o: BTSForLoop): TPostResult[Context, BTSForLoop] = {
    val preR: PreResult[Context, BTSForLoop] = pp.preBTSForLoop(ctx, o)
    val r: TPostResult[Context, BTSForLoop] = if (preR.continu) {
      val o2: BTSForLoop = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.count)
      val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.lowerbound)
      val r2: TPostResult[Context, BTSExp] = transformBTSExp(r1.ctx, o2.upperbound)
      val r3: TPostResult[Context, Option[BTSNamelessAssertion]] = transformOption(r2.ctx, o2.invariant, transformBTSNamelessAssertion _)
      val r4: TPostResult[Context, BTSBehaviorActions] = transformBTSBehaviorActions(r3.ctx, o2.actions)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
        TPostResult(r4.ctx, Some(o2(count = r0.resultOpt.getOrElse(o2.count), lowerbound = r1.resultOpt.getOrElse(o2.lowerbound), upperbound = r2.resultOpt.getOrElse(o2.upperbound), invariant = r3.resultOpt.getOrElse(o2.invariant), actions = r4.resultOpt.getOrElse(o2.actions))))
      else
        TPostResult(r4.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSForLoop = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSForLoop] = pp.postBTSForLoop(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSDoUntilLoop(ctx: Context, o: BTSDoUntilLoop): TPostResult[Context, BTSDoUntilLoop] = {
    val preR: PreResult[Context, BTSDoUntilLoop] = pp.preBTSDoUntilLoop(ctx, o)
    val r: TPostResult[Context, BTSDoUntilLoop] = if (preR.continu) {
      val o2: BTSDoUntilLoop = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Option[BTSNamelessAssertion]] = transformOption(preR.ctx, o2.invariant, transformBTSNamelessAssertion _)
      val r1: TPostResult[Context, Option[BTSExp]] = transformOption(r0.ctx, o2.bound, transformBTSExp _)
      val r2: TPostResult[Context, BTSBehaviorActions] = transformBTSBehaviorActions(r1.ctx, o2.actions)
      val r3: TPostResult[Context, BTSExp] = transformBTSExp(r2.ctx, o2.guard)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
        TPostResult(r3.ctx, Some(o2(invariant = r0.resultOpt.getOrElse(o2.invariant), bound = r1.resultOpt.getOrElse(o2.bound), actions = r2.resultOpt.getOrElse(o2.actions), guard = r3.resultOpt.getOrElse(o2.guard))))
      else
        TPostResult(r3.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSDoUntilLoop = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSDoUntilLoop] = pp.postBTSDoUntilLoop(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSQuantificationActions(ctx: Context, o: BTSQuantificationActions): TPostResult[Context, BTSQuantificationActions] = {
    val preR: PreResult[Context, BTSQuantificationActions] = pp.preBTSQuantificationActions(ctx, o)
    val r: TPostResult[Context, BTSQuantificationActions] = if (preR.continu) {
      val o2: BTSQuantificationActions = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, BTSQuantificationActions] = o2 match {
        case o2: BTSExistentialLatticeQuantification =>
          val r0: TPostResult[Context, IS[Z, BTSVariableDeclaration]] = transformISZ(preR.ctx, o2.quantifiedVariables, transformBTSVariableDeclaration _)
          val r1: TPostResult[Context, BTSBehaviorActions] = transformBTSBehaviorActions(r0.ctx, o2.actions)
          val r2: TPostResult[Context, Option[BTSExp]] = transformOption(r1.ctx, o2.timeout, transformBTSExp _)
          val r3: TPostResult[Context, IS[Z, BTSCatchClauseTerm]] = transformISZ(r2.ctx, o2.catchClause, transformBTSCatchClauseTerm _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(quantifiedVariables = r0.resultOpt.getOrElse(o2.quantifiedVariables), actions = r1.resultOpt.getOrElse(o2.actions), timeout = r2.resultOpt.getOrElse(o2.timeout), catchClause = r3.resultOpt.getOrElse(o2.catchClause))))
          else
            TPostResult(r3.ctx, None())
        case o2: BTSUniversalLatticeQuantification =>
          val r0: TPostResult[Context, IS[Z, Name]] = transformISZ(preR.ctx, o2.latticeVariables, transformName _)
          val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.lowerbound)
          val r2: TPostResult[Context, BTSExp] = transformBTSExp(r1.ctx, o2.upperbound)
          val r3: TPostResult[Context, BTSExistentialLatticeQuantification] = transformBTSExistentialLatticeQuantification(r2.ctx, o2.elq)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(latticeVariables = r0.resultOpt.getOrElse(o2.latticeVariables), lowerbound = r1.resultOpt.getOrElse(o2.lowerbound), upperbound = r2.resultOpt.getOrElse(o2.upperbound), elq = r3.resultOpt.getOrElse(o2.elq))))
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
    val o2: BTSQuantificationActions = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSQuantificationActions] = pp.postBTSQuantificationActions(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSExistentialLatticeQuantification(ctx: Context, o: BTSExistentialLatticeQuantification): TPostResult[Context, BTSExistentialLatticeQuantification] = {
    val preR: PreResult[Context, BTSExistentialLatticeQuantification] = pp.preBTSExistentialLatticeQuantification(ctx, o)
    val r: TPostResult[Context, BTSExistentialLatticeQuantification] = if (preR.continu) {
      val o2: BTSExistentialLatticeQuantification = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, BTSVariableDeclaration]] = transformISZ(preR.ctx, o2.quantifiedVariables, transformBTSVariableDeclaration _)
      val r1: TPostResult[Context, BTSBehaviorActions] = transformBTSBehaviorActions(r0.ctx, o2.actions)
      val r2: TPostResult[Context, Option[BTSExp]] = transformOption(r1.ctx, o2.timeout, transformBTSExp _)
      val r3: TPostResult[Context, IS[Z, BTSCatchClauseTerm]] = transformISZ(r2.ctx, o2.catchClause, transformBTSCatchClauseTerm _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
        TPostResult(r3.ctx, Some(o2(quantifiedVariables = r0.resultOpt.getOrElse(o2.quantifiedVariables), actions = r1.resultOpt.getOrElse(o2.actions), timeout = r2.resultOpt.getOrElse(o2.timeout), catchClause = r3.resultOpt.getOrElse(o2.catchClause))))
      else
        TPostResult(r3.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSExistentialLatticeQuantification = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSExistentialLatticeQuantification] = pp.postBTSExistentialLatticeQuantification(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSCatchClauseTerm(ctx: Context, o: BTSCatchClauseTerm): TPostResult[Context, BTSCatchClauseTerm] = {
    val preR: PreResult[Context, BTSCatchClauseTerm] = pp.preBTSCatchClauseTerm(ctx, o)
    val r: TPostResult[Context, BTSCatchClauseTerm] = if (preR.continu) {
      val o2: BTSCatchClauseTerm = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, Name]] = transformISZ(preR.ctx, o2.exceptions, transformName _)
      val r1: TPostResult[Context, BTSBasicAction] = transformBTSBasicAction(r0.ctx, o2.action)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(exceptions = r0.resultOpt.getOrElse(o2.exceptions), action = r1.resultOpt.getOrElse(o2.action))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSCatchClauseTerm = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSCatchClauseTerm] = pp.postBTSCatchClauseTerm(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSUniversalLatticeQuantification(ctx: Context, o: BTSUniversalLatticeQuantification): TPostResult[Context, BTSUniversalLatticeQuantification] = {
    val preR: PreResult[Context, BTSUniversalLatticeQuantification] = pp.preBTSUniversalLatticeQuantification(ctx, o)
    val r: TPostResult[Context, BTSUniversalLatticeQuantification] = if (preR.continu) {
      val o2: BTSUniversalLatticeQuantification = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, Name]] = transformISZ(preR.ctx, o2.latticeVariables, transformName _)
      val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.lowerbound)
      val r2: TPostResult[Context, BTSExp] = transformBTSExp(r1.ctx, o2.upperbound)
      val r3: TPostResult[Context, BTSExistentialLatticeQuantification] = transformBTSExistentialLatticeQuantification(r2.ctx, o2.elq)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
        TPostResult(r3.ctx, Some(o2(latticeVariables = r0.resultOpt.getOrElse(o2.latticeVariables), lowerbound = r1.resultOpt.getOrElse(o2.lowerbound), upperbound = r2.resultOpt.getOrElse(o2.upperbound), elq = r3.resultOpt.getOrElse(o2.elq))))
      else
        TPostResult(r3.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSUniversalLatticeQuantification = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSUniversalLatticeQuantification] = pp.postBTSUniversalLatticeQuantification(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSExp(ctx: Context, o: BTSExp): TPostResult[Context, BTSExp] = {
    val preR: PreResult[Context, BTSExp] = pp.preBTSExp(ctx, o)
    val r: TPostResult[Context, BTSExp] = if (preR.continu) {
      val o2: BTSExp = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, BTSExp] = o2 match {
        case o2: BTSUnaryExp =>
          val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.exp)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(exp = r0.resultOpt.getOrElse(o2.exp))))
          else
            TPostResult(r0.ctx, None())
        case o2: BTSBinaryExp =>
          val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.lhs)
          val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.rhs)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(lhs = r0.resultOpt.getOrElse(o2.lhs), rhs = r1.resultOpt.getOrElse(o2.rhs))))
          else
            TPostResult(r1.ctx, None())
        case o2: BTSLiteralExp =>
          val r0: TPostResult[Context, Option[Name]] = transformOption(preR.ctx, o2.unit, transformName _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(unit = r0.resultOpt.getOrElse(o2.unit))))
          else
            TPostResult(r0.ctx, None())
        case o2: BTSVariableNameExp =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
          val r1: TPostResult[Context, IS[Z, BTSExp]] = transformISZ(r0.ctx, o2.arrayindex, transformBTSExp _)
          val r2: TPostResult[Context, IS[Z, BTSPartialName]] = transformISZ(r1.ctx, o2.pn, transformBTSPartialName _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), arrayindex = r1.resultOpt.getOrElse(o2.arrayindex), pn = r2.resultOpt.getOrElse(o2.pn))))
          else
            TPostResult(r2.ctx, None())
        case o2: BTSIndexingExp =>
          val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.exp)
          val r1: TPostResult[Context, IS[Z, BTSExp]] = transformISZ(r0.ctx, o2.indices, transformBTSExp _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(exp = r0.resultOpt.getOrElse(o2.exp), indices = r1.resultOpt.getOrElse(o2.indices))))
          else
            TPostResult(r1.ctx, None())
        case o2: BTSAccessExp =>
          val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.exp)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(exp = r0.resultOpt.getOrElse(o2.exp))))
          else
            TPostResult(r0.ctx, None())
        case o2: BTSFunctionCall =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
          val r1: TPostResult[Context, IS[Z, BTSFormalActual]] = transformISZ(r0.ctx, o2.args, transformBTSFormalActual _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), args = r1.resultOpt.getOrElse(o2.args))))
          else
            TPostResult(r1.ctx, None())
        case o2: BTSConditionalExpression =>
          val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.guard)
          val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.t)
          val r2: TPostResult[Context, BTSExp] = transformBTSExp(r1.ctx, o2.f)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(guard = r0.resultOpt.getOrElse(o2.guard), t = r1.resultOpt.getOrElse(o2.t), f = r2.resultOpt.getOrElse(o2.f))))
          else
            TPostResult(r2.ctx, None())
        case o2: BTSTrue =>
          if (hasChanged)
            TPostResult(preR.ctx, Some(o2))
          else
            TPostResult(preR.ctx, None())
        case o2: BTSFalse =>
          if (hasChanged)
            TPostResult(preR.ctx, Some(o2))
          else
            TPostResult(preR.ctx, None())
        case o2: BTSNull =>
          if (hasChanged)
            TPostResult(preR.ctx, Some(o2))
          else
            TPostResult(preR.ctx, None())
        case o2: BTSPropertyConstant =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.propertyset)
          val r1: TPostResult[Context, Name] = transformName(r0.ctx, o2.propertyconstant)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(propertyset = r0.resultOpt.getOrElse(o2.propertyset), propertyconstant = r1.resultOpt.getOrElse(o2.propertyconstant))))
          else
            TPostResult(r1.ctx, None())
        case o2: BTSPropertySetProperty =>
          val r0: TPostResult[Context, Option[Name]] = transformOption(preR.ctx, o2.propertyset, transformName _)
          val r1: TPostResult[Context, Name] = transformName(r0.ctx, o2.propertyconstant)
          val r2: TPostResult[Context, IS[Z, BTSPropertyField]] = transformISZ(r1.ctx, o2.field, transformBTSPropertyField _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(propertyset = r0.resultOpt.getOrElse(o2.propertyset), propertyconstant = r1.resultOpt.getOrElse(o2.propertyconstant), field = r2.resultOpt.getOrElse(o2.field))))
          else
            TPostResult(r2.ctx, None())
        case o2: BTSSelfProperty =>
          val r0: TPostResult[Context, Option[Name]] = transformOption(preR.ctx, o2.propertyset, transformName _)
          val r1: TPostResult[Context, Name] = transformName(r0.ctx, o2.propertyconstant)
          val r2: TPostResult[Context, IS[Z, BTSPropertyField]] = transformISZ(r1.ctx, o2.field, transformBTSPropertyField _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(propertyset = r0.resultOpt.getOrElse(o2.propertyset), propertyconstant = r1.resultOpt.getOrElse(o2.propertyconstant), field = r2.resultOpt.getOrElse(o2.field))))
          else
            TPostResult(r2.ctx, None())
        case o2: BTSComponentProperty =>
          val r0: TPostResult[Context, BTSComponent] = transformBTSComponent(preR.ctx, o2.component)
          val r1: TPostResult[Context, Option[Name]] = transformOption(r0.ctx, o2.propertyset, transformName _)
          val r2: TPostResult[Context, Name] = transformName(r1.ctx, o2.propertyconstant)
          val r3: TPostResult[Context, IS[Z, BTSPropertyField]] = transformISZ(r2.ctx, o2.field, transformBTSPropertyField _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(component = r0.resultOpt.getOrElse(o2.component), propertyset = r1.resultOpt.getOrElse(o2.propertyset), propertyconstant = r2.resultOpt.getOrElse(o2.propertyconstant), field = r3.resultOpt.getOrElse(o2.field))))
          else
            TPostResult(r3.ctx, None())
        case o2: BTSUniversalQuantification =>
          val r0: TPostResult[Context, IS[Z, BTSVariable]] = transformISZ(preR.ctx, o2.variables, transformBTSVariable _)
          val r1: TPostResult[Context, Option[BTSRange]] = transformOption(r0.ctx, o2.range, transformBTSRange _)
          val r2: TPostResult[Context, Option[BTSExp]] = transformOption(r1.ctx, o2.condition, transformBTSExp _)
          val r3: TPostResult[Context, BTSExp] = transformBTSExp(r2.ctx, o2.predicate)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(variables = r0.resultOpt.getOrElse(o2.variables), range = r1.resultOpt.getOrElse(o2.range), condition = r2.resultOpt.getOrElse(o2.condition), predicate = r3.resultOpt.getOrElse(o2.predicate))))
          else
            TPostResult(r3.ctx, None())
        case o2: BTSExistentialQuantification =>
          val r0: TPostResult[Context, IS[Z, BTSVariable]] = transformISZ(preR.ctx, o2.variables, transformBTSVariable _)
          val r1: TPostResult[Context, Option[BTSRange]] = transformOption(r0.ctx, o2.range, transformBTSRange _)
          val r2: TPostResult[Context, Option[BTSExp]] = transformOption(r1.ctx, o2.condition, transformBTSExp _)
          val r3: TPostResult[Context, BTSExp] = transformBTSExp(r2.ctx, o2.predicate)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(variables = r0.resultOpt.getOrElse(o2.variables), range = r1.resultOpt.getOrElse(o2.range), condition = r2.resultOpt.getOrElse(o2.condition), predicate = r3.resultOpt.getOrElse(o2.predicate))))
          else
            TPostResult(r3.ctx, None())
        case o2: BTSSumQuantification =>
          val r0: TPostResult[Context, IS[Z, BTSVariable]] = transformISZ(preR.ctx, o2.variables, transformBTSVariable _)
          val r1: TPostResult[Context, Option[BTSRange]] = transformOption(r0.ctx, o2.range, transformBTSRange _)
          val r2: TPostResult[Context, Option[BTSExp]] = transformOption(r1.ctx, o2.condition, transformBTSExp _)
          val r3: TPostResult[Context, BTSExp] = transformBTSExp(r2.ctx, o2.expression)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(variables = r0.resultOpt.getOrElse(o2.variables), range = r1.resultOpt.getOrElse(o2.range), condition = r2.resultOpt.getOrElse(o2.condition), expression = r3.resultOpt.getOrElse(o2.expression))))
          else
            TPostResult(r3.ctx, None())
        case o2: BTSProductQuantification =>
          val r0: TPostResult[Context, IS[Z, BTSVariable]] = transformISZ(preR.ctx, o2.variables, transformBTSVariable _)
          val r1: TPostResult[Context, Option[BTSRange]] = transformOption(r0.ctx, o2.range, transformBTSRange _)
          val r2: TPostResult[Context, Option[BTSExp]] = transformOption(r1.ctx, o2.condition, transformBTSExp _)
          val r3: TPostResult[Context, BTSExp] = transformBTSExp(r2.ctx, o2.expression)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(variables = r0.resultOpt.getOrElse(o2.variables), range = r1.resultOpt.getOrElse(o2.range), condition = r2.resultOpt.getOrElse(o2.condition), expression = r3.resultOpt.getOrElse(o2.expression))))
          else
            TPostResult(r3.ctx, None())
        case o2: BTSCountingQuantification =>
          val r0: TPostResult[Context, IS[Z, BTSVariable]] = transformISZ(preR.ctx, o2.variables, transformBTSVariable _)
          val r1: TPostResult[Context, Option[BTSRange]] = transformOption(r0.ctx, o2.range, transformBTSRange _)
          val r2: TPostResult[Context, Option[BTSExp]] = transformOption(r1.ctx, o2.condition, transformBTSExp _)
          val r3: TPostResult[Context, BTSExp] = transformBTSExp(r2.ctx, o2.predicate)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(variables = r0.resultOpt.getOrElse(o2.variables), range = r1.resultOpt.getOrElse(o2.range), condition = r2.resultOpt.getOrElse(o2.condition), predicate = r3.resultOpt.getOrElse(o2.predicate))))
          else
            TPostResult(r3.ctx, None())
        case o2: BTSRange =>
          val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.lb)
          val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.ub)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(lb = r0.resultOpt.getOrElse(o2.lb), ub = r1.resultOpt.getOrElse(o2.ub))))
          else
            TPostResult(r1.ctx, None())
        case o2: BTSQuantity =>
          val r0: TPostResult[Context, Option[Name]] = transformOption(preR.ctx, o2.unit, transformName _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(unit = r0.resultOpt.getOrElse(o2.unit))))
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
    val o2: BTSExp = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSExp] = pp.postBTSExp(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSUnaryExp(ctx: Context, o: BTSUnaryExp): TPostResult[Context, BTSUnaryExp] = {
    val preR: PreResult[Context, BTSUnaryExp] = pp.preBTSUnaryExp(ctx, o)
    val r: TPostResult[Context, BTSUnaryExp] = if (preR.continu) {
      val o2: BTSUnaryExp = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.exp)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(exp = r0.resultOpt.getOrElse(o2.exp))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSUnaryExp = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSUnaryExp] = pp.postBTSUnaryExp(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSBinaryExp(ctx: Context, o: BTSBinaryExp): TPostResult[Context, BTSBinaryExp] = {
    val preR: PreResult[Context, BTSBinaryExp] = pp.preBTSBinaryExp(ctx, o)
    val r: TPostResult[Context, BTSBinaryExp] = if (preR.continu) {
      val o2: BTSBinaryExp = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.lhs)
      val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.rhs)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(lhs = r0.resultOpt.getOrElse(o2.lhs), rhs = r1.resultOpt.getOrElse(o2.rhs))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSBinaryExp = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSBinaryExp] = pp.postBTSBinaryExp(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSLiteralExp(ctx: Context, o: BTSLiteralExp): TPostResult[Context, BTSLiteralExp] = {
    val preR: PreResult[Context, BTSLiteralExp] = pp.preBTSLiteralExp(ctx, o)
    val r: TPostResult[Context, BTSLiteralExp] = if (preR.continu) {
      val o2: BTSLiteralExp = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Option[Name]] = transformOption(preR.ctx, o2.unit, transformName _)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(unit = r0.resultOpt.getOrElse(o2.unit))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSLiteralExp = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSLiteralExp] = pp.postBTSLiteralExp(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSValueName(ctx: Context, o: BTSValueName): TPostResult[Context, BTSValueName] = {
    val preR: PreResult[Context, BTSValueName] = pp.preBTSValueName(ctx, o)
    val r: TPostResult[Context, BTSValueName] = if (preR.continu) {
      val o2: BTSValueName = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, BTSValueName] = o2 match {
        case o2: BTSVariableNameExp =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
          val r1: TPostResult[Context, IS[Z, BTSExp]] = transformISZ(r0.ctx, o2.arrayindex, transformBTSExp _)
          val r2: TPostResult[Context, IS[Z, BTSPartialName]] = transformISZ(r1.ctx, o2.pn, transformBTSPartialName _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), arrayindex = r1.resultOpt.getOrElse(o2.arrayindex), pn = r2.resultOpt.getOrElse(o2.pn))))
          else
            TPostResult(r2.ctx, None())
        case o2: BTSFunctionCall =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
          val r1: TPostResult[Context, IS[Z, BTSFormalActual]] = transformISZ(r0.ctx, o2.args, transformBTSFormalActual _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), args = r1.resultOpt.getOrElse(o2.args))))
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
    val o2: BTSValueName = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSValueName] = pp.postBTSValueName(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSVariableNameExp(ctx: Context, o: BTSVariableNameExp): TPostResult[Context, BTSVariableNameExp] = {
    val preR: PreResult[Context, BTSVariableNameExp] = pp.preBTSVariableNameExp(ctx, o)
    val r: TPostResult[Context, BTSVariableNameExp] = if (preR.continu) {
      val o2: BTSVariableNameExp = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
      val r1: TPostResult[Context, IS[Z, BTSExp]] = transformISZ(r0.ctx, o2.arrayindex, transformBTSExp _)
      val r2: TPostResult[Context, IS[Z, BTSPartialName]] = transformISZ(r1.ctx, o2.pn, transformBTSPartialName _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        TPostResult(r2.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), arrayindex = r1.resultOpt.getOrElse(o2.arrayindex), pn = r2.resultOpt.getOrElse(o2.pn))))
      else
        TPostResult(r2.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSVariableNameExp = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSVariableNameExp] = pp.postBTSVariableNameExp(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSPartialName(ctx: Context, o: BTSPartialName): TPostResult[Context, BTSPartialName] = {
    val preR: PreResult[Context, BTSPartialName] = pp.preBTSPartialName(ctx, o)
    val r: TPostResult[Context, BTSPartialName] = if (preR.continu) {
      val o2: BTSPartialName = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.label)
      val r1: TPostResult[Context, IS[Z, BTSExp]] = transformISZ(r0.ctx, o2.arrayindex, transformBTSExp _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(label = r0.resultOpt.getOrElse(o2.label), arrayindex = r1.resultOpt.getOrElse(o2.arrayindex))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSPartialName = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSPartialName] = pp.postBTSPartialName(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSIndexingExp(ctx: Context, o: BTSIndexingExp): TPostResult[Context, BTSIndexingExp] = {
    val preR: PreResult[Context, BTSIndexingExp] = pp.preBTSIndexingExp(ctx, o)
    val r: TPostResult[Context, BTSIndexingExp] = if (preR.continu) {
      val o2: BTSIndexingExp = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.exp)
      val r1: TPostResult[Context, IS[Z, BTSExp]] = transformISZ(r0.ctx, o2.indices, transformBTSExp _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(exp = r0.resultOpt.getOrElse(o2.exp), indices = r1.resultOpt.getOrElse(o2.indices))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSIndexingExp = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSIndexingExp] = pp.postBTSIndexingExp(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSAccessExp(ctx: Context, o: BTSAccessExp): TPostResult[Context, BTSAccessExp] = {
    val preR: PreResult[Context, BTSAccessExp] = pp.preBTSAccessExp(ctx, o)
    val r: TPostResult[Context, BTSAccessExp] = if (preR.continu) {
      val o2: BTSAccessExp = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.exp)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(exp = r0.resultOpt.getOrElse(o2.exp))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSAccessExp = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSAccessExp] = pp.postBTSAccessExp(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSFunctionCall(ctx: Context, o: BTSFunctionCall): TPostResult[Context, BTSFunctionCall] = {
    val preR: PreResult[Context, BTSFunctionCall] = pp.preBTSFunctionCall(ctx, o)
    val r: TPostResult[Context, BTSFunctionCall] = if (preR.continu) {
      val o2: BTSFunctionCall = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
      val r1: TPostResult[Context, IS[Z, BTSFormalActual]] = transformISZ(r0.ctx, o2.args, transformBTSFormalActual _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), args = r1.resultOpt.getOrElse(o2.args))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSFunctionCall = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSFunctionCall] = pp.postBTSFunctionCall(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSPortValue(ctx: Context, o: BTSPortValue): TPostResult[Context, BTSPortValue] = {
    val preR: PreResult[Context, BTSPortValue] = pp.preBTSPortValue(ctx, o)
    val r: TPostResult[Context, BTSPortValue] = if (preR.continu) {
      val o2: BTSPortValue = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.port)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(port = r0.resultOpt.getOrElse(o2.port))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSPortValue = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSPortValue] = pp.postBTSPortValue(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSConditionalExpression(ctx: Context, o: BTSConditionalExpression): TPostResult[Context, BTSConditionalExpression] = {
    val preR: PreResult[Context, BTSConditionalExpression] = pp.preBTSConditionalExpression(ctx, o)
    val r: TPostResult[Context, BTSConditionalExpression] = if (preR.continu) {
      val o2: BTSConditionalExpression = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.guard)
      val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.t)
      val r2: TPostResult[Context, BTSExp] = transformBTSExp(r1.ctx, o2.f)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        TPostResult(r2.ctx, Some(o2(guard = r0.resultOpt.getOrElse(o2.guard), t = r1.resultOpt.getOrElse(o2.t), f = r2.resultOpt.getOrElse(o2.f))))
      else
        TPostResult(r2.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSConditionalExpression = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSConditionalExpression] = pp.postBTSConditionalExpression(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSTrue(ctx: Context, o: BTSTrue): TPostResult[Context, BTSTrue] = {
    val preR: PreResult[Context, BTSTrue] = pp.preBTSTrue(ctx, o)
    val r: TPostResult[Context, BTSTrue] = if (preR.continu) {
      val o2: BTSTrue = preR.resultOpt.getOrElse(o)
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
    val o2: BTSTrue = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSTrue] = pp.postBTSTrue(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSFalse(ctx: Context, o: BTSFalse): TPostResult[Context, BTSFalse] = {
    val preR: PreResult[Context, BTSFalse] = pp.preBTSFalse(ctx, o)
    val r: TPostResult[Context, BTSFalse] = if (preR.continu) {
      val o2: BTSFalse = preR.resultOpt.getOrElse(o)
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
    val o2: BTSFalse = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSFalse] = pp.postBTSFalse(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSNull(ctx: Context, o: BTSNull): TPostResult[Context, BTSNull] = {
    val preR: PreResult[Context, BTSNull] = pp.preBTSNull(ctx, o)
    val r: TPostResult[Context, BTSNull] = if (preR.continu) {
      val o2: BTSNull = preR.resultOpt.getOrElse(o)
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
    val o2: BTSNull = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSNull] = pp.postBTSNull(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSPropertyConstant(ctx: Context, o: BTSPropertyConstant): TPostResult[Context, BTSPropertyConstant] = {
    val preR: PreResult[Context, BTSPropertyConstant] = pp.preBTSPropertyConstant(ctx, o)
    val r: TPostResult[Context, BTSPropertyConstant] = if (preR.continu) {
      val o2: BTSPropertyConstant = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.propertyset)
      val r1: TPostResult[Context, Name] = transformName(r0.ctx, o2.propertyconstant)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(propertyset = r0.resultOpt.getOrElse(o2.propertyset), propertyconstant = r1.resultOpt.getOrElse(o2.propertyconstant))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSPropertyConstant = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSPropertyConstant] = pp.postBTSPropertyConstant(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSPropertyReference(ctx: Context, o: BTSPropertyReference): TPostResult[Context, BTSPropertyReference] = {
    val preR: PreResult[Context, BTSPropertyReference] = pp.preBTSPropertyReference(ctx, o)
    val r: TPostResult[Context, BTSPropertyReference] = if (preR.continu) {
      val o2: BTSPropertyReference = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, BTSPropertyReference] = o2 match {
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSPropertyReference = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSPropertyReference] = pp.postBTSPropertyReference(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSPropertySetProperty(ctx: Context, o: BTSPropertySetProperty): TPostResult[Context, BTSPropertySetProperty] = {
    val preR: PreResult[Context, BTSPropertySetProperty] = pp.preBTSPropertySetProperty(ctx, o)
    val r: TPostResult[Context, BTSPropertySetProperty] = if (preR.continu) {
      val o2: BTSPropertySetProperty = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Option[Name]] = transformOption(preR.ctx, o2.propertyset, transformName _)
      val r1: TPostResult[Context, Name] = transformName(r0.ctx, o2.propertyconstant)
      val r2: TPostResult[Context, IS[Z, BTSPropertyField]] = transformISZ(r1.ctx, o2.field, transformBTSPropertyField _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        TPostResult(r2.ctx, Some(o2(propertyset = r0.resultOpt.getOrElse(o2.propertyset), propertyconstant = r1.resultOpt.getOrElse(o2.propertyconstant), field = r2.resultOpt.getOrElse(o2.field))))
      else
        TPostResult(r2.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSPropertySetProperty = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSPropertySetProperty] = pp.postBTSPropertySetProperty(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSSelfProperty(ctx: Context, o: BTSSelfProperty): TPostResult[Context, BTSSelfProperty] = {
    val preR: PreResult[Context, BTSSelfProperty] = pp.preBTSSelfProperty(ctx, o)
    val r: TPostResult[Context, BTSSelfProperty] = if (preR.continu) {
      val o2: BTSSelfProperty = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Option[Name]] = transformOption(preR.ctx, o2.propertyset, transformName _)
      val r1: TPostResult[Context, Name] = transformName(r0.ctx, o2.propertyconstant)
      val r2: TPostResult[Context, IS[Z, BTSPropertyField]] = transformISZ(r1.ctx, o2.field, transformBTSPropertyField _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        TPostResult(r2.ctx, Some(o2(propertyset = r0.resultOpt.getOrElse(o2.propertyset), propertyconstant = r1.resultOpt.getOrElse(o2.propertyconstant), field = r2.resultOpt.getOrElse(o2.field))))
      else
        TPostResult(r2.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSSelfProperty = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSSelfProperty] = pp.postBTSSelfProperty(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSComponentProperty(ctx: Context, o: BTSComponentProperty): TPostResult[Context, BTSComponentProperty] = {
    val preR: PreResult[Context, BTSComponentProperty] = pp.preBTSComponentProperty(ctx, o)
    val r: TPostResult[Context, BTSComponentProperty] = if (preR.continu) {
      val o2: BTSComponentProperty = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, BTSComponent] = transformBTSComponent(preR.ctx, o2.component)
      val r1: TPostResult[Context, Option[Name]] = transformOption(r0.ctx, o2.propertyset, transformName _)
      val r2: TPostResult[Context, Name] = transformName(r1.ctx, o2.propertyconstant)
      val r3: TPostResult[Context, IS[Z, BTSPropertyField]] = transformISZ(r2.ctx, o2.field, transformBTSPropertyField _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
        TPostResult(r3.ctx, Some(o2(component = r0.resultOpt.getOrElse(o2.component), propertyset = r1.resultOpt.getOrElse(o2.propertyset), propertyconstant = r2.resultOpt.getOrElse(o2.propertyconstant), field = r3.resultOpt.getOrElse(o2.field))))
      else
        TPostResult(r3.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSComponentProperty = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSComponentProperty] = pp.postBTSComponentProperty(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSComponent(ctx: Context, o: BTSComponent): TPostResult[Context, BTSComponent] = {
    val preR: PreResult[Context, BTSComponent] = pp.preBTSComponent(ctx, o)
    val r: TPostResult[Context, BTSComponent] = if (preR.continu) {
      val o2: BTSComponent = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, Name]] = transformISZ(preR.ctx, o2.packageids, transformName _)
      val r1: TPostResult[Context, Name] = transformName(r0.ctx, o2.component)
      val r2: TPostResult[Context, Option[Name]] = transformOption(r1.ctx, o2.impl, transformName _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        TPostResult(r2.ctx, Some(o2(packageids = r0.resultOpt.getOrElse(o2.packageids), component = r1.resultOpt.getOrElse(o2.component), impl = r2.resultOpt.getOrElse(o2.impl))))
      else
        TPostResult(r2.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSComponent = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSComponent] = pp.postBTSComponent(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSPropertyField(ctx: Context, o: BTSPropertyField): TPostResult[Context, BTSPropertyField] = {
    val preR: PreResult[Context, BTSPropertyField] = pp.preBTSPropertyField(ctx, o)
    val r: TPostResult[Context, BTSPropertyField] = if (preR.continu) {
      val o2: BTSPropertyField = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Option[Name]] = transformOption(preR.ctx, o2.variable, transformName _)
      val r1: TPostResult[Context, Option[Name]] = transformOption(r0.ctx, o2.pf, transformName _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(variable = r0.resultOpt.getOrElse(o2.variable), pf = r1.resultOpt.getOrElse(o2.pf))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSPropertyField = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSPropertyField] = pp.postBTSPropertyField(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSUniversalQuantification(ctx: Context, o: BTSUniversalQuantification): TPostResult[Context, BTSUniversalQuantification] = {
    val preR: PreResult[Context, BTSUniversalQuantification] = pp.preBTSUniversalQuantification(ctx, o)
    val r: TPostResult[Context, BTSUniversalQuantification] = if (preR.continu) {
      val o2: BTSUniversalQuantification = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, BTSVariable]] = transformISZ(preR.ctx, o2.variables, transformBTSVariable _)
      val r1: TPostResult[Context, Option[BTSRange]] = transformOption(r0.ctx, o2.range, transformBTSRange _)
      val r2: TPostResult[Context, Option[BTSExp]] = transformOption(r1.ctx, o2.condition, transformBTSExp _)
      val r3: TPostResult[Context, BTSExp] = transformBTSExp(r2.ctx, o2.predicate)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
        TPostResult(r3.ctx, Some(o2(variables = r0.resultOpt.getOrElse(o2.variables), range = r1.resultOpt.getOrElse(o2.range), condition = r2.resultOpt.getOrElse(o2.condition), predicate = r3.resultOpt.getOrElse(o2.predicate))))
      else
        TPostResult(r3.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSUniversalQuantification = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSUniversalQuantification] = pp.postBTSUniversalQuantification(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSExistentialQuantification(ctx: Context, o: BTSExistentialQuantification): TPostResult[Context, BTSExistentialQuantification] = {
    val preR: PreResult[Context, BTSExistentialQuantification] = pp.preBTSExistentialQuantification(ctx, o)
    val r: TPostResult[Context, BTSExistentialQuantification] = if (preR.continu) {
      val o2: BTSExistentialQuantification = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, BTSVariable]] = transformISZ(preR.ctx, o2.variables, transformBTSVariable _)
      val r1: TPostResult[Context, Option[BTSRange]] = transformOption(r0.ctx, o2.range, transformBTSRange _)
      val r2: TPostResult[Context, Option[BTSExp]] = transformOption(r1.ctx, o2.condition, transformBTSExp _)
      val r3: TPostResult[Context, BTSExp] = transformBTSExp(r2.ctx, o2.predicate)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
        TPostResult(r3.ctx, Some(o2(variables = r0.resultOpt.getOrElse(o2.variables), range = r1.resultOpt.getOrElse(o2.range), condition = r2.resultOpt.getOrElse(o2.condition), predicate = r3.resultOpt.getOrElse(o2.predicate))))
      else
        TPostResult(r3.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSExistentialQuantification = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSExistentialQuantification] = pp.postBTSExistentialQuantification(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSSumQuantification(ctx: Context, o: BTSSumQuantification): TPostResult[Context, BTSSumQuantification] = {
    val preR: PreResult[Context, BTSSumQuantification] = pp.preBTSSumQuantification(ctx, o)
    val r: TPostResult[Context, BTSSumQuantification] = if (preR.continu) {
      val o2: BTSSumQuantification = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, BTSVariable]] = transformISZ(preR.ctx, o2.variables, transformBTSVariable _)
      val r1: TPostResult[Context, Option[BTSRange]] = transformOption(r0.ctx, o2.range, transformBTSRange _)
      val r2: TPostResult[Context, Option[BTSExp]] = transformOption(r1.ctx, o2.condition, transformBTSExp _)
      val r3: TPostResult[Context, BTSExp] = transformBTSExp(r2.ctx, o2.expression)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
        TPostResult(r3.ctx, Some(o2(variables = r0.resultOpt.getOrElse(o2.variables), range = r1.resultOpt.getOrElse(o2.range), condition = r2.resultOpt.getOrElse(o2.condition), expression = r3.resultOpt.getOrElse(o2.expression))))
      else
        TPostResult(r3.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSSumQuantification = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSSumQuantification] = pp.postBTSSumQuantification(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSProductQuantification(ctx: Context, o: BTSProductQuantification): TPostResult[Context, BTSProductQuantification] = {
    val preR: PreResult[Context, BTSProductQuantification] = pp.preBTSProductQuantification(ctx, o)
    val r: TPostResult[Context, BTSProductQuantification] = if (preR.continu) {
      val o2: BTSProductQuantification = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, BTSVariable]] = transformISZ(preR.ctx, o2.variables, transformBTSVariable _)
      val r1: TPostResult[Context, Option[BTSRange]] = transformOption(r0.ctx, o2.range, transformBTSRange _)
      val r2: TPostResult[Context, Option[BTSExp]] = transformOption(r1.ctx, o2.condition, transformBTSExp _)
      val r3: TPostResult[Context, BTSExp] = transformBTSExp(r2.ctx, o2.expression)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
        TPostResult(r3.ctx, Some(o2(variables = r0.resultOpt.getOrElse(o2.variables), range = r1.resultOpt.getOrElse(o2.range), condition = r2.resultOpt.getOrElse(o2.condition), expression = r3.resultOpt.getOrElse(o2.expression))))
      else
        TPostResult(r3.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSProductQuantification = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSProductQuantification] = pp.postBTSProductQuantification(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSCountingQuantification(ctx: Context, o: BTSCountingQuantification): TPostResult[Context, BTSCountingQuantification] = {
    val preR: PreResult[Context, BTSCountingQuantification] = pp.preBTSCountingQuantification(ctx, o)
    val r: TPostResult[Context, BTSCountingQuantification] = if (preR.continu) {
      val o2: BTSCountingQuantification = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, BTSVariable]] = transformISZ(preR.ctx, o2.variables, transformBTSVariable _)
      val r1: TPostResult[Context, Option[BTSRange]] = transformOption(r0.ctx, o2.range, transformBTSRange _)
      val r2: TPostResult[Context, Option[BTSExp]] = transformOption(r1.ctx, o2.condition, transformBTSExp _)
      val r3: TPostResult[Context, BTSExp] = transformBTSExp(r2.ctx, o2.predicate)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
        TPostResult(r3.ctx, Some(o2(variables = r0.resultOpt.getOrElse(o2.variables), range = r1.resultOpt.getOrElse(o2.range), condition = r2.resultOpt.getOrElse(o2.condition), predicate = r3.resultOpt.getOrElse(o2.predicate))))
      else
        TPostResult(r3.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSCountingQuantification = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSCountingQuantification] = pp.postBTSCountingQuantification(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSRange(ctx: Context, o: BTSRange): TPostResult[Context, BTSRange] = {
    val preR: PreResult[Context, BTSRange] = pp.preBTSRange(ctx, o)
    val r: TPostResult[Context, BTSRange] = if (preR.continu) {
      val o2: BTSRange = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.lb)
      val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.ub)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(lb = r0.resultOpt.getOrElse(o2.lb), ub = r1.resultOpt.getOrElse(o2.ub))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSRange = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSRange] = pp.postBTSRange(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSTypeLibrary(ctx: Context, o: BTSTypeLibrary): TPostResult[Context, BTSTypeLibrary] = {
    val preR: PreResult[Context, BTSTypeLibrary] = pp.preBTSTypeLibrary(ctx, o)
    val r: TPostResult[Context, BTSTypeLibrary] = if (preR.continu) {
      val o2: BTSTypeLibrary = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, BTSTypeDeclatation]] = transformISZ(preR.ctx, o2.typedeclarations, transformBTSTypeDeclatation _)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(typedeclarations = r0.resultOpt.getOrElse(o2.typedeclarations))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSTypeLibrary = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSTypeLibrary] = pp.postBTSTypeLibrary(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSTypeDeclatation(ctx: Context, o: BTSTypeDeclatation): TPostResult[Context, BTSTypeDeclatation] = {
    val preR: PreResult[Context, BTSTypeDeclatation] = pp.preBTSTypeDeclatation(ctx, o)
    val r: TPostResult[Context, BTSTypeDeclatation] = if (preR.continu) {
      val o2: BTSTypeDeclatation = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
      val r1: TPostResult[Context, BTSType] = transformBTSType(r0.ctx, o2.ty)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), ty = r1.resultOpt.getOrElse(o2.ty))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSTypeDeclatation = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSTypeDeclatation] = pp.postBTSTypeDeclatation(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSType(ctx: Context, o: BTSType): TPostResult[Context, BTSType] = {
    val preR: PreResult[Context, BTSType] = pp.preBTSType(ctx, o)
    val r: TPostResult[Context, BTSType] = if (preR.continu) {
      val o2: BTSType = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, BTSType] = o2 match {
        case o2: BTSBooleanType =>
          if (hasChanged)
            TPostResult(preR.ctx, Some(o2))
          else
            TPostResult(preR.ctx, None())
        case o2: BTSStringType =>
          if (hasChanged)
            TPostResult(preR.ctx, Some(o2))
          else
            TPostResult(preR.ctx, None())
        case o2: BTSNullType =>
          if (hasChanged)
            TPostResult(preR.ctx, Some(o2))
          else
            TPostResult(preR.ctx, None())
        case o2: BTSClassifier =>
          val r0: TPostResult[Context, BTSComponent] = transformBTSComponent(preR.ctx, o2.classifier)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(classifier = r0.resultOpt.getOrElse(o2.classifier))))
          else
            TPostResult(r0.ctx, None())
        case o2: BTSTypeName =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.typename)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(typename = r0.resultOpt.getOrElse(o2.typename))))
          else
            TPostResult(r0.ctx, None())
        case o2: BTSEnumerationType =>
          val r0: TPostResult[Context, IS[Z, Name]] = transformISZ(preR.ctx, o2.literals, transformName _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(literals = r0.resultOpt.getOrElse(o2.literals))))
          else
            TPostResult(r0.ctx, None())
        case o2: BTSQuantityType =>
          val r0: TPostResult[Context, Option[Name]] = transformOption(preR.ctx, o2.unit, transformName _)
          val r1: TPostResult[Context, Option[BTSPropertyConstant]] = transformOption(r0.ctx, o2.representation, transformBTSPropertyConstant _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(unit = r0.resultOpt.getOrElse(o2.unit), representation = r1.resultOpt.getOrElse(o2.representation))))
          else
            TPostResult(r1.ctx, None())
        case o2: BTSArrayType =>
          val r0: TPostResult[Context, IS[Z, BTSArrayRange]] = transformISZ(preR.ctx, o2.ranges, transformBTSArrayRange _)
          val r1: TPostResult[Context, BTSType] = transformBTSType(r0.ctx, o2.typ)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(ranges = r0.resultOpt.getOrElse(o2.ranges), typ = r1.resultOpt.getOrElse(o2.typ))))
          else
            TPostResult(r1.ctx, None())
        case o2: BTSRecordType =>
          val r0: TPostResult[Context, IS[Z, BTSRecordField]] = transformISZ(preR.ctx, o2.fields, transformBTSRecordField _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(fields = r0.resultOpt.getOrElse(o2.fields))))
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
    val o2: BTSType = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSType] = pp.postBTSType(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSBooleanType(ctx: Context, o: BTSBooleanType): TPostResult[Context, BTSBooleanType] = {
    val preR: PreResult[Context, BTSBooleanType] = pp.preBTSBooleanType(ctx, o)
    val r: TPostResult[Context, BTSBooleanType] = if (preR.continu) {
      val o2: BTSBooleanType = preR.resultOpt.getOrElse(o)
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
    val o2: BTSBooleanType = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSBooleanType] = pp.postBTSBooleanType(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSStringType(ctx: Context, o: BTSStringType): TPostResult[Context, BTSStringType] = {
    val preR: PreResult[Context, BTSStringType] = pp.preBTSStringType(ctx, o)
    val r: TPostResult[Context, BTSStringType] = if (preR.continu) {
      val o2: BTSStringType = preR.resultOpt.getOrElse(o)
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
    val o2: BTSStringType = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSStringType] = pp.postBTSStringType(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSNullType(ctx: Context, o: BTSNullType): TPostResult[Context, BTSNullType] = {
    val preR: PreResult[Context, BTSNullType] = pp.preBTSNullType(ctx, o)
    val r: TPostResult[Context, BTSNullType] = if (preR.continu) {
      val o2: BTSNullType = preR.resultOpt.getOrElse(o)
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
    val o2: BTSNullType = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSNullType] = pp.postBTSNullType(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSClassifier(ctx: Context, o: BTSClassifier): TPostResult[Context, BTSClassifier] = {
    val preR: PreResult[Context, BTSClassifier] = pp.preBTSClassifier(ctx, o)
    val r: TPostResult[Context, BTSClassifier] = if (preR.continu) {
      val o2: BTSClassifier = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, BTSComponent] = transformBTSComponent(preR.ctx, o2.classifier)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(classifier = r0.resultOpt.getOrElse(o2.classifier))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSClassifier = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSClassifier] = pp.postBTSClassifier(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSTypeName(ctx: Context, o: BTSTypeName): TPostResult[Context, BTSTypeName] = {
    val preR: PreResult[Context, BTSTypeName] = pp.preBTSTypeName(ctx, o)
    val r: TPostResult[Context, BTSTypeName] = if (preR.continu) {
      val o2: BTSTypeName = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.typename)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(typename = r0.resultOpt.getOrElse(o2.typename))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSTypeName = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSTypeName] = pp.postBTSTypeName(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSEnumerationType(ctx: Context, o: BTSEnumerationType): TPostResult[Context, BTSEnumerationType] = {
    val preR: PreResult[Context, BTSEnumerationType] = pp.preBTSEnumerationType(ctx, o)
    val r: TPostResult[Context, BTSEnumerationType] = if (preR.continu) {
      val o2: BTSEnumerationType = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, Name]] = transformISZ(preR.ctx, o2.literals, transformName _)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(literals = r0.resultOpt.getOrElse(o2.literals))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSEnumerationType = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSEnumerationType] = pp.postBTSEnumerationType(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSQuantityType(ctx: Context, o: BTSQuantityType): TPostResult[Context, BTSQuantityType] = {
    val preR: PreResult[Context, BTSQuantityType] = pp.preBTSQuantityType(ctx, o)
    val r: TPostResult[Context, BTSQuantityType] = if (preR.continu) {
      val o2: BTSQuantityType = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Option[Name]] = transformOption(preR.ctx, o2.unit, transformName _)
      val r1: TPostResult[Context, Option[BTSPropertyConstant]] = transformOption(r0.ctx, o2.representation, transformBTSPropertyConstant _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(unit = r0.resultOpt.getOrElse(o2.unit), representation = r1.resultOpt.getOrElse(o2.representation))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSQuantityType = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSQuantityType] = pp.postBTSQuantityType(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSArrayType(ctx: Context, o: BTSArrayType): TPostResult[Context, BTSArrayType] = {
    val preR: PreResult[Context, BTSArrayType] = pp.preBTSArrayType(ctx, o)
    val r: TPostResult[Context, BTSArrayType] = if (preR.continu) {
      val o2: BTSArrayType = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, BTSArrayRange]] = transformISZ(preR.ctx, o2.ranges, transformBTSArrayRange _)
      val r1: TPostResult[Context, BTSType] = transformBTSType(r0.ctx, o2.typ)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(ranges = r0.resultOpt.getOrElse(o2.ranges), typ = r1.resultOpt.getOrElse(o2.typ))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSArrayType = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSArrayType] = pp.postBTSArrayType(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSArrayRange(ctx: Context, o: BTSArrayRange): TPostResult[Context, BTSArrayRange] = {
    val preR: PreResult[Context, BTSArrayRange] = pp.preBTSArrayRange(ctx, o)
    val r: TPostResult[Context, BTSArrayRange] = if (preR.continu) {
      val o2: BTSArrayRange = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.lb)
      val r1: TPostResult[Context, Option[BTSExp]] = transformOption(r0.ctx, o2.ub, transformBTSExp _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(lb = r0.resultOpt.getOrElse(o2.lb), ub = r1.resultOpt.getOrElse(o2.ub))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSArrayRange = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSArrayRange] = pp.postBTSArrayRange(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSRecordType(ctx: Context, o: BTSRecordType): TPostResult[Context, BTSRecordType] = {
    val preR: PreResult[Context, BTSRecordType] = pp.preBTSRecordType(ctx, o)
    val r: TPostResult[Context, BTSRecordType] = if (preR.continu) {
      val o2: BTSRecordType = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, BTSRecordField]] = transformISZ(preR.ctx, o2.fields, transformBTSRecordField _)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(fields = r0.resultOpt.getOrElse(o2.fields))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSRecordType = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSRecordType] = pp.postBTSRecordType(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSRecordField(ctx: Context, o: BTSRecordField): TPostResult[Context, BTSRecordField] = {
    val preR: PreResult[Context, BTSRecordField] = pp.preBTSRecordField(ctx, o)
    val r: TPostResult[Context, BTSRecordField] = if (preR.continu) {
      val o2: BTSRecordField = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.label)
      val r1: TPostResult[Context, BTSType] = transformBTSType(r0.ctx, o2.typ)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(label = r0.resultOpt.getOrElse(o2.label), typ = r1.resultOpt.getOrElse(o2.typ))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSRecordField = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSRecordField] = pp.postBTSRecordField(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSUnitLibrary(ctx: Context, o: BTSUnitLibrary): TPostResult[Context, BTSUnitLibrary] = {
    val preR: PreResult[Context, BTSUnitLibrary] = pp.preBTSUnitLibrary(ctx, o)
    val r: TPostResult[Context, BTSUnitLibrary] = if (preR.continu) {
      val o2: BTSUnitLibrary = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, BTSUnitDeclaration]] = transformISZ(preR.ctx, o2.unitDeclarations, transformBTSUnitDeclaration _)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(unitDeclarations = r0.resultOpt.getOrElse(o2.unitDeclarations))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSUnitLibrary = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSUnitLibrary] = pp.postBTSUnitLibrary(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSUnitDeclaration(ctx: Context, o: BTSUnitDeclaration): TPostResult[Context, BTSUnitDeclaration] = {
    val preR: PreResult[Context, BTSUnitDeclaration] = pp.preBTSUnitDeclaration(ctx, o)
    val r: TPostResult[Context, BTSUnitDeclaration] = if (preR.continu) {
      val o2: BTSUnitDeclaration = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, BTSUnitDeclaration] = o2 match {
        case o2: BTSRootDeclaration =>
          val r0: TPostResult[Context, Option[BTSUnitFormula]] = transformOption(preR.ctx, o2.formula, transformBTSUnitFormula _)
          val r1: TPostResult[Context, IS[Z, Name]] = transformISZ(r0.ctx, o2.kindWords, transformName _)
          val r2: TPostResult[Context, BTSUnitName] = transformBTSUnitName(r1.ctx, o2.unitName)
          val r3: TPostResult[Context, IS[Z, BTSUnitFactor]] = transformISZ(r2.ctx, o2.factors, transformBTSUnitFactor _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(formula = r0.resultOpt.getOrElse(o2.formula), kindWords = r1.resultOpt.getOrElse(o2.kindWords), unitName = r2.resultOpt.getOrElse(o2.unitName), factors = r3.resultOpt.getOrElse(o2.factors))))
          else
            TPostResult(r3.ctx, None())
        case o2: BTSUnitExtension =>
          val r0: TPostResult[Context, BTSUnitName] = transformBTSUnitName(preR.ctx, o2.root)
          val r1: TPostResult[Context, IS[Z, BTSUnitFactor]] = transformISZ(r0.ctx, o2.factors, transformBTSUnitFactor _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(root = r0.resultOpt.getOrElse(o2.root), factors = r1.resultOpt.getOrElse(o2.factors))))
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
    val o2: BTSUnitDeclaration = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSUnitDeclaration] = pp.postBTSUnitDeclaration(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSRootDeclaration(ctx: Context, o: BTSRootDeclaration): TPostResult[Context, BTSRootDeclaration] = {
    val preR: PreResult[Context, BTSRootDeclaration] = pp.preBTSRootDeclaration(ctx, o)
    val r: TPostResult[Context, BTSRootDeclaration] = if (preR.continu) {
      val o2: BTSRootDeclaration = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Option[BTSUnitFormula]] = transformOption(preR.ctx, o2.formula, transformBTSUnitFormula _)
      val r1: TPostResult[Context, IS[Z, Name]] = transformISZ(r0.ctx, o2.kindWords, transformName _)
      val r2: TPostResult[Context, BTSUnitName] = transformBTSUnitName(r1.ctx, o2.unitName)
      val r3: TPostResult[Context, IS[Z, BTSUnitFactor]] = transformISZ(r2.ctx, o2.factors, transformBTSUnitFactor _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
        TPostResult(r3.ctx, Some(o2(formula = r0.resultOpt.getOrElse(o2.formula), kindWords = r1.resultOpt.getOrElse(o2.kindWords), unitName = r2.resultOpt.getOrElse(o2.unitName), factors = r3.resultOpt.getOrElse(o2.factors))))
      else
        TPostResult(r3.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSRootDeclaration = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSRootDeclaration] = pp.postBTSRootDeclaration(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSUnitExtension(ctx: Context, o: BTSUnitExtension): TPostResult[Context, BTSUnitExtension] = {
    val preR: PreResult[Context, BTSUnitExtension] = pp.preBTSUnitExtension(ctx, o)
    val r: TPostResult[Context, BTSUnitExtension] = if (preR.continu) {
      val o2: BTSUnitExtension = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, BTSUnitName] = transformBTSUnitName(preR.ctx, o2.root)
      val r1: TPostResult[Context, IS[Z, BTSUnitFactor]] = transformISZ(r0.ctx, o2.factors, transformBTSUnitFactor _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(root = r0.resultOpt.getOrElse(o2.root), factors = r1.resultOpt.getOrElse(o2.factors))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSUnitExtension = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSUnitExtension] = pp.postBTSUnitExtension(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSUnitName(ctx: Context, o: BTSUnitName): TPostResult[Context, BTSUnitName] = {
    val preR: PreResult[Context, BTSUnitName] = pp.preBTSUnitName(ctx, o)
    val r: TPostResult[Context, BTSUnitName] = if (preR.continu) {
      val o2: BTSUnitName = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, Name]] = transformISZ(preR.ctx, o2.longname, transformName _)
      val r1: TPostResult[Context, Name] = transformName(r0.ctx, o2.name)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(longname = r0.resultOpt.getOrElse(o2.longname), name = r1.resultOpt.getOrElse(o2.name))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSUnitName = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSUnitName] = pp.postBTSUnitName(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSUnitFormula(ctx: Context, o: BTSUnitFormula): TPostResult[Context, BTSUnitFormula] = {
    val preR: PreResult[Context, BTSUnitFormula] = pp.preBTSUnitFormula(ctx, o)
    val r: TPostResult[Context, BTSUnitFormula] = if (preR.continu) {
      val o2: BTSUnitFormula = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, BTSUnitName]] = transformISZ(preR.ctx, o2.top, transformBTSUnitName _)
      val r1: TPostResult[Context, IS[Z, BTSUnitName]] = transformISZ(r0.ctx, o2.bottom, transformBTSUnitName _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(top = r0.resultOpt.getOrElse(o2.top), bottom = r1.resultOpt.getOrElse(o2.bottom))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSUnitFormula = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSUnitFormula] = pp.postBTSUnitFormula(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSUnitFactor(ctx: Context, o: BTSUnitFactor): TPostResult[Context, BTSUnitFactor] = {
    val preR: PreResult[Context, BTSUnitFactor] = pp.preBTSUnitFactor(ctx, o)
    val r: TPostResult[Context, BTSUnitFactor] = if (preR.continu) {
      val o2: BTSUnitFactor = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, BTSUnitName] = transformBTSUnitName(preR.ctx, o2.unit)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(unit = r0.resultOpt.getOrElse(o2.unit))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSUnitFactor = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSUnitFactor] = pp.postBTSUnitFactor(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSQuantity(ctx: Context, o: BTSQuantity): TPostResult[Context, BTSQuantity] = {
    val preR: PreResult[Context, BTSQuantity] = pp.preBTSQuantity(ctx, o)
    val r: TPostResult[Context, BTSQuantity] = if (preR.continu) {
      val o2: BTSQuantity = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Option[Name]] = transformOption(preR.ctx, o2.unit, transformName _)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(unit = r0.resultOpt.getOrElse(o2.unit))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSQuantity = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSQuantity] = pp.postBTSQuantity(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSExceptionLibrary(ctx: Context, o: BTSExceptionLibrary): TPostResult[Context, BTSExceptionLibrary] = {
    val preR: PreResult[Context, BTSExceptionLibrary] = pp.preBTSExceptionLibrary(ctx, o)
    val r: TPostResult[Context, BTSExceptionLibrary] = if (preR.continu) {
      val o2: BTSExceptionLibrary = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, BTSExceptionDeclaration]] = transformISZ(preR.ctx, o2.exc, transformBTSExceptionDeclaration _)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(exc = r0.resultOpt.getOrElse(o2.exc))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSExceptionLibrary = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSExceptionLibrary] = pp.postBTSExceptionLibrary(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSExceptionDeclaration(ctx: Context, o: BTSExceptionDeclaration): TPostResult[Context, BTSExceptionDeclaration] = {
    val preR: PreResult[Context, BTSExceptionDeclaration] = pp.preBTSExceptionDeclaration(ctx, o)
    val r: TPostResult[Context, BTSExceptionDeclaration] = if (preR.continu) {
      val o2: BTSExceptionDeclaration = preR.resultOpt.getOrElse(o)
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
    val o2: BTSExceptionDeclaration = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSExceptionDeclaration] = pp.postBTSExceptionDeclaration(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformTODO(ctx: Context, o: TODO): TPostResult[Context, TODO] = {
    val preR: PreResult[Context, TODO] = pp.preTODO(ctx, o)
    val r: TPostResult[Context, TODO] = if (preR.continu) {
      val o2: TODO = preR.resultOpt.getOrElse(o)
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
    val o2: TODO = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, TODO] = pp.postTODO(r.ctx, o2)
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