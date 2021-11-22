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
       var listFIlms = mutableListOf<FilmsResponse>()
        listFIlms.add(FilmsResponse(1, "https://s2.glbimg.com/dNPTSLB6TmhYYv5iJpBiRMBc_4I=/0x0:1581x1080/984x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_cf9d035bf26b4646b105bd958f32089d/internal_photos/bs/2021/h/z/FfZwA1QTuvcFbraTjoqQ/sem-titulo.png", "a espera de um milagre"))
        listFIlms.add(FilmsResponse(2, "https://s2.glbimg.com/dNPTSLB6TmhYYv5iJpBiRMBc_4I=/0x0:1581x1080/984x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_cf9d035bf26b4646b105bd958f32089d/internal_photos/bs/2021/h/z/FfZwA1QTuvcFbraTjoqQ/sem-titulo.png", "a espera de um xisdead"))
        listFIlms.add(FilmsResponse(3, "https://s2.glbimg.com/dNPTSLB6TmhYYv5iJpBiRMBc_4I=/0x0:1581x1080/984x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_cf9d035bf26b4646b105bd958f32089d/internal_photos/bs/2021/h/z/FfZwA1QTuvcFbraTjoqQ/sem-titulo.png", "a espera de um xisburguer"))
        listFIlms.add(FilmsResponse(4, "https://s2.glbimg.com/dNPTSLB6TmhYYv5iJpBiRMBc_4I=/0x0:1581x1080/984x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_cf9d035bf26b4646b105bd958f32089d/internal_photos/bs/2021/h/z/FfZwA1QTuvcFbraTjoqQ/sem-titulo.png", "a espera de um chevete"))
        listFIlms.add(FilmsResponse(5, "https://s2.glbimg.com/dNPTSLB6TmhYYv5iJpBiRMBc_4I=/0x0:1581x1080/984x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_cf9d035bf26b4646b105bd958f32089d/internal_photos/bs/2021/h/z/FfZwA1QTuvcFbraTjoqQ/sem-titulo.png", "a espera de um messi"))

        return listFIlms
    }

}