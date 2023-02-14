package com.example.sharedelementsanim

import android.os.Bundle
import android.transition.Fade
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val fade = Fade()
        val decor = window.decorView

        fade.excludeTarget(decor.id, true)

        window.enterTransition = fade
        window.exitTransition = fade

    }
}