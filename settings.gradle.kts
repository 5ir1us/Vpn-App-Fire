pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://android-sdk.is.com/")
        }
    }
}

rootProject.name = "anvil"
include(":app")
// ---------- CORE ----------
include(":core:common")
include(":core:datastore")
include(":core:ui")
include(":core:navigation")
// ---------- FEATURES ----------
include(":feature:connection")
include(":feature:ads")
// ---------- VPN ----------
include(":vpn:libxray")
include(":vpn:service")
