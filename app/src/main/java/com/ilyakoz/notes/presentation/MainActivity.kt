package com.ilyakoz.notes.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.ilyakoz.notes.R

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        viewModel.noteList.observe(this){
            Log.d("MainActivity", it.toString())
            if (count ==0){
                count ++
                val item = it[0]
                viewModel.changeEnableState(item)
            }
        }
    }
}