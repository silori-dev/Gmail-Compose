package com.xtremedevx.gmail.navigation.drawer

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DrawerItem(
    item: MenuItem,
    itemTextStyle: TextStyle = TextStyle(fontSize = 18.sp),
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(imageVector = item.icon, contentDescription = null)
        Spacer(modifier = Modifier.width(16.dp))
        Text(text = item.title, style = itemTextStyle)
    }
}