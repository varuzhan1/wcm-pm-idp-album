FROM maven:3.8.1-openjdk-17

COPY target/wcm-pm-idp-user-0.0.1-SNAPSHOT.jar app.jar

RUN mkdir newrelic
COPY newrelic/newrelic.jar /newrelic/
COPY newrelic/newrelic.yml /newrelic/

ARG SPRING_PROFILE
ARG NEW_RELIC_LICENSE_KEY

ENV ENV_SPRING_PROFILE=$SPRING_PROFILE
ENV NEW_RELIC_LICENSE_KEY=$NEW_RELIC_LICENSE_KEY

ENTRYPOINT exec java -javaagent:/newrelic/newrelic.jar --enable-preview -jar -Dnewrelic.environment=$ENV_SPRING_PROFILE -Dspring.profiles.active=$ENV_SPRING_PROFILE /app.jar
