# Spring MVC v WebFlux

Implements the same functionality using Spring MVC and Spring Webflux.
Please see the respective branches for the functionality.

- [Blog](https://hbrown.dev/kotlin/2021/04/10/springmvc-v-webflux.html)
- [Video](https://youtu.be/6N1pnYun2AE)

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
