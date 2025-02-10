package com.example.apiconsumercrudandroid.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
//PostApi

object ApiServices {
    private const val BASE_URL = "https://jsonplaceholder.typicode.com/"
    val PostApi: PostGet by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(PostGet::class.java)
    }
}