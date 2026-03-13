group = "com.isycat"
version = properties["version"] ?: "0.0.1"

plugins {
    `java-library`
    kotlin("jvm") version "2.1.21"

    id("com.isycat.maven-central-publisher")
}
mavenCentralPublishing {
    artifactId = "ktox-annotations"
    groupId = "com.isycat"
    name = "ktox Annotations"
    description = "Annotations for Kotlin-to-X transpilers"
    url = "https://github.com/isycat/KotlinToLua"
    developerId = "isycat"
    license {
        name = "Apache-2.0"
        url = "https://github.com/isycat/KotlinToLua"
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

kotlin {
    jvmToolchain(21)
}
