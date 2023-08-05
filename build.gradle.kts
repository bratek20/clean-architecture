plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")

    implementation(project(":modules:a:a-api"))
    implementation(project(":modules:a:a-impl"))
    implementation(project(":modules:b:impl"))
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}