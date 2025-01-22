package com.naveen.saini.newsapp.di.component

import android.app.Activity
import com.naveen.saini.newsapp.NewsMainApplication
import com.naveen.saini.newsapp.di.ActivityScope
import com.naveen.saini.newsapp.di.module.ActivityModule
import com.naveen.saini.newsapp.di.module.ApplicationModule
import dagger.Component

@ActivityScope
@Component(modules = [ActivityModule::class], dependencies = [ApplicationComponent::class])
interface ActivityComponent {
    fun inject(activity: Activity)
}