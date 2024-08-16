// #Sireum
package org.sireum.hamr.ir

import org.sireum._

@datatype trait Typed {

  @pure override def hash: Z = {
    this match {
      case t: Typed.Package => return (t.name.hash)
      case t: Typed.Name => return t.ids.hash
      case t: Typed.Enum => return t.name().hash
    }
  }

  @pure def isEqual(other: Typed): B = {
    (this, other) match {
      case (t1: Typed.Name, t2: Typed.Name) =>
        if (t1.ids != t2.ids) {
          return F
        }
        return T
      case (t1: Typed.Package, t2: Typed.Package) => return t1.name == t2.name
      case (t1: Typed.Enum, t2: Typed.Enum) =>
        return t1.name == t2.name
      case _ =>
        return F
    }
  }
}

object Typed {
  @datatype class Package(val name: ISZ[String]) extends Typed {}

  @datatype class Name(val ids: ISZ[String]) extends Typed {}

  @datatype class Enum(val name: ISZ[String]) extends Typed {}
}