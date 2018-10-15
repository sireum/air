#!/bin/bash -e
export SCRIPT_HOME=$( cd "$( dirname "$0" )" &> /dev/null && pwd )
$SCRIPT_HOME/prelude.sh
rm -fR runtime
git clone --depth=1 https://github.com/sireum/runtime
$SCRIPT_HOME/sireum slang tipe --verbose -r -s runtime/library:shared:jvm
$SCRIPT_HOME/mill-standalone air.shared.tests
if [ -x "$(command -v node)" ]; then
  $SCRIPT_HOME/mill-standalone air.js.tests
fi
