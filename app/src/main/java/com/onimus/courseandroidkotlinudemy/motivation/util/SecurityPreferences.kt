package com.onimus.courseandroidkotlinudemy.motivation.util

import android.content.Context
import android.content.SharedPreferences

object Constants {
    const val SHARED_MOTIVATION = "shared_motivation"

}

class SecurityPreferences(context: Context) {

    private val sharedPreferences: SharedPreferences =
        context.getSharedPreferences(Constants.SHARED_MOTIVATION, Context.MODE_PRIVATE)

    fun storeString(key: String, value: String) {
        sharedPreferences.edit().putString(key, value).apply()
    }

    fun getStoredString(key: String): String? {
        return sharedPreferences.getString(key, "")
    }
}