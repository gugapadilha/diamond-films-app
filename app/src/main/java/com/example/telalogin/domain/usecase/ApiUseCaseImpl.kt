package com.example.telalogin.domain.usecase

import com.example.telalogin.data.ApiRepository
import com.example.telalogin.domain.model.FilmsResponse
import com.example.telalogin.domain.model.LoginRequest
import com.example.telalogin.domain.model.LoginResponse
import java.lang.Exception

class ApiUseCaseImpl(
    private val repository: ApiRepository
): ApiUseCase {
    override suspend fun loginUser(loginRequest: LoginRequest): LoginResponse {
//        return try {
//            repository.login(loginRequest)
//        } catch (e:Exception) {
//            throw e
//        }
        return LoginResponse(1, "02764295272", "adm123", "https://scontent.fccm8-1.fna.fbcdn.net/v/t39.30808-6/241635185_4135816446515952_4648329901576762777_n.jpg?_nc_cat=101&ccb=1-5&_nc_sid=09cbfe&_nc_ohc=rOXFeasycokAX_R-ZCO&_nc_ht=scontent.fccm8-1.fna&oh=e056b4f1e866dde7ea3a4aaf3251bab8&oe=619B1646", "guga.santosapdilha@rede.ulbra.br", "guga")
    }

    override suspend fun getFilms(): List<FilmsResponse> {
       val listFIlms = mutableListOf<FilmsResponse>()
        listFIlms.add(FilmsResponse(1, "https://i.ytimg.com/vi/iKGjGh88iOY/maxresdefault.jpg", "Velozes e Furiosos 9 ", "Gênero: Ação", "Duração: 2h5m"))
        listFIlms.add(FilmsResponse(2, "https://www.cnnbrasil.com.br/wp-content/uploads/sites/12/2021/10/halloween-kills-1.jpg", "Halloween a Caça Continua", "Gênero: Terror/Suspense", "Duração: 1h55m"))
        listFIlms.add(FilmsResponse(3, "https://i2.wp.com/www.ultraverso.com.br/wp-content/uploads/2021/04/Mundo-em-Caos-Chaos-Walking-filme-critica-review-resenha.jpeg?fit=1200%2C675&ssl=1", "Mundo em Caos", " Gênero: Drama/Ação", "Duração: 1h45m"))
        listFIlms.add(FilmsResponse(4, "https://cdn.ome.lt/FZR-pZjVVokTtb4tdlILRKIVwCU=/1200x630/smart/extras/conteudos/alerta_vermelho_dM5rHz2.PNG", "Alerta Vermelho", "Gênero: Ação/Comédia", "Duração: 1h55m"))
        listFIlms.add(FilmsResponse(5, "https://www.quadroporquadro.com.br/wp-content/uploads/2021/06/20201021-o-homem-nas-trevas-2.jpg", "Homem das Trevas 2", "Gênero: Suspense/Drama", "Duração: 1h35m"))

        return listFIlms
    }

}