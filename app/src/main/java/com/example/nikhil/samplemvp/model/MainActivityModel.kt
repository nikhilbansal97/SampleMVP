package com.example.nikhil.samplemvp.model

import com.example.nikhil.samplemvp.contract.ContractInterface.*

class MainActivityModel: Model {

    private var mCounter = 0

    override fun getCounter()= mCounter

    override fun incrementCounter() {
        mCounter++
    }
}