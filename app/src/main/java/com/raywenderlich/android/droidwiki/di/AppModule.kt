package com.raywenderlich.android.droidwiki.di

import android.content.Context
import com.raywenderlich.android.droidwiki.application.WikiApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


/**
 * Created by Edward on 7/16/2018.
 */

@Module
class AppModule(private val app: WikiApplication) {

    @Singleton
    @Provides
    fun provideContext(): Context = app
}