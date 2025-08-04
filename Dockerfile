FROM openjdk:21-slim
COPY target/*.jar spring-boot-project.jar
EXPOSE 8080:8080
ENTRYPOINT ["java","-jar","/spring-boot-project.jar"]