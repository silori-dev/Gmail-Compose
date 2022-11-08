package com.xtremedevx.gmail.navigation.bottomNavigation

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.xtremedevx.gmail.ui.theme.SkyBlue

@Composable
fun RowScope.NavigationItem(
    label: @Composable () -> Unit,
    icon: @Composable () -> Unit,
    selected: Boolean,
    onClickEvent: () -> Unit,
) {
    val backgroundColor by animateColorAsState(targetValue = if (selected) SkyBlue else Color.White)

    Box(
        modifier = Modifier.weight(1f),
        contentAlignment = Alignment.Center,
    ) {
        Surface(
            modifier = Modifier.wrapContentWidth(),
            shape = CircleShape,
            color = backgroundColor,
        ) {
            Row(
                modifier = Modifier
                    .selectable(
                        selected = selected, onClick = onClickEvent
                    )
                    .padding(horizontal = 16.dp, vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically

            ) {
                icon()
                AnimatedVisibility(visible = selected) {
                    label()
                }
            }
        }
    }
}