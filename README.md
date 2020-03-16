# Archetypes

This is a collection of archetypes I use, for example a Jakarta EE one.

## Requirements

This should be obvious but in case you don't know, this project requires:

* JDK 8 or newer
* Maven 3.1 or newer

## Install

To install the archetypes checkout the repository and install them:

```bash
$ git clone https://github.com/cwansart/maven-archetypes.git
$ cd maven-archetypes
$ mvn clean install
```

## Overview

### Jakarta EE

The Jakarta EE archetype contains a sample project with a JAX-RS-based resource.
It creates a sample unit test and an integration test. To run the server it
uses the `liberty-maven-plugin` though it works on any Jakarta EE 8 compatible
enterprise server.

There are several property that may be set via `-D<property>=<value>`:

| Property              | Description                  | Default value             |
| --------------------- | -----------------------------| -------------------------:|
| package               | the package name             | \${groupId}.${artifactId} |
| openLibertyVersion    | Open Liberty runtime version |                  20.0.0.3 |
| jakartaeeApiVersion   | Jakarta EE api version       |                     8.0.0 |
| slf4jVersion          | Slf4j version                |                    1.7.30 |
| junitVersion          | JUnit 4 version              |                      4.13 |
| testcontainersVersion | Testcontainers version       |                    1.13.0 |
| restAssuredVersion    | Rest Assured version         |                     4.3.0 |
| surefirePluginVersion | Surefire plugin version      |                  3.0.0-M4 |
| failsafePluginVersion | Failsafe plugin version      |                  3.0.0-M4 |


To create a project based on the archetype:

```bash
$ mvn archetype:generate -DarchetypeCatalog=local \
                         -DarchetypeGroupId=de.cwansart.archetypes \
                         -DarchetypeArtifactId=jakartaee
```

After creating you can run tests and run the application via Maven:

```bash
$ mvn clean verify
$ mvn liberty:run
```

## Shotcut for creation (bash/sh)

Instead of using the long and hard to remember generate command you can add a
function to your .bash_profile:

```bash
gen-jakarta () {
  mvn archetype:generate -DarchetypeCatalog=local \
                         -DarchetypeGroupId=de.cwansart.archetypes \
                         -DarchetypeArtifactId=jakartaee $@
}
```

After adding and reloading the terminal session you can run the command via:

```bash
$ gen-jakarta
```

You can also pass additional parameters like the ones listed above:

```bash
$ gen-jakarta -DopenLibertyVersion=19.0.0.6
```