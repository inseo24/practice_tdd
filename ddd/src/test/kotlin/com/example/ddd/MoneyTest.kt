package com.example.ddd

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MoneyTest {

    @Test
    fun testMultiplication() {
        val five = Dollar(5)
        five.times(2)
        assertEquals(10, five.amount)
    }
}