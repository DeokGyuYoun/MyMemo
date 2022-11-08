package com.example.mymemo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import com.example.mymemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        binding.addBtn.setOnClickListener { view ->
            val intent = Intent(this@MainActivity, NoteActivity::class.java)
            startActivity(intent)
        }

        binding.removeBtn.setOnClickListener { view ->
            val intent = Intent(this@MainActivity, DatabaseActivity::class.java)
            startActivity(intent)
        }
    }
}