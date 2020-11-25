package com.techspace.day4_variables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnTest = findViewById<Button>(R.id.btnTest)
        val editTest = findViewById<EditText>(R.id.editTest)
        val editNumber = findViewById<EditText>(R.id.editNumber)

        btnTest.setOnClickListener{

//            var number : Int = editTest.text.toString().toInt()
            //nakamas divas rindinas ir tas pats, tikai pa soliem
            var txt : String  = editTest.text.toString()
            var number : Int = txt.toInt()


            number = number + 2
            Toast.makeText(this@MainActivity, number.toString(), Toast.LENGTH_SHORT).show()

            number = editNumber.text.toString().toInt()
//            var text = btnTest.text.toString()
            //var gan pirmaja veida, gan otraja

//            var text2 = text + "aaa";
//
//            var number : Int
//
//            number = 2 + 5
//
//            btnTest.text = number.toString()
        }
    }
}