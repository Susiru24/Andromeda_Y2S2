package com.example.andromeda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        var signup=findViewById<Button>(R.id.sign)
        signup.setOnClickListener {
            intent = Intent(this, login::class.java)
            startActivity(intent)
            finish()
        }
    }
}