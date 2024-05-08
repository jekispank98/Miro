package com.jmtgroup.datasource

import com.jmtgroup.datasource.database.PillsEntity
import com.jmtgroup.pills.domain.models.PillsModel

class Mapper {
    fun pillsEntityToPillsModel(from: PillsEntity): PillsModel {
        return PillsModel(
            id = from.id,
            name = from.name,
            duration = from.duration,
            startDate = from.startDate,
            amountPerDay = from.amountPerDay,
            amountAtTime = from.amountAtTime,
            type = from.type
        )
    }

    fun pillsModelToPillsEntity(from: PillsModel): PillsEntity {
        return PillsEntity(
            id = from.id,
            name = from.name,
            duration = from.duration,
            startDate = from.startDate,
            amountPerDay = from.amountPerDay,
            amountAtTime = from.amountAtTime,
            type = from.type
        )
    }

    fun listPillsEntityToListPillsModel(from: List<PillsEntity>): List<PillsModel> {
        return from.map { pillsEntityToPillsModel(it) }
    }

    fun listPillsModelToListPillsEntity(from: List<PillsModel>): List<PillsEntity> {
        return from.map { pillsModelToPillsEntity(it) }
    }
}