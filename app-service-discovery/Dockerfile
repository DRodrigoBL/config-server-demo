FROM openjdk:11

RUN mkdir /code
COPY build/libs /code

EXPOSE 8762
ENTRYPOINT [ "sh", "-c", "exec java -jar -Duser.timezone=$TIMEZONE -Dnetworkaddress.cache.ttl=60 -Dnetworkaddress.cache.negative.ttl=30 /code/*.jar" ]