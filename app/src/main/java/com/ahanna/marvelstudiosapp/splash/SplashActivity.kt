package com.ahanna.marvelstudiosapp.splash

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.ahanna.marvelstudiosapp.characters.CharactersActivity
import com.ahanna.marvelstudiosapp.databinding.ActivitySplashBinding
import com.ahanna.marvelstudiosapp.extentions.setStatusBarColor

class SplashActivity : AppCompatActivity() {

    private val viewModel by lazy { ViewModelProvider(this)[SplashViewModel::class.java] }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySplashBinding.inflate(layoutInflater).also { it.viewModel = viewModel }
        setContentView(binding.root)
        setStatusBarColor(Color.TRANSPARENT, true)
        setUpObservers()
        viewModel.onScreenReady()
    }

    private fun setUpObservers() {
        viewModel.navigateToHome.observe(this) {
            if (it) {
                openHomeActivity()
            }
        }
    }

    private fun openHomeActivity() {
        startActivity(Intent(this, CharactersActivity::class.java))
        finish()
    }
}