package com.xtremedevx.gmail.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.xtremedevx.gmail.navigation.bottomNavigation.BottomBar
import com.xtremedevx.gmail.navigation.bottomNavigation.BottomNavGraph
import com.xtremedevx.gmail.navigation.drawer.DrawerBody
import kotlinx.coroutines.launch


@Composable
fun MainScreen(navController: NavHostController) {
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    var isDialogOpen by remember {
        mutableStateOf(false)
    }
    Scaffold(
        scaffoldState = scaffoldState,
        drawerContent = {
            DrawerBody()
        }, bottomBar = {
            BottomBar(navController = navController)
        }) { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues = paddingValues)) {
            BottomNavGraph(navController = navController,
                onNavigationIconClick = {
                    scope.launch {
                        scaffoldState.drawerState.open()
                    }
                },
                onShowUserDialog = { isDialogOpen = true }
            )

            if (isDialogOpen) {
                ShowUserDialog(onCloseUserDialog = { isDialogOpen = false })
            }

        }
    }
}