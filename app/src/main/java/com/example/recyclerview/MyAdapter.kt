package com.example.recyclerview

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_list2.view.*

class MyAdapter(val list: List<MainActivity.itemListt>):
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder{
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_list2, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int){
        holder.textName.text = list[position].Name
        holder.textMessage.text = list[position].Detail
        holder.imageView.imageView2


       var color = "#FFFFFF"
       if (position % 2 == 0) { color = "#CCCCCC"}
           holder.LayoutColor.setBackgroundColor(Color.parseColor(color))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val textName = itemView.txtName
        val textMessage = itemView.Message
        val imageView = itemView.imageView2
       val LayoutColor = itemView.LayoutId
    }
}
