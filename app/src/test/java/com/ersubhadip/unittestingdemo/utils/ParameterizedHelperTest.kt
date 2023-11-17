package com.ersubhadip.unittestingdemo.utils

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters


@RunWith(value = Parameterized::class)
class ParameterizedHelperTest(val input: String, val expectedResult: Boolean) {
    @Test
    fun isPalindrome() {
        val helper = Helper()
        val result = helper.isPalindrome(input)
        assertEquals(expectedResult, result)
    }


    companion object {
        @JvmStatic
        @Parameters(name = "{index}: {0} is Palindrome - {1}")
        fun data(): List<Array<Any>> = listOf(
            arrayOf("hello", false),
            arrayOf("level", true),
            arrayOf("", true),
            arrayOf("nitin", true)
        )
    }
}