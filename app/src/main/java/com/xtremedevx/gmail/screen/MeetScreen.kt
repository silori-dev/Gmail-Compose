package com.xtremedevx.gmail.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.xtremedevx.gmail.R
import com.xtremedevx.gmail.ui.theme.DarkBlue

@Composable
fun MeetScreen(
    onNavigationIconClick: () -> Unit,
    onShowUserDialog: () -> Unit,
) {
    Scaffold(modifier = Modifier.fillMaxSize(),

        topBar = {

            CenterAlignTopAppbar(
                onShowUserDialog = onShowUserDialog,
                onNavigationIconClick = onNavigationIconClick
            )
        }
    ) { paddingValues ->
        Surface(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize(),
        ) {
            Column(
                modifier = Modifier.padding(horizontal = 8.dp)
            ) {
                Spacer(modifier = Modifier.height(16.dp))
                Button(
                    onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(percent = 50),
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = DarkBlue,
                        contentColor = Color.White,
                    )
                ) {
                    Text(text = "New meeting")
                }
                OutlinedButton(
                    onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(percent = 50),
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.outlinedButtonColors(
                        backgroundColor = Color.White,
                        contentColor = DarkBlue,
                    )
                ) {
                    Text(text = "Meet new people")
                }
                MeetPagerScreen()

            }
        }
    }
}

@Composable
fun CenterAlignTopAppbar(
    onShowUserDialog: () -> Unit,
    onNavigationIconClick: () -> Unit,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp),

        verticalAlignment = Alignment.CenterVertically,
    ) {
        IconButton(onClick = { onNavigationIconClick() }, modifier = Modifier.size(42.dp)) {
            Icon(imageVector = Icons.Default.Menu, contentDescription = null)
        }

        Text(
            modifier = Modifier.weight(1f),
            text = "Meet",
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
        )
        Image(
            painter = painterResource(id = R.drawable.profile),
            contentDescription = null,
            modifier = Modifier
                .size(42.dp)
                .clickable { onShowUserDialog() }
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
    }
}
