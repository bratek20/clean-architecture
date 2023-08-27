plugins {
    id("org.springframework.boot") version "3.1.2"
}

springBoot {
    mainClass.set("org.example.cleanarchitecture.main.web.WebMain")
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")

    implementation(project(":modules:a-impl"))
    implementation(project(":modules:b-impl"))
}