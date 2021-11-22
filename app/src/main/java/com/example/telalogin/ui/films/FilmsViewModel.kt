package com.example.telalogin.ui.films

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.telalogin.domain.model.FilmsResponse
import com.example.telalogin.domain.model.LoginRequest
import com.example.telalogin.domain.model.LoginResponse
import com.example.telalogin.domain.usecase.ApiUseCase
import kotlinx.coroutines.launch
import java.lang.Exception

class FilmsViewModel(
    private val apiUseCase: ApiUseCase
): ViewModel() {

    private val _data = MutableLiveData<List<FilmsResponse>>()
    val data: MutableLiveData<List<FilmsResponse>> = _data

    fun getFilms() = viewModelScope.launch {

        try {
            val data = apiUseCase.getFilms()
            _data.value =  data
        }catch (e: Exception) {
            Log.e("Error", e.toString())
        }
    }


}