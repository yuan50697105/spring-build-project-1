ARG APP
FROM openjdk:11-slim-buster
WORKDIR /app
ADD ${APP}.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
