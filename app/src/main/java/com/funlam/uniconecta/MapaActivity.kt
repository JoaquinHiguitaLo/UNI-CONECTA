package com.funlam.uniconecta

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.ComponentActivity


class MapaActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_mapa)

            val botonmapa = findViewById<ImageButton>(R.id.BotonAtrasMapa)

            botonmapa.setOnClickListener {
                val intent = Intent(this, InicioActivity::class.java)
                startActivity(intent)
            }


                
            }
        }


