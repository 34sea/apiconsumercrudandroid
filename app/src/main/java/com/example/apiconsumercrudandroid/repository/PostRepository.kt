package com.example.apiconsumercrudandroid.repository

import com.example.apiconsumercrudandroid.data.ApiServices
import com.example.apiconsumercrudandroid.data.PostGet
import com.example.apiconsumercrudandroid.data.Posts

class PostRepository(private val apiServices: PostGet) {
    suspend fun fetchPosts(): List<Posts> = apiServices.getPosts()
}