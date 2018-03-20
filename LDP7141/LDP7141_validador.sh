#!/bin/bash
set -ev

EXERCICIO=LDP7141

executarEComparar () {
	echo Entrada $1
	java -cp ../target/classes/ Main < $1_entrada_$2.txt > saida.txt
	diff saida.txt $1_saida_$2.txt
	echo OK!

}

mvn compile;
cd $EXERCICIO
executarEComparar $EXERCICIO 01;
executarEComparar $EXERCICIO 02;
executarEComparar $EXERCICIO 03;
