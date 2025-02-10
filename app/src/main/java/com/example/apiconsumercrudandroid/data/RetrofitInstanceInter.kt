package com.example.apiconsumercrudandroid.data

import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface RetrofitInstanceInter {
    @Headers("Content-Type: application/json")
    @POST("posts")
    suspend fun createPost(@Body post: Postdata): PostResponse
}