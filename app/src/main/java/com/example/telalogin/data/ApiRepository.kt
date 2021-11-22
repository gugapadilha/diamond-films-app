package com.example.telalogin.data

import com.example.telalogin.domain.model.LoginRequest
import com.example.telalogin.domain.model.LoginResponse

class ApiRepository(
    private val apiService: ApiService
) {

    suspend fun login(loginRequest: LoginRequest): LoginResponse = apiService.login(loginRequest)
}