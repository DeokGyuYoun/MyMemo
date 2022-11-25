package com.example.mymemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.mymemo.DataBase.AppDatabase
import com.example.mymemo.databinding.ActivityMainBinding
import com.example.mymemo.databinding.ActivityNoteBinding

class NoteActivity : AppCompatActivity() {

    private var noteDB : AppDatabase? = null
    private lateinit var binding: ActivityNoteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note)

        val backbutton: Button = findViewById(R.id.back_button)
        backbutton.setOnClickListener {view ->
            val intent = Intent(this@NoteActivity, MainActivity::class.java)
            startActivity(intent)
        }

        val savebutton: Button = findViewById(R.id.save_button)
        savebutton.setOnClickListener {view ->
            val intent = Intent(this@NoteActivity, MainActivity::class.java)
            startActivity(intent)
        }
            // Do something in response to button click


    }
}