package com.taishi.cool.di

import com.taishi.cool.ui.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by mertsimsek on 30/05/2017.
 */
@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(modules = arrayOf(FragmentBuilderModule::class))
    internal abstract fun mainActivity(): MainActivity

//    @ContributesAndroidInjector
//    internal abstract fun movieDetailActivity(): MovieDetailActivity
}
