package com.example.demo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FlipkartLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_flipkart_login)
        val btn1 =findViewById<Button>(R.id.btn)
        btn1.setOnClickListener{
            var i = Intent(this,flipkartHome::class.java)
            startActivity(i)

        }
    }
}