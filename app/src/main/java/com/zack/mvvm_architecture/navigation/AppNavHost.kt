package com.zack.mvvm_architecture.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.zack.mvvm_architecture.ui.theme.screens.about.About
import com.zack.mvvm_architecture.ui.theme.screens.home.HomeScreen
import com.zack.mvvm_architecture.ui.theme.screens.splash.SplashScreen

@Composable
fun AppNavHost(modifier: Modifier= Modifier,
               navController: NavHostController = rememberNavController(),
               startDestination: String= ROUTE_SPLASH) {
    NavHost(navController = navController, modifier = modifier,
        startDestination = startDestination){
        composable(ROUTE_HOME) {
            HomeScreen()
        }
        composable(ROUTE_ABOUT){
            About()
        }
        composable(ROUTE_SPLASH){
            SplashScreen(navController)
        }
    }

}