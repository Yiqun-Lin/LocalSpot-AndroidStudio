package com.project.localspot_androidstudio.data.model

data class UserVote(
    val userId: String,
    val votes: Map<String, List<String>>
)
