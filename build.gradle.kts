// Aggregating build for the repro monolith.
// Intentionally minimal so Gradle import is cheap; we want IntelliJ's
// indexer + GitHub Copilot to do the heavy lifting, not the build.

plugins {
    java
}

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "java")

    java {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    tasks.withType<JavaCompile>().configureEach {
        // Skip annotation processing entirely - speeds up incremental builds.
        options.compilerArgs.addAll(listOf("-proc:none"))
    }
}