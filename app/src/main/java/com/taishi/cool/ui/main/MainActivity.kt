package com.taishi.cool.ui.main

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import com.taishi.cool.R
import com.taishi.cool.databinding.ActivityMainBinding

import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

class MainActivity : AppCompatActivity(), HasSupportFragmentInjector {

    @Inject
    var fragmentAndroidInjector: DispatchingAndroidInjector<Fragment>? = null

    var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding!!.viewPager.adapter = MoviesPagerAdapter(supportFragmentManager)
        binding!!.tabs.setupWithViewPager(binding!!.viewPager)
        binding!!.viewPager.offscreenPageLimit = 3
    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment> {
        return fragmentAndroidInjector!!
    }


}
