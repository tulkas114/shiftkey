package com.shiftkey.codingchallenge.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.shiftkey.codingchallenge.databinding.ListItemBinding
import com.shiftkey.codingchallenge.model.ShiftItem

class RecyclerViewAdapter(private val itemsList: MutableList<ShiftItem>) :
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ListItemBinding.inflate(
            LayoutInflater.from(parent.context)
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(itemsList.get(position))
    }

    override fun getItemCount(): Int {
        return itemsList.size
    }

    fun addItem(item: ShiftItem) {
        itemsList.add(item)
        notifyItemInserted(itemsList.size - 1)
    }

    fun addALL(list: List<ShiftItem>) {
        list.forEach {
            addItem(it)
        }
    }

    inner class ViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: ShiftItem) {
            with(item) {
                binding.shiftStart.text = shiftStart
                binding.shiftEnd.text = shiftEnd
                binding.facilityType.text = facility
                binding.speciality.text = speciality
            }
        }
    }
}

