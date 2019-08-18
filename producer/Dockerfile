
##Pull jdk11 from DockerHub
FROM openjdk:11

##Specify the work directory
WORKDIR producer/src

##Add the jar file to be executed
ADD .target/producer-0.0.1-SNAPSHOT.jar /producer/src/producer-0.0.1-SNAPSHOT.jar

##ENTRYPOINT allows you to configure a container that will run as an executable
ENTRYPOINT ["java","-jar","producer-0.0.1-SNAPSHOT.jar"]

