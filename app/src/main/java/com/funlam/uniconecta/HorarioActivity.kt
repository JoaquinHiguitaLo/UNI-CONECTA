package com.funlam.uniconecta

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import java.util.Date

class HorarioActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_horario)


        val botoncrearmateria = findViewById<Button>(R.id.crearMateria)

        botoncrearmateria.setOnClickListener {
            val intent = Intent(this, HorarioActivity::class.java)

            insertHorario()

            startActivity(intent)
        }

        val botonregresarinicio = findViewById<ImageButton>(R.id.BotonAtrasHorario)

        botonregresarinicio.setOnClickListener {
            val intent = Intent(this, InicioActivity::class.java)
            startActivity(intent)
        }


    }
    fun insertHorario() {
        val MyDatabase = MyDatabase.getDatabase(this)
        val newhorario = Horario(
            materia = "Calculo",
            bloque = "4",
            salon = "201",
            horaInicio ="7:00AM",
            horaFin = "10:00AM",
            profesor = "Jeffry Gomez"
        )
        MyDatabase.horarioDao().insert(newhorario)
    }
}