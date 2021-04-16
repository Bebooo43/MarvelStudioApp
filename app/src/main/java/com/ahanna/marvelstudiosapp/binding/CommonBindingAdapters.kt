package com.ahanna.marvelstudiosapp.splash

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.core.graphics.drawable.toBitmap
import androidx.databinding.BindingAdapter
import jp.wasabeef.blurry.Blurry

@BindingAdapter("app:blur")
fun setBlurToImage(imageView: ImageView, imageId: Drawable?){
    Blurry.with(imageView.context).from(imageId?.toBitmap()).into(imageView)
}