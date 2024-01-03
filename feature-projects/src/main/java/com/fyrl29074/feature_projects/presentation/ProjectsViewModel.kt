package com.fyrl29074.feature_projects.presentation

import androidx.lifecycle.ViewModel
import com.fyrl29074.feature_projects.domain.usecase.GetProjectsUseCase

class ProjectsViewModel(
    private val getProjectsUseCase: GetProjectsUseCase,
) : ViewModel() {
}