package com.example.fitnesssensorapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity




class CardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_card)

        supportActionBar?.hide()

        val bmi = findViewById<ImageView>(R.id.imagBMI)
        val sensor = findViewById<ImageView>(R.id.imagePedoMeter)
        val tips = findViewById<ImageView>(R.id.imageView4)
        val yoga = findViewById<ImageView>(R.id.imageView5)

        bmi.setOnClickListener {
            val intent = Intent(this, BMIactivity ::class.java)
            startActivity(intent)
        }

        sensor.setOnClickListener {
            val intent = Intent(this, PedoSensor::class.java)
            startActivity(intent)
        }

        tips.setOnClickListener {
            val intent = Intent(this, Tipsactivity::class.java)
            startActivity(intent)
        }

        yoga.setOnClickListener {
            val intent = Intent(this, YogaActivity::class.java)
            startActivity(intent)
        }

    }

}
