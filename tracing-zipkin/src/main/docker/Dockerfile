FROM java:8
ADD spring-cloud-zipkin-server-1.0-SNAPSHOT.jar app.jar
VOLUME /tmp
VOLUME /target
RUN sh -c 'touch /app.jar'
EXPOSE 9411
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
