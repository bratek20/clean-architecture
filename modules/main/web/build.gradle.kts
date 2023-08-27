dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")

    implementation(project(":modules:a-impl"))
    implementation(project(":modules:b-impl"))
}