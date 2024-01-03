package com.fyrl29074.feature_projects.di

import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module
import com.fyrl29074.feature_projects.presentation.ProjectsViewModel
import com.fyrl29074.feature_projects.domain.usecase.GetProjectsUseCase
import com.fyrl29074.feature_projects.domain.usecase.GetProjectsUseCaseImpl
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.bind

val FeatureProjectsKoinModule = module {

    viewModelOf(::ProjectsViewModel)
    factoryOf(::GetProjectsUseCaseImpl) bind GetProjectsUseCase::class
}