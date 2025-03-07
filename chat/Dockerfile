FROM eclipse-temurin:23-jre-alpine
LABEL authors="Emil"
COPY build/libs/chat-1.0.0.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]
# some cool docker commands:
# docker build --tag=emilvdijk/chat:latest .
# docker run -p 8080:8080 -t emilvdijk/chat:latest