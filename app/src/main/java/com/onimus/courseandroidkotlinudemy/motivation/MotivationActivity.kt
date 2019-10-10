package com.onimus.courseandroidkotlinudemy.motivation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.onimus.courseandroidkotlinudemy.MainActivity
import com.onimus.courseandroidkotlinudemy.R
import com.onimus.courseandroidkotlinudemy.motivation.util.Constants
import kotlinx.android.synthetic.main.activity_motivation.*
import kotlinx.android.synthetic.main.activity_splash.*

class MotivationActivity : AppCompatActivity(), View.OnClickListener {

    private var mFilter = Constants.PHRASES.ALL

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motivation)

        setListeners()

        handleFilter(R.id.ivAll)
    }

    override fun onBackPressed() {
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
        finish()
        super.onBackPressed()
    }

    override fun onClick(v: View) {
        val listId = listOf(R.id.ivAll, R.id.ivHappy, R.id.ivSun)
        if (v.id in listId) {
            handleFilter(v.id)
        } else {
            refreshPhrase()
        }
    }

    private fun setListeners() {
        ivAll.setOnClickListener(this)
        ivSun.setOnClickListener(this)
        ivHappy.setOnClickListener(this)
        btnNewPhrase.setOnClickListener(this)
    }

    private fun handleFilter(id: Int) {

        ivAll.setImageResource(R.drawable.ic_all_unselected)
        ivSun.setImageResource(R.drawable.ic_sun_unselected)
        ivHappy.setImageResource(R.drawable.ic_happy_unselected)

        when (id) {
            R.id.ivAll -> {
                mFilter = Constants.PHRASES.ALL
                ivAll.setImageResource(R.drawable.ic_all_selected)
            }
            R.id.ivSun -> {
                mFilter = Constants.PHRASES.SUN
                ivSun.setImageResource(R.drawable.ic_sun_selected)
            }
            else -> {
                mFilter = Constants.PHRASES.HAPPY
                ivHappy.setImageResource(R.drawable.ic_happy_selected)
            }
        }
    }

    private fun refreshPhrase() {

    }
}
