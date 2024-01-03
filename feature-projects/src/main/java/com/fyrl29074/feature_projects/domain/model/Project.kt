package com.fyrl29074.feature_projects.domain.model

data class Project(
    val id: Int,
    val name: String,
    val description: String,
    val isFavourite: Boolean,
    val createdAt: String,
    val updatedAt: String,
)