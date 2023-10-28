package com.example.hometask_3_recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hometask_3_recyclerview.databinding.ItemElementBinding

class MainAdapter(private val items : MutableList<String>) : RecyclerView.Adapter<MainAdapter.CountryHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryHolder {
       return CountryHolder(ItemElementBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: CountryHolder, position: Int) {
        holder.bind(items[position])
    }

    class CountryHolder(private val binding : ItemElementBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(item : String){
            binding.txtViewElement.text = item
        }
    }
}