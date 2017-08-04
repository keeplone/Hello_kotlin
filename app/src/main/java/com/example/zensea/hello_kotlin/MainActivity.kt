package com.example.zensea.hello_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import  kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1.setText("Hello Kotlin")
        btn2.setText("Android")

        btn1.setOnClickListener { Toast.makeText(this, "สวัสดี kotlin", Toast.LENGTH_SHORT).show() }
        btn2.setOnClickListener { Toast.makeText(this, "Android Develop", Toast.LENGTH_SHORT).show() }
    }
}
