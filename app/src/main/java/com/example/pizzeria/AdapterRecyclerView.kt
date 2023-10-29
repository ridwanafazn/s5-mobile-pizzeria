package com.example.pizzeria

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterRecyclerView(private val foodList: List<MenuCardView>) : RecyclerView.Adapter<AdapterRecyclerView.ViewHolder>() {
    class ViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView) {
        val foodImage: ImageView = itemView.findViewById(R.id.menuImage)
        val foodName: TextView = itemView.findViewById(R.id.foodName)
        val foodDescription: TextView = itemView.findViewById(R.id.foodDesc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterRecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cardview_menu, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val MenuCardView = foodList[position]

        holder.foodImage.setImageResource(MenuCardView.image)
        holder.foodName.text = MenuCardView.name
        holder.foodDescription.text = MenuCardView.desc
    }

    override fun getItemCount(): Int {
        return foodList.size
    }
}