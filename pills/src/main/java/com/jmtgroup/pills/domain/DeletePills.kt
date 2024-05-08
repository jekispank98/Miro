package com.jmtgroup.pills.domain

import com.jmtgroup.pills.domain.models.PillsModel
import javax.inject.Inject

class DeletePillsUseCase @Inject constructor(private val localSource: LocalSource) {
    suspend fun deletePills(pills: PillsModel) {
        localSource.deletePills(pills)
    }
}