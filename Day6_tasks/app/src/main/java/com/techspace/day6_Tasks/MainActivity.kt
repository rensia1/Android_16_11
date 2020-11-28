package com.techspace.day6_Tasks

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
        //1. un 2. uzdevums
//
//        val lblResult = findViewById<TextView>(R.id.lblResult)
//        val btnPlus = findViewById<Button>(R.id.btnPlus)
//
//        var reverse : Boolean = false
//
//        btnPlus.setOnClickListener{
//            var txt = lblResult.text.toString()
//            var number = txt.toInt()
//
//            //ja skaitis ir lielaks par 0, bet  mazaks par 10, tad skaitam uz prieksu
//            //number + 1
//            //ja ne, tad skaitam uz atpakalu- number-1
//
//            //|| or
//            //&& and
//            if(number == 10){
//                reverse = true;
//            }
//
//            if(number == 0){
//                reverse = false
//            }
//
//            if(reverse == false){
//                number = number + 1
//            }else{
//                number = number - 1
//            }
//
//
//            //number++ - si rinda nozime to pasu, ko iepriekseja
//
//            txt = number.toString()
//            lblResult.text = txt
//        }
        //nolasit vertibu no lbl- var txt = lbl.text.toString()
        //parkonvertet uz skaitli- txt.toInt()
        //... skaitlis = skaitlis + 1
        val btnGuess = findViewById<Button>(R.id.btnGuess)
        val editGuess = findViewById<EditText>(R.id.editGuess)
        var count = 0
        //3. uzdevuma variants, bez extras
//        btnGuess.setOnClickListener{
//            val strToGuess = "programmetajs"
//            count = count + 1
//            if(editGuess.text.toString().toLowerCase() == strToGuess.toLowerCase()){
//                Toast.makeText(this@MainActivity, "Uzmineji!", Toast.LENGTH_LONG).show()
//                count = 0
//            }else{
//
//                if(count == 5){
//                    count = 0
//                    Toast.makeText(this@MainActivity, "Zaudeji!", Toast.LENGTH_LONG).show()
//                }else{
//                    Toast.makeText(this@MainActivity, "Neuzmineji!", Toast.LENGTH_LONG).show()
//                }
//
//
//            }
//        }

        var wordEntered = false
        var strToGuess: String = ""
        btnGuess.setOnClickListener{

            if(wordEntered == false){
                strToGuess = editGuess.text.toString()
                editGuess.text.clear()
                wordEntered = true
                btnGuess.text = "Guess!"

            }else{

                count = count + 1
                if(editGuess.text.toString().toLowerCase() == strToGuess.toLowerCase()){
                    Toast.makeText(this@MainActivity, "Uzmineji!", Toast.LENGTH_LONG).show()
                    count = 0
                    wordEntered = false
                    editGuess.text.clear()
                    btnGuess.text = "Enter word"
                }else{

                    if(count == 5){
                        count = 0
                        Toast.makeText(this@MainActivity, "Zaudeji!", Toast.LENGTH_LONG).show()
                        wordEntered = false
                        editGuess.text.clear()
                        btnGuess.text = "Enter word"
                    }else{
                        Toast.makeText(this@MainActivity, "Neuzmineji!", Toast.LENGTH_LONG).show()
                    }
                }
            }

        }
    }
}