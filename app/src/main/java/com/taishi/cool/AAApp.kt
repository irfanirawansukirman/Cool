package com.taishi.cool

import android.app.Activity
import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

/**
 * Created by yamasakitaishi on 2017/06/26.
 */
class AAApp: Application(), HasActivityInjector{

    @Inject
    val activityDispatchingInjector: DispatchingAndroidInjector<Activity>? = null

    override fun onCreate() {
        super.onCreate()
    }

    private fun intialozeComponent() {
//        DaggerAppComponent
    }

    override fun activityInjector(): AndroidInjector<Activity> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}