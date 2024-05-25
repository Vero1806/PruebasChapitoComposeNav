package com.example.pruebaschapito
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "first") {
        composable("first") {
            FirstScreen(navController)
        }
        composable("second") {
            SecondScreen()
        }
    }
}
