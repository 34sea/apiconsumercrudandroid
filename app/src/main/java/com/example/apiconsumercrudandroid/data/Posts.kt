package com.example.apiconsumercrudandroid.data

data class Posts(
    val userId: Int,
    val id: Int? = null,
    val title: String,
    val body: String
)
