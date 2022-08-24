package com.xtremedevx.gmail.navigation.drawer

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun DrawerMenuHeader() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
            .padding(16.dp)
    ) {
        Text(text = "Gmail", color = Color.Red)
    }
}

@Composable
fun DrawerBody() {
    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
    ) {
        item {
            DrawerMenuHeader()
        }


        item {
            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp), color = Color.LightGray
            )
        }

        items(navScreenItemList) { item ->
            DrawerItem(item = item)
        }
        item {
            Text(text = "All labels", modifier = Modifier.padding(horizontal = 16.dp))
        }
        items(allLabelsItemList) { item ->
            DrawerItem(item = item)
        }
        item {
            Text(text = "Google apps", modifier = Modifier.padding(horizontal = 16.dp))
        }
        items(googleAppsItemList) { item ->
            DrawerItem(item = item)
        }
        item {
            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp), color = Color.LightGray
            )
        }
        items(extraItemList) { item ->
            DrawerItem(item = item)
        }
    }
}
