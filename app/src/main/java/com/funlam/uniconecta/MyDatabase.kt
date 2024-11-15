package com.funlam.uniconecta

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters


@Database(entities = [Horario::class, Recordatorios::class, Usuario::class,Deberes::class], version = 4)

@TypeConverters(DateConverter::class)
abstract class MyDatabase : RoomDatabase() {
    abstract fun horarioDao(): HorarioDao
    abstract fun usuarioDao(): UsuarioDao
    abstract fun recordatoriosDao(): RecordatoriosDao
    abstract fun deberesDao(): DeberesDao

    companion object {
        @Volatile
        private var INSTANCE: com.funlam.uniconecta.MyDatabase? = null

        fun getDatabase(context: Context): com.funlam.uniconecta.MyDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                   MyDatabase::class.java,
                    "horario_database"
                )
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }
}