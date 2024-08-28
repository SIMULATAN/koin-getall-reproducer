plugins {
    kotlin("jvm") version "2.0.20"
    id("com.google.devtools.ksp") version "2.0.20-1.0.24"
}

group = "me.simulatan.koin.getall"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.insert-koin:koin-core:4.0.0-RC1")
    implementation("io.insert-koin:koin-annotations:1.4.0-RC4")
    ksp("io.insert-koin:koin-ksp-compiler:1.4.0-RC4")
}
