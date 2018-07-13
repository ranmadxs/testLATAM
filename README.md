# testLATAM

## What you'll need
- JDK 1.7 or later
- Maven 3 or later

## Stack
- Spring Boot
- Java
- AngularJS
- Docker

## Run
`mvn spring-boot:run`

## Test
`mvn test`

## Compile
`mvn clean install`
### Compile with out test
`mvn clean install -DskipTests`

## Docker

`mvn clean package docker:build "-Ddocker.cert.path=/path_to_docker_cert" "-Ddocker.host=https://dockerhost:2376" "-Ddocker.registryUrl=nexus:8084"`

`mvn docker:push "-Ddocker.host=https://dockerhost:2376" "-Ddocker.registryUrl=nexus:8085" "-Ddocker.cert.path=/path_to_docker_cert" `
