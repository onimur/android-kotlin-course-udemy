package com.onimus.courseandroidkotlinudemy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //var etDistance = findViewById<EditText>(R.id.etDistance)
        //etDistance

        btnCalculate.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.btnCalculate) {
            handleCalculate()
        }
    }

    private fun handleCalculate() {
        if (isValid()) {
            try {

            } catch (e: NumberFormatException) {
                Toast.makeText(this, getString(R.string.toast_valid_values), Toast.LENGTH_SHORT)
                    .show()
            }
        } else {
            Toast.makeText(this, getString(R.string.toast_valid_values), Toast.LENGTH_SHORT).show()
        }
    }

    private fun isValid(): Boolean {
        return etDistance.text.toString().isNotBlank()
                && etPrice.text.toString().isNotBlank()
                && etAutonomy.text.toString().isNotBlank()
                && etAutonomy.text.toString() != "0"
    }


}
