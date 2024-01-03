plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-android")
    id("kotlin-kapt")
}

android {
    namespace = "com.fyrl29074.quest"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.fyrl29074.quest"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(Deps.AndroidX.core_ktx)
    implementation(Deps.AndroidX.app_compat)
    implementation("com.google.android.material:material:1.11.0")

    implementation(Deps.NavComponent.nav_ui_ktx)
    implementation(Deps.NavComponent.nav_fragment_ktx)

    implementation(Deps.Coroutines.coroutines_android)

    implementation(Deps.AndroidX.app_compat)

    implementation(Deps.Koin.koin_android)

    implementation(project(":navigation"))

    // Features
    implementation(project(":feature-projects"))
    implementation(project(":feature-tasks"))
}