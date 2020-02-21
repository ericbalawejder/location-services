FROM openjdk

EXPOSE 8080
EXPOSE 8081

#    from                   to
COPY location-services.jar .
COPY config.yml .

CMD ["java", "-jar", "location-services.jar", "server", "config.yml"]

#java -jar location-services.jar server config.yml