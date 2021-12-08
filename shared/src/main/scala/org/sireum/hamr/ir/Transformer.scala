// #Sireum
// @formatter:off

/*
 Copyright (c) 2017-2021, Kansas State University
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

// This file is auto-generated from GumboAST.scala

// This file is auto-generated from SmfAST.scala

package org.sireum.hamr.ir

import org.sireum._

object Transformer {

  @datatype class PreResult[Context, T](val ctx: Context,
                                        val continu: B,
                                        val resultOpt: Option[T])

  @datatype class TPostResult[Context, T](val ctx: Context,
                                          val resultOpt: Option[T])

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
        case o: GclSubclause =>
          val r: PreResult[Context, AnnexClause] = preGclSubclause(ctx, o) match {
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
      }
    }

    @pure def preOtherAnnex(ctx: Context, o: OtherAnnex): PreResult[Context, OtherAnnex] = {
      return PreResult(ctx, T, None())
    }

    @pure def preOtherLib(ctx: Context, o: OtherLib): PreResult[Context, OtherLib] = {
      return PreResult(ctx, T, None())
    }

    @pure def preGclAnnex(ctx: Context, o: GclAnnex): PreResult[Context, GclAnnex] = {
      o match {
        case o: GclSubclause =>
          val r: PreResult[Context, GclAnnex] = preGclSubclause(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: GclAnnex)) => PreResult(preCtx, continu, Some[GclAnnex](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type GclAnnex")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[GclAnnex]())
          }
          return r
      }
    }

    @pure def preGclSubclause(ctx: Context, o: GclSubclause): PreResult[Context, GclSubclause] = {
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
      }
    }

    @pure def preGclStateVar(ctx: Context, o: GclStateVar): PreResult[Context, GclStateVar] = {
      return PreResult(ctx, T, None())
    }

    @pure def preGclInvariant(ctx: Context, o: GclInvariant): PreResult[Context, GclInvariant] = {
      return PreResult(ctx, T, None())
    }

    @pure def preGclGuarantee(ctx: Context, o: GclGuarantee): PreResult[Context, GclGuarantee] = {
      return PreResult(ctx, T, None())
    }

    @pure def preGclIntegration(ctx: Context, o: GclIntegration): PreResult[Context, GclIntegration] = {
      return PreResult(ctx, T, None())
    }

    @pure def preGclCompute(ctx: Context, o: GclCompute): PreResult[Context, GclCompute] = {
      return PreResult(ctx, T, None())
    }

    @pure def preGclExp(ctx: Context, o: GclExp): PreResult[Context, GclExp] = {
      o match {
        case o: GclUnaryExp =>
          val r: PreResult[Context, GclExp] = preGclUnaryExp(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: GclExp)) => PreResult(preCtx, continu, Some[GclExp](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type GclExp")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[GclExp]())
          }
          return r
        case o: GclBinaryExp =>
          val r: PreResult[Context, GclExp] = preGclBinaryExp(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: GclExp)) => PreResult(preCtx, continu, Some[GclExp](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type GclExp")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[GclExp]())
          }
          return r
        case o: GclLiteralExp =>
          val r: PreResult[Context, GclExp] = preGclLiteralExp(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: GclExp)) => PreResult(preCtx, continu, Some[GclExp](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type GclExp")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[GclExp]())
          }
          return r
      }
    }

    @pure def preBTSBLESSAnnexClause(ctx: Context, o: BTSBLESSAnnexClause): PreResult[Context, BTSBLESSAnnexClause] = {
      return PreResult(ctx, T, None())
    }

    @pure def preGclUnaryExp(ctx: Context, o: GclUnaryExp): PreResult[Context, GclUnaryExp] = {
      return PreResult(ctx, T, None())
    }

    @pure def preGclBinaryExp(ctx: Context, o: GclBinaryExp): PreResult[Context, GclBinaryExp] = {
      return PreResult(ctx, T, None())
    }

    @pure def preGclLiteralExp(ctx: Context, o: GclLiteralExp): PreResult[Context, GclLiteralExp] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSVariableDeclaration(ctx: Context, o: BTSVariableDeclaration): PreResult[Context, BTSVariableDeclaration] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSType(ctx: Context, o: BTSType): PreResult[Context, BTSType] = {
      o match {
        case o: BTSClassifier =>
          val r: PreResult[Context, BTSType] = preBTSClassifier(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSType)) => PreResult(preCtx, continu, Some[BTSType](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSType")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSType]())
          }
          return r
      }
    }

    @pure def preBTSClassifier(ctx: Context, o: BTSClassifier): PreResult[Context, BTSClassifier] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBLESSIntConst(ctx: Context, o: BLESSIntConst): PreResult[Context, BLESSIntConst] = {
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

    @pure def preBTSInternalCondition(ctx: Context, o: BTSInternalCondition): PreResult[Context, BTSInternalCondition] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSAssertion(ctx: Context, o: BTSAssertion): PreResult[Context, BTSAssertion] = {
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
        case o: BTSSubprogramCallAction =>
          val r: PreResult[Context, BTSAction] = preBTSSubprogramCallAction(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSAction)) => PreResult(preCtx, continu, Some[BTSAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSAction]())
          }
          return r
        case o: BTSPortOutAction =>
          val r: PreResult[Context, BTSAction] = preBTSPortOutAction(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSAction)) => PreResult(preCtx, continu, Some[BTSAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSAction]())
          }
          return r
        case o: BTSPortInAction =>
          val r: PreResult[Context, BTSAction] = preBTSPortInAction(ctx, o) match {
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
        case o: BTSSubprogramCallAction =>
          val r: PreResult[Context, BTSBasicAction] = preBTSSubprogramCallAction(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSBasicAction)) => PreResult(preCtx, continu, Some[BTSBasicAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSBasicAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSBasicAction]())
          }
          return r
        case o: BTSPortOutAction =>
          val r: PreResult[Context, BTSBasicAction] = preBTSPortOutAction(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSBasicAction)) => PreResult(preCtx, continu, Some[BTSBasicAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSBasicAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSBasicAction]())
          }
          return r
        case o: BTSPortInAction =>
          val r: PreResult[Context, BTSBasicAction] = preBTSPortInAction(ctx, o) match {
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
      }
    }

    @pure def preBTSSkipAction(ctx: Context, o: BTSSkipAction): PreResult[Context, BTSSkipAction] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSAssignmentAction(ctx: Context, o: BTSAssignmentAction): PreResult[Context, BTSAssignmentAction] = {
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
        case o: BTSPortOutAction =>
          val r: PreResult[Context, BTSCommunicationAction] = preBTSPortOutAction(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSCommunicationAction)) => PreResult(preCtx, continu, Some[BTSCommunicationAction](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSCommunicationAction")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSCommunicationAction]())
          }
          return r
        case o: BTSPortInAction =>
          val r: PreResult[Context, BTSCommunicationAction] = preBTSPortInAction(ctx, o) match {
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
      }
    }

    @pure def preBTSSubprogramCallAction(ctx: Context, o: BTSSubprogramCallAction): PreResult[Context, BTSSubprogramCallAction] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSPortOutAction(ctx: Context, o: BTSPortOutAction): PreResult[Context, BTSPortOutAction] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSPortInAction(ctx: Context, o: BTSPortInAction): PreResult[Context, BTSPortInAction] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSFrozenPortAction(ctx: Context, o: BTSFrozenPortAction): PreResult[Context, BTSFrozenPortAction] = {
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
        case o: BTSNameExp =>
          val r: PreResult[Context, BTSExp] = preBTSNameExp(ctx, o) match {
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

    @pure def preBTSNameExp(ctx: Context, o: BTSNameExp): PreResult[Context, BTSNameExp] = {
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

    @pure def preBTSFormalExpPair(ctx: Context, o: BTSFormalExpPair): PreResult[Context, BTSFormalExpPair] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSBehaviorTime(ctx: Context, o: BTSBehaviorTime): PreResult[Context, BTSBehaviorTime] = {
      return PreResult(ctx, T, None())
    }

    @pure def preTODO(ctx: Context, o: TODO): PreResult[Context, TODO] = {
      return PreResult(ctx, T, None())
    }

    @pure def preAttr(ctx: Context, o: Attr): PreResult[Context, Attr] = {
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
        case o: GclSubclause =>
          val r: TPostResult[Context, AnnexClause] = postGclSubclause(ctx, o) match {
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
      }
    }

    @pure def postOtherAnnex(ctx: Context, o: OtherAnnex): TPostResult[Context, OtherAnnex] = {
      return TPostResult(ctx, None())
    }

    @pure def postOtherLib(ctx: Context, o: OtherLib): TPostResult[Context, OtherLib] = {
      return TPostResult(ctx, None())
    }

    @pure def postGclAnnex(ctx: Context, o: GclAnnex): TPostResult[Context, GclAnnex] = {
      o match {
        case o: GclSubclause =>
          val r: TPostResult[Context, GclAnnex] = postGclSubclause(ctx, o) match {
           case TPostResult(postCtx, Some(result: GclAnnex)) => TPostResult(postCtx, Some[GclAnnex](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type GclAnnex")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[GclAnnex]())
          }
          return r
      }
    }

    @pure def postGclSubclause(ctx: Context, o: GclSubclause): TPostResult[Context, GclSubclause] = {
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
      }
    }

    @pure def postGclStateVar(ctx: Context, o: GclStateVar): TPostResult[Context, GclStateVar] = {
      return TPostResult(ctx, None())
    }

    @pure def postGclInvariant(ctx: Context, o: GclInvariant): TPostResult[Context, GclInvariant] = {
      return TPostResult(ctx, None())
    }

    @pure def postGclGuarantee(ctx: Context, o: GclGuarantee): TPostResult[Context, GclGuarantee] = {
      return TPostResult(ctx, None())
    }

    @pure def postGclIntegration(ctx: Context, o: GclIntegration): TPostResult[Context, GclIntegration] = {
      return TPostResult(ctx, None())
    }

    @pure def postGclCompute(ctx: Context, o: GclCompute): TPostResult[Context, GclCompute] = {
      return TPostResult(ctx, None())
    }

    @pure def postGclExp(ctx: Context, o: GclExp): TPostResult[Context, GclExp] = {
      o match {
        case o: GclUnaryExp =>
          val r: TPostResult[Context, GclExp] = postGclUnaryExp(ctx, o) match {
           case TPostResult(postCtx, Some(result: GclExp)) => TPostResult(postCtx, Some[GclExp](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type GclExp")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[GclExp]())
          }
          return r
        case o: GclBinaryExp =>
          val r: TPostResult[Context, GclExp] = postGclBinaryExp(ctx, o) match {
           case TPostResult(postCtx, Some(result: GclExp)) => TPostResult(postCtx, Some[GclExp](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type GclExp")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[GclExp]())
          }
          return r
        case o: GclLiteralExp =>
          val r: TPostResult[Context, GclExp] = postGclLiteralExp(ctx, o) match {
           case TPostResult(postCtx, Some(result: GclExp)) => TPostResult(postCtx, Some[GclExp](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type GclExp")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[GclExp]())
          }
          return r
      }
    }

    @pure def postBTSBLESSAnnexClause(ctx: Context, o: BTSBLESSAnnexClause): TPostResult[Context, BTSBLESSAnnexClause] = {
      return TPostResult(ctx, None())
    }

    @pure def postGclUnaryExp(ctx: Context, o: GclUnaryExp): TPostResult[Context, GclUnaryExp] = {
      return TPostResult(ctx, None())
    }

    @pure def postGclBinaryExp(ctx: Context, o: GclBinaryExp): TPostResult[Context, GclBinaryExp] = {
      return TPostResult(ctx, None())
    }

    @pure def postGclLiteralExp(ctx: Context, o: GclLiteralExp): TPostResult[Context, GclLiteralExp] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSVariableDeclaration(ctx: Context, o: BTSVariableDeclaration): TPostResult[Context, BTSVariableDeclaration] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSType(ctx: Context, o: BTSType): TPostResult[Context, BTSType] = {
      o match {
        case o: BTSClassifier =>
          val r: TPostResult[Context, BTSType] = postBTSClassifier(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSType)) => TPostResult(postCtx, Some[BTSType](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSType")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSType]())
          }
          return r
      }
    }

    @pure def postBTSClassifier(ctx: Context, o: BTSClassifier): TPostResult[Context, BTSClassifier] = {
      return TPostResult(ctx, None())
    }

    @pure def postBLESSIntConst(ctx: Context, o: BLESSIntConst): TPostResult[Context, BLESSIntConst] = {
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

    @pure def postBTSInternalCondition(ctx: Context, o: BTSInternalCondition): TPostResult[Context, BTSInternalCondition] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSAssertion(ctx: Context, o: BTSAssertion): TPostResult[Context, BTSAssertion] = {
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
        case o: BTSSubprogramCallAction =>
          val r: TPostResult[Context, BTSAction] = postBTSSubprogramCallAction(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSAction)) => TPostResult(postCtx, Some[BTSAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSAction]())
          }
          return r
        case o: BTSPortOutAction =>
          val r: TPostResult[Context, BTSAction] = postBTSPortOutAction(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSAction)) => TPostResult(postCtx, Some[BTSAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSAction]())
          }
          return r
        case o: BTSPortInAction =>
          val r: TPostResult[Context, BTSAction] = postBTSPortInAction(ctx, o) match {
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
        case o: BTSSubprogramCallAction =>
          val r: TPostResult[Context, BTSBasicAction] = postBTSSubprogramCallAction(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSBasicAction)) => TPostResult(postCtx, Some[BTSBasicAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSBasicAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSBasicAction]())
          }
          return r
        case o: BTSPortOutAction =>
          val r: TPostResult[Context, BTSBasicAction] = postBTSPortOutAction(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSBasicAction)) => TPostResult(postCtx, Some[BTSBasicAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSBasicAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSBasicAction]())
          }
          return r
        case o: BTSPortInAction =>
          val r: TPostResult[Context, BTSBasicAction] = postBTSPortInAction(ctx, o) match {
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
      }
    }

    @pure def postBTSSkipAction(ctx: Context, o: BTSSkipAction): TPostResult[Context, BTSSkipAction] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSAssignmentAction(ctx: Context, o: BTSAssignmentAction): TPostResult[Context, BTSAssignmentAction] = {
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
        case o: BTSPortOutAction =>
          val r: TPostResult[Context, BTSCommunicationAction] = postBTSPortOutAction(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSCommunicationAction)) => TPostResult(postCtx, Some[BTSCommunicationAction](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSCommunicationAction")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSCommunicationAction]())
          }
          return r
        case o: BTSPortInAction =>
          val r: TPostResult[Context, BTSCommunicationAction] = postBTSPortInAction(ctx, o) match {
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
      }
    }

    @pure def postBTSSubprogramCallAction(ctx: Context, o: BTSSubprogramCallAction): TPostResult[Context, BTSSubprogramCallAction] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSPortOutAction(ctx: Context, o: BTSPortOutAction): TPostResult[Context, BTSPortOutAction] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSPortInAction(ctx: Context, o: BTSPortInAction): TPostResult[Context, BTSPortInAction] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSFrozenPortAction(ctx: Context, o: BTSFrozenPortAction): TPostResult[Context, BTSFrozenPortAction] = {
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
        case o: BTSNameExp =>
          val r: TPostResult[Context, BTSExp] = postBTSNameExp(ctx, o) match {
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

    @pure def postBTSNameExp(ctx: Context, o: BTSNameExp): TPostResult[Context, BTSNameExp] = {
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

    @pure def postBTSFormalExpPair(ctx: Context, o: BTSFormalExpPair): TPostResult[Context, BTSFormalExpPair] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSBehaviorTime(ctx: Context, o: BTSBehaviorTime): TPostResult[Context, BTSBehaviorTime] = {
      return TPostResult(ctx, None())
    }

    @pure def postTODO(ctx: Context, o: TODO): TPostResult[Context, TODO] = {
      return TPostResult(ctx, None())
    }

    @pure def postAttr(ctx: Context, o: Attr): TPostResult[Context, Attr] = {
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

@datatype class Transformer[Context](val pp: PrePost[Context]) {

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
        case o2: GclSubclause =>
          val r0: TPostResult[Context, IS[Z, GclStateVar]] = transformISZ(preR.ctx, o2.state, transformGclStateVar _)
          val r1: TPostResult[Context, IS[Z, GclInvariant]] = transformISZ(r0.ctx, o2.invariants, transformGclInvariant _)
          val r2: TPostResult[Context, IS[Z, GclGuarantee]] = transformISZ(r1.ctx, o2.initializes, transformGclGuarantee _)
          val r3: TPostResult[Context, Option[GclIntegration]] = transformOption(r2.ctx, o2.integration, transformGclIntegration _)
          val r4: TPostResult[Context, Option[GclCompute]] = transformOption(r3.ctx, o2.compute, transformGclCompute _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
            TPostResult(r4.ctx, Some(o2(state = r0.resultOpt.getOrElse(o2.state), invariants = r1.resultOpt.getOrElse(o2.invariants), initializes = r2.resultOpt.getOrElse(o2.initializes), integration = r3.resultOpt.getOrElse(o2.integration), compute = r4.resultOpt.getOrElse(o2.compute))))
          else
            TPostResult(r4.ctx, None())
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

  @pure def transformGclAnnex(ctx: Context, o: GclAnnex): TPostResult[Context, GclAnnex] = {
    val preR: PreResult[Context, GclAnnex] = pp.preGclAnnex(ctx, o)
    val r: TPostResult[Context, GclAnnex] = if (preR.continu) {
      val o2: GclAnnex = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, GclAnnex] = o2 match {
        case o2: GclSubclause =>
          val r0: TPostResult[Context, IS[Z, GclStateVar]] = transformISZ(preR.ctx, o2.state, transformGclStateVar _)
          val r1: TPostResult[Context, IS[Z, GclInvariant]] = transformISZ(r0.ctx, o2.invariants, transformGclInvariant _)
          val r2: TPostResult[Context, IS[Z, GclGuarantee]] = transformISZ(r1.ctx, o2.initializes, transformGclGuarantee _)
          val r3: TPostResult[Context, Option[GclIntegration]] = transformOption(r2.ctx, o2.integration, transformGclIntegration _)
          val r4: TPostResult[Context, Option[GclCompute]] = transformOption(r3.ctx, o2.compute, transformGclCompute _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
            TPostResult(r4.ctx, Some(o2(state = r0.resultOpt.getOrElse(o2.state), invariants = r1.resultOpt.getOrElse(o2.invariants), initializes = r2.resultOpt.getOrElse(o2.initializes), integration = r3.resultOpt.getOrElse(o2.integration), compute = r4.resultOpt.getOrElse(o2.compute))))
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
    val o2: GclAnnex = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, GclAnnex] = pp.postGclAnnex(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformGclSubclause(ctx: Context, o: GclSubclause): TPostResult[Context, GclSubclause] = {
    val preR: PreResult[Context, GclSubclause] = pp.preGclSubclause(ctx, o)
    val r: TPostResult[Context, GclSubclause] = if (preR.continu) {
      val o2: GclSubclause = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, GclStateVar]] = transformISZ(preR.ctx, o2.state, transformGclStateVar _)
      val r1: TPostResult[Context, IS[Z, GclInvariant]] = transformISZ(r0.ctx, o2.invariants, transformGclInvariant _)
      val r2: TPostResult[Context, IS[Z, GclGuarantee]] = transformISZ(r1.ctx, o2.initializes, transformGclGuarantee _)
      val r3: TPostResult[Context, Option[GclIntegration]] = transformOption(r2.ctx, o2.integration, transformGclIntegration _)
      val r4: TPostResult[Context, Option[GclCompute]] = transformOption(r3.ctx, o2.compute, transformGclCompute _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
        TPostResult(r4.ctx, Some(o2(state = r0.resultOpt.getOrElse(o2.state), invariants = r1.resultOpt.getOrElse(o2.invariants), initializes = r2.resultOpt.getOrElse(o2.initializes), integration = r3.resultOpt.getOrElse(o2.integration), compute = r4.resultOpt.getOrElse(o2.compute))))
      else
        TPostResult(r4.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: GclSubclause = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, GclSubclause] = pp.postGclSubclause(r.ctx, o2)
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

  @pure def transformGclStateVar(ctx: Context, o: GclStateVar): TPostResult[Context, GclStateVar] = {
    val preR: PreResult[Context, GclStateVar] = pp.preGclStateVar(ctx, o)
    val r: TPostResult[Context, GclStateVar] = if (preR.continu) {
      val o2: GclStateVar = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, GclExp] = transformGclExp(preR.ctx, o2.exp)
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
    val o2: GclStateVar = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, GclStateVar] = pp.postGclStateVar(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformGclInvariant(ctx: Context, o: GclInvariant): TPostResult[Context, GclInvariant] = {
    val preR: PreResult[Context, GclInvariant] = pp.preGclInvariant(ctx, o)
    val r: TPostResult[Context, GclInvariant] = if (preR.continu) {
      val o2: GclInvariant = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, GclExp] = transformGclExp(preR.ctx, o2.exp)
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
    val o2: GclInvariant = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, GclInvariant] = pp.postGclInvariant(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformGclGuarantee(ctx: Context, o: GclGuarantee): TPostResult[Context, GclGuarantee] = {
    val preR: PreResult[Context, GclGuarantee] = pp.preGclGuarantee(ctx, o)
    val r: TPostResult[Context, GclGuarantee] = if (preR.continu) {
      val o2: GclGuarantee = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, GclExp] = transformGclExp(preR.ctx, o2.exp)
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
    val o2: GclGuarantee = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, GclGuarantee] = pp.postGclGuarantee(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformGclIntegration(ctx: Context, o: GclIntegration): TPostResult[Context, GclIntegration] = {
    val preR: PreResult[Context, GclIntegration] = pp.preGclIntegration(ctx, o)
    val r: TPostResult[Context, GclIntegration] = if (preR.continu) {
      val o2: GclIntegration = preR.resultOpt.getOrElse(o)
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
    val o2: GclIntegration = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, GclIntegration] = pp.postGclIntegration(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformGclCompute(ctx: Context, o: GclCompute): TPostResult[Context, GclCompute] = {
    val preR: PreResult[Context, GclCompute] = pp.preGclCompute(ctx, o)
    val r: TPostResult[Context, GclCompute] = if (preR.continu) {
      val o2: GclCompute = preR.resultOpt.getOrElse(o)
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
    val o2: GclCompute = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, GclCompute] = pp.postGclCompute(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformGclExp(ctx: Context, o: GclExp): TPostResult[Context, GclExp] = {
    val preR: PreResult[Context, GclExp] = pp.preGclExp(ctx, o)
    val r: TPostResult[Context, GclExp] = if (preR.continu) {
      val o2: GclExp = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, GclExp] = o2 match {
        case o2: GclUnaryExp =>
          val r0: TPostResult[Context, GclExp] = transformGclExp(preR.ctx, o2.exp)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(exp = r0.resultOpt.getOrElse(o2.exp))))
          else
            TPostResult(r0.ctx, None())
        case o2: GclBinaryExp =>
          val r0: TPostResult[Context, GclExp] = transformGclExp(preR.ctx, o2.lhs)
          val r1: TPostResult[Context, GclExp] = transformGclExp(r0.ctx, o2.rhs)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(lhs = r0.resultOpt.getOrElse(o2.lhs), rhs = r1.resultOpt.getOrElse(o2.rhs))))
          else
            TPostResult(r1.ctx, None())
        case o2: GclLiteralExp =>
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
    val o2: GclExp = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, GclExp] = pp.postGclExp(r.ctx, o2)
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

  @pure def transformGclUnaryExp(ctx: Context, o: GclUnaryExp): TPostResult[Context, GclUnaryExp] = {
    val preR: PreResult[Context, GclUnaryExp] = pp.preGclUnaryExp(ctx, o)
    val r: TPostResult[Context, GclUnaryExp] = if (preR.continu) {
      val o2: GclUnaryExp = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, GclExp] = transformGclExp(preR.ctx, o2.exp)
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
    val o2: GclUnaryExp = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, GclUnaryExp] = pp.postGclUnaryExp(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformGclBinaryExp(ctx: Context, o: GclBinaryExp): TPostResult[Context, GclBinaryExp] = {
    val preR: PreResult[Context, GclBinaryExp] = pp.preGclBinaryExp(ctx, o)
    val r: TPostResult[Context, GclBinaryExp] = if (preR.continu) {
      val o2: GclBinaryExp = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, GclExp] = transformGclExp(preR.ctx, o2.lhs)
      val r1: TPostResult[Context, GclExp] = transformGclExp(r0.ctx, o2.rhs)
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
    val o2: GclBinaryExp = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, GclBinaryExp] = pp.postGclBinaryExp(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformGclLiteralExp(ctx: Context, o: GclLiteralExp): TPostResult[Context, GclLiteralExp] = {
    val preR: PreResult[Context, GclLiteralExp] = pp.preGclLiteralExp(ctx, o)
    val r: TPostResult[Context, GclLiteralExp] = if (preR.continu) {
      val o2: GclLiteralExp = preR.resultOpt.getOrElse(o)
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
    val o2: GclLiteralExp = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, GclLiteralExp] = pp.postGclLiteralExp(r.ctx, o2)
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
      val r3: TPostResult[Context, Option[BLESSIntConst]] = transformOption(r2.ctx, o2.arraySize, transformBLESSIntConst _)
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

  @pure def transformBTSType(ctx: Context, o: BTSType): TPostResult[Context, BTSType] = {
    val preR: PreResult[Context, BTSType] = pp.preBTSType(ctx, o)
    val r: TPostResult[Context, BTSType] = if (preR.continu) {
      val o2: BTSType = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, BTSType] = o2 match {
        case o2: BTSClassifier =>
          val r0: TPostResult[Context, Classifier] = transformClassifier(preR.ctx, o2.classifier)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(classifier = r0.resultOpt.getOrElse(o2.classifier))))
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

  @pure def transformBTSClassifier(ctx: Context, o: BTSClassifier): TPostResult[Context, BTSClassifier] = {
    val preR: PreResult[Context, BTSClassifier] = pp.preBTSClassifier(ctx, o)
    val r: TPostResult[Context, BTSClassifier] = if (preR.continu) {
      val o2: BTSClassifier = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Classifier] = transformClassifier(preR.ctx, o2.classifier)
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

  @pure def transformBLESSIntConst(ctx: Context, o: BLESSIntConst): TPostResult[Context, BLESSIntConst] = {
    val preR: PreResult[Context, BLESSIntConst] = pp.preBLESSIntConst(ctx, o)
    val r: TPostResult[Context, BLESSIntConst] = if (preR.continu) {
      val o2: BLESSIntConst = preR.resultOpt.getOrElse(o)
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
    val o2: BLESSIntConst = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BLESSIntConst] = pp.postBLESSIntConst(r.ctx, o2)
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
          val r0: TPostResult[Context, IS[Z, BTSDispatchConjunction]] = transformISZ(preR.ctx, o2.dispatchTriggers, transformBTSDispatchConjunction _)
          val r1: TPostResult[Context, IS[Z, Name]] = transformISZ(r0.ctx, o2.frozenPorts, transformName _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(dispatchTriggers = r0.resultOpt.getOrElse(o2.dispatchTriggers), frozenPorts = r1.resultOpt.getOrElse(o2.frozenPorts))))
          else
            TPostResult(r1.ctx, None())
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
          if (hasChanged)
            TPostResult(preR.ctx, Some(o2))
          else
            TPostResult(preR.ctx, None())
        case o2: BTSInternalCondition =>
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
      val r0: TPostResult[Context, IS[Z, BTSDispatchConjunction]] = transformISZ(preR.ctx, o2.dispatchTriggers, transformBTSDispatchConjunction _)
      val r1: TPostResult[Context, IS[Z, Name]] = transformISZ(r0.ctx, o2.frozenPorts, transformName _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(dispatchTriggers = r0.resultOpt.getOrElse(o2.dispatchTriggers), frozenPorts = r1.resultOpt.getOrElse(o2.frozenPorts))))
      else
        TPostResult(r1.ctx, None())
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
      val r0: TPostResult[Context, IS[Z, BTSDispatchTrigger]] = transformISZ(preR.ctx, o2.conjunction, transformBTSDispatchTrigger _)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(conjunction = r0.resultOpt.getOrElse(o2.conjunction))))
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
          val r1: TPostResult[Context, Option[BTSBehaviorTime]] = transformOption(r0.ctx, o2.time, transformBTSBehaviorTime _)
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
      val r1: TPostResult[Context, Option[BTSBehaviorTime]] = transformOption(r0.ctx, o2.time, transformBTSBehaviorTime _)
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

  @pure def transformBTSInternalCondition(ctx: Context, o: BTSInternalCondition): TPostResult[Context, BTSInternalCondition] = {
    val preR: PreResult[Context, BTSInternalCondition] = pp.preBTSInternalCondition(ctx, o)
    val r: TPostResult[Context, BTSInternalCondition] = if (preR.continu) {
      val o2: BTSInternalCondition = preR.resultOpt.getOrElse(o)
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
          val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.lhs)
          val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.rhs)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(lhs = r0.resultOpt.getOrElse(o2.lhs), rhs = r1.resultOpt.getOrElse(o2.rhs))))
          else
            TPostResult(r1.ctx, None())
        case o2: BTSSubprogramCallAction =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
          val r1: TPostResult[Context, IS[Z, BTSFormalExpPair]] = transformISZ(r0.ctx, o2.params, transformBTSFormalExpPair _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), params = r1.resultOpt.getOrElse(o2.params))))
          else
            TPostResult(r1.ctx, None())
        case o2: BTSPortOutAction =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
          val r1: TPostResult[Context, Option[BTSExp]] = transformOption(r0.ctx, o2.exp, transformBTSExp _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), exp = r1.resultOpt.getOrElse(o2.exp))))
          else
            TPostResult(r1.ctx, None())
        case o2: BTSPortInAction =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
          val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.variable)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), variable = r1.resultOpt.getOrElse(o2.variable))))
          else
            TPostResult(r1.ctx, None())
        case o2: BTSFrozenPortAction =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.portName)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(portName = r0.resultOpt.getOrElse(o2.portName))))
          else
            TPostResult(r0.ctx, None())
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
        case o2: BTSExistentialLatticeQuantification =>
          val r0: TPostResult[Context, IS[Z, BTSVariableDeclaration]] = transformISZ(preR.ctx, o2.quantifiedVariables, transformBTSVariableDeclaration _)
          val r1: TPostResult[Context, BTSBehaviorActions] = transformBTSBehaviorActions(r0.ctx, o2.actions)
          val r2: TPostResult[Context, Option[BTSBehaviorTime]] = transformOption(r1.ctx, o2.timeout, transformBTSBehaviorTime _)
          val r3: TPostResult[Context, Option[TODO]] = transformOption(r2.ctx, o2.catchClause, transformTODO _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(quantifiedVariables = r0.resultOpt.getOrElse(o2.quantifiedVariables), actions = r1.resultOpt.getOrElse(o2.actions), timeout = r2.resultOpt.getOrElse(o2.timeout), catchClause = r3.resultOpt.getOrElse(o2.catchClause))))
          else
            TPostResult(r3.ctx, None())
        case o2: BTSUniversalLatticeQuantification =>
          val r0: TPostResult[Context, IS[Z, Name]] = transformISZ(preR.ctx, o2.latticeVariables, transformName _)
          val r1: TPostResult[Context, Option[TODO]] = transformOption(r0.ctx, o2.range, transformTODO _)
          val r2: TPostResult[Context, BTSExistentialLatticeQuantification] = transformBTSExistentialLatticeQuantification(r1.ctx, o2.elq)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(latticeVariables = r0.resultOpt.getOrElse(o2.latticeVariables), range = r1.resultOpt.getOrElse(o2.range), elq = r2.resultOpt.getOrElse(o2.elq))))
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
          val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.lhs)
          val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.rhs)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(lhs = r0.resultOpt.getOrElse(o2.lhs), rhs = r1.resultOpt.getOrElse(o2.rhs))))
          else
            TPostResult(r1.ctx, None())
        case o2: BTSSubprogramCallAction =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
          val r1: TPostResult[Context, IS[Z, BTSFormalExpPair]] = transformISZ(r0.ctx, o2.params, transformBTSFormalExpPair _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), params = r1.resultOpt.getOrElse(o2.params))))
          else
            TPostResult(r1.ctx, None())
        case o2: BTSPortOutAction =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
          val r1: TPostResult[Context, Option[BTSExp]] = transformOption(r0.ctx, o2.exp, transformBTSExp _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), exp = r1.resultOpt.getOrElse(o2.exp))))
          else
            TPostResult(r1.ctx, None())
        case o2: BTSPortInAction =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
          val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.variable)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), variable = r1.resultOpt.getOrElse(o2.variable))))
          else
            TPostResult(r1.ctx, None())
        case o2: BTSFrozenPortAction =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.portName)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(portName = r0.resultOpt.getOrElse(o2.portName))))
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

  @pure def transformBTSCommunicationAction(ctx: Context, o: BTSCommunicationAction): TPostResult[Context, BTSCommunicationAction] = {
    val preR: PreResult[Context, BTSCommunicationAction] = pp.preBTSCommunicationAction(ctx, o)
    val r: TPostResult[Context, BTSCommunicationAction] = if (preR.continu) {
      val o2: BTSCommunicationAction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, BTSCommunicationAction] = o2 match {
        case o2: BTSSubprogramCallAction =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
          val r1: TPostResult[Context, IS[Z, BTSFormalExpPair]] = transformISZ(r0.ctx, o2.params, transformBTSFormalExpPair _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), params = r1.resultOpt.getOrElse(o2.params))))
          else
            TPostResult(r1.ctx, None())
        case o2: BTSPortOutAction =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
          val r1: TPostResult[Context, Option[BTSExp]] = transformOption(r0.ctx, o2.exp, transformBTSExp _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), exp = r1.resultOpt.getOrElse(o2.exp))))
          else
            TPostResult(r1.ctx, None())
        case o2: BTSPortInAction =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
          val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.variable)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), variable = r1.resultOpt.getOrElse(o2.variable))))
          else
            TPostResult(r1.ctx, None())
        case o2: BTSFrozenPortAction =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.portName)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(portName = r0.resultOpt.getOrElse(o2.portName))))
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
      val r1: TPostResult[Context, IS[Z, BTSFormalExpPair]] = transformISZ(r0.ctx, o2.params, transformBTSFormalExpPair _)
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

  @pure def transformBTSPortOutAction(ctx: Context, o: BTSPortOutAction): TPostResult[Context, BTSPortOutAction] = {
    val preR: PreResult[Context, BTSPortOutAction] = pp.preBTSPortOutAction(ctx, o)
    val r: TPostResult[Context, BTSPortOutAction] = if (preR.continu) {
      val o2: BTSPortOutAction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
      val r1: TPostResult[Context, Option[BTSExp]] = transformOption(r0.ctx, o2.exp, transformBTSExp _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), exp = r1.resultOpt.getOrElse(o2.exp))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSPortOutAction = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSPortOutAction] = pp.postBTSPortOutAction(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSPortInAction(ctx: Context, o: BTSPortInAction): TPostResult[Context, BTSPortInAction] = {
    val preR: PreResult[Context, BTSPortInAction] = pp.preBTSPortInAction(ctx, o)
    val r: TPostResult[Context, BTSPortInAction] = if (preR.continu) {
      val o2: BTSPortInAction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
      val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.variable)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), variable = r1.resultOpt.getOrElse(o2.variable))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSPortInAction = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSPortInAction] = pp.postBTSPortInAction(r.ctx, o2)
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
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.portName)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(portName = r0.resultOpt.getOrElse(o2.portName))))
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

  @pure def transformBTSQuantificationActions(ctx: Context, o: BTSQuantificationActions): TPostResult[Context, BTSQuantificationActions] = {
    val preR: PreResult[Context, BTSQuantificationActions] = pp.preBTSQuantificationActions(ctx, o)
    val r: TPostResult[Context, BTSQuantificationActions] = if (preR.continu) {
      val o2: BTSQuantificationActions = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, BTSQuantificationActions] = o2 match {
        case o2: BTSExistentialLatticeQuantification =>
          val r0: TPostResult[Context, IS[Z, BTSVariableDeclaration]] = transformISZ(preR.ctx, o2.quantifiedVariables, transformBTSVariableDeclaration _)
          val r1: TPostResult[Context, BTSBehaviorActions] = transformBTSBehaviorActions(r0.ctx, o2.actions)
          val r2: TPostResult[Context, Option[BTSBehaviorTime]] = transformOption(r1.ctx, o2.timeout, transformBTSBehaviorTime _)
          val r3: TPostResult[Context, Option[TODO]] = transformOption(r2.ctx, o2.catchClause, transformTODO _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(quantifiedVariables = r0.resultOpt.getOrElse(o2.quantifiedVariables), actions = r1.resultOpt.getOrElse(o2.actions), timeout = r2.resultOpt.getOrElse(o2.timeout), catchClause = r3.resultOpt.getOrElse(o2.catchClause))))
          else
            TPostResult(r3.ctx, None())
        case o2: BTSUniversalLatticeQuantification =>
          val r0: TPostResult[Context, IS[Z, Name]] = transformISZ(preR.ctx, o2.latticeVariables, transformName _)
          val r1: TPostResult[Context, Option[TODO]] = transformOption(r0.ctx, o2.range, transformTODO _)
          val r2: TPostResult[Context, BTSExistentialLatticeQuantification] = transformBTSExistentialLatticeQuantification(r1.ctx, o2.elq)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(latticeVariables = r0.resultOpt.getOrElse(o2.latticeVariables), range = r1.resultOpt.getOrElse(o2.range), elq = r2.resultOpt.getOrElse(o2.elq))))
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
      val r2: TPostResult[Context, Option[BTSBehaviorTime]] = transformOption(r1.ctx, o2.timeout, transformBTSBehaviorTime _)
      val r3: TPostResult[Context, Option[TODO]] = transformOption(r2.ctx, o2.catchClause, transformTODO _)
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

  @pure def transformBTSUniversalLatticeQuantification(ctx: Context, o: BTSUniversalLatticeQuantification): TPostResult[Context, BTSUniversalLatticeQuantification] = {
    val preR: PreResult[Context, BTSUniversalLatticeQuantification] = pp.preBTSUniversalLatticeQuantification(ctx, o)
    val r: TPostResult[Context, BTSUniversalLatticeQuantification] = if (preR.continu) {
      val o2: BTSUniversalLatticeQuantification = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, Name]] = transformISZ(preR.ctx, o2.latticeVariables, transformName _)
      val r1: TPostResult[Context, Option[TODO]] = transformOption(r0.ctx, o2.range, transformTODO _)
      val r2: TPostResult[Context, BTSExistentialLatticeQuantification] = transformBTSExistentialLatticeQuantification(r1.ctx, o2.elq)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        TPostResult(r2.ctx, Some(o2(latticeVariables = r0.resultOpt.getOrElse(o2.latticeVariables), range = r1.resultOpt.getOrElse(o2.range), elq = r2.resultOpt.getOrElse(o2.elq))))
      else
        TPostResult(r2.ctx, None())
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
          if (hasChanged)
            TPostResult(preR.ctx, Some(o2))
          else
            TPostResult(preR.ctx, None())
        case o2: BTSNameExp =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name))))
          else
            TPostResult(r0.ctx, None())
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
          val r1: TPostResult[Context, IS[Z, BTSFormalExpPair]] = transformISZ(r0.ctx, o2.args, transformBTSFormalExpPair _)
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

  @pure def transformBTSNameExp(ctx: Context, o: BTSNameExp): TPostResult[Context, BTSNameExp] = {
    val preR: PreResult[Context, BTSNameExp] = pp.preBTSNameExp(ctx, o)
    val r: TPostResult[Context, BTSNameExp] = if (preR.continu) {
      val o2: BTSNameExp = preR.resultOpt.getOrElse(o)
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
    val o2: BTSNameExp = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSNameExp] = pp.postBTSNameExp(r.ctx, o2)
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
      val r1: TPostResult[Context, IS[Z, BTSFormalExpPair]] = transformISZ(r0.ctx, o2.args, transformBTSFormalExpPair _)
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

  @pure def transformBTSFormalExpPair(ctx: Context, o: BTSFormalExpPair): TPostResult[Context, BTSFormalExpPair] = {
    val preR: PreResult[Context, BTSFormalExpPair] = pp.preBTSFormalExpPair(ctx, o)
    val r: TPostResult[Context, BTSFormalExpPair] = if (preR.continu) {
      val o2: BTSFormalExpPair = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Option[Name]] = transformOption(preR.ctx, o2.paramName, transformName _)
      val r1: TPostResult[Context, Option[BTSExp]] = transformOption(r0.ctx, o2.exp, transformBTSExp _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(paramName = r0.resultOpt.getOrElse(o2.paramName), exp = r1.resultOpt.getOrElse(o2.exp))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSFormalExpPair = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSFormalExpPair] = pp.postBTSFormalExpPair(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSBehaviorTime(ctx: Context, o: BTSBehaviorTime): TPostResult[Context, BTSBehaviorTime] = {
    val preR: PreResult[Context, BTSBehaviorTime] = pp.preBTSBehaviorTime(ctx, o)
    val r: TPostResult[Context, BTSBehaviorTime] = if (preR.continu) {
      val o2: BTSBehaviorTime = preR.resultOpt.getOrElse(o)
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
    val o2: BTSBehaviorTime = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSBehaviorTime] = pp.postBTSBehaviorTime(r.ctx, o2)
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

  @pure def transformAttr(ctx: Context, o: Attr): TPostResult[Context, Attr] = {
    val preR: PreResult[Context, Attr] = pp.preAttr(ctx, o)
    val r: TPostResult[Context, Attr] = if (preR.continu) {
      val o2: Attr = preR.resultOpt.getOrElse(o)
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
    val o2: Attr = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, Attr] = pp.postAttr(r.ctx, o2)
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