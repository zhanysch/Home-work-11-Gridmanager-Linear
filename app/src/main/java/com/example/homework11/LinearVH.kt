package com.example.homework11

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_grid.view.*
import kotlinx.android.synthetic.main.item_linear.view.*

class LinearVH(private val list: ArrayList<dataclass2> ):RecyclerView.Adapter<LinearVH.LinViWhold>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LinViWhold {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_linear,parent, false)
        return  LinViWhold(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: LinViWhold, position: Int) {

        val item = list[position]
        holder.bind(item)
    }


    class LinViWhold(view: View):RecyclerView.ViewHolder(view){
        fun bind(item: dataclass2) {
           itemView.textlin.text=item.tvtext
            itemView.imag2.setBackgroundResource(item.image2)
        }
    }
}

