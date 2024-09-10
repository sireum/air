// #Sireum

package org.sireum.hamr.ir

import org.sireum._
import org.sireum.lang.{ast => AST}
import org.sireum.message.Position
import SysmlAst._

object SysmlAst {

  @datatype class Id(val value: String, @hidden val attr: Attr) {
    @strictpure def prettyST: ST = st"$value"

    def posOpt: Option[Position] = {
      return attr.posOpt
    }
  }

  @datatype class Name(val ids: ISZ[Id], @hidden val attr: Attr) {
    @strictpure def prettyST: ST = st"${(for (id <- ids) yield id.prettyST, ".")}"

    @strictpure def posOpt: Option[Position] = attr.posOpt
  }

  object TopUnit {
    def empty: TopUnit = {
      return TopUnit(None(), ISZ())
    }
  }
  @datatype class TopUnit(val fileUri: Option[String],
                          val packageBodyElements: ISZ[PackageBodyElement])

  @sig trait AttrNode {
    def posOpt: Option[Position]
  }

  /*
  rulePackageBodyElement:
    rulePackageMember #rulePackageBodyElement1
    | ruleElementFilterMember #rulePackageBodyElement2
    | ruleAliasMember #rulePackageBodyElement3
    | ruleImport #rulePackageBodyElement4;
  */

  @sig trait PackageBodyElement extends AttrNode

  @sig trait DefinitionBodyItem extends AttrNode

  @enum object Visibility {
    "Public"
    "Private"
    "Protected"
  }

  @datatype class FeatureValue (val isBound: B,
                                val isInitial: B,
                                val isDefault: B,
                                val exp: AST.Exp)

  @datatype class EnumeratedValue(val visibility: Visibility.Type,
                                  val identification: Option[Identification],
                                  val specializations: ISZ[FeatureSpecialization],
                                  val definitionBodyItems: ISZ[DefinitionBodyItem])

  @datatype class Import(val visibility: Visibility.Type,
                         val all: B,
                         val name: Name,
                         val star: B,
                         val starStar: B,
                         val annotations: ISZ[AnnotatingElement],
                         @hidden val attr: Attr) extends PackageBodyElement with DefinitionBodyItem {
    @strictpure override def posOpt: Option[Position] = attr.posOpt
  }


  @datatype class AliasMember(val visibility: Visibility.Type,
                              val identification: Option[Identification],
                              val target: Name,
                              val annotations: ISZ[AnnotatingElement],
                              @hidden val attr: Attr) extends PackageBodyElement with DefinitionBodyItem {
    @strictpure override def posOpt: Option[Position] = attr.posOpt
  }


  @datatype class Identification(val shortName: Option[Id],
                                 val name: Option[Id],
                                 @hidden val attr: Attr) extends AttrNode {
    @strictpure override def posOpt: Option[Position] = attr.posOpt
  }

  @enum object FeatureDirection {
    "In"
    "Out"
    "InOut"
  }

  @sig trait PackageMember extends PackageBodyElement

  /****************************************************************
   * C O N N E C T O R S
   *****************************************************************/

  @sig trait ConnectorPart

  @datatype class ConnectorEnd(val reference: ISZ[Name],
                               val tipeOpt: Option[Type],
                               @hidden val resOpt: ResolvedAttr)

  @datatype class BinaryConnectorPart(val src: ConnectorEnd,
                                      val dst: ConnectorEnd) extends ConnectorPart

  @datatype class NaryConnectorPart(val connectorEnds: ISZ[ConnectorEnd]) extends ConnectorPart


  /****************************************************************
   * S P E C I A L I Z A T I O N S
   *****************************************************************/

  @sig trait FeatureSpecialization

  @datatype class TypingsSpecialization(val names: ISZ[Name]) extends FeatureSpecialization

  @datatype class SubsettingsSpecialization(val subsettings: ISZ[Name]) extends FeatureSpecialization

  @datatype class ReferencesSpecialization(val references: ISZ[Name]) extends FeatureSpecialization

  @datatype class RedefinitionsSpecialization(val references: ISZ[Name]) extends FeatureSpecialization

  /****************************************************************
   * D E F I N I T I O N S
   *****************************************************************/

  @sig trait DefinitionMember extends DefinitionBodyItem

  @sig trait DefinitionElement extends DefinitionMember with PackageMember {
    def visibility: Visibility.Type
    def identification: Option[Identification]
  }

  @datatype class DefinitionPrefix(val isAbstract: B,
                                   val isVariation: B)

  @datatype class Package (val visibility: Visibility.Type,
                           val identification: Option[Identification],
                           val packageElements: ISZ[PackageBodyElement],
                           @hidden val attr: Attr) extends DefinitionElement {

    @strictpure override def posOpt: Option[Position] = attr.posOpt
  }

  @datatype class AttributeDefinition(val visibility: Visibility.Type,
                                      val defPrefix: DefinitionPrefix,
                                      val identification: Option[Identification],
                                      val subClassifications: ISZ[Name],
                                      val parents: ISZ[Type.Named],
                                      val bodyItems: ISZ[DefinitionBodyItem],
                                      @hidden val attr: Attr) extends DefinitionElement {
    @strictpure override def posOpt: Option[Position] = attr.posOpt
  }

  @datatype class OccurrenceDefinitionPrefix(val isAbstract: B,
                                             val isVariation: B)

  @datatype class AllocationDefinition(val visibility: Visibility.Type,
                                       val occurrenceDefPrefix: OccurrenceDefinitionPrefix,
                                       val identification: Option[Identification],
                                       val subClassifications: ISZ[Name],
                                       val parents: ISZ[Type.Named],
                                       val bodyItems: ISZ[DefinitionBodyItem],
                                       @hidden val attr: Attr) extends DefinitionElement {
    @strictpure override def posOpt: Option[Position] = attr.posOpt
  }

  @datatype class ConnectionDefinition(val visibility: Visibility.Type,
                                       val occurrenceDefPrefix: OccurrenceDefinitionPrefix,
                                       val identification: Option[Identification],
                                       val subClassifications: ISZ[Name],
                                       val parents: ISZ[Type.Named],
                                       val bodyItems: ISZ[DefinitionBodyItem],
                                       @hidden val attr: Attr) extends DefinitionElement {
    @strictpure override def posOpt: Option[Position] = attr.posOpt
  }

  @datatype class EnumerationDefinition(val visibility: Visibility.Type,
                                        val identification: Option[Identification],
                                        val subClassifications: ISZ[Name],
                                        val annotations: ISZ[AnnotatingElement],
                                        val enumValues: ISZ[EnumeratedValue],
                                        @hidden val attr: Attr) extends DefinitionElement {
    @strictpure override def posOpt: Option[Position] = attr.posOpt
  }

  @datatype class PartDefinition(val visibility: Visibility.Type,
                                 val occurrenceDefPrefix: OccurrenceDefinitionPrefix,
                                 val identification: Option[Identification],
                                 val subClassifications: ISZ[Name],
                                 val parents: ISZ[Type.Named],
                                 val bodyItems: ISZ[DefinitionBodyItem],
                                 @hidden val attr: Attr) extends DefinitionElement {
    @strictpure override def posOpt: Option[Position] = attr.posOpt
  }

  @datatype class PortDefinition(val visibility: Visibility.Type,
                                 val defPrefix: DefinitionPrefix,
                                 val identification: Option[Identification],
                                 val subClassifications: ISZ[Name],
                                 val parents: ISZ[Type.Named],
                                 val bodyItems: ISZ[DefinitionBodyItem],
                                 @hidden val attr: Attr) extends DefinitionElement {
    @strictpure override def posOpt: Option[Position] = attr.posOpt
  }

  @datatype class MetadataDefinition(val isAbstract: B,
                                     val visibility: Visibility.Type,
                                     val identification: Option[Identification],
                                     val subClassifications: ISZ[Name],
                                     val bodyItems: ISZ[DefinitionBodyItem],
                                     @hidden val attr: Attr) extends DefinitionElement {
    @strictpure override def posOpt: Option[Position] = attr.posOpt
  }

  /****************************************************************
   * U S A G E S
   *****************************************************************/

  /*
  ruleUsageElement:
    ruleNonOccurrenceUsageElement #ruleUsageElement1
    | ruleOccurrenceUsageElement #ruleUsageElement2;
  */

  @sig trait UsageElement extends PackageMember {
    def commonUsageElements: CommonUsageElements
  }

  @datatype class CommonUsageElements (val visibility: Visibility.Type,
                                       val identification: Option[Identification],
                                       val specializations: ISZ[FeatureSpecialization],
                                       val featureValue: Option[FeatureValue],
                                       val definitionBodyItems: ISZ[DefinitionBodyItem],
                                       val tipeOpt: Option[Type],
                                       @hidden val attr: ResolvedAttr)
  // Non-Occurrence Usages

  /* ruleNonOccurrenceUsageElement:
    ruleDefaultReferenceUsage #ruleNonOccurrenceUsageElement1
    | ruleReferenceUsage #ruleNonOccurrenceUsageElement2
    | ruleAttributeUsage #ruleNonOccurrenceUsageElement3
    | ruleEnumerationUsage #ruleNonOccurrenceUsageElement4
    | ruleBindingConnectorAsUsage #ruleNonOccurrenceUsageElement5
    | ruleSuccessionAsUsage #ruleNonOccurrenceUsageElement6
    | ruleExtendedUsage #ruleNonOccurrenceUsageElement7;
  */

  @sig trait NonOccurrenceUsageMember extends DefinitionBodyItem

  @sig trait NonOccurrenceUsageElement extends NonOccurrenceUsageMember with UsageElement

  @datatype class RefPrefix(val direction: Option[FeatureDirection.Type],
                            val isAbstract: B,
                            val isVariation: B,
                            val isReadOnly: B,
                            val isDerived: B,
                            val isEnd: B)

  @datatype class UsagePrefix(val refPrefix: RefPrefix,

                              // basic usage prefix
                              val isRef: B,
                              val usageExtensions: ISZ[Name])

  @datatype class AttributeUsage(val prefix: UsagePrefix,

                                 val commonUsageElements: CommonUsageElements) extends NonOccurrenceUsageElement {
    @strictpure override def posOpt: Option[Position] = commonUsageElements.attr.posOpt
  }

  @datatype class ReferenceUsage(val prefix: RefPrefix,

                                 val commonUsageElements: CommonUsageElements) extends NonOccurrenceUsageElement {

    @strictpure override def posOpt: Option[Position] = commonUsageElements.attr.posOpt
  }

  // Occurrence Usages
  /*
  ruleOccurrenceUsageElement:
    ruleStructureUsageElement #ruleOccurrenceUsageElement1
    | ruleBehaviorUsageElement #ruleOccurrenceUsageElement2;
  */

  @sig trait OccurrenceUsageMember extends DefinitionBodyItem

  @sig trait OccurrenceUsageElement extends OccurrenceUsageMember with UsageElement

  @sig trait StructureUsageElement extends OccurrenceUsageElement

  @datatype class OccurrenceUsagePrefix(val refPrefix: RefPrefix,

                                        val isRef: B,
                                        val isIndividual: B,
                                        val isSnapshot: B,
                                        val isTimeslice: B,
                                        val usageExtensions: ISZ[Name])

  @datatype class AllocationUsage(val occurrenceUsagePrefix: OccurrenceUsagePrefix,
                                  val commonUsageElements: CommonUsageElements,

                                  val connectorPart: Option[ConnectorPart]) extends StructureUsageElement {
    @strictpure override def posOpt: Option[Position] = commonUsageElements.attr.posOpt
  }

  @datatype class ConnectionUsage(val occurrenceUsagePrefix: OccurrenceUsagePrefix,
                                  val commonUsageElements: CommonUsageElements,

                                  val connectorPart: Option[ConnectorPart]) extends StructureUsageElement {
    @strictpure override def posOpt: Option[Position] = commonUsageElements.attr.posOpt
  }

  @datatype class ItemUsage(val occurrenceUsagePrefix: OccurrenceUsagePrefix,
                            val commonUsageElements: CommonUsageElements) extends StructureUsageElement {
    @strictpure override def posOpt: Option[Position] = commonUsageElements.attr.posOpt
  }

  @datatype class PartUsage(val occurrenceUsagePrefix: OccurrenceUsagePrefix,
                            val commonUsageElements: CommonUsageElements) extends StructureUsageElement {
    @strictpure override def posOpt: Option[Position] = commonUsageElements.attr.posOpt
  }

  @datatype class PortUsage(val occurrenceUsagePrefix: OccurrenceUsagePrefix,
                            val commonUsageElements: CommonUsageElements) extends StructureUsageElement {
    @strictpure override def posOpt: Option[Position] = commonUsageElements.attr.posOpt
  }

  //@sig trait BehaviorUsageElement extends OccurrenceUsageElement


  /****************************************************************
   * A N N O T A T I O N S
   *****************************************************************/

  /*
  ruleAnnotatingElement:
    ruleComment #ruleAnnotatingElement1
    | ruleDocumentation #ruleAnnotatingElement2
    | ruleTextualRepresentation #ruleAnnotatingElement3
    | ruleMetadataUsage #ruleAnnotatingElement4;
  */

  @sig trait AnnotatingElement extends DefinitionElement {
    def comment: String
  }

  @datatype class Comment(val visibility: Visibility.Type,
                          val identification: Option[Identification],
                          val abouts: ISZ[Name],
                          val locale: Option[String],
                          val comment: String,
                          @hidden val attr: Attr) extends AnnotatingElement {
    @strictpure override def posOpt: Option[Position] = attr.posOpt
  }

  @datatype class Documentation(val visibility: Visibility.Type,
                                val identification: Option[Identification],
                                val locale: Option[String],
                                val comment: String,
                                @hidden val attr: Attr) extends AnnotatingElement {
    @strictpure override def posOpt: Option[Position] = attr.posOpt
  }

  @datatype class TextualRepresentation(val visibility: Visibility.Type,
                                        val identification: Option[Identification],
                                        val language: String,
                                        val comment: String,
                                        @hidden val attr: Attr) extends AnnotatingElement {
    @strictpure override def posOpt: Option[Position] = attr.posOpt
  }

  @datatype class GumboAnnotation(val gumboNode: GclSymbol) extends AnnotatingElement {
    @strictpure override def visibility: Visibility.Type = Visibility.Public
    @strictpure override def identification: Option[Identification] = None()
    @strictpure override def comment: String = ""
    @pure override def posOpt: Option[Position] = {
      return gumboNode.posOpt
    }
  }
}

@datatype class Attr(val posOpt: Option[Position])

@datatype class ResolvedAttr(@hidden val posOpt: Option[Position],
                             val resOpt: Option[ResolvedInfo],
                             val typedOpt: Option[Typed])

@datatype trait ResolvedInfo {
  def qname: ISZ[String]
}


object ResolvedInfo {
  @datatype class Package(val name: ISZ[String]) extends ResolvedInfo {
    @strictpure override def qname: ISZ[String] = name
  }

  @datatype class Enum(val name: ISZ[String]) extends ResolvedInfo {
    @strictpure override def qname: ISZ[String] = name
  }

  @datatype class EnumElement(val owner: ISZ[String], val name: String, val ordinal: Z) extends ResolvedInfo {
    @strictpure override def qname: ISZ[String] = owner :+ name
  }


  @datatype class AllocationUsage(val owner: ISZ[String], val name: String) extends ResolvedInfo {
    @strictpure override def qname: ISZ[String] = owner :+ name
  }

  @datatype class AttributeUsage(val owner: ISZ[String], val name: String) extends ResolvedInfo {
    @strictpure override def qname: ISZ[String] = owner :+ name
  }

  @datatype class ConnectionUsage(val owner: ISZ[String], val name: String) extends ResolvedInfo {
    @strictpure override def qname: ISZ[String] = owner :+ name
  }

  @datatype class ItemUsage(val owner: ISZ[String], val name: String) extends ResolvedInfo {
    @strictpure override def qname: ISZ[String] = owner :+ name
  }

  @datatype class PartUsage(val owner: ISZ[String], val name: String) extends ResolvedInfo {
    @strictpure override def qname: ISZ[String] = owner :+ name
  }


  @datatype class PortUsage(val owner: ISZ[String], val name: String) extends ResolvedInfo {
    @strictpure override def qname: ISZ[String] = owner :+ name
  }


  @datatype class ReferenceUsage(val owner: ISZ[String], val name: String) extends ResolvedInfo {
    @strictpure override def qname: ISZ[String] = owner :+ name
  }
}

@datatype trait Type {

  @strictpure def posOpt: Option[Position]

  @strictpure def typedOpt: Option[Typed]

  @strictpure def typed(t: Typed): Type

  @strictpure def prettyST: ST

  override def string: String = {
    typedOpt match {
      case Some(t) => return t.string
      case _ => return prettyST.render
    }
  }
}

object Type {
  @datatype class Named(val name: Name, @hidden attr: TypedAttr) extends Type {

    @strictpure override def posOpt: Option[Position] = attr.posOpt
    @strictpure override def typedOpt: Option[Typed] = attr.typedOpt
    @strictpure override def typed(t: Typed): Type.Named = this (name, attr(typedOpt = Some(t)))

    @pure def isEqual(other: Named): B = {
      (typedOpt, other.typedOpt) match {
        case (Some(t1), Some(t2)) => return t1 == t2
        case _ => return name == other.name
      }
    }

    @pure override def hash: Z = {
      typedOpt match {
        case Some(t) => return t.hash
        case _ => return (name).hash
      }
    }

    @strictpure override def prettyST: ST = {
      st"${(for (id <- name.ids) yield id.value, ".")}"
    }
  }
}

@datatype class TypedAttr(val posOpt: Option[Position], val typedOpt: Option[Typed])
