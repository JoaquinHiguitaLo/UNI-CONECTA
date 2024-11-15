package com.funlam.uniconecta

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date


@Entity(tableName = "Horario")
data class Horario(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val materia: String,
    val bloque: String,
    val salon: String,
    val horaInicio: String,
    val horaFin: String,
    val profesor: String
)