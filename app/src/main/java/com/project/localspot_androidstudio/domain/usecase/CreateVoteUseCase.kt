package com.project.localspot_androidstudio.domain.usecase

import com.project.localspot_androidstudio.domain.model.Vote
import com.project.localspot_androidstudio.domain.repository.VoteRepository

class CreateVoteUseCase(
    private val repository: VoteRepository
) {
    suspend operator fun invoke(vote: Vote): Boolean {
        return repository.createVote(vote)
    }
}
