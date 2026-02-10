FROM maven:3.9.9-eclipse-temurin-17 as BUILD
WORKDIR /build-folder
COPY . .
RUN --mount=type=cache,target=/root/.m2 mvn -DskipTests=true clean package

FROM eclipse-temurin:17
WORKDIR /opt/nutriZonaBack
COPY --from=BUILD /build-folder/target/*.jar nutriZona.jar
ARG DEFAULT_PORT=9000
ENV PORT=$DEFAULT_PORT
EXPOSE $PORT
ENTRYPOINT ["java", "-jar", "nutriZona.jar"]