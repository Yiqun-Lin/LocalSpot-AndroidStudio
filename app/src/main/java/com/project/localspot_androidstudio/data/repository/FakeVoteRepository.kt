package com.project.localspot_androidstudio.data.repository

import com.project.localspot_androidstudio.domain.model.Vote
import com.project.localspot_androidstudio.domain.repository.VoteRepository

class FakeVoteRepository : VoteRepository {

    private val list = mutableListOf<Vote>()

    override suspend fun createVote(vote: Vote): Boolean {
        list.add(vote)
        return true
    }

    override suspend fun getVote(userId: String, restaurantId: String): Vote? {
        return list.find { it.userId == userId && it.restaurantId == restaurantId }
    }
}
