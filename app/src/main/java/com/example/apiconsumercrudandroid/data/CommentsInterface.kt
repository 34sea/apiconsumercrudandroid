package com.example.apiconsumercrudandroid.data

import retrofit2.http.GET

interface CommentsInterface {
    @GET("comments")
    suspend fun getComments(): List<Comments>
}