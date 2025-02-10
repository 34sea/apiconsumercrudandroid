package com.example.apiconsumercrudandroid.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.apiconsumercrudandroid.data.PostResponse
import com.example.apiconsumercrudandroid.models.PostModelCreate

@Composable
fun PostLfd(postViewModel: PostModelCreate = viewModel()){
    var response by remember { mutableStateOf<PostResponse?>(null) }

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp)
    ) {
        Button(onClick = {
            postViewModel.sendPost()
            response = postViewModel.response
        }) {
            Text("Enviar Post")
        }

        Spacer(modifier = Modifier.height(16.dp))

        response?.let {
            Text("ID: ${it.id}")
            Text("Título: ${it.title}")
            Text("Conteúdo: ${it.body}")
        }
    }

}

