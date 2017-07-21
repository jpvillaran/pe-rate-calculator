FROM java:openjdk-8u45-jdk
MAINTAINER JPVillaran
EXPOSE 8090
ADD target/pe-rate-calculator.jar ./
CMD java -jar pe-rate-calculator.jar
