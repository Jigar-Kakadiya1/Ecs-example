FROM amazoncorretto:11-alpine-jdk
EXPOSE 8080
ADD target/ecs-example.jar ecs-example.jar
ENTRYPOINT ["java","-jar","/ecs-example.jar"]
