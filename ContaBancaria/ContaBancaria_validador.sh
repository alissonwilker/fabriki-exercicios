#!/bin/bash

source ./resources/scripts/infra_testes.sh

EXERCICIO=ContaBancaria

cp -R ./$EXERCICIO/src/ ./

executarTestesUnitarios;
