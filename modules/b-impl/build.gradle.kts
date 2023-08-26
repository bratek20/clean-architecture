dependencies {
    api(project(":modules:a-api"))
    api(project(":modules:b-api"))
    implementation(project(":modules:shared"))

    implementation("org.springframework.boot:spring-boot")
}