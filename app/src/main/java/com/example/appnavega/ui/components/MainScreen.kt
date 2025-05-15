package com.example.appnavega.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.appnavega.ui.navigation.AppNavigation

@Composable
fun MainScreen(){
    val navController = rememberNavController()
    Scaffold(
        topBar = { AppTopBar() },
        bottomBar = { BottomNavBar(navController = navController) }
        ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            AppNavigation(navController = navController)
        }
    }
}