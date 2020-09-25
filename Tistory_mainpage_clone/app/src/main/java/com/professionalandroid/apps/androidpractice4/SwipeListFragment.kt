package com.professionalandroid.apps.androidpractice4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager

class SwipeListFragment: Fragment {
    constructor():super()


    companion object {
        val cartoonList = arrayListOf(
            Cartoon("cartoon1"),
            Cartoon("cartoon2"),
            Cartoon("cartoon3"),
            Cartoon("cartoon4")
        )
    }

    private lateinit var mViewPager: ViewPager
    private var madapter:MyPagerAdapter? = MyPagerAdapter(cartoonList)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_swipe,container,false)
        mViewPager =view!!.findViewById(R.id.mViewPager)
        val adapter = MyPagerAdapter(cartoonList)
        mViewPager.adapter = adapter

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val context = view.context
        mViewPager.adapter = madapter
    }

}