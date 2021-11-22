package com.example.telalogin.utils

import com.example.telalogin.domain.model.LoginResponse
import com.orhanobut.hawk.Hawk

fun getUser(): LoginResponse? {
    return Hawk.get<LoginResponse>(LoginResponse.KEY_USER)
}

fun saveUser(person: LoginResponse) {
    Hawk.put(LoginResponse.KEY_USER, person)
}