package com.example.relativelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var number : TextView? = null
    var btnAdd : Button? = null
    var btnSub :Button? = null
    var btnMul :Button? = null
    var btnDiv :Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        number = findViewById(R.id.tvCenter)
        btnAdd = findViewById(R.id.btnAdd)
        btnSub = findViewById(R.id.btnSubtract)
        btnMul = findViewById(R.id.btnMultiplication)
        btnDiv = findViewById(R.id.btnDivide)


        btnAdd?.setOnClickListener(){
            var getnum = number?.text.toString().toInt()
            getnum++
            number?.setText(getnum.toString())

        }

        btnSub?.setOnClickListener(){
            var getnum = number?.text.toString().toInt()
            getnum--
            number?.setText(getnum.toString())

        }
        btnMul?.setOnClickListener(){
            var getnum = number?.text.toString().toInt()
            getnum *= getnum
            number?.setText(getnum.toString())
        }
        btnDiv?.setOnClickListener(){
            var getnum = number?.text.toString().toInt()
            getnum /= getnum
            number?.setText(getnum.toString())
        }

    }
}