# Home Assignment: <HelloWorld-SpringBootApp>

# TASK 1 AND 2:
# To build the Spring Boot App and Create Uber jar
./mvnw package

# To Run the Spring Boot App locally
java -jar target/spring-boot-docker-0.0.1-SNAPSHOT.jar



# TASK 3:
# Containerize the Spring Boot App using Docker
docker build -t <docker-image-name>

# To run the Docker Container and Export Port(eg: 9090)
docker run -p 9090:8080 -d <container-name>

# To check Docker Images
docker images

# To check Running Docker Containers
docker ps



# TASK 4
# Created help chart using
helm create springbootapp .

# Helm chart deployed using:
helm install springbootapp .

# Used command after deploying helm chart to minikube cluster
kubectl get pod
kubectl describe pod <pod name>
kubectl logs <pod name>
kubectl get svc
Hit the url (minikubeip:svc mapped Nodeport)
example: https://192.168.49.2:32479










