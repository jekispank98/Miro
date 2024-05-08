package com.jmtgroup.datasource

import com.jmtgroup.datasource.database.PillsDao
import com.jmtgroup.pills.domain.LocalSource
import com.jmtgroup.pills.domain.models.PillsModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class LocalSourceImpl @Inject constructor(private val pillsDao: PillsDao): LocalSource {
    private val mapper: Mapper by lazy { Mapper() }

    override suspend fun addPills(pillsModel: PillsModel) {
        pillsDao.addPills(mapper.pillsModelToPillsEntity(pillsModel))
    }

    override suspend fun getAllPills(): Flow<List<PillsModel>> {
        return pillsDao.getAllPills().map { mapper.listPillsEntityToListPillsModel(it) }
    }

    override suspend fun deletePills(pillsModel: PillsModel) {
        pillsDao.deletePills(mapper.pillsModelToPillsEntity(pillsModel))
    }
}
