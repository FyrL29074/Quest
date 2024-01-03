package com.fyrl29074.feature_projects.domain.usecase

import com.fyrl29074.feature_projects.domain.repository.ProjectsRepository

class GetProjectsUseCaseImpl(
    private val projectsRepository: ProjectsRepository
): GetProjectsUseCase {
    override suspend fun getProjects() = projectsRepository.getProjects()
}