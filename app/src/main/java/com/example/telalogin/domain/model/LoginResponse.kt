package com.example.telalogin.domain.model

import java.io.Serializable

data class LoginResponse(
    var id: Long,
    var cpf: String,
    var password: String, //corno retorna aqui
    var imageUrl: String,
    var email: String,
    var name: String,
):Serializable{

    companion object {
        const val KEY_USER = "key_user"
    }
}


