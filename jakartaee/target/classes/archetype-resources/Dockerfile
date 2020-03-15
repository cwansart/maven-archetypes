# NOTE: Before you can create a container you need to run `mvn package` to create the web archives that are used here.
FROM open-liberty:19.0.0.12-full-java8-openj9

COPY --chown=1001:0 src/main/liberty/config /config/
COPY --chown=1001:0 target/${artifactId}.war /config/apps

RUN configure.sh