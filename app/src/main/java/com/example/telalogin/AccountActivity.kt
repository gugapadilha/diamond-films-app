package com.example.telalogin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.telalogin.list.FilmsActivity
import kotlinx.android.synthetic.main.activity_account.*
import kotlinx.android.synthetic.main.activity_option.btn_singin

class AccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)


        val textoRecuperado = intent.getStringExtra("")
        tv_nome_usuario.text = textoRecuperado


        btn_singin.setOnClickListener {

            val intent3 = Intent(this, FilmsActivity::class.java)
            startActivity(intent3)

        }


    }
}