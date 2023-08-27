group = "org.example"
version = "1.0-SNAPSHOT"

plugins {
    id("java-library")

    id("org.springframework.boot") version "3.1.2"
    id("io.spring.dependency-management") version "1.1.2"
    id("io.freefair.lombok") version "8.2.2"
}

repositories {
    mavenCentral()
}

springBoot {
    mainClass.set("org.example.cleanarchitecture.Main")
}

subprojects {
    group = rootProject.group
    version = rootProject.version

    apply(plugin = "java-library")
    apply(plugin = "io.spring.dependency-management")
    apply(plugin = "io.freefair.lombok")

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

dependencies {
    implementation(project(":modules:a-impl"))
    implementation(project(":modules:b-impl"))

    implementation("org.springframework.boot:spring-boot-starter-web")

}

