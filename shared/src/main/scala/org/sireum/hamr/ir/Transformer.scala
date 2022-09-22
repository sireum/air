// #Sireum
// @formatter:off

/*
 Copyright (c) 2017-2022, Kansas State University
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

// This file is auto-generated from AST.scala

// This file is auto-generated from Typed.scala

package org.sireum.hamr.ir

import org.sireum._

object Transformer {

  @datatype class PreResult[Context, T](val ctx: Context,
                                        val continu: B,
                                        val resultOpt: Option[T])

  @datatype class TPostResult[Context, T](val ctx: Context,
                                          val resultOpt: Option[T])

  @sig trait PrePost[Context] {

    @pure def pre_langastTopUnit(ctx: Context, o: org.sireum.lang.ast.TopUnit): PreResult[Context, org.sireum.lang.ast.TopUnit] = {
      o match {
        case o: org.sireum.lang.ast.TopUnit.Program => return pre_langastTopUnitProgram(ctx, o)
        case o: org.sireum.lang.ast.TopUnit.SequentUnit => return pre_langastTopUnitSequentUnit(ctx, o)
        case o: org.sireum.lang.ast.TopUnit.TruthTableUnit => return pre_langastTopUnitTruthTableUnit(ctx, o)
      }
    }

    @pure def pre_langastTopUnitProgram(ctx: Context, o: org.sireum.lang.ast.TopUnit.Program): PreResult[Context, org.sireum.lang.ast.TopUnit] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastTopUnitSequentUnit(ctx: Context, o: org.sireum.lang.ast.TopUnit.SequentUnit): PreResult[Context, org.sireum.lang.ast.TopUnit] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastTopUnitTruthTableUnit(ctx: Context, o: org.sireum.lang.ast.TopUnit.TruthTableUnit): PreResult[Context, org.sireum.lang.ast.TopUnit] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastStmt(ctx: Context, o: org.sireum.lang.ast.Stmt): PreResult[Context, org.sireum.lang.ast.Stmt] = {
      o match {
        case o: org.sireum.lang.ast.Stmt.Import => return pre_langastStmtImport(ctx, o)
        case o: org.sireum.lang.ast.Stmt.Var => return pre_langastStmtVar(ctx, o)
        case o: org.sireum.lang.ast.Stmt.VarPattern => return pre_langastStmtVarPattern(ctx, o)
        case o: org.sireum.lang.ast.Stmt.SpecVar => return pre_langastStmtSpecVar(ctx, o)
        case o: org.sireum.lang.ast.Stmt.Method => return pre_langastStmtMethod(ctx, o)
        case o: org.sireum.lang.ast.Stmt.ExtMethod => return pre_langastStmtExtMethod(ctx, o)
        case o: org.sireum.lang.ast.Stmt.JustMethod => return pre_langastStmtJustMethod(ctx, o)
        case o: org.sireum.lang.ast.Stmt.SpecMethod => return pre_langastStmtSpecMethod(ctx, o)
        case o: org.sireum.lang.ast.Stmt.Enum => return pre_langastStmtEnum(ctx, o)
        case o: org.sireum.lang.ast.Stmt.SubZ => return pre_langastStmtSubZ(ctx, o)
        case o: org.sireum.lang.ast.Stmt.Object => return pre_langastStmtObject(ctx, o)
        case o: org.sireum.lang.ast.Stmt.Sig => return pre_langastStmtSig(ctx, o)
        case o: org.sireum.lang.ast.Stmt.Adt => return pre_langastStmtAdt(ctx, o)
        case o: org.sireum.lang.ast.Stmt.TypeAlias => return pre_langastStmtTypeAlias(ctx, o)
        case o: org.sireum.lang.ast.Stmt.Assign => return pre_langastStmtAssign(ctx, o)
        case o: org.sireum.lang.ast.Stmt.Block => return pre_langastStmtBlock(ctx, o)
        case o: org.sireum.lang.ast.Stmt.If => return pre_langastStmtIf(ctx, o)
        case o: org.sireum.lang.ast.Stmt.Match => return pre_langastStmtMatch(ctx, o)
        case o: org.sireum.lang.ast.Stmt.While => return pre_langastStmtWhile(ctx, o)
        case o: org.sireum.lang.ast.Stmt.DoWhile => return pre_langastStmtDoWhile(ctx, o)
        case o: org.sireum.lang.ast.Stmt.For => return pre_langastStmtFor(ctx, o)
        case o: org.sireum.lang.ast.Stmt.Return => return pre_langastStmtReturn(ctx, o)
        case o: org.sireum.lang.ast.Stmt.Expr => return pre_langastStmtExpr(ctx, o)
        case o: org.sireum.lang.ast.Stmt.Fact =>
          val r: PreResult[Context, org.sireum.lang.ast.Stmt] = pre_langastStmtFact(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.Stmt)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.Stmt](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Stmt")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.Stmt]())
          }
          return r
        case o: org.sireum.lang.ast.Stmt.Inv =>
          val r: PreResult[Context, org.sireum.lang.ast.Stmt] = pre_langastStmtInv(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.Stmt)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.Stmt](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Stmt")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.Stmt]())
          }
          return r
        case o: org.sireum.lang.ast.Stmt.Theorem =>
          val r: PreResult[Context, org.sireum.lang.ast.Stmt] = pre_langastStmtTheorem(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.Stmt)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.Stmt](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Stmt")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.Stmt]())
          }
          return r
        case o: org.sireum.lang.ast.Stmt.DataRefinement =>
          val r: PreResult[Context, org.sireum.lang.ast.Stmt] = pre_langastStmtDataRefinement(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.Stmt)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.Stmt](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Stmt")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.Stmt]())
          }
          return r
        case o: org.sireum.lang.ast.Stmt.SpecLabel =>
          val r: PreResult[Context, org.sireum.lang.ast.Stmt] = pre_langastStmtSpecLabel(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.Stmt)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.Stmt](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Stmt")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.Stmt]())
          }
          return r
        case o: org.sireum.lang.ast.Stmt.SpecBlock =>
          val r: PreResult[Context, org.sireum.lang.ast.Stmt] = pre_langastStmtSpecBlock(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.Stmt)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.Stmt](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Stmt")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.Stmt]())
          }
          return r
        case o: org.sireum.lang.ast.Stmt.DeduceSequent =>
          val r: PreResult[Context, org.sireum.lang.ast.Stmt] = pre_langastStmtDeduceSequent(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.Stmt)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.Stmt](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Stmt")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.Stmt]())
          }
          return r
        case o: org.sireum.lang.ast.Stmt.DeduceSteps =>
          val r: PreResult[Context, org.sireum.lang.ast.Stmt] = pre_langastStmtDeduceSteps(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.Stmt)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.Stmt](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Stmt")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.Stmt]())
          }
          return r
        case o: org.sireum.lang.ast.Stmt.Havoc =>
          val r: PreResult[Context, org.sireum.lang.ast.Stmt] = pre_langastStmtHavoc(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.Stmt)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.Stmt](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Stmt")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.Stmt]())
          }
          return r
      }
    }

    @pure def pre_langastHasModifies(ctx: Context, o: org.sireum.lang.ast.HasModifies): PreResult[Context, org.sireum.lang.ast.HasModifies] = {
      o match {
        case o: org.sireum.lang.ast.LoopContract =>
          val r: PreResult[Context, org.sireum.lang.ast.HasModifies] = pre_langastLoopContract(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.HasModifies)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.HasModifies](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.HasModifies")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.HasModifies]())
          }
          return r
        case o: org.sireum.lang.ast.MethodContract.Simple =>
          val r: PreResult[Context, org.sireum.lang.ast.HasModifies] = pre_langastMethodContractSimple(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.HasModifies)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.HasModifies](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.HasModifies")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.HasModifies]())
          }
          return r
        case o: org.sireum.lang.ast.MethodContract.Cases =>
          val r: PreResult[Context, org.sireum.lang.ast.HasModifies] = pre_langastMethodContractCases(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.HasModifies)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.HasModifies](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.HasModifies")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.HasModifies]())
          }
          return r
      }
    }

    @pure def pre_langastLoopContract(ctx: Context, o: org.sireum.lang.ast.LoopContract): PreResult[Context, org.sireum.lang.ast.LoopContract] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastStmtImport(ctx: Context, o: org.sireum.lang.ast.Stmt.Import): PreResult[Context, org.sireum.lang.ast.Stmt] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastStmtImportImporter(ctx: Context, o: org.sireum.lang.ast.Stmt.Import.Importer): PreResult[Context, org.sireum.lang.ast.Stmt.Import.Importer] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastStmtImportSelector(ctx: Context, o: org.sireum.lang.ast.Stmt.Import.Selector): PreResult[Context, org.sireum.lang.ast.Stmt.Import.Selector] = {
      o match {
        case o: org.sireum.lang.ast.Stmt.Import.MultiSelector => return pre_langastStmtImportMultiSelector(ctx, o)
        case o: org.sireum.lang.ast.Stmt.Import.WildcardSelector => return pre_langastStmtImportWildcardSelector(ctx, o)
      }
    }

    @pure def pre_langastStmtImportMultiSelector(ctx: Context, o: org.sireum.lang.ast.Stmt.Import.MultiSelector): PreResult[Context, org.sireum.lang.ast.Stmt.Import.Selector] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastStmtImportWildcardSelector(ctx: Context, o: org.sireum.lang.ast.Stmt.Import.WildcardSelector): PreResult[Context, org.sireum.lang.ast.Stmt.Import.Selector] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastStmtImportNamedSelector(ctx: Context, o: org.sireum.lang.ast.Stmt.Import.NamedSelector): PreResult[Context, org.sireum.lang.ast.Stmt.Import.NamedSelector] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastStmtVar(ctx: Context, o: org.sireum.lang.ast.Stmt.Var): PreResult[Context, org.sireum.lang.ast.Stmt] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastStmtVarPattern(ctx: Context, o: org.sireum.lang.ast.Stmt.VarPattern): PreResult[Context, org.sireum.lang.ast.Stmt] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastStmtSpecVar(ctx: Context, o: org.sireum.lang.ast.Stmt.SpecVar): PreResult[Context, org.sireum.lang.ast.Stmt] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastStmtMethod(ctx: Context, o: org.sireum.lang.ast.Stmt.Method): PreResult[Context, org.sireum.lang.ast.Stmt] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastStmtExtMethod(ctx: Context, o: org.sireum.lang.ast.Stmt.ExtMethod): PreResult[Context, org.sireum.lang.ast.Stmt] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastStmtJustMethod(ctx: Context, o: org.sireum.lang.ast.Stmt.JustMethod): PreResult[Context, org.sireum.lang.ast.Stmt] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastStmtSpecMethod(ctx: Context, o: org.sireum.lang.ast.Stmt.SpecMethod): PreResult[Context, org.sireum.lang.ast.Stmt] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastStmtEnum(ctx: Context, o: org.sireum.lang.ast.Stmt.Enum): PreResult[Context, org.sireum.lang.ast.Stmt] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastStmtSubZ(ctx: Context, o: org.sireum.lang.ast.Stmt.SubZ): PreResult[Context, org.sireum.lang.ast.Stmt] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastStmtObject(ctx: Context, o: org.sireum.lang.ast.Stmt.Object): PreResult[Context, org.sireum.lang.ast.Stmt] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastStmtSig(ctx: Context, o: org.sireum.lang.ast.Stmt.Sig): PreResult[Context, org.sireum.lang.ast.Stmt] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastStmtAdt(ctx: Context, o: org.sireum.lang.ast.Stmt.Adt): PreResult[Context, org.sireum.lang.ast.Stmt] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastStmtTypeAlias(ctx: Context, o: org.sireum.lang.ast.Stmt.TypeAlias): PreResult[Context, org.sireum.lang.ast.Stmt] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastStmtAssign(ctx: Context, o: org.sireum.lang.ast.Stmt.Assign): PreResult[Context, org.sireum.lang.ast.Stmt] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastStmtBlock(ctx: Context, o: org.sireum.lang.ast.Stmt.Block): PreResult[Context, org.sireum.lang.ast.Stmt] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastStmtIf(ctx: Context, o: org.sireum.lang.ast.Stmt.If): PreResult[Context, org.sireum.lang.ast.Stmt] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastStmtMatch(ctx: Context, o: org.sireum.lang.ast.Stmt.Match): PreResult[Context, org.sireum.lang.ast.Stmt] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastStmtWhile(ctx: Context, o: org.sireum.lang.ast.Stmt.While): PreResult[Context, org.sireum.lang.ast.Stmt] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastStmtDoWhile(ctx: Context, o: org.sireum.lang.ast.Stmt.DoWhile): PreResult[Context, org.sireum.lang.ast.Stmt] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastStmtFor(ctx: Context, o: org.sireum.lang.ast.Stmt.For): PreResult[Context, org.sireum.lang.ast.Stmt] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastStmtReturn(ctx: Context, o: org.sireum.lang.ast.Stmt.Return): PreResult[Context, org.sireum.lang.ast.Stmt] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastStmtExpr(ctx: Context, o: org.sireum.lang.ast.Stmt.Expr): PreResult[Context, org.sireum.lang.ast.Stmt] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastStmtSpec(ctx: Context, o: org.sireum.lang.ast.Stmt.Spec): PreResult[Context, org.sireum.lang.ast.Stmt.Spec] = {
      o match {
        case o: org.sireum.lang.ast.Stmt.Fact => return pre_langastStmtFact(ctx, o)
        case o: org.sireum.lang.ast.Stmt.Inv => return pre_langastStmtInv(ctx, o)
        case o: org.sireum.lang.ast.Stmt.Theorem => return pre_langastStmtTheorem(ctx, o)
        case o: org.sireum.lang.ast.Stmt.DataRefinement => return pre_langastStmtDataRefinement(ctx, o)
        case o: org.sireum.lang.ast.Stmt.SpecLabel => return pre_langastStmtSpecLabel(ctx, o)
        case o: org.sireum.lang.ast.Stmt.SpecBlock => return pre_langastStmtSpecBlock(ctx, o)
        case o: org.sireum.lang.ast.Stmt.DeduceSequent => return pre_langastStmtDeduceSequent(ctx, o)
        case o: org.sireum.lang.ast.Stmt.DeduceSteps => return pre_langastStmtDeduceSteps(ctx, o)
        case o: org.sireum.lang.ast.Stmt.Havoc => return pre_langastStmtHavoc(ctx, o)
      }
    }

    @pure def pre_langastStmtFact(ctx: Context, o: org.sireum.lang.ast.Stmt.Fact): PreResult[Context, org.sireum.lang.ast.Stmt.Spec] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastStmtInv(ctx: Context, o: org.sireum.lang.ast.Stmt.Inv): PreResult[Context, org.sireum.lang.ast.Stmt.Spec] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastStmtTheorem(ctx: Context, o: org.sireum.lang.ast.Stmt.Theorem): PreResult[Context, org.sireum.lang.ast.Stmt.Spec] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastStmtDataRefinement(ctx: Context, o: org.sireum.lang.ast.Stmt.DataRefinement): PreResult[Context, org.sireum.lang.ast.Stmt.Spec] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastStmtSpecLabel(ctx: Context, o: org.sireum.lang.ast.Stmt.SpecLabel): PreResult[Context, org.sireum.lang.ast.Stmt.Spec] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastStmtSpecBlock(ctx: Context, o: org.sireum.lang.ast.Stmt.SpecBlock): PreResult[Context, org.sireum.lang.ast.Stmt.Spec] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastStmtDeduceSequent(ctx: Context, o: org.sireum.lang.ast.Stmt.DeduceSequent): PreResult[Context, org.sireum.lang.ast.Stmt.Spec] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastStmtDeduceSteps(ctx: Context, o: org.sireum.lang.ast.Stmt.DeduceSteps): PreResult[Context, org.sireum.lang.ast.Stmt.Spec] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastStmtHavoc(ctx: Context, o: org.sireum.lang.ast.Stmt.Havoc): PreResult[Context, org.sireum.lang.ast.Stmt.Spec] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastMethodContract(ctx: Context, o: org.sireum.lang.ast.MethodContract): PreResult[Context, org.sireum.lang.ast.MethodContract] = {
      o match {
        case o: org.sireum.lang.ast.MethodContract.Simple => return pre_langastMethodContractSimple(ctx, o)
        case o: org.sireum.lang.ast.MethodContract.Cases => return pre_langastMethodContractCases(ctx, o)
      }
    }

    @pure def pre_langastMethodContractAccesses(ctx: Context, o: org.sireum.lang.ast.MethodContract.Accesses): PreResult[Context, org.sireum.lang.ast.MethodContract.Accesses] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastMethodContractClaims(ctx: Context, o: org.sireum.lang.ast.MethodContract.Claims): PreResult[Context, org.sireum.lang.ast.MethodContract.Claims] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastMethodContractSimple(ctx: Context, o: org.sireum.lang.ast.MethodContract.Simple): PreResult[Context, org.sireum.lang.ast.MethodContract] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastMethodContractCases(ctx: Context, o: org.sireum.lang.ast.MethodContract.Cases): PreResult[Context, org.sireum.lang.ast.MethodContract] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastMethodContractCase(ctx: Context, o: org.sireum.lang.ast.MethodContract.Case): PreResult[Context, org.sireum.lang.ast.MethodContract.Case] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastSequent(ctx: Context, o: org.sireum.lang.ast.Sequent): PreResult[Context, org.sireum.lang.ast.Sequent] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastProofAst(ctx: Context, o: org.sireum.lang.ast.ProofAst): PreResult[Context, org.sireum.lang.ast.ProofAst] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastProofAstStep(ctx: Context, o: org.sireum.lang.ast.ProofAst.Step): PreResult[Context, org.sireum.lang.ast.ProofAst.Step] = {
      o match {
        case o: org.sireum.lang.ast.ProofAst.Step.Regular => return pre_langastProofAstStepRegular(ctx, o)
        case o: org.sireum.lang.ast.ProofAst.Step.Assume => return pre_langastProofAstStepAssume(ctx, o)
        case o: org.sireum.lang.ast.ProofAst.Step.Assert => return pre_langastProofAstStepAssert(ctx, o)
        case o: org.sireum.lang.ast.ProofAst.Step.SubProof => return pre_langastProofAstStepSubProof(ctx, o)
        case o: org.sireum.lang.ast.ProofAst.Step.Let => return pre_langastProofAstStepLet(ctx, o)
        case o: org.sireum.lang.ast.ProofAst.Step.StructInduction => return pre_langastProofAstStepStructInduction(ctx, o)
      }
    }

    @pure def pre_langastProofAstStepId(ctx: Context, o: org.sireum.lang.ast.ProofAst.StepId): PreResult[Context, org.sireum.lang.ast.ProofAst.StepId] = {
      o match {
        case o: org.sireum.lang.ast.ProofAst.StepId.Num => return pre_langastProofAstStepIdNum(ctx, o)
        case o: org.sireum.lang.ast.ProofAst.StepId.Str => return pre_langastProofAstStepIdStr(ctx, o)
      }
    }

    @pure def pre_langastProofAstStepIdNum(ctx: Context, o: org.sireum.lang.ast.ProofAst.StepId.Num): PreResult[Context, org.sireum.lang.ast.ProofAst.StepId] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastProofAstStepIdStr(ctx: Context, o: org.sireum.lang.ast.ProofAst.StepId.Str): PreResult[Context, org.sireum.lang.ast.ProofAst.StepId] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastProofAstStepRegular(ctx: Context, o: org.sireum.lang.ast.ProofAst.Step.Regular): PreResult[Context, org.sireum.lang.ast.ProofAst.Step] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastProofAstStepAssume(ctx: Context, o: org.sireum.lang.ast.ProofAst.Step.Assume): PreResult[Context, org.sireum.lang.ast.ProofAst.Step] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastProofAstStepAssert(ctx: Context, o: org.sireum.lang.ast.ProofAst.Step.Assert): PreResult[Context, org.sireum.lang.ast.ProofAst.Step] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastProofAstStepSubProof(ctx: Context, o: org.sireum.lang.ast.ProofAst.Step.SubProof): PreResult[Context, org.sireum.lang.ast.ProofAst.Step] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastProofAstStepLet(ctx: Context, o: org.sireum.lang.ast.ProofAst.Step.Let): PreResult[Context, org.sireum.lang.ast.ProofAst.Step] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastProofAstStepLetParam(ctx: Context, o: org.sireum.lang.ast.ProofAst.Step.Let.Param): PreResult[Context, org.sireum.lang.ast.ProofAst.Step.Let.Param] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastProofAstStepStructInduction(ctx: Context, o: org.sireum.lang.ast.ProofAst.Step.StructInduction): PreResult[Context, org.sireum.lang.ast.ProofAst.Step] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastProofAstStepStructInductionMatchCase(ctx: Context, o: org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase): PreResult[Context, org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastProofAstStepStructInductionMatchDefault(ctx: Context, o: org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault): PreResult[Context, org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastProofAstStepJustification(ctx: Context, o: org.sireum.lang.ast.ProofAst.Step.Justification): PreResult[Context, org.sireum.lang.ast.ProofAst.Step.Justification] = {
      o match {
        case o: org.sireum.lang.ast.ProofAst.Step.Justification.Ref => return pre_langastProofAstStepJustificationRef(ctx, o)
        case o: org.sireum.lang.ast.ProofAst.Step.Justification.Apply =>
          val r: PreResult[Context, org.sireum.lang.ast.ProofAst.Step.Justification] = pre_langastProofAstStepJustificationApply(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.ProofAst.Step.Justification)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.ProofAst.Step.Justification](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.ProofAst.Step.Justification")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.ProofAst.Step.Justification]())
          }
          return r
        case o: org.sireum.lang.ast.ProofAst.Step.Justification.ApplyNamed =>
          val r: PreResult[Context, org.sireum.lang.ast.ProofAst.Step.Justification] = pre_langastProofAstStepJustificationApplyNamed(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.ProofAst.Step.Justification)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.ProofAst.Step.Justification](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.ProofAst.Step.Justification")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.ProofAst.Step.Justification]())
          }
          return r
        case o: org.sireum.lang.ast.ProofAst.Step.Justification.ApplyEta =>
          val r: PreResult[Context, org.sireum.lang.ast.ProofAst.Step.Justification] = pre_langastProofAstStepJustificationApplyEta(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.ProofAst.Step.Justification)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.ProofAst.Step.Justification](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.ProofAst.Step.Justification")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.ProofAst.Step.Justification]())
          }
          return r
      }
    }

    @pure def pre_langastProofAstStepInception(ctx: Context, o: org.sireum.lang.ast.ProofAst.Step.Inception): PreResult[Context, org.sireum.lang.ast.ProofAst.Step.Inception] = {
      o match {
        case o: org.sireum.lang.ast.ProofAst.Step.Justification.Apply => return pre_langastProofAstStepJustificationApply(ctx, o)
        case o: org.sireum.lang.ast.ProofAst.Step.Justification.ApplyNamed => return pre_langastProofAstStepJustificationApplyNamed(ctx, o)
        case o: org.sireum.lang.ast.ProofAst.Step.Justification.ApplyEta => return pre_langastProofAstStepJustificationApplyEta(ctx, o)
      }
    }

    @pure def pre_langastProofAstStepJustificationRef(ctx: Context, o: org.sireum.lang.ast.ProofAst.Step.Justification.Ref): PreResult[Context, org.sireum.lang.ast.ProofAst.Step.Justification] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastProofAstStepJustificationApply(ctx: Context, o: org.sireum.lang.ast.ProofAst.Step.Justification.Apply): PreResult[Context, org.sireum.lang.ast.ProofAst.Step.Inception] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastProofAstStepJustificationApplyNamed(ctx: Context, o: org.sireum.lang.ast.ProofAst.Step.Justification.ApplyNamed): PreResult[Context, org.sireum.lang.ast.ProofAst.Step.Inception] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastProofAstStepJustificationApplyEta(ctx: Context, o: org.sireum.lang.ast.ProofAst.Step.Justification.ApplyEta): PreResult[Context, org.sireum.lang.ast.ProofAst.Step.Inception] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastAssignExp(ctx: Context, o: org.sireum.lang.ast.AssignExp): PreResult[Context, org.sireum.lang.ast.AssignExp] = {
      o match {
        case o: org.sireum.lang.ast.Stmt.Block =>
          val r: PreResult[Context, org.sireum.lang.ast.AssignExp] = pre_langastStmtBlock(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.AssignExp)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.AssignExp](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.AssignExp")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.AssignExp]())
          }
          return r
        case o: org.sireum.lang.ast.Stmt.If =>
          val r: PreResult[Context, org.sireum.lang.ast.AssignExp] = pre_langastStmtIf(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.AssignExp)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.AssignExp](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.AssignExp")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.AssignExp]())
          }
          return r
        case o: org.sireum.lang.ast.Stmt.Match =>
          val r: PreResult[Context, org.sireum.lang.ast.AssignExp] = pre_langastStmtMatch(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.AssignExp)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.AssignExp](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.AssignExp")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.AssignExp]())
          }
          return r
        case o: org.sireum.lang.ast.Stmt.Return =>
          val r: PreResult[Context, org.sireum.lang.ast.AssignExp] = pre_langastStmtReturn(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.AssignExp)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.AssignExp](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.AssignExp")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.AssignExp]())
          }
          return r
        case o: org.sireum.lang.ast.Stmt.Expr =>
          val r: PreResult[Context, org.sireum.lang.ast.AssignExp] = pre_langastStmtExpr(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.AssignExp)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.AssignExp](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.AssignExp")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.AssignExp]())
          }
          return r
      }
    }

    @pure def pre_langastCase(ctx: Context, o: org.sireum.lang.ast.Case): PreResult[Context, org.sireum.lang.ast.Case] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastEnumGenRange(ctx: Context, o: org.sireum.lang.ast.EnumGen.Range): PreResult[Context, org.sireum.lang.ast.EnumGen.Range] = {
      o match {
        case o: org.sireum.lang.ast.EnumGen.Range.Expr => return pre_langastEnumGenRangeExpr(ctx, o)
        case o: org.sireum.lang.ast.EnumGen.Range.Step => return pre_langastEnumGenRangeStep(ctx, o)
      }
    }

    @pure def pre_langastEnumGenRangeExpr(ctx: Context, o: org.sireum.lang.ast.EnumGen.Range.Expr): PreResult[Context, org.sireum.lang.ast.EnumGen.Range] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastEnumGenRangeStep(ctx: Context, o: org.sireum.lang.ast.EnumGen.Range.Step): PreResult[Context, org.sireum.lang.ast.EnumGen.Range] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastEnumGenFor(ctx: Context, o: org.sireum.lang.ast.EnumGen.For): PreResult[Context, org.sireum.lang.ast.EnumGen.For] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastType(ctx: Context, o: org.sireum.lang.ast.Type): PreResult[Context, org.sireum.lang.ast.Type] = {
      o match {
        case o: org.sireum.lang.ast.Type.Named => return pre_langastTypeNamed(ctx, o)
        case o: org.sireum.lang.ast.Type.Fun => return pre_langastTypeFun(ctx, o)
        case o: org.sireum.lang.ast.Type.Tuple => return pre_langastTypeTuple(ctx, o)
      }
    }

    @pure def pre_langastTypeNamed(ctx: Context, o: org.sireum.lang.ast.Type.Named): PreResult[Context, org.sireum.lang.ast.Type] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastTypeFun(ctx: Context, o: org.sireum.lang.ast.Type.Fun): PreResult[Context, org.sireum.lang.ast.Type] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastTypeTuple(ctx: Context, o: org.sireum.lang.ast.Type.Tuple): PreResult[Context, org.sireum.lang.ast.Type] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastPattern(ctx: Context, o: org.sireum.lang.ast.Pattern): PreResult[Context, org.sireum.lang.ast.Pattern] = {
      o match {
        case o: org.sireum.lang.ast.Pattern.Literal => return pre_langastPatternLiteral(ctx, o)
        case o: org.sireum.lang.ast.Pattern.LitInterpolate => return pre_langastPatternLitInterpolate(ctx, o)
        case o: org.sireum.lang.ast.Pattern.Ref => return pre_langastPatternRef(ctx, o)
        case o: org.sireum.lang.ast.Pattern.VarBinding => return pre_langastPatternVarBinding(ctx, o)
        case o: org.sireum.lang.ast.Pattern.Wildcard => return pre_langastPatternWildcard(ctx, o)
        case o: org.sireum.lang.ast.Pattern.SeqWildcard => return pre_langastPatternSeqWildcard(ctx, o)
        case o: org.sireum.lang.ast.Pattern.Structure => return pre_langastPatternStructure(ctx, o)
      }
    }

    @pure def pre_langastPatternLiteral(ctx: Context, o: org.sireum.lang.ast.Pattern.Literal): PreResult[Context, org.sireum.lang.ast.Pattern] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastPatternLitInterpolate(ctx: Context, o: org.sireum.lang.ast.Pattern.LitInterpolate): PreResult[Context, org.sireum.lang.ast.Pattern] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastPatternRef(ctx: Context, o: org.sireum.lang.ast.Pattern.Ref): PreResult[Context, org.sireum.lang.ast.Pattern] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastPatternVarBinding(ctx: Context, o: org.sireum.lang.ast.Pattern.VarBinding): PreResult[Context, org.sireum.lang.ast.Pattern] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastPatternWildcard(ctx: Context, o: org.sireum.lang.ast.Pattern.Wildcard): PreResult[Context, org.sireum.lang.ast.Pattern] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastPatternSeqWildcard(ctx: Context, o: org.sireum.lang.ast.Pattern.SeqWildcard): PreResult[Context, org.sireum.lang.ast.Pattern] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastPatternStructure(ctx: Context, o: org.sireum.lang.ast.Pattern.Structure): PreResult[Context, org.sireum.lang.ast.Pattern] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastExp(ctx: Context, o: org.sireum.lang.ast.Exp): PreResult[Context, org.sireum.lang.ast.Exp] = {
      o match {
        case o: org.sireum.lang.ast.Exp.LitB => return pre_langastExpLitB(ctx, o)
        case o: org.sireum.lang.ast.Exp.LitC => return pre_langastExpLitC(ctx, o)
        case o: org.sireum.lang.ast.Exp.LitZ => return pre_langastExpLitZ(ctx, o)
        case o: org.sireum.lang.ast.Exp.LitF32 => return pre_langastExpLitF32(ctx, o)
        case o: org.sireum.lang.ast.Exp.LitF64 => return pre_langastExpLitF64(ctx, o)
        case o: org.sireum.lang.ast.Exp.LitR => return pre_langastExpLitR(ctx, o)
        case o: org.sireum.lang.ast.Exp.LitString => return pre_langastExpLitString(ctx, o)
        case o: org.sireum.lang.ast.Exp.LitStepId => return pre_langastExpLitStepId(ctx, o)
        case o: org.sireum.lang.ast.Exp.StringInterpolate => return pre_langastExpStringInterpolate(ctx, o)
        case o: org.sireum.lang.ast.Exp.This => return pre_langastExpThis(ctx, o)
        case o: org.sireum.lang.ast.Exp.Super => return pre_langastExpSuper(ctx, o)
        case o: org.sireum.lang.ast.Exp.Unary => return pre_langastExpUnary(ctx, o)
        case o: org.sireum.lang.ast.Exp.Binary => return pre_langastExpBinary(ctx, o)
        case o: org.sireum.lang.ast.Exp.Ident => return pre_langastExpIdent(ctx, o)
        case o: org.sireum.lang.ast.Exp.Eta => return pre_langastExpEta(ctx, o)
        case o: org.sireum.lang.ast.Exp.Tuple => return pre_langastExpTuple(ctx, o)
        case o: org.sireum.lang.ast.Exp.Select => return pre_langastExpSelect(ctx, o)
        case o: org.sireum.lang.ast.Exp.Invoke => return pre_langastExpInvoke(ctx, o)
        case o: org.sireum.lang.ast.Exp.InvokeNamed => return pre_langastExpInvokeNamed(ctx, o)
        case o: org.sireum.lang.ast.Exp.If => return pre_langastExpIf(ctx, o)
        case o: org.sireum.lang.ast.Exp.TypeCond => return pre_langastExpTypeCond(ctx, o)
        case o: org.sireum.lang.ast.Exp.Sym => return pre_langastExpSym(ctx, o)
        case o: org.sireum.lang.ast.Exp.Fun => return pre_langastExpFun(ctx, o)
        case o: org.sireum.lang.ast.Exp.ForYield => return pre_langastExpForYield(ctx, o)
        case o: org.sireum.lang.ast.Exp.QuantType =>
          val r: PreResult[Context, org.sireum.lang.ast.Exp] = pre_langastExpQuantType(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.Exp)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.Exp](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Exp")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.Exp]())
          }
          return r
        case o: org.sireum.lang.ast.Exp.QuantRange =>
          val r: PreResult[Context, org.sireum.lang.ast.Exp] = pre_langastExpQuantRange(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.Exp)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.Exp](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Exp")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.Exp]())
          }
          return r
        case o: org.sireum.lang.ast.Exp.QuantEach =>
          val r: PreResult[Context, org.sireum.lang.ast.Exp] = pre_langastExpQuantEach(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.Exp)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.Exp](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Exp")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.Exp]())
          }
          return r
        case o: org.sireum.lang.ast.Exp.Input => return pre_langastExpInput(ctx, o)
        case o: org.sireum.lang.ast.Exp.At => return pre_langastExpAt(ctx, o)
        case o: org.sireum.lang.ast.Exp.LoopIndex => return pre_langastExpLoopIndex(ctx, o)
        case o: org.sireum.lang.ast.Exp.StateSeq => return pre_langastExpStateSeq(ctx, o)
        case o: org.sireum.lang.ast.Exp.Result => return pre_langastExpResult(ctx, o)
      }
    }

    @pure def pre_langastLit(ctx: Context, o: org.sireum.lang.ast.Lit): PreResult[Context, org.sireum.lang.ast.Lit] = {
      o match {
        case o: org.sireum.lang.ast.Exp.LitB =>
          val r: PreResult[Context, org.sireum.lang.ast.Lit] = pre_langastExpLitB(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.Lit)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.Lit](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Lit")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.Lit]())
          }
          return r
        case o: org.sireum.lang.ast.Exp.LitC =>
          val r: PreResult[Context, org.sireum.lang.ast.Lit] = pre_langastExpLitC(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.Lit)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.Lit](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Lit")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.Lit]())
          }
          return r
        case o: org.sireum.lang.ast.Exp.LitZ =>
          val r: PreResult[Context, org.sireum.lang.ast.Lit] = pre_langastExpLitZ(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.Lit)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.Lit](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Lit")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.Lit]())
          }
          return r
        case o: org.sireum.lang.ast.Exp.LitF32 =>
          val r: PreResult[Context, org.sireum.lang.ast.Lit] = pre_langastExpLitF32(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.Lit)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.Lit](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Lit")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.Lit]())
          }
          return r
        case o: org.sireum.lang.ast.Exp.LitF64 =>
          val r: PreResult[Context, org.sireum.lang.ast.Lit] = pre_langastExpLitF64(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.Lit)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.Lit](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Lit")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.Lit]())
          }
          return r
        case o: org.sireum.lang.ast.Exp.LitR =>
          val r: PreResult[Context, org.sireum.lang.ast.Lit] = pre_langastExpLitR(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.Lit)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.Lit](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Lit")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.Lit]())
          }
          return r
        case o: org.sireum.lang.ast.Exp.LitString =>
          val r: PreResult[Context, org.sireum.lang.ast.Lit] = pre_langastExpLitString(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.Lit)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.Lit](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Lit")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.Lit]())
          }
          return r
        case o: org.sireum.lang.ast.Exp.LitStepId =>
          val r: PreResult[Context, org.sireum.lang.ast.Lit] = pre_langastExpLitStepId(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.Lit)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.Lit](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Lit")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.Lit]())
          }
          return r
      }
    }

    @pure def pre_langastExpLitB(ctx: Context, o: org.sireum.lang.ast.Exp.LitB): PreResult[Context, org.sireum.lang.ast.Exp] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastExpLitC(ctx: Context, o: org.sireum.lang.ast.Exp.LitC): PreResult[Context, org.sireum.lang.ast.Exp] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastExpLitZ(ctx: Context, o: org.sireum.lang.ast.Exp.LitZ): PreResult[Context, org.sireum.lang.ast.Exp] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastExpLitF32(ctx: Context, o: org.sireum.lang.ast.Exp.LitF32): PreResult[Context, org.sireum.lang.ast.Exp] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastExpLitF64(ctx: Context, o: org.sireum.lang.ast.Exp.LitF64): PreResult[Context, org.sireum.lang.ast.Exp] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastExpLitR(ctx: Context, o: org.sireum.lang.ast.Exp.LitR): PreResult[Context, org.sireum.lang.ast.Exp] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastExpLitString(ctx: Context, o: org.sireum.lang.ast.Exp.LitString): PreResult[Context, org.sireum.lang.ast.Exp] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastExpLitStepId(ctx: Context, o: org.sireum.lang.ast.Exp.LitStepId): PreResult[Context, org.sireum.lang.ast.Exp] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastExpStringInterpolate(ctx: Context, o: org.sireum.lang.ast.Exp.StringInterpolate): PreResult[Context, org.sireum.lang.ast.Exp] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastExpThis(ctx: Context, o: org.sireum.lang.ast.Exp.This): PreResult[Context, org.sireum.lang.ast.Exp] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastExpSuper(ctx: Context, o: org.sireum.lang.ast.Exp.Super): PreResult[Context, org.sireum.lang.ast.Exp] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastExpUnary(ctx: Context, o: org.sireum.lang.ast.Exp.Unary): PreResult[Context, org.sireum.lang.ast.Exp] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastExpRef(ctx: Context, o: org.sireum.lang.ast.Exp.Ref): PreResult[Context, org.sireum.lang.ast.Exp.Ref] = {
      o match {
        case o: org.sireum.lang.ast.Exp.Ident =>
          val r: PreResult[Context, org.sireum.lang.ast.Exp.Ref] = pre_langastExpIdent(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.Exp.Ref)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.Exp.Ref](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Exp.Ref")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.Exp.Ref]())
          }
          return r
        case o: org.sireum.lang.ast.Exp.Select =>
          val r: PreResult[Context, org.sireum.lang.ast.Exp.Ref] = pre_langastExpSelect(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.Exp.Ref)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.Exp.Ref](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Exp.Ref")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.Exp.Ref]())
          }
          return r
      }
    }

    @pure def pre_langastExpBinary(ctx: Context, o: org.sireum.lang.ast.Exp.Binary): PreResult[Context, org.sireum.lang.ast.Exp] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastExpIdent(ctx: Context, o: org.sireum.lang.ast.Exp.Ident): PreResult[Context, org.sireum.lang.ast.Exp] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastExpEta(ctx: Context, o: org.sireum.lang.ast.Exp.Eta): PreResult[Context, org.sireum.lang.ast.Exp] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastExpTuple(ctx: Context, o: org.sireum.lang.ast.Exp.Tuple): PreResult[Context, org.sireum.lang.ast.Exp] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastExpSelect(ctx: Context, o: org.sireum.lang.ast.Exp.Select): PreResult[Context, org.sireum.lang.ast.Exp] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastExpInvoke(ctx: Context, o: org.sireum.lang.ast.Exp.Invoke): PreResult[Context, org.sireum.lang.ast.Exp] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastExpInvokeNamed(ctx: Context, o: org.sireum.lang.ast.Exp.InvokeNamed): PreResult[Context, org.sireum.lang.ast.Exp] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastExpIf(ctx: Context, o: org.sireum.lang.ast.Exp.If): PreResult[Context, org.sireum.lang.ast.Exp] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastExpTypeCond(ctx: Context, o: org.sireum.lang.ast.Exp.TypeCond): PreResult[Context, org.sireum.lang.ast.Exp] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastExpSym(ctx: Context, o: org.sireum.lang.ast.Exp.Sym): PreResult[Context, org.sireum.lang.ast.Exp] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastExpFunParam(ctx: Context, o: org.sireum.lang.ast.Exp.Fun.Param): PreResult[Context, org.sireum.lang.ast.Exp.Fun.Param] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastExpFun(ctx: Context, o: org.sireum.lang.ast.Exp.Fun): PreResult[Context, org.sireum.lang.ast.Exp] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastExpForYield(ctx: Context, o: org.sireum.lang.ast.Exp.ForYield): PreResult[Context, org.sireum.lang.ast.Exp] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastExpQuant(ctx: Context, o: org.sireum.lang.ast.Exp.Quant): PreResult[Context, org.sireum.lang.ast.Exp.Quant] = {
      o match {
        case o: org.sireum.lang.ast.Exp.QuantType => return pre_langastExpQuantType(ctx, o)
        case o: org.sireum.lang.ast.Exp.QuantRange => return pre_langastExpQuantRange(ctx, o)
        case o: org.sireum.lang.ast.Exp.QuantEach => return pre_langastExpQuantEach(ctx, o)
      }
    }

    @pure def pre_langastExpQuantType(ctx: Context, o: org.sireum.lang.ast.Exp.QuantType): PreResult[Context, org.sireum.lang.ast.Exp.Quant] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastExpQuantRange(ctx: Context, o: org.sireum.lang.ast.Exp.QuantRange): PreResult[Context, org.sireum.lang.ast.Exp.Quant] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastExpQuantEach(ctx: Context, o: org.sireum.lang.ast.Exp.QuantEach): PreResult[Context, org.sireum.lang.ast.Exp.Quant] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastExpInput(ctx: Context, o: org.sireum.lang.ast.Exp.Input): PreResult[Context, org.sireum.lang.ast.Exp] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastExpAt(ctx: Context, o: org.sireum.lang.ast.Exp.At): PreResult[Context, org.sireum.lang.ast.Exp] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastExpLoopIndex(ctx: Context, o: org.sireum.lang.ast.Exp.LoopIndex): PreResult[Context, org.sireum.lang.ast.Exp] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastExpStateSeq(ctx: Context, o: org.sireum.lang.ast.Exp.StateSeq): PreResult[Context, org.sireum.lang.ast.Exp] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastExpStateSeqFragment(ctx: Context, o: org.sireum.lang.ast.Exp.StateSeq.Fragment): PreResult[Context, org.sireum.lang.ast.Exp.StateSeq.Fragment] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastExpResult(ctx: Context, o: org.sireum.lang.ast.Exp.Result): PreResult[Context, org.sireum.lang.ast.Exp] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastNamedArg(ctx: Context, o: org.sireum.lang.ast.NamedArg): PreResult[Context, org.sireum.lang.ast.NamedArg] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastId(ctx: Context, o: org.sireum.lang.ast.Id): PreResult[Context, org.sireum.lang.ast.Id] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastName(ctx: Context, o: org.sireum.lang.ast.Name): PreResult[Context, org.sireum.lang.ast.Name] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastBody(ctx: Context, o: org.sireum.lang.ast.Body): PreResult[Context, org.sireum.lang.ast.Body] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastAdtParam(ctx: Context, o: org.sireum.lang.ast.AdtParam): PreResult[Context, org.sireum.lang.ast.AdtParam] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastMethodSig(ctx: Context, o: org.sireum.lang.ast.MethodSig): PreResult[Context, org.sireum.lang.ast.MethodSig] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastParam(ctx: Context, o: org.sireum.lang.ast.Param): PreResult[Context, org.sireum.lang.ast.Param] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastTypeParam(ctx: Context, o: org.sireum.lang.ast.TypeParam): PreResult[Context, org.sireum.lang.ast.TypeParam] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastAttr(ctx: Context, o: org.sireum.lang.ast.Attr): PreResult[Context, org.sireum.lang.ast.Attr] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastTypedAttr(ctx: Context, o: org.sireum.lang.ast.TypedAttr): PreResult[Context, org.sireum.lang.ast.TypedAttr] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastResolvedAttr(ctx: Context, o: org.sireum.lang.ast.ResolvedAttr): PreResult[Context, org.sireum.lang.ast.ResolvedAttr] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastResolvedInfo(ctx: Context, o: org.sireum.lang.ast.ResolvedInfo): PreResult[Context, org.sireum.lang.ast.ResolvedInfo] = {
      o match {
        case o: org.sireum.lang.ast.ResolvedInfo.BuiltIn => return pre_langastResolvedInfoBuiltIn(ctx, o)
        case o: org.sireum.lang.ast.ResolvedInfo.Package => return pre_langastResolvedInfoPackage(ctx, o)
        case o: org.sireum.lang.ast.ResolvedInfo.Enum => return pre_langastResolvedInfoEnum(ctx, o)
        case o: org.sireum.lang.ast.ResolvedInfo.EnumElement => return pre_langastResolvedInfoEnumElement(ctx, o)
        case o: org.sireum.lang.ast.ResolvedInfo.Object => return pre_langastResolvedInfoObject(ctx, o)
        case o: org.sireum.lang.ast.ResolvedInfo.Var => return pre_langastResolvedInfoVar(ctx, o)
        case o: org.sireum.lang.ast.ResolvedInfo.Method => return pre_langastResolvedInfoMethod(ctx, o)
        case o: org.sireum.lang.ast.ResolvedInfo.Methods => return pre_langastResolvedInfoMethods(ctx, o)
        case o: org.sireum.lang.ast.ResolvedInfo.Tuple => return pre_langastResolvedInfoTuple(ctx, o)
        case o: org.sireum.lang.ast.ResolvedInfo.LocalVar => return pre_langastResolvedInfoLocalVar(ctx, o)
        case o: org.sireum.lang.ast.ResolvedInfo.Fact => return pre_langastResolvedInfoFact(ctx, o)
        case o: org.sireum.lang.ast.ResolvedInfo.Theorem => return pre_langastResolvedInfoTheorem(ctx, o)
        case o: org.sireum.lang.ast.ResolvedInfo.Inv => return pre_langastResolvedInfoInv(ctx, o)
      }
    }

    @pure def pre_langastResolvedInfoBuiltIn(ctx: Context, o: org.sireum.lang.ast.ResolvedInfo.BuiltIn): PreResult[Context, org.sireum.lang.ast.ResolvedInfo] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastResolvedInfoPackage(ctx: Context, o: org.sireum.lang.ast.ResolvedInfo.Package): PreResult[Context, org.sireum.lang.ast.ResolvedInfo] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastResolvedInfoEnum(ctx: Context, o: org.sireum.lang.ast.ResolvedInfo.Enum): PreResult[Context, org.sireum.lang.ast.ResolvedInfo] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastResolvedInfoEnumElement(ctx: Context, o: org.sireum.lang.ast.ResolvedInfo.EnumElement): PreResult[Context, org.sireum.lang.ast.ResolvedInfo] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastResolvedInfoObject(ctx: Context, o: org.sireum.lang.ast.ResolvedInfo.Object): PreResult[Context, org.sireum.lang.ast.ResolvedInfo] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastResolvedInfoVar(ctx: Context, o: org.sireum.lang.ast.ResolvedInfo.Var): PreResult[Context, org.sireum.lang.ast.ResolvedInfo] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastResolvedInfoMethod(ctx: Context, o: org.sireum.lang.ast.ResolvedInfo.Method): PreResult[Context, org.sireum.lang.ast.ResolvedInfo] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastResolvedInfoMethods(ctx: Context, o: org.sireum.lang.ast.ResolvedInfo.Methods): PreResult[Context, org.sireum.lang.ast.ResolvedInfo] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastResolvedInfoTuple(ctx: Context, o: org.sireum.lang.ast.ResolvedInfo.Tuple): PreResult[Context, org.sireum.lang.ast.ResolvedInfo] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastResolvedInfoLocalVar(ctx: Context, o: org.sireum.lang.ast.ResolvedInfo.LocalVar): PreResult[Context, org.sireum.lang.ast.ResolvedInfo] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastResolvedInfoFact(ctx: Context, o: org.sireum.lang.ast.ResolvedInfo.Fact): PreResult[Context, org.sireum.lang.ast.ResolvedInfo] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastResolvedInfoTheorem(ctx: Context, o: org.sireum.lang.ast.ResolvedInfo.Theorem): PreResult[Context, org.sireum.lang.ast.ResolvedInfo] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastResolvedInfoInv(ctx: Context, o: org.sireum.lang.ast.ResolvedInfo.Inv): PreResult[Context, org.sireum.lang.ast.ResolvedInfo] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastTruthTableRow(ctx: Context, o: org.sireum.lang.ast.TruthTable.Row): PreResult[Context, org.sireum.lang.ast.TruthTable.Row] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastTruthTableAssignment(ctx: Context, o: org.sireum.lang.ast.TruthTable.Assignment): PreResult[Context, org.sireum.lang.ast.TruthTable.Assignment] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastTruthTableConclusion(ctx: Context, o: org.sireum.lang.ast.TruthTable.Conclusion): PreResult[Context, org.sireum.lang.ast.TruthTable.Conclusion] = {
      o match {
        case o: org.sireum.lang.ast.TruthTable.Conclusion.Validity => return pre_langastTruthTableConclusionValidity(ctx, o)
        case o: org.sireum.lang.ast.TruthTable.Conclusion.Tautology => return pre_langastTruthTableConclusionTautology(ctx, o)
        case o: org.sireum.lang.ast.TruthTable.Conclusion.Contradictory => return pre_langastTruthTableConclusionContradictory(ctx, o)
        case o: org.sireum.lang.ast.TruthTable.Conclusion.Contingent => return pre_langastTruthTableConclusionContingent(ctx, o)
      }
    }

    @pure def pre_langastTruthTableConclusionValidity(ctx: Context, o: org.sireum.lang.ast.TruthTable.Conclusion.Validity): PreResult[Context, org.sireum.lang.ast.TruthTable.Conclusion] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastTruthTableConclusionTautology(ctx: Context, o: org.sireum.lang.ast.TruthTable.Conclusion.Tautology): PreResult[Context, org.sireum.lang.ast.TruthTable.Conclusion] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastTruthTableConclusionContradictory(ctx: Context, o: org.sireum.lang.ast.TruthTable.Conclusion.Contradictory): PreResult[Context, org.sireum.lang.ast.TruthTable.Conclusion] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastTruthTableConclusionContingent(ctx: Context, o: org.sireum.lang.ast.TruthTable.Conclusion.Contingent): PreResult[Context, org.sireum.lang.ast.TruthTable.Conclusion] = {
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

    @pure def pre_langastTyped(ctx: Context, o: org.sireum.lang.ast.Typed): PreResult[Context, org.sireum.lang.ast.Typed] = {
      o match {
        case o: org.sireum.lang.ast.Typed.Name => return pre_langastTypedName(ctx, o)
        case o: org.sireum.lang.ast.Typed.Tuple => return pre_langastTypedTuple(ctx, o)
        case o: org.sireum.lang.ast.Typed.Fun => return pre_langastTypedFun(ctx, o)
        case o: org.sireum.lang.ast.Typed.TypeVar => return pre_langastTypedTypeVar(ctx, o)
        case o: org.sireum.lang.ast.Typed.Package => return pre_langastTypedPackage(ctx, o)
        case o: org.sireum.lang.ast.Typed.Object => return pre_langastTypedObject(ctx, o)
        case o: org.sireum.lang.ast.Typed.Enum => return pre_langastTypedEnum(ctx, o)
        case o: org.sireum.lang.ast.Typed.Method => return pre_langastTypedMethod(ctx, o)
        case o: org.sireum.lang.ast.Typed.Methods => return pre_langastTypedMethods(ctx, o)
        case o: org.sireum.lang.ast.Typed.Fact => return pre_langastTypedFact(ctx, o)
        case o: org.sireum.lang.ast.Typed.Theorem => return pre_langastTypedTheorem(ctx, o)
        case o: org.sireum.lang.ast.Typed.Inv => return pre_langastTypedInv(ctx, o)
      }
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
        case o: GclLib =>
          val r: PreResult[Context, AnnexLib] = preGclLib(ctx, o) match {
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

    @pure def pre_langastTypedName(ctx: Context, o: org.sireum.lang.ast.Typed.Name): PreResult[Context, org.sireum.lang.ast.Typed] = {
      return PreResult(ctx, T, None())
    }

    @pure def preOtherLib(ctx: Context, o: OtherLib): PreResult[Context, OtherLib] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastTypedTuple(ctx: Context, o: org.sireum.lang.ast.Typed.Tuple): PreResult[Context, org.sireum.lang.ast.Typed] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastTypedFun(ctx: Context, o: org.sireum.lang.ast.Typed.Fun): PreResult[Context, org.sireum.lang.ast.Typed] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastTypedTypeVar(ctx: Context, o: org.sireum.lang.ast.Typed.TypeVar): PreResult[Context, org.sireum.lang.ast.Typed] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastTypedPackage(ctx: Context, o: org.sireum.lang.ast.Typed.Package): PreResult[Context, org.sireum.lang.ast.Typed] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastTypedObject(ctx: Context, o: org.sireum.lang.ast.Typed.Object): PreResult[Context, org.sireum.lang.ast.Typed] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastTypedEnum(ctx: Context, o: org.sireum.lang.ast.Typed.Enum): PreResult[Context, org.sireum.lang.ast.Typed] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastTypedMethod(ctx: Context, o: org.sireum.lang.ast.Typed.Method): PreResult[Context, org.sireum.lang.ast.Typed] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastTypedMethods(ctx: Context, o: org.sireum.lang.ast.Typed.Methods): PreResult[Context, org.sireum.lang.ast.Typed] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastTypedFact(ctx: Context, o: org.sireum.lang.ast.Typed.Fact): PreResult[Context, org.sireum.lang.ast.Typed] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastTypedTheorem(ctx: Context, o: org.sireum.lang.ast.Typed.Theorem): PreResult[Context, org.sireum.lang.ast.Typed] = {
      return PreResult(ctx, T, None())
    }

    @pure def pre_langastTypedInv(ctx: Context, o: org.sireum.lang.ast.Typed.Inv): PreResult[Context, org.sireum.lang.ast.Typed] = {
      return PreResult(ctx, T, None())
    }

    @pure def preGclSymbol(ctx: Context, o: GclSymbol): PreResult[Context, GclSymbol] = {
      o match {
        case o: GclSubclause =>
          val r: PreResult[Context, GclSymbol] = preGclSubclause(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: GclSymbol)) => PreResult(preCtx, continu, Some[GclSymbol](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type GclSymbol")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[GclSymbol]())
          }
          return r
        case o: GclMethod =>
          val r: PreResult[Context, GclSymbol] = preGclMethod(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: GclSymbol)) => PreResult(preCtx, continu, Some[GclSymbol](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type GclSymbol")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[GclSymbol]())
          }
          return r
        case o: GclStateVar =>
          val r: PreResult[Context, GclSymbol] = preGclStateVar(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: GclSymbol)) => PreResult(preCtx, continu, Some[GclSymbol](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type GclSymbol")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[GclSymbol]())
          }
          return r
        case o: GclInvariant =>
          val r: PreResult[Context, GclSymbol] = preGclInvariant(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: GclSymbol)) => PreResult(preCtx, continu, Some[GclSymbol](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type GclSymbol")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[GclSymbol]())
          }
          return r
        case o: GclAssume =>
          val r: PreResult[Context, GclSymbol] = preGclAssume(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: GclSymbol)) => PreResult(preCtx, continu, Some[GclSymbol](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type GclSymbol")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[GclSymbol]())
          }
          return r
        case o: GclGuarantee =>
          val r: PreResult[Context, GclSymbol] = preGclGuarantee(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: GclSymbol)) => PreResult(preCtx, continu, Some[GclSymbol](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type GclSymbol")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[GclSymbol]())
          }
          return r
        case o: GclIntegration =>
          val r: PreResult[Context, GclSymbol] = preGclIntegration(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: GclSymbol)) => PreResult(preCtx, continu, Some[GclSymbol](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type GclSymbol")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[GclSymbol]())
          }
          return r
        case o: GclCaseStatement =>
          val r: PreResult[Context, GclSymbol] = preGclCaseStatement(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: GclSymbol)) => PreResult(preCtx, continu, Some[GclSymbol](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type GclSymbol")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[GclSymbol]())
          }
          return r
        case o: GclInitialize =>
          val r: PreResult[Context, GclSymbol] = preGclInitialize(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: GclSymbol)) => PreResult(preCtx, continu, Some[GclSymbol](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type GclSymbol")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[GclSymbol]())
          }
          return r
        case o: GclCompute =>
          val r: PreResult[Context, GclSymbol] = preGclCompute(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: GclSymbol)) => PreResult(preCtx, continu, Some[GclSymbol](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type GclSymbol")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[GclSymbol]())
          }
          return r
        case o: GclHandle =>
          val r: PreResult[Context, GclSymbol] = preGclHandle(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: GclSymbol)) => PreResult(preCtx, continu, Some[GclSymbol](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type GclSymbol")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[GclSymbol]())
          }
          return r
        case o: GclTODO =>
          val r: PreResult[Context, GclSymbol] = preGclTODO(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: GclSymbol)) => PreResult(preCtx, continu, Some[GclSymbol](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type GclSymbol")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[GclSymbol]())
          }
          return r
        case o: GclLib =>
          val r: PreResult[Context, GclSymbol] = preGclLib(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: GclSymbol)) => PreResult(preCtx, continu, Some[GclSymbol](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type GclSymbol")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[GclSymbol]())
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

    @pure def preGclMethod(ctx: Context, o: GclMethod): PreResult[Context, GclMethod] = {
      return PreResult(ctx, T, None())
    }

    @pure def preGclStateVar(ctx: Context, o: GclStateVar): PreResult[Context, GclStateVar] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSBLESSAnnexClause(ctx: Context, o: BTSBLESSAnnexClause): PreResult[Context, BTSBLESSAnnexClause] = {
      return PreResult(ctx, T, None())
    }

    @pure def preGclSpec(ctx: Context, o: GclSpec): PreResult[Context, GclSpec] = {
      o match {
        case o: GclInvariant =>
          val r: PreResult[Context, GclSpec] = preGclInvariant(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: GclSpec)) => PreResult(preCtx, continu, Some[GclSpec](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type GclSpec")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[GclSpec]())
          }
          return r
        case o: GclAssume =>
          val r: PreResult[Context, GclSpec] = preGclAssume(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: GclSpec)) => PreResult(preCtx, continu, Some[GclSpec](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type GclSpec")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[GclSpec]())
          }
          return r
        case o: GclGuarantee =>
          val r: PreResult[Context, GclSpec] = preGclGuarantee(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: GclSpec)) => PreResult(preCtx, continu, Some[GclSpec](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type GclSpec")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[GclSpec]())
          }
          return r
      }
    }

    @pure def preGclInvariant(ctx: Context, o: GclInvariant): PreResult[Context, GclInvariant] = {
      return PreResult(ctx, T, None())
    }

    @pure def preGclComputeSpec(ctx: Context, o: GclComputeSpec): PreResult[Context, GclComputeSpec] = {
      o match {
        case o: GclAssume =>
          val r: PreResult[Context, GclComputeSpec] = preGclAssume(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: GclComputeSpec)) => PreResult(preCtx, continu, Some[GclComputeSpec](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type GclComputeSpec")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[GclComputeSpec]())
          }
          return r
        case o: GclGuarantee =>
          val r: PreResult[Context, GclComputeSpec] = preGclGuarantee(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: GclComputeSpec)) => PreResult(preCtx, continu, Some[GclComputeSpec](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type GclComputeSpec")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[GclComputeSpec]())
          }
          return r
      }
    }

    @pure def preGclAssume(ctx: Context, o: GclAssume): PreResult[Context, GclAssume] = {
      return PreResult(ctx, T, None())
    }

    @pure def preGclGuarantee(ctx: Context, o: GclGuarantee): PreResult[Context, GclGuarantee] = {
      return PreResult(ctx, T, None())
    }

    @pure def preGclIntegration(ctx: Context, o: GclIntegration): PreResult[Context, GclIntegration] = {
      return PreResult(ctx, T, None())
    }

    @pure def preGclCaseStatement(ctx: Context, o: GclCaseStatement): PreResult[Context, GclCaseStatement] = {
      return PreResult(ctx, T, None())
    }

    @pure def preGclInitialize(ctx: Context, o: GclInitialize): PreResult[Context, GclInitialize] = {
      return PreResult(ctx, T, None())
    }

    @pure def preGclCompute(ctx: Context, o: GclCompute): PreResult[Context, GclCompute] = {
      return PreResult(ctx, T, None())
    }

    @pure def preGclHandle(ctx: Context, o: GclHandle): PreResult[Context, GclHandle] = {
      return PreResult(ctx, T, None())
    }

    @pure def preGclTODO(ctx: Context, o: GclTODO): PreResult[Context, GclTODO] = {
      return PreResult(ctx, T, None())
    }

    @pure def preGclLib(ctx: Context, o: GclLib): PreResult[Context, GclLib] = {
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
      }
    }

    @pure def preBTSClassifier(ctx: Context, o: BTSClassifier): PreResult[Context, BTSClassifier] = {
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

    @pure def preBTSBooleanType(ctx: Context, o: BTSBooleanType): PreResult[Context, BTSBooleanType] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSStringType(ctx: Context, o: BTSStringType): PreResult[Context, BTSStringType] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSNullType(ctx: Context, o: BTSNullType): PreResult[Context, BTSNullType] = {
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

    @pure def preBTSTriggerLogicalExpression(ctx: Context, o: BTSTriggerLogicalExpression): PreResult[Context, BTSTriggerLogicalExpression] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSEventTrigger(ctx: Context, o: BTSEventTrigger): PreResult[Context, BTSEventTrigger] = {
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

    @pure def preBTSVariable(ctx: Context, o: BTSVariable): PreResult[Context, BTSVariable] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSAssertionFunctionValue(ctx: Context, o: BTSAssertionFunctionValue): PreResult[Context, BTSAssertionFunctionValue] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSConditionValuePair(ctx: Context, o: BTSConditionValuePair): PreResult[Context, BTSConditionValuePair] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSAssertionEnumeration(ctx: Context, o: BTSAssertionEnumeration): PreResult[Context, BTSAssertionEnumeration] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSEnumerationPair(ctx: Context, o: BTSEnumerationPair): PreResult[Context, BTSEnumerationPair] = {
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

    @pure def preBTSInvocation(ctx: Context, o: BTSInvocation): PreResult[Context, BTSInvocation] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSActualParameter(ctx: Context, o: BTSActualParameter): PreResult[Context, BTSActualParameter] = {
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

    @pure def preBTSTimedExpression(ctx: Context, o: BTSTimedExpression): PreResult[Context, BTSTimedExpression] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSConditionalExpression(ctx: Context, o: BTSConditionalExpression): PreResult[Context, BTSConditionalExpression] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSCaseExpression(ctx: Context, o: BTSCaseExpression): PreResult[Context, BTSCaseExpression] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSCaseChoice(ctx: Context, o: BTSCaseChoice): PreResult[Context, BTSCaseChoice] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSRecordTerm(ctx: Context, o: BTSRecordTerm): PreResult[Context, BTSRecordTerm] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSRecordValue(ctx: Context, o: BTSRecordValue): PreResult[Context, BTSRecordValue] = {
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
        case o: BTSInvocation =>
          val r: PreResult[Context, BTSExp] = preBTSInvocation(ctx, o) match {
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
        case o: BTSTimedExpression =>
          val r: PreResult[Context, BTSExp] = preBTSTimedExpression(ctx, o) match {
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
        case o: BTSCaseExpression =>
          val r: PreResult[Context, BTSExp] = preBTSCaseExpression(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSExp)) => PreResult(preCtx, continu, Some[BTSExp](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSExp")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSExp]())
          }
          return r
        case o: BTSRecordTerm =>
          val r: PreResult[Context, BTSExp] = preBTSRecordTerm(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSExp)) => PreResult(preCtx, continu, Some[BTSExp](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSExp")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSExp]())
          }
          return r
        case o: BTSExponentiation =>
          val r: PreResult[Context, BTSExp] = preBTSExponentiation(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSExp)) => PreResult(preCtx, continu, Some[BTSExp](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSExp")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSExp]())
          }
          return r
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
        case o: BTSValue =>
          val r: PreResult[Context, BTSExp] = preBTSValue(ctx, o) match {
           case PreResult(preCtx, continu, Some(r: BTSExp)) => PreResult(preCtx, continu, Some[BTSExp](r))
           case PreResult(_, _, Some(_)) => halt("Can only produce object of type BTSExp")
           case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[BTSExp]())
          }
          return r
      }
    }

    @pure def preBTSExponentiation(ctx: Context, o: BTSExponentiation): PreResult[Context, BTSExponentiation] = {
      return PreResult(ctx, T, None())
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

    @pure def preBTSQuantity(ctx: Context, o: BTSQuantity): PreResult[Context, BTSQuantity] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSValue(ctx: Context, o: BTSValue): PreResult[Context, BTSValue] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSIndexExpressionOrRange(ctx: Context, o: BTSIndexExpressionOrRange): PreResult[Context, BTSIndexExpressionOrRange] = {
      return PreResult(ctx, T, None())
    }

    @pure def preBTSPartialName(ctx: Context, o: BTSPartialName): PreResult[Context, BTSPartialName] = {
      return PreResult(ctx, T, None())
    }

    @pure def preTODO(ctx: Context, o: TODO): PreResult[Context, TODO] = {
      return PreResult(ctx, T, None())
    }

    @pure def preAttr(ctx: Context, o: Attr): PreResult[Context, Attr] = {
      return PreResult(ctx, T, None())
    }

    @pure def post_langastTopUnit(ctx: Context, o: org.sireum.lang.ast.TopUnit): TPostResult[Context, org.sireum.lang.ast.TopUnit] = {
      o match {
        case o: org.sireum.lang.ast.TopUnit.Program => return post_langastTopUnitProgram(ctx, o)
        case o: org.sireum.lang.ast.TopUnit.SequentUnit => return post_langastTopUnitSequentUnit(ctx, o)
        case o: org.sireum.lang.ast.TopUnit.TruthTableUnit => return post_langastTopUnitTruthTableUnit(ctx, o)
      }
    }

    @pure def post_langastTopUnitProgram(ctx: Context, o: org.sireum.lang.ast.TopUnit.Program): TPostResult[Context, org.sireum.lang.ast.TopUnit] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastTopUnitSequentUnit(ctx: Context, o: org.sireum.lang.ast.TopUnit.SequentUnit): TPostResult[Context, org.sireum.lang.ast.TopUnit] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastTopUnitTruthTableUnit(ctx: Context, o: org.sireum.lang.ast.TopUnit.TruthTableUnit): TPostResult[Context, org.sireum.lang.ast.TopUnit] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastStmt(ctx: Context, o: org.sireum.lang.ast.Stmt): TPostResult[Context, org.sireum.lang.ast.Stmt] = {
      o match {
        case o: org.sireum.lang.ast.Stmt.Import => return post_langastStmtImport(ctx, o)
        case o: org.sireum.lang.ast.Stmt.Var => return post_langastStmtVar(ctx, o)
        case o: org.sireum.lang.ast.Stmt.VarPattern => return post_langastStmtVarPattern(ctx, o)
        case o: org.sireum.lang.ast.Stmt.SpecVar => return post_langastStmtSpecVar(ctx, o)
        case o: org.sireum.lang.ast.Stmt.Method => return post_langastStmtMethod(ctx, o)
        case o: org.sireum.lang.ast.Stmt.ExtMethod => return post_langastStmtExtMethod(ctx, o)
        case o: org.sireum.lang.ast.Stmt.JustMethod => return post_langastStmtJustMethod(ctx, o)
        case o: org.sireum.lang.ast.Stmt.SpecMethod => return post_langastStmtSpecMethod(ctx, o)
        case o: org.sireum.lang.ast.Stmt.Enum => return post_langastStmtEnum(ctx, o)
        case o: org.sireum.lang.ast.Stmt.SubZ => return post_langastStmtSubZ(ctx, o)
        case o: org.sireum.lang.ast.Stmt.Object => return post_langastStmtObject(ctx, o)
        case o: org.sireum.lang.ast.Stmt.Sig => return post_langastStmtSig(ctx, o)
        case o: org.sireum.lang.ast.Stmt.Adt => return post_langastStmtAdt(ctx, o)
        case o: org.sireum.lang.ast.Stmt.TypeAlias => return post_langastStmtTypeAlias(ctx, o)
        case o: org.sireum.lang.ast.Stmt.Assign => return post_langastStmtAssign(ctx, o)
        case o: org.sireum.lang.ast.Stmt.Block => return post_langastStmtBlock(ctx, o)
        case o: org.sireum.lang.ast.Stmt.If => return post_langastStmtIf(ctx, o)
        case o: org.sireum.lang.ast.Stmt.Match => return post_langastStmtMatch(ctx, o)
        case o: org.sireum.lang.ast.Stmt.While => return post_langastStmtWhile(ctx, o)
        case o: org.sireum.lang.ast.Stmt.DoWhile => return post_langastStmtDoWhile(ctx, o)
        case o: org.sireum.lang.ast.Stmt.For => return post_langastStmtFor(ctx, o)
        case o: org.sireum.lang.ast.Stmt.Return => return post_langastStmtReturn(ctx, o)
        case o: org.sireum.lang.ast.Stmt.Expr => return post_langastStmtExpr(ctx, o)
        case o: org.sireum.lang.ast.Stmt.Fact =>
          val r: TPostResult[Context, org.sireum.lang.ast.Stmt] = post_langastStmtFact(ctx, o) match {
           case TPostResult(postCtx, Some(result: org.sireum.lang.ast.Stmt)) => TPostResult(postCtx, Some[org.sireum.lang.ast.Stmt](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Stmt")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.Stmt]())
          }
          return r
        case o: org.sireum.lang.ast.Stmt.Inv =>
          val r: TPostResult[Context, org.sireum.lang.ast.Stmt] = post_langastStmtInv(ctx, o) match {
           case TPostResult(postCtx, Some(result: org.sireum.lang.ast.Stmt)) => TPostResult(postCtx, Some[org.sireum.lang.ast.Stmt](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Stmt")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.Stmt]())
          }
          return r
        case o: org.sireum.lang.ast.Stmt.Theorem =>
          val r: TPostResult[Context, org.sireum.lang.ast.Stmt] = post_langastStmtTheorem(ctx, o) match {
           case TPostResult(postCtx, Some(result: org.sireum.lang.ast.Stmt)) => TPostResult(postCtx, Some[org.sireum.lang.ast.Stmt](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Stmt")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.Stmt]())
          }
          return r
        case o: org.sireum.lang.ast.Stmt.DataRefinement =>
          val r: TPostResult[Context, org.sireum.lang.ast.Stmt] = post_langastStmtDataRefinement(ctx, o) match {
           case TPostResult(postCtx, Some(result: org.sireum.lang.ast.Stmt)) => TPostResult(postCtx, Some[org.sireum.lang.ast.Stmt](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Stmt")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.Stmt]())
          }
          return r
        case o: org.sireum.lang.ast.Stmt.SpecLabel =>
          val r: TPostResult[Context, org.sireum.lang.ast.Stmt] = post_langastStmtSpecLabel(ctx, o) match {
           case TPostResult(postCtx, Some(result: org.sireum.lang.ast.Stmt)) => TPostResult(postCtx, Some[org.sireum.lang.ast.Stmt](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Stmt")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.Stmt]())
          }
          return r
        case o: org.sireum.lang.ast.Stmt.SpecBlock =>
          val r: TPostResult[Context, org.sireum.lang.ast.Stmt] = post_langastStmtSpecBlock(ctx, o) match {
           case TPostResult(postCtx, Some(result: org.sireum.lang.ast.Stmt)) => TPostResult(postCtx, Some[org.sireum.lang.ast.Stmt](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Stmt")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.Stmt]())
          }
          return r
        case o: org.sireum.lang.ast.Stmt.DeduceSequent =>
          val r: TPostResult[Context, org.sireum.lang.ast.Stmt] = post_langastStmtDeduceSequent(ctx, o) match {
           case TPostResult(postCtx, Some(result: org.sireum.lang.ast.Stmt)) => TPostResult(postCtx, Some[org.sireum.lang.ast.Stmt](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Stmt")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.Stmt]())
          }
          return r
        case o: org.sireum.lang.ast.Stmt.DeduceSteps =>
          val r: TPostResult[Context, org.sireum.lang.ast.Stmt] = post_langastStmtDeduceSteps(ctx, o) match {
           case TPostResult(postCtx, Some(result: org.sireum.lang.ast.Stmt)) => TPostResult(postCtx, Some[org.sireum.lang.ast.Stmt](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Stmt")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.Stmt]())
          }
          return r
        case o: org.sireum.lang.ast.Stmt.Havoc =>
          val r: TPostResult[Context, org.sireum.lang.ast.Stmt] = post_langastStmtHavoc(ctx, o) match {
           case TPostResult(postCtx, Some(result: org.sireum.lang.ast.Stmt)) => TPostResult(postCtx, Some[org.sireum.lang.ast.Stmt](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Stmt")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.Stmt]())
          }
          return r
      }
    }

    @pure def post_langastHasModifies(ctx: Context, o: org.sireum.lang.ast.HasModifies): TPostResult[Context, org.sireum.lang.ast.HasModifies] = {
      o match {
        case o: org.sireum.lang.ast.LoopContract =>
          val r: TPostResult[Context, org.sireum.lang.ast.HasModifies] = post_langastLoopContract(ctx, o) match {
           case TPostResult(postCtx, Some(result: org.sireum.lang.ast.HasModifies)) => TPostResult(postCtx, Some[org.sireum.lang.ast.HasModifies](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.HasModifies")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.HasModifies]())
          }
          return r
        case o: org.sireum.lang.ast.MethodContract.Simple =>
          val r: TPostResult[Context, org.sireum.lang.ast.HasModifies] = post_langastMethodContractSimple(ctx, o) match {
           case TPostResult(postCtx, Some(result: org.sireum.lang.ast.HasModifies)) => TPostResult(postCtx, Some[org.sireum.lang.ast.HasModifies](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.HasModifies")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.HasModifies]())
          }
          return r
        case o: org.sireum.lang.ast.MethodContract.Cases =>
          val r: TPostResult[Context, org.sireum.lang.ast.HasModifies] = post_langastMethodContractCases(ctx, o) match {
           case TPostResult(postCtx, Some(result: org.sireum.lang.ast.HasModifies)) => TPostResult(postCtx, Some[org.sireum.lang.ast.HasModifies](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.HasModifies")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.HasModifies]())
          }
          return r
      }
    }

    @pure def post_langastLoopContract(ctx: Context, o: org.sireum.lang.ast.LoopContract): TPostResult[Context, org.sireum.lang.ast.LoopContract] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastStmtImport(ctx: Context, o: org.sireum.lang.ast.Stmt.Import): TPostResult[Context, org.sireum.lang.ast.Stmt] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastStmtImportImporter(ctx: Context, o: org.sireum.lang.ast.Stmt.Import.Importer): TPostResult[Context, org.sireum.lang.ast.Stmt.Import.Importer] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastStmtImportSelector(ctx: Context, o: org.sireum.lang.ast.Stmt.Import.Selector): TPostResult[Context, org.sireum.lang.ast.Stmt.Import.Selector] = {
      o match {
        case o: org.sireum.lang.ast.Stmt.Import.MultiSelector => return post_langastStmtImportMultiSelector(ctx, o)
        case o: org.sireum.lang.ast.Stmt.Import.WildcardSelector => return post_langastStmtImportWildcardSelector(ctx, o)
      }
    }

    @pure def post_langastStmtImportMultiSelector(ctx: Context, o: org.sireum.lang.ast.Stmt.Import.MultiSelector): TPostResult[Context, org.sireum.lang.ast.Stmt.Import.Selector] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastStmtImportWildcardSelector(ctx: Context, o: org.sireum.lang.ast.Stmt.Import.WildcardSelector): TPostResult[Context, org.sireum.lang.ast.Stmt.Import.Selector] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastStmtImportNamedSelector(ctx: Context, o: org.sireum.lang.ast.Stmt.Import.NamedSelector): TPostResult[Context, org.sireum.lang.ast.Stmt.Import.NamedSelector] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastStmtVar(ctx: Context, o: org.sireum.lang.ast.Stmt.Var): TPostResult[Context, org.sireum.lang.ast.Stmt] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastStmtVarPattern(ctx: Context, o: org.sireum.lang.ast.Stmt.VarPattern): TPostResult[Context, org.sireum.lang.ast.Stmt] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastStmtSpecVar(ctx: Context, o: org.sireum.lang.ast.Stmt.SpecVar): TPostResult[Context, org.sireum.lang.ast.Stmt] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastStmtMethod(ctx: Context, o: org.sireum.lang.ast.Stmt.Method): TPostResult[Context, org.sireum.lang.ast.Stmt] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastStmtExtMethod(ctx: Context, o: org.sireum.lang.ast.Stmt.ExtMethod): TPostResult[Context, org.sireum.lang.ast.Stmt] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastStmtJustMethod(ctx: Context, o: org.sireum.lang.ast.Stmt.JustMethod): TPostResult[Context, org.sireum.lang.ast.Stmt] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastStmtSpecMethod(ctx: Context, o: org.sireum.lang.ast.Stmt.SpecMethod): TPostResult[Context, org.sireum.lang.ast.Stmt] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastStmtEnum(ctx: Context, o: org.sireum.lang.ast.Stmt.Enum): TPostResult[Context, org.sireum.lang.ast.Stmt] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastStmtSubZ(ctx: Context, o: org.sireum.lang.ast.Stmt.SubZ): TPostResult[Context, org.sireum.lang.ast.Stmt] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastStmtObject(ctx: Context, o: org.sireum.lang.ast.Stmt.Object): TPostResult[Context, org.sireum.lang.ast.Stmt] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastStmtSig(ctx: Context, o: org.sireum.lang.ast.Stmt.Sig): TPostResult[Context, org.sireum.lang.ast.Stmt] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastStmtAdt(ctx: Context, o: org.sireum.lang.ast.Stmt.Adt): TPostResult[Context, org.sireum.lang.ast.Stmt] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastStmtTypeAlias(ctx: Context, o: org.sireum.lang.ast.Stmt.TypeAlias): TPostResult[Context, org.sireum.lang.ast.Stmt] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastStmtAssign(ctx: Context, o: org.sireum.lang.ast.Stmt.Assign): TPostResult[Context, org.sireum.lang.ast.Stmt] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastStmtBlock(ctx: Context, o: org.sireum.lang.ast.Stmt.Block): TPostResult[Context, org.sireum.lang.ast.Stmt] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastStmtIf(ctx: Context, o: org.sireum.lang.ast.Stmt.If): TPostResult[Context, org.sireum.lang.ast.Stmt] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastStmtMatch(ctx: Context, o: org.sireum.lang.ast.Stmt.Match): TPostResult[Context, org.sireum.lang.ast.Stmt] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastStmtWhile(ctx: Context, o: org.sireum.lang.ast.Stmt.While): TPostResult[Context, org.sireum.lang.ast.Stmt] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastStmtDoWhile(ctx: Context, o: org.sireum.lang.ast.Stmt.DoWhile): TPostResult[Context, org.sireum.lang.ast.Stmt] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastStmtFor(ctx: Context, o: org.sireum.lang.ast.Stmt.For): TPostResult[Context, org.sireum.lang.ast.Stmt] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastStmtReturn(ctx: Context, o: org.sireum.lang.ast.Stmt.Return): TPostResult[Context, org.sireum.lang.ast.Stmt] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastStmtExpr(ctx: Context, o: org.sireum.lang.ast.Stmt.Expr): TPostResult[Context, org.sireum.lang.ast.Stmt] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastStmtSpec(ctx: Context, o: org.sireum.lang.ast.Stmt.Spec): TPostResult[Context, org.sireum.lang.ast.Stmt.Spec] = {
      o match {
        case o: org.sireum.lang.ast.Stmt.Fact => return post_langastStmtFact(ctx, o)
        case o: org.sireum.lang.ast.Stmt.Inv => return post_langastStmtInv(ctx, o)
        case o: org.sireum.lang.ast.Stmt.Theorem => return post_langastStmtTheorem(ctx, o)
        case o: org.sireum.lang.ast.Stmt.DataRefinement => return post_langastStmtDataRefinement(ctx, o)
        case o: org.sireum.lang.ast.Stmt.SpecLabel => return post_langastStmtSpecLabel(ctx, o)
        case o: org.sireum.lang.ast.Stmt.SpecBlock => return post_langastStmtSpecBlock(ctx, o)
        case o: org.sireum.lang.ast.Stmt.DeduceSequent => return post_langastStmtDeduceSequent(ctx, o)
        case o: org.sireum.lang.ast.Stmt.DeduceSteps => return post_langastStmtDeduceSteps(ctx, o)
        case o: org.sireum.lang.ast.Stmt.Havoc => return post_langastStmtHavoc(ctx, o)
      }
    }

    @pure def post_langastStmtFact(ctx: Context, o: org.sireum.lang.ast.Stmt.Fact): TPostResult[Context, org.sireum.lang.ast.Stmt.Spec] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastStmtInv(ctx: Context, o: org.sireum.lang.ast.Stmt.Inv): TPostResult[Context, org.sireum.lang.ast.Stmt.Spec] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastStmtTheorem(ctx: Context, o: org.sireum.lang.ast.Stmt.Theorem): TPostResult[Context, org.sireum.lang.ast.Stmt.Spec] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastStmtDataRefinement(ctx: Context, o: org.sireum.lang.ast.Stmt.DataRefinement): TPostResult[Context, org.sireum.lang.ast.Stmt.Spec] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastStmtSpecLabel(ctx: Context, o: org.sireum.lang.ast.Stmt.SpecLabel): TPostResult[Context, org.sireum.lang.ast.Stmt.Spec] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastStmtSpecBlock(ctx: Context, o: org.sireum.lang.ast.Stmt.SpecBlock): TPostResult[Context, org.sireum.lang.ast.Stmt.Spec] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastStmtDeduceSequent(ctx: Context, o: org.sireum.lang.ast.Stmt.DeduceSequent): TPostResult[Context, org.sireum.lang.ast.Stmt.Spec] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastStmtDeduceSteps(ctx: Context, o: org.sireum.lang.ast.Stmt.DeduceSteps): TPostResult[Context, org.sireum.lang.ast.Stmt.Spec] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastStmtHavoc(ctx: Context, o: org.sireum.lang.ast.Stmt.Havoc): TPostResult[Context, org.sireum.lang.ast.Stmt.Spec] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastMethodContract(ctx: Context, o: org.sireum.lang.ast.MethodContract): TPostResult[Context, org.sireum.lang.ast.MethodContract] = {
      o match {
        case o: org.sireum.lang.ast.MethodContract.Simple => return post_langastMethodContractSimple(ctx, o)
        case o: org.sireum.lang.ast.MethodContract.Cases => return post_langastMethodContractCases(ctx, o)
      }
    }

    @pure def post_langastMethodContractAccesses(ctx: Context, o: org.sireum.lang.ast.MethodContract.Accesses): TPostResult[Context, org.sireum.lang.ast.MethodContract.Accesses] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastMethodContractClaims(ctx: Context, o: org.sireum.lang.ast.MethodContract.Claims): TPostResult[Context, org.sireum.lang.ast.MethodContract.Claims] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastMethodContractSimple(ctx: Context, o: org.sireum.lang.ast.MethodContract.Simple): TPostResult[Context, org.sireum.lang.ast.MethodContract] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastMethodContractCases(ctx: Context, o: org.sireum.lang.ast.MethodContract.Cases): TPostResult[Context, org.sireum.lang.ast.MethodContract] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastMethodContractCase(ctx: Context, o: org.sireum.lang.ast.MethodContract.Case): TPostResult[Context, org.sireum.lang.ast.MethodContract.Case] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastSequent(ctx: Context, o: org.sireum.lang.ast.Sequent): TPostResult[Context, org.sireum.lang.ast.Sequent] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastProofAst(ctx: Context, o: org.sireum.lang.ast.ProofAst): TPostResult[Context, org.sireum.lang.ast.ProofAst] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastProofAstStep(ctx: Context, o: org.sireum.lang.ast.ProofAst.Step): TPostResult[Context, org.sireum.lang.ast.ProofAst.Step] = {
      o match {
        case o: org.sireum.lang.ast.ProofAst.Step.Regular => return post_langastProofAstStepRegular(ctx, o)
        case o: org.sireum.lang.ast.ProofAst.Step.Assume => return post_langastProofAstStepAssume(ctx, o)
        case o: org.sireum.lang.ast.ProofAst.Step.Assert => return post_langastProofAstStepAssert(ctx, o)
        case o: org.sireum.lang.ast.ProofAst.Step.SubProof => return post_langastProofAstStepSubProof(ctx, o)
        case o: org.sireum.lang.ast.ProofAst.Step.Let => return post_langastProofAstStepLet(ctx, o)
        case o: org.sireum.lang.ast.ProofAst.Step.StructInduction => return post_langastProofAstStepStructInduction(ctx, o)
      }
    }

    @pure def post_langastProofAstStepId(ctx: Context, o: org.sireum.lang.ast.ProofAst.StepId): TPostResult[Context, org.sireum.lang.ast.ProofAst.StepId] = {
      o match {
        case o: org.sireum.lang.ast.ProofAst.StepId.Num => return post_langastProofAstStepIdNum(ctx, o)
        case o: org.sireum.lang.ast.ProofAst.StepId.Str => return post_langastProofAstStepIdStr(ctx, o)
      }
    }

    @pure def post_langastProofAstStepIdNum(ctx: Context, o: org.sireum.lang.ast.ProofAst.StepId.Num): TPostResult[Context, org.sireum.lang.ast.ProofAst.StepId] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastProofAstStepIdStr(ctx: Context, o: org.sireum.lang.ast.ProofAst.StepId.Str): TPostResult[Context, org.sireum.lang.ast.ProofAst.StepId] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastProofAstStepRegular(ctx: Context, o: org.sireum.lang.ast.ProofAst.Step.Regular): TPostResult[Context, org.sireum.lang.ast.ProofAst.Step] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastProofAstStepAssume(ctx: Context, o: org.sireum.lang.ast.ProofAst.Step.Assume): TPostResult[Context, org.sireum.lang.ast.ProofAst.Step] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastProofAstStepAssert(ctx: Context, o: org.sireum.lang.ast.ProofAst.Step.Assert): TPostResult[Context, org.sireum.lang.ast.ProofAst.Step] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastProofAstStepSubProof(ctx: Context, o: org.sireum.lang.ast.ProofAst.Step.SubProof): TPostResult[Context, org.sireum.lang.ast.ProofAst.Step] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastProofAstStepLet(ctx: Context, o: org.sireum.lang.ast.ProofAst.Step.Let): TPostResult[Context, org.sireum.lang.ast.ProofAst.Step] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastProofAstStepLetParam(ctx: Context, o: org.sireum.lang.ast.ProofAst.Step.Let.Param): TPostResult[Context, org.sireum.lang.ast.ProofAst.Step.Let.Param] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastProofAstStepStructInduction(ctx: Context, o: org.sireum.lang.ast.ProofAst.Step.StructInduction): TPostResult[Context, org.sireum.lang.ast.ProofAst.Step] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastProofAstStepStructInductionMatchCase(ctx: Context, o: org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase): TPostResult[Context, org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastProofAstStepStructInductionMatchDefault(ctx: Context, o: org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault): TPostResult[Context, org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastProofAstStepJustification(ctx: Context, o: org.sireum.lang.ast.ProofAst.Step.Justification): TPostResult[Context, org.sireum.lang.ast.ProofAst.Step.Justification] = {
      o match {
        case o: org.sireum.lang.ast.ProofAst.Step.Justification.Ref => return post_langastProofAstStepJustificationRef(ctx, o)
        case o: org.sireum.lang.ast.ProofAst.Step.Justification.Apply =>
          val r: TPostResult[Context, org.sireum.lang.ast.ProofAst.Step.Justification] = post_langastProofAstStepJustificationApply(ctx, o) match {
           case TPostResult(postCtx, Some(result: org.sireum.lang.ast.ProofAst.Step.Justification)) => TPostResult(postCtx, Some[org.sireum.lang.ast.ProofAst.Step.Justification](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.ProofAst.Step.Justification")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.ProofAst.Step.Justification]())
          }
          return r
        case o: org.sireum.lang.ast.ProofAst.Step.Justification.ApplyNamed =>
          val r: TPostResult[Context, org.sireum.lang.ast.ProofAst.Step.Justification] = post_langastProofAstStepJustificationApplyNamed(ctx, o) match {
           case TPostResult(postCtx, Some(result: org.sireum.lang.ast.ProofAst.Step.Justification)) => TPostResult(postCtx, Some[org.sireum.lang.ast.ProofAst.Step.Justification](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.ProofAst.Step.Justification")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.ProofAst.Step.Justification]())
          }
          return r
        case o: org.sireum.lang.ast.ProofAst.Step.Justification.ApplyEta =>
          val r: TPostResult[Context, org.sireum.lang.ast.ProofAst.Step.Justification] = post_langastProofAstStepJustificationApplyEta(ctx, o) match {
           case TPostResult(postCtx, Some(result: org.sireum.lang.ast.ProofAst.Step.Justification)) => TPostResult(postCtx, Some[org.sireum.lang.ast.ProofAst.Step.Justification](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.ProofAst.Step.Justification")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.ProofAst.Step.Justification]())
          }
          return r
      }
    }

    @pure def post_langastProofAstStepInception(ctx: Context, o: org.sireum.lang.ast.ProofAst.Step.Inception): TPostResult[Context, org.sireum.lang.ast.ProofAst.Step.Inception] = {
      o match {
        case o: org.sireum.lang.ast.ProofAst.Step.Justification.Apply => return post_langastProofAstStepJustificationApply(ctx, o)
        case o: org.sireum.lang.ast.ProofAst.Step.Justification.ApplyNamed => return post_langastProofAstStepJustificationApplyNamed(ctx, o)
        case o: org.sireum.lang.ast.ProofAst.Step.Justification.ApplyEta => return post_langastProofAstStepJustificationApplyEta(ctx, o)
      }
    }

    @pure def post_langastProofAstStepJustificationRef(ctx: Context, o: org.sireum.lang.ast.ProofAst.Step.Justification.Ref): TPostResult[Context, org.sireum.lang.ast.ProofAst.Step.Justification] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastProofAstStepJustificationApply(ctx: Context, o: org.sireum.lang.ast.ProofAst.Step.Justification.Apply): TPostResult[Context, org.sireum.lang.ast.ProofAst.Step.Inception] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastProofAstStepJustificationApplyNamed(ctx: Context, o: org.sireum.lang.ast.ProofAst.Step.Justification.ApplyNamed): TPostResult[Context, org.sireum.lang.ast.ProofAst.Step.Inception] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastProofAstStepJustificationApplyEta(ctx: Context, o: org.sireum.lang.ast.ProofAst.Step.Justification.ApplyEta): TPostResult[Context, org.sireum.lang.ast.ProofAst.Step.Inception] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastAssignExp(ctx: Context, o: org.sireum.lang.ast.AssignExp): TPostResult[Context, org.sireum.lang.ast.AssignExp] = {
      o match {
        case o: org.sireum.lang.ast.Stmt.Block =>
          val r: TPostResult[Context, org.sireum.lang.ast.AssignExp] = post_langastStmtBlock(ctx, o) match {
           case TPostResult(postCtx, Some(result: org.sireum.lang.ast.AssignExp)) => TPostResult(postCtx, Some[org.sireum.lang.ast.AssignExp](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.AssignExp")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.AssignExp]())
          }
          return r
        case o: org.sireum.lang.ast.Stmt.If =>
          val r: TPostResult[Context, org.sireum.lang.ast.AssignExp] = post_langastStmtIf(ctx, o) match {
           case TPostResult(postCtx, Some(result: org.sireum.lang.ast.AssignExp)) => TPostResult(postCtx, Some[org.sireum.lang.ast.AssignExp](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.AssignExp")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.AssignExp]())
          }
          return r
        case o: org.sireum.lang.ast.Stmt.Match =>
          val r: TPostResult[Context, org.sireum.lang.ast.AssignExp] = post_langastStmtMatch(ctx, o) match {
           case TPostResult(postCtx, Some(result: org.sireum.lang.ast.AssignExp)) => TPostResult(postCtx, Some[org.sireum.lang.ast.AssignExp](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.AssignExp")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.AssignExp]())
          }
          return r
        case o: org.sireum.lang.ast.Stmt.Return =>
          val r: TPostResult[Context, org.sireum.lang.ast.AssignExp] = post_langastStmtReturn(ctx, o) match {
           case TPostResult(postCtx, Some(result: org.sireum.lang.ast.AssignExp)) => TPostResult(postCtx, Some[org.sireum.lang.ast.AssignExp](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.AssignExp")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.AssignExp]())
          }
          return r
        case o: org.sireum.lang.ast.Stmt.Expr =>
          val r: TPostResult[Context, org.sireum.lang.ast.AssignExp] = post_langastStmtExpr(ctx, o) match {
           case TPostResult(postCtx, Some(result: org.sireum.lang.ast.AssignExp)) => TPostResult(postCtx, Some[org.sireum.lang.ast.AssignExp](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.AssignExp")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.AssignExp]())
          }
          return r
      }
    }

    @pure def post_langastCase(ctx: Context, o: org.sireum.lang.ast.Case): TPostResult[Context, org.sireum.lang.ast.Case] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastEnumGenRange(ctx: Context, o: org.sireum.lang.ast.EnumGen.Range): TPostResult[Context, org.sireum.lang.ast.EnumGen.Range] = {
      o match {
        case o: org.sireum.lang.ast.EnumGen.Range.Expr => return post_langastEnumGenRangeExpr(ctx, o)
        case o: org.sireum.lang.ast.EnumGen.Range.Step => return post_langastEnumGenRangeStep(ctx, o)
      }
    }

    @pure def post_langastEnumGenRangeExpr(ctx: Context, o: org.sireum.lang.ast.EnumGen.Range.Expr): TPostResult[Context, org.sireum.lang.ast.EnumGen.Range] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastEnumGenRangeStep(ctx: Context, o: org.sireum.lang.ast.EnumGen.Range.Step): TPostResult[Context, org.sireum.lang.ast.EnumGen.Range] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastEnumGenFor(ctx: Context, o: org.sireum.lang.ast.EnumGen.For): TPostResult[Context, org.sireum.lang.ast.EnumGen.For] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastType(ctx: Context, o: org.sireum.lang.ast.Type): TPostResult[Context, org.sireum.lang.ast.Type] = {
      o match {
        case o: org.sireum.lang.ast.Type.Named => return post_langastTypeNamed(ctx, o)
        case o: org.sireum.lang.ast.Type.Fun => return post_langastTypeFun(ctx, o)
        case o: org.sireum.lang.ast.Type.Tuple => return post_langastTypeTuple(ctx, o)
      }
    }

    @pure def post_langastTypeNamed(ctx: Context, o: org.sireum.lang.ast.Type.Named): TPostResult[Context, org.sireum.lang.ast.Type] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastTypeFun(ctx: Context, o: org.sireum.lang.ast.Type.Fun): TPostResult[Context, org.sireum.lang.ast.Type] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastTypeTuple(ctx: Context, o: org.sireum.lang.ast.Type.Tuple): TPostResult[Context, org.sireum.lang.ast.Type] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastPattern(ctx: Context, o: org.sireum.lang.ast.Pattern): TPostResult[Context, org.sireum.lang.ast.Pattern] = {
      o match {
        case o: org.sireum.lang.ast.Pattern.Literal => return post_langastPatternLiteral(ctx, o)
        case o: org.sireum.lang.ast.Pattern.LitInterpolate => return post_langastPatternLitInterpolate(ctx, o)
        case o: org.sireum.lang.ast.Pattern.Ref => return post_langastPatternRef(ctx, o)
        case o: org.sireum.lang.ast.Pattern.VarBinding => return post_langastPatternVarBinding(ctx, o)
        case o: org.sireum.lang.ast.Pattern.Wildcard => return post_langastPatternWildcard(ctx, o)
        case o: org.sireum.lang.ast.Pattern.SeqWildcard => return post_langastPatternSeqWildcard(ctx, o)
        case o: org.sireum.lang.ast.Pattern.Structure => return post_langastPatternStructure(ctx, o)
      }
    }

    @pure def post_langastPatternLiteral(ctx: Context, o: org.sireum.lang.ast.Pattern.Literal): TPostResult[Context, org.sireum.lang.ast.Pattern] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastPatternLitInterpolate(ctx: Context, o: org.sireum.lang.ast.Pattern.LitInterpolate): TPostResult[Context, org.sireum.lang.ast.Pattern] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastPatternRef(ctx: Context, o: org.sireum.lang.ast.Pattern.Ref): TPostResult[Context, org.sireum.lang.ast.Pattern] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastPatternVarBinding(ctx: Context, o: org.sireum.lang.ast.Pattern.VarBinding): TPostResult[Context, org.sireum.lang.ast.Pattern] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastPatternWildcard(ctx: Context, o: org.sireum.lang.ast.Pattern.Wildcard): TPostResult[Context, org.sireum.lang.ast.Pattern] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastPatternSeqWildcard(ctx: Context, o: org.sireum.lang.ast.Pattern.SeqWildcard): TPostResult[Context, org.sireum.lang.ast.Pattern] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastPatternStructure(ctx: Context, o: org.sireum.lang.ast.Pattern.Structure): TPostResult[Context, org.sireum.lang.ast.Pattern] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastExp(ctx: Context, o: org.sireum.lang.ast.Exp): TPostResult[Context, org.sireum.lang.ast.Exp] = {
      o match {
        case o: org.sireum.lang.ast.Exp.LitB => return post_langastExpLitB(ctx, o)
        case o: org.sireum.lang.ast.Exp.LitC => return post_langastExpLitC(ctx, o)
        case o: org.sireum.lang.ast.Exp.LitZ => return post_langastExpLitZ(ctx, o)
        case o: org.sireum.lang.ast.Exp.LitF32 => return post_langastExpLitF32(ctx, o)
        case o: org.sireum.lang.ast.Exp.LitF64 => return post_langastExpLitF64(ctx, o)
        case o: org.sireum.lang.ast.Exp.LitR => return post_langastExpLitR(ctx, o)
        case o: org.sireum.lang.ast.Exp.LitString => return post_langastExpLitString(ctx, o)
        case o: org.sireum.lang.ast.Exp.LitStepId => return post_langastExpLitStepId(ctx, o)
        case o: org.sireum.lang.ast.Exp.StringInterpolate => return post_langastExpStringInterpolate(ctx, o)
        case o: org.sireum.lang.ast.Exp.This => return post_langastExpThis(ctx, o)
        case o: org.sireum.lang.ast.Exp.Super => return post_langastExpSuper(ctx, o)
        case o: org.sireum.lang.ast.Exp.Unary => return post_langastExpUnary(ctx, o)
        case o: org.sireum.lang.ast.Exp.Binary => return post_langastExpBinary(ctx, o)
        case o: org.sireum.lang.ast.Exp.Ident => return post_langastExpIdent(ctx, o)
        case o: org.sireum.lang.ast.Exp.Eta => return post_langastExpEta(ctx, o)
        case o: org.sireum.lang.ast.Exp.Tuple => return post_langastExpTuple(ctx, o)
        case o: org.sireum.lang.ast.Exp.Select => return post_langastExpSelect(ctx, o)
        case o: org.sireum.lang.ast.Exp.Invoke => return post_langastExpInvoke(ctx, o)
        case o: org.sireum.lang.ast.Exp.InvokeNamed => return post_langastExpInvokeNamed(ctx, o)
        case o: org.sireum.lang.ast.Exp.If => return post_langastExpIf(ctx, o)
        case o: org.sireum.lang.ast.Exp.TypeCond => return post_langastExpTypeCond(ctx, o)
        case o: org.sireum.lang.ast.Exp.Sym => return post_langastExpSym(ctx, o)
        case o: org.sireum.lang.ast.Exp.Fun => return post_langastExpFun(ctx, o)
        case o: org.sireum.lang.ast.Exp.ForYield => return post_langastExpForYield(ctx, o)
        case o: org.sireum.lang.ast.Exp.QuantType =>
          val r: TPostResult[Context, org.sireum.lang.ast.Exp] = post_langastExpQuantType(ctx, o) match {
           case TPostResult(postCtx, Some(result: org.sireum.lang.ast.Exp)) => TPostResult(postCtx, Some[org.sireum.lang.ast.Exp](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Exp")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.Exp]())
          }
          return r
        case o: org.sireum.lang.ast.Exp.QuantRange =>
          val r: TPostResult[Context, org.sireum.lang.ast.Exp] = post_langastExpQuantRange(ctx, o) match {
           case TPostResult(postCtx, Some(result: org.sireum.lang.ast.Exp)) => TPostResult(postCtx, Some[org.sireum.lang.ast.Exp](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Exp")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.Exp]())
          }
          return r
        case o: org.sireum.lang.ast.Exp.QuantEach =>
          val r: TPostResult[Context, org.sireum.lang.ast.Exp] = post_langastExpQuantEach(ctx, o) match {
           case TPostResult(postCtx, Some(result: org.sireum.lang.ast.Exp)) => TPostResult(postCtx, Some[org.sireum.lang.ast.Exp](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Exp")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.Exp]())
          }
          return r
        case o: org.sireum.lang.ast.Exp.Input => return post_langastExpInput(ctx, o)
        case o: org.sireum.lang.ast.Exp.At => return post_langastExpAt(ctx, o)
        case o: org.sireum.lang.ast.Exp.LoopIndex => return post_langastExpLoopIndex(ctx, o)
        case o: org.sireum.lang.ast.Exp.StateSeq => return post_langastExpStateSeq(ctx, o)
        case o: org.sireum.lang.ast.Exp.Result => return post_langastExpResult(ctx, o)
      }
    }

    @pure def post_langastLit(ctx: Context, o: org.sireum.lang.ast.Lit): TPostResult[Context, org.sireum.lang.ast.Lit] = {
      o match {
        case o: org.sireum.lang.ast.Exp.LitB =>
          val r: TPostResult[Context, org.sireum.lang.ast.Lit] = post_langastExpLitB(ctx, o) match {
           case TPostResult(postCtx, Some(result: org.sireum.lang.ast.Lit)) => TPostResult(postCtx, Some[org.sireum.lang.ast.Lit](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Lit")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.Lit]())
          }
          return r
        case o: org.sireum.lang.ast.Exp.LitC =>
          val r: TPostResult[Context, org.sireum.lang.ast.Lit] = post_langastExpLitC(ctx, o) match {
           case TPostResult(postCtx, Some(result: org.sireum.lang.ast.Lit)) => TPostResult(postCtx, Some[org.sireum.lang.ast.Lit](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Lit")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.Lit]())
          }
          return r
        case o: org.sireum.lang.ast.Exp.LitZ =>
          val r: TPostResult[Context, org.sireum.lang.ast.Lit] = post_langastExpLitZ(ctx, o) match {
           case TPostResult(postCtx, Some(result: org.sireum.lang.ast.Lit)) => TPostResult(postCtx, Some[org.sireum.lang.ast.Lit](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Lit")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.Lit]())
          }
          return r
        case o: org.sireum.lang.ast.Exp.LitF32 =>
          val r: TPostResult[Context, org.sireum.lang.ast.Lit] = post_langastExpLitF32(ctx, o) match {
           case TPostResult(postCtx, Some(result: org.sireum.lang.ast.Lit)) => TPostResult(postCtx, Some[org.sireum.lang.ast.Lit](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Lit")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.Lit]())
          }
          return r
        case o: org.sireum.lang.ast.Exp.LitF64 =>
          val r: TPostResult[Context, org.sireum.lang.ast.Lit] = post_langastExpLitF64(ctx, o) match {
           case TPostResult(postCtx, Some(result: org.sireum.lang.ast.Lit)) => TPostResult(postCtx, Some[org.sireum.lang.ast.Lit](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Lit")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.Lit]())
          }
          return r
        case o: org.sireum.lang.ast.Exp.LitR =>
          val r: TPostResult[Context, org.sireum.lang.ast.Lit] = post_langastExpLitR(ctx, o) match {
           case TPostResult(postCtx, Some(result: org.sireum.lang.ast.Lit)) => TPostResult(postCtx, Some[org.sireum.lang.ast.Lit](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Lit")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.Lit]())
          }
          return r
        case o: org.sireum.lang.ast.Exp.LitString =>
          val r: TPostResult[Context, org.sireum.lang.ast.Lit] = post_langastExpLitString(ctx, o) match {
           case TPostResult(postCtx, Some(result: org.sireum.lang.ast.Lit)) => TPostResult(postCtx, Some[org.sireum.lang.ast.Lit](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Lit")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.Lit]())
          }
          return r
        case o: org.sireum.lang.ast.Exp.LitStepId =>
          val r: TPostResult[Context, org.sireum.lang.ast.Lit] = post_langastExpLitStepId(ctx, o) match {
           case TPostResult(postCtx, Some(result: org.sireum.lang.ast.Lit)) => TPostResult(postCtx, Some[org.sireum.lang.ast.Lit](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Lit")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.Lit]())
          }
          return r
      }
    }

    @pure def post_langastExpLitB(ctx: Context, o: org.sireum.lang.ast.Exp.LitB): TPostResult[Context, org.sireum.lang.ast.Exp] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastExpLitC(ctx: Context, o: org.sireum.lang.ast.Exp.LitC): TPostResult[Context, org.sireum.lang.ast.Exp] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastExpLitZ(ctx: Context, o: org.sireum.lang.ast.Exp.LitZ): TPostResult[Context, org.sireum.lang.ast.Exp] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastExpLitF32(ctx: Context, o: org.sireum.lang.ast.Exp.LitF32): TPostResult[Context, org.sireum.lang.ast.Exp] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastExpLitF64(ctx: Context, o: org.sireum.lang.ast.Exp.LitF64): TPostResult[Context, org.sireum.lang.ast.Exp] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastExpLitR(ctx: Context, o: org.sireum.lang.ast.Exp.LitR): TPostResult[Context, org.sireum.lang.ast.Exp] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastExpLitString(ctx: Context, o: org.sireum.lang.ast.Exp.LitString): TPostResult[Context, org.sireum.lang.ast.Exp] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastExpLitStepId(ctx: Context, o: org.sireum.lang.ast.Exp.LitStepId): TPostResult[Context, org.sireum.lang.ast.Exp] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastExpStringInterpolate(ctx: Context, o: org.sireum.lang.ast.Exp.StringInterpolate): TPostResult[Context, org.sireum.lang.ast.Exp] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastExpThis(ctx: Context, o: org.sireum.lang.ast.Exp.This): TPostResult[Context, org.sireum.lang.ast.Exp] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastExpSuper(ctx: Context, o: org.sireum.lang.ast.Exp.Super): TPostResult[Context, org.sireum.lang.ast.Exp] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastExpUnary(ctx: Context, o: org.sireum.lang.ast.Exp.Unary): TPostResult[Context, org.sireum.lang.ast.Exp] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastExpRef(ctx: Context, o: org.sireum.lang.ast.Exp.Ref): TPostResult[Context, org.sireum.lang.ast.Exp.Ref] = {
      o match {
        case o: org.sireum.lang.ast.Exp.Ident =>
          val r: TPostResult[Context, org.sireum.lang.ast.Exp.Ref] = post_langastExpIdent(ctx, o) match {
           case TPostResult(postCtx, Some(result: org.sireum.lang.ast.Exp.Ref)) => TPostResult(postCtx, Some[org.sireum.lang.ast.Exp.Ref](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Exp.Ref")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.Exp.Ref]())
          }
          return r
        case o: org.sireum.lang.ast.Exp.Select =>
          val r: TPostResult[Context, org.sireum.lang.ast.Exp.Ref] = post_langastExpSelect(ctx, o) match {
           case TPostResult(postCtx, Some(result: org.sireum.lang.ast.Exp.Ref)) => TPostResult(postCtx, Some[org.sireum.lang.ast.Exp.Ref](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Exp.Ref")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.Exp.Ref]())
          }
          return r
      }
    }

    @pure def post_langastExpBinary(ctx: Context, o: org.sireum.lang.ast.Exp.Binary): TPostResult[Context, org.sireum.lang.ast.Exp] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastExpIdent(ctx: Context, o: org.sireum.lang.ast.Exp.Ident): TPostResult[Context, org.sireum.lang.ast.Exp] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastExpEta(ctx: Context, o: org.sireum.lang.ast.Exp.Eta): TPostResult[Context, org.sireum.lang.ast.Exp] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastExpTuple(ctx: Context, o: org.sireum.lang.ast.Exp.Tuple): TPostResult[Context, org.sireum.lang.ast.Exp] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastExpSelect(ctx: Context, o: org.sireum.lang.ast.Exp.Select): TPostResult[Context, org.sireum.lang.ast.Exp] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastExpInvoke(ctx: Context, o: org.sireum.lang.ast.Exp.Invoke): TPostResult[Context, org.sireum.lang.ast.Exp] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastExpInvokeNamed(ctx: Context, o: org.sireum.lang.ast.Exp.InvokeNamed): TPostResult[Context, org.sireum.lang.ast.Exp] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastExpIf(ctx: Context, o: org.sireum.lang.ast.Exp.If): TPostResult[Context, org.sireum.lang.ast.Exp] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastExpTypeCond(ctx: Context, o: org.sireum.lang.ast.Exp.TypeCond): TPostResult[Context, org.sireum.lang.ast.Exp] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastExpSym(ctx: Context, o: org.sireum.lang.ast.Exp.Sym): TPostResult[Context, org.sireum.lang.ast.Exp] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastExpFunParam(ctx: Context, o: org.sireum.lang.ast.Exp.Fun.Param): TPostResult[Context, org.sireum.lang.ast.Exp.Fun.Param] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastExpFun(ctx: Context, o: org.sireum.lang.ast.Exp.Fun): TPostResult[Context, org.sireum.lang.ast.Exp] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastExpForYield(ctx: Context, o: org.sireum.lang.ast.Exp.ForYield): TPostResult[Context, org.sireum.lang.ast.Exp] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastExpQuant(ctx: Context, o: org.sireum.lang.ast.Exp.Quant): TPostResult[Context, org.sireum.lang.ast.Exp.Quant] = {
      o match {
        case o: org.sireum.lang.ast.Exp.QuantType => return post_langastExpQuantType(ctx, o)
        case o: org.sireum.lang.ast.Exp.QuantRange => return post_langastExpQuantRange(ctx, o)
        case o: org.sireum.lang.ast.Exp.QuantEach => return post_langastExpQuantEach(ctx, o)
      }
    }

    @pure def post_langastExpQuantType(ctx: Context, o: org.sireum.lang.ast.Exp.QuantType): TPostResult[Context, org.sireum.lang.ast.Exp.Quant] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastExpQuantRange(ctx: Context, o: org.sireum.lang.ast.Exp.QuantRange): TPostResult[Context, org.sireum.lang.ast.Exp.Quant] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastExpQuantEach(ctx: Context, o: org.sireum.lang.ast.Exp.QuantEach): TPostResult[Context, org.sireum.lang.ast.Exp.Quant] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastExpInput(ctx: Context, o: org.sireum.lang.ast.Exp.Input): TPostResult[Context, org.sireum.lang.ast.Exp] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastExpAt(ctx: Context, o: org.sireum.lang.ast.Exp.At): TPostResult[Context, org.sireum.lang.ast.Exp] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastExpLoopIndex(ctx: Context, o: org.sireum.lang.ast.Exp.LoopIndex): TPostResult[Context, org.sireum.lang.ast.Exp] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastExpStateSeq(ctx: Context, o: org.sireum.lang.ast.Exp.StateSeq): TPostResult[Context, org.sireum.lang.ast.Exp] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastExpStateSeqFragment(ctx: Context, o: org.sireum.lang.ast.Exp.StateSeq.Fragment): TPostResult[Context, org.sireum.lang.ast.Exp.StateSeq.Fragment] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastExpResult(ctx: Context, o: org.sireum.lang.ast.Exp.Result): TPostResult[Context, org.sireum.lang.ast.Exp] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastNamedArg(ctx: Context, o: org.sireum.lang.ast.NamedArg): TPostResult[Context, org.sireum.lang.ast.NamedArg] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastId(ctx: Context, o: org.sireum.lang.ast.Id): TPostResult[Context, org.sireum.lang.ast.Id] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastName(ctx: Context, o: org.sireum.lang.ast.Name): TPostResult[Context, org.sireum.lang.ast.Name] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastBody(ctx: Context, o: org.sireum.lang.ast.Body): TPostResult[Context, org.sireum.lang.ast.Body] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastAdtParam(ctx: Context, o: org.sireum.lang.ast.AdtParam): TPostResult[Context, org.sireum.lang.ast.AdtParam] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastMethodSig(ctx: Context, o: org.sireum.lang.ast.MethodSig): TPostResult[Context, org.sireum.lang.ast.MethodSig] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastParam(ctx: Context, o: org.sireum.lang.ast.Param): TPostResult[Context, org.sireum.lang.ast.Param] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastTypeParam(ctx: Context, o: org.sireum.lang.ast.TypeParam): TPostResult[Context, org.sireum.lang.ast.TypeParam] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastAttr(ctx: Context, o: org.sireum.lang.ast.Attr): TPostResult[Context, org.sireum.lang.ast.Attr] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastTypedAttr(ctx: Context, o: org.sireum.lang.ast.TypedAttr): TPostResult[Context, org.sireum.lang.ast.TypedAttr] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastResolvedAttr(ctx: Context, o: org.sireum.lang.ast.ResolvedAttr): TPostResult[Context, org.sireum.lang.ast.ResolvedAttr] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastResolvedInfo(ctx: Context, o: org.sireum.lang.ast.ResolvedInfo): TPostResult[Context, org.sireum.lang.ast.ResolvedInfo] = {
      o match {
        case o: org.sireum.lang.ast.ResolvedInfo.BuiltIn => return post_langastResolvedInfoBuiltIn(ctx, o)
        case o: org.sireum.lang.ast.ResolvedInfo.Package => return post_langastResolvedInfoPackage(ctx, o)
        case o: org.sireum.lang.ast.ResolvedInfo.Enum => return post_langastResolvedInfoEnum(ctx, o)
        case o: org.sireum.lang.ast.ResolvedInfo.EnumElement => return post_langastResolvedInfoEnumElement(ctx, o)
        case o: org.sireum.lang.ast.ResolvedInfo.Object => return post_langastResolvedInfoObject(ctx, o)
        case o: org.sireum.lang.ast.ResolvedInfo.Var => return post_langastResolvedInfoVar(ctx, o)
        case o: org.sireum.lang.ast.ResolvedInfo.Method => return post_langastResolvedInfoMethod(ctx, o)
        case o: org.sireum.lang.ast.ResolvedInfo.Methods => return post_langastResolvedInfoMethods(ctx, o)
        case o: org.sireum.lang.ast.ResolvedInfo.Tuple => return post_langastResolvedInfoTuple(ctx, o)
        case o: org.sireum.lang.ast.ResolvedInfo.LocalVar => return post_langastResolvedInfoLocalVar(ctx, o)
        case o: org.sireum.lang.ast.ResolvedInfo.Fact => return post_langastResolvedInfoFact(ctx, o)
        case o: org.sireum.lang.ast.ResolvedInfo.Theorem => return post_langastResolvedInfoTheorem(ctx, o)
        case o: org.sireum.lang.ast.ResolvedInfo.Inv => return post_langastResolvedInfoInv(ctx, o)
      }
    }

    @pure def post_langastResolvedInfoBuiltIn(ctx: Context, o: org.sireum.lang.ast.ResolvedInfo.BuiltIn): TPostResult[Context, org.sireum.lang.ast.ResolvedInfo] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastResolvedInfoPackage(ctx: Context, o: org.sireum.lang.ast.ResolvedInfo.Package): TPostResult[Context, org.sireum.lang.ast.ResolvedInfo] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastResolvedInfoEnum(ctx: Context, o: org.sireum.lang.ast.ResolvedInfo.Enum): TPostResult[Context, org.sireum.lang.ast.ResolvedInfo] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastResolvedInfoEnumElement(ctx: Context, o: org.sireum.lang.ast.ResolvedInfo.EnumElement): TPostResult[Context, org.sireum.lang.ast.ResolvedInfo] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastResolvedInfoObject(ctx: Context, o: org.sireum.lang.ast.ResolvedInfo.Object): TPostResult[Context, org.sireum.lang.ast.ResolvedInfo] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastResolvedInfoVar(ctx: Context, o: org.sireum.lang.ast.ResolvedInfo.Var): TPostResult[Context, org.sireum.lang.ast.ResolvedInfo] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastResolvedInfoMethod(ctx: Context, o: org.sireum.lang.ast.ResolvedInfo.Method): TPostResult[Context, org.sireum.lang.ast.ResolvedInfo] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastResolvedInfoMethods(ctx: Context, o: org.sireum.lang.ast.ResolvedInfo.Methods): TPostResult[Context, org.sireum.lang.ast.ResolvedInfo] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastResolvedInfoTuple(ctx: Context, o: org.sireum.lang.ast.ResolvedInfo.Tuple): TPostResult[Context, org.sireum.lang.ast.ResolvedInfo] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastResolvedInfoLocalVar(ctx: Context, o: org.sireum.lang.ast.ResolvedInfo.LocalVar): TPostResult[Context, org.sireum.lang.ast.ResolvedInfo] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastResolvedInfoFact(ctx: Context, o: org.sireum.lang.ast.ResolvedInfo.Fact): TPostResult[Context, org.sireum.lang.ast.ResolvedInfo] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastResolvedInfoTheorem(ctx: Context, o: org.sireum.lang.ast.ResolvedInfo.Theorem): TPostResult[Context, org.sireum.lang.ast.ResolvedInfo] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastResolvedInfoInv(ctx: Context, o: org.sireum.lang.ast.ResolvedInfo.Inv): TPostResult[Context, org.sireum.lang.ast.ResolvedInfo] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastTruthTableRow(ctx: Context, o: org.sireum.lang.ast.TruthTable.Row): TPostResult[Context, org.sireum.lang.ast.TruthTable.Row] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastTruthTableAssignment(ctx: Context, o: org.sireum.lang.ast.TruthTable.Assignment): TPostResult[Context, org.sireum.lang.ast.TruthTable.Assignment] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastTruthTableConclusion(ctx: Context, o: org.sireum.lang.ast.TruthTable.Conclusion): TPostResult[Context, org.sireum.lang.ast.TruthTable.Conclusion] = {
      o match {
        case o: org.sireum.lang.ast.TruthTable.Conclusion.Validity => return post_langastTruthTableConclusionValidity(ctx, o)
        case o: org.sireum.lang.ast.TruthTable.Conclusion.Tautology => return post_langastTruthTableConclusionTautology(ctx, o)
        case o: org.sireum.lang.ast.TruthTable.Conclusion.Contradictory => return post_langastTruthTableConclusionContradictory(ctx, o)
        case o: org.sireum.lang.ast.TruthTable.Conclusion.Contingent => return post_langastTruthTableConclusionContingent(ctx, o)
      }
    }

    @pure def post_langastTruthTableConclusionValidity(ctx: Context, o: org.sireum.lang.ast.TruthTable.Conclusion.Validity): TPostResult[Context, org.sireum.lang.ast.TruthTable.Conclusion] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastTruthTableConclusionTautology(ctx: Context, o: org.sireum.lang.ast.TruthTable.Conclusion.Tautology): TPostResult[Context, org.sireum.lang.ast.TruthTable.Conclusion] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastTruthTableConclusionContradictory(ctx: Context, o: org.sireum.lang.ast.TruthTable.Conclusion.Contradictory): TPostResult[Context, org.sireum.lang.ast.TruthTable.Conclusion] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastTruthTableConclusionContingent(ctx: Context, o: org.sireum.lang.ast.TruthTable.Conclusion.Contingent): TPostResult[Context, org.sireum.lang.ast.TruthTable.Conclusion] = {
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

    @pure def post_langastTyped(ctx: Context, o: org.sireum.lang.ast.Typed): TPostResult[Context, org.sireum.lang.ast.Typed] = {
      o match {
        case o: org.sireum.lang.ast.Typed.Name => return post_langastTypedName(ctx, o)
        case o: org.sireum.lang.ast.Typed.Tuple => return post_langastTypedTuple(ctx, o)
        case o: org.sireum.lang.ast.Typed.Fun => return post_langastTypedFun(ctx, o)
        case o: org.sireum.lang.ast.Typed.TypeVar => return post_langastTypedTypeVar(ctx, o)
        case o: org.sireum.lang.ast.Typed.Package => return post_langastTypedPackage(ctx, o)
        case o: org.sireum.lang.ast.Typed.Object => return post_langastTypedObject(ctx, o)
        case o: org.sireum.lang.ast.Typed.Enum => return post_langastTypedEnum(ctx, o)
        case o: org.sireum.lang.ast.Typed.Method => return post_langastTypedMethod(ctx, o)
        case o: org.sireum.lang.ast.Typed.Methods => return post_langastTypedMethods(ctx, o)
        case o: org.sireum.lang.ast.Typed.Fact => return post_langastTypedFact(ctx, o)
        case o: org.sireum.lang.ast.Typed.Theorem => return post_langastTypedTheorem(ctx, o)
        case o: org.sireum.lang.ast.Typed.Inv => return post_langastTypedInv(ctx, o)
      }
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
        case o: GclLib =>
          val r: TPostResult[Context, AnnexLib] = postGclLib(ctx, o) match {
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

    @pure def post_langastTypedName(ctx: Context, o: org.sireum.lang.ast.Typed.Name): TPostResult[Context, org.sireum.lang.ast.Typed] = {
      return TPostResult(ctx, None())
    }

    @pure def postOtherLib(ctx: Context, o: OtherLib): TPostResult[Context, OtherLib] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastTypedTuple(ctx: Context, o: org.sireum.lang.ast.Typed.Tuple): TPostResult[Context, org.sireum.lang.ast.Typed] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastTypedFun(ctx: Context, o: org.sireum.lang.ast.Typed.Fun): TPostResult[Context, org.sireum.lang.ast.Typed] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastTypedTypeVar(ctx: Context, o: org.sireum.lang.ast.Typed.TypeVar): TPostResult[Context, org.sireum.lang.ast.Typed] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastTypedPackage(ctx: Context, o: org.sireum.lang.ast.Typed.Package): TPostResult[Context, org.sireum.lang.ast.Typed] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastTypedObject(ctx: Context, o: org.sireum.lang.ast.Typed.Object): TPostResult[Context, org.sireum.lang.ast.Typed] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastTypedEnum(ctx: Context, o: org.sireum.lang.ast.Typed.Enum): TPostResult[Context, org.sireum.lang.ast.Typed] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastTypedMethod(ctx: Context, o: org.sireum.lang.ast.Typed.Method): TPostResult[Context, org.sireum.lang.ast.Typed] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastTypedMethods(ctx: Context, o: org.sireum.lang.ast.Typed.Methods): TPostResult[Context, org.sireum.lang.ast.Typed] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastTypedFact(ctx: Context, o: org.sireum.lang.ast.Typed.Fact): TPostResult[Context, org.sireum.lang.ast.Typed] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastTypedTheorem(ctx: Context, o: org.sireum.lang.ast.Typed.Theorem): TPostResult[Context, org.sireum.lang.ast.Typed] = {
      return TPostResult(ctx, None())
    }

    @pure def post_langastTypedInv(ctx: Context, o: org.sireum.lang.ast.Typed.Inv): TPostResult[Context, org.sireum.lang.ast.Typed] = {
      return TPostResult(ctx, None())
    }

    @pure def postGclSymbol(ctx: Context, o: GclSymbol): TPostResult[Context, GclSymbol] = {
      o match {
        case o: GclSubclause =>
          val r: TPostResult[Context, GclSymbol] = postGclSubclause(ctx, o) match {
           case TPostResult(postCtx, Some(result: GclSymbol)) => TPostResult(postCtx, Some[GclSymbol](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type GclSymbol")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[GclSymbol]())
          }
          return r
        case o: GclMethod =>
          val r: TPostResult[Context, GclSymbol] = postGclMethod(ctx, o) match {
           case TPostResult(postCtx, Some(result: GclSymbol)) => TPostResult(postCtx, Some[GclSymbol](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type GclSymbol")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[GclSymbol]())
          }
          return r
        case o: GclStateVar =>
          val r: TPostResult[Context, GclSymbol] = postGclStateVar(ctx, o) match {
           case TPostResult(postCtx, Some(result: GclSymbol)) => TPostResult(postCtx, Some[GclSymbol](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type GclSymbol")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[GclSymbol]())
          }
          return r
        case o: GclInvariant =>
          val r: TPostResult[Context, GclSymbol] = postGclInvariant(ctx, o) match {
           case TPostResult(postCtx, Some(result: GclSymbol)) => TPostResult(postCtx, Some[GclSymbol](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type GclSymbol")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[GclSymbol]())
          }
          return r
        case o: GclAssume =>
          val r: TPostResult[Context, GclSymbol] = postGclAssume(ctx, o) match {
           case TPostResult(postCtx, Some(result: GclSymbol)) => TPostResult(postCtx, Some[GclSymbol](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type GclSymbol")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[GclSymbol]())
          }
          return r
        case o: GclGuarantee =>
          val r: TPostResult[Context, GclSymbol] = postGclGuarantee(ctx, o) match {
           case TPostResult(postCtx, Some(result: GclSymbol)) => TPostResult(postCtx, Some[GclSymbol](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type GclSymbol")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[GclSymbol]())
          }
          return r
        case o: GclIntegration =>
          val r: TPostResult[Context, GclSymbol] = postGclIntegration(ctx, o) match {
           case TPostResult(postCtx, Some(result: GclSymbol)) => TPostResult(postCtx, Some[GclSymbol](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type GclSymbol")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[GclSymbol]())
          }
          return r
        case o: GclCaseStatement =>
          val r: TPostResult[Context, GclSymbol] = postGclCaseStatement(ctx, o) match {
           case TPostResult(postCtx, Some(result: GclSymbol)) => TPostResult(postCtx, Some[GclSymbol](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type GclSymbol")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[GclSymbol]())
          }
          return r
        case o: GclInitialize =>
          val r: TPostResult[Context, GclSymbol] = postGclInitialize(ctx, o) match {
           case TPostResult(postCtx, Some(result: GclSymbol)) => TPostResult(postCtx, Some[GclSymbol](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type GclSymbol")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[GclSymbol]())
          }
          return r
        case o: GclCompute =>
          val r: TPostResult[Context, GclSymbol] = postGclCompute(ctx, o) match {
           case TPostResult(postCtx, Some(result: GclSymbol)) => TPostResult(postCtx, Some[GclSymbol](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type GclSymbol")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[GclSymbol]())
          }
          return r
        case o: GclHandle =>
          val r: TPostResult[Context, GclSymbol] = postGclHandle(ctx, o) match {
           case TPostResult(postCtx, Some(result: GclSymbol)) => TPostResult(postCtx, Some[GclSymbol](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type GclSymbol")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[GclSymbol]())
          }
          return r
        case o: GclTODO =>
          val r: TPostResult[Context, GclSymbol] = postGclTODO(ctx, o) match {
           case TPostResult(postCtx, Some(result: GclSymbol)) => TPostResult(postCtx, Some[GclSymbol](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type GclSymbol")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[GclSymbol]())
          }
          return r
        case o: GclLib =>
          val r: TPostResult[Context, GclSymbol] = postGclLib(ctx, o) match {
           case TPostResult(postCtx, Some(result: GclSymbol)) => TPostResult(postCtx, Some[GclSymbol](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type GclSymbol")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[GclSymbol]())
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

    @pure def postGclMethod(ctx: Context, o: GclMethod): TPostResult[Context, GclMethod] = {
      return TPostResult(ctx, None())
    }

    @pure def postGclStateVar(ctx: Context, o: GclStateVar): TPostResult[Context, GclStateVar] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSBLESSAnnexClause(ctx: Context, o: BTSBLESSAnnexClause): TPostResult[Context, BTSBLESSAnnexClause] = {
      return TPostResult(ctx, None())
    }

    @pure def postGclSpec(ctx: Context, o: GclSpec): TPostResult[Context, GclSpec] = {
      o match {
        case o: GclInvariant =>
          val r: TPostResult[Context, GclSpec] = postGclInvariant(ctx, o) match {
           case TPostResult(postCtx, Some(result: GclSpec)) => TPostResult(postCtx, Some[GclSpec](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type GclSpec")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[GclSpec]())
          }
          return r
        case o: GclAssume =>
          val r: TPostResult[Context, GclSpec] = postGclAssume(ctx, o) match {
           case TPostResult(postCtx, Some(result: GclSpec)) => TPostResult(postCtx, Some[GclSpec](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type GclSpec")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[GclSpec]())
          }
          return r
        case o: GclGuarantee =>
          val r: TPostResult[Context, GclSpec] = postGclGuarantee(ctx, o) match {
           case TPostResult(postCtx, Some(result: GclSpec)) => TPostResult(postCtx, Some[GclSpec](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type GclSpec")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[GclSpec]())
          }
          return r
      }
    }

    @pure def postGclInvariant(ctx: Context, o: GclInvariant): TPostResult[Context, GclInvariant] = {
      return TPostResult(ctx, None())
    }

    @pure def postGclComputeSpec(ctx: Context, o: GclComputeSpec): TPostResult[Context, GclComputeSpec] = {
      o match {
        case o: GclAssume =>
          val r: TPostResult[Context, GclComputeSpec] = postGclAssume(ctx, o) match {
           case TPostResult(postCtx, Some(result: GclComputeSpec)) => TPostResult(postCtx, Some[GclComputeSpec](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type GclComputeSpec")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[GclComputeSpec]())
          }
          return r
        case o: GclGuarantee =>
          val r: TPostResult[Context, GclComputeSpec] = postGclGuarantee(ctx, o) match {
           case TPostResult(postCtx, Some(result: GclComputeSpec)) => TPostResult(postCtx, Some[GclComputeSpec](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type GclComputeSpec")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[GclComputeSpec]())
          }
          return r
      }
    }

    @pure def postGclAssume(ctx: Context, o: GclAssume): TPostResult[Context, GclAssume] = {
      return TPostResult(ctx, None())
    }

    @pure def postGclGuarantee(ctx: Context, o: GclGuarantee): TPostResult[Context, GclGuarantee] = {
      return TPostResult(ctx, None())
    }

    @pure def postGclIntegration(ctx: Context, o: GclIntegration): TPostResult[Context, GclIntegration] = {
      return TPostResult(ctx, None())
    }

    @pure def postGclCaseStatement(ctx: Context, o: GclCaseStatement): TPostResult[Context, GclCaseStatement] = {
      return TPostResult(ctx, None())
    }

    @pure def postGclInitialize(ctx: Context, o: GclInitialize): TPostResult[Context, GclInitialize] = {
      return TPostResult(ctx, None())
    }

    @pure def postGclCompute(ctx: Context, o: GclCompute): TPostResult[Context, GclCompute] = {
      return TPostResult(ctx, None())
    }

    @pure def postGclHandle(ctx: Context, o: GclHandle): TPostResult[Context, GclHandle] = {
      return TPostResult(ctx, None())
    }

    @pure def postGclTODO(ctx: Context, o: GclTODO): TPostResult[Context, GclTODO] = {
      return TPostResult(ctx, None())
    }

    @pure def postGclLib(ctx: Context, o: GclLib): TPostResult[Context, GclLib] = {
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
      }
    }

    @pure def postBTSClassifier(ctx: Context, o: BTSClassifier): TPostResult[Context, BTSClassifier] = {
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

    @pure def postBTSBooleanType(ctx: Context, o: BTSBooleanType): TPostResult[Context, BTSBooleanType] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSStringType(ctx: Context, o: BTSStringType): TPostResult[Context, BTSStringType] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSNullType(ctx: Context, o: BTSNullType): TPostResult[Context, BTSNullType] = {
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

    @pure def postBTSTriggerLogicalExpression(ctx: Context, o: BTSTriggerLogicalExpression): TPostResult[Context, BTSTriggerLogicalExpression] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSEventTrigger(ctx: Context, o: BTSEventTrigger): TPostResult[Context, BTSEventTrigger] = {
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

    @pure def postBTSVariable(ctx: Context, o: BTSVariable): TPostResult[Context, BTSVariable] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSAssertionFunctionValue(ctx: Context, o: BTSAssertionFunctionValue): TPostResult[Context, BTSAssertionFunctionValue] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSConditionValuePair(ctx: Context, o: BTSConditionValuePair): TPostResult[Context, BTSConditionValuePair] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSAssertionEnumeration(ctx: Context, o: BTSAssertionEnumeration): TPostResult[Context, BTSAssertionEnumeration] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSEnumerationPair(ctx: Context, o: BTSEnumerationPair): TPostResult[Context, BTSEnumerationPair] = {
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

    @pure def postBTSInvocation(ctx: Context, o: BTSInvocation): TPostResult[Context, BTSInvocation] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSActualParameter(ctx: Context, o: BTSActualParameter): TPostResult[Context, BTSActualParameter] = {
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

    @pure def postBTSTimedExpression(ctx: Context, o: BTSTimedExpression): TPostResult[Context, BTSTimedExpression] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSConditionalExpression(ctx: Context, o: BTSConditionalExpression): TPostResult[Context, BTSConditionalExpression] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSCaseExpression(ctx: Context, o: BTSCaseExpression): TPostResult[Context, BTSCaseExpression] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSCaseChoice(ctx: Context, o: BTSCaseChoice): TPostResult[Context, BTSCaseChoice] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSRecordTerm(ctx: Context, o: BTSRecordTerm): TPostResult[Context, BTSRecordTerm] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSRecordValue(ctx: Context, o: BTSRecordValue): TPostResult[Context, BTSRecordValue] = {
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
        case o: BTSInvocation =>
          val r: TPostResult[Context, BTSExp] = postBTSInvocation(ctx, o) match {
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
        case o: BTSTimedExpression =>
          val r: TPostResult[Context, BTSExp] = postBTSTimedExpression(ctx, o) match {
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
        case o: BTSCaseExpression =>
          val r: TPostResult[Context, BTSExp] = postBTSCaseExpression(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSExp)) => TPostResult(postCtx, Some[BTSExp](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSExp")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSExp]())
          }
          return r
        case o: BTSRecordTerm =>
          val r: TPostResult[Context, BTSExp] = postBTSRecordTerm(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSExp)) => TPostResult(postCtx, Some[BTSExp](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSExp")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSExp]())
          }
          return r
        case o: BTSExponentiation =>
          val r: TPostResult[Context, BTSExp] = postBTSExponentiation(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSExp)) => TPostResult(postCtx, Some[BTSExp](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSExp")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSExp]())
          }
          return r
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
        case o: BTSValue =>
          val r: TPostResult[Context, BTSExp] = postBTSValue(ctx, o) match {
           case TPostResult(postCtx, Some(result: BTSExp)) => TPostResult(postCtx, Some[BTSExp](result))
           case TPostResult(_, Some(_)) => halt("Can only produce object of type BTSExp")
           case TPostResult(postCtx, _) => TPostResult(postCtx, None[BTSExp]())
          }
          return r
      }
    }

    @pure def postBTSExponentiation(ctx: Context, o: BTSExponentiation): TPostResult[Context, BTSExponentiation] = {
      return TPostResult(ctx, None())
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

    @pure def postBTSQuantity(ctx: Context, o: BTSQuantity): TPostResult[Context, BTSQuantity] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSValue(ctx: Context, o: BTSValue): TPostResult[Context, BTSValue] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSIndexExpressionOrRange(ctx: Context, o: BTSIndexExpressionOrRange): TPostResult[Context, BTSIndexExpressionOrRange] = {
      return TPostResult(ctx, None())
    }

    @pure def postBTSPartialName(ctx: Context, o: BTSPartialName): TPostResult[Context, BTSPartialName] = {
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

  @pure def transform_langastTopUnit(ctx: Context, o: org.sireum.lang.ast.TopUnit): TPostResult[Context, org.sireum.lang.ast.TopUnit] = {
    val preR: PreResult[Context, org.sireum.lang.ast.TopUnit] = pp.pre_langastTopUnit(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.TopUnit] = if (preR.continu) {
      val o2: org.sireum.lang.ast.TopUnit = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, org.sireum.lang.ast.TopUnit] = o2 match {
        case o2: org.sireum.lang.ast.TopUnit.Program =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Name] = transform_langastName(preR.ctx, o2.packageName)
          val r1: TPostResult[Context, org.sireum.lang.ast.Body] = transform_langastBody(r0.ctx, o2.body)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(packageName = r0.resultOpt.getOrElse(o2.packageName), body = r1.resultOpt.getOrElse(o2.body))))
          else
            TPostResult(r1.ctx, None())
        case o2: org.sireum.lang.ast.TopUnit.SequentUnit =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Sequent] = transform_langastSequent(preR.ctx, o2.sequent)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(sequent = r0.resultOpt.getOrElse(o2.sequent))))
          else
            TPostResult(r0.ctx, None())
        case o2: org.sireum.lang.ast.TopUnit.TruthTableUnit =>
          val r0: TPostResult[Context, IS[Z, org.sireum.lang.ast.Id]] = transformISZ(preR.ctx, o2.vars, transform_langastId _)
          val r1: TPostResult[Context, org.sireum.lang.ast.Sequent] = transform_langastSequent(r0.ctx, o2.sequent)
          val r2: TPostResult[Context, IS[Z, org.sireum.lang.ast.TruthTable.Row]] = transformISZ(r1.ctx, o2.rows, transform_langastTruthTableRow _)
          val r3: TPostResult[Context, Option[org.sireum.lang.ast.TruthTable.Conclusion]] = transformOption(r2.ctx, o2.conclusionOpt, transform_langastTruthTableConclusion _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(vars = r0.resultOpt.getOrElse(o2.vars), sequent = r1.resultOpt.getOrElse(o2.sequent), rows = r2.resultOpt.getOrElse(o2.rows), conclusionOpt = r3.resultOpt.getOrElse(o2.conclusionOpt))))
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
    val o2: org.sireum.lang.ast.TopUnit = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.TopUnit] = pp.post_langastTopUnit(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastStmt(ctx: Context, o: org.sireum.lang.ast.Stmt): TPostResult[Context, org.sireum.lang.ast.Stmt] = {
    val preR: PreResult[Context, org.sireum.lang.ast.Stmt] = pp.pre_langastStmt(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.Stmt] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Stmt = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, org.sireum.lang.ast.Stmt] = o2 match {
        case o2: org.sireum.lang.ast.Stmt.Import =>
          val r0: TPostResult[Context, IS[Z, org.sireum.lang.ast.Stmt.Import.Importer]] = transformISZ(preR.ctx, o2.importers, transform_langastStmtImportImporter _)
          val r1: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r0.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(importers = r0.resultOpt.getOrElse(o2.importers), attr = r1.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r1.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.Var =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Id] = transform_langastId(preR.ctx, o2.id)
          val r1: TPostResult[Context, Option[org.sireum.lang.ast.Type]] = transformOption(r0.ctx, o2.tipeOpt, transform_langastType _)
          val r2: TPostResult[Context, Option[org.sireum.lang.ast.AssignExp]] = transformOption(r1.ctx, o2.initOpt, transform_langastAssignExp _)
          val r3: TPostResult[Context, org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(r2.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), tipeOpt = r1.resultOpt.getOrElse(o2.tipeOpt), initOpt = r2.resultOpt.getOrElse(o2.initOpt), attr = r3.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r3.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.VarPattern =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Pattern] = transform_langastPattern(preR.ctx, o2.pattern)
          val r1: TPostResult[Context, Option[org.sireum.lang.ast.Type]] = transformOption(r0.ctx, o2.tipeOpt, transform_langastType _)
          val r2: TPostResult[Context, org.sireum.lang.ast.AssignExp] = transform_langastAssignExp(r1.ctx, o2.init)
          val r3: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r2.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(pattern = r0.resultOpt.getOrElse(o2.pattern), tipeOpt = r1.resultOpt.getOrElse(o2.tipeOpt), init = r2.resultOpt.getOrElse(o2.init), attr = r3.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r3.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.SpecVar =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Id] = transform_langastId(preR.ctx, o2.id)
          val r1: TPostResult[Context, org.sireum.lang.ast.Type] = transform_langastType(r0.ctx, o2.tipe)
          val r2: TPostResult[Context, org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(r1.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), tipe = r1.resultOpt.getOrElse(o2.tipe), attr = r2.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r2.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.Method =>
          val r0: TPostResult[Context, org.sireum.lang.ast.MethodSig] = transform_langastMethodSig(preR.ctx, o2.sig)
          val r1: TPostResult[Context, org.sireum.lang.ast.MethodContract] = transform_langastMethodContract(r0.ctx, o2.mcontract)
          val r2: TPostResult[Context, Option[org.sireum.lang.ast.Body]] = transformOption(r1.ctx, o2.bodyOpt, transform_langastBody _)
          val r3: TPostResult[Context, org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(r2.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(sig = r0.resultOpt.getOrElse(o2.sig), mcontract = r1.resultOpt.getOrElse(o2.mcontract), bodyOpt = r2.resultOpt.getOrElse(o2.bodyOpt), attr = r3.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r3.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.ExtMethod =>
          val r0: TPostResult[Context, org.sireum.lang.ast.MethodSig] = transform_langastMethodSig(preR.ctx, o2.sig)
          val r1: TPostResult[Context, org.sireum.lang.ast.MethodContract] = transform_langastMethodContract(r0.ctx, o2.contract)
          val r2: TPostResult[Context, org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(r1.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(sig = r0.resultOpt.getOrElse(o2.sig), contract = r1.resultOpt.getOrElse(o2.contract), attr = r2.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r2.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.JustMethod =>
          val r0: TPostResult[Context, Option[org.sireum.lang.ast.Exp.LitString]] = transformOption(preR.ctx, o2.etaOpt, transform_langastExpLitString _)
          val r1: TPostResult[Context, org.sireum.lang.ast.MethodSig] = transform_langastMethodSig(r0.ctx, o2.sig)
          val r2: TPostResult[Context, org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(r1.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(etaOpt = r0.resultOpt.getOrElse(o2.etaOpt), sig = r1.resultOpt.getOrElse(o2.sig), attr = r2.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r2.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.SpecMethod =>
          val r0: TPostResult[Context, org.sireum.lang.ast.MethodSig] = transform_langastMethodSig(preR.ctx, o2.sig)
          val r1: TPostResult[Context, org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(r0.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(sig = r0.resultOpt.getOrElse(o2.sig), attr = r1.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r1.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.Enum =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Id] = transform_langastId(preR.ctx, o2.id)
          val r1: TPostResult[Context, IS[Z, org.sireum.lang.ast.Id]] = transformISZ(r0.ctx, o2.elements, transform_langastId _)
          val r2: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r1.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), elements = r1.resultOpt.getOrElse(o2.elements), attr = r2.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r2.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.SubZ =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Id] = transform_langastId(preR.ctx, o2.id)
          val r1: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r0.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), attr = r1.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r1.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.Object =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Id] = transform_langastId(preR.ctx, o2.id)
          val r1: TPostResult[Context, IS[Z, org.sireum.lang.ast.Stmt]] = transformISZ(r0.ctx, o2.stmts, transform_langastStmt _)
          val r2: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r1.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), stmts = r1.resultOpt.getOrElse(o2.stmts), attr = r2.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r2.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.Sig =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Id] = transform_langastId(preR.ctx, o2.id)
          val r1: TPostResult[Context, IS[Z, org.sireum.lang.ast.TypeParam]] = transformISZ(r0.ctx, o2.typeParams, transform_langastTypeParam _)
          val r2: TPostResult[Context, IS[Z, org.sireum.lang.ast.Type.Named]] = transformISZ(r1.ctx, o2.parents, transform_langastTypeNamed _)
          val r3: TPostResult[Context, IS[Z, org.sireum.lang.ast.Stmt]] = transformISZ(r2.ctx, o2.stmts, transform_langastStmt _)
          val r4: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r3.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
            TPostResult(r4.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), typeParams = r1.resultOpt.getOrElse(o2.typeParams), parents = r2.resultOpt.getOrElse(o2.parents), stmts = r3.resultOpt.getOrElse(o2.stmts), attr = r4.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r4.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.Adt =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Id] = transform_langastId(preR.ctx, o2.id)
          val r1: TPostResult[Context, IS[Z, org.sireum.lang.ast.TypeParam]] = transformISZ(r0.ctx, o2.typeParams, transform_langastTypeParam _)
          val r2: TPostResult[Context, IS[Z, org.sireum.lang.ast.AdtParam]] = transformISZ(r1.ctx, o2.params, transform_langastAdtParam _)
          val r3: TPostResult[Context, IS[Z, org.sireum.lang.ast.Type.Named]] = transformISZ(r2.ctx, o2.parents, transform_langastTypeNamed _)
          val r4: TPostResult[Context, IS[Z, org.sireum.lang.ast.Stmt]] = transformISZ(r3.ctx, o2.stmts, transform_langastStmt _)
          val r5: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r4.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty || r5.resultOpt.nonEmpty)
            TPostResult(r5.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), typeParams = r1.resultOpt.getOrElse(o2.typeParams), params = r2.resultOpt.getOrElse(o2.params), parents = r3.resultOpt.getOrElse(o2.parents), stmts = r4.resultOpt.getOrElse(o2.stmts), attr = r5.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r5.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.TypeAlias =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Id] = transform_langastId(preR.ctx, o2.id)
          val r1: TPostResult[Context, IS[Z, org.sireum.lang.ast.TypeParam]] = transformISZ(r0.ctx, o2.typeParams, transform_langastTypeParam _)
          val r2: TPostResult[Context, org.sireum.lang.ast.Type] = transform_langastType(r1.ctx, o2.tipe)
          val r3: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r2.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), typeParams = r1.resultOpt.getOrElse(o2.typeParams), tipe = r2.resultOpt.getOrElse(o2.tipe), attr = r3.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r3.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.Assign =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(preR.ctx, o2.lhs)
          val r1: TPostResult[Context, org.sireum.lang.ast.AssignExp] = transform_langastAssignExp(r0.ctx, o2.rhs)
          val r2: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r1.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(lhs = r0.resultOpt.getOrElse(o2.lhs), rhs = r1.resultOpt.getOrElse(o2.rhs), attr = r2.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r2.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.Block =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Body] = transform_langastBody(preR.ctx, o2.body)
          val r1: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r0.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(body = r0.resultOpt.getOrElse(o2.body), attr = r1.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r1.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.If =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(preR.ctx, o2.cond)
          val r1: TPostResult[Context, org.sireum.lang.ast.Body] = transform_langastBody(r0.ctx, o2.thenBody)
          val r2: TPostResult[Context, org.sireum.lang.ast.Body] = transform_langastBody(r1.ctx, o2.elseBody)
          val r3: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r2.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(cond = r0.resultOpt.getOrElse(o2.cond), thenBody = r1.resultOpt.getOrElse(o2.thenBody), elseBody = r2.resultOpt.getOrElse(o2.elseBody), attr = r3.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r3.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.Match =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(preR.ctx, o2.exp)
          val r1: TPostResult[Context, IS[Z, org.sireum.lang.ast.Case]] = transformISZ(r0.ctx, o2.cases, transform_langastCase _)
          val r2: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r1.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(exp = r0.resultOpt.getOrElse(o2.exp), cases = r1.resultOpt.getOrElse(o2.cases), attr = r2.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r2.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.While =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(preR.ctx, o2.cond)
          val r1: TPostResult[Context, org.sireum.lang.ast.LoopContract] = transform_langastLoopContract(r0.ctx, o2.contract)
          val r2: TPostResult[Context, org.sireum.lang.ast.Body] = transform_langastBody(r1.ctx, o2.body)
          val r3: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r2.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(cond = r0.resultOpt.getOrElse(o2.cond), contract = r1.resultOpt.getOrElse(o2.contract), body = r2.resultOpt.getOrElse(o2.body), attr = r3.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r3.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.DoWhile =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(preR.ctx, o2.cond)
          val r1: TPostResult[Context, org.sireum.lang.ast.LoopContract] = transform_langastLoopContract(r0.ctx, o2.contract)
          val r2: TPostResult[Context, org.sireum.lang.ast.Body] = transform_langastBody(r1.ctx, o2.body)
          val r3: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r2.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(cond = r0.resultOpt.getOrElse(o2.cond), contract = r1.resultOpt.getOrElse(o2.contract), body = r2.resultOpt.getOrElse(o2.body), attr = r3.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r3.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.For =>
          val r0: TPostResult[Context, IS[Z, org.sireum.lang.ast.EnumGen.For]] = transformISZ(preR.ctx, o2.enumGens, transform_langastEnumGenFor _)
          val r1: TPostResult[Context, org.sireum.lang.ast.Body] = transform_langastBody(r0.ctx, o2.body)
          val r2: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r1.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(enumGens = r0.resultOpt.getOrElse(o2.enumGens), body = r1.resultOpt.getOrElse(o2.body), attr = r2.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r2.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.Return =>
          val r0: TPostResult[Context, Option[org.sireum.lang.ast.Exp]] = transformOption(preR.ctx, o2.expOpt, transform_langastExp _)
          val r1: TPostResult[Context, org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(r0.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(expOpt = r0.resultOpt.getOrElse(o2.expOpt), attr = r1.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r1.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.Expr =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(preR.ctx, o2.exp)
          val r1: TPostResult[Context, org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(r0.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(exp = r0.resultOpt.getOrElse(o2.exp), attr = r1.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r1.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.Fact =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Id] = transform_langastId(preR.ctx, o2.id)
          val r1: TPostResult[Context, IS[Z, org.sireum.lang.ast.TypeParam]] = transformISZ(r0.ctx, o2.typeParams, transform_langastTypeParam _)
          val r2: TPostResult[Context, Option[org.sireum.lang.ast.Exp.LitString]] = transformOption(r1.ctx, o2.descOpt, transform_langastExpLitString _)
          val r3: TPostResult[Context, IS[Z, org.sireum.lang.ast.Exp]] = transformISZ(r2.ctx, o2.claims, transform_langastExp _)
          val r4: TPostResult[Context, org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(r3.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
            TPostResult(r4.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), typeParams = r1.resultOpt.getOrElse(o2.typeParams), descOpt = r2.resultOpt.getOrElse(o2.descOpt), claims = r3.resultOpt.getOrElse(o2.claims), attr = r4.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r4.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.Inv =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Id] = transform_langastId(preR.ctx, o2.id)
          val r1: TPostResult[Context, IS[Z, org.sireum.lang.ast.Exp]] = transformISZ(r0.ctx, o2.claims, transform_langastExp _)
          val r2: TPostResult[Context, org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(r1.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), claims = r1.resultOpt.getOrElse(o2.claims), attr = r2.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r2.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.Theorem =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Id] = transform_langastId(preR.ctx, o2.id)
          val r1: TPostResult[Context, IS[Z, org.sireum.lang.ast.TypeParam]] = transformISZ(r0.ctx, o2.typeParams, transform_langastTypeParam _)
          val r2: TPostResult[Context, Option[org.sireum.lang.ast.Exp.LitString]] = transformOption(r1.ctx, o2.descOpt, transform_langastExpLitString _)
          val r3: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(r2.ctx, o2.claim)
          val r4: TPostResult[Context, org.sireum.lang.ast.ProofAst] = transform_langastProofAst(r3.ctx, o2.proof)
          val r5: TPostResult[Context, org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(r4.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty || r5.resultOpt.nonEmpty)
            TPostResult(r5.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), typeParams = r1.resultOpt.getOrElse(o2.typeParams), descOpt = r2.resultOpt.getOrElse(o2.descOpt), claim = r3.resultOpt.getOrElse(o2.claim), proof = r4.resultOpt.getOrElse(o2.proof), attr = r5.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r5.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.DataRefinement =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp.Ident] = transform_langastExpIdent(preR.ctx, o2.rep)
          val r1: TPostResult[Context, IS[Z, org.sireum.lang.ast.Exp.Ident]] = transformISZ(r0.ctx, o2.refs, transform_langastExpIdent _)
          val r2: TPostResult[Context, IS[Z, org.sireum.lang.ast.Exp]] = transformISZ(r1.ctx, o2.claims, transform_langastExp _)
          val r3: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r2.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(rep = r0.resultOpt.getOrElse(o2.rep), refs = r1.resultOpt.getOrElse(o2.refs), claims = r2.resultOpt.getOrElse(o2.claims), attr = r3.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r3.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.SpecLabel =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Id] = transform_langastId(preR.ctx, o2.id)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id))))
          else
            TPostResult(r0.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.SpecBlock =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Stmt.Block] = transform_langastStmtBlock(preR.ctx, o2.block)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(block = r0.resultOpt.getOrElse(o2.block))))
          else
            TPostResult(r0.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.DeduceSequent =>
          val r0: TPostResult[Context, Option[org.sireum.lang.ast.Exp.LitString]] = transformOption(preR.ctx, o2.justOpt, transform_langastExpLitString _)
          val r1: TPostResult[Context, IS[Z, org.sireum.lang.ast.Sequent]] = transformISZ(r0.ctx, o2.sequents, transform_langastSequent _)
          val r2: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r1.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(justOpt = r0.resultOpt.getOrElse(o2.justOpt), sequents = r1.resultOpt.getOrElse(o2.sequents), attr = r2.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r2.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.DeduceSteps =>
          val r0: TPostResult[Context, IS[Z, org.sireum.lang.ast.ProofAst.Step]] = transformISZ(preR.ctx, o2.steps, transform_langastProofAstStep _)
          val r1: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r0.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(steps = r0.resultOpt.getOrElse(o2.steps), attr = r1.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r1.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.Havoc =>
          val r0: TPostResult[Context, IS[Z, org.sireum.lang.ast.Exp.Ref]] = transformISZ(preR.ctx, o2.args, transform_langastExpRef _)
          val r1: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r0.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(args = r0.resultOpt.getOrElse(o2.args), attr = r1.resultOpt.getOrElse(o2.attr))))
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
    val o2: org.sireum.lang.ast.Stmt = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.Stmt] = pp.post_langastStmt(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastHasModifies(ctx: Context, o: org.sireum.lang.ast.HasModifies): TPostResult[Context, org.sireum.lang.ast.HasModifies] = {
    val preR: PreResult[Context, org.sireum.lang.ast.HasModifies] = pp.pre_langastHasModifies(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.HasModifies] = if (preR.continu) {
      val o2: org.sireum.lang.ast.HasModifies = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, org.sireum.lang.ast.HasModifies] = o2 match {
        case o2: org.sireum.lang.ast.LoopContract =>
          val r0: TPostResult[Context, IS[Z, org.sireum.lang.ast.Exp]] = transformISZ(preR.ctx, o2.invariants, transform_langastExp _)
          val r1: TPostResult[Context, IS[Z, org.sireum.lang.ast.Exp.Ref]] = transformISZ(r0.ctx, o2.modifies, transform_langastExpRef _)
          val r2: TPostResult[Context, Option[org.sireum.lang.ast.Exp.LitZ]] = transformOption(r1.ctx, o2.maxItOpt, transform_langastExpLitZ _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(invariants = r0.resultOpt.getOrElse(o2.invariants), modifies = r1.resultOpt.getOrElse(o2.modifies), maxItOpt = r2.resultOpt.getOrElse(o2.maxItOpt))))
          else
            TPostResult(r2.ctx, None())
        case o2: org.sireum.lang.ast.MethodContract.Simple =>
          val r0: TPostResult[Context, org.sireum.lang.ast.MethodContract.Accesses] = transform_langastMethodContractAccesses(preR.ctx, o2.readsClause)
          val r1: TPostResult[Context, org.sireum.lang.ast.MethodContract.Claims] = transform_langastMethodContractClaims(r0.ctx, o2.requiresClause)
          val r2: TPostResult[Context, org.sireum.lang.ast.MethodContract.Accesses] = transform_langastMethodContractAccesses(r1.ctx, o2.modifiesClause)
          val r3: TPostResult[Context, org.sireum.lang.ast.MethodContract.Claims] = transform_langastMethodContractClaims(r2.ctx, o2.ensuresClause)
          val r4: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r3.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
            TPostResult(r4.ctx, Some(o2(readsClause = r0.resultOpt.getOrElse(o2.readsClause), requiresClause = r1.resultOpt.getOrElse(o2.requiresClause), modifiesClause = r2.resultOpt.getOrElse(o2.modifiesClause), ensuresClause = r3.resultOpt.getOrElse(o2.ensuresClause), attr = r4.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r4.ctx, None())
        case o2: org.sireum.lang.ast.MethodContract.Cases =>
          val r0: TPostResult[Context, org.sireum.lang.ast.MethodContract.Accesses] = transform_langastMethodContractAccesses(preR.ctx, o2.readsClause)
          val r1: TPostResult[Context, org.sireum.lang.ast.MethodContract.Accesses] = transform_langastMethodContractAccesses(r0.ctx, o2.modifiesClause)
          val r2: TPostResult[Context, IS[Z, org.sireum.lang.ast.MethodContract.Case]] = transformISZ(r1.ctx, o2.cases, transform_langastMethodContractCase _)
          val r3: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r2.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(readsClause = r0.resultOpt.getOrElse(o2.readsClause), modifiesClause = r1.resultOpt.getOrElse(o2.modifiesClause), cases = r2.resultOpt.getOrElse(o2.cases), attr = r3.resultOpt.getOrElse(o2.attr))))
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
    val o2: org.sireum.lang.ast.HasModifies = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.HasModifies] = pp.post_langastHasModifies(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastLoopContract(ctx: Context, o: org.sireum.lang.ast.LoopContract): TPostResult[Context, org.sireum.lang.ast.LoopContract] = {
    val preR: PreResult[Context, org.sireum.lang.ast.LoopContract] = pp.pre_langastLoopContract(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.LoopContract] = if (preR.continu) {
      val o2: org.sireum.lang.ast.LoopContract = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, org.sireum.lang.ast.Exp]] = transformISZ(preR.ctx, o2.invariants, transform_langastExp _)
      val r1: TPostResult[Context, IS[Z, org.sireum.lang.ast.Exp.Ref]] = transformISZ(r0.ctx, o2.modifies, transform_langastExpRef _)
      val r2: TPostResult[Context, Option[org.sireum.lang.ast.Exp.LitZ]] = transformOption(r1.ctx, o2.maxItOpt, transform_langastExpLitZ _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        TPostResult(r2.ctx, Some(o2(invariants = r0.resultOpt.getOrElse(o2.invariants), modifies = r1.resultOpt.getOrElse(o2.modifies), maxItOpt = r2.resultOpt.getOrElse(o2.maxItOpt))))
      else
        TPostResult(r2.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.LoopContract = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.LoopContract] = pp.post_langastLoopContract(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastStmtImportImporter(ctx: Context, o: org.sireum.lang.ast.Stmt.Import.Importer): TPostResult[Context, org.sireum.lang.ast.Stmt.Import.Importer] = {
    val preR: PreResult[Context, org.sireum.lang.ast.Stmt.Import.Importer] = pp.pre_langastStmtImportImporter(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.Stmt.Import.Importer] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Stmt.Import.Importer = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, org.sireum.lang.ast.Name] = transform_langastName(preR.ctx, o2.name)
      val r1: TPostResult[Context, Option[org.sireum.lang.ast.Stmt.Import.Selector]] = transformOption(r0.ctx, o2.selectorOpt, transform_langastStmtImportSelector _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), selectorOpt = r1.resultOpt.getOrElse(o2.selectorOpt))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.Stmt.Import.Importer = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.Stmt.Import.Importer] = pp.post_langastStmtImportImporter(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastStmtImportSelector(ctx: Context, o: org.sireum.lang.ast.Stmt.Import.Selector): TPostResult[Context, org.sireum.lang.ast.Stmt.Import.Selector] = {
    val preR: PreResult[Context, org.sireum.lang.ast.Stmt.Import.Selector] = pp.pre_langastStmtImportSelector(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.Stmt.Import.Selector] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Stmt.Import.Selector = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, org.sireum.lang.ast.Stmt.Import.Selector] = o2 match {
        case o2: org.sireum.lang.ast.Stmt.Import.MultiSelector =>
          val r0: TPostResult[Context, IS[Z, org.sireum.lang.ast.Stmt.Import.NamedSelector]] = transformISZ(preR.ctx, o2.selectors, transform_langastStmtImportNamedSelector _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(selectors = r0.resultOpt.getOrElse(o2.selectors))))
          else
            TPostResult(r0.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.Import.WildcardSelector =>
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
    val o2: org.sireum.lang.ast.Stmt.Import.Selector = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.Stmt.Import.Selector] = pp.post_langastStmtImportSelector(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastStmtImportNamedSelector(ctx: Context, o: org.sireum.lang.ast.Stmt.Import.NamedSelector): TPostResult[Context, org.sireum.lang.ast.Stmt.Import.NamedSelector] = {
    val preR: PreResult[Context, org.sireum.lang.ast.Stmt.Import.NamedSelector] = pp.pre_langastStmtImportNamedSelector(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.Stmt.Import.NamedSelector] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Stmt.Import.NamedSelector = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, org.sireum.lang.ast.Id] = transform_langastId(preR.ctx, o2.from)
      val r1: TPostResult[Context, org.sireum.lang.ast.Id] = transform_langastId(r0.ctx, o2.to)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(from = r0.resultOpt.getOrElse(o2.from), to = r1.resultOpt.getOrElse(o2.to))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.Stmt.Import.NamedSelector = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.Stmt.Import.NamedSelector] = pp.post_langastStmtImportNamedSelector(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastStmtSpec(ctx: Context, o: org.sireum.lang.ast.Stmt.Spec): TPostResult[Context, org.sireum.lang.ast.Stmt.Spec] = {
    val preR: PreResult[Context, org.sireum.lang.ast.Stmt.Spec] = pp.pre_langastStmtSpec(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.Stmt.Spec] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Stmt.Spec = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, org.sireum.lang.ast.Stmt.Spec] = o2 match {
        case o2: org.sireum.lang.ast.Stmt.Fact =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Id] = transform_langastId(preR.ctx, o2.id)
          val r1: TPostResult[Context, IS[Z, org.sireum.lang.ast.TypeParam]] = transformISZ(r0.ctx, o2.typeParams, transform_langastTypeParam _)
          val r2: TPostResult[Context, Option[org.sireum.lang.ast.Exp.LitString]] = transformOption(r1.ctx, o2.descOpt, transform_langastExpLitString _)
          val r3: TPostResult[Context, IS[Z, org.sireum.lang.ast.Exp]] = transformISZ(r2.ctx, o2.claims, transform_langastExp _)
          val r4: TPostResult[Context, org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(r3.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
            TPostResult(r4.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), typeParams = r1.resultOpt.getOrElse(o2.typeParams), descOpt = r2.resultOpt.getOrElse(o2.descOpt), claims = r3.resultOpt.getOrElse(o2.claims), attr = r4.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r4.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.Inv =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Id] = transform_langastId(preR.ctx, o2.id)
          val r1: TPostResult[Context, IS[Z, org.sireum.lang.ast.Exp]] = transformISZ(r0.ctx, o2.claims, transform_langastExp _)
          val r2: TPostResult[Context, org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(r1.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), claims = r1.resultOpt.getOrElse(o2.claims), attr = r2.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r2.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.Theorem =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Id] = transform_langastId(preR.ctx, o2.id)
          val r1: TPostResult[Context, IS[Z, org.sireum.lang.ast.TypeParam]] = transformISZ(r0.ctx, o2.typeParams, transform_langastTypeParam _)
          val r2: TPostResult[Context, Option[org.sireum.lang.ast.Exp.LitString]] = transformOption(r1.ctx, o2.descOpt, transform_langastExpLitString _)
          val r3: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(r2.ctx, o2.claim)
          val r4: TPostResult[Context, org.sireum.lang.ast.ProofAst] = transform_langastProofAst(r3.ctx, o2.proof)
          val r5: TPostResult[Context, org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(r4.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty || r5.resultOpt.nonEmpty)
            TPostResult(r5.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), typeParams = r1.resultOpt.getOrElse(o2.typeParams), descOpt = r2.resultOpt.getOrElse(o2.descOpt), claim = r3.resultOpt.getOrElse(o2.claim), proof = r4.resultOpt.getOrElse(o2.proof), attr = r5.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r5.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.DataRefinement =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp.Ident] = transform_langastExpIdent(preR.ctx, o2.rep)
          val r1: TPostResult[Context, IS[Z, org.sireum.lang.ast.Exp.Ident]] = transformISZ(r0.ctx, o2.refs, transform_langastExpIdent _)
          val r2: TPostResult[Context, IS[Z, org.sireum.lang.ast.Exp]] = transformISZ(r1.ctx, o2.claims, transform_langastExp _)
          val r3: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r2.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(rep = r0.resultOpt.getOrElse(o2.rep), refs = r1.resultOpt.getOrElse(o2.refs), claims = r2.resultOpt.getOrElse(o2.claims), attr = r3.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r3.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.SpecLabel =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Id] = transform_langastId(preR.ctx, o2.id)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id))))
          else
            TPostResult(r0.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.SpecBlock =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Stmt.Block] = transform_langastStmtBlock(preR.ctx, o2.block)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(block = r0.resultOpt.getOrElse(o2.block))))
          else
            TPostResult(r0.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.DeduceSequent =>
          val r0: TPostResult[Context, Option[org.sireum.lang.ast.Exp.LitString]] = transformOption(preR.ctx, o2.justOpt, transform_langastExpLitString _)
          val r1: TPostResult[Context, IS[Z, org.sireum.lang.ast.Sequent]] = transformISZ(r0.ctx, o2.sequents, transform_langastSequent _)
          val r2: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r1.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(justOpt = r0.resultOpt.getOrElse(o2.justOpt), sequents = r1.resultOpt.getOrElse(o2.sequents), attr = r2.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r2.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.DeduceSteps =>
          val r0: TPostResult[Context, IS[Z, org.sireum.lang.ast.ProofAst.Step]] = transformISZ(preR.ctx, o2.steps, transform_langastProofAstStep _)
          val r1: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r0.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(steps = r0.resultOpt.getOrElse(o2.steps), attr = r1.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r1.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.Havoc =>
          val r0: TPostResult[Context, IS[Z, org.sireum.lang.ast.Exp.Ref]] = transformISZ(preR.ctx, o2.args, transform_langastExpRef _)
          val r1: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r0.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(args = r0.resultOpt.getOrElse(o2.args), attr = r1.resultOpt.getOrElse(o2.attr))))
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
    val o2: org.sireum.lang.ast.Stmt.Spec = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.Stmt.Spec] = pp.post_langastStmtSpec(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastMethodContract(ctx: Context, o: org.sireum.lang.ast.MethodContract): TPostResult[Context, org.sireum.lang.ast.MethodContract] = {
    val preR: PreResult[Context, org.sireum.lang.ast.MethodContract] = pp.pre_langastMethodContract(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.MethodContract] = if (preR.continu) {
      val o2: org.sireum.lang.ast.MethodContract = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, org.sireum.lang.ast.MethodContract] = o2 match {
        case o2: org.sireum.lang.ast.MethodContract.Simple =>
          val r0: TPostResult[Context, org.sireum.lang.ast.MethodContract.Accesses] = transform_langastMethodContractAccesses(preR.ctx, o2.readsClause)
          val r1: TPostResult[Context, org.sireum.lang.ast.MethodContract.Claims] = transform_langastMethodContractClaims(r0.ctx, o2.requiresClause)
          val r2: TPostResult[Context, org.sireum.lang.ast.MethodContract.Accesses] = transform_langastMethodContractAccesses(r1.ctx, o2.modifiesClause)
          val r3: TPostResult[Context, org.sireum.lang.ast.MethodContract.Claims] = transform_langastMethodContractClaims(r2.ctx, o2.ensuresClause)
          val r4: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r3.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
            TPostResult(r4.ctx, Some(o2(readsClause = r0.resultOpt.getOrElse(o2.readsClause), requiresClause = r1.resultOpt.getOrElse(o2.requiresClause), modifiesClause = r2.resultOpt.getOrElse(o2.modifiesClause), ensuresClause = r3.resultOpt.getOrElse(o2.ensuresClause), attr = r4.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r4.ctx, None())
        case o2: org.sireum.lang.ast.MethodContract.Cases =>
          val r0: TPostResult[Context, org.sireum.lang.ast.MethodContract.Accesses] = transform_langastMethodContractAccesses(preR.ctx, o2.readsClause)
          val r1: TPostResult[Context, org.sireum.lang.ast.MethodContract.Accesses] = transform_langastMethodContractAccesses(r0.ctx, o2.modifiesClause)
          val r2: TPostResult[Context, IS[Z, org.sireum.lang.ast.MethodContract.Case]] = transformISZ(r1.ctx, o2.cases, transform_langastMethodContractCase _)
          val r3: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r2.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(readsClause = r0.resultOpt.getOrElse(o2.readsClause), modifiesClause = r1.resultOpt.getOrElse(o2.modifiesClause), cases = r2.resultOpt.getOrElse(o2.cases), attr = r3.resultOpt.getOrElse(o2.attr))))
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
    val o2: org.sireum.lang.ast.MethodContract = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.MethodContract] = pp.post_langastMethodContract(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastMethodContractAccesses(ctx: Context, o: org.sireum.lang.ast.MethodContract.Accesses): TPostResult[Context, org.sireum.lang.ast.MethodContract.Accesses] = {
    val preR: PreResult[Context, org.sireum.lang.ast.MethodContract.Accesses] = pp.pre_langastMethodContractAccesses(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.MethodContract.Accesses] = if (preR.continu) {
      val o2: org.sireum.lang.ast.MethodContract.Accesses = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, org.sireum.lang.ast.Exp.Ref]] = transformISZ(preR.ctx, o2.refs, transform_langastExpRef _)
      val r1: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r0.ctx, o2.attr)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(refs = r0.resultOpt.getOrElse(o2.refs), attr = r1.resultOpt.getOrElse(o2.attr))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.MethodContract.Accesses = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.MethodContract.Accesses] = pp.post_langastMethodContractAccesses(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastMethodContractClaims(ctx: Context, o: org.sireum.lang.ast.MethodContract.Claims): TPostResult[Context, org.sireum.lang.ast.MethodContract.Claims] = {
    val preR: PreResult[Context, org.sireum.lang.ast.MethodContract.Claims] = pp.pre_langastMethodContractClaims(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.MethodContract.Claims] = if (preR.continu) {
      val o2: org.sireum.lang.ast.MethodContract.Claims = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, org.sireum.lang.ast.Exp]] = transformISZ(preR.ctx, o2.claims, transform_langastExp _)
      val r1: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r0.ctx, o2.attr)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(claims = r0.resultOpt.getOrElse(o2.claims), attr = r1.resultOpt.getOrElse(o2.attr))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.MethodContract.Claims = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.MethodContract.Claims] = pp.post_langastMethodContractClaims(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastMethodContractCase(ctx: Context, o: org.sireum.lang.ast.MethodContract.Case): TPostResult[Context, org.sireum.lang.ast.MethodContract.Case] = {
    val preR: PreResult[Context, org.sireum.lang.ast.MethodContract.Case] = pp.pre_langastMethodContractCase(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.MethodContract.Case] = if (preR.continu) {
      val o2: org.sireum.lang.ast.MethodContract.Case = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, org.sireum.lang.ast.Exp.LitString] = transform_langastExpLitString(preR.ctx, o2.label)
      val r1: TPostResult[Context, org.sireum.lang.ast.MethodContract.Claims] = transform_langastMethodContractClaims(r0.ctx, o2.requiresClause)
      val r2: TPostResult[Context, org.sireum.lang.ast.MethodContract.Claims] = transform_langastMethodContractClaims(r1.ctx, o2.ensuresClause)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        TPostResult(r2.ctx, Some(o2(label = r0.resultOpt.getOrElse(o2.label), requiresClause = r1.resultOpt.getOrElse(o2.requiresClause), ensuresClause = r2.resultOpt.getOrElse(o2.ensuresClause))))
      else
        TPostResult(r2.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.MethodContract.Case = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.MethodContract.Case] = pp.post_langastMethodContractCase(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastSequent(ctx: Context, o: org.sireum.lang.ast.Sequent): TPostResult[Context, org.sireum.lang.ast.Sequent] = {
    val preR: PreResult[Context, org.sireum.lang.ast.Sequent] = pp.pre_langastSequent(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.Sequent] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Sequent = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, org.sireum.lang.ast.Exp]] = transformISZ(preR.ctx, o2.premises, transform_langastExp _)
      val r1: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(r0.ctx, o2.conclusion)
      val r2: TPostResult[Context, IS[Z, org.sireum.lang.ast.ProofAst.Step]] = transformISZ(r1.ctx, o2.steps, transform_langastProofAstStep _)
      val r3: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r2.ctx, o2.attr)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
        TPostResult(r3.ctx, Some(o2(premises = r0.resultOpt.getOrElse(o2.premises), conclusion = r1.resultOpt.getOrElse(o2.conclusion), steps = r2.resultOpt.getOrElse(o2.steps), attr = r3.resultOpt.getOrElse(o2.attr))))
      else
        TPostResult(r3.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.Sequent = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.Sequent] = pp.post_langastSequent(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastProofAst(ctx: Context, o: org.sireum.lang.ast.ProofAst): TPostResult[Context, org.sireum.lang.ast.ProofAst] = {
    val preR: PreResult[Context, org.sireum.lang.ast.ProofAst] = pp.pre_langastProofAst(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.ProofAst] = if (preR.continu) {
      val o2: org.sireum.lang.ast.ProofAst = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, org.sireum.lang.ast.ProofAst.Step]] = transformISZ(preR.ctx, o2.steps, transform_langastProofAstStep _)
      val r1: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r0.ctx, o2.attr)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(steps = r0.resultOpt.getOrElse(o2.steps), attr = r1.resultOpt.getOrElse(o2.attr))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.ProofAst = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.ProofAst] = pp.post_langastProofAst(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastProofAstStep(ctx: Context, o: org.sireum.lang.ast.ProofAst.Step): TPostResult[Context, org.sireum.lang.ast.ProofAst.Step] = {
    val preR: PreResult[Context, org.sireum.lang.ast.ProofAst.Step] = pp.pre_langastProofAstStep(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.ProofAst.Step] = if (preR.continu) {
      val o2: org.sireum.lang.ast.ProofAst.Step = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, org.sireum.lang.ast.ProofAst.Step] = o2 match {
        case o2: org.sireum.lang.ast.ProofAst.Step.Regular =>
          val r0: TPostResult[Context, org.sireum.lang.ast.ProofAst.StepId] = transform_langastProofAstStepId(preR.ctx, o2.id)
          val r1: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(r0.ctx, o2.claim)
          val r2: TPostResult[Context, org.sireum.lang.ast.ProofAst.Step.Justification] = transform_langastProofAstStepJustification(r1.ctx, o2.just)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), claim = r1.resultOpt.getOrElse(o2.claim), just = r2.resultOpt.getOrElse(o2.just))))
          else
            TPostResult(r2.ctx, None())
        case o2: org.sireum.lang.ast.ProofAst.Step.Assume =>
          val r0: TPostResult[Context, org.sireum.lang.ast.ProofAst.StepId] = transform_langastProofAstStepId(preR.ctx, o2.id)
          val r1: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(r0.ctx, o2.claim)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), claim = r1.resultOpt.getOrElse(o2.claim))))
          else
            TPostResult(r1.ctx, None())
        case o2: org.sireum.lang.ast.ProofAst.Step.Assert =>
          val r0: TPostResult[Context, org.sireum.lang.ast.ProofAst.StepId] = transform_langastProofAstStepId(preR.ctx, o2.id)
          val r1: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(r0.ctx, o2.claim)
          val r2: TPostResult[Context, IS[Z, org.sireum.lang.ast.ProofAst.Step]] = transformISZ(r1.ctx, o2.steps, transform_langastProofAstStep _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), claim = r1.resultOpt.getOrElse(o2.claim), steps = r2.resultOpt.getOrElse(o2.steps))))
          else
            TPostResult(r2.ctx, None())
        case o2: org.sireum.lang.ast.ProofAst.Step.SubProof =>
          val r0: TPostResult[Context, org.sireum.lang.ast.ProofAst.StepId] = transform_langastProofAstStepId(preR.ctx, o2.id)
          val r1: TPostResult[Context, IS[Z, org.sireum.lang.ast.ProofAst.Step]] = transformISZ(r0.ctx, o2.steps, transform_langastProofAstStep _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), steps = r1.resultOpt.getOrElse(o2.steps))))
          else
            TPostResult(r1.ctx, None())
        case o2: org.sireum.lang.ast.ProofAst.Step.Let =>
          val r0: TPostResult[Context, org.sireum.lang.ast.ProofAst.StepId] = transform_langastProofAstStepId(preR.ctx, o2.id)
          val r1: TPostResult[Context, IS[Z, org.sireum.lang.ast.ProofAst.Step.Let.Param]] = transformISZ(r0.ctx, o2.params, transform_langastProofAstStepLetParam _)
          val r2: TPostResult[Context, IS[Z, org.sireum.lang.ast.ProofAst.Step]] = transformISZ(r1.ctx, o2.steps, transform_langastProofAstStep _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), params = r1.resultOpt.getOrElse(o2.params), steps = r2.resultOpt.getOrElse(o2.steps))))
          else
            TPostResult(r2.ctx, None())
        case o2: org.sireum.lang.ast.ProofAst.Step.StructInduction =>
          val r0: TPostResult[Context, org.sireum.lang.ast.ProofAst.StepId] = transform_langastProofAstStepId(preR.ctx, o2.id)
          val r1: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(r0.ctx, o2.claim)
          val r2: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(r1.ctx, o2.exp)
          val r3: TPostResult[Context, IS[Z, org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase]] = transformISZ(r2.ctx, o2.cases, transform_langastProofAstStepStructInductionMatchCase _)
          val r4: TPostResult[Context, Option[org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault]] = transformOption(r3.ctx, o2.defaultOpt, transform_langastProofAstStepStructInductionMatchDefault _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
            TPostResult(r4.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), claim = r1.resultOpt.getOrElse(o2.claim), exp = r2.resultOpt.getOrElse(o2.exp), cases = r3.resultOpt.getOrElse(o2.cases), defaultOpt = r4.resultOpt.getOrElse(o2.defaultOpt))))
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
    val o2: org.sireum.lang.ast.ProofAst.Step = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.ProofAst.Step] = pp.post_langastProofAstStep(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastProofAstStepId(ctx: Context, o: org.sireum.lang.ast.ProofAst.StepId): TPostResult[Context, org.sireum.lang.ast.ProofAst.StepId] = {
    val preR: PreResult[Context, org.sireum.lang.ast.ProofAst.StepId] = pp.pre_langastProofAstStepId(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.ProofAst.StepId] = if (preR.continu) {
      val o2: org.sireum.lang.ast.ProofAst.StepId = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, org.sireum.lang.ast.ProofAst.StepId] = o2 match {
        case o2: org.sireum.lang.ast.ProofAst.StepId.Num =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(preR.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(attr = r0.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r0.ctx, None())
        case o2: org.sireum.lang.ast.ProofAst.StepId.Str =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(preR.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(attr = r0.resultOpt.getOrElse(o2.attr))))
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
    val o2: org.sireum.lang.ast.ProofAst.StepId = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.ProofAst.StepId] = pp.post_langastProofAstStepId(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastProofAstStepLetParam(ctx: Context, o: org.sireum.lang.ast.ProofAst.Step.Let.Param): TPostResult[Context, org.sireum.lang.ast.ProofAst.Step.Let.Param] = {
    val preR: PreResult[Context, org.sireum.lang.ast.ProofAst.Step.Let.Param] = pp.pre_langastProofAstStepLetParam(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.ProofAst.Step.Let.Param] = if (preR.continu) {
      val o2: org.sireum.lang.ast.ProofAst.Step.Let.Param = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, org.sireum.lang.ast.Id] = transform_langastId(preR.ctx, o2.id)
      val r1: TPostResult[Context, Option[org.sireum.lang.ast.Type]] = transformOption(r0.ctx, o2.tipeOpt, transform_langastType _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), tipeOpt = r1.resultOpt.getOrElse(o2.tipeOpt))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.ProofAst.Step.Let.Param = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.ProofAst.Step.Let.Param] = pp.post_langastProofAstStepLetParam(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastProofAstStepStructInductionMatchCase(ctx: Context, o: org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase): TPostResult[Context, org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase] = {
    val preR: PreResult[Context, org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase] = pp.pre_langastProofAstStepStructInductionMatchCase(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase] = if (preR.continu) {
      val o2: org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, org.sireum.lang.ast.Pattern.Structure] = transform_langastPatternStructure(preR.ctx, o2.pattern)
      val r1: TPostResult[Context, Option[org.sireum.lang.ast.ProofAst.Step.Assume]] = transformOption(r0.ctx, o2.hypoOpt, transform_langastProofAstStepAssume _)
      val r2: TPostResult[Context, IS[Z, org.sireum.lang.ast.ProofAst.Step]] = transformISZ(r1.ctx, o2.steps, transform_langastProofAstStep _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        TPostResult(r2.ctx, Some(o2(pattern = r0.resultOpt.getOrElse(o2.pattern), hypoOpt = r1.resultOpt.getOrElse(o2.hypoOpt), steps = r2.resultOpt.getOrElse(o2.steps))))
      else
        TPostResult(r2.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase] = pp.post_langastProofAstStepStructInductionMatchCase(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastProofAstStepStructInductionMatchDefault(ctx: Context, o: org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault): TPostResult[Context, org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault] = {
    val preR: PreResult[Context, org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault] = pp.pre_langastProofAstStepStructInductionMatchDefault(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault] = if (preR.continu) {
      val o2: org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Option[org.sireum.lang.ast.ProofAst.Step.Assume]] = transformOption(preR.ctx, o2.hypoOpt, transform_langastProofAstStepAssume _)
      val r1: TPostResult[Context, IS[Z, org.sireum.lang.ast.ProofAst.Step]] = transformISZ(r0.ctx, o2.steps, transform_langastProofAstStep _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(hypoOpt = r0.resultOpt.getOrElse(o2.hypoOpt), steps = r1.resultOpt.getOrElse(o2.steps))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault] = pp.post_langastProofAstStepStructInductionMatchDefault(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastProofAstStepJustification(ctx: Context, o: org.sireum.lang.ast.ProofAst.Step.Justification): TPostResult[Context, org.sireum.lang.ast.ProofAst.Step.Justification] = {
    val preR: PreResult[Context, org.sireum.lang.ast.ProofAst.Step.Justification] = pp.pre_langastProofAstStepJustification(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.ProofAst.Step.Justification] = if (preR.continu) {
      val o2: org.sireum.lang.ast.ProofAst.Step.Justification = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, org.sireum.lang.ast.ProofAst.Step.Justification] = o2 match {
        case o2: org.sireum.lang.ast.ProofAst.Step.Justification.Ref =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp.Ref] = transform_langastExpRef(preR.ctx, o2.id)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id))))
          else
            TPostResult(r0.ctx, None())
        case o2: org.sireum.lang.ast.ProofAst.Step.Justification.Apply =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp.Invoke] = transform_langastExpInvoke(preR.ctx, o2.invoke)
          val r1: TPostResult[Context, IS[Z, org.sireum.lang.ast.ProofAst.StepId]] = transformISZ(r0.ctx, o2.witnesses, transform_langastProofAstStepId _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(invoke = r0.resultOpt.getOrElse(o2.invoke), witnesses = r1.resultOpt.getOrElse(o2.witnesses))))
          else
            TPostResult(r1.ctx, None())
        case o2: org.sireum.lang.ast.ProofAst.Step.Justification.ApplyNamed =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp.InvokeNamed] = transform_langastExpInvokeNamed(preR.ctx, o2.invoke)
          val r1: TPostResult[Context, IS[Z, org.sireum.lang.ast.ProofAst.StepId]] = transformISZ(r0.ctx, o2.witnesses, transform_langastProofAstStepId _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(invoke = r0.resultOpt.getOrElse(o2.invoke), witnesses = r1.resultOpt.getOrElse(o2.witnesses))))
          else
            TPostResult(r1.ctx, None())
        case o2: org.sireum.lang.ast.ProofAst.Step.Justification.ApplyEta =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp.Eta] = transform_langastExpEta(preR.ctx, o2.eta)
          val r1: TPostResult[Context, IS[Z, org.sireum.lang.ast.ProofAst.StepId]] = transformISZ(r0.ctx, o2.witnesses, transform_langastProofAstStepId _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(eta = r0.resultOpt.getOrElse(o2.eta), witnesses = r1.resultOpt.getOrElse(o2.witnesses))))
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
    val o2: org.sireum.lang.ast.ProofAst.Step.Justification = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.ProofAst.Step.Justification] = pp.post_langastProofAstStepJustification(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastProofAstStepInception(ctx: Context, o: org.sireum.lang.ast.ProofAst.Step.Inception): TPostResult[Context, org.sireum.lang.ast.ProofAst.Step.Inception] = {
    val preR: PreResult[Context, org.sireum.lang.ast.ProofAst.Step.Inception] = pp.pre_langastProofAstStepInception(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.ProofAst.Step.Inception] = if (preR.continu) {
      val o2: org.sireum.lang.ast.ProofAst.Step.Inception = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, org.sireum.lang.ast.ProofAst.Step.Inception] = o2 match {
        case o2: org.sireum.lang.ast.ProofAst.Step.Justification.Apply =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp.Invoke] = transform_langastExpInvoke(preR.ctx, o2.invoke)
          val r1: TPostResult[Context, IS[Z, org.sireum.lang.ast.ProofAst.StepId]] = transformISZ(r0.ctx, o2.witnesses, transform_langastProofAstStepId _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(invoke = r0.resultOpt.getOrElse(o2.invoke), witnesses = r1.resultOpt.getOrElse(o2.witnesses))))
          else
            TPostResult(r1.ctx, None())
        case o2: org.sireum.lang.ast.ProofAst.Step.Justification.ApplyNamed =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp.InvokeNamed] = transform_langastExpInvokeNamed(preR.ctx, o2.invoke)
          val r1: TPostResult[Context, IS[Z, org.sireum.lang.ast.ProofAst.StepId]] = transformISZ(r0.ctx, o2.witnesses, transform_langastProofAstStepId _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(invoke = r0.resultOpt.getOrElse(o2.invoke), witnesses = r1.resultOpt.getOrElse(o2.witnesses))))
          else
            TPostResult(r1.ctx, None())
        case o2: org.sireum.lang.ast.ProofAst.Step.Justification.ApplyEta =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp.Eta] = transform_langastExpEta(preR.ctx, o2.eta)
          val r1: TPostResult[Context, IS[Z, org.sireum.lang.ast.ProofAst.StepId]] = transformISZ(r0.ctx, o2.witnesses, transform_langastProofAstStepId _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(eta = r0.resultOpt.getOrElse(o2.eta), witnesses = r1.resultOpt.getOrElse(o2.witnesses))))
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
    val o2: org.sireum.lang.ast.ProofAst.Step.Inception = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.ProofAst.Step.Inception] = pp.post_langastProofAstStepInception(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastAssignExp(ctx: Context, o: org.sireum.lang.ast.AssignExp): TPostResult[Context, org.sireum.lang.ast.AssignExp] = {
    val preR: PreResult[Context, org.sireum.lang.ast.AssignExp] = pp.pre_langastAssignExp(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.AssignExp] = if (preR.continu) {
      val o2: org.sireum.lang.ast.AssignExp = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, org.sireum.lang.ast.AssignExp] = o2 match {
        case o2: org.sireum.lang.ast.Stmt.Block =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Body] = transform_langastBody(preR.ctx, o2.body)
          val r1: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r0.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(body = r0.resultOpt.getOrElse(o2.body), attr = r1.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r1.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.If =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(preR.ctx, o2.cond)
          val r1: TPostResult[Context, org.sireum.lang.ast.Body] = transform_langastBody(r0.ctx, o2.thenBody)
          val r2: TPostResult[Context, org.sireum.lang.ast.Body] = transform_langastBody(r1.ctx, o2.elseBody)
          val r3: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r2.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(cond = r0.resultOpt.getOrElse(o2.cond), thenBody = r1.resultOpt.getOrElse(o2.thenBody), elseBody = r2.resultOpt.getOrElse(o2.elseBody), attr = r3.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r3.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.Match =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(preR.ctx, o2.exp)
          val r1: TPostResult[Context, IS[Z, org.sireum.lang.ast.Case]] = transformISZ(r0.ctx, o2.cases, transform_langastCase _)
          val r2: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r1.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(exp = r0.resultOpt.getOrElse(o2.exp), cases = r1.resultOpt.getOrElse(o2.cases), attr = r2.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r2.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.Return =>
          val r0: TPostResult[Context, Option[org.sireum.lang.ast.Exp]] = transformOption(preR.ctx, o2.expOpt, transform_langastExp _)
          val r1: TPostResult[Context, org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(r0.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(expOpt = r0.resultOpt.getOrElse(o2.expOpt), attr = r1.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r1.ctx, None())
        case o2: org.sireum.lang.ast.Stmt.Expr =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(preR.ctx, o2.exp)
          val r1: TPostResult[Context, org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(r0.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(exp = r0.resultOpt.getOrElse(o2.exp), attr = r1.resultOpt.getOrElse(o2.attr))))
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
    val o2: org.sireum.lang.ast.AssignExp = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.AssignExp] = pp.post_langastAssignExp(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastCase(ctx: Context, o: org.sireum.lang.ast.Case): TPostResult[Context, org.sireum.lang.ast.Case] = {
    val preR: PreResult[Context, org.sireum.lang.ast.Case] = pp.pre_langastCase(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.Case] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Case = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, org.sireum.lang.ast.Pattern] = transform_langastPattern(preR.ctx, o2.pattern)
      val r1: TPostResult[Context, Option[org.sireum.lang.ast.Exp]] = transformOption(r0.ctx, o2.condOpt, transform_langastExp _)
      val r2: TPostResult[Context, org.sireum.lang.ast.Body] = transform_langastBody(r1.ctx, o2.body)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        TPostResult(r2.ctx, Some(o2(pattern = r0.resultOpt.getOrElse(o2.pattern), condOpt = r1.resultOpt.getOrElse(o2.condOpt), body = r2.resultOpt.getOrElse(o2.body))))
      else
        TPostResult(r2.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.Case = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.Case] = pp.post_langastCase(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastEnumGenRange(ctx: Context, o: org.sireum.lang.ast.EnumGen.Range): TPostResult[Context, org.sireum.lang.ast.EnumGen.Range] = {
    val preR: PreResult[Context, org.sireum.lang.ast.EnumGen.Range] = pp.pre_langastEnumGenRange(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.EnumGen.Range] = if (preR.continu) {
      val o2: org.sireum.lang.ast.EnumGen.Range = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, org.sireum.lang.ast.EnumGen.Range] = o2 match {
        case o2: org.sireum.lang.ast.EnumGen.Range.Expr =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(preR.ctx, o2.exp)
          val r1: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r0.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(exp = r0.resultOpt.getOrElse(o2.exp), attr = r1.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r1.ctx, None())
        case o2: org.sireum.lang.ast.EnumGen.Range.Step =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(preR.ctx, o2.start)
          val r1: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(r0.ctx, o2.end)
          val r2: TPostResult[Context, Option[org.sireum.lang.ast.Exp]] = transformOption(r1.ctx, o2.byOpt, transform_langastExp _)
          val r3: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r2.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(start = r0.resultOpt.getOrElse(o2.start), end = r1.resultOpt.getOrElse(o2.end), byOpt = r2.resultOpt.getOrElse(o2.byOpt), attr = r3.resultOpt.getOrElse(o2.attr))))
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
    val o2: org.sireum.lang.ast.EnumGen.Range = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.EnumGen.Range] = pp.post_langastEnumGenRange(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastEnumGenFor(ctx: Context, o: org.sireum.lang.ast.EnumGen.For): TPostResult[Context, org.sireum.lang.ast.EnumGen.For] = {
    val preR: PreResult[Context, org.sireum.lang.ast.EnumGen.For] = pp.pre_langastEnumGenFor(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.EnumGen.For] = if (preR.continu) {
      val o2: org.sireum.lang.ast.EnumGen.For = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Option[org.sireum.lang.ast.Id]] = transformOption(preR.ctx, o2.idOpt, transform_langastId _)
      val r1: TPostResult[Context, org.sireum.lang.ast.EnumGen.Range] = transform_langastEnumGenRange(r0.ctx, o2.range)
      val r2: TPostResult[Context, Option[org.sireum.lang.ast.Exp]] = transformOption(r1.ctx, o2.condOpt, transform_langastExp _)
      val r3: TPostResult[Context, org.sireum.lang.ast.LoopContract] = transform_langastLoopContract(r2.ctx, o2.contract)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
        TPostResult(r3.ctx, Some(o2(idOpt = r0.resultOpt.getOrElse(o2.idOpt), range = r1.resultOpt.getOrElse(o2.range), condOpt = r2.resultOpt.getOrElse(o2.condOpt), contract = r3.resultOpt.getOrElse(o2.contract))))
      else
        TPostResult(r3.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.EnumGen.For = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.EnumGen.For] = pp.post_langastEnumGenFor(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastType(ctx: Context, o: org.sireum.lang.ast.Type): TPostResult[Context, org.sireum.lang.ast.Type] = {
    val preR: PreResult[Context, org.sireum.lang.ast.Type] = pp.pre_langastType(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.Type] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Type = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, org.sireum.lang.ast.Type] = o2 match {
        case o2: org.sireum.lang.ast.Type.Named =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Name] = transform_langastName(preR.ctx, o2.name)
          val r1: TPostResult[Context, IS[Z, org.sireum.lang.ast.Type]] = transformISZ(r0.ctx, o2.typeArgs, transform_langastType _)
          val r2: TPostResult[Context, org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(r1.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), typeArgs = r1.resultOpt.getOrElse(o2.typeArgs), attr = r2.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r2.ctx, None())
        case o2: org.sireum.lang.ast.Type.Fun =>
          val r0: TPostResult[Context, IS[Z, org.sireum.lang.ast.Type]] = transformISZ(preR.ctx, o2.args, transform_langastType _)
          val r1: TPostResult[Context, org.sireum.lang.ast.Type] = transform_langastType(r0.ctx, o2.ret)
          val r2: TPostResult[Context, org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(r1.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(args = r0.resultOpt.getOrElse(o2.args), ret = r1.resultOpt.getOrElse(o2.ret), attr = r2.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r2.ctx, None())
        case o2: org.sireum.lang.ast.Type.Tuple =>
          val r0: TPostResult[Context, IS[Z, org.sireum.lang.ast.Type]] = transformISZ(preR.ctx, o2.args, transform_langastType _)
          val r1: TPostResult[Context, org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(r0.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(args = r0.resultOpt.getOrElse(o2.args), attr = r1.resultOpt.getOrElse(o2.attr))))
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
    val o2: org.sireum.lang.ast.Type = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.Type] = pp.post_langastType(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastPattern(ctx: Context, o: org.sireum.lang.ast.Pattern): TPostResult[Context, org.sireum.lang.ast.Pattern] = {
    val preR: PreResult[Context, org.sireum.lang.ast.Pattern] = pp.pre_langastPattern(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.Pattern] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Pattern = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, org.sireum.lang.ast.Pattern] = o2 match {
        case o2: org.sireum.lang.ast.Pattern.Literal =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Lit] = transform_langastLit(preR.ctx, o2.lit)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(lit = r0.resultOpt.getOrElse(o2.lit))))
          else
            TPostResult(r0.ctx, None())
        case o2: org.sireum.lang.ast.Pattern.LitInterpolate =>
          val r0: TPostResult[Context, org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(preR.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(attr = r0.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r0.ctx, None())
        case o2: org.sireum.lang.ast.Pattern.Ref =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Name] = transform_langastName(preR.ctx, o2.name)
          val r1: TPostResult[Context, org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(r0.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), attr = r1.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r1.ctx, None())
        case o2: org.sireum.lang.ast.Pattern.VarBinding =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Id] = transform_langastId(preR.ctx, o2.id)
          val r1: TPostResult[Context, Option[org.sireum.lang.ast.Type]] = transformOption(r0.ctx, o2.tipeOpt, transform_langastType _)
          val r2: TPostResult[Context, org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(r1.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), tipeOpt = r1.resultOpt.getOrElse(o2.tipeOpt), attr = r2.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r2.ctx, None())
        case o2: org.sireum.lang.ast.Pattern.Wildcard =>
          val r0: TPostResult[Context, Option[org.sireum.lang.ast.Type]] = transformOption(preR.ctx, o2.typeOpt, transform_langastType _)
          val r1: TPostResult[Context, org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(r0.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(typeOpt = r0.resultOpt.getOrElse(o2.typeOpt), attr = r1.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r1.ctx, None())
        case o2: org.sireum.lang.ast.Pattern.SeqWildcard =>
          val r0: TPostResult[Context, org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(preR.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(attr = r0.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r0.ctx, None())
        case o2: org.sireum.lang.ast.Pattern.Structure =>
          val r0: TPostResult[Context, Option[org.sireum.lang.ast.Id]] = transformOption(preR.ctx, o2.idOpt, transform_langastId _)
          val r1: TPostResult[Context, Option[org.sireum.lang.ast.Name]] = transformOption(r0.ctx, o2.nameOpt, transform_langastName _)
          val r2: TPostResult[Context, IS[Z, org.sireum.lang.ast.Pattern]] = transformISZ(r1.ctx, o2.patterns, transform_langastPattern _)
          val r3: TPostResult[Context, org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(r2.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(idOpt = r0.resultOpt.getOrElse(o2.idOpt), nameOpt = r1.resultOpt.getOrElse(o2.nameOpt), patterns = r2.resultOpt.getOrElse(o2.patterns), attr = r3.resultOpt.getOrElse(o2.attr))))
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
    val o2: org.sireum.lang.ast.Pattern = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.Pattern] = pp.post_langastPattern(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastExp(ctx: Context, o: org.sireum.lang.ast.Exp): TPostResult[Context, org.sireum.lang.ast.Exp] = {
    val preR: PreResult[Context, org.sireum.lang.ast.Exp] = pp.pre_langastExp(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.Exp] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Exp = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, org.sireum.lang.ast.Exp] = o2 match {
        case o2: org.sireum.lang.ast.Exp.LitB =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(preR.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(attr = r0.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r0.ctx, None())
        case o2: org.sireum.lang.ast.Exp.LitC =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(preR.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(attr = r0.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r0.ctx, None())
        case o2: org.sireum.lang.ast.Exp.LitZ =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(preR.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(attr = r0.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r0.ctx, None())
        case o2: org.sireum.lang.ast.Exp.LitF32 =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(preR.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(attr = r0.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r0.ctx, None())
        case o2: org.sireum.lang.ast.Exp.LitF64 =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(preR.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(attr = r0.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r0.ctx, None())
        case o2: org.sireum.lang.ast.Exp.LitR =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(preR.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(attr = r0.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r0.ctx, None())
        case o2: org.sireum.lang.ast.Exp.LitString =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(preR.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(attr = r0.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r0.ctx, None())
        case o2: org.sireum.lang.ast.Exp.LitStepId =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(preR.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(attr = r0.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r0.ctx, None())
        case o2: org.sireum.lang.ast.Exp.StringInterpolate =>
          val r0: TPostResult[Context, IS[Z, org.sireum.lang.ast.Exp.LitString]] = transformISZ(preR.ctx, o2.lits, transform_langastExpLitString _)
          val r1: TPostResult[Context, IS[Z, org.sireum.lang.ast.Exp]] = transformISZ(r0.ctx, o2.args, transform_langastExp _)
          val r2: TPostResult[Context, org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(r1.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(lits = r0.resultOpt.getOrElse(o2.lits), args = r1.resultOpt.getOrElse(o2.args), attr = r2.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r2.ctx, None())
        case o2: org.sireum.lang.ast.Exp.This =>
          val r0: TPostResult[Context, org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(preR.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(attr = r0.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r0.ctx, None())
        case o2: org.sireum.lang.ast.Exp.Super =>
          val r0: TPostResult[Context, Option[org.sireum.lang.ast.Id]] = transformOption(preR.ctx, o2.idOpt, transform_langastId _)
          val r1: TPostResult[Context, org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(r0.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(idOpt = r0.resultOpt.getOrElse(o2.idOpt), attr = r1.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r1.ctx, None())
        case o2: org.sireum.lang.ast.Exp.Unary =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(preR.ctx, o2.exp)
          val r1: TPostResult[Context, org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(r0.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(exp = r0.resultOpt.getOrElse(o2.exp), attr = r1.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r1.ctx, None())
        case o2: org.sireum.lang.ast.Exp.Binary =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(preR.ctx, o2.left)
          val r1: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(r0.ctx, o2.right)
          val r2: TPostResult[Context, org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(r1.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(left = r0.resultOpt.getOrElse(o2.left), right = r1.resultOpt.getOrElse(o2.right), attr = r2.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r2.ctx, None())
        case o2: org.sireum.lang.ast.Exp.Ident =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Id] = transform_langastId(preR.ctx, o2.id)
          val r1: TPostResult[Context, org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(r0.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), attr = r1.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r1.ctx, None())
        case o2: org.sireum.lang.ast.Exp.Eta =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp.Ref] = transform_langastExpRef(preR.ctx, o2.ref)
          val r1: TPostResult[Context, org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(r0.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(ref = r0.resultOpt.getOrElse(o2.ref), attr = r1.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r1.ctx, None())
        case o2: org.sireum.lang.ast.Exp.Tuple =>
          val r0: TPostResult[Context, IS[Z, org.sireum.lang.ast.Exp]] = transformISZ(preR.ctx, o2.args, transform_langastExp _)
          val r1: TPostResult[Context, org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(r0.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(args = r0.resultOpt.getOrElse(o2.args), attr = r1.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r1.ctx, None())
        case o2: org.sireum.lang.ast.Exp.Select =>
          val r0: TPostResult[Context, Option[org.sireum.lang.ast.Exp]] = transformOption(preR.ctx, o2.receiverOpt, transform_langastExp _)
          val r1: TPostResult[Context, org.sireum.lang.ast.Id] = transform_langastId(r0.ctx, o2.id)
          val r2: TPostResult[Context, IS[Z, org.sireum.lang.ast.Type]] = transformISZ(r1.ctx, o2.targs, transform_langastType _)
          val r3: TPostResult[Context, org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(r2.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(receiverOpt = r0.resultOpt.getOrElse(o2.receiverOpt), id = r1.resultOpt.getOrElse(o2.id), targs = r2.resultOpt.getOrElse(o2.targs), attr = r3.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r3.ctx, None())
        case o2: org.sireum.lang.ast.Exp.Invoke =>
          val r0: TPostResult[Context, Option[org.sireum.lang.ast.Exp]] = transformOption(preR.ctx, o2.receiverOpt, transform_langastExp _)
          val r1: TPostResult[Context, org.sireum.lang.ast.Exp.Ident] = transform_langastExpIdent(r0.ctx, o2.ident)
          val r2: TPostResult[Context, IS[Z, org.sireum.lang.ast.Type]] = transformISZ(r1.ctx, o2.targs, transform_langastType _)
          val r3: TPostResult[Context, IS[Z, org.sireum.lang.ast.Exp]] = transformISZ(r2.ctx, o2.args, transform_langastExp _)
          val r4: TPostResult[Context, org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(r3.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
            TPostResult(r4.ctx, Some(o2(receiverOpt = r0.resultOpt.getOrElse(o2.receiverOpt), ident = r1.resultOpt.getOrElse(o2.ident), targs = r2.resultOpt.getOrElse(o2.targs), args = r3.resultOpt.getOrElse(o2.args), attr = r4.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r4.ctx, None())
        case o2: org.sireum.lang.ast.Exp.InvokeNamed =>
          val r0: TPostResult[Context, Option[org.sireum.lang.ast.Exp]] = transformOption(preR.ctx, o2.receiverOpt, transform_langastExp _)
          val r1: TPostResult[Context, org.sireum.lang.ast.Exp.Ident] = transform_langastExpIdent(r0.ctx, o2.ident)
          val r2: TPostResult[Context, IS[Z, org.sireum.lang.ast.Type]] = transformISZ(r1.ctx, o2.targs, transform_langastType _)
          val r3: TPostResult[Context, IS[Z, org.sireum.lang.ast.NamedArg]] = transformISZ(r2.ctx, o2.args, transform_langastNamedArg _)
          val r4: TPostResult[Context, org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(r3.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
            TPostResult(r4.ctx, Some(o2(receiverOpt = r0.resultOpt.getOrElse(o2.receiverOpt), ident = r1.resultOpt.getOrElse(o2.ident), targs = r2.resultOpt.getOrElse(o2.targs), args = r3.resultOpt.getOrElse(o2.args), attr = r4.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r4.ctx, None())
        case o2: org.sireum.lang.ast.Exp.If =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(preR.ctx, o2.cond)
          val r1: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(r0.ctx, o2.thenExp)
          val r2: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(r1.ctx, o2.elseExp)
          val r3: TPostResult[Context, org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(r2.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(cond = r0.resultOpt.getOrElse(o2.cond), thenExp = r1.resultOpt.getOrElse(o2.thenExp), elseExp = r2.resultOpt.getOrElse(o2.elseExp), attr = r3.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r3.ctx, None())
        case o2: org.sireum.lang.ast.Exp.TypeCond =>
          val r0: TPostResult[Context, IS[Z, org.sireum.lang.ast.Exp]] = transformISZ(preR.ctx, o2.args, transform_langastExp _)
          val r1: TPostResult[Context, org.sireum.lang.ast.Exp.Fun] = transform_langastExpFun(r0.ctx, o2.fun)
          val r2: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r1.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(args = r0.resultOpt.getOrElse(o2.args), fun = r1.resultOpt.getOrElse(o2.fun), attr = r2.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r2.ctx, None())
        case o2: org.sireum.lang.ast.Exp.Sym =>
          val r0: TPostResult[Context, org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(preR.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(attr = r0.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r0.ctx, None())
        case o2: org.sireum.lang.ast.Exp.Fun =>
          val r0: TPostResult[Context, IS[Z, org.sireum.lang.ast.Exp.Fun.Param]] = transformISZ(preR.ctx, o2.params, transform_langastExpFunParam _)
          val r1: TPostResult[Context, org.sireum.lang.ast.AssignExp] = transform_langastAssignExp(r0.ctx, o2.exp)
          val r2: TPostResult[Context, org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(r1.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(params = r0.resultOpt.getOrElse(o2.params), exp = r1.resultOpt.getOrElse(o2.exp), attr = r2.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r2.ctx, None())
        case o2: org.sireum.lang.ast.Exp.ForYield =>
          val r0: TPostResult[Context, IS[Z, org.sireum.lang.ast.EnumGen.For]] = transformISZ(preR.ctx, o2.enumGens, transform_langastEnumGenFor _)
          val r1: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(r0.ctx, o2.exp)
          val r2: TPostResult[Context, org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(r1.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(enumGens = r0.resultOpt.getOrElse(o2.enumGens), exp = r1.resultOpt.getOrElse(o2.exp), attr = r2.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r2.ctx, None())
        case o2: org.sireum.lang.ast.Exp.QuantType =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp.Fun] = transform_langastExpFun(preR.ctx, o2.fun)
          val r1: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r0.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(fun = r0.resultOpt.getOrElse(o2.fun), attr = r1.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r1.ctx, None())
        case o2: org.sireum.lang.ast.Exp.QuantRange =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(preR.ctx, o2.lo)
          val r1: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(r0.ctx, o2.hi)
          val r2: TPostResult[Context, org.sireum.lang.ast.Exp.Fun] = transform_langastExpFun(r1.ctx, o2.fun)
          val r3: TPostResult[Context, org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(r2.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(lo = r0.resultOpt.getOrElse(o2.lo), hi = r1.resultOpt.getOrElse(o2.hi), fun = r2.resultOpt.getOrElse(o2.fun), attr = r3.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r3.ctx, None())
        case o2: org.sireum.lang.ast.Exp.QuantEach =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(preR.ctx, o2.seq)
          val r1: TPostResult[Context, org.sireum.lang.ast.Exp.Fun] = transform_langastExpFun(r0.ctx, o2.fun)
          val r2: TPostResult[Context, org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(r1.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(seq = r0.resultOpt.getOrElse(o2.seq), fun = r1.resultOpt.getOrElse(o2.fun), attr = r2.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r2.ctx, None())
        case o2: org.sireum.lang.ast.Exp.Input =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(preR.ctx, o2.exp)
          val r1: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r0.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(exp = r0.resultOpt.getOrElse(o2.exp), attr = r1.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r1.ctx, None())
        case o2: org.sireum.lang.ast.Exp.At =>
          val r0: TPostResult[Context, Option[org.sireum.lang.ast.Type]] = transformOption(preR.ctx, o2.tipeOpt, transform_langastType _)
          val r1: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(r0.ctx, o2.exp)
          val r2: TPostResult[Context, org.sireum.lang.ast.Exp.LitZ] = transform_langastExpLitZ(r1.ctx, o2.num)
          val r3: TPostResult[Context, IS[Z, org.sireum.lang.ast.Exp.LitZ]] = transformISZ(r2.ctx, o2.linesFresh, transform_langastExpLitZ _)
          val r4: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r3.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
            TPostResult(r4.ctx, Some(o2(tipeOpt = r0.resultOpt.getOrElse(o2.tipeOpt), exp = r1.resultOpt.getOrElse(o2.exp), num = r2.resultOpt.getOrElse(o2.num), linesFresh = r3.resultOpt.getOrElse(o2.linesFresh), attr = r4.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r4.ctx, None())
        case o2: org.sireum.lang.ast.Exp.LoopIndex =>
          val r0: TPostResult[Context, Option[org.sireum.lang.ast.Type]] = transformOption(preR.ctx, o2.tipeOpt, transform_langastType _)
          val r1: TPostResult[Context, org.sireum.lang.ast.Exp.Ident] = transform_langastExpIdent(r0.ctx, o2.exp)
          val r2: TPostResult[Context, org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(r1.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(tipeOpt = r0.resultOpt.getOrElse(o2.tipeOpt), exp = r1.resultOpt.getOrElse(o2.exp), attr = r2.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r2.ctx, None())
        case o2: org.sireum.lang.ast.Exp.StateSeq =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Id] = transform_langastId(preR.ctx, o2.id)
          val r1: TPostResult[Context, IS[Z, org.sireum.lang.ast.Exp.StateSeq.Fragment]] = transformISZ(r0.ctx, o2.fragments, transform_langastExpStateSeqFragment _)
          val r2: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r1.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), fragments = r1.resultOpt.getOrElse(o2.fragments), attr = r2.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r2.ctx, None())
        case o2: org.sireum.lang.ast.Exp.Result =>
          val r0: TPostResult[Context, Option[org.sireum.lang.ast.Type]] = transformOption(preR.ctx, o2.tipeOpt, transform_langastType _)
          val r1: TPostResult[Context, org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(r0.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(tipeOpt = r0.resultOpt.getOrElse(o2.tipeOpt), attr = r1.resultOpt.getOrElse(o2.attr))))
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
    val o2: org.sireum.lang.ast.Exp = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.Exp] = pp.post_langastExp(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastLit(ctx: Context, o: org.sireum.lang.ast.Lit): TPostResult[Context, org.sireum.lang.ast.Lit] = {
    val preR: PreResult[Context, org.sireum.lang.ast.Lit] = pp.pre_langastLit(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.Lit] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Lit = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, org.sireum.lang.ast.Lit] = o2 match {
        case o2: org.sireum.lang.ast.Exp.LitB =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(preR.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(attr = r0.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r0.ctx, None())
        case o2: org.sireum.lang.ast.Exp.LitC =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(preR.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(attr = r0.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r0.ctx, None())
        case o2: org.sireum.lang.ast.Exp.LitZ =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(preR.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(attr = r0.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r0.ctx, None())
        case o2: org.sireum.lang.ast.Exp.LitF32 =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(preR.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(attr = r0.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r0.ctx, None())
        case o2: org.sireum.lang.ast.Exp.LitF64 =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(preR.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(attr = r0.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r0.ctx, None())
        case o2: org.sireum.lang.ast.Exp.LitR =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(preR.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(attr = r0.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r0.ctx, None())
        case o2: org.sireum.lang.ast.Exp.LitString =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(preR.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(attr = r0.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r0.ctx, None())
        case o2: org.sireum.lang.ast.Exp.LitStepId =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(preR.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(attr = r0.resultOpt.getOrElse(o2.attr))))
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
    val o2: org.sireum.lang.ast.Lit = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.Lit] = pp.post_langastLit(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastExpRef(ctx: Context, o: org.sireum.lang.ast.Exp.Ref): TPostResult[Context, org.sireum.lang.ast.Exp.Ref] = {
    val preR: PreResult[Context, org.sireum.lang.ast.Exp.Ref] = pp.pre_langastExpRef(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.Exp.Ref] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Exp.Ref = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, org.sireum.lang.ast.Exp.Ref] = o2 match {
        case o2: org.sireum.lang.ast.Exp.Ident =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Id] = transform_langastId(preR.ctx, o2.id)
          val r1: TPostResult[Context, org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(r0.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), attr = r1.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r1.ctx, None())
        case o2: org.sireum.lang.ast.Exp.Select =>
          val r0: TPostResult[Context, Option[org.sireum.lang.ast.Exp]] = transformOption(preR.ctx, o2.receiverOpt, transform_langastExp _)
          val r1: TPostResult[Context, org.sireum.lang.ast.Id] = transform_langastId(r0.ctx, o2.id)
          val r2: TPostResult[Context, IS[Z, org.sireum.lang.ast.Type]] = transformISZ(r1.ctx, o2.targs, transform_langastType _)
          val r3: TPostResult[Context, org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(r2.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(receiverOpt = r0.resultOpt.getOrElse(o2.receiverOpt), id = r1.resultOpt.getOrElse(o2.id), targs = r2.resultOpt.getOrElse(o2.targs), attr = r3.resultOpt.getOrElse(o2.attr))))
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
    val o2: org.sireum.lang.ast.Exp.Ref = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.Exp.Ref] = pp.post_langastExpRef(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastExpFunParam(ctx: Context, o: org.sireum.lang.ast.Exp.Fun.Param): TPostResult[Context, org.sireum.lang.ast.Exp.Fun.Param] = {
    val preR: PreResult[Context, org.sireum.lang.ast.Exp.Fun.Param] = pp.pre_langastExpFunParam(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.Exp.Fun.Param] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Exp.Fun.Param = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Option[org.sireum.lang.ast.Id]] = transformOption(preR.ctx, o2.idOpt, transform_langastId _)
      val r1: TPostResult[Context, Option[org.sireum.lang.ast.Type]] = transformOption(r0.ctx, o2.tipeOpt, transform_langastType _)
      val r2: TPostResult[Context, Option[org.sireum.lang.ast.Typed]] = transformOption(r1.ctx, o2.typedOpt, transform_langastTyped _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        TPostResult(r2.ctx, Some(o2(idOpt = r0.resultOpt.getOrElse(o2.idOpt), tipeOpt = r1.resultOpt.getOrElse(o2.tipeOpt), typedOpt = r2.resultOpt.getOrElse(o2.typedOpt))))
      else
        TPostResult(r2.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.Exp.Fun.Param = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.Exp.Fun.Param] = pp.post_langastExpFunParam(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastExpQuant(ctx: Context, o: org.sireum.lang.ast.Exp.Quant): TPostResult[Context, org.sireum.lang.ast.Exp.Quant] = {
    val preR: PreResult[Context, org.sireum.lang.ast.Exp.Quant] = pp.pre_langastExpQuant(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.Exp.Quant] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Exp.Quant = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, org.sireum.lang.ast.Exp.Quant] = o2 match {
        case o2: org.sireum.lang.ast.Exp.QuantType =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp.Fun] = transform_langastExpFun(preR.ctx, o2.fun)
          val r1: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r0.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(fun = r0.resultOpt.getOrElse(o2.fun), attr = r1.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r1.ctx, None())
        case o2: org.sireum.lang.ast.Exp.QuantRange =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(preR.ctx, o2.lo)
          val r1: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(r0.ctx, o2.hi)
          val r2: TPostResult[Context, org.sireum.lang.ast.Exp.Fun] = transform_langastExpFun(r1.ctx, o2.fun)
          val r3: TPostResult[Context, org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(r2.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(lo = r0.resultOpt.getOrElse(o2.lo), hi = r1.resultOpt.getOrElse(o2.hi), fun = r2.resultOpt.getOrElse(o2.fun), attr = r3.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r3.ctx, None())
        case o2: org.sireum.lang.ast.Exp.QuantEach =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(preR.ctx, o2.seq)
          val r1: TPostResult[Context, org.sireum.lang.ast.Exp.Fun] = transform_langastExpFun(r0.ctx, o2.fun)
          val r2: TPostResult[Context, org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(r1.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(seq = r0.resultOpt.getOrElse(o2.seq), fun = r1.resultOpt.getOrElse(o2.fun), attr = r2.resultOpt.getOrElse(o2.attr))))
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
    val o2: org.sireum.lang.ast.Exp.Quant = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.Exp.Quant] = pp.post_langastExpQuant(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastExpStateSeqFragment(ctx: Context, o: org.sireum.lang.ast.Exp.StateSeq.Fragment): TPostResult[Context, org.sireum.lang.ast.Exp.StateSeq.Fragment] = {
    val preR: PreResult[Context, org.sireum.lang.ast.Exp.StateSeq.Fragment] = pp.pre_langastExpStateSeqFragment(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.Exp.StateSeq.Fragment] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Exp.StateSeq.Fragment = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, org.sireum.lang.ast.Id] = transform_langastId(preR.ctx, o2.id)
      val r1: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(r0.ctx, o2.exp)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), exp = r1.resultOpt.getOrElse(o2.exp))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.Exp.StateSeq.Fragment = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.Exp.StateSeq.Fragment] = pp.post_langastExpStateSeqFragment(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastNamedArg(ctx: Context, o: org.sireum.lang.ast.NamedArg): TPostResult[Context, org.sireum.lang.ast.NamedArg] = {
    val preR: PreResult[Context, org.sireum.lang.ast.NamedArg] = pp.pre_langastNamedArg(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.NamedArg] = if (preR.continu) {
      val o2: org.sireum.lang.ast.NamedArg = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, org.sireum.lang.ast.Id] = transform_langastId(preR.ctx, o2.id)
      val r1: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(r0.ctx, o2.arg)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), arg = r1.resultOpt.getOrElse(o2.arg))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.NamedArg = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.NamedArg] = pp.post_langastNamedArg(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastId(ctx: Context, o: org.sireum.lang.ast.Id): TPostResult[Context, org.sireum.lang.ast.Id] = {
    val preR: PreResult[Context, org.sireum.lang.ast.Id] = pp.pre_langastId(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.Id] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Id = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(preR.ctx, o2.attr)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(attr = r0.resultOpt.getOrElse(o2.attr))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.Id = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.Id] = pp.post_langastId(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastName(ctx: Context, o: org.sireum.lang.ast.Name): TPostResult[Context, org.sireum.lang.ast.Name] = {
    val preR: PreResult[Context, org.sireum.lang.ast.Name] = pp.pre_langastName(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.Name] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Name = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, org.sireum.lang.ast.Id]] = transformISZ(preR.ctx, o2.ids, transform_langastId _)
      val r1: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r0.ctx, o2.attr)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(ids = r0.resultOpt.getOrElse(o2.ids), attr = r1.resultOpt.getOrElse(o2.attr))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.Name = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.Name] = pp.post_langastName(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastBody(ctx: Context, o: org.sireum.lang.ast.Body): TPostResult[Context, org.sireum.lang.ast.Body] = {
    val preR: PreResult[Context, org.sireum.lang.ast.Body] = pp.pre_langastBody(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.Body] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Body = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, org.sireum.lang.ast.Stmt]] = transformISZ(preR.ctx, o2.stmts, transform_langastStmt _)
      val r1: TPostResult[Context, IS[Z, org.sireum.lang.ast.ResolvedInfo.LocalVar]] = transformISZ(r0.ctx, o2.undecls, transform_langastResolvedInfoLocalVar _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(stmts = r0.resultOpt.getOrElse(o2.stmts), undecls = r1.resultOpt.getOrElse(o2.undecls))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.Body = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.Body] = pp.post_langastBody(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastAdtParam(ctx: Context, o: org.sireum.lang.ast.AdtParam): TPostResult[Context, org.sireum.lang.ast.AdtParam] = {
    val preR: PreResult[Context, org.sireum.lang.ast.AdtParam] = pp.pre_langastAdtParam(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.AdtParam] = if (preR.continu) {
      val o2: org.sireum.lang.ast.AdtParam = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, org.sireum.lang.ast.Id] = transform_langastId(preR.ctx, o2.id)
      val r1: TPostResult[Context, org.sireum.lang.ast.Type] = transform_langastType(r0.ctx, o2.tipe)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), tipe = r1.resultOpt.getOrElse(o2.tipe))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.AdtParam = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.AdtParam] = pp.post_langastAdtParam(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastMethodSig(ctx: Context, o: org.sireum.lang.ast.MethodSig): TPostResult[Context, org.sireum.lang.ast.MethodSig] = {
    val preR: PreResult[Context, org.sireum.lang.ast.MethodSig] = pp.pre_langastMethodSig(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.MethodSig] = if (preR.continu) {
      val o2: org.sireum.lang.ast.MethodSig = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, org.sireum.lang.ast.Id] = transform_langastId(preR.ctx, o2.id)
      val r1: TPostResult[Context, IS[Z, org.sireum.lang.ast.TypeParam]] = transformISZ(r0.ctx, o2.typeParams, transform_langastTypeParam _)
      val r2: TPostResult[Context, IS[Z, org.sireum.lang.ast.Param]] = transformISZ(r1.ctx, o2.params, transform_langastParam _)
      val r3: TPostResult[Context, org.sireum.lang.ast.Type] = transform_langastType(r2.ctx, o2.returnType)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
        TPostResult(r3.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), typeParams = r1.resultOpt.getOrElse(o2.typeParams), params = r2.resultOpt.getOrElse(o2.params), returnType = r3.resultOpt.getOrElse(o2.returnType))))
      else
        TPostResult(r3.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.MethodSig = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.MethodSig] = pp.post_langastMethodSig(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastParam(ctx: Context, o: org.sireum.lang.ast.Param): TPostResult[Context, org.sireum.lang.ast.Param] = {
    val preR: PreResult[Context, org.sireum.lang.ast.Param] = pp.pre_langastParam(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.Param] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Param = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, org.sireum.lang.ast.Id] = transform_langastId(preR.ctx, o2.id)
      val r1: TPostResult[Context, org.sireum.lang.ast.Type] = transform_langastType(r0.ctx, o2.tipe)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), tipe = r1.resultOpt.getOrElse(o2.tipe))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.Param = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.Param] = pp.post_langastParam(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastTypeParam(ctx: Context, o: org.sireum.lang.ast.TypeParam): TPostResult[Context, org.sireum.lang.ast.TypeParam] = {
    val preR: PreResult[Context, org.sireum.lang.ast.TypeParam] = pp.pre_langastTypeParam(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.TypeParam] = if (preR.continu) {
      val o2: org.sireum.lang.ast.TypeParam = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, org.sireum.lang.ast.Id] = transform_langastId(preR.ctx, o2.id)
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
    val o2: org.sireum.lang.ast.TypeParam = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.TypeParam] = pp.post_langastTypeParam(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastAttr(ctx: Context, o: org.sireum.lang.ast.Attr): TPostResult[Context, org.sireum.lang.ast.Attr] = {
    val preR: PreResult[Context, org.sireum.lang.ast.Attr] = pp.pre_langastAttr(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.Attr] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Attr = preR.resultOpt.getOrElse(o)
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
    val o2: org.sireum.lang.ast.Attr = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.Attr] = pp.post_langastAttr(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastTypedAttr(ctx: Context, o: org.sireum.lang.ast.TypedAttr): TPostResult[Context, org.sireum.lang.ast.TypedAttr] = {
    val preR: PreResult[Context, org.sireum.lang.ast.TypedAttr] = pp.pre_langastTypedAttr(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.TypedAttr] = if (preR.continu) {
      val o2: org.sireum.lang.ast.TypedAttr = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Option[org.sireum.lang.ast.Typed]] = transformOption(preR.ctx, o2.typedOpt, transform_langastTyped _)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(typedOpt = r0.resultOpt.getOrElse(o2.typedOpt))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.TypedAttr = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.TypedAttr] = pp.post_langastTypedAttr(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastResolvedAttr(ctx: Context, o: org.sireum.lang.ast.ResolvedAttr): TPostResult[Context, org.sireum.lang.ast.ResolvedAttr] = {
    val preR: PreResult[Context, org.sireum.lang.ast.ResolvedAttr] = pp.pre_langastResolvedAttr(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.ResolvedAttr] = if (preR.continu) {
      val o2: org.sireum.lang.ast.ResolvedAttr = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Option[org.sireum.lang.ast.ResolvedInfo]] = transformOption(preR.ctx, o2.resOpt, transform_langastResolvedInfo _)
      val r1: TPostResult[Context, Option[org.sireum.lang.ast.Typed]] = transformOption(r0.ctx, o2.typedOpt, transform_langastTyped _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(resOpt = r0.resultOpt.getOrElse(o2.resOpt), typedOpt = r1.resultOpt.getOrElse(o2.typedOpt))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.ResolvedAttr = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.ResolvedAttr] = pp.post_langastResolvedAttr(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastResolvedInfo(ctx: Context, o: org.sireum.lang.ast.ResolvedInfo): TPostResult[Context, org.sireum.lang.ast.ResolvedInfo] = {
    val preR: PreResult[Context, org.sireum.lang.ast.ResolvedInfo] = pp.pre_langastResolvedInfo(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.ResolvedInfo] = if (preR.continu) {
      val o2: org.sireum.lang.ast.ResolvedInfo = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, org.sireum.lang.ast.ResolvedInfo] = o2 match {
        case o2: org.sireum.lang.ast.ResolvedInfo.BuiltIn =>
          if (hasChanged)
            TPostResult(preR.ctx, Some(o2))
          else
            TPostResult(preR.ctx, None())
        case o2: org.sireum.lang.ast.ResolvedInfo.Package =>
          if (hasChanged)
            TPostResult(preR.ctx, Some(o2))
          else
            TPostResult(preR.ctx, None())
        case o2: org.sireum.lang.ast.ResolvedInfo.Enum =>
          if (hasChanged)
            TPostResult(preR.ctx, Some(o2))
          else
            TPostResult(preR.ctx, None())
        case o2: org.sireum.lang.ast.ResolvedInfo.EnumElement =>
          if (hasChanged)
            TPostResult(preR.ctx, Some(o2))
          else
            TPostResult(preR.ctx, None())
        case o2: org.sireum.lang.ast.ResolvedInfo.Object =>
          if (hasChanged)
            TPostResult(preR.ctx, Some(o2))
          else
            TPostResult(preR.ctx, None())
        case o2: org.sireum.lang.ast.ResolvedInfo.Var =>
          if (hasChanged)
            TPostResult(preR.ctx, Some(o2))
          else
            TPostResult(preR.ctx, None())
        case o2: org.sireum.lang.ast.ResolvedInfo.Method =>
          val r0: TPostResult[Context, Option[org.sireum.lang.ast.Typed.Fun]] = transformOption(preR.ctx, o2.tpeOpt, transform_langastTypedFun _)
          val r1: TPostResult[Context, IS[Z, org.sireum.lang.ast.ResolvedInfo]] = transformISZ(r0.ctx, o2.reads, transform_langastResolvedInfo _)
          val r2: TPostResult[Context, IS[Z, org.sireum.lang.ast.ResolvedInfo]] = transformISZ(r1.ctx, o2.writes, transform_langastResolvedInfo _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(tpeOpt = r0.resultOpt.getOrElse(o2.tpeOpt), reads = r1.resultOpt.getOrElse(o2.reads), writes = r2.resultOpt.getOrElse(o2.writes))))
          else
            TPostResult(r2.ctx, None())
        case o2: org.sireum.lang.ast.ResolvedInfo.Methods =>
          val r0: TPostResult[Context, IS[Z, org.sireum.lang.ast.ResolvedInfo.Method]] = transformISZ(preR.ctx, o2.methods, transform_langastResolvedInfoMethod _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(methods = r0.resultOpt.getOrElse(o2.methods))))
          else
            TPostResult(r0.ctx, None())
        case o2: org.sireum.lang.ast.ResolvedInfo.Tuple =>
          if (hasChanged)
            TPostResult(preR.ctx, Some(o2))
          else
            TPostResult(preR.ctx, None())
        case o2: org.sireum.lang.ast.ResolvedInfo.LocalVar =>
          if (hasChanged)
            TPostResult(preR.ctx, Some(o2))
          else
            TPostResult(preR.ctx, None())
        case o2: org.sireum.lang.ast.ResolvedInfo.Fact =>
          if (hasChanged)
            TPostResult(preR.ctx, Some(o2))
          else
            TPostResult(preR.ctx, None())
        case o2: org.sireum.lang.ast.ResolvedInfo.Theorem =>
          if (hasChanged)
            TPostResult(preR.ctx, Some(o2))
          else
            TPostResult(preR.ctx, None())
        case o2: org.sireum.lang.ast.ResolvedInfo.Inv =>
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
    val o2: org.sireum.lang.ast.ResolvedInfo = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.ResolvedInfo] = pp.post_langastResolvedInfo(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastTruthTableRow(ctx: Context, o: org.sireum.lang.ast.TruthTable.Row): TPostResult[Context, org.sireum.lang.ast.TruthTable.Row] = {
    val preR: PreResult[Context, org.sireum.lang.ast.TruthTable.Row] = pp.pre_langastTruthTableRow(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.TruthTable.Row] = if (preR.continu) {
      val o2: org.sireum.lang.ast.TruthTable.Row = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, org.sireum.lang.ast.TruthTable.Assignment] = transform_langastTruthTableAssignment(preR.ctx, o2.assignment)
      val r1: TPostResult[Context, org.sireum.lang.ast.TruthTable.Assignment] = transform_langastTruthTableAssignment(r0.ctx, o2.values)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(assignment = r0.resultOpt.getOrElse(o2.assignment), values = r1.resultOpt.getOrElse(o2.values))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.TruthTable.Row = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.TruthTable.Row] = pp.post_langastTruthTableRow(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastTruthTableAssignment(ctx: Context, o: org.sireum.lang.ast.TruthTable.Assignment): TPostResult[Context, org.sireum.lang.ast.TruthTable.Assignment] = {
    val preR: PreResult[Context, org.sireum.lang.ast.TruthTable.Assignment] = pp.pre_langastTruthTableAssignment(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.TruthTable.Assignment] = if (preR.continu) {
      val o2: org.sireum.lang.ast.TruthTable.Assignment = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, org.sireum.lang.ast.Exp.LitB]] = transformISZ(preR.ctx, o2.values, transform_langastExpLitB _)
      val r1: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r0.ctx, o2.attr)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(values = r0.resultOpt.getOrElse(o2.values), attr = r1.resultOpt.getOrElse(o2.attr))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.TruthTable.Assignment = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.TruthTable.Assignment] = pp.post_langastTruthTableAssignment(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastTruthTableConclusion(ctx: Context, o: org.sireum.lang.ast.TruthTable.Conclusion): TPostResult[Context, org.sireum.lang.ast.TruthTable.Conclusion] = {
    val preR: PreResult[Context, org.sireum.lang.ast.TruthTable.Conclusion] = pp.pre_langastTruthTableConclusion(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.TruthTable.Conclusion] = if (preR.continu) {
      val o2: org.sireum.lang.ast.TruthTable.Conclusion = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, org.sireum.lang.ast.TruthTable.Conclusion] = o2 match {
        case o2: org.sireum.lang.ast.TruthTable.Conclusion.Validity =>
          val r0: TPostResult[Context, IS[Z, org.sireum.lang.ast.TruthTable.Assignment]] = transformISZ(preR.ctx, o2.assignments, transform_langastTruthTableAssignment _)
          val r1: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r0.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(assignments = r0.resultOpt.getOrElse(o2.assignments), attr = r1.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r1.ctx, None())
        case o2: org.sireum.lang.ast.TruthTable.Conclusion.Tautology =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(preR.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(attr = r0.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r0.ctx, None())
        case o2: org.sireum.lang.ast.TruthTable.Conclusion.Contradictory =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(preR.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(attr = r0.resultOpt.getOrElse(o2.attr))))
          else
            TPostResult(r0.ctx, None())
        case o2: org.sireum.lang.ast.TruthTable.Conclusion.Contingent =>
          val r0: TPostResult[Context, IS[Z, org.sireum.lang.ast.TruthTable.Assignment]] = transformISZ(preR.ctx, o2.trueAssignments, transform_langastTruthTableAssignment _)
          val r1: TPostResult[Context, IS[Z, org.sireum.lang.ast.TruthTable.Assignment]] = transformISZ(r0.ctx, o2.falseAssignments, transform_langastTruthTableAssignment _)
          val r2: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r1.ctx, o2.attr)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(trueAssignments = r0.resultOpt.getOrElse(o2.trueAssignments), falseAssignments = r1.resultOpt.getOrElse(o2.falseAssignments), attr = r2.resultOpt.getOrElse(o2.attr))))
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
    val o2: org.sireum.lang.ast.TruthTable.Conclusion = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.TruthTable.Conclusion] = pp.post_langastTruthTableConclusion(r.ctx, o2)
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

  @pure def transform_langastTyped(ctx: Context, o: org.sireum.lang.ast.Typed): TPostResult[Context, org.sireum.lang.ast.Typed] = {
    val preR: PreResult[Context, org.sireum.lang.ast.Typed] = pp.pre_langastTyped(ctx, o)
    val r: TPostResult[Context, org.sireum.lang.ast.Typed] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Typed = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, org.sireum.lang.ast.Typed] = o2 match {
        case o2: org.sireum.lang.ast.Typed.Name =>
          val r0: TPostResult[Context, IS[Z, org.sireum.lang.ast.Typed]] = transformISZ(preR.ctx, o2.args, transform_langastTyped _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(args = r0.resultOpt.getOrElse(o2.args))))
          else
            TPostResult(r0.ctx, None())
        case o2: org.sireum.lang.ast.Typed.Tuple =>
          val r0: TPostResult[Context, IS[Z, org.sireum.lang.ast.Typed]] = transformISZ(preR.ctx, o2.args, transform_langastTyped _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(args = r0.resultOpt.getOrElse(o2.args))))
          else
            TPostResult(r0.ctx, None())
        case o2: org.sireum.lang.ast.Typed.Fun =>
          val r0: TPostResult[Context, IS[Z, org.sireum.lang.ast.Typed]] = transformISZ(preR.ctx, o2.args, transform_langastTyped _)
          val r1: TPostResult[Context, org.sireum.lang.ast.Typed] = transform_langastTyped(r0.ctx, o2.ret)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(args = r0.resultOpt.getOrElse(o2.args), ret = r1.resultOpt.getOrElse(o2.ret))))
          else
            TPostResult(r1.ctx, None())
        case o2: org.sireum.lang.ast.Typed.TypeVar =>
          if (hasChanged)
            TPostResult(preR.ctx, Some(o2))
          else
            TPostResult(preR.ctx, None())
        case o2: org.sireum.lang.ast.Typed.Package =>
          if (hasChanged)
            TPostResult(preR.ctx, Some(o2))
          else
            TPostResult(preR.ctx, None())
        case o2: org.sireum.lang.ast.Typed.Object =>
          if (hasChanged)
            TPostResult(preR.ctx, Some(o2))
          else
            TPostResult(preR.ctx, None())
        case o2: org.sireum.lang.ast.Typed.Enum =>
          if (hasChanged)
            TPostResult(preR.ctx, Some(o2))
          else
            TPostResult(preR.ctx, None())
        case o2: org.sireum.lang.ast.Typed.Method =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Typed.Fun] = transform_langastTypedFun(preR.ctx, o2.tpe)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(tpe = r0.resultOpt.getOrElse(o2.tpe))))
          else
            TPostResult(r0.ctx, None())
        case o2: org.sireum.lang.ast.Typed.Methods =>
          val r0: TPostResult[Context, IS[Z, org.sireum.lang.ast.Typed.Method]] = transformISZ(preR.ctx, o2.methods, transform_langastTypedMethod _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(methods = r0.resultOpt.getOrElse(o2.methods))))
          else
            TPostResult(r0.ctx, None())
        case o2: org.sireum.lang.ast.Typed.Fact =>
          if (hasChanged)
            TPostResult(preR.ctx, Some(o2))
          else
            TPostResult(preR.ctx, None())
        case o2: org.sireum.lang.ast.Typed.Theorem =>
          if (hasChanged)
            TPostResult(preR.ctx, Some(o2))
          else
            TPostResult(preR.ctx, None())
        case o2: org.sireum.lang.ast.Typed.Inv =>
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
    val o2: org.sireum.lang.ast.Typed = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.Typed] = pp.post_langastTyped(r.ctx, o2)
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
          val r1: TPostResult[Context, IS[Z, GclMethod]] = transformISZ(r0.ctx, o2.methods, transformGclMethod _)
          val r2: TPostResult[Context, IS[Z, GclInvariant]] = transformISZ(r1.ctx, o2.invariants, transformGclInvariant _)
          val r3: TPostResult[Context, Option[GclInitialize]] = transformOption(r2.ctx, o2.initializes, transformGclInitialize _)
          val r4: TPostResult[Context, Option[GclIntegration]] = transformOption(r3.ctx, o2.integration, transformGclIntegration _)
          val r5: TPostResult[Context, Option[GclCompute]] = transformOption(r4.ctx, o2.compute, transformGclCompute _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty || r5.resultOpt.nonEmpty)
            TPostResult(r5.ctx, Some(o2(state = r0.resultOpt.getOrElse(o2.state), methods = r1.resultOpt.getOrElse(o2.methods), invariants = r2.resultOpt.getOrElse(o2.invariants), initializes = r3.resultOpt.getOrElse(o2.initializes), integration = r4.resultOpt.getOrElse(o2.integration), compute = r5.resultOpt.getOrElse(o2.compute))))
          else
            TPostResult(r5.ctx, None())
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
        case o2: GclLib =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.containingPackage)
          val r1: TPostResult[Context, IS[Z, GclMethod]] = transformISZ(r0.ctx, o2.methods, transformGclMethod _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(containingPackage = r0.resultOpt.getOrElse(o2.containingPackage), methods = r1.resultOpt.getOrElse(o2.methods))))
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

  @pure def transformGclSymbol(ctx: Context, o: GclSymbol): TPostResult[Context, GclSymbol] = {
    val preR: PreResult[Context, GclSymbol] = pp.preGclSymbol(ctx, o)
    val r: TPostResult[Context, GclSymbol] = if (preR.continu) {
      val o2: GclSymbol = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, GclSymbol] = o2 match {
        case o2: GclSubclause =>
          val r0: TPostResult[Context, IS[Z, GclStateVar]] = transformISZ(preR.ctx, o2.state, transformGclStateVar _)
          val r1: TPostResult[Context, IS[Z, GclMethod]] = transformISZ(r0.ctx, o2.methods, transformGclMethod _)
          val r2: TPostResult[Context, IS[Z, GclInvariant]] = transformISZ(r1.ctx, o2.invariants, transformGclInvariant _)
          val r3: TPostResult[Context, Option[GclInitialize]] = transformOption(r2.ctx, o2.initializes, transformGclInitialize _)
          val r4: TPostResult[Context, Option[GclIntegration]] = transformOption(r3.ctx, o2.integration, transformGclIntegration _)
          val r5: TPostResult[Context, Option[GclCompute]] = transformOption(r4.ctx, o2.compute, transformGclCompute _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty || r5.resultOpt.nonEmpty)
            TPostResult(r5.ctx, Some(o2(state = r0.resultOpt.getOrElse(o2.state), methods = r1.resultOpt.getOrElse(o2.methods), invariants = r2.resultOpt.getOrElse(o2.invariants), initializes = r3.resultOpt.getOrElse(o2.initializes), integration = r4.resultOpt.getOrElse(o2.integration), compute = r5.resultOpt.getOrElse(o2.compute))))
          else
            TPostResult(r5.ctx, None())
        case o2: GclMethod =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Stmt.Method] = transform_langastStmtMethod(preR.ctx, o2.method)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(method = r0.resultOpt.getOrElse(o2.method))))
          else
            TPostResult(r0.ctx, None())
        case o2: GclStateVar =>
          if (hasChanged)
            TPostResult(preR.ctx, Some(o2))
          else
            TPostResult(preR.ctx, None())
        case o2: GclInvariant =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(preR.ctx, o2.exp)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(exp = r0.resultOpt.getOrElse(o2.exp))))
          else
            TPostResult(r0.ctx, None())
        case o2: GclAssume =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(preR.ctx, o2.exp)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(exp = r0.resultOpt.getOrElse(o2.exp))))
          else
            TPostResult(r0.ctx, None())
        case o2: GclGuarantee =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(preR.ctx, o2.exp)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(exp = r0.resultOpt.getOrElse(o2.exp))))
          else
            TPostResult(r0.ctx, None())
        case o2: GclIntegration =>
          val r0: TPostResult[Context, IS[Z, GclSpec]] = transformISZ(preR.ctx, o2.specs, transformGclSpec _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(specs = r0.resultOpt.getOrElse(o2.specs))))
          else
            TPostResult(r0.ctx, None())
        case o2: GclCaseStatement =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(preR.ctx, o2.assumes)
          val r1: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(r0.ctx, o2.guarantees)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(assumes = r0.resultOpt.getOrElse(o2.assumes), guarantees = r1.resultOpt.getOrElse(o2.guarantees))))
          else
            TPostResult(r1.ctx, None())
        case o2: GclInitialize =>
          val r0: TPostResult[Context, IS[Z, org.sireum.lang.ast.Exp]] = transformISZ(preR.ctx, o2.modifies, transform_langastExp _)
          val r1: TPostResult[Context, IS[Z, GclGuarantee]] = transformISZ(r0.ctx, o2.guarantees, transformGclGuarantee _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(modifies = r0.resultOpt.getOrElse(o2.modifies), guarantees = r1.resultOpt.getOrElse(o2.guarantees))))
          else
            TPostResult(r1.ctx, None())
        case o2: GclCompute =>
          val r0: TPostResult[Context, IS[Z, org.sireum.lang.ast.Exp]] = transformISZ(preR.ctx, o2.modifies, transform_langastExp _)
          val r1: TPostResult[Context, IS[Z, GclComputeSpec]] = transformISZ(r0.ctx, o2.specs, transformGclComputeSpec _)
          val r2: TPostResult[Context, IS[Z, GclCaseStatement]] = transformISZ(r1.ctx, o2.cases, transformGclCaseStatement _)
          val r3: TPostResult[Context, IS[Z, GclHandle]] = transformISZ(r2.ctx, o2.handlers, transformGclHandle _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(modifies = r0.resultOpt.getOrElse(o2.modifies), specs = r1.resultOpt.getOrElse(o2.specs), cases = r2.resultOpt.getOrElse(o2.cases), handlers = r3.resultOpt.getOrElse(o2.handlers))))
          else
            TPostResult(r3.ctx, None())
        case o2: GclHandle =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(preR.ctx, o2.port)
          val r1: TPostResult[Context, IS[Z, org.sireum.lang.ast.Exp]] = transformISZ(r0.ctx, o2.modifies, transform_langastExp _)
          val r2: TPostResult[Context, IS[Z, GclGuarantee]] = transformISZ(r1.ctx, o2.guarantees, transformGclGuarantee _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(port = r0.resultOpt.getOrElse(o2.port), modifies = r1.resultOpt.getOrElse(o2.modifies), guarantees = r2.resultOpt.getOrElse(o2.guarantees))))
          else
            TPostResult(r2.ctx, None())
        case o2: GclTODO =>
          if (hasChanged)
            TPostResult(preR.ctx, Some(o2))
          else
            TPostResult(preR.ctx, None())
        case o2: GclLib =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.containingPackage)
          val r1: TPostResult[Context, IS[Z, GclMethod]] = transformISZ(r0.ctx, o2.methods, transformGclMethod _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(containingPackage = r0.resultOpt.getOrElse(o2.containingPackage), methods = r1.resultOpt.getOrElse(o2.methods))))
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
    val o2: GclSymbol = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, GclSymbol] = pp.postGclSymbol(r.ctx, o2)
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
      val r1: TPostResult[Context, IS[Z, GclMethod]] = transformISZ(r0.ctx, o2.methods, transformGclMethod _)
      val r2: TPostResult[Context, IS[Z, GclInvariant]] = transformISZ(r1.ctx, o2.invariants, transformGclInvariant _)
      val r3: TPostResult[Context, Option[GclInitialize]] = transformOption(r2.ctx, o2.initializes, transformGclInitialize _)
      val r4: TPostResult[Context, Option[GclIntegration]] = transformOption(r3.ctx, o2.integration, transformGclIntegration _)
      val r5: TPostResult[Context, Option[GclCompute]] = transformOption(r4.ctx, o2.compute, transformGclCompute _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty || r5.resultOpt.nonEmpty)
        TPostResult(r5.ctx, Some(o2(state = r0.resultOpt.getOrElse(o2.state), methods = r1.resultOpt.getOrElse(o2.methods), invariants = r2.resultOpt.getOrElse(o2.invariants), initializes = r3.resultOpt.getOrElse(o2.initializes), integration = r4.resultOpt.getOrElse(o2.integration), compute = r5.resultOpt.getOrElse(o2.compute))))
      else
        TPostResult(r5.ctx, None())
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

  @pure def transformGclMethod(ctx: Context, o: GclMethod): TPostResult[Context, GclMethod] = {
    val preR: PreResult[Context, GclMethod] = pp.preGclMethod(ctx, o)
    val r: TPostResult[Context, GclMethod] = if (preR.continu) {
      val o2: GclMethod = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, org.sireum.lang.ast.Stmt.Method] = transform_langastStmtMethod(preR.ctx, o2.method)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(method = r0.resultOpt.getOrElse(o2.method))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: GclMethod = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, GclMethod] = pp.postGclMethod(r.ctx, o2)
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

  @pure def transformGclSpec(ctx: Context, o: GclSpec): TPostResult[Context, GclSpec] = {
    val preR: PreResult[Context, GclSpec] = pp.preGclSpec(ctx, o)
    val r: TPostResult[Context, GclSpec] = if (preR.continu) {
      val o2: GclSpec = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, GclSpec] = o2 match {
        case o2: GclInvariant =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(preR.ctx, o2.exp)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(exp = r0.resultOpt.getOrElse(o2.exp))))
          else
            TPostResult(r0.ctx, None())
        case o2: GclAssume =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(preR.ctx, o2.exp)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(exp = r0.resultOpt.getOrElse(o2.exp))))
          else
            TPostResult(r0.ctx, None())
        case o2: GclGuarantee =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(preR.ctx, o2.exp)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(exp = r0.resultOpt.getOrElse(o2.exp))))
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
    val o2: GclSpec = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, GclSpec] = pp.postGclSpec(r.ctx, o2)
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
      val r0: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(preR.ctx, o2.exp)
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

  @pure def transformGclComputeSpec(ctx: Context, o: GclComputeSpec): TPostResult[Context, GclComputeSpec] = {
    val preR: PreResult[Context, GclComputeSpec] = pp.preGclComputeSpec(ctx, o)
    val r: TPostResult[Context, GclComputeSpec] = if (preR.continu) {
      val o2: GclComputeSpec = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: TPostResult[Context, GclComputeSpec] = o2 match {
        case o2: GclAssume =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(preR.ctx, o2.exp)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(exp = r0.resultOpt.getOrElse(o2.exp))))
          else
            TPostResult(r0.ctx, None())
        case o2: GclGuarantee =>
          val r0: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(preR.ctx, o2.exp)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(exp = r0.resultOpt.getOrElse(o2.exp))))
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
    val o2: GclComputeSpec = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, GclComputeSpec] = pp.postGclComputeSpec(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformGclAssume(ctx: Context, o: GclAssume): TPostResult[Context, GclAssume] = {
    val preR: PreResult[Context, GclAssume] = pp.preGclAssume(ctx, o)
    val r: TPostResult[Context, GclAssume] = if (preR.continu) {
      val o2: GclAssume = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(preR.ctx, o2.exp)
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
    val o2: GclAssume = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, GclAssume] = pp.postGclAssume(r.ctx, o2)
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
      val r0: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(preR.ctx, o2.exp)
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
      val r0: TPostResult[Context, IS[Z, GclSpec]] = transformISZ(preR.ctx, o2.specs, transformGclSpec _)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(specs = r0.resultOpt.getOrElse(o2.specs))))
      else
        TPostResult(r0.ctx, None())
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

  @pure def transformGclCaseStatement(ctx: Context, o: GclCaseStatement): TPostResult[Context, GclCaseStatement] = {
    val preR: PreResult[Context, GclCaseStatement] = pp.preGclCaseStatement(ctx, o)
    val r: TPostResult[Context, GclCaseStatement] = if (preR.continu) {
      val o2: GclCaseStatement = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(preR.ctx, o2.assumes)
      val r1: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(r0.ctx, o2.guarantees)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(assumes = r0.resultOpt.getOrElse(o2.assumes), guarantees = r1.resultOpt.getOrElse(o2.guarantees))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: GclCaseStatement = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, GclCaseStatement] = pp.postGclCaseStatement(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformGclInitialize(ctx: Context, o: GclInitialize): TPostResult[Context, GclInitialize] = {
    val preR: PreResult[Context, GclInitialize] = pp.preGclInitialize(ctx, o)
    val r: TPostResult[Context, GclInitialize] = if (preR.continu) {
      val o2: GclInitialize = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, org.sireum.lang.ast.Exp]] = transformISZ(preR.ctx, o2.modifies, transform_langastExp _)
      val r1: TPostResult[Context, IS[Z, GclGuarantee]] = transformISZ(r0.ctx, o2.guarantees, transformGclGuarantee _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(modifies = r0.resultOpt.getOrElse(o2.modifies), guarantees = r1.resultOpt.getOrElse(o2.guarantees))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: GclInitialize = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, GclInitialize] = pp.postGclInitialize(r.ctx, o2)
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
      val r0: TPostResult[Context, IS[Z, org.sireum.lang.ast.Exp]] = transformISZ(preR.ctx, o2.modifies, transform_langastExp _)
      val r1: TPostResult[Context, IS[Z, GclComputeSpec]] = transformISZ(r0.ctx, o2.specs, transformGclComputeSpec _)
      val r2: TPostResult[Context, IS[Z, GclCaseStatement]] = transformISZ(r1.ctx, o2.cases, transformGclCaseStatement _)
      val r3: TPostResult[Context, IS[Z, GclHandle]] = transformISZ(r2.ctx, o2.handlers, transformGclHandle _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
        TPostResult(r3.ctx, Some(o2(modifies = r0.resultOpt.getOrElse(o2.modifies), specs = r1.resultOpt.getOrElse(o2.specs), cases = r2.resultOpt.getOrElse(o2.cases), handlers = r3.resultOpt.getOrElse(o2.handlers))))
      else
        TPostResult(r3.ctx, None())
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

  @pure def transformGclHandle(ctx: Context, o: GclHandle): TPostResult[Context, GclHandle] = {
    val preR: PreResult[Context, GclHandle] = pp.preGclHandle(ctx, o)
    val r: TPostResult[Context, GclHandle] = if (preR.continu) {
      val o2: GclHandle = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(preR.ctx, o2.port)
      val r1: TPostResult[Context, IS[Z, org.sireum.lang.ast.Exp]] = transformISZ(r0.ctx, o2.modifies, transform_langastExp _)
      val r2: TPostResult[Context, IS[Z, GclGuarantee]] = transformISZ(r1.ctx, o2.guarantees, transformGclGuarantee _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        TPostResult(r2.ctx, Some(o2(port = r0.resultOpt.getOrElse(o2.port), modifies = r1.resultOpt.getOrElse(o2.modifies), guarantees = r2.resultOpt.getOrElse(o2.guarantees))))
      else
        TPostResult(r2.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: GclHandle = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, GclHandle] = pp.postGclHandle(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformGclTODO(ctx: Context, o: GclTODO): TPostResult[Context, GclTODO] = {
    val preR: PreResult[Context, GclTODO] = pp.preGclTODO(ctx, o)
    val r: TPostResult[Context, GclTODO] = if (preR.continu) {
      val o2: GclTODO = preR.resultOpt.getOrElse(o)
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
    val o2: GclTODO = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, GclTODO] = pp.postGclTODO(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformGclLib(ctx: Context, o: GclLib): TPostResult[Context, GclLib] = {
    val preR: PreResult[Context, GclLib] = pp.preGclLib(ctx, o)
    val r: TPostResult[Context, GclLib] = if (preR.continu) {
      val o2: GclLib = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.containingPackage)
      val r1: TPostResult[Context, IS[Z, GclMethod]] = transformISZ(r0.ctx, o2.methods, transformGclMethod _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(containingPackage = r0.resultOpt.getOrElse(o2.containingPackage), methods = r1.resultOpt.getOrElse(o2.methods))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: GclLib = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, GclLib] = pp.postGclLib(r.ctx, o2)
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
        case o2: BTSEnumerationType =>
          if (hasChanged)
            TPostResult(preR.ctx, Some(o2))
          else
            TPostResult(preR.ctx, None())
        case o2: BTSQuantityType =>
          val r0: TPostResult[Context, Option[ValueProp]] = transformOption(preR.ctx, o2.representation, transformValueProp _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(representation = r0.resultOpt.getOrElse(o2.representation))))
          else
            TPostResult(r0.ctx, None())
        case o2: BTSArrayType =>
          val r0: TPostResult[Context, IS[Z, BTSArrayRange]] = transformISZ(preR.ctx, o2.range, transformBTSArrayRange _)
          val r1: TPostResult[Context, BTSType] = transformBTSType(r0.ctx, o2.typ)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(range = r0.resultOpt.getOrElse(o2.range), typ = r1.resultOpt.getOrElse(o2.typ))))
          else
            TPostResult(r1.ctx, None())
        case o2: BTSRecordType =>
          val r0: TPostResult[Context, IS[Z, BTSRecordField]] = transformISZ(preR.ctx, o2.fields, transformBTSRecordField _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(fields = r0.resultOpt.getOrElse(o2.fields))))
          else
            TPostResult(r0.ctx, None())
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

  @pure def transformBTSEnumerationType(ctx: Context, o: BTSEnumerationType): TPostResult[Context, BTSEnumerationType] = {
    val preR: PreResult[Context, BTSEnumerationType] = pp.preBTSEnumerationType(ctx, o)
    val r: TPostResult[Context, BTSEnumerationType] = if (preR.continu) {
      val o2: BTSEnumerationType = preR.resultOpt.getOrElse(o)
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
      val r0: TPostResult[Context, Option[ValueProp]] = transformOption(preR.ctx, o2.representation, transformValueProp _)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(representation = r0.resultOpt.getOrElse(o2.representation))))
      else
        TPostResult(r0.ctx, None())
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
      val r0: TPostResult[Context, IS[Z, BTSArrayRange]] = transformISZ(preR.ctx, o2.range, transformBTSArrayRange _)
      val r1: TPostResult[Context, BTSType] = transformBTSType(r0.ctx, o2.typ)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(range = r0.resultOpt.getOrElse(o2.range), typ = r1.resultOpt.getOrElse(o2.typ))))
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
      val r0: TPostResult[Context, BTSType] = transformBTSType(preR.ctx, o2.typ)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(typ = r0.resultOpt.getOrElse(o2.typ))))
      else
        TPostResult(r0.ctx, None())
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
          val r0: TPostResult[Context, BTSTriggerLogicalExpression] = transformBTSTriggerLogicalExpression(preR.ctx, o2.tle)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(tle = r0.resultOpt.getOrElse(o2.tle))))
          else
            TPostResult(r0.ctx, None())
        case o2: BTSInternalCondition =>
          val r0: TPostResult[Context, IS[Z, Name]] = transformISZ(preR.ctx, o2.ports, transformName _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(ports = r0.resultOpt.getOrElse(o2.ports))))
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
      val r0: TPostResult[Context, IS[Z, BTSEventTrigger]] = transformISZ(preR.ctx, o2.trigger, transformBTSEventTrigger _)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(trigger = r0.resultOpt.getOrElse(o2.trigger))))
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
      val r0: TPostResult[Context, Option[Name]] = transformOption(preR.ctx, o2.port, transformName _)
      val r1: TPostResult[Context, Option[BTSTriggerLogicalExpression]] = transformOption(r0.ctx, o2.tle, transformBTSTriggerLogicalExpression _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(port = r0.resultOpt.getOrElse(o2.port), tle = r1.resultOpt.getOrElse(o2.tle))))
      else
        TPostResult(r1.ctx, None())
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

  @pure def transformBTSInternalCondition(ctx: Context, o: BTSInternalCondition): TPostResult[Context, BTSInternalCondition] = {
    val preR: PreResult[Context, BTSInternalCondition] = pp.preBTSInternalCondition(ctx, o)
    val r: TPostResult[Context, BTSInternalCondition] = if (preR.continu) {
      val o2: BTSInternalCondition = preR.resultOpt.getOrElse(o)
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
          val r0: TPostResult[Context, IS[Z, BTSVariable]] = transformISZ(preR.ctx, o2.formals, transformBTSVariable _)
          val r1: TPostResult[Context, Option[BTSExp]] = transformOption(r0.ctx, o2.predicate, transformBTSExp _)
          val r2: TPostResult[Context, Option[BTSType]] = transformOption(r1.ctx, o2.returns, transformBTSType _)
          val r3: TPostResult[Context, Option[BTSAssertionFunctionValue]] = transformOption(r2.ctx, o2.functionvalue, transformBTSAssertionFunctionValue _)
          val r4: TPostResult[Context, Option[BTSEnumerationType]] = transformOption(r3.ctx, o2.enumerationType, transformBTSEnumerationType _)
          val r5: TPostResult[Context, Option[BTSAssertionEnumeration]] = transformOption(r4.ctx, o2.enumeration, transformBTSAssertionEnumeration _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty || r5.resultOpt.nonEmpty)
            TPostResult(r5.ctx, Some(o2(formals = r0.resultOpt.getOrElse(o2.formals), predicate = r1.resultOpt.getOrElse(o2.predicate), returns = r2.resultOpt.getOrElse(o2.returns), functionvalue = r3.resultOpt.getOrElse(o2.functionvalue), enumerationType = r4.resultOpt.getOrElse(o2.enumerationType), enumeration = r5.resultOpt.getOrElse(o2.enumeration))))
          else
            TPostResult(r5.ctx, None())
        case o2: BTSNamelessAssertion =>
          val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.predicate)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(predicate = r0.resultOpt.getOrElse(o2.predicate))))
          else
            TPostResult(r0.ctx, None())
        case o2: BTSNamelessFunction =>
          val r0: TPostResult[Context, BTSType] = transformBTSType(preR.ctx, o2.tod)
          val r1: TPostResult[Context, BTSAssertionFunctionValue] = transformBTSAssertionFunctionValue(r0.ctx, o2.functionvalue)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(tod = r0.resultOpt.getOrElse(o2.tod), functionvalue = r1.resultOpt.getOrElse(o2.functionvalue))))
          else
            TPostResult(r1.ctx, None())
        case o2: BTSNamelessEnumeration =>
          val r0: TPostResult[Context, BTSInvocation] = transformBTSInvocation(preR.ctx, o2.enumberation)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(enumberation = r0.resultOpt.getOrElse(o2.enumberation))))
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
      val r0: TPostResult[Context, IS[Z, BTSVariable]] = transformISZ(preR.ctx, o2.formals, transformBTSVariable _)
      val r1: TPostResult[Context, Option[BTSExp]] = transformOption(r0.ctx, o2.predicate, transformBTSExp _)
      val r2: TPostResult[Context, Option[BTSType]] = transformOption(r1.ctx, o2.returns, transformBTSType _)
      val r3: TPostResult[Context, Option[BTSAssertionFunctionValue]] = transformOption(r2.ctx, o2.functionvalue, transformBTSAssertionFunctionValue _)
      val r4: TPostResult[Context, Option[BTSEnumerationType]] = transformOption(r3.ctx, o2.enumerationType, transformBTSEnumerationType _)
      val r5: TPostResult[Context, Option[BTSAssertionEnumeration]] = transformOption(r4.ctx, o2.enumeration, transformBTSAssertionEnumeration _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty || r5.resultOpt.nonEmpty)
        TPostResult(r5.ctx, Some(o2(formals = r0.resultOpt.getOrElse(o2.formals), predicate = r1.resultOpt.getOrElse(o2.predicate), returns = r2.resultOpt.getOrElse(o2.returns), functionvalue = r3.resultOpt.getOrElse(o2.functionvalue), enumerationType = r4.resultOpt.getOrElse(o2.enumerationType), enumeration = r5.resultOpt.getOrElse(o2.enumeration))))
      else
        TPostResult(r5.ctx, None())
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

  @pure def transformBTSVariable(ctx: Context, o: BTSVariable): TPostResult[Context, BTSVariable] = {
    val preR: PreResult[Context, BTSVariable] = pp.preBTSVariable(ctx, o)
    val r: TPostResult[Context, BTSVariable] = if (preR.continu) {
      val o2: BTSVariable = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, BTSType] = transformBTSType(preR.ctx, o2.typ)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(typ = r0.resultOpt.getOrElse(o2.typ))))
      else
        TPostResult(r0.ctx, None())
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

  @pure def transformBTSAssertionFunctionValue(ctx: Context, o: BTSAssertionFunctionValue): TPostResult[Context, BTSAssertionFunctionValue] = {
    val preR: PreResult[Context, BTSAssertionFunctionValue] = pp.preBTSAssertionFunctionValue(ctx, o)
    val r: TPostResult[Context, BTSAssertionFunctionValue] = if (preR.continu) {
      val o2: BTSAssertionFunctionValue = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, BTSConditionValuePair]] = transformISZ(preR.ctx, o2.cexp, transformBTSConditionValuePair _)
      val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.pexp)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(cexp = r0.resultOpt.getOrElse(o2.cexp), pexp = r1.resultOpt.getOrElse(o2.pexp))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSAssertionFunctionValue = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSAssertionFunctionValue] = pp.postBTSAssertionFunctionValue(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSConditionValuePair(ctx: Context, o: BTSConditionValuePair): TPostResult[Context, BTSConditionValuePair] = {
    val preR: PreResult[Context, BTSConditionValuePair] = pp.preBTSConditionValuePair(ctx, o)
    val r: TPostResult[Context, BTSConditionValuePair] = if (preR.continu) {
      val o2: BTSConditionValuePair = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.condition)
      val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.value)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(condition = r0.resultOpt.getOrElse(o2.condition), value = r1.resultOpt.getOrElse(o2.value))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSConditionValuePair = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSConditionValuePair] = pp.postBTSConditionValuePair(r.ctx, o2)
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
      val r0: TPostResult[Context, Option[BTSInvocation]] = transformOption(preR.ctx, o2.pred, transformBTSInvocation _)
      val r1: TPostResult[Context, IS[Z, BTSEnumerationPair]] = transformISZ(r0.ctx, o2.pair, transformBTSEnumerationPair _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(pred = r0.resultOpt.getOrElse(o2.pred), pair = r1.resultOpt.getOrElse(o2.pair))))
      else
        TPostResult(r1.ctx, None())
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

  @pure def transformBTSEnumerationPair(ctx: Context, o: BTSEnumerationPair): TPostResult[Context, BTSEnumerationPair] = {
    val preR: PreResult[Context, BTSEnumerationPair] = pp.preBTSEnumerationPair(ctx, o)
    val r: TPostResult[Context, BTSEnumerationPair] = if (preR.continu) {
      val o2: BTSEnumerationPair = preR.resultOpt.getOrElse(o)
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
      val r0: TPostResult[Context, BTSType] = transformBTSType(preR.ctx, o2.tod)
      val r1: TPostResult[Context, BTSAssertionFunctionValue] = transformBTSAssertionFunctionValue(r0.ctx, o2.functionvalue)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(tod = r0.resultOpt.getOrElse(o2.tod), functionvalue = r1.resultOpt.getOrElse(o2.functionvalue))))
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
      val r0: TPostResult[Context, BTSInvocation] = transformBTSInvocation(preR.ctx, o2.enumberation)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(enumberation = r0.resultOpt.getOrElse(o2.enumberation))))
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

  @pure def transformBTSInvocation(ctx: Context, o: BTSInvocation): TPostResult[Context, BTSInvocation] = {
    val preR: PreResult[Context, BTSInvocation] = pp.preBTSInvocation(ctx, o)
    val r: TPostResult[Context, BTSInvocation] = if (preR.continu) {
      val o2: BTSInvocation = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, BTSNamedAssertion] = transformBTSNamedAssertion(preR.ctx, o2.label)
      val r1: TPostResult[Context, IS[Z, BTSActualParameter]] = transformISZ(r0.ctx, o2.params, transformBTSActualParameter _)
      val r2: TPostResult[Context, Option[BTSExp]] = transformOption(r1.ctx, o2.actual_parameter, transformBTSExp _)
      val r3: TPostResult[Context, Option[BTSType]] = transformOption(r2.ctx, o2.typed, transformBTSType _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
        TPostResult(r3.ctx, Some(o2(label = r0.resultOpt.getOrElse(o2.label), params = r1.resultOpt.getOrElse(o2.params), actual_parameter = r2.resultOpt.getOrElse(o2.actual_parameter), typed = r3.resultOpt.getOrElse(o2.typed))))
      else
        TPostResult(r3.ctx, None())
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
      val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.actual)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(actual = r0.resultOpt.getOrElse(o2.actual))))
      else
        TPostResult(r0.ctx, None())
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

  @pure def transformBTSUniversalQuantification(ctx: Context, o: BTSUniversalQuantification): TPostResult[Context, BTSUniversalQuantification] = {
    val preR: PreResult[Context, BTSUniversalQuantification] = pp.preBTSUniversalQuantification(ctx, o)
    val r: TPostResult[Context, BTSUniversalQuantification] = if (preR.continu) {
      val o2: BTSUniversalQuantification = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, BTSVariable]] = transformISZ(preR.ctx, o2.variables, transformBTSVariable _)
      val r1: TPostResult[Context, Option[BTSRange]] = transformOption(r0.ctx, o2.range, transformBTSRange _)
      val r2: TPostResult[Context, Option[BTSExp]] = transformOption(r1.ctx, o2.which, transformBTSExp _)
      val r3: TPostResult[Context, BTSExp] = transformBTSExp(r2.ctx, o2.predicate)
      val r4: TPostResult[Context, Option[BTSType]] = transformOption(r3.ctx, o2.typed, transformBTSType _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
        TPostResult(r4.ctx, Some(o2(variables = r0.resultOpt.getOrElse(o2.variables), range = r1.resultOpt.getOrElse(o2.range), which = r2.resultOpt.getOrElse(o2.which), predicate = r3.resultOpt.getOrElse(o2.predicate), typed = r4.resultOpt.getOrElse(o2.typed))))
      else
        TPostResult(r4.ctx, None())
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
      val r2: TPostResult[Context, Option[BTSExp]] = transformOption(r1.ctx, o2.which, transformBTSExp _)
      val r3: TPostResult[Context, BTSExp] = transformBTSExp(r2.ctx, o2.predicate)
      val r4: TPostResult[Context, Option[BTSType]] = transformOption(r3.ctx, o2.typed, transformBTSType _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
        TPostResult(r4.ctx, Some(o2(variables = r0.resultOpt.getOrElse(o2.variables), range = r1.resultOpt.getOrElse(o2.range), which = r2.resultOpt.getOrElse(o2.which), predicate = r3.resultOpt.getOrElse(o2.predicate), typed = r4.resultOpt.getOrElse(o2.typed))))
      else
        TPostResult(r4.ctx, None())
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
      val r2: TPostResult[Context, Option[BTSExp]] = transformOption(r1.ctx, o2.which, transformBTSExp _)
      val r3: TPostResult[Context, BTSExp] = transformBTSExp(r2.ctx, o2.numeric_expression)
      val r4: TPostResult[Context, Option[BTSType]] = transformOption(r3.ctx, o2.typed, transformBTSType _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
        TPostResult(r4.ctx, Some(o2(variables = r0.resultOpt.getOrElse(o2.variables), range = r1.resultOpt.getOrElse(o2.range), which = r2.resultOpt.getOrElse(o2.which), numeric_expression = r3.resultOpt.getOrElse(o2.numeric_expression), typed = r4.resultOpt.getOrElse(o2.typed))))
      else
        TPostResult(r4.ctx, None())
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
      val r2: TPostResult[Context, Option[BTSExp]] = transformOption(r1.ctx, o2.which, transformBTSExp _)
      val r3: TPostResult[Context, BTSExp] = transformBTSExp(r2.ctx, o2.numeric_expression)
      val r4: TPostResult[Context, Option[BTSType]] = transformOption(r3.ctx, o2.typed, transformBTSType _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
        TPostResult(r4.ctx, Some(o2(variables = r0.resultOpt.getOrElse(o2.variables), range = r1.resultOpt.getOrElse(o2.range), which = r2.resultOpt.getOrElse(o2.which), numeric_expression = r3.resultOpt.getOrElse(o2.numeric_expression), typed = r4.resultOpt.getOrElse(o2.typed))))
      else
        TPostResult(r4.ctx, None())
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
      val r2: TPostResult[Context, Option[BTSExp]] = transformOption(r1.ctx, o2.which, transformBTSExp _)
      val r3: TPostResult[Context, BTSExp] = transformBTSExp(r2.ctx, o2.counted)
      val r4: TPostResult[Context, Option[BTSType]] = transformOption(r3.ctx, o2.typed, transformBTSType _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
        TPostResult(r4.ctx, Some(o2(variables = r0.resultOpt.getOrElse(o2.variables), range = r1.resultOpt.getOrElse(o2.range), which = r2.resultOpt.getOrElse(o2.which), counted = r3.resultOpt.getOrElse(o2.counted), typed = r4.resultOpt.getOrElse(o2.typed))))
      else
        TPostResult(r4.ctx, None())
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
      val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.lower_bound)
      val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.upper_bound)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(lower_bound = r0.resultOpt.getOrElse(o2.lower_bound), upper_bound = r1.resultOpt.getOrElse(o2.upper_bound))))
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

  @pure def transformBTSTimedExpression(ctx: Context, o: BTSTimedExpression): TPostResult[Context, BTSTimedExpression] = {
    val preR: PreResult[Context, BTSTimedExpression] = pp.preBTSTimedExpression(ctx, o)
    val r: TPostResult[Context, BTSTimedExpression] = if (preR.continu) {
      val o2: BTSTimedExpression = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.subject)
      val r1: TPostResult[Context, Option[BTSExp]] = transformOption(r0.ctx, o2.at, transformBTSExp _)
      val r2: TPostResult[Context, Option[BTSExp]] = transformOption(r1.ctx, o2.caret, transformBTSExp _)
      val r3: TPostResult[Context, Option[BTSType]] = transformOption(r2.ctx, o2.typed, transformBTSType _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
        TPostResult(r3.ctx, Some(o2(subject = r0.resultOpt.getOrElse(o2.subject), at = r1.resultOpt.getOrElse(o2.at), caret = r2.resultOpt.getOrElse(o2.caret), typed = r3.resultOpt.getOrElse(o2.typed))))
      else
        TPostResult(r3.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSTimedExpression = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSTimedExpression] = pp.postBTSTimedExpression(r.ctx, o2)
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
      val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.pred)
      val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.t)
      val r2: TPostResult[Context, BTSExp] = transformBTSExp(r1.ctx, o2.f)
      val r3: TPostResult[Context, Option[BTSType]] = transformOption(r2.ctx, o2.typed, transformBTSType _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
        TPostResult(r3.ctx, Some(o2(pred = r0.resultOpt.getOrElse(o2.pred), t = r1.resultOpt.getOrElse(o2.t), f = r2.resultOpt.getOrElse(o2.f), typed = r3.resultOpt.getOrElse(o2.typed))))
      else
        TPostResult(r3.ctx, None())
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

  @pure def transformBTSCaseExpression(ctx: Context, o: BTSCaseExpression): TPostResult[Context, BTSCaseExpression] = {
    val preR: PreResult[Context, BTSCaseExpression] = pp.preBTSCaseExpression(ctx, o)
    val r: TPostResult[Context, BTSCaseExpression] = if (preR.continu) {
      val o2: BTSCaseExpression = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, BTSCaseChoice]] = transformISZ(preR.ctx, o2.cc, transformBTSCaseChoice _)
      val r1: TPostResult[Context, Option[BTSType]] = transformOption(r0.ctx, o2.typed, transformBTSType _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(cc = r0.resultOpt.getOrElse(o2.cc), typed = r1.resultOpt.getOrElse(o2.typed))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSCaseExpression = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSCaseExpression] = pp.postBTSCaseExpression(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSCaseChoice(ctx: Context, o: BTSCaseChoice): TPostResult[Context, BTSCaseChoice] = {
    val preR: PreResult[Context, BTSCaseChoice] = pp.preBTSCaseChoice(ctx, o)
    val r: TPostResult[Context, BTSCaseChoice] = if (preR.continu) {
      val o2: BTSCaseChoice = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.be)
      val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.exp)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(be = r0.resultOpt.getOrElse(o2.be), exp = r1.resultOpt.getOrElse(o2.exp))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSCaseChoice = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSCaseChoice] = pp.postBTSCaseChoice(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSRecordTerm(ctx: Context, o: BTSRecordTerm): TPostResult[Context, BTSRecordTerm] = {
    val preR: PreResult[Context, BTSRecordTerm] = pp.preBTSRecordTerm(ctx, o)
    val r: TPostResult[Context, BTSRecordTerm] = if (preR.continu) {
      val o2: BTSRecordTerm = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, BTSType] = transformBTSType(preR.ctx, o2.record_type)
      val r1: TPostResult[Context, IS[Z, BTSRecordValue]] = transformISZ(r0.ctx, o2.record_value, transformBTSRecordValue _)
      val r2: TPostResult[Context, Option[BTSType]] = transformOption(r1.ctx, o2.typed, transformBTSType _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        TPostResult(r2.ctx, Some(o2(record_type = r0.resultOpt.getOrElse(o2.record_type), record_value = r1.resultOpt.getOrElse(o2.record_value), typed = r2.resultOpt.getOrElse(o2.typed))))
      else
        TPostResult(r2.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSRecordTerm = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSRecordTerm] = pp.postBTSRecordTerm(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSRecordValue(ctx: Context, o: BTSRecordValue): TPostResult[Context, BTSRecordValue] = {
    val preR: PreResult[Context, BTSRecordValue] = pp.preBTSRecordValue(ctx, o)
    val r: TPostResult[Context, BTSRecordValue] = if (preR.continu) {
      val o2: BTSRecordValue = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, BTSValue] = transformBTSValue(preR.ctx, o2.aval)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(aval = r0.resultOpt.getOrElse(o2.aval))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSRecordValue = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSRecordValue] = pp.postBTSRecordValue(r.ctx, o2)
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
        case o2: BTSInvocation =>
          val r0: TPostResult[Context, BTSNamedAssertion] = transformBTSNamedAssertion(preR.ctx, o2.label)
          val r1: TPostResult[Context, IS[Z, BTSActualParameter]] = transformISZ(r0.ctx, o2.params, transformBTSActualParameter _)
          val r2: TPostResult[Context, Option[BTSExp]] = transformOption(r1.ctx, o2.actual_parameter, transformBTSExp _)
          val r3: TPostResult[Context, Option[BTSType]] = transformOption(r2.ctx, o2.typed, transformBTSType _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(label = r0.resultOpt.getOrElse(o2.label), params = r1.resultOpt.getOrElse(o2.params), actual_parameter = r2.resultOpt.getOrElse(o2.actual_parameter), typed = r3.resultOpt.getOrElse(o2.typed))))
          else
            TPostResult(r3.ctx, None())
        case o2: BTSUniversalQuantification =>
          val r0: TPostResult[Context, IS[Z, BTSVariable]] = transformISZ(preR.ctx, o2.variables, transformBTSVariable _)
          val r1: TPostResult[Context, Option[BTSRange]] = transformOption(r0.ctx, o2.range, transformBTSRange _)
          val r2: TPostResult[Context, Option[BTSExp]] = transformOption(r1.ctx, o2.which, transformBTSExp _)
          val r3: TPostResult[Context, BTSExp] = transformBTSExp(r2.ctx, o2.predicate)
          val r4: TPostResult[Context, Option[BTSType]] = transformOption(r3.ctx, o2.typed, transformBTSType _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
            TPostResult(r4.ctx, Some(o2(variables = r0.resultOpt.getOrElse(o2.variables), range = r1.resultOpt.getOrElse(o2.range), which = r2.resultOpt.getOrElse(o2.which), predicate = r3.resultOpt.getOrElse(o2.predicate), typed = r4.resultOpt.getOrElse(o2.typed))))
          else
            TPostResult(r4.ctx, None())
        case o2: BTSExistentialQuantification =>
          val r0: TPostResult[Context, IS[Z, BTSVariable]] = transformISZ(preR.ctx, o2.variables, transformBTSVariable _)
          val r1: TPostResult[Context, Option[BTSRange]] = transformOption(r0.ctx, o2.range, transformBTSRange _)
          val r2: TPostResult[Context, Option[BTSExp]] = transformOption(r1.ctx, o2.which, transformBTSExp _)
          val r3: TPostResult[Context, BTSExp] = transformBTSExp(r2.ctx, o2.predicate)
          val r4: TPostResult[Context, Option[BTSType]] = transformOption(r3.ctx, o2.typed, transformBTSType _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
            TPostResult(r4.ctx, Some(o2(variables = r0.resultOpt.getOrElse(o2.variables), range = r1.resultOpt.getOrElse(o2.range), which = r2.resultOpt.getOrElse(o2.which), predicate = r3.resultOpt.getOrElse(o2.predicate), typed = r4.resultOpt.getOrElse(o2.typed))))
          else
            TPostResult(r4.ctx, None())
        case o2: BTSSumQuantification =>
          val r0: TPostResult[Context, IS[Z, BTSVariable]] = transformISZ(preR.ctx, o2.variables, transformBTSVariable _)
          val r1: TPostResult[Context, Option[BTSRange]] = transformOption(r0.ctx, o2.range, transformBTSRange _)
          val r2: TPostResult[Context, Option[BTSExp]] = transformOption(r1.ctx, o2.which, transformBTSExp _)
          val r3: TPostResult[Context, BTSExp] = transformBTSExp(r2.ctx, o2.numeric_expression)
          val r4: TPostResult[Context, Option[BTSType]] = transformOption(r3.ctx, o2.typed, transformBTSType _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
            TPostResult(r4.ctx, Some(o2(variables = r0.resultOpt.getOrElse(o2.variables), range = r1.resultOpt.getOrElse(o2.range), which = r2.resultOpt.getOrElse(o2.which), numeric_expression = r3.resultOpt.getOrElse(o2.numeric_expression), typed = r4.resultOpt.getOrElse(o2.typed))))
          else
            TPostResult(r4.ctx, None())
        case o2: BTSProductQuantification =>
          val r0: TPostResult[Context, IS[Z, BTSVariable]] = transformISZ(preR.ctx, o2.variables, transformBTSVariable _)
          val r1: TPostResult[Context, Option[BTSRange]] = transformOption(r0.ctx, o2.range, transformBTSRange _)
          val r2: TPostResult[Context, Option[BTSExp]] = transformOption(r1.ctx, o2.which, transformBTSExp _)
          val r3: TPostResult[Context, BTSExp] = transformBTSExp(r2.ctx, o2.numeric_expression)
          val r4: TPostResult[Context, Option[BTSType]] = transformOption(r3.ctx, o2.typed, transformBTSType _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
            TPostResult(r4.ctx, Some(o2(variables = r0.resultOpt.getOrElse(o2.variables), range = r1.resultOpt.getOrElse(o2.range), which = r2.resultOpt.getOrElse(o2.which), numeric_expression = r3.resultOpt.getOrElse(o2.numeric_expression), typed = r4.resultOpt.getOrElse(o2.typed))))
          else
            TPostResult(r4.ctx, None())
        case o2: BTSCountingQuantification =>
          val r0: TPostResult[Context, IS[Z, BTSVariable]] = transformISZ(preR.ctx, o2.variables, transformBTSVariable _)
          val r1: TPostResult[Context, Option[BTSRange]] = transformOption(r0.ctx, o2.range, transformBTSRange _)
          val r2: TPostResult[Context, Option[BTSExp]] = transformOption(r1.ctx, o2.which, transformBTSExp _)
          val r3: TPostResult[Context, BTSExp] = transformBTSExp(r2.ctx, o2.counted)
          val r4: TPostResult[Context, Option[BTSType]] = transformOption(r3.ctx, o2.typed, transformBTSType _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
            TPostResult(r4.ctx, Some(o2(variables = r0.resultOpt.getOrElse(o2.variables), range = r1.resultOpt.getOrElse(o2.range), which = r2.resultOpt.getOrElse(o2.which), counted = r3.resultOpt.getOrElse(o2.counted), typed = r4.resultOpt.getOrElse(o2.typed))))
          else
            TPostResult(r4.ctx, None())
        case o2: BTSTimedExpression =>
          val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.subject)
          val r1: TPostResult[Context, Option[BTSExp]] = transformOption(r0.ctx, o2.at, transformBTSExp _)
          val r2: TPostResult[Context, Option[BTSExp]] = transformOption(r1.ctx, o2.caret, transformBTSExp _)
          val r3: TPostResult[Context, Option[BTSType]] = transformOption(r2.ctx, o2.typed, transformBTSType _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(subject = r0.resultOpt.getOrElse(o2.subject), at = r1.resultOpt.getOrElse(o2.at), caret = r2.resultOpt.getOrElse(o2.caret), typed = r3.resultOpt.getOrElse(o2.typed))))
          else
            TPostResult(r3.ctx, None())
        case o2: BTSConditionalExpression =>
          val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.pred)
          val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.t)
          val r2: TPostResult[Context, BTSExp] = transformBTSExp(r1.ctx, o2.f)
          val r3: TPostResult[Context, Option[BTSType]] = transformOption(r2.ctx, o2.typed, transformBTSType _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(pred = r0.resultOpt.getOrElse(o2.pred), t = r1.resultOpt.getOrElse(o2.t), f = r2.resultOpt.getOrElse(o2.f), typed = r3.resultOpt.getOrElse(o2.typed))))
          else
            TPostResult(r3.ctx, None())
        case o2: BTSCaseExpression =>
          val r0: TPostResult[Context, IS[Z, BTSCaseChoice]] = transformISZ(preR.ctx, o2.cc, transformBTSCaseChoice _)
          val r1: TPostResult[Context, Option[BTSType]] = transformOption(r0.ctx, o2.typed, transformBTSType _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(cc = r0.resultOpt.getOrElse(o2.cc), typed = r1.resultOpt.getOrElse(o2.typed))))
          else
            TPostResult(r1.ctx, None())
        case o2: BTSRecordTerm =>
          val r0: TPostResult[Context, BTSType] = transformBTSType(preR.ctx, o2.record_type)
          val r1: TPostResult[Context, IS[Z, BTSRecordValue]] = transformISZ(r0.ctx, o2.record_value, transformBTSRecordValue _)
          val r2: TPostResult[Context, Option[BTSType]] = transformOption(r1.ctx, o2.typed, transformBTSType _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(record_type = r0.resultOpt.getOrElse(o2.record_type), record_value = r1.resultOpt.getOrElse(o2.record_value), typed = r2.resultOpt.getOrElse(o2.typed))))
          else
            TPostResult(r2.ctx, None())
        case o2: BTSExponentiation =>
          val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.l)
          val r1: TPostResult[Context, Option[BTSExp]] = transformOption(r0.ctx, o2.r, transformBTSExp _)
          val r2: TPostResult[Context, Option[BTSType]] = transformOption(r1.ctx, o2.typed, transformBTSType _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(l = r0.resultOpt.getOrElse(o2.l), r = r1.resultOpt.getOrElse(o2.r), typed = r2.resultOpt.getOrElse(o2.typed))))
          else
            TPostResult(r2.ctx, None())
        case o2: BTSUnaryExp =>
          val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.exp)
          val r1: TPostResult[Context, Option[BTSType]] = transformOption(r0.ctx, o2.typed, transformBTSType _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(exp = r0.resultOpt.getOrElse(o2.exp), typed = r1.resultOpt.getOrElse(o2.typed))))
          else
            TPostResult(r1.ctx, None())
        case o2: BTSBinaryExp =>
          val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.lhs)
          val r1: TPostResult[Context, BTSExp] = transformBTSExp(r0.ctx, o2.rhs)
          val r2: TPostResult[Context, Option[BTSType]] = transformOption(r1.ctx, o2.typed, transformBTSType _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(lhs = r0.resultOpt.getOrElse(o2.lhs), rhs = r1.resultOpt.getOrElse(o2.rhs), typed = r2.resultOpt.getOrElse(o2.typed))))
          else
            TPostResult(r2.ctx, None())
        case o2: BTSLiteralExp =>
          val r0: TPostResult[Context, Option[BTSType]] = transformOption(preR.ctx, o2.typed, transformBTSType _)
          if (hasChanged || r0.resultOpt.nonEmpty)
            TPostResult(r0.ctx, Some(o2(typed = r0.resultOpt.getOrElse(o2.typed))))
          else
            TPostResult(r0.ctx, None())
        case o2: BTSNameExp =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
          val r1: TPostResult[Context, Option[BTSType]] = transformOption(r0.ctx, o2.typed, transformBTSType _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), typed = r1.resultOpt.getOrElse(o2.typed))))
          else
            TPostResult(r1.ctx, None())
        case o2: BTSIndexingExp =>
          val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.exp)
          val r1: TPostResult[Context, IS[Z, BTSExp]] = transformISZ(r0.ctx, o2.indices, transformBTSExp _)
          val r2: TPostResult[Context, Option[BTSType]] = transformOption(r1.ctx, o2.typed, transformBTSType _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(exp = r0.resultOpt.getOrElse(o2.exp), indices = r1.resultOpt.getOrElse(o2.indices), typed = r2.resultOpt.getOrElse(o2.typed))))
          else
            TPostResult(r2.ctx, None())
        case o2: BTSAccessExp =>
          val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.exp)
          val r1: TPostResult[Context, Option[BTSType]] = transformOption(r0.ctx, o2.typed, transformBTSType _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
            TPostResult(r1.ctx, Some(o2(exp = r0.resultOpt.getOrElse(o2.exp), typed = r1.resultOpt.getOrElse(o2.typed))))
          else
            TPostResult(r1.ctx, None())
        case o2: BTSFunctionCall =>
          val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
          val r1: TPostResult[Context, IS[Z, BTSFormalExpPair]] = transformISZ(r0.ctx, o2.args, transformBTSFormalExpPair _)
          val r2: TPostResult[Context, Option[BTSType]] = transformOption(r1.ctx, o2.typed, transformBTSType _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
            TPostResult(r2.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), args = r1.resultOpt.getOrElse(o2.args), typed = r2.resultOpt.getOrElse(o2.typed))))
          else
            TPostResult(r2.ctx, None())
        case o2: BTSValue =>
          val r0: TPostResult[Context, IS[Z, BTSFormalExpPair]] = transformISZ(preR.ctx, o2.function_parameters, transformBTSFormalExpPair _)
          val r1: TPostResult[Context, IS[Z, BTSIndexExpressionOrRange]] = transformISZ(r0.ctx, o2.array_index, transformBTSIndexExpressionOrRange _)
          val r2: TPostResult[Context, IS[Z, BTSPartialName]] = transformISZ(r1.ctx, o2.pn, transformBTSPartialName _)
          val r3: TPostResult[Context, Option[BTSType]] = transformOption(r2.ctx, o2.typed, transformBTSType _)
          if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
            TPostResult(r3.ctx, Some(o2(function_parameters = r0.resultOpt.getOrElse(o2.function_parameters), array_index = r1.resultOpt.getOrElse(o2.array_index), pn = r2.resultOpt.getOrElse(o2.pn), typed = r3.resultOpt.getOrElse(o2.typed))))
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

  @pure def transformBTSExponentiation(ctx: Context, o: BTSExponentiation): TPostResult[Context, BTSExponentiation] = {
    val preR: PreResult[Context, BTSExponentiation] = pp.preBTSExponentiation(ctx, o)
    val r: TPostResult[Context, BTSExponentiation] = if (preR.continu) {
      val o2: BTSExponentiation = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.l)
      val r1: TPostResult[Context, Option[BTSExp]] = transformOption(r0.ctx, o2.r, transformBTSExp _)
      val r2: TPostResult[Context, Option[BTSType]] = transformOption(r1.ctx, o2.typed, transformBTSType _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        TPostResult(r2.ctx, Some(o2(l = r0.resultOpt.getOrElse(o2.l), r = r1.resultOpt.getOrElse(o2.r), typed = r2.resultOpt.getOrElse(o2.typed))))
      else
        TPostResult(r2.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSExponentiation = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSExponentiation] = pp.postBTSExponentiation(r.ctx, o2)
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
      val r1: TPostResult[Context, Option[BTSType]] = transformOption(r0.ctx, o2.typed, transformBTSType _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(exp = r0.resultOpt.getOrElse(o2.exp), typed = r1.resultOpt.getOrElse(o2.typed))))
      else
        TPostResult(r1.ctx, None())
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
      val r2: TPostResult[Context, Option[BTSType]] = transformOption(r1.ctx, o2.typed, transformBTSType _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        TPostResult(r2.ctx, Some(o2(lhs = r0.resultOpt.getOrElse(o2.lhs), rhs = r1.resultOpt.getOrElse(o2.rhs), typed = r2.resultOpt.getOrElse(o2.typed))))
      else
        TPostResult(r2.ctx, None())
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
      val r0: TPostResult[Context, Option[BTSType]] = transformOption(preR.ctx, o2.typed, transformBTSType _)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(typed = r0.resultOpt.getOrElse(o2.typed))))
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

  @pure def transformBTSNameExp(ctx: Context, o: BTSNameExp): TPostResult[Context, BTSNameExp] = {
    val preR: PreResult[Context, BTSNameExp] = pp.preBTSNameExp(ctx, o)
    val r: TPostResult[Context, BTSNameExp] = if (preR.continu) {
      val o2: BTSNameExp = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Name] = transformName(preR.ctx, o2.name)
      val r1: TPostResult[Context, Option[BTSType]] = transformOption(r0.ctx, o2.typed, transformBTSType _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), typed = r1.resultOpt.getOrElse(o2.typed))))
      else
        TPostResult(r1.ctx, None())
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
      val r2: TPostResult[Context, Option[BTSType]] = transformOption(r1.ctx, o2.typed, transformBTSType _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        TPostResult(r2.ctx, Some(o2(exp = r0.resultOpt.getOrElse(o2.exp), indices = r1.resultOpt.getOrElse(o2.indices), typed = r2.resultOpt.getOrElse(o2.typed))))
      else
        TPostResult(r2.ctx, None())
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
      val r1: TPostResult[Context, Option[BTSType]] = transformOption(r0.ctx, o2.typed, transformBTSType _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(exp = r0.resultOpt.getOrElse(o2.exp), typed = r1.resultOpt.getOrElse(o2.typed))))
      else
        TPostResult(r1.ctx, None())
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
      val r2: TPostResult[Context, Option[BTSType]] = transformOption(r1.ctx, o2.typed, transformBTSType _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        TPostResult(r2.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), args = r1.resultOpt.getOrElse(o2.args), typed = r2.resultOpt.getOrElse(o2.typed))))
      else
        TPostResult(r2.ctx, None())
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
      val r0: TPostResult[Context, Option[BTSQuantity]] = transformOption(preR.ctx, o2.quantity, transformBTSQuantity _)
      val r1: TPostResult[Context, Option[BTSValue]] = transformOption(r0.ctx, o2.value, transformBTSValue _)
      val r2: TPostResult[Context, Option[BTSExp]] = transformOption(r1.ctx, o2.duration, transformBTSExp _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        TPostResult(r2.ctx, Some(o2(quantity = r0.resultOpt.getOrElse(o2.quantity), value = r1.resultOpt.getOrElse(o2.value), duration = r2.resultOpt.getOrElse(o2.duration))))
      else
        TPostResult(r2.ctx, None())
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

  @pure def transformBTSQuantity(ctx: Context, o: BTSQuantity): TPostResult[Context, BTSQuantity] = {
    val preR: PreResult[Context, BTSQuantity] = pp.preBTSQuantity(ctx, o)
    val r: TPostResult[Context, BTSQuantity] = if (preR.continu) {
      val o2: BTSQuantity = preR.resultOpt.getOrElse(o)
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

  @pure def transformBTSValue(ctx: Context, o: BTSValue): TPostResult[Context, BTSValue] = {
    val preR: PreResult[Context, BTSValue] = pp.preBTSValue(ctx, o)
    val r: TPostResult[Context, BTSValue] = if (preR.continu) {
      val o2: BTSValue = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, BTSFormalExpPair]] = transformISZ(preR.ctx, o2.function_parameters, transformBTSFormalExpPair _)
      val r1: TPostResult[Context, IS[Z, BTSIndexExpressionOrRange]] = transformISZ(r0.ctx, o2.array_index, transformBTSIndexExpressionOrRange _)
      val r2: TPostResult[Context, IS[Z, BTSPartialName]] = transformISZ(r1.ctx, o2.pn, transformBTSPartialName _)
      val r3: TPostResult[Context, Option[BTSType]] = transformOption(r2.ctx, o2.typed, transformBTSType _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
        TPostResult(r3.ctx, Some(o2(function_parameters = r0.resultOpt.getOrElse(o2.function_parameters), array_index = r1.resultOpt.getOrElse(o2.array_index), pn = r2.resultOpt.getOrElse(o2.pn), typed = r3.resultOpt.getOrElse(o2.typed))))
      else
        TPostResult(r3.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: BTSValue = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSValue] = pp.postBTSValue(r.ctx, o2)
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformBTSIndexExpressionOrRange(ctx: Context, o: BTSIndexExpressionOrRange): TPostResult[Context, BTSIndexExpressionOrRange] = {
    val preR: PreResult[Context, BTSIndexExpressionOrRange] = pp.preBTSIndexExpressionOrRange(ctx, o)
    val r: TPostResult[Context, BTSIndexExpressionOrRange] = if (preR.continu) {
      val o2: BTSIndexExpressionOrRange = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, BTSExp] = transformBTSExp(preR.ctx, o2.lhs)
      val r1: TPostResult[Context, Option[BTSExp]] = transformOption(r0.ctx, o2.rhs, transformBTSExp _)
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
    val o2: BTSIndexExpressionOrRange = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, BTSIndexExpressionOrRange] = pp.postBTSIndexExpressionOrRange(r.ctx, o2)
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
      val r0: TPostResult[Context, IS[Z, BTSIndexExpressionOrRange]] = transformISZ(preR.ctx, o2.array_index, transformBTSIndexExpressionOrRange _)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(array_index = r0.resultOpt.getOrElse(o2.array_index))))
      else
        TPostResult(r0.ctx, None())
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

  @pure def transform_langastExpLitString(ctx: Context, o: org.sireum.lang.ast.Exp.LitString): TPostResult[Context, org.sireum.lang.ast.Exp.LitString] = {
    val preR: PreResult[Context, org.sireum.lang.ast.Exp.LitString] = pp.pre_langastExpLitString(ctx, o) match {
     case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.Exp.LitString)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.Exp.LitString](r))
     case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Exp.LitString")
     case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.Exp.LitString]())
    }
    val r: TPostResult[Context, org.sireum.lang.ast.Exp.LitString] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Exp.LitString = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(preR.ctx, o2.attr)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(attr = r0.resultOpt.getOrElse(o2.attr))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.Exp.LitString = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.Exp.LitString] = pp.post_langastExpLitString(r.ctx, o2) match {
     case TPostResult(postCtx, Some(result: org.sireum.lang.ast.Exp.LitString)) => TPostResult(postCtx, Some[org.sireum.lang.ast.Exp.LitString](result))
     case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Exp.LitString")
     case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.Exp.LitString]())
    }
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastTypeNamed(ctx: Context, o: org.sireum.lang.ast.Type.Named): TPostResult[Context, org.sireum.lang.ast.Type.Named] = {
    val preR: PreResult[Context, org.sireum.lang.ast.Type.Named] = pp.pre_langastTypeNamed(ctx, o) match {
     case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.Type.Named)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.Type.Named](r))
     case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Type.Named")
     case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.Type.Named]())
    }
    val r: TPostResult[Context, org.sireum.lang.ast.Type.Named] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Type.Named = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, org.sireum.lang.ast.Name] = transform_langastName(preR.ctx, o2.name)
      val r1: TPostResult[Context, IS[Z, org.sireum.lang.ast.Type]] = transformISZ(r0.ctx, o2.typeArgs, transform_langastType _)
      val r2: TPostResult[Context, org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(r1.ctx, o2.attr)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        TPostResult(r2.ctx, Some(o2(name = r0.resultOpt.getOrElse(o2.name), typeArgs = r1.resultOpt.getOrElse(o2.typeArgs), attr = r2.resultOpt.getOrElse(o2.attr))))
      else
        TPostResult(r2.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.Type.Named = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.Type.Named] = pp.post_langastTypeNamed(r.ctx, o2) match {
     case TPostResult(postCtx, Some(result: org.sireum.lang.ast.Type.Named)) => TPostResult(postCtx, Some[org.sireum.lang.ast.Type.Named](result))
     case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Type.Named")
     case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.Type.Named]())
    }
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastExpIdent(ctx: Context, o: org.sireum.lang.ast.Exp.Ident): TPostResult[Context, org.sireum.lang.ast.Exp.Ident] = {
    val preR: PreResult[Context, org.sireum.lang.ast.Exp.Ident] = pp.pre_langastExpIdent(ctx, o) match {
     case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.Exp.Ident)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.Exp.Ident](r))
     case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Exp.Ident")
     case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.Exp.Ident]())
    }
    val r: TPostResult[Context, org.sireum.lang.ast.Exp.Ident] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Exp.Ident = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, org.sireum.lang.ast.Id] = transform_langastId(preR.ctx, o2.id)
      val r1: TPostResult[Context, org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(r0.ctx, o2.attr)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), attr = r1.resultOpt.getOrElse(o2.attr))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.Exp.Ident = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.Exp.Ident] = pp.post_langastExpIdent(r.ctx, o2) match {
     case TPostResult(postCtx, Some(result: org.sireum.lang.ast.Exp.Ident)) => TPostResult(postCtx, Some[org.sireum.lang.ast.Exp.Ident](result))
     case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Exp.Ident")
     case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.Exp.Ident]())
    }
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastStmtBlock(ctx: Context, o: org.sireum.lang.ast.Stmt.Block): TPostResult[Context, org.sireum.lang.ast.Stmt.Block] = {
    val preR: PreResult[Context, org.sireum.lang.ast.Stmt.Block] = pp.pre_langastStmtBlock(ctx, o) match {
     case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.Stmt.Block)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.Stmt.Block](r))
     case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Stmt.Block")
     case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.Stmt.Block]())
    }
    val r: TPostResult[Context, org.sireum.lang.ast.Stmt.Block] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Stmt.Block = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, org.sireum.lang.ast.Body] = transform_langastBody(preR.ctx, o2.body)
      val r1: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(r0.ctx, o2.attr)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(body = r0.resultOpt.getOrElse(o2.body), attr = r1.resultOpt.getOrElse(o2.attr))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.Stmt.Block = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.Stmt.Block] = pp.post_langastStmtBlock(r.ctx, o2) match {
     case TPostResult(postCtx, Some(result: org.sireum.lang.ast.Stmt.Block)) => TPostResult(postCtx, Some[org.sireum.lang.ast.Stmt.Block](result))
     case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Stmt.Block")
     case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.Stmt.Block]())
    }
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastExpLitZ(ctx: Context, o: org.sireum.lang.ast.Exp.LitZ): TPostResult[Context, org.sireum.lang.ast.Exp.LitZ] = {
    val preR: PreResult[Context, org.sireum.lang.ast.Exp.LitZ] = pp.pre_langastExpLitZ(ctx, o) match {
     case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.Exp.LitZ)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.Exp.LitZ](r))
     case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Exp.LitZ")
     case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.Exp.LitZ]())
    }
    val r: TPostResult[Context, org.sireum.lang.ast.Exp.LitZ] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Exp.LitZ = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(preR.ctx, o2.attr)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(attr = r0.resultOpt.getOrElse(o2.attr))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.Exp.LitZ = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.Exp.LitZ] = pp.post_langastExpLitZ(r.ctx, o2) match {
     case TPostResult(postCtx, Some(result: org.sireum.lang.ast.Exp.LitZ)) => TPostResult(postCtx, Some[org.sireum.lang.ast.Exp.LitZ](result))
     case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Exp.LitZ")
     case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.Exp.LitZ]())
    }
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastPatternStructure(ctx: Context, o: org.sireum.lang.ast.Pattern.Structure): TPostResult[Context, org.sireum.lang.ast.Pattern.Structure] = {
    val preR: PreResult[Context, org.sireum.lang.ast.Pattern.Structure] = pp.pre_langastPatternStructure(ctx, o) match {
     case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.Pattern.Structure)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.Pattern.Structure](r))
     case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Pattern.Structure")
     case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.Pattern.Structure]())
    }
    val r: TPostResult[Context, org.sireum.lang.ast.Pattern.Structure] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Pattern.Structure = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Option[org.sireum.lang.ast.Id]] = transformOption(preR.ctx, o2.idOpt, transform_langastId _)
      val r1: TPostResult[Context, Option[org.sireum.lang.ast.Name]] = transformOption(r0.ctx, o2.nameOpt, transform_langastName _)
      val r2: TPostResult[Context, IS[Z, org.sireum.lang.ast.Pattern]] = transformISZ(r1.ctx, o2.patterns, transform_langastPattern _)
      val r3: TPostResult[Context, org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(r2.ctx, o2.attr)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
        TPostResult(r3.ctx, Some(o2(idOpt = r0.resultOpt.getOrElse(o2.idOpt), nameOpt = r1.resultOpt.getOrElse(o2.nameOpt), patterns = r2.resultOpt.getOrElse(o2.patterns), attr = r3.resultOpt.getOrElse(o2.attr))))
      else
        TPostResult(r3.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.Pattern.Structure = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.Pattern.Structure] = pp.post_langastPatternStructure(r.ctx, o2) match {
     case TPostResult(postCtx, Some(result: org.sireum.lang.ast.Pattern.Structure)) => TPostResult(postCtx, Some[org.sireum.lang.ast.Pattern.Structure](result))
     case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Pattern.Structure")
     case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.Pattern.Structure]())
    }
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastProofAstStepAssume(ctx: Context, o: org.sireum.lang.ast.ProofAst.Step.Assume): TPostResult[Context, org.sireum.lang.ast.ProofAst.Step.Assume] = {
    val preR: PreResult[Context, org.sireum.lang.ast.ProofAst.Step.Assume] = pp.pre_langastProofAstStepAssume(ctx, o) match {
     case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.ProofAst.Step.Assume)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.ProofAst.Step.Assume](r))
     case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.ProofAst.Step.Assume")
     case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.ProofAst.Step.Assume]())
    }
    val r: TPostResult[Context, org.sireum.lang.ast.ProofAst.Step.Assume] = if (preR.continu) {
      val o2: org.sireum.lang.ast.ProofAst.Step.Assume = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, org.sireum.lang.ast.ProofAst.StepId] = transform_langastProofAstStepId(preR.ctx, o2.id)
      val r1: TPostResult[Context, org.sireum.lang.ast.Exp] = transform_langastExp(r0.ctx, o2.claim)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(id = r0.resultOpt.getOrElse(o2.id), claim = r1.resultOpt.getOrElse(o2.claim))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.ProofAst.Step.Assume = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.ProofAst.Step.Assume] = pp.post_langastProofAstStepAssume(r.ctx, o2) match {
     case TPostResult(postCtx, Some(result: org.sireum.lang.ast.ProofAst.Step.Assume)) => TPostResult(postCtx, Some[org.sireum.lang.ast.ProofAst.Step.Assume](result))
     case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.ProofAst.Step.Assume")
     case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.ProofAst.Step.Assume]())
    }
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastExpInvoke(ctx: Context, o: org.sireum.lang.ast.Exp.Invoke): TPostResult[Context, org.sireum.lang.ast.Exp.Invoke] = {
    val preR: PreResult[Context, org.sireum.lang.ast.Exp.Invoke] = pp.pre_langastExpInvoke(ctx, o) match {
     case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.Exp.Invoke)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.Exp.Invoke](r))
     case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Exp.Invoke")
     case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.Exp.Invoke]())
    }
    val r: TPostResult[Context, org.sireum.lang.ast.Exp.Invoke] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Exp.Invoke = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Option[org.sireum.lang.ast.Exp]] = transformOption(preR.ctx, o2.receiverOpt, transform_langastExp _)
      val r1: TPostResult[Context, org.sireum.lang.ast.Exp.Ident] = transform_langastExpIdent(r0.ctx, o2.ident)
      val r2: TPostResult[Context, IS[Z, org.sireum.lang.ast.Type]] = transformISZ(r1.ctx, o2.targs, transform_langastType _)
      val r3: TPostResult[Context, IS[Z, org.sireum.lang.ast.Exp]] = transformISZ(r2.ctx, o2.args, transform_langastExp _)
      val r4: TPostResult[Context, org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(r3.ctx, o2.attr)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
        TPostResult(r4.ctx, Some(o2(receiverOpt = r0.resultOpt.getOrElse(o2.receiverOpt), ident = r1.resultOpt.getOrElse(o2.ident), targs = r2.resultOpt.getOrElse(o2.targs), args = r3.resultOpt.getOrElse(o2.args), attr = r4.resultOpt.getOrElse(o2.attr))))
      else
        TPostResult(r4.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.Exp.Invoke = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.Exp.Invoke] = pp.post_langastExpInvoke(r.ctx, o2) match {
     case TPostResult(postCtx, Some(result: org.sireum.lang.ast.Exp.Invoke)) => TPostResult(postCtx, Some[org.sireum.lang.ast.Exp.Invoke](result))
     case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Exp.Invoke")
     case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.Exp.Invoke]())
    }
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastExpInvokeNamed(ctx: Context, o: org.sireum.lang.ast.Exp.InvokeNamed): TPostResult[Context, org.sireum.lang.ast.Exp.InvokeNamed] = {
    val preR: PreResult[Context, org.sireum.lang.ast.Exp.InvokeNamed] = pp.pre_langastExpInvokeNamed(ctx, o) match {
     case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.Exp.InvokeNamed)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.Exp.InvokeNamed](r))
     case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Exp.InvokeNamed")
     case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.Exp.InvokeNamed]())
    }
    val r: TPostResult[Context, org.sireum.lang.ast.Exp.InvokeNamed] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Exp.InvokeNamed = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Option[org.sireum.lang.ast.Exp]] = transformOption(preR.ctx, o2.receiverOpt, transform_langastExp _)
      val r1: TPostResult[Context, org.sireum.lang.ast.Exp.Ident] = transform_langastExpIdent(r0.ctx, o2.ident)
      val r2: TPostResult[Context, IS[Z, org.sireum.lang.ast.Type]] = transformISZ(r1.ctx, o2.targs, transform_langastType _)
      val r3: TPostResult[Context, IS[Z, org.sireum.lang.ast.NamedArg]] = transformISZ(r2.ctx, o2.args, transform_langastNamedArg _)
      val r4: TPostResult[Context, org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(r3.ctx, o2.attr)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty || r4.resultOpt.nonEmpty)
        TPostResult(r4.ctx, Some(o2(receiverOpt = r0.resultOpt.getOrElse(o2.receiverOpt), ident = r1.resultOpt.getOrElse(o2.ident), targs = r2.resultOpt.getOrElse(o2.targs), args = r3.resultOpt.getOrElse(o2.args), attr = r4.resultOpt.getOrElse(o2.attr))))
      else
        TPostResult(r4.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.Exp.InvokeNamed = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.Exp.InvokeNamed] = pp.post_langastExpInvokeNamed(r.ctx, o2) match {
     case TPostResult(postCtx, Some(result: org.sireum.lang.ast.Exp.InvokeNamed)) => TPostResult(postCtx, Some[org.sireum.lang.ast.Exp.InvokeNamed](result))
     case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Exp.InvokeNamed")
     case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.Exp.InvokeNamed]())
    }
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastExpEta(ctx: Context, o: org.sireum.lang.ast.Exp.Eta): TPostResult[Context, org.sireum.lang.ast.Exp.Eta] = {
    val preR: PreResult[Context, org.sireum.lang.ast.Exp.Eta] = pp.pre_langastExpEta(ctx, o) match {
     case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.Exp.Eta)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.Exp.Eta](r))
     case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Exp.Eta")
     case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.Exp.Eta]())
    }
    val r: TPostResult[Context, org.sireum.lang.ast.Exp.Eta] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Exp.Eta = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, org.sireum.lang.ast.Exp.Ref] = transform_langastExpRef(preR.ctx, o2.ref)
      val r1: TPostResult[Context, org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(r0.ctx, o2.attr)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(ref = r0.resultOpt.getOrElse(o2.ref), attr = r1.resultOpt.getOrElse(o2.attr))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.Exp.Eta = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.Exp.Eta] = pp.post_langastExpEta(r.ctx, o2) match {
     case TPostResult(postCtx, Some(result: org.sireum.lang.ast.Exp.Eta)) => TPostResult(postCtx, Some[org.sireum.lang.ast.Exp.Eta](result))
     case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Exp.Eta")
     case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.Exp.Eta]())
    }
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastExpFun(ctx: Context, o: org.sireum.lang.ast.Exp.Fun): TPostResult[Context, org.sireum.lang.ast.Exp.Fun] = {
    val preR: PreResult[Context, org.sireum.lang.ast.Exp.Fun] = pp.pre_langastExpFun(ctx, o) match {
     case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.Exp.Fun)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.Exp.Fun](r))
     case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Exp.Fun")
     case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.Exp.Fun]())
    }
    val r: TPostResult[Context, org.sireum.lang.ast.Exp.Fun] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Exp.Fun = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, org.sireum.lang.ast.Exp.Fun.Param]] = transformISZ(preR.ctx, o2.params, transform_langastExpFunParam _)
      val r1: TPostResult[Context, org.sireum.lang.ast.AssignExp] = transform_langastAssignExp(r0.ctx, o2.exp)
      val r2: TPostResult[Context, org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(r1.ctx, o2.attr)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        TPostResult(r2.ctx, Some(o2(params = r0.resultOpt.getOrElse(o2.params), exp = r1.resultOpt.getOrElse(o2.exp), attr = r2.resultOpt.getOrElse(o2.attr))))
      else
        TPostResult(r2.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.Exp.Fun = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.Exp.Fun] = pp.post_langastExpFun(r.ctx, o2) match {
     case TPostResult(postCtx, Some(result: org.sireum.lang.ast.Exp.Fun)) => TPostResult(postCtx, Some[org.sireum.lang.ast.Exp.Fun](result))
     case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Exp.Fun")
     case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.Exp.Fun]())
    }
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastResolvedInfoLocalVar(ctx: Context, o: org.sireum.lang.ast.ResolvedInfo.LocalVar): TPostResult[Context, org.sireum.lang.ast.ResolvedInfo.LocalVar] = {
    val preR: PreResult[Context, org.sireum.lang.ast.ResolvedInfo.LocalVar] = pp.pre_langastResolvedInfoLocalVar(ctx, o) match {
     case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.ResolvedInfo.LocalVar)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.ResolvedInfo.LocalVar](r))
     case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.ResolvedInfo.LocalVar")
     case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.ResolvedInfo.LocalVar]())
    }
    val r: TPostResult[Context, org.sireum.lang.ast.ResolvedInfo.LocalVar] = if (preR.continu) {
      val o2: org.sireum.lang.ast.ResolvedInfo.LocalVar = preR.resultOpt.getOrElse(o)
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
    val o2: org.sireum.lang.ast.ResolvedInfo.LocalVar = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.ResolvedInfo.LocalVar] = pp.post_langastResolvedInfoLocalVar(r.ctx, o2) match {
     case TPostResult(postCtx, Some(result: org.sireum.lang.ast.ResolvedInfo.LocalVar)) => TPostResult(postCtx, Some[org.sireum.lang.ast.ResolvedInfo.LocalVar](result))
     case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.ResolvedInfo.LocalVar")
     case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.ResolvedInfo.LocalVar]())
    }
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastTypedFun(ctx: Context, o: org.sireum.lang.ast.Typed.Fun): TPostResult[Context, org.sireum.lang.ast.Typed.Fun] = {
    val preR: PreResult[Context, org.sireum.lang.ast.Typed.Fun] = pp.pre_langastTypedFun(ctx, o) match {
     case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.Typed.Fun)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.Typed.Fun](r))
     case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Typed.Fun")
     case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.Typed.Fun]())
    }
    val r: TPostResult[Context, org.sireum.lang.ast.Typed.Fun] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Typed.Fun = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, IS[Z, org.sireum.lang.ast.Typed]] = transformISZ(preR.ctx, o2.args, transform_langastTyped _)
      val r1: TPostResult[Context, org.sireum.lang.ast.Typed] = transform_langastTyped(r0.ctx, o2.ret)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty)
        TPostResult(r1.ctx, Some(o2(args = r0.resultOpt.getOrElse(o2.args), ret = r1.resultOpt.getOrElse(o2.ret))))
      else
        TPostResult(r1.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.Typed.Fun = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.Typed.Fun] = pp.post_langastTypedFun(r.ctx, o2) match {
     case TPostResult(postCtx, Some(result: org.sireum.lang.ast.Typed.Fun)) => TPostResult(postCtx, Some[org.sireum.lang.ast.Typed.Fun](result))
     case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Typed.Fun")
     case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.Typed.Fun]())
    }
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastResolvedInfoMethod(ctx: Context, o: org.sireum.lang.ast.ResolvedInfo.Method): TPostResult[Context, org.sireum.lang.ast.ResolvedInfo.Method] = {
    val preR: PreResult[Context, org.sireum.lang.ast.ResolvedInfo.Method] = pp.pre_langastResolvedInfoMethod(ctx, o) match {
     case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.ResolvedInfo.Method)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.ResolvedInfo.Method](r))
     case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.ResolvedInfo.Method")
     case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.ResolvedInfo.Method]())
    }
    val r: TPostResult[Context, org.sireum.lang.ast.ResolvedInfo.Method] = if (preR.continu) {
      val o2: org.sireum.lang.ast.ResolvedInfo.Method = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, Option[org.sireum.lang.ast.Typed.Fun]] = transformOption(preR.ctx, o2.tpeOpt, transform_langastTypedFun _)
      val r1: TPostResult[Context, IS[Z, org.sireum.lang.ast.ResolvedInfo]] = transformISZ(r0.ctx, o2.reads, transform_langastResolvedInfo _)
      val r2: TPostResult[Context, IS[Z, org.sireum.lang.ast.ResolvedInfo]] = transformISZ(r1.ctx, o2.writes, transform_langastResolvedInfo _)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty)
        TPostResult(r2.ctx, Some(o2(tpeOpt = r0.resultOpt.getOrElse(o2.tpeOpt), reads = r1.resultOpt.getOrElse(o2.reads), writes = r2.resultOpt.getOrElse(o2.writes))))
      else
        TPostResult(r2.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.ResolvedInfo.Method = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.ResolvedInfo.Method] = pp.post_langastResolvedInfoMethod(r.ctx, o2) match {
     case TPostResult(postCtx, Some(result: org.sireum.lang.ast.ResolvedInfo.Method)) => TPostResult(postCtx, Some[org.sireum.lang.ast.ResolvedInfo.Method](result))
     case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.ResolvedInfo.Method")
     case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.ResolvedInfo.Method]())
    }
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastExpLitB(ctx: Context, o: org.sireum.lang.ast.Exp.LitB): TPostResult[Context, org.sireum.lang.ast.Exp.LitB] = {
    val preR: PreResult[Context, org.sireum.lang.ast.Exp.LitB] = pp.pre_langastExpLitB(ctx, o) match {
     case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.Exp.LitB)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.Exp.LitB](r))
     case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Exp.LitB")
     case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.Exp.LitB]())
    }
    val r: TPostResult[Context, org.sireum.lang.ast.Exp.LitB] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Exp.LitB = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, org.sireum.lang.ast.Attr] = transform_langastAttr(preR.ctx, o2.attr)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(attr = r0.resultOpt.getOrElse(o2.attr))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.Exp.LitB = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.Exp.LitB] = pp.post_langastExpLitB(r.ctx, o2) match {
     case TPostResult(postCtx, Some(result: org.sireum.lang.ast.Exp.LitB)) => TPostResult(postCtx, Some[org.sireum.lang.ast.Exp.LitB](result))
     case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Exp.LitB")
     case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.Exp.LitB]())
    }
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transform_langastTypedMethod(ctx: Context, o: org.sireum.lang.ast.Typed.Method): TPostResult[Context, org.sireum.lang.ast.Typed.Method] = {
    val preR: PreResult[Context, org.sireum.lang.ast.Typed.Method] = pp.pre_langastTypedMethod(ctx, o) match {
     case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.Typed.Method)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.Typed.Method](r))
     case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Typed.Method")
     case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.Typed.Method]())
    }
    val r: TPostResult[Context, org.sireum.lang.ast.Typed.Method] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Typed.Method = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, org.sireum.lang.ast.Typed.Fun] = transform_langastTypedFun(preR.ctx, o2.tpe)
      if (hasChanged || r0.resultOpt.nonEmpty)
        TPostResult(r0.ctx, Some(o2(tpe = r0.resultOpt.getOrElse(o2.tpe))))
      else
        TPostResult(r0.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.Typed.Method = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.Typed.Method] = pp.post_langastTypedMethod(r.ctx, o2) match {
     case TPostResult(postCtx, Some(result: org.sireum.lang.ast.Typed.Method)) => TPostResult(postCtx, Some[org.sireum.lang.ast.Typed.Method](result))
     case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Typed.Method")
     case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.Typed.Method]())
    }
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

  @pure def transform_langastStmtMethod(ctx: Context, o: org.sireum.lang.ast.Stmt.Method): TPostResult[Context, org.sireum.lang.ast.Stmt.Method] = {
    val preR: PreResult[Context, org.sireum.lang.ast.Stmt.Method] = pp.pre_langastStmtMethod(ctx, o) match {
     case PreResult(preCtx, continu, Some(r: org.sireum.lang.ast.Stmt.Method)) => PreResult(preCtx, continu, Some[org.sireum.lang.ast.Stmt.Method](r))
     case PreResult(_, _, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Stmt.Method")
     case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[org.sireum.lang.ast.Stmt.Method]())
    }
    val r: TPostResult[Context, org.sireum.lang.ast.Stmt.Method] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Stmt.Method = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: TPostResult[Context, org.sireum.lang.ast.MethodSig] = transform_langastMethodSig(preR.ctx, o2.sig)
      val r1: TPostResult[Context, org.sireum.lang.ast.MethodContract] = transform_langastMethodContract(r0.ctx, o2.mcontract)
      val r2: TPostResult[Context, Option[org.sireum.lang.ast.Body]] = transformOption(r1.ctx, o2.bodyOpt, transform_langastBody _)
      val r3: TPostResult[Context, org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(r2.ctx, o2.attr)
      if (hasChanged || r0.resultOpt.nonEmpty || r1.resultOpt.nonEmpty || r2.resultOpt.nonEmpty || r3.resultOpt.nonEmpty)
        TPostResult(r3.ctx, Some(o2(sig = r0.resultOpt.getOrElse(o2.sig), mcontract = r1.resultOpt.getOrElse(o2.mcontract), bodyOpt = r2.resultOpt.getOrElse(o2.bodyOpt), attr = r3.resultOpt.getOrElse(o2.attr))))
      else
        TPostResult(r3.ctx, None())
    } else if (preR.resultOpt.nonEmpty) {
      TPostResult(preR.ctx, Some(preR.resultOpt.getOrElse(o)))
    } else {
      TPostResult(preR.ctx, None())
    }
    val hasChanged: B = r.resultOpt.nonEmpty
    val o2: org.sireum.lang.ast.Stmt.Method = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, org.sireum.lang.ast.Stmt.Method] = pp.post_langastStmtMethod(r.ctx, o2) match {
     case TPostResult(postCtx, Some(result: org.sireum.lang.ast.Stmt.Method)) => TPostResult(postCtx, Some[org.sireum.lang.ast.Stmt.Method](result))
     case TPostResult(_, Some(_)) => halt("Can only produce object of type org.sireum.lang.ast.Stmt.Method")
     case TPostResult(postCtx, _) => TPostResult(postCtx, None[org.sireum.lang.ast.Stmt.Method]())
    }
    if (postR.resultOpt.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return TPostResult(postR.ctx, Some(o2))
    } else {
      return TPostResult(postR.ctx, None())
    }
  }

  @pure def transformValueProp(ctx: Context, o: ValueProp): TPostResult[Context, ValueProp] = {
    val preR: PreResult[Context, ValueProp] = pp.preValueProp(ctx, o) match {
     case PreResult(preCtx, continu, Some(r: ValueProp)) => PreResult(preCtx, continu, Some[ValueProp](r))
     case PreResult(_, _, Some(_)) => halt("Can only produce object of type ValueProp")
     case PreResult(preCtx, continu, _) => PreResult(preCtx, continu, None[ValueProp]())
    }
    val r: TPostResult[Context, ValueProp] = if (preR.continu) {
      val o2: ValueProp = preR.resultOpt.getOrElse(o)
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
    val o2: ValueProp = r.resultOpt.getOrElse(o)
    val postR: TPostResult[Context, ValueProp] = pp.postValueProp(r.ctx, o2) match {
     case TPostResult(postCtx, Some(result: ValueProp)) => TPostResult(postCtx, Some[ValueProp](result))
     case TPostResult(_, Some(_)) => halt("Can only produce object of type ValueProp")
     case TPostResult(postCtx, _) => TPostResult(postCtx, None[ValueProp]())
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