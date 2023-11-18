package com.ersubhadip.unittestingdemo

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import org.junit.Test
import java.io.FileNotFoundException


class QuoteManagerTest {

    @Test(expected = FileNotFoundException::class)
    fun populateQuotesFromJson() {
        //here is the method of getting context in text modules
        val context = ApplicationProvider.getApplicationContext<Context>()

        //arrange
        val quoteManager = QuoteManager()

        //act
        quoteManager.populateQuotesFromJson(context, "")
    }
}