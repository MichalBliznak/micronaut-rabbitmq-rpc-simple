FROM openjdk:14-alpine
COPY target/api-*.jar api.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "api.jar"]