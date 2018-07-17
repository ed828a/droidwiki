package com.raywenderlich.android.droidwiki.di

import com.raywenderlich.android.droidwiki.application.WikiApplication
import com.raywenderlich.android.droidwiki.ui.homepage.HomepageActivity
import com.raywenderlich.android.droidwiki.ui.search.SearchActivity
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton


/**
 * Created by Edward on 7/16/2018.
 */

@Singleton
//@Component(modules = [
//    (AndroidInjectionModule::class),
//    (AppModule::class),
//    (BuildersModule::class),
//    NetworkModule::class
//])
@Component(modules = [AppModule::class,
    HomepageActivityModule::class,
    SearchActivityModule::class,
    NetworkModule::class])
interface AppComponent {

//    fun inject(app: WikiApplication)
    fun inject(target: HomepageActivity)
    fun inject(target: SearchActivity)
}