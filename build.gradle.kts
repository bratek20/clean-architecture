plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

subprojects {
    group = rootProject.group
    version = rootProject.version

    apply(plugin = "java")
}

dependencies {
    implementation(project(":modules:a:api"))
    implementation(project(":modules:a:impl"))
    implementation(project(":modules:b:api2"))
    implementation(project(":modules:b:impl2"))
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}