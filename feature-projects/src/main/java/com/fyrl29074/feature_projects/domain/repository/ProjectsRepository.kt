package com.fyrl29074.feature_projects.domain.repository

import com.fyrl29074.feature_projects.domain.model.Project

interface ProjectsRepository {
    suspend fun getProjects(): List<Project>
}