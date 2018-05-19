#!/bin/bash
set -ev

EXERCICIO=ContaBancariaWeb

mkdir -p src/test/java/
cp ./$EXERCICIO/ContaBancariaTest.java src/test/java/
cp ./$EXERCICIO/ContaBancariaWebITCase.java src/integration-test/java/

mvn clean install verify -P wildfly-managed;
