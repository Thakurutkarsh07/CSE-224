package com.example.demo

import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        // Initialize views
        val a = findViewById<RadioGroup>(R.id.rg)
        val b = findViewById<CheckBox>(R.id.checkBox)
        val c = findViewById<CheckBox>(R.id.checkBox2)
        val d = findViewById<CheckBox>(R.id.checkBox3)
        val e = findViewById<CheckBox>(R.id.checkBox4)
        val f = findViewById<TextView>(R.id.textView5)
        val g = findViewById<TextView>(R.id.textView6)
        val h = findViewById<RadioButton>(R.id.radioButton)
        val i = findViewById<RadioButton>(R.id.radioButton2)
        val j = findViewById<RadioButton>(R.id.radioButton3)
        val k = findViewById<RadioButton>(R.id.radioButton4)
        val l = findViewById<RadioButton>(R.id.radioButton5)
        val m = findViewById<RadioButton>(R.id.radioButton6)
        val n = findViewById<RadioButton>(R.id.radioButton7)

        // Set onClickListener for CheckBoxes
        b.setOnClickListener { showToastWithSelectedSize() }
        c.setOnClickListener { showToastWithSelectedSize() }
        d.setOnClickListener { showToastWithSelectedSize() }
        e.setOnClickListener { showToastWithSelectedSize() }
    }

    private fun showToastWithSelectedSize() {
        val a = findViewById<RadioGroup>(R.id.rg)
        val selectedSizeId = a.checkedRadioButtonId
        val pizzaSize = when (selectedSizeId) {
            R.id.radioButton5 -> "Small"
            R.id.radioButton6 -> "Medium"
            R.id.radioButton7 -> "Large"
            else -> "No size selected"
        }

        val b = findViewById<CheckBox>(R.id.checkBox)
        val c = findViewById<CheckBox>(R.id.checkBox2)
        val d = findViewById<CheckBox>(R.id.checkBox3)
        val e = findViewById<CheckBox>(R.id.checkBox4)

        val selectedToppings = mutableListOf<String>()
        if (b.isChecked) selectedToppings.add("Paneer")
        if (c.isChecked) selectedToppings.add("Cheese")
        if (d.isChecked) selectedToppings.add("Jalapeno")
        if (e.isChecked) selectedToppings.add("Black Olives")

        val toppingsText = if (selectedToppings.isNotEmpty()) selectedToppings.joinToString(", ") else "No toppings selected"

        Toast.makeText(
            this,
            "Pizza Size: $pizzaSize\nToppings: $toppingsText",
            Toast.LENGTH_LONG
        ).show()
    }
}
