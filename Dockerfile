FROM openjdk:8-jdk-alpine
VOLUME /tmp
VOLUME log
ARG JAR_FILE
COPY target/demo1-2.0.1.RELEASE.war app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
