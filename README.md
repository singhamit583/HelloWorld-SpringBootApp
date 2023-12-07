# Home Assignment: <HelloWorld-SpringBootApp>


# To build the Spring Boot App and Create Uber jar
./mvnw package

# To Run the Spring Boot App locally
java -jar target/spring-boot-docker-0.0.1-SNAPSHOT.jar

# Containerize the Spring Boot App using Docker
docker build -t <docker-image-name>

# To run the Docker Container and Export Port(eg: 9090)
docker run -p 9090:8080 -d <conatiner-name> <docker-image-name>

# To check Docker Images
docker images

# To check Running Docker Containers
docker ps

# To Deploy Helm chart to Kubernetes




