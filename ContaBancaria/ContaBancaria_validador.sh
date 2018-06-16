#!/bin/bash

source ./resources/scripts/infra_testes.sh

EXERCICIO=ContaBancaria

du -a src
cp -R ./$EXERCICIO/src/ ./
du -a src

executarTestesUnitarios;
