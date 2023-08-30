package com.mkrdeveloper.nestednavexamplejetpack.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.mkrdeveloper.nestednavexamplejetpack.screens.ForgetPassScreen
import com.mkrdeveloper.nestednavexamplejetpack.screens.HomeScreen
import com.mkrdeveloper.nestednavexamplejetpack.screens.LoginScreen
import com.mkrdeveloper.nestednavexamplejetpack.screens.RegisterScreen
import com.mkrdeveloper.nestednavexamplejetpack.screens.ScreenA
import com.mkrdeveloper.nestednavexamplejetpack.screens.ScreenB

fun NavGraphBuilder.appGraph(navController: NavController){
    navigation(startDestination = Screens.ScreenHomeRoute.route, route = Screens.AppRoute.route){
        composable(route = Screens.ScreenHomeRoute.route) {
            HomeScreen(navController = navController)
        }
        composable(route = Screens.ScreenARoute.route) {
            ScreenA(navController = navController)
        }
        composable(route = Screens.ScreenBRoute.route) {
            ScreenB(navController = navController)
        }
    }
}