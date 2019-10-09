package com.onimus.courseandroidkotlinudemy.motivation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.onimus.courseandroidkotlinudemy.MainActivity
import com.onimus.courseandroidkotlinudemy.R

class MotivationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motivation)
    }

    override fun onBackPressed() {
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
        finish()
        super.onBackPressed()

    }
}
