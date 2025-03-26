FROM maven:3.8.5-openjdk-17 as build

WORKDIR /build

COPY . .

RUN mvn clean package -DskipTests


FROM openjdk:17

WORKDIR /app

COPY --from=build ./build/target/*.jar ./convidados.jar

# Definindo variáveis de ambiente
ENV DATASOURCE_URL="jdbc:mysql://cd-mysql-5:3306/festa?TimeZone=true$serverTimezone=UTC"
ENV DATASOURCE_USERNAME="root"
ENV DATASOURCE_PASSWORD="root"

ENTRYPOINT ["java", "-jar", "convidados.jar"]