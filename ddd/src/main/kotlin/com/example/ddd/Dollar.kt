package com.example.ddd

class Dollar(
    amount: Int
) : Money(amount = amount) {

    override fun times(multiplier: Int): Money {
        return Dollar(amount * multiplier)
    }
}
