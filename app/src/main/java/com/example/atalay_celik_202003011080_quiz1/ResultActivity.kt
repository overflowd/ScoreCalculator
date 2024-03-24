package com.example.atalay_celik_202003011080_quiz1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    lateinit var kazanan:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        kazanan=findViewById(R.id.textView2)

        val name=intent.getStringExtra("name")

        kazanan.setText("${name}")



    }
    fun restartGame(view: View){
        val intent=Intent(this,MainActivity::class.java)
        startActivity(intent)
        finish()



    }
}