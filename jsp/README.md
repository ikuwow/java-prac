# tomcat and jsp tutorial

http://tomcat.apache.org/tomcat-9.0-doc/introduction.html

tomcat includes catalina (servlet container) and coyote (http server)
and uses jaspter 2 jsp engine.


## How to use tomcat

```
docker run -it --rm -p 8888:8080 tomcat:8.0
```

## How it organized

http://tomcat.apache.org/tomcat-9.0-doc/appdev/index.html

## run war

```
wget http://tomcat.apache.org/tomcat-9.0-doc/appdev/sample/sample.war
docker run -it --rm -p 8888:8080 -v $(pwd):/usr/local/tomcat/webapps tomcat:9
```

Go `http://localhost:8888/sample/hello.jsp` and edit `sample/hello.jsp`.

