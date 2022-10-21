package com.example.mymemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NoteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note)


        val button: Button = findViewById(R.id.back_button)
        button.setOnClickListener {view ->
            val intent = Intent(this@NoteActivity, MainActivity::class.java)
            startActivity(intent)
            // Do something in response to button click
        }
    }
}