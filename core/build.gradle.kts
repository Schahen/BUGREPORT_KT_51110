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

    js(IR) {
        browser()
    }
    sourceSets {
        val jsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
                implementation(project(":test-utils"))
            }
        }
    }
}
