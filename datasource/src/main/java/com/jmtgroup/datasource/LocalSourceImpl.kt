package com.jmtgroup.datasource

import com.jmtgroup.datasource.database.PillsDao
import javax.inject.Inject

class LocalSourceImpl @Inject constructor(private val pillsDao: PillsDao): LocalSource {
    override fun addPills() {
        TODO("Not yet implemented")
    }

    override fun getAllPills() {
        TODO("Not yet implemented")
    }

    override fun deletePills() {
        TODO("Not yet implemented")
    }
}

interface LocalSource {

    fun addPills()

    fun getAllPills()

    fun deletePills()
}