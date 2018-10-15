package com.example.nikhil.samplemvvm.viewmodel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import com.example.nikhil.samplemvvm.model.MainActivityModel
import com.example.nikhil.samplemvvm.service.MainActivityService

class MainActivityViewModel : ViewModel() {

    private var mainActivityService: MainActivityService = MainActivityService()

    fun getCounter(): LiveData<MainActivityModel> {
        return mainActivityService.getCounter()
    }

    fun incrementCounter() {
        mainActivityService.incrementCounter()
    }

}