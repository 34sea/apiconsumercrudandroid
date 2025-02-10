package com.example.apiconsumercrudandroid.views

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.apiconsumercrudandroid.models.CommentsModels
import com.example.apiconsumercrudandroid.models.PhotoModels
import com.example.apiconsumercrudandroid.models.PostModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Consumer(innerPadding: PaddingValues, viewModel: PostModel = viewModel(), photoViewMode: PhotoModels = viewModel(), comme: CommentsModels = viewModel()){
    val posts by viewModel.posts.collectAsState()
    val photoJ by photoViewMode.photosPost.collectAsState()
    val com by comme.comments.collectAsState()
    Log.d("Posts posts: ", posts.toString())
    Log.d("Posts photoJ: ", photoJ.toString())
    Log.d("Posts com: ", com.toString())
    Scaffold (

    ){
       LazyColumn (
           modifier = Modifier
               .padding(it)
       ){
           items(com){item ->
               Text(item.name)
           }
       }
    }
}