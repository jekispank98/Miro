package com.jmtgroup.datasource.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "pills_db")
data class PillsEntity(

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo
    val name: String,
    @ColumnInfo
    val duration: Int,
    @ColumnInfo
    val startDate: Long,
    @ColumnInfo
    val amountPerDay: Int,
    @ColumnInfo
    val amountAtTime: Double,
    @ColumnInfo
    val type: String

)