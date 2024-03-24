package com.example.atalay_celik_202003011080_quiz1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var score1=0
    var score2=0
    lateinit var scoreboard:TextView
    lateinit var oyuncu1:EditText
    lateinit var oyuncu2:EditText
    lateinit var button1:Button
    lateinit var button2:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        scoreboard=findViewById(R.id.scoreBoard)
        oyuncu1=findViewById(R.id.editText1)
        oyuncu2=findViewById(R.id.editText2)
        button1=findViewById(R.id.button1)
        button2=findViewById(R.id.button2)

        button1.isEnabled=false
        button2.isEnabled=false

    }


    fun startGame(view: View){
        scoreboard.setText("${score1} - ${score2}")
        oyuncu1.isEnabled=false
        oyuncu2.isEnabled=false
        button1.setText("${oyuncu1.text.toString()} kazandı")
        button2.setText("${oyuncu2.text.toString()} kazandı")
        button1.isEnabled=true
        button2.isEnabled=true
    }
    fun increaseScore1(view: View){
        score1++
        scoreboard.setText("${score1} - ${score2}")
        if(score1==5){
            val intent=Intent(this,ResultActivity::class.java)
            intent.putExtra("name",oyuncu1.text.toString())
            startActivity(intent)
        }
    }
    fun increaseScore2(view: View){
        score2++
        scoreboard.setText("${score1} - ${score2}")
        if(score2==5){
            val intent=Intent(this,ResultActivity::class.java)
            intent.putExtra("name",oyuncu2.text.toString())
            startActivity(intent)

        }

    }
}