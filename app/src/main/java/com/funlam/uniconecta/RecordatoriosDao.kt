package com.funlam.uniconecta

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update

@Dao
interface RecordatoriosDao {
    @Insert
    fun insert(recordatorios: Recordatorios)

    @Update
    fun update(recordatorios: Recordatorios)

    @Delete
    fun delete(recordatorios: Recordatorios)

    @Query("SELECT * FROM Recordatorios")
    fun getAllRecordatorios(): List<Recordatorios>
}