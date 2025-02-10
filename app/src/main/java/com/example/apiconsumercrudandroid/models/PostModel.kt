package com.example.apiconsumercrudandroid.models

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.apiconsumercrudandroid.data.ApiServices
import com.example.apiconsumercrudandroid.data.Posts
import com.example.apiconsumercrudandroid.repository.PostRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class PostModel: ViewModel() {
    private val repositor =PostRepository(ApiServices.PostApi)
    private val _posts =MutableStateFlow<List<Posts>>(emptyList())
    val posts: StateFlow<List<Posts>> =_posts

    init{
        fetchPosts()
    }

private fun fetchPosts(){

    viewModelScope.launch {
        try {
            val result = repositor.fetchPosts()
            _posts.value = result
//            result.forEach{ item ->
//                if (item.title == "martinho"){
//                    Log.d("Yadlsa", "ldsdpsa")
//                    Log.d("Nome: ", item.title)
//                }else{
//                    Log.d("Nome: ", item.title)
//                }
//            }
            Log.d("Carregado", "ya")

        }catch (e: Exception){
            Log.d("Erro: ", e.message.toString())
        }
    }
}
}