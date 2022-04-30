package com.example.ddd

class Franc(
    amount: Int
) : Money(amount = amount) {

    override fun times(multiplier: Int): Money {
        return Franc(amount * multiplier)
    }
}
