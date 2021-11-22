package com.example.telalogin.ui.films

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.telalogin.R
import kotlinx.android.synthetic.main.activity_films.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class FilmsActivity : AppCompatActivity() {

    private val viewModel: FilmsViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_films)

    }

    override fun onResume() {
        super.onResume()

        getFilms()
    }

    private fun getFilms() {

        viewModel.getFilms()
        viewModel.data.observe(this) {

            val adapter = FilmeAdapter(this)
            rv_list_films.adapter = adapter
            rv_list_films.layoutManager = LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL, false)
            adapter.add(it)
            adapter.notifyDataSetChanged()
        }
    }
}