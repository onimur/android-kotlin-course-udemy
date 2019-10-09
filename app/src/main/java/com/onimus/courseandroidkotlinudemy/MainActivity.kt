package com.onimus.courseandroidkotlinudemy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View) {
        if (v.id == R.id.btnCalculate){
            handleCalculate()
        }
    }

    private fun handleCalculate() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //var etDistance = findViewById<EditText>(R.id.etDistance)
        //etDistance

        btnCalculate.setOnClickListener(this)
    }
}
