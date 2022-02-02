plugins {
    kotlin("multiplatform")
}


repositories {
    mavenCentral()
}

kotlin {
    jvm()
    sourceSets {
        commonMain {
            dependencies {
                implementation(project(":core"))
            }
        }
    }
}
