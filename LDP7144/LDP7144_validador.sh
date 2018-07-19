#!/bin/bash

nomeClasse=$1

executarEComparar () {

	echo Entrada $2
	java -cp ../classes $nomeClasse < $1_entrada_$2.txt > saida.txt
	diff saida.txt $1_saida_$2.txt
	if [ $? = 0 ]
	then
		echo OK!
	fi

}

executarEComparar $nomeClasse 01;
executarEComparar $nomeClasse 02;
executarEComparar $nomeClasse 03;
executarEComparar $nomeClasse 04;
executarEComparar $nomeClasse 05;
