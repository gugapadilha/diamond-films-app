package com.example.telalogin.domain.usecase

import com.example.telalogin.domain.model.FilmsResponse
import com.example.telalogin.domain.model.LoginRequest
import com.example.telalogin.domain.model.LoginResponse

interface ApiUseCase {

    suspend fun loginUser(loginRequest: LoginRequest): LoginResponse
    suspend fun getFilms(): List<FilmsResponse>
}