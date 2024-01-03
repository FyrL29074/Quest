package com.fyrl29074.quest.di

import android.content.Context
import com.fyrl29074.feature_projects.di.FeatureProjectsKoinModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class KoinInitializer {

    private val allModules = listOf(
        FeatureProjectsKoinModule,
    )

    fun init(appContext: Context) {
        startKoin {
            androidContext(appContext)
            modules(allModules)
        }
    }
}
