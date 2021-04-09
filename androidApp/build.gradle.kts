plugins {
    id("com.android.application")
    id("kotlin-android-extensions")
    kotlin("android")


}

dependencies {
    implementation(project(":shared"))
    implementation("com.google.android.material:material:1.2.1")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("androidx.constraintlayout:constraintlayout:2.0.2")
    implementation(kotlin("test-common"))
    implementation(kotlin("test-annotations-common"))
    implementation(kotlin("test-junit"))
    implementation("junit:junit:4.13")
}

android {
    compileSdkVersion(29)
    defaultConfig {
        applicationId = "hn.edu.kmm_aplicacion.androidApp"
        minSdkVersion(24)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}