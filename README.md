# Introduction to Java #

Base Hangman project for "Programowanie w Javie" laboratories at the Gdańsk University of Technology.

## Requirements

This project has very small system requirements:

* Java SE SDK 1.7 or higher

## How to run?

Hangman game is a simple Java SE 7 application build and run with [Gradle build system](https://gradle.org). To assemble the application (compile it and create a JAR file) in the root directory type:

`./gradlew assemble`

If you're using Windows above command should look like this:

`gradlew assemble`

If the build is successful it will produce jar file in build/libs directory. To run it simply type (again, in root directory):

`java -jar build/libs/introduction-to-java-laboratories.jar`

or for Windows users:

`java -jar build\libs\introduction-to-java-laboratories.jar`

## License

Code in this repository in under Apache License, Version 2.0 ([read more](https://github.com/Smoczysko/introduction-to-java-laboratories/blob/master/LICENSE)).