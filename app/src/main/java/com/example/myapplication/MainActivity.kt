package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val webView = findViewById<WebView>(R.id.webView)

        webView.webViewClient = WebViewClient()

        // Enable JavaScript for YouTube
        val webSettings: WebSettings = webView.settings

        webSettings.javaScriptEnabled = true

        // Load YouTube
        webView.loadUrl("https://www.youtube.com/")
    }

    override fun onBackPressed() {
        val webView = findViewById<WebView>(R.id.webView)
        if (webView.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}
