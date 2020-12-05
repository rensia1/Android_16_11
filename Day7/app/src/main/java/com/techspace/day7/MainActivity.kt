package com.techspace.day7

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnTest = findViewById<Button>(R.id.btnTest)
        val btnTest2 = findViewById<Button>(R.id.btnTest2)

        setListener(btnTest)
        setListener(btnTest2)
        btnTest2.setBackgroundColor(Color.GREEN)
//ja gribas parbaudit pogas krasu
//        val dr: ColorDrawable
//
//        dr = btnTest.background as ColorDrawable
//
//        if(dr.color == Color.RED){
//
//        }

    }

    private fun setListener(btn: Button){

        btn.setOnClickListener{
            if(validateString(editPsw.text.toString()) == true){
                customToast("Success!")
            }else{
                customToast("Fail!")
            }

        }
    }

    private fun validateString(psw: String): Boolean{
        if(psw.length>=8){
            return true
        }else{
            return false
        }
    }

    private fun customToast(text: String){
        Toast.makeText(this@MainActivity, text, Toast.LENGTH_SHORT).show()
    }   
}