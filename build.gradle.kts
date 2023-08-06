group = "org.example"
version = "1.0-SNAPSHOT"

plugins {
    id("java-library")

    id("org.springframework.boot") version "3.1.2"
    id("io.spring.dependency-management") version "1.1.2"
}

repositories {
    mavenCentral()
}

//dependencyManagement {
//    imports {
//        mavenBom("org.springframework.boot:spring-boot-dependencies:3.1.2")
//    }
//}

dependencies {
    implementation("org.springframework:spring-context")

    implementation(project(":modules:a-impl"))
    implementation(project(":modules:b-impl"))
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

subprojects {
    group = rootProject.group
    version = rootProject.version

    apply(plugin = "java-library")
    apply(plugin = "io.spring.dependency-management")

    repositories {
        mavenCentral()
    }

    dependencyManagement {
        imports {
            mavenBom("org.springframework.boot:spring-boot-dependencies:3.1.2")
        }
    }

    dependencies {
        implementation("org.springframework:spring-context")
    }
}

