package com.kr.countrysidepartner

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent = Intent(this, MainActivity::class.java)            // 실제 사용할 메인 액티비티
        startActivity(intent)
        finish()
    }
}



