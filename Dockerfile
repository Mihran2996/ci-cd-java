FROM openjdk:19
EXPOSE 8080
ADD target/java-cicd.jar java-cicd.jar
ENTRYPOINT ["java","-jar","java-cicd.jar"]