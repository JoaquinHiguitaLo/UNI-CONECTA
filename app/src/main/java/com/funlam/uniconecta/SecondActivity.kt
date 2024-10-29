package com.funlam.uniconecta

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.funlam.uniconecta.compose.BottomAppBarMapa

class SecondActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val text = intent.getStringExtra("key_text")
        val name = intent.getStringExtra("key_name")

        Toast.makeText(this, "$text $name", Toast.LENGTH_SHORT).show()


        val buttonIniciarSesion = findViewById<Button>(R.id.buttonIniciarSesion)
        buttonIniciarSesion.setOnClickListener{
            val intent = Intent(this, ThreeActivity::class.java)

            startActivity(intent)
        }
    }
}

