import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.61"
    id("com.github.ben-manes.versions") version "0.27.0"
    id("se.patrikerdes.use-latest-versions") version "0.2.13"
}

group = "xerus"
version = "1.0-SNAPSHOT"

repositories {
    jcenter()
    maven("https://jitpack.io")
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("com.github.Xerus2000.util", "javafx", "3be3d40")

    testImplementation("io.kotlintest", "kotlintest-runner-junit5", "3.4.2")
}


sourceSets {
    main {
        java.srcDir("src/main")
        resources.srcDir("src/resources")
    }
    test {
        java.srcDir("src/test")
    }
}

tasks {
    withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "1.8"
    }
}