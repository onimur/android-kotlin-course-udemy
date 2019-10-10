package com.onimus.courseandroidkotlinudemy.motivation.mock

import android.content.Context
import com.onimus.courseandroidkotlinudemy.R
import com.onimus.courseandroidkotlinudemy.motivation.util.Constants.PHRASES
import java.util.*

class Phrase(val description: String, val category: Int)

fun Int.mRandom(): Int = Random().nextInt(this)

class Mock(private val context: Context) {

    private var mListPhrases = mutableListOf<Phrase>()

    fun getPhrases(value: Int): String {
        val listHappy = getArrayList(R.array.phrasesArrayHappy)
        val listSun = getArrayList(R.array.phrasesArraySun)

        listHappy.forEach { s -> mListPhrases.add(Phrase(s, PHRASES.HAPPY)) }
        listSun.forEach { s -> mListPhrases.add(Phrase(s, PHRASES.SUN)) }

        val filtered = mListPhrases.filter { it.category == value || value == PHRASES.ALL }

        val random = filtered.size.mRandom()

        return filtered[random].description
    }

    private fun getArrayList(id: Int): Array<String> {
        return context.resources.getStringArray(id)
    }
}