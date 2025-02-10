package com.example.apiconsumercrudandroid.repository

import com.example.apiconsumercrudandroid.data.Photo
import com.example.apiconsumercrudandroid.data.PostGet

class PhotoRepository(private val api: PostGet) {
    suspend fun fetchPhoto(): List<Photo> = api.getPhotos()
}