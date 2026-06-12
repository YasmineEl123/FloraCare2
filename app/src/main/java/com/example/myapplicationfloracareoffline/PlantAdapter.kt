package com.example.myapplicationfloracareoffline

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PlantAdapter (
    private val plantList: List<String>
) : RecyclerView.Adapter<PlantAdapter.PlantViewHolder>() {

    class PlantViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtPlantName: TextView = itemView.findViewById(R.id.txtPlantName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlantViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_plant, parent, false)

        return PlantViewHolder(view)
    }

    override fun onBindViewHolder(holder: PlantViewHolder, position: Int) {

        holder.txtPlantName.text = plantList[position]

    }

    override fun getItemCount(): Int {

        return plantList.size

    }
}