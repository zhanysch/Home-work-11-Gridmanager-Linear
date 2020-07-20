package com.example.homework11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AbsListView
import androidx.recyclerview.widget.RecyclerView

class Grid : AppCompatActivity() {

   private var vertical: RecyclerView? =null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid)

        vertical = findViewById(R.id.vertical)
        setupAdapters()
    }
    private fun setupAdapters(){
        val adapterGrid=GridAdapter(getData())
        vertical?.layoutManager=GridLayo
    }



    private fun getData(): ArrayList<cusstomDataClass>{
        val data = arrayListOf<cusstomDataClass>()

        for (i in 1..10000){
            data.add((cusstomDataClass()))
        }
         return data
    }

}