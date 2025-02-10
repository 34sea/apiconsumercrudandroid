package com.example.apiconsumercrudandroid.data

data class Postdata(
    val userId: Int,
    val title: String,
    val body: String
)

data class PostResponse(
    val id: Int,
    val userId: Int,
    val title: String,
    val body: String
)