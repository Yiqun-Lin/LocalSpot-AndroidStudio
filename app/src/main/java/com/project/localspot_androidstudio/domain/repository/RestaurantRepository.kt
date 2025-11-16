package com.project.localspot_androidstudio.domain.repository

import com.project.localspot_androidstudio.domain.model.Restaurant

interface RestaurantRepository {
    suspend fun getRestaurants(): List<Restaurant>
    suspend fun getRestaurantById(id: String): Restaurant?
}