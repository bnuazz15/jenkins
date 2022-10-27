FROM amazoncorretto:11
VOLUME /tmp
ADD /build/libs/jenkins-test-0.0.1-SNAPSHOT.war webapp.war
RUN bash -c 'touch /webapp.war'
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Duser.timezone=KR","-jar","/webapp.war"]
ENV TZ=Asia/Seoul
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone