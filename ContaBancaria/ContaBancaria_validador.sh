#!/bin/bash
set -ev

EXERCICIO=ContaBancaria

cp ./$EXERCICIO/ContaBancariaTest.java src/
mvn clean test;
