package com.project.localspot_androidstudio.data.repository

import com.project.localspot_androidstudio.domain.model.Reservation
import com.project.localspot_androidstudio.domain.repository.ReservationRepository

class FakeReservationRepository : ReservationRepository {

    private val list = mutableListOf<Reservation>()

    override suspend fun createReservation(reservation: Reservation): Boolean {
        list.add(reservation)
        return true
    }

    override suspend fun getReservationsByUser(userId: String): List<Reservation> {
        return list.filter { it.userId == userId }
    }
}
