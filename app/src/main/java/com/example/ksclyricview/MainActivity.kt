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

    private fun addLyrics() {
        val lyrics = ArrayList<String>()
//        lyrics.add("狼烟起 江山北望")
//        lyrics.add("龙起卷 马长嘶 剑气如霜")
//        lyrics.add("狼烟起 江山北望")
//        lyrics.add("龙旗卷 马长嘶 剑气如霜")
//        lyrics.add("心似黄河水茫茫")
//        lyrics.add("二十年纵横间 谁能相抗")
//        lyrics.add("恨欲狂 长刀所向")
//        lyrics.add("多少手足忠魂埋骨它乡")
//        lyrics.add("何惜百死报家国")
//        lyrics.add("忍叹惜 更无语 血泪满眶")
//        lyrics.add("马蹄南去 人北望")
//        lyrics.add("人北望 草青黄 尘飞扬")
//        lyrics.add("我愿守土复开疆")
//        lyrics.add("堂堂中国要让四方")
//        lyrics.add("来贺")

        lyrics.add("all work and no play");
        lyrics.add("makes Jack a dull boy.");

        lyricView.setLyrics(lyrics)
    }

}
