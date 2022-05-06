package com.example.ddd

class Dollar(
    amount: Int,
    currency: String,
) : Money(amount, currency) {

    override fun currency(): String {
        return currency
    }

    override fun times(multiplier: Int): Money {
        return Dollar(amount * multiplier, currency)
    }
}
