package com.example.homework11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.Button
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    private var Go: Button?=null
    private var spinner: Spinner? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinner=findViewById(R.id.spinner)
        Go = findViewById(R.id.Go)
        SetupAdaperts()
    }


    private fun SetupAdaperts(){
      val adapter2r=spinnerAdapter(applicationContext,R.id.tvtext, Turdata())

        spinner?.adapter=adapter2r
    }



    private fun Turdata(): ArrayList<cusstomDataClass> {
        val data = arrayListOf<cusstomDataClass>()

        data.add(cusstomDataClass())
        data.add(cusstomDataClass("Grid"))
        data.add(cusstomDataClass("Linear"))
        return data
    }

    private fun Listener() {
        spinner?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                when (position) {
                    1 -> startActivity(Intent(this@MainActivity, Grid::class.java))
                     2 -> startActivity(Intent(this@MainActivity,Linear::class.java))
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }
    }



}
