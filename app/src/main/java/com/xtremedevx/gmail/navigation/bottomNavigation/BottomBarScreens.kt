package com.xtremedevx.gmail.navigation.bottomNavigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material.icons.filled.Videocam
import androidx.compose.material.icons.outlined.Mail
import androidx.compose.material.icons.outlined.Videocam
import androidx.compose.ui.graphics.vector.ImageVector


sealed class BottomBarScreens(
    val route: String,
    val title: String,
    val outlinedIcon: ImageVector,
    val filledIcon: ImageVector,
) {
    object MailScreen : BottomBarScreens(
        route = "mail",
        title = "Mail",
        outlinedIcon = Icons.Outlined.Mail,
        filledIcon = Icons.Filled.Mail
    )

    object MeetScreen : BottomBarScreens(
        route = "meet",
        title = "Meet",
        outlinedIcon = Icons.Outlined.Videocam,
        filledIcon = Icons.Filled.Videocam,
    )
}