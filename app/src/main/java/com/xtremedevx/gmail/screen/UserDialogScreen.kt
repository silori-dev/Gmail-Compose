package com.xtremedevx.gmail.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.outlined.Cloud
import androidx.compose.material.icons.outlined.ManageAccounts
import androidx.compose.material.icons.outlined.PersonAdd
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.xtremedevx.gmail.R
import com.xtremedevx.gmail.navigation.drawer.DrawerItem
import com.xtremedevx.gmail.navigation.drawer.MenuItem


@Composable
fun ShowUserDialog(
    modifier: Modifier = Modifier,
    onCloseUserDialog: () -> Unit,
) {
    Dialog(onDismissRequest = { onCloseUserDialog() }) {
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(size = 8.dp))
                .background(Color.White)
                .padding(8.dp),

            ) {
            Column(
                modifier = modifier
                    .fillMaxWidth()
            ) {
// Top Header
                Row(
                    modifier = modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    IconButton(onClick = { onCloseUserDialog() }) {
                        Icon(imageVector = Icons.Default.Close, contentDescription = null)
                    }
                    Image(
                        modifier = Modifier.height(35.dp),
                        painter = painterResource(id = R.drawable.google),
                        contentDescription = null,
                        alignment = Alignment.Center
                    )

                    Spacer(modifier = Modifier.width(48.dp))
                }
                Spacer(modifier = Modifier.height(8.dp))

//User Detail
                Row(modifier = modifier) {
                    Image(
                        painter = painterResource(id = R.drawable.profile),
                        contentDescription = null,
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Column(modifier = modifier) {
                        Text(text = "XtremeDevX", fontSize = 18.sp)
                        Text(text = "XtremeDevX.........", fontSize = 12.sp)
                        Spacer(modifier = Modifier.height(16.dp))
                        OutlinedButton(
                            onClick = { /*TODO*/ },
                            shape = RoundedCornerShape(percent = 50),
                            colors = ButtonDefaults.outlinedButtonColors(
                                backgroundColor = Color.White,
                                contentColor = Color.Black,
                            )
                        ) {
                            Text(
                                text = "Google Account", fontSize = 16.sp
                            )
                        }
                        Spacer(modifier = Modifier.height(16.dp))
                    }
                }

                Divider(
                    modifier = Modifier
                        .height(1.dp)
                        .fillMaxWidth()
                )

                DrawerItem(
                    item = MenuItem(
                        id = "storage",
                        title = "Storage used : 0% fo 15 GB",
                        icon = Icons.Outlined.Cloud
                    ),
                    itemTextStyle = TextStyle(fontSize = 12.sp)
                )

                Divider(
                    modifier = Modifier
                        .height(1.dp)
                        .fillMaxWidth()
                )
                DrawerItem(
                    item = MenuItem(
                        id = "addAccount",
                        title = "Add another account",
                        icon = Icons.Outlined.PersonAdd
                    ),
                    itemTextStyle = TextStyle(fontSize = 16.sp)
                )
                DrawerItem(
                    item = MenuItem(
                        id = "manageAccounts",
                        title = "Manage accounts on this device",
                        icon = Icons.Outlined.ManageAccounts
                    ),
                    itemTextStyle = TextStyle(fontSize = 16.sp)
                )
                Divider(
                    modifier = Modifier
                        .height(1.dp)
                        .fillMaxWidth()
                )
//Privacy Policy
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        modifier = Modifier
                            .clickable { }
                            .padding(8.dp),
                        text = "Privacy Policy",
                        fontSize = 12.sp,
                        color = Color.Gray,

                        )
                    Text(text = ".", fontSize = 22.sp, fontWeight = FontWeight.Bold)
                    Text(
                        modifier = Modifier
                            .clickable { }
                            .padding(8.dp),
                        text = "Terms of service",
                        fontSize = 12.sp,
                        color = Color.Gray,


                        )
                }


            }
        }


    }
}