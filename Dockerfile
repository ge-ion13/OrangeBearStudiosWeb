FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY . .

RUN ./gradlew clean bootJar --no-daemon

EXPOSE 8080

CMD ["sh", "-c", "java -jar build/libs/*.jar --server.port=${PORT:-8080}"]