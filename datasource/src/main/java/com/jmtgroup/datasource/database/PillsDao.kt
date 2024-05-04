package com.jmtgroup.datasource.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface PillsDao {

    @Insert
    suspend fun addPills(pills: PillsEntity)

    @Query("Select * FROM pills_db")
    suspend fun getAllPills(): List<PillsEntity>

    @Delete
    suspend fun deletePills(pills: PillsEntity)
}