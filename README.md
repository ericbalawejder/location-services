# location-services



### Docker
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