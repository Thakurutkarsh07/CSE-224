package com.example.demo

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioGroup
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity4 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)
        val a = findViewById<RadioGroup>(R.id.rg1)

        a.setOnCheckedChangeListener{ group,checked->
//            val selectedPizzaId = a.checkedRadioButtonId

        val pizzaName = when (checked){
            R.id.radioButton11 -> "Margherita"
            R.id.radioButton12 -> "Farm House"
            R.id.radioButton13 ->"Cheese Burst"
            else -> ""

        }
            Toast.makeText(this,
                "$pizzaName selected",
                Toast.LENGTH_SHORT
            ).show()
        }

        val rag = findViewById<RadioGroup>(R.id.rg2)
        rag.setOnCheckedChangeListener{group,checked ->
            val size = when(checked){
                R.id.sml -> "Small"
                R.id.md -> "Medium"
                R.id.lg -> "Large"
                else -> ""
            }

            Toast.makeText(this,"$size",Toast.LENGTH_SHORT).show()
        }


        val b = findViewById<CheckBox>(R.id.chk1)
        val c = findViewById<CheckBox>(R.id.chk2)
        val d  = findViewById<CheckBox>(R.id.chk3)

        b.setOnCheckedChangeListener{_,_ ->selectedToppings() }
        c.setOnCheckedChangeListener { _, _ -> selectedToppings() }
        d.setOnCheckedChangeListener { _, _ -> selectedToppings() }


    }

    private fun selectedToppings(){
        val selectedToppings = mutableListOf<String>()
        val chkd1 = findViewById<CheckBox>(R.id.chk1)
        val chkd2 = findViewById<CheckBox>(R.id.chk2)
        val chkd3 = findViewById<CheckBox>(R.id.chk3)
        if (chkd1.isChecked) selectedToppings.add("Paneer")
        if (chkd2.isChecked) selectedToppings.add("Cheese")
        if (chkd3.isChecked) selectedToppings.add("Jalapeno")

        Toast.makeText(this,"${selectedToppings.joinToString ( "," )} Selected",Toast.LENGTH_SHORT).show()
    }
}
