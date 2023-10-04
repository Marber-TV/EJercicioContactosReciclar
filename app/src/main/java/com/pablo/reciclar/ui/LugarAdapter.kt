package com.pablo.reciclar.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.pablo.reciclar.R
import com.pablo.reciclar.databinding.LugarViewBinding
import com.pablo.reciclar.model.Lugar

class LugarAdapter(val lugares: List<Lugar>): RecyclerView.Adapter<LugarAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.lugar_view, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
       return lugares.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(lugares[position])
    }



    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val binding= LugarViewBinding.bind(view)
        fun bind(lugar: Lugar){
            binding.nombre.text=lugar.nombre
            Glide.with(binding.url).load(lugar.urlImagen).into(binding.url)
        }
    }

}