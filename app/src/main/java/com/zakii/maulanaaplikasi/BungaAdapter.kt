package com.zakii.maulanaaplikasi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BungaAdapter(private val context: Context, private val bunga:List<Bunga>, val listener:(Bunga) -> Unit)
    :RecyclerView.Adapter<BungaAdapter.BungaViewHolder>(){

    fun bindView(bunga: Bunga, listener: (Bunga) -> Unit) {


    }

    class BungaViewHolder(view: View):RecyclerView.ViewHolder(view) {

        val imgBunga = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameBunga = view.findViewById<TextView>(R.id.tv_item_name)
        val descBunga = view.findViewById<TextView>(R.id.tv_item_description)
        fun bindView(bunga: Bunga, listener: (Bunga) -> Unit) {

            imgBunga.setImageResource(bunga.imgBunga)
            nameBunga.text = bunga.nameBunga
            descBunga.text = bunga.descBunga
            itemView.setOnClickListener{
                listener(bunga)
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BungaViewHolder {
        return BungaViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_bunga, parent, false)
        )
    }

    override fun onBindViewHolder(holder: BungaViewHolder, position: Int) {
        holder.bindView(bunga[position], listener)
    }

    override fun getItemCount(): Int = bunga.size
    }

