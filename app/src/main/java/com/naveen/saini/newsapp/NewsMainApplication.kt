package com.naveen.saini.newsapp

import android.app.Application
import com.naveen.saini.newsapp.di.component.ApplicationComponent
import com.naveen.saini.newsapp.di.component.DaggerApplicationComponent
import com.naveen.saini.newsapp.di.module.ApplicationModule

class NewsMainApplication : Application() {
    lateinit var applicationComponent: ApplicationComponent
    override fun onCreate() {
        super.onCreate()
    }

    fun getDependencies() {
        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
        applicationComponent.inject(this)
    }
}