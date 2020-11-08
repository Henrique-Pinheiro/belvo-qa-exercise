FROM maven:3.6.3-jdk-8-slim


COPY . /home/build
WORKDIR /home/build


RUN mvn clean verify
