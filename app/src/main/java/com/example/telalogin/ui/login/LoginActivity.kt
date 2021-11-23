package com.example.telalogin.ui.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.telalogin.R
import com.example.telalogin.ui.AccountActivity
import com.example.telalogin.ui.PasswordActivity
import com.example.telalogin.utils.saveUser
import kotlinx.android.synthetic.main.activity_login.*
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.lang.StringBuilder


class LoginActivity : AppCompatActivity() {

    private val viewModel: LoginViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_singin.setOnClickListener {

            validFields()

        }

        txt_forgot_password.setOnClickListener {

            val intent5 = Intent(this, PasswordActivity::class.java)
            startActivity(intent5)
        }
    }

    private fun validFields() {

        if (tv_cpf_signin.text.isNullOrEmpty() && tv_password_signin.text.isNullOrEmpty()){
            tv_cpf_signin.error = "Campo inválido"
            tv_password_signin.error = "Campo inválido"
        }else if (tv_cpf_signin.text.isNullOrEmpty()) {
            tv_cpf_signin.error = "Campo inválido"
        } else if (tv_password_signin.text.isNullOrEmpty()) {
            tv_password_signin.error = "Campo inválido"
        }else if (tv_password_signin.length() < 6 ) {
            tv_password_signin.error = "Senha fraca!"
        }else {

            viewModel.login(tv_cpf_signin.text.toString(), tv_password_signin.text.toString())
            viewModel.data.observe(this){
                saveUser(it)
                val intent = Intent(this, AccountActivity::class.java)
                startActivity(intent)
            }
        }
    }

    fun cpf_formatado(cpf: String): String? {
        var cpf = cpf
        cpf = cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(
            6,
            9
        ) + "-" + cpf.substring(9, 11)
        return cpf

    }

}

