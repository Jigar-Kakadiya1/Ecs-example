FROM adoptopenjdk/openjdk11
EXPOSE 8080
ADD target/ecs-example.jar ecs-example.jar
ENTRYPOINT ["java","-jar","/ecs-example.jar"]
