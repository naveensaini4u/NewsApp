package com.naveen.saini.daggerlearningproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.naveen.saini.newsapp.NewsMainApplication
import com.naveen.saini.newsapp.R
import com.naveen.saini.newsapp.di.component.DaggerActivityComponent
import com.naveen.saini.newsapp.di.module.ActivityModule

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getDependencies()
        setContentView(R.layout.activity_main)
    }

    private fun getDependencies() {
        DaggerActivityComponent
            .builder()
            .applicationComponent((application as NewsMainApplication).applicationComponent)
            .activityModule(ActivityModule(this))
            .build()
            .inject(this)
    }
}