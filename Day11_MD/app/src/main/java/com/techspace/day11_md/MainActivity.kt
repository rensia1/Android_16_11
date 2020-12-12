package com.techspace.day11_md

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //sakas #1
        val btnFact = findViewById<Button>(R.id.btnFact)


        btnFact.setOnClickListener{
            //sis ir garais veids
//            var input = editFact.text.toString()
//
//            var number = input.toInt()
//
//            var result = factorial(number)
//
//            lblResult.text = result.toString()
            //sis ir isais
            sanatizeInputException()


        }

        //sakas MD
        val btnThrow = findViewById<Button>(R.id.btnThrow)
        val editDiceCount = findViewById<EditText>(R.id.editDiceCount)
        btnThrow.setOnClickListener{

            if(editDiceCount.toString().length > 0){
                var diceCount = editDiceCount.text.toString().toInt()

                if(diceCount > 0){
                    var diceValues = throwDice().toString()

                    for(i in 2..diceCount){
                        var randomNumber = throwDice()
                        diceValues = "$diceValues, $randomNumber"
                    }

                    lblResult2.text = diceValues
                }

            }

        }
    }

    fun throwDice(): Int{
        return (1..6).random()
    }

    fun sanatizeInputException(){
        val editFact = findViewById<EditText>(R.id.editFact)
        val lblResult = findViewById<TextView>(R.id.lblResult)
        try{
            var number = editFact.text.toString().toInt()
            lblResult.text = factorial(number).toString()
        }catch(ex: Exception){
            Toast.makeText(this@MainActivity, "Nepareiza ievade!",
                Toast.LENGTH_LONG).show()

        }

    }

    fun sanatizeInputLen(){
        val editFact = findViewById<EditText>(R.id.editFact)
        val lblResult = findViewById<TextView>(R.id.lblResult)

        if(editFact.text.toString().length > 0){
            var number = editFact.text.toString().toInt()
            lblResult.text = factorial(number).toString()
        }else{
            Toast.makeText(this@MainActivity, "Nepareiza ievade!",
                Toast.LENGTH_LONG).show()
        }
    }

    fun factorial(number: Int) : Int{

        var result: Int = 1

        for(i in 2..number){
//            result = result * i
            result *= i
        }

        return result
    }
}