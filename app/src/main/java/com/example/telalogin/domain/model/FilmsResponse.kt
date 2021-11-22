package com.example.telalogin.domain.model

import java.io.Serializable

data class FilmsResponse(
    var id: Long,
    var imageUrl: String,
    var name: String,
):Serializable{

//    companion object {
//        const val KEY_USER = "key_user"
//    }
}


