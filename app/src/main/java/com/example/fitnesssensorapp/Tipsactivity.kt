package com.example.fitnesssensorapp

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class Tipsactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tips)

        val webView: WebView = findViewById(R.id.webView)
        webView.settings.javaScriptEnabled = true
        webView.settings.allowFileAccess = true
        webView.settings.loadWithOverviewMode = true

        // Load the desired Google Drive link in the WebView
        webView.loadUrl("https://www.who.int/campaigns/connecting-the-world-to-combat-coronavirus/healthyathome/healthyathome---healthy-diet")

        webView.webViewClient = object : WebViewClient() {
            override fun onPageFinished(view: WebView?, url: String?) {

            }
        }
    }
}


