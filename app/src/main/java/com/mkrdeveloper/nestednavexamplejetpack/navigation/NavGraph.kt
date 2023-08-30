package com.mkrdeveloper.nestednavexamplejetpack.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.mkrdeveloper.nestednavexamplejetpack.screens.ForgetPassScreen
import com.mkrdeveloper.nestednavexamplejetpack.screens.HomeScreen
import com.mkrdeveloper.nestednavexamplejetpack.screens.LoginScreen
import com.mkrdeveloper.nestednavexamplejetpack.screens.RegisterScreen
import com.mkrdeveloper.nestednavexamplejetpack.screens.ScreenA
import com.mkrdeveloper.nestednavexamplejetpack.screens.ScreenB

@Composable
fun Nav() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.AuthRoute.route) {


        authGraph(navController)
        appGraph(navController)



    }
}