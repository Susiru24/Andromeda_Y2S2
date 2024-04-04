package com.example.andromeda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var signup = findViewById<Button>(R.id.signup)
        signup.setOnClickListener {
            intent = Intent(this, register::class.java)
            startActivity(intent)
            finish()
        }

        var signin = findViewById<Button>(R.id.signin)
        signin.setOnClickListener {
            intent = Intent(this, home::class.java)
            startActivity(intent)
            finish()
        }


    }
}
