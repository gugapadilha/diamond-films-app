package com.example.telalogin

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_password.*

class PasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password)

        btn_send_email.setOnClickListener {

            if (tv_username_signin.text.isNullOrEmpty() && (tv_password_signin.text.isNullOrEmpty())){
                tv_username_signin.error = "Campo inválido"
                tv_password_signin.error = "Campo inválido"
            }else if (tv_username_signin.text.isNullOrEmpty()) {
                tv_username_signin.error = "Campo inválido"
            }else if (tv_password_signin.text.isNullOrEmpty() || !tv_password_signin.text.contains("@")) {
                tv_password_signin.error = "Campo inválido"
            }else {
                Toast.makeText(applicationContext, "E-mail enviado com sucesso!", Toast.LENGTH_LONG).show()
            }
        }
    }
}