package com.example.fintech

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var btnHome : android.widget.Button
    private lateinit var btnProfile : android.widget.Button
    private lateinit var btnSettings : android.widget.Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHome = findViewById(R.id.btnHome)
        btnProfile = findViewById(R.id.btnProfile)
        btnSettings = findViewById(R.id.btnSettings)

/*        btnHome.setOnClickListener {
            val intent = android.content.Intent(this, HomeActivity::class.java)
            intent.putExtra("username", "adena")
            startActivity(intent)
        }*/

        btnHome.setOnClickListener {
            loadFragment(HomeFragment())
        }
        btnSettings.setOnClickListener {
            loadFragment(SettingsFragment())
        }
        btnProfile.setOnClickListener {
            loadFragment(ProfileFragment())
        }
    }
    private fun loadFragment(fragment: androidx.fragment.app.Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment)
            .commitNow()
    }
}