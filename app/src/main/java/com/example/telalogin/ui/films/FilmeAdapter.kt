package com.example.telalogin.ui.films

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.telalogin.R
import com.example.telalogin.domain.model.FilmsResponse
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_filmes.view.*

class FilmeAdapter(var context: Context): RecyclerView.Adapter<FilmeAdapter.ViewHolder>() {


    var filmes = mutableListOf<FilmsResponse>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //inflando o layout item_filmes

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_filmes, parent, false)
        context = parent.context
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //tendo o viewHolder inflado, podemos bindar o viewHolder

        val films = filmes[position]

        holder.name.text = films.name
        holder.genero.text = films.genero
        holder.duracao.text = films.duracao

        Picasso.with(context).load(films.imageUrl).into(holder.foto)
    }

    override fun getItemCount() = filmes.size
        //passa o tamanho da lista que vai ser usado
        class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

            val name = itemView.tv_nameFilm
            val foto = itemView.iv_photo
            val genero = itemView.tv_genero_film
            val duracao = itemView.tv_tempo
        }

    fun add(list: List<FilmsResponse>) {
        list.map {
            filmes.add(it)
        }
    }
}

