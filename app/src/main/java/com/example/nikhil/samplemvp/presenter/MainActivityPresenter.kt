package com.example.nikhil.samplemvp.presenter

import com.example.nikhil.samplemvp.contract.ContractInterface.*
import com.example.nikhil.samplemvp.model.MainActivityModel

class MainActivityPresenter(_view: View): Presenter {

    private var view: View = _view
    private var model: Model = MainActivityModel()

    init {
        view.initView()
    }

    override fun incrementValue() {
        model.incrementCounter()
        view.updateViewData()
    }

     override fun getCounter() = model.getCounter().toString()

}