package com.taishi.cool.di

import android.app.Application
import android.arch.persistence.room.Room
import com.taishi.cool.data.remote.ApiConstants
import com.taishi.cool.data.remote.RequestInterceptor
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

/**
 * Created by yamasakitaishi on 2017/06/26.
 */
@Module(includes = arrayOf(ViewModelModule::class))
class AppModule {

    @Provides
    @Singleton
    internal fun provideOkHttpClient(): OkHttpClient {
        val okHttpClient = OkHttpClient.Builder()
        okHttpClient.connectTimeout(ApiConstants.TIMEOUT_IN_SEC, TimeUnit.SECONDS)
        okHttpClient.readTimeout(ApiConstants.TIMEOUT_IN_SEC, TimeUnit.SECONDS)
        okHttpClient.addInterceptor(RequestInterceptor())
        return okHttpClient.build()
    }

//    @Provides
//    @Singleton
//    internal fun provideRetrofit(okHttpClient: OkHttpClient): MovieDBService {
//        val retrofit = Retrofit.Builder()
//                .baseUrl(ApiConstants.ENDPOINT)
//                .addConverterFactory(GsonConverterFactory.create())
//                .client(okHttpClient)
//                .build()
//
//        return retrofit.create(MovieDBService::class.java!!)
//    }
//
//    @Provides
//    @Singleton
//    internal fun provideMovieDatabase(application: Application): MovieDatabase {
//        return Room.databaseBuilder(application, MovieDatabase::class.java!!, "aa.db").build()
//    }
//
//    @Provides
//    @Singleton
//    internal fun provideMovieDao(movieDatabase: MovieDatabase): MovieDao {
//        return movieDatabase.movieDao()
//    }

}
