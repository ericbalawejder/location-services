# location-services

CRUD app built with Dropwizard running in Docker.

#### To run:
```
$ ./gradlew clean build
```
```
$ ./gradlew copyApp
```
```
$ cd docker/compose
```
```
$ docker-compose up
```
Bash into the running MySQL container:
```
$ docker exec -t -i <container_name> /bin/bash
```
```
root@2fbfb34dd83b:/#
```
Run MySQL client:
```
root@2fbfb34dd83b:/# mysql -u <useranme> -p
```
Create tables and data.
```
mysql>
```

####Postman
Sample json content for @POST to `http://localhost:8080/api/v1/locations/` 
```
{
    "id": null,
    "createdOn": "1414602645009",
    "modifiedOn": "1414602645009",
    "country": "US",
    "state": "COLORADO",
    "type": "Ups",
    "code": "232121122222",
    "name": "it's cold"
}
```


Creating initial images.
```
$ ./gradlew clean build
```
```
$ ./gradlew copyApp
```
```
$ cd location-services/docker/location-services
```
```
$ docker build -t location-services .
```
```
$ docker create --name=location-services-container -p 8080:8080 -p 8081:8081 location-services
```
```
$ docker ps -a
```
```
$ docker start location-services-container
```
```
$ docker ps
```
```
$ docker logs -f location-services-container
```
Shut down
```
$ docker stop location-services-container
```
```
$ docker rm location-services-container
```