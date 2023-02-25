from openjdk
COPY ./src/mail/java/*.java /
RUN javac /Calculator.java
ENTRYPOINT ["java"]
