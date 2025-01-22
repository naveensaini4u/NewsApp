package com.naveen.saini.newsapp.di.module

import android.content.Context
import com.naveen.saini.newsapp.NewsMainApplication
import com.naveen.saini.newsapp.di.ApplicationContext
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule(private val newsMainApplication: NewsMainApplication) {

    @ApplicationContext
    @Provides
    fun getApplicationContext():Context{
        return newsMainApplication;
    }
}