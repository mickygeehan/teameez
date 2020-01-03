FROM openjdk:8-jdk-alpine
ADD ./target/api-gateway.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/api-gateway.jar"]

EXPOSE 8080