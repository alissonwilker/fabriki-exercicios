#!/bin/bash
set -ev

nomeClasse=$1

executarEComparar () {

	echo Entrada $2
	java -cp ../target/classes/ $nomeClasse < $1_entrada_$2.txt > saida.txt
	diff saida.txt $1_saida_$2.txt
	echo OK!

}

mvn compile;
executarEComparar $nomeClasse 01;
executarEComparar $nomeClasse 02;

