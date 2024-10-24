package com.funlam.uniconecta

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("key_name", "Carolina")  // String
            intent.putExtra("key_age", 25)        // Int
            startActivity(intent)
        }
    }
}