package com.example.apiconsumercrudandroid.models

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.apiconsumercrudandroid.data.Comments
import com.example.apiconsumercrudandroid.data.ServiceTeste
import com.example.apiconsumercrudandroid.repository.CommentsRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class CommentsModels: ViewModel() {
    private val repositorycomments = CommentsRepository(ServiceTeste.api)
    private val _commentsL = MutableStateFlow<List<Comments>>(emptyList())
    val comments: StateFlow<List<Comments>> = _commentsL

    init {
        fechtCome()
    }

    private fun fechtCome(){
        viewModelScope.launch {
            try {
                val result = repositorycomments.fecthCommets()
                _commentsL.value = result
            }catch (e: Exception){
                Log.d("Erro: ", e.toString())
            }
        }
    }
}