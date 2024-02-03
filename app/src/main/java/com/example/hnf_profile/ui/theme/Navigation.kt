package com.example.hnf_profile.ui.theme

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.hnf_profile.detailScreen.PlanDetails

@Composable
fun Navigation(){
    val navController= rememberNavController()
    
    NavHost(navController = navController, startDestination = "Main_Screen"){
        composable(route="Main_Screen"){
            MainProfile_n_Content_Screen(navController)
        }
        composable(route = "Detail_Screen"){
            PlanDetails(navController)
        }
    }
}