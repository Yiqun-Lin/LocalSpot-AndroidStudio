package com.project.localspot_androidstudio.domain.model

data class Reservation(
    val id: String,
    val restaurantId: String,
    val datetime: Long,
    val partySize: Int,
    val userId: String
)