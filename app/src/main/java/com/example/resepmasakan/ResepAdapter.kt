package com.example.resepmasakan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ResepAdapter(private val listResep: ArrayList<Resep>): RecyclerView.Adapter<ResepAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(parent:ViewGroup,viewType:Int):ResepAdapter.MyViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.layout_daftar_resep, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder:ResepAdapter.MyViewHolder,position:Int){
        val resep = listResep[position]
        Glide.with(holder.itemView.context)
            .load(resep.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = resep.nama
        holder.tvDetail.text = resep.detail
    }

    override fun getItemCount(): Int {
        return listResep.size
    }

}