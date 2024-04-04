package com.example.andromeda

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class playlist : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playlist)

        var pla = findViewById<Button>(R.id.back)
        pla.setOnClickListener {
            intent = Intent(this, home::class.java)
            startActivity(intent)
            finish()
        }



    }
}