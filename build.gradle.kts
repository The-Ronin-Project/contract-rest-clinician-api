group = "com.projectronin.rest.contract"

plugins {
    alias(roningradle.plugins.buildconventions.kotlin.jvm)
    alias(roningradle.plugins.openapi.contract)
}

dependencies {
    openapi("com.projectronin.rest.contract:ronin-contract-shared-v1:1.0.0")
}
