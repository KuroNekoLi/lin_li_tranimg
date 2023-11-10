package com.example.lin_li_tranimg.presentation.compose

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lin_li_tranimg.presentation.viewmodel.LoginViewModel
import com.example.lin_li_tranimg.presentation.activity.MainActivity.Companion.FORGET_PASSWORD_SCREEN
import com.example.lin_li_tranimg.presentation.activity.MainActivity.Companion.GUEST_SCREEN
import com.example.lin_li_tranimg.presentation.activity.MainActivity.Companion.LOGIN_SCREEN
import com.example.lin_li_tranimg.presentation.activity.MainActivity.Companion.REGISTER_SCREEN

@Composable
fun AppNavHost(
    navController: NavHostController = rememberNavController(),
    viewModel: LoginViewModel
) {
    NavHost(navController = navController, startDestination = LOGIN_SCREEN) {
        composable(route = "login_screen") {
            LoginScreen(viewModel = viewModel, navController = navController)
        }
        composable(route = REGISTER_SCREEN) {
            RegisterScreen(string = "註冊畫面", navController = navController)
        }
        composable(route = GUEST_SCREEN) {
            GuestScreen(string = "訪客畫面", navController = navController)
        }
        composable(route = FORGET_PASSWORD_SCREEN) {
            ForgetPasswordScreen(string = "忘記密碼畫面", navController = navController)
        }
    }
}