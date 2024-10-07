FROM maven:3.8.1-jdk-11 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

FROM openjdk:22-jre-slim
WORKDIR /app
COPY --from=build /app/target/BudgetManager.jar /app/BudgetManager.jar
ENTRYPOINT ["java", "-jar", "/app/BudgetManager.jar"]



