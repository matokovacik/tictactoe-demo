Running the build:

`
gradlew build
`

Running & publishing of docker build of the container:

```
docker build -t tictactoe-demo .
docker tag tictactoe-demo martinkovacik123/tictactoe-demo
docker push martinkovacik123/tictactoe-demo
```

Running of containerized application. Argument passed represents series of moves. X and O is dynamically selected based on who has next move. 

```
docker run martinkovacik123/tictactoe-demo <game script> 

eg.
docker run martinkovacik123/tictactoe-demo 15497
```