package com.ersubhadip.unittestingdemo.utils

import org.junit.Assert.assertEquals
import org.junit.Test

class HelperTest {

    @Test
    fun isPalindrome() {
        val helper = Helper() //arrange

        val result = helper.isPalindrome("hello") //Act

        assertEquals(false, result) //Assert
    }
}