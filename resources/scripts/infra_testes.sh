set -ev

PROFILE_WILDFLY_MANAGED="-P wildfly-managed"

mkdir -p src/test/java/
mkdir -p src/main/resources/
mkdir -p src/main/webapp/WEB-INF/lib/

executarEComparar() {
	echo Entrada $2
	java -cp ./target/classes/ $1 < $1_entrada_$2.txt > saida.txt
	diff saida.txt $1_saida_$2.txt
	echo OK!
}

executarTestesEntradaESaida() {
	mvn -e -X -V compile -Dmaven.test.skip=true -Dmaven.javadoc.skip=true;
	for ENTRADA in $(ls | grep entrada | cut -d '_' -f 3 | cut -d '.' -f 1)
	do
		executarEComparar $1 $ENTRADA;
	done
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
