# Spring MVC v WebFlux

Implements the same functionality using Spring MVC and Spring Webflux.
Please see the respective branches for the functionality.

This demo depends on:

- Gradle (v 6.8.3)
- Kotlin (v 1.4.31)

## Building the code

To build the code, run:

```shell
./gradlew build
```

## Running the database server with test data

A `Dockerfile` has been created to run the database server with test data.
See the README.md file in `src/test/resources/db`

## Running the server

To run the application:

```shell
./gradlew bootRun
```

## Testing the endpoint

You can use `curl` to test the endpoint. For example, to hit the webflux endpoint:

```shell
curl -X GET --location "http://localhost:8080/contact" -H "Accept: text/event-stream"
```
