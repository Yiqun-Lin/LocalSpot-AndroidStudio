package com.project.localspot_androidstudio.ui.navigation

sealed class Route(val route: String) {
    data object Start : Route("start")
    data object Login : Route("login")
}
