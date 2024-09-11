::/*#! 2> /dev/null                                   #
@ 2>/dev/null # 2>nul & echo off & goto BOF           #
if [ -z "${SIREUM_HOME}" ]; then                      #
  echo "Please set SIREUM_HOME env var"               #
  exit -1                                             #
fi                                                    #
exec "${SIREUM_HOME}/bin/sireum" slang run "$0" "$@"  #
:BOF
setlocal
if not defined SIREUM_HOME (
  echo Please set SIREUM_HOME env var
  exit /B -1
)
"%SIREUM_HOME%\bin\sireum.bat" slang run "%0" %*
exit /B %errorlevel%
::!#*/
// #Sireum

import org.sireum._
import org.sireum.project.ProjectUtil._
import org.sireum.project.Project

val library = "library"
val slangTipe = "slang-tipe"

val air = "hamr-air"

val homeDir = Os.slashDir.up.canon

val (airShared, airJvm) = moduleSharedJvmPub(
  baseId = air,
  baseDir = homeDir,
  sharedDeps = sharedId(library) :+ slangTipe,
  sharedIvyDeps = ISZ(),
  jvmDeps = ISZ(library),
  jvmIvyDeps = ISZ(),
  pubOpt = pub(
    desc = "HAMR AADL Intermediate Representation (AIR)",
    url = "github.com/sireum/air",
    licenses = bsd2,
    devs = ISZ(jasonBelt, thari)
  )
)

val project = Project.empty + airShared + airJvm

projectCli(Os.cliArgs, project)
