package com.raywenderlich.android.droidwiki.di

import com.raywenderlich.android.droidwiki.ui.homepage.HomepagePresenter
import com.raywenderlich.android.droidwiki.ui.homepage.HomepagePresenterImpl
import dagger.Module
import dagger.Provides


/**
 * Created by Edward on 7/16/2018.
 */

@Module
class PresenterModule {

    @Provides
    fun provideHomepagePresenter(): HomepagePresenter = HomepagePresenterImpl()
}