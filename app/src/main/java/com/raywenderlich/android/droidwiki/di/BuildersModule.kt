package com.raywenderlich.android.droidwiki.di

import com.raywenderlich.android.droidwiki.ui.homepage.HomepageActivity
import com.raywenderlich.android.droidwiki.ui.search.SearchActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


/**
 * Created by Edward on 7/16/2018.
 */

@Module
abstract class BuildersModule {

    @ContributesAndroidInjector(modules = arrayOf(HomepageActivityModule::class))
    abstract fun bindHomepageActivity(): HomepageActivity

    @ContributesAndroidInjector
    abstract fun bindSearchActivity(): SearchActivity
}