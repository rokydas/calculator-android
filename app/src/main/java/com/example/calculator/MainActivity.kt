package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var isDot: Boolean = false
    var isSign: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        c.setOnClickListener { onClear(c) }
        plus_minus.setOnClickListener { onDigit(plus_minus) }
        percentage.setOnClickListener { onDigit(percentage) }
        divide.setOnClickListener { onDigit(divide) }
        seven.setOnClickListener { onDigit(seven) }
        eight.setOnClickListener { onDigit(eight) }
        nine.setOnClickListener { onDigit(nine) }
        multiply.setOnClickListener { onDigit(multiply) }
        four.setOnClickListener { onDigit(four) }
        five.setOnClickListener { onDigit(five) }
        six.setOnClickListener { onDigit(six) }
        minus.setOnClickListener { onDigit(minus) }
        one.setOnClickListener { onDigit(one) }
        two.setOnClickListener { onDigit(two) }
        three.setOnClickListener { onDigit(three) }
        plus.setOnClickListener { onDigit(plus) }
        zero.setOnClickListener { onDigit(zero) }
        dot.setOnClickListener { onDigit(dot) }
        cancel.setOnClickListener { onDigit(cancel) }
        equal.setOnClickListener { onDigit(equal) }
    }
    fun onClear(view: Button) {
        equation.text = ""
    }
    fun onDigit(view: Button) {
        equation.append(view.text)
    }
}