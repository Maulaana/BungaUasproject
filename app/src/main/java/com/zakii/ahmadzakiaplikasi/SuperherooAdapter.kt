package com.zakii.ahmadzakiaplikasi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SuperherooAdapter(private val context: Context,private val superheroo:List<Superhero>, val listener:(Superhero) -> Unit)
    :RecyclerView.Adapter<SuperherooAdapter.SuperheroViewHolder>(){

    fun bindView(superheroo: Superhero, listener: (Superhero) -> Unit) {


    }

    class SuperheroViewHolder(view: View):RecyclerView.ViewHolder(view) {

        val imgSuperhero = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameSuperhero = view.findViewById<TextView>(R.id.tv_item_name)
        val descSuperhero = view.findViewById<TextView>(R.id.tv_item_description)
        fun bindView(superheroo: Superhero, listener: (Superhero) -> Unit) {

            imgSuperhero.setImageResource(superheroo.imgSuperhero)
            nameSuperhero.text = superheroo.nameSuperhero
            descSuperhero.text = superheroo.descSuperhero
            itemView.setOnClickListener{
                listener(superheroo)
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroViewHolder {
        return SuperheroViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_superheroo, parent, false)
        )
    }

    override fun onBindViewHolder(holder: SuperheroViewHolder, position: Int) {
        holder.bindView(superheroo[position], listener)
    }

    override fun getItemCount(): Int = superheroo.size
    }

