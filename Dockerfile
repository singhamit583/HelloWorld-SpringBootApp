FROM openjdk:11-jre-slim
WORKDIR /app
COPY target/spring-boot-docker-0.0.1-SNAPSHOT.jar /app/app.jar
EXPOSE 9090
CMD ["java", "-jar", "app.jar"]
