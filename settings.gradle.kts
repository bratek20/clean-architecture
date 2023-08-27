rootProject.name = "clean-architecture"

include("modules:main:script", "modules:main:web")
include("modules:a-api", "modules:a-impl")
include("modules:b-api", "modules:b-impl")
include("modules:shared")
findProject(":modules:shared")?.name = "shared"
include("modules:c")
findProject(":modules:c")?.name = "c"
