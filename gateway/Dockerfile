FROM openjdk:8-jdk-alpine
EXPOSE 8989
COPY build/libs/gateway-1.0-SNAPSHOT.jar .
ENTRYPOINT ["java", "-jar", "gateway-service-1.0-SNAPSHOT.jar"]
