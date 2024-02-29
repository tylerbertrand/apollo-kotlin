plugins {
  id("com.gradle.enterprise") version "3.16.2" // sync with libraries.toml
  id("com.gradle.common-custom-user-data-gradle-plugin") version "1.13"
  id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

rootProject.name = "build-logic"

dependencyResolutionManagement {
  versionCatalogs {
    create("libs") {
      from(files("../gradle/libraries.toml"))
    }
  }
}

apply(from = "../gradle/repositories.gradle.kts")
apply(from = "../gradle/ge.gradle")
