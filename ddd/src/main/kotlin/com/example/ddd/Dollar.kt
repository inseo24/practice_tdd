package com.example.ddd

class Dollar(
    amount: Int
) : Money(amount = amount) {

    fun times(multiplier: Int): Dollar {
        return Dollar(amount * multiplier)
    }
}
