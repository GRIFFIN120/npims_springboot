FROM java:8
MAINTAINER a78230696 <liuyinpeng@casisd.cn>
#WORKDIR /usr/local/cloud/

ADD target/${JAR_FILE}  app.jar
CMD ["java", "-version"]

ENTRYPOINT ["java", "-jar", "/app.jar"]
EXPOSE 8012
