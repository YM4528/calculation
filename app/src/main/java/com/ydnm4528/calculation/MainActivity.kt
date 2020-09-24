package com.ydnm4528.calculation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnadd.setOnClickListener {
            var num1: Int = edit.text.toString().toInt()
            var num2: Int = edit.text.toString().toInt()
            var add = num1 + num2
            result.setText("$add")
        }
        btnsub.setOnClickListener {
            var num1: Int = edit.text.toString().toInt()
            var num2: Int = edit2.text.toString().toInt()
            var sub = num1 - num2
            result.setText("$sub")
        }
        btnmul.setOnClickListener {
            var num1: Int = edit.text.toString().toInt()
            var num2: Int = edit2.text.toString().toInt()
            var mul = num1 * num2
            result.setText("$mul")
        }
        btndiv.setOnClickListener {
            var num1: Int = edit.text.toString().toInt()
            var num2: Int = edit2.text.toString().toInt()
            var div = num1 / num2
            result.setText("$div")
        }
    }

}