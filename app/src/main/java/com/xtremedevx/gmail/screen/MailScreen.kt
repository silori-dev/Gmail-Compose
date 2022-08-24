package com.xtremedevx.gmail.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import com.xtremedevx.gmail.ui.theme.LightBlue
import com.xtremedevx.gmail.user.data.mailsList
import kotlin.math.roundToInt


@Composable
fun MailScreen(
    onNavigationIconClick: () -> Unit,
    onShowUserDialog: () -> Unit,
) {
    val toolbarHeightInDp = 58.dp
    val toolbarHeightInPx = with(LocalDensity.current) {
        toolbarHeightInDp.roundToPx().toFloat()
    }
    var toolbarHeightOffset by remember {
        mutableStateOf(0f)
    }

    val nestedScrollConnection = remember {
        object : NestedScrollConnection {
            override fun onPreScroll(available: Offset, source: NestedScrollSource): Offset {
                val yOffset = available.y
                val newOffset = toolbarHeightOffset + yOffset
                toolbarHeightOffset =
                    newOffset.coerceIn(minimumValue = -toolbarHeightInPx, maximumValue = 0f)
                return Offset.Zero
            }
        }
    }



    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .nestedScroll(nestedScrollConnection),
            contentPadding = PaddingValues(top = toolbarHeightInDp),
            verticalArrangement = Arrangement.spacedBy(16.dp)

        ) {

            items(mailsList) { item ->
                ShowMailItem(mailItem = item)
            }
        }

        TopAppBar(
            elevation = 0.dp,
            backgroundColor = Color.White,
            contentColor = Color.Black,

            modifier = Modifier
                .height(toolbarHeightInDp)
                .fillMaxWidth()
                .offset { IntOffset(x = 0, y = toolbarHeightOffset.roundToInt()) }

        ) {
            Spacer(modifier = Modifier.width(8.dp))
            TextField(

                value = "",
                onValueChange = {},
                modifier = Modifier
                    .weight(1f)
                    .padding(4.dp),
                placeholder = { Text(text = "Search in mail") },

                leadingIcon = {
                    IconButton(onClick = { onNavigationIconClick() }) {
                        Icon(imageVector = Icons.Default.Menu, contentDescription = null)
                    }
                },
                trailingIcon = {

                    IconButton(onClick = { onShowUserDialog() }) {
                        Icon(
                            imageVector = Icons.Filled.Person,
                            contentDescription = null,
                        )
                    }

                },
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = LightBlue,
                    textColor = Color.Black,
                    cursorColor = Color.Black,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent
                ),

                shape = RoundedCornerShape(percent = 50)
            )


        }
        FloatingActionButton(
            onClick = {}, shape = RoundedCornerShape(percent = 30), modifier = Modifier
                .align(
                    Alignment.BottomEnd
                )
                .offset(x = (-10).dp, y = (-10).dp)
        ) {
            Icon(imageVector = Icons.Outlined.Edit, contentDescription = null)
        }

    }
}
