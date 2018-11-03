#set -ev
#set -e

PROFILE_WILDFLY_MANAGED="-P wildfly-managed"

mkdir -p src/test/java/
mkdir -p src/main/resources/
mkdir -p src/main/webapp/WEB-INF/lib/

executarEComparar() {
	echo Entrada $2
	java -cp ./target/classes/ $1 < $1_entrada_$2.txt > saida.txt
	diff saida.txt $1_saida_$2.txt
	return $? 
}

executarTestesEntradaESaida() {
	mvn -e -V compile -Dmaven.test.skip=true -Dmaven.javadoc.skip=true;
	if [ "$?" -ne 0 ]; then
		RESULTADO_TESTES=2
		return $RESULTADO_TESTES
	fi
	echo OK2 $CONTADOR_EXERCICIOS
	echo OK2 $EXERCICIOS_CORRETOS
	ARRAY=()
	for ENTRADA in $(ls | grep entrada | cut -d '_' -f 3 | cut -d '.' -f 1)
	do
		executarEComparar $1 $ENTRADA;
		RESULTADO=$?
		if [ $RESULTADO -eq 0 ]; then
			echo CORRETO.
			ARRAY+=($RESULTADO)
		else 
			echo INCORRETO.
		fi
		CONTADOR_EXERCICIOS=$(($CONTADOR_EXERCICIOS+1))
	done
	EXERCICIOS_CORRETOS=${#ARRAY[@]}
	echo 1 $EXERCICIOS_CORRETOS CORRETOS DE $CONTADOR_EXERCICIOS EXERCICIOS.
}

executarTestesIntegracao() {
	wget https://github.com/mozilla/geckodriver/releases/download/v0.20.1/geckodriver-v0.20.1-linux64.tar.gz;
	tar -xzf geckodriver-v0.20.1-linux64.tar.gz -C .;
	export PATH=$PATH:.;
	xvfb-run mvn clean install verify $PROFILE_WILDFLY_MANAGED;
}

executarTestesUnitarios() {
	mvn clean test;
}
