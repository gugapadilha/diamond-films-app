package com.example.telalogin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_option.btn_send_email

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_send_email.setOnClickListener {

            validFields()
        }

        txt_forgot_password.setOnClickListener {

            val intent5 = Intent(this, PasswordActivity::class.java)
            startActivity(intent5)
        }
    }

    private fun validFields() {

        if (tv_username_signin.text.isNullOrEmpty() && tv_password_signin.text.isNullOrEmpty()){
            tv_username_signin.error = "Campo inválido"
            tv_password_signin.error = "Campo inválido"
        }else if (tv_username_signin.text.isNullOrEmpty()) {
            tv_username_signin.error = "Campo inválido"
        } else if (tv_password_signin.text.isNullOrEmpty()) {
            tv_password_signin.error = "Campo inválido"
        }else {
            val intent = Intent(this, AccountActivity::class.java)
            startActivity(intent)
            val intent4 = Intent(applicationContext, AccountActivity::class.java)
            val params = Bundle()
            val textoDigitado = tv_username_signin.text.toString()
            params.putString("",textoDigitado)
            intent4.putExtras(params)
            startActivity(intent4)
        }
    }

}