package com.jmtgroup.pills.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jmtgroup.pills.R
import com.jmtgroup.pills.presentation.UiPillsModel

@Preview
@Composable
fun PillsListScreen(onAddClick: () -> Unit = {}) {
    Scaffold(modifier = Modifier
        .systemBarsPadding()) { innerPadding ->
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            val sample = UiPillsModel(
                id = 1,
                name = "Penicilin",
                duration = 6,
                startDate = 621977003000,
                amountPerDay = 4,
                amountAtTime = 1.5,
                type = "liquid",
                iconRes = R.drawable.ic_pill_oval
            )
            val item = UiPillsModel(
                id = 1,
                name = "Penicilin",
                duration = 6,
                startDate = 621977003000,
                amountPerDay = 4,
                amountAtTime = 1.5,
                type = "liquid",
                iconRes = R.drawable.ic_pill_oval
            )
            val list =
                listOf(item, item, item, item, item, item, item, item, item, item, item, item)
            InitPillsList(list)
            FloatingActionButton(
                onClick = onAddClick,
                modifier = Modifier
                    .padding(16.dp)
                    .align(Alignment.BottomEnd),
                shape = CircleShape
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_add),
                    contentDescription = null
                )
            }
        }
    }
}

@Composable
fun InitPillsList(list: List<UiPillsModel>) {
    LazyColumn(
        contentPadding = PaddingValues(6.dp),
        verticalArrangement = Arrangement.spacedBy(6.dp)
    ) {
        items(items = list) { pill ->
            ItemPillsList(uiPills = pill)
        }
    }
}

@Composable
@Preview(showBackground = true)
fun PillsListScreenPreview() {
    PillsListScreen()
}


