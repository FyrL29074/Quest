object Deps {
    object Timber {
        const val timber = "com.jakewharton.timber:timber:${Versions.Timber.timber_version}"
    }

    object NavComponent {
        const val nav_fragment_ktx = "androidx.navigation:navigation-fragment-ktx:${Versions.NavComponent.nav_version}"
        const val nav_ui_ktx = "androidx.navigation:navigation-ui-ktx:${Versions.NavComponent.nav_version}"
    }

    object Koin {
        const val koin_android = "io.insert-koin:koin-android:${Versions.Koin.koin_android_version}"
    }

    object AndroidX {
        const val app_compat = "androidx.appcompat:appcompat:${Versions.AndroidX.app_compat_version}"
        const val core_ktx = "androidx.core:core-ktx:${Versions.AndroidX.android_core_version}"
    }

    object Coroutines {
        const val coroutines_android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.Coroutines.coroutines_version}"
    }
}