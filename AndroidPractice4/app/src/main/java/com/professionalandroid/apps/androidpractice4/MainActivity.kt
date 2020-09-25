package com.professionalandroid.apps.androidpractice4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var listList = arrayListOf<ListData>(
        ListData("listimage1", "1   Design Palette 훑어보기 - Text편 -1", "조회 3" ),
        ListData("listimage2", "2   Design Palette 훑어보기 - Text편 -2", "조회 6" ),
        ListData("listimage3", "3   Design Palette 훑어보기 - Button편", "조회 3" )
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listadapter =  MyAdapter(listList, this)
        listview.adapter = listadapter
    }
}