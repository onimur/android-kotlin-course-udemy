package com.onimus.courseandroidkotlinudemy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.onimus.courseandroidkotlinudemy.motivation.MotivationActivity
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

        if (name == "") {
            Toast.makeText(this, getString(R.string.et_enter_name), Toast.LENGTH_SHORT).show()
        } else {
            mSecurity.storeString(SHARED_MOTIVATION, name)

            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            finish()
        }
    }
}
