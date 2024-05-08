package com.jmtgroup.miropills.ui.navigation

sealed class Route(route: String) {
    object PillsGraph : Route(route = "pills_route")
    object ScheduleGraph : Route(route = "schedule_route")
}