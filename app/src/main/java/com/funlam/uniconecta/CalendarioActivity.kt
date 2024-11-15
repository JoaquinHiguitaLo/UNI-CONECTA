package com.funlam.uniconecta

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import java.util.Date

class CalendarioActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_calendario)


        val AgregarCalendario = findViewById<Button>(R.id.my_calendar)

        AgregarCalendario.setOnClickListener {
            val intent = Intent(this, CalendarioActivity::class.java)

            insertCalendar()

            startActivity(intent)
        }

        val BotonAtrasCalendario = findViewById<ImageButton>(R.id.BotonAtrasCalendario)

        BotonAtrasCalendario.setOnClickListener {
            val intent = Intent(this, InicioActivity::class.java)
            startActivity(intent)
        }


    }
    fun insertCalendar() {
        val MyDatabase = MyDatabase.getDatabase(this)
        val newCalendar = Recordatorios(
            descripcion = "Festival teatro",
            fecha = "20 de Noviembre",
            lugar = "Teatro Torrente",
            relevancia ="Importante"
        )
        MyDatabase.recordatoriosDao().insert(newCalendar)
    }
}