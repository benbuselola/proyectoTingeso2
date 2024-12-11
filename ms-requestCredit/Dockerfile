FROM openjdk:17
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} ms-requestCredit.jar
ENTRYPOINT ["java","-jar","/ms-requestCredit.jar"]