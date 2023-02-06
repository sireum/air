::/*#! 2> /dev/null                                                                                         #
@ 2>/dev/null # 2>nul & echo off & goto BOF                                                                 #
export SIREUM_HOME=$(cd -P $(dirname "$0")/.. && pwd -P)                                                    #
if [ ! -z ${SIREUM_PROVIDED_SCALA++} ]; then                                                                #
  SIREUM_PROVIDED_JAVA=true                                                                                 #
fi                                                                                                          #
"${SIREUM_HOME}/bin/init.sh" || exit $?                                                                     #
if [ -n "$COMSPEC" -a -x "$COMSPEC" ]; then                                                                 #
  export SIREUM_HOME=$(cygpath -C OEM -w -a ${SIREUM_HOME})                                                 #
  if [ -z ${SIREUM_PROVIDED_JAVA++} ]; then                                                                 #
    export PATH="${SIREUM_HOME}/bin/win/java":"${SIREUM_HOME}/bin/win/z3":"$PATH"                           #
    export PATH="$(cygpath -C OEM -w -a ${JAVA_HOME}/bin)":"$(cygpath -C OEM -w -a ${Z3_HOME}/bin)":"$PATH" #
  fi                                                                                                        #
elif [ "$(uname)" = "Darwin" ]; then                                                                        #
  if [ -z ${SIREUM_PROVIDED_JAVA++} ]; then                                                                 #
    export PATH="${SIREUM_HOME}/bin/mac/java/bin":"${SIREUM_HOME}/bin/mac/z3/bin":"$PATH"                   #
  fi                                                                                                        #
elif [ "$(expr substr $(uname -s) 1 5)" = "Linux" ]; then                                                   #
  if [ -z ${SIREUM_PROVIDED_JAVA++} ]; then                                                                 #
    if [ "$(uname -m)" = "aarch64" ]; then                                                                  #
      export PATH="${SIREUM_HOME}/bin/linux/arm/java/bin":"$PATH"                                           #
    else                                                                                                    #
      export PATH="${SIREUM_HOME}/bin/linux/java/bin":"${SIREUM_HOME}/bin/linux/z3/bin":"$PATH"             #
    fi                                                                                                      #
  fi                                                                                                        #
fi                                                                                                          #
if [ -f "$0.com" ] && [ "$0.com" -nt "$0" ]; then                                                           #
  exec "$0.com" "$@"                                                                                        #
else                                                                                                        #
  rm -fR "$0.com"                                                                                           #
  exec "${SIREUM_HOME}/bin/sireum" slang run -n "$0" "$@"                                                   #
fi                                                                                                          #
:BOF
setlocal
set SIREUM_HOME=%~dp0../
call "%~dp0init.bat" || exit /B %errorlevel%
if defined SIREUM_PROVIDED_SCALA set SIREUM_PROVIDED_JAVA=true
if not defined SIREUM_PROVIDED_JAVA set PATH=%~dp0win\java\bin;%~dp0win\z3\bin;%PATH%
set NEWER=False
if exist %~dpnx0.com for /f %%i in ('powershell -noprofile -executionpolicy bypass -command "(Get-Item %~dpnx0.com).LastWriteTime -gt (Get-Item %~dpnx0).LastWriteTime"') do @set NEWER=%%i
if "%NEWER%" == "True" goto native
del "%~dpnx0.com" > nul 2>&1
"%~dp0sireum.bat" slang run -n "%0" %*
exit /B %errorlevel%
:native
%~dpnx0.com %*
exit /B %errorlevel%
::!#*/
// #Sireum

import org.sireum._

val sireumHome = Os.path(Os.env("SIREUM_HOME").get)
val sireum = sireumHome / "bin" / (if(Os.isWin) "sireum.bat" else "sireum")

val home = Os.slashDir.up

def usage(): Unit = {
  println(
    st"""AIR /build
        |Usage: (regen-air)*
      """.render)
}

def regenAir(): Unit = {
  val airRootPath = home
  val airPackagePath = airRootPath / "shared" / "src" / "main" / "scala" / "org" / "sireum" / "hamr" / "ir"
  val airAsts = ISZ[String]("AadlAST.scala", "BlessAST.scala", "Emv2AST.scala", "GumboAST.scala", "SmfAST.scala").map((m: String) => (airPackagePath / m).value)

  val slangHome: Os.Path = {
    var cand = airRootPath.up.up / "slang"
    if(!cand.exists) {
      proc"git clone https://github.com/sireum/slang.git".run()
      cand = airRootPath / "slang"
    }
    if(!cand.exists) {
      eprintln("Could not locate slang source directory")
      Os.exit(-1)
    }
    cand
  }

  val sireumv = Os.home / "devel" / "sireum" / "kekinian" / "bin" / "sireum"
  val slangPath = slangHome / "ast" / "shared" / "src" / "main" / "scala" / "org" / "sireum" / "lang" / "ast"
  val slangAsts = ISZ[String]("AST.scala", "Typed.scala").map((m: String) => (slangPath / m).value)

  Os.proc(ISZ[String](sireumv.value, "tools", "trafo", "-l", s"${airRootPath / "license.txt"}",
    "-m", "immutable,mutable") ++ airAsts ++ slangAsts).at(airPackagePath).console.run()
  Os.proc(ISZ[String](sireumv.value, "tools", "sergen", "-p", "org.sireum.hamr.ir", "-l", s"${airRootPath / "license.txt"}",
    "-m", "json,msgpack") ++ airAsts ++ slangAsts).at(airPackagePath).console.run()
}

for(i <- 0 until Os.cliArgs.size) {
  Os.cliArgs(i) match {
    case string"regen-air" => regenAir()
    case cmd =>
      usage()
      eprintln(s"Unrecognized command: $cmd")
      Os.exit(-1)
  }
}