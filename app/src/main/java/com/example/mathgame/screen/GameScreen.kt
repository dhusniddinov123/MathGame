package com.example.mathgame.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.mathgame.R


lateinit var answer: String
@Preview(showBackground = true)
@Composable
fun GameScreen(){
    var example by remember{ mutableStateOf(getRandom())}
    Box(modifier = Modifier.fillMaxSize()){
        Image(painter = painterResource(id =  R.drawable.img),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize(),)
    }
}

fun getRandom(): String {
    var first = (1..100).random()
    var second = (1..100).random()
    val operators = listOf("*", "/", "+", "-")
    val operator = operators.random()
    answer = operator
    if (operator == "/") {
        while (first % second != 0) {
            first = (1..100).random()
            second = (1..100).random()
        }
    }
//    return "$first _ $second = ${solve(first, second, operator)}"
    return answer
}