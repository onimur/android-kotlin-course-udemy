package com.onimus.courseandroidkotlinudemy.components

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.onimus.courseandroidkotlinudemy.MainActivity
import com.onimus.courseandroidkotlinudemy.R
import kotlinx.android.synthetic.main.activity_components.*

class ComponentsActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_components)

        setListeners()
    }

    override fun onClick(v: View) {
        if (v.id == R.id.btnToastMe) {
            Toast.makeText(this, "Toast Notification!", Toast.LENGTH_LONG).show()
        }
    }

    override fun onBackPressed() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
        super.onBackPressed()
    }

    private fun setListeners() {
        btnToastMe.setOnClickListener(this)
    }
}
