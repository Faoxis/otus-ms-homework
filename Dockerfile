FROM openjdk:21
WORKDIR /app

CMD ["./gradlew", "clean", "bootJar"]
COPY build/libs/*.jar app.jar

ENTRYPOINT ["java","-jar","/app/app.jar"]
