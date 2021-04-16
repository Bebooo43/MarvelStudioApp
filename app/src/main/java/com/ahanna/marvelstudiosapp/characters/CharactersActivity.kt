package com.ahanna.marvelstudiosapp.characters

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import com.ahanna.marvelstudiosapp.R
import com.ahanna.marvelstudiosapp.databinding.ActivityCharactersBinding
import com.ahanna.marvelstudiosapp.extentions.setStatusBarColor

class CharactersActivity : AppCompatActivity() {

    private val viewModel by lazy { ViewModelProvider(this)[CharactersViewModel::class.java] }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityCharactersBinding.inflate(layoutInflater).also { it.viewModel = viewModel }
        setContentView(binding.root)
        setStatusBarColor(ContextCompat.getColor(this, R.color.black_grey), true)
    }

}