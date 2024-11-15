package com.funlam.uniconecta

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class RegistroActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_registrarse)


        val btnregreregis = findViewById<Button>(R.id.btnRegistarseusu)

        btnregreregis.setOnClickListener{
            val intent = Intent(this, InicioActivity::class.java)

            val name = findViewById<EditText>(R.id.edit_regnombre).text.toString()
            val correo = findViewById<EditText>(R.id.edit_regcorreo).text.toString()
            val usuario = findViewById<EditText>(R.id.edit_regusuario).text.toString()
            val contrasena = findViewById<EditText>(R.id.edit_regcontraseña).text.toString()


            val newUsuario = Usuario(
                contrasena = contrasena,
                nombre = name,
                correo = correo,
                usuario = usuario
            )


            insertUsuario(newUsuario)


            startActivity(intent)


        }
                
            }
            private fun insertUsuario(usuario: Usuario) {

            lifecycleScope.launch(Dispatchers.IO) {

            val db = MyDatabase.getDatabase(this@RegistroActivity)

            db.usuarioDao().insert(usuario)
        }
    }
        }


