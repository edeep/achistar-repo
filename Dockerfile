FROM ubuntu:latest as os 

FROM openjdk:8
EXPOSE 8050
ADD target/dockerJenkinsCIDemo-0.0.1-SNAPSHOT.jar dockerJenkinsCIDemo-0.0.1-SNAPSHOT.jar
ENTRYPOINT  ["java","-jar", "/dockerJenkinsCIDemo-0.0.1-SNAPSHOT.jar"]