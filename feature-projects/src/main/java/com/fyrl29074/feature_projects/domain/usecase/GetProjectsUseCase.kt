package com.fyrl29074.feature_projects.domain.usecase

import com.fyrl29074.feature_projects.domain.model.Project

interface GetProjectsUseCase {
    suspend fun getProjects(): List<Project>
}