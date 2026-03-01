plugins {
    kotlin("jvm") version "2.1.21"
    `maven-publish`
}

group = "com.github.isycat"
version = "0.0.6"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

kotlin {
    jvmToolchain(21)
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
            groupId = "com.github.isycat"
            artifactId = "ktox-annotations"
            version = "0.0.6"
        }
    }
}
