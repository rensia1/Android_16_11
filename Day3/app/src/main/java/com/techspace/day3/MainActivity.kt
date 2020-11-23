package com.techspace.day3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editName = findViewById<EditText>(R.id.editName)
        val editCity = findViewById<EditText>(R.id.editCity)
        val btnShowInfo = findViewById<Button>(R.id.btnShowInfo)

        btnShowInfo.setOnClickListener{

            var name = editName.text.toString()
            var city = editCity.text.toString()

            var result = name + " lives in " + city

            Toast.makeText(this@MainActivity, result, Toast.LENGTH_SHORT).show()
        }
    }
}