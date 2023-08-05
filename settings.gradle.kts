rootProject.name = "clean-architecture"
include("modules:a")
findProject(":modules:a")?.name = "a"
include("modules:a:a-api")
findProject(":modules:a:a-api")?.name = "a-api"
include("modules:a:impl")
findProject(":modules:a:impl")?.name = "impl"
include("modules:a:a-impl")
findProject(":modules:a:a-impl")?.name = "a-impl"
include("modules:b:api")
findProject(":modules:b:api")?.name = "api"
include("modules:b:impl")
findProject(":modules:b:impl")?.name = "impl"
