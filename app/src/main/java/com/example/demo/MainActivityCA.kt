package com.example.demo

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivityCA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_ca)
        val btn1 = findViewById<Button>(R.id.btn)
        btn1.setOnClickListener{
            Toast.makeText(this,"Welcome Back!",Toast.LENGTH_SHORT).show()
        }
    }
}