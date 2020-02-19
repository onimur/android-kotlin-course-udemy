package com.onimus.courseandroidkotlinudemy.motivation

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.onimus.courseandroidkotlinudemy.MainActivity
import com.onimus.courseandroidkotlinudemy.R
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
        verifyUserName()
    }

    override fun onClick(v: View) {
        if (v.id == R.id.btnSave) {
            handleSave()
        }
    }

    private fun handleSave() {
        val name = etName.text.toString()

        if (name == "") {
            Toast.makeText(this, getString(R.string.et_enter_name), Toast.LENGTH_SHORT).show()
        } else {
            mSecurity.storeString(SHARED_MOTIVATION, name)

            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            finish()
        }
    }

    private fun verifyUserName() {
        val userName = mSecurity.getStoredString(SHARED_MOTIVATION)
        if (userName.isNotBlank()) {
            startActivity(Intent(this, MotivationActivity::class.java))
            finish()
        }
        etName.setText(userName)
    }

    override fun onBackPressed() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
        super.onBackPressed()
    }
}
