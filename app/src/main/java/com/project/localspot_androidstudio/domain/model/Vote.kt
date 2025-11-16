package com.project.localspot_androidstudio.domain.model

data class Vote(
    val id: String,
    val restaurantIds: List<String>,
    val createdBy: String,
    val votes: Map<String, List<String>>
)
