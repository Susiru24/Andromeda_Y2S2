package com.example.andromeda

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class home : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var userp = findViewById<Button>(R.id.user)
        userp.setOnClickListener {
            intent = Intent(this, userprofile::class.java)
            startActivity(intent)
            finish()
        }


        var chome = findViewById<Button>(R.id.cate)
        chome.setOnClickListener {
            intent = Intent(this, category::class.java)
            startActivity(intent)
            finish()
        }

        var suni = findViewById<Button>(R.id.sunidi)
        suni.setOnClickListener {
            intent = Intent(this, playlist::class.java)
            startActivity(intent)
            finish()
        }


    }
}