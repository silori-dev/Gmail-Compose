package com.xtremedevx.gmail.utils

import androidx.annotation.DrawableRes
import com.xtremedevx.gmail.R

sealed class MeetScreenPages(
    @DrawableRes
    val image: Int,
    val title: String,
    val description: String
) {
    object First : MeetScreenPages(
        image = R.drawable.share_link,
        title = "Get a link that you can share",
        description = "Tap New meeting to get a link that you can send to people that you want to meet"
    )

    object Second : MeetScreenPages(
        image = R.drawable.safety_first,
        title = "Your meeting is safe",
        description = "No one can join a meeting unless invited or admitted by the host"
    )

}
