FROM openjdk:17

WORKDIR /app

COPY ./target/convidados-0.0.1-SNAPSHOT.jar .

ENTRYPOINT java -jar convidados-0.0.1-SNAPSHOT.jar