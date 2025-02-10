package com.example.apiconsumercrudandroid.data

import retrofit2.http.GET

interface PostGet {
    @GET("posts")
    suspend fun getPosts(): List<Posts>

    @GET("photos")
    suspend fun getPhotos(): List<Photo>
}