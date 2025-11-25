package com.project.localspot_androidstudio.domain.repository

import com.project.localspot_androidstudio.domain.model.Reservation

interface ReservationRepository {
    suspend fun createReservation(reservation: Reservation): Boolean
    suspend fun getReservationsByUser(userId: String): List<Reservation>
}