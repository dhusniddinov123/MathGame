package com.example.mathgame.Navigation

sealed class Screens(val route: String) {
    object Splash: Screens("splash_screen")
    object Home: Screens("home_screen")
    object Game: Screens("game_screen")
}