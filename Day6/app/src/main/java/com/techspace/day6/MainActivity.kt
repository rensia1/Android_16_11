package com.techspace.day6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lblResult = findViewById<TextView>(R.id.lblResult)
        val btnPlus = findViewById<Button>(R.id.btnPlus)

        btnPlus.setOnClickListener{
            var txt = lblResult.text.toString()
            var number = txt.toInt()

            number = number + 1
            //number++ - si rinda nozime to pasu, ko iepriekseja
            txt = number.toString()
            lblResult.text = txt
        }
        //nolasit vertibu no lbl- var txt = lbl.text.toString()
        //parkonvertet uz skaitli- txt.toInt()
        //... skaitlis = skaitlis + 1
    }
}