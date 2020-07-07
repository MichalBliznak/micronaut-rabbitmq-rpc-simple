FROM openjdk:14-alpine
COPY target/worker-*.jar worker.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "worker.jar"]