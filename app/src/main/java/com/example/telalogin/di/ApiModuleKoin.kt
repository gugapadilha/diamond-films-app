package com.example.telalogin.di

import com.example.telalogin.data.ApiRepository
import com.example.telalogin.data.ApiService
import com.example.telalogin.domain.usecase.ApiUseCase
import com.example.telalogin.domain.usecase.ApiUseCaseImpl
import com.example.telalogin.remote.ClientService
import com.example.telalogin.ui.films.FilmsViewModel
import com.example.telalogin.ui.login.LoginViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

object ApiModuleKoin {
    //service
    private val serviceModule = module {
        single<ApiService> {
            ClientService().configService() //se precisar vai injetar no clientService
        }
    }

    //repository
    private val repositoryModule = module {
        single { ApiRepository(get()) } //o que eu preciso ele pega - declarar aqui (get)
    }

    //useCaseMyApi
    private val myApiUseCase = module {
        factory<ApiUseCase>{
            ApiUseCaseImpl(get())
        }
    }

    //useCaseMyApiImpl
    private val myApiUseCaseImpl = module {
        single { ApiUseCaseImpl(get()) }
    }

    //viewmodel
    private val viewModelModule = module {
        viewModel {
            LoginViewModel(
                get()
            )
        }
        viewModel {
            FilmsViewModel(
                get()
            )
        }
    }

    val modules = listOf(serviceModule, repositoryModule, myApiUseCase, myApiUseCaseImpl,
        viewModelModule)
}