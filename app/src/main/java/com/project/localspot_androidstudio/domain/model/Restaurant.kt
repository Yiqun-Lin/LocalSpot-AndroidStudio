package com.project.localspot_androidstudio.domain.model

data class Restaurant(
    val id: String,
    val name: String,
    val address: String,
    val rating: Float,
    val isOpen: Boolean,
    val imageUrl: String
)
