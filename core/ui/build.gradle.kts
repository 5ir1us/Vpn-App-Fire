plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "org.donmacond.anvil.core.ui"
    compileSdk = 35

    defaultConfig {
        minSdk = 26
    }

    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(project(":core:common"))
    implementation(project(":core:navigation"))

    implementation(platform(libs.androidx.compose.bom))

    implementation(libs.androidx.core.ktx) // Kotlin-расширения
    implementation(libs.androidx.ui) // Базовый UI
    implementation(libs.androidx.ui.graphics) // Графика
    implementation(libs.androidx.material3) // Компоненты Material Design 3

    // 3. Инструменты для превью в Android Studio
    implementation(libs.androidx.ui.tooling.preview)
    debugImplementation(libs.androidx.ui.tooling) // debugImplementation,


    implementation(libs.lottie.compose)
    implementation(libs.androidx.activity.compose)






}