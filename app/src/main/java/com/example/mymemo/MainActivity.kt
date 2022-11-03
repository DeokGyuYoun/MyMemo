package com.example.mymemo

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mymemo.databinding.ActivityMainBinding
import android.content.Intent
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {

    private var isFabOpen = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 플로팅 버튼 클릭시 에니메이션 동작 기능
        fabMain.setOnClickListener {
            toggleFab()
        }

        // 플로팅 버튼 클릭 이벤트 - 카메라
        fabCamera.setOnClickListener {
            Toast.makeText(this, "카메라 버튼 클릭!", Toast.LENGTH_SHORT).show()
        }

        // 플로팅 버튼 클릭 이벤트 - 수정
        fabEdit.setOnClickListener {
            Toast.makeText(this, "수정 버튼 클릭!", Toast.LENGTH_SHORT).show()
        }
    }


    /***
     *  플로팅 액션 버튼 클릭시 동작하는 애니메이션 효과 세팅
     */
    private fun toggleFab() {
        Toast.makeText(this, "메인 플로팅 버튼 클릭 : $isFabOpen", Toast.LENGTH_SHORT).show()

        // 플로팅 액션 버튼 닫기 - 열려있는 플로팅 버튼 집어넣는 애니메이션 세팅
        if (isFabOpen) {
            ObjectAnimator.ofFloat(fabCamera, "translationY", 0f).apply { start() }
            ObjectAnimator.ofFloat(fabEdit, "translationY", 0f).apply { start() }
            fabMain.setImageResource(R.drawable.ic_baseline_add_24)

            // 플로팅 액션 버튼 열기 - 닫혀있는 플로팅 버튼 꺼내는 애니메이션 세팅
        } else {
            ObjectAnimator.ofFloat(fabCamera, "translationY", -200f).apply { start() }
            ObjectAnimator.ofFloat(fabEdit, "translationY", -400f).apply { start() }
            fabMain.setImageResource(R.drawable.ic_baseline_clear_24)
        }

        isFabOpen = !isFabOpen

    }
}