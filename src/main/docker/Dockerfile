FROM openjdk:13-slim
VOLUME /tmp
COPY ./target/springboot-redis-1.0.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]