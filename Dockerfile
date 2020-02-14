FROM openjdk:8-jdk

ADD target/*.jar /app/app.jar

CMD ["java", "-jar", "/app/app.jar"]
