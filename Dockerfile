# # Start with a base image containing Ubuntu
# FROM ubuntu:20.04

# # Add Maintainer Info
# # Add Maintainer Info
# LABEL maintainer="example@example.com" \
#       description="This is a Maven project"

# # Install OpenJDK-8
# RUN apt-get update && \
#     apt-get install -y software-properties-common && \
#     add-apt-repository universe && \
#     apt-get update && \
#     apt-get install -y openjdk-8-jdk && \
#     apt-get clean;


# # Setup JAVA_HOME -- useful for docker commandline
# ENV JAVA_HOME /usr/lib/jvm/java-8-openjdk-amd64/
# RUN export JAVA_HOME

# # The application's jar file
# ARG JAR_FILE=target/selenium-1.0-SNAPSHOT.jar

# # Add the application's jar to the container
# ADD ${JAR_FILE} app.jar

# # Copy Microsoft Edge WebDriver from source folder
# COPY src/Resources/msedgedriver.exe /usr/local/bin/msedgedriver

# # Run the jar file 
# ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]



# Start with a base image containing Java runtime (Here we are using openjdk)
# Start with a base image containing Java runtime and Maven (Here we are using maven:3.6.3-openjdk-8)
FROM maven:3.6.3-openjdk-8

# Make source directory
RUN mkdir -p /usr/src/app

# Change to the app directory
WORKDIR /usr/src/app

# Copy your pom.xml file
COPY pom.xml .

# Build dependencies and cache them layer
RUN mvn dependency:go-offline -B

# Copy your source code
COPY src /usr/src/app/

# Add the Chrome Driver to the container
COPY /src/Resources/msedgedriver.exe /usr/local/bin/chromedriver

# Make port 8080 available to the world outside this container
EXPOSE 8080

RUN mvn install

# Run the jar file 
CMD ["mvn","test"]