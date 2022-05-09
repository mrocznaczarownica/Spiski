package com.example.spiski.recadapters

import android.content.Context
import android.provider.DocumentsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.spiski.R

class FeelRecycler(val list: ArrayList<feel>): RecyclerView.Adapter<FeelRecycler.MyVH>() {
    class MyVH(itemView: View):RecyclerView.ViewHolder(itemView) {
        val image:ImageView = itemView.findViewById(R.id.imageView)
        val textView:TextView = itemView.findViewById(R.id.textView)
        val text2:TextView = itemView.findViewById(R.id.textView2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeelRecycler.MyVH {
        val root = LayoutInflater.from(parent.context).inflate(R.layout.feel_adapter, parent, false)
        return MyVH(root)
    }

    override fun onBindViewHolder(holder: FeelRecycler.MyVH, position: Int) {
        holder.image.setImageResource(list[position].image)
        holder.textView.setText(list[position].name_feel)
        holder.text2.setText(list[position].name2)
    }

    override fun getItemCount(): Int {
        return  list.size
    }
}