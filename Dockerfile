FROM bachelorthesis/java:jdk8-openjdk
MAINTAINER Andreas Hopen <andreashopen@gmail.com>

WORKDIR /tmp/test/

COPY ./ ./

CMD ["./gradlew", "bootRun"]