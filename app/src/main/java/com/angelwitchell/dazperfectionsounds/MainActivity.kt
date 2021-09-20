package com.angelwitchell.dazperfectionsounds

import android.graphics.Color
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.angelwitchell.dazperfectionsounds.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(R.layout.activity_main)
    }

    fun playNow(view: View) {
        var mMediaPlayer: MediaPlayer? = null
        if (mMediaPlayer == null) {
                mMediaPlayer = MediaPlayer.create(this, R.raw.daz)
                mMediaPlayer?.isLooping = false
                mMediaPlayer?.start()
                binding.playbtn.setBackgroundColor(Color.parseColor("#15609C"))
            } else mMediaPlayer?.start()
            binding.playbtn.setBackgroundColor(Color.parseColor("#2196F3"))
    }
}