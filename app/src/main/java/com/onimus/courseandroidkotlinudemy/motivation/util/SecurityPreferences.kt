package com.onimus.courseandroidkotlinudemy.motivation.util

import android.content.Context
import android.content.SharedPreferences
import com.onimus.courseandroidkotlinudemy.motivation.util.Constants.KEY.SHARED_MOTIVATION

class SecurityPreferences(context: Context) {

    private val sharedPreferences: SharedPreferences =
        context.getSharedPreferences(SHARED_MOTIVATION, Context.MODE_PRIVATE)

    fun storeString(key: String, value: String) {
        sharedPreferences.edit().putString(key, value).apply()
    }

    fun getStoredString(key: String): String {
        return sharedPreferences.getString(key, "") ?: ""
    }
}