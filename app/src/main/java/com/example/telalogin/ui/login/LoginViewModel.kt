package com.example.telalogin.ui.login

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.telalogin.domain.model.LoginRequest
import com.example.telalogin.domain.model.LoginResponse
import com.example.telalogin.domain.usecase.ApiUseCase
import kotlinx.coroutines.launch
import java.lang.Exception

class LoginViewModel(
    private val apiUseCase: ApiUseCase
): ViewModel() {

    private val _data = MutableLiveData<LoginResponse>()
    val data: MutableLiveData<LoginResponse> = _data

    fun login(cpf: String, password: String) = viewModelScope.launch {

        val loginRequest = LoginRequest(cpf, password)

        try {
            val data = apiUseCase.loginUser(loginRequest)
            _data.value = data
        }catch (e: Exception) {
            Log.e("Error", e.toString())
        }
    }


}