package com.example.meet6_navigation_mvvm.view

import android.R
import androidx.compose.runtime.Composable

@Composable
fun FormIsian(
    jenisK:List<R.string> = listOf("Laki-laki", "Perempuan"),
    OnSubmitBtnClick : () -> Unit
)