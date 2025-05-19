package com.example.appnavega.ui.screens.camera

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun CameraScreen() {
    Column(modifier = Modifier.fillMaxSize()
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center)
    {
        val viewModel: CameraViewmodel = viewModel()
        var nameImput = viewModel.nameimput
        var confirmedname = viewModel.confirmedname

        Text(
            text = "Con rememberSaveable y ViewModel",
            style = MaterialTheme.typography.bodyLarge,
            fontSize = 13.sp,
            fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,
            color = MaterialTheme.colorScheme.error,
            modifier = Modifier.padding(bottom = 100.dp)
        )

        Text(
            text = if (confirmedname.isNotEmpty())
                "Bienvenido $confirmedname!" else "¿Como es tu nombre?",
            style = MaterialTheme.typography.headlineMedium,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.padding(bottom = 62.dp)
        )

        TextField(
            value = nameImput,
            onValueChange = { viewModel.onNameChange(it) },
            label = { Text("Ingresa tu nombre") },
            modifier = Modifier.width(300.dp).padding()
        )

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = { viewModel.onConfirmName() }) {
            Text("Ingresar")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CameraScreenPreview() {
    CameraScreen()
}