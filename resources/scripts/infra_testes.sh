
PROFILE_WILDFLY_MANAGED="-P wildfly-managed"

mkdir -p src/test/java/
mkdir -p src/test/resources/META-INF/
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
		TOTAL_TESTES=$(($TOTAL_TESTES+1))
	done
	TESTES_SUCESSO=${#ARRAY[@]}
}

executarTestesIntegracao() {
	wget https://github.com/mozilla/geckodriver/releases/download/v0.25.0/geckodriver-v0.25.0-linux64.tar.gz;
	tar -xzf geckodriver-v0.25.0-linux64.tar.gz -C .;
	export PATH=$PATH:.;
	mvn compile
	if [ "$?" -ne 0 ]; then
		RESULTADO_TESTES=2
		return $RESULTADO_TESTES
	fi
	xvfb-run mvn install verify $PROFILE_WILDFLY_MANAGED 1> log.txt
	RESULTADO_TESTES=$?
	cat log.txt
	TESTS_RUN=`grep "Tests run" log.txt | tail -1 | cut -d ' ' -f 3,5,7 | sed 's/,//g'`
	if [ ! -z "$TESTS_RUN" ]; then
		ARRAY=($TESTS_RUN)
		TOTAL_TESTES=${ARRAY[0]}
		TEST_FAILURES=${ARRAY[1]}
		TEST_ERRORS=${ARRAY[2]}
		TESTES_SUCESSO=$(($TOTAL_TESTES-($TEST_FAILURES+$TEST_ERRORS)))
	fi
	return $RESULTADO_TESTES
}

executarTestesUnitarios() {
	mvn compile
	if [ "$?" -ne 0 ]; then
		RESULTADO_TESTES=2
		return $RESULTADO_TESTES
	fi
	mvn test 1> log.txt
	RESULTADO_TESTES=$?
	cat log.txt
	TESTS_RUN=`grep "Tests run" log.txt | tail -1 | cut -d ' ' -f 3,5,7 | sed 's/,//g'`
	if [ ! -z "$TESTS_RUN" ]; then
		ARRAY=($TESTS_RUN)
		TOTAL_TESTES=${ARRAY[0]}
		TEST_FAILURES=${ARRAY[1]}
		TEST_ERRORS=${ARRAY[2]}
		TESTES_SUCESSO=$(($TOTAL_TESTES-($TEST_FAILURES+$TEST_ERRORS)))
	fi
	return $RESULTADO_TESTES
}
