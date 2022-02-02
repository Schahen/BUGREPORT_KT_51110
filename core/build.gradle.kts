plugins {
    kotlin("multiplatform")
}

repositories {
    mavenCentral()
}

kotlin {
     targets.all {
        compilations.all {
            kotlinOptions {
                allWarningsAsErrors = true
            }
        }
    }

    jvm()
    sourceSets {
        val jvmTest by getting {
            dependencies {
                implementation(kotlin("test"))
                implementation(project(":test-utils"))
            }
        }
    }
}
