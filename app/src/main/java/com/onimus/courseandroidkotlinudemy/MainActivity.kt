package com.onimus.courseandroidkotlinudemy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.onimus.courseandroidkotlinudemy.motivation.MotivationActivity
import com.onimus.courseandroidkotlinudemy.motivation.SplashActivity
import com.onimus.courseandroidkotlinudemy.mytrip.MyTripActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var i: Intent
    override fun onClick(v: View) {
        if (v.id == R.id.btnMyTrip) {
            i = Intent(this, MyTripActivity::class.java)

        } else if (v.id == R.id.btnMotivation) {
            i = Intent(this, SplashActivity::class.java)
        }
        startActivity(i)
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMyTrip.setOnClickListener(this)
        btnMotivation.setOnClickListener(this)
    }
}
