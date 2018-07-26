/*
 Copyright (c) 2018, Kansas State University
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

package org.sireum.aadl.ir

import java.util.{List => JList}
import org.sireum._

class AadlASTFactory {

  val ComponentCategoryMap: scala.collection.Map[AadlASTJavaFactory.ComponentCategory, ComponentCategory.Type] =
    scala.collection.Map(
      (AadlASTJavaFactory.ComponentCategory.Abstract, ComponentCategory.Abstract),
      (AadlASTJavaFactory.ComponentCategory.Bus, ComponentCategory.Bus),
      (AadlASTJavaFactory.ComponentCategory.Data, ComponentCategory.Data),
      (AadlASTJavaFactory.ComponentCategory.Device, ComponentCategory.Device),
      (AadlASTJavaFactory.ComponentCategory.Memory, ComponentCategory.Memory),
      (AadlASTJavaFactory.ComponentCategory.Process, ComponentCategory.Process),
      (AadlASTJavaFactory.ComponentCategory.Processor, ComponentCategory.Processor),
      (AadlASTJavaFactory.ComponentCategory.Subprogram, ComponentCategory.Subprogram),
      (AadlASTJavaFactory.ComponentCategory.SubprogramGroup, ComponentCategory.SubprogramGroup),
      (AadlASTJavaFactory.ComponentCategory.Thread, ComponentCategory.Thread),
      (AadlASTJavaFactory.ComponentCategory.ThreadGroup, ComponentCategory.ThreadGroup),
      (AadlASTJavaFactory.ComponentCategory.VirtualBus, ComponentCategory.VirtualBus),
      (AadlASTJavaFactory.ComponentCategory.VirtualProcessor, ComponentCategory.VirtualProcessor)
    )

  def aadl(components: JList[Component], errorLib: JList[Emv2Library]): Aadl =
    Aadl(isz(components), isz(errorLib))

  def name(name: JList[Predef.String]): Name =
    Name(isz(name).map(s => String(s)))

  def component(
    identifier: Name,
    category: AadlASTJavaFactory.ComponentCategory,
    classifier: Classifier,
    features: JList[Feature],
    subComponents: JList[Component],
    connections: JList[Connection],
    connectionInstances: JList[ConnectionInstance],
    properties: JList[Property],
    flows: JList[Flow],
    modes: JList[Mode],
    annexes: JList[Annex]
  ): Component =
    Component(
      identifier,
      ComponentCategoryMap(category),
      if (classifier != null) Some(classifier) else None(),
      isz(features),
      isz(subComponents),
      isz(connections),
      isz(connectionInstances),
      isz(properties),
      isz(flows),
      isz(modes),
      isz(annexes)
    )

  def isz[T](l: JList[T]): ISZ[T] = {
    import scala.collection.JavaConverters._
    ISZ(l.asScala: _*)
  }

}
