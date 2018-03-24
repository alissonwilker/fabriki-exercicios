#!/bin/bash
set -ev

EXERCICIO=ContaBancaria

mkdir -p src/test/java/
cp ./$EXERCICIO/ContaBancariaTest.java src/test/java/
mvn clean test;
