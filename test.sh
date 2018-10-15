#!/bin/bash -e
export SCRIPT_HOME=$( cd "$( dirname "$0" )" &> /dev/null && pwd )
cd $SCRIPT_HOME
./prelude.sh
./sireum slang tipe --verbose -r -s runtime/library:shared:jvm
rm -fR out
./mill-standalone air.shared.tests
if [ -x "$(command -v node)" ]; then
  ./mill-standalone air.js.tests
fi
