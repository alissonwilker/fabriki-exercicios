#!/bin/bash

source ./resources/scripts/infra_testes.sh

EXERCICIO=ContaBancariaWebStateful

cp -R ./$EXERCICIO/src/* src/

executarTestesIntegracao;