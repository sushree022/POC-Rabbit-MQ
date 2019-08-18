#pull jdk image
FROM openjdk:11

#add/copy jar file from target to docker file system
ADD ./target/consumer-0.0.1-SNAPSHOT.jar /consumer/src/consumer-0.0.1-SNAPSHOT.jar

#Specify the work directory
WORKDIR consumer/src

#run the jar file
ENTRYPOINT ["java","-jar","consumer-0.0.1-SNAPSHOT.jar"]

