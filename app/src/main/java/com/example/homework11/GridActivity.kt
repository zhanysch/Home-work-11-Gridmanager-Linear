package com.example.homework11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class GridActivity : AppCompatActivity() {

    private  var Gridrecycl: RecyclerView? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid)

        Gridrecycl=findViewById(R.id.Gridrecycl)
        gridAdapter()
    }

 private fun gridAdapter(){
     val adapterGrD = GridAdapter(getData())
     Gridrecycl?.layoutManager=GridLayoutManager(applicationContext, 3)
     Gridrecycl?.adapter=adapterGrD
     }


}
private fun getData(): ArrayList<cusstomDataClass>{
    val data = arrayListOf<cusstomDataClass>()
    for (i in 1..1000){
        data.add(cusstomDataClass(i, "data $i"))
    }
    return data
}