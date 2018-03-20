#!/bin/bash
set -ev

exercicio=LDP7141

executarEComparar () {

	echo Entrada $1
	java -cp target/classes/ Main < $exercicio_entrada_$1.txt > saida.txt
	diff saida.txt $exercicio_saida_$1.txt
	echo OK!

}

mvn compile;
executarEComparar 01;
executarEComparar 02;
executarEComparar 03;
