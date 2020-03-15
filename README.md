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
| jakartaeeApiVersion   | Jakarta EE api version       |                     8.0.0 |
| junitVersion          | JUnit 5 version              |                     5.6.0 |
| surefirePluginVersion | Surefire plugin version      |                  3.0.0-M4 |
| openLibertyVersion    | Open Liberty runtime version |                  20.0.0.3 |

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