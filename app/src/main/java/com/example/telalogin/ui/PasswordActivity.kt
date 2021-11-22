package com.example.telalogin.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.telalogin.R
import kotlinx.android.synthetic.main.activity_password.*

class PasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password)

        btn_singin.setOnClickListener {

            if (tv_cpf_register.text.isNullOrEmpty() && (tv_registered_email.text.isNullOrEmpty())){
                tv_cpf_register.error = "Campo inválido"
                tv_registered_email.error = "Campo inválido"
            }else if (tv_cpf_register.text.isNullOrEmpty()) {
                tv_cpf_register.error = "Campo inválido"
            }else if (tv_registered_email.text.isNullOrEmpty() || !tv_registered_email.text.contains("@")) {
                tv_registered_email.error = "Campo inválido"
            }else {
                Toast.makeText(applicationContext, "E-mail enviado com sucesso!", Toast.LENGTH_LONG).show()
            }
        }
    }
}