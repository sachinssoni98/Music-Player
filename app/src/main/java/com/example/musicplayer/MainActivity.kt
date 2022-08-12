package com.example.musicplayer

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.musicplayer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnShuffle.setOnClickListener {
            val intent= Intent(this@MainActivity, PlayerActivity::class.java)
            startActivity(intent)
        }
        binding.btnFav.setOnClickListener {
            val intent= Intent(this@MainActivity, FavoriteActivity::class.java)
            startActivity(intent)
        }
        binding.btnPlaylist.setOnClickListener {
            val intent= Intent(this@MainActivity, PlaylistActivity::class.java)
            startActivity(intent)
        }
    }

}