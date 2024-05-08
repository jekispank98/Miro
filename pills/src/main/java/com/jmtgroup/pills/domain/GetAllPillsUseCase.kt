package com.jmtgroup.pills.domain

import com.jmtgroup.pills.domain.models.PillsModel
import kotlinx.coroutines.flow.Flow

class GetAllPillsUseCase(private val localSource: LocalSource) {
    suspend fun getAllPills(): Flow<List<PillsModel>> {
        return localSource.getAllPills()
    }
}