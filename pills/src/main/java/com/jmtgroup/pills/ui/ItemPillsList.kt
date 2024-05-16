package com.jmtgroup.pills.ui

import android.content.Context
import android.util.Log
import android.view.View
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.dp
import com.google.android.material.snackbar.Snackbar
import com.jmtgroup.pills.R
import com.jmtgroup.pills.presentation.UiPillsModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import javax.inject.Inject

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemPillsList(uiPills: UiPillsModel) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clip(RoundedCornerShape(8.dp)),
        onClick = { showSnack() }
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 18.dp, 0.dp, 18.dp)
        ) {
            Column {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(14.dp, 0.dp, 0.dp, 0.dp)
                ) {
                    Surface(
                        shape = CircleShape,
                        shadowElevation   = 4.dp,
                        onClick = { /*TODO*/ },
                        ) {

                        Image(
                            modifier = Modifier
                                .clip(CircleShape)
                                .padding(10.dp),
                            painter = painterResource(id = uiPills.iconRes),
                            contentDescription = null
                        )
                    }
                    Text(
                        modifier = Modifier.padding(36.dp, 0.dp, 0.dp, 0.dp),
                        text = uiPills.name,
                        style = MaterialTheme.typography.titleLarge
                    )
                    Spacer(modifier = Modifier.padding(28.dp, 0.dp))
                    ExtendedFloatingActionButton(
                        modifier = Modifier
                            .width(64.dp)
                            .height(24.dp),
                        onClick = { /*TODO*/ }
                    ) {
                        Text(
                            text = "Edit",
                            style = MaterialTheme.typography.bodySmall
                        )

                    }
                    Spacer(modifier = Modifier.padding(10.dp, 0.dp))
                    FloatingActionButton(
                        modifier = Modifier
                            .size(24.dp),
                        shape = CircleShape,
                        onClick = { /*TODO*/ }
                    ) {
                        Icon(Icons.Filled.KeyboardArrowDown, contentDescription = null)


                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    horizontalArrangement = Arrangement.End
                ) {
                    ExtendedFloatingActionButton(
                        modifier = Modifier
                            .width(64.dp)
                            .height(24.dp),
                        onClick = { /*TODO*/ }
                    ) {
                        Text(
                            text = uiPills.duration.toString(),
                            style = MaterialTheme.typography.bodySmall
                        )

                    }
                    Spacer(modifier = Modifier.padding(6.dp, 0.dp))
                    ExtendedFloatingActionButton(
                        modifier = Modifier
                            .wrapContentWidth()
                            .height(24.dp),
                        onClick = { /*TODO*/ }
                    ) {
                        Text(
                            text = uiPills.type,
                            style = MaterialTheme.typography.bodySmall
                        )

                    }
                    Spacer(modifier = Modifier.padding(6.dp, 0.dp))
                    ExtendedFloatingActionButton(
                        modifier = Modifier
                            .width(64.dp)
                            .height(24.dp),
                        onClick = { /*TODO*/ }
                    ) {
                        Text(
                            text = uiPills.amountPerDay.toString(),
                            style = MaterialTheme.typography.bodySmall
                        )

                    }
                    Spacer(modifier = Modifier.padding(10.dp, 0.dp))
                }
            }
//            Image(
//                modifier = Modifier
//                    .width(196.dp)
//                    .height(96.dp)
//                    .align(alignment = Alignment.CenterEnd),
//                painter = painterResource(id = R.drawable.oval_pills),
//                contentDescription = null,
//                alpha = 0.4F
//            )
        }

    }
}

fun showSnack() {
    Log.d("showSnack", "Click-Click")
}


@Preview
@Composable
fun Preview(
    @PreviewParameter(UiPillsPreviewParamsProvider::class) uiPills: UiPillsModel
) {
    ItemPillsList(uiPills)
}

class UiPillsPreviewParamsProvider : PreviewParameterProvider<UiPillsModel> {
    override val values: Sequence<UiPillsModel>
        get() = sequenceOf(
            UiPillsModel(
                id = 1,
                name = "Penicilin",
                duration = 6,
                startDate = 621977003000,
                amountPerDay = 4,
                amountAtTime = 1.5,
                type = "liquid",
                iconRes = R.drawable.ic_pill_oval
            )
        )
}