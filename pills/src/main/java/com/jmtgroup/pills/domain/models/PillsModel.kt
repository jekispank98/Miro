package com.jmtgroup.pills.domain.models

data class PillsModel(
    val id: Int = 0,
    val name: String,
    val duration: Int,
    val startDate: Long,
    val amountPerDay: Int,
    val amountAtTime: Double,
    val type: String
)
