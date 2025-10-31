package org.donmacod.anvil.core.navigation

sealed class NavRoutes(
    val route: String
) {
    object Settings: NavRoutes("Settings")
    object Profile: NavRoutes("Profile")
    object Home : NavRoutes("Home")
}

