// #Sireum
// @formatter:off

/*
 Copyright (c) 2017-2023, Kansas State University
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

object MsgPack {

  object Constants {

    val Aadl: Z = -32

    val Name: Z = -31

    val Component: Z = -30

    val Classifier: Z = -29

    val FeatureEnd: Z = -28

    val FeatureGroup: Z = -27

    val FeatureAccess: Z = -26

    val Connection: Z = -25

    val ConnectionInstance: Z = -24

    val ConnectionReference: Z = -23

    val EndPoint: Z = -22

    val Property: Z = -21

    val AadlElementRef: Z = -20

    val ClassifierProp: Z = -19

    val RangeProp: Z = -18

    val RecordProp: Z = -17

    val ReferenceProp: Z = -16

    val UnitProp: Z = -15

    val ValueProp: Z = -14

    val Mode: Z = -13

    val Flow: Z = -12

    val Annex: Z = -11

    val OtherAnnex: Z = -10

    val OtherLib: Z = -9

    val BTSSubclauseBehaviorProvider: Z = -8

    val BTSText: Z = -7

    val BTSPath: Z = -6

    val BTSBLESSAnnexClause: Z = -5

    val BTSVariableDeclaration: Z = -4

    val BTSClassifier: Z = -3

    val BLESSIntConst: Z = -2

    val BTSStateDeclaration: Z = -1

    val BTSTransition: Z = 0

    val BTSTransitionLabel: Z = 1

    val BTSDispatchCondition: Z = 2

    val BTSDispatchConjunction: Z = 3

    val BTSDispatchTriggerStop: Z = 4

    val BTSDispatchTriggerPort: Z = 5

    val BTSDispatchTriggerTimeout: Z = 6

    val BTSExecuteConditionExp: Z = 7

    val BTSExecuteConditionTimeout: Z = 8

    val BTSExecuteConditionOtherwise: Z = 9

    val BTSModeCondition: Z = 10

    val BTSInternalCondition: Z = 11

    val BTSAssertion: Z = 12

    val BTSBehaviorActions: Z = 13

    val BTSAssertedAction: Z = 14

    val BTSSkipAction: Z = 15

    val BTSAssignmentAction: Z = 16

    val BTSSubprogramCallAction: Z = 17

    val BTSPortOutAction: Z = 18

    val BTSPortInAction: Z = 19

    val BTSFrozenPortAction: Z = 20

    val BTSIfBLESSAction: Z = 21

    val BTSGuardedAction: Z = 22

    val BTSIfBAAction: Z = 23

    val BTSConditionalActions: Z = 24

    val BTSExistentialLatticeQuantification: Z = 25

    val BTSUniversalLatticeQuantification: Z = 26

    val BTSUnaryExp: Z = 27

    val BTSBinaryExp: Z = 28

    val BTSLiteralExp: Z = 29

    val BTSNameExp: Z = 30

    val BTSIndexingExp: Z = 31

    val BTSAccessExp: Z = 32

    val BTSFunctionCall: Z = 33

    val BTSFormalExpPair: Z = 34

    val BTSBehaviorTime: Z = 35

    val TODO: Z = 36

    val Attr: Z = 37

    val Emv2ElementRef: Z = 38

    val Emv2Library: Z = 39

    val ErrorTypeDef: Z = 40

    val ErrorAliasDef: Z = 41

    val ErrorTypeSetDef: Z = 42

    val BehaveStateMachine: Z = 43

    val ErrorEvent: Z = 44

    val ErrorState: Z = 45

    val ErrorTransition: Z = 46

    val ConditionTrigger: Z = 47

    val AndCondition: Z = 48

    val OrCondition: Z = 49

    val AllCondition: Z = 50

    val OrMoreCondition: Z = 51

    val OrLessCondition: Z = 52

    val Emv2Clause: Z = 53

    val Emv2Propagation: Z = 54

    val Emv2Flow: Z = 55

    val Emv2BehaviorSection: Z = 56

    val ErrorPropagation: Z = 57

    val GclSubclause: Z = 58

    val GclMethod: Z = 59

    val GclStateVar: Z = 60

    val GclInvariant: Z = 61

    val GclAssume: Z = 62

    val GclGuarantee: Z = 63

    val GclIntegration: Z = 64

    val GclCaseStatement: Z = 65

    val GclInitialize: Z = 66

    val GclCompute: Z = 67

    val GclHandle: Z = 68

    val GclTODO: Z = 69

    val GclLib: Z = 70

    val SmfClause: Z = 71

    val SmfClassification: Z = 72

    val SmfDeclass: Z = 73

    val SmfLibrary: Z = 74

    val SmfType: Z = 75

    val _langastTopUnitProgram: Z = 76

    val _langastTopUnitSequentUnit: Z = 77

    val _langastTopUnitTruthTableUnit: Z = 78

    val _langastLoopContract: Z = 79

    val _langastStmtImport: Z = 80

    val _langastStmtImportImporter: Z = 81

    val _langastStmtImportMultiSelector: Z = 82

    val _langastStmtImportWildcardSelector: Z = 83

    val _langastStmtImportNamedSelector: Z = 84

    val _langastStmtVar: Z = 85

    val _langastStmtVarPattern: Z = 86

    val _langastStmtSpecVar: Z = 87

    val _langastStmtMethod: Z = 88

    val _langastStmtExtMethod: Z = 89

    val _langastStmtJustMethod: Z = 90

    val _langastStmtSpecMethod: Z = 91

    val _langastStmtEnum: Z = 92

    val _langastStmtSubZ: Z = 93

    val _langastStmtObject: Z = 94

    val _langastStmtSig: Z = 95

    val _langastStmtAdt: Z = 96

    val _langastStmtTypeAlias: Z = 97

    val _langastStmtAssign: Z = 98

    val _langastStmtBlock: Z = 99

    val _langastStmtIf: Z = 100

    val _langastStmtMatch: Z = 101

    val _langastStmtWhile: Z = 102

    val _langastStmtDoWhile: Z = 103

    val _langastStmtFor: Z = 104

    val _langastStmtReturn: Z = 105

    val _langastStmtExpr: Z = 106

    val _langastStmtFact: Z = 107

    val _langastStmtInv: Z = 108

    val _langastStmtTheorem: Z = 109

    val _langastStmtDataRefinement: Z = 110

    val _langastStmtSpecLabel: Z = 111

    val _langastStmtSpecBlock: Z = 112

    val _langastStmtDeduceSequent: Z = 113

    val _langastStmtDeduceSteps: Z = 114

    val _langastStmtHavoc: Z = 115

    val _langastMethodContractAccesses: Z = 116

    val _langastMethodContractClaims: Z = 117

    val _langastMethodContractSimple: Z = 118

    val _langastMethodContractCases: Z = 119

    val _langastMethodContractCase: Z = 120

    val _langastMethodContractInfoFlows: Z = 121

    val _langastMethodContractInfoFlow: Z = 122

    val _langastSequent: Z = 123

    val _langastProofAst: Z = 124

    val _langastProofAstStepIdNum: Z = 125

    val _langastProofAstStepIdStr: Z = 126

    val _langastProofAstStepRegular: Z = 127

    val _langastProofAstStepAssume: Z = 128

    val _langastProofAstStepAssert: Z = 129

    val _langastProofAstStepSubProof: Z = 130

    val _langastProofAstStepLet: Z = 131

    val _langastProofAstStepLetParam: Z = 132

    val _langastProofAstStepStructInduction: Z = 133

    val _langastProofAstStepStructInductionMatchCase: Z = 134

    val _langastProofAstStepStructInductionMatchDefault: Z = 135

    val _langastProofAstStepJustificationRef: Z = 136

    val _langastProofAstStepJustificationApply: Z = 137

    val _langastProofAstStepJustificationApplyNamed: Z = 138

    val _langastProofAstStepJustificationApplyEta: Z = 139

    val _langastCase: Z = 140

    val _langastEnumGenRangeExpr: Z = 141

    val _langastEnumGenRangeStep: Z = 142

    val _langastEnumGenFor: Z = 143

    val _langastTypeNamed: Z = 144

    val _langastTypeFun: Z = 145

    val _langastTypeTuple: Z = 146

    val _langastPatternLiteral: Z = 147

    val _langastPatternLitInterpolate: Z = 148

    val _langastPatternRef: Z = 149

    val _langastPatternVarBinding: Z = 150

    val _langastPatternWildcard: Z = 151

    val _langastPatternSeqWildcard: Z = 152

    val _langastPatternStructure: Z = 153

    val _langastExpLitB: Z = 154

    val _langastExpLitC: Z = 155

    val _langastExpLitZ: Z = 156

    val _langastExpLitF32: Z = 157

    val _langastExpLitF64: Z = 158

    val _langastExpLitR: Z = 159

    val _langastExpLitString: Z = 160

    val _langastExpLitStepId: Z = 161

    val _langastExpStringInterpolate: Z = 162

    val _langastExpThis: Z = 163

    val _langastExpSuper: Z = 164

    val _langastExpUnary: Z = 165

    val _langastExpBinary: Z = 166

    val _langastExpIdent: Z = 167

    val _langastExpEta: Z = 168

    val _langastExpTuple: Z = 169

    val _langastExpSelect: Z = 170

    val _langastExpInvoke: Z = 171

    val _langastExpInvokeNamed: Z = 172

    val _langastExpIf: Z = 173

    val _langastExpTypeCond: Z = 174

    val _langastExpSym: Z = 175

    val _langastExpFunParam: Z = 176

    val _langastExpFun: Z = 177

    val _langastExpForYield: Z = 178

    val _langastExpQuantType: Z = 179

    val _langastExpQuantRange: Z = 180

    val _langastExpQuantEach: Z = 181

    val _langastExpInput: Z = 182

    val _langastExpAt: Z = 183

    val _langastExpLoopIndex: Z = 184

    val _langastExpStateSeq: Z = 185

    val _langastExpStateSeqFragment: Z = 186

    val _langastExpResult: Z = 187

    val _langastExpAssumeAgree: Z = 188

    val _langastExpAssertAgree: Z = 189

    val _langastExpInfoFlowInvariant: Z = 190

    val _langastNamedArg: Z = 191

    val _langastId: Z = 192

    val _langastName: Z = 193

    val _langastBody: Z = 194

    val _langastAdtParam: Z = 195

    val _langastMethodSig: Z = 196

    val _langastParam: Z = 197

    val _langastTypeParam: Z = 198

    val _langastAttr: Z = 199

    val _langastTypedAttr: Z = 200

    val _langastResolvedAttr: Z = 201

    val _langastResolvedInfoBuiltIn: Z = 202

    val _langastResolvedInfoPackage: Z = 203

    val _langastResolvedInfoEnum: Z = 204

    val _langastResolvedInfoEnumElement: Z = 205

    val _langastResolvedInfoObject: Z = 206

    val _langastResolvedInfoVar: Z = 207

    val _langastResolvedInfoMethod: Z = 208

    val _langastResolvedInfoMethods: Z = 209

    val _langastResolvedInfoTuple: Z = 210

    val _langastResolvedInfoLocalVar: Z = 211

    val _langastResolvedInfoFact: Z = 212

    val _langastResolvedInfoTheorem: Z = 213

    val _langastResolvedInfoInv: Z = 214

    val _langastTruthTableRow: Z = 215

    val _langastTruthTableAssignment: Z = 216

    val _langastTruthTableConclusionValidity: Z = 217

    val _langastTruthTableConclusionTautology: Z = 218

    val _langastTruthTableConclusionContradictory: Z = 219

    val _langastTruthTableConclusionContingent: Z = 220

    val _langastTypedName: Z = 221

    val _langastTypedTuple: Z = 222

    val _langastTypedFun: Z = 223

    val _langastTypedTypeVar: Z = 224

    val _langastTypedPackage: Z = 225

    val _langastTypedObject: Z = 226

    val _langastTypedEnum: Z = 227

    val _langastTypedMethod: Z = 228

    val _langastTypedMethods: Z = 229

    val _langastTypedFact: Z = 230

    val _langastTypedTheorem: Z = 231

    val _langastTypedInv: Z = 232

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeAadlInstInfo(o: AadlInstInfo): Unit = {
      o match {
        case o: Component => writeComponent(o)
        case o: ErrorTypeDef => writeErrorTypeDef(o)
        case o: FeatureEnd => writeFeatureEnd(o)
        case o: FeatureGroup => writeFeatureGroup(o)
        case o: FeatureAccess => writeFeatureAccess(o)
        case o: Connection => writeConnection(o)
        case o: Emv2Flow => writeEmv2Flow(o)
        case o: Flow => writeFlow(o)
      }
    }

    def writeAadl(o: Aadl): Unit = {
      writer.writeZ(Constants.Aadl)
      writer.writeISZ(o.components, writeComponent _)
      writer.writeISZ(o.annexLib, writeAnnexLib _)
      writer.writeISZ(o.dataComponents, writeComponent _)
    }

    def writeName(o: Name): Unit = {
      writer.writeZ(Constants.Name)
      writer.writeISZ(o.name, writer.writeString _)
      writer.writeOption(o.pos, writer.writePosition _)
    }

    def writeComponent(o: Component): Unit = {
      writer.writeZ(Constants.Component)
      writeName(o.identifier)
      writeComponentCategoryType(o.category)
      writer.writeOption(o.classifier, writeClassifier _)
      writer.writeISZ(o.features, writeFeature _)
      writer.writeISZ(o.subComponents, writeComponent _)
      writer.writeISZ(o.connections, writeConnection _)
      writer.writeISZ(o.connectionInstances, writeConnectionInstance _)
      writer.writeISZ(o.properties, writeProperty _)
      writer.writeISZ(o.flows, writeFlow _)
      writer.writeISZ(o.modes, writeMode _)
      writer.writeISZ(o.annexes, writeAnnex _)
      writer.writeString(o.uriFrag)
    }

    def writeClassifier(o: Classifier): Unit = {
      writer.writeZ(Constants.Classifier)
      writer.writeString(o.name)
    }

    def writeComponentCategoryType(o: ComponentCategory.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFeature(o: Feature): Unit = {
      o match {
        case o: FeatureEnd => writeFeatureEnd(o)
        case o: FeatureGroup => writeFeatureGroup(o)
        case o: FeatureAccess => writeFeatureAccess(o)
      }
    }

    def writeFeatureEnd(o: FeatureEnd): Unit = {
      writer.writeZ(Constants.FeatureEnd)
      writeName(o.identifier)
      writeDirectionType(o.direction)
      writeFeatureCategoryType(o.category)
      writer.writeOption(o.classifier, writeClassifier _)
      writer.writeISZ(o.properties, writeProperty _)
      writer.writeString(o.uriFrag)
    }

    def writeFeatureGroup(o: FeatureGroup): Unit = {
      writer.writeZ(Constants.FeatureGroup)
      writeName(o.identifier)
      writer.writeISZ(o.features, writeFeature _)
      writer.writeB(o.isInverse)
      writeFeatureCategoryType(o.category)
      writer.writeISZ(o.properties, writeProperty _)
      writer.writeString(o.uriFrag)
    }

    def writeFeatureAccess(o: FeatureAccess): Unit = {
      writer.writeZ(Constants.FeatureAccess)
      writeName(o.identifier)
      writeFeatureCategoryType(o.category)
      writer.writeOption(o.classifier, writeClassifier _)
      writeAccessTypeType(o.accessType)
      writeAccessCategoryType(o.accessCategory)
      writer.writeISZ(o.properties, writeProperty _)
      writer.writeString(o.uriFrag)
    }

    def writeAccessTypeType(o: AccessType.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeAccessCategoryType(o: AccessCategory.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDirectionType(o: Direction.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFeatureCategoryType(o: FeatureCategory.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeConnection(o: Connection): Unit = {
      writer.writeZ(Constants.Connection)
      writeName(o.name)
      writer.writeISZ(o.src, writeEndPoint _)
      writer.writeISZ(o.dst, writeEndPoint _)
      writeConnectionKindType(o.kind)
      writer.writeB(o.isBiDirectional)
      writer.writeISZ(o.connectionInstances, writeName _)
      writer.writeISZ(o.properties, writeProperty _)
      writer.writeString(o.uriFrag)
    }

    def writeConnectionInstance(o: ConnectionInstance): Unit = {
      writer.writeZ(Constants.ConnectionInstance)
      writeName(o.name)
      writeEndPoint(o.src)
      writeEndPoint(o.dst)
      writeConnectionKindType(o.kind)
      writer.writeISZ(o.connectionRefs, writeConnectionReference _)
      writer.writeISZ(o.properties, writeProperty _)
    }

    def writeConnectionReference(o: ConnectionReference): Unit = {
      writer.writeZ(Constants.ConnectionReference)
      writeName(o.name)
      writeName(o.context)
      writer.writeB(o.isParent)
    }

    def writeConnectionKindType(o: ConnectionKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEndPoint(o: EndPoint): Unit = {
      writer.writeZ(Constants.EndPoint)
      writeName(o.component)
      writer.writeOption(o.feature, writeName _)
      writer.writeOption(o.direction, writeDirectionType _)
    }

    def writeProperty(o: Property): Unit = {
      writer.writeZ(Constants.Property)
      writeName(o.name)
      writer.writeISZ(o.propertyValues, writePropertyValue _)
      writer.writeISZ(o.appliesTo, writeElementRef _)
    }

    def writeElementRef(o: ElementRef): Unit = {
      o match {
        case o: Emv2ElementRef => writeEmv2ElementRef(o)
        case o: AadlElementRef => writeAadlElementRef(o)
      }
    }

    def writeElementKindType(o: ElementKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeAadlElementRef(o: AadlElementRef): Unit = {
      writer.writeZ(Constants.AadlElementRef)
      writeElementKindType(o.elementKind)
      writeName(o.name)
    }

    def writePropertyValue(o: PropertyValue): Unit = {
      o match {
        case o: ClassifierProp => writeClassifierProp(o)
        case o: RangeProp => writeRangeProp(o)
        case o: RecordProp => writeRecordProp(o)
        case o: ReferenceProp => writeReferenceProp(o)
        case o: UnitProp => writeUnitProp(o)
        case o: ValueProp => writeValueProp(o)
      }
    }

    def writeClassifierProp(o: ClassifierProp): Unit = {
      writer.writeZ(Constants.ClassifierProp)
      writer.writeString(o.name)
    }

    def writeRangeProp(o: RangeProp): Unit = {
      writer.writeZ(Constants.RangeProp)
      writeUnitProp(o.low)
      writeUnitProp(o.high)
    }

    def writeRecordProp(o: RecordProp): Unit = {
      writer.writeZ(Constants.RecordProp)
      writer.writeISZ(o.properties, writeProperty _)
    }

    def writeReferenceProp(o: ReferenceProp): Unit = {
      writer.writeZ(Constants.ReferenceProp)
      writeName(o.value)
    }

    def writeUnitProp(o: UnitProp): Unit = {
      writer.writeZ(Constants.UnitProp)
      writer.writeString(o.value)
      writer.writeOption(o.unit, writer.writeString _)
    }

    def writeValueProp(o: ValueProp): Unit = {
      writer.writeZ(Constants.ValueProp)
      writer.writeString(o.value)
    }

    def writeMode(o: Mode): Unit = {
      writer.writeZ(Constants.Mode)
      writeName(o.name)
    }

    def writeFlowKindType(o: FlowKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFlow(o: Flow): Unit = {
      writer.writeZ(Constants.Flow)
      writeName(o.name)
      writeFlowKindType(o.kind)
      writer.writeOption(o.source, writeName _)
      writer.writeOption(o.sink, writeName _)
      writer.writeString(o.uriFrag)
    }

    def writeAnnex(o: Annex): Unit = {
      writer.writeZ(Constants.Annex)
      writer.writeString(o.name)
      writeAnnexClause(o.clause)
    }

    def writeAnnexClause(o: AnnexClause): Unit = {
      o match {
        case o: SmfClause => writeSmfClause(o)
        case o: SmfClassification => writeSmfClassification(o)
        case o: SmfDeclass => writeSmfDeclass(o)
        case o: SmfType => writeSmfType(o)
        case o: ErrorTypeDef => writeErrorTypeDef(o)
        case o: ErrorAliasDef => writeErrorAliasDef(o)
        case o: ErrorTypeSetDef => writeErrorTypeSetDef(o)
        case o: BehaveStateMachine => writeBehaveStateMachine(o)
        case o: ErrorEvent => writeErrorEvent(o)
        case o: ErrorState => writeErrorState(o)
        case o: ErrorTransition => writeErrorTransition(o)
        case o: ConditionTrigger => writeConditionTrigger(o)
        case o: AndCondition => writeAndCondition(o)
        case o: OrCondition => writeOrCondition(o)
        case o: AllCondition => writeAllCondition(o)
        case o: OrMoreCondition => writeOrMoreCondition(o)
        case o: OrLessCondition => writeOrLessCondition(o)
        case o: Emv2Clause => writeEmv2Clause(o)
        case o: Emv2Propagation => writeEmv2Propagation(o)
        case o: Emv2Flow => writeEmv2Flow(o)
        case o: Emv2BehaviorSection => writeEmv2BehaviorSection(o)
        case o: ErrorPropagation => writeErrorPropagation(o)
        case o: OtherAnnex => writeOtherAnnex(o)
        case o: GclSubclause => writeGclSubclause(o)
        case o: BTSSubclauseBehaviorProvider => writeBTSSubclauseBehaviorProvider(o)
        case o: BTSBLESSAnnexClause => writeBTSBLESSAnnexClause(o)
      }
    }

    def writeAnnexLib(o: AnnexLib): Unit = {
      o match {
        case o: SmfLibrary => writeSmfLibrary(o)
        case o: Emv2Library => writeEmv2Library(o)
        case o: OtherLib => writeOtherLib(o)
        case o: GclLib => writeGclLib(o)
      }
    }

    def writeOtherAnnex(o: OtherAnnex): Unit = {
      writer.writeZ(Constants.OtherAnnex)
      writer.writeString(o.clause)
    }

    def writeOtherLib(o: OtherLib): Unit = {
      writer.writeZ(Constants.OtherLib)
      writer.writeString(o.lib)
    }

    def writeBLESSAnnex(o: BLESSAnnex): Unit = {
      o match {
        case o: BTSSubclauseBehaviorProvider => writeBTSSubclauseBehaviorProvider(o)
        case o: BTSBLESSAnnexClause => writeBTSBLESSAnnexClause(o)
      }
    }

    def writeBTSSubclauseBehaviorProvider(o: BTSSubclauseBehaviorProvider): Unit = {
      writer.writeZ(Constants.BTSSubclauseBehaviorProvider)
      writer.writeISZ(o.values, writeBTSResource _)
    }

    def writeBTSResource(o: BTSResource): Unit = {
      o match {
        case o: BTSText => writeBTSText(o)
        case o: BTSPath => writeBTSPath(o)
      }
    }

    def writeBTSText(o: BTSText): Unit = {
      writer.writeZ(Constants.BTSText)
      writer.writeString(o.source)
      writer.writeOption(o.filename, writer.writeString _)
      writer.writeB(o.overwrite)
    }

    def writeBTSPath(o: BTSPath): Unit = {
      writer.writeZ(Constants.BTSPath)
      writer.writeString(o.path)
      writer.writeB(o.overwrite)
    }

    def writeBTSBLESSAnnexClause(o: BTSBLESSAnnexClause): Unit = {
      writer.writeZ(Constants.BTSBLESSAnnexClause)
      writer.writeB(o.doNotProve)
      writer.writeISZ(o.assertions, writeBTSAssertion _)
      writer.writeOption(o.invariant, writeBTSAssertion _)
      writer.writeISZ(o.variables, writeBTSVariableDeclaration _)
      writer.writeISZ(o.states, writeBTSStateDeclaration _)
      writer.writeISZ(o.transitions, writeBTSTransition _)
    }

    def writeBTSVariableDeclaration(o: BTSVariableDeclaration): Unit = {
      writer.writeZ(Constants.BTSVariableDeclaration)
      writeName(o.name)
      writer.writeOption(o.category, writeBTSVariableCategoryType _)
      writeBTSType(o.varType)
      writer.writeOption(o.assignExpression, writeBTSExp _)
      writer.writeOption(o.arraySize, writeBLESSIntConst _)
      writer.writeOption(o.variableAssertion, writeBTSAssertion _)
    }

    def writeBTSVariableCategoryType(o: BTSVariableCategory.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBTSType(o: BTSType): Unit = {
      o match {
        case o: BTSClassifier => writeBTSClassifier(o)
      }
    }

    def writeBTSClassifier(o: BTSClassifier): Unit = {
      writer.writeZ(Constants.BTSClassifier)
      writeClassifier(o.classifier)
    }

    def writeBLESSIntConst(o: BLESSIntConst): Unit = {
      writer.writeZ(Constants.BLESSIntConst)
    }

    def writeBTSStateDeclaration(o: BTSStateDeclaration): Unit = {
      writer.writeZ(Constants.BTSStateDeclaration)
      writeName(o.id)
      writer.writeISZ(o.categories, writeBTSStateCategoryType _)
      writer.writeOption(o.assertion, writeBTSAssertion _)
    }

    def writeBTSStateCategoryType(o: BTSStateCategory.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBTSTransition(o: BTSTransition): Unit = {
      writer.writeZ(Constants.BTSTransition)
      writeBTSTransitionLabel(o.label)
      writer.writeISZ(o.sourceStates, writeName _)
      writeName(o.destState)
      writer.writeOption(o.transitionCondition, writeBTSTransitionCondition _)
      writer.writeOption(o.actions, writeBTSBehaviorActions _)
      writer.writeOption(o.assertion, writeBTSAssertion _)
    }

    def writeBTSTransitionLabel(o: BTSTransitionLabel): Unit = {
      writer.writeZ(Constants.BTSTransitionLabel)
      writeName(o.id)
      writer.writeOption(o.priority, writer.writeZ _)
    }

    def writeBTSTransitionCondition(o: BTSTransitionCondition): Unit = {
      o match {
        case o: BTSDispatchCondition => writeBTSDispatchCondition(o)
        case o: BTSExecuteConditionExp => writeBTSExecuteConditionExp(o)
        case o: BTSExecuteConditionTimeout => writeBTSExecuteConditionTimeout(o)
        case o: BTSExecuteConditionOtherwise => writeBTSExecuteConditionOtherwise(o)
        case o: BTSModeCondition => writeBTSModeCondition(o)
        case o: BTSInternalCondition => writeBTSInternalCondition(o)
      }
    }

    def writeBTSDispatchCondition(o: BTSDispatchCondition): Unit = {
      writer.writeZ(Constants.BTSDispatchCondition)
      writer.writeISZ(o.dispatchTriggers, writeBTSDispatchConjunction _)
      writer.writeISZ(o.frozenPorts, writeName _)
    }

    def writeBTSDispatchConjunction(o: BTSDispatchConjunction): Unit = {
      writer.writeZ(Constants.BTSDispatchConjunction)
      writer.writeISZ(o.conjunction, writeBTSDispatchTrigger _)
    }

    def writeBTSDispatchTrigger(o: BTSDispatchTrigger): Unit = {
      o match {
        case o: BTSDispatchTriggerStop => writeBTSDispatchTriggerStop(o)
        case o: BTSDispatchTriggerPort => writeBTSDispatchTriggerPort(o)
        case o: BTSDispatchTriggerTimeout => writeBTSDispatchTriggerTimeout(o)
      }
    }

    def writeBTSDispatchTriggerStop(o: BTSDispatchTriggerStop): Unit = {
      writer.writeZ(Constants.BTSDispatchTriggerStop)
    }

    def writeBTSDispatchTriggerPort(o: BTSDispatchTriggerPort): Unit = {
      writer.writeZ(Constants.BTSDispatchTriggerPort)
      writeName(o.port)
    }

    def writeBTSDispatchTriggerTimeout(o: BTSDispatchTriggerTimeout): Unit = {
      writer.writeZ(Constants.BTSDispatchTriggerTimeout)
      writer.writeISZ(o.ports, writeName _)
      writer.writeOption(o.time, writeBTSBehaviorTime _)
    }

    def writeBTSExecuteCondition(o: BTSExecuteCondition): Unit = {
      o match {
        case o: BTSExecuteConditionExp => writeBTSExecuteConditionExp(o)
        case o: BTSExecuteConditionTimeout => writeBTSExecuteConditionTimeout(o)
        case o: BTSExecuteConditionOtherwise => writeBTSExecuteConditionOtherwise(o)
      }
    }

    def writeBTSExecuteConditionExp(o: BTSExecuteConditionExp): Unit = {
      writer.writeZ(Constants.BTSExecuteConditionExp)
      writeBTSExp(o.exp)
    }

    def writeBTSExecuteConditionTimeout(o: BTSExecuteConditionTimeout): Unit = {
      writer.writeZ(Constants.BTSExecuteConditionTimeout)
    }

    def writeBTSExecuteConditionOtherwise(o: BTSExecuteConditionOtherwise): Unit = {
      writer.writeZ(Constants.BTSExecuteConditionOtherwise)
    }

    def writeBTSModeCondition(o: BTSModeCondition): Unit = {
      writer.writeZ(Constants.BTSModeCondition)
    }

    def writeBTSInternalCondition(o: BTSInternalCondition): Unit = {
      writer.writeZ(Constants.BTSInternalCondition)
    }

    def writeBTSAssertion(o: BTSAssertion): Unit = {
      writer.writeZ(Constants.BTSAssertion)
    }

    def writeBTSBehaviorActions(o: BTSBehaviorActions): Unit = {
      writer.writeZ(Constants.BTSBehaviorActions)
      writeBTSExecutionOrderType(o.executionOrder)
      writer.writeISZ(o.actions, writeBTSAssertedAction _)
    }

    def writeBTSExecutionOrderType(o: BTSExecutionOrder.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBTSAssertedAction(o: BTSAssertedAction): Unit = {
      writer.writeZ(Constants.BTSAssertedAction)
      writer.writeOption(o.precondition, writeBTSAssertion _)
      writeBTSAction(o.action)
      writer.writeOption(o.postcondition, writeBTSAssertion _)
    }

    def writeBTSAction(o: BTSAction): Unit = {
      o match {
        case o: BTSSkipAction => writeBTSSkipAction(o)
        case o: BTSAssignmentAction => writeBTSAssignmentAction(o)
        case o: BTSSubprogramCallAction => writeBTSSubprogramCallAction(o)
        case o: BTSPortOutAction => writeBTSPortOutAction(o)
        case o: BTSPortInAction => writeBTSPortInAction(o)
        case o: BTSFrozenPortAction => writeBTSFrozenPortAction(o)
        case o: BTSIfBLESSAction => writeBTSIfBLESSAction(o)
        case o: BTSIfBAAction => writeBTSIfBAAction(o)
        case o: BTSExistentialLatticeQuantification => writeBTSExistentialLatticeQuantification(o)
        case o: BTSUniversalLatticeQuantification => writeBTSUniversalLatticeQuantification(o)
      }
    }

    def writeBTSBasicAction(o: BTSBasicAction): Unit = {
      o match {
        case o: BTSSkipAction => writeBTSSkipAction(o)
        case o: BTSAssignmentAction => writeBTSAssignmentAction(o)
        case o: BTSSubprogramCallAction => writeBTSSubprogramCallAction(o)
        case o: BTSPortOutAction => writeBTSPortOutAction(o)
        case o: BTSPortInAction => writeBTSPortInAction(o)
        case o: BTSFrozenPortAction => writeBTSFrozenPortAction(o)
      }
    }

    def writeBTSSkipAction(o: BTSSkipAction): Unit = {
      writer.writeZ(Constants.BTSSkipAction)
    }

    def writeBTSAssignmentAction(o: BTSAssignmentAction): Unit = {
      writer.writeZ(Constants.BTSAssignmentAction)
      writeBTSExp(o.lhs)
      writeBTSExp(o.rhs)
    }

    def writeBTSCommunicationAction(o: BTSCommunicationAction): Unit = {
      o match {
        case o: BTSSubprogramCallAction => writeBTSSubprogramCallAction(o)
        case o: BTSPortOutAction => writeBTSPortOutAction(o)
        case o: BTSPortInAction => writeBTSPortInAction(o)
        case o: BTSFrozenPortAction => writeBTSFrozenPortAction(o)
      }
    }

    def writeBTSSubprogramCallAction(o: BTSSubprogramCallAction): Unit = {
      writer.writeZ(Constants.BTSSubprogramCallAction)
      writeName(o.name)
      writer.writeISZ(o.params, writeBTSFormalExpPair _)
    }

    def writeBTSPortOutAction(o: BTSPortOutAction): Unit = {
      writer.writeZ(Constants.BTSPortOutAction)
      writeName(o.name)
      writer.writeOption(o.exp, writeBTSExp _)
    }

    def writeBTSPortInAction(o: BTSPortInAction): Unit = {
      writer.writeZ(Constants.BTSPortInAction)
      writeName(o.name)
      writeBTSExp(o.variable)
    }

    def writeBTSFrozenPortAction(o: BTSFrozenPortAction): Unit = {
      writer.writeZ(Constants.BTSFrozenPortAction)
      writeName(o.portName)
    }

    def writeBTSControlAction(o: BTSControlAction): Unit = {
      o match {
        case o: BTSIfBLESSAction => writeBTSIfBLESSAction(o)
        case o: BTSIfBAAction => writeBTSIfBAAction(o)
      }
    }

    def writeBTSIfBLESSAction(o: BTSIfBLESSAction): Unit = {
      writer.writeZ(Constants.BTSIfBLESSAction)
      writer.writeOption(o.availability, writeTODO _)
      writer.writeISZ(o.alternatives, writeBTSGuardedAction _)
    }

    def writeBTSGuardedAction(o: BTSGuardedAction): Unit = {
      writer.writeZ(Constants.BTSGuardedAction)
      writeBTSExp(o.guard)
      writeBTSAssertedAction(o.action)
    }

    def writeBTSIfBAAction(o: BTSIfBAAction): Unit = {
      writer.writeZ(Constants.BTSIfBAAction)
      writeBTSConditionalActions(o.ifBranch)
      writer.writeISZ(o.elseIfBranches, writeBTSConditionalActions _)
      writer.writeOption(o.elseBranch, writeBTSBehaviorActions _)
    }

    def writeBTSConditionalActions(o: BTSConditionalActions): Unit = {
      writer.writeZ(Constants.BTSConditionalActions)
      writeBTSExp(o.cond)
      writeBTSBehaviorActions(o.actions)
    }

    def writeBTSQuantificationActions(o: BTSQuantificationActions): Unit = {
      o match {
        case o: BTSExistentialLatticeQuantification => writeBTSExistentialLatticeQuantification(o)
        case o: BTSUniversalLatticeQuantification => writeBTSUniversalLatticeQuantification(o)
      }
    }

    def writeBTSExistentialLatticeQuantification(o: BTSExistentialLatticeQuantification): Unit = {
      writer.writeZ(Constants.BTSExistentialLatticeQuantification)
      writer.writeISZ(o.quantifiedVariables, writeBTSVariableDeclaration _)
      writeBTSBehaviorActions(o.actions)
      writer.writeOption(o.timeout, writeBTSBehaviorTime _)
      writer.writeOption(o.catchClause, writeTODO _)
    }

    def writeBTSUniversalLatticeQuantification(o: BTSUniversalLatticeQuantification): Unit = {
      writer.writeZ(Constants.BTSUniversalLatticeQuantification)
      writer.writeISZ(o.latticeVariables, writeName _)
      writer.writeOption(o.range, writeTODO _)
      writeBTSExistentialLatticeQuantification(o.elq)
    }

    def writeBTSExp(o: BTSExp): Unit = {
      o match {
        case o: BTSUnaryExp => writeBTSUnaryExp(o)
        case o: BTSBinaryExp => writeBTSBinaryExp(o)
        case o: BTSLiteralExp => writeBTSLiteralExp(o)
        case o: BTSNameExp => writeBTSNameExp(o)
        case o: BTSIndexingExp => writeBTSIndexingExp(o)
        case o: BTSAccessExp => writeBTSAccessExp(o)
        case o: BTSFunctionCall => writeBTSFunctionCall(o)
      }
    }

    def writeBTSUnaryExp(o: BTSUnaryExp): Unit = {
      writer.writeZ(Constants.BTSUnaryExp)
      writeBTSUnaryOpType(o.op)
      writeBTSExp(o.exp)
      writer.writeOption(o.pos, writer.writePosition _)
    }

    def writeBTSUnaryOpType(o: BTSUnaryOp.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBTSBinaryExp(o: BTSBinaryExp): Unit = {
      writer.writeZ(Constants.BTSBinaryExp)
      writeBTSBinaryOpType(o.op)
      writeBTSExp(o.lhs)
      writeBTSExp(o.rhs)
      writer.writeOption(o.pos, writer.writePosition _)
    }

    def writeBTSBinaryOpType(o: BTSBinaryOp.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBTSLiteralTypeType(o: BTSLiteralType.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBTSLiteralExp(o: BTSLiteralExp): Unit = {
      writer.writeZ(Constants.BTSLiteralExp)
      writeBTSLiteralTypeType(o.typ)
      writer.writeString(o.exp)
      writer.writeOption(o.pos, writer.writePosition _)
    }

    def writeBTSNameExp(o: BTSNameExp): Unit = {
      writer.writeZ(Constants.BTSNameExp)
      writeName(o.name)
      writer.writeOption(o.pos, writer.writePosition _)
    }

    def writeBTSIndexingExp(o: BTSIndexingExp): Unit = {
      writer.writeZ(Constants.BTSIndexingExp)
      writeBTSExp(o.exp)
      writer.writeISZ(o.indices, writeBTSExp _)
      writer.writeOption(o.pos, writer.writePosition _)
    }

    def writeBTSAccessExp(o: BTSAccessExp): Unit = {
      writer.writeZ(Constants.BTSAccessExp)
      writeBTSExp(o.exp)
      writer.writeString(o.attributeName)
      writer.writeOption(o.pos, writer.writePosition _)
    }

    def writeBTSFunctionCall(o: BTSFunctionCall): Unit = {
      writer.writeZ(Constants.BTSFunctionCall)
      writeName(o.name)
      writer.writeISZ(o.args, writeBTSFormalExpPair _)
      writer.writeOption(o.pos, writer.writePosition _)
    }

    def writeBTSFormalExpPair(o: BTSFormalExpPair): Unit = {
      writer.writeZ(Constants.BTSFormalExpPair)
      writer.writeOption(o.paramName, writeName _)
      writer.writeOption(o.exp, writeBTSExp _)
      writer.writeOption(o.pos, writer.writePosition _)
    }

    def writeBTSBehaviorTime(o: BTSBehaviorTime): Unit = {
      writer.writeZ(Constants.BTSBehaviorTime)
    }

    def writeTODO(o: TODO): Unit = {
      writer.writeZ(Constants.TODO)
    }

    def writeAttr(o: Attr): Unit = {
      writer.writeZ(Constants.Attr)
      writer.writeOption(o.posOpt, writer.writePosition _)
    }

    def writeEmv2Annex(o: Emv2Annex): Unit = {
      o match {
        case o: ErrorTypeDef => writeErrorTypeDef(o)
        case o: ErrorAliasDef => writeErrorAliasDef(o)
        case o: ErrorTypeSetDef => writeErrorTypeSetDef(o)
        case o: BehaveStateMachine => writeBehaveStateMachine(o)
        case o: ErrorEvent => writeErrorEvent(o)
        case o: ErrorState => writeErrorState(o)
        case o: ErrorTransition => writeErrorTransition(o)
        case o: ConditionTrigger => writeConditionTrigger(o)
        case o: AndCondition => writeAndCondition(o)
        case o: OrCondition => writeOrCondition(o)
        case o: AllCondition => writeAllCondition(o)
        case o: OrMoreCondition => writeOrMoreCondition(o)
        case o: OrLessCondition => writeOrLessCondition(o)
        case o: Emv2Clause => writeEmv2Clause(o)
        case o: Emv2Propagation => writeEmv2Propagation(o)
        case o: Emv2Flow => writeEmv2Flow(o)
        case o: Emv2BehaviorSection => writeEmv2BehaviorSection(o)
        case o: ErrorPropagation => writeErrorPropagation(o)
      }
    }

    def writeEmv2Lib(o: Emv2Lib): Unit = {
      o match {
        case o: Emv2Library => writeEmv2Library(o)
      }
    }

    def writePropagationDirectionType(o: PropagationDirection.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEmv2ElementRef(o: Emv2ElementRef): Unit = {
      writer.writeZ(Constants.Emv2ElementRef)
      writeEmv2ElementKindType(o.kind)
      writeName(o.name)
      writer.writeISZ(o.errorTypes, writeName _)
    }

    def writeEmv2ElementKindType(o: Emv2ElementKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEmv2Library(o: Emv2Library): Unit = {
      writer.writeZ(Constants.Emv2Library)
      writeName(o.name)
      writer.writeISZ(o.useTypes, writer.writeString _)
      writer.writeISZ(o.errorTypeDef, writeErrorTypeDef _)
      writer.writeISZ(o.errorTypeSetDef, writeErrorTypeSetDef _)
      writer.writeISZ(o.alias, writeErrorAliasDef _)
      writer.writeISZ(o.behaveStateMachine, writeBehaveStateMachine _)
    }

    def writeErrorKindType(o: ErrorKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeErrorTypeDef(o: ErrorTypeDef): Unit = {
      writer.writeZ(Constants.ErrorTypeDef)
      writeName(o.id)
      writer.writeOption(o.extendType, writeName _)
      writer.writeString(o.uriFrag)
    }

    def writeErrorAliasDef(o: ErrorAliasDef): Unit = {
      writer.writeZ(Constants.ErrorAliasDef)
      writeName(o.errorType)
      writeName(o.aliseType)
    }

    def writeErrorTypeSetDef(o: ErrorTypeSetDef): Unit = {
      writer.writeZ(Constants.ErrorTypeSetDef)
      writeName(o.id)
      writer.writeISZ(o.errorTypes, writeName _)
    }

    def writeBehaveStateMachine(o: BehaveStateMachine): Unit = {
      writer.writeZ(Constants.BehaveStateMachine)
      writeName(o.id)
      writer.writeISZ(o.events, writeErrorEvent _)
      writer.writeISZ(o.states, writeErrorState _)
      writer.writeISZ(o.transitions, writeErrorTransition _)
      writer.writeISZ(o.properties, writeProperty _)
    }

    def writeErrorEvent(o: ErrorEvent): Unit = {
      writer.writeZ(Constants.ErrorEvent)
      writeName(o.id)
    }

    def writeErrorState(o: ErrorState): Unit = {
      writer.writeZ(Constants.ErrorState)
      writeName(o.id)
      writer.writeB(o.isInitial)
    }

    def writeErrorTransition(o: ErrorTransition): Unit = {
      writer.writeZ(Constants.ErrorTransition)
      writer.writeOption(o.id, writeName _)
      writeName(o.sourceState)
      writeErrorCondition(o.condition)
      writeName(o.targetState)
    }

    def writeErrorCondition(o: ErrorCondition): Unit = {
      o match {
        case o: ConditionTrigger => writeConditionTrigger(o)
        case o: AndCondition => writeAndCondition(o)
        case o: OrCondition => writeOrCondition(o)
        case o: AllCondition => writeAllCondition(o)
        case o: OrMoreCondition => writeOrMoreCondition(o)
        case o: OrLessCondition => writeOrLessCondition(o)
      }
    }

    def writeConditionTrigger(o: ConditionTrigger): Unit = {
      writer.writeZ(Constants.ConditionTrigger)
      writer.writeISZ(o.events, writeName _)
      writer.writeISZ(o.propagationPoints, writeEmv2Propagation _)
    }

    def writeAndCondition(o: AndCondition): Unit = {
      writer.writeZ(Constants.AndCondition)
      writer.writeISZ(o.op, writeErrorCondition _)
    }

    def writeOrCondition(o: OrCondition): Unit = {
      writer.writeZ(Constants.OrCondition)
      writer.writeISZ(o.op, writeErrorCondition _)
    }

    def writeAllCondition(o: AllCondition): Unit = {
      writer.writeZ(Constants.AllCondition)
      writer.writeISZ(o.op, writeErrorCondition _)
    }

    def writeOrMoreCondition(o: OrMoreCondition): Unit = {
      writer.writeZ(Constants.OrMoreCondition)
      writer.writeZ(o.number)
      writer.writeISZ(o.conditions, writeErrorCondition _)
    }

    def writeOrLessCondition(o: OrLessCondition): Unit = {
      writer.writeZ(Constants.OrLessCondition)
      writer.writeZ(o.number)
      writer.writeISZ(o.conditions, writeErrorCondition _)
    }

    def writeEmv2Clause(o: Emv2Clause): Unit = {
      writer.writeZ(Constants.Emv2Clause)
      writer.writeISZ(o.libraries, writeName _)
      writer.writeISZ(o.propagations, writeEmv2Propagation _)
      writer.writeISZ(o.flows, writeEmv2Flow _)
      writer.writeOption(o.componentBehavior, writeEmv2BehaviorSection _)
      writer.writeISZ(o.properties, writeProperty _)
    }

    def writeEmv2Propagation(o: Emv2Propagation): Unit = {
      writer.writeZ(Constants.Emv2Propagation)
      writePropagationDirectionType(o.direction)
      writeName(o.propagationPoint)
      writer.writeISZ(o.errorTokens, writeName _)
    }

    def writeEmv2Flow(o: Emv2Flow): Unit = {
      writer.writeZ(Constants.Emv2Flow)
      writeName(o.identifier)
      writeFlowKindType(o.kind)
      writer.writeOption(o.sourcePropagation, writeEmv2Propagation _)
      writer.writeOption(o.sinkPropagation, writeEmv2Propagation _)
      writer.writeString(o.uriFrag)
    }

    def writeEmv2BehaviorSection(o: Emv2BehaviorSection): Unit = {
      writer.writeZ(Constants.Emv2BehaviorSection)
      writer.writeISZ(o.events, writeErrorEvent _)
      writer.writeISZ(o.transitions, writeErrorTransition _)
      writer.writeISZ(o.propagations, writeErrorPropagation _)
    }

    def writeErrorPropagation(o: ErrorPropagation): Unit = {
      writer.writeZ(Constants.ErrorPropagation)
      writer.writeOption(o.id, writeName _)
      writer.writeISZ(o.source, writeName _)
      writer.writeOption(o.condition, writeErrorCondition _)
      writer.writeISZ(o.target, writeEmv2Propagation _)
    }

    def writeGclSymbol(o: GclSymbol): Unit = {
      o match {
        case o: GclSubclause => writeGclSubclause(o)
        case o: GclMethod => writeGclMethod(o)
        case o: GclStateVar => writeGclStateVar(o)
        case o: GclInvariant => writeGclInvariant(o)
        case o: GclAssume => writeGclAssume(o)
        case o: GclGuarantee => writeGclGuarantee(o)
        case o: GclIntegration => writeGclIntegration(o)
        case o: GclCaseStatement => writeGclCaseStatement(o)
        case o: GclInitialize => writeGclInitialize(o)
        case o: GclCompute => writeGclCompute(o)
        case o: GclHandle => writeGclHandle(o)
        case o: GclTODO => writeGclTODO(o)
        case o: GclLib => writeGclLib(o)
      }
    }

    def writeGclSubclause(o: GclSubclause): Unit = {
      writer.writeZ(Constants.GclSubclause)
      writer.writeISZ(o.state, writeGclStateVar _)
      writer.writeISZ(o.methods, writeGclMethod _)
      writer.writeISZ(o.invariants, writeGclInvariant _)
      writer.writeOption(o.initializes, writeGclInitialize _)
      writer.writeOption(o.integration, writeGclIntegration _)
      writer.writeOption(o.compute, writeGclCompute _)
    }

    def writeGclMethod(o: GclMethod): Unit = {
      writer.writeZ(Constants.GclMethod)
      write_langastStmtMethod(o.method)
    }

    def writeGclStateVar(o: GclStateVar): Unit = {
      writer.writeZ(Constants.GclStateVar)
      writer.writeString(o.name)
      writer.writeString(o.classifier)
      writer.writeOption(o.posOpt, writer.writePosition _)
    }

    def writeGclSpec(o: GclSpec): Unit = {
      o match {
        case o: GclInvariant => writeGclInvariant(o)
        case o: GclAssume => writeGclAssume(o)
        case o: GclGuarantee => writeGclGuarantee(o)
      }
    }

    def writeGclInvariant(o: GclInvariant): Unit = {
      writer.writeZ(Constants.GclInvariant)
      writer.writeString(o.id)
      writer.writeOption(o.descriptor, writer.writeString _)
      write_langastExp(o.exp)
      writer.writeOption(o.posOpt, writer.writePosition _)
    }

    def writeGclComputeSpec(o: GclComputeSpec): Unit = {
      o match {
        case o: GclAssume => writeGclAssume(o)
        case o: GclGuarantee => writeGclGuarantee(o)
      }
    }

    def writeGclAssume(o: GclAssume): Unit = {
      writer.writeZ(Constants.GclAssume)
      writer.writeString(o.id)
      writer.writeOption(o.descriptor, writer.writeString _)
      write_langastExp(o.exp)
      writer.writeOption(o.posOpt, writer.writePosition _)
    }

    def writeGclGuarantee(o: GclGuarantee): Unit = {
      writer.writeZ(Constants.GclGuarantee)
      writer.writeString(o.id)
      writer.writeOption(o.descriptor, writer.writeString _)
      write_langastExp(o.exp)
      writer.writeOption(o.posOpt, writer.writePosition _)
    }

    def writeGclIntegration(o: GclIntegration): Unit = {
      writer.writeZ(Constants.GclIntegration)
      writer.writeISZ(o.specs, writeGclSpec _)
    }

    def writeGclCaseStatement(o: GclCaseStatement): Unit = {
      writer.writeZ(Constants.GclCaseStatement)
      writer.writeString(o.id)
      writer.writeOption(o.descriptor, writer.writeString _)
      write_langastExp(o.assumes)
      write_langastExp(o.guarantees)
      writer.writeOption(o.posOpt, writer.writePosition _)
    }

    def writeGclInitialize(o: GclInitialize): Unit = {
      writer.writeZ(Constants.GclInitialize)
      writer.writeISZ(o.modifies, write_langastExp _)
      writer.writeISZ(o.guarantees, writeGclGuarantee _)
    }

    def writeGclCompute(o: GclCompute): Unit = {
      writer.writeZ(Constants.GclCompute)
      writer.writeISZ(o.modifies, write_langastExp _)
      writer.writeISZ(o.specs, writeGclComputeSpec _)
      writer.writeISZ(o.cases, writeGclCaseStatement _)
      writer.writeISZ(o.handlers, writeGclHandle _)
    }

    def writeGclHandle(o: GclHandle): Unit = {
      writer.writeZ(Constants.GclHandle)
      write_langastExp(o.port)
      writer.writeISZ(o.modifies, write_langastExp _)
      writer.writeISZ(o.guarantees, writeGclGuarantee _)
    }

    def writeGclTODO(o: GclTODO): Unit = {
      writer.writeZ(Constants.GclTODO)
    }

    def writeGclLib(o: GclLib): Unit = {
      writer.writeZ(Constants.GclLib)
      writeName(o.containingPackage)
      writer.writeISZ(o.methods, writeGclMethod _)
    }

    def writeSmfAnnex(o: SmfAnnex): Unit = {
      o match {
        case o: SmfClause => writeSmfClause(o)
        case o: SmfClassification => writeSmfClassification(o)
        case o: SmfDeclass => writeSmfDeclass(o)
        case o: SmfType => writeSmfType(o)
      }
    }

    def writeSmfLib(o: SmfLib): Unit = {
      o match {
        case o: SmfLibrary => writeSmfLibrary(o)
      }
    }

    def writeSmfClause(o: SmfClause): Unit = {
      writer.writeZ(Constants.SmfClause)
      writer.writeISZ(o.classification, writeSmfClassification _)
      writer.writeISZ(o.declass, writeSmfDeclass _)
    }

    def writeSmfClassification(o: SmfClassification): Unit = {
      writer.writeZ(Constants.SmfClassification)
      writeName(o.portName)
      writeName(o.typeName)
    }

    def writeSmfDeclass(o: SmfDeclass): Unit = {
      writer.writeZ(Constants.SmfDeclass)
      writeName(o.flowName)
      writer.writeOption(o.srcType, writeName _)
      writeName(o.snkType)
    }

    def writeSmfLibrary(o: SmfLibrary): Unit = {
      writer.writeZ(Constants.SmfLibrary)
      writer.writeISZ(o.types, writeSmfType _)
    }

    def writeSmfType(o: SmfType): Unit = {
      writer.writeZ(Constants.SmfType)
      writeName(o.typeName)
      writer.writeISZ(o.parentType, writeName _)
    }

    def write_langastTopUnit(o: org.sireum.lang.ast.TopUnit): Unit = {
      o match {
        case o: org.sireum.lang.ast.TopUnit.Program => write_langastTopUnitProgram(o)
        case o: org.sireum.lang.ast.TopUnit.SequentUnit => write_langastTopUnitSequentUnit(o)
        case o: org.sireum.lang.ast.TopUnit.TruthTableUnit => write_langastTopUnitTruthTableUnit(o)
      }
    }

    def write_langastTopUnitProgram(o: org.sireum.lang.ast.TopUnit.Program): Unit = {
      writer.writeZ(Constants._langastTopUnitProgram)
      writer.writeOption(o.fileUriOpt, writer.writeString _)
      write_langastName(o.packageName)
      write_langastBody(o.body)
    }

    def write_langastTopUnitSequentUnit(o: org.sireum.lang.ast.TopUnit.SequentUnit): Unit = {
      writer.writeZ(Constants._langastTopUnitSequentUnit)
      writer.writeOption(o.fileUriOpt, writer.writeString _)
      write_langastSequent(o.sequent)
    }

    def write_langastTopUnitTruthTableUnit(o: org.sireum.lang.ast.TopUnit.TruthTableUnit): Unit = {
      writer.writeZ(Constants._langastTopUnitTruthTableUnit)
      writer.writeOption(o.fileUriOpt, writer.writeString _)
      writer.writeISZ(o.stars, writer.writePosition _)
      writer.writeISZ(o.vars, write_langastId _)
      writer.writePosition(o.separator)
      writer.writeB(o.isSequent)
      write_langastSequent(o.sequent)
      writer.writeISZ(o.rows, write_langastTruthTableRow _)
      writer.writeOption(o.conclusionOpt, write_langastTruthTableConclusion _)
    }

    def write_langastStmt(o: org.sireum.lang.ast.Stmt): Unit = {
      o match {
        case o: org.sireum.lang.ast.Stmt.Import => write_langastStmtImport(o)
        case o: org.sireum.lang.ast.Stmt.Var => write_langastStmtVar(o)
        case o: org.sireum.lang.ast.Stmt.VarPattern => write_langastStmtVarPattern(o)
        case o: org.sireum.lang.ast.Stmt.SpecVar => write_langastStmtSpecVar(o)
        case o: org.sireum.lang.ast.Stmt.Method => write_langastStmtMethod(o)
        case o: org.sireum.lang.ast.Stmt.ExtMethod => write_langastStmtExtMethod(o)
        case o: org.sireum.lang.ast.Stmt.JustMethod => write_langastStmtJustMethod(o)
        case o: org.sireum.lang.ast.Stmt.SpecMethod => write_langastStmtSpecMethod(o)
        case o: org.sireum.lang.ast.Stmt.Enum => write_langastStmtEnum(o)
        case o: org.sireum.lang.ast.Stmt.SubZ => write_langastStmtSubZ(o)
        case o: org.sireum.lang.ast.Stmt.Object => write_langastStmtObject(o)
        case o: org.sireum.lang.ast.Stmt.Sig => write_langastStmtSig(o)
        case o: org.sireum.lang.ast.Stmt.Adt => write_langastStmtAdt(o)
        case o: org.sireum.lang.ast.Stmt.TypeAlias => write_langastStmtTypeAlias(o)
        case o: org.sireum.lang.ast.Stmt.Assign => write_langastStmtAssign(o)
        case o: org.sireum.lang.ast.Stmt.Block => write_langastStmtBlock(o)
        case o: org.sireum.lang.ast.Stmt.If => write_langastStmtIf(o)
        case o: org.sireum.lang.ast.Stmt.Match => write_langastStmtMatch(o)
        case o: org.sireum.lang.ast.Stmt.While => write_langastStmtWhile(o)
        case o: org.sireum.lang.ast.Stmt.DoWhile => write_langastStmtDoWhile(o)
        case o: org.sireum.lang.ast.Stmt.For => write_langastStmtFor(o)
        case o: org.sireum.lang.ast.Stmt.Return => write_langastStmtReturn(o)
        case o: org.sireum.lang.ast.Stmt.Expr => write_langastStmtExpr(o)
        case o: org.sireum.lang.ast.Stmt.Fact => write_langastStmtFact(o)
        case o: org.sireum.lang.ast.Stmt.Inv => write_langastStmtInv(o)
        case o: org.sireum.lang.ast.Stmt.Theorem => write_langastStmtTheorem(o)
        case o: org.sireum.lang.ast.Stmt.DataRefinement => write_langastStmtDataRefinement(o)
        case o: org.sireum.lang.ast.Stmt.SpecLabel => write_langastStmtSpecLabel(o)
        case o: org.sireum.lang.ast.Stmt.SpecBlock => write_langastStmtSpecBlock(o)
        case o: org.sireum.lang.ast.Stmt.DeduceSequent => write_langastStmtDeduceSequent(o)
        case o: org.sireum.lang.ast.Stmt.DeduceSteps => write_langastStmtDeduceSteps(o)
        case o: org.sireum.lang.ast.Stmt.Havoc => write_langastStmtHavoc(o)
      }
    }

    def write_langastHasModifies(o: org.sireum.lang.ast.HasModifies): Unit = {
      o match {
        case o: org.sireum.lang.ast.LoopContract => write_langastLoopContract(o)
        case o: org.sireum.lang.ast.MethodContract.Simple => write_langastMethodContractSimple(o)
        case o: org.sireum.lang.ast.MethodContract.Cases => write_langastMethodContractCases(o)
      }
    }

    def write_langastLoopContract(o: org.sireum.lang.ast.LoopContract): Unit = {
      writer.writeZ(Constants._langastLoopContract)
      writer.writeISZ(o.invariants, write_langastExp _)
      writer.writeISZ(o.modifies, write_langastExpRef _)
      writer.writeOption(o.maxItOpt, write_langastExpLitZ _)
    }

    def write_langastStmtImport(o: org.sireum.lang.ast.Stmt.Import): Unit = {
      writer.writeZ(Constants._langastStmtImport)
      writer.writeISZ(o.importers, write_langastStmtImportImporter _)
      write_langastAttr(o.attr)
    }

    def write_langastStmtImportImporter(o: org.sireum.lang.ast.Stmt.Import.Importer): Unit = {
      writer.writeZ(Constants._langastStmtImportImporter)
      write_langastName(o.name)
      writer.writeOption(o.selectorOpt, write_langastStmtImportSelector _)
    }

    def write_langastStmtImportSelector(o: org.sireum.lang.ast.Stmt.Import.Selector): Unit = {
      o match {
        case o: org.sireum.lang.ast.Stmt.Import.MultiSelector => write_langastStmtImportMultiSelector(o)
        case o: org.sireum.lang.ast.Stmt.Import.WildcardSelector => write_langastStmtImportWildcardSelector(o)
      }
    }

    def write_langastStmtImportMultiSelector(o: org.sireum.lang.ast.Stmt.Import.MultiSelector): Unit = {
      writer.writeZ(Constants._langastStmtImportMultiSelector)
      writer.writeISZ(o.selectors, write_langastStmtImportNamedSelector _)
    }

    def write_langastStmtImportWildcardSelector(o: org.sireum.lang.ast.Stmt.Import.WildcardSelector): Unit = {
      writer.writeZ(Constants._langastStmtImportWildcardSelector)
    }

    def write_langastStmtImportNamedSelector(o: org.sireum.lang.ast.Stmt.Import.NamedSelector): Unit = {
      writer.writeZ(Constants._langastStmtImportNamedSelector)
      write_langastId(o.from)
      write_langastId(o.to)
    }

    def write_langastStmtVar(o: org.sireum.lang.ast.Stmt.Var): Unit = {
      writer.writeZ(Constants._langastStmtVar)
      writer.writeB(o.isSpec)
      writer.writeB(o.isVal)
      write_langastId(o.id)
      writer.writeOption(o.tipeOpt, write_langastType _)
      writer.writeOption(o.initOpt, write_langastAssignExp _)
      write_langastResolvedAttr(o.attr)
    }

    def write_langastStmtVarPattern(o: org.sireum.lang.ast.Stmt.VarPattern): Unit = {
      writer.writeZ(Constants._langastStmtVarPattern)
      writer.writeB(o.isSpec)
      writer.writeB(o.isVal)
      write_langastPattern(o.pattern)
      writer.writeOption(o.tipeOpt, write_langastType _)
      write_langastAssignExp(o.init)
      write_langastAttr(o.attr)
    }

    def write_langastStmtSpecVar(o: org.sireum.lang.ast.Stmt.SpecVar): Unit = {
      writer.writeZ(Constants._langastStmtSpecVar)
      writer.writeB(o.isVal)
      write_langastId(o.id)
      write_langastType(o.tipe)
      write_langastResolvedAttr(o.attr)
    }

    def write_langastStmtMethod(o: org.sireum.lang.ast.Stmt.Method): Unit = {
      writer.writeZ(Constants._langastStmtMethod)
      writer.writeB(o.typeChecked)
      write_langastPurityType(o.purity)
      writer.writeB(o.hasOverride)
      writer.writeB(o.isHelper)
      write_langastMethodSig(o.sig)
      write_langastMethodContract(o.mcontract)
      writer.writeOption(o.bodyOpt, write_langastBody _)
      write_langastResolvedAttr(o.attr)
    }

    def write_langastStmtExtMethod(o: org.sireum.lang.ast.Stmt.ExtMethod): Unit = {
      writer.writeZ(Constants._langastStmtExtMethod)
      writer.writeB(o.isPure)
      write_langastMethodSig(o.sig)
      write_langastMethodContract(o.contract)
      write_langastResolvedAttr(o.attr)
    }

    def write_langastStmtJustMethod(o: org.sireum.lang.ast.Stmt.JustMethod): Unit = {
      writer.writeZ(Constants._langastStmtJustMethod)
      writer.writeOption(o.etaOpt, write_langastExpLitString _)
      write_langastMethodSig(o.sig)
      write_langastResolvedAttr(o.attr)
    }

    def write_langastStmtSpecMethod(o: org.sireum.lang.ast.Stmt.SpecMethod): Unit = {
      writer.writeZ(Constants._langastStmtSpecMethod)
      write_langastMethodSig(o.sig)
      write_langastResolvedAttr(o.attr)
    }

    def write_langastStmtEnum(o: org.sireum.lang.ast.Stmt.Enum): Unit = {
      writer.writeZ(Constants._langastStmtEnum)
      write_langastId(o.id)
      writer.writeISZ(o.elements, write_langastId _)
      write_langastAttr(o.attr)
    }

    def write_langastStmtSubZ(o: org.sireum.lang.ast.Stmt.SubZ): Unit = {
      writer.writeZ(Constants._langastStmtSubZ)
      write_langastId(o.id)
      writer.writeB(o.isSigned)
      writer.writeB(o.isBitVector)
      writer.writeB(o.isWrapped)
      writer.writeB(o.hasMin)
      writer.writeB(o.hasMax)
      writer.writeZ(o.bitWidth)
      writer.writeZ(o.min)
      writer.writeZ(o.max)
      writer.writeB(o.isIndex)
      writer.writeZ(o.index)
      write_langastAttr(o.attr)
    }

    def write_langastStmtObject(o: org.sireum.lang.ast.Stmt.Object): Unit = {
      writer.writeZ(Constants._langastStmtObject)
      writer.writeB(o.isApp)
      writer.writeOption(o.extNameOpt, writer.writeString _)
      write_langastId(o.id)
      writer.writeISZ(o.stmts, write_langastStmt _)
      write_langastAttr(o.attr)
    }

    def write_langastStmtSig(o: org.sireum.lang.ast.Stmt.Sig): Unit = {
      writer.writeZ(Constants._langastStmtSig)
      writer.writeB(o.isImmutable)
      writer.writeB(o.isExt)
      write_langastId(o.id)
      writer.writeISZ(o.typeParams, write_langastTypeParam _)
      writer.writeISZ(o.parents, write_langastTypeNamed _)
      writer.writeISZ(o.stmts, write_langastStmt _)
      write_langastAttr(o.attr)
    }

    def write_langastStmtAdt(o: org.sireum.lang.ast.Stmt.Adt): Unit = {
      writer.writeZ(Constants._langastStmtAdt)
      writer.writeB(o.isRoot)
      writer.writeB(o.isDatatype)
      write_langastId(o.id)
      writer.writeISZ(o.typeParams, write_langastTypeParam _)
      writer.writeISZ(o.params, write_langastAdtParam _)
      writer.writeISZ(o.parents, write_langastTypeNamed _)
      writer.writeISZ(o.stmts, write_langastStmt _)
      write_langastAttr(o.attr)
    }

    def write_langastStmtTypeAlias(o: org.sireum.lang.ast.Stmt.TypeAlias): Unit = {
      writer.writeZ(Constants._langastStmtTypeAlias)
      write_langastId(o.id)
      writer.writeISZ(o.typeParams, write_langastTypeParam _)
      write_langastType(o.tipe)
      write_langastAttr(o.attr)
    }

    def write_langastStmtAssign(o: org.sireum.lang.ast.Stmt.Assign): Unit = {
      writer.writeZ(Constants._langastStmtAssign)
      write_langastExp(o.lhs)
      write_langastAssignExp(o.rhs)
      write_langastAttr(o.attr)
    }

    def write_langastStmtBlock(o: org.sireum.lang.ast.Stmt.Block): Unit = {
      writer.writeZ(Constants._langastStmtBlock)
      write_langastBody(o.body)
      write_langastAttr(o.attr)
    }

    def write_langastStmtIf(o: org.sireum.lang.ast.Stmt.If): Unit = {
      writer.writeZ(Constants._langastStmtIf)
      write_langastExp(o.cond)
      write_langastBody(o.thenBody)
      write_langastBody(o.elseBody)
      write_langastAttr(o.attr)
    }

    def write_langastStmtMatch(o: org.sireum.lang.ast.Stmt.Match): Unit = {
      writer.writeZ(Constants._langastStmtMatch)
      write_langastExp(o.exp)
      writer.writeISZ(o.cases, write_langastCase _)
      write_langastAttr(o.attr)
    }

    def write_langastStmtWhile(o: org.sireum.lang.ast.Stmt.While): Unit = {
      writer.writeZ(Constants._langastStmtWhile)
      writer.writeISZ(o.context, writer.writeString _)
      write_langastExp(o.cond)
      write_langastLoopContract(o.contract)
      write_langastBody(o.body)
      write_langastAttr(o.attr)
    }

    def write_langastStmtDoWhile(o: org.sireum.lang.ast.Stmt.DoWhile): Unit = {
      writer.writeZ(Constants._langastStmtDoWhile)
      writer.writeISZ(o.context, writer.writeString _)
      write_langastExp(o.cond)
      write_langastLoopContract(o.contract)
      write_langastBody(o.body)
      write_langastAttr(o.attr)
    }

    def write_langastStmtFor(o: org.sireum.lang.ast.Stmt.For): Unit = {
      writer.writeZ(Constants._langastStmtFor)
      writer.writeISZ(o.context, writer.writeString _)
      writer.writeISZ(o.enumGens, write_langastEnumGenFor _)
      write_langastBody(o.body)
      write_langastAttr(o.attr)
    }

    def write_langastStmtReturn(o: org.sireum.lang.ast.Stmt.Return): Unit = {
      writer.writeZ(Constants._langastStmtReturn)
      writer.writeOption(o.expOpt, write_langastExp _)
      write_langastTypedAttr(o.attr)
    }

    def write_langastStmtExpr(o: org.sireum.lang.ast.Stmt.Expr): Unit = {
      writer.writeZ(Constants._langastStmtExpr)
      write_langastExp(o.exp)
      write_langastTypedAttr(o.attr)
    }

    def write_langastStmtSpec(o: org.sireum.lang.ast.Stmt.Spec): Unit = {
      o match {
        case o: org.sireum.lang.ast.Stmt.Fact => write_langastStmtFact(o)
        case o: org.sireum.lang.ast.Stmt.Inv => write_langastStmtInv(o)
        case o: org.sireum.lang.ast.Stmt.Theorem => write_langastStmtTheorem(o)
        case o: org.sireum.lang.ast.Stmt.DataRefinement => write_langastStmtDataRefinement(o)
        case o: org.sireum.lang.ast.Stmt.SpecLabel => write_langastStmtSpecLabel(o)
        case o: org.sireum.lang.ast.Stmt.SpecBlock => write_langastStmtSpecBlock(o)
        case o: org.sireum.lang.ast.Stmt.DeduceSequent => write_langastStmtDeduceSequent(o)
        case o: org.sireum.lang.ast.Stmt.DeduceSteps => write_langastStmtDeduceSteps(o)
        case o: org.sireum.lang.ast.Stmt.Havoc => write_langastStmtHavoc(o)
      }
    }

    def write_langastStmtFact(o: org.sireum.lang.ast.Stmt.Fact): Unit = {
      writer.writeZ(Constants._langastStmtFact)
      write_langastId(o.id)
      writer.writeISZ(o.typeParams, write_langastTypeParam _)
      writer.writeOption(o.descOpt, write_langastExpLitString _)
      writer.writeISZ(o.claims, write_langastExp _)
      writer.writeB(o.isFun)
      write_langastResolvedAttr(o.attr)
    }

    def write_langastStmtInv(o: org.sireum.lang.ast.Stmt.Inv): Unit = {
      writer.writeZ(Constants._langastStmtInv)
      write_langastId(o.id)
      writer.writeISZ(o.claims, write_langastExp _)
      write_langastResolvedAttr(o.attr)
    }

    def write_langastStmtTheorem(o: org.sireum.lang.ast.Stmt.Theorem): Unit = {
      writer.writeZ(Constants._langastStmtTheorem)
      writer.writeB(o.isLemma)
      write_langastId(o.id)
      writer.writeISZ(o.typeParams, write_langastTypeParam _)
      writer.writeOption(o.descOpt, write_langastExpLitString _)
      write_langastExp(o.claim)
      writer.writeB(o.isFun)
      write_langastProofAst(o.proof)
      write_langastResolvedAttr(o.attr)
    }

    def write_langastStmtDataRefinement(o: org.sireum.lang.ast.Stmt.DataRefinement): Unit = {
      writer.writeZ(Constants._langastStmtDataRefinement)
      write_langastExpIdent(o.rep)
      writer.writeISZ(o.refs, write_langastExpIdent _)
      writer.writeISZ(o.claims, write_langastExp _)
      write_langastAttr(o.attr)
    }

    def write_langastStmtSpecLabel(o: org.sireum.lang.ast.Stmt.SpecLabel): Unit = {
      writer.writeZ(Constants._langastStmtSpecLabel)
      write_langastId(o.id)
    }

    def write_langastStmtSpecBlock(o: org.sireum.lang.ast.Stmt.SpecBlock): Unit = {
      writer.writeZ(Constants._langastStmtSpecBlock)
      write_langastStmtBlock(o.block)
    }

    def write_langastStmtDeduceSequent(o: org.sireum.lang.ast.Stmt.DeduceSequent): Unit = {
      writer.writeZ(Constants._langastStmtDeduceSequent)
      writer.writeOption(o.justOpt, write_langastExpLitString _)
      writer.writeISZ(o.sequents, write_langastSequent _)
      write_langastAttr(o.attr)
    }

    def write_langastStmtDeduceSteps(o: org.sireum.lang.ast.Stmt.DeduceSteps): Unit = {
      writer.writeZ(Constants._langastStmtDeduceSteps)
      writer.writeISZ(o.steps, write_langastProofAstStep _)
      write_langastAttr(o.attr)
    }

    def write_langastStmtHavoc(o: org.sireum.lang.ast.Stmt.Havoc): Unit = {
      writer.writeZ(Constants._langastStmtHavoc)
      writer.writeISZ(o.args, write_langastExpRef _)
      write_langastAttr(o.attr)
    }

    def write_langastMethodContract(o: org.sireum.lang.ast.MethodContract): Unit = {
      o match {
        case o: org.sireum.lang.ast.MethodContract.Simple => write_langastMethodContractSimple(o)
        case o: org.sireum.lang.ast.MethodContract.Cases => write_langastMethodContractCases(o)
      }
    }

    def write_langastMethodContractAccesses(o: org.sireum.lang.ast.MethodContract.Accesses): Unit = {
      writer.writeZ(Constants._langastMethodContractAccesses)
      writer.writeISZ(o.refs, write_langastExpRef _)
      write_langastAttr(o.attr)
    }

    def write_langastMethodContractClaims(o: org.sireum.lang.ast.MethodContract.Claims): Unit = {
      writer.writeZ(Constants._langastMethodContractClaims)
      writer.writeISZ(o.claims, write_langastExp _)
      write_langastAttr(o.attr)
    }

    def write_langastMethodContractSimple(o: org.sireum.lang.ast.MethodContract.Simple): Unit = {
      writer.writeZ(Constants._langastMethodContractSimple)
      write_langastMethodContractAccesses(o.readsClause)
      write_langastMethodContractClaims(o.requiresClause)
      write_langastMethodContractAccesses(o.modifiesClause)
      write_langastMethodContractClaims(o.ensuresClause)
      write_langastMethodContractInfoFlows(o.infoFlowsClause)
      write_langastAttr(o.attr)
    }

    def write_langastMethodContractCases(o: org.sireum.lang.ast.MethodContract.Cases): Unit = {
      writer.writeZ(Constants._langastMethodContractCases)
      write_langastMethodContractAccesses(o.readsClause)
      write_langastMethodContractAccesses(o.modifiesClause)
      writer.writeISZ(o.cases, write_langastMethodContractCase _)
      write_langastAttr(o.attr)
    }

    def write_langastMethodContractCase(o: org.sireum.lang.ast.MethodContract.Case): Unit = {
      writer.writeZ(Constants._langastMethodContractCase)
      write_langastExpLitString(o.label)
      write_langastMethodContractClaims(o.requiresClause)
      write_langastMethodContractClaims(o.ensuresClause)
    }

    def write_langastMethodContractInfoFlows(o: org.sireum.lang.ast.MethodContract.InfoFlows): Unit = {
      writer.writeZ(Constants._langastMethodContractInfoFlows)
      writer.writeISZ(o.flows, write_langastMethodContractInfoFlow _)
      write_langastAttr(o.attr)
    }

    def write_langastMethodContractInfoFlow(o: org.sireum.lang.ast.MethodContract.InfoFlow): Unit = {
      writer.writeZ(Constants._langastMethodContractInfoFlow)
      write_langastExpLitString(o.label)
      write_langastMethodContractClaims(o.requiresClause)
      write_langastMethodContractClaims(o.inAgreeClause)
      write_langastMethodContractClaims(o.outAgreeClause)
    }

    def write_langastSequent(o: org.sireum.lang.ast.Sequent): Unit = {
      writer.writeZ(Constants._langastSequent)
      writer.writeISZ(o.premises, write_langastExp _)
      write_langastExp(o.conclusion)
      writer.writeISZ(o.steps, write_langastProofAstStep _)
      write_langastAttr(o.attr)
    }

    def write_langastProofAst(o: org.sireum.lang.ast.ProofAst): Unit = {
      writer.writeZ(Constants._langastProofAst)
      writer.writeISZ(o.steps, write_langastProofAstStep _)
      write_langastAttr(o.attr)
    }

    def write_langastProofAstStep(o: org.sireum.lang.ast.ProofAst.Step): Unit = {
      o match {
        case o: org.sireum.lang.ast.ProofAst.Step.Regular => write_langastProofAstStepRegular(o)
        case o: org.sireum.lang.ast.ProofAst.Step.Assume => write_langastProofAstStepAssume(o)
        case o: org.sireum.lang.ast.ProofAst.Step.Assert => write_langastProofAstStepAssert(o)
        case o: org.sireum.lang.ast.ProofAst.Step.SubProof => write_langastProofAstStepSubProof(o)
        case o: org.sireum.lang.ast.ProofAst.Step.Let => write_langastProofAstStepLet(o)
        case o: org.sireum.lang.ast.ProofAst.Step.StructInduction => write_langastProofAstStepStructInduction(o)
      }
    }

    def write_langastProofAstStepId(o: org.sireum.lang.ast.ProofAst.StepId): Unit = {
      o match {
        case o: org.sireum.lang.ast.ProofAst.StepId.Num => write_langastProofAstStepIdNum(o)
        case o: org.sireum.lang.ast.ProofAst.StepId.Str => write_langastProofAstStepIdStr(o)
      }
    }

    def write_langastProofAstStepIdNum(o: org.sireum.lang.ast.ProofAst.StepId.Num): Unit = {
      writer.writeZ(Constants._langastProofAstStepIdNum)
      writer.writeZ(o.no)
      write_langastAttr(o.attr)
    }

    def write_langastProofAstStepIdStr(o: org.sireum.lang.ast.ProofAst.StepId.Str): Unit = {
      writer.writeZ(Constants._langastProofAstStepIdStr)
      writer.writeString(o.value)
      write_langastAttr(o.attr)
    }

    def write_langastProofAstStepRegular(o: org.sireum.lang.ast.ProofAst.Step.Regular): Unit = {
      writer.writeZ(Constants._langastProofAstStepRegular)
      write_langastProofAstStepId(o.id)
      write_langastExp(o.claim)
      write_langastProofAstStepJustification(o.just)
    }

    def write_langastProofAstStepAssume(o: org.sireum.lang.ast.ProofAst.Step.Assume): Unit = {
      writer.writeZ(Constants._langastProofAstStepAssume)
      write_langastProofAstStepId(o.id)
      write_langastExp(o.claim)
    }

    def write_langastProofAstStepAssert(o: org.sireum.lang.ast.ProofAst.Step.Assert): Unit = {
      writer.writeZ(Constants._langastProofAstStepAssert)
      write_langastProofAstStepId(o.id)
      write_langastExp(o.claim)
      writer.writeISZ(o.steps, write_langastProofAstStep _)
    }

    def write_langastProofAstStepSubProof(o: org.sireum.lang.ast.ProofAst.Step.SubProof): Unit = {
      writer.writeZ(Constants._langastProofAstStepSubProof)
      write_langastProofAstStepId(o.id)
      writer.writeISZ(o.steps, write_langastProofAstStep _)
    }

    def write_langastProofAstStepLet(o: org.sireum.lang.ast.ProofAst.Step.Let): Unit = {
      writer.writeZ(Constants._langastProofAstStepLet)
      write_langastProofAstStepId(o.id)
      writer.writeISZ(o.params, write_langastProofAstStepLetParam _)
      writer.writeISZ(o.steps, write_langastProofAstStep _)
    }

    def write_langastProofAstStepLetParam(o: org.sireum.lang.ast.ProofAst.Step.Let.Param): Unit = {
      writer.writeZ(Constants._langastProofAstStepLetParam)
      write_langastId(o.id)
      writer.writeOption(o.tipeOpt, write_langastType _)
    }

    def write_langastProofAstStepStructInduction(o: org.sireum.lang.ast.ProofAst.Step.StructInduction): Unit = {
      writer.writeZ(Constants._langastProofAstStepStructInduction)
      write_langastProofAstStepId(o.id)
      write_langastExp(o.claim)
      write_langastExp(o.exp)
      writer.writeISZ(o.cases, write_langastProofAstStepStructInductionMatchCase _)
      writer.writeOption(o.defaultOpt, write_langastProofAstStepStructInductionMatchDefault _)
    }

    def write_langastProofAstStepStructInductionMatchCase(o: org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase): Unit = {
      writer.writeZ(Constants._langastProofAstStepStructInductionMatchCase)
      write_langastPatternStructure(o.pattern)
      writer.writeOption(o.hypoOpt, write_langastProofAstStepAssume _)
      writer.writeISZ(o.steps, write_langastProofAstStep _)
    }

    def write_langastProofAstStepStructInductionMatchDefault(o: org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault): Unit = {
      writer.writeZ(Constants._langastProofAstStepStructInductionMatchDefault)
      writer.writeOption(o.hypoOpt, write_langastProofAstStepAssume _)
      writer.writeISZ(o.steps, write_langastProofAstStep _)
    }

    def write_langastProofAstStepJustification(o: org.sireum.lang.ast.ProofAst.Step.Justification): Unit = {
      o match {
        case o: org.sireum.lang.ast.ProofAst.Step.Justification.Ref => write_langastProofAstStepJustificationRef(o)
        case o: org.sireum.lang.ast.ProofAst.Step.Justification.Apply => write_langastProofAstStepJustificationApply(o)
        case o: org.sireum.lang.ast.ProofAst.Step.Justification.ApplyNamed => write_langastProofAstStepJustificationApplyNamed(o)
        case o: org.sireum.lang.ast.ProofAst.Step.Justification.ApplyEta => write_langastProofAstStepJustificationApplyEta(o)
      }
    }

    def write_langastProofAstStepInception(o: org.sireum.lang.ast.ProofAst.Step.Inception): Unit = {
      o match {
        case o: org.sireum.lang.ast.ProofAst.Step.Justification.Apply => write_langastProofAstStepJustificationApply(o)
        case o: org.sireum.lang.ast.ProofAst.Step.Justification.ApplyNamed => write_langastProofAstStepJustificationApplyNamed(o)
        case o: org.sireum.lang.ast.ProofAst.Step.Justification.ApplyEta => write_langastProofAstStepJustificationApplyEta(o)
      }
    }

    def write_langastProofAstStepJustificationRef(o: org.sireum.lang.ast.ProofAst.Step.Justification.Ref): Unit = {
      writer.writeZ(Constants._langastProofAstStepJustificationRef)
      write_langastExpRef(o.id)
    }

    def write_langastProofAstStepJustificationApply(o: org.sireum.lang.ast.ProofAst.Step.Justification.Apply): Unit = {
      writer.writeZ(Constants._langastProofAstStepJustificationApply)
      write_langastExpInvoke(o.invoke)
      writer.writeISZ(o.witnesses, write_langastProofAstStepId _)
    }

    def write_langastProofAstStepJustificationApplyNamed(o: org.sireum.lang.ast.ProofAst.Step.Justification.ApplyNamed): Unit = {
      writer.writeZ(Constants._langastProofAstStepJustificationApplyNamed)
      write_langastExpInvokeNamed(o.invoke)
      writer.writeISZ(o.witnesses, write_langastProofAstStepId _)
    }

    def write_langastProofAstStepJustificationApplyEta(o: org.sireum.lang.ast.ProofAst.Step.Justification.ApplyEta): Unit = {
      writer.writeZ(Constants._langastProofAstStepJustificationApplyEta)
      write_langastExpEta(o.eta)
      writer.writeISZ(o.witnesses, write_langastProofAstStepId _)
    }

    def write_langastAssignExp(o: org.sireum.lang.ast.AssignExp): Unit = {
      o match {
        case o: org.sireum.lang.ast.Stmt.Block => write_langastStmtBlock(o)
        case o: org.sireum.lang.ast.Stmt.If => write_langastStmtIf(o)
        case o: org.sireum.lang.ast.Stmt.Match => write_langastStmtMatch(o)
        case o: org.sireum.lang.ast.Stmt.Return => write_langastStmtReturn(o)
        case o: org.sireum.lang.ast.Stmt.Expr => write_langastStmtExpr(o)
      }
    }

    def write_langastPurityType(o: org.sireum.lang.ast.Purity.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def write_langastCase(o: org.sireum.lang.ast.Case): Unit = {
      writer.writeZ(Constants._langastCase)
      write_langastPattern(o.pattern)
      writer.writeOption(o.condOpt, write_langastExp _)
      write_langastBody(o.body)
    }

    def write_langastEnumGenRange(o: org.sireum.lang.ast.EnumGen.Range): Unit = {
      o match {
        case o: org.sireum.lang.ast.EnumGen.Range.Expr => write_langastEnumGenRangeExpr(o)
        case o: org.sireum.lang.ast.EnumGen.Range.Step => write_langastEnumGenRangeStep(o)
      }
    }

    def write_langastEnumGenRangeExpr(o: org.sireum.lang.ast.EnumGen.Range.Expr): Unit = {
      writer.writeZ(Constants._langastEnumGenRangeExpr)
      write_langastExp(o.exp)
      write_langastAttr(o.attr)
    }

    def write_langastEnumGenRangeStep(o: org.sireum.lang.ast.EnumGen.Range.Step): Unit = {
      writer.writeZ(Constants._langastEnumGenRangeStep)
      writer.writeB(o.isInclusive)
      write_langastExp(o.start)
      write_langastExp(o.end)
      writer.writeOption(o.byOpt, write_langastExp _)
      write_langastAttr(o.attr)
    }

    def write_langastEnumGenFor(o: org.sireum.lang.ast.EnumGen.For): Unit = {
      writer.writeZ(Constants._langastEnumGenFor)
      writer.writeOption(o.idOpt, write_langastId _)
      write_langastEnumGenRange(o.range)
      writer.writeOption(o.condOpt, write_langastExp _)
      write_langastLoopContract(o.contract)
    }

    def write_langastType(o: org.sireum.lang.ast.Type): Unit = {
      o match {
        case o: org.sireum.lang.ast.Type.Named => write_langastTypeNamed(o)
        case o: org.sireum.lang.ast.Type.Fun => write_langastTypeFun(o)
        case o: org.sireum.lang.ast.Type.Tuple => write_langastTypeTuple(o)
      }
    }

    def write_langastTypeNamed(o: org.sireum.lang.ast.Type.Named): Unit = {
      writer.writeZ(Constants._langastTypeNamed)
      write_langastName(o.name)
      writer.writeISZ(o.typeArgs, write_langastType _)
      write_langastTypedAttr(o.attr)
    }

    def write_langastTypeFun(o: org.sireum.lang.ast.Type.Fun): Unit = {
      writer.writeZ(Constants._langastTypeFun)
      writer.writeB(o.isPure)
      writer.writeB(o.isByName)
      writer.writeISZ(o.args, write_langastType _)
      write_langastType(o.ret)
      write_langastTypedAttr(o.attr)
    }

    def write_langastTypeTuple(o: org.sireum.lang.ast.Type.Tuple): Unit = {
      writer.writeZ(Constants._langastTypeTuple)
      writer.writeISZ(o.args, write_langastType _)
      write_langastTypedAttr(o.attr)
    }

    def write_langastPattern(o: org.sireum.lang.ast.Pattern): Unit = {
      o match {
        case o: org.sireum.lang.ast.Pattern.Literal => write_langastPatternLiteral(o)
        case o: org.sireum.lang.ast.Pattern.LitInterpolate => write_langastPatternLitInterpolate(o)
        case o: org.sireum.lang.ast.Pattern.Ref => write_langastPatternRef(o)
        case o: org.sireum.lang.ast.Pattern.VarBinding => write_langastPatternVarBinding(o)
        case o: org.sireum.lang.ast.Pattern.Wildcard => write_langastPatternWildcard(o)
        case o: org.sireum.lang.ast.Pattern.SeqWildcard => write_langastPatternSeqWildcard(o)
        case o: org.sireum.lang.ast.Pattern.Structure => write_langastPatternStructure(o)
      }
    }

    def write_langastPatternLiteral(o: org.sireum.lang.ast.Pattern.Literal): Unit = {
      writer.writeZ(Constants._langastPatternLiteral)
      write_langastLit(o.lit)
    }

    def write_langastPatternLitInterpolate(o: org.sireum.lang.ast.Pattern.LitInterpolate): Unit = {
      writer.writeZ(Constants._langastPatternLitInterpolate)
      writer.writeString(o.prefix)
      writer.writeString(o.value)
      write_langastTypedAttr(o.attr)
    }

    def write_langastPatternRef(o: org.sireum.lang.ast.Pattern.Ref): Unit = {
      writer.writeZ(Constants._langastPatternRef)
      write_langastName(o.name)
      write_langastResolvedAttr(o.attr)
    }

    def write_langastPatternVarBinding(o: org.sireum.lang.ast.Pattern.VarBinding): Unit = {
      writer.writeZ(Constants._langastPatternVarBinding)
      write_langastId(o.id)
      writer.writeOption(o.tipeOpt, write_langastType _)
      write_langastTypedAttr(o.attr)
    }

    def write_langastPatternWildcard(o: org.sireum.lang.ast.Pattern.Wildcard): Unit = {
      writer.writeZ(Constants._langastPatternWildcard)
      writer.writeOption(o.typeOpt, write_langastType _)
      write_langastTypedAttr(o.attr)
    }

    def write_langastPatternSeqWildcard(o: org.sireum.lang.ast.Pattern.SeqWildcard): Unit = {
      writer.writeZ(Constants._langastPatternSeqWildcard)
      write_langastTypedAttr(o.attr)
    }

    def write_langastPatternStructure(o: org.sireum.lang.ast.Pattern.Structure): Unit = {
      writer.writeZ(Constants._langastPatternStructure)
      writer.writeOption(o.idOpt, write_langastId _)
      writer.writeOption(o.nameOpt, write_langastName _)
      writer.writeISZ(o.patterns, write_langastPattern _)
      write_langastResolvedAttr(o.attr)
    }

    def write_langastExp(o: org.sireum.lang.ast.Exp): Unit = {
      o match {
        case o: org.sireum.lang.ast.Exp.LitB => write_langastExpLitB(o)
        case o: org.sireum.lang.ast.Exp.LitC => write_langastExpLitC(o)
        case o: org.sireum.lang.ast.Exp.LitZ => write_langastExpLitZ(o)
        case o: org.sireum.lang.ast.Exp.LitF32 => write_langastExpLitF32(o)
        case o: org.sireum.lang.ast.Exp.LitF64 => write_langastExpLitF64(o)
        case o: org.sireum.lang.ast.Exp.LitR => write_langastExpLitR(o)
        case o: org.sireum.lang.ast.Exp.LitString => write_langastExpLitString(o)
        case o: org.sireum.lang.ast.Exp.LitStepId => write_langastExpLitStepId(o)
        case o: org.sireum.lang.ast.Exp.StringInterpolate => write_langastExpStringInterpolate(o)
        case o: org.sireum.lang.ast.Exp.This => write_langastExpThis(o)
        case o: org.sireum.lang.ast.Exp.Super => write_langastExpSuper(o)
        case o: org.sireum.lang.ast.Exp.Unary => write_langastExpUnary(o)
        case o: org.sireum.lang.ast.Exp.Binary => write_langastExpBinary(o)
        case o: org.sireum.lang.ast.Exp.Ident => write_langastExpIdent(o)
        case o: org.sireum.lang.ast.Exp.Eta => write_langastExpEta(o)
        case o: org.sireum.lang.ast.Exp.Tuple => write_langastExpTuple(o)
        case o: org.sireum.lang.ast.Exp.Select => write_langastExpSelect(o)
        case o: org.sireum.lang.ast.Exp.Invoke => write_langastExpInvoke(o)
        case o: org.sireum.lang.ast.Exp.InvokeNamed => write_langastExpInvokeNamed(o)
        case o: org.sireum.lang.ast.Exp.If => write_langastExpIf(o)
        case o: org.sireum.lang.ast.Exp.TypeCond => write_langastExpTypeCond(o)
        case o: org.sireum.lang.ast.Exp.Sym => write_langastExpSym(o)
        case o: org.sireum.lang.ast.Exp.Fun => write_langastExpFun(o)
        case o: org.sireum.lang.ast.Exp.ForYield => write_langastExpForYield(o)
        case o: org.sireum.lang.ast.Exp.QuantType => write_langastExpQuantType(o)
        case o: org.sireum.lang.ast.Exp.QuantRange => write_langastExpQuantRange(o)
        case o: org.sireum.lang.ast.Exp.QuantEach => write_langastExpQuantEach(o)
        case o: org.sireum.lang.ast.Exp.Input => write_langastExpInput(o)
        case o: org.sireum.lang.ast.Exp.At => write_langastExpAt(o)
        case o: org.sireum.lang.ast.Exp.LoopIndex => write_langastExpLoopIndex(o)
        case o: org.sireum.lang.ast.Exp.StateSeq => write_langastExpStateSeq(o)
        case o: org.sireum.lang.ast.Exp.Result => write_langastExpResult(o)
        case o: org.sireum.lang.ast.Exp.AssumeAgree => write_langastExpAssumeAgree(o)
        case o: org.sireum.lang.ast.Exp.AssertAgree => write_langastExpAssertAgree(o)
        case o: org.sireum.lang.ast.Exp.InfoFlowInvariant => write_langastExpInfoFlowInvariant(o)
      }
    }

    def write_langastLit(o: org.sireum.lang.ast.Lit): Unit = {
      o match {
        case o: org.sireum.lang.ast.Exp.LitB => write_langastExpLitB(o)
        case o: org.sireum.lang.ast.Exp.LitC => write_langastExpLitC(o)
        case o: org.sireum.lang.ast.Exp.LitZ => write_langastExpLitZ(o)
        case o: org.sireum.lang.ast.Exp.LitF32 => write_langastExpLitF32(o)
        case o: org.sireum.lang.ast.Exp.LitF64 => write_langastExpLitF64(o)
        case o: org.sireum.lang.ast.Exp.LitR => write_langastExpLitR(o)
        case o: org.sireum.lang.ast.Exp.LitString => write_langastExpLitString(o)
        case o: org.sireum.lang.ast.Exp.LitStepId => write_langastExpLitStepId(o)
      }
    }

    def write_langastExpLitB(o: org.sireum.lang.ast.Exp.LitB): Unit = {
      writer.writeZ(Constants._langastExpLitB)
      writer.writeB(o.value)
      write_langastAttr(o.attr)
    }

    def write_langastExpLitC(o: org.sireum.lang.ast.Exp.LitC): Unit = {
      writer.writeZ(Constants._langastExpLitC)
      writer.writeC(o.value)
      write_langastAttr(o.attr)
    }

    def write_langastExpLitZ(o: org.sireum.lang.ast.Exp.LitZ): Unit = {
      writer.writeZ(Constants._langastExpLitZ)
      writer.writeZ(o.value)
      write_langastAttr(o.attr)
    }

    def write_langastExpLitF32(o: org.sireum.lang.ast.Exp.LitF32): Unit = {
      writer.writeZ(Constants._langastExpLitF32)
      writer.writeF32(o.value)
      write_langastAttr(o.attr)
    }

    def write_langastExpLitF64(o: org.sireum.lang.ast.Exp.LitF64): Unit = {
      writer.writeZ(Constants._langastExpLitF64)
      writer.writeF64(o.value)
      write_langastAttr(o.attr)
    }

    def write_langastExpLitR(o: org.sireum.lang.ast.Exp.LitR): Unit = {
      writer.writeZ(Constants._langastExpLitR)
      writer.writeR(o.value)
      write_langastAttr(o.attr)
    }

    def write_langastExpLitString(o: org.sireum.lang.ast.Exp.LitString): Unit = {
      writer.writeZ(Constants._langastExpLitString)
      writer.writeString(o.value)
      write_langastAttr(o.attr)
    }

    def write_langastExpLitStepId(o: org.sireum.lang.ast.Exp.LitStepId): Unit = {
      writer.writeZ(Constants._langastExpLitStepId)
      writer.writeString(o.value)
      write_langastAttr(o.attr)
    }

    def write_langastExpStringInterpolate(o: org.sireum.lang.ast.Exp.StringInterpolate): Unit = {
      writer.writeZ(Constants._langastExpStringInterpolate)
      writer.writeString(o.prefix)
      writer.writeISZ(o.lits, write_langastExpLitString _)
      writer.writeISZ(o.args, write_langastExp _)
      write_langastTypedAttr(o.attr)
    }

    def write_langastExpThis(o: org.sireum.lang.ast.Exp.This): Unit = {
      writer.writeZ(Constants._langastExpThis)
      write_langastTypedAttr(o.attr)
    }

    def write_langastExpSuper(o: org.sireum.lang.ast.Exp.Super): Unit = {
      writer.writeZ(Constants._langastExpSuper)
      writer.writeOption(o.idOpt, write_langastId _)
      write_langastTypedAttr(o.attr)
    }

    def write_langastExpUnaryOpType(o: org.sireum.lang.ast.Exp.UnaryOp.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def write_langastExpUnary(o: org.sireum.lang.ast.Exp.Unary): Unit = {
      writer.writeZ(Constants._langastExpUnary)
      write_langastExpUnaryOpType(o.op)
      write_langastExp(o.exp)
      write_langastResolvedAttr(o.attr)
    }

    def write_langastExpRef(o: org.sireum.lang.ast.Exp.Ref): Unit = {
      o match {
        case o: org.sireum.lang.ast.Exp.Ident => write_langastExpIdent(o)
        case o: org.sireum.lang.ast.Exp.Select => write_langastExpSelect(o)
      }
    }

    def write_langastExpBinary(o: org.sireum.lang.ast.Exp.Binary): Unit = {
      writer.writeZ(Constants._langastExpBinary)
      write_langastExp(o.left)
      writer.writeString(o.op)
      write_langastExp(o.right)
      write_langastResolvedAttr(o.attr)
    }

    def write_langastExpIdent(o: org.sireum.lang.ast.Exp.Ident): Unit = {
      writer.writeZ(Constants._langastExpIdent)
      write_langastId(o.id)
      write_langastResolvedAttr(o.attr)
    }

    def write_langastExpEta(o: org.sireum.lang.ast.Exp.Eta): Unit = {
      writer.writeZ(Constants._langastExpEta)
      write_langastExpRef(o.ref)
      write_langastTypedAttr(o.attr)
    }

    def write_langastExpTuple(o: org.sireum.lang.ast.Exp.Tuple): Unit = {
      writer.writeZ(Constants._langastExpTuple)
      writer.writeISZ(o.args, write_langastExp _)
      write_langastTypedAttr(o.attr)
    }

    def write_langastExpSelect(o: org.sireum.lang.ast.Exp.Select): Unit = {
      writer.writeZ(Constants._langastExpSelect)
      writer.writeOption(o.receiverOpt, write_langastExp _)
      write_langastId(o.id)
      writer.writeISZ(o.targs, write_langastType _)
      write_langastResolvedAttr(o.attr)
    }

    def write_langastExpInvoke(o: org.sireum.lang.ast.Exp.Invoke): Unit = {
      writer.writeZ(Constants._langastExpInvoke)
      writer.writeOption(o.receiverOpt, write_langastExp _)
      write_langastExpIdent(o.ident)
      writer.writeISZ(o.targs, write_langastType _)
      writer.writeISZ(o.args, write_langastExp _)
      write_langastResolvedAttr(o.attr)
    }

    def write_langastExpInvokeNamed(o: org.sireum.lang.ast.Exp.InvokeNamed): Unit = {
      writer.writeZ(Constants._langastExpInvokeNamed)
      writer.writeOption(o.receiverOpt, write_langastExp _)
      write_langastExpIdent(o.ident)
      writer.writeISZ(o.targs, write_langastType _)
      writer.writeISZ(o.args, write_langastNamedArg _)
      write_langastResolvedAttr(o.attr)
    }

    def write_langastExpIf(o: org.sireum.lang.ast.Exp.If): Unit = {
      writer.writeZ(Constants._langastExpIf)
      write_langastExp(o.cond)
      write_langastExp(o.thenExp)
      write_langastExp(o.elseExp)
      write_langastTypedAttr(o.attr)
    }

    def write_langastExpTypeCond(o: org.sireum.lang.ast.Exp.TypeCond): Unit = {
      writer.writeZ(Constants._langastExpTypeCond)
      writer.writeISZ(o.args, write_langastExp _)
      write_langastExpFun(o.fun)
      write_langastAttr(o.attr)
    }

    def write_langastExpSym(o: org.sireum.lang.ast.Exp.Sym): Unit = {
      writer.writeZ(Constants._langastExpSym)
      writer.writeZ(o.num)
      write_langastTypedAttr(o.attr)
    }

    def write_langastExpFunParam(o: org.sireum.lang.ast.Exp.Fun.Param): Unit = {
      writer.writeZ(Constants._langastExpFunParam)
      writer.writeOption(o.idOpt, write_langastId _)
      writer.writeOption(o.tipeOpt, write_langastType _)
      writer.writeOption(o.typedOpt, write_langastTyped _)
    }

    def write_langastExpFun(o: org.sireum.lang.ast.Exp.Fun): Unit = {
      writer.writeZ(Constants._langastExpFun)
      writer.writeISZ(o.context, writer.writeString _)
      writer.writeISZ(o.params, write_langastExpFunParam _)
      write_langastAssignExp(o.exp)
      write_langastTypedAttr(o.attr)
    }

    def write_langastExpForYield(o: org.sireum.lang.ast.Exp.ForYield): Unit = {
      writer.writeZ(Constants._langastExpForYield)
      writer.writeISZ(o.enumGens, write_langastEnumGenFor _)
      write_langastExp(o.exp)
      write_langastTypedAttr(o.attr)
    }

    def write_langastExpQuant(o: org.sireum.lang.ast.Exp.Quant): Unit = {
      o match {
        case o: org.sireum.lang.ast.Exp.QuantType => write_langastExpQuantType(o)
        case o: org.sireum.lang.ast.Exp.QuantRange => write_langastExpQuantRange(o)
        case o: org.sireum.lang.ast.Exp.QuantEach => write_langastExpQuantEach(o)
      }
    }

    def write_langastExpQuantType(o: org.sireum.lang.ast.Exp.QuantType): Unit = {
      writer.writeZ(Constants._langastExpQuantType)
      writer.writeB(o.isForall)
      write_langastExpFun(o.fun)
      write_langastAttr(o.attr)
    }

    def write_langastExpQuantRange(o: org.sireum.lang.ast.Exp.QuantRange): Unit = {
      writer.writeZ(Constants._langastExpQuantRange)
      writer.writeB(o.isForall)
      write_langastExp(o.lo)
      write_langastExp(o.hi)
      writer.writeB(o.hiExact)
      write_langastExpFun(o.fun)
      write_langastResolvedAttr(o.attr)
    }

    def write_langastExpQuantEach(o: org.sireum.lang.ast.Exp.QuantEach): Unit = {
      writer.writeZ(Constants._langastExpQuantEach)
      writer.writeB(o.isForall)
      write_langastExp(o.seq)
      write_langastExpFun(o.fun)
      write_langastResolvedAttr(o.attr)
    }

    def write_langastExpInput(o: org.sireum.lang.ast.Exp.Input): Unit = {
      writer.writeZ(Constants._langastExpInput)
      write_langastExp(o.exp)
      write_langastAttr(o.attr)
    }

    def write_langastExpAt(o: org.sireum.lang.ast.Exp.At): Unit = {
      writer.writeZ(Constants._langastExpAt)
      writer.writeOption(o.tipeOpt, write_langastType _)
      write_langastExp(o.exp)
      write_langastExpLitZ(o.num)
      writer.writeISZ(o.linesFresh, write_langastExpLitZ _)
      write_langastAttr(o.attr)
    }

    def write_langastExpLoopIndex(o: org.sireum.lang.ast.Exp.LoopIndex): Unit = {
      writer.writeZ(Constants._langastExpLoopIndex)
      writer.writeOption(o.tipeOpt, write_langastType _)
      write_langastExpIdent(o.exp)
      write_langastTypedAttr(o.attr)
    }

    def write_langastExpStateSeq(o: org.sireum.lang.ast.Exp.StateSeq): Unit = {
      writer.writeZ(Constants._langastExpStateSeq)
      write_langastId(o.id)
      writer.writeISZ(o.fragments, write_langastExpStateSeqFragment _)
      write_langastAttr(o.attr)
    }

    def write_langastExpStateSeqFragment(o: org.sireum.lang.ast.Exp.StateSeq.Fragment): Unit = {
      writer.writeZ(Constants._langastExpStateSeqFragment)
      write_langastId(o.id)
      write_langastExp(o.exp)
    }

    def write_langastExpResult(o: org.sireum.lang.ast.Exp.Result): Unit = {
      writer.writeZ(Constants._langastExpResult)
      writer.writeOption(o.tipeOpt, write_langastType _)
      write_langastTypedAttr(o.attr)
    }

    def write_langastExpAssumeAgree(o: org.sireum.lang.ast.Exp.AssumeAgree): Unit = {
      writer.writeZ(Constants._langastExpAssumeAgree)
      write_langastExpLitString(o.channel)
      write_langastMethodContractClaims(o.requiresClause)
      write_langastMethodContractClaims(o.inAgreeClause)
      write_langastAttr(o.attr)
    }

    def write_langastExpAssertAgree(o: org.sireum.lang.ast.Exp.AssertAgree): Unit = {
      writer.writeZ(Constants._langastExpAssertAgree)
      write_langastExpLitString(o.channel)
      write_langastMethodContractClaims(o.outAgreeClause)
      write_langastAttr(o.attr)
    }

    def write_langastExpInfoFlowInvariant(o: org.sireum.lang.ast.Exp.InfoFlowInvariant): Unit = {
      writer.writeZ(Constants._langastExpInfoFlowInvariant)
      writer.writeISZ(o.flowInvariants, write_langastMethodContractInfoFlow _)
      write_langastAttr(o.attr)
    }

    def write_langastNamedArg(o: org.sireum.lang.ast.NamedArg): Unit = {
      writer.writeZ(Constants._langastNamedArg)
      write_langastId(o.id)
      write_langastExp(o.arg)
      writer.writeZ(o.index)
    }

    def write_langastId(o: org.sireum.lang.ast.Id): Unit = {
      writer.writeZ(Constants._langastId)
      writer.writeString(o.value)
      write_langastAttr(o.attr)
    }

    def write_langastName(o: org.sireum.lang.ast.Name): Unit = {
      writer.writeZ(Constants._langastName)
      writer.writeISZ(o.ids, write_langastId _)
      write_langastAttr(o.attr)
    }

    def write_langastBody(o: org.sireum.lang.ast.Body): Unit = {
      writer.writeZ(Constants._langastBody)
      writer.writeISZ(o.stmts, write_langastStmt _)
      writer.writeISZ(o.undecls, write_langastResolvedInfoLocalVar _)
    }

    def write_langastAdtParam(o: org.sireum.lang.ast.AdtParam): Unit = {
      writer.writeZ(Constants._langastAdtParam)
      writer.writeB(o.isHidden)
      writer.writeB(o.isVal)
      write_langastId(o.id)
      write_langastType(o.tipe)
    }

    def write_langastMethodSig(o: org.sireum.lang.ast.MethodSig): Unit = {
      writer.writeZ(Constants._langastMethodSig)
      writer.writeB(o.isPure)
      write_langastId(o.id)
      writer.writeISZ(o.typeParams, write_langastTypeParam _)
      writer.writeB(o.hasParams)
      writer.writeISZ(o.params, write_langastParam _)
      write_langastType(o.returnType)
    }

    def write_langastParam(o: org.sireum.lang.ast.Param): Unit = {
      writer.writeZ(Constants._langastParam)
      writer.writeB(o.isHidden)
      write_langastId(o.id)
      write_langastType(o.tipe)
    }

    def write_langastTypeParam(o: org.sireum.lang.ast.TypeParam): Unit = {
      writer.writeZ(Constants._langastTypeParam)
      write_langastId(o.id)
      writer.writeB(o.isImmutable)
    }

    def write_langastAttr(o: org.sireum.lang.ast.Attr): Unit = {
      writer.writeZ(Constants._langastAttr)
      writer.writeOption(o.posOpt, writer.writePosition _)
    }

    def write_langastTypedAttr(o: org.sireum.lang.ast.TypedAttr): Unit = {
      writer.writeZ(Constants._langastTypedAttr)
      writer.writeOption(o.posOpt, writer.writePosition _)
      writer.writeOption(o.typedOpt, write_langastTyped _)
    }

    def write_langastResolvedAttr(o: org.sireum.lang.ast.ResolvedAttr): Unit = {
      writer.writeZ(Constants._langastResolvedAttr)
      writer.writeOption(o.posOpt, writer.writePosition _)
      writer.writeOption(o.resOpt, write_langastResolvedInfo _)
      writer.writeOption(o.typedOpt, write_langastTyped _)
    }

    def write_langastResolvedInfo(o: org.sireum.lang.ast.ResolvedInfo): Unit = {
      o match {
        case o: org.sireum.lang.ast.ResolvedInfo.BuiltIn => write_langastResolvedInfoBuiltIn(o)
        case o: org.sireum.lang.ast.ResolvedInfo.Package => write_langastResolvedInfoPackage(o)
        case o: org.sireum.lang.ast.ResolvedInfo.Enum => write_langastResolvedInfoEnum(o)
        case o: org.sireum.lang.ast.ResolvedInfo.EnumElement => write_langastResolvedInfoEnumElement(o)
        case o: org.sireum.lang.ast.ResolvedInfo.Object => write_langastResolvedInfoObject(o)
        case o: org.sireum.lang.ast.ResolvedInfo.Var => write_langastResolvedInfoVar(o)
        case o: org.sireum.lang.ast.ResolvedInfo.Method => write_langastResolvedInfoMethod(o)
        case o: org.sireum.lang.ast.ResolvedInfo.Methods => write_langastResolvedInfoMethods(o)
        case o: org.sireum.lang.ast.ResolvedInfo.Tuple => write_langastResolvedInfoTuple(o)
        case o: org.sireum.lang.ast.ResolvedInfo.LocalVar => write_langastResolvedInfoLocalVar(o)
        case o: org.sireum.lang.ast.ResolvedInfo.Fact => write_langastResolvedInfoFact(o)
        case o: org.sireum.lang.ast.ResolvedInfo.Theorem => write_langastResolvedInfoTheorem(o)
        case o: org.sireum.lang.ast.ResolvedInfo.Inv => write_langastResolvedInfoInv(o)
      }
    }

    def write_langastResolvedInfoBuiltInKindType(o: org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def write_langastResolvedInfoBuiltIn(o: org.sireum.lang.ast.ResolvedInfo.BuiltIn): Unit = {
      writer.writeZ(Constants._langastResolvedInfoBuiltIn)
      write_langastResolvedInfoBuiltInKindType(o.kind)
    }

    def write_langastResolvedInfoPackage(o: org.sireum.lang.ast.ResolvedInfo.Package): Unit = {
      writer.writeZ(Constants._langastResolvedInfoPackage)
      writer.writeISZ(o.name, writer.writeString _)
    }

    def write_langastResolvedInfoEnum(o: org.sireum.lang.ast.ResolvedInfo.Enum): Unit = {
      writer.writeZ(Constants._langastResolvedInfoEnum)
      writer.writeISZ(o.name, writer.writeString _)
    }

    def write_langastResolvedInfoEnumElement(o: org.sireum.lang.ast.ResolvedInfo.EnumElement): Unit = {
      writer.writeZ(Constants._langastResolvedInfoEnumElement)
      writer.writeISZ(o.owner, writer.writeString _)
      writer.writeString(o.name)
      writer.writeZ(o.ordinal)
    }

    def write_langastResolvedInfoObject(o: org.sireum.lang.ast.ResolvedInfo.Object): Unit = {
      writer.writeZ(Constants._langastResolvedInfoObject)
      writer.writeISZ(o.name, writer.writeString _)
    }

    def write_langastResolvedInfoVar(o: org.sireum.lang.ast.ResolvedInfo.Var): Unit = {
      writer.writeZ(Constants._langastResolvedInfoVar)
      writer.writeB(o.isInObject)
      writer.writeB(o.isSpec)
      writer.writeB(o.isVal)
      writer.writeISZ(o.owner, writer.writeString _)
      writer.writeString(o.id)
    }

    def write_langastResolvedInfoMethod(o: org.sireum.lang.ast.ResolvedInfo.Method): Unit = {
      writer.writeZ(Constants._langastResolvedInfoMethod)
      writer.writeB(o.isInObject)
      write_langastMethodModeType(o.mode)
      writer.writeISZ(o.typeParams, writer.writeString _)
      writer.writeISZ(o.owner, writer.writeString _)
      writer.writeString(o.id)
      writer.writeISZ(o.paramNames, writer.writeString _)
      writer.writeOption(o.tpeOpt, write_langastTypedFun _)
      writer.writeISZ(o.reads, write_langastResolvedInfo _)
      writer.writeISZ(o.writes, write_langastResolvedInfo _)
    }

    def write_langastResolvedInfoMethods(o: org.sireum.lang.ast.ResolvedInfo.Methods): Unit = {
      writer.writeZ(Constants._langastResolvedInfoMethods)
      writer.writeISZ(o.methods, write_langastResolvedInfoMethod _)
    }

    def write_langastResolvedInfoTuple(o: org.sireum.lang.ast.ResolvedInfo.Tuple): Unit = {
      writer.writeZ(Constants._langastResolvedInfoTuple)
      writer.writeZ(o.size)
      writer.writeZ(o.index)
    }

    def write_langastResolvedInfoLocalVarScopeType(o: org.sireum.lang.ast.ResolvedInfo.LocalVar.Scope.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def write_langastResolvedInfoLocalVar(o: org.sireum.lang.ast.ResolvedInfo.LocalVar): Unit = {
      writer.writeZ(Constants._langastResolvedInfoLocalVar)
      writer.writeISZ(o.context, writer.writeString _)
      write_langastResolvedInfoLocalVarScopeType(o.scope)
      writer.writeB(o.isSpec)
      writer.writeB(o.isVal)
      writer.writeString(o.id)
    }

    def write_langastResolvedInfoFact(o: org.sireum.lang.ast.ResolvedInfo.Fact): Unit = {
      writer.writeZ(Constants._langastResolvedInfoFact)
      writer.writeISZ(o.name, writer.writeString _)
    }

    def write_langastResolvedInfoTheorem(o: org.sireum.lang.ast.ResolvedInfo.Theorem): Unit = {
      writer.writeZ(Constants._langastResolvedInfoTheorem)
      writer.writeISZ(o.name, writer.writeString _)
    }

    def write_langastResolvedInfoInv(o: org.sireum.lang.ast.ResolvedInfo.Inv): Unit = {
      writer.writeZ(Constants._langastResolvedInfoInv)
      writer.writeB(o.isInObject)
      writer.writeISZ(o.owner, writer.writeString _)
      writer.writeString(o.id)
    }

    def write_langastTruthTableRow(o: org.sireum.lang.ast.TruthTable.Row): Unit = {
      writer.writeZ(Constants._langastTruthTableRow)
      write_langastTruthTableAssignment(o.assignment)
      writer.writePosition(o.separator)
      write_langastTruthTableAssignment(o.values)
    }

    def write_langastTruthTableAssignment(o: org.sireum.lang.ast.TruthTable.Assignment): Unit = {
      writer.writeZ(Constants._langastTruthTableAssignment)
      writer.writeISZ(o.values, write_langastExpLitB _)
      write_langastAttr(o.attr)
    }

    def write_langastTruthTableConclusion(o: org.sireum.lang.ast.TruthTable.Conclusion): Unit = {
      o match {
        case o: org.sireum.lang.ast.TruthTable.Conclusion.Validity => write_langastTruthTableConclusionValidity(o)
        case o: org.sireum.lang.ast.TruthTable.Conclusion.Tautology => write_langastTruthTableConclusionTautology(o)
        case o: org.sireum.lang.ast.TruthTable.Conclusion.Contradictory => write_langastTruthTableConclusionContradictory(o)
        case o: org.sireum.lang.ast.TruthTable.Conclusion.Contingent => write_langastTruthTableConclusionContingent(o)
      }
    }

    def write_langastTruthTableConclusionValidity(o: org.sireum.lang.ast.TruthTable.Conclusion.Validity): Unit = {
      writer.writeZ(Constants._langastTruthTableConclusionValidity)
      writer.writeB(o.isValid)
      writer.writeISZ(o.assignments, write_langastTruthTableAssignment _)
      write_langastAttr(o.attr)
    }

    def write_langastTruthTableConclusionTautology(o: org.sireum.lang.ast.TruthTable.Conclusion.Tautology): Unit = {
      writer.writeZ(Constants._langastTruthTableConclusionTautology)
      write_langastAttr(o.attr)
    }

    def write_langastTruthTableConclusionContradictory(o: org.sireum.lang.ast.TruthTable.Conclusion.Contradictory): Unit = {
      writer.writeZ(Constants._langastTruthTableConclusionContradictory)
      write_langastAttr(o.attr)
    }

    def write_langastTruthTableConclusionContingent(o: org.sireum.lang.ast.TruthTable.Conclusion.Contingent): Unit = {
      writer.writeZ(Constants._langastTruthTableConclusionContingent)
      writer.writeISZ(o.trueAssignments, write_langastTruthTableAssignment _)
      writer.writeISZ(o.falseAssignments, write_langastTruthTableAssignment _)
      write_langastAttr(o.attr)
    }

    def write_langastMethodModeType(o: org.sireum.lang.ast.MethodMode.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def write_langastTyped(o: org.sireum.lang.ast.Typed): Unit = {
      o match {
        case o: org.sireum.lang.ast.Typed.Name => write_langastTypedName(o)
        case o: org.sireum.lang.ast.Typed.Tuple => write_langastTypedTuple(o)
        case o: org.sireum.lang.ast.Typed.Fun => write_langastTypedFun(o)
        case o: org.sireum.lang.ast.Typed.TypeVar => write_langastTypedTypeVar(o)
        case o: org.sireum.lang.ast.Typed.Package => write_langastTypedPackage(o)
        case o: org.sireum.lang.ast.Typed.Object => write_langastTypedObject(o)
        case o: org.sireum.lang.ast.Typed.Enum => write_langastTypedEnum(o)
        case o: org.sireum.lang.ast.Typed.Method => write_langastTypedMethod(o)
        case o: org.sireum.lang.ast.Typed.Methods => write_langastTypedMethods(o)
        case o: org.sireum.lang.ast.Typed.Fact => write_langastTypedFact(o)
        case o: org.sireum.lang.ast.Typed.Theorem => write_langastTypedTheorem(o)
        case o: org.sireum.lang.ast.Typed.Inv => write_langastTypedInv(o)
      }
    }

    def write_langastTypedName(o: org.sireum.lang.ast.Typed.Name): Unit = {
      writer.writeZ(Constants._langastTypedName)
      writer.writeISZ(o.ids, writer.writeString _)
      writer.writeISZ(o.args, write_langastTyped _)
    }

    def write_langastTypedTuple(o: org.sireum.lang.ast.Typed.Tuple): Unit = {
      writer.writeZ(Constants._langastTypedTuple)
      writer.writeISZ(o.args, write_langastTyped _)
    }

    def write_langastTypedFun(o: org.sireum.lang.ast.Typed.Fun): Unit = {
      writer.writeZ(Constants._langastTypedFun)
      writer.writeB(o.isPure)
      writer.writeB(o.isByName)
      writer.writeISZ(o.args, write_langastTyped _)
      write_langastTyped(o.ret)
    }

    def write_langastTypedTypeVar(o: org.sireum.lang.ast.Typed.TypeVar): Unit = {
      writer.writeZ(Constants._langastTypedTypeVar)
      writer.writeString(o.id)
      writer.writeB(o.isImmutable)
    }

    def write_langastTypedPackage(o: org.sireum.lang.ast.Typed.Package): Unit = {
      writer.writeZ(Constants._langastTypedPackage)
      writer.writeISZ(o.name, writer.writeString _)
    }

    def write_langastTypedObject(o: org.sireum.lang.ast.Typed.Object): Unit = {
      writer.writeZ(Constants._langastTypedObject)
      writer.writeISZ(o.owner, writer.writeString _)
      writer.writeString(o.id)
    }

    def write_langastTypedEnum(o: org.sireum.lang.ast.Typed.Enum): Unit = {
      writer.writeZ(Constants._langastTypedEnum)
      writer.writeISZ(o.name, writer.writeString _)
    }

    def write_langastTypedMethod(o: org.sireum.lang.ast.Typed.Method): Unit = {
      writer.writeZ(Constants._langastTypedMethod)
      writer.writeB(o.isInObject)
      write_langastMethodModeType(o.mode)
      writer.writeISZ(o.typeParams, writer.writeString _)
      writer.writeISZ(o.owner, writer.writeString _)
      writer.writeString(o.name)
      writer.writeISZ(o.paramNames, writer.writeString _)
      write_langastTypedFun(o.tpe)
    }

    def write_langastTypedMethods(o: org.sireum.lang.ast.Typed.Methods): Unit = {
      writer.writeZ(Constants._langastTypedMethods)
      writer.writeISZ(o.methods, write_langastTypedMethod _)
    }

    def write_langastTypedFact(o: org.sireum.lang.ast.Typed.Fact): Unit = {
      writer.writeZ(Constants._langastTypedFact)
      writer.writeISZ(o.owner, writer.writeString _)
      writer.writeString(o.id)
    }

    def write_langastTypedTheorem(o: org.sireum.lang.ast.Typed.Theorem): Unit = {
      writer.writeZ(Constants._langastTypedTheorem)
      writer.writeISZ(o.owner, writer.writeString _)
      writer.writeString(o.id)
    }

    def write_langastTypedInv(o: org.sireum.lang.ast.Typed.Inv): Unit = {
      writer.writeZ(Constants._langastTypedInv)
      writer.writeB(o.isInObject)
      writer.writeISZ(o.owner, writer.writeString _)
      writer.writeString(o.id)
    }

    def result: ISZ[U8] = {
      return writer.result
    }

  }

  object Reader {

    @record class Default(val reader: MessagePack.Reader.Impl) extends Reader {
      def errorOpt: Option[MessagePack.ErrorMsg] = {
        return reader.errorOpt
      }
    }

  }

  @msig trait Reader {

    def reader: MessagePack.Reader

    def readAadlInstInfo(): AadlInstInfo = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Component => val r = readComponentT(T); return r
        case Constants.ErrorTypeDef => val r = readErrorTypeDefT(T); return r
        case Constants.FeatureEnd => val r = readFeatureEndT(T); return r
        case Constants.FeatureGroup => val r = readFeatureGroupT(T); return r
        case Constants.FeatureAccess => val r = readFeatureAccessT(T); return r
        case Constants.Connection => val r = readConnectionT(T); return r
        case Constants.Emv2Flow => val r = readEmv2FlowT(T); return r
        case Constants.Flow => val r = readFlowT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of AadlInstInfo.")
          val r = readFlowT(T)
          return r
      }
    }

    def readAadl(): Aadl = {
      val r = readAadlT(F)
      return r
    }

    def readAadlT(typeParsed: B): Aadl = {
      if (!typeParsed) {
        reader.expectZ(Constants.Aadl)
      }
      val components = reader.readISZ(readComponent _)
      val annexLib = reader.readISZ(readAnnexLib _)
      val dataComponents = reader.readISZ(readComponent _)
      return Aadl(components, annexLib, dataComponents)
    }

    def readName(): Name = {
      val r = readNameT(F)
      return r
    }

    def readNameT(typeParsed: B): Name = {
      if (!typeParsed) {
        reader.expectZ(Constants.Name)
      }
      val name = reader.readISZ(reader.readString _)
      val pos = reader.readOption(reader.readPosition _)
      return Name(name, pos)
    }

    def readComponent(): Component = {
      val r = readComponentT(F)
      return r
    }

    def readComponentT(typeParsed: B): Component = {
      if (!typeParsed) {
        reader.expectZ(Constants.Component)
      }
      val identifier = readName()
      val category = readComponentCategoryType()
      val classifier = reader.readOption(readClassifier _)
      val features = reader.readISZ(readFeature _)
      val subComponents = reader.readISZ(readComponent _)
      val connections = reader.readISZ(readConnection _)
      val connectionInstances = reader.readISZ(readConnectionInstance _)
      val properties = reader.readISZ(readProperty _)
      val flows = reader.readISZ(readFlow _)
      val modes = reader.readISZ(readMode _)
      val annexes = reader.readISZ(readAnnex _)
      val uriFrag = reader.readString()
      return Component(identifier, category, classifier, features, subComponents, connections, connectionInstances, properties, flows, modes, annexes, uriFrag)
    }

    def readClassifier(): Classifier = {
      val r = readClassifierT(F)
      return r
    }

    def readClassifierT(typeParsed: B): Classifier = {
      if (!typeParsed) {
        reader.expectZ(Constants.Classifier)
      }
      val name = reader.readString()
      return Classifier(name)
    }

    def readComponentCategoryType(): ComponentCategory.Type = {
      val r = reader.readZ()
      return ComponentCategory.byOrdinal(r).get
    }

    def readFeature(): Feature = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.FeatureEnd => val r = readFeatureEndT(T); return r
        case Constants.FeatureGroup => val r = readFeatureGroupT(T); return r
        case Constants.FeatureAccess => val r = readFeatureAccessT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Feature.")
          val r = readFeatureAccessT(T)
          return r
      }
    }

    def readFeatureEnd(): FeatureEnd = {
      val r = readFeatureEndT(F)
      return r
    }

    def readFeatureEndT(typeParsed: B): FeatureEnd = {
      if (!typeParsed) {
        reader.expectZ(Constants.FeatureEnd)
      }
      val identifier = readName()
      val direction = readDirectionType()
      val category = readFeatureCategoryType()
      val classifier = reader.readOption(readClassifier _)
      val properties = reader.readISZ(readProperty _)
      val uriFrag = reader.readString()
      return FeatureEnd(identifier, direction, category, classifier, properties, uriFrag)
    }

    def readFeatureGroup(): FeatureGroup = {
      val r = readFeatureGroupT(F)
      return r
    }

    def readFeatureGroupT(typeParsed: B): FeatureGroup = {
      if (!typeParsed) {
        reader.expectZ(Constants.FeatureGroup)
      }
      val identifier = readName()
      val features = reader.readISZ(readFeature _)
      val isInverse = reader.readB()
      val category = readFeatureCategoryType()
      val properties = reader.readISZ(readProperty _)
      val uriFrag = reader.readString()
      return FeatureGroup(identifier, features, isInverse, category, properties, uriFrag)
    }

    def readFeatureAccess(): FeatureAccess = {
      val r = readFeatureAccessT(F)
      return r
    }

    def readFeatureAccessT(typeParsed: B): FeatureAccess = {
      if (!typeParsed) {
        reader.expectZ(Constants.FeatureAccess)
      }
      val identifier = readName()
      val category = readFeatureCategoryType()
      val classifier = reader.readOption(readClassifier _)
      val accessType = readAccessTypeType()
      val accessCategory = readAccessCategoryType()
      val properties = reader.readISZ(readProperty _)
      val uriFrag = reader.readString()
      return FeatureAccess(identifier, category, classifier, accessType, accessCategory, properties, uriFrag)
    }

    def readAccessTypeType(): AccessType.Type = {
      val r = reader.readZ()
      return AccessType.byOrdinal(r).get
    }

    def readAccessCategoryType(): AccessCategory.Type = {
      val r = reader.readZ()
      return AccessCategory.byOrdinal(r).get
    }

    def readDirectionType(): Direction.Type = {
      val r = reader.readZ()
      return Direction.byOrdinal(r).get
    }

    def readFeatureCategoryType(): FeatureCategory.Type = {
      val r = reader.readZ()
      return FeatureCategory.byOrdinal(r).get
    }

    def readConnection(): Connection = {
      val r = readConnectionT(F)
      return r
    }

    def readConnectionT(typeParsed: B): Connection = {
      if (!typeParsed) {
        reader.expectZ(Constants.Connection)
      }
      val name = readName()
      val src = reader.readISZ(readEndPoint _)
      val dst = reader.readISZ(readEndPoint _)
      val kind = readConnectionKindType()
      val isBiDirectional = reader.readB()
      val connectionInstances = reader.readISZ(readName _)
      val properties = reader.readISZ(readProperty _)
      val uriFrag = reader.readString()
      return Connection(name, src, dst, kind, isBiDirectional, connectionInstances, properties, uriFrag)
    }

    def readConnectionInstance(): ConnectionInstance = {
      val r = readConnectionInstanceT(F)
      return r
    }

    def readConnectionInstanceT(typeParsed: B): ConnectionInstance = {
      if (!typeParsed) {
        reader.expectZ(Constants.ConnectionInstance)
      }
      val name = readName()
      val src = readEndPoint()
      val dst = readEndPoint()
      val kind = readConnectionKindType()
      val connectionRefs = reader.readISZ(readConnectionReference _)
      val properties = reader.readISZ(readProperty _)
      return ConnectionInstance(name, src, dst, kind, connectionRefs, properties)
    }

    def readConnectionReference(): ConnectionReference = {
      val r = readConnectionReferenceT(F)
      return r
    }

    def readConnectionReferenceT(typeParsed: B): ConnectionReference = {
      if (!typeParsed) {
        reader.expectZ(Constants.ConnectionReference)
      }
      val name = readName()
      val context = readName()
      val isParent = reader.readB()
      return ConnectionReference(name, context, isParent)
    }

    def readConnectionKindType(): ConnectionKind.Type = {
      val r = reader.readZ()
      return ConnectionKind.byOrdinal(r).get
    }

    def readEndPoint(): EndPoint = {
      val r = readEndPointT(F)
      return r
    }

    def readEndPointT(typeParsed: B): EndPoint = {
      if (!typeParsed) {
        reader.expectZ(Constants.EndPoint)
      }
      val component = readName()
      val feature = reader.readOption(readName _)
      val direction = reader.readOption(readDirectionType _)
      return EndPoint(component, feature, direction)
    }

    def readProperty(): Property = {
      val r = readPropertyT(F)
      return r
    }

    def readPropertyT(typeParsed: B): Property = {
      if (!typeParsed) {
        reader.expectZ(Constants.Property)
      }
      val name = readName()
      val propertyValues = reader.readISZ(readPropertyValue _)
      val appliesTo = reader.readISZ(readElementRef _)
      return Property(name, propertyValues, appliesTo)
    }

    def readElementRef(): ElementRef = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Emv2ElementRef => val r = readEmv2ElementRefT(T); return r
        case Constants.AadlElementRef => val r = readAadlElementRefT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of ElementRef.")
          val r = readAadlElementRefT(T)
          return r
      }
    }

    def readElementKindType(): ElementKind.Type = {
      val r = reader.readZ()
      return ElementKind.byOrdinal(r).get
    }

    def readAadlElementRef(): AadlElementRef = {
      val r = readAadlElementRefT(F)
      return r
    }

    def readAadlElementRefT(typeParsed: B): AadlElementRef = {
      if (!typeParsed) {
        reader.expectZ(Constants.AadlElementRef)
      }
      val elementKind = readElementKindType()
      val name = readName()
      return AadlElementRef(elementKind, name)
    }

    def readPropertyValue(): PropertyValue = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.ClassifierProp => val r = readClassifierPropT(T); return r
        case Constants.RangeProp => val r = readRangePropT(T); return r
        case Constants.RecordProp => val r = readRecordPropT(T); return r
        case Constants.ReferenceProp => val r = readReferencePropT(T); return r
        case Constants.UnitProp => val r = readUnitPropT(T); return r
        case Constants.ValueProp => val r = readValuePropT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of PropertyValue.")
          val r = readValuePropT(T)
          return r
      }
    }

    def readClassifierProp(): ClassifierProp = {
      val r = readClassifierPropT(F)
      return r
    }

    def readClassifierPropT(typeParsed: B): ClassifierProp = {
      if (!typeParsed) {
        reader.expectZ(Constants.ClassifierProp)
      }
      val name = reader.readString()
      return ClassifierProp(name)
    }

    def readRangeProp(): RangeProp = {
      val r = readRangePropT(F)
      return r
    }

    def readRangePropT(typeParsed: B): RangeProp = {
      if (!typeParsed) {
        reader.expectZ(Constants.RangeProp)
      }
      val low = readUnitProp()
      val high = readUnitProp()
      return RangeProp(low, high)
    }

    def readRecordProp(): RecordProp = {
      val r = readRecordPropT(F)
      return r
    }

    def readRecordPropT(typeParsed: B): RecordProp = {
      if (!typeParsed) {
        reader.expectZ(Constants.RecordProp)
      }
      val properties = reader.readISZ(readProperty _)
      return RecordProp(properties)
    }

    def readReferenceProp(): ReferenceProp = {
      val r = readReferencePropT(F)
      return r
    }

    def readReferencePropT(typeParsed: B): ReferenceProp = {
      if (!typeParsed) {
        reader.expectZ(Constants.ReferenceProp)
      }
      val value = readName()
      return ReferenceProp(value)
    }

    def readUnitProp(): UnitProp = {
      val r = readUnitPropT(F)
      return r
    }

    def readUnitPropT(typeParsed: B): UnitProp = {
      if (!typeParsed) {
        reader.expectZ(Constants.UnitProp)
      }
      val value = reader.readString()
      val unit = reader.readOption(reader.readString _)
      return UnitProp(value, unit)
    }

    def readValueProp(): ValueProp = {
      val r = readValuePropT(F)
      return r
    }

    def readValuePropT(typeParsed: B): ValueProp = {
      if (!typeParsed) {
        reader.expectZ(Constants.ValueProp)
      }
      val value = reader.readString()
      return ValueProp(value)
    }

    def readMode(): Mode = {
      val r = readModeT(F)
      return r
    }

    def readModeT(typeParsed: B): Mode = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mode)
      }
      val name = readName()
      return Mode(name)
    }

    def readFlowKindType(): FlowKind.Type = {
      val r = reader.readZ()
      return FlowKind.byOrdinal(r).get
    }

    def readFlow(): Flow = {
      val r = readFlowT(F)
      return r
    }

    def readFlowT(typeParsed: B): Flow = {
      if (!typeParsed) {
        reader.expectZ(Constants.Flow)
      }
      val name = readName()
      val kind = readFlowKindType()
      val source = reader.readOption(readName _)
      val sink = reader.readOption(readName _)
      val uriFrag = reader.readString()
      return Flow(name, kind, source, sink, uriFrag)
    }

    def readAnnex(): Annex = {
      val r = readAnnexT(F)
      return r
    }

    def readAnnexT(typeParsed: B): Annex = {
      if (!typeParsed) {
        reader.expectZ(Constants.Annex)
      }
      val name = reader.readString()
      val clause = readAnnexClause()
      return Annex(name, clause)
    }

    def readAnnexClause(): AnnexClause = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.SmfClause => val r = readSmfClauseT(T); return r
        case Constants.SmfClassification => val r = readSmfClassificationT(T); return r
        case Constants.SmfDeclass => val r = readSmfDeclassT(T); return r
        case Constants.SmfType => val r = readSmfTypeT(T); return r
        case Constants.ErrorTypeDef => val r = readErrorTypeDefT(T); return r
        case Constants.ErrorAliasDef => val r = readErrorAliasDefT(T); return r
        case Constants.ErrorTypeSetDef => val r = readErrorTypeSetDefT(T); return r
        case Constants.BehaveStateMachine => val r = readBehaveStateMachineT(T); return r
        case Constants.ErrorEvent => val r = readErrorEventT(T); return r
        case Constants.ErrorState => val r = readErrorStateT(T); return r
        case Constants.ErrorTransition => val r = readErrorTransitionT(T); return r
        case Constants.ConditionTrigger => val r = readConditionTriggerT(T); return r
        case Constants.AndCondition => val r = readAndConditionT(T); return r
        case Constants.OrCondition => val r = readOrConditionT(T); return r
        case Constants.AllCondition => val r = readAllConditionT(T); return r
        case Constants.OrMoreCondition => val r = readOrMoreConditionT(T); return r
        case Constants.OrLessCondition => val r = readOrLessConditionT(T); return r
        case Constants.Emv2Clause => val r = readEmv2ClauseT(T); return r
        case Constants.Emv2Propagation => val r = readEmv2PropagationT(T); return r
        case Constants.Emv2Flow => val r = readEmv2FlowT(T); return r
        case Constants.Emv2BehaviorSection => val r = readEmv2BehaviorSectionT(T); return r
        case Constants.ErrorPropagation => val r = readErrorPropagationT(T); return r
        case Constants.OtherAnnex => val r = readOtherAnnexT(T); return r
        case Constants.GclSubclause => val r = readGclSubclauseT(T); return r
        case Constants.BTSSubclauseBehaviorProvider => val r = readBTSSubclauseBehaviorProviderT(T); return r
        case Constants.BTSBLESSAnnexClause => val r = readBTSBLESSAnnexClauseT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of AnnexClause.")
          val r = readBTSBLESSAnnexClauseT(T)
          return r
      }
    }

    def readAnnexLib(): AnnexLib = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.SmfLibrary => val r = readSmfLibraryT(T); return r
        case Constants.Emv2Library => val r = readEmv2LibraryT(T); return r
        case Constants.OtherLib => val r = readOtherLibT(T); return r
        case Constants.GclLib => val r = readGclLibT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of AnnexLib.")
          val r = readGclLibT(T)
          return r
      }
    }

    def readOtherAnnex(): OtherAnnex = {
      val r = readOtherAnnexT(F)
      return r
    }

    def readOtherAnnexT(typeParsed: B): OtherAnnex = {
      if (!typeParsed) {
        reader.expectZ(Constants.OtherAnnex)
      }
      val clause = reader.readString()
      return OtherAnnex(clause)
    }

    def readOtherLib(): OtherLib = {
      val r = readOtherLibT(F)
      return r
    }

    def readOtherLibT(typeParsed: B): OtherLib = {
      if (!typeParsed) {
        reader.expectZ(Constants.OtherLib)
      }
      val lib = reader.readString()
      return OtherLib(lib)
    }

    def readBLESSAnnex(): BLESSAnnex = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BTSSubclauseBehaviorProvider => val r = readBTSSubclauseBehaviorProviderT(T); return r
        case Constants.BTSBLESSAnnexClause => val r = readBTSBLESSAnnexClauseT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BLESSAnnex.")
          val r = readBTSBLESSAnnexClauseT(T)
          return r
      }
    }

    def readBTSSubclauseBehaviorProvider(): BTSSubclauseBehaviorProvider = {
      val r = readBTSSubclauseBehaviorProviderT(F)
      return r
    }

    def readBTSSubclauseBehaviorProviderT(typeParsed: B): BTSSubclauseBehaviorProvider = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSSubclauseBehaviorProvider)
      }
      val values = reader.readISZ(readBTSResource _)
      return BTSSubclauseBehaviorProvider(values)
    }

    def readBTSResource(): BTSResource = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BTSText => val r = readBTSTextT(T); return r
        case Constants.BTSPath => val r = readBTSPathT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BTSResource.")
          val r = readBTSPathT(T)
          return r
      }
    }

    def readBTSText(): BTSText = {
      val r = readBTSTextT(F)
      return r
    }

    def readBTSTextT(typeParsed: B): BTSText = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSText)
      }
      val source = reader.readString()
      val filename = reader.readOption(reader.readString _)
      val overwrite = reader.readB()
      return BTSText(source, filename, overwrite)
    }

    def readBTSPath(): BTSPath = {
      val r = readBTSPathT(F)
      return r
    }

    def readBTSPathT(typeParsed: B): BTSPath = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSPath)
      }
      val path = reader.readString()
      val overwrite = reader.readB()
      return BTSPath(path, overwrite)
    }

    def readBTSBLESSAnnexClause(): BTSBLESSAnnexClause = {
      val r = readBTSBLESSAnnexClauseT(F)
      return r
    }

    def readBTSBLESSAnnexClauseT(typeParsed: B): BTSBLESSAnnexClause = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSBLESSAnnexClause)
      }
      val doNotProve = reader.readB()
      val assertions = reader.readISZ(readBTSAssertion _)
      val invariant = reader.readOption(readBTSAssertion _)
      val variables = reader.readISZ(readBTSVariableDeclaration _)
      val states = reader.readISZ(readBTSStateDeclaration _)
      val transitions = reader.readISZ(readBTSTransition _)
      return BTSBLESSAnnexClause(doNotProve, assertions, invariant, variables, states, transitions)
    }

    def readBTSVariableDeclaration(): BTSVariableDeclaration = {
      val r = readBTSVariableDeclarationT(F)
      return r
    }

    def readBTSVariableDeclarationT(typeParsed: B): BTSVariableDeclaration = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSVariableDeclaration)
      }
      val name = readName()
      val category = reader.readOption(readBTSVariableCategoryType _)
      val varType = readBTSType()
      val assignExpression = reader.readOption(readBTSExp _)
      val arraySize = reader.readOption(readBLESSIntConst _)
      val variableAssertion = reader.readOption(readBTSAssertion _)
      return BTSVariableDeclaration(name, category, varType, assignExpression, arraySize, variableAssertion)
    }

    def readBTSVariableCategoryType(): BTSVariableCategory.Type = {
      val r = reader.readZ()
      return BTSVariableCategory.byOrdinal(r).get
    }

    def readBTSType(): BTSType = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BTSClassifier => val r = readBTSClassifierT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BTSType.")
          val r = readBTSClassifierT(T)
          return r
      }
    }

    def readBTSClassifier(): BTSClassifier = {
      val r = readBTSClassifierT(F)
      return r
    }

    def readBTSClassifierT(typeParsed: B): BTSClassifier = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSClassifier)
      }
      val classifier = readClassifier()
      return BTSClassifier(classifier)
    }

    def readBLESSIntConst(): BLESSIntConst = {
      val r = readBLESSIntConstT(F)
      return r
    }

    def readBLESSIntConstT(typeParsed: B): BLESSIntConst = {
      if (!typeParsed) {
        reader.expectZ(Constants.BLESSIntConst)
      }
      return BLESSIntConst()
    }

    def readBTSStateDeclaration(): BTSStateDeclaration = {
      val r = readBTSStateDeclarationT(F)
      return r
    }

    def readBTSStateDeclarationT(typeParsed: B): BTSStateDeclaration = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSStateDeclaration)
      }
      val id = readName()
      val categories = reader.readISZ(readBTSStateCategoryType _)
      val assertion = reader.readOption(readBTSAssertion _)
      return BTSStateDeclaration(id, categories, assertion)
    }

    def readBTSStateCategoryType(): BTSStateCategory.Type = {
      val r = reader.readZ()
      return BTSStateCategory.byOrdinal(r).get
    }

    def readBTSTransition(): BTSTransition = {
      val r = readBTSTransitionT(F)
      return r
    }

    def readBTSTransitionT(typeParsed: B): BTSTransition = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSTransition)
      }
      val label = readBTSTransitionLabel()
      val sourceStates = reader.readISZ(readName _)
      val destState = readName()
      val transitionCondition = reader.readOption(readBTSTransitionCondition _)
      val actions = reader.readOption(readBTSBehaviorActions _)
      val assertion = reader.readOption(readBTSAssertion _)
      return BTSTransition(label, sourceStates, destState, transitionCondition, actions, assertion)
    }

    def readBTSTransitionLabel(): BTSTransitionLabel = {
      val r = readBTSTransitionLabelT(F)
      return r
    }

    def readBTSTransitionLabelT(typeParsed: B): BTSTransitionLabel = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSTransitionLabel)
      }
      val id = readName()
      val priority = reader.readOption(reader.readZ _)
      return BTSTransitionLabel(id, priority)
    }

    def readBTSTransitionCondition(): BTSTransitionCondition = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BTSDispatchCondition => val r = readBTSDispatchConditionT(T); return r
        case Constants.BTSExecuteConditionExp => val r = readBTSExecuteConditionExpT(T); return r
        case Constants.BTSExecuteConditionTimeout => val r = readBTSExecuteConditionTimeoutT(T); return r
        case Constants.BTSExecuteConditionOtherwise => val r = readBTSExecuteConditionOtherwiseT(T); return r
        case Constants.BTSModeCondition => val r = readBTSModeConditionT(T); return r
        case Constants.BTSInternalCondition => val r = readBTSInternalConditionT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BTSTransitionCondition.")
          val r = readBTSInternalConditionT(T)
          return r
      }
    }

    def readBTSDispatchCondition(): BTSDispatchCondition = {
      val r = readBTSDispatchConditionT(F)
      return r
    }

    def readBTSDispatchConditionT(typeParsed: B): BTSDispatchCondition = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSDispatchCondition)
      }
      val dispatchTriggers = reader.readISZ(readBTSDispatchConjunction _)
      val frozenPorts = reader.readISZ(readName _)
      return BTSDispatchCondition(dispatchTriggers, frozenPorts)
    }

    def readBTSDispatchConjunction(): BTSDispatchConjunction = {
      val r = readBTSDispatchConjunctionT(F)
      return r
    }

    def readBTSDispatchConjunctionT(typeParsed: B): BTSDispatchConjunction = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSDispatchConjunction)
      }
      val conjunction = reader.readISZ(readBTSDispatchTrigger _)
      return BTSDispatchConjunction(conjunction)
    }

    def readBTSDispatchTrigger(): BTSDispatchTrigger = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BTSDispatchTriggerStop => val r = readBTSDispatchTriggerStopT(T); return r
        case Constants.BTSDispatchTriggerPort => val r = readBTSDispatchTriggerPortT(T); return r
        case Constants.BTSDispatchTriggerTimeout => val r = readBTSDispatchTriggerTimeoutT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BTSDispatchTrigger.")
          val r = readBTSDispatchTriggerTimeoutT(T)
          return r
      }
    }

    def readBTSDispatchTriggerStop(): BTSDispatchTriggerStop = {
      val r = readBTSDispatchTriggerStopT(F)
      return r
    }

    def readBTSDispatchTriggerStopT(typeParsed: B): BTSDispatchTriggerStop = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSDispatchTriggerStop)
      }
      return BTSDispatchTriggerStop()
    }

    def readBTSDispatchTriggerPort(): BTSDispatchTriggerPort = {
      val r = readBTSDispatchTriggerPortT(F)
      return r
    }

    def readBTSDispatchTriggerPortT(typeParsed: B): BTSDispatchTriggerPort = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSDispatchTriggerPort)
      }
      val port = readName()
      return BTSDispatchTriggerPort(port)
    }

    def readBTSDispatchTriggerTimeout(): BTSDispatchTriggerTimeout = {
      val r = readBTSDispatchTriggerTimeoutT(F)
      return r
    }

    def readBTSDispatchTriggerTimeoutT(typeParsed: B): BTSDispatchTriggerTimeout = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSDispatchTriggerTimeout)
      }
      val ports = reader.readISZ(readName _)
      val time = reader.readOption(readBTSBehaviorTime _)
      return BTSDispatchTriggerTimeout(ports, time)
    }

    def readBTSExecuteCondition(): BTSExecuteCondition = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BTSExecuteConditionExp => val r = readBTSExecuteConditionExpT(T); return r
        case Constants.BTSExecuteConditionTimeout => val r = readBTSExecuteConditionTimeoutT(T); return r
        case Constants.BTSExecuteConditionOtherwise => val r = readBTSExecuteConditionOtherwiseT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BTSExecuteCondition.")
          val r = readBTSExecuteConditionOtherwiseT(T)
          return r
      }
    }

    def readBTSExecuteConditionExp(): BTSExecuteConditionExp = {
      val r = readBTSExecuteConditionExpT(F)
      return r
    }

    def readBTSExecuteConditionExpT(typeParsed: B): BTSExecuteConditionExp = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSExecuteConditionExp)
      }
      val exp = readBTSExp()
      return BTSExecuteConditionExp(exp)
    }

    def readBTSExecuteConditionTimeout(): BTSExecuteConditionTimeout = {
      val r = readBTSExecuteConditionTimeoutT(F)
      return r
    }

    def readBTSExecuteConditionTimeoutT(typeParsed: B): BTSExecuteConditionTimeout = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSExecuteConditionTimeout)
      }
      return BTSExecuteConditionTimeout()
    }

    def readBTSExecuteConditionOtherwise(): BTSExecuteConditionOtherwise = {
      val r = readBTSExecuteConditionOtherwiseT(F)
      return r
    }

    def readBTSExecuteConditionOtherwiseT(typeParsed: B): BTSExecuteConditionOtherwise = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSExecuteConditionOtherwise)
      }
      return BTSExecuteConditionOtherwise()
    }

    def readBTSModeCondition(): BTSModeCondition = {
      val r = readBTSModeConditionT(F)
      return r
    }

    def readBTSModeConditionT(typeParsed: B): BTSModeCondition = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSModeCondition)
      }
      return BTSModeCondition()
    }

    def readBTSInternalCondition(): BTSInternalCondition = {
      val r = readBTSInternalConditionT(F)
      return r
    }

    def readBTSInternalConditionT(typeParsed: B): BTSInternalCondition = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSInternalCondition)
      }
      return BTSInternalCondition()
    }

    def readBTSAssertion(): BTSAssertion = {
      val r = readBTSAssertionT(F)
      return r
    }

    def readBTSAssertionT(typeParsed: B): BTSAssertion = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSAssertion)
      }
      return BTSAssertion()
    }

    def readBTSBehaviorActions(): BTSBehaviorActions = {
      val r = readBTSBehaviorActionsT(F)
      return r
    }

    def readBTSBehaviorActionsT(typeParsed: B): BTSBehaviorActions = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSBehaviorActions)
      }
      val executionOrder = readBTSExecutionOrderType()
      val actions = reader.readISZ(readBTSAssertedAction _)
      return BTSBehaviorActions(executionOrder, actions)
    }

    def readBTSExecutionOrderType(): BTSExecutionOrder.Type = {
      val r = reader.readZ()
      return BTSExecutionOrder.byOrdinal(r).get
    }

    def readBTSAssertedAction(): BTSAssertedAction = {
      val r = readBTSAssertedActionT(F)
      return r
    }

    def readBTSAssertedActionT(typeParsed: B): BTSAssertedAction = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSAssertedAction)
      }
      val precondition = reader.readOption(readBTSAssertion _)
      val action = readBTSAction()
      val postcondition = reader.readOption(readBTSAssertion _)
      return BTSAssertedAction(precondition, action, postcondition)
    }

    def readBTSAction(): BTSAction = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BTSSkipAction => val r = readBTSSkipActionT(T); return r
        case Constants.BTSAssignmentAction => val r = readBTSAssignmentActionT(T); return r
        case Constants.BTSSubprogramCallAction => val r = readBTSSubprogramCallActionT(T); return r
        case Constants.BTSPortOutAction => val r = readBTSPortOutActionT(T); return r
        case Constants.BTSPortInAction => val r = readBTSPortInActionT(T); return r
        case Constants.BTSFrozenPortAction => val r = readBTSFrozenPortActionT(T); return r
        case Constants.BTSIfBLESSAction => val r = readBTSIfBLESSActionT(T); return r
        case Constants.BTSIfBAAction => val r = readBTSIfBAActionT(T); return r
        case Constants.BTSExistentialLatticeQuantification => val r = readBTSExistentialLatticeQuantificationT(T); return r
        case Constants.BTSUniversalLatticeQuantification => val r = readBTSUniversalLatticeQuantificationT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BTSAction.")
          val r = readBTSUniversalLatticeQuantificationT(T)
          return r
      }
    }

    def readBTSBasicAction(): BTSBasicAction = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BTSSkipAction => val r = readBTSSkipActionT(T); return r
        case Constants.BTSAssignmentAction => val r = readBTSAssignmentActionT(T); return r
        case Constants.BTSSubprogramCallAction => val r = readBTSSubprogramCallActionT(T); return r
        case Constants.BTSPortOutAction => val r = readBTSPortOutActionT(T); return r
        case Constants.BTSPortInAction => val r = readBTSPortInActionT(T); return r
        case Constants.BTSFrozenPortAction => val r = readBTSFrozenPortActionT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BTSBasicAction.")
          val r = readBTSFrozenPortActionT(T)
          return r
      }
    }

    def readBTSSkipAction(): BTSSkipAction = {
      val r = readBTSSkipActionT(F)
      return r
    }

    def readBTSSkipActionT(typeParsed: B): BTSSkipAction = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSSkipAction)
      }
      return BTSSkipAction()
    }

    def readBTSAssignmentAction(): BTSAssignmentAction = {
      val r = readBTSAssignmentActionT(F)
      return r
    }

    def readBTSAssignmentActionT(typeParsed: B): BTSAssignmentAction = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSAssignmentAction)
      }
      val lhs = readBTSExp()
      val rhs = readBTSExp()
      return BTSAssignmentAction(lhs, rhs)
    }

    def readBTSCommunicationAction(): BTSCommunicationAction = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BTSSubprogramCallAction => val r = readBTSSubprogramCallActionT(T); return r
        case Constants.BTSPortOutAction => val r = readBTSPortOutActionT(T); return r
        case Constants.BTSPortInAction => val r = readBTSPortInActionT(T); return r
        case Constants.BTSFrozenPortAction => val r = readBTSFrozenPortActionT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BTSCommunicationAction.")
          val r = readBTSFrozenPortActionT(T)
          return r
      }
    }

    def readBTSSubprogramCallAction(): BTSSubprogramCallAction = {
      val r = readBTSSubprogramCallActionT(F)
      return r
    }

    def readBTSSubprogramCallActionT(typeParsed: B): BTSSubprogramCallAction = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSSubprogramCallAction)
      }
      val name = readName()
      val params = reader.readISZ(readBTSFormalExpPair _)
      return BTSSubprogramCallAction(name, params)
    }

    def readBTSPortOutAction(): BTSPortOutAction = {
      val r = readBTSPortOutActionT(F)
      return r
    }

    def readBTSPortOutActionT(typeParsed: B): BTSPortOutAction = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSPortOutAction)
      }
      val name = readName()
      val exp = reader.readOption(readBTSExp _)
      return BTSPortOutAction(name, exp)
    }

    def readBTSPortInAction(): BTSPortInAction = {
      val r = readBTSPortInActionT(F)
      return r
    }

    def readBTSPortInActionT(typeParsed: B): BTSPortInAction = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSPortInAction)
      }
      val name = readName()
      val variable = readBTSExp()
      return BTSPortInAction(name, variable)
    }

    def readBTSFrozenPortAction(): BTSFrozenPortAction = {
      val r = readBTSFrozenPortActionT(F)
      return r
    }

    def readBTSFrozenPortActionT(typeParsed: B): BTSFrozenPortAction = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSFrozenPortAction)
      }
      val portName = readName()
      return BTSFrozenPortAction(portName)
    }

    def readBTSControlAction(): BTSControlAction = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BTSIfBLESSAction => val r = readBTSIfBLESSActionT(T); return r
        case Constants.BTSIfBAAction => val r = readBTSIfBAActionT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BTSControlAction.")
          val r = readBTSIfBAActionT(T)
          return r
      }
    }

    def readBTSIfBLESSAction(): BTSIfBLESSAction = {
      val r = readBTSIfBLESSActionT(F)
      return r
    }

    def readBTSIfBLESSActionT(typeParsed: B): BTSIfBLESSAction = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSIfBLESSAction)
      }
      val availability = reader.readOption(readTODO _)
      val alternatives = reader.readISZ(readBTSGuardedAction _)
      return BTSIfBLESSAction(availability, alternatives)
    }

    def readBTSGuardedAction(): BTSGuardedAction = {
      val r = readBTSGuardedActionT(F)
      return r
    }

    def readBTSGuardedActionT(typeParsed: B): BTSGuardedAction = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSGuardedAction)
      }
      val guard = readBTSExp()
      val action = readBTSAssertedAction()
      return BTSGuardedAction(guard, action)
    }

    def readBTSIfBAAction(): BTSIfBAAction = {
      val r = readBTSIfBAActionT(F)
      return r
    }

    def readBTSIfBAActionT(typeParsed: B): BTSIfBAAction = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSIfBAAction)
      }
      val ifBranch = readBTSConditionalActions()
      val elseIfBranches = reader.readISZ(readBTSConditionalActions _)
      val elseBranch = reader.readOption(readBTSBehaviorActions _)
      return BTSIfBAAction(ifBranch, elseIfBranches, elseBranch)
    }

    def readBTSConditionalActions(): BTSConditionalActions = {
      val r = readBTSConditionalActionsT(F)
      return r
    }

    def readBTSConditionalActionsT(typeParsed: B): BTSConditionalActions = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSConditionalActions)
      }
      val cond = readBTSExp()
      val actions = readBTSBehaviorActions()
      return BTSConditionalActions(cond, actions)
    }

    def readBTSQuantificationActions(): BTSQuantificationActions = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BTSExistentialLatticeQuantification => val r = readBTSExistentialLatticeQuantificationT(T); return r
        case Constants.BTSUniversalLatticeQuantification => val r = readBTSUniversalLatticeQuantificationT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BTSQuantificationActions.")
          val r = readBTSUniversalLatticeQuantificationT(T)
          return r
      }
    }

    def readBTSExistentialLatticeQuantification(): BTSExistentialLatticeQuantification = {
      val r = readBTSExistentialLatticeQuantificationT(F)
      return r
    }

    def readBTSExistentialLatticeQuantificationT(typeParsed: B): BTSExistentialLatticeQuantification = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSExistentialLatticeQuantification)
      }
      val quantifiedVariables = reader.readISZ(readBTSVariableDeclaration _)
      val actions = readBTSBehaviorActions()
      val timeout = reader.readOption(readBTSBehaviorTime _)
      val catchClause = reader.readOption(readTODO _)
      return BTSExistentialLatticeQuantification(quantifiedVariables, actions, timeout, catchClause)
    }

    def readBTSUniversalLatticeQuantification(): BTSUniversalLatticeQuantification = {
      val r = readBTSUniversalLatticeQuantificationT(F)
      return r
    }

    def readBTSUniversalLatticeQuantificationT(typeParsed: B): BTSUniversalLatticeQuantification = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSUniversalLatticeQuantification)
      }
      val latticeVariables = reader.readISZ(readName _)
      val range = reader.readOption(readTODO _)
      val elq = readBTSExistentialLatticeQuantification()
      return BTSUniversalLatticeQuantification(latticeVariables, range, elq)
    }

    def readBTSExp(): BTSExp = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BTSUnaryExp => val r = readBTSUnaryExpT(T); return r
        case Constants.BTSBinaryExp => val r = readBTSBinaryExpT(T); return r
        case Constants.BTSLiteralExp => val r = readBTSLiteralExpT(T); return r
        case Constants.BTSNameExp => val r = readBTSNameExpT(T); return r
        case Constants.BTSIndexingExp => val r = readBTSIndexingExpT(T); return r
        case Constants.BTSAccessExp => val r = readBTSAccessExpT(T); return r
        case Constants.BTSFunctionCall => val r = readBTSFunctionCallT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BTSExp.")
          val r = readBTSFunctionCallT(T)
          return r
      }
    }

    def readBTSUnaryExp(): BTSUnaryExp = {
      val r = readBTSUnaryExpT(F)
      return r
    }

    def readBTSUnaryExpT(typeParsed: B): BTSUnaryExp = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSUnaryExp)
      }
      val op = readBTSUnaryOpType()
      val exp = readBTSExp()
      val pos = reader.readOption(reader.readPosition _)
      return BTSUnaryExp(op, exp, pos)
    }

    def readBTSUnaryOpType(): BTSUnaryOp.Type = {
      val r = reader.readZ()
      return BTSUnaryOp.byOrdinal(r).get
    }

    def readBTSBinaryExp(): BTSBinaryExp = {
      val r = readBTSBinaryExpT(F)
      return r
    }

    def readBTSBinaryExpT(typeParsed: B): BTSBinaryExp = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSBinaryExp)
      }
      val op = readBTSBinaryOpType()
      val lhs = readBTSExp()
      val rhs = readBTSExp()
      val pos = reader.readOption(reader.readPosition _)
      return BTSBinaryExp(op, lhs, rhs, pos)
    }

    def readBTSBinaryOpType(): BTSBinaryOp.Type = {
      val r = reader.readZ()
      return BTSBinaryOp.byOrdinal(r).get
    }

    def readBTSLiteralTypeType(): BTSLiteralType.Type = {
      val r = reader.readZ()
      return BTSLiteralType.byOrdinal(r).get
    }

    def readBTSLiteralExp(): BTSLiteralExp = {
      val r = readBTSLiteralExpT(F)
      return r
    }

    def readBTSLiteralExpT(typeParsed: B): BTSLiteralExp = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSLiteralExp)
      }
      val typ = readBTSLiteralTypeType()
      val exp = reader.readString()
      val pos = reader.readOption(reader.readPosition _)
      return BTSLiteralExp(typ, exp, pos)
    }

    def readBTSNameExp(): BTSNameExp = {
      val r = readBTSNameExpT(F)
      return r
    }

    def readBTSNameExpT(typeParsed: B): BTSNameExp = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSNameExp)
      }
      val name = readName()
      val pos = reader.readOption(reader.readPosition _)
      return BTSNameExp(name, pos)
    }

    def readBTSIndexingExp(): BTSIndexingExp = {
      val r = readBTSIndexingExpT(F)
      return r
    }

    def readBTSIndexingExpT(typeParsed: B): BTSIndexingExp = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSIndexingExp)
      }
      val exp = readBTSExp()
      val indices = reader.readISZ(readBTSExp _)
      val pos = reader.readOption(reader.readPosition _)
      return BTSIndexingExp(exp, indices, pos)
    }

    def readBTSAccessExp(): BTSAccessExp = {
      val r = readBTSAccessExpT(F)
      return r
    }

    def readBTSAccessExpT(typeParsed: B): BTSAccessExp = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSAccessExp)
      }
      val exp = readBTSExp()
      val attributeName = reader.readString()
      val pos = reader.readOption(reader.readPosition _)
      return BTSAccessExp(exp, attributeName, pos)
    }

    def readBTSFunctionCall(): BTSFunctionCall = {
      val r = readBTSFunctionCallT(F)
      return r
    }

    def readBTSFunctionCallT(typeParsed: B): BTSFunctionCall = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSFunctionCall)
      }
      val name = readName()
      val args = reader.readISZ(readBTSFormalExpPair _)
      val pos = reader.readOption(reader.readPosition _)
      return BTSFunctionCall(name, args, pos)
    }

    def readBTSFormalExpPair(): BTSFormalExpPair = {
      val r = readBTSFormalExpPairT(F)
      return r
    }

    def readBTSFormalExpPairT(typeParsed: B): BTSFormalExpPair = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSFormalExpPair)
      }
      val paramName = reader.readOption(readName _)
      val exp = reader.readOption(readBTSExp _)
      val pos = reader.readOption(reader.readPosition _)
      return BTSFormalExpPair(paramName, exp, pos)
    }

    def readBTSBehaviorTime(): BTSBehaviorTime = {
      val r = readBTSBehaviorTimeT(F)
      return r
    }

    def readBTSBehaviorTimeT(typeParsed: B): BTSBehaviorTime = {
      if (!typeParsed) {
        reader.expectZ(Constants.BTSBehaviorTime)
      }
      return BTSBehaviorTime()
    }

    def readTODO(): TODO = {
      val r = readTODOT(F)
      return r
    }

    def readTODOT(typeParsed: B): TODO = {
      if (!typeParsed) {
        reader.expectZ(Constants.TODO)
      }
      return TODO()
    }

    def readAttr(): Attr = {
      val r = readAttrT(F)
      return r
    }

    def readAttrT(typeParsed: B): Attr = {
      if (!typeParsed) {
        reader.expectZ(Constants.Attr)
      }
      val posOpt = reader.readOption(reader.readPosition _)
      return Attr(posOpt)
    }

    def readEmv2Annex(): Emv2Annex = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.ErrorTypeDef => val r = readErrorTypeDefT(T); return r
        case Constants.ErrorAliasDef => val r = readErrorAliasDefT(T); return r
        case Constants.ErrorTypeSetDef => val r = readErrorTypeSetDefT(T); return r
        case Constants.BehaveStateMachine => val r = readBehaveStateMachineT(T); return r
        case Constants.ErrorEvent => val r = readErrorEventT(T); return r
        case Constants.ErrorState => val r = readErrorStateT(T); return r
        case Constants.ErrorTransition => val r = readErrorTransitionT(T); return r
        case Constants.ConditionTrigger => val r = readConditionTriggerT(T); return r
        case Constants.AndCondition => val r = readAndConditionT(T); return r
        case Constants.OrCondition => val r = readOrConditionT(T); return r
        case Constants.AllCondition => val r = readAllConditionT(T); return r
        case Constants.OrMoreCondition => val r = readOrMoreConditionT(T); return r
        case Constants.OrLessCondition => val r = readOrLessConditionT(T); return r
        case Constants.Emv2Clause => val r = readEmv2ClauseT(T); return r
        case Constants.Emv2Propagation => val r = readEmv2PropagationT(T); return r
        case Constants.Emv2Flow => val r = readEmv2FlowT(T); return r
        case Constants.Emv2BehaviorSection => val r = readEmv2BehaviorSectionT(T); return r
        case Constants.ErrorPropagation => val r = readErrorPropagationT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Emv2Annex.")
          val r = readErrorPropagationT(T)
          return r
      }
    }

    def readEmv2Lib(): Emv2Lib = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Emv2Library => val r = readEmv2LibraryT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Emv2Lib.")
          val r = readEmv2LibraryT(T)
          return r
      }
    }

    def readPropagationDirectionType(): PropagationDirection.Type = {
      val r = reader.readZ()
      return PropagationDirection.byOrdinal(r).get
    }

    def readEmv2ElementRef(): Emv2ElementRef = {
      val r = readEmv2ElementRefT(F)
      return r
    }

    def readEmv2ElementRefT(typeParsed: B): Emv2ElementRef = {
      if (!typeParsed) {
        reader.expectZ(Constants.Emv2ElementRef)
      }
      val kind = readEmv2ElementKindType()
      val name = readName()
      val errorTypes = reader.readISZ(readName _)
      return Emv2ElementRef(kind, name, errorTypes)
    }

    def readEmv2ElementKindType(): Emv2ElementKind.Type = {
      val r = reader.readZ()
      return Emv2ElementKind.byOrdinal(r).get
    }

    def readEmv2Library(): Emv2Library = {
      val r = readEmv2LibraryT(F)
      return r
    }

    def readEmv2LibraryT(typeParsed: B): Emv2Library = {
      if (!typeParsed) {
        reader.expectZ(Constants.Emv2Library)
      }
      val name = readName()
      val useTypes = reader.readISZ(reader.readString _)
      val errorTypeDef = reader.readISZ(readErrorTypeDef _)
      val errorTypeSetDef = reader.readISZ(readErrorTypeSetDef _)
      val alias = reader.readISZ(readErrorAliasDef _)
      val behaveStateMachine = reader.readISZ(readBehaveStateMachine _)
      return Emv2Library(name, useTypes, errorTypeDef, errorTypeSetDef, alias, behaveStateMachine)
    }

    def readErrorKindType(): ErrorKind.Type = {
      val r = reader.readZ()
      return ErrorKind.byOrdinal(r).get
    }

    def readErrorTypeDef(): ErrorTypeDef = {
      val r = readErrorTypeDefT(F)
      return r
    }

    def readErrorTypeDefT(typeParsed: B): ErrorTypeDef = {
      if (!typeParsed) {
        reader.expectZ(Constants.ErrorTypeDef)
      }
      val id = readName()
      val extendType = reader.readOption(readName _)
      val uriFrag = reader.readString()
      return ErrorTypeDef(id, extendType, uriFrag)
    }

    def readErrorAliasDef(): ErrorAliasDef = {
      val r = readErrorAliasDefT(F)
      return r
    }

    def readErrorAliasDefT(typeParsed: B): ErrorAliasDef = {
      if (!typeParsed) {
        reader.expectZ(Constants.ErrorAliasDef)
      }
      val errorType = readName()
      val aliseType = readName()
      return ErrorAliasDef(errorType, aliseType)
    }

    def readErrorTypeSetDef(): ErrorTypeSetDef = {
      val r = readErrorTypeSetDefT(F)
      return r
    }

    def readErrorTypeSetDefT(typeParsed: B): ErrorTypeSetDef = {
      if (!typeParsed) {
        reader.expectZ(Constants.ErrorTypeSetDef)
      }
      val id = readName()
      val errorTypes = reader.readISZ(readName _)
      return ErrorTypeSetDef(id, errorTypes)
    }

    def readBehaveStateMachine(): BehaveStateMachine = {
      val r = readBehaveStateMachineT(F)
      return r
    }

    def readBehaveStateMachineT(typeParsed: B): BehaveStateMachine = {
      if (!typeParsed) {
        reader.expectZ(Constants.BehaveStateMachine)
      }
      val id = readName()
      val events = reader.readISZ(readErrorEvent _)
      val states = reader.readISZ(readErrorState _)
      val transitions = reader.readISZ(readErrorTransition _)
      val properties = reader.readISZ(readProperty _)
      return BehaveStateMachine(id, events, states, transitions, properties)
    }

    def readErrorEvent(): ErrorEvent = {
      val r = readErrorEventT(F)
      return r
    }

    def readErrorEventT(typeParsed: B): ErrorEvent = {
      if (!typeParsed) {
        reader.expectZ(Constants.ErrorEvent)
      }
      val id = readName()
      return ErrorEvent(id)
    }

    def readErrorState(): ErrorState = {
      val r = readErrorStateT(F)
      return r
    }

    def readErrorStateT(typeParsed: B): ErrorState = {
      if (!typeParsed) {
        reader.expectZ(Constants.ErrorState)
      }
      val id = readName()
      val isInitial = reader.readB()
      return ErrorState(id, isInitial)
    }

    def readErrorTransition(): ErrorTransition = {
      val r = readErrorTransitionT(F)
      return r
    }

    def readErrorTransitionT(typeParsed: B): ErrorTransition = {
      if (!typeParsed) {
        reader.expectZ(Constants.ErrorTransition)
      }
      val id = reader.readOption(readName _)
      val sourceState = readName()
      val condition = readErrorCondition()
      val targetState = readName()
      return ErrorTransition(id, sourceState, condition, targetState)
    }

    def readErrorCondition(): ErrorCondition = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.ConditionTrigger => val r = readConditionTriggerT(T); return r
        case Constants.AndCondition => val r = readAndConditionT(T); return r
        case Constants.OrCondition => val r = readOrConditionT(T); return r
        case Constants.AllCondition => val r = readAllConditionT(T); return r
        case Constants.OrMoreCondition => val r = readOrMoreConditionT(T); return r
        case Constants.OrLessCondition => val r = readOrLessConditionT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of ErrorCondition.")
          val r = readOrLessConditionT(T)
          return r
      }
    }

    def readConditionTrigger(): ConditionTrigger = {
      val r = readConditionTriggerT(F)
      return r
    }

    def readConditionTriggerT(typeParsed: B): ConditionTrigger = {
      if (!typeParsed) {
        reader.expectZ(Constants.ConditionTrigger)
      }
      val events = reader.readISZ(readName _)
      val propagationPoints = reader.readISZ(readEmv2Propagation _)
      return ConditionTrigger(events, propagationPoints)
    }

    def readAndCondition(): AndCondition = {
      val r = readAndConditionT(F)
      return r
    }

    def readAndConditionT(typeParsed: B): AndCondition = {
      if (!typeParsed) {
        reader.expectZ(Constants.AndCondition)
      }
      val op = reader.readISZ(readErrorCondition _)
      return AndCondition(op)
    }

    def readOrCondition(): OrCondition = {
      val r = readOrConditionT(F)
      return r
    }

    def readOrConditionT(typeParsed: B): OrCondition = {
      if (!typeParsed) {
        reader.expectZ(Constants.OrCondition)
      }
      val op = reader.readISZ(readErrorCondition _)
      return OrCondition(op)
    }

    def readAllCondition(): AllCondition = {
      val r = readAllConditionT(F)
      return r
    }

    def readAllConditionT(typeParsed: B): AllCondition = {
      if (!typeParsed) {
        reader.expectZ(Constants.AllCondition)
      }
      val op = reader.readISZ(readErrorCondition _)
      return AllCondition(op)
    }

    def readOrMoreCondition(): OrMoreCondition = {
      val r = readOrMoreConditionT(F)
      return r
    }

    def readOrMoreConditionT(typeParsed: B): OrMoreCondition = {
      if (!typeParsed) {
        reader.expectZ(Constants.OrMoreCondition)
      }
      val number = reader.readZ()
      val conditions = reader.readISZ(readErrorCondition _)
      return OrMoreCondition(number, conditions)
    }

    def readOrLessCondition(): OrLessCondition = {
      val r = readOrLessConditionT(F)
      return r
    }

    def readOrLessConditionT(typeParsed: B): OrLessCondition = {
      if (!typeParsed) {
        reader.expectZ(Constants.OrLessCondition)
      }
      val number = reader.readZ()
      val conditions = reader.readISZ(readErrorCondition _)
      return OrLessCondition(number, conditions)
    }

    def readEmv2Clause(): Emv2Clause = {
      val r = readEmv2ClauseT(F)
      return r
    }

    def readEmv2ClauseT(typeParsed: B): Emv2Clause = {
      if (!typeParsed) {
        reader.expectZ(Constants.Emv2Clause)
      }
      val libraries = reader.readISZ(readName _)
      val propagations = reader.readISZ(readEmv2Propagation _)
      val flows = reader.readISZ(readEmv2Flow _)
      val componentBehavior = reader.readOption(readEmv2BehaviorSection _)
      val properties = reader.readISZ(readProperty _)
      return Emv2Clause(libraries, propagations, flows, componentBehavior, properties)
    }

    def readEmv2Propagation(): Emv2Propagation = {
      val r = readEmv2PropagationT(F)
      return r
    }

    def readEmv2PropagationT(typeParsed: B): Emv2Propagation = {
      if (!typeParsed) {
        reader.expectZ(Constants.Emv2Propagation)
      }
      val direction = readPropagationDirectionType()
      val propagationPoint = readName()
      val errorTokens = reader.readISZ(readName _)
      return Emv2Propagation(direction, propagationPoint, errorTokens)
    }

    def readEmv2Flow(): Emv2Flow = {
      val r = readEmv2FlowT(F)
      return r
    }

    def readEmv2FlowT(typeParsed: B): Emv2Flow = {
      if (!typeParsed) {
        reader.expectZ(Constants.Emv2Flow)
      }
      val identifier = readName()
      val kind = readFlowKindType()
      val sourcePropagation = reader.readOption(readEmv2Propagation _)
      val sinkPropagation = reader.readOption(readEmv2Propagation _)
      val uriFrag = reader.readString()
      return Emv2Flow(identifier, kind, sourcePropagation, sinkPropagation, uriFrag)
    }

    def readEmv2BehaviorSection(): Emv2BehaviorSection = {
      val r = readEmv2BehaviorSectionT(F)
      return r
    }

    def readEmv2BehaviorSectionT(typeParsed: B): Emv2BehaviorSection = {
      if (!typeParsed) {
        reader.expectZ(Constants.Emv2BehaviorSection)
      }
      val events = reader.readISZ(readErrorEvent _)
      val transitions = reader.readISZ(readErrorTransition _)
      val propagations = reader.readISZ(readErrorPropagation _)
      return Emv2BehaviorSection(events, transitions, propagations)
    }

    def readErrorPropagation(): ErrorPropagation = {
      val r = readErrorPropagationT(F)
      return r
    }

    def readErrorPropagationT(typeParsed: B): ErrorPropagation = {
      if (!typeParsed) {
        reader.expectZ(Constants.ErrorPropagation)
      }
      val id = reader.readOption(readName _)
      val source = reader.readISZ(readName _)
      val condition = reader.readOption(readErrorCondition _)
      val target = reader.readISZ(readEmv2Propagation _)
      return ErrorPropagation(id, source, condition, target)
    }

    def readGclSymbol(): GclSymbol = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.GclSubclause => val r = readGclSubclauseT(T); return r
        case Constants.GclMethod => val r = readGclMethodT(T); return r
        case Constants.GclStateVar => val r = readGclStateVarT(T); return r
        case Constants.GclInvariant => val r = readGclInvariantT(T); return r
        case Constants.GclAssume => val r = readGclAssumeT(T); return r
        case Constants.GclGuarantee => val r = readGclGuaranteeT(T); return r
        case Constants.GclIntegration => val r = readGclIntegrationT(T); return r
        case Constants.GclCaseStatement => val r = readGclCaseStatementT(T); return r
        case Constants.GclInitialize => val r = readGclInitializeT(T); return r
        case Constants.GclCompute => val r = readGclComputeT(T); return r
        case Constants.GclHandle => val r = readGclHandleT(T); return r
        case Constants.GclTODO => val r = readGclTODOT(T); return r
        case Constants.GclLib => val r = readGclLibT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of GclSymbol.")
          val r = readGclLibT(T)
          return r
      }
    }

    def readGclSubclause(): GclSubclause = {
      val r = readGclSubclauseT(F)
      return r
    }

    def readGclSubclauseT(typeParsed: B): GclSubclause = {
      if (!typeParsed) {
        reader.expectZ(Constants.GclSubclause)
      }
      val state = reader.readISZ(readGclStateVar _)
      val methods = reader.readISZ(readGclMethod _)
      val invariants = reader.readISZ(readGclInvariant _)
      val initializes = reader.readOption(readGclInitialize _)
      val integration = reader.readOption(readGclIntegration _)
      val compute = reader.readOption(readGclCompute _)
      return GclSubclause(state, methods, invariants, initializes, integration, compute)
    }

    def readGclMethod(): GclMethod = {
      val r = readGclMethodT(F)
      return r
    }

    def readGclMethodT(typeParsed: B): GclMethod = {
      if (!typeParsed) {
        reader.expectZ(Constants.GclMethod)
      }
      val method = read_langastStmtMethod()
      return GclMethod(method)
    }

    def readGclStateVar(): GclStateVar = {
      val r = readGclStateVarT(F)
      return r
    }

    def readGclStateVarT(typeParsed: B): GclStateVar = {
      if (!typeParsed) {
        reader.expectZ(Constants.GclStateVar)
      }
      val name = reader.readString()
      val classifier = reader.readString()
      val posOpt = reader.readOption(reader.readPosition _)
      return GclStateVar(name, classifier, posOpt)
    }

    def readGclSpec(): GclSpec = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.GclInvariant => val r = readGclInvariantT(T); return r
        case Constants.GclAssume => val r = readGclAssumeT(T); return r
        case Constants.GclGuarantee => val r = readGclGuaranteeT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of GclSpec.")
          val r = readGclGuaranteeT(T)
          return r
      }
    }

    def readGclInvariant(): GclInvariant = {
      val r = readGclInvariantT(F)
      return r
    }

    def readGclInvariantT(typeParsed: B): GclInvariant = {
      if (!typeParsed) {
        reader.expectZ(Constants.GclInvariant)
      }
      val id = reader.readString()
      val descriptor = reader.readOption(reader.readString _)
      val exp = read_langastExp()
      val posOpt = reader.readOption(reader.readPosition _)
      return GclInvariant(id, descriptor, exp, posOpt)
    }

    def readGclComputeSpec(): GclComputeSpec = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.GclAssume => val r = readGclAssumeT(T); return r
        case Constants.GclGuarantee => val r = readGclGuaranteeT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of GclComputeSpec.")
          val r = readGclGuaranteeT(T)
          return r
      }
    }

    def readGclAssume(): GclAssume = {
      val r = readGclAssumeT(F)
      return r
    }

    def readGclAssumeT(typeParsed: B): GclAssume = {
      if (!typeParsed) {
        reader.expectZ(Constants.GclAssume)
      }
      val id = reader.readString()
      val descriptor = reader.readOption(reader.readString _)
      val exp = read_langastExp()
      val posOpt = reader.readOption(reader.readPosition _)
      return GclAssume(id, descriptor, exp, posOpt)
    }

    def readGclGuarantee(): GclGuarantee = {
      val r = readGclGuaranteeT(F)
      return r
    }

    def readGclGuaranteeT(typeParsed: B): GclGuarantee = {
      if (!typeParsed) {
        reader.expectZ(Constants.GclGuarantee)
      }
      val id = reader.readString()
      val descriptor = reader.readOption(reader.readString _)
      val exp = read_langastExp()
      val posOpt = reader.readOption(reader.readPosition _)
      return GclGuarantee(id, descriptor, exp, posOpt)
    }

    def readGclIntegration(): GclIntegration = {
      val r = readGclIntegrationT(F)
      return r
    }

    def readGclIntegrationT(typeParsed: B): GclIntegration = {
      if (!typeParsed) {
        reader.expectZ(Constants.GclIntegration)
      }
      val specs = reader.readISZ(readGclSpec _)
      return GclIntegration(specs)
    }

    def readGclCaseStatement(): GclCaseStatement = {
      val r = readGclCaseStatementT(F)
      return r
    }

    def readGclCaseStatementT(typeParsed: B): GclCaseStatement = {
      if (!typeParsed) {
        reader.expectZ(Constants.GclCaseStatement)
      }
      val id = reader.readString()
      val descriptor = reader.readOption(reader.readString _)
      val assumes = read_langastExp()
      val guarantees = read_langastExp()
      val posOpt = reader.readOption(reader.readPosition _)
      return GclCaseStatement(id, descriptor, assumes, guarantees, posOpt)
    }

    def readGclInitialize(): GclInitialize = {
      val r = readGclInitializeT(F)
      return r
    }

    def readGclInitializeT(typeParsed: B): GclInitialize = {
      if (!typeParsed) {
        reader.expectZ(Constants.GclInitialize)
      }
      val modifies = reader.readISZ(read_langastExp _)
      val guarantees = reader.readISZ(readGclGuarantee _)
      return GclInitialize(modifies, guarantees)
    }

    def readGclCompute(): GclCompute = {
      val r = readGclComputeT(F)
      return r
    }

    def readGclComputeT(typeParsed: B): GclCompute = {
      if (!typeParsed) {
        reader.expectZ(Constants.GclCompute)
      }
      val modifies = reader.readISZ(read_langastExp _)
      val specs = reader.readISZ(readGclComputeSpec _)
      val cases = reader.readISZ(readGclCaseStatement _)
      val handlers = reader.readISZ(readGclHandle _)
      return GclCompute(modifies, specs, cases, handlers)
    }

    def readGclHandle(): GclHandle = {
      val r = readGclHandleT(F)
      return r
    }

    def readGclHandleT(typeParsed: B): GclHandle = {
      if (!typeParsed) {
        reader.expectZ(Constants.GclHandle)
      }
      val port = read_langastExp()
      val modifies = reader.readISZ(read_langastExp _)
      val guarantees = reader.readISZ(readGclGuarantee _)
      return GclHandle(port, modifies, guarantees)
    }

    def readGclTODO(): GclTODO = {
      val r = readGclTODOT(F)
      return r
    }

    def readGclTODOT(typeParsed: B): GclTODO = {
      if (!typeParsed) {
        reader.expectZ(Constants.GclTODO)
      }
      return GclTODO()
    }

    def readGclLib(): GclLib = {
      val r = readGclLibT(F)
      return r
    }

    def readGclLibT(typeParsed: B): GclLib = {
      if (!typeParsed) {
        reader.expectZ(Constants.GclLib)
      }
      val containingPackage = readName()
      val methods = reader.readISZ(readGclMethod _)
      return GclLib(containingPackage, methods)
    }

    def readSmfAnnex(): SmfAnnex = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.SmfClause => val r = readSmfClauseT(T); return r
        case Constants.SmfClassification => val r = readSmfClassificationT(T); return r
        case Constants.SmfDeclass => val r = readSmfDeclassT(T); return r
        case Constants.SmfType => val r = readSmfTypeT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of SmfAnnex.")
          val r = readSmfTypeT(T)
          return r
      }
    }

    def readSmfLib(): SmfLib = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.SmfLibrary => val r = readSmfLibraryT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of SmfLib.")
          val r = readSmfLibraryT(T)
          return r
      }
    }

    def readSmfClause(): SmfClause = {
      val r = readSmfClauseT(F)
      return r
    }

    def readSmfClauseT(typeParsed: B): SmfClause = {
      if (!typeParsed) {
        reader.expectZ(Constants.SmfClause)
      }
      val classification = reader.readISZ(readSmfClassification _)
      val declass = reader.readISZ(readSmfDeclass _)
      return SmfClause(classification, declass)
    }

    def readSmfClassification(): SmfClassification = {
      val r = readSmfClassificationT(F)
      return r
    }

    def readSmfClassificationT(typeParsed: B): SmfClassification = {
      if (!typeParsed) {
        reader.expectZ(Constants.SmfClassification)
      }
      val portName = readName()
      val typeName = readName()
      return SmfClassification(portName, typeName)
    }

    def readSmfDeclass(): SmfDeclass = {
      val r = readSmfDeclassT(F)
      return r
    }

    def readSmfDeclassT(typeParsed: B): SmfDeclass = {
      if (!typeParsed) {
        reader.expectZ(Constants.SmfDeclass)
      }
      val flowName = readName()
      val srcType = reader.readOption(readName _)
      val snkType = readName()
      return SmfDeclass(flowName, srcType, snkType)
    }

    def readSmfLibrary(): SmfLibrary = {
      val r = readSmfLibraryT(F)
      return r
    }

    def readSmfLibraryT(typeParsed: B): SmfLibrary = {
      if (!typeParsed) {
        reader.expectZ(Constants.SmfLibrary)
      }
      val types = reader.readISZ(readSmfType _)
      return SmfLibrary(types)
    }

    def readSmfType(): SmfType = {
      val r = readSmfTypeT(F)
      return r
    }

    def readSmfTypeT(typeParsed: B): SmfType = {
      if (!typeParsed) {
        reader.expectZ(Constants.SmfType)
      }
      val typeName = readName()
      val parentType = reader.readISZ(readName _)
      return SmfType(typeName, parentType)
    }

    def read_langastTopUnit(): org.sireum.lang.ast.TopUnit = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants._langastTopUnitProgram => val r = read_langastTopUnitProgramT(T); return r
        case Constants._langastTopUnitSequentUnit => val r = read_langastTopUnitSequentUnitT(T); return r
        case Constants._langastTopUnitTruthTableUnit => val r = read_langastTopUnitTruthTableUnitT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of org.sireum.lang.ast.TopUnit.")
          val r = read_langastTopUnitTruthTableUnitT(T)
          return r
      }
    }

    def read_langastTopUnitProgram(): org.sireum.lang.ast.TopUnit.Program = {
      val r = read_langastTopUnitProgramT(F)
      return r
    }

    def read_langastTopUnitProgramT(typeParsed: B): org.sireum.lang.ast.TopUnit.Program = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastTopUnitProgram)
      }
      val fileUriOpt = reader.readOption(reader.readString _)
      val packageName = read_langastName()
      val body = read_langastBody()
      return org.sireum.lang.ast.TopUnit.Program(fileUriOpt, packageName, body)
    }

    def read_langastTopUnitSequentUnit(): org.sireum.lang.ast.TopUnit.SequentUnit = {
      val r = read_langastTopUnitSequentUnitT(F)
      return r
    }

    def read_langastTopUnitSequentUnitT(typeParsed: B): org.sireum.lang.ast.TopUnit.SequentUnit = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastTopUnitSequentUnit)
      }
      val fileUriOpt = reader.readOption(reader.readString _)
      val sequent = read_langastSequent()
      return org.sireum.lang.ast.TopUnit.SequentUnit(fileUriOpt, sequent)
    }

    def read_langastTopUnitTruthTableUnit(): org.sireum.lang.ast.TopUnit.TruthTableUnit = {
      val r = read_langastTopUnitTruthTableUnitT(F)
      return r
    }

    def read_langastTopUnitTruthTableUnitT(typeParsed: B): org.sireum.lang.ast.TopUnit.TruthTableUnit = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastTopUnitTruthTableUnit)
      }
      val fileUriOpt = reader.readOption(reader.readString _)
      val stars = reader.readISZ(reader.readPosition _)
      val vars = reader.readISZ(read_langastId _)
      val separator = reader.readPosition()
      val isSequent = reader.readB()
      val sequent = read_langastSequent()
      val rows = reader.readISZ(read_langastTruthTableRow _)
      val conclusionOpt = reader.readOption(read_langastTruthTableConclusion _)
      return org.sireum.lang.ast.TopUnit.TruthTableUnit(fileUriOpt, stars, vars, separator, isSequent, sequent, rows, conclusionOpt)
    }

    def read_langastStmt(): org.sireum.lang.ast.Stmt = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants._langastStmtImport => val r = read_langastStmtImportT(T); return r
        case Constants._langastStmtVar => val r = read_langastStmtVarT(T); return r
        case Constants._langastStmtVarPattern => val r = read_langastStmtVarPatternT(T); return r
        case Constants._langastStmtSpecVar => val r = read_langastStmtSpecVarT(T); return r
        case Constants._langastStmtMethod => val r = read_langastStmtMethodT(T); return r
        case Constants._langastStmtExtMethod => val r = read_langastStmtExtMethodT(T); return r
        case Constants._langastStmtJustMethod => val r = read_langastStmtJustMethodT(T); return r
        case Constants._langastStmtSpecMethod => val r = read_langastStmtSpecMethodT(T); return r
        case Constants._langastStmtEnum => val r = read_langastStmtEnumT(T); return r
        case Constants._langastStmtSubZ => val r = read_langastStmtSubZT(T); return r
        case Constants._langastStmtObject => val r = read_langastStmtObjectT(T); return r
        case Constants._langastStmtSig => val r = read_langastStmtSigT(T); return r
        case Constants._langastStmtAdt => val r = read_langastStmtAdtT(T); return r
        case Constants._langastStmtTypeAlias => val r = read_langastStmtTypeAliasT(T); return r
        case Constants._langastStmtAssign => val r = read_langastStmtAssignT(T); return r
        case Constants._langastStmtBlock => val r = read_langastStmtBlockT(T); return r
        case Constants._langastStmtIf => val r = read_langastStmtIfT(T); return r
        case Constants._langastStmtMatch => val r = read_langastStmtMatchT(T); return r
        case Constants._langastStmtWhile => val r = read_langastStmtWhileT(T); return r
        case Constants._langastStmtDoWhile => val r = read_langastStmtDoWhileT(T); return r
        case Constants._langastStmtFor => val r = read_langastStmtForT(T); return r
        case Constants._langastStmtReturn => val r = read_langastStmtReturnT(T); return r
        case Constants._langastStmtExpr => val r = read_langastStmtExprT(T); return r
        case Constants._langastStmtFact => val r = read_langastStmtFactT(T); return r
        case Constants._langastStmtInv => val r = read_langastStmtInvT(T); return r
        case Constants._langastStmtTheorem => val r = read_langastStmtTheoremT(T); return r
        case Constants._langastStmtDataRefinement => val r = read_langastStmtDataRefinementT(T); return r
        case Constants._langastStmtSpecLabel => val r = read_langastStmtSpecLabelT(T); return r
        case Constants._langastStmtSpecBlock => val r = read_langastStmtSpecBlockT(T); return r
        case Constants._langastStmtDeduceSequent => val r = read_langastStmtDeduceSequentT(T); return r
        case Constants._langastStmtDeduceSteps => val r = read_langastStmtDeduceStepsT(T); return r
        case Constants._langastStmtHavoc => val r = read_langastStmtHavocT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of org.sireum.lang.ast.Stmt.")
          val r = read_langastStmtHavocT(T)
          return r
      }
    }

    def read_langastHasModifies(): org.sireum.lang.ast.HasModifies = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants._langastLoopContract => val r = read_langastLoopContractT(T); return r
        case Constants._langastMethodContractSimple => val r = read_langastMethodContractSimpleT(T); return r
        case Constants._langastMethodContractCases => val r = read_langastMethodContractCasesT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of org.sireum.lang.ast.HasModifies.")
          val r = read_langastMethodContractCasesT(T)
          return r
      }
    }

    def read_langastLoopContract(): org.sireum.lang.ast.LoopContract = {
      val r = read_langastLoopContractT(F)
      return r
    }

    def read_langastLoopContractT(typeParsed: B): org.sireum.lang.ast.LoopContract = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastLoopContract)
      }
      val invariants = reader.readISZ(read_langastExp _)
      val modifies = reader.readISZ(read_langastExpRef _)
      val maxItOpt = reader.readOption(read_langastExpLitZ _)
      return org.sireum.lang.ast.LoopContract(invariants, modifies, maxItOpt)
    }

    def read_langastStmtImport(): org.sireum.lang.ast.Stmt.Import = {
      val r = read_langastStmtImportT(F)
      return r
    }

    def read_langastStmtImportT(typeParsed: B): org.sireum.lang.ast.Stmt.Import = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastStmtImport)
      }
      val importers = reader.readISZ(read_langastStmtImportImporter _)
      val attr = read_langastAttr()
      return org.sireum.lang.ast.Stmt.Import(importers, attr)
    }

    def read_langastStmtImportImporter(): org.sireum.lang.ast.Stmt.Import.Importer = {
      val r = read_langastStmtImportImporterT(F)
      return r
    }

    def read_langastStmtImportImporterT(typeParsed: B): org.sireum.lang.ast.Stmt.Import.Importer = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastStmtImportImporter)
      }
      val name = read_langastName()
      val selectorOpt = reader.readOption(read_langastStmtImportSelector _)
      return org.sireum.lang.ast.Stmt.Import.Importer(name, selectorOpt)
    }

    def read_langastStmtImportSelector(): org.sireum.lang.ast.Stmt.Import.Selector = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants._langastStmtImportMultiSelector => val r = read_langastStmtImportMultiSelectorT(T); return r
        case Constants._langastStmtImportWildcardSelector => val r = read_langastStmtImportWildcardSelectorT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of org.sireum.lang.ast.Stmt.Import.Selector.")
          val r = read_langastStmtImportWildcardSelectorT(T)
          return r
      }
    }

    def read_langastStmtImportMultiSelector(): org.sireum.lang.ast.Stmt.Import.MultiSelector = {
      val r = read_langastStmtImportMultiSelectorT(F)
      return r
    }

    def read_langastStmtImportMultiSelectorT(typeParsed: B): org.sireum.lang.ast.Stmt.Import.MultiSelector = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastStmtImportMultiSelector)
      }
      val selectors = reader.readISZ(read_langastStmtImportNamedSelector _)
      return org.sireum.lang.ast.Stmt.Import.MultiSelector(selectors)
    }

    def read_langastStmtImportWildcardSelector(): org.sireum.lang.ast.Stmt.Import.WildcardSelector = {
      val r = read_langastStmtImportWildcardSelectorT(F)
      return r
    }

    def read_langastStmtImportWildcardSelectorT(typeParsed: B): org.sireum.lang.ast.Stmt.Import.WildcardSelector = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastStmtImportWildcardSelector)
      }
      return org.sireum.lang.ast.Stmt.Import.WildcardSelector()
    }

    def read_langastStmtImportNamedSelector(): org.sireum.lang.ast.Stmt.Import.NamedSelector = {
      val r = read_langastStmtImportNamedSelectorT(F)
      return r
    }

    def read_langastStmtImportNamedSelectorT(typeParsed: B): org.sireum.lang.ast.Stmt.Import.NamedSelector = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastStmtImportNamedSelector)
      }
      val from = read_langastId()
      val to = read_langastId()
      return org.sireum.lang.ast.Stmt.Import.NamedSelector(from, to)
    }

    def read_langastStmtVar(): org.sireum.lang.ast.Stmt.Var = {
      val r = read_langastStmtVarT(F)
      return r
    }

    def read_langastStmtVarT(typeParsed: B): org.sireum.lang.ast.Stmt.Var = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastStmtVar)
      }
      val isSpec = reader.readB()
      val isVal = reader.readB()
      val id = read_langastId()
      val tipeOpt = reader.readOption(read_langastType _)
      val initOpt = reader.readOption(read_langastAssignExp _)
      val attr = read_langastResolvedAttr()
      return org.sireum.lang.ast.Stmt.Var(isSpec, isVal, id, tipeOpt, initOpt, attr)
    }

    def read_langastStmtVarPattern(): org.sireum.lang.ast.Stmt.VarPattern = {
      val r = read_langastStmtVarPatternT(F)
      return r
    }

    def read_langastStmtVarPatternT(typeParsed: B): org.sireum.lang.ast.Stmt.VarPattern = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastStmtVarPattern)
      }
      val isSpec = reader.readB()
      val isVal = reader.readB()
      val pattern = read_langastPattern()
      val tipeOpt = reader.readOption(read_langastType _)
      val init = read_langastAssignExp()
      val attr = read_langastAttr()
      return org.sireum.lang.ast.Stmt.VarPattern(isSpec, isVal, pattern, tipeOpt, init, attr)
    }

    def read_langastStmtSpecVar(): org.sireum.lang.ast.Stmt.SpecVar = {
      val r = read_langastStmtSpecVarT(F)
      return r
    }

    def read_langastStmtSpecVarT(typeParsed: B): org.sireum.lang.ast.Stmt.SpecVar = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastStmtSpecVar)
      }
      val isVal = reader.readB()
      val id = read_langastId()
      val tipe = read_langastType()
      val attr = read_langastResolvedAttr()
      return org.sireum.lang.ast.Stmt.SpecVar(isVal, id, tipe, attr)
    }

    def read_langastStmtMethod(): org.sireum.lang.ast.Stmt.Method = {
      val r = read_langastStmtMethodT(F)
      return r
    }

    def read_langastStmtMethodT(typeParsed: B): org.sireum.lang.ast.Stmt.Method = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastStmtMethod)
      }
      val typeChecked = reader.readB()
      val purity = read_langastPurityType()
      val hasOverride = reader.readB()
      val isHelper = reader.readB()
      val sig = read_langastMethodSig()
      val mcontract = read_langastMethodContract()
      val bodyOpt = reader.readOption(read_langastBody _)
      val attr = read_langastResolvedAttr()
      return org.sireum.lang.ast.Stmt.Method(typeChecked, purity, hasOverride, isHelper, sig, mcontract, bodyOpt, attr)
    }

    def read_langastStmtExtMethod(): org.sireum.lang.ast.Stmt.ExtMethod = {
      val r = read_langastStmtExtMethodT(F)
      return r
    }

    def read_langastStmtExtMethodT(typeParsed: B): org.sireum.lang.ast.Stmt.ExtMethod = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastStmtExtMethod)
      }
      val isPure = reader.readB()
      val sig = read_langastMethodSig()
      val contract = read_langastMethodContract()
      val attr = read_langastResolvedAttr()
      return org.sireum.lang.ast.Stmt.ExtMethod(isPure, sig, contract, attr)
    }

    def read_langastStmtJustMethod(): org.sireum.lang.ast.Stmt.JustMethod = {
      val r = read_langastStmtJustMethodT(F)
      return r
    }

    def read_langastStmtJustMethodT(typeParsed: B): org.sireum.lang.ast.Stmt.JustMethod = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastStmtJustMethod)
      }
      val etaOpt = reader.readOption(read_langastExpLitString _)
      val sig = read_langastMethodSig()
      val attr = read_langastResolvedAttr()
      return org.sireum.lang.ast.Stmt.JustMethod(etaOpt, sig, attr)
    }

    def read_langastStmtSpecMethod(): org.sireum.lang.ast.Stmt.SpecMethod = {
      val r = read_langastStmtSpecMethodT(F)
      return r
    }

    def read_langastStmtSpecMethodT(typeParsed: B): org.sireum.lang.ast.Stmt.SpecMethod = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastStmtSpecMethod)
      }
      val sig = read_langastMethodSig()
      val attr = read_langastResolvedAttr()
      return org.sireum.lang.ast.Stmt.SpecMethod(sig, attr)
    }

    def read_langastStmtEnum(): org.sireum.lang.ast.Stmt.Enum = {
      val r = read_langastStmtEnumT(F)
      return r
    }

    def read_langastStmtEnumT(typeParsed: B): org.sireum.lang.ast.Stmt.Enum = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastStmtEnum)
      }
      val id = read_langastId()
      val elements = reader.readISZ(read_langastId _)
      val attr = read_langastAttr()
      return org.sireum.lang.ast.Stmt.Enum(id, elements, attr)
    }

    def read_langastStmtSubZ(): org.sireum.lang.ast.Stmt.SubZ = {
      val r = read_langastStmtSubZT(F)
      return r
    }

    def read_langastStmtSubZT(typeParsed: B): org.sireum.lang.ast.Stmt.SubZ = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastStmtSubZ)
      }
      val id = read_langastId()
      val isSigned = reader.readB()
      val isBitVector = reader.readB()
      val isWrapped = reader.readB()
      val hasMin = reader.readB()
      val hasMax = reader.readB()
      val bitWidth = reader.readZ()
      val min = reader.readZ()
      val max = reader.readZ()
      val isIndex = reader.readB()
      val index = reader.readZ()
      val attr = read_langastAttr()
      return org.sireum.lang.ast.Stmt.SubZ(id, isSigned, isBitVector, isWrapped, hasMin, hasMax, bitWidth, min, max, isIndex, index, attr)
    }

    def read_langastStmtObject(): org.sireum.lang.ast.Stmt.Object = {
      val r = read_langastStmtObjectT(F)
      return r
    }

    def read_langastStmtObjectT(typeParsed: B): org.sireum.lang.ast.Stmt.Object = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastStmtObject)
      }
      val isApp = reader.readB()
      val extNameOpt = reader.readOption(reader.readString _)
      val id = read_langastId()
      val stmts = reader.readISZ(read_langastStmt _)
      val attr = read_langastAttr()
      return org.sireum.lang.ast.Stmt.Object(isApp, extNameOpt, id, stmts, attr)
    }

    def read_langastStmtSig(): org.sireum.lang.ast.Stmt.Sig = {
      val r = read_langastStmtSigT(F)
      return r
    }

    def read_langastStmtSigT(typeParsed: B): org.sireum.lang.ast.Stmt.Sig = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastStmtSig)
      }
      val isImmutable = reader.readB()
      val isExt = reader.readB()
      val id = read_langastId()
      val typeParams = reader.readISZ(read_langastTypeParam _)
      val parents = reader.readISZ(read_langastTypeNamed _)
      val stmts = reader.readISZ(read_langastStmt _)
      val attr = read_langastAttr()
      return org.sireum.lang.ast.Stmt.Sig(isImmutable, isExt, id, typeParams, parents, stmts, attr)
    }

    def read_langastStmtAdt(): org.sireum.lang.ast.Stmt.Adt = {
      val r = read_langastStmtAdtT(F)
      return r
    }

    def read_langastStmtAdtT(typeParsed: B): org.sireum.lang.ast.Stmt.Adt = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastStmtAdt)
      }
      val isRoot = reader.readB()
      val isDatatype = reader.readB()
      val id = read_langastId()
      val typeParams = reader.readISZ(read_langastTypeParam _)
      val params = reader.readISZ(read_langastAdtParam _)
      val parents = reader.readISZ(read_langastTypeNamed _)
      val stmts = reader.readISZ(read_langastStmt _)
      val attr = read_langastAttr()
      return org.sireum.lang.ast.Stmt.Adt(isRoot, isDatatype, id, typeParams, params, parents, stmts, attr)
    }

    def read_langastStmtTypeAlias(): org.sireum.lang.ast.Stmt.TypeAlias = {
      val r = read_langastStmtTypeAliasT(F)
      return r
    }

    def read_langastStmtTypeAliasT(typeParsed: B): org.sireum.lang.ast.Stmt.TypeAlias = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastStmtTypeAlias)
      }
      val id = read_langastId()
      val typeParams = reader.readISZ(read_langastTypeParam _)
      val tipe = read_langastType()
      val attr = read_langastAttr()
      return org.sireum.lang.ast.Stmt.TypeAlias(id, typeParams, tipe, attr)
    }

    def read_langastStmtAssign(): org.sireum.lang.ast.Stmt.Assign = {
      val r = read_langastStmtAssignT(F)
      return r
    }

    def read_langastStmtAssignT(typeParsed: B): org.sireum.lang.ast.Stmt.Assign = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastStmtAssign)
      }
      val lhs = read_langastExp()
      val rhs = read_langastAssignExp()
      val attr = read_langastAttr()
      return org.sireum.lang.ast.Stmt.Assign(lhs, rhs, attr)
    }

    def read_langastStmtBlock(): org.sireum.lang.ast.Stmt.Block = {
      val r = read_langastStmtBlockT(F)
      return r
    }

    def read_langastStmtBlockT(typeParsed: B): org.sireum.lang.ast.Stmt.Block = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastStmtBlock)
      }
      val body = read_langastBody()
      val attr = read_langastAttr()
      return org.sireum.lang.ast.Stmt.Block(body, attr)
    }

    def read_langastStmtIf(): org.sireum.lang.ast.Stmt.If = {
      val r = read_langastStmtIfT(F)
      return r
    }

    def read_langastStmtIfT(typeParsed: B): org.sireum.lang.ast.Stmt.If = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastStmtIf)
      }
      val cond = read_langastExp()
      val thenBody = read_langastBody()
      val elseBody = read_langastBody()
      val attr = read_langastAttr()
      return org.sireum.lang.ast.Stmt.If(cond, thenBody, elseBody, attr)
    }

    def read_langastStmtMatch(): org.sireum.lang.ast.Stmt.Match = {
      val r = read_langastStmtMatchT(F)
      return r
    }

    def read_langastStmtMatchT(typeParsed: B): org.sireum.lang.ast.Stmt.Match = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastStmtMatch)
      }
      val exp = read_langastExp()
      val cases = reader.readISZ(read_langastCase _)
      val attr = read_langastAttr()
      return org.sireum.lang.ast.Stmt.Match(exp, cases, attr)
    }

    def read_langastStmtWhile(): org.sireum.lang.ast.Stmt.While = {
      val r = read_langastStmtWhileT(F)
      return r
    }

    def read_langastStmtWhileT(typeParsed: B): org.sireum.lang.ast.Stmt.While = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastStmtWhile)
      }
      val context = reader.readISZ(reader.readString _)
      val cond = read_langastExp()
      val contract = read_langastLoopContract()
      val body = read_langastBody()
      val attr = read_langastAttr()
      return org.sireum.lang.ast.Stmt.While(context, cond, contract, body, attr)
    }

    def read_langastStmtDoWhile(): org.sireum.lang.ast.Stmt.DoWhile = {
      val r = read_langastStmtDoWhileT(F)
      return r
    }

    def read_langastStmtDoWhileT(typeParsed: B): org.sireum.lang.ast.Stmt.DoWhile = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastStmtDoWhile)
      }
      val context = reader.readISZ(reader.readString _)
      val cond = read_langastExp()
      val contract = read_langastLoopContract()
      val body = read_langastBody()
      val attr = read_langastAttr()
      return org.sireum.lang.ast.Stmt.DoWhile(context, cond, contract, body, attr)
    }

    def read_langastStmtFor(): org.sireum.lang.ast.Stmt.For = {
      val r = read_langastStmtForT(F)
      return r
    }

    def read_langastStmtForT(typeParsed: B): org.sireum.lang.ast.Stmt.For = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastStmtFor)
      }
      val context = reader.readISZ(reader.readString _)
      val enumGens = reader.readISZ(read_langastEnumGenFor _)
      val body = read_langastBody()
      val attr = read_langastAttr()
      return org.sireum.lang.ast.Stmt.For(context, enumGens, body, attr)
    }

    def read_langastStmtReturn(): org.sireum.lang.ast.Stmt.Return = {
      val r = read_langastStmtReturnT(F)
      return r
    }

    def read_langastStmtReturnT(typeParsed: B): org.sireum.lang.ast.Stmt.Return = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastStmtReturn)
      }
      val expOpt = reader.readOption(read_langastExp _)
      val attr = read_langastTypedAttr()
      return org.sireum.lang.ast.Stmt.Return(expOpt, attr)
    }

    def read_langastStmtExpr(): org.sireum.lang.ast.Stmt.Expr = {
      val r = read_langastStmtExprT(F)
      return r
    }

    def read_langastStmtExprT(typeParsed: B): org.sireum.lang.ast.Stmt.Expr = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastStmtExpr)
      }
      val exp = read_langastExp()
      val attr = read_langastTypedAttr()
      return org.sireum.lang.ast.Stmt.Expr(exp, attr)
    }

    def read_langastStmtSpec(): org.sireum.lang.ast.Stmt.Spec = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants._langastStmtFact => val r = read_langastStmtFactT(T); return r
        case Constants._langastStmtInv => val r = read_langastStmtInvT(T); return r
        case Constants._langastStmtTheorem => val r = read_langastStmtTheoremT(T); return r
        case Constants._langastStmtDataRefinement => val r = read_langastStmtDataRefinementT(T); return r
        case Constants._langastStmtSpecLabel => val r = read_langastStmtSpecLabelT(T); return r
        case Constants._langastStmtSpecBlock => val r = read_langastStmtSpecBlockT(T); return r
        case Constants._langastStmtDeduceSequent => val r = read_langastStmtDeduceSequentT(T); return r
        case Constants._langastStmtDeduceSteps => val r = read_langastStmtDeduceStepsT(T); return r
        case Constants._langastStmtHavoc => val r = read_langastStmtHavocT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of org.sireum.lang.ast.Stmt.Spec.")
          val r = read_langastStmtHavocT(T)
          return r
      }
    }

    def read_langastStmtFact(): org.sireum.lang.ast.Stmt.Fact = {
      val r = read_langastStmtFactT(F)
      return r
    }

    def read_langastStmtFactT(typeParsed: B): org.sireum.lang.ast.Stmt.Fact = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastStmtFact)
      }
      val id = read_langastId()
      val typeParams = reader.readISZ(read_langastTypeParam _)
      val descOpt = reader.readOption(read_langastExpLitString _)
      val claims = reader.readISZ(read_langastExp _)
      val isFun = reader.readB()
      val attr = read_langastResolvedAttr()
      return org.sireum.lang.ast.Stmt.Fact(id, typeParams, descOpt, claims, isFun, attr)
    }

    def read_langastStmtInv(): org.sireum.lang.ast.Stmt.Inv = {
      val r = read_langastStmtInvT(F)
      return r
    }

    def read_langastStmtInvT(typeParsed: B): org.sireum.lang.ast.Stmt.Inv = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastStmtInv)
      }
      val id = read_langastId()
      val claims = reader.readISZ(read_langastExp _)
      val attr = read_langastResolvedAttr()
      return org.sireum.lang.ast.Stmt.Inv(id, claims, attr)
    }

    def read_langastStmtTheorem(): org.sireum.lang.ast.Stmt.Theorem = {
      val r = read_langastStmtTheoremT(F)
      return r
    }

    def read_langastStmtTheoremT(typeParsed: B): org.sireum.lang.ast.Stmt.Theorem = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastStmtTheorem)
      }
      val isLemma = reader.readB()
      val id = read_langastId()
      val typeParams = reader.readISZ(read_langastTypeParam _)
      val descOpt = reader.readOption(read_langastExpLitString _)
      val claim = read_langastExp()
      val isFun = reader.readB()
      val proof = read_langastProofAst()
      val attr = read_langastResolvedAttr()
      return org.sireum.lang.ast.Stmt.Theorem(isLemma, id, typeParams, descOpt, claim, isFun, proof, attr)
    }

    def read_langastStmtDataRefinement(): org.sireum.lang.ast.Stmt.DataRefinement = {
      val r = read_langastStmtDataRefinementT(F)
      return r
    }

    def read_langastStmtDataRefinementT(typeParsed: B): org.sireum.lang.ast.Stmt.DataRefinement = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastStmtDataRefinement)
      }
      val rep = read_langastExpIdent()
      val refs = reader.readISZ(read_langastExpIdent _)
      val claims = reader.readISZ(read_langastExp _)
      val attr = read_langastAttr()
      return org.sireum.lang.ast.Stmt.DataRefinement(rep, refs, claims, attr)
    }

    def read_langastStmtSpecLabel(): org.sireum.lang.ast.Stmt.SpecLabel = {
      val r = read_langastStmtSpecLabelT(F)
      return r
    }

    def read_langastStmtSpecLabelT(typeParsed: B): org.sireum.lang.ast.Stmt.SpecLabel = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastStmtSpecLabel)
      }
      val id = read_langastId()
      return org.sireum.lang.ast.Stmt.SpecLabel(id)
    }

    def read_langastStmtSpecBlock(): org.sireum.lang.ast.Stmt.SpecBlock = {
      val r = read_langastStmtSpecBlockT(F)
      return r
    }

    def read_langastStmtSpecBlockT(typeParsed: B): org.sireum.lang.ast.Stmt.SpecBlock = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastStmtSpecBlock)
      }
      val block = read_langastStmtBlock()
      return org.sireum.lang.ast.Stmt.SpecBlock(block)
    }

    def read_langastStmtDeduceSequent(): org.sireum.lang.ast.Stmt.DeduceSequent = {
      val r = read_langastStmtDeduceSequentT(F)
      return r
    }

    def read_langastStmtDeduceSequentT(typeParsed: B): org.sireum.lang.ast.Stmt.DeduceSequent = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastStmtDeduceSequent)
      }
      val justOpt = reader.readOption(read_langastExpLitString _)
      val sequents = reader.readISZ(read_langastSequent _)
      val attr = read_langastAttr()
      return org.sireum.lang.ast.Stmt.DeduceSequent(justOpt, sequents, attr)
    }

    def read_langastStmtDeduceSteps(): org.sireum.lang.ast.Stmt.DeduceSteps = {
      val r = read_langastStmtDeduceStepsT(F)
      return r
    }

    def read_langastStmtDeduceStepsT(typeParsed: B): org.sireum.lang.ast.Stmt.DeduceSteps = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastStmtDeduceSteps)
      }
      val steps = reader.readISZ(read_langastProofAstStep _)
      val attr = read_langastAttr()
      return org.sireum.lang.ast.Stmt.DeduceSteps(steps, attr)
    }

    def read_langastStmtHavoc(): org.sireum.lang.ast.Stmt.Havoc = {
      val r = read_langastStmtHavocT(F)
      return r
    }

    def read_langastStmtHavocT(typeParsed: B): org.sireum.lang.ast.Stmt.Havoc = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastStmtHavoc)
      }
      val args = reader.readISZ(read_langastExpRef _)
      val attr = read_langastAttr()
      return org.sireum.lang.ast.Stmt.Havoc(args, attr)
    }

    def read_langastMethodContract(): org.sireum.lang.ast.MethodContract = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants._langastMethodContractSimple => val r = read_langastMethodContractSimpleT(T); return r
        case Constants._langastMethodContractCases => val r = read_langastMethodContractCasesT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of org.sireum.lang.ast.MethodContract.")
          val r = read_langastMethodContractCasesT(T)
          return r
      }
    }

    def read_langastMethodContractAccesses(): org.sireum.lang.ast.MethodContract.Accesses = {
      val r = read_langastMethodContractAccessesT(F)
      return r
    }

    def read_langastMethodContractAccessesT(typeParsed: B): org.sireum.lang.ast.MethodContract.Accesses = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastMethodContractAccesses)
      }
      val refs = reader.readISZ(read_langastExpRef _)
      val attr = read_langastAttr()
      return org.sireum.lang.ast.MethodContract.Accesses(refs, attr)
    }

    def read_langastMethodContractClaims(): org.sireum.lang.ast.MethodContract.Claims = {
      val r = read_langastMethodContractClaimsT(F)
      return r
    }

    def read_langastMethodContractClaimsT(typeParsed: B): org.sireum.lang.ast.MethodContract.Claims = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastMethodContractClaims)
      }
      val claims = reader.readISZ(read_langastExp _)
      val attr = read_langastAttr()
      return org.sireum.lang.ast.MethodContract.Claims(claims, attr)
    }

    def read_langastMethodContractSimple(): org.sireum.lang.ast.MethodContract.Simple = {
      val r = read_langastMethodContractSimpleT(F)
      return r
    }

    def read_langastMethodContractSimpleT(typeParsed: B): org.sireum.lang.ast.MethodContract.Simple = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastMethodContractSimple)
      }
      val readsClause = read_langastMethodContractAccesses()
      val requiresClause = read_langastMethodContractClaims()
      val modifiesClause = read_langastMethodContractAccesses()
      val ensuresClause = read_langastMethodContractClaims()
      val infoFlowsClause = read_langastMethodContractInfoFlows()
      val attr = read_langastAttr()
      return org.sireum.lang.ast.MethodContract.Simple(readsClause, requiresClause, modifiesClause, ensuresClause, infoFlowsClause, attr)
    }

    def read_langastMethodContractCases(): org.sireum.lang.ast.MethodContract.Cases = {
      val r = read_langastMethodContractCasesT(F)
      return r
    }

    def read_langastMethodContractCasesT(typeParsed: B): org.sireum.lang.ast.MethodContract.Cases = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastMethodContractCases)
      }
      val readsClause = read_langastMethodContractAccesses()
      val modifiesClause = read_langastMethodContractAccesses()
      val cases = reader.readISZ(read_langastMethodContractCase _)
      val attr = read_langastAttr()
      return org.sireum.lang.ast.MethodContract.Cases(readsClause, modifiesClause, cases, attr)
    }

    def read_langastMethodContractCase(): org.sireum.lang.ast.MethodContract.Case = {
      val r = read_langastMethodContractCaseT(F)
      return r
    }

    def read_langastMethodContractCaseT(typeParsed: B): org.sireum.lang.ast.MethodContract.Case = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastMethodContractCase)
      }
      val label = read_langastExpLitString()
      val requiresClause = read_langastMethodContractClaims()
      val ensuresClause = read_langastMethodContractClaims()
      return org.sireum.lang.ast.MethodContract.Case(label, requiresClause, ensuresClause)
    }

    def read_langastMethodContractInfoFlows(): org.sireum.lang.ast.MethodContract.InfoFlows = {
      val r = read_langastMethodContractInfoFlowsT(F)
      return r
    }

    def read_langastMethodContractInfoFlowsT(typeParsed: B): org.sireum.lang.ast.MethodContract.InfoFlows = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastMethodContractInfoFlows)
      }
      val flows = reader.readISZ(read_langastMethodContractInfoFlow _)
      val attr = read_langastAttr()
      return org.sireum.lang.ast.MethodContract.InfoFlows(flows, attr)
    }

    def read_langastMethodContractInfoFlow(): org.sireum.lang.ast.MethodContract.InfoFlow = {
      val r = read_langastMethodContractInfoFlowT(F)
      return r
    }

    def read_langastMethodContractInfoFlowT(typeParsed: B): org.sireum.lang.ast.MethodContract.InfoFlow = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastMethodContractInfoFlow)
      }
      val label = read_langastExpLitString()
      val requiresClause = read_langastMethodContractClaims()
      val inAgreeClause = read_langastMethodContractClaims()
      val outAgreeClause = read_langastMethodContractClaims()
      return org.sireum.lang.ast.MethodContract.InfoFlow(label, requiresClause, inAgreeClause, outAgreeClause)
    }

    def read_langastSequent(): org.sireum.lang.ast.Sequent = {
      val r = read_langastSequentT(F)
      return r
    }

    def read_langastSequentT(typeParsed: B): org.sireum.lang.ast.Sequent = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastSequent)
      }
      val premises = reader.readISZ(read_langastExp _)
      val conclusion = read_langastExp()
      val steps = reader.readISZ(read_langastProofAstStep _)
      val attr = read_langastAttr()
      return org.sireum.lang.ast.Sequent(premises, conclusion, steps, attr)
    }

    def read_langastProofAst(): org.sireum.lang.ast.ProofAst = {
      val r = read_langastProofAstT(F)
      return r
    }

    def read_langastProofAstT(typeParsed: B): org.sireum.lang.ast.ProofAst = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastProofAst)
      }
      val steps = reader.readISZ(read_langastProofAstStep _)
      val attr = read_langastAttr()
      return org.sireum.lang.ast.ProofAst(steps, attr)
    }

    def read_langastProofAstStep(): org.sireum.lang.ast.ProofAst.Step = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants._langastProofAstStepRegular => val r = read_langastProofAstStepRegularT(T); return r
        case Constants._langastProofAstStepAssume => val r = read_langastProofAstStepAssumeT(T); return r
        case Constants._langastProofAstStepAssert => val r = read_langastProofAstStepAssertT(T); return r
        case Constants._langastProofAstStepSubProof => val r = read_langastProofAstStepSubProofT(T); return r
        case Constants._langastProofAstStepLet => val r = read_langastProofAstStepLetT(T); return r
        case Constants._langastProofAstStepStructInduction => val r = read_langastProofAstStepStructInductionT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of org.sireum.lang.ast.ProofAst.Step.")
          val r = read_langastProofAstStepStructInductionT(T)
          return r
      }
    }

    def read_langastProofAstStepId(): org.sireum.lang.ast.ProofAst.StepId = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants._langastProofAstStepIdNum => val r = read_langastProofAstStepIdNumT(T); return r
        case Constants._langastProofAstStepIdStr => val r = read_langastProofAstStepIdStrT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of org.sireum.lang.ast.ProofAst.StepId.")
          val r = read_langastProofAstStepIdStrT(T)
          return r
      }
    }

    def read_langastProofAstStepIdNum(): org.sireum.lang.ast.ProofAst.StepId.Num = {
      val r = read_langastProofAstStepIdNumT(F)
      return r
    }

    def read_langastProofAstStepIdNumT(typeParsed: B): org.sireum.lang.ast.ProofAst.StepId.Num = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastProofAstStepIdNum)
      }
      val no = reader.readZ()
      val attr = read_langastAttr()
      return org.sireum.lang.ast.ProofAst.StepId.Num(no, attr)
    }

    def read_langastProofAstStepIdStr(): org.sireum.lang.ast.ProofAst.StepId.Str = {
      val r = read_langastProofAstStepIdStrT(F)
      return r
    }

    def read_langastProofAstStepIdStrT(typeParsed: B): org.sireum.lang.ast.ProofAst.StepId.Str = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastProofAstStepIdStr)
      }
      val value = reader.readString()
      val attr = read_langastAttr()
      return org.sireum.lang.ast.ProofAst.StepId.Str(value, attr)
    }

    def read_langastProofAstStepRegular(): org.sireum.lang.ast.ProofAst.Step.Regular = {
      val r = read_langastProofAstStepRegularT(F)
      return r
    }

    def read_langastProofAstStepRegularT(typeParsed: B): org.sireum.lang.ast.ProofAst.Step.Regular = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastProofAstStepRegular)
      }
      val id = read_langastProofAstStepId()
      val claim = read_langastExp()
      val just = read_langastProofAstStepJustification()
      return org.sireum.lang.ast.ProofAst.Step.Regular(id, claim, just)
    }

    def read_langastProofAstStepAssume(): org.sireum.lang.ast.ProofAst.Step.Assume = {
      val r = read_langastProofAstStepAssumeT(F)
      return r
    }

    def read_langastProofAstStepAssumeT(typeParsed: B): org.sireum.lang.ast.ProofAst.Step.Assume = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastProofAstStepAssume)
      }
      val id = read_langastProofAstStepId()
      val claim = read_langastExp()
      return org.sireum.lang.ast.ProofAst.Step.Assume(id, claim)
    }

    def read_langastProofAstStepAssert(): org.sireum.lang.ast.ProofAst.Step.Assert = {
      val r = read_langastProofAstStepAssertT(F)
      return r
    }

    def read_langastProofAstStepAssertT(typeParsed: B): org.sireum.lang.ast.ProofAst.Step.Assert = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastProofAstStepAssert)
      }
      val id = read_langastProofAstStepId()
      val claim = read_langastExp()
      val steps = reader.readISZ(read_langastProofAstStep _)
      return org.sireum.lang.ast.ProofAst.Step.Assert(id, claim, steps)
    }

    def read_langastProofAstStepSubProof(): org.sireum.lang.ast.ProofAst.Step.SubProof = {
      val r = read_langastProofAstStepSubProofT(F)
      return r
    }

    def read_langastProofAstStepSubProofT(typeParsed: B): org.sireum.lang.ast.ProofAst.Step.SubProof = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastProofAstStepSubProof)
      }
      val id = read_langastProofAstStepId()
      val steps = reader.readISZ(read_langastProofAstStep _)
      return org.sireum.lang.ast.ProofAst.Step.SubProof(id, steps)
    }

    def read_langastProofAstStepLet(): org.sireum.lang.ast.ProofAst.Step.Let = {
      val r = read_langastProofAstStepLetT(F)
      return r
    }

    def read_langastProofAstStepLetT(typeParsed: B): org.sireum.lang.ast.ProofAst.Step.Let = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastProofAstStepLet)
      }
      val id = read_langastProofAstStepId()
      val params = reader.readISZ(read_langastProofAstStepLetParam _)
      val steps = reader.readISZ(read_langastProofAstStep _)
      return org.sireum.lang.ast.ProofAst.Step.Let(id, params, steps)
    }

    def read_langastProofAstStepLetParam(): org.sireum.lang.ast.ProofAst.Step.Let.Param = {
      val r = read_langastProofAstStepLetParamT(F)
      return r
    }

    def read_langastProofAstStepLetParamT(typeParsed: B): org.sireum.lang.ast.ProofAst.Step.Let.Param = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastProofAstStepLetParam)
      }
      val id = read_langastId()
      val tipeOpt = reader.readOption(read_langastType _)
      return org.sireum.lang.ast.ProofAst.Step.Let.Param(id, tipeOpt)
    }

    def read_langastProofAstStepStructInduction(): org.sireum.lang.ast.ProofAst.Step.StructInduction = {
      val r = read_langastProofAstStepStructInductionT(F)
      return r
    }

    def read_langastProofAstStepStructInductionT(typeParsed: B): org.sireum.lang.ast.ProofAst.Step.StructInduction = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastProofAstStepStructInduction)
      }
      val id = read_langastProofAstStepId()
      val claim = read_langastExp()
      val exp = read_langastExp()
      val cases = reader.readISZ(read_langastProofAstStepStructInductionMatchCase _)
      val defaultOpt = reader.readOption(read_langastProofAstStepStructInductionMatchDefault _)
      return org.sireum.lang.ast.ProofAst.Step.StructInduction(id, claim, exp, cases, defaultOpt)
    }

    def read_langastProofAstStepStructInductionMatchCase(): org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase = {
      val r = read_langastProofAstStepStructInductionMatchCaseT(F)
      return r
    }

    def read_langastProofAstStepStructInductionMatchCaseT(typeParsed: B): org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastProofAstStepStructInductionMatchCase)
      }
      val pattern = read_langastPatternStructure()
      val hypoOpt = reader.readOption(read_langastProofAstStepAssume _)
      val steps = reader.readISZ(read_langastProofAstStep _)
      return org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase(pattern, hypoOpt, steps)
    }

    def read_langastProofAstStepStructInductionMatchDefault(): org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault = {
      val r = read_langastProofAstStepStructInductionMatchDefaultT(F)
      return r
    }

    def read_langastProofAstStepStructInductionMatchDefaultT(typeParsed: B): org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastProofAstStepStructInductionMatchDefault)
      }
      val hypoOpt = reader.readOption(read_langastProofAstStepAssume _)
      val steps = reader.readISZ(read_langastProofAstStep _)
      return org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault(hypoOpt, steps)
    }

    def read_langastProofAstStepJustification(): org.sireum.lang.ast.ProofAst.Step.Justification = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants._langastProofAstStepJustificationRef => val r = read_langastProofAstStepJustificationRefT(T); return r
        case Constants._langastProofAstStepJustificationApply => val r = read_langastProofAstStepJustificationApplyT(T); return r
        case Constants._langastProofAstStepJustificationApplyNamed => val r = read_langastProofAstStepJustificationApplyNamedT(T); return r
        case Constants._langastProofAstStepJustificationApplyEta => val r = read_langastProofAstStepJustificationApplyEtaT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of org.sireum.lang.ast.ProofAst.Step.Justification.")
          val r = read_langastProofAstStepJustificationApplyEtaT(T)
          return r
      }
    }

    def read_langastProofAstStepInception(): org.sireum.lang.ast.ProofAst.Step.Inception = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants._langastProofAstStepJustificationApply => val r = read_langastProofAstStepJustificationApplyT(T); return r
        case Constants._langastProofAstStepJustificationApplyNamed => val r = read_langastProofAstStepJustificationApplyNamedT(T); return r
        case Constants._langastProofAstStepJustificationApplyEta => val r = read_langastProofAstStepJustificationApplyEtaT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of org.sireum.lang.ast.ProofAst.Step.Inception.")
          val r = read_langastProofAstStepJustificationApplyEtaT(T)
          return r
      }
    }

    def read_langastProofAstStepJustificationRef(): org.sireum.lang.ast.ProofAst.Step.Justification.Ref = {
      val r = read_langastProofAstStepJustificationRefT(F)
      return r
    }

    def read_langastProofAstStepJustificationRefT(typeParsed: B): org.sireum.lang.ast.ProofAst.Step.Justification.Ref = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastProofAstStepJustificationRef)
      }
      val id = read_langastExpRef()
      return org.sireum.lang.ast.ProofAst.Step.Justification.Ref(id)
    }

    def read_langastProofAstStepJustificationApply(): org.sireum.lang.ast.ProofAst.Step.Justification.Apply = {
      val r = read_langastProofAstStepJustificationApplyT(F)
      return r
    }

    def read_langastProofAstStepJustificationApplyT(typeParsed: B): org.sireum.lang.ast.ProofAst.Step.Justification.Apply = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastProofAstStepJustificationApply)
      }
      val invoke = read_langastExpInvoke()
      val witnesses = reader.readISZ(read_langastProofAstStepId _)
      return org.sireum.lang.ast.ProofAst.Step.Justification.Apply(invoke, witnesses)
    }

    def read_langastProofAstStepJustificationApplyNamed(): org.sireum.lang.ast.ProofAst.Step.Justification.ApplyNamed = {
      val r = read_langastProofAstStepJustificationApplyNamedT(F)
      return r
    }

    def read_langastProofAstStepJustificationApplyNamedT(typeParsed: B): org.sireum.lang.ast.ProofAst.Step.Justification.ApplyNamed = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastProofAstStepJustificationApplyNamed)
      }
      val invoke = read_langastExpInvokeNamed()
      val witnesses = reader.readISZ(read_langastProofAstStepId _)
      return org.sireum.lang.ast.ProofAst.Step.Justification.ApplyNamed(invoke, witnesses)
    }

    def read_langastProofAstStepJustificationApplyEta(): org.sireum.lang.ast.ProofAst.Step.Justification.ApplyEta = {
      val r = read_langastProofAstStepJustificationApplyEtaT(F)
      return r
    }

    def read_langastProofAstStepJustificationApplyEtaT(typeParsed: B): org.sireum.lang.ast.ProofAst.Step.Justification.ApplyEta = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastProofAstStepJustificationApplyEta)
      }
      val eta = read_langastExpEta()
      val witnesses = reader.readISZ(read_langastProofAstStepId _)
      return org.sireum.lang.ast.ProofAst.Step.Justification.ApplyEta(eta, witnesses)
    }

    def read_langastAssignExp(): org.sireum.lang.ast.AssignExp = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants._langastStmtBlock => val r = read_langastStmtBlockT(T); return r
        case Constants._langastStmtIf => val r = read_langastStmtIfT(T); return r
        case Constants._langastStmtMatch => val r = read_langastStmtMatchT(T); return r
        case Constants._langastStmtReturn => val r = read_langastStmtReturnT(T); return r
        case Constants._langastStmtExpr => val r = read_langastStmtExprT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of org.sireum.lang.ast.AssignExp.")
          val r = read_langastStmtExprT(T)
          return r
      }
    }

    def read_langastPurityType(): org.sireum.lang.ast.Purity.Type = {
      val r = reader.readZ()
      return org.sireum.lang.ast.Purity.byOrdinal(r).get
    }

    def read_langastCase(): org.sireum.lang.ast.Case = {
      val r = read_langastCaseT(F)
      return r
    }

    def read_langastCaseT(typeParsed: B): org.sireum.lang.ast.Case = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastCase)
      }
      val pattern = read_langastPattern()
      val condOpt = reader.readOption(read_langastExp _)
      val body = read_langastBody()
      return org.sireum.lang.ast.Case(pattern, condOpt, body)
    }

    def read_langastEnumGenRange(): org.sireum.lang.ast.EnumGen.Range = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants._langastEnumGenRangeExpr => val r = read_langastEnumGenRangeExprT(T); return r
        case Constants._langastEnumGenRangeStep => val r = read_langastEnumGenRangeStepT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of org.sireum.lang.ast.EnumGen.Range.")
          val r = read_langastEnumGenRangeStepT(T)
          return r
      }
    }

    def read_langastEnumGenRangeExpr(): org.sireum.lang.ast.EnumGen.Range.Expr = {
      val r = read_langastEnumGenRangeExprT(F)
      return r
    }

    def read_langastEnumGenRangeExprT(typeParsed: B): org.sireum.lang.ast.EnumGen.Range.Expr = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastEnumGenRangeExpr)
      }
      val exp = read_langastExp()
      val attr = read_langastAttr()
      return org.sireum.lang.ast.EnumGen.Range.Expr(exp, attr)
    }

    def read_langastEnumGenRangeStep(): org.sireum.lang.ast.EnumGen.Range.Step = {
      val r = read_langastEnumGenRangeStepT(F)
      return r
    }

    def read_langastEnumGenRangeStepT(typeParsed: B): org.sireum.lang.ast.EnumGen.Range.Step = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastEnumGenRangeStep)
      }
      val isInclusive = reader.readB()
      val start = read_langastExp()
      val end = read_langastExp()
      val byOpt = reader.readOption(read_langastExp _)
      val attr = read_langastAttr()
      return org.sireum.lang.ast.EnumGen.Range.Step(isInclusive, start, end, byOpt, attr)
    }

    def read_langastEnumGenFor(): org.sireum.lang.ast.EnumGen.For = {
      val r = read_langastEnumGenForT(F)
      return r
    }

    def read_langastEnumGenForT(typeParsed: B): org.sireum.lang.ast.EnumGen.For = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastEnumGenFor)
      }
      val idOpt = reader.readOption(read_langastId _)
      val range = read_langastEnumGenRange()
      val condOpt = reader.readOption(read_langastExp _)
      val contract = read_langastLoopContract()
      return org.sireum.lang.ast.EnumGen.For(idOpt, range, condOpt, contract)
    }

    def read_langastType(): org.sireum.lang.ast.Type = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants._langastTypeNamed => val r = read_langastTypeNamedT(T); return r
        case Constants._langastTypeFun => val r = read_langastTypeFunT(T); return r
        case Constants._langastTypeTuple => val r = read_langastTypeTupleT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of org.sireum.lang.ast.Type.")
          val r = read_langastTypeTupleT(T)
          return r
      }
    }

    def read_langastTypeNamed(): org.sireum.lang.ast.Type.Named = {
      val r = read_langastTypeNamedT(F)
      return r
    }

    def read_langastTypeNamedT(typeParsed: B): org.sireum.lang.ast.Type.Named = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastTypeNamed)
      }
      val name = read_langastName()
      val typeArgs = reader.readISZ(read_langastType _)
      val attr = read_langastTypedAttr()
      return org.sireum.lang.ast.Type.Named(name, typeArgs, attr)
    }

    def read_langastTypeFun(): org.sireum.lang.ast.Type.Fun = {
      val r = read_langastTypeFunT(F)
      return r
    }

    def read_langastTypeFunT(typeParsed: B): org.sireum.lang.ast.Type.Fun = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastTypeFun)
      }
      val isPure = reader.readB()
      val isByName = reader.readB()
      val args = reader.readISZ(read_langastType _)
      val ret = read_langastType()
      val attr = read_langastTypedAttr()
      return org.sireum.lang.ast.Type.Fun(isPure, isByName, args, ret, attr)
    }

    def read_langastTypeTuple(): org.sireum.lang.ast.Type.Tuple = {
      val r = read_langastTypeTupleT(F)
      return r
    }

    def read_langastTypeTupleT(typeParsed: B): org.sireum.lang.ast.Type.Tuple = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastTypeTuple)
      }
      val args = reader.readISZ(read_langastType _)
      val attr = read_langastTypedAttr()
      return org.sireum.lang.ast.Type.Tuple(args, attr)
    }

    def read_langastPattern(): org.sireum.lang.ast.Pattern = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants._langastPatternLiteral => val r = read_langastPatternLiteralT(T); return r
        case Constants._langastPatternLitInterpolate => val r = read_langastPatternLitInterpolateT(T); return r
        case Constants._langastPatternRef => val r = read_langastPatternRefT(T); return r
        case Constants._langastPatternVarBinding => val r = read_langastPatternVarBindingT(T); return r
        case Constants._langastPatternWildcard => val r = read_langastPatternWildcardT(T); return r
        case Constants._langastPatternSeqWildcard => val r = read_langastPatternSeqWildcardT(T); return r
        case Constants._langastPatternStructure => val r = read_langastPatternStructureT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of org.sireum.lang.ast.Pattern.")
          val r = read_langastPatternStructureT(T)
          return r
      }
    }

    def read_langastPatternLiteral(): org.sireum.lang.ast.Pattern.Literal = {
      val r = read_langastPatternLiteralT(F)
      return r
    }

    def read_langastPatternLiteralT(typeParsed: B): org.sireum.lang.ast.Pattern.Literal = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastPatternLiteral)
      }
      val lit = read_langastLit()
      return org.sireum.lang.ast.Pattern.Literal(lit)
    }

    def read_langastPatternLitInterpolate(): org.sireum.lang.ast.Pattern.LitInterpolate = {
      val r = read_langastPatternLitInterpolateT(F)
      return r
    }

    def read_langastPatternLitInterpolateT(typeParsed: B): org.sireum.lang.ast.Pattern.LitInterpolate = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastPatternLitInterpolate)
      }
      val prefix = reader.readString()
      val value = reader.readString()
      val attr = read_langastTypedAttr()
      return org.sireum.lang.ast.Pattern.LitInterpolate(prefix, value, attr)
    }

    def read_langastPatternRef(): org.sireum.lang.ast.Pattern.Ref = {
      val r = read_langastPatternRefT(F)
      return r
    }

    def read_langastPatternRefT(typeParsed: B): org.sireum.lang.ast.Pattern.Ref = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastPatternRef)
      }
      val name = read_langastName()
      val attr = read_langastResolvedAttr()
      return org.sireum.lang.ast.Pattern.Ref(name, attr)
    }

    def read_langastPatternVarBinding(): org.sireum.lang.ast.Pattern.VarBinding = {
      val r = read_langastPatternVarBindingT(F)
      return r
    }

    def read_langastPatternVarBindingT(typeParsed: B): org.sireum.lang.ast.Pattern.VarBinding = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastPatternVarBinding)
      }
      val id = read_langastId()
      val tipeOpt = reader.readOption(read_langastType _)
      val attr = read_langastTypedAttr()
      return org.sireum.lang.ast.Pattern.VarBinding(id, tipeOpt, attr)
    }

    def read_langastPatternWildcard(): org.sireum.lang.ast.Pattern.Wildcard = {
      val r = read_langastPatternWildcardT(F)
      return r
    }

    def read_langastPatternWildcardT(typeParsed: B): org.sireum.lang.ast.Pattern.Wildcard = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastPatternWildcard)
      }
      val typeOpt = reader.readOption(read_langastType _)
      val attr = read_langastTypedAttr()
      return org.sireum.lang.ast.Pattern.Wildcard(typeOpt, attr)
    }

    def read_langastPatternSeqWildcard(): org.sireum.lang.ast.Pattern.SeqWildcard = {
      val r = read_langastPatternSeqWildcardT(F)
      return r
    }

    def read_langastPatternSeqWildcardT(typeParsed: B): org.sireum.lang.ast.Pattern.SeqWildcard = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastPatternSeqWildcard)
      }
      val attr = read_langastTypedAttr()
      return org.sireum.lang.ast.Pattern.SeqWildcard(attr)
    }

    def read_langastPatternStructure(): org.sireum.lang.ast.Pattern.Structure = {
      val r = read_langastPatternStructureT(F)
      return r
    }

    def read_langastPatternStructureT(typeParsed: B): org.sireum.lang.ast.Pattern.Structure = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastPatternStructure)
      }
      val idOpt = reader.readOption(read_langastId _)
      val nameOpt = reader.readOption(read_langastName _)
      val patterns = reader.readISZ(read_langastPattern _)
      val attr = read_langastResolvedAttr()
      return org.sireum.lang.ast.Pattern.Structure(idOpt, nameOpt, patterns, attr)
    }

    def read_langastExp(): org.sireum.lang.ast.Exp = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants._langastExpLitB => val r = read_langastExpLitBT(T); return r
        case Constants._langastExpLitC => val r = read_langastExpLitCT(T); return r
        case Constants._langastExpLitZ => val r = read_langastExpLitZT(T); return r
        case Constants._langastExpLitF32 => val r = read_langastExpLitF32T(T); return r
        case Constants._langastExpLitF64 => val r = read_langastExpLitF64T(T); return r
        case Constants._langastExpLitR => val r = read_langastExpLitRT(T); return r
        case Constants._langastExpLitString => val r = read_langastExpLitStringT(T); return r
        case Constants._langastExpLitStepId => val r = read_langastExpLitStepIdT(T); return r
        case Constants._langastExpStringInterpolate => val r = read_langastExpStringInterpolateT(T); return r
        case Constants._langastExpThis => val r = read_langastExpThisT(T); return r
        case Constants._langastExpSuper => val r = read_langastExpSuperT(T); return r
        case Constants._langastExpUnary => val r = read_langastExpUnaryT(T); return r
        case Constants._langastExpBinary => val r = read_langastExpBinaryT(T); return r
        case Constants._langastExpIdent => val r = read_langastExpIdentT(T); return r
        case Constants._langastExpEta => val r = read_langastExpEtaT(T); return r
        case Constants._langastExpTuple => val r = read_langastExpTupleT(T); return r
        case Constants._langastExpSelect => val r = read_langastExpSelectT(T); return r
        case Constants._langastExpInvoke => val r = read_langastExpInvokeT(T); return r
        case Constants._langastExpInvokeNamed => val r = read_langastExpInvokeNamedT(T); return r
        case Constants._langastExpIf => val r = read_langastExpIfT(T); return r
        case Constants._langastExpTypeCond => val r = read_langastExpTypeCondT(T); return r
        case Constants._langastExpSym => val r = read_langastExpSymT(T); return r
        case Constants._langastExpFun => val r = read_langastExpFunT(T); return r
        case Constants._langastExpForYield => val r = read_langastExpForYieldT(T); return r
        case Constants._langastExpQuantType => val r = read_langastExpQuantTypeT(T); return r
        case Constants._langastExpQuantRange => val r = read_langastExpQuantRangeT(T); return r
        case Constants._langastExpQuantEach => val r = read_langastExpQuantEachT(T); return r
        case Constants._langastExpInput => val r = read_langastExpInputT(T); return r
        case Constants._langastExpAt => val r = read_langastExpAtT(T); return r
        case Constants._langastExpLoopIndex => val r = read_langastExpLoopIndexT(T); return r
        case Constants._langastExpStateSeq => val r = read_langastExpStateSeqT(T); return r
        case Constants._langastExpResult => val r = read_langastExpResultT(T); return r
        case Constants._langastExpAssumeAgree => val r = read_langastExpAssumeAgreeT(T); return r
        case Constants._langastExpAssertAgree => val r = read_langastExpAssertAgreeT(T); return r
        case Constants._langastExpInfoFlowInvariant => val r = read_langastExpInfoFlowInvariantT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of org.sireum.lang.ast.Exp.")
          val r = read_langastExpInfoFlowInvariantT(T)
          return r
      }
    }

    def read_langastLit(): org.sireum.lang.ast.Lit = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants._langastExpLitB => val r = read_langastExpLitBT(T); return r
        case Constants._langastExpLitC => val r = read_langastExpLitCT(T); return r
        case Constants._langastExpLitZ => val r = read_langastExpLitZT(T); return r
        case Constants._langastExpLitF32 => val r = read_langastExpLitF32T(T); return r
        case Constants._langastExpLitF64 => val r = read_langastExpLitF64T(T); return r
        case Constants._langastExpLitR => val r = read_langastExpLitRT(T); return r
        case Constants._langastExpLitString => val r = read_langastExpLitStringT(T); return r
        case Constants._langastExpLitStepId => val r = read_langastExpLitStepIdT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of org.sireum.lang.ast.Lit.")
          val r = read_langastExpLitStepIdT(T)
          return r
      }
    }

    def read_langastExpLitB(): org.sireum.lang.ast.Exp.LitB = {
      val r = read_langastExpLitBT(F)
      return r
    }

    def read_langastExpLitBT(typeParsed: B): org.sireum.lang.ast.Exp.LitB = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastExpLitB)
      }
      val value = reader.readB()
      val attr = read_langastAttr()
      return org.sireum.lang.ast.Exp.LitB(value, attr)
    }

    def read_langastExpLitC(): org.sireum.lang.ast.Exp.LitC = {
      val r = read_langastExpLitCT(F)
      return r
    }

    def read_langastExpLitCT(typeParsed: B): org.sireum.lang.ast.Exp.LitC = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastExpLitC)
      }
      val value = reader.readC()
      val attr = read_langastAttr()
      return org.sireum.lang.ast.Exp.LitC(value, attr)
    }

    def read_langastExpLitZ(): org.sireum.lang.ast.Exp.LitZ = {
      val r = read_langastExpLitZT(F)
      return r
    }

    def read_langastExpLitZT(typeParsed: B): org.sireum.lang.ast.Exp.LitZ = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastExpLitZ)
      }
      val value = reader.readZ()
      val attr = read_langastAttr()
      return org.sireum.lang.ast.Exp.LitZ(value, attr)
    }

    def read_langastExpLitF32(): org.sireum.lang.ast.Exp.LitF32 = {
      val r = read_langastExpLitF32T(F)
      return r
    }

    def read_langastExpLitF32T(typeParsed: B): org.sireum.lang.ast.Exp.LitF32 = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastExpLitF32)
      }
      val value = reader.readF32()
      val attr = read_langastAttr()
      return org.sireum.lang.ast.Exp.LitF32(value, attr)
    }

    def read_langastExpLitF64(): org.sireum.lang.ast.Exp.LitF64 = {
      val r = read_langastExpLitF64T(F)
      return r
    }

    def read_langastExpLitF64T(typeParsed: B): org.sireum.lang.ast.Exp.LitF64 = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastExpLitF64)
      }
      val value = reader.readF64()
      val attr = read_langastAttr()
      return org.sireum.lang.ast.Exp.LitF64(value, attr)
    }

    def read_langastExpLitR(): org.sireum.lang.ast.Exp.LitR = {
      val r = read_langastExpLitRT(F)
      return r
    }

    def read_langastExpLitRT(typeParsed: B): org.sireum.lang.ast.Exp.LitR = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastExpLitR)
      }
      val value = reader.readR()
      val attr = read_langastAttr()
      return org.sireum.lang.ast.Exp.LitR(value, attr)
    }

    def read_langastExpLitString(): org.sireum.lang.ast.Exp.LitString = {
      val r = read_langastExpLitStringT(F)
      return r
    }

    def read_langastExpLitStringT(typeParsed: B): org.sireum.lang.ast.Exp.LitString = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastExpLitString)
      }
      val value = reader.readString()
      val attr = read_langastAttr()
      return org.sireum.lang.ast.Exp.LitString(value, attr)
    }

    def read_langastExpLitStepId(): org.sireum.lang.ast.Exp.LitStepId = {
      val r = read_langastExpLitStepIdT(F)
      return r
    }

    def read_langastExpLitStepIdT(typeParsed: B): org.sireum.lang.ast.Exp.LitStepId = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastExpLitStepId)
      }
      val value = reader.readString()
      val attr = read_langastAttr()
      return org.sireum.lang.ast.Exp.LitStepId(value, attr)
    }

    def read_langastExpStringInterpolate(): org.sireum.lang.ast.Exp.StringInterpolate = {
      val r = read_langastExpStringInterpolateT(F)
      return r
    }

    def read_langastExpStringInterpolateT(typeParsed: B): org.sireum.lang.ast.Exp.StringInterpolate = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastExpStringInterpolate)
      }
      val prefix = reader.readString()
      val lits = reader.readISZ(read_langastExpLitString _)
      val args = reader.readISZ(read_langastExp _)
      val attr = read_langastTypedAttr()
      return org.sireum.lang.ast.Exp.StringInterpolate(prefix, lits, args, attr)
    }

    def read_langastExpThis(): org.sireum.lang.ast.Exp.This = {
      val r = read_langastExpThisT(F)
      return r
    }

    def read_langastExpThisT(typeParsed: B): org.sireum.lang.ast.Exp.This = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastExpThis)
      }
      val attr = read_langastTypedAttr()
      return org.sireum.lang.ast.Exp.This(attr)
    }

    def read_langastExpSuper(): org.sireum.lang.ast.Exp.Super = {
      val r = read_langastExpSuperT(F)
      return r
    }

    def read_langastExpSuperT(typeParsed: B): org.sireum.lang.ast.Exp.Super = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastExpSuper)
      }
      val idOpt = reader.readOption(read_langastId _)
      val attr = read_langastTypedAttr()
      return org.sireum.lang.ast.Exp.Super(idOpt, attr)
    }

    def read_langastExpUnaryOpType(): org.sireum.lang.ast.Exp.UnaryOp.Type = {
      val r = reader.readZ()
      return org.sireum.lang.ast.Exp.UnaryOp.byOrdinal(r).get
    }

    def read_langastExpUnary(): org.sireum.lang.ast.Exp.Unary = {
      val r = read_langastExpUnaryT(F)
      return r
    }

    def read_langastExpUnaryT(typeParsed: B): org.sireum.lang.ast.Exp.Unary = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastExpUnary)
      }
      val op = read_langastExpUnaryOpType()
      val exp = read_langastExp()
      val attr = read_langastResolvedAttr()
      return org.sireum.lang.ast.Exp.Unary(op, exp, attr)
    }

    def read_langastExpRef(): org.sireum.lang.ast.Exp.Ref = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants._langastExpIdent => val r = read_langastExpIdentT(T); return r
        case Constants._langastExpSelect => val r = read_langastExpSelectT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of org.sireum.lang.ast.Exp.Ref.")
          val r = read_langastExpSelectT(T)
          return r
      }
    }

    def read_langastExpBinary(): org.sireum.lang.ast.Exp.Binary = {
      val r = read_langastExpBinaryT(F)
      return r
    }

    def read_langastExpBinaryT(typeParsed: B): org.sireum.lang.ast.Exp.Binary = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastExpBinary)
      }
      val left = read_langastExp()
      val op = reader.readString()
      val right = read_langastExp()
      val attr = read_langastResolvedAttr()
      return org.sireum.lang.ast.Exp.Binary(left, op, right, attr)
    }

    def read_langastExpIdent(): org.sireum.lang.ast.Exp.Ident = {
      val r = read_langastExpIdentT(F)
      return r
    }

    def read_langastExpIdentT(typeParsed: B): org.sireum.lang.ast.Exp.Ident = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastExpIdent)
      }
      val id = read_langastId()
      val attr = read_langastResolvedAttr()
      return org.sireum.lang.ast.Exp.Ident(id, attr)
    }

    def read_langastExpEta(): org.sireum.lang.ast.Exp.Eta = {
      val r = read_langastExpEtaT(F)
      return r
    }

    def read_langastExpEtaT(typeParsed: B): org.sireum.lang.ast.Exp.Eta = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastExpEta)
      }
      val ref = read_langastExpRef()
      val attr = read_langastTypedAttr()
      return org.sireum.lang.ast.Exp.Eta(ref, attr)
    }

    def read_langastExpTuple(): org.sireum.lang.ast.Exp.Tuple = {
      val r = read_langastExpTupleT(F)
      return r
    }

    def read_langastExpTupleT(typeParsed: B): org.sireum.lang.ast.Exp.Tuple = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastExpTuple)
      }
      val args = reader.readISZ(read_langastExp _)
      val attr = read_langastTypedAttr()
      return org.sireum.lang.ast.Exp.Tuple(args, attr)
    }

    def read_langastExpSelect(): org.sireum.lang.ast.Exp.Select = {
      val r = read_langastExpSelectT(F)
      return r
    }

    def read_langastExpSelectT(typeParsed: B): org.sireum.lang.ast.Exp.Select = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastExpSelect)
      }
      val receiverOpt = reader.readOption(read_langastExp _)
      val id = read_langastId()
      val targs = reader.readISZ(read_langastType _)
      val attr = read_langastResolvedAttr()
      return org.sireum.lang.ast.Exp.Select(receiverOpt, id, targs, attr)
    }

    def read_langastExpInvoke(): org.sireum.lang.ast.Exp.Invoke = {
      val r = read_langastExpInvokeT(F)
      return r
    }

    def read_langastExpInvokeT(typeParsed: B): org.sireum.lang.ast.Exp.Invoke = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastExpInvoke)
      }
      val receiverOpt = reader.readOption(read_langastExp _)
      val ident = read_langastExpIdent()
      val targs = reader.readISZ(read_langastType _)
      val args = reader.readISZ(read_langastExp _)
      val attr = read_langastResolvedAttr()
      return org.sireum.lang.ast.Exp.Invoke(receiverOpt, ident, targs, args, attr)
    }

    def read_langastExpInvokeNamed(): org.sireum.lang.ast.Exp.InvokeNamed = {
      val r = read_langastExpInvokeNamedT(F)
      return r
    }

    def read_langastExpInvokeNamedT(typeParsed: B): org.sireum.lang.ast.Exp.InvokeNamed = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastExpInvokeNamed)
      }
      val receiverOpt = reader.readOption(read_langastExp _)
      val ident = read_langastExpIdent()
      val targs = reader.readISZ(read_langastType _)
      val args = reader.readISZ(read_langastNamedArg _)
      val attr = read_langastResolvedAttr()
      return org.sireum.lang.ast.Exp.InvokeNamed(receiverOpt, ident, targs, args, attr)
    }

    def read_langastExpIf(): org.sireum.lang.ast.Exp.If = {
      val r = read_langastExpIfT(F)
      return r
    }

    def read_langastExpIfT(typeParsed: B): org.sireum.lang.ast.Exp.If = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastExpIf)
      }
      val cond = read_langastExp()
      val thenExp = read_langastExp()
      val elseExp = read_langastExp()
      val attr = read_langastTypedAttr()
      return org.sireum.lang.ast.Exp.If(cond, thenExp, elseExp, attr)
    }

    def read_langastExpTypeCond(): org.sireum.lang.ast.Exp.TypeCond = {
      val r = read_langastExpTypeCondT(F)
      return r
    }

    def read_langastExpTypeCondT(typeParsed: B): org.sireum.lang.ast.Exp.TypeCond = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastExpTypeCond)
      }
      val args = reader.readISZ(read_langastExp _)
      val fun = read_langastExpFun()
      val attr = read_langastAttr()
      return org.sireum.lang.ast.Exp.TypeCond(args, fun, attr)
    }

    def read_langastExpSym(): org.sireum.lang.ast.Exp.Sym = {
      val r = read_langastExpSymT(F)
      return r
    }

    def read_langastExpSymT(typeParsed: B): org.sireum.lang.ast.Exp.Sym = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastExpSym)
      }
      val num = reader.readZ()
      val attr = read_langastTypedAttr()
      return org.sireum.lang.ast.Exp.Sym(num, attr)
    }

    def read_langastExpFunParam(): org.sireum.lang.ast.Exp.Fun.Param = {
      val r = read_langastExpFunParamT(F)
      return r
    }

    def read_langastExpFunParamT(typeParsed: B): org.sireum.lang.ast.Exp.Fun.Param = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastExpFunParam)
      }
      val idOpt = reader.readOption(read_langastId _)
      val tipeOpt = reader.readOption(read_langastType _)
      val typedOpt = reader.readOption(read_langastTyped _)
      return org.sireum.lang.ast.Exp.Fun.Param(idOpt, tipeOpt, typedOpt)
    }

    def read_langastExpFun(): org.sireum.lang.ast.Exp.Fun = {
      val r = read_langastExpFunT(F)
      return r
    }

    def read_langastExpFunT(typeParsed: B): org.sireum.lang.ast.Exp.Fun = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastExpFun)
      }
      val context = reader.readISZ(reader.readString _)
      val params = reader.readISZ(read_langastExpFunParam _)
      val exp = read_langastAssignExp()
      val attr = read_langastTypedAttr()
      return org.sireum.lang.ast.Exp.Fun(context, params, exp, attr)
    }

    def read_langastExpForYield(): org.sireum.lang.ast.Exp.ForYield = {
      val r = read_langastExpForYieldT(F)
      return r
    }

    def read_langastExpForYieldT(typeParsed: B): org.sireum.lang.ast.Exp.ForYield = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastExpForYield)
      }
      val enumGens = reader.readISZ(read_langastEnumGenFor _)
      val exp = read_langastExp()
      val attr = read_langastTypedAttr()
      return org.sireum.lang.ast.Exp.ForYield(enumGens, exp, attr)
    }

    def read_langastExpQuant(): org.sireum.lang.ast.Exp.Quant = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants._langastExpQuantType => val r = read_langastExpQuantTypeT(T); return r
        case Constants._langastExpQuantRange => val r = read_langastExpQuantRangeT(T); return r
        case Constants._langastExpQuantEach => val r = read_langastExpQuantEachT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of org.sireum.lang.ast.Exp.Quant.")
          val r = read_langastExpQuantEachT(T)
          return r
      }
    }

    def read_langastExpQuantType(): org.sireum.lang.ast.Exp.QuantType = {
      val r = read_langastExpQuantTypeT(F)
      return r
    }

    def read_langastExpQuantTypeT(typeParsed: B): org.sireum.lang.ast.Exp.QuantType = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastExpQuantType)
      }
      val isForall = reader.readB()
      val fun = read_langastExpFun()
      val attr = read_langastAttr()
      return org.sireum.lang.ast.Exp.QuantType(isForall, fun, attr)
    }

    def read_langastExpQuantRange(): org.sireum.lang.ast.Exp.QuantRange = {
      val r = read_langastExpQuantRangeT(F)
      return r
    }

    def read_langastExpQuantRangeT(typeParsed: B): org.sireum.lang.ast.Exp.QuantRange = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastExpQuantRange)
      }
      val isForall = reader.readB()
      val lo = read_langastExp()
      val hi = read_langastExp()
      val hiExact = reader.readB()
      val fun = read_langastExpFun()
      val attr = read_langastResolvedAttr()
      return org.sireum.lang.ast.Exp.QuantRange(isForall, lo, hi, hiExact, fun, attr)
    }

    def read_langastExpQuantEach(): org.sireum.lang.ast.Exp.QuantEach = {
      val r = read_langastExpQuantEachT(F)
      return r
    }

    def read_langastExpQuantEachT(typeParsed: B): org.sireum.lang.ast.Exp.QuantEach = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastExpQuantEach)
      }
      val isForall = reader.readB()
      val seq = read_langastExp()
      val fun = read_langastExpFun()
      val attr = read_langastResolvedAttr()
      return org.sireum.lang.ast.Exp.QuantEach(isForall, seq, fun, attr)
    }

    def read_langastExpInput(): org.sireum.lang.ast.Exp.Input = {
      val r = read_langastExpInputT(F)
      return r
    }

    def read_langastExpInputT(typeParsed: B): org.sireum.lang.ast.Exp.Input = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastExpInput)
      }
      val exp = read_langastExp()
      val attr = read_langastAttr()
      return org.sireum.lang.ast.Exp.Input(exp, attr)
    }

    def read_langastExpAt(): org.sireum.lang.ast.Exp.At = {
      val r = read_langastExpAtT(F)
      return r
    }

    def read_langastExpAtT(typeParsed: B): org.sireum.lang.ast.Exp.At = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastExpAt)
      }
      val tipeOpt = reader.readOption(read_langastType _)
      val exp = read_langastExp()
      val num = read_langastExpLitZ()
      val linesFresh = reader.readISZ(read_langastExpLitZ _)
      val attr = read_langastAttr()
      return org.sireum.lang.ast.Exp.At(tipeOpt, exp, num, linesFresh, attr)
    }

    def read_langastExpLoopIndex(): org.sireum.lang.ast.Exp.LoopIndex = {
      val r = read_langastExpLoopIndexT(F)
      return r
    }

    def read_langastExpLoopIndexT(typeParsed: B): org.sireum.lang.ast.Exp.LoopIndex = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastExpLoopIndex)
      }
      val tipeOpt = reader.readOption(read_langastType _)
      val exp = read_langastExpIdent()
      val attr = read_langastTypedAttr()
      return org.sireum.lang.ast.Exp.LoopIndex(tipeOpt, exp, attr)
    }

    def read_langastExpStateSeq(): org.sireum.lang.ast.Exp.StateSeq = {
      val r = read_langastExpStateSeqT(F)
      return r
    }

    def read_langastExpStateSeqT(typeParsed: B): org.sireum.lang.ast.Exp.StateSeq = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastExpStateSeq)
      }
      val id = read_langastId()
      val fragments = reader.readISZ(read_langastExpStateSeqFragment _)
      val attr = read_langastAttr()
      return org.sireum.lang.ast.Exp.StateSeq(id, fragments, attr)
    }

    def read_langastExpStateSeqFragment(): org.sireum.lang.ast.Exp.StateSeq.Fragment = {
      val r = read_langastExpStateSeqFragmentT(F)
      return r
    }

    def read_langastExpStateSeqFragmentT(typeParsed: B): org.sireum.lang.ast.Exp.StateSeq.Fragment = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastExpStateSeqFragment)
      }
      val id = read_langastId()
      val exp = read_langastExp()
      return org.sireum.lang.ast.Exp.StateSeq.Fragment(id, exp)
    }

    def read_langastExpResult(): org.sireum.lang.ast.Exp.Result = {
      val r = read_langastExpResultT(F)
      return r
    }

    def read_langastExpResultT(typeParsed: B): org.sireum.lang.ast.Exp.Result = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastExpResult)
      }
      val tipeOpt = reader.readOption(read_langastType _)
      val attr = read_langastTypedAttr()
      return org.sireum.lang.ast.Exp.Result(tipeOpt, attr)
    }

    def read_langastExpAssumeAgree(): org.sireum.lang.ast.Exp.AssumeAgree = {
      val r = read_langastExpAssumeAgreeT(F)
      return r
    }

    def read_langastExpAssumeAgreeT(typeParsed: B): org.sireum.lang.ast.Exp.AssumeAgree = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastExpAssumeAgree)
      }
      val channel = read_langastExpLitString()
      val requiresClause = read_langastMethodContractClaims()
      val inAgreeClause = read_langastMethodContractClaims()
      val attr = read_langastAttr()
      return org.sireum.lang.ast.Exp.AssumeAgree(channel, requiresClause, inAgreeClause, attr)
    }

    def read_langastExpAssertAgree(): org.sireum.lang.ast.Exp.AssertAgree = {
      val r = read_langastExpAssertAgreeT(F)
      return r
    }

    def read_langastExpAssertAgreeT(typeParsed: B): org.sireum.lang.ast.Exp.AssertAgree = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastExpAssertAgree)
      }
      val channel = read_langastExpLitString()
      val outAgreeClause = read_langastMethodContractClaims()
      val attr = read_langastAttr()
      return org.sireum.lang.ast.Exp.AssertAgree(channel, outAgreeClause, attr)
    }

    def read_langastExpInfoFlowInvariant(): org.sireum.lang.ast.Exp.InfoFlowInvariant = {
      val r = read_langastExpInfoFlowInvariantT(F)
      return r
    }

    def read_langastExpInfoFlowInvariantT(typeParsed: B): org.sireum.lang.ast.Exp.InfoFlowInvariant = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastExpInfoFlowInvariant)
      }
      val flowInvariants = reader.readISZ(read_langastMethodContractInfoFlow _)
      val attr = read_langastAttr()
      return org.sireum.lang.ast.Exp.InfoFlowInvariant(flowInvariants, attr)
    }

    def read_langastNamedArg(): org.sireum.lang.ast.NamedArg = {
      val r = read_langastNamedArgT(F)
      return r
    }

    def read_langastNamedArgT(typeParsed: B): org.sireum.lang.ast.NamedArg = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastNamedArg)
      }
      val id = read_langastId()
      val arg = read_langastExp()
      val index = reader.readZ()
      return org.sireum.lang.ast.NamedArg(id, arg, index)
    }

    def read_langastId(): org.sireum.lang.ast.Id = {
      val r = read_langastIdT(F)
      return r
    }

    def read_langastIdT(typeParsed: B): org.sireum.lang.ast.Id = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastId)
      }
      val value = reader.readString()
      val attr = read_langastAttr()
      return org.sireum.lang.ast.Id(value, attr)
    }

    def read_langastName(): org.sireum.lang.ast.Name = {
      val r = read_langastNameT(F)
      return r
    }

    def read_langastNameT(typeParsed: B): org.sireum.lang.ast.Name = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastName)
      }
      val ids = reader.readISZ(read_langastId _)
      val attr = read_langastAttr()
      return org.sireum.lang.ast.Name(ids, attr)
    }

    def read_langastBody(): org.sireum.lang.ast.Body = {
      val r = read_langastBodyT(F)
      return r
    }

    def read_langastBodyT(typeParsed: B): org.sireum.lang.ast.Body = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastBody)
      }
      val stmts = reader.readISZ(read_langastStmt _)
      val undecls = reader.readISZ(read_langastResolvedInfoLocalVar _)
      return org.sireum.lang.ast.Body(stmts, undecls)
    }

    def read_langastAdtParam(): org.sireum.lang.ast.AdtParam = {
      val r = read_langastAdtParamT(F)
      return r
    }

    def read_langastAdtParamT(typeParsed: B): org.sireum.lang.ast.AdtParam = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastAdtParam)
      }
      val isHidden = reader.readB()
      val isVal = reader.readB()
      val id = read_langastId()
      val tipe = read_langastType()
      return org.sireum.lang.ast.AdtParam(isHidden, isVal, id, tipe)
    }

    def read_langastMethodSig(): org.sireum.lang.ast.MethodSig = {
      val r = read_langastMethodSigT(F)
      return r
    }

    def read_langastMethodSigT(typeParsed: B): org.sireum.lang.ast.MethodSig = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastMethodSig)
      }
      val isPure = reader.readB()
      val id = read_langastId()
      val typeParams = reader.readISZ(read_langastTypeParam _)
      val hasParams = reader.readB()
      val params = reader.readISZ(read_langastParam _)
      val returnType = read_langastType()
      return org.sireum.lang.ast.MethodSig(isPure, id, typeParams, hasParams, params, returnType)
    }

    def read_langastParam(): org.sireum.lang.ast.Param = {
      val r = read_langastParamT(F)
      return r
    }

    def read_langastParamT(typeParsed: B): org.sireum.lang.ast.Param = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastParam)
      }
      val isHidden = reader.readB()
      val id = read_langastId()
      val tipe = read_langastType()
      return org.sireum.lang.ast.Param(isHidden, id, tipe)
    }

    def read_langastTypeParam(): org.sireum.lang.ast.TypeParam = {
      val r = read_langastTypeParamT(F)
      return r
    }

    def read_langastTypeParamT(typeParsed: B): org.sireum.lang.ast.TypeParam = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastTypeParam)
      }
      val id = read_langastId()
      val isImmutable = reader.readB()
      return org.sireum.lang.ast.TypeParam(id, isImmutable)
    }

    def read_langastAttr(): org.sireum.lang.ast.Attr = {
      val r = read_langastAttrT(F)
      return r
    }

    def read_langastAttrT(typeParsed: B): org.sireum.lang.ast.Attr = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastAttr)
      }
      val posOpt = reader.readOption(reader.readPosition _)
      return org.sireum.lang.ast.Attr(posOpt)
    }

    def read_langastTypedAttr(): org.sireum.lang.ast.TypedAttr = {
      val r = read_langastTypedAttrT(F)
      return r
    }

    def read_langastTypedAttrT(typeParsed: B): org.sireum.lang.ast.TypedAttr = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastTypedAttr)
      }
      val posOpt = reader.readOption(reader.readPosition _)
      val typedOpt = reader.readOption(read_langastTyped _)
      return org.sireum.lang.ast.TypedAttr(posOpt, typedOpt)
    }

    def read_langastResolvedAttr(): org.sireum.lang.ast.ResolvedAttr = {
      val r = read_langastResolvedAttrT(F)
      return r
    }

    def read_langastResolvedAttrT(typeParsed: B): org.sireum.lang.ast.ResolvedAttr = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastResolvedAttr)
      }
      val posOpt = reader.readOption(reader.readPosition _)
      val resOpt = reader.readOption(read_langastResolvedInfo _)
      val typedOpt = reader.readOption(read_langastTyped _)
      return org.sireum.lang.ast.ResolvedAttr(posOpt, resOpt, typedOpt)
    }

    def read_langastResolvedInfo(): org.sireum.lang.ast.ResolvedInfo = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants._langastResolvedInfoBuiltIn => val r = read_langastResolvedInfoBuiltInT(T); return r
        case Constants._langastResolvedInfoPackage => val r = read_langastResolvedInfoPackageT(T); return r
        case Constants._langastResolvedInfoEnum => val r = read_langastResolvedInfoEnumT(T); return r
        case Constants._langastResolvedInfoEnumElement => val r = read_langastResolvedInfoEnumElementT(T); return r
        case Constants._langastResolvedInfoObject => val r = read_langastResolvedInfoObjectT(T); return r
        case Constants._langastResolvedInfoVar => val r = read_langastResolvedInfoVarT(T); return r
        case Constants._langastResolvedInfoMethod => val r = read_langastResolvedInfoMethodT(T); return r
        case Constants._langastResolvedInfoMethods => val r = read_langastResolvedInfoMethodsT(T); return r
        case Constants._langastResolvedInfoTuple => val r = read_langastResolvedInfoTupleT(T); return r
        case Constants._langastResolvedInfoLocalVar => val r = read_langastResolvedInfoLocalVarT(T); return r
        case Constants._langastResolvedInfoFact => val r = read_langastResolvedInfoFactT(T); return r
        case Constants._langastResolvedInfoTheorem => val r = read_langastResolvedInfoTheoremT(T); return r
        case Constants._langastResolvedInfoInv => val r = read_langastResolvedInfoInvT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of org.sireum.lang.ast.ResolvedInfo.")
          val r = read_langastResolvedInfoInvT(T)
          return r
      }
    }

    def read_langastResolvedInfoBuiltInKindType(): org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.Type = {
      val r = reader.readZ()
      return org.sireum.lang.ast.ResolvedInfo.BuiltIn.Kind.byOrdinal(r).get
    }

    def read_langastResolvedInfoBuiltIn(): org.sireum.lang.ast.ResolvedInfo.BuiltIn = {
      val r = read_langastResolvedInfoBuiltInT(F)
      return r
    }

    def read_langastResolvedInfoBuiltInT(typeParsed: B): org.sireum.lang.ast.ResolvedInfo.BuiltIn = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastResolvedInfoBuiltIn)
      }
      val kind = read_langastResolvedInfoBuiltInKindType()
      return org.sireum.lang.ast.ResolvedInfo.BuiltIn(kind)
    }

    def read_langastResolvedInfoPackage(): org.sireum.lang.ast.ResolvedInfo.Package = {
      val r = read_langastResolvedInfoPackageT(F)
      return r
    }

    def read_langastResolvedInfoPackageT(typeParsed: B): org.sireum.lang.ast.ResolvedInfo.Package = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastResolvedInfoPackage)
      }
      val name = reader.readISZ(reader.readString _)
      return org.sireum.lang.ast.ResolvedInfo.Package(name)
    }

    def read_langastResolvedInfoEnum(): org.sireum.lang.ast.ResolvedInfo.Enum = {
      val r = read_langastResolvedInfoEnumT(F)
      return r
    }

    def read_langastResolvedInfoEnumT(typeParsed: B): org.sireum.lang.ast.ResolvedInfo.Enum = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastResolvedInfoEnum)
      }
      val name = reader.readISZ(reader.readString _)
      return org.sireum.lang.ast.ResolvedInfo.Enum(name)
    }

    def read_langastResolvedInfoEnumElement(): org.sireum.lang.ast.ResolvedInfo.EnumElement = {
      val r = read_langastResolvedInfoEnumElementT(F)
      return r
    }

    def read_langastResolvedInfoEnumElementT(typeParsed: B): org.sireum.lang.ast.ResolvedInfo.EnumElement = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastResolvedInfoEnumElement)
      }
      val owner = reader.readISZ(reader.readString _)
      val name = reader.readString()
      val ordinal = reader.readZ()
      return org.sireum.lang.ast.ResolvedInfo.EnumElement(owner, name, ordinal)
    }

    def read_langastResolvedInfoObject(): org.sireum.lang.ast.ResolvedInfo.Object = {
      val r = read_langastResolvedInfoObjectT(F)
      return r
    }

    def read_langastResolvedInfoObjectT(typeParsed: B): org.sireum.lang.ast.ResolvedInfo.Object = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastResolvedInfoObject)
      }
      val name = reader.readISZ(reader.readString _)
      return org.sireum.lang.ast.ResolvedInfo.Object(name)
    }

    def read_langastResolvedInfoVar(): org.sireum.lang.ast.ResolvedInfo.Var = {
      val r = read_langastResolvedInfoVarT(F)
      return r
    }

    def read_langastResolvedInfoVarT(typeParsed: B): org.sireum.lang.ast.ResolvedInfo.Var = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastResolvedInfoVar)
      }
      val isInObject = reader.readB()
      val isSpec = reader.readB()
      val isVal = reader.readB()
      val owner = reader.readISZ(reader.readString _)
      val id = reader.readString()
      return org.sireum.lang.ast.ResolvedInfo.Var(isInObject, isSpec, isVal, owner, id)
    }

    def read_langastResolvedInfoMethod(): org.sireum.lang.ast.ResolvedInfo.Method = {
      val r = read_langastResolvedInfoMethodT(F)
      return r
    }

    def read_langastResolvedInfoMethodT(typeParsed: B): org.sireum.lang.ast.ResolvedInfo.Method = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastResolvedInfoMethod)
      }
      val isInObject = reader.readB()
      val mode = read_langastMethodModeType()
      val typeParams = reader.readISZ(reader.readString _)
      val owner = reader.readISZ(reader.readString _)
      val id = reader.readString()
      val paramNames = reader.readISZ(reader.readString _)
      val tpeOpt = reader.readOption(read_langastTypedFun _)
      val reads = reader.readISZ(read_langastResolvedInfo _)
      val writes = reader.readISZ(read_langastResolvedInfo _)
      return org.sireum.lang.ast.ResolvedInfo.Method(isInObject, mode, typeParams, owner, id, paramNames, tpeOpt, reads, writes)
    }

    def read_langastResolvedInfoMethods(): org.sireum.lang.ast.ResolvedInfo.Methods = {
      val r = read_langastResolvedInfoMethodsT(F)
      return r
    }

    def read_langastResolvedInfoMethodsT(typeParsed: B): org.sireum.lang.ast.ResolvedInfo.Methods = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastResolvedInfoMethods)
      }
      val methods = reader.readISZ(read_langastResolvedInfoMethod _)
      return org.sireum.lang.ast.ResolvedInfo.Methods(methods)
    }

    def read_langastResolvedInfoTuple(): org.sireum.lang.ast.ResolvedInfo.Tuple = {
      val r = read_langastResolvedInfoTupleT(F)
      return r
    }

    def read_langastResolvedInfoTupleT(typeParsed: B): org.sireum.lang.ast.ResolvedInfo.Tuple = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastResolvedInfoTuple)
      }
      val size = reader.readZ()
      val index = reader.readZ()
      return org.sireum.lang.ast.ResolvedInfo.Tuple(size, index)
    }

    def read_langastResolvedInfoLocalVarScopeType(): org.sireum.lang.ast.ResolvedInfo.LocalVar.Scope.Type = {
      val r = reader.readZ()
      return org.sireum.lang.ast.ResolvedInfo.LocalVar.Scope.byOrdinal(r).get
    }

    def read_langastResolvedInfoLocalVar(): org.sireum.lang.ast.ResolvedInfo.LocalVar = {
      val r = read_langastResolvedInfoLocalVarT(F)
      return r
    }

    def read_langastResolvedInfoLocalVarT(typeParsed: B): org.sireum.lang.ast.ResolvedInfo.LocalVar = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastResolvedInfoLocalVar)
      }
      val context = reader.readISZ(reader.readString _)
      val scope = read_langastResolvedInfoLocalVarScopeType()
      val isSpec = reader.readB()
      val isVal = reader.readB()
      val id = reader.readString()
      return org.sireum.lang.ast.ResolvedInfo.LocalVar(context, scope, isSpec, isVal, id)
    }

    def read_langastResolvedInfoFact(): org.sireum.lang.ast.ResolvedInfo.Fact = {
      val r = read_langastResolvedInfoFactT(F)
      return r
    }

    def read_langastResolvedInfoFactT(typeParsed: B): org.sireum.lang.ast.ResolvedInfo.Fact = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastResolvedInfoFact)
      }
      val name = reader.readISZ(reader.readString _)
      return org.sireum.lang.ast.ResolvedInfo.Fact(name)
    }

    def read_langastResolvedInfoTheorem(): org.sireum.lang.ast.ResolvedInfo.Theorem = {
      val r = read_langastResolvedInfoTheoremT(F)
      return r
    }

    def read_langastResolvedInfoTheoremT(typeParsed: B): org.sireum.lang.ast.ResolvedInfo.Theorem = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastResolvedInfoTheorem)
      }
      val name = reader.readISZ(reader.readString _)
      return org.sireum.lang.ast.ResolvedInfo.Theorem(name)
    }

    def read_langastResolvedInfoInv(): org.sireum.lang.ast.ResolvedInfo.Inv = {
      val r = read_langastResolvedInfoInvT(F)
      return r
    }

    def read_langastResolvedInfoInvT(typeParsed: B): org.sireum.lang.ast.ResolvedInfo.Inv = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastResolvedInfoInv)
      }
      val isInObject = reader.readB()
      val owner = reader.readISZ(reader.readString _)
      val id = reader.readString()
      return org.sireum.lang.ast.ResolvedInfo.Inv(isInObject, owner, id)
    }

    def read_langastTruthTableRow(): org.sireum.lang.ast.TruthTable.Row = {
      val r = read_langastTruthTableRowT(F)
      return r
    }

    def read_langastTruthTableRowT(typeParsed: B): org.sireum.lang.ast.TruthTable.Row = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastTruthTableRow)
      }
      val assignment = read_langastTruthTableAssignment()
      val separator = reader.readPosition()
      val values = read_langastTruthTableAssignment()
      return org.sireum.lang.ast.TruthTable.Row(assignment, separator, values)
    }

    def read_langastTruthTableAssignment(): org.sireum.lang.ast.TruthTable.Assignment = {
      val r = read_langastTruthTableAssignmentT(F)
      return r
    }

    def read_langastTruthTableAssignmentT(typeParsed: B): org.sireum.lang.ast.TruthTable.Assignment = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastTruthTableAssignment)
      }
      val values = reader.readISZ(read_langastExpLitB _)
      val attr = read_langastAttr()
      return org.sireum.lang.ast.TruthTable.Assignment(values, attr)
    }

    def read_langastTruthTableConclusion(): org.sireum.lang.ast.TruthTable.Conclusion = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants._langastTruthTableConclusionValidity => val r = read_langastTruthTableConclusionValidityT(T); return r
        case Constants._langastTruthTableConclusionTautology => val r = read_langastTruthTableConclusionTautologyT(T); return r
        case Constants._langastTruthTableConclusionContradictory => val r = read_langastTruthTableConclusionContradictoryT(T); return r
        case Constants._langastTruthTableConclusionContingent => val r = read_langastTruthTableConclusionContingentT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of org.sireum.lang.ast.TruthTable.Conclusion.")
          val r = read_langastTruthTableConclusionContingentT(T)
          return r
      }
    }

    def read_langastTruthTableConclusionValidity(): org.sireum.lang.ast.TruthTable.Conclusion.Validity = {
      val r = read_langastTruthTableConclusionValidityT(F)
      return r
    }

    def read_langastTruthTableConclusionValidityT(typeParsed: B): org.sireum.lang.ast.TruthTable.Conclusion.Validity = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastTruthTableConclusionValidity)
      }
      val isValid = reader.readB()
      val assignments = reader.readISZ(read_langastTruthTableAssignment _)
      val attr = read_langastAttr()
      return org.sireum.lang.ast.TruthTable.Conclusion.Validity(isValid, assignments, attr)
    }

    def read_langastTruthTableConclusionTautology(): org.sireum.lang.ast.TruthTable.Conclusion.Tautology = {
      val r = read_langastTruthTableConclusionTautologyT(F)
      return r
    }

    def read_langastTruthTableConclusionTautologyT(typeParsed: B): org.sireum.lang.ast.TruthTable.Conclusion.Tautology = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastTruthTableConclusionTautology)
      }
      val attr = read_langastAttr()
      return org.sireum.lang.ast.TruthTable.Conclusion.Tautology(attr)
    }

    def read_langastTruthTableConclusionContradictory(): org.sireum.lang.ast.TruthTable.Conclusion.Contradictory = {
      val r = read_langastTruthTableConclusionContradictoryT(F)
      return r
    }

    def read_langastTruthTableConclusionContradictoryT(typeParsed: B): org.sireum.lang.ast.TruthTable.Conclusion.Contradictory = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastTruthTableConclusionContradictory)
      }
      val attr = read_langastAttr()
      return org.sireum.lang.ast.TruthTable.Conclusion.Contradictory(attr)
    }

    def read_langastTruthTableConclusionContingent(): org.sireum.lang.ast.TruthTable.Conclusion.Contingent = {
      val r = read_langastTruthTableConclusionContingentT(F)
      return r
    }

    def read_langastTruthTableConclusionContingentT(typeParsed: B): org.sireum.lang.ast.TruthTable.Conclusion.Contingent = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastTruthTableConclusionContingent)
      }
      val trueAssignments = reader.readISZ(read_langastTruthTableAssignment _)
      val falseAssignments = reader.readISZ(read_langastTruthTableAssignment _)
      val attr = read_langastAttr()
      return org.sireum.lang.ast.TruthTable.Conclusion.Contingent(trueAssignments, falseAssignments, attr)
    }

    def read_langastMethodModeType(): org.sireum.lang.ast.MethodMode.Type = {
      val r = reader.readZ()
      return org.sireum.lang.ast.MethodMode.byOrdinal(r).get
    }

    def read_langastTyped(): org.sireum.lang.ast.Typed = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants._langastTypedName => val r = read_langastTypedNameT(T); return r
        case Constants._langastTypedTuple => val r = read_langastTypedTupleT(T); return r
        case Constants._langastTypedFun => val r = read_langastTypedFunT(T); return r
        case Constants._langastTypedTypeVar => val r = read_langastTypedTypeVarT(T); return r
        case Constants._langastTypedPackage => val r = read_langastTypedPackageT(T); return r
        case Constants._langastTypedObject => val r = read_langastTypedObjectT(T); return r
        case Constants._langastTypedEnum => val r = read_langastTypedEnumT(T); return r
        case Constants._langastTypedMethod => val r = read_langastTypedMethodT(T); return r
        case Constants._langastTypedMethods => val r = read_langastTypedMethodsT(T); return r
        case Constants._langastTypedFact => val r = read_langastTypedFactT(T); return r
        case Constants._langastTypedTheorem => val r = read_langastTypedTheoremT(T); return r
        case Constants._langastTypedInv => val r = read_langastTypedInvT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of org.sireum.lang.ast.Typed.")
          val r = read_langastTypedInvT(T)
          return r
      }
    }

    def read_langastTypedName(): org.sireum.lang.ast.Typed.Name = {
      val r = read_langastTypedNameT(F)
      return r
    }

    def read_langastTypedNameT(typeParsed: B): org.sireum.lang.ast.Typed.Name = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastTypedName)
      }
      val ids = reader.readISZ(reader.readString _)
      val args = reader.readISZ(read_langastTyped _)
      return org.sireum.lang.ast.Typed.Name(ids, args)
    }

    def read_langastTypedTuple(): org.sireum.lang.ast.Typed.Tuple = {
      val r = read_langastTypedTupleT(F)
      return r
    }

    def read_langastTypedTupleT(typeParsed: B): org.sireum.lang.ast.Typed.Tuple = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastTypedTuple)
      }
      val args = reader.readISZ(read_langastTyped _)
      return org.sireum.lang.ast.Typed.Tuple(args)
    }

    def read_langastTypedFun(): org.sireum.lang.ast.Typed.Fun = {
      val r = read_langastTypedFunT(F)
      return r
    }

    def read_langastTypedFunT(typeParsed: B): org.sireum.lang.ast.Typed.Fun = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastTypedFun)
      }
      val isPure = reader.readB()
      val isByName = reader.readB()
      val args = reader.readISZ(read_langastTyped _)
      val ret = read_langastTyped()
      return org.sireum.lang.ast.Typed.Fun(isPure, isByName, args, ret)
    }

    def read_langastTypedTypeVar(): org.sireum.lang.ast.Typed.TypeVar = {
      val r = read_langastTypedTypeVarT(F)
      return r
    }

    def read_langastTypedTypeVarT(typeParsed: B): org.sireum.lang.ast.Typed.TypeVar = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastTypedTypeVar)
      }
      val id = reader.readString()
      val isImmutable = reader.readB()
      return org.sireum.lang.ast.Typed.TypeVar(id, isImmutable)
    }

    def read_langastTypedPackage(): org.sireum.lang.ast.Typed.Package = {
      val r = read_langastTypedPackageT(F)
      return r
    }

    def read_langastTypedPackageT(typeParsed: B): org.sireum.lang.ast.Typed.Package = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastTypedPackage)
      }
      val name = reader.readISZ(reader.readString _)
      return org.sireum.lang.ast.Typed.Package(name)
    }

    def read_langastTypedObject(): org.sireum.lang.ast.Typed.Object = {
      val r = read_langastTypedObjectT(F)
      return r
    }

    def read_langastTypedObjectT(typeParsed: B): org.sireum.lang.ast.Typed.Object = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastTypedObject)
      }
      val owner = reader.readISZ(reader.readString _)
      val id = reader.readString()
      return org.sireum.lang.ast.Typed.Object(owner, id)
    }

    def read_langastTypedEnum(): org.sireum.lang.ast.Typed.Enum = {
      val r = read_langastTypedEnumT(F)
      return r
    }

    def read_langastTypedEnumT(typeParsed: B): org.sireum.lang.ast.Typed.Enum = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastTypedEnum)
      }
      val name = reader.readISZ(reader.readString _)
      return org.sireum.lang.ast.Typed.Enum(name)
    }

    def read_langastTypedMethod(): org.sireum.lang.ast.Typed.Method = {
      val r = read_langastTypedMethodT(F)
      return r
    }

    def read_langastTypedMethodT(typeParsed: B): org.sireum.lang.ast.Typed.Method = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastTypedMethod)
      }
      val isInObject = reader.readB()
      val mode = read_langastMethodModeType()
      val typeParams = reader.readISZ(reader.readString _)
      val owner = reader.readISZ(reader.readString _)
      val name = reader.readString()
      val paramNames = reader.readISZ(reader.readString _)
      val tpe = read_langastTypedFun()
      return org.sireum.lang.ast.Typed.Method(isInObject, mode, typeParams, owner, name, paramNames, tpe)
    }

    def read_langastTypedMethods(): org.sireum.lang.ast.Typed.Methods = {
      val r = read_langastTypedMethodsT(F)
      return r
    }

    def read_langastTypedMethodsT(typeParsed: B): org.sireum.lang.ast.Typed.Methods = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastTypedMethods)
      }
      val methods = reader.readISZ(read_langastTypedMethod _)
      return org.sireum.lang.ast.Typed.Methods(methods)
    }

    def read_langastTypedFact(): org.sireum.lang.ast.Typed.Fact = {
      val r = read_langastTypedFactT(F)
      return r
    }

    def read_langastTypedFactT(typeParsed: B): org.sireum.lang.ast.Typed.Fact = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastTypedFact)
      }
      val owner = reader.readISZ(reader.readString _)
      val id = reader.readString()
      return org.sireum.lang.ast.Typed.Fact(owner, id)
    }

    def read_langastTypedTheorem(): org.sireum.lang.ast.Typed.Theorem = {
      val r = read_langastTypedTheoremT(F)
      return r
    }

    def read_langastTypedTheoremT(typeParsed: B): org.sireum.lang.ast.Typed.Theorem = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastTypedTheorem)
      }
      val owner = reader.readISZ(reader.readString _)
      val id = reader.readString()
      return org.sireum.lang.ast.Typed.Theorem(owner, id)
    }

    def read_langastTypedInv(): org.sireum.lang.ast.Typed.Inv = {
      val r = read_langastTypedInvT(F)
      return r
    }

    def read_langastTypedInvT(typeParsed: B): org.sireum.lang.ast.Typed.Inv = {
      if (!typeParsed) {
        reader.expectZ(Constants._langastTypedInv)
      }
      val isInObject = reader.readB()
      val owner = reader.readISZ(reader.readString _)
      val id = reader.readString()
      return org.sireum.lang.ast.Typed.Inv(isInObject, owner, id)
    }

  }

  def to[T](data: ISZ[U8], f: Reader => T): Either[T, MessagePack.ErrorMsg] = {
    val rd = Reader.Default(MessagePack.reader(data))
    rd.reader.init()
    val r = f(rd)
    rd.errorOpt match {
      case Some(e) => return Either.Right(e)
      case _ => return Either.Left(r)
    }
  }

  def fromAadlInstInfo(o: AadlInstInfo, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeAadlInstInfo(o)
    return w.result
  }

  def toAadlInstInfo(data: ISZ[U8]): Either[AadlInstInfo, MessagePack.ErrorMsg] = {
    def fAadlInstInfo(reader: Reader): AadlInstInfo = {
      val r = reader.readAadlInstInfo()
      return r
    }
    val r = to(data, fAadlInstInfo _)
    return r
  }

  def fromAadl(o: Aadl, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeAadl(o)
    return w.result
  }

  def toAadl(data: ISZ[U8]): Either[Aadl, MessagePack.ErrorMsg] = {
    def fAadl(reader: Reader): Aadl = {
      val r = reader.readAadl()
      return r
    }
    val r = to(data, fAadl _)
    return r
  }

  def fromName(o: Name, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeName(o)
    return w.result
  }

  def toName(data: ISZ[U8]): Either[Name, MessagePack.ErrorMsg] = {
    def fName(reader: Reader): Name = {
      val r = reader.readName()
      return r
    }
    val r = to(data, fName _)
    return r
  }

  def fromComponent(o: Component, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeComponent(o)
    return w.result
  }

  def toComponent(data: ISZ[U8]): Either[Component, MessagePack.ErrorMsg] = {
    def fComponent(reader: Reader): Component = {
      val r = reader.readComponent()
      return r
    }
    val r = to(data, fComponent _)
    return r
  }

  def fromClassifier(o: Classifier, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeClassifier(o)
    return w.result
  }

  def toClassifier(data: ISZ[U8]): Either[Classifier, MessagePack.ErrorMsg] = {
    def fClassifier(reader: Reader): Classifier = {
      val r = reader.readClassifier()
      return r
    }
    val r = to(data, fClassifier _)
    return r
  }

  def fromFeature(o: Feature, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFeature(o)
    return w.result
  }

  def toFeature(data: ISZ[U8]): Either[Feature, MessagePack.ErrorMsg] = {
    def fFeature(reader: Reader): Feature = {
      val r = reader.readFeature()
      return r
    }
    val r = to(data, fFeature _)
    return r
  }

  def fromFeatureEnd(o: FeatureEnd, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFeatureEnd(o)
    return w.result
  }

  def toFeatureEnd(data: ISZ[U8]): Either[FeatureEnd, MessagePack.ErrorMsg] = {
    def fFeatureEnd(reader: Reader): FeatureEnd = {
      val r = reader.readFeatureEnd()
      return r
    }
    val r = to(data, fFeatureEnd _)
    return r
  }

  def fromFeatureGroup(o: FeatureGroup, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFeatureGroup(o)
    return w.result
  }

  def toFeatureGroup(data: ISZ[U8]): Either[FeatureGroup, MessagePack.ErrorMsg] = {
    def fFeatureGroup(reader: Reader): FeatureGroup = {
      val r = reader.readFeatureGroup()
      return r
    }
    val r = to(data, fFeatureGroup _)
    return r
  }

  def fromFeatureAccess(o: FeatureAccess, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFeatureAccess(o)
    return w.result
  }

  def toFeatureAccess(data: ISZ[U8]): Either[FeatureAccess, MessagePack.ErrorMsg] = {
    def fFeatureAccess(reader: Reader): FeatureAccess = {
      val r = reader.readFeatureAccess()
      return r
    }
    val r = to(data, fFeatureAccess _)
    return r
  }

  def fromConnection(o: Connection, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeConnection(o)
    return w.result
  }

  def toConnection(data: ISZ[U8]): Either[Connection, MessagePack.ErrorMsg] = {
    def fConnection(reader: Reader): Connection = {
      val r = reader.readConnection()
      return r
    }
    val r = to(data, fConnection _)
    return r
  }

  def fromConnectionInstance(o: ConnectionInstance, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeConnectionInstance(o)
    return w.result
  }

  def toConnectionInstance(data: ISZ[U8]): Either[ConnectionInstance, MessagePack.ErrorMsg] = {
    def fConnectionInstance(reader: Reader): ConnectionInstance = {
      val r = reader.readConnectionInstance()
      return r
    }
    val r = to(data, fConnectionInstance _)
    return r
  }

  def fromConnectionReference(o: ConnectionReference, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeConnectionReference(o)
    return w.result
  }

  def toConnectionReference(data: ISZ[U8]): Either[ConnectionReference, MessagePack.ErrorMsg] = {
    def fConnectionReference(reader: Reader): ConnectionReference = {
      val r = reader.readConnectionReference()
      return r
    }
    val r = to(data, fConnectionReference _)
    return r
  }

  def fromEndPoint(o: EndPoint, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEndPoint(o)
    return w.result
  }

  def toEndPoint(data: ISZ[U8]): Either[EndPoint, MessagePack.ErrorMsg] = {
    def fEndPoint(reader: Reader): EndPoint = {
      val r = reader.readEndPoint()
      return r
    }
    val r = to(data, fEndPoint _)
    return r
  }

  def fromProperty(o: Property, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProperty(o)
    return w.result
  }

  def toProperty(data: ISZ[U8]): Either[Property, MessagePack.ErrorMsg] = {
    def fProperty(reader: Reader): Property = {
      val r = reader.readProperty()
      return r
    }
    val r = to(data, fProperty _)
    return r
  }

  def fromElementRef(o: ElementRef, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeElementRef(o)
    return w.result
  }

  def toElementRef(data: ISZ[U8]): Either[ElementRef, MessagePack.ErrorMsg] = {
    def fElementRef(reader: Reader): ElementRef = {
      val r = reader.readElementRef()
      return r
    }
    val r = to(data, fElementRef _)
    return r
  }

  def fromAadlElementRef(o: AadlElementRef, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeAadlElementRef(o)
    return w.result
  }

  def toAadlElementRef(data: ISZ[U8]): Either[AadlElementRef, MessagePack.ErrorMsg] = {
    def fAadlElementRef(reader: Reader): AadlElementRef = {
      val r = reader.readAadlElementRef()
      return r
    }
    val r = to(data, fAadlElementRef _)
    return r
  }

  def fromPropertyValue(o: PropertyValue, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePropertyValue(o)
    return w.result
  }

  def toPropertyValue(data: ISZ[U8]): Either[PropertyValue, MessagePack.ErrorMsg] = {
    def fPropertyValue(reader: Reader): PropertyValue = {
      val r = reader.readPropertyValue()
      return r
    }
    val r = to(data, fPropertyValue _)
    return r
  }

  def fromClassifierProp(o: ClassifierProp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeClassifierProp(o)
    return w.result
  }

  def toClassifierProp(data: ISZ[U8]): Either[ClassifierProp, MessagePack.ErrorMsg] = {
    def fClassifierProp(reader: Reader): ClassifierProp = {
      val r = reader.readClassifierProp()
      return r
    }
    val r = to(data, fClassifierProp _)
    return r
  }

  def fromRangeProp(o: RangeProp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeRangeProp(o)
    return w.result
  }

  def toRangeProp(data: ISZ[U8]): Either[RangeProp, MessagePack.ErrorMsg] = {
    def fRangeProp(reader: Reader): RangeProp = {
      val r = reader.readRangeProp()
      return r
    }
    val r = to(data, fRangeProp _)
    return r
  }

  def fromRecordProp(o: RecordProp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeRecordProp(o)
    return w.result
  }

  def toRecordProp(data: ISZ[U8]): Either[RecordProp, MessagePack.ErrorMsg] = {
    def fRecordProp(reader: Reader): RecordProp = {
      val r = reader.readRecordProp()
      return r
    }
    val r = to(data, fRecordProp _)
    return r
  }

  def fromReferenceProp(o: ReferenceProp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeReferenceProp(o)
    return w.result
  }

  def toReferenceProp(data: ISZ[U8]): Either[ReferenceProp, MessagePack.ErrorMsg] = {
    def fReferenceProp(reader: Reader): ReferenceProp = {
      val r = reader.readReferenceProp()
      return r
    }
    val r = to(data, fReferenceProp _)
    return r
  }

  def fromUnitProp(o: UnitProp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeUnitProp(o)
    return w.result
  }

  def toUnitProp(data: ISZ[U8]): Either[UnitProp, MessagePack.ErrorMsg] = {
    def fUnitProp(reader: Reader): UnitProp = {
      val r = reader.readUnitProp()
      return r
    }
    val r = to(data, fUnitProp _)
    return r
  }

  def fromValueProp(o: ValueProp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeValueProp(o)
    return w.result
  }

  def toValueProp(data: ISZ[U8]): Either[ValueProp, MessagePack.ErrorMsg] = {
    def fValueProp(reader: Reader): ValueProp = {
      val r = reader.readValueProp()
      return r
    }
    val r = to(data, fValueProp _)
    return r
  }

  def fromMode(o: Mode, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMode(o)
    return w.result
  }

  def toMode(data: ISZ[U8]): Either[Mode, MessagePack.ErrorMsg] = {
    def fMode(reader: Reader): Mode = {
      val r = reader.readMode()
      return r
    }
    val r = to(data, fMode _)
    return r
  }

  def fromFlow(o: Flow, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFlow(o)
    return w.result
  }

  def toFlow(data: ISZ[U8]): Either[Flow, MessagePack.ErrorMsg] = {
    def fFlow(reader: Reader): Flow = {
      val r = reader.readFlow()
      return r
    }
    val r = to(data, fFlow _)
    return r
  }

  def fromAnnex(o: Annex, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeAnnex(o)
    return w.result
  }

  def toAnnex(data: ISZ[U8]): Either[Annex, MessagePack.ErrorMsg] = {
    def fAnnex(reader: Reader): Annex = {
      val r = reader.readAnnex()
      return r
    }
    val r = to(data, fAnnex _)
    return r
  }

  def fromAnnexClause(o: AnnexClause, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeAnnexClause(o)
    return w.result
  }

  def toAnnexClause(data: ISZ[U8]): Either[AnnexClause, MessagePack.ErrorMsg] = {
    def fAnnexClause(reader: Reader): AnnexClause = {
      val r = reader.readAnnexClause()
      return r
    }
    val r = to(data, fAnnexClause _)
    return r
  }

  def fromAnnexLib(o: AnnexLib, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeAnnexLib(o)
    return w.result
  }

  def toAnnexLib(data: ISZ[U8]): Either[AnnexLib, MessagePack.ErrorMsg] = {
    def fAnnexLib(reader: Reader): AnnexLib = {
      val r = reader.readAnnexLib()
      return r
    }
    val r = to(data, fAnnexLib _)
    return r
  }

  def fromOtherAnnex(o: OtherAnnex, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOtherAnnex(o)
    return w.result
  }

  def toOtherAnnex(data: ISZ[U8]): Either[OtherAnnex, MessagePack.ErrorMsg] = {
    def fOtherAnnex(reader: Reader): OtherAnnex = {
      val r = reader.readOtherAnnex()
      return r
    }
    val r = to(data, fOtherAnnex _)
    return r
  }

  def fromOtherLib(o: OtherLib, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOtherLib(o)
    return w.result
  }

  def toOtherLib(data: ISZ[U8]): Either[OtherLib, MessagePack.ErrorMsg] = {
    def fOtherLib(reader: Reader): OtherLib = {
      val r = reader.readOtherLib()
      return r
    }
    val r = to(data, fOtherLib _)
    return r
  }

  def fromBLESSAnnex(o: BLESSAnnex, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBLESSAnnex(o)
    return w.result
  }

  def toBLESSAnnex(data: ISZ[U8]): Either[BLESSAnnex, MessagePack.ErrorMsg] = {
    def fBLESSAnnex(reader: Reader): BLESSAnnex = {
      val r = reader.readBLESSAnnex()
      return r
    }
    val r = to(data, fBLESSAnnex _)
    return r
  }

  def fromBTSSubclauseBehaviorProvider(o: BTSSubclauseBehaviorProvider, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSSubclauseBehaviorProvider(o)
    return w.result
  }

  def toBTSSubclauseBehaviorProvider(data: ISZ[U8]): Either[BTSSubclauseBehaviorProvider, MessagePack.ErrorMsg] = {
    def fBTSSubclauseBehaviorProvider(reader: Reader): BTSSubclauseBehaviorProvider = {
      val r = reader.readBTSSubclauseBehaviorProvider()
      return r
    }
    val r = to(data, fBTSSubclauseBehaviorProvider _)
    return r
  }

  def fromBTSResource(o: BTSResource, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSResource(o)
    return w.result
  }

  def toBTSResource(data: ISZ[U8]): Either[BTSResource, MessagePack.ErrorMsg] = {
    def fBTSResource(reader: Reader): BTSResource = {
      val r = reader.readBTSResource()
      return r
    }
    val r = to(data, fBTSResource _)
    return r
  }

  def fromBTSText(o: BTSText, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSText(o)
    return w.result
  }

  def toBTSText(data: ISZ[U8]): Either[BTSText, MessagePack.ErrorMsg] = {
    def fBTSText(reader: Reader): BTSText = {
      val r = reader.readBTSText()
      return r
    }
    val r = to(data, fBTSText _)
    return r
  }

  def fromBTSPath(o: BTSPath, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSPath(o)
    return w.result
  }

  def toBTSPath(data: ISZ[U8]): Either[BTSPath, MessagePack.ErrorMsg] = {
    def fBTSPath(reader: Reader): BTSPath = {
      val r = reader.readBTSPath()
      return r
    }
    val r = to(data, fBTSPath _)
    return r
  }

  def fromBTSBLESSAnnexClause(o: BTSBLESSAnnexClause, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSBLESSAnnexClause(o)
    return w.result
  }

  def toBTSBLESSAnnexClause(data: ISZ[U8]): Either[BTSBLESSAnnexClause, MessagePack.ErrorMsg] = {
    def fBTSBLESSAnnexClause(reader: Reader): BTSBLESSAnnexClause = {
      val r = reader.readBTSBLESSAnnexClause()
      return r
    }
    val r = to(data, fBTSBLESSAnnexClause _)
    return r
  }

  def fromBTSVariableDeclaration(o: BTSVariableDeclaration, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSVariableDeclaration(o)
    return w.result
  }

  def toBTSVariableDeclaration(data: ISZ[U8]): Either[BTSVariableDeclaration, MessagePack.ErrorMsg] = {
    def fBTSVariableDeclaration(reader: Reader): BTSVariableDeclaration = {
      val r = reader.readBTSVariableDeclaration()
      return r
    }
    val r = to(data, fBTSVariableDeclaration _)
    return r
  }

  def fromBTSType(o: BTSType, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSType(o)
    return w.result
  }

  def toBTSType(data: ISZ[U8]): Either[BTSType, MessagePack.ErrorMsg] = {
    def fBTSType(reader: Reader): BTSType = {
      val r = reader.readBTSType()
      return r
    }
    val r = to(data, fBTSType _)
    return r
  }

  def fromBTSClassifier(o: BTSClassifier, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSClassifier(o)
    return w.result
  }

  def toBTSClassifier(data: ISZ[U8]): Either[BTSClassifier, MessagePack.ErrorMsg] = {
    def fBTSClassifier(reader: Reader): BTSClassifier = {
      val r = reader.readBTSClassifier()
      return r
    }
    val r = to(data, fBTSClassifier _)
    return r
  }

  def fromBLESSIntConst(o: BLESSIntConst, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBLESSIntConst(o)
    return w.result
  }

  def toBLESSIntConst(data: ISZ[U8]): Either[BLESSIntConst, MessagePack.ErrorMsg] = {
    def fBLESSIntConst(reader: Reader): BLESSIntConst = {
      val r = reader.readBLESSIntConst()
      return r
    }
    val r = to(data, fBLESSIntConst _)
    return r
  }

  def fromBTSStateDeclaration(o: BTSStateDeclaration, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSStateDeclaration(o)
    return w.result
  }

  def toBTSStateDeclaration(data: ISZ[U8]): Either[BTSStateDeclaration, MessagePack.ErrorMsg] = {
    def fBTSStateDeclaration(reader: Reader): BTSStateDeclaration = {
      val r = reader.readBTSStateDeclaration()
      return r
    }
    val r = to(data, fBTSStateDeclaration _)
    return r
  }

  def fromBTSTransition(o: BTSTransition, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSTransition(o)
    return w.result
  }

  def toBTSTransition(data: ISZ[U8]): Either[BTSTransition, MessagePack.ErrorMsg] = {
    def fBTSTransition(reader: Reader): BTSTransition = {
      val r = reader.readBTSTransition()
      return r
    }
    val r = to(data, fBTSTransition _)
    return r
  }

  def fromBTSTransitionLabel(o: BTSTransitionLabel, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSTransitionLabel(o)
    return w.result
  }

  def toBTSTransitionLabel(data: ISZ[U8]): Either[BTSTransitionLabel, MessagePack.ErrorMsg] = {
    def fBTSTransitionLabel(reader: Reader): BTSTransitionLabel = {
      val r = reader.readBTSTransitionLabel()
      return r
    }
    val r = to(data, fBTSTransitionLabel _)
    return r
  }

  def fromBTSTransitionCondition(o: BTSTransitionCondition, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSTransitionCondition(o)
    return w.result
  }

  def toBTSTransitionCondition(data: ISZ[U8]): Either[BTSTransitionCondition, MessagePack.ErrorMsg] = {
    def fBTSTransitionCondition(reader: Reader): BTSTransitionCondition = {
      val r = reader.readBTSTransitionCondition()
      return r
    }
    val r = to(data, fBTSTransitionCondition _)
    return r
  }

  def fromBTSDispatchCondition(o: BTSDispatchCondition, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSDispatchCondition(o)
    return w.result
  }

  def toBTSDispatchCondition(data: ISZ[U8]): Either[BTSDispatchCondition, MessagePack.ErrorMsg] = {
    def fBTSDispatchCondition(reader: Reader): BTSDispatchCondition = {
      val r = reader.readBTSDispatchCondition()
      return r
    }
    val r = to(data, fBTSDispatchCondition _)
    return r
  }

  def fromBTSDispatchConjunction(o: BTSDispatchConjunction, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSDispatchConjunction(o)
    return w.result
  }

  def toBTSDispatchConjunction(data: ISZ[U8]): Either[BTSDispatchConjunction, MessagePack.ErrorMsg] = {
    def fBTSDispatchConjunction(reader: Reader): BTSDispatchConjunction = {
      val r = reader.readBTSDispatchConjunction()
      return r
    }
    val r = to(data, fBTSDispatchConjunction _)
    return r
  }

  def fromBTSDispatchTrigger(o: BTSDispatchTrigger, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSDispatchTrigger(o)
    return w.result
  }

  def toBTSDispatchTrigger(data: ISZ[U8]): Either[BTSDispatchTrigger, MessagePack.ErrorMsg] = {
    def fBTSDispatchTrigger(reader: Reader): BTSDispatchTrigger = {
      val r = reader.readBTSDispatchTrigger()
      return r
    }
    val r = to(data, fBTSDispatchTrigger _)
    return r
  }

  def fromBTSDispatchTriggerStop(o: BTSDispatchTriggerStop, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSDispatchTriggerStop(o)
    return w.result
  }

  def toBTSDispatchTriggerStop(data: ISZ[U8]): Either[BTSDispatchTriggerStop, MessagePack.ErrorMsg] = {
    def fBTSDispatchTriggerStop(reader: Reader): BTSDispatchTriggerStop = {
      val r = reader.readBTSDispatchTriggerStop()
      return r
    }
    val r = to(data, fBTSDispatchTriggerStop _)
    return r
  }

  def fromBTSDispatchTriggerPort(o: BTSDispatchTriggerPort, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSDispatchTriggerPort(o)
    return w.result
  }

  def toBTSDispatchTriggerPort(data: ISZ[U8]): Either[BTSDispatchTriggerPort, MessagePack.ErrorMsg] = {
    def fBTSDispatchTriggerPort(reader: Reader): BTSDispatchTriggerPort = {
      val r = reader.readBTSDispatchTriggerPort()
      return r
    }
    val r = to(data, fBTSDispatchTriggerPort _)
    return r
  }

  def fromBTSDispatchTriggerTimeout(o: BTSDispatchTriggerTimeout, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSDispatchTriggerTimeout(o)
    return w.result
  }

  def toBTSDispatchTriggerTimeout(data: ISZ[U8]): Either[BTSDispatchTriggerTimeout, MessagePack.ErrorMsg] = {
    def fBTSDispatchTriggerTimeout(reader: Reader): BTSDispatchTriggerTimeout = {
      val r = reader.readBTSDispatchTriggerTimeout()
      return r
    }
    val r = to(data, fBTSDispatchTriggerTimeout _)
    return r
  }

  def fromBTSExecuteCondition(o: BTSExecuteCondition, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSExecuteCondition(o)
    return w.result
  }

  def toBTSExecuteCondition(data: ISZ[U8]): Either[BTSExecuteCondition, MessagePack.ErrorMsg] = {
    def fBTSExecuteCondition(reader: Reader): BTSExecuteCondition = {
      val r = reader.readBTSExecuteCondition()
      return r
    }
    val r = to(data, fBTSExecuteCondition _)
    return r
  }

  def fromBTSExecuteConditionExp(o: BTSExecuteConditionExp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSExecuteConditionExp(o)
    return w.result
  }

  def toBTSExecuteConditionExp(data: ISZ[U8]): Either[BTSExecuteConditionExp, MessagePack.ErrorMsg] = {
    def fBTSExecuteConditionExp(reader: Reader): BTSExecuteConditionExp = {
      val r = reader.readBTSExecuteConditionExp()
      return r
    }
    val r = to(data, fBTSExecuteConditionExp _)
    return r
  }

  def fromBTSExecuteConditionTimeout(o: BTSExecuteConditionTimeout, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSExecuteConditionTimeout(o)
    return w.result
  }

  def toBTSExecuteConditionTimeout(data: ISZ[U8]): Either[BTSExecuteConditionTimeout, MessagePack.ErrorMsg] = {
    def fBTSExecuteConditionTimeout(reader: Reader): BTSExecuteConditionTimeout = {
      val r = reader.readBTSExecuteConditionTimeout()
      return r
    }
    val r = to(data, fBTSExecuteConditionTimeout _)
    return r
  }

  def fromBTSExecuteConditionOtherwise(o: BTSExecuteConditionOtherwise, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSExecuteConditionOtherwise(o)
    return w.result
  }

  def toBTSExecuteConditionOtherwise(data: ISZ[U8]): Either[BTSExecuteConditionOtherwise, MessagePack.ErrorMsg] = {
    def fBTSExecuteConditionOtherwise(reader: Reader): BTSExecuteConditionOtherwise = {
      val r = reader.readBTSExecuteConditionOtherwise()
      return r
    }
    val r = to(data, fBTSExecuteConditionOtherwise _)
    return r
  }

  def fromBTSModeCondition(o: BTSModeCondition, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSModeCondition(o)
    return w.result
  }

  def toBTSModeCondition(data: ISZ[U8]): Either[BTSModeCondition, MessagePack.ErrorMsg] = {
    def fBTSModeCondition(reader: Reader): BTSModeCondition = {
      val r = reader.readBTSModeCondition()
      return r
    }
    val r = to(data, fBTSModeCondition _)
    return r
  }

  def fromBTSInternalCondition(o: BTSInternalCondition, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSInternalCondition(o)
    return w.result
  }

  def toBTSInternalCondition(data: ISZ[U8]): Either[BTSInternalCondition, MessagePack.ErrorMsg] = {
    def fBTSInternalCondition(reader: Reader): BTSInternalCondition = {
      val r = reader.readBTSInternalCondition()
      return r
    }
    val r = to(data, fBTSInternalCondition _)
    return r
  }

  def fromBTSAssertion(o: BTSAssertion, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSAssertion(o)
    return w.result
  }

  def toBTSAssertion(data: ISZ[U8]): Either[BTSAssertion, MessagePack.ErrorMsg] = {
    def fBTSAssertion(reader: Reader): BTSAssertion = {
      val r = reader.readBTSAssertion()
      return r
    }
    val r = to(data, fBTSAssertion _)
    return r
  }

  def fromBTSBehaviorActions(o: BTSBehaviorActions, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSBehaviorActions(o)
    return w.result
  }

  def toBTSBehaviorActions(data: ISZ[U8]): Either[BTSBehaviorActions, MessagePack.ErrorMsg] = {
    def fBTSBehaviorActions(reader: Reader): BTSBehaviorActions = {
      val r = reader.readBTSBehaviorActions()
      return r
    }
    val r = to(data, fBTSBehaviorActions _)
    return r
  }

  def fromBTSAssertedAction(o: BTSAssertedAction, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSAssertedAction(o)
    return w.result
  }

  def toBTSAssertedAction(data: ISZ[U8]): Either[BTSAssertedAction, MessagePack.ErrorMsg] = {
    def fBTSAssertedAction(reader: Reader): BTSAssertedAction = {
      val r = reader.readBTSAssertedAction()
      return r
    }
    val r = to(data, fBTSAssertedAction _)
    return r
  }

  def fromBTSAction(o: BTSAction, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSAction(o)
    return w.result
  }

  def toBTSAction(data: ISZ[U8]): Either[BTSAction, MessagePack.ErrorMsg] = {
    def fBTSAction(reader: Reader): BTSAction = {
      val r = reader.readBTSAction()
      return r
    }
    val r = to(data, fBTSAction _)
    return r
  }

  def fromBTSBasicAction(o: BTSBasicAction, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSBasicAction(o)
    return w.result
  }

  def toBTSBasicAction(data: ISZ[U8]): Either[BTSBasicAction, MessagePack.ErrorMsg] = {
    def fBTSBasicAction(reader: Reader): BTSBasicAction = {
      val r = reader.readBTSBasicAction()
      return r
    }
    val r = to(data, fBTSBasicAction _)
    return r
  }

  def fromBTSSkipAction(o: BTSSkipAction, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSSkipAction(o)
    return w.result
  }

  def toBTSSkipAction(data: ISZ[U8]): Either[BTSSkipAction, MessagePack.ErrorMsg] = {
    def fBTSSkipAction(reader: Reader): BTSSkipAction = {
      val r = reader.readBTSSkipAction()
      return r
    }
    val r = to(data, fBTSSkipAction _)
    return r
  }

  def fromBTSAssignmentAction(o: BTSAssignmentAction, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSAssignmentAction(o)
    return w.result
  }

  def toBTSAssignmentAction(data: ISZ[U8]): Either[BTSAssignmentAction, MessagePack.ErrorMsg] = {
    def fBTSAssignmentAction(reader: Reader): BTSAssignmentAction = {
      val r = reader.readBTSAssignmentAction()
      return r
    }
    val r = to(data, fBTSAssignmentAction _)
    return r
  }

  def fromBTSCommunicationAction(o: BTSCommunicationAction, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSCommunicationAction(o)
    return w.result
  }

  def toBTSCommunicationAction(data: ISZ[U8]): Either[BTSCommunicationAction, MessagePack.ErrorMsg] = {
    def fBTSCommunicationAction(reader: Reader): BTSCommunicationAction = {
      val r = reader.readBTSCommunicationAction()
      return r
    }
    val r = to(data, fBTSCommunicationAction _)
    return r
  }

  def fromBTSSubprogramCallAction(o: BTSSubprogramCallAction, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSSubprogramCallAction(o)
    return w.result
  }

  def toBTSSubprogramCallAction(data: ISZ[U8]): Either[BTSSubprogramCallAction, MessagePack.ErrorMsg] = {
    def fBTSSubprogramCallAction(reader: Reader): BTSSubprogramCallAction = {
      val r = reader.readBTSSubprogramCallAction()
      return r
    }
    val r = to(data, fBTSSubprogramCallAction _)
    return r
  }

  def fromBTSPortOutAction(o: BTSPortOutAction, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSPortOutAction(o)
    return w.result
  }

  def toBTSPortOutAction(data: ISZ[U8]): Either[BTSPortOutAction, MessagePack.ErrorMsg] = {
    def fBTSPortOutAction(reader: Reader): BTSPortOutAction = {
      val r = reader.readBTSPortOutAction()
      return r
    }
    val r = to(data, fBTSPortOutAction _)
    return r
  }

  def fromBTSPortInAction(o: BTSPortInAction, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSPortInAction(o)
    return w.result
  }

  def toBTSPortInAction(data: ISZ[U8]): Either[BTSPortInAction, MessagePack.ErrorMsg] = {
    def fBTSPortInAction(reader: Reader): BTSPortInAction = {
      val r = reader.readBTSPortInAction()
      return r
    }
    val r = to(data, fBTSPortInAction _)
    return r
  }

  def fromBTSFrozenPortAction(o: BTSFrozenPortAction, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSFrozenPortAction(o)
    return w.result
  }

  def toBTSFrozenPortAction(data: ISZ[U8]): Either[BTSFrozenPortAction, MessagePack.ErrorMsg] = {
    def fBTSFrozenPortAction(reader: Reader): BTSFrozenPortAction = {
      val r = reader.readBTSFrozenPortAction()
      return r
    }
    val r = to(data, fBTSFrozenPortAction _)
    return r
  }

  def fromBTSControlAction(o: BTSControlAction, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSControlAction(o)
    return w.result
  }

  def toBTSControlAction(data: ISZ[U8]): Either[BTSControlAction, MessagePack.ErrorMsg] = {
    def fBTSControlAction(reader: Reader): BTSControlAction = {
      val r = reader.readBTSControlAction()
      return r
    }
    val r = to(data, fBTSControlAction _)
    return r
  }

  def fromBTSIfBLESSAction(o: BTSIfBLESSAction, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSIfBLESSAction(o)
    return w.result
  }

  def toBTSIfBLESSAction(data: ISZ[U8]): Either[BTSIfBLESSAction, MessagePack.ErrorMsg] = {
    def fBTSIfBLESSAction(reader: Reader): BTSIfBLESSAction = {
      val r = reader.readBTSIfBLESSAction()
      return r
    }
    val r = to(data, fBTSIfBLESSAction _)
    return r
  }

  def fromBTSGuardedAction(o: BTSGuardedAction, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSGuardedAction(o)
    return w.result
  }

  def toBTSGuardedAction(data: ISZ[U8]): Either[BTSGuardedAction, MessagePack.ErrorMsg] = {
    def fBTSGuardedAction(reader: Reader): BTSGuardedAction = {
      val r = reader.readBTSGuardedAction()
      return r
    }
    val r = to(data, fBTSGuardedAction _)
    return r
  }

  def fromBTSIfBAAction(o: BTSIfBAAction, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSIfBAAction(o)
    return w.result
  }

  def toBTSIfBAAction(data: ISZ[U8]): Either[BTSIfBAAction, MessagePack.ErrorMsg] = {
    def fBTSIfBAAction(reader: Reader): BTSIfBAAction = {
      val r = reader.readBTSIfBAAction()
      return r
    }
    val r = to(data, fBTSIfBAAction _)
    return r
  }

  def fromBTSConditionalActions(o: BTSConditionalActions, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSConditionalActions(o)
    return w.result
  }

  def toBTSConditionalActions(data: ISZ[U8]): Either[BTSConditionalActions, MessagePack.ErrorMsg] = {
    def fBTSConditionalActions(reader: Reader): BTSConditionalActions = {
      val r = reader.readBTSConditionalActions()
      return r
    }
    val r = to(data, fBTSConditionalActions _)
    return r
  }

  def fromBTSQuantificationActions(o: BTSQuantificationActions, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSQuantificationActions(o)
    return w.result
  }

  def toBTSQuantificationActions(data: ISZ[U8]): Either[BTSQuantificationActions, MessagePack.ErrorMsg] = {
    def fBTSQuantificationActions(reader: Reader): BTSQuantificationActions = {
      val r = reader.readBTSQuantificationActions()
      return r
    }
    val r = to(data, fBTSQuantificationActions _)
    return r
  }

  def fromBTSExistentialLatticeQuantification(o: BTSExistentialLatticeQuantification, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSExistentialLatticeQuantification(o)
    return w.result
  }

  def toBTSExistentialLatticeQuantification(data: ISZ[U8]): Either[BTSExistentialLatticeQuantification, MessagePack.ErrorMsg] = {
    def fBTSExistentialLatticeQuantification(reader: Reader): BTSExistentialLatticeQuantification = {
      val r = reader.readBTSExistentialLatticeQuantification()
      return r
    }
    val r = to(data, fBTSExistentialLatticeQuantification _)
    return r
  }

  def fromBTSUniversalLatticeQuantification(o: BTSUniversalLatticeQuantification, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSUniversalLatticeQuantification(o)
    return w.result
  }

  def toBTSUniversalLatticeQuantification(data: ISZ[U8]): Either[BTSUniversalLatticeQuantification, MessagePack.ErrorMsg] = {
    def fBTSUniversalLatticeQuantification(reader: Reader): BTSUniversalLatticeQuantification = {
      val r = reader.readBTSUniversalLatticeQuantification()
      return r
    }
    val r = to(data, fBTSUniversalLatticeQuantification _)
    return r
  }

  def fromBTSExp(o: BTSExp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSExp(o)
    return w.result
  }

  def toBTSExp(data: ISZ[U8]): Either[BTSExp, MessagePack.ErrorMsg] = {
    def fBTSExp(reader: Reader): BTSExp = {
      val r = reader.readBTSExp()
      return r
    }
    val r = to(data, fBTSExp _)
    return r
  }

  def fromBTSUnaryExp(o: BTSUnaryExp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSUnaryExp(o)
    return w.result
  }

  def toBTSUnaryExp(data: ISZ[U8]): Either[BTSUnaryExp, MessagePack.ErrorMsg] = {
    def fBTSUnaryExp(reader: Reader): BTSUnaryExp = {
      val r = reader.readBTSUnaryExp()
      return r
    }
    val r = to(data, fBTSUnaryExp _)
    return r
  }

  def fromBTSBinaryExp(o: BTSBinaryExp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSBinaryExp(o)
    return w.result
  }

  def toBTSBinaryExp(data: ISZ[U8]): Either[BTSBinaryExp, MessagePack.ErrorMsg] = {
    def fBTSBinaryExp(reader: Reader): BTSBinaryExp = {
      val r = reader.readBTSBinaryExp()
      return r
    }
    val r = to(data, fBTSBinaryExp _)
    return r
  }

  def fromBTSLiteralExp(o: BTSLiteralExp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSLiteralExp(o)
    return w.result
  }

  def toBTSLiteralExp(data: ISZ[U8]): Either[BTSLiteralExp, MessagePack.ErrorMsg] = {
    def fBTSLiteralExp(reader: Reader): BTSLiteralExp = {
      val r = reader.readBTSLiteralExp()
      return r
    }
    val r = to(data, fBTSLiteralExp _)
    return r
  }

  def fromBTSNameExp(o: BTSNameExp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSNameExp(o)
    return w.result
  }

  def toBTSNameExp(data: ISZ[U8]): Either[BTSNameExp, MessagePack.ErrorMsg] = {
    def fBTSNameExp(reader: Reader): BTSNameExp = {
      val r = reader.readBTSNameExp()
      return r
    }
    val r = to(data, fBTSNameExp _)
    return r
  }

  def fromBTSIndexingExp(o: BTSIndexingExp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSIndexingExp(o)
    return w.result
  }

  def toBTSIndexingExp(data: ISZ[U8]): Either[BTSIndexingExp, MessagePack.ErrorMsg] = {
    def fBTSIndexingExp(reader: Reader): BTSIndexingExp = {
      val r = reader.readBTSIndexingExp()
      return r
    }
    val r = to(data, fBTSIndexingExp _)
    return r
  }

  def fromBTSAccessExp(o: BTSAccessExp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSAccessExp(o)
    return w.result
  }

  def toBTSAccessExp(data: ISZ[U8]): Either[BTSAccessExp, MessagePack.ErrorMsg] = {
    def fBTSAccessExp(reader: Reader): BTSAccessExp = {
      val r = reader.readBTSAccessExp()
      return r
    }
    val r = to(data, fBTSAccessExp _)
    return r
  }

  def fromBTSFunctionCall(o: BTSFunctionCall, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSFunctionCall(o)
    return w.result
  }

  def toBTSFunctionCall(data: ISZ[U8]): Either[BTSFunctionCall, MessagePack.ErrorMsg] = {
    def fBTSFunctionCall(reader: Reader): BTSFunctionCall = {
      val r = reader.readBTSFunctionCall()
      return r
    }
    val r = to(data, fBTSFunctionCall _)
    return r
  }

  def fromBTSFormalExpPair(o: BTSFormalExpPair, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSFormalExpPair(o)
    return w.result
  }

  def toBTSFormalExpPair(data: ISZ[U8]): Either[BTSFormalExpPair, MessagePack.ErrorMsg] = {
    def fBTSFormalExpPair(reader: Reader): BTSFormalExpPair = {
      val r = reader.readBTSFormalExpPair()
      return r
    }
    val r = to(data, fBTSFormalExpPair _)
    return r
  }

  def fromBTSBehaviorTime(o: BTSBehaviorTime, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBTSBehaviorTime(o)
    return w.result
  }

  def toBTSBehaviorTime(data: ISZ[U8]): Either[BTSBehaviorTime, MessagePack.ErrorMsg] = {
    def fBTSBehaviorTime(reader: Reader): BTSBehaviorTime = {
      val r = reader.readBTSBehaviorTime()
      return r
    }
    val r = to(data, fBTSBehaviorTime _)
    return r
  }

  def fromTODO(o: TODO, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTODO(o)
    return w.result
  }

  def toTODO(data: ISZ[U8]): Either[TODO, MessagePack.ErrorMsg] = {
    def fTODO(reader: Reader): TODO = {
      val r = reader.readTODO()
      return r
    }
    val r = to(data, fTODO _)
    return r
  }

  def fromAttr(o: Attr, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeAttr(o)
    return w.result
  }

  def toAttr(data: ISZ[U8]): Either[Attr, MessagePack.ErrorMsg] = {
    def fAttr(reader: Reader): Attr = {
      val r = reader.readAttr()
      return r
    }
    val r = to(data, fAttr _)
    return r
  }

  def fromEmv2Annex(o: Emv2Annex, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEmv2Annex(o)
    return w.result
  }

  def toEmv2Annex(data: ISZ[U8]): Either[Emv2Annex, MessagePack.ErrorMsg] = {
    def fEmv2Annex(reader: Reader): Emv2Annex = {
      val r = reader.readEmv2Annex()
      return r
    }
    val r = to(data, fEmv2Annex _)
    return r
  }

  def fromEmv2Lib(o: Emv2Lib, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEmv2Lib(o)
    return w.result
  }

  def toEmv2Lib(data: ISZ[U8]): Either[Emv2Lib, MessagePack.ErrorMsg] = {
    def fEmv2Lib(reader: Reader): Emv2Lib = {
      val r = reader.readEmv2Lib()
      return r
    }
    val r = to(data, fEmv2Lib _)
    return r
  }

  def fromEmv2ElementRef(o: Emv2ElementRef, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEmv2ElementRef(o)
    return w.result
  }

  def toEmv2ElementRef(data: ISZ[U8]): Either[Emv2ElementRef, MessagePack.ErrorMsg] = {
    def fEmv2ElementRef(reader: Reader): Emv2ElementRef = {
      val r = reader.readEmv2ElementRef()
      return r
    }
    val r = to(data, fEmv2ElementRef _)
    return r
  }

  def fromEmv2Library(o: Emv2Library, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEmv2Library(o)
    return w.result
  }

  def toEmv2Library(data: ISZ[U8]): Either[Emv2Library, MessagePack.ErrorMsg] = {
    def fEmv2Library(reader: Reader): Emv2Library = {
      val r = reader.readEmv2Library()
      return r
    }
    val r = to(data, fEmv2Library _)
    return r
  }

  def fromErrorTypeDef(o: ErrorTypeDef, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeErrorTypeDef(o)
    return w.result
  }

  def toErrorTypeDef(data: ISZ[U8]): Either[ErrorTypeDef, MessagePack.ErrorMsg] = {
    def fErrorTypeDef(reader: Reader): ErrorTypeDef = {
      val r = reader.readErrorTypeDef()
      return r
    }
    val r = to(data, fErrorTypeDef _)
    return r
  }

  def fromErrorAliasDef(o: ErrorAliasDef, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeErrorAliasDef(o)
    return w.result
  }

  def toErrorAliasDef(data: ISZ[U8]): Either[ErrorAliasDef, MessagePack.ErrorMsg] = {
    def fErrorAliasDef(reader: Reader): ErrorAliasDef = {
      val r = reader.readErrorAliasDef()
      return r
    }
    val r = to(data, fErrorAliasDef _)
    return r
  }

  def fromErrorTypeSetDef(o: ErrorTypeSetDef, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeErrorTypeSetDef(o)
    return w.result
  }

  def toErrorTypeSetDef(data: ISZ[U8]): Either[ErrorTypeSetDef, MessagePack.ErrorMsg] = {
    def fErrorTypeSetDef(reader: Reader): ErrorTypeSetDef = {
      val r = reader.readErrorTypeSetDef()
      return r
    }
    val r = to(data, fErrorTypeSetDef _)
    return r
  }

  def fromBehaveStateMachine(o: BehaveStateMachine, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBehaveStateMachine(o)
    return w.result
  }

  def toBehaveStateMachine(data: ISZ[U8]): Either[BehaveStateMachine, MessagePack.ErrorMsg] = {
    def fBehaveStateMachine(reader: Reader): BehaveStateMachine = {
      val r = reader.readBehaveStateMachine()
      return r
    }
    val r = to(data, fBehaveStateMachine _)
    return r
  }

  def fromErrorEvent(o: ErrorEvent, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeErrorEvent(o)
    return w.result
  }

  def toErrorEvent(data: ISZ[U8]): Either[ErrorEvent, MessagePack.ErrorMsg] = {
    def fErrorEvent(reader: Reader): ErrorEvent = {
      val r = reader.readErrorEvent()
      return r
    }
    val r = to(data, fErrorEvent _)
    return r
  }

  def fromErrorState(o: ErrorState, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeErrorState(o)
    return w.result
  }

  def toErrorState(data: ISZ[U8]): Either[ErrorState, MessagePack.ErrorMsg] = {
    def fErrorState(reader: Reader): ErrorState = {
      val r = reader.readErrorState()
      return r
    }
    val r = to(data, fErrorState _)
    return r
  }

  def fromErrorTransition(o: ErrorTransition, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeErrorTransition(o)
    return w.result
  }

  def toErrorTransition(data: ISZ[U8]): Either[ErrorTransition, MessagePack.ErrorMsg] = {
    def fErrorTransition(reader: Reader): ErrorTransition = {
      val r = reader.readErrorTransition()
      return r
    }
    val r = to(data, fErrorTransition _)
    return r
  }

  def fromErrorCondition(o: ErrorCondition, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeErrorCondition(o)
    return w.result
  }

  def toErrorCondition(data: ISZ[U8]): Either[ErrorCondition, MessagePack.ErrorMsg] = {
    def fErrorCondition(reader: Reader): ErrorCondition = {
      val r = reader.readErrorCondition()
      return r
    }
    val r = to(data, fErrorCondition _)
    return r
  }

  def fromConditionTrigger(o: ConditionTrigger, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeConditionTrigger(o)
    return w.result
  }

  def toConditionTrigger(data: ISZ[U8]): Either[ConditionTrigger, MessagePack.ErrorMsg] = {
    def fConditionTrigger(reader: Reader): ConditionTrigger = {
      val r = reader.readConditionTrigger()
      return r
    }
    val r = to(data, fConditionTrigger _)
    return r
  }

  def fromAndCondition(o: AndCondition, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeAndCondition(o)
    return w.result
  }

  def toAndCondition(data: ISZ[U8]): Either[AndCondition, MessagePack.ErrorMsg] = {
    def fAndCondition(reader: Reader): AndCondition = {
      val r = reader.readAndCondition()
      return r
    }
    val r = to(data, fAndCondition _)
    return r
  }

  def fromOrCondition(o: OrCondition, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOrCondition(o)
    return w.result
  }

  def toOrCondition(data: ISZ[U8]): Either[OrCondition, MessagePack.ErrorMsg] = {
    def fOrCondition(reader: Reader): OrCondition = {
      val r = reader.readOrCondition()
      return r
    }
    val r = to(data, fOrCondition _)
    return r
  }

  def fromAllCondition(o: AllCondition, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeAllCondition(o)
    return w.result
  }

  def toAllCondition(data: ISZ[U8]): Either[AllCondition, MessagePack.ErrorMsg] = {
    def fAllCondition(reader: Reader): AllCondition = {
      val r = reader.readAllCondition()
      return r
    }
    val r = to(data, fAllCondition _)
    return r
  }

  def fromOrMoreCondition(o: OrMoreCondition, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOrMoreCondition(o)
    return w.result
  }

  def toOrMoreCondition(data: ISZ[U8]): Either[OrMoreCondition, MessagePack.ErrorMsg] = {
    def fOrMoreCondition(reader: Reader): OrMoreCondition = {
      val r = reader.readOrMoreCondition()
      return r
    }
    val r = to(data, fOrMoreCondition _)
    return r
  }

  def fromOrLessCondition(o: OrLessCondition, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOrLessCondition(o)
    return w.result
  }

  def toOrLessCondition(data: ISZ[U8]): Either[OrLessCondition, MessagePack.ErrorMsg] = {
    def fOrLessCondition(reader: Reader): OrLessCondition = {
      val r = reader.readOrLessCondition()
      return r
    }
    val r = to(data, fOrLessCondition _)
    return r
  }

  def fromEmv2Clause(o: Emv2Clause, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEmv2Clause(o)
    return w.result
  }

  def toEmv2Clause(data: ISZ[U8]): Either[Emv2Clause, MessagePack.ErrorMsg] = {
    def fEmv2Clause(reader: Reader): Emv2Clause = {
      val r = reader.readEmv2Clause()
      return r
    }
    val r = to(data, fEmv2Clause _)
    return r
  }

  def fromEmv2Propagation(o: Emv2Propagation, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEmv2Propagation(o)
    return w.result
  }

  def toEmv2Propagation(data: ISZ[U8]): Either[Emv2Propagation, MessagePack.ErrorMsg] = {
    def fEmv2Propagation(reader: Reader): Emv2Propagation = {
      val r = reader.readEmv2Propagation()
      return r
    }
    val r = to(data, fEmv2Propagation _)
    return r
  }

  def fromEmv2Flow(o: Emv2Flow, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEmv2Flow(o)
    return w.result
  }

  def toEmv2Flow(data: ISZ[U8]): Either[Emv2Flow, MessagePack.ErrorMsg] = {
    def fEmv2Flow(reader: Reader): Emv2Flow = {
      val r = reader.readEmv2Flow()
      return r
    }
    val r = to(data, fEmv2Flow _)
    return r
  }

  def fromEmv2BehaviorSection(o: Emv2BehaviorSection, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEmv2BehaviorSection(o)
    return w.result
  }

  def toEmv2BehaviorSection(data: ISZ[U8]): Either[Emv2BehaviorSection, MessagePack.ErrorMsg] = {
    def fEmv2BehaviorSection(reader: Reader): Emv2BehaviorSection = {
      val r = reader.readEmv2BehaviorSection()
      return r
    }
    val r = to(data, fEmv2BehaviorSection _)
    return r
  }

  def fromErrorPropagation(o: ErrorPropagation, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeErrorPropagation(o)
    return w.result
  }

  def toErrorPropagation(data: ISZ[U8]): Either[ErrorPropagation, MessagePack.ErrorMsg] = {
    def fErrorPropagation(reader: Reader): ErrorPropagation = {
      val r = reader.readErrorPropagation()
      return r
    }
    val r = to(data, fErrorPropagation _)
    return r
  }

  def fromGclSymbol(o: GclSymbol, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeGclSymbol(o)
    return w.result
  }

  def toGclSymbol(data: ISZ[U8]): Either[GclSymbol, MessagePack.ErrorMsg] = {
    def fGclSymbol(reader: Reader): GclSymbol = {
      val r = reader.readGclSymbol()
      return r
    }
    val r = to(data, fGclSymbol _)
    return r
  }

  def fromGclSubclause(o: GclSubclause, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeGclSubclause(o)
    return w.result
  }

  def toGclSubclause(data: ISZ[U8]): Either[GclSubclause, MessagePack.ErrorMsg] = {
    def fGclSubclause(reader: Reader): GclSubclause = {
      val r = reader.readGclSubclause()
      return r
    }
    val r = to(data, fGclSubclause _)
    return r
  }

  def fromGclMethod(o: GclMethod, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeGclMethod(o)
    return w.result
  }

  def toGclMethod(data: ISZ[U8]): Either[GclMethod, MessagePack.ErrorMsg] = {
    def fGclMethod(reader: Reader): GclMethod = {
      val r = reader.readGclMethod()
      return r
    }
    val r = to(data, fGclMethod _)
    return r
  }

  def fromGclStateVar(o: GclStateVar, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeGclStateVar(o)
    return w.result
  }

  def toGclStateVar(data: ISZ[U8]): Either[GclStateVar, MessagePack.ErrorMsg] = {
    def fGclStateVar(reader: Reader): GclStateVar = {
      val r = reader.readGclStateVar()
      return r
    }
    val r = to(data, fGclStateVar _)
    return r
  }

  def fromGclSpec(o: GclSpec, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeGclSpec(o)
    return w.result
  }

  def toGclSpec(data: ISZ[U8]): Either[GclSpec, MessagePack.ErrorMsg] = {
    def fGclSpec(reader: Reader): GclSpec = {
      val r = reader.readGclSpec()
      return r
    }
    val r = to(data, fGclSpec _)
    return r
  }

  def fromGclInvariant(o: GclInvariant, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeGclInvariant(o)
    return w.result
  }

  def toGclInvariant(data: ISZ[U8]): Either[GclInvariant, MessagePack.ErrorMsg] = {
    def fGclInvariant(reader: Reader): GclInvariant = {
      val r = reader.readGclInvariant()
      return r
    }
    val r = to(data, fGclInvariant _)
    return r
  }

  def fromGclComputeSpec(o: GclComputeSpec, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeGclComputeSpec(o)
    return w.result
  }

  def toGclComputeSpec(data: ISZ[U8]): Either[GclComputeSpec, MessagePack.ErrorMsg] = {
    def fGclComputeSpec(reader: Reader): GclComputeSpec = {
      val r = reader.readGclComputeSpec()
      return r
    }
    val r = to(data, fGclComputeSpec _)
    return r
  }

  def fromGclAssume(o: GclAssume, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeGclAssume(o)
    return w.result
  }

  def toGclAssume(data: ISZ[U8]): Either[GclAssume, MessagePack.ErrorMsg] = {
    def fGclAssume(reader: Reader): GclAssume = {
      val r = reader.readGclAssume()
      return r
    }
    val r = to(data, fGclAssume _)
    return r
  }

  def fromGclGuarantee(o: GclGuarantee, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeGclGuarantee(o)
    return w.result
  }

  def toGclGuarantee(data: ISZ[U8]): Either[GclGuarantee, MessagePack.ErrorMsg] = {
    def fGclGuarantee(reader: Reader): GclGuarantee = {
      val r = reader.readGclGuarantee()
      return r
    }
    val r = to(data, fGclGuarantee _)
    return r
  }

  def fromGclIntegration(o: GclIntegration, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeGclIntegration(o)
    return w.result
  }

  def toGclIntegration(data: ISZ[U8]): Either[GclIntegration, MessagePack.ErrorMsg] = {
    def fGclIntegration(reader: Reader): GclIntegration = {
      val r = reader.readGclIntegration()
      return r
    }
    val r = to(data, fGclIntegration _)
    return r
  }

  def fromGclCaseStatement(o: GclCaseStatement, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeGclCaseStatement(o)
    return w.result
  }

  def toGclCaseStatement(data: ISZ[U8]): Either[GclCaseStatement, MessagePack.ErrorMsg] = {
    def fGclCaseStatement(reader: Reader): GclCaseStatement = {
      val r = reader.readGclCaseStatement()
      return r
    }
    val r = to(data, fGclCaseStatement _)
    return r
  }

  def fromGclInitialize(o: GclInitialize, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeGclInitialize(o)
    return w.result
  }

  def toGclInitialize(data: ISZ[U8]): Either[GclInitialize, MessagePack.ErrorMsg] = {
    def fGclInitialize(reader: Reader): GclInitialize = {
      val r = reader.readGclInitialize()
      return r
    }
    val r = to(data, fGclInitialize _)
    return r
  }

  def fromGclCompute(o: GclCompute, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeGclCompute(o)
    return w.result
  }

  def toGclCompute(data: ISZ[U8]): Either[GclCompute, MessagePack.ErrorMsg] = {
    def fGclCompute(reader: Reader): GclCompute = {
      val r = reader.readGclCompute()
      return r
    }
    val r = to(data, fGclCompute _)
    return r
  }

  def fromGclHandle(o: GclHandle, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeGclHandle(o)
    return w.result
  }

  def toGclHandle(data: ISZ[U8]): Either[GclHandle, MessagePack.ErrorMsg] = {
    def fGclHandle(reader: Reader): GclHandle = {
      val r = reader.readGclHandle()
      return r
    }
    val r = to(data, fGclHandle _)
    return r
  }

  def fromGclTODO(o: GclTODO, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeGclTODO(o)
    return w.result
  }

  def toGclTODO(data: ISZ[U8]): Either[GclTODO, MessagePack.ErrorMsg] = {
    def fGclTODO(reader: Reader): GclTODO = {
      val r = reader.readGclTODO()
      return r
    }
    val r = to(data, fGclTODO _)
    return r
  }

  def fromGclLib(o: GclLib, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeGclLib(o)
    return w.result
  }

  def toGclLib(data: ISZ[U8]): Either[GclLib, MessagePack.ErrorMsg] = {
    def fGclLib(reader: Reader): GclLib = {
      val r = reader.readGclLib()
      return r
    }
    val r = to(data, fGclLib _)
    return r
  }

  def fromSmfAnnex(o: SmfAnnex, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeSmfAnnex(o)
    return w.result
  }

  def toSmfAnnex(data: ISZ[U8]): Either[SmfAnnex, MessagePack.ErrorMsg] = {
    def fSmfAnnex(reader: Reader): SmfAnnex = {
      val r = reader.readSmfAnnex()
      return r
    }
    val r = to(data, fSmfAnnex _)
    return r
  }

  def fromSmfLib(o: SmfLib, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeSmfLib(o)
    return w.result
  }

  def toSmfLib(data: ISZ[U8]): Either[SmfLib, MessagePack.ErrorMsg] = {
    def fSmfLib(reader: Reader): SmfLib = {
      val r = reader.readSmfLib()
      return r
    }
    val r = to(data, fSmfLib _)
    return r
  }

  def fromSmfClause(o: SmfClause, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeSmfClause(o)
    return w.result
  }

  def toSmfClause(data: ISZ[U8]): Either[SmfClause, MessagePack.ErrorMsg] = {
    def fSmfClause(reader: Reader): SmfClause = {
      val r = reader.readSmfClause()
      return r
    }
    val r = to(data, fSmfClause _)
    return r
  }

  def fromSmfClassification(o: SmfClassification, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeSmfClassification(o)
    return w.result
  }

  def toSmfClassification(data: ISZ[U8]): Either[SmfClassification, MessagePack.ErrorMsg] = {
    def fSmfClassification(reader: Reader): SmfClassification = {
      val r = reader.readSmfClassification()
      return r
    }
    val r = to(data, fSmfClassification _)
    return r
  }

  def fromSmfDeclass(o: SmfDeclass, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeSmfDeclass(o)
    return w.result
  }

  def toSmfDeclass(data: ISZ[U8]): Either[SmfDeclass, MessagePack.ErrorMsg] = {
    def fSmfDeclass(reader: Reader): SmfDeclass = {
      val r = reader.readSmfDeclass()
      return r
    }
    val r = to(data, fSmfDeclass _)
    return r
  }

  def fromSmfLibrary(o: SmfLibrary, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeSmfLibrary(o)
    return w.result
  }

  def toSmfLibrary(data: ISZ[U8]): Either[SmfLibrary, MessagePack.ErrorMsg] = {
    def fSmfLibrary(reader: Reader): SmfLibrary = {
      val r = reader.readSmfLibrary()
      return r
    }
    val r = to(data, fSmfLibrary _)
    return r
  }

  def fromSmfType(o: SmfType, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeSmfType(o)
    return w.result
  }

  def toSmfType(data: ISZ[U8]): Either[SmfType, MessagePack.ErrorMsg] = {
    def fSmfType(reader: Reader): SmfType = {
      val r = reader.readSmfType()
      return r
    }
    val r = to(data, fSmfType _)
    return r
  }

  def from_langastTopUnit(o: org.sireum.lang.ast.TopUnit, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastTopUnit(o)
    return w.result
  }

  def to_langastTopUnit(data: ISZ[U8]): Either[org.sireum.lang.ast.TopUnit, MessagePack.ErrorMsg] = {
    def f_langastTopUnit(reader: Reader): org.sireum.lang.ast.TopUnit = {
      val r = reader.read_langastTopUnit()
      return r
    }
    val r = to(data, f_langastTopUnit _)
    return r
  }

  def from_langastTopUnitProgram(o: org.sireum.lang.ast.TopUnit.Program, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastTopUnitProgram(o)
    return w.result
  }

  def to_langastTopUnitProgram(data: ISZ[U8]): Either[org.sireum.lang.ast.TopUnit.Program, MessagePack.ErrorMsg] = {
    def f_langastTopUnitProgram(reader: Reader): org.sireum.lang.ast.TopUnit.Program = {
      val r = reader.read_langastTopUnitProgram()
      return r
    }
    val r = to(data, f_langastTopUnitProgram _)
    return r
  }

  def from_langastTopUnitSequentUnit(o: org.sireum.lang.ast.TopUnit.SequentUnit, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastTopUnitSequentUnit(o)
    return w.result
  }

  def to_langastTopUnitSequentUnit(data: ISZ[U8]): Either[org.sireum.lang.ast.TopUnit.SequentUnit, MessagePack.ErrorMsg] = {
    def f_langastTopUnitSequentUnit(reader: Reader): org.sireum.lang.ast.TopUnit.SequentUnit = {
      val r = reader.read_langastTopUnitSequentUnit()
      return r
    }
    val r = to(data, f_langastTopUnitSequentUnit _)
    return r
  }

  def from_langastTopUnitTruthTableUnit(o: org.sireum.lang.ast.TopUnit.TruthTableUnit, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastTopUnitTruthTableUnit(o)
    return w.result
  }

  def to_langastTopUnitTruthTableUnit(data: ISZ[U8]): Either[org.sireum.lang.ast.TopUnit.TruthTableUnit, MessagePack.ErrorMsg] = {
    def f_langastTopUnitTruthTableUnit(reader: Reader): org.sireum.lang.ast.TopUnit.TruthTableUnit = {
      val r = reader.read_langastTopUnitTruthTableUnit()
      return r
    }
    val r = to(data, f_langastTopUnitTruthTableUnit _)
    return r
  }

  def from_langastStmt(o: org.sireum.lang.ast.Stmt, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastStmt(o)
    return w.result
  }

  def to_langastStmt(data: ISZ[U8]): Either[org.sireum.lang.ast.Stmt, MessagePack.ErrorMsg] = {
    def f_langastStmt(reader: Reader): org.sireum.lang.ast.Stmt = {
      val r = reader.read_langastStmt()
      return r
    }
    val r = to(data, f_langastStmt _)
    return r
  }

  def from_langastHasModifies(o: org.sireum.lang.ast.HasModifies, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastHasModifies(o)
    return w.result
  }

  def to_langastHasModifies(data: ISZ[U8]): Either[org.sireum.lang.ast.HasModifies, MessagePack.ErrorMsg] = {
    def f_langastHasModifies(reader: Reader): org.sireum.lang.ast.HasModifies = {
      val r = reader.read_langastHasModifies()
      return r
    }
    val r = to(data, f_langastHasModifies _)
    return r
  }

  def from_langastLoopContract(o: org.sireum.lang.ast.LoopContract, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastLoopContract(o)
    return w.result
  }

  def to_langastLoopContract(data: ISZ[U8]): Either[org.sireum.lang.ast.LoopContract, MessagePack.ErrorMsg] = {
    def f_langastLoopContract(reader: Reader): org.sireum.lang.ast.LoopContract = {
      val r = reader.read_langastLoopContract()
      return r
    }
    val r = to(data, f_langastLoopContract _)
    return r
  }

  def from_langastStmtImport(o: org.sireum.lang.ast.Stmt.Import, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastStmtImport(o)
    return w.result
  }

  def to_langastStmtImport(data: ISZ[U8]): Either[org.sireum.lang.ast.Stmt.Import, MessagePack.ErrorMsg] = {
    def f_langastStmtImport(reader: Reader): org.sireum.lang.ast.Stmt.Import = {
      val r = reader.read_langastStmtImport()
      return r
    }
    val r = to(data, f_langastStmtImport _)
    return r
  }

  def from_langastStmtImportImporter(o: org.sireum.lang.ast.Stmt.Import.Importer, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastStmtImportImporter(o)
    return w.result
  }

  def to_langastStmtImportImporter(data: ISZ[U8]): Either[org.sireum.lang.ast.Stmt.Import.Importer, MessagePack.ErrorMsg] = {
    def f_langastStmtImportImporter(reader: Reader): org.sireum.lang.ast.Stmt.Import.Importer = {
      val r = reader.read_langastStmtImportImporter()
      return r
    }
    val r = to(data, f_langastStmtImportImporter _)
    return r
  }

  def from_langastStmtImportSelector(o: org.sireum.lang.ast.Stmt.Import.Selector, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastStmtImportSelector(o)
    return w.result
  }

  def to_langastStmtImportSelector(data: ISZ[U8]): Either[org.sireum.lang.ast.Stmt.Import.Selector, MessagePack.ErrorMsg] = {
    def f_langastStmtImportSelector(reader: Reader): org.sireum.lang.ast.Stmt.Import.Selector = {
      val r = reader.read_langastStmtImportSelector()
      return r
    }
    val r = to(data, f_langastStmtImportSelector _)
    return r
  }

  def from_langastStmtImportMultiSelector(o: org.sireum.lang.ast.Stmt.Import.MultiSelector, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastStmtImportMultiSelector(o)
    return w.result
  }

  def to_langastStmtImportMultiSelector(data: ISZ[U8]): Either[org.sireum.lang.ast.Stmt.Import.MultiSelector, MessagePack.ErrorMsg] = {
    def f_langastStmtImportMultiSelector(reader: Reader): org.sireum.lang.ast.Stmt.Import.MultiSelector = {
      val r = reader.read_langastStmtImportMultiSelector()
      return r
    }
    val r = to(data, f_langastStmtImportMultiSelector _)
    return r
  }

  def from_langastStmtImportWildcardSelector(o: org.sireum.lang.ast.Stmt.Import.WildcardSelector, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastStmtImportWildcardSelector(o)
    return w.result
  }

  def to_langastStmtImportWildcardSelector(data: ISZ[U8]): Either[org.sireum.lang.ast.Stmt.Import.WildcardSelector, MessagePack.ErrorMsg] = {
    def f_langastStmtImportWildcardSelector(reader: Reader): org.sireum.lang.ast.Stmt.Import.WildcardSelector = {
      val r = reader.read_langastStmtImportWildcardSelector()
      return r
    }
    val r = to(data, f_langastStmtImportWildcardSelector _)
    return r
  }

  def from_langastStmtImportNamedSelector(o: org.sireum.lang.ast.Stmt.Import.NamedSelector, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastStmtImportNamedSelector(o)
    return w.result
  }

  def to_langastStmtImportNamedSelector(data: ISZ[U8]): Either[org.sireum.lang.ast.Stmt.Import.NamedSelector, MessagePack.ErrorMsg] = {
    def f_langastStmtImportNamedSelector(reader: Reader): org.sireum.lang.ast.Stmt.Import.NamedSelector = {
      val r = reader.read_langastStmtImportNamedSelector()
      return r
    }
    val r = to(data, f_langastStmtImportNamedSelector _)
    return r
  }

  def from_langastStmtVar(o: org.sireum.lang.ast.Stmt.Var, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastStmtVar(o)
    return w.result
  }

  def to_langastStmtVar(data: ISZ[U8]): Either[org.sireum.lang.ast.Stmt.Var, MessagePack.ErrorMsg] = {
    def f_langastStmtVar(reader: Reader): org.sireum.lang.ast.Stmt.Var = {
      val r = reader.read_langastStmtVar()
      return r
    }
    val r = to(data, f_langastStmtVar _)
    return r
  }

  def from_langastStmtVarPattern(o: org.sireum.lang.ast.Stmt.VarPattern, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastStmtVarPattern(o)
    return w.result
  }

  def to_langastStmtVarPattern(data: ISZ[U8]): Either[org.sireum.lang.ast.Stmt.VarPattern, MessagePack.ErrorMsg] = {
    def f_langastStmtVarPattern(reader: Reader): org.sireum.lang.ast.Stmt.VarPattern = {
      val r = reader.read_langastStmtVarPattern()
      return r
    }
    val r = to(data, f_langastStmtVarPattern _)
    return r
  }

  def from_langastStmtSpecVar(o: org.sireum.lang.ast.Stmt.SpecVar, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastStmtSpecVar(o)
    return w.result
  }

  def to_langastStmtSpecVar(data: ISZ[U8]): Either[org.sireum.lang.ast.Stmt.SpecVar, MessagePack.ErrorMsg] = {
    def f_langastStmtSpecVar(reader: Reader): org.sireum.lang.ast.Stmt.SpecVar = {
      val r = reader.read_langastStmtSpecVar()
      return r
    }
    val r = to(data, f_langastStmtSpecVar _)
    return r
  }

  def from_langastStmtMethod(o: org.sireum.lang.ast.Stmt.Method, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastStmtMethod(o)
    return w.result
  }

  def to_langastStmtMethod(data: ISZ[U8]): Either[org.sireum.lang.ast.Stmt.Method, MessagePack.ErrorMsg] = {
    def f_langastStmtMethod(reader: Reader): org.sireum.lang.ast.Stmt.Method = {
      val r = reader.read_langastStmtMethod()
      return r
    }
    val r = to(data, f_langastStmtMethod _)
    return r
  }

  def from_langastStmtExtMethod(o: org.sireum.lang.ast.Stmt.ExtMethod, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastStmtExtMethod(o)
    return w.result
  }

  def to_langastStmtExtMethod(data: ISZ[U8]): Either[org.sireum.lang.ast.Stmt.ExtMethod, MessagePack.ErrorMsg] = {
    def f_langastStmtExtMethod(reader: Reader): org.sireum.lang.ast.Stmt.ExtMethod = {
      val r = reader.read_langastStmtExtMethod()
      return r
    }
    val r = to(data, f_langastStmtExtMethod _)
    return r
  }

  def from_langastStmtJustMethod(o: org.sireum.lang.ast.Stmt.JustMethod, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastStmtJustMethod(o)
    return w.result
  }

  def to_langastStmtJustMethod(data: ISZ[U8]): Either[org.sireum.lang.ast.Stmt.JustMethod, MessagePack.ErrorMsg] = {
    def f_langastStmtJustMethod(reader: Reader): org.sireum.lang.ast.Stmt.JustMethod = {
      val r = reader.read_langastStmtJustMethod()
      return r
    }
    val r = to(data, f_langastStmtJustMethod _)
    return r
  }

  def from_langastStmtSpecMethod(o: org.sireum.lang.ast.Stmt.SpecMethod, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastStmtSpecMethod(o)
    return w.result
  }

  def to_langastStmtSpecMethod(data: ISZ[U8]): Either[org.sireum.lang.ast.Stmt.SpecMethod, MessagePack.ErrorMsg] = {
    def f_langastStmtSpecMethod(reader: Reader): org.sireum.lang.ast.Stmt.SpecMethod = {
      val r = reader.read_langastStmtSpecMethod()
      return r
    }
    val r = to(data, f_langastStmtSpecMethod _)
    return r
  }

  def from_langastStmtEnum(o: org.sireum.lang.ast.Stmt.Enum, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastStmtEnum(o)
    return w.result
  }

  def to_langastStmtEnum(data: ISZ[U8]): Either[org.sireum.lang.ast.Stmt.Enum, MessagePack.ErrorMsg] = {
    def f_langastStmtEnum(reader: Reader): org.sireum.lang.ast.Stmt.Enum = {
      val r = reader.read_langastStmtEnum()
      return r
    }
    val r = to(data, f_langastStmtEnum _)
    return r
  }

  def from_langastStmtSubZ(o: org.sireum.lang.ast.Stmt.SubZ, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastStmtSubZ(o)
    return w.result
  }

  def to_langastStmtSubZ(data: ISZ[U8]): Either[org.sireum.lang.ast.Stmt.SubZ, MessagePack.ErrorMsg] = {
    def f_langastStmtSubZ(reader: Reader): org.sireum.lang.ast.Stmt.SubZ = {
      val r = reader.read_langastStmtSubZ()
      return r
    }
    val r = to(data, f_langastStmtSubZ _)
    return r
  }

  def from_langastStmtObject(o: org.sireum.lang.ast.Stmt.Object, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastStmtObject(o)
    return w.result
  }

  def to_langastStmtObject(data: ISZ[U8]): Either[org.sireum.lang.ast.Stmt.Object, MessagePack.ErrorMsg] = {
    def f_langastStmtObject(reader: Reader): org.sireum.lang.ast.Stmt.Object = {
      val r = reader.read_langastStmtObject()
      return r
    }
    val r = to(data, f_langastStmtObject _)
    return r
  }

  def from_langastStmtSig(o: org.sireum.lang.ast.Stmt.Sig, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastStmtSig(o)
    return w.result
  }

  def to_langastStmtSig(data: ISZ[U8]): Either[org.sireum.lang.ast.Stmt.Sig, MessagePack.ErrorMsg] = {
    def f_langastStmtSig(reader: Reader): org.sireum.lang.ast.Stmt.Sig = {
      val r = reader.read_langastStmtSig()
      return r
    }
    val r = to(data, f_langastStmtSig _)
    return r
  }

  def from_langastStmtAdt(o: org.sireum.lang.ast.Stmt.Adt, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastStmtAdt(o)
    return w.result
  }

  def to_langastStmtAdt(data: ISZ[U8]): Either[org.sireum.lang.ast.Stmt.Adt, MessagePack.ErrorMsg] = {
    def f_langastStmtAdt(reader: Reader): org.sireum.lang.ast.Stmt.Adt = {
      val r = reader.read_langastStmtAdt()
      return r
    }
    val r = to(data, f_langastStmtAdt _)
    return r
  }

  def from_langastStmtTypeAlias(o: org.sireum.lang.ast.Stmt.TypeAlias, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastStmtTypeAlias(o)
    return w.result
  }

  def to_langastStmtTypeAlias(data: ISZ[U8]): Either[org.sireum.lang.ast.Stmt.TypeAlias, MessagePack.ErrorMsg] = {
    def f_langastStmtTypeAlias(reader: Reader): org.sireum.lang.ast.Stmt.TypeAlias = {
      val r = reader.read_langastStmtTypeAlias()
      return r
    }
    val r = to(data, f_langastStmtTypeAlias _)
    return r
  }

  def from_langastStmtAssign(o: org.sireum.lang.ast.Stmt.Assign, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastStmtAssign(o)
    return w.result
  }

  def to_langastStmtAssign(data: ISZ[U8]): Either[org.sireum.lang.ast.Stmt.Assign, MessagePack.ErrorMsg] = {
    def f_langastStmtAssign(reader: Reader): org.sireum.lang.ast.Stmt.Assign = {
      val r = reader.read_langastStmtAssign()
      return r
    }
    val r = to(data, f_langastStmtAssign _)
    return r
  }

  def from_langastStmtBlock(o: org.sireum.lang.ast.Stmt.Block, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastStmtBlock(o)
    return w.result
  }

  def to_langastStmtBlock(data: ISZ[U8]): Either[org.sireum.lang.ast.Stmt.Block, MessagePack.ErrorMsg] = {
    def f_langastStmtBlock(reader: Reader): org.sireum.lang.ast.Stmt.Block = {
      val r = reader.read_langastStmtBlock()
      return r
    }
    val r = to(data, f_langastStmtBlock _)
    return r
  }

  def from_langastStmtIf(o: org.sireum.lang.ast.Stmt.If, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastStmtIf(o)
    return w.result
  }

  def to_langastStmtIf(data: ISZ[U8]): Either[org.sireum.lang.ast.Stmt.If, MessagePack.ErrorMsg] = {
    def f_langastStmtIf(reader: Reader): org.sireum.lang.ast.Stmt.If = {
      val r = reader.read_langastStmtIf()
      return r
    }
    val r = to(data, f_langastStmtIf _)
    return r
  }

  def from_langastStmtMatch(o: org.sireum.lang.ast.Stmt.Match, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastStmtMatch(o)
    return w.result
  }

  def to_langastStmtMatch(data: ISZ[U8]): Either[org.sireum.lang.ast.Stmt.Match, MessagePack.ErrorMsg] = {
    def f_langastStmtMatch(reader: Reader): org.sireum.lang.ast.Stmt.Match = {
      val r = reader.read_langastStmtMatch()
      return r
    }
    val r = to(data, f_langastStmtMatch _)
    return r
  }

  def from_langastStmtWhile(o: org.sireum.lang.ast.Stmt.While, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastStmtWhile(o)
    return w.result
  }

  def to_langastStmtWhile(data: ISZ[U8]): Either[org.sireum.lang.ast.Stmt.While, MessagePack.ErrorMsg] = {
    def f_langastStmtWhile(reader: Reader): org.sireum.lang.ast.Stmt.While = {
      val r = reader.read_langastStmtWhile()
      return r
    }
    val r = to(data, f_langastStmtWhile _)
    return r
  }

  def from_langastStmtDoWhile(o: org.sireum.lang.ast.Stmt.DoWhile, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastStmtDoWhile(o)
    return w.result
  }

  def to_langastStmtDoWhile(data: ISZ[U8]): Either[org.sireum.lang.ast.Stmt.DoWhile, MessagePack.ErrorMsg] = {
    def f_langastStmtDoWhile(reader: Reader): org.sireum.lang.ast.Stmt.DoWhile = {
      val r = reader.read_langastStmtDoWhile()
      return r
    }
    val r = to(data, f_langastStmtDoWhile _)
    return r
  }

  def from_langastStmtFor(o: org.sireum.lang.ast.Stmt.For, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastStmtFor(o)
    return w.result
  }

  def to_langastStmtFor(data: ISZ[U8]): Either[org.sireum.lang.ast.Stmt.For, MessagePack.ErrorMsg] = {
    def f_langastStmtFor(reader: Reader): org.sireum.lang.ast.Stmt.For = {
      val r = reader.read_langastStmtFor()
      return r
    }
    val r = to(data, f_langastStmtFor _)
    return r
  }

  def from_langastStmtReturn(o: org.sireum.lang.ast.Stmt.Return, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastStmtReturn(o)
    return w.result
  }

  def to_langastStmtReturn(data: ISZ[U8]): Either[org.sireum.lang.ast.Stmt.Return, MessagePack.ErrorMsg] = {
    def f_langastStmtReturn(reader: Reader): org.sireum.lang.ast.Stmt.Return = {
      val r = reader.read_langastStmtReturn()
      return r
    }
    val r = to(data, f_langastStmtReturn _)
    return r
  }

  def from_langastStmtExpr(o: org.sireum.lang.ast.Stmt.Expr, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastStmtExpr(o)
    return w.result
  }

  def to_langastStmtExpr(data: ISZ[U8]): Either[org.sireum.lang.ast.Stmt.Expr, MessagePack.ErrorMsg] = {
    def f_langastStmtExpr(reader: Reader): org.sireum.lang.ast.Stmt.Expr = {
      val r = reader.read_langastStmtExpr()
      return r
    }
    val r = to(data, f_langastStmtExpr _)
    return r
  }

  def from_langastStmtSpec(o: org.sireum.lang.ast.Stmt.Spec, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastStmtSpec(o)
    return w.result
  }

  def to_langastStmtSpec(data: ISZ[U8]): Either[org.sireum.lang.ast.Stmt.Spec, MessagePack.ErrorMsg] = {
    def f_langastStmtSpec(reader: Reader): org.sireum.lang.ast.Stmt.Spec = {
      val r = reader.read_langastStmtSpec()
      return r
    }
    val r = to(data, f_langastStmtSpec _)
    return r
  }

  def from_langastStmtFact(o: org.sireum.lang.ast.Stmt.Fact, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastStmtFact(o)
    return w.result
  }

  def to_langastStmtFact(data: ISZ[U8]): Either[org.sireum.lang.ast.Stmt.Fact, MessagePack.ErrorMsg] = {
    def f_langastStmtFact(reader: Reader): org.sireum.lang.ast.Stmt.Fact = {
      val r = reader.read_langastStmtFact()
      return r
    }
    val r = to(data, f_langastStmtFact _)
    return r
  }

  def from_langastStmtInv(o: org.sireum.lang.ast.Stmt.Inv, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastStmtInv(o)
    return w.result
  }

  def to_langastStmtInv(data: ISZ[U8]): Either[org.sireum.lang.ast.Stmt.Inv, MessagePack.ErrorMsg] = {
    def f_langastStmtInv(reader: Reader): org.sireum.lang.ast.Stmt.Inv = {
      val r = reader.read_langastStmtInv()
      return r
    }
    val r = to(data, f_langastStmtInv _)
    return r
  }

  def from_langastStmtTheorem(o: org.sireum.lang.ast.Stmt.Theorem, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastStmtTheorem(o)
    return w.result
  }

  def to_langastStmtTheorem(data: ISZ[U8]): Either[org.sireum.lang.ast.Stmt.Theorem, MessagePack.ErrorMsg] = {
    def f_langastStmtTheorem(reader: Reader): org.sireum.lang.ast.Stmt.Theorem = {
      val r = reader.read_langastStmtTheorem()
      return r
    }
    val r = to(data, f_langastStmtTheorem _)
    return r
  }

  def from_langastStmtDataRefinement(o: org.sireum.lang.ast.Stmt.DataRefinement, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastStmtDataRefinement(o)
    return w.result
  }

  def to_langastStmtDataRefinement(data: ISZ[U8]): Either[org.sireum.lang.ast.Stmt.DataRefinement, MessagePack.ErrorMsg] = {
    def f_langastStmtDataRefinement(reader: Reader): org.sireum.lang.ast.Stmt.DataRefinement = {
      val r = reader.read_langastStmtDataRefinement()
      return r
    }
    val r = to(data, f_langastStmtDataRefinement _)
    return r
  }

  def from_langastStmtSpecLabel(o: org.sireum.lang.ast.Stmt.SpecLabel, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastStmtSpecLabel(o)
    return w.result
  }

  def to_langastStmtSpecLabel(data: ISZ[U8]): Either[org.sireum.lang.ast.Stmt.SpecLabel, MessagePack.ErrorMsg] = {
    def f_langastStmtSpecLabel(reader: Reader): org.sireum.lang.ast.Stmt.SpecLabel = {
      val r = reader.read_langastStmtSpecLabel()
      return r
    }
    val r = to(data, f_langastStmtSpecLabel _)
    return r
  }

  def from_langastStmtSpecBlock(o: org.sireum.lang.ast.Stmt.SpecBlock, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastStmtSpecBlock(o)
    return w.result
  }

  def to_langastStmtSpecBlock(data: ISZ[U8]): Either[org.sireum.lang.ast.Stmt.SpecBlock, MessagePack.ErrorMsg] = {
    def f_langastStmtSpecBlock(reader: Reader): org.sireum.lang.ast.Stmt.SpecBlock = {
      val r = reader.read_langastStmtSpecBlock()
      return r
    }
    val r = to(data, f_langastStmtSpecBlock _)
    return r
  }

  def from_langastStmtDeduceSequent(o: org.sireum.lang.ast.Stmt.DeduceSequent, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastStmtDeduceSequent(o)
    return w.result
  }

  def to_langastStmtDeduceSequent(data: ISZ[U8]): Either[org.sireum.lang.ast.Stmt.DeduceSequent, MessagePack.ErrorMsg] = {
    def f_langastStmtDeduceSequent(reader: Reader): org.sireum.lang.ast.Stmt.DeduceSequent = {
      val r = reader.read_langastStmtDeduceSequent()
      return r
    }
    val r = to(data, f_langastStmtDeduceSequent _)
    return r
  }

  def from_langastStmtDeduceSteps(o: org.sireum.lang.ast.Stmt.DeduceSteps, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastStmtDeduceSteps(o)
    return w.result
  }

  def to_langastStmtDeduceSteps(data: ISZ[U8]): Either[org.sireum.lang.ast.Stmt.DeduceSteps, MessagePack.ErrorMsg] = {
    def f_langastStmtDeduceSteps(reader: Reader): org.sireum.lang.ast.Stmt.DeduceSteps = {
      val r = reader.read_langastStmtDeduceSteps()
      return r
    }
    val r = to(data, f_langastStmtDeduceSteps _)
    return r
  }

  def from_langastStmtHavoc(o: org.sireum.lang.ast.Stmt.Havoc, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastStmtHavoc(o)
    return w.result
  }

  def to_langastStmtHavoc(data: ISZ[U8]): Either[org.sireum.lang.ast.Stmt.Havoc, MessagePack.ErrorMsg] = {
    def f_langastStmtHavoc(reader: Reader): org.sireum.lang.ast.Stmt.Havoc = {
      val r = reader.read_langastStmtHavoc()
      return r
    }
    val r = to(data, f_langastStmtHavoc _)
    return r
  }

  def from_langastMethodContract(o: org.sireum.lang.ast.MethodContract, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastMethodContract(o)
    return w.result
  }

  def to_langastMethodContract(data: ISZ[U8]): Either[org.sireum.lang.ast.MethodContract, MessagePack.ErrorMsg] = {
    def f_langastMethodContract(reader: Reader): org.sireum.lang.ast.MethodContract = {
      val r = reader.read_langastMethodContract()
      return r
    }
    val r = to(data, f_langastMethodContract _)
    return r
  }

  def from_langastMethodContractAccesses(o: org.sireum.lang.ast.MethodContract.Accesses, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastMethodContractAccesses(o)
    return w.result
  }

  def to_langastMethodContractAccesses(data: ISZ[U8]): Either[org.sireum.lang.ast.MethodContract.Accesses, MessagePack.ErrorMsg] = {
    def f_langastMethodContractAccesses(reader: Reader): org.sireum.lang.ast.MethodContract.Accesses = {
      val r = reader.read_langastMethodContractAccesses()
      return r
    }
    val r = to(data, f_langastMethodContractAccesses _)
    return r
  }

  def from_langastMethodContractClaims(o: org.sireum.lang.ast.MethodContract.Claims, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastMethodContractClaims(o)
    return w.result
  }

  def to_langastMethodContractClaims(data: ISZ[U8]): Either[org.sireum.lang.ast.MethodContract.Claims, MessagePack.ErrorMsg] = {
    def f_langastMethodContractClaims(reader: Reader): org.sireum.lang.ast.MethodContract.Claims = {
      val r = reader.read_langastMethodContractClaims()
      return r
    }
    val r = to(data, f_langastMethodContractClaims _)
    return r
  }

  def from_langastMethodContractSimple(o: org.sireum.lang.ast.MethodContract.Simple, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastMethodContractSimple(o)
    return w.result
  }

  def to_langastMethodContractSimple(data: ISZ[U8]): Either[org.sireum.lang.ast.MethodContract.Simple, MessagePack.ErrorMsg] = {
    def f_langastMethodContractSimple(reader: Reader): org.sireum.lang.ast.MethodContract.Simple = {
      val r = reader.read_langastMethodContractSimple()
      return r
    }
    val r = to(data, f_langastMethodContractSimple _)
    return r
  }

  def from_langastMethodContractCases(o: org.sireum.lang.ast.MethodContract.Cases, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastMethodContractCases(o)
    return w.result
  }

  def to_langastMethodContractCases(data: ISZ[U8]): Either[org.sireum.lang.ast.MethodContract.Cases, MessagePack.ErrorMsg] = {
    def f_langastMethodContractCases(reader: Reader): org.sireum.lang.ast.MethodContract.Cases = {
      val r = reader.read_langastMethodContractCases()
      return r
    }
    val r = to(data, f_langastMethodContractCases _)
    return r
  }

  def from_langastMethodContractCase(o: org.sireum.lang.ast.MethodContract.Case, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastMethodContractCase(o)
    return w.result
  }

  def to_langastMethodContractCase(data: ISZ[U8]): Either[org.sireum.lang.ast.MethodContract.Case, MessagePack.ErrorMsg] = {
    def f_langastMethodContractCase(reader: Reader): org.sireum.lang.ast.MethodContract.Case = {
      val r = reader.read_langastMethodContractCase()
      return r
    }
    val r = to(data, f_langastMethodContractCase _)
    return r
  }

  def from_langastMethodContractInfoFlows(o: org.sireum.lang.ast.MethodContract.InfoFlows, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastMethodContractInfoFlows(o)
    return w.result
  }

  def to_langastMethodContractInfoFlows(data: ISZ[U8]): Either[org.sireum.lang.ast.MethodContract.InfoFlows, MessagePack.ErrorMsg] = {
    def f_langastMethodContractInfoFlows(reader: Reader): org.sireum.lang.ast.MethodContract.InfoFlows = {
      val r = reader.read_langastMethodContractInfoFlows()
      return r
    }
    val r = to(data, f_langastMethodContractInfoFlows _)
    return r
  }

  def from_langastMethodContractInfoFlow(o: org.sireum.lang.ast.MethodContract.InfoFlow, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastMethodContractInfoFlow(o)
    return w.result
  }

  def to_langastMethodContractInfoFlow(data: ISZ[U8]): Either[org.sireum.lang.ast.MethodContract.InfoFlow, MessagePack.ErrorMsg] = {
    def f_langastMethodContractInfoFlow(reader: Reader): org.sireum.lang.ast.MethodContract.InfoFlow = {
      val r = reader.read_langastMethodContractInfoFlow()
      return r
    }
    val r = to(data, f_langastMethodContractInfoFlow _)
    return r
  }

  def from_langastSequent(o: org.sireum.lang.ast.Sequent, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastSequent(o)
    return w.result
  }

  def to_langastSequent(data: ISZ[U8]): Either[org.sireum.lang.ast.Sequent, MessagePack.ErrorMsg] = {
    def f_langastSequent(reader: Reader): org.sireum.lang.ast.Sequent = {
      val r = reader.read_langastSequent()
      return r
    }
    val r = to(data, f_langastSequent _)
    return r
  }

  def from_langastProofAst(o: org.sireum.lang.ast.ProofAst, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastProofAst(o)
    return w.result
  }

  def to_langastProofAst(data: ISZ[U8]): Either[org.sireum.lang.ast.ProofAst, MessagePack.ErrorMsg] = {
    def f_langastProofAst(reader: Reader): org.sireum.lang.ast.ProofAst = {
      val r = reader.read_langastProofAst()
      return r
    }
    val r = to(data, f_langastProofAst _)
    return r
  }

  def from_langastProofAstStep(o: org.sireum.lang.ast.ProofAst.Step, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastProofAstStep(o)
    return w.result
  }

  def to_langastProofAstStep(data: ISZ[U8]): Either[org.sireum.lang.ast.ProofAst.Step, MessagePack.ErrorMsg] = {
    def f_langastProofAstStep(reader: Reader): org.sireum.lang.ast.ProofAst.Step = {
      val r = reader.read_langastProofAstStep()
      return r
    }
    val r = to(data, f_langastProofAstStep _)
    return r
  }

  def from_langastProofAstStepId(o: org.sireum.lang.ast.ProofAst.StepId, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastProofAstStepId(o)
    return w.result
  }

  def to_langastProofAstStepId(data: ISZ[U8]): Either[org.sireum.lang.ast.ProofAst.StepId, MessagePack.ErrorMsg] = {
    def f_langastProofAstStepId(reader: Reader): org.sireum.lang.ast.ProofAst.StepId = {
      val r = reader.read_langastProofAstStepId()
      return r
    }
    val r = to(data, f_langastProofAstStepId _)
    return r
  }

  def from_langastProofAstStepIdNum(o: org.sireum.lang.ast.ProofAst.StepId.Num, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastProofAstStepIdNum(o)
    return w.result
  }

  def to_langastProofAstStepIdNum(data: ISZ[U8]): Either[org.sireum.lang.ast.ProofAst.StepId.Num, MessagePack.ErrorMsg] = {
    def f_langastProofAstStepIdNum(reader: Reader): org.sireum.lang.ast.ProofAst.StepId.Num = {
      val r = reader.read_langastProofAstStepIdNum()
      return r
    }
    val r = to(data, f_langastProofAstStepIdNum _)
    return r
  }

  def from_langastProofAstStepIdStr(o: org.sireum.lang.ast.ProofAst.StepId.Str, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastProofAstStepIdStr(o)
    return w.result
  }

  def to_langastProofAstStepIdStr(data: ISZ[U8]): Either[org.sireum.lang.ast.ProofAst.StepId.Str, MessagePack.ErrorMsg] = {
    def f_langastProofAstStepIdStr(reader: Reader): org.sireum.lang.ast.ProofAst.StepId.Str = {
      val r = reader.read_langastProofAstStepIdStr()
      return r
    }
    val r = to(data, f_langastProofAstStepIdStr _)
    return r
  }

  def from_langastProofAstStepRegular(o: org.sireum.lang.ast.ProofAst.Step.Regular, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastProofAstStepRegular(o)
    return w.result
  }

  def to_langastProofAstStepRegular(data: ISZ[U8]): Either[org.sireum.lang.ast.ProofAst.Step.Regular, MessagePack.ErrorMsg] = {
    def f_langastProofAstStepRegular(reader: Reader): org.sireum.lang.ast.ProofAst.Step.Regular = {
      val r = reader.read_langastProofAstStepRegular()
      return r
    }
    val r = to(data, f_langastProofAstStepRegular _)
    return r
  }

  def from_langastProofAstStepAssume(o: org.sireum.lang.ast.ProofAst.Step.Assume, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastProofAstStepAssume(o)
    return w.result
  }

  def to_langastProofAstStepAssume(data: ISZ[U8]): Either[org.sireum.lang.ast.ProofAst.Step.Assume, MessagePack.ErrorMsg] = {
    def f_langastProofAstStepAssume(reader: Reader): org.sireum.lang.ast.ProofAst.Step.Assume = {
      val r = reader.read_langastProofAstStepAssume()
      return r
    }
    val r = to(data, f_langastProofAstStepAssume _)
    return r
  }

  def from_langastProofAstStepAssert(o: org.sireum.lang.ast.ProofAst.Step.Assert, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastProofAstStepAssert(o)
    return w.result
  }

  def to_langastProofAstStepAssert(data: ISZ[U8]): Either[org.sireum.lang.ast.ProofAst.Step.Assert, MessagePack.ErrorMsg] = {
    def f_langastProofAstStepAssert(reader: Reader): org.sireum.lang.ast.ProofAst.Step.Assert = {
      val r = reader.read_langastProofAstStepAssert()
      return r
    }
    val r = to(data, f_langastProofAstStepAssert _)
    return r
  }

  def from_langastProofAstStepSubProof(o: org.sireum.lang.ast.ProofAst.Step.SubProof, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastProofAstStepSubProof(o)
    return w.result
  }

  def to_langastProofAstStepSubProof(data: ISZ[U8]): Either[org.sireum.lang.ast.ProofAst.Step.SubProof, MessagePack.ErrorMsg] = {
    def f_langastProofAstStepSubProof(reader: Reader): org.sireum.lang.ast.ProofAst.Step.SubProof = {
      val r = reader.read_langastProofAstStepSubProof()
      return r
    }
    val r = to(data, f_langastProofAstStepSubProof _)
    return r
  }

  def from_langastProofAstStepLet(o: org.sireum.lang.ast.ProofAst.Step.Let, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastProofAstStepLet(o)
    return w.result
  }

  def to_langastProofAstStepLet(data: ISZ[U8]): Either[org.sireum.lang.ast.ProofAst.Step.Let, MessagePack.ErrorMsg] = {
    def f_langastProofAstStepLet(reader: Reader): org.sireum.lang.ast.ProofAst.Step.Let = {
      val r = reader.read_langastProofAstStepLet()
      return r
    }
    val r = to(data, f_langastProofAstStepLet _)
    return r
  }

  def from_langastProofAstStepLetParam(o: org.sireum.lang.ast.ProofAst.Step.Let.Param, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastProofAstStepLetParam(o)
    return w.result
  }

  def to_langastProofAstStepLetParam(data: ISZ[U8]): Either[org.sireum.lang.ast.ProofAst.Step.Let.Param, MessagePack.ErrorMsg] = {
    def f_langastProofAstStepLetParam(reader: Reader): org.sireum.lang.ast.ProofAst.Step.Let.Param = {
      val r = reader.read_langastProofAstStepLetParam()
      return r
    }
    val r = to(data, f_langastProofAstStepLetParam _)
    return r
  }

  def from_langastProofAstStepStructInduction(o: org.sireum.lang.ast.ProofAst.Step.StructInduction, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastProofAstStepStructInduction(o)
    return w.result
  }

  def to_langastProofAstStepStructInduction(data: ISZ[U8]): Either[org.sireum.lang.ast.ProofAst.Step.StructInduction, MessagePack.ErrorMsg] = {
    def f_langastProofAstStepStructInduction(reader: Reader): org.sireum.lang.ast.ProofAst.Step.StructInduction = {
      val r = reader.read_langastProofAstStepStructInduction()
      return r
    }
    val r = to(data, f_langastProofAstStepStructInduction _)
    return r
  }

  def from_langastProofAstStepStructInductionMatchCase(o: org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastProofAstStepStructInductionMatchCase(o)
    return w.result
  }

  def to_langastProofAstStepStructInductionMatchCase(data: ISZ[U8]): Either[org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase, MessagePack.ErrorMsg] = {
    def f_langastProofAstStepStructInductionMatchCase(reader: Reader): org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchCase = {
      val r = reader.read_langastProofAstStepStructInductionMatchCase()
      return r
    }
    val r = to(data, f_langastProofAstStepStructInductionMatchCase _)
    return r
  }

  def from_langastProofAstStepStructInductionMatchDefault(o: org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastProofAstStepStructInductionMatchDefault(o)
    return w.result
  }

  def to_langastProofAstStepStructInductionMatchDefault(data: ISZ[U8]): Either[org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault, MessagePack.ErrorMsg] = {
    def f_langastProofAstStepStructInductionMatchDefault(reader: Reader): org.sireum.lang.ast.ProofAst.Step.StructInduction.MatchDefault = {
      val r = reader.read_langastProofAstStepStructInductionMatchDefault()
      return r
    }
    val r = to(data, f_langastProofAstStepStructInductionMatchDefault _)
    return r
  }

  def from_langastProofAstStepJustification(o: org.sireum.lang.ast.ProofAst.Step.Justification, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastProofAstStepJustification(o)
    return w.result
  }

  def to_langastProofAstStepJustification(data: ISZ[U8]): Either[org.sireum.lang.ast.ProofAst.Step.Justification, MessagePack.ErrorMsg] = {
    def f_langastProofAstStepJustification(reader: Reader): org.sireum.lang.ast.ProofAst.Step.Justification = {
      val r = reader.read_langastProofAstStepJustification()
      return r
    }
    val r = to(data, f_langastProofAstStepJustification _)
    return r
  }

  def from_langastProofAstStepInception(o: org.sireum.lang.ast.ProofAst.Step.Inception, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastProofAstStepInception(o)
    return w.result
  }

  def to_langastProofAstStepInception(data: ISZ[U8]): Either[org.sireum.lang.ast.ProofAst.Step.Inception, MessagePack.ErrorMsg] = {
    def f_langastProofAstStepInception(reader: Reader): org.sireum.lang.ast.ProofAst.Step.Inception = {
      val r = reader.read_langastProofAstStepInception()
      return r
    }
    val r = to(data, f_langastProofAstStepInception _)
    return r
  }

  def from_langastProofAstStepJustificationRef(o: org.sireum.lang.ast.ProofAst.Step.Justification.Ref, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastProofAstStepJustificationRef(o)
    return w.result
  }

  def to_langastProofAstStepJustificationRef(data: ISZ[U8]): Either[org.sireum.lang.ast.ProofAst.Step.Justification.Ref, MessagePack.ErrorMsg] = {
    def f_langastProofAstStepJustificationRef(reader: Reader): org.sireum.lang.ast.ProofAst.Step.Justification.Ref = {
      val r = reader.read_langastProofAstStepJustificationRef()
      return r
    }
    val r = to(data, f_langastProofAstStepJustificationRef _)
    return r
  }

  def from_langastProofAstStepJustificationApply(o: org.sireum.lang.ast.ProofAst.Step.Justification.Apply, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastProofAstStepJustificationApply(o)
    return w.result
  }

  def to_langastProofAstStepJustificationApply(data: ISZ[U8]): Either[org.sireum.lang.ast.ProofAst.Step.Justification.Apply, MessagePack.ErrorMsg] = {
    def f_langastProofAstStepJustificationApply(reader: Reader): org.sireum.lang.ast.ProofAst.Step.Justification.Apply = {
      val r = reader.read_langastProofAstStepJustificationApply()
      return r
    }
    val r = to(data, f_langastProofAstStepJustificationApply _)
    return r
  }

  def from_langastProofAstStepJustificationApplyNamed(o: org.sireum.lang.ast.ProofAst.Step.Justification.ApplyNamed, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastProofAstStepJustificationApplyNamed(o)
    return w.result
  }

  def to_langastProofAstStepJustificationApplyNamed(data: ISZ[U8]): Either[org.sireum.lang.ast.ProofAst.Step.Justification.ApplyNamed, MessagePack.ErrorMsg] = {
    def f_langastProofAstStepJustificationApplyNamed(reader: Reader): org.sireum.lang.ast.ProofAst.Step.Justification.ApplyNamed = {
      val r = reader.read_langastProofAstStepJustificationApplyNamed()
      return r
    }
    val r = to(data, f_langastProofAstStepJustificationApplyNamed _)
    return r
  }

  def from_langastProofAstStepJustificationApplyEta(o: org.sireum.lang.ast.ProofAst.Step.Justification.ApplyEta, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastProofAstStepJustificationApplyEta(o)
    return w.result
  }

  def to_langastProofAstStepJustificationApplyEta(data: ISZ[U8]): Either[org.sireum.lang.ast.ProofAst.Step.Justification.ApplyEta, MessagePack.ErrorMsg] = {
    def f_langastProofAstStepJustificationApplyEta(reader: Reader): org.sireum.lang.ast.ProofAst.Step.Justification.ApplyEta = {
      val r = reader.read_langastProofAstStepJustificationApplyEta()
      return r
    }
    val r = to(data, f_langastProofAstStepJustificationApplyEta _)
    return r
  }

  def from_langastAssignExp(o: org.sireum.lang.ast.AssignExp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastAssignExp(o)
    return w.result
  }

  def to_langastAssignExp(data: ISZ[U8]): Either[org.sireum.lang.ast.AssignExp, MessagePack.ErrorMsg] = {
    def f_langastAssignExp(reader: Reader): org.sireum.lang.ast.AssignExp = {
      val r = reader.read_langastAssignExp()
      return r
    }
    val r = to(data, f_langastAssignExp _)
    return r
  }

  def from_langastCase(o: org.sireum.lang.ast.Case, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastCase(o)
    return w.result
  }

  def to_langastCase(data: ISZ[U8]): Either[org.sireum.lang.ast.Case, MessagePack.ErrorMsg] = {
    def f_langastCase(reader: Reader): org.sireum.lang.ast.Case = {
      val r = reader.read_langastCase()
      return r
    }
    val r = to(data, f_langastCase _)
    return r
  }

  def from_langastEnumGenRange(o: org.sireum.lang.ast.EnumGen.Range, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastEnumGenRange(o)
    return w.result
  }

  def to_langastEnumGenRange(data: ISZ[U8]): Either[org.sireum.lang.ast.EnumGen.Range, MessagePack.ErrorMsg] = {
    def f_langastEnumGenRange(reader: Reader): org.sireum.lang.ast.EnumGen.Range = {
      val r = reader.read_langastEnumGenRange()
      return r
    }
    val r = to(data, f_langastEnumGenRange _)
    return r
  }

  def from_langastEnumGenRangeExpr(o: org.sireum.lang.ast.EnumGen.Range.Expr, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastEnumGenRangeExpr(o)
    return w.result
  }

  def to_langastEnumGenRangeExpr(data: ISZ[U8]): Either[org.sireum.lang.ast.EnumGen.Range.Expr, MessagePack.ErrorMsg] = {
    def f_langastEnumGenRangeExpr(reader: Reader): org.sireum.lang.ast.EnumGen.Range.Expr = {
      val r = reader.read_langastEnumGenRangeExpr()
      return r
    }
    val r = to(data, f_langastEnumGenRangeExpr _)
    return r
  }

  def from_langastEnumGenRangeStep(o: org.sireum.lang.ast.EnumGen.Range.Step, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastEnumGenRangeStep(o)
    return w.result
  }

  def to_langastEnumGenRangeStep(data: ISZ[U8]): Either[org.sireum.lang.ast.EnumGen.Range.Step, MessagePack.ErrorMsg] = {
    def f_langastEnumGenRangeStep(reader: Reader): org.sireum.lang.ast.EnumGen.Range.Step = {
      val r = reader.read_langastEnumGenRangeStep()
      return r
    }
    val r = to(data, f_langastEnumGenRangeStep _)
    return r
  }

  def from_langastEnumGenFor(o: org.sireum.lang.ast.EnumGen.For, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastEnumGenFor(o)
    return w.result
  }

  def to_langastEnumGenFor(data: ISZ[U8]): Either[org.sireum.lang.ast.EnumGen.For, MessagePack.ErrorMsg] = {
    def f_langastEnumGenFor(reader: Reader): org.sireum.lang.ast.EnumGen.For = {
      val r = reader.read_langastEnumGenFor()
      return r
    }
    val r = to(data, f_langastEnumGenFor _)
    return r
  }

  def from_langastType(o: org.sireum.lang.ast.Type, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastType(o)
    return w.result
  }

  def to_langastType(data: ISZ[U8]): Either[org.sireum.lang.ast.Type, MessagePack.ErrorMsg] = {
    def f_langastType(reader: Reader): org.sireum.lang.ast.Type = {
      val r = reader.read_langastType()
      return r
    }
    val r = to(data, f_langastType _)
    return r
  }

  def from_langastTypeNamed(o: org.sireum.lang.ast.Type.Named, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastTypeNamed(o)
    return w.result
  }

  def to_langastTypeNamed(data: ISZ[U8]): Either[org.sireum.lang.ast.Type.Named, MessagePack.ErrorMsg] = {
    def f_langastTypeNamed(reader: Reader): org.sireum.lang.ast.Type.Named = {
      val r = reader.read_langastTypeNamed()
      return r
    }
    val r = to(data, f_langastTypeNamed _)
    return r
  }

  def from_langastTypeFun(o: org.sireum.lang.ast.Type.Fun, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastTypeFun(o)
    return w.result
  }

  def to_langastTypeFun(data: ISZ[U8]): Either[org.sireum.lang.ast.Type.Fun, MessagePack.ErrorMsg] = {
    def f_langastTypeFun(reader: Reader): org.sireum.lang.ast.Type.Fun = {
      val r = reader.read_langastTypeFun()
      return r
    }
    val r = to(data, f_langastTypeFun _)
    return r
  }

  def from_langastTypeTuple(o: org.sireum.lang.ast.Type.Tuple, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastTypeTuple(o)
    return w.result
  }

  def to_langastTypeTuple(data: ISZ[U8]): Either[org.sireum.lang.ast.Type.Tuple, MessagePack.ErrorMsg] = {
    def f_langastTypeTuple(reader: Reader): org.sireum.lang.ast.Type.Tuple = {
      val r = reader.read_langastTypeTuple()
      return r
    }
    val r = to(data, f_langastTypeTuple _)
    return r
  }

  def from_langastPattern(o: org.sireum.lang.ast.Pattern, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastPattern(o)
    return w.result
  }

  def to_langastPattern(data: ISZ[U8]): Either[org.sireum.lang.ast.Pattern, MessagePack.ErrorMsg] = {
    def f_langastPattern(reader: Reader): org.sireum.lang.ast.Pattern = {
      val r = reader.read_langastPattern()
      return r
    }
    val r = to(data, f_langastPattern _)
    return r
  }

  def from_langastPatternLiteral(o: org.sireum.lang.ast.Pattern.Literal, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastPatternLiteral(o)
    return w.result
  }

  def to_langastPatternLiteral(data: ISZ[U8]): Either[org.sireum.lang.ast.Pattern.Literal, MessagePack.ErrorMsg] = {
    def f_langastPatternLiteral(reader: Reader): org.sireum.lang.ast.Pattern.Literal = {
      val r = reader.read_langastPatternLiteral()
      return r
    }
    val r = to(data, f_langastPatternLiteral _)
    return r
  }

  def from_langastPatternLitInterpolate(o: org.sireum.lang.ast.Pattern.LitInterpolate, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastPatternLitInterpolate(o)
    return w.result
  }

  def to_langastPatternLitInterpolate(data: ISZ[U8]): Either[org.sireum.lang.ast.Pattern.LitInterpolate, MessagePack.ErrorMsg] = {
    def f_langastPatternLitInterpolate(reader: Reader): org.sireum.lang.ast.Pattern.LitInterpolate = {
      val r = reader.read_langastPatternLitInterpolate()
      return r
    }
    val r = to(data, f_langastPatternLitInterpolate _)
    return r
  }

  def from_langastPatternRef(o: org.sireum.lang.ast.Pattern.Ref, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastPatternRef(o)
    return w.result
  }

  def to_langastPatternRef(data: ISZ[U8]): Either[org.sireum.lang.ast.Pattern.Ref, MessagePack.ErrorMsg] = {
    def f_langastPatternRef(reader: Reader): org.sireum.lang.ast.Pattern.Ref = {
      val r = reader.read_langastPatternRef()
      return r
    }
    val r = to(data, f_langastPatternRef _)
    return r
  }

  def from_langastPatternVarBinding(o: org.sireum.lang.ast.Pattern.VarBinding, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastPatternVarBinding(o)
    return w.result
  }

  def to_langastPatternVarBinding(data: ISZ[U8]): Either[org.sireum.lang.ast.Pattern.VarBinding, MessagePack.ErrorMsg] = {
    def f_langastPatternVarBinding(reader: Reader): org.sireum.lang.ast.Pattern.VarBinding = {
      val r = reader.read_langastPatternVarBinding()
      return r
    }
    val r = to(data, f_langastPatternVarBinding _)
    return r
  }

  def from_langastPatternWildcard(o: org.sireum.lang.ast.Pattern.Wildcard, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastPatternWildcard(o)
    return w.result
  }

  def to_langastPatternWildcard(data: ISZ[U8]): Either[org.sireum.lang.ast.Pattern.Wildcard, MessagePack.ErrorMsg] = {
    def f_langastPatternWildcard(reader: Reader): org.sireum.lang.ast.Pattern.Wildcard = {
      val r = reader.read_langastPatternWildcard()
      return r
    }
    val r = to(data, f_langastPatternWildcard _)
    return r
  }

  def from_langastPatternSeqWildcard(o: org.sireum.lang.ast.Pattern.SeqWildcard, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastPatternSeqWildcard(o)
    return w.result
  }

  def to_langastPatternSeqWildcard(data: ISZ[U8]): Either[org.sireum.lang.ast.Pattern.SeqWildcard, MessagePack.ErrorMsg] = {
    def f_langastPatternSeqWildcard(reader: Reader): org.sireum.lang.ast.Pattern.SeqWildcard = {
      val r = reader.read_langastPatternSeqWildcard()
      return r
    }
    val r = to(data, f_langastPatternSeqWildcard _)
    return r
  }

  def from_langastPatternStructure(o: org.sireum.lang.ast.Pattern.Structure, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastPatternStructure(o)
    return w.result
  }

  def to_langastPatternStructure(data: ISZ[U8]): Either[org.sireum.lang.ast.Pattern.Structure, MessagePack.ErrorMsg] = {
    def f_langastPatternStructure(reader: Reader): org.sireum.lang.ast.Pattern.Structure = {
      val r = reader.read_langastPatternStructure()
      return r
    }
    val r = to(data, f_langastPatternStructure _)
    return r
  }

  def from_langastExp(o: org.sireum.lang.ast.Exp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastExp(o)
    return w.result
  }

  def to_langastExp(data: ISZ[U8]): Either[org.sireum.lang.ast.Exp, MessagePack.ErrorMsg] = {
    def f_langastExp(reader: Reader): org.sireum.lang.ast.Exp = {
      val r = reader.read_langastExp()
      return r
    }
    val r = to(data, f_langastExp _)
    return r
  }

  def from_langastLit(o: org.sireum.lang.ast.Lit, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastLit(o)
    return w.result
  }

  def to_langastLit(data: ISZ[U8]): Either[org.sireum.lang.ast.Lit, MessagePack.ErrorMsg] = {
    def f_langastLit(reader: Reader): org.sireum.lang.ast.Lit = {
      val r = reader.read_langastLit()
      return r
    }
    val r = to(data, f_langastLit _)
    return r
  }

  def from_langastExpLitB(o: org.sireum.lang.ast.Exp.LitB, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastExpLitB(o)
    return w.result
  }

  def to_langastExpLitB(data: ISZ[U8]): Either[org.sireum.lang.ast.Exp.LitB, MessagePack.ErrorMsg] = {
    def f_langastExpLitB(reader: Reader): org.sireum.lang.ast.Exp.LitB = {
      val r = reader.read_langastExpLitB()
      return r
    }
    val r = to(data, f_langastExpLitB _)
    return r
  }

  def from_langastExpLitC(o: org.sireum.lang.ast.Exp.LitC, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastExpLitC(o)
    return w.result
  }

  def to_langastExpLitC(data: ISZ[U8]): Either[org.sireum.lang.ast.Exp.LitC, MessagePack.ErrorMsg] = {
    def f_langastExpLitC(reader: Reader): org.sireum.lang.ast.Exp.LitC = {
      val r = reader.read_langastExpLitC()
      return r
    }
    val r = to(data, f_langastExpLitC _)
    return r
  }

  def from_langastExpLitZ(o: org.sireum.lang.ast.Exp.LitZ, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastExpLitZ(o)
    return w.result
  }

  def to_langastExpLitZ(data: ISZ[U8]): Either[org.sireum.lang.ast.Exp.LitZ, MessagePack.ErrorMsg] = {
    def f_langastExpLitZ(reader: Reader): org.sireum.lang.ast.Exp.LitZ = {
      val r = reader.read_langastExpLitZ()
      return r
    }
    val r = to(data, f_langastExpLitZ _)
    return r
  }

  def from_langastExpLitF32(o: org.sireum.lang.ast.Exp.LitF32, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastExpLitF32(o)
    return w.result
  }

  def to_langastExpLitF32(data: ISZ[U8]): Either[org.sireum.lang.ast.Exp.LitF32, MessagePack.ErrorMsg] = {
    def f_langastExpLitF32(reader: Reader): org.sireum.lang.ast.Exp.LitF32 = {
      val r = reader.read_langastExpLitF32()
      return r
    }
    val r = to(data, f_langastExpLitF32 _)
    return r
  }

  def from_langastExpLitF64(o: org.sireum.lang.ast.Exp.LitF64, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastExpLitF64(o)
    return w.result
  }

  def to_langastExpLitF64(data: ISZ[U8]): Either[org.sireum.lang.ast.Exp.LitF64, MessagePack.ErrorMsg] = {
    def f_langastExpLitF64(reader: Reader): org.sireum.lang.ast.Exp.LitF64 = {
      val r = reader.read_langastExpLitF64()
      return r
    }
    val r = to(data, f_langastExpLitF64 _)
    return r
  }

  def from_langastExpLitR(o: org.sireum.lang.ast.Exp.LitR, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastExpLitR(o)
    return w.result
  }

  def to_langastExpLitR(data: ISZ[U8]): Either[org.sireum.lang.ast.Exp.LitR, MessagePack.ErrorMsg] = {
    def f_langastExpLitR(reader: Reader): org.sireum.lang.ast.Exp.LitR = {
      val r = reader.read_langastExpLitR()
      return r
    }
    val r = to(data, f_langastExpLitR _)
    return r
  }

  def from_langastExpLitString(o: org.sireum.lang.ast.Exp.LitString, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastExpLitString(o)
    return w.result
  }

  def to_langastExpLitString(data: ISZ[U8]): Either[org.sireum.lang.ast.Exp.LitString, MessagePack.ErrorMsg] = {
    def f_langastExpLitString(reader: Reader): org.sireum.lang.ast.Exp.LitString = {
      val r = reader.read_langastExpLitString()
      return r
    }
    val r = to(data, f_langastExpLitString _)
    return r
  }

  def from_langastExpLitStepId(o: org.sireum.lang.ast.Exp.LitStepId, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastExpLitStepId(o)
    return w.result
  }

  def to_langastExpLitStepId(data: ISZ[U8]): Either[org.sireum.lang.ast.Exp.LitStepId, MessagePack.ErrorMsg] = {
    def f_langastExpLitStepId(reader: Reader): org.sireum.lang.ast.Exp.LitStepId = {
      val r = reader.read_langastExpLitStepId()
      return r
    }
    val r = to(data, f_langastExpLitStepId _)
    return r
  }

  def from_langastExpStringInterpolate(o: org.sireum.lang.ast.Exp.StringInterpolate, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastExpStringInterpolate(o)
    return w.result
  }

  def to_langastExpStringInterpolate(data: ISZ[U8]): Either[org.sireum.lang.ast.Exp.StringInterpolate, MessagePack.ErrorMsg] = {
    def f_langastExpStringInterpolate(reader: Reader): org.sireum.lang.ast.Exp.StringInterpolate = {
      val r = reader.read_langastExpStringInterpolate()
      return r
    }
    val r = to(data, f_langastExpStringInterpolate _)
    return r
  }

  def from_langastExpThis(o: org.sireum.lang.ast.Exp.This, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastExpThis(o)
    return w.result
  }

  def to_langastExpThis(data: ISZ[U8]): Either[org.sireum.lang.ast.Exp.This, MessagePack.ErrorMsg] = {
    def f_langastExpThis(reader: Reader): org.sireum.lang.ast.Exp.This = {
      val r = reader.read_langastExpThis()
      return r
    }
    val r = to(data, f_langastExpThis _)
    return r
  }

  def from_langastExpSuper(o: org.sireum.lang.ast.Exp.Super, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastExpSuper(o)
    return w.result
  }

  def to_langastExpSuper(data: ISZ[U8]): Either[org.sireum.lang.ast.Exp.Super, MessagePack.ErrorMsg] = {
    def f_langastExpSuper(reader: Reader): org.sireum.lang.ast.Exp.Super = {
      val r = reader.read_langastExpSuper()
      return r
    }
    val r = to(data, f_langastExpSuper _)
    return r
  }

  def from_langastExpUnary(o: org.sireum.lang.ast.Exp.Unary, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastExpUnary(o)
    return w.result
  }

  def to_langastExpUnary(data: ISZ[U8]): Either[org.sireum.lang.ast.Exp.Unary, MessagePack.ErrorMsg] = {
    def f_langastExpUnary(reader: Reader): org.sireum.lang.ast.Exp.Unary = {
      val r = reader.read_langastExpUnary()
      return r
    }
    val r = to(data, f_langastExpUnary _)
    return r
  }

  def from_langastExpRef(o: org.sireum.lang.ast.Exp.Ref, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastExpRef(o)
    return w.result
  }

  def to_langastExpRef(data: ISZ[U8]): Either[org.sireum.lang.ast.Exp.Ref, MessagePack.ErrorMsg] = {
    def f_langastExpRef(reader: Reader): org.sireum.lang.ast.Exp.Ref = {
      val r = reader.read_langastExpRef()
      return r
    }
    val r = to(data, f_langastExpRef _)
    return r
  }

  def from_langastExpBinary(o: org.sireum.lang.ast.Exp.Binary, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastExpBinary(o)
    return w.result
  }

  def to_langastExpBinary(data: ISZ[U8]): Either[org.sireum.lang.ast.Exp.Binary, MessagePack.ErrorMsg] = {
    def f_langastExpBinary(reader: Reader): org.sireum.lang.ast.Exp.Binary = {
      val r = reader.read_langastExpBinary()
      return r
    }
    val r = to(data, f_langastExpBinary _)
    return r
  }

  def from_langastExpIdent(o: org.sireum.lang.ast.Exp.Ident, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastExpIdent(o)
    return w.result
  }

  def to_langastExpIdent(data: ISZ[U8]): Either[org.sireum.lang.ast.Exp.Ident, MessagePack.ErrorMsg] = {
    def f_langastExpIdent(reader: Reader): org.sireum.lang.ast.Exp.Ident = {
      val r = reader.read_langastExpIdent()
      return r
    }
    val r = to(data, f_langastExpIdent _)
    return r
  }

  def from_langastExpEta(o: org.sireum.lang.ast.Exp.Eta, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastExpEta(o)
    return w.result
  }

  def to_langastExpEta(data: ISZ[U8]): Either[org.sireum.lang.ast.Exp.Eta, MessagePack.ErrorMsg] = {
    def f_langastExpEta(reader: Reader): org.sireum.lang.ast.Exp.Eta = {
      val r = reader.read_langastExpEta()
      return r
    }
    val r = to(data, f_langastExpEta _)
    return r
  }

  def from_langastExpTuple(o: org.sireum.lang.ast.Exp.Tuple, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastExpTuple(o)
    return w.result
  }

  def to_langastExpTuple(data: ISZ[U8]): Either[org.sireum.lang.ast.Exp.Tuple, MessagePack.ErrorMsg] = {
    def f_langastExpTuple(reader: Reader): org.sireum.lang.ast.Exp.Tuple = {
      val r = reader.read_langastExpTuple()
      return r
    }
    val r = to(data, f_langastExpTuple _)
    return r
  }

  def from_langastExpSelect(o: org.sireum.lang.ast.Exp.Select, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastExpSelect(o)
    return w.result
  }

  def to_langastExpSelect(data: ISZ[U8]): Either[org.sireum.lang.ast.Exp.Select, MessagePack.ErrorMsg] = {
    def f_langastExpSelect(reader: Reader): org.sireum.lang.ast.Exp.Select = {
      val r = reader.read_langastExpSelect()
      return r
    }
    val r = to(data, f_langastExpSelect _)
    return r
  }

  def from_langastExpInvoke(o: org.sireum.lang.ast.Exp.Invoke, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastExpInvoke(o)
    return w.result
  }

  def to_langastExpInvoke(data: ISZ[U8]): Either[org.sireum.lang.ast.Exp.Invoke, MessagePack.ErrorMsg] = {
    def f_langastExpInvoke(reader: Reader): org.sireum.lang.ast.Exp.Invoke = {
      val r = reader.read_langastExpInvoke()
      return r
    }
    val r = to(data, f_langastExpInvoke _)
    return r
  }

  def from_langastExpInvokeNamed(o: org.sireum.lang.ast.Exp.InvokeNamed, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastExpInvokeNamed(o)
    return w.result
  }

  def to_langastExpInvokeNamed(data: ISZ[U8]): Either[org.sireum.lang.ast.Exp.InvokeNamed, MessagePack.ErrorMsg] = {
    def f_langastExpInvokeNamed(reader: Reader): org.sireum.lang.ast.Exp.InvokeNamed = {
      val r = reader.read_langastExpInvokeNamed()
      return r
    }
    val r = to(data, f_langastExpInvokeNamed _)
    return r
  }

  def from_langastExpIf(o: org.sireum.lang.ast.Exp.If, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastExpIf(o)
    return w.result
  }

  def to_langastExpIf(data: ISZ[U8]): Either[org.sireum.lang.ast.Exp.If, MessagePack.ErrorMsg] = {
    def f_langastExpIf(reader: Reader): org.sireum.lang.ast.Exp.If = {
      val r = reader.read_langastExpIf()
      return r
    }
    val r = to(data, f_langastExpIf _)
    return r
  }

  def from_langastExpTypeCond(o: org.sireum.lang.ast.Exp.TypeCond, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastExpTypeCond(o)
    return w.result
  }

  def to_langastExpTypeCond(data: ISZ[U8]): Either[org.sireum.lang.ast.Exp.TypeCond, MessagePack.ErrorMsg] = {
    def f_langastExpTypeCond(reader: Reader): org.sireum.lang.ast.Exp.TypeCond = {
      val r = reader.read_langastExpTypeCond()
      return r
    }
    val r = to(data, f_langastExpTypeCond _)
    return r
  }

  def from_langastExpSym(o: org.sireum.lang.ast.Exp.Sym, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastExpSym(o)
    return w.result
  }

  def to_langastExpSym(data: ISZ[U8]): Either[org.sireum.lang.ast.Exp.Sym, MessagePack.ErrorMsg] = {
    def f_langastExpSym(reader: Reader): org.sireum.lang.ast.Exp.Sym = {
      val r = reader.read_langastExpSym()
      return r
    }
    val r = to(data, f_langastExpSym _)
    return r
  }

  def from_langastExpFunParam(o: org.sireum.lang.ast.Exp.Fun.Param, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastExpFunParam(o)
    return w.result
  }

  def to_langastExpFunParam(data: ISZ[U8]): Either[org.sireum.lang.ast.Exp.Fun.Param, MessagePack.ErrorMsg] = {
    def f_langastExpFunParam(reader: Reader): org.sireum.lang.ast.Exp.Fun.Param = {
      val r = reader.read_langastExpFunParam()
      return r
    }
    val r = to(data, f_langastExpFunParam _)
    return r
  }

  def from_langastExpFun(o: org.sireum.lang.ast.Exp.Fun, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastExpFun(o)
    return w.result
  }

  def to_langastExpFun(data: ISZ[U8]): Either[org.sireum.lang.ast.Exp.Fun, MessagePack.ErrorMsg] = {
    def f_langastExpFun(reader: Reader): org.sireum.lang.ast.Exp.Fun = {
      val r = reader.read_langastExpFun()
      return r
    }
    val r = to(data, f_langastExpFun _)
    return r
  }

  def from_langastExpForYield(o: org.sireum.lang.ast.Exp.ForYield, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastExpForYield(o)
    return w.result
  }

  def to_langastExpForYield(data: ISZ[U8]): Either[org.sireum.lang.ast.Exp.ForYield, MessagePack.ErrorMsg] = {
    def f_langastExpForYield(reader: Reader): org.sireum.lang.ast.Exp.ForYield = {
      val r = reader.read_langastExpForYield()
      return r
    }
    val r = to(data, f_langastExpForYield _)
    return r
  }

  def from_langastExpQuant(o: org.sireum.lang.ast.Exp.Quant, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastExpQuant(o)
    return w.result
  }

  def to_langastExpQuant(data: ISZ[U8]): Either[org.sireum.lang.ast.Exp.Quant, MessagePack.ErrorMsg] = {
    def f_langastExpQuant(reader: Reader): org.sireum.lang.ast.Exp.Quant = {
      val r = reader.read_langastExpQuant()
      return r
    }
    val r = to(data, f_langastExpQuant _)
    return r
  }

  def from_langastExpQuantType(o: org.sireum.lang.ast.Exp.QuantType, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastExpQuantType(o)
    return w.result
  }

  def to_langastExpQuantType(data: ISZ[U8]): Either[org.sireum.lang.ast.Exp.QuantType, MessagePack.ErrorMsg] = {
    def f_langastExpQuantType(reader: Reader): org.sireum.lang.ast.Exp.QuantType = {
      val r = reader.read_langastExpQuantType()
      return r
    }
    val r = to(data, f_langastExpQuantType _)
    return r
  }

  def from_langastExpQuantRange(o: org.sireum.lang.ast.Exp.QuantRange, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastExpQuantRange(o)
    return w.result
  }

  def to_langastExpQuantRange(data: ISZ[U8]): Either[org.sireum.lang.ast.Exp.QuantRange, MessagePack.ErrorMsg] = {
    def f_langastExpQuantRange(reader: Reader): org.sireum.lang.ast.Exp.QuantRange = {
      val r = reader.read_langastExpQuantRange()
      return r
    }
    val r = to(data, f_langastExpQuantRange _)
    return r
  }

  def from_langastExpQuantEach(o: org.sireum.lang.ast.Exp.QuantEach, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastExpQuantEach(o)
    return w.result
  }

  def to_langastExpQuantEach(data: ISZ[U8]): Either[org.sireum.lang.ast.Exp.QuantEach, MessagePack.ErrorMsg] = {
    def f_langastExpQuantEach(reader: Reader): org.sireum.lang.ast.Exp.QuantEach = {
      val r = reader.read_langastExpQuantEach()
      return r
    }
    val r = to(data, f_langastExpQuantEach _)
    return r
  }

  def from_langastExpInput(o: org.sireum.lang.ast.Exp.Input, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastExpInput(o)
    return w.result
  }

  def to_langastExpInput(data: ISZ[U8]): Either[org.sireum.lang.ast.Exp.Input, MessagePack.ErrorMsg] = {
    def f_langastExpInput(reader: Reader): org.sireum.lang.ast.Exp.Input = {
      val r = reader.read_langastExpInput()
      return r
    }
    val r = to(data, f_langastExpInput _)
    return r
  }

  def from_langastExpAt(o: org.sireum.lang.ast.Exp.At, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastExpAt(o)
    return w.result
  }

  def to_langastExpAt(data: ISZ[U8]): Either[org.sireum.lang.ast.Exp.At, MessagePack.ErrorMsg] = {
    def f_langastExpAt(reader: Reader): org.sireum.lang.ast.Exp.At = {
      val r = reader.read_langastExpAt()
      return r
    }
    val r = to(data, f_langastExpAt _)
    return r
  }

  def from_langastExpLoopIndex(o: org.sireum.lang.ast.Exp.LoopIndex, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastExpLoopIndex(o)
    return w.result
  }

  def to_langastExpLoopIndex(data: ISZ[U8]): Either[org.sireum.lang.ast.Exp.LoopIndex, MessagePack.ErrorMsg] = {
    def f_langastExpLoopIndex(reader: Reader): org.sireum.lang.ast.Exp.LoopIndex = {
      val r = reader.read_langastExpLoopIndex()
      return r
    }
    val r = to(data, f_langastExpLoopIndex _)
    return r
  }

  def from_langastExpStateSeq(o: org.sireum.lang.ast.Exp.StateSeq, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastExpStateSeq(o)
    return w.result
  }

  def to_langastExpStateSeq(data: ISZ[U8]): Either[org.sireum.lang.ast.Exp.StateSeq, MessagePack.ErrorMsg] = {
    def f_langastExpStateSeq(reader: Reader): org.sireum.lang.ast.Exp.StateSeq = {
      val r = reader.read_langastExpStateSeq()
      return r
    }
    val r = to(data, f_langastExpStateSeq _)
    return r
  }

  def from_langastExpStateSeqFragment(o: org.sireum.lang.ast.Exp.StateSeq.Fragment, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastExpStateSeqFragment(o)
    return w.result
  }

  def to_langastExpStateSeqFragment(data: ISZ[U8]): Either[org.sireum.lang.ast.Exp.StateSeq.Fragment, MessagePack.ErrorMsg] = {
    def f_langastExpStateSeqFragment(reader: Reader): org.sireum.lang.ast.Exp.StateSeq.Fragment = {
      val r = reader.read_langastExpStateSeqFragment()
      return r
    }
    val r = to(data, f_langastExpStateSeqFragment _)
    return r
  }

  def from_langastExpResult(o: org.sireum.lang.ast.Exp.Result, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastExpResult(o)
    return w.result
  }

  def to_langastExpResult(data: ISZ[U8]): Either[org.sireum.lang.ast.Exp.Result, MessagePack.ErrorMsg] = {
    def f_langastExpResult(reader: Reader): org.sireum.lang.ast.Exp.Result = {
      val r = reader.read_langastExpResult()
      return r
    }
    val r = to(data, f_langastExpResult _)
    return r
  }

  def from_langastExpAssumeAgree(o: org.sireum.lang.ast.Exp.AssumeAgree, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastExpAssumeAgree(o)
    return w.result
  }

  def to_langastExpAssumeAgree(data: ISZ[U8]): Either[org.sireum.lang.ast.Exp.AssumeAgree, MessagePack.ErrorMsg] = {
    def f_langastExpAssumeAgree(reader: Reader): org.sireum.lang.ast.Exp.AssumeAgree = {
      val r = reader.read_langastExpAssumeAgree()
      return r
    }
    val r = to(data, f_langastExpAssumeAgree _)
    return r
  }

  def from_langastExpAssertAgree(o: org.sireum.lang.ast.Exp.AssertAgree, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastExpAssertAgree(o)
    return w.result
  }

  def to_langastExpAssertAgree(data: ISZ[U8]): Either[org.sireum.lang.ast.Exp.AssertAgree, MessagePack.ErrorMsg] = {
    def f_langastExpAssertAgree(reader: Reader): org.sireum.lang.ast.Exp.AssertAgree = {
      val r = reader.read_langastExpAssertAgree()
      return r
    }
    val r = to(data, f_langastExpAssertAgree _)
    return r
  }

  def from_langastExpInfoFlowInvariant(o: org.sireum.lang.ast.Exp.InfoFlowInvariant, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastExpInfoFlowInvariant(o)
    return w.result
  }

  def to_langastExpInfoFlowInvariant(data: ISZ[U8]): Either[org.sireum.lang.ast.Exp.InfoFlowInvariant, MessagePack.ErrorMsg] = {
    def f_langastExpInfoFlowInvariant(reader: Reader): org.sireum.lang.ast.Exp.InfoFlowInvariant = {
      val r = reader.read_langastExpInfoFlowInvariant()
      return r
    }
    val r = to(data, f_langastExpInfoFlowInvariant _)
    return r
  }

  def from_langastNamedArg(o: org.sireum.lang.ast.NamedArg, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastNamedArg(o)
    return w.result
  }

  def to_langastNamedArg(data: ISZ[U8]): Either[org.sireum.lang.ast.NamedArg, MessagePack.ErrorMsg] = {
    def f_langastNamedArg(reader: Reader): org.sireum.lang.ast.NamedArg = {
      val r = reader.read_langastNamedArg()
      return r
    }
    val r = to(data, f_langastNamedArg _)
    return r
  }

  def from_langastId(o: org.sireum.lang.ast.Id, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastId(o)
    return w.result
  }

  def to_langastId(data: ISZ[U8]): Either[org.sireum.lang.ast.Id, MessagePack.ErrorMsg] = {
    def f_langastId(reader: Reader): org.sireum.lang.ast.Id = {
      val r = reader.read_langastId()
      return r
    }
    val r = to(data, f_langastId _)
    return r
  }

  def from_langastName(o: org.sireum.lang.ast.Name, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastName(o)
    return w.result
  }

  def to_langastName(data: ISZ[U8]): Either[org.sireum.lang.ast.Name, MessagePack.ErrorMsg] = {
    def f_langastName(reader: Reader): org.sireum.lang.ast.Name = {
      val r = reader.read_langastName()
      return r
    }
    val r = to(data, f_langastName _)
    return r
  }

  def from_langastBody(o: org.sireum.lang.ast.Body, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastBody(o)
    return w.result
  }

  def to_langastBody(data: ISZ[U8]): Either[org.sireum.lang.ast.Body, MessagePack.ErrorMsg] = {
    def f_langastBody(reader: Reader): org.sireum.lang.ast.Body = {
      val r = reader.read_langastBody()
      return r
    }
    val r = to(data, f_langastBody _)
    return r
  }

  def from_langastAdtParam(o: org.sireum.lang.ast.AdtParam, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastAdtParam(o)
    return w.result
  }

  def to_langastAdtParam(data: ISZ[U8]): Either[org.sireum.lang.ast.AdtParam, MessagePack.ErrorMsg] = {
    def f_langastAdtParam(reader: Reader): org.sireum.lang.ast.AdtParam = {
      val r = reader.read_langastAdtParam()
      return r
    }
    val r = to(data, f_langastAdtParam _)
    return r
  }

  def from_langastMethodSig(o: org.sireum.lang.ast.MethodSig, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastMethodSig(o)
    return w.result
  }

  def to_langastMethodSig(data: ISZ[U8]): Either[org.sireum.lang.ast.MethodSig, MessagePack.ErrorMsg] = {
    def f_langastMethodSig(reader: Reader): org.sireum.lang.ast.MethodSig = {
      val r = reader.read_langastMethodSig()
      return r
    }
    val r = to(data, f_langastMethodSig _)
    return r
  }

  def from_langastParam(o: org.sireum.lang.ast.Param, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastParam(o)
    return w.result
  }

  def to_langastParam(data: ISZ[U8]): Either[org.sireum.lang.ast.Param, MessagePack.ErrorMsg] = {
    def f_langastParam(reader: Reader): org.sireum.lang.ast.Param = {
      val r = reader.read_langastParam()
      return r
    }
    val r = to(data, f_langastParam _)
    return r
  }

  def from_langastTypeParam(o: org.sireum.lang.ast.TypeParam, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastTypeParam(o)
    return w.result
  }

  def to_langastTypeParam(data: ISZ[U8]): Either[org.sireum.lang.ast.TypeParam, MessagePack.ErrorMsg] = {
    def f_langastTypeParam(reader: Reader): org.sireum.lang.ast.TypeParam = {
      val r = reader.read_langastTypeParam()
      return r
    }
    val r = to(data, f_langastTypeParam _)
    return r
  }

  def from_langastAttr(o: org.sireum.lang.ast.Attr, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastAttr(o)
    return w.result
  }

  def to_langastAttr(data: ISZ[U8]): Either[org.sireum.lang.ast.Attr, MessagePack.ErrorMsg] = {
    def f_langastAttr(reader: Reader): org.sireum.lang.ast.Attr = {
      val r = reader.read_langastAttr()
      return r
    }
    val r = to(data, f_langastAttr _)
    return r
  }

  def from_langastTypedAttr(o: org.sireum.lang.ast.TypedAttr, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastTypedAttr(o)
    return w.result
  }

  def to_langastTypedAttr(data: ISZ[U8]): Either[org.sireum.lang.ast.TypedAttr, MessagePack.ErrorMsg] = {
    def f_langastTypedAttr(reader: Reader): org.sireum.lang.ast.TypedAttr = {
      val r = reader.read_langastTypedAttr()
      return r
    }
    val r = to(data, f_langastTypedAttr _)
    return r
  }

  def from_langastResolvedAttr(o: org.sireum.lang.ast.ResolvedAttr, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastResolvedAttr(o)
    return w.result
  }

  def to_langastResolvedAttr(data: ISZ[U8]): Either[org.sireum.lang.ast.ResolvedAttr, MessagePack.ErrorMsg] = {
    def f_langastResolvedAttr(reader: Reader): org.sireum.lang.ast.ResolvedAttr = {
      val r = reader.read_langastResolvedAttr()
      return r
    }
    val r = to(data, f_langastResolvedAttr _)
    return r
  }

  def from_langastResolvedInfo(o: org.sireum.lang.ast.ResolvedInfo, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastResolvedInfo(o)
    return w.result
  }

  def to_langastResolvedInfo(data: ISZ[U8]): Either[org.sireum.lang.ast.ResolvedInfo, MessagePack.ErrorMsg] = {
    def f_langastResolvedInfo(reader: Reader): org.sireum.lang.ast.ResolvedInfo = {
      val r = reader.read_langastResolvedInfo()
      return r
    }
    val r = to(data, f_langastResolvedInfo _)
    return r
  }

  def from_langastResolvedInfoBuiltIn(o: org.sireum.lang.ast.ResolvedInfo.BuiltIn, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastResolvedInfoBuiltIn(o)
    return w.result
  }

  def to_langastResolvedInfoBuiltIn(data: ISZ[U8]): Either[org.sireum.lang.ast.ResolvedInfo.BuiltIn, MessagePack.ErrorMsg] = {
    def f_langastResolvedInfoBuiltIn(reader: Reader): org.sireum.lang.ast.ResolvedInfo.BuiltIn = {
      val r = reader.read_langastResolvedInfoBuiltIn()
      return r
    }
    val r = to(data, f_langastResolvedInfoBuiltIn _)
    return r
  }

  def from_langastResolvedInfoPackage(o: org.sireum.lang.ast.ResolvedInfo.Package, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastResolvedInfoPackage(o)
    return w.result
  }

  def to_langastResolvedInfoPackage(data: ISZ[U8]): Either[org.sireum.lang.ast.ResolvedInfo.Package, MessagePack.ErrorMsg] = {
    def f_langastResolvedInfoPackage(reader: Reader): org.sireum.lang.ast.ResolvedInfo.Package = {
      val r = reader.read_langastResolvedInfoPackage()
      return r
    }
    val r = to(data, f_langastResolvedInfoPackage _)
    return r
  }

  def from_langastResolvedInfoEnum(o: org.sireum.lang.ast.ResolvedInfo.Enum, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastResolvedInfoEnum(o)
    return w.result
  }

  def to_langastResolvedInfoEnum(data: ISZ[U8]): Either[org.sireum.lang.ast.ResolvedInfo.Enum, MessagePack.ErrorMsg] = {
    def f_langastResolvedInfoEnum(reader: Reader): org.sireum.lang.ast.ResolvedInfo.Enum = {
      val r = reader.read_langastResolvedInfoEnum()
      return r
    }
    val r = to(data, f_langastResolvedInfoEnum _)
    return r
  }

  def from_langastResolvedInfoEnumElement(o: org.sireum.lang.ast.ResolvedInfo.EnumElement, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastResolvedInfoEnumElement(o)
    return w.result
  }

  def to_langastResolvedInfoEnumElement(data: ISZ[U8]): Either[org.sireum.lang.ast.ResolvedInfo.EnumElement, MessagePack.ErrorMsg] = {
    def f_langastResolvedInfoEnumElement(reader: Reader): org.sireum.lang.ast.ResolvedInfo.EnumElement = {
      val r = reader.read_langastResolvedInfoEnumElement()
      return r
    }
    val r = to(data, f_langastResolvedInfoEnumElement _)
    return r
  }

  def from_langastResolvedInfoObject(o: org.sireum.lang.ast.ResolvedInfo.Object, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastResolvedInfoObject(o)
    return w.result
  }

  def to_langastResolvedInfoObject(data: ISZ[U8]): Either[org.sireum.lang.ast.ResolvedInfo.Object, MessagePack.ErrorMsg] = {
    def f_langastResolvedInfoObject(reader: Reader): org.sireum.lang.ast.ResolvedInfo.Object = {
      val r = reader.read_langastResolvedInfoObject()
      return r
    }
    val r = to(data, f_langastResolvedInfoObject _)
    return r
  }

  def from_langastResolvedInfoVar(o: org.sireum.lang.ast.ResolvedInfo.Var, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastResolvedInfoVar(o)
    return w.result
  }

  def to_langastResolvedInfoVar(data: ISZ[U8]): Either[org.sireum.lang.ast.ResolvedInfo.Var, MessagePack.ErrorMsg] = {
    def f_langastResolvedInfoVar(reader: Reader): org.sireum.lang.ast.ResolvedInfo.Var = {
      val r = reader.read_langastResolvedInfoVar()
      return r
    }
    val r = to(data, f_langastResolvedInfoVar _)
    return r
  }

  def from_langastResolvedInfoMethod(o: org.sireum.lang.ast.ResolvedInfo.Method, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastResolvedInfoMethod(o)
    return w.result
  }

  def to_langastResolvedInfoMethod(data: ISZ[U8]): Either[org.sireum.lang.ast.ResolvedInfo.Method, MessagePack.ErrorMsg] = {
    def f_langastResolvedInfoMethod(reader: Reader): org.sireum.lang.ast.ResolvedInfo.Method = {
      val r = reader.read_langastResolvedInfoMethod()
      return r
    }
    val r = to(data, f_langastResolvedInfoMethod _)
    return r
  }

  def from_langastResolvedInfoMethods(o: org.sireum.lang.ast.ResolvedInfo.Methods, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastResolvedInfoMethods(o)
    return w.result
  }

  def to_langastResolvedInfoMethods(data: ISZ[U8]): Either[org.sireum.lang.ast.ResolvedInfo.Methods, MessagePack.ErrorMsg] = {
    def f_langastResolvedInfoMethods(reader: Reader): org.sireum.lang.ast.ResolvedInfo.Methods = {
      val r = reader.read_langastResolvedInfoMethods()
      return r
    }
    val r = to(data, f_langastResolvedInfoMethods _)
    return r
  }

  def from_langastResolvedInfoTuple(o: org.sireum.lang.ast.ResolvedInfo.Tuple, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastResolvedInfoTuple(o)
    return w.result
  }

  def to_langastResolvedInfoTuple(data: ISZ[U8]): Either[org.sireum.lang.ast.ResolvedInfo.Tuple, MessagePack.ErrorMsg] = {
    def f_langastResolvedInfoTuple(reader: Reader): org.sireum.lang.ast.ResolvedInfo.Tuple = {
      val r = reader.read_langastResolvedInfoTuple()
      return r
    }
    val r = to(data, f_langastResolvedInfoTuple _)
    return r
  }

  def from_langastResolvedInfoLocalVar(o: org.sireum.lang.ast.ResolvedInfo.LocalVar, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastResolvedInfoLocalVar(o)
    return w.result
  }

  def to_langastResolvedInfoLocalVar(data: ISZ[U8]): Either[org.sireum.lang.ast.ResolvedInfo.LocalVar, MessagePack.ErrorMsg] = {
    def f_langastResolvedInfoLocalVar(reader: Reader): org.sireum.lang.ast.ResolvedInfo.LocalVar = {
      val r = reader.read_langastResolvedInfoLocalVar()
      return r
    }
    val r = to(data, f_langastResolvedInfoLocalVar _)
    return r
  }

  def from_langastResolvedInfoFact(o: org.sireum.lang.ast.ResolvedInfo.Fact, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastResolvedInfoFact(o)
    return w.result
  }

  def to_langastResolvedInfoFact(data: ISZ[U8]): Either[org.sireum.lang.ast.ResolvedInfo.Fact, MessagePack.ErrorMsg] = {
    def f_langastResolvedInfoFact(reader: Reader): org.sireum.lang.ast.ResolvedInfo.Fact = {
      val r = reader.read_langastResolvedInfoFact()
      return r
    }
    val r = to(data, f_langastResolvedInfoFact _)
    return r
  }

  def from_langastResolvedInfoTheorem(o: org.sireum.lang.ast.ResolvedInfo.Theorem, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastResolvedInfoTheorem(o)
    return w.result
  }

  def to_langastResolvedInfoTheorem(data: ISZ[U8]): Either[org.sireum.lang.ast.ResolvedInfo.Theorem, MessagePack.ErrorMsg] = {
    def f_langastResolvedInfoTheorem(reader: Reader): org.sireum.lang.ast.ResolvedInfo.Theorem = {
      val r = reader.read_langastResolvedInfoTheorem()
      return r
    }
    val r = to(data, f_langastResolvedInfoTheorem _)
    return r
  }

  def from_langastResolvedInfoInv(o: org.sireum.lang.ast.ResolvedInfo.Inv, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastResolvedInfoInv(o)
    return w.result
  }

  def to_langastResolvedInfoInv(data: ISZ[U8]): Either[org.sireum.lang.ast.ResolvedInfo.Inv, MessagePack.ErrorMsg] = {
    def f_langastResolvedInfoInv(reader: Reader): org.sireum.lang.ast.ResolvedInfo.Inv = {
      val r = reader.read_langastResolvedInfoInv()
      return r
    }
    val r = to(data, f_langastResolvedInfoInv _)
    return r
  }

  def from_langastTruthTableRow(o: org.sireum.lang.ast.TruthTable.Row, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastTruthTableRow(o)
    return w.result
  }

  def to_langastTruthTableRow(data: ISZ[U8]): Either[org.sireum.lang.ast.TruthTable.Row, MessagePack.ErrorMsg] = {
    def f_langastTruthTableRow(reader: Reader): org.sireum.lang.ast.TruthTable.Row = {
      val r = reader.read_langastTruthTableRow()
      return r
    }
    val r = to(data, f_langastTruthTableRow _)
    return r
  }

  def from_langastTruthTableAssignment(o: org.sireum.lang.ast.TruthTable.Assignment, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastTruthTableAssignment(o)
    return w.result
  }

  def to_langastTruthTableAssignment(data: ISZ[U8]): Either[org.sireum.lang.ast.TruthTable.Assignment, MessagePack.ErrorMsg] = {
    def f_langastTruthTableAssignment(reader: Reader): org.sireum.lang.ast.TruthTable.Assignment = {
      val r = reader.read_langastTruthTableAssignment()
      return r
    }
    val r = to(data, f_langastTruthTableAssignment _)
    return r
  }

  def from_langastTruthTableConclusion(o: org.sireum.lang.ast.TruthTable.Conclusion, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastTruthTableConclusion(o)
    return w.result
  }

  def to_langastTruthTableConclusion(data: ISZ[U8]): Either[org.sireum.lang.ast.TruthTable.Conclusion, MessagePack.ErrorMsg] = {
    def f_langastTruthTableConclusion(reader: Reader): org.sireum.lang.ast.TruthTable.Conclusion = {
      val r = reader.read_langastTruthTableConclusion()
      return r
    }
    val r = to(data, f_langastTruthTableConclusion _)
    return r
  }

  def from_langastTruthTableConclusionValidity(o: org.sireum.lang.ast.TruthTable.Conclusion.Validity, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastTruthTableConclusionValidity(o)
    return w.result
  }

  def to_langastTruthTableConclusionValidity(data: ISZ[U8]): Either[org.sireum.lang.ast.TruthTable.Conclusion.Validity, MessagePack.ErrorMsg] = {
    def f_langastTruthTableConclusionValidity(reader: Reader): org.sireum.lang.ast.TruthTable.Conclusion.Validity = {
      val r = reader.read_langastTruthTableConclusionValidity()
      return r
    }
    val r = to(data, f_langastTruthTableConclusionValidity _)
    return r
  }

  def from_langastTruthTableConclusionTautology(o: org.sireum.lang.ast.TruthTable.Conclusion.Tautology, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastTruthTableConclusionTautology(o)
    return w.result
  }

  def to_langastTruthTableConclusionTautology(data: ISZ[U8]): Either[org.sireum.lang.ast.TruthTable.Conclusion.Tautology, MessagePack.ErrorMsg] = {
    def f_langastTruthTableConclusionTautology(reader: Reader): org.sireum.lang.ast.TruthTable.Conclusion.Tautology = {
      val r = reader.read_langastTruthTableConclusionTautology()
      return r
    }
    val r = to(data, f_langastTruthTableConclusionTautology _)
    return r
  }

  def from_langastTruthTableConclusionContradictory(o: org.sireum.lang.ast.TruthTable.Conclusion.Contradictory, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastTruthTableConclusionContradictory(o)
    return w.result
  }

  def to_langastTruthTableConclusionContradictory(data: ISZ[U8]): Either[org.sireum.lang.ast.TruthTable.Conclusion.Contradictory, MessagePack.ErrorMsg] = {
    def f_langastTruthTableConclusionContradictory(reader: Reader): org.sireum.lang.ast.TruthTable.Conclusion.Contradictory = {
      val r = reader.read_langastTruthTableConclusionContradictory()
      return r
    }
    val r = to(data, f_langastTruthTableConclusionContradictory _)
    return r
  }

  def from_langastTruthTableConclusionContingent(o: org.sireum.lang.ast.TruthTable.Conclusion.Contingent, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastTruthTableConclusionContingent(o)
    return w.result
  }

  def to_langastTruthTableConclusionContingent(data: ISZ[U8]): Either[org.sireum.lang.ast.TruthTable.Conclusion.Contingent, MessagePack.ErrorMsg] = {
    def f_langastTruthTableConclusionContingent(reader: Reader): org.sireum.lang.ast.TruthTable.Conclusion.Contingent = {
      val r = reader.read_langastTruthTableConclusionContingent()
      return r
    }
    val r = to(data, f_langastTruthTableConclusionContingent _)
    return r
  }

  def from_langastTyped(o: org.sireum.lang.ast.Typed, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastTyped(o)
    return w.result
  }

  def to_langastTyped(data: ISZ[U8]): Either[org.sireum.lang.ast.Typed, MessagePack.ErrorMsg] = {
    def f_langastTyped(reader: Reader): org.sireum.lang.ast.Typed = {
      val r = reader.read_langastTyped()
      return r
    }
    val r = to(data, f_langastTyped _)
    return r
  }

  def from_langastTypedName(o: org.sireum.lang.ast.Typed.Name, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastTypedName(o)
    return w.result
  }

  def to_langastTypedName(data: ISZ[U8]): Either[org.sireum.lang.ast.Typed.Name, MessagePack.ErrorMsg] = {
    def f_langastTypedName(reader: Reader): org.sireum.lang.ast.Typed.Name = {
      val r = reader.read_langastTypedName()
      return r
    }
    val r = to(data, f_langastTypedName _)
    return r
  }

  def from_langastTypedTuple(o: org.sireum.lang.ast.Typed.Tuple, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastTypedTuple(o)
    return w.result
  }

  def to_langastTypedTuple(data: ISZ[U8]): Either[org.sireum.lang.ast.Typed.Tuple, MessagePack.ErrorMsg] = {
    def f_langastTypedTuple(reader: Reader): org.sireum.lang.ast.Typed.Tuple = {
      val r = reader.read_langastTypedTuple()
      return r
    }
    val r = to(data, f_langastTypedTuple _)
    return r
  }

  def from_langastTypedFun(o: org.sireum.lang.ast.Typed.Fun, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastTypedFun(o)
    return w.result
  }

  def to_langastTypedFun(data: ISZ[U8]): Either[org.sireum.lang.ast.Typed.Fun, MessagePack.ErrorMsg] = {
    def f_langastTypedFun(reader: Reader): org.sireum.lang.ast.Typed.Fun = {
      val r = reader.read_langastTypedFun()
      return r
    }
    val r = to(data, f_langastTypedFun _)
    return r
  }

  def from_langastTypedTypeVar(o: org.sireum.lang.ast.Typed.TypeVar, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastTypedTypeVar(o)
    return w.result
  }

  def to_langastTypedTypeVar(data: ISZ[U8]): Either[org.sireum.lang.ast.Typed.TypeVar, MessagePack.ErrorMsg] = {
    def f_langastTypedTypeVar(reader: Reader): org.sireum.lang.ast.Typed.TypeVar = {
      val r = reader.read_langastTypedTypeVar()
      return r
    }
    val r = to(data, f_langastTypedTypeVar _)
    return r
  }

  def from_langastTypedPackage(o: org.sireum.lang.ast.Typed.Package, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastTypedPackage(o)
    return w.result
  }

  def to_langastTypedPackage(data: ISZ[U8]): Either[org.sireum.lang.ast.Typed.Package, MessagePack.ErrorMsg] = {
    def f_langastTypedPackage(reader: Reader): org.sireum.lang.ast.Typed.Package = {
      val r = reader.read_langastTypedPackage()
      return r
    }
    val r = to(data, f_langastTypedPackage _)
    return r
  }

  def from_langastTypedObject(o: org.sireum.lang.ast.Typed.Object, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastTypedObject(o)
    return w.result
  }

  def to_langastTypedObject(data: ISZ[U8]): Either[org.sireum.lang.ast.Typed.Object, MessagePack.ErrorMsg] = {
    def f_langastTypedObject(reader: Reader): org.sireum.lang.ast.Typed.Object = {
      val r = reader.read_langastTypedObject()
      return r
    }
    val r = to(data, f_langastTypedObject _)
    return r
  }

  def from_langastTypedEnum(o: org.sireum.lang.ast.Typed.Enum, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastTypedEnum(o)
    return w.result
  }

  def to_langastTypedEnum(data: ISZ[U8]): Either[org.sireum.lang.ast.Typed.Enum, MessagePack.ErrorMsg] = {
    def f_langastTypedEnum(reader: Reader): org.sireum.lang.ast.Typed.Enum = {
      val r = reader.read_langastTypedEnum()
      return r
    }
    val r = to(data, f_langastTypedEnum _)
    return r
  }

  def from_langastTypedMethod(o: org.sireum.lang.ast.Typed.Method, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastTypedMethod(o)
    return w.result
  }

  def to_langastTypedMethod(data: ISZ[U8]): Either[org.sireum.lang.ast.Typed.Method, MessagePack.ErrorMsg] = {
    def f_langastTypedMethod(reader: Reader): org.sireum.lang.ast.Typed.Method = {
      val r = reader.read_langastTypedMethod()
      return r
    }
    val r = to(data, f_langastTypedMethod _)
    return r
  }

  def from_langastTypedMethods(o: org.sireum.lang.ast.Typed.Methods, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastTypedMethods(o)
    return w.result
  }

  def to_langastTypedMethods(data: ISZ[U8]): Either[org.sireum.lang.ast.Typed.Methods, MessagePack.ErrorMsg] = {
    def f_langastTypedMethods(reader: Reader): org.sireum.lang.ast.Typed.Methods = {
      val r = reader.read_langastTypedMethods()
      return r
    }
    val r = to(data, f_langastTypedMethods _)
    return r
  }

  def from_langastTypedFact(o: org.sireum.lang.ast.Typed.Fact, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastTypedFact(o)
    return w.result
  }

  def to_langastTypedFact(data: ISZ[U8]): Either[org.sireum.lang.ast.Typed.Fact, MessagePack.ErrorMsg] = {
    def f_langastTypedFact(reader: Reader): org.sireum.lang.ast.Typed.Fact = {
      val r = reader.read_langastTypedFact()
      return r
    }
    val r = to(data, f_langastTypedFact _)
    return r
  }

  def from_langastTypedTheorem(o: org.sireum.lang.ast.Typed.Theorem, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastTypedTheorem(o)
    return w.result
  }

  def to_langastTypedTheorem(data: ISZ[U8]): Either[org.sireum.lang.ast.Typed.Theorem, MessagePack.ErrorMsg] = {
    def f_langastTypedTheorem(reader: Reader): org.sireum.lang.ast.Typed.Theorem = {
      val r = reader.read_langastTypedTheorem()
      return r
    }
    val r = to(data, f_langastTypedTheorem _)
    return r
  }

  def from_langastTypedInv(o: org.sireum.lang.ast.Typed.Inv, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_langastTypedInv(o)
    return w.result
  }

  def to_langastTypedInv(data: ISZ[U8]): Either[org.sireum.lang.ast.Typed.Inv, MessagePack.ErrorMsg] = {
    def f_langastTypedInv(reader: Reader): org.sireum.lang.ast.Typed.Inv = {
      val r = reader.read_langastTypedInv()
      return r
    }
    val r = to(data, f_langastTypedInv _)
    return r
  }

}