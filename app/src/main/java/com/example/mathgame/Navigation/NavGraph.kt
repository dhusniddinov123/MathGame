package com.example.mathgame.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.mathgame.screen.GameScreen
import com.example.mathgame.screen.HomeScreen
import com.example.mathgame.screen.SplashScreen

@Composable
fun NavGraph (navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = Screens.Splash.route)
    {
        composable(route = Screens.Splash.route){
            SplashScreen(navController)
        }
        composable(route = Screens.Home.route){
            HomeScreen()
        }
        composable(route = Screens.Game.route){
            GameScreen()
        }
    }
}