package com.example.sharedelementsanim

import android.content.Intent
import android.os.Bundle
import android.transition.Fade
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import androidx.core.view.ViewCompat


class MainActivity : AppCompatActivity() {

    private lateinit var image: ImageView
    private lateinit var send: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image = findViewById(R.id.image)
        send = findViewById(R.id.send)


        val fade = Fade()
        val decor = window.decorView
        fade.excludeTarget(decor.id, true)

        window.enterTransition = fade
        window.exitTransition = fade


        send.setOnClickListener {
            val i = Intent(this@MainActivity, MainActivity2::class.java)

            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                this@MainActivity, image, ViewCompat.getTransitionName(image)!!
            )

            startActivity(i, options.toBundle())
        }
    }
}