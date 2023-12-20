object Deps {
    object Timber {
        const val timber = "com.jakewharton.timber:timber:${Versions.Timber.timber_version}"
    }

    object NavComponent {
        const val nav_fragment_ktx = "androidx.navigation:navigation-fragment-ktx:${Versions.NavComponent.nav_version}"
        const val nav_ui_ktx = "androidx.navigation:navigation-ui-ktx:${Versions.NavComponent.nav_version}"
    }

    object Koin {
        val koin_android = "io.insert-koin:koin-android:${Versions.Koin.koin_android_version}"
    }

    object AndroidX {
        val app_compat = "androidx.appcompat:appcompat:${Versions.AndroidX.app_compat_version}"
        val core_ktx = "androidx.core:core-ktx:${Versions.AndroidX.android_core_version}"
    }
}