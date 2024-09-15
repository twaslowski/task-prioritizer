FROM amazoncorretto:21-alpine

COPY build/libs/task-prioritizer-0.0.1-SNAPSHOT.jar /var/opt/task-prioritizer.jar

EXPOSE 8443

CMD ["java", "-jar", "/var/opt/task-prioritizer.jar"]