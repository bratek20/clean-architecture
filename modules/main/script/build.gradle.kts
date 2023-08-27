dependencies {
    implementation("org.springframework.boot:spring-boot-starter")

    implementation(project(":modules:a-impl"))
    implementation(project(":modules:b-impl"))
}