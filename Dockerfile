FROM adoptopenjdk/openjdk15:alpine as build

WORKDIR /app
COPY . ./

RUN ./gradlew build

FROM adoptopenjdk/openjdk15:alpine-jre as release

WORKDIR /app

COPY build/libs/monitor-0.0.1-SNAPSHOT.jar monitor.jar
EXPOSE 8080
CMD ["java", "-jar", "monitor.jar"]
