package com.jmtgroup.pills.domain

import com.jmtgroup.pills.domain.models.PillsModel
import kotlinx.coroutines.flow.Flow

interface LocalSource {

    suspend fun addPills(pillsModel: PillsModel)

    suspend fun getAllPills(): Flow<List<PillsModel>>

    suspend fun deletePills(pillsModel: PillsModel)
}