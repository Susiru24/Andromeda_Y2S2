package com.example.andromeda

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class category : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

                setContentView(R.layout.activity_category)
                var hommm = findViewById<Button>(R.id.homm)
                hommm.setOnClickListener {
                    intent = Intent(this, home::class.java)
                    startActivity(intent)
                    finish()
                }

        var userp = findViewById<Button>(R.id.userr)
        userp.setOnClickListener {
            intent = Intent(this, userprofile::class.java)
            startActivity(intent)
            finish()
        }



    }
}