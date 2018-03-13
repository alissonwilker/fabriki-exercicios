#!/bin/bash
set -ev

nomeClasse=$1

executarEComparar () {

	echo Entrada $2
	java -cp target/classes/ $nomeClasse < $1_entrada_$2.txt > saida.txt
	if [ $? = 1 ]
	then
		exit 1
	fi
	diff saida.txt $1_saida_$2.txt
	if [ $? = 1 ]
	then
		exit 1
	fi
	if [ $? = 0 ]
	then
		echo OK!
	fi

}

mvn compile;
executarEComparar $nomeClasse 01;
executarEComparar $nomeClasse 02;

