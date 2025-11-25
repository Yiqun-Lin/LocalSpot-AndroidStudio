package com.project.localspot_androidstudio.ui.screens.auth.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay

/**
 * ViewModel para gestionar la lógica de la pantalla de Login.
 * Mantiene un estado observable (LoginUiState)
 * y envía eventos puntuales (LoginUiEvent) como navegación.
 */
class LoginViewModel : ViewModel() {

    // Estado interno mutable (solo lo modifica el ViewModel)
    private val _state = MutableStateFlow(LoginUiState())

    // Estado público inmutable observado por la UI
    val state: StateFlow<LoginUiState> = _state

    // Canal para eventos de un solo envío (ej: navegar)
    private val _events = Channel<LoginUiEvent>(Channel.BUFFERED)
    val events = _events.receiveAsFlow()

    /**
     * Actualiza el email en el estado.
     */
    fun onEmailChange(email: String) {
        _state.update { it.copy(email = email, error = null) }
    }

    /**
     * Actualiza la contraseña en el estado.
     */
    fun onPasswordChange(password: String) {
        _state.update { it.copy(password = password, error = null) }
    }

    /**
     * Valida el formulario.
     */
    private fun isFormValid(): Boolean {
        val s = _state.value
        return s.email.contains("@") && s.password.length >= 6
    }

    /**
     * Acción principal: intentar iniciar sesión.
     * Simula una llamada de red con delay.
     */
    fun onLoginClick() {
        // Validación rápida
        if (!isFormValid()) {
            _state.update { it.copy(error = "Email o contraseña no válidos") }
            return
        }

        // Simula una operación en segundo plano
        viewModelScope.launch {
            _state.update { it.copy(isLoading = true, error = null) }

            delay(1000) // simulate network delay

            val email = _state.value.email
            val password = _state.value.password

            // Simulación temporal hasta que creemos el UseCase real
            if (email == "test@example.com" && password == "password") {
                _state.update { it.copy(isLoading = false) }
                _events.send(LoginUiEvent.NavigateToHome)
            } else {
                _state.update { it.copy(isLoading = false, error = "Credenciales incorrectas") }
            }
        }
    }
}
