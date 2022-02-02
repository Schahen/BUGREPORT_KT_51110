plugins {
    kotlin("multiplatform")
}


repositories {
    mavenCentral()
}

kotlin {
    js(IR) {
        browser()
    }
    sourceSets {
        commonMain {
            dependencies {
                implementation(project(":core"))
            }
        }
    }
}
