package com.example.ddd

open class Money(
    protected var amount: Int,
    private var currency: String,
): Expression {
    fun currency(): String {
        return currency
    }

    fun times(multiplier: Int): Money {
        return Money(amount * multiplier, currency)
    }

    fun plus(addend: Money): Expression {
        return Money(amount + addend.amount, currency)
    }

    override fun toString(): String {
        return "$amount $currency"
    }

    override fun equals(other: Any?): Boolean {
        other as Money
        return amount == other.amount && currency() == other.currency()
    }

    companion object {
        fun dollar(amount: Int): Money = Money(amount, "USD")
        fun franc(amount: Int): Money = Money(amount, "CHF")
    }
}