package com.project.localspot_androidstudio.domain.usecase

import com.project.localspot_androidstudio.domain.model.Vote
import com.project.localspot_androidstudio.domain.repository.VoteRepository

class GetVoteUseCase(
    private val repository: VoteRepository
) {
    suspend operator fun invoke(userId: String, restaurantId: String): Vote? {
        return repository.getVote(userId, restaurantId)
    }
}
