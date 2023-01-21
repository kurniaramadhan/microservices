#Start with a base image containing Java runtime
FROM openjdk:17-jdk-slim as build

#Information around who maintains the image
MAINTAINER dewacoding.com

# Add the application's jar to the container
COPY target/accountsservice-0.0.1-SNAPSHOT.jar accountsservice-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java","-jar","/accountsservice-0.0.1-SNAPSHOT.jar"]