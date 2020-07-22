package com.example.homework11

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_grid.view.*

class GridAdapter(val list: ArrayList<cusstomDataClass>): RecyclerView.Adapter<GridAdapter.GridViWhold>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViWhold {
     val view = LayoutInflater.from(parent.context).inflate(R.layout.item_grid,parent,false)
    return GridViWhold(view)
    }


    override fun getItemCount(): Int {
      return  list.size
    }

    override fun onBindViewHolder(holder: GridViWhold, position: Int) {
        holder.bind(list[position])

    }





    class GridViWhold(view: View):RecyclerView.ViewHolder(view){
        fun bind(cusstomDataClass: cusstomDataClass) {

           itemView.textgrid.text=cusstomDataClass.ttext

        }
    }
}