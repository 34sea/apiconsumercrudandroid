package com.example.apiconsumercrudandroid.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceTeste {
    private val url_base = "https://jsonplaceholder.typicode.com/"
    val api: CommentsInterface by lazy {
        Retrofit.Builder()
            .baseUrl(url_base)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CommentsInterface::class.java)

    }
}