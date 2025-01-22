package com.naveen.saini.newsapp.di.component

import com.naveen.saini.newsapp.NewsMainApplication
import com.naveen.saini.newsapp.di.module.ApplicationModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {
    fun inject(application: NewsMainApplication)
}