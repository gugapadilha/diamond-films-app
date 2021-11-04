package com.example.telalogin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_films.*

class FilmsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_films)
    }

    override fun onResume() {
        super.onResume()

        val listFilmes = mutableListOf<Filme>()

        listFilmes.add(Filme("Velozes e Furiosos 9 ", "Ação", "2h30mim", "https://observatoriodocinema.uol.com.br/wp-content/uploads/2020/02/fast-furious-9-velozes-e-furiosos-9.png"))
        listFilmes.add(Filme("Halloween: O terror continua", "Terror", "1h46mim", "https://media.hugogloss.uol.com.br/uploads/2021/06/halloween-capa.jpg"))
        listFilmes.add(Filme("Caça Invísivel", "Suspense", "1h27mim", "https://i.ytimg.com/vi/vN7xlP7rZcE/maxresdefault.jpg"))
        listFilmes.add(Filme("O Homem das Trevas 2", "Terror", "1h38mim", "https://cinemacomrapadura.com.br/imagens/2020/10/20201021-o-homem-nas-trevas-2.jpg"))
        listFilmes.add(Filme("O Esquadrao Suicida", "Ação", "2h", "https://observatoriodocinema.uol.com.br/wp-content/uploads/2021/07/o-esquadrao-suicida-1200x900-2.jpg"))


        val adapter = FilmeAdapter(listFilmes)
        rv_list_films.adapter = adapter

        rv_list_films.layoutManager = LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL, false)
    }
}