package com.example.telalogin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.telalogin.ui.login.LoginActivity
import com.example.telalogin.ui.RegisterActivity
import kotlinx.android.synthetic.main.activity_option.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_option)

        btn_singin.setOnClickListener {

            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

        }

        btn_singup.setOnClickListener {

            val intent2 = Intent(this, RegisterActivity::class.java)
            startActivity(intent2)

        }

    }
}