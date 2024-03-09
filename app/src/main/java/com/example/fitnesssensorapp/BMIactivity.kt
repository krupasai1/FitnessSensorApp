package com.example.fitnesssensorapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BMIactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi)

        val height = findViewById<EditText>(R.id.etHeight)
        val weight = findViewById<EditText>(R.id.etWeight)
        val btnCalc = findViewById<Button>(R.id.btnBMI)
        val tvResult = findViewById<TextView>(R.id.tvResult)
        val tvClassification = findViewById<TextView>(R.id.tvClassification)

        btnCalc.setOnClickListener {
            val h = (height.text.toString()).toFloat() / 100
            val w = (weight.text.toString()).toFloat()
            val r = w / (h * h)

            tvResult.text = String.format("%.1f BMI", r)
            tvResult.textSize = 32f // Change text size as needed
            tvResult.visibility = TextView.VISIBLE // Make sure to make the TextView visible

            // Display classification based on BMI value
            val classification = when {
                r < 18.5 -> "Underweight"
                r <= 25 -> "Normal"
                else -> "Overweight"
            }
            tvClassification.text = classification
            tvClassification.visibility = TextView.VISIBLE // Make sure to make the TextView visible
        }
    }
}
