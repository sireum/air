// #Sireum
package org.sireum.hamr.ir.util

import org.sireum._
import org.sireum.hamr.ir.ComponentCategory

object AadlUtil {

  val validSubcomponents: Map[ComponentCategory.Type, ISZ[ComponentCategory.Type]] = Map.empty[ComponentCategory.Type, ISZ[ComponentCategory.Type]] ++
    ISZ(
      ComponentCategory.Abstract ~> ISZ(
        ComponentCategory.Data,
        ComponentCategory.Subprogram,
        ComponentCategory.SubprogramGroup,
        ComponentCategory.Thread,
        ComponentCategory.ThreadGroup,
        ComponentCategory.Process,
        ComponentCategory.VirtualProcessor,
        ComponentCategory.Memory,
        ComponentCategory.Bus,
        ComponentCategory.VirtualBus,
        ComponentCategory.Device,
        ComponentCategory.System,
        ComponentCategory.Abstract
      ),
      ComponentCategory.Bus ~> ISZ(
        ComponentCategory.VirtualBus,
        ComponentCategory.Abstract
      ),
      ComponentCategory.Data ~> ISZ(
        ComponentCategory.Data,
        ComponentCategory.Subprogram,
        ComponentCategory.Abstract
      ),
      ComponentCategory.Device ~> ISZ(
        ComponentCategory.Data,
        ComponentCategory.Bus,
        ComponentCategory.VirtualBus,
        ComponentCategory.Abstract),
      ComponentCategory.Memory ~> ISZ(
        ComponentCategory.Memory,
        ComponentCategory.Bus,
        ComponentCategory.Abstract
      ),
      ComponentCategory.Process ~> ISZ(
        ComponentCategory.Data,
        ComponentCategory.Subprogram,
        ComponentCategory.SubprogramGroup,
        ComponentCategory.Thread,
        ComponentCategory.ThreadGroup,
        ComponentCategory.Abstract
      ),
      ComponentCategory.Processor ~> ISZ(
        ComponentCategory.VirtualProcessor,
        ComponentCategory.Memory,
        ComponentCategory.Bus,
        ComponentCategory.VirtualBus,
        ComponentCategory.Abstract
      ),
      ComponentCategory.Subprogram ~> ISZ(
        ComponentCategory.Data,
        ComponentCategory.Subprogram,
        ComponentCategory.Abstract
      ),
      ComponentCategory.System ~> ISZ(
        ComponentCategory.Data,
        ComponentCategory.Subprogram,
        ComponentCategory.SubprogramGroup,
        ComponentCategory.Process,
        ComponentCategory.Processor,
        ComponentCategory.VirtualProcessor,
        ComponentCategory.Memory,
        ComponentCategory.Bus,
        ComponentCategory.VirtualBus,
        ComponentCategory.Device,
        ComponentCategory.System,
        ComponentCategory.Abstract
      ),
      ComponentCategory.Thread ~> ISZ(
        ComponentCategory.Data,
        ComponentCategory.Subprogram,
        ComponentCategory.SubprogramGroup,
        ComponentCategory.Abstract
      ),
      ComponentCategory.ThreadGroup ~> ISZ(
        ComponentCategory.Data,
        ComponentCategory.Subprogram,
        ComponentCategory.SubprogramGroup,
        ComponentCategory.Thread,
        ComponentCategory.ThreadGroup,
        ComponentCategory.Abstract
      ),
      ComponentCategory.VirtualBus ~> ISZ(
        ComponentCategory.VirtualBus,
        ComponentCategory.Abstract
      ),
      ComponentCategory.VirtualProcessor ~> ISZ(
        ComponentCategory.VirtualProcessor,
        ComponentCategory.VirtualBus,
        ComponentCategory.Abstract
      )
    )

  def isValidSubcomponent(parent: ComponentCategory.Type, subcomponent: ComponentCategory.Type): B = {
    return ops.ISZOps(validSubcomponents.get(parent).get).contains(subcomponent)
  }
}
