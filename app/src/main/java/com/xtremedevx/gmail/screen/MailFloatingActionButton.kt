package com.xtremedevx.gmail.screen

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.xtremedevx.gmail.R

@Composable
fun MailFloatingActionButton(
    extended: () -> Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    FloatingActionButton(
        onClick = { onClick() },
        modifier = modifier
    ) {
        Row(
            modifier = Modifier.padding(16.dp)
        ) {

            Icon(imageVector = Icons.Outlined.Edit, contentDescription = null)

            AnimatedVisibility(visible = extended()) {
                Text(
                    text = stringResource(id = R.string.compose), modifier = Modifier
                        .padding(start = 8.dp, top = 3.dp)
                )

            }
        }
    }
}