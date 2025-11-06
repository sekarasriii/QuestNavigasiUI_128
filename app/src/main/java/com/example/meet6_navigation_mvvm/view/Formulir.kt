package com.example.meet6_navigation_mvvm.view

import android.R
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import android.R.attr.title
import androidx.compose.material3.Text
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.graphics.Color

@Composable
fun FormIsian(
    jenisK:List<R.string> = listOf("Laki-laki", "Perempuan"),
    OnSubmitBtnClick : () -> Unit
) {
    Scaffold(modifier = Modifier,
        topBar = {
            title = {Text(text = stringResource(id= R.string.home),
                color = Color.White)},
        }
}