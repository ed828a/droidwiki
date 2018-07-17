package com.raywenderlich.android.droidwiki.di

import com.raywenderlich.android.droidwiki.network.Homepage
import com.raywenderlich.android.droidwiki.network.Wiki
import com.raywenderlich.android.droidwiki.network.WikiApi
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


/**
 * Created by Edward on 7/16/2018.
 */

@Module
class WikiModule {

    @Singleton
    @Provides
    fun provideHomepage(api: WikiApi) = Homepage(api)


    @Singleton
    @Provides
    fun provideWiki(api:WikiApi) = Wiki(api)
}