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
fun  ScreenB(navController: NavController, modifier: Modifier = Modifier){
    Column(modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text= "B Screen", fontSize = 40.sp)
        Spacer(modifier.height(40.dp))
        Button(onClick = {

            navController.navigate(Screens.ScreenHomeRoute.route)
        }) {
            Text(text = "Go to home", fontSize = 25.sp)
        }


    }
}