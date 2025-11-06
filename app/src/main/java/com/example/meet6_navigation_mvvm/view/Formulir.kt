package com.example.meet6_navigation_mvvm.view

import android.R
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import android.R.attr.title
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.material3.TopAppBar
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.OutlinedTextField
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.DividerDefaults.Thickness

@Composable
fun FormIsian(
    jenisK:List<R.string> = listOf("Laki-laki", "Perempuan"),
    OnSubmitBtnClick : () -> Unit
) {
    Scaffold(modifier = Modifier,
        topBar = {
            TopAppBar(
                title = {Text(stringResource(R.string.home),
                    color = Color.White)},
                colors = TopAppBarDefaults.topAppBarColors
                    (colorResource(id = R.color.teal_700))
            )
        }
    ){ isiRuang ->
        Column(modifier = Modifier.padding(isiRuang),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedTextField(
                value = "",
                singleLine = true,
                modifier = Modifier
                    .padding(top = 20.dp)
                    .width(250.dp),
                label = {Text(text = "Nama Lengkap")},
                onValueChange = {},
            )
            HorizontalDivider(modifier = Modifier
                .padding(20.dp)
                .width(250.dp), thickness = Thickness,color =
                Color.Red)
        }
    }