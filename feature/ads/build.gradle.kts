plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "org.donmacond.anvil.core.ads"
    compileSdk = 35

    defaultConfig {
        minSdk = 26
    }
}

dependencies {

    implementation(libs.applovin.sdk)
    implementation(libs.ironsource.sdk)
    implementation(libs.admob)

}