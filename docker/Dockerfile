FROM adoptopenjdk/openjdk11:alpine-jre

EXPOSE 8080

ADD docker/javaboard-0.1-a.jar /javaboard-0.1-a.jar

ENTRYPOINT ["java","-jar","javaboard-0.1-a.jar"]