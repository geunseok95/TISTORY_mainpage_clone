package com.professionalandroid.apps.androidpractice4

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.item.view.*

class MyAdapter(var mdata: MutableList<ListData>, var mcontext: Context) : BaseAdapter() {


    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertview: View?, parent: ViewGroup?): View {
        val view: View = LayoutInflater.from(parent!!.context).inflate(R.layout.item, null)
        val holder: ViewHolder
        val title = view.title
        val visitor = view.visitor
        val image = view.listview_image

        val item = mdata[position]
        val resourceId = mcontext.resources.getIdentifier(item.picture, "drawable", mcontext.packageName)

        image.setImageResource(resourceId)
        title.text = item.title
        visitor.text = item.visitor

        return view

    }

    override fun getItem(p0: Int): Any {
        return mdata[p0]
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return mdata.size
    }

    private class ViewHolder{
        var mtitle: TextView? = null
        var mvisitor: TextView? = null
        var mimage: ImageView? = null
    }

}