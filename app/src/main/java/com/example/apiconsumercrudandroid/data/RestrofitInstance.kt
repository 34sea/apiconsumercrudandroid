package com.example.apiconsumercrudandroid.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RestrofitInstance {
    private val BASEURL = "https://jsonplaceholder.typicode.com/"
    val apiSer: RetrofitInstanceInter by lazy {
        Retrofit.Builder()
            .baseUrl(BASEURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(RetrofitInstanceInter::class.java)
    }
}