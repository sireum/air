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

// This file is auto-generated from AadlAST.scala, BlessAST.scala, Emv2AST.scala, GumboAST.scala, SmfAST.scala, AST.scala, Typed.scala

package org.sireum.hamr.ir

import org.sireum._

object MTransformer {

  @record class PreResult[T](val continu: B,
                             val resultOpt: MOption[T])

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

  val PreResult_langastTopUnitProgram: PreResult[org.sireum.lang.ast.TopUnit] = PreResult(T, MNone())

  val PostResult_langastTopUnitProgram: MOption[org.sireum.lang.ast.TopUnit] = MNone()

  val PreResult_langastTopUnitSequentUnit: PreResult[org.sireum.lang.ast.TopUnit] = PreResult(T, MNone())

  val PostResult_langastTopUnitSequentUnit: MOption[org.sireum.lang.ast.TopUnit] = MNone()

  val PreResult_langastTopUnitTruthTableUnit: PreResult[org.sireum.lang.ast.TopUnit] = PreResult(T, MNone())

  val PostResult_langastTopUnitTruthTableUnit: MOption[org.sireum.lang.ast.TopUnit] = MNone()

  val PreResult_langastLoopContract: PreResult[org.sireum.lang.ast.LoopContract] = PreResult(T, MNone())

  val PostResult_langastLoopContract: MOption[org.sireum.lang.ast.LoopContract] = MNone()

  val PreResult_langastStmtImport: PreResult[org.sireum.lang.ast.Stmt] = PreResult(T, MNone())

  val PostResult_langastStmtImport: MOption[org.sireum.lang.ast.Stmt] = MNone()

  val PreResult_langastStmtImportImporter: PreResult[org.sireum.lang.ast.Stmt.Import.Importer] = PreResult(T, MNone())

  val PostResult_langastStmtImportImporter: MOption[org.sireum.lang.ast.Stmt.Import.Importer] = MNone()

  val PreResult_langastStmtImportMultiSelector: PreResult[org.sireum.lang.ast.Stmt.Import.Selector] = PreResult(T, MNone())

  val PostResult_langastStmtImportMultiSelector: MOption[org.sireum.lang.ast.Stmt.Import.Selector] = MNone()

  val PreResult_langastStmtImportWildcardSelector: PreResult[org.sireum.lang.ast.Stmt.Import.Selector] = PreResult(T, MNone())

  val PostResult_langastStmtImportWildcardSelector: MOption[org.sireum.lang.ast.Stmt.Import.Selector] = MNone()

  val PreResult_langastStmtImportNamedSelector: PreResult[org.sireum.lang.ast.Stmt.Import.NamedSelector] = PreResult(T, MNone())

  val PostResult_langastStmtImportNamedSelector: MOption[org.sireum.lang.ast.Stmt.Import.NamedSelector] = MNone()

  val PreResult_langastStmtVar: PreResult[org.sireum.lang.ast.Stmt] = PreResult(T, MNone())

  val PostResult_langastStmtVar: MOption[org.sireum.lang.ast.Stmt] = MNone()

  val PreResult_langastStmtVarPattern: PreResult[org.sireum.lang.ast.Stmt] = PreResult(T, MNone())

  val PostResult_langastStmtVarPattern: MOption[org.sireum.lang.ast.Stmt] = MNone()

  val PreResult_langastStmtSpecVar: PreResult[org.sireum.lang.ast.Stmt] = PreResult(T, MNone())

  val PostResult_langastStmtSpecVar: MOption[org.sireum.lang.ast.Stmt] = MNone()

  val PreResult_langastStmtMethod: PreResult[org.sireum.lang.ast.Stmt] = PreResult(T, MNone())

  val PostResult_langastStmtMethod: MOption[org.sireum.lang.ast.Stmt] = MNone()

  val PreResult_langastStmtExtMethod: PreResult[org.sireum.lang.ast.Stmt] = PreResult(T, MNone())

  val PostResult_langastStmtExtMethod: MOption[org.sireum.lang.ast.Stmt] = MNone()

  val PreResult_langastStmtJustMethod: PreResult[org.sireum.lang.ast.Stmt] = PreResult(T, MNone())

  val PostResult_langastStmtJustMethod: MOption[org.sireum.lang.ast.Stmt] = MNone()

  val PreResult_langastStmtSpecMethod: PreResult[org.sireum.lang.ast.Stmt] = PreResult(T, MNone())

  val PostResult_langastStmtSpecMethod: MOption[org.sireum.lang.ast.Stmt] = MNone()

  val PreResult_langastStmtEnum: PreResult[org.sireum.lang.ast.Stmt] = PreResult(T, MNone())

  val PostResult_langastStmtEnum: MOption[org.sireum.lang.ast.Stmt] = MNone()

  val PreResult_langastStmtSubZ: PreResult[org.sireum.lang.ast.Stmt] = PreResult(T, MNone())

  val PostResult_langastStmtSubZ: MOption[org.sireum.lang.ast.Stmt] = MNone()

  val PreResult_langastStmtObject: PreResult[org.sireum.lang.ast.Stmt] = PreResult(T, MNone())

  val PostResult_langastStmtObject: MOption[org.sireum.lang.ast.Stmt] = MNone()

  val PreResult_langastStmtSig: PreResult[org.sireum.lang.ast.Stmt] = PreResult(T, MNone())

  val PostResult_langastStmtSig: MOption[org.sireum.lang.ast.Stmt] = MNone()

  val PreResult_langastStmtAdt: PreResult[org.sireum.lang.ast.Stmt] = PreResult(T, MNone())

  val PostResult_langastStmtAdt: MOption[org.sireum.lang.ast.Stmt] = MNone()

  val PreResult_langastStmtTypeAlias: PreResult[org.sireum.lang.ast.Stmt] = PreResult(T, MNone())

  val PostResult_langastStmtTypeAlias: MOption[org.sireum.lang.ast.Stmt] = MNone()

  val PreResult_langastStmtAssign: PreResult[org.sireum.lang.ast.Stmt] = PreResult(T, MNone())

  val PostResult_langastStmtAssign: MOption[org.sireum.lang.ast.Stmt] = MNone()

  val PreResult_langastStmtBlock: PreResult[org.sireum.lang.ast.Stmt] = PreResult(T, MNone())

  val PostResult_langastStmtBlock: MOption[org.sireum.lang.ast.Stmt] = MNone()

  val PreResult_langastStmtIf: PreResult[org.sireum.lang.ast.Stmt] = PreResult(T, MNone())

  val PostResult_langastStmtIf: MOption[org.sireum.lang.ast.Stmt] = MNone()

  val PreResult_langastStmtMatch: PreResult[org.sireum.lang.ast.Stmt] = PreResult(T, MNone())

  val PostResult_langastStmtMatch: MOption[org.sireum.lang.ast.Stmt] = MNone()

  val PreResult_langastStmtWhile: PreResult[org.sireum.lang.ast.Stmt] = PreResult(T, MNone())

  val PostResult_langastStmtWhile: MOption[org.sireum.lang.ast.Stmt] = MNone()

  val PreResult_langastStmtDoWhile: PreResult[org.sireum.lang.ast.Stmt] = PreResult(T, MNone())

  val PostResult_langastStmtDoWhile: MOption[org.sireum.lang.ast.Stmt] = MNone()

  val PreResult_langastStmtFor: PreResult[org.sireum.lang.ast.Stmt] = PreResult(T, MNone())

  val PostResult_langastStmtFor: MOption[org.sireum.lang.ast.Stmt] = MNone()

  val PreResult_langastStmtReturn: PreResult[org.sireum.lang.ast.Stmt] = PreResult(T, MNone())

  val PostResult_langastStmtReturn: MOption[org.sireum.lang.ast.Stmt] = MNone()

  val PreResult_langastStmtExpr: PreResult[org.sireum.lang.ast.Stmt] = PreResult(T, MNone())

  val PostResult_langastStmtExpr: MOption[org.sireum.lang.ast.Stmt] = MNone()

  val PreResult_langastStmtFact: PreResult[org.sireum.lang.ast.Stmt.Spec] = PreResult(T, MNone())

  val PostResult_langastStmtFact: MOption[org.sireum.lang.ast.Stmt.Spec] = MNone()

  val PreResult_langastStmtInv: PreResult[org.sireum.lang.ast.Stmt.Spec] = PreResult(T, MNone())

  val PostResult_langastStmtInv: MOption[org.sireum.lang.ast.Stmt.Spec] = MNone()

  val PreResult_langastStmtTheorem: PreResult[org.sireum.lang.ast.Stmt.Spec] = PreResult(T, MNone())

  val PostResult_langastStmtTheorem: MOption[org.sireum.lang.ast.Stmt.Spec] = MNone()

  val PreResult_langastStmtDataRefinement: PreResult[org.sireum.lang.ast.Stmt.Spec] = PreResult(T, MNone())

  val PostResult_langastStmtDataRefinement: MOption[org.sireum.lang.ast.Stmt.Spec] = MNone()

  val PreResult_langastStmtSpecLabel: PreResult[org.sireum.lang.ast.Stmt.Spec] = PreResult(T, MNone())

  val PostResult_langastStmtSpecLabel: MOption[org.sireum.lang.ast.Stmt.Spec] = MNone()

  val PreResult_langastStmtSpecBlock: PreResult[org.sireum.lang.ast.Stmt.Spec] = PreResult(T, MNone())

  val PostResult_langastStmtSpecBlock: MOption[org.sireum.lang.ast.Stmt.Spec] = MNone()

  val PreResult_langastStmtDeduceSequent: PreResult[org.sireum.lang.ast.Stmt.Spec] = PreResult(T, MNone())

  val PostResult_langastStmtDeduceSequent: MOption[org.sireum.lang.ast.Stmt.Spec] = MNone()

  val PreResult_langastStmtDeduceSteps: PreResult[org.sireum.lang.ast.Stmt.Spec] = PreResult(T, MNone())

  val PostResult_langastStmtDeduceSteps: MOption[org.sireum.lang.ast.Stmt.Spec] = MNone()

  val PreResult_langastStmtHavoc: PreResult[org.sireum.lang.ast.Stmt.Spec] = PreResult(T, MNone())

  val PostResult_langastStmtHavoc: MOption[org.sireum.lang.ast.Stmt.Spec] = MNone()

  val PreResult_langastMethodContractAccesses: PreResult[org.sireum.lang.ast.MethodContract.Accesses] = PreResult(T, MNone())

  val PostResult_langastMethodContractAccesses: MOption[org.sireum.lang.ast.MethodContract.Accesses] = MNone()

  val PreResult_langastMethodContractClaims: PreResult[org.sireum.lang.ast.MethodContract.Claims] = PreResult(T, MNone())

  val PostResult_langastMethodContractClaims: MOption[org.sireum.lang.ast.MethodContract.Claims] = MNone()

  val PreResult_langastMethodContractSimple: PreResult[org.sireum.lang.ast.MethodContract] = PreResult(T, MNone())

  val PostResult_langastMethodContractSimple: MOption[org.sireum.lang.ast.MethodContract] = MNone()

  val PreResult_langastMethodContractCases: PreResult[org.sireum.lang.ast.MethodContract] = PreResult(T, MNone())

  val PostResult_langastMethodContractCases: MOption[org.sireum.lang.ast.MethodContract] = MNone()

  val PreResult_langastMethodContractCase: PreResult[org.sireum.lang.ast.MethodContract.Case] = PreResult(T, MNone())

  val PostResult_langastMethodContractCase: MOption[org.sireum.lang.ast.MethodContract.Case] = MNone()

  val PreResult_langastSequent: PreResult[org.sireum.lang.ast.Sequent] = PreResult(T, MNone())

  val PostResult_langastSequent: MOption[org.sireum.lang.ast.Sequent] = MNone()

  val PreResult_langastProofAst: PreResult[org.sireum.lang.ast.ProofAst] = PreResult(T, MNone())

  val PostResult_langastProofAst: MOption[org.sireum.lang.ast.ProofAst] = MNone()

  val PreResult_langastProofAstStepIdNum: PreResult[org.sireum.lang.ast.ProofAst.StepId] = PreResult(T, MNone())

  val PostResult_langastProofAstStepIdNum: MOption[org.sireum.lang.ast.ProofAst.StepId] = MNone()

  val PreResult_langastProofAstStepIdStr: PreResult[org.sireum.lang.ast.ProofAst.StepId] = PreResult(T, MNone())

  val PostResult_langastProofAstStepIdStr: MOption[org.sireum.lang.ast.ProofAst.StepId] = MNone()

  val PreResult_langastProofAstStepRegular: PreResult[org.sireum.lang.ast.ProofAst.Step] = PreResult(T, MNone())

  val PostResult_langastProofAstStepRegular: MOption[org.sireum.lang.ast.ProofAst.Step] = MNone()

  val PreResult_langastProofAstStepAssume: PreResult[org.sireum.lang.ast.ProofAst.Step] = PreResult(T, MNone())

  val PostResult_langastProofAstStepAssume: MOption[org.sireum.lang.ast.ProofAst.Step] = MNone()

  val PreResult_langastProofAstStepAssert: PreResult[org.sireum.lang.ast.ProofAst.Step] = PreResult(T, MNone())

  val PostResult_langastProofAstStepAssert: MOption[org.sireum.lang.ast.ProofAst.Step] = MNone()

  val PreResult_langastProofAstStepSubProof: PreResult[org.sireum.lang.ast.ProofAst.Step] = PreResult(T, MNone())

  val PostResult_langastProofAstStepSubProof: MOption[org.sireum.lang.ast.ProofAst.Step] = MNone()

  val PreResult_langastProofAstStepLet: PreResult[org.sireum.lang.ast.ProofAst.Step] = PreResult(T, MNone())

  val PostResult_langastProofAstStepLet: MOption[org.sireum.lang.ast.ProofAst.Step] = MNone()

  val PreResult_langastProofAstStepLetParam: PreResult[org.sireum.lang.ast.ProofAst.Step.Let.Param] = PreResult(T, MNone())

  val PostResult_langastProofAstStepLetParam: MOption[org.sireum.lang.ast.ProofAst.Step.Let.Param] = MNone()

  val PreResult_langastProofAstStepStructInduction: PreResult[org.sireum.lang.ast.ProofAst.Step] = PreResult(T, MNone())

  val PostResult_langastProofAstStepStructInduction: MOption[org.sireum.lang.ast.ProofAst.Step] = MNone()

  val PreResult_langastProofAstStepStructInductionMatchCase: PreResult[org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase] = PreResult(T, MNone())

  val PostResult_langastProofAstStepStructInductionMatchCase: MOption[org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase] = MNone()

  val PreResult_langastProofAstStepStructInductionMatchDefault: PreResult[org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault] = PreResult(T, MNone())

  val PostResult_langastProofAstStepStructInductionMatchDefault: MOption[org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault] = MNone()

  val PreResult_langastProofAstStepJustificationApply: PreResult[org.sireum.lang.ast.ProofAst.Step.Justification] = PreResult(T, MNone())

  val PostResult_langastProofAstStepJustificationApply: MOption[org.sireum.lang.ast.ProofAst.Step.Justification] = MNone()

  val PreResult_langastProofAstStepJustificationIncept: PreResult[org.sireum.lang.ast.ProofAst.Step.Inception] = PreResult(T, MNone())

  val PostResult_langastProofAstStepJustificationIncept: MOption[org.sireum.lang.ast.ProofAst.Step.Inception] = MNone()

  val PreResult_langastProofAstStepJustificationInceptNamed: PreResult[org.sireum.lang.ast.ProofAst.Step.Inception] = PreResult(T, MNone())

  val PostResult_langastProofAstStepJustificationInceptNamed: MOption[org.sireum.lang.ast.ProofAst.Step.Inception] = MNone()

  val PreResult_langastProofAstStepJustificationInceptEta: PreResult[org.sireum.lang.ast.ProofAst.Step.Inception] = PreResult(T, MNone())

  val PostResult_langastProofAstStepJustificationInceptEta: MOption[org.sireum.lang.ast.ProofAst.Step.Inception] = MNone()

  val PreResult_langastCase: PreResult[org.sireum.lang.ast.Case] = PreResult(T, MNone())

  val PostResult_langastCase: MOption[org.sireum.lang.ast.Case] = MNone()

  val PreResult_langastEnumGenRangeExpr: PreResult[org.sireum.lang.ast.EnumGen.Range] = PreResult(T, MNone())

  val PostResult_langastEnumGenRangeExpr: MOption[org.sireum.lang.ast.EnumGen.Range] = MNone()

  val PreResult_langastEnumGenRangeStep: PreResult[org.sireum.lang.ast.EnumGen.Range] = PreResult(T, MNone())

  val PostResult_langastEnumGenRangeStep: MOption[org.sireum.lang.ast.EnumGen.Range] = MNone()

  val PreResult_langastEnumGenFor: PreResult[org.sireum.lang.ast.EnumGen.For] = PreResult(T, MNone())

  val PostResult_langastEnumGenFor: MOption[org.sireum.lang.ast.EnumGen.For] = MNone()

  val PreResult_langastTypeNamed: PreResult[org.sireum.lang.ast.Type] = PreResult(T, MNone())

  val PostResult_langastTypeNamed: MOption[org.sireum.lang.ast.Type] = MNone()

  val PreResult_langastTypeFun: PreResult[org.sireum.lang.ast.Type] = PreResult(T, MNone())

  val PostResult_langastTypeFun: MOption[org.sireum.lang.ast.Type] = MNone()

  val PreResult_langastTypeTuple: PreResult[org.sireum.lang.ast.Type] = PreResult(T, MNone())

  val PostResult_langastTypeTuple: MOption[org.sireum.lang.ast.Type] = MNone()

  val PreResult_langastPatternLiteral: PreResult[org.sireum.lang.ast.Pattern] = PreResult(T, MNone())

  val PostResult_langastPatternLiteral: MOption[org.sireum.lang.ast.Pattern] = MNone()

  val PreResult_langastPatternLitInterpolate: PreResult[org.sireum.lang.ast.Pattern] = PreResult(T, MNone())

  val PostResult_langastPatternLitInterpolate: MOption[org.sireum.lang.ast.Pattern] = MNone()

  val PreResult_langastPatternRef: PreResult[org.sireum.lang.ast.Pattern] = PreResult(T, MNone())

  val PostResult_langastPatternRef: MOption[org.sireum.lang.ast.Pattern] = MNone()

  val PreResult_langastPatternVarBinding: PreResult[org.sireum.lang.ast.Pattern] = PreResult(T, MNone())

  val PostResult_langastPatternVarBinding: MOption[org.sireum.lang.ast.Pattern] = MNone()

  val PreResult_langastPatternWildcard: PreResult[org.sireum.lang.ast.Pattern] = PreResult(T, MNone())

  val PostResult_langastPatternWildcard: MOption[org.sireum.lang.ast.Pattern] = MNone()

  val PreResult_langastPatternSeqWildcard: PreResult[org.sireum.lang.ast.Pattern] = PreResult(T, MNone())

  val PostResult_langastPatternSeqWildcard: MOption[org.sireum.lang.ast.Pattern] = MNone()

  val PreResult_langastPatternStructure: PreResult[org.sireum.lang.ast.Pattern] = PreResult(T, MNone())

  val PostResult_langastPatternStructure: MOption[org.sireum.lang.ast.Pattern] = MNone()

  val PreResult_langastExpLitB: PreResult[org.sireum.lang.ast.Exp] = PreResult(T, MNone())

  val PostResult_langastExpLitB: MOption[org.sireum.lang.ast.Exp] = MNone()

  val PreResult_langastExpLitC: PreResult[org.sireum.lang.ast.Exp] = PreResult(T, MNone())

  val PostResult_langastExpLitC: MOption[org.sireum.lang.ast.Exp] = MNone()

  val PreResult_langastExpLitZ: PreResult[org.sireum.lang.ast.Exp] = PreResult(T, MNone())

  val PostResult_langastExpLitZ: MOption[org.sireum.lang.ast.Exp] = MNone()

  val PreResult_langastExpLitF32: PreResult[org.sireum.lang.ast.Exp] = PreResult(T, MNone())

  val PostResult_langastExpLitF32: MOption[org.sireum.lang.ast.Exp] = MNone()

  val PreResult_langastExpLitF64: PreResult[org.sireum.lang.ast.Exp] = PreResult(T, MNone())

  val PostResult_langastExpLitF64: MOption[org.sireum.lang.ast.Exp] = MNone()

  val PreResult_langastExpLitR: PreResult[org.sireum.lang.ast.Exp] = PreResult(T, MNone())

  val PostResult_langastExpLitR: MOption[org.sireum.lang.ast.Exp] = MNone()

  val PreResult_langastExpLitString: PreResult[org.sireum.lang.ast.Exp] = PreResult(T, MNone())

  val PostResult_langastExpLitString: MOption[org.sireum.lang.ast.Exp] = MNone()

  val PreResult_langastExpLitStepId: PreResult[org.sireum.lang.ast.Exp] = PreResult(T, MNone())

  val PostResult_langastExpLitStepId: MOption[org.sireum.lang.ast.Exp] = MNone()

  val PreResult_langastExpStringInterpolate: PreResult[org.sireum.lang.ast.Exp] = PreResult(T, MNone())

  val PostResult_langastExpStringInterpolate: MOption[org.sireum.lang.ast.Exp] = MNone()

  val PreResult_langastExpThis: PreResult[org.sireum.lang.ast.Exp] = PreResult(T, MNone())

  val PostResult_langastExpThis: MOption[org.sireum.lang.ast.Exp] = MNone()

  val PreResult_langastExpSuper: PreResult[org.sireum.lang.ast.Exp] = PreResult(T, MNone())

  val PostResult_langastExpSuper: MOption[org.sireum.lang.ast.Exp] = MNone()

  val PreResult_langastExpUnary: PreResult[org.sireum.lang.ast.Exp] = PreResult(T, MNone())

  val PostResult_langastExpUnary: MOption[org.sireum.lang.ast.Exp] = MNone()

  val PreResult_langastExpBinary: PreResult[org.sireum.lang.ast.Exp] = PreResult(T, MNone())

  val PostResult_langastExpBinary: MOption[org.sireum.lang.ast.Exp] = MNone()

  val PreResult_langastExpIdent: PreResult[org.sireum.lang.ast.Exp] = PreResult(T, MNone())

  val PostResult_langastExpIdent: MOption[org.sireum.lang.ast.Exp] = MNone()

  val PreResult_langastExpEta: PreResult[org.sireum.lang.ast.Exp] = PreResult(T, MNone())

  val PostResult_langastExpEta: MOption[org.sireum.lang.ast.Exp] = MNone()

  val PreResult_langastExpTuple: PreResult[org.sireum.lang.ast.Exp] = PreResult(T, MNone())

  val PostResult_langastExpTuple: MOption[org.sireum.lang.ast.Exp] = MNone()

  val PreResult_langastExpSelect: PreResult[org.sireum.lang.ast.Exp] = PreResult(T, MNone())

  val PostResult_langastExpSelect: MOption[org.sireum.lang.ast.Exp] = MNone()

  val PreResult_langastExpInvoke: PreResult[org.sireum.lang.ast.Exp] = PreResult(T, MNone())

  val PostResult_langastExpInvoke: MOption[org.sireum.lang.ast.Exp] = MNone()

  val PreResult_langastExpInvokeNamed: PreResult[org.sireum.lang.ast.Exp] = PreResult(T, MNone())

  val PostResult_langastExpInvokeNamed: MOption[org.sireum.lang.ast.Exp] = MNone()

  val PreResult_langastExpIf: PreResult[org.sireum.lang.ast.Exp] = PreResult(T, MNone())

  val PostResult_langastExpIf: MOption[org.sireum.lang.ast.Exp] = MNone()

  val PreResult_langastExpFunParam: PreResult[org.sireum.lang.ast.Exp.Fun.Param] = PreResult(T, MNone())

  val PostResult_langastExpFunParam: MOption[org.sireum.lang.ast.Exp.Fun.Param] = MNone()

  val PreResult_langastExpFun: PreResult[org.sireum.lang.ast.Exp] = PreResult(T, MNone())

  val PostResult_langastExpFun: MOption[org.sireum.lang.ast.Exp] = MNone()

  val PreResult_langastExpForYield: PreResult[org.sireum.lang.ast.Exp] = PreResult(T, MNone())

  val PostResult_langastExpForYield: MOption[org.sireum.lang.ast.Exp] = MNone()

  val PreResult_langastExpQuantType: PreResult[org.sireum.lang.ast.Exp.Quant] = PreResult(T, MNone())

  val PostResult_langastExpQuantType: MOption[org.sireum.lang.ast.Exp.Quant] = MNone()

  val PreResult_langastExpQuantRange: PreResult[org.sireum.lang.ast.Exp.Quant] = PreResult(T, MNone())

  val PostResult_langastExpQuantRange: MOption[org.sireum.lang.ast.Exp.Quant] = MNone()

  val PreResult_langastExpQuantEach: PreResult[org.sireum.lang.ast.Exp.Quant] = PreResult(T, MNone())

  val PostResult_langastExpQuantEach: MOption[org.sireum.lang.ast.Exp.Quant] = MNone()

  val PreResult_langastExpInput: PreResult[org.sireum.lang.ast.Exp] = PreResult(T, MNone())

  val PostResult_langastExpInput: MOption[org.sireum.lang.ast.Exp] = MNone()

  val PreResult_langastExpOldVal: PreResult[org.sireum.lang.ast.Exp] = PreResult(T, MNone())

  val PostResult_langastExpOldVal: MOption[org.sireum.lang.ast.Exp] = MNone()

  val PreResult_langastExpLoopIndex: PreResult[org.sireum.lang.ast.Exp] = PreResult(T, MNone())

  val PostResult_langastExpLoopIndex: MOption[org.sireum.lang.ast.Exp] = MNone()

  val PreResult_langastExpStateSeq: PreResult[org.sireum.lang.ast.Exp] = PreResult(T, MNone())

  val PostResult_langastExpStateSeq: MOption[org.sireum.lang.ast.Exp] = MNone()

  val PreResult_langastExpStateSeqFragment: PreResult[org.sireum.lang.ast.Exp.StateSeq.Fragment] = PreResult(T, MNone())

  val PostResult_langastExpStateSeqFragment: MOption[org.sireum.lang.ast.Exp.StateSeq.Fragment] = MNone()

  val PreResult_langastExpResult: PreResult[org.sireum.lang.ast.Exp] = PreResult(T, MNone())

  val PostResult_langastExpResult: MOption[org.sireum.lang.ast.Exp] = MNone()

  val PreResult_langastNamedArg: PreResult[org.sireum.lang.ast.NamedArg] = PreResult(T, MNone())

  val PostResult_langastNamedArg: MOption[org.sireum.lang.ast.NamedArg] = MNone()

  val PreResult_langastId: PreResult[org.sireum.lang.ast.Id] = PreResult(T, MNone())

  val PostResult_langastId: MOption[org.sireum.lang.ast.Id] = MNone()

  val PreResult_langastName: PreResult[org.sireum.lang.ast.Name] = PreResult(T, MNone())

  val PostResult_langastName: MOption[org.sireum.lang.ast.Name] = MNone()

  val PreResult_langastBody: PreResult[org.sireum.lang.ast.Body] = PreResult(T, MNone())

  val PostResult_langastBody: MOption[org.sireum.lang.ast.Body] = MNone()

  val PreResult_langastAdtParam: PreResult[org.sireum.lang.ast.AdtParam] = PreResult(T, MNone())

  val PostResult_langastAdtParam: MOption[org.sireum.lang.ast.AdtParam] = MNone()

  val PreResult_langastMethodSig: PreResult[org.sireum.lang.ast.MethodSig] = PreResult(T, MNone())

  val PostResult_langastMethodSig: MOption[org.sireum.lang.ast.MethodSig] = MNone()

  val PreResult_langastParam: PreResult[org.sireum.lang.ast.Param] = PreResult(T, MNone())

  val PostResult_langastParam: MOption[org.sireum.lang.ast.Param] = MNone()

  val PreResult_langastTypeParam: PreResult[org.sireum.lang.ast.TypeParam] = PreResult(T, MNone())

  val PostResult_langastTypeParam: MOption[org.sireum.lang.ast.TypeParam] = MNone()

  val PreResult_langastAttr: PreResult[org.sireum.lang.ast.Attr] = PreResult(T, MNone())

  val PostResult_langastAttr: MOption[org.sireum.lang.ast.Attr] = MNone()

  val PreResult_langastTypedAttr: PreResult[org.sireum.lang.ast.TypedAttr] = PreResult(T, MNone())

  val PostResult_langastTypedAttr: MOption[org.sireum.lang.ast.TypedAttr] = MNone()

  val PreResult_langastResolvedAttr: PreResult[org.sireum.lang.ast.ResolvedAttr] = PreResult(T, MNone())

  val PostResult_langastResolvedAttr: MOption[org.sireum.lang.ast.ResolvedAttr] = MNone()

  val PreResult_langastResolvedInfoBuiltIn: PreResult[org.sireum.lang.ast.ResolvedInfo] = PreResult(T, MNone())

  val PostResult_langastResolvedInfoBuiltIn: MOption[org.sireum.lang.ast.ResolvedInfo] = MNone()

  val PreResult_langastResolvedInfoPackage: PreResult[org.sireum.lang.ast.ResolvedInfo] = PreResult(T, MNone())

  val PostResult_langastResolvedInfoPackage: MOption[org.sireum.lang.ast.ResolvedInfo] = MNone()

  val PreResult_langastResolvedInfoEnum: PreResult[org.sireum.lang.ast.ResolvedInfo] = PreResult(T, MNone())

  val PostResult_langastResolvedInfoEnum: MOption[org.sireum.lang.ast.ResolvedInfo] = MNone()

  val PreResult_langastResolvedInfoEnumElement: PreResult[org.sireum.lang.ast.ResolvedInfo] = PreResult(T, MNone())

  val PostResult_langastResolvedInfoEnumElement: MOption[org.sireum.lang.ast.ResolvedInfo] = MNone()

  val PreResult_langastResolvedInfoObject: PreResult[org.sireum.lang.ast.ResolvedInfo] = PreResult(T, MNone())

  val PostResult_langastResolvedInfoObject: MOption[org.sireum.lang.ast.ResolvedInfo] = MNone()

  val PreResult_langastResolvedInfoVar: PreResult[org.sireum.lang.ast.ResolvedInfo] = PreResult(T, MNone())

  val PostResult_langastResolvedInfoVar: MOption[org.sireum.lang.ast.ResolvedInfo] = MNone()

  val PreResult_langastResolvedInfoMethod: PreResult[org.sireum.lang.ast.ResolvedInfo] = PreResult(T, MNone())

  val PostResult_langastResolvedInfoMethod: MOption[org.sireum.lang.ast.ResolvedInfo] = MNone()

  val PreResult_langastResolvedInfoMethods: PreResult[org.sireum.lang.ast.ResolvedInfo] = PreResult(T, MNone())

  val PostResult_langastResolvedInfoMethods: MOption[org.sireum.lang.ast.ResolvedInfo] = MNone()

  val PreResult_langastResolvedInfoTuple: PreResult[org.sireum.lang.ast.ResolvedInfo] = PreResult(T, MNone())

  val PostResult_langastResolvedInfoTuple: MOption[org.sireum.lang.ast.ResolvedInfo] = MNone()

  val PreResult_langastResolvedInfoLocalVar: PreResult[org.sireum.lang.ast.ResolvedInfo] = PreResult(T, MNone())

  val PostResult_langastResolvedInfoLocalVar: MOption[org.sireum.lang.ast.ResolvedInfo] = MNone()

  val PreResult_langastResolvedInfoFact: PreResult[org.sireum.lang.ast.ResolvedInfo] = PreResult(T, MNone())

  val PostResult_langastResolvedInfoFact: MOption[org.sireum.lang.ast.ResolvedInfo] = MNone()

  val PreResult_langastResolvedInfoTheorem: PreResult[org.sireum.lang.ast.ResolvedInfo] = PreResult(T, MNone())

  val PostResult_langastResolvedInfoTheorem: MOption[org.sireum.lang.ast.ResolvedInfo] = MNone()

  val PreResult_langastResolvedInfoInv: PreResult[org.sireum.lang.ast.ResolvedInfo] = PreResult(T, MNone())

  val PostResult_langastResolvedInfoInv: MOption[org.sireum.lang.ast.ResolvedInfo] = MNone()

  val PreResult_langastTruthTableRow: PreResult[org.sireum.lang.ast.TruthTable.Row] = PreResult(T, MNone())

  val PostResult_langastTruthTableRow: MOption[org.sireum.lang.ast.TruthTable.Row] = MNone()

  val PreResult_langastTruthTableAssignment: PreResult[org.sireum.lang.ast.TruthTable.Assignment] = PreResult(T, MNone())

  val PostResult_langastTruthTableAssignment: MOption[org.sireum.lang.ast.TruthTable.Assignment] = MNone()

  val PreResult_langastTruthTableConclusionValidity: PreResult[org.sireum.lang.ast.TruthTable.Conclusion] = PreResult(T, MNone())

  val PostResult_langastTruthTableConclusionValidity: MOption[org.sireum.lang.ast.TruthTable.Conclusion] = MNone()

  val PreResult_langastTruthTableConclusionTautology: PreResult[org.sireum.lang.ast.TruthTable.Conclusion] = PreResult(T, MNone())

  val PostResult_langastTruthTableConclusionTautology: MOption[org.sireum.lang.ast.TruthTable.Conclusion] = MNone()

  val PreResult_langastTruthTableConclusionContradictory: PreResult[org.sireum.lang.ast.TruthTable.Conclusion] = PreResult(T, MNone())

  val PostResult_langastTruthTableConclusionContradictory: MOption[org.sireum.lang.ast.TruthTable.Conclusion] = MNone()

  val PreResult_langastTruthTableConclusionContingent: PreResult[org.sireum.lang.ast.TruthTable.Conclusion] = PreResult(T, MNone())

  val PostResult_langastTruthTableConclusionContingent: MOption[org.sireum.lang.ast.TruthTable.Conclusion] = MNone()

  val PreResultSmfClause: PreResult[SmfClause] = PreResult(T, MNone())

  val PostResultSmfClause: MOption[SmfClause] = MNone()

  val PreResultSmfClassification: PreResult[SmfClassification] = PreResult(T, MNone())

  val PostResultSmfClassification: MOption[SmfClassification] = MNone()

  val PreResultSmfDeclass: PreResult[SmfDeclass] = PreResult(T, MNone())

  val PostResultSmfDeclass: MOption[SmfDeclass] = MNone()

  val PreResultSmfLibrary: PreResult[SmfLibrary] = PreResult(T, MNone())

  val PostResultSmfLibrary: MOption[SmfLibrary] = MNone()

  val PreResultSmfType: PreResult[SmfType] = PreResult(T, MNone())

  val PostResultSmfType: MOption[SmfType] = MNone()

  val PreResultAadl: PreResult[Aadl] = PreResult(T, MNone())

  val PostResultAadl: MOption[Aadl] = MNone()

  val PreResultEmv2ElementRef: PreResult[Emv2ElementRef] = PreResult(T, MNone())

  val PostResultEmv2ElementRef: MOption[Emv2ElementRef] = MNone()

  val PreResultName: PreResult[Name] = PreResult(T, MNone())

  val PostResultName: MOption[Name] = MNone()

  val PreResultComponent: PreResult[Component] = PreResult(T, MNone())

  val PostResultComponent: MOption[Component] = MNone()

  val PreResultEmv2Library: PreResult[Emv2Library] = PreResult(T, MNone())

  val PostResultEmv2Library: MOption[Emv2Library] = MNone()

  val PreResultErrorTypeDef: PreResult[ErrorTypeDef] = PreResult(T, MNone())

  val PostResultErrorTypeDef: MOption[ErrorTypeDef] = MNone()

  val PreResultClassifier: PreResult[Classifier] = PreResult(T, MNone())

  val PostResultClassifier: MOption[Classifier] = MNone()

  val PreResultErrorAliasDef: PreResult[ErrorAliasDef] = PreResult(T, MNone())

  val PostResultErrorAliasDef: MOption[ErrorAliasDef] = MNone()

  val PreResultErrorTypeSetDef: PreResult[ErrorTypeSetDef] = PreResult(T, MNone())

  val PostResultErrorTypeSetDef: MOption[ErrorTypeSetDef] = MNone()

  val PreResultBehaveStateMachine: PreResult[BehaveStateMachine] = PreResult(T, MNone())

  val PostResultBehaveStateMachine: MOption[BehaveStateMachine] = MNone()

  val PreResultFeatureEnd: PreResult[FeatureEnd] = PreResult(T, MNone())

  val PostResultFeatureEnd: MOption[FeatureEnd] = MNone()

  val PreResultErrorEvent: PreResult[ErrorEvent] = PreResult(T, MNone())

  val PostResultErrorEvent: MOption[ErrorEvent] = MNone()

  val PreResultErrorState: PreResult[ErrorState] = PreResult(T, MNone())

  val PostResultErrorState: MOption[ErrorState] = MNone()

  val PreResultErrorTransition: PreResult[ErrorTransition] = PreResult(T, MNone())

  val PostResultErrorTransition: MOption[ErrorTransition] = MNone()

  val PreResultFeatureGroup: PreResult[FeatureGroup] = PreResult(T, MNone())

  val PostResultFeatureGroup: MOption[FeatureGroup] = MNone()

  val PreResultConditionTrigger: PreResult[ConditionTrigger] = PreResult(T, MNone())

  val PostResultConditionTrigger: MOption[ConditionTrigger] = MNone()

  val PreResultAndCondition: PreResult[AndCondition] = PreResult(T, MNone())

  val PostResultAndCondition: MOption[AndCondition] = MNone()

  val PreResultFeatureAccess: PreResult[FeatureAccess] = PreResult(T, MNone())

  val PostResultFeatureAccess: MOption[FeatureAccess] = MNone()

  val PreResultOrCondition: PreResult[OrCondition] = PreResult(T, MNone())

  val PostResultOrCondition: MOption[OrCondition] = MNone()

  val PreResultAllCondition: PreResult[AllCondition] = PreResult(T, MNone())

  val PostResultAllCondition: MOption[AllCondition] = MNone()

  val PreResultOrMoreCondition: PreResult[OrMoreCondition] = PreResult(T, MNone())

  val PostResultOrMoreCondition: MOption[OrMoreCondition] = MNone()

  val PreResultOrLessCondition: PreResult[OrLessCondition] = PreResult(T, MNone())

  val PostResultOrLessCondition: MOption[OrLessCondition] = MNone()

  val PreResultEmv2Clause: PreResult[Emv2Clause] = PreResult(T, MNone())

  val PostResultEmv2Clause: MOption[Emv2Clause] = MNone()

  val PreResultEmv2Propagation: PreResult[Emv2Propagation] = PreResult(T, MNone())

  val PostResultEmv2Propagation: MOption[Emv2Propagation] = MNone()

  val PreResultConnection: PreResult[Connection] = PreResult(T, MNone())

  val PostResultConnection: MOption[Connection] = MNone()

  val PreResultEmv2Flow: PreResult[Emv2Flow] = PreResult(T, MNone())

  val PostResultEmv2Flow: MOption[Emv2Flow] = MNone()

  val PreResultEmv2BehaviorSection: PreResult[Emv2BehaviorSection] = PreResult(T, MNone())

  val PostResultEmv2BehaviorSection: MOption[Emv2BehaviorSection] = MNone()

  val PreResultConnectionInstance: PreResult[ConnectionInstance] = PreResult(T, MNone())

  val PostResultConnectionInstance: MOption[ConnectionInstance] = MNone()

  val PreResultErrorPropagation: PreResult[ErrorPropagation] = PreResult(T, MNone())

  val PostResultErrorPropagation: MOption[ErrorPropagation] = MNone()

  val PreResultConnectionReference: PreResult[ConnectionReference] = PreResult(T, MNone())

  val PostResultConnectionReference: MOption[ConnectionReference] = MNone()

  val PreResultEndPoint: PreResult[EndPoint] = PreResult(T, MNone())

  val PostResultEndPoint: MOption[EndPoint] = MNone()

  val PreResultProperty: PreResult[Property] = PreResult(T, MNone())

  val PostResultProperty: MOption[Property] = MNone()

  val PreResultAadlElementRef: PreResult[AadlElementRef] = PreResult(T, MNone())

  val PostResultAadlElementRef: MOption[AadlElementRef] = MNone()

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

  val PreResultOtherAnnex: PreResult[OtherAnnex] = PreResult(T, MNone())

  val PostResultOtherAnnex: MOption[OtherAnnex] = MNone()

  val PreResult_langastTypedName: PreResult[org.sireum.lang.ast.Typed] = PreResult(T, MNone())

  val PostResult_langastTypedName: MOption[org.sireum.lang.ast.Typed] = MNone()

  val PreResultOtherLib: PreResult[OtherLib] = PreResult(T, MNone())

  val PostResultOtherLib: MOption[OtherLib] = MNone()

  val PreResult_langastTypedTuple: PreResult[org.sireum.lang.ast.Typed] = PreResult(T, MNone())

  val PostResult_langastTypedTuple: MOption[org.sireum.lang.ast.Typed] = MNone()

  val PreResult_langastTypedFun: PreResult[org.sireum.lang.ast.Typed] = PreResult(T, MNone())

  val PostResult_langastTypedFun: MOption[org.sireum.lang.ast.Typed] = MNone()

  val PreResult_langastTypedTypeVar: PreResult[org.sireum.lang.ast.Typed] = PreResult(T, MNone())

  val PostResult_langastTypedTypeVar: MOption[org.sireum.lang.ast.Typed] = MNone()

  val PreResult_langastTypedPackage: PreResult[org.sireum.lang.ast.Typed] = PreResult(T, MNone())

  val PostResult_langastTypedPackage: MOption[org.sireum.lang.ast.Typed] = MNone()

  val PreResult_langastTypedObject: PreResult[org.sireum.lang.ast.Typed] = PreResult(T, MNone())

  val PostResult_langastTypedObject: MOption[org.sireum.lang.ast.Typed] = MNone()

  val PreResult_langastTypedEnum: PreResult[org.sireum.lang.ast.Typed] = PreResult(T, MNone())

  val PostResult_langastTypedEnum: MOption[org.sireum.lang.ast.Typed] = MNone()

  val PreResult_langastTypedMethod: PreResult[org.sireum.lang.ast.Typed] = PreResult(T, MNone())

  val PostResult_langastTypedMethod: MOption[org.sireum.lang.ast.Typed] = MNone()

  val PreResult_langastTypedMethods: PreResult[org.sireum.lang.ast.Typed] = PreResult(T, MNone())

  val PostResult_langastTypedMethods: MOption[org.sireum.lang.ast.Typed] = MNone()

  val PreResult_langastTypedFact: PreResult[org.sireum.lang.ast.Typed] = PreResult(T, MNone())

  val PostResult_langastTypedFact: MOption[org.sireum.lang.ast.Typed] = MNone()

  val PreResult_langastTypedTheorem: PreResult[org.sireum.lang.ast.Typed] = PreResult(T, MNone())

  val PostResult_langastTypedTheorem: MOption[org.sireum.lang.ast.Typed] = MNone()

  val PreResult_langastTypedInv: PreResult[org.sireum.lang.ast.Typed] = PreResult(T, MNone())

  val PostResult_langastTypedInv: MOption[org.sireum.lang.ast.Typed] = MNone()

  val PreResultGclSubclause: PreResult[GclSubclause] = PreResult(T, MNone())

  val PostResultGclSubclause: MOption[GclSubclause] = MNone()

  val PreResultGclStateVar: PreResult[GclStateVar] = PreResult(T, MNone())

  val PostResultGclStateVar: MOption[GclStateVar] = MNone()

  val PreResultGclInvariant: PreResult[GclInvariant] = PreResult(T, MNone())

  val PostResultGclInvariant: MOption[GclInvariant] = MNone()

  val PreResultBTSBLESSAnnexClause: PreResult[BTSBLESSAnnexClause] = PreResult(T, MNone())

  val PostResultBTSBLESSAnnexClause: MOption[BTSBLESSAnnexClause] = MNone()

  val PreResultGclAssume: PreResult[GclAssume] = PreResult(T, MNone())

  val PostResultGclAssume: MOption[GclAssume] = MNone()

  val PreResultGclGuarantee: PreResult[GclGuarantee] = PreResult(T, MNone())

  val PostResultGclGuarantee: MOption[GclGuarantee] = MNone()

  val PreResultGclIntegration: PreResult[GclIntegration] = PreResult(T, MNone())

  val PostResultGclIntegration: MOption[GclIntegration] = MNone()

  val PreResultGclCaseStatement: PreResult[GclCaseStatement] = PreResult(T, MNone())

  val PostResultGclCaseStatement: MOption[GclCaseStatement] = MNone()

  val PreResultGclInitialize: PreResult[GclInitialize] = PreResult(T, MNone())

  val PostResultGclInitialize: MOption[GclInitialize] = MNone()

  val PreResultGclCompute: PreResult[GclCompute] = PreResult(T, MNone())

  val PostResultGclCompute: MOption[GclCompute] = MNone()

  val PreResultGclHandle: PreResult[GclHandle] = PreResult(T, MNone())

  val PostResultGclHandle: MOption[GclHandle] = MNone()

  val PreResultGclTODO: PreResult[GclTODO] = PreResult(T, MNone())

  val PostResultGclTODO: MOption[GclTODO] = MNone()

  val PreResultGclLibrary: PreResult[GclLibrary] = PreResult(T, MNone())

  val PostResultGclLibrary: MOption[GclLibrary] = MNone()

  val PreResultBTSVariableDeclaration: PreResult[BTSVariableDeclaration] = PreResult(T, MNone())

  val PostResultBTSVariableDeclaration: MOption[BTSVariableDeclaration] = MNone()

  val PreResultBTSClassifier: PreResult[BTSClassifier] = PreResult(T, MNone())

  val PostResultBTSClassifier: MOption[BTSClassifier] = MNone()

  val PreResultBLESSIntConst: PreResult[BLESSIntConst] = PreResult(T, MNone())

  val PostResultBLESSIntConst: MOption[BLESSIntConst] = MNone()

  val PreResultBTSStateDeclaration: PreResult[BTSStateDeclaration] = PreResult(T, MNone())

  val PostResultBTSStateDeclaration: MOption[BTSStateDeclaration] = MNone()

  val PreResultBTSTransition: PreResult[BTSTransition] = PreResult(T, MNone())

  val PostResultBTSTransition: MOption[BTSTransition] = MNone()

  val PreResultBTSTransitionLabel: PreResult[BTSTransitionLabel] = PreResult(T, MNone())

  val PostResultBTSTransitionLabel: MOption[BTSTransitionLabel] = MNone()

  val PreResultBTSDispatchCondition: PreResult[BTSDispatchCondition] = PreResult(T, MNone())

  val PostResultBTSDispatchCondition: MOption[BTSDispatchCondition] = MNone()

  val PreResultBTSDispatchConjunction: PreResult[BTSDispatchConjunction] = PreResult(T, MNone())

  val PostResultBTSDispatchConjunction: MOption[BTSDispatchConjunction] = MNone()

  val PreResultBTSDispatchTriggerStop: PreResult[BTSDispatchTriggerStop] = PreResult(T, MNone())

  val PostResultBTSDispatchTriggerStop: MOption[BTSDispatchTriggerStop] = MNone()

  val PreResultBTSDispatchTriggerPort: PreResult[BTSDispatchTriggerPort] = PreResult(T, MNone())

  val PostResultBTSDispatchTriggerPort: MOption[BTSDispatchTriggerPort] = MNone()

  val PreResultBTSDispatchTriggerTimeout: PreResult[BTSDispatchTriggerTimeout] = PreResult(T, MNone())

  val PostResultBTSDispatchTriggerTimeout: MOption[BTSDispatchTriggerTimeout] = MNone()

  val PreResultBTSExecuteConditionExp: PreResult[BTSExecuteConditionExp] = PreResult(T, MNone())

  val PostResultBTSExecuteConditionExp: MOption[BTSExecuteConditionExp] = MNone()

  val PreResultBTSExecuteConditionTimeout: PreResult[BTSExecuteConditionTimeout] = PreResult(T, MNone())

  val PostResultBTSExecuteConditionTimeout: MOption[BTSExecuteConditionTimeout] = MNone()

  val PreResultBTSExecuteConditionOtherwise: PreResult[BTSExecuteConditionOtherwise] = PreResult(T, MNone())

  val PostResultBTSExecuteConditionOtherwise: MOption[BTSExecuteConditionOtherwise] = MNone()

  val PreResultBTSModeCondition: PreResult[BTSModeCondition] = PreResult(T, MNone())

  val PostResultBTSModeCondition: MOption[BTSModeCondition] = MNone()

  val PreResultBTSInternalCondition: PreResult[BTSInternalCondition] = PreResult(T, MNone())

  val PostResultBTSInternalCondition: MOption[BTSInternalCondition] = MNone()

  val PreResultBTSAssertion: PreResult[BTSAssertion] = PreResult(T, MNone())

  val PostResultBTSAssertion: MOption[BTSAssertion] = MNone()

  val PreResultBTSBehaviorActions: PreResult[BTSBehaviorActions] = PreResult(T, MNone())

  val PostResultBTSBehaviorActions: MOption[BTSBehaviorActions] = MNone()

  val PreResultBTSAssertedAction: PreResult[BTSAssertedAction] = PreResult(T, MNone())

  val PostResultBTSAssertedAction: MOption[BTSAssertedAction] = MNone()

  val PreResultBTSSkipAction: PreResult[BTSSkipAction] = PreResult(T, MNone())

  val PostResultBTSSkipAction: MOption[BTSSkipAction] = MNone()

  val PreResultBTSAssignmentAction: PreResult[BTSAssignmentAction] = PreResult(T, MNone())

  val PostResultBTSAssignmentAction: MOption[BTSAssignmentAction] = MNone()

  val PreResultBTSSubprogramCallAction: PreResult[BTSSubprogramCallAction] = PreResult(T, MNone())

  val PostResultBTSSubprogramCallAction: MOption[BTSSubprogramCallAction] = MNone()

  val PreResultBTSPortOutAction: PreResult[BTSPortOutAction] = PreResult(T, MNone())

  val PostResultBTSPortOutAction: MOption[BTSPortOutAction] = MNone()

  val PreResultBTSPortInAction: PreResult[BTSPortInAction] = PreResult(T, MNone())

  val PostResultBTSPortInAction: MOption[BTSPortInAction] = MNone()

  val PreResultBTSFrozenPortAction: PreResult[BTSFrozenPortAction] = PreResult(T, MNone())

  val PostResultBTSFrozenPortAction: MOption[BTSFrozenPortAction] = MNone()

  val PreResultBTSIfBLESSAction: PreResult[BTSIfBLESSAction] = PreResult(T, MNone())

  val PostResultBTSIfBLESSAction: MOption[BTSIfBLESSAction] = MNone()

  val PreResultBTSGuardedAction: PreResult[BTSGuardedAction] = PreResult(T, MNone())

  val PostResultBTSGuardedAction: MOption[BTSGuardedAction] = MNone()

  val PreResultBTSIfBAAction: PreResult[BTSIfBAAction] = PreResult(T, MNone())

  val PostResultBTSIfBAAction: MOption[BTSIfBAAction] = MNone()

  val PreResultBTSConditionalActions: PreResult[BTSConditionalActions] = PreResult(T, MNone())

  val PostResultBTSConditionalActions: MOption[BTSConditionalActions] = MNone()

  val PreResultBTSExistentialLatticeQuantification: PreResult[BTSExistentialLatticeQuantification] = PreResult(T, MNone())

  val PostResultBTSExistentialLatticeQuantification: MOption[BTSExistentialLatticeQuantification] = MNone()

  val PreResultBTSUniversalLatticeQuantification: PreResult[BTSUniversalLatticeQuantification] = PreResult(T, MNone())

  val PostResultBTSUniversalLatticeQuantification: MOption[BTSUniversalLatticeQuantification] = MNone()

  val PreResultBTSUnaryExp: PreResult[BTSUnaryExp] = PreResult(T, MNone())

  val PostResultBTSUnaryExp: MOption[BTSUnaryExp] = MNone()

  val PreResultBTSBinaryExp: PreResult[BTSBinaryExp] = PreResult(T, MNone())

  val PostResultBTSBinaryExp: MOption[BTSBinaryExp] = MNone()

  val PreResultBTSLiteralExp: PreResult[BTSLiteralExp] = PreResult(T, MNone())

  val PostResultBTSLiteralExp: MOption[BTSLiteralExp] = MNone()

  val PreResultBTSNameExp: PreResult[BTSNameExp] = PreResult(T, MNone())

  val PostResultBTSNameExp: MOption[BTSNameExp] = MNone()

  val PreResultBTSIndexingExp: PreResult[BTSIndexingExp] = PreResult(T, MNone())

  val PostResultBTSIndexingExp: MOption[BTSIndexingExp] = MNone()

  val PreResultBTSAccessExp: PreResult[BTSAccessExp] = PreResult(T, MNone())

  val PostResultBTSAccessExp: MOption[BTSAccessExp] = MNone()

  val PreResultBTSFunctionCall: PreResult[BTSFunctionCall] = PreResult(T, MNone())

  val PostResultBTSFunctionCall: MOption[BTSFunctionCall] = MNone()

  val PreResultBTSFormalExpPair: PreResult[BTSFormalExpPair] = PreResult(T, MNone())

  val PostResultBTSFormalExpPair: MOption[BTSFormalExpPair] = MNone()

  val PreResultBTSBehaviorTime: PreResult[BTSBehaviorTime] = PreResult(T, MNone())

  val PostResultBTSBehaviorTime: MOption[BTSBehaviorTime] = MNone()

  val PreResultTODO: PreResult[TODO] = PreResult(T, MNone())

  val PostResultTODO: MOption[TODO] = MNone()

  val PreResultAttr: PreResult[Attr] = PreResult(T, MNone())

  val PostResultAttr: MOption[Attr] = MNone()

}

import MTransformer._

@msig trait MTransformer {

  def pre_langastTopUnit(o: org.sireum.lang.ast.TopUnit): PreResult[org.sireum.lang.ast.TopUnit] = {
    o match {
      case o: org.sireum.lang.ast.TopUnit.Program => return pre_langastTopUnitProgram(o)
      case o: org.sireum.lang.ast.TopUnit.SequentUnit => return pre_langastTopUnitSequentUnit(o)
      case o: org.sireum.lang.ast.TopUnit.TruthTableUnit => return pre_langastTopUnitTruthTableUnit(o)
    }
  }

  def pre_langastTopUnitProgram(o: org.sireum.lang.ast.TopUnit.Program): PreResult[org.sireum.lang.ast.TopUnit] = {
    return PreResult_langastTopUnitProgram
  }

  def pre_langastTopUnitSequentUnit(o: org.sireum.lang.ast.TopUnit.SequentUnit): PreResult[org.sireum.lang.ast.TopUnit] = {
    return PreResult_langastTopUnitSequentUnit
  }

  def pre_langastTopUnitTruthTableUnit(o: org.sireum.lang.ast.TopUnit.TruthTableUnit): PreResult[org.sireum.lang.ast.TopUnit] = {
    return PreResult_langastTopUnitTruthTableUnit
  }

  def pre_langastStmt(o: org.sireum.lang.ast.Stmt): PreResult[org.sireum.lang.ast.Stmt] = {
    o match {
      case o: org.sireum.lang.ast.Stmt.Import => return pre_langastStmtImport(o)
      case o: org.sireum.lang.ast.Stmt.Var => return pre_langastStmtVar(o)
      case o: org.sireum.lang.ast.Stmt.VarPattern => return pre_langastStmtVarPattern(o)
      case o: org.sireum.lang.ast.Stmt.SpecVar => return pre_langastStmtSpecVar(o)
      case o: org.sireum.lang.ast.Stmt.Method => return pre_langastStmtMethod(o)
      case o: org.sireum.lang.ast.Stmt.ExtMethod => return pre_langastStmtExtMethod(o)
      case o: org.sireum.lang.ast.Stmt.JustMethod => return pre_langastStmtJustMethod(o)
      case o: org.sireum.lang.ast.Stmt.SpecMethod => return pre_langastStmtSpecMethod(o)
      case o: org.sireum.lang.ast.Stmt.Enum => return pre_langastStmtEnum(o)
      case o: org.sireum.lang.ast.Stmt.SubZ => return pre_langastStmtSubZ(o)
      case o: org.sireum.lang.ast.Stmt.Object => return pre_langastStmtObject(o)
      case o: org.sireum.lang.ast.Stmt.Sig => return pre_langastStmtSig(o)
      case o: org.sireum.lang.ast.Stmt.Adt => return pre_langastStmtAdt(o)
      case o: org.sireum.lang.ast.Stmt.TypeAlias => return pre_langastStmtTypeAlias(o)
      case o: org.sireum.lang.ast.Stmt.Assign => return pre_langastStmtAssign(o)
      case o: org.sireum.lang.ast.Stmt.Block => return pre_langastStmtBlock(o)
      case o: org.sireum.lang.ast.Stmt.If => return pre_langastStmtIf(o)
      case o: org.sireum.lang.ast.Stmt.Match => return pre_langastStmtMatch(o)
      case o: org.sireum.lang.ast.Stmt.While => return pre_langastStmtWhile(o)
      case o: org.sireum.lang.ast.Stmt.DoWhile => return pre_langastStmtDoWhile(o)
      case o: org.sireum.lang.ast.Stmt.For => return pre_langastStmtFor(o)
      case o: org.sireum.lang.ast.Stmt.Return => return pre_langastStmtReturn(o)
      case o: org.sireum.lang.ast.Stmt.Expr => return pre_langastStmtExpr(o)
      case o: org.sireum.lang.ast.Stmt.Fact =>
        val r: PreResult[org.sireum.lang.ast.Stmt] = pre_langastStmtFact(o) match {
         case PreResult(continu, MSome(r: org.sireum.lang.ast.Stmt)) => PreResult(continu, MSome[org.sireum.lang.ast.Stmt](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.Stmt")
         case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.Stmt]())
        }
        return r
      case o: org.sireum.lang.ast.Stmt.Inv =>
        val r: PreResult[org.sireum.lang.ast.Stmt] = pre_langastStmtInv(o) match {
         case PreResult(continu, MSome(r: org.sireum.lang.ast.Stmt)) => PreResult(continu, MSome[org.sireum.lang.ast.Stmt](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.Stmt")
         case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.Stmt]())
        }
        return r
      case o: org.sireum.lang.ast.Stmt.Theorem =>
        val r: PreResult[org.sireum.lang.ast.Stmt] = pre_langastStmtTheorem(o) match {
         case PreResult(continu, MSome(r: org.sireum.lang.ast.Stmt)) => PreResult(continu, MSome[org.sireum.lang.ast.Stmt](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.Stmt")
         case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.Stmt]())
        }
        return r
      case o: org.sireum.lang.ast.Stmt.DataRefinement =>
        val r: PreResult[org.sireum.lang.ast.Stmt] = pre_langastStmtDataRefinement(o) match {
         case PreResult(continu, MSome(r: org.sireum.lang.ast.Stmt)) => PreResult(continu, MSome[org.sireum.lang.ast.Stmt](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.Stmt")
         case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.Stmt]())
        }
        return r
      case o: org.sireum.lang.ast.Stmt.SpecLabel =>
        val r: PreResult[org.sireum.lang.ast.Stmt] = pre_langastStmtSpecLabel(o) match {
         case PreResult(continu, MSome(r: org.sireum.lang.ast.Stmt)) => PreResult(continu, MSome[org.sireum.lang.ast.Stmt](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.Stmt")
         case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.Stmt]())
        }
        return r
      case o: org.sireum.lang.ast.Stmt.SpecBlock =>
        val r: PreResult[org.sireum.lang.ast.Stmt] = pre_langastStmtSpecBlock(o) match {
         case PreResult(continu, MSome(r: org.sireum.lang.ast.Stmt)) => PreResult(continu, MSome[org.sireum.lang.ast.Stmt](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.Stmt")
         case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.Stmt]())
        }
        return r
      case o: org.sireum.lang.ast.Stmt.DeduceSequent =>
        val r: PreResult[org.sireum.lang.ast.Stmt] = pre_langastStmtDeduceSequent(o) match {
         case PreResult(continu, MSome(r: org.sireum.lang.ast.Stmt)) => PreResult(continu, MSome[org.sireum.lang.ast.Stmt](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.Stmt")
         case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.Stmt]())
        }
        return r
      case o: org.sireum.lang.ast.Stmt.DeduceSteps =>
        val r: PreResult[org.sireum.lang.ast.Stmt] = pre_langastStmtDeduceSteps(o) match {
         case PreResult(continu, MSome(r: org.sireum.lang.ast.Stmt)) => PreResult(continu, MSome[org.sireum.lang.ast.Stmt](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.Stmt")
         case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.Stmt]())
        }
        return r
      case o: org.sireum.lang.ast.Stmt.Havoc =>
        val r: PreResult[org.sireum.lang.ast.Stmt] = pre_langastStmtHavoc(o) match {
         case PreResult(continu, MSome(r: org.sireum.lang.ast.Stmt)) => PreResult(continu, MSome[org.sireum.lang.ast.Stmt](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.Stmt")
         case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.Stmt]())
        }
        return r
    }
  }

  def pre_langastHasModifies(o: org.sireum.lang.ast.HasModifies): PreResult[org.sireum.lang.ast.HasModifies] = {
    o match {
      case o: org.sireum.lang.ast.LoopContract =>
        val r: PreResult[org.sireum.lang.ast.HasModifies] = pre_langastLoopContract(o) match {
         case PreResult(continu, MSome(r: org.sireum.lang.ast.HasModifies)) => PreResult(continu, MSome[org.sireum.lang.ast.HasModifies](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.HasModifies")
         case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.HasModifies]())
        }
        return r
      case o: org.sireum.lang.ast.MethodContract.Simple =>
        val r: PreResult[org.sireum.lang.ast.HasModifies] = pre_langastMethodContractSimple(o) match {
         case PreResult(continu, MSome(r: org.sireum.lang.ast.HasModifies)) => PreResult(continu, MSome[org.sireum.lang.ast.HasModifies](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.HasModifies")
         case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.HasModifies]())
        }
        return r
      case o: org.sireum.lang.ast.MethodContract.Cases =>
        val r: PreResult[org.sireum.lang.ast.HasModifies] = pre_langastMethodContractCases(o) match {
         case PreResult(continu, MSome(r: org.sireum.lang.ast.HasModifies)) => PreResult(continu, MSome[org.sireum.lang.ast.HasModifies](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.HasModifies")
         case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.HasModifies]())
        }
        return r
    }
  }

  def pre_langastLoopContract(o: org.sireum.lang.ast.LoopContract): PreResult[org.sireum.lang.ast.LoopContract] = {
    return PreResult_langastLoopContract
  }

  def pre_langastStmtImport(o: org.sireum.lang.ast.Stmt.Import): PreResult[org.sireum.lang.ast.Stmt] = {
    return PreResult_langastStmtImport
  }

  def pre_langastStmtImportImporter(o: org.sireum.lang.ast.Stmt.Import.Importer): PreResult[org.sireum.lang.ast.Stmt.Import.Importer] = {
    return PreResult_langastStmtImportImporter
  }

  def pre_langastStmtImportSelector(o: org.sireum.lang.ast.Stmt.Import.Selector): PreResult[org.sireum.lang.ast.Stmt.Import.Selector] = {
    o match {
      case o: org.sireum.lang.ast.Stmt.Import.MultiSelector => return pre_langastStmtImportMultiSelector(o)
      case o: org.sireum.lang.ast.Stmt.Import.WildcardSelector => return pre_langastStmtImportWildcardSelector(o)
    }
  }

  def pre_langastStmtImportMultiSelector(o: org.sireum.lang.ast.Stmt.Import.MultiSelector): PreResult[org.sireum.lang.ast.Stmt.Import.Selector] = {
    return PreResult_langastStmtImportMultiSelector
  }

  def pre_langastStmtImportWildcardSelector(o: org.sireum.lang.ast.Stmt.Import.WildcardSelector): PreResult[org.sireum.lang.ast.Stmt.Import.Selector] = {
    return PreResult_langastStmtImportWildcardSelector
  }

  def pre_langastStmtImportNamedSelector(o: org.sireum.lang.ast.Stmt.Import.NamedSelector): PreResult[org.sireum.lang.ast.Stmt.Import.NamedSelector] = {
    return PreResult_langastStmtImportNamedSelector
  }

  def pre_langastStmtVar(o: org.sireum.lang.ast.Stmt.Var): PreResult[org.sireum.lang.ast.Stmt] = {
    return PreResult_langastStmtVar
  }

  def pre_langastStmtVarPattern(o: org.sireum.lang.ast.Stmt.VarPattern): PreResult[org.sireum.lang.ast.Stmt] = {
    return PreResult_langastStmtVarPattern
  }

  def pre_langastStmtSpecVar(o: org.sireum.lang.ast.Stmt.SpecVar): PreResult[org.sireum.lang.ast.Stmt] = {
    return PreResult_langastStmtSpecVar
  }

  def pre_langastStmtMethod(o: org.sireum.lang.ast.Stmt.Method): PreResult[org.sireum.lang.ast.Stmt] = {
    return PreResult_langastStmtMethod
  }

  def pre_langastStmtExtMethod(o: org.sireum.lang.ast.Stmt.ExtMethod): PreResult[org.sireum.lang.ast.Stmt] = {
    return PreResult_langastStmtExtMethod
  }

  def pre_langastStmtJustMethod(o: org.sireum.lang.ast.Stmt.JustMethod): PreResult[org.sireum.lang.ast.Stmt] = {
    return PreResult_langastStmtJustMethod
  }

  def pre_langastStmtSpecMethod(o: org.sireum.lang.ast.Stmt.SpecMethod): PreResult[org.sireum.lang.ast.Stmt] = {
    return PreResult_langastStmtSpecMethod
  }

  def pre_langastStmtEnum(o: org.sireum.lang.ast.Stmt.Enum): PreResult[org.sireum.lang.ast.Stmt] = {
    return PreResult_langastStmtEnum
  }

  def pre_langastStmtSubZ(o: org.sireum.lang.ast.Stmt.SubZ): PreResult[org.sireum.lang.ast.Stmt] = {
    return PreResult_langastStmtSubZ
  }

  def pre_langastStmtObject(o: org.sireum.lang.ast.Stmt.Object): PreResult[org.sireum.lang.ast.Stmt] = {
    return PreResult_langastStmtObject
  }

  def pre_langastStmtSig(o: org.sireum.lang.ast.Stmt.Sig): PreResult[org.sireum.lang.ast.Stmt] = {
    return PreResult_langastStmtSig
  }

  def pre_langastStmtAdt(o: org.sireum.lang.ast.Stmt.Adt): PreResult[org.sireum.lang.ast.Stmt] = {
    return PreResult_langastStmtAdt
  }

  def pre_langastStmtTypeAlias(o: org.sireum.lang.ast.Stmt.TypeAlias): PreResult[org.sireum.lang.ast.Stmt] = {
    return PreResult_langastStmtTypeAlias
  }

  def pre_langastStmtAssign(o: org.sireum.lang.ast.Stmt.Assign): PreResult[org.sireum.lang.ast.Stmt] = {
    return PreResult_langastStmtAssign
  }

  def pre_langastStmtBlock(o: org.sireum.lang.ast.Stmt.Block): PreResult[org.sireum.lang.ast.Stmt] = {
    return PreResult_langastStmtBlock
  }

  def pre_langastStmtIf(o: org.sireum.lang.ast.Stmt.If): PreResult[org.sireum.lang.ast.Stmt] = {
    return PreResult_langastStmtIf
  }

  def pre_langastStmtMatch(o: org.sireum.lang.ast.Stmt.Match): PreResult[org.sireum.lang.ast.Stmt] = {
    return PreResult_langastStmtMatch
  }

  def pre_langastStmtWhile(o: org.sireum.lang.ast.Stmt.While): PreResult[org.sireum.lang.ast.Stmt] = {
    return PreResult_langastStmtWhile
  }

  def pre_langastStmtDoWhile(o: org.sireum.lang.ast.Stmt.DoWhile): PreResult[org.sireum.lang.ast.Stmt] = {
    return PreResult_langastStmtDoWhile
  }

  def pre_langastStmtFor(o: org.sireum.lang.ast.Stmt.For): PreResult[org.sireum.lang.ast.Stmt] = {
    return PreResult_langastStmtFor
  }

  def pre_langastStmtReturn(o: org.sireum.lang.ast.Stmt.Return): PreResult[org.sireum.lang.ast.Stmt] = {
    return PreResult_langastStmtReturn
  }

  def pre_langastStmtExpr(o: org.sireum.lang.ast.Stmt.Expr): PreResult[org.sireum.lang.ast.Stmt] = {
    return PreResult_langastStmtExpr
  }

  def pre_langastStmtSpec(o: org.sireum.lang.ast.Stmt.Spec): PreResult[org.sireum.lang.ast.Stmt.Spec] = {
    o match {
      case o: org.sireum.lang.ast.Stmt.Fact => return pre_langastStmtFact(o)
      case o: org.sireum.lang.ast.Stmt.Inv => return pre_langastStmtInv(o)
      case o: org.sireum.lang.ast.Stmt.Theorem => return pre_langastStmtTheorem(o)
      case o: org.sireum.lang.ast.Stmt.DataRefinement => return pre_langastStmtDataRefinement(o)
      case o: org.sireum.lang.ast.Stmt.SpecLabel => return pre_langastStmtSpecLabel(o)
      case o: org.sireum.lang.ast.Stmt.SpecBlock => return pre_langastStmtSpecBlock(o)
      case o: org.sireum.lang.ast.Stmt.DeduceSequent => return pre_langastStmtDeduceSequent(o)
      case o: org.sireum.lang.ast.Stmt.DeduceSteps => return pre_langastStmtDeduceSteps(o)
      case o: org.sireum.lang.ast.Stmt.Havoc => return pre_langastStmtHavoc(o)
    }
  }

  def pre_langastStmtFact(o: org.sireum.lang.ast.Stmt.Fact): PreResult[org.sireum.lang.ast.Stmt.Spec] = {
    return PreResult_langastStmtFact
  }

  def pre_langastStmtInv(o: org.sireum.lang.ast.Stmt.Inv): PreResult[org.sireum.lang.ast.Stmt.Spec] = {
    return PreResult_langastStmtInv
  }

  def pre_langastStmtTheorem(o: org.sireum.lang.ast.Stmt.Theorem): PreResult[org.sireum.lang.ast.Stmt.Spec] = {
    return PreResult_langastStmtTheorem
  }

  def pre_langastStmtDataRefinement(o: org.sireum.lang.ast.Stmt.DataRefinement): PreResult[org.sireum.lang.ast.Stmt.Spec] = {
    return PreResult_langastStmtDataRefinement
  }

  def pre_langastStmtSpecLabel(o: org.sireum.lang.ast.Stmt.SpecLabel): PreResult[org.sireum.lang.ast.Stmt.Spec] = {
    return PreResult_langastStmtSpecLabel
  }

  def pre_langastStmtSpecBlock(o: org.sireum.lang.ast.Stmt.SpecBlock): PreResult[org.sireum.lang.ast.Stmt.Spec] = {
    return PreResult_langastStmtSpecBlock
  }

  def pre_langastStmtDeduceSequent(o: org.sireum.lang.ast.Stmt.DeduceSequent): PreResult[org.sireum.lang.ast.Stmt.Spec] = {
    return PreResult_langastStmtDeduceSequent
  }

  def pre_langastStmtDeduceSteps(o: org.sireum.lang.ast.Stmt.DeduceSteps): PreResult[org.sireum.lang.ast.Stmt.Spec] = {
    return PreResult_langastStmtDeduceSteps
  }

  def pre_langastStmtHavoc(o: org.sireum.lang.ast.Stmt.Havoc): PreResult[org.sireum.lang.ast.Stmt.Spec] = {
    return PreResult_langastStmtHavoc
  }

  def pre_langastMethodContract(o: org.sireum.lang.ast.MethodContract): PreResult[org.sireum.lang.ast.MethodContract] = {
    o match {
      case o: org.sireum.lang.ast.MethodContract.Simple => return pre_langastMethodContractSimple(o)
      case o: org.sireum.lang.ast.MethodContract.Cases => return pre_langastMethodContractCases(o)
    }
  }

  def pre_langastMethodContractAccesses(o: org.sireum.lang.ast.MethodContract.Accesses): PreResult[org.sireum.lang.ast.MethodContract.Accesses] = {
    return PreResult_langastMethodContractAccesses
  }

  def pre_langastMethodContractClaims(o: org.sireum.lang.ast.MethodContract.Claims): PreResult[org.sireum.lang.ast.MethodContract.Claims] = {
    return PreResult_langastMethodContractClaims
  }

  def pre_langastMethodContractSimple(o: org.sireum.lang.ast.MethodContract.Simple): PreResult[org.sireum.lang.ast.MethodContract] = {
    return PreResult_langastMethodContractSimple
  }

  def pre_langastMethodContractCases(o: org.sireum.lang.ast.MethodContract.Cases): PreResult[org.sireum.lang.ast.MethodContract] = {
    return PreResult_langastMethodContractCases
  }

  def pre_langastMethodContractCase(o: org.sireum.lang.ast.MethodContract.Case): PreResult[org.sireum.lang.ast.MethodContract.Case] = {
    return PreResult_langastMethodContractCase
  }

  def pre_langastSequent(o: org.sireum.lang.ast.Sequent): PreResult[org.sireum.lang.ast.Sequent] = {
    return PreResult_langastSequent
  }

  def pre_langastProofAst(o: org.sireum.lang.ast.ProofAst): PreResult[org.sireum.lang.ast.ProofAst] = {
    return PreResult_langastProofAst
  }

  def pre_langastProofAstStep(o: org.sireum.lang.ast.ProofAst.Step): PreResult[org.sireum.lang.ast.ProofAst.Step] = {
    o match {
      case o: org.sireum.lang.ast.ProofAst.Step.Regular => return pre_langastProofAstStepRegular(o)
      case o: org.sireum.lang.ast.ProofAst.Step.Assume => return pre_langastProofAstStepAssume(o)
      case o: org.sireum.lang.ast.ProofAst.Step.Assert => return pre_langastProofAstStepAssert(o)
      case o: org.sireum.lang.ast.ProofAst.Step.SubProof => return pre_langastProofAstStepSubProof(o)
      case o: org.sireum.lang.ast.ProofAst.Step.Let => return pre_langastProofAstStepLet(o)
      case o: org.sireum.lang.ast.ProofAst.Step.StructInduction => return pre_langastProofAstStepStructInduction(o)
    }
  }

  def pre_langastProofAstStepId(o: org.sireum.lang.ast.ProofAst.StepId): PreResult[org.sireum.lang.ast.ProofAst.StepId] = {
    o match {
      case o: org.sireum.lang.ast.ProofAst.StepId.Num => return pre_langastProofAstStepIdNum(o)
      case o: org.sireum.lang.ast.ProofAst.StepId.Str => return pre_langastProofAstStepIdStr(o)
    }
  }

  def pre_langastProofAstStepIdNum(o: org.sireum.lang.ast.ProofAst.StepId.Num): PreResult[org.sireum.lang.ast.ProofAst.StepId] = {
    return PreResult_langastProofAstStepIdNum
  }

  def pre_langastProofAstStepIdStr(o: org.sireum.lang.ast.ProofAst.StepId.Str): PreResult[org.sireum.lang.ast.ProofAst.StepId] = {
    return PreResult_langastProofAstStepIdStr
  }

  def pre_langastProofAstStepRegular(o: org.sireum.lang.ast.ProofAst.Step.Regular): PreResult[org.sireum.lang.ast.ProofAst.Step] = {
    return PreResult_langastProofAstStepRegular
  }

  def pre_langastProofAstStepAssume(o: org.sireum.lang.ast.ProofAst.Step.Assume): PreResult[org.sireum.lang.ast.ProofAst.Step] = {
    return PreResult_langastProofAstStepAssume
  }

  def pre_langastProofAstStepAssert(o: org.sireum.lang.ast.ProofAst.Step.Assert): PreResult[org.sireum.lang.ast.ProofAst.Step] = {
    return PreResult_langastProofAstStepAssert
  }

  def pre_langastProofAstStepSubProof(o: org.sireum.lang.ast.ProofAst.Step.SubProof): PreResult[org.sireum.lang.ast.ProofAst.Step] = {
    return PreResult_langastProofAstStepSubProof
  }

  def pre_langastProofAstStepLet(o: org.sireum.lang.ast.ProofAst.Step.Let): PreResult[org.sireum.lang.ast.ProofAst.Step] = {
    return PreResult_langastProofAstStepLet
  }

  def pre_langastProofAstStepLetParam(o: org.sireum.lang.ast.ProofAst.Step.Let.Param): PreResult[org.sireum.lang.ast.ProofAst.Step.Let.Param] = {
    return PreResult_langastProofAstStepLetParam
  }

  def pre_langastProofAstStepStructInduction(o: org.sireum.lang.ast.ProofAst.Step.StructInduction): PreResult[org.sireum.lang.ast.ProofAst.Step] = {
    return PreResult_langastProofAstStepStructInduction
  }

  def pre_langastProofAstStepStructInductionMatchCase(o: org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase): PreResult[org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase] = {
    return PreResult_langastProofAstStepStructInductionMatchCase
  }

  def pre_langastProofAstStepStructInductionMatchDefault(o: org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault): PreResult[org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault] = {
    return PreResult_langastProofAstStepStructInductionMatchDefault
  }

  def pre_langastProofAstStepJustification(o: org.sireum.lang.ast.ProofAst.Step.Justification): PreResult[org.sireum.lang.ast.ProofAst.Step.Justification] = {
    o match {
      case o: org.sireum.lang.ast.ProofAst.Step.Justification.Apply => return pre_langastProofAstStepJustificationApply(o)
      case o: org.sireum.lang.ast.ProofAst.Step.Justification.Incept =>
        val r: PreResult[org.sireum.lang.ast.ProofAst.Step.Justification] = pre_langastProofAstStepJustificationIncept(o) match {
         case PreResult(continu, MSome(r: org.sireum.lang.ast.ProofAst.Step.Justification)) => PreResult(continu, MSome[org.sireum.lang.ast.ProofAst.Step.Justification](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.ProofAst.Step.Justification")
         case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.ProofAst.Step.Justification]())
        }
        return r
      case o: org.sireum.lang.ast.ProofAst.Step.Justification.InceptNamed =>
        val r: PreResult[org.sireum.lang.ast.ProofAst.Step.Justification] = pre_langastProofAstStepJustificationInceptNamed(o) match {
         case PreResult(continu, MSome(r: org.sireum.lang.ast.ProofAst.Step.Justification)) => PreResult(continu, MSome[org.sireum.lang.ast.ProofAst.Step.Justification](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.ProofAst.Step.Justification")
         case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.ProofAst.Step.Justification]())
        }
        return r
      case o: org.sireum.lang.ast.ProofAst.Step.Justification.InceptEta =>
        val r: PreResult[org.sireum.lang.ast.ProofAst.Step.Justification] = pre_langastProofAstStepJustificationInceptEta(o) match {
         case PreResult(continu, MSome(r: org.sireum.lang.ast.ProofAst.Step.Justification)) => PreResult(continu, MSome[org.sireum.lang.ast.ProofAst.Step.Justification](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.ProofAst.Step.Justification")
         case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.ProofAst.Step.Justification]())
        }
        return r
    }
  }

  def pre_langastProofAstStepInception(o: org.sireum.lang.ast.ProofAst.Step.Inception): PreResult[org.sireum.lang.ast.ProofAst.Step.Inception] = {
    o match {
      case o: org.sireum.lang.ast.ProofAst.Step.Justification.Incept => return pre_langastProofAstStepJustificationIncept(o)
      case o: org.sireum.lang.ast.ProofAst.Step.Justification.InceptNamed => return pre_langastProofAstStepJustificationInceptNamed(o)
      case o: org.sireum.lang.ast.ProofAst.Step.Justification.InceptEta => return pre_langastProofAstStepJustificationInceptEta(o)
    }
  }

  def pre_langastProofAstStepJustificationApply(o: org.sireum.lang.ast.ProofAst.Step.Justification.Apply): PreResult[org.sireum.lang.ast.ProofAst.Step.Justification] = {
    return PreResult_langastProofAstStepJustificationApply
  }

  def pre_langastProofAstStepJustificationIncept(o: org.sireum.lang.ast.ProofAst.Step.Justification.Incept): PreResult[org.sireum.lang.ast.ProofAst.Step.Inception] = {
    return PreResult_langastProofAstStepJustificationIncept
  }

  def pre_langastProofAstStepJustificationInceptNamed(o: org.sireum.lang.ast.ProofAst.Step.Justification.InceptNamed): PreResult[org.sireum.lang.ast.ProofAst.Step.Inception] = {
    return PreResult_langastProofAstStepJustificationInceptNamed
  }

  def pre_langastProofAstStepJustificationInceptEta(o: org.sireum.lang.ast.ProofAst.Step.Justification.InceptEta): PreResult[org.sireum.lang.ast.ProofAst.Step.Inception] = {
    return PreResult_langastProofAstStepJustificationInceptEta
  }

  def pre_langastAssignExp(o: org.sireum.lang.ast.AssignExp): PreResult[org.sireum.lang.ast.AssignExp] = {
    o match {
      case o: org.sireum.lang.ast.Stmt.Block =>
        val r: PreResult[org.sireum.lang.ast.AssignExp] = pre_langastStmtBlock(o) match {
         case PreResult(continu, MSome(r: org.sireum.lang.ast.AssignExp)) => PreResult(continu, MSome[org.sireum.lang.ast.AssignExp](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.AssignExp")
         case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.AssignExp]())
        }
        return r
      case o: org.sireum.lang.ast.Stmt.If =>
        val r: PreResult[org.sireum.lang.ast.AssignExp] = pre_langastStmtIf(o) match {
         case PreResult(continu, MSome(r: org.sireum.lang.ast.AssignExp)) => PreResult(continu, MSome[org.sireum.lang.ast.AssignExp](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.AssignExp")
         case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.AssignExp]())
        }
        return r
      case o: org.sireum.lang.ast.Stmt.Match =>
        val r: PreResult[org.sireum.lang.ast.AssignExp] = pre_langastStmtMatch(o) match {
         case PreResult(continu, MSome(r: org.sireum.lang.ast.AssignExp)) => PreResult(continu, MSome[org.sireum.lang.ast.AssignExp](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.AssignExp")
         case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.AssignExp]())
        }
        return r
      case o: org.sireum.lang.ast.Stmt.Return =>
        val r: PreResult[org.sireum.lang.ast.AssignExp] = pre_langastStmtReturn(o) match {
         case PreResult(continu, MSome(r: org.sireum.lang.ast.AssignExp)) => PreResult(continu, MSome[org.sireum.lang.ast.AssignExp](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.AssignExp")
         case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.AssignExp]())
        }
        return r
      case o: org.sireum.lang.ast.Stmt.Expr =>
        val r: PreResult[org.sireum.lang.ast.AssignExp] = pre_langastStmtExpr(o) match {
         case PreResult(continu, MSome(r: org.sireum.lang.ast.AssignExp)) => PreResult(continu, MSome[org.sireum.lang.ast.AssignExp](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.AssignExp")
         case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.AssignExp]())
        }
        return r
    }
  }

  def pre_langastCase(o: org.sireum.lang.ast.Case): PreResult[org.sireum.lang.ast.Case] = {
    return PreResult_langastCase
  }

  def pre_langastEnumGenRange(o: org.sireum.lang.ast.EnumGen.Range): PreResult[org.sireum.lang.ast.EnumGen.Range] = {
    o match {
      case o: org.sireum.lang.ast.EnumGen.Range.Expr => return pre_langastEnumGenRangeExpr(o)
      case o: org.sireum.lang.ast.EnumGen.Range.Step => return pre_langastEnumGenRangeStep(o)
    }
  }

  def pre_langastEnumGenRangeExpr(o: org.sireum.lang.ast.EnumGen.Range.Expr): PreResult[org.sireum.lang.ast.EnumGen.Range] = {
    return PreResult_langastEnumGenRangeExpr
  }

  def pre_langastEnumGenRangeStep(o: org.sireum.lang.ast.EnumGen.Range.Step): PreResult[org.sireum.lang.ast.EnumGen.Range] = {
    return PreResult_langastEnumGenRangeStep
  }

  def pre_langastEnumGenFor(o: org.sireum.lang.ast.EnumGen.For): PreResult[org.sireum.lang.ast.EnumGen.For] = {
    return PreResult_langastEnumGenFor
  }

  def pre_langastType(o: org.sireum.lang.ast.Type): PreResult[org.sireum.lang.ast.Type] = {
    o match {
      case o: org.sireum.lang.ast.Type.Named => return pre_langastTypeNamed(o)
      case o: org.sireum.lang.ast.Type.Fun => return pre_langastTypeFun(o)
      case o: org.sireum.lang.ast.Type.Tuple => return pre_langastTypeTuple(o)
    }
  }

  def pre_langastTypeNamed(o: org.sireum.lang.ast.Type.Named): PreResult[org.sireum.lang.ast.Type] = {
    return PreResult_langastTypeNamed
  }

  def pre_langastTypeFun(o: org.sireum.lang.ast.Type.Fun): PreResult[org.sireum.lang.ast.Type] = {
    return PreResult_langastTypeFun
  }

  def pre_langastTypeTuple(o: org.sireum.lang.ast.Type.Tuple): PreResult[org.sireum.lang.ast.Type] = {
    return PreResult_langastTypeTuple
  }

  def pre_langastPattern(o: org.sireum.lang.ast.Pattern): PreResult[org.sireum.lang.ast.Pattern] = {
    o match {
      case o: org.sireum.lang.ast.Pattern.Literal => return pre_langastPatternLiteral(o)
      case o: org.sireum.lang.ast.Pattern.LitInterpolate => return pre_langastPatternLitInterpolate(o)
      case o: org.sireum.lang.ast.Pattern.Ref => return pre_langastPatternRef(o)
      case o: org.sireum.lang.ast.Pattern.VarBinding => return pre_langastPatternVarBinding(o)
      case o: org.sireum.lang.ast.Pattern.Wildcard => return pre_langastPatternWildcard(o)
      case o: org.sireum.lang.ast.Pattern.SeqWildcard => return pre_langastPatternSeqWildcard(o)
      case o: org.sireum.lang.ast.Pattern.Structure => return pre_langastPatternStructure(o)
    }
  }

  def pre_langastPatternLiteral(o: org.sireum.lang.ast.Pattern.Literal): PreResult[org.sireum.lang.ast.Pattern] = {
    return PreResult_langastPatternLiteral
  }

  def pre_langastPatternLitInterpolate(o: org.sireum.lang.ast.Pattern.LitInterpolate): PreResult[org.sireum.lang.ast.Pattern] = {
    return PreResult_langastPatternLitInterpolate
  }

  def pre_langastPatternRef(o: org.sireum.lang.ast.Pattern.Ref): PreResult[org.sireum.lang.ast.Pattern] = {
    return PreResult_langastPatternRef
  }

  def pre_langastPatternVarBinding(o: org.sireum.lang.ast.Pattern.VarBinding): PreResult[org.sireum.lang.ast.Pattern] = {
    return PreResult_langastPatternVarBinding
  }

  def pre_langastPatternWildcard(o: org.sireum.lang.ast.Pattern.Wildcard): PreResult[org.sireum.lang.ast.Pattern] = {
    return PreResult_langastPatternWildcard
  }

  def pre_langastPatternSeqWildcard(o: org.sireum.lang.ast.Pattern.SeqWildcard): PreResult[org.sireum.lang.ast.Pattern] = {
    return PreResult_langastPatternSeqWildcard
  }

  def pre_langastPatternStructure(o: org.sireum.lang.ast.Pattern.Structure): PreResult[org.sireum.lang.ast.Pattern] = {
    return PreResult_langastPatternStructure
  }

  def pre_langastExp(o: org.sireum.lang.ast.Exp): PreResult[org.sireum.lang.ast.Exp] = {
    o match {
      case o: org.sireum.lang.ast.Exp.LitB => return pre_langastExpLitB(o)
      case o: org.sireum.lang.ast.Exp.LitC => return pre_langastExpLitC(o)
      case o: org.sireum.lang.ast.Exp.LitZ => return pre_langastExpLitZ(o)
      case o: org.sireum.lang.ast.Exp.LitF32 => return pre_langastExpLitF32(o)
      case o: org.sireum.lang.ast.Exp.LitF64 => return pre_langastExpLitF64(o)
      case o: org.sireum.lang.ast.Exp.LitR => return pre_langastExpLitR(o)
      case o: org.sireum.lang.ast.Exp.LitString => return pre_langastExpLitString(o)
      case o: org.sireum.lang.ast.Exp.LitStepId => return pre_langastExpLitStepId(o)
      case o: org.sireum.lang.ast.Exp.StringInterpolate => return pre_langastExpStringInterpolate(o)
      case o: org.sireum.lang.ast.Exp.This => return pre_langastExpThis(o)
      case o: org.sireum.lang.ast.Exp.Super => return pre_langastExpSuper(o)
      case o: org.sireum.lang.ast.Exp.Unary => return pre_langastExpUnary(o)
      case o: org.sireum.lang.ast.Exp.Binary => return pre_langastExpBinary(o)
      case o: org.sireum.lang.ast.Exp.Ident => return pre_langastExpIdent(o)
      case o: org.sireum.lang.ast.Exp.Eta => return pre_langastExpEta(o)
      case o: org.sireum.lang.ast.Exp.Tuple => return pre_langastExpTuple(o)
      case o: org.sireum.lang.ast.Exp.Select => return pre_langastExpSelect(o)
      case o: org.sireum.lang.ast.Exp.Invoke => return pre_langastExpInvoke(o)
      case o: org.sireum.lang.ast.Exp.InvokeNamed => return pre_langastExpInvokeNamed(o)
      case o: org.sireum.lang.ast.Exp.If => return pre_langastExpIf(o)
      case o: org.sireum.lang.ast.Exp.Fun => return pre_langastExpFun(o)
      case o: org.sireum.lang.ast.Exp.ForYield => return pre_langastExpForYield(o)
      case o: org.sireum.lang.ast.Exp.QuantType =>
        val r: PreResult[org.sireum.lang.ast.Exp] = pre_langastExpQuantType(o) match {
         case PreResult(continu, MSome(r: org.sireum.lang.ast.Exp)) => PreResult(continu, MSome[org.sireum.lang.ast.Exp](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.Exp")
         case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.Exp]())
        }
        return r
      case o: org.sireum.lang.ast.Exp.QuantRange =>
        val r: PreResult[org.sireum.lang.ast.Exp] = pre_langastExpQuantRange(o) match {
         case PreResult(continu, MSome(r: org.sireum.lang.ast.Exp)) => PreResult(continu, MSome[org.sireum.lang.ast.Exp](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.Exp")
         case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.Exp]())
        }
        return r
      case o: org.sireum.lang.ast.Exp.QuantEach =>
        val r: PreResult[org.sireum.lang.ast.Exp] = pre_langastExpQuantEach(o) match {
         case PreResult(continu, MSome(r: org.sireum.lang.ast.Exp)) => PreResult(continu, MSome[org.sireum.lang.ast.Exp](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.Exp")
         case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.Exp]())
        }
        return r
      case o: org.sireum.lang.ast.Exp.Input => return pre_langastExpInput(o)
      case o: org.sireum.lang.ast.Exp.OldVal => return pre_langastExpOldVal(o)
      case o: org.sireum.lang.ast.Exp.LoopIndex => return pre_langastExpLoopIndex(o)
      case o: org.sireum.lang.ast.Exp.StateSeq => return pre_langastExpStateSeq(o)
      case o: org.sireum.lang.ast.Exp.Result => return pre_langastExpResult(o)
    }
  }

  def pre_langastLit(o: org.sireum.lang.ast.Lit): PreResult[org.sireum.lang.ast.Lit] = {
    o match {
      case o: org.sireum.lang.ast.Exp.LitB =>
        val r: PreResult[org.sireum.lang.ast.Lit] = pre_langastExpLitB(o) match {
         case PreResult(continu, MSome(r: org.sireum.lang.ast.Lit)) => PreResult(continu, MSome[org.sireum.lang.ast.Lit](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.Lit")
         case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.Lit]())
        }
        return r
      case o: org.sireum.lang.ast.Exp.LitC =>
        val r: PreResult[org.sireum.lang.ast.Lit] = pre_langastExpLitC(o) match {
         case PreResult(continu, MSome(r: org.sireum.lang.ast.Lit)) => PreResult(continu, MSome[org.sireum.lang.ast.Lit](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.Lit")
         case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.Lit]())
        }
        return r
      case o: org.sireum.lang.ast.Exp.LitZ =>
        val r: PreResult[org.sireum.lang.ast.Lit] = pre_langastExpLitZ(o) match {
         case PreResult(continu, MSome(r: org.sireum.lang.ast.Lit)) => PreResult(continu, MSome[org.sireum.lang.ast.Lit](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.Lit")
         case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.Lit]())
        }
        return r
      case o: org.sireum.lang.ast.Exp.LitF32 =>
        val r: PreResult[org.sireum.lang.ast.Lit] = pre_langastExpLitF32(o) match {
         case PreResult(continu, MSome(r: org.sireum.lang.ast.Lit)) => PreResult(continu, MSome[org.sireum.lang.ast.Lit](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.Lit")
         case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.Lit]())
        }
        return r
      case o: org.sireum.lang.ast.Exp.LitF64 =>
        val r: PreResult[org.sireum.lang.ast.Lit] = pre_langastExpLitF64(o) match {
         case PreResult(continu, MSome(r: org.sireum.lang.ast.Lit)) => PreResult(continu, MSome[org.sireum.lang.ast.Lit](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.Lit")
         case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.Lit]())
        }
        return r
      case o: org.sireum.lang.ast.Exp.LitR =>
        val r: PreResult[org.sireum.lang.ast.Lit] = pre_langastExpLitR(o) match {
         case PreResult(continu, MSome(r: org.sireum.lang.ast.Lit)) => PreResult(continu, MSome[org.sireum.lang.ast.Lit](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.Lit")
         case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.Lit]())
        }
        return r
      case o: org.sireum.lang.ast.Exp.LitString =>
        val r: PreResult[org.sireum.lang.ast.Lit] = pre_langastExpLitString(o) match {
         case PreResult(continu, MSome(r: org.sireum.lang.ast.Lit)) => PreResult(continu, MSome[org.sireum.lang.ast.Lit](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.Lit")
         case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.Lit]())
        }
        return r
      case o: org.sireum.lang.ast.Exp.LitStepId =>
        val r: PreResult[org.sireum.lang.ast.Lit] = pre_langastExpLitStepId(o) match {
         case PreResult(continu, MSome(r: org.sireum.lang.ast.Lit)) => PreResult(continu, MSome[org.sireum.lang.ast.Lit](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.Lit")
         case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.Lit]())
        }
        return r
    }
  }

  def pre_langastExpLitB(o: org.sireum.lang.ast.Exp.LitB): PreResult[org.sireum.lang.ast.Exp] = {
    return PreResult_langastExpLitB
  }

  def pre_langastExpLitC(o: org.sireum.lang.ast.Exp.LitC): PreResult[org.sireum.lang.ast.Exp] = {
    return PreResult_langastExpLitC
  }

  def pre_langastExpLitZ(o: org.sireum.lang.ast.Exp.LitZ): PreResult[org.sireum.lang.ast.Exp] = {
    return PreResult_langastExpLitZ
  }

  def pre_langastExpLitF32(o: org.sireum.lang.ast.Exp.LitF32): PreResult[org.sireum.lang.ast.Exp] = {
    return PreResult_langastExpLitF32
  }

  def pre_langastExpLitF64(o: org.sireum.lang.ast.Exp.LitF64): PreResult[org.sireum.lang.ast.Exp] = {
    return PreResult_langastExpLitF64
  }

  def pre_langastExpLitR(o: org.sireum.lang.ast.Exp.LitR): PreResult[org.sireum.lang.ast.Exp] = {
    return PreResult_langastExpLitR
  }

  def pre_langastExpLitString(o: org.sireum.lang.ast.Exp.LitString): PreResult[org.sireum.lang.ast.Exp] = {
    return PreResult_langastExpLitString
  }

  def pre_langastExpLitStepId(o: org.sireum.lang.ast.Exp.LitStepId): PreResult[org.sireum.lang.ast.Exp] = {
    return PreResult_langastExpLitStepId
  }

  def pre_langastExpStringInterpolate(o: org.sireum.lang.ast.Exp.StringInterpolate): PreResult[org.sireum.lang.ast.Exp] = {
    return PreResult_langastExpStringInterpolate
  }

  def pre_langastExpThis(o: org.sireum.lang.ast.Exp.This): PreResult[org.sireum.lang.ast.Exp] = {
    return PreResult_langastExpThis
  }

  def pre_langastExpSuper(o: org.sireum.lang.ast.Exp.Super): PreResult[org.sireum.lang.ast.Exp] = {
    return PreResult_langastExpSuper
  }

  def pre_langastExpUnary(o: org.sireum.lang.ast.Exp.Unary): PreResult[org.sireum.lang.ast.Exp] = {
    return PreResult_langastExpUnary
  }

  def pre_langastExpRef(o: org.sireum.lang.ast.Exp.Ref): PreResult[org.sireum.lang.ast.Exp.Ref] = {
    o match {
      case o: org.sireum.lang.ast.Exp.Ident =>
        val r: PreResult[org.sireum.lang.ast.Exp.Ref] = pre_langastExpIdent(o) match {
         case PreResult(continu, MSome(r: org.sireum.lang.ast.Exp.Ref)) => PreResult(continu, MSome[org.sireum.lang.ast.Exp.Ref](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.Exp.Ref")
         case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.Exp.Ref]())
        }
        return r
      case o: org.sireum.lang.ast.Exp.Select =>
        val r: PreResult[org.sireum.lang.ast.Exp.Ref] = pre_langastExpSelect(o) match {
         case PreResult(continu, MSome(r: org.sireum.lang.ast.Exp.Ref)) => PreResult(continu, MSome[org.sireum.lang.ast.Exp.Ref](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.Exp.Ref")
         case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.Exp.Ref]())
        }
        return r
    }
  }

  def pre_langastExpBinary(o: org.sireum.lang.ast.Exp.Binary): PreResult[org.sireum.lang.ast.Exp] = {
    return PreResult_langastExpBinary
  }

  def pre_langastExpIdent(o: org.sireum.lang.ast.Exp.Ident): PreResult[org.sireum.lang.ast.Exp] = {
    return PreResult_langastExpIdent
  }

  def pre_langastExpEta(o: org.sireum.lang.ast.Exp.Eta): PreResult[org.sireum.lang.ast.Exp] = {
    return PreResult_langastExpEta
  }

  def pre_langastExpTuple(o: org.sireum.lang.ast.Exp.Tuple): PreResult[org.sireum.lang.ast.Exp] = {
    return PreResult_langastExpTuple
  }

  def pre_langastExpSelect(o: org.sireum.lang.ast.Exp.Select): PreResult[org.sireum.lang.ast.Exp] = {
    return PreResult_langastExpSelect
  }

  def pre_langastExpInvoke(o: org.sireum.lang.ast.Exp.Invoke): PreResult[org.sireum.lang.ast.Exp] = {
    return PreResult_langastExpInvoke
  }

  def pre_langastExpInvokeNamed(o: org.sireum.lang.ast.Exp.InvokeNamed): PreResult[org.sireum.lang.ast.Exp] = {
    return PreResult_langastExpInvokeNamed
  }

  def pre_langastExpIf(o: org.sireum.lang.ast.Exp.If): PreResult[org.sireum.lang.ast.Exp] = {
    return PreResult_langastExpIf
  }

  def pre_langastExpFunParam(o: org.sireum.lang.ast.Exp.Fun.Param): PreResult[org.sireum.lang.ast.Exp.Fun.Param] = {
    return PreResult_langastExpFunParam
  }

  def pre_langastExpFun(o: org.sireum.lang.ast.Exp.Fun): PreResult[org.sireum.lang.ast.Exp] = {
    return PreResult_langastExpFun
  }

  def pre_langastExpForYield(o: org.sireum.lang.ast.Exp.ForYield): PreResult[org.sireum.lang.ast.Exp] = {
    return PreResult_langastExpForYield
  }

  def pre_langastExpQuant(o: org.sireum.lang.ast.Exp.Quant): PreResult[org.sireum.lang.ast.Exp.Quant] = {
    o match {
      case o: org.sireum.lang.ast.Exp.QuantType => return pre_langastExpQuantType(o)
      case o: org.sireum.lang.ast.Exp.QuantRange => return pre_langastExpQuantRange(o)
      case o: org.sireum.lang.ast.Exp.QuantEach => return pre_langastExpQuantEach(o)
    }
  }

  def pre_langastExpQuantType(o: org.sireum.lang.ast.Exp.QuantType): PreResult[org.sireum.lang.ast.Exp.Quant] = {
    return PreResult_langastExpQuantType
  }

  def pre_langastExpQuantRange(o: org.sireum.lang.ast.Exp.QuantRange): PreResult[org.sireum.lang.ast.Exp.Quant] = {
    return PreResult_langastExpQuantRange
  }

  def pre_langastExpQuantEach(o: org.sireum.lang.ast.Exp.QuantEach): PreResult[org.sireum.lang.ast.Exp.Quant] = {
    return PreResult_langastExpQuantEach
  }

  def pre_langastExpInput(o: org.sireum.lang.ast.Exp.Input): PreResult[org.sireum.lang.ast.Exp] = {
    return PreResult_langastExpInput
  }

  def pre_langastExpOldVal(o: org.sireum.lang.ast.Exp.OldVal): PreResult[org.sireum.lang.ast.Exp] = {
    return PreResult_langastExpOldVal
  }

  def pre_langastExpLoopIndex(o: org.sireum.lang.ast.Exp.LoopIndex): PreResult[org.sireum.lang.ast.Exp] = {
    return PreResult_langastExpLoopIndex
  }

  def pre_langastExpStateSeq(o: org.sireum.lang.ast.Exp.StateSeq): PreResult[org.sireum.lang.ast.Exp] = {
    return PreResult_langastExpStateSeq
  }

  def pre_langastExpStateSeqFragment(o: org.sireum.lang.ast.Exp.StateSeq.Fragment): PreResult[org.sireum.lang.ast.Exp.StateSeq.Fragment] = {
    return PreResult_langastExpStateSeqFragment
  }

  def pre_langastExpResult(o: org.sireum.lang.ast.Exp.Result): PreResult[org.sireum.lang.ast.Exp] = {
    return PreResult_langastExpResult
  }

  def pre_langastNamedArg(o: org.sireum.lang.ast.NamedArg): PreResult[org.sireum.lang.ast.NamedArg] = {
    return PreResult_langastNamedArg
  }

  def pre_langastId(o: org.sireum.lang.ast.Id): PreResult[org.sireum.lang.ast.Id] = {
    return PreResult_langastId
  }

  def pre_langastName(o: org.sireum.lang.ast.Name): PreResult[org.sireum.lang.ast.Name] = {
    return PreResult_langastName
  }

  def pre_langastBody(o: org.sireum.lang.ast.Body): PreResult[org.sireum.lang.ast.Body] = {
    return PreResult_langastBody
  }

  def pre_langastAdtParam(o: org.sireum.lang.ast.AdtParam): PreResult[org.sireum.lang.ast.AdtParam] = {
    return PreResult_langastAdtParam
  }

  def pre_langastMethodSig(o: org.sireum.lang.ast.MethodSig): PreResult[org.sireum.lang.ast.MethodSig] = {
    return PreResult_langastMethodSig
  }

  def pre_langastParam(o: org.sireum.lang.ast.Param): PreResult[org.sireum.lang.ast.Param] = {
    return PreResult_langastParam
  }

  def pre_langastTypeParam(o: org.sireum.lang.ast.TypeParam): PreResult[org.sireum.lang.ast.TypeParam] = {
    return PreResult_langastTypeParam
  }

  def pre_langastAttr(o: org.sireum.lang.ast.Attr): PreResult[org.sireum.lang.ast.Attr] = {
    return PreResult_langastAttr
  }

  def pre_langastTypedAttr(o: org.sireum.lang.ast.TypedAttr): PreResult[org.sireum.lang.ast.TypedAttr] = {
    return PreResult_langastTypedAttr
  }

  def pre_langastResolvedAttr(o: org.sireum.lang.ast.ResolvedAttr): PreResult[org.sireum.lang.ast.ResolvedAttr] = {
    return PreResult_langastResolvedAttr
  }

  def pre_langastResolvedInfo(o: org.sireum.lang.ast.ResolvedInfo): PreResult[org.sireum.lang.ast.ResolvedInfo] = {
    o match {
      case o: org.sireum.lang.ast.ResolvedInfo.BuiltIn => return pre_langastResolvedInfoBuiltIn(o)
      case o: org.sireum.lang.ast.ResolvedInfo.Package => return pre_langastResolvedInfoPackage(o)
      case o: org.sireum.lang.ast.ResolvedInfo.Enum => return pre_langastResolvedInfoEnum(o)
      case o: org.sireum.lang.ast.ResolvedInfo.EnumElement => return pre_langastResolvedInfoEnumElement(o)
      case o: org.sireum.lang.ast.ResolvedInfo.Object => return pre_langastResolvedInfoObject(o)
      case o: org.sireum.lang.ast.ResolvedInfo.Var => return pre_langastResolvedInfoVar(o)
      case o: org.sireum.lang.ast.ResolvedInfo.Method => return pre_langastResolvedInfoMethod(o)
      case o: org.sireum.lang.ast.ResolvedInfo.Methods => return pre_langastResolvedInfoMethods(o)
      case o: org.sireum.lang.ast.ResolvedInfo.Tuple => return pre_langastResolvedInfoTuple(o)
      case o: org.sireum.lang.ast.ResolvedInfo.LocalVar => return pre_langastResolvedInfoLocalVar(o)
      case o: org.sireum.lang.ast.ResolvedInfo.Fact => return pre_langastResolvedInfoFact(o)
      case o: org.sireum.lang.ast.ResolvedInfo.Theorem => return pre_langastResolvedInfoTheorem(o)
      case o: org.sireum.lang.ast.ResolvedInfo.Inv => return pre_langastResolvedInfoInv(o)
    }
  }

  def pre_langastResolvedInfoBuiltIn(o: org.sireum.lang.ast.ResolvedInfo.BuiltIn): PreResult[org.sireum.lang.ast.ResolvedInfo] = {
    return PreResult_langastResolvedInfoBuiltIn
  }

  def pre_langastResolvedInfoPackage(o: org.sireum.lang.ast.ResolvedInfo.Package): PreResult[org.sireum.lang.ast.ResolvedInfo] = {
    return PreResult_langastResolvedInfoPackage
  }

  def pre_langastResolvedInfoEnum(o: org.sireum.lang.ast.ResolvedInfo.Enum): PreResult[org.sireum.lang.ast.ResolvedInfo] = {
    return PreResult_langastResolvedInfoEnum
  }

  def pre_langastResolvedInfoEnumElement(o: org.sireum.lang.ast.ResolvedInfo.EnumElement): PreResult[org.sireum.lang.ast.ResolvedInfo] = {
    return PreResult_langastResolvedInfoEnumElement
  }

  def pre_langastResolvedInfoObject(o: org.sireum.lang.ast.ResolvedInfo.Object): PreResult[org.sireum.lang.ast.ResolvedInfo] = {
    return PreResult_langastResolvedInfoObject
  }

  def pre_langastResolvedInfoVar(o: org.sireum.lang.ast.ResolvedInfo.Var): PreResult[org.sireum.lang.ast.ResolvedInfo] = {
    return PreResult_langastResolvedInfoVar
  }

  def pre_langastResolvedInfoMethod(o: org.sireum.lang.ast.ResolvedInfo.Method): PreResult[org.sireum.lang.ast.ResolvedInfo] = {
    return PreResult_langastResolvedInfoMethod
  }

  def pre_langastResolvedInfoMethods(o: org.sireum.lang.ast.ResolvedInfo.Methods): PreResult[org.sireum.lang.ast.ResolvedInfo] = {
    return PreResult_langastResolvedInfoMethods
  }

  def pre_langastResolvedInfoTuple(o: org.sireum.lang.ast.ResolvedInfo.Tuple): PreResult[org.sireum.lang.ast.ResolvedInfo] = {
    return PreResult_langastResolvedInfoTuple
  }

  def pre_langastResolvedInfoLocalVar(o: org.sireum.lang.ast.ResolvedInfo.LocalVar): PreResult[org.sireum.lang.ast.ResolvedInfo] = {
    return PreResult_langastResolvedInfoLocalVar
  }

  def pre_langastResolvedInfoFact(o: org.sireum.lang.ast.ResolvedInfo.Fact): PreResult[org.sireum.lang.ast.ResolvedInfo] = {
    return PreResult_langastResolvedInfoFact
  }

  def pre_langastResolvedInfoTheorem(o: org.sireum.lang.ast.ResolvedInfo.Theorem): PreResult[org.sireum.lang.ast.ResolvedInfo] = {
    return PreResult_langastResolvedInfoTheorem
  }

  def pre_langastResolvedInfoInv(o: org.sireum.lang.ast.ResolvedInfo.Inv): PreResult[org.sireum.lang.ast.ResolvedInfo] = {
    return PreResult_langastResolvedInfoInv
  }

  def pre_langastTruthTableRow(o: org.sireum.lang.ast.TruthTable.Row): PreResult[org.sireum.lang.ast.TruthTable.Row] = {
    return PreResult_langastTruthTableRow
  }

  def pre_langastTruthTableAssignment(o: org.sireum.lang.ast.TruthTable.Assignment): PreResult[org.sireum.lang.ast.TruthTable.Assignment] = {
    return PreResult_langastTruthTableAssignment
  }

  def pre_langastTruthTableConclusion(o: org.sireum.lang.ast.TruthTable.Conclusion): PreResult[org.sireum.lang.ast.TruthTable.Conclusion] = {
    o match {
      case o: org.sireum.lang.ast.TruthTable.Conclusion.Validity => return pre_langastTruthTableConclusionValidity(o)
      case o: org.sireum.lang.ast.TruthTable.Conclusion.Tautology => return pre_langastTruthTableConclusionTautology(o)
      case o: org.sireum.lang.ast.TruthTable.Conclusion.Contradictory => return pre_langastTruthTableConclusionContradictory(o)
      case o: org.sireum.lang.ast.TruthTable.Conclusion.Contingent => return pre_langastTruthTableConclusionContingent(o)
    }
  }

  def pre_langastTruthTableConclusionValidity(o: org.sireum.lang.ast.TruthTable.Conclusion.Validity): PreResult[org.sireum.lang.ast.TruthTable.Conclusion] = {
    return PreResult_langastTruthTableConclusionValidity
  }

  def pre_langastTruthTableConclusionTautology(o: org.sireum.lang.ast.TruthTable.Conclusion.Tautology): PreResult[org.sireum.lang.ast.TruthTable.Conclusion] = {
    return PreResult_langastTruthTableConclusionTautology
  }

  def pre_langastTruthTableConclusionContradictory(o: org.sireum.lang.ast.TruthTable.Conclusion.Contradictory): PreResult[org.sireum.lang.ast.TruthTable.Conclusion] = {
    return PreResult_langastTruthTableConclusionContradictory
  }

  def pre_langastTruthTableConclusionContingent(o: org.sireum.lang.ast.TruthTable.Conclusion.Contingent): PreResult[org.sireum.lang.ast.TruthTable.Conclusion] = {
    return PreResult_langastTruthTableConclusionContingent
  }

  def preSmfAnnex(o: SmfAnnex): PreResult[SmfAnnex] = {
    o match {
      case o: SmfClause =>
        val r: PreResult[SmfAnnex] = preSmfClause(o) match {
         case PreResult(continu, MSome(r: SmfAnnex)) => PreResult(continu, MSome[SmfAnnex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type SmfAnnex")
         case PreResult(continu, _) => PreResult(continu, MNone[SmfAnnex]())
        }
        return r
      case o: SmfClassification =>
        val r: PreResult[SmfAnnex] = preSmfClassification(o) match {
         case PreResult(continu, MSome(r: SmfAnnex)) => PreResult(continu, MSome[SmfAnnex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type SmfAnnex")
         case PreResult(continu, _) => PreResult(continu, MNone[SmfAnnex]())
        }
        return r
      case o: SmfDeclass =>
        val r: PreResult[SmfAnnex] = preSmfDeclass(o) match {
         case PreResult(continu, MSome(r: SmfAnnex)) => PreResult(continu, MSome[SmfAnnex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type SmfAnnex")
         case PreResult(continu, _) => PreResult(continu, MNone[SmfAnnex]())
        }
        return r
      case o: SmfType =>
        val r: PreResult[SmfAnnex] = preSmfType(o) match {
         case PreResult(continu, MSome(r: SmfAnnex)) => PreResult(continu, MSome[SmfAnnex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type SmfAnnex")
         case PreResult(continu, _) => PreResult(continu, MNone[SmfAnnex]())
        }
        return r
    }
  }

  def preSmfLib(o: SmfLib): PreResult[SmfLib] = {
    o match {
      case o: SmfLibrary =>
        val r: PreResult[SmfLib] = preSmfLibrary(o) match {
         case PreResult(continu, MSome(r: SmfLib)) => PreResult(continu, MSome[SmfLib](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type SmfLib")
         case PreResult(continu, _) => PreResult(continu, MNone[SmfLib]())
        }
        return r
    }
  }

  def preSmfClause(o: SmfClause): PreResult[SmfClause] = {
    return PreResultSmfClause
  }

  def preSmfClassification(o: SmfClassification): PreResult[SmfClassification] = {
    return PreResultSmfClassification
  }

  def preSmfDeclass(o: SmfDeclass): PreResult[SmfDeclass] = {
    return PreResultSmfDeclass
  }

  def preSmfLibrary(o: SmfLibrary): PreResult[SmfLibrary] = {
    return PreResultSmfLibrary
  }

  def preSmfType(o: SmfType): PreResult[SmfType] = {
    return PreResultSmfType
  }

  def preAadlInstInfo(o: AadlInstInfo): PreResult[AadlInstInfo] = {
    o match {
      case o: Component =>
        val r: PreResult[AadlInstInfo] = preComponent(o) match {
         case PreResult(continu, MSome(r: AadlInstInfo)) => PreResult(continu, MSome[AadlInstInfo](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AadlInstInfo")
         case PreResult(continu, _) => PreResult(continu, MNone[AadlInstInfo]())
        }
        return r
      case o: ErrorTypeDef =>
        val r: PreResult[AadlInstInfo] = preErrorTypeDef(o) match {
         case PreResult(continu, MSome(r: AadlInstInfo)) => PreResult(continu, MSome[AadlInstInfo](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AadlInstInfo")
         case PreResult(continu, _) => PreResult(continu, MNone[AadlInstInfo]())
        }
        return r
      case o: FeatureEnd =>
        val r: PreResult[AadlInstInfo] = preFeatureEnd(o) match {
         case PreResult(continu, MSome(r: AadlInstInfo)) => PreResult(continu, MSome[AadlInstInfo](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AadlInstInfo")
         case PreResult(continu, _) => PreResult(continu, MNone[AadlInstInfo]())
        }
        return r
      case o: FeatureGroup =>
        val r: PreResult[AadlInstInfo] = preFeatureGroup(o) match {
         case PreResult(continu, MSome(r: AadlInstInfo)) => PreResult(continu, MSome[AadlInstInfo](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AadlInstInfo")
         case PreResult(continu, _) => PreResult(continu, MNone[AadlInstInfo]())
        }
        return r
      case o: FeatureAccess =>
        val r: PreResult[AadlInstInfo] = preFeatureAccess(o) match {
         case PreResult(continu, MSome(r: AadlInstInfo)) => PreResult(continu, MSome[AadlInstInfo](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AadlInstInfo")
         case PreResult(continu, _) => PreResult(continu, MNone[AadlInstInfo]())
        }
        return r
      case o: Connection =>
        val r: PreResult[AadlInstInfo] = preConnection(o) match {
         case PreResult(continu, MSome(r: AadlInstInfo)) => PreResult(continu, MSome[AadlInstInfo](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AadlInstInfo")
         case PreResult(continu, _) => PreResult(continu, MNone[AadlInstInfo]())
        }
        return r
      case o: Emv2Flow =>
        val r: PreResult[AadlInstInfo] = preEmv2Flow(o) match {
         case PreResult(continu, MSome(r: AadlInstInfo)) => PreResult(continu, MSome[AadlInstInfo](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AadlInstInfo")
         case PreResult(continu, _) => PreResult(continu, MNone[AadlInstInfo]())
        }
        return r
      case o: Flow =>
        val r: PreResult[AadlInstInfo] = preFlow(o) match {
         case PreResult(continu, MSome(r: AadlInstInfo)) => PreResult(continu, MSome[AadlInstInfo](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AadlInstInfo")
         case PreResult(continu, _) => PreResult(continu, MNone[AadlInstInfo]())
        }
        return r
    }
  }

  def preEmv2Annex(o: Emv2Annex): PreResult[Emv2Annex] = {
    o match {
      case o: ErrorTypeDef =>
        val r: PreResult[Emv2Annex] = preErrorTypeDef(o) match {
         case PreResult(continu, MSome(r: Emv2Annex)) => PreResult(continu, MSome[Emv2Annex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Emv2Annex")
         case PreResult(continu, _) => PreResult(continu, MNone[Emv2Annex]())
        }
        return r
      case o: ErrorAliasDef =>
        val r: PreResult[Emv2Annex] = preErrorAliasDef(o) match {
         case PreResult(continu, MSome(r: Emv2Annex)) => PreResult(continu, MSome[Emv2Annex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Emv2Annex")
         case PreResult(continu, _) => PreResult(continu, MNone[Emv2Annex]())
        }
        return r
      case o: ErrorTypeSetDef =>
        val r: PreResult[Emv2Annex] = preErrorTypeSetDef(o) match {
         case PreResult(continu, MSome(r: Emv2Annex)) => PreResult(continu, MSome[Emv2Annex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Emv2Annex")
         case PreResult(continu, _) => PreResult(continu, MNone[Emv2Annex]())
        }
        return r
      case o: BehaveStateMachine =>
        val r: PreResult[Emv2Annex] = preBehaveStateMachine(o) match {
         case PreResult(continu, MSome(r: Emv2Annex)) => PreResult(continu, MSome[Emv2Annex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Emv2Annex")
         case PreResult(continu, _) => PreResult(continu, MNone[Emv2Annex]())
        }
        return r
      case o: ErrorEvent =>
        val r: PreResult[Emv2Annex] = preErrorEvent(o) match {
         case PreResult(continu, MSome(r: Emv2Annex)) => PreResult(continu, MSome[Emv2Annex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Emv2Annex")
         case PreResult(continu, _) => PreResult(continu, MNone[Emv2Annex]())
        }
        return r
      case o: ErrorState =>
        val r: PreResult[Emv2Annex] = preErrorState(o) match {
         case PreResult(continu, MSome(r: Emv2Annex)) => PreResult(continu, MSome[Emv2Annex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Emv2Annex")
         case PreResult(continu, _) => PreResult(continu, MNone[Emv2Annex]())
        }
        return r
      case o: ErrorTransition =>
        val r: PreResult[Emv2Annex] = preErrorTransition(o) match {
         case PreResult(continu, MSome(r: Emv2Annex)) => PreResult(continu, MSome[Emv2Annex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Emv2Annex")
         case PreResult(continu, _) => PreResult(continu, MNone[Emv2Annex]())
        }
        return r
      case o: ConditionTrigger =>
        val r: PreResult[Emv2Annex] = preConditionTrigger(o) match {
         case PreResult(continu, MSome(r: Emv2Annex)) => PreResult(continu, MSome[Emv2Annex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Emv2Annex")
         case PreResult(continu, _) => PreResult(continu, MNone[Emv2Annex]())
        }
        return r
      case o: AndCondition =>
        val r: PreResult[Emv2Annex] = preAndCondition(o) match {
         case PreResult(continu, MSome(r: Emv2Annex)) => PreResult(continu, MSome[Emv2Annex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Emv2Annex")
         case PreResult(continu, _) => PreResult(continu, MNone[Emv2Annex]())
        }
        return r
      case o: OrCondition =>
        val r: PreResult[Emv2Annex] = preOrCondition(o) match {
         case PreResult(continu, MSome(r: Emv2Annex)) => PreResult(continu, MSome[Emv2Annex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Emv2Annex")
         case PreResult(continu, _) => PreResult(continu, MNone[Emv2Annex]())
        }
        return r
      case o: AllCondition =>
        val r: PreResult[Emv2Annex] = preAllCondition(o) match {
         case PreResult(continu, MSome(r: Emv2Annex)) => PreResult(continu, MSome[Emv2Annex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Emv2Annex")
         case PreResult(continu, _) => PreResult(continu, MNone[Emv2Annex]())
        }
        return r
      case o: OrMoreCondition =>
        val r: PreResult[Emv2Annex] = preOrMoreCondition(o) match {
         case PreResult(continu, MSome(r: Emv2Annex)) => PreResult(continu, MSome[Emv2Annex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Emv2Annex")
         case PreResult(continu, _) => PreResult(continu, MNone[Emv2Annex]())
        }
        return r
      case o: OrLessCondition =>
        val r: PreResult[Emv2Annex] = preOrLessCondition(o) match {
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
      case o: Emv2BehaviorSection =>
        val r: PreResult[Emv2Annex] = preEmv2BehaviorSection(o) match {
         case PreResult(continu, MSome(r: Emv2Annex)) => PreResult(continu, MSome[Emv2Annex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Emv2Annex")
         case PreResult(continu, _) => PreResult(continu, MNone[Emv2Annex]())
        }
        return r
      case o: ErrorPropagation =>
        val r: PreResult[Emv2Annex] = preErrorPropagation(o) match {
         case PreResult(continu, MSome(r: Emv2Annex)) => PreResult(continu, MSome[Emv2Annex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Emv2Annex")
         case PreResult(continu, _) => PreResult(continu, MNone[Emv2Annex]())
        }
        return r
    }
  }

  def preEmv2Lib(o: Emv2Lib): PreResult[Emv2Lib] = {
    o match {
      case o: Emv2Library =>
        val r: PreResult[Emv2Lib] = preEmv2Library(o) match {
         case PreResult(continu, MSome(r: Emv2Lib)) => PreResult(continu, MSome[Emv2Lib](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Emv2Lib")
         case PreResult(continu, _) => PreResult(continu, MNone[Emv2Lib]())
        }
        return r
    }
  }

  def preAadl(o: Aadl): PreResult[Aadl] = {
    return PreResultAadl
  }

  def pre_langastTyped(o: org.sireum.lang.ast.Typed): PreResult[org.sireum.lang.ast.Typed] = {
    o match {
      case o: org.sireum.lang.ast.Typed.Name => return pre_langastTypedName(o)
      case o: org.sireum.lang.ast.Typed.Tuple => return pre_langastTypedTuple(o)
      case o: org.sireum.lang.ast.Typed.Fun => return pre_langastTypedFun(o)
      case o: org.sireum.lang.ast.Typed.TypeVar => return pre_langastTypedTypeVar(o)
      case o: org.sireum.lang.ast.Typed.Package => return pre_langastTypedPackage(o)
      case o: org.sireum.lang.ast.Typed.Object => return pre_langastTypedObject(o)
      case o: org.sireum.lang.ast.Typed.Enum => return pre_langastTypedEnum(o)
      case o: org.sireum.lang.ast.Typed.Method => return pre_langastTypedMethod(o)
      case o: org.sireum.lang.ast.Typed.Methods => return pre_langastTypedMethods(o)
      case o: org.sireum.lang.ast.Typed.Fact => return pre_langastTypedFact(o)
      case o: org.sireum.lang.ast.Typed.Theorem => return pre_langastTypedTheorem(o)
      case o: org.sireum.lang.ast.Typed.Inv => return pre_langastTypedInv(o)
    }
  }

  def preEmv2ElementRef(o: Emv2ElementRef): PreResult[Emv2ElementRef] = {
    return PreResultEmv2ElementRef
  }

  def preName(o: Name): PreResult[Name] = {
    return PreResultName
  }

  def preComponent(o: Component): PreResult[Component] = {
    return PreResultComponent
  }

  def preEmv2Library(o: Emv2Library): PreResult[Emv2Library] = {
    return PreResultEmv2Library
  }

  def preErrorTypeDef(o: ErrorTypeDef): PreResult[ErrorTypeDef] = {
    return PreResultErrorTypeDef
  }

  def preClassifier(o: Classifier): PreResult[Classifier] = {
    return PreResultClassifier
  }

  def preErrorAliasDef(o: ErrorAliasDef): PreResult[ErrorAliasDef] = {
    return PreResultErrorAliasDef
  }

  def preErrorTypeSetDef(o: ErrorTypeSetDef): PreResult[ErrorTypeSetDef] = {
    return PreResultErrorTypeSetDef
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

  def preBehaveStateMachine(o: BehaveStateMachine): PreResult[BehaveStateMachine] = {
    return PreResultBehaveStateMachine
  }

  def preFeatureEnd(o: FeatureEnd): PreResult[FeatureEnd] = {
    return PreResultFeatureEnd
  }

  def preErrorEvent(o: ErrorEvent): PreResult[ErrorEvent] = {
    return PreResultErrorEvent
  }

  def preErrorState(o: ErrorState): PreResult[ErrorState] = {
    return PreResultErrorState
  }

  def preErrorTransition(o: ErrorTransition): PreResult[ErrorTransition] = {
    return PreResultErrorTransition
  }

  def preFeatureGroup(o: FeatureGroup): PreResult[FeatureGroup] = {
    return PreResultFeatureGroup
  }

  def preErrorCondition(o: ErrorCondition): PreResult[ErrorCondition] = {
    o match {
      case o: ConditionTrigger =>
        val r: PreResult[ErrorCondition] = preConditionTrigger(o) match {
         case PreResult(continu, MSome(r: ErrorCondition)) => PreResult(continu, MSome[ErrorCondition](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type ErrorCondition")
         case PreResult(continu, _) => PreResult(continu, MNone[ErrorCondition]())
        }
        return r
      case o: AndCondition =>
        val r: PreResult[ErrorCondition] = preAndCondition(o) match {
         case PreResult(continu, MSome(r: ErrorCondition)) => PreResult(continu, MSome[ErrorCondition](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type ErrorCondition")
         case PreResult(continu, _) => PreResult(continu, MNone[ErrorCondition]())
        }
        return r
      case o: OrCondition =>
        val r: PreResult[ErrorCondition] = preOrCondition(o) match {
         case PreResult(continu, MSome(r: ErrorCondition)) => PreResult(continu, MSome[ErrorCondition](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type ErrorCondition")
         case PreResult(continu, _) => PreResult(continu, MNone[ErrorCondition]())
        }
        return r
      case o: AllCondition =>
        val r: PreResult[ErrorCondition] = preAllCondition(o) match {
         case PreResult(continu, MSome(r: ErrorCondition)) => PreResult(continu, MSome[ErrorCondition](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type ErrorCondition")
         case PreResult(continu, _) => PreResult(continu, MNone[ErrorCondition]())
        }
        return r
      case o: OrMoreCondition =>
        val r: PreResult[ErrorCondition] = preOrMoreCondition(o) match {
         case PreResult(continu, MSome(r: ErrorCondition)) => PreResult(continu, MSome[ErrorCondition](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type ErrorCondition")
         case PreResult(continu, _) => PreResult(continu, MNone[ErrorCondition]())
        }
        return r
      case o: OrLessCondition =>
        val r: PreResult[ErrorCondition] = preOrLessCondition(o) match {
         case PreResult(continu, MSome(r: ErrorCondition)) => PreResult(continu, MSome[ErrorCondition](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type ErrorCondition")
         case PreResult(continu, _) => PreResult(continu, MNone[ErrorCondition]())
        }
        return r
    }
  }

  def preConditionTrigger(o: ConditionTrigger): PreResult[ConditionTrigger] = {
    return PreResultConditionTrigger
  }

  def preAndCondition(o: AndCondition): PreResult[AndCondition] = {
    return PreResultAndCondition
  }

  def preFeatureAccess(o: FeatureAccess): PreResult[FeatureAccess] = {
    return PreResultFeatureAccess
  }

  def preOrCondition(o: OrCondition): PreResult[OrCondition] = {
    return PreResultOrCondition
  }

  def preAllCondition(o: AllCondition): PreResult[AllCondition] = {
    return PreResultAllCondition
  }

  def preOrMoreCondition(o: OrMoreCondition): PreResult[OrMoreCondition] = {
    return PreResultOrMoreCondition
  }

  def preOrLessCondition(o: OrLessCondition): PreResult[OrLessCondition] = {
    return PreResultOrLessCondition
  }

  def preEmv2Clause(o: Emv2Clause): PreResult[Emv2Clause] = {
    return PreResultEmv2Clause
  }

  def preEmv2Propagation(o: Emv2Propagation): PreResult[Emv2Propagation] = {
    return PreResultEmv2Propagation
  }

  def preConnection(o: Connection): PreResult[Connection] = {
    return PreResultConnection
  }

  def preEmv2Flow(o: Emv2Flow): PreResult[Emv2Flow] = {
    return PreResultEmv2Flow
  }

  def preEmv2BehaviorSection(o: Emv2BehaviorSection): PreResult[Emv2BehaviorSection] = {
    return PreResultEmv2BehaviorSection
  }

  def preConnectionInstance(o: ConnectionInstance): PreResult[ConnectionInstance] = {
    return PreResultConnectionInstance
  }

  def preErrorPropagation(o: ErrorPropagation): PreResult[ErrorPropagation] = {
    return PreResultErrorPropagation
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

  def preElementRef(o: ElementRef): PreResult[ElementRef] = {
    o match {
      case o: Emv2ElementRef =>
        val r: PreResult[ElementRef] = preEmv2ElementRef(o) match {
         case PreResult(continu, MSome(r: ElementRef)) => PreResult(continu, MSome[ElementRef](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type ElementRef")
         case PreResult(continu, _) => PreResult(continu, MNone[ElementRef]())
        }
        return r
      case o: AadlElementRef =>
        val r: PreResult[ElementRef] = preAadlElementRef(o) match {
         case PreResult(continu, MSome(r: ElementRef)) => PreResult(continu, MSome[ElementRef](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type ElementRef")
         case PreResult(continu, _) => PreResult(continu, MNone[ElementRef]())
        }
        return r
    }
  }

  def preAadlElementRef(o: AadlElementRef): PreResult[AadlElementRef] = {
    return PreResultAadlElementRef
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
      case o: SmfClause =>
        val r: PreResult[AnnexClause] = preSmfClause(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: SmfClassification =>
        val r: PreResult[AnnexClause] = preSmfClassification(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: SmfDeclass =>
        val r: PreResult[AnnexClause] = preSmfDeclass(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: SmfType =>
        val r: PreResult[AnnexClause] = preSmfType(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: ErrorTypeDef =>
        val r: PreResult[AnnexClause] = preErrorTypeDef(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: ErrorAliasDef =>
        val r: PreResult[AnnexClause] = preErrorAliasDef(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: ErrorTypeSetDef =>
        val r: PreResult[AnnexClause] = preErrorTypeSetDef(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: BehaveStateMachine =>
        val r: PreResult[AnnexClause] = preBehaveStateMachine(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: ErrorEvent =>
        val r: PreResult[AnnexClause] = preErrorEvent(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: ErrorState =>
        val r: PreResult[AnnexClause] = preErrorState(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: ErrorTransition =>
        val r: PreResult[AnnexClause] = preErrorTransition(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: ConditionTrigger =>
        val r: PreResult[AnnexClause] = preConditionTrigger(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: AndCondition =>
        val r: PreResult[AnnexClause] = preAndCondition(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: OrCondition =>
        val r: PreResult[AnnexClause] = preOrCondition(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: AllCondition =>
        val r: PreResult[AnnexClause] = preAllCondition(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: OrMoreCondition =>
        val r: PreResult[AnnexClause] = preOrMoreCondition(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: OrLessCondition =>
        val r: PreResult[AnnexClause] = preOrLessCondition(o) match {
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
      case o: Emv2BehaviorSection =>
        val r: PreResult[AnnexClause] = preEmv2BehaviorSection(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: ErrorPropagation =>
        val r: PreResult[AnnexClause] = preErrorPropagation(o) match {
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
      case o: GclSubclause =>
        val r: PreResult[AnnexClause] = preGclSubclause(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: BTSBLESSAnnexClause =>
        val r: PreResult[AnnexClause] = preBTSBLESSAnnexClause(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
    }
  }

  def preAnnexLib(o: AnnexLib): PreResult[AnnexLib] = {
    o match {
      case o: SmfLibrary =>
        val r: PreResult[AnnexLib] = preSmfLibrary(o) match {
         case PreResult(continu, MSome(r: AnnexLib)) => PreResult(continu, MSome[AnnexLib](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexLib")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexLib]())
        }
        return r
      case o: Emv2Library =>
        val r: PreResult[AnnexLib] = preEmv2Library(o) match {
         case PreResult(continu, MSome(r: AnnexLib)) => PreResult(continu, MSome[AnnexLib](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexLib")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexLib]())
        }
        return r
      case o: OtherLib =>
        val r: PreResult[AnnexLib] = preOtherLib(o) match {
         case PreResult(continu, MSome(r: AnnexLib)) => PreResult(continu, MSome[AnnexLib](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexLib")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexLib]())
        }
        return r
      case o: GclLibrary =>
        val r: PreResult[AnnexLib] = preGclLibrary(o) match {
         case PreResult(continu, MSome(r: AnnexLib)) => PreResult(continu, MSome[AnnexLib](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexLib")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexLib]())
        }
        return r
    }
  }

  def preOtherAnnex(o: OtherAnnex): PreResult[OtherAnnex] = {
    return PreResultOtherAnnex
  }

  def pre_langastTypedName(o: org.sireum.lang.ast.Typed.Name): PreResult[org.sireum.lang.ast.Typed] = {
    return PreResult_langastTypedName
  }

  def preOtherLib(o: OtherLib): PreResult[OtherLib] = {
    return PreResultOtherLib
  }

  def pre_langastTypedTuple(o: org.sireum.lang.ast.Typed.Tuple): PreResult[org.sireum.lang.ast.Typed] = {
    return PreResult_langastTypedTuple
  }

  def pre_langastTypedFun(o: org.sireum.lang.ast.Typed.Fun): PreResult[org.sireum.lang.ast.Typed] = {
    return PreResult_langastTypedFun
  }

  def pre_langastTypedTypeVar(o: org.sireum.lang.ast.Typed.TypeVar): PreResult[org.sireum.lang.ast.Typed] = {
    return PreResult_langastTypedTypeVar
  }

  def pre_langastTypedPackage(o: org.sireum.lang.ast.Typed.Package): PreResult[org.sireum.lang.ast.Typed] = {
    return PreResult_langastTypedPackage
  }

  def pre_langastTypedObject(o: org.sireum.lang.ast.Typed.Object): PreResult[org.sireum.lang.ast.Typed] = {
    return PreResult_langastTypedObject
  }

  def pre_langastTypedEnum(o: org.sireum.lang.ast.Typed.Enum): PreResult[org.sireum.lang.ast.Typed] = {
    return PreResult_langastTypedEnum
  }

  def pre_langastTypedMethod(o: org.sireum.lang.ast.Typed.Method): PreResult[org.sireum.lang.ast.Typed] = {
    return PreResult_langastTypedMethod
  }

  def pre_langastTypedMethods(o: org.sireum.lang.ast.Typed.Methods): PreResult[org.sireum.lang.ast.Typed] = {
    return PreResult_langastTypedMethods
  }

  def pre_langastTypedFact(o: org.sireum.lang.ast.Typed.Fact): PreResult[org.sireum.lang.ast.Typed] = {
    return PreResult_langastTypedFact
  }

  def pre_langastTypedTheorem(o: org.sireum.lang.ast.Typed.Theorem): PreResult[org.sireum.lang.ast.Typed] = {
    return PreResult_langastTypedTheorem
  }

  def pre_langastTypedInv(o: org.sireum.lang.ast.Typed.Inv): PreResult[org.sireum.lang.ast.Typed] = {
    return PreResult_langastTypedInv
  }

  def preGclAnnex(o: GclAnnex): PreResult[GclAnnex] = {
    o match {
      case o: GclSubclause =>
        val r: PreResult[GclAnnex] = preGclSubclause(o) match {
         case PreResult(continu, MSome(r: GclAnnex)) => PreResult(continu, MSome[GclAnnex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type GclAnnex")
         case PreResult(continu, _) => PreResult(continu, MNone[GclAnnex]())
        }
        return r
    }
  }

  def preGclSubclause(o: GclSubclause): PreResult[GclSubclause] = {
    return PreResultGclSubclause
  }

  def preBLESSAnnex(o: BLESSAnnex): PreResult[BLESSAnnex] = {
    o match {
      case o: BTSBLESSAnnexClause =>
        val r: PreResult[BLESSAnnex] = preBTSBLESSAnnexClause(o) match {
         case PreResult(continu, MSome(r: BLESSAnnex)) => PreResult(continu, MSome[BLESSAnnex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BLESSAnnex")
         case PreResult(continu, _) => PreResult(continu, MNone[BLESSAnnex]())
        }
        return r
    }
  }

  def preGclStateVar(o: GclStateVar): PreResult[GclStateVar] = {
    return PreResultGclStateVar
  }

  def preGclSpec(o: GclSpec): PreResult[GclSpec] = {
    o match {
      case o: GclInvariant =>
        val r: PreResult[GclSpec] = preGclInvariant(o) match {
         case PreResult(continu, MSome(r: GclSpec)) => PreResult(continu, MSome[GclSpec](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type GclSpec")
         case PreResult(continu, _) => PreResult(continu, MNone[GclSpec]())
        }
        return r
      case o: GclAssume =>
        val r: PreResult[GclSpec] = preGclAssume(o) match {
         case PreResult(continu, MSome(r: GclSpec)) => PreResult(continu, MSome[GclSpec](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type GclSpec")
         case PreResult(continu, _) => PreResult(continu, MNone[GclSpec]())
        }
        return r
      case o: GclGuarantee =>
        val r: PreResult[GclSpec] = preGclGuarantee(o) match {
         case PreResult(continu, MSome(r: GclSpec)) => PreResult(continu, MSome[GclSpec](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type GclSpec")
         case PreResult(continu, _) => PreResult(continu, MNone[GclSpec]())
        }
        return r
    }
  }

  def preGclInvariant(o: GclInvariant): PreResult[GclInvariant] = {
    return PreResultGclInvariant
  }

  def preBTSBLESSAnnexClause(o: BTSBLESSAnnexClause): PreResult[BTSBLESSAnnexClause] = {
    return PreResultBTSBLESSAnnexClause
  }

  def preGclComputeSpec(o: GclComputeSpec): PreResult[GclComputeSpec] = {
    o match {
      case o: GclAssume =>
        val r: PreResult[GclComputeSpec] = preGclAssume(o) match {
         case PreResult(continu, MSome(r: GclComputeSpec)) => PreResult(continu, MSome[GclComputeSpec](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type GclComputeSpec")
         case PreResult(continu, _) => PreResult(continu, MNone[GclComputeSpec]())
        }
        return r
      case o: GclGuarantee =>
        val r: PreResult[GclComputeSpec] = preGclGuarantee(o) match {
         case PreResult(continu, MSome(r: GclComputeSpec)) => PreResult(continu, MSome[GclComputeSpec](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type GclComputeSpec")
         case PreResult(continu, _) => PreResult(continu, MNone[GclComputeSpec]())
        }
        return r
    }
  }

  def preGclAssume(o: GclAssume): PreResult[GclAssume] = {
    return PreResultGclAssume
  }

  def preGclGuarantee(o: GclGuarantee): PreResult[GclGuarantee] = {
    return PreResultGclGuarantee
  }

  def preGclIntegration(o: GclIntegration): PreResult[GclIntegration] = {
    return PreResultGclIntegration
  }

  def preGclCaseStatement(o: GclCaseStatement): PreResult[GclCaseStatement] = {
    return PreResultGclCaseStatement
  }

  def preGclInitialize(o: GclInitialize): PreResult[GclInitialize] = {
    return PreResultGclInitialize
  }

  def preGclCompute(o: GclCompute): PreResult[GclCompute] = {
    return PreResultGclCompute
  }

  def preGclHandle(o: GclHandle): PreResult[GclHandle] = {
    return PreResultGclHandle
  }

  def preGclTODO(o: GclTODO): PreResult[GclTODO] = {
    return PreResultGclTODO
  }

  def preGclLibrary(o: GclLibrary): PreResult[GclLibrary] = {
    return PreResultGclLibrary
  }

  def preBTSVariableDeclaration(o: BTSVariableDeclaration): PreResult[BTSVariableDeclaration] = {
    return PreResultBTSVariableDeclaration
  }

  def preBTSType(o: BTSType): PreResult[BTSType] = {
    o match {
      case o: BTSClassifier =>
        val r: PreResult[BTSType] = preBTSClassifier(o) match {
         case PreResult(continu, MSome(r: BTSType)) => PreResult(continu, MSome[BTSType](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSType")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSType]())
        }
        return r
    }
  }

  def preBTSClassifier(o: BTSClassifier): PreResult[BTSClassifier] = {
    return PreResultBTSClassifier
  }

  def preBLESSIntConst(o: BLESSIntConst): PreResult[BLESSIntConst] = {
    return PreResultBLESSIntConst
  }

  def preBTSStateDeclaration(o: BTSStateDeclaration): PreResult[BTSStateDeclaration] = {
    return PreResultBTSStateDeclaration
  }

  def preBTSTransition(o: BTSTransition): PreResult[BTSTransition] = {
    return PreResultBTSTransition
  }

  def preBTSTransitionLabel(o: BTSTransitionLabel): PreResult[BTSTransitionLabel] = {
    return PreResultBTSTransitionLabel
  }

  def preBTSTransitionCondition(o: BTSTransitionCondition): PreResult[BTSTransitionCondition] = {
    o match {
      case o: BTSDispatchCondition =>
        val r: PreResult[BTSTransitionCondition] = preBTSDispatchCondition(o) match {
         case PreResult(continu, MSome(r: BTSTransitionCondition)) => PreResult(continu, MSome[BTSTransitionCondition](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSTransitionCondition")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSTransitionCondition]())
        }
        return r
      case o: BTSExecuteConditionExp =>
        val r: PreResult[BTSTransitionCondition] = preBTSExecuteConditionExp(o) match {
         case PreResult(continu, MSome(r: BTSTransitionCondition)) => PreResult(continu, MSome[BTSTransitionCondition](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSTransitionCondition")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSTransitionCondition]())
        }
        return r
      case o: BTSExecuteConditionTimeout =>
        val r: PreResult[BTSTransitionCondition] = preBTSExecuteConditionTimeout(o) match {
         case PreResult(continu, MSome(r: BTSTransitionCondition)) => PreResult(continu, MSome[BTSTransitionCondition](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSTransitionCondition")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSTransitionCondition]())
        }
        return r
      case o: BTSExecuteConditionOtherwise =>
        val r: PreResult[BTSTransitionCondition] = preBTSExecuteConditionOtherwise(o) match {
         case PreResult(continu, MSome(r: BTSTransitionCondition)) => PreResult(continu, MSome[BTSTransitionCondition](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSTransitionCondition")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSTransitionCondition]())
        }
        return r
      case o: BTSModeCondition =>
        val r: PreResult[BTSTransitionCondition] = preBTSModeCondition(o) match {
         case PreResult(continu, MSome(r: BTSTransitionCondition)) => PreResult(continu, MSome[BTSTransitionCondition](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSTransitionCondition")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSTransitionCondition]())
        }
        return r
      case o: BTSInternalCondition =>
        val r: PreResult[BTSTransitionCondition] = preBTSInternalCondition(o) match {
         case PreResult(continu, MSome(r: BTSTransitionCondition)) => PreResult(continu, MSome[BTSTransitionCondition](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSTransitionCondition")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSTransitionCondition]())
        }
        return r
    }
  }

  def preBTSDispatchCondition(o: BTSDispatchCondition): PreResult[BTSDispatchCondition] = {
    return PreResultBTSDispatchCondition
  }

  def preBTSDispatchConjunction(o: BTSDispatchConjunction): PreResult[BTSDispatchConjunction] = {
    return PreResultBTSDispatchConjunction
  }

  def preBTSDispatchTrigger(o: BTSDispatchTrigger): PreResult[BTSDispatchTrigger] = {
    o match {
      case o: BTSDispatchTriggerStop =>
        val r: PreResult[BTSDispatchTrigger] = preBTSDispatchTriggerStop(o) match {
         case PreResult(continu, MSome(r: BTSDispatchTrigger)) => PreResult(continu, MSome[BTSDispatchTrigger](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSDispatchTrigger")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSDispatchTrigger]())
        }
        return r
      case o: BTSDispatchTriggerPort =>
        val r: PreResult[BTSDispatchTrigger] = preBTSDispatchTriggerPort(o) match {
         case PreResult(continu, MSome(r: BTSDispatchTrigger)) => PreResult(continu, MSome[BTSDispatchTrigger](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSDispatchTrigger")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSDispatchTrigger]())
        }
        return r
      case o: BTSDispatchTriggerTimeout =>
        val r: PreResult[BTSDispatchTrigger] = preBTSDispatchTriggerTimeout(o) match {
         case PreResult(continu, MSome(r: BTSDispatchTrigger)) => PreResult(continu, MSome[BTSDispatchTrigger](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSDispatchTrigger")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSDispatchTrigger]())
        }
        return r
    }
  }

  def preBTSDispatchTriggerStop(o: BTSDispatchTriggerStop): PreResult[BTSDispatchTriggerStop] = {
    return PreResultBTSDispatchTriggerStop
  }

  def preBTSDispatchTriggerPort(o: BTSDispatchTriggerPort): PreResult[BTSDispatchTriggerPort] = {
    return PreResultBTSDispatchTriggerPort
  }

  def preBTSDispatchTriggerTimeout(o: BTSDispatchTriggerTimeout): PreResult[BTSDispatchTriggerTimeout] = {
    return PreResultBTSDispatchTriggerTimeout
  }

  def preBTSExecuteCondition(o: BTSExecuteCondition): PreResult[BTSExecuteCondition] = {
    o match {
      case o: BTSExecuteConditionExp =>
        val r: PreResult[BTSExecuteCondition] = preBTSExecuteConditionExp(o) match {
         case PreResult(continu, MSome(r: BTSExecuteCondition)) => PreResult(continu, MSome[BTSExecuteCondition](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSExecuteCondition")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSExecuteCondition]())
        }
        return r
      case o: BTSExecuteConditionTimeout =>
        val r: PreResult[BTSExecuteCondition] = preBTSExecuteConditionTimeout(o) match {
         case PreResult(continu, MSome(r: BTSExecuteCondition)) => PreResult(continu, MSome[BTSExecuteCondition](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSExecuteCondition")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSExecuteCondition]())
        }
        return r
      case o: BTSExecuteConditionOtherwise =>
        val r: PreResult[BTSExecuteCondition] = preBTSExecuteConditionOtherwise(o) match {
         case PreResult(continu, MSome(r: BTSExecuteCondition)) => PreResult(continu, MSome[BTSExecuteCondition](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSExecuteCondition")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSExecuteCondition]())
        }
        return r
    }
  }

  def preBTSExecuteConditionExp(o: BTSExecuteConditionExp): PreResult[BTSExecuteConditionExp] = {
    return PreResultBTSExecuteConditionExp
  }

  def preBTSExecuteConditionTimeout(o: BTSExecuteConditionTimeout): PreResult[BTSExecuteConditionTimeout] = {
    return PreResultBTSExecuteConditionTimeout
  }

  def preBTSExecuteConditionOtherwise(o: BTSExecuteConditionOtherwise): PreResult[BTSExecuteConditionOtherwise] = {
    return PreResultBTSExecuteConditionOtherwise
  }

  def preBTSModeCondition(o: BTSModeCondition): PreResult[BTSModeCondition] = {
    return PreResultBTSModeCondition
  }

  def preBTSInternalCondition(o: BTSInternalCondition): PreResult[BTSInternalCondition] = {
    return PreResultBTSInternalCondition
  }

  def preBTSAssertion(o: BTSAssertion): PreResult[BTSAssertion] = {
    return PreResultBTSAssertion
  }

  def preBTSBehaviorActions(o: BTSBehaviorActions): PreResult[BTSBehaviorActions] = {
    return PreResultBTSBehaviorActions
  }

  def preBTSAssertedAction(o: BTSAssertedAction): PreResult[BTSAssertedAction] = {
    return PreResultBTSAssertedAction
  }

  def preBTSAction(o: BTSAction): PreResult[BTSAction] = {
    o match {
      case o: BTSSkipAction =>
        val r: PreResult[BTSAction] = preBTSSkipAction(o) match {
         case PreResult(continu, MSome(r: BTSAction)) => PreResult(continu, MSome[BTSAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSAction]())
        }
        return r
      case o: BTSAssignmentAction =>
        val r: PreResult[BTSAction] = preBTSAssignmentAction(o) match {
         case PreResult(continu, MSome(r: BTSAction)) => PreResult(continu, MSome[BTSAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSAction]())
        }
        return r
      case o: BTSSubprogramCallAction =>
        val r: PreResult[BTSAction] = preBTSSubprogramCallAction(o) match {
         case PreResult(continu, MSome(r: BTSAction)) => PreResult(continu, MSome[BTSAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSAction]())
        }
        return r
      case o: BTSPortOutAction =>
        val r: PreResult[BTSAction] = preBTSPortOutAction(o) match {
         case PreResult(continu, MSome(r: BTSAction)) => PreResult(continu, MSome[BTSAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSAction]())
        }
        return r
      case o: BTSPortInAction =>
        val r: PreResult[BTSAction] = preBTSPortInAction(o) match {
         case PreResult(continu, MSome(r: BTSAction)) => PreResult(continu, MSome[BTSAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSAction]())
        }
        return r
      case o: BTSFrozenPortAction =>
        val r: PreResult[BTSAction] = preBTSFrozenPortAction(o) match {
         case PreResult(continu, MSome(r: BTSAction)) => PreResult(continu, MSome[BTSAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSAction]())
        }
        return r
      case o: BTSIfBLESSAction =>
        val r: PreResult[BTSAction] = preBTSIfBLESSAction(o) match {
         case PreResult(continu, MSome(r: BTSAction)) => PreResult(continu, MSome[BTSAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSAction]())
        }
        return r
      case o: BTSIfBAAction =>
        val r: PreResult[BTSAction] = preBTSIfBAAction(o) match {
         case PreResult(continu, MSome(r: BTSAction)) => PreResult(continu, MSome[BTSAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSAction]())
        }
        return r
      case o: BTSExistentialLatticeQuantification =>
        val r: PreResult[BTSAction] = preBTSExistentialLatticeQuantification(o) match {
         case PreResult(continu, MSome(r: BTSAction)) => PreResult(continu, MSome[BTSAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSAction]())
        }
        return r
      case o: BTSUniversalLatticeQuantification =>
        val r: PreResult[BTSAction] = preBTSUniversalLatticeQuantification(o) match {
         case PreResult(continu, MSome(r: BTSAction)) => PreResult(continu, MSome[BTSAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSAction]())
        }
        return r
    }
  }

  def preBTSBasicAction(o: BTSBasicAction): PreResult[BTSBasicAction] = {
    o match {
      case o: BTSSkipAction =>
        val r: PreResult[BTSBasicAction] = preBTSSkipAction(o) match {
         case PreResult(continu, MSome(r: BTSBasicAction)) => PreResult(continu, MSome[BTSBasicAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSBasicAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSBasicAction]())
        }
        return r
      case o: BTSAssignmentAction =>
        val r: PreResult[BTSBasicAction] = preBTSAssignmentAction(o) match {
         case PreResult(continu, MSome(r: BTSBasicAction)) => PreResult(continu, MSome[BTSBasicAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSBasicAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSBasicAction]())
        }
        return r
      case o: BTSSubprogramCallAction =>
        val r: PreResult[BTSBasicAction] = preBTSSubprogramCallAction(o) match {
         case PreResult(continu, MSome(r: BTSBasicAction)) => PreResult(continu, MSome[BTSBasicAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSBasicAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSBasicAction]())
        }
        return r
      case o: BTSPortOutAction =>
        val r: PreResult[BTSBasicAction] = preBTSPortOutAction(o) match {
         case PreResult(continu, MSome(r: BTSBasicAction)) => PreResult(continu, MSome[BTSBasicAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSBasicAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSBasicAction]())
        }
        return r
      case o: BTSPortInAction =>
        val r: PreResult[BTSBasicAction] = preBTSPortInAction(o) match {
         case PreResult(continu, MSome(r: BTSBasicAction)) => PreResult(continu, MSome[BTSBasicAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSBasicAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSBasicAction]())
        }
        return r
      case o: BTSFrozenPortAction =>
        val r: PreResult[BTSBasicAction] = preBTSFrozenPortAction(o) match {
         case PreResult(continu, MSome(r: BTSBasicAction)) => PreResult(continu, MSome[BTSBasicAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSBasicAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSBasicAction]())
        }
        return r
    }
  }

  def preBTSSkipAction(o: BTSSkipAction): PreResult[BTSSkipAction] = {
    return PreResultBTSSkipAction
  }

  def preBTSAssignmentAction(o: BTSAssignmentAction): PreResult[BTSAssignmentAction] = {
    return PreResultBTSAssignmentAction
  }

  def preBTSCommunicationAction(o: BTSCommunicationAction): PreResult[BTSCommunicationAction] = {
    o match {
      case o: BTSSubprogramCallAction =>
        val r: PreResult[BTSCommunicationAction] = preBTSSubprogramCallAction(o) match {
         case PreResult(continu, MSome(r: BTSCommunicationAction)) => PreResult(continu, MSome[BTSCommunicationAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSCommunicationAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSCommunicationAction]())
        }
        return r
      case o: BTSPortOutAction =>
        val r: PreResult[BTSCommunicationAction] = preBTSPortOutAction(o) match {
         case PreResult(continu, MSome(r: BTSCommunicationAction)) => PreResult(continu, MSome[BTSCommunicationAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSCommunicationAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSCommunicationAction]())
        }
        return r
      case o: BTSPortInAction =>
        val r: PreResult[BTSCommunicationAction] = preBTSPortInAction(o) match {
         case PreResult(continu, MSome(r: BTSCommunicationAction)) => PreResult(continu, MSome[BTSCommunicationAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSCommunicationAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSCommunicationAction]())
        }
        return r
      case o: BTSFrozenPortAction =>
        val r: PreResult[BTSCommunicationAction] = preBTSFrozenPortAction(o) match {
         case PreResult(continu, MSome(r: BTSCommunicationAction)) => PreResult(continu, MSome[BTSCommunicationAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSCommunicationAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSCommunicationAction]())
        }
        return r
    }
  }

  def preBTSSubprogramCallAction(o: BTSSubprogramCallAction): PreResult[BTSSubprogramCallAction] = {
    return PreResultBTSSubprogramCallAction
  }

  def preBTSPortOutAction(o: BTSPortOutAction): PreResult[BTSPortOutAction] = {
    return PreResultBTSPortOutAction
  }

  def preBTSPortInAction(o: BTSPortInAction): PreResult[BTSPortInAction] = {
    return PreResultBTSPortInAction
  }

  def preBTSFrozenPortAction(o: BTSFrozenPortAction): PreResult[BTSFrozenPortAction] = {
    return PreResultBTSFrozenPortAction
  }

  def preBTSControlAction(o: BTSControlAction): PreResult[BTSControlAction] = {
    o match {
      case o: BTSIfBLESSAction =>
        val r: PreResult[BTSControlAction] = preBTSIfBLESSAction(o) match {
         case PreResult(continu, MSome(r: BTSControlAction)) => PreResult(continu, MSome[BTSControlAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSControlAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSControlAction]())
        }
        return r
      case o: BTSIfBAAction =>
        val r: PreResult[BTSControlAction] = preBTSIfBAAction(o) match {
         case PreResult(continu, MSome(r: BTSControlAction)) => PreResult(continu, MSome[BTSControlAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSControlAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSControlAction]())
        }
        return r
    }
  }

  def preBTSIfBLESSAction(o: BTSIfBLESSAction): PreResult[BTSIfBLESSAction] = {
    return PreResultBTSIfBLESSAction
  }

  def preBTSGuardedAction(o: BTSGuardedAction): PreResult[BTSGuardedAction] = {
    return PreResultBTSGuardedAction
  }

  def preBTSIfBAAction(o: BTSIfBAAction): PreResult[BTSIfBAAction] = {
    return PreResultBTSIfBAAction
  }

  def preBTSConditionalActions(o: BTSConditionalActions): PreResult[BTSConditionalActions] = {
    return PreResultBTSConditionalActions
  }

  def preBTSQuantificationActions(o: BTSQuantificationActions): PreResult[BTSQuantificationActions] = {
    o match {
      case o: BTSExistentialLatticeQuantification =>
        val r: PreResult[BTSQuantificationActions] = preBTSExistentialLatticeQuantification(o) match {
         case PreResult(continu, MSome(r: BTSQuantificationActions)) => PreResult(continu, MSome[BTSQuantificationActions](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSQuantificationActions")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSQuantificationActions]())
        }
        return r
      case o: BTSUniversalLatticeQuantification =>
        val r: PreResult[BTSQuantificationActions] = preBTSUniversalLatticeQuantification(o) match {
         case PreResult(continu, MSome(r: BTSQuantificationActions)) => PreResult(continu, MSome[BTSQuantificationActions](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSQuantificationActions")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSQuantificationActions]())
        }
        return r
    }
  }

  def preBTSExistentialLatticeQuantification(o: BTSExistentialLatticeQuantification): PreResult[BTSExistentialLatticeQuantification] = {
    return PreResultBTSExistentialLatticeQuantification
  }

  def preBTSUniversalLatticeQuantification(o: BTSUniversalLatticeQuantification): PreResult[BTSUniversalLatticeQuantification] = {
    return PreResultBTSUniversalLatticeQuantification
  }

  def preBTSExp(o: BTSExp): PreResult[BTSExp] = {
    o match {
      case o: BTSUnaryExp =>
        val r: PreResult[BTSExp] = preBTSUnaryExp(o) match {
         case PreResult(continu, MSome(r: BTSExp)) => PreResult(continu, MSome[BTSExp](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSExp")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSExp]())
        }
        return r
      case o: BTSBinaryExp =>
        val r: PreResult[BTSExp] = preBTSBinaryExp(o) match {
         case PreResult(continu, MSome(r: BTSExp)) => PreResult(continu, MSome[BTSExp](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSExp")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSExp]())
        }
        return r
      case o: BTSLiteralExp =>
        val r: PreResult[BTSExp] = preBTSLiteralExp(o) match {
         case PreResult(continu, MSome(r: BTSExp)) => PreResult(continu, MSome[BTSExp](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSExp")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSExp]())
        }
        return r
      case o: BTSNameExp =>
        val r: PreResult[BTSExp] = preBTSNameExp(o) match {
         case PreResult(continu, MSome(r: BTSExp)) => PreResult(continu, MSome[BTSExp](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSExp")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSExp]())
        }
        return r
      case o: BTSIndexingExp =>
        val r: PreResult[BTSExp] = preBTSIndexingExp(o) match {
         case PreResult(continu, MSome(r: BTSExp)) => PreResult(continu, MSome[BTSExp](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSExp")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSExp]())
        }
        return r
      case o: BTSAccessExp =>
        val r: PreResult[BTSExp] = preBTSAccessExp(o) match {
         case PreResult(continu, MSome(r: BTSExp)) => PreResult(continu, MSome[BTSExp](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSExp")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSExp]())
        }
        return r
      case o: BTSFunctionCall =>
        val r: PreResult[BTSExp] = preBTSFunctionCall(o) match {
         case PreResult(continu, MSome(r: BTSExp)) => PreResult(continu, MSome[BTSExp](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSExp")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSExp]())
        }
        return r
    }
  }

  def preBTSUnaryExp(o: BTSUnaryExp): PreResult[BTSUnaryExp] = {
    return PreResultBTSUnaryExp
  }

  def preBTSBinaryExp(o: BTSBinaryExp): PreResult[BTSBinaryExp] = {
    return PreResultBTSBinaryExp
  }

  def preBTSLiteralExp(o: BTSLiteralExp): PreResult[BTSLiteralExp] = {
    return PreResultBTSLiteralExp
  }

  def preBTSNameExp(o: BTSNameExp): PreResult[BTSNameExp] = {
    return PreResultBTSNameExp
  }

  def preBTSIndexingExp(o: BTSIndexingExp): PreResult[BTSIndexingExp] = {
    return PreResultBTSIndexingExp
  }

  def preBTSAccessExp(o: BTSAccessExp): PreResult[BTSAccessExp] = {
    return PreResultBTSAccessExp
  }

  def preBTSFunctionCall(o: BTSFunctionCall): PreResult[BTSFunctionCall] = {
    return PreResultBTSFunctionCall
  }

  def preBTSFormalExpPair(o: BTSFormalExpPair): PreResult[BTSFormalExpPair] = {
    return PreResultBTSFormalExpPair
  }

  def preBTSBehaviorTime(o: BTSBehaviorTime): PreResult[BTSBehaviorTime] = {
    return PreResultBTSBehaviorTime
  }

  def preTODO(o: TODO): PreResult[TODO] = {
    return PreResultTODO
  }

  def preAttr(o: Attr): PreResult[Attr] = {
    return PreResultAttr
  }

  def post_langastTopUnit(o: org.sireum.lang.ast.TopUnit): MOption[org.sireum.lang.ast.TopUnit] = {
    o match {
      case o: org.sireum.lang.ast.TopUnit.Program => return post_langastTopUnitProgram(o)
      case o: org.sireum.lang.ast.TopUnit.SequentUnit => return post_langastTopUnitSequentUnit(o)
      case o: org.sireum.lang.ast.TopUnit.TruthTableUnit => return post_langastTopUnitTruthTableUnit(o)
    }
  }

  def post_langastTopUnitProgram(o: org.sireum.lang.ast.TopUnit.Program): MOption[org.sireum.lang.ast.TopUnit] = {
    return PostResult_langastTopUnitProgram
  }

  def post_langastTopUnitSequentUnit(o: org.sireum.lang.ast.TopUnit.SequentUnit): MOption[org.sireum.lang.ast.TopUnit] = {
    return PostResult_langastTopUnitSequentUnit
  }

  def post_langastTopUnitTruthTableUnit(o: org.sireum.lang.ast.TopUnit.TruthTableUnit): MOption[org.sireum.lang.ast.TopUnit] = {
    return PostResult_langastTopUnitTruthTableUnit
  }

  def post_langastStmt(o: org.sireum.lang.ast.Stmt): MOption[org.sireum.lang.ast.Stmt] = {
    o match {
      case o: org.sireum.lang.ast.Stmt.Import => return post_langastStmtImport(o)
      case o: org.sireum.lang.ast.Stmt.Var => return post_langastStmtVar(o)
      case o: org.sireum.lang.ast.Stmt.VarPattern => return post_langastStmtVarPattern(o)
      case o: org.sireum.lang.ast.Stmt.SpecVar => return post_langastStmtSpecVar(o)
      case o: org.sireum.lang.ast.Stmt.Method => return post_langastStmtMethod(o)
      case o: org.sireum.lang.ast.Stmt.ExtMethod => return post_langastStmtExtMethod(o)
      case o: org.sireum.lang.ast.Stmt.JustMethod => return post_langastStmtJustMethod(o)
      case o: org.sireum.lang.ast.Stmt.SpecMethod => return post_langastStmtSpecMethod(o)
      case o: org.sireum.lang.ast.Stmt.Enum => return post_langastStmtEnum(o)
      case o: org.sireum.lang.ast.Stmt.SubZ => return post_langastStmtSubZ(o)
      case o: org.sireum.lang.ast.Stmt.Object => return post_langastStmtObject(o)
      case o: org.sireum.lang.ast.Stmt.Sig => return post_langastStmtSig(o)
      case o: org.sireum.lang.ast.Stmt.Adt => return post_langastStmtAdt(o)
      case o: org.sireum.lang.ast.Stmt.TypeAlias => return post_langastStmtTypeAlias(o)
      case o: org.sireum.lang.ast.Stmt.Assign => return post_langastStmtAssign(o)
      case o: org.sireum.lang.ast.Stmt.Block => return post_langastStmtBlock(o)
      case o: org.sireum.lang.ast.Stmt.If => return post_langastStmtIf(o)
      case o: org.sireum.lang.ast.Stmt.Match => return post_langastStmtMatch(o)
      case o: org.sireum.lang.ast.Stmt.While => return post_langastStmtWhile(o)
      case o: org.sireum.lang.ast.Stmt.DoWhile => return post_langastStmtDoWhile(o)
      case o: org.sireum.lang.ast.Stmt.For => return post_langastStmtFor(o)
      case o: org.sireum.lang.ast.Stmt.Return => return post_langastStmtReturn(o)
      case o: org.sireum.lang.ast.Stmt.Expr => return post_langastStmtExpr(o)
      case o: org.sireum.lang.ast.Stmt.Fact =>
        val r: MOption[org.sireum.lang.ast.Stmt] = post_langastStmtFact(o) match {
         case MSome(result: org.sireum.lang.ast.Stmt) => MSome[org.sireum.lang.ast.Stmt](result)
         case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.Stmt")
         case _ => MNone[org.sireum.lang.ast.Stmt]()
        }
        return r
      case o: org.sireum.lang.ast.Stmt.Inv =>
        val r: MOption[org.sireum.lang.ast.Stmt] = post_langastStmtInv(o) match {
         case MSome(result: org.sireum.lang.ast.Stmt) => MSome[org.sireum.lang.ast.Stmt](result)
         case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.Stmt")
         case _ => MNone[org.sireum.lang.ast.Stmt]()
        }
        return r
      case o: org.sireum.lang.ast.Stmt.Theorem =>
        val r: MOption[org.sireum.lang.ast.Stmt] = post_langastStmtTheorem(o) match {
         case MSome(result: org.sireum.lang.ast.Stmt) => MSome[org.sireum.lang.ast.Stmt](result)
         case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.Stmt")
         case _ => MNone[org.sireum.lang.ast.Stmt]()
        }
        return r
      case o: org.sireum.lang.ast.Stmt.DataRefinement =>
        val r: MOption[org.sireum.lang.ast.Stmt] = post_langastStmtDataRefinement(o) match {
         case MSome(result: org.sireum.lang.ast.Stmt) => MSome[org.sireum.lang.ast.Stmt](result)
         case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.Stmt")
         case _ => MNone[org.sireum.lang.ast.Stmt]()
        }
        return r
      case o: org.sireum.lang.ast.Stmt.SpecLabel =>
        val r: MOption[org.sireum.lang.ast.Stmt] = post_langastStmtSpecLabel(o) match {
         case MSome(result: org.sireum.lang.ast.Stmt) => MSome[org.sireum.lang.ast.Stmt](result)
         case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.Stmt")
         case _ => MNone[org.sireum.lang.ast.Stmt]()
        }
        return r
      case o: org.sireum.lang.ast.Stmt.SpecBlock =>
        val r: MOption[org.sireum.lang.ast.Stmt] = post_langastStmtSpecBlock(o) match {
         case MSome(result: org.sireum.lang.ast.Stmt) => MSome[org.sireum.lang.ast.Stmt](result)
         case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.Stmt")
         case _ => MNone[org.sireum.lang.ast.Stmt]()
        }
        return r
      case o: org.sireum.lang.ast.Stmt.DeduceSequent =>
        val r: MOption[org.sireum.lang.ast.Stmt] = post_langastStmtDeduceSequent(o) match {
         case MSome(result: org.sireum.lang.ast.Stmt) => MSome[org.sireum.lang.ast.Stmt](result)
         case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.Stmt")
         case _ => MNone[org.sireum.lang.ast.Stmt]()
        }
        return r
      case o: org.sireum.lang.ast.Stmt.DeduceSteps =>
        val r: MOption[org.sireum.lang.ast.Stmt] = post_langastStmtDeduceSteps(o) match {
         case MSome(result: org.sireum.lang.ast.Stmt) => MSome[org.sireum.lang.ast.Stmt](result)
         case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.Stmt")
         case _ => MNone[org.sireum.lang.ast.Stmt]()
        }
        return r
      case o: org.sireum.lang.ast.Stmt.Havoc =>
        val r: MOption[org.sireum.lang.ast.Stmt] = post_langastStmtHavoc(o) match {
         case MSome(result: org.sireum.lang.ast.Stmt) => MSome[org.sireum.lang.ast.Stmt](result)
         case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.Stmt")
         case _ => MNone[org.sireum.lang.ast.Stmt]()
        }
        return r
    }
  }

  def post_langastHasModifies(o: org.sireum.lang.ast.HasModifies): MOption[org.sireum.lang.ast.HasModifies] = {
    o match {
      case o: org.sireum.lang.ast.LoopContract =>
        val r: MOption[org.sireum.lang.ast.HasModifies] = post_langastLoopContract(o) match {
         case MSome(result: org.sireum.lang.ast.HasModifies) => MSome[org.sireum.lang.ast.HasModifies](result)
         case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.HasModifies")
         case _ => MNone[org.sireum.lang.ast.HasModifies]()
        }
        return r
      case o: org.sireum.lang.ast.MethodContract.Simple =>
        val r: MOption[org.sireum.lang.ast.HasModifies] = post_langastMethodContractSimple(o) match {
         case MSome(result: org.sireum.lang.ast.HasModifies) => MSome[org.sireum.lang.ast.HasModifies](result)
         case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.HasModifies")
         case _ => MNone[org.sireum.lang.ast.HasModifies]()
        }
        return r
      case o: org.sireum.lang.ast.MethodContract.Cases =>
        val r: MOption[org.sireum.lang.ast.HasModifies] = post_langastMethodContractCases(o) match {
         case MSome(result: org.sireum.lang.ast.HasModifies) => MSome[org.sireum.lang.ast.HasModifies](result)
         case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.HasModifies")
         case _ => MNone[org.sireum.lang.ast.HasModifies]()
        }
        return r
    }
  }

  def post_langastLoopContract(o: org.sireum.lang.ast.LoopContract): MOption[org.sireum.lang.ast.LoopContract] = {
    return PostResult_langastLoopContract
  }

  def post_langastStmtImport(o: org.sireum.lang.ast.Stmt.Import): MOption[org.sireum.lang.ast.Stmt] = {
    return PostResult_langastStmtImport
  }

  def post_langastStmtImportImporter(o: org.sireum.lang.ast.Stmt.Import.Importer): MOption[org.sireum.lang.ast.Stmt.Import.Importer] = {
    return PostResult_langastStmtImportImporter
  }

  def post_langastStmtImportSelector(o: org.sireum.lang.ast.Stmt.Import.Selector): MOption[org.sireum.lang.ast.Stmt.Import.Selector] = {
    o match {
      case o: org.sireum.lang.ast.Stmt.Import.MultiSelector => return post_langastStmtImportMultiSelector(o)
      case o: org.sireum.lang.ast.Stmt.Import.WildcardSelector => return post_langastStmtImportWildcardSelector(o)
    }
  }

  def post_langastStmtImportMultiSelector(o: org.sireum.lang.ast.Stmt.Import.MultiSelector): MOption[org.sireum.lang.ast.Stmt.Import.Selector] = {
    return PostResult_langastStmtImportMultiSelector
  }

  def post_langastStmtImportWildcardSelector(o: org.sireum.lang.ast.Stmt.Import.WildcardSelector): MOption[org.sireum.lang.ast.Stmt.Import.Selector] = {
    return PostResult_langastStmtImportWildcardSelector
  }

  def post_langastStmtImportNamedSelector(o: org.sireum.lang.ast.Stmt.Import.NamedSelector): MOption[org.sireum.lang.ast.Stmt.Import.NamedSelector] = {
    return PostResult_langastStmtImportNamedSelector
  }

  def post_langastStmtVar(o: org.sireum.lang.ast.Stmt.Var): MOption[org.sireum.lang.ast.Stmt] = {
    return PostResult_langastStmtVar
  }

  def post_langastStmtVarPattern(o: org.sireum.lang.ast.Stmt.VarPattern): MOption[org.sireum.lang.ast.Stmt] = {
    return PostResult_langastStmtVarPattern
  }

  def post_langastStmtSpecVar(o: org.sireum.lang.ast.Stmt.SpecVar): MOption[org.sireum.lang.ast.Stmt] = {
    return PostResult_langastStmtSpecVar
  }

  def post_langastStmtMethod(o: org.sireum.lang.ast.Stmt.Method): MOption[org.sireum.lang.ast.Stmt] = {
    return PostResult_langastStmtMethod
  }

  def post_langastStmtExtMethod(o: org.sireum.lang.ast.Stmt.ExtMethod): MOption[org.sireum.lang.ast.Stmt] = {
    return PostResult_langastStmtExtMethod
  }

  def post_langastStmtJustMethod(o: org.sireum.lang.ast.Stmt.JustMethod): MOption[org.sireum.lang.ast.Stmt] = {
    return PostResult_langastStmtJustMethod
  }

  def post_langastStmtSpecMethod(o: org.sireum.lang.ast.Stmt.SpecMethod): MOption[org.sireum.lang.ast.Stmt] = {
    return PostResult_langastStmtSpecMethod
  }

  def post_langastStmtEnum(o: org.sireum.lang.ast.Stmt.Enum): MOption[org.sireum.lang.ast.Stmt] = {
    return PostResult_langastStmtEnum
  }

  def post_langastStmtSubZ(o: org.sireum.lang.ast.Stmt.SubZ): MOption[org.sireum.lang.ast.Stmt] = {
    return PostResult_langastStmtSubZ
  }

  def post_langastStmtObject(o: org.sireum.lang.ast.Stmt.Object): MOption[org.sireum.lang.ast.Stmt] = {
    return PostResult_langastStmtObject
  }

  def post_langastStmtSig(o: org.sireum.lang.ast.Stmt.Sig): MOption[org.sireum.lang.ast.Stmt] = {
    return PostResult_langastStmtSig
  }

  def post_langastStmtAdt(o: org.sireum.lang.ast.Stmt.Adt): MOption[org.sireum.lang.ast.Stmt] = {
    return PostResult_langastStmtAdt
  }

  def post_langastStmtTypeAlias(o: org.sireum.lang.ast.Stmt.TypeAlias): MOption[org.sireum.lang.ast.Stmt] = {
    return PostResult_langastStmtTypeAlias
  }

  def post_langastStmtAssign(o: org.sireum.lang.ast.Stmt.Assign): MOption[org.sireum.lang.ast.Stmt] = {
    return PostResult_langastStmtAssign
  }

  def post_langastStmtBlock(o: org.sireum.lang.ast.Stmt.Block): MOption[org.sireum.lang.ast.Stmt] = {
    return PostResult_langastStmtBlock
  }

  def post_langastStmtIf(o: org.sireum.lang.ast.Stmt.If): MOption[org.sireum.lang.ast.Stmt] = {
    return PostResult_langastStmtIf
  }

  def post_langastStmtMatch(o: org.sireum.lang.ast.Stmt.Match): MOption[org.sireum.lang.ast.Stmt] = {
    return PostResult_langastStmtMatch
  }

  def post_langastStmtWhile(o: org.sireum.lang.ast.Stmt.While): MOption[org.sireum.lang.ast.Stmt] = {
    return PostResult_langastStmtWhile
  }

  def post_langastStmtDoWhile(o: org.sireum.lang.ast.Stmt.DoWhile): MOption[org.sireum.lang.ast.Stmt] = {
    return PostResult_langastStmtDoWhile
  }

  def post_langastStmtFor(o: org.sireum.lang.ast.Stmt.For): MOption[org.sireum.lang.ast.Stmt] = {
    return PostResult_langastStmtFor
  }

  def post_langastStmtReturn(o: org.sireum.lang.ast.Stmt.Return): MOption[org.sireum.lang.ast.Stmt] = {
    return PostResult_langastStmtReturn
  }

  def post_langastStmtExpr(o: org.sireum.lang.ast.Stmt.Expr): MOption[org.sireum.lang.ast.Stmt] = {
    return PostResult_langastStmtExpr
  }

  def post_langastStmtSpec(o: org.sireum.lang.ast.Stmt.Spec): MOption[org.sireum.lang.ast.Stmt.Spec] = {
    o match {
      case o: org.sireum.lang.ast.Stmt.Fact => return post_langastStmtFact(o)
      case o: org.sireum.lang.ast.Stmt.Inv => return post_langastStmtInv(o)
      case o: org.sireum.lang.ast.Stmt.Theorem => return post_langastStmtTheorem(o)
      case o: org.sireum.lang.ast.Stmt.DataRefinement => return post_langastStmtDataRefinement(o)
      case o: org.sireum.lang.ast.Stmt.SpecLabel => return post_langastStmtSpecLabel(o)
      case o: org.sireum.lang.ast.Stmt.SpecBlock => return post_langastStmtSpecBlock(o)
      case o: org.sireum.lang.ast.Stmt.DeduceSequent => return post_langastStmtDeduceSequent(o)
      case o: org.sireum.lang.ast.Stmt.DeduceSteps => return post_langastStmtDeduceSteps(o)
      case o: org.sireum.lang.ast.Stmt.Havoc => return post_langastStmtHavoc(o)
    }
  }

  def post_langastStmtFact(o: org.sireum.lang.ast.Stmt.Fact): MOption[org.sireum.lang.ast.Stmt.Spec] = {
    return PostResult_langastStmtFact
  }

  def post_langastStmtInv(o: org.sireum.lang.ast.Stmt.Inv): MOption[org.sireum.lang.ast.Stmt.Spec] = {
    return PostResult_langastStmtInv
  }

  def post_langastStmtTheorem(o: org.sireum.lang.ast.Stmt.Theorem): MOption[org.sireum.lang.ast.Stmt.Spec] = {
    return PostResult_langastStmtTheorem
  }

  def post_langastStmtDataRefinement(o: org.sireum.lang.ast.Stmt.DataRefinement): MOption[org.sireum.lang.ast.Stmt.Spec] = {
    return PostResult_langastStmtDataRefinement
  }

  def post_langastStmtSpecLabel(o: org.sireum.lang.ast.Stmt.SpecLabel): MOption[org.sireum.lang.ast.Stmt.Spec] = {
    return PostResult_langastStmtSpecLabel
  }

  def post_langastStmtSpecBlock(o: org.sireum.lang.ast.Stmt.SpecBlock): MOption[org.sireum.lang.ast.Stmt.Spec] = {
    return PostResult_langastStmtSpecBlock
  }

  def post_langastStmtDeduceSequent(o: org.sireum.lang.ast.Stmt.DeduceSequent): MOption[org.sireum.lang.ast.Stmt.Spec] = {
    return PostResult_langastStmtDeduceSequent
  }

  def post_langastStmtDeduceSteps(o: org.sireum.lang.ast.Stmt.DeduceSteps): MOption[org.sireum.lang.ast.Stmt.Spec] = {
    return PostResult_langastStmtDeduceSteps
  }

  def post_langastStmtHavoc(o: org.sireum.lang.ast.Stmt.Havoc): MOption[org.sireum.lang.ast.Stmt.Spec] = {
    return PostResult_langastStmtHavoc
  }

  def post_langastMethodContract(o: org.sireum.lang.ast.MethodContract): MOption[org.sireum.lang.ast.MethodContract] = {
    o match {
      case o: org.sireum.lang.ast.MethodContract.Simple => return post_langastMethodContractSimple(o)
      case o: org.sireum.lang.ast.MethodContract.Cases => return post_langastMethodContractCases(o)
    }
  }

  def post_langastMethodContractAccesses(o: org.sireum.lang.ast.MethodContract.Accesses): MOption[org.sireum.lang.ast.MethodContract.Accesses] = {
    return PostResult_langastMethodContractAccesses
  }

  def post_langastMethodContractClaims(o: org.sireum.lang.ast.MethodContract.Claims): MOption[org.sireum.lang.ast.MethodContract.Claims] = {
    return PostResult_langastMethodContractClaims
  }

  def post_langastMethodContractSimple(o: org.sireum.lang.ast.MethodContract.Simple): MOption[org.sireum.lang.ast.MethodContract] = {
    return PostResult_langastMethodContractSimple
  }

  def post_langastMethodContractCases(o: org.sireum.lang.ast.MethodContract.Cases): MOption[org.sireum.lang.ast.MethodContract] = {
    return PostResult_langastMethodContractCases
  }

  def post_langastMethodContractCase(o: org.sireum.lang.ast.MethodContract.Case): MOption[org.sireum.lang.ast.MethodContract.Case] = {
    return PostResult_langastMethodContractCase
  }

  def post_langastSequent(o: org.sireum.lang.ast.Sequent): MOption[org.sireum.lang.ast.Sequent] = {
    return PostResult_langastSequent
  }

  def post_langastProofAst(o: org.sireum.lang.ast.ProofAst): MOption[org.sireum.lang.ast.ProofAst] = {
    return PostResult_langastProofAst
  }

  def post_langastProofAstStep(o: org.sireum.lang.ast.ProofAst.Step): MOption[org.sireum.lang.ast.ProofAst.Step] = {
    o match {
      case o: org.sireum.lang.ast.ProofAst.Step.Regular => return post_langastProofAstStepRegular(o)
      case o: org.sireum.lang.ast.ProofAst.Step.Assume => return post_langastProofAstStepAssume(o)
      case o: org.sireum.lang.ast.ProofAst.Step.Assert => return post_langastProofAstStepAssert(o)
      case o: org.sireum.lang.ast.ProofAst.Step.SubProof => return post_langastProofAstStepSubProof(o)
      case o: org.sireum.lang.ast.ProofAst.Step.Let => return post_langastProofAstStepLet(o)
      case o: org.sireum.lang.ast.ProofAst.Step.StructInduction => return post_langastProofAstStepStructInduction(o)
    }
  }

  def post_langastProofAstStepId(o: org.sireum.lang.ast.ProofAst.StepId): MOption[org.sireum.lang.ast.ProofAst.StepId] = {
    o match {
      case o: org.sireum.lang.ast.ProofAst.StepId.Num => return post_langastProofAstStepIdNum(o)
      case o: org.sireum.lang.ast.ProofAst.StepId.Str => return post_langastProofAstStepIdStr(o)
    }
  }

  def post_langastProofAstStepIdNum(o: org.sireum.lang.ast.ProofAst.StepId.Num): MOption[org.sireum.lang.ast.ProofAst.StepId] = {
    return PostResult_langastProofAstStepIdNum
  }

  def post_langastProofAstStepIdStr(o: org.sireum.lang.ast.ProofAst.StepId.Str): MOption[org.sireum.lang.ast.ProofAst.StepId] = {
    return PostResult_langastProofAstStepIdStr
  }

  def post_langastProofAstStepRegular(o: org.sireum.lang.ast.ProofAst.Step.Regular): MOption[org.sireum.lang.ast.ProofAst.Step] = {
    return PostResult_langastProofAstStepRegular
  }

  def post_langastProofAstStepAssume(o: org.sireum.lang.ast.ProofAst.Step.Assume): MOption[org.sireum.lang.ast.ProofAst.Step] = {
    return PostResult_langastProofAstStepAssume
  }

  def post_langastProofAstStepAssert(o: org.sireum.lang.ast.ProofAst.Step.Assert): MOption[org.sireum.lang.ast.ProofAst.Step] = {
    return PostResult_langastProofAstStepAssert
  }

  def post_langastProofAstStepSubProof(o: org.sireum.lang.ast.ProofAst.Step.SubProof): MOption[org.sireum.lang.ast.ProofAst.Step] = {
    return PostResult_langastProofAstStepSubProof
  }

  def post_langastProofAstStepLet(o: org.sireum.lang.ast.ProofAst.Step.Let): MOption[org.sireum.lang.ast.ProofAst.Step] = {
    return PostResult_langastProofAstStepLet
  }

  def post_langastProofAstStepLetParam(o: org.sireum.lang.ast.ProofAst.Step.Let.Param): MOption[org.sireum.lang.ast.ProofAst.Step.Let.Param] = {
    return PostResult_langastProofAstStepLetParam
  }

  def post_langastProofAstStepStructInduction(o: org.sireum.lang.ast.ProofAst.Step.StructInduction): MOption[org.sireum.lang.ast.ProofAst.Step] = {
    return PostResult_langastProofAstStepStructInduction
  }

  def post_langastProofAstStepStructInductionMatchCase(o: org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase): MOption[org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase] = {
    return PostResult_langastProofAstStepStructInductionMatchCase
  }

  def post_langastProofAstStepStructInductionMatchDefault(o: org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault): MOption[org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault] = {
    return PostResult_langastProofAstStepStructInductionMatchDefault
  }

  def post_langastProofAstStepJustification(o: org.sireum.lang.ast.ProofAst.Step.Justification): MOption[org.sireum.lang.ast.ProofAst.Step.Justification] = {
    o match {
      case o: org.sireum.lang.ast.ProofAst.Step.Justification.Apply => return post_langastProofAstStepJustificationApply(o)
      case o: org.sireum.lang.ast.ProofAst.Step.Justification.Incept =>
        val r: MOption[org.sireum.lang.ast.ProofAst.Step.Justification] = post_langastProofAstStepJustificationIncept(o) match {
         case MSome(result: org.sireum.lang.ast.ProofAst.Step.Justification) => MSome[org.sireum.lang.ast.ProofAst.Step.Justification](result)
         case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.ProofAst.Step.Justification")
         case _ => MNone[org.sireum.lang.ast.ProofAst.Step.Justification]()
        }
        return r
      case o: org.sireum.lang.ast.ProofAst.Step.Justification.InceptNamed =>
        val r: MOption[org.sireum.lang.ast.ProofAst.Step.Justification] = post_langastProofAstStepJustificationInceptNamed(o) match {
         case MSome(result: org.sireum.lang.ast.ProofAst.Step.Justification) => MSome[org.sireum.lang.ast.ProofAst.Step.Justification](result)
         case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.ProofAst.Step.Justification")
         case _ => MNone[org.sireum.lang.ast.ProofAst.Step.Justification]()
        }
        return r
      case o: org.sireum.lang.ast.ProofAst.Step.Justification.InceptEta =>
        val r: MOption[org.sireum.lang.ast.ProofAst.Step.Justification] = post_langastProofAstStepJustificationInceptEta(o) match {
         case MSome(result: org.sireum.lang.ast.ProofAst.Step.Justification) => MSome[org.sireum.lang.ast.ProofAst.Step.Justification](result)
         case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.ProofAst.Step.Justification")
         case _ => MNone[org.sireum.lang.ast.ProofAst.Step.Justification]()
        }
        return r
    }
  }

  def post_langastProofAstStepInception(o: org.sireum.lang.ast.ProofAst.Step.Inception): MOption[org.sireum.lang.ast.ProofAst.Step.Inception] = {
    o match {
      case o: org.sireum.lang.ast.ProofAst.Step.Justification.Incept => return post_langastProofAstStepJustificationIncept(o)
      case o: org.sireum.lang.ast.ProofAst.Step.Justification.InceptNamed => return post_langastProofAstStepJustificationInceptNamed(o)
      case o: org.sireum.lang.ast.ProofAst.Step.Justification.InceptEta => return post_langastProofAstStepJustificationInceptEta(o)
    }
  }

  def post_langastProofAstStepJustificationApply(o: org.sireum.lang.ast.ProofAst.Step.Justification.Apply): MOption[org.sireum.lang.ast.ProofAst.Step.Justification] = {
    return PostResult_langastProofAstStepJustificationApply
  }

  def post_langastProofAstStepJustificationIncept(o: org.sireum.lang.ast.ProofAst.Step.Justification.Incept): MOption[org.sireum.lang.ast.ProofAst.Step.Inception] = {
    return PostResult_langastProofAstStepJustificationIncept
  }

  def post_langastProofAstStepJustificationInceptNamed(o: org.sireum.lang.ast.ProofAst.Step.Justification.InceptNamed): MOption[org.sireum.lang.ast.ProofAst.Step.Inception] = {
    return PostResult_langastProofAstStepJustificationInceptNamed
  }

  def post_langastProofAstStepJustificationInceptEta(o: org.sireum.lang.ast.ProofAst.Step.Justification.InceptEta): MOption[org.sireum.lang.ast.ProofAst.Step.Inception] = {
    return PostResult_langastProofAstStepJustificationInceptEta
  }

  def post_langastAssignExp(o: org.sireum.lang.ast.AssignExp): MOption[org.sireum.lang.ast.AssignExp] = {
    o match {
      case o: org.sireum.lang.ast.Stmt.Block =>
        val r: MOption[org.sireum.lang.ast.AssignExp] = post_langastStmtBlock(o) match {
         case MSome(result: org.sireum.lang.ast.AssignExp) => MSome[org.sireum.lang.ast.AssignExp](result)
         case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.AssignExp")
         case _ => MNone[org.sireum.lang.ast.AssignExp]()
        }
        return r
      case o: org.sireum.lang.ast.Stmt.If =>
        val r: MOption[org.sireum.lang.ast.AssignExp] = post_langastStmtIf(o) match {
         case MSome(result: org.sireum.lang.ast.AssignExp) => MSome[org.sireum.lang.ast.AssignExp](result)
         case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.AssignExp")
         case _ => MNone[org.sireum.lang.ast.AssignExp]()
        }
        return r
      case o: org.sireum.lang.ast.Stmt.Match =>
        val r: MOption[org.sireum.lang.ast.AssignExp] = post_langastStmtMatch(o) match {
         case MSome(result: org.sireum.lang.ast.AssignExp) => MSome[org.sireum.lang.ast.AssignExp](result)
         case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.AssignExp")
         case _ => MNone[org.sireum.lang.ast.AssignExp]()
        }
        return r
      case o: org.sireum.lang.ast.Stmt.Return =>
        val r: MOption[org.sireum.lang.ast.AssignExp] = post_langastStmtReturn(o) match {
         case MSome(result: org.sireum.lang.ast.AssignExp) => MSome[org.sireum.lang.ast.AssignExp](result)
         case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.AssignExp")
         case _ => MNone[org.sireum.lang.ast.AssignExp]()
        }
        return r
      case o: org.sireum.lang.ast.Stmt.Expr =>
        val r: MOption[org.sireum.lang.ast.AssignExp] = post_langastStmtExpr(o) match {
         case MSome(result: org.sireum.lang.ast.AssignExp) => MSome[org.sireum.lang.ast.AssignExp](result)
         case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.AssignExp")
         case _ => MNone[org.sireum.lang.ast.AssignExp]()
        }
        return r
    }
  }

  def post_langastCase(o: org.sireum.lang.ast.Case): MOption[org.sireum.lang.ast.Case] = {
    return PostResult_langastCase
  }

  def post_langastEnumGenRange(o: org.sireum.lang.ast.EnumGen.Range): MOption[org.sireum.lang.ast.EnumGen.Range] = {
    o match {
      case o: org.sireum.lang.ast.EnumGen.Range.Expr => return post_langastEnumGenRangeExpr(o)
      case o: org.sireum.lang.ast.EnumGen.Range.Step => return post_langastEnumGenRangeStep(o)
    }
  }

  def post_langastEnumGenRangeExpr(o: org.sireum.lang.ast.EnumGen.Range.Expr): MOption[org.sireum.lang.ast.EnumGen.Range] = {
    return PostResult_langastEnumGenRangeExpr
  }

  def post_langastEnumGenRangeStep(o: org.sireum.lang.ast.EnumGen.Range.Step): MOption[org.sireum.lang.ast.EnumGen.Range] = {
    return PostResult_langastEnumGenRangeStep
  }

  def post_langastEnumGenFor(o: org.sireum.lang.ast.EnumGen.For): MOption[org.sireum.lang.ast.EnumGen.For] = {
    return PostResult_langastEnumGenFor
  }

  def post_langastType(o: org.sireum.lang.ast.Type): MOption[org.sireum.lang.ast.Type] = {
    o match {
      case o: org.sireum.lang.ast.Type.Named => return post_langastTypeNamed(o)
      case o: org.sireum.lang.ast.Type.Fun => return post_langastTypeFun(o)
      case o: org.sireum.lang.ast.Type.Tuple => return post_langastTypeTuple(o)
    }
  }

  def post_langastTypeNamed(o: org.sireum.lang.ast.Type.Named): MOption[org.sireum.lang.ast.Type] = {
    return PostResult_langastTypeNamed
  }

  def post_langastTypeFun(o: org.sireum.lang.ast.Type.Fun): MOption[org.sireum.lang.ast.Type] = {
    return PostResult_langastTypeFun
  }

  def post_langastTypeTuple(o: org.sireum.lang.ast.Type.Tuple): MOption[org.sireum.lang.ast.Type] = {
    return PostResult_langastTypeTuple
  }

  def post_langastPattern(o: org.sireum.lang.ast.Pattern): MOption[org.sireum.lang.ast.Pattern] = {
    o match {
      case o: org.sireum.lang.ast.Pattern.Literal => return post_langastPatternLiteral(o)
      case o: org.sireum.lang.ast.Pattern.LitInterpolate => return post_langastPatternLitInterpolate(o)
      case o: org.sireum.lang.ast.Pattern.Ref => return post_langastPatternRef(o)
      case o: org.sireum.lang.ast.Pattern.VarBinding => return post_langastPatternVarBinding(o)
      case o: org.sireum.lang.ast.Pattern.Wildcard => return post_langastPatternWildcard(o)
      case o: org.sireum.lang.ast.Pattern.SeqWildcard => return post_langastPatternSeqWildcard(o)
      case o: org.sireum.lang.ast.Pattern.Structure => return post_langastPatternStructure(o)
    }
  }

  def post_langastPatternLiteral(o: org.sireum.lang.ast.Pattern.Literal): MOption[org.sireum.lang.ast.Pattern] = {
    return PostResult_langastPatternLiteral
  }

  def post_langastPatternLitInterpolate(o: org.sireum.lang.ast.Pattern.LitInterpolate): MOption[org.sireum.lang.ast.Pattern] = {
    return PostResult_langastPatternLitInterpolate
  }

  def post_langastPatternRef(o: org.sireum.lang.ast.Pattern.Ref): MOption[org.sireum.lang.ast.Pattern] = {
    return PostResult_langastPatternRef
  }

  def post_langastPatternVarBinding(o: org.sireum.lang.ast.Pattern.VarBinding): MOption[org.sireum.lang.ast.Pattern] = {
    return PostResult_langastPatternVarBinding
  }

  def post_langastPatternWildcard(o: org.sireum.lang.ast.Pattern.Wildcard): MOption[org.sireum.lang.ast.Pattern] = {
    return PostResult_langastPatternWildcard
  }

  def post_langastPatternSeqWildcard(o: org.sireum.lang.ast.Pattern.SeqWildcard): MOption[org.sireum.lang.ast.Pattern] = {
    return PostResult_langastPatternSeqWildcard
  }

  def post_langastPatternStructure(o: org.sireum.lang.ast.Pattern.Structure): MOption[org.sireum.lang.ast.Pattern] = {
    return PostResult_langastPatternStructure
  }

  def post_langastExp(o: org.sireum.lang.ast.Exp): MOption[org.sireum.lang.ast.Exp] = {
    o match {
      case o: org.sireum.lang.ast.Exp.LitB => return post_langastExpLitB(o)
      case o: org.sireum.lang.ast.Exp.LitC => return post_langastExpLitC(o)
      case o: org.sireum.lang.ast.Exp.LitZ => return post_langastExpLitZ(o)
      case o: org.sireum.lang.ast.Exp.LitF32 => return post_langastExpLitF32(o)
      case o: org.sireum.lang.ast.Exp.LitF64 => return post_langastExpLitF64(o)
      case o: org.sireum.lang.ast.Exp.LitR => return post_langastExpLitR(o)
      case o: org.sireum.lang.ast.Exp.LitString => return post_langastExpLitString(o)
      case o: org.sireum.lang.ast.Exp.LitStepId => return post_langastExpLitStepId(o)
      case o: org.sireum.lang.ast.Exp.StringInterpolate => return post_langastExpStringInterpolate(o)
      case o: org.sireum.lang.ast.Exp.This => return post_langastExpThis(o)
      case o: org.sireum.lang.ast.Exp.Super => return post_langastExpSuper(o)
      case o: org.sireum.lang.ast.Exp.Unary => return post_langastExpUnary(o)
      case o: org.sireum.lang.ast.Exp.Binary => return post_langastExpBinary(o)
      case o: org.sireum.lang.ast.Exp.Ident => return post_langastExpIdent(o)
      case o: org.sireum.lang.ast.Exp.Eta => return post_langastExpEta(o)
      case o: org.sireum.lang.ast.Exp.Tuple => return post_langastExpTuple(o)
      case o: org.sireum.lang.ast.Exp.Select => return post_langastExpSelect(o)
      case o: org.sireum.lang.ast.Exp.Invoke => return post_langastExpInvoke(o)
      case o: org.sireum.lang.ast.Exp.InvokeNamed => return post_langastExpInvokeNamed(o)
      case o: org.sireum.lang.ast.Exp.If => return post_langastExpIf(o)
      case o: org.sireum.lang.ast.Exp.Fun => return post_langastExpFun(o)
      case o: org.sireum.lang.ast.Exp.ForYield => return post_langastExpForYield(o)
      case o: org.sireum.lang.ast.Exp.QuantType =>
        val r: MOption[org.sireum.lang.ast.Exp] = post_langastExpQuantType(o) match {
         case MSome(result: org.sireum.lang.ast.Exp) => MSome[org.sireum.lang.ast.Exp](result)
         case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.Exp")
         case _ => MNone[org.sireum.lang.ast.Exp]()
        }
        return r
      case o: org.sireum.lang.ast.Exp.QuantRange =>
        val r: MOption[org.sireum.lang.ast.Exp] = post_langastExpQuantRange(o) match {
         case MSome(result: org.sireum.lang.ast.Exp) => MSome[org.sireum.lang.ast.Exp](result)
         case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.Exp")
         case _ => MNone[org.sireum.lang.ast.Exp]()
        }
        return r
      case o: org.sireum.lang.ast.Exp.QuantEach =>
        val r: MOption[org.sireum.lang.ast.Exp] = post_langastExpQuantEach(o) match {
         case MSome(result: org.sireum.lang.ast.Exp) => MSome[org.sireum.lang.ast.Exp](result)
         case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.Exp")
         case _ => MNone[org.sireum.lang.ast.Exp]()
        }
        return r
      case o: org.sireum.lang.ast.Exp.Input => return post_langastExpInput(o)
      case o: org.sireum.lang.ast.Exp.OldVal => return post_langastExpOldVal(o)
      case o: org.sireum.lang.ast.Exp.LoopIndex => return post_langastExpLoopIndex(o)
      case o: org.sireum.lang.ast.Exp.StateSeq => return post_langastExpStateSeq(o)
      case o: org.sireum.lang.ast.Exp.Result => return post_langastExpResult(o)
    }
  }

  def post_langastLit(o: org.sireum.lang.ast.Lit): MOption[org.sireum.lang.ast.Lit] = {
    o match {
      case o: org.sireum.lang.ast.Exp.LitB =>
        val r: MOption[org.sireum.lang.ast.Lit] = post_langastExpLitB(o) match {
         case MSome(result: org.sireum.lang.ast.Lit) => MSome[org.sireum.lang.ast.Lit](result)
         case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.Lit")
         case _ => MNone[org.sireum.lang.ast.Lit]()
        }
        return r
      case o: org.sireum.lang.ast.Exp.LitC =>
        val r: MOption[org.sireum.lang.ast.Lit] = post_langastExpLitC(o) match {
         case MSome(result: org.sireum.lang.ast.Lit) => MSome[org.sireum.lang.ast.Lit](result)
         case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.Lit")
         case _ => MNone[org.sireum.lang.ast.Lit]()
        }
        return r
      case o: org.sireum.lang.ast.Exp.LitZ =>
        val r: MOption[org.sireum.lang.ast.Lit] = post_langastExpLitZ(o) match {
         case MSome(result: org.sireum.lang.ast.Lit) => MSome[org.sireum.lang.ast.Lit](result)
         case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.Lit")
         case _ => MNone[org.sireum.lang.ast.Lit]()
        }
        return r
      case o: org.sireum.lang.ast.Exp.LitF32 =>
        val r: MOption[org.sireum.lang.ast.Lit] = post_langastExpLitF32(o) match {
         case MSome(result: org.sireum.lang.ast.Lit) => MSome[org.sireum.lang.ast.Lit](result)
         case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.Lit")
         case _ => MNone[org.sireum.lang.ast.Lit]()
        }
        return r
      case o: org.sireum.lang.ast.Exp.LitF64 =>
        val r: MOption[org.sireum.lang.ast.Lit] = post_langastExpLitF64(o) match {
         case MSome(result: org.sireum.lang.ast.Lit) => MSome[org.sireum.lang.ast.Lit](result)
         case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.Lit")
         case _ => MNone[org.sireum.lang.ast.Lit]()
        }
        return r
      case o: org.sireum.lang.ast.Exp.LitR =>
        val r: MOption[org.sireum.lang.ast.Lit] = post_langastExpLitR(o) match {
         case MSome(result: org.sireum.lang.ast.Lit) => MSome[org.sireum.lang.ast.Lit](result)
         case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.Lit")
         case _ => MNone[org.sireum.lang.ast.Lit]()
        }
        return r
      case o: org.sireum.lang.ast.Exp.LitString =>
        val r: MOption[org.sireum.lang.ast.Lit] = post_langastExpLitString(o) match {
         case MSome(result: org.sireum.lang.ast.Lit) => MSome[org.sireum.lang.ast.Lit](result)
         case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.Lit")
         case _ => MNone[org.sireum.lang.ast.Lit]()
        }
        return r
      case o: org.sireum.lang.ast.Exp.LitStepId =>
        val r: MOption[org.sireum.lang.ast.Lit] = post_langastExpLitStepId(o) match {
         case MSome(result: org.sireum.lang.ast.Lit) => MSome[org.sireum.lang.ast.Lit](result)
         case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.Lit")
         case _ => MNone[org.sireum.lang.ast.Lit]()
        }
        return r
    }
  }

  def post_langastExpLitB(o: org.sireum.lang.ast.Exp.LitB): MOption[org.sireum.lang.ast.Exp] = {
    return PostResult_langastExpLitB
  }

  def post_langastExpLitC(o: org.sireum.lang.ast.Exp.LitC): MOption[org.sireum.lang.ast.Exp] = {
    return PostResult_langastExpLitC
  }

  def post_langastExpLitZ(o: org.sireum.lang.ast.Exp.LitZ): MOption[org.sireum.lang.ast.Exp] = {
    return PostResult_langastExpLitZ
  }

  def post_langastExpLitF32(o: org.sireum.lang.ast.Exp.LitF32): MOption[org.sireum.lang.ast.Exp] = {
    return PostResult_langastExpLitF32
  }

  def post_langastExpLitF64(o: org.sireum.lang.ast.Exp.LitF64): MOption[org.sireum.lang.ast.Exp] = {
    return PostResult_langastExpLitF64
  }

  def post_langastExpLitR(o: org.sireum.lang.ast.Exp.LitR): MOption[org.sireum.lang.ast.Exp] = {
    return PostResult_langastExpLitR
  }

  def post_langastExpLitString(o: org.sireum.lang.ast.Exp.LitString): MOption[org.sireum.lang.ast.Exp] = {
    return PostResult_langastExpLitString
  }

  def post_langastExpLitStepId(o: org.sireum.lang.ast.Exp.LitStepId): MOption[org.sireum.lang.ast.Exp] = {
    return PostResult_langastExpLitStepId
  }

  def post_langastExpStringInterpolate(o: org.sireum.lang.ast.Exp.StringInterpolate): MOption[org.sireum.lang.ast.Exp] = {
    return PostResult_langastExpStringInterpolate
  }

  def post_langastExpThis(o: org.sireum.lang.ast.Exp.This): MOption[org.sireum.lang.ast.Exp] = {
    return PostResult_langastExpThis
  }

  def post_langastExpSuper(o: org.sireum.lang.ast.Exp.Super): MOption[org.sireum.lang.ast.Exp] = {
    return PostResult_langastExpSuper
  }

  def post_langastExpUnary(o: org.sireum.lang.ast.Exp.Unary): MOption[org.sireum.lang.ast.Exp] = {
    return PostResult_langastExpUnary
  }

  def post_langastExpRef(o: org.sireum.lang.ast.Exp.Ref): MOption[org.sireum.lang.ast.Exp.Ref] = {
    o match {
      case o: org.sireum.lang.ast.Exp.Ident =>
        val r: MOption[org.sireum.lang.ast.Exp.Ref] = post_langastExpIdent(o) match {
         case MSome(result: org.sireum.lang.ast.Exp.Ref) => MSome[org.sireum.lang.ast.Exp.Ref](result)
         case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.Exp.Ref")
         case _ => MNone[org.sireum.lang.ast.Exp.Ref]()
        }
        return r
      case o: org.sireum.lang.ast.Exp.Select =>
        val r: MOption[org.sireum.lang.ast.Exp.Ref] = post_langastExpSelect(o) match {
         case MSome(result: org.sireum.lang.ast.Exp.Ref) => MSome[org.sireum.lang.ast.Exp.Ref](result)
         case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.Exp.Ref")
         case _ => MNone[org.sireum.lang.ast.Exp.Ref]()
        }
        return r
    }
  }

  def post_langastExpBinary(o: org.sireum.lang.ast.Exp.Binary): MOption[org.sireum.lang.ast.Exp] = {
    return PostResult_langastExpBinary
  }

  def post_langastExpIdent(o: org.sireum.lang.ast.Exp.Ident): MOption[org.sireum.lang.ast.Exp] = {
    return PostResult_langastExpIdent
  }

  def post_langastExpEta(o: org.sireum.lang.ast.Exp.Eta): MOption[org.sireum.lang.ast.Exp] = {
    return PostResult_langastExpEta
  }

  def post_langastExpTuple(o: org.sireum.lang.ast.Exp.Tuple): MOption[org.sireum.lang.ast.Exp] = {
    return PostResult_langastExpTuple
  }

  def post_langastExpSelect(o: org.sireum.lang.ast.Exp.Select): MOption[org.sireum.lang.ast.Exp] = {
    return PostResult_langastExpSelect
  }

  def post_langastExpInvoke(o: org.sireum.lang.ast.Exp.Invoke): MOption[org.sireum.lang.ast.Exp] = {
    return PostResult_langastExpInvoke
  }

  def post_langastExpInvokeNamed(o: org.sireum.lang.ast.Exp.InvokeNamed): MOption[org.sireum.lang.ast.Exp] = {
    return PostResult_langastExpInvokeNamed
  }

  def post_langastExpIf(o: org.sireum.lang.ast.Exp.If): MOption[org.sireum.lang.ast.Exp] = {
    return PostResult_langastExpIf
  }

  def post_langastExpFunParam(o: org.sireum.lang.ast.Exp.Fun.Param): MOption[org.sireum.lang.ast.Exp.Fun.Param] = {
    return PostResult_langastExpFunParam
  }

  def post_langastExpFun(o: org.sireum.lang.ast.Exp.Fun): MOption[org.sireum.lang.ast.Exp] = {
    return PostResult_langastExpFun
  }

  def post_langastExpForYield(o: org.sireum.lang.ast.Exp.ForYield): MOption[org.sireum.lang.ast.Exp] = {
    return PostResult_langastExpForYield
  }

  def post_langastExpQuant(o: org.sireum.lang.ast.Exp.Quant): MOption[org.sireum.lang.ast.Exp.Quant] = {
    o match {
      case o: org.sireum.lang.ast.Exp.QuantType => return post_langastExpQuantType(o)
      case o: org.sireum.lang.ast.Exp.QuantRange => return post_langastExpQuantRange(o)
      case o: org.sireum.lang.ast.Exp.QuantEach => return post_langastExpQuantEach(o)
    }
  }

  def post_langastExpQuantType(o: org.sireum.lang.ast.Exp.QuantType): MOption[org.sireum.lang.ast.Exp.Quant] = {
    return PostResult_langastExpQuantType
  }

  def post_langastExpQuantRange(o: org.sireum.lang.ast.Exp.QuantRange): MOption[org.sireum.lang.ast.Exp.Quant] = {
    return PostResult_langastExpQuantRange
  }

  def post_langastExpQuantEach(o: org.sireum.lang.ast.Exp.QuantEach): MOption[org.sireum.lang.ast.Exp.Quant] = {
    return PostResult_langastExpQuantEach
  }

  def post_langastExpInput(o: org.sireum.lang.ast.Exp.Input): MOption[org.sireum.lang.ast.Exp] = {
    return PostResult_langastExpInput
  }

  def post_langastExpOldVal(o: org.sireum.lang.ast.Exp.OldVal): MOption[org.sireum.lang.ast.Exp] = {
    return PostResult_langastExpOldVal
  }

  def post_langastExpLoopIndex(o: org.sireum.lang.ast.Exp.LoopIndex): MOption[org.sireum.lang.ast.Exp] = {
    return PostResult_langastExpLoopIndex
  }

  def post_langastExpStateSeq(o: org.sireum.lang.ast.Exp.StateSeq): MOption[org.sireum.lang.ast.Exp] = {
    return PostResult_langastExpStateSeq
  }

  def post_langastExpStateSeqFragment(o: org.sireum.lang.ast.Exp.StateSeq.Fragment): MOption[org.sireum.lang.ast.Exp.StateSeq.Fragment] = {
    return PostResult_langastExpStateSeqFragment
  }

  def post_langastExpResult(o: org.sireum.lang.ast.Exp.Result): MOption[org.sireum.lang.ast.Exp] = {
    return PostResult_langastExpResult
  }

  def post_langastNamedArg(o: org.sireum.lang.ast.NamedArg): MOption[org.sireum.lang.ast.NamedArg] = {
    return PostResult_langastNamedArg
  }

  def post_langastId(o: org.sireum.lang.ast.Id): MOption[org.sireum.lang.ast.Id] = {
    return PostResult_langastId
  }

  def post_langastName(o: org.sireum.lang.ast.Name): MOption[org.sireum.lang.ast.Name] = {
    return PostResult_langastName
  }

  def post_langastBody(o: org.sireum.lang.ast.Body): MOption[org.sireum.lang.ast.Body] = {
    return PostResult_langastBody
  }

  def post_langastAdtParam(o: org.sireum.lang.ast.AdtParam): MOption[org.sireum.lang.ast.AdtParam] = {
    return PostResult_langastAdtParam
  }

  def post_langastMethodSig(o: org.sireum.lang.ast.MethodSig): MOption[org.sireum.lang.ast.MethodSig] = {
    return PostResult_langastMethodSig
  }

  def post_langastParam(o: org.sireum.lang.ast.Param): MOption[org.sireum.lang.ast.Param] = {
    return PostResult_langastParam
  }

  def post_langastTypeParam(o: org.sireum.lang.ast.TypeParam): MOption[org.sireum.lang.ast.TypeParam] = {
    return PostResult_langastTypeParam
  }

  def post_langastAttr(o: org.sireum.lang.ast.Attr): MOption[org.sireum.lang.ast.Attr] = {
    return PostResult_langastAttr
  }

  def post_langastTypedAttr(o: org.sireum.lang.ast.TypedAttr): MOption[org.sireum.lang.ast.TypedAttr] = {
    return PostResult_langastTypedAttr
  }

  def post_langastResolvedAttr(o: org.sireum.lang.ast.ResolvedAttr): MOption[org.sireum.lang.ast.ResolvedAttr] = {
    return PostResult_langastResolvedAttr
  }

  def post_langastResolvedInfo(o: org.sireum.lang.ast.ResolvedInfo): MOption[org.sireum.lang.ast.ResolvedInfo] = {
    o match {
      case o: org.sireum.lang.ast.ResolvedInfo.BuiltIn => return post_langastResolvedInfoBuiltIn(o)
      case o: org.sireum.lang.ast.ResolvedInfo.Package => return post_langastResolvedInfoPackage(o)
      case o: org.sireum.lang.ast.ResolvedInfo.Enum => return post_langastResolvedInfoEnum(o)
      case o: org.sireum.lang.ast.ResolvedInfo.EnumElement => return post_langastResolvedInfoEnumElement(o)
      case o: org.sireum.lang.ast.ResolvedInfo.Object => return post_langastResolvedInfoObject(o)
      case o: org.sireum.lang.ast.ResolvedInfo.Var => return post_langastResolvedInfoVar(o)
      case o: org.sireum.lang.ast.ResolvedInfo.Method => return post_langastResolvedInfoMethod(o)
      case o: org.sireum.lang.ast.ResolvedInfo.Methods => return post_langastResolvedInfoMethods(o)
      case o: org.sireum.lang.ast.ResolvedInfo.Tuple => return post_langastResolvedInfoTuple(o)
      case o: org.sireum.lang.ast.ResolvedInfo.LocalVar => return post_langastResolvedInfoLocalVar(o)
      case o: org.sireum.lang.ast.ResolvedInfo.Fact => return post_langastResolvedInfoFact(o)
      case o: org.sireum.lang.ast.ResolvedInfo.Theorem => return post_langastResolvedInfoTheorem(o)
      case o: org.sireum.lang.ast.ResolvedInfo.Inv => return post_langastResolvedInfoInv(o)
    }
  }

  def post_langastResolvedInfoBuiltIn(o: org.sireum.lang.ast.ResolvedInfo.BuiltIn): MOption[org.sireum.lang.ast.ResolvedInfo] = {
    return PostResult_langastResolvedInfoBuiltIn
  }

  def post_langastResolvedInfoPackage(o: org.sireum.lang.ast.ResolvedInfo.Package): MOption[org.sireum.lang.ast.ResolvedInfo] = {
    return PostResult_langastResolvedInfoPackage
  }

  def post_langastResolvedInfoEnum(o: org.sireum.lang.ast.ResolvedInfo.Enum): MOption[org.sireum.lang.ast.ResolvedInfo] = {
    return PostResult_langastResolvedInfoEnum
  }

  def post_langastResolvedInfoEnumElement(o: org.sireum.lang.ast.ResolvedInfo.EnumElement): MOption[org.sireum.lang.ast.ResolvedInfo] = {
    return PostResult_langastResolvedInfoEnumElement
  }

  def post_langastResolvedInfoObject(o: org.sireum.lang.ast.ResolvedInfo.Object): MOption[org.sireum.lang.ast.ResolvedInfo] = {
    return PostResult_langastResolvedInfoObject
  }

  def post_langastResolvedInfoVar(o: org.sireum.lang.ast.ResolvedInfo.Var): MOption[org.sireum.lang.ast.ResolvedInfo] = {
    return PostResult_langastResolvedInfoVar
  }

  def post_langastResolvedInfoMethod(o: org.sireum.lang.ast.ResolvedInfo.Method): MOption[org.sireum.lang.ast.ResolvedInfo] = {
    return PostResult_langastResolvedInfoMethod
  }

  def post_langastResolvedInfoMethods(o: org.sireum.lang.ast.ResolvedInfo.Methods): MOption[org.sireum.lang.ast.ResolvedInfo] = {
    return PostResult_langastResolvedInfoMethods
  }

  def post_langastResolvedInfoTuple(o: org.sireum.lang.ast.ResolvedInfo.Tuple): MOption[org.sireum.lang.ast.ResolvedInfo] = {
    return PostResult_langastResolvedInfoTuple
  }

  def post_langastResolvedInfoLocalVar(o: org.sireum.lang.ast.ResolvedInfo.LocalVar): MOption[org.sireum.lang.ast.ResolvedInfo] = {
    return PostResult_langastResolvedInfoLocalVar
  }

  def post_langastResolvedInfoFact(o: org.sireum.lang.ast.ResolvedInfo.Fact): MOption[org.sireum.lang.ast.ResolvedInfo] = {
    return PostResult_langastResolvedInfoFact
  }

  def post_langastResolvedInfoTheorem(o: org.sireum.lang.ast.ResolvedInfo.Theorem): MOption[org.sireum.lang.ast.ResolvedInfo] = {
    return PostResult_langastResolvedInfoTheorem
  }

  def post_langastResolvedInfoInv(o: org.sireum.lang.ast.ResolvedInfo.Inv): MOption[org.sireum.lang.ast.ResolvedInfo] = {
    return PostResult_langastResolvedInfoInv
  }

  def post_langastTruthTableRow(o: org.sireum.lang.ast.TruthTable.Row): MOption[org.sireum.lang.ast.TruthTable.Row] = {
    return PostResult_langastTruthTableRow
  }

  def post_langastTruthTableAssignment(o: org.sireum.lang.ast.TruthTable.Assignment): MOption[org.sireum.lang.ast.TruthTable.Assignment] = {
    return PostResult_langastTruthTableAssignment
  }

  def post_langastTruthTableConclusion(o: org.sireum.lang.ast.TruthTable.Conclusion): MOption[org.sireum.lang.ast.TruthTable.Conclusion] = {
    o match {
      case o: org.sireum.lang.ast.TruthTable.Conclusion.Validity => return post_langastTruthTableConclusionValidity(o)
      case o: org.sireum.lang.ast.TruthTable.Conclusion.Tautology => return post_langastTruthTableConclusionTautology(o)
      case o: org.sireum.lang.ast.TruthTable.Conclusion.Contradictory => return post_langastTruthTableConclusionContradictory(o)
      case o: org.sireum.lang.ast.TruthTable.Conclusion.Contingent => return post_langastTruthTableConclusionContingent(o)
    }
  }

  def post_langastTruthTableConclusionValidity(o: org.sireum.lang.ast.TruthTable.Conclusion.Validity): MOption[org.sireum.lang.ast.TruthTable.Conclusion] = {
    return PostResult_langastTruthTableConclusionValidity
  }

  def post_langastTruthTableConclusionTautology(o: org.sireum.lang.ast.TruthTable.Conclusion.Tautology): MOption[org.sireum.lang.ast.TruthTable.Conclusion] = {
    return PostResult_langastTruthTableConclusionTautology
  }

  def post_langastTruthTableConclusionContradictory(o: org.sireum.lang.ast.TruthTable.Conclusion.Contradictory): MOption[org.sireum.lang.ast.TruthTable.Conclusion] = {
    return PostResult_langastTruthTableConclusionContradictory
  }

  def post_langastTruthTableConclusionContingent(o: org.sireum.lang.ast.TruthTable.Conclusion.Contingent): MOption[org.sireum.lang.ast.TruthTable.Conclusion] = {
    return PostResult_langastTruthTableConclusionContingent
  }

  def postSmfAnnex(o: SmfAnnex): MOption[SmfAnnex] = {
    o match {
      case o: SmfClause =>
        val r: MOption[SmfAnnex] = postSmfClause(o) match {
         case MSome(result: SmfAnnex) => MSome[SmfAnnex](result)
         case MSome(_) => halt("Can only produce object of type SmfAnnex")
         case _ => MNone[SmfAnnex]()
        }
        return r
      case o: SmfClassification =>
        val r: MOption[SmfAnnex] = postSmfClassification(o) match {
         case MSome(result: SmfAnnex) => MSome[SmfAnnex](result)
         case MSome(_) => halt("Can only produce object of type SmfAnnex")
         case _ => MNone[SmfAnnex]()
        }
        return r
      case o: SmfDeclass =>
        val r: MOption[SmfAnnex] = postSmfDeclass(o) match {
         case MSome(result: SmfAnnex) => MSome[SmfAnnex](result)
         case MSome(_) => halt("Can only produce object of type SmfAnnex")
         case _ => MNone[SmfAnnex]()
        }
        return r
      case o: SmfType =>
        val r: MOption[SmfAnnex] = postSmfType(o) match {
         case MSome(result: SmfAnnex) => MSome[SmfAnnex](result)
         case MSome(_) => halt("Can only produce object of type SmfAnnex")
         case _ => MNone[SmfAnnex]()
        }
        return r
    }
  }

  def postSmfLib(o: SmfLib): MOption[SmfLib] = {
    o match {
      case o: SmfLibrary =>
        val r: MOption[SmfLib] = postSmfLibrary(o) match {
         case MSome(result: SmfLib) => MSome[SmfLib](result)
         case MSome(_) => halt("Can only produce object of type SmfLib")
         case _ => MNone[SmfLib]()
        }
        return r
    }
  }

  def postSmfClause(o: SmfClause): MOption[SmfClause] = {
    return PostResultSmfClause
  }

  def postSmfClassification(o: SmfClassification): MOption[SmfClassification] = {
    return PostResultSmfClassification
  }

  def postSmfDeclass(o: SmfDeclass): MOption[SmfDeclass] = {
    return PostResultSmfDeclass
  }

  def postSmfLibrary(o: SmfLibrary): MOption[SmfLibrary] = {
    return PostResultSmfLibrary
  }

  def postSmfType(o: SmfType): MOption[SmfType] = {
    return PostResultSmfType
  }

  def postAadlInstInfo(o: AadlInstInfo): MOption[AadlInstInfo] = {
    o match {
      case o: Component =>
        val r: MOption[AadlInstInfo] = postComponent(o) match {
         case MSome(result: AadlInstInfo) => MSome[AadlInstInfo](result)
         case MSome(_) => halt("Can only produce object of type AadlInstInfo")
         case _ => MNone[AadlInstInfo]()
        }
        return r
      case o: ErrorTypeDef =>
        val r: MOption[AadlInstInfo] = postErrorTypeDef(o) match {
         case MSome(result: AadlInstInfo) => MSome[AadlInstInfo](result)
         case MSome(_) => halt("Can only produce object of type AadlInstInfo")
         case _ => MNone[AadlInstInfo]()
        }
        return r
      case o: FeatureEnd =>
        val r: MOption[AadlInstInfo] = postFeatureEnd(o) match {
         case MSome(result: AadlInstInfo) => MSome[AadlInstInfo](result)
         case MSome(_) => halt("Can only produce object of type AadlInstInfo")
         case _ => MNone[AadlInstInfo]()
        }
        return r
      case o: FeatureGroup =>
        val r: MOption[AadlInstInfo] = postFeatureGroup(o) match {
         case MSome(result: AadlInstInfo) => MSome[AadlInstInfo](result)
         case MSome(_) => halt("Can only produce object of type AadlInstInfo")
         case _ => MNone[AadlInstInfo]()
        }
        return r
      case o: FeatureAccess =>
        val r: MOption[AadlInstInfo] = postFeatureAccess(o) match {
         case MSome(result: AadlInstInfo) => MSome[AadlInstInfo](result)
         case MSome(_) => halt("Can only produce object of type AadlInstInfo")
         case _ => MNone[AadlInstInfo]()
        }
        return r
      case o: Connection =>
        val r: MOption[AadlInstInfo] = postConnection(o) match {
         case MSome(result: AadlInstInfo) => MSome[AadlInstInfo](result)
         case MSome(_) => halt("Can only produce object of type AadlInstInfo")
         case _ => MNone[AadlInstInfo]()
        }
        return r
      case o: Emv2Flow =>
        val r: MOption[AadlInstInfo] = postEmv2Flow(o) match {
         case MSome(result: AadlInstInfo) => MSome[AadlInstInfo](result)
         case MSome(_) => halt("Can only produce object of type AadlInstInfo")
         case _ => MNone[AadlInstInfo]()
        }
        return r
      case o: Flow =>
        val r: MOption[AadlInstInfo] = postFlow(o) match {
         case MSome(result: AadlInstInfo) => MSome[AadlInstInfo](result)
         case MSome(_) => halt("Can only produce object of type AadlInstInfo")
         case _ => MNone[AadlInstInfo]()
        }
        return r
    }
  }

  def postEmv2Annex(o: Emv2Annex): MOption[Emv2Annex] = {
    o match {
      case o: ErrorTypeDef =>
        val r: MOption[Emv2Annex] = postErrorTypeDef(o) match {
         case MSome(result: Emv2Annex) => MSome[Emv2Annex](result)
         case MSome(_) => halt("Can only produce object of type Emv2Annex")
         case _ => MNone[Emv2Annex]()
        }
        return r
      case o: ErrorAliasDef =>
        val r: MOption[Emv2Annex] = postErrorAliasDef(o) match {
         case MSome(result: Emv2Annex) => MSome[Emv2Annex](result)
         case MSome(_) => halt("Can only produce object of type Emv2Annex")
         case _ => MNone[Emv2Annex]()
        }
        return r
      case o: ErrorTypeSetDef =>
        val r: MOption[Emv2Annex] = postErrorTypeSetDef(o) match {
         case MSome(result: Emv2Annex) => MSome[Emv2Annex](result)
         case MSome(_) => halt("Can only produce object of type Emv2Annex")
         case _ => MNone[Emv2Annex]()
        }
        return r
      case o: BehaveStateMachine =>
        val r: MOption[Emv2Annex] = postBehaveStateMachine(o) match {
         case MSome(result: Emv2Annex) => MSome[Emv2Annex](result)
         case MSome(_) => halt("Can only produce object of type Emv2Annex")
         case _ => MNone[Emv2Annex]()
        }
        return r
      case o: ErrorEvent =>
        val r: MOption[Emv2Annex] = postErrorEvent(o) match {
         case MSome(result: Emv2Annex) => MSome[Emv2Annex](result)
         case MSome(_) => halt("Can only produce object of type Emv2Annex")
         case _ => MNone[Emv2Annex]()
        }
        return r
      case o: ErrorState =>
        val r: MOption[Emv2Annex] = postErrorState(o) match {
         case MSome(result: Emv2Annex) => MSome[Emv2Annex](result)
         case MSome(_) => halt("Can only produce object of type Emv2Annex")
         case _ => MNone[Emv2Annex]()
        }
        return r
      case o: ErrorTransition =>
        val r: MOption[Emv2Annex] = postErrorTransition(o) match {
         case MSome(result: Emv2Annex) => MSome[Emv2Annex](result)
         case MSome(_) => halt("Can only produce object of type Emv2Annex")
         case _ => MNone[Emv2Annex]()
        }
        return r
      case o: ConditionTrigger =>
        val r: MOption[Emv2Annex] = postConditionTrigger(o) match {
         case MSome(result: Emv2Annex) => MSome[Emv2Annex](result)
         case MSome(_) => halt("Can only produce object of type Emv2Annex")
         case _ => MNone[Emv2Annex]()
        }
        return r
      case o: AndCondition =>
        val r: MOption[Emv2Annex] = postAndCondition(o) match {
         case MSome(result: Emv2Annex) => MSome[Emv2Annex](result)
         case MSome(_) => halt("Can only produce object of type Emv2Annex")
         case _ => MNone[Emv2Annex]()
        }
        return r
      case o: OrCondition =>
        val r: MOption[Emv2Annex] = postOrCondition(o) match {
         case MSome(result: Emv2Annex) => MSome[Emv2Annex](result)
         case MSome(_) => halt("Can only produce object of type Emv2Annex")
         case _ => MNone[Emv2Annex]()
        }
        return r
      case o: AllCondition =>
        val r: MOption[Emv2Annex] = postAllCondition(o) match {
         case MSome(result: Emv2Annex) => MSome[Emv2Annex](result)
         case MSome(_) => halt("Can only produce object of type Emv2Annex")
         case _ => MNone[Emv2Annex]()
        }
        return r
      case o: OrMoreCondition =>
        val r: MOption[Emv2Annex] = postOrMoreCondition(o) match {
         case MSome(result: Emv2Annex) => MSome[Emv2Annex](result)
         case MSome(_) => halt("Can only produce object of type Emv2Annex")
         case _ => MNone[Emv2Annex]()
        }
        return r
      case o: OrLessCondition =>
        val r: MOption[Emv2Annex] = postOrLessCondition(o) match {
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
      case o: Emv2BehaviorSection =>
        val r: MOption[Emv2Annex] = postEmv2BehaviorSection(o) match {
         case MSome(result: Emv2Annex) => MSome[Emv2Annex](result)
         case MSome(_) => halt("Can only produce object of type Emv2Annex")
         case _ => MNone[Emv2Annex]()
        }
        return r
      case o: ErrorPropagation =>
        val r: MOption[Emv2Annex] = postErrorPropagation(o) match {
         case MSome(result: Emv2Annex) => MSome[Emv2Annex](result)
         case MSome(_) => halt("Can only produce object of type Emv2Annex")
         case _ => MNone[Emv2Annex]()
        }
        return r
    }
  }

  def postEmv2Lib(o: Emv2Lib): MOption[Emv2Lib] = {
    o match {
      case o: Emv2Library =>
        val r: MOption[Emv2Lib] = postEmv2Library(o) match {
         case MSome(result: Emv2Lib) => MSome[Emv2Lib](result)
         case MSome(_) => halt("Can only produce object of type Emv2Lib")
         case _ => MNone[Emv2Lib]()
        }
        return r
    }
  }

  def postAadl(o: Aadl): MOption[Aadl] = {
    return PostResultAadl
  }

  def post_langastTyped(o: org.sireum.lang.ast.Typed): MOption[org.sireum.lang.ast.Typed] = {
    o match {
      case o: org.sireum.lang.ast.Typed.Name => return post_langastTypedName(o)
      case o: org.sireum.lang.ast.Typed.Tuple => return post_langastTypedTuple(o)
      case o: org.sireum.lang.ast.Typed.Fun => return post_langastTypedFun(o)
      case o: org.sireum.lang.ast.Typed.TypeVar => return post_langastTypedTypeVar(o)
      case o: org.sireum.lang.ast.Typed.Package => return post_langastTypedPackage(o)
      case o: org.sireum.lang.ast.Typed.Object => return post_langastTypedObject(o)
      case o: org.sireum.lang.ast.Typed.Enum => return post_langastTypedEnum(o)
      case o: org.sireum.lang.ast.Typed.Method => return post_langastTypedMethod(o)
      case o: org.sireum.lang.ast.Typed.Methods => return post_langastTypedMethods(o)
      case o: org.sireum.lang.ast.Typed.Fact => return post_langastTypedFact(o)
      case o: org.sireum.lang.ast.Typed.Theorem => return post_langastTypedTheorem(o)
      case o: org.sireum.lang.ast.Typed.Inv => return post_langastTypedInv(o)
    }
  }

  def postEmv2ElementRef(o: Emv2ElementRef): MOption[Emv2ElementRef] = {
    return PostResultEmv2ElementRef
  }

  def postName(o: Name): MOption[Name] = {
    return PostResultName
  }

  def postComponent(o: Component): MOption[Component] = {
    return PostResultComponent
  }

  def postEmv2Library(o: Emv2Library): MOption[Emv2Library] = {
    return PostResultEmv2Library
  }

  def postErrorTypeDef(o: ErrorTypeDef): MOption[ErrorTypeDef] = {
    return PostResultErrorTypeDef
  }

  def postClassifier(o: Classifier): MOption[Classifier] = {
    return PostResultClassifier
  }

  def postErrorAliasDef(o: ErrorAliasDef): MOption[ErrorAliasDef] = {
    return PostResultErrorAliasDef
  }

  def postErrorTypeSetDef(o: ErrorTypeSetDef): MOption[ErrorTypeSetDef] = {
    return PostResultErrorTypeSetDef
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

  def postBehaveStateMachine(o: BehaveStateMachine): MOption[BehaveStateMachine] = {
    return PostResultBehaveStateMachine
  }

  def postFeatureEnd(o: FeatureEnd): MOption[FeatureEnd] = {
    return PostResultFeatureEnd
  }

  def postErrorEvent(o: ErrorEvent): MOption[ErrorEvent] = {
    return PostResultErrorEvent
  }

  def postErrorState(o: ErrorState): MOption[ErrorState] = {
    return PostResultErrorState
  }

  def postErrorTransition(o: ErrorTransition): MOption[ErrorTransition] = {
    return PostResultErrorTransition
  }

  def postFeatureGroup(o: FeatureGroup): MOption[FeatureGroup] = {
    return PostResultFeatureGroup
  }

  def postErrorCondition(o: ErrorCondition): MOption[ErrorCondition] = {
    o match {
      case o: ConditionTrigger =>
        val r: MOption[ErrorCondition] = postConditionTrigger(o) match {
         case MSome(result: ErrorCondition) => MSome[ErrorCondition](result)
         case MSome(_) => halt("Can only produce object of type ErrorCondition")
         case _ => MNone[ErrorCondition]()
        }
        return r
      case o: AndCondition =>
        val r: MOption[ErrorCondition] = postAndCondition(o) match {
         case MSome(result: ErrorCondition) => MSome[ErrorCondition](result)
         case MSome(_) => halt("Can only produce object of type ErrorCondition")
         case _ => MNone[ErrorCondition]()
        }
        return r
      case o: OrCondition =>
        val r: MOption[ErrorCondition] = postOrCondition(o) match {
         case MSome(result: ErrorCondition) => MSome[ErrorCondition](result)
         case MSome(_) => halt("Can only produce object of type ErrorCondition")
         case _ => MNone[ErrorCondition]()
        }
        return r
      case o: AllCondition =>
        val r: MOption[ErrorCondition] = postAllCondition(o) match {
         case MSome(result: ErrorCondition) => MSome[ErrorCondition](result)
         case MSome(_) => halt("Can only produce object of type ErrorCondition")
         case _ => MNone[ErrorCondition]()
        }
        return r
      case o: OrMoreCondition =>
        val r: MOption[ErrorCondition] = postOrMoreCondition(o) match {
         case MSome(result: ErrorCondition) => MSome[ErrorCondition](result)
         case MSome(_) => halt("Can only produce object of type ErrorCondition")
         case _ => MNone[ErrorCondition]()
        }
        return r
      case o: OrLessCondition =>
        val r: MOption[ErrorCondition] = postOrLessCondition(o) match {
         case MSome(result: ErrorCondition) => MSome[ErrorCondition](result)
         case MSome(_) => halt("Can only produce object of type ErrorCondition")
         case _ => MNone[ErrorCondition]()
        }
        return r
    }
  }

  def postConditionTrigger(o: ConditionTrigger): MOption[ConditionTrigger] = {
    return PostResultConditionTrigger
  }

  def postAndCondition(o: AndCondition): MOption[AndCondition] = {
    return PostResultAndCondition
  }

  def postFeatureAccess(o: FeatureAccess): MOption[FeatureAccess] = {
    return PostResultFeatureAccess
  }

  def postOrCondition(o: OrCondition): MOption[OrCondition] = {
    return PostResultOrCondition
  }

  def postAllCondition(o: AllCondition): MOption[AllCondition] = {
    return PostResultAllCondition
  }

  def postOrMoreCondition(o: OrMoreCondition): MOption[OrMoreCondition] = {
    return PostResultOrMoreCondition
  }

  def postOrLessCondition(o: OrLessCondition): MOption[OrLessCondition] = {
    return PostResultOrLessCondition
  }

  def postEmv2Clause(o: Emv2Clause): MOption[Emv2Clause] = {
    return PostResultEmv2Clause
  }

  def postEmv2Propagation(o: Emv2Propagation): MOption[Emv2Propagation] = {
    return PostResultEmv2Propagation
  }

  def postConnection(o: Connection): MOption[Connection] = {
    return PostResultConnection
  }

  def postEmv2Flow(o: Emv2Flow): MOption[Emv2Flow] = {
    return PostResultEmv2Flow
  }

  def postEmv2BehaviorSection(o: Emv2BehaviorSection): MOption[Emv2BehaviorSection] = {
    return PostResultEmv2BehaviorSection
  }

  def postConnectionInstance(o: ConnectionInstance): MOption[ConnectionInstance] = {
    return PostResultConnectionInstance
  }

  def postErrorPropagation(o: ErrorPropagation): MOption[ErrorPropagation] = {
    return PostResultErrorPropagation
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

  def postElementRef(o: ElementRef): MOption[ElementRef] = {
    o match {
      case o: Emv2ElementRef =>
        val r: MOption[ElementRef] = postEmv2ElementRef(o) match {
         case MSome(result: ElementRef) => MSome[ElementRef](result)
         case MSome(_) => halt("Can only produce object of type ElementRef")
         case _ => MNone[ElementRef]()
        }
        return r
      case o: AadlElementRef =>
        val r: MOption[ElementRef] = postAadlElementRef(o) match {
         case MSome(result: ElementRef) => MSome[ElementRef](result)
         case MSome(_) => halt("Can only produce object of type ElementRef")
         case _ => MNone[ElementRef]()
        }
        return r
    }
  }

  def postAadlElementRef(o: AadlElementRef): MOption[AadlElementRef] = {
    return PostResultAadlElementRef
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
      case o: SmfClause =>
        val r: MOption[AnnexClause] = postSmfClause(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: SmfClassification =>
        val r: MOption[AnnexClause] = postSmfClassification(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: SmfDeclass =>
        val r: MOption[AnnexClause] = postSmfDeclass(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: SmfType =>
        val r: MOption[AnnexClause] = postSmfType(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: ErrorTypeDef =>
        val r: MOption[AnnexClause] = postErrorTypeDef(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: ErrorAliasDef =>
        val r: MOption[AnnexClause] = postErrorAliasDef(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: ErrorTypeSetDef =>
        val r: MOption[AnnexClause] = postErrorTypeSetDef(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: BehaveStateMachine =>
        val r: MOption[AnnexClause] = postBehaveStateMachine(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: ErrorEvent =>
        val r: MOption[AnnexClause] = postErrorEvent(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: ErrorState =>
        val r: MOption[AnnexClause] = postErrorState(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: ErrorTransition =>
        val r: MOption[AnnexClause] = postErrorTransition(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: ConditionTrigger =>
        val r: MOption[AnnexClause] = postConditionTrigger(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: AndCondition =>
        val r: MOption[AnnexClause] = postAndCondition(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: OrCondition =>
        val r: MOption[AnnexClause] = postOrCondition(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: AllCondition =>
        val r: MOption[AnnexClause] = postAllCondition(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: OrMoreCondition =>
        val r: MOption[AnnexClause] = postOrMoreCondition(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: OrLessCondition =>
        val r: MOption[AnnexClause] = postOrLessCondition(o) match {
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
      case o: Emv2BehaviorSection =>
        val r: MOption[AnnexClause] = postEmv2BehaviorSection(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: ErrorPropagation =>
        val r: MOption[AnnexClause] = postErrorPropagation(o) match {
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
      case o: GclSubclause =>
        val r: MOption[AnnexClause] = postGclSubclause(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: BTSBLESSAnnexClause =>
        val r: MOption[AnnexClause] = postBTSBLESSAnnexClause(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
    }
  }

  def postAnnexLib(o: AnnexLib): MOption[AnnexLib] = {
    o match {
      case o: SmfLibrary =>
        val r: MOption[AnnexLib] = postSmfLibrary(o) match {
         case MSome(result: AnnexLib) => MSome[AnnexLib](result)
         case MSome(_) => halt("Can only produce object of type AnnexLib")
         case _ => MNone[AnnexLib]()
        }
        return r
      case o: Emv2Library =>
        val r: MOption[AnnexLib] = postEmv2Library(o) match {
         case MSome(result: AnnexLib) => MSome[AnnexLib](result)
         case MSome(_) => halt("Can only produce object of type AnnexLib")
         case _ => MNone[AnnexLib]()
        }
        return r
      case o: OtherLib =>
        val r: MOption[AnnexLib] = postOtherLib(o) match {
         case MSome(result: AnnexLib) => MSome[AnnexLib](result)
         case MSome(_) => halt("Can only produce object of type AnnexLib")
         case _ => MNone[AnnexLib]()
        }
        return r
      case o: GclLibrary =>
        val r: MOption[AnnexLib] = postGclLibrary(o) match {
         case MSome(result: AnnexLib) => MSome[AnnexLib](result)
         case MSome(_) => halt("Can only produce object of type AnnexLib")
         case _ => MNone[AnnexLib]()
        }
        return r
    }
  }

  def postOtherAnnex(o: OtherAnnex): MOption[OtherAnnex] = {
    return PostResultOtherAnnex
  }

  def post_langastTypedName(o: org.sireum.lang.ast.Typed.Name): MOption[org.sireum.lang.ast.Typed] = {
    return PostResult_langastTypedName
  }

  def postOtherLib(o: OtherLib): MOption[OtherLib] = {
    return PostResultOtherLib
  }

  def post_langastTypedTuple(o: org.sireum.lang.ast.Typed.Tuple): MOption[org.sireum.lang.ast.Typed] = {
    return PostResult_langastTypedTuple
  }

  def post_langastTypedFun(o: org.sireum.lang.ast.Typed.Fun): MOption[org.sireum.lang.ast.Typed] = {
    return PostResult_langastTypedFun
  }

  def post_langastTypedTypeVar(o: org.sireum.lang.ast.Typed.TypeVar): MOption[org.sireum.lang.ast.Typed] = {
    return PostResult_langastTypedTypeVar
  }

  def post_langastTypedPackage(o: org.sireum.lang.ast.Typed.Package): MOption[org.sireum.lang.ast.Typed] = {
    return PostResult_langastTypedPackage
  }

  def post_langastTypedObject(o: org.sireum.lang.ast.Typed.Object): MOption[org.sireum.lang.ast.Typed] = {
    return PostResult_langastTypedObject
  }

  def post_langastTypedEnum(o: org.sireum.lang.ast.Typed.Enum): MOption[org.sireum.lang.ast.Typed] = {
    return PostResult_langastTypedEnum
  }

  def post_langastTypedMethod(o: org.sireum.lang.ast.Typed.Method): MOption[org.sireum.lang.ast.Typed] = {
    return PostResult_langastTypedMethod
  }

  def post_langastTypedMethods(o: org.sireum.lang.ast.Typed.Methods): MOption[org.sireum.lang.ast.Typed] = {
    return PostResult_langastTypedMethods
  }

  def post_langastTypedFact(o: org.sireum.lang.ast.Typed.Fact): MOption[org.sireum.lang.ast.Typed] = {
    return PostResult_langastTypedFact
  }

  def post_langastTypedTheorem(o: org.sireum.lang.ast.Typed.Theorem): MOption[org.sireum.lang.ast.Typed] = {
    return PostResult_langastTypedTheorem
  }

  def post_langastTypedInv(o: org.sireum.lang.ast.Typed.Inv): MOption[org.sireum.lang.ast.Typed] = {
    return PostResult_langastTypedInv
  }

  def postGclAnnex(o: GclAnnex): MOption[GclAnnex] = {
    o match {
      case o: GclSubclause =>
        val r: MOption[GclAnnex] = postGclSubclause(o) match {
         case MSome(result: GclAnnex) => MSome[GclAnnex](result)
         case MSome(_) => halt("Can only produce object of type GclAnnex")
         case _ => MNone[GclAnnex]()
        }
        return r
    }
  }

  def postGclSubclause(o: GclSubclause): MOption[GclSubclause] = {
    return PostResultGclSubclause
  }

  def postBLESSAnnex(o: BLESSAnnex): MOption[BLESSAnnex] = {
    o match {
      case o: BTSBLESSAnnexClause =>
        val r: MOption[BLESSAnnex] = postBTSBLESSAnnexClause(o) match {
         case MSome(result: BLESSAnnex) => MSome[BLESSAnnex](result)
         case MSome(_) => halt("Can only produce object of type BLESSAnnex")
         case _ => MNone[BLESSAnnex]()
        }
        return r
    }
  }

  def postGclStateVar(o: GclStateVar): MOption[GclStateVar] = {
    return PostResultGclStateVar
  }

  def postGclSpec(o: GclSpec): MOption[GclSpec] = {
    o match {
      case o: GclInvariant =>
        val r: MOption[GclSpec] = postGclInvariant(o) match {
         case MSome(result: GclSpec) => MSome[GclSpec](result)
         case MSome(_) => halt("Can only produce object of type GclSpec")
         case _ => MNone[GclSpec]()
        }
        return r
      case o: GclAssume =>
        val r: MOption[GclSpec] = postGclAssume(o) match {
         case MSome(result: GclSpec) => MSome[GclSpec](result)
         case MSome(_) => halt("Can only produce object of type GclSpec")
         case _ => MNone[GclSpec]()
        }
        return r
      case o: GclGuarantee =>
        val r: MOption[GclSpec] = postGclGuarantee(o) match {
         case MSome(result: GclSpec) => MSome[GclSpec](result)
         case MSome(_) => halt("Can only produce object of type GclSpec")
         case _ => MNone[GclSpec]()
        }
        return r
    }
  }

  def postGclInvariant(o: GclInvariant): MOption[GclInvariant] = {
    return PostResultGclInvariant
  }

  def postBTSBLESSAnnexClause(o: BTSBLESSAnnexClause): MOption[BTSBLESSAnnexClause] = {
    return PostResultBTSBLESSAnnexClause
  }

  def postGclComputeSpec(o: GclComputeSpec): MOption[GclComputeSpec] = {
    o match {
      case o: GclAssume =>
        val r: MOption[GclComputeSpec] = postGclAssume(o) match {
         case MSome(result: GclComputeSpec) => MSome[GclComputeSpec](result)
         case MSome(_) => halt("Can only produce object of type GclComputeSpec")
         case _ => MNone[GclComputeSpec]()
        }
        return r
      case o: GclGuarantee =>
        val r: MOption[GclComputeSpec] = postGclGuarantee(o) match {
         case MSome(result: GclComputeSpec) => MSome[GclComputeSpec](result)
         case MSome(_) => halt("Can only produce object of type GclComputeSpec")
         case _ => MNone[GclComputeSpec]()
        }
        return r
    }
  }

  def postGclAssume(o: GclAssume): MOption[GclAssume] = {
    return PostResultGclAssume
  }

  def postGclGuarantee(o: GclGuarantee): MOption[GclGuarantee] = {
    return PostResultGclGuarantee
  }

  def postGclIntegration(o: GclIntegration): MOption[GclIntegration] = {
    return PostResultGclIntegration
  }

  def postGclCaseStatement(o: GclCaseStatement): MOption[GclCaseStatement] = {
    return PostResultGclCaseStatement
  }

  def postGclInitialize(o: GclInitialize): MOption[GclInitialize] = {
    return PostResultGclInitialize
  }

  def postGclCompute(o: GclCompute): MOption[GclCompute] = {
    return PostResultGclCompute
  }

  def postGclHandle(o: GclHandle): MOption[GclHandle] = {
    return PostResultGclHandle
  }

  def postGclTODO(o: GclTODO): MOption[GclTODO] = {
    return PostResultGclTODO
  }

  def postGclLibrary(o: GclLibrary): MOption[GclLibrary] = {
    return PostResultGclLibrary
  }

  def postBTSVariableDeclaration(o: BTSVariableDeclaration): MOption[BTSVariableDeclaration] = {
    return PostResultBTSVariableDeclaration
  }

  def postBTSType(o: BTSType): MOption[BTSType] = {
    o match {
      case o: BTSClassifier =>
        val r: MOption[BTSType] = postBTSClassifier(o) match {
         case MSome(result: BTSType) => MSome[BTSType](result)
         case MSome(_) => halt("Can only produce object of type BTSType")
         case _ => MNone[BTSType]()
        }
        return r
    }
  }

  def postBTSClassifier(o: BTSClassifier): MOption[BTSClassifier] = {
    return PostResultBTSClassifier
  }

  def postBLESSIntConst(o: BLESSIntConst): MOption[BLESSIntConst] = {
    return PostResultBLESSIntConst
  }

  def postBTSStateDeclaration(o: BTSStateDeclaration): MOption[BTSStateDeclaration] = {
    return PostResultBTSStateDeclaration
  }

  def postBTSTransition(o: BTSTransition): MOption[BTSTransition] = {
    return PostResultBTSTransition
  }

  def postBTSTransitionLabel(o: BTSTransitionLabel): MOption[BTSTransitionLabel] = {
    return PostResultBTSTransitionLabel
  }

  def postBTSTransitionCondition(o: BTSTransitionCondition): MOption[BTSTransitionCondition] = {
    o match {
      case o: BTSDispatchCondition =>
        val r: MOption[BTSTransitionCondition] = postBTSDispatchCondition(o) match {
         case MSome(result: BTSTransitionCondition) => MSome[BTSTransitionCondition](result)
         case MSome(_) => halt("Can only produce object of type BTSTransitionCondition")
         case _ => MNone[BTSTransitionCondition]()
        }
        return r
      case o: BTSExecuteConditionExp =>
        val r: MOption[BTSTransitionCondition] = postBTSExecuteConditionExp(o) match {
         case MSome(result: BTSTransitionCondition) => MSome[BTSTransitionCondition](result)
         case MSome(_) => halt("Can only produce object of type BTSTransitionCondition")
         case _ => MNone[BTSTransitionCondition]()
        }
        return r
      case o: BTSExecuteConditionTimeout =>
        val r: MOption[BTSTransitionCondition] = postBTSExecuteConditionTimeout(o) match {
         case MSome(result: BTSTransitionCondition) => MSome[BTSTransitionCondition](result)
         case MSome(_) => halt("Can only produce object of type BTSTransitionCondition")
         case _ => MNone[BTSTransitionCondition]()
        }
        return r
      case o: BTSExecuteConditionOtherwise =>
        val r: MOption[BTSTransitionCondition] = postBTSExecuteConditionOtherwise(o) match {
         case MSome(result: BTSTransitionCondition) => MSome[BTSTransitionCondition](result)
         case MSome(_) => halt("Can only produce object of type BTSTransitionCondition")
         case _ => MNone[BTSTransitionCondition]()
        }
        return r
      case o: BTSModeCondition =>
        val r: MOption[BTSTransitionCondition] = postBTSModeCondition(o) match {
         case MSome(result: BTSTransitionCondition) => MSome[BTSTransitionCondition](result)
         case MSome(_) => halt("Can only produce object of type BTSTransitionCondition")
         case _ => MNone[BTSTransitionCondition]()
        }
        return r
      case o: BTSInternalCondition =>
        val r: MOption[BTSTransitionCondition] = postBTSInternalCondition(o) match {
         case MSome(result: BTSTransitionCondition) => MSome[BTSTransitionCondition](result)
         case MSome(_) => halt("Can only produce object of type BTSTransitionCondition")
         case _ => MNone[BTSTransitionCondition]()
        }
        return r
    }
  }

  def postBTSDispatchCondition(o: BTSDispatchCondition): MOption[BTSDispatchCondition] = {
    return PostResultBTSDispatchCondition
  }

  def postBTSDispatchConjunction(o: BTSDispatchConjunction): MOption[BTSDispatchConjunction] = {
    return PostResultBTSDispatchConjunction
  }

  def postBTSDispatchTrigger(o: BTSDispatchTrigger): MOption[BTSDispatchTrigger] = {
    o match {
      case o: BTSDispatchTriggerStop =>
        val r: MOption[BTSDispatchTrigger] = postBTSDispatchTriggerStop(o) match {
         case MSome(result: BTSDispatchTrigger) => MSome[BTSDispatchTrigger](result)
         case MSome(_) => halt("Can only produce object of type BTSDispatchTrigger")
         case _ => MNone[BTSDispatchTrigger]()
        }
        return r
      case o: BTSDispatchTriggerPort =>
        val r: MOption[BTSDispatchTrigger] = postBTSDispatchTriggerPort(o) match {
         case MSome(result: BTSDispatchTrigger) => MSome[BTSDispatchTrigger](result)
         case MSome(_) => halt("Can only produce object of type BTSDispatchTrigger")
         case _ => MNone[BTSDispatchTrigger]()
        }
        return r
      case o: BTSDispatchTriggerTimeout =>
        val r: MOption[BTSDispatchTrigger] = postBTSDispatchTriggerTimeout(o) match {
         case MSome(result: BTSDispatchTrigger) => MSome[BTSDispatchTrigger](result)
         case MSome(_) => halt("Can only produce object of type BTSDispatchTrigger")
         case _ => MNone[BTSDispatchTrigger]()
        }
        return r
    }
  }

  def postBTSDispatchTriggerStop(o: BTSDispatchTriggerStop): MOption[BTSDispatchTriggerStop] = {
    return PostResultBTSDispatchTriggerStop
  }

  def postBTSDispatchTriggerPort(o: BTSDispatchTriggerPort): MOption[BTSDispatchTriggerPort] = {
    return PostResultBTSDispatchTriggerPort
  }

  def postBTSDispatchTriggerTimeout(o: BTSDispatchTriggerTimeout): MOption[BTSDispatchTriggerTimeout] = {
    return PostResultBTSDispatchTriggerTimeout
  }

  def postBTSExecuteCondition(o: BTSExecuteCondition): MOption[BTSExecuteCondition] = {
    o match {
      case o: BTSExecuteConditionExp =>
        val r: MOption[BTSExecuteCondition] = postBTSExecuteConditionExp(o) match {
         case MSome(result: BTSExecuteCondition) => MSome[BTSExecuteCondition](result)
         case MSome(_) => halt("Can only produce object of type BTSExecuteCondition")
         case _ => MNone[BTSExecuteCondition]()
        }
        return r
      case o: BTSExecuteConditionTimeout =>
        val r: MOption[BTSExecuteCondition] = postBTSExecuteConditionTimeout(o) match {
         case MSome(result: BTSExecuteCondition) => MSome[BTSExecuteCondition](result)
         case MSome(_) => halt("Can only produce object of type BTSExecuteCondition")
         case _ => MNone[BTSExecuteCondition]()
        }
        return r
      case o: BTSExecuteConditionOtherwise =>
        val r: MOption[BTSExecuteCondition] = postBTSExecuteConditionOtherwise(o) match {
         case MSome(result: BTSExecuteCondition) => MSome[BTSExecuteCondition](result)
         case MSome(_) => halt("Can only produce object of type BTSExecuteCondition")
         case _ => MNone[BTSExecuteCondition]()
        }
        return r
    }
  }

  def postBTSExecuteConditionExp(o: BTSExecuteConditionExp): MOption[BTSExecuteConditionExp] = {
    return PostResultBTSExecuteConditionExp
  }

  def postBTSExecuteConditionTimeout(o: BTSExecuteConditionTimeout): MOption[BTSExecuteConditionTimeout] = {
    return PostResultBTSExecuteConditionTimeout
  }

  def postBTSExecuteConditionOtherwise(o: BTSExecuteConditionOtherwise): MOption[BTSExecuteConditionOtherwise] = {
    return PostResultBTSExecuteConditionOtherwise
  }

  def postBTSModeCondition(o: BTSModeCondition): MOption[BTSModeCondition] = {
    return PostResultBTSModeCondition
  }

  def postBTSInternalCondition(o: BTSInternalCondition): MOption[BTSInternalCondition] = {
    return PostResultBTSInternalCondition
  }

  def postBTSAssertion(o: BTSAssertion): MOption[BTSAssertion] = {
    return PostResultBTSAssertion
  }

  def postBTSBehaviorActions(o: BTSBehaviorActions): MOption[BTSBehaviorActions] = {
    return PostResultBTSBehaviorActions
  }

  def postBTSAssertedAction(o: BTSAssertedAction): MOption[BTSAssertedAction] = {
    return PostResultBTSAssertedAction
  }

  def postBTSAction(o: BTSAction): MOption[BTSAction] = {
    o match {
      case o: BTSSkipAction =>
        val r: MOption[BTSAction] = postBTSSkipAction(o) match {
         case MSome(result: BTSAction) => MSome[BTSAction](result)
         case MSome(_) => halt("Can only produce object of type BTSAction")
         case _ => MNone[BTSAction]()
        }
        return r
      case o: BTSAssignmentAction =>
        val r: MOption[BTSAction] = postBTSAssignmentAction(o) match {
         case MSome(result: BTSAction) => MSome[BTSAction](result)
         case MSome(_) => halt("Can only produce object of type BTSAction")
         case _ => MNone[BTSAction]()
        }
        return r
      case o: BTSSubprogramCallAction =>
        val r: MOption[BTSAction] = postBTSSubprogramCallAction(o) match {
         case MSome(result: BTSAction) => MSome[BTSAction](result)
         case MSome(_) => halt("Can only produce object of type BTSAction")
         case _ => MNone[BTSAction]()
        }
        return r
      case o: BTSPortOutAction =>
        val r: MOption[BTSAction] = postBTSPortOutAction(o) match {
         case MSome(result: BTSAction) => MSome[BTSAction](result)
         case MSome(_) => halt("Can only produce object of type BTSAction")
         case _ => MNone[BTSAction]()
        }
        return r
      case o: BTSPortInAction =>
        val r: MOption[BTSAction] = postBTSPortInAction(o) match {
         case MSome(result: BTSAction) => MSome[BTSAction](result)
         case MSome(_) => halt("Can only produce object of type BTSAction")
         case _ => MNone[BTSAction]()
        }
        return r
      case o: BTSFrozenPortAction =>
        val r: MOption[BTSAction] = postBTSFrozenPortAction(o) match {
         case MSome(result: BTSAction) => MSome[BTSAction](result)
         case MSome(_) => halt("Can only produce object of type BTSAction")
         case _ => MNone[BTSAction]()
        }
        return r
      case o: BTSIfBLESSAction =>
        val r: MOption[BTSAction] = postBTSIfBLESSAction(o) match {
         case MSome(result: BTSAction) => MSome[BTSAction](result)
         case MSome(_) => halt("Can only produce object of type BTSAction")
         case _ => MNone[BTSAction]()
        }
        return r
      case o: BTSIfBAAction =>
        val r: MOption[BTSAction] = postBTSIfBAAction(o) match {
         case MSome(result: BTSAction) => MSome[BTSAction](result)
         case MSome(_) => halt("Can only produce object of type BTSAction")
         case _ => MNone[BTSAction]()
        }
        return r
      case o: BTSExistentialLatticeQuantification =>
        val r: MOption[BTSAction] = postBTSExistentialLatticeQuantification(o) match {
         case MSome(result: BTSAction) => MSome[BTSAction](result)
         case MSome(_) => halt("Can only produce object of type BTSAction")
         case _ => MNone[BTSAction]()
        }
        return r
      case o: BTSUniversalLatticeQuantification =>
        val r: MOption[BTSAction] = postBTSUniversalLatticeQuantification(o) match {
         case MSome(result: BTSAction) => MSome[BTSAction](result)
         case MSome(_) => halt("Can only produce object of type BTSAction")
         case _ => MNone[BTSAction]()
        }
        return r
    }
  }

  def postBTSBasicAction(o: BTSBasicAction): MOption[BTSBasicAction] = {
    o match {
      case o: BTSSkipAction =>
        val r: MOption[BTSBasicAction] = postBTSSkipAction(o) match {
         case MSome(result: BTSBasicAction) => MSome[BTSBasicAction](result)
         case MSome(_) => halt("Can only produce object of type BTSBasicAction")
         case _ => MNone[BTSBasicAction]()
        }
        return r
      case o: BTSAssignmentAction =>
        val r: MOption[BTSBasicAction] = postBTSAssignmentAction(o) match {
         case MSome(result: BTSBasicAction) => MSome[BTSBasicAction](result)
         case MSome(_) => halt("Can only produce object of type BTSBasicAction")
         case _ => MNone[BTSBasicAction]()
        }
        return r
      case o: BTSSubprogramCallAction =>
        val r: MOption[BTSBasicAction] = postBTSSubprogramCallAction(o) match {
         case MSome(result: BTSBasicAction) => MSome[BTSBasicAction](result)
         case MSome(_) => halt("Can only produce object of type BTSBasicAction")
         case _ => MNone[BTSBasicAction]()
        }
        return r
      case o: BTSPortOutAction =>
        val r: MOption[BTSBasicAction] = postBTSPortOutAction(o) match {
         case MSome(result: BTSBasicAction) => MSome[BTSBasicAction](result)
         case MSome(_) => halt("Can only produce object of type BTSBasicAction")
         case _ => MNone[BTSBasicAction]()
        }
        return r
      case o: BTSPortInAction =>
        val r: MOption[BTSBasicAction] = postBTSPortInAction(o) match {
         case MSome(result: BTSBasicAction) => MSome[BTSBasicAction](result)
         case MSome(_) => halt("Can only produce object of type BTSBasicAction")
         case _ => MNone[BTSBasicAction]()
        }
        return r
      case o: BTSFrozenPortAction =>
        val r: MOption[BTSBasicAction] = postBTSFrozenPortAction(o) match {
         case MSome(result: BTSBasicAction) => MSome[BTSBasicAction](result)
         case MSome(_) => halt("Can only produce object of type BTSBasicAction")
         case _ => MNone[BTSBasicAction]()
        }
        return r
    }
  }

  def postBTSSkipAction(o: BTSSkipAction): MOption[BTSSkipAction] = {
    return PostResultBTSSkipAction
  }

  def postBTSAssignmentAction(o: BTSAssignmentAction): MOption[BTSAssignmentAction] = {
    return PostResultBTSAssignmentAction
  }

  def postBTSCommunicationAction(o: BTSCommunicationAction): MOption[BTSCommunicationAction] = {
    o match {
      case o: BTSSubprogramCallAction =>
        val r: MOption[BTSCommunicationAction] = postBTSSubprogramCallAction(o) match {
         case MSome(result: BTSCommunicationAction) => MSome[BTSCommunicationAction](result)
         case MSome(_) => halt("Can only produce object of type BTSCommunicationAction")
         case _ => MNone[BTSCommunicationAction]()
        }
        return r
      case o: BTSPortOutAction =>
        val r: MOption[BTSCommunicationAction] = postBTSPortOutAction(o) match {
         case MSome(result: BTSCommunicationAction) => MSome[BTSCommunicationAction](result)
         case MSome(_) => halt("Can only produce object of type BTSCommunicationAction")
         case _ => MNone[BTSCommunicationAction]()
        }
        return r
      case o: BTSPortInAction =>
        val r: MOption[BTSCommunicationAction] = postBTSPortInAction(o) match {
         case MSome(result: BTSCommunicationAction) => MSome[BTSCommunicationAction](result)
         case MSome(_) => halt("Can only produce object of type BTSCommunicationAction")
         case _ => MNone[BTSCommunicationAction]()
        }
        return r
      case o: BTSFrozenPortAction =>
        val r: MOption[BTSCommunicationAction] = postBTSFrozenPortAction(o) match {
         case MSome(result: BTSCommunicationAction) => MSome[BTSCommunicationAction](result)
         case MSome(_) => halt("Can only produce object of type BTSCommunicationAction")
         case _ => MNone[BTSCommunicationAction]()
        }
        return r
    }
  }

  def postBTSSubprogramCallAction(o: BTSSubprogramCallAction): MOption[BTSSubprogramCallAction] = {
    return PostResultBTSSubprogramCallAction
  }

  def postBTSPortOutAction(o: BTSPortOutAction): MOption[BTSPortOutAction] = {
    return PostResultBTSPortOutAction
  }

  def postBTSPortInAction(o: BTSPortInAction): MOption[BTSPortInAction] = {
    return PostResultBTSPortInAction
  }

  def postBTSFrozenPortAction(o: BTSFrozenPortAction): MOption[BTSFrozenPortAction] = {
    return PostResultBTSFrozenPortAction
  }

  def postBTSControlAction(o: BTSControlAction): MOption[BTSControlAction] = {
    o match {
      case o: BTSIfBLESSAction =>
        val r: MOption[BTSControlAction] = postBTSIfBLESSAction(o) match {
         case MSome(result: BTSControlAction) => MSome[BTSControlAction](result)
         case MSome(_) => halt("Can only produce object of type BTSControlAction")
         case _ => MNone[BTSControlAction]()
        }
        return r
      case o: BTSIfBAAction =>
        val r: MOption[BTSControlAction] = postBTSIfBAAction(o) match {
         case MSome(result: BTSControlAction) => MSome[BTSControlAction](result)
         case MSome(_) => halt("Can only produce object of type BTSControlAction")
         case _ => MNone[BTSControlAction]()
        }
        return r
    }
  }

  def postBTSIfBLESSAction(o: BTSIfBLESSAction): MOption[BTSIfBLESSAction] = {
    return PostResultBTSIfBLESSAction
  }

  def postBTSGuardedAction(o: BTSGuardedAction): MOption[BTSGuardedAction] = {
    return PostResultBTSGuardedAction
  }

  def postBTSIfBAAction(o: BTSIfBAAction): MOption[BTSIfBAAction] = {
    return PostResultBTSIfBAAction
  }

  def postBTSConditionalActions(o: BTSConditionalActions): MOption[BTSConditionalActions] = {
    return PostResultBTSConditionalActions
  }

  def postBTSQuantificationActions(o: BTSQuantificationActions): MOption[BTSQuantificationActions] = {
    o match {
      case o: BTSExistentialLatticeQuantification =>
        val r: MOption[BTSQuantificationActions] = postBTSExistentialLatticeQuantification(o) match {
         case MSome(result: BTSQuantificationActions) => MSome[BTSQuantificationActions](result)
         case MSome(_) => halt("Can only produce object of type BTSQuantificationActions")
         case _ => MNone[BTSQuantificationActions]()
        }
        return r
      case o: BTSUniversalLatticeQuantification =>
        val r: MOption[BTSQuantificationActions] = postBTSUniversalLatticeQuantification(o) match {
         case MSome(result: BTSQuantificationActions) => MSome[BTSQuantificationActions](result)
         case MSome(_) => halt("Can only produce object of type BTSQuantificationActions")
         case _ => MNone[BTSQuantificationActions]()
        }
        return r
    }
  }

  def postBTSExistentialLatticeQuantification(o: BTSExistentialLatticeQuantification): MOption[BTSExistentialLatticeQuantification] = {
    return PostResultBTSExistentialLatticeQuantification
  }

  def postBTSUniversalLatticeQuantification(o: BTSUniversalLatticeQuantification): MOption[BTSUniversalLatticeQuantification] = {
    return PostResultBTSUniversalLatticeQuantification
  }

  def postBTSExp(o: BTSExp): MOption[BTSExp] = {
    o match {
      case o: BTSUnaryExp =>
        val r: MOption[BTSExp] = postBTSUnaryExp(o) match {
         case MSome(result: BTSExp) => MSome[BTSExp](result)
         case MSome(_) => halt("Can only produce object of type BTSExp")
         case _ => MNone[BTSExp]()
        }
        return r
      case o: BTSBinaryExp =>
        val r: MOption[BTSExp] = postBTSBinaryExp(o) match {
         case MSome(result: BTSExp) => MSome[BTSExp](result)
         case MSome(_) => halt("Can only produce object of type BTSExp")
         case _ => MNone[BTSExp]()
        }
        return r
      case o: BTSLiteralExp =>
        val r: MOption[BTSExp] = postBTSLiteralExp(o) match {
         case MSome(result: BTSExp) => MSome[BTSExp](result)
         case MSome(_) => halt("Can only produce object of type BTSExp")
         case _ => MNone[BTSExp]()
        }
        return r
      case o: BTSNameExp =>
        val r: MOption[BTSExp] = postBTSNameExp(o) match {
         case MSome(result: BTSExp) => MSome[BTSExp](result)
         case MSome(_) => halt("Can only produce object of type BTSExp")
         case _ => MNone[BTSExp]()
        }
        return r
      case o: BTSIndexingExp =>
        val r: MOption[BTSExp] = postBTSIndexingExp(o) match {
         case MSome(result: BTSExp) => MSome[BTSExp](result)
         case MSome(_) => halt("Can only produce object of type BTSExp")
         case _ => MNone[BTSExp]()
        }
        return r
      case o: BTSAccessExp =>
        val r: MOption[BTSExp] = postBTSAccessExp(o) match {
         case MSome(result: BTSExp) => MSome[BTSExp](result)
         case MSome(_) => halt("Can only produce object of type BTSExp")
         case _ => MNone[BTSExp]()
        }
        return r
      case o: BTSFunctionCall =>
        val r: MOption[BTSExp] = postBTSFunctionCall(o) match {
         case MSome(result: BTSExp) => MSome[BTSExp](result)
         case MSome(_) => halt("Can only produce object of type BTSExp")
         case _ => MNone[BTSExp]()
        }
        return r
    }
  }

  def postBTSUnaryExp(o: BTSUnaryExp): MOption[BTSUnaryExp] = {
    return PostResultBTSUnaryExp
  }

  def postBTSBinaryExp(o: BTSBinaryExp): MOption[BTSBinaryExp] = {
    return PostResultBTSBinaryExp
  }

  def postBTSLiteralExp(o: BTSLiteralExp): MOption[BTSLiteralExp] = {
    return PostResultBTSLiteralExp
  }

  def postBTSNameExp(o: BTSNameExp): MOption[BTSNameExp] = {
    return PostResultBTSNameExp
  }

  def postBTSIndexingExp(o: BTSIndexingExp): MOption[BTSIndexingExp] = {
    return PostResultBTSIndexingExp
  }

  def postBTSAccessExp(o: BTSAccessExp): MOption[BTSAccessExp] = {
    return PostResultBTSAccessExp
  }

  def postBTSFunctionCall(o: BTSFunctionCall): MOption[BTSFunctionCall] = {
    return PostResultBTSFunctionCall
  }

  def postBTSFormalExpPair(o: BTSFormalExpPair): MOption[BTSFormalExpPair] = {
    return PostResultBTSFormalExpPair
  }

  def postBTSBehaviorTime(o: BTSBehaviorTime): MOption[BTSBehaviorTime] = {
    return PostResultBTSBehaviorTime
  }

  def postTODO(o: TODO): MOption[TODO] = {
    return PostResultTODO
  }

  def postAttr(o: Attr): MOption[Attr] = {
    return PostResultAttr
  }

  def transform_langastTopUnit(o: org.sireum.lang.ast.TopUnit): MOption[org.sireum.lang.ast.TopUnit] = {
    val preR: PreResult[org.sireum.lang.ast.TopUnit] = pre_langastTopUnit(o)
    val r: MOption[org.sireum.lang.ast.TopUnit] = if (preR.continu) {
      val o2: org.sireum.lang.ast.TopUnit = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[org.sireum.lang.ast.TopUnit] = o2 match {
        case o2: org.sireum.lang.ast.TopUnit.Program =>
          val r0: MOption[org.sireum.lang.ast.Name] = transform_langastName(o2.packageName)
          val r1: MOption[org.sireum.lang.ast.Body] = transform_langastBody(o2.body)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(packageName = r0.getOrElse(o2.packageName), body = r1.getOrElse(o2.body)))
          else
            MNone()
        case o2: org.sireum.lang.ast.TopUnit.SequentUnit =>
          val r0: MOption[org.sireum.lang.ast.Sequent] = transform_langastSequent(o2.sequent)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(sequent = r0.getOrElse(o2.sequent)))
          else
            MNone()
        case o2: org.sireum.lang.ast.TopUnit.TruthTableUnit =>
          val r0: MOption[IS[Z, org.sireum.lang.ast.Id]] = transformISZ(o2.vars, transform_langastId _)
          val r1: MOption[org.sireum.lang.ast.Sequent] = transform_langastSequent(o2.sequent)
          val r2: MOption[IS[Z, org.sireum.lang.ast.TruthTable.Row]] = transformISZ(o2.rows, transform_langastTruthTableRow _)
          val r3: MOption[Option[org.sireum.lang.ast.TruthTable.Conclusion]] = transformOption(o2.conclusionOpt, transform_langastTruthTableConclusion _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
            MSome(o2(vars = r0.getOrElse(o2.vars), sequent = r1.getOrElse(o2.sequent), rows = r2.getOrElse(o2.rows), conclusionOpt = r3.getOrElse(o2.conclusionOpt)))
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
    val o2: org.sireum.lang.ast.TopUnit = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.TopUnit] = post_langastTopUnit(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastStmt(o: org.sireum.lang.ast.Stmt): MOption[org.sireum.lang.ast.Stmt] = {
    val preR: PreResult[org.sireum.lang.ast.Stmt] = pre_langastStmt(o)
    val r: MOption[org.sireum.lang.ast.Stmt] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Stmt = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[org.sireum.lang.ast.Stmt] = o2 match {
        case o2: org.sireum.lang.ast.Stmt.Import =>
          val r0: MOption[IS[Z, org.sireum.lang.ast.Stmt.Import.Importer]] = transformISZ(o2.importers, transform_langastStmtImportImporter _)
          val r1: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(importers = r0.getOrElse(o2.importers), attr = r1.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.Var =>
          val r0: MOption[org.sireum.lang.ast.Id] = transform_langastId(o2.id)
          val r1: MOption[Option[org.sireum.lang.ast.Type]] = transformOption(o2.tipeOpt, transform_langastType _)
          val r2: MOption[Option[org.sireum.lang.ast.AssignExp]] = transformOption(o2.initOpt, transform_langastAssignExp _)
          val r3: MOption[org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), tipeOpt = r1.getOrElse(o2.tipeOpt), initOpt = r2.getOrElse(o2.initOpt), attr = r3.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.VarPattern =>
          val r0: MOption[org.sireum.lang.ast.Pattern] = transform_langastPattern(o2.pattern)
          val r1: MOption[Option[org.sireum.lang.ast.Type]] = transformOption(o2.tipeOpt, transform_langastType _)
          val r2: MOption[org.sireum.lang.ast.AssignExp] = transform_langastAssignExp(o2.init)
          val r3: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
            MSome(o2(pattern = r0.getOrElse(o2.pattern), tipeOpt = r1.getOrElse(o2.tipeOpt), init = r2.getOrElse(o2.init), attr = r3.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.SpecVar =>
          val r0: MOption[org.sireum.lang.ast.Id] = transform_langastId(o2.id)
          val r1: MOption[org.sireum.lang.ast.Type] = transform_langastType(o2.tipe)
          val r2: MOption[org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), tipe = r1.getOrElse(o2.tipe), attr = r2.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.Method =>
          val r0: MOption[org.sireum.lang.ast.MethodSig] = transform_langastMethodSig(o2.sig)
          val r1: MOption[org.sireum.lang.ast.MethodContract] = transform_langastMethodContract(o2.mcontract)
          val r2: MOption[Option[org.sireum.lang.ast.Body]] = transformOption(o2.bodyOpt, transform_langastBody _)
          val r3: MOption[org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
            MSome(o2(sig = r0.getOrElse(o2.sig), mcontract = r1.getOrElse(o2.mcontract), bodyOpt = r2.getOrElse(o2.bodyOpt), attr = r3.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.ExtMethod =>
          val r0: MOption[org.sireum.lang.ast.MethodSig] = transform_langastMethodSig(o2.sig)
          val r1: MOption[org.sireum.lang.ast.MethodContract] = transform_langastMethodContract(o2.contract)
          val r2: MOption[org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(sig = r0.getOrElse(o2.sig), contract = r1.getOrElse(o2.contract), attr = r2.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.JustMethod =>
          val r0: MOption[Option[org.sireum.lang.ast.Exp.LitString]] = transformOption(o2.etaOpt, transform_langastExpLitString _)
          val r1: MOption[org.sireum.lang.ast.MethodSig] = transform_langastMethodSig(o2.sig)
          val r2: MOption[org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(etaOpt = r0.getOrElse(o2.etaOpt), sig = r1.getOrElse(o2.sig), attr = r2.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.SpecMethod =>
          val r0: MOption[org.sireum.lang.ast.MethodSig] = transform_langastMethodSig(o2.sig)
          val r1: MOption[org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(sig = r0.getOrElse(o2.sig), attr = r1.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.Enum =>
          val r0: MOption[org.sireum.lang.ast.Id] = transform_langastId(o2.id)
          val r1: MOption[IS[Z, org.sireum.lang.ast.Id]] = transformISZ(o2.elements, transform_langastId _)
          val r2: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), elements = r1.getOrElse(o2.elements), attr = r2.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.SubZ =>
          val r0: MOption[org.sireum.lang.ast.Id] = transform_langastId(o2.id)
          val r1: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), attr = r1.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.Object =>
          val r0: MOption[org.sireum.lang.ast.Id] = transform_langastId(o2.id)
          val r1: MOption[IS[Z, org.sireum.lang.ast.Stmt]] = transformISZ(o2.stmts, transform_langastStmt _)
          val r2: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), stmts = r1.getOrElse(o2.stmts), attr = r2.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.Sig =>
          val r0: MOption[org.sireum.lang.ast.Id] = transform_langastId(o2.id)
          val r1: MOption[IS[Z, org.sireum.lang.ast.TypeParam]] = transformISZ(o2.typeParams, transform_langastTypeParam _)
          val r2: MOption[IS[Z, org.sireum.lang.ast.Type.Named]] = transformISZ(o2.parents, transform_langastTypeNamed _)
          val r3: MOption[IS[Z, org.sireum.lang.ast.Stmt]] = transformISZ(o2.stmts, transform_langastStmt _)
          val r4: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), typeParams = r1.getOrElse(o2.typeParams), parents = r2.getOrElse(o2.parents), stmts = r3.getOrElse(o2.stmts), attr = r4.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.Adt =>
          val r0: MOption[org.sireum.lang.ast.Id] = transform_langastId(o2.id)
          val r1: MOption[IS[Z, org.sireum.lang.ast.TypeParam]] = transformISZ(o2.typeParams, transform_langastTypeParam _)
          val r2: MOption[IS[Z, org.sireum.lang.ast.AdtParam]] = transformISZ(o2.params, transform_langastAdtParam _)
          val r3: MOption[IS[Z, org.sireum.lang.ast.Type.Named]] = transformISZ(o2.parents, transform_langastTypeNamed _)
          val r4: MOption[IS[Z, org.sireum.lang.ast.Stmt]] = transformISZ(o2.stmts, transform_langastStmt _)
          val r5: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty || r5.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), typeParams = r1.getOrElse(o2.typeParams), params = r2.getOrElse(o2.params), parents = r3.getOrElse(o2.parents), stmts = r4.getOrElse(o2.stmts), attr = r5.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.TypeAlias =>
          val r0: MOption[org.sireum.lang.ast.Id] = transform_langastId(o2.id)
          val r1: MOption[IS[Z, org.sireum.lang.ast.TypeParam]] = transformISZ(o2.typeParams, transform_langastTypeParam _)
          val r2: MOption[org.sireum.lang.ast.Type] = transform_langastType(o2.tipe)
          val r3: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), typeParams = r1.getOrElse(o2.typeParams), tipe = r2.getOrElse(o2.tipe), attr = r3.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.Assign =>
          val r0: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.lhs)
          val r1: MOption[org.sireum.lang.ast.AssignExp] = transform_langastAssignExp(o2.rhs)
          val r2: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(lhs = r0.getOrElse(o2.lhs), rhs = r1.getOrElse(o2.rhs), attr = r2.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.Block =>
          val r0: MOption[org.sireum.lang.ast.Body] = transform_langastBody(o2.body)
          val r1: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(body = r0.getOrElse(o2.body), attr = r1.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.If =>
          val r0: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.cond)
          val r1: MOption[org.sireum.lang.ast.Body] = transform_langastBody(o2.thenBody)
          val r2: MOption[org.sireum.lang.ast.Body] = transform_langastBody(o2.elseBody)
          val r3: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
            MSome(o2(cond = r0.getOrElse(o2.cond), thenBody = r1.getOrElse(o2.thenBody), elseBody = r2.getOrElse(o2.elseBody), attr = r3.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.Match =>
          val r0: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.exp)
          val r1: MOption[IS[Z, org.sireum.lang.ast.Case]] = transformISZ(o2.cases, transform_langastCase _)
          val r2: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(exp = r0.getOrElse(o2.exp), cases = r1.getOrElse(o2.cases), attr = r2.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.While =>
          val r0: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.cond)
          val r1: MOption[org.sireum.lang.ast.LoopContract] = transform_langastLoopContract(o2.contract)
          val r2: MOption[org.sireum.lang.ast.Body] = transform_langastBody(o2.body)
          val r3: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
            MSome(o2(cond = r0.getOrElse(o2.cond), contract = r1.getOrElse(o2.contract), body = r2.getOrElse(o2.body), attr = r3.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.DoWhile =>
          val r0: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.cond)
          val r1: MOption[org.sireum.lang.ast.LoopContract] = transform_langastLoopContract(o2.contract)
          val r2: MOption[org.sireum.lang.ast.Body] = transform_langastBody(o2.body)
          val r3: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
            MSome(o2(cond = r0.getOrElse(o2.cond), contract = r1.getOrElse(o2.contract), body = r2.getOrElse(o2.body), attr = r3.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.For =>
          val r0: MOption[IS[Z, org.sireum.lang.ast.EnumGen.For]] = transformISZ(o2.enumGens, transform_langastEnumGenFor _)
          val r1: MOption[org.sireum.lang.ast.Body] = transform_langastBody(o2.body)
          val r2: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(enumGens = r0.getOrElse(o2.enumGens), body = r1.getOrElse(o2.body), attr = r2.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.Return =>
          val r0: MOption[Option[org.sireum.lang.ast.Exp]] = transformOption(o2.expOpt, transform_langastExp _)
          val r1: MOption[org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(expOpt = r0.getOrElse(o2.expOpt), attr = r1.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.Expr =>
          val r0: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.exp)
          val r1: MOption[org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(exp = r0.getOrElse(o2.exp), attr = r1.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.Fact =>
          val r0: MOption[org.sireum.lang.ast.Id] = transform_langastId(o2.id)
          val r1: MOption[IS[Z, org.sireum.lang.ast.TypeParam]] = transformISZ(o2.typeParams, transform_langastTypeParam _)
          val r2: MOption[Option[org.sireum.lang.ast.Exp.LitString]] = transformOption(o2.descOpt, transform_langastExpLitString _)
          val r3: MOption[IS[Z, org.sireum.lang.ast.Exp]] = transformISZ(o2.claims, transform_langastExp _)
          val r4: MOption[org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), typeParams = r1.getOrElse(o2.typeParams), descOpt = r2.getOrElse(o2.descOpt), claims = r3.getOrElse(o2.claims), attr = r4.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.Inv =>
          val r0: MOption[org.sireum.lang.ast.Id] = transform_langastId(o2.id)
          val r1: MOption[IS[Z, org.sireum.lang.ast.Exp]] = transformISZ(o2.claims, transform_langastExp _)
          val r2: MOption[org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), claims = r1.getOrElse(o2.claims), attr = r2.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.Theorem =>
          val r0: MOption[org.sireum.lang.ast.Id] = transform_langastId(o2.id)
          val r1: MOption[IS[Z, org.sireum.lang.ast.TypeParam]] = transformISZ(o2.typeParams, transform_langastTypeParam _)
          val r2: MOption[Option[org.sireum.lang.ast.Exp.LitString]] = transformOption(o2.descOpt, transform_langastExpLitString _)
          val r3: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.claim)
          val r4: MOption[org.sireum.lang.ast.ProofAst] = transform_langastProofAst(o2.proof)
          val r5: MOption[org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty || r5.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), typeParams = r1.getOrElse(o2.typeParams), descOpt = r2.getOrElse(o2.descOpt), claim = r3.getOrElse(o2.claim), proof = r4.getOrElse(o2.proof), attr = r5.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.DataRefinement =>
          val r0: MOption[org.sireum.lang.ast.Exp.Ident] = transform_langastExpIdent(o2.rep)
          val r1: MOption[IS[Z, org.sireum.lang.ast.Exp.Ident]] = transformISZ(o2.refs, transform_langastExpIdent _)
          val r2: MOption[IS[Z, org.sireum.lang.ast.Exp]] = transformISZ(o2.claims, transform_langastExp _)
          val r3: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
            MSome(o2(rep = r0.getOrElse(o2.rep), refs = r1.getOrElse(o2.refs), claims = r2.getOrElse(o2.claims), attr = r3.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.SpecLabel =>
          val r0: MOption[org.sireum.lang.ast.Id] = transform_langastId(o2.id)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.SpecBlock =>
          val r0: MOption[org.sireum.lang.ast.Stmt.Block] = transform_langastStmtBlock(o2.block)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(block = r0.getOrElse(o2.block)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.DeduceSequent =>
          val r0: MOption[Option[org.sireum.lang.ast.Exp.LitString]] = transformOption(o2.justOpt, transform_langastExpLitString _)
          val r1: MOption[IS[Z, org.sireum.lang.ast.Sequent]] = transformISZ(o2.sequents, transform_langastSequent _)
          val r2: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(justOpt = r0.getOrElse(o2.justOpt), sequents = r1.getOrElse(o2.sequents), attr = r2.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.DeduceSteps =>
          val r0: MOption[IS[Z, org.sireum.lang.ast.ProofAst.Step]] = transformISZ(o2.steps, transform_langastProofAstStep _)
          val r1: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(steps = r0.getOrElse(o2.steps), attr = r1.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.Havoc =>
          val r0: MOption[IS[Z, org.sireum.lang.ast.Exp.Ident]] = transformISZ(o2.args, transform_langastExpIdent _)
          val r1: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(args = r0.getOrElse(o2.args), attr = r1.getOrElse(o2.attr)))
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
    val o2: org.sireum.lang.ast.Stmt = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.Stmt] = post_langastStmt(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastHasModifies(o: org.sireum.lang.ast.HasModifies): MOption[org.sireum.lang.ast.HasModifies] = {
    val preR: PreResult[org.sireum.lang.ast.HasModifies] = pre_langastHasModifies(o)
    val r: MOption[org.sireum.lang.ast.HasModifies] = if (preR.continu) {
      val o2: org.sireum.lang.ast.HasModifies = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[org.sireum.lang.ast.HasModifies] = o2 match {
        case o2: org.sireum.lang.ast.LoopContract =>
          val r0: MOption[IS[Z, org.sireum.lang.ast.Exp]] = transformISZ(o2.invariants, transform_langastExp _)
          val r1: MOption[IS[Z, org.sireum.lang.ast.Exp.Ident]] = transformISZ(o2.modifies, transform_langastExpIdent _)
          val r2: MOption[Option[org.sireum.lang.ast.Exp.LitZ]] = transformOption(o2.maxItOpt, transform_langastExpLitZ _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(invariants = r0.getOrElse(o2.invariants), modifies = r1.getOrElse(o2.modifies), maxItOpt = r2.getOrElse(o2.maxItOpt)))
          else
            MNone()
        case o2: org.sireum.lang.ast.MethodContract.Simple =>
          val r0: MOption[org.sireum.lang.ast.MethodContract.Accesses] = transform_langastMethodContractAccesses(o2.readsClause)
          val r1: MOption[org.sireum.lang.ast.MethodContract.Claims] = transform_langastMethodContractClaims(o2.requiresClause)
          val r2: MOption[org.sireum.lang.ast.MethodContract.Accesses] = transform_langastMethodContractAccesses(o2.modifiesClause)
          val r3: MOption[org.sireum.lang.ast.MethodContract.Claims] = transform_langastMethodContractClaims(o2.ensuresClause)
          val r4: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
            MSome(o2(readsClause = r0.getOrElse(o2.readsClause), requiresClause = r1.getOrElse(o2.requiresClause), modifiesClause = r2.getOrElse(o2.modifiesClause), ensuresClause = r3.getOrElse(o2.ensuresClause), attr = r4.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.MethodContract.Cases =>
          val r0: MOption[org.sireum.lang.ast.MethodContract.Accesses] = transform_langastMethodContractAccesses(o2.readsClause)
          val r1: MOption[org.sireum.lang.ast.MethodContract.Accesses] = transform_langastMethodContractAccesses(o2.modifiesClause)
          val r2: MOption[IS[Z, org.sireum.lang.ast.MethodContract.Case]] = transformISZ(o2.cases, transform_langastMethodContractCase _)
          val r3: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
            MSome(o2(readsClause = r0.getOrElse(o2.readsClause), modifiesClause = r1.getOrElse(o2.modifiesClause), cases = r2.getOrElse(o2.cases), attr = r3.getOrElse(o2.attr)))
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
    val o2: org.sireum.lang.ast.HasModifies = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.HasModifies] = post_langastHasModifies(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastLoopContract(o: org.sireum.lang.ast.LoopContract): MOption[org.sireum.lang.ast.LoopContract] = {
    val preR: PreResult[org.sireum.lang.ast.LoopContract] = pre_langastLoopContract(o)
    val r: MOption[org.sireum.lang.ast.LoopContract] = if (preR.continu) {
      val o2: org.sireum.lang.ast.LoopContract = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, org.sireum.lang.ast.Exp]] = transformISZ(o2.invariants, transform_langastExp _)
      val r1: MOption[IS[Z, org.sireum.lang.ast.Exp.Ident]] = transformISZ(o2.modifies, transform_langastExpIdent _)
      val r2: MOption[Option[org.sireum.lang.ast.Exp.LitZ]] = transformOption(o2.maxItOpt, transform_langastExpLitZ _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(invariants = r0.getOrElse(o2.invariants), modifies = r1.getOrElse(o2.modifies), maxItOpt = r2.getOrElse(o2.maxItOpt)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.LoopContract = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.LoopContract] = post_langastLoopContract(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastStmtImportImporter(o: org.sireum.lang.ast.Stmt.Import.Importer): MOption[org.sireum.lang.ast.Stmt.Import.Importer] = {
    val preR: PreResult[org.sireum.lang.ast.Stmt.Import.Importer] = pre_langastStmtImportImporter(o)
    val r: MOption[org.sireum.lang.ast.Stmt.Import.Importer] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Stmt.Import.Importer = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[org.sireum.lang.ast.Name] = transform_langastName(o2.name)
      val r1: MOption[Option[org.sireum.lang.ast.Stmt.Import.Selector]] = transformOption(o2.selectorOpt, transform_langastStmtImportSelector _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(name = r0.getOrElse(o2.name), selectorOpt = r1.getOrElse(o2.selectorOpt)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.Stmt.Import.Importer = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.Stmt.Import.Importer] = post_langastStmtImportImporter(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastStmtImportSelector(o: org.sireum.lang.ast.Stmt.Import.Selector): MOption[org.sireum.lang.ast.Stmt.Import.Selector] = {
    val preR: PreResult[org.sireum.lang.ast.Stmt.Import.Selector] = pre_langastStmtImportSelector(o)
    val r: MOption[org.sireum.lang.ast.Stmt.Import.Selector] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Stmt.Import.Selector = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[org.sireum.lang.ast.Stmt.Import.Selector] = o2 match {
        case o2: org.sireum.lang.ast.Stmt.Import.MultiSelector =>
          val r0: MOption[IS[Z, org.sireum.lang.ast.Stmt.Import.NamedSelector]] = transformISZ(o2.selectors, transform_langastStmtImportNamedSelector _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(selectors = r0.getOrElse(o2.selectors)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.Import.WildcardSelector =>
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
    val o2: org.sireum.lang.ast.Stmt.Import.Selector = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.Stmt.Import.Selector] = post_langastStmtImportSelector(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastStmtImportNamedSelector(o: org.sireum.lang.ast.Stmt.Import.NamedSelector): MOption[org.sireum.lang.ast.Stmt.Import.NamedSelector] = {
    val preR: PreResult[org.sireum.lang.ast.Stmt.Import.NamedSelector] = pre_langastStmtImportNamedSelector(o)
    val r: MOption[org.sireum.lang.ast.Stmt.Import.NamedSelector] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Stmt.Import.NamedSelector = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[org.sireum.lang.ast.Id] = transform_langastId(o2.from)
      val r1: MOption[org.sireum.lang.ast.Id] = transform_langastId(o2.to)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(from = r0.getOrElse(o2.from), to = r1.getOrElse(o2.to)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.Stmt.Import.NamedSelector = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.Stmt.Import.NamedSelector] = post_langastStmtImportNamedSelector(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastStmtSpec(o: org.sireum.lang.ast.Stmt.Spec): MOption[org.sireum.lang.ast.Stmt.Spec] = {
    val preR: PreResult[org.sireum.lang.ast.Stmt.Spec] = pre_langastStmtSpec(o)
    val r: MOption[org.sireum.lang.ast.Stmt.Spec] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Stmt.Spec = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[org.sireum.lang.ast.Stmt.Spec] = o2 match {
        case o2: org.sireum.lang.ast.Stmt.Fact =>
          val r0: MOption[org.sireum.lang.ast.Id] = transform_langastId(o2.id)
          val r1: MOption[IS[Z, org.sireum.lang.ast.TypeParam]] = transformISZ(o2.typeParams, transform_langastTypeParam _)
          val r2: MOption[Option[org.sireum.lang.ast.Exp.LitString]] = transformOption(o2.descOpt, transform_langastExpLitString _)
          val r3: MOption[IS[Z, org.sireum.lang.ast.Exp]] = transformISZ(o2.claims, transform_langastExp _)
          val r4: MOption[org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), typeParams = r1.getOrElse(o2.typeParams), descOpt = r2.getOrElse(o2.descOpt), claims = r3.getOrElse(o2.claims), attr = r4.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.Inv =>
          val r0: MOption[org.sireum.lang.ast.Id] = transform_langastId(o2.id)
          val r1: MOption[IS[Z, org.sireum.lang.ast.Exp]] = transformISZ(o2.claims, transform_langastExp _)
          val r2: MOption[org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), claims = r1.getOrElse(o2.claims), attr = r2.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.Theorem =>
          val r0: MOption[org.sireum.lang.ast.Id] = transform_langastId(o2.id)
          val r1: MOption[IS[Z, org.sireum.lang.ast.TypeParam]] = transformISZ(o2.typeParams, transform_langastTypeParam _)
          val r2: MOption[Option[org.sireum.lang.ast.Exp.LitString]] = transformOption(o2.descOpt, transform_langastExpLitString _)
          val r3: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.claim)
          val r4: MOption[org.sireum.lang.ast.ProofAst] = transform_langastProofAst(o2.proof)
          val r5: MOption[org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty || r5.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), typeParams = r1.getOrElse(o2.typeParams), descOpt = r2.getOrElse(o2.descOpt), claim = r3.getOrElse(o2.claim), proof = r4.getOrElse(o2.proof), attr = r5.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.DataRefinement =>
          val r0: MOption[org.sireum.lang.ast.Exp.Ident] = transform_langastExpIdent(o2.rep)
          val r1: MOption[IS[Z, org.sireum.lang.ast.Exp.Ident]] = transformISZ(o2.refs, transform_langastExpIdent _)
          val r2: MOption[IS[Z, org.sireum.lang.ast.Exp]] = transformISZ(o2.claims, transform_langastExp _)
          val r3: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
            MSome(o2(rep = r0.getOrElse(o2.rep), refs = r1.getOrElse(o2.refs), claims = r2.getOrElse(o2.claims), attr = r3.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.SpecLabel =>
          val r0: MOption[org.sireum.lang.ast.Id] = transform_langastId(o2.id)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.SpecBlock =>
          val r0: MOption[org.sireum.lang.ast.Stmt.Block] = transform_langastStmtBlock(o2.block)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(block = r0.getOrElse(o2.block)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.DeduceSequent =>
          val r0: MOption[Option[org.sireum.lang.ast.Exp.LitString]] = transformOption(o2.justOpt, transform_langastExpLitString _)
          val r1: MOption[IS[Z, org.sireum.lang.ast.Sequent]] = transformISZ(o2.sequents, transform_langastSequent _)
          val r2: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(justOpt = r0.getOrElse(o2.justOpt), sequents = r1.getOrElse(o2.sequents), attr = r2.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.DeduceSteps =>
          val r0: MOption[IS[Z, org.sireum.lang.ast.ProofAst.Step]] = transformISZ(o2.steps, transform_langastProofAstStep _)
          val r1: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(steps = r0.getOrElse(o2.steps), attr = r1.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.Havoc =>
          val r0: MOption[IS[Z, org.sireum.lang.ast.Exp.Ident]] = transformISZ(o2.args, transform_langastExpIdent _)
          val r1: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(args = r0.getOrElse(o2.args), attr = r1.getOrElse(o2.attr)))
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
    val o2: org.sireum.lang.ast.Stmt.Spec = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.Stmt.Spec] = post_langastStmtSpec(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastMethodContract(o: org.sireum.lang.ast.MethodContract): MOption[org.sireum.lang.ast.MethodContract] = {
    val preR: PreResult[org.sireum.lang.ast.MethodContract] = pre_langastMethodContract(o)
    val r: MOption[org.sireum.lang.ast.MethodContract] = if (preR.continu) {
      val o2: org.sireum.lang.ast.MethodContract = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[org.sireum.lang.ast.MethodContract] = o2 match {
        case o2: org.sireum.lang.ast.MethodContract.Simple =>
          val r0: MOption[org.sireum.lang.ast.MethodContract.Accesses] = transform_langastMethodContractAccesses(o2.readsClause)
          val r1: MOption[org.sireum.lang.ast.MethodContract.Claims] = transform_langastMethodContractClaims(o2.requiresClause)
          val r2: MOption[org.sireum.lang.ast.MethodContract.Accesses] = transform_langastMethodContractAccesses(o2.modifiesClause)
          val r3: MOption[org.sireum.lang.ast.MethodContract.Claims] = transform_langastMethodContractClaims(o2.ensuresClause)
          val r4: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
            MSome(o2(readsClause = r0.getOrElse(o2.readsClause), requiresClause = r1.getOrElse(o2.requiresClause), modifiesClause = r2.getOrElse(o2.modifiesClause), ensuresClause = r3.getOrElse(o2.ensuresClause), attr = r4.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.MethodContract.Cases =>
          val r0: MOption[org.sireum.lang.ast.MethodContract.Accesses] = transform_langastMethodContractAccesses(o2.readsClause)
          val r1: MOption[org.sireum.lang.ast.MethodContract.Accesses] = transform_langastMethodContractAccesses(o2.modifiesClause)
          val r2: MOption[IS[Z, org.sireum.lang.ast.MethodContract.Case]] = transformISZ(o2.cases, transform_langastMethodContractCase _)
          val r3: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
            MSome(o2(readsClause = r0.getOrElse(o2.readsClause), modifiesClause = r1.getOrElse(o2.modifiesClause), cases = r2.getOrElse(o2.cases), attr = r3.getOrElse(o2.attr)))
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
    val o2: org.sireum.lang.ast.MethodContract = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.MethodContract] = post_langastMethodContract(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastMethodContractAccesses(o: org.sireum.lang.ast.MethodContract.Accesses): MOption[org.sireum.lang.ast.MethodContract.Accesses] = {
    val preR: PreResult[org.sireum.lang.ast.MethodContract.Accesses] = pre_langastMethodContractAccesses(o)
    val r: MOption[org.sireum.lang.ast.MethodContract.Accesses] = if (preR.continu) {
      val o2: org.sireum.lang.ast.MethodContract.Accesses = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, org.sireum.lang.ast.Exp.Ident]] = transformISZ(o2.idents, transform_langastExpIdent _)
      val r1: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(idents = r0.getOrElse(o2.idents), attr = r1.getOrElse(o2.attr)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.MethodContract.Accesses = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.MethodContract.Accesses] = post_langastMethodContractAccesses(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastMethodContractClaims(o: org.sireum.lang.ast.MethodContract.Claims): MOption[org.sireum.lang.ast.MethodContract.Claims] = {
    val preR: PreResult[org.sireum.lang.ast.MethodContract.Claims] = pre_langastMethodContractClaims(o)
    val r: MOption[org.sireum.lang.ast.MethodContract.Claims] = if (preR.continu) {
      val o2: org.sireum.lang.ast.MethodContract.Claims = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, org.sireum.lang.ast.Exp]] = transformISZ(o2.claims, transform_langastExp _)
      val r1: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(claims = r0.getOrElse(o2.claims), attr = r1.getOrElse(o2.attr)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.MethodContract.Claims = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.MethodContract.Claims] = post_langastMethodContractClaims(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastMethodContractCase(o: org.sireum.lang.ast.MethodContract.Case): MOption[org.sireum.lang.ast.MethodContract.Case] = {
    val preR: PreResult[org.sireum.lang.ast.MethodContract.Case] = pre_langastMethodContractCase(o)
    val r: MOption[org.sireum.lang.ast.MethodContract.Case] = if (preR.continu) {
      val o2: org.sireum.lang.ast.MethodContract.Case = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[org.sireum.lang.ast.Exp.LitString] = transform_langastExpLitString(o2.label)
      val r1: MOption[org.sireum.lang.ast.MethodContract.Claims] = transform_langastMethodContractClaims(o2.requiresClause)
      val r2: MOption[org.sireum.lang.ast.MethodContract.Claims] = transform_langastMethodContractClaims(o2.ensuresClause)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(label = r0.getOrElse(o2.label), requiresClause = r1.getOrElse(o2.requiresClause), ensuresClause = r2.getOrElse(o2.ensuresClause)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.MethodContract.Case = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.MethodContract.Case] = post_langastMethodContractCase(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastSequent(o: org.sireum.lang.ast.Sequent): MOption[org.sireum.lang.ast.Sequent] = {
    val preR: PreResult[org.sireum.lang.ast.Sequent] = pre_langastSequent(o)
    val r: MOption[org.sireum.lang.ast.Sequent] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Sequent = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, org.sireum.lang.ast.Exp]] = transformISZ(o2.premises, transform_langastExp _)
      val r1: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.conclusion)
      val r2: MOption[IS[Z, org.sireum.lang.ast.ProofAst.Step]] = transformISZ(o2.steps, transform_langastProofAstStep _)
      val r3: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
        MSome(o2(premises = r0.getOrElse(o2.premises), conclusion = r1.getOrElse(o2.conclusion), steps = r2.getOrElse(o2.steps), attr = r3.getOrElse(o2.attr)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.Sequent = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.Sequent] = post_langastSequent(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastProofAst(o: org.sireum.lang.ast.ProofAst): MOption[org.sireum.lang.ast.ProofAst] = {
    val preR: PreResult[org.sireum.lang.ast.ProofAst] = pre_langastProofAst(o)
    val r: MOption[org.sireum.lang.ast.ProofAst] = if (preR.continu) {
      val o2: org.sireum.lang.ast.ProofAst = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, org.sireum.lang.ast.ProofAst.Step]] = transformISZ(o2.steps, transform_langastProofAstStep _)
      val r1: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(steps = r0.getOrElse(o2.steps), attr = r1.getOrElse(o2.attr)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.ProofAst = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.ProofAst] = post_langastProofAst(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastProofAstStep(o: org.sireum.lang.ast.ProofAst.Step): MOption[org.sireum.lang.ast.ProofAst.Step] = {
    val preR: PreResult[org.sireum.lang.ast.ProofAst.Step] = pre_langastProofAstStep(o)
    val r: MOption[org.sireum.lang.ast.ProofAst.Step] = if (preR.continu) {
      val o2: org.sireum.lang.ast.ProofAst.Step = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[org.sireum.lang.ast.ProofAst.Step] = o2 match {
        case o2: org.sireum.lang.ast.ProofAst.Step.Regular =>
          val r0: MOption[org.sireum.lang.ast.ProofAst.StepId] = transform_langastProofAstStepId(o2.id)
          val r1: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.claim)
          val r2: MOption[org.sireum.lang.ast.ProofAst.Step.Justification] = transform_langastProofAstStepJustification(o2.just)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), claim = r1.getOrElse(o2.claim), just = r2.getOrElse(o2.just)))
          else
            MNone()
        case o2: org.sireum.lang.ast.ProofAst.Step.Assume =>
          val r0: MOption[org.sireum.lang.ast.ProofAst.StepId] = transform_langastProofAstStepId(o2.id)
          val r1: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.claim)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), claim = r1.getOrElse(o2.claim)))
          else
            MNone()
        case o2: org.sireum.lang.ast.ProofAst.Step.Assert =>
          val r0: MOption[org.sireum.lang.ast.ProofAst.StepId] = transform_langastProofAstStepId(o2.id)
          val r1: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.claim)
          val r2: MOption[IS[Z, org.sireum.lang.ast.ProofAst.Step]] = transformISZ(o2.steps, transform_langastProofAstStep _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), claim = r1.getOrElse(o2.claim), steps = r2.getOrElse(o2.steps)))
          else
            MNone()
        case o2: org.sireum.lang.ast.ProofAst.Step.SubProof =>
          val r0: MOption[org.sireum.lang.ast.ProofAst.StepId] = transform_langastProofAstStepId(o2.id)
          val r1: MOption[IS[Z, org.sireum.lang.ast.ProofAst.Step]] = transformISZ(o2.steps, transform_langastProofAstStep _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), steps = r1.getOrElse(o2.steps)))
          else
            MNone()
        case o2: org.sireum.lang.ast.ProofAst.Step.Let =>
          val r0: MOption[org.sireum.lang.ast.ProofAst.StepId] = transform_langastProofAstStepId(o2.id)
          val r1: MOption[IS[Z, org.sireum.lang.ast.ProofAst.Step.Let.Param]] = transformISZ(o2.params, transform_langastProofAstStepLetParam _)
          val r2: MOption[IS[Z, org.sireum.lang.ast.ProofAst.Step]] = transformISZ(o2.steps, transform_langastProofAstStep _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), params = r1.getOrElse(o2.params), steps = r2.getOrElse(o2.steps)))
          else
            MNone()
        case o2: org.sireum.lang.ast.ProofAst.Step.StructInduction =>
          val r0: MOption[org.sireum.lang.ast.ProofAst.StepId] = transform_langastProofAstStepId(o2.id)
          val r1: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.claim)
          val r2: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.exp)
          val r3: MOption[IS[Z, org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase]] = transformISZ(o2.cases, transform_langastProofAstStepStructInductionMatchCase _)
          val r4: MOption[Option[org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault]] = transformOption(o2.defaultOpt, transform_langastProofAstStepStructInductionMatchDefault _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), claim = r1.getOrElse(o2.claim), exp = r2.getOrElse(o2.exp), cases = r3.getOrElse(o2.cases), defaultOpt = r4.getOrElse(o2.defaultOpt)))
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
    val o2: org.sireum.lang.ast.ProofAst.Step = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.ProofAst.Step] = post_langastProofAstStep(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastProofAstStepId(o: org.sireum.lang.ast.ProofAst.StepId): MOption[org.sireum.lang.ast.ProofAst.StepId] = {
    val preR: PreResult[org.sireum.lang.ast.ProofAst.StepId] = pre_langastProofAstStepId(o)
    val r: MOption[org.sireum.lang.ast.ProofAst.StepId] = if (preR.continu) {
      val o2: org.sireum.lang.ast.ProofAst.StepId = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[org.sireum.lang.ast.ProofAst.StepId] = o2 match {
        case o2: org.sireum.lang.ast.ProofAst.StepId.Num =>
          val r0: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(attr = r0.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.ProofAst.StepId.Str =>
          val r0: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(attr = r0.getOrElse(o2.attr)))
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
    val o2: org.sireum.lang.ast.ProofAst.StepId = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.ProofAst.StepId] = post_langastProofAstStepId(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastProofAstStepLetParam(o: org.sireum.lang.ast.ProofAst.Step.Let.Param): MOption[org.sireum.lang.ast.ProofAst.Step.Let.Param] = {
    val preR: PreResult[org.sireum.lang.ast.ProofAst.Step.Let.Param] = pre_langastProofAstStepLetParam(o)
    val r: MOption[org.sireum.lang.ast.ProofAst.Step.Let.Param] = if (preR.continu) {
      val o2: org.sireum.lang.ast.ProofAst.Step.Let.Param = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[org.sireum.lang.ast.Id] = transform_langastId(o2.id)
      val r1: MOption[Option[org.sireum.lang.ast.Type]] = transformOption(o2.tipeOpt, transform_langastType _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(id = r0.getOrElse(o2.id), tipeOpt = r1.getOrElse(o2.tipeOpt)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.ProofAst.Step.Let.Param = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.ProofAst.Step.Let.Param] = post_langastProofAstStepLetParam(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastProofAstStepStructInductionMatchCase(o: org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase): MOption[org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase] = {
    val preR: PreResult[org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase] = pre_langastProofAstStepStructInductionMatchCase(o)
    val r: MOption[org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase] = if (preR.continu) {
      val o2: org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[org.sireum.lang.ast.Pattern.Structure] = transform_langastPatternStructure(o2.pattern)
      val r1: MOption[Option[org.sireum.lang.ast.ProofAst.Step.Assume]] = transformOption(o2.hypoOpt, transform_langastProofAstStepAssume _)
      val r2: MOption[IS[Z, org.sireum.lang.ast.ProofAst.Step]] = transformISZ(o2.steps, transform_langastProofAstStep _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(pattern = r0.getOrElse(o2.pattern), hypoOpt = r1.getOrElse(o2.hypoOpt), steps = r2.getOrElse(o2.steps)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase] = post_langastProofAstStepStructInductionMatchCase(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastProofAstStepStructInductionMatchDefault(o: org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault): MOption[org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault] = {
    val preR: PreResult[org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault] = pre_langastProofAstStepStructInductionMatchDefault(o)
    val r: MOption[org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault] = if (preR.continu) {
      val o2: org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Option[org.sireum.lang.ast.ProofAst.Step.Assume]] = transformOption(o2.hypoOpt, transform_langastProofAstStepAssume _)
      val r1: MOption[IS[Z, org.sireum.lang.ast.ProofAst.Step]] = transformISZ(o2.steps, transform_langastProofAstStep _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(hypoOpt = r0.getOrElse(o2.hypoOpt), steps = r1.getOrElse(o2.steps)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault] = post_langastProofAstStepStructInductionMatchDefault(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastProofAstStepJustification(o: org.sireum.lang.ast.ProofAst.Step.Justification): MOption[org.sireum.lang.ast.ProofAst.Step.Justification] = {
    val preR: PreResult[org.sireum.lang.ast.ProofAst.Step.Justification] = pre_langastProofAstStepJustification(o)
    val r: MOption[org.sireum.lang.ast.ProofAst.Step.Justification] = if (preR.continu) {
      val o2: org.sireum.lang.ast.ProofAst.Step.Justification = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[org.sireum.lang.ast.ProofAst.Step.Justification] = o2 match {
        case o2: org.sireum.lang.ast.ProofAst.Step.Justification.Apply =>
          val r0: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.id)
          val r1: MOption[IS[Z, org.sireum.lang.ast.Exp]] = transformISZ(o2.args, transform_langastExp _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), args = r1.getOrElse(o2.args)))
          else
            MNone()
        case o2: org.sireum.lang.ast.ProofAst.Step.Justification.Incept =>
          val r0: MOption[org.sireum.lang.ast.Exp.Invoke] = transform_langastExpInvoke(o2.invoke)
          val r1: MOption[IS[Z, org.sireum.lang.ast.ProofAst.StepId]] = transformISZ(o2.witnesses, transform_langastProofAstStepId _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(invoke = r0.getOrElse(o2.invoke), witnesses = r1.getOrElse(o2.witnesses)))
          else
            MNone()
        case o2: org.sireum.lang.ast.ProofAst.Step.Justification.InceptNamed =>
          val r0: MOption[org.sireum.lang.ast.Exp.InvokeNamed] = transform_langastExpInvokeNamed(o2.invoke)
          val r1: MOption[IS[Z, org.sireum.lang.ast.ProofAst.StepId]] = transformISZ(o2.witnesses, transform_langastProofAstStepId _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(invoke = r0.getOrElse(o2.invoke), witnesses = r1.getOrElse(o2.witnesses)))
          else
            MNone()
        case o2: org.sireum.lang.ast.ProofAst.Step.Justification.InceptEta =>
          val r0: MOption[org.sireum.lang.ast.Exp.Eta] = transform_langastExpEta(o2.eta)
          val r1: MOption[IS[Z, org.sireum.lang.ast.ProofAst.StepId]] = transformISZ(o2.witnesses, transform_langastProofAstStepId _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(eta = r0.getOrElse(o2.eta), witnesses = r1.getOrElse(o2.witnesses)))
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
    val o2: org.sireum.lang.ast.ProofAst.Step.Justification = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.ProofAst.Step.Justification] = post_langastProofAstStepJustification(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastProofAstStepInception(o: org.sireum.lang.ast.ProofAst.Step.Inception): MOption[org.sireum.lang.ast.ProofAst.Step.Inception] = {
    val preR: PreResult[org.sireum.lang.ast.ProofAst.Step.Inception] = pre_langastProofAstStepInception(o)
    val r: MOption[org.sireum.lang.ast.ProofAst.Step.Inception] = if (preR.continu) {
      val o2: org.sireum.lang.ast.ProofAst.Step.Inception = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[org.sireum.lang.ast.ProofAst.Step.Inception] = o2 match {
        case o2: org.sireum.lang.ast.ProofAst.Step.Justification.Incept =>
          val r0: MOption[org.sireum.lang.ast.Exp.Invoke] = transform_langastExpInvoke(o2.invoke)
          val r1: MOption[IS[Z, org.sireum.lang.ast.ProofAst.StepId]] = transformISZ(o2.witnesses, transform_langastProofAstStepId _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(invoke = r0.getOrElse(o2.invoke), witnesses = r1.getOrElse(o2.witnesses)))
          else
            MNone()
        case o2: org.sireum.lang.ast.ProofAst.Step.Justification.InceptNamed =>
          val r0: MOption[org.sireum.lang.ast.Exp.InvokeNamed] = transform_langastExpInvokeNamed(o2.invoke)
          val r1: MOption[IS[Z, org.sireum.lang.ast.ProofAst.StepId]] = transformISZ(o2.witnesses, transform_langastProofAstStepId _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(invoke = r0.getOrElse(o2.invoke), witnesses = r1.getOrElse(o2.witnesses)))
          else
            MNone()
        case o2: org.sireum.lang.ast.ProofAst.Step.Justification.InceptEta =>
          val r0: MOption[org.sireum.lang.ast.Exp.Eta] = transform_langastExpEta(o2.eta)
          val r1: MOption[IS[Z, org.sireum.lang.ast.ProofAst.StepId]] = transformISZ(o2.witnesses, transform_langastProofAstStepId _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(eta = r0.getOrElse(o2.eta), witnesses = r1.getOrElse(o2.witnesses)))
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
    val o2: org.sireum.lang.ast.ProofAst.Step.Inception = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.ProofAst.Step.Inception] = post_langastProofAstStepInception(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastAssignExp(o: org.sireum.lang.ast.AssignExp): MOption[org.sireum.lang.ast.AssignExp] = {
    val preR: PreResult[org.sireum.lang.ast.AssignExp] = pre_langastAssignExp(o)
    val r: MOption[org.sireum.lang.ast.AssignExp] = if (preR.continu) {
      val o2: org.sireum.lang.ast.AssignExp = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[org.sireum.lang.ast.AssignExp] = o2 match {
        case o2: org.sireum.lang.ast.Stmt.Block =>
          val r0: MOption[org.sireum.lang.ast.Body] = transform_langastBody(o2.body)
          val r1: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(body = r0.getOrElse(o2.body), attr = r1.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.If =>
          val r0: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.cond)
          val r1: MOption[org.sireum.lang.ast.Body] = transform_langastBody(o2.thenBody)
          val r2: MOption[org.sireum.lang.ast.Body] = transform_langastBody(o2.elseBody)
          val r3: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
            MSome(o2(cond = r0.getOrElse(o2.cond), thenBody = r1.getOrElse(o2.thenBody), elseBody = r2.getOrElse(o2.elseBody), attr = r3.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.Match =>
          val r0: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.exp)
          val r1: MOption[IS[Z, org.sireum.lang.ast.Case]] = transformISZ(o2.cases, transform_langastCase _)
          val r2: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(exp = r0.getOrElse(o2.exp), cases = r1.getOrElse(o2.cases), attr = r2.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.Return =>
          val r0: MOption[Option[org.sireum.lang.ast.Exp]] = transformOption(o2.expOpt, transform_langastExp _)
          val r1: MOption[org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(expOpt = r0.getOrElse(o2.expOpt), attr = r1.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Stmt.Expr =>
          val r0: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.exp)
          val r1: MOption[org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(exp = r0.getOrElse(o2.exp), attr = r1.getOrElse(o2.attr)))
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
    val o2: org.sireum.lang.ast.AssignExp = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.AssignExp] = post_langastAssignExp(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastCase(o: org.sireum.lang.ast.Case): MOption[org.sireum.lang.ast.Case] = {
    val preR: PreResult[org.sireum.lang.ast.Case] = pre_langastCase(o)
    val r: MOption[org.sireum.lang.ast.Case] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Case = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[org.sireum.lang.ast.Pattern] = transform_langastPattern(o2.pattern)
      val r1: MOption[Option[org.sireum.lang.ast.Exp]] = transformOption(o2.condOpt, transform_langastExp _)
      val r2: MOption[org.sireum.lang.ast.Body] = transform_langastBody(o2.body)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(pattern = r0.getOrElse(o2.pattern), condOpt = r1.getOrElse(o2.condOpt), body = r2.getOrElse(o2.body)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.Case = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.Case] = post_langastCase(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastEnumGenRange(o: org.sireum.lang.ast.EnumGen.Range): MOption[org.sireum.lang.ast.EnumGen.Range] = {
    val preR: PreResult[org.sireum.lang.ast.EnumGen.Range] = pre_langastEnumGenRange(o)
    val r: MOption[org.sireum.lang.ast.EnumGen.Range] = if (preR.continu) {
      val o2: org.sireum.lang.ast.EnumGen.Range = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[org.sireum.lang.ast.EnumGen.Range] = o2 match {
        case o2: org.sireum.lang.ast.EnumGen.Range.Expr =>
          val r0: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.exp)
          val r1: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(exp = r0.getOrElse(o2.exp), attr = r1.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.EnumGen.Range.Step =>
          val r0: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.start)
          val r1: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.end)
          val r2: MOption[Option[org.sireum.lang.ast.Exp]] = transformOption(o2.byOpt, transform_langastExp _)
          val r3: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
            MSome(o2(start = r0.getOrElse(o2.start), end = r1.getOrElse(o2.end), byOpt = r2.getOrElse(o2.byOpt), attr = r3.getOrElse(o2.attr)))
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
    val o2: org.sireum.lang.ast.EnumGen.Range = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.EnumGen.Range] = post_langastEnumGenRange(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastEnumGenFor(o: org.sireum.lang.ast.EnumGen.For): MOption[org.sireum.lang.ast.EnumGen.For] = {
    val preR: PreResult[org.sireum.lang.ast.EnumGen.For] = pre_langastEnumGenFor(o)
    val r: MOption[org.sireum.lang.ast.EnumGen.For] = if (preR.continu) {
      val o2: org.sireum.lang.ast.EnumGen.For = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Option[org.sireum.lang.ast.Id]] = transformOption(o2.idOpt, transform_langastId _)
      val r1: MOption[org.sireum.lang.ast.EnumGen.Range] = transform_langastEnumGenRange(o2.range)
      val r2: MOption[Option[org.sireum.lang.ast.Exp]] = transformOption(o2.condOpt, transform_langastExp _)
      val r3: MOption[org.sireum.lang.ast.LoopContract] = transform_langastLoopContract(o2.contract)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
        MSome(o2(idOpt = r0.getOrElse(o2.idOpt), range = r1.getOrElse(o2.range), condOpt = r2.getOrElse(o2.condOpt), contract = r3.getOrElse(o2.contract)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.EnumGen.For = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.EnumGen.For] = post_langastEnumGenFor(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastType(o: org.sireum.lang.ast.Type): MOption[org.sireum.lang.ast.Type] = {
    val preR: PreResult[org.sireum.lang.ast.Type] = pre_langastType(o)
    val r: MOption[org.sireum.lang.ast.Type] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Type = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[org.sireum.lang.ast.Type] = o2 match {
        case o2: org.sireum.lang.ast.Type.Named =>
          val r0: MOption[org.sireum.lang.ast.Name] = transform_langastName(o2.name)
          val r1: MOption[IS[Z, org.sireum.lang.ast.Type]] = transformISZ(o2.typeArgs, transform_langastType _)
          val r2: MOption[org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(name = r0.getOrElse(o2.name), typeArgs = r1.getOrElse(o2.typeArgs), attr = r2.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Type.Fun =>
          val r0: MOption[IS[Z, org.sireum.lang.ast.Type]] = transformISZ(o2.args, transform_langastType _)
          val r1: MOption[org.sireum.lang.ast.Type] = transform_langastType(o2.ret)
          val r2: MOption[org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(args = r0.getOrElse(o2.args), ret = r1.getOrElse(o2.ret), attr = r2.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Type.Tuple =>
          val r0: MOption[IS[Z, org.sireum.lang.ast.Type]] = transformISZ(o2.args, transform_langastType _)
          val r1: MOption[org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(args = r0.getOrElse(o2.args), attr = r1.getOrElse(o2.attr)))
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
    val o2: org.sireum.lang.ast.Type = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.Type] = post_langastType(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastPattern(o: org.sireum.lang.ast.Pattern): MOption[org.sireum.lang.ast.Pattern] = {
    val preR: PreResult[org.sireum.lang.ast.Pattern] = pre_langastPattern(o)
    val r: MOption[org.sireum.lang.ast.Pattern] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Pattern = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[org.sireum.lang.ast.Pattern] = o2 match {
        case o2: org.sireum.lang.ast.Pattern.Literal =>
          val r0: MOption[org.sireum.lang.ast.Lit] = transform_langastLit(o2.lit)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(lit = r0.getOrElse(o2.lit)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Pattern.LitInterpolate =>
          val r0: MOption[org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(attr = r0.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Pattern.Ref =>
          val r0: MOption[org.sireum.lang.ast.Name] = transform_langastName(o2.name)
          val r1: MOption[org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(name = r0.getOrElse(o2.name), attr = r1.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Pattern.VarBinding =>
          val r0: MOption[org.sireum.lang.ast.Id] = transform_langastId(o2.id)
          val r1: MOption[Option[org.sireum.lang.ast.Type]] = transformOption(o2.tipeOpt, transform_langastType _)
          val r2: MOption[org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), tipeOpt = r1.getOrElse(o2.tipeOpt), attr = r2.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Pattern.Wildcard =>
          val r0: MOption[Option[org.sireum.lang.ast.Type]] = transformOption(o2.typeOpt, transform_langastType _)
          val r1: MOption[org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(typeOpt = r0.getOrElse(o2.typeOpt), attr = r1.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Pattern.SeqWildcard =>
          val r0: MOption[org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(attr = r0.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Pattern.Structure =>
          val r0: MOption[Option[org.sireum.lang.ast.Id]] = transformOption(o2.idOpt, transform_langastId _)
          val r1: MOption[Option[org.sireum.lang.ast.Name]] = transformOption(o2.nameOpt, transform_langastName _)
          val r2: MOption[IS[Z, org.sireum.lang.ast.Pattern]] = transformISZ(o2.patterns, transform_langastPattern _)
          val r3: MOption[org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
            MSome(o2(idOpt = r0.getOrElse(o2.idOpt), nameOpt = r1.getOrElse(o2.nameOpt), patterns = r2.getOrElse(o2.patterns), attr = r3.getOrElse(o2.attr)))
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
    val o2: org.sireum.lang.ast.Pattern = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.Pattern] = post_langastPattern(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastExp(o: org.sireum.lang.ast.Exp): MOption[org.sireum.lang.ast.Exp] = {
    val preR: PreResult[org.sireum.lang.ast.Exp] = pre_langastExp(o)
    val r: MOption[org.sireum.lang.ast.Exp] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Exp = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[org.sireum.lang.ast.Exp] = o2 match {
        case o2: org.sireum.lang.ast.Exp.LitB =>
          val r0: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(attr = r0.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Exp.LitC =>
          val r0: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(attr = r0.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Exp.LitZ =>
          val r0: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(attr = r0.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Exp.LitF32 =>
          val r0: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(attr = r0.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Exp.LitF64 =>
          val r0: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(attr = r0.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Exp.LitR =>
          val r0: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(attr = r0.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Exp.LitString =>
          val r0: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(attr = r0.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Exp.LitStepId =>
          val r0: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(attr = r0.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Exp.StringInterpolate =>
          val r0: MOption[IS[Z, org.sireum.lang.ast.Exp.LitString]] = transformISZ(o2.lits, transform_langastExpLitString _)
          val r1: MOption[IS[Z, org.sireum.lang.ast.Exp]] = transformISZ(o2.args, transform_langastExp _)
          val r2: MOption[org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(lits = r0.getOrElse(o2.lits), args = r1.getOrElse(o2.args), attr = r2.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Exp.This =>
          val r0: MOption[org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(attr = r0.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Exp.Super =>
          val r0: MOption[Option[org.sireum.lang.ast.Id]] = transformOption(o2.idOpt, transform_langastId _)
          val r1: MOption[org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(idOpt = r0.getOrElse(o2.idOpt), attr = r1.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Exp.Unary =>
          val r0: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.exp)
          val r1: MOption[org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(exp = r0.getOrElse(o2.exp), attr = r1.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Exp.Binary =>
          val r0: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.left)
          val r1: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.right)
          val r2: MOption[org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(left = r0.getOrElse(o2.left), right = r1.getOrElse(o2.right), attr = r2.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Exp.Ident =>
          val r0: MOption[org.sireum.lang.ast.Id] = transform_langastId(o2.id)
          val r1: MOption[org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), attr = r1.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Exp.Eta =>
          val r0: MOption[org.sireum.lang.ast.Exp.Ref] = transform_langastExpRef(o2.ref)
          val r1: MOption[org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(ref = r0.getOrElse(o2.ref), attr = r1.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Exp.Tuple =>
          val r0: MOption[IS[Z, org.sireum.lang.ast.Exp]] = transformISZ(o2.args, transform_langastExp _)
          val r1: MOption[org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(args = r0.getOrElse(o2.args), attr = r1.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Exp.Select =>
          val r0: MOption[Option[org.sireum.lang.ast.Exp]] = transformOption(o2.receiverOpt, transform_langastExp _)
          val r1: MOption[org.sireum.lang.ast.Id] = transform_langastId(o2.id)
          val r2: MOption[IS[Z, org.sireum.lang.ast.Type]] = transformISZ(o2.targs, transform_langastType _)
          val r3: MOption[org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
            MSome(o2(receiverOpt = r0.getOrElse(o2.receiverOpt), id = r1.getOrElse(o2.id), targs = r2.getOrElse(o2.targs), attr = r3.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Exp.Invoke =>
          val r0: MOption[Option[org.sireum.lang.ast.Exp]] = transformOption(o2.receiverOpt, transform_langastExp _)
          val r1: MOption[org.sireum.lang.ast.Exp.Ident] = transform_langastExpIdent(o2.ident)
          val r2: MOption[IS[Z, org.sireum.lang.ast.Type]] = transformISZ(o2.targs, transform_langastType _)
          val r3: MOption[IS[Z, org.sireum.lang.ast.Exp]] = transformISZ(o2.args, transform_langastExp _)
          val r4: MOption[org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
            MSome(o2(receiverOpt = r0.getOrElse(o2.receiverOpt), ident = r1.getOrElse(o2.ident), targs = r2.getOrElse(o2.targs), args = r3.getOrElse(o2.args), attr = r4.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Exp.InvokeNamed =>
          val r0: MOption[Option[org.sireum.lang.ast.Exp]] = transformOption(o2.receiverOpt, transform_langastExp _)
          val r1: MOption[org.sireum.lang.ast.Exp.Ident] = transform_langastExpIdent(o2.ident)
          val r2: MOption[IS[Z, org.sireum.lang.ast.Type]] = transformISZ(o2.targs, transform_langastType _)
          val r3: MOption[IS[Z, org.sireum.lang.ast.NamedArg]] = transformISZ(o2.args, transform_langastNamedArg _)
          val r4: MOption[org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
            MSome(o2(receiverOpt = r0.getOrElse(o2.receiverOpt), ident = r1.getOrElse(o2.ident), targs = r2.getOrElse(o2.targs), args = r3.getOrElse(o2.args), attr = r4.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Exp.If =>
          val r0: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.cond)
          val r1: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.thenExp)
          val r2: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.elseExp)
          val r3: MOption[org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
            MSome(o2(cond = r0.getOrElse(o2.cond), thenExp = r1.getOrElse(o2.thenExp), elseExp = r2.getOrElse(o2.elseExp), attr = r3.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Exp.Fun =>
          val r0: MOption[IS[Z, org.sireum.lang.ast.Exp.Fun.Param]] = transformISZ(o2.params, transform_langastExpFunParam _)
          val r1: MOption[org.sireum.lang.ast.AssignExp] = transform_langastAssignExp(o2.exp)
          val r2: MOption[org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(params = r0.getOrElse(o2.params), exp = r1.getOrElse(o2.exp), attr = r2.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Exp.ForYield =>
          val r0: MOption[IS[Z, org.sireum.lang.ast.EnumGen.For]] = transformISZ(o2.enumGens, transform_langastEnumGenFor _)
          val r1: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.exp)
          val r2: MOption[org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(enumGens = r0.getOrElse(o2.enumGens), exp = r1.getOrElse(o2.exp), attr = r2.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Exp.QuantType =>
          val r0: MOption[org.sireum.lang.ast.Exp.Fun] = transform_langastExpFun(o2.fun)
          val r1: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(fun = r0.getOrElse(o2.fun), attr = r1.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Exp.QuantRange =>
          val r0: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.lo)
          val r1: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.hi)
          val r2: MOption[org.sireum.lang.ast.Exp.Fun] = transform_langastExpFun(o2.fun)
          val r3: MOption[org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
            MSome(o2(lo = r0.getOrElse(o2.lo), hi = r1.getOrElse(o2.hi), fun = r2.getOrElse(o2.fun), attr = r3.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Exp.QuantEach =>
          val r0: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.seq)
          val r1: MOption[org.sireum.lang.ast.Exp.Fun] = transform_langastExpFun(o2.fun)
          val r2: MOption[org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(seq = r0.getOrElse(o2.seq), fun = r1.getOrElse(o2.fun), attr = r2.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Exp.Input =>
          val r0: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.exp)
          val r1: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(exp = r0.getOrElse(o2.exp), attr = r1.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Exp.OldVal =>
          val r0: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.exp)
          val r1: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(exp = r0.getOrElse(o2.exp), attr = r1.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Exp.LoopIndex =>
          val r0: MOption[Option[org.sireum.lang.ast.Type]] = transformOption(o2.tipeOpt, transform_langastType _)
          val r1: MOption[org.sireum.lang.ast.Exp.Ident] = transform_langastExpIdent(o2.exp)
          val r2: MOption[org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(tipeOpt = r0.getOrElse(o2.tipeOpt), exp = r1.getOrElse(o2.exp), attr = r2.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Exp.StateSeq =>
          val r0: MOption[org.sireum.lang.ast.Id] = transform_langastId(o2.id)
          val r1: MOption[IS[Z, org.sireum.lang.ast.Exp.StateSeq.Fragment]] = transformISZ(o2.fragments, transform_langastExpStateSeqFragment _)
          val r2: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), fragments = r1.getOrElse(o2.fragments), attr = r2.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Exp.Result =>
          val r0: MOption[Option[org.sireum.lang.ast.Type]] = transformOption(o2.tipeOpt, transform_langastType _)
          val r1: MOption[org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(tipeOpt = r0.getOrElse(o2.tipeOpt), attr = r1.getOrElse(o2.attr)))
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
    val o2: org.sireum.lang.ast.Exp = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.Exp] = post_langastExp(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastLit(o: org.sireum.lang.ast.Lit): MOption[org.sireum.lang.ast.Lit] = {
    val preR: PreResult[org.sireum.lang.ast.Lit] = pre_langastLit(o)
    val r: MOption[org.sireum.lang.ast.Lit] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Lit = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[org.sireum.lang.ast.Lit] = o2 match {
        case o2: org.sireum.lang.ast.Exp.LitB =>
          val r0: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(attr = r0.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Exp.LitC =>
          val r0: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(attr = r0.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Exp.LitZ =>
          val r0: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(attr = r0.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Exp.LitF32 =>
          val r0: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(attr = r0.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Exp.LitF64 =>
          val r0: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(attr = r0.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Exp.LitR =>
          val r0: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(attr = r0.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Exp.LitString =>
          val r0: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(attr = r0.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Exp.LitStepId =>
          val r0: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(attr = r0.getOrElse(o2.attr)))
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
    val o2: org.sireum.lang.ast.Lit = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.Lit] = post_langastLit(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastExpRef(o: org.sireum.lang.ast.Exp.Ref): MOption[org.sireum.lang.ast.Exp.Ref] = {
    val preR: PreResult[org.sireum.lang.ast.Exp.Ref] = pre_langastExpRef(o)
    val r: MOption[org.sireum.lang.ast.Exp.Ref] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Exp.Ref = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[org.sireum.lang.ast.Exp.Ref] = o2 match {
        case o2: org.sireum.lang.ast.Exp.Ident =>
          val r0: MOption[org.sireum.lang.ast.Id] = transform_langastId(o2.id)
          val r1: MOption[org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), attr = r1.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Exp.Select =>
          val r0: MOption[Option[org.sireum.lang.ast.Exp]] = transformOption(o2.receiverOpt, transform_langastExp _)
          val r1: MOption[org.sireum.lang.ast.Id] = transform_langastId(o2.id)
          val r2: MOption[IS[Z, org.sireum.lang.ast.Type]] = transformISZ(o2.targs, transform_langastType _)
          val r3: MOption[org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
            MSome(o2(receiverOpt = r0.getOrElse(o2.receiverOpt), id = r1.getOrElse(o2.id), targs = r2.getOrElse(o2.targs), attr = r3.getOrElse(o2.attr)))
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
    val o2: org.sireum.lang.ast.Exp.Ref = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.Exp.Ref] = post_langastExpRef(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastExpFunParam(o: org.sireum.lang.ast.Exp.Fun.Param): MOption[org.sireum.lang.ast.Exp.Fun.Param] = {
    val preR: PreResult[org.sireum.lang.ast.Exp.Fun.Param] = pre_langastExpFunParam(o)
    val r: MOption[org.sireum.lang.ast.Exp.Fun.Param] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Exp.Fun.Param = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Option[org.sireum.lang.ast.Id]] = transformOption(o2.idOpt, transform_langastId _)
      val r1: MOption[Option[org.sireum.lang.ast.Type]] = transformOption(o2.tipeOpt, transform_langastType _)
      val r2: MOption[Option[org.sireum.lang.ast.Typed]] = transformOption(o2.typedOpt, transform_langastTyped _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(idOpt = r0.getOrElse(o2.idOpt), tipeOpt = r1.getOrElse(o2.tipeOpt), typedOpt = r2.getOrElse(o2.typedOpt)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.Exp.Fun.Param = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.Exp.Fun.Param] = post_langastExpFunParam(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastExpQuant(o: org.sireum.lang.ast.Exp.Quant): MOption[org.sireum.lang.ast.Exp.Quant] = {
    val preR: PreResult[org.sireum.lang.ast.Exp.Quant] = pre_langastExpQuant(o)
    val r: MOption[org.sireum.lang.ast.Exp.Quant] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Exp.Quant = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[org.sireum.lang.ast.Exp.Quant] = o2 match {
        case o2: org.sireum.lang.ast.Exp.QuantType =>
          val r0: MOption[org.sireum.lang.ast.Exp.Fun] = transform_langastExpFun(o2.fun)
          val r1: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(fun = r0.getOrElse(o2.fun), attr = r1.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Exp.QuantRange =>
          val r0: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.lo)
          val r1: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.hi)
          val r2: MOption[org.sireum.lang.ast.Exp.Fun] = transform_langastExpFun(o2.fun)
          val r3: MOption[org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
            MSome(o2(lo = r0.getOrElse(o2.lo), hi = r1.getOrElse(o2.hi), fun = r2.getOrElse(o2.fun), attr = r3.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Exp.QuantEach =>
          val r0: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.seq)
          val r1: MOption[org.sireum.lang.ast.Exp.Fun] = transform_langastExpFun(o2.fun)
          val r2: MOption[org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(seq = r0.getOrElse(o2.seq), fun = r1.getOrElse(o2.fun), attr = r2.getOrElse(o2.attr)))
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
    val o2: org.sireum.lang.ast.Exp.Quant = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.Exp.Quant] = post_langastExpQuant(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastExpStateSeqFragment(o: org.sireum.lang.ast.Exp.StateSeq.Fragment): MOption[org.sireum.lang.ast.Exp.StateSeq.Fragment] = {
    val preR: PreResult[org.sireum.lang.ast.Exp.StateSeq.Fragment] = pre_langastExpStateSeqFragment(o)
    val r: MOption[org.sireum.lang.ast.Exp.StateSeq.Fragment] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Exp.StateSeq.Fragment = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[org.sireum.lang.ast.Id] = transform_langastId(o2.id)
      val r1: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.exp)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(id = r0.getOrElse(o2.id), exp = r1.getOrElse(o2.exp)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.Exp.StateSeq.Fragment = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.Exp.StateSeq.Fragment] = post_langastExpStateSeqFragment(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastNamedArg(o: org.sireum.lang.ast.NamedArg): MOption[org.sireum.lang.ast.NamedArg] = {
    val preR: PreResult[org.sireum.lang.ast.NamedArg] = pre_langastNamedArg(o)
    val r: MOption[org.sireum.lang.ast.NamedArg] = if (preR.continu) {
      val o2: org.sireum.lang.ast.NamedArg = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[org.sireum.lang.ast.Id] = transform_langastId(o2.id)
      val r1: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.arg)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(id = r0.getOrElse(o2.id), arg = r1.getOrElse(o2.arg)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.NamedArg = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.NamedArg] = post_langastNamedArg(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastId(o: org.sireum.lang.ast.Id): MOption[org.sireum.lang.ast.Id] = {
    val preR: PreResult[org.sireum.lang.ast.Id] = pre_langastId(o)
    val r: MOption[org.sireum.lang.ast.Id] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Id = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(attr = r0.getOrElse(o2.attr)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.Id = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.Id] = post_langastId(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastName(o: org.sireum.lang.ast.Name): MOption[org.sireum.lang.ast.Name] = {
    val preR: PreResult[org.sireum.lang.ast.Name] = pre_langastName(o)
    val r: MOption[org.sireum.lang.ast.Name] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Name = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, org.sireum.lang.ast.Id]] = transformISZ(o2.ids, transform_langastId _)
      val r1: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(ids = r0.getOrElse(o2.ids), attr = r1.getOrElse(o2.attr)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.Name = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.Name] = post_langastName(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastBody(o: org.sireum.lang.ast.Body): MOption[org.sireum.lang.ast.Body] = {
    val preR: PreResult[org.sireum.lang.ast.Body] = pre_langastBody(o)
    val r: MOption[org.sireum.lang.ast.Body] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Body = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, org.sireum.lang.ast.Stmt]] = transformISZ(o2.stmts, transform_langastStmt _)
      val r1: MOption[IS[Z, org.sireum.lang.ast.ResolvedInfo.LocalVar]] = transformISZ(o2.undecls, transform_langastResolvedInfoLocalVar _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(stmts = r0.getOrElse(o2.stmts), undecls = r1.getOrElse(o2.undecls)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.Body = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.Body] = post_langastBody(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastAdtParam(o: org.sireum.lang.ast.AdtParam): MOption[org.sireum.lang.ast.AdtParam] = {
    val preR: PreResult[org.sireum.lang.ast.AdtParam] = pre_langastAdtParam(o)
    val r: MOption[org.sireum.lang.ast.AdtParam] = if (preR.continu) {
      val o2: org.sireum.lang.ast.AdtParam = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[org.sireum.lang.ast.Id] = transform_langastId(o2.id)
      val r1: MOption[org.sireum.lang.ast.Type] = transform_langastType(o2.tipe)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(id = r0.getOrElse(o2.id), tipe = r1.getOrElse(o2.tipe)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.AdtParam = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.AdtParam] = post_langastAdtParam(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastMethodSig(o: org.sireum.lang.ast.MethodSig): MOption[org.sireum.lang.ast.MethodSig] = {
    val preR: PreResult[org.sireum.lang.ast.MethodSig] = pre_langastMethodSig(o)
    val r: MOption[org.sireum.lang.ast.MethodSig] = if (preR.continu) {
      val o2: org.sireum.lang.ast.MethodSig = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[org.sireum.lang.ast.Id] = transform_langastId(o2.id)
      val r1: MOption[IS[Z, org.sireum.lang.ast.TypeParam]] = transformISZ(o2.typeParams, transform_langastTypeParam _)
      val r2: MOption[IS[Z, org.sireum.lang.ast.Param]] = transformISZ(o2.params, transform_langastParam _)
      val r3: MOption[org.sireum.lang.ast.Type] = transform_langastType(o2.returnType)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
        MSome(o2(id = r0.getOrElse(o2.id), typeParams = r1.getOrElse(o2.typeParams), params = r2.getOrElse(o2.params), returnType = r3.getOrElse(o2.returnType)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.MethodSig = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.MethodSig] = post_langastMethodSig(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastParam(o: org.sireum.lang.ast.Param): MOption[org.sireum.lang.ast.Param] = {
    val preR: PreResult[org.sireum.lang.ast.Param] = pre_langastParam(o)
    val r: MOption[org.sireum.lang.ast.Param] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Param = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[org.sireum.lang.ast.Id] = transform_langastId(o2.id)
      val r1: MOption[org.sireum.lang.ast.Type] = transform_langastType(o2.tipe)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(id = r0.getOrElse(o2.id), tipe = r1.getOrElse(o2.tipe)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.Param = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.Param] = post_langastParam(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastTypeParam(o: org.sireum.lang.ast.TypeParam): MOption[org.sireum.lang.ast.TypeParam] = {
    val preR: PreResult[org.sireum.lang.ast.TypeParam] = pre_langastTypeParam(o)
    val r: MOption[org.sireum.lang.ast.TypeParam] = if (preR.continu) {
      val o2: org.sireum.lang.ast.TypeParam = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[org.sireum.lang.ast.Id] = transform_langastId(o2.id)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(id = r0.getOrElse(o2.id)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.TypeParam = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.TypeParam] = post_langastTypeParam(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastAttr(o: org.sireum.lang.ast.Attr): MOption[org.sireum.lang.ast.Attr] = {
    val preR: PreResult[org.sireum.lang.ast.Attr] = pre_langastAttr(o)
    val r: MOption[org.sireum.lang.ast.Attr] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Attr = preR.resultOpt.getOrElse(o)
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
    val o2: org.sireum.lang.ast.Attr = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.Attr] = post_langastAttr(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastTypedAttr(o: org.sireum.lang.ast.TypedAttr): MOption[org.sireum.lang.ast.TypedAttr] = {
    val preR: PreResult[org.sireum.lang.ast.TypedAttr] = pre_langastTypedAttr(o)
    val r: MOption[org.sireum.lang.ast.TypedAttr] = if (preR.continu) {
      val o2: org.sireum.lang.ast.TypedAttr = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Option[org.sireum.lang.ast.Typed]] = transformOption(o2.typedOpt, transform_langastTyped _)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(typedOpt = r0.getOrElse(o2.typedOpt)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.TypedAttr = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.TypedAttr] = post_langastTypedAttr(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastResolvedAttr(o: org.sireum.lang.ast.ResolvedAttr): MOption[org.sireum.lang.ast.ResolvedAttr] = {
    val preR: PreResult[org.sireum.lang.ast.ResolvedAttr] = pre_langastResolvedAttr(o)
    val r: MOption[org.sireum.lang.ast.ResolvedAttr] = if (preR.continu) {
      val o2: org.sireum.lang.ast.ResolvedAttr = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Option[org.sireum.lang.ast.ResolvedInfo]] = transformOption(o2.resOpt, transform_langastResolvedInfo _)
      val r1: MOption[Option[org.sireum.lang.ast.Typed]] = transformOption(o2.typedOpt, transform_langastTyped _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(resOpt = r0.getOrElse(o2.resOpt), typedOpt = r1.getOrElse(o2.typedOpt)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.ResolvedAttr = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.ResolvedAttr] = post_langastResolvedAttr(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastResolvedInfo(o: org.sireum.lang.ast.ResolvedInfo): MOption[org.sireum.lang.ast.ResolvedInfo] = {
    val preR: PreResult[org.sireum.lang.ast.ResolvedInfo] = pre_langastResolvedInfo(o)
    val r: MOption[org.sireum.lang.ast.ResolvedInfo] = if (preR.continu) {
      val o2: org.sireum.lang.ast.ResolvedInfo = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[org.sireum.lang.ast.ResolvedInfo] = o2 match {
        case o2: org.sireum.lang.ast.ResolvedInfo.BuiltIn =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: org.sireum.lang.ast.ResolvedInfo.Package =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: org.sireum.lang.ast.ResolvedInfo.Enum =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: org.sireum.lang.ast.ResolvedInfo.EnumElement =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: org.sireum.lang.ast.ResolvedInfo.Object =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: org.sireum.lang.ast.ResolvedInfo.Var =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: org.sireum.lang.ast.ResolvedInfo.Method =>
          val r0: MOption[Option[org.sireum.lang.ast.Typed.Fun]] = transformOption(o2.tpeOpt, transform_langastTypedFun _)
          val r1: MOption[IS[Z, org.sireum.lang.ast.ResolvedInfo]] = transformISZ(o2.reads, transform_langastResolvedInfo _)
          val r2: MOption[IS[Z, org.sireum.lang.ast.ResolvedInfo]] = transformISZ(o2.writes, transform_langastResolvedInfo _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(tpeOpt = r0.getOrElse(o2.tpeOpt), reads = r1.getOrElse(o2.reads), writes = r2.getOrElse(o2.writes)))
          else
            MNone()
        case o2: org.sireum.lang.ast.ResolvedInfo.Methods =>
          val r0: MOption[IS[Z, org.sireum.lang.ast.ResolvedInfo.Method]] = transformISZ(o2.methods, transform_langastResolvedInfoMethod _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(methods = r0.getOrElse(o2.methods)))
          else
            MNone()
        case o2: org.sireum.lang.ast.ResolvedInfo.Tuple =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: org.sireum.lang.ast.ResolvedInfo.LocalVar =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: org.sireum.lang.ast.ResolvedInfo.Fact =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: org.sireum.lang.ast.ResolvedInfo.Theorem =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: org.sireum.lang.ast.ResolvedInfo.Inv =>
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
    val o2: org.sireum.lang.ast.ResolvedInfo = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.ResolvedInfo] = post_langastResolvedInfo(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastTruthTableRow(o: org.sireum.lang.ast.TruthTable.Row): MOption[org.sireum.lang.ast.TruthTable.Row] = {
    val preR: PreResult[org.sireum.lang.ast.TruthTable.Row] = pre_langastTruthTableRow(o)
    val r: MOption[org.sireum.lang.ast.TruthTable.Row] = if (preR.continu) {
      val o2: org.sireum.lang.ast.TruthTable.Row = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[org.sireum.lang.ast.TruthTable.Assignment] = transform_langastTruthTableAssignment(o2.assignment)
      val r1: MOption[org.sireum.lang.ast.TruthTable.Assignment] = transform_langastTruthTableAssignment(o2.values)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(assignment = r0.getOrElse(o2.assignment), values = r1.getOrElse(o2.values)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.TruthTable.Row = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.TruthTable.Row] = post_langastTruthTableRow(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastTruthTableAssignment(o: org.sireum.lang.ast.TruthTable.Assignment): MOption[org.sireum.lang.ast.TruthTable.Assignment] = {
    val preR: PreResult[org.sireum.lang.ast.TruthTable.Assignment] = pre_langastTruthTableAssignment(o)
    val r: MOption[org.sireum.lang.ast.TruthTable.Assignment] = if (preR.continu) {
      val o2: org.sireum.lang.ast.TruthTable.Assignment = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, org.sireum.lang.ast.Exp.LitB]] = transformISZ(o2.values, transform_langastExpLitB _)
      val r1: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(values = r0.getOrElse(o2.values), attr = r1.getOrElse(o2.attr)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.TruthTable.Assignment = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.TruthTable.Assignment] = post_langastTruthTableAssignment(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastTruthTableConclusion(o: org.sireum.lang.ast.TruthTable.Conclusion): MOption[org.sireum.lang.ast.TruthTable.Conclusion] = {
    val preR: PreResult[org.sireum.lang.ast.TruthTable.Conclusion] = pre_langastTruthTableConclusion(o)
    val r: MOption[org.sireum.lang.ast.TruthTable.Conclusion] = if (preR.continu) {
      val o2: org.sireum.lang.ast.TruthTable.Conclusion = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[org.sireum.lang.ast.TruthTable.Conclusion] = o2 match {
        case o2: org.sireum.lang.ast.TruthTable.Conclusion.Validity =>
          val r0: MOption[IS[Z, org.sireum.lang.ast.TruthTable.Assignment]] = transformISZ(o2.assignments, transform_langastTruthTableAssignment _)
          val r1: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(assignments = r0.getOrElse(o2.assignments), attr = r1.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.TruthTable.Conclusion.Tautology =>
          val r0: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(attr = r0.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.TruthTable.Conclusion.Contradictory =>
          val r0: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(attr = r0.getOrElse(o2.attr)))
          else
            MNone()
        case o2: org.sireum.lang.ast.TruthTable.Conclusion.Contingent =>
          val r0: MOption[IS[Z, org.sireum.lang.ast.TruthTable.Assignment]] = transformISZ(o2.trueAssignments, transform_langastTruthTableAssignment _)
          val r1: MOption[IS[Z, org.sireum.lang.ast.TruthTable.Assignment]] = transformISZ(o2.falseAssignments, transform_langastTruthTableAssignment _)
          val r2: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(trueAssignments = r0.getOrElse(o2.trueAssignments), falseAssignments = r1.getOrElse(o2.falseAssignments), attr = r2.getOrElse(o2.attr)))
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
    val o2: org.sireum.lang.ast.TruthTable.Conclusion = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.TruthTable.Conclusion] = post_langastTruthTableConclusion(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformSmfAnnex(o: SmfAnnex): MOption[SmfAnnex] = {
    val preR: PreResult[SmfAnnex] = preSmfAnnex(o)
    val r: MOption[SmfAnnex] = if (preR.continu) {
      val o2: SmfAnnex = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[SmfAnnex] = o2 match {
        case o2: SmfClause =>
          val r0: MOption[IS[Z, SmfClassification]] = transformISZ(o2.classification, transformSmfClassification _)
          val r1: MOption[IS[Z, SmfDeclass]] = transformISZ(o2.declass, transformSmfDeclass _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(classification = r0.getOrElse(o2.classification), declass = r1.getOrElse(o2.declass)))
          else
            MNone()
        case o2: SmfClassification =>
          val r0: MOption[Name] = transformName(o2.portName)
          val r1: MOption[Name] = transformName(o2.typeName)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(portName = r0.getOrElse(o2.portName), typeName = r1.getOrElse(o2.typeName)))
          else
            MNone()
        case o2: SmfDeclass =>
          val r0: MOption[Name] = transformName(o2.flowName)
          val r1: MOption[Option[Name]] = transformOption(o2.srcType, transformName _)
          val r2: MOption[Name] = transformName(o2.snkType)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(flowName = r0.getOrElse(o2.flowName), srcType = r1.getOrElse(o2.srcType), snkType = r2.getOrElse(o2.snkType)))
          else
            MNone()
        case o2: SmfType =>
          val r0: MOption[Name] = transformName(o2.typeName)
          val r1: MOption[IS[Z, Name]] = transformISZ(o2.parentType, transformName _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(typeName = r0.getOrElse(o2.typeName), parentType = r1.getOrElse(o2.parentType)))
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
    val o2: SmfAnnex = r.getOrElse(o)
    val postR: MOption[SmfAnnex] = postSmfAnnex(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformSmfLib(o: SmfLib): MOption[SmfLib] = {
    val preR: PreResult[SmfLib] = preSmfLib(o)
    val r: MOption[SmfLib] = if (preR.continu) {
      val o2: SmfLib = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[SmfLib] = o2 match {
        case o2: SmfLibrary =>
          val r0: MOption[IS[Z, SmfType]] = transformISZ(o2.types, transformSmfType _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(types = r0.getOrElse(o2.types)))
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
    val o2: SmfLib = r.getOrElse(o)
    val postR: MOption[SmfLib] = postSmfLib(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformSmfClause(o: SmfClause): MOption[SmfClause] = {
    val preR: PreResult[SmfClause] = preSmfClause(o)
    val r: MOption[SmfClause] = if (preR.continu) {
      val o2: SmfClause = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, SmfClassification]] = transformISZ(o2.classification, transformSmfClassification _)
      val r1: MOption[IS[Z, SmfDeclass]] = transformISZ(o2.declass, transformSmfDeclass _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(classification = r0.getOrElse(o2.classification), declass = r1.getOrElse(o2.declass)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: SmfClause = r.getOrElse(o)
    val postR: MOption[SmfClause] = postSmfClause(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformSmfClassification(o: SmfClassification): MOption[SmfClassification] = {
    val preR: PreResult[SmfClassification] = preSmfClassification(o)
    val r: MOption[SmfClassification] = if (preR.continu) {
      val o2: SmfClassification = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.portName)
      val r1: MOption[Name] = transformName(o2.typeName)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(portName = r0.getOrElse(o2.portName), typeName = r1.getOrElse(o2.typeName)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: SmfClassification = r.getOrElse(o)
    val postR: MOption[SmfClassification] = postSmfClassification(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformSmfDeclass(o: SmfDeclass): MOption[SmfDeclass] = {
    val preR: PreResult[SmfDeclass] = preSmfDeclass(o)
    val r: MOption[SmfDeclass] = if (preR.continu) {
      val o2: SmfDeclass = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.flowName)
      val r1: MOption[Option[Name]] = transformOption(o2.srcType, transformName _)
      val r2: MOption[Name] = transformName(o2.snkType)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(flowName = r0.getOrElse(o2.flowName), srcType = r1.getOrElse(o2.srcType), snkType = r2.getOrElse(o2.snkType)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: SmfDeclass = r.getOrElse(o)
    val postR: MOption[SmfDeclass] = postSmfDeclass(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformSmfLibrary(o: SmfLibrary): MOption[SmfLibrary] = {
    val preR: PreResult[SmfLibrary] = preSmfLibrary(o)
    val r: MOption[SmfLibrary] = if (preR.continu) {
      val o2: SmfLibrary = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, SmfType]] = transformISZ(o2.types, transformSmfType _)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(types = r0.getOrElse(o2.types)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: SmfLibrary = r.getOrElse(o)
    val postR: MOption[SmfLibrary] = postSmfLibrary(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformSmfType(o: SmfType): MOption[SmfType] = {
    val preR: PreResult[SmfType] = preSmfType(o)
    val r: MOption[SmfType] = if (preR.continu) {
      val o2: SmfType = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.typeName)
      val r1: MOption[IS[Z, Name]] = transformISZ(o2.parentType, transformName _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(typeName = r0.getOrElse(o2.typeName), parentType = r1.getOrElse(o2.parentType)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: SmfType = r.getOrElse(o)
    val postR: MOption[SmfType] = postSmfType(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformAadlInstInfo(o: AadlInstInfo): MOption[AadlInstInfo] = {
    val preR: PreResult[AadlInstInfo] = preAadlInstInfo(o)
    val r: MOption[AadlInstInfo] = if (preR.continu) {
      val o2: AadlInstInfo = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[AadlInstInfo] = o2 match {
        case o2: Component =>
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
        case o2: ErrorTypeDef =>
          val r0: MOption[Name] = transformName(o2.id)
          val r1: MOption[Option[Name]] = transformOption(o2.extendType, transformName _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), extendType = r1.getOrElse(o2.extendType)))
          else
            MNone()
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
        case o2: Connection =>
          val r0: MOption[Name] = transformName(o2.name)
          val r1: MOption[IS[Z, EndPoint]] = transformISZ(o2.src, transformEndPoint _)
          val r2: MOption[IS[Z, EndPoint]] = transformISZ(o2.dst, transformEndPoint _)
          val r3: MOption[IS[Z, Name]] = transformISZ(o2.connectionInstances, transformName _)
          val r4: MOption[IS[Z, Property]] = transformISZ(o2.properties, transformProperty _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
            MSome(o2(name = r0.getOrElse(o2.name), src = r1.getOrElse(o2.src), dst = r2.getOrElse(o2.dst), connectionInstances = r3.getOrElse(o2.connectionInstances), properties = r4.getOrElse(o2.properties)))
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
        case o2: Flow =>
          val r0: MOption[Name] = transformName(o2.name)
          val r1: MOption[Option[Name]] = transformOption(o2.source, transformName _)
          val r2: MOption[Option[Name]] = transformOption(o2.sink, transformName _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(name = r0.getOrElse(o2.name), source = r1.getOrElse(o2.source), sink = r2.getOrElse(o2.sink)))
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
    val o2: AadlInstInfo = r.getOrElse(o)
    val postR: MOption[AadlInstInfo] = postAadlInstInfo(o2)
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
        case o2: ErrorTypeDef =>
          val r0: MOption[Name] = transformName(o2.id)
          val r1: MOption[Option[Name]] = transformOption(o2.extendType, transformName _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), extendType = r1.getOrElse(o2.extendType)))
          else
            MNone()
        case o2: ErrorAliasDef =>
          val r0: MOption[Name] = transformName(o2.errorType)
          val r1: MOption[Name] = transformName(o2.aliseType)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(errorType = r0.getOrElse(o2.errorType), aliseType = r1.getOrElse(o2.aliseType)))
          else
            MNone()
        case o2: ErrorTypeSetDef =>
          val r0: MOption[Name] = transformName(o2.id)
          val r1: MOption[IS[Z, Name]] = transformISZ(o2.errorTypes, transformName _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), errorTypes = r1.getOrElse(o2.errorTypes)))
          else
            MNone()
        case o2: BehaveStateMachine =>
          val r0: MOption[Name] = transformName(o2.id)
          val r1: MOption[IS[Z, ErrorEvent]] = transformISZ(o2.events, transformErrorEvent _)
          val r2: MOption[IS[Z, ErrorState]] = transformISZ(o2.states, transformErrorState _)
          val r3: MOption[IS[Z, ErrorTransition]] = transformISZ(o2.transitions, transformErrorTransition _)
          val r4: MOption[IS[Z, Property]] = transformISZ(o2.properties, transformProperty _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), events = r1.getOrElse(o2.events), states = r2.getOrElse(o2.states), transitions = r3.getOrElse(o2.transitions), properties = r4.getOrElse(o2.properties)))
          else
            MNone()
        case o2: ErrorEvent =>
          val r0: MOption[Name] = transformName(o2.id)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id)))
          else
            MNone()
        case o2: ErrorState =>
          val r0: MOption[Name] = transformName(o2.id)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id)))
          else
            MNone()
        case o2: ErrorTransition =>
          val r0: MOption[Option[Name]] = transformOption(o2.id, transformName _)
          val r1: MOption[Name] = transformName(o2.sourceState)
          val r2: MOption[ErrorCondition] = transformErrorCondition(o2.condition)
          val r3: MOption[Name] = transformName(o2.targetState)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), sourceState = r1.getOrElse(o2.sourceState), condition = r2.getOrElse(o2.condition), targetState = r3.getOrElse(o2.targetState)))
          else
            MNone()
        case o2: ConditionTrigger =>
          val r0: MOption[IS[Z, Name]] = transformISZ(o2.events, transformName _)
          val r1: MOption[IS[Z, Emv2Propagation]] = transformISZ(o2.propagationPoints, transformEmv2Propagation _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(events = r0.getOrElse(o2.events), propagationPoints = r1.getOrElse(o2.propagationPoints)))
          else
            MNone()
        case o2: AndCondition =>
          val r0: MOption[IS[Z, ErrorCondition]] = transformISZ(o2.op, transformErrorCondition _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(op = r0.getOrElse(o2.op)))
          else
            MNone()
        case o2: OrCondition =>
          val r0: MOption[IS[Z, ErrorCondition]] = transformISZ(o2.op, transformErrorCondition _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(op = r0.getOrElse(o2.op)))
          else
            MNone()
        case o2: AllCondition =>
          val r0: MOption[IS[Z, ErrorCondition]] = transformISZ(o2.op, transformErrorCondition _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(op = r0.getOrElse(o2.op)))
          else
            MNone()
        case o2: OrMoreCondition =>
          val r0: MOption[IS[Z, ErrorCondition]] = transformISZ(o2.conditions, transformErrorCondition _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(conditions = r0.getOrElse(o2.conditions)))
          else
            MNone()
        case o2: OrLessCondition =>
          val r0: MOption[IS[Z, ErrorCondition]] = transformISZ(o2.conditions, transformErrorCondition _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(conditions = r0.getOrElse(o2.conditions)))
          else
            MNone()
        case o2: Emv2Clause =>
          val r0: MOption[IS[Z, Name]] = transformISZ(o2.libraries, transformName _)
          val r1: MOption[IS[Z, Emv2Propagation]] = transformISZ(o2.propagations, transformEmv2Propagation _)
          val r2: MOption[IS[Z, Emv2Flow]] = transformISZ(o2.flows, transformEmv2Flow _)
          val r3: MOption[Option[Emv2BehaviorSection]] = transformOption(o2.componentBehavior, transformEmv2BehaviorSection _)
          val r4: MOption[IS[Z, Property]] = transformISZ(o2.properties, transformProperty _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
            MSome(o2(libraries = r0.getOrElse(o2.libraries), propagations = r1.getOrElse(o2.propagations), flows = r2.getOrElse(o2.flows), componentBehavior = r3.getOrElse(o2.componentBehavior), properties = r4.getOrElse(o2.properties)))
          else
            MNone()
        case o2: Emv2Propagation =>
          val r0: MOption[Name] = transformName(o2.propagationPoint)
          val r1: MOption[IS[Z, Name]] = transformISZ(o2.errorTokens, transformName _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(propagationPoint = r0.getOrElse(o2.propagationPoint), errorTokens = r1.getOrElse(o2.errorTokens)))
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
        case o2: Emv2BehaviorSection =>
          val r0: MOption[IS[Z, ErrorEvent]] = transformISZ(o2.events, transformErrorEvent _)
          val r1: MOption[IS[Z, ErrorTransition]] = transformISZ(o2.transitions, transformErrorTransition _)
          val r2: MOption[IS[Z, ErrorPropagation]] = transformISZ(o2.propagations, transformErrorPropagation _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(events = r0.getOrElse(o2.events), transitions = r1.getOrElse(o2.transitions), propagations = r2.getOrElse(o2.propagations)))
          else
            MNone()
        case o2: ErrorPropagation =>
          val r0: MOption[Option[Name]] = transformOption(o2.id, transformName _)
          val r1: MOption[IS[Z, Name]] = transformISZ(o2.source, transformName _)
          val r2: MOption[Option[ErrorCondition]] = transformOption(o2.condition, transformErrorCondition _)
          val r3: MOption[IS[Z, Emv2Propagation]] = transformISZ(o2.target, transformEmv2Propagation _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), source = r1.getOrElse(o2.source), condition = r2.getOrElse(o2.condition), target = r3.getOrElse(o2.target)))
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

  def transformEmv2Lib(o: Emv2Lib): MOption[Emv2Lib] = {
    val preR: PreResult[Emv2Lib] = preEmv2Lib(o)
    val r: MOption[Emv2Lib] = if (preR.continu) {
      val o2: Emv2Lib = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[Emv2Lib] = o2 match {
        case o2: Emv2Library =>
          val r0: MOption[Name] = transformName(o2.name)
          val r1: MOption[IS[Z, ErrorTypeDef]] = transformISZ(o2.errorTypeDef, transformErrorTypeDef _)
          val r2: MOption[IS[Z, ErrorTypeSetDef]] = transformISZ(o2.errorTypeSetDef, transformErrorTypeSetDef _)
          val r3: MOption[IS[Z, ErrorAliasDef]] = transformISZ(o2.alias, transformErrorAliasDef _)
          val r4: MOption[IS[Z, BehaveStateMachine]] = transformISZ(o2.behaveStateMachine, transformBehaveStateMachine _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
            MSome(o2(name = r0.getOrElse(o2.name), errorTypeDef = r1.getOrElse(o2.errorTypeDef), errorTypeSetDef = r2.getOrElse(o2.errorTypeSetDef), alias = r3.getOrElse(o2.alias), behaveStateMachine = r4.getOrElse(o2.behaveStateMachine)))
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
    val o2: Emv2Lib = r.getOrElse(o)
    val postR: MOption[Emv2Lib] = postEmv2Lib(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformAadl(o: Aadl): MOption[Aadl] = {
    val preR: PreResult[Aadl] = preAadl(o)
    val r: MOption[Aadl] = if (preR.continu) {
      val o2: Aadl = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, Component]] = transformISZ(o2.components, transformComponent _)
      val r1: MOption[IS[Z, AnnexLib]] = transformISZ(o2.annexLib, transformAnnexLib _)
      val r2: MOption[IS[Z, Component]] = transformISZ(o2.dataComponents, transformComponent _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(components = r0.getOrElse(o2.components), annexLib = r1.getOrElse(o2.annexLib), dataComponents = r2.getOrElse(o2.dataComponents)))
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

  def transform_langastTyped(o: org.sireum.lang.ast.Typed): MOption[org.sireum.lang.ast.Typed] = {
    val preR: PreResult[org.sireum.lang.ast.Typed] = pre_langastTyped(o)
    val r: MOption[org.sireum.lang.ast.Typed] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Typed = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[org.sireum.lang.ast.Typed] = o2 match {
        case o2: org.sireum.lang.ast.Typed.Name =>
          val r0: MOption[IS[Z, org.sireum.lang.ast.Typed]] = transformISZ(o2.args, transform_langastTyped _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(args = r0.getOrElse(o2.args)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Typed.Tuple =>
          val r0: MOption[IS[Z, org.sireum.lang.ast.Typed]] = transformISZ(o2.args, transform_langastTyped _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(args = r0.getOrElse(o2.args)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Typed.Fun =>
          val r0: MOption[IS[Z, org.sireum.lang.ast.Typed]] = transformISZ(o2.args, transform_langastTyped _)
          val r1: MOption[org.sireum.lang.ast.Typed] = transform_langastTyped(o2.ret)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(args = r0.getOrElse(o2.args), ret = r1.getOrElse(o2.ret)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Typed.TypeVar =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: org.sireum.lang.ast.Typed.Package =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: org.sireum.lang.ast.Typed.Object =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: org.sireum.lang.ast.Typed.Enum =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: org.sireum.lang.ast.Typed.Method =>
          val r0: MOption[org.sireum.lang.ast.Typed.Fun] = transform_langastTypedFun(o2.tpe)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(tpe = r0.getOrElse(o2.tpe)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Typed.Methods =>
          val r0: MOption[IS[Z, org.sireum.lang.ast.Typed.Method]] = transformISZ(o2.methods, transform_langastTypedMethod _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(methods = r0.getOrElse(o2.methods)))
          else
            MNone()
        case o2: org.sireum.lang.ast.Typed.Fact =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: org.sireum.lang.ast.Typed.Theorem =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: org.sireum.lang.ast.Typed.Inv =>
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
    val o2: org.sireum.lang.ast.Typed = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.Typed] = post_langastTyped(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformEmv2ElementRef(o: Emv2ElementRef): MOption[Emv2ElementRef] = {
    val preR: PreResult[Emv2ElementRef] = preEmv2ElementRef(o)
    val r: MOption[Emv2ElementRef] = if (preR.continu) {
      val o2: Emv2ElementRef = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.name)
      val r1: MOption[IS[Z, Name]] = transformISZ(o2.errorTypes, transformName _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(name = r0.getOrElse(o2.name), errorTypes = r1.getOrElse(o2.errorTypes)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: Emv2ElementRef = r.getOrElse(o)
    val postR: MOption[Emv2ElementRef] = postEmv2ElementRef(o2)
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

  def transformEmv2Library(o: Emv2Library): MOption[Emv2Library] = {
    val preR: PreResult[Emv2Library] = preEmv2Library(o)
    val r: MOption[Emv2Library] = if (preR.continu) {
      val o2: Emv2Library = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.name)
      val r1: MOption[IS[Z, ErrorTypeDef]] = transformISZ(o2.errorTypeDef, transformErrorTypeDef _)
      val r2: MOption[IS[Z, ErrorTypeSetDef]] = transformISZ(o2.errorTypeSetDef, transformErrorTypeSetDef _)
      val r3: MOption[IS[Z, ErrorAliasDef]] = transformISZ(o2.alias, transformErrorAliasDef _)
      val r4: MOption[IS[Z, BehaveStateMachine]] = transformISZ(o2.behaveStateMachine, transformBehaveStateMachine _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
        MSome(o2(name = r0.getOrElse(o2.name), errorTypeDef = r1.getOrElse(o2.errorTypeDef), errorTypeSetDef = r2.getOrElse(o2.errorTypeSetDef), alias = r3.getOrElse(o2.alias), behaveStateMachine = r4.getOrElse(o2.behaveStateMachine)))
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

  def transformErrorTypeDef(o: ErrorTypeDef): MOption[ErrorTypeDef] = {
    val preR: PreResult[ErrorTypeDef] = preErrorTypeDef(o)
    val r: MOption[ErrorTypeDef] = if (preR.continu) {
      val o2: ErrorTypeDef = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.id)
      val r1: MOption[Option[Name]] = transformOption(o2.extendType, transformName _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(id = r0.getOrElse(o2.id), extendType = r1.getOrElse(o2.extendType)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: ErrorTypeDef = r.getOrElse(o)
    val postR: MOption[ErrorTypeDef] = postErrorTypeDef(o2)
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

  def transformErrorAliasDef(o: ErrorAliasDef): MOption[ErrorAliasDef] = {
    val preR: PreResult[ErrorAliasDef] = preErrorAliasDef(o)
    val r: MOption[ErrorAliasDef] = if (preR.continu) {
      val o2: ErrorAliasDef = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.errorType)
      val r1: MOption[Name] = transformName(o2.aliseType)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(errorType = r0.getOrElse(o2.errorType), aliseType = r1.getOrElse(o2.aliseType)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: ErrorAliasDef = r.getOrElse(o)
    val postR: MOption[ErrorAliasDef] = postErrorAliasDef(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformErrorTypeSetDef(o: ErrorTypeSetDef): MOption[ErrorTypeSetDef] = {
    val preR: PreResult[ErrorTypeSetDef] = preErrorTypeSetDef(o)
    val r: MOption[ErrorTypeSetDef] = if (preR.continu) {
      val o2: ErrorTypeSetDef = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.id)
      val r1: MOption[IS[Z, Name]] = transformISZ(o2.errorTypes, transformName _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(id = r0.getOrElse(o2.id), errorTypes = r1.getOrElse(o2.errorTypes)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: ErrorTypeSetDef = r.getOrElse(o)
    val postR: MOption[ErrorTypeSetDef] = postErrorTypeSetDef(o2)
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

  def transformBehaveStateMachine(o: BehaveStateMachine): MOption[BehaveStateMachine] = {
    val preR: PreResult[BehaveStateMachine] = preBehaveStateMachine(o)
    val r: MOption[BehaveStateMachine] = if (preR.continu) {
      val o2: BehaveStateMachine = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.id)
      val r1: MOption[IS[Z, ErrorEvent]] = transformISZ(o2.events, transformErrorEvent _)
      val r2: MOption[IS[Z, ErrorState]] = transformISZ(o2.states, transformErrorState _)
      val r3: MOption[IS[Z, ErrorTransition]] = transformISZ(o2.transitions, transformErrorTransition _)
      val r4: MOption[IS[Z, Property]] = transformISZ(o2.properties, transformProperty _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
        MSome(o2(id = r0.getOrElse(o2.id), events = r1.getOrElse(o2.events), states = r2.getOrElse(o2.states), transitions = r3.getOrElse(o2.transitions), properties = r4.getOrElse(o2.properties)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BehaveStateMachine = r.getOrElse(o)
    val postR: MOption[BehaveStateMachine] = postBehaveStateMachine(o2)
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

  def transformErrorEvent(o: ErrorEvent): MOption[ErrorEvent] = {
    val preR: PreResult[ErrorEvent] = preErrorEvent(o)
    val r: MOption[ErrorEvent] = if (preR.continu) {
      val o2: ErrorEvent = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.id)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(id = r0.getOrElse(o2.id)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: ErrorEvent = r.getOrElse(o)
    val postR: MOption[ErrorEvent] = postErrorEvent(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformErrorState(o: ErrorState): MOption[ErrorState] = {
    val preR: PreResult[ErrorState] = preErrorState(o)
    val r: MOption[ErrorState] = if (preR.continu) {
      val o2: ErrorState = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.id)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(id = r0.getOrElse(o2.id)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: ErrorState = r.getOrElse(o)
    val postR: MOption[ErrorState] = postErrorState(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformErrorTransition(o: ErrorTransition): MOption[ErrorTransition] = {
    val preR: PreResult[ErrorTransition] = preErrorTransition(o)
    val r: MOption[ErrorTransition] = if (preR.continu) {
      val o2: ErrorTransition = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Option[Name]] = transformOption(o2.id, transformName _)
      val r1: MOption[Name] = transformName(o2.sourceState)
      val r2: MOption[ErrorCondition] = transformErrorCondition(o2.condition)
      val r3: MOption[Name] = transformName(o2.targetState)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
        MSome(o2(id = r0.getOrElse(o2.id), sourceState = r1.getOrElse(o2.sourceState), condition = r2.getOrElse(o2.condition), targetState = r3.getOrElse(o2.targetState)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: ErrorTransition = r.getOrElse(o)
    val postR: MOption[ErrorTransition] = postErrorTransition(o2)
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

  def transformErrorCondition(o: ErrorCondition): MOption[ErrorCondition] = {
    val preR: PreResult[ErrorCondition] = preErrorCondition(o)
    val r: MOption[ErrorCondition] = if (preR.continu) {
      val o2: ErrorCondition = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[ErrorCondition] = o2 match {
        case o2: ConditionTrigger =>
          val r0: MOption[IS[Z, Name]] = transformISZ(o2.events, transformName _)
          val r1: MOption[IS[Z, Emv2Propagation]] = transformISZ(o2.propagationPoints, transformEmv2Propagation _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(events = r0.getOrElse(o2.events), propagationPoints = r1.getOrElse(o2.propagationPoints)))
          else
            MNone()
        case o2: AndCondition =>
          val r0: MOption[IS[Z, ErrorCondition]] = transformISZ(o2.op, transformErrorCondition _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(op = r0.getOrElse(o2.op)))
          else
            MNone()
        case o2: OrCondition =>
          val r0: MOption[IS[Z, ErrorCondition]] = transformISZ(o2.op, transformErrorCondition _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(op = r0.getOrElse(o2.op)))
          else
            MNone()
        case o2: AllCondition =>
          val r0: MOption[IS[Z, ErrorCondition]] = transformISZ(o2.op, transformErrorCondition _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(op = r0.getOrElse(o2.op)))
          else
            MNone()
        case o2: OrMoreCondition =>
          val r0: MOption[IS[Z, ErrorCondition]] = transformISZ(o2.conditions, transformErrorCondition _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(conditions = r0.getOrElse(o2.conditions)))
          else
            MNone()
        case o2: OrLessCondition =>
          val r0: MOption[IS[Z, ErrorCondition]] = transformISZ(o2.conditions, transformErrorCondition _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(conditions = r0.getOrElse(o2.conditions)))
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
    val o2: ErrorCondition = r.getOrElse(o)
    val postR: MOption[ErrorCondition] = postErrorCondition(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformConditionTrigger(o: ConditionTrigger): MOption[ConditionTrigger] = {
    val preR: PreResult[ConditionTrigger] = preConditionTrigger(o)
    val r: MOption[ConditionTrigger] = if (preR.continu) {
      val o2: ConditionTrigger = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, Name]] = transformISZ(o2.events, transformName _)
      val r1: MOption[IS[Z, Emv2Propagation]] = transformISZ(o2.propagationPoints, transformEmv2Propagation _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(events = r0.getOrElse(o2.events), propagationPoints = r1.getOrElse(o2.propagationPoints)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: ConditionTrigger = r.getOrElse(o)
    val postR: MOption[ConditionTrigger] = postConditionTrigger(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformAndCondition(o: AndCondition): MOption[AndCondition] = {
    val preR: PreResult[AndCondition] = preAndCondition(o)
    val r: MOption[AndCondition] = if (preR.continu) {
      val o2: AndCondition = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, ErrorCondition]] = transformISZ(o2.op, transformErrorCondition _)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(op = r0.getOrElse(o2.op)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: AndCondition = r.getOrElse(o)
    val postR: MOption[AndCondition] = postAndCondition(o2)
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

  def transformOrCondition(o: OrCondition): MOption[OrCondition] = {
    val preR: PreResult[OrCondition] = preOrCondition(o)
    val r: MOption[OrCondition] = if (preR.continu) {
      val o2: OrCondition = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, ErrorCondition]] = transformISZ(o2.op, transformErrorCondition _)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(op = r0.getOrElse(o2.op)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: OrCondition = r.getOrElse(o)
    val postR: MOption[OrCondition] = postOrCondition(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformAllCondition(o: AllCondition): MOption[AllCondition] = {
    val preR: PreResult[AllCondition] = preAllCondition(o)
    val r: MOption[AllCondition] = if (preR.continu) {
      val o2: AllCondition = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, ErrorCondition]] = transformISZ(o2.op, transformErrorCondition _)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(op = r0.getOrElse(o2.op)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: AllCondition = r.getOrElse(o)
    val postR: MOption[AllCondition] = postAllCondition(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformOrMoreCondition(o: OrMoreCondition): MOption[OrMoreCondition] = {
    val preR: PreResult[OrMoreCondition] = preOrMoreCondition(o)
    val r: MOption[OrMoreCondition] = if (preR.continu) {
      val o2: OrMoreCondition = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, ErrorCondition]] = transformISZ(o2.conditions, transformErrorCondition _)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(conditions = r0.getOrElse(o2.conditions)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: OrMoreCondition = r.getOrElse(o)
    val postR: MOption[OrMoreCondition] = postOrMoreCondition(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformOrLessCondition(o: OrLessCondition): MOption[OrLessCondition] = {
    val preR: PreResult[OrLessCondition] = preOrLessCondition(o)
    val r: MOption[OrLessCondition] = if (preR.continu) {
      val o2: OrLessCondition = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, ErrorCondition]] = transformISZ(o2.conditions, transformErrorCondition _)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(conditions = r0.getOrElse(o2.conditions)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: OrLessCondition = r.getOrElse(o)
    val postR: MOption[OrLessCondition] = postOrLessCondition(o2)
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
      val r0: MOption[IS[Z, Name]] = transformISZ(o2.libraries, transformName _)
      val r1: MOption[IS[Z, Emv2Propagation]] = transformISZ(o2.propagations, transformEmv2Propagation _)
      val r2: MOption[IS[Z, Emv2Flow]] = transformISZ(o2.flows, transformEmv2Flow _)
      val r3: MOption[Option[Emv2BehaviorSection]] = transformOption(o2.componentBehavior, transformEmv2BehaviorSection _)
      val r4: MOption[IS[Z, Property]] = transformISZ(o2.properties, transformProperty _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
        MSome(o2(libraries = r0.getOrElse(o2.libraries), propagations = r1.getOrElse(o2.propagations), flows = r2.getOrElse(o2.flows), componentBehavior = r3.getOrElse(o2.componentBehavior), properties = r4.getOrElse(o2.properties)))
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

  def transformEmv2Propagation(o: Emv2Propagation): MOption[Emv2Propagation] = {
    val preR: PreResult[Emv2Propagation] = preEmv2Propagation(o)
    val r: MOption[Emv2Propagation] = if (preR.continu) {
      val o2: Emv2Propagation = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.propagationPoint)
      val r1: MOption[IS[Z, Name]] = transformISZ(o2.errorTokens, transformName _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(propagationPoint = r0.getOrElse(o2.propagationPoint), errorTokens = r1.getOrElse(o2.errorTokens)))
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

  def transformEmv2BehaviorSection(o: Emv2BehaviorSection): MOption[Emv2BehaviorSection] = {
    val preR: PreResult[Emv2BehaviorSection] = preEmv2BehaviorSection(o)
    val r: MOption[Emv2BehaviorSection] = if (preR.continu) {
      val o2: Emv2BehaviorSection = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, ErrorEvent]] = transformISZ(o2.events, transformErrorEvent _)
      val r1: MOption[IS[Z, ErrorTransition]] = transformISZ(o2.transitions, transformErrorTransition _)
      val r2: MOption[IS[Z, ErrorPropagation]] = transformISZ(o2.propagations, transformErrorPropagation _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(events = r0.getOrElse(o2.events), transitions = r1.getOrElse(o2.transitions), propagations = r2.getOrElse(o2.propagations)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: Emv2BehaviorSection = r.getOrElse(o)
    val postR: MOption[Emv2BehaviorSection] = postEmv2BehaviorSection(o2)
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

  def transformErrorPropagation(o: ErrorPropagation): MOption[ErrorPropagation] = {
    val preR: PreResult[ErrorPropagation] = preErrorPropagation(o)
    val r: MOption[ErrorPropagation] = if (preR.continu) {
      val o2: ErrorPropagation = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Option[Name]] = transformOption(o2.id, transformName _)
      val r1: MOption[IS[Z, Name]] = transformISZ(o2.source, transformName _)
      val r2: MOption[Option[ErrorCondition]] = transformOption(o2.condition, transformErrorCondition _)
      val r3: MOption[IS[Z, Emv2Propagation]] = transformISZ(o2.target, transformEmv2Propagation _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
        MSome(o2(id = r0.getOrElse(o2.id), source = r1.getOrElse(o2.source), condition = r2.getOrElse(o2.condition), target = r3.getOrElse(o2.target)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: ErrorPropagation = r.getOrElse(o)
    val postR: MOption[ErrorPropagation] = postErrorPropagation(o2)
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
      val r2: MOption[IS[Z, ElementRef]] = transformISZ(o2.appliesTo, transformElementRef _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(name = r0.getOrElse(o2.name), propertyValues = r1.getOrElse(o2.propertyValues), appliesTo = r2.getOrElse(o2.appliesTo)))
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

  def transformElementRef(o: ElementRef): MOption[ElementRef] = {
    val preR: PreResult[ElementRef] = preElementRef(o)
    val r: MOption[ElementRef] = if (preR.continu) {
      val o2: ElementRef = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[ElementRef] = o2 match {
        case o2: Emv2ElementRef =>
          val r0: MOption[Name] = transformName(o2.name)
          val r1: MOption[IS[Z, Name]] = transformISZ(o2.errorTypes, transformName _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(name = r0.getOrElse(o2.name), errorTypes = r1.getOrElse(o2.errorTypes)))
          else
            MNone()
        case o2: AadlElementRef =>
          val r0: MOption[Name] = transformName(o2.name)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(name = r0.getOrElse(o2.name)))
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
    val o2: ElementRef = r.getOrElse(o)
    val postR: MOption[ElementRef] = postElementRef(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformAadlElementRef(o: AadlElementRef): MOption[AadlElementRef] = {
    val preR: PreResult[AadlElementRef] = preAadlElementRef(o)
    val r: MOption[AadlElementRef] = if (preR.continu) {
      val o2: AadlElementRef = preR.resultOpt.getOrElse(o)
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
    val o2: AadlElementRef = r.getOrElse(o)
    val postR: MOption[AadlElementRef] = postAadlElementRef(o2)
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
      val r1: MOption[Option[Name]] = transformOption(o2.source, transformName _)
      val r2: MOption[Option[Name]] = transformOption(o2.sink, transformName _)
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
        case o2: SmfClause =>
          val r0: MOption[IS[Z, SmfClassification]] = transformISZ(o2.classification, transformSmfClassification _)
          val r1: MOption[IS[Z, SmfDeclass]] = transformISZ(o2.declass, transformSmfDeclass _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(classification = r0.getOrElse(o2.classification), declass = r1.getOrElse(o2.declass)))
          else
            MNone()
        case o2: SmfClassification =>
          val r0: MOption[Name] = transformName(o2.portName)
          val r1: MOption[Name] = transformName(o2.typeName)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(portName = r0.getOrElse(o2.portName), typeName = r1.getOrElse(o2.typeName)))
          else
            MNone()
        case o2: SmfDeclass =>
          val r0: MOption[Name] = transformName(o2.flowName)
          val r1: MOption[Option[Name]] = transformOption(o2.srcType, transformName _)
          val r2: MOption[Name] = transformName(o2.snkType)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(flowName = r0.getOrElse(o2.flowName), srcType = r1.getOrElse(o2.srcType), snkType = r2.getOrElse(o2.snkType)))
          else
            MNone()
        case o2: SmfType =>
          val r0: MOption[Name] = transformName(o2.typeName)
          val r1: MOption[IS[Z, Name]] = transformISZ(o2.parentType, transformName _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(typeName = r0.getOrElse(o2.typeName), parentType = r1.getOrElse(o2.parentType)))
          else
            MNone()
        case o2: ErrorTypeDef =>
          val r0: MOption[Name] = transformName(o2.id)
          val r1: MOption[Option[Name]] = transformOption(o2.extendType, transformName _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), extendType = r1.getOrElse(o2.extendType)))
          else
            MNone()
        case o2: ErrorAliasDef =>
          val r0: MOption[Name] = transformName(o2.errorType)
          val r1: MOption[Name] = transformName(o2.aliseType)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(errorType = r0.getOrElse(o2.errorType), aliseType = r1.getOrElse(o2.aliseType)))
          else
            MNone()
        case o2: ErrorTypeSetDef =>
          val r0: MOption[Name] = transformName(o2.id)
          val r1: MOption[IS[Z, Name]] = transformISZ(o2.errorTypes, transformName _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), errorTypes = r1.getOrElse(o2.errorTypes)))
          else
            MNone()
        case o2: BehaveStateMachine =>
          val r0: MOption[Name] = transformName(o2.id)
          val r1: MOption[IS[Z, ErrorEvent]] = transformISZ(o2.events, transformErrorEvent _)
          val r2: MOption[IS[Z, ErrorState]] = transformISZ(o2.states, transformErrorState _)
          val r3: MOption[IS[Z, ErrorTransition]] = transformISZ(o2.transitions, transformErrorTransition _)
          val r4: MOption[IS[Z, Property]] = transformISZ(o2.properties, transformProperty _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), events = r1.getOrElse(o2.events), states = r2.getOrElse(o2.states), transitions = r3.getOrElse(o2.transitions), properties = r4.getOrElse(o2.properties)))
          else
            MNone()
        case o2: ErrorEvent =>
          val r0: MOption[Name] = transformName(o2.id)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id)))
          else
            MNone()
        case o2: ErrorState =>
          val r0: MOption[Name] = transformName(o2.id)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id)))
          else
            MNone()
        case o2: ErrorTransition =>
          val r0: MOption[Option[Name]] = transformOption(o2.id, transformName _)
          val r1: MOption[Name] = transformName(o2.sourceState)
          val r2: MOption[ErrorCondition] = transformErrorCondition(o2.condition)
          val r3: MOption[Name] = transformName(o2.targetState)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), sourceState = r1.getOrElse(o2.sourceState), condition = r2.getOrElse(o2.condition), targetState = r3.getOrElse(o2.targetState)))
          else
            MNone()
        case o2: ConditionTrigger =>
          val r0: MOption[IS[Z, Name]] = transformISZ(o2.events, transformName _)
          val r1: MOption[IS[Z, Emv2Propagation]] = transformISZ(o2.propagationPoints, transformEmv2Propagation _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(events = r0.getOrElse(o2.events), propagationPoints = r1.getOrElse(o2.propagationPoints)))
          else
            MNone()
        case o2: AndCondition =>
          val r0: MOption[IS[Z, ErrorCondition]] = transformISZ(o2.op, transformErrorCondition _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(op = r0.getOrElse(o2.op)))
          else
            MNone()
        case o2: OrCondition =>
          val r0: MOption[IS[Z, ErrorCondition]] = transformISZ(o2.op, transformErrorCondition _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(op = r0.getOrElse(o2.op)))
          else
            MNone()
        case o2: AllCondition =>
          val r0: MOption[IS[Z, ErrorCondition]] = transformISZ(o2.op, transformErrorCondition _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(op = r0.getOrElse(o2.op)))
          else
            MNone()
        case o2: OrMoreCondition =>
          val r0: MOption[IS[Z, ErrorCondition]] = transformISZ(o2.conditions, transformErrorCondition _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(conditions = r0.getOrElse(o2.conditions)))
          else
            MNone()
        case o2: OrLessCondition =>
          val r0: MOption[IS[Z, ErrorCondition]] = transformISZ(o2.conditions, transformErrorCondition _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(conditions = r0.getOrElse(o2.conditions)))
          else
            MNone()
        case o2: Emv2Clause =>
          val r0: MOption[IS[Z, Name]] = transformISZ(o2.libraries, transformName _)
          val r1: MOption[IS[Z, Emv2Propagation]] = transformISZ(o2.propagations, transformEmv2Propagation _)
          val r2: MOption[IS[Z, Emv2Flow]] = transformISZ(o2.flows, transformEmv2Flow _)
          val r3: MOption[Option[Emv2BehaviorSection]] = transformOption(o2.componentBehavior, transformEmv2BehaviorSection _)
          val r4: MOption[IS[Z, Property]] = transformISZ(o2.properties, transformProperty _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
            MSome(o2(libraries = r0.getOrElse(o2.libraries), propagations = r1.getOrElse(o2.propagations), flows = r2.getOrElse(o2.flows), componentBehavior = r3.getOrElse(o2.componentBehavior), properties = r4.getOrElse(o2.properties)))
          else
            MNone()
        case o2: Emv2Propagation =>
          val r0: MOption[Name] = transformName(o2.propagationPoint)
          val r1: MOption[IS[Z, Name]] = transformISZ(o2.errorTokens, transformName _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(propagationPoint = r0.getOrElse(o2.propagationPoint), errorTokens = r1.getOrElse(o2.errorTokens)))
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
        case o2: Emv2BehaviorSection =>
          val r0: MOption[IS[Z, ErrorEvent]] = transformISZ(o2.events, transformErrorEvent _)
          val r1: MOption[IS[Z, ErrorTransition]] = transformISZ(o2.transitions, transformErrorTransition _)
          val r2: MOption[IS[Z, ErrorPropagation]] = transformISZ(o2.propagations, transformErrorPropagation _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(events = r0.getOrElse(o2.events), transitions = r1.getOrElse(o2.transitions), propagations = r2.getOrElse(o2.propagations)))
          else
            MNone()
        case o2: ErrorPropagation =>
          val r0: MOption[Option[Name]] = transformOption(o2.id, transformName _)
          val r1: MOption[IS[Z, Name]] = transformISZ(o2.source, transformName _)
          val r2: MOption[Option[ErrorCondition]] = transformOption(o2.condition, transformErrorCondition _)
          val r3: MOption[IS[Z, Emv2Propagation]] = transformISZ(o2.target, transformEmv2Propagation _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), source = r1.getOrElse(o2.source), condition = r2.getOrElse(o2.condition), target = r3.getOrElse(o2.target)))
          else
            MNone()
        case o2: OtherAnnex =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: GclSubclause =>
          val r0: MOption[IS[Z, GclStateVar]] = transformISZ(o2.state, transformGclStateVar _)
          val r1: MOption[IS[Z, GclInvariant]] = transformISZ(o2.invariants, transformGclInvariant _)
          val r2: MOption[Option[GclInitialize]] = transformOption(o2.initializes, transformGclInitialize _)
          val r3: MOption[Option[GclIntegration]] = transformOption(o2.integration, transformGclIntegration _)
          val r4: MOption[Option[GclCompute]] = transformOption(o2.compute, transformGclCompute _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
            MSome(o2(state = r0.getOrElse(o2.state), invariants = r1.getOrElse(o2.invariants), initializes = r2.getOrElse(o2.initializes), integration = r3.getOrElse(o2.integration), compute = r4.getOrElse(o2.compute)))
          else
            MNone()
        case o2: BTSBLESSAnnexClause =>
          val r0: MOption[IS[Z, BTSAssertion]] = transformISZ(o2.assertions, transformBTSAssertion _)
          val r1: MOption[Option[BTSAssertion]] = transformOption(o2.invariant, transformBTSAssertion _)
          val r2: MOption[IS[Z, BTSVariableDeclaration]] = transformISZ(o2.variables, transformBTSVariableDeclaration _)
          val r3: MOption[IS[Z, BTSStateDeclaration]] = transformISZ(o2.states, transformBTSStateDeclaration _)
          val r4: MOption[IS[Z, BTSTransition]] = transformISZ(o2.transitions, transformBTSTransition _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
            MSome(o2(assertions = r0.getOrElse(o2.assertions), invariant = r1.getOrElse(o2.invariant), variables = r2.getOrElse(o2.variables), states = r3.getOrElse(o2.states), transitions = r4.getOrElse(o2.transitions)))
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

  def transformAnnexLib(o: AnnexLib): MOption[AnnexLib] = {
    val preR: PreResult[AnnexLib] = preAnnexLib(o)
    val r: MOption[AnnexLib] = if (preR.continu) {
      val o2: AnnexLib = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[AnnexLib] = o2 match {
        case o2: SmfLibrary =>
          val r0: MOption[IS[Z, SmfType]] = transformISZ(o2.types, transformSmfType _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(types = r0.getOrElse(o2.types)))
          else
            MNone()
        case o2: Emv2Library =>
          val r0: MOption[Name] = transformName(o2.name)
          val r1: MOption[IS[Z, ErrorTypeDef]] = transformISZ(o2.errorTypeDef, transformErrorTypeDef _)
          val r2: MOption[IS[Z, ErrorTypeSetDef]] = transformISZ(o2.errorTypeSetDef, transformErrorTypeSetDef _)
          val r3: MOption[IS[Z, ErrorAliasDef]] = transformISZ(o2.alias, transformErrorAliasDef _)
          val r4: MOption[IS[Z, BehaveStateMachine]] = transformISZ(o2.behaveStateMachine, transformBehaveStateMachine _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
            MSome(o2(name = r0.getOrElse(o2.name), errorTypeDef = r1.getOrElse(o2.errorTypeDef), errorTypeSetDef = r2.getOrElse(o2.errorTypeSetDef), alias = r3.getOrElse(o2.alias), behaveStateMachine = r4.getOrElse(o2.behaveStateMachine)))
          else
            MNone()
        case o2: OtherLib =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: GclLibrary =>
          val r0: MOption[Name] = transformName(o2.containingPackage)
          val r1: MOption[IS[Z, org.sireum.lang.ast.Stmt.Method]] = transformISZ(o2.methods, transform_langastStmtMethod _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(containingPackage = r0.getOrElse(o2.containingPackage), methods = r1.getOrElse(o2.methods)))
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
    val o2: AnnexLib = r.getOrElse(o)
    val postR: MOption[AnnexLib] = postAnnexLib(o2)
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

  def transformOtherLib(o: OtherLib): MOption[OtherLib] = {
    val preR: PreResult[OtherLib] = preOtherLib(o)
    val r: MOption[OtherLib] = if (preR.continu) {
      val o2: OtherLib = preR.resultOpt.getOrElse(o)
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
    val o2: OtherLib = r.getOrElse(o)
    val postR: MOption[OtherLib] = postOtherLib(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformGclAnnex(o: GclAnnex): MOption[GclAnnex] = {
    val preR: PreResult[GclAnnex] = preGclAnnex(o)
    val r: MOption[GclAnnex] = if (preR.continu) {
      val o2: GclAnnex = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[GclAnnex] = o2 match {
        case o2: GclSubclause =>
          val r0: MOption[IS[Z, GclStateVar]] = transformISZ(o2.state, transformGclStateVar _)
          val r1: MOption[IS[Z, GclInvariant]] = transformISZ(o2.invariants, transformGclInvariant _)
          val r2: MOption[Option[GclInitialize]] = transformOption(o2.initializes, transformGclInitialize _)
          val r3: MOption[Option[GclIntegration]] = transformOption(o2.integration, transformGclIntegration _)
          val r4: MOption[Option[GclCompute]] = transformOption(o2.compute, transformGclCompute _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
            MSome(o2(state = r0.getOrElse(o2.state), invariants = r1.getOrElse(o2.invariants), initializes = r2.getOrElse(o2.initializes), integration = r3.getOrElse(o2.integration), compute = r4.getOrElse(o2.compute)))
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
    val o2: GclAnnex = r.getOrElse(o)
    val postR: MOption[GclAnnex] = postGclAnnex(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformGclSubclause(o: GclSubclause): MOption[GclSubclause] = {
    val preR: PreResult[GclSubclause] = preGclSubclause(o)
    val r: MOption[GclSubclause] = if (preR.continu) {
      val o2: GclSubclause = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, GclStateVar]] = transformISZ(o2.state, transformGclStateVar _)
      val r1: MOption[IS[Z, GclInvariant]] = transformISZ(o2.invariants, transformGclInvariant _)
      val r2: MOption[Option[GclInitialize]] = transformOption(o2.initializes, transformGclInitialize _)
      val r3: MOption[Option[GclIntegration]] = transformOption(o2.integration, transformGclIntegration _)
      val r4: MOption[Option[GclCompute]] = transformOption(o2.compute, transformGclCompute _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
        MSome(o2(state = r0.getOrElse(o2.state), invariants = r1.getOrElse(o2.invariants), initializes = r2.getOrElse(o2.initializes), integration = r3.getOrElse(o2.integration), compute = r4.getOrElse(o2.compute)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: GclSubclause = r.getOrElse(o)
    val postR: MOption[GclSubclause] = postGclSubclause(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBLESSAnnex(o: BLESSAnnex): MOption[BLESSAnnex] = {
    val preR: PreResult[BLESSAnnex] = preBLESSAnnex(o)
    val r: MOption[BLESSAnnex] = if (preR.continu) {
      val o2: BLESSAnnex = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[BLESSAnnex] = o2 match {
        case o2: BTSBLESSAnnexClause =>
          val r0: MOption[IS[Z, BTSAssertion]] = transformISZ(o2.assertions, transformBTSAssertion _)
          val r1: MOption[Option[BTSAssertion]] = transformOption(o2.invariant, transformBTSAssertion _)
          val r2: MOption[IS[Z, BTSVariableDeclaration]] = transformISZ(o2.variables, transformBTSVariableDeclaration _)
          val r3: MOption[IS[Z, BTSStateDeclaration]] = transformISZ(o2.states, transformBTSStateDeclaration _)
          val r4: MOption[IS[Z, BTSTransition]] = transformISZ(o2.transitions, transformBTSTransition _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
            MSome(o2(assertions = r0.getOrElse(o2.assertions), invariant = r1.getOrElse(o2.invariant), variables = r2.getOrElse(o2.variables), states = r3.getOrElse(o2.states), transitions = r4.getOrElse(o2.transitions)))
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
    val o2: BLESSAnnex = r.getOrElse(o)
    val postR: MOption[BLESSAnnex] = postBLESSAnnex(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformGclStateVar(o: GclStateVar): MOption[GclStateVar] = {
    val preR: PreResult[GclStateVar] = preGclStateVar(o)
    val r: MOption[GclStateVar] = if (preR.continu) {
      val o2: GclStateVar = preR.resultOpt.getOrElse(o)
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
    val o2: GclStateVar = r.getOrElse(o)
    val postR: MOption[GclStateVar] = postGclStateVar(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformGclSpec(o: GclSpec): MOption[GclSpec] = {
    val preR: PreResult[GclSpec] = preGclSpec(o)
    val r: MOption[GclSpec] = if (preR.continu) {
      val o2: GclSpec = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[GclSpec] = o2 match {
        case o2: GclInvariant =>
          val r0: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.exp)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(exp = r0.getOrElse(o2.exp)))
          else
            MNone()
        case o2: GclAssume =>
          val r0: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.exp)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(exp = r0.getOrElse(o2.exp)))
          else
            MNone()
        case o2: GclGuarantee =>
          val r0: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.exp)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(exp = r0.getOrElse(o2.exp)))
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
    val o2: GclSpec = r.getOrElse(o)
    val postR: MOption[GclSpec] = postGclSpec(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformGclInvariant(o: GclInvariant): MOption[GclInvariant] = {
    val preR: PreResult[GclInvariant] = preGclInvariant(o)
    val r: MOption[GclInvariant] = if (preR.continu) {
      val o2: GclInvariant = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.exp)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(exp = r0.getOrElse(o2.exp)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: GclInvariant = r.getOrElse(o)
    val postR: MOption[GclInvariant] = postGclInvariant(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSBLESSAnnexClause(o: BTSBLESSAnnexClause): MOption[BTSBLESSAnnexClause] = {
    val preR: PreResult[BTSBLESSAnnexClause] = preBTSBLESSAnnexClause(o)
    val r: MOption[BTSBLESSAnnexClause] = if (preR.continu) {
      val o2: BTSBLESSAnnexClause = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, BTSAssertion]] = transformISZ(o2.assertions, transformBTSAssertion _)
      val r1: MOption[Option[BTSAssertion]] = transformOption(o2.invariant, transformBTSAssertion _)
      val r2: MOption[IS[Z, BTSVariableDeclaration]] = transformISZ(o2.variables, transformBTSVariableDeclaration _)
      val r3: MOption[IS[Z, BTSStateDeclaration]] = transformISZ(o2.states, transformBTSStateDeclaration _)
      val r4: MOption[IS[Z, BTSTransition]] = transformISZ(o2.transitions, transformBTSTransition _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
        MSome(o2(assertions = r0.getOrElse(o2.assertions), invariant = r1.getOrElse(o2.invariant), variables = r2.getOrElse(o2.variables), states = r3.getOrElse(o2.states), transitions = r4.getOrElse(o2.transitions)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSBLESSAnnexClause = r.getOrElse(o)
    val postR: MOption[BTSBLESSAnnexClause] = postBTSBLESSAnnexClause(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformGclComputeSpec(o: GclComputeSpec): MOption[GclComputeSpec] = {
    val preR: PreResult[GclComputeSpec] = preGclComputeSpec(o)
    val r: MOption[GclComputeSpec] = if (preR.continu) {
      val o2: GclComputeSpec = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[GclComputeSpec] = o2 match {
        case o2: GclAssume =>
          val r0: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.exp)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(exp = r0.getOrElse(o2.exp)))
          else
            MNone()
        case o2: GclGuarantee =>
          val r0: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.exp)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(exp = r0.getOrElse(o2.exp)))
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
    val o2: GclComputeSpec = r.getOrElse(o)
    val postR: MOption[GclComputeSpec] = postGclComputeSpec(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformGclAssume(o: GclAssume): MOption[GclAssume] = {
    val preR: PreResult[GclAssume] = preGclAssume(o)
    val r: MOption[GclAssume] = if (preR.continu) {
      val o2: GclAssume = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.exp)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(exp = r0.getOrElse(o2.exp)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: GclAssume = r.getOrElse(o)
    val postR: MOption[GclAssume] = postGclAssume(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformGclGuarantee(o: GclGuarantee): MOption[GclGuarantee] = {
    val preR: PreResult[GclGuarantee] = preGclGuarantee(o)
    val r: MOption[GclGuarantee] = if (preR.continu) {
      val o2: GclGuarantee = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.exp)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(exp = r0.getOrElse(o2.exp)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: GclGuarantee = r.getOrElse(o)
    val postR: MOption[GclGuarantee] = postGclGuarantee(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformGclIntegration(o: GclIntegration): MOption[GclIntegration] = {
    val preR: PreResult[GclIntegration] = preGclIntegration(o)
    val r: MOption[GclIntegration] = if (preR.continu) {
      val o2: GclIntegration = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, GclSpec]] = transformISZ(o2.specs, transformGclSpec _)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(specs = r0.getOrElse(o2.specs)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: GclIntegration = r.getOrElse(o)
    val postR: MOption[GclIntegration] = postGclIntegration(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformGclCaseStatement(o: GclCaseStatement): MOption[GclCaseStatement] = {
    val preR: PreResult[GclCaseStatement] = preGclCaseStatement(o)
    val r: MOption[GclCaseStatement] = if (preR.continu) {
      val o2: GclCaseStatement = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.assumes)
      val r1: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.guarantees)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(assumes = r0.getOrElse(o2.assumes), guarantees = r1.getOrElse(o2.guarantees)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: GclCaseStatement = r.getOrElse(o)
    val postR: MOption[GclCaseStatement] = postGclCaseStatement(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformGclInitialize(o: GclInitialize): MOption[GclInitialize] = {
    val preR: PreResult[GclInitialize] = preGclInitialize(o)
    val r: MOption[GclInitialize] = if (preR.continu) {
      val o2: GclInitialize = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, org.sireum.lang.ast.Exp]] = transformISZ(o2.modifies, transform_langastExp _)
      val r1: MOption[IS[Z, GclGuarantee]] = transformISZ(o2.guarantees, transformGclGuarantee _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(modifies = r0.getOrElse(o2.modifies), guarantees = r1.getOrElse(o2.guarantees)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: GclInitialize = r.getOrElse(o)
    val postR: MOption[GclInitialize] = postGclInitialize(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformGclCompute(o: GclCompute): MOption[GclCompute] = {
    val preR: PreResult[GclCompute] = preGclCompute(o)
    val r: MOption[GclCompute] = if (preR.continu) {
      val o2: GclCompute = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, org.sireum.lang.ast.Exp]] = transformISZ(o2.modifies, transform_langastExp _)
      val r1: MOption[IS[Z, GclComputeSpec]] = transformISZ(o2.specs, transformGclComputeSpec _)
      val r2: MOption[IS[Z, GclCaseStatement]] = transformISZ(o2.cases, transformGclCaseStatement _)
      val r3: MOption[IS[Z, GclHandle]] = transformISZ(o2.handlers, transformGclHandle _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
        MSome(o2(modifies = r0.getOrElse(o2.modifies), specs = r1.getOrElse(o2.specs), cases = r2.getOrElse(o2.cases), handlers = r3.getOrElse(o2.handlers)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: GclCompute = r.getOrElse(o)
    val postR: MOption[GclCompute] = postGclCompute(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformGclHandle(o: GclHandle): MOption[GclHandle] = {
    val preR: PreResult[GclHandle] = preGclHandle(o)
    val r: MOption[GclHandle] = if (preR.continu) {
      val o2: GclHandle = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.port)
      val r1: MOption[IS[Z, org.sireum.lang.ast.Exp]] = transformISZ(o2.modifies, transform_langastExp _)
      val r2: MOption[IS[Z, GclGuarantee]] = transformISZ(o2.guarantees, transformGclGuarantee _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(port = r0.getOrElse(o2.port), modifies = r1.getOrElse(o2.modifies), guarantees = r2.getOrElse(o2.guarantees)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: GclHandle = r.getOrElse(o)
    val postR: MOption[GclHandle] = postGclHandle(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformGclTODO(o: GclTODO): MOption[GclTODO] = {
    val preR: PreResult[GclTODO] = preGclTODO(o)
    val r: MOption[GclTODO] = if (preR.continu) {
      val o2: GclTODO = preR.resultOpt.getOrElse(o)
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
    val o2: GclTODO = r.getOrElse(o)
    val postR: MOption[GclTODO] = postGclTODO(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformGclLibrary(o: GclLibrary): MOption[GclLibrary] = {
    val preR: PreResult[GclLibrary] = preGclLibrary(o)
    val r: MOption[GclLibrary] = if (preR.continu) {
      val o2: GclLibrary = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.containingPackage)
      val r1: MOption[IS[Z, org.sireum.lang.ast.Stmt.Method]] = transformISZ(o2.methods, transform_langastStmtMethod _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(containingPackage = r0.getOrElse(o2.containingPackage), methods = r1.getOrElse(o2.methods)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: GclLibrary = r.getOrElse(o)
    val postR: MOption[GclLibrary] = postGclLibrary(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSVariableDeclaration(o: BTSVariableDeclaration): MOption[BTSVariableDeclaration] = {
    val preR: PreResult[BTSVariableDeclaration] = preBTSVariableDeclaration(o)
    val r: MOption[BTSVariableDeclaration] = if (preR.continu) {
      val o2: BTSVariableDeclaration = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.name)
      val r1: MOption[BTSType] = transformBTSType(o2.varType)
      val r2: MOption[Option[BTSExp]] = transformOption(o2.assignExpression, transformBTSExp _)
      val r3: MOption[Option[BLESSIntConst]] = transformOption(o2.arraySize, transformBLESSIntConst _)
      val r4: MOption[Option[BTSAssertion]] = transformOption(o2.variableAssertion, transformBTSAssertion _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
        MSome(o2(name = r0.getOrElse(o2.name), varType = r1.getOrElse(o2.varType), assignExpression = r2.getOrElse(o2.assignExpression), arraySize = r3.getOrElse(o2.arraySize), variableAssertion = r4.getOrElse(o2.variableAssertion)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSVariableDeclaration = r.getOrElse(o)
    val postR: MOption[BTSVariableDeclaration] = postBTSVariableDeclaration(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSType(o: BTSType): MOption[BTSType] = {
    val preR: PreResult[BTSType] = preBTSType(o)
    val r: MOption[BTSType] = if (preR.continu) {
      val o2: BTSType = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[BTSType] = o2 match {
        case o2: BTSClassifier =>
          val r0: MOption[Classifier] = transformClassifier(o2.classifier)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(classifier = r0.getOrElse(o2.classifier)))
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
    val o2: BTSType = r.getOrElse(o)
    val postR: MOption[BTSType] = postBTSType(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSClassifier(o: BTSClassifier): MOption[BTSClassifier] = {
    val preR: PreResult[BTSClassifier] = preBTSClassifier(o)
    val r: MOption[BTSClassifier] = if (preR.continu) {
      val o2: BTSClassifier = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Classifier] = transformClassifier(o2.classifier)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(classifier = r0.getOrElse(o2.classifier)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSClassifier = r.getOrElse(o)
    val postR: MOption[BTSClassifier] = postBTSClassifier(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBLESSIntConst(o: BLESSIntConst): MOption[BLESSIntConst] = {
    val preR: PreResult[BLESSIntConst] = preBLESSIntConst(o)
    val r: MOption[BLESSIntConst] = if (preR.continu) {
      val o2: BLESSIntConst = preR.resultOpt.getOrElse(o)
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
    val o2: BLESSIntConst = r.getOrElse(o)
    val postR: MOption[BLESSIntConst] = postBLESSIntConst(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSStateDeclaration(o: BTSStateDeclaration): MOption[BTSStateDeclaration] = {
    val preR: PreResult[BTSStateDeclaration] = preBTSStateDeclaration(o)
    val r: MOption[BTSStateDeclaration] = if (preR.continu) {
      val o2: BTSStateDeclaration = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.id)
      val r1: MOption[Option[BTSAssertion]] = transformOption(o2.assertion, transformBTSAssertion _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(id = r0.getOrElse(o2.id), assertion = r1.getOrElse(o2.assertion)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSStateDeclaration = r.getOrElse(o)
    val postR: MOption[BTSStateDeclaration] = postBTSStateDeclaration(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSTransition(o: BTSTransition): MOption[BTSTransition] = {
    val preR: PreResult[BTSTransition] = preBTSTransition(o)
    val r: MOption[BTSTransition] = if (preR.continu) {
      val o2: BTSTransition = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[BTSTransitionLabel] = transformBTSTransitionLabel(o2.label)
      val r1: MOption[IS[Z, Name]] = transformISZ(o2.sourceStates, transformName _)
      val r2: MOption[Name] = transformName(o2.destState)
      val r3: MOption[Option[BTSTransitionCondition]] = transformOption(o2.transitionCondition, transformBTSTransitionCondition _)
      val r4: MOption[Option[BTSBehaviorActions]] = transformOption(o2.actions, transformBTSBehaviorActions _)
      val r5: MOption[Option[BTSAssertion]] = transformOption(o2.assertion, transformBTSAssertion _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty || r5.nonEmpty)
        MSome(o2(label = r0.getOrElse(o2.label), sourceStates = r1.getOrElse(o2.sourceStates), destState = r2.getOrElse(o2.destState), transitionCondition = r3.getOrElse(o2.transitionCondition), actions = r4.getOrElse(o2.actions), assertion = r5.getOrElse(o2.assertion)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSTransition = r.getOrElse(o)
    val postR: MOption[BTSTransition] = postBTSTransition(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSTransitionLabel(o: BTSTransitionLabel): MOption[BTSTransitionLabel] = {
    val preR: PreResult[BTSTransitionLabel] = preBTSTransitionLabel(o)
    val r: MOption[BTSTransitionLabel] = if (preR.continu) {
      val o2: BTSTransitionLabel = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.id)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(id = r0.getOrElse(o2.id)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSTransitionLabel = r.getOrElse(o)
    val postR: MOption[BTSTransitionLabel] = postBTSTransitionLabel(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSTransitionCondition(o: BTSTransitionCondition): MOption[BTSTransitionCondition] = {
    val preR: PreResult[BTSTransitionCondition] = preBTSTransitionCondition(o)
    val r: MOption[BTSTransitionCondition] = if (preR.continu) {
      val o2: BTSTransitionCondition = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[BTSTransitionCondition] = o2 match {
        case o2: BTSDispatchCondition =>
          val r0: MOption[IS[Z, BTSDispatchConjunction]] = transformISZ(o2.dispatchTriggers, transformBTSDispatchConjunction _)
          val r1: MOption[IS[Z, Name]] = transformISZ(o2.frozenPorts, transformName _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(dispatchTriggers = r0.getOrElse(o2.dispatchTriggers), frozenPorts = r1.getOrElse(o2.frozenPorts)))
          else
            MNone()
        case o2: BTSExecuteConditionExp =>
          val r0: MOption[BTSExp] = transformBTSExp(o2.exp)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(exp = r0.getOrElse(o2.exp)))
          else
            MNone()
        case o2: BTSExecuteConditionTimeout =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: BTSExecuteConditionOtherwise =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: BTSModeCondition =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: BTSInternalCondition =>
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
    val o2: BTSTransitionCondition = r.getOrElse(o)
    val postR: MOption[BTSTransitionCondition] = postBTSTransitionCondition(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSDispatchCondition(o: BTSDispatchCondition): MOption[BTSDispatchCondition] = {
    val preR: PreResult[BTSDispatchCondition] = preBTSDispatchCondition(o)
    val r: MOption[BTSDispatchCondition] = if (preR.continu) {
      val o2: BTSDispatchCondition = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, BTSDispatchConjunction]] = transformISZ(o2.dispatchTriggers, transformBTSDispatchConjunction _)
      val r1: MOption[IS[Z, Name]] = transformISZ(o2.frozenPorts, transformName _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(dispatchTriggers = r0.getOrElse(o2.dispatchTriggers), frozenPorts = r1.getOrElse(o2.frozenPorts)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSDispatchCondition = r.getOrElse(o)
    val postR: MOption[BTSDispatchCondition] = postBTSDispatchCondition(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSDispatchConjunction(o: BTSDispatchConjunction): MOption[BTSDispatchConjunction] = {
    val preR: PreResult[BTSDispatchConjunction] = preBTSDispatchConjunction(o)
    val r: MOption[BTSDispatchConjunction] = if (preR.continu) {
      val o2: BTSDispatchConjunction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, BTSDispatchTrigger]] = transformISZ(o2.conjunction, transformBTSDispatchTrigger _)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(conjunction = r0.getOrElse(o2.conjunction)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSDispatchConjunction = r.getOrElse(o)
    val postR: MOption[BTSDispatchConjunction] = postBTSDispatchConjunction(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSDispatchTrigger(o: BTSDispatchTrigger): MOption[BTSDispatchTrigger] = {
    val preR: PreResult[BTSDispatchTrigger] = preBTSDispatchTrigger(o)
    val r: MOption[BTSDispatchTrigger] = if (preR.continu) {
      val o2: BTSDispatchTrigger = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[BTSDispatchTrigger] = o2 match {
        case o2: BTSDispatchTriggerStop =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: BTSDispatchTriggerPort =>
          val r0: MOption[Name] = transformName(o2.port)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(port = r0.getOrElse(o2.port)))
          else
            MNone()
        case o2: BTSDispatchTriggerTimeout =>
          val r0: MOption[IS[Z, Name]] = transformISZ(o2.ports, transformName _)
          val r1: MOption[Option[BTSBehaviorTime]] = transformOption(o2.time, transformBTSBehaviorTime _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(ports = r0.getOrElse(o2.ports), time = r1.getOrElse(o2.time)))
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
    val o2: BTSDispatchTrigger = r.getOrElse(o)
    val postR: MOption[BTSDispatchTrigger] = postBTSDispatchTrigger(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSDispatchTriggerStop(o: BTSDispatchTriggerStop): MOption[BTSDispatchTriggerStop] = {
    val preR: PreResult[BTSDispatchTriggerStop] = preBTSDispatchTriggerStop(o)
    val r: MOption[BTSDispatchTriggerStop] = if (preR.continu) {
      val o2: BTSDispatchTriggerStop = preR.resultOpt.getOrElse(o)
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
    val o2: BTSDispatchTriggerStop = r.getOrElse(o)
    val postR: MOption[BTSDispatchTriggerStop] = postBTSDispatchTriggerStop(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSDispatchTriggerPort(o: BTSDispatchTriggerPort): MOption[BTSDispatchTriggerPort] = {
    val preR: PreResult[BTSDispatchTriggerPort] = preBTSDispatchTriggerPort(o)
    val r: MOption[BTSDispatchTriggerPort] = if (preR.continu) {
      val o2: BTSDispatchTriggerPort = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.port)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(port = r0.getOrElse(o2.port)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSDispatchTriggerPort = r.getOrElse(o)
    val postR: MOption[BTSDispatchTriggerPort] = postBTSDispatchTriggerPort(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSDispatchTriggerTimeout(o: BTSDispatchTriggerTimeout): MOption[BTSDispatchTriggerTimeout] = {
    val preR: PreResult[BTSDispatchTriggerTimeout] = preBTSDispatchTriggerTimeout(o)
    val r: MOption[BTSDispatchTriggerTimeout] = if (preR.continu) {
      val o2: BTSDispatchTriggerTimeout = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, Name]] = transformISZ(o2.ports, transformName _)
      val r1: MOption[Option[BTSBehaviorTime]] = transformOption(o2.time, transformBTSBehaviorTime _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(ports = r0.getOrElse(o2.ports), time = r1.getOrElse(o2.time)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSDispatchTriggerTimeout = r.getOrElse(o)
    val postR: MOption[BTSDispatchTriggerTimeout] = postBTSDispatchTriggerTimeout(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSExecuteCondition(o: BTSExecuteCondition): MOption[BTSExecuteCondition] = {
    val preR: PreResult[BTSExecuteCondition] = preBTSExecuteCondition(o)
    val r: MOption[BTSExecuteCondition] = if (preR.continu) {
      val o2: BTSExecuteCondition = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[BTSExecuteCondition] = o2 match {
        case o2: BTSExecuteConditionExp =>
          val r0: MOption[BTSExp] = transformBTSExp(o2.exp)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(exp = r0.getOrElse(o2.exp)))
          else
            MNone()
        case o2: BTSExecuteConditionTimeout =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: BTSExecuteConditionOtherwise =>
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
    val o2: BTSExecuteCondition = r.getOrElse(o)
    val postR: MOption[BTSExecuteCondition] = postBTSExecuteCondition(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSExecuteConditionExp(o: BTSExecuteConditionExp): MOption[BTSExecuteConditionExp] = {
    val preR: PreResult[BTSExecuteConditionExp] = preBTSExecuteConditionExp(o)
    val r: MOption[BTSExecuteConditionExp] = if (preR.continu) {
      val o2: BTSExecuteConditionExp = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[BTSExp] = transformBTSExp(o2.exp)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(exp = r0.getOrElse(o2.exp)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSExecuteConditionExp = r.getOrElse(o)
    val postR: MOption[BTSExecuteConditionExp] = postBTSExecuteConditionExp(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSExecuteConditionTimeout(o: BTSExecuteConditionTimeout): MOption[BTSExecuteConditionTimeout] = {
    val preR: PreResult[BTSExecuteConditionTimeout] = preBTSExecuteConditionTimeout(o)
    val r: MOption[BTSExecuteConditionTimeout] = if (preR.continu) {
      val o2: BTSExecuteConditionTimeout = preR.resultOpt.getOrElse(o)
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
    val o2: BTSExecuteConditionTimeout = r.getOrElse(o)
    val postR: MOption[BTSExecuteConditionTimeout] = postBTSExecuteConditionTimeout(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSExecuteConditionOtherwise(o: BTSExecuteConditionOtherwise): MOption[BTSExecuteConditionOtherwise] = {
    val preR: PreResult[BTSExecuteConditionOtherwise] = preBTSExecuteConditionOtherwise(o)
    val r: MOption[BTSExecuteConditionOtherwise] = if (preR.continu) {
      val o2: BTSExecuteConditionOtherwise = preR.resultOpt.getOrElse(o)
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
    val o2: BTSExecuteConditionOtherwise = r.getOrElse(o)
    val postR: MOption[BTSExecuteConditionOtherwise] = postBTSExecuteConditionOtherwise(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSModeCondition(o: BTSModeCondition): MOption[BTSModeCondition] = {
    val preR: PreResult[BTSModeCondition] = preBTSModeCondition(o)
    val r: MOption[BTSModeCondition] = if (preR.continu) {
      val o2: BTSModeCondition = preR.resultOpt.getOrElse(o)
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
    val o2: BTSModeCondition = r.getOrElse(o)
    val postR: MOption[BTSModeCondition] = postBTSModeCondition(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSInternalCondition(o: BTSInternalCondition): MOption[BTSInternalCondition] = {
    val preR: PreResult[BTSInternalCondition] = preBTSInternalCondition(o)
    val r: MOption[BTSInternalCondition] = if (preR.continu) {
      val o2: BTSInternalCondition = preR.resultOpt.getOrElse(o)
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
    val o2: BTSInternalCondition = r.getOrElse(o)
    val postR: MOption[BTSInternalCondition] = postBTSInternalCondition(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSAssertion(o: BTSAssertion): MOption[BTSAssertion] = {
    val preR: PreResult[BTSAssertion] = preBTSAssertion(o)
    val r: MOption[BTSAssertion] = if (preR.continu) {
      val o2: BTSAssertion = preR.resultOpt.getOrElse(o)
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
    val o2: BTSAssertion = r.getOrElse(o)
    val postR: MOption[BTSAssertion] = postBTSAssertion(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSBehaviorActions(o: BTSBehaviorActions): MOption[BTSBehaviorActions] = {
    val preR: PreResult[BTSBehaviorActions] = preBTSBehaviorActions(o)
    val r: MOption[BTSBehaviorActions] = if (preR.continu) {
      val o2: BTSBehaviorActions = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, BTSAssertedAction]] = transformISZ(o2.actions, transformBTSAssertedAction _)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(actions = r0.getOrElse(o2.actions)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSBehaviorActions = r.getOrElse(o)
    val postR: MOption[BTSBehaviorActions] = postBTSBehaviorActions(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSAssertedAction(o: BTSAssertedAction): MOption[BTSAssertedAction] = {
    val preR: PreResult[BTSAssertedAction] = preBTSAssertedAction(o)
    val r: MOption[BTSAssertedAction] = if (preR.continu) {
      val o2: BTSAssertedAction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Option[BTSAssertion]] = transformOption(o2.precondition, transformBTSAssertion _)
      val r1: MOption[BTSAction] = transformBTSAction(o2.action)
      val r2: MOption[Option[BTSAssertion]] = transformOption(o2.postcondition, transformBTSAssertion _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(precondition = r0.getOrElse(o2.precondition), action = r1.getOrElse(o2.action), postcondition = r2.getOrElse(o2.postcondition)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSAssertedAction = r.getOrElse(o)
    val postR: MOption[BTSAssertedAction] = postBTSAssertedAction(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSAction(o: BTSAction): MOption[BTSAction] = {
    val preR: PreResult[BTSAction] = preBTSAction(o)
    val r: MOption[BTSAction] = if (preR.continu) {
      val o2: BTSAction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[BTSAction] = o2 match {
        case o2: BTSSkipAction =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: BTSAssignmentAction =>
          val r0: MOption[BTSExp] = transformBTSExp(o2.lhs)
          val r1: MOption[BTSExp] = transformBTSExp(o2.rhs)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(lhs = r0.getOrElse(o2.lhs), rhs = r1.getOrElse(o2.rhs)))
          else
            MNone()
        case o2: BTSSubprogramCallAction =>
          val r0: MOption[Name] = transformName(o2.name)
          val r1: MOption[IS[Z, BTSFormalExpPair]] = transformISZ(o2.params, transformBTSFormalExpPair _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(name = r0.getOrElse(o2.name), params = r1.getOrElse(o2.params)))
          else
            MNone()
        case o2: BTSPortOutAction =>
          val r0: MOption[Name] = transformName(o2.name)
          val r1: MOption[Option[BTSExp]] = transformOption(o2.exp, transformBTSExp _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(name = r0.getOrElse(o2.name), exp = r1.getOrElse(o2.exp)))
          else
            MNone()
        case o2: BTSPortInAction =>
          val r0: MOption[Name] = transformName(o2.name)
          val r1: MOption[BTSExp] = transformBTSExp(o2.variable)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(name = r0.getOrElse(o2.name), variable = r1.getOrElse(o2.variable)))
          else
            MNone()
        case o2: BTSFrozenPortAction =>
          val r0: MOption[Name] = transformName(o2.portName)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(portName = r0.getOrElse(o2.portName)))
          else
            MNone()
        case o2: BTSIfBLESSAction =>
          val r0: MOption[Option[TODO]] = transformOption(o2.availability, transformTODO _)
          val r1: MOption[IS[Z, BTSGuardedAction]] = transformISZ(o2.alternatives, transformBTSGuardedAction _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(availability = r0.getOrElse(o2.availability), alternatives = r1.getOrElse(o2.alternatives)))
          else
            MNone()
        case o2: BTSIfBAAction =>
          val r0: MOption[BTSConditionalActions] = transformBTSConditionalActions(o2.ifBranch)
          val r1: MOption[IS[Z, BTSConditionalActions]] = transformISZ(o2.elseIfBranches, transformBTSConditionalActions _)
          val r2: MOption[Option[BTSBehaviorActions]] = transformOption(o2.elseBranch, transformBTSBehaviorActions _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(ifBranch = r0.getOrElse(o2.ifBranch), elseIfBranches = r1.getOrElse(o2.elseIfBranches), elseBranch = r2.getOrElse(o2.elseBranch)))
          else
            MNone()
        case o2: BTSExistentialLatticeQuantification =>
          val r0: MOption[IS[Z, BTSVariableDeclaration]] = transformISZ(o2.quantifiedVariables, transformBTSVariableDeclaration _)
          val r1: MOption[BTSBehaviorActions] = transformBTSBehaviorActions(o2.actions)
          val r2: MOption[Option[BTSBehaviorTime]] = transformOption(o2.timeout, transformBTSBehaviorTime _)
          val r3: MOption[Option[TODO]] = transformOption(o2.catchClause, transformTODO _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
            MSome(o2(quantifiedVariables = r0.getOrElse(o2.quantifiedVariables), actions = r1.getOrElse(o2.actions), timeout = r2.getOrElse(o2.timeout), catchClause = r3.getOrElse(o2.catchClause)))
          else
            MNone()
        case o2: BTSUniversalLatticeQuantification =>
          val r0: MOption[IS[Z, Name]] = transformISZ(o2.latticeVariables, transformName _)
          val r1: MOption[Option[TODO]] = transformOption(o2.range, transformTODO _)
          val r2: MOption[BTSExistentialLatticeQuantification] = transformBTSExistentialLatticeQuantification(o2.elq)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(latticeVariables = r0.getOrElse(o2.latticeVariables), range = r1.getOrElse(o2.range), elq = r2.getOrElse(o2.elq)))
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
    val o2: BTSAction = r.getOrElse(o)
    val postR: MOption[BTSAction] = postBTSAction(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSBasicAction(o: BTSBasicAction): MOption[BTSBasicAction] = {
    val preR: PreResult[BTSBasicAction] = preBTSBasicAction(o)
    val r: MOption[BTSBasicAction] = if (preR.continu) {
      val o2: BTSBasicAction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[BTSBasicAction] = o2 match {
        case o2: BTSSkipAction =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: BTSAssignmentAction =>
          val r0: MOption[BTSExp] = transformBTSExp(o2.lhs)
          val r1: MOption[BTSExp] = transformBTSExp(o2.rhs)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(lhs = r0.getOrElse(o2.lhs), rhs = r1.getOrElse(o2.rhs)))
          else
            MNone()
        case o2: BTSSubprogramCallAction =>
          val r0: MOption[Name] = transformName(o2.name)
          val r1: MOption[IS[Z, BTSFormalExpPair]] = transformISZ(o2.params, transformBTSFormalExpPair _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(name = r0.getOrElse(o2.name), params = r1.getOrElse(o2.params)))
          else
            MNone()
        case o2: BTSPortOutAction =>
          val r0: MOption[Name] = transformName(o2.name)
          val r1: MOption[Option[BTSExp]] = transformOption(o2.exp, transformBTSExp _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(name = r0.getOrElse(o2.name), exp = r1.getOrElse(o2.exp)))
          else
            MNone()
        case o2: BTSPortInAction =>
          val r0: MOption[Name] = transformName(o2.name)
          val r1: MOption[BTSExp] = transformBTSExp(o2.variable)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(name = r0.getOrElse(o2.name), variable = r1.getOrElse(o2.variable)))
          else
            MNone()
        case o2: BTSFrozenPortAction =>
          val r0: MOption[Name] = transformName(o2.portName)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(portName = r0.getOrElse(o2.portName)))
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
    val o2: BTSBasicAction = r.getOrElse(o)
    val postR: MOption[BTSBasicAction] = postBTSBasicAction(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSSkipAction(o: BTSSkipAction): MOption[BTSSkipAction] = {
    val preR: PreResult[BTSSkipAction] = preBTSSkipAction(o)
    val r: MOption[BTSSkipAction] = if (preR.continu) {
      val o2: BTSSkipAction = preR.resultOpt.getOrElse(o)
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
    val o2: BTSSkipAction = r.getOrElse(o)
    val postR: MOption[BTSSkipAction] = postBTSSkipAction(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSAssignmentAction(o: BTSAssignmentAction): MOption[BTSAssignmentAction] = {
    val preR: PreResult[BTSAssignmentAction] = preBTSAssignmentAction(o)
    val r: MOption[BTSAssignmentAction] = if (preR.continu) {
      val o2: BTSAssignmentAction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[BTSExp] = transformBTSExp(o2.lhs)
      val r1: MOption[BTSExp] = transformBTSExp(o2.rhs)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(lhs = r0.getOrElse(o2.lhs), rhs = r1.getOrElse(o2.rhs)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSAssignmentAction = r.getOrElse(o)
    val postR: MOption[BTSAssignmentAction] = postBTSAssignmentAction(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSCommunicationAction(o: BTSCommunicationAction): MOption[BTSCommunicationAction] = {
    val preR: PreResult[BTSCommunicationAction] = preBTSCommunicationAction(o)
    val r: MOption[BTSCommunicationAction] = if (preR.continu) {
      val o2: BTSCommunicationAction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[BTSCommunicationAction] = o2 match {
        case o2: BTSSubprogramCallAction =>
          val r0: MOption[Name] = transformName(o2.name)
          val r1: MOption[IS[Z, BTSFormalExpPair]] = transformISZ(o2.params, transformBTSFormalExpPair _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(name = r0.getOrElse(o2.name), params = r1.getOrElse(o2.params)))
          else
            MNone()
        case o2: BTSPortOutAction =>
          val r0: MOption[Name] = transformName(o2.name)
          val r1: MOption[Option[BTSExp]] = transformOption(o2.exp, transformBTSExp _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(name = r0.getOrElse(o2.name), exp = r1.getOrElse(o2.exp)))
          else
            MNone()
        case o2: BTSPortInAction =>
          val r0: MOption[Name] = transformName(o2.name)
          val r1: MOption[BTSExp] = transformBTSExp(o2.variable)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(name = r0.getOrElse(o2.name), variable = r1.getOrElse(o2.variable)))
          else
            MNone()
        case o2: BTSFrozenPortAction =>
          val r0: MOption[Name] = transformName(o2.portName)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(portName = r0.getOrElse(o2.portName)))
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
    val o2: BTSCommunicationAction = r.getOrElse(o)
    val postR: MOption[BTSCommunicationAction] = postBTSCommunicationAction(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSSubprogramCallAction(o: BTSSubprogramCallAction): MOption[BTSSubprogramCallAction] = {
    val preR: PreResult[BTSSubprogramCallAction] = preBTSSubprogramCallAction(o)
    val r: MOption[BTSSubprogramCallAction] = if (preR.continu) {
      val o2: BTSSubprogramCallAction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.name)
      val r1: MOption[IS[Z, BTSFormalExpPair]] = transformISZ(o2.params, transformBTSFormalExpPair _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(name = r0.getOrElse(o2.name), params = r1.getOrElse(o2.params)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSSubprogramCallAction = r.getOrElse(o)
    val postR: MOption[BTSSubprogramCallAction] = postBTSSubprogramCallAction(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSPortOutAction(o: BTSPortOutAction): MOption[BTSPortOutAction] = {
    val preR: PreResult[BTSPortOutAction] = preBTSPortOutAction(o)
    val r: MOption[BTSPortOutAction] = if (preR.continu) {
      val o2: BTSPortOutAction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.name)
      val r1: MOption[Option[BTSExp]] = transformOption(o2.exp, transformBTSExp _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(name = r0.getOrElse(o2.name), exp = r1.getOrElse(o2.exp)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSPortOutAction = r.getOrElse(o)
    val postR: MOption[BTSPortOutAction] = postBTSPortOutAction(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSPortInAction(o: BTSPortInAction): MOption[BTSPortInAction] = {
    val preR: PreResult[BTSPortInAction] = preBTSPortInAction(o)
    val r: MOption[BTSPortInAction] = if (preR.continu) {
      val o2: BTSPortInAction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.name)
      val r1: MOption[BTSExp] = transformBTSExp(o2.variable)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(name = r0.getOrElse(o2.name), variable = r1.getOrElse(o2.variable)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSPortInAction = r.getOrElse(o)
    val postR: MOption[BTSPortInAction] = postBTSPortInAction(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSFrozenPortAction(o: BTSFrozenPortAction): MOption[BTSFrozenPortAction] = {
    val preR: PreResult[BTSFrozenPortAction] = preBTSFrozenPortAction(o)
    val r: MOption[BTSFrozenPortAction] = if (preR.continu) {
      val o2: BTSFrozenPortAction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.portName)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(portName = r0.getOrElse(o2.portName)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSFrozenPortAction = r.getOrElse(o)
    val postR: MOption[BTSFrozenPortAction] = postBTSFrozenPortAction(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSControlAction(o: BTSControlAction): MOption[BTSControlAction] = {
    val preR: PreResult[BTSControlAction] = preBTSControlAction(o)
    val r: MOption[BTSControlAction] = if (preR.continu) {
      val o2: BTSControlAction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[BTSControlAction] = o2 match {
        case o2: BTSIfBLESSAction =>
          val r0: MOption[Option[TODO]] = transformOption(o2.availability, transformTODO _)
          val r1: MOption[IS[Z, BTSGuardedAction]] = transformISZ(o2.alternatives, transformBTSGuardedAction _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(availability = r0.getOrElse(o2.availability), alternatives = r1.getOrElse(o2.alternatives)))
          else
            MNone()
        case o2: BTSIfBAAction =>
          val r0: MOption[BTSConditionalActions] = transformBTSConditionalActions(o2.ifBranch)
          val r1: MOption[IS[Z, BTSConditionalActions]] = transformISZ(o2.elseIfBranches, transformBTSConditionalActions _)
          val r2: MOption[Option[BTSBehaviorActions]] = transformOption(o2.elseBranch, transformBTSBehaviorActions _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(ifBranch = r0.getOrElse(o2.ifBranch), elseIfBranches = r1.getOrElse(o2.elseIfBranches), elseBranch = r2.getOrElse(o2.elseBranch)))
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
    val o2: BTSControlAction = r.getOrElse(o)
    val postR: MOption[BTSControlAction] = postBTSControlAction(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSIfBLESSAction(o: BTSIfBLESSAction): MOption[BTSIfBLESSAction] = {
    val preR: PreResult[BTSIfBLESSAction] = preBTSIfBLESSAction(o)
    val r: MOption[BTSIfBLESSAction] = if (preR.continu) {
      val o2: BTSIfBLESSAction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Option[TODO]] = transformOption(o2.availability, transformTODO _)
      val r1: MOption[IS[Z, BTSGuardedAction]] = transformISZ(o2.alternatives, transformBTSGuardedAction _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(availability = r0.getOrElse(o2.availability), alternatives = r1.getOrElse(o2.alternatives)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSIfBLESSAction = r.getOrElse(o)
    val postR: MOption[BTSIfBLESSAction] = postBTSIfBLESSAction(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSGuardedAction(o: BTSGuardedAction): MOption[BTSGuardedAction] = {
    val preR: PreResult[BTSGuardedAction] = preBTSGuardedAction(o)
    val r: MOption[BTSGuardedAction] = if (preR.continu) {
      val o2: BTSGuardedAction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[BTSExp] = transformBTSExp(o2.guard)
      val r1: MOption[BTSAssertedAction] = transformBTSAssertedAction(o2.action)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(guard = r0.getOrElse(o2.guard), action = r1.getOrElse(o2.action)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSGuardedAction = r.getOrElse(o)
    val postR: MOption[BTSGuardedAction] = postBTSGuardedAction(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSIfBAAction(o: BTSIfBAAction): MOption[BTSIfBAAction] = {
    val preR: PreResult[BTSIfBAAction] = preBTSIfBAAction(o)
    val r: MOption[BTSIfBAAction] = if (preR.continu) {
      val o2: BTSIfBAAction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[BTSConditionalActions] = transformBTSConditionalActions(o2.ifBranch)
      val r1: MOption[IS[Z, BTSConditionalActions]] = transformISZ(o2.elseIfBranches, transformBTSConditionalActions _)
      val r2: MOption[Option[BTSBehaviorActions]] = transformOption(o2.elseBranch, transformBTSBehaviorActions _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(ifBranch = r0.getOrElse(o2.ifBranch), elseIfBranches = r1.getOrElse(o2.elseIfBranches), elseBranch = r2.getOrElse(o2.elseBranch)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSIfBAAction = r.getOrElse(o)
    val postR: MOption[BTSIfBAAction] = postBTSIfBAAction(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSConditionalActions(o: BTSConditionalActions): MOption[BTSConditionalActions] = {
    val preR: PreResult[BTSConditionalActions] = preBTSConditionalActions(o)
    val r: MOption[BTSConditionalActions] = if (preR.continu) {
      val o2: BTSConditionalActions = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[BTSExp] = transformBTSExp(o2.cond)
      val r1: MOption[BTSBehaviorActions] = transformBTSBehaviorActions(o2.actions)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(cond = r0.getOrElse(o2.cond), actions = r1.getOrElse(o2.actions)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSConditionalActions = r.getOrElse(o)
    val postR: MOption[BTSConditionalActions] = postBTSConditionalActions(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSQuantificationActions(o: BTSQuantificationActions): MOption[BTSQuantificationActions] = {
    val preR: PreResult[BTSQuantificationActions] = preBTSQuantificationActions(o)
    val r: MOption[BTSQuantificationActions] = if (preR.continu) {
      val o2: BTSQuantificationActions = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[BTSQuantificationActions] = o2 match {
        case o2: BTSExistentialLatticeQuantification =>
          val r0: MOption[IS[Z, BTSVariableDeclaration]] = transformISZ(o2.quantifiedVariables, transformBTSVariableDeclaration _)
          val r1: MOption[BTSBehaviorActions] = transformBTSBehaviorActions(o2.actions)
          val r2: MOption[Option[BTSBehaviorTime]] = transformOption(o2.timeout, transformBTSBehaviorTime _)
          val r3: MOption[Option[TODO]] = transformOption(o2.catchClause, transformTODO _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
            MSome(o2(quantifiedVariables = r0.getOrElse(o2.quantifiedVariables), actions = r1.getOrElse(o2.actions), timeout = r2.getOrElse(o2.timeout), catchClause = r3.getOrElse(o2.catchClause)))
          else
            MNone()
        case o2: BTSUniversalLatticeQuantification =>
          val r0: MOption[IS[Z, Name]] = transformISZ(o2.latticeVariables, transformName _)
          val r1: MOption[Option[TODO]] = transformOption(o2.range, transformTODO _)
          val r2: MOption[BTSExistentialLatticeQuantification] = transformBTSExistentialLatticeQuantification(o2.elq)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(latticeVariables = r0.getOrElse(o2.latticeVariables), range = r1.getOrElse(o2.range), elq = r2.getOrElse(o2.elq)))
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
    val o2: BTSQuantificationActions = r.getOrElse(o)
    val postR: MOption[BTSQuantificationActions] = postBTSQuantificationActions(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSExistentialLatticeQuantification(o: BTSExistentialLatticeQuantification): MOption[BTSExistentialLatticeQuantification] = {
    val preR: PreResult[BTSExistentialLatticeQuantification] = preBTSExistentialLatticeQuantification(o)
    val r: MOption[BTSExistentialLatticeQuantification] = if (preR.continu) {
      val o2: BTSExistentialLatticeQuantification = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, BTSVariableDeclaration]] = transformISZ(o2.quantifiedVariables, transformBTSVariableDeclaration _)
      val r1: MOption[BTSBehaviorActions] = transformBTSBehaviorActions(o2.actions)
      val r2: MOption[Option[BTSBehaviorTime]] = transformOption(o2.timeout, transformBTSBehaviorTime _)
      val r3: MOption[Option[TODO]] = transformOption(o2.catchClause, transformTODO _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
        MSome(o2(quantifiedVariables = r0.getOrElse(o2.quantifiedVariables), actions = r1.getOrElse(o2.actions), timeout = r2.getOrElse(o2.timeout), catchClause = r3.getOrElse(o2.catchClause)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSExistentialLatticeQuantification = r.getOrElse(o)
    val postR: MOption[BTSExistentialLatticeQuantification] = postBTSExistentialLatticeQuantification(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSUniversalLatticeQuantification(o: BTSUniversalLatticeQuantification): MOption[BTSUniversalLatticeQuantification] = {
    val preR: PreResult[BTSUniversalLatticeQuantification] = preBTSUniversalLatticeQuantification(o)
    val r: MOption[BTSUniversalLatticeQuantification] = if (preR.continu) {
      val o2: BTSUniversalLatticeQuantification = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, Name]] = transformISZ(o2.latticeVariables, transformName _)
      val r1: MOption[Option[TODO]] = transformOption(o2.range, transformTODO _)
      val r2: MOption[BTSExistentialLatticeQuantification] = transformBTSExistentialLatticeQuantification(o2.elq)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(latticeVariables = r0.getOrElse(o2.latticeVariables), range = r1.getOrElse(o2.range), elq = r2.getOrElse(o2.elq)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSUniversalLatticeQuantification = r.getOrElse(o)
    val postR: MOption[BTSUniversalLatticeQuantification] = postBTSUniversalLatticeQuantification(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSExp(o: BTSExp): MOption[BTSExp] = {
    val preR: PreResult[BTSExp] = preBTSExp(o)
    val r: MOption[BTSExp] = if (preR.continu) {
      val o2: BTSExp = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[BTSExp] = o2 match {
        case o2: BTSUnaryExp =>
          val r0: MOption[BTSExp] = transformBTSExp(o2.exp)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(exp = r0.getOrElse(o2.exp)))
          else
            MNone()
        case o2: BTSBinaryExp =>
          val r0: MOption[BTSExp] = transformBTSExp(o2.lhs)
          val r1: MOption[BTSExp] = transformBTSExp(o2.rhs)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(lhs = r0.getOrElse(o2.lhs), rhs = r1.getOrElse(o2.rhs)))
          else
            MNone()
        case o2: BTSLiteralExp =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: BTSNameExp =>
          val r0: MOption[Name] = transformName(o2.name)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(name = r0.getOrElse(o2.name)))
          else
            MNone()
        case o2: BTSIndexingExp =>
          val r0: MOption[BTSExp] = transformBTSExp(o2.exp)
          val r1: MOption[IS[Z, BTSExp]] = transformISZ(o2.indices, transformBTSExp _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(exp = r0.getOrElse(o2.exp), indices = r1.getOrElse(o2.indices)))
          else
            MNone()
        case o2: BTSAccessExp =>
          val r0: MOption[BTSExp] = transformBTSExp(o2.exp)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(exp = r0.getOrElse(o2.exp)))
          else
            MNone()
        case o2: BTSFunctionCall =>
          val r0: MOption[Name] = transformName(o2.name)
          val r1: MOption[IS[Z, BTSFormalExpPair]] = transformISZ(o2.args, transformBTSFormalExpPair _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(name = r0.getOrElse(o2.name), args = r1.getOrElse(o2.args)))
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
    val o2: BTSExp = r.getOrElse(o)
    val postR: MOption[BTSExp] = postBTSExp(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSUnaryExp(o: BTSUnaryExp): MOption[BTSUnaryExp] = {
    val preR: PreResult[BTSUnaryExp] = preBTSUnaryExp(o)
    val r: MOption[BTSUnaryExp] = if (preR.continu) {
      val o2: BTSUnaryExp = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[BTSExp] = transformBTSExp(o2.exp)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(exp = r0.getOrElse(o2.exp)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSUnaryExp = r.getOrElse(o)
    val postR: MOption[BTSUnaryExp] = postBTSUnaryExp(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSBinaryExp(o: BTSBinaryExp): MOption[BTSBinaryExp] = {
    val preR: PreResult[BTSBinaryExp] = preBTSBinaryExp(o)
    val r: MOption[BTSBinaryExp] = if (preR.continu) {
      val o2: BTSBinaryExp = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[BTSExp] = transformBTSExp(o2.lhs)
      val r1: MOption[BTSExp] = transformBTSExp(o2.rhs)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(lhs = r0.getOrElse(o2.lhs), rhs = r1.getOrElse(o2.rhs)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSBinaryExp = r.getOrElse(o)
    val postR: MOption[BTSBinaryExp] = postBTSBinaryExp(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSLiteralExp(o: BTSLiteralExp): MOption[BTSLiteralExp] = {
    val preR: PreResult[BTSLiteralExp] = preBTSLiteralExp(o)
    val r: MOption[BTSLiteralExp] = if (preR.continu) {
      val o2: BTSLiteralExp = preR.resultOpt.getOrElse(o)
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
    val o2: BTSLiteralExp = r.getOrElse(o)
    val postR: MOption[BTSLiteralExp] = postBTSLiteralExp(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSNameExp(o: BTSNameExp): MOption[BTSNameExp] = {
    val preR: PreResult[BTSNameExp] = preBTSNameExp(o)
    val r: MOption[BTSNameExp] = if (preR.continu) {
      val o2: BTSNameExp = preR.resultOpt.getOrElse(o)
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
    val o2: BTSNameExp = r.getOrElse(o)
    val postR: MOption[BTSNameExp] = postBTSNameExp(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSIndexingExp(o: BTSIndexingExp): MOption[BTSIndexingExp] = {
    val preR: PreResult[BTSIndexingExp] = preBTSIndexingExp(o)
    val r: MOption[BTSIndexingExp] = if (preR.continu) {
      val o2: BTSIndexingExp = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[BTSExp] = transformBTSExp(o2.exp)
      val r1: MOption[IS[Z, BTSExp]] = transformISZ(o2.indices, transformBTSExp _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(exp = r0.getOrElse(o2.exp), indices = r1.getOrElse(o2.indices)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSIndexingExp = r.getOrElse(o)
    val postR: MOption[BTSIndexingExp] = postBTSIndexingExp(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSAccessExp(o: BTSAccessExp): MOption[BTSAccessExp] = {
    val preR: PreResult[BTSAccessExp] = preBTSAccessExp(o)
    val r: MOption[BTSAccessExp] = if (preR.continu) {
      val o2: BTSAccessExp = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[BTSExp] = transformBTSExp(o2.exp)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(exp = r0.getOrElse(o2.exp)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSAccessExp = r.getOrElse(o)
    val postR: MOption[BTSAccessExp] = postBTSAccessExp(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSFunctionCall(o: BTSFunctionCall): MOption[BTSFunctionCall] = {
    val preR: PreResult[BTSFunctionCall] = preBTSFunctionCall(o)
    val r: MOption[BTSFunctionCall] = if (preR.continu) {
      val o2: BTSFunctionCall = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.name)
      val r1: MOption[IS[Z, BTSFormalExpPair]] = transformISZ(o2.args, transformBTSFormalExpPair _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(name = r0.getOrElse(o2.name), args = r1.getOrElse(o2.args)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSFunctionCall = r.getOrElse(o)
    val postR: MOption[BTSFunctionCall] = postBTSFunctionCall(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSFormalExpPair(o: BTSFormalExpPair): MOption[BTSFormalExpPair] = {
    val preR: PreResult[BTSFormalExpPair] = preBTSFormalExpPair(o)
    val r: MOption[BTSFormalExpPair] = if (preR.continu) {
      val o2: BTSFormalExpPair = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Option[Name]] = transformOption(o2.paramName, transformName _)
      val r1: MOption[Option[BTSExp]] = transformOption(o2.exp, transformBTSExp _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(paramName = r0.getOrElse(o2.paramName), exp = r1.getOrElse(o2.exp)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSFormalExpPair = r.getOrElse(o)
    val postR: MOption[BTSFormalExpPair] = postBTSFormalExpPair(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSBehaviorTime(o: BTSBehaviorTime): MOption[BTSBehaviorTime] = {
    val preR: PreResult[BTSBehaviorTime] = preBTSBehaviorTime(o)
    val r: MOption[BTSBehaviorTime] = if (preR.continu) {
      val o2: BTSBehaviorTime = preR.resultOpt.getOrElse(o)
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
    val o2: BTSBehaviorTime = r.getOrElse(o)
    val postR: MOption[BTSBehaviorTime] = postBTSBehaviorTime(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformTODO(o: TODO): MOption[TODO] = {
    val preR: PreResult[TODO] = preTODO(o)
    val r: MOption[TODO] = if (preR.continu) {
      val o2: TODO = preR.resultOpt.getOrElse(o)
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
    val o2: TODO = r.getOrElse(o)
    val postR: MOption[TODO] = postTODO(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformAttr(o: Attr): MOption[Attr] = {
    val preR: PreResult[Attr] = preAttr(o)
    val r: MOption[Attr] = if (preR.continu) {
      val o2: Attr = preR.resultOpt.getOrElse(o)
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
    val o2: Attr = r.getOrElse(o)
    val postR: MOption[Attr] = postAttr(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastExpLitString(o: org.sireum.lang.ast.Exp.LitString): MOption[org.sireum.lang.ast.Exp.LitString] = {
    val preR: PreResult[org.sireum.lang.ast.Exp.LitString] = pre_langastExpLitString(o) match {
     case PreResult(continu, MSome(r: org.sireum.lang.ast.Exp.LitString)) => PreResult(continu, MSome[org.sireum.lang.ast.Exp.LitString](r))
     case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.Exp.LitString")
     case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.Exp.LitString]())
    }
    val r: MOption[org.sireum.lang.ast.Exp.LitString] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Exp.LitString = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(attr = r0.getOrElse(o2.attr)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.Exp.LitString = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.Exp.LitString] = post_langastExpLitString(o2) match {
     case MSome(result: org.sireum.lang.ast.Exp.LitString) => MSome[org.sireum.lang.ast.Exp.LitString](result)
     case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.Exp.LitString")
     case _ => MNone[org.sireum.lang.ast.Exp.LitString]()
    }
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastTypeNamed(o: org.sireum.lang.ast.Type.Named): MOption[org.sireum.lang.ast.Type.Named] = {
    val preR: PreResult[org.sireum.lang.ast.Type.Named] = pre_langastTypeNamed(o) match {
     case PreResult(continu, MSome(r: org.sireum.lang.ast.Type.Named)) => PreResult(continu, MSome[org.sireum.lang.ast.Type.Named](r))
     case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.Type.Named")
     case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.Type.Named]())
    }
    val r: MOption[org.sireum.lang.ast.Type.Named] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Type.Named = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[org.sireum.lang.ast.Name] = transform_langastName(o2.name)
      val r1: MOption[IS[Z, org.sireum.lang.ast.Type]] = transformISZ(o2.typeArgs, transform_langastType _)
      val r2: MOption[org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(o2.attr)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(name = r0.getOrElse(o2.name), typeArgs = r1.getOrElse(o2.typeArgs), attr = r2.getOrElse(o2.attr)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.Type.Named = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.Type.Named] = post_langastTypeNamed(o2) match {
     case MSome(result: org.sireum.lang.ast.Type.Named) => MSome[org.sireum.lang.ast.Type.Named](result)
     case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.Type.Named")
     case _ => MNone[org.sireum.lang.ast.Type.Named]()
    }
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastExpIdent(o: org.sireum.lang.ast.Exp.Ident): MOption[org.sireum.lang.ast.Exp.Ident] = {
    val preR: PreResult[org.sireum.lang.ast.Exp.Ident] = pre_langastExpIdent(o) match {
     case PreResult(continu, MSome(r: org.sireum.lang.ast.Exp.Ident)) => PreResult(continu, MSome[org.sireum.lang.ast.Exp.Ident](r))
     case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.Exp.Ident")
     case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.Exp.Ident]())
    }
    val r: MOption[org.sireum.lang.ast.Exp.Ident] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Exp.Ident = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[org.sireum.lang.ast.Id] = transform_langastId(o2.id)
      val r1: MOption[org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(o2.attr)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(id = r0.getOrElse(o2.id), attr = r1.getOrElse(o2.attr)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.Exp.Ident = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.Exp.Ident] = post_langastExpIdent(o2) match {
     case MSome(result: org.sireum.lang.ast.Exp.Ident) => MSome[org.sireum.lang.ast.Exp.Ident](result)
     case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.Exp.Ident")
     case _ => MNone[org.sireum.lang.ast.Exp.Ident]()
    }
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastStmtBlock(o: org.sireum.lang.ast.Stmt.Block): MOption[org.sireum.lang.ast.Stmt.Block] = {
    val preR: PreResult[org.sireum.lang.ast.Stmt.Block] = pre_langastStmtBlock(o) match {
     case PreResult(continu, MSome(r: org.sireum.lang.ast.Stmt.Block)) => PreResult(continu, MSome[org.sireum.lang.ast.Stmt.Block](r))
     case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.Stmt.Block")
     case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.Stmt.Block]())
    }
    val r: MOption[org.sireum.lang.ast.Stmt.Block] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Stmt.Block = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[org.sireum.lang.ast.Body] = transform_langastBody(o2.body)
      val r1: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(body = r0.getOrElse(o2.body), attr = r1.getOrElse(o2.attr)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.Stmt.Block = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.Stmt.Block] = post_langastStmtBlock(o2) match {
     case MSome(result: org.sireum.lang.ast.Stmt.Block) => MSome[org.sireum.lang.ast.Stmt.Block](result)
     case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.Stmt.Block")
     case _ => MNone[org.sireum.lang.ast.Stmt.Block]()
    }
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastExpLitZ(o: org.sireum.lang.ast.Exp.LitZ): MOption[org.sireum.lang.ast.Exp.LitZ] = {
    val preR: PreResult[org.sireum.lang.ast.Exp.LitZ] = pre_langastExpLitZ(o) match {
     case PreResult(continu, MSome(r: org.sireum.lang.ast.Exp.LitZ)) => PreResult(continu, MSome[org.sireum.lang.ast.Exp.LitZ](r))
     case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.Exp.LitZ")
     case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.Exp.LitZ]())
    }
    val r: MOption[org.sireum.lang.ast.Exp.LitZ] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Exp.LitZ = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(attr = r0.getOrElse(o2.attr)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.Exp.LitZ = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.Exp.LitZ] = post_langastExpLitZ(o2) match {
     case MSome(result: org.sireum.lang.ast.Exp.LitZ) => MSome[org.sireum.lang.ast.Exp.LitZ](result)
     case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.Exp.LitZ")
     case _ => MNone[org.sireum.lang.ast.Exp.LitZ]()
    }
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastPatternStructure(o: org.sireum.lang.ast.Pattern.Structure): MOption[org.sireum.lang.ast.Pattern.Structure] = {
    val preR: PreResult[org.sireum.lang.ast.Pattern.Structure] = pre_langastPatternStructure(o) match {
     case PreResult(continu, MSome(r: org.sireum.lang.ast.Pattern.Structure)) => PreResult(continu, MSome[org.sireum.lang.ast.Pattern.Structure](r))
     case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.Pattern.Structure")
     case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.Pattern.Structure]())
    }
    val r: MOption[org.sireum.lang.ast.Pattern.Structure] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Pattern.Structure = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Option[org.sireum.lang.ast.Id]] = transformOption(o2.idOpt, transform_langastId _)
      val r1: MOption[Option[org.sireum.lang.ast.Name]] = transformOption(o2.nameOpt, transform_langastName _)
      val r2: MOption[IS[Z, org.sireum.lang.ast.Pattern]] = transformISZ(o2.patterns, transform_langastPattern _)
      val r3: MOption[org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(o2.attr)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
        MSome(o2(idOpt = r0.getOrElse(o2.idOpt), nameOpt = r1.getOrElse(o2.nameOpt), patterns = r2.getOrElse(o2.patterns), attr = r3.getOrElse(o2.attr)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.Pattern.Structure = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.Pattern.Structure] = post_langastPatternStructure(o2) match {
     case MSome(result: org.sireum.lang.ast.Pattern.Structure) => MSome[org.sireum.lang.ast.Pattern.Structure](result)
     case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.Pattern.Structure")
     case _ => MNone[org.sireum.lang.ast.Pattern.Structure]()
    }
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastProofAstStepAssume(o: org.sireum.lang.ast.ProofAst.Step.Assume): MOption[org.sireum.lang.ast.ProofAst.Step.Assume] = {
    val preR: PreResult[org.sireum.lang.ast.ProofAst.Step.Assume] = pre_langastProofAstStepAssume(o) match {
     case PreResult(continu, MSome(r: org.sireum.lang.ast.ProofAst.Step.Assume)) => PreResult(continu, MSome[org.sireum.lang.ast.ProofAst.Step.Assume](r))
     case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.ProofAst.Step.Assume")
     case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.ProofAst.Step.Assume]())
    }
    val r: MOption[org.sireum.lang.ast.ProofAst.Step.Assume] = if (preR.continu) {
      val o2: org.sireum.lang.ast.ProofAst.Step.Assume = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[org.sireum.lang.ast.ProofAst.StepId] = transform_langastProofAstStepId(o2.id)
      val r1: MOption[org.sireum.lang.ast.Exp] = transform_langastExp(o2.claim)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(id = r0.getOrElse(o2.id), claim = r1.getOrElse(o2.claim)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.ProofAst.Step.Assume = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.ProofAst.Step.Assume] = post_langastProofAstStepAssume(o2) match {
     case MSome(result: org.sireum.lang.ast.ProofAst.Step.Assume) => MSome[org.sireum.lang.ast.ProofAst.Step.Assume](result)
     case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.ProofAst.Step.Assume")
     case _ => MNone[org.sireum.lang.ast.ProofAst.Step.Assume]()
    }
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastExpInvoke(o: org.sireum.lang.ast.Exp.Invoke): MOption[org.sireum.lang.ast.Exp.Invoke] = {
    val preR: PreResult[org.sireum.lang.ast.Exp.Invoke] = pre_langastExpInvoke(o) match {
     case PreResult(continu, MSome(r: org.sireum.lang.ast.Exp.Invoke)) => PreResult(continu, MSome[org.sireum.lang.ast.Exp.Invoke](r))
     case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.Exp.Invoke")
     case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.Exp.Invoke]())
    }
    val r: MOption[org.sireum.lang.ast.Exp.Invoke] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Exp.Invoke = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Option[org.sireum.lang.ast.Exp]] = transformOption(o2.receiverOpt, transform_langastExp _)
      val r1: MOption[org.sireum.lang.ast.Exp.Ident] = transform_langastExpIdent(o2.ident)
      val r2: MOption[IS[Z, org.sireum.lang.ast.Type]] = transformISZ(o2.targs, transform_langastType _)
      val r3: MOption[IS[Z, org.sireum.lang.ast.Exp]] = transformISZ(o2.args, transform_langastExp _)
      val r4: MOption[org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(o2.attr)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
        MSome(o2(receiverOpt = r0.getOrElse(o2.receiverOpt), ident = r1.getOrElse(o2.ident), targs = r2.getOrElse(o2.targs), args = r3.getOrElse(o2.args), attr = r4.getOrElse(o2.attr)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.Exp.Invoke = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.Exp.Invoke] = post_langastExpInvoke(o2) match {
     case MSome(result: org.sireum.lang.ast.Exp.Invoke) => MSome[org.sireum.lang.ast.Exp.Invoke](result)
     case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.Exp.Invoke")
     case _ => MNone[org.sireum.lang.ast.Exp.Invoke]()
    }
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastExpInvokeNamed(o: org.sireum.lang.ast.Exp.InvokeNamed): MOption[org.sireum.lang.ast.Exp.InvokeNamed] = {
    val preR: PreResult[org.sireum.lang.ast.Exp.InvokeNamed] = pre_langastExpInvokeNamed(o) match {
     case PreResult(continu, MSome(r: org.sireum.lang.ast.Exp.InvokeNamed)) => PreResult(continu, MSome[org.sireum.lang.ast.Exp.InvokeNamed](r))
     case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.Exp.InvokeNamed")
     case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.Exp.InvokeNamed]())
    }
    val r: MOption[org.sireum.lang.ast.Exp.InvokeNamed] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Exp.InvokeNamed = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Option[org.sireum.lang.ast.Exp]] = transformOption(o2.receiverOpt, transform_langastExp _)
      val r1: MOption[org.sireum.lang.ast.Exp.Ident] = transform_langastExpIdent(o2.ident)
      val r2: MOption[IS[Z, org.sireum.lang.ast.Type]] = transformISZ(o2.targs, transform_langastType _)
      val r3: MOption[IS[Z, org.sireum.lang.ast.NamedArg]] = transformISZ(o2.args, transform_langastNamedArg _)
      val r4: MOption[org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(o2.attr)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
        MSome(o2(receiverOpt = r0.getOrElse(o2.receiverOpt), ident = r1.getOrElse(o2.ident), targs = r2.getOrElse(o2.targs), args = r3.getOrElse(o2.args), attr = r4.getOrElse(o2.attr)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.Exp.InvokeNamed = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.Exp.InvokeNamed] = post_langastExpInvokeNamed(o2) match {
     case MSome(result: org.sireum.lang.ast.Exp.InvokeNamed) => MSome[org.sireum.lang.ast.Exp.InvokeNamed](result)
     case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.Exp.InvokeNamed")
     case _ => MNone[org.sireum.lang.ast.Exp.InvokeNamed]()
    }
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastExpEta(o: org.sireum.lang.ast.Exp.Eta): MOption[org.sireum.lang.ast.Exp.Eta] = {
    val preR: PreResult[org.sireum.lang.ast.Exp.Eta] = pre_langastExpEta(o) match {
     case PreResult(continu, MSome(r: org.sireum.lang.ast.Exp.Eta)) => PreResult(continu, MSome[org.sireum.lang.ast.Exp.Eta](r))
     case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.Exp.Eta")
     case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.Exp.Eta]())
    }
    val r: MOption[org.sireum.lang.ast.Exp.Eta] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Exp.Eta = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[org.sireum.lang.ast.Exp.Ref] = transform_langastExpRef(o2.ref)
      val r1: MOption[org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(o2.attr)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(ref = r0.getOrElse(o2.ref), attr = r1.getOrElse(o2.attr)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.Exp.Eta = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.Exp.Eta] = post_langastExpEta(o2) match {
     case MSome(result: org.sireum.lang.ast.Exp.Eta) => MSome[org.sireum.lang.ast.Exp.Eta](result)
     case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.Exp.Eta")
     case _ => MNone[org.sireum.lang.ast.Exp.Eta]()
    }
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastExpFun(o: org.sireum.lang.ast.Exp.Fun): MOption[org.sireum.lang.ast.Exp.Fun] = {
    val preR: PreResult[org.sireum.lang.ast.Exp.Fun] = pre_langastExpFun(o) match {
     case PreResult(continu, MSome(r: org.sireum.lang.ast.Exp.Fun)) => PreResult(continu, MSome[org.sireum.lang.ast.Exp.Fun](r))
     case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.Exp.Fun")
     case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.Exp.Fun]())
    }
    val r: MOption[org.sireum.lang.ast.Exp.Fun] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Exp.Fun = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, org.sireum.lang.ast.Exp.Fun.Param]] = transformISZ(o2.params, transform_langastExpFunParam _)
      val r1: MOption[org.sireum.lang.ast.AssignExp] = transform_langastAssignExp(o2.exp)
      val r2: MOption[org.sireum.lang.ast.TypedAttr] = transform_langastTypedAttr(o2.attr)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(params = r0.getOrElse(o2.params), exp = r1.getOrElse(o2.exp), attr = r2.getOrElse(o2.attr)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.Exp.Fun = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.Exp.Fun] = post_langastExpFun(o2) match {
     case MSome(result: org.sireum.lang.ast.Exp.Fun) => MSome[org.sireum.lang.ast.Exp.Fun](result)
     case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.Exp.Fun")
     case _ => MNone[org.sireum.lang.ast.Exp.Fun]()
    }
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastResolvedInfoLocalVar(o: org.sireum.lang.ast.ResolvedInfo.LocalVar): MOption[org.sireum.lang.ast.ResolvedInfo.LocalVar] = {
    val preR: PreResult[org.sireum.lang.ast.ResolvedInfo.LocalVar] = pre_langastResolvedInfoLocalVar(o) match {
     case PreResult(continu, MSome(r: org.sireum.lang.ast.ResolvedInfo.LocalVar)) => PreResult(continu, MSome[org.sireum.lang.ast.ResolvedInfo.LocalVar](r))
     case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.ResolvedInfo.LocalVar")
     case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.ResolvedInfo.LocalVar]())
    }
    val r: MOption[org.sireum.lang.ast.ResolvedInfo.LocalVar] = if (preR.continu) {
      val o2: org.sireum.lang.ast.ResolvedInfo.LocalVar = preR.resultOpt.getOrElse(o)
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
    val o2: org.sireum.lang.ast.ResolvedInfo.LocalVar = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.ResolvedInfo.LocalVar] = post_langastResolvedInfoLocalVar(o2) match {
     case MSome(result: org.sireum.lang.ast.ResolvedInfo.LocalVar) => MSome[org.sireum.lang.ast.ResolvedInfo.LocalVar](result)
     case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.ResolvedInfo.LocalVar")
     case _ => MNone[org.sireum.lang.ast.ResolvedInfo.LocalVar]()
    }
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastTypedFun(o: org.sireum.lang.ast.Typed.Fun): MOption[org.sireum.lang.ast.Typed.Fun] = {
    val preR: PreResult[org.sireum.lang.ast.Typed.Fun] = pre_langastTypedFun(o) match {
     case PreResult(continu, MSome(r: org.sireum.lang.ast.Typed.Fun)) => PreResult(continu, MSome[org.sireum.lang.ast.Typed.Fun](r))
     case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.Typed.Fun")
     case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.Typed.Fun]())
    }
    val r: MOption[org.sireum.lang.ast.Typed.Fun] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Typed.Fun = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, org.sireum.lang.ast.Typed]] = transformISZ(o2.args, transform_langastTyped _)
      val r1: MOption[org.sireum.lang.ast.Typed] = transform_langastTyped(o2.ret)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(args = r0.getOrElse(o2.args), ret = r1.getOrElse(o2.ret)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.Typed.Fun = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.Typed.Fun] = post_langastTypedFun(o2) match {
     case MSome(result: org.sireum.lang.ast.Typed.Fun) => MSome[org.sireum.lang.ast.Typed.Fun](result)
     case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.Typed.Fun")
     case _ => MNone[org.sireum.lang.ast.Typed.Fun]()
    }
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastResolvedInfoMethod(o: org.sireum.lang.ast.ResolvedInfo.Method): MOption[org.sireum.lang.ast.ResolvedInfo.Method] = {
    val preR: PreResult[org.sireum.lang.ast.ResolvedInfo.Method] = pre_langastResolvedInfoMethod(o) match {
     case PreResult(continu, MSome(r: org.sireum.lang.ast.ResolvedInfo.Method)) => PreResult(continu, MSome[org.sireum.lang.ast.ResolvedInfo.Method](r))
     case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.ResolvedInfo.Method")
     case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.ResolvedInfo.Method]())
    }
    val r: MOption[org.sireum.lang.ast.ResolvedInfo.Method] = if (preR.continu) {
      val o2: org.sireum.lang.ast.ResolvedInfo.Method = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Option[org.sireum.lang.ast.Typed.Fun]] = transformOption(o2.tpeOpt, transform_langastTypedFun _)
      val r1: MOption[IS[Z, org.sireum.lang.ast.ResolvedInfo]] = transformISZ(o2.reads, transform_langastResolvedInfo _)
      val r2: MOption[IS[Z, org.sireum.lang.ast.ResolvedInfo]] = transformISZ(o2.writes, transform_langastResolvedInfo _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(tpeOpt = r0.getOrElse(o2.tpeOpt), reads = r1.getOrElse(o2.reads), writes = r2.getOrElse(o2.writes)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.ResolvedInfo.Method = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.ResolvedInfo.Method] = post_langastResolvedInfoMethod(o2) match {
     case MSome(result: org.sireum.lang.ast.ResolvedInfo.Method) => MSome[org.sireum.lang.ast.ResolvedInfo.Method](result)
     case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.ResolvedInfo.Method")
     case _ => MNone[org.sireum.lang.ast.ResolvedInfo.Method]()
    }
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastExpLitB(o: org.sireum.lang.ast.Exp.LitB): MOption[org.sireum.lang.ast.Exp.LitB] = {
    val preR: PreResult[org.sireum.lang.ast.Exp.LitB] = pre_langastExpLitB(o) match {
     case PreResult(continu, MSome(r: org.sireum.lang.ast.Exp.LitB)) => PreResult(continu, MSome[org.sireum.lang.ast.Exp.LitB](r))
     case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.Exp.LitB")
     case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.Exp.LitB]())
    }
    val r: MOption[org.sireum.lang.ast.Exp.LitB] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Exp.LitB = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[org.sireum.lang.ast.Attr] = transform_langastAttr(o2.attr)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(attr = r0.getOrElse(o2.attr)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.Exp.LitB = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.Exp.LitB] = post_langastExpLitB(o2) match {
     case MSome(result: org.sireum.lang.ast.Exp.LitB) => MSome[org.sireum.lang.ast.Exp.LitB](result)
     case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.Exp.LitB")
     case _ => MNone[org.sireum.lang.ast.Exp.LitB]()
    }
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transform_langastTypedMethod(o: org.sireum.lang.ast.Typed.Method): MOption[org.sireum.lang.ast.Typed.Method] = {
    val preR: PreResult[org.sireum.lang.ast.Typed.Method] = pre_langastTypedMethod(o) match {
     case PreResult(continu, MSome(r: org.sireum.lang.ast.Typed.Method)) => PreResult(continu, MSome[org.sireum.lang.ast.Typed.Method](r))
     case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.Typed.Method")
     case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.Typed.Method]())
    }
    val r: MOption[org.sireum.lang.ast.Typed.Method] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Typed.Method = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[org.sireum.lang.ast.Typed.Fun] = transform_langastTypedFun(o2.tpe)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(tpe = r0.getOrElse(o2.tpe)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.Typed.Method = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.Typed.Method] = post_langastTypedMethod(o2) match {
     case MSome(result: org.sireum.lang.ast.Typed.Method) => MSome[org.sireum.lang.ast.Typed.Method](result)
     case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.Typed.Method")
     case _ => MNone[org.sireum.lang.ast.Typed.Method]()
    }
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

  def transform_langastStmtMethod(o: org.sireum.lang.ast.Stmt.Method): MOption[org.sireum.lang.ast.Stmt.Method] = {
    val preR: PreResult[org.sireum.lang.ast.Stmt.Method] = pre_langastStmtMethod(o) match {
     case PreResult(continu, MSome(r: org.sireum.lang.ast.Stmt.Method)) => PreResult(continu, MSome[org.sireum.lang.ast.Stmt.Method](r))
     case PreResult(_, MSome(_)) => halt("Can only produce object of type org.sireum.lang.ast.Stmt.Method")
     case PreResult(continu, _) => PreResult(continu, MNone[org.sireum.lang.ast.Stmt.Method]())
    }
    val r: MOption[org.sireum.lang.ast.Stmt.Method] = if (preR.continu) {
      val o2: org.sireum.lang.ast.Stmt.Method = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[org.sireum.lang.ast.MethodSig] = transform_langastMethodSig(o2.sig)
      val r1: MOption[org.sireum.lang.ast.MethodContract] = transform_langastMethodContract(o2.mcontract)
      val r2: MOption[Option[org.sireum.lang.ast.Body]] = transformOption(o2.bodyOpt, transform_langastBody _)
      val r3: MOption[org.sireum.lang.ast.ResolvedAttr] = transform_langastResolvedAttr(o2.attr)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
        MSome(o2(sig = r0.getOrElse(o2.sig), mcontract = r1.getOrElse(o2.mcontract), bodyOpt = r2.getOrElse(o2.bodyOpt), attr = r3.getOrElse(o2.attr)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: org.sireum.lang.ast.Stmt.Method = r.getOrElse(o)
    val postR: MOption[org.sireum.lang.ast.Stmt.Method] = post_langastStmtMethod(o2) match {
     case MSome(result: org.sireum.lang.ast.Stmt.Method) => MSome[org.sireum.lang.ast.Stmt.Method](result)
     case MSome(_) => halt("Can only produce object of type org.sireum.lang.ast.Stmt.Method")
     case _ => MNone[org.sireum.lang.ast.Stmt.Method]()
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