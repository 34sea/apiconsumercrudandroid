package com.example.apiconsumercrudandroid.models

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.apiconsumercrudandroid.data.ApiServices
import com.example.apiconsumercrudandroid.data.Photo
import com.example.apiconsumercrudandroid.repository.PhotoRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class PhotoModels: ViewModel() {
    private val repo = PhotoRepository(ApiServices.PostApi)
    private val _photosPost = MutableStateFlow<List<Photo>>(emptyList())
    val photosPost: StateFlow<List<Photo>> = _photosPost

    init {
        fecthPhoto()
    }

    private fun fecthPhoto(){
        viewModelScope.launch {
            try {
                val result = repo.fetchPhoto()
                _photosPost.value = result
            }catch (e: Exception){
                Log.d("Erro: ", e.message.toString())
            }
        }
    }
}