package com.example.pokermao

import android.app.Application
import com.example.pokermao.di.networkModule
import com.example.pokermao.di.repositoryModule
import com.example.pokermao.di.viewModelModule
import com.facebook.stetho.Stetho
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MyApplication : Application(){
    override fun onCreate() {
        super.onCreate()
//        if(buildConfig.DEBUG)
//            Stetho.initializeWithDefaults(this)
        // Start stetho
        Stetho.initializeWithDefaults(this)
        // Start Koin
        startKoin {
            androidLogger()
            androidContext(this@MyApplication)
            modules(
                listOf(
                    viewModelModule,
                    networkModule,
                    repositoryModule
                )
            )
        }
    }
}