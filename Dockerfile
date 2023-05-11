FROM amazoncorretto: 11 
MAINTAINER LuisAJ
COPY target/backMarterClass-0.0.1-SNAPSHOT.jar laj-app.jar
ENTRYPOINT ["java","-jar","/laj-app.jar"]