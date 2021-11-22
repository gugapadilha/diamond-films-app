package com.example.telalogin.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.telalogin.R
import com.example.telalogin.ui.films.FilmsActivity
import com.example.telalogin.utils.getUser
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_account.*

class AccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        val user = getUser()

        Picasso.with(this).load(user?.imageUrl).into(iv_photouser)

        tv_nome_usuario.text = user?.name
        tv_email_usuario.text = user?.email



        btn_show_films.setOnClickListener {

            val intent3 = Intent(this, FilmsActivity::class.java)
            startActivity(intent3)


        }


    }
}