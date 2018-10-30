#!/bin/bash

source ./resources/scripts/infra_testes.sh

TIPO_VALIDACAO=$1
EXERCICIO=$2

$1 $2;
