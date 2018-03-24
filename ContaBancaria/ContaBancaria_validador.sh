#!/bin/bash
set -ev

EXERCICIO=ContaBancaria

sudo mkdir -p src/test/java/
cp ./$EXERCICIO/ContaBancariaTest.java src/test/java/
mvn clean test;
