FROM openjdk:8u111-jdk-alpine
RUN adduser -D demo
RUN chown demo:root -R /usr/lib/jvm/java-1.8-openjdk/ 
WORKDIR /home/demo
EXPOSE 8080
USER demo	
VOLUME /tmp
ADD account-1.0-SNAPSHOT.war demo-app.war
ADD jetty-runner-9.4.7.v20170914.jar jetty-runner.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Xmx512M","-jar","jetty-runner.jar","demo-app.war","--debug"]