package com.onimus.courseandroidkotlinudemy.components

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
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
            //val toast =  Toast.makeText(this, "Toast Notification!", Toast.LENGTH_LONG)
            val toast = Toast(this)
            //Layout
            val toastLayout = layoutInflater.inflate(R.layout.toast_custom, null)
            with(toast) {
                view = toastLayout
                val textView = view.findViewById<TextView>(R.id.tvMessage)
                with(textView) {
                    setTextColor(Color.RED)
                    text = ("Toast Notification")
                }
                duration = Toast.LENGTH_LONG
                show()
            }
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
