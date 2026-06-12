plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.compose)

}

android {
    namespace = "com.example.myapplicationfloracareoffline"
    compileSdk {
        version = release(36)

    }

    defaultConfig {
        applicationId = "com.example.myapplicationfloracareoffline"
        minSdk = 24
        targetSdk = 36
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.material3)
    implementation(libs.material)
    implementation(libs.androidx.room3.common.jvm)
    implementation(libs.androidx.room3.runtime)
    implementation(libs.androidx.tracing.perfetto.handshake)
    implementation("com.squareup.retrofit2:retrofit:2.11.0")
    implementation("com.squareup.retrofit2:converter-gson:2.11.0")
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)



}


