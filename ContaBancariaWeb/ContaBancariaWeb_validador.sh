#!/bin/bash

source ./resources/scripts/infra_testes.sh

EXERCICIO=ContaBancariaWeb

cp -R ./$EXERCICIO/src/ ./

executarTestesIntegracao;
