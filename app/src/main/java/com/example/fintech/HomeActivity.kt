package com.example.fintech

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HomeActivity : AppCompatActivity() {
    private lateinit var tvHome: androidx.appcompat.widget.AppCompatTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        tvHome = findViewById(R.id.tv_home)
        var username: String? = intent.getStringExtra("username")
        tvHome.text = (username)
    }
}