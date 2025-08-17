# Use an official Maven image to build the app
FROM maven:3.9.4-eclipse-temurin-17 AS builder
WORKDIR /app

# Copy the pom and source
COPY pom.xml .
COPY src ./src

# Package the application (skip tests for speed)
RUN mvn clean package -DskipTests

# Use a smaller JDK runtime image
FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app

# Copy the built JAR from builder stage
COPY --from=builder /app/target/store-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080
EXPOSE 8080

# Run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
