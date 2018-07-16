package com.raywenderlich.android.droidwiki.di

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


/**
 * Created by Edward on 7/16/2018.
 */

@Module
class AppModule(private val app: Application) {

    @Singleton
    @Provides
    fun provideContext(application: Application) = app
//    fun provideContext(application: Application) = application.applicationContext
}