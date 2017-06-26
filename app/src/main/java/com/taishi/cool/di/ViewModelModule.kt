package com.taishi.cool.di

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.taishi.cool.viewmodel.MovieViewModelFactory

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * Created by mertsimsek on 19/06/2017.
 */

@Module
abstract class ViewModelModule {

//    @Binds
//    @IntoMap
//    @ViewModelKey(MovieListViewModel::class)
//    internal abstract fun bindsMovieListViewModel(movieListViewModel: MovieListViewModel): ViewModel
//
//    @Binds
//    @IntoMap
//    @ViewModelKey(MovieDetailViewModel::class)
//    internal abstract fun bindsMovieDetailViewModel(movieDetailViewModel: MovieDetailViewModel): ViewModel

    @Binds
    internal abstract fun bindsViewModelFactory(movieViewModelFactory: MovieViewModelFactory): ViewModelProvider.Factory
}
