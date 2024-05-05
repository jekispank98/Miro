package com.jmtgroup.datasource.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface PillsDao {

    @Insert
    fun addPills(pills: PillsEntity)

    @Query("Select * FROM pills_db")
    fun getAllPills(): List<PillsEntity>

    @Delete
    fun deletePills(pills: PillsEntity)
}