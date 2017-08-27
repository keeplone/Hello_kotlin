package com.example.zensea.hello_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_testintent.*

class Testintent : AppCompatActivity(), View.OnClickListener {

    fun sum2Num(a: Int, b: Int): Int = a + b


    fun minnus2Num(a: Int, b: Int): Int = a - b

    fun Multi2Num(a: Int, b: Int): Int = a * b

    fun Divide(a: Int, b: Int): String {
        try {
              return ""+a / b
        } catch (e: Exception) {
            return "Cannot divide by zero"
        }

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_testintent)


        //val Num1 = edt1.text.toString().toInt()
        //val Num2 = edt1.text.toString().toInt()

        btnplus.setOnClickListener(this)
        btnminus.setOnClickListener(this)
        btnMulti.setOnClickListener(this)
        btnDivi.setOnClickListener(this)
    }

    override fun onClick(v: View) {

        if (edt1.text.toString().isEmpty() && edt2.text.toString().isEmpty()) {
            edt1.setError("Plase Input Num1")
            edt2.setError("Plase Input Num2")
        } else if (edt1.text.toString().isEmpty()) {
            edt1.setError("Plase Input Num1")
        } else if (edt2.text.toString().isEmpty()) {
            edt2.setError("Plase Input Num2")
        } else {
            val Num1 = edt1.text.toString().toInt()
            val Num2 = edt2.text.toString().toInt()
            when (v) {
                btnplus -> {
                    Toast.makeText(this, "" + sum2Num(Num1, Num2),
                            Toast.LENGTH_SHORT).show()
                }
                btnminus -> {
                    Toast.makeText(this, "" + minnus2Num(Num1, Num2),
                            Toast.LENGTH_SHORT).show()
                }
                btnMulti -> {
                    Toast.makeText(this, "" + Multi2Num(Num1, Num2),
                            Toast.LENGTH_SHORT).show()
                }
                btnDivi -> {
                    Toast.makeText(this, "" + Divide(Num1, Num2),
                            Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}