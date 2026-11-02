# LeetCode in Java

Each solution is an independent Maven module. The root `pom.xml` imports all nine
modules into IntelliJ IDEA without committing IDE metadata.

## IntelliJ IDEA

1. Open the root `pom.xml` as a project and load the Maven project.
2. Set the Project SDK to JDK 17 (the build targets Java 8).
3. Open a module's `src/main/java/Main.java`.
4. Click the run icon beside `main` to run that solution's sample.

If the project is already open, load the root `pom.xml` as a Maven project and
reload all Maven projects to update source roots and modules.

## Build and run from a terminal

With JDK 17 and Maven installed, build all modules from the repository root:

```shell
mvn clean verify
```

Run a sample after building, for example:

```shell
java -cp "33-search in rotated sorted array/target/classes" Main
```

Replace the module directory to run another solution. Each module uses the default
package, so its entry point is simply `Main`.
Every module has a `Main` class with a runnable sample. No external runtime
libraries are required.
