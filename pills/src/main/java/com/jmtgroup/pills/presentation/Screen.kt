package com.jmtgroup.pills.presentation

sealed class Screen(val route: String) {
    object PillsList: Screen(route = "pills_list")
    object AddPills: Screen(route = "add_pills")
}