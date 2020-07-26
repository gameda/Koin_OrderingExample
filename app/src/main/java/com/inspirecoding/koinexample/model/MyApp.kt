package com.inspirecoding.koinexample.model

import android.app.Application
import com.inspirecoding.koinexample.model.appModul
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/*
It is where Koin is initialised. It means in our case, that we will extend the MyApp with Application.
 */
class MyApp: Application(){

    /*
     In the onCreate() method we will initialise Koin. For this we will call the  startKoin{}
     function and declare all the properties inside it.
     */
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MyApp)
            modules(listOf(appModul))
        }
    }
}