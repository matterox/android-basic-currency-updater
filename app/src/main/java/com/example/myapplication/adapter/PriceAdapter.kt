package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.PriceModel
import com.example.myapplication.R

class PriceAdapter: RecyclerView.Adapter<PriceAdapter.PriceViewHolder>() {
    var items: List<PriceModel> = listOf()
        set(value) {
            field = value
        notifyDataSetChanged()
        }

    class PriceViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bind(model: PriceModel) {
            itemView.findViewById<TextView>(R.id.tvPrice).text = "${model.currentPrice} USD"
            itemView.findViewById<TextView>(R.id.tvLastUpdated).text = model.timeStamp
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PriceViewHolder {
        val view: View = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_price, parent, false);
        return PriceViewHolder(view);
    }

    override fun onBindViewHolder(holder: PriceViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount() = items.count()
}