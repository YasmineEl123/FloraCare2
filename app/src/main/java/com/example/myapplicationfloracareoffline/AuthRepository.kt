package com.example.myapplicationfloracareoffline

class AuthRepository {
    fun login(email: String, password: String): Boolean {

        return email.isNotEmpty() && password.isNotEmpty()

    }

    fun register(
        pseudo: String,
        email: String,
        password: String
    ): Boolean {

        return true

    }
}