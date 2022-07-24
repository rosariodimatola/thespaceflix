FROM openjdk:11
ADD thespaceflix-0.0.1-SNAPSHOT.jar thespaceflix.jar
ENTRYPOINT ["java","-jar","/thespaceflix.jar"]