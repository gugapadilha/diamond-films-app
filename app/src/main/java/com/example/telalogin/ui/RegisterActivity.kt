package com.example.telalogin.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.telalogin.R
import com.example.telalogin.ui.login.LoginActivity
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        btn_register.setOnClickListener {

                if (tv_cpf_signin.text.isNullOrEmpty() && tv_password_signin.text.isNullOrEmpty()){
                    tv_cpf_signin.error = "Campo inválido"
                    tv_password_signin.error = "Campo inválido"
                    tv_email_register.error =  "Campo inválido"
                }else if (tv_cpf_signin.text.isNullOrEmpty()) {
                    tv_cpf_signin.error = "Campo inválido"
                } else if (tv_password_signin.text.isNullOrEmpty()) {
                    tv_password_signin.error = "Campo inválido"
                }else if (tv_email_register.text.isNullOrEmpty() || !tv_email_register.text!!.contains("@")){
                    tv_email_register.error = "Campo inválido"
                }else if (tv_password_signin.length() < 6) {
                    tv_password_signin.error = "Senha fraca!"
                }
                else {
                    val intent = Intent(this, LoginActivity::class.java)
                    startActivity(intent)
                }

        }
    }
}