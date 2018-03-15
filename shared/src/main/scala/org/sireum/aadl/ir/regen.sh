#!/usr/bin/env bash
: ${SIREUM_HOME:=$( cd "$( dirname "$0" )"/../../../../../../../../../../.. &> /dev/null && pwd )}
$SIREUM_HOME/platform/java/bin/java -jar $SIREUM_HOME/bin/sireum.jar util sergen -l $SIREUM_HOME/license.txt -m json,msgpack AadlAST.scala