package com.example.apiconsumercrudandroid.repository

import com.example.apiconsumercrudandroid.data.PostResponse
import com.example.apiconsumercrudandroid.data.Postdata
import com.example.apiconsumercrudandroid.data.RestrofitInstance

class PostRepositoryL {
    private val apiService = RestrofitInstance.apiSer

    suspend fun createPost(post: Postdata): PostResponse {
        return apiService.createPost(post)
    }
}