package com.project.localspot_androidstudio.domain.usecase

import com.project.localspot_androidstudio.domain.model.Restaurant
import com.project.localspot_androidstudio.domain.repository.RestaurantRepository

class GetRestaurantsUseCase(
    private val repository: RestaurantRepository
) {
    suspend operator fun invoke(): List<Restaurant> {
        return repository.getRestaurants()
    }
}
