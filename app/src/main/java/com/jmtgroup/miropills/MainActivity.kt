package com.jmtgroup.miropills

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.jmtgroup.miropills.MainActivity.Companion.MAIN_ROUTE
import com.jmtgroup.miropills.ui.theme.MiroTheme
import com.jmtgroup.pills.ui.PILLS_GRAPH_ROUTE
import com.jmtgroup.pills.ui.pillsNavGraph
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MiroTheme {
                val mainNavController = rememberNavController()
                MainNavGraph(mainNavController)
            }
        }
    }

    companion object {
        const val MAIN_ROUTE = "route"
    }
}

@Composable
fun MainNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = PILLS_GRAPH_ROUTE,
        route = MAIN_ROUTE
    ) {
        pillsNavGraph(navController = navController)
//        scheduleNavGraph(navController = navController)
    }
}

