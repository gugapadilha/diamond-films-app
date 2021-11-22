package com.example.telalogin.data

import com.example.telalogin.domain.model.LoginRequest
import com.example.telalogin.domain.model.LoginResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {

    @POST("auth/login")
    suspend fun login(
        @Body loginRequest: LoginRequest
    ): LoginResponse
}