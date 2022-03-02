package com.cursokotlin.mvvmexample.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.cursokotlin.mvvmexample.R
import com.cursokotlin.mvvmexample.databinding.ActivityMainBinding
import com.cursokotlin.mvvmexample.ui.viewmodel.QuoteViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val quoteViewModel: QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        quoteViewModel.onCreate()
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewmodel = quoteViewModel
        binding.lifecycleOwner = this

    }
}