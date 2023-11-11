package com.example.practice211

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun loadWeb(view:View){
        val po: ProgressBar = findViewById(R.id.progressBar)
        po.visibility = View.VISIBLE

        var runn = Runnable {

            var isload = true
            var webView = findViewById<WebView>(R.id.webView)
            webView.post(Runnable {
                webView.loadUrl("https://github.com/")
                Thread.sleep(2000)

            })
            po.visibility = View.INVISIBLE
        }
        val thread = Thread(runn)
        thread.start()
        view.isEnabled = false
    }

}