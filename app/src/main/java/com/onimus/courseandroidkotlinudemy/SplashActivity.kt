package com.onimus.courseandroidkotlinudemy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.onimus.courseandroidkotlinudemy.motivation.util.Constants.KEY.SHARED_MOTIVATION
import com.onimus.courseandroidkotlinudemy.motivation.util.SecurityPreferences
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var mSecurity: SecurityPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        mSecurity = SecurityPreferences(this)

        btnSave.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.btnSave) {
            handleSave()
        }
    }

    private fun handleSave() {
        val name = etName.text.toString()
        mSecurity.storeString(SHARED_MOTIVATION ,name)
    }
}
