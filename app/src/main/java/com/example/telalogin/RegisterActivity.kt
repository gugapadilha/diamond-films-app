package com.example.telalogin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_account.*
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_option.*
import kotlinx.android.synthetic.main.activity_password.*
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.activity_register.tv_password_signin
import kotlinx.android.synthetic.main.activity_register.tv_username_signin

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        btn_register.setOnClickListener {

                if (tv_username_signin.text.isNullOrEmpty() && tv_password_signin.text.isNullOrEmpty()){
                    tv_username_signin.error = "Campo inválido"
                    tv_password_signin.error = "Campo inválido"
                    tv_email_register.error =  "Campo inválido"
                }else if (tv_username_signin.text.isNullOrEmpty()) {
                    tv_username_signin.error = "Campo inválido"
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