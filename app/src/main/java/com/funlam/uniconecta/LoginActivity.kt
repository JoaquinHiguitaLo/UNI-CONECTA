package com.funlam.uniconecta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val name = intent.getStringExtra("key_name")
        val age = intent.getIntExtra("key_age", 0) // 0 is default value
        Toast.makeText(this, "Name: $name, Age: $age", Toast.LENGTH_SHORT).show()

    }
}