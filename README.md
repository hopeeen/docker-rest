# Bachelor Project - REST Server

## Setup Development Environment

1) Install development dependencies

* [JavaSDK][javasdk] 1.8 or greater

2) Get this project

    $ git clone git@github.com:feskehau/bachelor-rest-server.git
    $ cd bachelor-rest-server/

3) Modify your git config

    $ git config [--global] user.name "John Doe"
    $ git config [--global] user.email "johndoe@example.com"

[javasdk]: http://www.oracle.com/technetwork/java/javase/downloads/index.html

## Run Application

Use gradle wrapper when running application. This ensures that we all use same gradle build. 
To run application:

    $ ./gradlew bootRun
    
When application is running and we want to make use of Spring Loaded class hot-swapping, just 
compile the class you want to hot-swap. In intellij this is CTRL + Shift + F9, but a nice trick 
is to map a compile macro to CTRL + S.
