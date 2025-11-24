package com.project.localspot_androidstudio.data.repository

import com.project.localspot_androidstudio.domain.model.Restaurant
import com.project.localspot_androidstudio.domain.repository.RestaurantRepository

class FakeRestaurantRepository : RestaurantRepository {

    private val fakeRestaurants = listOf(
        Restaurant("1", "Sushi House", "Carrer de Sants 100", 4.5f, true, ""),
        Restaurant("2", "Pizza Planet", "Carrer Aragó 250", 4.2f, true, ""),
        Restaurant("3", "La Brasa", "Carrer Marina 80", 4.8f, false, "")
    )

    override suspend fun getRestaurants(): List<Restaurant> {
        return fakeRestaurants
    }

    override suspend fun getRestaurantById(id: String): Restaurant? {
        return fakeRestaurants.find { it.id == id }
    }
}
