package com.naveen.saini.newsapp.di.module

import android.app.Activity
import android.content.Context
import com.naveen.saini.newsapp.di.ActivityScope
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val activity: Activity) {
    @ActivityScope
    @Provides
    fun provideContext():Context{
        return activity;
    }
}