package com.project.localspot_androidstudio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.delay
import com.project.localspot_androidstudio.ui.screens.StartScreen
import com.project.localspot_androidstudio.ui.screens.LoginScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Estado que controla qué pantalla mostrar
            var showStartScreen by remember { mutableStateOf(true) }

            LaunchedEffect(Unit) {
                delay(3000) // 3000 ms = 3 segundos
                showStartScreen = false
            }
            // Esperamos 3 segundos y luego mostramos LoginScreen

            if (showStartScreen) {
                StartScreen()  // Mostramos la pantalla de Start
            } else {
                LoginScreen()  // Mostramos pantalla de login
            }
        }
    }
}
