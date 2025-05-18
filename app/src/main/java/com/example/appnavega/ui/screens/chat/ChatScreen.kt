package com.example.appnavega.ui.screens.chat

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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ChatScreen() {
    Column(modifier = Modifier.fillMaxSize()
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center)
    {
        var nameingresado by rememberSaveable { mutableStateOf("") }
        // esta variable almacena el nombre ingresado por el usuario.

        var nameconfirmado by rememberSaveable { mutableStateOf("") }
        // esta variable es la que se muestra al presionar el boton.

        Text(
            text = "Con rememberSaveable y mutableStateOf",
            style = MaterialTheme.typography.bodyLarge,
            fontSize = 13.sp,
            fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,
            color = MaterialTheme.colorScheme.error,
            modifier = Modifier.padding(bottom = 100.dp)
        )

        Text(
            text = if (nameconfirmado.isNotEmpty())
                "Bienvenido $nameconfirmado!" else "¿Como es tu nombre?",
            style = MaterialTheme.typography.headlineMedium,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.padding(bottom = 62.dp)
        )

        TextField(
            value = nameingresado,
            onValueChange = { nameingresado = it },
            label = { Text("Ingresa tu nombre") },
            modifier = Modifier.width(300.dp).padding()
        )

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = { nameconfirmado = nameingresado }) {
            Text("Ingresar")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ChatScreenPreview() {
    ChatScreen()
}