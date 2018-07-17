package com.raywenderlich.android.droidwiki.di

import com.raywenderlich.android.droidwiki.network.Wiki
import com.raywenderlich.android.droidwiki.network.WikiApi
import com.raywenderlich.android.droidwiki.ui.search.EntryPresenter
import com.raywenderlich.android.droidwiki.ui.search.EntryPresenterImpl
import dagger.Module
import dagger.Provides


/**
 * Created by Edward on 7/17/2018.
 */
@Module
class SearchActivityModule {
    @Provides
    fun provideEntryPresenter(wiki: Wiki): EntryPresenter =
            EntryPresenterImpl(wiki)

    @Provides
    fun provideWiki(wikiApi: WikiApi): Wiki =  Wiki(wikiApi)
}