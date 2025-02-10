package com.example.apiconsumercrudandroid.models

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.apiconsumercrudandroid.data.PostResponse
import com.example.apiconsumercrudandroid.data.Postdata
import com.example.apiconsumercrudandroid.repository.PostRepositoryL
import kotlinx.coroutines.launch

class PostModelCreate: ViewModel() {
    private val repository = PostRepositoryL()

    var response: PostResponse? = null
        private set

    fun sendPost() {
        val newPost = Postdata(userId = 1, title = "Teste Kotlin", body = "Conteúdo do post")

        viewModelScope.launch {
            try {
                response = repository.createPost(newPost)
            } catch (e: Exception) {
                println("Erro: ${e.message}")
            }
        }
    }
}