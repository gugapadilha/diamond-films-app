package com.example.telalogin.domain.model

data class LoginRequest(
    var cpf: String,
    var password: String, //faz a requisicao pro usuario logar
)


