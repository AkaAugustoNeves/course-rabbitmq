FROM openjdk:11-jre-slim

WORKDIR /app

ENV DB_EVALUATION_URL ""
ENV DB_EVALUATION_USERNAME ""
ENV DB_EVALUATION_PASSWORD ""
ENV RABBITMQ_HOST ""
ENV RABBITMQ_PORT ""
ENV RABBITMQ_USERNAME ""
ENV RABBITMQ_PASSWORD ""

COPY target/ms-evaluation-0.0.1-SNAPSHOT.jar /app/ms-evaluation.jar

EXPOSE 8083

CMD ["java", "-jar", "ms-evaluation.jar"]