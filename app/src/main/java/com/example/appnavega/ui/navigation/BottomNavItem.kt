package com.example.appnavega.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.vector.ImageVector


sealed class BottomNavItem(
    val route: String,
    val icon: ImageVector,
    val title: String
) {
    object Home : BottomNavItem("home", Icons.Default.Home, "Inicio")
    object Camera : BottomNavItem("camera", Icons.Default.Star, "Camara")
    object Chat : BottomNavItem("chat", Icons.Default.MailOutline, "Chat")
    object Profile : BottomNavItem("profile", Icons.Default.AccountCircle, "Perfil")
    object Settings : BottomNavItem("settings", Icons.Default.Settings, "Ajustes")
}