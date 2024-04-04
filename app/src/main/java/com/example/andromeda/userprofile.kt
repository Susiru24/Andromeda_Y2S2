package com.example.andromeda

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class userprofile : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_userprofile)

        var userpp = findViewById<Button>(R.id.hom)
        userpp.setOnClickListener {
            intent = Intent(this, home::class.java)
            startActivity(intent)
            finish()
        }

        var ccat = findViewById<Button>(R.id.cat)
        ccat.setOnClickListener {
            intent = Intent(this, category::class.java)
            startActivity(intent)
            finish()
        }


        var lout = findViewById<Button>(R.id.lgout)
        lout.setOnClickListener {
            intent = Intent(this, login::class.java)
            startActivity(intent)
            finish()
        }
    }
}