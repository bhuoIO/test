FROM kdvolder/jdk8
ADD target/api-server-1.0.0-SNAPSHOT.jar api-server.jar
EXPOSE 9334
CMD java -Xms512m -Xmx512m -jar -Dfile.encoding=utf-8 -Duser.timezone=Asia/Shanghai -Dspring.profiles.active=dev api-server.jar