package com.ahanna.marvelstudiosapp.splash

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashViewModel(
    private val coroutineDispatcher: CoroutineDispatcher = Dispatchers.Main
) : ViewModel() {

    val navigateToHome = MutableLiveData<Boolean>()

    fun onScreenReady() {
        viewModelScope.launch(coroutineDispatcher) {
            delay(3000)
            navigateToHome.value = true
        }
    }
}

