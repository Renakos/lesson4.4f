package com.example.lesson44f


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson44f.databinding.ItemBinding


class Adapter : RecyclerView.Adapter<Adapter.ViewHolder>() {

    private var data: List<ItemModel> = listOf()

    inner class ViewHolder(private val binding: ItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(item: ItemModel) {
            adapterPosition
            binding.itemName.text = item.name
            binding.itemDescription.text = item.description
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

    fun setData(newData: List<ItemModel>) {
        data = newData
        notifyDataSetChanged()
    }
}