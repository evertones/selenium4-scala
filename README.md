# selenium4-scala

This repository has a simple project to run Selenium 4 using ScalaTest.
The stack used is:
- Gradle
- Scala
- ScalaTest
- Selenium

There is a `docker-compose.yml` file inside the directory `docker`.
It's set to start one Selenium hub and *n* Selenium nodes with Chrome.
To start it:
```
docker-compose up -d --scale chrome=8
``` 

To run tests:
```
./gradlew clean test -Ptest.suite=SuiteWith16Tests

OR

./gradlew clean test -Ptest.suite=SuiteWith8Tests
```
