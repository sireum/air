#!/bin/bash -e
export SCRIPT_HOME=$( cd "$( dirname "$0" )" &> /dev/null && pwd )
rm -fR mill-standalone versions.properties out sireum
curl -Lo sireum http://files.sireum.org/sireum
chmod +x sireum
$SCRIPT_HOME/sireum slang tipe --verbose -s .
curl -Lo mill-standalone http://files.sireum.org/mill-standalone
chmod +x mill-standalone
curl -Lo versions.properties https://raw.githubusercontent.com/sireum/kekinian/master/versions.properties
$SCRIPT_HOME/mill-standalone all air.shared.tests
if [ -x "$(command -v node)" ]; then
  $SCRIPT_HOME/mill-standalone air.js.tests
fi
