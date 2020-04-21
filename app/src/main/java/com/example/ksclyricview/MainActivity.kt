package com.example.ksclyricview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addLyrics()
    }

    private fun addLyrics(){
        val lyrics = ArrayList<String>()
        lyrics.add("狼烟起 江山北望")
        lyrics.add("龙起卷 马长嘶 剑气如霜")
        lyrics.add("")
        lyricView.setLyrics(lyrics)
    }

}
