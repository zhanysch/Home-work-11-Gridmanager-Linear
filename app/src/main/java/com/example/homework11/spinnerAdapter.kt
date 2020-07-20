package com.example.homework11

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class spinnerAdapter(context: Context, resource: Int, private val objects: List<cusstomDataClass>):
    ArrayAdapter<cusstomDataClass>(context, resource, objects){

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = LayoutInflater.from(context).inflate(R.layout.item_spinner,parent,false)
        val tvtext = view.findViewById<TextView>(R.id.tvtext)
        tvtext.text=(objects[position].ttext)

        return view
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {

        val view = LayoutInflater.from(context).inflate(R.layout.item_spinner,parent,false)
        val tvtext = view.findViewById<TextView>(R.id.tvtext)
        tvtext.text=(objects[position].ttext)

        return  view
    }
}


