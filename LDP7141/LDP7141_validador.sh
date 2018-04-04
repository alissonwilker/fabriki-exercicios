#!/bin/bash
set -ev

EXERCICIO=LDP7141

executarEComparar () {
	echo Entrada $2
	java -cp ../target/classes/ $1 < $1_entrada_$2.txt > saida.txt
	diff saida.txt $1_saida_$2.txt
	echo OK!

}

mvn compile;
cd $EXERCICIO
for ENTRADA in $(ls | grep entrada | cut -d '_' -f 3 | cut -d '.' -f 1)
do
	executarEComparar $EXERCICIO $ENTRADA;
done
