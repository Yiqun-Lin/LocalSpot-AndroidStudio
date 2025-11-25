package com.project.localspot_androidstudio.domain.model

data class Vote(
    val userId: String,
    val restaurantId: String,
    val score: Int,
    val comment: String? = null
)
