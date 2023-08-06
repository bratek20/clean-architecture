plugins {
    id("java-library")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

subprojects {
    group = rootProject.group
    version = rootProject.version

    apply(plugin = "java-library")
}

dependencies {
    implementation(project(":modules:a-impl"))
    implementation(project(":modules:b-impl"))
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}