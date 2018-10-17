package com.example.nikhil.samplemvvm.view

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.nikhil.samplemvvm.R
import com.example.nikhil.samplemvvm.model.MainActivityModel
import com.example.nikhil.samplemvvm.viewmodel.MainActivityViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val counterViewModel = ViewModelProviders.of(this@MainActivity).get(MainActivityViewModel::class.java)

        counterViewModel.getCounter().observe(this@MainActivity, Observer<MainActivityModel> { counter ->
            counterTextView.text = counter?.count.toString()
        })

        clickButton.setOnClickListener { counterViewModel.incrementCounter() }
    }

}
