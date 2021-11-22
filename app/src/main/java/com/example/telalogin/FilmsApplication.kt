package com.example.telalogin

import android.app.Application
import com.example.telalogin.di.ApiModuleKoin
import com.orhanobut.hawk.Hawk
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class FilmsApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        Hawk.init(this).build()

        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@FilmsApplication)
            modules(ApiModuleKoin.modules)
        }
    }
}