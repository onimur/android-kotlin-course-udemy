package com.onimus.courseandroidkotlinudemy.motivation.mock

import android.content.Context
import com.onimus.courseandroidkotlinudemy.R
import com.onimus.courseandroidkotlinudemy.motivation.util.Constants
import com.onimus.courseandroidkotlinudemy.motivation.util.Constants.PHRASES

class Phrase(val description: String, val category: Int) {

}

class Mock(val context: Context) {

    private var mListPhrases = mutableListOf<Phrase>()

    fun getPhrases(): Phrase {
        val listHappy = getArrayList(R.array.phrasesArrayHappy)
        val listSun = getArrayList(R.array.phrasesArraySun)

        listHappy.forEach { s -> mListPhrases.add(Phrase(s, PHRASES.HAPPY)) }
        listSun.forEach { s -> mListPhrases.add(Phrase(s, PHRASES.SUN)) }

        return Phrase("", 1)
    }

    private fun getArrayList(id: Int): Array<String> {
        return context.resources.getStringArray(id)

    }
}