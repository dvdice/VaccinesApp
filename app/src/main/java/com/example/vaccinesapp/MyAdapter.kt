package com.example.vaccinesapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val vaccinesList: ArrayList<VaccineModel>): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item_layout, parent, false)
        return MyViewHolder(v)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.vaccineTitle.text = vaccinesList[position].name
        holder.vaccineImage.setImageResource(vaccinesList[position].img)
    }

    override fun getItemCount(): Int {
        return vaccinesList.size
    }

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var vaccineImage: ImageView
        var vaccineTitle: TextView

        init{
            vaccineImage = itemView.findViewById(R.id.imageView)
            vaccineTitle = itemView.findViewById(R.id.text1)

            itemView.setOnClickListener {
                Toast.makeText(itemView.context, "You chose: ${vaccinesList[position].name}", Toast.LENGTH_SHORT).show()
            }
        }
    }

}