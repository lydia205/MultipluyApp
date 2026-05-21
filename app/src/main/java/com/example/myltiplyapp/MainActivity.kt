package com.example.myltiplyapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    // get id from the UI
    var num1 = findViewById<EditText>(R.id.editNumF)
    var num2 = findViewById<EditText>(R.id.editNumS)
    var btnCalc = findViewById<Button>(R.id.btnCalc)
    var txtAns =  findViewById<TextView>(R.id.txtAns)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //function
        fun Multiply (number1: Int, number2: Int) {
            var result = number1 * number2
            txtAns.text = result.toString()
        }
        //added the button 
    btnCalc.setOnClickListener {
        var n1 = num1.text.toString().toInt()
        var n2 = num2.text.toString().toInt()
    }





        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}