package com.ersubhadip.unittestingdemo.utils

import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class HelperTest {

    @Before
    fun init(){
        //this @Before make sure this runs before all the test cases
        println("Testing Started!")
    }

    @Test
    fun isPalindrome() {
        val helper = Helper() //arrange

        val result = helper.isPalindrome("hello") //Act

        assertEquals(false, result) //Assert
    }

    @After
    fun end(){
        //this @After make sure this runs after all the test cases
        println("Testing End!")
    }
}