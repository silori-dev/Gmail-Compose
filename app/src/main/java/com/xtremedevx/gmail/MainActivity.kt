package com.xtremedevx.gmail

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.xtremedevx.gmail.screen.MainScreen
import com.xtremedevx.gmail.ui.theme.GmailTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GmailTheme {
                val navController = rememberNavController()
                MainScreen(
                    navController = navController
                )
            }
        }
    }
}
