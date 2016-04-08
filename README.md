# Hello World
A simple Hello World project to demonstrate dependency management with IBM UrbanCode Build

## Building the Project
### Ant
##### Without dependencies.xml
When using IBM UrbanCode Build to manage your dependency on the [HelloWorldPrinter](https://github.com/IBM-UrbanCode/Dependencies-HelloWorldPrinter) project, you just need to make sure that the HelloWorldPrinter jar is in the `lib` directory and then run
```
ant dist
```

##### With dependencies.xml
Another option is the use a `dependencies.xml` file and the `Resolve` task that UrbanCode has written for Ant. You can find out more about how to set up the `Resolve` task and `dependencies.xml` file by going to the Tools page in your IBM UrbanCode Build server and downloading the `CodeStation Client`. If you are using the `Resolve` task, you would run
 ```
 ant resolve dist
 ```
 to get the HelloWorldPrinter jar into the `lib` directory.


##### File location
Once built, the `HelloWorld-dev.jar` file can be found under the `dist` directory


##### Specifying a version
You can optionally pass in the `version` property to specify a version for the build. For example, running
```
ant dist -Dversion=1.0
```
will produce a `HelloWorld-1.0.jar` file.

### Maven
```
mvn package
```

##### File location
Once built, the `HelloWorld-1.0-SNAPSHOT.jar` file can be found under the `targets` directory.

##### Specifying a version
You can optionally run `versions:set` with the `newVersion` property to specify a version for the build. For example, running
```
mvn versions:set -DnewVersion=1.0
mvn package
```
will produce a `HelloWorld-1.0.jar` file.

### Gradle
```
gradle jar
```

##### File location
Once built, the `HelloWorld-1.0-SNAPSHOT.jar` file can be found under the `build/libs` directory.

##### Specifying a version
You can optionally pass in the `newVersion` property specify a version for the build. For example, running
```
gradle -PnewVersion=1.0 jar
```
will produce a `HelloWorld-1.0.jar` file.
