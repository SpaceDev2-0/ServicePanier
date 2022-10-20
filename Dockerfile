FROM openjdk:8
EXPOSE 8763
ADD /target/ServicePanier-0.0.1-SNAPSHOT.jar ServicePanier-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","ServicePanier-0.0.1-SNAPSHOT.jar"]