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









//
//                    val permissionState =
//                        rememberPermissionState(permission = Manifest.permission.READ_EXTERNAL_STORAGE)
//
//                    val lifecycleOwner = LocalLifecycleOwner.current
//                    DisposableEffect(
//                        key1 = lifecycleOwner,
//                        effect = {
//                            val observer = LifecycleEventObserver { _, event ->
//                                if(event == Lifecycle.Event.ON_START) {
//                                    permissionState.launchPermissionRequest()
//                                }
//                            }
//                            lifecycleOwner.lifecycle.addObserver(observer)
//                            onDispose {
//                                lifecycleOwner.lifecycle.removeObserver(observer)
//                            }
//                        }
//                    )
//
//                    ShowItemList()


//
//
//@Composable
//fun ShowItemList() {
//    val context = LocalContext.current
//    val repo = MyRepositoryImpl()
//    val list = repo.getAllDocumentFromStorage(context)
//
//    LazyColumn {
//        items(list) { item ->
//            Column(modifier = Modifier.fillMaxWidth()) {
//                Text(text = "File Title = ${item.fileTitle}")
//                Text(text = "File Path = ${item.fileUri}")
//                Text(text = "File Size ${item.size}")
//                Spacer(modifier = Modifier.height(10.dp))
//            }
//        }
//    }
//
//}





