package org.donmacond.anvil.core.ui.component

import androidx.annotation.StringRes
import org.donmacod.anvil.core.navigation.NavRoutes
import org.donmacond.anvil.core.ui.R


sealed class BottomNavItem(
    internal val route: String,
    @StringRes val titleId: Int,
    val icon: String
) {
    data object Settings : BottomNavItem(
        NavRoutes.Settings.route,
        R.string.bottom_nav_item_settings,
        "lottie/SettingNavBarAnimation.json"
    )

    data object Home : BottomNavItem(
        NavRoutes.Home.route,
        R.string.bottom_nav_item_home,
        "lottie/MainNavBarAnimation.json"
    )

    data object Info : BottomNavItem(
        NavRoutes.Profile.route,
        R.string.bottom_nav_item_info,
        "lottie/ButtonActivateVpnFire.json"
    )
}