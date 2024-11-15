package com.funlam.uniconecta

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date


@Entity(tableName = "Recordatorios")
data class Recordatorios(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val descripcion: String,
    val fecha: String,
    val lugar: String,
    val relevancia: String
)