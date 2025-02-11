# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory to /app
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY . /app


EXPOSE 8081

# Run the jar file
CMD ["java", "-jar", "target/db-connection-0.0.1-SNAPSHOT.jar"]