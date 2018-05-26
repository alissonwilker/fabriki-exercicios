set -ev

PROFILE_WILDFLY_MANAGED="-P wildfly-managed"

mkdir -p src/test/java/
mkdir -p src/main/resources/
mkdir -p src/main/webapp/WEB-INF/lib/

executarTestesIntegracao() {
	wget https://github.com/mozilla/geckodriver/releases/download/v0.20.1/geckodriver-v0.20.1-linux64.tar.gz;
	tar -xzf geckodriver-v0.20.1-linux64.tar.gz -C .;
	export PATH=$PATH:.;
	xvfb-run mvn clean install verify $PROFILE_WILDFLY_MANAGED;
}

executarTestesUnitarios() {
	mvn clean test;
}