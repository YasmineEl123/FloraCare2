package com.example.myapplicationfloracareoffline

data class UserSession (
    val token: String,
    val userId: Int,
    val username: String,
    val email: String
)