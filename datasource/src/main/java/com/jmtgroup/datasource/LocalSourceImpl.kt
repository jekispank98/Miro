package com.jmtgroup.datasource

import com.jmtgroup.datasource.database.PillsDao
import javax.inject.Inject

class LocalSourceImpl @Inject constructor(private val pillsDao: PillsDao): LocalSource {
    private val mapper: Mapper by lazy { Mapper() }

    override suspend fun addPills(pillsModel: PillsModel) {
        pillsDao.addPills(mapper.pillsModelToPillsEntity(pillsModel))
    }

    override suspend fun getAllPills(): List<PillsModel> {
        return mapper.listPillsEntityToListPillsModel(pillsDao.getAllPills())
    }

    override suspend fun deletePills(pillsModel: PillsModel) {
        pillsDao.deletePills(mapper.pillsModelToPillsEntity(pillsModel))
    }
}

interface LocalSource {

    suspend fun addPills(pillsModel: PillsModel)

    suspend fun getAllPills(): List<PillsModel>

    suspend fun deletePills(pillsModel: PillsModel)
}