package com.project.localspot_androidstudio.ui.screens.auth.login

sealed class LoginUiEvent {
    data object NavigateToHome : LoginUiEvent()
}
