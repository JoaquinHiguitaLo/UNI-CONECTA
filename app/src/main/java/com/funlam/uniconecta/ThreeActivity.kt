package com.funlam.uniconecta

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThreeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)

        // TextView para mostrar el nombre
        val textViewNombre: TextView = findViewById(R.id.textView3)
        val nombre: String? = intent.getStringExtra("Joaquin Higuita Lopez")
        textViewNombre.text = nombre ?: "Joaquin Higuita Lopez"

        // TextView para mostrar la descripción
        val textViewDescripcion: TextView = findViewById(R.id.textView5)
        val descripcion: String? = intent.getStringExtra("Estudiante de desarrollo de software")
        textViewDescripcion.text = descripcion ?: "Estudiante de desarrollo de software"

        // TextView para mostrar el correo electrónico
        val textViewEmail: TextView = findViewById(R.id.textView7)
        val email: String? = intent.getStringExtra("Joaquin.higuitalo@amigo.edu.co")
        textViewEmail.text = email ?: "Joaquin.higuitalo@amigo.edu.co"
    }
}
