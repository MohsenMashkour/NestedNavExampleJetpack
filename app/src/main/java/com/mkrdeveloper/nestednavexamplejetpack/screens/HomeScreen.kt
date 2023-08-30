package com.mkrdeveloper.nestednavexamplejetpack.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.mkrdeveloper.nestednavexamplejetpack.navigation.Screens


@Composable
fun  HomeScreen(navController: NavController, modifier: Modifier = Modifier){
    Column(modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text= "Home Screen", fontSize = 40.sp)
        Spacer(modifier.height(40.dp))
        Button(onClick = {

            navController.navigate(Screens.ScreenARoute.route)
        }) {
            Text(text = "Go to A", fontSize = 25.sp)
        }
        Spacer(modifier.height(40.dp))
        Button(onClick = {
            navController.navigate(Screens.ScreenBRoute.route)
        }) {
            Text(text = "Go to B", fontSize = 25.sp)
        }


    }
}