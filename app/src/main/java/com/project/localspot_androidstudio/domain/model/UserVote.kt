package com.project.localspot_androidstudio.domain.model

data class UserVote(
    val userId: String,
    val votes: Map<String, List<String>>
)
