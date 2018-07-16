package com.raywenderlich.android.droidwiki.di

import com.raywenderlich.android.droidwiki.network.Homepage
import com.raywenderlich.android.droidwiki.network.WikiApi
import com.raywenderlich.android.droidwiki.ui.homepage.HomepagePresenter
import com.raywenderlich.android.droidwiki.ui.homepage.HomepagePresenterImpl
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient


/**
 * Created by Edward on 7/16/2018.
 */

@Module
class HomepageActivityModule {

    @Provides
    fun provideHomepagePresenter(): HomepagePresenter{
        return HomepagePresenterImpl()
    }

    @Provides
    fun provideOkHttpClient(): OkHttpClient{
        return OkHttpClient()
    }

//    val client = provideOkHttpClient()
    @Provides
    fun provideWikiApi(client: OkHttpClient): WikiApi {
        return WikiApi(client)
    }

    @Provides
    fun provideHomepage(api: WikiApi): Homepage {
        return Homepage(api)
    }
}