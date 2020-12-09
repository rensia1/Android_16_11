package com.techspace.day11_loops

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalc = findViewById<Button>(R.id.btnCalc)
        val editNumber = findViewById<EditText>(R.id.editNumber)
        val lblResult = findViewById<TextView>(R.id.lblResult)

        btnCalc.setOnClickListener{

            var input: String = editNumber.text.toString()
            var number = input.toInt()

//            var result = fact(number)
//
//            lblResult.text = result.toString()

            //------
            //atsevisks piemers, ka generet random skaitli
            var rand = (0..10).random() //1-9
//
//            var result = fact(rand)
//            lblResult.text = result.toString()

            ///
        }

    }

    fun fact(number: Int) :Int{
        var result = 1

        for(i in 2..number){
            //result = result * i
            result*=i
        }

        return result
    }
}