package com.example.nikhil.samplemvvm.service

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import com.example.nikhil.samplemvvm.model.MainActivityModel

class MainActivityService {

    private var mCounter: MutableLiveData<MainActivityModel> = MutableLiveData()

    init {
        mCounter.value = MainActivityModel()
    }

    fun getCounter(): LiveData<MainActivityModel> = mCounter

    fun incrementCounter() {
        mCounter.value = mCounter.value?.apply {
            count++
        }
    }
}