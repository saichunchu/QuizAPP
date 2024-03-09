package com.example.quizapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart : Button =findViewById(R.id.btnStart)
        val etname : EditText = findViewById(R.id.etname)

        btnStart.setOnClickListener(){
            if(etname.text.isEmpty()){
                Toast.makeText(this,
                    "please enter your name",Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this, QuizQuestionActivity::class.java)
                intent.putExtra(Constants.USER_NAME,etname.text.toString())
                startActivity(intent)
                finish()



            }

        }


    }
}