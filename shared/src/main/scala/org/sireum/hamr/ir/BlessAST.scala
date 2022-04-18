// #Sireum
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
package org.sireum.hamr.ir

import org.sireum._
import org.sireum.message.Position

/* ===============================================================================
 *
 *   B L E S S     T r a n s i t i o n      S y s t e m s  (BTS)
 *
 *  ============================================================================== */

@sig trait BLESSAnnex extends AnnexClause

/* XText
BLESSAnnexSubclause:
	{BLESSAnnexSubclause}
	no_proof ?= 'DO_NOT_PROVE'?
assert_clause=AssertClause?
invariant=InvariantClause?
// Local variables to be used within the transition system
variables=VariablesSection?
// States in the transition system
( 'states' states+=BehaviorState+ )?
// Transitions in the transition system
transitions=Transitions?
;
*/

// Top-level structure of a BLESS transition system
@datatype class BTSBLESSAnnexClause (
                                      // boolean setting indicating if proof is intended or not
                                      doNotProve: B,  // TRUE means no proof is expected
                                      // assert definitions in scope of the AADL thread
                                      assertions: ISZ[BTSAssertion],
                                      // invariants that apply to the AADL thread
                                      // note: invariants are "assertion" grammar clauses
                                      invariant: Option[BTSAssertion],
                                      // declaration of local variables to be used in the transition system
                                      variables: ISZ[BTSVariableDeclaration],
                                      // declaration of states of the transition system
                                      states: ISZ[BTSStateDeclaration],
                                      // transitions of the transition system
                                      transitions: ISZ[BTSTransition]
                                    ) extends BLESSAnnex


/*
InvariantClause returns InvariantClause:
//  {InvariantClause}
'invariant' inv=Assertion
;
*/

// TODO: double check that invariants are assertions
// no new AIR structures to add since invariants are just assertion clauses

// TODO: need to understand variable_names / Declarator grammar structure
//BRL
/* xText
VariablesSection:
	'variables' behavior_variables+=VariableDeclaration+
;

VariableDeclaration:
  variable=Variable
	( //modifier
	  nonvolatile?='nonvolatile'
  	| shared?='shared'
  	| constant?='constant'
    | spread?='spread'
    | final?='final'
  )?
  ( assign?=':=' expression=Expression )?
  assertion=Assertion?
  ';'?
  ;
Variable:
	name=ID '~' tod=TypeOrReference
;
*/


// Note to Brian: Generating the structure below
// would require processing the original Xtext parse tree above to
// generate on BTSVariableDeclaration per variable.
//BRL  array size is part of type;  BlessVisitor has arraySize = toNone()
@datatype class BTSVariableDeclaration (
                                         name: Name,
                                         category: Option[BTSVariableCategory.Type],
                                         varType: BTSType,
                                         assignExpression: Option[BTSExp],
                                         arraySize: Option[BLESSIntConst],
                                         variableAssertion: Option[BTSAssertion]) //extends BTSBLESSAnnexClause

// Categories of behavior variables in BA/BLESS
//BRL these are only in BLESS
@enum object BTSVariableCategory {
  'Nonvolatile
  'Shared
  'Constant
  'Spread
  'Final
}

// TODO: Complete type grammar
//BRL  most types will be declared in typedef annex libraries, however they should be linked to usage
@sig trait BTSType

//BRL Data components cannot be used as BLESS types
//@datatype class BTSClassifier (classifier: Classifier) extends BTSType

//BRL
/* Xtext
EnumerationType:
 'enumeration' '(' defining_enumeration_literal+=ID+ ')'
;
 */
@datatype class BTSEnumerationType(lit: ISZ[String]) extends BTSType

//BRL
/* Xtext
QuantityType:
  'quantity'
  ( unit=[UnitName] | scalar?='scalar' | whole?='whole' )
  ( '[' lb=ANumber DOTDOT ub=ANumber ']' )?
  ( 'step' step=ANumber )?  //check if positive
  ( 'representation' representation=[aadl2::PropertyConstant|QCLREF] )?
;
 */
@datatype class BTSQuantityType(unit: String, //may also be 'scalar' or 'whole'
                                lb: Option[Number],
                                ub: Option[Number],
                                step: Option[Number],
                                representation: Option[ValueProp]  //AADL property constant value
                               ) extends BTSType

//BRL
/* Xtext
ArrayType :
  'array' '[' array_ranges=ArrayRangeList ']' 'of' typ=TypeOrReference ;

ArrayRangeList : range+=ArrayRange ( comma?=',' range+=ArrayRange ( ',' range+=ArrayRange )* )? ;

ArrayRange : lb=ANumber ( DOTDOT ub=ANumber)? ;

ANumber:
  lit=NUMBER
  | property=PropertyReference
  | propertyConstant=[aadl2::PropertyConstant|QCLREF];
*/
@datatype class BTSArrayType(range: ISZ[BTSArrayRange],
                             typ: BTSType) extends BTSType

@datatype class BTSArrayRange(lb: Number,  //natural number: literal or property
                              ub: Option[Number])

//BRL
/* Xtext
RecordType :
	(record?='record' | variant?='variant' | variant?='union' )
	'(' fields+=RecordField+ // ( ',' fields+=RecordField )*
	  ')' ;

RecordField :
	label=ID
	':' typ=TypeOrReference ;
 */
@datatype class BTSRecordType(rvu: BTSRecordVariantUnion.Type,
                              fields: ISZ[BTSRecordField]) extends BTSType

@enum object BTSRecordVariantUnion {
  'RECORD
  'VARIANT
  'UNION
}

@datatype class BTSRecordField(label: String,
                               typ: BTSType)

//BRL
@datatype class BTSBooleanType() extends BTSType

//BRL
@datatype class BTSStringType() extends BTSType

//BRL
@datatype class BTSNullType() extends BTSType

// TODO: Complete constant grammar --  used for array size above
//BRL array size is not used in variable declarations, and should be removed if not used elsewhere
@datatype class BLESSIntConst () //extends BLESSExpression



/* XText
BehaviorState returns BehaviorState:
name=ID
':'
initial?='initial'?
complete?='complete'?
final?='final'?
'state' state_assertion=Assertion? ';'
;
*/

// BTS states are declared
/*  Xtext
BehaviorState:
  name=ID
  	':' initial?='initial'?  complete?='complete'?  final?='final'? mode?='mode'?
  'state' state_assertion=Assertion? ';'?  ;
 */
//BRL in BLESS exactly one category
@datatype class BTSStateDeclaration (
                                      id : Name,
                                      categories: ISZ[BTSStateCategory.Type],
                                      assertion: Option[BTSAssertion],
                                    )


// Three categories of states in BA/BLESS
@enum object BTSStateCategory {
  'Initial
  'Complete
  'Execute
  'Final
  'Mode  //added in BLESS 3.0 to use state machines for modes
}

/* XText
BehaviorTransition returns BehaviorTransition:
transition_label=TransitionLabel ':'
( sources+=[BehaviorState] ( ',' sources+=[BehaviorState] )* )
'-['
( dispatch=DispatchCondition | execute=ExecuteCondition | mode=ModeCondition
internal=InternalCondition )?
']->'
destination=[BehaviorState]
( '{' actions=BehaviorActions? '}' )? ass=Assertion? ';'
;
TransitionLabel returns TransitionLabel:
id=ID ( '[' priority=INTEGER_LIT ']' )?
;
 */

@datatype class BTSTransition (
                                label: BTSTransitionLabel, // declare label for current transition
                                sourceStates: ISZ[Name],   // 1+ names referencing source states
                                destState: Name, // reference name of destination state
                                transitionCondition: Option[BTSTransitionCondition], // transition condition (guard)
                                actions: Option[BTSBehaviorActions], // 0+ actions to take when a transition is executed
                                assertion: Option[BTSAssertion] // 0-1 assertions for transition
                              )// extends BTSBLESSAnnexClause

@datatype class BTSTransitionLabel (
                                     id: Name,     // name of transition
                                     priority: Option[Z]   // priority of transition
                                   )
// **** stopped here *****


// Dispatch conditions are needed to leave execution.
/* Xtext
//dispatch_condition
DispatchCondition:
  'on' dispatch='dispatch' de=DispatchExpression?
  //BA2015 reconciliation declare ports to be frozen
  frozen=FreezePort? ;

//dispatch_expression
DispatchExpression:
  dc+=DispatchConjunction ( or?='or' dc+=DispatchConjunction
  	( 'or' dc+=DispatchConjunction )* )?
  	//BA2015 reconciliation
  | subprogramaccessdispatch=SubprogramAccessDispatch ;

//dispatch_conjunction
DispatchConjunction:
  trigger+=DispatchTrigger
    ( and?='and' trigger+=DispatchTrigger
    	( 'and' trigger+=DispatchTrigger)* )? ;

//dispatch_trigger
//DOES NOT ALLOW PORT INDEXES ON TIMEOUT PORTS
DispatchTrigger:
  stop='stop'
  | port=PortName
  | timeout='timeout'
   ( ( lp?='(' ports+=[aadl2::NamedElement|ID]
        ('or'? ports+=[aadl2::NamedElement|ID] )* ')'
   )?
   	 time=BehaviorTime )? ;
*/


// enable polymorphism for different types of transition conditions
@sig trait BTSTransitionCondition

// TODO: Complete grammar for dispatch conditions
@datatype class BTSDispatchCondition (dispatchTriggers : ISZ[BTSDispatchConjunction], // disjunction of conjunctions
                                      frozenPorts: ISZ[Name]) extends BTSTransitionCondition

@datatype class BTSDispatchConjunction(conjunction: ISZ[BTSDispatchTrigger])

@sig trait BTSDispatchTrigger

@datatype class BTSDispatchTriggerStop extends BTSDispatchTrigger

@datatype class BTSDispatchTriggerPort(port: Name) extends BTSDispatchTrigger

@datatype class BTSDispatchTriggerTimeout(ports: ISZ[Name],
                                          time: Option[BTSBehaviorTime]) extends BTSDispatchTrigger

// Execute conditions are needed to leave execution states
/* Xtext
ExecuteCondition:
  eor=ExpressionOrRelation
  | timeout='timeout'      //added for BA2015 reconciliation  // Brian doesn't like; he wants to be explicit
                           // Brian  says that this would implicitly be period property.
  | otherwise='otherwise'  //added for BA2015 reconciliation  // Brian doesn't like; he wants to be explicit
;
*/

// TODO: Complete grammar for execute conditions
@sig trait BTSExecuteCondition extends BTSTransitionCondition

@datatype class BTSExecuteConditionExp (exp: BTSExp) extends BTSExecuteCondition // TODO can be a relation

//BRL: not in BLESS 3.0
@datatype class BTSExecuteConditionTimeout () extends BTSExecuteCondition

//BRL: deprecated in BLESS 3.0
@datatype class BTSExecuteConditionOtherwise () extends BTSExecuteCondition

// Brian says this is present to be compatible with BA.  Currently not supported in BLESS.
// See annex document for BA.   Could be relevant to GUMBO goals to for aligning mode
// state machines.
/* Xtext
ModeCondition:
	'on' tle=TriggerLogicalExpression ;

TriggerLogicalExpression:
	first=EventTrigger ( op=LogicalOperator trigger+=EventTrigger
		  (ops+=LogicalOperator trigger+=EventTrigger)*)?  ;

EventTrigger:
//	subcomponent=SubcomponentName
	sub+=ID ( '.' sub+=ID )* '.' port=[aadl2::NamedElement|ID] ( '[' NUMBER ']' )?
	| '(' tle=TriggerLogicalExpression ')' ;

LogicalOperator:
	op='and'
	| op='or'
	| op='xor'
	| 'and' op='then'
	| 'or' op='else'
;
 */

// TODO: Complete grammar for mode conditions
//BRL
@datatype class BTSModeCondition (tle: BTSTriggerLogicalExpression) extends BTSTransitionCondition

@datatype class BTSTriggerLogicalExpression(op: BTSBinaryOp,
                                            trigger: ISZ[BTSEventTrigger])

//Name must reach down to ports of subcomponent, and possibly one port in port array
@datatype class BTSEventTrigger(port: Option[Name],
                                tle: Option[BTSTriggerLogicalExpression])

// Brian says that this was added to support communication between Error Models and BLESS.
// Could be relevant to GUMBO goals to for aligning mode EMv2 and BA state machines
// state machines.
//
/* Xtext
InternalCondition:
	'on' 'internal' first=[aadl2::Port] ( or?='or' ports+=[aadl2::Port] )*
;
 */

// TODO: Complete grammar for internal conditions
//BRL
/* Xtext
InternalCondition:
	'on' 'internal' first=[aadl2::Port] ( 'or' ports+=[aadl2::Port] )* ;
 */
@datatype class BTSInternalCondition(ports: ISZ[Name]) extends BTSTransitionCondition




/*********************************************
 * ASSERTION
 *********************************************/

/* Xtext
Assertion :
	namedassertion=NamedAssertion |
	namelessassertion=NamelessAssertion |
	namelessfunction=NamelessFunction |
	namelessenumeration=NamelessEnumeration ;
 */
@sig trait BTSAssertion

/* Xtext
NamedAssertion:
	'<<'
	name=ID ':'
	(
		formals=VariableList?
		  ( //assertion_predicate
		  pred?=':'  predicate=Predicate
		  | //assertion_function
		  'returns' tod=TypeOrReference func?=':='	functionvalue=AssertionFunctionValue
		  )
		| //assertion_enumeration
		assertionvariable=ID '~' enumerationType=[TypeDeclaration] enumer?='+=>' enumeration=AssertionEnumeration
	)
	'>>'  ;

VariableList:
	first=Variable ( comma?=',' parameter+=Variable ( ',' parameter+=Variable )* )? ;

Predicate:  //used within Assertions
	Expression ;

*/
@datatype class BTSNamedAssertion(name: String,
                                  formals: ISZ[BTSVariable],
                                  predicate: Option[BTSExp],
                                  returns: Option[BTSType],
                                  functionvalue: Option[BTSAssertionFunctionValue],
                                  assertionvariable: Option[String],
                                  enumerationType: Option[BTSEnumerationType],
                                  enumeration: Option[BTSAssertionEnumeration],
                                  val pos: Option[Position]
                                 ) extends BTSAssertion

/* Xtext
Variable:
	name=ID '~' tod=TypeOrReference
;
 */
@datatype class BTSVariable(formal: String, typ: BTSType,
                            val pos: Option[Position])

/* Xtext
AssertionFunctionValue returns AssertionFunctionValue:
	cexp=ConditionalAssertionFunction
	| pexp=AssertionNumericExpression  ;

ConditionalAssertionFunction returns ConditionalAssertionFunction:
	'[' cvp+=ConditionValuePair ( ',' cvp+=ConditionValuePair )+ ']' ;

ConditionValuePair returns ConditionValuePair:
	'(' condition=Predicate ')->' expression=AssertionNumericExpression ;

AssertionNumericExpression:  //used within Assertions
	Expression  ;
 */
@datatype class BTSAssertionFunctionValue(cexp: ISZ[BTSConditionValuePair],
                                         pexp: BTSExp,
                                          val pos: Option[Position])

@datatype class BTSConditionValuePair(condition: BTSExp,
                                      value: BTSExp,
                                      val pos: Option[Position])
/* Xtext
AssertionEnumeration:
  pred=Invocation
  |
  ( pair+=EnumerationPair (',' pair+=EnumerationPair)* )  ;
 */
@datatype class BTSAssertionEnumeration(pred: Option[BTSInvocation],
                                        pair: ISZ[BTSEnumerationPair],
                                        val pos: Option[Position])
/* Xtext
EnumerationPair returns EnumerationPair:
  enumeration_literal=ID '->' predicate=Predicate ;
 */
@datatype class BTSEnumerationPair(literal: String,
                                   predicate: BTSExp,
                                   val pos: Option[Position])
/* Xtext
Invocation:
	label=[NamedAssertion|ID]
	'(' 	//actual_assertion_parameter_list
	( (params+=ActualParameter ( ',' params+=ActualParameter )* )
		|
		actual_parameter=NumericExpression
	)?
	 ')'  ;
 */
@datatype class BTSInvocation(label: BTSNamedAssertion,
                              params: ISZ[BTSActualParameter],
                              actual_parameter: BTSExp,
                              val pos: Option[Position]) extends BTSExp

/* Xtext
ActualParameter:
	formal=ID ':' actual=Expression  ;
 */
@datatype class BTSActualParameter(formal : String,
                                   actual: BTSExp,
                                   val pos: Option[Position])

/*******************************************
* Expressions only in Assertions
*********************************************/

/* Xtext
UniversalQuantification:
  'all' variables=LogicVariables
    (in?='in' range=Range | which?='which' condition=Predicate )
     'are' predicate=Predicate  ;
 */
@datatype class BTSUniversalQuantification(variables : ISZ[BTSVariable],
                                           range: Option[BTSRange],
                                           which: Option[BTSExp],
                                           predicate: BTSExp,
                                           val pos: Option[Position]) extends BTSExp

/* Xtext
ExistentialQuantification:
  'exists' variables=LogicVariables
    (in?='in' range=Range | which?='which' condition=Predicate )
     'that' predicate=Predicate ;
 */
@datatype class BTSExistentialQuantification(variables : ISZ[BTSVariable],
                                             range: Option[BTSRange],
                                             which: Option[BTSExp],
                                             predicate: BTSExp,
                                             val pos: Option[Position]) extends BTSExp

/* Xtext
SumQuantification:
  'sum' variables=LogicVariables
    (in?='in' range=Range | which?='which' condition=Predicate )
     'of' numeric_expression=NumericExpression ;
 */
@datatype class BTSSumQuantification(variables : ISZ[BTSVariable],
                                     range: Option[BTSRange],
                                     which: Option[BTSExp],
                                     numeric_expression: BTSExp,
                                     val pos: Option[Position]) extends BTSExp
/* Xtext
ProductQuantification:
  'product' variables=LogicVariables
    (in?='in' range=Range | which?='which' condition=Predicate )
     'of' numeric_expression=NumericExpression ;
 */
@datatype class BTSProductQuantification(variables : ISZ[BTSVariable],
                                         range: Option[BTSRange],
                                         which: Option[BTSExp],
                                         numeric_expression: BTSExp,
                                         val pos: Option[Position]) extends BTSExp

/* Xtext
CountingQuantification:
  'numberof' variables=LogicVariables
    (in?='in' range=Range | which?='which' condition=Predicate )
     'that' counted=Predicate ;
 */
@datatype class BTSCountingQuantification(variables : ISZ[BTSVariable],
                                          range: Option[BTSRange],
                                          which: Option[BTSExp],
                                          counted: BTSExp,
                                          val pos: Option[Position]) extends BTSExp
/* Xtext
Range:
	lower_bound=Subexpression sym=RangeSymbol upper_bound=Subexpression
 */
@datatype class BTSRange(lower_bound: BTSExp,
                         sym: BTSRangeSymbol.Type,
                         upper_bound: BTSExp,
                         val pos: Option[Position])

@enum object BTSRangeSymbol {
  'DOTDOT
  'COMMADOT
  'DOTCOMMA
  'COMMACOMMA
}

/* Xtext
TimedExpression:
	subject=TimedSubject
  ( tick='\''
  | at?='@' time=Subexpression  //must ensure no @ in time
  | caret?='^' shift=PeriodShift
  )?     	;

TimedSubject:
  ps=ParenthesizedSubexpression
  | value=Value
  | conditional=ConditionalExpression
  | record=RecordTerm
  | invocation=Invocation ;
 */
@datatype class BTSTimedExpression(subject: BTSExp,
                                   tick: boolean,
                                   at: Option[BTSExp],
                                   caret: Option[BTSExp],
                                   val pos: Option[Position]) extends BTSExp
/* Xtext
ConditionalExpression:
	'(' 'if' pred=Expression 'then' t=Expression 'else' f=Expression ')' ;
 */
@datatype class BTSConditionalExpression(pred: BTSExp,
                                         t: BTSExp,
                                         f: BTSExp,
                                         val pos: Option[Position]) extends BTSExp

/*  Xtext
ParenthesizedSubexpression:
	'('
	( expression=Expression ( '??' t=Expression ':' f=Expression )?
	| caseexpression=CaseExpression
  )
  ')'  ;

CaseExpression returns CaseExpression:
	'case'
	cc+=CaseChoice+  ;

CaseChoice returns CaseChoice:
	'(' be=BooleanExpression '->' exp=Expression ')'  ;
 */
@datatype class BTSCaseExpression(cc: ISZ[BTSCaseChoice],
                                         val pos: Option[Position]) extends BTSExp

@datatype class BTSCaseChoice(be: BTSExp, exp: BTSExp)

/* Xtext
RecordTerm:
  '(' record_type=[TypeDeclaration] ':' record_value+=RecordValue+ ')' ;
 */
@datatype class BTSRecordTerm(record_type: BTSType,
                              record_value: ISZ[BTSRecordValue],
                              val pos: Option[Position]) extends BTSExp

/* Xtext
RecordValue:
  label=ID
  '=>' aval=Value ';'?  ;
 */
@datatype class BTSRecordValue(label: String,
                               aval: BTSValue)

/*********************************************
 * SUB BLESS
 *********************************************/

// TODO: Complete transition action grammar
@datatype class BTSBehaviorActions (executionOrder: BTSExecutionOrder.Type,
                                    actions: ISZ[BTSAssertedAction])

@enum object BTSExecutionOrder {
  'Sequential
  'Concurrent
}

@datatype class BTSAssertedAction(precondition: Option[BTSAssertion],
                                  action: BTSAction,
                                  postcondition: Option[BTSAssertion])



// ACTIONS
@sig trait BTSAction

@sig trait BTSBasicAction extends BTSAction

@datatype class BTSSkipAction extends BTSBasicAction

@datatype class BTSAssignmentAction(lhs : BTSExp,
                                    rhs : BTSExp) extends  BTSBasicAction

@sig trait BTSCommunicationAction extends BTSBasicAction

@datatype class BTSSubprogramCallAction(name: Name,
                                        params: ISZ[BTSFormalExpPair]) extends BTSCommunicationAction

@datatype class BTSPortOutAction(name: Name,
                                 exp: Option[BTSExp]) extends BTSCommunicationAction

@datatype class BTSPortInAction(name: Name,
                                variable: BTSExp) extends BTSCommunicationAction

@datatype class BTSFrozenPortAction(portName: Name) extends BTSCommunicationAction



@sig trait BTSControlAction extends BTSAction

@datatype class BTSIfBLESSAction (availability: Option[TODO], // TODO
                                  alternatives: ISZ[BTSGuardedAction]) extends BTSControlAction

@datatype class BTSGuardedAction (guard: BTSExp,
                                  action: BTSAssertedAction)

@datatype class BTSIfBAAction (ifBranch: BTSConditionalActions,
                               elseIfBranches: ISZ[BTSConditionalActions],
                               elseBranch: Option[BTSBehaviorActions]) extends BTSControlAction

@datatype class BTSConditionalActions (cond: BTSExp,
                                       actions: BTSBehaviorActions)



@sig trait BTSQuantificationActions extends BTSAction

@datatype class BTSExistentialLatticeQuantification (quantifiedVariables: ISZ[BTSVariableDeclaration],
                                                     actions: BTSBehaviorActions,
                                                     timeout: Option[BTSBehaviorTime],
                                                     catchClause: Option[TODO] // TODO
                                                    ) extends BTSQuantificationActions

@datatype class BTSUniversalLatticeQuantification (latticeVariables: ISZ[Name],
                                                   range: Option[TODO], // TODO
                                                   elq: BTSExistentialLatticeQuantification
                                                  ) extends BTSQuantificationActions







// EXPRESSIONS
@sig trait BTSExp {
  // adding pos because 1) because it will eventually be useful, and
  //                    2) a quick way to ensure hash values are unique -- assuming pos is populated
  @pure def pos: Option[Position]
}

@datatype class BTSUnaryExp(op: BTSUnaryOp.Type,
                            exp: BTSExp,
                            val pos: Option[Position]) extends BTSExp

@enum object BTSUnaryOp {
  'ABS
  'NEG
  'NOT
}

@datatype class BTSBinaryExp(op: BTSBinaryOp.Type,
                             lhs: BTSExp,
                             rhs: BTSExp,
                             val pos: Option[Position]) extends BTSExp

@enum object BTSBinaryOp {
  'AND
  'ANDTHEN
  'OR
  'ORELSE
  'XOR

  'EQ
  'NEQ
  'LT
  'LTE
  'GT
  'GTE

  'PLUS
  'MINUS
  'DIV
  'MULT
  'MOD
  'REM
  'EXP
}

@enum object BTSLiteralType {
  'BOOLEAN
  'STRING
  'INTEGER
  'FLOAT
  // NULL, INT, LONG, CHAR, DOUBLE, RATIONAL
}

@datatype class BTSLiteralExp(typ: BTSLiteralType.Type,
                              exp: String,
                              val pos: Option[Position]) extends BTSExp

@datatype class BTSNameExp(name: Name,
                           val pos: Option[Position]) extends BTSExp

@datatype class BTSIndexingExp(exp: BTSExp,
                               indices: ISZ[BTSExp],
                               val pos: Option[Position]) extends BTSExp

@datatype class BTSAccessExp(exp: BTSExp,
                             attributeName: String,
                             val pos: Option[Position]) extends BTSExp

@datatype class BTSFunctionCall(name: Name,
                                args: ISZ[BTSFormalExpPair],
                                val pos: Option[Position]) extends BTSExp

@datatype class BTSFormalExpPair(paramName: Option[Name],
                                 exp: Option[BTSExp],
                                 val pos: Option[Position])


//BRL
/*  Xtext
BehaviorTime:
	quantity=Quantity
	|
	value=ValueName
  |
  duration=ParenthesizedSubexpression
;
 */
@datatype class BTSBehaviorTime(quantity: Option[BTSQuantity],
                                value: Option[BTSValue],
                                duration: Option[BTSExp],
                                val pos: Option[Position])

//BRL
@datatype class BTSQuantity(number : Number,
                            unit : Option[String])

//BRL
/*  Xtext
ValueName:
  id=[aadl2::NamedElement|ID] //resolve as variable or feature (port)
  //either function call or variable or port
    ( '$' lp?='('  pr=FunctionParameters? ')' )?
  	( lb?='[' array_index+=IndexExpressionOrRange ']'
  	  ( '[' array_index+=IndexExpressionOrRange ']' )* )? //optional array index
  	( dot?='.' pn+=PartialName ( '.' pn+=PartialName )* )?
    (  q?='?'
    | '\'' fresh?='fresh' //fresh is boolean
    | '\'' count?='count'
    | '\'' updated?='updated'
    )?
;
 */
@datatype class BTSValue (
  identifier: String,
  function_parameters: ISZ[BTSFormalExpPair],
  array_index: ISZ[BTSIndexExpressionOrRange],
  pn: ISZ[BTSPartialName],
  val pos: Option[Position]) extends BTSExp

//BRL
@datatype class BTSIndexExpressionOrRange(lhs: BTSExp,
                                         rhs: Option[BTSExp],
                                          val pos: Option[Position])

//BRL
/*  Xtext
PartialName:
	record_id=ID  //[RecordField]
	 ( lb?='[' array_index+=IndexExpressionOrRange ']'
		( '[' array_index+=IndexExpressionOrRange ']' )* )?
 */
@datatype class BTSPartialName (
     record_id: String,
     array_index: ISZ[BTSIndexExpressionOrRange])

//BRL
@enum object BTSPortValueModifier{
  'Q  //for ?
  'FRESH
  'COUNT
  'UPDATED
}

@datatype class TODO


@datatype class Attr(posOpt: Option[Position])