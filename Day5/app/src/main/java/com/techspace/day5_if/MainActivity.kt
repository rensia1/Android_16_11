package com.techspace.day5_if

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editStr = findViewById<EditText>(R.id.editStr)
        val btnCheck = findViewById<Button>(R.id.btnCheckLen)

        btnCheck.setOnClickListener{
            //1. Uztaisit, ta, lai izvadas pazinojums, ja simbolu virkne ir garaka par 8 simboliem
                //a) dabut simbolu virkni no EditText elementa
                //b) izmerit to, cik virkne ir gara
                //c) salidzinat virknes garumu
                //d) izvadit vai nu, ka ir garaka, vai nav

            var strLen = editStr.text.toString().length

            // >
            // <
            // ==
            // !=
            // >=
            // <=

            if(strLen > 8){
                Toast.makeText(this@MainActivity, "Ir lielakas par 8", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this@MainActivity, "Nav lielakas par 8", Toast.LENGTH_LONG).show()
            }




        }
    }
}