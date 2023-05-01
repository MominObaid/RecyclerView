package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ItemList2Binding

class MainAdapter(
    private val list: List<MainActivity.itemListt>,
    private val listener: (Int) -> Unit
) : RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    class MainViewHolder(var binding: ItemList2Binding, private val listener: (Int) -> Unit) :
        RecyclerView.ViewHolder(binding.root) {
            fun SettingData(model: MainActivity.itemListt){
                binding.txtName.text = model.Name
                binding.Message.text = model.Detail
                binding.checkBOX.isChecked = model.checked
                binding.root.setOnClickListener{
                    listener.invoke(position)
                }
            }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemList2Binding.inflate(inflater, parent,false)
        return MainViewHolder(binding, listener)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.SettingData(list.get(position))
    }

    override fun getItemCount(): Int {
        return list.size
    }

}