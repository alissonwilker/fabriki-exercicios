#!/bin/bash

source ./resources/scripts/infra_testes.sh

EXERCICIO=ContaBancaria

du -a src
du -a target
cp -R ./$EXERCICIO/src/ src/
du -a src
du -a target 

executarTestesUnitarios;
