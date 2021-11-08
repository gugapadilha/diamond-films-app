package com.example.telalogin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.telalogin.list.Filme
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_filmes.view.*

class FilmeAdapter(
    var filmes: List<Filme>
): RecyclerView.Adapter<FilmeAdapter.ViewHolder>() {

    lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmeAdapter.ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_filmes, parent, false)
        context = parent.context
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: FilmeAdapter.ViewHolder, position: Int) {

        val films = filmes[position]

        holder.name.text = films.nome
        holder.genero.text = films.genero
        holder.tempo.text = films.tempoDeFilme

        //photo picasso
        Picasso.with(context).load(films.foto).into(holder.foto)

    }

    override fun getItemCount() = filmes.size

        class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

            val name = itemView.tv_nameFilm
            val foto = itemView.iv_photo
            val genero = itemView.tv_genderFilm
            val tempo = itemView.tv_timeFilm

        }
}

