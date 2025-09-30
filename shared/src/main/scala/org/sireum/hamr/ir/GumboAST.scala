// #Sireum
/*
 Copyright (c) 2017-2025, Kansas State University
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

@sig trait GclSymbol {
  def posOpt: Option[Position]
}

@datatype class GclSubclause(val state: ISZ[GclStateVar],
                             val methods: ISZ[GclMethod],
                             val invariants: ISZ[GclInvariant],
                             val initializes: Option[GclInitialize],
                             val integration: Option[GclIntegration],
                             val compute: Option[GclCompute],
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
    val scompute: Option[ST] =
      if (compute.nonEmpty) Some(
        st"""compute
            |  ${compute.get.string}""")
      else None()

    return (
      st"""$sstate
          |$smethods
          |$sinvariants
          |$sintegration
          |$scompute""")
  }
}

@datatype class GclMethod(val method: org.sireum.lang.ast.Stmt.Method) extends GclSymbol {
  @strictpure override def posOpt: Option[Position] = method.posOpt

  override def string: String = {
    return method.string
  }
}

@datatype class GclStateVar(val name: String,
                            val classifier: String,
                            @hidden val attr: Attr) extends GclSymbol {

  @strictpure override def posOpt: Option[Position] = attr.posOpt

  override def string: String = {
    return prettyST.render
  }

  @pure def prettyST: ST = {
    return st"$name: $classifier"
  }
}

@sig trait GclClause extends GclSymbol {
  def id: String

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
                                 @hidden val attr: Attr) extends GclSymbol {
  @strictpure override def posOpt: Option[Position] = attr.posOpt
}

@datatype class GclInitialize(val modifies: ISZ[org.sireum.lang.ast.Exp],
                              val guarantees: ISZ[GclGuarantee],
                              val flows: ISZ[InfoFlowClause],
                              val gumboTables: ISZ[GclGumboTable],
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
    val sgumboTables: Option[ST] =
      if(gumboTables.nonEmpty) Some(
        st"""GumboTables
            ${(gumboTables,"\n")}""")
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
                           val gumboTables: ISZ[GclGumboTable],
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
    val sgumboTables: Option[ST] = //Sierra: var Added
      if (cases.nonEmpty) Some (
        st"""GumboTables(
            ${(gumboTables,"\n")})""")
      else None()

    return (
      st"""$smodifies
          |$sassumes
          |$sguarantees
          |$scases
          |$shandles
          |$sflows
          |$sgumboTables""") // Sierra: Appended tables.
  }
}

@datatype class GclGumboTable(val table: GclNormalTable, // Sierra: Added datatype, table attribute will need to be modified once inverse and nested are added.
                           @hidden val attr: Attr) extends GclSymbol {
  @strictpure override def posOpt: Option[Position] = attr.posOpt
  override def string: String = {
    return prettyST.render
  }

  @pure def prettyST: ST = {
    val stable: ST = // Sierra: table instead of specific as it could be one of three types.
        st"""NormalTable(${(table,"\n ")})"""

    return (
      st"""$stable""")
  }
}

@datatype class GclNormalTable(val id: String, // Sierra: Added datatype
                               val descriptor: Option[String],
                               val horizontalPredicates: ISZ[org.sireum.lang.ast.Exp],
                               val verticalPredicates: ISZ[org.sireum.lang.ast.Exp],
                               val resultRows: ISZ[GclResultRow],
                              @hidden val attr: Attr) extends GclSymbol {
  @strictpure override def posOpt: Option[Position] = attr.posOpt
  override def string: String = {
    return prettyST.render
  }

  @pure def prettyST: ST = {
    val sdescriptor: Option[ST] = // Sierra: table instead of specific as it could be one of three types.
      if(descriptor.nonEmpty) Some(
        st"""$descriptor""")
      else None()
    val shorizontalPredicates: Option[ST] =
      if(horizontalPredicates.nonEmpty) Some(
        st"""HorizontalPredicates(${(horizontalPredicates)})"""
      )
      else None()

    val sverticalPredicates: Option[ST] =
      if(verticalPredicates.nonEmpty) Some(
        st"""verticalPredicates(${(verticalPredicates)})"""
      )
      else None()

    val sresultRows: Option[ST] =
      if(resultRows.nonEmpty) Some(
        st"""verticalPredicates(${(resultRows)})"""
      )
      else None()

    return (
      st"""$id
           $sdescriptor
           $shorizontalPredicates
           $sverticalPredicates
           $sresultRows
        """)
  }
}

@datatype class GclResultRow(val results: ISZ[org.sireum.lang.ast.Exp], // Sierra: Added datatype, table attribute will need to be modified once inverse and nested are added.
                              @hidden val attr: Attr) extends GclSymbol {
  @strictpure override def posOpt: Option[Position] = attr.posOpt
  override def string: String = {
    return prettyST.render
  }

  @pure def prettyST: ST = {
    val sresults: Option[ST] =
      if(results.nonEmpty) Some(
        st"""verticalPredicates(${(results)})"""
      )
      else None()

    return (
      st"""$results""")
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