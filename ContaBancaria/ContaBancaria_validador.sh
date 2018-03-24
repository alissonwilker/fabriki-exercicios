#!/bin/bash
set -ev

EXERCICIO=ContaBancaria

cp ./$EXERCICIO/ContaBancariaTest.java src/test/java/
mvn clean test;
