package com.project.localspot_androidstudio.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.project.localspot_androidstudio.ui.screens.StartScreen
import com.project.localspot_androidstudio.ui.screens.Login.LoginScreen

@Composable
fun AppNavGraph(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = Route.Start.route
    ) {

        composable(Route.Start.route) {
            StartScreen(
                onTimeout = {
                    navController.navigate(Route.Login.route) {
                        popUpTo(Route.Start.route) { inclusive = true }
                    }
                }
            )
        }

        composable(Route.Login.route) {
            LoginScreen()
        }
    }
}
