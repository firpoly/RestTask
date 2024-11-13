FROM openjdk:21

EXPOSE 8099
COPY target/RestTask-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar","app.jar"]