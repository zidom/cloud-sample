FROM java:8
ADD spring-boot-admin-1.0-SNAPSHOT.jar app.jar
VOLUME /tmp
VOLUME /target
RUN bash -c 'touch /app.jar'
EXPOSE 10086
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]