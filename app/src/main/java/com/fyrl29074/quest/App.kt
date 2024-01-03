package com.fyrl29074.quest

import android.app.Application
import com.fyrl29074.quest.di.KoinInitializer

class App: Application() {
    private val koin = KoinInitializer()

    override fun onCreate() {
        super.onCreate()

        koin.init(this)
    }
}