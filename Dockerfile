FROM openjdk:17
EXPOSE 8080
ADD target/microservices-github-action.jar microservices-github-action.jar
ENTRYPOINT["java","-jar","/microservices-github-action.jar