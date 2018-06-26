package com.example.nikhil.samplemvp.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.nikhil.samplemvp.presenter.MainActivityPresenter
import com.example.nikhil.samplemvp.R
import com.example.nikhil.samplemvp.contract.ContractInterface.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View {

    private var presenter: MainActivityPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainActivityPresenter(this)
    }

    override fun initView() {
        counterTextView.text = presenter?.getCounter()
        clickButton.setOnClickListener { presenter?.incrementValue() }
    }

    override fun updateViewData() {
        counterTextView.text = presenter?.getCounter()
    }
}
