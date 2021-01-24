package com.edouardondo.moneyclap.controller.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import com.edouardondo.moneyclap.R

class SplashScreenActivity : AppCompatActivity() {

    // Variables
    lateinit var topAnimation : Animation
    lateinit var bottomAnimation : Animation

    lateinit var logo_image : ImageView
    lateinit var slogan_text: TextView

    private val SPLASH_SCREEN: Long = 5000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash_screen)

        //Animations
        topAnimation = AnimationUtils.loadAnimation(this, R.anim.top_animation)
        bottomAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)

        // Hooks
        logo_image = findViewById<ImageView>(R.id.logo_image)
        slogan_text = findViewById<TextView>(R.id.slogan_text)

        // set Animation
        logo_image.animation = topAnimation
        slogan_text.animation = bottomAnimation

        Handler().postDelayed({
            val intent = Intent(this@SplashScreenActivity, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_SCREEN)

    }
}
