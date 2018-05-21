set -ev

PROFILE_WILDFLY_MANAGED="-P wildfly-managed"

mkdir -p src/test/java/
mkdir -p src/main/resources/
mkdir -p src/main/webapp/WEB-INF/lib/

executarTestesIntegracao() {
	mvn clean install verify $PROFILE_WILDFLY_MANAGED;
}

executarTestesUnitarios() {
	mvn clean test;
}