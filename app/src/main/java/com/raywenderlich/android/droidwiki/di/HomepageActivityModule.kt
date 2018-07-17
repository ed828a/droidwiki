package com.raywenderlich.android.droidwiki.di

import com.raywenderlich.android.droidwiki.network.Homepage
import com.raywenderlich.android.droidwiki.network.WikiApi
import com.raywenderlich.android.droidwiki.ui.homepage.HomepagePresenter
import com.raywenderlich.android.droidwiki.ui.homepage.HomepagePresenterImpl
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import javax.inject.Singleton


/**
 * Created by Edward on 7/16/2018.
 */

@Module
class HomepageActivityModule {

    @Provides
    fun provideHomepagePresenter(homepage: Homepage): HomepagePresenter{
        return HomepagePresenterImpl(homepage)
    }
//
////    @Singleton
//    @Provides
//    fun provideHomepage(api: WikiApi): Homepage {
//        return Homepage(api)
//    }
//
//
////    @Singleton
//    @Provides
//    fun provideWikiApi(client: OkHttpClient): WikiApi {
//        return WikiApi(client)
//    }
//
////    @Singleton
//    @Provides
//    fun provideOkHttpClient(): OkHttpClient {
//        return OkHttpClient()
//    }
}