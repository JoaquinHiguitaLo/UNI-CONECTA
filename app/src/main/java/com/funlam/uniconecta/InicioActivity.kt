package com.funlam.uniconecta

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.ComponentActivity


class InicioActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

            setContentView(R.layout.activity_inicio)


            val botonmapa = findViewById<ImageButton>(R.id.BotonMapa)

            botonmapa.setOnClickListener {
                val intent = Intent(this, MapaActivity::class.java)
                startActivity(intent)
            }


            val botonalertas = findViewById<ImageButton>(R.id.BotonAlertas)

            botonalertas.setOnClickListener {
                val intent = Intent(this, AlertasActivity::class.java)
                startActivity(intent)
            }

            val botonhorario = findViewById<ImageButton>(R.id.BotonHorario)

            botonhorario.setOnClickListener {
                val intent = Intent(this, HorarioActivity::class.java)
                startActivity(intent)
            }


            val botonregresar = findViewById<ImageButton>(R.id.BotonAtrasInicio)

            botonregresar.setOnClickListener {
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            }

            val botoncalendario = findViewById<ImageButton>(R.id.BotonCalendario)

            botoncalendario.setOnClickListener {
                val intent = Intent(this, CalendarioActivity::class.java)
                startActivity(intent)
            }




                
            }
        }


