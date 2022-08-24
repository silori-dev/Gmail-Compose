package com.xtremedevx.gmail.navigation.bottomNavigation

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomBar(
    navController: NavController
) {
    val screens = listOf(
        BottomBarScreens.MailScreen,
        BottomBarScreens.MeetScreen,
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    BottomNavigation {

        screens.forEach { screen ->
            AddItem(
                screen = screen,
                navController = navController,
                currentDestination = currentDestination,
            )
        }
    }
}

@Composable
fun RowScope.AddItem(
    screen: BottomBarScreens,
    navController: NavController,
    currentDestination: NavDestination?
) {
    val selected = currentDestination?.hierarchy?.any {
        it.route == screen.route
    } == true

    BottomNavigationItem(
        label = {
            Text(text = screen.title)
        },
        selected = selected,
        icon = {
            Icon(
                imageVector = if (selected) screen.filledIcon else screen.outlinedIcon,
                contentDescription = null
            )
        },
        onClick = {
            navController.navigate(screen.route) {
                popUpTo(navController.graph.findStartDestination().id)
                launchSingleTop = true
            }
        },


        )

}















