FROM maven:3.9.5-eclipse-temurin-21 AS build

# ---- Stage 1: Build app ---

WORKDIR /build

COPY pom.xml pom.xml
COPY src src
RUN mvn clean package

# ---- Stage 2: Run the application ----
FROM eclipse-temurin:21-jre

WORKDIR /app

# Copy only the jar from the build stage
COPY --from=build /build/target/*.jar app.jar

# Run the jar
ENTRYPOINT ["java", "-jar", "app.jar"]
