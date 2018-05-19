#!/bin/bash

source ./resources/scripts/infra_testes.sh

EXERCICIO=ContaBancaria

cp ./$EXERCICIO/ContaBancariaTest.java src/test/java/

executarTestesUnitarios;
