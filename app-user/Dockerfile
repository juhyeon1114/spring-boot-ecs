FROM public.ecr.aws/amazoncorretto/amazoncorretto:25-al2023-jdk

WORKDIR /app

COPY build/libs/app-user-1.0.0.jar ./application.jar

EXPOSE 8080

ENV JAVA_OPTS="-XX:InitialRAMPercentage=70.0 -XX:MaxRAMPercentage=70.0"

ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -Dserver.port=8080 -jar ./application.jar"]
