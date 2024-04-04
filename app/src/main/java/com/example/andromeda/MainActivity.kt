package com.example.andromeda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.annotation.SuppressLint
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var getstarted=findViewById<Button>(R.id.get)
        getstarted.setOnClickListener {
            intent= Intent(this,login::class.java)
            startActivity(intent)
            finish()
        }
    }
}