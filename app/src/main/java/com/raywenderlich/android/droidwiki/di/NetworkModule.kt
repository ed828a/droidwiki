package com.raywenderlich.android.droidwiki.di

import com.raywenderlich.android.droidwiki.network.Homepage
import com.raywenderlich.android.droidwiki.network.WikiApi
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import javax.inject.Singleton


/**
 * Created by Edward on 7/17/2018.
 */

@Module
class NetworkModule {
    @Singleton
    @Provides
    fun provideHomepage(api: WikiApi): Homepage {
        return Homepage(api)
    }


    @Singleton
    @Provides
    fun provideWikiApi(client: OkHttpClient): WikiApi {
        return WikiApi(client)
    }

    @Singleton
    @Provides
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient()
    }
}