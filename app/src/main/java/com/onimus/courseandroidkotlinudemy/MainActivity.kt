package com.onimus.courseandroidkotlinudemy

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.onimus.courseandroidkotlinudemy.motivation.SplashActivity
import com.onimus.courseandroidkotlinudemy.motivation.util.Constants
import com.onimus.courseandroidkotlinudemy.mytrip.MyTripActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var i: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMyTrip.setOnClickListener(this)
        btnMotivation.setOnClickListener(this)
        btnNewUser.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when {
            v.id == R.id.btnMyTrip -> i = Intent(this, MyTripActivity::class.java)
            v.id == R.id.btnMotivation -> i = Intent(this, SplashActivity::class.java)
            v.id == R.id.btnNewUser -> {
                val mSharedPreferences =
                    getSharedPreferences(Constants.KEY.SHARED_MOTIVATION, Context.MODE_PRIVATE)
                mSharedPreferences.edit().remove(Constants.KEY.SHARED_MOTIVATION).apply()
                i = Intent(this, SplashActivity::class.java)
            }
        }
        startActivity(i)
        finish()
    }
}
