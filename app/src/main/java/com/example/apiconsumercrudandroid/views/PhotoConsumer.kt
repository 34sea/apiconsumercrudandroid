package com.example.apiconsumercrudandroid.views

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.apiconsumercrudandroid.models.PhotoModels

@Composable
fun PhotoConsumer(innerPaddingValues: PaddingValues, viewModel: PhotoModels = viewModel()){
    val photos by viewModel.photosPost.collectAsState()
    Log.d("Photos: ", photos.toString())
    Scaffold {
        LazyColumn (
            modifier = Modifier
                .padding(it)
        ){
            photos.forEach { it ->
                Log.d("Photos: ", it.url)
            }
        }
    }
}

