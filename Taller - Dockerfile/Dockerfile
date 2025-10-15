
## Stage 2
FROM eclipse-temurin:24-jre-alpine

WORKDIR /app

COPY target/*.jar app.jar

#Exponer puerto
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
