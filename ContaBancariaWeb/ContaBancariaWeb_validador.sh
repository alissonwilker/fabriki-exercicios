#!/bin/bash

source ./resources/scripts/infra_testes.sh

EXERCICIO=ContaBancariaWeb

cp ./$EXERCICIO/ContaBancariaTest.java src/test/java/
cp ./$EXERCICIO/ContaBancariaWebITCase.java src/integration-test/java/
cp ./$EXERCICIO/index.html src/main/webapp/

executarTestesIntegracao;