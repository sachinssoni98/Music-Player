package com.example.musicplayer

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spalsh_screen)
        supportActionBar?.hide()
        Handler(Looper.getMainLooper()).postDelayed({
            val intent= Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        },3000)
    }
}