package com.xtremedevx.gmail.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Grade
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.xtremedevx.gmail.user.data.MailItem


@Composable
fun ShowMailItem(
    mailItem: MailItem,
) {
    Row(modifier = Modifier.fillMaxWidth()) {
        Box(modifier = Modifier.size(70.dp), contentAlignment = Alignment.Center) {
            Image(
                painter = painterResource(id = mailItem.profileId),
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape), contentDescription = null
            )
        }
        Column(modifier = Modifier.fillMaxWidth()) {
            Row(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = mailItem.senderName,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.weight(1f)
                )
                Text(text = mailItem.mailDate)
                Spacer(modifier = Modifier.width(5.dp))
            }
            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.Bottom) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(text = mailItem.mailSubject, modifier = Modifier.fillMaxWidth())
                    Text(text = mailItem.mailContent, modifier = Modifier.fillMaxWidth())
                }

                Icon(imageVector = Icons.Outlined.Grade, contentDescription = null)
            }
        }
    }
}
