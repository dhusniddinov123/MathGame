package com.example.mathgame.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.mathgame.Navigation.NavGraph
import com.example.mathgame.R
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
    LaunchedEffect(key1 = true){
        delay(2000)
        navController.navigate("home_screen")
    }
    Image(
        modifier = Modifier.fillMaxSize(),
        painter = painterResource(id = R.drawable.img), contentDescription = null,
        contentScale = ContentScale.Crop
    )
}

//@Preview(showBackground = true)
//@Composable
//fun test() {
//    val navController = rememberNavController()
//    NavGraph(navController = navController)
//    SplashScreen(navController = navController)
//}