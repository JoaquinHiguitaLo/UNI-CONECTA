package com.funlam.uniconecta

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Usuarios")
data class Usuario(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val contrasena: String,
    val nombre: String,
    val correo: String,
    val usuario: String
)