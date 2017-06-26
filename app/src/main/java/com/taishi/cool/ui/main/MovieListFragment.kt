package com.taishi.cool.ui.main


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.taishi.cool.R


/**
 * A simple [Fragment] subclass.
 */
class MovieListFragment : Fragment() {


    companion object {
        fun newInstance(): MovieListFragment {
            val args = Bundle()
            val fragment = MovieListFragment()
            fragment.arguments = args
            return fragment
        }
    }



    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_movie_list, container, false)
    }

}
