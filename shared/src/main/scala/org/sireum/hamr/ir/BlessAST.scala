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

// Alternative top-level where the behavior code for a thread is provided via an external library.
@datatype class BTSSubclauseBehaviorProvider (values: ISZ[BTSResource]) extends BLESSAnnex

@sig trait BTSResource {
  def overwrite: B
}

@datatype class BTSText (val source: String,
                         val filename: Option[String],
                         val overwrite: B) extends BTSResource

@datatype class BTSPath (val path: String,
                         val overwrite: B ) extends BTSResource


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
/* xText
VariablesSection returns Variables:
'variables'
( bv+=BehaviorVariable
)+
;
BehaviorVariable:
  // TODO: I don't understand this structure
  variable_names+=Declarator ( comma?=',' variable_names+=Declarator
  	  ( ',' variable_names+=Declarator)* )?
  ':'
  (
  	nonvolitile?='nonvolatile'
  	| shared?='shared'
  	| constant?='constant'
    | spread?='spread'
    | final='final')?
  type=Type
  ( assign?=':=' expression=Expression )?
  assertion=Assertion?
  ';'
  ;
Declarator:
	variable=ID ( '[' array_size+=ValueConstant ']' )*
;
*/


// Note to Brian: Generating the structure below
// would require processing the original Xtext parse tree above to
// generate on BTSVariableDeclaration per variable.

@datatype class BTSVariableDeclaration (
                                         name: Name,
                                         category: Option[BTSVariableCategory.Type],
                                         varType: BTSType,
                                         assignExpression: Option[BTSExp],
                                         arraySize: Option[BLESSIntConst],
                                         variableAssertion: Option[BTSAssertion]) //extends BTSBLESSAnnexClause

// Categories of behavior variables in BA/BLESS
@enum object BTSVariableCategory {
  'Nonvolatile
  'Shared
  'Constant
  'Spread
  'Final
}

// TODO: Complete type grammar
@sig trait BTSType

@datatype class BTSClassifier (classifier: Classifier) extends BTSType

// TODO: Complete constant grammar --  used for array size above
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
//  {DispatchConjunction}
  trigger+=DispatchTrigger
    ( and?='and' trigger+=DispatchTrigger
    	( 'and' trigger+=DispatchTrigger)* )?
;
DispatchTrigger returns DispatchTrigger:
//  {DispatchTrigger}
  stop?='stop'
  | port=[aadl2::Port]
  | timeout?='timeout'
   ( ( lp?='(' ports+=[aadl2::Port] ('or'? ports+=[aadl2::Port])* ')' )? time=BehaviorTime )?
;
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

@datatype class BTSExecuteConditionTimeout () extends BTSExecuteCondition

@datatype class BTSExecuteConditionOtherwise () extends BTSExecuteCondition

// Brian says this is present to be compatible with BA.  Currently not supported in BLESS.
// See annex document for BA.   Could be relevant to GUMBO goals to for aligning mode
// state machines.
/* Xtext
ModeCondition:
	'on' tle=TriggerLogicalExpression
;
EventTrigger:
//	subcomponent=SubcomponentName
	sub+=ID ( '.' sub+=ID )* '.' port=ID
	| '(' tle=TriggerLogicalExpression ')'
;
LogicalOperator:
	op='and'
	| op='or'
	| op='xor'
	| 'and' op='then'
	| 'or' op='else'
;
 */

// TODO: Complete grammar for mode conditions
@datatype class BTSModeCondition extends BTSTransitionCondition

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
@datatype class BTSInternalCondition extends BTSTransitionCondition




/*********************************************
 * ASSERTION
 *********************************************/

/* XText
 (Assertion clause in separate file -- add definition later)
 */

// TODO: Add grammar for assertion
@datatype class BTSAssertion ( /* need to add definition */ ) //extends BLESSAnnex





/*********************************************
 * SUB BLESS
 *********************************************/
// TODO: Complete expression grammar

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



@datatype class BTSBehaviorTime // TODO


@datatype class TODO


@datatype class Attr(posOpt: Option[Position])