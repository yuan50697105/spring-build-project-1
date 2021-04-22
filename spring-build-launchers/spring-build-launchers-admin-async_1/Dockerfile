ARG APP
FROM openjdk:11-slim-buster
WORKDIR /app
ADD *.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
