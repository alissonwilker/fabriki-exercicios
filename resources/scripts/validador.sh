#!/bin/bash

source ./resources/scripts/infra_testes.sh

FILES_ZIP_URL=$1
TIPO_VALIDACAO=$2
EXERCICIO=$3

if [ $FILES_ZIP_URL ]; then
  curl -o files.zip -L $1;
  unzip files.zip;
fi

$2 $3;
