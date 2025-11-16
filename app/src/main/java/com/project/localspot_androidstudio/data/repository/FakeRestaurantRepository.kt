package com.project.localspot_androidstudio.data.repository

import com.project.localspot_androidstudio.domain.model.Restaurant
import com.project.localspot_androidstudio.domain.repository.RestaurantRepository
import kotlinx.coroutines.delay
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FakeRestaurantRepository @Inject constructor() : RestaurantRepository {

    override suspend fun getRestaurants(): List<Restaurant> {
        delay(500) // Simula tiempo de carga de una API

        return listOf(
            Restaurant(
                id = "1",
                name = "La Terraza",
                address = "C/ Mayor 10",
                rating = 4.5f,
                isOpen = true,
                imageUrl = "https://picsum.photos/seed/1/600/400"
            ),
            Restaurant(
                id = "2",
                name = "Pasta & Co",
                address = "C/ Luna 3",
                rating = 4.2f,
                isOpen = false,
                imageUrl = "https://picsum.photos/seed/2/600/400"
            ),
            Restaurant(
                id = "3",
                name = "Sushi Spot",
                address = "Av. Mar 88",
                rating = 4.8f,
                isOpen = true,
                imageUrl = "https://picsum.photos/seed/3/600/400"
            )
        )
    }

    override suspend fun getRestaurantById(id: String): Restaurant? {
        return getRestaurants().firstOrNull { it.id == id }
    }
}