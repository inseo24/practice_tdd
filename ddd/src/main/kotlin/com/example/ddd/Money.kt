package com.example.ddd

open class Money(
    protected var amount: Int,
    private var currency: String,
) {
    fun currency(): String {
        return currency
    }

    fun times(multiplier: Int): Money {
        return Money(amount * multiplier, currency)
    }

    override fun toString(): String {
        return "$amount $currency"
    }

    override fun equals(other: Any?): Boolean {
        other as Money
        return amount == other.amount && currency() == other.currency()
    }

    companion object {
        fun dollar(amount: Int): Dollar = Dollar(amount, "USD")
        fun franc(amount: Int): Franc = Franc(amount, "CHF")
    }
}