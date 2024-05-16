package com.jmtgroup.pills.ui

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.jmtgroup.pills.presentation.Screen


const val PILLS_GRAPH_ROUTE = "pills"
const val SCHEDULE_GRAPH_ROUTE = "schedule"

fun NavGraphBuilder.pillsNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = Screen.PillsList.route,
        route = PILLS_GRAPH_ROUTE
    ) {
        composable(route = Screen.PillsList.route) {
            PillsListScreen(
                onAddClick = {
                    navController.navigate(
                        route = Screen.AddPills.route
                    )
                })
        }
        composable(route = Screen.AddPills.route) { AddPillsScreen() }
    }
}