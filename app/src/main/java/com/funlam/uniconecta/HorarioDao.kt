package com.funlam.uniconecta

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update

@Dao
interface HorarioDao {
    @Insert
    fun insert(horario: Horario)

    @Update
    fun update(horario: Horario)

    @Delete
    fun delete(horario: Horario)

    @Query("SELECT * FROM Horario")
    fun getAllHorario(): List<Horario>
}