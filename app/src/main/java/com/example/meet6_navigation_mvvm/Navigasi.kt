package com.example.meet6_navigation_mvvm

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavControlle

enum class Navigasi{
    Formulir,
    Detail
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier
){
    Scaffold { isiRuang->
        navController = navController,
        startDestination = Navigasi.Formulir.name,

        modifier = Modifier.padding(isiRuang)){
            composable(route = Navigasi.Formulir.name){
                FormIsian(
                    //pilihanJK = JenisK.map{ id -> konteks.resources.getString(id) }
                    OnSubmitBtnClick = {
                        navController.navigate(Navigasi.Detail.name)
                    }
                )
            }
            composable(route = Navigasi.Detail.name){
                TampilData(
                    onBackBtnClick = {
                        cancelAndBackToFormulir(navController)
                    }
                )
            }
    }}
    }
}
private fun cancelAndBackToFormulir(
    navController: NavHostController
){
    navController.popBackStack(Navigasi.Formulir.name,
        inclusive = false)
}