package com.example.newproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.scroll_view)
    }
    fun loadLinearLayout(v: View) {
        setContentView(R.layout.linear_layout)
    }
    fun loadConstrainedLayout(v: View) {
        setContentView(R.layout.constrained_layout)
    }
    fun loadMenuLayout(v: View) {
        setContentView(R.layout.main_menu)
    }

    fun loadTableLayout(v: View) {
        setContentView(R.layout.my_table_layout)
    }
    fun loadScrollView(v: View) {
        setContentView(R.layout.scroll_view)
    }

}