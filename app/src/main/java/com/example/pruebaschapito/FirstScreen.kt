package com.example.pruebaschapito

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController

@Composable
fun FirstScreen(navController: NavController, firstViewModel: FirstViewModel = viewModel()) {
    val text = firstViewModel.text.observeAsState("")

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = text.value ?: "")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("second") }) {
            Text("Go to Second Screen")
        }
    }
}