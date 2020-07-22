package com.example.homework11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Button
import android.widget.Spinner

class MainActivity : AppCompatActivity() {

    private var go: Button? = null
    private var spinner: Spinner? = null
    private var currentPosition: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinner = findViewById(R.id.spinner)
        go = findViewById(R.id.Go)
        setupAdaperts()
        setButtonListener()
        setSpinnerListener()
    }


    private fun setupAdaperts() {
        val adapter2r = spinnerAdapter(applicationContext, R.id.tvtext, Turdata())
        spinner?.adapter = adapter2r
    }


    private fun Turdata(): ArrayList<cusstomDataClass> {
        val data = arrayListOf<cusstomDataClass>()

        data.add(cusstomDataClass(1, "выбери RecylerView" ))
        data.add(cusstomDataClass(2, "Grid"))
        data.add(cusstomDataClass(3, "Linear"))
        return data
    }


    private fun setSpinnerListener() {
        spinner?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
            override fun onItemSelected(
                parent: AdapterView<*>?, view: View?, position: Int, id: Long
            )
                {
                currentPosition = position
               }
        }
    }

    private fun setButtonListener() {
        go?.setOnClickListener { startActivity() }
    }

    private fun startActivity() {
        when (currentPosition) {
            1 -> startActivity(Intent(this, GridActivity::class.java))
            2 -> startActivity(Intent(this,LinearActivity::class.java))

        }

    }

}