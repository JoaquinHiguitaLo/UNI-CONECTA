package com.funlam.uniconecta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        val botonlogin = findViewById<Button>(R.id.BotoniniciarSesion)

        botonlogin.setOnClickListener {
            val nombre = intent.getStringExtra("key_name")
            val age = intent.getIntExtra("key_age", 0) // 0 is default value


            val intent = Intent(this, InicioActivity::class.java)
            startActivity(intent)

        }

        val botonregistrar = findViewById<TextView>(R.id.btnregistarse)

        botonregistrar.setOnClickListener{
            val intent = Intent(this, RegistroActivity::class.java)
            startActivity(intent)
        }
    }


}
