#!/bin/bash -e
export SCRIPT_HOME=$( cd "$( dirname "$0" )" &> /dev/null && pwd )
cd ${SCRIPT_HOME}
CURL='curl -c /dev/null -JLso'
if [ ! -e sireum ]; then
  ${CURL} sireum http://files.sireum.org/sireum
  chmod +x sireum
fi
if [ ! -e mill-standalone ]; then
  ${CURL} mill-standalone http://files.sireum.org/mill-standalone
  chmod +x mill-standalone
fi
if [ ! -e versions.properties ]; then
  ${CURL} versions.properties https://raw.githubusercontent.com/sireum/kekinian/master/versions.properties
fi
rm -fR runtime
git clone --depth=1 https://github.com/sireum/runtime
