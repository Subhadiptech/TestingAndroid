package com.ersubhadip.unittestingdemo

import android.content.Context
import com.ersubhadip.unittestingdemo.data.pojos.QuoteModel
import com.google.gson.Gson

class QuoteManager {
    var quoteList = emptyArray<QuoteModel>()
    var currentIndex = 0

    fun populateQuotesFromJson(context: Context, fileName: String) {
        val inputStream = context.assets.open(fileName)
        val size = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer, Charsets.UTF_8)
        val gson = Gson()
        quoteList = gson.fromJson(json, Array<QuoteModel>::class.java)
    }

    fun populateQuotesFromRemote(quotes: Array<QuoteModel>) {
        quoteList = quotes
    }

    fun getCurrentQuote(): QuoteModel = quoteList[currentIndex]

    fun nextQuote(): QuoteModel {
        if (currentIndex == quoteList.size - 1) return quoteList[currentIndex]

        return quoteList[++currentIndex]
    }

    fun previousQuote(): QuoteModel {
        if (currentIndex == 0) return quoteList[currentIndex]

        return quoteList[--currentIndex]
    }
}