package com.funlam.uniconecta

import android.content.Intent

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity


class AlertasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_alertas)


            val button = findViewById<ImageButton>(R.id.BotonAtrasAlertas)

            button.setOnClickListener {
                val intent = Intent(this, InicioActivity::class.java)
                startActivity(intent)
            }


            val boton= findViewById<Button>(R.id.crearAlerta)

            boton.setOnClickListener {
                val intent = Intent(this, AlertasActivity::class.java)

                insertAlertas()


                startActivity(intent)


            }

    }
    fun insertAlertas() {
        val MyDatabase = MyDatabase.getDatabase(this)
        val newDeberes = Deberes(
            materia = "Calculo",
            descripcion = "Parcial trigonometria",
            fecha = "27 de Noviembre",
            relevancia ="Importante"
        )
        MyDatabase.deberesDao().insert(newDeberes)
    }



}



