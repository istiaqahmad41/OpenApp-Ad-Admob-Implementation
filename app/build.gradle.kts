plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "com.example.myproject_adstesting"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.myproject_adstesting"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    //dependencies for admob
    implementation ("com.google.android.gms:play-services-ads:23.0.0")
    //dependencies for github maven repo
    //dependency code link -->
    //https://github.com/1902shubh/AdmobOpenAds
    implementation ("com.github.1902shubh:AdmobOpenAds:1.0.1")

}