package com.example.homework11

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class GridAdapter(val list: ArrayList<cusstomDataClass>): RecyclerView.Adapter<GridViewHol>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHol {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_grid,parent, false)
        return  GridViewHol(view)
    }

    override fun getItemCount(): Int {
        return list.size

    }

    override fun onBindViewHolder(holder: GridViewHol, position: Int) {

    }

}


    class GridViewHol(view:View):RecyclerView.ViewHolder(view){

    }