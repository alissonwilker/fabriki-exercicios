#!/bin/bash
set -ev

EXERCICIO=multiplicacao_matrizes

executarEComparar () {
	echo Entrada $2
	java -cp ../target/classes/ Main < $1_entrada_$2.txt > saida.txt
	diff saida.txt $1_saida_$2.txt
	echo OK!

}

mvn compile;
cd $EXERCICIO
executarEComparar $nomeClasse 01;
executarEComparar $nomeClasse 02;

