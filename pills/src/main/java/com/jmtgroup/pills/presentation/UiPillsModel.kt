package com.jmtgroup.pills.presentation

data class UiPillsModel (
    val id: Int = 0,
    val name: String,
    val duration: Int,
    val startDate: Long,
    val amountPerDay: Int,
    val amountAtTime: Double,
    val type: String,
    val iconRes: Int,
    val isExpanded: Boolean = false
)