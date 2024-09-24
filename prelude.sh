#!/bin/bash -e
export SCRIPT_HOME=$( cd "$( dirname "$0" )" &> /dev/null && pwd )
cd ${SCRIPT_HOME}
CURL='curl -c /dev/null -JLo'
if [ ! -e sireum ]; then
  ${CURL} sireum.jar https://github.com/sireum/kekinian/releases/download/dev/sireum.jar
fi
if [ ! -e mill-standalone ]; then
  ${CURL} mill-standalone https://github.com/sireum/rolling/releases/download/mill/standalone
  chmod +x mill-standalone
fi
if [ ! -e versions.properties ]; then
  ${CURL} versions.properties https://raw.githubusercontent.com/sireum/kekinian/master/versions.properties
fi
rm -fR runtime
git clone --depth=1 https://github.com/sireum/runtime
rm -fR slang
git clone --depth=1 https://github.com/sireum/slang
