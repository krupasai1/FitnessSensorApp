package com.example.fitnesssensorapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.fitnesssensorapp.ui.theme.FitnessSensorAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Hide the system UI (status bar and navigation bar)
        window.decorView.systemUiVisibility = android.view.View.SYSTEM_UI_FLAG_FULLSCREEN

        // Hides the action bar
        actionBar?.hide()

        // Delayed navigation to another activity
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, CardActivity::class.java)
            startActivity(intent)
        }, 3000)
    }
}




