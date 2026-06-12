// #Sireum
/*
 Copyright (c) 2017-2026,Kansas State University
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
import org.sireum.lang.ast.MethodSig
import org.sireum.message.Position

@sig trait GclSymbol {
  def posOpt: Option[Position]
}

@sig trait GclNamedElement extends GclSymbol {
  @pure def id: String
}

@datatype class GclSubclause(val state: ISZ[GclStateVar],
                             val methods: ISZ[GclMethod],
                             val invariants: ISZ[GclInvariant],
                             val initializes: Option[GclInitialize],
                             val integration: Option[GclIntegration],
                             val compute: Option[GclCompute],
                             val compositions: ISZ[GclComposition],
                             @hidden val attr: Attr) extends AnnexClause with GclSymbol {
  @strictpure override def posOpt: Option[Position] = attr.posOpt

  override def string: String = {
    return prettyST.render
  }

  @pure def prettyST: ST = {
    val sstate: Option[ST] =
      if (state.nonEmpty) Some(
        st"""state
            |  ${(state, "\n")}""")
      else None()
    val smethods: Option[ST] =
      if (methods.nonEmpty) Some(
        st"""functions
            |  ${(methods, "\n")}""")
      else None()
    val sinvariants: Option[ST] =
      if (invariants.nonEmpty) Some(
        st"""invariants
            |  ${(invariants, "\n")}""")
      else None()
    val sintegration: Option[ST] =
      if (integration.nonEmpty) Some(
        st"""integration
            |  ${integration.get.string}""")
      else None()
    val sinitializes: Option[ST] =
      if (initializes.nonEmpty) Some(
        st"""initializes
            |  ${initializes.get.string}""")
      else None()
    val scompute: Option[ST] =
      if (compute.nonEmpty) Some(
        st"""compute
            |  ${compute.get.string}""")
      else None()
    val scompositions: Option[ST] =
      if (compositions.nonEmpty) Some(st"${(for (c <- compositions) yield c.prettyST, "\n")}")
      else None()

    return (
      st"""$sstate
          |$smethods
          |$sinvariants
          |$sintegration
          |$sinitializes
          |$scompute
          |$scompositions""")
  }
}

@sig trait GclMethod extends GclNamedElement {
  @strictpure def sig: org.sireum.lang.ast.MethodSig
}

@datatype class GclSpecMethod(val method: org.sireum.lang.ast.Stmt.SpecMethod) extends GclMethod {
  @strictpure override def id: String = method.sig.id.value

  @strictpure override def posOpt: Option[Position] = method.posOpt

  override def string: String = {
    return method.string
  }

  @strictpure override def sig: MethodSig = method.sig
}

@datatype class GclBodyMethod(val method: org.sireum.lang.ast.Stmt.Method) extends GclMethod {
  @strictpure override def id: String = method.sig.id.value

  @strictpure override def posOpt: Option[Position] = method.posOpt

  override def string: String = {
    return method.string
  }

  @strictpure override def sig: MethodSig = method.sig
}

@datatype class GclStateVar(val name: String,
                            val classifier: String,
                            @hidden val attr: Attr) extends GclNamedElement {

  @strictpure override def id: String = name

  @strictpure override def posOpt: Option[Position] = attr.posOpt

  override def string: String = {
    return prettyST.render
  }

  @pure def prettyST: ST = {
    return st"$name: $classifier"
  }
}

@sig trait GclClause extends GclNamedElement {
  def descriptor: Option[String]
}

@sig trait GclSpec extends GclClause {

  def exp: org.sireum.lang.ast.Exp

}

@datatype class GclInvariant(val id: String,
                             val descriptor: Option[String],
                             val exp: org.sireum.lang.ast.Exp,
                             @hidden val attr: Attr) extends GclSpec {
  @strictpure override def posOpt: Option[Position] = attr.posOpt

  override def string: String = {
    return prettyST.render
  }

  @pure def prettyST: ST = {
    return st"""$id $descriptor :
               |  ${exp.string}"""
  }
}

@sig trait GclComputeSpec extends GclSpec

@datatype class GclAssume(val id: String,
                          val descriptor: Option[String],
                          val exp: org.sireum.lang.ast.Exp,
                          @hidden val attr: Attr) extends GclComputeSpec {
  @strictpure override def posOpt: Option[Position] = attr.posOpt

  override def string: String = {
    return prettyST.render
  }

  @pure def prettyST: ST = {
    return(
      st"""assume ${id} $descriptor:
          |  $exp""")
  }
}

@datatype class GclGuarantee(val id: String,
                             val descriptor: Option[String],
                             val exp: org.sireum.lang.ast.Exp,
                             @hidden val attr: Attr) extends GclComputeSpec {
  @strictpure override def posOpt: Option[Position] = attr.posOpt

  override def string: String = {
    return prettyST.render
  }

  @pure def prettyST: ST = {
    return(
      st"""guarantee ${id} $descriptor:
          |  $exp""")
  }

}

@datatype class GclIntegration(val specs: ISZ[GclSpec],
                               @hidden val attr: Attr) extends GclSymbol {
  @strictpure override def posOpt: Option[Position] = attr.posOpt

  override def string: String = {
    return prettyST.render
  }

  @pure def prettyST: ST = {
    return st"${(specs, "\n")}"
  }
}

@datatype class GclCaseStatement(val id: String,
                                 val descriptor: Option[String],
                                 val assumes: Option[org.sireum.lang.ast.Exp],
                                 val guarantees: org.sireum.lang.ast.Exp,
                                 @hidden val attr: Attr) extends GclNamedElement {
  @strictpure override def posOpt: Option[Position] = attr.posOpt
}

@datatype class GclInitialize(val modifies: ISZ[org.sireum.lang.ast.Exp],
                              val guarantees: ISZ[GclGuarantee],
                              val flows: ISZ[InfoFlowClause],
                              @hidden val attr: Attr) extends GclSymbol {
  @strictpure override def posOpt: Option[Position] = attr.posOpt

  override def string: String = {
    return prettyST.render
  }

  @pure def prettyST: ST = {
    val smodifies: Option[ST] =
      if (modifies.nonEmpty) Some(
        st"""modifies (${(modifies, ",\n")})""")
      else None()
    val sguarantees: Option[ST] =
      if (guarantees.nonEmpty) Some(
        st"""guarantees
            |  ${(guarantees, "\n")}""")
      else None()
    val sflows: Option[ST] =
      if (flows.nonEmpty) Some(
        st"""flows
            |  ${(flows, "\n")}""")
      else None()
    return (
      st"""$smodifies
          |$sguarantees
          |$sflows""")
  }
}

@datatype class GclCompute(val modifies: ISZ[org.sireum.lang.ast.Exp],
                           val assumes: ISZ[GclAssume],
                           val guarantees: ISZ[GclGuarantee],
                           val cases: ISZ[GclCaseStatement],
                           val handlers: ISZ[GclHandle],
                           val flows: ISZ[InfoFlowClause],
                           @hidden val attr: Attr) extends GclSymbol {
  @strictpure override def posOpt: Option[Position] = attr.posOpt


  override def string: String = {
    return prettyST.render
  }

  @pure def prettyST: ST = {
    val smodifies: Option[ST] =
      if (modifies.nonEmpty) Some(
        st"""Modifies(${(modifies, ", ")})""")
      else None()
    val sassumes: Option[ST] =
      if (assumes.nonEmpty) Some(
        st"${(assumes, "\n")}")
      else None()
    val sguarantees: Option[ST] =
      if (guarantees.nonEmpty) Some(
        st"${(guarantees, "\n")}")
      else None()
    val scases: Option[ST] =
      if (cases.nonEmpty) Some(
        st"""compute_cases
            |  ${(cases, "\n")}""")
      else None()
    val shandles: Option[ST] =
      if (handlers.nonEmpty) Some(
        st"""${(handlers, "\n")}""")
      else None()
    val sflows: Option[ST] =
      if (flows.nonEmpty) Some(
        st"""InfoFlows(
            |  ${(flows, "\n")})""")
      else None()

    return (
      st"""$smodifies
          |$sassumes
          |$sguarantees
          |$scases
          |$shandles
          |$sflows""")
  }
}

@datatype class GclHandle(val port: org.sireum.lang.ast.Exp,
                          val modifies: ISZ[org.sireum.lang.ast.Exp],
                          val assumes: ISZ[GclAssume],
                          val guarantees: ISZ[GclGuarantee],
                          val cases: ISZ[GclCaseStatement],
                          @hidden val attr: Attr) extends GclSymbol {
  @strictpure override def posOpt: Option[Position] = attr.posOpt

  override def string: String = {
    return prettyST.render
  }

  @pure def prettyST: ST = {
    val smodifies: Option[ST] =
      if (modifies.nonEmpty) Some(
        st"""Modifies(${(modifies, ", ")})""")
      else None()
    val sassumes: Option[ST] =
      if (assumes.nonEmpty) Some(
        st"${(assumes, "\n")}")
      else None()
    val sguarantees: Option[ST] =
      if (guarantees.nonEmpty) Some(
        st"${(guarantees, "\n")}")
      else None()
    val scases: Option[ST] =
      if (cases.nonEmpty) Some(
        st"""compute_cases
            |  ${(cases, "\n")}""")
      else None()
          return (
      st"""handle $port:
          |  $smodifies
          |  $sassumes
          |  $sguarantees
          |  $scases""")
  }
}

// ---- Composition (system-level contracts for system implementations) ----
//
// A composition separates the schedule *schema* (component ordering, splits/
// joins) from named *properties* (assertion decorations of schema points); each
// property yields its own VC set over the shared net, and the required id names
// the per-composition artifacts (sys_proof_<id> crate, runtime monitor, meta
// program). See design D8 of VCGenerationDesign.md in the
// hamr-system-reasoning-prototype repo.

@datatype class GclComposition(val id: String,
                               val componentAliases: ISZ[GclCompositionComponentAlias],
                               val portAliases: ISZ[GclCompositionPortAlias],
                               val stateVarAliases: ISZ[GclCompositionStateVarAlias],
                               val schema: ISZ[GclSchemaElement],
                               val properties: ISZ[GclCompositionProperty],
                               @hidden val attr: Attr) extends GclNamedElement {
  @strictpure override def posOpt: Option[Position] = attr.posOpt

  override def string: String = {
    return prettyST.render
  }

  @pure def prettyST: ST = {
    val scomponents: Option[ST] =
      if (componentAliases.nonEmpty) Some(
        st"""components
            |  ${(for (a <- componentAliases) yield a.prettyST, "\n")}""")
      else None()
    val sports: Option[ST] =
      if (portAliases.nonEmpty) Some(
        st"""ports
            |  ${(for (a <- portAliases) yield a.prettyST, "\n")}""")
      else None()
    val sstatevars: Option[ST] =
      if (stateVarAliases.nonEmpty) Some(
        st"""state
            |  ${(for (a <- stateVarAliases) yield a.prettyST, "\n")}""")
      else None()
    val sproperties: Option[ST] =
      if (properties.nonEmpty) Some(st"${(for (p <- properties) yield p.prettyST, "\n")}")
      else None()
    return (
      st"""composition $id {
          |  $scomponents
          |  $sports
          |  $sstatevars
          |  schema {
          |    ${(for (e <- schema) yield e.prettyST, "\n")}
          |  }
          |  $sproperties
          |}""")
  }
}

@datatype class GclCompositionComponentAlias(val name: String,
                                             val componentPath: Name,
                                             @hidden val attr: Attr) extends GclNamedElement {
  @strictpure override def id: String = name

  @strictpure override def posOpt: Option[Position] = attr.posOpt

  override def string: String = {
    return prettyST.render
  }

  @strictpure def prettyST: ST = st"""$name = ${(componentPath.name, ".")};"""
}

@datatype class GclCompositionPortAlias(val name: String,
                                        val portPath: Name,
                                        @hidden val attr: Attr) extends GclNamedElement {
  @strictpure override def id: String = name

  @strictpure override def posOpt: Option[Position] = attr.posOpt

  override def string: String = {
    return prettyST.render
  }

  @strictpure def prettyST: ST = st"""$name = ${(portPath.name, ".")};"""
}

@datatype class GclCompositionStateVarAlias(val name: String,
                                            val stateVarPath: Name,
                                            @hidden val attr: Attr) extends GclNamedElement {
  @strictpure override def id: String = name

  @strictpure override def posOpt: Option[Position] = attr.posOpt

  override def string: String = {
    return prettyST.render
  }

  @strictpure def prettyST: ST = st"""$name = ${(stateVarPath.name, ".")};"""
}

// Schema elements: the skeleton only -- no assertions. Within a sequence,
// elements are ';'-separated (order is claimed); the branches of a split are
// ','-separated (order is deliberately not claimed).

@sig trait GclSchemaElement extends GclSymbol {
  @pure def prettyST: ST
}

// A component dispatch. `occurrenceLabelOpt` (concrete syntax `<alias> @ <id>`)
// is required by the resolver when the component fires more than once per
// hyperperiod: it disambiguates the `before`/`after` point names and names the
// occurrence's generated proof fns.
@datatype class GclSchemaComponentRef(val component: Name,
                                      val occurrenceLabelOpt: Option[String],
                                      @hidden val attr: Attr) extends GclSchemaElement {
  @strictpure override def posOpt: Option[Position] = attr.posOpt

  override def string: String = {
    return prettyST.render
  }

  @strictpure def prettyST: ST = occurrenceLabelOpt match {
    case Some(l) => st"""${(component.name, ".")} @ $l"""
    case _ => st"""${(component.name, ".")}"""
  }
}

// Names the place at this position (concrete syntax `label <id>;`). Purely
// naming, never structural: the place exists regardless; a label is needed only
// when a property must bind a point with no unambiguous derived name (e.g.,
// between a join and the next split).
@datatype class GclSchemaLabel(val id: String,
                               @hidden val attr: Attr) extends GclSchemaElement with GclNamedElement {
  @strictpure override def posOpt: Option[Position] = attr.posOpt

  override def string: String = {
    return prettyST.render
  }

  @strictpure def prettyST: ST = st"label $id;"
}

@datatype class GclSchemaSplitJoin(val branches: ISZ[GclSchemaSequence],
                                   @hidden val attr: Attr) extends GclSchemaElement {
  @strictpure override def posOpt: Option[Position] = attr.posOpt

  override def string: String = {
    return prettyST.render
  }

  @pure def prettyST: ST = {
    return (
      st"""split {
          |  ${(for (s <- branches) yield s.prettyST, ",\n")}
          |}""")
  }
}

@datatype class GclSchemaSequence(val elements: ISZ[GclSchemaElement],
                                  @hidden val attr: Attr) extends GclSymbol {
  @strictpure override def posOpt: Option[Position] = attr.posOpt

  override def string: String = {
    return prettyST.render
  }

  @pure def prettyST: ST = {
    return (
      st"""sequence {
          |  ${(for (e <- elements) yield e.prettyST, ";\n")}
          |}""")
  }
}

// A named assertion decoration of the schema. Each property generates its own
// VC set over the shared net; a property's VCs see only its own bindings, and
// unbound points lower to `true` (design D5).
@datatype class GclCompositionProperty(val id: String,
                                       val descriptor: Option[String],
                                       val bindings: ISZ[GclPropertyBinding],
                                       @hidden val attr: Attr) extends GclClause {
  @strictpure override def posOpt: Option[Position] = attr.posOpt

  override def string: String = {
    return prettyST.render
  }

  @pure def prettyST: ST = {
    return (
      st"""property $id $descriptor {
          |  ${(for (b <- bindings) yield b.prettyST, "\n")}
          |}""")
  }
}

// One point-to-assertion binding within a property.
@datatype class GclPropertyBinding(val point: GclSchemaPoint,
                                   val descriptor: Option[String],
                                   val exp: org.sireum.lang.ast.Exp,
                                   @hidden val attr: Attr) extends GclSymbol {
  @strictpure override def posOpt: Option[Position] = attr.posOpt

  override def string: String = {
    return prettyST.render
  }

  @pure def prettyST: ST = {
    return st"""${point.prettyST} $descriptor: ${exp.string};"""
  }
}

// A reference to a schema point. Consecutive elements share a place, so a place
// can have several names (e.g., `after mrm` == `before mhs` == a label there);
// a property may bind a given place through only one of them (resolver lint).
@sig trait GclSchemaPoint extends GclSymbol {
  @pure def prettyST: ST
}

@datatype class GclPointStart(@hidden val attr: Attr) extends GclSchemaPoint {
  @strictpure override def posOpt: Option[Position] = attr.posOpt

  override def string: String = {
    return prettyST.render
  }

  @strictpure def prettyST: ST = st"at START"
}

@datatype class GclPointEnd(@hidden val attr: Attr) extends GclSchemaPoint {
  @strictpure override def posOpt: Option[Position] = attr.posOpt

  override def string: String = {
    return prettyST.render
  }

  @strictpure def prettyST: ST = st"at END"
}

// `at <label>` -- a place or occurrence label declared in the schema.
@datatype class GclPointAt(val label: String,
                           @hidden val attr: Attr) extends GclSchemaPoint {
  @strictpure override def posOpt: Option[Position] = attr.posOpt

  override def string: String = {
    return prettyST.render
  }

  @strictpure def prettyST: ST = st"at $label"
}

// `before <occ>` -- the in-place of a component occurrence (= the branch-entry /
// join-exit place when the occurrence leads a branch or follows a join). `occ`
// is a component alias (unique occurrence) or an occurrence label.
@datatype class GclPointBefore(val occurrence: String,
                               @hidden val attr: Attr) extends GclSchemaPoint {
  @strictpure override def posOpt: Option[Position] = attr.posOpt

  override def string: String = {
    return prettyST.render
  }

  @strictpure def prettyST: ST = st"before $occurrence"
}

// `after <occ>` -- the post-place of a component occurrence.
@datatype class GclPointAfter(val occurrence: String,
                              @hidden val attr: Attr) extends GclSchemaPoint {
  @strictpure override def posOpt: Option[Position] = attr.posOpt

  override def string: String = {
    return prettyST.render
  }

  @strictpure def prettyST: ST = st"after $occurrence"
}

@datatype class GclTODO extends GclSymbol {
  @strictpure override def posOpt: Option[Position] = None()
}

@datatype class GclLib(val containingPackage: Name,
                       val methods: ISZ[GclMethod],
                       @hidden val attr: Attr) extends AnnexLib with GclSymbol {
  @strictpure override def posOpt: Option[Position] = attr.posOpt

  override def string: String = {
    return prettyST.render
  }

  @pure def prettyST: ST = {
    return(
      st"""functions
          |  ${(methods, "\n")}""")
  }
}

@datatype class InfoFlowClause(val id: String,
                               val descriptor: Option[String],
                               val from: ISZ[org.sireum.lang.ast.Exp],
                               val to: ISZ[org.sireum.lang.ast.Exp],
                               @hidden val attr: Attr) extends GclClause {
  @strictpure override def posOpt: Option[Position] = attr.posOpt
}