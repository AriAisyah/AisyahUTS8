package com.aisyah.aisyahuts8

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class Adapter(private val list: ArrayList<Model>) :
    RecyclerView.Adapter<Adapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.listitem, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val data = list[position]
        holder.tvname.text = data.name
        Glide.with(holder.itemView.context).load(data.photo).into(holder.imgphoto)

        holder.imgphoto.setOnClickListener {
            var intent = Intent(holder.itemView.context, DetailActivity::class.java)
            intent.putExtra("name", data.name)
            intent.putExtra("photo", data.photo)
            intent.putExtra("detail", data.detail)
            holder.itemView.context.startActivity(intent)
            Toast.makeText(holder.itemView.context, "ini toast", Toast.LENGTH_SHORT).show()
        }
    }

    class ListViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var tvname: TextView = view.findViewById(R.id.txt_item)
        val imgphoto: ImageView = view.findViewById(R.id.img_item)
    }

}