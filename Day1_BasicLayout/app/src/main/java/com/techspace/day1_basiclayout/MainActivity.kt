package com.techspace.day1_basiclayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnChangeName = findViewById<Button>(R.id.btnChangeName)
        val inputName = findViewById<EditText>(R.id.inputName)
        val lblName = findViewById<TextView>(R.id.lblName)

        btnChangeName.setOnClickListener{

            var name = inputName.text.toString()
            var city = inputName.text.toString()
            //var a = "Sveiki, " + name
            //divas slipsvitras ir komentars

            //lai paraditos Toast zina
            Toast.makeText(this@MainActivity, city + " " + name, Toast.LENGTH_SHORT).show()

            //Lai nomainitu tekstu
            lblName.text = name
        }
    }

}