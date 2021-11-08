package com.example.telalogin.list

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.telalogin.FilmeAdapter
import com.example.telalogin.R
import kotlinx.android.synthetic.main.activity_films.*

class FilmsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_films)
    }

    override fun onResume() {
        super.onResume()

        val listFilmes = mutableListOf<Filme>()

        listFilmes.add(Filme("Velozes e Furiosos 9 ", "Ação", "2h30mim", "https://naoseinada.com.br/wp-content/uploads/2020/02/Velozes-e-Furiosos-9.jpg"))
        listFilmes.add(Filme("Halloween: O terror continua", "Terror", "1h46mim", "https://img.olhardigital.com.br/wp-content/uploads/2021/06/halloween-kills-imagem-promocional-universal-imdb.jpg"))
        listFilmes.add(Filme("Caça Invísivel", "Suspense", "1h27mim", "https://image.tmdb.org/t/p/original/xUDueUc2zUWvPBv5dPLc5nPYJxe.jpg"))
        listFilmes.add(Filme("O Homem das Trevas 2", "Terror", "1h38mim", "https://cinemacomrapadura.com.br/imagens/2020/10/20201021-o-homem-nas-trevas-2.jpg"))
        listFilmes.add(Filme("O Esquadrao Suicida", "Ação", "2h", "https://uploads.jovemnerd.com.br/wp-content/uploads/2021/08/o-esquadrao-suicida-cenas-pos-creditos.jpg"))


        val adapter = FilmeAdapter(listFilmes)
        rv_list_films.adapter = adapter

        rv_list_films.layoutManager = LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL, false)
    }
}