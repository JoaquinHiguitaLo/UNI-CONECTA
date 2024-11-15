package com.funlam.uniconecta

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update

@Dao
interface DeberesDao {
    @Insert
    fun insert(deberes: Deberes)

    @Update
    fun update(deberes: Deberes)

    @Delete
    fun delete(deberes: Deberes)

    @Query("SELECT * FROM Deberes")
    fun getAllDeberes(): List<Deberes>
}