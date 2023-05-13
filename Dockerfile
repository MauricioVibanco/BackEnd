FROM amazoncorretto:8-alpine-jdk
MAINTAINER MV
COPY target/MV-0.0.1-SNAPSHOT.jar  MV_app.jar
ENTRYPOINT ["java","-jar","/MV_app.jar"]
