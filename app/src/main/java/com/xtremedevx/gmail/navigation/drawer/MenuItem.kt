package com.xtremedevx.gmail.navigation.drawer

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.ui.graphics.vector.ImageVector

data class MenuItem(
    val id: String,
    val title: String,
    val icon: ImageVector,
)

val navScreenItemList = listOf(
    MenuItem(
        id = "primary",
        title = "Primary",
        icon = Icons.Outlined.Inbox,
    ),
    MenuItem(
        id = "promotion",
        title = "Promotion",
        icon = Icons.Outlined.Sell,
    ),
    MenuItem(
        id = "social",
        title = "Social",
        icon = Icons.Outlined.Group,
    ),

    )

val googleAppsItemList = listOf(
    MenuItem(
        id = "calendar",
        title = "Calendar",
        icon = Icons.Outlined.CalendarToday,
    ),
    MenuItem(
        id = "contacts",
        title = "Contacts",
        icon = Icons.Outlined.AccountCircle,
    ),

    )


val allLabelsItemList = listOf(
    MenuItem(
        id = "starred",
        title = "Starred",
        icon = Icons.Outlined.Star,
    ),
    MenuItem(
        id = "snoozed",
        title = "Snoozed",
        icon = Icons.Outlined.Schedule,
    ),
    MenuItem(
        id = "important",
        title = "Important",
        icon = Icons.Outlined.LabelImportant,
    ),
    MenuItem(
        id = "sent",
        title = "Sent",
        icon = Icons.Outlined.Send,
    ),
    MenuItem(
        id = "scheduled",
        title = "Scheduled",
        icon = Icons.Outlined.ScheduleSend,
    ),
    MenuItem(
        id = "outbox",
        title = "Outbox",
        icon = Icons.Outlined.Outbox,
    ),
    MenuItem(
        id = "draft",
        title = "Draft",
        icon = Icons.Outlined.Drafts,
    ),
    MenuItem(
        id = "allMails",
        title = "All mail",
        icon = Icons.Outlined.MarkAsUnread,
    ),
    MenuItem(
        id = "spam",
        title = "Spam",
        icon = Icons.Outlined.Report,
    ),
    MenuItem(
        id = "bin",
        title = "Bin",
        icon = Icons.Outlined.Delete,
    ),

    )


val extraItemList = listOf(
    MenuItem(
        id = "settings",
        title = "Settings",
        icon = Icons.Outlined.Settings,
    ),
    MenuItem(
        id = "helpAndFeedBack",
        title = "Help and feedback",
        icon = Icons.Outlined.Help,
    ),

    )

