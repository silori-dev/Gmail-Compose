package com.xtremedevx.gmail.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState
import com.xtremedevx.gmail.ui.theme.DarkBlue
import com.xtremedevx.gmail.utils.MeetScreenPages


@OptIn(ExperimentalPagerApi::class)
@Composable
fun MeetPagerScreen() {
    val pages = listOf(
        MeetScreenPages.First,
        MeetScreenPages.Second,
    )
    val pagerState = rememberPagerState()

    Column(modifier = Modifier.fillMaxSize()) {
        HorizontalPager(
            modifier = Modifier.weight(10f),
            count = 2,
            state = pagerState,
            verticalAlignment = Alignment.Top
        ) { position ->
            PagerScreen(meetScreenPage = pages[position])
        }
        HorizontalPagerIndicator(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .weight(1f),
            pagerState = pagerState,
            activeColor = DarkBlue,
            )

    }
}


@Composable
fun PagerScreen(meetScreenPage: MeetScreenPages) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            modifier = Modifier
                .size(150.dp)
                .clip(CircleShape),
            painter = painterResource(id = meetScreenPage.image), contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = meetScreenPage.title,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            modifier = Modifier.fillMaxWidth(.6f),
            textAlign = TextAlign.Center,
        )

        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = meetScreenPage.description,
            fontSize = 16.sp,
            modifier = Modifier.fillMaxWidth(.6f),
            textAlign = TextAlign.Center,
        )

    }
}