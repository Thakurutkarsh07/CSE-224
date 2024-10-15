package com.example.demo

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val a = findViewById<EditText>(R.id.editTextText3)
        val b = findViewById<EditText>(R.id.editTextText2)
        val btn = findViewById<Button>(R.id.button)
        val txt = findViewById<TextView>(R.id.textView2)
        btn.setOnClickListener{
            var c = a.text.toString()
            var d = b.text.toString()
            txt.text = "Your Name is" + c + "Your Age is " + d
        }
    }
}