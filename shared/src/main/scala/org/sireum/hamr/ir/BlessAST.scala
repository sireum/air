// #Sireum
/*
 Copyright (c) 2021, Kansas State University
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

/* ===============================================================================
 *
 *   B L E S S     T r a n s i t i o n      S y s t e m s  (BTS)
 *
 *  ============================================================================== */

@sig trait BLESSAnnex extends AnnexClause

/* XText
BLESSSubclause returns BLESSSubclause:
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
AssertClause:
  'assert' (assertions+=NamedAssertion)+
;
InvariantClause:
  'invariant' inv=Assertion
;
VariablesSection:
	'variables' behavior_variables+=VariableDeclaration+
;
StatesSection:
	  ( st='states' states+=BehaviorState+ )
;
Transitions:
  'transitions' bt+=BehaviorTransition+
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



/* xText
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
@datatype class BTSVariableDeclaration (
                                         name: Name,  //variable name
                                         category: Option[BTSVariableCategory.Type],
                                         varType: BTSType,
                                         assignExpression: Option[BTSExp],
 /*this can be removed, if not used by BA*/ arraySize: Option[BTSExp],  //not used in BLESS, array size is part of type
                                         variableAssertion: Option[BTSAssertion] //extends BTSBLESSAnnexClause
                                       )

// Categories of behavior variables in BA/BLESS
@enum object BTSVariableCategory {
  "Nonvolatile"
  "Shared"
  "Constant"
  "Spread"
  "Final"
}

/* XText
BehaviorState returns BehaviorState:
name=ID
':'
initial?='initial'?
complete?='complete'?
final?='final'?
'state' state_assertion=Assertion? ';'?
;
*/
@datatype class BTSStateDeclaration (
                                      id : Name,
                                      categories: ISZ[BTSStateCategory.Type],
                                      assertion: Option[BTSAssertion]
                                    )


// Three categories of states in BA/BLESS
@enum object BTSStateCategory {
  'Initial
  'Complete
  'Execute  //actually it should be Execution
  'Final
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


// Dispatch conditions are needed to leave execution.
/* Xtext
DispatchCondition returns DispatchCondition:
{DispatchCondition}
'on' 'dispatch'  de=DispatchExpression?
( 'frozen' frozen+=[aadl2::Port] ( ','  frozen+=[aadl2::Port] )* )?
;
DispatchExpression returns DispatchExpression:
  dc+=DispatchConjunction ( or?='or' dc+=DispatchConjunction
  	( 'or' dc+=DispatchConjunction )* )?
  | provides=[aadl2::SubprogramAccess]
;
DispatchConjunction returns DispatchConjunction:
  trigger+=DispatchTrigger
    ( and?='and' trigger+=DispatchTrigger
    	( 'and' trigger+=DispatchTrigger)* )?
;
*/

// enable polymorphism for different types of transition conditions
@sig trait BTSTransitionCondition

/*
DispatchCondition:
  'on' dispatch='dispatch' de=DispatchExpression?
  //BA2015 reconciliation declare ports to be frozen
  frozen=FreezePort?
;
DispatchExpression:
  dc+=DispatchConjunction ( or?='or' dc+=DispatchConjunction
  	( 'or' dc+=DispatchConjunction )* )?
  	//BA2015 reconciliation
  | subprogramaccessdispatch=SubprogramAccessDispatch
;
SubprogramAccessDispatch:
	'access' access=[aadl2::SubprogramAccess]
;
 */
@datatype class BTSDispatchCondition (conjunctions : ISZ[BTSDispatchConjunction], // disjunction of conjunctions
                                      subprogramaccessdispatch : Name,
                                      frozenPorts: ISZ[Name]) extends BTSTransitionCondition

/*
DispatchConjunction:
  trigger+=DispatchTrigger
    ( and?='and' trigger+=DispatchTrigger
    	( 'and' trigger+=DispatchTrigger)* )?
;
 */
@datatype class BTSDispatchConjunction(triggers: ISZ[BTSDispatchTrigger])

/*
DispatchTrigger:
  stop='stop'
  | port=PortName
  | timeout='timeout'
   ( ( lp?='(' ports+=[aadl2::NamedElement|ID] ( '[' indicies+=NUMBER ']' )?
   	('or'? ports+=[aadl2::NamedElement|ID] ( '[' indicies+=NUMBER ']' )?)* ')' )?
   	 time=BehaviorTime )?
;
 */
@sig trait BTSDispatchTrigger

@datatype class BTSDispatchTriggerStop extends BTSDispatchTrigger

/*
PortName:
  port=[aadl2::NamedElement|ID]
  ( '[' index=NUMBER ']' )?
;
 */
@datatype class BTSDispatchTriggerPort(port: Name, portarrayindex : Option[Z]
                                      ) extends BTSDispatchTrigger

@datatype class BTSDispatchTriggerTimeout(ports: ISZ[Name],
                                          time: Option[BTSExp]) extends BTSDispatchTrigger

// Execute conditions are needed to leave execution states
/* Xtext
ExecuteCondition:
  eor=ExpressionOrRelation
  | timeout='timeout'      //added for BA2015 reconciliation  // Brian doesn't like; he wants to be explicit
                           // Brian  says that this would implicitly be period property.
  | otherwise='otherwise'  //added for BA2015 reconciliation  // Brian doesn't like; he wants to be explicit
;
*/

@sig trait BTSExecuteCondition extends BTSTransitionCondition

@datatype class BTSExecuteConditionExp (exp: BTSExp) extends BTSExecuteCondition // TODO can be a relation

@datatype class BTSExecuteConditionTimeout () extends BTSExecuteCondition

@datatype class BTSExecuteConditionOtherwise () extends BTSExecuteCondition


/////// MODE CONDITION  ///////////////////
// Reaching down the subcomponent hierarchy to get event delivery will be hard
/* Xtext
ModeCondition:
	'on' tle=TriggerLogicalExpression
;
*/
@datatype class BTSModeCondition (tle : BTSTriggerLogicalExpression) extends BTSTransitionCondition

 /*
TriggerLogicalExpression:
	first=EventTrigger ( op=LogicalOperator trigger+=EventTrigger
		  (ops+=LogicalOperator trigger+=EventTrigger)*)?
;
*/
@datatype class BTSTriggerLogicalExpression ( op : BTSModeOperator.Type,
                                             triggers : ISZ[BTSEventTrigger]) extends BTSEventTrigger

/*
EventTrigger:
//	subcomponent=SubcomponentName
 sub+=ID ( '.' sub+=ID )* '.' port=ID  ( '[' NUMBER ']' )?
 | '(' tle=TriggerLogicalExpression ')'
;
*/
@sig trait BTSEventTrigger

@datatype class BTSSubcomponentPort  //this should reference an AADL port
(sub : ISZ[Name], port : Name, index : Option[Z]) extends BTSEventTrigger

/*
LogicalOperator:
 op='and'
 | op='or'
 | op='xor'
 | 'and' op='then'
 | 'or' op='else'
;
*/
// xor will allow mode negation which may be a problem
@enum object BTSModeOperator {
  'AND
  'OR
  'XOR
  'THEN
  'ELSE
}

//////////////   INTERNAL CONDITION   ////////////////////////
// Brian says that this was added to support communication between Error Models and BLESS.
// Could be relevant to GUMBO goals to for aligning mode EMv2 and BA state machines
// state machines.
/* Xtext
InternalCondition:
	'on' 'internal' first=[aadl2::Port] ( 'or' ports+=[aadl2::Port] )*
;
 */
@datatype class BTSInternalCondition (internalports : ISZ[Name]) extends BTSTransitionCondition

/*********************************************
 * ASSERTION
 *********************************************/

/*
Assertion :
	namedassertion=NamedAssertion |
	namelessassertion=NamelessAssertion |
	namelessfunction=NamelessFunction |
	namelessenumeration=NamelessEnumeration
	;
 */
@sig trait BTSAssertion

//NamedAssertion implemented with 3 classes
/*
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
	'>>'
;
 */
@datatype class BTSNamedAssertion (label : Name,
                                   formals : ISZ[BTSVariable],
                                   predicate : BTSExp  //must be boolean
                                  ) extends BTSAssertion

@datatype class BTSNamedFunction (label : Name,
                                  formals : ISZ[BTSVariable],
                                  returns : BTSType,
                                  functionvalue : BTSExp  //must be non-boolean
                                 ) extends BTSAssertion

@datatype class BTSNamedEnumeration (label : Name,
                                     assertionvariable : Name,
                                     enumerationtype : BTSType,  //must be an enumeration
                                    enumeration : BTSAssertionEnumeration
                                    ) extends BTSAssertion

/*
NamelessAssertion:  '<<' predicate=Predicate '>>' ;
 */
@datatype class BTSNamelessAssertion (predicate : BTSExp) extends BTSAssertion

/*
NamelessFunction:  '<<' 'returns' tod=TypeOrReference func?=':=' functionvalue=AssertionFunctionValue '>>' ;
 */
@datatype class BTSNamelessFunction (returns : BTSType,
                                     functionvalue : BTSExp ) extends BTSAssertion

/*
NamelessEnumeration:  '<<' '+=>' enumeration=Invocation '>>';
 */
@datatype class BTSNamelessEnumeration (enumeration : BTSInvocation) extends BTSAssertion

/*
AssertionEnumeration:
  pred=Invocation
  |
  ( pair+=EnumerationPair (',' pair+=EnumerationPair)* )
;
 */
@sig trait BTSAssertionEnumeration

@datatype class BTSEnumerationPairs (pairs : ISZ[BTSEnumerationPair]) extends BTSAssertionEnumeration

/*
EnumerationPair returns EnumerationPair:
  enumeration_literal=ID '->' predicate=Predicate
  ;
 */
@datatype class BTSEnumerationPair (literal : Name,
                                    predicate : BTSExp)

/*
Invocation:
	label=[NamedAssertion|ID]
	'(' 	//actual_assertion_parameter_list
	( (params+=ActualParameter ( ',' params+=ActualParameter )* )
		|
		actual_parameter=NumericExpression
	)?
	 ')'
;
 */
@datatype class BTSInvocation (label : Name,
                               params : ISZ[BTSActualParameter],
                               actual : Option[BTSExp]) extends BTSAssertionEnumeration

/*
ActualParameter:
	formal=ID ':' actual=Expression
;
 */
@datatype class BTSActualParameter (formal : Name, actual : BTSExp)

/*
Variable:
	name=ID '~' tod=TypeOrReference
;
 */
@datatype class BTSVariable (name : Name, typ : BTSType)

/*********************************************
 * ACTION
 *********************************************/

/*
ActionSubclause returns ActionSubclause:
	{ActionSubclause}
	no_proof ?= 'DO_NOT_PROVE'?
  throws_clause=ThrowsClause?
  assert_clause=AssertClause?  //optionally set av
  ( 'pre' precondition=Assertion )?
  ( 'post' postcondition=Assertion )?
  ( 'invariant' invariant=Assertion )?
  elq=ExistentialLatticeQuantification
;
ThrowsClause:
	'throws' exceptions+=[Exception]
;
AssertClause:
  'assert' (assertions+=NamedAssertion)+
;
 */
@datatype class BTSActionAnnexSubclause (
                                          doNotProve: B,  // TRUE means no proof is expected
                                        throws : ISZ[/*exception*/Name],
                                          assertions : ISZ[BTSAssertion],
                                          precondition : Option[BTSAssertion],
                                          postcondition : Option[BTSAssertion],
                                          invariant : Option[BTSAssertion],
                                          elq : BTSExistentialLatticeQuantification
                                       ) extends BLESSAnnex

/*
BehaviorActions:
  action+=AssertedAction
  (  //sequential_composition
  	( semi?=';' action+=AssertedAction ( ';' action+=AssertedAction )* )
  	|  //concurrent_composition
  	( amp?='&' action+=AssertedAction ( '&' action+=AssertedAction)* )
  )?
;
 */
@datatype class BTSBehaviorActions (executionOrder: BTSExecutionOrder.Type,
                                    actions: ISZ[BTSAssertedAction])

@enum object BTSExecutionOrder {
  'Sequential
  'Concurrent
}

@datatype class BTSAssertedAction(precondition: Option[BTSAssertion],
                                  action: BTSAction,
                                  postcondition: Option[BTSAssertion])


/*
Action:
   basic=BasicAction
  | if_fi=Alternative
  | wl=WhileLoop
  | fl=ForLoop
  | du=DoUntilLoop
  | elq=ExistentialLatticeQuantification //forall_action
  | ulq=UniversalLatticeQuantification   //behavior_action_block
  | la=LockingAction
;
 */
@sig trait BTSAction

/*
BasicAction:
  skip='skip'
  | assign=Assignment
  | 'setmode' mode=[aadl2::Mode]
  | when=WhenThrow
  | comb=CombinableOperation
  | communication=CommunicationAction
  | computation=Computation
  | multi_assign=SimultaneousAssignment
  | exc=IssueException
;
 */
@sig trait BTSBasicAction extends BTSAction

@datatype class BTSSkipAction extends BTSBasicAction

/*
Assignment:
   lhs=NameTick asgn=':=' rhs=ExpressionOrAny
;
 */
@datatype class BTSAssignmentAction(lhs : BTSValueName,
                                    tick : B,
                                    rhs : BTSExp) extends  BTSBasicAction

@datatype class BTSSetMode (mode : Name) extends  BTSBasicAction

/*
WhenThrow:
  'when' '(' exp=Expression ')' 'throw' exception=[Exception]  message=STRING?
;
 */
@datatype class BTSWhenThrow (exp : BTSExp,
                              exception : Name,
                              message : Option[String]) extends  BTSBasicAction

/*
CombinableOperation returns CombinableOperation:
  f_add?='fetchadd' '(' target=[Variable] ',' arithmetic=Expression ',' result=[Variable] ')'
  |
  ( f_or?='fetchor' | f_and?='fetchand' | f_xor?='fetchxor' )
    '(' target=[Variable] ',' bool=Expression ( ',' result=[Variable] )? ')'
  |
  sw?='swap' '(' target=[Variable] ',' reference=[Variable] ',' result=[Variable] ')'
;
 */
@sig trait BTSCombinableOperation extends  BTSBasicAction
@datatype class BTSFetchAdd (target : Name,
                             arithmetic : BTSExp,
                             result : Name) extends BTSCombinableOperation
@datatype class BTSFetchOr (target : Name,
                             bool : BTSExp,
                             result : Option[Name]) extends BTSCombinableOperation
@datatype class BTSFetchAnd (target : Name,
                             bool : BTSExp,
                             result : Option[Name]) extends BTSCombinableOperation
@datatype class BTSFetchXor (target : Name,
                             bool : BTSExp,
                             result : Option[Name]) extends BTSCombinableOperation
@datatype class BTSSwap (target : Name,
                         reference : Name,
                         result : Name) extends BTSCombinableOperation

/*
CommunicationAction:
  pc=SubprogramCall
  |
  po=PortOutput
  |
  pi=PortInput
  |  //freeze port
  fp=FreezePort
  |
  pause=Pause
;
 */
@sig trait BTSCommunicationAction extends BTSBasicAction

/*
SubprogramCall:
  procedure=[aadl2::SubprogramClassifier]
  '(' parameters=FormalActualList? ')'
;
FormalActualList:
  variables+=FormalActual ( comma?=',' variables+=FormalActual ( ',' variables+=FormalActual )* )?
;
 */
@datatype class BTSSubprogramCallAction(name: Name,
                                        params: ISZ[BTSFormalActual]) extends BTSCommunicationAction

/*
FormalActual:
  ( formal=[aadl2::Parameter]
    ':' )? actual=SubProgramParameter
;
SubProgramParameter:
	value=ValueName
	| constant=Constant
	| expression=ParenthesizedSubexpression
;
 */
@datatype class BTSFormalActual(formal: Name,
                                actual: BTSExp)  //may want to be more specific about the type parameter

/*
PortOutput:
  port=[aadl2::Port|ID]
    '!' ( '(' eor=Expression  // ExpressionOrRelation
    	')' )?
;
 */
@datatype class BTSPortOutput(port: Name,
                                 exp: Option[BTSExp]) extends BTSCommunicationAction
/*
PortInput:
  port=[aadl2::Port|ID] '?' '(' target=ValueName ')'
   ;
 */
@datatype class BTSPortInput(port: Name,
                                variable: BTSValueName) extends BTSCommunicationAction

/*
FreezePort:
   'frozen' '(' frozen+=[aadl2::Port|ID] ( ','  frozen+=[aadl2::Port|ID] )* ')'
 ;
 */
@datatype class BTSFrozenPortAction(ports: ISZ[Name]) extends BTSCommunicationAction

/*
Pause: pause='pause' ;
 */
@datatype class BTSPause extends BTSCommunicationAction


@sig trait BTSControlAction extends BTSAction

/*
Alternative:
  'if'
'(' guard=BooleanExpression
  (
  blessalt=BLESSAlternative
  | baalt=BAAlternative
	)
;
BLESSAlternative:
	 ')~>' action=AssertedAction
	  ( '[]' alternative+=GuardedAction )+
  'fi'
;
 */
@datatype class BTSIfBLESSAction (availability: Option[TODO], // TODO   All availablilities have been removed from BLESS
                                  alternatives: ISZ[BTSGuardedAction]) extends BTSControlAction

/*
GuardedAction:
  '(' guard=BooleanExpression ')~>' action=AssertedAction
;
 */
@datatype class BTSGuardedAction (guard: BTSExp,
                                  action: BTSAssertedAction)
/*
BAAlternative:
   //BA2015 reconciliation  add if-elsif-else-end if
  ')' actions+=BehaviorActions
  ('elsif' '(' test+=BooleanExpression ')' actions+=BehaviorActions  )*
  ('else' actions+=BehaviorActions)?
  'end' 'if'
;
 */
@datatype class BTSIfBAAction (ifBranch: BTSConditionalActions,
                               elseIfBranches: ISZ[BTSConditionalActions],
                               elseBranch: Option[BTSBehaviorActions]) extends BTSControlAction

@datatype class BTSConditionalActions (cond: BTSExp,
                                       actions: BTSBehaviorActions)

/*
WhileLoop:
  'while'
  '(' test=BooleanExpression ')'
  ( invariant?='invariant' inv=NamelessAssertion )?
  ( bound?='bound' bound_function=Expression )?
  elq=ExistentialLatticeQuantification
;
 */
@datatype class BTSWhileLoop (test : BTSExp,
                              invariant : Option[BTSNamelessAssertion],
                              bound : Option[BTSExp],
                              elq : BTSExistentialLatticeQuantification) extends BTSControlAction

/*
ForLoop:
  'for'
  count=ForallVariable
  'in' lower_bound=Expression DOTDOT upper_bound=Expression
  ( invariant?='invariant' inv=NamelessAssertion )?
  '{'  action=BehaviorActions '}'
;
ForallVariable:
  name=ID
;
 */
@datatype class BTSForLoop (count : Name,
                            lowerbound : BTSExp,
                            upperbound : BTSExp,
                            invariant : Option[BTSNamelessAssertion],
                            actions : BTSBehaviorActions
                           ) extends BTSControlAction

/*
DoUntilLoop:
  'do'
  ( invariant?='invariant' inv=NamelessAssertion )?
  ( bound?='bound' bnd=Expression )?
  actions=BehaviorActions
  'until' '(' guard=BooleanExpression ')'
;
 */
@datatype class BTSDoUntilLoop (invariant : Option[BTSNamelessAssertion],
                                bound : Option[BTSExp],
                                actions : BTSBehaviorActions,
                                guard :BTSExp
                               ) extends BTSControlAction


@sig trait BTSQuantificationActions extends BTSAction

/*
ExistentialLatticeQuantification:
  quantified_variables=QuantifiedVariables?
  '{'
  actions=BehaviorActions
   '}'
  timeout=ActionTimeout?
  catch_clause=CatchClause?
;
QuantifiedVariables:
  'declare' variables+=VariableDeclaration+
;
ActionTimeout:
  'timeout' duration=BehaviorTime
;
CatchClause:
  'catch'
  ( catches+=CatchClauseTerm )+
;
 */
@datatype class BTSExistentialLatticeQuantification (quantifiedVariables: ISZ[BTSVariableDeclaration],
                                                     actions: BTSBehaviorActions,
                                                     timeout: Option[BTSExp],
                                                     catchClause: ISZ[BTSCatchClauseTerm]
                                                    ) extends BTSQuantificationActions

/*
CatchClauseTerm:
  '(' //exception_label
  ( exceptions+=[Exception]+ | all?='all' ) ':' action=BasicAction
  ')'
;
 */
@datatype class BTSCatchClauseTerm (exceptions : ISZ[Name],
                                    all : B,
                                    action : BTSBasicAction)

/*
UniversalLatticeQuantification returns UniversalLatticeQuantification:
//  {UniversalLatticeQuantification}
  'forall'
  variables+=ForallVariable+
    'in'   lower_bound=Expression  DOTDOT upper_bound=Expression
  elq=ExistentialLatticeQuantification
;
 */
@datatype class BTSUniversalLatticeQuantification (latticeVariables: ISZ[Name],
                                                   lowerbound : BTSExp,
                                                   upperbound : BTSExp,
                                                   elq: BTSExistentialLatticeQuantification
                                                  ) extends BTSQuantificationActions







///////////////   EXPRESSION        ///////////////////
@sig trait BTSExp

@datatype class BTSUnaryExp(op: BTSUnaryOp.Type,
                            exp: BTSExp) extends BTSExp

@enum object BTSUnaryOp {
  'ABS
  'NEG
  'NOT
  'TRUNCATE
  'ROUND
  'TICK
}

@datatype class BTSBinaryExp(op: BTSBinaryOp.Type,
                             lhs: BTSExp,
                             rhs: BTSExp) extends BTSExp

@enum object BTSBinaryOp {
  'AND
  'ANDTHEN
  'OR
  'ORELSE
  'XOR
  'IFF
  'IMPLIES

  'EQ
  'NEQ
  'LT
  'LTE
  'GT
  'GTE
  'FA
  'IN

  'PLUS
  'MINUS
  'DIVIDE
  'MULT
  'DIV
  'MOD
  'REM
  'EXP

  'AT
  'CARET
}

@enum object BTSLiteralType {
  'BOOLEAN
  'STRING
  'INTEGER
  'FLOAT
  'NUMBER
  // NULL, INT, LONG, CHAR, DOUBLE, RATIONAL
}

@datatype class BTSLiteralExp(typ: BTSLiteralType.Type,
                              exp: String,
                             unit : Option[Name]) extends BTSExp


@sig trait BTSValueName extends BTSExp

@datatype class BTSVariableNameExp(name: Name,
                                   arrayindex : ISZ[BTSExp],
                                  pn : ISZ[BTSPartialName]) extends BTSValueName
/*
PartialName:
	record_id=ID  //[RecordField]
	 ( lb?='[' array_index+=IndexExpressionOrRange ']'
		( '[' array_index+=IndexExpressionOrRange ']' )* )?
;
 */
@datatype class BTSPartialName (label : Name,
                                arrayindex : ISZ[BTSExp])

// WHAT IS THIS FOR?
@datatype class BTSIndexingExp (exp: BTSExp,
                               indices: ISZ[BTSExp]) extends BTSExp

// WHAT IS THIS FOR?
@datatype class BTSAccessExp (exp: BTSExp,
                             attributeName: String) extends BTSExp

@datatype class BTSFunctionCall (name: Name,
                                args: ISZ[BTSFormalActual]) extends BTSValueName

@datatype class BTSPortValue (port : Name,
                                valuekind : BTSPortValueKind.Type )

@enum object BTSPortValueKind {
  'Q
  'FRESH
  'COUNT
  'UPDATED
}

@datatype class BTSConditionalExpression (guard : BTSExp,
                                          t : BTSExp,
                                          f : BTSExp) extends BTSExp

@datatype class BTSTrue extends BTSExp
@datatype class BTSFalse extends BTSExp
@datatype class BTSNull extends BTSExp
@datatype class BTSPropertyConstant (propertyset : Name,
                                     propertyconstant : Name) extends BTSExp

/*
PropertyReference:
'#' pname=[aadl2::Property|QCLREF] ( field+=PropertyField )*
//component_element_reference
| self?='self' '#' spname=[aadl2::Property|QCLREF] ( field+=PropertyField )*
| component=[aadl2::ComponentClassifier|QCREF] '#' cpname=[aadl2::Property|QCLREF]
   ( field+=PropertyField )*
;
 */
@sig trait BTSPropertyReference extends BTSExp
@datatype class BTSPropertySetProperty (propertyset : Option[Name],
                                        propertyconstant : Name,
                                        field : ISZ[BTSPropertyField]) extends BTSExp
@datatype class BTSSelfProperty (propertyset : Option[Name],
                                 propertyconstant : Name,
                                 field : ISZ[BTSPropertyField]) extends BTSExp
@datatype class BTSComponentProperty (component : BTSComponent,
                                      propertyset : Option[Name],
                                      propertyconstant : Name,
                                      field : ISZ[BTSPropertyField]) extends BTSExp

/*
QCREF:
	(ID '::')* ID ('.' ID)?;
 */
@datatype class BTSComponent (packageids : ISZ[Name],
                              component : Name,
                              impl : Option[Name])

/*
PropertyField:
	'[' (index=NUMBER | variable=[Variable]) ']'  //must check that number is integer
	| '.'  (pf=ID | upper='upper_bound' | lower='lower_bound')
;
 */
@datatype class BTSPropertyField (index : Option[Z],
                                  variable : Option[Name],
                                  pf : Option[Name],
                                  upper : B,
                                  lower : B)


  //@datatype class BTSBehaviorTime // TODO


//////////////////////  ASSERTION   ///////////////////

/*
UniversalQuantification:
  'all' variables=LogicVariables
    (in?='in' range=Range | which?='which' condition=Predicate )
     'are' predicate=Predicate
;
 */
  @datatype class BTSUniversalQuantification (variables : ISZ[BTSVariable],
                                              range : Option[BTSRange],
                                              condition : Option[BTSExp],
                                              predicate : BTSExp
                                             ) extends BTSExp

/*
ExistentialQuantification:
  'exists' variables=LogicVariables
    (in?='in' range=Range | which?='which' condition=Predicate )
     'that' predicate=Predicate
;
 */
  @datatype class BTSExistentialQuantification (variables : ISZ[BTSVariable],
                                                range : Option[BTSRange],
                                                condition : Option[BTSExp],
                                                predicate : BTSExp
                                               ) extends BTSExp

/*
SumQuantification:
  'sum' variables=LogicVariables
    (in?='in' range=Range | which?='which' condition=Predicate )
     'of' numeric_expression=NumericExpression ;
 */
  @datatype class BTSSumQuantification (variables : ISZ[BTSVariable],
                                        range : Option[BTSRange],
                                        condition : Option[BTSExp],
                                        expression : BTSExp
                                       ) extends BTSExp

/*
ProductQuantification:
  'product' variables=LogicVariables
    (in?='in' range=Range | which?='which' condition=Predicate )
     'of' numeric_expression=NumericExpression ;
 */
  @datatype class BTSProductQuantification (variables : ISZ[BTSVariable],
                                            range : Option[BTSRange],
                                            condition : Option[BTSExp],
                                            expression : BTSExp
                                           ) extends BTSExp

/*
CountingQuantification:
  'numberof' variables=LogicVariables
    (in?='in' range=Range | which?='which' condition=Predicate )
     'that' counted=Predicate ;
 */
  @datatype class BTSCountingQuantification (variables : ISZ[BTSVariable],
                                             range : Option[BTSRange],
                                             condition : Option[BTSExp],
                                             predicate : BTSExp
                                            ) extends BTSExp



/*
//assertion_range
Range:
	lower_bound=Subexpression sym=RangeSymbol upper_bound=Subexpression
;
 */
@datatype class BTSRange(lb : BTSExp,
                         op : BTSRangeSymbol.Type,
                         ub : BTSExp) extends BTSExp


/*
RangeSymbol : DOTDOT | COMMADOT | DOTCOMMA | COMMACOMMA;
 */
@enum object BTSRangeSymbol {
  'DOTDOT
  'COMMADOT
  'DOTCOMMA
  'COMMACOMMA
}

//////////////////////////////////////////////
////////////////   TYPE   ////////////////////
//////////////////////////////////////////////

/*
TypeLibrary:
	decs+=TypeDeclaration+
;
 */
@datatype class BTSTypeLibrary (typedeclarations : ISZ[BTSTypeDeclatation]) extends AnnexLib

/*
TypeDeclaration:
	'type' name=ID 'is' type=Type
;
 */
@datatype class BTSTypeDeclatation (name : Name,
                                    ty : BTSType)

/*
Type:
	EnumerationType
	| QuantityType
	| ArrayType
	| RecordType
	| BooleanType
	| StringType
	| NullType
;
 */
@sig trait BTSType

@datatype class BTSBooleanType extends BTSType
@datatype class BTSStringType extends BTSType
@datatype class BTSNullType extends BTSType

//type as data component for BA
@datatype class BTSClassifier (classifier: BTSComponent) extends BTSType

/*
TypeOrReference:
	ty=Type | ref=[TypeDeclaration]
;
 */
@datatype class BTSTypeName (typename: Name) extends BTSType

/*
EnumerationType:
 'enumeration' '(' defining_enumeration_literal+=ID+ ')'
;
 */
@datatype class BTSEnumerationType (literals : ISZ[Name]) extends BTSType

/*
QuantityType:
  'quantity'
  ( unit=[UnitName] | scalar?='scalar' | whole?='whole' )
  ( '[' lb=ANumber DOTDOT ub=ANumber ']' )?
  ( 'step' step=ANumber )?  //check if positive
  ( 'representation' representation=[aadl2::PropertyConstant|QCLREF] )?
;
 */
@datatype class BTSQuantityType (unit : Option[Name],
                                 scalar : B,
                                 whole : B,
                                 lb : Option[F64],
                                 ub : Option[F64],
                                 step : Option[F64],
                                 representation : Option[BTSPropertyConstant]
                                ) extends BTSType

/*
ArrayType :
  'array' '[' array_ranges=ArrayRangeList ']' 'of' typ=TypeOrReference
;
 ArrayRangeList : range+=ArrayRange ( comma?=',' range+=ArrayRange ( ',' range+=ArrayRange )* )? ;
*/
@datatype class BTSArrayType (ranges : ISZ[BTSArrayRange],
                              typ : BTSType) extends BTSType

/*
//natural_range
ArrayRange : lb=ANumber ( DOTDOT ub=ANumber)? ;
 */
@datatype class BTSArrayRange (lb : BTSExp,  //ranges must be constant, natural numbers
                               ub : Option[BTSExp])

/*
RecordType :
	(record?='record' | variant?='variant' | variant?='union' )
	'(' fields+=RecordField+ // ( ',' fields+=RecordField )*
	  ')'
;
 */
@datatype class BTSRecordType (kind : BTSRecordKind.Type,
                               fields : ISZ[BTSRecordField]) extends BTSType
@enum object BTSRecordKind {
  'RECORD
  'VARIANT
}

/*
RecordField :
	label=ID
	':' typ=TypeOrReference
;
 */
@datatype class BTSRecordField (label : Name, typ : BTSType)



//////////////////////////////////////////////////////////////
///                        U N I T                         ///
//////////////////////////////////////////////////////////////

/*
UnitLibrary:
	unitDeclarations+=UnitDeclaration+
	;
 */
@datatype class BTSUnitLibrary (unitDeclarations : ISZ[BTSUnitDeclaration]) extends AnnexLib

@sig trait BTSUnitDeclaration

/*
RootDeclaration:
	( base?='base' | formula=UnitFormula ) '[' kindWords+=ID+ ']'
	unitName=UnitName factors+=UnitFactor* ';'
	;
 */
@datatype class BTSRootDeclaration( base: B,  //either
                                    formula: Option[BTSUnitFormula],  //or
                                    kindWords : ISZ[Name],
                                    unitName : BTSUnitName,
                                    factors : ISZ[BTSUnitFactor]) extends BTSUnitDeclaration

/*
UnitExtension:
	'extension' root=[UnitName] factors+=UnitFactor+ ';'
;
 */
@datatype class BTSUnitExtension( root : BTSUnitName,
                                  factors : ISZ[BTSUnitFactor]) extends BTSUnitDeclaration

/*
UnitName:
	( '<' longname+=ID+ '>' )? name=ID
;
 */
@datatype class BTSUnitName( longname : ISZ[Name], name : Name)

/*
UnitFormula:
	top+=[UnitName]+ ( slash?='/' bottom+=[UnitName]+ )?
	|
	slash?='/' bottom+=[UnitName]+
;
 */
@datatype class BTSUnitFormula( top : ISZ[BTSUnitName], bottom : ISZ[BTSUnitName])

/*
MulDiv : (TIMES | '/');
 */
@enum object BTSMulDiv {
  'DIV
  'MULT
}

/*
UnitFactor: ',' unit=UnitName op=MulDiv factor=PositiveNumber;
 */
@datatype class BTSUnitFactor( unit : BTSUnitName,
                               op : BTSMulDiv.Type,
                               factor : R)
/*
Quantity: number=NUMBER
	(unit=[UnitName] | scalar?='scalar')?
;
 */
@datatype class BTSQuantity( number : R,
                             unit : Option[/*Unit*/Name],
                             scalar : B) extends BTSExp

/////////////////   EXCEPTION   //////////////////////

/*
ExceptionLibrary returns ExceptionLibrary:
	{ExceptionLibrary}
	exceptiondefinitions+=Exception+
;
 */
@datatype class BTSExceptionLibrary (exc : ISZ[BTSExceptionDeclaration]) extends AnnexLib

/*
Exception:
	name=ID description=STRING ( code=NUMBER )?  //add check for natural number
;
 */
@datatype class BTSExceptionDeclaration (name : Name,
                                         description : String,
                                         code : Option[Z])



@datatype class TODO