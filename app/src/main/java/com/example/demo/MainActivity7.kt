package com.example.demo

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.CallLog
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main7)
        val urlBtn = findViewById<Button>(R.id.button2)
        val navigateBtn  = findViewById<Button>(R.id.button5)
        val dialBtn = findViewById<Button>(R.id.button3)
        val cameraBtn = findViewById<Button>(R.id.button4)

        dialBtn.setOnClickListener{
            val i3 = Intent(Intent.ACTION_DIAL)
            i3.setData(Uri.parse("tel:+917417775011"))
            startActivity(i3)
        }

        urlBtn.setOnClickListener{
            val i1 = Intent(Intent.ACTION_VIEW, Uri.parse("www.google.co.in"))
            i1.setPackage("com.android.chrome")
            startActivity(i1)
        }
    }
}
