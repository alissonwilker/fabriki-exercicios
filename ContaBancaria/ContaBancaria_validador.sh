#!/bin/bash

source ./resources/scripts/infra_testes.sh

EXERCICIO=ContaBancaria

du
cp -R ./$EXERCICIO/src/ src/
du

executarTestesUnitarios;
