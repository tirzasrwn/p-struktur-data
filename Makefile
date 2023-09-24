all: build run

build:
	mvn clean -DskipTests=true package

run:
	java -cp target/p-struktur-data-1.0-SNAPSHOT.jar com.tirzasrwn.app.$(args)
