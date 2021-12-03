package com.example.myapplication.ui.splashActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.myapplication.MainActivity
import com.example.myapplication.R

class SplashActivity : AppCompatActivity() {
    lateinit var hanler:Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        hanler = Handler()
        hanler.postDelayed({
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        },3000)

    }

}