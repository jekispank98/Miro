package com.jmtgroup.pills.domain

import com.jmtgroup.pills.domain.models.PillsModel

class AddPillsUseCase(private val localSource: LocalSource) {

    suspend fun addPills(pills: PillsModel) {
        localSource.addPills(pills)
    }
}