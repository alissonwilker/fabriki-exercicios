#!/bin/bash

source ./resources/scripts/infra_testes.sh

TIPO_VALIDACAO=$1
EXERCICIO=$2

$1 $2;
 
if [ "$RESULTADO_TESTES" -eq 2 ]; then
	return $RESULTADO_TESTES;
fi

if [ "$TESTES_SUCESSO" -eq "$TOTAL_TESTES" ]; then
	RESULTADO_TESTES=0
	return $RESULTADO_TESTES
else
	RESULTADO_TESTES=1
	return $RESULTADO_TESTES
fi