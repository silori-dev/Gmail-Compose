package com.xtremedevx.gmail.navigation.bottomNavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.xtremedevx.gmail.screen.MailScreen
import com.xtremedevx.gmail.screen.MeetScreen

@Composable
fun BottomNavGraph(
    navController: NavHostController,
    onNavigationIconClick: () -> Unit,
    onShowUserDialog: () -> Unit,

    ) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreens.MailScreen.route,
    ) {
        composable(
            BottomBarScreens.MailScreen.route
        ) {
            MailScreen(
                onNavigationIconClick = onNavigationIconClick,
                onShowUserDialog = onShowUserDialog
            )
        }

        composable(
            BottomBarScreens.MeetScreen.route
        )
        {
            MeetScreen(
                onNavigationIconClick = onNavigationIconClick,
                onShowUserDialog = onShowUserDialog
            )

        }
    }
}