package com.project.localspot_androidstudio.domain.repository

import com.project.localspot_androidstudio.domain.model.Vote

interface VoteRepository {
    suspend fun createVote(vote: Vote): Boolean
    suspend fun getVote(id: String): Vote?
}