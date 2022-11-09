package com.example.mymemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mymemo.DataBase.AppDatabase

class DatabaseActivity : AppCompatActivity() {
    private var catDb : AppDatabase? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_database)

        catDb = AppDatabase.getInstance(this)

        val r = Runnable {
            // 데이터에 읽고 쓸때는 쓰레드 사용
        }

        val thread = Thread(r)
        thread.start()
    }
}