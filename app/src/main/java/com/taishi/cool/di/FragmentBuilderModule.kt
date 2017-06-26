package com.taishi.cool.di

import com.taishi.cool.ui.main.MovieListFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by mertsimsek on 30/05/2017.
 */
@Module
abstract class FragmentBuilderModule {

    @ContributesAndroidInjector
    internal abstract fun contributeMovieListFragment(): MovieListFragment
}
