FROM gradle:latest
LABEL "project.name"="Flexmoney Assignment"
LABEL "project.tier"="Backend"
COPY ./build/libs/devops-0.0.1-SNAPSHOT.jar devops-assignment.jar
EXPOSE 8987
ENTRYPOINT ["java", "-jar", "devops-assignment.jar"]