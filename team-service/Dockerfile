FROM openjdk:8-jdk-alpine
ADD ./target/team-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/team-service.jar"]

EXPOSE 8080