// App-level build.gradle.kts
plugins {
<<<<<<< Updated upstream
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
=======
    id("com.android.application")
>>>>>>> Stashed changes
    id("com.chaquo.python")
}

android {
<<<<<<< Updated upstream
    ndkVersion = "27.0.11718014"
    namespace = "com.example.smishingdetectionapp"
=======
>>>>>>> Stashed changes
    compileSdk = 34
    defaultConfig {
<<<<<<< Updated upstream
        ndk {
            // On Apple silicon, you can omit x86_64.
            abiFilters += listOf("arm64-v8a", "x86_64")
        }
        applicationId = "com.example.smishingdetectionapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }


   }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
//    ndk {
//        abiFilters("armeabi-v7a", "x86")
//    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        viewBinding = true
        compose = true
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

    sourceSets {
        getByName("main").java.srcDirs("src/main/python")
=======
        applicationId = "com.example.myapp"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
>>>>>>> Stashed changes
    }
    // Other configurations if needed
}

dependencies {
<<<<<<< Updated upstream
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraintlayout)
    implementation(libs.lifecycle.livedata.ktx)
    implementation(libs.lifecycle.viewmodel.ktx)
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)
    implementation(libs.annotation)
    implementation(libs.preference)
    implementation(libs.lifecycle.runtime.ktx)
    implementation(libs.activity.compose)
    implementation(platform(libs.compose.bom))
    implementation(libs.ui)
    implementation(libs.ui.graphics)
    implementation(libs.ui.tooling.preview)
    implementation(libs.material3)
    implementation(libs.activity)
    implementation(files("libs/sqliteassethelper-2.0.1.jar"))
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    androidTestImplementation(platform(libs.compose.bom))
    androidTestImplementation(libs.ui.test.junit4)
    debugImplementation(libs.ui.tooling)
    debugImplementation(libs.ui.test.manifest)
    implementation ("com.squareup.okhttp3:okhttp:4.9.0")
    implementation ("com.squareup.retrofit2:retrofit:2.11.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.11.0")
    implementation ("com.squareup.retrofit2:converter-simplexml:2.11.0")
    implementation ("com.google.android.material:material:1.2.0-alpha02")

}

=======
    implementation("com.android.volley:volley:1.2.1")
    // Chaquopy dependency
    implementation("com.chaquo.python:chaquopy:12.1.0")
}
>>>>>>> Stashed changes
