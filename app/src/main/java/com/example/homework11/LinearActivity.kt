package com.example.homework11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class LinearActivity : AppCompatActivity() {

    private var Liear: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear)

        Liear = findViewById(R.id.Liear)

        val list = arrayListOf<dataclass2>()
        for (i in 2..300){
            list.add(dataclass2("1$i" ,R.drawable.image2))
            val adapter=LinearVH(list)
            Liear?.adapter=adapter

        }
    }

}