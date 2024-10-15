package com.example.demo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        var btn = findViewById<Button>(R.id.btn1)

        btn.setOnClickListener{
            var i = Intent(this,MainActivity5::class.java)
            var aa =
            startActivity(i)

        }
    }
}

