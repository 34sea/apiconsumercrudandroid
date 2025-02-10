package com.example.apiconsumercrudandroid.repository

import com.example.apiconsumercrudandroid.data.Comments
import com.example.apiconsumercrudandroid.data.CommentsInterface

class CommentsRepository(private val commentarios: CommentsInterface) {
    suspend fun fecthCommets(): List<Comments> = commentarios.getComments()
}