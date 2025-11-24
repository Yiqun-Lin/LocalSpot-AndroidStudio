package com.project.localspot_androidstudio.domain.usecase

import com.project.localspot_androidstudio.domain.model.Reservation
import com.project.localspot_androidstudio.domain.repository.ReservationRepository

class CreateReservationUseCase(
    private val repository: ReservationRepository
) {
    suspend operator fun invoke(reservation: Reservation): Boolean {
        return repository.createReservation(reservation)
    }
}
