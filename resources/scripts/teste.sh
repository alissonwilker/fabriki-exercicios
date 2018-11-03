#!/bin/bash

export TESTES_SUCESSO=0
export TOTAL_TESTES=0
export RESULTADO_TESTES=0
source ./resources/scripts/validador.sh executarTestesUnitarios Veiculo

echo $?
echo $TESTES_SUCESSO
echo $TOTAL_TESTES
echo $RESULTADO_TESTES
