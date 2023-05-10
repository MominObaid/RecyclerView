package com.example.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_list2.view.*

class MyAdapter (val context: Context, val list: List<String>):
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder{
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_list2, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int){
        holder.textName.text = list[position]
        holder.imgView.text = list[position]
    }

    override fun getItemCount(): Int{
        return list.size
    }

    class MyViewHolder(view: View) {
        val textName = view.txtName
        val imgView = view.Message
    }
}