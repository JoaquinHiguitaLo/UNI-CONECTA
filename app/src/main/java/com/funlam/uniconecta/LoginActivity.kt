package com.funlam.uniconecta

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val name = intent.getStringExtra("key_name") ?: "Unknown"
        val age = intent.getIntExtra("key_age", 0)

        Toast.makeText(this, "Name: $name, Age: $age", Toast.LENGTH_SHORT).show()
    }
}
