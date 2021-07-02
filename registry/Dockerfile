FROM openjdk:8-jdk-alpine
EXPOSE 8761
COPY build/libs/registry-1.0-SNAPSHOT.jar .
RUN apk add --no-cache bash
COPY wait-for.sh /wait-for.sh
RUN chmod +x /wait-for.sh
ENTRYPOINT ["/wait-for.sh", "config-service:8001", "--timeout=70", "--", "java", "-jar", "registry-1.0-SNAPSHOT.jar"]
