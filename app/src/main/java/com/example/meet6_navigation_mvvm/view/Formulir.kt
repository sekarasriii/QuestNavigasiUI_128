package com.example.meet6_navigation_mvvm.view

import android.R
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun FormIsian(
    jenisK:List<R.string> = listOf("Laki-laki", "Perempuan"),
    OnSubmitBtnClick : () -> Unit
) {
    Scaffold(modifier = Modifier)
}