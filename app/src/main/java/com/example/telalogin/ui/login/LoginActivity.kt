package com.example.telalogin.ui.login

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.telalogin.R
import com.example.telalogin.ui.AccountActivity
import com.example.telalogin.ui.PasswordActivity
import com.example.telalogin.utils.saveUser
import kotlinx.android.synthetic.main.activity_login.*
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.lang.Exception
import java.lang.StringBuilder


class LoginActivity : AppCompatActivity() {

    private val viewModel: LoginViewModel by viewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        tv_cpf_signin.addTextChangedListener(MaskCpfCnpj.insert(tv_cpf_signin))

        btn_singin.setOnClickListener {

            validFields()

        }

        txt_forgot_password.setOnClickListener {

            val intent5 = Intent(this, PasswordActivity::class.java)
            startActivity(intent5)
        }
    }

    private fun validFields() {

        if (tv_cpf_signin.text.isNullOrEmpty() && tv_password_signin.text.isNullOrEmpty()) {
            tv_cpf_signin.error = "Campo inválido"
            tv_password_signin.error = "Campo inválido"
        } else if (tv_cpf_signin.text.isNullOrEmpty()) {
            tv_cpf_signin.error = "Campo inválido"
        } else if (tv_password_signin.text.isNullOrEmpty()) {
            tv_password_signin.error = "Campo inválido"
        } else if (tv_password_signin.length() < 6) {
            tv_password_signin.error = "Senha fraca!"
        } else {

            viewModel.login(tv_cpf_signin.text.toString(), tv_password_signin.text.toString())
            viewModel.data.observe(this) {
                saveUser(it)
                val intent = Intent(this, AccountActivity::class.java)
                startActivity(intent)
            }
        }

    }
}
object MaskCpfCnpj {

    private val maskCNPJ = "##.###.###/####-##"
    private val maskCPF = "###.###.###-##"


    fun unmask(s: String): String {
        return s.replace("[^0-9]*".toRegex(), "")
    }

    fun insert(editText: EditText): TextWatcher {
        return object : TextWatcher {

            internal var isUpdating: Boolean = false
            internal var old = ""

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                val str = MaskCpfCnpj.unmask(s.toString())
                val mask: String
                val defaultMask = getDefaultMask(str)
                when (str.length) {
                    11 -> mask = maskCPF
                    14 -> mask = maskCNPJ

                    else -> mask = defaultMask
                }

                var mascara = ""
                if (isUpdating) {
                    old = str
                    isUpdating = false
                    return
                }
                var i = 0
                for (m in mask.toCharArray()) {
                    if (m != '#' && str.length > old.length || m != '#' && str.length < old.length && str.length != i) {
                        mascara += m
                        continue
                    }

                    try {
                        mascara += str.get(i)
                    } catch (e: Exception) {
                        break
                    }

                    i++
                }
                isUpdating = true
                editText.setText(mascara)
                editText.setSelection(mascara.length)
            }

            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                //sonar
            }

            override fun afterTextChanged(editable: Editable) {
                //sonar
            }
        }
    }

    private fun getDefaultMask(str: String): String {
        var defaultMask = maskCPF
        if (str.length > 11) {
            defaultMask = maskCNPJ
        }
        return defaultMask
    }
}

