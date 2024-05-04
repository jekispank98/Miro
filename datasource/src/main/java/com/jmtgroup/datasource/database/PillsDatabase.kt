package com.jmtgroup.datasource.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [PillsEntity::class], version = 1, exportSchema = false)
abstract class PillsDatabase : RoomDatabase() {
    abstract fun pillsDao(): PillsDao

    companion object {

        @Volatile
        private var INSTANCE: PillsDatabase? = null

        fun getPillsDataBase(context: Context): PillsDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext, PillsDatabase::class.java, "pills_db"
                )
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                return instance
            }

        }
    }


}