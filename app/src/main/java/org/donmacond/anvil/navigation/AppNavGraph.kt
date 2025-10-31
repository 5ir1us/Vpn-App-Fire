package org.donmacond.anvil.navigation

import androidx.compose.foundation.layout.padding
import org.donmacond.anvil.R
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import org.donmacod.anvil.core.navigation.NavRoutes
import org.donmacod.anvil.core.navigation.navigateSingleTopTo
import org.donmacond.anvil.core.ui.component.AppTopBar
import org.donmacond.anvil.core.ui.component.BottomNavBar
import org.donmacond.anvil.core.ui.screens.HomeScreen
import org.donmacond.anvil.core.ui.screens.InfoScreen
import org.donmacond.anvil.core.ui.screens.SettingsScreen


@Composable
fun AppNavGraph() {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route ?: NavRoutes.Home.route

    Scaffold(
        topBar = {
            when (currentRoute) {
                NavRoutes.Home.route -> AppTopBar(R.string.app_name)
                NavRoutes.Settings.route -> AppTopBar(R.string.bottom_nav_item_settings)
            }

        },

        bottomBar = {
            BottomNavBar(
                selectedRoute = currentRoute,
                oneItemSelected = { route ->
                    if (route != currentRoute) {
                        navController.navigateSingleTopTo(route) {
                            popUpTo(navController.graph.startDestinationId) {
                                saveState = true
                            }
                        }
                    }
                }
            )
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = NavRoutes.Home.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(NavRoutes.Home.route) {
                HomeScreen(onConnectClick = {
                    navController.navigateSingleTopTo(
                        NavRoutes.Home.route
                    )
                })
            }
            composable(NavRoutes.Settings.route) {
                SettingsScreen(onSettingClick = {
                    navController.navigateSingleTopTo(
                        NavRoutes.Settings.route
                    )
                })
            }
            composable(NavRoutes.Profile.route) {
                InfoScreen(onInfoClick = {
                    navController.navigateSingleTopTo(
                        NavRoutes.Settings.route
                    )
                })
            }
        }
    }
}