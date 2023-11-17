package com.ersubhadip.unittestingdemo.utils

class Helper {
    fun isPalindrome(input:String):Boolean{
        var startIndex = 0
        var endIndex = input.length-1
        while (startIndex<endIndex){
            if(input[startIndex] != input[endIndex]){
                return false
            }
            startIndex++
            endIndex--
        }
        return true
    }
}