plugins {
    kotlin("jvm") version "2.0.20"
    id("com.google.devtools.ksp") version "2.0.20-1.0.25"
}

group = "me.simulatan.koin.getall"
version = "2.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.insert-koin:koin-core:4.0.1")
    implementation("io.insert-koin:koin-annotations:2.0.0-Beta3")
    ksp("io.insert-koin:koin-ksp-compiler:2.0.0-Beta3")
}
