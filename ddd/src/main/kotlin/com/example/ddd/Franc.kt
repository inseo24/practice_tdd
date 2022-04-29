package com.example.ddd

class Franc(
    amount: Int
) : Money(amount = amount) {

    fun times(multiplier: Int): Franc {
        return Franc(amount * multiplier)
    }
}
