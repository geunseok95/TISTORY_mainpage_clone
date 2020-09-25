package com.professionalandroid.apps.androidpractice4

import android.content.Context

class Cartoon(
    //var name: String,
    var image: String

){
    fun getImageId(context: Context): Int {
        return context.resources.getIdentifier(image, "drawable", context.packageName)
    }
}