# ktox-annotations

A lightweight annotation library for the Kotlin-to-Lua transpiler.

### Using ktox-annotations in your project (JitPack)

To use this library in your Gradle project via JitPack:

1. Add the JitPack repository to your `build.gradle.kts`:

```kotlin
repositories {
    mavenCentral()
    maven { url = uri("https://jitpack.io") }
}
```

2. Add the dependency:

```kotlin
dependencies {
    implementation("com.github.isycat:ktox-annotations:0.0.1")
}
```

Note: replace `0.0.1` with a specific version or a commit hash.
