package com.funlam.uniconecta

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Deberes")
data class Deberes(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val materia: String,
    val descripcion: String,
    val fecha: String,
    val relevancia: String
)