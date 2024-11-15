package com.funlam.uniconecta

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update

@Dao
interface UsuarioDao {

    @Insert
    fun insert(usuario: Usuario)


    @Update
    fun update(usuario: Usuario)


    @Delete
    fun delete(usuario: Usuario)


    @Query("SELECT * FROM Usuarios")
    fun getAllUsuarios(): List<Usuario>
}